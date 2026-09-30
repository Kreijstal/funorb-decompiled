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
        var5.d(127, var4);
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
        if (param1 < 0 || this.field_F.a((byte) 101) <= param1) {
            return -1;
        }
        int var3 = 34 / ((param0 - 88) / 32);
        return this.field_F.a(param1, (byte) 94);
    }

    final static int a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_3_0 = eg.a(param1, (byte) 39, 10, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ol.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
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
        int var15 = 0;
        var15 = Geoblox.field_C;
        try {
          L0: {
            var8_int = -89 % ((-3 - param1) / 38);
            if (!super.a(param0, 93, param2, param3, param4, param5, param6)) {
              stackIn_23_0 = 0;
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
                          if ((var11 ^ -1) < (var14 ^ -1)) {
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

            stackIn_26_1 = new StringBuilder().append("ol.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_21_0 != 0;
        } else {
          return stackIn_23_0 != 0;
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
