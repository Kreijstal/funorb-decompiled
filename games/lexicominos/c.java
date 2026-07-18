/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends kd {
    static ki field_m;
    int field_k;
    static qb field_j;
    byte[] field_h;
    long field_l;
    static ki field_o;
    static int[][] field_i;
    static String field_n;

    public static void a() {
        field_o = null;
        field_m = null;
        field_i = null;
        field_n = null;
    }

    final static db[] a(int param0, int param1, int param2, int param3, int param4) {
        return rb.a(1, 1, 0, 1, 0, 1, 0, 3, 65793);
    }

    c(long param0, int param1, byte[] param2) {
        try {
            ((c) this).field_h = param2;
            ((c) this).field_l = param0;
            ((c) this).field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "c.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = null;
        field_m = new ki();
        field_i = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
        field_o = new ki();
        field_n = "BONUS";
    }
}
