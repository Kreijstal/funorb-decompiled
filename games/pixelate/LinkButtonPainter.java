/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkButtonPainter implements WidgetPainter {
    static boolean field_d;
    static volatile int field_i;
    static int[] field_a;
    static fp field_c;
    private int horizontalAlignment;
    private int verticalAlignment;
    static int field_e;
    private BitmapFont font;
    static int field_h;

    final static void openUrlInNewWindow(boolean param0, String param1, int param2, java.applet.Applet param3) {
        try {
          java.net.MalformedURLException var4 = null;
          RuntimeException var4_ref = null;
          RuntimeException stackIn_12_0 = null;
          StringBuilder stackIn_12_1 = null;
          String stackIn_13_2 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (PlatformTaskDispatcher.field_p.startsWith("win") &&
              la.openUrlWithShell(param1, -31451)) {
              return;
            }
            if (param2 > -31) {
              field_i = 125;
            }
            try {
              param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
              return;
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
              CheckboxPainter.reportClientError(1, "MGR1: " + param1, (Throwable) null);
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_12_0 = var4_ref;
            stackIn_12_1 = new StringBuilder().append("ia.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_13_2 = "null";
            } else {
              stackIn_13_2 = "{...}";
            }
            stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw aa.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0) {
        jd var1 = (jd) (BirthDateEntryPanel.field_P.removeLast(param0 - 174));
        if (param0 != 92) {
          field_i = -106;
          if (var1 == null) {
            throw new IllegalStateException();
          }
          SoftwareRasterizer.setTarget(var1.field_t, var1.field_q, var1.field_u);
          SoftwareRasterizer.setClip(var1.field_w, var1.field_v, var1.field_m, var1.field_l);
          var1.field_t = null;
          ValidationIndicator.field_O.addLast(param0 ^ 22065, var1);
          return;
        }
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.setTarget(var1.field_t, var1.field_q, var1.field_u);
        SoftwareRasterizer.setClip(var1.field_w, var1.field_v, var1.field_m, var1.field_l);
        var1.field_t = null;
        ValidationIndicator.field_O.addLast(param0 ^ 22065, var1);
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 >= -74) {
          LinkButtonPainter.releaseStatics(92);
        }
    }

    public LinkButtonPainter() {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        this.font = he.field_d;
    }

    LinkButtonPainter(BitmapFont param0, int param1, int param2) {
        try {
          this.horizontalAlignment = param1;
          this.font = param0;
          this.verticalAlignment = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void drawWidget(UiComponent param0, byte param1, int param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Pixelate.field_H ? 1 : 0;
        try {
          if (!param0.field_D &&
            !param0.containsFocus(true)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.font.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_q + "</u>", param3 + param0.field_z, param0.field_p + param2, param0.field_E, param0.field_C, var6_int, -1, this.horizontalAlignment, this.verticalAlignment, this.font.maxAscent + this.font.maxDescent);
          if (param1 != -124) {
            return;
          }
          if (param0.containsFocus(true)) {
            var7 = this.font.textWidth(param0.field_q);
            var8 = this.font.maxDescent + this.font.maxAscent;
            var9 = param0.field_z + param3;
            if (this.horizontalAlignment != 2) {
              if (1 == this.horizontalAlignment) {
                var9 = var9 + (-var7 + param0.field_E >> 1);
              }
            } else {
              var9 = var9 + (-var7 + param0.field_E);
            }
            var10 = param0.field_p + param2;
            if (this.verticalAlignment != 2) {
              if (this.verticalAlignment == 1) {
                var10 = var10 + (-var8 + param0.field_C >> 1);
              }
            } else {
              var10 = var10 + (param0.field_C - var8);
            }
            ValidatedTextWidget.a(var9 - 2, var10 + 2, (byte) -128, 4 + var7, var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("ia.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_i = 0;
        field_c = new fp();
        field_h = 256;
    }
}
