/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static dh field_b;
    static String field_c;
    static volatile int field_d;
    static String field_a;

    final static int a(byte param0, int param1, CharSequence param2) {
        int var3 = 1 / ((param0 - -10) / 62);
        return wl.a(true, param2, false, param1);
    }

    public static void a(byte param0) {
        Object var2 = null;
        if (param0 != -15) {
          var2 = null;
          int discarded$2 = ie.a((byte) -127, -18, (CharSequence) null);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(int param0) {
        bm.a(param0, (byte) 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
        field_c = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_a = "No Highscores";
    }
}
