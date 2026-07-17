/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static String field_a;
    static String[] field_b;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, byte param1, ak param2) {
        try {
            if (param1 != 84) {
                field_a = null;
            }
            oh.field_j.a((ne) (Object) param2, false);
            g.a(param0, param2, (byte) 50);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "vb.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
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
