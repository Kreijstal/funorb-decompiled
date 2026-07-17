/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_b;
    int field_a;
    static String field_c;

    final static si a(boolean param0) {
        int var1_int = 0;
        IllegalArgumentException var1 = null;
        si var2 = null;
        int var3 = 0;
        jo stackIn_5_0 = null;
        si stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        jo stackOut_3_0 = null;
        jo stackOut_4_0 = null;
        si stackOut_6_0 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = 0;
          stackOut_3_0 = kq.field_A;
          stackIn_5_0 = stackOut_3_0;
          L0: while (true) {
            var2 = ((jo) (Object) stackIn_5_0).a(var1_int, (byte) 100);
            if (!var2.field_y) {
              var1_int++;
              stackOut_4_0 = kq.field_A;
              stackIn_5_0 = stackOut_4_0;
              continue L0;
            } else {
              stackOut_6_0 = (si) var2;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static lp a(int param0, int param1, int param2) {
        lp var9 = new lp(param0, param2, 209, rs.field_Cb.field_J);
        int var4 = (-rs.field_Cb.c(ho.field_g) + 189) / 2;
        vc.field_b = new bi(var4, 2);
        int var5 = 112;
        ra.a(-107);
        vc.field_b.e();
        gf.d(0, 0, var4, 2, 16777215);
        cg.i(0);
        ff var6 = new ff(5 + param0, var9.field_i / 2 + param2, vc.field_b);
        ff var7 = new ff(-vc.field_b.field_z + (var9.field_m + (param0 - 5)), var9.field_i / 2 + param2, vc.field_b);
        qk var8 = new qk(param0, param2, var9.field_m, var9.field_i, ho.field_g);
        var9.a((vd) (Object) var6, 8);
        var9.a((vd) (Object) var7, 8);
        var9.a((vd) (Object) var8, 8);
        return var9;
    }

    public static void a() {
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Loading music";
        field_c = "Lost";
    }
}
