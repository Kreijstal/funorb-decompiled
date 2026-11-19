/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardShutdownHelpers {
    static String field_b;
    static StandardContentTransitionDialog field_f;
    static int[] field_a;
    static String field_e;
    static String field_d;
    static int[] field_c;

    public static void releaseStatics(int param0) {
        field_c = null;
        field_f = null;
        if (param0 == 4) {
          field_b = null;
          field_e = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_c = (int[]) null;
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void clearKeyHandler(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (HotspotTextWidget.keyHandler == null) {
          if (param0 == 4) {
            return;
          }
          KeyboardShutdownHelpers.clearKeyHandler(-24);
          return;
        }
        var1 = HotspotTextWidget.keyHandler;
        synchronized (var1) {
          HotspotTextWidget.keyHandler = null;
        }
        if (param0 != 4) {
          KeyboardShutdownHelpers.clearKeyHandler(-24);
        }
    }

    static {
        field_b = "OK";
        field_a = new int[4];
    }
}
