/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn {
    float field_f;
    int[] field_c;
    static String field_d;
    int field_b;
    static String field_a;
    int field_e;

    final static void a(ah param0, boolean param1, ah param2) {
        lj.field_c = param2;
        try {
            nn.field_T = param0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "jn.B(" + (param0 != null ? "{...}" : "null") + ',' + true + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_d = null;
    }

    jn(bh param0) {
        int var2_int = 0;
        try {
            ((jn) this).field_b = param0.e(127);
            int discarded$0 = param0.d((byte) -99);
            var2_int = param0.d((byte) -99);
            if (var2_int != 1) {
                throw new RuntimeException();
            }
            ((jn) this).field_e = param0.e(127);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "jn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Your game";
        field_a = "Only show private chat from my friends and opponents";
    }
}
