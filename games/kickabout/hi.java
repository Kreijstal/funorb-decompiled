/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends vv {
    byte[] field_u;
    int field_t;
    static String field_w;
    qh field_v;

    final int a(int param0) {
        if (param0 != 0) {
            return -42;
        }
        if (((hi) this).field_p) {
            return 0;
        }
        return 100;
    }

    public static void g(int param0) {
        field_w = null;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            bv.a(param0, "", (byte) 15);
            bq.a((byte) 108, param0);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "hi.B(" + (param0 != null ? "{...}" : "null") + ',' + true + ')');
        }
    }

    final byte[] b(int param0) {
        if (((hi) this).field_p) {
          throw new RuntimeException();
        } else {
          if (param0 != 12802) {
            ((hi) this).field_v = null;
            return ((hi) this).field_u;
          } else {
            return ((hi) this).field_u;
          }
        }
    }

    hi() {
    }

    final static boolean a(int param0, String param1) {
        return null != fm.a(param1, 145);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "None";
    }
}
