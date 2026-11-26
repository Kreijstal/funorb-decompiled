/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static String field_a;
    static RgbSprite[] field_b;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 < 49) {
          ff.clearStaticReferences((byte) -78);
        }
    }

    static {
        field_z = "ff.A(";
        field_a = "Email (Login):";
        field_b = new RgbSprite[50];
    }
}
