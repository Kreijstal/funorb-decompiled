/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static ak field_a;
    static int[] field_c;
    static String field_b;

    final static void a(boolean param0, String param1) {
        try {
            sc.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "kh.A(" + false + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_b = "Rank";
    }
}
