/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FontSceneGlobals {
    static TextFont field_a;
    static RgbSprite waterNearSprite;
    private static String field_z;

    public static void clearSharedReferences(int obfuscationGuard) {
        field_a = null;
        int var1 = -11 / ((-26 - obfuscationGuard) / 61);
        waterNearSprite = null;
    }

    static {
        field_z = "wm.A(";
    }
}
