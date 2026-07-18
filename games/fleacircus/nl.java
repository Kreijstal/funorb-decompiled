/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int[] field_a;
    static String[] field_b;
    static dd[][] field_c;

    public static void a() {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, lh param1, lh param2) {
        try {
            if (param0 < 99) {
                field_b = null;
            }
            if (null != param2.field_a) {
                param2.c(-1);
            }
            param2.field_h = param1;
            param2.field_a = param1.field_a;
            param2.field_a.field_h = param2;
            param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "nl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        param2 = param2 * 16;
        gb.a(si.field_R);
        param0 = param0 * 16;
        int var3 = -(ni.field_j * 2 % 16);
        gb.a(var3 + param2, -4 + param0, var3 + param2 - -16, 16 + param0);
        int discarded$0 = 13421632;
        gb.h(16 + (param2 + var3), param0 + 4, 8);
        gb.b(si.field_R);
    }

    final static boolean a(int param0) {
        int var1 = 0;
        var1 = -65 % ((-26 - param0) / 59);
        if (bh.field_t >= 10) {
          if (ib.field_k < 13) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
