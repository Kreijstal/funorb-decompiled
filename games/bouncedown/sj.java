/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements fc {
    static jb field_f;
    private int field_e;
    static int[] field_j;
    private tj field_i;
    static int field_d;
    private int field_k;
    private int field_b;
    static tg field_c;
    private int field_g;
    private int field_a;
    private int field_h;
    private int field_l;

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        fh var15 = null;
        lk stackIn_3_0 = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof fh) {
            stackOut_2_0 = (lk) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (fh) (Object) stackIn_3_0;
          if (var15 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          na.e(param4 - -param1.field_r, param0 + param1.field_i, param1.field_k, param1.field_m, ((sj) this).field_l);
          var7 = param4 + param1.field_r - -var15.field_H;
          var8 = var15.field_D + param0 + param1.field_i;
          na.b(var7, var8, var15.field_I, ((sj) this).field_k);
          if (var15.field_F == -1) {
            break L2;
          } else {
            var9 = 3.141592653589793 * (double)var15.field_F * 2.0 / (double)var15.field_K;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
            var12 = (int)(Math.cos(var9) * (double)var15.field_I);
            na.b(var7 - -var11, var8 + var12, 1, ((sj) this).field_a);
            break L2;
          }
        }
        L3: {
          na.b(var7, var8, 2, 1);
          var9 = 3.141592653589793 * (double)var15.field_J * 2.0 / (double)var15.field_K;
          var13 = 77 % ((param2 - -60) / 56);
          var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
          var12 = (int)(Math.cos(var9) * (double)var15.field_I);
          na.a(var7, var8, var11 + var7, var12 + var8, 1);
          if (null != ((sj) this).field_i) {
            var14 = var15.field_I + (var15.field_H - -((sj) this).field_h);
            int discarded$1 = ((sj) this).field_i.a(param1.field_h, param1.field_r + param4 - -var14, param0 - -param1.field_i + ((sj) this).field_e, -((sj) this).field_h + (-var14 + param1.field_k), -(((sj) this).field_h << -1814982111) + param1.field_m, ((sj) this).field_b, ((sj) this).field_g, 1, 1, 0);
            break L3;
          } else {
            break L3;
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 < 15) {
            return;
        }
        field_f = null;
        field_c = null;
    }

    sj(tj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((sj) this).field_i = param0;
        ((sj) this).field_k = param5;
        ((sj) this).field_l = param7;
        ((sj) this).field_b = param3;
        ((sj) this).field_e = param2;
        ((sj) this).field_h = param1;
        ((sj) this).field_a = param6;
        ((sj) this).field_g = param4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = -1;
    }
}
