/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends hf {
    private rb field_M;
    static he field_P;
    static he[] field_I;
    static bb field_O;
    int field_K;
    private int field_N;
    static String field_J;
    static he[] field_Q;
    int field_L;

    final int a(int param0, byte param1) {
        if (param1 == 4) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param0 < ((tl) this).field_M.a(false)) {
                return ((tl) this).field_M.b(param1 + -39, param0);
              } else {
                break L0;
              }
            }
          }
          return -1;
        } else {
          return -25;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, (byte) 123, param4, param5, param6)) {
              L1: {
                if (param3 > 113) {
                  break L1;
                } else {
                  ((tl) this).field_K = 36;
                  break L1;
                }
              }
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            } else {
              L2: {
                var8_int = -((tl) this).field_L + (param4 - param5);
                var9 = ((tl) this).field_w - 2 * ((tl) this).field_L;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = ((tl) this).field_N * var8_int / var9;
                if (param2 == 1) {
                  ((tl) this).field_M.c(var8_int, -106);
                  break L4;
                } else {
                  if (param2 != 2) {
                    break L4;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (((tl) this).field_M.a(false) <= var12) {
                        if (var11 < 0) {
                          return true;
                        } else {
                          ((tl) this).field_M.d(-19, var11);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = ((tl) this).field_M.b(-126, var12) + -var8_int;
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var8;
            stackOut_25_1 = new StringBuilder().append("tl.JA(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_24_0 != 0;
    }

    public static void a() {
        field_O = null;
        field_I = null;
        field_Q = null;
        field_P = null;
        field_J = null;
    }

    final int h(int param0) {
        if (param0 > -19) {
            Object var3 = null;
            boolean discarded$0 = ((tl) this).a(-21, (vg) null, -12, (byte) -12, -64, -54, -43);
        }
        return ((tl) this).field_M.a(false);
    }

    final int i(int param0) {
        if (param0 >= -28) {
            return -25;
        }
        return ((tl) this).field_N;
    }

    final static ja a(lh param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        ja var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ja stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ja stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = param0.e(8, (byte) -110);
            if (var2_int <= 0) {
              L1: {
                int discarded$5 = 0;
                var3 = ti.a(param0) ? 1 : 0;
                int discarded$6 = 0;
                var4 = ti.a(param0) ? 1 : 0;
                var5 = new ja();
                var5.field_q = (short)param0.e(16, (byte) -99);
                var5.field_J = uj.a(param0, (byte) 45, 16, var5.field_J);
                var5.field_w = uj.a(param0, (byte) -122, 16, var5.field_w);
                var5.field_P = uj.a(param0, (byte) -112, 16, var5.field_P);
                var5.field_m = (short)param0.e(16, (byte) 78);
                var5.field_h = uj.a(param0, (byte) 39, 16, var5.field_h);
                var5.field_a = uj.a(param0, (byte) 70, 16, var5.field_a);
                var5.field_K = uj.a(param0, (byte) 71, 16, var5.field_K);
                if (var3 == 0) {
                  break L1;
                } else {
                  var5.field_H = (short)param0.e(16, (byte) -112);
                  var5.field_k = uj.a(param0, (byte) 108, 16, var5.field_k);
                  var5.field_B = uj.a(param0, (byte) -110, 16, var5.field_B);
                  var5.field_E = uj.a(param0, (byte) 24, 16, var5.field_E);
                  var5.field_A = uj.a(param0, (byte) 103, 16, var5.field_A);
                  var5.field_l = uj.a(param0, (byte) -107, 16, var5.field_l);
                  var5.field_e = uj.a(param0, (byte) -100, 16, var5.field_e);
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$7 = param0.e(16, (byte) 82);
                  var5.field_z = uj.a(param0, (byte) 44, 16, var5.field_z);
                  var5.field_v = uj.a(param0, (byte) -116, 16, var5.field_v);
                  var5.field_R = uj.a(param0, (byte) 63, 16, var5.field_R);
                  var5.field_D = uj.a(param0, (byte) -113, 16, var5.field_D);
                  var5.field_L = uj.a(param0, (byte) 60, 16, var5.field_L);
                  break L2;
                }
              }
              L3: {
                int discarded$8 = 0;
                if (ti.a(param0)) {
                  var5.field_M = uj.a(param0, (byte) 13, 16, var5.field_M);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                int discarded$9 = 0;
                if (ti.a(param0)) {
                  var5.field_O = nl.a((byte) 65, 16, param0, var5.field_O);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var5.field_O.length) {
                      if (0 != var6) {
                        var5.field_G = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_O = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((var5.field_O[var7] & 255) <= var6) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              stackOut_20_0 = (ja) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("tl.B(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 105 + ')');
        }
        return stackIn_21_0;
    }

    private tl() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = "Please wait...";
    }
}
