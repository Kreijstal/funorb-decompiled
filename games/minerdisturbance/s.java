/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends hc {
    int field_R;
    static ea[] field_L;
    int field_M;
    int field_S;
    static String field_T;
    int field_K;
    static ac field_O;
    int field_J;
    static int field_Q;
    int field_N;
    static int[] field_I;
    static bj field_P;

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            boolean discarded$12 = mb.field_b.a(true, da.field_d, mg.field_a, 0);
            mb.field_b.o(-256);
            L1: while (true) {
              if (!mm.b((byte) 76)) {
                if (dm.field_j != -1) {
                  var1_int = dm.field_j;
                  oj.a(-1, 3);
                  stackOut_8_0 = var1_int;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                } else {
                  if (!wc.field_b) {
                    if (bd.field_h != ci.field_e) {
                      if (!wm.field_f.a(0)) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (ic.field_l != ci.field_e) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  } else {
                    stackOut_11_0 = 3;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  }
                }
              } else {
                boolean discarded$13 = mb.field_b.a((byte) -65, lj.field_t, ud.field_c);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "s.C(" + -27911 + ')');
        }
        return stackIn_24_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, fe param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
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
        var12 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              var8_int = param0 - ((s) this).field_M - ((s) this).field_u - param6;
              var9 = -((s) this).field_t - param1 - (((s) this).field_R - param3);
              if (var8_int * var8_int - -(var9 * var9) < ((s) this).field_J * ((s) this).field_J) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - mh.field_a;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)((s) this).field_N;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((s) this).field_N;
                    break L1;
                  }
                }
                ((s) this).field_S = (int)((double)((s) this).field_N * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((s) this).field_N > ((s) this).field_S) {
                    L3: while (true) {
                      if (((s) this).field_S >= 0) {
                        stackOut_14_0 = 1;
                        stackIn_15_0 = stackOut_14_0;
                        return stackIn_15_0 != 0;
                      } else {
                        ((s) this).field_S = ((s) this).field_S + ((s) this).field_N;
                        continue L3;
                      }
                    }
                  } else {
                    ((s) this).field_S = ((s) this).field_S - ((s) this).field_N;
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
            stackOut_18_1 = new StringBuilder().append("s.RA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param5 == null) {
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
          throw lj.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param6 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int[] var5_array = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param1 == -1) {
              param4--;
              L1: while (true) {
                if (param4 < 0) {
                  break L0;
                } else {
                  var9 = param0;
                  var5_array = var9;
                  var6 = param2;
                  var7 = param3;
                  var9[var6] = (c.a(16711422, var9[var6]) >> 1) + var7;
                  param2++;
                  param4--;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("s.A(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private s() throws Throwable {
        throw new Error();
    }

    public static void m(int param0) {
        field_O = null;
        field_I = null;
        if (param0 >= -113) {
            return;
        }
        field_P = null;
        field_L = null;
        field_T = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        field_T = "Unpacking levels";
        field_I = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            var1 = var0 * 3 / 2 - -var0;
            if (255 < var1) {
                var1 = 255;
            }
            field_I[var0] = c.a(var1 << 16, 16754509);
            field_I[var0] = hi.a(field_I[var0], c.a(var0 * var0 >> 5 << 8, 65366));
        }
    }
}
