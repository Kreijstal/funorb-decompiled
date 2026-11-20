/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    int offsetX;
    int canvasHeight;
    static ValidationState field_q;
    static int[] field_p;
    int height;
    int offsetY;
    int width;
    static Sprite field_t;
    static int field_r;
    static String field_w;
    int canvasWidth;

    final void drawRotatedCenteredNearest(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.canvasWidth << 3;
        param3 = (param3 << 4) + (param0 & var6);
        int var7 = this.canvasHeight << 3;
        param4 = (param4 << 4) + (15 & var7);
        this.drawRotatedNearest(var6, var7, param3, param4, param1, param2);
    }

    abstract void drawRotatedNearest(int param0, int param1, int param2, int param3, int param4, int param5);

    public static void clearSharedReferences(int param0) {
        field_q = null;
        field_p = null;
        field_t = null;
        if (param0 != -13503) {
          field_w = (String) null;
          field_w = null;
          return;
        }
        field_w = null;
    }

    SpriteState() {
    }

    static {
        field_q = new ValidationState();
        field_w = "Hold the Line";
    }
}
