/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class jf implements ir {
    static hj field_a;
    static String field_b;

    final static boolean a(int param0) {
        Object var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 15000) {
          L0: {
            var2 = null;
            jf.a(83, (gk) null, (gk) null);
            v.field_a = true;
            wg.field_b = kh.a(param0 + -15076) - -15000L;
            if (ob.field_d != 11) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            v.field_a = true;
            wg.field_b = kh.a(param0 + -15076) - -15000L;
            if (ob.field_d != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, gk param1, gk param2) {
        lj.field_c = nc.a(param1, param0 ^ 102, param2, jb.field_a, (boolean[]) null);
        Object var5 = null;
        kn.field_c = nc.a(param1, -107, param2, s.field_d, (boolean[]) null);
        if (param0 != -4) {
            return;
        }
        try {
            Object var6 = null;
            lp.field_g = nc.a(param1, -114, param2, iq.field_g, (boolean[]) null);
            fd.field_b = dt.a(param1, 19501, ad.field_T, param2, tt.field_d);
            uh.field_g = nc.a(param1, -76, param2, wt.field_k, ht.field_j);
            hp.field_i = nc.a(param1, -114, param2, wt.field_g, rj.field_c);
            mh.field_o = bj.a(param2, "", wg.field_c).a();
            gg.field_a = bj.a(param2, "", rg.field_C).a();
            kq.field_b = bj.a(param2, "", np.field_e).a();
            al discarded$0 = bj.a(param2, "", un.field_q).a();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "jf.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        ll var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            L2: {
              var6_int = param2 + param3.field_p;
              var7 = param4 - -param3.field_h;
              nn.a(var7, (byte) 70, var6_int, param3.field_q, param3.field_n);
              var8 = gu.field_c[1];
              if (!(param3 instanceof mi)) {
                break L2;
              } else {
                if (((mi) (Object) param3).field_s) {
                  var8.d(var6_int + (1 - -(param3.field_q + -var8.field_v >> 1)), (param3.field_n + -var8.field_q >> 1) + var7 - -1, 256);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param3.e(28660)) {
              co.a(var7 + 2, param3.field_n + -4, param3.field_q - 4, 2 + var6_int, 112);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("jf.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param4 + 41);
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4 = -106 % (param2 / 46);
              var3 = null;
              var5 = null;
              if (gt.field_r == null) {
                break L1;
              } else {
                if (gt.field_r.equals((Object) (Object) param0.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) gt.field_r;
                  break L1;
                }
              }
            }
            L2: {
              if (ac.field_d == null) {
                break L2;
              } else {
                if (ac.field_d.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var5 = (Object) (Object) ac.field_d;
                  break L2;
                }
              }
            }
            int discarded$4 = -1;
            int discarded$5 = 122;
            stackOut_6_0 = vj.a(param1, (String) var3, (String) var5);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_8_0 = var3;
            stackOut_8_1 = new StringBuilder().append("jf.F(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        if (!param1) {
          if (ai.field_a[param3] >= ai.field_a[param0]) {
            if (ai.field_a[param3] <= ai.field_a[param0]) {
              if (js.field_c[param3] >= js.field_c[param0]) {
                if (js.field_c[param3] <= js.field_c[param0]) {
                  var4 = dd.field_c[param3] + qd.field_p[param3] + hg.field_C[param3];
                  if (param2 != 67) {
                    boolean discarded$2 = jf.a(121, false, (byte) -23, -25);
                    var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        if (param3 >= param0) {
                          return false;
                        } else {
                          return true;
                        }
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param0) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_26_0 = 1;
                            stackIn_28_0 = stackOut_26_0;
                            break L0;
                          }
                        }
                        return stackIn_28_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          if (js.field_c[param0] > js.field_c[param3]) {
            return true;
          } else {
            if (js.field_c[param3] > js.field_c[param0]) {
              return false;
            } else {
              if (ai.field_a[param0] <= ai.field_a[param3]) {
                if (ai.field_a[param3] <= ai.field_a[param0]) {
                  var4 = dd.field_c[param3] + qd.field_p[param3] + hg.field_C[param3];
                  if (param2 == 67) {
                    var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param3 >= param0) {
                            stackOut_55_0 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            break L1;
                          } else {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            break L1;
                          }
                        }
                        return stackIn_56_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    boolean discarded$3 = jf.a(121, false, (byte) -23, -25);
                    var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param3 >= param0) {
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            break L2;
                          } else {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L2;
                          }
                        }
                        return stackIn_47_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
