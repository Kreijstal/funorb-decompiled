/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hq {
    static String resizableText;
    static int field_b;
    static String loadingSoundEffectsText;
    private static String field_z;

    public static void a(byte param0) {
        loadingSoundEffectsText = null;
        resizableText = null;
        int var1 = -20 / ((param0 + 13) / 39);
    }

    static {
        field_z = "hq.C(";
        resizableText = "Resizable";
        field_b = -1;
        loadingSoundEffectsText = "Loading sound effects";
    }
}
