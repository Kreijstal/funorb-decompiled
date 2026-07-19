/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static int field_a;
    static String field_c;
    static String field_d;
    static int[] field_b;
    static String field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ul.field_i <= param4) {
                break L1;
              } else {
                param0 = param0 - (-param4 + ul.field_i);
                param4 = ul.field_i;
                break L1;
              }
            }
            L2: {
              if (ul.field_e >= param0 + param4) {
                break L2;
              } else {
                param0 = ul.field_e + -param4;
                break L2;
              }
            }
            L3: {
              if (param3 >= ul.field_d) {
                break L3;
              } else {
                param5 = param5 - (-param3 + ul.field_d);
                param3 = ul.field_d;
                break L3;
              }
            }
            L4: {
              if (param3 - -param5 > ul.field_a) {
                param5 = -param3 + ul.field_a;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-1 <= (param0 ^ -1)) {
                break L5;
              } else {
                if ((param5 ^ -1) >= -1) {
                  break L5;
                } else {
                  if (param1 >= 77) {
                    var6_int = param3 * ul.field_f + param4;
                    var7 = ul.field_f + -param0;
                    param3 = -param5;
                    L6: while (true) {
                      if (0 <= param3) {
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (var12 == 0) {
                          param4 = -param0;
                          L7: while (true) {
                            L8: {
                              if ((param4 ^ -1) <= -1) {
                                stackOut_30_0 = var6_int;
                                stackOut_30_1 = var7;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                break L8;
                              } else {
                                var8 = ul.field_b[var6_int];
                                stackOut_22_0 = var8 >> -38368440 & 255 ^ -1;
                                stackOut_22_1 = param2 ^ -1;
                                stackIn_31_0 = stackOut_22_0;
                                stackIn_31_1 = stackOut_22_1;
                                stackIn_23_0 = stackOut_22_0;
                                stackIn_23_1 = stackOut_22_1;
                                if (var12 != 0) {
                                  break L8;
                                } else {
                                  L9: {
                                    if (stackIn_23_0 >= stackIn_23_1) {
                                      break L9;
                                    } else {
                                      if ((16711680 & var8) >> 1407952816 > (255 & var8 >> 845100680)) {
                                        break L9;
                                      } else {
                                        L10: {
                                          var9 = -60 + ((16711680 & var8) >> 2079752207);
                                          if (-256 > (var9 ^ -1)) {
                                            var9 = 255;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                        var10 = var8 & 65280;
                                        var10 = 65280 & (var10 >> 1115715617) - (var10 >> 572847461);
                                        var11 = (255 & var8) >> 141290819;
                                        ul.field_b[var6_int] = ge.a(ge.a(var10, var9 << -2020863344), var11);
                                        break L9;
                                      }
                                    }
                                  }
                                  var6_int++;
                                  param4++;
                                  continue L7;
                                }
                              }
                            }
                            var6_int = stackIn_31_0 + stackIn_31_1;
                            param3++;
                            continue L6;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var6), "ld.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 85) {
            ld.a(8, -18, 124, -3, 46, 45);
            return true;
        }
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var4 = -108 / ((-53 - param2) / 51);
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (param1 <= 0) {
                    break L3;
                  } else {
                    var3_int = var3_int << -1594980095 | 1 & param0;
                    param1--;
                    stackOut_3_0 = param0 >>> 1;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      param0 = stackIn_4_0;
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = var3_int;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "ld.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_c = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_d = "Quit to website";
        field_c = "Waiting for instruments";
    }
}
