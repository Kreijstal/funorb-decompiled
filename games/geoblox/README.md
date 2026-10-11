# Reading the current GeoBlox source

This guide is generated from the current export by Deko’s `build-geoblox-reading-guide.mjs`. It follows the game code; previous pass narratives remain in Git history and the existing [workflow record](README.md).

The Java in [this directory](.) is the only maintained GeoBlox source, published directly in `games/geoblox`. Its 303 top-level classes have meaningful names; 302 are renamed and `Geoblox` keeps its original name. The manifest contains 20,133 guarded names and the dictionary preserves 20,440 complete identities.

## Start with the game loop

| Entry point | What to follow |
| --- | --- |
| [Geoblox.updateGame](Geoblox.java#L615) | Runs the client update; follow the screen selection and active gameplay session. |
| [Geoblox.renderFrame](Geoblox.java#L818) | Draws the current screen, transitions, loading scene and gameplay. |
| [Geoblox.prepareGameAssets](Geoblox.java#L41) | Prepares fonts, sprites, music and interface resources over readiness stages. |
| [GameplaySession.updateSession](GameplaySession.java#L548) | Updates panel animation, progression, tutorial/input handling, entity work and the ending sequence. |
| [GameplaySession.renderSession](GameplaySession.java#L209) | Renders the rotating board, entities, counters, tutorial and result overlays. |

The applet and session share work with static helpers. A semantic class name describes a role; it does not mean that every static helper on that original owner has moved into one subsystem.

## Follow gameplay by task

| Task | Source entry point |
| --- | --- |
| Scene preparation, completion and theme achievements | [GameplaySession.updateSceneTransition](GameplaySession.java#L1240) |
| Select and request the next theme | [GameplaySession.prepareNextTheme](GameplaySession.java#L1757) |
| Advance tutorial phases and steps | [GameplaySession.advanceTutorialStep](GameplaySession.java#L1195) |
| Draw the tutorial prompt and its controls | [GameplaySession.renderTutorialPrompt](GameplaySession.java#L69) |
| Start the ending sequence | [GameplaySession.startSessionEndSequence](GameplaySession.java#L1164) |
| Advance result expansion, countdown and completion | [GameplaySession.updateResultSequence](GameplaySession.java#L1449) |
| Add points and update score-dependent state | [GameplaySession.addScore](GameplaySession.java#L1101) |
| Submit an eligible positive score | [GameplaySession.submitScore](GameplaySession.java#L1606) |
| Process sorted/deduplicated match candidates | [MatchScoringSupport.processMatchCandidates](MatchScoringSupport.java#L39) |
| Test whether entity queues have settled | [EntityContactSupport.areEntityQueuesSettled](EntityContactSupport.java#L29) |
| Link entities through ownership-mask contacts | [EntityContactSupport.linkEntityAtMaskContacts](EntityContactSupport.java#L47) |
| Advance difficulty tables | [PlayfieldRules.advanceDifficulty](PlayfieldRules.java#L103) |

## Read the scene-transition method

1. At animation tick zero it prepares the next theme or resets score, copies the board raster, clears entity/contact queues and redraws the ownership mask.
2. It increments the animation tick. At tick 160, the normal control path of a transition that preserves score searches the seven-entry theme cycle and selects the preceding entry, wrapping index zero to entry six.
3. It retains the original theme dispatch and achievement calls. Logical continuation conditions place each operand on its own line; read them in their written short-circuit order.
4. It clears transition/rebuild flags, resets the animation tick and advances difficulty/release quotas when required.

`precedingThemeLookupFrameContinues` belongs to the preceding-theme lookup. It is initialized true and written false when the matching cycle entry is found. The retained snapshot has no later read in this method; it must not be mistaken for a tutorial decision or removed as part of naming.

## Understand retained reconstruction names

- `methodGuard` and `clientControlFlowGuard` preserve the original numeric arguments and control snapshot. Nonzero paths, wrong-guard behavior and arithmetic have not been assumed away.
- Names ending in `FrameContinues` describe whether original remainder work continues. They are reconstructed control decisions, not additional game states.
- Names such as `themeIndexThenId` identify reused locals whose role changes during a method. They retain every original store and read.
- Mixed-purpose static helpers keep their original owners. Follow a method’s full identity and evidence rather than treating its class as an exclusive module boundary.

## What remains uncertain

| Source family | Verified observation | Limit |
| --- | --- | --- |
| [GameApplet](GameApplet.java) | Six public static fields have no ordinary references in this corpus. | This does not rule out external or reflective access. Their finer purpose is unknown. |
| [VisualPropertyOverrides](VisualPropertyOverrides.java) | Thirty-five private fields are used only by construction and property merging. | Names describe types and merge sentinels, not invented visual roles. |

There are no remaining plain block labels or large framed state-machine methods. Long ordinary methods and 41 finer field purposes still need review. Source/binding/native checks are scoped evidence; original-game equivalence, browser/phone behavior and heap/presented-FPS acceptance remain unverified.

## Reproduce and trace a name

Run from the Deko repository:

```sh
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --check
```

Both commands cover the current Java export and this guide. The [current naming dictionary](../../decompilation/geoblox-naming.json) contains original spellings, full JVM descriptors, declaration ordinals, UTF-16 edit positions and provenance. Reverse it with Deko’s `readable/restore-game.mjs geoblox OUTPUT`; do not append opaque spellings to readable names.

Current raw source: `5655c1ef8a4c572da920e241af2b2daeaadc8b6a`; tree SHA-256: `81eb635934077ec3fc5ff1d8a49e09007405e189d218e6453ae4ab7230a99411`.

Decompiler source: `a029e5af7446a1e1d4190e33b5e3bd35245869b3`. The SHA-256 of its tracked Git tar is `ae472b9a682af8c8f10f569bf2a115e7a5c4c2b377ebc8fa331ea1fe0ec7c428`; this is the decompiler source hash, not a game JAR hash.
