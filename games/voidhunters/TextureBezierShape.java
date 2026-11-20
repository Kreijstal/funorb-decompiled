/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureBezierShape extends TextureRasterShape {
    private int endX;
    private int control1Y;
    private int startX;
    private int control2X;
    private int control1X;
    private int control2Y;
    private int startY;
    private int endY;
    static CommonArchiveId field_q;
    static String field_j;
    static String field_g;
    static PlatformService field_n;
    static int field_f;

    TextureBezierShape(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        super(-1, param8, param9);
        this.endX = param6;
        this.startY = param1;
        this.control1X = param2;
        this.endY = param7;
        this.control1Y = param3;
        this.control2Y = param5;
        this.control2X = param4;
        this.startX = param0;
    }

    final void drawOutline(byte param0, int param1, int param2) {
        int var4 = this.startX * param2 >> 12;
        int var5 = param1 * this.startY >> 12;
        int var6 = param2 * this.control1X >> 12;
        int var7 = param1 * this.control1Y >> 12;
        int var8 = this.control2X * param2 >> 12;
        int var9 = param1 * this.control2Y >> 12;
        int var12 = -88 / ((param0 + 48) / 40);
        int var10 = param2 * this.endX >> 12;
        int var11 = this.endY * param1 >> 12;
        GetPointDefenceLaserProjectiles.a(var9, var5, var4, this.outlineColor, var6, var7, var8, 88, var11, var10);
    }

    final void drawFilledAndOutline(int param0, byte param1, int param2) {
        if (param1 != 110) {
          this.drawFilled((byte) 79, 23, -77);
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_g = null;
        if (param0 > -121) {
          return;
        }
        field_j = null;
        field_n = null;
        field_q = null;
    }

    final void drawFilled(byte param0, int param1, int param2) {
        if (param0 != -112) {
          this.startX = -85;
        }
    }

    static {
        field_q = new CommonArchiveId(6);
        field_g = "Please select an option in the '<%0>' row.";
        field_j = "<%0> would need a rating of <%1> to play with the current options.";
        field_f = 0;
    }
}
