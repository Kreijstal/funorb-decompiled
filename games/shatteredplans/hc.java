/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_b;
    int field_a;
    static String field_c;

    final static si a(boolean param0) {
        int var1_int = 0;
        int var3 = 0;
        si stackIn_3_0 = null;
        jo stackIn_6_0 = null;
        si stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        si var2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var1_int = 0;
          if (param0) {
            stackIn_3_0 = (si) null;
            return stackIn_3_0;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
        stackIn_6_0 = kq.field_A;
        try {
          while (true) {
            var2 = ((jo) (Object) stackIn_6_0).a(var1_int, (byte) 100);
            if (var2.field_y) {
              stackIn_8_0 = var2;
              return stackIn_8_0;
            }
            var1_int++;
            stackIn_6_0 = kq.field_A;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static lp a(int param0, int param1, int param2) {
        lp var9 = new lp(param0, param2, 209, rs.field_Cb.field_J);
        int var4 = (-rs.field_Cb.c(ho.field_g) + 209 - 20) / 2;
        vc.field_b = new bi(var4, 2);
        int var5 = 112 / ((param1 - 89) / 37);
        ra.a(-107);
        vc.field_b.e();
        gf.d(0, 0, var4, 2, 16777215);
        cg.i(0);
        ff var6 = new ff(5 + param0, var9.field_i / 2 + param2, vc.field_b);
        ff var7 = new ff(-vc.field_b.field_z + (var9.field_m + (param0 - 5)), var9.field_i / 2 + param2, vc.field_b);
        qk var8 = new qk(param0, param2, var9.field_m, var9.field_i, ho.field_g);
        var9.a(var6, 8);
        var9.a(var7, 8);
        var9.a(var8, 8);
        return var9;
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 < 41) {
          hc.a(-92, -95, -94);
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = "Loading music";
        field_c = "Lost";
    }
}
