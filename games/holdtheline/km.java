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
        return this.field_K.b(-123);
    }

    final boolean a(int param0, int param1, int param2, n param3, byte param4, int param5, int param6) {
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
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
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_22_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_I + -param0 + param5;
                var9 = this.field_x + -(2 * this.field_I);
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
                var8_int = var8_int * this.field_J / var9;
                if (param6 == 1) {
                  this.field_K.a(var8_int, (byte) 123);
                  break L3;
                } else {
                  if (2 == param6) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_K.b(-113)) {
                        if (var11 < 0) {
                          break L3;
                        } else {
                          this.field_K.b(var11, (byte) 12);
                          break L3;
                        }
                      } else {
                        L5: {
                          var13 = this.field_K.a((byte) 35, var12) - var8_int;
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
              stackIn_20_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var8);

            stackIn_25_1 = new StringBuilder().append("km.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L6;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_20_0 != 0;
        } else {
          return stackIn_22_0 != 0;
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            field_G = 127;
        }
        return this.field_J;
    }

    private km() throws Throwable {
        throw new Error();
    }

    final int a(boolean param0, int param1) {
        if (param0) {
            this.field_I = -11;
        }
        if (-1 < (param1 ^ -1) || param1 >= this.field_K.b(-115)) {
            return -1;
        }
        return this.field_K.a((byte) 100, param1);
    }

    static {
        field_G = 66;
    }
}
