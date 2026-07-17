/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sm extends om {
    static aj field_C;
    static dd field_z;
    static int field_D;
    static String field_B;
    static String field_E;
    static String field_A;

    public static void c(int param0) {
        field_z = null;
        field_B = null;
        field_A = null;
        field_E = null;
        field_C = null;
    }

    private sm(lr param0, int param1) {
        super(param0, param1);
    }

    sm(int param0) {
        this(lc.field_O, param0);
    }

    final static boolean d(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (param0 == -18791) {
            break L0;
          } else {
            boolean discarded$2 = sm.d(72);
            break L0;
          }
        }
        if (vj.field_c[86]) {
          L1: {
            var1 = -1;
            var2 = qi.field_a;
            if (var2 == 16) {
              var1 = 0;
              break L1;
            } else {
              if (var2 != 17) {
                if (var2 == 18) {
                  var1 = 2;
                  break L1;
                } else {
                  if (19 == var2) {
                    var1 = 3;
                    break L1;
                  } else {
                    if (var2 == 20) {
                      var1 = 4;
                      break L1;
                    } else {
                      if (var2 != 21) {
                        if (22 != var2) {
                          if (var2 != 23) {
                            if (var2 == 24) {
                              var1 = 8;
                              break L1;
                            } else {
                              if (25 == var2) {
                                var1 = 9;
                                break L1;
                              } else {
                                return false;
                              }
                            }
                          } else {
                            var1 = 7;
                            break L1;
                          }
                        } else {
                          var1 = 6;
                          break L1;
                        }
                      } else {
                        var1 = 5;
                        break L1;
                      }
                    }
                  }
                }
              } else {
                var1 = 1;
                break L1;
              }
            }
          }
          L2: {
            if (vj.field_c[81]) {
              var1 += 10;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!vj.field_c[82]) {
              break L3;
            } else {
              var1 += 20;
              break L3;
            }
          }
          pd.field_i = pd.field_i ^ 1L << var1;
          rq.a(0, var1);
          return true;
        } else {
          return false;
        }
    }

    final String c(int param0, ei param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -1) {
              stackOut_3_0 = v.a(param1.field_m.length(), 0, '*');
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("sm.V(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, bf param1, int param2, pq param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        long var7 = 0L;
        long var9 = 0L;
        int[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              param3.a(param0 + -1, 118);
              var4_int = -param1.field_j + param1.field_l >> 8;
              var5 = param1.field_a - param1.field_f >> 8;
              var6 = rf.a(aj.a(var4_int, false, var4_int) - -aj.a(var5, false, var5), -123);
              var4_int = lh.a(var6, (byte) -101, (long)var4_int);
              var5 = lh.a(var6, (byte) -61, (long)var5);
              var7 = param3.e(-14770);
              if (param1.field_f != param1.field_a) {
                if (param1.field_l != param1.field_j) {
                  var9 = (long)(aj.a(param3.field_I, false, var4_int) + aj.a(param3.field_t, false, var5));
                  int discarded$3 = 0;
                  param3.field_I = (int)((long)param3.field_I - (od.a((long)var4_int, var9) * (long)(256 + dj.field_g) >> 8));
                  int discarded$4 = 0;
                  param3.field_t = (int)((long)param3.field_t - (od.a((long)var5, var9) * (long)(256 + dj.field_g) >> 8));
                  param3.field_b = 0;
                  param3.field_n = 0;
                  if (td.field_b >= nn.field_e.length) {
                    break L1;
                  } else {
                    nn.field_e[td.field_b][0] = -(524288 * var4_int) + param3.field_g;
                    nn.field_e[td.field_b][1] = param3.field_k + -(var5 * 524288);
                    nn.field_e[td.field_b][2] = -524288;
                    break L1;
                  }
                } else {
                  param3.field_n = -(param3.field_n * kp.field_m) >> 8;
                  param3.field_b = param3.field_b * kp.field_m >> 8;
                  param3.field_t = -(dj.field_g * param3.field_t) >> 8;
                  if (td.field_b >= nn.field_e.length) {
                    break L1;
                  } else {
                    L2: {
                      nn.field_e[td.field_b][0] = param3.field_g;
                      stackOut_10_0 = nn.field_e[td.field_b];
                      stackOut_10_1 = 1;
                      stackOut_10_2 = param3.field_k;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      if (param3.field_k > param1.field_j) {
                        stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = 524288;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        stackIn_13_3 = stackOut_12_3;
                        break L2;
                      } else {
                        stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = -524288;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        break L2;
                      }
                    }
                    stackIn_13_0[stackIn_13_1] = stackIn_13_2 + stackIn_13_3;
                    nn.field_e[td.field_b][2] = -524288;
                    break L1;
                  }
                }
              } else {
                param3.field_n = param3.field_n * kp.field_m >> 8;
                param3.field_I = -(param3.field_I * dj.field_g) >> 8;
                param3.field_b = -(kp.field_m * param3.field_b) >> 8;
                if (td.field_b >= nn.field_e.length) {
                  break L1;
                } else {
                  L3: {
                    stackOut_4_0 = nn.field_e[td.field_b];
                    stackOut_4_1 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param3.field_g > param1.field_a) {
                      stackOut_6_0 = (int[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 524288;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L3;
                    } else {
                      stackOut_5_0 = (int[]) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = -524288;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L3;
                    }
                  }
                  stackIn_7_0[stackIn_7_1] = stackIn_7_2 + param3.field_g;
                  nn.field_e[td.field_b][1] = param3.field_k;
                  nn.field_e[td.field_b][2] = -524288;
                  break L1;
                }
              }
            }
            L4: {
              param3.field_K = kp.field_m * param3.field_K >> 8;
              param3.field_v = 1;
              var9 = param3.e(-14770);
              if (td.field_b < cf.field_g.length) {
                int fieldTemp$5 = td.field_b;
                td.field_b = td.field_b + 1;
                cf.field_g[fieldTemp$5] = (int)(var7 + -var9);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("sm.IA(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44).append(117).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    final static wc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        wc stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        wc stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var2_int = -40 / ((param1 - 36) / 53);
            if (ra.field_e != pa.field_I) {
              L1: {
                if (td.field_f != pa.field_I) {
                  break L1;
                } else {
                  if (!param0.equals((Object) (Object) l.field_c)) {
                    break L1;
                  } else {
                    pa.field_I = aa.field_c;
                    stackOut_5_0 = uf.field_gb;
                    stackIn_6_0 = stackOut_5_0;
                    return stackIn_6_0;
                  }
                }
              }
              l.field_c = param0;
              uf.field_gb = null;
              pa.field_I = ra.field_e;
              stackOut_7_0 = null;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (wc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("sm.FA(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return (wc) (Object) stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Use the mouse wheel <img=1> or drag <img=11><img=0> to zoom in and out.";
        field_E = "This option is restricted. Your rating is currently <%0>.<br>Can you achieve the qualifying rating of <%1>?";
        field_A = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
