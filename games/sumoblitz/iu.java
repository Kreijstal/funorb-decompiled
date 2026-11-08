/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iu implements WidgetRenderer {
    private int field_d;
    private LegacyBitmapFont field_c;
    static int field_e;
    private int field_h;
    private int field_b;
    private int field_g;
    private int field_f;
    private int field_a;

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        int var10 = 0;
        UiWidget stackIn_4_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        UiWidget var12 = null;
        fu var13 = null;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (widget instanceof fu) {
            stackIn_4_0 = (UiWidget) (widget);
          } else {
            stackIn_4_0 = null;
          }
          var13 = (fu) (stackIn_4_0);
          SoftwareRasterizer.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.field_h);
          if (var13 != null) {
          }
          if (guard != 5592405) {
            var12 = (UiWidget) null;
            this.renderWidget((UiWidget) null, -54, -79, true, -72);
          }
          var7 = widget.width - var13.field_I * 2;
          var8 = parentX - (-widget.x - var13.field_I);
          var9 = parentY + widget.y + var13.field_J;
          SoftwareRasterizer.drawLine(var8, var9, var7 + var8, var9, this.field_g);
          for (var10 = -1 + var13.g(0); var10 >= 0; var10--) {
            SoftwareRasterizer.fillCircle(var8 + var13.a(var10, guard - 5616599) * var7 / var13.h(-1), var9, this.field_d, this.field_a);
          }
          if (this.field_c == null) {
            return;
          }
          this.field_c.a(var13.text, var8 + var7 / 2, var13.field_J + (this.field_c.field_F + var9), this.field_b, this.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("iu.A(");
          if (widget == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (param0 <= -117) {
          pg.field_a = false;
          StatusMessagePanel.field_A = false;
          rd.a(-1, -69);
          vm.field_c = hm.field_a;
          ProxySocketConnector.field_e = hm.field_a;
          return;
        }
        iu.a((byte) -85);
        pg.field_a = false;
        StatusMessagePanel.field_A = false;
        rd.a(-1, -69);
        vm.field_c = hm.field_a;
        ProxySocketConnector.field_e = hm.field_a;
    }

    final static void a(int param0, km param1, int param2) {
        pl var3 = null;
        try {
          if (param0 != -1) {
            field_e = 23;
          }
          var3 = InwardSparkParticle.field_v;
          var3.g(param2, param0 ^ -9);
          var3.writeByte((byte) 85, param1.field_n);
          var3.writeByte((byte) 23, param1.field_l);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "iu.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    iu(LegacyBitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_g = param3;
          this.field_b = param1;
          this.field_a = param6;
          this.field_h = param4;
          this.field_d = param5;
          this.field_f = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "iu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_e = -1;
    }
}
