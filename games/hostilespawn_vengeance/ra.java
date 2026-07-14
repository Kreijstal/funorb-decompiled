/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra implements nn {
    static nc field_e;
    static String field_f;
    private int field_m;
    private int field_k;
    static bd field_b;
    private int field_d;
    static int field_a;
    static int[] field_i;
    private int field_h;
    private vm field_l;
    private int field_g;
    private int field_j;
    private int field_c;

    public static void a(int param0) {
        field_i = null;
        if (param0 != 11129) {
          field_i = null;
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int[] param1, int param2, oj param3, int[] param4) {
        if (-1 == (ha.field_t ^ -1)) {
          param1[param2] = 0;
          param1[1 + param2] = 0;
          param4[param2] = 1;
          param4[1 + param2] = 1;
          param3.field_i = -1;
          if (param0 == 1) {
            return;
          } else {
            ra.a(115);
            return;
          }
        } else {
          param1[param2] = 2;
          param1[param2 - -1] = 2;
          param4[param2] = 0;
          param4[1 + param2] = 0;
          if (param0 == 1) {
            return;
          } else {
            ra.a(115);
            return;
          }
        }
    }

    public final void a(int param0, int param1, int param2, ag param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        ag stackIn_3_0 = null;
        ag stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof g) {
            stackOut_2_0 = (ag) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (ag) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (g) (Object) stackIn_3_0;
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          si.c(param3.field_v + param1, param3.field_m + param0, param3.field_s, param3.field_x, ((ra) this).field_h);
          var7 = var14.field_P + (param1 + param3.field_v);
          var8 = var14.field_Q + (param0 - -param3.field_m);
          si.e(var7, var8, var14.field_J, ((ra) this).field_g);
          if ((var14.field_L ^ -1) == 0) {
            break L2;
          } else {
            var9 = 3.141592653589793 * (double)var14.field_L * 2.0 / (double)var14.field_I;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            si.e(var11 + var7, var8 + var12, 1, ((ra) this).field_j);
            break L2;
          }
        }
        si.e(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var14.field_H) / (double)var14.field_I;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_J);
        if (param2 != 15430) {
          return;
        } else {
          L3: {
            var12 = (int)(Math.cos(var9) * (double)var14.field_J);
            si.g(var7, var8, var7 + var11, var12 + var8, 1);
            if (((ra) this).field_l != null) {
              var13 = ((ra) this).field_c + var14.field_J + var14.field_P;
              int discarded$1 = ((ra) this).field_l.a(param3.field_n, param1 + param3.field_v - -var13, param0 + param3.field_m - -((ra) this).field_k, param3.field_s - ((ra) this).field_c - var13, param3.field_x - (((ra) this).field_c << -1115884447), ((ra) this).field_d, ((ra) this).field_m, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    ra(vm param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ra) this).field_k = param2;
        ((ra) this).field_d = param3;
        ((ra) this).field_l = param0;
        ((ra) this).field_g = param5;
        ((ra) this).field_h = param7;
        ((ra) this).field_c = param1;
        ((ra) this).field_j = param6;
        ((ra) this).field_m = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Something just hit the ship! I have a bad feeling about this.";
    }
}
