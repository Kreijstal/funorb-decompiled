/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eo extends mo {
    static int field_j;
    static tn[] field_l;
    static int field_m;
    static boolean field_o;
    static java.awt.Frame field_k;
    static String field_n;

    final static void a(int param0, int[][] param1) {
        try {
            vl.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "eo.B(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        field_l = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_o = true;
        field_n = "Try again";
    }
}
