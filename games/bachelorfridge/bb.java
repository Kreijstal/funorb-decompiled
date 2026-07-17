/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends hf {
    private int field_E;
    private mb field_G;
    static int field_F;
    int field_D;
    int field_A;

    final int a(int param0) {
        if (param0 != 2) {
            return 30;
        }
        return ((bb) this).field_G.a((byte) -127);
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
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
        var14 = BachelorFridge.field_y;
        try {
          L0: {
            if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L1: {
                var8_int = -((bb) this).field_A + param0 + -param2;
                var9 = -(2 * ((bb) this).field_A) + ((bb) this).field_p;
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
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
                var8_int = ((bb) this).field_E * var8_int / var9;
                if (param3 != 1) {
                  if (param3 == 2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (((bb) this).field_G.a((byte) -125) <= var12) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          ((bb) this).field_G.a(var11, true);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = -var8_int + ((bb) this).field_G.a((byte) -24, var12);
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
                } else {
                  ((bb) this).field_G.c(var8_int, param1 ^ 7359);
                  break L3;
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
            stackOut_23_1 = new StringBuilder().append("bb.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
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
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param6 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final static void h(int param0) {
        int discarded$4 = 1;
        lga.a(sc.field_m);
        if (param0 != 0) {
            bb.h(-125);
        }
    }

    final int a(int param0, int param1) {
        if (param1 >= ~param0) {
          if (((bb) this).field_G.a((byte) -126) <= param0) {
            return -1;
          } else {
            return ((bb) this).field_G.a((byte) -24, param0);
          }
        } else {
          return -1;
        }
    }

    private bb() throws Throwable {
        throw new Error();
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -15;
        }
        return ((bb) this).field_E;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 15;
    }
}
