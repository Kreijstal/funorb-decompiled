/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static String field_a;
    static String[] field_b;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, ak param2) {
        try {
            oh.field_j.a((ne) (Object) param2, false);
            int discarded$0 = 50;
            g.a(4, param2);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "vb.A(" + 4 + 44 + 84 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Immortality", "The immortal nature of the <%0> means that it cannot be killed by any normal means."};
        field_a = "Your raider was trapped and killed.";
    }
}
