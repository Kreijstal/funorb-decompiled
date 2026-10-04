/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Geoblox extends SessionGameApplet {
    static String[] reconnectMessages;
    static String loginMessage;
    static volatile long canvasCreationTimeMillis;
    static MessageDialog activeMessageDialog;
    static LoginPayloadKind longAndNameLoginType;
    public static int clientControlFlowFlag;

    private final void loadSportsTheme(int methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(GameGraphicsResources.gameGraphicsArchive.loadGroupByName("sports", (byte) -126))) {
                return;
            }
            if (methodGuard <= 37) {
                this.initializeScreens(92);
            }
            LabeledChildWidget.sportsForegroundSprite = ScorePopupSupport.loadSprite("sports_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "sports");
            AlternateLongAndTextLoginPayload.sportsBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "sports", "sports_background");
            GameGraphicsResources.themesLoaded[5] = true;
            return;
        }
    }

    public Geoblox() {
    }

    final void serviceAudio(int methodGuard) {
        if (methodGuard != 1) {
            this.loadJewelsTheme(true);
        }
        ScorePopup.b(122);
        if (!(InstrumentPatch.field_n == null)) {
            InstrumentPatch.field_n.exitFullscreen(0, MenuScreen.platformTaskDispatcher);
        }
        MidiNote.releaseSessionInputAndCloseSocket((byte) 124);
    }

    private final boolean prepareGameAssets(int methodGuard) {
        int uiPaletteSize = 0;
        int[] alternateUiPalette = null;
        Sprite[] geometrySourceFrames = null;
        Sprite[] geometryAliasThenAmorphousFrames = null;
        int themeIndex = 0;
        int geometryCanvasHeight = 0;
        Sprite[] avatarEyeSourceFrames = null;
        Sprite[] avatarMouthSourceFrames = null;
        IndexedSprite[] keyboardIconSprites = null;
        int[] keyboardIconAdvanceWidths = null;
        int[] keyboardWidthAlias = null;
        int[] keyboardWidthsForFill = null;
        int keyboardIconIndex = 0;
        int geometryFrameThenVariantIndex = 0;
        int categoryThenAnimationFrameIndex = 0;
        int geometryCanvasWidthThenFrameIndex = 0;
        int paletteVariantThenKeyboardIndex = 0;
        int clientFlagSnapshot = clientControlFlowFlag;
        ByteStorage.a(CachedTextLayout.wheelRotationSnapshot, (byte) -104);
        if (null != OpacityWidget.field_F && null != GzipInflater.field_a && TextWidgetSupport.field_c != null && null != ProxySocketConnector.field_m) {
            HighscoreNameEntry.setLoadingProgress(FifoResponseToken.unpackingMusicText, -2, 60.0f);
            this.renderFrame(25853);
            SocketConnector.prepareInitialGameAudio(OpacityWidget.field_F, (byte) 80, TextWidgetSupport.field_c, GzipInflater.field_a, ProxySocketConnector.field_m);
            TextWidgetSupport.field_c = null;
            OpacityWidget.field_F = null;
            ProxySocketConnector.field_m = null;
            GzipInflater.field_a = null;
            EntityContactSupport.resetFrameTimingHistory(127);
            return false;
        }
        if (null != GameGraphicsResources.gameGraphicsArchive && null != ArchiveLoadStep.fontMetricsArchive && SessionTextHistorySupport.basicUiGraphicsArchive != null) {
            HighscoreNameEntry.setLoadingProgress(ClientScreenExitSupport.unpackingGraphicsText, methodGuard - 25871, 80.0f);
            this.renderFrame(25853);
            FadingDialog.uiPaletteFont = SessionSocketSupport.loadPaletteFont("", GameGraphicsResources.gameGraphicsArchive, ArchiveLoadStep.fontMetricsArchive, true, "font");
            SessionGameApplet.uiAccentPaletteIndex = FadingDialog.uiPaletteFont.findNearestBasePaletteIndex(1);
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.uiAccentPaletteIndex] = 16689938;
            FadingDialog.uiPaletteFont.colorPalettes[0][FadingDialog.uiPaletteFont.findNearestBasePaletteIndex(16777215)] = 1;
            uiPaletteSize = FadingDialog.uiPaletteFont.colorPalettes[0].length;
            alternateUiPalette = new int[uiPaletteSize];
            FadingDialog.uiPaletteFont.colorPalettes[1] = alternateUiPalette;
            ArrayOperations.copyInts(FadingDialog.uiPaletteFont.colorPalettes[0], 0, FadingDialog.uiPaletteFont.colorPalettes[1], 0, uiPaletteSize);
            FadingDialog.uiPaletteFont.colorPalettes[1][SessionGameApplet.uiAccentPaletteIndex] = 16777215;
            geometrySourceFrames = OpacityWidget.loadSpriteFrames("geoms", "", GameGraphicsResources.gameGraphicsArchive, 0);
            geometryAliasThenAmorphousFrames = geometrySourceFrames;
            themeIndex = -1;
            for (geometryFrameThenVariantIndex = 0; geometrySourceFrames.length > geometryFrameThenVariantIndex; geometryFrameThenVariantIndex++) {
                categoryThenAnimationFrameIndex = geometryFrameThenVariantIndex % 7;
                if (!(categoryThenAnimationFrameIndex != 0)) {
                    themeIndex++;
                    if (themeIndex >= 7) {
                        break;
                    }
                }
                geometryCanvasWidthThenFrameIndex = geometrySourceFrames[geometryFrameThenVariantIndex].fullWidth;
                geometryCanvasHeight = geometrySourceFrames[geometryFrameThenVariantIndex].fullHeight;
                Under13TermsPanel.geometrySpritesByThemeAndCategory[themeIndex][categoryThenAnimationFrameIndex] = geometrySourceFrames[geometryFrameThenVariantIndex];
                for (paletteVariantThenKeyboardIndex = 0; paletteVariantThenKeyboardIndex < 7; paletteVariantThenKeyboardIndex++) {
                    ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex] = new Sprite(geometryCanvasWidthThenFrameIndex, geometryCanvasHeight);
                    ConnectionHeaderSupport.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex].setAsRasterTarget();
                    geometrySourceFrames[geometryFrameThenVariantIndex].drawGrayModulated(0, 0, SocketConnector.themeSpriteColors[themeIndex][paletteVariantThenKeyboardIndex]);
                }
            }
            geometryAliasThenAmorphousFrames = OpacityWidget.loadSpriteFrames("amorphic", "", GameGraphicsResources.gameGraphicsArchive, methodGuard ^ 25869);
            for (themeIndex = 0; themeIndex < 7; themeIndex++) {
                for (geometryFrameThenVariantIndex = 0; geometryFrameThenVariantIndex < 7; geometryFrameThenVariantIndex++) {
                    for (categoryThenAnimationFrameIndex = 0; categoryThenAnimationFrameIndex < geometryAliasThenAmorphousFrames.length; categoryThenAnimationFrameIndex++) {
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex] = new Sprite(4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullWidth, 4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullHeight);
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].setAsRasterTarget();
                        geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].drawGrayModulated(2, 2, SocketConnector.themeSpriteColors[themeIndex][geometryFrameThenVariantIndex]);
                        NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullWidth, methodGuard ^ -3266, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullHeight);
                    }
                }
            }
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            IntrusiveNodeHashTable.smallFont = IterableNodeHashTable.loadBitmapFont(ArchiveLoadStep.fontMetricsArchive, 1, GameGraphicsResources.gameGraphicsArchive, "small_font", "");
            EndingAnimationSupport.blackOrbFrames = OpacityWidget.loadSpriteFrames("black", "", GameGraphicsResources.gameGraphicsArchive, 0);
            LoginPasswordSupport.blackOrbImplosionFrames = OpacityWidget.loadSpriteFrames("black_implode", "", GameGraphicsResources.gameGraphicsArchive, 0);
            DialRenderer.silverStarFrames = OpacityWidget.loadSpriteFrames("silver", "", GameGraphicsResources.gameGraphicsArchive, 0);
            RatingPresentationResources.amorphousCrackFrames = OpacityWidget.loadSpriteFrames("amorph_crack", "", GameGraphicsResources.gameGraphicsArchive, 0);
            MeshDepthSupport.avatarMaskRaster = ScorePopupSupport.loadSprite("player_back", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            avatarEyeSourceFrames = OpacityWidget.loadSpriteFrames("player_eyes", "", GameGraphicsResources.gameGraphicsArchive, 0);
            if (ClientOptionSupport.isClientOptionEnabled(0, 125)) {
                avatarEyeSourceFrames = OpacityWidget.loadSpriteFrames("player_eyes", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
            }
            EndingAnimationSupport.avatarEyeFrames = new Sprite[avatarEyeSourceFrames.length];
            for (categoryThenAnimationFrameIndex = 0; avatarEyeSourceFrames.length > categoryThenAnimationFrameIndex; categoryThenAnimationFrameIndex++) {
                EndingAnimationSupport.avatarEyeFrames[categoryThenAnimationFrameIndex] = new Sprite(4 + avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullWidth, avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullHeight + 4);
                EndingAnimationSupport.avatarEyeFrames[categoryThenAnimationFrameIndex].setAsRasterTarget();
                avatarEyeSourceFrames[categoryThenAnimationFrameIndex].drawUnmasked(2, 2);
                NodeHashTableIterator.markInsetZeroOutlinePixels(0, 0, EndingAnimationSupport.avatarEyeFrames[categoryThenAnimationFrameIndex].fullWidth, -27085, EndingAnimationSupport.avatarEyeFrames[categoryThenAnimationFrameIndex].height);
                EndingAnimationSupport.avatarEyeFrames[categoryThenAnimationFrameIndex].trimTransparentBorders();
            }
            avatarMouthSourceFrames = OpacityWidget.loadSpriteFrames("player_mouth", "", GameGraphicsResources.gameGraphicsArchive, 0);
            if (ClientOptionSupport.isClientOptionEnabled(0, methodGuard - 25774)) {
                avatarMouthSourceFrames = OpacityWidget.loadSpriteFrames("player_mouth", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
            }
            UsernameSuggestionsPanel.avatarMouthFrames = new Sprite[avatarMouthSourceFrames.length];
            for (geometryCanvasWidthThenFrameIndex = 0; avatarMouthSourceFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex] = new Sprite(avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullWidth + 4, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullHeight + 4);
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].setAsRasterTarget();
                avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].drawUnmasked(2, 2);
                NodeHashTableIterator.markInsetZeroOutlinePixels(2 + avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].trimY, 0, UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].fullWidth, -27085, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].height);
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].trimTransparentBorders();
            }
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            GzipInflater.sunBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "sun", "sky_background");
            PacketByteCipher.sunForegroundSprite = ScorePopupSupport.loadSprite("sky_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "sun");
            GameGraphicsResources.themesLoaded[1] = true;
            WidgetContainer.menuBackgroundSprite = ScorePopupSupport.loadSprite("menu_background", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            CachedTextLayout.menuForegroundSprite = ScorePopupSupport.loadSprite("menu_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            CharacterReplacementSupport.transitionCurtain = ScorePopupSupport.loadSprite("transition", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            SecondaryNodeHashTable.silverStarShockFrames = OpacityWidget.loadSpriteFrames("silver_shock", "", GameGraphicsResources.gameGraphicsArchive, 0);
            VisualPropertyOverrides.sparkleFrames = OpacityWidget.loadSpriteFrames("sparkle", "", GameGraphicsResources.gameGraphicsArchive, 0);
            for (geometryCanvasWidthThenFrameIndex = 0; VisualPropertyOverrides.sparkleFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                VisualPropertyOverrides.sparkleFrames[geometryCanvasWidthThenFrameIndex].addOutline(1);
            }
            SessionTextState.bangFrames = OpacityWidget.loadSpriteFrames("bang", "", GameGraphicsResources.gameGraphicsArchive, 0);
            ReflectionCheckRequest.pointsPanelGlowFrames = OpacityWidget.loadSpriteFrames("bonus_glow", "", GameGraphicsResources.gameGraphicsArchive, 0);
            PacketBuffer.resultBubbleSprite = ScorePopupSupport.loadSprite("bubble", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            NodeHashTableIterator.popSprite = ScorePopupSupport.loadSprite("pop", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            ArchiveLoadSequence.mouseBoxFrames = OpacityWidget.loadSpriteFrames("box_mouse", "", GameGraphicsResources.gameGraphicsArchive, 0);
            HotspotTextWidget.avatarCryBeginFrames = OpacityWidget.loadSpriteFrames("cry_begin", "", GameGraphicsResources.gameGraphicsArchive, 0);
            ClientRenderingState.avatarCryMiddleFrames = OpacityWidget.loadSpriteFrames("cry_middle", "", GameGraphicsResources.gameGraphicsArchive, 0);
            PlayfieldRules.avatarCryEndFrames = OpacityWidget.loadSpriteFrames("cry_end", "", GameGraphicsResources.gameGraphicsArchive, 0);
            if (!(!ClientOptionSupport.isClientOptionEnabled(0, 110))) {
                HotspotTextWidget.avatarCryBeginFrames = OpacityWidget.loadSpriteFrames("cry_begin", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
                ClientRenderingState.avatarCryMiddleFrames = OpacityWidget.loadSpriteFrames("cry_middle", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
                PlayfieldRules.avatarCryEndFrames = OpacityWidget.loadSpriteFrames("cry_end", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
            }
            keyboardIconSprites = new IndexedSprite[8];
            keyboardIconSprites[0] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_left");
            keyboardIconSprites[1] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_right");
            keyboardIconSprites[2] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_enter");
            keyboardIconSprites[3] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_space");
            keyboardIconSprites[4] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, EmailAvailabilityQuery.xorInt(methodGuard, 25868), "", "keyboard_esc");
            keyboardIconSprites[5] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_backspace");
            keyboardIconSprites[6] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_down");
            keyboardIconSprites[7] = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "", "keyboard_i");
            keyboardIconAdvanceWidths = new int[keyboardIconSprites.length];
            keyboardWidthAlias = keyboardIconAdvanceWidths;
            keyboardWidthsForFill = keyboardWidthAlias;
            keyboardIconIndex = 0;
            paletteVariantThenKeyboardIndex = keyboardIconIndex;
            while (keyboardIconIndex < keyboardIconAdvanceWidths.length) {
                keyboardWidthsForFill[keyboardIconIndex] = keyboardIconSprites[keyboardIconIndex].fullHeight - 3;
                keyboardIconIndex++;
            }
            IntrusiveNodeHashTable.smallFont.setInlineImages(keyboardIconSprites, keyboardIconAdvanceWidths);
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            AudioService.screenTitleSprites[0] = ScorePopupSupport.loadSprite("main_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[2] = ScorePopupSupport.loadSprite("bestscoreseach_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[3] = ScorePopupSupport.loadSprite("myscores_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[1] = ScorePopupSupport.loadSprite("allscores_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[6] = ScorePopupSupport.loadSprite("gameover_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[4] = ScorePopupSupport.loadSprite("achievements_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[5] = ScorePopupSupport.loadSprite("instructions_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[7] = ScorePopupSupport.loadSprite("achievements_tg_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[8] = ScorePopupSupport.loadSprite("login_title", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites = new Sprite[9];
            GameGraphicsResources.frameNineSliceSprites[0] = ScorePopupSupport.loadSprite("frame_topleft", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[1] = ScorePopupSupport.loadSprite("frame_top", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[2] = ScorePopupSupport.loadSprite("frame_topright", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[3] = ScorePopupSupport.loadSprite("frame_left", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[4] = ScorePopupSupport.loadSprite("frame_centre", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[5] = ScorePopupSupport.loadSprite("frame_right", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[6] = ScorePopupSupport.loadSprite("frame_bottomleft", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[7] = ScorePopupSupport.loadSprite("frame_bottom", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            GameGraphicsResources.frameNineSliceSprites[8] = ScorePopupSupport.loadSprite("frame_bottomright", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            RankedListQuery.widgetSprite = ScorePopupSupport.loadSprite("widget", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            NetworkArchiveRequest.barSprite = ScorePopupSupport.loadSprite("bar", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            PointerMenuState.smallBoxSprite = ScorePopupSupport.loadSprite("box_sml", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            PasswordValidator.countBoxSprite = ScorePopupSupport.loadSprite("box_count", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            UsernameSuggestionsPanel.largeBoxSprite = ScorePopupSupport.loadSprite("box_lgr", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "");
            RasterTargetSnapshot.introFaceFrames = OpacityWidget.loadSpriteFrames("intro_faces", "", GameGraphicsResources.gameGraphicsArchive, 0);
            if (ClientOptionSupport.isClientOptionEnabled(0, -105)) {
                RasterTargetSnapshot.introFaceFrames = OpacityWidget.loadSpriteFrames("intro_faces", "halloween", GameGraphicsResources.gameGraphicsArchive, 0);
            }
            AccountCreationForm.introGeometryFrames = OpacityWidget.loadSpriteFrames("intro_geoms", "", GameGraphicsResources.gameGraphicsArchive, 0);
            UsernameAvailabilityQuery.achievementSprites = OpacityWidget.loadSpriteFrames("achievements", "", GameGraphicsResources.gameGraphicsArchive, 0);
            IntKeyLookup.unachievedSprite = ScorePopupSupport.loadSprite("unachieved", SessionTextHistorySupport.basicUiGraphicsArchive, (byte) -78, "basic");
            ScorePopupSupport.loadSprite("locked", SessionTextHistorySupport.basicUiGraphicsArchive, (byte) -78, "basic");
            UsernameAvailabilityValidator.orbCoinSprite = ScorePopupSupport.loadSprite("orbcoin", SessionTextHistorySupport.basicUiGraphicsArchive, (byte) -78, "basic");
            GameScreen.selectedThemeId = 1;
            ProxySocketConnector.selectThemeRenderAssets((byte) 79);
            EntityContactSupport.resetFrameTimingHistory(-62);
            ArchiveLoadStep.fontMetricsArchive = null;
            SessionTextHistorySupport.basicUiGraphicsArchive = null;
            return false;
        }
        if (methodGuard != 25869) {
            reconnectMessages = (String[]) null;
        }
        HighscoreNameEntry.setLoadingProgress(FullscreenFailureReason.field_a, -2, 100.0f);
        this.renderFrame(methodGuard ^ 496);
        LoginPayloadKind.ensureAchievementStateRequested(9313);
        return true;
    }

    private final boolean pollArchiveLoading(boolean archivePollGuard) {
        ResourceArchive soundArchiveSnapshot = null;
        boolean soundLoadGroupsGuard = false;
        String fontWaitingTextSnapshot;
        ResourceArchive fontArchiveSnapshot;
        String fontGroupNameSnapshot;
        String fontLoadingTextSnapshot;
        boolean fontProgressGuard = false;
        String graphicsWaitingTextSnapshot;
        ResourceArchive graphicsArchiveSnapshot;
        String graphicsGroupNameSnapshot;
        String graphicsLoadingTextSnapshot;
        boolean graphicsProgressGuard = false;
        if (SecondaryNodeDequeIterator.archiveLoadingComplete) {
          return true;
        }
        Under13TermsPanel.g(9);
        if ((OpacityWidget.field_F.ensureIndexLoaded(0)) &&
            (OpacityWidget.field_F.loadAllGroups(true))) {
          if (TextWidgetSupport.field_c.ensureIndexLoaded(0)) {
            soundArchiveSnapshot = TextWidgetSupport.field_c;
            soundLoadGroupsGuard = (archivePollGuard) ? false : true;
            if (((ResourceArchive) (Object) soundArchiveSnapshot).loadAllGroups(soundLoadGroupsGuard)) {
              if ((GzipInflater.field_a.ensureIndexLoaded(0)) &&
                  (GzipInflater.field_a.loadAllGroups(true))) {
                if ((ProxySocketConnector.field_m.ensureIndexLoaded(0)) &&
                    (ProxySocketConnector.field_m.loadAllGroups(true))) {
                  if ((ArchiveLoadStep.fontMetricsArchive.ensureIndexLoaded(0)) &&
                      (ArchiveLoadStep.fontMetricsArchive.loadAllGroups(true))) {
                    if ((GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                        (GameGraphicsResources.gameGraphicsArchive.loadGroupByName("", (byte) -127))) {
                      if ((GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                          (GameGraphicsResources.gameGraphicsArchive.loadGroupByName("sun", (byte) -127))) {
                        if (ClientOptionSupport.isClientOptionEnabled(0, -112)) {
                          if (!((GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                              (GameGraphicsResources.gameGraphicsArchive.loadGroupByName("halloween", (byte) -127)))) {
                            HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(Under13TermsPanel.field_F, GameGraphicsResources.gameGraphicsArchive, "halloween", FullscreenFailureReason.field_c, true), -2, 45.0f);
                            return false;
                          }
                        }
                        if ((SessionTextHistorySupport.basicUiGraphicsArchive.ensureIndexLoaded(0)) &&
                            (SessionTextHistorySupport.basicUiGraphicsArchive.loadGroupByName("basic", (byte) -124))) {
                          if (archivePollGuard) {
                            return true;
                          }
                          SecondaryDeque.settleAccountDialogAnimations(480);
                          HighscoreNameEntry.setLoadingProgress(FullscreenFailureReason.field_a, -2, 50.0f);
                          this.renderFrame(25853);
                          SecondaryNodeDequeIterator.archiveLoadingComplete = true;
                          return true;
                        }
                        graphicsWaitingTextSnapshot = TextWidgetRenderer.waitingForGraphicsText;
                        graphicsArchiveSnapshot = SessionTextHistorySupport.basicUiGraphicsArchive;
                        graphicsGroupNameSnapshot = "basic";
                        graphicsLoadingTextSnapshot = AccountWelcomePanel.loadingGraphicsText;
                        graphicsProgressGuard = (archivePollGuard) ? false : true;
                        HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(graphicsWaitingTextSnapshot, graphicsArchiveSnapshot, graphicsGroupNameSnapshot, graphicsLoadingTextSnapshot, graphicsProgressGuard), -2, 50.0f);
                        return false;
                      }
                      HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(TextWidgetRenderer.waitingForGraphicsText, GameGraphicsResources.gameGraphicsArchive, "sun", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                      return false;
                    }
                    HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(TextWidgetRenderer.waitingForGraphicsText, GameGraphicsResources.gameGraphicsArchive, "", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                    return false;
                  }
                  fontWaitingTextSnapshot = EntityLinkSupport.waitingForFontsText;
                  fontArchiveSnapshot = ArchiveLoadStep.fontMetricsArchive;
                  fontGroupNameSnapshot = "";
                  fontLoadingTextSnapshot = EntitySpawnSupport.loadingFontsText;
                  fontProgressGuard = (archivePollGuard) ? false : true;
                  HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(fontWaitingTextSnapshot, fontArchiveSnapshot, fontGroupNameSnapshot, fontLoadingTextSnapshot, fontProgressGuard), -2, 35.0f);
                  return false;
                }
                HighscoreNameEntry.setLoadingProgress(ReceivedTextRecord.formatArchiveGroupProgress(AchievementProtocolSupport.loadingSoundEffectsText, LimitedRandomAccessFile.waitingForSoundEffectsText, 0, archivePollGuard, ProxySocketConnector.field_m), -2, 25.0f);
                return false;
              }
              HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(ArchiveNetworkClient.waitingForMusicText, GzipInflater.field_a, "", FadingDialog.loadingMusicText, true), -2, 15.0f);
              return false;
            }
          }
          HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(LimitedRandomAccessFile.waitingForSoundEffectsText, TextWidgetSupport.field_c, "", AchievementProtocolSupport.loadingSoundEffectsText, true), -2, 10.0f);
          return false;
        }
        HighscoreNameEntry.setLoadingProgress(EntityCollisionSupport.formatArchiveGroupProgress(LimitedRandomAccessFile.waitingForSoundEffectsText, OpacityWidget.field_F, "", AchievementProtocolSupport.loadingSoundEffectsText, true), -2, 5.0f);
        return false;
    }

    final void releaseGameResources(byte methodGuard) {
        Geoblox.clearAppletStatics(0);
        GameApplet.releaseMeshDepthBuckets((byte) 122);
        MidiPcmStream.clearSharedInputAndSpriteState(false);
        ScorePopupSupport.releaseStaticReferences(9144);
        SharedBufferPools.clearSharedBufferResources(-13575);
        LoginPasswordSupport.releaseLoginPasswordResources(-17525);
        SessionBootstrapSupport.clearSessionBootstrapTexts(16424);
        ClientRenderingState.releaseClientRenderingResources(true);
        SessionGameApplet.releaseSessionAppletResources(30344);
        AsyncResourceDownloader.c((byte) 108);
        KeyboardInputListener.a(31997);
        PointerInputListener.a(-29313);
        MouseWheelInput.a(-42);
        SoftwareRasterizer.releaseRasterStorage();
        ResourceArchive.b(30261);
        TextTemplateLookupSupport.releaseTemplateLookupState(17062);
        UsernameResponseSupport.clearUsernameAndCompressionResources(105);
        ByteArrayBuffer.clearWhirlpoolTables(0);
        ClientClockSupport.clearClockAndGraphicsResources(8192);
        EntityMotionSupport.a((byte) -60);
        EntityCollisionSupport.releaseStaticReferences(true);
        NameCharacterSupport.releaseStaticReferences(45);
        FullscreenSupport.releaseStaticReferences(methodGuard ^ 10848);
        EntityLinkSupport.releaseStaticReferences(48);
        ReceivedTextRecord.releaseTextRecordResources(methodGuard + 59);
        GameplaySetupSupport.releaseStaticReferences(22059);
        PointerMenuState.releasePointerMenuResources(-1);
        UsernameQuerySupport.releaseStaticReferences(-9474);
        MeshDepthSupport.releaseStaticReferences(false);
        FrameTimer.releaseSharedResources(methodGuard ^ 78);
        AwtRasterBuffer.b((byte) 58);
        ArchiveLoadSequence.a((byte) -127);
        FullscreenFocusCanvas.a(methodGuard + 64);
        CanvasResizeController.a(true);
        GameScreen.releaseStaticReferences((byte) 28);
        GameplaySession.releaseStaticReferences(-17199);
        ArchiveNetworkClient.d(-50);
        DiskCacheWorker.a(methodGuard ^ 74);
        ArchiveCatalog.a(86);
        BufferedSocket.releaseTransformedVertexScratch(21888);
        IntrusiveDeque.releaseSharedResources(51);
        IntrusiveNode.releaseNodeResources((byte) -128);
        IntrusiveNodeHashTable.releaseSharedResources(methodGuard - 63);
        MidiTrackReader.clearStatusDataByteCounts();
        MidiNoteMixer.clearFullscreenFailureText(-1);
        TrackedPcmStream.a((byte) 54);
        AudioOutput.releaseSharedAudioServiceReference();
        LoginUiSupport.clearLoginUiText(methodGuard + 154);
        AchievementProtocolSupport.releaseStaticReferences(0);
        ClientOptionSupport.releaseClientOptionResources(50);
        ArchiveIndex.a(114);
        GzipInflater.c(-127);
        ArchiveSource.a(true);
        LogoCompositor.releaseStaticReferences(-6910);
        PlayfieldRules.releaseStaticReferences(true);
        MessageDialogSupport.releaseStaticReferences(30970);
        DialogLayer.releaseStaticReferences(methodGuard - 33);
        AccountCreationDialog.r(-60);
        ProgressDialog.h((byte) 57);
        AccountContentDialog.n(methodGuard ^ 69);
        MessageDialog.releaseStaticReferences(-107);
        AccountCreationForm.h(0);
        AccountWelcomePanel.f(1);
        LoginPanel.a((byte) -97);
        DisplayNamePanel.i((byte) -85);
        LoginTextValue.a(methodGuard + 63);
        RatingPresentationResources.releaseStaticReferences(-89);
        TextConcatenationSupport.clearConcatenationResources(methodGuard + 168);
        PcmResampler.a(true);
        SessionSocketSupport.releaseSessionSocketResources((byte) 102);
        BootstrapUiSupport.releaseBootstrapUiText(methodGuard ^ 9769);
        BitmapFont.releaseTextScratchStorage();
        DualLinkNode.releaseDualLinkResources((byte) -110);
        SpriteState.f(methodGuard ^ -5558);
        PendingActionMarker.c((byte) 45);
        ConnectionHeaderSupport.clearConnectionHeaderSprites((byte) -80);
        CacheFileState.releaseStaticReferences((byte) -103);
        GameAudioState.releaseGameAudioResources(-8297);
        FullscreenEntrySupport.clearFullscreenEntryResources(-8616);
        LoginPayloadKind.a(85);
        LoginPayload.a(methodGuard + 64);
        PacketBuffer.j(methodGuard ^ -64);
        SessionTextHistorySupport.releaseStaticReferences((byte) -64);
        MenuScreen.releaseStaticReferences((byte) 26);
        ClientScreenExitSupport.clearScreenExitResources((byte) -88);
        SecondaryDeque.releaseSharedResources(-10943);
        GameplayEntity.e((byte) 104);
        BoardReconciliationSupport.releaseStaticReferences(126);
        SpawnQuotaSupport.releaseSelectedThemeBackground(false);
        TextWidgetSupport.clearTextWidgetResources(39);
        GameSoundResources.releaseStaticReferences(33);
        ClientFlowState.clearClientFlowResources((byte) 122);
        LoginProtocolSupport.releaseStaticReferences(5366);
        LimitedRandomAccessFile.b((byte) 74);
        DelegatingCanvas.a((byte) 81);
        MatchScoringSupport.releaseStaticReferences(true);
        InstrumentNoteMask.b(false);
        InstrumentPatch.b(true);
        InstrumentEnvelope.a(17348);
        AudioService.releaseAudioServiceResources(104);
        PacketByteCipher.b((byte) -125);
        SocketArchiveNetworkClient.i(-84);
        NetworkArchiveRequest.e((byte) 118);
        CachedArchiveSource.b(true);
        ArchiveRequest.f(31735);
        UsernameQueryState.clearAccountUsernameResult(true);
        FullscreenErrorDialog.i((byte) -80);
        LogoPreparationSupport.releaseStaticReferences(true);
        TextWidgetRenderer.releaseStaticReferences(true);
        TriangleRasterState.releaseTriangleTables();
        MusicDecoder.a();
        AttachedEntityRenderer.releaseStaticReferences(126);
        TriangleMesh.b((byte) 115);
        SessionInstanceState.releaseSessionInstanceSprite(31);
        FontLoadingSupport.clearFontLoadingResources((byte) -112);
        EndingAnimationSupport.releaseStaticReferences((byte) -126);
        EntitySpawnSupport.releaseStaticReferences(-102);
        TextValidationSupport.clearValidationArchive(methodGuard ^ 30613);
        AccountEligibilitySupport.clearAccountEligibilityResources(methodGuard - 15583);
        SettingsCookieSupport.clearSettingsCookieTexts(true);
        VisualPropertyOverrides.b(false);
        SecondaryNodeHashTable.releaseSharedResources(true);
        IntKeyLookup.a((byte) 49);
        ByteStorage.a(-87);
        Bzip2Decoder.releaseSharedState();
        ReflectionCheckRequest.b(false);
        ByteArrayPoolSupport.clearBytePoolAndUiResources((byte) -108);
        DebugOverviewCompositor.releaseStaticReferences(-128);
        CheckboxRenderer.releaseStaticReferences(1);
        StatefulWidgetRenderer.releaseSharedResources((byte) 94);
        DialRenderer.a(methodGuard ^ -64);
        MultiHandleSliderRenderer.b((byte) -89);
        UiWidget.releaseStaticReferences(-5927);
        ButtonWidget.releaseStaticReferences((byte) -11);
        SingleChildWidget.releaseStaticReferences((byte) -3);
        ResizableDialog.j(89);
        FadingDialog.i(256);
        WidgetContainer.releaseStaticReferences(14078);
        DequeCursor.b((byte) 79);
        BoardEntityState.releaseStaticReferences(methodGuard);
        MusicDecodeStage.a();
        MatchCandidateSupport.releaseStaticReferences(-113);
        TextTemplateDefinition.f(111);
        EntityContactSupport.releaseStaticReferences((byte) 73);
        TextTemplateDefinitionLoader.a((byte) 107);
        WeightedObjectCache.releaseCacheTextResources(126);
        AttachmentPointerState.releaseAttachmentPointerText((byte) 95);
        PrefixCodeDecoder.a((byte) -30);
        VisualPropertyNode.e((byte) 77);
        ClientTimingSupport.releaseStaticReferences(false);
        SessionTextState.releaseSessionTextResources(-97);
        SocketConnector.c(16712207);
        ProxyAuthenticationRequiredException.b(-20152);
        NanoFrameTimer.releaseSharedResources(false);
        ImageProducerRasterBuffer.c((byte) -117);
        DisplayModeInfo.a(methodGuard ^ -33);
        RasterTargetRestoreSupport.releaseRasterRestoreResources(true);
        GmtTimestampSupport.clearTimestampAndPopupResources((byte) 40);
        ArchiveHandshakeState.releaseArchiveHandshakeResources(false);
        MeshPrioritySupport.releaseStaticReferences(0);
        WhirlpoolHash.b(102);
        SynthesizedSoundInstrument.releaseSynthesisBuffers();
        DelayedPcmStream.clearUsernameQueryCandidate((byte) -120);
        LabeledChildWidget.f((byte) -52);
        ValidatedTextInputWidget.releaseStaticReferences(-243);
        TextInputWidget.releaseStaticReferences((byte) -15);
        ContentTransitionDialog.releaseStaticReferences(methodGuard ^ -320);
        ProgressBarWidget.f(407213000);
        UsernameSuggestionsPanel.b(true);
        HotspotTextWidget.h(0);
        ValidationIconWidget.f(-116);
        ValidationMessageWidget.j(24033);
        CheckboxWidget.f(-75);
        TextInputValidator.releaseStaticReferences(methodGuard + 65);
        AvatarFeedbackSupport.releaseStaticReferences(-43);
        Under13TermsPanel.b(false);
        DialWidget.f(0);
        MultiHandleSliderWidget.f(0);
        GameGraphicsResources.clearGameGraphicsResources(methodGuard + 71);
        CachedTextLayout.releaseStaticReferences((byte) -87);
        DirectByteStorage.b(methodGuard ^ 47);
        GrowableIntList.a(27);
        DraggableWidget.g((byte) -113);
        DropTargetWidget.f(methodGuard + 14576);
        TextTemplateArgumentType.a(-113);
        IterableNodeHashTable.releaseSharedResources(methodGuard ^ 63);
        SecondaryNodeDeque.releaseSharedResources(methodGuard + 63);
        CacheReference.releaseCacheReferenceResources(-111);
        StrongCacheReference.releaseStrongReferenceResources(-1);
        ProxySocketConnector.e(1353);
        SoundFilter.releaseCoefficientBuffers();
        CharacterReplacementSupport.clearReplacementAndTransitionResources((byte) -23);
        NodeHashTableIterator.releaseSharedResources(0);
        SecondaryNodeDequeIterator.releaseSharedResources((byte) 101);
        ScoreSubmission.b(46695);
        ByteShortQuery.a((byte) 112);
        SpriteButtonRenderer.b(16777215);
        UnderlinedButtonRenderer.a(1);
        TextInputRenderer.a((byte) 68);
        PasswordWidgetRenderer.c(0);
        SpriteCheckboxRenderer.a(true);
        OpacityWidget.f((byte) -60);
        SocialListEntry.releaseSocialEntryResources((byte) -128);
        RankedListQuery.b(127);
        ArchiveLoadStep.a(122);
        UsernameAvailabilityQuery.a(102);
        ClientProtocolStage.a(methodGuard ^ -64);
        MessageDialogContent.a((byte) -113);
        AchievementQuery.c(59);
        AchievementSubmission.b(methodGuard ^ 25);
        LoginMethod.a((byte) -92);
        LongAndTextLoginPayload.b(8221);
        AlternateLongAndTextLoginPayload.d((byte) -109);
        TextPairLoginPayload.b(-17226);
        FullscreenFailureReason.a(-53);
        RasterTargetSnapshot.b(methodGuard ^ -6501);
        IntArrayQuery.b(1000);
        KeyedIntRecordSubmission.b(methodGuard ^ -65);
        FifoResponseToken.b(false);
        WidgetSkinState.releaseSharedResources(false);
        TextLayoutLine.releaseStaticReferences((byte) 0);
        ScorePopup.c((byte) -40);
        UsernameAvailabilityValidator.d((byte) 113);
        PasswordValidator.g(methodGuard - 51);
        EmailValidator.g(methodGuard - 22);
        EmailAvailabilityValidator.c((byte) -9);
        AgeValidator.g(-48);
        MatchingTextValidator.clearStaticReferences(methodGuard + 64);
        UiFontResources.releaseStaticReferences(false);
        TextHotspotBounds.b(true);
        ValidationState.b(-481);
        DebouncedValidationProvider.releaseStaticReferences(true);
        this.serverHost = null;
    }

    private final void loadGermsTheme(byte methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(GameGraphicsResources.gameGraphicsArchive.loadGroupByName("germs", (byte) -126))) {
                return;
            }
            UsernameAvailabilityQuery.germsForegroundSprite = ScorePopupSupport.loadSprite("germs_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "germs");
            SharedBufferPools.germsBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "germs", "germs_background");
            int guardQuotient = -24 / ((methodGuard + 13) / 61);
            GameGraphicsResources.themesLoaded[3] = true;
            return;
        }
    }

    public final void init() {
        this.initializeGameApplet(11, "geoblox", 640);
    }

    final static void setRasterTarget(int methodGuard, Sprite targetSprite) {
        try {
            SpriteCheckboxRenderer.pushRasterTarget(9);
            SoftwareRasterizer.setRasterTarget(targetSprite.pixels, targetSprite.fullWidth, targetSprite.fullHeight);
            if (methodGuard != 1) {
                Sprite guardedNullSpriteSnapshot = (Sprite) null;
                Geoblox.setRasterTarget(-34, (Sprite) null);
            }
        } catch (RuntimeException rasterTargetFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rasterTargetFailure), "Geoblox.T(" + methodGuard + ',' + (targetSprite != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearAppletStatics(int methodGuard) {
        longAndNameLoginType = null;
        reconnectMessages = null;
        if (methodGuard != 0) {
            Sprite guardedNullSpriteSnapshot = (Sprite) null;
            Geoblox.setRasterTarget(30, (Sprite) null);
        }
        loginMessage = null;
        activeMessageDialog = null;
    }

    final void updateGame(boolean methodGuard) {
        int nextScreenTransitionTickSnapshot = 0;
        boolean discardedArchiveReadiness = false;
        boolean fullscreenAvailableSnapshot = false;
        boolean archiveRequestGuardSnapshot = false;
        boolean introStillRunningSnapshot = false;
        boolean fullscreenAvailableForUiSnapshot = false;
        int uiServiceResultOrOverlayMode;
        int clientControlFlowGuard;
        clientControlFlowGuard = clientControlFlowFlag;
        DialogLayer.h(78);
        if (methodGuard) {
          return;
        }
        if ((InstrumentPatch.field_n != null) &&
            (InstrumentPatch.field_n.focusLost)) {
          InstrumentPatch.field_n.exitFullscreen(0, MenuScreen.platformTaskDispatcher);
          InstrumentPatch.field_n = null;
        }
        if (null == InstrumentPatch.field_n) {
          fullscreenAvailableSnapshot = false;
        } else {
          fullscreenAvailableSnapshot = true;
        }
        this.updateSessionBootstrapAndInput(fullscreenAvailableSnapshot, 19660);
        if (AgeValidator.field_k) {
          if (methodGuard) {
            archiveRequestGuardSnapshot = false;
          } else {
            archiveRequestGuardSnapshot = true;
          }
          this.requestGameArchives(archiveRequestGuardSnapshot);
          AgeValidator.field_k = false;
        }
        while (SingleChildWidget.readNextIncomingPacket((byte) -118, ArchiveRequest.sessionPacketLengthByOpcode)) {
          this.dispatchSessionPacket(121);
        }
        if (!BootstrapUiSupport.shouldShowBootstrapLoadingScreen(255)) {
          L6: {
            if (!DebouncedValidationProvider.gameAssetsInitialized) {
              ByteStorage.a(CachedTextLayout.wheelRotationSnapshot, (byte) -98);
              if ((this.pollArchiveLoading(false)) &&
                  (this.prepareGameAssets(25869))) {
                DebouncedValidationProvider.gameAssetsInitialized = true;
                this.initializeScreens(82);
                break L6;
              }
              NanoFrameTimer.flushSessionWrites(-1, 0);
              return;
            }
            if (!UsernameAvailabilityValidator.g(79)) {
              HighscoreNameEntry.setLoadingProgress(ByteShortQuery.waitingForExtraDataText, -2, 100.0f);
            } else {
              if ((FadingDialog.a((byte) 47)) &&
                  (!FullscreenSupport.field_a)) {
                fullscreenAvailableForUiSnapshot = !(InstrumentPatch.field_n == null);
                uiServiceResultOrOverlayMode = UsernameAvailabilityQuery.a(fullscreenAvailableForUiSnapshot, (SessionGameApplet) (this), false);
                if (uiServiceResultOrOverlayMode != 2364824) {
                  if (!((uiServiceResultOrOverlayMode != 1) &&
                      (2 != uiServiceResultOrOverlayMode))) {
                    if (null != InstrumentPatch.field_n) {
                      InstrumentPatch.field_n.exitFullscreen(0, MenuScreen.platformTaskDispatcher);
                      InstrumentPatch.field_n = null;
                    }
                    if (uiServiceResultOrOverlayMode == 2) {
                      EntityCollisionSupport.openQuitPage(NodeHashTableIterator.getActiveApplet(109), 62);
                    }
                  }
                } else {
                  DualLinkNode.evaluateGuardResidue(-8);
                }
                if (!VisualPropertyNode.field_o) {
                  break L6;
                }
                DisplayModeInfo.setConfiguredUpdateRate((byte) 121, 50);
                VisualPropertyNode.field_o = false;
                break L6;
              }
              if (!VisualPropertyNode.field_o) {
                DisplayModeInfo.setConfiguredUpdateRate((byte) 121, 150);
                VisualPropertyNode.field_o = true;
              }
              if (!GameGraphicsResources.themesLoaded[2]) {
                this.loadSweetsTheme(7);
              } else {
                if (GameGraphicsResources.themesLoaded[0]) {
                  if (GameGraphicsResources.themesLoaded[3]) {
                    if (GameGraphicsResources.themesLoaded[6]) {
                      if (!GameGraphicsResources.themesLoaded[5]) {
                        this.loadSportsTheme(75);
                      } else {
                        if (!GameGraphicsResources.themesLoaded[4]) {
                          this.loadBakingTheme(2);
                        }
                      }
                    } else {
                      this.loadSpaceTheme(false);
                    }
                  } else {
                    this.loadGermsTheme((byte) -117);
                  }
                } else {
                  this.loadJewelsTheme(false);
                }
              }
              if (GameplaySetupSupport.screenChangePending) {
                GameplaySetupSupport.screenChangePending = false;
                if (!UnderlinedButtonRenderer.c(-95)) {
                  if (0 < TextTemplateDefinition.field_n) {
                    InstrumentEnvelope.menuActionIds[1] = new int[]{1, 8, 9, 4, 3, 6};
                    TextTemplateDefinition.screens[1].setItemCount(-12831, InstrumentEnvelope.menuActionIds[1].length);
                    if (0 == UiWidget.gameplayReturnScreenId) {
                      MessageDialog.requestFullscreen((byte) -112);
                      TextTemplateDefinition.screens[0].activeTicks = 0;
                    }
                  }
                  if ((null != UiWidget.gameplaySession) &&
                      (UiWidget.gameplaySession.score > 0)) {
                    UiWidget.gameplaySession.submitScore((byte) -70);
                  }
                  ScoreSubmission.requestedScreenId = UiWidget.gameplayReturnScreenId;
                } else {
                  ScoreSubmission.requestedScreenId = ProxySocketConnector.gameplayOriginScreenId;
                }
                SettingsCookieSupport.currentScreenId = -1;
                UiWidget.gameplayReturnScreenId = -1;
                CharacterReplacementSupport.clearGameplayDuringTransition = true;
              }
              if (ScoreSubmission.requestedScreenId != SettingsCookieSupport.currentScreenId) {
                if ((6 == ScoreSubmission.requestedScreenId) &&
                    (ScorePopupSupport.newAchievementMask <= 0)) {
                  ScoreSubmission.requestedScreenId = 2;
                }
                if (-1 < SettingsCookieSupport.currentScreenId) {
                  TextTemplateDefinition.screens[SettingsCookieSupport.currentScreenId].updateTransition(16405);
                }
                if (ScoreSubmission.requestedScreenId != -1) {
                  TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].updateTransition(16405);
                  TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].tutorialPageIndex = 0;
                  if (ScoreSubmission.requestedScreenId != 3) {
                    TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].selectedItemIndex = 0;
                  } else {
                    TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].selectedItemIndex = 1;
                  }
                }
                if (TriangleMesh.screenTransitionTick == 0) {
                  ValidationIconWidget.playPcmSample(-348, GameSoundResources.gameSoundSamples[30]);
                }
                nextScreenTransitionTickSnapshot = TriangleMesh.screenTransitionTick + 1;
                TriangleMesh.screenTransitionTick = TriangleMesh.screenTransitionTick + 1;
                if (nextScreenTransitionTickSnapshot == 160) {
                  if ((UiWidget.gameplayReturnScreenId != -1) &&
                      (UnderlinedButtonRenderer.c(-109))) {
                    if (ProxySocketConnector.gameplayOriginScreenId != 0) {
                      UsernameResponseSupport.returnToLoginStage(-106);
                    } else {
                      PendingActionMarker.a((byte) 118);
                    }
                    GameplaySetupSupport.screenChangePending = true;
                  } else {
                    if (SettingsCookieSupport.currentScreenId == 2) {
                      FifoResponseToken.activeHighscoreQuery = null;
                    }
                  }
                  TriangleMesh.screenTransitionTick = 0;
                  SettingsCookieSupport.currentScreenId = ScoreSubmission.requestedScreenId;
                  CharacterReplacementSupport.clearGameplayDuringTransition = false;
                }
              } else {
                if (SettingsCookieSupport.currentScreenId == -1) {
                  if (UsernameQueryState.introAnimationRunning) {
                    introStillRunningSnapshot = !(DequeCursor.b(1));
                    UsernameQueryState.introAnimationRunning = introStillRunningSnapshot;
                    if (!introStillRunningSnapshot) {
                      SettingsCookieSupport.currentScreenId = -2;
                      ScoreSubmission.requestedScreenId = 0;
                    }
                  } else {
                    UiWidget.gameplaySession.updateSession(-1578896191);
                  }
                } else {
                  TextTemplateDefinition.screens[SettingsCookieSupport.currentScreenId].updateScreen((byte) 29);
                }
              }
            }
          }
          TrackedPcmStream.updateAchievementSubmissions((byte) -122);
          NanoFrameTimer.flushSessionWrites(-1, 0);
          if (ClientTimingSupport.isClientReadyForSessionActions(54)) {
            uiServiceResultOrOverlayMode = this.pollReconnectAndResendRequests((byte) -67);
            if (!(uiServiceResultOrOverlayMode != 2)) {
              ClientScreenExitSupport.handleSessionExitServiceResult(320, 240, IntrusiveNodeHashTable.smallFont, IntrusiveNodeHashTable.smallFont.maxAscent * 3 >> 1, -128, IntrusiveNodeHashTable.smallFont.maxAscent);
            }
          }
        } else {
          if (VisualPropertyNode.field_o) {
            DisplayModeInfo.setConfiguredUpdateRate((byte) 121, 50);
            VisualPropertyNode.field_o = false;
          }
          this.updateBootstrapUi(115);
          if (CacheReference.haveRequiredClientStages(-31456)) {
            discardedArchiveReadiness = this.pollArchiveLoading(false);
          }
        }
    }

    final void renderFrame(int methodGuard) {
        Object renderTargetCanvasSnapshot = null;
        boolean loadingCanvasStateSnapshot = false;
        boolean overlayCanvasStateSnapshot = false;
        Object renderTargetCanvas;
        int transitionSplitY;
        int clientControlFlowGuard;
        clientControlFlowGuard = clientControlFlowFlag;
        if (InstrumentPatch.field_n != null) {
          renderTargetCanvasSnapshot = InstrumentPatch.field_n;
        } else {
          renderTargetCanvasSnapshot = MessageDialog.gameCanvas;
        }
        renderTargetCanvas = renderTargetCanvasSnapshot;
        if (BootstrapUiSupport.shouldShowBootstrapLoadingScreen(255)) {
          if (InstrumentPatch.field_n != null) {
            loadingCanvasStateSnapshot = true;
          } else {
            loadingCanvasStateSnapshot = ValidationState.updateFocusSnapshot;
          }
          AccountContentDialog.a(loadingCanvasStateSnapshot, methodGuard - 25853, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        if (!DebouncedValidationProvider.gameAssetsInitialized) {
          EndingAnimationSupport.presentPreparedFrame(true, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        if (!UsernameAvailabilityValidator.g(39)) {
          HighscoreNameEntry.setLoadingProgress(ByteShortQuery.waitingForExtraDataText, -2, 100.0f);
          EndingAnimationSupport.presentPreparedFrame(true, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(methodGuard - 25598);
        SoftwareRasterizer.clearFramebuffer();
        if ((SettingsCookieSupport.currentScreenId == ScoreSubmission.requestedScreenId) &&
            (UiWidget.gameplayReturnScreenId == -1)) {
          if (SettingsCookieSupport.currentScreenId != -1) {
            TextTemplateDefinition.screens[SettingsCookieSupport.currentScreenId].renderScreen(-28750);
          } else if (!UsernameQueryState.introAnimationRunning) {
            UiWidget.gameplaySession.renderSession((byte) -49);
          } else {
            SpriteCheckboxRenderer.c(240);
          }
        } else {
          transitionSplitY = -480 + (TriangleMesh.screenTransitionTick * 6 + 35);
          if ((UiWidget.gameplayReturnScreenId == -1) &&
              (!CharacterReplacementSupport.clearGameplayDuringTransition)) {
            if (ScoreSubmission.requestedScreenId == -1) {
              UiWidget.gameplaySession.renderSession((byte) -68);
            } else if (!(SettingsCookieSupport.currentScreenId != -1)) {
              UiWidget.gameplaySession.renderSession((byte) -68);
            }
          } else {
            SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 1);
          }
          if (SettingsCookieSupport.currentScreenId == -2) {
            SpriteCheckboxRenderer.c(methodGuard ^ 25613);
          }
          SoftwareRasterizer.setClip(0, 0, 640, transitionSplitY);
          if (ScoreSubmission.requestedScreenId != -1) {
            TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, transitionSplitY, 640, 480);
          if (SettingsCookieSupport.currentScreenId > -1) {
            TextTemplateDefinition.screens[SettingsCookieSupport.currentScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, 0, 640, 480);
          CharacterReplacementSupport.transitionCurtain.draw(0, 6 * TriangleMesh.screenTransitionTick - 480);
        }
        if (DelayedPcmStream.beginSessionRetryAndCheckStageEleven(true)) {
          if (null == InstrumentPatch.field_n) {
            overlayCanvasStateSnapshot = ValidationState.updateFocusSnapshot;
          } else {
            overlayCanvasStateSnapshot = true;
          }
          UsernameResponseSupport.renderDimmedAccountUi(overlayCanvasStateSnapshot, false);
        }
        MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 110, (java.awt.Canvas) (renderTargetCanvas), 0);
        if (methodGuard != 25853) {
          canvasCreationTimeMillis = -11L;
        }
    }

    private final void loadJewelsTheme(boolean methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(GameGraphicsResources.gameGraphicsArchive.loadGroupByName("jewels", (byte) -128))) {
                return;
            }
            if (methodGuard) {
                return;
            }
            MidiPcmStream.jewelsForegroundSprite = ScorePopupSupport.loadSprite("jewls_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "jewels");
            CachedArchiveSource.jewelsBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "jewels", "jewls_background");
            GameGraphicsResources.themesLoaded[0] = true;
            return;
        }
    }

    private final void loadBakingTheme(int methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(methodGuard - 2)) {
            if (!(GameGraphicsResources.gameGraphicsArchive.loadGroupByName("baking", (byte) -125))) {
                return;
            }
            DisplayNamePanel.bakingForegroundSprite = ScorePopupSupport.loadSprite("baking_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "baking");
            if (methodGuard != 2) {
                return;
            }
            FifoResponseToken.bakingBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, methodGuard - 1, "baking", "baking_background");
            GameGraphicsResources.themesLoaded[4] = true;
            return;
        }
    }

    private final void loadSpaceTheme(boolean methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!GameGraphicsResources.gameGraphicsArchive.loadGroupByName("space", (byte) -127)) {
                return;
            }
            GameSoundResources.spaceForegroundSprite = ScorePopupSupport.loadSprite("space_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "space");
            LoginPayload.spaceBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "space", "space_background");
            if (methodGuard) {
                return;
            }
            GameGraphicsResources.themesLoaded[6] = true;
            return;
        }
    }

    private final void requestGameArchives(boolean graphicsArchiveGuard) {
        if (TextValidationSupport.field_b != null) {
            SpriteState.a(true, TextValidationSupport.field_b);
            TextValidationSupport.field_b = null;
            EntityContactSupport.resetFrameTimingHistory(-105);
        }
        GameGraphicsResources.gameGraphicsArchive = TrackedPcmStream.a(1, true, graphicsArchiveGuard, true, (byte) -111);
        OpacityWidget.field_F = SocketArchiveNetworkClient.createResourceArchive(2, (byte) -62);
        TextWidgetSupport.field_c = SocketArchiveNetworkClient.createResourceArchive(3, (byte) -62);
        ProxySocketConnector.field_m = SocketArchiveNetworkClient.createResourceArchive(4, (byte) -62);
        GzipInflater.field_a = SocketArchiveNetworkClient.createResourceArchive(5, (byte) -62);
        ArchiveLoadStep.fontMetricsArchive = SocketArchiveNetworkClient.createResourceArchive(6, (byte) -62);
        FullscreenEntrySupport.guardArchiveInitializationPlaceholder(SessionTextHistorySupport.basicUiGraphicsArchive, RankedListQuery.field_i, -84);
    }

    final static void prepareLogoMeshRotation(byte methodGuard, int meshIndex) {
        int rotationAngle8192;
        int animationTickOrRemainingTicks;
        int xRotationSign;
        int yRotationSign;
        int controlFlagSnapshot;
        controlFlagSnapshot = clientControlFlowFlag;
        rotationAngle8192 = 0;
        animationTickOrRemainingTicks = DequeCursor.logoAnimationTick;
        if (animationTickOrRemainingTicks >= 5) {
          if (animationTickOrRemainingTicks < 105) {
            rotationAngle8192 = (-40960 + 16384 * animationTickOrRemainingTicks) / 220;
          } else {
            if (120 > animationTickOrRemainingTicks) {
              animationTickOrRemainingTicks = 120 - animationTickOrRemainingTicks;
              rotationAngle8192 = -(animationTickOrRemainingTicks * (animationTickOrRemainingTicks * 8192) / 3300) + 8192;
            }
          }
        } else {
          rotationAngle8192 = 8192 * animationTickOrRemainingTicks * animationTickOrRemainingTicks / 1100;
        }
        xRotationSign = 1;
        yRotationSign = 0;
        if (meshIndex == 1) {
          yRotationSign = 1;
        }
        if (3 == meshIndex) {
          xRotationSign = -1;
        }
        if (4 == meshIndex) {
          xRotationSign = 1;
          yRotationSign = 1;
        }
        if (meshIndex == 5) {
          yRotationSign = 1;
          xRotationSign = -1;
        }
        if (meshIndex == 6) {
          yRotationSign = -1;
          xRotationSign = 1;
        }
        if (!((7 != meshIndex) &&
              (8 != meshIndex))) {
          yRotationSign = -1;
          xRotationSign = -1;
        }
        if (meshIndex == 11) {
          xRotationSign = -1;
        }
        if (meshIndex == 12) {
          yRotationSign = -1;
          xRotationSign = -1;
        }
        if (meshIndex == 13) {
          yRotationSign = -1;
          xRotationSign = 1;
        }
        if (meshIndex == 14) {
          xRotationSign = -1;
          yRotationSign = 1;
        }
        if (meshIndex == 15) {
          xRotationSign = 1;
          yRotationSign = 1;
        }
        TextLayoutLine.meshModelTransform = ArchiveIndex.buildLogoRotationTransform(rotationAngle8192 * xRotationSign, methodGuard, yRotationSign * rotationAngle8192);
    }

    private final void initializeScreens(int methodGuard) {
        int screenIndex = 0;
        int clientControlFlowGuard = clientControlFlowFlag;
        if (!(TextTemplateDefinition.field_n > 0)) {
            InstrumentEnvelope.menuActionIds[1] = new int[]{1, 8, 9, 3, 6};
        }
        for (screenIndex = 0; screenIndex < 9; screenIndex++) {
            TextTemplateDefinition.screens[screenIndex] = new GameScreen((Geoblox) (this), screenIndex);
        }
        ScoreSubmission.requestedScreenId = -1;
        SettingsCookieSupport.currentScreenId = -1;
        HotspotTextWidget.f(0);
        PacketByteCipher.a((byte) -74);
        DequeCursor.field_g = 5997;
        ClientClockSupport.field_a = 4703;
        UsernameResponseSupport.field_d = 275;
        SpriteButtonRenderer.field_r = 1385;
        SessionInstanceState.secondaryAchievementTrackingCounter = 935;
        AttachedEntityRenderer.achievementTrackingBits = 0;
        UiWidget.achievementTrackingAccumulator = 8801;
        AwtRasterBuffer.primaryAchievementTrackingCounter = 3382;
        if (methodGuard <= 68) {
            this.loadJewelsTheme(true);
        }
        ClientOptionSupport.configureMenuPointerRepeat(150, 20);
    }

    private final void loadSweetsTheme(int methodGuard) {
        if (GameGraphicsResources.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(GameGraphicsResources.gameGraphicsArchive.loadGroupByName("sweets", (byte) -128))) {
                return;
            }
            SessionInstanceState.sweetsForegroundSprite = ScorePopupSupport.loadSprite("sweets_foreground", GameGraphicsResources.gameGraphicsArchive, (byte) -78, "sweets");
            if (methodGuard != 7) {
                return;
            }
            ValidationMessageWidget.sweetsBackgroundSprite = SocketConnector.loadIndexedSprite(GameGraphicsResources.gameGraphicsArchive, 1, "sweets", "sweets_background");
            GameGraphicsResources.themesLoaded[2] = true;
            return;
        }
    }

    final void initializeGame(int methodGuard) {
        if (methodGuard <= 109) {
            return;
        }
        this.initializeSessionAppletServices((byte) -70, 9, 8, 10, 0, false, 7, 1);
        MidiPcmStream musicPlaybackStream = new MidiPcmStream();
        musicPlaybackStream.setChannelDefaultInstrument(-1636, 9, 128);
        DiskArchiveCache.a((java.awt.Component) ((Object) MessageDialog.gameCanvas), MenuScreen.platformTaskDispatcher, false, musicPlaybackStream, true, 22050);
        this.enableOptionalSessionPacketFamilies(false, false, true, true, -95);
    }

    static {
        loginMessage = "Please login";
        reconnectMessages = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        canvasCreationTimeMillis = 0L;
        longAndNameLoginType = new LoginPayloadKind(2);
    }
}
