/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class reb {
    static Sprite field_a;
    private static String field_z;

    public static void clearSharedReferences(boolean param0) {
        field_a = null;
        if (param0) {
          field_a = (Sprite) null;
        }
    }

    static {
        field_z = "reb.A(";
    }
}
