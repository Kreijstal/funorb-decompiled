/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka implements jm {
    private int field_d;
    static String field_b;
    private int field_m;
    private int field_n;
    static hg field_j;
    private lh field_p;
    private int field_k;
    private int field_i;
    private int field_f;
    static int field_h;
    private int field_l;
    static String[] field_g;
    static int field_c;
    static vl field_a;
    static String field_e;
    static float field_o;

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        od var14 = null;
        mf stackIn_3_0 = null;
        mf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof od) {
            stackOut_2_0 = (mf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (mf) (Object) stackOut_1_0;
            break L0;
          }
        }
        var14 = (od) (Object) stackIn_3_0;
        wb.f(param1 + param4.field_u, param2 + param4.field_r, param4.field_y, param4.field_C, ((ka) this).field_l);
        if (param0 < 58) {
          L1: {
            ((ka) this).field_p = null;
            if (var14 != null) {
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var7 = param1 + param4.field_u - -var14.field_Q;
            var8 = param4.field_r + (param2 - -var14.field_M);
            wb.c(var7, var8, var14.field_T, ((ka) this).field_k);
            if (0 == (var14.field_S ^ -1)) {
              break L2;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_P;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
              var12 = (int)(Math.cos(var9) * (double)var14.field_T);
              wb.c(var7 + var11, var8 + var12, 1, ((ka) this).field_n);
              break L2;
            }
          }
          L3: {
            wb.c(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_R * 3.141592653589793) / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
            var12 = (int)(Math.cos(var9) * (double)var14.field_T);
            wb.b(var7, var8, var11 + var7, var12 + var8, 1);
            if (((ka) this).field_p != null) {
              var13 = ((ka) this).field_f + (var14.field_T + var14.field_Q);
              int discarded$2 = ((ka) this).field_p.a(param4.field_v, param4.field_u + (param1 - -var13), ((ka) this).field_m + param2 + param4.field_r, param4.field_y + (-((ka) this).field_f + -var13), -(((ka) this).field_f << -33529503) + param4.field_C, ((ka) this).field_d, ((ka) this).field_i, 1, 1, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (var14 != null) {
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var7 = param1 + param4.field_u - -var14.field_Q;
            var8 = param4.field_r + (param2 - -var14.field_M);
            wb.c(var7, var8, var14.field_T, ((ka) this).field_k);
            if (0 == (var14.field_S ^ -1)) {
              break L5;
            } else {
              var9 = 2.0 * (3.141592653589793 * (double)var14.field_S) / (double)var14.field_P;
              var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
              var12 = (int)(Math.cos(var9) * (double)var14.field_T);
              wb.c(var7 + var11, var8 + var12, 1, ((ka) this).field_n);
              break L5;
            }
          }
          L6: {
            wb.c(var7, var8, 2, 1);
            var9 = 2.0 * ((double)var14.field_R * 3.141592653589793) / (double)var14.field_P;
            var11 = (int)(-Math.sin(var9) * (double)var14.field_T);
            var12 = (int)(Math.cos(var9) * (double)var14.field_T);
            wb.b(var7, var8, var11 + var7, var12 + var8, 1);
            if (((ka) this).field_p != null) {
              var13 = ((ka) this).field_f + (var14.field_T + var14.field_Q);
              int discarded$3 = ((ka) this).field_p.a(param4.field_v, param4.field_u + (param1 - -var13), ((ka) this).field_m + param2 + param4.field_r, param4.field_y + (-((ka) this).field_f + -var13), -(((ka) this).field_f << -33529503) + param4.field_C, ((ka) this).field_d, ((ka) this).field_i, 1, 1, 0);
              break L6;
            } else {
              break L6;
            }
          }
          return;
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = 0;
        ak var4 = null;
        fd var5 = null;
        var3 = Chess.field_G;
        var4 = (ak) (Object) nc.field_O.g(-18110);
        if (param0 <= -31) {
          L0: while (true) {
            if (var4 == null) {
              var5 = (fd) (Object) fb.field_L.g(-18110);
              L1: while (true) {
                if (var5 != null) {
                  pk.a(param1, -90, var5);
                  var5 = (fd) (Object) fb.field_L.a((byte) -121);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              sj.a(0, param1, var4);
              var4 = (ak) (Object) nc.field_O.a((byte) -112);
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 != -122) {
          field_j = null;
          field_g = null;
          field_j = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_g = null;
          field_j = null;
          field_b = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    ka(lh param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ka) this).field_i = param4;
        ((ka) this).field_d = param3;
        ((ka) this).field_m = param2;
        ((ka) this).field_p = param0;
        ((ka) this).field_k = param5;
        ((ka) this).field_f = param1;
        ((ka) this).field_n = param6;
        ((ka) this).field_l = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Report abuse";
        field_h = 1;
        field_j = new hg(4, 1, 1, 1);
        field_c = 0;
        field_e = "Creating your account";
    }
}
