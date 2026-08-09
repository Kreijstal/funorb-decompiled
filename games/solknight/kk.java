/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static boolean field_c;
    static int field_d;
    static String[] field_a;
    static volatile boolean field_b;
    static int field_e;

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.applet.Applet var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param0 >= 80) {
                break L1;
              } else {
                var5 = (java.applet.Applet) null;
                kk.a(-39, (java.net.URL) null, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              if (td.field_i == null) {
                break L2;
              } else {
                if (td.field_i.equals(param2.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = td.field_i;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                }
              }
            }
            L3: {
              var4 = null;
              if (bf.field_i == null) {
                break L3;
              } else {
                if (!bf.field_i.equals(param2.getParameter("session"))) {
                  var4 = bf.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_10_0 = wg.a((String) (var3), -7362, (String) (var4), -1, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("kk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        if (param0 != -1) {
            kk.a(-33);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"Gain 10,000 points", "Gain 20,000 points", "Gain 30,000 points", "Gain 40,000 points", "Gain 50,000 points", "Destroy 10% of the asteroid cluster", "Destroy 30% of the asteroid cluster", "Destroy 60% of the asteroid cluster", "Destroy 100% of the asteroid cluster", "Get a x10 combo", "Get a x10 combo on four levels", "Get a x10 combo on every level", "Get a x25 combo", "Get a x25 combo on four levels", "Get a x25 combo on every level", "Get a x50 combo"};
        field_e = 0;
        field_d = 0;
        field_b = true;
    }
}
