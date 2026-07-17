/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends hk {
    private sj field_F;
    int field_H;
    int field_G;
    private int field_E;
    static String field_I;

    final static void a(int param0, p param1) {
        pk var5 = fj.field_q;
        var5.a(4, (byte) -88);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.d((byte) -55, 1);
        var5.d((byte) -31, param1.field_l);
        var5.d((byte) -104, param1.field_h);
        var5.c((byte) 95, param1.field_f);
        var5.c((byte) 95, param1.field_g);
        var5.c((byte) 95, param1.field_j);
        var5.c((byte) 95, param1.field_n);
        int discarded$0 = var5.d(127, var4);
        try {
            var5.f(11700, -var4 + var5.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ol.A(" + 4 + 44 + (param1 != null ? "{...}" : "null") + 44 + 30175 + 41);
        }
    }

    public static void f() {
        field_I = null;
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (((ol) this).field_F.a((byte) 101) > param1) {
              var3 = 34 / ((param0 - 88) / 32);
              return ((ol) this).field_F.a(param1, (byte) 94);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            stackOut_0_0 = eg.a(param1, (byte) 39, 10, true);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ol.G(").append(0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
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
        var15 = Geoblox.field_C;
        try {
          L0: {
            var8_int = -89 % ((-3 - param1) / 38);
            if (!super.a(param0, 93, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L1: {
                var9 = -param2 + param4 + -((ol) this).field_H;
                var10 = ((ol) this).field_r - 2 * ((ol) this).field_H;
                if (var10 < var9) {
                  var9 = var10;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 > var9) {
                  var9 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var9 = ((ol) this).field_E * var9 / var10;
                if (param3 != 1) {
                  if (param3 != 2) {
                    break L3;
                  } else {
                    var11 = 2147483647;
                    var12 = -1;
                    var13 = 0;
                    L4: while (true) {
                      if (var13 >= ((ol) this).field_F.a((byte) 48)) {
                        if (0 > var12) {
                          break L3;
                        } else {
                          ((ol) this).field_F.a(0, var12);
                          break L3;
                        }
                      } else {
                        L5: {
                          var14 = ((ol) this).field_F.a(var13, (byte) 94) + -var9;
                          var14 = var14 * var14;
                          if (var11 > var14) {
                            var11 = var14;
                            var12 = var13;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var13++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  ((ol) this).field_F.b(var9, (byte) -93);
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
            stackOut_23_1 = new StringBuilder().append("ol.D(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
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
          throw t.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        return stackIn_22_0 != 0;
    }

    final int a(byte param0) {
        int var2 = -85 / ((36 - param0) / 49);
        return ((ol) this).field_F.a((byte) 76);
    }

    final int g(int param0) {
        if (param0 >= -121) {
            return -39;
        }
        return ((ol) this).field_E;
    }

    private ol() throws Throwable {
        throw new Error();
    }

    static {
    }
}
