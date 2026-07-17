/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static ak field_b;
    static String field_d;
    static int field_a;
    static String field_e;
    static boolean field_c;

    final static void a(boolean param0) {
        int var1_int = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        try {
            for (var1_int = 0; var1_int < sd.field_L; var1_int++) {
                de.field_e[var1_int] = null;
            }
            if (!param0) {
                ek.a(false);
            }
            sd.field_L = 0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ek.B(" + param0 + 41);
        }
    }

    public static void a() {
        field_d = null;
        int var1 = -83;
        field_b = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_e = "That name is not available";
        field_c = false;
        field_d = "You have been removed from <%0>'s game.";
    }
}
