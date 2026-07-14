/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg implements de {
    private int field_e;
    static int field_l;
    private int field_d;
    private qe field_k;
    private int field_m;
    static String field_i;
    static int[] field_a;
    private int field_c;
    static boolean field_h;
    private int field_j;
    static wd field_f;
    private int field_g;
    private int field_b;

    final static void a(java.awt.Frame param0, byte param1, ka param2) {
        bk var3 = null;
        L0: while (true) {
          var3 = param2.a(param0, param1 + 12297);
          L1: while (true) {
            if (var3.field_b != 0) {
              if ((var3.field_b ^ -1) == -2) {
                param0.setVisible(false);
                param0.dispose();
                if (param1 != -47) {
                  eg.a((byte) -82);
                  return;
                } else {
                  return;
                }
              } else {
                uc.a(param1 + -51, 100L);
                continue L0;
              }
            } else {
              uc.a(-121, 10L);
              continue L1;
            }
          }
        }
    }

    final static ed a(int param0, int param1, c param2) {
        if (param0 != 29723) {
            return null;
        }
        return new ed(param2, param1 * df.field_n / 1000);
    }

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        el var15 = null;
        uj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        uj stackOut_1_0 = null;
        L0: {
          if (!(param4 instanceof el)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (uj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (uj) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var15 = (el) (Object) stackIn_3_0;
          ki.d(param0 + param4.field_s, param4.field_j + param3, param4.field_i, param4.field_f, ((eg) this).field_b);
          if (var15 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var15.field_K + (param4.field_s + param0);
          var8 = var15.field_G + param4.field_j + param3;
          ki.e(var7, var8, var15.field_I, ((eg) this).field_g);
          if (var15.field_E == -1) {
            break L2;
          } else {
            var9 = (double)var15.field_E * 3.141592653589793 * 2.0 / (double)var15.field_B;
            var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
            var12 = (int)(Math.cos(var9) * (double)var15.field_I);
            ki.e(var7 + var11, var8 + var12, 1, ((eg) this).field_j);
            break L2;
          }
        }
        L3: {
          ki.e(var7, var8, 2, 1);
          var9 = (double)var15.field_F * 3.141592653589793 * 2.0 / (double)var15.field_B;
          var11 = (int)(-Math.sin(var9) * (double)var15.field_I);
          var13 = -54 / ((param2 - 2) / 54);
          var12 = (int)(Math.cos(var9) * (double)var15.field_I);
          ki.a(var7, var8, var11 + var7, var12 + var8, 1);
          if (((eg) this).field_k == null) {
            break L3;
          } else {
            var14 = var15.field_I + var15.field_K - -((eg) this).field_d;
            int discarded$1 = ((eg) this).field_k.a(param4.field_k, var14 + param4.field_s + param0, ((eg) this).field_e + param4.field_j + param3, -((eg) this).field_d + (-var14 + param4.field_i), param4.field_f - (((eg) this).field_d << -2004493151), ((eg) this).field_c, ((eg) this).field_m, 1, 1, 0);
            break L3;
          }
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        if (param2 >= -47) {
          eg.b((byte) 99);
          ig.field_b = param1;
          sb.field_m = param3;
          sd.field_a = param0;
          return;
        } else {
          ig.field_b = param1;
          sb.field_m = param3;
          sd.field_a = param0;
          return;
        }
    }

    final static void b(byte param0) {
        if (param0 >= -20) {
            return;
        }
        jb.field_c = null;
        nh.field_h = null;
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 > -11) {
            return;
        }
        field_i = null;
        field_a = null;
    }

    eg(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((eg) this).field_k = param0;
        ((eg) this).field_m = param4;
        ((eg) this).field_j = param6;
        ((eg) this).field_d = param1;
        ((eg) this).field_e = param2;
        ((eg) this).field_g = param5;
        ((eg) this).field_c = param3;
        ((eg) this).field_b = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = false;
        field_i = "Level 1<br>Defeat the Paragulan fleet<br>attacking our solar system";
    }
}
