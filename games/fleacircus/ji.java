/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji {
    static int field_a;
    private int[] field_d;
    static String field_b;
    private double[] field_e;
    private double[] field_g;
    private double field_h;
    private int field_c;
    static int field_i;
    static dd[] field_f;
    private double field_j;

    final boolean a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var2 = param0 ? 1 : 0;
        var3 = -1 + ((ji) this).field_e.length;
        L0: while (true) {
          if (var3 < 0) {
            L1: {
              L2: {
                if (var2 != 0) {
                  break L2;
                } else {
                  if (((ji) this).field_c > 0) {
                    stackOut_13_0 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
            return stackIn_14_0 != 0;
          } else {
            L3: {
              L4: {
                stackOut_2_0 = var2;
                stackIn_7_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (0.0 >= ((ji) this).field_e[var3]) {
                  break L4;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackIn_7_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (((ji) this).field_e[var3] >= 640.0) {
                    break L4;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (((ji) this).field_g[var3] <= 0.0) {
                      break L4;
                    } else {
                      stackOut_5_0 = stackIn_5_0;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (480.0 > ((ji) this).field_g[var3]) {
                        stackOut_8_0 = stackIn_8_0;
                        stackOut_8_1 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L3;
                      } else {
                        stackOut_6_0 = stackIn_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        break L4;
                      }
                    }
                  }
                }
              }
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L3;
            }
            var2 = stackIn_9_0 & stackIn_9_1;
            var3--;
            continue L0;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        int var1 = 0;
        field_f = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (param0) {
          var2 = ((ji) this).field_c * 240 / 255;
          gb.a((int)((ji) this).field_e[0] << 4, (int)((ji) this).field_g[0] << 4, 64, ((ji) this).field_c, ((ji) this).field_d);
          var3 = 1;
          L0: while (true) {
            if (20 <= var3) {
              return;
            } else {
              var2 = (-var3 + 20) * (((ji) this).field_c * 12) / 255;
              gb.a((int)((ji) this).field_e[var3] << 4, (int)((ji) this).field_g[var3] << 4, 32, var2, ((ji) this).field_d);
              gb.a((int)(((ji) this).field_e[-1 + var3] + ((ji) this).field_e[var3]) << 3, (int)(((ji) this).field_g[var3] + ((ji) this).field_g[var3 - 1]) << 3, 32, var2, ((ji) this).field_d);
              var3++;
              continue L0;
            }
          }
        } else {
          var5 = null;
          bi discarded$1 = ji.a((rh) null, 11, 87, -10);
          var2 = ((ji) this).field_c * 240 / 255;
          gb.a((int)((ji) this).field_e[0] << 4, (int)((ji) this).field_g[0] << 4, 64, ((ji) this).field_c, ((ji) this).field_d);
          var3 = 1;
          L1: while (true) {
            if (20 <= var3) {
              return;
            } else {
              var2 = (-var3 + 20) * (((ji) this).field_c * 12) / 255;
              gb.a((int)((ji) this).field_e[var3] << 4, (int)((ji) this).field_g[var3] << 4, 32, var2, ((ji) this).field_d);
              gb.a((int)(((ji) this).field_e[-1 + var3] + ((ji) this).field_e[var3]) << 3, (int)(((ji) this).field_g[var3] + ((ji) this).field_g[var3 - 1]) << 3, 32, var2, ((ji) this).field_d);
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a() {
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        var3 = 19;
        L0: while (true) {
          if (0 >= var3) {
            if (param1 > -37) {
              boolean discarded$1 = ((ji) this).a(false);
              ((ji) this).field_e[0] = ((ji) this).field_e[0] + ((ji) this).field_j;
              ((ji) this).field_g[0] = ((ji) this).field_g[0] + ((ji) this).field_h;
              ((ji) this).field_h = ((ji) this).field_h + bc.field_Y;
              ((ji) this).field_c = ((ji) this).field_c - param0;
              return;
            } else {
              ((ji) this).field_e[0] = ((ji) this).field_e[0] + ((ji) this).field_j;
              ((ji) this).field_g[0] = ((ji) this).field_g[0] + ((ji) this).field_h;
              ((ji) this).field_h = ((ji) this).field_h + bc.field_Y;
              ((ji) this).field_c = ((ji) this).field_c - param0;
              return;
            }
          } else {
            ((ji) this).field_e[var3] = ((ji) this).field_e[-1 + var3];
            ((ji) this).field_g[var3] = ((ji) this).field_g[-1 + var3];
            var3--;
            continue L0;
          }
        }
    }

    final static bi a(rh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        bi stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        bi stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 == -21460) {
              if (ha.a(param0, param2 ^ 11872, param1, param3)) {
                stackOut_6_0 = kl.a(-88);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (bi) (Object) stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (bi) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ji.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    ji(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        double[] var6 = null;
        int var7 = 0;
        double var5_double = 0.0;
        ((ji) this).field_g = new double[20];
        ((ji) this).field_e = new double[20];
        ((ji) this).field_c = 249;
        try {
            ((ji) this).field_e[0] = (double)param0;
            ((ji) this).field_g[0] = (double)param1;
            ((ji) this).field_d = param3;
            for (var5_int = 1; 20 > var5_int; var5_int++) {
                var6 = ((ji) this).field_e;
                ((ji) this).field_g[var5_int] = -1000.0;
                var7 = var5_int;
                var6[var7] = -1000.0;
            }
            var5_double = (double)(db.a((byte) -115, na.field_c, 10) + 15) / 10.0;
            ((ji) this).field_j = ma.a((double)param2 * 3.141592653589793 / 512.0, 70) * var5_double;
            ((ji) this).field_h = nb.a(3.141592653589793 * (double)param2 / 512.0, -127) * var5_double;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Instructions";
        field_i = 1;
    }
}
