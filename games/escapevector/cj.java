/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static ed field_a;
    static String field_b;
    static int[][] field_d;
    static String field_c;

    final static void a(int param0, mf param1) {
        ed var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new ed(param1.a(-4, "", "final_frame.jpg"), (java.awt.Component) (Object) of.field_d);
            var3 = var2.field_s;
            var4 = var2.field_x;
            hf.a(58);
            cb.field_a = new ed(var3, 3 * var4 / 4);
            cb.field_a.g();
            var2.d(0, 0);
            s.field_G = new ed(var3, -cb.field_a.field_x + var4);
            s.field_G.g();
            var2.d(0, -cb.field_a.field_x);
            s.field_G.field_v = cb.field_a.field_x;
            dl.a((byte) 120);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "cj.A(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2 = 0;
            var6 = ul.field_I;
            var1 = var6;
            var3 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var3) {
                break L0;
              } else {
                int incrementValue$40 = var3;
                var3++;
                var6[incrementValue$40] = 0;
                int incrementValue$41 = var3;
                var3++;
                var6[incrementValue$41] = 0;
                int incrementValue$42 = var3;
                var3++;
                var6[incrementValue$42] = 0;
                int incrementValue$43 = var3;
                var3++;
                var6[incrementValue$43] = 0;
                int incrementValue$44 = var3;
                var3++;
                var6[incrementValue$44] = 0;
                int incrementValue$45 = var3;
                var3++;
                var6[incrementValue$45] = 0;
                int incrementValue$46 = var3;
                var3++;
                var6[incrementValue$46] = 0;
                int incrementValue$47 = var3;
                var3++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1_ref, "cj.C(" + -99 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Just play";
        field_b = " - show/hide mini-map";
    }
}
