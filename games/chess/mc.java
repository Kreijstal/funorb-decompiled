/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static RgbSprite field_b;
    static byte[] field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 21) {
          mc.clearStaticReferences((byte) -114);
        }
    }

    static {
        field_z = "mc.A(";
    }
}
