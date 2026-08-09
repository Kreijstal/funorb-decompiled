/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements ir {
    static hj field_a;
    static String field_b;

    final static boolean a(int param0) {
        gk var2;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != 15000) {
          L0: {
            var2 = (gk) null;
            jf.a(83, (gk) null, (gk) null);
            v.field_a = true;
            wg.field_b = kh.a(param0 + -15076) - -15000L;
            if ((ob.field_d ^ -1) != -12) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            v.field_a = true;
            wg.field_b = kh.a(param0 + -15076) - -15000L;
            if ((ob.field_d ^ -1) != -12) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, gk param1, gk param2) {
        lj.field_c = nc.a(param1, param0 ^ 102, param2, jb.field_a, (boolean[]) null);
        boolean[] var5 = (boolean[]) null;
        kn.field_c = nc.a(param1, -107, param2, s.field_d, (boolean[]) null);
        if (param0 != -4) {
            return;
        }
        try {
            boolean[] var6 = (boolean[]) null;
            lp.field_g = nc.a(param1, -114, param2, iq.field_g, (boolean[]) null);
            fd.field_b = dt.a(param1, 19501, ad.field_T, param2, tt.field_d);
            uh.field_g = nc.a(param1, -76, param2, wt.field_k, ht.field_j);
            hp.field_i = nc.a(param1, -114, param2, wt.field_g, rj.field_c);
            mh.field_o = bj.a(param2, "", wg.field_c).a();
            gg.field_a = bj.a(param2, "", rg.field_C).a();
            kq.field_b = bj.a(param2, "", np.field_e).a();
            bj.a(param2, "", un.field_q).a();
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "jf.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ll var8 = null;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                field_b = (String) null;
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
                if (((mi) ((Object) param3)).field_s) {
                  var8.d(var6_int + (1 - -(param3.field_q + -var8.field_v >> -314791647)), (param3.field_n + -var8.field_q >> -768042815) + var7 - -1, 256);
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
            stackIn_12_0 = (RuntimeException) (var6);

            stackIn_12_1 = new StringBuilder().append("jf.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param4 + ')');
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = -106 % ((param2 - 0) / 46);
              var3 = null;
              var5 = null;
              if (gt.field_r == null) {
                break L1;
              } else {
                if (gt.field_r.equals(param0.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = gt.field_r;
                  var5 = var3;
                  var5 = var3;
                  break L1;
                }
              }
            }
            L2: {
              if (ac.field_d == null) {
                break L2;
              } else {
                if (ac.field_d.equals(param0.getParameter("session"))) {
                  break L2;
                } else {
                  var5 = ac.field_d;
                  break L2;
                }
              }
            }
            stackIn_7_0 = vj.a(param1, (String) (var3), (String) (var5), 122, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = var3;

            stackIn_10_1 = new StringBuilder().append("jf.F(");

            if (param0 == null) {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = stackIn_10_0;
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param1 == null) {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {

              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -11) {
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_56_0 = 0;
        int var4;
        int var5;
        if (!param1) {
          if (ai.field_a[param3] >= ai.field_a[param0]) {
            if (ai.field_a[param3] <= ai.field_a[param0]) {
              if (js.field_c[param3] >= js.field_c[param0]) {
                if (js.field_c[param3] <= js.field_c[param0]) {
                  var4 = dd.field_c[param3] + qd.field_p[param3] + hg.field_C[param3];
                  if (param2 != 67) {
                    jf.a(121, false, (byte) -23, -25);
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
                            stackIn_28_0 = 0;
                            break L0;
                          } else {
                            stackIn_28_0 = 1;
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
                            stackIn_56_0 = 0;
                            break L1;
                          } else {
                            stackIn_56_0 = 1;
                            break L1;
                          }
                        }
                        return stackIn_56_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    jf.a(121, false, (byte) -23, -25);
                    var5 = qd.field_p[param0] + hg.field_C[param0] + dd.field_c[param0];
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param3 >= param0) {
                            stackIn_47_0 = 0;
                            break L2;
                          } else {
                            stackIn_47_0 = 1;
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
        field_b = "Error connecting to server. Please try using a different server.";
    }
}
