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
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 >= 70) {
              if (!super.a(98, param1, param2, param3, param4, param5, param6)) {
                stackOut_24_0 = 0;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              } else {
                L1: {
                  var8_int = param6 - (param1 + ((kd) this).field_E);
                  var9 = ((kd) this).field_m + -(2 * ((kd) this).field_E);
                  if (~var9 > ~var8_int) {
                    var8_int = var9;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var8_int >= 0) {
                    break L2;
                  } else {
                    var8_int = 0;
                    break L2;
                  }
                }
                L3: {
                  var8_int = var8_int * ((kd) this).field_A / var9;
                  if (1 == param4) {
                    ((kd) this).field_D.a(var8_int, (byte) 84);
                    break L3;
                  } else {
                    if (param4 != 2) {
                      break L3;
                    } else {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L4: while (true) {
                        if (var12 >= ((kd) this).field_D.b(-1)) {
                          if (var11 < 0) {
                            return true;
                          } else {
                            ((kd) this).field_D.a(var11, 100);
                            break L3;
                          }
                        } else {
                          L5: {
                            var13 = -var8_int + ((kd) this).field_D.b(-1, var12);
                            var13 = var13 * var13;
                            if (~var13 > ~var10) {
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
                stackOut_22_0 = 1;
                stackIn_23_0 = stackOut_22_0;
                return stackIn_23_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("kd.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param5 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + 44 + param6 + 41);
        }
        return stackIn_25_0 != 0;
    }

    final int a(int param0, byte param1) {
        L0: {
          if (0 > param0) {
            break L0;
          } else {
            if (param0 < ((kd) this).field_D.b(param1 + 13)) {
              L1: {
                if (param1 == -14) {
                  break L1;
                } else {
                  ((kd) this).field_D = null;
                  break L1;
                }
              }
              return ((kd) this).field_D.b(param1 ^ 13, param0);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final int c(int param0) {
        if (param0 != -3) {
            int discarded$0 = ((kd) this).a(-86, (byte) 101);
        }
        return ((kd) this).field_D.b(param0 ^ 2);
    }

    final int b(int param0) {
        if (param0 != 24857) {
            ((kd) this).field_D = null;
        }
        return ((kd) this).field_A;
    }

    public static void a(byte param0) {
        field_z = null;
    }

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param0 <= -19) {
          L0: {
            if ((param1 & 393216) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          L1: {
            L2: {
              if (stackIn_5_0 != 0 | pca.b(param2, 94, param1)) {
                break L2;
              } else {
                if (!uu.a(param1, param2, (byte) -96)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Rolling Jones boulders";
    }
}
