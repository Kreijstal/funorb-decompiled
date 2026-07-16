/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj implements jm {
    static String[] field_j;
    static String field_a;
    static int field_n;
    static String field_f;
    static String field_t;
    static ci field_k;
    static String field_c;
    private lh field_l;
    static String[] field_e;
    static String field_m;
    private int field_o;
    static String field_p;
    private int field_s;
    private int field_r;
    private int field_g;
    static long field_h;
    private int field_b;
    static long field_i;
    static lh field_d;
    private int field_q;

    final static boolean a(byte param0, char param1) {
        L0: {
          if (param1 < 32) {
            break L0;
          } else {
            if (126 < param1) {
              break L0;
            } else {
              return true;
            }
          }
        }
        L1: {
          if (160 > param1) {
            break L1;
          } else {
            if (param1 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (param1 == 8364) {
            break L2;
          } else {
            if (param1 == 338) {
              break L2;
            } else {
              if (param1 == 8212) {
                break L2;
              } else {
                if (param1 == 339) {
                  break L2;
                } else {
                  if (param1 == 376) {
                    break L2;
                  } else {
                    if (param0 <= -95) {
                      return false;
                    } else {
                      field_p = null;
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        return true;
    }

    final static void a(int param0, int param1, ak param2) {
        int var5 = 0;
        int var6 = Chess.field_G;
        nk var7 = qn.field_U;
        nk var8 = var7;
        var8.f(param1, -117);
        var8.field_l = var8.field_l + 1;
        int var4 = var8.field_l;
        var8.c(1, (byte) 62);
        var8.b(param2.field_s, param0 + 102);
        var8.b(param2.field_t, 114);
        var8.b(param2.field_w, 93);
        var8.d(param2.field_v, (byte) -81);
        var8.d(param2.field_n, (byte) -81);
        var8.d(param2.field_p, (byte) -81);
        var8.d(param2.field_l, (byte) -81);
        var8.c(param2.field_o.length, (byte) 72);
        for (var5 = param0; var5 < param2.field_o.length; var5++) {
            var7.d(param2.field_o[var5], (byte) -81);
        }
        int discarded$0 = var8.b(var4, (byte) -124);
        var8.a(-var4 + var8.field_l, -1);
    }

    final static ci a(byte param0) {
        if (param0 != -57) {
            Object var2 = null;
            sj.a(50, 74, (ak) null);
        }
        return fl.c((byte) 70);
    }

    public static void a(boolean param0) {
        field_e = null;
        field_c = null;
        field_k = null;
        field_p = null;
        field_a = null;
        field_j = null;
        field_d = null;
        if (!param0) {
            return;
        }
        field_f = null;
        field_m = null;
        field_t = null;
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nc var12 = null;
        mf stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        mf stackOut_1_0 = null;
        L0: {
          var11 = Chess.field_G;
          if (!(param4 instanceof nc)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (mf) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (mf) param4;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (nc) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        wb.f(param1 - -param4.field_u, param4.field_r + param2, param4.field_y, param4.field_C, ((sj) this).field_o);
        var7 = param4.field_y - 2 * var12.field_U;
        var8 = param4.field_u + param1 - -var12.field_U;
        var9 = var12.field_M + (param4.field_r + param2);
        wb.b(var8, var9, var7 + var8, var9, ((sj) this).field_r);
        var10 = -1 + var12.a(-1);
        L2: while (true) {
          if (var10 < 0) {
            L3: {
              if (param0 >= 58) {
                break L3;
              } else {
                ci discarded$1 = sj.a((byte) 20);
                break L3;
              }
            }
            L4: {
              if (((sj) this).field_l == null) {
                break L4;
              } else {
                ((sj) this).field_l.b(var12.field_v, var8 - -(var7 / 2), ((sj) this).field_l.field_q + (var9 + var12.field_M), ((sj) this).field_s, ((sj) this).field_g);
                break L4;
              }
            }
            return;
          } else {
            wb.c(var8 - -(var12.a(var10, (byte) 86) * var7 / var12.f((byte) 118)), var9, ((sj) this).field_q, ((sj) this).field_b);
            var10--;
            continue L2;
          }
        }
    }

    final static void a(String param0, byte param1) {
        int var2 = hn.field_k;
        int var3 = rf.field_b;
        int var4 = qn.field_P.field_xb.b(param0, 500);
        int var5 = qn.field_P.field_xb.c(param0, 500) + 6;
        int var6 = var4 * fe.field_g - -2;
        int var7 = ao.a(var5, true, var2, 12);
        int var8 = sg.a(var3, var6, 20, 0);
        int var9 = -59 / ((param1 - -64) / 37);
        wb.d(var7, var8, var5, var6, 0);
        wb.f(1 + var7, var8 - -1, -2 + var5, -2 + var6, 16777088);
        int discarded$0 = qn.field_P.field_xb.a(param0, 3 + var7, -qn.field_P.field_xb.field_C + jg.field_I + (var8 + 1), 500, 1000, 0, -1, 0, 0, fe.field_g);
    }

    sj(lh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((sj) this).field_l = param0;
        ((sj) this).field_g = param2;
        ((sj) this).field_o = param4;
        ((sj) this).field_q = param5;
        ((sj) this).field_r = param3;
        ((sj) this).field_s = param1;
        ((sj) this).field_b = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 250;
        field_t = "Medium";
        field_c = "Black in check";
        field_j = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        field_f = "Encouraging rule breaking";
        field_m = "Close";
        field_a = "Click";
        field_p = "Accept invitation to <%0>'s game";
    }
}
