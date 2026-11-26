/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static RgbSprite field_a;
    private static String field_z;

    public static void clearStaticReferences(boolean param0) {
        field_a = null;
        if (!param0) {
          field_a = (RgbSprite) null;
        }
    }

    static {
        field_z = "qi.A(";
    }
}
