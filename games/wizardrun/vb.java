/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends pl {
    static rc field_F;
    static String field_I;
    private lb field_H;
    int field_G;
    int field_J;
    private int field_K;

    final boolean a(int param0, byte param1, int param2, int param3, int param4, int param5, ub param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
        var15 = wizardrun.field_H;
        try {
          L0: {
            var8_int = 49 / ((param1 - 12) / 36);
            if (!super.a(param0, (byte) -103, param2, param3, param4, param5, param6)) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L0;
            } else {
              L1: {
                var9 = -((vb) this).field_G + -param0 + param2;
                var10 = -(2 * ((vb) this).field_G) + ((vb) this).field_r;
                if (var9 > var10) {
                  var9 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var9 >= 0) {
                  break L2;
                } else {
                  var9 = 0;
                  break L2;
                }
              }
              L3: {
                var9 = ((vb) this).field_K * var9 / var10;
                if (param4 != 1) {
                  if (param4 == 2) {
                    var11 = 2147483647;
                    var12 = -1;
                    var13 = 0;
                    L4: while (true) {
                      if (var13 >= ((vb) this).field_H.a(31)) {
                        if (var12 >= 0) {
                          ((vb) this).field_H.d(-1, var12);
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          var14 = -var9 + ((vb) this).field_H.a(-112, var13);
                          var14 = var14 * var14;
                          if (var11 > var14) {
                            var12 = var13;
                            var11 = var14;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  ((vb) this).field_H.e(16711838, var9);
                  break L3;
                }
              }
              stackOut_20_0 = 1;
              stackIn_21_0 = stackOut_20_0;
              return stackIn_21_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var8;
            stackOut_24_1 = new StringBuilder().append("vb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param6 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final int b(int param0, int param1) {
        L0: {
          if (param0 == -10455) {
            break L0;
          } else {
            ((vb) this).field_J = 63;
            break L0;
          }
        }
        L1: {
          if (param1 < 0) {
            break L1;
          } else {
            if (((vb) this).field_H.a(param0 + 10327) > param1) {
              return ((vb) this).field_H.a(-126, param1);
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    final int d(int param0) {
        if (param0 != 0) {
            return 84;
        }
        return ((vb) this).field_H.a(-5);
    }

    final static o[] c() {
        int discarded$0 = 1;
        int discarded$1 = 0;
        int discarded$2 = 3;
        int discarded$3 = 0;
        int discarded$4 = 1;
        int discarded$5 = 1;
        int discarded$6 = 1;
        int discarded$7 = 0;
        int discarded$8 = 65793;
        return cb.a();
    }

    final int e(int param0) {
        if (param0 != 1) {
            ((vb) this).field_G = -37;
        }
        return ((vb) this).field_K;
    }

    public static void a() {
        field_I = null;
        field_F = null;
    }

    private vb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = null;
        field_F = new rc();
    }
}
