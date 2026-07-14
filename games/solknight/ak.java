/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static String field_c;
    static o[] field_e;
    static String[] field_b;
    static String[] field_d;
    static int field_a;

    final static void a(int param0, int param1, String[] param2, boolean param3, int param4, java.applet.Applet param5) {
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = SolKnight.field_L ? 1 : 0;
          n.field_c = param5.getParameter("overxgames");
          if (n.field_c == null) {
            n.field_c = "0";
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          sf.field_b = param5.getParameter("overxachievements");
          if (sf.field_b == null) {
            sf.field_b = "0";
            break L1;
          } else {
            break L1;
          }
        }
        var6 = param5.getParameter("currency");
        if (var6 == null) {
          uf.field_q = 2;
          rb.field_f = param1;
          id.field_a = param0;
          ea.field_o = param4;
          qd.field_e = new o[param2.length];
          if (!param3) {
            field_d = null;
            var7 = 0;
            L2: while (true) {
              if ((param2.length ^ -1) >= (var7 ^ -1)) {
                ba.field_s = param2;
                return;
              } else {
                qd.field_e[var7] = new o(317, 34);
                var7++;
                continue L2;
              }
            }
          } else {
            var7 = 0;
            L3: while (true) {
              if ((param2.length ^ -1) >= (var7 ^ -1)) {
                ba.field_s = param2;
                return;
              } else {
                qd.field_e[var7] = new o(317, 34);
                var7++;
                continue L3;
              }
            }
          }
        } else {
          if (!ec.a(30418, (CharSequence) (Object) var6)) {
            L4: {
              uf.field_q = 2;
              rb.field_f = param1;
              id.field_a = param0;
              ea.field_o = param4;
              qd.field_e = new o[param2.length];
              if (param3) {
                break L4;
              } else {
                field_d = null;
                break L4;
              }
            }
            var7 = 0;
            L5: while (true) {
              if ((param2.length ^ -1) >= (var7 ^ -1)) {
                ba.field_s = param2;
                return;
              } else {
                qd.field_e[var7] = new o(317, 34);
                var7++;
                continue L5;
              }
            }
          } else {
            uf.field_q = il.a((CharSequence) (Object) var6, 6054);
            rb.field_f = param1;
            id.field_a = param0;
            ea.field_o = param4;
            qd.field_e = new o[param2.length];
            if (!param3) {
              field_d = null;
              var7 = 0;
              L6: while (true) {
                if ((param2.length ^ -1) >= (var7 ^ -1)) {
                  ba.field_s = param2;
                  return;
                } else {
                  qd.field_e[var7] = new o(317, 34);
                  var7++;
                  continue L6;
                }
              }
            } else {
              var7 = 0;
              L7: while (true) {
                if ((param2.length ^ -1) >= (var7 ^ -1)) {
                  ba.field_s = param2;
                  return;
                } else {
                  qd.field_e[var7] = new o(317, 34);
                  var7++;
                  continue L7;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 3327) {
            return;
        }
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        if (param0 != 60) {
            Object var2 = null;
            ak.a(-96, -50, (String[]) null, true, -119, (java.applet.Applet) null);
            if (null == lf.field_d) {
                return false;
            }
            if (!ef.field_e.a(80)) {
                return false;
            }
            return true;
        }
        if (null == lf.field_d) {
            return false;
        }
        if (!ef.field_e.a(80)) {
            return false;
        }
        return true;
    }

    final static int a(boolean param0) {
        if (-3 >= (kj.field_R ^ -1)) {
          if (0 == vd.field_b) {
            if (lh.field_o.c((byte) -121)) {
              if (lh.field_o.a(2, "commonui")) {
                if (!wk.field_c.c((byte) -121)) {
                  return 50;
                } else {
                  if (wk.field_c.a(2, "commonui")) {
                    if (jk.field_ub.c((byte) -121)) {
                      if (jk.field_ub.b(true)) {
                        if (param0) {
                          return 100;
                        } else {
                          field_a = -19;
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                }
              } else {
                return 40;
              }
            } else {
              return 20;
            }
          } else {
            if (null != af.field_c) {
              if (af.field_c.c((byte) -121)) {
                if (af.field_c.b(82, "")) {
                  if (!af.field_c.a(2, "")) {
                    return 29;
                  } else {
                    if (!lh.field_o.c((byte) -121)) {
                      return 43;
                    } else {
                      if (!lh.field_o.a(2, "commonui")) {
                        return 57;
                      } else {
                        if (!wk.field_c.c((byte) -121)) {
                          return 71;
                        } else {
                          if (wk.field_c.a(2, "commonui")) {
                            if (jk.field_ub.c((byte) -121)) {
                              if (jk.field_ub.b(param0)) {
                                if (param0) {
                                  return 100;
                                } else {
                                  field_a = -19;
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            } else {
                              return 82;
                            }
                          } else {
                            return 80;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return 29;
                }
              } else {
                return 14;
              }
            } else {
              if (!lh.field_o.c((byte) -121)) {
                return 43;
              } else {
                if (!lh.field_o.a(2, "commonui")) {
                  return 57;
                } else {
                  if (!wk.field_c.c((byte) -121)) {
                    return 71;
                  } else {
                    if (wk.field_c.a(2, "commonui")) {
                      if (jk.field_ub.c((byte) -121)) {
                        if (!jk.field_ub.b(param0)) {
                          return 86;
                        } else {
                          if (param0) {
                            return 100;
                          } else {
                            field_a = -19;
                            return 100;
                          }
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  }
                }
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
