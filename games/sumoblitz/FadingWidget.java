/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FadingWidget extends SingleChildWidget {
    static CacheIoWorker field_D;
    static String field_C;
    static int score;
    static String nextText;
    int opacity;

    final static boolean g(int param0) {
        if (param0 > -26) {
          nextText = (String) null;
          if (TextureCoordinateGeneration.field_a < 20) {
            return true;
          }
          if (!ScrollViewport.g(-1)) {
            return true;
          }
          if (jk.field_c <= 0) {
            return false;
          }
          if (!LegacyOpenGlReflectionEffect.c(1)) {
            return true;
          }
          return false;
        }
        if (TextureCoordinateGeneration.field_a < 20) {
          return true;
        }
        if (!ScrollViewport.g(-1)) {
          return true;
        }
        if (jk.field_c <= 0) {
          return false;
        }
        if (!LegacyOpenGlReflectionEffect.c(1)) {
          return true;
        }
        return false;
    }

    FadingWidget(UiWidget content) {
        super(content.x, content.y, content.width, content.height, (WidgetRenderer) null, (WidgetListener) null);
        try {
          content.setBounds(-116, 0, 0, this.height, this.width);
          this.opacity = 256;
          this.child = content;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "in.<init>(" + (content != null ? "{...}" : "null") + ')');
        }
    }

    public FadingWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity = 256;
    }

    public static void releaseStatics(byte param0) {
        if (param0 > -9) {
          return;
        }
        field_C = null;
        field_D = null;
        nextText = null;
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (0 != layer) {
          return;
        }
        if (null == this.child) {
          return;
        }
        if (this.opacity == 0) {
          return;
        }
        if (this.opacity == 256) {
          this.child.renderLayer(this.x + parentX, this.y + parentY, (byte) -125, layer);
          return;
        }
        Sprite var6 = new Sprite(this.child.width, this.child.height);
        jq.pushSpriteRaster(7161, var6);
        if (guard < -35) {
          this.child.renderLayer(0, 0, (byte) -55, layer);
          ClientException.popRasterState((byte) 108);
          var6.a(this.x + parentX, parentY + this.y, this.opacity);
          return;
        }
        field_C = (String) null;
        this.child.renderLayer(0, 0, (byte) -55, layer);
        ClientException.popRasterState((byte) 108);
        var6.a(this.x + parentX, parentY + this.y, this.opacity);
    }

    static {
        score = 0;
        nextText = "Next";
    }
}
