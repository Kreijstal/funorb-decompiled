/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 < 7) {
            field_b = null;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        L0: {
          var9 = fleas.field_A ? 1 : 0;
          if (param2 < 0) {
            break L0;
          } else {
            if (param1 >= 0) {
              var3 = param1 * se.field_a.length / ia.field_m[fleas.field_E].length;
              var13 = ia.field_m[param2][param1].field_c;
              nl.field_c[param2][param1].d(0, 0);
              var5 = 39;
              L1: while (true) {
                if (var5 < 0) {
                  L2: {
                    var5 = 39;
                    if (var5 < 0) {
                      break L2;
                    } else {
                      L3: {
                        var6 = 20;
                        if ((var6 ^ -1) > -1) {
                          break L3;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                var7 = var13[var5][var6];
                                if (var7 == 2) {
                                  de.a((byte) 88, var5, var3, var6);
                                  break L6;
                                } else {
                                  if (var7 == 7) {
                                    de.a((byte) 88, var5, var3, var6);
                                    break L5;
                                  } else {
                                    if (var7 != 0) {
                                      aj.field_t[36 + var7].d(var5 * 16 + -4, 16 * var6 - 4);
                                      var6--;
                                      break L6;
                                    } else {
                                      var6--;
                                      break L4;
                                    }
                                  }
                                }
                              }
                              var6--;
                              break L5;
                            }
                            var6--;
                            break L4;
                          }
                          var6--;
                          var6--;
                          break L3;
                        }
                      }
                      var5--;
                      break L2;
                    }
                  }
                  var5 = 39;
                  var8 = 77 / ((-51 - param0) / 52);
                  if (-1 >= var5) {
                    var6 = 20;
                    if (-1 <= var6) {
                      var7 = var13[var5][var6];
                      if (var7 != 17) {
                        if (31 == var7) {
                          aj.field_t[36 + var7].d(-4 + var5 * 16, 16 * var6 + -4);
                          var6--;
                          var6--;
                          var5--;
                          return;
                        } else {
                          var6--;
                          var6--;
                          var6--;
                          var5--;
                          return;
                        }
                      } else {
                        aj.field_t[36 + var7].d(-4 + var5 * 16, 16 * var6 + -4);
                        var6--;
                        var6--;
                        var5--;
                        return;
                      }
                    } else {
                      var5--;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  var6 = 20;
                  L7: while (true) {
                    if (var6 < 0) {
                      var5--;
                      continue L1;
                    } else {
                      L8: {
                        var7 = var13[var5][var6];
                        if (var7 == 2) {
                          de.a((byte) 88, var5, var3, var6);
                          break L8;
                        } else {
                          if (var7 == 7) {
                            de.a((byte) 88, var5, var3, var6);
                            break L8;
                          } else {
                            if (var7 == 18) {
                              lg.a(-4, var6, var3, var5);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        var6--;
                        var6--;
                        var6--;
                        continue L7;
                      } else {
                        aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                        var6--;
                        var6--;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static String a(int param0) {
        if (!ok.field_w) {
          if (oh.field_db <= c.field_S) {
            if (c.field_S >= oh.field_db + fj.field_b) {
              if (param0 == 19007) {
                return null;
              } else {
                String discarded$6 = oe.a(-82);
                return null;
              }
            } else {
              return gf.field_b;
            }
          } else {
            if (param0 == 19007) {
              return null;
            } else {
              String discarded$7 = oe.a(-82);
              return null;
            }
          }
        } else {
          if (param0 == 19007) {
            return null;
          } else {
            String discarded$8 = oe.a(-82);
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "<%0>Fans:<%1> these blow any fleas in direct horizontal line away from the fan until they hit an obstacle, at which point the fan holds them there. Placing a wall in the jet of air will block the fan and let the fleas fall.";
        field_a = 0;
    }
}
