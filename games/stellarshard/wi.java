/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static String field_b;
    static boolean field_a;

    public static void a(byte param0) {
        field_b = null;
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 78 / ((-24 - param1) / 55);
        int var4 = param0 >> 16;
        int var5 = param0 & 65535;
        int var6 = param2 >> 16;
        int var7 = param2 & 65535;
        return var4 * param2 + (var6 * var5 + (var7 * var5 >> 16));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords must be between 5 and 20 characters long";
    }
}
