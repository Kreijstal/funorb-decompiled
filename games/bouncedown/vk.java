/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static boolean field_a;
    static String[] field_d;
    static ci field_c;
    static String field_e;
    static int field_b;

    public static void a() {
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, tg[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, tj param9, tj param10, tg[] param11, int param12, int param13) {
        try {
            int discarded$0 = 2;
            va.a();
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "vk.A(" + 240 + ',' + (param1 != null ? "{...}" : "null") + ',' + 320 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + 3 + ',' + 2 + ',' + (param9 != null ? "{...}" : "null") + ',' + (param10 != null ? "{...}" : "null") + ',' + (param11 != null ? "{...}" : "null") + ',' + param12 + ',' + param13 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = 3;
        field_e = "Loading music";
    }
}
