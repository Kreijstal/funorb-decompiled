/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km extends rm {
    static int field_G;
    int field_H;
    private uh field_K;
    private int field_J;
    int field_I;

    final int a(byte param0) {
        if (param0 != 104) {
            return 115;
        }
        return ((km) this).field_K.b(-123);
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L1: {
                var8_int = -((km) this).field_I + -param0 + param5;
                var9 = ((km) this).field_x + -(2 * ((km) this).field_I);
                if (var8_int > var9) {
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
                var8_int = var8_int * ((km) this).field_J / var9;
                if (param6 == 1) {
                  ((km) this).field_K.a(var8_int, (byte) 123);
                  break L3;
                } else {
                  if (2 == param6) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= ((km) this).field_K.b(-113)) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((km) this).field_K.b(var11, (byte) 12);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = ((km) this).field_K.a((byte) 35, var12) - var8_int;
                          var13 = var13 * var13;
                          if (var10 > var13) {
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
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("km.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_G = 127;
        }
        return ((km) this).field_J;
    }

    private km() throws Throwable {
        throw new Error();
    }

    final int a(boolean param0, int param1) {
        L0: {
          if (!param0) {
            break L0;
          } else {
            ((km) this).field_I = -11;
            break L0;
          }
        }
        L1: {
          if (param1 < 0) {
            break L1;
          } else {
            if (param1 < ((km) this).field_K.b(-115)) {
              return ((km) this).field_K.a((byte) 100, param1);
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = 66;
    }
}
