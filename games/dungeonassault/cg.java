/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg {
    static RgbSprite field_b;
    static String field_c;
    static tf field_a;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_c = null;
        if (param0 != -117) {
          field_b = (RgbSprite) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_z = "cg.A(";
        field_c = "members-only content";
    }
}
