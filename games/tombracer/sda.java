/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class sda extends vg {
    static boolean[] field_f;
    int field_l;
    byte[] field_j;
    static String field_i;
    static String field_h;
    static String field_k;
    static ssa field_g;

    public static void a() {
        field_i = null;
        field_h = null;
        field_f = null;
        field_k = null;
        field_g = null;
    }

    private sda() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(java.applet.Applet param0, int param1, java.net.URL param2) {
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
              var3 = null;
              var4 = null;
              if (null == ts.field_g) {
                break L1;
              } else {
                if (!ts.field_g.equals((Object) (Object) param0.getParameter("settings"))) {
                  var3 = (Object) (Object) ts.field_g;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (aia.field_j == null) {
                break L2;
              } else {
                if (!aia.field_j.equals((Object) (Object) param0.getParameter("session"))) {
                  var4 = (Object) (Object) aia.field_j;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            stackOut_10_0 = us.a((byte) 66, param2, (String) var4, -1, (String) var3);
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("sda.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(-1).append(',');
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
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Jamille";
        field_i = "Unrated game";
        field_h = "Loot Bags x2";
        field_g = null;
    }
}
