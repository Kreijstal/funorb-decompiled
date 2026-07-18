/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static ul field_f;
    static int[] field_b;
    static int[] field_a;
    mj field_d;
    static int field_h;
    static String field_e;
    static int field_c;
    static rf field_g;

    public static void a(int param0) {
        field_e = null;
        field_b = null;
        field_f = null;
        field_g = null;
        field_a = null;
    }

    final static int a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param0 >= 54) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (var3 >= param1.length) {
                stackOut_6_0 = var2_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var2_int = var2_int + mm.a((byte) 124, param1[var3]);
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("uf.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    uf(String param0, gh param1) {
        String[] var3 = null;
        gh[] var4 = null;
        try {
            var3 = new String[]{param0, ad.field_a, cf.field_A};
            var4 = new gh[]{param1, ig.field_m, (gh) (Object) vi.field_W};
            ((uf) this).field_d = new mj(0L, ka.field_U, var3, be.field_c, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "uf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = 5;
        ((uf) this).field_d.a(10, param0, var7, param2, param4, var6, param1);
        vc.field_h.a(0, 0, db.field_b, 0, ig.field_m.field_zb);
        mm.field_a.a(0, 2 + db.field_b, 18, 0, -2 + (-80 + ig.field_m.field_zb + (-ua.field_G + -2)));
        dh.field_E.a(0, db.field_b + 2, 18, -ua.field_G + (ig.field_m.field_zb - 82), 82 - -ua.field_G);
        km.field_j.a(ig.field_m.field_zb, -20 + ig.field_m.field_Lb + (-db.field_b - 2), 2, 0, 20, 122, ua.field_G, param3 + (db.field_b - -20));
        vi.field_W.a(2, 20, param3 ^ 46, ua.field_G);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[8192];
        field_e = "<%0> has been removed.";
        field_f = new ul();
        field_c = 0;
        field_g = new rf();
    }
}
