/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hu {
    static float[] field_b;
    static float[] field_c;
    static String field_a;
    static String field_d;
    private static String field_z;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 != 119) {
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var2 = 0;
        field_z = "hu.A(";
        field_b = new float[16384];
        field_c = new float[16384];
        double var0 = 0.0003834951969714103;
        for (var2 = 0; -16385 < (var2 ^ -1); var2++) {
            field_b[var2] = (float)Math.sin((double)var2 * var0);
            field_c[var2] = (float)Math.cos((double)var2 * var0);
        }
        field_a = "<%0> ran out of time";
        field_d = "Waiting For Sync";
    }
}
