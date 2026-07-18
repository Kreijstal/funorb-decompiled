/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends fa {
    int field_m;
    static boolean field_l;
    byte[] field_k;
    static String field_n;

    final static boolean a() {
        int var1 = 0;
        return ck.a(true, ao.a(13867));
    }

    final static tf[] a(int param0, boolean param1, int param2, int param3, int param4) {
        int discarded$0 = 1;
        int discarded$1 = 65793;
        int discarded$2 = 0;
        int discarded$3 = 126;
        int discarded$4 = 3;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 1;
        int discarded$8 = 1;
        return ra.a();
    }

    public static void a(int param0) {
        field_n = null;
        int var1 = 25;
    }

    og(byte[] param0) {
        try {
            ((og) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "og.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Game options";
    }
}
