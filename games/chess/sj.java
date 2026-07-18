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
        if (param1 >= 32) {
            if (126 >= param1) {
                return true;
            }
        }
        if (160 <= param1) {
            if (param1 <= 255) {
                return true;
            }
        }
        if (param1 != 8364) {
            if (param1 != 338) {
                if (param1 != 8212) {
                    if (param1 != 339) {
                        if (param1 != 376) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    final static void a(int param0, int param1, ak param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        nk var7 = null;
        nk var8 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var6 = Chess.field_G;
        try {
          L0: {
            var7 = qn.field_U;
            var8 = var7;
            var8.f(param1, -117);
            var8.field_l = var8.field_l + 1;
            var4 = var8.field_l;
            var8.c(1, (byte) 62);
            var8.b(param2.field_s, param0 + 102);
            var8.b(param2.field_t, 114);
            var8.b(param2.field_w, 93);
            var8.d(param2.field_v, (byte) -81);
            var8.d(param2.field_n, (byte) -81);
            var8.d(param2.field_p, (byte) -81);
            var8.d(param2.field_l, (byte) -81);
            var8.c(param2.field_o.length, (byte) 72);
            var5 = param0;
            L1: while (true) {
              if (var5 >= param2.field_o.length) {
                int discarded$1 = var8.b(var4, (byte) -124);
                var8.a(-var4 + var8.field_l, -1);
                break L0;
              } else {
                var7.d(param2.field_o[var5], (byte) -81);
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final static ci a(byte param0) {
        if (param0 != -57) {
            Object var2 = null;
            sj.a(50, 74, (ak) null);
        }
        int discarded$0 = 70;
        return fl.c();
    }

    public static void a() {
        field_e = null;
        field_c = null;
        field_k = null;
        field_p = null;
        field_a = null;
        field_j = null;
        field_d = null;
        field_f = null;
        field_m = null;
        field_t = null;
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nc var12 = null;
        mf stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        mf stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (!(param4 instanceof nc)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (mf) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (mf) param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (nc) (Object) stackIn_4_0;
              if (var12 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            wb.f(param1 - -param4.field_u, param4.field_r + param2, param4.field_y, param4.field_C, ((sj) this).field_o);
            var7 = param4.field_y - 2 * var12.field_U;
            var8 = param4.field_u + param1 - -var12.field_U;
            var9 = var12.field_M + (param4.field_r + param2);
            wb.b(var8, var9, var7 + var8, var9, ((sj) this).field_r);
            var10 = -1 + var12.a(-1);
            L3: while (true) {
              if (var10 < 0) {
                L4: {
                  if (param0 >= 58) {
                    break L4;
                  } else {
                    ci discarded$1 = sj.a((byte) 20);
                    break L4;
                  }
                }
                L5: {
                  if (((sj) this).field_l == null) {
                    break L5;
                  } else {
                    ((sj) this).field_l.b(var12.field_v, var8 - -(var7 / 2), ((sj) this).field_l.field_q + (var9 + var12.field_M), ((sj) this).field_s, ((sj) this).field_g);
                    break L5;
                  }
                }
                break L0;
              } else {
                wb.c(var8 - -(var12.a(var10, (byte) 86) * var7 / var12.f((byte) 118)), var9, ((sj) this).field_q, ((sj) this).field_b);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("sj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    final static void a(String param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
            var2_int = hn.field_k;
            var3 = rf.field_b;
            var4 = qn.field_P.field_xb.b(param0, 500);
            var5 = qn.field_P.field_xb.c(param0, 500) + 6;
            var6 = var4 * fe.field_g - -2;
            var7 = ao.a(var5, true, var2_int, 12);
            int discarded$0 = 0;
            var8 = sg.a(var3, var6, 20);
            int var9 = -14;
            wb.d(var7, var8, var5, var6, 0);
            wb.f(1 + var7, var8 - -1, -2 + var5, -2 + var6, 16777088);
            int discarded$1 = qn.field_P.field_xb.a(param0, 3 + var7, -qn.field_P.field_xb.field_C + jg.field_I + (var8 + 1), 500, 1000, 0, -1, 0, 0, fe.field_g);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "sj.F(" + (param0 != null ? "{...}" : "null") + ',' + 85 + ')');
        }
    }

    sj(lh param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((sj) this).field_l = param0;
            ((sj) this).field_g = param2;
            ((sj) this).field_o = param4;
            ((sj) this).field_q = param5;
            ((sj) this).field_r = param3;
            ((sj) this).field_s = param1;
            ((sj) this).field_b = param6;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "sj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
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
