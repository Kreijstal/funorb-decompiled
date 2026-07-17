/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ck {
    static String field_d;
    static qb[][] field_e;
    static long field_b;
    static String field_a;
    static wk[] field_c;

    final static boolean a(int param0, int param1) {
        if (param1 != -12) {
            boolean discarded$4 = ck.a(-80, -6);
            if (param0 == 8) {
                return true;
            }
            if (param0 == 9) {
                return true;
            }
            if (param0 == 7) {
                return true;
            }
            if (param0 == 11) {
                return true;
            }
            if (param0 == 14) {
                return true;
            }
            return false;
        }
        if (param0 == 8) {
            return true;
        }
        if (param0 == 9) {
            return true;
        }
        if (param0 == 7) {
            return true;
        }
        if (param0 == 11) {
            return true;
        }
        if (param0 == 14) {
            return true;
        }
        return false;
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -3780) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              var3 = null;
              if (null == sj.field_b) {
                break L2;
              } else {
                if (!sj.field_b.equals((Object) (Object) param2.getParameter("settings"))) {
                  var3 = (Object) (Object) sj.field_b;
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
                if (!al.field_n.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) al.field_n;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_10_0 = rv.a((String) var3, (String) var4, 0, -1, param1);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("ck.A(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        field_c = null;
        field_e = null;
    }

    final static void b(int param0) {
        if (wq.field_a != null) {
          L0: {
            dt.a((java.awt.Canvas) (Object) wq.field_a, 23678);
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
            field_e = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "These are items you can take with you into battle, to help tip the balance in your favour.";
        field_a = "Mouse over an icon for details";
    }
}
