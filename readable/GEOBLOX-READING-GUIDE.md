# Reading GeoBlox pass 9

The readable tree uses semantic names without opaque suffixes. The symbol map
keeps the original spelling and JVM identity of every declaration, so
`GameplaySession` maps back to `gh`. Methods use full JVM descriptors in the
rules: two `a` overloads can have different roles. The map records original and
renamed identities, input/output files and every edit offset. Source offsets are
UTF-16 code units, not byte offsets.

## Menu to gameplay

`Geoblox.initializeScreens` constructs the nine `GameScreen` controllers.
`Geoblox.updateGame` dispatches to the committed screen or
`GameplaySession.updateSession`; `Geoblox.renderFrame` dispatches the matching
render call. `currentScreenId` and `requestedScreenId` are distinct.
`screenTransitionTick` commits the requested screen at tick 160. A screen
ID of -1 selects the existing gameplay branch. Numeric IDs and sentinel values
remain intact.

`MenuScreen` handles selection and hit testing. Its overridden activation/input
methods have matching names in `GameScreen`, preserving the virtual contracts.

## Tutorial prompts and progression

`GameplaySession.tutorialMode` selects tutorial behavior and suppresses
the normal scoring methods. `tutorialStepId` selects the message through
`uk.tutorialMessageForStep`. Known message IDs are:

| ID | Named string | Prompt |
| --- | --- | --- |
| 0 | `tutorialRotationMessage` | Practice rotating the board |
| 1 | `tutorialColourMatchMessage` | Connect three by colour |
| 2 | `tutorialShapeMatchMessage` | Connect three by shape |
| 3 | `tutorialCompleteMessage` | Proceed to the real game |
| 5 | `tutorialFailedMessage` | Replay or proceed after failing |

Other IDs return null in that message accessor. These names do not introduce an
enum or assert that every possible tutorial transition has been decoded.

`renderTutorialPrompt` draws the step's text and continue/replay buttons when
`tutorialStepPhase` is zero. Input changes the phase to one.
`advanceTutorialStep` checks rotation or matching progress; phase two advances
the step and returns to phase zero. `tutorialProgressMetric` serves as
both a counter and a baseline for matching counters. `leaveTutorial` switches
tutorial mode off and retains the original state changes.
`tutorialPromptActive` gates motion and release while a prompt is displayed;
`tutorialAdvanceRequested` carries the internal key-16 advance request.

## Gameplay tick, contacts and matching

The motion, contact and match stages are named separately:

- `ab.moveEntitiesAndCollectContacts` advances `ji.movingEntities` and gathers
  mask contacts relative to `boardAngleRadians`.
- `kc.reconcileBoardEntities` resolves contacts and rebuilds dirty connectivity.
  `ik.linkTouchingEntities` updates the reciprocal neighbor lists and counts;
  `ih.linkEntityAtMaskContacts` decodes the ownership-mask pixels.
- `ul.collectMatchCandidates` finds triples sharing `entityCategoryKey` or
  `spriteVariantIndex`. `nk.packedMatchCandidates` stores three 10-bit entity IDs
  and two equality flags; `h.matchCandidateCount` bounds the array.
- `ec.processMatchCandidates` sorts and deduplicates the triples. All three
  `matchCooldownTicks` values must be nonpositive before it awards points.
  Points are 30 or 90 multiplied by the increasing `gf.matchChainLength`.
- `rh.updateAttachedEntities` decrements cooldowns, updates attached animations
  and computes the board's maximum squared entity distance.

The session's `matchBatchProcessedThisTick` reports consumption of a nonempty
candidate batch; cooldowns can prevent every candidate in that batch from scoring.
`dd.variantMatchCandidateCount` and `dk.categoryMatchCandidateCount` count collected
triples before cooldown checks and deduplication. They are also tutorial metrics.

`touchesAvatar` means direct contact with the white `0xFFFFFF` avatar marker.
It is a root for the graph traversal, rather than a transitive connectivity flag.
`re.connectivityDirty` requests a rebuild, and `pk.connectivityVisitedByEntityId`
records traversal visits. Detached components set `detachedFromBoard`, return to
the moving queue and set `fa.entitiesDetachedThisTick`.

`ab.boardContactStateDirty` covers contact changes and cooldowns reaching zero.
The session snapshots it as `boundaryCheckRequested` before advancing motion.
`boardRasterDirty` requests a redraw of the attached scene raster; it is separate
from both contact dirtiness and `connectivityRebuiltThisTick`.

## Releases, result sequence and scene transition

`lc.updateSpawnQueue` advances `wd.spawnQueue` and releases ready members into
`ji.movingEntities` unless `spawnReleaseDisabled` is set. `hd.recordEntityRelease`
increments `ul.releasedInCurrentTheme` and `di.releasedInDifficultyStep` outside
tutorial mode. The theme threshold is `fa.releasesPerTheme`; `qe.a` calculates
`sa.releasesPerDifficultyStep` as its ceiling divided by three.
`ld.advanceDifficulty` increments `ji.difficultyStep` and applies the difficulty
bit flags to speed, rotation and entity selection parameters.

`GameplaySession.sessionPhase` retains these numeric states:

| ID | Observed role |
| --- | --- |
| 0 | Normal play |
| 1 | Result sequence requested at the theme release threshold |
| 2 | Expanding result effect |
| 3 | Shrinking result effect and accumulating bonus |
| 4 | Result countdown/fade |
| 5 | Result complete; scene transition requested |

`updateResultSequence` initializes `resultBonusPoints` with an additional 179,
computes `endingEntityRadius` from nontransparent sprite pixels, then advances
the effect phases. Shrinking ticks add seven bonus points each. The completion
tick uses `resultCompletionTickOffset + 150`. `boardEmptyAtResultStart` snapshots
an empty attached queue and enables the extra 2000-point popup.
`renderResultSequence` draws the corresponding effects and text.

`sceneTransitionRequested` lets `updateSceneTransition` run once the session can
advance. `sceneTransitionInProgress` describes the active transition interval.
At transition tick zero, `preserveScoreOnTransition` selects `prepareNextTheme`
when true and `resetScoreState` when false. It also gates the progress HUD.
The transition completes at tick 160 and clears the request. `renderProgressHud`
shows remaining theme releases during normal play or phase-specific text.

`ih.areEntityQueuesSettled` requires the moving, spawn and transient animation
queues to be empty and `jl.field_t` to be clear; attached entities can remain.
`sk.checkBoundaryLossAndStartCascade` selects the ownership raster and calls
`ld.hasPixelsAtPlayfieldBoundary`, a radius-230 circle probe centered at (320,240).
On loss it starts the session-ending path and traverses the contact graph from
the farthest attached entity, assigning staggered lifetimes in increments of 50.
The end path sets `sessionEnding`; it is distinct from the normal result phases.

## Points panel and entity rendering

The points panel slides between x=463 and x=640 through `pointsPanelX`
and `pointsPanelSlideDirection`. `pointsPanelFrameIndex` and
`pointsPanelFrameDirection` describe its animation. `addPopupPoints`
accumulates pending points; `emitPointsPopup` places the popup relative to that
panel. `resetScoreState` resets the existing score bookkeeping and panel state.

`GameplayEntity.entitySpriteKindId` chooses a sprite bank and its
animation behavior. `resetEntityAnimation` resets its animation state and calls
`selectEntitySprite`. `drawBoardRotatedEntity` names centered coordinates and
the resulting rotated x/y positions. Existing velocity, position, lifetime,
palette and related-entity names remain available.

`entityId` is an entity identifier. `drawEntityIdOnBoardMask` stamps
`entityId+1` into the board ownership raster;
`drawEntityIdOnPointerMask` stamps into the pointer raster. The board mask is
placed at `(320+boardMaskOffsetX, 240+boardMaskOffsetY)`.
`eraseEntityPixels` removes pixels owned by that identifier. The static
`registerAudioStream` serves the shared mixer; its name does not imply that the
stream belongs to a gameplay entity.

## Score popup lifecycle and debug controls

`ScorePopup` replaces the instance class `me`. It stores `points`, `pointsText`,
`originX`, `originY`, `progress` and `chainMultiplier`.
`ug.spawnScorePopup` takes an object from `ue.availableScorePopups`, initializes
it and inserts it into `md.activeScorePopups`. An empty pool credits points
directly. `bd.drawScorePopups` interpolates toward the points panel and displays
the chain multiplier when it is not one. `cf.advanceScorePopups` updates progress
and, after completion, routes points to `addScore` for multiplier one or
`addPopupPoints` otherwise, returning the object to its pool.
`wa.collectUnfinishedPopupPoints` drains active objects and sums their stored
points, which already include any chain multiplication.

Debug input can enable `debugPointerSpawnEnabled`, choose
`debugSpawnCategoryId`/`debugSpawnVariantId`, select `debugSpawnSpecialKinds`,
toggle `spawnReleaseDisabled` or `rotationControlsSwapped`, and enable
`showSessionCounters`, `showDebugOverview` or `debugReducedRendering`.
`nb.spawnEntityAtPointer` transforms pointer coordinates relative to board
rotation before initializing the entity. `submissionBlocked` gates score/action
submission after the existing debug actions. `newActionCount` counts newly
recorded action bits; these names do not establish a multiplayer protocol.

## Lists used by gameplay

`IntrusiveNode` stores the primary next/previous links.
`DualLinkNode` adds an independent second link pair, and
`GameplayEntity` inherits both. `unlinkSecondaryNode` leaves the primary
links untouched.

`IntrusiveDeque` contains a circular sentinel and a traversal cursor. Its
instance API now reads as `addFirst`, `addLast`, `removeFirst`,
`removeLast`, `firstForIteration`, `nextForIteration`,
`lastForIteration`, `previousForIteration`, `countNodes`, `isEmpty`,
`clearNodes` and `moveAllTo`. Its private `moveSuffixTo` implements the
splice. `pendingActionMarkers` holds the existing `PendingActionMarker`
objects. Static theme helpers on these obfuscated classes remain separate and
largely unnamed; class names describe their instance roles.

## Remaining limitations

There are 642 explicit rules: 17 classes, 178 fields, 129 method declarations,
91 parameters and 227 guarded local declarations. This is not full
deobfuscation. Large decompiler state machines, unknown flags, guard arguments
and opaque shared helpers still need investigation. All 642 names from pass 6
remain. Pass 9 keeps every declaration identity unchanged. The retained pass-8
migration records its eight earlier local-ordinal moves.

The decompiler now checks explicit exception-region exit contracts, preserves
ordinary empty branches as no-ops and refuses internal catch continuations that
would restart setup. Gameplay update, rendering, scene transition and screen
update use labeled loops; the screen update retains its runtime catch. Total
cases drop from 3,051 to 877. Four original methods retain dispatchers, including
two with at least 50 cases. See [the investigation](STATE-MACHINE-READABILITY.md)
for refusal reasons, verification and the next structural steps.
