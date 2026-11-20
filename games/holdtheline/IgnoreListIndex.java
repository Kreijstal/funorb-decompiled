/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class IgnoreListIndex {
    static DualNodeHashTable entries;
    static SpriteAsset field_a;
    private static String field_z;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 108) {
          return;
        }
        field_a = null;
        entries = null;
    }

    static {
        field_z = "jo.A(";
    }
}
