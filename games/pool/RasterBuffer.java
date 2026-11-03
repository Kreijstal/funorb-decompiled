/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    int[] pixels;
    static boolean field_i;
    static String nSecondTimePenalty;
    static VerticalScrollbar field_f;
    static boolean field_j;
    int width;
    java.awt.Image field_c;
    static java.awt.Frame field_l;
    static Sprite[] field_a;
    int height;
    static String createAlertNamechars;
    static Sprite field_d;

    abstract void drawTo(java.awt.Graphics param0, int param1, int param2, int param3);

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        field_l = null;
        if (param0 == -26830) {
          createAlertNamechars = null;
          nSecondTimePenalty = null;
          field_f = null;
          return;
        }
        createAlertNamechars = (String) null;
        createAlertNamechars = null;
        nSecondTimePenalty = null;
        field_f = null;
    }

    final void bindAsRenderTarget(int param0) {
        SoftwareRasterizer.setTarget(this.pixels, this.width, this.height);
        if (param0 != 15100) {
          this.bindAsRenderTarget(78);
        }
    }

    abstract void initialize(int param0, int param1, int param2, java.awt.Component param3);

    static {
        nSecondTimePenalty = "Foul! <%0>-second time penalty incurred!";
        field_i = false;
        createAlertNamechars = "Names can only contain letters, numbers, spaces and underscores";
    }
}
