/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;

final class ai {
    static int[] field_e;
    static int field_h;
    static String field_c;
    static String field_f;
    static int[] field_g;
    static int field_i;
    static int field_d;
    static int field_b;
    static int[] field_a;

    final static ah a(boolean param0, int param1, boolean param2, int param3, byte param4, boolean param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            bo var8 = null;
            ah stackIn_23_0 = null;
            Throwable decompiledCaughtException = null;
            ah stackOut_22_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (ug.field_ab.field_g != null) {
                  ch.field_r = new p(ug.field_ab.field_g, 5200, 0);
                  ug.field_ab.field_g = null;
                  var6 = (Object) (Object) new sk(255, ch.field_r, new p(ug.field_ab.field_b, 12000, 0), 2097152);
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (param4 >= 18) {
                  break L1;
                } else {
                  field_c = null;
                  break L1;
                }
              }
              L2: {
                if (ch.field_r == null) {
                  break L2;
                } else {
                  L3: {
                    if (ok.field_b == null) {
                      ok.field_b = new p[ug.field_ab.field_m.length];
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (null == ok.field_b[param1]) {
                      ok.field_b[param1] = new p(ug.field_ab.field_m[param1], 12000, 0);
                      ug.field_ab.field_m[param1] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var7 = (Object) (Object) new sk(param1, ch.field_r, ok.field_b[param1], 2097152);
                  break L2;
                }
              }
              L5: {
                var8 = mb.field_u.a(param1, 80, (sk) var7, (sk) var6, param2);
                if (!param0) {
                  break L5;
                } else {
                  var8.d(5127);
                  break L5;
                }
              }
              stackOut_22_0 = new ah((hk) (Object) var8, param5, param3);
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6 = (Object) (Object) decompiledCaughtException;
              throw oi.a((Throwable) var6, "ai.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static java.net.URL a(java.net.URL param0, byte param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 < -101) {
                break L1;
              } else {
                ai.a(125);
                break L1;
              }
            }
            L2: {
              var4 = null;
              if (bm.field_s == null) {
                break L2;
              } else {
                if (bm.field_s.equals((Object) (Object) param2.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = (Object) (Object) bm.field_s;
                  break L2;
                }
              }
            }
            L3: {
              if (ke.field_g == null) {
                break L3;
              } else {
                if (!ke.field_g.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) ke.field_g;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_15_0 = of.a((String) var3, param0, -1, -103, (String) var4);
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_17_0 = var3;
            stackOut_17_1 = new StringBuilder().append("ai.E(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        try {
            field_g = null;
            field_a = null;
            field_f = null;
            field_e = null;
            field_c = null;
            if (param0 != 13408) {
                boolean discarded$0 = ai.a((byte) 74);
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "ai.G(" + param0 + ')');
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              fa.field_e = true;
              if (param0 == 105) {
                break L1;
              } else {
                java.net.URL discarded$2 = ai.a((java.net.URL) null, (byte) -1, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              hk.field_c = k.a(0) + 15000L;
              if (fn.field_R != 11) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "ai.B(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        var9 = TetraLink.field_J;
        try {
          L0: {
            var3_int = 0;
            var5 = -117 / ((param2 - 78) / 35);
            var4 = ab.field_Q;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3_int >= hk.field_b.length) {
                    break L3;
                  } else {
                    var6 = bi.field_c[var3_int];
                    stackOut_3_0 = -1;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var9 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0 >= ~var6) {
                            break L5;
                          } else {
                            var4 = var4 + hl.field_wb;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var7 = tn.a(true, 1, hk.field_b[var3_int]);
                        var8 = nh.field_Nb + -(var7 >> 2042928993);
                        var4 = var4 + cd.field_e;
                        if (tb.a(param1, var8 + -ao.field_a, var4, param0, (ao.field_a << -834566463) + var7, (hc.field_q << 367977153) + i.field_n, -124)) {
                          stackOut_11_0 = var6;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
                        } else {
                          var4 = var4 + (i.field_n + cd.field_e + (hc.field_q << 60781185));
                          break L4;
                        }
                      }
                      var3_int++;
                      if (var9 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3, "ai.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    final static kh b(byte param0) {
        kh var1 = null;
        RuntimeException var1_ref = null;
        kh stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 > 85) {
                break L1;
              } else {
                field_h = -20;
                break L1;
              }
            }
            var1 = new kh(wm.field_l, mm.field_w, qa.field_x[0], i.field_t[0], je.field_h[0], sn.field_e[0], ga.field_a[0], ti.field_c);
            an.b(-104);
            stackOut_3_0 = (kh) var1;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1_ref, "ai.D(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static int c(byte param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (vd.field_a >= 2) {
              L1: {
                if (0 != th.field_l) {
                  L2: {
                    if (d.field_i != null) {
                      if (d.field_i.c(107)) {
                        if (d.field_i.a("", 0)) {
                          if (d.field_i.a("", (byte) -81)) {
                            break L2;
                          } else {
                            stackOut_42_0 = 29;
                            stackIn_43_0 = stackOut_42_0;
                            return stackIn_43_0;
                          }
                        } else {
                          stackOut_39_0 = 29;
                          stackIn_40_0 = stackOut_39_0;
                          return stackIn_40_0;
                        }
                      } else {
                        stackOut_36_0 = 14;
                        stackIn_37_0 = stackOut_36_0;
                        return stackIn_37_0;
                      }
                    } else {
                      break L2;
                    }
                  }
                  if (!rm.field_i.c(121)) {
                    stackOut_47_0 = 43;
                    stackIn_48_0 = stackOut_47_0;
                    return stackIn_48_0;
                  } else {
                    if (!rm.field_i.a("commonui", (byte) -87)) {
                      stackOut_52_0 = 57;
                      stackIn_53_0 = stackOut_52_0;
                      return stackIn_53_0;
                    } else {
                      if (ib.field_a.c(91)) {
                        if (!ib.field_a.a("commonui", (byte) -123)) {
                          stackOut_60_0 = 80;
                          stackIn_61_0 = stackOut_60_0;
                          return stackIn_61_0;
                        } else {
                          if (!q.field_b.c(88)) {
                            stackOut_65_0 = 82;
                            stackIn_66_0 = stackOut_65_0;
                            return stackIn_66_0;
                          } else {
                            if (!q.field_b.a(false)) {
                              stackOut_70_0 = 86;
                              stackIn_71_0 = stackOut_70_0;
                              return stackIn_71_0;
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        stackOut_55_0 = 71;
                        stackIn_56_0 = stackOut_55_0;
                        return stackIn_56_0;
                      }
                    }
                  }
                } else {
                  if (!rm.field_i.c(121)) {
                    stackOut_9_0 = 20;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    if (!rm.field_i.a("commonui", (byte) -128)) {
                      stackOut_14_0 = 40;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (ib.field_a.c(114)) {
                        if (!ib.field_a.a("commonui", (byte) -75)) {
                          stackOut_22_0 = 60;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0;
                        } else {
                          if (q.field_b.c(100)) {
                            if (!q.field_b.a(false)) {
                              stackOut_30_0 = 80;
                              stackIn_31_0 = stackOut_30_0;
                              return stackIn_31_0;
                            } else {
                              break L1;
                            }
                          } else {
                            stackOut_25_0 = 70;
                            stackIn_26_0 = stackOut_25_0;
                            return stackIn_26_0;
                          }
                        }
                      } else {
                        stackOut_17_0 = 50;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    }
                  }
                }
              }
              if (param0 <= -14) {
                stackOut_75_0 = 100;
                stackIn_76_0 = stackOut_75_0;
                break L0;
              } else {
                stackOut_73_0 = 82;
                stackIn_74_0 = stackOut_73_0;
                return stackIn_74_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "ai.C(" + param0 + ')');
        }
        return stackIn_76_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Time: <%0>";
        field_i = 0;
        field_c = "Switch to 2D mode";
        field_e = new int[4];
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
