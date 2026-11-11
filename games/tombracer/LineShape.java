/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LineShape extends RasterShape {
    private int field_j;
    static int field_h;
    private int field_i;
    private int field_g;
    private int field_f;

    final void drawFilled(int param0, int param1, int param2) {
        int var4 = 86 / ((param1 - 55) / 37);
    }

    final void drawFilledWithOutline(byte param0, int param1, int param2) {
        if (param0 >= -117) {
          field_h = -1;
        }
    }

    LineShape(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(-1, param4, param5);
        this.field_j = param3;
        this.field_i = param0;
        this.field_f = param2;
        this.field_g = param1;
    }

    final void drawOutline(int param0, int param1, boolean param2) {
        int var4 = this.field_i * param0 >> 12;
        int var5 = this.field_f * param0 >> 12;
        int var6 = param1 * this.field_g >> 12;
        int var7 = param1 * this.field_j >> 12;
        IntArrayRequest.a(var5, var4, -49, this.outlineColour, var7, var6);
        if (param2) {
          return;
        }
        field_h = 68;
    }

    static {
        field_h = 100;
    }
}
