/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static int field_f;
    static int[][] field_d;
    static boolean field_c;
    static ud field_b;
    static int field_a;
    static int[] field_e;
    static boolean field_g;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        int var1 = 96 % ((14 - param0) / 60);
        field_e = null;
    }

    final static o[] a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        o[] var10 = null;
        o[] var11_ref_o__ = null;
        int var11 = 0;
        int var12 = 0;
        o var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = wizardrun.field_H;
        var9 = param2 + (param4 + 1);
        var10 = new o[]{new o(var9, var9), new o(param6, var9), new o(var9, var9), new o(var9, param6), new o(64, 64), new o(var9, param6), new o(var9, var9), new o(param6, var9), new o(var9, var9)};
        var11_ref_o__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_o__.length <= var12) {
            L1: {
              if (param3) {
                break L1;
              } else {
                cb.a(-117);
                break L1;
              }
            }
            var11 = 0;
            L2: while (true) {
              if (var11 >= 1) {
                var11 = 0;
                L3: while (true) {
                  if (1 <= var11) {
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param6) {
                        var11 = 0;
                        L5: while (true) {
                          if (param6 >> 1 <= var11) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param2 <= var12) {
                                var11++;
                                continue L5;
                              } else {
                                var10[1].field_B[var11 + param6 * (var9 - (var12 + 1))] = param0;
                                var10[3].field_B[-var12 + (-1 + var9) + var11 * var9] = param0;
                                var10[7].field_B[var12 * param6 + var11] = param0;
                                var10[5].field_B[var11 * var9 - -var12] = param0;
                                var12++;
                                continue L6;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (1 > var12) {
                            var10[7].field_B[var11 + (var9 + (-var12 - 1)) * param6] = param5;
                            var10[5].field_B[-1 + var9 - (var12 - var9 * var11)] = param5;
                            var10[1].field_B[var11 + param6 * var12] = param7;
                            var10[3].field_B[var12 + var9 * var11] = param7;
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
                      if (var12 >= var9) {
                        var11++;
                        continue L3;
                      } else {
                        var10[0].field_B[var12 + var9 * var11] = param7;
                        var10[0].field_B[var11 + var9 * var12] = param7;
                        if (var9 - var11 > var12) {
                          var10[2].field_B[var12 + var11 * var9] = param7;
                          var10[6].field_B[var9 * var12 + var11] = param7;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var12 >= var9) {
                    var11++;
                    continue L2;
                  } else {
                    var10[6].field_B[var12 + (-var11 + (var9 - 1)) * var9] = param5;
                    var10[8].field_B[var12 + (var9 + -var11 - 1) * var9] = param5;
                    var10[2].field_B[var12 * var9 - (-var9 + 1) + -var11] = param5;
                    var10[8].field_B[var12 * var9 + -var11 + (var9 + -1)] = param5;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_o__[var12];
            var14 = 0;
            L10: while (true) {
              if (var14 >= var13.field_B.length) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param1;
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
        field_f = -1;
        field_e = new int[16384];
    }
}
