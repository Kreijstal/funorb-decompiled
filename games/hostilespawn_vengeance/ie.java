/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_a;
    static gn field_c;
    static RgbSprite[] field_b;
    private static String field_z;

    public static void clearStaticReferences(byte param0) {
        if (param0 == 4) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        ie.clearStaticReferences((byte) 100);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_z = "ie.A(";
        field_c = null;
        field_a = "Get to your shuttle before the reactor explodes!";
    }
}
