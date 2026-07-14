/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bsa implements isa {
    private int field_e;
    private int field_b;
    private int field_g;
    static volatile boolean field_k;
    private int field_d;
    private int field_c;
    static iv field_j;
    static nh field_i;
    private int field_h;
    private il field_a;
    private int field_f;

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        if (param0 != -33) {
            bsa.a((byte) -94);
        }
    }

    public final void a(ae param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        rr var14 = null;
        ae stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        ae stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof rr)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (ae) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (ae) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var14 = (rr) (Object) stackIn_3_0;
          if (var14 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          bea.e(param0.field_i + param1, param0.field_n + param3, param0.field_m, param0.field_p, ((bsa) this).field_d);
          var7 = var14.field_E + param0.field_i + param1;
          var8 = var14.field_C + param3 + param0.field_n;
          bea.e(var7, var8, var14.field_F, ((bsa) this).field_f);
          if (0 != (var14.field_z ^ -1)) {
            var9 = 3.141592653589793 * (double)var14.field_z * 2.0 / (double)var14.field_B;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            bea.e(var11 + var7, var8 - -var12, 1, ((bsa) this).field_e);
            break L2;
          } else {
            break L2;
          }
        }
        bea.e(var7, var8, 2, 1);
        var9 = 3.141592653589793 * (double)var14.field_A * 2.0 / (double)var14.field_B;
        if (param2 != 16777215) {
          L3: {
            bsa.a((byte) -126);
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            bea.a(var7, var8, var11 + var7, var8 + var12, 1);
            if (((bsa) this).field_a == null) {
              break L3;
            } else {
              var13 = var14.field_F + (var14.field_E + ((bsa) this).field_h);
              int discarded$2 = ((bsa) this).field_a.a(param0.field_o, param1 - -param0.field_i + var13, ((bsa) this).field_b + (param3 - -param0.field_n), -((bsa) this).field_h - (var13 - param0.field_m), param0.field_p - (((bsa) this).field_h << -1716952159), ((bsa) this).field_g, ((bsa) this).field_c, 1, 1, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            var11 = (int)(-Math.sin(var9) * (double)var14.field_F);
            var12 = (int)(Math.cos(var9) * (double)var14.field_F);
            bea.a(var7, var8, var11 + var7, var8 + var12, 1);
            if (((bsa) this).field_a == null) {
              break L4;
            } else {
              var13 = var14.field_F + (var14.field_E + ((bsa) this).field_h);
              int discarded$3 = ((bsa) this).field_a.a(param0.field_o, param1 - -param0.field_i + var13, ((bsa) this).field_b + (param3 - -param0.field_n), -((bsa) this).field_h - (var13 - param0.field_m), param0.field_p - (((bsa) this).field_h << -1716952159), ((bsa) this).field_g, ((bsa) this).field_c, 1, 1, 0);
              break L4;
            }
          }
          return;
        }
    }

    bsa(il param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((bsa) this).field_c = param4;
        ((bsa) this).field_e = param6;
        ((bsa) this).field_f = param5;
        ((bsa) this).field_h = param1;
        ((bsa) this).field_a = param0;
        ((bsa) this).field_d = param7;
        ((bsa) this).field_b = param2;
        ((bsa) this).field_g = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
    }
}
