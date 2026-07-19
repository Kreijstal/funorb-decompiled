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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[][] var13 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_49_0 = 0;
        int stackOut_49_1 = 0;
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
                    L3: {
                      L4: {
                        L5: {
                          L6: {
                            if (var5 < 0) {
                              break L6;
                            } else {
                              stackOut_6_0 = 20;
                              stackIn_24_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var9 != 0) {
                                break L5;
                              } else {
                                var6 = stackIn_7_0;
                                L7: while (true) {
                                  L8: {
                                    if (var6 < 0) {
                                      break L8;
                                    } else {
                                      var7 = var13[var5][var6];
                                      stackOut_9_0 = -3;
                                      stackOut_9_1 = var7 ^ -1;
                                      stackIn_42_0 = stackOut_9_0;
                                      stackIn_42_1 = stackOut_9_1;
                                      stackIn_10_0 = stackOut_9_0;
                                      stackIn_10_1 = stackOut_9_1;
                                      if (var9 != 0) {
                                        break L4;
                                      } else {
                                        L9: {
                                          if (stackIn_10_0 == stackIn_10_1) {
                                            de.a((byte) 88, var5, var3_int, var6);
                                            break L9;
                                          } else {
                                            if (var7 == 7) {
                                              de.a((byte) 88, var5, var3_int, var6);
                                              break L9;
                                            } else {
                                              if (var7 == 18) {
                                                lg.a(-4, var6, var3_int, var5);
                                                if (var9 == 0) {
                                                  break L9;
                                                } else {
                                                  de.a((byte) 88, var5, var3_int, var6);
                                                  break L9;
                                                }
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                        }
                                        L10: {
                                          if (var7 == 0) {
                                            break L10;
                                          } else {
                                            aj.field_t[var7].d(-4 + var5 * 16, -4 + 16 * var6);
                                            break L10;
                                          }
                                        }
                                        var6--;
                                        if (var9 == 0) {
                                          continue L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  var5--;
                                  if (var9 == 0) {
                                    continue L2;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_23_0 = 39;
                          stackIn_24_0 = stackOut_23_0;
                          break L5;
                        }
                        var5 = stackIn_24_0;
                        L11: while (true) {
                          L12: {
                            if (var5 < 0) {
                              break L12;
                            } else {
                              stackOut_26_0 = 20;
                              stackIn_43_0 = stackOut_26_0;
                              stackIn_27_0 = stackOut_26_0;
                              if (var9 != 0) {
                                break L3;
                              } else {
                                var6 = stackIn_27_0;
                                L13: while (true) {
                                  L14: {
                                    if ((var6 ^ -1) > -1) {
                                      break L14;
                                    } else {
                                      var7 = var13[var5][var6];
                                      stackOut_29_0 = -3;
                                      stackOut_29_1 = var7 ^ -1;
                                      stackIn_42_0 = stackOut_29_0;
                                      stackIn_42_1 = stackOut_29_1;
                                      stackIn_30_0 = stackOut_29_0;
                                      stackIn_30_1 = stackOut_29_1;
                                      if (var9 != 0) {
                                        break L4;
                                      } else {
                                        L15: {
                                          if (stackIn_30_0 == stackIn_30_1) {
                                            de.a((byte) 88, var5, var3_int, var6);
                                            break L15;
                                          } else {
                                            if (var7 == 7) {
                                              de.a((byte) 88, var5, var3_int, var6);
                                              break L15;
                                            } else {
                                              if (var7 != 0) {
                                                aj.field_t[36 + var7].d(var5 * 16 + -4, 16 * var6 - 4);
                                                if (var9 == 0) {
                                                  break L15;
                                                } else {
                                                  de.a((byte) 88, var5, var3_int, var6);
                                                  break L15;
                                                }
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        var6--;
                                        if (var9 == 0) {
                                          continue L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                  }
                                  var5--;
                                  if (var9 == 0) {
                                    continue L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                          }
                          var5 = 39;
                          stackOut_41_0 = 77;
                          stackOut_41_1 = (-51 - param0) / 52;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          break L4;
                        }
                      }
                      stackOut_42_0 = stackIn_42_0 / stackIn_42_1;
                      stackIn_43_0 = stackOut_42_0;
                      break L3;
                    }
                    var8 = stackIn_43_0;
                    L16: while (true) {
                      stackOut_44_0 = -1;
                      stackOut_44_1 = var5 ^ -1;
                      stackIn_45_0 = stackOut_44_0;
                      stackIn_45_1 = stackOut_44_1;
                      L17: while (true) {
                        if (stackIn_45_0 < stackIn_45_1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          if (var9 == 0) {
                            var6 = 20;
                            if (-1 < (var6 ^ -1)) {
                              var5--;
                              continue L16;
                            } else {
                              var7 = var13[var5][var6];
                              stackOut_49_0 = var7;
                              stackOut_49_1 = 17;
                              stackIn_45_0 = stackOut_49_0;
                              stackIn_45_1 = stackOut_49_1;
                              continue L17;
                            }
                          } else {
                            return;
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
        String discarded$6 = null;
        String discarded$7 = null;
        String discarded$8 = null;
        if (!ok.field_w) {
          if (oh.field_db <= c.field_S) {
            if (c.field_S >= oh.field_db + fj.field_b) {
              if (param0 == 19007) {
                return null;
              } else {
                discarded$6 = oe.a(-82);
                return null;
              }
            } else {
              return gf.field_b;
            }
          } else {
            if (param0 == 19007) {
              return null;
            } else {
              discarded$7 = oe.a(-82);
              return null;
            }
          }
        } else {
          if (param0 == 19007) {
            return null;
          } else {
            discarded$8 = oe.a(-82);
            return null;
          }
        }
    }

    static {
        field_b = "<%0>Fans:<%1> these blow any fleas in direct horizontal line away from the fan until they hit an obstacle, at which point the fan holds them there. Placing a wall in the jet of air will block the fan and let the fleas fall.";
        field_a = 0;
    }
}
