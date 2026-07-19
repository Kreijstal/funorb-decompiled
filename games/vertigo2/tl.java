/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl {
    static String field_a;
    static byte[] field_b;
    static r field_c;
    private static String field_z;

    public static void a(boolean param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (!param0) {
            field_a = (String) null;
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int incrementValue$0 = 0;
        field_z = "tl.A(";
        field_a = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_b = new byte[32896];
        int var0 = 0;
        for (var1 = 0; (var1 ^ -1) > -257; var1++) {
            for (var2 = 0; var2 <= var1; var2++) {
                incrementValue$0 = var0;
                var0++;
                field_b[incrementValue$0] = (byte)(int)(255.0 / Math.sqrt((double)((float)(65535 + var2 * var2 + var1 * var1) / 65535.0f)));
            }
        }
    }
}
