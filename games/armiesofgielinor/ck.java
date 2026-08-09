/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_d;
    static qb[][] field_e;
    static long field_b;
    static String field_a;
    static wk[] field_c;

    final static boolean a(int param0, int param1) {
        if (param1 == -12) {
          if (-9 != (param0 ^ -1)) {
            if (param0 != 9) {
              if (-8 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -12) {
                  if (param0 == 14) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          ck.a(-80, -6);
          if (-9 != (param0 ^ -1)) {
            if (param0 != 9) {
              if (-8 != (param0 ^ -1)) {
                if ((param0 ^ -1) != -12) {
                  if (param0 == 14) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -3780) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              var3 = null;
              if (null == sj.field_b) {
                break L2;
              } else {
                if (!sj.field_b.equals(param2.getParameter("settings"))) {
                  var3 = sj.field_b;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var4 = null;
              if (null == al.field_n) {
                break L3;
              } else {
                if (!al.field_n.equals(param2.getParameter("session"))) {
                  var4 = al.field_n;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_11_0 = rv.a((String) (var3), (String) (var4), 0, -1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("ck.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        if (param0 != 14) {
            return;
        }
        field_e = (qb[][]) null;
    }

    final static void b(int param0) {
        if (wq.field_a != null) {
          L0: {
            dt.a(wq.field_a, 23678);
            wq.field_a.a(-30918, ft.field_m);
            wq.field_a = null;
            if (null != ra.field_e) {
              ra.field_e.b(124);
              break L0;
            } else {
              break L0;
            }
          }
          si.field_b.requestFocus();
          if (param0 >= -50) {
            field_e = (qb[][]) null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        field_d = "These are items you can take with you into battle, to help tip the balance in your favour.";
        field_a = "Mouse over an icon for details";
    }
}
