/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf {
    static vg field_b;
    static String field_c;
    static String field_a;

    final static dk[] a() {
        return new dk[]{lh.field_s, lc.field_j, vc.field_b};
    }

    final static oh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8) {
        int var9 = 0;
        oh[] var10 = null;
        oh[] var11_ref_oh__ = null;
        int var11 = 0;
        int var12 = 0;
        oh var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = TetraLink.field_J;
        var9 = param4 + param5 - -param0;
        var10 = new oh[]{new oh(var9, var9), new oh(param6, var9), new oh(var9, var9), new oh(var9, param6), new oh(64, 64), new oh(var9, param6), new oh(var9, var9), new oh(param6, var9), new oh(var9, var9)};
        var11_ref_oh__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_oh__.length) {
            var11 = 0;
            L1: while (true) {
              if (param5 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (var11 >= param5) {
                    L3: {
                      var11 = 0;
                      if (param7 == -112) {
                        break L3;
                      } else {
                        oh[] discarded$1 = lf.a(48, 126, 35, -60, 39, 14, -11, (byte) 26, 113);
                        break L3;
                      }
                    }
                    L4: while (true) {
                      if (param6 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (param6 >> 1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 >= param0) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_C[(-1 + var9 + -var12) * param6 - -var11] = param2;
                                var10[3].field_C[var11 * var9 - -var9 + -1 - var12] = param2;
                                var10[7].field_C[param6 * var12 + var11] = param2;
                                var10[5].field_C[var12 + var9 * var11] = param2;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (var12 >= param5) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_C[var11 + (-1 + -var12 + var9) * param6] = param3;
                            var10[5].field_C[var9 * var11 - (var12 + 1 + -var9)] = param3;
                            var10[1].field_C[var11 + param6 * var12] = param8;
                            var10[3].field_C[var12 + var9 * var11] = param8;
                            var12++;
                            continue L7;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var12 < var9) {
                        var10[0].field_C[var12 + var9 * var11] = param8;
                        var10[0].field_C[var9 * var12 - -var11] = param8;
                        if (var12 < var9 + -var11) {
                          var10[2].field_C[var12 - -(var9 * var11)] = param8;
                          var10[6].field_C[var11 + var9 * var12] = param8;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_C[var12 + (var9 - (var11 + 1)) * var9] = param3;
                    var10[8].field_C[var12 + (var9 - var11 - 1) * var9] = param3;
                    var10[2].field_C[var9 * var12 - (-var9 + 1) + -var11] = param3;
                    var10[8].field_C[-1 + (var9 + -var11) + var12 * var9] = param3;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_oh__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_C.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_C[var14] = param1;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Options Menu";
        field_a = "You have withdrawn your request to join.";
    }
}
