/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends rj {
    private int field_A;
    int field_E;
    int field_C;
    static String field_z;
    private tq field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
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
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 >= 70) {
              if (!super.a(98, param1, param2, param3, param4, param5, param6)) {
                stackIn_25_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  var8_int = param6 - (param1 + this.field_E);
                  var9 = this.field_m + -(2 * this.field_E);
                  if (var9 < var8_int) {
                    var8_int = var9;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (-1 >= (var8_int ^ -1)) {
                    break L2;
                  } else {
                    var8_int = 0;
                    break L2;
                  }
                }
                L3: {
                  var8_int = var8_int * this.field_A / var9;
                  if (1 == param4) {
                    this.field_D.a(var8_int, (byte) 84);
                    break L3;
                  } else {
                    if (-3 != (param4 ^ -1)) {
                      break L3;
                    } else {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L4: while (true) {
                        if (var12 >= this.field_D.b(-1)) {
                          if (var11 < 0) {
                            return true;
                          } else {
                            this.field_D.a(var11, 100);
                            break L3;
                          }
                        } else {
                          L5: {
                            var13 = -var8_int + this.field_D.b(-1, var12);
                            var13 = var13 * var13;
                            if (var13 < var10) {
                              var10 = var13;
                              var11 = var12;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  }
                }
                stackIn_23_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8);

            stackIn_28_1 = new StringBuilder().append("kd.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_23_0 != 0;
          } else {
            return stackIn_25_0 != 0;
          }
        }
    }

    final int a(int param0, byte param1) {
        if (0 > param0 || param0 >= this.field_D.b(param1 + 13)) {
            return -1;
        }
        if (param1 != -14) {
            this.field_D = (tq) null;
        }
        return this.field_D.b(param1 ^ 13, param0);
    }

    final int c(int param0) {
        if (param0 != -3) {
            this.a(-86, (byte) 101);
        }
        return this.field_D.b(param0 ^ 2);
    }

    final int b(int param0) {
        if (param0 != 24857) {
            this.field_D = (tq) null;
        }
        return this.field_A;
    }

    public static void a(byte param0) {
        if (param0 != -121) {
            return;
        }
        field_z = null;
    }

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        if (param0 <= -19) {
          L0: {
            if ((param1 & 393216) == 0) {
              stackIn_5_0 = 0;
              break L0;
            } else {
              stackIn_5_0 = 1;
              break L0;
            }
          }
          L1: {
            L2: {
              if (stackIn_5_0 != 0 | pca.b(param2, 94, param1)) {
                break L2;
              } else {
                if (!uu.a(param1, param2, (byte) -96)) {
                  stackIn_10_0 = 0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackIn_10_0 = 1;
            break L1;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    private kd() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "Rolling Jones boulders";
    }
}
