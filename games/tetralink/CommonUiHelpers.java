/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CommonUiHelpers {
    static int field_c;
    static String[] field_b;
    static LoginCredentialType field_h;
    static String field_f;
    static double field_i;
    static byte[] field_a;
    static String field_e;
    static UiComponent field_d;
    static long field_g;

    final static boolean isPacketPayloadReady(int param0) {
        int var1 = -12 % ((-4 - param0) / 36);
        if (-1 == KeyHandlerHelpers.field_d) {
          if (!SingleChildWidget.fillIncomingBuffer(117, 1)) {
            return false;
          }
          KeyHandlerHelpers.field_d = BackgroundSparkle.field_q.readUnsignedByte((byte) -99);
          BackgroundSparkle.field_q.position = 0;
        }
        if (KeyHandlerHelpers.field_d == -2) {
          if (!SingleChildWidget.fillIncomingBuffer(125, 2)) {
            return false;
          }
          KeyHandlerHelpers.field_d = BackgroundSparkle.field_q.readUnsignedShort(127);
          BackgroundSparkle.field_q.position = 0;
        }
        return SingleChildWidget.fillIncomingBuffer(115, KeyHandlerHelpers.field_d);
    }

    final static void loadCommonUi(Archive param0, Archive param1, Archive param2, int param3) {
        Sprite var18 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var8 = null;
        IndexedSprite[] var15 = null;
        int var12_int = 0;
        Sprite var16 = null;
        Sprite var19 = null;
        Sprite var12 = null;
        Sprite var13 = null;
        int var9 = 0;
        int var10 = 0;
        int var14 = TetraLink.field_J;
        int var9Lifetime1;
        int var10Lifetime1;
        try {
          DateInputWidget.field_O = PlayingSound.loadSpritesByName((byte) -128, param0, "commonui", "frame_top");
          IntrusiveNode.field_i = PlayingSound.loadSpritesByName((byte) -83, param0, "commonui", "frame_bottom");
          ScreenSwitchHelpers.field_c = LoadingProgressDialog.loadFontByName(param0, (byte) -45, "jagex_logo_grey", "commonui");
          InsetTextPainter.field_q = PlayingSound.loadSpritesByName((byte) -81, param0, "commonui", "button");
          ChatMessage.field_q = QuickChatCategory.loadRgbSpriteByName("commonui", -1, param0, "validation");
          LruTextureCache.field_d = (BitmapFont) ((Object) NumericDateInputWidget.loadFontByName(param0, "arezzo12", param1, "commonui", (byte) 95));
          NumericDateInputWidget.field_S = (BitmapFont) ((Object) NumericDateInputWidget.loadFontByName(param0, "arezzo14", param1, "commonui", (byte) 95));
          ValidationStatusIcon.field_V = (BitmapFont) ((Object) NumericDateInputWidget.loadFontByName(param0, "arezzo14bold", param1, "commonui", (byte) 95));
          var18 = new Sprite(param2.getFileByName("button.gif", "", true), (java.awt.Component) ((Object) GameClock.field_b));
          ScreenDrawHelpers.loadIndexedSpriteByName((byte) 80, param0, "commonui", "dropdown");
          var5 = LobbyGame.loadIndexedSpritesByName(param0, "screen_options", "commonui", -1409);
          TopLevelContainerHelpers.field_a = new IndexedSprite[4];
          SpriteCheckboxPainter.field_c = new IndexedSprite[4];
          LruTextureCache.field_g = new IndexedSprite[4];
          var6 = new IndexedSprite[][]{SpriteCheckboxPainter.field_c, TopLevelContainerHelpers.field_a, LruTextureCache.field_g};
          int var7 = 7 / ((param3 + 24) / 61);
          var20 = new int[4][];
          var17 = var20;
          var8 = var17;
          var8[0] = var5[0].field_p;
          for (var9 = 1; var20.length > var9; var9++) {
            var8[var9] = (int[]) ((Object) var20[0].clone());
          }
          var9Lifetime1 = var5[0].field_o[0];
          var20[2][var9Lifetime1] = 16777215;
          var20[1][var9Lifetime1] = 2394342;
          var20[3][var9Lifetime1] = 4767999;
          for (var10 = 0; 3 > var10; var10++) {
            var15 = var6[var10];
            IndexedSprite[] var11 = var15;
            for (var12_int = 0; var12_int < var15.length; var12_int++) {
              var15[var12_int] = DualLinkNode.createRepalettedSprite(false, var20[var12_int], var5[var10]);
            }
          }
          var10Lifetime1 = var18.field_E;
          ReflectionCheck.pushRasterState((byte) 111);
          var18.makeRasterTarget();
          SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_f, SoftwareRasterizer.field_e);
          var16 = new Sprite(var10Lifetime1, var10Lifetime1);
          var19 = var16;
          var19.makeRasterTarget();
          var18.drawOpaque(0, 0);
          var12 = new Sprite(var10Lifetime1, var10Lifetime1);
          var12.makeRasterTarget();
          var18.drawOpaque(-var18.field_u + var10Lifetime1, 0);
          var13 = new Sprite(var18.field_u - var10Lifetime1 * 2, var10Lifetime1);
          var13.makeRasterTarget();
          var18.drawOpaque(-var10Lifetime1, 0);
          LruTextureCache.popRaster(-581);
          InsetTextPainter.field_q = new Sprite[]{var16, var13, var12};
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ua.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void closeOverlays(byte param0) {
        if (param0 != 123) {
          CommonUiHelpers.isPacketPayloadReady(93);
        }
        QueuedStatSubmission.updateLobbyFadeOut((byte) 106);
        LobbyUpdateHelpers.tickTransitionCounters((byte) -119);
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_b = null;
        field_a = null;
        field_f = null;
        if (param0 != -1) {
          return;
        }
        field_e = null;
        field_d = null;
    }

    final static void readChatAvailability(int param0) {
        MenuLabelGlobals.field_a = false;
        DisplayNameForm.field_K = param0 == ~BackgroundSparkle.field_q.readUnsignedByte((byte) -99) ? true : false;
    }

    final static void drawTooltipBox(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var2_int = ContextMenu.field_Nb;
          var3 = ClientProtocolStage.field_a;
          var4 = TextLayoutLine.field_i.field_Ib.wrappedLineCount(param1, 500);
          var5 = TextLayoutLine.field_i.field_Ib.getWrappedWidth(param1, 500) + 6;
          if (param0 != 7918) {
            field_g = 6L;
          }
          var6 = var4 * GameKeyHandler.field_d + 2;
          var7 = CameraAndChatHelpers.clampPopupX(var5, (byte) 108, var2_int, 12);
          var8 = GameRoomPanelHelpers.placePopupVertically(20, var3, var6, -8748);
          SoftwareRasterizer.drawRectangle(var7, var8, var5, var6, 0);
          SoftwareRasterizer.fillRectangle(1 + var7, 1 + var8, var5 - 2, var6 - 2, 16777088);
          TextLayoutLine.field_i.field_Ib.drawParagraph(param1, var7 + 3, -TextLayoutLine.field_i.field_Ib.field_N + ArchiveFactoryHelpers.field_d + (var8 + 1), 500, 1000, 0, -1, 0, 0, GameKeyHandler.field_d);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "ua.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int sineFixed(int param0, int param1) {
        param1 = param1 & 8191;
        int var2 = 11 / ((param0 + 85) / 36);
        if (param1 >= 4096) {
          return param1 < 6144 ? -PendingSubmission.field_n[6144 - param1] : PendingSubmission.field_n[-6144 + param1];
        }
        return 2048 <= param1 ? -PendingSubmission.field_n[param1 - 2048] : PendingSubmission.field_n[2048 - param1];
    }

    static {
        field_b = new String[]{"turntime_icons"};
        field_c = -1;
        field_e = "Names should contain a maximum of 12 characters";
        field_f = "Achieved";
        field_h = new LoginCredentialType(0);
    }
}
