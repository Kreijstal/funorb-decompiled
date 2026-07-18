/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.net.URL;

final class ag {
    static String[] field_b;
    static kh field_a;
    static int field_c;

    final static String b(int param0) {
        RuntimeException var1 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (nh.field_P) {
                break L1;
              } else {
                if (~ge.field_c > ~ea.field_b) {
                  break L1;
                } else {
                  if (~ge.field_c <= ~(sd.field_lb + ea.field_b)) {
                    break L1;
                  } else {
                    stackOut_7_0 = oc.field_b;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            if (param0 == -1) {
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (String) (Object) stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "ag.B(" + param0 + ')');
        }
        return (String) (Object) stackIn_13_0;
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, boolean param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        Object stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        Object stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        Object stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        Object stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        Object stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        Object stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        Object stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                field_c = 112;
                break L2;
              }
            }
            L3: {
              if (null == bl.field_b) {
                break L3;
              } else {
                if (bl.field_b.equals((Object) (Object) param0.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = (Object) (Object) bl.field_b;
                  break L3;
                }
              }
            }
            stackOut_15_0 = bi.a(param1, (byte) -107, -1, (String) var3, (String) var4);
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_17_0 = var3;
            stackOut_17_1 = new StringBuilder().append("ag.C(");
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_20_0 = stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L4;
            }
          }
          L5: {
            stackOut_21_0 = stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_22_0 = stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L5;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    public static void a(int param0) {
        try {
            field_b = null;
            field_a = null;
            if (param0 != -1) {
                String discarded$0 = ag.b(8);
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ag.A(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
