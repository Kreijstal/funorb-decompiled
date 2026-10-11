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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 64) {
            field_a = (java.applet.Applet) null;
          }
          stackIn_3_0 = new qo(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 - 32832), param1.a(-32768), param1.h(param0 ^ 191));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("cba.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = 64;
        field_c = "Waiting for <%0>";
    }
}
