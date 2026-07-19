/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends rj {
    private int field_A;
    int field_E;
    int field_C;
    static String field_z;
    private tq field_D;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_26_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var14 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 >= 70) {
              if (!super.a(98, param1, param2, param3, param4, param5, param6)) {
                stackOut_26_0 = 0;
                stackIn_27_0 = stackOut_26_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                L1: {
                  var8_int = param6 - (param1 + this.field_E);
                  var9 = this.field_m + -(2 * this.field_E);
                  if (var9 < var8_int) {
                    var8_int = var9;
                    break L1;
                  } else {
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
                    var8_int = var8_int * this.field_A / var9;
                    if (1 == param4) {
                      break L4;
                    } else {
                      if (-3 != (param4 ^ -1)) {
                        break L3;
                      } else {
                        var10 = 2147483647;
                        var11 = -1;
                        var12 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var12 >= this.field_D.b(-1)) {
                                break L7;
                              } else {
                                var13 = -var8_int + this.field_D.b(-1, var12);
                                var13 = var13 * var13;
                                stackOut_14_0 = var13 ^ -1;
                                stackIn_20_0 = stackOut_14_0;
                                stackIn_15_0 = stackOut_14_0;
                                if (var14 != 0) {
                                  break L6;
                                } else {
                                  L8: {
                                    if (stackIn_15_0 > (var10 ^ -1)) {
                                      var10 = var13;
                                      var11 = var12;
                                      break L8;
                                    } else {
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
                            stackOut_19_0 = var11;
                            stackIn_20_0 = stackOut_19_0;
                            break L6;
                          }
                          L9: {
                            if (stackIn_20_0 < 0) {
                              break L9;
                            } else {
                              this.field_D.a(var11, 100);
                              break L9;
                            }
                          }
                          if (var14 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  this.field_D.a(var8_int, (byte) 84);
                  break L3;
                }
                stackOut_24_0 = 1;
                stackIn_25_0 = stackOut_24_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var8 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var8);
            stackOut_28_1 = new StringBuilder().append("kd.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param5 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_25_0 != 0;
          } else {
            return stackIn_27_0 != 0;
          }
        }
    }

    final int a(int param0, byte param1) {
        if (0 <= param0) {
          if (param0 < this.field_D.b(param1 + 13)) {
            if (param1 != -14) {
              this.field_D = (tq) null;
              return this.field_D.b(param1 ^ 13, param0);
            } else {
              return this.field_D.b(param1 ^ 13, param0);
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final int c(int param0) {
        int discarded$2 = 0;
        if (param0 != -3) {
          discarded$2 = this.a(-86, (byte) 101);
          return this.field_D.b(param0 ^ 2);
        } else {
          return this.field_D.b(param0 ^ 2);
        }
    }

    final int b(int param0) {
        if (param0 != 24857) {
            this.field_D = (tq) null;
            return this.field_A;
        }
        return this.field_A;
    }

    public static void a(byte param0) {
        if (param0 != -121) {
            return;
        }
        field_z = null;
    }

    final static boolean c(int param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 <= -19) {
          L0: {
            if ((param1 & 393216) == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          if (stackIn_5_0 == 0 | pca.b(param2, 94, param1)) {
            if (uu.a(param1, param2, (byte) -96)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            return stackIn_8_0 != 0;
          }
        } else {
          return true;
        }
    }

    private kd() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "Rolling Jones boulders";
    }
}
