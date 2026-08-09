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
            var2 = new ed(param1.a(-4, "", "final_frame.jpg"), (java.awt.Component) ((Object) of.field_d));
            var3 = var2.field_s;
            var4 = var2.field_x;
            hf.a(param0 ^ 58);
            cb.field_a = new ed(var3, 3 * var4 / 4);
            cb.field_a.g();
            var2.d(0, param0);
            s.field_G = new ed(var3, -cb.field_a.field_x + var4);
            s.field_G.g();
            var2.d(0, -cb.field_a.field_x);
            s.field_G.field_v = cb.field_a.field_x;
            dl.a((byte) 120);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "cj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            var2 = -55 % ((param0 - -59) / 39);
            var6 = ul.field_I;
            var1 = var6;
            var3 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var3) {
                break L0;
              } else {
                incrementValue$16 = var3;
                var3++;
                var6[incrementValue$16] = 0;
                incrementValue$17 = var3;
                var3++;
                var6[incrementValue$17] = 0;
                incrementValue$18 = var3;
                var3++;
                var6[incrementValue$18] = 0;
                incrementValue$19 = var3;
                var3++;
                var6[incrementValue$19] = 0;
                incrementValue$20 = var3;
                var3++;
                var6[incrementValue$20] = 0;
                incrementValue$21 = var3;
                var3++;
                var6[incrementValue$21] = 0;
                incrementValue$22 = var3;
                var3++;
                var6[incrementValue$22] = 0;
                incrementValue$23 = var3;
                var3++;
                var6[incrementValue$23] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "cj.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != 17159) {
          cj.a((byte) 122);
          field_d = (int[][]) null;
          return;
        } else {
          field_d = (int[][]) null;
          return;
        }
    }

    static {
        field_c = "Just play";
        field_b = " - show/hide mini-map";
    }
}
