/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh {
    static ge field_a;
    static String field_b;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(byte param0, ue param1) {
        nj.b(param1.a("headers.packvorbis", (byte) 45, ""));
        nj var2 = nj.a(param1, "jagex logo2.packvorbis", "");
        try {
            ud discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "dh.B(" + 115 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ge();
        field_b = "Checking";
    }
}
