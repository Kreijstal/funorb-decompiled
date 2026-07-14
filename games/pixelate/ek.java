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
        int var1 = 0;
        int var2 = Pixelate.field_H ? 1 : 0;
        for (var1 = 0; var1 < sd.field_L; var1++) {
            de.field_e[var1] = null;
        }
        if (!param0) {
            ek.a(false);
        }
        sd.field_L = 0;
    }

    public static void a(int param0) {
        field_d = null;
        int var1 = -83 / ((param0 - -65) / 59);
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
