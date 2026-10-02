# Reading GeoBlox

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

## Gameplay graphics and theme selection

`Geoblox.prepareGameAssets` loads the game resources through named wrappers:
`ug.loadSprite`, `wj.loadSpriteFrames`, `jg.loadIndexedSprite`,
`w.loadPaletteFont` and `gi.loadBitmapFont`. Their arguments distinguish
`groupName`, `resourceName`, glyph graphics and font metrics archives. The
resolved `archiveGroupId` and `archiveFileId` locals retain their original
lookup and failure order; sentinel guard arguments remain explicit.

`geometrySourceFrames` supplies the seven theme/category groups. The ordinary
kind-zero sprite table is `ke.entitySpritesByThemeCategoryAndVariant`;
kind one uses `s.geometrySpritesByThemeAndCategory`, and kind two uses
`MenuScreen.amorphousFramesByThemeAndVariant`. `jg.themeSpriteColors` tints the
variant dimension; `themeCycleColors` supplies the animation interpolation
sequence. Original kind IDs and array dimensions remain intact.

Avatar graphics now read as `avatarEyeFrames`, `avatarMouthFrames` and
`avatarCryBeginFrames`/`avatarCryMiddleFrames`/`avatarCryEndFrames`, with the
Halloween source overrides retained. `blackOrbFrames`, `silverStarFrames`,
`sparkleFrames`, `bangFrames` and the other effect arrays keep their original
frame selection and reset behavior.

`cd.selectThemeRenderAssets` chooses `ec.selectedThemeForeground` and
`mf.selectedThemeBackground` for the committed `GameScreen.selectedThemeId`:

| Theme ID | Resource group |
| --- | --- |
| 0 | jewels |
| 1 | sun |
| 2 | sweets |
| 3 | germs |
| 4 | baking |
| 5 | sports |
| 6 | space |

The renderer rotates the chosen foreground into
`jf.rotatedThemeForegroundRaster` using `boardAngleRadians`, and draws the
chosen background at `(0,0)`. The original `jewls_foreground` and
`jewls_background` resource spellings stay unchanged.

`dd.uiPaletteFont.colorPalettes` makes HUD highlight updates readable;
`kh.screenTitleSprites` retains the nine original screen indexes.
`GameplaySession.showGameOverOverlay` is distinct from `sessionEnding`: it
moves the score box and displays the title loaded from `gameover_title` at
index six. Asset identity and use support these names; successful complete
archive loading and real-asset rendering remain outside the native fixtures.

## Sprite and raster drawing

`SoftwareRasterizer.setRasterTarget` installs the pixel buffer, framebuffer
stride and `framebufferHeight`, then resets the clip. `setClip` clamps its edges
to the target bounds; `intersectClip` tightens the current clip. `saveClip` and
`restoreClip` use left, top, right and bottom in that order. Restoration retains
the original raw bounds. `clearFramebuffer` clears the whole target, regardless
of its clip. `releaseRasterStorage` releases its retained arrays.

`SpriteState.fullWidth`/`fullHeight` describe the logical canvas; `width`/`height`
describe cropped pixels and `trimX`/`trimY` place them within that canvas.
`IndexedSpriteState` exposes the corresponding geometry for `IndexedSprite`.
The preparation locals `geometryCanvasHeight` and
`geometryCanvasWidthThenFrameIndex` replace the earlier ambiguous names.
The latter is still reused as a frame index later in the original method.
`Sprite.setAsRasterTarget` uses actual pixel dimensions. The distinct
`Geoblox.setRasterTarget` helper retains its original full-canvas arguments.

| Operation | RGB `Sprite` | `ArgbSprite` |
| --- | --- | --- |
| `draw` | Skips zero-colour pixels | Blends stored per-pixel alpha |
| `drawUnmasked` | Copies pixels including zero | Still blends stored alpha |
| `drawAlpha` / `drawScaledAlpha` | Uses `alpha256` | Combines global and stored alpha |
| `drawGrayTinted` / `drawGrayModulated` | Remaps gray pixels | Remaps gray pixels and blends stored alpha |

`drawScaled`, `drawHalfSize` and `drawQuarterSize` keep the original sampling,
trimming and clipping formulas. `drawAdditive` retains each implementation's
channel saturation and alpha arithmetic. The complete overridden method
families share names; no RGB assumptions are imposed on their ARGB variants.
`IndexedSprite.draw` and `drawAlpha` use palette indexes with zero transparency.
`drawRunEncoded` additionally interprets the original -1 skip-run marker.

Clipped wrappers now name `sourceIndex`, `destinationIndex`, `drawWidth`,
`drawHeight`, row skips and `clippedEdgePixels`. Raster APIs distinguish
`drawCircle` from `fillCircle` and name rectangles, lines, gradients and rounded shapes. Original clipping,
rounding, guard and invalid-input behavior remains; these names do not change
alpha ranges or fix edge cases. Controlled native fixtures exercise drawing,
but whole-game rendering with real assets remains unverified.

All 23 private static sprite kernels now have guarded names. `blitColorKey`
and `blitUnmasked` distinguish skipped zeros from copied zeros;
`blitColorKeyAlpha` and `blitArgbAlpha` distinguish global and combined alpha.
The scaled counterparts name `sourceX16`, `sourceY16`, `stepX16`, `stepY16` and
`sourceRowOffset`. Gray and additive kernels name their channel products,
blend weights and carry scratches. `sourceReadIndex` and
`destinationWriteIndex` retain snapshots taken before post-increments; numbered
copies follow declaration order, preserving the original unrolled loops.
`widthThenNegativeTail`, `quadOrTailCounter` and
`trimStepsThenDestinationIndex` make reused storage explicit rather than
inventing separate variables. `blitPaletteRuns` retains the marker and row-start
rules, including their original clipping behavior.

RGB/indexed alpha kernels sign-extend their packed 24-bit blend with `>> 8`;
ARGB kernels use `>>> 8`. The drawing probe preserves that difference and
independently verifies 43,750 normal pixel-buffer cases, including gray channel
boundaries, full canvas versus cropped pixels, alpha boundaries and unsigned
palette indexes. A nonzero palette index can copy zero; index zero remains
transparent even with a nonzero palette entry. Another 1,324 reduction,
run-marker and invalid-alpha cases preserve fixed native traces. Those cases
have no independent semantic oracle. Real-asset rendering and whole-game
behavior still need investigation.

Every parameter/local declaration in the three concrete sprite classes now has
an explicit guarded name. `ArgbSprite.rotateNearest` shares RGB geometry names:
Q4 pivots/destination centers, Q12 source coordinates, quantized inverse sine
and cosine steps, transformed corner bounds and negative scan counters. One
turn is 65,536 angle units; scale 4,096 is unity. The nine step-direction branches
and their write-index snapshots remain explicit. ARGB adds `storedAlpha`,
`inverseAlpha256` and `destinationPixel` to the sampled-pixel path.

`sampleBilinear` names four neighbors and weights. Each weight starts in Q24,
then truncates to Q8. Total surviving coverage below 128 skips the write;
coverage 128 through 255 normalizes channels by the surviving weight, and a
zero filtered RGB result becomes one. `ArgbSprite` inherits this RGB routine
for smooth rotation. Its half/quarter reductions instead normalize channels
by `alphaSum`, then blend with the average alpha. RGB reductions substitute
the destination color for zero samples. Reused sample/weight/channel storage
has explicit names rather than being split into invented variables.

`copy` and `copyMirroredHorizontally` allocate independent RGB sprites even when
inherited by ARGB. `rotateClockwise` exchanges crop/canvas dimensions and trim
geometry. `addOutline` tests the original four-neighbor mask, and
`trimTransparentBorders` updates the crop bounding box while keeping the logical
canvas. The additional native transform probe independently checks these
mutations, reductions, cardinal rotation and bilinear rules. General rotations
and extreme scales retain trace-only checks. The image constructor now names
its encoded bytes, image observer, tracker, pixel grabber and caught interruption;
its original partial-initialization behavior is retained but not exercised by
the native drawing fixtures. Step-direction branches, other classes, AWT loading,
real assets and whole-game behavior remain unfinished.

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

The collector now names both neighbor indices and the gated variant/category
comparisons. `eligibleNeighborhoodVisited` controls feedback after visiting an
eligible neighborhood; it does not mean a triple was found. `dualMatchFound`
selects feedback mode 5 when a triple shares both properties. The IDs are sorted
into `largestPackedEntityId`, `middlePackedEntityId` and `smallestPackedEntityId`
before packing. Their variables initially hold different entity roles, so the
names describe the final packed order rather than permanently identifying a
central or neighboring entity.

The processor's `sortInsertionIndex` belongs to the insertion sort; the existing
`candidateIndex` walks the deduplicated batch. `firstBlockedEntity` and
`secondBlockedEntity` are aliases used only to clear queue markers when a
candidate fails a cooldown check. `wb.newAttachmentCount` is reset during motion
and increments for newly attached entities. In an empty batch it can reset the
chain, except while `w.avatarShockPending` is set. The shock flag originates in
kind-3 avatar contacts and is cleared by board reconciliation. The native scoring
probe controls these gates directly; it does not simulate their physics producers.

`touchesAvatar` means direct contact with the white `0xFFFFFF` avatar marker.
It is a root for the graph traversal, rather than a transitive connectivity flag.
`re.connectivityDirty` requests a rebuild, and `pk.connectivityVisitedByEntityId`
records traversal visits. Detached components set `detachedFromBoard`, return to
the moving queue and set `fa.entitiesDetachedThisTick`.

`ab.boardContactStateDirty` covers contact changes and cooldowns reaching zero.
The session snapshots it as `boundaryCheckRequested` before advancing motion.
`boardRasterDirty` requests a redraw of the attached scene raster; it is separate
from both contact dirtiness and `connectivityRebuiltThisTick`.

`linkTouchingEntities` rejects a duplicate before considering
`forceDetachSecond`. Its return reports detachment of the second entity.
Special-kind contacts can also set `detachFirst`. The second detach path
preserves `touchesAvatar`, while the first clears it. Both reset neighbor
counts and select `ji.movingEntities` as the queue marker; inactive array slots
can still contain references.

Two locals deliberately have combined names: `neighborIndexThenDetachSecond`
first searches for duplicates, then holds the second detach flag;
`variantPropagationThenNeighborIndex` first selects variant conversion, then
walks neighbors during detachment. The generated source reuses these slots.
`firstNeighborInsertionIndex` and `secondNeighborInsertionIndex` preserve
the append positions before incrementing the counts. The native gameplay probe
checks contact kinds 0/1/2, duplicate suppression, both force values, removal
positions and detachment with existing neighbors using controlled sprites.

`bh.propagateContactConversion` takes a `templateEntity`, a `startingEntity`
and separate `propagateVariant` and `propagateCategoryAndKind` flags. It
snapshots the template's category, variant and sprite kind before traversal.
`pendingEntities` schedules eligible neighbors at the front and
`pendingEntitiesForRemoval` aliases that same collection for removal.
`processedEntities` collects each completed entity. Its scan compares
`currentEntity` with `processedEntityToCompare`; it does not test a neighbor's
visited identity. These details remain explicit in the generated source.

Variant conversion selects kind zero before category/kind conversion runs.
Category-only conversion marks an old kind-two entity as detached and moving;
its configure call also starts the 60-tick cooldown. While scheduling neighbors,
category propagation copies the template angle and increments category counts;
variant propagation increments variant counts. A final entity with no eligible
neighbor can retain its previous angle. The native graph probe records these
angle outcomes and independently checks reachability and edge counters.

Passing both flags directly can fail while converting a kind-two entity:
variant conversion temporarily selects kind zero while its category is still
-1, causing a sprite-array bounds failure. The wrapper retains the partial
field writes and original exception context. The contact caller never requests
both flags together. The probe preserves that behavior rather than rewriting it.

## Playfield boundary scan

`ld.hasPixelsAtPlayfieldBoundary` tests the discrete radius-230 perimeter around
(320,240), using any nonzero framebuffer pixel as a hit. It does not test every
pixel outside the circle or decide a game-ending policy by itself.
`upperNearRowCenterIndex` and `lowerNearRowCenterIndex` address column 320 at
rows `240 - circleVerticalOffset` and `240 + circleVerticalOffset`.
`upperFarRowCenterIndex` and `lowerFarRowCenterIndex` use the horizontal offset
for their rows. Near-row probes use the horizontal offset for their columns;
far-row probes use the vertical offset. Together they cover eight symmetries.

The retained integer `circleError` equals
`circleHorizontalOffset * (circleHorizontalOffset - 1) + circleVerticalOffset²`
at the loop's probe stage. The independent oracle solves that inequality using
a square root, yielding 1,300 unique pixels. It checks every pixel in the full
bounding square, including near misses, at two strides. The scan leaves the
framebuffer unchanged. Client control-flow guard values zero and one are tested.

`methodGuard` normally receives -61. The otherwise unused `guardDivisionResult`
still performs integer division before the first pixel read; zero denominators
throw with the original `ld.B(...)` context even if the first pixel is occupied.
A left cardinal hit returns before later pixels are read, so it can succeed with
a raster too short for the right cardinal address. Null buffers, short buffers,
negative nonzero pixels and signed guard overflow retain their native behavior.

The exception-region reconstruction now returns on each original nonthrowing
path inside the try. Its 13-arm post-try ladder and `boundaryResultArmId` are
removed by the generic decompiler; shared joins and throwing continuations in
other methods retain external routing. The current Boolean carrier proof removes
all 13 integer result carriers and emits direct true/false returns. Fourteen
remaining locals and the method guard retain their semantic names. The original
exception aliases and nested probe conditions remain; no framebuffer reads are
reordered.

## Score popups and text writes

`ug.spawnScorePopup` takes a popup from the pool. Pool exhaustion credits the
points immediately; pooled popups enter the active queue with zero progress.
`cf.advanceScorePopups` advances their float progress, including native NaN
behavior, then credits points to the score or pending panel according to the
chain multiplier. Tutorial mode suppresses the scoring methods.

`GameplaySession.addScore` retains the integer total and writes a display cap of
9999999 when needed; `addPopupPoints` similarly caps its displayed prefix at
99999. Neither cap clamps the stored integer. `td.writeTextAtOffset` writes
characters sequentially into the existing builder and grows its length only
when needed. It does not truncate a suffix after a shorter write. An empty write
returns the original builder unchanged. If the source is the same builder,
earlier writes affect later source reads: writing `abc` at offset 1 into itself
produces `aaaa`. The direct native probe verifies these details, partial writes
on failure, exception wrapping and throwable identity.

`sourceCharacterIndex`, `characterWriteOffset`, `originalLength`, `sourceLength`
and `writeEndOffset` expose this operation without simplifying the retained
guards or changing exception-context strings. A guard <=23 retains the PCM
helper side effect; it is outside the direct text-writer probe.

## Releases, result sequence and scene transition

`lc.updateSpawnQueue` advances `SecondaryDeque.spawnQueue` and releases ready members into
`ji.movingEntities` unless `spawnReleaseDisabled` is set. `hd.recordEntityRelease`
increments `ul.releasedInCurrentTheme` and `di.releasedInDifficultyStep` outside
tutorial mode. The theme threshold is `fa.releasesPerTheme`; `qe.a` calculates
`sa.releasesPerDifficultyStep` as its ceiling divided by three.
`ld.advanceDifficulty` increments `ji.difficultyStep` and reads
`kd.difficultyStepFlags`. Its normal callers pass `recursiveAdvanceGuard=false`.
The true guard recursively advances the shared index and may throw when a
caller resumes and re-reads an exhausted table; partial updates remain visible. The
17 integer Boolean carriers are now eliminated, so the interval calls use
`sa.recomputeSpawnReleaseInterval(!recursiveAdvanceGuard)` directly. The proof
requires a single adjacent use and a nonthrowing primitive condition whose
inputs are unchanged. The local tail pass reduced the method from 220 lines
to 69; the nested-continuation pass then reduced it to 56. The integral
predicate proof reduces it to 38 lines: variant, recursive-advance and category
updates each have one path, followed by one probability/rotation/interval tail.
The category path still reads the shared flag table after recursive advancement;
the variant path runs before it. No table read or recursive effect is moved
ahead of its prefix. Cached JVM operands prove integral relational complements
without rendering blocks again. Unknown and floating predicates retain logical
negation; conflicting evidence refuses both complementary spellings. This game method requires
no generated block label; exact terminal clones in more complex nested prefixes
can use a deterministic plain-block break without duplicating effects. The 84,661-case difficulty matrix checks the
resulting partial state and exceptions.

| Flag bit | Observed effect |
| --- | --- |
| 1 | Raise `ag.availableSpriteVariantCount` when below seven |
| 2 | Raise `f.availableEntityCategoryCount` when below seven |
| 4 | Add to `og.entityMotionSpeed` and recompute the release interval |
| 8 | Multiply `DualLinkNode.rotationStepRadians` by the retained float factor |
| 16 | Add 0.05 to `sa.specialSpriteKindProbability` |
| 128 | Raise `ij.spawnIntervalScale` when below 0.8f, then recompute the interval |

`sa.recomputeSpawnReleaseInterval` stores
`int(201.0f / entityMotionSpeed * spawnIntervalScale + 0.5f)` in
`kb.spawnReleaseIntervalTicks`. Its `preserveReleaseQuota` parameter leaves
`releasesPerDifficultyStep` unchanged when true; false writes -10 after storing
the interval. The scale threshold is a gate, with no clamp after addition.
Past the flag table, the special-kind probability is reduced by 0.05 only when
above the original exact double threshold 0.15000000000000002.

`pg.resetGameplayDifficulty` initializes three sprite variants, four categories,
speed 0.4f, scale 0.75f, rotation and the release quota. Guard 9408 additionally
resets remaining counters and updates the interval. `qe.adjustThemeReleaseQuota`
adds the signed `additionalReleases` plus a step-dependent ten and computes the
ceiling quota divided by three; the original arithmetic remains.

`nf.chooseSpawnSpriteVariant` supplies `spriteVariantIndex` to entity motion
initialization; `ij.chooseSpawnEntityCategory` supplies `entityCategoryKey`.
Their Random source is shared. The variant guard can return 66 without drawing;
a category guard at or below 18 discards an extra draw before returning the next.
`vd.chooseSpawnSpriteKind` returns zero when its probability gate stays closed,
or selects kinds 3/4/1/2 using the original live-random thresholds. Invalid guards
return 104. These compatibility effects retain their exact sentinels.

`updateSpawnQueue` now names `queuedEntityThenPooledEntity`, preserving both
roles of the reused slot. `spawnAngleRadians` sets `spawnPositionX/Y` on the
radius-240 circle; `inwardDirectionX/Y` initially hold offsets toward the centre,
then are normalized using `inverseSpawnDistance` before velocity scaling.
`kc.ticksSinceLastEntityRelease` resets to zero on release, then receives the
same update's unconditional increment. These geometry names have direct source
evidence.

The existing gameplay probe verifies 84,661 additional cases against independent
oracles and native bytecode: all 256 byte masks, saturation, recursive failures,
index overflow/null tables, real-table progression, float casts, quota/reset
guards, seeded category/variant draws and closed special-kind gates. It verifies
partial state even after a failure. Full queue execution, live Math.random
sampling and extreme quota-overflow loops remain outside those fixtures.

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
`pk.connectivityVisitedByEntityId`, `pendingConnectivityEntities` and
`visitedNonAvatarEntities` to follow related entities. `currentConnectivityEntity`
is the popped entity; `currentConnectivityEntityAlias` refers to the same object
and implies no parent/child relationship. `componentCanDetach` starts at one
and becomes zero when the search reaches a direct avatar contact. That root
stops the search before insertion into `visitedNonAvatarEntities`, so an
anchored search can leave only a partial group in that collection.

An unanchored group moves to `ji.movingEntities`, loses its reciprocal contacts
and resets category/variant counters. Anchored components remain attached with
their neighbor order and counts. The graph probe verifies both outcomes against
independent connectivity and queue-partition oracles. A completed rebuild clears
visited entries 0 through 999; clean connectivity leaves the array alone.
`componentNeighborIndex` walks neighbors during discovery and reciprocal removal.
`visitedResetIndexThenKindFourCount` first clears the visited range, then counts
kind-four entities routed to the transient list and changed to kind seven; it
does not count connected components.

The next attached-entity walk uses `routedAttachedEntity` to route queue markers.
For moving entities,
`radialOffsetX`, `radialOffsetY` and `radialVelocityScale` normalize a vector
toward `(320,240)` using `og.entityMotionSpeed`, then update velocity and remove
related links. Other paths move entities through the existing transient list,
update lifetime/animation state, and keep the original numeric sprite/action
choices. The final transient-list walk can return entities to
`ra.availableEntities`, then updates the session's raster-dirty flag.

Several slots span these phases: `connectivityAliasThenDetachingEntity`
starts as a popped-entity alias and later holds the group member being detached;
`neighborThenCountResetEntity` starts as a candidate neighbor and later aliases
an entity for count cleanup. `componentSearchThenVariantResetEntity` scans the
worklists before its later reset role. The carrier pairs
`comparedThenUnlinkTarget`/`neighborThenUnlinkArgument` similarly serve identity
checks before reciprocal unlink calls. Their names preserve those distinct
uses rather than inventing a permanent entity relationship.

`rasterDirtyDecision` combines the old raster flag, contact dirtiness and avatar
shock state. The native reconciliation fixture checks connectivity and contact
flags, including centre-position NaN velocities. It exercises the normal method
guard -90 from `GameplaySession.updateSession` and compares both retained client
control values. Attachment drawing, shock/transient routing and pool-return
branches now also have native fixtures with minimal sprites and zero or one
reciprocal neighbor. Attachment writes `entityId+1` ownership pixels; transient
and pool transfers clear secondary membership. Shock popups use the original
integer-narrowed `popupOriginX`/`popupOriginY`, with `popupPoints` set to 100 for
original kinds three/four and 10 otherwise. `kindFourRemovalCount` increments
for original kind-four entities changed to kind seven. New unlock delivery is
outside these fixtures; existing action bits suppress it.

`avatarShockContactPending` is set by a kind-three ownership-mask contact and
blocks queue settling. Once the attached update requests `avatarShockPending`,
reconciliation consumes that request, clears the contact flag and calls
`jc.requestAvatarFeedback(3, false)`. These are distinct stages and flags.

`requestAvatarFeedback` manages `avatarFeedbackModeId`, `avatarFeedbackFrameBase`,
`avatarFeedbackFrameIndex` and `avatarFeedbackHoldTicks`. Ordinary requests
0 through 5 select six-frame segments; request 7 selects mode six/base 36.
A positive hold defers ordinary changes. Request 3 still starts
`avatarShockEffectTicks` at 50 and queues its sound during a hold. A new request
7 overrides a different frame base and starts a 110-tick hold.
`clearSpriteGuard` preserves the original optional clearing of `jc.field_a`;
normal gameplay passes false. The native matrix verifies both guard values and
retains Java's negative frame remainder rather than clamping it.

`SecondaryDeque.contactProbeOffsetX` and `contactProbeOffsetY` place the contact
raster within the 640 by 480 viewport. Their normal values are 90 and 10 for a
460 by 460 raster. Entity trail and contact drawing subtract these offsets.

`qa.advanceMenuAvatarAnimation` and `f.advanceGameplayAvatarAnimation` update
the shared avatar feedback state. `avatarFrameStepTicks` is tested before its
decrement: an old negative value resets it to 20 and steps the frame. An offset
of zero first jumps to three. Otherwise `avatarSteeringDirectionId` zero moves
toward offset three, one decrements offsets above one, and two increments
offsets below five. Other direction IDs preserve the frame. The entry guard
for the menu update must be at least 72; the actual caller passes 127.

Every enabled update decrements `avatarFeedbackHoldTicks` and increments
`avatarBlinkClockTicks`. Remainders below 30 force the base frame, using a fixed
600-tick menu cycle and `blinkPeriodTicks` in gameplay (normally 600).
`avatarShockFrameIndex` changes only if the old `avatarShockEffectTicks` was
positive; it uses the decremented value modulo 15 and then modulo two. These
counters continue below zero, and the native fixtures retain Java remainders.

`wc.requestAvatarTintForRadius` receives the maximum attached squared distance
from the board center. When `avatarTintFadeTicks` is nonpositive, it copies
`avatarTintColor` into `avatarTintStartColor`, selects `avatarTintPalette` and
sets `avatarTintRedDelta`, `avatarTintGreenDelta` and `avatarTintBlueDelta`.
The index rounds four times the squared radius divided by 52900; it is not
clamped. The division guard and bad index can throw after the starting-color
copy. A positive fade bypasses the whole request, including those failures.

Both animation paths compute `avatarTintFadeFactor` from the old fade timer
and the retained float constant, narrow each scaled channel to int, and add
the packed deltas to the starting color. Only a positive old fade timer writes
the color; the timer still decrements after expiration. The independent native
matrix checks those boundaries, signed/fractional channel values and multiple
blink cycles. Gameplay ending-message updates share this method but are not
covered by these added fixtures.

The generic decompiler now spells literal shift distances using their JVM
width. The tint channels above use `<< 16` and `<< 8`; sprite and board-center
calculations use readable right-shift distances. Int shifts mask with 31 and
long shifts with 63. The prior pass changed 972 constants across 90 files
while preserving every other Java token, declaration identity and naming rule. Dynamic distances
and computations that can throw retain their expressions and evaluation order.

Integral right-hand signs are now canonical. For example,
`avatarFeedbackFrameIndex + -frameBase` becomes
`avatarFeedbackFrameIndex - frameBase`, and negative literal subtraction
becomes addition. This removes 745 sign nodes across
132 files. Cast boundaries and floating expressions are preserved; the typed
source audit allows only these integral rewrites and parentheses. No branches
are factored or operands reordered by this pass.

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

`SecondaryDeque` is the original `wd` class. Its instance API uses
`DualLinkNode.nextSecondaryNode` and `previousSecondaryNode`, with its own
`sentinel` and `iterationCursor`. It provides `addFirst`, `addLast`,
`removeFirst`, `firstForIteration`, `nextForIteration` and `countNodes`.
Insertion removes the node from its previous secondary collection. The primary
links stay intact, allowing conversion and connectivity worklists to coexist
with gameplay queues. Native model checks cover transfers, reinsertion, removal,
iteration order and reciprocal links. Normal guards remain part of the API;
alternate guard side effects are retained in the source.

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

There are 5,220 explicit guarded rules: 45 classes, 641 fields, 473 method
declarations, 1,434 parameters and 2,627 locals. This is not full deobfuscation.
Unknown flags, guard arguments and opaque shared helpers still need
investigation. Current names and source identities live in the single manifest;
previous naming and structural passes remain in Git. The earlier early-exit migration
moved 35 named local ordinals by unique method/original-spelling identity.
The subsequent naming pass retained all prior rules and added 38 difficulty
and spawning identities without changing the raw source. The previous migration
folded 77 typed literal assignment branches. The subsequent proof removed 221
generated locals, keeps 70 Boolean local snapshots and retypes one generated
helper field. Fourteen obsolete names are explicitly removed, 61 surviving local
ordinals migrate, and the helper field has an explicit type migration. All other
semantic names remain. The previous local shared-tail pass removed 451 lines across
16 files, retaining every declaration identity and all 1,194 naming rules without
ordinal changes. It factors exact whole tails within a block scope after Boolean
cleanup and preserves bare return guards. That pass left the difficulty method at 69 lines.
The previous nested pass removed another 21 lines across seven files and reduced
it to 56 lines, coalescing its repeated probability/rotation/interval tail.
Four unnamed snapshot ordinals reorder in v.a(B)V; method/original-spelling
normalization preserves every declaration. The preceding integral-guard pass
removed 18 lines across four files,
reducing the method to 38 lines and coalescing its recursive/category clones.
Every declaration key and spelling is unchanged, with no ordinal migrations.
All 1,194 rules survived that structural pass. Later naming passes added
asset/loading/overlay and sprite identities while retaining prior rules and the
same raw source. That historical structural refresh preserved all 2,404 rules.
Other carriers, shared joins and opaque names remain. The earlier terminal-return
pass removed the vanished boundary selector;
the current emitter also retains its proven early-exit reconstruction.
Complete parsing and preserved declaration scopes keep this reproducible.

The decompiler now checks explicit exception-region exit contracts, preserves
ordinary empty branches as no-ops, requires explicit loop exit targets and
retains the exception table in large-method fallbacks. It refuses internal catch continuations that
would restart setup. Gameplay update, rendering, scene transition and screen
update use labeled loops; board reconciliation now does too, with its runtime
catch intact. Generated dispatcher methods and dispatcher cases remain at zero.
Result-sequence update and nine-slice sprite construction use labeled loops too;
shared joins remain. The initializer
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

## Native matching and score verification

[Pass 20's comparison report](FLOAT-COMPARISON-READABILITY.md) records the native
matching/scoring probe and its independent oracle. The score-popup animation
branch includes unordered progress: `!(progress >= 1.0f)` retains a NaN popup
without crediting it. The old relational spelling changed that behavior.
The raw and renamed code now match native traces for 708 controlled scenarios,
including successful matches, pool overflow, cooldowns, duplicates and tutorial
scoring. Full contact physics and asset-dependent transitions remain unverified.

## Cache-write continuation

`ic.a(byte)` seeks `af.field_b` to zero and writes 24 bytes from the packet
buffer in `eh.field_d`, when the cache handle exists. It catches `Exception`
from those two calls and their argument reads, then advances the packet offset
by 24 regardless of whether the cache was absent or the write failed. The
packet access in that following increment remains outside the inner catch;
a null packet therefore still fails. A guard other than 65 also clears
`ic.field_a` before any cache access.

The previous generated selector merely tested whether an empty arm should run.
It and its two stores are now gone, leaving the cache try/catch followed directly
by the offset update. No throwing expression crosses a protected boundary.
The existing result-helper probe independently checks file bytes, offset wrap
and guard effects in 140 native/raw/readable cases. Closed and limited files,
invalid payload offsets, null buffers, absent caches and null packets retain
their completion behavior. The nine remaining selectors route work or transfers
and still need review. Concurrent cache use, real device behavior and whole-game
behavior remain outside this probe.

## Buffered socket and platform tasks

`BufferedSocket` is the original `ba`; it owns synchronous input and a ring
buffer drained by `Runnable.run` to its output stream. `PlatformTask` is `cb`,
and `PlatformTaskDispatcher` is `d`. The dispatcher queues task records under
its monitor, executes their numeric `taskType`, writes `result`, and publishes
volatile `status`: 0 pending, 1 success, 2 failure. `next` links its FIFO;
`input`, `firstIntArgument` and `secondIntArgument` retain their type-specific
meanings. `startThread(runnable, guard, priority)` queues type 2; the socket
requests this with guard 0 and priority 3. Dispatcher service requests and
worker/constructor variables now have source-audited semantic names.

| Socket member | Behavior |
| --- | --- |
| `available(guard)` | Open input bytes available; zero once closing. Guard <=71 first nulls input. |
| `readByte(guard)` | Input read for -17422; zero once closing, otherwise -104 for invalid guard. |
| `readFully(destination, guard, destinationOffset, remainingLength)` | Repeated partial reads; EOFException on zero/negative read. Guard -97 required; closing returns without copying. |
| `enqueueWrite(guard, sourceOffset, length, source)` | Copies into lazy ring, consumes pending IOException, starts writer task once and notifies. Guard !=100 nulls output after successful copying. |
| `checkWriteFailure(guard)` | Valid guard <-79 consumes a pending writer IOException unless closing. |
| `close(guard)` | Requests shutdown, notifies, waits for task status and joins successful writer task. Guards >=-117 first call run. |

`writeInsertIndex` advances per copied byte; `writeReadIndex` advances per writer
segment modulo `bufferCapacity` (default 5000). Enqueue throws when it reaches
its 100-byte reserve boundary, after copying the boundary byte. Writer catches
write/flush IOException and sets `writeFailurePending`; it still advances the
read index after a failed write. A closing writer drains queued bytes before
closing input, output and socket in that order. An input-close IOException
skips both later closes but still releases `writeBuffer`. These are preserved
original behaviors, not repaired transport guarantees.

`closeRequested` is set under the socket holder monitor before `notifyAll`.
Close waits for nonzero volatile task status, joining the thread result only
for success. A join InterruptedException is swallowed. Null/wrong-type results
escape that catch and retain the task; an already-closing holder returns before
notification/task cleanup. Normal or interrupted completion clears `writerTask`
once. No join/cast/monitor expression moves across a handler boundary. The
original wait label and writer's live routing selector remain.

Every socket parameter and nonselector local now has a guarded name, including
contiguous write offset/length, monitor snapshots, ignored interruptions and
diagnostic-message carriers. The original `ba.*` message strings are unchanged.
Unrelated statics keep their owner: key-event queue write index, third auxiliary
vertex transformed-Y scratch, frame-clock factory and session-clear/reload.
These roles are supported by keyboard/rendering/timer/browser source evidence.

The existing result-helper probe checks 84 controlled shutdown cases using
independent state/interrupt/task/monitor oracles, plus 308 controlled socket I/O
cases using independent byte/configuration/effect oracles. The latter cover two
fake-socket constructor overloads, available/read-byte guards, partial/zero/
failing reads, pending errors, lazy allocation, ring wrap/reserve failure and
preclosed writer drain/write/flush/close failure order. Worker/publisher threads
in shutdown fixtures are bounded and checked for termination. The writer-drain
fixtures run synchronously without platform services. Native bytecode, raw and
readable traces match. Normal open-writer blocking/concurrency, real sockets,
dispatcher services, browser navigation, guard-triggered run and whole-game
behavior remain unverified. Nine routing selectors remain across the game.

## Dispatcher shutdown and preferences iteration

`PlatformTaskDispatcher.shutdown(guard)` requests worker shutdown under its
monitor and notifies, joins `workerThread`, then closes `cacheDataFile`,
`masterCacheIndexFile`, each non-null `cacheIndexFiles` entry, and `randomSeedFile`.
Each IOException is swallowed. The named `cacheIndex` advances exactly once
on null, successful-close and caught-failure paths; no update crosses a handler.
The loop remains an explicit while. Every shutdown parameter and local is named,
including the ignored failures, monitor snapshot and invalid-guard task carrier.

The previous exported for loop had both a header update and updates inside
success/catch arms, incorrectly skipping cache entries. The new native probe
checks 96 combinations: all 32 five-entry null masks and three failure masks.
Instrumented file closes prove complete order and successful-handle release;
failed close retains its holder reference. Native bytecode, refreshed raw Java
and readable Java match. The worker is unstarted; invalid guards, live worker
joins and concurrent real cache access remain outside this probe.

`openPreferencesFile(guard, cacheVariant, gameName, preferenceSuffix)` builds the
jagex preferences filename, using _rc for variant 33 and _wip for 34. Its named
`searchDirectories`, `directoryIndex` and `searchDirectory` describe the fixed
path search. Absent directories and caught open failures each advance once;
first successful open returns a limited pa holder, and exhausting search
returns null. This loop also retains while paths. Original guard division,
paths, catch carriers and filename spellings remain. Filesystem search behavior
is supported by source/native counter-shape inspection, not a new live-path test.

For-header recovery now parses and checks all paths, instead of choosing an
update from the first continue. One selected update must reach every normal or
own-continue backedge, and none may reach other exits. Additional counter writes,
shadowing, unsupported lexical/syntax cases, and updates/own continues inside
nested loops, labels, try/finally or monitor bodies refuse recovery. Unknown
completion stays explicit. All 303 files compile and all guarded bindings are
checked, but those checks alone cannot establish execution equivalence.

## Sequential early-exit guards

The earlier early-exit pass removed an else wrapper when the preceding arm
leaves on every path. When both arms leave, the shorter arm becomes the guard.
`hasPixelsAtPlayfieldBoundary` now reads as sequential cardinal checks followed
by sequential perimeter checks inside its loop. The original read order,
integer division guard and exception context remain; the 13 result carriers now
use direct true/false returns.
Nested branches with normally completing paths or consumed inner breaks keep
their control flow; blocks that declare locals keep their scopes.

Across GeoBlox this removes 2,128 else wrappers and 2,213 source lines in 208
files. Native boundary probes still verify the independent lattice oracle,
425,042 pixel checks, 18 guard cases and five invalid-raster cases per variant.
These controlled probes do not establish whole-game equivalence or phone FPS.

## Dispatcher request and worker names

All 24 dispatcher fields now have guarded names. `javaVendor` selects
`useMicrosoftVmBackend`; `javaVersion`, `osName` and `osNameLowerCase` preserve
the original property reads. `privilegedServicesEnabled` gates cache/desktop
services and bootstrap reflection restrictions. Microsoft fullscreen/cursor
adapters and reflected fullscreen/cursor adapters each retain their own field.
`networkBlockedUntilMillis` is compared against the backward-clock-corrected
millisecond clock before network task execution.

| Request API | Original task and arguments |
| --- | --- |
| `requestSocket(port, host, guard)` | Type 1; true guard first executes the original invalid display-mode request. |
| `requestSocketInternal(guard, port, useProxy, host)` | Type 1 or proxy type 22; nonzero guard first nulls cache data. |
| `requestUrlStream(guard, url)` | Type 4; guard -14 required. |
| `requestDisplayModes(guard)` | Type 5; guard 34 avoids the original preferences-search side effect. |
| `requestEnterFullscreen(height, guard, refreshRate, bitDepth, width)` | Type 6; guard -1743550128 required; original width/height and bitDepth/refresh packing remains. |
| `requestExitFullscreen(frame, guard)` | Type 7; guard 0 required. |
| `requestDeclaredMethod(methodName, guard, parameterTypes, targetClass)` | Type 8; guard >=-118 clears reflected fullscreen backend before queuing. |
| `requestDeclaredField(targetClass, guard, fieldName)` | Type 9; nonzero guard clears Microsoft fullscreen backend before queuing. |

`hasFullscreenSupport(guard)` checks enabled services and the chosen non-null
backend for guard -26098. The worker removes `task` under
`dispatcherOrTaskMonitor`, then executes `taskType` outside that monitor. Its
reused `cursorXOrVisibleFlag` names both actual roles. Reflection argument tuples,
clipboard objects, fullscreen frame, preference file, URL whitelist/index and
proxy failure now describe their source uses. Success publishes status 1; caught
Throwable publishes status 2. ThreadDeath rethrows before completion notification.
The new names preserve handlers and monitor scope; they add no worker-service
native coverage. All non-generated dispatcher parameters/locals are named;
other classes and shared joins remain partly opaque.

## Gameplay tick and motion variables

`updateSession(methodGuard)` now names its preincrement panel tick and negative/
positive rotation key codes. Debug toggles name the Boolean value to be stored. The reproducible decompiler
cleanup removes 19 unread owner/target snapshots and their pure this/null stores
from this method; the live Boolean values and handler boundaries remain. One
Boolean still carries detached-entity state before the positive-rotation key
state. The final integer comparison carriers still switch from debug key values
to pointer-event complement/sentinel values. `inputDerivedModuloIndex` describes
the shared modulo8/5 input-derived index without assigning an unsupported game
mechanic to its bookkeeping branches. Full session-tick execution is unverified.

`moveEntitiesAndCollectContacts` names the current/other moving entity, inward
center offsets, normalized averaged velocity, outward-distance comparisons and
midpoint direction scale. `sharedVelocityXOrCrossProduct` and
`sharedVelocityYOrDirectionScale` preserve their reused meanings. Its integer
`neighborIndexOrKindFlagOrContactIdOrDivisionGuard` is reused across attachment,
moving contact and final arithmetic guard paths. The new names help follow these
paths; splitting the reused declarations would require a later proven generic
decompiler transformation. Actual contact production remains source-audited.

`updateAttachedEntities` uses `maximumEntityRadiusSquared`, not a radius. Every
member loses one cooldown tick; a zero crossing marks contact state dirty.
Only queue-null members advance animation and contribute to the squared maximum.
Kind3 avatar contacts with nonpositive cooldown set the shock flag, and squared
thresholds10000/25600 select feedback0/1/2. This producer is source-audited.

The entity constructor keeps supplied raw velocity. `initializeEntityMotion`
normalizes it to `entityMotionSpeed`, including the original NaN behavior for
zero velocity. Its arithmetic sentinel runs after position, lifetime, category,
kind and velocity writes, before clearing counters/animation/queue/flags. A bad
guard therefore retains those partial writes. Two float arguments in both APIs
have no reads and are named `unusedFloatArgument1/2`. Ordinary kind selects its
category/variant sprite; kind2 selects the amorphous frame and sets category -1.
Successful reset clears active neighbor count while retaining old array slots.

`rotateEntityAroundBoard` rotates about (320,240), then points velocity inward and
normalizes only above the original squared-speed threshold. Kind2 retains its
sprite angle; other kinds subtract the rotation delta. `integrateEntityVelocity`
adds both velocity components before the invalid-guard variant-count side effect.
`resetAvatarFeedbackState(initialFrameIndex)` names the helper used by the session
constructor; the remaining reset writes and caller values are unchanged.

The existing gameplay probe adds independent constructor/integration/rotation/
initialization oracles for 4,500 cases and compares the separately pinned trace
against native bytecode, raw Java and readable Java. This includes partial guard
failures and non-finite arithmetic; it adds no real-asset or whole-game claim.

## Keyboard and pointer input

`KeyboardInputListener` (`wl`) translates AWT key codes through
`oe.awtKeyCodeToInternalCode`. Press/release callbacks reset `nk.keyboardIdleTicks`
and enqueue positive press or complemented release values in
`gf.queuedKeyStateChanges`. `ii.keyStateWriteIndexOrResetSentinel` becomes -1 on
overflow or focus loss. `re.updateKeyboardStateForFrame` replays changes into
`kj.heldInternalKeys`, or clears all 112 held flags on reset. It advances the
frame event fence from `pc.keyboardEventFrameEndIndex` to
`BufferedSocket.keyEventWriteIndex`, first setting the read cursor to the
previous fence. Unpolled events in the preceding frame are therefore discarded.

A separate 128-slot queue pairs `kj.queuedKeyboardEventCodes` with
`ai.queuedKeyboardEventCharacters`. Presses store an internal code and character
zero; typed characters store code -1. A full queue drops new events.
`hh.pollKeyboardEvent` reads only up to the captured frame fence, publishes
`ki.currentKeyboardEventCode` and `te.currentKeyboardEventCharacter`, then wraps
`vd.keyboardEventReadIndex`. Empty/invalid-guard polls retain the previous payload.
The poll holds `je.keyboardListener` as its monitor; keyTyped retains the original
unsynchronized method. Gameplay reads held keys for rotation/fast-forward and
polls queued events for tutorial, exit and debug actions. Numeric codes retain
their original mapping; `jg.swapRotationControlsKeyCode` defaults to 35 and is
loaded from preference byte zero.

`PointerInputListener` (`le`) writes live pointer position in
`lj.livePointerX`/`eg.livePointerY` and press position in
`ah.livePointerPressX`/`hi.livePointerPressY`. Press button 2 means right button;
other presses use 1. Releases/focus loss clear `s.liveHeldPointerButton`; focus
loss retains pending press/activity state. Motion/enter/exit/press/release reset
`GameplaySession.pointerIdleTicks` and mark `fc.pointerActivityPending`.
Exit uses position (-1,-1). Popup press/release/click events are consumed.

`mc.snapshotPointerInput` copies these fields under `pg.pointerListener` into
position, press position/button, held-button and activity snapshots, then clears
pending press/activity. A second snapshot retains held-button/position state but
has no new press or activity. The session debug-spawn/tutorial handlers use
press snapshots; hovering and menu hit testing use position snapshots. The
native input matrix checks 2,184 controlled callback/queue cases. Real concurrent
AWT delivery, browser key mapping and full session execution remain unverified.
The listener classes retain unrelated static helper methods.

## Collision masks and pointer spawning

`PixelOverlapProbe.findFirstNonzeroPixelOverlap` (`aa.a`) adds each sprite's
crop trims to its origin, intersects cropped width/height bounds and scans
shared rows left to right. Both pixel values must be nonzero, including negative
values; no alpha/color interpretation is inferred. On the first hit it stores
world coordinates in `firstOverlapX`/`firstOverlapY` and returns true. A miss
returns false and retains the previous output coordinates. It never writes to
the input buffers. `overlapRightThenWidth` and `overlapBottomThenHeight` retain
their original reused roles instead of introducing new declarations.

`gf.renderEntityCollisionSprite` (`gf.a(Lja;IF)V`) rotates the entity position
around (320,240) into `ng.rotatedEntityScreenX`/`td.rotatedEntityScreenY`, renders
the entity sprite into `vf.spriteScratchRaster` with nearest rotation, then
restores the display raster. This renderer remains supported by source inspection.
`uj.scratchSpriteOverlapsBoard` centers the scratch raster at those coordinates
and compares it with `bk.boardOwnershipRaster`; a nonzero method guard returns
false. Its entity/angle parameters are used only in diagnostic wrapping.
`ma.contactProbeOverlapsScratchSprite` subtracts contact-probe offsets before
comparing the probe against the scratch raster. The moving-contact producer
uses the resulting probe coordinates to read the entity ID minus one.

`nb.spawnEntityAtPointer` accepts guard -28195, then removes the available pool's
last entity. Empty pools and other guards return immediately. It inverse-rotates
the integer pointer about (320,240), truncates both coordinates and initializes
velocity toward the center. Ordinary mode uses kind0 with the supplied category
and variant. Special mode maps `(categoryId + variantId) % 4` to kinds2/4/3/1;
kind2 retains its variant, kind1 retains its category, and the existing sprite
selector clears the other keys to -1. Equivalent argument joins now share the
original captured values, removing 15 intermediate locals. The remaining
variant/category joins preserve selection and evaluation order. The spawned entity's queue flag
is cleared before appending it to `ji.movingEntities`. Center spawning retains
the original NaN velocity behavior.

`ScorePopup.setAvatarNegativeRotationSteering` stores direction1;
`SecondaryDeque.setAvatarPositiveRotationSteering` stores direction2;
`jj.clearAvatarSteering` stores direction0. Original invalid-guard side effects
remain. The new native matrix independently checks 11,227 raster, wrapper,
controlled pool/spawn and steering cases, alongside unchanged earlier traces.
It does not establish full moving-contact production, live assets, malformed
buffer/overflow behavior or whole-game equivalence.


## Equivalent joins and the remaining control flow

The current generic reconstruction resolves aliases before checking later joins.
A value copied through two earlier carriers can therefore remain one captured
value when those paths meet. `nb.spawnEntityAtPointer` retains its argument
snapshots before variant/category selection, but no longer repeats them through
15 additional declarations. The selected variant/category still differ by path
and remain explicit. Other methods benefit from the same proof, including
caught-failure diagnostic builders. Original diagnostic strings stay unchanged.

This removes 1,075 generated declarations and 5,071 lines across 176 raw files;
53 obsolete naming rules retire and 132 guarded local ordinals migrate. The
reverse dictionary records every surviving original identity. Unknown names,
shared joins with different values and large structured methods remain. The
native matrices cover their controlled scopes, not complete gameplay/assets.

## Primitive selections and safe alias substitution (pass 52)

`nb.spawnEntityAtPointer` now expresses kind-dependent variant selection as
`selectedVariantId = (spriteKindId != 2) ? -1 : variantId;`. The selected kind,
board coordinates and velocities are still captured at their original points.
The genuinely different category join stays explicit. `PixelOverlapProbe`
selects positive clipping offsets in two conditional assignments. All original
numeric guards and first-overlap ordering remain.

The generic parser recognizes explicit qualified type arguments, allowing
`PlatformTaskDispatcher.run` to use a `for` loop for its allowed URL characters.
It preserves the generic failure call, catch boundary and counter observations.
The improved parser also preserves the socket method's existing carrier cleanup.
Alias substitution now edits identifier tokens only after complete scope checks;
literal diagnostic strings and member/method/type names are preserved.

This pass simplifies 12 primitive selections, removes 50 source lines across
eight raw files, and retains all declarations. Fourteen naming-map ordinals
migrate without changing semantic names. Native fixtures and reproducible source
checks cover their stated scopes; full URL-launch services, successful archive
loading, live contact production, full gameplay and device performance remain
unverified.

## Raster targets and nine-slice panels (pass 53)

`AwtRasterBuffer` owns `width`, `height`, `pixels` and the AWT `image` presented
to the canvas. `setAsRasterTarget` reinstalls that pixel array and dimensions in
`SoftwareRasterizer`. Game rendering temporarily targets scratch sprites,
board masks and scene rasters, then calls
`sh.mainRasterBuffer.setAsRasterTarget(...)` to resume canvas rendering.

`fk.createCanvasRasterBuffer` reflectively constructs the BufferedImage-backed
implementation `ve`, calling `initialize(height, component, width, guard)`.
It shares its integer pixels through `pixelDataBuffer`, `rgbColorModel` and
`imageRaster`, and keeps the component as `imageObserverComponent`. The factory
catches failure to construct it and creates `ImageProducerRasterBuffer` instead.
The latter sends pixels to its consumer under synchronization before `drawImage`.
The reflective name `ve` is deliberately preserved; API callback names and all
original guard, exception, preparation and publication ordering remain.

`ma.drawNineSlicePanel(panelTop, panelLeft, panelHeight, guard, panelWidth,
nineSliceSprites)` draws row-major slots:

| Slot | Region |
| --- | --- |
| 0 / 1 / 2 | Top-left corner / top edge / top-right corner |
| 3 / 4 / 5 | Left edge / center / right edge |
| 6 / 7 / 8 | Bottom-left corner / bottom edge / bottom-right corner |

`centerTileLeft/Right/Top/Bottom` retain the original edge offsets used to place
tiles. `centerClipLeft/Right/Top/Bottom` can meet at a proportional split when
opposing borders exceed the panel size. These are distinct: clipping is adjusted
while tile placement retains its raw bounds. `edgeTileCoordinateOrCenterY` is
reused for horizontal edges, vertical edges and center rows; `centerTileX`
steps through center columns. `hd.nineSliceSavedClip` saves the shared clip
before each nonempty region and restores it after that region draws normally.
There is no invented finally cleanup on failure.

The existing nine-slice native fixture checks construction of the nine sprites;
it does not execute this panel renderer or AWT presentation. The new names are
supported by source and complete resolved-binding checks. Live assets, actual
presentation, full gameplay and phone performance remain unverified.

## Session rendering stages (pass 54)

`GameplaySession.renderSession` preserves its existing control flow. On ordinary
zero-client-guard paths, its rendering stages are:

| Stage | Named work |
| --- | --- |
| Unloaded theme | Select `themeResourceGroup`, format archive progress and draw the loading panel, then return |
| Board cache | Redraw attached entities when `boardRasterDirty`; settled/requested/in-progress state supplies `sceneTransitionFlag` |
| Main target | Restore `mainRasterBuffer`, draw the selected background and tutorial/score panels |
| Gameplay layers | Draw progress HUD, moving entities, cached board, avatar face/cry frame and transient entities under their original gates |
| Theme foreground | Rotate the foreground into its scratch raster and draw it around the board center |
| Spawn queue | Draw the queued-entity highlight and each fading queued entity |
| Optional debug overview | Draw half-size queue/layout silhouettes into `debugOverviewRaster`, blur them, then scale/composite onto the main raster |
| Overlays | Draw points, counters, score popups, game-over/transition/result overlays and pending-action panel; tutorial mode instead draws its prompt |

This describes the readable normal path; original nonzero client-control guards
and their nested labeled routing remain present. The result transition can
reveal the board behind the curtain using `sceneTransitionFlag`, and the score
box follows its original quadratic path during the game-over animation.

Some locals have several roles. `selectedThemeIdOrScoreBoxX` first selects a
loading-resource group, then carries the score-box X position.
`loadingPanelWidthOrScoreBoxY` similarly carries a loading-panel width and a
score-box Y position. `tutorialTopOrDebugColorOrTransitionClipTop` describes
three actual uses of one integer slot. `debugEntityXOrTutorialTextHeight`
retains the debug-circle X coordinate and later tutorial text-height use.
No split variables or inferred lifetime changes are introduced.

`spawnEntityGrayLevel` is repeated in RGB channels for a solid debug circle;
it is not an alpha parameter. Its normal path clamps to11..255 after the
lifetime calculation. The shared join slots then change roles from gray-level
comparison operands to composite height/enabled operands; those explicit stores
remain, including the nonzero client-guard paths.

`h.drawMovingEntities` traverses `movingEntities` and calls the entity's board
rotation renderer. `ni.drawTransientEntities` traverses `bh.transientEntities`
and draws on the current raster. Matching routes temporary kinds into that
queue; their existing animation/recycling logic remains.
`ij.drawAvatarFaceOrCryFrame` draws the shock star, tinted eyes/mouth or selected
`currentAvatarCryFrame`. `uh.drawSpawnQueueAndHighlight` rotates the first queued
entity's position, draws a circular/spiral highlight, then draws the whole queue.

`gf.preparePendingActionPanel` sizes the panel from `achievementTitles`, resets
its top position and retains the original minimum height. `vc.drawPendingActionPanel`
uses the same geometry and action ID for the title and quarter-size icon.
`gf.formatArchiveGroupProgress` returns the original fallback when the archive
query is false, otherwise formats the label, group percentage and percent sign.
It makes no new assumption about actual archive completion.

The debug overview is a distinct composite, not an ordinary sprite copy.
`SoftwareRasterizer.blurRasterRegion` applies row then column box averaging.
`ek.compositeScaledDebugOverview` retains Q16 scale/trim/clip calculations.
`lc.blendScaledDebugOverviewPixels` skips zero source or destination pixels,
then mixes a0x112233 tint with per-channel products using source mean gray as
weights. Its destination gray starts as `((2*red + blue)/3 + green) >> 1`.
Packed masks, shifts, overflow and shared row-reset slots remain literal.
Pass 55 names every blur-kernel parameter/local and the three channel caches.
The kernels remain large, but their window phases and captured values now have
explicit roles; the control flow is unchanged.

These roles are supported by source and complete resolved-binding checks.
Existing native fixtures retain their documented scopes; full renderSession,
debug blending/blur, live panels/assets, AWT presentation, sustained gameplay
and phone performance remain unverified.

## In-place blur windows (pass 55)

`SoftwareRasterizer.blurRasterRegion` runs `blurRowsInPlace` and then
`blurColumnsInPlace` over the same pixels. Each kernel initializes a clipped
window, writes its first output, grows the window at the leading edge, slides
its full middle window, then shrinks the trailing edge. Edge outputs divide by
`windowSampleCount`; middle outputs multiply by `reciprocalWindowScaleQ14`
and shift by 14. Their truncation and clamp details remain literal.

| Role | Row kernel | Column kernel |
| --- | --- | --- |
| Window cursor reused for output | `windowXOrNegativeOutputCounter` | `initialWindowRowOrNegativeOutputCounter` |
| Phase limits | `growingWindowEndCounter`, `fullWindowEndCounter` | `columnIndexOrWindowEndCounter`, also reused as an initial column index |
| Entering/leaving reads | `enteringPixelIndex`, `leavingPixelIndex` | Same names, with row skipping |
| Accumulated channels | `runningRedSum`, `runningGreenSum`, `runningBlueSum` | `blurColumnRedSums`, `blurColumnGreenSums`, `blurColumnBlueSums` caches |
| Reused channel slot | Separate sums and outputs | `channelSumAfterRemovalOrOutputRed` holds red, green and blue subtraction results before serving as output red |

The column caches are allocated together when the red cache is absent or too
short, then cleared over `regionWidth`. `redSumsSnapshot`, `redSumsForwarded`
and `redSumsForUpdates` all refer to that same red array; the other channels have
matching aliases. The `*ForClampedStore` arrays and columns capture store targets
before the nonnegative channel result is selected. The aliases and captured
indices remain separate because this pass changes names only.

Entering and leaving reads use the pixel array that the kernels also overwrite.
This is the original in-place algorithm; replacing it with a convolution over a
separate source snapshot would require a behavior change. Initial overshoot,
clipRight/clipBottom gates, asymmetric clamp locations, integer overflow,
division and increment snapshots retain their original order. The source and
complete binding checks support these roles. Existing native fixtures do not
execute the blur kernels; live debug rendering and device behavior remain
unverified.

## Raster primitive geometry (pass 56)

Every field, method, parameter and local in `SoftwareRasterizer` now has a
guarded semantic name. The raster class still has large labeled methods;
this pass changes their identifiers without changing their control flow.

`fillCircle` and `fillCircleAlpha` initialize `clippedTop` and
`clippedBottomExclusive`, then walk `rowY` with an evolving `xExtent` and
`yOffset`. At their geometry comparisons, `xAdjustedSquaredDistance` tracks
`xExtent*(xExtent-1)+yOffset*yOffset` and `yAdjustedSquaredDistance` tracks
`xExtent*xExtent+yOffset*(yOffset-1)`, with the original integer arithmetic.
Upper spans exclude `spanRightExclusiveOrInclusive`; lower spans include it.
The original `centerY` parameter is also capped by the bottom limit. Alpha0
returns immediately and alpha256 delegates to `fillCircle`. Other alpha
values retain source/destination channel weights and eight-bit shifts.

`fillRoundedRectangle` uses the same two distance estimates around each corner,
with `horizontalCenterGap` extending the spans across the rectangle. It fills
the upper corners, middle band and lower corners in order.
`topCornerCenterYOrUpperHalfEnd` retains the original clipped reuse of the
corner center. `spanXOrMiddleRowSkip` first walks upper-span X coordinates,
then holds the middle band's destination row skip, then walks lower-span X.
`middleSpanX` remains its separate middle-band loop variable.

`drawCircle` and `drawRoundedRectangle` keep distinct paths for entirely
contained geometry and individually clipped pixels. `arcMajorOffset` shrinks
while `arcMinorOffset` grows. The circle keeps four evolving row centers and
the rounded rectangle keeps eight; the row-center names distinguish outer
major-offset rows from inner minor-offset rows. Their one adjusted estimate
tracks `major*(major-1)+minor*minor`. The circle still overwrites its original
`radius` parameter with the squared radius.

`drawLine` chooses the dominant axis and steps the other axis using
`minorAxisStepQ16`, rounded with `Math.floor(ratio+0.5)`. Its original start/end
parameters become deltas, Q16 accumulators and inclusive bounds as before.
`fillVerticalGradient` uses `gradientPositionQ16`/`gradientStepQ16` and adjusts
the position when clipping top rows. Alpha lines and rectangles expose their
source/destination weights; `grayscaleRectangle` retains the original
`((2*red+blue)/3+green)>>1` weighting. `clearFramebuffer` clears eight pixels
per iteration, then changes `unrolledThresholdOrPixelCount` into the full
pixel count for its tail loop.

`scanlineMaskStarts` and `scanlineMaskWidths` are optional per-row glyph masks.
The `bg` masked drawing kernel indexes them by Y relative to `clipTop` and
compares starts to X relative to `clipLeft`. Clip changes and raster release
clear both arrays. No non-null assignment appears in the exported game;
external mask population and actual masked glyph rendering remain unverified.
Source inspection and complete binding/reversal checks support these names.
Existing native probes retain their original scopes; no full raster, real-asset,
whole-game or device-performance claim is added.

## Font layout and glyph rendering (pass 57)

`BitmapFont` is the shared font layout/style base. `MonochromeBitmapFont`
implements binary mask glyph drawing: a nonzero byte draws the supplied color,
while zero advances without writing. The other two renderers retain their
original palette/coverage internals, but their `drawGlyph`/`drawGlyphAlpha`
method and parameter contracts now match the base. `shadowPass` stays in the
contract, including implementations that do not read it.

| API or data | Role |
| --- | --- |
| `glyphAdvances`, X/Y offsets, widths/heights | Advance the pen and position each glyph mask |
| `lineAdvance`, `maxAscent`, `maxDescent`, `capitalXAscent` | Baseline spacing, glyph vertical bounds and baseline-to-capital-X-top distance |
| `decodeFontMetrics` | Read compact advances or extended signed cumulative edge profiles |
| `computePairKerning`, `pairKerning` | Find the minimum overlapping trailing/leading profile gap and store its negation for each glyph pair |
| `measureTextWidth`, `measureCharacterAdvance` | Measure encoded glyph advances and relevant inline-image/kerning contributions |
| `wrapText`, `countWrappedLines`, `measureMaximumWrappedWidth`, `measureWrappedHeight` | Split at explicit breaks or supported space/hyphen opportunities and derive wrapped dimensions |
| `drawText`, `drawCenteredText`, `drawRightAlignedText` | Reset opaque text style and place one styled line |
| `drawParagraph`, `drawParagraphAlpha` | Wrap and align lines within the supplied rectangle |
| `setInlineImages` | Supply images and optional baseline offsets for img tags |

The compact metric form has257 bytes:256 glyph advances and one line advance.
Extended metrics read profile lengths/offsets, then leading and trailing edge
profiles accumulated through signed bytes. Allocated, forwarded and update
aliases remain separate declarations. Kerning omits space32 and nonbreaking
space160 pairs; the space profile supplies line advance. Constructors derive
vertical extents from glyph offsets/heights. Overflow and empty/malformed input
behavior remain as in the original source.

Text style is static shared state across font instances. Named fields distinguish
default/current color, shadow and alpha; underline/strikethrough colors use-1
for disabled decoration. `applyStyleTag` handles the original col/trans/str/u/shad
and closing tags; br resets style. `prepareJustification` counts spaces outside
tags and uses Q8 expansion/remainder. Paragraph vertical alignment retains its
extra-gap/line-index shared slot. The text drawing baseline parameter becomes
the line-top coordinate before glyph offsets are applied.

Inline images contribute full width and draw relative to their chosen baseline
offset. Caught image/tag errors retain their carriers and original handling.
`wrapText` preserves lowercased tag spelling, br placement, space/hyphen trim
rules and the original euro previous-character assignment8364. These names do
not normalize parser quirks or fix potentially malformed-input behavior.

`MonochromeBitmapFont` clips glyph rectangles with independent source and
destination offsets/row skips. `blitGlyphMask` writes in groups of four and a
tail; its width parameter becomes a negative tail count. `blitGlyphMaskAlpha`
weights the source packed RGB, then reuses alpha as the destination weight.
`blitGlyphThroughScanlineMask` clips against the clip-relative starts/widths;
its `unusedDestinationPixels` argument remains unused and writes target
`SoftwareRasterizer.framebuffer`. Captured read/write indices and all branches
remain. Every declaration in the font base and monochrome renderer is named,
but large labeled tag bodies and other renderer internals remain. Complete
binding/reversal checks support the naming pass; existing native probes do not
newly exercise fonts. Actual font/image assets, whole-game rendering and phone
performance remain unverified.

## Palette and coverage font details (pass 58)

The remaining renderers now read `PaletteBitmapFont` and `CoverageBitmapFont`.
Every field, method, parameter and local in these classes, `BitmapFont` and
`MonochromeBitmapFont` has a guarded semantic name. The palette/coverage
internals described as opaque in pass57 are now named; large labeled text
methods and other support code still remain.

`PaletteBitmapFont` stores `glyphPaletteIndices` and four `colorPalettes` slots,
initially installing the supplied palette only at slot0. In a normal glyph,
`color` selects the palette slot. In a shadow pass it is an RGB color passed to
the monochrome mask kernel. `blitPaletteGlyph` draws groups of four and a tail;
`blitPaletteGlyphAlpha` weights the selected palette color against the existing
pixel. Both preserve the signed byte snapshots and mask indices with255 at
lookup, with byte0 transparent.

`findNearestBasePaletteIndex` searches palette0 through `findNearestPaletteIndex`.
The search begins at index1, keeps the earliest strictly better candidate and
returns0 when none replaces the initial result. Its red difference uses
`(candidateColor >> 16) - (targetColor >> 16)` without masking; green and blue
are masked to eight bits. Squared distances retain their original overflow.
These names do not assume alpha-packed colors are normalized.

`CoverageBitmapFont` calls `convertPaletteGlyphsToCoverageInPlace` after the
base metrics constructor. It replaces each supplied palette entry with
`((2*red+blue)/3+green)>>1`, then rewrites nonzero glyph bytes through that palette.
The constructor conversion directly indexes by a signed byte; it does not add
an unsigned mask. It mutates and returns the original glyph arrays and also
mutates the supplied palette. `paletteColorOrGlyphIndex` exposes the original
shared slot between those loops. Existing signed-index failures and aliasing
are preserved.

`blitCoverageGlyph` reads each byte unsigned, uses it as the source weight and
then reuses the local for256-coverage. `blitCoverageGlyphAlpha` first computes
`(coverage*alpha256)>>8`; zero effective alpha skips the write. Its local then
becomes the destination weight. Coverage255 remains a255/256 blend in the
ordinary kernel. Source and destination packed channels keep separate masked
shifts and additions; no full-coverage shortcut, clamping or rounding change
is introduced. Shadow paths still delegate to monochrome mask blitting.

Source inspection, complete binding checks and byte-exact dictionary reversal
support this naming pass. Existing native probes retain their original scopes
and do not newly execute the fonts. Actual palette/font assets, image tags,
whole-game rendering and device performance remain unverified.

## Decoded sprite ownership and font factories (pass 59)

The graphics loading path uses shared working fields whose original holders
are spread across unrelated classes. Their names now expose the data rather
than implying that they belong to gameplay or UI state.

| Shared field | Meaning |
| --- | --- |
| `decodedSpriteCount` | Number of entries in the decoded sheet |
| `decodedSpriteCanvasWidth` / `decodedSpriteCanvasHeight` | Logical canvas dimensions shared by the sheet |
| `decodedSpriteXOffsets` / `decodedSpriteYOffsets` | Per-entry crop offsets |
| `decodedSpriteWidths` / `decodedSpriteHeights` | Per-entry stored pixel dimensions |
| `decodedSpritePalette` | RGB palette, with index0 left zero and nonzero entries decoding to black changed to1 |
| `decodedSpriteIndices` | Per-entry palette-index planes |
| `decodedSpriteAlpha` | Per-entry allocated alpha planes |
| `decodedSpriteHasNonOpaqueAlpha` | True when an explicit alpha plane has at least one byte other than255 |

`IntrusiveNode.decodeSpriteSheet` reads the sprite count at the end, then canvas
and crop metadata preceding it and the palette before that. It resets the
buffer cursor to0 for pixel data. `spriteDataBufferAlias` is the same object as
`spriteDataBuffer`, so metadata and pixel reads share its mutable cursor.
Storage flag bit0 selects column-major rather than linear row-major order;
bit1 adds alpha reads. The column-major path writes into row-major pixel
indices. Captured alpha bytes and flag-merging carriers remain explicit.
An alpha plane is allocated even without alpha data, but absent alpha leaves
the nonopaque flag false.

`mf.decodeSpritesFromArchive` reads the graphics file before its guard check,
returns false for a guard below102 or missing bytes, and otherwise decodes with
readGuard=true. `loadPaletteFontById`, `loadCoverageFontById` and
`loadMonochromeFontById` decode glyph graphics before obtaining metric bytes
using the same group/file IDs in the other archive. Named loaders resolve IDs
through the graphics archive first. Existing `loadPaletteFont`/`loadBitmapFont`
APIs stay unchanged; `TextInputValidator.loadCoverageFont` names the equivalent
coverage lookup. Guards, sentinel arithmetic and failure descriptions retain
their original order.

The three `build*FontFromDecodedSprites` factories return null for missing
metric bytes without clearing decoded working arrays. Successful constructors
keep the arrays they need, then call `kj.clearDecodedSpriteWorkingArrays(true)`.
Coverage construction still mutates the supplied palette/index data in place.
Constructor failures retain the original partially populated/retained state;
this pass adds no finally cleanup. The coverage factory's optional null-metrics
recursive guard call remains explicit.

`clearDecodedSpriteWorkingArrays` always clears Y offsets. With a true argument
it also clears heights, index planes, widths, X offsets and palette. It does
**not** clear decoded alpha planes, nonopaque flags, count or canvas dimensions.
The names describe the existing ownership and partial cleanup; no memory-release
change or complete decoded-state release is claimed.

| Builder | Output behavior |
| --- | --- |
| `buildSpritesWithDecodedAlpha` | RGB Sprite when the nonopaque flag is false; ARGB Sprite otherwise, combining decoded alpha shifted24 with palette RGB |
| `buildRgbSpritesFromDecodedSheet` | Convert all palette-index planes to RGB, ignoring alpha |
| `buildIndexedSpritesFromDecodedSheet` | Retain index/palette references; begin at the supplied firstSpriteIndex and leave earlier output entries null |
| `buildFirstRgbSpriteFromDecodedSheet` | Convert only entry0 to RGB |
| `buildFirstIndexedSpriteFromDecodedSheet` | Retain entry0's index/palette references |

Each builder preserves its original guard effects and cleanup point. The ARGB
path retains unused/forwarded alpha aliases and pixel-array snapshots; entry
guard reads remain even when their captured value is unused. Source inspection,
complete binding checks and byte-exact reversal support the names. Existing
native probes retain their original scopes and do not newly execute this sheet,
archive, font-factory or sprite-builder path. Actual assets, whole rendering/
gameplay and device performance remain unverified.

## Byte-array storage and readers (pass 60)

`ByteArrayBuffer` replaces the opaque `qc` name. Its `bytes` field is shared
backing storage and `position` is the mutable read/write cursor, not a checked
length. The capacity constructor uses the original byte-array pool; the array
constructor retains the supplied reference, including null. `pk` still inherits
this storage base. Crypto/hash state and unrelated static helpers remain here
with their original opaque names.

| Reader | Successful read with its expected guard |
| --- | --- |
| `readSignedByte` / `readUnsignedByte` | One byte, signed or masked with255 |
| `readUnsignedShortBE` | Two unsigned bytes, big-endian |
| `readUnsignedMediumBE` | Three unsigned bytes, big-endian |
| `readIntBE` | Four bytes forming a signed int |
| `readLongBE` | Two masked32-bit words, high word shifted32 |
| `readVariableIntBE` | Seven-bit groups, most-significant group first; negative signed bytes continue the scan |
| `readUnsignedShortOrInt` | Leading bit0 selects BE16; leading bit1 selects BE32 masked with0x7fffffff, without consuming a separate prefix |
| `readSignedSmart` | Leading unsigned byte<128: one byte minus64; otherwise BE16 minus49152 |
| `readUnsignedSmart` | Leading unsigned byte<128: one byte; otherwise BE16 minus32768 |
| `readNullTerminatedText` | Consume through zero and decode the preceding slice with the existing client character mapping |
| `readNullableNullTerminatedText` | A leading zero consumes one byte and returns null; otherwise use the ordinary text reader |
| `readZeroPrefixedNullTerminatedText` | Consume and require a zero prefix, then read null-terminated text |

These APIs preserve obfuscation guards. `readUnsignedShortBE(false)` advances
by2 then returns58 without an array read. `readIntBE` advances by4 before
returning62 for guards>=-25. `readUnsignedShortOrInt` returns95 for guard!=-27
without advancing; `readUnsignedSmart` similarly returns3 for guard!=1.
The signed smart reader evaluates its sentinel remainder before peeking and
can fail there. The long reader retains its table-clearing guard between words.

Other invalid guards can backpatch bytes, invoke the RSA helper or load a sprite
before reading; they are not merely unused arguments. Individual byte reads
advance before array access, so failure can leave an advanced cursor. Empty
ordinary text and a nullable zero marker return before their guard side effects.
Nonempty ordinary text retains the field_i=68 guard write. Variable-length
reads retain their original int overflow and unbounded scan. Diagnostic strings
keep the original class/method spelling for reversal and trace comparison.

Every selected reader parameter and local has a guarded semantic name. All
prior complete rules and source/generator pins remain unchanged. Compilation,
full binding checks, byte-exact reproduction and dictionary reversal support
this pass. Existing native result-helper fixtures cover their original packet
cursor/storage uses; they do not newly execute these thirteen readers. Other
buffer writers/helpers, actual archives, complete gameplay and device
performance remain unfinished or unverified.

## Buffer writes, copies and checksums (pass 61)

The ordinary buffer writes now expose their width and byte order. `writeByte`,
`writeShortBE`, `writeMediumBE` and `writeIntBE` write the low8/16/24/32 bits.
`writeLong40BE`, private `writeLong56BE` and `writeLongBE` write five, seven and
eight bytes. Each per-byte store captures the old position and advances before
access; a failing store can therefore leave an advanced cursor. Guard checks
and sentinel division/remainder occur at their original points, including
between stores and after partial or complete output.

`writeVariableIntBE` emits up to five seven-bit groups, most-significant first,
using the original unsigned shifts and masks. The expression
`(value | 2097436) >>> 14` stays intact. Its final guard can append an extra
medium. `writeSignedSmart` uses one byte for [-64,63], adding64, and two bytes
for the rest of [-16384,16383], adding49152. Out-of-range input retains its
optional guard read and original `IllegalArgumentException`.

`writeBytes` copies from `sourceOffset` into the buffer; `readBytes` copies into
`destinationOffset`. They remain sequential loops, preserving overlap behavior,
endpoint overflow, per-iteration cursor changes, guard calls and diagnostic
wrapping. `padZerosToPosition` writes until an absolute end position; its guard
can read a medium afterward, even if no padding was required.

`writeNullTerminatedText(text, characterStart)` rejects any zero in the supplied
text and encodes the slice from characterStart to text.length(), then appends0.
The second argument is the start character offset passed to the shared encoder.
`writeZeroPrefixedNullTerminatedText` searches for a zero before its guard and
outside its catch. Wrong guard returns after that search; valid guard rejects
zero, writes a zero prefix, encodes all text and appends a terminator. The
client mapping, partial-write behavior and null/failure scopes remain.

`writeBase38Text` packs up to20 positions into two ten-character chunks. It
visits positions19 down to0, assigning letters2..27 case-insensitively,
digits28..37, other present characters1 and missing positions0. It writes
positions0..9 first, then10..19, using two BE56 stores. The original true guard
sets position=-109 before encoding; this unusual path remains explicit.

| Backpatch | Expected guard behavior |
| --- | --- |
| `backpatchLengthByte` | Write one byte at position-length-1 |
| `backpatchLengthShortBE` | Write BE16 at position-length-2 |
| `backpatchLengthIntBE` | Write BE32 at position-length-4 |

These expected paths leave position unchanged. False preserveHashTables clears
field_g in the short backpatcher. A nonzero guard in the int backpatcher calls
`appendCrc32(13,61)` after the high-byte store, so subsequent store indices use
the changed position. All original index expressions and truncation remain.

`oe.computeCrc32` initializes its accumulator to-1, processes
bytes[startPosition,endPosition) with low-byte lookup and unsigned shift8, then
complements it. `sb.crc32Table` is built using eight reflected0xedb88320 steps
per entry. Guard>-27 retains the original null-text helper call before computing.
`appendCrc32` returns -122 with no writes for guard<=4; otherwise it appends and
returns the checksum. `verifyTrailingCrc32` first subtracts4 from position,
computes over bytes[0,position), then reads the stored BE32. Its expected guard
restores the initial position; other guards and failures retain their original
cursor changes and helper calls.

All selected writer/copy/checksum parameters and locals, the shared CRC helper
and its lookup initializer have guarded names. Every prior complete naming rule
and source/generator pin is unchanged. Compilation, binding checks, byte-exact
reproduction and reversal support this pass; existing native fixtures retain
their original scope without new writer/CRC execution coverage. Buffer crypto,
unrelated static helpers, actual asset loading, full gameplay and device
performance remain unfinished or unverified.

## Packet bit access and byte cipher (pass 62)

`PacketBuffer` extends `ByteArrayBuffer` with private `bitPosition` and `cipher`.
Its constructors delegate the supplied storage/capacity without changing
ownership. These fields start at Java's default0/null. Unrelated static music,
connectivity and UI helpers remain on the original class; the names describe
the instance packet role.

| Packet API | Existing behavior |
| --- | --- |
| `beginBitAccess(bitsPerByte)` | Set bitPosition=bitsPerByte*position, normally using8; preserve arbitrary scale and overflow |
| `readBits(methodGuard, remainingBitCount)` | Advance bitPosition by the requested count, then collect groups MSB-first through lowBitMasks; mutate remainingBitCount as groups are exhausted |
| `endBitAccess(methodGuard)` | Set position=(bitPosition+7)/8, then clear cipher for guard!=-16989 |
| `initializeCipher(seed, finishBitAccess)` | Construct/assign the generator; true calls endBitAccess(-68), changing position and clearing the new cipher |
| `writeCipherByte(value, methodGuard)` | Store low8 bits of value+nextInt(0), then retain the guard-triggered static helper |
| `readCipherByte(methodGuard)` | Read the signed stored byte, subtract nextInt(0), mask with255; guard!=122 first sets bitPosition=-51*position |
| `readCipherBytes(methodGuard, destinationOffset, destination, length)` | Sequential subtraction/truncation, with original sentinel remainder before copying and contextual catch |

`readBits` captures the client guard and derives its byte index before testing
the method guard. Guard!=-17 returns -69 without advancing bitPosition. Valid
guard advances the bit cursor before any array read. `lowBitMasks` contains0,
low-n-bit masks for1..31, and -1 for32. Signed byte shifts, zero/invalid counts,
mask-index errors, endpoint arithmetic and partial failures remain. Ending bit
access retains signed int division rather than adding validation or replacing
negative/overflow behavior with a new rounding policy.

Cipher byte APIs advance byte position before array access and generator
consumption. This ordering matters when backing storage, destination or cipher
is invalid; aliases and partial writes remain. Wrong guards can adjust the bit
cursor, clear the cipher or call unrelated static helpers at their original
points. Literal diagnostics retain the old `pk` spelling.

`PacketByteCipher` owns separate256-word `stateWords` and `results` arrays.
The constructor copies every supplied seed word into results, then initializes;
null or seeds longer than256 keep their original partial allocation/copy failure
and wrapped diagnostics. Initialization starts eight mixing words at
-1640531527, runs four preliminary rounds, adds seed words while filling state
in eight-word blocks, then performs a second state-based mixing pass. It
produces a batch and sets `remainingResults` to256.

`generateResults` increments `generationCounter` and adds the new count to
`lastResult` before its guard call. For each state word, it xor-shifts
`accumulator` according to the low index bits, adds the128-offset state word,
then updates state and output through the original shifted/masked indirect
lookups. Updated state is visible to subsequent iterations. The method retains
all wraparound, signed/unsigned shifts, lookup masks and guard calls.

`nextInt(regenerateAtRemaining)` regenerates when remainingResults equals the
supplied threshold, normally0. It snapshots oldRemaining-1 and decrements
before reading that result slot. Results therefore come out in descending
indices; nonzero thresholds and invalid remaining counts retain their original
behavior. Constructor and other literal diagnostics keep the `ne` spelling.

Every instance declaration and constructor contract in both classes now has a
guarded semantic name. Source/binding checks, byte-exact reproduction and
reversal support this pass. Existing native cache/result fixtures use the
packet type and inherited storage/cursor; they do not newly execute these bit
or cipher routines. Static helpers, actual packet/server traffic, complete
gameplay and phone/FPS/heap behavior remain unfinished or unverified.

## Buffer crypto and Whirlpool state (pass 63)

The remaining buffer instance APIs now have explicit roles. Their names identify
source behavior; the pass changes neither algorithms nor error handling.

| Buffer API | Existing behavior |
| --- | --- |
| `encryptXteaBlocks(key, methodGuard)` | Reset position0 and encrypt positionBeforeReset/8 complete blocks; finish at the processed length |
| `decryptXteaRange(methodGuard, key, startPosition, endPosition)` | Decrypt complete blocks in the supplied range; restore the saved position only on successful loop exit |
| `replaceWithModPowResult(resultPositionGuard, modulus, exponent)` | Read the current prefix as a signed BigInteger, apply modPow, then write BE16 result length and signed result bytes at the supplied output position |

The XTEA identification follows the source's two-word shifts/additions, delta,
32 cycles and key indices, compared with the primary
[Bouncy Castle XTEA engine](https://github.com/bcgit/bc-java/blob/main/core/src/main/java/org/bouncycastle/crypto/engines/XTEAEngine.java).
The original masks7480/7701 are retained: after unsigned shift11, only mask
bits11/12 survive, selecting the same two key-index bits. Decryption starts at
0xc6ef3720, which is32*delta modulo2^32. Both paths read BE32 pairs, execute
cycles in locals, rewind8 and write the updated pair. Failed key access or a
later block leaves prior writes and the current cursor; no finally restoration
is added. Encryption leaves incomplete trailing bytes untouched and drops them
from the final cursor length. Invalid guard calls and endpoint overflow remain.

The modular-power method uses `new BigInteger(payload)` and `toByteArray()`
with their original signed encodings. The output-position argument also selects
the copy guard through xor29915; the ordinary caller supplies0. Empty/null
payloads, invalid modulus/exponent, output length truncation, partial writes and
wrapped failures retain the original behavior. No extra padding is inferred.

`WhirlpoolHash` replaces `ge` for its instance digest role. Its field layout and
table/compression structure match the
[Whirlpool authors' specification](https://www.karljapetre.com/whirlpool/whirlpool.pdf).
Static network, text and shared CRC helpers stay on the same owner with prior
names. The instance state is now explicit:

| State | Role |
| --- | --- |
| `hashWords` | Eight64-bit chaining words and final digest words |
| `blockBuffer` |64-byte block buffer, including partial-bit input and padding |
| `messageBitLength` |32-byte big-endian accumulated input bit length |
| `bufferedBitCount` / `bufferBytePosition` | Current block bit count and byte index |
| `messageWords` | Eight BE64 words loaded from the block |
| `roundKey` / `cipherState` | Per-block key schedule and cipher state |
| `roundScratch` | Reused temporary output for key and state transformations |

The shared `ByteArrayBuffer.whirlpoolTables` initializer decodes alternating
bytes from the original packed literal. It forms GF(256) multiples2/4/5/8/9
with reduction xor285, assembles each diffusion word, then rotates right8 to
create seven more tables. `whirlpoolRoundConstants` has a zero entry followed
by ten entries built from consecutive substitution bytes. Initializer locals
show the reused substitution-index/round and packed-pair/round-offset roles.
`clearWhirlpoolTables` clears constants first, then tables, preserving its
wrong-guard helper call. Other existing guards still clear either shared array.

`processBlock` captures chaining/message words, initializes roundKey from the
hash and cipherState from message xor key, then performs ten separate key/state
rounds through the shared tables. Scratch copies, round-constant insertion,
byte shifts and indirect masks remain. Chaining words become
hash xor(cipherState xor messageWords). A guard below103 returns before this
processing after the original client-guard capture.

`updateBits` retains source alignment, partial destination-byte bits and the
remainingBitCount parameter's mutation. Its methodGuard also seeds the message-
length carry and selects a compression guard; the ordinary caller supplies0.
Lookahead reads,512-bit block crossings, partial-byte storage, negative/zero
counts and contextual failures remain.

`finishDigest` appends a one bit, zero-pads, optionally processes an extra block,
copies the32-byte length and writes64 digest bytes as BE64 words. False
skipResetGuard calls `reset(-38)` before final padding, retaining its byte-index
101 side effect. Normal reset52 zeroes the length and hash words, byte0 of the
block and the cursors; it leaves the other block bytes and scratch arrays for
later overwrite. Digest completion adds no automatic reset or new reuse policy.
Aliases, partial output, original padding order and guard failures remain.

Pure helpers now read `xorLong`, `orLong`, `andLong`, `andInt` and `orInt`.
They still call the original owner and evaluate both arguments in the original
order; no operator inlining is performed. Every buffer/hash instance declaration,
table-initializer local and selected helper parameter has a guarded semantic
name. Compilation, binding checks, byte-exact reproduction and reversal support
these names. Existing native sprite/pixel/transform fixtures retain their prior
operator-consumer scope without new crypto/hash execution coverage. Real
archives/server traffic, full gameplay and device performance remain unfinished
or unverified.

## Text-byte encoding and archive-name hashing (pass 64)

The client uses one byte per UTF-16 code unit. Characters 1..127 and 160..255
map directly; 27 extended characters map to defined slots in bytes 128..159.
Unsupported code units, including zero and surrogate halves, become byte 63
(`?`). `lf.extendedTextCharacters` is the matching decoding table, with five
undefined slots. There is no surrogate joining or UTF-8 conversion.

| API | Existing behavior |
| --- | --- |
| `ByteArrayBuffer.encodeTextCharacter(character, returnEncodedByte)` | Return the mapped signed byte when true; false returns 50 after mapping |
| `hi.encodeTextSlice(text, destination, characterStart, characterEnd, destinationOffset, methodGuard)` | Compute end-start, then encode sequential charAt calls into the destination; guard other than 98 returns 52 before argument reads |
| `jf.encodeTextBytes(text, methodGuard)` | Allocate one byte per code unit and map each character; guard below 117 retains a helper call before text.length |
| `ab.hashEncodedText(methodGuard, text)` | Accumulate wrapping 31*hash plus the signed encoded byte; guard at most 42 retains the recursive null-text call |
| `bc.decodeTextSlice(decodeGuard, textBytes, offset, length)` | Skip zero bytes; decode extended slots through the shared table, using `?` for undefined entries |
| `ag.decodeTextBytes(decodeGuard, textBytes)` | Decode the whole array; guard other than 1 clears field_j before inspecting length |

Font lookup masks encoded bytes with 255 to obtain unsigned glyph indices.
Archive group/file-name lookups use `hashEncodedText` after their existing
normalization and retain signed byte contributions. Slice encoding does not
add bounds validation: negative/overflow lengths, per-character reads, aliases,
partial writes and wrapped failures keep their original order. Whole encoding
keeps its global guard snapshot outside the catch. Decoding retains allocation
before guard effects, shared array aliases and the literal bc.B/ag.B contexts.

Every parameter/local in these six APIs now has a guarded name, with every
previous complete rule unchanged. Compilation, binding checks, reproduction
and dictionary reversal support this pass. The native text fixture verifies
all-byte decoding, slice boundaries, guard effects and nested failure contexts;
it does not newly execute encoding or name hashing. Compressed text, actual
font/archive assets, complete gameplay and device performance remain unfinished
or unverified.

## Prefix-code compressed text (pass 65)

`PrefixCodeDecoder` names `qa` for its instance decoding role. The existing
static font, menu-avatar, queue and applet helpers remain on that owner; their
identities and behavior are unchanged. `decodeTree` is its only instance field.
`vj.compressedTextDecoder` is the shared reference used by the text reader.

| Contract | Existing behavior |
| --- | --- |
| `readCompressedText(buffer, guardAndDestinationOffset, maximumDecodedLength)` | Read unsigned smart length with guard+1, clamp, allocate, decode, advance the buffer by the returned consumed-byte count, then decode text bytes |
| `decodePrefixBytes(destination, sourceOffset, source, destinationPosition, methodGuard, outputLengthThenEnd)` | Walk packed tree bits, emit requested bytes, return touched source-byte count |

The reader's second argument has three roles: smart-read guard selection,
output start offset and text-decoding guard xor -103. Its observed `bk` caller
passes 0 and a maximum decoded length of 80. The inner catch converts any
Exception to literal `"Cabbage"`; Errors are not included. Smart reads can already
have advanced the cursor when allocation or decoding fails. Compressed-byte
cursor addition occurs only after successful decoder return. No rollback or
additional bounds validation is introduced.

Decoding captures the client guard before its catch. Zero output length returns
0 before evaluating `121 / ((-63 - methodGuard) / 59)` or reading either array.
Otherwise outputLengthThenEnd becomes the destination endpoint. Each source
byte is traversed from bit 7 down to bit 0. A zero edge increments treeIndex;
a one edge follows decodeTree[treeIndex]. A negative node emits byte(~nodeValue)
and restarts at root 0. Each write snapshots then increments destinationPosition
before the store. Reaching the output endpoint returns sourceIndex+1-sourceOffset,
counting a partially consumed final byte. Aliases, signed source bytes,
integer wraparound, partial output, malformed trees and literal qa.E context
remain unchanged.

The fixed source contains no decodeTree assignment or non-null assignment to
the shared decoder, and its private constructor throws Error. This pass preserves
that source; it does not reconstruct absent initialization or claim live
compressed-text support. All selected parameters/locals now have guarded names,
with every prior complete rule unchanged. Compilation, binding checks,
reproduction and reversal support these identities. Native gameplay fixtures
cover the renamed owner's existing avatar/queue consumers, without new prefix
codec execution. Real table setup, actual packets/archives, opaque helpers,
complete gameplay and device performance remain unfinished or unverified.

## Resource archive storage and lookup (pass 66)

`ResourceArchive` names the instance archive wrapper of `rh`; the static
attached-entity update and shared text helpers remain on that class. It owns a
lazy `index` from `archiveSource`, staged `packedGroups`, per-group `decodedFiles`,
a `discardPackedGroups` flag and `fileRetentionPolicy`. Successful index acquisition
allocates both top-level arrays. If allocation fails after the index assignment,
that partial state remains; subsequent index checks still observe the stored index.

| API | Existing behavior |
| --- | --- |
| `ensureIndexLoaded(methodGuard)` | Fetch metadata and allocate group/file storage lazily |
| `getGroupSlotCount(returnGuardConstant)` / `getFileSlotCount(methodGuard, groupId)` | Return sparse slot capacities, with original guard constants and unavailable values |
| `hasGroupName`, `findGroupId`, `findFileId` | Lowercase with existing locale behavior, hash signed encoded text bytes and consult name tables |
| `loadPackedGroup`, `loadGroupIfNeeded`, `loadGroupByName`, `loadAllGroups` | Stage source payloads; availability does not imply decoded files |
| `isValidGroupId` / `isValidFileId` | Check slot ranges; file validation does not independently reject sparse holes |
| `isFileAvailable` / `isNamedFileAvailable` | Report decoded entry or staged packed bytes, requesting a group if needed |
| `getFile`, `getNamedFile`, `getSingleFile` | Retrieve bytes through cache/unpack/load/retry paths and apply retention cleanup |
| `getGroupProgress`, `getGroupProgressByName`, `getLoadProgress` | Report staged groups as 100 or use source progress; aggregate only groups with actual files |

`loadAllGroups(initialSuccess)` seeds its result from the argument: false stays
false even when all groups are loaded. `getSingleFile` selects group 0 when there
is one group slot; otherwise it requires a valid group containing one file slot.
The methods retain their original unusual guards and early-return ordering.
Name lookup preserves group/file argument order, nullable failures, default-locale
lowercasing and original diagnostic strings. `findGroupId` can clear the discard
flag through its wrong guard only after finding a valid group.

`unpackGroup(requestedFileId, methodGuard, decryptionKey, groupId)` validates the
group, requires staged bytes, allocates file slots and scans actual sparse file
IDs. Already cached files return success. A supplied key with a nonzero first
four words copies packed storage before decrypting byte range [5,length); null
or all-zero keys retain the original storage path. Guard 4 is checked after
extraction/decryption. Decompression failure preserves group, key-presence,
length, checksums and index context. The discard flag clears packed storage only
after successful decompression, before file splitting.

Multi-file payloads end with a chunk-count byte and a BE32 length-delta table.
Accumulating each row reconstructs successive file chunk lengths. Ordinary
policies make a sizing pass, allocate each file, reset write positions and copy
all chunks. Policy 2 sums and copies only the requested file. Its zero-length
case returns true without storing an entry. Original aliases, table offsets,
signed overflow, malformed inputs, allocations and partial writes remain.
Several integer slots are reused for chunk/file indices, lengths and offsets;
combined local names make those role changes explicit.

| fileRetentionPolicy | Storage and successful retrieval cleanup |
| --- | --- |
| 0 | Keep decoded files through the existing storage helper; arrays up to 136 bytes can remain raw |
| 1 | Store raw files, clear the retrieved file, and clear its group slots when that group has one file slot |
| 2 | Store raw requested output, selectively split multi-file groups, then clear the decoded group on retrieval |

`discardPackedGroups` is independent of these three policies. True uses direct
source bytes during staging and discards packed data after decompression; false
uses the storage helper and retains the packed group. Small storage-helper
inputs can still be raw aliases. Successful retrieval extracts bytes before
cleanup; failures add no rollback or finally cleanup. Existing synchronized
method boundaries remain.

Every instance field/API and constructor parameter/local has a guarded name,
with all previous complete rules unchanged. Compilation, binding checks,
reproduction and reversal support this pass. The native text fixture preserves
its decoder and nested null-archive diagnostic scope; it does not execute group
unpacking, source concurrency, storage wrappers or real assets. Archive-index,
provider and compression helpers, static shared names, full gameplay and device
performance remain unfinished or unverified.

## Archive metadata and integer lookup (pass 67)

`ArchiveIndex` names `bm` for its instance metadata role. Shared static UI,
transform and packet helpers remain on that owner. Its constructor receives
packedIndexBytes, expectedCrc32 and optional expectedWhirlpoolDigest. It computes
and stores CRC before comparing; a supplied digest must have 64 bytes and is
then computed/stored/compared in ascending byte order. Only then does it parse
the compressed metadata with guard 119. Invalid inputs retain their original
partial field assignments and literal constructor diagnostics.

| Metadata | Meaning |
| --- | --- |
| groupCount / groupIds | Actual listed groups and delta-reconstructed IDs |
| groupSlotCount | Maximum group ID plus 1, including sparse holes |
| fileCounts / fileIds | Actual listed files and optional sparse ID lists |
| fileSlotCounts | Per-group maximum file ID plus 1, including holes |
| indexRevision / groupRevisions | Index and per-group revision words |
| indexCrc32 / groupCrc32 | Packed index and per-group payload checksums |
| indexWhirlpoolDigest / groupWhirlpoolDigests | Computed index digest and optional per-group 64-byte digests |
| groupNameHashes / fileNameHashes | Optional name hashes indexed by sparse IDs, with -1 holes |
| groupNameLookup / fileNameLookups | Integer-key tables mapping hashes back to slot IDs |

`decodeIndex(methodGuard, packedIndexBytes)` decompresses, accepts format 5..7,
reads revision 0 for format 5 or BE32 for 6/7, then reads flags. Bit 0 enables
name hashes; bit 1 enables group digests. Other bits remain unchecked. Formats
5/6 use unsigned BE16 counts and ID deltas; format 7 uses short-or-int. Metadata
arrays allocate in the original order. File-ID lists become null when the
actual count equals maximum ID+1, leaving ordinal IDs implicit. Wrong guard
below 109 retains the recursive null-input call after digests and before group
revisions. Integer overflow, partial arrays and repeated-parse behavior remain.

`IntKeyLookup` names `am` for its instance integer-key mapping. `keyIndexPairs`
stores keys in even positions and original input indices in odd positions.
The constructor grows a power-of-two bucket count strictly beyond
keys.length+(keys.length>>1), fills every position with -1, then inserts keys
in input order using linear probing. Lookup tests the index position for an
empty bucket, so key -1 is valid. Duplicate keys return the first matching
inserted entry. The table retains key/index values rather than the input array;
source-read order and sizing overflow are unchanged.

`findIndex(preserveUnachievedSprite, key)` starts at key&bucketMask, returns -1
at an empty index, matches the key or advances (bucket+1)&bucketMask. False
first clears the existing unachievedSprite global. Other static archive
creation/raster/UI helpers remain on the same owner with their previous names.
The complete sparse name-hash arrays, including -1 holes, still feed this table.

`ArchiveSource` names `nh` for its abstract provider role. All three contracts
match `bj` overrides and keep their existing guards:

| Source API | Existing provider behavior |
| --- | --- |
| getIndex(methodGuard) | Return cached metadata or poll an index request; validate, retry and optionally persist bytes |
| getPackedGroup(methodGuard, groupId) | Obtain a group request, read its bytes and unlink it before wrong-guard background work |
| getGroupProgress(methodGuard, groupId) | Query the request cache before guard checking; return request progress or 0, with guard <125 returning -119 |

Disk index requests compare indexRevision to the expected revision after
constructor CRC/digest validation. Network index requests retain CRC/digest
validation and their original retry/reset and queued disk-write paths; this
method adds no expected-revision comparison to that branch. Incomplete requests
return null. Clearing the completed request and allocating group-state storage
retain their original order. Private provider fields/requests/helpers remain
opaque pending the next pass.

`gg.computePrefixCrc32(bytes, methodGuard, length)` delegates to the existing
CRC helper at start position 0; guard below 56 retains recursive null-input
behavior. `SpriteState.computeWhirlpoolDigest(length, sourceOffset, source, bitsPerByte)`
uses the existing hash instance with reset 52 and a 64-byte result. Positive
offsets first copy length bytes; offset <=0 uses the original source. A nonzero
client guard preserves the original early-copy/alias branches. The bit count
is (long)(bitsPerByte*length), with signed int multiplication before widening.
The ordinary caller supplies 8. No overflow fix, bounds validation or new
alias policy is introduced; partial effects and literal gg.C/wh.MA contexts
remain.

Every index/lookup instance declaration and constructor contract, selected hash
helper parameter/local, and source/override API parameter/local has a guarded
name. All previous complete rules and source/generator pins remain. Compilation,
binding checks, reproduction and reversal support this pass. Existing native
text fixtures retain their decoder/guard/nested-failure scope without new
metadata/lookup/hash/provider execution. Private provider/storage/compression
helpers, static shared names, real assets/server traffic, complete gameplay and
device performance remain unfinished or unverified.
