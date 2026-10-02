# Reading GeoBlox pass 19

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
uses `i.findOutermostAttachedEntity` to select an entity and computes
`endingEntityRadius` from nontransparent sprite pixels, then advances
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
`findOutermostAttachedEntity` starts at `Float.MIN_VALUE`, so even a nonempty
queue of centred or NaN positions can return null. It walks backwards, retains
the first tied candidate, and stops after one candidate on nonzero client guards.

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

## Board entity reconciliation

`kc.reconcileBoardEntities` now uses structured loops instead of 60 dispatcher
cases. Start with the usual zero-value path of the shared `Geoblox.field_C`
guard; the generated source retains its other outcomes too.

The first walk handles `ji.movingEntities`: entities queued for attachment have
their trail/masks updated, their primary and secondary links removed, and are
inserted into `a.attachedEntities`. Their queue marker is cleared and the board
raster is marked dirty.

When connectivity is dirty, an attached-entity walk uses
`pk.connectivityVisitedByEntityId` and two temporary `wd` collections to follow
related entities. A group touching the avatar is treated differently from a
detachable group. Detachment marks each group entity as moving, removes related
links, clears category/variant counters and marks the session flags. The
collections remain `var11` and `var13`; their complete class API still needs
review. `entityIndexThenGroupCount` retains its two observed counter roles.

The next attached-entity walk routes queued entities. For moving entities,
`radialOffsetX`, `radialOffsetY` and `radialVelocityScale` normalize a vector
toward `(320,240)` using `og.entityMotionSpeed`, then update velocity and remove
related links. Other paths move entities through the existing transient list,
update lifetime/animation state, and keep the original numeric sprite/action
choices. The final transient-list walk can return entities to
`ra.availableEntities`, then updates the session's raster-dirty flag.

This is a reading map of the recovered source, not a whole-game behavioral
proof. Several guards, scratch carriers and shared helper names remain opaque.

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

## Interface text and account entry

[AccountWelcomePanel.java](geoblox/src/AccountWelcomePanel.java) is the original
`wi` class. Its instance builds `createAccountButton`, `goBackButton` and
`justPlayButton`, using the corresponding decoded labels and dispatching clicks
by button identity. Its unrelated static helpers remain on this original class.

`AccountWelcomePanel.loadInterfaceText` binds `bf.activeTextArchive`, calls
`fk.readTextResourceBytes` for each unchanged resource key, then decodes non-null
bytes with `ag.decodeTextBytes`. The three `loadInterfaceTextPartN` methods are
size-budget partitions that preserve source order; their numbers do not denote
semantic loading phases. Shared fields keep decoded bytes, guard values and
failure context across helpers. The final helper clears the active archive.

There are 152 directly assigned text-resource fields. One, `reconnectMessages`,
was already named; the 151 new field names include `loadingGraphicsText`,
`loadingMusicText`, `startGameText`, `resumeGameText`, `orbPointsText`,
`monthNames`, account alerts and fullscreen prompts. The 526 discarded decode
results have no destination field to name; their calls remain present.

`bc.decodeTextSlice` iterates `textBytes[offset + byteIndex]`, omits zero bytes,
maps values 128 through 159 using `lf.extendedTextCharacters`, and constructs
its string from `decodedBuffer` and `decodedLength`. Zero mapping entries become
question marks. The guard's side effect remains explicit. This is a legacy
single-byte decoder; it is not named or treated as UTF-8.

[The text report](TEXT-READABILITY.md) records the exact resource-key evidence,
reproduction commands and native probe scope.

## Input validation and UI border sprites

[TextInputValidator](geoblox/src/TextInputValidator.java) supplies
`currentValidationState` and `currentValidationMessage` from `validatedInput`.
The candidate queries are `validationStateForText` and
`validationMessageForText`. All seven declarations in each candidate-query
family use those names, preserving their virtual overrides and pending states.
[MatchingTextValidator](geoblox/src/MatchingTextValidator.java) compares the
candidate with `referenceInput` and checks `referenceValidation` before accepting
the match. `qh` uses it for a confirmation input, and `mk` composes it with
another validation stage. Sentinel guard values remain in the source.

The same class contains an unrelated static helper, `buildNineSliceSprites`.
It creates corners, edge strips and a centre sprite; `cornerSize` is the sum of
`innerAccentWidth`, `borderGap` and `outerBorderWidth`. Named colour arguments
distinguish fill, top/left border, bottom/right border and inner accent.
`IntrusiveDeque.buildUnitBorderNineSliceSprites` supplies fixed unit widths for
UI skins. [The border/validation report](BORDER-VALIDATION-READABILITY.md) maps
the array indices, evidence, override families and remaining shared carriers.

## Remaining limitations

There are 972 explicit rules: 21 classes, 358 fields, 163 method declarations,
175 parameters and 255 guarded local declarations. This is not full
deobfuscation. Unknown flags, guard arguments and opaque shared helpers still
need investigation. Pass 15 removes the last two dispatchers while preserving
the reviewed names; ten result-sequence local ordinals move without changing
their spelling, type or evidence. All 642 names from pass 6
remain. Pass 10 migrates thirteen board-reconciliation local ordinals after
dispatcher-only carriers disappear, retaining their types, spelling guards and
semantic evidence. Pass 11 removes six unused exception locals without changing
any named identity or semantic rule. Pass 12 also retains all named identities
while replacing the oversized text initializer with three structured helpers.
Pass 13 adds 199 names without changing the raw Java tree; all previous rules
remain. Pass 16 adds 85 names for border geometry and text validation on the unchanged
raw source. All previous rules and local identities remain. The earlier
migrations remain frozen.

The decompiler now checks explicit exception-region exit contracts, preserves
ordinary empty branches as no-ops, requires explicit loop exit targets and
retains the exception table in large-method fallbacks. It refuses internal catch continuations that
would restart setup. Gameplay update, rendering, scene transition and screen
update use labeled loops; board reconciliation now does too, with its runtime
catch intact. Total
cases drop from 3,051 to zero. Result-sequence update and nine-slice sprite
construction now use labeled loops too; shared joins remain. The initializer
preserves its runtime catch and original resource order through shared helper fields. Unknown builder
prefixes across joins no longer disappear from diagnostic contexts. See [the investigation](STATE-MACHINE-READABILITY.md)
for refusal reasons, verification and the next structural steps.

## Signed complement conditions

Pass 14 replaces proven int/long XOR-minus-one comparisons with direct
conditions. Tutorial checks now show `tutorialStepId == 5` instead of
`-6 == (tutorialStepId ^ -1)`. Text decoding checks character values against
0, 128 and 160 directly. Numeric thresholds remain unchanged in meaning;
no gameplay enum or new state name is inferred by this renderer change.
See [the comparison report](COMPARISON-READABILITY.md) for exact pins and limits.

## Result-sequence loops

Pass 15 reconstructs `GameplaySession.updateResultSequence` as 167 lines of
structured control flow instead of a 27-case dispatcher. Its entity pixel scan
retains `maxRadiusSquared`, `spriteColumn`, `spriteRow`, pixel offsets and
`pixelRadiusSquared`. The source still preserves nonzero client-guard paths;
they are not silently treated as normal-play zero flags. The nine-slice helper
`MatchingTextValidator.buildNineSliceSprites` (original `n.a`) also loses its
34-case dispatcher. See the
[parallel-loop report](PARALLEL-LOOP-READABILITY.md) for the copy hazards found,
exact reproduction and the native test scope.


## Correct sprite pivots during result preparation

Pass 17 fixes six numeric-negation expressions in `Sprite` and `il`.
`-(-sourcePivotX)` preserves the pivot; the previous `--sourcePivotX` changed it
because Java parses that spelling as pre-decrement. This changed sprite pixels
and result-sequence radius/timing even though the source compiled. The
[numeric-negation report](NUMERIC-NEGATION-READABILITY.md) records the failure,
generic fix and 27 native result-sequence scenarios through completion. All
926 naming rules and 248 local identities remain unchanged. Whole-game behavior
and unknown names still need investigation.


## Result audio and shared points helper

Pass 18 names `resultExpansionAudioStream`, its progress-dependent
`PcmSampleStream.createForPlaybackRate` factory and the position query
`isSamplePositionOutOfRange`. `samplePositionFixed` and `sampleStepFixed` use
256 units per sample. `PcmSample` stores source `sampleRateHz`, `samples`, loop
endpoints and the ping-pong flag; `AudioOutput.sampleRateHz` is the distinct
output frequency. `playPcmSample` registers a stream at rate 100 and volume 96.

`qf.resultMusicTrack` is loaded from `bonus_bubble_jingle`.
`ra.selectBackgroundMusic` retains null/current-track early returns and the
original MIDI stop/reset/start path. `ld.spawnPointsPopup` names the shared
wrapper used by difficulty, result and points-panel bonuses; its argument order
is y, x, method guard, points.

The [result-helper report](RESULT-HELPER-READABILITY.md) explains the 46 additions
and native comparisons. The raw source and all 926 previous names remain
unchanged. New probes cover selector edge cases, PCM factory metadata and
position bounds, and music early returns. Actual MIDI activation, PCM advancement
and whole-game behavior still need verification.
