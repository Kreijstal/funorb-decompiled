/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb implements dh {
    static int[] field_l;
    static int field_b;
    static rh field_n;
    private int field_m;
    static String field_h;
    private int field_e;
    private m field_a;
    private int field_i;
    private int field_g;
    private int field_c;
    private int field_f;
    private int field_k;
    static wa field_j;
    static dm[] field_d;

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        qb var14 = null;
        el stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        el stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof qb)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (el) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (el) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (qb) (Object) stackIn_3_0;
          vb.a(param0 - -param4.field_v, param4.field_m + param2, param4.field_r, param4.field_h, ((hb) this).field_f);
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = param4.field_v + param0 - -var14.field_E;
          var8 = param4.field_m + param2 - -var14.field_O;
          vb.d(var7, var8, var14.field_K, ((hb) this).field_e);
          if (var14.field_J == -1) {
            break L2;
          } else {
            var9 = (double)var14.field_J * 3.141592653589793 * 2.0 / (double)var14.field_H;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
            var12 = (int)(Math.cos(var9) * (double)var14.field_K);
            vb.d(var7 + var11, var8 - -var12, 1, ((hb) this).field_g);
            break L2;
          }
        }
        vb.d(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var14.field_I) / (double)var14.field_H;
        var11 = (int)(-Math.sin(var9) * (double)var14.field_K);
        var12 = (int)(Math.cos(var9) * (double)var14.field_K);
        if (param1 > -5) {
          return;
        } else {
          L3: {
            vb.g(var7, var8, var11 + var7, var12 + var8, 1);
            if (((hb) this).field_a == null) {
              break L3;
            } else {
              var13 = ((hb) this).field_c + (var14.field_E - -var14.field_K);
              int discarded$1 = ((hb) this).field_a.a(param4.field_s, var13 + (param0 + param4.field_v), param2 - -param4.field_m - -((hb) this).field_i, param4.field_r - (((hb) this).field_c + var13), -(((hb) this).field_c << 1444492961) + param4.field_h, ((hb) this).field_m, ((hb) this).field_k, 1, 1, 0);
              break L3;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        if (param0 != 0) {
          field_h = null;
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        } else {
          field_l = null;
          field_j = null;
          field_d = null;
          return;
        }
    }

    hb(m param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((hb) this).field_e = param5;
        ((hb) this).field_f = param7;
        ((hb) this).field_m = param3;
        ((hb) this).field_a = param0;
        ((hb) this).field_c = param1;
        ((hb) this).field_k = param4;
        ((hb) this).field_g = param6;
        ((hb) this).field_i = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_h = "Play free version";
    }
}
