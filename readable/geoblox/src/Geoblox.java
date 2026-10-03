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
        if (ll.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(ll.gameGraphicsArchive.loadGroupByName("sports", (byte) -126))) {
                return;
            }
            if (methodGuard <= 37) {
                this.initializeScreens(92);
            }
            LabeledChildWidget.sportsForegroundSprite = ug.loadSprite("sports_foreground", ll.gameGraphicsArchive, (byte) -78, "sports");
            AlternateLongAndTextLoginPayload.sportsBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sports", "sports_background");
            ll.themesLoaded[5] = true;
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
        MidiNote.a((byte) 124);
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
        if (null != OpacityWidget.field_F && null != GzipInflater.field_a && ah.field_c != null && null != ProxySocketConnector.field_m) {
            HighscoreNameEntry.a(FifoResponseToken.unpackingMusicText, -2, 60.0f);
            this.renderFrame(25853);
            SocketConnector.prepareInitialGameAudio(OpacityWidget.field_F, (byte) 80, ah.field_c, GzipInflater.field_a, ProxySocketConnector.field_m);
            ah.field_c = null;
            OpacityWidget.field_F = null;
            ProxySocketConnector.field_m = null;
            GzipInflater.field_a = null;
            ih.b(127);
            return false;
        }
        if (null != ll.gameGraphicsArchive && null != ArchiveLoadStep.fontMetricsArchive && ki.basicUiGraphicsArchive != null) {
            HighscoreNameEntry.a(oh.unpackingGraphicsText, methodGuard - 25871, 80.0f);
            this.renderFrame(25853);
            FadingDialog.uiPaletteFont = w.loadPaletteFont("", ll.gameGraphicsArchive, ArchiveLoadStep.fontMetricsArchive, true, "font");
            SessionGameApplet.field_p = FadingDialog.uiPaletteFont.findNearestBasePaletteIndex(1);
            FadingDialog.uiPaletteFont.colorPalettes[0][SessionGameApplet.field_p] = 16689938;
            FadingDialog.uiPaletteFont.colorPalettes[0][FadingDialog.uiPaletteFont.findNearestBasePaletteIndex(16777215)] = 1;
            uiPaletteSize = FadingDialog.uiPaletteFont.colorPalettes[0].length;
            alternateUiPalette = new int[uiPaletteSize];
            FadingDialog.uiPaletteFont.colorPalettes[1] = alternateUiPalette;
            sf.a(FadingDialog.uiPaletteFont.colorPalettes[0], 0, FadingDialog.uiPaletteFont.colorPalettes[1], 0, uiPaletteSize);
            FadingDialog.uiPaletteFont.colorPalettes[1][SessionGameApplet.field_p] = 16777215;
            geometrySourceFrames = OpacityWidget.loadSpriteFrames("geoms", "", ll.gameGraphicsArchive, 0);
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
                    ke.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex] = new Sprite(geometryCanvasWidthThenFrameIndex, geometryCanvasHeight);
                    ke.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex].setAsRasterTarget();
                    geometrySourceFrames[geometryFrameThenVariantIndex].drawGrayModulated(0, 0, SocketConnector.themeSpriteColors[themeIndex][paletteVariantThenKeyboardIndex]);
                }
            }
            geometryAliasThenAmorphousFrames = OpacityWidget.loadSpriteFrames("amorphic", "", ll.gameGraphicsArchive, methodGuard ^ 25869);
            for (themeIndex = 0; themeIndex < 7; themeIndex++) {
                for (geometryFrameThenVariantIndex = 0; geometryFrameThenVariantIndex < 7; geometryFrameThenVariantIndex++) {
                    for (categoryThenAnimationFrameIndex = 0; categoryThenAnimationFrameIndex < geometryAliasThenAmorphousFrames.length; categoryThenAnimationFrameIndex++) {
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex] = new Sprite(4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullWidth, 4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullHeight);
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].setAsRasterTarget();
                        geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].drawGrayModulated(2, 2, SocketConnector.themeSpriteColors[themeIndex][geometryFrameThenVariantIndex]);
                        NodeHashTableIterator.a(0, 0, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullWidth, methodGuard ^ -3266, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullHeight);
                    }
                }
            }
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            IntrusiveNodeHashTable.smallFont = IterableNodeHashTable.loadBitmapFont(ArchiveLoadStep.fontMetricsArchive, 1, ll.gameGraphicsArchive, "small_font", "");
            fc.blackOrbFrames = OpacityWidget.loadSpriteFrames("black", "", ll.gameGraphicsArchive, 0);
            hg.blackOrbImplosionFrames = OpacityWidget.loadSpriteFrames("black_implode", "", ll.gameGraphicsArchive, 0);
            DialRenderer.silverStarFrames = OpacityWidget.loadSpriteFrames("silver", "", ll.gameGraphicsArchive, 0);
            ej.amorphousCrackFrames = OpacityWidget.loadSpriteFrames("amorph_crack", "", ll.gameGraphicsArchive, 0);
            i.avatarMaskRaster = ug.loadSprite("player_back", ll.gameGraphicsArchive, (byte) -78, "");
            avatarEyeSourceFrames = OpacityWidget.loadSpriteFrames("player_eyes", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, 125)) {
                avatarEyeSourceFrames = OpacityWidget.loadSpriteFrames("player_eyes", "halloween", ll.gameGraphicsArchive, 0);
            }
            fc.avatarEyeFrames = new Sprite[avatarEyeSourceFrames.length];
            for (categoryThenAnimationFrameIndex = 0; avatarEyeSourceFrames.length > categoryThenAnimationFrameIndex; categoryThenAnimationFrameIndex++) {
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex] = new Sprite(4 + avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullWidth, avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullHeight + 4);
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex].setAsRasterTarget();
                avatarEyeSourceFrames[categoryThenAnimationFrameIndex].drawUnmasked(2, 2);
                NodeHashTableIterator.a(0, 0, fc.avatarEyeFrames[categoryThenAnimationFrameIndex].fullWidth, -27085, fc.avatarEyeFrames[categoryThenAnimationFrameIndex].height);
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex].trimTransparentBorders();
            }
            avatarMouthSourceFrames = OpacityWidget.loadSpriteFrames("player_mouth", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, methodGuard - 25774)) {
                avatarMouthSourceFrames = OpacityWidget.loadSpriteFrames("player_mouth", "halloween", ll.gameGraphicsArchive, 0);
            }
            UsernameSuggestionsPanel.avatarMouthFrames = new Sprite[avatarMouthSourceFrames.length];
            for (geometryCanvasWidthThenFrameIndex = 0; avatarMouthSourceFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex] = new Sprite(avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullWidth + 4, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullHeight + 4);
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].setAsRasterTarget();
                avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].drawUnmasked(2, 2);
                NodeHashTableIterator.a(2 + avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].trimY, 0, UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].fullWidth, -27085, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].height);
                UsernameSuggestionsPanel.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].trimTransparentBorders();
            }
            SingleChildWidget.mainRasterBuffer.setAsRasterTarget(255);
            GzipInflater.sunBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sun", "sky_background");
            PacketByteCipher.sunForegroundSprite = ug.loadSprite("sky_foreground", ll.gameGraphicsArchive, (byte) -78, "sun");
            ll.themesLoaded[1] = true;
            WidgetContainer.menuBackgroundSprite = ug.loadSprite("menu_background", ll.gameGraphicsArchive, (byte) -78, "");
            CachedTextLayout.menuForegroundSprite = ug.loadSprite("menu_foreground", ll.gameGraphicsArchive, (byte) -78, "");
            qj.transitionCurtain = ug.loadSprite("transition", ll.gameGraphicsArchive, (byte) -78, "");
            SecondaryNodeHashTable.silverStarShockFrames = OpacityWidget.loadSpriteFrames("silver_shock", "", ll.gameGraphicsArchive, 0);
            VisualPropertyOverrides.sparkleFrames = OpacityWidget.loadSpriteFrames("sparkle", "", ll.gameGraphicsArchive, 0);
            for (geometryCanvasWidthThenFrameIndex = 0; VisualPropertyOverrides.sparkleFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                VisualPropertyOverrides.sparkleFrames[geometryCanvasWidthThenFrameIndex].addOutline(1);
            }
            vj.bangFrames = OpacityWidget.loadSpriteFrames("bang", "", ll.gameGraphicsArchive, 0);
            ReflectionCheckRequest.pointsPanelGlowFrames = OpacityWidget.loadSpriteFrames("bonus_glow", "", ll.gameGraphicsArchive, 0);
            PacketBuffer.resultBubbleSprite = ug.loadSprite("bubble", ll.gameGraphicsArchive, (byte) -78, "");
            NodeHashTableIterator.popSprite = ug.loadSprite("pop", ll.gameGraphicsArchive, (byte) -78, "");
            ArchiveLoadSequence.mouseBoxFrames = OpacityWidget.loadSpriteFrames("box_mouse", "", ll.gameGraphicsArchive, 0);
            HotspotTextWidget.avatarCryBeginFrames = OpacityWidget.loadSpriteFrames("cry_begin", "", ll.gameGraphicsArchive, 0);
            ok.avatarCryMiddleFrames = OpacityWidget.loadSpriteFrames("cry_middle", "", ll.gameGraphicsArchive, 0);
            ld.avatarCryEndFrames = OpacityWidget.loadSpriteFrames("cry_end", "", ll.gameGraphicsArchive, 0);
            if (!(!da.a(0, 110))) {
                HotspotTextWidget.avatarCryBeginFrames = OpacityWidget.loadSpriteFrames("cry_begin", "halloween", ll.gameGraphicsArchive, 0);
                ok.avatarCryMiddleFrames = OpacityWidget.loadSpriteFrames("cry_middle", "halloween", ll.gameGraphicsArchive, 0);
                ld.avatarCryEndFrames = OpacityWidget.loadSpriteFrames("cry_end", "halloween", ll.gameGraphicsArchive, 0);
            }
            keyboardIconSprites = new IndexedSprite[8];
            keyboardIconSprites[0] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_left");
            keyboardIconSprites[1] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_right");
            keyboardIconSprites[2] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_enter");
            keyboardIconSprites[3] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_space");
            keyboardIconSprites[4] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, EmailAvailabilityQuery.xorInt(methodGuard, 25868), "", "keyboard_esc");
            keyboardIconSprites[5] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_backspace");
            keyboardIconSprites[6] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_down");
            keyboardIconSprites[7] = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_i");
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
            AudioService.screenTitleSprites[0] = ug.loadSprite("main_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[2] = ug.loadSprite("bestscoreseach_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[3] = ug.loadSprite("myscores_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[1] = ug.loadSprite("allscores_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[6] = ug.loadSprite("gameover_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[4] = ug.loadSprite("achievements_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[5] = ug.loadSprite("instructions_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[7] = ug.loadSprite("achievements_tg_title", ll.gameGraphicsArchive, (byte) -78, "");
            AudioService.screenTitleSprites[8] = ug.loadSprite("login_title", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites = new Sprite[9];
            ll.frameNineSliceSprites[0] = ug.loadSprite("frame_topleft", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[1] = ug.loadSprite("frame_top", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[2] = ug.loadSprite("frame_topright", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[3] = ug.loadSprite("frame_left", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[4] = ug.loadSprite("frame_centre", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[5] = ug.loadSprite("frame_right", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[6] = ug.loadSprite("frame_bottomleft", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[7] = ug.loadSprite("frame_bottom", ll.gameGraphicsArchive, (byte) -78, "");
            ll.frameNineSliceSprites[8] = ug.loadSprite("frame_bottomright", ll.gameGraphicsArchive, (byte) -78, "");
            RankedListQuery.widgetSprite = ug.loadSprite("widget", ll.gameGraphicsArchive, (byte) -78, "");
            NetworkArchiveRequest.barSprite = ug.loadSprite("bar", ll.gameGraphicsArchive, (byte) -78, "");
            lj.smallBoxSprite = ug.loadSprite("box_sml", ll.gameGraphicsArchive, (byte) -78, "");
            PasswordValidator.countBoxSprite = ug.loadSprite("box_count", ll.gameGraphicsArchive, (byte) -78, "");
            UsernameSuggestionsPanel.largeBoxSprite = ug.loadSprite("box_lgr", ll.gameGraphicsArchive, (byte) -78, "");
            RasterTargetSnapshot.introFaceFrames = OpacityWidget.loadSpriteFrames("intro_faces", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, -105)) {
                RasterTargetSnapshot.introFaceFrames = OpacityWidget.loadSpriteFrames("intro_faces", "halloween", ll.gameGraphicsArchive, 0);
            }
            AccountCreationForm.introGeometryFrames = OpacityWidget.loadSpriteFrames("intro_geoms", "", ll.gameGraphicsArchive, 0);
            UsernameAvailabilityQuery.achievementSprites = OpacityWidget.loadSpriteFrames("achievements", "", ll.gameGraphicsArchive, 0);
            IntKeyLookup.unachievedSprite = ug.loadSprite("unachieved", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            ug.loadSprite("locked", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            UsernameAvailabilityValidator.orbCoinSprite = ug.loadSprite("orbcoin", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            GameScreen.selectedThemeId = 1;
            ProxySocketConnector.selectThemeRenderAssets((byte) 79);
            ih.b(-62);
            ArchiveLoadStep.fontMetricsArchive = null;
            ki.basicUiGraphicsArchive = null;
            return false;
        }
        if (methodGuard != 25869) {
            reconnectMessages = (String[]) null;
        }
        HighscoreNameEntry.a(FullscreenFailureReason.field_a, -2, 100.0f);
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
        if (SecondaryNodeDequeIterator.field_e) {
          return true;
        }
        Under13TermsPanel.g(9);
        if ((OpacityWidget.field_F.ensureIndexLoaded(0)) &&
            (OpacityWidget.field_F.loadAllGroups(true))) {
          if (ah.field_c.ensureIndexLoaded(0)) {
            soundArchiveSnapshot = ah.field_c;
            soundLoadGroupsGuard = (archivePollGuard) ? false : true;
            if (((ResourceArchive) (Object) soundArchiveSnapshot).loadAllGroups(soundLoadGroupsGuard)) {
              if ((GzipInflater.field_a.ensureIndexLoaded(0)) &&
                  (GzipInflater.field_a.loadAllGroups(true))) {
                if ((ProxySocketConnector.field_m.ensureIndexLoaded(0)) &&
                    (ProxySocketConnector.field_m.loadAllGroups(true))) {
                  if ((ArchiveLoadStep.fontMetricsArchive.ensureIndexLoaded(0)) &&
                      (ArchiveLoadStep.fontMetricsArchive.loadAllGroups(true))) {
                    if ((ll.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                        (ll.gameGraphicsArchive.loadGroupByName("", (byte) -127))) {
                      if ((ll.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                          (ll.gameGraphicsArchive.loadGroupByName("sun", (byte) -127))) {
                        if (da.a(0, -112)) {
                          if (!((ll.gameGraphicsArchive.ensureIndexLoaded(0)) &&
                              (ll.gameGraphicsArchive.loadGroupByName("halloween", (byte) -127)))) {
                            HighscoreNameEntry.a(gf.formatArchiveGroupProgress(Under13TermsPanel.field_F, ll.gameGraphicsArchive, "halloween", FullscreenFailureReason.field_c, true), -2, 45.0f);
                            return false;
                          }
                        }
                        if ((ki.basicUiGraphicsArchive.ensureIndexLoaded(0)) &&
                            (ki.basicUiGraphicsArchive.loadGroupByName("basic", (byte) -124))) {
                          if (archivePollGuard) {
                            return true;
                          }
                          SecondaryDeque.c(480);
                          HighscoreNameEntry.a(FullscreenFailureReason.field_a, -2, 50.0f);
                          this.renderFrame(25853);
                          SecondaryNodeDequeIterator.field_e = true;
                          return true;
                        }
                        graphicsWaitingTextSnapshot = TextWidgetRenderer.waitingForGraphicsText;
                        graphicsArchiveSnapshot = ki.basicUiGraphicsArchive;
                        graphicsGroupNameSnapshot = "basic";
                        graphicsLoadingTextSnapshot = AccountWelcomePanel.loadingGraphicsText;
                        graphicsProgressGuard = (archivePollGuard) ? false : true;
                        HighscoreNameEntry.a(gf.formatArchiveGroupProgress(graphicsWaitingTextSnapshot, graphicsArchiveSnapshot, graphicsGroupNameSnapshot, graphicsLoadingTextSnapshot, graphicsProgressGuard), -2, 50.0f);
                        return false;
                      }
                      HighscoreNameEntry.a(gf.formatArchiveGroupProgress(TextWidgetRenderer.waitingForGraphicsText, ll.gameGraphicsArchive, "sun", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                      return false;
                    }
                    HighscoreNameEntry.a(gf.formatArchiveGroupProgress(TextWidgetRenderer.waitingForGraphicsText, ll.gameGraphicsArchive, "", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                    return false;
                  }
                  fontWaitingTextSnapshot = ik.waitingForFontsText;
                  fontArchiveSnapshot = ArchiveLoadStep.fontMetricsArchive;
                  fontGroupNameSnapshot = "";
                  fontLoadingTextSnapshot = nb.loadingFontsText;
                  fontProgressGuard = (archivePollGuard) ? false : true;
                  HighscoreNameEntry.a(gf.formatArchiveGroupProgress(fontWaitingTextSnapshot, fontArchiveSnapshot, fontGroupNameSnapshot, fontLoadingTextSnapshot, fontProgressGuard), -2, 35.0f);
                  return false;
                }
                HighscoreNameEntry.a(ClientSessionSnapshot.a(ud.loadingSoundEffectsText, LimitedRandomAccessFile.waitingForSoundEffectsText, 0, archivePollGuard, ProxySocketConnector.field_m), -2, 25.0f);
                return false;
              }
              HighscoreNameEntry.a(gf.formatArchiveGroupProgress(ArchiveNetworkClient.waitingForMusicText, GzipInflater.field_a, "", FadingDialog.loadingMusicText, true), -2, 15.0f);
              return false;
            }
          }
          HighscoreNameEntry.a(gf.formatArchiveGroupProgress(LimitedRandomAccessFile.waitingForSoundEffectsText, ah.field_c, "", ud.loadingSoundEffectsText, true), -2, 10.0f);
          return false;
        }
        HighscoreNameEntry.a(gf.formatArchiveGroupProgress(LimitedRandomAccessFile.waitingForSoundEffectsText, OpacityWidget.field_F, "", ud.loadingSoundEffectsText, true), -2, 5.0f);
        return false;
    }

    final void releaseGameResources(byte methodGuard) {
        Geoblox.clearAppletStatics(0);
        GameApplet.c((byte) 122);
        MidiPcmStream.b(false);
        ug.a(9144);
        sg.a(-13575);
        hg.a(-17525);
        ic.a(16424);
        ok.a(true);
        SessionGameApplet.g(30344);
        AsyncResourceDownloader.c((byte) 108);
        KeyboardInputListener.a(31997);
        PointerInputListener.a(-29313);
        MouseWheelInput.a(-42);
        SoftwareRasterizer.releaseRasterStorage();
        ResourceArchive.b(30261);
        b.a(17062);
        kb.c(105);
        ByteArrayBuffer.clearWhirlpoolTables(0);
        oa.b(8192);
        ab.a((byte) -60);
        gf.a(true);
        gg.a(45);
        jk.a(methodGuard ^ 10848);
        ik.a(48);
        ClientSessionSnapshot.b(methodGuard + 59);
        pg.b(22059);
        lj.a(-1);
        cl.a(-9474);
        i.a(false);
        FrameTimer.b(methodGuard ^ 78);
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
        IntrusiveDeque.f(51);
        IntrusiveNode.b((byte) -128);
        IntrusiveNodeHashTable.a(methodGuard - 63);
        MidiTrackReader.clearStatusDataByteCounts();
        MidiNoteMixer.c(-1);
        TrackedPcmStream.a((byte) 54);
        AudioOutput.h();
        tj.a(methodGuard + 154);
        ud.a(0);
        da.a(50);
        ArchiveIndex.a(114);
        GzipInflater.c(-127);
        ArchiveSource.a(true);
        eh.a(-6910);
        ld.a(true);
        fa.a(30970);
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
        ej.a(-89);
        mj.a(methodGuard + 168);
        PcmResampler.a(true);
        w.a((byte) 102);
        bl.a(methodGuard ^ 9769);
        BitmapFont.releaseTextScratchStorage();
        DualLinkNode.c((byte) -110);
        SpriteState.f(methodGuard ^ -5558);
        PendingActionMarker.c((byte) 45);
        ke.a((byte) -80);
        af.a((byte) -103);
        te.a(-8297);
        qe.a(-8616);
        LoginPayloadKind.a(85);
        LoginPayload.a(methodGuard + 64);
        PacketBuffer.j(methodGuard ^ -64);
        ki.a((byte) -64);
        MenuScreen.releaseStaticReferences((byte) 26);
        oh.a((byte) -88);
        SecondaryDeque.b(-10943);
        GameplayEntity.e((byte) 104);
        kc.releaseStaticReferences(126);
        mf.a(false);
        ah.a(39);
        fl.a(33);
        kd.a((byte) 122);
        ri.a(5366);
        LimitedRandomAccessFile.b((byte) 74);
        DelegatingCanvas.a((byte) 81);
        ec.a(true);
        InstrumentNoteMask.b(false);
        InstrumentPatch.b(true);
        InstrumentEnvelope.a(17348);
        AudioService.a(104);
        PacketByteCipher.b((byte) -125);
        SocketArchiveNetworkClient.i(-84);
        NetworkArchiveRequest.e((byte) 118);
        CachedArchiveSource.b(true);
        ArchiveRequest.f(31735);
        dl.a(true);
        FullscreenErrorDialog.i((byte) -80);
        bk.a(true);
        TextWidgetRenderer.a(true);
        TriangleRasterState.releaseTriangleTables();
        MusicDecoder.a();
        dc.b(126);
        TriangleMesh.b((byte) 115);
        lb.a(31);
        rb.a((byte) -112);
        fc.a((byte) -126);
        nb.a(-102);
        ak.a(methodGuard ^ 30613);
        kf.b(methodGuard - 15583);
        tc.a(true);
        VisualPropertyOverrides.b(false);
        SecondaryNodeHashTable.a(true);
        IntKeyLookup.a((byte) 49);
        ByteStorage.a(-87);
        Bzip2Decoder.releaseSharedState();
        ReflectionCheckRequest.b(false);
        oi.a((byte) -108);
        ek.a(-128);
        CheckboxRenderer.a(1);
        StatefulWidgetRenderer.a((byte) 94);
        DialRenderer.a(methodGuard ^ -64);
        MultiHandleSliderRenderer.b((byte) -89);
        UiWidget.b(-5927);
        ButtonWidget.f((byte) -11);
        SingleChildWidget.a((byte) -3);
        ResizableDialog.j(89);
        FadingDialog.i(256);
        WidgetContainer.e(14078);
        DequeCursor.b((byte) 79);
        a.a(methodGuard);
        MusicDecodeStage.a();
        ul.a(-113);
        TextTemplateDefinition.f(111);
        ih.a((byte) 73);
        TextTemplateDefinitionLoader.a((byte) 107);
        WeightedObjectCache.a(126);
        wb.a((byte) 95);
        PrefixCodeDecoder.a((byte) -30);
        VisualPropertyNode.e((byte) 77);
        sb.b(false);
        vj.a(-97);
        SocketConnector.c(16712207);
        ProxyAuthenticationRequiredException.b(-20152);
        NanoFrameTimer.a(false);
        ImageProducerRasterBuffer.c((byte) -117);
        DisplayModeInfo.a(methodGuard ^ -33);
        id.b(true);
        md.a((byte) 40);
        li.a(false);
        va.a(0);
        WhirlpoolHash.b(102);
        SynthesizedSoundInstrument.releaseSynthesisBuffers();
        DelayedPcmStream.c((byte) -120);
        LabeledChildWidget.f((byte) -52);
        ValidatedTextInputWidget.k(-243);
        TextInputWidget.l((byte) -15);
        ContentTransitionDialog.releaseStaticReferences(methodGuard ^ -320);
        ProgressBarWidget.f(407213000);
        UsernameSuggestionsPanel.b(true);
        HotspotTextWidget.h(0);
        ValidationIconWidget.f(-116);
        ValidationMessageWidget.j(24033);
        CheckboxWidget.f(-75);
        TextInputValidator.f(methodGuard + 65);
        jc.a(-43);
        Under13TermsPanel.b(false);
        DialWidget.f(0);
        MultiHandleSliderWidget.f(0);
        ll.a(methodGuard + 71);
        CachedTextLayout.b((byte) -87);
        DirectByteStorage.b(methodGuard ^ 47);
        GrowableIntList.a(27);
        DraggableWidget.g((byte) -113);
        DropTargetWidget.f(methodGuard + 14576);
        TextTemplateArgumentType.a(-113);
        IterableNodeHashTable.a(methodGuard ^ 63);
        SecondaryNodeDeque.a(methodGuard + 63);
        CacheReference.e(-111);
        StrongCacheReference.h(-1);
        ProxySocketConnector.e(1353);
        SoundFilter.a();
        qj.a((byte) -23);
        NodeHashTableIterator.b(0);
        SecondaryNodeDequeIterator.a((byte) 101);
        ScoreSubmission.b(46695);
        ByteShortQuery.a((byte) 112);
        SpriteButtonRenderer.b(16777215);
        UnderlinedButtonRenderer.a(1);
        TextInputRenderer.a((byte) 68);
        PasswordWidgetRenderer.c(0);
        SpriteCheckboxRenderer.a(true);
        OpacityWidget.f((byte) -60);
        SocialListEntry.f((byte) -128);
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
        WidgetSkinState.a(false);
        TextLayoutLine.a((byte) 0);
        ScorePopup.c((byte) -40);
        UsernameAvailabilityValidator.d((byte) 113);
        PasswordValidator.g(methodGuard - 51);
        EmailValidator.g(methodGuard - 22);
        EmailAvailabilityValidator.c((byte) -9);
        AgeValidator.g(-48);
        MatchingTextValidator.clearStaticReferences(methodGuard + 64);
        hh.a(false);
        TextHotspotBounds.b(true);
        ValidationState.b(-481);
        DebouncedValidationProvider.a(true);
        this.field_n = null;
    }

    private final void loadGermsTheme(byte methodGuard) {
        if (ll.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(ll.gameGraphicsArchive.loadGroupByName("germs", (byte) -126))) {
                return;
            }
            UsernameAvailabilityQuery.germsForegroundSprite = ug.loadSprite("germs_foreground", ll.gameGraphicsArchive, (byte) -78, "germs");
            sg.germsBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "germs", "germs_background");
            int guardQuotient = -24 / ((methodGuard + 13) / 61);
            ll.themesLoaded[3] = true;
            return;
        }
    }

    public final void init() {
        this.a(11, "geoblox", 640);
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
        this.b(fullscreenAvailableSnapshot, 19660);
        if (AgeValidator.field_k) {
          if (methodGuard) {
            archiveRequestGuardSnapshot = false;
          } else {
            archiveRequestGuardSnapshot = true;
          }
          this.requestGameArchives(archiveRequestGuardSnapshot);
          AgeValidator.field_k = false;
        }
        while (SingleChildWidget.a((byte) -118, ArchiveRequest.field_m)) {
          this.l(121);
        }
        if (!bl.b(255)) {
          L6: {
            if (!DebouncedValidationProvider.gameAssetsInitialized) {
              ByteStorage.a(CachedTextLayout.wheelRotationSnapshot, (byte) -98);
              if ((this.pollArchiveLoading(false)) &&
                  (this.prepareGameAssets(25869))) {
                DebouncedValidationProvider.gameAssetsInitialized = true;
                this.initializeScreens(82);
                break L6;
              }
              NanoFrameTimer.a(-1, 0);
              return;
            }
            if (!UsernameAvailabilityValidator.g(79)) {
              HighscoreNameEntry.a(ByteShortQuery.waitingForExtraDataText, -2, 100.0f);
            } else {
              if ((FadingDialog.a((byte) 47)) &&
                  (!jk.field_a)) {
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
                      gf.a(NodeHashTableIterator.c(109), 62);
                    }
                  }
                } else {
                  DualLinkNode.c(-8);
                }
                if (!VisualPropertyNode.field_o) {
                  break L6;
                }
                DisplayModeInfo.a((byte) 121, 50);
                VisualPropertyNode.field_o = false;
                break L6;
              }
              if (!VisualPropertyNode.field_o) {
                DisplayModeInfo.a((byte) 121, 150);
                VisualPropertyNode.field_o = true;
              }
              if (!ll.themesLoaded[2]) {
                this.loadSweetsTheme(7);
              } else {
                if (ll.themesLoaded[0]) {
                  if (ll.themesLoaded[3]) {
                    if (ll.themesLoaded[6]) {
                      if (!ll.themesLoaded[5]) {
                        this.loadSportsTheme(75);
                      } else {
                        if (!ll.themesLoaded[4]) {
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
              if (pg.screenChangePending) {
                pg.screenChangePending = false;
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
                tc.currentScreenId = -1;
                UiWidget.gameplayReturnScreenId = -1;
                qj.clearGameplayDuringTransition = true;
              }
              if (ScoreSubmission.requestedScreenId != tc.currentScreenId) {
                if ((6 == ScoreSubmission.requestedScreenId) &&
                    (ug.newAchievementMask <= 0)) {
                  ScoreSubmission.requestedScreenId = 2;
                }
                if (-1 < tc.currentScreenId) {
                  TextTemplateDefinition.screens[tc.currentScreenId].updateTransition(16405);
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
                  ValidationIconWidget.playPcmSample(-348, fl.gameSoundSamples[30]);
                }
                nextScreenTransitionTickSnapshot = TriangleMesh.screenTransitionTick + 1;
                TriangleMesh.screenTransitionTick = TriangleMesh.screenTransitionTick + 1;
                if (nextScreenTransitionTickSnapshot == 160) {
                  if ((UiWidget.gameplayReturnScreenId != -1) &&
                      (UnderlinedButtonRenderer.c(-109))) {
                    if (ProxySocketConnector.gameplayOriginScreenId != 0) {
                      kb.a(-106);
                    } else {
                      PendingActionMarker.a((byte) 118);
                    }
                    pg.screenChangePending = true;
                  } else {
                    if (tc.currentScreenId == 2) {
                      FifoResponseToken.activeHighscoreQuery = null;
                    }
                  }
                  TriangleMesh.screenTransitionTick = 0;
                  tc.currentScreenId = ScoreSubmission.requestedScreenId;
                  qj.clearGameplayDuringTransition = false;
                }
              } else {
                if (tc.currentScreenId == -1) {
                  if (dl.field_b) {
                    introStillRunningSnapshot = !(DequeCursor.b(1));
                    dl.field_b = introStillRunningSnapshot;
                    if (!introStillRunningSnapshot) {
                      tc.currentScreenId = -2;
                      ScoreSubmission.requestedScreenId = 0;
                    }
                  } else {
                    UiWidget.gameplaySession.updateSession(-1578896191);
                  }
                } else {
                  TextTemplateDefinition.screens[tc.currentScreenId].updateScreen((byte) 29);
                }
              }
            }
          }
          TrackedPcmStream.updateAchievementSubmissions((byte) -122);
          NanoFrameTimer.a(-1, 0);
          if (sb.a(54)) {
            uiServiceResultOrOverlayMode = this.d((byte) -67);
            if (!(uiServiceResultOrOverlayMode != 2)) {
              oh.a(320, 240, IntrusiveNodeHashTable.smallFont, IntrusiveNodeHashTable.smallFont.maxAscent * 3 >> 1, -128, IntrusiveNodeHashTable.smallFont.maxAscent);
            }
          }
        } else {
          if (VisualPropertyNode.field_o) {
            DisplayModeInfo.a((byte) 121, 50);
            VisualPropertyNode.field_o = false;
          }
          this.h(115);
          if (CacheReference.f(-31456)) {
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
        if (bl.b(255)) {
          if (InstrumentPatch.field_n != null) {
            loadingCanvasStateSnapshot = true;
          } else {
            loadingCanvasStateSnapshot = ValidationState.field_d;
          }
          AccountContentDialog.a(loadingCanvasStateSnapshot, methodGuard - 25853, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        if (!DebouncedValidationProvider.gameAssetsInitialized) {
          fc.a(true, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        if (!UsernameAvailabilityValidator.g(39)) {
          HighscoreNameEntry.a(ByteShortQuery.waitingForExtraDataText, -2, 100.0f);
          fc.a(true, (java.awt.Canvas) (renderTargetCanvas));
          return;
        }
        SingleChildWidget.mainRasterBuffer.setAsRasterTarget(methodGuard - 25598);
        SoftwareRasterizer.clearFramebuffer();
        if ((tc.currentScreenId == ScoreSubmission.requestedScreenId) &&
            (UiWidget.gameplayReturnScreenId == -1)) {
          if (tc.currentScreenId != -1) {
            TextTemplateDefinition.screens[tc.currentScreenId].renderScreen(-28750);
          } else if (!dl.field_b) {
            UiWidget.gameplaySession.renderSession((byte) -49);
          } else {
            SpriteCheckboxRenderer.c(240);
          }
        } else {
          transitionSplitY = -480 + (TriangleMesh.screenTransitionTick * 6 + 35);
          if ((UiWidget.gameplayReturnScreenId == -1) &&
              (!qj.clearGameplayDuringTransition)) {
            if (ScoreSubmission.requestedScreenId == -1) {
              UiWidget.gameplaySession.renderSession((byte) -68);
            } else if (!(tc.currentScreenId != -1)) {
              UiWidget.gameplaySession.renderSession((byte) -68);
            }
          } else {
            SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 1);
          }
          if (tc.currentScreenId == -2) {
            SpriteCheckboxRenderer.c(methodGuard ^ 25613);
          }
          SoftwareRasterizer.setClip(0, 0, 640, transitionSplitY);
          if (ScoreSubmission.requestedScreenId != -1) {
            TextTemplateDefinition.screens[ScoreSubmission.requestedScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, transitionSplitY, 640, 480);
          if (tc.currentScreenId > -1) {
            TextTemplateDefinition.screens[tc.currentScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, 0, 640, 480);
          qj.transitionCurtain.draw(0, 6 * TriangleMesh.screenTransitionTick - 480);
        }
        if (DelayedPcmStream.b(true)) {
          if (null == InstrumentPatch.field_n) {
            overlayCanvasStateSnapshot = ValidationState.field_d;
          } else {
            overlayCanvasStateSnapshot = true;
          }
          kb.a(overlayCanvasStateSnapshot, false);
        }
        i.a(0, (byte) 110, (java.awt.Canvas) (renderTargetCanvas), 0);
        if (methodGuard != 25853) {
          canvasCreationTimeMillis = -11L;
        }
    }

    private final void loadJewelsTheme(boolean methodGuard) {
        if (ll.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(ll.gameGraphicsArchive.loadGroupByName("jewels", (byte) -128))) {
                return;
            }
            if (methodGuard) {
                return;
            }
            MidiPcmStream.jewelsForegroundSprite = ug.loadSprite("jewls_foreground", ll.gameGraphicsArchive, (byte) -78, "jewels");
            CachedArchiveSource.jewelsBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "jewels", "jewls_background");
            ll.themesLoaded[0] = true;
            return;
        }
    }

    private final void loadBakingTheme(int methodGuard) {
        if (ll.gameGraphicsArchive.ensureIndexLoaded(methodGuard - 2)) {
            if (!(ll.gameGraphicsArchive.loadGroupByName("baking", (byte) -125))) {
                return;
            }
            DisplayNamePanel.bakingForegroundSprite = ug.loadSprite("baking_foreground", ll.gameGraphicsArchive, (byte) -78, "baking");
            if (methodGuard != 2) {
                return;
            }
            FifoResponseToken.bakingBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, methodGuard - 1, "baking", "baking_background");
            ll.themesLoaded[4] = true;
            return;
        }
    }

    private final void loadSpaceTheme(boolean methodGuard) {
        if (ll.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!ll.gameGraphicsArchive.loadGroupByName("space", (byte) -127)) {
                return;
            }
            fl.spaceForegroundSprite = ug.loadSprite("space_foreground", ll.gameGraphicsArchive, (byte) -78, "space");
            LoginPayload.spaceBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "space", "space_background");
            if (methodGuard) {
                return;
            }
            ll.themesLoaded[6] = true;
            return;
        }
    }

    private final void requestGameArchives(boolean graphicsArchiveGuard) {
        if (ak.field_b != null) {
            SpriteState.a(true, ak.field_b);
            ak.field_b = null;
            ih.b(-105);
        }
        ll.gameGraphicsArchive = TrackedPcmStream.a(1, true, graphicsArchiveGuard, true, (byte) -111);
        OpacityWidget.field_F = SocketArchiveNetworkClient.createResourceArchive(2, (byte) -62);
        ah.field_c = SocketArchiveNetworkClient.createResourceArchive(3, (byte) -62);
        ProxySocketConnector.field_m = SocketArchiveNetworkClient.createResourceArchive(4, (byte) -62);
        GzipInflater.field_a = SocketArchiveNetworkClient.createResourceArchive(5, (byte) -62);
        ArchiveLoadStep.fontMetricsArchive = SocketArchiveNetworkClient.createResourceArchive(6, (byte) -62);
        qe.a(ki.basicUiGraphicsArchive, RankedListQuery.field_i, -84);
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
        tc.currentScreenId = -1;
        HotspotTextWidget.f(0);
        PacketByteCipher.a((byte) -74);
        DequeCursor.field_g = 5997;
        oa.field_a = 4703;
        kb.field_d = 275;
        SpriteButtonRenderer.field_r = 1385;
        lb.secondaryAchievementTrackingCounter = 935;
        dc.achievementTrackingBits = 0;
        UiWidget.achievementTrackingAccumulator = 8801;
        AwtRasterBuffer.primaryAchievementTrackingCounter = 3382;
        if (methodGuard <= 68) {
            this.loadJewelsTheme(true);
        }
        da.configureMenuPointerRepeat(150, 20);
    }

    private final void loadSweetsTheme(int methodGuard) {
        if (ll.gameGraphicsArchive.ensureIndexLoaded(0)) {
            if (!(ll.gameGraphicsArchive.loadGroupByName("sweets", (byte) -128))) {
                return;
            }
            lb.sweetsForegroundSprite = ug.loadSprite("sweets_foreground", ll.gameGraphicsArchive, (byte) -78, "sweets");
            if (methodGuard != 7) {
                return;
            }
            ValidationMessageWidget.sweetsBackgroundSprite = SocketConnector.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sweets", "sweets_background");
            ll.themesLoaded[2] = true;
            return;
        }
    }

    final void initializeGame(int methodGuard) {
        if (methodGuard <= 109) {
            return;
        }
        this.a((byte) -70, 9, 8, 10, 0, false, 7, 1);
        MidiPcmStream musicPlaybackStream = new MidiPcmStream();
        musicPlaybackStream.e(-1636, 9, 128);
        DiskArchiveCache.a((java.awt.Component) ((Object) MessageDialog.gameCanvas), MenuScreen.platformTaskDispatcher, false, musicPlaybackStream, true, 22050);
        this.a(false, false, true, true, -95);
    }

    static {
        loginMessage = "Please login";
        reconnectMessages = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        canvasCreationTimeMillis = 0L;
        longAndNameLoginType = new LoginPayloadKind(2);
    }
}
