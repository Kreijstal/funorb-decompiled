/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static tl field_c;
    static int[] field_a;
    static String field_d;
    static int[] field_b;

    final static void a(int param0, boolean param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 + param0;
              var6 = param3 + param4;
              if (param2 <= ul.field_i) {
                stackIn_4_0 = ul.field_i;
                break L1;
              } else {
                stackIn_4_0 = param2;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param4 <= ul.field_d) {
                stackIn_7_0 = ul.field_d;
                break L2;
              } else {
                stackIn_7_0 = param4;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (ul.field_e <= var5_int) {
                stackIn_10_0 = ul.field_e;
                break L3;
              } else {
                stackIn_10_0 = var5_int;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < ul.field_a) {
                stackIn_13_0 = var6;
                break L4;
              } else {
                stackIn_13_0 = ul.field_a;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (ul.field_i > param2) {
                break L5;
              } else {
                if (param2 < ul.field_e) {
                  var11 = param2 + var8 * ul.field_f;
                  var12 = 1 - -var10 + -var8 >> 2046957089;
                  L6: while (true) {
                    var12--;
                    if ((var12 ^ -1) > -1) {
                      break L5;
                    } else {
                      ul.field_b[var11] = 16777215;
                      var11 = var11 + 2 * ul.field_f;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            if (!param1) {
              L7: {
                if (ul.field_d > param4) {
                  break L7;
                } else {
                  if (ul.field_a > var6) {
                    var11 = var7 + param4 * ul.field_f;
                    var12 = var9 + 1 + -var7 >> -191030719;
                    L8: while (true) {
                      var12--;
                      if (-1 < (var12 ^ -1)) {
                        break L7;
                      } else {
                        ul.field_b[var11] = 16777215;
                        var11 += 2;
                        continue L8;
                      }
                    }
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (var5_int < ul.field_i) {
                  break L9;
                } else {
                  if (var5_int >= ul.field_e) {
                    break L9;
                  } else {
                    var11 = ((var5_int - param2 & 1) + var8) * ul.field_f - -var5_int;
                    var12 = -var8 + var10 + 1 >> 462028897;
                    L10: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
                        break L9;
                      } else {
                        ul.field_b[var11] = 16777215;
                        var11 = var11 + ul.field_f * 2;
                        continue L10;
                      }
                    }
                  }
                }
              }
              L11: {
                if (ul.field_d > param4) {
                  break L11;
                } else {
                  if (var6 < ul.field_a) {
                    var11 = ul.field_f * var6 + (var7 - -(1 & var6 - param4));
                    var12 = -var7 + (1 - -var9) >> -553679807;
                    L12: while (true) {
                      var12--;
                      if (var12 < 0) {
                        break L11;
                      } else {
                        ul.field_b[var11] = 16777215;
                        var11 += 2;
                        continue L12;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
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
