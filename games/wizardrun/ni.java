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
          if (-1 > (gd.field_c ^ -1)) {
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
                        var4 = var3 >> 1920541124;
                        if ((var4 ^ -1) <= -11) {
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
                        if ((var3 ^ -1) <= -11) {
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
          if (-1 > (gd.field_c ^ -1)) {
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
                        var4 = var3 >> 1920541124;
                        if ((var4 ^ -1) <= -11) {
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
                        if ((var3 ^ -1) <= -11) {
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
        Object var1 = null;
        byte[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_46_0 = 0;
        var7 = wizardrun.field_H;
        var1 = null;
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
            L0: while (true) {
              L1: {
                L2: {
                  if ((var6 ^ -1) <= -301) {
                    break L2;
                  } else {
                    int incrementValue$3 = var2;
                    var2++;
                    tc.field_l.field_j[var6] = var8[incrementValue$3];
                    int incrementValue$4 = var2;
                    var2++;
                    tc.field_l.field_f[var6] = var8[incrementValue$4];
                    stackOut_7_0 = tc.field_l.field_j[var6];
                    stackIn_47_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var7 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          if (stackIn_8_0 < 1) {
                            break L4;
                          } else {
                            if (tc.field_l.field_j[var6] > 3) {
                              break L4;
                            } else {
                              stackOut_10_0 = 1;
                              stackIn_12_0 = stackOut_10_0;
                              break L3;
                            }
                          }
                        }
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      }
                      L5: {
                        var3 = stackIn_12_0;
                        if (1 != qh.field_l) {
                          break L5;
                        } else {
                          if (7 > tc.field_l.field_j[var6]) {
                            break L5;
                          } else {
                            if (-10 <= (tc.field_l.field_j[var6] ^ -1)) {
                              var3 = 1;
                              tc.field_l.field_f[var6] = 1;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      L6: {
                        if (qh.field_l == 2) {
                          if ((tc.field_l.field_j[var6] ^ -1) > -11) {
                            break L6;
                          } else {
                            if (12 >= tc.field_l.field_j[var6]) {
                              var3 = 1;
                              tc.field_l.field_f[var6] = 1;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((qh.field_l ^ -1) != -1) {
                          break L7;
                        } else {
                          if (ql.field_c == 0) {
                            var3 = 0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        L9: {
                          L10: {
                            if (6 > var5) {
                              break L10;
                            } else {
                              if (var5 < 9) {
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          L11: {
                            if ((var4 ^ -1) > -7) {
                              break L11;
                            } else {
                              if (-15 >= (var4 ^ -1)) {
                                break L11;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 = 0;
                          if (var7 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                        if (var4 < 6) {
                          break L8;
                        } else {
                          if (14 > var4) {
                            var3 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var4++;
                          if (var3 == 0) {
                            break L13;
                          } else {
                            tc.field_l.field_d[var6] = true;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        tc.field_l.field_d[var6] = false;
                        break L12;
                      }
                      L14: {
                        if (var4 >= 20) {
                          var4 = 0;
                          var5++;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      int incrementValue$5 = var2;
                      var2++;
                      tc.field_l.field_a[var6] = var8[incrementValue$5];
                      var6++;
                      if (var7 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                ge.field_f = 0;
                stackOut_46_0 = 0;
                stackIn_47_0 = stackOut_46_0;
                break L1;
              }
              il.field_e = stackIn_47_0 != 0;
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var9 = null;
        String[] var13 = null;
        String[] var14 = null;
        String[] var15 = null;
        String[] var16 = null;
        String[] var17 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var5 = wizardrun.field_H;
        wc.field_j = mi.field_z;
        if (param1 == -101) {
          L0: {
            L1: {
              if (255 != param3) {
                break L1;
              } else {
                L2: {
                  stackOut_18_0 = -29309;
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_19_0 = stackOut_18_0;
                  if (ac.field_t >= 13) {
                    stackOut_20_0 = stackIn_20_0;
                    stackOut_20_1 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    stackIn_21_1 = stackOut_20_1;
                    break L2;
                  } else {
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L2;
                  }
                }
                kd.field_a = ii.a(stackIn_21_0, stackIn_21_1 != 0);
                var6 = null;
                f.a((byte) -117, (String[]) null);
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if ((param3 ^ -1) > -101) {
              kd.field_a = hf.a(-105, param0, param3);
              if (var5 == 0) {
                break L0;
              } else {
                var17 = param2;
                f.a((byte) -117, var17);
                kd.field_a = rc.a(param2, (byte) -106);
                return;
              }
            } else {
              if (-106 <= (param3 ^ -1)) {
                var16 = param2;
                f.a((byte) -117, var16);
                kd.field_a = rc.a(param2, (byte) -106);
                return;
              } else {
                kd.field_a = hf.a(-105, param0, param3);
                if (var5 == 0) {
                  return;
                } else {
                  var15 = param2;
                  f.a((byte) -117, var15);
                  kd.field_a = rc.a(param2, (byte) -106);
                  return;
                }
              }
            }
          }
          return;
        } else {
          L3: {
            ni.b(64);
            if (255 != param3) {
              break L3;
            } else {
              L4: {
                stackOut_2_0 = -29309;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (ac.field_t >= 13) {
                  stackOut_4_0 = stackIn_4_0;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L4;
                } else {
                  stackOut_3_0 = stackIn_3_0;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L4;
                }
              }
              kd.field_a = ii.a(stackIn_5_0, stackIn_5_1 != 0);
              var6 = null;
              f.a((byte) -117, (String[]) null);
              if (var5 != 0) {
                break L3;
              } else {
                return;
              }
            }
          }
          if ((param3 ^ -1) > -101) {
            kd.field_a = hf.a(-105, param0, param3);
            if (var5 == 0) {
              return;
            } else {
              var14 = param2;
              f.a((byte) -117, var14);
              kd.field_a = rc.a(param2, (byte) -106);
              return;
            }
          } else {
            if (-106 <= (param3 ^ -1)) {
              var13 = param2;
              f.a((byte) -117, var13);
              kd.field_a = rc.a(param2, (byte) -106);
              return;
            } else {
              kd.field_a = hf.a(-105, param0, param3);
              if (var5 == 0) {
                return;
              } else {
                var9 = param2;
                f.a((byte) -117, var9);
                kd.field_a = rc.a(param2, (byte) -106);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
