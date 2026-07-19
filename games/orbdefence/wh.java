/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static tl field_c;
    static int[] field_a;
    static String field_d;
    static int[] field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param0;
              var6 = param3 + param4;
              if (param2 <= ul.field_i) {
                stackOut_3_0 = ul.field_i;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param2;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param4 <= ul.field_d) {
                stackOut_6_0 = ul.field_d;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = param4;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ul.field_e <= var5_int) {
                stackOut_9_0 = ul.field_e;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < ul.field_a) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = ul.field_a;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              L6: {
                var10 = stackIn_13_0;
                if (ul.field_i > param2) {
                  break L6;
                } else {
                  if (param2 < ul.field_e) {
                    var11 = param2 + var8 * ul.field_f;
                    var12 = 1 - -var10 + -var8 >> 2046957089;
                    L7: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L6;
                      } else {
                        ul.field_b[var11] = 16777215;
                        var11 = var11 + 2 * ul.field_f;
                        if (var13 != 0) {
                          break L5;
                        } else {
                          if (var13 == 0) {
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  } else {
                    break L6;
                  }
                }
              }
              if (!param1) {
                break L5;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
            L8: {
              L9: {
                L10: {
                  if (ul.field_d > param4) {
                    break L10;
                  } else {
                    if (ul.field_a > var6) {
                      var11 = var7 + param4 * ul.field_f;
                      var12 = var9 + 1 + -var7 >> -191030719;
                      L11: while (true) {
                        var12--;
                        if (-1 < (var12 ^ -1)) {
                          break L10;
                        } else {
                          ul.field_b[var11] = 16777215;
                          var11 += 2;
                          if (var13 != 0) {
                            break L9;
                          } else {
                            if (var13 == 0) {
                              continue L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                if (var5_int < ul.field_i) {
                  break L9;
                } else {
                  if (var5_int >= ul.field_e) {
                    break L9;
                  } else {
                    var11 = ((var5_int - param2 & 1) + var8) * ul.field_f - -var5_int;
                    var12 = -var8 + var10 + 1 >> 462028897;
                    L12: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L9;
                      } else {
                        ul.field_b[var11] = 16777215;
                        var11 = var11 + ul.field_f * 2;
                        if (var13 != 0) {
                          break L8;
                        } else {
                          if (var13 == 0) {
                            continue L12;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
              }
              if (ul.field_d > param4) {
                break L8;
              } else {
                if (var6 < ul.field_a) {
                  var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                  var12 = -var7 + (1 - -var9) >> -553679807;
                  L13: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L8;
                    } else {
                      ul.field_b[var11] = 16777215;
                      var11 += 2;
                      if (var13 == 0) {
                        continue L13;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var5), "wh.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        int var1 = 0 % ((param0 - -53) / 61);
        field_c = null;
    }

    static {
        field_d = "start free game";
        field_a = new int[]{8, 5, 8, 10, 8, 8, 8, 10, 12, 8, 8, 6};
        field_c = new tl();
    }
}
