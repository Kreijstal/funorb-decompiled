/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_b;
    static int field_a;
    static String[] field_c;

    public static void a() {
        field_b = null;
        field_c = null;
    }

    final static void a(byte param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                      L3: {
                        var5 = 39;
                        if (var5 < 0) {
                          break L3;
                        } else {
                          L4: {
                            var6 = 20;
                            if (var6 < 0) {
                              break L4;
                            } else {
                              L5: {
                                L6: {
                                  L7: {
                                    var7 = var13[var5][var6];
                                    if (var7 == 2) {
                                      de.a((byte) 88, var5, var3_int, var6);
                                      break L7;
                                    } else {
                                      if (var7 == 7) {
                                        de.a((byte) 88, var5, var3_int, var6);
                                        break L6;
                                      } else {
                                        if (var7 != 0) {
                                          aj.field_t[36 + var7].d(var5 * 16 + -4, 16 * var6 - 4);
                                          var6--;
                                          break L7;
                                        } else {
                                          var6--;
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  var6--;
                                  break L6;
                                }
                                var6--;
                                break L5;
                              }
                              var6--;
                              var6--;
                              break L4;
                            }
                          }
                          var5--;
                          break L3;
                        }
                      }
                      var5 = 39;
                      var8 = 77;
                      if (var5 < 0) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        L8: {
                          var6 = 20;
                          if (var6 < 0) {
                            break L8;
                          } else {
                            L9: {
                              L10: {
                                var7 = var13[var5][var6];
                                if (var7 == 17) {
                                  break L10;
                                } else {
                                  if (31 != var7) {
                                    var6--;
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              aj.field_t[36 + var7].d(-4 + var5 * 16, 16 * var6 + -4);
                              break L9;
                            }
                            var6--;
                            var6--;
                            break L8;
                          }
                        }
                        var5--;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      var6 = 20;
                      L11: while (true) {
                        if (var6 < 0) {
                          var5--;
                          continue L2;
                        } else {
                          L12: {
                            var7 = var13[var5][var6];
                            if (var7 == 2) {
                              de.a((byte) 88, var5, var3_int, var6);
                              break L12;
                            } else {
                              if (var7 == 7) {
                                de.a((byte) 88, var5, var3_int, var6);
                                break L12;
                              } else {
                                if (var7 == 18) {
                                  lg.a(-4, var6, var3_int, var5);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            }
                          }
                          if (var7 == 0) {
                            var6--;
                            var6--;
                            var6--;
                            continue L11;
                          } else {
                            aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                            var6--;
                            var6--;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var3, "oe.A(" + -118 + ',' + param1 + ',' + param2 + ')');
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
