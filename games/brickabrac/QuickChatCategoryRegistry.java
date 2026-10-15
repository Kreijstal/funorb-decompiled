/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryRegistry {
    static String field_e;
    private WeightedLruCache definitions;
    static AppletGameShell field_f;
    static int field_b;
    static HuffmanCodec textHuffman;
    private ResourceArchive standardArchive;
    private ResourceArchive extendedArchive;

    final static RasterCacheSurface a(int param0, int param1, int param2, NodeDeque param3) {
        Object var4 = null;
        RasterCacheSurface var5 = null;
        NodeDeque var6 = null;
        Object stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = null;
          if (param0 != 0) {
            var6 = (NodeDeque) null;
            QuickChatCategoryRegistry.a(8, 113, -81, (NodeDeque) null);
          }
          var5 = (RasterCacheSurface) (param3.first(-15));
          while (var5 != null) {
            if (!var5.matchesCacheKeys((byte) -84, param1, param2)) {
              var5 = (RasterCacheSurface) (param3.next((byte) 116));
              continue;
            }
            var4 = var5;
            break;
          }
          if (var4 == null) {
            var4 = (RasterCacheSurface) (param3.removeLast(127));
          }
          param3.addFirst(true, (IntrusiveNode) (var4));
          stackIn_11_0 = var4;
          return (RasterCacheSurface) (stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("so.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = 22 % ((param0 - 19) / 35);
        textHuffman = null;
        field_e = null;
    }

    final static int a(byte param0) {
        if (param0 != -35) {
          return 43;
        }
        return gr.pointerIdleTicks;
    }

    final QuickChatCategoryDefinition getDefinition(int categoryId, byte obfuscationGuard) {
        byte[] data = null;
        QuickChatCategoryDefinition definition = (QuickChatCategoryDefinition) (this.definitions.get((long)categoryId, true));
        if (definition != null) {
          return definition;
        }
        if (categoryId < 32768) {
          data = this.standardArchive.takeFile(categoryId, 0, 4);
        } else {
          data = this.extendedArchive.takeFile(32767 & categoryId, 0, 4);
        }
        definition = new QuickChatCategoryDefinition();
        if (data != null) {
          definition.decode(new PacketBuffer(data), -29539);
        }
        if (categoryId >= 32768) {
          definition.markExtendedLinks((byte) -124);
        }
        int unusedGuardRemainder = -120 % ((obfuscationGuard - 22) / 49);
        this.definitions.put(72, definition, (long)categoryId);
        return definition;
    }

    final static void a(ResourceArchive param0, ResourceArchive param1, ResourceArchive param2, int param3, ResourceArchive param4) {
        int var7_int = 0;
        RgbSprite dupTemp$0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        RgbSprite[] var7 = null;
        Object var8 = null;
        Object var9 = null;
        int var10_int = 0;
        RgbSprite var10 = null;
        int var11 = 0;
        RgbSprite var11_ref_jp = null;
        int var12 = 0;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        IndexedSprite[] var16 = null;
        byte[] var17 = null;
        IndexedSprite[] var18 = null;
        RgbSprite var19 = null;
        RgbSprite var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var5Lifetime1;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var10_intLifetime3;
        int var10_intLifetime4;
        int var10_intLifetime5;
        int var10_intLifetime6;
        int var10_intLifetime7;
        int var10_intLifetime8;
        int var10_intLifetime9;
        int var10_intLifetime10;
        int var10_intLifetime11;
        int var10_intLifetime12;
        int var10_intLifetime13;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          RankingsScreen.field_t = uo.loadIndexedSpriteByName((byte) 29, param0, "splash", "basic");
          er.field_b = pl.loadRgbSpriteByName("basic", "lobby_game_logo", (byte) 110, param0);
          var21 = param2.takeFileByName(-86, "basic", "gamefont");
          var15 = var21;
          var13 = var15;
          var5 = var13;
          var16 = PacketBuffer.a("basic", param0, "gamefont", param3 - 946744493);
          ConstructionBackground.a(param3 ^ 29068, var21, 1);
          LabeledWidget.field_O = IndexedSpriteGeometry.a(0, var21, 0, var16, 0, 1);
          LabeledWidget.field_O.palettes = ReflectionCheck.field_n;
          ContextActionController.field_g = IndexedSpriteGeometry.a(2, var21, 0, var16, 0, 1);
          ContextActionController.field_g.palettes = ReflectionCheck.field_n;
          var22 = param4.takeFileByName(86, "kartika13", "");
          var17 = var22;
          var14 = var17;
          var5Lifetime1 = var14;
          var18 = PacketBuffer.a("kartika13", param1, "", -946715356);
          PasswordFieldRenderer.field_D = IndexedSpriteGeometry.a(0, var22, 0, var18, 0, 1);
          PasswordFieldRenderer.field_D.palettes = ReflectionCheck.field_n;
          ce.field_e = IndexedSpriteGeometry.a(1, var22, 0, var18, 0, 1);
          ce.field_e.palettes = ReflectionCheck.field_n;
          gj.field_c = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "menu_overlays", param0, (byte) -8);
          for (var7_int = 0; gj.field_c.length > var7_int; var7_int++) {
            gj.field_c[var7_int] = GameConnectionShell.a(gj.field_c[var7_int], 1);
            if (gj.field_c[var7_int].width == 0 ||
              gj.field_c[var7_int].height == 0) {
              gj.field_c[var7_int] = null;
            }
          }
          LoginCredentialKind.field_h = AgeValidator.a("frame", "basic", param0, -122);
          t.field_d = AgeValidator.a("frame_track", "basic", param0, -128);
          t.field_d[4] = null;
          var7 = LoginCredentialKind.field_h;
          var7[4] = null;
          pl.loadRgbSpriteByName("basic", "frame_bracket", (byte) 106, param0);
          AchievementBrowserScreen.field_A = AgeValidator.a("button_frame", "basic", param0, -91);
          Ball.field_G = AgeValidator.a("button_raised", "basic", param0, 103);
          IntArrayRequest.field_k = AgeValidator.a("button_depressed", "basic", param0, -104);
          IntrusiveHashTable.achievementSourceIcons = PacketBuffer.a("basic", param0, "achievements_large", -946715356);
          LevelCompleteScreen.field_F = pl.loadRgbSpriteByName("basic", "unachieved", (byte) 97, param1);
          DelayedPacket.field_p = pl.loadRgbSpriteByName("basic", "orbcoin", (byte) 122, param1);
          pl.loadRgbSpriteByName("basic", "locked", (byte) -45, param1);
          FireworkBurst.achievementOrbCoinSprite = new RgbSprite(32, 32);
          FireworkBurst.achievementOrbCoinSprite.bindRasterTarget();
          DelayedPacket.field_p.c(0, 0, 32, 32);
          BallPulseEffect.framebuffer.bindRaster((byte) 91);
          DelayedPacket.field_p = null;
          var19 = new RgbSprite(LevelCompleteScreen.field_F.canvasWidth / 4, LevelCompleteScreen.field_F.canvasHeight / 4);
          var19.bindRasterTarget();
          LevelCompleteScreen.field_F.e(0, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 113);
          ToggleButtonWidget.field_L = PlayerInputBatch.a(-12, var19, 8, 9838226);
          ValidationStatus.field_c = PlayerInputBatch.a(-12, var19, 12, 9838226);
          var8 = null;
          AchievementSubmission.field_l = new RgbSprite[IntrusiveHashTable.achievementSourceIcons.length];
          TranslucentNineSliceFrame.field_h = new RgbSprite[IntrusiveHashTable.achievementSourceIcons.length];
          var20 = new RgbSprite(LevelCompleteScreen.field_F.canvasWidth / 4, LevelCompleteScreen.field_F.canvasHeight / 4);
          for (var10_int = 0; var10_int < IntrusiveHashTable.achievementSourceIcons.length; var10_int++) {
            var20.bindRasterTarget();
            Rasterizer2D.clear();
            IntrusiveHashTable.achievementSourceIcons[var10_int].drawQuarter(0, 0);
            BallPulseEffect.framebuffer.bindRaster((byte) 101);
            AchievementSubmission.field_l[var10_int] = PlayerInputBatch.a(-12, var20, 8, 9838226);
            TranslucentNineSliceFrame.field_h[var10_int] = PlayerInputBatch.a(LevelResultSubmission.a(param3, -29147), var20, 12, 9838226);
          }
          CircleBody.field_t = new RgbSprite[LegacyEmailValidationError.field_c.length][];
          var9 = null;
          for (var10_intLifetime1 = 0; LegacyEmailValidationError.field_c.length > var10_intLifetime1; var10_intLifetime1++) {
            CircleBody.field_t[var10_intLifetime1] = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, LegacyEmailValidationError.field_c[var10_intLifetime1], 2);
          }
          MenuSelection.field_k = pl.loadRgbSpriteByName("basic", "ball", (byte) 121, param0);
          Ball.field_D = pl.loadRgbSpriteByName("basic", "steelball", (byte) 98, param0);
          SingleChildWidget.field_C = PacketBuffer.a("basic", param0, "brickset", -946715356);
          MultiValueSliderRenderer.field_b = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "paddlecaps", param3 - 29135);
          GameConnectionShell.field_D = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "paddleseg", 2);
          AccountRegistrationPanel.field_R = pl.loadRgbSpriteByName("basic", "paddlecentre", (byte) 100, param0);
          TextHotspotRegion.powerUpMeterIcons = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "powerup", 2);
          LevelPackSelectScreen.powerUpMeterBarSprite = pl.loadRgbSpriteByName("basic", "powerupbar", (byte) 104, param0);
          ch.field_l = pl.loadRgbSpriteByName("basic", "heart", (byte) -108, param0);
          QuickChatHelpDialog.field_Ub = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "characters_fm", 2);
          GzipInflater.field_a = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_game", param3 - 29135);
          IntrusiveNode.gameEyeSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "eyes_game", 2);
          FullscreenFailureKind.trackHeads = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "track_heads", 2);
          ProxyAuthenticationRequiredException.smallCharacterSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "characters_small", 2);
          ScorePopup.characterHeads = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "character_heads", param3 ^ 29139);
          GameOverlayHelpers.smallLeverSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_small", 2);
          ScorePopup.chocolateSmallLeverSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_small_choc", 2);
          AccountMessageDialog.spaceSmallLeverSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_small_space", param3 ^ 29139);
          MultiValueSliderWidget.field_K = AgeValidator.a("frame_bubble", "basic", param0, -105);
          ap.field_a = pl.loadRgbSpriteByName("basic", "frame_bubble_point", (byte) -120, param0);
          ln.field_j = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "rosette_sml", param0, (byte) -8);
          IntHistoryBuffer.field_l = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "rosette_lrg", param0, (byte) -8);
          LoginMethodPreference.field_a = PacketBuffer.a("basic", param0, "podium2", -946715356);
          pl.field_f = PacketBuffer.a("basic", param0, "podium3", param3 ^ -946719499);
          BrickMotionPath.field_r = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "podium_happy", 2);
          AchievementSubmission.field_q = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "podium_sad", param3 ^ 29139);
          ValidationStatus.field_e = TextWidgetRenderer.a("basic", "congratulations", 1593955777, param0);
          TranslucentNineSliceFrame.field_m = new RgbSprite[SingleChildWidget.field_C.length];
          for (var10_intLifetime2 = 0; var10_intLifetime2 < TranslucentNineSliceFrame.field_m.length; var10_intLifetime2++) {
            TranslucentNineSliceFrame.field_m[var10_intLifetime2] = SingleChildWidget.field_C[var10_intLifetime2].toRgbSprite();
          }
          TranslucentNineSliceFrame.field_m[24].bindRasterTarget();
          Rasterizer2D.grayscaleRectangle(0, 0, Rasterizer2D.width, Rasterizer2D.height);
          ResourceArchive.field_a = new RgbSprite[TranslucentNineSliceFrame.field_m.length];
          for (var10_intLifetime3 = 0; var10_intLifetime3 < TranslucentNineSliceFrame.field_m.length; var10_intLifetime3++) {
            ResourceArchive.field_a[var10_intLifetime3] = new RgbSprite(TranslucentNineSliceFrame.field_m[var10_intLifetime3].canvasWidth / 2, TranslucentNineSliceFrame.field_m[var10_intLifetime3].canvasHeight / 2);
            ResourceArchive.field_a[var10_intLifetime3].bindRasterTarget();
            TranslucentNineSliceFrame.field_m[var10_intLifetime3 % 29].a(0, 0);
          }
          kp.field_e = new RgbSprite[MultiValueSliderRenderer.field_b.length];
          for (var10_intLifetime4 = 0; MultiValueSliderRenderer.field_b.length > var10_intLifetime4; var10_intLifetime4++) {
            kp.field_e[var10_intLifetime4] = new RgbSprite(MultiValueSliderRenderer.field_b[var10_intLifetime4].canvasWidth / 2, MultiValueSliderRenderer.field_b[var10_intLifetime4].canvasHeight / 2);
            kp.field_e[var10_intLifetime4].bindRasterTarget();
            MultiValueSliderRenderer.field_b[var10_intLifetime4].a(0, 0);
          }
          LevelPackSelectScreen.field_z = new RgbSprite[GameConnectionShell.field_D.length];
          for (var10_intLifetime5 = 0; GameConnectionShell.field_D.length > var10_intLifetime5; var10_intLifetime5++) {
            LevelPackSelectScreen.field_z[var10_intLifetime5] = new RgbSprite(GameConnectionShell.field_D[var10_intLifetime5].canvasWidth / 2, GameConnectionShell.field_D[var10_intLifetime5].canvasHeight / 2);
            LevelPackSelectScreen.field_z[var10_intLifetime5].bindRasterTarget();
            GameConnectionShell.field_D[var10_intLifetime5].a(0, 0);
          }
          WidgetTextLayout.field_j = new RgbSprite(AccountRegistrationPanel.field_R.canvasWidth / 2, AccountRegistrationPanel.field_R.canvasHeight / 2);
          WidgetTextLayout.field_j.bindRasterTarget();
          AccountRegistrationPanel.field_R.a(0, 0);
          PlayerInputBatch.field_i = new RgbSprite(MenuSelection.field_k.canvasWidth / 2, MenuSelection.field_k.canvasHeight / 2);
          PlayerInputBatch.field_i.bindRasterTarget();
          MenuSelection.field_k.a(0, 0);
          UiComponent.field_ib = new RgbSprite(Ball.field_D.canvasWidth / 2, Ball.field_D.canvasHeight / 2);
          UiComponent.field_ib.bindRasterTarget();
          Ball.field_D.a(0, 0);
          ch.field_k = new RgbSprite[TextHotspotRegion.powerUpMeterIcons.length];
          if (param3 != 29137) {
            QuickChatCategoryRegistry.a((byte) -25);
          }
          for (var10_intLifetime6 = 0; ch.field_k.length > var10_intLifetime6; var10_intLifetime6++) {
            ch.field_k[var10_intLifetime6] = new RgbSprite(TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].canvasWidth / 2, TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].canvasHeight / 2);
            ch.field_k[var10_intLifetime6].bindRasterTarget();
            TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].a(0, 0);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 79);
          for (var10_intLifetime7 = 0; var10_intLifetime7 < ln.field_j.length; var10_intLifetime7++) {
            ln.field_j[var10_intLifetime7].trimTransparentBorders();
          }
          for (var10_intLifetime8 = 0; IntHistoryBuffer.field_l.length > var10_intLifetime8; var10_intLifetime8++) {
            IntHistoryBuffer.field_l[var10_intLifetime8].trimTransparentBorders();
          }
          TextWidgetRenderer.field_p = pl.loadRgbSpriteByName("basic", "character_menu", (byte) -62, param0);
          TranslucentNineSliceFrame.field_j = pl.loadRgbSpriteByName("basic", "character_menu_eyes", (byte) -120, param0);
          gr.field_d = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_menu", 2);
          nl.field_b = TextWidgetRenderer.a("basic", "logo", 1593955777, param0);
          PasswordValidator.field_l = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "sliders", 2);
          SocialListEntry.field_Vb = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "arrow_level", param3 ^ 29139);
          TranslucentNineSliceFrame.field_l = new RgbSprite[SocialListEntry.field_Vb.length];
          for (var10_intLifetime9 = 0; SocialListEntry.field_Vb.length > var10_intLifetime9; var10_intLifetime9++) {
            dupTemp$0 = SocialListEntry.field_Vb[var10_intLifetime9].copy();
            TranslucentNineSliceFrame.field_l[var10_intLifetime9] = dupTemp$0;
            var11_ref_jp = dupTemp$0;
            var11_ref_jp.rotateCounterclockwise();
          }
          un.field_e = new IndexedSprite[7];
          un.field_e[0] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_right", "basic");
          un.field_e[1] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_left", "basic");
          un.field_e[2] = uo.loadIndexedSpriteByName((byte) 29, param0, "p1_key_launch", "basic");
          un.field_e[3] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_right", "basic");
          un.field_e[4] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_left", "basic");
          un.field_e[5] = uo.loadIndexedSpriteByName((byte) 29, param0, "p2_key_launch", "basic");
          un.field_e[6] = uo.loadIndexedSpriteByName((byte) 29, param0, "key_enter", "basic");
          nd.field_f = new int[58];
          for (var10_intLifetime10 = 0; nd.field_f.length > var10_intLifetime10; var10_intLifetime10++) {
            nd.field_f[var10_intLifetime10] = 14;
          }
          UnderwaterBackground.field_u = HotspotTextWidget.a(2, BirthDateEntryPanel.field_N, -1);
          ClientException.field_b = HotspotTextWidget.a(2, SpaceBackground.field_s.toUpperCase(), -1);
          ed.countdownSprites = new RgbSprite[3];
          for (var10_intLifetime11 = 0; var10_intLifetime11 < ed.countdownSprites.length; var10_intLifetime11++) {
            ed.countdownSprites[var10_intLifetime11] = OptionsScreen.a(2, 2, Integer.toString(-var10_intLifetime11 + 3), true);
          }
          BoundedFile.field_a = new RgbSprite[FullscreenFailureKind.trackHeads.length];
          for (var10_intLifetime12 = 0; BoundedFile.field_a.length > var10_intLifetime12; var10_intLifetime12++) {
            BoundedFile.field_a[var10_intLifetime12] = PlayerInputBatch.a(LevelResultSubmission.a(param3, -29147), FullscreenFailureKind.trackHeads[var10_intLifetime12], 14, 16755200);
          }
          MusicVoiceMixer.field_n = new RgbSprite[FullscreenFailureKind.trackHeads.length];
          for (var10_intLifetime13 = 0; var10_intLifetime13 < MusicVoiceMixer.field_n.length; var10_intLifetime13++) {
            MusicVoiceMixer.field_n[var10_intLifetime13] = DelayedPacket.a(FullscreenFailureKind.trackHeads[var10_intLifetime13], 20, LevelResultSubmission.a(param3, -13351));
          }
          AlignedIconLabel.field_Sb = ap.field_a.copy();
          AlignedIconLabel.field_Sb.rotateCounterclockwise();
          MultiValueSliderRenderer.field_e = pl.loadRgbSpriteByName("basic", "shutter", (byte) 110, param0);
          RankingsRequest.field_o = new RgbSprite(MultiValueSliderRenderer.field_e.canvasWidth / 2, MultiValueSliderRenderer.field_e.canvasHeight / 2);
          RankingsRequest.field_o.bindRasterTarget();
          MultiValueSliderRenderer.field_e.a(0, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 118);
          var10 = pl.loadRgbSpriteByName("basic", "flame", (byte) 107, param0);
          hc.field_a = new RgbSprite[2][4];
          JungleBackground.field_v = new RgbSprite[2][4];
          for (var11 = 0; var11 < 4; var11++) {
            JungleBackground.field_v[0][var11] = new RgbSprite(var10.canvasWidth - var11, var10.canvasHeight);
            JungleBackground.field_v[0][var11].bindRasterTarget();
            var10.a(0, 0, -var11 + var10.canvasWidth, var10.canvasHeight);
            JungleBackground.field_v[1][var11] = JungleBackground.field_v[0][var11].copyFlippedHorizontal();
            hc.field_a[0][var11] = new RgbSprite(JungleBackground.field_v[0][var11].canvasWidth / 2, JungleBackground.field_v[0][var11].canvasHeight / 2);
            hc.field_a[0][var11].bindRasterTarget();
            var10.a(0, 0, JungleBackground.field_v[0][var11].canvasWidth / 2, JungleBackground.field_v[0][var11].canvasHeight / 2);
            hc.field_a[1][var11] = hc.field_a[0][var11].copyFlippedHorizontal();
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 127);
          SaveResultsPromptScreen.packCardIcons = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "expansion_icons", param0, (byte) -8);
          ArchiveNetworkRequest.packSelectorIcons = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime1 = 0; var11Lifetime1 < SaveResultsPromptScreen.packCardIcons.length; var11Lifetime1++) {
            ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1] = new RgbSprite(SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasWidth / 2, SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasHeight / 2);
            IndexedSpriteGeometry.pushSpriteRaster(-59, ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1]);
            SaveResultsPromptScreen.packCardIcons[var11Lifetime1].a(0, 0);
            sc.popRaster(-89);
          }
          AlternateNumericLoginCredentials.field_r = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime2 = 0; SaveResultsPromptScreen.packCardIcons.length > var11Lifetime2; var11Lifetime2++) {
            AlternateNumericLoginCredentials.field_r[var11Lifetime2] = DelayedPacket.a(ArchiveNetworkRequest.packSelectorIcons[var11Lifetime2], 20, -17912);
          }
          IntrusiveHashIterator.field_f = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime3 = 0; var11Lifetime3 < SaveResultsPromptScreen.packCardIcons.length; var11Lifetime3++) {
            IntrusiveHashIterator.field_f[var11Lifetime3] = PlayerInputBatch.a(LevelResultSubmission.a(param3, -29147), ArchiveNetworkRequest.packSelectorIcons[var11Lifetime3], 14, 16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_67_0 = var5_ref;
          stackIn_67_1 = new StringBuilder().append("so.D(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param2 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(')').toString());
        }
    }

    QuickChatCategoryRegistry(int unusedOption, ResourceArchive standardArchive, ResourceArchive extendedArchive) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String standardArchiveSummary = null;
        StringBuilder extendedContextBuilder = null;
        String extendedArchiveSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        this.definitions = new WeightedLruCache(64);
        try {
          this.extendedArchive = extendedArchive;
          this.standardArchive = standardArchive;
          if (this.standardArchive != null) {
            this.standardArchive.getFileCapacity(-123, 0);
          }
          if (this.extendedArchive != null) {
            this.extendedArchive.getFileCapacity(-113, 0);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("so.<init>(").append(unusedOption).append(',');
          if (standardArchive == null) {
            standardArchiveSummary = "null";
          } else {
            standardArchiveSummary = "{...}";
          }
          extendedContextBuilder = ((StringBuilder) (Object) contextBuilder).append(standardArchiveSummary).append(',');
          if (extendedArchive == null) {
            extendedArchiveSummary = "null";
          } else {
            extendedArchiveSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) extendedContextBuilder).append(extendedArchiveSummary).append(')').toString());
        }
    }

    static {
        field_e = "Rating";
        field_f = null;
    }
}
