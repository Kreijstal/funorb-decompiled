/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpacityWidget extends SingleChildWidget {
    int opacity;
    static int field_I;
    static BufferedSocket field_H;

    public static void releaseStatics(byte param0) {
        if (param0 != -19) {
          return;
        }
        field_H = null;
    }

    final static void setAccountWorkflowState(byte param0, int param1) {
        if (param0 <= 37) {
          OpacityWidget.setAccountWorkflowState((byte) 83, 58);
          UiThemeSetupHelpers.field_a = param1;
          return;
        }
        UiThemeSetupHelpers.field_a = param1;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        Sprite var6 = null;
        if (param2 != param1) {
          return;
        }
        if (null == this.field_F) {
          return;
        }
        if (this.opacity == 0) {
          return;
        }
        if (this.opacity != 256) {
          var6 = new Sprite(this.field_F.width, this.field_F.height);
          UrlPacketDownloader.a(var6, false);
          this.field_F.drawLayer(0, 0, param2, 0);
          UsernameLoginCredentials.popRasterState(4);
          var6.drawAlpha(param0 + this.x, this.y + param3, this.opacity);
          return;
        }
        this.field_F.drawLayer(this.x + param0, 0, param2, this.y + param3);
    }

    public OpacityWidget() {
        super(0, 0, 0, 0, (WidgetRenderer) null, (WidgetListener) null);
        this.opacity = 256;
    }

    OpacityWidget(UiWidget param0) {
        super(param0.x, param0.y, param0.width, param0.height, (WidgetRenderer) null, (WidgetListener) null);
        try {
          param0.setBounds(114, 0, this.height, this.width, 0);
          this.field_F = param0;
          this.opacity = 256;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 50;
    }
}
