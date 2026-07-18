/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static boolean field_c;
    static mn field_a;
    static String field_b;

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "ih.B(" + 122 + ')');
        }
    }

    final static void a(boolean param0, gk param1, int param2, int param3, int param4) {
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
        int stackIn_10_0 = 0;
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
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
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
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = mr.a((-param4 + param3) * 3, (byte) -115);
              var6 = 3 * param4;
              var7 = -10 + var5_int;
              int discarded$2 = -114;
              aw.C();
              if (0 >= param1.field_E) {
                break L1;
              } else {
                if (null == param1.field_a) {
                  break L1;
                } else {
                  int discarded$3 = 71;
                  ad.c();
                  break L1;
                }
              }
            }
            sv.field_b = 0;
            var8 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param1.field_n >= ~var8) {
                    break L4;
                  } else {
                    var9 = param1.field_A[var8];
                    var10 = param1.field_b[var8];
                    var11 = param1.field_l[var8];
                    stackOut_9_0 = 0;
                    stackIn_52_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var19 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_10_0 == 0) {
                            break L6;
                          } else {
                            var12 = we.field_z[var9];
                            var13 = hp.field_o[var9];
                            var14 = we.field_z[var10] - var12;
                            var15 = we.field_z[var11] - var12;
                            var16 = hp.field_o[var10] - var13;
                            var17 = hp.field_o[var11] + -var13;
                            if (var14 * var17 - var16 * var15 < 0) {
                              break L6;
                            } else {
                              if (var19 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L7: {
                          var12 = gi.field_k[var9];
                          if (-2147483648 != var12) {
                            break L7;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          var13 = gi.field_k[var10];
                          if (var13 != -2147483648) {
                            break L8;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          var14 = gi.field_k[var11];
                          if (var14 != -2147483648) {
                            break L9;
                          } else {
                            if (var19 == 0) {
                              break L5;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          var15 = var12 + var13 - (-var14 - -var6);
                          stackOut_29_0 = -1;
                          stackOut_29_1 = rg.field_C.length;
                          stackIn_32_0 = stackOut_29_0;
                          stackIn_32_1 = stackOut_29_1;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          if (0 > var7) {
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
                        var16 = stackIn_33_0 + (stackIn_33_1 - stackIn_33_2);
                        var17 = rg.field_C[var16];
                        L11: while (true) {
                          L12: {
                            L13: {
                              if (var17 >> 4 == 0) {
                                break L13;
                              } else {
                                var16--;
                                stackOut_35_0 = 0;
                                stackOut_35_1 = var16;
                                stackIn_43_0 = stackOut_35_0;
                                stackIn_43_1 = stackOut_35_1;
                                stackIn_36_0 = stackOut_35_0;
                                stackIn_36_1 = stackOut_35_1;
                                if (var19 != 0) {
                                  break L12;
                                } else {
                                  L14: {
                                    if (stackIn_36_0 > stackIn_36_1) {
                                      System.err.println("Out of range!");
                                      if (var19 == 0) {
                                        break L5;
                                      } else {
                                        break L14;
                                      }
                                    } else {
                                      break L14;
                                    }
                                  }
                                  var17 = rg.field_C[var16];
                                  if (var19 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            stackOut_42_0 = var16 << 4;
                            stackOut_42_1 = -var17;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L12;
                          }
                          L15: {
                            var18 = stackIn_43_0 - stackIn_43_1;
                            Sumoblitz.field_G[var18] = var8;
                            rg.field_C[var16] = var17 - -1;
                            if (param1.field_E <= 0) {
                              break L15;
                            } else {
                              if (null == param1.field_a) {
                                break L15;
                              } else {
                                cv.field_G[param1.field_a[var8]] = cv.field_G[param1.field_a[var8]] + 1;
                                break L15;
                              }
                            }
                          }
                          sv.field_b = sv.field_b + 1;
                          break L5;
                        }
                      }
                      var8++;
                      if (var19 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_51_0 = -1;
                stackIn_52_0 = stackOut_51_0;
                break L3;
              }
              L16: {
                if (stackIn_52_0 == -1) {
                  break L16;
                } else {
                  field_a = null;
                  break L16;
                }
              }
              L17: {
                L18: {
                  if (0 >= param1.field_E) {
                    break L18;
                  } else {
                    if (param1.field_a == null) {
                      break L18;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L19: while (true) {
                        if (~cv.field_G.length >= ~var9) {
                          break L18;
                        } else {
                          var10 = cv.field_G[var9];
                          cv.field_G[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var19 != 0) {
                            break L17;
                          } else {
                            if (var19 == 0) {
                              continue L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L17;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var5 = decompiledCaughtException;
            stackOut_66_0 = (RuntimeException) var5;
            stackOut_66_1 = new StringBuilder().append("ih.A(").append(false).append(',');
            stackIn_69_0 = stackOut_66_0;
            stackIn_69_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param1 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L20;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_70_0 = stackOut_67_0;
              stackIn_70_1 = stackOut_67_1;
              stackIn_70_2 = stackOut_67_2;
              break L20;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + -1 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0) {
        try {
            hc.field_f = wt.field_h[2];
            iv.field_i = wt.field_h[1];
            ki.field_f = wt.field_h[0];
            int var1_int = 21;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "ih.C(" + -125 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_b = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
    }
}
