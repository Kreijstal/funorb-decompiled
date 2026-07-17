/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc {
    static dk field_j;
    static String field_b;
    static String field_i;
    static String[][] field_g;
    static String field_f;
    static java.applet.Applet field_h;
    static bg field_a;
    static cf field_e;
    static String field_d;
    static String field_c;

    public static void a() {
        field_h = null;
        field_j = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_c = null;
        field_d = null;
        field_i = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1 = -13 % ((3 - param0) / 44);
        int var2 = ma.field_f * ma.field_f;
        int var3 = -(th.field_g * th.field_g) + var2;
        int var4 = ja.field_f - -(var3 * (te.field_P - ja.field_f) / var2);
        oj.field_a.a((byte) -116, 640, var4, 120, vi.field_d);
        int discarded$0 = 0;
        qh.a(5, eh.field_w, 640, te.field_P - 24, 1000000, fn.field_Q);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_j = new dk("usename");
        field_i = "Elapsed time";
        field_f = "You have been removed from <%0>'s game.";
        field_d = "Message game";
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_a = null;
    }
}
