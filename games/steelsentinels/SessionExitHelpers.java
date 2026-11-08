/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SessionExitHelpers {
    static boolean field_c;
    static String field_a;
    static String field_b;

    final static void setPopupMenuAnchor(int param0, int param1, int param2) {
        MarkerSliderPainter.field_a = param1;
        ProxyAuthenticationException.field_f = param0;
        if (param2 != 11) {
          SessionExitHelpers.requestSessionExit(-36);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 < 63) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void requestSessionExit(int param0) {
        if (param0 == ReflectionCheckHelpers.field_d) {
          LoginDialogHelpers.showConnectionLostLogin(29);
          ReflectionCheckHelpers.field_d = 11;
          PopupMenuHelpers.field_h = true;
          return;
        }
        if (!MouseWheelInput.alwaysTrue(105)) {
          LoginDialogHelpers.showConnectionLostLogin(29);
          ReflectionCheckHelpers.field_d = 11;
          PopupMenuHelpers.field_h = true;
          return;
        }
        PopupMenuHelpers.field_h = true;
    }

    static {
        field_a = "COMPLETE";
        field_b = "EXPANSION ONLY ITEM";
    }
}
