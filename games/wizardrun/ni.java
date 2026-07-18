/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        try {
            int var1_int = 2 / ((-46 - param0) / 47);
            field_a = null;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ni.D(" + param0 + ')');
        }
    }

    final static String c(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_22_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_21_0 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                ni.b(-9);
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
                if (gd.field_c <= 0) {
                  break L3;
                } else {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~gd.field_c >= ~var2) {
                      break L3;
                    } else {
                      stackOut_7_0 = var1_ref + ' ';
                      stackIn_22_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_8_0;
                            var3 = nk.field_N.field_k[var2] & 255;
                            var4 = var3 >> 1920541124;
                            if (var4 >= 10) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            var3 = var3 & 15;
                            var1_ref = var1_ref + (char)var4;
                            if (var3 >= 10) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_21_0 = (String) var1_ref;
              stackIn_22_0 = stackOut_21_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ni.A(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final static void b(int param0) {
        Object var1_ref = null;
        RuntimeException var1 = null;
        byte[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_79_0 = 0;
        var1_ref = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var1_ref = null;
            var1_array = fl.field_T[qh.field_l][ql.field_c];
            if (null == var1_array) {
              return;
            } else {
              var2 = 0;
              if (param0 == 7530) {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var6 >= 300) {
                        break L3;
                      } else {
                        int incrementValue$3 = var2;
                        var2++;
                        tc.field_l.field_j[var6] = var1_array[incrementValue$3];
                        int incrementValue$4 = var2;
                        var2++;
                        tc.field_l.field_f[var6] = var1_array[incrementValue$4];
                        stackOut_9_0 = tc.field_l.field_j[var6];
                        stackIn_80_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_10_0 < 1) {
                                break L5;
                              } else {
                                if (tc.field_l.field_j[var6] > 3) {
                                  break L5;
                                } else {
                                  stackOut_16_0 = 1;
                                  stackIn_19_0 = stackOut_16_0;
                                  break L4;
                                }
                              }
                            }
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            break L4;
                          }
                          L6: {
                            var3 = stackIn_19_0;
                            if (1 != qh.field_l) {
                              break L6;
                            } else {
                              if (7 > tc.field_l.field_j[var6]) {
                                break L6;
                              } else {
                                if (tc.field_l.field_j[var6] <= 9) {
                                  var3 = 1;
                                  tc.field_l.field_f[var6] = 1;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            if (qh.field_l == 2) {
                              if (tc.field_l.field_j[var6] < 10) {
                                break L7;
                              } else {
                                if (12 >= tc.field_l.field_j[var6]) {
                                  var3 = 1;
                                  tc.field_l.field_f[var6] = 1;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            if (qh.field_l != 0) {
                              break L8;
                            } else {
                              if (ql.field_c == 0) {
                                var3 = 0;
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            L10: {
                              L11: {
                                if (6 > var5) {
                                  break L11;
                                } else {
                                  if (var5 < 9) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (var4 < 6) {
                                  break L12;
                                } else {
                                  if (var4 >= 14) {
                                    break L12;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              var3 = 0;
                              if (var7 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                            if (var4 < 6) {
                              break L9;
                            } else {
                              if (14 > var4) {
                                var3 = 0;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L13: {
                            L14: {
                              var4++;
                              if (var3 == 0) {
                                break L14;
                              } else {
                                tc.field_l.field_d[var6] = true;
                                if (var7 == 0) {
                                  break L13;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            tc.field_l.field_d[var6] = false;
                            break L13;
                          }
                          L15: {
                            if (var4 >= 20) {
                              var4 = 0;
                              var5++;
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          int incrementValue$5 = var2;
                          var2++;
                          tc.field_l.field_a[var6] = var1_array[incrementValue$5];
                          var6++;
                          if (var7 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    ge.field_f = 0;
                    stackOut_79_0 = 0;
                    stackIn_80_0 = stackOut_79_0;
                    break L2;
                  }
                  il.field_e = stackIn_80_0 != 0;
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ni.C(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              wc.field_j = mi.field_z;
              if (param1 == -101) {
                break L1;
              } else {
                ni.b(64);
                break L1;
              }
            }
            L2: {
              L3: {
                if (255 != param3) {
                  break L3;
                } else {
                  L4: {
                    stackOut_5_0 = -29309;
                    stackIn_10_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (ac.field_t >= 13) {
                      stackOut_10_0 = stackIn_10_0;
                      stackOut_10_1 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      break L4;
                    } else {
                      stackOut_6_0 = stackIn_6_0;
                      stackIn_8_0 = stackOut_6_0;
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      stackIn_11_1 = stackOut_8_1;
                      break L4;
                    }
                  }
                  kd.field_a = ii.a(stackIn_11_0, stackIn_11_1 != 0);
                  f.a((byte) -117, (String[]) null);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L5: {
                L6: {
                  if (param3 < 100) {
                    break L6;
                  } else {
                    if (param3 <= 105) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                kd.field_a = hf.a(-105, param0, param3);
                if (var5 == 0) {
                  break L2;
                } else {
                  break L5;
                }
              }
              var4 = param2;
              f.a((byte) -117, var4);
              kd.field_a = rc.a(param2, (byte) -106);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4_ref;
            stackOut_23_1 = new StringBuilder().append("ni.B(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
