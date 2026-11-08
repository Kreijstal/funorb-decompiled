/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundCache {
    static String loadingExtradata;
    private IterableNodeHashTable field_e;
    static String fsAcceptCountdownPl;
    static String tutorialNineBallBreak;
    static int field_b;
    static int[] field_g;
    private ResourceArchive field_d;
    private ResourceArchive field_h;
    static LogoMaterial[] field_a;
    static IntrusiveDeque field_k;
    private IterableNodeHashTable field_f;

    private final PcmSample getSynthesizedSampleByName(String param0, byte param1, int[] param2, String param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_h.getGroupId(param0, -1);
          if (0 > var5_int) {
            stackIn_2_0 = null;
            return (PcmSample) (stackIn_2_0);
          }
          var6 = this.field_h.getFileId(var5_int, param1 ^ 18, param3);
          if (param1 != 18) {
            fsAcceptCountdownPl = (String) null;
          }
          if (var6 >= 0) {
            stackIn_9_0 = this.getSynthesizedSample(true, var5_int, var6, param2);
            return stackIn_9_0;
          }
          stackIn_7_0 = null;
          return (PcmSample) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("cf.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        field_g = null;
        if (param0 != 28746) {
          field_g = (int[]) null;
        }
        tutorialNineBallBreak = null;
        loadingExtradata = null;
        fsAcceptCountdownPl = null;
        field_a = null;
    }

    final static void loadGameSprites(int obfuscationGuard, ResourceArchive archive) {
        TableScene var10 = null;
        IndexedSprite var11 = null;
        int[] var25 = null;
        int[] var23 = null;
        int[] var13 = null;
        int[] var4_ref_int__ = null;
        int var5_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        Sprite dupTemp$0 = null;
        Sprite var14 = null;
        Sprite var8 = null;
        Sprite dupTemp$1 = null;
        Sprite var15 = null;
        Sprite dupTemp$2 = null;
        Sprite var16 = null;
        Sprite dupTemp$3 = null;
        Sprite var17 = null;
        Sprite dupTemp$4 = null;
        Sprite var18 = null;
        Sprite dupTemp$5 = null;
        Sprite var19 = null;
        Sprite[] var3 = null;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        Sprite[] var20 = null;
        int var4 = 0;
        IndexedSprite var21 = null;
        int var2_int = 0;
        int var9 = Pool.field_O;
        Sprite var8Lifetime1;
        Sprite var8Lifetime2;
        Sprite var8Lifetime3;
        Sprite var8Lifetime4;
        Sprite var8Lifetime5;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var2_intLifetime4;
        try {
          for (var2_int = 0; var2_int < BrowserCookieWriter.field_b.length; var2_int++) {
            var10 = BrowserCookieWriter.field_b[var2_int];
            var10.loadSceneSprites(-23569, archive);
          }
          for (var2_intLifetime1 = 0; PoolGameModel.field_B.length > var2_intLifetime1; var2_intLifetime1++) {
            PoolGameModel.field_B[var2_intLifetime1].loadTopBarSprites(198123656, archive);
          }
          IntrusiveNodeHashTable.field_b = new Sprite[]{WidgetStyleLayer.loadSprite("", (byte) 46, "menu_background_modern", archive), WidgetStyleLayer.loadSprite("", (byte) 42, "menu_background_plasma", archive), WidgetStyleLayer.loadSprite("", (byte) 62, "menu_background_jungle", archive), WidgetStyleLayer.loadSprite("", (byte) 40, "menu_background_polar", archive), WidgetStyleLayer.loadSprite("", (byte) 76, "menu_background_shuttle", archive)};
          WorldPointProjectionSupport.field_c = WidgetStyleLayer.loadSprite("", (byte) 124, "select_table_thumbnail_modern", archive);
          NineSliceFrame.field_d = WidgetStyleLayer.loadSprite("", (byte) 120, "select_table_thumbnail_plasma", archive);
          PaletteFontLoader.field_b = WidgetStyleLayer.loadSprite("", (byte) 121, "select_table_thumbnail_jungle", archive);
          LobbyPlayer.field_Vb = WidgetStyleLayer.loadSprite("", (byte) 44, "select_table_thumbnail_polar", archive);
          ReflectionReplySupport.field_e = WidgetStyleLayer.loadSprite("", (byte) 91, "select_table_thumbnail_shuttle", archive);
          NameNormalizationSupport.field_b = WidgetStyleLayer.loadSprite("", (byte) 50, "select_table_thumbnail_jungle_locked", archive);
          AccountStateQuery.field_n = WidgetStyleLayer.loadSprite("", (byte) 87, "select_table_thumbnail_polar_locked", archive);
          IntrusiveNodeHashTable.field_g = WidgetStyleLayer.loadSprite("", (byte) 62, "select_table_thumbnail_shuttle_locked", archive);
          MatchingTextValidator.field_t = new Sprite[]{null, null, NameNormalizationSupport.field_b, AccountStateQuery.field_n, IntrusiveNodeHashTable.field_g};
          TutorialSelectScreen.field_K = new Sprite[]{WorldPointProjectionSupport.field_c, NineSliceFrame.field_d, PaletteFontLoader.field_b, LobbyPlayer.field_Vb, ReflectionReplySupport.field_e};
          BrowserCookieWriter.field_a[0] = NameEntryPopup.loadSpritesByName(TutorialFactory.bitwiseXor(obfuscationGuard, 0), "", archive, "gameopt_listicons_turntime");
          BrowserCookieWriter.field_a[2] = NameEntryPopup.loadSpritesByName(obfuscationGuard + 0, "", archive, "gameopt_listicons_theme");
          BrowserCookieWriter.field_a[1] = NameEntryPopup.loadSpritesByName(TutorialFactory.bitwiseXor(obfuscationGuard, 0), "", archive, "gameopt_listicons_ruleset");
          BrowserCookieWriter.field_a[3] = NameEntryPopup.loadSpritesByName(0, "", archive, "gameopt_listicons_guides");
          SlidingPanelSupport.field_f[0] = BrowserCookieWriter.field_a[0];
          SlidingPanelSupport.field_f[2] = NameEntryPopup.loadSpritesByName(TutorialFactory.bitwiseXor(obfuscationGuard, 0), "", archive, "gameopt_buttonicons_theme");
          SlidingPanelSupport.field_f[3] = BrowserCookieWriter.field_a[3];
          SlidingPanelSupport.field_f[1] = BrowserCookieWriter.field_a[1];
          MeshSymmetrySupport.field_g = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "frame"), (byte) -29);
          MidiPcmStream.field_y = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "frame_dark"), (byte) -29);
          UsernameSuggestionsPanel.field_N = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(obfuscationGuard + 0, "", archive, "frame_black"), (byte) -29);
          ModelOriginSupport.field_s = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "frame_selected"), (byte) -29);
          TutorialFactory.field_b = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "menu_main_frame"), (byte) -29);
          DisplayNamePanel.field_T = WidgetStyleLayer.loadSprite("", (byte) 109, "menu_main_frame_pocket_bottom", archive);
          TransformSupport.field_b = WidgetStyleLayer.loadSprite("", (byte) 104, "menu_main_frame_pocket_top", archive);
          LoginPayloadFactory.field_a = WidgetStyleLayer.loadSprite("", (byte) 47, "menu_main_frame_pocket_left", archive);
          MessageDialogContent.field_T = WidgetStyleLayer.loadSprite("", (byte) 123, "menu_main_frame_pocket_right", archive);
          FullscreenFocusCanvas.field_a = DimmedPauseMenu.loadSprite(archive, -45, "", "title_corner_ball8");
          ProjectedLineSupport.field_k = DimmedPauseMenu.loadSprite(archive, obfuscationGuard ^ 101, "", "title_corner_ball9");
          IsaacCipher.field_f = NameEntryPopup.loadSpritesByName(0, "", archive, "achievements");
          for (var2_intLifetime2 = 0; IsaacCipher.field_f.length > var2_intLifetime2; var2_intLifetime2++) {
            TextInputValidator.a(IsaacCipher.field_f[var2_intLifetime2], (byte) -12);
          }
          ByteArrayNode.field_n = DimmedPauseMenu.loadSprite(archive, 99, "", "achievement_highlight_hover");
          Base37Support.field_g = DimmedPauseMenu.loadSprite(archive, 109, "", "achievement_highlight_selected");
          ProjectedLineSupport.field_m = DimmedPauseMenu.loadSprite(archive, -10, "", "title_pool_logo_withalpha");
          var11 = RankingsScreen.a(archive, 3812, "gradient_arrow_left", "");
          var25 = var11.field_i;
          var23 = new int[var25.length];
          var13 = var23;
          var4_ref_int__ = var13;
          for (var5_int = 0; var5_int < var25.length; var5_int++) {
            var23[var5_int] = var5_int;
          }
          StrongCacheEntry.a(var25, var23, (byte) -54);
          var5 = ShotEvent.scatterByIndex(var4_ref_int__, (byte) 117, GradientPaletteSupport.buildGradientPalette(new int[]{0, 16744192, var25.length, 16777087}, obfuscationGuard ^ -126));
          var6 = ShotEvent.scatterByIndex(var4_ref_int__, (byte) 10, GradientPaletteSupport.buildGradientPalette(new int[]{0, 16776960, var25.length, 16777023}, 18));
          var7 = ShotEvent.scatterByIndex(var4_ref_int__, (byte) 7, GradientPaletteSupport.buildGradientPalette(new int[]{0, 8355711, var25.length, 16777215}, obfuscationGuard ^ 70));
          var11.field_i = var5;
          dupTemp$0 = ProxyConnectorSupport.a(2, var11);
          SupportPageLauncher.field_b = dupTemp$0;
          var14 = dupTemp$0;
          var8 = var14;
          var8.field_B = 0;
          var8.field_w = var14.field_z;
          var8.field_y = var14.field_A;
          var8.field_G = 0;
          var11.field_i = var6;
          dupTemp$1 = ProxyConnectorSupport.a(2, var11);
          HighScoreRequest.field_y = dupTemp$1;
          var15 = dupTemp$1;
          var8Lifetime1 = var15;
          var8Lifetime1.field_w = var15.field_z;
          var8Lifetime1.field_y = var15.field_A;
          var8Lifetime1.field_G = 0;
          var8Lifetime1.field_B = 0;
          var11.field_i = var7;
          dupTemp$2 = ProxyConnectorSupport.a(obfuscationGuard + 2, var11);
          ProgressBarWidget.field_T = dupTemp$2;
          var16 = dupTemp$2;
          var8Lifetime2 = var16;
          var8Lifetime2.field_G = 0;
          var8Lifetime2.field_B = 0;
          var8Lifetime2.field_w = var16.field_z;
          var8Lifetime2.field_y = var16.field_A;
          var11.flipHorizontally();
          var11.field_i = var5;
          dupTemp$3 = ProxyConnectorSupport.a(2, var11);
          CushionSegment.field_h = dupTemp$3;
          var17 = dupTemp$3;
          var8Lifetime3 = var17;
          var8Lifetime3.field_G = 0;
          var8Lifetime3.field_w = var17.field_z;
          var8Lifetime3.field_y = var17.field_A;
          var8Lifetime3.field_B = 0;
          var11.field_i = var6;
          dupTemp$4 = ProxyConnectorSupport.a(2, var11);
          PacketAvailabilitySupport.field_a = dupTemp$4;
          var18 = dupTemp$4;
          var8Lifetime4 = var18;
          var8Lifetime4.field_w = var18.field_z;
          var8Lifetime4.field_G = obfuscationGuard;
          var8Lifetime4.field_y = var18.field_A;
          var8Lifetime4.field_B = 0;
          var11.field_i = var7;
          dupTemp$5 = ProxyConnectorSupport.a(2, var11);
          ScreenProjectionSupport.field_b = dupTemp$5;
          var19 = dupTemp$5;
          var8Lifetime5 = var19;
          var8Lifetime5.field_y = var19.field_A;
          var8Lifetime5.field_B = 0;
          var8Lifetime5.field_G = 0;
          var8Lifetime5.field_w = var19.field_z;
          var2_intLifetime3 = 0;
          var3 = NetworkGameClient.a(106, archive, "titles", "");
          incrementValue$6 = var2_intLifetime3;
          var2_intLifetime3++;
          AudioService.field_a = var3[incrementValue$6];
          incrementValue$7 = var2_intLifetime3;
          var2_intLifetime3++;
          ScrollPaneWithFooter.field_Pb = var3[incrementValue$7];
          incrementValue$8 = var2_intLifetime3;
          var2_intLifetime3++;
          HighscoresScreen.field_M = var3[incrementValue$8];
          incrementValue$9 = var2_intLifetime3;
          var2_intLifetime3++;
          AimTarget.field_i = var3[incrementValue$9];
          incrementValue$10 = var2_intLifetime3;
          var2_intLifetime3++;
          VerticalScrollbar.field_Wb = var3[incrementValue$10];
          incrementValue$11 = var2_intLifetime3;
          var2_intLifetime3++;
          LobbyPlayer.field_Lb = var3[incrementValue$11];
          incrementValue$12 = var2_intLifetime3;
          var2_intLifetime3++;
          ChatMessageLine.field_w = var3[incrementValue$12];
          incrementValue$13 = var2_intLifetime3;
          var2_intLifetime3++;
          FreePlayRules.field_k = var3[incrementValue$13];
          incrementValue$14 = var2_intLifetime3;
          var2_intLifetime3++;
          DialogLayer.field_Q = var3[incrementValue$14];
          BeveledFrameSpriteFactory.field_f = WidgetStyleLayer.loadSprite("", (byte) 84, "side_power_bar", archive);
          LimitedRandomAccessFile.field_c = WidgetStyleLayer.loadSprite("", (byte) 94, "side_power_bar_fill", archive);
          AchievementNotice.field_n = WidgetStyleLayer.loadSprite("", (byte) 102, "top_bar_inner", archive);
          Js5Transport.field_q = WidgetStyleLayer.loadSprite("", (byte) 115, "top_bar", archive);
          ClassicBallSkin.field_n = WidgetStyleLayer.loadSprite("", (byte) 80, "top_bar_ball_open", archive);
          Quaternion.field_l = NameEntryPopup.loadSpritesByName(0, "", archive, "hud_chat_tab_frame_empty");
          DimmedPauseMenu.field_O = NameEntryPopup.loadSpritesByName(0, "", archive, "hud_chat_tab_frame");
          LogoFinalFrameLoader.field_d = WidgetStyleLayer.loadSprite("", (byte) 95, "hud_chat_star", archive);
          var2_intLifetime4 = CollisionContact.field_h.stringWidth(UsernameAvailabilityValidator.chatButton);
          GradientPaletteSupport.field_e = new Sprite(var2_intLifetime4, CollisionContact.field_h.maxAscent + CollisionContact.field_h.maxDescent + 1);
          GradientPaletteSupport.field_e.bindAsRenderTarget();
          CollisionContact.field_h.drawLeft(UsernameAvailabilityValidator.chatButton, 0, CollisionContact.field_h.maxAscent, 16777215, 1);
          MenuScreenBase.field_e = new Sprite(LogoFinalFrameLoader.field_d.field_z + GradientPaletteSupport.field_e.field_z + 2, GradientPaletteSupport.field_e.field_A);
          MenuScreenBase.field_e.bindAsRenderTarget();
          CollisionContact.field_h.drawLeft(UsernameAvailabilityValidator.chatButton, 0, CollisionContact.field_h.maxAscent, 16777215, 1);
          LogoFinalFrameLoader.field_d.draw(2 + var2_intLifetime4, MenuScreenBase.field_e.field_A - LogoFinalFrameLoader.field_d.field_A >> 1);
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          CompressedContainerSupport.field_a = WidgetStyleLayer.loadSprite("", (byte) 60, "slider", archive);
          WidgetStyleLayer.loadSprite("", (byte) 35, "flash_foul", archive);
          WidgetStyleLayer.loadSprite("", (byte) 91, "hud_hbar_inner", archive);
          DebouncedValidationProvider.field_b = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "hud_hbar_frame"), (byte) -29);
          MouseWheelInput.field_a = RankingsBufferSupport.alignPanelEdgeSprites(NameEntryPopup.loadSpritesByName(0, "", archive, "hud_vbar_frame"), (byte) -29);
          DateInputWidget.field_Q = NameEntryPopup.loadSpritesByName(0, "", archive, "top_bar_frame");
          RasterBuffer.field_d = WidgetStyleLayer.loadSprite("", (byte) 73, "icon_break", archive);
          BeveledFrameSpriteFactory.field_a = WidgetStyleLayer.loadSprite("", (byte) 73, "icon_ball_in_hand", archive);
          WidgetStyleLayer.loadSprite("", (byte) 98, "icon_extra_shot", archive);
          LoginTextSupport.field_e = WidgetStyleLayer.loadSprite("", (byte) 101, "icon_extra_visit", archive);
          TableScene.field_D = WidgetStyleLayer.loadSprite("", (byte) 90, "icon_snookered", archive);
          SpriteResourceSupport.field_c = new Sprite[4];
          SpriteResourceSupport.field_c[0] = WidgetStyleLayer.loadSprite("", (byte) 108, "menu_eightball", archive);
          SpriteResourceSupport.field_c[1] = WidgetStyleLayer.loadSprite("", (byte) 107, "menu_nineball", archive);
          SpriteResourceSupport.field_c[2] = WidgetStyleLayer.loadSprite("", (byte) 63, "menu_killer", archive);
          SpriteResourceSupport.field_c[3] = WidgetStyleLayer.loadSprite("", (byte) 112, "menu_freeplay", archive);
          var20 = NameEntryPopup.loadSpritesByName(0, "", archive, "tutorial_text_box");
          SlidingPanelSupport.field_e = new Sprite[]{new Sprite(0, var20[0].field_y), var20[0], new Sprite(0, var20[0].field_y), new Sprite(0, var20[1].field_y), var20[1], new Sprite(0, var20[1].field_y), new Sprite(0, var20[2].field_y), var20[2], new Sprite(0, var20[2].field_y)};
          TransformRotationSupport.field_e = NameEntryPopup.loadSpritesByName(0, "", archive, "playerlist_button");
          PolarObject.field_d = NameEntryPopup.loadSpritesByName(0, "", archive, "tutorial_controls");
          VertexTransformSupport.field_b = WidgetStyleLayer.loadSprite("", (byte) 52, "tutorial_box_progress", archive);
          AccountCreationForm.field_Z = ArchiveRequest.a(archive, "", -24155, "controls");
          LoginPayloadFactory.field_d = new int[AccountCreationForm.field_Z.length];
          TextLayout.field_f = 0;
          for (var4 = 0; AccountCreationForm.field_Z.length > var4; var4++) {
            var21 = AccountCreationForm.field_Z[var4];
            var21.trimX = 0;
            var21.fullHeight = var21.height;
            var21.fullWidth = var21.width;
            var21.trimY = 0;
            LoginPayloadFactory.field_d[var4] = var21.fullHeight + CollisionContact.field_h.maxAscent - CollisionContact.field_h.maxDescent >> 1;
            if (TextLayout.field_f < var21.height) {
              TextLayout.field_f = var21.height;
            }
          }
          FontPaletteSupport.buildFontColorPalettes((byte) 17);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cf.L(" + obfuscationGuard + ',' + (archive != null ? "{...}" : "null") + ')');
        }
    }

    private final PcmSample getVorbisSample(int[] param0, int param1, int param2, int param3) {
        PcmSample stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        PcmSample stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisSample var9 = null;
        int var10 = 0;
        PcmSample var8Lifetime1;
        try {
          var5_int = (param2 >>> 12 | (param2 & -1610608641) << 4) ^ param3;
          var5_int = var5_int | param2 << 16;
          var6 = 4294967296L ^ (long)var5_int;
          var8 = (PcmSample) (this.field_f.get(false, var6));
          if (var8 != null) {
            stackIn_2_0 = var8;
            return stackIn_2_0;
          }
          if (param0 != null &&
            param0[0] <= 0) {
            return null;
          }
          var10 = -125 % ((param1 - 64) / 36);
          var9 = (VorbisSample) (this.field_e.get(false, var6));
          if (var9 == null) {
            var9 = VorbisSample.load(this.field_d, param2, param3);
            if (var9 == null) {
              return null;
            }
            this.field_e.put((byte) -128, var9, var6);
          }
          var8Lifetime1 = var9.decodeToPcm(param0);
          if (var8Lifetime1 == null) {
            stackIn_14_0 = null;
            return (PcmSample) (stackIn_14_0);
          }
          var9.unlink((byte) -117);
          this.field_f.put((byte) -128, var8Lifetime1, var6);
          stackIn_16_0 = var8Lifetime1;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("cf.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final PcmSample getSynthesizedSample(boolean param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        SoundEffect var9 = null;
        PcmSample var10 = null;
        PcmSample stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        PcmSample stackIn_10_0 = null;
        PcmSample stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = param2 ^ (param1 >>> 12 | (param1 & 1879052287) << 4);
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) (this.field_f.get(false, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          if (!param0) {
            stackIn_10_0 = (PcmSample) null;
            return stackIn_10_0;
          }
          var9 = SoundEffect.load(this.field_h, param1, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.toPcmSample();
          var8Lifetime1 = var10;
          this.field_f.put((byte) -126, var8Lifetime1, var6);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_n.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final PcmSample getVorbisSound(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        String var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var5 = (String) null;
            this.getVorbisSound((String) null, false, (String) null);
          }
          stackIn_3_0 = this.getVorbisSampleByName(param2, param0, (int[]) null, (byte) 126);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cf.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final PcmSample getVorbisSampleByName(String param0, String param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_d.getGroupId(param0, -1);
          if (var5_int < 0) {
            return null;
          }
          var6 = -114 % ((4 - param3) / 60);
          var7 = this.field_d.getFileId(var5_int, 0, param1);
          if (var7 < 0) {
            return null;
          }
          stackIn_7_0 = this.getVorbisSample(param2, -50, var5_int, var7);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("cf.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final PcmSample getSynthesizedSoundByGroup(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_h.getGroupCount(param2)) {
            stackIn_3_0 = this.getSynthesizedSample(true, 0, param1, param0);
            return stackIn_3_0;
          }
          if (1 != this.field_h.getFileCount(false, param1)) {
            throw new RuntimeException();
          }
          stackIn_6_0 = this.getSynthesizedSample(true, param1, 0, param0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cf.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void sleepMillis(int obfuscationGuard, long milliseconds) {
        if (0L >= milliseconds) {
          return;
        }
        if (obfuscationGuard >= -77) {
          tutorialNineBallBreak = (String) null;
        }
        if (0L == milliseconds % 10L) {
          Bzip2DecoderState.a(milliseconds - 1L, (byte) 104);
          Bzip2DecoderState.a(1L, (byte) 104);
        } else {
          Bzip2DecoderState.a(milliseconds, (byte) 104);
        }
    }

    final PcmSample getSynthesizedSound(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        String var5 = null;
        PcmSample stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 120) {
            var5 = (String) null;
            this.getVorbisSound((String) null, true, (String) null);
          }
          stackIn_3_0 = this.getSynthesizedSampleByName(param0, (byte) 18, (int[]) null, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("cf.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int[] createRotationTransform(int param0, boolean param1, int param2) {
        int var3 = EightBallRules.sineLookup((byte) -123, param2);
        int var4 = UiComponentNode.sineFixed(param2, (byte) -116);
        int var5 = EightBallRules.sineLookup((byte) -124, param0);
        int var6 = UiComponentNode.sineFixed(param0, (byte) -89);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        if (param1) {
          return (int[]) null;
        }
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    SoundCache(ResourceArchive param0, ResourceArchive param1) {
        this.field_e = new IterableNodeHashTable(256);
        this.field_f = new IterableNodeHashTable(256);
        try {
          this.field_d = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "cf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final PcmSample getVorbisSoundByGroup(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_7_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_d.getGroupCount(-1) == 1) {
            stackIn_3_0 = this.getVorbisSample(param0, 127, 0, param2);
            return stackIn_3_0;
          }
          if (this.field_d.getFileCount(false, param2) == 1) {
            stackIn_7_0 = this.getVorbisSample(param0, 3, param2, 0);
            return stackIn_7_0;
          }
          if (param1 != 6789) {
            this.field_d = (ResourceArchive) null;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("cf.I(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        loadingExtradata = "Loading extra data";
        tutorialNineBallBreak = "Now let's \"break\": Shoot the cue ball at the rack (the triangle of balls) now. Aim for the 1 ball.";
        fsAcceptCountdownPl = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_g = new int[64];
    }
}
