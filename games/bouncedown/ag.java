/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ag {
    static String[] field_b;
    static kh field_a;
    static int field_c;

    final static String b() {
        if (!nh.field_P) {
          if (ge.field_c >= ea.field_b) {
            if (ge.field_c < sd.field_lb + ea.field_b) {
              return oc.field_b;
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == jg.field_B) {
                break L1;
              } else {
                if (!jg.field_B.equals((Object) (Object) param0.getParameter("settings"))) {
                  var3 = (Object) (Object) jg.field_B;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (null == bl.field_b) {
                break L2;
              } else {
                if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) bl.field_b;
                  break L2;
                }
              }
            }
            stackOut_7_0 = bi.a(param1, (byte) -107, -1, (String) var3, (String) var4);
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_9_0 = var3;
            stackOut_9_1 = new StringBuilder().append("ag.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
          throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 0 + 41);
        }
        return stackIn_8_0;
    }

    public static void a() {
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
