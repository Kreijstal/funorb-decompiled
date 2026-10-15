/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCategoryRegistry {
    static String field_e;
    private WeightedLruCache definitions;
    static AppletGameShell field_f;
    static int fullscreenDialogButtonBaseline;
    static HuffmanCodec textHuffman;
    private ResourceArchive standardArchive;
    private ResourceArchive extendedArchive;

    final static RasterCacheSurface selectCachedSurface(int obfuscationGuard, int cacheKeyOne, int cacheKeyTwo, NodeDeque pool) {
        Object selectedOrFailure = null;
        RasterCacheSurface candidate = null;
        NodeDeque unusedPool = null;
        Object selectedSurface = null;
        Object failureContext = null;
        StringBuilder contextBuilder = null;
        String poolSummary = null;
        RuntimeException caughtFailure = null;
        try {
          selectedOrFailure = null;
          if (obfuscationGuard != 0) {
            unusedPool = (NodeDeque) null;
            QuickChatCategoryRegistry.selectCachedSurface(8, 113, -81, (NodeDeque) null);
          }
          candidate = (RasterCacheSurface) (pool.first(-15));
          while (candidate != null) {
            if (!candidate.matchesCacheKeys((byte) -84, cacheKeyOne, cacheKeyTwo)) {
              candidate = (RasterCacheSurface) (pool.next((byte) 116));
              continue;
            }
            selectedOrFailure = candidate;
            break;
          }
          if (selectedOrFailure == null) {
            selectedOrFailure = (RasterCacheSurface) (pool.removeLast(127));
          }
          pool.addFirst(true, (IntrusiveNode) (selectedOrFailure));
          selectedSurface = selectedOrFailure;
          return (RasterCacheSurface) (selectedSurface);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          selectedOrFailure = caughtFailure;
          failureContext = selectedOrFailure;
          contextBuilder = new StringBuilder().append("so.B(").append(obfuscationGuard).append(',').append(cacheKeyOne).append(',').append(cacheKeyTwo).append(',');
          if (pool == null) {
            poolSummary = "null";
          } else {
            poolSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (failureContext), ((StringBuilder) (Object) contextBuilder).append(poolSummary).append(')').toString());
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
        return GameplaySpriteHelpers.pointerIdleTicks;
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
          RankingsScreen.field_t = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "splash", "basic");
          IntegerRemainderHelpers.lobbyGameLogoSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "lobby_game_logo", (byte) 110, param0);
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
          QuickChatPopupHelpers.field_e = IndexedSpriteGeometry.a(1, var22, 0, var18, 0, 1);
          QuickChatPopupHelpers.field_e.palettes = ReflectionCheck.field_n;
          TableQuickChatHelpers.field_c = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "menu_overlays", param0, (byte) -8);
          for (var7_int = 0; TableQuickChatHelpers.field_c.length > var7_int; var7_int++) {
            TableQuickChatHelpers.field_c[var7_int] = GameConnectionShell.a(TableQuickChatHelpers.field_c[var7_int], 1);
            if (TableQuickChatHelpers.field_c[var7_int].width == 0 ||
              TableQuickChatHelpers.field_c[var7_int].height == 0) {
              TableQuickChatHelpers.field_c[var7_int] = null;
            }
          }
          LoginCredentialKind.field_h = AgeValidator.a("frame", "basic", param0, -122);
          CanvasInputCleanup.field_d = AgeValidator.a("frame_track", "basic", param0, -128);
          CanvasInputCleanup.field_d[4] = null;
          var7 = LoginCredentialKind.field_h;
          var7[4] = null;
          SpriteInputHelpers.loadRgbSpriteByName("basic", "frame_bracket", (byte) 106, param0);
          AchievementBrowserScreen.field_A = AgeValidator.a("button_frame", "basic", param0, -91);
          Ball.field_G = AgeValidator.a("button_raised", "basic", param0, 103);
          IntArrayRequest.field_k = AgeValidator.a("button_depressed", "basic", param0, -104);
          IntrusiveHashTable.achievementSourceIcons = PacketBuffer.a("basic", param0, "achievements_large", -946715356);
          LevelCompleteScreen.field_F = SpriteInputHelpers.loadRgbSpriteByName("basic", "unachieved", (byte) 97, param1);
          DelayedPacket.field_p = SpriteInputHelpers.loadRgbSpriteByName("basic", "orbcoin", (byte) 122, param1);
          SpriteInputHelpers.loadRgbSpriteByName("basic", "locked", (byte) -45, param1);
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
          MenuSelection.fullBallSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "ball", (byte) 121, param0);
          Ball.fullSteelBallSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "steelball", (byte) 98, param0);
          SingleChildWidget.field_C = PacketBuffer.a("basic", param0, "brickset", -946715356);
          MultiValueSliderRenderer.fullPaddleCapSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "paddlecaps", param3 - 29135);
          GameConnectionShell.fullPaddleSegmentSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "paddleseg", 2);
          AccountRegistrationPanel.fullPaddleCenterSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "paddlecentre", (byte) 100, param0);
          TextHotspotRegion.powerUpMeterIcons = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "powerup", 2);
          LevelPackSelectScreen.powerUpMeterBarSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "powerupbar", (byte) 104, param0);
          SocialListResponseHelpers.field_l = SpriteInputHelpers.loadRgbSpriteByName("basic", "heart", (byte) -108, param0);
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
          CanvasInputHelpers.field_a = SpriteInputHelpers.loadRgbSpriteByName("basic", "frame_bubble_point", (byte) -120, param0);
          BytePayloadSubmission.smallRosetteSprites = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "rosette_sml", param0, (byte) -8);
          IntHistoryBuffer.largeRosetteSprites = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "rosette_lrg", param0, (byte) -8);
          LoginMethodPreference.field_a = PacketBuffer.a("basic", param0, "podium2", -946715356);
          SpriteInputHelpers.field_f = PacketBuffer.a("basic", param0, "podium3", param3 ^ -946719499);
          BrickMotionPath.field_r = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "podium_happy", 2);
          AchievementSubmission.field_q = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "podium_sad", param3 ^ 29139);
          ValidationStatus.field_e = TextWidgetRenderer.a("basic", "congratulations", 1593955777, param0);
          TranslucentNineSliceFrame.fullBrickSprites = new RgbSprite[SingleChildWidget.field_C.length];
          for (var10_intLifetime2 = 0; var10_intLifetime2 < TranslucentNineSliceFrame.fullBrickSprites.length; var10_intLifetime2++) {
            TranslucentNineSliceFrame.fullBrickSprites[var10_intLifetime2] = SingleChildWidget.field_C[var10_intLifetime2].toRgbSprite();
          }
          TranslucentNineSliceFrame.fullBrickSprites[24].bindRasterTarget();
          Rasterizer2D.grayscaleRectangle(0, 0, Rasterizer2D.width, Rasterizer2D.height);
          ResourceArchive.halfBrickSprites = new RgbSprite[TranslucentNineSliceFrame.fullBrickSprites.length];
          for (var10_intLifetime3 = 0; var10_intLifetime3 < TranslucentNineSliceFrame.fullBrickSprites.length; var10_intLifetime3++) {
            ResourceArchive.halfBrickSprites[var10_intLifetime3] = new RgbSprite(TranslucentNineSliceFrame.fullBrickSprites[var10_intLifetime3].canvasWidth / 2, TranslucentNineSliceFrame.fullBrickSprites[var10_intLifetime3].canvasHeight / 2);
            ResourceArchive.halfBrickSprites[var10_intLifetime3].bindRasterTarget();
            TranslucentNineSliceFrame.fullBrickSprites[var10_intLifetime3 % 29].drawHalfSize(0, 0);
          }
          LevelResultWireHelpers.halfPaddleCapSprites = new RgbSprite[MultiValueSliderRenderer.fullPaddleCapSprites.length];
          for (var10_intLifetime4 = 0; MultiValueSliderRenderer.fullPaddleCapSprites.length > var10_intLifetime4; var10_intLifetime4++) {
            LevelResultWireHelpers.halfPaddleCapSprites[var10_intLifetime4] = new RgbSprite(MultiValueSliderRenderer.fullPaddleCapSprites[var10_intLifetime4].canvasWidth / 2, MultiValueSliderRenderer.fullPaddleCapSprites[var10_intLifetime4].canvasHeight / 2);
            LevelResultWireHelpers.halfPaddleCapSprites[var10_intLifetime4].bindRasterTarget();
            MultiValueSliderRenderer.fullPaddleCapSprites[var10_intLifetime4].drawHalfSize(0, 0);
          }
          LevelPackSelectScreen.halfPaddleSegmentSprites = new RgbSprite[GameConnectionShell.fullPaddleSegmentSprites.length];
          for (var10_intLifetime5 = 0; GameConnectionShell.fullPaddleSegmentSprites.length > var10_intLifetime5; var10_intLifetime5++) {
            LevelPackSelectScreen.halfPaddleSegmentSprites[var10_intLifetime5] = new RgbSprite(GameConnectionShell.fullPaddleSegmentSprites[var10_intLifetime5].canvasWidth / 2, GameConnectionShell.fullPaddleSegmentSprites[var10_intLifetime5].canvasHeight / 2);
            LevelPackSelectScreen.halfPaddleSegmentSprites[var10_intLifetime5].bindRasterTarget();
            GameConnectionShell.fullPaddleSegmentSprites[var10_intLifetime5].drawHalfSize(0, 0);
          }
          WidgetTextLayout.halfPaddleCenterSprite = new RgbSprite(AccountRegistrationPanel.fullPaddleCenterSprite.canvasWidth / 2, AccountRegistrationPanel.fullPaddleCenterSprite.canvasHeight / 2);
          WidgetTextLayout.halfPaddleCenterSprite.bindRasterTarget();
          AccountRegistrationPanel.fullPaddleCenterSprite.drawHalfSize(0, 0);
          PlayerInputBatch.halfBallSprite = new RgbSprite(MenuSelection.fullBallSprite.canvasWidth / 2, MenuSelection.fullBallSprite.canvasHeight / 2);
          PlayerInputBatch.halfBallSprite.bindRasterTarget();
          MenuSelection.fullBallSprite.drawHalfSize(0, 0);
          UiComponent.halfSteelBallSprite = new RgbSprite(Ball.fullSteelBallSprite.canvasWidth / 2, Ball.fullSteelBallSprite.canvasHeight / 2);
          UiComponent.halfSteelBallSprite.bindRasterTarget();
          Ball.fullSteelBallSprite.drawHalfSize(0, 0);
          SocialListResponseHelpers.halfPowerUpSprites = new RgbSprite[TextHotspotRegion.powerUpMeterIcons.length];
          if (param3 != 29137) {
            QuickChatCategoryRegistry.a((byte) -25);
          }
          for (var10_intLifetime6 = 0; SocialListResponseHelpers.halfPowerUpSprites.length > var10_intLifetime6; var10_intLifetime6++) {
            SocialListResponseHelpers.halfPowerUpSprites[var10_intLifetime6] = new RgbSprite(TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].canvasWidth / 2, TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].canvasHeight / 2);
            SocialListResponseHelpers.halfPowerUpSprites[var10_intLifetime6].bindRasterTarget();
            TextHotspotRegion.powerUpMeterIcons[var10_intLifetime6].drawHalfSize(0, 0);
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 79);
          for (var10_intLifetime7 = 0; var10_intLifetime7 < BytePayloadSubmission.smallRosetteSprites.length; var10_intLifetime7++) {
            BytePayloadSubmission.smallRosetteSprites[var10_intLifetime7].trimTransparentBorders();
          }
          for (var10_intLifetime8 = 0; IntHistoryBuffer.largeRosetteSprites.length > var10_intLifetime8; var10_intLifetime8++) {
            IntHistoryBuffer.largeRosetteSprites[var10_intLifetime8].trimTransparentBorders();
          }
          TextWidgetRenderer.field_p = SpriteInputHelpers.loadRgbSpriteByName("basic", "character_menu", (byte) -62, param0);
          TranslucentNineSliceFrame.field_j = SpriteInputHelpers.loadRgbSpriteByName("basic", "character_menu_eyes", (byte) -120, param0);
          GameplaySpriteHelpers.menuLeverSprites = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "lever_menu", 2);
          IncomingPacketHelpers.gameLogoSprite = TextWidgetRenderer.a("basic", "logo", 1593955777, param0);
          PasswordValidator.field_l = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "sliders", 2);
          SocialListEntry.field_Vb = ActivityIndicatorWidget.loadRgbSpritesByName("basic", param0, "arrow_level", param3 ^ 29139);
          TranslucentNineSliceFrame.field_l = new RgbSprite[SocialListEntry.field_Vb.length];
          for (var10_intLifetime9 = 0; SocialListEntry.field_Vb.length > var10_intLifetime9; var10_intLifetime9++) {
            dupTemp$0 = SocialListEntry.field_Vb[var10_intLifetime9].copy();
            TranslucentNineSliceFrame.field_l[var10_intLifetime9] = dupTemp$0;
            var11_ref_jp = dupTemp$0;
            var11_ref_jp.rotateCounterclockwise();
          }
          CalendarRankingHelpers.field_e = new IndexedSprite[7];
          CalendarRankingHelpers.field_e[0] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p1_key_right", "basic");
          CalendarRankingHelpers.field_e[1] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p1_key_left", "basic");
          CalendarRankingHelpers.field_e[2] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p1_key_launch", "basic");
          CalendarRankingHelpers.field_e[3] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p2_key_right", "basic");
          CalendarRankingHelpers.field_e[4] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p2_key_left", "basic");
          CalendarRankingHelpers.field_e[5] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "p2_key_launch", "basic");
          CalendarRankingHelpers.field_e[6] = AppletResourceHelpers.loadIndexedSpriteByName((byte) 29, param0, "key_enter", "basic");
          RankingSocketHelpers.field_f = new int[58];
          for (var10_intLifetime10 = 0; RankingSocketHelpers.field_f.length > var10_intLifetime10; var10_intLifetime10++) {
            RankingSocketHelpers.field_f[var10_intLifetime10] = 14;
          }
          UnderwaterBackground.gameCompletedMessageSprite = HotspotTextWidget.a(2, BirthDateEntryPanel.field_N, -1);
          ClientException.gameOverMessageSprite = HotspotTextWidget.a(2, SpaceBackground.field_s.toUpperCase(), -1);
          IntegerBitLengthHelpers.countdownSprites = new RgbSprite[3];
          for (var10_intLifetime11 = 0; var10_intLifetime11 < IntegerBitLengthHelpers.countdownSprites.length; var10_intLifetime11++) {
            IntegerBitLengthHelpers.countdownSprites[var10_intLifetime11] = OptionsScreen.a(2, 2, Integer.toString(-var10_intLifetime11 + 3), true);
          }
          BoundedFile.field_a = new RgbSprite[FullscreenFailureKind.trackHeads.length];
          for (var10_intLifetime12 = 0; BoundedFile.field_a.length > var10_intLifetime12; var10_intLifetime12++) {
            BoundedFile.field_a[var10_intLifetime12] = PlayerInputBatch.a(LevelResultSubmission.a(param3, -29147), FullscreenFailureKind.trackHeads[var10_intLifetime12], 14, 16755200);
          }
          MusicVoiceMixer.field_n = new RgbSprite[FullscreenFailureKind.trackHeads.length];
          for (var10_intLifetime13 = 0; var10_intLifetime13 < MusicVoiceMixer.field_n.length; var10_intLifetime13++) {
            MusicVoiceMixer.field_n[var10_intLifetime13] = DelayedPacket.a(FullscreenFailureKind.trackHeads[var10_intLifetime13], 20, LevelResultSubmission.a(param3, -13351));
          }
          AlignedIconLabel.field_Sb = CanvasInputHelpers.field_a.copy();
          AlignedIconLabel.field_Sb.rotateCounterclockwise();
          MultiValueSliderRenderer.fullBoardMaskSprite = SpriteInputHelpers.loadRgbSpriteByName("basic", "shutter", (byte) 110, param0);
          RankingsRequest.halfBoardMaskSprite = new RgbSprite(MultiValueSliderRenderer.fullBoardMaskSprite.canvasWidth / 2, MultiValueSliderRenderer.fullBoardMaskSprite.canvasHeight / 2);
          RankingsRequest.halfBoardMaskSprite.bindRasterTarget();
          MultiValueSliderRenderer.fullBoardMaskSprite.drawHalfSize(0, 0);
          BallPulseEffect.framebuffer.bindRaster((byte) 118);
          var10 = SpriteInputHelpers.loadRgbSpriteByName("basic", "flame", (byte) 107, param0);
          MeshLobbyUiHelpers.halfPaddleFlameSprites = new RgbSprite[2][4];
          JungleBackground.fullPaddleFlameSprites = new RgbSprite[2][4];
          for (var11 = 0; var11 < 4; var11++) {
            JungleBackground.fullPaddleFlameSprites[0][var11] = new RgbSprite(var10.canvasWidth - var11, var10.canvasHeight);
            JungleBackground.fullPaddleFlameSprites[0][var11].bindRasterTarget();
            var10.a(0, 0, -var11 + var10.canvasWidth, var10.canvasHeight);
            JungleBackground.fullPaddleFlameSprites[1][var11] = JungleBackground.fullPaddleFlameSprites[0][var11].copyFlippedHorizontal();
            MeshLobbyUiHelpers.halfPaddleFlameSprites[0][var11] = new RgbSprite(JungleBackground.fullPaddleFlameSprites[0][var11].canvasWidth / 2, JungleBackground.fullPaddleFlameSprites[0][var11].canvasHeight / 2);
            MeshLobbyUiHelpers.halfPaddleFlameSprites[0][var11].bindRasterTarget();
            var10.a(0, 0, JungleBackground.fullPaddleFlameSprites[0][var11].canvasWidth / 2, JungleBackground.fullPaddleFlameSprites[0][var11].canvasHeight / 2);
            MeshLobbyUiHelpers.halfPaddleFlameSprites[1][var11] = MeshLobbyUiHelpers.halfPaddleFlameSprites[0][var11].copyFlippedHorizontal();
          }
          BallPulseEffect.framebuffer.bindRaster((byte) 127);
          SaveResultsPromptScreen.packCardIcons = CheckboxWidgetRenderer.loadRgbSpritesByName("basic", "expansion_icons", param0, (byte) -8);
          ArchiveNetworkRequest.packSelectorIcons = new RgbSprite[SaveResultsPromptScreen.packCardIcons.length];
          for (var11Lifetime1 = 0; var11Lifetime1 < SaveResultsPromptScreen.packCardIcons.length; var11Lifetime1++) {
            ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1] = new RgbSprite(SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasWidth / 2, SaveResultsPromptScreen.packCardIcons[var11Lifetime1].canvasHeight / 2);
            IndexedSpriteGeometry.pushSpriteRaster(-59, ArchiveNetworkRequest.packSelectorIcons[var11Lifetime1]);
            SaveResultsPromptScreen.packCardIcons[var11Lifetime1].drawHalfSize(0, 0);
            RasterStackHelpers.popRaster(-89);
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
