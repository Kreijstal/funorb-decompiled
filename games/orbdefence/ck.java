/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck implements td {
    private int field_a;
    private int field_i;
    static String[] field_h;
    static qg[] field_n;
    private int field_l;
    static kc field_g;
    static String field_k;
    static int field_f;
    static long field_e;
    private int field_b;
    private int field_o;
    static rf field_j;
    private int field_d;
    static hj[] field_c;
    private kc field_m;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ue var12 = null;
        pj stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        pj stackOut_1_0 = null;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          if (!(param2 instanceof ue)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (pj) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (pj) param2;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (ue) (Object) stackIn_3_0;
          if (var12 != null) {
            break L1;
          } else {
            break L1;
          }
        }
        ul.h(param2.field_s + param1, param2.field_n + param0, param2.field_m, param2.field_r, ((ck) this).field_o);
        var7 = -(var12.field_I * 2) + param2.field_m;
        var8 = param2.field_s + param1 + var12.field_I;
        if (param3 == -4394) {
          var9 = param2.field_n + (param0 - -var12.field_L);
          ul.b(var8, var9, var7 + var8, var9, ((ck) this).field_d);
          var10 = -1 + var12.a((byte) -90);
          L2: while (true) {
            if ((var10 ^ -1) > -1) {
              if (null == ((ck) this).field_m) {
                return;
              } else {
                ((ck) this).field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + ((ck) this).field_m.field_z + var9, ((ck) this).field_l, ((ck) this).field_i);
                return;
              }
            } else {
              ul.f(var8 - -(var7 * var12.a(-1, var10) / var12.j(1)), var9, ((ck) this).field_b, ((ck) this).field_a);
              var10--;
              continue L2;
            }
          }
        } else {
          field_j = null;
          var9 = param2.field_n + (param0 - -var12.field_L);
          ul.b(var8, var9, var7 + var8, var9, ((ck) this).field_d);
          var10 = -1 + var12.a((byte) -90);
          L3: while (true) {
            if ((var10 ^ -1) > -1) {
              if (null == ((ck) this).field_m) {
                return;
              } else {
                ((ck) this).field_m.c(var12.field_l, var7 / 2 + var8, var12.field_L + ((ck) this).field_m.field_z + var9, ((ck) this).field_l, ((ck) this).field_i);
                return;
              }
            } else {
              ul.f(var8 - -(var7 * var12.a(-1, var10) / var12.j(1)), var9, ((ck) this).field_b, ((ck) this).field_a);
              var10--;
              continue L3;
            }
          }
        }
    }

    public static void a(int param0) {
        field_g = null;
        field_j = null;
        field_n = null;
        if (param0 != 22499) {
          field_j = null;
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_k = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    ck(kc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((ck) this).field_i = param2;
        ((ck) this).field_o = param4;
        ((ck) this).field_l = param1;
        ((ck) this).field_d = param3;
        ((ck) this).field_a = param6;
        ((ck) this).field_m = param0;
        ((ck) this).field_b = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 256;
        field_k = ",";
    }
}
