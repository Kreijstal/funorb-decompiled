/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        int var1 = 2 / ((-46 - param0) / 47);
        field_a = null;
    }

    final static String c(int param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String stackIn_9_0 = null;
        String stackIn_19_0 = null;
        String stackIn_26_0 = null;
        String stackIn_36_0 = null;
        String stackOut_25_0 = null;
        String stackOut_35_0 = null;
        String stackOut_8_0 = null;
        String stackOut_18_0 = null;
        var5 = wizardrun.field_H;
        if (param0 == 6) {
          var15 = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
          if (gd.field_c > 0) {
            var1 = var15 + ":";
            var2 = 0;
            L0: while (true) {
              if (gd.field_c > var2) {
                L1: {
                  stackOut_25_0 = var1 + 32;
                  stackIn_36_0 = stackOut_25_0;
                  stackIn_26_0 = stackOut_25_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        var16 = stackIn_26_0;
                        var3 = nk.field_N.field_k[var2] & 255;
                        var4 = var3 >> 4;
                        if (var4 >= 10) {
                          break L3;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var4 += 55;
                      break L2;
                    }
                    L4: {
                      L5: {
                        var3 = var3 & 15;
                        var17 = var16 + (char)var4;
                        if (var3 >= 10) {
                          break L5;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var3 += 55;
                      break L4;
                    }
                    var1 = var17 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      stackOut_35_0 = (String) var1;
                      stackIn_36_0 = stackOut_35_0;
                      break L1;
                    }
                  }
                }
                return stackIn_36_0;
              } else {
                return var1;
              }
            }
          } else {
            return var15;
          }
        } else {
          ni.b(-9);
          var9 = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
          if (gd.field_c > 0) {
            var1 = var9 + ":";
            var2 = 0;
            L6: while (true) {
              if (gd.field_c > var2) {
                L7: {
                  stackOut_8_0 = var1 + 32;
                  stackIn_19_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5 != 0) {
                    break L7;
                  } else {
                    L8: {
                      L9: {
                        var13 = stackIn_9_0;
                        var3 = nk.field_N.field_k[var2] & 255;
                        var4 = var3 >> 4;
                        if (var4 >= 10) {
                          break L9;
                        } else {
                          var4 += 48;
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      var4 += 55;
                      break L8;
                    }
                    L10: {
                      L11: {
                        var3 = var3 & 15;
                        var14 = var13 + (char)var4;
                        if (var3 >= 10) {
                          break L11;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      var3 += 55;
                      break L10;
                    }
                    var1 = var14 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L6;
                    } else {
                      stackOut_18_0 = (String) var1;
                      stackIn_19_0 = stackOut_18_0;
                      break L7;
                    }
                  }
                }
                return stackIn_19_0;
              } else {
                return var1;
              }
            }
          } else {
            return var9;
          }
        }
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
        byte[] var8 = null;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_48_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_47_0 = 0;
        var1_ref = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var1_ref = null;
            var8 = fl.field_T[qh.field_l][ql.field_c];
            var1_array = var8;
            if (var1_array == null) {
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
                        tc.field_l.field_j[var6] = var8[incrementValue$3];
                        int incrementValue$4 = var2;
                        var2++;
                        tc.field_l.field_f[var6] = var8[incrementValue$4];
                        stackOut_8_0 = tc.field_l.field_j[var6];
                        stackIn_48_0 = stackOut_8_0;
                        stackIn_9_0 = stackOut_8_0;
                        if (var7 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              if (stackIn_9_0 < 1) {
                                break L5;
                              } else {
                                if (tc.field_l.field_j[var6] > 3) {
                                  break L5;
                                } else {
                                  stackOut_11_0 = 1;
                                  stackIn_13_0 = stackOut_11_0;
                                  break L4;
                                }
                              }
                            }
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L4;
                          }
                          L6: {
                            var3 = stackIn_13_0;
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
                          tc.field_l.field_a[var6] = var8[incrementValue$5];
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
                    stackOut_47_0 = 0;
                    stackIn_48_0 = stackOut_47_0;
                    break L2;
                  }
                  il.field_e = stackIn_48_0 != 0;
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
          throw bd.a((Throwable) (Object) var1, "ni.C(" + param0 + 41);
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                    stackOut_4_0 = -29309;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (ac.field_t >= 13) {
                      stackOut_6_0 = stackIn_6_0;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L4;
                    } else {
                      stackOut_5_0 = stackIn_5_0;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L4;
                    }
                  }
                  kd.field_a = ii.a(stackIn_7_0, stackIn_7_1 != 0);
                  var6 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) runtimeException;
            stackOut_15_1 = new StringBuilder().append("ni.B(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          L8: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44).append(param1).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L8;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
