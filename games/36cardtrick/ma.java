/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    static boolean[] field_a;
    static String field_b;
    static String[] field_d;
    static int field_c;

    final static kc[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, byte param8) {
        int var9 = 0;
        kc[] var10 = null;
        kc[] var11_ref_kc__ = null;
        int var11 = 0;
        int var12 = 0;
        kc var13 = null;
        int var14 = 0;
        int var15 = 0;
        var15 = Main.field_T;
        var9 = param3 + param1 + param6;
        var10 = new kc[]{new kc(var9, var9), new kc(param4, var9), new kc(var9, var9), new kc(var9, param4), new kc(64, 64), new kc(var9, param4), new kc(var9, var9), new kc(param4, var9), new kc(var9, var9)};
        var11_ref_kc__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_kc__.length) {
            var10 = var11_ref_kc__;
            var11 = 0;
            L1: while (true) {
              if (param1 <= var11) {
                L2: {
                  if (param8 < -12) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                var11 = 0;
                L3: while (true) {
                  if (var11 >= param1) {
                    var11 = 0;
                    L4: while (true) {
                      if (param4 <= var11) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param4 >> 548650273) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (param3 > var12) {
                                var10[1].field_r[(var9 + (-var12 - 1)) * param4 - -var11] = param5;
                                var10[3].field_r[var9 * var11 - (var12 + (1 + -var9))] = param5;
                                var10[7].field_r[var12 * param4 - -var11] = param5;
                                var10[5].field_r[var9 * var11 + var12] = param5;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param1 <= var12) {
                            var11++;
                            continue L4;
                          } else {
                            var10[7].field_r[(-1 + (var9 - var12)) * param4 + var11] = param0;
                            var10[5].field_r[-var12 - -var9 + (-1 + var11 * var9)] = param0;
                            var10[1].field_r[var11 + var12 * param4] = param7;
                            var10[3].field_r[var12 + var11 * var9] = param7;
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
                        var10[0].field_r[var12 - -(var11 * var9)] = param7;
                        var10[0].field_r[var9 * var12 + var11] = param7;
                        if (var9 + -var11 > var12) {
                          var10[2].field_r[var12 + var11 * var9] = param7;
                          var10[6].field_r[var12 * var9 - -var11] = param7;
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
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_r[(var9 - var11 - 1) * var9 + var12] = param0;
                    var10[8].field_r[(-1 + (-var11 + var9)) * var9 + var12] = param0;
                    var10[2].field_r[-1 - (-var9 - -var11 - var9 * var12)] = param0;
                    var10[8].field_r[var9 * var12 - var11 - (1 + -var9)] = param0;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_kc__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_r.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_r[var14] = param2;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static qa a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        qa var5 = null;
        int var6 = Main.field_T;
        String var2 = he.a(param1 + -21124, param0, "jagex-last-login-method");
        if (!(var2 != null)) {
            return bf.field_c;
        }
        qa[] var3 = ff.a(param1 + -17914);
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.a(true, var2)) {
                return var5;
            }
        }
        if (param1 != -3825) {
            field_c = -86;
        }
        return bf.field_c;
    }

    final static ac a(Throwable param0, String param1) {
        ac var2 = null;
        if (!(param0 instanceof ac)) {
            var2 = new ac(param0, param1);
        } else {
            var2 = (ac) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        }
        return var2;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -27) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Main.field_T;
          d.field_a = null;
          ed.field_c = 0;
          tf.field_r = null;
          var2 = ak.field_O;
          ak.field_O = ej.field_kb;
          if (51 == param1) {
            dg.field_H.field_l = 2;
            break L0;
          } else {
            if (-51 != (param1 ^ -1)) {
              dg.field_H.field_l = 1;
              break L0;
            } else {
              dg.field_H.field_l = 5;
              break L0;
            }
          }
        }
        L1: {
          ej.field_kb = var2;
          dg.field_H.field_b = dg.field_H.field_b + 1;
          if (param0 > dg.field_H.field_b) {
            break L1;
          } else {
            if (51 == param1) {
              return 2;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (dg.field_H.field_b < 2) {
            break L2;
          } else {
            if ((param1 ^ -1) != -51) {
              break L2;
            } else {
              return 5;
            }
          }
        }
        if ((dg.field_H.field_b ^ -1) > -5) {
          return -1;
        } else {
          return 1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_c = 0;
    }
}
