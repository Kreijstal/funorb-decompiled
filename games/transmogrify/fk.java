/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk extends lj {
    static ib field_F;
    private int field_I;
    static int field_E;
    int field_G;
    static String field_D;
    private te field_H;
    int field_B;

    final int b(byte param0, int param1) {
        if ((param1 ^ -1) <= -1) {
          if (param1 < this.field_H.a(1)) {
            if (param0 < 114) {
              this.field_G = -20;
              return this.field_H.b(param1, -14927);
            } else {
              return this.field_H.b(param1, -14927);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    public static void a(byte param0) {
        int var1 = 19 % ((param0 - 2) / 44);
        field_F = null;
        field_D = null;
    }

    final boolean b(int param0, int param1, qg param2, int param3, int param4, int param5, int param6) {
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
        var14 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (!super.b(param0, param1, param2, param3, param4, param5, param6)) {
              stackIn_28_0 = 0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              L1: {
                var8_int = -param3 + param0 + -this.field_B;
                var9 = this.field_l - this.field_B * 2;
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
                L4: {
                  var8_int = this.field_I * var8_int / var9;
                  if (1 == param1) {
                    break L4;
                  } else {
                    if (-3 == (param1 ^ -1)) {
                      var10 = 2147483647;
                      var11 = -1;
                      var12 = 0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            L8: {
                              if (var12 >= this.field_H.a(1)) {
                                break L8;
                              } else {
                                var13 = this.field_H.b(var12, -14927) + -var8_int;
                                var13 = var13 * var13;
                                var16 = var13;
                                var15 = var10;
                                if (var14 != 0) {
                                  if (var15 <= var16) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  L9: {
                                    if (var15 <= var16) {
                                      break L9;
                                    } else {
                                      var10 = var13;
                                      var11 = var12;
                                      break L9;
                                    }
                                  }
                                  var12++;
                                  if (var14 == 0) {
                                    continue L5;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            if ((var11 ^ -1) <= -1) {
                              break L7;
                            } else {
                              break L6;
                            }
                          }
                          this.field_H.a(var11, 0);
                          break L6;
                        }
                        if (var14 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                }
                this.field_H.b(var8_int, (byte) 118);
                break L3;
              }
              stackIn_26_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var8);

            stackIn_31_1 = new StringBuilder().append("fk.O(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_26_0 != 0;
        } else {
          return stackIn_28_0 != 0;
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param0 = hd.a('_', (byte) -81, "", param0);
              var3 = vl.b(-1, param2);
              if (param1 == 34) {
                break L1;
              } else {
                fk.a((byte) -127);
                break L1;
              }
            }
            L2: {
              L3: {
                if ((param0.indexOf(param2) ^ -1) != 0) {
                  break L3;
                } else {
                  if (-1 == param0.indexOf(var3)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("fk.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final int h(int param0) {
        if (param0 != -1) {
            return 21;
        }
        return this.field_H.a(param0 + 2);
    }

    final int i(int param0) {
        if (param0 != -24733) {
            this.b((byte) -6, -77);
            return this.field_I;
        }
        return this.field_I;
    }

    private fk() throws Throwable {
        throw new Error();
    }

    static {
        field_D = "Cancel";
    }
}
