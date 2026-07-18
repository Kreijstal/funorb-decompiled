/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static String field_b;

    final static void a(byte param0, int param1, String param2, String param3, String param4) {
        pgb var6 = null;
        try {
            if (param0 >= -12) {
                field_a = null;
            }
            var6 = new pgb(2, param3, 0, param2, param4);
            int discarded$0 = 0;
            fpb.a(var6);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "lh.A(" + param0 + ',' + 0 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Spawn Spawnpoint";
        field_a = "<%0> won the match!";
    }
}
