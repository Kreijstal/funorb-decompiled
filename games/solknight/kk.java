/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class kk {
    static boolean field_c;
    static int field_d;
    static String[] field_a;
    static volatile boolean field_b;
    static int field_e;

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        Object var5 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param0 >= 80) {
                break L1;
              } else {
                var5 = null;
                java.net.URL discarded$2 = kk.a(-39, (java.net.URL) null, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              if (td.field_i == null) {
                break L2;
              } else {
                if (td.field_i.equals((Object) (Object) param2.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = (Object) (Object) td.field_i;
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
                if (!bf.field_i.equals((Object) (Object) param2.getParameter("session"))) {
                  var4 = (Object) (Object) bf.field_i;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackOut_9_0 = wg.a((String) var3, -7362, (String) var4, -1, param1);
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_11_0 = var3;
            stackOut_11_1 = new StringBuilder().append("kk.B(").append(param0).append(44);
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
          L5: {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Gain 10,000 points", "Gain 20,000 points", "Gain 30,000 points", "Gain 40,000 points", "Gain 50,000 points", "Destroy 10% of the asteroid cluster", "Destroy 30% of the asteroid cluster", "Destroy 60% of the asteroid cluster", "Destroy 100% of the asteroid cluster", "Get a x10 combo", "Get a x10 combo on four levels", "Get a x10 combo on every level", "Get a x25 combo", "Get a x25 combo on four levels", "Get a x25 combo on every level", "Get a x50 combo"};
        field_e = 0;
        field_d = 0;
        field_b = true;
    }
}
