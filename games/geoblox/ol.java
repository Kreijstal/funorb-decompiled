/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol extends hk {
    private sj field_F;
    int field_H;
    int field_G;
    private int field_E;
    static String field_I;

    final static void a(int param0, p param1, int param2) {
        pk var5 = fj.field_q;
        var5.a(param0, (byte) -88);
        var5.field_f = var5.field_f + 1;
        int var4 = var5.field_f;
        var5.d((byte) -55, 1);
        var5.d((byte) -31, param1.field_l);
        var5.d((byte) -104, param1.field_h);
        var5.c((byte) 95, param1.field_f);
        var5.c((byte) 95, param1.field_g);
        var5.c((byte) 95, param1.field_j);
        var5.c((byte) 95, param1.field_n);
        int discarded$53 = var5.d(127, var4);
        if (param2 != 30175) {
            return;
        }
        try {
            var5.f(11700, -var4 + var5.field_f);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ol.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_I = null;
        if (param0 != 0) {
            field_I = (String) null;
        }
    }

    final int c(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (this.field_F.a((byte) 101) > param1) {
              var3 = 34 / ((param0 - 88) / 32);
              return this.field_F.a(param1, (byte) 94);
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_I = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = eg.a(param1, (byte) 39, 10, true);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ol.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var9 = -param2 + param4 + -this.field_H;
                var10 = this.field_r - 2 * this.field_H;
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
                var9 = this.field_E * var9 / var10;
                if (param3 != 1) {
                  if (param3 != 2) {
                    break L3;
                  } else {
                    var11 = 2147483647;
                    var12 = -1;
                    var13 = 0;
                    L4: while (true) {
                      if (var13 >= this.field_F.a((byte) 48)) {
                        if (0 > var12) {
                          break L3;
                        } else {
                          this.field_F.a(0, var12);
                          break L3;
                        }
                      } else {
                        L5: {
                          var14 = this.field_F.a(var13, (byte) 94) + -var9;
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
                  this.field_F.b(var9, (byte) -93);
                  break L3;
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var8);
            stackOut_23_1 = new StringBuilder().append("ol.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param6 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_22_0 != 0;
        }
    }

    final int a(byte param0) {
        int var2 = -85 / ((36 - param0) / 49);
        return this.field_F.a((byte) 76);
    }

    final int g(int param0) {
        if (param0 >= -121) {
            return -39;
        }
        return this.field_E;
    }

    private ol() throws Throwable {
        throw new Error();
    }

    static {
    }
}
