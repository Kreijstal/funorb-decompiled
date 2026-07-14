/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf implements ir {
    static hj field_a;
    static String field_b;

    final static boolean a(int param0) {
        gk var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 15000) {
          L0: {
            var2 = (gk) null;
            jf.a(83, (gk) null, (gk) null);
            v.field_a = true;
            wg.field_b = kh.a(param0 + -15076) - -15000L;
            if ((ob.field_d ^ -1) != -12) {
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
            if ((ob.field_d ^ -1) != -12) {
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
        boolean[] var5 = null;
        boolean[] var6 = null;
        lj.field_c = nc.a(param1, param0 ^ 102, param2, jb.field_a, (boolean[]) null);
        var5 = (boolean[]) null;
        kn.field_c = nc.a(param1, -107, param2, s.field_d, (boolean[]) null);
        if (param0 != -4) {
          return;
        } else {
          var6 = (boolean[]) null;
          lp.field_g = nc.a(param1, -114, param2, iq.field_g, (boolean[]) null);
          fd.field_b = dt.a(param1, 19501, ad.field_T, param2, tt.field_d);
          uh.field_g = nc.a(param1, -76, param2, wt.field_k, ht.field_j);
          hp.field_i = nc.a(param1, -114, param2, wt.field_g, rj.field_c);
          mh.field_o = bj.a(param2, "", wg.field_c).a();
          gg.field_a = bj.a(param2, "", rg.field_C).a();
          kq.field_b = bj.a(param2, "", np.field_e).a();
          al discarded$1 = bj.a(param2, "", un.field_q).a();
          return;
        }
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        ll var9 = null;
        ll var10 = null;
        if (param1 == -7592) {
          var6 = param2 + ((ea) param3).field_p;
          var7 = param4 - -((ea) param3).field_h;
          nn.a(var7, (byte) 70, var6, ((ea) param3).field_q, ((ea) param3).field_n);
          var10 = gu.field_c[1];
          if (param3 instanceof mi) {
            if (!((mi) param3).field_s) {
              L0: {
                if (param3.e(28660)) {
                  co.a(var7 + 2, ((ea) param3).field_n + -4, ((ea) param3).field_q - 4, 2 + var6, 112);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                var10.d(var6 + (1 - -(((ea) param3).field_q + -((ll) var10).field_v >> -314791647)), (((ea) param3).field_n + -((ll) var10).field_q >> -768042815) + var7 - -1, 256);
                if (param3.e(28660)) {
                  co.a(var7 + 2, ((ea) param3).field_n + -4, ((ea) param3).field_q - 4, 2 + var6, 112);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            }
          } else {
            L2: {
              if (param3.e(28660)) {
                co.a(var7 + 2, ((ea) param3).field_n + -4, ((ea) param3).field_q - 4, 2 + var6, 112);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          field_b = (String) null;
          var6 = param2 + ((ea) param3).field_p;
          var7 = param4 - -((ea) param3).field_h;
          nn.a(var7, (byte) 70, var6, ((ea) param3).field_q, ((ea) param3).field_n);
          var9 = gu.field_c[1];
          if (!(param3 instanceof mi)) {
            L3: {
              if (param3.e(28660)) {
                co.a(var7 + 2, ((ea) param3).field_n + -4, ((ea) param3).field_q - 4, 2 + var6, 112);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (((mi) param3).field_s) {
                var9.d(var6 + (1 - -(((ea) param3).field_q + -((ll) var9).field_v >> -314791647)), (((ea) param3).field_n + -((ll) var9).field_q >> -768042815) + var7 - -1, 256);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (param3.e(28660)) {
                co.a(var7 + 2, ((ea) param3).field_n + -4, ((ea) param3).field_q - 4, 2 + var6, 112);
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        int var4 = -106 % ((param2 - 0) / 46);
        String var3 = null;
        String var5 = null;
        if (gt.field_r != null) {
            if (!gt.field_r.equals((Object) (Object) param0.getParameter("settings"))) {
                var3 = gt.field_r;
                var5 = var3;
                var5 = var3;
            }
        }
        if (ac.field_d != null) {
            if (!ac.field_d.equals((Object) (Object) param0.getParameter("session"))) {
                var5 = ac.field_d;
            }
        }
        return vj.a(param1, var3, var5, 122, -1);
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 >= -11) {
            return;
        }
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
