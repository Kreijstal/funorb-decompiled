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
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
              stackIn_29_0 = 0;
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
                var8_int = this.field_L * var8_int / var9;
                if (-2 == (param6 ^ -1)) {
                  this.field_Q.e(26884, var8_int);
                  break L4;
                } else {
                  if (-3 == (param6 ^ -1)) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (this.field_Q.a(-125) <= var12) {
                        if (0 <= var11) {
                          this.field_Q.b(var11, -66);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = this.field_Q.d(var12, 652110180) - var8_int;
                          var13 = var13 * var13;
                          if ((var13 ^ -1) <= (var10 ^ -1)) {
                            break L6;
                          } else {
                            var10 = var13;
                            var11 = var12;
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
                }
              }
              stackIn_27_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var8);

            stackIn_32_1 = new StringBuilder().append("pi.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_27_0 != 0;
        } else {
          return stackIn_29_0 != 0;
        }
    }

    final int a(int param0) {
        kb var3;
        if (param0 != -1) {
          var3 = (kb) null;
          this.a(104, -75, 118, -4, (kb) null, 10, 30);
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
