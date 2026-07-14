/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk implements ad {
    private int field_e;
    private int field_i;
    static int field_a;
    static boolean[] field_b;
    private int field_f;
    private int field_m;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_j;
    private int field_g;
    private int field_k;
    private int field_l;
    private we field_n;

    public static void a(byte param0) {
        int var1 = 93 / ((param0 - 30) / 58);
        field_b = null;
    }

    final static ln a(int param0) {
        ln var1 = null;
        if (param0 <= 76) {
          return null;
        } else {
          var1 = new ln(pf.field_c, wd.field_a, bg.field_d[0], oc.field_e[0], qk.field_b[0], ng.field_e[0], db.field_b[0], af.field_p);
          ec.a((byte) 24);
          return var1;
        }
    }

    public final void a(int param0, int param1, fe param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ti var11 = null;
        fe stackIn_5_0 = null;
        Object stackOut_4_0 = null;
        fe stackOut_3_0 = null;
        if (param0 == 12088) {
          L0: {
            if (!(param2 instanceof ti)) {
              stackOut_4_0 = null;
              stackIn_5_0 = (fe) (Object) stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = (fe) param2;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            var11 = (ti) (Object) stackIn_5_0;
            if (var11 == null) {
              break L1;
            } else {
              param4 = param4 & var11.field_E;
              break L1;
            }
          }
          L2: {
            var7 = 5592405;
            eh.e(param2.field_u + param1, param3 - -param2.field_t, param2.field_v, param2.field_q, ((mk) this).field_d);
            if (!param4) {
              break L2;
            } else {
              var7 = 16777215;
              break L2;
            }
          }
          var8 = ((mk) this).field_c + (param1 + param2.field_u);
          var9 = param2.field_t + param3 + ((mk) this).field_f;
          eh.b(var8, var9, ((mk) this).field_i, ((mk) this).field_j, 5592405);
          eh.e(var8, var9, ((mk) this).field_i, ((mk) this).field_j, var7);
          if (var11.field_H) {
            L3: {
              eh.d(var8, var9, ((mk) this).field_i + var8, var9 + ((mk) this).field_j, 1);
              eh.d(((mk) this).field_i + var8, var9, var8, var9 - -((mk) this).field_j, 1);
              if (null == ((mk) this).field_n) {
                break L3;
              } else {
                var10 = ((mk) this).field_l + ((mk) this).field_i + ((mk) this).field_c;
                int discarded$2 = ((mk) this).field_n.a(param2.field_s, param1 + param2.field_u + var10, ((mk) this).field_k + param2.field_t + param3, -((mk) this).field_l + -var10 + param2.field_v, param2.field_q - (((mk) this).field_l << -1568029823), ((mk) this).field_e, ((mk) this).field_h, ((mk) this).field_g, ((mk) this).field_m, 0);
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null == ((mk) this).field_n) {
                break L4;
              } else {
                var10 = ((mk) this).field_l + ((mk) this).field_i + ((mk) this).field_c;
                int discarded$3 = ((mk) this).field_n.a(param2.field_s, param1 + param2.field_u + var10, ((mk) this).field_k + param2.field_t + param3, -((mk) this).field_l + -var10 + param2.field_v, param2.field_q - (((mk) this).field_l << -1568029823), ((mk) this).field_e, ((mk) this).field_h, ((mk) this).field_g, ((mk) this).field_m, 0);
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static int b(int param0) {
        if (param0 <= 2) {
            return 108;
        }
        return hb.field_b;
    }

    final static void a(boolean param0, wh param1, int param2) {
        ke.a(param1, param0, 256, false);
        if (param2 != 0) {
            field_b = null;
        }
    }

    mk(we param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((mk) this).field_m = 1;
        ((mk) this).field_g = 1;
        ((mk) this).field_c = param5;
        ((mk) this).field_f = param6;
        ((mk) this).field_i = param8;
        ((mk) this).field_h = param4;
        ((mk) this).field_e = param3;
        ((mk) this).field_j = param7;
        ((mk) this).field_n = param0;
        ((mk) this).field_d = param9;
        ((mk) this).field_k = param2;
        ((mk) this).field_l = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new boolean[64];
    }
}
