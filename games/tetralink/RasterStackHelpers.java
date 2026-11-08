/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RasterStackHelpers {
    static Sprite field_e;
    static String field_h;
    static String field_c;
    static String field_i;
    static String field_f;
    static int field_g;
    static boolean field_d;
    static int field_a;
    static int field_b;

    final static void attachKeyboardListeners(java.awt.Component param0, int param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          param0.addKeyListener(LoadingStatusHelpers.field_a);
          param0.addFocusListener(LoadingStatusHelpers.field_a);
          if (param1 != 250) {
            RasterStackHelpers.isLogoIntroFinished((byte) 114);
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "me.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void pushRasterState(boolean param0) {
        TooltipTextGlobals.field_a[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_b;
        DialWidget.field_Y[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_j;
        IterableNodeHashTable.field_b[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_l;
        SocketConnector.field_f[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_i;
        ContentTransitionDialog.field_ib[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_g;
        PopupAndStripHelpers.field_a[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_f;
        PacketDiagnosticsHelpers.field_s[DefaultQuickChatContext.field_c] = SoftwareRasterizer.field_e;
        if (!param0) {
          DefaultQuickChatContext.field_c = DefaultQuickChatContext.field_c + 1;
          return;
        }
        RasterStackHelpers.releaseStatics((byte) 92);
        DefaultQuickChatContext.field_c = DefaultQuickChatContext.field_c + 1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -91) {
          return;
        }
        field_i = null;
        field_h = null;
        field_f = null;
        field_e = null;
        field_c = null;
    }

    final static void stepMusicVolumeDown(int param0) {
        int var1 = 0;
        if (param0 >= FontAndFrameStyleHelpers.field_a) {
          NineSliceFrame.setMusicVolume(0, param0 ^ 66);
        } else {
          var1 = FontAndFrameStyleHelpers.field_a % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          NineSliceFrame.setMusicVolume(FontAndFrameStyleHelpers.field_a - var1, param0 ^ 125);
        }
    }

    final static boolean isLogoIntroFinished(byte param0) {
        if (param0 == -99) {
          return 250 < SingleChildWidget.field_K ? true : false;
        }
        RasterStackHelpers.isLogoIntroFinished((byte) -112);
        return 250 < SingleChildWidget.field_K ? true : false;
    }

    static {
        field_h = "Year";
        field_f = "Security";
        field_i = "Username: ";
        field_d = false;
        field_a = 0;
        field_c = "Red";
    }
}
