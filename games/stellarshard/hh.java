/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh implements uk {
    private int field_b;
    private int field_g;
    private int field_e;
    private int field_f;
    private bd field_c;
    private int field_i;
    private int field_h;
    private int field_a;
    static String field_d;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 25434) {
            field_d = null;
        }
    }

    hh(bd param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((hh) this).field_g = param4;
        ((hh) this).field_f = param3;
        ((hh) this).field_a = param6;
        ((hh) this).field_c = param0;
        ((hh) this).field_e = param2;
        ((hh) this).field_h = param7;
        ((hh) this).field_b = param1;
        ((hh) this).field_i = param5;
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        fg var14 = null;
        rj stackIn_5_0 = null;
        rj stackOut_4_0 = null;
        Object stackOut_3_0 = null;
        if (param4 == 4549) {
          L0: {
            if (param3 instanceof fg) {
              stackOut_4_0 = (rj) param3;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_5_0 = (rj) (Object) stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var14 = (fg) (Object) stackIn_5_0;
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            ti.f(param1 + param3.field_w, param2 - -param3.field_k, param3.field_p, param3.field_t, ((hh) this).field_h);
            var7 = var14.field_L + (param3.field_w + param1);
            var8 = var14.field_F + (param2 - -param3.field_k);
            ti.e(var7, var8, var14.field_I, ((hh) this).field_i);
            if ((var14.field_H ^ -1) != 0) {
              var9 = 2.0 * ((double)var14.field_H * 3.141592653589793) / (double)var14.field_N;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
              var12 = (int)(Math.cos(var9) * (double)var14.field_I);
              ti.e(var7 - -var11, var8 - -var12, 1, ((hh) this).field_a);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            ti.e(var7, var8, 2, 1);
            var9 = 3.141592653589793 * (double)var14.field_J * 2.0 / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_I);
            var12 = (int)(Math.cos(var9) * (double)var14.field_I);
            ti.a(var7, var8, var11 + var7, var8 + var12, 1);
            if (((hh) this).field_c == null) {
              break L3;
            } else {
              var13 = ((hh) this).field_b + var14.field_I + var14.field_L;
              int discarded$1 = ((hh) this).field_c.a(param3.field_m, var13 + (param1 - -param3.field_w), ((hh) this).field_e + (param3.field_k + param2), -var13 + (-((hh) this).field_b + param3.field_p), param3.field_t - (((hh) this).field_b << -118878591), ((hh) this).field_f, ((hh) this).field_g, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Level: <%0>";
    }
}
