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
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
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
                if (!ec.a(30418, (CharSequence) (Object) var6)) {
                  uf.field_q = 2;
                  break L3;
                } else {
                  int discarded$23 = 6054;
                  uf.field_q = il.a((CharSequence) (Object) var6);
                  break L3;
                }
              }
            }
            rb.field_f = 0;
            id.field_a = 80;
            ea.field_o = 16776960;
            qd.field_e = new o[param2.length];
            var7 = 0;
            L4: while (true) {
              if (param2.length <= var7) {
                ba.field_s = param2;
                break L0;
              } else {
                qd.field_e[var7] = new o(317, 34);
                var7++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var6_ref;
            stackOut_17_1 = new StringBuilder().append("ak.B(").append(80).append(44).append(0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44).append(1).append(44).append(16776960).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param5 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    public static void b() {
        field_c = null;
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static boolean a() {
        if (null == lf.field_d) {
            return false;
        }
        if (!ef.field_e.a(80)) {
            return false;
        }
        return true;
    }

    final static int a(boolean param0) {
        if (kj.field_R >= 2) {
          if (0 == vd.field_b) {
            if (lh.field_o.c((byte) -121)) {
              if (lh.field_o.a(2, "commonui")) {
                if (!wk.field_c.c((byte) -121)) {
                  return 50;
                } else {
                  if (wk.field_c.a(2, "commonui")) {
                    if (jk.field_ub.c((byte) -121)) {
                      if (!jk.field_ub.b(true)) {
                        return 80;
                      } else {
                        return 100;
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
                              if (!jk.field_ub.b(true)) {
                                return 86;
                              } else {
                                return 100;
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
                        if (jk.field_ub.b(true)) {
                          return 100;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_d = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
