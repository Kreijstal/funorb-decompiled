/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj {
    static ba field_a;
    static String field_c;
    static SoundCache field_b;

    final static mi a(byte param0, String param1) {
        RuntimeException var2 = null;
        mi stackIn_2_0 = null;
        mi stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -75) {
            stackIn_2_0 = (mi) null;
            return stackIn_2_0;
          }
          if (RichTextLayout.field_u.a(false) &&
            !param1.equals(RichTextLayout.field_u.a(-80))) {
            RichTextLayout.field_u = hg.a(param1, (byte) 113);
          }
          stackIn_7_0 = RichTextLayout.field_u;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("cj.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        TextFieldValidator.field_g[0].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        SoftwareRasterizer.addRadialGlow(1280, 960, 960, 255, ResourceArchive.field_f);
        hg.field_ab.draw(40, 20);
        ab.field_g[0].drawHalfSize(10, 50);
        ab.field_g[1].drawHalfSize(100, 50);
        ab.field_g[2].drawHalfSize(55, 70);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        TextFieldValidator.field_g[1].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        ab.field_g[24].drawHalfSize(80, 0);
        ab.field_g[24].drawHalfSize(110, 10);
        SoftwareRasterizer.addRadialGlow(960, 800, 640, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(40, 30);
        SoftwareRasterizer.addRadialGlow(1600, 1120, 640, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(80, 50);
        ab.field_g[12].drawHalfSize(10, 50);
        ab.field_g[12].drawHalfSize(40, 60);
        ab.field_g[12].drawHalfSize(20, 70);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        TextFieldValidator.field_g[2].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        ab.field_g[60].draw(30, 10);
        SoftwareRasterizer.addRadialGlow(480, 1040, 480, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(10, 45);
        SoftwareRasterizer.addRadialGlow(2080, 1040, 480, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(110, 45);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        TextFieldValidator.field_g[3].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        ab.field_g[86].draw(30, 0);
        SoftwareRasterizer.addRadialGlow(480, 1040, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(20, 55);
        SoftwareRasterizer.addRadialGlow(2080, 1040, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(120, 55);
        SoftwareRasterizer.addRadialGlow(880, 1360, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(45, 75);
        SoftwareRasterizer.addRadialGlow(1680, 1360, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(95, 75);
        SoftwareRasterizer.addRadialGlow(1280, 1440, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(70, 80);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        TextFieldValidator.field_g[4].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        SoftwareRasterizer.addRadialGlow(640, 1520, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(30, 85);
        SoftwareRasterizer.addRadialGlow(1920, 1520, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(110, 85);
        SoftwareRasterizer.addRadialGlow(1920, 560, 240, 255, ResourceArchive.field_f);
        hg.field_ab.drawQuarterSizeAveraged(110, 25);
        ab.field_g[99].drawHalfSize(20, 20);
        hf.field_g[0].drawHalfSize(75, 55);
        hf.field_g[2].b(2093920872, 3000, 50, 85, 62);
        hf.field_g[1].drawHalfSize(75, 55);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        TextFieldValidator.field_g[5].bindAsRenderTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 160, 120, 0);
        SoftwareRasterizer.addRadialGlow(640, 640, 640, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(20, 20);
        SoftwareRasterizer.addRadialGlow(1280, 960, 960, 255, ResourceArchive.field_f);
        hg.field_ab.draw(40, 20);
        SoftwareRasterizer.addRadialGlow(1920, 1280, 640, 255, ResourceArchive.field_f);
        hg.field_ab.drawHalfSize(100, 60);
        BufferedSocket.field_a.setAsRasterTarget(-40);
        if (param0 <= 51) {
          field_b = (SoundCache) null;
        }
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 1280) {
          field_a = (ba) null;
        }
    }

    static {
        field_a = new ba(4, 1, 1, 1);
        field_c = "Loading...";
    }
}
