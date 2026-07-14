/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends dg {
    static boolean[] field_T;
    static String field_V;
    static int field_U;

    final void d(ea param0, int param1) {
        this.d(param0, param1);
    }

    ad(lt param0, ea param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void e(boolean param0) {
        if (param0) {
            field_U = -104;
            field_V = null;
            field_T = null;
            return;
        }
        field_V = null;
        field_T = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_V = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_U = 200;
        field_T = new boolean[]{true, true, false, true, false};
    }
}
