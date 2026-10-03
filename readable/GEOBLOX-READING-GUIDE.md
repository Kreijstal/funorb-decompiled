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

There are 6,081 explicit guarded rules: 59 classes, 767 fields, 547 method
declarations, 1,615 parameters and 3,093 locals. This is not full deobfuscation.
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
retain their original order. Private provider fields/requests/helpers remained opaque at pass 67;
pass 68 names their instance declarations and request records.

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

## Cached archive requests and background work (pass 68)

`CachedArchiveSource` names `bj` for its concrete provider role. It owns the
archiveId, expected index CRC/digest/revision, loaded index, networkClient,
diskWorker, optional indexDiskCache/groupDiskCache and a groupRequests table.
All instance declarations and constructor contracts have guarded names; shared
static text/graphics helpers stay on the owner. Constructor table/queue allocation
still occurs before its catch, and supplied digest/storage references are retained.

| Provider state | Role |
| --- | --- |
| groupDiskStatus | 0 unknown, -1 invalid/unavailable, 1 validated or queued for disk storage |
| verifyDiskCachePending | Initial verification phase when groupDiskCache exists |
| downloadAllPending | Requested full download phase, enabled only with groupDiskCache |
| backgroundGroupIndex / backgroundGroups | Scan cursor and unresolved group IDs for the active phase |
| requestedGroups | Private queue scanned by processRequestedGroups; no producer exists in the fixed source |
| sweepCompletedRequests / nextRequestSweepMillis | Optional completed-request cleanup and its deadline |

`getGroupRequest(methodGuard, requestMode, groupId)` first checks groupRequests.
Foreground mode 0 discards a cached pending nonpriority request, then uses disk
unless its status is -1; otherwise it requests priority network data. Mode 1
requires disk cache and queues verification. Mode 2 requires disk cache and
status -1, then requests background network data. Full queues return null
before insertion. Pending requests return null. The method obtains bytes before
testing guard -71, preserving malformed guards and partial request effects.

Disk responses require more than two bytes, validate CRC excluding the final
two bytes, optionally compare a 64-byte Whirlpool digest, then check the low
16 revision bits in that suffix. Caught Exception marks disk status -1, unlinks
and may retry priority network. Network responses validate CRC/digest, reset
existing client counters on success, and catch RuntimeException to reset,
unlink and possibly retry. Successful network data gets its revision written
into the final two reserved bytes in place. The provider queues a disk write,
updates disk status and unlinks nonpriority records at their original points.
No additional copy, ownership rule, retry or exception handling is introduced.

`requestAllGroups(methodGuard)` returns without groupDiskCache; otherwise it
sets downloadAllPending and allocates backgroundGroups if necessary. Its wrong
guard still changes the cleanup deadline. `processRequestedGroups` requires a
background queue and loaded index, removes invalid/empty IDs, requests mode 1
for status 0 and mode 2 for status -1, then removes status 1 entries. The fixed
source only allocates/iterates requestedGroups; it does not enqueue into it.

`advanceBackgroundLoading(methodGuard)` gives disk verification priority over
downloads. Verification retries unresolved queued groups and scans nonempty
index slots while disk-worker depth is below 250, finishing when statuses are
nonzero. Downloads request groups whose status is not 1 while the network
background queue has room; the client retains its 20-outstanding-request limit.
Unresolved IDs join backgroundGroups. Complete phases clear their flag and reset
the shared cursor; the queue clears when no phase remains. Missing index data
returns before cleanup. Original large labeled bodies and duplicate arms remain.

When enabled and its deadline is reached, cleanup skips pending records and
sets seenByCleanup on completed records. A later sweep unlinks previously marked
priority records and throws for a marked nonpriority record. The deadline moves
by 1000ms only after an actual sweep. Wrong guards preserve their group-get call,
clock order and other side effects.

| Request type | Instance contract |
| --- | --- |
| ArchiveRequest | Dual-link record, volatile pending initialized true, priority flag, seenByCleanup marker and getBytes/getProgress virtual APIs |
| DiskArchiveRequest | diskCache, operationType and original bytes; operation 1 synchronous read, 2 queued write, 3 queued read |
| NetworkArchiveRequest | responseBuffer, signed reservedTailBytes and blockPosition within 512-byte transport blocks |

Disk getBytes returns null for the wrong guard before checking pending; normal
pending throws, completed returns the original array. Its progress is 0/100,
with wrong guard first clearing diskCache. Network getBytes rejects pending or
incomplete non-tail data; its wrong guard invokes getProgress(-105) before
returning the original buffer bytes. Network progress uses
100*position/(length-reservedTailBytes), preserving overflow/division, and wrong
guard returns 76. Transport sets blockPosition to 10 after its response header,
resets it at 512 and uses 1 after a continuation marker.

The disk worker's synchronous read normally sets priority true, but reusing a
matching queued write returns its byte alias early with priority still false.
That behavior stays visible; this naming pass does not alter the flags or queue
protocol. All selected instance declarations/constructor contracts and every
previous complete rule remain. Compilation, binding checks, reproduction and
reversal support these names. Existing native text fixtures retain their prior
scope without new provider/request/worker/transport or actual asset execution.
Worker/network/storage/compression helpers, static shared names, remaining large
bodies, full gameplay and device performance remain unfinished or unverified.

## Disk-cache worker and secondary request queue (pass 69)

`DiskCacheWorker` names `uf` for its instance role. All four instance fields,
six instance methods, constructor parameter and instance locals have guarded
names. Static UI/login helpers still share this owner. The constructor builds
the queue before its catch, asks `PlatformTaskDispatcher.startThread` to run it
at priority 5, polls the volatile task status with the existing sleep helper,
throws on status 2, then retains the returned thread.

| Worker member | Role |
| --- | --- |
| requestQueue | SecondaryDeque FIFO; the same object is the enqueue/dequeue/lookup monitor |
| queuedRequestCount | Nonvolatile queued-only count, decremented before disk I/O; provider reads it without synchronization |
| workerThread | Dispatcher-created thread, normally joined and cleared during shutdown |
| stopRequested | Nonvolatile loop flag; shutdown sets it before acquiring the queue monitor to notify |
| queueWrite / queueRead | Construct operation 2/3 requests, retain cache/key/bytes as appropriate and enqueue |
| readSynchronously | Operation 1 request, served from a matching queued write or direct disk read |
| enqueueRequest | Private tail insertion, count increment and notification under the queue monitor |

`readSynchronously` iterates the queue while holding its monitor. The first
operation 2 request with the same group key and identical cache supplies its
original byte array. The new request completes and returns early with priority
still false. Neither synchronous path assigns cache/key fields on that returned
request. When no queued write matches, the queue monitor is released before
reading disk; that path sets priority true and completes. No copy or extra
request initialization is added.

`run` retains its Java callback name. Under the queue monitor it removes the
first request, or waits and ignores an interruption. A selected request
decrements the queued count before the monitor is released. Disk writes and
reads then occur outside that monitor. Writes and unmatched operation codes
complete inside the protected operation region. Reads and reported Exceptions
complete after it. `requestSelected` and `completeRequestAfterOperation` retain
the two original int 0/1 continuation selectors and their monitor/catch routing.
An Error retains the outer unchecked rethrow path.

`shutdown` sets stopRequested and notifies the queue. Only guard 51 permits
joining the thread and clearing its reference; an ignored join interruption
still clears the reference. Shutdown does not drain the queue. These names
expose the original synchronization and visibility behavior without changing it.

Every SecondaryDeque instance declaration now has a semantic name. Its five
new locals identify unused arithmetic-guard remainders, the client-guard
snapshot and insertion failures. `addLast` unlinks an already linked node before
its guard arithmetic can fail. `addFirst` with a true guard returns after node
link assignments but before neighbor writes. `nextForIteration` retains a null
dereference if called again after iteration exhaustion. Wrong worker guards
retain their early returns, static mutations and partially enqueued requests.

All 5,336 previous complete rules, raw sources and generator pins remain.
Compilation, binding checks, reproduction and reversal support the names.
Existing deque fixtures cover the primary deque and independent dual links;
they do not newly execute SecondaryDeque or live disk-worker storage/concurrency.
Unknown static helpers, network/storage/compression, large labeled bodies,
real assets, full gameplay and phone/FPS/heap behavior remain unfinished or
unverified.

## Archive network queues and socket responses (pass 70)

`ArchiveNetworkClient` names `ji`; `SocketArchiveNetworkClient` names `kk`.
Every instance declaration, constructor contract and local is named. Static
gameplay, account text, sprite and theme helpers remain on these owners. The
base constructor builds four SecondaryDeque queues, a six-byte outbound buffer
and a ten-byte response header buffer. Failure counters start at zero and the
response XOR key starts at zero; untouched fields retain Java defaults.

| Network member | Role |
| --- | --- |
| pendingPriorityRequests / sentPriorityRequests | Unsent/sent priority class, limited to 20 combined |
| pendingBackgroundRequests / sentBackgroundRequests | Unsent/sent background class, separately limited to 20 combined |
| outboundPacketBuffer | Six-byte scratch storage; sends use the entire backing length |
| responseHeaderBuffer | Partial ten-byte header or one-byte continuation marker |
| currentResponseRequest | Sent request receiving data; remains linked until completion |
| responseIdleMillis / lastPollMillis | Signed elapsed accumulation capped at 200ms per poll; idle over 30000ms closes/clears socket |
| responseXorKey | Optional incoming byte-XOR key, zero initially |
| failureCount / failureCode | Volatile failure/escalation state; codes include -1 validation, -2 I/O and positive handshake classes |

`queueRequest(reservedTailBytes, archiveId, methodGuard, groupId, priority)`
sets the long secondaryKey to `(long archiveId << 32) + (long groupId)`, with
signed addition and no new range check. It creates the request before testing
the selected queue class's capacity, then inserts at the pending tail. The
wrong guard clears pendingPriorityRequests after insertion. The generic
DualLinkNode.secondaryKey is also used by disk requests and secondary hash
buckets, independently of the primary node key.

`pollResponses` checks socket write failure, queues opcode 1 for priority and
opcode 0 for background, followed by the low 40 bits of secondaryKey. A
successful enqueue moves each request from pending to sent via its secondary
links. With no socket, the method returns true only if both queue classes are
empty. With a socket, zero available input returns true even when work remains;
the Boolean is not a completion percentage. It performs at most 100 receive
iterations per call, resetting the idle count when input is available.

The ten-byte response header is an unsigned archive byte, signed group int,
compression/queue byte and signed packed-length int. Bit 128 selects the sent
background queue; the low seven bits select compression. The client looks up
the combined key in that sent queue and throws IOException if no request
matches. It allocates `packedLength + (compressionType == 0 ? 5 : 9) +
reservedTailBytes`, preserving signed arithmetic and allocation failures. It
writes the five-byte archive prefix, clears the header cursor and sets the
request blockPosition to 10.

Body reads stop at available input, the non-tail end or the current 512-byte
block boundary. Newly read header/body bytes are XORed through `h.xorInt` when
the key is nonzero. Completing the non-tail portion unlinks secondary links,
writes volatile pending false and clears currentResponseRequest. Reaching
block position 512 instead resets it to zero so the next read expects a marker.
A marker byte -1 clears the header cursor and sets block position 1. A different
marker clears only currentResponseRequest: the one-byte prefix/cursor and sent
request links remain. This unusual partial state is preserved explicitly.

Several generated int slots serve different roles at different points.
`elapsedMillisOrHeaderTargetBytes`, `responseLimitOrHeaderReadLength` and
`bodyReadLengthOrHeaderXorIndexOrArchiveId` describe these reused slots.
Large labeled parsing bodies and slot reuse still need structural work; the
names do not imply that the decompiler has split their lifetimes.

`attachSocket(socketObject, methodGuard, useControlOpcode2)` closes the old
socket before casting/storing the new object. It sends the setup packet
`[6, 0, 0, 3, 0, 0]`, then opcode 2 or 3 plus five zero bytes. The flag name
records the opcode effect without asserting login semantics. True methodGuard
retains its additional opcode-3 recursion and shared diagnostic field mutation.
The header cursor/current response reset, and sent priority requests then sent
background requests move to their pending tails. Requeueing retains partial
response buffers and pending flags. A nonzero XOR key sends opcode 4, the key
byte and a zero int, after which idle/time reset at their original points.

I/O failure attempts close, increments failureCount, records code -2 and clears
the socket; queues requeue later during attachment. Validation reset with guard
20 records code -1 and chooses a nonzero 1..255 key narrowed to byte. Wrong
validation guards retain only their attempted close. `closeSocket` closes but
retains the socket reference and queues. No new retry, null handling, unsigned
normalization or ownership/visibility changes are introduced.

`bc.sleepMillis(splitRemainder, durationMillis)` returns for nonpositive duration.
When duration modulo 10 equals splitRemainder, it sleeps duration minus one,
then one; otherwise it sleeps once. The first argument is a real comparison
operand, normally zero. `sleepIgnoringInterrupt` retains the ignored
InterruptedException and clears its shared string array for the wrong guard
only after a successful sleep. Negative durations and outer exception wrappers
remain unchanged.

All 5,422 previous complete rules and source/generator pins remain.
Compilation, binding checks, reproduction and reversal support these names.
Existing native helper/cache/shutdown/socket/dispatcher/input traces retain
their previous scopes; they do not newly validate archive response parsing,
reconnect traffic or actual server/assets. Handshake/storage/compression,
unknown static names, large labeled bodies, full gameplay and device/FPS/heap
behavior remain unfinished or unverified.

## Archive catalog, handshake and creation (pass 71)

`ArchiveCatalog` names `em`. Every instance declaration, constructor contract
and local is named; unrelated static UI/text helpers stay on this owner.
The two-argument constructor delegates with null verification operands. The private
constructor stores its client, worker and optional exponent/modulus, then queues
priority archive/group 255/255 with zero reserved tail bytes unless capacity is
full. The fixed source has no caller supplying nonnull verification operands.

| Catalog member | Role |
| --- | --- |
| networkClient / diskWorker | Network and disk request services |
| catalogRequest | Retained network request for the catalog |
| verificationExponent / verificationModulus | Optional BigInteger transformation operands |
| catalogBuffer | Verified response bytes and shared mutable cursor |
| archiveSources | Memoized providers indexed by archive ID |

`ensureCatalogLoaded` returns immediately for an installed catalog. Otherwise
it queues the request when possible, then checks its guard and volatile pending
flag. It wraps the completed bytes, sets the cursor to 5, reads an unsigned
archive count and skips count times 72 bytes. Each record holds a big-endian
index CRC, big-endian index revision and 64-byte Whirlpool digest.

The remaining suffix is copied into one byte array with explicit aliases.
When both verification operands exist, the signed BigInteger suffix is raised
modulo the stored modulus and converted with `toByteArray`; otherwise the raw
suffix is reused. The resulting array must contain 65 bytes. Bytes 1 through
64 must match Whirlpool over the count and records starting at offset 5.
Byte 0 is not checked. The method adds no decompression or header validation.
It publishes catalogBuffer before allocating archiveSources and retains the
catalog request and end-position cursor. Allocation failures keep the original
partial state.

`getArchiveSource` requires the catalog and a valid archive ID. A memoized
provider returns before guard effects or new cache/options matter. Otherwise
it seeks to `6 + 72 * archiveId`, reads the record and creates CachedArchiveSource
with group cache before index cache, then memoizes it. A wrong guard clears
catalogRequest after CRC/revision reads and before digest copying.
`advanceArchiveLoading` first calls processRequestedGroups on all existing
providers, applies its original guard effect, then calls advanceBackgroundLoading
on all providers. The two loops remain separate.

Shared state now exposes archiveNetworkClient, archiveDiskWorker, archiveCatalog,
archiveTaskDispatcher, archiveConnectTask, archiveHandshakeSocket,
archiveHandshakeStage, archiveHandshakeDeadlineMillis, archivePort,
alternateArchivePort, archiveHost, archiveGameCrc, archiveClientId,
archiveLanguageId, archiveServerNumber, archiveUseControlOpcode2 and
archiveLoadStatus. The fixed GeoBlox bootstrap supplies clientId 1. Its
applet/cache initialization separately uses 11; the wire identifier's name does
not equate those values or invent a protocol version. The control flag records
only its proven opcode 2/3 effect.

`TextInputValidator.initializeArchiveServices` assigns CRC, server number, host,
client/language IDs, active port and dispatcher, retains the guard side effect,
assigns the alternate port and constructs network client, disk worker and
catalog in that order. It adds no rollback or state reset.
`ma.tickArchiveLoading` advances providers before checking its guard, polls
responses and advances the handshake only when polling returns false.

`WhirlpoolHash.advanceArchiveHandshake` retains these stages; several can
advance during one call:

| Stage | Action |
| --- | --- |
| 0 | Request a socket task for the active host/port; advance to 1 |
| 1 | Wait for task completion; failure invokes retry handling, success advances to 2 |
| 2 | Wrap the socket, send 13 bytes, set a 30-second reply deadline; advance to 3 |
| 3 | Read a reply when available; zero advances to 4, nonzero invokes retry handling |
| 4 | Attach the socket to the network client, clear temporary task/socket and reset stage |

`ke.writeConnectionHeader` writes byte 12, big-endian short 17, client ID,
server number and language byte. Its caller adds opcode 15 and the big-endian
game CRC. The deadline is checked with strict greater-than only when no reply
byte is available; there is no added connect-task timeout. IOException invokes
failure handling with -3. Before stage processing, four accumulated failures
map validation code -1 to status 3, I/O code -2 to status 4 and other codes to 1.

`eb.handleArchiveHandshakeFailure` clears task/stage/socket references without
adding a socket close, swaps the two ports, then records and increments failure
state. Reply 51 records code 2 and returns status 2 after two failures; reply 50
records code 5 and returns status 5 after two. Other failures record code 1,
returning status 1 after four failures and -1 before the threshold. Original
duplicated branches and wrong-guard side effects remain. The load-status values
describe existing caller flow: -1 pending, 0 ready, 1 connection failure,
2 server-full result, 3 validation failure, 4 I/O failure and 5 out-of-date result.

`IntKeyLookup.createResourceArchive` transfers dispatcher cache-file references
into buffered wrappers at their original points, builds optional disk caches,
obtains the memoized provider, optionally requests all groups and constructs
ResourceArchive with its retention flags. The master index-cache local is
created only while the shared data file is first wrapped; subsequent calls keep
the original null local behavior. Partial ownership transfers and checked/
unchecked exception wrappers remain. `SocketArchiveNetworkClient.createResourceArchive`
uses its fixed foreground/retention/discard/sweep arguments and original guard.

All 5,556 previous complete rules and raw source/generator pins remain.
Compilation, binding checks, byte-exact reproduction and reversal support these
names. Existing native helper/cache/shutdown/socket/dispatcher/input fixtures do
not newly execute the catalog, handshake or archive factories. Storage and
compression code, unknown static helpers, large labeled bodies, real server/
asset traffic, full gameplay and phone/FPS/heap behavior remain unfinished or
unverified.

## Limited and buffered random-access files (pass 72)

`LimitedRandomAccessFile` names `pa`; `BufferedRandomAccessFile` names `sk`.
Every instance declaration, constructor parameter and local has a guarded name.
The limited file's `finalize` keeps its Java override identity. Unrelated static
text/UI helpers and `checkBoundaryLossAndStartCascade` stay on these owners.

| File member | Role |
| --- | --- |
| LimitedRandomAccessFile.file | Owned Java RandomAccessFile handle |
| maximumLength | Maximum checked write extent, with the original overflow marker behavior |
| LimitedRandomAccessFile.position | Tracked cursor after successful seek/write or positive read |
| BufferedRandomAccessFile.file | Owned limited-file wrapper |
| BufferedRandomAccessFile.position | Caller-visible virtual cursor |
| underlyingPosition | Tracked file cursor, separate from the virtual cursor; -1 when marked unknown |
| physicalLength / logicalLength | Initial/extended underlying length versus requested write extent |
| readBuffer / readBufferStart / readBufferLength | Cached read bytes, file origin and valid extent |
| writeBuffer / writeBufferStart / writeBufferLength | Pending write bytes, file origin and valid extent |

The limited-file constructor maps only maximumLength -1 to Long.MAX_VALUE.
If existing length exceeds the limit it attempts deletion and ignores the
Boolean result. It opens the handle, records limit/cursor, reads the first byte,
rewrites that byte at zero for a nonempty file opened with mode other than `r`,
then seeks to zero. Failures preserve the existing partial construction.

`write` checks signed `position + length` before its guard or source access.
On overflow it seeks to maximumLength, writes marker byte 1 and throws
EOFException; the tracked position is not updated by this marker path.
Normal writes advance the tracked cursor after Java's write succeeds. `read`
delegates partial reads and advances only for a positive result. `seek` seeks
first, then assigns the cursor. Reads and seeks add no maximum-length check.
The read guard can assign avatarFeedbackHoldTicks; the seek guard can clear
waitingForSoundEffectsText. Wrong write guards retain static cleanup.
`length` returns -83 before handle access for guard other than 1. `close`
requires -5 and clears the handle only after successful close. The finalizer
prints a blank line and invokes close when a handle remains; it adds no super call.

The buffered constructor records the limited file's length in physicalLength
and logicalLength, allocates write/read arrays in that order and starts the
virtual position at zero. The write origin and read origin start at -1;
underlyingPosition retains Java's default zero. `seek` rejects negative
positions, evaluates its arithmetic guard, then changes only the virtual cursor.
`length` returns logicalLength; a wrong guard clears readBuffer first.

`readFully(destination, remainingLength, destinationOffset, methodGuard)` retains
its original int-sum bounds check. If the whole request is available in pending
writes, it copies and returns before the guard effect. Otherwise it records the
initial position, destination offset and requested length, copies a cached
prefix and obtains remaining bytes through direct partial reads or a refill.
It then zero-fills an unread gap before pending writes and overlays pending
bytes onto the original destination range. `readCountOrZeroFillEnd` names the
reused int's two roles; the overlay's original snapshots remain separate.
IOException within the read region marks underlyingPosition unknown. The final
remaining-length EOFException retains partial output and cursor effects.

`write` extends logicalLength before later guard checks or actual I/O. It
flushes pending data when the cursor is outside that extent, and may fill and
flush a full buffer before a true methodGuard returns early. With a false
guard it buffers a short write or seeks/writes directly for a larger one.
Direct writes update physicalLength and patch overlapping cached reads.
The original partial copy, cursor, count and error order remains; a failed
requested write need not roll back logicalLength.

The private `flush` writes the complete pending extent at writeBufferStart,
updates underlyingPosition/physicalLength, patches any read-cache overlap,
then resets writeBufferLength and origin. Wrong guard <=60 overwrites
physicalLength with 28 even without pending data. `refillReadBuffer` resets the
valid read extent and reads in chunks capped at 200000000, stopping on -1 or
capacity without advancing the virtual cursor. Its false argument retains the
early return; no handling for repeated zero reads is added.

`readAll` reads the whole destination before its arithmetic guard can fail.
`close` flushes and closes the limited file before its wrong-guard length call
can clear readBuffer. These names preserve malformed arguments, signed overflow,
aliases, partial effects, exception coverage and original diagnostic strings.

All 5,698 previous complete rules and raw source/generator pins remain.
Compilation, binding checks, byte-exact reproduction and reversal support the
names. Existing native cache-write fixtures retain controlled direct-write and
failure coverage; other helper/shutdown/socket/dispatcher/input traces retain
their scopes. Comprehensive buffered read/write/flush combinations, disk archive
sector chains, real storage/server/assets, full gameplay and phone/FPS/heap
behavior remain unverified. Compression, unknown static helpers and large
labeled bodies remain unfinished.

## Disk archive sector chains (pass 73)

`DiskArchiveCache` names `jh`. Every instance declaration, constructor contract
and local has a guarded name. `toString` retains its Java override and returns
the full archive ID. The unrelated static audio initialization helper remains
on this owner. `dj.diskSectorBuffer` is the existing shared 520-byte scratch
array; its static initialization and guard/cleanup clearing remain unchanged.

| Member | Role |
| --- | --- |
| dataFile | Shared buffered sector file and monitor for cache operations |
| indexFile | Buffered file containing six-byte index records |
| archiveId | Identifier stored as a byte in sector headers, compared as an unsigned byte on read |
| maximumEntryLength | Stored/read length limit; constructor overrides the default 65000 |
| diskSectorBuffer | Shared scratch for index records, sector headers and read payloads |

Index record `entryId * 6` contains a big-endian 24-bit entry length followed
by a big-endian 24-bit initial sector. Data sectors occupy 520 bytes, starting
at `sectorNumber * 520`. These multiplications occur as int before conversion
to long; the names do not normalize overflow or add ID/range checks.

| Sector header component | Entry ID <=65535 | Entry ID >65535 |
| --- | --- | --- |
| Entry ID | 2 bytes | 4 bytes |
| Chunk number | 2 bytes | 2 bytes |
| Next sector | 3 bytes | 3 bytes |
| Archive ID | 1 byte | 1 byte |
| Header/payload capacity | 8 / 512 bytes | 10 / 510 bytes |

`read(entryId, methodGuard)` captures and locks dataFile before reading the
index. It requires the complete index row, an allowed entry length and a
positive initial sector no greater than `dataFile.length() / 520`. It then
reads each header and payload, validates the entry ID, chunk sequence, archive
ID and next-sector bound, and copies payload bytes into the result. A zero
next sector is allowed in a header but fails if further payload remains.
IOException returns null; unchecked outer exceptions retain their rethrow path.
The wrong guard can clear dataFile after the initial index-size check, while
the captured original monitor stays held.

`write(bytes, methodGuard, entryId, length)` acquires the data-file monitor
before checking the length. It attempts `writeEntryChain` with reuse enabled,
then retries with reuse disabled only after a false return. The private
routine takes the same monitor again. Reuse requires a valid initial sector
from the index; allocation uses the ceiling of data length divided by 520 and
avoids sector zero. It publishes the six-byte index record before reading
reused headers or writing any payload. Failed later work can retain that index
record and partially changed sectors.

During reuse, header entry/chunk/archive fields and next-sector bounds must
match. A missing next link disables further reuse and allocates at the data
file end, avoiding the current sector. `headerEntryIdOrPayloadLength` names the
original reused int slot: it holds the header entry ID during validation and
the payload count during writes. Original byte narrowing, numeric guards,
scratch assignment order, aliasing and exception scopes remain.

`smallHeaderEofState` and `largeHeaderEofState` are still int continuations
with original values 0 and 1. EOF sets state 1 and exits the inner labeled
region to a true return. The index record is already published and no remaining
sector payload is written. Public write therefore reports success and skips
its allocation retry. The native fixture verifies this partial-success path
for both header formats, including unchanged sector bytes and the new index length.

The original termination test sets nextSectorNumber to zero when remaining
payload is <=512 for both header formats. For large IDs, actual sector payload
capacity is 510. Controlled lengths 511/512 and 1021/1022 therefore retain
successful writes followed by null reads: the chain terminates before the final
one/two payload bytes can be reached. This is verified in native bytecode as
well as both Java exports; the naming pass preserves the behavior.

Fresh zero-length writes also report success, but reading still requires a
valid positive initial sector. A fresh empty data file fails that check;
overwriting an existing valid chain with an empty entry can return an empty
array. Wrong guards, malformed write arguments and unchecked failures retain
their original behavior without broader verification claims.

The existing result-helper probe adds 138 controlled sector cases: 120
fresh/reused entry/length combinations, sixteen valid/malformed seeded reads
and two reused-header EOF exits. Independent payload checks and explicit
partial-effect assertions support the names; data/index file digests and
results match native/raw/readable traces. The pinned trace is
`77dc4b47188f20793aaecb76f198e59850d0fc3d8af0ca07b2d0a111719a869b`.
Fixtures close the limited-file wrappers, clearing their handles before the
finalizer can print nondeterministic blank lines. Previous six native traces
remain unchanged.

All 5,820 previous complete rules and raw source/generator pins remain.
Compilation, 138,558 binding checks, 388 override relationships, byte-exact
reproduction and reversal support the export. The new controlled sector cases
do not establish complete buffering/concurrency, malformed-write/guard or live
cache/server/asset behavior. Compression, unknown static helpers and large
labeled bodies remain unfinished; full gameplay and phone/FPS/heap behavior
remain unverified.

## Archive compression and inflater entry state (pass 74)

`GzipInflater` names `fe`, `Bzip2Decoder` names `tb` and `Bzip2DecoderState`
names `jl`. Every gzip instance field/API, constructor contract and local is
named. The Bzip2 entry/bit-reader APIs and selected state have names; deeper
block/table/run locals and other state fields still need tracing. Mixed static
UI/validation/gameplay helpers remain on these owners.

`v.decompressArchive` is the shared archive-index/group unpacker. It reads an
unsigned compression type and a signed packed length, rejecting a negative
length or one above nonzero `uj.maximumArchiveLength`. Zero disables the bound;
the fixed initializer sets zero. The second argument participates in the format
branch: equality with `~compressionType` selects allocation and copying of
packedLength bytes from cursor 5. Normal callers supply -1, so type 0 is raw.
The name `uncompressedTypeComplement` records that comparison without treating
the argument as unused.

| Normal type routing | Data layout/action |
| --- | --- |
| 0 | Type byte, packed length, then raw payload at offset 5 |
| 1 | Type byte, packed length, unpacked length, then stripped Bzip2 payload at offset 9 |
| Other values | Same nine-byte prefix; invoke shared gzip inflater at cursor 9 |

The compressed branch reads a signed unpacked length, applies the same bound,
allocates the output and retains its original aliases. Type 1 calls the Bzip2
entry; all other values lock `AwtRasterBuffer.archiveGzipInflater` and invoke
`inflateInto`. It retains the capture/global-dereference order and contextual
RuntimeException wrapper. The input array is not rewritten. Neither gzip nor
the Bzip2 entry enforces the declared packed length as an input boundary.

`GzipInflater.inflateInto` requires magic bytes 31 and -117 at the buffer cursor.
It lazily creates `Inflater(true)`, skips exactly ten header bytes, excludes
eight tail bytes from the backing array and invokes inflate once. The return
count and finished state are ignored; the ByteArrayBuffer cursor is unchanged.
Trailer CRC/size and optional header fields are not validated. Short destinations
can hold a prefix, while excess destination bytes retain their previous values.
Bad magic fails before the protected inflate operation; caught Exceptions during
input/inflate reset the inflater and become an empty RuntimeException inside
the original contextual wrapper. Success resets it too; no new Error cleanup,
end call, unsigned normalization or complete-output check is added.

The no-arg gzip constructor still delegates -1,1000000,1000000. Its private
constructor body is empty. `unusedFirstArgument`, `unusedSecondArgument` and
`unusedThirdArgument` record that fact without assigning unsupported size/guard
semantics. Wrong inflate guards retain the original static-helper side effect.

`Bzip2Decoder.decompressInto` captures and locks `decoderState`, then assigns
input/output arrays, input offset, zero output cursor, output allowance, bit
buffer/count and byte counters. `ignoredPackedLength` is not read. The method
decodes blocks, computes requested minus remaining output, clears input/output
references only on success and returns the produced count. The archive
container ignores that count, preserving partially initialized output. Failures
do not acquire new finally cleanup. `releaseSharedState` clears the shared
reference without installing a replacement for later calls.

| Named Bzip2 state | Role |
| --- | --- |
| inputBytes / inputPosition | Input backing array and byte cursor |
| outputBytes / outputPosition | Output backing array and destination cursor |
| remainingOutputBytes | Unconsumed output allowance |
| bitBuffer / bufferedBitCount | Shifted input bits and unread bit count |
| inputBytesRead / outputBytesWritten | Original integer counters |

`readBits` loads unsigned bytes into the shifted int until enough bits exist,
then extracts with the original signed shift/mask and consumes the count.
`readByte` and `readBit` delegate counts 8 and 1 and narrow to byte. Input bounds,
shift/overflow behavior and the empty overflow-check branches remain.

The existing result-helper probe adds 74 controlled compression cases. Its
36 type/length/limit cases check raw and gzip results; eight additional cases
check declared packed lengths, the complement branch and two Bzip2 vectors.
Thirty direct gzip cases check offsets, short/oversized destinations, malformed
magic/deflate, unchecked CRC trailer, unchanged input/cursor and inflater reset.
The valid Bzip2 vector is a fixed stripped Bzh1 block. A one-byte early-end
vector retains zero-filled allocated output and ignored completion count.
These payload/state assertions and native/raw/readable traces match at
`191d74dde65e8e0a6b5dc72a0193765baa165a94ab82ef5df15f10d86fd6f8fe`.

All 5,907 previous complete rules and raw source/generator pins remain.
Compilation, 138,558 binding checks, 388 override relationships, byte-exact
reproduction and reversal support the export. Seven prior native traces remain
unchanged. These controlled cases do not establish arbitrary malformed-input,
optional gzip-header, deep Bzip2 state/control-flow or real-asset equivalence.
Unknown static helpers and large labeled bodies remain unfinished; full
gameplay and phone/FPS/heap behavior remain unverified.

## Bzip2 block tables, move-to-front state and output runs (pass 75)

Every `Bzip2Decoder` field, method, parameter and local now has a guarded name.
Every `Bzip2DecoderState` instance field is named; its unrelated static
validation/socket helpers remain unchanged. `kb.bzip2TransformTable` names
the shared workspace. This pass adds 99 identities without restructuring the
large labeled bodies or changing their evaluation/publication order.

| Decoder routine | Role |
| --- | --- |
| `decodeBlocks(state)` | Parse block metadata, construct decoding tables, decode symbols, build inverse-transform links and emit each block |
| `buildByteAlphabet(state)` | Map ascending used byte values to a dense alphabet |
| `buildHuffmanTables(limits, bases, symbols, codeLengths, minimumLength, maximumLength, alphabetSize)` | Build canonical symbol order, length limits and code offsets |
| `emitBlockRuns(state)` | Traverse inverse-transform links, expand runs and save state when the destination is full |

`decodeBlocks` forces `blockSize100k` to 1 and allocates 100,000 ints only if
the shared transform workspace is absent. It does not resize an existing
workspace. A first byte of 23 returns immediately. Other marker/CRC bytes and
the randomized bit are consumed without validation or randomized-block
handling. The next three bytes form the 24-bit `originalPointer`.

`usedByteGroups` and `usedBytes` describe the 16 group flags and 256 byte flags.
`buildByteAlphabet` resets `alphabetSize` and fills `alphabetBytes` in byte-value
order. `selectorMoveToFrontValues` holds unary selector ranks;
`huffmanSelectors` holds the table IDs after move-to-front decoding. The six
table rows use `huffmanCodeLengths`, `huffmanLimits`, `huffmanBases`,
`huffmanSymbols` and `minimumCodeLengths`. Each selector supplies 50 symbols.

Canonical table construction orders symbols by length, then symbol index. It
counts lengths, forms prefix counts, builds each length's maximum code and
adjusts bases for symbol lookup. Original signed byte lengths, 23-slot setup
loops, integer shifts and unchecked malformed-input behavior remain.

The byte move-to-front list uses `moveToFrontBytes`, a 4,096-byte workspace,
and sixteen `moveToFrontBlockStarts`. Ordinary symbols move the selected byte
to the front; small ranks use the original unrolled shifts, and larger ranks
move across sixteen chunks. Exhausting the first chunk rebuilds their layout.
RUNA/RUNB symbols accumulate weighted repeats of the front byte. Decoded bytes
populate the low byte of `bzip2TransformTable`; `byteFrequencies` counts them.
`blockLength` is this last-column length, before the output run expansion.

`byteBucketPositions` first holds frequency prefix sums, then scatter cursors.
The decoder adds source-row links in the upper bits of the transform table.
`transformPositionOrEntry` deliberately names a reused slot: it can hold a
packed table entry before shifting right by eight to obtain the next position.
Other reused locals retain both selector and byte-list roles rather than
pretending the original variable had a single lifetime.

`emitBlockRuns` snapshots the shared table and follows its links. Literal bytes
retain signed byte conversion; after four equal bytes the run-count byte is
treated as unsigned and adds four. `pendingRunByte`, `pendingRunLength`,
`currentByte` and `blockBytesConsumed` describe the retained output state.
The block-end target is `blockLength + 1`. Partial exits publish the original
table alias, output cursor/allowance and pending run state at their existing
points; duplicated publication tails and empty overflow checks remain.
Another block is decoded only when all block bytes are consumed and no run
remains. The integer `continueDecodingBlocks` keeps its original 0/1 form.

The new 40-case fixture uses six fixed stripped Bzh1 streams: empty data, mixed
runs followed by all byte values, repeated byte alphabets, deterministic
pseudorandom bytes, a long single-byte run and a 120,064-byte two-block stream.
Thirty-four destination cases check zero, short, exact and oversized buffers,
with independent prefix/count/tail assertions. Inputs stay unchanged and
successful calls clear the assigned input/output references.

Three malformed cases use an empty input, a negative offset and null input.
Their unchecked exceptions release the state monitor while retaining the
assigned arrays and unchanged destination. Each is followed by a successful
recovery call that produces the expected bytes and clears those references.
All forty native/raw/readable traces match
`f237b1b6fd8e69c006fa43ec005f742ae5909d107d0ba5ec4574f2c804ad3ba9`.
Fixed compressed vectors live in the existing probe, with no runtime Python
dependency or additional report JSON.

All 5,982 prior complete rules and raw source/generator pins remain unchanged.
The export compiles, preserves 138,558 bindings and 388 overrides, reproduces
byte-for-byte and reverses to the raw source bytes. Eight previous native
traces remain unchanged. These fixtures do not establish arbitrary corrupt or
randomized-stream handling, shared-state concurrency, live asset compatibility
or whole-game/device behavior. Remaining large labeled bodies and opaque
static helpers still need work; the memory, startup and FPS targets remain
unverified.

## Shared Bzip2 output cleanup through an existing exit (pass 76)

`emitBlockRuns` previously published the same output state and returned in two
places. When the destination filled with a pending run, an inner loop repeated
the publication tail. The same tail already followed its enclosing `L1` block.
The early path now uses `break L1`, skipping the remaining decoding work and
reaching that existing tail. The pending run, byte consumption, current byte,
transform-table alias/cursor, output position/allowance and byte counter are
published in the same order, once on either path. Empty overflow checks remain.

The generic java-tools renderer makes this change after reconstructing local
scopes. Exact terminal token sequences must match, the existing destination
must be a plain labeled block, and inner declarations cannot shadow names in
the tail. Nested loops/labels are transparent to the exit; try/catch/finally,
monitor and switch boundaries are opaque. No new label frame, helper method
or dispatcher is introduced. The large loop/label structure still needs work.

This removes thirteen raw/readable source lines and 39 binding references,
38 of which received semantic names. All 19,558 declarations and all 6,081
complete rules survive without ordinal migration. The current 49,580 naming
edits preserve 138,519 bindings and 388 overrides. The other 302 Java files
and diagnostics are unchanged; the single manifest records the new source and
decompiler pins explicitly.

The generic emitter has 2,048 additional native comparisons covering loop
effects, protected/monitor ownership, failure order, throwable identity and
scope refusals. The actual GeoBlox native/raw/readable Bzip2 matrix retains its
40-case trace, as do the eight other existing helper traces. Clean decompiler
source-archive regeneration, readable reproduction and dictionary reversal are
byte-exact. These checks do not establish full asset/gameplay, concurrency or
phone memory/startup/FPS acceptance.


## Redundant loop labels and plain blocks (pass 77)

The generic renderer now resolves labeled breaks and continues against Java's
actual lexical destinations. When the nearest ordinary loop/switch is exactly
the same target, a jump can become `break;` or `continue;`. Its now-unreferenced
label disappears. Transfers past an inner loop or switch retain their necessary
outer labels. Plain blocks with no direct declarations can lose braces when
nested as statements in another block; variable, loop, conditional, protected
and monitor scopes remain. All operations, operators, literals and transfer
routes stay in order. No guard value is assumed.

`GameplaySession.updateSession` and `kc.reconcileBoardEntities` lose redundant
loop labels and some frame nesting, along with rendering, storage, compression
and other helpers. The large session/reconciliation bodies are still nested and
need further reconstruction to expose their higher-level gameplay phases.
The raw corpus changes 153 files and
removes 588 lines (80,457 to 79,869). Across all 303 raw sources, generated labels
fall from 1,188 to 680 and labeled continues from 518 to 68. All 1,190 labeled
breaks remain. These token counts describe frame/transfer spelling.
Every declaration/reference identity,
spelling and occurrence order remains, so all 6,081 complete rules survive with
no ordinal migration and the same 49,580 edits, 138,519 bindings and 388 overrides.

An independent JDK AST checker compares the before/after file inventories and
ordered syntax events for all 303 sources, including 1,129 loop/switch destinations
and 1,762 jumps. The full emitter suite passes 41 groups with this check enabled;
2,048 new native cases verify effects, lexical shadows, switch/loop destinations,
protected and monitor exits, failure order, throwable identity and lock release.
Exception-exit tests pass eight groups. Three wider try-with-resources fixture
failures also occur on the pinned pre-cleanup baseline. Clean source-archive
regeneration and diagnostics, readable reproduction and dictionary reversal are
byte-exact. Existing GeoBlox native probes retain their documented trace pins.

Opaque helpers, large labeled bodies, real assets/server traffic, complete
gameplay and browser/phone memory/startup/FPS behavior remain unfinished or
unverified. The current manifest and existing provenance contain the source
migration and evidence; no extra JSON snapshots are created.


## Boolean decision chains (pass 78)

`GameplaySession.updateSession` now expresses board-clear eligibility through
three short-circuit checks: no entity detached this tick, the attached queue is
empty, and the current theme has released at least one entity. The queue query
retains guard 13519. `kc.reconcileBoardEntities` expresses raster dirtiness as
the existing session dirtiness, contact-state dirtiness or pending avatar shock.
Its earlier session-reference snapshot stays before the field checks, preserving
aliases and null/failure order. The original local result stores remain.

The renderer recognizes primitive-local literal selection through one existing
plain exit block. Nested successful guards combine with AND; sequential successful
alternatives combine with OR. Opposite literal selection applies De Morgan's law
without complementing relational comparisons, preserving NaNs and short-circuit
execution. Nullable conditions, effectful/repeated calls and self-modifying
predicates keep their order and partial writes. No client guard value is assumed.
Prefixes and protected/monitor ownership stay in place. Target declarations must
be unique and visible; boxed/field/shadowed targets, extra branch effects, other
exits, declarations and protected/monitor crossings refuse folding.

Seventeen decisions across twelve files simplify, including queue-settled,
pending-transition, name/host and null-guarded caller checks. This removes 156
raw/readable lines (79,869 to 79,713). Every declaration identity/spelling and
local ordinal remains; only 17 duplicate local-store references disappear.
Three previously received semantic names. The 6,081 complete rules remain,
applying 49,577 edits and preserving 138,502 bindings and 388 overrides; all other
ordered binding events match the previous export.

Two new generic groups add 13,824 native comparisons of truth tables, initial
values, boxed/null conditions, NaNs/signed zero, repeated/self-modifying predicates,
failure order, partial stores, throwable identity and surrounding catch/finally/
monitor ownership. The emitter run passes 42 tests; the optional pass77 frame-only
AST corpus checker is skipped because this rewrite changes boolean syntax.
Exception-exit tests pass eight groups. Clean source-archive regeneration and
diagnostics, readable reproduction and dictionary reversal are exact. Existing
native GeoBlox traces retain their documented pins; actual host setup, model
callbacks, real assets/server traffic, comprehensive gameplay and browser/phone
performance remain outside the proofs. Opaque helpers and large bodies remain.

## Direct early exits (pass 79)

`GameScreen.renderScreen` exits directly after a selected menu rendering branch,
and menu/input helpers return after completing their selected operation.
`GameplaySession.updateSession` uses direct returns in its tutorial exit paths.
`Sprite.rotateNearest` and the corresponding ARGB routine return after their
selected geometric case, removing an outer exit frame while retaining their
branch predicates, traversal and pixel-write order. Some large bodies remain;
this change removes control indirection rather than splitting methods.

Only a break to a plain labeled block immediately followed by a bare void return
is eligible. No value expression or work moves across a cleanup boundary.
Explicit finally may override the transfer by return, throw, outer break or
outer continue. A separate completion proof keeps a reachable trailing return,
removes an unreachable one, and refuses uncertain candidates. Unknown syntax,
resource headers, nested executable bodies and ambiguous lexical identities
remain unchanged. Declaration-bearing braces retain their scope.

The pass consumes 95 jumps in 38 blocks across 25 files, removing five unreachable
trailing returns and 81 lines (79,713 to 79,632). Every ordered declaration/
reference identity and spelling plus 388 override rows matches the preceding
corpus. Applying the documented return and control-frame rules reproduces all
303 regenerated token streams. All 6,081 complete guarded rules remain unchanged,
applying 49,577 edits and preserving 138,502 bindings. Text-resource source hashes
and line positions refresh without changing fields, keys or indexes.

The generic tests add 46,080 native comparisons of loops, explicit resource
cleanup, failures, partial state, throwable identity and lock ownership/release.
The emitter suite passes 44 tests and skips its historical pass77 frame-only
corpus check; exception-exit tests pass eight groups. Clean decompiler archive
regeneration, readable reproduction and dictionary reversal are exact. Existing
native/raw/readable game probes retain their documented traces. Whole-game
execution, actual assets/platform/server traffic, remaining opaque helpers and
browser/phone performance remain outside these proofs.

## Triangle shading (pass 80)

The triangle path begins in the model renderer `hi`: it extracts each vertex's
red, green and blue channels and calls `nb.drawHalfBlendRgbTriangle`. Its parameters
name the three X/Y pairs `vertexAX`/`vertexAY`, `vertexBX`/`vertexBY` and
`vertexCX`/`vertexCY`; the entry wrapper sorts their Y coordinates before
dispatching matching X/R/G/B values. Numeric
sentinels and tie behavior remain unchanged.

`SpriteState.drawSortedHalfBlendRgbTriangle` traverses the upper and lower
segments using left/right `XQ16`, `RedQ16`, `GreenQ16` and `BlueQ16` values and
their per-row steps. `middleVertexOnRight` records which edge the middle vertex
occupies. The short edge changes at the middle Y while the long edge continues.
The helper uses `TriangleRasterState.clipWidth`/`clipHeight` and `rowBaseOffsets`
to clip spans and locate their framebuffer rows. Original reused scratch slots
have combined names, such as `edgeSegmentRowsThenRowBase`; they remain one local.
The large labeled body and all control-flag paths remain.

`jf.drawHalfBlendRgbGradientSpan` advances the interpolated channels for each
pixel and combines them with `(previousPixel >> 1) & 0x7f7f7f`. Its red/green
masks retain the original decimal constants, including 33423689; this naming
pass does not repair or normalize the arithmetic. The decrement-before-test
pixel count, bad-guard mutation and partial-buffer failure behavior remain.

`TriangleRasterState.prepareTriangleClipFromRasterizer` imports the current
software-rasterizer clip and fills framebuffer row offsets. Centers are half
the clip width/height. Its private tables are `sineQ16`, `cosineQ16`,
`reciprocalQ15` and `reciprocalQ16`; `releaseTriangleTables` releases all five
arrays while preserving the clip dimensions/centers.

All parameters/locals in the three selected triangle methods and all declarations
in `TriangleRasterState` now have guarded names: 116 additions in total.
Raw source and decompiler pins remain those of pass79. The 6,197 rules apply
50,682 edits, preserving all 138,502 bindings and 388 overrides. Reproduction
and dictionary reversal are byte-exact; the dictionary retains every original
identity and spelling.

The drawing probe adds 5,266 native/raw/readable comparisons. Independent oracles
cover 1,800 scanline cases, four clip configurations and six table/growth/release
checks. Another 3,456 triangle cases preserve native pixel and failure traces,
including all vertex permutations, flat/clipped triangles, RGB inputs, guards
and control flags. Complete triangle geometry has no independent oracle here;
whole-model/real-asset rendering, remaining opaque helpers and large bodies,
full gameplay and browser/phone performance remain unverified.

## Mesh lighting and coordinate operations (pass 81)

`TriangleMesh` supplies short XYZ vertex positions and normal components plus
face vertex/normal/material indices. The selected fields now expose those roles,
along with priorities and the cached bounding box. Other mesh arrays/static
helpers are still opaque. `MeshMaterial.baseRgb` names the per-material color;
unrelated static helpers retain their mixed obfuscated owner.

`p` transforms the normal components into `ok.transformedMeshNormalX`,
`oa.transformedMeshNormalY` and `gi.transformedMeshNormalZ`, and projects vertices
into `sh.projectedMeshVertexX` and `dj.projectedMeshVertexY`. Face collection fills
`ch.meshFaceCountsByDepthBucket` and `pj.meshFaceOrder`. Before drawing,
`hi.renderLitQueuedMeshFaces` either compacts depth buckets or groups faces by
priority using `uh.meshFacePriorityWriteOffsets`. `facePriorityCount` is one
plus the largest unsigned priority, including gaps; it is not a distinct count.
This preparation still happens before checking the method guard.

`ck` supplies light and half-vector components normalized to 256. Diffuse
response shifts the normal/light dot product right by eight before taking its
absolute value, clamps the ambient-plus-
diffuse value, and attenuates it by the specular response. Specular response
indexes `jf.meshSpecularResponseByAbsDot` with the absolute value of the already
shifted normal/half-vector dot product; `jk` builds the original power-15 table. Original overflow and
out-of-range behavior remains. Missing materials select gray 8355711; negative
indices other than the -1 sentinel retain their failures.

Faces with identical normal indices use the existing flat triangle helper.
Other faces compute three lit RGB values and use `nb.drawHalfBlendRgbTriangle`.
The original masks and shifts remain, including their differing values across
the flat and smooth branches. Combined names describe slots reused between those
branches; the three diffuse-array aliases remain explicit.

`TriangleMesh.scaleVertices` and `translateVertices` retain short narrowing and
partial XYZ writes before invalidating bounds. `refreshBounds` returns when
`boundsValid` is already true; otherwise it sets that flag before scanning and
publishes min/max XYZ. A failed scan can therefore leave the flag true with
old bounds. Bad guards preserve the original array-nulling/static-call effects.
All parameters/locals in these operations and the lighting caller have names.

The pass adds 130 guarded identities. All 6,197 previous complete rules and the
raw/decompiler pins remain. The 6,327 rules apply 51,424 identifier edits,
preserving 138,502 bindings and 388 override relationships. Reproduction and
dictionary reversal match all 303 files byte-for-byte.

The drawing probe adds 10,592 native/raw/readable trace comparisons: 10,368
lighting/order/failure cases and 224 transform/bounds cases. It records pixel
buffers, queue/priority mutations, failure contexts, coordinate arrays and cache
state, including invalid inputs and partial stores. Existing triangle/sprite/
nine-slice traces retain their pins. This is not an independent complete lighting
or model oracle. Model loading/preparation, opaque fields/static helpers, flat
raster structure, full assets/gameplay and browser/phone performance remain
unfinished or unverified.

## Flat triangle spans and face ordering (pass 82)

The equal-normal lighting branch calls `gi.drawHalfBlendSolidTriangle` with an
already halved RGB value. That wrapper sorts three vertex Y values and forwards
matching X coordinates to `NetworkArchiveRequest.drawSortedHalfBlendSolidTriangle`.
The rendering helper remains on its original mixed static owner; no network
behavior or repository ownership moves.

`leftXQ16`/`rightXQ16` and their steps traverse the upper and lower triangle
segments. `middleVertexOnRight` selects the edge changed at middle Y. Named
`TriangleRasterState` clip dimensions and row offsets bound the pixel spans;
the original right-edge and zero-width arithmetic stays visible. Reused slots
such as `edgeSwapOrRowBaseOrLowerRowsOrGuardRemainder` retain their original
multi-phase role. The large nested source structure is unchanged in this pass.

`ib.drawHalfBlendSolidSpan` adds the supplied `halfRgb` to
`(previousPixel >> 1) & 0x7f7f7f` for each pixel. The color is not halved again.
`pixelCount` decrements before testing, including integer overflow at its extreme
negative value. The span guard remainder runs after writes, so a bad guard may
fail with a modified destination. The sorted triangle's guard calculation runs
after upper rows and before lower-row rendering. Original partial arrays,
wrapped failure contexts and literals remain.

The lighting caller now names its preparation branches directly:
`vc.compactDepthBucketFaceOrder` compacts depth-bucket entries into the face
prefix; `va.groupQueuedMeshFacesByPriority` consumes signed priority bytes,
increments the chosen write offset and writes into the same face-order array.
Names expose the original alias and mutation order; this pass does not assume
stable grouping or change overlapping storage behavior.

All parameters/locals in these five methods have guarded names, adding 80
identities. The 6,407 rules apply 51,926 edits, preserving all 138,502 bindings
and 388 overrides. The prior 6,327 complete rules and raw/decompiler pins remain.
All 303 files compile, reproduce and reverse byte-for-byte.

The drawing probe adds 8,775 native/raw/readable cases: 1,575 independent span
oracle cases, 4,608 wrapper traces and 2,592 direct sorted-helper traces. Cases
include vertex order, flat/clipped triangles, colors, control flags, extreme
counts/indices, null/short arrays and late guard failures with partial writes.
Prior sprite, triangle and mesh-lighting traces retain their pins. Full flat
triangle geometry has no independent oracle here. Mesh/model loading/preparation,
opaque helpers, large bodies, complete assets/gameplay and browser/phone behavior
remain unfinished or unverified.

## Mesh projection and face collection (pass 83)

The rendering caller passes `IntKeyLookup.meshCameraTransform` and
`lk.meshModelTransform` into `p.projectMeshAndQueueFaces`. Their first three
entries are translations; the next nine are Q16 basis coefficients. The method
shifts the camera basis to Q14 before composition, subtracts camera translation
from model translation and forms scaled camera X/Y and unscaled depth. All
arithmetic keeps Java integer overflow and masked shift counts.

Vertices at depth 50 or greater receive perspective X/Y and a retained depth.
Closer vertices only receive the `Integer.MIN_VALUE` depth marker; their old
projected X/Y remain. `storeCameraCoordinates` optionally writes camera XYZ.
`transformNormals` uses the model basis, checking capacity only on transformed
normal X. An insufficient Y/Z buffer can therefore fail after earlier writes.
A false `preserveSharedResources` calls the original cleanup helper before
vertex processing; it clears shared references and sets the existing integer
field to 120. Control flags retain their early collector and return paths.

The optional per-face coordinate triples are named `firstVertexSourceX/Y/Z`,
`secondVertexSourceX/Y/Z` and `thirdVertexSourceX/Y/Z`. Their outputs retain the
matching transformed-coordinate names, including the prior
`BufferedSocket.thirdVertexTransformedY` identity. These are separate int arrays,
not aliases for the mesh's short vertex XYZ. Their construction and asset purpose
remain unknown; this pass does not label them as texture coordinates.

`i.queueMeshFacesByDepth` optionally rejects backfaces using the projected signed
cross product and skips a face if any vertex has clipped depth. It normalizes the
sum of its relative depths into a bucket using `hj.unsignedBitLength`, then queues
the face in a 16-entry bucket. Full buckets spill toward lower indices. Face
priorities use signed byte indices, count into offsets and then turn into prefix
sums. `oe.clearMeshDepthBucketCounts` and `ma.clearMeshPriorityCounts` preserve
eight sequential stores per loop, including partial writes for short arrays.
The original guard-triggered avatar cleanup and failure contexts remain.

All parameters/locals in these five methods are named. Combined scratch names
such as `cameraXXOrNormalXYQ16` expose reused phases, which remain unsplit.
The 142 additions bring the current export to 6,549 rules and 52,854 edits; every
prior complete rule, 138,502 bindings and 388 overrides remain. All 303 raw and
readable files compile, reproduce and reverse byte-for-byte.

The existing drawing probe adds 5,992 native/raw/readable comparisons: 384 bit-
length checks, 64 clearing checks, 216 identity-coordinate checks, 2,592 general
geometry traces, 2,016 fault traces and 720 direct collector traces. Five direct
cases independently check uniform-depth spill order and bucket counts. Recorded
state includes projected/camera/normal/optional-coordinate buffers, face order,
buckets, priorities, queue count, selected cleanup effects and failure contexts.
Earlier drawing trace pins remain. Complete general projection geometry, actual
assets/gameplay and browser/phone behavior remain unverified.

## Nested guard reconstruction (pass 84)

The generic decompiler now combines braced guards with no else or intervening
work. Mesh projection's nine optional-coordinate checks read as one multiline
short-circuit guard, with the same left-to-right null checks before array access.
Session/menu/loading/rendering checks likewise lose extra nested braces.
The innermost body block and its declarations remain, including original
try/finally, monitors, labels and transfers. Removed wrappers contain only the
next if; no effect or predicate is moved across a protected boundary.

The pass folds 710 chains and merges 913 conditions across 131 files, removing
913 lines. Every raw ordered declaration/reference/override row remains
19,558/118,944/388; all 6,549 complete naming rules and 52,854 edits survive
without ordinal migrations. Clean source-archive export, compilation, full
reproduction and dictionary reversal remain byte-exact. Diagnostics, text-loader
resources and frozen tools/stubs/probes retain their pins.

Generic fixtures add 17,280 native comparisons for short circuits, unboxing,
NaNs, partial effects, failure identity, body scopes, early returns, finally effects
after invocation and monitor ownership. An independent JDK method/initializer
inventory verifies that only the documented guard/frame rules produce all 303
new token streams. All seven native game probes retain their expected traces.
The generic emitter suite passes 46 tests with its optional historical pass77
frame-only proof skipped; the exception suite passes eight groups.

The current survey still has 21 method/constructor spans of at least 300 lines,
15 with generated block labels. Three text-loader helpers occur inside the large
outer span, so these counts do not represent unique dispatchers. Opaque helpers,
reused scratch phases and large control bodies remain; actual assets/gameplay
and browser/phone acceptance are unverified.


## Animated logo scene (pass 85)

`ni.loadLogoMeshesAndMaterials` loads `logo.fo3d`, reads a mesh count, decodes
materials/meshes and centers the scaled geometry. `jc.readMeshMaterials` checks
version/read enable, reads base RGB values for new materials and aliases earlier
entries for references. Other encoded values remain unnamed in meaning because
the decoder discards them. Successful real archive decoding is source-audited;
only null-archive failures and controlled material streams are executed here.

`logoAnimationTick` advances through `td.advanceLogoAnimationTick` and completes
when `wj.isLogoAnimationComplete` observes a tick greater than 250. The guard
remainder precedes the increment, so division failure leaves the tick untouched.
`logoStartDelayTicks` comes from the original millisecond-to-tick conversion.

`Geoblox.prepareLogoMeshRotation` uses the original three easing branches and
mesh-specific X/Y signs. `ArchiveIndex.buildLogoRotationTransform` composes inverse X/Y
rotations using `bh.sineQ16`, `fi.cosineQ16` and `quarterSineQ16`. Translation is
zero and the remaining nine coefficients are column-major Q16 values. Product
shifts precede selected negations; the code retains those rounding choices.

`ck.renderLogoMeshes` installs a camera at Z=-8144, computes rotated mesh bounds
midpoint depths and repeatedly selects the strictly greatest remaining key.
It rotates the selected mesh but reads `logoMeshCenters` by draw-order index.
That original distinction stays explicit. Equal keys retain the first candidate;
all-MIN_VALUE keys can select an already used mesh, so this is not documented as
an unconditional permutation. Lighting rotates with the clock, or uses pointer
snapshots when both coordinates are available. Normalization retains integer
overflow and NaN-to-int behavior. Guard division runs after rendering.

Projection uses `i.queueMeshFacesByDepthWithIntegerGuard` to preserve full JVM
integer arguments. The original byte-guard collector remains available. A
source byte cast changed -8170 to 22 and skipped cleanup in 120 native scene
cases; the new generic entry point fixes that mismatch without changing bytecode.
Its original and integer bodies currently coexist, adding code rather than
simplifying the collector. Generic discovery covers owned static targets through
int stack carriers; other invocation shapes remain outside this proof.

The fixed native trace compares 56,862 cases across bytecode/raw/readable
variants, including 804 successful scenes and 216 pixel-changing scenes.
Independent checks cover the trigonometric table and matrix composition within
one integer unit, clock state, 48 valid material inputs and 72 zero-rotation
center/depth cases. Whole-frame pixels and general easing use native traces;
real logo assets, full gameplay and browser/phone performance remain unverified.
