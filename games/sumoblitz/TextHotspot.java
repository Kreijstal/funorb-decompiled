/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextHotspot extends IntrusiveNode {
    static ToolkitSprite[] field_n;
    static int field_o;
    int y;
    int height;
    static double field_m;
    TextHotspot nextFragment;
    int id;
    int x;
    int width;
    static IntrusiveDeque field_u;
    static String thisGameHasBeenText;

    public static void releaseStatics(int param0) {
        if (param0 == 18232) {
          thisGameHasBeenText = null;
          field_n = null;
          field_u = null;
          return;
        }
        thisGameHasBeenText = (String) null;
        thisGameHasBeenText = null;
        field_n = null;
        field_u = null;
    }

    TextHotspot(int hotspotId, int left, int top, int pixelWidth, int pixelHeight) {
        this.y = top;
        this.height = pixelHeight;
        this.width = pixelWidth;
        this.id = hotspotId;
        this.x = left;
    }

    static {
        field_u = null;
        field_m = Math.atan2(1.0, 0.0);
        thisGameHasBeenText = "This game has been updated! Please reload this page.";
    }
}
