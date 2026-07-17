/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static String field_a;

    public static void a() {
        int var1 = -2;
        field_a = null;
    }

    final static String c() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = wizardrun.field_H;
        String var1 = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
        if (gd.field_c > 0) {
            var1 = var1 + ":";
            for (var2 = 0; gd.field_c > var2; var2++) {
                var1 = var1 + 32;
                var3 = nk.field_N.field_k[var2] & 255;
                var4 = var3 >> 4;
                if (var4 < 10) {
                    var4 += 48;
                } else {
                    var4 += 55;
                }
                var3 = var3 & 15;
                var1 = var1 + (char)var4;
                if (var3 < 10) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var1 + (char)var3;
            }
        }
        return var1;
    }

    final static void b() {
        Object var1_ref = null;
        RuntimeException var1 = null;
        byte[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        var1_ref = null;
        var7 = wizardrun.field_H;
        try {
          L0: {
            var1_ref = null;
            var1_array = fl.field_T[qh.field_l][ql.field_c];
            if (var1_array == null) {
              return;
            } else {
              var2 = 0;
              var4 = 0;
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (var6 >= 300) {
                  ge.field_f = 0;
                  il.field_e = false;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      int incrementValue$3 = var2;
                      var2++;
                      tc.field_l.field_j[var6] = var1_array[incrementValue$3];
                      int incrementValue$4 = var2;
                      var2++;
                      tc.field_l.field_f[var6] = var1_array[incrementValue$4];
                      if (tc.field_l.field_j[var6] < 1) {
                        break L3;
                      } else {
                        if (tc.field_l.field_j[var6] > 3) {
                          break L3;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_12_0 = stackOut_10_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  }
                  L4: {
                    var3 = stackIn_12_0;
                    if (1 != qh.field_l) {
                      break L4;
                    } else {
                      if (7 > tc.field_l.field_j[var6]) {
                        break L4;
                      } else {
                        if (tc.field_l.field_j[var6] <= 9) {
                          var3 = 1;
                          tc.field_l.field_f[var6] = 1;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    if (qh.field_l == 2) {
                      if (tc.field_l.field_j[var6] < 10) {
                        break L5;
                      } else {
                        if (12 >= tc.field_l.field_j[var6]) {
                          var3 = 1;
                          tc.field_l.field_f[var6] = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (qh.field_l != 0) {
                      break L6;
                    } else {
                      if (ql.field_c == 0) {
                        var3 = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    L8: {
                      if (6 > var5) {
                        break L8;
                      } else {
                        if (var5 < 9) {
                          if (var4 < 6) {
                            break L7;
                          } else {
                            if (14 > var4) {
                              var3 = 0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (var4 < 6) {
                        break L9;
                      } else {
                        if (var4 >= 14) {
                          break L9;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3 = 0;
                    break L7;
                  }
                  L10: {
                    var4++;
                    if (var3 == 0) {
                      tc.field_l.field_d[var6] = false;
                      break L10;
                    } else {
                      tc.field_l.field_d[var6] = true;
                      break L10;
                    }
                  }
                  L11: {
                    if (var4 >= 20) {
                      var4 = 0;
                      var5++;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  int incrementValue$5 = var2;
                  var2++;
                  tc.field_l.field_a[var6] = var1_array[incrementValue$5];
                  var6++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "ni.C(" + 7530 + 41);
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              wc.field_j = mi.field_z;
              if (255 != param3) {
                L2: {
                  if (param3 < 100) {
                    break L2;
                  } else {
                    if (param3 <= 105) {
                      var4_array = param2;
                      f.a((byte) -117, var4_array);
                      kd.field_a = rc.a(param2, (byte) -106);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                kd.field_a = hf.a(-105, param0, param3);
                break L1;
              } else {
                L3: {
                  stackOut_2_0 = -29309;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (ac.field_t >= 13) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L3;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L3;
                  }
                }
                kd.field_a = ii.a(stackIn_5_0, stackIn_5_1 != 0);
                var6 = null;
                f.a((byte) -117, (String[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("ni.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(-101).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Use this alternative as your account name";
    }
}
