/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class j extends ck {
    int field_I;
    int field_N;
    int field_P;
    int field_K;
    static String[] field_S;
    int field_R;
    static en field_Q;
    static String[] field_O;
    static String[] field_L;
    int field_M;
    static int field_J;

    final boolean a(lm param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        double var11 = 0.0;
        int var13 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var13 = DungeonAssault.field_K;
        try {
          L0: {
            var8_int = -19 / ((-80 - param5) / 35);
            if (!super.a(param0, param1, param2, param3, param4, (byte) 31, param6)) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              var9 = param4 + (-param3 - ((j) this).field_q + -((j) this).field_I);
              var10 = param2 - param6 + (-((j) this).field_v + -((j) this).field_R);
              if (((j) this).field_M * ((j) this).field_M > var9 * var9 - -(var10 * var10)) {
                L1: {
                  var11 = Math.atan2((double)var10, (double)var9) - jd.field_j;
                  if (var11 >= 0.0) {
                    if (0.0 < var11) {
                      var11 = var11 + 3.141592653589793 / (double)((j) this).field_N;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var11 = var11 - 3.141592653589793 / (double)((j) this).field_N;
                    break L1;
                  }
                }
                ((j) this).field_K = (int)((double)((j) this).field_N * var11 / 6.283185307179586);
                L2: while (true) {
                  if (((j) this).field_N > ((j) this).field_K) {
                    L3: while (true) {
                      if (((j) this).field_K >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((j) this).field_K = ((j) this).field_K + ((j) this).field_N;
                        continue L3;
                      }
                    }
                  } else {
                    ((j) this).field_K = ((j) this).field_K - ((j) this).field_N;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var8;
            stackOut_18_1 = new StringBuilder().append("j.U(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_17_0 != 0;
    }

    final static java.net.URL a(byte param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (null == ql.field_a) {
                break L1;
              } else {
                if (ql.field_a.equals((Object) (Object) param2.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) ql.field_a;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              var4 = null;
              if (pa.field_b == null) {
                break L2;
              } else {
                if (!pa.field_b.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) pa.field_b;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param0 >= 87) {
              stackOut_10_0 = ng.a(-1, 0, (String) var4, (String) var3, param1);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (java.net.URL) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("j.E(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            var2_int = param0.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param0.length() <= var3) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (param0.charAt(var3) == var2_int) {
                  var3++;
                  continue L1;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("j.F(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + -124 + 41);
        }
        return stackIn_10_0 != 0;
    }

    public static void g(byte param0) {
        field_S = null;
        int var1 = 107;
        field_Q = null;
        field_O = null;
        field_L = null;
    }

    final static void f(byte param0) {
        gj.a(new int[0], 0, 0, (byte) 33, 1, 0, 1, 0, 1, 1, 1);
        gj.a(new int[0], 0, 0, (byte) 33, 3, 0, 2, 100, 2, 1, 1);
        gj.a(new int[0], 1, 0, (byte) 33, 4, 0, 2, 150, 1, 2, 1);
        gj.a(new int[0], -1, 0, (byte) 33, 2, 0, 1, 200, 3, 1, 2);
        gj.a(new int[0], -1, 0, (byte) 33, 13, 3500, 3, 300, 1, 4, 0);
        gj.a(new int[1], -1, 0, (byte) 33, 7, 4500, 1, 350, 3, 3, 1);
        gj.a(new int[0], -1, 0, (byte) 33, 6, 6500, 4, 400, 1, 1, 3);
        gj.a(new int[1], -1, 0, (byte) 33, 5, 7500, 2, 500, 2, 3, 3);
        gj.a(new int[1], -1, 1, (byte) 33, 34, 10000, 1, 550, 2, 3, 4);
        gj.a(new int[1], -1, 0, (byte) 33, 17, 12500, 4, 600, 2, 4, 0);
        gj.a(new int[1], 0, 1, (byte) 33, 11, 14500, 1, 800, 5, 4, 2);
        gj.a(new int[0], -1, 1, (byte) 33, 15, 16500, 3, 850, 4, 3, 4);
        gj.a(new int[1], 1, 0, (byte) 33, 16, 18500, 5, 900, 4, 3, 1);
        gj.a(new int[0], -1, 1, (byte) 33, 8, 20000, 6, 1000, 1, 5, 1);
        gj.a(new int[0], 1, 1, (byte) 33, 10, 21500, 7, 1100, 1, 1, 5);
        gj.a(new int[1], -1, 0, (byte) 33, 20, 23000, 3, 1150, 6, 3, 5);
        gj.a(new int[0], -1, 0, (byte) 33, 24, 24500, 6, 1200, 1, 7, 0);
        gj.a(new int[1], -1, -1, (byte) 33, 12, 27500, 4, 1300, 2, 5, 4);
        gj.a(new int[0], -1, -1, (byte) 33, 32, 29000, 7, 1400, 7, 4, 2);
        gj.a(new int[1], -1, 0, (byte) 33, 9, 31000, 5, 1450, 3, 5, 3);
        gj.a(new int[1], -1, 0, (byte) 33, 19, 33000, 3, 1500, 2, 4, 2);
        gj.a(new int[1], -1, 1, (byte) 33, 28, 35000, 5, 1600, 5, 7, 0);
        gj.a(new int[1], -1, 0, (byte) 33, 25, 37500, 2, 1800, 8, 3, 8);
        gj.a(new int[1], -1, 1, (byte) 33, 14, 40000, 1, 1900, 4, 6, 6);
        gj.a(new int[1], -1, 0, (byte) 33, 21, 42500, 8, 2000, 7, 2, 0);
        gj.a(new int[1], -1, 1, (byte) 33, 18, 45000, 4, 2100, 7, 7, 5);
        gj.a(new int[2], -1, 1, (byte) 33, 23, 47500, 10, 2200, 0, 0, 0);
        gj.a(new int[0], -1, -1, (byte) 33, 26, 50000, 6, 2300, 6, 6, 6);
        gj.a(new int[1], -1, 0, (byte) 33, 27, 52500, 8, 2400, 4, 9, 1);
        gj.a(new int[0], -1, 1, (byte) 33, 22, 55000, 8, 2500, 5, 5, 9);
        gj.a(new int[1], -1, 3, (byte) 33, 29, 59000, 7, 2700, 2, 6, 2);
        gj.a(new int[1], -1, 2, (byte) 33, 33, 63000, 6, 2800, 9, 6, 9);
        gj.a(new int[1], -1, -1, (byte) 33, 30, 67500, 9, 3000, 0, 9, 0);
        gj.a(new int[2], -1, 3, (byte) 33, 31, 70000, 10, 5000, 10, 10, 10);
    }

    private j() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_S = new String[]{"Dark Arts", "The dark powers can be wielded by the <%0> equally well for both attack and defence. The <%0> can readjust the balance as she sees fit. (Single use)"};
        field_O = new String[]{"<%0> of the Orb", "<%0> the Wise", "<%0> the Cunning", "<%0> the Potent", "<%0> the Mighty", "<%0>, Master of the Tower", "<%0> the Magnificent", "<%0> the Unbound"};
        field_L = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
