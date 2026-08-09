/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj extends dk {
    static byte[][] field_B;
    int field_A;
    static String field_C;
    private int field_H;
    private ve field_F;
    static String field_D;
    static hl[] field_E;
    int field_G;
    static int field_I;

    public static void f(byte param0) {
        field_B = (byte[][]) null;
        field_D = null;
        int var1 = 80 / ((param0 - -39) / 52);
        field_E = null;
        field_C = null;
    }

    final int e(int param0) {
        if (param0 != -32242) {
            return 43;
        }
        return this.field_H;
    }

    final int a(int param0, int param1) {
        if (param0 != 2) {
            return -69;
        }
        if ((param1 ^ -1) > -1 || this.field_F.a(true) <= param1) {
            return -1;
        }
        return this.field_F.a(0, param1);
    }

    final static boolean a(String param0, byte param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                if (!ka.field_r.startsWith("win")) {
                  stackIn_3_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_8_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    var3 = 0;
                    if (param1 <= 0) {
                      break L3;
                    } else {
                      field_B = (byte[][]) null;
                      break L3;
                    }
                  }
                  L4: while (true) {
                    if (var3 >= param0.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                        var3++;
                        continue L4;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_19_0 = 0;
              return stackIn_19_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref2);

            stackIn_22_1 = new StringBuilder().append("sj.E(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final int e(byte param0) {
        if (param0 <= 103) {
            return 82;
        }
        return this.field_F.a(true);
    }

    final boolean a(uj param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        var14 = StarCannon.field_A;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_23_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = param5 - param2 + -this.field_G;
                var9 = -(this.field_G * 2) + this.field_i;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = var8_int * this.field_H / var9;
                if (-2 != (param6 ^ -1)) {
                  if (2 == param6) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_F.a(true)) {
                        if (-1 < (var11 ^ -1)) {
                          break L3;
                        } else {
                          this.field_F.c(param4 + 138, var11);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = this.field_F.a(0, var12) - var8_int;
                          var13 = var13 * var13;
                          if ((var13 ^ -1) > (var10 ^ -1)) {
                            var11 = var12;
                            var10 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var12++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_F.b(var8_int, 1);
                  break L3;
                }
              }
              stackIn_21_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var8);

            stackIn_26_1 = new StringBuilder().append("sj.G(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L6;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L6;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
        }
    }

    private sj() throws Throwable {
        throw new Error();
    }

    static {
        field_B = new byte[50][];
        field_C = "Unpacking graphics";
        field_D = "Loading fonts";
    }
}
