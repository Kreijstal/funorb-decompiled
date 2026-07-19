/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends fw {
    private fh field_Q;
    int field_R;
    private int field_L;
    int field_S;
    static int[][] field_M;
    static String field_P;
    static je field_N;
    static wk field_T;
    static String field_O;

    final int a(int param0, byte param1) {
        if ((param0 ^ -1) <= -1) {
          if (param0 < this.field_Q.a(-102)) {
            if (param1 != -47) {
              return -9;
            } else {
              return this.field_Q.d(param0, 652110180);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int d(byte param0) {
        if (param0 != -39) {
            return -55;
        }
        return this.field_Q.a(param0 ^ 85);
    }

    final boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_28_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var14 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 > 103) {
                break L1;
              } else {
                field_N = (je) null;
                break L1;
              }
            }
            if (!super.a(param0, param1, param2, 122, param4, param5, param6)) {
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = -param1 + (param0 + -this.field_R);
                var9 = -(this.field_R * 2) + this.field_l;
                if (var8_int > var9) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                L5: {
                  var8_int = this.field_L * var8_int / var9;
                  if (-2 == (param6 ^ -1)) {
                    break L5;
                  } else {
                    if (-3 == (param6 ^ -1)) {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L6: while (true) {
                        L7: {
                          L8: {
                            L9: {
                              if (this.field_Q.a(-125) <= var12) {
                                break L9;
                              } else {
                                var13 = this.field_Q.d(var12, 652110180) - var8_int;
                                var13 = var13 * var13;
                                var16 = var10 ^ -1;
                                var15 = var13 ^ -1;
                                if (var14 != 0) {
                                  if (var15 <= var16) {
                                    break L8;
                                  } else {
                                    break L7;
                                  }
                                } else {
                                  L10: {
                                    if (var15 <= var16) {
                                      break L10;
                                    } else {
                                      var10 = var13;
                                      var11 = var12;
                                      break L10;
                                    }
                                  }
                                  var12++;
                                  if (var14 == 0) {
                                    continue L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            if (0 <= var11) {
                              break L8;
                            } else {
                              break L7;
                            }
                          }
                          this.field_Q.b(var11, -66);
                          break L7;
                        }
                        if (var14 == 0) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                }
                this.field_Q.e(26884, var8_int);
                break L4;
              }
              stackOut_27_0 = 1;
              stackIn_28_0 = stackOut_27_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var8 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var8);
            stackOut_31_1 = new StringBuilder().append("pi.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_28_0 != 0;
        } else {
          return stackIn_30_0 != 0;
        }
    }

    final int a(int param0) {
        boolean discarded$2 = false;
        kb var3 = null;
        if (param0 != -1) {
          var3 = (kb) null;
          discarded$2 = this.a(104, -75, 118, -4, (kb) null, 10, 30);
          return this.field_L;
        } else {
          return this.field_L;
        }
    }

    public static void a(byte param0) {
        field_O = null;
        field_P = null;
        field_M = (int[][]) null;
        if (param0 != -63) {
            return;
        }
        field_N = null;
        field_T = null;
    }

    private pi() throws Throwable {
        throw new Error();
    }

    static {
        field_P = "Most units";
        field_M = new int[][]{null, null, null, new int[]{0, 0, -1, -1}, null, new int[]{0, -1, -1, -1, -1}};
        field_O = "Just play";
    }
}
