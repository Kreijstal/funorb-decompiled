/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    static int[] field_a;
    static BitmapFont field_g;
    static Sprite[] field_d;
    static int[] field_b;
    int height;
    int width;
    static String[] helpTopicTitles;
    static int field_f;
    int[] pixels;
    java.awt.Image field_e;

    public static void b(int param0) {
        field_g = null;
        field_d = null;
        field_a = null;
        field_b = null;
        helpTopicTitles = null;
        if (param0 != -15721) {
          RasterBuffer.b(-127);
        }
    }

    abstract void a(int param0, java.awt.Component param1, int param2, int param3);

    final void bindAsTarget(int param0) {
        int var2 = 109 / ((37 - param0) / 63);
        SoftwareRasterizer.setTarget(this.pixels, this.width, this.height);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    static {
        field_a = new int[]{0, 0, 0};
        field_b = new int[]{31, 992, 31744};
        helpTopicTitles = new String[]{"Welcome to Tor Challenge!", "Characters", "Basic controls", "Special attacks", "Combo attack", "Interface", "Coins", "Bonus crystals", "Health", "Help"};
        field_f = -1;
    }
}
