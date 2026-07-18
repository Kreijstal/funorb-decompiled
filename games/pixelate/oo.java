/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oo {
    static int field_f;
    static boolean field_d;
    static tf[] field_c;
    static String field_a;
    static int field_b;
    static int[][] field_e;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        field_e = null;
    }

    final static void a(int param0, qe param1) {
        try {
            param1.field_t = new char[]{'?'};
            param1.field_D = new int[]{-1};
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "oo.A(" + -1 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_d = true;
        field_a = null;
    }
}
