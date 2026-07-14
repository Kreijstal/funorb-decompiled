/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static int field_c;
    static ag field_a;
    static int field_d;
    static boolean field_b;

    public static void a(int param0) {
        if (param0 != 5565) {
            Object var2 = null;
            byte[] discarded$0 = sc.a(true, true, (Object) null);
        }
        field_a = null;
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        ni var4 = null;
        if (param2 == null) {
            return null;
        }
        if (!param1) {
            field_b = true;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (param0) {
                return kh.a(var3, (byte) -16);
            }
            return var3;
        }
        if (!(!(param2 instanceof ni))) {
            var4 = (ni) param2;
            return var4.a(3006);
        }
        throw new IllegalArgumentException();
    }

    final static ea[] a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int var9 = 0;
        ea[] var10 = null;
        ea[] var11_ref_ea__ = null;
        int var11 = 0;
        int var12 = 0;
        ea var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = MinerDisturbance.field_ab;
        var9 = param2 + param8 + param5;
        var10 = new ea[]{new ea(var9, var9), new ea(param0, var9), new ea(var9, var9), new ea(var9, param0), new ea(64, 64), new ea(var9, param0), new ea(var9, var9), new ea(param0, var9), new ea(var9, var9)};
        var11_ref_ea__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_ea__.length) {
            if (param6 == -81) {
              var11 = 0;
              L1: while (true) {
                if (param8 <= var11) {
                  var11 = 0;
                  L2: while (true) {
                    if (var11 >= param8) {
                      var11 = 0;
                      L3: while (true) {
                        if (param0 <= var11) {
                          var11 = 0;
                          L4: while (true) {
                            if (param0 >> -1061376319 <= var11) {
                              return var10;
                            } else {
                              var12 = 0;
                              L5: while (true) {
                                if (var12 >= param2) {
                                  var11++;
                                  continue L4;
                                } else {
                                  var10[1].field_D[param0 * (var9 - var12 - 1) - -var11] = param3;
                                  var10[3].field_D[var9 * var11 - 1 - (-var9 - -var12)] = param3;
                                  var10[7].field_D[param0 * var12 + var11] = param3;
                                  var10[5].field_D[var11 * var9 - -var12] = param3;
                                  var12++;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var12 = 0;
                          L6: while (true) {
                            if (param8 <= var12) {
                              var11++;
                              continue L3;
                            } else {
                              var10[7].field_D[param0 * (-var12 + var9 + -1) + var11] = param7;
                              var10[5].field_D[-var12 - (1 + -var9 - var9 * var11)] = param7;
                              var10[1].field_D[param0 * var12 + var11] = param4;
                              var10[3].field_D[var11 * var9 + var12] = param4;
                              var12++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var12 = 0;
                      L7: while (true) {
                        if (var9 > var12) {
                          var10[0].field_D[var12 - -(var11 * var9)] = param4;
                          var10[0].field_D[var11 + var12 * var9] = param4;
                          if (var12 < var9 + -var11) {
                            var10[2].field_D[var11 * var9 + var12] = param4;
                            var10[6].field_D[var11 + var9 * var12] = param4;
                            var12++;
                            continue L7;
                          } else {
                            var12++;
                            continue L7;
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
                  L8: while (true) {
                    if (var9 <= var12) {
                      var11++;
                      continue L1;
                    } else {
                      var10[6].field_D[var12 + var9 * (-1 + (-var11 + var9))] = param7;
                      var10[8].field_D[var9 * (-1 + -var11 + var9) - -var12] = param7;
                      var10[2].field_D[var9 * var12 - 1 - (-var9 + var11)] = param7;
                      var10[8].field_D[var9 + -1 + (-var11 + var12 * var9)] = param7;
                      var12++;
                      continue L8;
                    }
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var13 = var11_ref_ea__[var12];
            var14 = 0;
            L9: while (true) {
              if (var13.field_D.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_D[var14] = param1;
                var14++;
                continue L9;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = new ag();
    }
}
