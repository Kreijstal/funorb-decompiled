/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspotRegion extends IntrusiveNode {
    static int[] decodedSpriteHeights;
    int x;
    int width;
    int y;
    static RgbSprite field_o;
    static Mesh3D[] logoMeshes;
    TextHotspotRegion nextSegment;
    static byte[] field_q;
    static String field_l;
    int height;
    int hotspotId;
    static String field_m;
    static RgbSprite[] powerUpMeterIcons;

    public static void a(byte param0) {
        int var1 = 127 % ((-74 - param0) / 42);
        field_o = null;
        decodedSpriteHeights = null;
        field_q = null;
        field_m = null;
        powerUpMeterIcons = null;
        field_l = null;
        logoMeshes = null;
    }

    TextHotspotRegion(int hotspotId, int x, int y, int width, int height) {
        this.width = width;
        this.hotspotId = hotspotId;
        this.y = y;
        this.height = height;
        this.x = x;
    }

    static {
        field_m = "No options available";
        field_l = "Instructions";
    }
}
