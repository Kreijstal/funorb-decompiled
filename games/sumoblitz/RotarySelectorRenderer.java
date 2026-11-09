/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RotarySelectorRenderer implements WidgetRenderer {
    private LegacyBitmapFont font;
    private int dialColor;
    private int targetMarkerColor;
    private int textColor;
    private int textPadding;
    private int backgroundColor;
    private int textShadow;
    private int textTop;
    static int field_b;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        RotarySelectorWidget var14 = null;
        int var7 = 0;
        int var8 = 0;
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          var14 = widget instanceof RotarySelectorWidget ? (RotarySelectorWidget) (widget) : null;
          if (var14 == null) {
          }
          SoftwareRasterizer.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.backgroundColor);
          var7 = parentX - (-widget.x - var14.centerX);
          var8 = var14.centerY + (parentY + widget.y);
          SoftwareRasterizer.fillCircle(var7, var8, var14.radius, this.dialColor);
          if (-1 != var14.targetValue) {
            var9 = 2.0 * (3.141592653589793 * (double)var14.targetValue) / (double)var14.steps;
            var11 = (int)(-Math.sin(var9) * (double)var14.radius);
            var12 = (int)(Math.cos(var9) * (double)var14.radius);
            SoftwareRasterizer.fillCircle(var7 + var11, var8 + var12, 1, this.targetMarkerColor);
          }
          SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
          if (guard != 5592405) {
            this.textTop = -11;
          }
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.value) / (double)var14.steps;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.radius);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.radius);
          SoftwareRasterizer.drawLine(var7, var8, var7 + var11Lifetime1, var12Lifetime1 + var8, 1);
          if (null != this.font) {
            var13 = var14.radius + (var14.centerX + this.textPadding);
            this.font.drawParagraph(widget.text, widget.x + (parentX + var13), widget.y + (parentY + this.textTop), -this.textPadding - var13 + widget.width, -(this.textPadding << 1) + widget.height, this.textColor, this.textShadow, 1, 1, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "va.A(" + (widget != null ? "{...}" : "null") + ',' + parentY + ',' + guard + ',' + isEnabled + ',' + parentX + ')');
        }
    }

    final static void updateAppletNavigationLinks(boolean guard, java.applet.Applet applet) {
        try {
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          String var3 = null;
          java.applet.Applet var4 = null;
          java.net.URL var5 = null;
          try {
            try {
              if (guard) {
                var4 = (java.applet.Applet) null;
                RotarySelectorRenderer.updateAppletNavigationLinks(true, (java.applet.Applet) null);
              }
              var5 = applet.getCodeBase();
              var3 = MusicPatch.a((byte) 121, applet, var5).getFile();
              BrowserScriptBridge.call(-105, applet, "updatelinks", new Object[]{"home", var3 + "home.ws"});
              BrowserScriptBridge.call(-115, applet, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"});
              BrowserScriptBridge.call(-111, applet, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"});
              BrowserScriptBridge.call(-106, applet, "updatelinks", new Object[]{"options", var3 + "options.ws"});
              BrowserScriptBridge.call(-126, applet, "updatelinks", new Object[]{"terms", var3 + "terms.ws"});
              BrowserScriptBridge.call(-101, applet, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"});
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref;
            stackIn_8_1 = new StringBuilder().append("va.B(").append(guard).append(',');
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    RotarySelectorRenderer(LegacyBitmapFont textFont, int padding, int labelTop, int labelColor, int shadow, int dialFill, int targetFill, int background) {
        try {
          this.backgroundColor = background;
          this.textTop = labelTop;
          this.targetMarkerColor = targetFill;
          this.textPadding = padding;
          this.dialColor = dialFill;
          this.font = textFont;
          this.textColor = labelColor;
          this.textShadow = shadow;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "va.<init>(" + (textFont != null ? "{...}" : "null") + ',' + padding + ',' + labelTop + ',' + labelColor + ',' + shadow + ',' + dialFill + ',' + targetFill + ',' + background + ')');
        }
    }

    static {
        field_b = 0;
    }
}
