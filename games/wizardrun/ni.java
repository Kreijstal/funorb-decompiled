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
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = wizardrun.field_H;
        if (param0 != 6) {
            ni.b(-9);
        }
        String var6 = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
        String var1 = var6;
        if (-1 > (gd.field_c ^ -1)) {
            var1 = var6 + ":";
            for (var2 = 0; gd.field_c > var2; var2++) {
                var7 = var1 + ' ';
                var3 = nk.field_N.field_k[var2] & 255;
                var4 = var3 >> 1920541124;
                if ((var4 ^ -1) > -11) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if ((var3 ^ -1) > -11) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    final static void b(int param0) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var1 = null;
        byte[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        Object var1_ref = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var1_ref = null;
            var1_array = fl.field_T[qh.field_l][ql.field_c];
            if (var1_array == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = 0;
              if (param0 == 7530) {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                L1: while (true) {
                  if ((var6 ^ -1) <= -301) {
                    ge.field_f = 0;
                    il.field_e = false;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      incrementValue$3 = var2;
                      var2++;
                      tc.field_l.field_j[var6] = var1_array[incrementValue$3];
                      incrementValue$4 = var2;
                      var2++;
                      tc.field_l.field_f[var6] = var1_array[incrementValue$4];
                      if (tc.field_l.field_j[var6] >= 1) {
                        if (tc.field_l.field_j[var6] <= 3) {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_14_0 = stackOut_11_0;
                          break L2;
                        }
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_14_0 = stackOut_9_0;
                        break L2;
                      }
                    }
                    L3: {
                      var3 = stackIn_14_0;
                      if (1 != qh.field_l) {
                        break L3;
                      } else {
                        if (7 > tc.field_l.field_j[var6]) {
                          break L3;
                        } else {
                          if (-10 <= (tc.field_l.field_j[var6] ^ -1)) {
                            var3 = 1;
                            tc.field_l.field_f[var6] = 1;
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      if (qh.field_l == 2) {
                        if ((tc.field_l.field_j[var6] ^ -1) > -11) {
                          break L4;
                        } else {
                          if (12 >= tc.field_l.field_j[var6]) {
                            var3 = 1;
                            tc.field_l.field_f[var6] = 1;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (qh.field_l != 0) {
                        break L5;
                      } else {
                        if (ql.field_c == 0) {
                          var3 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (6 > var5) {
                          break L7;
                        } else {
                          if (var5 < 9) {
                            if (var4 < 6) {
                              break L6;
                            } else {
                              if (14 > var4) {
                                var3 = 0;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if ((var4 ^ -1) > -7) {
                          break L8;
                        } else {
                          if (-15 >= (var4 ^ -1)) {
                            break L8;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 = 0;
                      break L6;
                    }
                    L9: {
                      var4++;
                      if (var3 == 0) {
                        tc.field_l.field_d[var6] = false;
                        break L9;
                      } else {
                        tc.field_l.field_d[var6] = true;
                        break L9;
                      }
                    }
                    L10: {
                      if (var4 >= 20) {
                        var4 = 0;
                        var5++;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    incrementValue$5 = var2;
                    var2++;
                    tc.field_l.field_a[var6] = var1_array[incrementValue$5];
                    var6++;
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "ni.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        int var5 = 0;
        String[] var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
              if (255 != param3) {
                L3: {
                  if ((param3 ^ -1) > -101) {
                    break L3;
                  } else {
                    if (-106 <= (param3 ^ -1)) {
                      var4_array = param2;
                      f.a((byte) -117, var4_array);
                      kd.field_a = rc.a(param2, (byte) -106);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                kd.field_a = hf.a(-105, param0, param3);
                break L2;
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
                var6 = (String[]) null;
                f.a((byte) -117, (String[]) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ni.B(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Use this alternative as your account name";
    }
}
