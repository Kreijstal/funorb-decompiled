/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static byte[][] field_c;
    static ej field_d;
    static eg field_a;
    static String field_b;

    final static void a(java.awt.Canvas param0, int param1) {
        int var2 = 0;
        wl.a((java.awt.Component) (Object) param0, (byte) -3);
        var2 = 59 / ((9 - param1) / 59);
        g.a((java.awt.Component) (Object) param0, 0);
        if (null != jd.field_c) {
          jd.field_c.a((java.awt.Component) (Object) param0, false);
          return;
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          field_a = (eg) null;
          field_b = null;
          field_c = (byte[][]) null;
          return;
        } else {
          field_b = null;
          field_c = (byte[][]) null;
          return;
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new byte[1000][];
        field_d = new ej(4, 1, 1, 1);
        field_b = "Creating your account";
        field_a = new eg();
    }
}
