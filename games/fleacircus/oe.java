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
            field_b = (String) null;
        }
    }

    final static void a(byte param0, int param1, int param2) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        var9 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param1 >= 0) {
                  var3_int = param1 * se.field_a.length / ia.field_m[fleas.field_E].length;
                  var13 = ia.field_m[param2][param1].field_c;
                  nl.field_c[param2][param1].d(0, 0);
                  var5 = 39;
                  L2: while (true) {
                    if (var5 < 0) {
                      var5 = 39;
                      L3: while (true) {
                        if (var5 < 0) {
                          var5 = 39;
                          var8 = 77 / ((-51 - param0) / 52);
                          L4: while (true) {
                            if (-1 < (var5 ^ -1)) {
                              decompiledRegionSelector0 = 1;
                              break L0;
                            } else {
                              var6 = 20;
                              L5: while (true) {
                                if (-1 < (var6 ^ -1)) {
                                  var5--;
                                  continue L4;
                                } else {
                                  L6: {
                                    L7: {
                                      var7 = var13[var5][var6];
                                      if (var7 == 17) {
                                        break L7;
                                      } else {
                                        if (31 != var7) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    aj.field_t[36 + var7].d(-4 + var5 * 16, 16 * var6 + -4);
                                    break L6;
                                  }
                                  var6--;
                                  continue L5;
                                }
                              }
                            }
                          }
                        } else {
                          var6 = 20;
                          L8: while (true) {
                            if ((var6 ^ -1) > -1) {
                              var5--;
                              continue L3;
                            } else {
                              L9: {
                                var7 = var13[var5][var6];
                                if (-3 == (var7 ^ -1)) {
                                  de.a((byte) 88, var5, var3_int, var6);
                                  break L9;
                                } else {
                                  if (var7 == 7) {
                                    de.a((byte) 88, var5, var3_int, var6);
                                    break L9;
                                  } else {
                                    if (var7 != 0) {
                                      aj.field_t[36 + var7].d(var5 * 16 + -4, 16 * var6 - 4);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              var6--;
                              continue L8;
                            }
                          }
                        }
                      }
                    } else {
                      var6 = 20;
                      L10: while (true) {
                        if (var6 < 0) {
                          var5--;
                          continue L2;
                        } else {
                          L11: {
                            var7 = var13[var5][var6];
                            if (-3 == (var7 ^ -1)) {
                              de.a((byte) 88, var5, var3_int, var6);
                              break L11;
                            } else {
                              if (var7 == 7) {
                                de.a((byte) 88, var5, var3_int, var6);
                                break L11;
                              } else {
                                if (var7 == 18) {
                                  lg.a(-4, var6, var3_int, var5);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          L12: {
                            if (var7 == 0) {
                              break L12;
                            } else {
                              aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                              break L12;
                            }
                          }
                          var6--;
                          continue L10;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "oe.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0) {
        if (!ok.field_w) {
          if (oh.field_db <= c.field_S) {
            if (c.field_S >= oh.field_db + fj.field_b) {
              if (param0 == 19007) {
                return null;
              } else {
                oe.a(-82);
                return null;
              }
            } else {
              return gf.field_b;
            }
          } else {
            if (param0 == 19007) {
              return null;
            } else {
              oe.a(-82);
              return null;
            }
          }
        } else {
          if (param0 == 19007) {
            return null;
          } else {
            oe.a(-82);
            return null;
          }
        }
    }

    static {
        field_b = "<%0>Fans:<%1> these blow any fleas in direct horizontal line away from the fan until they hit an obstacle, at which point the fan holds them there. Placing a wall in the jet of air will block the fan and let the fleas fall.";
        field_a = 0;
    }
}
