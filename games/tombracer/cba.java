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
        if (param0 != 64) {
          field_a = null;
          return new qo(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32832), param1.a(-32768), param1.h(param0 ^ 191));
        } else {
          return new qo(param1.b(false), param1.b(false), param1.b(false), param1.b(false), param1.a(param0 + -32832), param1.a(-32768), param1.h(param0 ^ 191));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 64;
        field_c = "Waiting for <%0>";
    }
}
