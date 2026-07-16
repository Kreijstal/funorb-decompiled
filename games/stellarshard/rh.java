/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh {
    static String field_c;
    static pb[] field_a;
    static pa field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 > -61) {
            return;
        }
        try {
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rh.B(" + param0 + 41);
        }
    }

    final static void a(boolean param0, n param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0 = false;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_42_0 = 0;
        int stackOut_42_1 = 0;
        int stackOut_51_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        var19 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param2 == -115) {
                break L1;
              } else {
                rh.a(true, (n) null, (byte) 64, 68, 93);
                break L1;
              }
            }
            L2: {
              var5_int = ug.a((param4 - param3) * 3, 4);
              var6 = 3 * param3;
              var7 = -10 + var5_int;
              al.b(false);
              if (0 >= param1.field_N) {
                break L2;
              } else {
                if (null == param1.field_g) {
                  break L2;
                } else {
                  nh.c(-83);
                  break L2;
                }
              }
            }
            ld.field_A = 0;
            var8 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  if ((var8 ^ -1) <= (param1.field_C ^ -1)) {
                    break L5;
                  } else {
                    var9 = param1.field_l[var8];
                    var10 = param1.field_z[var8];
                    var11 = param1.field_m[var8];
                    stackOut_12_0 = param0;
                    stackIn_52_0 = stackOut_12_0 ? 1 : 0;
                    stackIn_13_0 = stackOut_12_0;
                    if (var19 != 0) {
                      break L4;
                    } else {
                      L6: {
                        L7: {
                          if (!stackIn_13_0) {
                            break L7;
                          } else {
                            var12 = nh.field_d[var9];
                            var13 = od.field_s[var9];
                            var14 = nh.field_d[var10] + -var12;
                            var15 = nh.field_d[var11] + -var12;
                            var16 = -var13 + od.field_s[var10];
                            var17 = -var13 + od.field_s[var11];
                            if (-1 < (var17 * var14 - var16 * var15 ^ -1)) {
                              break L7;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        L8: {
                          var12 = wl.field_P[var9];
                          if (var12 != -2147483648) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        var13 = wl.field_P[var10];
                        if ((var13 ^ -1) == 2147483647) {
                          break L6;
                        } else {
                          L9: {
                            var14 = wl.field_P[var11];
                            if (var14 != -2147483648) {
                              break L9;
                            } else {
                              if (var19 == 0) {
                                break L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            var15 = -var6 + (var14 + var12) - -var13;
                            stackOut_29_0 = gg.field_h.length;
                            stackOut_29_1 = 1;
                            stackIn_32_0 = stackOut_29_0;
                            stackIn_32_1 = stackOut_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            if (var7 < 0) {
                              stackOut_32_0 = stackIn_32_0;
                              stackOut_32_1 = stackIn_32_1;
                              stackOut_32_2 = var15 << -var7;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              stackIn_33_2 = stackOut_32_2;
                              break L10;
                            } else {
                              stackOut_30_0 = stackIn_30_0;
                              stackOut_30_1 = stackIn_30_1;
                              stackOut_30_2 = var15 >> var7;
                              stackIn_33_0 = stackOut_30_0;
                              stackIn_33_1 = stackOut_30_1;
                              stackIn_33_2 = stackOut_30_2;
                              break L10;
                            }
                          }
                          var16 = stackIn_33_0 - (stackIn_33_1 - -stackIn_33_2);
                          var17 = gg.field_h[var16];
                          L11: while (true) {
                            L12: {
                              L13: {
                                if ((var17 >> 682782468 ^ -1) == -1) {
                                  break L13;
                                } else {
                                  var16--;
                                  stackOut_35_0 = -1;
                                  stackOut_35_1 = var16 ^ -1;
                                  stackIn_43_0 = stackOut_35_0;
                                  stackIn_43_1 = stackOut_35_1;
                                  stackIn_36_0 = stackOut_35_0;
                                  stackIn_36_1 = stackOut_35_1;
                                  if (var19 != 0) {
                                    break L12;
                                  } else {
                                    L14: {
                                      if (stackIn_36_0 < stackIn_36_1) {
                                        System.err.println("Out of range!");
                                        if (var19 == 0) {
                                          break L6;
                                        } else {
                                          break L14;
                                        }
                                      } else {
                                        break L14;
                                      }
                                    }
                                    var17 = gg.field_h[var16];
                                    if (var19 == 0) {
                                      continue L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                              }
                              stackOut_42_0 = var16 << -1914425980;
                              stackOut_42_1 = var17;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              break L12;
                            }
                            L15: {
                              var18 = stackIn_43_0 + stackIn_43_1;
                              ki.field_z[var18] = var8;
                              gg.field_h[var16] = var17 + 1;
                              if (0 >= param1.field_N) {
                                break L15;
                              } else {
                                if (param1.field_g == null) {
                                  break L15;
                                } else {
                                  tg.field_a[param1.field_g[var8]] = tg.field_a[param1.field_g[var8]] + 1;
                                  break L15;
                                }
                              }
                            }
                            ld.field_A = ld.field_A + 1;
                            break L6;
                          }
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                stackOut_51_0 = 0;
                stackIn_52_0 = stackOut_51_0;
                break L4;
              }
              L16: {
                L17: {
                  if (stackIn_52_0 >= param1.field_N) {
                    break L17;
                  } else {
                    if (param1.field_g != null) {
                      var8 = 0;
                      var9 = 0;
                      L18: while (true) {
                        if (tg.field_a.length <= var9) {
                          break L17;
                        } else {
                          var10 = tg.field_a[var9];
                          tg.field_a[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L16;
                          } else {
                            if (var19 == 0) {
                              continue L18;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    } else {
                      break L17;
                    }
                  }
                }
                break L16;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var5 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) var5;
            stackOut_65_1 = new StringBuilder().append("rh.C(").append(param0).append(44);
            stackIn_68_0 = stackOut_65_0;
            stackIn_68_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L19;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_69_0 = stackOut_66_0;
              stackIn_69_1 = stackOut_66_1;
              stackIn_69_2 = stackOut_66_2;
              break L19;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, byte param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -72) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            ee.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2, "rh.A(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Name is available";
    }
}
