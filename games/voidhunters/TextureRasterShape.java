/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TextureRasterShape {
    int outlineWidth;
    int outlineColor;
    static String field_b;
    static String field_c;
    int fillColor;

    abstract void drawOutline(byte param0, int param1, int param2);

    abstract void drawFilled(byte param0, int param1, int param2);

    public static void clearSharedReferences(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 28378) {
          TextureRasterShape.clearSharedReferences(72);
        }
    }

    abstract void drawFilledAndOutline(int param0, byte param1, int param2);

    TextureRasterShape(int param0, int param1, int param2) {
        this.outlineWidth = param2;
        this.fillColor = param0;
        this.outlineColor = param1;
    }

    static {
        field_b = "Play rated game";
        field_c = "Fighter chassis";
    }
}
