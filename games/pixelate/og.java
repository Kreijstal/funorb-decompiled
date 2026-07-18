/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends fa {
    int field_m;
    static boolean field_l;
    byte[] field_k;
    static String field_n;

    final static boolean a(byte param0) {
        int var1 = 0;
        return ck.a(true, ao.a(13867));
    }

    final static tf[] a(int param0, boolean param1, int param2, int param3, int param4) {
        return ra.a(1, 1, 0, 0, 3, (byte) 126, 0, 65793, 1);
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
