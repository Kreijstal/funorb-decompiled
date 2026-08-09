/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cba {
    static int field_d;
    static java.applet.Applet field_a;
    static oc[] field_b;
    static String field_c;

    final static int a(byte param0, double param1, int param2) {
        if (param0 != -123) {
            return -102;
        }
        return qma.a((byte) 123, (double)param2 * param1 / 360.0);
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 <= 93) {
            cba.a((byte) 5);
        }
    }

    final static qo a(int param0, uia param1) {
        RuntimeException var2 = null;
        qo stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                field_a = (java.applet.Applet) null;
                break L1;
              }
            }
            stackIn_3_0 = new qo(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32832), param1.a(-32768), param1.h(param0 ^ 191));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("cba.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_d = 64;
        field_c = "Waiting for <%0>";
    }
}
