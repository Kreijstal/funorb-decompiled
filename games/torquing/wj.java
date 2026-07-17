/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends e {
    static ce field_i;
    static java.applet.Applet field_g;
    static String field_j;
    static t[] field_h;
    static sm field_k;

    final static void a(int param0) {
        if (on.field_c >= 140) {
            bd.a(false, 160);
            return;
        }
        bd.a(false, 20 + on.field_c);
    }

    public static void c(boolean param0) {
        field_i = null;
        field_j = null;
        field_k = null;
        field_h = null;
        field_g = null;
        if (param0) {
            wj.c(true);
        }
    }

    wj(long param0, String param1) {
        super(param0, param1);
    }

    final gq a(boolean param0) {
        if (param0) {
            field_j = null;
            return pa.field_d;
        }
        return pa.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_i = new ce();
    }
}
