/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    int field_b;
    static String[] field_d;
    int field_c;
    int field_a;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 10) {
            uo.a((byte) -76);
        }
    }

    final static void b(byte param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        g var11 = null;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        g var15 = null;
        ub var16 = null;
        g var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_34_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        byte stackOut_33_0 = 0;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var16 = new ub(200);
            var2 = 0;
            var3 = 0;
            var4 = 0;
            L1: while (true) {
              stackOut_2_0 = kba.f(-1);
              stackOut_2_1 = var4;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      var5 = rga.b(26499, var4);
                      stackOut_4_0 = 0;
                      stackIn_34_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var13 != 0) {
                        break L3;
                      } else {
                        var6 = stackIn_5_0;
                        L5: while (true) {
                          stackOut_6_0 = var6;
                          stackOut_6_1 = var5;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          L6: while (true) {
                            if (stackIn_7_0 >= stackIn_7_1) {
                              var4++;
                              if (var13 == 0) {
                                continue L1;
                              } else {
                                break L4;
                              }
                            } else {
                              var15 = paa.c(var4, 91, var6);
                              stackOut_8_0 = -1;
                              stackOut_8_1 = var15.field_a;
                              stackIn_3_0 = stackOut_8_0;
                              stackIn_3_1 = stackOut_8_1;
                              stackIn_9_0 = stackOut_8_0;
                              stackIn_9_1 = stackOut_8_1;
                              if (var13 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  L8: {
                                    if (stackIn_9_0 != stackIn_9_1) {
                                      break L8;
                                    } else {
                                      if (var15.field_e.a(-25584)) {
                                        break L8;
                                      } else {
                                        if (var13 == 0) {
                                          break L7;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  var8 = var15.field_e.c(1);
                                  if ((var8 ^ -1) >= -1) {
                                    break L7;
                                  } else {
                                    var9 = 0;
                                    var10 = 0;
                                    L9: while (true) {
                                      L10: {
                                        if (var16.a(-1) <= var10) {
                                          break L10;
                                        } else {
                                          var11 = (g) (var16.a(true, var10));
                                          var12 = var11.field_e.c(1);
                                          stackOut_16_0 = var8;
                                          stackOut_16_1 = var12;
                                          stackIn_7_0 = stackOut_16_0;
                                          stackIn_7_1 = stackOut_16_1;
                                          stackIn_17_0 = stackOut_16_0;
                                          stackIn_17_1 = stackOut_16_1;
                                          if (var13 != 0) {
                                            continue L6;
                                          } else {
                                            L11: {
                                              L12: {
                                                if (stackIn_17_0 < stackIn_17_1) {
                                                  break L12;
                                                } else {
                                                  if (var8 != var12) {
                                                    break L11;
                                                  } else {
                                                    if (var11.field_a <= var15.field_a) {
                                                      break L11;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              var16.a(var10, 0, var15);
                                              var9 = 1;
                                              if (var13 == 0) {
                                                break L10;
                                              } else {
                                                break L11;
                                              }
                                            }
                                            var10++;
                                            if (var13 == 0) {
                                              continue L9;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      L13: {
                                        if (var9 == 0) {
                                          var16.a((byte) -37, var15);
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        if (!var15.field_e.a(-25584)) {
                                          break L14;
                                        } else {
                                          var3++;
                                          if (var13 == 0) {
                                            break L7;
                                          } else {
                                            break L14;
                                          }
                                        }
                                      }
                                      var2++;
                                      break L7;
                                    }
                                  }
                                }
                                var6++;
                                continue L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  qg.field_a = new g[var2];
                  sja.field_i = new g[var3];
                  stackOut_33_0 = param0;
                  stackIn_34_0 = stackOut_33_0;
                  break L3;
                }
                if (stackIn_34_0 <= -54) {
                  var4 = 0;
                  var5 = 0;
                  var6 = 0;
                  L15: while (true) {
                    if (var16.a(-1) <= var6) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = (g) (var16.a(true, var6));
                      var17 = var14;
                      if (var13 == 0) {
                        L16: {
                          L17: {
                            if (!var17.field_e.a(-25584)) {
                              break L17;
                            } else {
                              incrementValue$2 = var5;
                              var5++;
                              sja.field_i[incrementValue$2] = var14;
                              if (var13 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          incrementValue$3 = var4;
                          var4++;
                          qg.field_a[incrementValue$3] = var14;
                          break L16;
                        }
                        var6++;
                        continue L15;
                      } else {
                        return;
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "uo.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
