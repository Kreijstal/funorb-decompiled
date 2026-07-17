/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends d {
    static String[] field_Q;
    static String field_P;
    int field_I;
    int field_L;
    static long field_N;
    int field_T;
    int field_S;
    static dm field_O;
    int field_M;
    int field_J;
    static int field_K;
    static int field_H;
    static String field_R;

    final static int a(int param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 113) {
                break L1;
              } else {
                field_R = null;
                break L1;
              }
            }
            if (!param2) {
              stackOut_5_0 = oc.field_s.c(param1);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = hd.field_f.c(param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ao.C(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(int param0, r param1) {
        er var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new er(param1.a("final_frame.jpg", "", 0), (java.awt.Component) (Object) ne.field_F);
            var3 = var2.field_y;
            var4 = var2.field_t;
            tg.a((byte) -31);
            qn.field_r = new er(var3, param0 * var4 / 4);
            qn.field_r.d();
            var2.c(0, 0);
            lr.field_O = new er(var3, -qn.field_r.field_t + var4);
            lr.field_O.d();
            var2.c(0, -qn.field_r.field_t);
            lr.field_O.field_z = qn.field_r.field_t;
            ln.d(-28558);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "ao.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private ao() throws Throwable {
        throw new Error();
    }

    public static void h() {
        field_O = null;
        field_P = null;
        field_R = null;
        field_Q = null;
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, (byte) -119, param6)) {
              L1: {
                if (param5 <= -107) {
                  break L1;
                } else {
                  var13 = null;
                  ao.a(41, (r) null);
                  break L1;
                }
              }
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              L2: {
                var8_int = param0 - param1 - ((ao) this).field_o - ((ao) this).field_J;
                var9 = param6 + -((ao) this).field_t + (-param2 + -((ao) this).field_M);
                if (((ao) this).field_L * ((ao) this).field_L <= var9 * var9 + var8_int * var8_int) {
                  break L2;
                } else {
                  L3: {
                    var10 = Math.atan2((double)var9, (double)var8_int) - lb.field_g;
                    if (0.0 > var10) {
                      var10 = var10 - 3.141592653589793 / (double)((ao) this).field_S;
                      break L3;
                    } else {
                      if (0.0 < var10) {
                        var10 = var10 + 3.141592653589793 / (double)((ao) this).field_S;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((ao) this).field_T = (int)((double)((ao) this).field_S * var10 / 6.283185307179586);
                  L4: while (true) {
                    if (((ao) this).field_T < ((ao) this).field_S) {
                      L5: while (true) {
                        if (((ao) this).field_T >= 0) {
                          break L2;
                        } else {
                          ((ao) this).field_T = ((ao) this).field_T + ((ao) this).field_S;
                          continue L5;
                        }
                      }
                    } else {
                      ((ao) this).field_T = ((ao) this).field_T - ((ao) this).field_S;
                      continue L4;
                    }
                  }
                }
              }
              stackOut_13_0 = 1;
              stackIn_14_0 = stackOut_13_0;
              return stackIn_14_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var8;
            stackOut_19_1 = new StringBuilder().append("ao.JA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_18_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_K = 3;
        field_P = "Show chat (<%0> unread messages)";
        field_R = "<col=ee9d32>The controls</col>";
    }
}
