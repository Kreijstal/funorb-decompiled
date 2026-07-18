/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends l {
    static String field_i;
    static String field_s;
    int field_h;
    static long field_o;
    static lc field_q;
    static String field_g;
    int field_r;
    int field_m;
    static me field_l;
    static km field_n;
    static int field_k;
    static byte[] field_p;
    static e field_j;

    final static v a(int param0, byte[] param1) {
        v var2 = null;
        RuntimeException var2_ref = null;
        v stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        v stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var2 = new v(param1, el.field_w, mb.field_bb, db.field_k, gb.field_F, lj.field_j);
              int discarded$2 = -28;
              pe.b();
              stackOut_3_0 = (v) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("pm.B(").append(-9618).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    public static void a() {
        field_s = null;
        field_q = null;
        field_g = null;
        field_l = null;
        field_p = null;
        field_i = null;
        field_j = null;
        field_n = null;
    }

    final static void a(eh param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        wm var5 = null;
        int[] var6 = null;
        int var7 = 0;
        hg var8 = null;
        int var9 = 0;
        hg var10 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var8 = new hg(param0.a("logo.fo3d", 100, ""));
            var10 = var8;
            var3 = var10.g(11132);
            var10.j(8);
            int discarded$1 = 9;
            td.field_e = fj.a(var10);
            ph.field_n = new wm[var3];
            kh.field_f = new int[var3][];
            var4 = 94;
            var5_int = 0;
            L1: while (true) {
              if (var3 <= var5_int) {
                var10.k(7);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var3 <= var9) {
                    break L0;
                  } else {
                    var5 = ph.field_n[var9];
                    var5.a(false, 6, 1, 6, 6);
                    var5.b((byte) 126);
                    var6 = new int[]{var5.field_C + var5.field_U >> 1, var5.field_T + var5.field_g >> 1, var5.field_p + var5.field_L >> 1};
                    kh.field_f[var9] = var6;
                    var5.a(-var6[1], -var6[0], -var6[2], (byte) 112);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                ph.field_n[var5_int] = qn.a(var8, 13472);
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("pm.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + 106 + ')');
        }
    }

    pm(int param0, int param1, int param2) {
        ((pm) this).field_m = param0;
        ((pm) this).field_r = param2;
        ((pm) this).field_h = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Invite more players, or alternatively try changing the '<%0>' setting.";
        field_s = "Buying or selling an account";
        field_q = new lc(0, 2, 2, 1);
        mg discarded$0 = new mg(0, 0);
        field_l = new me();
    }
}
