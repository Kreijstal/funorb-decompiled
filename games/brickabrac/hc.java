/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_d;
    static RgbSprite[][] field_a;
    static int field_h;
    static boolean joinRequestsPanelOpen;
    static int field_f;
    static RgbSprite ninjaSmallSprite;
    static String field_b;
    static int[] field_e;

    final static Mesh3D decodeMesh(int zArrayLengthBits, BitPacketBuffer packet) {
        int face = 0;
        Mesh3D result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        int version = 0;
        RuntimeException failure = null;
        int hasDirections = 0;
        int hasExtraChannels = 0;
        Mesh3D mesh = null;
        int maximumGroup = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          version = packet.readBits(8, (byte) 62);
          if (0 < version) {
            throw new IllegalStateException("" + version);
          }
          hasDirections = DirectByteStorage.readPacketFlag(false, packet) ? 1 : 0;
          hasExtraChannels = DirectByteStorage.readPacketFlag(false, packet) ? 1 : 0;
          mesh = new Mesh3D();
          mesh.vertexCount = (short)packet.readBits(16, (byte) -114);
          mesh.vertexX = LevelList.readPackedShortArray((byte) -67, mesh.vertexX, packet, 16);
          mesh.vertexY = LevelList.readPackedShortArray((byte) -117, mesh.vertexY, packet, 16);
          mesh.vertexZ = LevelList.readPackedShortArray((byte) -110, mesh.vertexZ, packet, zArrayLengthBits);
          mesh.faceCount = (short)packet.readBits(16, (byte) 79);
          mesh.faceVertexA = LevelList.readPackedShortArray((byte) -64, mesh.faceVertexA, packet, 16);
          mesh.faceVertexB = LevelList.readPackedShortArray((byte) -74, mesh.faceVertexB, packet, 16);
          mesh.faceVertexC = LevelList.readPackedShortArray((byte) -124, mesh.faceVertexC, packet, 16);
          if (hasDirections != 0) {
            mesh.directionCount = (short)packet.readBits(16, (byte) 52);
            mesh.directionX = LevelList.readPackedShortArray((byte) -107, mesh.directionX, packet, 16);
            mesh.directionY = LevelList.readPackedShortArray((byte) -77, mesh.directionY, packet, 16);
            mesh.directionZ = LevelList.readPackedShortArray((byte) -117, mesh.directionZ, packet, 16);
            mesh.faceDirectionA = LevelList.readPackedShortArray((byte) -68, mesh.faceDirectionA, packet, 16);
            mesh.faceDirectionB = LevelList.readPackedShortArray((byte) -80, mesh.faceDirectionB, packet, 16);
            mesh.faceDirectionC = LevelList.readPackedShortArray((byte) -61, mesh.faceDirectionC, packet, 16);
          }
          if (hasExtraChannels != 0) {
            packet.readBits(16, (byte) 101);
            mesh.field_z = LevelList.readPackedShortArray((byte) -122, mesh.field_z, packet, 16);
            mesh.field_m = LevelList.readPackedShortArray((byte) -92, mesh.field_m, packet, 16);
            mesh.field_K = LevelList.readPackedShortArray((byte) -123, mesh.field_K, packet, 16);
            mesh.field_j = LevelList.readPackedShortArray((byte) -104, mesh.field_j, packet, 16);
            mesh.field_J = LevelList.readPackedShortArray((byte) -124, mesh.field_J, packet, 16);
          }
          if (DirectByteStorage.readPacketFlag(false, packet)) {
            mesh.faceMaterialIds = LevelList.readPackedShortArray((byte) -65, mesh.faceMaterialIds, packet, 16);
          }
          if (DirectByteStorage.readPacketFlag(false, packet)) {
            mesh.faceGroups = UsernameSuggestionPanel.readPackedByteArray(mesh.faceGroups, 16, packet, 20);
            maximumGroup = 0;
            for (face = 0; mesh.faceGroups.length > face; face++) {
              if ((mesh.faceGroups[face] & 255) > maximumGroup) {
                maximumGroup = 255 & mesh.faceGroups[face];
              }
            }
            if (maximumGroup != 0) {
              mesh.faceGroupCount = (byte)(1 + maximumGroup);
            } else {
              mesh.faceGroups = null;
            }
          }
          result = mesh;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("hc.C(").append(zArrayLengthBits).append(',');
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = (RgbSprite[][]) null;
        field_d = null;
        field_b = null;
        if (param0 >= -59) {
          joinRequestsPanelOpen = true;
        }
        ninjaSmallSprite = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        int var1_intLifetime1;
        try {
          MenuSelection.gameClock.reset(1);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            Under13RegistrationNoticePanel.renderTimes[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            sm.tickTimes[var1_intLifetime1] = 0L;
          }
          if (param0 != 2) {
            joinRequestsPanelOpen = false;
          }
          GrowableIntList.cyclesDue = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hc.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, IndexedSprite[] param1, int[] param2, ResourceArchive param3, ResourceArchive param4) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[] dupTemp$1 = null;
        RgbSprite[] dupTemp$2 = null;
        RgbSprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        BinaryMaskFont var7 = null;
        UiComponent var8 = null;
        UiComponent var9 = null;
        UiComponent var10 = null;
        UiComponent var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        UiComponent var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = BrickABrac.field_J ? 1 : 0;
        try {
          var20 = PacketBuffer.a("lobby", param3, "crowns", -946715356);
          var5 = var20;
          LevelPackLoader.field_g = var20.length;
          if (param1 != null) {
            var6 = new IndexedSprite[LevelPackLoader.field_g + param1.length];
            for (var7_int = 0; LevelPackLoader.field_g > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; param1.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[LevelPackLoader.field_g + var7_intLifetime3] = param1[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; LevelPackLoader.field_g > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param1 != null) {
            if (param2 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param1.length; var7_intLifetime2++) {
                var6_array[LevelPackLoader.field_g + var7_intLifetime2] = param2[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param1.length; var7_intLifetime2++) {
                var6_array[LevelPackLoader.field_g + var7_intLifetime2] = param1[var7_intLifetime2].canvasHeight;
              }
            }
          }
          np.uiRowHeight = 15;
          MenuSelection.field_g = 2;
          LobbyGame.field_oc = 4;
          if (param0 < 102) {
            return;
          }
          QuickChatCategoryDefinition.field_z = 2;
          ok.field_f = 11;
          var7 = TooltipSprite.loadBinaryMaskFontByName((byte) -37, "lobby", param3, param4, "largefont");
          GamePresentationHelpers.field_e = TooltipSprite.loadBinaryMaskFontByName((byte) -37, "lobby", param3, param4, "generalfont");
          ScorePopup.field_m = TooltipSprite.loadBinaryMaskFontByName((byte) -37, "lobby", param3, param4, "chatfont");
          var7.setInlineSprites(var5, var24);
          GamePresentationHelpers.field_e.setInlineSprites(var5, var24);
          ScorePopup.field_m.setInlineSprites(var5, var24);
          var8 = new UiComponent(0L, (UiComponent) null);
          var8.font = (TextFont) ((Object) var7);
          var8.textColor = 16777215;
          var8.lineSpacing = np.uiRowHeight;
          var8.verticalAlignment = 1;
          var9 = var8;
          var9.horizontalAlignment = 1;
          var10 = new UiComponent(0L, (UiComponent) null);
          var10.lineSpacing = np.uiRowHeight;
          var10.textColor = 16777215;
          var10.font = (TextFont) ((Object) GamePresentationHelpers.field_e);
          var11 = var10;
          var10.verticalAlignment = 1;
          var11.horizontalAlignment = 1;
          ValidationStatus.field_j = new UiComponent(0L, var8);
          ValidationStatus.field_j.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "heading", 2), (byte) -117);
          AccountMessageDialog.field_Ab = new UiComponent(0L, (UiComponent) null);
          AccountMessageDialog.field_Ab.frameSprites = TimedSplashScreen.a(false, (byte) 83, 8421504, 120, 4210752, false);
          f.field_a = new UiComponent(0L, (UiComponent) null);
          f.field_a.frameSprites = DateFieldsWidget.a(false, 6316128, 3, 6316128, 114, 1);
          GameUiController.field_c = new UiComponent(0L, (UiComponent) null);
          GameUiController.field_c.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "popup", 2), (byte) -114);
          var12 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "popup_mouseover", 2), (byte) -117);
          var13 = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "button", 2);
          var14 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "tab_active", 2), (byte) -110);
          GameConnectionHelpers.field_c = new UiComponent(0L, var8);
          GameConnectionHelpers.field_c.frameSprites = var14;
          ReportAbuseDialog.field_Zb = new UiComponent(0L, (UiComponent) null);
          ReportAbuseDialog.field_Zb.sprite = pl.loadRgbSpriteByName("lobby", "closebutton", (byte) -90, param3);
          ReportAbuseDialog.field_Zb.activeSprite = pl.loadRgbSpriteByName("lobby", "closebutton_mouseover", (byte) 119, param3);
          PowerUpWarning.field_k = new UiComponent(0L, var8);
          PowerUpWarning.field_k.frameSprites = TimedSplashScreen.a(true, (byte) 57, 3815994, 40, 2039583, true);
          MainMenuScreen.field_t = new UiComponent(0L, var10);
          MainMenuScreen.field_t.textInset = 2;
          MainMenuScreen.field_t.frameSprites = TimedSplashScreen.a(true, (byte) 44, 3815994, 30, 2039583, false);
          LoginCredentialKind.field_d = new UiComponent(0L, var10);
          LoginCredentialKind.field_d.textInset = 2;
          LoginCredentialKind.field_d.frameSprites = TimedSplashScreen.a(false, (byte) 77, 3815994, 30, 2039583, false);
          IntrusiveHashIterator.field_a = new UiComponent(0L, var10);
          IntrusiveHashIterator.field_a.textInset = 2;
          IntrusiveHashIterator.field_a.frameSprites = TimedSplashScreen.a(false, (byte) 83, 3815994, 30, 2039583, true);
          CappedUrlRequest.field_l = new UiComponent(0L, (UiComponent) null);
          CappedUrlRequest.field_l.verticalAlignment = 1;
          CappedUrlRequest.field_l.font = (TextFont) ((Object) GamePresentationHelpers.field_e);
          CappedUrlRequest.field_l.lineSpacing = np.uiRowHeight;
          CappedUrlRequest.field_l.textColor = 13421772;
          DualLinkNode.field_t = new UiComponent(0L, CappedUrlRequest.field_l);
          DualLinkNode.field_t.capturedTextColor = 16777215;
          DualLinkNode.field_t.disabledTextColor = 8421504;
          DualLinkNode.field_t.textColor = 16764006;
          DualLinkNode.field_t.activeTextColor = 16777215;
          DualLinkNode.field_t.selectedTextColor = 16777215;
          var15 = new UiComponent(0L, DualLinkNode.field_t);
          var15.font = (TextFont) ((Object) var7);
          var15.textColor = 16777215;
          var15.lineSpacing = np.uiRowHeight;
          Paddle.field_C = new UiComponent(0L, CappedUrlRequest.field_l);
          Paddle.field_C.frameSprites = TimedSplashScreen.a(false, (byte) 94, 2236962, 16, 2236962, false);
          Paddle.field_C.textInset = 2;
          ProxySocketConnector.field_n = new UiComponent(0L, CappedUrlRequest.field_l);
          ProxySocketConnector.field_n.frameSprites = TimedSplashScreen.a(false, (byte) 80, 1513239, 16, 1513239, false);
          ProxySocketConnector.field_n.textInset = 2;
          OptionsScreen.field_v = new UiComponent(0L, Paddle.field_C);
          OptionsScreen.field_v.copyStyle((byte) -82, DualLinkNode.field_t);
          TextFieldWidget.field_K = new UiComponent(0L, ProxySocketConnector.field_n);
          TextFieldWidget.field_K.copyStyle((byte) -72, DualLinkNode.field_t);
          var16 = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "button_mouseover", 2);
          ce.contextMenuStyle = new ContextMenu(GameUiController.field_c, var12, CappedUrlRequest.field_l, DualLinkNode.field_t, 3, 2, QuickChatCategoryDefinition.field_z, 3, np.uiRowHeight);
          ArcticBackground.field_s = new UiComponent(0L, DualLinkNode.field_t);
          ArcticBackground.field_s.capturedOffsetY = 1;
          ArcticBackground.field_s.capturedOffsetX = 1;
          ArcticBackground.field_s.selectedOffsetY = 1;
          ArcticBackground.field_s.activeFrameSprites = var16;
          ArcticBackground.field_s.frameSprites = var13;
          ArcticBackground.field_s.selectedOffsetX = 1;
          ArcticBackground.field_s.capturedFrameSprites = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "button_mouseheld", 2);
          ArcticBackground.field_s.selectedFrameSprites = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "button_active", 2);
          ArcticBackground.field_s.disabledFrameSprites = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "button_disabled", 2);
          ArcticBackground.field_s.horizontalAlignment = 1;
          WidgetTheme.field_n = new UiComponent(0L, DualLinkNode.field_t);
          WidgetTheme.field_n.horizontalAlignment = 1;
          WidgetTheme.field_n.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "tab_inactive", 2), (byte) -119);
          WidgetTheme.field_n.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "tab_mouseover", 2), (byte) -124);
          WidgetTheme.field_n.selectedFrameSprites = var14;
          hd.field_c = new UiComponent(0L, (UiComponent) null);
          hd.field_c.frameSprites = DateFieldsWidget.a(false, 1127256, 3, 1856141, 206, -1);
          FarmBackground.field_x = new UiComponent(0L, (UiComponent) null);
          FarmBackground.field_x.frameSprites = DateFieldsWidget.a(false, 6052956, 3, 11579568, 290, -1);
          fm.field_b = new UiComponent(0L, var15);
          fm.field_b.selectedOffsetX = 1;
          fm.field_b.selectedOffsetY = 1;
          fm.field_b.capturedOffsetY = 1;
          fm.field_b.horizontalAlignment = 1;
          fm.field_b.capturedOffsetX = 1;
          GameUiController.field_b = new UiComponent(0L, fm.field_b);
          MessageScreen.field_r = new UiComponent(0L, DualLinkNode.field_t);
          MessageScreen.field_r.selectedOffsetY = 1;
          MessageScreen.field_r.horizontalAlignment = 1;
          MessageScreen.field_r.capturedOffsetY = 1;
          MessageScreen.field_r.selectedOffsetX = 1;
          MessageScreen.field_r.capturedOffsetX = 1;
          ok.field_d = new UiComponent(0L, MessageScreen.field_r);
          MotionWaypoint.field_s = new UiComponent(0L, MessageScreen.field_r);
          MatchCompleteScreen.field_x = new UiComponent(0L, fm.field_b);
          GzipInflater.field_d = new UiComponent(0L, MessageScreen.field_r);
          OptionsScreen.field_u = new UiComponent(0L, MessageScreen.field_r);
          AchievementMaskRequest.field_n = new UiComponent(0L, MessageScreen.field_r);
          MessageScreen.field_r.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "smallbutton", 2), (byte) -119);
          MessageScreen.field_r.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "smallbutton_mouseover", 2), (byte) -114);
          dupTemp$0 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "smallbutton_active", 2), (byte) -102);
          MessageScreen.field_r.selectedFrameSprites = dupTemp$0;
          MessageScreen.field_r.capturedFrameSprites = dupTemp$0;
          MessageScreen.field_r.disabledFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "smallbutton_disabled", 2), (byte) -120);
          GameUiController.field_b.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "mediumbutton", 2), (byte) -102);
          GameUiController.field_b.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "mediumbutton_mouseover", 2), (byte) -105);
          GameUiController.field_b.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "mediumbutton_mouseheld", 2), (byte) -123);
          fm.field_b.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "bigbutton", 2), (byte) -114);
          fm.field_b.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "bigbutton_mouseover", 2), (byte) -120);
          fm.field_b.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "bigbutton_mouseheld", 2), (byte) -114);
          fm.field_b.disabledFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "bigbutton_disabled", 2), (byte) -106);
          ok.field_d.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "greenbutton", 2), (byte) -127);
          ok.field_d.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "greenbutton_mouseover", 2), (byte) -126);
          ok.field_d.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "greenbutton_mouseheld", 2), (byte) -119);
          MotionWaypoint.field_s.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "redbutton", 2), (byte) -105);
          MotionWaypoint.field_s.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "redbutton_mouseover", 2), (byte) -106);
          MotionWaypoint.field_s.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "redbutton_mouseheld", 2), (byte) -121);
          MatchCompleteScreen.field_x.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "backbutton", 2), (byte) -127);
          MatchCompleteScreen.field_x.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "backbutton_mouseover", 2), (byte) -103);
          MatchCompleteScreen.field_x.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "backbutton_mouseheld", 2), (byte) -122);
          MatchCompleteScreen.field_x.disabledFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "backbutton_disabled", 2), (byte) -107);
          AchievementMaskRequest.field_n.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "gameoptionbutton", 2), (byte) -115);
          AchievementMaskRequest.field_n.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_mouseover", 2), (byte) -114);
          dupTemp$1 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_active", 2), (byte) -112);
          AchievementMaskRequest.field_n.selectedFrameSprites = dupTemp$1;
          AchievementMaskRequest.field_n.capturedFrameSprites = dupTemp$1;
          AchievementMaskRequest.field_n.disabledFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_disabled", 2), (byte) -116);
          GzipInflater.field_d.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatbutton", 2), (byte) -103);
          GzipInflater.field_d.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatbutton_mouseover", 2), (byte) -113);
          dupTemp$2 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatbutton_active", 2), (byte) -125);
          GzipInflater.field_d.selectedFrameSprites = dupTemp$2;
          GzipInflater.field_d.capturedFrameSprites = dupTemp$2;
          OptionsScreen.field_u.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatfilterbutton", 2), (byte) -119);
          OptionsScreen.field_u.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatfilterbutton_mouseover", 2), (byte) -106);
          dupTemp$3 = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "chatfilterbutton_active", 2), (byte) -105);
          OptionsScreen.field_u.selectedFrameSprites = dupTemp$3;
          OptionsScreen.field_u.capturedFrameSprites = dupTemp$3;
          var17 = ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "checkbox", 2);
          BlankScreen.field_k = new StateIconLabel(0L, var17[1], var17[0], 1, DualLinkNode.field_t, (String) null);
          QuickChatHelpDialog.field_Vb = new UiComponent(0L, (UiComponent) null);
          QuickChatHelpDialog.field_Vb.frameSprites = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion", (byte) -95, param3), -52);
          QuickChatHelpDialog.field_Vb.activeFrameSprites = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_mouseover", (byte) 104, param3), -71);
          QuickChatHelpDialog.field_Vb.capturedFrameSprites = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_mouseheld", (byte) 118, param3), -86);
          QuickChatHelpDialog.field_Vb.disabledFrameSprites = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_disabled", (byte) -47, param3), -39);
          RankingsScreen.field_s = new UiComponent(0L, (UiComponent) null);
          RankingsScreen.field_s.frameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "dragbar", 2), (byte) -102);
          RankingsScreen.field_s.activeFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "dragbar_mouseover", 2), (byte) -119);
          RankingsScreen.field_s.capturedFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "dragbar_mouseheld", 2), (byte) -120);
          RankingsScreen.field_s.disabledFrameSprites = GameConnectionShell.a(ActivityIndicatorWidget.loadRgbSpritesByName("lobby", param3, "dragbar_disabled", 2), (byte) -123);
          ChocolateBackground.field_u = new UiComponent(0L, (UiComponent) null);
          ChocolateBackground.field_u.sprite = pl.loadRgbSpriteByName("lobby", "upbutton", (byte) -90, param3);
          ChocolateBackground.field_u.activeSprite = pl.loadRgbSpriteByName("lobby", "upbutton_mouseover", (byte) -125, param3);
          ChocolateBackground.field_u.capturedSprite = pl.loadRgbSpriteByName("lobby", "upbutton_mouseheld", (byte) 125, param3);
          ChocolateBackground.field_u.disabledSprite = pl.loadRgbSpriteByName("lobby", "upbutton_disabled", (byte) -114, param3);
          MessageScreen.field_s = new UiComponent(0L, (UiComponent) null);
          MessageScreen.field_s.sprite = pl.loadRgbSpriteByName("lobby", "downbutton", (byte) 99, param3);
          MessageScreen.field_s.activeSprite = pl.loadRgbSpriteByName("lobby", "downbutton_mouseover", (byte) -109, param3);
          MessageScreen.field_s.capturedSprite = pl.loadRgbSpriteByName("lobby", "downbutton_mouseheld", (byte) 97, param3);
          MessageScreen.field_s.disabledSprite = pl.loadRgbSpriteByName("lobby", "downbutton_disabled", (byte) 104, param3);
          ic.field_c = new VerticalScrollbar(0L, ChocolateBackground.field_u, MessageScreen.field_s, QuickChatHelpDialog.field_Vb, RankingsScreen.field_s);
          rq.field_b = new ScrollPaneWithFooter(0L, (UiComponent) null, ReportAbuseDialog.field_Qb, ic.field_c, MessageScreen.field_r, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("hc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        ScreenNavigationHelpers.pollQuickChatHelpDialog((byte) -86, param0);
        ce.a(param0, param3, (byte) 94, param2);
        if (param1 != -7812) {
          hc.b(4);
        }
    }

    static {
        field_d = "Type your age in years";
        field_b = "Message game";
        field_h = 1;
        field_e = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19, 42};
    }
}
