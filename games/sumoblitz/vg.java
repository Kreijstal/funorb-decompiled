/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg implements mh {
    private int field_i;
    private int field_f;
    private int field_d;
    private int field_b;
    private vn field_m;
    private int field_j;
    private int field_l;
    private int field_g;
    static int[] field_k;
    private int field_a;
    private int field_c;
    private int field_e;
    private int field_h;

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wr var11 = null;
        pk stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        pk stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof wr)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (pk) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (pk) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (wr) (Object) stackIn_3_0;
          if (var11 == null) {
            break L1;
          } else {
            param3 = param3 & var11.field_x;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          if (param3) {
            var7 = 16777215;
            break L2;
          } else {
            break L2;
          }
        }
        lk.d(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, ((vg) this).field_e);
        var8 = ((vg) this).field_h + param4 - -param0.field_r;
        var9 = ((vg) this).field_g + param0.field_v + param1;
        lk.f(var8, var9, ((vg) this).field_c, ((vg) this).field_j, param2);
        lk.d(var8, var9, ((vg) this).field_c, ((vg) this).field_j, var7);
        if (var11.field_C) {
          L3: {
            lk.e(var8, var9, var8 - -((vg) this).field_c, var9 + ((vg) this).field_j, 1);
            lk.e(((vg) this).field_c + var8, var9, var8, ((vg) this).field_j + var9, 1);
            if (null == ((vg) this).field_m) {
              break L3;
            } else {
              var10 = ((vg) this).field_c - (-((vg) this).field_h - ((vg) this).field_l);
              int discarded$2 = ((vg) this).field_m.a(param0.field_m, param4 - (-param0.field_r - var10), ((vg) this).field_i + param0.field_v + param1, -var10 + -((vg) this).field_l + param0.field_q, -(((vg) this).field_l << 2086782145) + param0.field_p, ((vg) this).field_a, ((vg) this).field_f, ((vg) this).field_d, ((vg) this).field_b, 0);
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (null == ((vg) this).field_m) {
              break L4;
            } else {
              var10 = ((vg) this).field_c - (-((vg) this).field_h - ((vg) this).field_l);
              int discarded$3 = ((vg) this).field_m.a(param0.field_m, param4 - (-param0.field_r - var10), ((vg) this).field_i + param0.field_v + param1, -var10 + -((vg) this).field_l + param0.field_q, -(((vg) this).field_l << 2086782145) + param0.field_p, ((vg) this).field_a, ((vg) this).field_f, ((vg) this).field_d, ((vg) this).field_b, 0);
              break L4;
            }
          }
          return;
        }
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
            vg.a(false);
        }
    }

    vg(vn param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((vg) this).field_b = 1;
        ((vg) this).field_d = 1;
        ((vg) this).field_h = param5;
        ((vg) this).field_i = param2;
        ((vg) this).field_g = param6;
        ((vg) this).field_m = param0;
        ((vg) this).field_e = param9;
        ((vg) this).field_c = param8;
        ((vg) this).field_f = param4;
        ((vg) this).field_l = param1;
        ((vg) this).field_a = param3;
        ((vg) this).field_j = param7;
    }

    static {
    }
}
