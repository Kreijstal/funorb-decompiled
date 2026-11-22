/*
 * Decompiled by CFR-JS 0.4.0.
 */
class BillboardSpriteData {
    static SpriteData[][] spritesByType;
    private static String field_z;

    public static void releaseStatics(int param0) {
        spritesByType = (SpriteData[][]) null;
        if (param0 != 29574) {
          BillboardSpriteData.releaseStatics(59);
        }
    }

    static {
        field_z = "eta.D(";
    }
}
