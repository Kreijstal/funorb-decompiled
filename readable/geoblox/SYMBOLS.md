# Readable Java symbol map

Generated from explicit rules; original names remain lookup identities.

| Original identity | Readable name | Evidence |
| --- | --- | --- |
| `C:c` | `GameScreen` | Nine instances constructed by Geoblox.m, selected by current/requested screen IDs; implements menu rendering, input and per-screen update. |
| `C:dm` | `Sprite` | Owns int pixels and nearest/smooth sprite transforms; raster fixtures and rotation census. |
| `C:gh` | `GameplaySession` | Created when a menu starts play; Geoblox delegates gameplay update/render to it; owns board angle, score and session progression. |
| `C:hf` | `IntrusiveNode` | hf instance fields field_b/field_c form reciprocal links; tf constructs a circular hf sentinel and hf.a(boolean) detaches a node. Static helpers are unrelated to the instance role. |
| `C:ja` | `GameplayEntity` | ja.java declares positioned, moving sprites (field_o/field_v, field_w/field_F, field_J); gh.java iterates ja instances from gameplay entity lists and transforms their coordinates around the board angle. |
| `C:ka` | `MenuScreen` | Base for c; stores item geometry and selection, dispatches keyboard/pointer input, renders item rows. |
| `C:kl` | `PcmSampleStream` | Audio chunk census and sample interpolation/mixing bodies. |
| `C:me` | `ScorePopup` | The instance stores points/text, origin coordinates, progress and chain multiplier. ug initializes it, bd interpolates its display, cf credits completed points and wa collects unfinished points. Unrelated static helpers retain their own identities. |
| `C:na` | `IndexedSprite` | Owns byte pixel indices and int palette used by indexed raster loops. |
| `C:nj` | `PendingActionMarker` | nj.java instances contain the supplied integer as field_h; ra.java enqueues new nj(param2) into pb.field_t as a marker for the action being handled. |
| `C:qk` | `AudioOutput` | Owns output sample buffer and drives ia stream fill from the audio update chain. |
| `C:rc` | `DualLinkNode` | rc extends hf and adds field_k/field_l as an independent reciprocal link pair; rc.a(byte) unlinks only that second pair. GameplayEntity_ja inherits both link sets. |
| `C:tf` | `IntrusiveDeque` | tf instance owns a circular hf sentinel, cursor, head/tail insertion, removal and traversal; constructor self-links the sentinel. Its static theme helpers are unrelated to this instance role. |
| `C:u` | `MusicDecodeStage` | Prepared dependency of ua.c(I)[F; conservative stage name, no assumed codec algorithm. |
| `C:ua` | `MusicDecoder` | Music-loading profiles and source show packet decoding and shared bit readers. |
| `C:vb` | `SoftwareRasterizer` | Owns shared framebuffer, scanline stride and clipping bounds. |
| `C:wh` | `SpriteState` | Declares sprite dimensions and trim offsets read by dm transforms; also contains unrelated static helpers. |
| `F:Geoblox.field_A:Ljava/lang/String;` | `loginMessage` | Initialized to Please login and cleared during cleanup. |
| `F:Geoblox.field_z:[Ljava/lang/String;` | `reconnectMessages` | Static initializer contains the four Connection lost - attempting to reconnect messages. |
| `F:a.field_d:Ltf;` | `attachedEntities` | Contact and drawing routines iterate this queue; detachment moves its members back to moving entities. |
| `F:ab.field_f:Z` | `boardContactStateDirty` | Attachment/contact changes and a match cooldown reaching zero set this flag; the session snapshots it before motion and the contact routines consume it. |
| `F:ai.field_p:I` | `requestedScreenId` | Requested destination ID compared with current screen during update/render; assigned by menu actions and gameplay. |
| `F:bk.field_a:Ldm;` | `boardOwnershipRaster` | Attached entities stamp entityId+1 into this raster; contact detection and boundary testing inspect it. |
| `F:c.field_D:I` | `animationTick` | Incremented by normal and transition updates; drives modulo-based screen animations. |
| `F:c.field_K:I` | `screenId` | Constructor stores screen index; indexes per-screen action IDs and selects screen-specific behavior. |
| `F:c.field_R:Lkl;` | `volumePreviewStream` | d(0) creates kl from audio sample 8 using j.field_gb volume, adds to mixer and retains for preview throttling. |
| `F:c.field_U:I` | `volumePreviewTicks` | Ticks since preview start; reset when d(0) starts/restarts volume preview stream. |
| `F:c.field_ab:I` | `selectedThemeId` | Indexes loaded-theme flags and theme palette/sprite arrays in screen and gameplay rendering. |
| `F:c.field_p:LGeoblox;` | `gameApplet` | Geoblox constructor argument retained for session creation and host operations. |
| `F:c.field_y:I` | `activeTicks` | Incremented only by normal screen update, reset on menu/session operations; used for timeout. |
| `F:cd.field_j:I` | `gameplayOriginScreenId` | Menu activation stores its own screen ID alongside gameplay return destination; Geoblox consumes on the fh.c branch and uses for origin-specific setup. |
| `F:dd.field_D:I` | `variantMatchCandidateCount` | ul increments this when a collected triple shares spriteVariantIndex, before cooldown eligibility or deduplication is checked. |
| `F:di.field_g:I` | `releasedInDifficultyStep` | hd.f increments this release counter and compares it with sa.field_b before ld.b advances difficulty. |
| `F:dk.field_b:I` | `categoryMatchCandidateCount` | ul increments this when a collected triple shares entityCategoryKey, before cooldown eligibility or deduplication is checked. |
| `F:dm.field_v:[I` | `pixels` | Pixel array read by nearest/smooth rotation and written by sprite operations. |
| `F:el.field_i:I` | `gameplayReturnScreenId` | Stored when leaving gameplay via menus; Geoblox consumes as requested destination on the non-fh.c branch. -1 is the initial/reset sentinel. |
| `F:el.field_o:Lgh;` | `gameplaySession` | Current gh created by c activation; used for gameplay update/render and score access. |
| `F:fa.field_a:Z` | `entitiesDetachedThisTick` | The detach path sets this; session update resets it and excludes the board-clear bonus while it is true. |
| `F:fa.field_b:I` | `releasesPerTheme` | qe.a calculates this theme release threshold; hd.f compares it with ul.field_b, and the HUD displays the difference. |
| `F:gf.field_f:I` | `matchChainLength` | ec increments this per eligible scored triple and uses it as the points multiplier; scene/result setup resets it. |
| `F:gh.field_A:I` | `pendingPopupPoints` | Accumulated by a(II); c(Z) creates points popup then resets to zero. |
| `F:gh.field_B:Z` | `connectivityRebuiltThisTick` | kc.b(int) sets this after rebuilding a dirty contact graph; gh consumes it for the board-clear check and clears it each tick. |
| `F:gh.field_C:Z` | `tutorialPromptActive` | Tutorial entry, progression and failure set this; accepting the prompt clears it. Normal motion, release and fast-fall paths are gated while it is set. |
| `F:gh.field_D:I` | `sceneAnimationTick` | gh.java increments and resets field_D across timed in-game/result animations, using thresholds 160, 266, 460 and 1000 for animated sprite, title and curtain progression. |
| `F:gh.field_E:Z` | `rotationControlsSwapped` | Chooses which of internal keys 96 and 97 applies each rotation direction; the input handler toggles it. |
| `F:gh.field_F:Z` | `boardRasterDirty` | gh.render clears this after redrawing the attached board raster; contacts, transitions and ending ticks request that redraw. |
| `F:gh.field_G:I` | `debugSpawnCategoryId` | Pointer spawning passes this as nb.a parameter 2, which becomes the motion initializer category argument and entityCategoryKey. |
| `F:gh.field_H:Z` | `sceneTransitionRequested` | leaveTutorial and result completion set this; settled queues allow gh.b(byte) to run, and completion at tick 160 clears it. sk skips boundary checking while it is set. |
| `F:gh.field_I:LGeoblox;` | `gameApplet` | Retains the owning Geoblox constructor argument. |
| `F:gh.field_J:F` | `boardAngleRadians` | Changed by rotation input; sin/cos in render and radians-to-16-bit-angle conversion rotate board sprite. |
| `F:gh.field_K:Z` | `submissionBlocked` | Score/action submission checks this flag. Debug input and emitPointsPopup with the submission-blocking argument set it. |
| `F:gh.field_N:Z` | `spawnReleaseDisabled` | lc skips transfer from the spawn queue into moving entities while this is set. Debug input toggles it; tutorial/end paths also set it. |
| `F:gh.field_Q:Z` | `debugSpawnSpecialKinds` | Passed as nb.a parameter 5: true chooses special kinds 1/2/3/4 from category/variant; false selects ordinary kind zero. |
| `F:gh.field_R:Z` | `boardEmptyAtResultStart` | Result initialization records a.field_d.isEmpty here. The result message and extra 2000-point popup use that snapshot. |
| `F:gh.field_S:I` | `resultSequenceCountdown` | gh.java resets field_S to 150, decrements it during the result sequence and uses its expiration/threshold to advance the result animation. |
| `F:gh.field_T:I` | `pointsPanelX` | renderSession draws eg.field_q and the pending-points text at this x coordinate; updateSession slides it between 463 and 640, and emitPointsPopup derives the popup x from it. |
| `F:gh.field_U:I` | `tutorialProgressMetric` | During tutorial input/update, stores the current colour/shape-match counter or accumulates rotation progress; gh.b(int) tests it to advance the step. It serves both a baseline and a counter. |
| `F:gh.field_V:Z` | `debugReducedRendering` | Debug input toggles this flag; rendering skips the entity layer and several overlays while it is set. |
| `F:gh.field_W:I` | `resultCompletionTickOffset` | Set to 920 minus twice endingEntityRadius minus 59; result completion occurs when sceneAnimationTick equals this offset plus 150. |
| `F:gh.field_X:Ljava/lang/StringBuilder;` | `scoreText` | Updated from score in a(BI), rendered by gameplay drawing. |
| `F:gh.field_Y:Z` | `tutorialMode` | Constructor copies its tutorial flag here; updateSession initializes tutorial step zero, renderSession draws gh.g prompts in this mode, and addScore/addPopupPoints skip scoring while true. uk.a maps those step IDs to explicit tutorial messages. |
| `F:gh.field_Z:Z` | `boundaryCheckRequested` | Captures ab.field_f before the entity-motion update; the later update branch uses it to request sk.a(int). This is a saved request, not a new geometry test. |
| `F:gh.field_a:I` | `delayedActionCountdown` | gh.java initializes this counter to 300, decrements it during session progression and branches when it reaches zero; reset code returns it to zero. |
| `F:gh.field_ab:I` | `resultPanelX` | gh.java initializes field_ab to 640, draws the result panel and label using it as their horizontal coordinate, then decrements it until it reaches the centered panel position. |
| `F:gh.field_b:Z` | `boardClearBonusEligible` | Computed from no detachment this tick, an empty attached queue and a positive current-theme release count; the connectivity-rebuilt branch consumes it for a bonus. |
| `F:gh.field_bb:I` | `sessionPhase` | gh update/render branch on phase 0 for play, 1 for the result sequence requested at the theme release threshold, 2/3/4 for result effects/countdown and 5 for result completion. Numeric IDs remain unchanged. |
| `F:gh.field_c:I` | `endingEntityRadius` | Result initialization computes the square root of the largest nontransparent sprite-pixel distance from the board center, or defaults to 29 without an ending entity. |
| `F:gh.field_d:Z` | `tutorialAdvanceRequested` | Internal input key 16 sets this request; tutorial phase one consumes it to move to phase two. |
| `F:gh.field_e:I` | `newActionCount` | ra.a records previously unset action bits and increments this count; menu/result branches use whether it is positive. |
| `F:gh.field_f:Z` | `preserveScoreOnTransition` | At scene-transition start false selects resetScoreState while true selects prepareNextTheme. leaveTutorial sets false; transition completion sets true. This flag also gates the progress HUD. |
| `F:gh.field_g:Ljava/lang/StringBuilder;` | `popupPointsText` | Updated when a(II) adds popup points; stores formatted accumulated value. |
| `F:gh.field_h:Z` | `showSessionCounters` | Render displays the ec and difficulty counters when set; debug input enables this flag. |
| `F:gh.field_i:Z` | `sceneTransitionInProgress` | gh.b(byte) sets this at transition tick zero and clears it at tick 160; render checks it during the transition. |
| `F:gh.field_j:Z` | `debugPointerSpawnEnabled` | Debug input toggles this; the pointer input handler calls nb.a only when it is set. |
| `F:gh.field_k:I` | `pointsPanelFrameDirection` | updateSession adds this value to field_l and changes it to +1 at zero or -1 at seven. |
| `F:gh.field_l:I` | `pointsPanelFrameIndex` | renderSession indexes eg.field_q with this value; updateSession advances it every 16 ticks and reverses at zero and seven. |
| `F:gh.field_n:Z` | `matchBatchProcessedThisTick` | Receives ec.b(int), which returns true for a consumed nonempty match batch even when cooldowns prevent points from being awarded. |
| `F:gh.field_o:I` | `score` | Added to by a(BI), formatted as score text and submitted as final score by e(B). |
| `F:gh.field_p:I` | `tutorialStepId` | gh.g(int) passes this value to uk.a(int,int), which selects the rotation, colour-match, shape-match, completion and failed-tutorial messages; gh.b(int) advances it. |
| `F:gh.field_q:I` | `resultBonusPoints` | Result initialization adds 179; each shrinking-effect tick adds 7. Result render and the final popup display this separate bonus. |
| `F:gh.field_r:I` | `debugSpawnVariantId` | Pointer spawning passes this as nb.a parameter 4, which becomes the motion initializer variant argument and spriteVariantIndex. |
| `F:gh.field_s:Z` | `showDebugOverview` | The fog debug command toggles this; render draws a reduced overview circle with queue/entity markers. |
| `F:gh.field_t:I` | `tutorialStepPhase` | Phase zero displays the tutorial prompt; input sets phase one, gh.b(int) checks progress and sets phase two, then increments the step and returns to zero. Numeric phases remain unchanged. |
| `F:gh.field_u:I` | `boardMaskOffsetY` | Constructor initializes to minus half i.field_a.field_m; constructor, gh.b(byte) and ja.k(int) draw that mask at y=240+field_u. |
| `F:gh.field_v:I` | `updateTick` | Incremented on gameplay update, used for periodic animation and timing. |
| `F:gh.field_w:I` | `boardMaskOffsetX` | Constructor initializes to minus half i.field_a.field_r; constructor, gh.b(byte) and ja.k(int) draw that mask at x=320+field_w. |
| `F:gh.field_x:Z` | `sessionEnding` | gh.d(byte) sets this on the valid end path; update switches to the ending path and render omits the normal avatar. |
| `F:gh.field_y:I` | `pointsPanelSlideDirection` | updateSession decrements pointsPanelX for -1, increments it for 1 and otherwise leaves it unchanged; constructor initializes the direction to zero. |
| `F:h.field_a:I` | `matchCandidateCount` | ul fills the packed candidate array and increments this count; ec sorts and consumes that many candidates. |
| `F:hf.field_b:Lhf;` | `nextNode` | tf.g(int) starts at sentinel.field_b and advances through field_b; head insertion places a node between the sentinel and this link. |
| `F:hf.field_c:Lhf;` | `previousNode` | tf.a(boolean) starts at sentinel.field_c and traverses field_c; tail insertion links through this predecessor. |
| `F:i.field_a:Ldm;` | `avatarMaskRaster` | Avatar setup builds this mask; board initialization draws its white ownership marker before attached entity IDs. |
| `F:ib.field_a:Z` | `gameAssetsInitialized` | Geoblox update sets true only after prepareGameAssets succeeds; rendering uses it to select loading screen. |
| `F:ja.field_B:Z` | `detachedFromBoard` | ik/kc/bh set this when an entity or contact component detaches; entity reset clears it. Motion excludes detached entities from the attached count and accelerated-fall branch. |
| `F:ja.field_C:I` | `entityCategoryKey` | ja.java method a(ja,int) compares the removed entity's field_C with this field_C before changing the matching category count field_N; no particular numeric category is asserted. |
| `F:ja.field_E:I` | `matchCooldownTicks` | Kind 2 starts at 60; rh decrements once per attached update and marks contacts dirty at zero. ec requires all three candidate cooldowns to be nonpositive before awarding points. |
| `F:ja.field_F:F` | `velocityY` | ja.java method f(byte) adds field_F to field_v each call; ja.java method a(float,int) rotates field_F with field_w. |
| `F:ja.field_G:I` | `animationFrameIndex` | ja.java methods b(boolean) and private g(byte) index sprite-frame arrays with field_G and wrap it by the corresponding frame count. |
| `F:ja.field_H:I` | `entityId` | vf.java:245-247 constructs each ja with its slot in the 1000-entity pool; ja.java:820 stores that slot in field_H. kc.java:434 and 531 use it to index entity bookkeeping. ja.java:88, 258, 362 and 722 use field_H+1 as an ownership label in raster masks, not a transparent display color. |
| `F:ja.field_I:I` | `entityUpdateTick` | ja.java method b(boolean) increments field_I and uses its modulo values to advance animation frames and palette effects. |
| `F:ja.field_J:Ldm;` | `entitySprite` | ja.java selects field_J from sprite arrays in its private g(byte) method and invokes draw/transform operations on it in e, g, h, k, l and n. |
| `F:ja.field_K:Ltf;` | `entityQueue` | ef.java iterates active ja objects and assigns ra.field_a to each entity's field_K when its field_G reaches the setup threshold; tf.java is the intrusive linked-list container used for that queue. |
| `F:ja.field_L:I` | `relatedEntityCount` | ja.java method a(ja,int) bounds its search by field_L, decrements it after removal, and clears the vacated final array slot. |
| `F:ja.field_M:I` | `spriteVariantIndex` | ja.java private g(byte) indexes theme sprite arrays with field_M; method a(int,int,int,int) stores the supplied variant index into field_M. |
| `F:ja.field_N:I` | `sameCategoryEntityCount` | ja.java method a(ja,int) decrements field_N only when the removed entity's field_C equals this entity's field_C, and checks it against field_L as an invariant. |
| `F:ja.field_m:I` | `sameVariantEntityCount` | ja.java method a(ja,int) decrements field_m only when the removed entity's field_M equals this entity's field_M; the constructor and reset initialize it to zero. |
| `F:ja.field_n:[Lja;` | `relatedEntities` | ja.java allocates field_n as a ja array; method a(ja,int) searches it for a supplied entity, removes the matching entry, shifts the tail and updates related counts. |
| `F:ja.field_o:F` | `positionX` | ja.java subtracts 320 from field_o before board rotation and adds the rotated coordinate back; gh.java uses field_o in the same board-centered coordinate transform. |
| `F:ja.field_p:I` | `initialLifetimeTicks` | ja.java initializes field_p and field_r from the same spawn parameter; rendering computes an alpha from field_r/field_p while update decrements field_r. |
| `F:ja.field_q:I` | `interpolatedPaletteColor` | ja.java method b(boolean) computes field_q from jg.field_h and the red/green/blue deltas, then the sprite draw calls pass field_q as their color argument. |
| `F:ja.field_r:I` | `remainingLifetimeTicks` | ja.java method b(boolean) decrements field_r; method n(int) computes opacity using 255-field_r*255/field_p. |
| `F:ja.field_s:I` | `paletteRedDelta` | ja.java method m(int) computes the red-channel difference between consecutive jg.field_h palette entries and stores it in field_s; b(boolean) uses it while interpolating the palette. |
| `F:ja.field_t:Z` | `touchesAvatar` | ih.a finds the white 0xFFFFFF avatar marker in the ownership mask and sets this. kc uses it as a direct contact root; it does not describe transitive connectivity. |
| `F:ja.field_u:F` | `spriteAngleRadians` | ja.java converts field_u radians to a 0..65535 angle before Sprite transforms; methods a(float,int) and rendering methods adjust or consume the angle. |
| `F:ja.field_v:F` | `positionY` | ja.java subtracts 240 from field_v before rotation and updates it from the rotated Y expression; gh.java reads it as the entity's vertical coordinate. |
| `F:ja.field_w:F` | `velocityX` | ja.java method f(byte) adds field_w to field_o each call; ja.java method a(float,int) rotates field_w with field_F. |
| `F:ja.field_x:I` | `paletteGreenDelta` | ja.java method m(int) computes the green-channel difference between consecutive jg.field_h entries and stores it in field_x; b(boolean) uses it in the interpolated color. |
| `F:ja.field_y:I` | `paletteBlueDelta` | ja.java method m(int) computes the blue-channel difference between consecutive jg.field_h entries and stores it in field_y; b(boolean) uses it in the interpolated color. |
| `F:ja.field_z:I` | `entitySpriteKindId` | ja constructor/configureEntitySprite store the kind here; selectEntitySprite switches on it to choose ke/s/ka/hb/fc/ej sprite banks, and advanceEntityAnimation chooses kind-specific timing. |
| `F:ji.field_h:I` | `difficultyStep` | ld.b increments this index and reads the difficulty bit-flag table to adjust speed, rotation and entity selection parameters. |
| `F:ji.field_r:Ltf;` | `movingEntities` | ab advances entities in this queue; contact handling transfers them to the attached queue. |
| `F:ka.field_b:I` | `selectedItemIndex` | Selected/hovered row index used for input dispatch and rendering highlighted row. |
| `F:ka.field_d:I` | `itemSpacing` | Vertical row spacing; divisor in hit test and increment in rendering loop. |
| `F:ka.field_e:I` | `itemCount` | Constructor receives action-array length; bounds hit testing, selection wrapping and rendering loop. |
| `F:ka.field_f:I` | `hitRightX` | Exclusive upper X boundary in base menu hit test; initialized by constructor. |
| `F:ka.field_g:Z` | `pointerInteractionActive` | Set on nonempty pointer hit; gates held-button dispatch and keyboard selection. |
| `F:ka.field_j:I` | `hitLeftX` | Lower X boundary in base menu hit test; initialized by constructor. |
| `F:ka.field_k:I` | `firstItemY` | Menu top Y; hit test subtracts it and render initializes row Y from it. |
| `F:ka.field_l:Z` | `keyboardSelectionActive` | True when navigation selects a row; pointer hover clears it and changes selection. |
| `F:li.field_b:Ljava/lang/String;` | `tutorialCompleteMessage` | English initializer announces readiness for the real game and offers the Instructions page; uk.a returns it for tutorial step three. |
| `F:ll.field_g:[Z` | `themesLoaded` | Theme loaders mark fixed indices after foreground/background resource loading. |
| `F:md.field_a:Ltf;` | `activeScorePopups` | ug inserts initialized ScorePopup objects here; cf advances them, bd renders them and wa drains unfinished points. |
| `F:me.field_f:I` | `points` | ug assigns awarded points; cf credits this amount at completion and wa sums it when draining unfinished popups. |
| `F:me.field_h:I` | `chainMultiplier` | ug assigns the chain argument; bd displays it with X when not one, and cf routes those points through addPopupPoints instead of addScore. |
| `F:me.field_i:F` | `originY` | ug copies its Y argument here; bd interpolates from this coordinate toward y=34. |
| `F:me.field_k:F` | `progress` | ug resets this to zero; cf advances it toward one; bd uses it to interpolate the popup toward the points panel. |
| `F:me.field_m:Ljava/lang/String;` | `pointsText` | ug sets Integer.toString(points); bd renders this stored string. |
| `F:me.field_n:F` | `originX` | ug copies its X argument here; bd interpolates from this coordinate to the panel target. |
| `F:na.field_h:[I` | `palette` | Indexed raster looks up int color by unsigned byte pixel value. |
| `F:na.field_i:[B` | `indices` | Byte indices consumed by indexed raster bodies. |
| `F:nf.field_A:I` | `screenTransitionTick` | Incremented while current/requested screens differ; reset at 160; drives clipping and curtain position in Geoblox render. |
| `F:nj.field_h:I` | `actionId` | nj.java constructor copies its sole int argument to field_h; ra.java constructs new nj(param2) immediately before inserting it into the pending-marker list. |
| `F:nk.field_f:[I` | `packedMatchCandidates` | ul packs three 10-bit entity IDs plus category/variant flag bits into each entry; ec sorts, deduplicates and decodes them. |
| `F:oc.field_b:I` | `previousMenuScreenId` | Remembers screen 0/1 when leaving; escape/back routes to this screen. |
| `F:oc.field_d:Ldm;` | `boardSceneRaster` | Gameplay render caches the attached board scene in this raster and copies it during transitions. |
| `F:og.field_q:[Lc;` | `screens` | Nine c instances indexed by current/requested screen ID in Geoblox update/render. |
| `F:og.field_r:F` | `entityMotionSpeed` | Spawn motion initialization uses this magnitude to form entity velocity components; difficulty setup assigns it. |
| `F:oi.field_d:Ljava/lang/String;` | `tutorialColourMatchMessage` | English initializer explains colour/shape matching and asks for three of a kind by colour; uk.a returns it for tutorial step one. |
| `F:pb.field_t:Ltf;` | `pendingActionMarkers` | ra.a(int,int,int) enqueues new nj(param2) into pb.field_t; the GameplaySession constructor clears this deque. |
| `F:pg.field_e:Z` | `screenChangePending` | Consumed by Geoblox update to choose requested screen from el.field_i or cd.field_j and initiate transition. |
| `F:pk.field_o:[Z` | `connectivityVisitedByEntityId` | kc clears this array and marks entity IDs while traversing contact connectivity. |
| `F:qh.field_S:Ljava/lang/String;` | `tutorialFailedMessage` | English initializer explicitly says the tutorial failed, explains reaching the edge of the play area and offers replay or the proper game; uk.a returns it for step five. |
| `F:qj.field_b:Z` | `clearGameplayDuringTransition` | Set when transition is triggered via pg.field_e, forces cleared background instead of drawing gameplay; cleared on transition completion. |
| `F:qj.field_c:Ldm;` | `transitionCurtain` | Sprite drawn at y=6*transitionTick-480 after outgoing/incoming screen clipping. |
| `F:ra.field_a:Ltf;` | `availableEntities` | Entity initialization removes a free entity from this queue; completed entity animations return their objects here. |
| `F:rc.field_h:F` | `rotationStepRadians` | Gameplay applies this angular step with opposite signs for the two rotation controls; difficulty setup assigns it. |
| `F:rc.field_k:Lrc;` | `nextSecondaryNode` | wd.a(int) iteration and wd.b(byte) counting follow field_k from the circular rc sentinel; rc.a(byte) reconnects field_l.field_k and field_k.field_l before clearing the secondary links. |
| `F:rc.field_l:Lrc;` | `previousSecondaryNode` | rc.a(byte) reconnects field_l.field_k and field_k.field_l; field_l is the predecessor in the second link pair. |
| `F:re.field_j:Z` | `connectivityDirty` | Contact link changes set this; kc rebuilds connectivity only when dirty and clears it afterward. |
| `F:sa.field_b:I` | `releasesPerDifficultyStep` | qe.a computes ceil(fa.field_b/3) here; hd.f compares it with di.field_g to advance difficulty after that many releases. |
| `F:t.field_i:[[I` | `menuActionIds` | Maps screen ID and item index to integer action identifiers dispatched by c menu handlers. |
| `F:tc.field_c:I` | `currentScreenId` | Committed screen ID; -1 delegates update/render to gameplay, nonnegative indexes screens; transition commits requested ID after 160 ticks. |
| `F:tf.field_a:Lhf;` | `sentinel` | tf constructor creates an hf with both links pointing to itself; each traversal stops at this node. |
| `F:tf.field_c:Lhf;` | `iterationCursor` | tf.g(int)/a(boolean) save the next node here; d(int)/b(int) return it and advance in the chosen direction. |
| `F:tl.field_g:[Lja;` | `entitiesById` | Ownership-mask contact decoding and packed match IDs index this array to resolve GameplayEntity objects. |
| `F:ua.field_B:[F` | `workBlock` | Shared float decoding buffer, swapped with per-instance previousBlock. |
| `F:ua.field_C:[F` | `previousBlock` | Previous float block used in overlap-add, swapped with shared work buffer at packet completion. |
| `F:ua.field_E:[B` | `pcmBytes` | Output byte storage allocated to sample count, filled by ua.a([I)Lgd;. |
| `F:ua.field_H:I` | `sampleCount` | Header count bounds and sizes the final PCM byte array. |
| `F:ua.field_J:I` | `pcmWriteCursor` | Resumable PCM write offset, saved after each packet conversion. |
| `F:ua.field_L:[B` | `bitstreamBytes` | Assigned by ua.a([BI)V; byte input to both bit readers. |
| `F:ua.field_M:I` | `previousBlockSize` | Prior block size used in overlap-add output length; assigned current block size at packet completion. |
| `F:ua.field_j:I` | `bitCursor` | Bit position within byte, reset/masked with 7 by the bit readers. |
| `F:ua.field_p:[[B` | `packets` | Length-prefixed byte packets allocated by ua.b([B)V and selected by decodePacket. |
| `F:ua.field_t:I` | `longBlockSize` | Second 1<<readBits(4) setup size, selected for flagged block mode. |
| `F:ua.field_v:I` | `shortBlockSize` | First 1<<readBits(4) setup size, selected for unflagged block mode. |
| `F:ua.field_x:I` | `packetCursor` | Resumable PCM decoder packet index; incremented after each packet. |
| `F:ua.field_y:I` | `byteCursor` | Input byte index, incremented when bit cursor crosses byte boundaries. |
| `F:ue.field_f:Ltf;` | `availableScorePopups` | ug takes a popup from this pool; cf returns completed popups using intrusive insertion. |
| `F:ul.field_b:I` | `releasedInCurrentTheme` | hd.f increments this per release; the theme HUD subtracts it from fa.field_b; theme preparation resets it. |
| `F:vb.field_c:[I` | `framebuffer` | Shared destination of raster operations; writer audit. |
| `F:vb.field_d:I` | `clipBottom` | Vertical upper clipping boundary in vb.d and na.a. |
| `F:vb.field_e:I` | `clipLeft` | Horizontal lower clipping boundary in vb.d and na.a. |
| `F:vb.field_f:I` | `stride` | Destination index x + y * field_f in raster bodies. |
| `F:vb.field_i:I` | `clipTop` | Vertical lower clipping boundary in vb.d and na.a. |
| `F:vb.field_k:I` | `clipRight` | Horizontal upper clipping boundary in vb.d and na.a. |
| `F:vd.field_e:Ljava/lang/String;` | `tutorialShapeMatchMessage` | English initializer asks for three of a kind by shape; uk.a returns it for tutorial step two. |
| `F:vf.field_L:Ldm;` | `spriteScratchRaster` | Entity sprite preparation and ending-radius scanning use this temporary raster. |
| `F:vh.field_E:Ljava/lang/String;` | `tutorialRotationMessage` | English initializer welcomes the player and explains rotating the play area with the left/right arrow keys; uk.a returns it for tutorial step zero. |
| `F:wd.field_b:Ldm;` | `contactProbeRaster` | The pixel contact probe uses this raster while resolving moving-entity contacts. |
| `F:wd.field_e:Ltf;` | `spawnQueue` | lc advances staged entities and releases ready members to ji.field_r. |
| `F:wh.field_m:I` | `height` | Vertical source boundary in dm.c. |
| `F:wh.field_p:I` | `trimY` | Subtracted from vertical transform pivot, shifted by four. |
| `F:wh.field_r:I` | `width` | Pixel row stride and horizontal source boundary in dm.c. |
| `F:wh.field_u:I` | `trimX` | Subtracted from horizontal transform pivot, shifted by four. |
| `L:Geoblox.a(I)V#4` | `transitionSplitY` | Computed as 6*transitionTick-445; divides clipping between incoming and outgoing screens. |
| `L:Geoblox.m(I)V#0` | `screenIndex` | Loop index 0..8 creates and stores matching c screen instance. |
| `L:bd.a(I)V#0` | `popup` | Render iteration uses the popup and builds the X multiplier plus points text for chain multipliers other than one. |
| `L:bd.a(I)V#1` | `chainAndPointsText` | Render iteration uses the popup and builds the X multiplier plus points text for chain multipliers other than one. |
| `L:c.a(BI)V#1` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(IB)V#2` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(II)V#1` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(IIZIZI)V#1` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(ZBII)V#11` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.b(IB)V#6` | `actionId` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:cf.d(B)V#0` | `popup` | The active popup iteration updates progress and routes completed points before returning the object to its pool. |
| `L:dm.a(IIIIII)V#0` | `angleRadians` | Masked 16-bit angle multiplied by 2*pi/65536 before sin/cos. |
| `L:dm.a(IIIIII)V#1` | `scaledSin` | floor(sin(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.a(IIIIII)V#10` | `corner3Y` | Vertical corner expression using width and height, used in Y bound reduction. |
| `L:dm.a(IIIIII)V#11` | `leftBound` | Minimum transformed X, converted to destination pixels and clipped against vb.field_e. |
| `L:dm.a(IIIIII)V#12` | `rightThenNegativeWidth` | Initially maximum/right X; overwritten with left-right before negative pixel-count loops. |
| `L:dm.a(IIIIII)V#13` | `topBound` | Minimum transformed Y, converted to destination pixels and clipped against vb.field_i. |
| `L:dm.a(IIIIII)V#14` | `bottomThenNegativeHeight` | Initially maximum/bottom Y; overwritten with top-bottom before negative row-count loops. |
| `L:dm.a(IIIIII)V#15` | `destinationIndex` | Destination pointer advanced during sampling and by rowSkip after each row. |
| `L:dm.a(IIIIII)V#16` | `rowSkip` | Framebuffer stride+negativeWidth; skips the remainder of each destination scanline. |
| `L:dm.a(IIIIII)V#17` | `inverseScaleFactor` | 16777216.0/scale used in inverse sin/cos coefficients. |
| `L:dm.a(IIIIII)V#18` | `inverseSinStep` | Inverse sine coefficient advances source Y per destination pixel. |
| `L:dm.a(IIIIII)V#19` | `inverseCosStep` | Inverse cosine coefficient advances source X per destination pixel. |
| `L:dm.a(IIIIII)V#2` | `scaledCos` | floor(cos(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.a(IIIIII)V#20` | `destinationOffsetX` | First destination pixel center relative to destination X pivot. |
| `L:dm.a(IIIIII)V#21` | `destinationOffsetY` | First destination pixel center relative to destination Y pivot. |
| `L:dm.a(IIIIII)V#22` | `rowSourceXQ12` | Row source X origin includes half-pixel -2048 correction and inverse sine row offset. |
| `L:dm.a(IIIIII)V#23` | `rowSourceYQ12` | Row source Y origin includes half-pixel -2048 correction and inverse cosine row offset. |
| `L:dm.a(IIIIII)V#24` | `sourcePixelX` | sourceXQ12>>12 passed to the bilinear sampler. |
| `L:dm.a(IIIIII)V#25` | `sourcePixelY` | sourceYQ12>>12 passed to the bilinear sampler. |
| `L:dm.a(IIIIII)V#26` | `clipScratch` | Reused for source-edge offset and divided skip-count calculations. |
| `L:dm.a(IIIIII)V#27` | `negativeRowCounter` | Starts at negative height and increments until zero. |
| `L:dm.a(IIIIII)V#28` | `sourceXQ12` | Source X accumulator passed as fraction coordinate to dm.c and advanced by inverse cosine. |
| `L:dm.a(IIIIII)V#29` | `sourceYQ12` | Source Y accumulator passed as fraction coordinate to dm.c and advanced by inverse sine. |
| `L:dm.a(IIIIII)V#3` | `corner0X` | First transformed horizontal corner expression, used by lower/upper X reduction. |
| `L:dm.a(IIIIII)V#30` | `negativePixelCounter` | Negative remaining width, adjusted by source clipping. |
| `L:dm.a(IIIIII)V#31` | `canSample` | Integer 0/1 tracks whether source clipping admits the inner bilinear sampling loop. |
| `L:dm.a(IIIIII)V#4` | `corner0Y` | First transformed vertical corner expression, used by lower/upper Y reduction; original pivot decrements remain intact. |
| `L:dm.a(IIIIII)V#5` | `corner1X` | Horizontal corner expression using width<<4, used in X bound reduction. |
| `L:dm.a(IIIIII)V#6` | `corner1Y` | Vertical corner expression using width<<4, used in Y bound reduction. |
| `L:dm.a(IIIIII)V#7` | `corner2X` | Horizontal corner expression using height<<4, used in X bound reduction. |
| `L:dm.a(IIIIII)V#8` | `corner2Y` | Vertical corner expression using height<<4, used in Y bound reduction; original pivot decrements remain intact. |
| `L:dm.a(IIIIII)V#9` | `corner3X` | Horizontal corner expression using width and height, used in X bound reduction. |
| `L:dm.b(IIIIII)V#0` | `writeIndexForwardXForwardY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has forward source-x stepping (var27) and forward source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#1` | `writeIndexForwardXReverseY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has forward source-x stepping (var27) and reverse source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#10` | `scaledSin` | floor(sin(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.b(IIIIII)V#11` | `scaledCos` | floor(cos(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.b(IIIIII)V#12` | `corner0X` | First transformed horizontal corner expression, used by lower/upper X reduction. |
| `L:dm.b(IIIIII)V#13` | `corner0Y` | First transformed vertical corner expression, used by lower/upper Y reduction; original pivot decrements remain intact. |
| `L:dm.b(IIIIII)V#14` | `corner1X` | Horizontal corner expression using width<<4, used in X bound reduction. |
| `L:dm.b(IIIIII)V#15` | `corner1Y` | Vertical corner expression using width<<4, used in Y bound reduction. |
| `L:dm.b(IIIIII)V#16` | `corner2X` | Horizontal corner expression using height<<4, used in X bound reduction. |
| `L:dm.b(IIIIII)V#17` | `corner2Y` | Vertical corner expression using height<<4, used in Y bound reduction; original pivot decrements remain intact. |
| `L:dm.b(IIIIII)V#18` | `corner3X` | Horizontal corner expression using width and height, used in X bound reduction. |
| `L:dm.b(IIIIII)V#19` | `corner3Y` | Vertical corner expression using width and height, used in Y bound reduction. |
| `L:dm.b(IIIIII)V#2` | `writeIndexForwardXFixedY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has forward source-x stepping (var27) and fixed source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#20` | `leftBound` | Minimum transformed X, converted to destination pixels and clipped against vb.field_e. |
| `L:dm.b(IIIIII)V#21` | `rightThenNegativeWidth` | Initially maximum/right X; overwritten with left-right before negative pixel-count loops. |
| `L:dm.b(IIIIII)V#22` | `topBound` | Minimum transformed Y, converted to destination pixels and clipped against vb.field_i. |
| `L:dm.b(IIIIII)V#23` | `bottomThenNegativeHeight` | Initially maximum/bottom Y; overwritten with top-bottom before negative row-count loops. |
| `L:dm.b(IIIIII)V#24` | `rowDestinationIndex` | top*framebuffer stride+left; advanced by stride after each nearest-neighbor row. |
| `L:dm.b(IIIIII)V#25` | `inverseScaleFactor` | 16777216.0/scale used in inverse sin/cos coefficients. |
| `L:dm.b(IIIIII)V#26` | `inverseSinStep` | floor(sin(angleRadians)*inverseScaleFactor+0.5); increments source Y for each destination pixel. |
| `L:dm.b(IIIIII)V#27` | `inverseCosStep` | floor(cos(angleRadians)*inverseScaleFactor+0.5); increments source X for each destination pixel. |
| `L:dm.b(IIIIII)V#28` | `destinationOffsetX` | (leftBound<<4)+8-destinationX at the first destination pixel center. |
| `L:dm.b(IIIIII)V#29` | `destinationOffsetY` | (topBound<<4)+8-destinationY at the first destination pixel center. |
| `L:dm.b(IIIIII)V#3` | `writeIndexReverseXForwardY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has reverse source-x stepping (var27) and forward source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#30` | `rowSourceXQ12` | Source pivot shifted by eight minus row-offset sine; decreases by inverseSinStep per row. |
| `L:dm.b(IIIIII)V#31` | `rowSourceYQ12` | Source pivot shifted by eight plus row-offset cosine; increases by inverseCosStep per row. |
| `L:dm.b(IIIIII)V#32` | `clipPixelCount` | Division results used to skip or limit pixels when source coordinates cross boundaries. |
| `L:dm.b(IIIIII)V#33` | `negativeRowCounter` | Starts at negative height and increments until zero. |
| `L:dm.b(IIIIII)V#34` | `destinationIndex` | Per-pixel destination pointer copied from the row start and advanced on each write/transparent sample. |
| `L:dm.b(IIIIII)V#35` | `sourceXQ12` | Source X accumulator indexed with >>12 and advanced by inverseCosStep. |
| `L:dm.b(IIIIII)V#36` | `sourceYQ12` | Source Y accumulator indexed with >>12 and advanced by inverseSinStep. |
| `L:dm.b(IIIIII)V#37` | `negativePixelCounter` | Starts at negative width, adjusted by source clipping and incremented until zero. |
| `L:dm.b(IIIIII)V#38` | `sampledPixel` | Reads pixels[(sourceY>>12)*width+(sourceX>>12)], zero is transparent. |
| `L:dm.b(IIIIII)V#4` | `writeIndexReverseXReverseY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has reverse source-x stepping (var27) and reverse source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#5` | `writeIndexReverseXFixedY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has reverse source-x stepping (var27) and fixed source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#6` | `writeIndexFixedXForwardY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has fixed source-x stepping (var27) and forward source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#7` | `writeIndexFixedXReverseY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has fixed source-x stepping (var27) and reverse source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#8` | `writeIndexFixedXFixedY` | Captured old destination index before increment, used for the corresponding framebuffer write. This branch has fixed source-x stepping (var27) and fixed source-y stepping (var26); the name distinguishes its captured destination index from the other eight branches. |
| `L:dm.b(IIIIII)V#9` | `angleRadians` | Masked 16-bit angle multiplied by 2*pi/65536 before sin/cos. |
| `L:ec.b(I)Z#10` | `firstMatchedEntity` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#11` | `secondMatchedEntity` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#12` | `thirdMatchedEntity` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#13` | `awardedPoints` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#15` | `popupX` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#17` | `popupY` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#19` | `candidateIndex` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#7` | `sortCursorThenFirstEntityId` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#8` | `packedCandidateThenSecondEntityId` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:ec.b(I)Z#9` | `thirdEntityId` | Match processing sorts packed candidates and decodes three 10-bit entity IDs; eligible triples receive 30 or 90 times chain length and a popup at the first decoded entity position. Reused sort/decode variables retain both roles. |
| `L:gh.a(B)V#16` | `renderedEntity` | gh.java reads successive ja instances from entity lists and uses each sprite's position/lifetime to calculate its rendered coordinates and opacity. |
| `L:gh.a(B)V#17` | `entityOffsetX` | gh.java computes entity.field_o-320 before applying the session board-angle sine/cosine transform. |
| `L:gh.a(B)V#19` | `entityOffsetY` | gh.java computes entity.field_v-240 before applying the session board-angle sine/cosine transform. |
| `L:gh.a(B)V#21` | `renderedEntityX` | gh.java derives var11 from the entity offsets and board-angle rotation, then passes it to vb.d for entity drawing. |
| `L:gh.a(B)V#22` | `renderedEntityY` | gh.java derives var12 from the entity offsets and board-angle rotation, then passes it to vb.d for entity drawing. |
| `L:gh.a(B)V#23` | `entityOpacity` | gh.java computes 255-entity.field_r*255/entity.field_p, clamps the result to 11..255 and passes it as the drawing alpha. |
| `L:gh.a(BI)V#0` | `pointsForCounters` | Copies points amount for per-mode score counters. |
| `L:gh.a(BI)V#1` | `counterSplitMode` | kd.field_c modulo three selects how added points are split across counters. |
| `L:gh.a(BI)V#2` | `oneThirdPoints` | One third of added points in mixed counter mode. |
| `L:gh.a(Z)V#0` | `shrinkingDiameter` | Result render uses 920 minus the scene tick as shrinking diameter and displays resultBonusPoints in the shrinking/countdown phases. |
| `L:gh.a(Z)V#2` | `shrinkingBonusText` | Result render uses 920 minus the scene tick as shrinking diameter and displays resultBonusPoints in the shrinking/countdown phases. |
| `L:gh.a(Z)V#3` | `countdownBonusText` | Result render uses 920 minus the scene tick as shrinking diameter and displays resultBonusPoints in the shrinking/countdown phases. |
| `L:gh.b(B)V#2` | `precedingThemeId` | Scene transition searches the theme list, wraps to the preceding entry and uses that ID for the existing action dispatch. The reused index later holds the theme ID. |
| `L:gh.b(B)V#3` | `themeIndexThenId` | Scene transition searches the theme list, wraps to the preceding entry and uses that ID for the existing action dispatch. The reused index later holds the theme ID. |
| `L:gh.e(I)V#0` | `remainingThemeReleases` | Normal HUD computes releasesPerTheme minus releasedInCurrentTheme. |
| `L:gh.f(I)V#10` | `spriteOffsetFromCenterX` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#11` | `spriteOffsetFromCenterY` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#12` | `spriteColumn` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#13` | `spriteRow` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#14` | `pixelOffsetFromCenterX` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#15` | `pixelOffsetFromCenterY` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#16` | `pixelRadiusSquared` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#18` | `endingEntity` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#8` | `resultProgressPercent` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.f(I)V#9` | `maxRadiusSquared` | Result initialization scans nonzero sprite pixels relative to (320,240) to find radius; the later progress value is sceneAnimationTick*100/460 for audio. |
| `L:gh.g(I)V#0` | `lineSpacing` | Font field_o-field_q plus the method argument; passed as text line spacing and used for prompt height. |
| `L:gh.g(I)V#1` | `promptWidthThenButtonX` | Set to 460, used for prompt line measurement and rendering; later also a button text x position. |
| `L:gh.g(I)V#2` | `promptHeight` | Thirty pixels plus measured line count times line spacing; used for the background height with ten pixels padding. |
| `L:gh.g(I)V#3` | `promptTop` | Step-dependent y origin (232/280/270/300) for tutorial background and text placement. |
| `L:gh.g(I)V#5` | `promptText` | Tutorial text selected by uk.a(tutorialStepId,24146) and passed to font measuring/rendering. |
| `L:ja.a(FI)V#0` | `velocityNormalizationScale` | ja.java sets var5 to og.field_r divided by the magnitude of the rotated velocity vector and multiplies both velocity components by it. |
| `L:ja.a(FI)V#1` | `positionOffsetX` | ja.java computes field_o-320 into var3 and uses it in the position rotation before restoring the center offset. |
| `L:ja.a(FI)V#2` | `positionOffsetY` | ja.java computes field_v-240 into var4 and uses it in the position rotation before restoring the center offset. |
| `L:ja.a(IFIFIIFFFIF)V#0` | `velocityNormalizationScale` | ja.java sets var12 to og.field_r divided by sqrt(param3^2+param8^2), then scales field_w and field_F with it. |
| `L:ja.a(Lja;I)V#0` | `relatedEntitySearchIndex` | ja.java initializes the array search cursor from param1, compares field_n[cursor] to param0, and increments the cursor until field_L. |
| `L:ja.b(II)I#0` | `paddingToByteBoundary` | ja.java computes 8-(param1&7) when needed so the return value reaches the next multiple-of-eight bit offset. |
| `L:ja.b(II)I#1` | `byteAlignedBitOffset` | ja.java returns param1 plus the padding amount computed in var2. |
| `L:ja.b(Z)V#0` | `kind2AnimationFrame` | ja.java captures field_G before incrementing it, then indexes ka.field_m with that saved animation frame. Captured frame used in the entitySpriteKindId == 2 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#1` | `kind8AnimationFrame` | ja.java captures field_G before incrementing it, then indexes ej.field_a with that saved animation frame. Captured frame used in the entitySpriteKindId == 8 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#2` | `kind5AnimationFrame` | ja.java captures field_G before incrementing it, then indexes mi.field_B with that saved animation frame. Captured frame used in the entitySpriteKindId == 5 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#3` | `kind6AnimationFrame` | ja.java captures field_G before incrementing it, then indexes vj.field_a with that saved animation frame. Captured frame used in the entitySpriteKindId == 6 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#4` | `kind3AnimationFrame` | ja.java captures field_G before incrementing it, then indexes hb.field_d with that saved animation frame. Captured frame used in the entitySpriteKindId == 3 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#5` | `kind7AnimationFrame` | ja.java captures field_G before incrementing it, then indexes hg.field_b with that saved animation frame. Captured frame used in the entitySpriteKindId == 7 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#6` | `kind4AnimationFrame` | ja.java captures field_G before incrementing it, then indexes fc.field_g with that saved animation frame. Captured frame used in the entitySpriteKindId == 4 animation branch; the kind ID distinguishes it from the other frame captures without retaining the opaque variable spelling. |
| `L:ja.b(Z)V#7` | `paletteBlendFraction` | ja.java derives var2 from field_I%50 times 0.02 and uses it to interpolate field_q from the current theme palette and RGB deltas. |
| `L:ja.f(I)V#1` | `clipLeftX` | ja.java begins with the sprite's left edge relative to field_o, then clips it at zero and adjusts the clipped width. |
| `L:ja.f(I)V#2` | `clipTopY` | ja.java begins with the sprite's top edge relative to field_v, clips it at zero and adjusts the clipped height. |
| `L:ja.f(I)V#3` | `clippedWidth` | ja.java initializes the sprite rectangle width and shortens it against bk.field_a.field_r after left clipping. |
| `L:ja.f(I)V#4` | `clippedHeight` | ja.java initializes the sprite rectangle height and shortens it against bk.field_a.field_m after top clipping. |
| `L:ja.f(I)V#5` | `framebufferIndex` | ja.java starts var6 at clipLeft+stride*clipTop and advances it through framebuffer writes. |
| `L:ja.f(I)V#6` | `rowSkip` | ja.java assigns stride-clippedWidth to var7 and adds it after finishing each row. |
| `L:ja.f(I)V#7` | `negativeColumnCounter` | ja.java starts var9 at negative clipped width and increments it through each pixel in a row. |
| `L:ja.f(I)V#8` | `controlFlowGuard` | ja.java:204 assigns Geoblox.field_C to var10; it is the shared control-flow guard, not a raster address. The separate var6 holds the pixel cursor initialized at ja.java:243 and advanced by the scan loops. |
| `L:ja.f(I)V#9` | `framebufferPixels` | ja.java assigns bk.field_a.field_v to var14 and reads/writes its pixel values while erasing keyed pixels. |
| `L:ja.g(I)V#0` | `entityOffsetX` | ja.java computes field_o-320 into var2 and uses it as the X component of the board-angle cosine/sine transform. |
| `L:ja.g(I)V#1` | `entityOffsetY` | ja.java computes field_v-240 into var3 and uses it as the Y component of the board-angle transform. |
| `L:ja.g(I)V#2` | `rotatedEntityX` | ja.java computes var4 from var2*cos(boardAngle)-var3*sin(boardAngle)+320 and passes it to the sprite draw path. |
| `L:ja.g(I)V#3` | `rotatedEntityY` | ja.java computes var5 from var2*sin(boardAngle)+var3*cos(boardAngle)+240 and passes it to the sprite draw path. |
| `L:ja.j(I)V#1` | `entityOffsetX` | ja.java computes field_o-320 and uses this X offset in board-angle projection. |
| `L:ja.j(I)V#10` | `framebufferRowSkip` | ja.java computes stride-clippedWidth into var11 and adds it after completing each row. |
| `L:ja.j(I)V#11` | `negativeColumnCounter` | ja.java initializes var13 to negative clipped width and increments it across pixels in the inner row loop. |
| `L:ja.j(I)V#13` | `backgroundPixels` | ja.java assigns wd.field_b.field_v to var18 and clears pixels matching field_H+1 in the clipped framebuffer region. |
| `L:ja.j(I)V#2` | `entityOffsetY` | ja.java computes field_v-240 and uses this Y offset in board-angle projection. |
| `L:ja.j(I)V#3` | `rotatedEntityX` | ja.java rotates var2/var3 with board angle and adds 320 to produce the clipped sprite's screen X. |
| `L:ja.j(I)V#4` | `rotatedEntityY` | ja.java rotates var2/var3 with board angle and adds 240 to produce the clipped sprite's screen Y. |
| `L:ja.j(I)V#5` | `clipLeftX` | ja.java derives var6 from projected entity X, sprite half-width and wd.field_a, then clips its lower bound to zero. |
| `L:ja.j(I)V#6` | `clipTopY` | ja.java derives var7 from projected entity Y, sprite half-height and wd.field_d, then clips its lower bound to zero. |
| `L:ja.j(I)V#7` | `clippedSpriteWidth` | ja.java starts var8 at offscreen sprite width plus eight and reduces it against wd.field_b.field_r. |
| `L:ja.j(I)V#8` | `clippedSpriteHeight` | ja.java starts var9 at offscreen sprite height plus eight and reduces it against wd.field_b.field_m. |
| `L:ja.j(I)V#9` | `framebufferIndex` | ja.java initializes var10 as wd.field_b.field_r*clipTopY+clipLeftX, then advances it over the clipped rectangle. |
| `L:ja.n(I)V#0` | `entityOffsetX` | ja.java computes field_o-320 before rotating the entity center into board coordinates. |
| `L:ja.n(I)V#1` | `entityOffsetY` | ja.java computes field_v-240 before rotating the entity center into board coordinates. |
| `L:ja.n(I)V#2` | `boardAngle` | ja.java assigns el.field_o.field_J to var4 and uses its sine and cosine to transform the entity center. |
| `L:ja.n(I)V#3` | `rotatedEntityX` | ja.java calculates the transformed horizontal entity coordinate around screen center and later subtracts half the sprite width. |
| `L:ja.n(I)V#4` | `rotatedEntityY` | ja.java calculates the transformed vertical entity coordinate around screen center and later subtracts half the sprite height. |
| `L:ja.n(I)V#5` | `sentinelDivisionGuard` | ja.java uses this only in a division-by-zero guard tied to the obfuscated sentinel argument; retained as control guard, not treated as gameplay state. |
| `L:ja.n(I)V#6` | `entityDrawX` | ja.java computes var8 as rotated screen X minus half the offscreen sprite width before the draw call. |
| `L:ja.n(I)V#7` | `entityDrawY` | ja.java computes var9 from rotated screen Y and half the offscreen sprite height before drawing. |
| `L:ja.n(I)V#8` | `fadeOpacity` | ja.java derives var10 from remaining and initial lifetime, clamps it to 0..256, and passes it to vf.field_L.d as the sprite alpha. |
| `L:ja.n(I)V#9` | `controlFlowGuard` | ja.java assigns Geoblox.field_C to var11 for decompiler control-flow branching; it is not a gameplay state value. |
| `L:ka.a(I)V#1` | `itemIndex` | Rendering row loop index bounded by item count. |
| `L:ka.a(I)V#2` | `rowY` | Starts at first-item Y and advances by row spacing. |
| `L:ka.a(Z)V#0` | `hitItemIndex` | Result of menu hit test, used for selection and pointer dispatch. |
| `L:kc.b(I)V#42` | `activeEntity` | kc.java obtains var1 from ji.field_r.g(0), processes its queue/special-state membership, then advances with ji.field_r.d(1). |
| `L:kc.b(I)V#43` | `entityIndexThenGroupCount` | kc.java first uses var1_int to clear pk.field_o entries across the 1000 entity slots, then resets it and counts processed entity groups. |
| `L:kc.b(I)V#45` | `candidateEntity` | kc.java traverses a.field_d for this ja entity, rotates it against el.field_o.field_J, detaches related children and routes it to a processing list. |
| `L:kc.b(I)V#47` | `radialOffsetX` | kc.java computes 320-var2_ref_ja.field_o and normalizes it by the radius together with var4_float before assigning field_w. |
| `L:kc.b(I)V#49` | `queuedEntity` | kc.java iterates bh.field_c through ja elements, removes each from that list and may reinsert it into ra.field_a. |
| `L:kc.b(I)V#51` | `radialOffsetY` | kc.java computes 240-var2_ref_ja.field_v and normalizes it with var3_float before assigning field_F. |
| `L:kc.b(I)V#53` | `groupEntity` | kc.java obtains this ja from the temporary var13 list, iterates/removes its children and resets its child counters before continuing the outer entity-group walk. |
| `L:kc.b(I)V#54` | `radialVelocityScale` | kc.java assigns og.field_r/sqrt(var4_float^2+var3_float^2) to var5 and multiplies both radial offset components by it. |
| `L:kc.b(I)V#55` | `childEntityIndex` | kc.java initializes var6_int to zero and increments it while iterating var12.field_n up to var12.field_L. |
| `L:kc.b(I)V#58` | `relatedEntityIndex` | kc.java loops var7_int from zero to var2_ref_ja.field_L and removes each field_n child from its parent. |
| `L:kc.b(I)V#59` | `relatedEntityCandidate` | kc.java obtains var8 from the temporary ja collection and compares it by identity against each parent child before list removal. |
| `L:kc.b(I)V#61` | `entityCandidate` | kc.java assigns the ja returned by var11.a(true), tests its category slot and field_t flag, and processes it in the nested-group pass. |
| `L:kc.b(I)V#63` | `parentEntity` | kc.java traverses the children of var12.field_L, removes its related entities and resets its category counts before relinking it. |
| `L:ld.a(I)Z#21` | `circleHorizontalOffset` | The boundary scan starts at horizontal offset 230 and vertical offset zero with radius squared 52900, updating the circle error and probing eight symmetric positions. |
| `L:ld.a(I)Z#22` | `circleVerticalOffset` | The boundary scan starts at horizontal offset 230 and vertical offset zero with radius squared 52900, updating the circle error and probing eight symmetric positions. |
| `L:ld.a(I)Z#23` | `playfieldRadiusSquared` | The boundary scan starts at horizontal offset 230 and vertical offset zero with radius squared 52900, updating the circle error and probing eight symmetric positions. |
| `L:ld.a(I)Z#25` | `circleError` | The boundary scan starts at horizontal offset 230 and vertical offset zero with radius squared 52900, updating the circle error and probing eight symmetric positions. |
| `L:sk.a(I)Z#10` | `staggeredLifetime` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#11` | `cascadeEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#12` | `neighborIndex` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#13` | `neighborEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#14` | `searchedEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#16` | `seedEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#17` | `cascadeFrontier` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#5` | `farthestEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#7` | `farthestRadiusSquared` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#8` | `candidateEntity` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:sk.a(I)Z#9` | `visitedCascadeEntities` | Boundary-loss handling searches for the farthest attached entity, then traverses relatedEntities using secondary-link frontier/visited queues and increments ending lifetimes by 50 for each visited entity. |
| `L:tf.a(I)I#1` | `nodeCount` | Incremented once per node walked before reaching the sentinel. |
| `L:tf.a(I)I#2` | `node` | Walk cursor advanced along the next-node chain in countNodes. |
| `L:tf.a(Ltf;ILhf;)V#0` | `lastMovedNode` | Saves the original source tail before splicing and installs it as the destination tail. |
| `L:tf.a(Z)Lhf;#0` | `lastNode` | Tail read from the sentinel previous link; initializes reverse traversal. |
| `L:tf.b(B)Lhf;#0` | `firstNode` | Head unlinked and returned, unless it is the sentinel. |
| `L:tf.b(I)Lhf;#0` | `node` | Saved reverse cursor, returned while the cursor advances to its predecessor. |
| `L:tf.c(B)V#0` | `removedNode` | Repeatedly reads and unlinks the head during clear. |
| `L:tf.d(I)Lhf;#0` | `node` | Saved forward cursor, returned while the cursor advances to its next node. |
| `L:tf.e(I)Lhf;#0` | `lastNode` | Tail unlinked and returned, unless it is the sentinel. |
| `L:tf.g(I)Lhf;#0` | `firstNode` | Head read from the sentinel next link; initializes forward traversal. |
| `L:ua.a([I)Lgd;#0` | `sampleIndex` | Indexes decoded float samples during conversion. |
| `L:ua.a([I)Lgd;#2` | `writePosition` | Current PCM output offset, committed to pcmWriteCursor after conversion. |
| `L:ua.a([I)Lgd;#3` | `samplesToWrite` | Decoded packet length clamped against output sample count. |
| `L:ua.a([I)Lgd;#4` | `unsignedPcmSample` | 128+float*128, clamped to byte range before subtracting 128 for signed PCM. |
| `L:ua.a([I)Lgd;#5` | `decodedSamples` | Float block returned by decodePacket. |
| `L:ua.a([I)Lgd;#6` | `completedPcm` | Saved completed PCM array before clearing resumable output storage. |
| `L:ua.b()I#0` | `bitValue` | One-bit return expression from the shared input cursor. |
| `L:ua.b(I)I#0` | `chunkMask` | (1<<chunkBitCount)-1 inside the byte-consuming loop. |
| `L:ua.b(I)I#1` | `chunkBitsThenMask` | Initially bits remaining in the byte; reused as tail-bit mask after the byte loop. |
| `L:ua.b(I)I#2` | `value` | Accumulated extracted bits returned by the method. |
| `L:ua.b(I)I#3` | `outputShift` | Total previously consumed bits; shifts each chunk into the result. |
| `L:ug.a(IZIII)V#0` | `popup` | The factory reuses a pooled ScorePopup and fills its instance fields before inserting it into the active queue. |
| `L:wa.a(I)I#0` | `unfinishedPoints` | Drains active popups with removeFirst and accumulates their points into the returned integer. |
| `L:wa.a(I)I#2` | `popup` | Drains active popups with removeFirst and accumulates their points into the returned integer. |
| `M:Geoblox.a(I)V` | `renderFrame` | ch draw turn invokes a(25853); GeoBlox draws loading/menu/game content and publishes Canvas. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.a(ILdm;)V` | `setRasterTarget` | Geoblox.java calls oc.b(9) and vb.a(param1.field_v,param1.field_s,param1.field_o), wiring the supplied sprite pixel buffer and dimensions into the software raster target. |
| `M:Geoblox.b(B)V` | `releaseGameResources` | Invokes global resource cleanup and clears game state references. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.b(I)V` | `initializeGame` | Initializes session configuration and 22050-Hz audio components. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.c(I)V` | `serviceAudio` | Services me.b audio outputs plus popup/host state; ch invokes c(1) during host service. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.c(Z)V` | `updateGame` | ch tick invokes c(false); GeoBlox polls loading, input and screen updates. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.e(Z)V` | `loadSpaceTheme` | Loads space foreground/background and sets themesLoaded[6]. |
| `M:Geoblox.f(Z)V` | `requestGameArchives` | Requests numbered game archives and configures resource providers. |
| `M:Geoblox.g(Z)Z` | `pollArchiveLoading` | Polls archive readiness and reports 5..25 percent loading progress; returns completion. |
| `M:Geoblox.h(Z)V` | `loadJewelsTheme` | Loads jewels foreground/background and sets themesLoaded[0]. |
| `M:Geoblox.i(B)V` | `loadGermsTheme` | Loads germs foreground/background and sets themesLoaded[3]. |
| `M:Geoblox.m(I)V` | `initializeScreens` | Constructs nine c screen objects in og.field_q and resets current/target screen state. |
| `M:Geoblox.n(I)V` | `loadSportsTheme` | Loads sports foreground/background and sets themesLoaded[5]. |
| `M:Geoblox.o(I)Z` | `prepareGameAssets` | Initializes music, sprites/fonts and interface resources over successive readiness stages; returns true on completion. |
| `M:Geoblox.p(I)V` | `loadSweetsTheme` | Loads sweets foreground/background and sets themesLoaded[2]. |
| `M:Geoblox.q(I)V` | `loadBakingTheme` | Loads baking foreground/background and sets themesLoaded[4]. |
| `M:Geoblox.r(I)V` | `clearAppletStatics` | Geoblox.java static cleanup sets field_B, field_z, field_A and field_y to null; these are the applet's cached resource/message statics. |
| `M:ab.a(IF)V` | `moveEntitiesAndCollectContacts` | Advances moving-entity positions, computes motion relative to the rotated board and queues ownership-mask contact candidates. |
| `M:bd.a(I)V` | `drawScorePopups` | Interpolates active popup position toward the points panel and renders either plain points or chain multiplier plus points. |
| `M:c.a(BI)V` | `increaseMenuValue` | Concrete increases music/effect sliders by ten; base dispatches right-direction keys here. Both base and concrete declarations are renamed. |
| `M:c.a(I)V` | `renderScreen` | Geoblox render calls c.a(-28750); base implementation renders item rows, concrete draws complete screen. Both base and concrete declarations are renamed. |
| `M:c.a(IB)V` | `decreaseMenuValue` | Concrete decreases music/effect sliders by ten; base dispatches left-direction keys here. Both base and concrete declarations are renamed. |
| `M:c.a(II)V` | `handleMenuKey` | Base dispatches key codes to decrease/increase/activate item; concrete adds screen-specific shortcuts. Both base and concrete declarations are renamed. |
| `M:c.a(IIB)I` | `hitTestMenuItem` | Called with pointer X/Y; returns selected menu row or -1 from screen-specific geometry. Both base and concrete declarations are renamed. |
| `M:c.a(IIZIZI)V` | `handleMenuPointer` | Base pointer polling dispatches row, X, click/hold flags, row-relative Y and button; concrete handles sliders and activation. Both base and concrete declarations are renamed. |
| `M:c.a(ZBII)V` | `renderMenuItem` | Base render loops call with selection flag, row index and row Y; concrete draws label/slider content. Both base and concrete declarations are renamed. |
| `M:c.b(B)V` | `handleScreenKey` | Called while hh key events remain; branches on ki.field_d for navigation, activation and shortcuts. |
| `M:c.b(IB)V` | `activateMenuItem` | Dispatches per-screen action ID, requests screens, resumes play or creates new gh gameplay session. Both base and concrete declarations are renamed. |
| `M:c.c(I)V` | `updateTransition` | Geoblox calls on outgoing/incoming screens while their IDs differ; advances animation without normal screen input. |
| `M:c.c(II)V` | `setItemCount` | Assigns inherited item count from second argument; called after action-array length changes. |
| `M:c.d(I)V` | `previewMusicVolume` | Starts sample 8 at j.field_gb volume, retaining preview stream and resetting preview ticks. |
| `M:c.h(B)V` | `updateScreen` | Geoblox calls this on committed nonnegative screen ID; advances animation, processes keyboard/pointer and screen-specific state. |
| `M:cf.d(B)V` | `advanceScorePopups` | Increases active popup progress; once it reaches one, credits points to score or the pending panel and returns the popup to the free pool. |
| `M:ch.a(I)V` | `renderFrame` | ch draw turn invokes a(25853); GeoBlox draws loading/menu/game content and publishes Canvas. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.b(B)V` | `releaseGameResources` | Invokes global resource cleanup and clears game state references. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.b(I)V` | `initializeGame` | Initializes session configuration and 22050-Hz audio components. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.c(I)V` | `serviceAudio` | Services me.b audio outputs plus popup/host state; ch invokes c(1) during host service. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.c(Z)V` | `updateGame` | ch tick invokes c(false); GeoBlox polls loading, input and screen updates. Rename abstract declaration and implementation as one virtual family. |
| `M:dc.a(I)V` | `drawAttachedEntities` | Iterates the attached entity queue and draws its entity sprites. |
| `M:dm.a(IIIIII)V` | `rotateSmooth` | Smooth transform covered by test-smooth-rotation-parameters.mjs. |
| `M:dm.b(IIIIII)V` | `rotateNearest` | Nearest-neighbor transform covered by test-rotation-parameters.mjs. |
| `M:dm.c(IIIII)V` | `sampleBilinear` | Four source neighbors weighted by fractions masked to 4095, then destination write. |
| `M:ec.b(I)Z` | `processMatchCandidates` | Sorts/deduplicates packed triples, checks each entity cooldown, awards chain-scaled points and returns whether a nonempty batch was processed. |
| `M:ef.b(B)V` | `advanceActiveEntityAnimations` | ef.java takes el.field_o.field_J as the current board angle, traverses bh.field_c ja entities and calls ja.b(true); entities reaching the frame threshold are attached to ra.field_a for follow-up processing. |
| `M:gh.a(B)V` | `renderSession` | Called by Geoblox gameplay drawing; renders theme, rotating board, entities, text and overlays. |
| `M:gh.a(BI)V` | `addScore` | Adds second argument to score, formats/clamps display and updates score-dependent counters. |
| `M:gh.a(I)V` | `updateSession` | Called by Geoblox when current/requested screen IDs are -1; updates input, board/session logic and animations. |
| `M:gh.a(II)V` | `addPopupPoints` | Adds first argument to accumulated popup points and updates corresponding text. |
| `M:gh.a(Z)V` | `renderResultSequence` | Draws the phase-2 expansion, phase-3 shrinking circle with bonus text and the later fading countdown. |
| `M:gh.b(B)V` | `updateSceneTransition` | Advances the scene animation to tick 160, prepares the next theme or resets score at tick zero, clears entity queues and commits transition flags at completion. |
| `M:gh.b(I)V` | `advanceTutorialStep` | Moves phase two to the next step and prompt phase zero; phase one checks rotation/colour/shape progress and sets phase two. |
| `M:gh.b(Z)Z` | `canAdvanceSession` | gh.java returns false only when the session is not in field_H and field_bb is zero; gh.a(I)V checks this result before advancing its session logic. |
| `M:gh.c(I)V` | `leaveTutorial` | Sets tutorialMode false, enables field_H and clears field_f/field_C; called when proceeding from tutorial and by tutorial progression. |
| `M:gh.c(Z)V` | `emitPointsPopup` | Creates ld popup for accumulated points, plays sample 32 and resets pending points. |
| `M:gh.d(B)V` | `startSessionEndSequence` | gh.java's external caller sk.java invokes this on the active session; it marks the session end sequence, emits accumulated points, updates the score display and enters the subsequent result flow. |
| `M:gh.d(I)V` | `requestSessionExitScreen` | Chooses requested screen 0, 2, 4 or 6 from session score/progression and fh.c branch, then starts exit audio. |
| `M:gh.e(B)V` | `submitScore` | Submits positive score through qf when eligible; clears ca pending record. |
| `M:gh.e(I)V` | `renderProgressHud` | Draws the remaining release count in normal play and the phase-specific HUD text otherwise. |
| `M:gh.f(I)V` | `updateResultSequence` | Initializes the ending sprite radius/bonus, advances expansion/shrink/countdown phases and emits the bonus popups at completion. |
| `M:gh.g(I)V` | `renderTutorialPrompt` | When tutorial phase is zero, selects uk.a(step) and draws the prompt and continue/replay buttons; step five has both choices. |
| `M:gh.h(I)V` | `resetScoreState` | Zeros score/popup accumulation, initializes associated score bookkeeping values and text using existing scoring methods, and resets the points panel position. |
| `M:gh.j(I)V` | `prepareNextTheme` | Resets the session phase/result fields, selects the next theme ID and requests its assets/music. |
| `M:gj.f(B)V` | `drawSpecialAttachedEntities` | Draws attached entities whose sprite-kind ID is nonzero. |
| `M:hd.f(I)V` | `recordEntityRelease` | Increments theme/difficulty release counts and requests a theme transition or advances difficulty at their thresholds. |
| `M:hf.a(Z)V` | `unlinkNode` | When the false guard is supplied, reconnects previous/next neighbours and clears both links; tf removal and insertion call this method. |
| `M:ih.a(I)Z` | `areEntityQueuesSettled` | Returns true only when moving, spawn and transient animation queues are empty and the additional jl.field_t gate is clear. The attached queue may remain nonempty. |
| `M:ih.a(IILja;I)V` | `linkEntityAtMaskContacts` | Probes mask coordinates, resolves encoded entity IDs and records avatar or entity contacts. |
| `M:ik.a(Lja;Lja;Z)Z` | `linkTouchingEntities` | Links the entity pair and related-entity/category/variant counts while resolving the original special-kind contact rules. |
| `M:il.b(IIIIII)V` | `rotateNearest` | Javac resolves this override of dm.b(IIIIII)V; retain the complete virtual family. |
| `M:ja.a(FI)V` | `rotateEntityAroundBoard` | ja.java rotates the position offset from (320,240) using the float argument's sin/cos, updates positionX/positionY, recalculates the radial velocity components, and adjusts field_u. |
| `M:ja.a(IFIFIIFFFIF)V` | `initializeEntityMotion` | ja.java stores the supplied position, velocity, category, variant and lifetime into the entity, normalizes the two velocity components to og.field_r, resets related counters and selects its sprite. |
| `M:ja.a(IIII)V` | `configureEntitySprite` | ja.java method a(int,int,int,int) stores sprite variant, entity visual mode and related selector values, then calls private g(byte) to choose the corresponding image. |
| `M:ja.a(Lja;I)V` | `removeRelatedEntity` | ja.java scans field_n beginning at the supplied index, removes the matching ja instance, shifts remaining array entries and updates related counts; kc.java invokes it while reconciling entity groups. |
| `M:ja.a(ZLkl;)V` | `registerAudioStream` | ja.java:772-779 is a static helper that enqueues a je wrapping the kl stream in qa.field_f and registers it with the global mixer ge.field_d. Callers include the menu volume preview at c.java:4438-4439, general playback at td.java:159 and session audio at gh.java:4291; no entity instance is involved. |
| `M:ja.b(II)I` | `alignBitOffset` | ja.java rounds the second integer upward to the next multiple of eight using param1&7; the first integer only guards the decompiler's sentinel path. |
| `M:ja.b(Z)V` | `advanceEntityAnimation` | ja.java method b(boolean) advances field_I, decrements the remaining lifetime, and selects successive sprite frames using tick modulo checks. |
| `M:ja.e(I)V` | `drawEntityAtPosition` | ja.java method e(int) draws field_J using field_o and field_v, with an additional offscreen/rotation path for visual mode 1. |
| `M:ja.f(B)V` | `integrateEntityVelocity` | ja.java method f(byte) adds field_w to field_o and field_F to field_v, directly integrating the two velocity components into position. |
| `M:ja.f(I)V` | `eraseEntityPixels` | ja.java clips the entity sprite rectangle to bk.field_a bounds, scans framebuffer pixels and clears only pixels equal to field_H+1. |
| `M:ja.g(B)V` | `selectEntitySprite` | ja.java private g(byte) selects field_J from the theme-specific sprite arrays according to the stored variant and frame indices, then prepares palette deltas. |
| `M:ja.g(I)V` | `drawBoardRotatedEntity` | ja.java rotates field_o/field_v around (320,240) by el.field_o.field_J, then draws or transforms field_J at the resulting board-relative coordinates. |
| `M:ja.h(B)V` | `drawEntityIdOnPointerMask` | Rotates the sprite against board angle, fills it with entityId+1 and stamps into wd.field_b at the named pointer coordinates. |
| `M:ja.i(I)V` | `resetEntityAnimation` | Clears entity queue/update tick/flags/frame, selects the sprite and resets field_E; called by construction and initializeEntityMotion. |
| `M:ja.j(I)V` | `eraseEntityTrail` | ja.java rotates the entity center into board coordinates, clips the sprite rectangle against wd.field_b, then clears matching field_H+1 pixels from that raster. |
| `M:ja.k(I)V` | `drawEntityIdOnBoardMask` | Renders the entity sprite into vf.field_L then stamps entityId+1 into bk.field_a; restores raster state and draws the board mask. |
| `M:ja.l(I)V` | `drawRotatedEntityOnCurrentRaster` | Rotates the entity sprite at its current position and angle into the current raster target; does not install a new raster target. |
| `M:ja.m(I)V` | `updatePaletteChannelDeltas` | ja.java method m(int) extracts adjacent palette entries from jg.field_h and stores their red, green and blue channel differences in field_s, field_x and field_y. |
| `M:ja.n(I)V` | `drawFadingEntity` | ja.java method n(int) computes a bounded opacity from field_r and field_p and passes it to the sprite draw call after positioning and rotation. |
| `M:ka.a(BI)V` | `increaseMenuValue` | Concrete increases music/effect sliders by ten; base dispatches right-direction keys here. Both base and concrete declarations are renamed. |
| `M:ka.a(I)V` | `renderScreen` | Geoblox render calls c.a(-28750); base implementation renders item rows, concrete draws complete screen. Both base and concrete declarations are renamed. |
| `M:ka.a(IB)V` | `decreaseMenuValue` | Concrete decreases music/effect sliders by ten; base dispatches left-direction keys here. Both base and concrete declarations are renamed. |
| `M:ka.a(II)V` | `handleMenuKey` | Base dispatches key codes to decrease/increase/activate item; concrete adds screen-specific shortcuts. Both base and concrete declarations are renamed. |
| `M:ka.a(IIB)I` | `hitTestMenuItem` | Called with pointer X/Y; returns selected menu row or -1 from screen-specific geometry. Both base and concrete declarations are renamed. |
| `M:ka.a(IIZIZI)V` | `handleMenuPointer` | Base pointer polling dispatches row, X, click/hold flags, row-relative Y and button; concrete handles sliders and activation. Both base and concrete declarations are renamed. |
| `M:ka.a(Z)V` | `updatePointer` | Polls click/held/hover coordinates and invokes menu handlers; inherited final method. |
| `M:ka.a(ZBII)V` | `renderMenuItem` | Base render loops call with selection flag, row index and row Y; concrete draws label/slider content. Both base and concrete declarations are renamed. |
| `M:ka.b(IB)V` | `activateMenuItem` | Dispatches per-screen action ID, requests screens, resumes play or creates new gh gameplay session. Both base and concrete declarations are renamed. |
| `M:kc.b(I)V` | `reconcileBoardEntities` | gh.java calls kc.b(...) from the gameplay update after ef.b(...). kc.java traverses ja lists, removes/relinks entities and related children, projects positions against the board radius, and sets el.field_o.field_F when entity state changes. |
| `M:lc.a(I)V` | `updateSpawnQueue` | Updates staged entities and transfers ready members to moving entities unless spawnReleaseDisabled is set. |
| `M:ld.a(I)Z` | `hasPixelsAtPlayfieldBoundary` | Probes symmetric pixels around a radius-230 circle centered at (320,240) in the currently selected raster and returns on the first nonzero pixel. |
| `M:ld.b(Z)V` | `advanceDifficulty` | Increments the difficulty step and loads its existing motion, angular-speed and release-threshold tables. |
| `M:nb.a(IIIIIZ)V` | `spawnEntityAtPointer` | Initializes an entity at pointer coordinates with the supplied category/variant and optional special-kind selection. |
| `M:rc.a(B)V` | `unlinkSecondaryNode` | Reconnects field_l/field_k neighbours and clears both second links without touching inherited hf links. |
| `M:rh.a(B)V` | `updateAttachedEntities` | Iterates the attached queue, decreases match cooldowns, updates the selected sprites, checks avatar-contact special effects and computes the maximum squared distance from the board center. |
| `M:sk.a(I)Z` | `checkBoundaryLossAndStartCascade` | Checks the ownership raster boundary outside scene transitions; on loss starts the end sequence and traverses contacts from the farthest entity to assign staggered ending lifetimes. |
| `M:tf.a(I)I` | `countNodes` | Walks from sentinel.field_b until returning to the sentinel, counting each node. |
| `M:tf.a(ILhf;)V` | `addLast` | Unlinks the argument if already linked, then inserts it before the sentinel after the previous tail. |
| `M:tf.a(Lhf;Z)V` | `addFirst` | Unlinks the argument if already linked, then inserts it after the sentinel before the previous head. |
| `M:tf.a(Ltf;B)V` | `moveAllTo` | Delegates to the private range-splice helper with this deque first node and the supplied destination deque. |
| `M:tf.a(Ltf;ILhf;)V` | `moveSuffixTo` | Rewires a suffix beginning at param2 through this deque tail onto the destination tail; leaves the suffix removed from this deque. |
| `M:tf.a(Z)Lhf;` | `lastForIteration` | Returns sentinel.field_c without unlinking and saves its predecessor in the iteration cursor. |
| `M:tf.b(B)Lhf;` | `removeFirst` | Reads sentinel.field_b, returns null if sentinel, otherwise unlinks and returns the head. |
| `M:tf.b(I)Lhf;` | `previousForIteration` | Returns the saved cursor and advances it through field_c, ending at the sentinel. |
| `M:tf.c(B)V` | `clearNodes` | Repeatedly unlinks the head until sentinel.field_b is the sentinel, then clears the iteration cursor. |
| `M:tf.c(I)Z` | `isEmpty` | Tests whether sentinel.field_b is the sentinel itself. |
| `M:tf.d(I)Lhf;` | `nextForIteration` | Returns the saved cursor and advances it through field_b, ending at the sentinel. |
| `M:tf.e(I)Lhf;` | `removeLast` | Reads sentinel.field_c, returns null if sentinel, otherwise unlinks and returns the tail. |
| `M:tf.g(I)Lhf;` | `firstForIteration` | Returns sentinel.field_b without unlinking and saves its next link in the iteration cursor. |
| `M:ua.a([BI)V` | `setBitInput` | Sets shared bitstream bytes and byte cursor, resetting bit cursor to zero. |
| `M:ua.a([I)Lgd;` | `decodePcmBudgeted` | Converts decoded packets to signed PCM bytes, preserving packet/write cursors when sample budget is exhausted. |
| `M:ua.b()I` | `readBit` | Reads one bit at shared byte/bit cursor. |
| `M:ua.b(I)I` | `readBits` | Reads the requested bit count across byte boundaries. |
| `M:ua.b([B)V` | `readPacketContainer` | Reads sample metadata and length-prefixed packet payloads from qc; retains IOException behavior. |
| `M:ua.c()Lgd;` | `decodePcm` | Decodes all packets and builds gd from complete PCM output. |
| `M:ua.c(I)[F` | `decodePacket` | Selects field_p packet by index and computes float output during music loading. |
| `M:ug.a(IZIII)V` | `spawnScorePopup` | Takes a popup from the pool, initializes its points, chain and origin, and inserts it into the active queue. If the pool is empty it credits points directly. |
| `M:uk.a(II)Ljava/lang/String;` | `tutorialMessageForStep` | Maps step IDs 0,1,2,3,5 to the five explicit tutorial strings; other IDs return null. |
| `M:ul.b(I)V` | `collectMatchCandidates` | Collects triples of connected entities sharing variant or category, storing sorted entity IDs and equality flags in the packed candidate array. |
| `M:wa.a(I)I` | `collectUnfinishedPopupPoints` | Removes every active popup and returns the sum of its uncredited points without multiplying them again. |
| `P:ab.a(IF)V#1` | `boardAngleRadians` | Used to rotate entity movement/contact coordinates relative to the board. |
| `P:c.a(BI)V#1` | `itemIndex` | Indexes action IDs for increase operation. |
| `P:c.a(IB)V#0` | `itemIndex` | Indexes action IDs for decrease operation. |
| `P:c.a(II)V#0` | `itemIndex` | Selected row passed to key handling. |
| `P:c.a(IIB)I#0` | `pointerX` | Horizontal pointer coordinate tested against menu bounds. |
| `P:c.a(IIB)I#1` | `pointerY` | Vertical pointer coordinate tested against menu rows. |
| `P:c.a(IIZIZI)V#0` | `itemIndex` | Row index from hit test or retained pointer selection. |
| `P:c.a(IIZIZI)V#1` | `pointerX` | Pointer X, converted to slider-relative coordinate by concrete handler. |
| `P:c.a(IIZIZI)V#2` | `initialClick` | True for initial click path; false for held-button repeat. |
| `P:c.a(IIZIZI)V#3` | `rowOffsetY` | Pointer Y minus top and row spacing. |
| `P:c.a(IIZIZI)V#4` | `heldRepeat` | True in held-button path, controls repeat timing in base handler. |
| `P:c.a(IIZIZI)V#5` | `pointerButton` | Click/held button value; controls activation or value adjustment. |
| `P:c.a(ZBII)V#0` | `selected` | True for the selected row when rendering. |
| `P:c.a(ZBII)V#2` | `itemIndex` | Row index supplied by render loop. |
| `P:c.a(ZBII)V#3` | `rowY` | Row Y supplied by render loop and used in text/slider drawing. |
| `P:c.b(IB)V#0` | `itemIndex` | Indexes action IDs for activation. |
| `P:c.c(II)V#1` | `itemCount` | Copied into inherited item count. |
| `P:dm.a(IIIIII)V#0` | `sourcePivotX` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#1` | `sourcePivotY` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#2` | `destinationX` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#3` | `destinationY` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#4` | `angle` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#5` | `scale` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#0` | `sourcePivotX` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#1` | `sourcePivotY` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#2` | `destinationX` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#3` | `destinationY` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#4` | `angle` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#5` | `scale` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.c(IIIII)V#0` | `destinationIndex` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#1` | `sourceX` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#2` | `sourceY` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#3` | `fractionX` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#4` | `fractionY` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:gh.a(BI)V#1` | `points` | Value added to score. |
| `P:gh.a(II)V#0` | `points` | Value added to popup points. |
| `P:gh.c(Z)V#0` | `markSubmissionBlocked` | When true sets field_K, which blocks score submission. |
| `P:ih.a(IILja;I)V#1` | `contactY` | Y coordinate of the ownership-mask contact probe. |
| `P:ih.a(IILja;I)V#2` | `entity` | Entity being linked to contacts decoded from the ownership mask. |
| `P:ih.a(IILja;I)V#3` | `contactX` | X coordinate of the ownership-mask contact probe. |
| `P:ik.a(Lja;Lja;Z)Z#0` | `firstEntity` | First member of the touching pair whose reciprocal neighbor counts are updated. |
| `P:ik.a(Lja;Lja;Z)Z#1` | `secondEntity` | Second member of the touching pair whose reciprocal neighbor counts are updated. |
| `P:ja.a(FI)V#0` | `rotationDeltaRadians` | ja.java applies param0 in sin/cos rotation of the position offset from (320,240), rotates velocity and adjusts the entity angle by the same delta. |
| `P:ja.a(IFIFIIFFFIF)V#1` | `positionX` | ja.java assigns param1 directly to field_o, which is the horizontal position rotated around screen center and rendered by its sprite methods. |
| `P:ja.a(IFIFIIFFFIF)V#3` | `velocityX` | ja.java assigns param3 to field_w, then scales it with param8 and the board radius; f(byte) integrates field_w into field_o. |
| `P:ja.a(IFIFIIFFFIF)V#4` | `spriteVariantIndex` | ja.java stores param4 in field_M, which indexes the selected theme sprite array in private g(byte). |
| `P:ja.a(IFIFIIFFFIF)V#5` | `lifetimeTicks` | ja.java initializes both field_p and field_r from param5; b(boolean) decreases the remaining field_r and n(int) derives opacity from both values. |
| `P:ja.a(IFIFIIFFFIF)V#7` | `positionY` | ja.java assigns param7 directly to field_v, used as vertical position in board rotation and sprite rendering. |
| `P:ja.a(IFIFIIFFFIF)V#8` | `velocityY` | ja.java assigns param8 to field_F, normalizes it with param3 and later integrates field_F into field_v. |
| `P:ja.a(IFIFIIFFFIF)V#9` | `entityCategoryKey` | ja.java assigns param9 to field_C, compared with related entities' field_C when updating category counts. |
| `P:ja.a(IIII)V#1` | `entityCategoryKey` | ja.java assigns param1 to field_C, which is compared against another entity's field_C when maintaining same-category membership counts. |
| `P:ja.a(IIII)V#2` | `spriteVariantIndex` | ja.java assigns param2 to field_M; private g(byte) uses field_M to index the selected theme's sprite variants. |
| `P:ja.a(Lja;I)V#0` | `relatedEntity` | ja.java searches field_n for object identity equal to param0 before removing that related entity; kc.java passes the parent whose child is being detached. |
| `P:ja.a(Lja;I)V#1` | `startingChildIndex` | ja.java initializes its field_n search cursor directly from param1 and increments it until field_L. |
| `P:ja.b(II)I#1` | `bitOffset` | ja.java masks param1 with 7 to calculate padding to the next byte-aligned bit offset, then returns param1 plus that padding. |
| `P:ka.a(BI)V#1` | `itemIndex` | Indexes action IDs for increase operation. |
| `P:ka.a(IB)V#0` | `itemIndex` | Indexes action IDs for decrease operation. |
| `P:ka.a(II)V#0` | `itemIndex` | Selected row passed to key handling. |
| `P:ka.a(IIB)I#0` | `pointerX` | Horizontal pointer coordinate tested against menu bounds. |
| `P:ka.a(IIB)I#1` | `pointerY` | Vertical pointer coordinate tested against menu rows. |
| `P:ka.a(IIZIZI)V#0` | `itemIndex` | Row index from hit test or retained pointer selection. |
| `P:ka.a(IIZIZI)V#1` | `pointerX` | Pointer X, converted to slider-relative coordinate by concrete handler. |
| `P:ka.a(IIZIZI)V#2` | `initialClick` | True for initial click path; false for held-button repeat. |
| `P:ka.a(IIZIZI)V#3` | `rowOffsetY` | Pointer Y minus top and row spacing. |
| `P:ka.a(IIZIZI)V#4` | `heldRepeat` | True in held-button path, controls repeat timing in base handler. |
| `P:ka.a(IIZIZI)V#5` | `pointerButton` | Click/held button value; controls activation or value adjustment. |
| `P:ka.a(ZBII)V#0` | `selected` | True for the selected row when rendering. |
| `P:ka.a(ZBII)V#2` | `itemIndex` | Row index supplied by render loop. |
| `P:ka.a(ZBII)V#3` | `rowY` | Row Y supplied by render loop and used in text/slider drawing. |
| `P:ka.b(IB)V#0` | `itemIndex` | Indexes action IDs for activation. |
| `P:nb.a(IIIIIZ)V#1` | `pointerX` | Forwarded to the spawned entity X position. |
| `P:nb.a(IIIIIZ)V#2` | `categoryId` | Forwarded to the entity motion initializer category key. |
| `P:nb.a(IIIIIZ)V#3` | `pointerY` | Forwarded to the spawned entity Y position. |
| `P:nb.a(IIIIIZ)V#4` | `variantId` | Forwarded to the entity motion initializer sprite variant index. |
| `P:nb.a(IIIIIZ)V#5` | `specialKinds` | Selects special entity kinds instead of kind zero. |
| `P:tf.a(ILhf;)V#1` | `node` | The linked node being detached and inserted at the deque tail. |
| `P:tf.a(Lhf;Z)V#0` | `node` | The linked node being detached and inserted at the deque head. |
| `P:tf.a(Ltf;B)V#0` | `destination` | Deque receiving all nodes of this deque through the range-splice helper. |
| `P:tf.a(Ltf;ILhf;)V#0` | `destination` | Deque whose tail is extended with the selected suffix. |
| `P:tf.a(Ltf;ILhf;)V#2` | `firstMovedNode` | First node of the suffix removed from this deque and appended to the destination. |
| `P:ua.a([BI)V#0` | `inputBytes` | Assigned directly to shared bitstream bytes. |
| `P:ua.a([BI)V#1` | `startByte` | Assigned directly to byte cursor. |
| `P:ua.a([I)Lgd;#0` | `sampleBudget` | Optional int[0] remaining sample budget; null preserves unlimited decoding. |
| `P:ua.b(I)I#0` | `bitCount` | Requested bit count in shared bit-reader loop. |
| `P:ua.b([B)V#0` | `containerBytes` | qc wraps the input container bytes for header and packet parsing. |
| `P:ua.c(I)[F#0` | `packetIndex` | Selects packets[packetIndex] before starting bit input. |
| `P:ug.a(IZIII)V#0` | `points` | Stored in the popup and its decimal points text. |
| `P:ug.a(IZIII)V#2` | `originY` | Stored as popup originY. |
| `P:ug.a(IZIII)V#3` | `chainMultiplier` | Stored as popup chain multiplier; points are already multiplied by the scoring caller. |
| `P:ug.a(IZIII)V#4` | `originX` | Stored as popup originX. |
| `P:uk.a(II)Ljava/lang/String;#0` | `tutorialStepId` | Switch-like dispatch selects the message for this tutorial step. |
