/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyEventHelpers {
    static UiComponent[] field_f;
    static int field_d;
    static String field_e;
    static String field_c;
    static int[] field_h;
    static int field_g;
    static String[] field_a;
    static TwoColumnListPanel field_b;

    final static boolean handleGlobalKey(int param0, int param1, int param2, int param3) {
        boolean decompiledFrameRemainder0 = true;
        if (null == EmailAvailabilityValidator.field_s) {
          if (PasswordValidator.field_y != null &&
            PasswordValidator.field_y.handleEscape(5)) {
            PasswordValidator.field_y = null;
            PasswordLoginCredentials.closePlayerContextMenu((byte) 43);
            return true;
          }
        } else {
          if (EmailAvailabilityValidator.field_s.isMenuOpen(-1)) {
            PasswordLoginCredentials.closePlayerContextMenu((byte) 43);
            return true;
          }
          if ((PasswordValidator.field_y == null) &&
            (decompiledFrameRemainder0 = (param0 != 15780))) {
            field_h = (int[]) null;
            if (NameEntryKeyHelpers.dispatchNameEntryPopupKey(0)) {
              return true;
            }
            if (!FadingModalPanel.dispatchKeyInput(param3, param0 ^ -1885068379, param1, param2)) {
              return false;
            }
            return true;
          }
          if ((decompiledFrameRemainder0) &&
            (PasswordValidator.field_y.handleEscape(5))) {
            PasswordValidator.field_y = null;
            PasswordLoginCredentials.closePlayerContextMenu((byte) 43);
            return true;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (param0 != 15780)) {
          field_h = (int[]) null;
        }
        if (NameEntryKeyHelpers.dispatchNameEntryPopupKey(0)) {
          return true;
        }
        if (FadingModalPanel.dispatchKeyInput(param3, param0 ^ -1885068379, param1, param2)) {
          return true;
        }
        return false;
    }

    final static boolean pollKeyEvent(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = LoadingStatusHelpers.field_a;
        synchronized (var1) {
          if (LruTextureCache.field_m == MenuReturnHelpers.field_e) {
            return false;
          }
          WidgetStyleLayer.field_e = JoinStatusTextHelpers.field_e[LruTextureCache.field_m];
          AnimationSequence.field_m = ConfirmPasswordTextGlobals.field_c[LruTextureCache.field_m];
          if (param0 != 28) {
            field_g = -102;
          }
          LruTextureCache.field_m = LruTextureCache.field_m + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static void setChatInputPrefix(String param0, byte param1, String param2, int param3, int param4) {
        PageReloadHelpers.field_g.field_Hb = PageReloadHelpers.field_g.field_Hb + MessageDialogContent.field_L.field_Hb;
        if (param1 != -48) {
          return;
        }
        try {
          PageReloadHelpers.field_g.field_N = param3;
          PageReloadHelpers.field_g.field_O = param2;
          PageReloadHelpers.field_g.field_jb = param0;
          MessageDialogContent.field_L.field_M = MessageDialogContent.field_L.field_M + MessageDialogContent.field_L.field_Hb;
          MessageDialogContent.field_L.field_Hb = param4;
          PageReloadHelpers.field_g.field_Hb = PageReloadHelpers.field_g.field_Hb - MessageDialogContent.field_L.field_Hb;
          MessageDialogContent.field_L.field_M = MessageDialogContent.field_L.field_M - MessageDialogContent.field_L.field_Hb;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "nj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_h = null;
        field_b = null;
        if (param0 > 93) {
          field_f = null;
          field_a = null;
          field_c = null;
          return;
        }
        String var2 = (String) null;
        KeyEventHelpers.setChatInputPrefix((String) null, (byte) -11, (String) null, -21, -123);
        field_f = null;
        field_a = null;
        field_c = null;
    }

    static {
        field_c = "Who can join";
        field_a = new String[255];
    }
}
