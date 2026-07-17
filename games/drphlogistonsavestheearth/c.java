/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static he[] field_a;

    public static void a() {
        field_a = null;
    }

    final static void a(boolean param0, vj param1) {
        tk var2 = null;
        tk.b(param1.a("headers.packvorbis", "", 24874));
        try {
            var2 = tk.a(param1, "jagex logo2.packvorbis", "");
            vk discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "c.A(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new he[5];
    }
}
