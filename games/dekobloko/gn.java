/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class gn {
    static String field_d;
    static int field_a;
    static boolean field_b;
    static int[] field_e;
    static String[][] field_c;
    static volatile long field_f;

    public static void a() {
        field_e = null;
        field_c = null;
        field_d = null;
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_2_0 = null;
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
        Object stackOut_1_0 = null;
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
            var3 = null;
            if (param1 == -1) {
              L1: {
                if (null == rb.field_l) {
                  break L1;
                } else {
                  if (rb.field_l.equals((Object) (Object) param2.getParameter("settings"))) {
                    break L1;
                  } else {
                    var3 = (Object) (Object) rb.field_l;
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (u.field_a == null) {
                  break L2;
                } else {
                  if (!u.field_a.equals((Object) (Object) param2.getParameter("session"))) {
                    var4 = (Object) (Object) u.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              int discarded$2 = -1;
              stackOut_10_0 = pl.a((String) var4, (String) var3, false, param0);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("gn.B(");
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0;
    }

    final static void b() {
        ef.f((byte) 53);
        int discarded$0 = -4840;
        uf.k();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Stamina Mode";
        field_f = 0L;
    }
}
