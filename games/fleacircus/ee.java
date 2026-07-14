/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee implements ch {
    static String field_k;
    private int field_c;
    private int field_e;
    private int field_b;
    static int field_h;
    private int field_a;
    private fa field_d;
    static boolean field_i;
    private int field_f;
    private int field_j;
    private int field_g;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        md var14 = null;
        qa stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        qa stackOut_3_0 = null;
        if (param0 <= -36) {
          L0: {
            if (!(param3 instanceof md)) {
              stackOut_4_0 = null;
              stackIn_5_0 = (qa) (Object) stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (qa) param3;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var14 = (md) (Object) stackIn_5_0;
            gb.e(param1 + param3.field_y, param3.field_z + param4, param3.field_u, param3.field_j, ((ee) this).field_j);
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = param3.field_y + (param1 - -var14.field_U);
            var8 = param4 + param3.field_z + var14.field_R;
            gb.f(var7, var8, var14.field_O, ((ee) this).field_c);
            if (-1 != var14.field_K) {
              var9 = 3.141592653589793 * (double)var14.field_K * 2.0 / (double)var14.field_N;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
              var12 = (int)(Math.cos(var9) * (double)var14.field_O);
              gb.f(var7 + var11, var12 + var8, 1, ((ee) this).field_g);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            gb.f(var7, var8, 2, 1);
            var9 = (double)var14.field_Q * 3.141592653589793 * 2.0 / (double)var14.field_N;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_O);
            var12 = (int)(Math.cos(var9) * (double)var14.field_O);
            gb.d(var7, var8, var11 + var7, var8 + var12, 1);
            if (null != ((ee) this).field_d) {
              var13 = ((ee) this).field_a + var14.field_U - -var14.field_O;
              int discarded$1 = ((ee) this).field_d.a(param3.field_i, var13 + param3.field_y + param1, ((ee) this).field_f + param4 - -param3.field_z, param3.field_u + -var13 + -((ee) this).field_a, param3.field_j - (((ee) this).field_a << -497739519), ((ee) this).field_b, ((ee) this).field_e, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            ee.a(55);
            field_k = null;
            return;
        }
        field_k = null;
    }

    ee(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ee) this).field_b = param3;
        ((ee) this).field_d = param0;
        ((ee) this).field_f = param2;
        ((ee) this).field_g = param6;
        ((ee) this).field_j = param7;
        ((ee) this).field_e = param4;
        ((ee) this).field_c = param5;
        ((ee) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Continue";
        field_i = true;
    }
}
