/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi extends kf {
    private int field_F;
    int field_G;
    int field_H;
    private gl field_E;

    final int a(int param0, byte param1) {
        if (param1 == -37) {
          if (param0 >= 0) {
            if (this.field_E.a((byte) -110) <= param0) {
              return -1;
            } else {
              return this.field_E.a(param0, -116);
            }
          } else {
            return -1;
          }
        } else {
          return -43;
        }
    }

    final int i(int param0) {
        if (param0 != -1) {
            return 59;
        }
        return this.field_F;
    }

    final int e(boolean param0) {
        if (param0) {
            return -53;
        }
        return this.field_E.a((byte) -110);
    }

    final static mb a(int param0, byte param1, String param2) {
        mb var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        mb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 < -47) {
                break L1;
              } else {
                var4 = (String) null;
                wi.a(20, (byte) 18, (String) null);
                break L1;
              }
            }
            var3 = new mb(false);
            var3.field_e = param2;
            var3.field_f = param0;
            stackIn_3_0 = (mb) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("wi.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean a(int param0, int param1, w param2, int param3, int param4, int param5, int param6) {
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
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
        int var16 = 0;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_26_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -this.field_G + (param6 - param5);
                var9 = this.field_j + -(2 * this.field_G);
                if (var9 >= var8_int) {
                  break L1;
                } else {
                  var8_int = var9;
                  break L1;
                }
              }
              L2: {
                if (-1 >= (var8_int ^ -1)) {
                  break L2;
                } else {
                  var8_int = 0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  var8_int = this.field_F * var8_int / var9;
                  if (1 != param1) {
                    break L4;
                  } else {
                    this.field_E.c(var8_int, 1);
                    if (var14 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                if (2 == param1) {
                  var10 = 2147483647;
                  var11 = -1;
                  var12 = 0;
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (var12 >= this.field_E.a((byte) -110)) {
                          break L7;
                        } else {
                          var13 = this.field_E.a(var12, -115) + -var8_int;
                          var13 = var13 * var13;
                          var16 = var13;
                          var15 = var10;
                          if (var14 != 0) {
                            if (var15 >= var16) {
                              break L6;
                            } else {
                              break L3;
                            }
                          } else {
                            L8: {
                              if (var15 <= var16) {
                                break L8;
                              } else {
                                var11 = var12;
                                var10 = var13;
                                break L8;
                              }
                            }
                            var12++;
                            if (var14 == 0) {
                              continue L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (-1 >= (var11 ^ -1)) {
                        break L6;
                      } else {
                        break L3;
                      }
                    }
                    this.field_E.a(var11, (byte) 108);
                    break L3;
                  }
                } else {
                  return true;
                }
              }
              stackIn_24_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var8);

            stackIn_29_1 = new StringBuilder().append("wi.VA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L9;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_24_0 != 0;
        } else {
          return stackIn_26_0 != 0;
        }
    }

    private wi() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, byte param2, le param3, int param4, int param5, int param6, int param7, int param8, db[] param9, db[] param10) {
        try {
            ia.a((byte) 46);
            int var11_int = -27 % ((param2 - -35) / 52);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "wi.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
