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
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              n.field_c = param5.getParameter("overxgames");
              if (n.field_c == null) {
                n.field_c = "0";
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              sf.field_b = param5.getParameter("overxachievements");
              if (sf.field_b == null) {
                sf.field_b = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var6 = param5.getParameter("currency");
              if (var6 == null) {
                uf.field_q = 2;
                break L3;
              } else {
                if (!ec.a(30418, (CharSequence) ((Object) var6))) {
                  uf.field_q = 2;
                  break L3;
                } else {
                  uf.field_q = il.a((CharSequence) ((Object) var6), 6054);
                  break L3;
                }
              }
            }
            L4: {
              rb.field_f = param1;
              id.field_a = param0;
              ea.field_o = param4;
              qd.field_e = new o[param2.length];
              if (param3) {
                break L4;
              } else {
                field_d = (String[]) null;
                break L4;
              }
            }
            var7 = 0;
            L5: while (true) {
              if (param2.length <= var7) {
                ba.field_s = param2;
                break L0;
              } else {
                qd.field_e[var7] = new o(317, 34);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var6_ref);

            stackIn_21_1 = new StringBuilder().append("ak.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
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
        java.applet.Applet var2;
        if (param0 == 60) {
          if (null != lf.field_d) {
            if (!ef.field_e.a(80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          var2 = (java.applet.Applet) null;
          ak.a(-96, -50, (String[]) null, true, -119, (java.applet.Applet) null);
          if (null != lf.field_d) {
            if (!ef.field_e.a(80)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
                        if (!param0) {
                          field_a = -19;
                          return 100;
                        } else {
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
                  if (af.field_c.a(2, "")) {
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
                                if (!param0) {
                                  field_a = -19;
                                  return 100;
                                } else {
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
                  } else {
                    return 29;
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
                        if (jk.field_ub.b(param0)) {
                          if (!param0) {
                            field_a = -19;
                            return 100;
                          } else {
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
          }
        } else {
          return 0;
        }
    }

    static {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
