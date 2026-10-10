# Reading the current GeoBlox source

This guide is generated from the current export by Deko’s `build-geoblox-reading-guide.mjs`. It follows the game code; previous pass narratives remain in Git history and the existing [workflow record](README.md).

The only maintained readable tree is [geoblox/src](geoblox/src). Its 303 top-level classes have meaningful names; 302 are renamed and `Geoblox` keeps its original name. The manifest contains 20,133 guarded names and the dictionary preserves 20,440 complete identities.

## Start with the game loop

| Entry point | What to follow |
| --- | --- |
| [Geoblox.updateGame](geoblox/src/Geoblox.java#L615) | Runs the client update; follow the screen selection and active gameplay session. |
| [Geoblox.renderFrame](geoblox/src/Geoblox.java#L818) | Draws the current screen, transitions, loading scene and gameplay. |
| [Geoblox.prepareGameAssets](geoblox/src/Geoblox.java#L41) | Prepares fonts, sprites, music and interface resources over readiness stages. |
| [GameplaySession.updateSession](geoblox/src/GameplaySession.java#L548) | Updates panel animation, progression, tutorial/input handling, entity work and the ending sequence. |
| [GameplaySession.renderSession](geoblox/src/GameplaySession.java#L209) | Renders the rotating board, entities, counters, tutorial and result overlays. |

The applet and session share work with static helpers. A semantic class name describes a role; it does not mean that every static helper on that original owner has moved into one subsystem.

## Follow gameplay by task

| Task | Source entry point |
| --- | --- |
| Scene preparation, completion and theme achievements | [GameplaySession.updateSceneTransition](geoblox/src/GameplaySession.java#L1242) |
| Select and request the next theme | [GameplaySession.prepareNextTheme](geoblox/src/GameplaySession.java#L1771) |
| Advance tutorial phases and steps | [GameplaySession.advanceTutorialStep](geoblox/src/GameplaySession.java#L1197) |
| Draw the tutorial prompt and its controls | [GameplaySession.renderTutorialPrompt](geoblox/src/GameplaySession.java#L69) |
| Start the ending sequence | [GameplaySession.startSessionEndSequence](geoblox/src/GameplaySession.java#L1166) |
| Advance result expansion, countdown and completion | [GameplaySession.updateResultSequence](geoblox/src/GameplaySession.java#L1463) |
| Add points and update score-dependent state | [GameplaySession.addScore](geoblox/src/GameplaySession.java#L1103) |
| Submit an eligible positive score | [GameplaySession.submitScore](geoblox/src/GameplaySession.java#L1620) |
| Process sorted/deduplicated match candidates | [MatchScoringSupport.processMatchCandidates](geoblox/src/MatchScoringSupport.java#L39) |
| Test whether entity queues have settled | [EntityContactSupport.areEntityQueuesSettled](geoblox/src/EntityContactSupport.java#L29) |
| Link entities through ownership-mask contacts | [EntityContactSupport.linkEntityAtMaskContacts](geoblox/src/EntityContactSupport.java#L47) |
| Advance difficulty tables | [PlayfieldRules.advanceDifficulty](geoblox/src/PlayfieldRules.java#L103) |

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
| [GameApplet](geoblox/src/GameApplet.java) | Six public static fields have no ordinary references in this corpus. | This does not rule out external or reflective access. Their finer purpose is unknown. |
| [VisualPropertyOverrides](geoblox/src/VisualPropertyOverrides.java) | Thirty-five private fields are used only by construction and property merging. | Names describe types and merge sentinels, not invented visual roles. |

There are no remaining plain block labels or large framed state-machine methods. Long ordinary methods and 41 finer field purposes still need review. Source/binding/native checks are scoped evidence; original-game equivalence, browser/phone behavior and heap/presented-FPS acceptance remain unverified.

## Reproduce and trace a name

Run from the Deko repository:

```sh
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --update
env -u JAVA_TOOL_OPTIONS node readable/reproduce-geoblox.mjs --check
```

Both commands cover the current Java export and this guide. No generated Java belongs in Deko or the cloner. Read [SYMBOLS.md](geoblox/SYMBOLS.md) for the symbol index and [mapping.json](geoblox/mapping.json) for original spellings, full JVM descriptors, declaration ordinals and UTF-16 edit positions. Reverse the dictionary with Deko’s `readable/tools/restore-original.mjs`; do not append opaque spellings to readable names.

Current raw source: `bad2a58aca81c3a4b55bfc515ec333ff25f11e1a`; tree SHA-256: `532f490805700d0224ef545b47ce3940d8f730d5561134ed62bb2233ebf9918b`.

Decompiler source: `d1dffcee5f4aa551e76bdac6d98bb42da82349d3`. The SHA-256 of its tracked Git tar is `940df31b58deca6107af7ef21724766b276a5ab73d4738adf9101c1d5013d831`; this is the decompiler source hash, not a game JAR hash.
