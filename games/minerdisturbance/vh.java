/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh implements uj {
    static String field_e;
    static gj field_f;
    static ea field_c;
    static String[][] field_b;
    static String[] field_h;
    static int field_g;
    static ea[] field_a;
    static String field_d;
    static String[] field_i;

    public final String a(byte param0) {
        int var2 = -60 / ((param0 - -33) / 62);
        return "Fill Cell Oil";
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_f = null;
        field_b = null;
        field_i = null;
        field_d = null;
        field_e = null;
        field_h = null;
    }

    final static void a(int param0) {
        if (param0 > -113) {
            vh.a(-8);
            int discarded$0 = -9;
            fa.c();
            return;
        }
        int discarded$1 = -9;
        fa.c();
    }

    public final void a(boolean param0) {
        if (param0) {
            field_d = null;
            ha.field_e = 3;
            tb.field_a = 3;
            return;
        }
        ha.field_e = 3;
        tb.field_a = 3;
    }

    final static void a(int param0, ln[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          wk.field_a = new kd((java.applet.Applet) (Object) pd.field_b, lc.field_o, param1, new String[7]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vh.D(").append(3).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Creating your account";
        field_b = new String[][]{null, new String[1]};
        field_h = new String[]{"The torch lights up dark areas in the volcano and can let you see through to hidden areas. It doesn't work well underwater, though.", "Illuminate the Super Volcano and peer through to hidden areas. It doesn't work well underwater, though."};
        field_f = new gj();
        field_d = "Names cannot start or end with space or underscore";
    }
}
