/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh extends d {
    int field_R;
    int field_K;
    int field_W;
    static String field_V;
    static wq field_N;
    static boolean field_L;
    int field_Q;
    static cd field_X;
    static String field_T;
    static mf field_S;
    int field_Z;
    static String field_P;
    static String field_Y;
    static int field_U;
    int field_O;
    static String field_M;

    public static void a(int param0) {
        field_V = null;
        field_M = null;
        field_N = null;
        field_P = null;
        field_S = null;
        field_X = null;
        field_T = null;
        field_Y = null;
    }

    final boolean a(oc param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              var8_int = param1 + (-((vh) this).field_o + -param2) + -((vh) this).field_Z;
              var9 = -param3 - ((vh) this).field_w - ((vh) this).field_R + param5;
              if (var8_int * var8_int + var9 * var9 < ((vh) this).field_W * ((vh) this).field_W) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - hh.field_d;
                  if (0.0 <= var10) {
                    if (0.0 >= var10) {
                      break L1;
                    } else {
                      var10 = var10 + 3.141592653589793 / (double)((vh) this).field_K;
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((vh) this).field_K;
                    break L1;
                  }
                }
                ((vh) this).field_O = (int)(var10 * (double)((vh) this).field_K / 6.283185307179586);
                L2: while (true) {
                  if (((vh) this).field_K > ((vh) this).field_O) {
                    L3: while (true) {
                      if (((vh) this).field_O >= 0) {
                        stackOut_13_0 = 1;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        ((vh) this).field_O = ((vh) this).field_O + ((vh) this).field_K;
                        continue L3;
                      }
                    }
                  } else {
                    ((vh) this).field_O = ((vh) this).field_O - ((vh) this).field_K;
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
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("vh.MA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final static int h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (!jl.a((byte) 5)) {
                L2: {
                  fi.field_r.a(aj.a(param0 + param0, po.field_a, pq.field_k), param0 ^ 27479, aj.a(0, qo.field_O, tb.field_fb));
                  if (!fi.field_r.a((byte) 113)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (fi.field_r.field_j >= 0) {
                      var2 = hi.field_A[fi.field_r.field_j];
                      if (var2 != 2) {
                        break L3;
                      } else {
                        ae.b((byte) 99);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_13_0 = var2;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                fi.field_r.d(param0 + -1);
                if (fi.field_r.a((byte) 113)) {
                  var1_int = 1;
                  continue L1;
                } else {
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "vh.B(" + param0 + 41);
        }
        return stackIn_14_0;
    }

    final static void a(int param0, byte param1, String param2, String[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var4_int = 25 % ((param1 - -25) / 49);
          ik.field_g = up.field_v;
          if (param0 != 255) {
            if (param0 < 100) {
              ni.field_Rb = i.a(param0, -126, param2);
              return;
            } else {
              if (param0 > 105) {
                ni.field_Rb = i.a(param0, -126, param2);
                return;
              } else {
                ni.field_Rb = lm.a(-2079, param3);
                return;
              }
            }
          } else {
            L0: {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (vo.field_x >= 13) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L0;
              }
            }
            ni.field_Rb = cd.a(stackIn_5_0 != 0, stackIn_5_1 != 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("vh.C(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
    }

    private vh() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Sticky: any balls that hit the paddle stick to it";
        field_T = "Basic Bricks";
        field_X = new cd(3);
        field_Y = "Report abuse";
        field_P = "Waiting for fonts";
        field_M = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
