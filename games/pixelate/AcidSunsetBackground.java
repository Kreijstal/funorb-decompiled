/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AcidSunsetBackground extends BackgroundScene {
    static int field_n;
    private int field_p;
    private int field_m;
    static IndexedSprite[] field_o;

    final void tick(int param0) {
        super.tick(param0);
        this.field_m = this.field_m + 1;
        this.field_p = this.field_p + 2;
        if (DialWidgetPainter.field_f.length <= this.field_m) {
          this.field_m = this.field_m - DialWidgetPainter.field_f.length;
          if (DialWidgetPainter.field_f.length <= this.field_p) {
            this.field_p = this.field_p - DialWidgetPainter.field_f.length;
            return;
          }
          return;
        }
        if (DialWidgetPainter.field_f.length > this.field_p) {
          return;
        }
        this.field_p = this.field_p - DialWidgetPainter.field_f.length;
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          AcidSunsetBackground.releaseStatics(35);
          field_o = null;
          return;
        }
        field_o = null;
    }

    AcidSunsetBackground(String param0, Sprite[] param1) {
        super(param0, param1);
    }

    final void render(boolean param0) {
        SoftwareRasterizer.fillVerticalGradient(0, 0, 640, 480, DialWidgetPainter.field_f[this.field_m], DialWidgetPainter.field_f[this.field_p]);
        if (param0) {
          return;
        }
        int var2 = this.field_m;
        if (var2 > 512) {
          var2 = 0;
          return;
        }
        if (var2 <= 256) {
          return;
        }
        var2 = 512 - var2;
    }

    static {
    }
}
