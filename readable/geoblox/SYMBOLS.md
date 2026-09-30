# Readable Java symbol map

Generated from explicit rules; original names remain lookup identities.

| Original identity | Readable name | Evidence |
| --- | --- | --- |
| `C:c` | `GameScreen_c` | Nine instances constructed by Geoblox.m, selected by current/requested screen IDs; implements menu rendering, input and per-screen update. |
| `C:dm` | `Sprite_dm` | Owns int pixels and nearest/smooth sprite transforms; raster fixtures and rotation census. |
| `C:gh` | `GameplaySession_gh` | Created when a menu starts play; Geoblox delegates gameplay update/render to it; owns board angle, score and session progression. |
| `C:ja` | `GameplayEntity_ja` | ja.java declares positioned, moving sprites (field_o/field_v, field_w/field_F, field_J); gh.java iterates ja instances from gameplay entity lists and transforms their coordinates around the board angle. |
| `C:ka` | `MenuScreen_ka` | Base for c; stores item geometry and selection, dispatches keyboard/pointer input, renders item rows. |
| `C:kl` | `PcmSampleStream_kl` | Audio chunk census and sample interpolation/mixing bodies. |
| `C:na` | `IndexedSprite_na` | Owns byte pixel indices and int palette used by indexed raster loops. |
| `C:nj` | `PendingActionMarker_nj` | nj.java instances contain the supplied integer as field_h; ra.java enqueues new nj(param2) into pb.field_t as a marker for the action being handled. |
| `C:qk` | `AudioOutput_qk` | Owns output sample buffer and drives ia stream fill from the audio update chain. |
| `C:u` | `MusicDecodeStage_u` | Prepared dependency of ua.c(I)[F; conservative stage name, no assumed codec algorithm. |
| `C:ua` | `MusicDecoder_ua` | Music-loading profiles and source show packet decoding and shared bit readers. |
| `C:vb` | `SoftwareRasterizer_vb` | Owns shared framebuffer, scanline stride and clipping bounds. |
| `C:wh` | `SpriteState_wh` | Declares sprite dimensions and trim offsets read by dm transforms; also contains unrelated static helpers. |
| `F:Geoblox.field_A:Ljava/lang/String;` | `loginMessage_field_A` | Initialized to Please login and cleared during cleanup. |
| `F:Geoblox.field_z:[Ljava/lang/String;` | `reconnectMessages_field_z` | Static initializer contains the four Connection lost - attempting to reconnect messages. |
| `F:ai.field_p:I` | `requestedScreenId_field_p` | Requested destination ID compared with current screen during update/render; assigned by menu actions and gameplay. |
| `F:c.field_D:I` | `animationTick_field_D` | Incremented by normal and transition updates; drives modulo-based screen animations. |
| `F:c.field_K:I` | `screenId_field_K` | Constructor stores screen index; indexes per-screen action IDs and selects screen-specific behavior. |
| `F:c.field_R:Lkl;` | `volumePreviewStream_field_R` | d(0) creates kl from audio sample 8 using j.field_gb volume, adds to mixer and retains for preview throttling. |
| `F:c.field_U:I` | `volumePreviewTicks_field_U` | Ticks since preview start; reset when d(0) starts/restarts volume preview stream. |
| `F:c.field_ab:I` | `selectedThemeId_field_ab` | Indexes loaded-theme flags and theme palette/sprite arrays in screen and gameplay rendering. |
| `F:c.field_p:LGeoblox;` | `gameApplet_field_p` | Geoblox constructor argument retained for session creation and host operations. |
| `F:c.field_y:I` | `activeTicks_field_y` | Incremented only by normal screen update, reset on menu/session operations; used for timeout. |
| `F:cd.field_j:I` | `gameplayOriginScreenId_field_j` | Menu activation stores its own screen ID alongside gameplay return destination; Geoblox consumes on the fh.c branch and uses for origin-specific setup. |
| `F:dm.field_v:[I` | `pixels_field_v` | Pixel array read by nearest/smooth rotation and written by sprite operations. |
| `F:el.field_i:I` | `gameplayReturnScreenId_field_i` | Stored when leaving gameplay via menus; Geoblox consumes as requested destination on the non-fh.c branch. -1 is the initial/reset sentinel. |
| `F:el.field_o:Lgh;` | `gameplaySession_field_o` | Current gh created by c activation; used for gameplay update/render and score access. |
| `F:gh.field_A:I` | `pendingPopupPoints_field_A` | Accumulated by a(II); c(Z) creates points popup then resets to zero. |
| `F:gh.field_D:I` | `sceneAnimationTick_field_D` | gh.java increments and resets field_D across timed in-game/result animations, using thresholds 160, 266, 460 and 1000 for animated sprite, title and curtain progression. |
| `F:gh.field_I:LGeoblox;` | `gameApplet_field_I` | Retains the owning Geoblox constructor argument. |
| `F:gh.field_J:F` | `boardAngleRadians_field_J` | Changed by rotation input; sin/cos in render and radians-to-16-bit-angle conversion rotate board sprite. |
| `F:gh.field_S:I` | `resultSequenceCountdown_field_S` | gh.java resets field_S to 150, decrements it during the result sequence and uses its expiration/threshold to advance the result animation. |
| `F:gh.field_X:Ljava/lang/StringBuilder;` | `scoreText_field_X` | Updated from score in a(BI), rendered by gameplay drawing. |
| `F:gh.field_a:I` | `delayedActionCountdown_field_a` | gh.java initializes this counter to 300, decrements it during session progression and branches when it reaches zero; reset code returns it to zero. |
| `F:gh.field_ab:I` | `resultPanelX_field_ab` | gh.java initializes field_ab to 640, draws the result panel and label using it as their horizontal coordinate, then decrements it until it reaches the centered panel position. |
| `F:gh.field_g:Ljava/lang/StringBuilder;` | `popupPointsText_field_g` | Updated when a(II) adds popup points; stores formatted accumulated value. |
| `F:gh.field_o:I` | `score_field_o` | Added to by a(BI), formatted as score text and submitted as final score by e(B). |
| `F:gh.field_v:I` | `updateTick_field_v` | Incremented on gameplay update, used for periodic animation and timing. |
| `F:ib.field_a:Z` | `gameAssetsInitialized_field_a` | Geoblox update sets true only after prepareGameAssets succeeds; rendering uses it to select loading screen. |
| `F:ja.field_C:I` | `entityCategoryKey_field_C` | ja.java method a(ja,int) compares the removed entity's field_C with this field_C before changing the matching category count field_N; no particular numeric category is asserted. |
| `F:ja.field_F:F` | `velocityY_field_F` | ja.java method f(byte) adds field_F to field_v each call; ja.java method a(float,int) rotates field_F with field_w. |
| `F:ja.field_G:I` | `animationFrameIndex_field_G` | ja.java methods b(boolean) and private g(byte) index sprite-frame arrays with field_G and wrap it by the corresponding frame count. |
| `F:ja.field_H:I` | `entityId_field_H` | vf.java:245-247 constructs each ja with its slot in the 1000-entity pool; ja.java:820 stores that slot in field_H. kc.java:434 and 531 use it to index entity bookkeeping. ja.java:88, 258, 362 and 722 use field_H+1 as an ownership label in raster masks, not a transparent display color. |
| `F:ja.field_I:I` | `entityUpdateTick_field_I` | ja.java method b(boolean) increments field_I and uses its modulo values to advance animation frames and palette effects. |
| `F:ja.field_J:Ldm;` | `entitySprite_field_J` | ja.java selects field_J from sprite arrays in its private g(byte) method and invokes draw/transform operations on it in e, g, h, k, l and n. |
| `F:ja.field_K:Ltf;` | `entityQueue_field_K` | ef.java iterates active ja objects and assigns ra.field_a to each entity's field_K when its field_G reaches the setup threshold; tf.java is the intrusive linked-list container used for that queue. |
| `F:ja.field_L:I` | `relatedEntityCount_field_L` | ja.java method a(ja,int) bounds its search by field_L, decrements it after removal, and clears the vacated final array slot. |
| `F:ja.field_M:I` | `spriteVariantIndex_field_M` | ja.java private g(byte) indexes theme sprite arrays with field_M; method a(int,int,int,int) stores the supplied variant index into field_M. |
| `F:ja.field_N:I` | `sameCategoryEntityCount_field_N` | ja.java method a(ja,int) decrements field_N only when the removed entity's field_C equals this entity's field_C, and checks it against field_L as an invariant. |
| `F:ja.field_m:I` | `sameVariantEntityCount_field_m` | ja.java method a(ja,int) decrements field_m only when the removed entity's field_M equals this entity's field_M; the constructor and reset initialize it to zero. |
| `F:ja.field_n:[Lja;` | `relatedEntities_field_n` | ja.java allocates field_n as a ja array; method a(ja,int) searches it for a supplied entity, removes the matching entry, shifts the tail and updates related counts. |
| `F:ja.field_o:F` | `positionX_field_o` | ja.java subtracts 320 from field_o before board rotation and adds the rotated coordinate back; gh.java uses field_o in the same board-centered coordinate transform. |
| `F:ja.field_p:I` | `initialLifetimeTicks_field_p` | ja.java initializes field_p and field_r from the same spawn parameter; rendering computes an alpha from field_r/field_p while update decrements field_r. |
| `F:ja.field_q:I` | `interpolatedPaletteColor_field_q` | ja.java method b(boolean) computes field_q from jg.field_h and the red/green/blue deltas, then the sprite draw calls pass field_q as their color argument. |
| `F:ja.field_r:I` | `remainingLifetimeTicks_field_r` | ja.java method b(boolean) decrements field_r; method n(int) computes opacity using 255-field_r*255/field_p. |
| `F:ja.field_s:I` | `paletteRedDelta_field_s` | ja.java method m(int) computes the red-channel difference between consecutive jg.field_h palette entries and stores it in field_s; b(boolean) uses it while interpolating the palette. |
| `F:ja.field_u:F` | `spriteAngleRadians_field_u` | ja.java converts field_u radians to a 0..65535 angle before Sprite transforms; methods a(float,int) and rendering methods adjust or consume the angle. |
| `F:ja.field_v:F` | `positionY_field_v` | ja.java subtracts 240 from field_v before rotation and updates it from the rotated Y expression; gh.java reads it as the entity's vertical coordinate. |
| `F:ja.field_w:F` | `velocityX_field_w` | ja.java method f(byte) adds field_w to field_o each call; ja.java method a(float,int) rotates field_w with field_F. |
| `F:ja.field_x:I` | `paletteGreenDelta_field_x` | ja.java method m(int) computes the green-channel difference between consecutive jg.field_h entries and stores it in field_x; b(boolean) uses it in the interpolated color. |
| `F:ja.field_y:I` | `paletteBlueDelta_field_y` | ja.java method m(int) computes the blue-channel difference between consecutive jg.field_h entries and stores it in field_y; b(boolean) uses it in the interpolated color. |
| `F:ka.field_b:I` | `selectedItemIndex_field_b` | Selected/hovered row index used for input dispatch and rendering highlighted row. |
| `F:ka.field_d:I` | `itemSpacing_field_d` | Vertical row spacing; divisor in hit test and increment in rendering loop. |
| `F:ka.field_e:I` | `itemCount_field_e` | Constructor receives action-array length; bounds hit testing, selection wrapping and rendering loop. |
| `F:ka.field_f:I` | `hitRightX_field_f` | Exclusive upper X boundary in base menu hit test; initialized by constructor. |
| `F:ka.field_g:Z` | `pointerInteractionActive_field_g` | Set on nonempty pointer hit; gates held-button dispatch and keyboard selection. |
| `F:ka.field_j:I` | `hitLeftX_field_j` | Lower X boundary in base menu hit test; initialized by constructor. |
| `F:ka.field_k:I` | `firstItemY_field_k` | Menu top Y; hit test subtracts it and render initializes row Y from it. |
| `F:ka.field_l:Z` | `keyboardSelectionActive_field_l` | True when navigation selects a row; pointer hover clears it and changes selection. |
| `F:ll.field_g:[Z` | `themesLoaded_field_g` | Theme loaders mark fixed indices after foreground/background resource loading. |
| `F:na.field_h:[I` | `palette_field_h` | Indexed raster looks up int color by unsigned byte pixel value. |
| `F:na.field_i:[B` | `indices_field_i` | Byte indices consumed by indexed raster bodies. |
| `F:nf.field_A:I` | `screenTransitionTick_field_A` | Incremented while current/requested screens differ; reset at 160; drives clipping and curtain position in Geoblox render. |
| `F:nj.field_h:I` | `actionId_field_h` | nj.java constructor copies its sole int argument to field_h; ra.java constructs new nj(param2) immediately before inserting it into the pending-marker list. |
| `F:oc.field_b:I` | `previousMenuScreenId_field_b` | Remembers screen 0/1 when leaving; escape/back routes to this screen. |
| `F:og.field_q:[Lc;` | `screens_field_q` | Nine c instances indexed by current/requested screen ID in Geoblox update/render. |
| `F:pg.field_e:Z` | `screenChangePending_field_e` | Consumed by Geoblox update to choose requested screen from el.field_i or cd.field_j and initiate transition. |
| `F:qj.field_b:Z` | `clearGameplayDuringTransition_field_b` | Set when transition is triggered via pg.field_e, forces cleared background instead of drawing gameplay; cleared on transition completion. |
| `F:qj.field_c:Ldm;` | `transitionCurtain_field_c` | Sprite drawn at y=6*transitionTick-480 after outgoing/incoming screen clipping. |
| `F:t.field_i:[[I` | `menuActionIds_field_i` | Maps screen ID and item index to integer action identifiers dispatched by c menu handlers. |
| `F:tc.field_c:I` | `currentScreenId_field_c` | Committed screen ID; -1 delegates update/render to gameplay, nonnegative indexes screens; transition commits requested ID after 160 ticks. |
| `F:ua.field_B:[F` | `workBlock_field_B` | Shared float decoding buffer, swapped with per-instance previousBlock. |
| `F:ua.field_C:[F` | `previousBlock_field_C` | Previous float block used in overlap-add, swapped with shared work buffer at packet completion. |
| `F:ua.field_E:[B` | `pcmBytes_field_E` | Output byte storage allocated to sample count, filled by ua.a([I)Lgd;. |
| `F:ua.field_H:I` | `sampleCount_field_H` | Header count bounds and sizes the final PCM byte array. |
| `F:ua.field_J:I` | `pcmWriteCursor_field_J` | Resumable PCM write offset, saved after each packet conversion. |
| `F:ua.field_L:[B` | `bitstreamBytes_field_L` | Assigned by ua.a([BI)V; byte input to both bit readers. |
| `F:ua.field_M:I` | `previousBlockSize_field_M` | Prior block size used in overlap-add output length; assigned current block size at packet completion. |
| `F:ua.field_j:I` | `bitCursor_field_j` | Bit position within byte, reset/masked with 7 by the bit readers. |
| `F:ua.field_p:[[B` | `packets_field_p` | Length-prefixed byte packets allocated by ua.b([B)V and selected by decodePacket. |
| `F:ua.field_t:I` | `longBlockSize_field_t` | Second 1<<readBits(4) setup size, selected for flagged block mode. |
| `F:ua.field_v:I` | `shortBlockSize_field_v` | First 1<<readBits(4) setup size, selected for unflagged block mode. |
| `F:ua.field_x:I` | `packetCursor_field_x` | Resumable PCM decoder packet index; incremented after each packet. |
| `F:ua.field_y:I` | `byteCursor_field_y` | Input byte index, incremented when bit cursor crosses byte boundaries. |
| `F:vb.field_c:[I` | `framebuffer_field_c` | Shared destination of raster operations; writer audit. |
| `F:vb.field_d:I` | `clipBottom_field_d` | Vertical upper clipping boundary in vb.d and na.a. |
| `F:vb.field_e:I` | `clipLeft_field_e` | Horizontal lower clipping boundary in vb.d and na.a. |
| `F:vb.field_f:I` | `stride_field_f` | Destination index x + y * field_f in raster bodies. |
| `F:vb.field_i:I` | `clipTop_field_i` | Vertical lower clipping boundary in vb.d and na.a. |
| `F:vb.field_k:I` | `clipRight_field_k` | Horizontal upper clipping boundary in vb.d and na.a. |
| `F:wh.field_m:I` | `height_field_m` | Vertical source boundary in dm.c. |
| `F:wh.field_p:I` | `trimY_field_p` | Subtracted from vertical transform pivot, shifted by four. |
| `F:wh.field_r:I` | `width_field_r` | Pixel row stride and horizontal source boundary in dm.c. |
| `F:wh.field_u:I` | `trimX_field_u` | Subtracted from horizontal transform pivot, shifted by four. |
| `L:Geoblox.a(I)V#4` | `transitionSplitY_var3` | Computed as 6*transitionTick-445; divides clipping between incoming and outgoing screens. |
| `L:Geoblox.m(I)V#0` | `screenIndex_var2` | Loop index 0..8 creates and stores matching c screen instance. |
| `L:c.a(BI)V#1` | `actionId_var3_int` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(IB)V#2` | `actionId_var4` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(II)V#1` | `actionId_var3_int` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(IIZIZI)V#1` | `actionId_var7_int` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.a(ZBII)V#11` | `actionId_var6` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:c.b(IB)V#6` | `actionId_var5` | Value read from per-screen action ID array using item index; drives action-specific branches. |
| `L:dm.a(IIIIII)V#0` | `angleRadians_var7` | Masked 16-bit angle multiplied by 2*pi/65536 before sin/cos. |
| `L:dm.a(IIIIII)V#1` | `scaledSin_var9` | floor(sin(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.a(IIIIII)V#10` | `corner3Y_var18` | Vertical corner expression using width and height, used in Y bound reduction. |
| `L:dm.a(IIIIII)V#11` | `leftBound_var19` | Minimum transformed X, converted to destination pixels and clipped against vb.field_e. |
| `L:dm.a(IIIIII)V#12` | `rightThenNegativeWidth_var20` | Initially maximum/right X; overwritten with left-right before negative pixel-count loops. |
| `L:dm.a(IIIIII)V#13` | `topBound_var21` | Minimum transformed Y, converted to destination pixels and clipped against vb.field_i. |
| `L:dm.a(IIIIII)V#14` | `bottomThenNegativeHeight_var22` | Initially maximum/bottom Y; overwritten with top-bottom before negative row-count loops. |
| `L:dm.a(IIIIII)V#15` | `destinationIndex_var23` | Destination pointer advanced during sampling and by rowSkip after each row. |
| `L:dm.a(IIIIII)V#16` | `rowSkip_var24` | Framebuffer stride+negativeWidth; skips the remainder of each destination scanline. |
| `L:dm.a(IIIIII)V#17` | `inverseScaleFactor_var25` | 16777216.0/scale used in inverse sin/cos coefficients. |
| `L:dm.a(IIIIII)V#18` | `inverseSinStep_var27` | Inverse sine coefficient advances source Y per destination pixel. |
| `L:dm.a(IIIIII)V#19` | `inverseCosStep_var28` | Inverse cosine coefficient advances source X per destination pixel. |
| `L:dm.a(IIIIII)V#2` | `scaledCos_var10` | floor(cos(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.a(IIIIII)V#20` | `destinationOffsetX_var29` | First destination pixel center relative to destination X pivot. |
| `L:dm.a(IIIIII)V#21` | `destinationOffsetY_var30` | First destination pixel center relative to destination Y pivot. |
| `L:dm.a(IIIIII)V#22` | `rowSourceXQ12_var31` | Row source X origin includes half-pixel -2048 correction and inverse sine row offset. |
| `L:dm.a(IIIIII)V#23` | `rowSourceYQ12_var32` | Row source Y origin includes half-pixel -2048 correction and inverse cosine row offset. |
| `L:dm.a(IIIIII)V#24` | `sourcePixelX_var33` | sourceXQ12>>12 passed to the bilinear sampler. |
| `L:dm.a(IIIIII)V#25` | `sourcePixelY_var34` | sourceYQ12>>12 passed to the bilinear sampler. |
| `L:dm.a(IIIIII)V#26` | `clipScratch_var35` | Reused for source-edge offset and divided skip-count calculations. |
| `L:dm.a(IIIIII)V#27` | `negativeRowCounter_var36` | Starts at negative height and increments until zero. |
| `L:dm.a(IIIIII)V#28` | `sourceXQ12_var37` | Source X accumulator passed as fraction coordinate to dm.c and advanced by inverse cosine. |
| `L:dm.a(IIIIII)V#29` | `sourceYQ12_var38` | Source Y accumulator passed as fraction coordinate to dm.c and advanced by inverse sine. |
| `L:dm.a(IIIIII)V#3` | `corner0X_var11` | First transformed horizontal corner expression, used by lower/upper X reduction. |
| `L:dm.a(IIIIII)V#30` | `negativePixelCounter_var39` | Negative remaining width, adjusted by source clipping. |
| `L:dm.a(IIIIII)V#31` | `canSample_var40` | Integer 0/1 tracks whether source clipping admits the inner bilinear sampling loop. |
| `L:dm.a(IIIIII)V#4` | `corner0Y_var12` | First transformed vertical corner expression, used by lower/upper Y reduction; original pivot decrements remain intact. |
| `L:dm.a(IIIIII)V#5` | `corner1X_var13` | Horizontal corner expression using width<<4, used in X bound reduction. |
| `L:dm.a(IIIIII)V#6` | `corner1Y_var14` | Vertical corner expression using width<<4, used in Y bound reduction. |
| `L:dm.a(IIIIII)V#7` | `corner2X_var15` | Horizontal corner expression using height<<4, used in X bound reduction. |
| `L:dm.a(IIIIII)V#8` | `corner2Y_var16` | Vertical corner expression using height<<4, used in Y bound reduction; original pivot decrements remain intact. |
| `L:dm.a(IIIIII)V#9` | `corner3X_var17` | Horizontal corner expression using width and height, used in X bound reduction. |
| `L:dm.b(IIIIII)V#0` | `writeIndex_incrementValue$0` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#1` | `writeIndex_incrementValue$1` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#10` | `scaledSin_var9` | floor(sin(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.b(IIIIII)V#11` | `scaledCos_var10` | floor(cos(angleRadians) * scale + 0.5), used in forward corner transform. |
| `L:dm.b(IIIIII)V#12` | `corner0X_var11` | First transformed horizontal corner expression, used by lower/upper X reduction. |
| `L:dm.b(IIIIII)V#13` | `corner0Y_var12` | First transformed vertical corner expression, used by lower/upper Y reduction; original pivot decrements remain intact. |
| `L:dm.b(IIIIII)V#14` | `corner1X_var13` | Horizontal corner expression using width<<4, used in X bound reduction. |
| `L:dm.b(IIIIII)V#15` | `corner1Y_var14` | Vertical corner expression using width<<4, used in Y bound reduction. |
| `L:dm.b(IIIIII)V#16` | `corner2X_var15` | Horizontal corner expression using height<<4, used in X bound reduction. |
| `L:dm.b(IIIIII)V#17` | `corner2Y_var16` | Vertical corner expression using height<<4, used in Y bound reduction; original pivot decrements remain intact. |
| `L:dm.b(IIIIII)V#18` | `corner3X_var17` | Horizontal corner expression using width and height, used in X bound reduction. |
| `L:dm.b(IIIIII)V#19` | `corner3Y_var18` | Vertical corner expression using width and height, used in Y bound reduction. |
| `L:dm.b(IIIIII)V#2` | `writeIndex_incrementValue$2` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#20` | `leftBound_var19` | Minimum transformed X, converted to destination pixels and clipped against vb.field_e. |
| `L:dm.b(IIIIII)V#21` | `rightThenNegativeWidth_var20` | Initially maximum/right X; overwritten with left-right before negative pixel-count loops. |
| `L:dm.b(IIIIII)V#22` | `topBound_var21` | Minimum transformed Y, converted to destination pixels and clipped against vb.field_i. |
| `L:dm.b(IIIIII)V#23` | `bottomThenNegativeHeight_var22` | Initially maximum/bottom Y; overwritten with top-bottom before negative row-count loops. |
| `L:dm.b(IIIIII)V#24` | `rowDestinationIndex_var23` | top*framebuffer stride+left; advanced by stride after each nearest-neighbor row. |
| `L:dm.b(IIIIII)V#25` | `inverseScaleFactor_var24` | 16777216.0/scale used in inverse sin/cos coefficients. |
| `L:dm.b(IIIIII)V#26` | `inverseSinStep_var26` | floor(sin(angleRadians)*inverseScaleFactor+0.5); increments source Y for each destination pixel. |
| `L:dm.b(IIIIII)V#27` | `inverseCosStep_var27` | floor(cos(angleRadians)*inverseScaleFactor+0.5); increments source X for each destination pixel. |
| `L:dm.b(IIIIII)V#28` | `destinationOffsetX_var28` | (leftBound<<4)+8-destinationX at the first destination pixel center. |
| `L:dm.b(IIIIII)V#29` | `destinationOffsetY_var29` | (topBound<<4)+8-destinationY at the first destination pixel center. |
| `L:dm.b(IIIIII)V#3` | `writeIndex_incrementValue$3` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#30` | `rowSourceXQ12_var30` | Source pivot shifted by eight minus row-offset sine; decreases by inverseSinStep per row. |
| `L:dm.b(IIIIII)V#31` | `rowSourceYQ12_var31` | Source pivot shifted by eight plus row-offset cosine; increases by inverseCosStep per row. |
| `L:dm.b(IIIIII)V#32` | `clipPixelCount_var32` | Division results used to skip or limit pixels when source coordinates cross boundaries. |
| `L:dm.b(IIIIII)V#33` | `negativeRowCounter_var33` | Starts at negative height and increments until zero. |
| `L:dm.b(IIIIII)V#34` | `destinationIndex_var34` | Per-pixel destination pointer copied from the row start and advanced on each write/transparent sample. |
| `L:dm.b(IIIIII)V#35` | `sourceXQ12_var35` | Source X accumulator indexed with >>12 and advanced by inverseCosStep. |
| `L:dm.b(IIIIII)V#36` | `sourceYQ12_var36` | Source Y accumulator indexed with >>12 and advanced by inverseSinStep. |
| `L:dm.b(IIIIII)V#37` | `negativePixelCounter_var37` | Starts at negative width, adjusted by source clipping and incremented until zero. |
| `L:dm.b(IIIIII)V#38` | `sampledPixel_var38` | Reads pixels[(sourceY>>12)*width+(sourceX>>12)], zero is transparent. |
| `L:dm.b(IIIIII)V#4` | `writeIndex_incrementValue$4` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#5` | `writeIndex_incrementValue$5` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#6` | `writeIndex_incrementValue$6` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#7` | `writeIndex_incrementValue$7` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#8` | `writeIndex_incrementValue$8` | Captured old destination index before increment, used for the corresponding framebuffer write. |
| `L:dm.b(IIIIII)V#9` | `angleRadians_var7` | Masked 16-bit angle multiplied by 2*pi/65536 before sin/cos. |
| `L:gh.a(B)V#19` | `renderedEntity_var8_ref_ja` | gh.java reads successive ja instances from entity lists and uses each sprite's position/lifetime to calculate its rendered coordinates and opacity. |
| `L:gh.a(B)V#20` | `entityOffsetX_var9_float` | gh.java computes entity.field_o-320 before applying the session board-angle sine/cosine transform. |
| `L:gh.a(B)V#22` | `entityOffsetY_var10_float` | gh.java computes entity.field_v-240 before applying the session board-angle sine/cosine transform. |
| `L:gh.a(B)V#24` | `renderedEntityX_var11` | gh.java derives var11 from the entity offsets and board-angle rotation, then passes it to vb.d for entity drawing. |
| `L:gh.a(B)V#25` | `renderedEntityY_var12` | gh.java derives var12 from the entity offsets and board-angle rotation, then passes it to vb.d for entity drawing. |
| `L:gh.a(B)V#26` | `entityOpacity_var13` | gh.java computes 255-entity.field_r*255/entity.field_p, clamps the result to 11..255 and passes it as the drawing alpha. |
| `L:gh.a(BI)V#0` | `pointsForCounters_var3` | Copies points amount for per-mode score counters. |
| `L:gh.a(BI)V#1` | `counterSplitMode_var4` | kd.field_c modulo three selects how added points are split across counters. |
| `L:gh.a(BI)V#2` | `oneThirdPoints_var5` | One third of added points in mixed counter mode. |
| `L:ja.a(FI)V#0` | `velocityNormalizationScale_var5` | ja.java sets var5 to og.field_r divided by the magnitude of the rotated velocity vector and multiplies both velocity components by it. |
| `L:ja.a(FI)V#1` | `positionOffsetX_var3` | ja.java computes field_o-320 into var3 and uses it in the position rotation before restoring the center offset. |
| `L:ja.a(FI)V#2` | `positionOffsetY_var4` | ja.java computes field_v-240 into var4 and uses it in the position rotation before restoring the center offset. |
| `L:ja.a(IFIFIIFFFIF)V#0` | `velocityNormalizationScale_var12` | ja.java sets var12 to og.field_r divided by sqrt(param3^2+param8^2), then scales field_w and field_F with it. |
| `L:ja.a(Lja;I)V#0` | `relatedEntitySearchIndex_var3_int` | ja.java initializes the array search cursor from param1, compares field_n[cursor] to param0, and increments the cursor until field_L. |
| `L:ja.b(II)I#0` | `paddingToByteBoundary_var2` | ja.java computes 8-(param1&7) when needed so the return value reaches the next multiple-of-eight bit offset. |
| `L:ja.b(II)I#1` | `byteAlignedBitOffset_var3` | ja.java returns param1 plus the padding amount computed in var2. |
| `L:ja.b(Z)V#0` | `frameIndexBeforeIncrement_fieldTemp$0` | ja.java captures field_G before incrementing it, then indexes ka.field_m with that saved animation frame. |
| `L:ja.b(Z)V#1` | `frameIndexBeforeIncrement_fieldTemp$1` | ja.java captures field_G before incrementing it, then indexes ej.field_a with that saved animation frame. |
| `L:ja.b(Z)V#2` | `frameIndexBeforeIncrement_fieldTemp$2` | ja.java captures field_G before incrementing it, then indexes mi.field_B with that saved animation frame. |
| `L:ja.b(Z)V#3` | `frameIndexBeforeIncrement_fieldTemp$3` | ja.java captures field_G before incrementing it, then indexes vj.field_a with that saved animation frame. |
| `L:ja.b(Z)V#4` | `frameIndexBeforeIncrement_fieldTemp$4` | ja.java captures field_G before incrementing it, then indexes hb.field_d with that saved animation frame. |
| `L:ja.b(Z)V#5` | `frameIndexBeforeIncrement_fieldTemp$5` | ja.java captures field_G before incrementing it, then indexes hg.field_b with that saved animation frame. |
| `L:ja.b(Z)V#6` | `frameIndexBeforeIncrement_fieldTemp$6` | ja.java captures field_G before incrementing it, then indexes fc.field_g with that saved animation frame. |
| `L:ja.b(Z)V#7` | `paletteBlendFraction_var2` | ja.java derives var2 from field_I%50 times 0.02 and uses it to interpolate field_q from the current theme palette and RGB deltas. |
| `L:ja.f(I)V#1` | `clipLeftX_var2` | ja.java begins with the sprite's left edge relative to field_o, then clips it at zero and adjusts the clipped width. |
| `L:ja.f(I)V#2` | `clipTopY_var3` | ja.java begins with the sprite's top edge relative to field_v, clips it at zero and adjusts the clipped height. |
| `L:ja.f(I)V#3` | `clippedWidth_var4` | ja.java initializes the sprite rectangle width and shortens it against bk.field_a.field_r after left clipping. |
| `L:ja.f(I)V#4` | `clippedHeight_var5` | ja.java initializes the sprite rectangle height and shortens it against bk.field_a.field_m after top clipping. |
| `L:ja.f(I)V#5` | `framebufferIndex_var6` | ja.java starts var6 at clipLeft+stride*clipTop and advances it through framebuffer writes. |
| `L:ja.f(I)V#6` | `rowSkip_var7` | ja.java assigns stride-clippedWidth to var7 and adds it after finishing each row. |
| `L:ja.f(I)V#7` | `negativeColumnCounter_var9` | ja.java starts var9 at negative clipped width and increments it through each pixel in a row. |
| `L:ja.f(I)V#8` | `controlFlowGuard_var10` | ja.java:204 assigns Geoblox.field_C to var10; it is the shared control-flow guard, not a raster address. The separate var6 holds the pixel cursor initialized at ja.java:243 and advanced by the scan loops. |
| `L:ja.f(I)V#9` | `framebufferPixels_var14` | ja.java assigns bk.field_a.field_v to var14 and reads/writes its pixel values while erasing keyed pixels. |
| `L:ja.g(I)V#0` | `entityOffsetX_var2` | ja.java computes field_o-320 into var2 and uses it as the X component of the board-angle cosine/sine transform. |
| `L:ja.g(I)V#1` | `entityOffsetY_var3` | ja.java computes field_v-240 into var3 and uses it as the Y component of the board-angle transform. |
| `L:ja.g(I)V#2` | `rotatedEntityX_var4` | ja.java computes var4 from var2*cos(boardAngle)-var3*sin(boardAngle)+320 and passes it to the sprite draw path. |
| `L:ja.g(I)V#3` | `rotatedEntityY_var5` | ja.java computes var5 from var2*sin(boardAngle)+var3*cos(boardAngle)+240 and passes it to the sprite draw path. |
| `L:ja.j(I)V#1` | `entityOffsetX_var2` | ja.java computes field_o-320 and uses this X offset in board-angle projection. |
| `L:ja.j(I)V#10` | `framebufferRowSkip_var11` | ja.java computes stride-clippedWidth into var11 and adds it after completing each row. |
| `L:ja.j(I)V#11` | `negativeColumnCounter_var13` | ja.java initializes var13 to negative clipped width and increments it across pixels in the inner row loop. |
| `L:ja.j(I)V#13` | `backgroundPixels_var18` | ja.java assigns wd.field_b.field_v to var18 and clears pixels matching field_H+1 in the clipped framebuffer region. |
| `L:ja.j(I)V#2` | `entityOffsetY_var3` | ja.java computes field_v-240 and uses this Y offset in board-angle projection. |
| `L:ja.j(I)V#3` | `rotatedEntityX_var4` | ja.java rotates var2/var3 with board angle and adds 320 to produce the clipped sprite's screen X. |
| `L:ja.j(I)V#4` | `rotatedEntityY_var5` | ja.java rotates var2/var3 with board angle and adds 240 to produce the clipped sprite's screen Y. |
| `L:ja.j(I)V#5` | `clipLeftX_var6` | ja.java derives var6 from projected entity X, sprite half-width and wd.field_a, then clips its lower bound to zero. |
| `L:ja.j(I)V#6` | `clipTopY_var7` | ja.java derives var7 from projected entity Y, sprite half-height and wd.field_d, then clips its lower bound to zero. |
| `L:ja.j(I)V#7` | `clippedSpriteWidth_var8` | ja.java starts var8 at offscreen sprite width plus eight and reduces it against wd.field_b.field_r. |
| `L:ja.j(I)V#8` | `clippedSpriteHeight_var9` | ja.java starts var9 at offscreen sprite height plus eight and reduces it against wd.field_b.field_m. |
| `L:ja.j(I)V#9` | `framebufferIndex_var10` | ja.java initializes var10 as wd.field_b.field_r*clipTopY+clipLeftX, then advances it over the clipped rectangle. |
| `L:ja.n(I)V#0` | `entityOffsetX_var2` | ja.java computes field_o-320 before rotating the entity center into board coordinates. |
| `L:ja.n(I)V#1` | `entityOffsetY_var3` | ja.java computes field_v-240 before rotating the entity center into board coordinates. |
| `L:ja.n(I)V#2` | `boardAngle_var4` | ja.java assigns el.field_o.field_J to var4 and uses its sine and cosine to transform the entity center. |
| `L:ja.n(I)V#3` | `rotatedEntityX_var5` | ja.java calculates the transformed horizontal entity coordinate around screen center and later subtracts half the sprite width. |
| `L:ja.n(I)V#4` | `rotatedEntityY_var6` | ja.java calculates the transformed vertical entity coordinate around screen center and later subtracts half the sprite height. |
| `L:ja.n(I)V#5` | `sentinelDivisionGuard_var7` | ja.java uses this only in a division-by-zero guard tied to the obfuscated sentinel argument; retained as control guard, not treated as gameplay state. |
| `L:ja.n(I)V#6` | `entityDrawX_var8` | ja.java computes var8 as rotated screen X minus half the offscreen sprite width before the draw call. |
| `L:ja.n(I)V#7` | `entityDrawY_var9` | ja.java computes var9 from rotated screen Y and half the offscreen sprite height before drawing. |
| `L:ja.n(I)V#8` | `fadeOpacity_var10` | ja.java derives var10 from remaining and initial lifetime, clamps it to 0..256, and passes it to vf.field_L.d as the sprite alpha. |
| `L:ja.n(I)V#9` | `controlFlowGuard_var11` | ja.java assigns Geoblox.field_C to var11 for decompiler control-flow branching; it is not a gameplay state value. |
| `L:ka.a(I)V#1` | `itemIndex_var2` | Rendering row loop index bounded by item count. |
| `L:ka.a(I)V#2` | `rowY_var3` | Starts at first-item Y and advances by row spacing. |
| `L:ka.a(Z)V#0` | `hitItemIndex_var2` | Result of menu hit test, used for selection and pointer dispatch. |
| `L:kc.b(I)V#42` | `activeEntity_var1` | kc.java obtains var1 from ji.field_r.g(0), processes its queue/special-state membership, then advances with ji.field_r.d(1). |
| `L:kc.b(I)V#43` | `entityIndexThenGroupCount_var1_int` | kc.java first uses var1_int to clear pk.field_o entries across the 1000 entity slots, then resets it and counts processed entity groups. |
| `L:kc.b(I)V#45` | `candidateEntity_var2_ref_ja` | kc.java traverses a.field_d for this ja entity, rotates it against el.field_o.field_J, detaches related children and routes it to a processing list. |
| `L:kc.b(I)V#47` | `radialOffsetX_var3_float` | kc.java computes 320-var2_ref_ja.field_o and normalizes it by the radius together with var4_float before assigning field_w. |
| `L:kc.b(I)V#49` | `queuedEntity_var3` | kc.java iterates bh.field_c through ja elements, removes each from that list and may reinsert it into ra.field_a. |
| `L:kc.b(I)V#51` | `radialOffsetY_var4_float` | kc.java computes 240-var2_ref_ja.field_v and normalizes it with var3_float before assigning field_F. |
| `L:kc.b(I)V#53` | `groupEntity_var5_ref_ja` | kc.java obtains this ja from the temporary var13 list, iterates/removes its children and resets its child counters before continuing the outer entity-group walk. |
| `L:kc.b(I)V#54` | `radialVelocityScale_var5` | kc.java assigns og.field_r/sqrt(var4_float^2+var3_float^2) to var5 and multiplies both radial offset components by it. |
| `L:kc.b(I)V#55` | `childEntityIndex_var6_int` | kc.java initializes var6_int to zero and increments it while iterating var12.field_n up to var12.field_L. |
| `L:kc.b(I)V#58` | `relatedEntityIndex_var7_int` | kc.java loops var7_int from zero to var2_ref_ja.field_L and removes each field_n child from its parent. |
| `L:kc.b(I)V#59` | `relatedEntityCandidate_var8` | kc.java obtains var8 from the temporary ja collection and compares it by identity against each parent child before list removal. |
| `L:kc.b(I)V#61` | `entityCandidate_var10` | kc.java assigns the ja returned by var11.a(true), tests its category slot and field_t flag, and processes it in the nested-group pass. |
| `L:kc.b(I)V#63` | `parentEntity_var12` | kc.java traverses the children of var12.field_L, removes its related entities and resets its category counts before relinking it. |
| `L:ua.a([I)Lgd;#1` | `writePosition_var3` | Current PCM output offset, committed to pcmWriteCursor after conversion. |
| `L:ua.a([I)Lgd;#2` | `samplesToWrite_var4` | Decoded packet length clamped against output sample count. |
| `L:ua.a([I)Lgd;#3` | `sampleIndex_var5` | Indexes decoded float samples during conversion. |
| `L:ua.a([I)Lgd;#4` | `unsignedPcmSample_var6` | 128+float*128, clamped to byte range before subtracting 128 for signed PCM. |
| `L:ua.a([I)Lgd;#5` | `decodedSamples_var7` | Float block returned by decodePacket. |
| `L:ua.a([I)Lgd;#6` | `completedPcm_var12` | Saved completed PCM array before clearing resumable output storage. |
| `L:ua.b()I#0` | `bitValue_var0` | One-bit return expression from the shared input cursor. |
| `L:ua.b(I)I#0` | `chunkMask_var4` | (1<<chunkBitCount)-1 inside the byte-consuming loop. |
| `L:ua.b(I)I#1` | `chunkBitsThenMask_var3` | Initially bits remaining in the byte; reused as tail-bit mask after the byte loop. |
| `L:ua.b(I)I#2` | `value_var1` | Accumulated extracted bits returned by the method. |
| `L:ua.b(I)I#3` | `outputShift_var2` | Total previously consumed bits; shifts each chunk into the result. |
| `M:Geoblox.a(I)V` | `renderFrame_a` | ch draw turn invokes a(25853); GeoBlox draws loading/menu/game content and publishes Canvas. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.a(ILdm;)V` | `setRasterTarget_a` | Geoblox.java calls oc.b(9) and vb.a(param1.field_v,param1.field_s,param1.field_o), wiring the supplied sprite pixel buffer and dimensions into the software raster target. |
| `M:Geoblox.b(B)V` | `releaseGameResources_b` | Invokes global resource cleanup and clears game state references. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.b(I)V` | `initializeGame_b` | Initializes session configuration and 22050-Hz audio components. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.c(I)V` | `serviceAudio_c` | Services me.b audio outputs plus popup/host state; ch invokes c(1) during host service. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.c(Z)V` | `updateGame_c` | ch tick invokes c(false); GeoBlox polls loading, input and screen updates. Rename abstract declaration and implementation as one virtual family. |
| `M:Geoblox.e(Z)V` | `loadSpaceTheme_e` | Loads space foreground/background and sets themesLoaded[6]. |
| `M:Geoblox.f(Z)V` | `requestGameArchives_f` | Requests numbered game archives and configures resource providers. |
| `M:Geoblox.g(Z)Z` | `pollArchiveLoading_g` | Polls archive readiness and reports 5..25 percent loading progress; returns completion. |
| `M:Geoblox.h(Z)V` | `loadJewelsTheme_h` | Loads jewels foreground/background and sets themesLoaded[0]. |
| `M:Geoblox.i(B)V` | `loadGermsTheme_i` | Loads germs foreground/background and sets themesLoaded[3]. |
| `M:Geoblox.m(I)V` | `initializeScreens_m` | Constructs nine c screen objects in og.field_q and resets current/target screen state. |
| `M:Geoblox.n(I)V` | `loadSportsTheme_n` | Loads sports foreground/background and sets themesLoaded[5]. |
| `M:Geoblox.o(I)Z` | `prepareGameAssets_o` | Initializes music, sprites/fonts and interface resources over successive readiness stages; returns true on completion. |
| `M:Geoblox.p(I)V` | `loadSweetsTheme_p` | Loads sweets foreground/background and sets themesLoaded[2]. |
| `M:Geoblox.q(I)V` | `loadBakingTheme_q` | Loads baking foreground/background and sets themesLoaded[4]. |
| `M:Geoblox.r(I)V` | `clearAppletStatics_r` | Geoblox.java static cleanup sets field_B, field_z, field_A and field_y to null; these are the applet's cached resource/message statics. |
| `M:c.a(BI)V` | `increaseMenuValue_a` | Concrete increases music/effect sliders by ten; base dispatches right-direction keys here. Both base and concrete declarations are renamed. |
| `M:c.a(I)V` | `renderScreen_a` | Geoblox render calls c.a(-28750); base implementation renders item rows, concrete draws complete screen. Both base and concrete declarations are renamed. |
| `M:c.a(IB)V` | `decreaseMenuValue_a` | Concrete decreases music/effect sliders by ten; base dispatches left-direction keys here. Both base and concrete declarations are renamed. |
| `M:c.a(II)V` | `handleMenuKey_a` | Base dispatches key codes to decrease/increase/activate item; concrete adds screen-specific shortcuts. Both base and concrete declarations are renamed. |
| `M:c.a(IIB)I` | `hitTestMenuItem_a` | Called with pointer X/Y; returns selected menu row or -1 from screen-specific geometry. Both base and concrete declarations are renamed. |
| `M:c.a(IIZIZI)V` | `handleMenuPointer_a` | Base pointer polling dispatches row, X, click/hold flags, row-relative Y and button; concrete handles sliders and activation. Both base and concrete declarations are renamed. |
| `M:c.a(ZBII)V` | `renderMenuItem_a` | Base render loops call with selection flag, row index and row Y; concrete draws label/slider content. Both base and concrete declarations are renamed. |
| `M:c.b(B)V` | `handleScreenKey_b` | Called while hh key events remain; branches on ki.field_d for navigation, activation and shortcuts. |
| `M:c.b(IB)V` | `activateMenuItem_b` | Dispatches per-screen action ID, requests screens, resumes play or creates new gh gameplay session. Both base and concrete declarations are renamed. |
| `M:c.c(I)V` | `updateTransition_c` | Geoblox calls on outgoing/incoming screens while their IDs differ; advances animation without normal screen input. |
| `M:c.c(II)V` | `setItemCount_c` | Assigns inherited item count from second argument; called after action-array length changes. |
| `M:c.d(I)V` | `previewMusicVolume_d` | Starts sample 8 at j.field_gb volume, retaining preview stream and resetting preview ticks. |
| `M:c.h(B)V` | `updateScreen_h` | Geoblox calls this on committed nonnegative screen ID; advances animation, processes keyboard/pointer and screen-specific state. |
| `M:ch.a(I)V` | `renderFrame_a` | ch draw turn invokes a(25853); GeoBlox draws loading/menu/game content and publishes Canvas. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.b(B)V` | `releaseGameResources_b` | Invokes global resource cleanup and clears game state references. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.b(I)V` | `initializeGame_b` | Initializes session configuration and 22050-Hz audio components. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.c(I)V` | `serviceAudio_c` | Services me.b audio outputs plus popup/host state; ch invokes c(1) during host service. Rename abstract declaration and implementation as one virtual family. |
| `M:ch.c(Z)V` | `updateGame_c` | ch tick invokes c(false); GeoBlox polls loading, input and screen updates. Rename abstract declaration and implementation as one virtual family. |
| `M:dm.a(IIIIII)V` | `rotateSmooth_a` | Smooth transform covered by test-smooth-rotation-parameters.mjs. |
| `M:dm.b(IIIIII)V` | `rotateNearest_b` | Nearest-neighbor transform covered by test-rotation-parameters.mjs. |
| `M:dm.c(IIIII)V` | `sampleBilinear_c` | Four source neighbors weighted by fractions masked to 4095, then destination write. |
| `M:ef.b(B)V` | `advanceActiveEntityAnimations_b` | ef.java takes el.field_o.field_J as the current board angle, traverses bh.field_c ja entities and calls ja.b(true); entities reaching the frame threshold are attached to ra.field_a for follow-up processing. |
| `M:gh.a(B)V` | `renderSession_a` | Called by Geoblox gameplay drawing; renders theme, rotating board, entities, text and overlays. |
| `M:gh.a(BI)V` | `addScore_a` | Adds second argument to score, formats/clamps display and updates score-dependent counters. |
| `M:gh.a(I)V` | `updateSession_a` | Called by Geoblox when current/requested screen IDs are -1; updates input, board/session logic and animations. |
| `M:gh.a(II)V` | `addPopupPoints_a` | Adds first argument to accumulated popup points and updates corresponding text. |
| `M:gh.b(Z)Z` | `canAdvanceSession_b` | gh.java returns false only when the session is not in field_H and field_bb is zero; gh.a(I)V checks this result before advancing its session logic. |
| `M:gh.c(Z)V` | `emitPointsPopup_c` | Creates ld popup for accumulated points, plays sample 32 and resets pending points. |
| `M:gh.d(B)V` | `startSessionEndSequence_d` | gh.java's external caller sk.java invokes this on the active session; it marks the session end sequence, emits accumulated points, updates the score display and enters the subsequent result flow. |
| `M:gh.d(I)V` | `requestSessionExitScreen_d` | Chooses requested screen 0, 2, 4 or 6 from session score/progression and fh.c branch, then starts exit audio. |
| `M:gh.e(B)V` | `submitScore_e` | Submits positive score through qf when eligible; clears ca pending record. |
| `M:il.b(IIIIII)V` | `rotateNearest_b` | Javac resolves this override of dm.b(IIIIII)V; retain the complete virtual family. |
| `M:ja.a(FI)V` | `rotateEntityAroundBoard_a` | ja.java rotates the position offset from (320,240) using the float argument's sin/cos, updates positionX/positionY, recalculates the radial velocity components, and adjusts field_u. |
| `M:ja.a(IFIFIIFFFIF)V` | `initializeEntityMotion_a` | ja.java stores the supplied position, velocity, category, variant and lifetime into the entity, normalizes the two velocity components to og.field_r, resets related counters and selects its sprite. |
| `M:ja.a(IIII)V` | `configureEntitySprite_a` | ja.java method a(int,int,int,int) stores sprite variant, entity visual mode and related selector values, then calls private g(byte) to choose the corresponding image. |
| `M:ja.a(Lja;I)V` | `removeRelatedEntity_a` | ja.java scans field_n beginning at the supplied index, removes the matching ja instance, shifts remaining array entries and updates related counts; kc.java invokes it while reconciling entity groups. |
| `M:ja.a(ZLkl;)V` | `registerAudioStream_a` | ja.java:772-779 is a static helper that enqueues a je wrapping the kl stream in qa.field_f and registers it with the global mixer ge.field_d. Callers include the menu volume preview at c.java:4438-4439, general playback at td.java:159 and session audio at gh.java:4291; no entity instance is involved. |
| `M:ja.b(II)I` | `alignBitOffset_b` | ja.java rounds the second integer upward to the next multiple of eight using param1&7; the first integer only guards the decompiler's sentinel path. |
| `M:ja.b(Z)V` | `advanceEntityAnimation_b` | ja.java method b(boolean) advances field_I, decrements the remaining lifetime, and selects successive sprite frames using tick modulo checks. |
| `M:ja.e(I)V` | `drawEntityAtPosition_e` | ja.java method e(int) draws field_J using field_o and field_v, with an additional offscreen/rotation path for visual mode 1. |
| `M:ja.f(B)V` | `integrateEntityVelocity_f` | ja.java method f(byte) adds field_w to field_o and field_F to field_v, directly integrating the two velocity components into position. |
| `M:ja.f(I)V` | `eraseEntityPixels_f` | ja.java clips the entity sprite rectangle to bk.field_a bounds, scans framebuffer pixels and clears only pixels equal to field_H+1. |
| `M:ja.g(B)V` | `selectEntitySprite_g` | ja.java private g(byte) selects field_J from the theme-specific sprite arrays according to the stored variant and frame indices, then prepares palette deltas. |
| `M:ja.g(I)V` | `drawBoardRotatedEntity_g` | ja.java rotates field_o/field_v around (320,240) by el.field_o.field_J, then draws or transforms field_J at the resulting board-relative coordinates. |
| `M:ja.j(I)V` | `eraseEntityTrail_j` | ja.java rotates the entity center into board coordinates, clips the sprite rectangle against wd.field_b, then clears matching field_H+1 pixels from that raster. |
| `M:ja.m(I)V` | `updatePaletteChannelDeltas_m` | ja.java method m(int) extracts adjacent palette entries from jg.field_h and stores their red, green and blue channel differences in field_s, field_x and field_y. |
| `M:ja.n(I)V` | `drawFadingEntity_n` | ja.java method n(int) computes a bounded opacity from field_r and field_p and passes it to the sprite draw call after positioning and rotation. |
| `M:ka.a(BI)V` | `increaseMenuValue_a` | Concrete increases music/effect sliders by ten; base dispatches right-direction keys here. Both base and concrete declarations are renamed. |
| `M:ka.a(I)V` | `renderScreen_a` | Geoblox render calls c.a(-28750); base implementation renders item rows, concrete draws complete screen. Both base and concrete declarations are renamed. |
| `M:ka.a(IB)V` | `decreaseMenuValue_a` | Concrete decreases music/effect sliders by ten; base dispatches left-direction keys here. Both base and concrete declarations are renamed. |
| `M:ka.a(II)V` | `handleMenuKey_a` | Base dispatches key codes to decrease/increase/activate item; concrete adds screen-specific shortcuts. Both base and concrete declarations are renamed. |
| `M:ka.a(IIB)I` | `hitTestMenuItem_a` | Called with pointer X/Y; returns selected menu row or -1 from screen-specific geometry. Both base and concrete declarations are renamed. |
| `M:ka.a(IIZIZI)V` | `handleMenuPointer_a` | Base pointer polling dispatches row, X, click/hold flags, row-relative Y and button; concrete handles sliders and activation. Both base and concrete declarations are renamed. |
| `M:ka.a(Z)V` | `updatePointer_a` | Polls click/held/hover coordinates and invokes menu handlers; inherited final method. |
| `M:ka.a(ZBII)V` | `renderMenuItem_a` | Base render loops call with selection flag, row index and row Y; concrete draws label/slider content. Both base and concrete declarations are renamed. |
| `M:ka.b(IB)V` | `activateMenuItem_b` | Dispatches per-screen action ID, requests screens, resumes play or creates new gh gameplay session. Both base and concrete declarations are renamed. |
| `M:kc.b(I)V` | `reconcileBoardEntities_b` | gh.java calls kc.b(...) from the gameplay update after ef.b(...). kc.java traverses ja lists, removes/relinks entities and related children, projects positions against the board radius, and sets el.field_o.field_F when entity state changes. |
| `M:ua.a([BI)V` | `setBitInput_a` | Sets shared bitstream bytes and byte cursor, resetting bit cursor to zero. |
| `M:ua.a([I)Lgd;` | `decodePcmBudgeted_a` | Converts decoded packets to signed PCM bytes, preserving packet/write cursors when sample budget is exhausted. |
| `M:ua.b()I` | `readBit_b` | Reads one bit at shared byte/bit cursor. |
| `M:ua.b(I)I` | `readBits_b` | Reads the requested bit count across byte boundaries. |
| `M:ua.b([B)V` | `readPacketContainer_b` | Reads sample metadata and length-prefixed packet payloads from qc; retains IOException behavior. |
| `M:ua.c()Lgd;` | `decodePcm_c` | Decodes all packets and builds gd from complete PCM output. |
| `M:ua.c(I)[F` | `decodePacket_c` | Selects field_p packet by index and computes float output during music loading. |
| `P:c.a(BI)V#1` | `itemIndex_param1` | Indexes action IDs for increase operation. |
| `P:c.a(IB)V#0` | `itemIndex_param0` | Indexes action IDs for decrease operation. |
| `P:c.a(II)V#0` | `itemIndex_param0` | Selected row passed to key handling. |
| `P:c.a(IIB)I#0` | `pointerX_param0` | Horizontal pointer coordinate tested against menu bounds. |
| `P:c.a(IIB)I#1` | `pointerY_param1` | Vertical pointer coordinate tested against menu rows. |
| `P:c.a(IIZIZI)V#0` | `itemIndex_param0` | Row index from hit test or retained pointer selection. |
| `P:c.a(IIZIZI)V#1` | `pointerX_param1` | Pointer X, converted to slider-relative coordinate by concrete handler. |
| `P:c.a(IIZIZI)V#2` | `initialClick_param2` | True for initial click path; false for held-button repeat. |
| `P:c.a(IIZIZI)V#3` | `rowOffsetY_param3` | Pointer Y minus top and row spacing. |
| `P:c.a(IIZIZI)V#4` | `heldRepeat_param4` | True in held-button path, controls repeat timing in base handler. |
| `P:c.a(IIZIZI)V#5` | `pointerButton_param5` | Click/held button value; controls activation or value adjustment. |
| `P:c.a(ZBII)V#0` | `selected_param0` | True for the selected row when rendering. |
| `P:c.a(ZBII)V#2` | `itemIndex_param2` | Row index supplied by render loop. |
| `P:c.a(ZBII)V#3` | `rowY_param3` | Row Y supplied by render loop and used in text/slider drawing. |
| `P:c.b(IB)V#0` | `itemIndex_param0` | Indexes action IDs for activation. |
| `P:c.c(II)V#1` | `itemCount_param1` | Copied into inherited item count. |
| `P:dm.a(IIIIII)V#0` | `sourcePivotX_param0` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#1` | `sourcePivotY_param1` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#2` | `destinationX_param2` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#3` | `destinationY_param3` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#4` | `angle_param4` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.a(IIIIII)V#5` | `scale_param5` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#0` | `sourcePivotX_param0` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#1` | `sourcePivotY_param1` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#2` | `destinationX_param2` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#3` | `destinationY_param3` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#4` | `angle_param4` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.b(IIIIII)V#5` | `scale_param5` | Original position retained; transform equations and renderer differential fixtures. |
| `P:dm.c(IIIII)V#0` | `destinationIndex_param0` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#1` | `sourceX_param1` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#2` | `sourceY_param2` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#3` | `fractionX_param3` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:dm.c(IIIII)V#4` | `fractionY_param4` | Bilinear sampler array index and 12-bit fraction expressions. |
| `P:gh.a(BI)V#1` | `points_param1` | Value added to score. |
| `P:gh.a(II)V#0` | `points_param0` | Value added to popup points. |
| `P:gh.c(Z)V#0` | `markSubmissionBlocked_param0` | When true sets field_K, which blocks score submission. |
| `P:ja.a(FI)V#0` | `rotationDeltaRadians_param0` | ja.java applies param0 in sin/cos rotation of the position offset from (320,240), rotates velocity and adjusts the entity angle by the same delta. |
| `P:ja.a(IFIFIIFFFIF)V#1` | `positionX_param1` | ja.java assigns param1 directly to field_o, which is the horizontal position rotated around screen center and rendered by its sprite methods. |
| `P:ja.a(IFIFIIFFFIF)V#3` | `velocityX_param3` | ja.java assigns param3 to field_w, then scales it with param8 and the board radius; f(byte) integrates field_w into field_o. |
| `P:ja.a(IFIFIIFFFIF)V#4` | `spriteVariantIndex_param4` | ja.java stores param4 in field_M, which indexes the selected theme sprite array in private g(byte). |
| `P:ja.a(IFIFIIFFFIF)V#5` | `lifetimeTicks_param5` | ja.java initializes both field_p and field_r from param5; b(boolean) decreases the remaining field_r and n(int) derives opacity from both values. |
| `P:ja.a(IFIFIIFFFIF)V#7` | `positionY_param7` | ja.java assigns param7 directly to field_v, used as vertical position in board rotation and sprite rendering. |
| `P:ja.a(IFIFIIFFFIF)V#8` | `velocityY_param8` | ja.java assigns param8 to field_F, normalizes it with param3 and later integrates field_F into field_v. |
| `P:ja.a(IFIFIIFFFIF)V#9` | `entityCategoryKey_param9` | ja.java assigns param9 to field_C, compared with related entities' field_C when updating category counts. |
| `P:ja.a(IIII)V#1` | `entityCategoryKey_param1` | ja.java assigns param1 to field_C, which is compared against another entity's field_C when maintaining same-category membership counts. |
| `P:ja.a(IIII)V#2` | `spriteVariantIndex_param2` | ja.java assigns param2 to field_M; private g(byte) uses field_M to index the selected theme's sprite variants. |
| `P:ja.a(Lja;I)V#0` | `relatedEntity_param0` | ja.java searches field_n for object identity equal to param0 before removing that related entity; kc.java passes the parent whose child is being detached. |
| `P:ja.a(Lja;I)V#1` | `startingChildIndex_param1` | ja.java initializes its field_n search cursor directly from param1 and increments it until field_L. |
| `P:ja.b(II)I#1` | `bitOffset_param1` | ja.java masks param1 with 7 to calculate padding to the next byte-aligned bit offset, then returns param1 plus that padding. |
| `P:ka.a(BI)V#1` | `itemIndex_param1` | Indexes action IDs for increase operation. |
| `P:ka.a(IB)V#0` | `itemIndex_param0` | Indexes action IDs for decrease operation. |
| `P:ka.a(II)V#0` | `itemIndex_param0` | Selected row passed to key handling. |
| `P:ka.a(IIB)I#0` | `pointerX_param0` | Horizontal pointer coordinate tested against menu bounds. |
| `P:ka.a(IIB)I#1` | `pointerY_param1` | Vertical pointer coordinate tested against menu rows. |
| `P:ka.a(IIZIZI)V#0` | `itemIndex_param0` | Row index from hit test or retained pointer selection. |
| `P:ka.a(IIZIZI)V#1` | `pointerX_param1` | Pointer X, converted to slider-relative coordinate by concrete handler. |
| `P:ka.a(IIZIZI)V#2` | `initialClick_param2` | True for initial click path; false for held-button repeat. |
| `P:ka.a(IIZIZI)V#3` | `rowOffsetY_param3` | Pointer Y minus top and row spacing. |
| `P:ka.a(IIZIZI)V#4` | `heldRepeat_param4` | True in held-button path, controls repeat timing in base handler. |
| `P:ka.a(IIZIZI)V#5` | `pointerButton_param5` | Click/held button value; controls activation or value adjustment. |
| `P:ka.a(ZBII)V#0` | `selected_param0` | True for the selected row when rendering. |
| `P:ka.a(ZBII)V#2` | `itemIndex_param2` | Row index supplied by render loop. |
| `P:ka.a(ZBII)V#3` | `rowY_param3` | Row Y supplied by render loop and used in text/slider drawing. |
| `P:ka.b(IB)V#0` | `itemIndex_param0` | Indexes action IDs for activation. |
| `P:ua.a([BI)V#0` | `inputBytes_param0` | Assigned directly to shared bitstream bytes. |
| `P:ua.a([BI)V#1` | `startByte_param1` | Assigned directly to byte cursor. |
| `P:ua.a([I)Lgd;#0` | `sampleBudget_param0` | Optional int[0] remaining sample budget; null preserves unlimited decoding. |
| `P:ua.b(I)I#0` | `bitCount_param0` | Requested bit count in shared bit-reader loop. |
| `P:ua.b([B)V#0` | `containerBytes_param0` | qc wraps the input container bytes for header and packet parsing. |
| `P:ua.c(I)[F#0` | `packetIndex_param0` | Selects packets[packetIndex] before starting bit input. |
