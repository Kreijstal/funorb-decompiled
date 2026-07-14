/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb implements ch {
    private int field_i;
    private fa field_h;
    private int field_g;
    private int field_d;
    private int field_l;
    private int field_k;
    private int field_a;
    private int field_e;
    private int field_j;
    static int field_m;
    private int field_c;
    private int field_f;
    private int field_b;

    final static jh a(rh param0, int param1, int param2, int param3, rh param4) {
        if (ha.a(param0, -32180, param2, param3)) {
          if (param1 != 5592405) {
            return null;
          } else {
            return lc.a(param4.a(param2, (byte) 122, param3), false);
          }
        } else {
          return null;
        }
    }

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        vk var12 = null;
        qa stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qa stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof vk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qa) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qa) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (vk) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            param2 = param2 & var12.field_D;
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          gb.e(param1 - -param3.field_y, param3.field_z + param4, param3.field_u, param3.field_j, ((lb) this).field_i);
          if (!param2) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        var8 = ((lb) this).field_g + param3.field_y + param1;
        if (param0 >= -36) {
          L3: {
            var11 = null;
            ((lb) this).a(-124, -13, false, (qa) null, -107);
            var9 = ((lb) this).field_b + param3.field_z + param4;
            gb.f(var8, var9, ((lb) this).field_e, ((lb) this).field_l, 5592405);
            gb.e(var8, var9, ((lb) this).field_e, ((lb) this).field_l, var7);
            if (var12.field_G) {
              gb.d(var8, var9, ((lb) this).field_e + var8, var9 + ((lb) this).field_l, 1);
              gb.d(((lb) this).field_e + var8, var9, var8, ((lb) this).field_l + var9, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (null == ((lb) this).field_h) {
              break L4;
            } else {
              var10 = ((lb) this).field_d + (((lb) this).field_e - -((lb) this).field_g);
              int discarded$2 = ((lb) this).field_h.a(param3.field_i, param3.field_y + param1 + var10, ((lb) this).field_a + param3.field_z + param4, -var10 - (((lb) this).field_d - param3.field_u), -(((lb) this).field_d << -429411679) + param3.field_j, ((lb) this).field_j, ((lb) this).field_c, ((lb) this).field_f, ((lb) this).field_k, 0);
              break L4;
            }
          }
          return;
        } else {
          L5: {
            var9 = ((lb) this).field_b + param3.field_z + param4;
            gb.f(var8, var9, ((lb) this).field_e, ((lb) this).field_l, 5592405);
            gb.e(var8, var9, ((lb) this).field_e, ((lb) this).field_l, var7);
            if (var12.field_G) {
              gb.d(var8, var9, ((lb) this).field_e + var8, var9 + ((lb) this).field_l, 1);
              gb.d(((lb) this).field_e + var8, var9, var8, ((lb) this).field_l + var9, 1);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null == ((lb) this).field_h) {
              break L6;
            } else {
              var10 = ((lb) this).field_d + (((lb) this).field_e - -((lb) this).field_g);
              int discarded$3 = ((lb) this).field_h.a(param3.field_i, param3.field_y + param1 + var10, ((lb) this).field_a + param3.field_z + param4, -var10 - (((lb) this).field_d - param3.field_u), -(((lb) this).field_d << -429411679) + param3.field_j, ((lb) this).field_j, ((lb) this).field_c, ((lb) this).field_f, ((lb) this).field_k, 0);
              break L6;
            }
          }
          return;
        }
    }

    lb(fa param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((lb) this).field_k = 1;
        ((lb) this).field_f = 1;
        ((lb) this).field_d = param1;
        ((lb) this).field_g = param5;
        ((lb) this).field_b = param6;
        ((lb) this).field_i = param9;
        ((lb) this).field_e = param8;
        ((lb) this).field_c = param4;
        ((lb) this).field_l = param7;
        ((lb) this).field_h = param0;
        ((lb) this).field_j = param3;
        ((lb) this).field_a = param2;
    }

    static {
    }
}
