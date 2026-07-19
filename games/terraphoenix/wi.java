/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends eb {
    private fc field_N;
    int field_K;
    private int field_L;
    int field_M;

    final int a(int param0) {
        if (param0 != 0) {
            this.field_L = -92;
        }
        return this.field_L;
    }

    final static void a(byte param0, e param1, int param2, int param3) {
        try {
            int var4_int = 26 % ((param0 - -37) / 38);
            if (!(param1 == null)) {
                param1.a(0, param2 - 32, (byte) 127, 1, param3 - 64, kg.field_r[45]);
            }
            kg.field_r[76].c(-32 + param2, -64 + param3, 128);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "wi.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int b(int param0, int param1) {
        L0: {
          if (param1 > param0) {
            break L0;
          } else {
            if (param0 >= this.field_N.c(-16952)) {
              break L0;
            } else {
              return this.field_N.a((byte) -68, param0);
            }
          }
        }
        return -1;
    }

    final int g(int param0) {
        if (param0 != 1) {
            this.field_K = 39;
        }
        return this.field_N.c(-16952);
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var14 = Terraphoenix.field_V;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                var8_int = param1 - param3 - this.field_M;
                var9 = this.field_p + -(this.field_M * 2);
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (var8_int < 0) {
                  var8_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var8_int = this.field_L * var8_int / var9;
                if ((param4 ^ -1) != -2) {
                  if (2 == param4) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= this.field_N.c(-16952)) {
                        if (0 > var11) {
                          break L3;
                        } else {
                          this.field_N.b(var11, 122);
                          break L3;
                        }
                      } else {
                        var13 = this.field_N.a((byte) -68, var12) + -var8_int;
                        var13 = var13 * var13;
                        if (var13 < var10) {
                          var10 = var13;
                          var11 = var12;
                          var12++;
                          continue L4;
                        } else {
                          var12++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  this.field_N.c(0, var8_int);
                  break L3;
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var8 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var8);
            stackOut_21_1 = new StringBuilder().append("wi.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param5 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param6 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static void h(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Terraphoenix.field_V;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (10 <= var1_int) {
                if (param0 == -4168) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                km.field_q[var1_int] = new pg(var1_int);
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "wi.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    static {
    }
}
