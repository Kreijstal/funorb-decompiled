/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh {
    static String field_c;
    static dd field_b;
    static rh field_e;
    static int[] field_d;
    private String field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean b(int param0) {
        if (param0 != 27415) {
            return true;
        }
        return (vg.field_z ^ -1) < -251 ? true : false;
    }

    final boolean a(byte param0, String param1) {
        if (param0 != -38) {
            field_e = null;
            return ((wh) this).field_a.equals((Object) (Object) param1);
        }
        return ((wh) this).field_a.equals((Object) (Object) param1);
    }

    public static void c(int param0) {
        field_d = null;
        if (param0 != -251) {
          field_d = null;
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
    }

    wh(String param0) {
        ((wh) this).field_a = param0;
    }

    final static void a(int param0) {
        tf.d(true);
        if (param0 >= -71) {
            wh.a(-58);
        }
    }

    final void a(boolean param0, java.applet.Applet param1) {
        if (!param0) {
            return;
        }
        uk.a(((wh) this).field_a, 31536000L, 0, param1, "jagex-last-login-method");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "<%0>Trapdoor:<%1> Fleas always fall through these.";
        field_d = new int[40];
    }
}
