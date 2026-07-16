/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class kg extends kn {
    static int field_V;
    private int field_N;
    private int field_W;
    private String field_R;
    static String field_O;
    static int[] field_P;
    static String field_T;
    private boolean field_S;
    private int field_U;
    private lh field_Q;

    public static void c(boolean param0) {
        field_O = null;
        if (param0) {
            int discarded$0 = kg.b(false);
            field_P = null;
            field_T = null;
            return;
        }
        field_P = null;
        field_T = null;
    }

    final static int b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = Chess.field_G;
        var1 = 0;
        L0: while (true) {
          if (!kf.d(18954)) {
            L1: {
              nj.field_u.a(qn.a((byte) 107, re.field_m, ag.field_f), 99, qn.a((byte) 107, hn.field_k, rf.field_b));
              if (nj.field_u.d((byte) 55)) {
                var1 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0) {
              var2 = 0;
              if (var1 != 0) {
                if (nj.field_u.field_h >= 0) {
                  var2 = eh.field_L[nj.field_u.field_h];
                  if (var2 != 2) {
                    return var2;
                  } else {
                    um.a(5);
                    return var2;
                  }
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            } else {
              return -38;
            }
          } else {
            nj.field_u.c((byte) 123);
            if (nj.field_u.d((byte) 66)) {
              var1 = 1;
              continue L0;
            } else {
              continue L0;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_5_0 = 0;
        lh stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        lh stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        lh stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        int stackIn_8_6 = 0;
        int stackIn_8_7 = 0;
        int stackIn_8_8 = 0;
        int stackIn_15_0 = 0;
        lh stackIn_16_0 = null;
        String stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        int stackIn_16_3 = 0;
        int stackIn_16_4 = 0;
        int stackIn_16_5 = 0;
        int stackIn_16_6 = 0;
        int stackIn_16_7 = 0;
        lh stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        int stackIn_17_4 = 0;
        int stackIn_17_5 = 0;
        int stackIn_17_6 = 0;
        int stackIn_17_7 = 0;
        lh stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        int stackIn_18_4 = 0;
        int stackIn_18_5 = 0;
        int stackIn_18_6 = 0;
        int stackIn_18_7 = 0;
        int stackIn_18_8 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        lh stackOut_15_0 = null;
        String stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        int stackOut_15_4 = 0;
        int stackOut_15_5 = 0;
        int stackOut_15_6 = 0;
        int stackOut_15_7 = 0;
        lh stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_17_5 = 0;
        int stackOut_17_6 = 0;
        int stackOut_17_7 = 0;
        int stackOut_17_8 = 0;
        lh stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        int stackOut_16_4 = 0;
        int stackOut_16_5 = 0;
        int stackOut_16_6 = 0;
        int stackOut_16_7 = 0;
        int stackOut_16_8 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        lh stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        lh stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        int stackOut_7_6 = 0;
        int stackOut_7_7 = 0;
        int stackOut_7_8 = 0;
        lh stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        var5 = param3 + ((kg) this).field_u;
        var6 = param0 + ((kg) this).field_r;
        super.a(param0, param1, -96, param3);
        if (param2 < -80) {
          if (0 != param1) {
            return;
          } else {
            L0: {
              if (((kg) this).field_S) {
                stackOut_14_0 = ((kg) this).field_y - (((kg) this).field_W - -(2 * ((kg) this).field_N));
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                stackOut_13_0 = 0;
                stackIn_15_0 = stackOut_13_0;
                break L0;
              }
            }
            L1: {
              var7 = stackIn_15_0;
              stackOut_15_0 = ((kg) this).field_Q;
              stackOut_15_1 = ((kg) this).field_R;
              stackOut_15_2 = var5 + (var7 - -((kg) this).field_N);
              stackOut_15_3 = var6 + ((kg) this).field_N;
              stackOut_15_4 = ((kg) this).field_W + -((kg) this).field_N;
              stackOut_15_5 = -(2 * ((kg) this).field_N) + ((kg) this).field_C;
              stackOut_15_6 = ((kg) this).field_U;
              stackOut_15_7 = -1;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_17_3 = stackOut_15_3;
              stackIn_17_4 = stackOut_15_4;
              stackIn_17_5 = stackOut_15_5;
              stackIn_17_6 = stackOut_15_6;
              stackIn_17_7 = stackOut_15_7;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              stackIn_16_4 = stackOut_15_4;
              stackIn_16_5 = stackOut_15_5;
              stackIn_16_6 = stackOut_15_6;
              stackIn_16_7 = stackOut_15_7;
              if (!((kg) this).field_S) {
                stackOut_17_0 = (lh) (Object) stackIn_17_0;
                stackOut_17_1 = (String) (Object) stackIn_17_1;
                stackOut_17_2 = stackIn_17_2;
                stackOut_17_3 = stackIn_17_3;
                stackOut_17_4 = stackIn_17_4;
                stackOut_17_5 = stackIn_17_5;
                stackOut_17_6 = stackIn_17_6;
                stackOut_17_7 = stackIn_17_7;
                stackOut_17_8 = 2;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                stackIn_18_4 = stackOut_17_4;
                stackIn_18_5 = stackOut_17_5;
                stackIn_18_6 = stackOut_17_6;
                stackIn_18_7 = stackOut_17_7;
                stackIn_18_8 = stackOut_17_8;
                break L1;
              } else {
                stackOut_16_0 = (lh) (Object) stackIn_16_0;
                stackOut_16_1 = (String) (Object) stackIn_16_1;
                stackOut_16_2 = stackIn_16_2;
                stackOut_16_3 = stackIn_16_3;
                stackOut_16_4 = stackIn_16_4;
                stackOut_16_5 = stackIn_16_5;
                stackOut_16_6 = stackIn_16_6;
                stackOut_16_7 = stackIn_16_7;
                stackOut_16_8 = 0;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                stackIn_18_4 = stackOut_16_4;
                stackIn_18_5 = stackOut_16_5;
                stackIn_18_6 = stackOut_16_6;
                stackIn_18_7 = stackOut_16_7;
                stackIn_18_8 = stackOut_16_8;
                break L1;
              }
            }
            int discarded$2 = ((lh) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3, stackIn_18_4, stackIn_18_5, stackIn_18_6, stackIn_18_7, stackIn_18_8, 1, ((kg) this).field_Q.field_C);
            return;
          }
        } else {
          ((kg) this).field_N = -28;
          if (0 != param1) {
            return;
          } else {
            L2: {
              if (((kg) this).field_S) {
                stackOut_4_0 = ((kg) this).field_y - (((kg) this).field_W - -(2 * ((kg) this).field_N));
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_5_0;
              stackOut_5_0 = ((kg) this).field_Q;
              stackOut_5_1 = ((kg) this).field_R;
              stackOut_5_2 = var5 + (var7 - -((kg) this).field_N);
              stackOut_5_3 = var6 + ((kg) this).field_N;
              stackOut_5_4 = ((kg) this).field_W + -((kg) this).field_N;
              stackOut_5_5 = -(2 * ((kg) this).field_N) + ((kg) this).field_C;
              stackOut_5_6 = ((kg) this).field_U;
              stackOut_5_7 = -1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              stackIn_6_3 = stackOut_5_3;
              stackIn_6_4 = stackOut_5_4;
              stackIn_6_5 = stackOut_5_5;
              stackIn_6_6 = stackOut_5_6;
              stackIn_6_7 = stackOut_5_7;
              if (!((kg) this).field_S) {
                stackOut_7_0 = (lh) (Object) stackIn_7_0;
                stackOut_7_1 = (String) (Object) stackIn_7_1;
                stackOut_7_2 = stackIn_7_2;
                stackOut_7_3 = stackIn_7_3;
                stackOut_7_4 = stackIn_7_4;
                stackOut_7_5 = stackIn_7_5;
                stackOut_7_6 = stackIn_7_6;
                stackOut_7_7 = stackIn_7_7;
                stackOut_7_8 = 2;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                stackIn_8_2 = stackOut_7_2;
                stackIn_8_3 = stackOut_7_3;
                stackIn_8_4 = stackOut_7_4;
                stackIn_8_5 = stackOut_7_5;
                stackIn_8_6 = stackOut_7_6;
                stackIn_8_7 = stackOut_7_7;
                stackIn_8_8 = stackOut_7_8;
                break L3;
              } else {
                stackOut_6_0 = (lh) (Object) stackIn_6_0;
                stackOut_6_1 = (String) (Object) stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = stackIn_6_3;
                stackOut_6_4 = stackIn_6_4;
                stackOut_6_5 = stackIn_6_5;
                stackOut_6_6 = stackIn_6_6;
                stackOut_6_7 = stackIn_6_7;
                stackOut_6_8 = 0;
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_8_2 = stackOut_6_2;
                stackIn_8_3 = stackOut_6_3;
                stackIn_8_4 = stackOut_6_4;
                stackIn_8_5 = stackOut_6_5;
                stackIn_8_6 = stackOut_6_6;
                stackIn_8_7 = stackOut_6_7;
                stackIn_8_8 = stackOut_6_8;
                break L3;
              }
            }
            int discarded$3 = ((lh) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5, stackIn_8_6, stackIn_8_7, stackIn_8_8, 1, ((kg) this).field_Q.field_C);
            return;
          }
        }
    }

    kg(int param0, int param1, int param2, int param3, mf param4, boolean param5, int param6, int param7, lh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (jm) null, (rg) null);
        ((kg) this).field_M = param4;
        ((kg) this).field_R = param10;
        ((kg) this).field_S = param5 ? true : false;
        ((kg) this).field_N = param7;
        ((kg) this).field_U = param9;
        ((kg) this).field_Q = param8;
        ((kg) this).field_W = param6;
        int var12 = ((kg) this).field_W + -((kg) this).field_N;
        int var13 = ((kg) this).field_Q.b(param10, var12, ((kg) this).field_Q.field_C) - -(2 * ((kg) this).field_N);
        if (var13 <= param3) {
            var13 = param3;
        } else {
            ((kg) this).a(param1, 34, var13, param2, param0);
        }
        int var14 = !((kg) this).field_S ? ((kg) this).field_N * 2 + ((kg) this).field_W : 0;
        ((kg) this).field_M.a(((kg) this).field_N + (-param3 + var13 >> 1367539777), 34, param3 + -(2 * ((kg) this).field_N), -((kg) this).field_W + (param2 + -(3 * ((kg) this).field_N)), var14);
    }

    final String g(int param0) {
        int var2 = ((kg) this).field_M.field_w ? 1 : 0;
        ((kg) this).field_M.field_w = ((kg) this).field_w;
        String var3 = ((kg) this).field_M.g(param0);
        ((kg) this).field_M.field_w = var2 != 0 ? true : false;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Passwords must be between 5 and 20 characters long";
        field_P = new int[5];
    }
}
