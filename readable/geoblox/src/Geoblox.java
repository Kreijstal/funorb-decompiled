/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Geoblox extends wf {
    static String[] reconnectMessages;
    static String loginMessage;
    static volatile long field_D;
    static f field_y;
    static qg field_B;
    public static int field_C;

    private final void loadSportsTheme(int param0) {
        if (ll.gameGraphicsArchive.a(0)) {
            if (!(ll.gameGraphicsArchive.a("sports", (byte) -126))) {
                return;
            }
            if (param0 <= 37) {
                this.initializeScreens(92);
            }
            hd.sportsForegroundSprite = ug.loadSprite("sports_foreground", ll.gameGraphicsArchive, (byte) -78, "sports");
            th.sportsBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sports", "sports_background");
            ll.themesLoaded[5] = true;
            return;
        }
    }

    public Geoblox() {
    }

    final void serviceAudio(int param0) {
        if (param0 != 1) {
            this.loadJewelsTheme(true);
        }
        ScorePopup.b(122);
        if (!(vl.field_n == null)) {
            vl.field_n.a(0, MenuScreen.field_i);
        }
        pc.a((byte) 124);
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
        int clientFlagSnapshot = field_C;
        oj.a(vc.field_i, (byte) -104);
        if (null != wj.field_F && null != fe.field_a && ah.field_c != null && null != cd.field_m) {
            lc.a(ca.unpackingMusicText, -2, 60.0f);
            this.renderFrame(25853);
            jg.a(wj.field_F, (byte) 80, ah.field_c, fe.field_a, cd.field_m);
            ah.field_c = null;
            wj.field_F = null;
            cd.field_m = null;
            fe.field_a = null;
            ih.b(127);
            return false;
        }
        if (null != ll.gameGraphicsArchive && null != ii.fontMetricsArchive && ki.basicUiGraphicsArchive != null) {
            lc.a(oh.unpackingGraphicsText, methodGuard - 25871, 80.0f);
            this.renderFrame(25853);
            dd.uiPaletteFont = w.loadPaletteFont("", ll.gameGraphicsArchive, ii.fontMetricsArchive, true, "font");
            wf.field_p = dd.uiPaletteFont.e(1);
            dd.uiPaletteFont.colorPalettes[0][wf.field_p] = 16689938;
            dd.uiPaletteFont.colorPalettes[0][dd.uiPaletteFont.e(16777215)] = 1;
            uiPaletteSize = dd.uiPaletteFont.colorPalettes[0].length;
            alternateUiPalette = new int[uiPaletteSize];
            dd.uiPaletteFont.colorPalettes[1] = alternateUiPalette;
            sf.a(dd.uiPaletteFont.colorPalettes[0], 0, dd.uiPaletteFont.colorPalettes[1], 0, uiPaletteSize);
            dd.uiPaletteFont.colorPalettes[1][wf.field_p] = 16777215;
            geometrySourceFrames = wj.loadSpriteFrames("geoms", "", ll.gameGraphicsArchive, 0);
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
                s.geometrySpritesByThemeAndCategory[themeIndex][categoryThenAnimationFrameIndex] = geometrySourceFrames[geometryFrameThenVariantIndex];
                for (paletteVariantThenKeyboardIndex = 0; paletteVariantThenKeyboardIndex < 7; paletteVariantThenKeyboardIndex++) {
                    ke.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex] = new Sprite(geometryCanvasWidthThenFrameIndex, geometryCanvasHeight);
                    ke.entitySpritesByThemeCategoryAndVariant[themeIndex][categoryThenAnimationFrameIndex][paletteVariantThenKeyboardIndex].setAsRasterTarget();
                    geometrySourceFrames[geometryFrameThenVariantIndex].drawGrayModulated(0, 0, jg.themeSpriteColors[themeIndex][paletteVariantThenKeyboardIndex]);
                }
            }
            geometryAliasThenAmorphousFrames = wj.loadSpriteFrames("amorphic", "", ll.gameGraphicsArchive, methodGuard ^ 25869);
            for (themeIndex = 0; themeIndex < 7; themeIndex++) {
                for (geometryFrameThenVariantIndex = 0; geometryFrameThenVariantIndex < 7; geometryFrameThenVariantIndex++) {
                    for (categoryThenAnimationFrameIndex = 0; categoryThenAnimationFrameIndex < geometryAliasThenAmorphousFrames.length; categoryThenAnimationFrameIndex++) {
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex] = new Sprite(4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullWidth, 4 + geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].fullHeight);
                        MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].setAsRasterTarget();
                        geometryAliasThenAmorphousFrames[categoryThenAnimationFrameIndex].drawGrayModulated(2, 2, jg.themeSpriteColors[themeIndex][geometryFrameThenVariantIndex]);
                        k.a(0, 0, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullWidth, methodGuard ^ -3266, MenuScreen.amorphousFramesByThemeAndVariant[themeIndex][geometryFrameThenVariantIndex][categoryThenAnimationFrameIndex].fullHeight);
                    }
                }
            }
            sh.field_y.a(255);
            fi.smallFont = gi.loadBitmapFont(ii.fontMetricsArchive, 1, ll.gameGraphicsArchive, "small_font", "");
            fc.blackOrbFrames = wj.loadSpriteFrames("black", "", ll.gameGraphicsArchive, 0);
            hg.blackOrbImplosionFrames = wj.loadSpriteFrames("black_implode", "", ll.gameGraphicsArchive, 0);
            hb.silverStarFrames = wj.loadSpriteFrames("silver", "", ll.gameGraphicsArchive, 0);
            ej.amorphousCrackFrames = wj.loadSpriteFrames("amorph_crack", "", ll.gameGraphicsArchive, 0);
            i.avatarMaskRaster = ug.loadSprite("player_back", ll.gameGraphicsArchive, (byte) -78, "");
            avatarEyeSourceFrames = wj.loadSpriteFrames("player_eyes", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, 125)) {
                avatarEyeSourceFrames = wj.loadSpriteFrames("player_eyes", "halloween", ll.gameGraphicsArchive, 0);
            }
            fc.avatarEyeFrames = new Sprite[avatarEyeSourceFrames.length];
            for (categoryThenAnimationFrameIndex = 0; avatarEyeSourceFrames.length > categoryThenAnimationFrameIndex; categoryThenAnimationFrameIndex++) {
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex] = new Sprite(4 + avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullWidth, avatarEyeSourceFrames[categoryThenAnimationFrameIndex].fullHeight + 4);
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex].setAsRasterTarget();
                avatarEyeSourceFrames[categoryThenAnimationFrameIndex].drawUnmasked(2, 2);
                k.a(0, 0, fc.avatarEyeFrames[categoryThenAnimationFrameIndex].fullWidth, -27085, fc.avatarEyeFrames[categoryThenAnimationFrameIndex].height);
                fc.avatarEyeFrames[categoryThenAnimationFrameIndex].trimTransparentBorders();
            }
            avatarMouthSourceFrames = wj.loadSpriteFrames("player_mouth", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, methodGuard - 25774)) {
                avatarMouthSourceFrames = wj.loadSpriteFrames("player_mouth", "halloween", ll.gameGraphicsArchive, 0);
            }
            vh.avatarMouthFrames = new Sprite[avatarMouthSourceFrames.length];
            for (geometryCanvasWidthThenFrameIndex = 0; avatarMouthSourceFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                vh.avatarMouthFrames[geometryCanvasWidthThenFrameIndex] = new Sprite(avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullWidth + 4, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].fullHeight + 4);
                vh.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].setAsRasterTarget();
                avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].drawUnmasked(2, 2);
                k.a(2 + avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].trimY, 0, vh.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].fullWidth, -27085, avatarMouthSourceFrames[geometryCanvasWidthThenFrameIndex].height);
                vh.avatarMouthFrames[geometryCanvasWidthThenFrameIndex].trimTransparentBorders();
            }
            sh.field_y.a(255);
            fe.sunBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sun", "sky_background");
            ne.sunForegroundSprite = ug.loadSprite("sky_foreground", ll.gameGraphicsArchive, (byte) -78, "sun");
            ll.themesLoaded[1] = true;
            ee.menuBackgroundSprite = ug.loadSprite("menu_background", ll.gameGraphicsArchive, (byte) -78, "");
            vc.menuForegroundSprite = ug.loadSprite("menu_foreground", ll.gameGraphicsArchive, (byte) -78, "");
            qj.transitionCurtain = ug.loadSprite("transition", ll.gameGraphicsArchive, (byte) -78, "");
            vg.silverStarShockFrames = wj.loadSpriteFrames("silver_shock", "", ll.gameGraphicsArchive, 0);
            mi.sparkleFrames = wj.loadSpriteFrames("sparkle", "", ll.gameGraphicsArchive, 0);
            for (geometryCanvasWidthThenFrameIndex = 0; mi.sparkleFrames.length > geometryCanvasWidthThenFrameIndex; geometryCanvasWidthThenFrameIndex++) {
                mi.sparkleFrames[geometryCanvasWidthThenFrameIndex].addOutline(1);
            }
            vj.bangFrames = wj.loadSpriteFrames("bang", "", ll.gameGraphicsArchive, 0);
            eg.pointsPanelGlowFrames = wj.loadSpriteFrames("bonus_glow", "", ll.gameGraphicsArchive, 0);
            pk.resultBubbleSprite = ug.loadSprite("bubble", ll.gameGraphicsArchive, (byte) -78, "");
            k.popSprite = ug.loadSprite("pop", ll.gameGraphicsArchive, (byte) -78, "");
            eb.mouseBoxFrames = wj.loadSpriteFrames("box_mouse", "", ll.gameGraphicsArchive, 0);
            vf.avatarCryBeginFrames = wj.loadSpriteFrames("cry_begin", "", ll.gameGraphicsArchive, 0);
            ok.avatarCryMiddleFrames = wj.loadSpriteFrames("cry_middle", "", ll.gameGraphicsArchive, 0);
            ld.avatarCryEndFrames = wj.loadSpriteFrames("cry_end", "", ll.gameGraphicsArchive, 0);
            if (!(!da.a(0, 110))) {
                vf.avatarCryBeginFrames = wj.loadSpriteFrames("cry_begin", "halloween", ll.gameGraphicsArchive, 0);
                ok.avatarCryMiddleFrames = wj.loadSpriteFrames("cry_middle", "halloween", ll.gameGraphicsArchive, 0);
                ld.avatarCryEndFrames = wj.loadSpriteFrames("cry_end", "halloween", ll.gameGraphicsArchive, 0);
            }
            keyboardIconSprites = new IndexedSprite[8];
            keyboardIconSprites[0] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_left");
            keyboardIconSprites[1] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_right");
            keyboardIconSprites[2] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_enter");
            keyboardIconSprites[3] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_space");
            keyboardIconSprites[4] = jg.loadIndexedSprite(ll.gameGraphicsArchive, h.a(methodGuard, 25868), "", "keyboard_esc");
            keyboardIconSprites[5] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_backspace");
            keyboardIconSprites[6] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_down");
            keyboardIconSprites[7] = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "", "keyboard_i");
            keyboardIconAdvanceWidths = new int[keyboardIconSprites.length];
            keyboardWidthAlias = keyboardIconAdvanceWidths;
            keyboardWidthsForFill = keyboardWidthAlias;
            keyboardIconIndex = 0;
            paletteVariantThenKeyboardIndex = keyboardIconIndex;
            while (keyboardIconIndex < keyboardIconAdvanceWidths.length) {
                keyboardWidthsForFill[keyboardIconIndex] = keyboardIconSprites[keyboardIconIndex].fullHeight - 3;
                keyboardIconIndex++;
            }
            fi.smallFont.a(keyboardIconSprites, keyboardIconAdvanceWidths);
            sh.field_y.a(255);
            kh.screenTitleSprites[0] = ug.loadSprite("main_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[2] = ug.loadSprite("bestscoreseach_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[3] = ug.loadSprite("myscores_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[1] = ug.loadSprite("allscores_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[6] = ug.loadSprite("gameover_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[4] = ug.loadSprite("achievements_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[5] = ug.loadSprite("instructions_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[7] = ug.loadSprite("achievements_tg_title", ll.gameGraphicsArchive, (byte) -78, "");
            kh.screenTitleSprites[8] = ug.loadSprite("login_title", ll.gameGraphicsArchive, (byte) -78, "");
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
            re.widgetSprite = ug.loadSprite("widget", ll.gameGraphicsArchive, (byte) -78, "");
            sd.barSprite = ug.loadSprite("bar", ll.gameGraphicsArchive, (byte) -78, "");
            lj.smallBoxSprite = ug.loadSprite("box_sml", ll.gameGraphicsArchive, (byte) -78, "");
            g.countBoxSprite = ug.loadSprite("box_count", ll.gameGraphicsArchive, (byte) -78, "");
            vh.largeBoxSprite = ug.loadSprite("box_lgr", ll.gameGraphicsArchive, (byte) -78, "");
            tl.introFaceFrames = wj.loadSpriteFrames("intro_faces", "", ll.gameGraphicsArchive, 0);
            if (da.a(0, -105)) {
                tl.introFaceFrames = wj.loadSpriteFrames("intro_faces", "halloween", ll.gameGraphicsArchive, 0);
            }
            qh.introGeometryFrames = wj.loadSpriteFrames("intro_geoms", "", ll.gameGraphicsArchive, 0);
            sl.achievementSprites = wj.loadSpriteFrames("achievements", "", ll.gameGraphicsArchive, 0);
            am.unachievedSprite = ug.loadSprite("unachieved", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            ug.loadSprite("locked", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            uk.orbCoinSprite = ug.loadSprite("orbcoin", ki.basicUiGraphicsArchive, (byte) -78, "basic");
            GameScreen.selectedThemeId = 1;
            cd.selectThemeRenderAssets((byte) 79);
            ih.b(-62);
            ii.fontMetricsArchive = null;
            ki.basicUiGraphicsArchive = null;
            return false;
        }
        if (methodGuard != 25869) {
            reconnectMessages = (String[]) null;
        }
        lc.a(uj.field_a, -2, 100.0f);
        this.renderFrame(methodGuard ^ 496);
        qg.b(9313);
        return true;
    }

    private final boolean pollArchiveLoading(boolean param0) {
        rh stackIn_10_0 = null;
        rh stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        String stackIn_27_0;
        rh stackIn_27_1;
        String stackIn_27_2;
        String stackIn_27_3;
        String stackIn_28_0 = null;
        rh stackIn_28_1 = null;
        String stackIn_28_2 = null;
        String stackIn_28_3 = null;
        boolean stackIn_28_4 = false;
        String stackIn_47_0;
        rh stackIn_47_1;
        String stackIn_47_2;
        String stackIn_47_3;
        String stackIn_48_0 = null;
        rh stackIn_48_1 = null;
        String stackIn_48_2 = null;
        String stackIn_48_3 = null;
        boolean stackIn_48_4 = false;
        if (ef.field_e) {
          return true;
        }
        s.g(9);
        if (wj.field_F.a(0)) {
          if (wj.field_F.b(true)) {
            if (ah.field_c.a(0)) {
              stackIn_10_0 = ah.field_c;

              if (param0) {
                stackIn_11_0 = (rh) ((Object) stackIn_10_0);
                stackIn_11_1 = false;
              } else {
                stackIn_11_0 = (rh) ((Object) stackIn_10_0);
                stackIn_11_1 = true;
              }
              if (((rh) (Object) stackIn_11_0).b(stackIn_11_1)) {
                if (fe.field_a.a(0)) {
                  if (fe.field_a.b(true)) {
                    if (cd.field_m.a(0)) {
                      if (cd.field_m.b(true)) {
                        if (ii.fontMetricsArchive.a(0)) {
                          if (ii.fontMetricsArchive.b(true)) {
                            if (ll.gameGraphicsArchive.a(0)) {
                              if (ll.gameGraphicsArchive.a("", (byte) -127)) {
                                if (ll.gameGraphicsArchive.a(0)) {
                                  if (ll.gameGraphicsArchive.a("sun", (byte) -127)) {
                                    L8: {
                                      if (da.a(0, -112)) {
                                        if (ll.gameGraphicsArchive.a(0)) {
                                          if (ll.gameGraphicsArchive.a("halloween", (byte) -127)) {
                                            break L8;
                                          }
                                        }
                                        lc.a(gf.a(s.field_F, ll.gameGraphicsArchive, "halloween", uj.field_c, true), -2, 45.0f);
                                        return false;
                                      }
                                    }
                                    if (ki.basicUiGraphicsArchive.a(0)) {
                                      if (ki.basicUiGraphicsArchive.a("basic", (byte) -124)) {
                                        if (param0) {
                                          return true;
                                        }
                                        SecondaryDeque.c(480);
                                        lc.a(uj.field_a, -2, 50.0f);
                                        this.renderFrame(25853);
                                        ef.field_e = true;
                                        return true;
                                      }
                                    }
                                    stackIn_47_0 = ff.waitingForGraphicsText;

                                    stackIn_47_1 = ki.basicUiGraphicsArchive;

                                    stackIn_47_2 = "basic";

                                    stackIn_47_3 = AccountWelcomePanel.loadingGraphicsText;

                                    if (param0) {
                                      stackIn_48_0 = (String) ((Object) stackIn_47_0);
                                      stackIn_48_1 = (rh) ((Object) stackIn_47_1);
                                      stackIn_48_2 = (String) ((Object) stackIn_47_2);
                                      stackIn_48_3 = (String) ((Object) stackIn_47_3);
                                      stackIn_48_4 = false;
                                    } else {
                                      stackIn_48_0 = (String) ((Object) stackIn_47_0);
                                      stackIn_48_1 = (rh) ((Object) stackIn_47_1);
                                      stackIn_48_2 = (String) ((Object) stackIn_47_2);
                                      stackIn_48_3 = (String) ((Object) stackIn_47_3);
                                      stackIn_48_4 = true;
                                    }
                                    lc.a(gf.a(stackIn_48_0, stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4), -2, 50.0f);
                                    return false;
                                  }
                                }
                                lc.a(gf.a(ff.waitingForGraphicsText, ll.gameGraphicsArchive, "sun", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                                return false;
                              }
                            }
                            lc.a(gf.a(ff.waitingForGraphicsText, ll.gameGraphicsArchive, "", AccountWelcomePanel.loadingGraphicsText, true), -2, 45.0f);
                            return false;
                          }
                        }
                        stackIn_27_0 = ik.waitingForFontsText;

                        stackIn_27_1 = ii.fontMetricsArchive;

                        stackIn_27_2 = "";

                        stackIn_27_3 = nb.loadingFontsText;

                        if (param0) {
                          stackIn_28_0 = (String) ((Object) stackIn_27_0);
                          stackIn_28_1 = (rh) ((Object) stackIn_27_1);
                          stackIn_28_2 = (String) ((Object) stackIn_27_2);
                          stackIn_28_3 = (String) ((Object) stackIn_27_3);
                          stackIn_28_4 = false;
                        } else {
                          stackIn_28_0 = (String) ((Object) stackIn_27_0);
                          stackIn_28_1 = (rh) ((Object) stackIn_27_1);
                          stackIn_28_2 = (String) ((Object) stackIn_27_2);
                          stackIn_28_3 = (String) ((Object) stackIn_27_3);
                          stackIn_28_4 = true;
                        }
                        lc.a(gf.a(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4), -2, 35.0f);
                        return false;
                      }
                    }
                    lc.a(vd.a(ud.loadingSoundEffectsText, pa.waitingForSoundEffectsText, 0, param0, cd.field_m), -2, 25.0f);
                    return false;
                  }
                }
                lc.a(gf.a(ji.waitingForMusicText, fe.field_a, "", dd.loadingMusicText, true), -2, 15.0f);
                return false;
              }
            }
            lc.a(gf.a(pa.waitingForSoundEffectsText, ah.field_c, "", ud.loadingSoundEffectsText, true), -2, 10.0f);
            return false;
          }
        }
        lc.a(gf.a(pa.waitingForSoundEffectsText, wj.field_F, "", ud.loadingSoundEffectsText, true), -2, 5.0f);
        return false;
    }

    final void releaseGameResources(byte param0) {
        Geoblox.clearAppletStatics(0);
        ch.c((byte) 122);
        kj.b(false);
        ug.a(9144);
        sg.a(-13575);
        hg.a(-17525);
        ic.a(16424);
        ok.a(true);
        wf.g(30344);
        wg.c((byte) 108);
        wl.a(31997);
        le.a(-29313);
        vk.a(-42);
        SoftwareRasterizer.releaseRasterStorage();
        rh.b(30261);
        b.a(17062);
        kb.c(105);
        qc.d(0);
        oa.b(8192);
        ab.a((byte) -60);
        gf.a(true);
        gg.a(45);
        jk.a(param0 ^ 10848);
        ik.a(48);
        vd.b(param0 + 59);
        pg.b(22059);
        lj.a(-1);
        cl.a(-9474);
        i.a(false);
        cj.b(param0 ^ 78);
        sc.b((byte) 58);
        eb.a((byte) -127);
        he.a(param0 + 64);
        v.a(true);
        GameScreen.d((byte) 28);
        GameplaySession.i(-17199);
        ji.d(-50);
        uf.a(param0 ^ 74);
        em.a(86);
        BufferedSocket.releaseTransformedVertexScratch(21888);
        IntrusiveDeque.f(51);
        IntrusiveNode.b((byte) -128);
        fi.a(param0 - 63);
        jb.b();
        ad.c(-1);
        je.a((byte) 54);
        AudioOutput.h();
        tj.a(param0 + 154);
        ud.a(0);
        da.a(50);
        bm.a(114);
        fe.c(-127);
        nh.a(true);
        eh.a(-6910);
        ld.a(true);
        fa.a(30970);
        ng.k(param0 - 33);
        r.r(-60);
        rl.h((byte) 57);
        ei.n(param0 ^ 69);
        f.n(-107);
        qh.h(0);
        AccountWelcomePanel.f(1);
        pf.a((byte) -97);
        hi.i((byte) -85);
        mb.a(param0 + 63);
        ej.a(-89);
        mj.a(param0 + 168);
        ue.a(true);
        w.a((byte) 102);
        bl.a(param0 ^ 9769);
        m.a();
        DualLinkNode.c((byte) -110);
        SpriteState.f(param0 ^ -5558);
        PendingActionMarker.c((byte) 45);
        ke.a((byte) -80);
        af.a((byte) -103);
        te.a(-8297);
        qe.a(-8616);
        qg.a(85);
        df.a(param0 + 64);
        pk.j(param0 ^ -64);
        ki.a((byte) -64);
        MenuScreen.a((byte) 26);
        oh.a((byte) -88);
        SecondaryDeque.b(-10943);
        GameplayEntity.e((byte) 104);
        kc.a(126);
        mf.a(false);
        ah.a(39);
        fl.a(33);
        kd.a((byte) 122);
        ri.a(5366);
        pa.b((byte) 74);
        bh.a((byte) 81);
        ec.a(true);
        pj.b(false);
        vl.b(true);
        t.a(17348);
        kh.a(104);
        ne.b((byte) -125);
        kk.i(-84);
        sd.e((byte) 118);
        bj.b(true);
        pb.f(31735);
        dl.a(true);
        ij.i((byte) -80);
        bk.a(true);
        ff.a(true);
        mh.c();
        MusicDecoder.a();
        dc.b(126);
        nf.b((byte) 115);
        lb.a(31);
        rb.a((byte) -112);
        fc.a((byte) -126);
        nb.a(-102);
        ak.a(param0 ^ 30613);
        kf.b(param0 - 15583);
        tc.a(true);
        mi.b(false);
        vg.a(true);
        am.a((byte) 49);
        oj.a(-87);
        tb.a();
        eg.b(false);
        oi.a((byte) -108);
        ek.a(-128);
        bi.a(1);
        rd.a((byte) 94);
        hb.a(param0 ^ -64);
        jf.b((byte) -89);
        el.b(-5927);
        hk.f((byte) -11);
        sh.a((byte) -3);
        oe.j(89);
        dd.i(256);
        ee.e(14078);
        gb.b((byte) 79);
        a.a(param0);
        MusicDecodeStage.a();
        ul.a(-113);
        og.f(111);
        ih.a((byte) 73);
        di.a((byte) 107);
        jj.a(126);
        wb.a((byte) 95);
        qa.a((byte) -30);
        kg.e((byte) 77);
        sb.b(false);
        vj.a(-97);
        jg.c(16712207);
        bd.b(-20152);
        cm.a(false);
        bf.c((byte) -117);
        rj.a(param0 ^ -33);
        id.b(true);
        md.a((byte) 40);
        li.a(false);
        va.a(0);
        ge.b(102);
        ed.a();
        cg.c((byte) -120);
        hd.f((byte) -52);
        hc.k(-243);
        dj.l((byte) -15);
        qf.m(param0 ^ -320);
        hl.f(407213000);
        vh.b(true);
        vf.h(0);
        td.f(-116);
        pi.j(24033);
        vi.f(-75);
        TextInputValidator.f(param0 + 65);
        jc.a(-43);
        s.b(false);
        qb.f(0);
        ol.f(0);
        ll.a(param0 + 71);
        vc.b((byte) -87);
        l.b(param0 ^ 47);
        sj.a(27);
        la.g((byte) -113);
        fk.f(param0 + 14576);
        ck.a(-113);
        gi.a(param0 ^ 63);
        ra.a(param0 + 63);
        fj.e(-111);
        gj.h(-1);
        cd.e(1353);
        ub.a();
        qj.a((byte) -23);
        k.b(0);
        ef.a((byte) 101);
        ai.b(46695);
        ph.a((byte) 112);
        ml.b(16777215);
        fh.a(1);
        ac.a((byte) 68);
        uh.c(0);
        oc.a(true);
        wj.f((byte) -60);
        j.f((byte) -128);
        re.b(127);
        ii.a(122);
        sl.a(102);
        gk.a(param0 ^ -64);
        ni.a((byte) -113);
        qi.c(59);
        p.b(param0 ^ 25);
        od.a((byte) -92);
        lf.b(8221);
        th.d((byte) -109);
        nk.b(-17226);
        uj.a(-53);
        tl.b(param0 ^ -6501);
        ea.b(1000);
        se.b(param0 ^ -65);
        ca.b(false);
        si.a(false);
        lk.a((byte) 0);
        ScorePopup.c((byte) -40);
        uk.d((byte) 113);
        g.g(param0 - 51);
        ag.g(param0 - 22);
        mk.c((byte) -9);
        cf.g(-48);
        MatchingTextValidator.clearStaticReferences(param0 + 64);
        hh.a(false);
        fb.b(true);
        lh.b(-481);
        ib.a(true);
        this.field_n = null;
    }

    private final void loadGermsTheme(byte param0) {
        if (ll.gameGraphicsArchive.a(0)) {
            if (!(ll.gameGraphicsArchive.a("germs", (byte) -126))) {
                return;
            }
            sl.germsForegroundSprite = ug.loadSprite("germs_foreground", ll.gameGraphicsArchive, (byte) -78, "germs");
            sg.germsBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "germs", "germs_background");
            int var2 = -24 / ((param0 + 13) / 61);
            ll.themesLoaded[3] = true;
            return;
        }
    }

    public final void init() {
        this.a(11, "geoblox", 640);
    }

    final static void setRasterTarget(int param0, Sprite param1) {
        try {
            oc.b(9);
            SoftwareRasterizer.setRasterTarget(param1.pixels, param1.fullWidth, param1.fullHeight);
            if (param0 != 1) {
                Sprite var3 = (Sprite) null;
                Geoblox.setRasterTarget(-34, (Sprite) null);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "Geoblox.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearAppletStatics(int param0) {
        field_B = null;
        reconnectMessages = null;
        if (param0 != 0) {
            Sprite var2 = (Sprite) null;
            Geoblox.setRasterTarget(30, (Sprite) null);
        }
        loginMessage = null;
        field_y = null;
    }

    final void updateGame(boolean param0) {
        int fieldTemp$0 = 0;
        boolean discarded$1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_63_0 = false;
        boolean stackIn_91_0 = false;
        int var2;
        int var3;
        var3 = field_C;
        ng.h(78);
        if (param0) {
          return;
        }
        if (vl.field_n != null) {
          if (vl.field_n.field_c) {
            vl.field_n.a(0, MenuScreen.field_i);
            vl.field_n = null;
          }
        }

        if (null == vl.field_n) {
          stackIn_9_1 = false;
        } else {
          stackIn_9_1 = true;
        }
        this.b(stackIn_9_1, 19660);
        if (cf.field_k) {

          if (param0) {
            stackIn_14_1 = false;
          } else {
            stackIn_14_1 = true;
          }
          this.requestGameArchives(stackIn_14_1);
          cf.field_k = false;
        }
        L4: while (sh.a((byte) -118, pb.field_m)) {
          this.l(121);
        }
        L5: {
          if (!bl.b(255)) {
            L6: {
              if (!ib.gameAssetsInitialized) {
                oj.a(vc.field_i, (byte) -98);
                if (this.pollArchiveLoading(false)) {
                  if (this.prepareGameAssets(25869)) {
                    ib.gameAssetsInitialized = true;
                    this.initializeScreens(82);
                    break L6;
                  }
                }
                cm.a(-1, 0);
                return;
              }
              if (!uk.g(79)) {
                lc.a(ph.waitingForExtraDataText, -2, 100.0f);
              } else {
                if (dd.a((byte) 47)) {
                  if (!jk.field_a) {
                    stackIn_91_0 = !(vl.field_n == null);
                    L10: {
                      var2 = sl.a(stackIn_91_0, (wf) (this), false);
                      if (var2 != 2364824) {
                        if (var2 != 1) {
                          if (2 != var2) {
                            break L10;
                          }
                        }
                        if (null != vl.field_n) {
                          vl.field_n.a(0, MenuScreen.field_i);
                          vl.field_n = null;
                        }
                        if (var2 == 2) {
                          gf.a(k.c(109), 62);
                        }
                      } else {
                        DualLinkNode.c(-8);
                      }
                    }
                    if (!kg.field_o) {
                      break L6;
                    }
                    rj.a((byte) 121, 50);
                    kg.field_o = false;
                    break L6;
                  }
                }
                if (!kg.field_o) {
                  rj.a((byte) 121, 150);
                  kg.field_o = true;
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
                  if (!fh.c(-95)) {
                    if (0 < og.field_n) {
                      t.menuActionIds[1] = new int[]{1, 8, 9, 4, 3, 6};
                      og.screens[1].setItemCount(-12831, t.menuActionIds[1].length);
                      if (0 == el.gameplayReturnScreenId) {
                        f.i((byte) -112);
                        og.screens[0].activeTicks = 0;
                      }
                    }
                    if (null != el.gameplaySession) {
                      if (el.gameplaySession.score > 0) {
                        el.gameplaySession.submitScore((byte) -70);
                      }
                    }
                    ai.requestedScreenId = el.gameplayReturnScreenId;
                  } else {
                    ai.requestedScreenId = cd.gameplayOriginScreenId;
                  }
                  tc.currentScreenId = -1;
                  el.gameplayReturnScreenId = -1;
                  qj.clearGameplayDuringTransition = true;
                }
                if (ai.requestedScreenId != tc.currentScreenId) {
                  if (6 == ai.requestedScreenId) {
                    if (ug.field_c <= 0) {
                      ai.requestedScreenId = 2;
                    }
                  }
                  if (-1 < tc.currentScreenId) {
                    og.screens[tc.currentScreenId].updateTransition(16405);
                  }
                  if (ai.requestedScreenId != -1) {
                    og.screens[ai.requestedScreenId].updateTransition(16405);
                    og.screens[ai.requestedScreenId].field_q = 0;
                    if (ai.requestedScreenId != 3) {
                      og.screens[ai.requestedScreenId].selectedItemIndex = 0;
                    } else {
                      og.screens[ai.requestedScreenId].selectedItemIndex = 1;
                    }
                  }
                  if (nf.screenTransitionTick == 0) {
                    td.playPcmSample(-348, fl.field_c[30]);
                  }
                  fieldTemp$0 = nf.screenTransitionTick + 1;
                  nf.screenTransitionTick = nf.screenTransitionTick + 1;
                  if (fieldTemp$0 == 160) {
                    L23: {
                      if (el.gameplayReturnScreenId != -1) {
                        if (fh.c(-109)) {
                          if (cd.gameplayOriginScreenId != 0) {
                            kb.a(-106);
                          } else {
                            PendingActionMarker.a((byte) 118);
                          }
                          pg.screenChangePending = true;
                          break L23;
                        }
                      }
                      if (tc.currentScreenId == 2) {
                        ca.field_f = null;
                      }
                    }
                    nf.screenTransitionTick = 0;
                    tc.currentScreenId = ai.requestedScreenId;
                    qj.clearGameplayDuringTransition = false;
                  }
                } else {
                  if (tc.currentScreenId == -1) {
                    if (dl.field_b) {
                      stackIn_63_0 = !(gb.b(1));
                      dl.field_b = stackIn_63_0;
                      if (!stackIn_63_0) {
                        tc.currentScreenId = -2;
                        ai.requestedScreenId = 0;
                      }
                    } else {
                      el.gameplaySession.updateSession(-1578896191);
                    }
                  } else {
                    og.screens[tc.currentScreenId].updateScreen((byte) 29);
                  }
                }
              }
            }
            je.c((byte) -122);
            cm.a(-1, 0);
            if (sb.a(54)) {
              var2 = this.d((byte) -67);
              if (var2 != 2) {
                break L5;
              }
              oh.a(320, 240, fi.smallFont, fi.smallFont.field_o * 3 >> 1, -128, fi.smallFont.field_o);
            }
          } else {
            if (kg.field_o) {
              rj.a((byte) 121, 50);
              kg.field_o = false;
            }
            this.h(115);
            if (fj.f(-31456)) {
              discarded$1 = this.pollArchiveLoading(false);
            }
          }
        }
    }

    final void renderFrame(int param0) {
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_42_0 = false;
        Object var2;
        int transitionSplitY;
        int var4;
        var4 = field_C;
        if (vl.field_n != null) {
          stackIn_3_0 = vl.field_n;
        } else {
          stackIn_3_0 = f.field_kb;
        }
        var2 = stackIn_3_0;
        if (bl.b(255)) {
          if (vl.field_n != null) {
            stackIn_7_0 = true;
          } else {
            stackIn_7_0 = lh.field_d;
          }
          ei.a(stackIn_7_0, param0 - 25853, (java.awt.Canvas) (var2));
          return;
        }
        if (!ib.gameAssetsInitialized) {
          fc.a(true, (java.awt.Canvas) (var2));
          return;
        }
        if (!uk.g(39)) {
          lc.a(ph.waitingForExtraDataText, -2, 100.0f);
          fc.a(true, (java.awt.Canvas) (var2));
          return;
        }
        L1: {
          sh.field_y.a(param0 - 25598);
          SoftwareRasterizer.clearFramebuffer();
          if (tc.currentScreenId == ai.requestedScreenId) {
            if (el.gameplayReturnScreenId == -1) {
              if (tc.currentScreenId != -1) {
                og.screens[tc.currentScreenId].renderScreen(-28750);
                break L1;
              }
              if (!dl.field_b) {
                el.gameplaySession.renderSession((byte) -49);
                break L1;
              }
              oc.c(240);
              break L1;
            }
          }
          L3: {
            transitionSplitY = -480 + (nf.screenTransitionTick * 6 + 35);
            if (el.gameplayReturnScreenId == -1) {
              if (!qj.clearGameplayDuringTransition) {
                if (ai.requestedScreenId == -1) {
                  el.gameplaySession.renderSession((byte) -68);
                  break L3;
                }
                if (tc.currentScreenId != -1) {
                  break L3;
                }
                el.gameplaySession.renderSession((byte) -68);
                break L3;
              }
            }
            SoftwareRasterizer.fillRectangle(0, 0, 640, 480, 1);
          }
          if (tc.currentScreenId == -2) {
            oc.c(param0 ^ 25613);
          }
          SoftwareRasterizer.setClip(0, 0, 640, transitionSplitY);
          if (ai.requestedScreenId != -1) {
            og.screens[ai.requestedScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, transitionSplitY, 640, 480);
          if (tc.currentScreenId > -1) {
            og.screens[tc.currentScreenId].renderScreen(-28750);
          }
          SoftwareRasterizer.setClip(0, 0, 640, 480);
          qj.transitionCurtain.draw(0, 6 * nf.screenTransitionTick - 480);
        }
        if (cg.b(true)) {
          if (null == vl.field_n) {
            stackIn_42_0 = lh.field_d;
          } else {
            stackIn_42_0 = true;
          }
          kb.a(stackIn_42_0, false);
        }
        i.a(0, (byte) 110, (java.awt.Canvas) (var2), 0);
        if (param0 != 25853) {
          field_D = -11L;
        }
    }

    private final void loadJewelsTheme(boolean param0) {
        if (ll.gameGraphicsArchive.a(0)) {
            if (!(ll.gameGraphicsArchive.a("jewels", (byte) -128))) {
                return;
            }
            if (param0) {
                return;
            }
            kj.jewelsForegroundSprite = ug.loadSprite("jewls_foreground", ll.gameGraphicsArchive, (byte) -78, "jewels");
            bj.jewelsBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "jewels", "jewls_background");
            ll.themesLoaded[0] = true;
            return;
        }
    }

    private final void loadBakingTheme(int param0) {
        if (ll.gameGraphicsArchive.a(param0 - 2)) {
            if (!(ll.gameGraphicsArchive.a("baking", (byte) -125))) {
                return;
            }
            hi.bakingForegroundSprite = ug.loadSprite("baking_foreground", ll.gameGraphicsArchive, (byte) -78, "baking");
            if (param0 != 2) {
                return;
            }
            ca.bakingBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, param0 - 1, "baking", "baking_background");
            ll.themesLoaded[4] = true;
            return;
        }
    }

    private final void loadSpaceTheme(boolean param0) {
        if (ll.gameGraphicsArchive.a(0)) {
            if (!ll.gameGraphicsArchive.a("space", (byte) -127)) {
                return;
            }
            fl.spaceForegroundSprite = ug.loadSprite("space_foreground", ll.gameGraphicsArchive, (byte) -78, "space");
            df.spaceBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "space", "space_background");
            if (param0) {
                return;
            }
            ll.themesLoaded[6] = true;
            return;
        }
    }

    private final void requestGameArchives(boolean param0) {
        if (ak.field_b != null) {
            SpriteState.a(true, ak.field_b);
            ak.field_b = null;
            ih.b(-105);
        }
        ll.gameGraphicsArchive = je.a(1, true, param0, true, (byte) -111);
        wj.field_F = kk.a(2, (byte) -62);
        ah.field_c = kk.a(3, (byte) -62);
        cd.field_m = kk.a(4, (byte) -62);
        fe.field_a = kk.a(5, (byte) -62);
        ii.fontMetricsArchive = kk.a(6, (byte) -62);
        qe.a(ki.basicUiGraphicsArchive, re.field_i, -84);
    }

    final static void a(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = field_C;
        var2 = 0;
        var3 = gb.field_f;
        if (var3 >= 5) {
          if (var3 < 105) {
            var2 = (-40960 + 16384 * var3) / 220;
          } else {
            if (120 > var3) {
              var3 = 120 - var3;
              var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
            }
          }
        } else {
          var2 = 8192 * var3 * var3 / 1100;
        }
        var4 = 1;
        var5 = 0;
        if (param1 == 1) {
          var5 = 1;
        }
        if (3 == param1) {
          var4 = -1;
        }
        if (4 == param1) {
          var4 = 1;
          var5 = 1;
        }
        if (param1 == 5) {
          var5 = 1;
          var4 = -1;
        }
        if (param1 == 6) {
          var5 = -1;
          var4 = 1;
        }
        L6: {
          if (7 != param1) {
            if (8 != param1) {
              break L6;
            }
          }
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 11) {
          var4 = -1;
        }
        if (param1 == 12) {
          var5 = -1;
          var4 = -1;
        }
        if (param1 == 13) {
          var5 = -1;
          var4 = 1;
        }
        if (param1 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param1 == 15) {
          var4 = 1;
          var5 = 1;
        }
        lk.field_f = bm.a(var2 * var4, param0, var5 * var2);
    }

    private final void initializeScreens(int param0) {
        int screenIndex = 0;
        int var3 = field_C;
        if (!(og.field_n > 0)) {
            t.menuActionIds[1] = new int[]{1, 8, 9, 3, 6};
        }
        for (screenIndex = 0; screenIndex < 9; screenIndex++) {
            og.screens[screenIndex] = new GameScreen((Geoblox) (this), screenIndex);
        }
        ai.requestedScreenId = -1;
        tc.currentScreenId = -1;
        vf.f(0);
        ne.a((byte) -74);
        gb.field_g = 5997;
        oa.field_a = 4703;
        kb.field_d = 275;
        ml.field_r = 1385;
        lb.field_b = 935;
        dc.field_a = 0;
        el.field_g = 8801;
        sc.field_f = 3382;
        if (param0 <= 68) {
            this.loadJewelsTheme(true);
        }
        da.b(150, 20);
    }

    private final void loadSweetsTheme(int param0) {
        if (ll.gameGraphicsArchive.a(0)) {
            if (!(ll.gameGraphicsArchive.a("sweets", (byte) -128))) {
                return;
            }
            lb.sweetsForegroundSprite = ug.loadSprite("sweets_foreground", ll.gameGraphicsArchive, (byte) -78, "sweets");
            if (param0 != 7) {
                return;
            }
            pi.sweetsBackgroundSprite = jg.loadIndexedSprite(ll.gameGraphicsArchive, 1, "sweets", "sweets_background");
            ll.themesLoaded[2] = true;
            return;
        }
    }

    final void initializeGame(int param0) {
        if (param0 <= 109) {
            return;
        }
        this.a((byte) -70, 9, 8, 10, 0, false, 7, 1);
        kj var2 = new kj();
        var2.e(-1636, 9, 128);
        jh.a((java.awt.Component) ((Object) f.field_kb), MenuScreen.field_i, false, var2, true, 22050);
        this.a(false, false, true, true, -95);
    }

    static {
        loginMessage = "Please login";
        reconnectMessages = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_D = 0L;
        field_B = new qg(2);
    }
}
