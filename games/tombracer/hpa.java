/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hpa extends aa {
    static boolean field_f;
    static int field_g;
    int[] field_d;
    int[] field_e;

    final static void a(int param0, gqa param1) {
        Object stackIn_2_0 = null;
        int stackIn_3_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        lja var5 = null;
        String var6 = null;
        lja var7 = null;
        String var8 = null;
        lja var9 = null;
        String var10 = null;
        lja var11 = null;
        String var12 = null;
        lja var13 = null;
        try {
          stackIn_2_0 = null;
          if (1 != param1.field_d) {
            stackIn_3_1 = 0;
          } else {
            stackIn_3_1 = param1.field_e;
          }
          paa.a((iv) (stackIn_2_0), stackIn_3_1, param1.field_j, param1.field_i, -11635, (int[]) null, param1.field_l, param1.field_d, param1.field_g);
          if (0 == param1.field_d &&
            !nga.c(param0 + 2) &&
            null == uu.field_a &&
            null == ifa.field_n) {
            if (!ok.field_s) {
              var5 = hka.field_b;
              var6 = cga.field_i;
              var5.field_f.a((byte) -80, 14, var6);
            }
            var7 = hka.field_b;
            var8 = hs.field_d;
            var7.field_f.a((byte) -117, 20, var8);
          }
          if (param1.field_d == 1 &&
            !nga.c(0) &&
            uu.field_a != null &&
            param1.field_e == uu.field_a.f(0)) {
            if (!ok.field_s) {
              var9 = hka.field_b;
              var10 = lw.field_i;
              var9.field_f.a((byte) -84, 14, var10);
            }
            var11 = hka.field_b;
            var12 = sg.field_s;
            var11.field_f.a((byte) -93, 20, var12);
          }
          hka.field_b.a((byte) -19);
          hka.field_b.a((byte) -22, false);
          hka.field_b.a(param1.field_h, param1.field_d, 19);
          hka.field_b.c(0);
          hka.field_b.a(param1, 13);
          var13 = hka.field_b;
          var3 = jm.field_m;
          if (param0 != -2) {
            return;
          }
          var4 = lba.field_p;
          var13.field_f.b(var4, 0, -89, 0, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("hpa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private hpa() throws Throwable {
        throw new Error();
    }

    static {
    }
}
