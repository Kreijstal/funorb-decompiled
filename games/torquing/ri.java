/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends lg {
    private hq field_G;
    int field_C;
    private int field_D;
    int field_F;
    static int field_E;

    final int b(int param0, int param1) {
        if (param1 == 0) {
          if (-1 >= (param0 ^ -1)) {
            if (param0 >= this.field_G.a(true)) {
              return -1;
            } else {
              return this.field_G.b(95, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -27;
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int stackIn_3_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
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
        var14 = Torquing.field_u;
        try {
          L0: {
            if (param6 > 5) {
              if (!super.a(param0, param1, param2, param3, param4, param5, (byte) 89)) {
                stackIn_29_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  var8_int = -param1 + (param4 + -this.field_F);
                  var9 = this.field_p + -(2 * this.field_F);
                  if (var9 < var8_int) {
                    var8_int = var9;
                    break L1;
                  } else {
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
                  var8_int = var8_int * this.field_D / var9;
                  if (param0 == 1) {
                    this.field_G.d(var8_int, -8673);
                    break L3;
                  } else {
                    if (-3 != (param0 ^ -1)) {
                      break L3;
                    } else {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L4: while (true) {
                        if (this.field_G.a(true) <= var12) {
                          if (-1 >= (var11 ^ -1)) {
                            this.field_G.c(var11, 17424);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          L5: {
                            var13 = -var8_int + this.field_G.b(46, var12);
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
                    }
                  }
                }
                stackIn_27_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var8 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var8);

            stackIn_32_1 = new StringBuilder().append("ri.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_27_0 != 0;
          } else {
            return stackIn_29_0 != 0;
          }
        }
    }

    final int a(int param0) {
        if (param0 != 0) {
            return -1;
        }
        return this.field_G.a(true);
    }

    final int a(byte param0) {
        if (param0 != -108) {
            this.a((byte) -62);
            return this.field_D;
        }
        return this.field_D;
    }

    private ri() throws Throwable {
        throw new Error();
    }

    static {
    }
}
