/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static String[] field_a;
    static String field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -29584) {
            ec.a(-78);
        }
        field_b = null;
    }

    final static kv[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        kv[] var10 = null;
        kv[] var11_ref_kv__ = null;
        int var11 = 0;
        int var12 = 0;
        kv var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = BachelorFridge.field_y;
        var9 = param4 + (param8 - -param6);
        var10 = new kv[]{new kv(var9, var9), new kv(param0, var9), new kv(var9, var9), new kv(var9, param0), new kv(64, 64), new kv(var9, param0), new kv(var9, var9), new kv(param0, var9), new kv(var9, var9)};
        var11_ref_kv__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_kv__.length <= var12) {
            L1: {
              if (param1 == 5) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (var11 >= param8) {
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param8) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param0) {
                        var11 = 0;
                        L5: while (true) {
                          if (param0 >> 1351112865 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param4 <= var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_v[(-1 + var9 - var12) * param0 - -var11] = param3;
                                var10[3].field_v[var11 * var9 - (var12 + (-var9 + 1))] = param3;
                                var10[7].field_v[param0 * var12 - -var11] = param3;
                                var10[5].field_v[var9 * var11 - -var12] = param3;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param8 > var12) {
                            var10[7].field_v[(-1 + (-var12 + var9)) * param0 - -var11] = param2;
                            var10[5].field_v[var9 + (-1 - var12) + var9 * var11] = param2;
                            var10[1].field_v[var12 * param0 - -var11] = param7;
                            var10[3].field_v[var12 + var11 * var9] = param7;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 > var12) {
                        var10[0].field_v[var9 * var11 + var12] = param7;
                        var10[0].field_v[var12 * var9 - -var11] = param7;
                        if (var12 < var9 - var11) {
                          var10[2].field_v[var12 + var11 * var9] = param7;
                          var10[6].field_v[var11 + var9 * var12] = param7;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      } else {
                        var11++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 > var12) {
                    var10[6].field_v[var12 + var9 * (-1 + (var9 - var11))] = param2;
                    var10[8].field_v[var12 + var9 * (-var11 + (var9 + -1))] = param2;
                    var10[2].field_v[var12 * var9 - -var9 + (-1 - var11)] = param2;
                    var10[8].field_v[-var11 - (1 + -var9) + var9 * var12] = param2;
                    var12++;
                    continue L9;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_kv__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_v.length) {
                var12++;
                continue L0;
              } else {
                var13.field_v[var14] = param5;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[16];
        field_b = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
