/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nb extends ig {
    int field_G;
    private int field_J;
    private ol field_L;
    static di field_K;
    int field_I;
    static int field_H;
    static String field_N;
    static Boolean field_M;
    static int[] field_F;
    static String field_O;

    final static void a(boolean param0, float param1, String param2, byte param3) {
        try {
            if (!(qf.field_d != null)) {
                qf.field_d = new ql(na.field_d, ii.field_F);
                na.field_d.a((byte) -104, (rj) (qf.field_d));
            }
            if (param3 > -117) {
                String var5 = (String) null;
                nb.a(true, 0.3101823627948761f, (String) null, (byte) 81);
            }
            qf.field_d.a(param0, param1, true, param2);
            ti.d();
            af.a(true, (byte) -79);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "nb.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final int g(int param0) {
        int var2 = 32 / ((param0 - -51) / 48);
        return this.field_J;
    }

    final boolean a(rj param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var14 = stellarshard.field_B;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, (byte) 65, param6)) {
              L1: {
                if (param5 >= 24) {
                  break L1;
                } else {
                  nb.a((byte) 61);
                  break L1;
                }
              }
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L2: {
                var8_int = -this.field_G + -param4 + param1;
                var9 = this.field_p + -(this.field_G * 2);
                if (var8_int <= var9) {
                  break L2;
                } else {
                  var8_int = var9;
                  break L2;
                }
              }
              L3: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = var8_int * this.field_J / var9;
                if (1 == param2) {
                  this.field_L.a(var8_int, false);
                  break L4;
                } else {
                  if (2 != param2) {
                    break L4;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (this.field_L.a(19692) <= var12) {
                        if (-1 >= (var11 ^ -1)) {
                          this.field_L.a(var11, (byte) 111);
                          break L4;
                        } else {
                          return true;
                        }
                      } else {
                        L6: {
                          var13 = this.field_L.a((byte) -117, var12) - var8_int;
                          var13 = var13 * var13;
                          if (var10 > var13) {
                            var10 = var13;
                            var11 = var12;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  }
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
          L7: {
            var8 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var8);
            stackOut_25_1 = new StringBuilder().append("nb.P(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_24_0 != 0;
        }
    }

    final int b(byte param0, int param1) {
        L0: {
          if (param1 < 0) {
            break L0;
          } else {
            if (this.field_L.a(19692) <= param1) {
              break L0;
            } else {
              if (param0 == 95) {
                return this.field_L.a((byte) -117, param1);
              } else {
                return -11;
              }
            }
          }
        }
        return -1;
    }

    final int d(boolean param0) {
        boolean discarded$0 = false;
        if (!param0) {
            rj var3 = (rj) null;
            discarded$0 = this.a((rj) null, -89, -58, -17, 18, (byte) 87, -5);
        }
        return this.field_L.a(19692);
    }

    public static void a(byte param0) {
        if (param0 != 105) {
            field_K = (di) null;
        }
        field_O = null;
        field_M = null;
        field_N = null;
        field_F = null;
        field_K = null;
    }

    private nb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_K = new di();
            field_H = 0;
            field_F = new int[256];
            field_N = "Turn ship - <img=4>+<img=5>     Thrust - <img=0>";
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                field_O = "Flame cannon";
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_F[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (1 != (var0 & 1)) {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    } else {
                      var0 = -306674912 ^ var0 >>> 193173601;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
