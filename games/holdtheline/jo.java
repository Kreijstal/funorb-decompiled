/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jo {
    static DualNodeHashTable field_b;
    static SpriteAsset field_a;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 108) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_z = "jo.A(";
    }
}
