/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static jp field_g;
    int field_c;
    static String field_b;
    int field_f;
    static vl field_a;
    int field_d;
    int field_h;
    static int field_e;

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
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
              var3 = null;
              if (param2 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              if (null == wp.field_d) {
                break L2;
              } else {
                if (!wp.field_d.equals(param0.getParameter("settings"))) {
                  var3 = wp.field_d;
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
              if (null == sk.field_G) {
                break L3;
              } else {
                if (!sk.field_G.equals(param0.getParameter("session"))) {
                  var4 = sk.field_G;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_11_0 = lh.a((String) (var3), (byte) 60, (String) (var4), -1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("hg.D(");

            if (param0 == null) {
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

            if (param1 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final static ac a(int param0, String param1) {
        RuntimeException var2 = null;
        ac stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!ma.field_I.b(96)) {
                break L1;
              } else {
                if (!param1.equals(ma.field_I.a(0))) {
                  ma.field_I = rm.a(param1, 16711935);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                field_g = (jp) null;
                break L2;
              }
            }
            stackIn_7_0 = ma.field_I;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("hg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 19) {
            field_b = (String) null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        mn.field_A = 0;
        dj.field_c = null;
        ea.field_b = 0;
        ae.field_b = 0;
        sh.field_a = 0;
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
    }
}
