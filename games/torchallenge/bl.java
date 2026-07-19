/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl extends ng {
    int field_Y;
    private m field_R;
    static rj field_S;
    int field_W;
    private int field_Z;
    static int[] field_T;
    static int[][] field_O;
    static int field_P;
    static boolean field_U;
    static int field_X;
    static wb field_V;
    static String field_Q;

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int discarded$1 = 0;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -81) {
                break L1;
              } else {
                discarded$1 = this.a(58, 19);
                break L1;
              }
            }
            if (!super.a(param0, param1, param2 ^ 0, param3, param4, param5, param6)) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = -param4 + param1 - this.field_W;
                var9 = -(2 * this.field_W) + this.field_p;
                if (var8_int <= var9) {
                  break L2;
                } else {
                  var8_int = var9;
                  break L2;
                }
              }
              L3: {
                if ((var8_int ^ -1) <= -1) {
                  break L3;
                } else {
                  var8_int = 0;
                  break L3;
                }
              }
              L4: {
                var8_int = var8_int * this.field_Z / var9;
                if (1 != param5) {
                  if ((param5 ^ -1) == -3) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (this.field_R.a(false) <= var12) {
                        if ((var11 ^ -1) > -1) {
                          break L4;
                        } else {
                          this.field_R.b(var11, (byte) -116);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = -var8_int + this.field_R.c(var12, 7);
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            break L6;
                          } else {
                            var11 = var12;
                            var10 = var13;
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_R.a(var8_int, (byte) 46);
                  break L4;
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var8);
            stackOut_24_1 = new StringBuilder().append("bl.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param6 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    final static ka[] a(int param0, int param1, lj param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        ka[] stackIn_5_0 = null;
        ka[] stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ka[] stackOut_6_0 = null;
        ka[] stackOut_4_0 = null;
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
            if (lk.a(160, param2, param1, param0)) {
              if (param3 == 2147483647) {
                stackOut_6_0 = de.a(true);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = (ka[]) null;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ka[]) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        if (-1 >= (param1 ^ -1)) {
          if (param1 >= this.field_R.a(false)) {
            return -1;
          } else {
            var3 = 127 / ((param0 - 59) / 38);
            return this.field_R.c(param1, 7);
          }
        } else {
          return -1;
        }
    }

    final int d(boolean param0) {
        if (!param0) {
            return 97;
        }
        return this.field_R.a(!param0 ? true : false);
    }

    private bl() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -47) {
                break L1;
              } else {
                field_X = 3;
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if (param0 <= 1) {
                if (1 == param0) {
                  stackOut_10_0 = var3_int * param2;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                L3: {
                  if (-1 == (1 & param0 ^ -1)) {
                    break L3;
                  } else {
                    var3_int = var3_int * param2;
                    break L3;
                  }
                }
                param0 = param0 >> 1;
                param2 = param2 * param2;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "bl.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final int a(int param0) {
        int discarded$0 = 0;
        if (param0 != -1) {
            discarded$0 = this.d(false);
            return this.field_Z;
        }
        return this.field_Z;
    }

    public static void e(boolean param0) {
        int discarded$0 = 0;
        field_T = null;
        field_O = (int[][]) null;
        field_V = null;
        field_S = null;
        field_Q = null;
        if (param0) {
            discarded$0 = bl.a(-63, (byte) 27, -118);
        }
    }

    static {
        field_O = new int[2][5];
        field_P = 0;
        field_S = new rj();
        field_U = true;
        field_Q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
