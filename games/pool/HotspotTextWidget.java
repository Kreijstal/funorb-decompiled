/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends ButtonWidget {
    private IntrusiveDeque hotspotBounds;
    private String[] hotspotHoverTexts;
    private HotspotRectangle hoveredHotspot;

    void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.hoveredHotspot = null;
          if (this.pointerInside) {
            var5_int = -this.widgetX - param2 + ReflectionReplySupport.field_i;
            var6 = -this.widgetY + (-param3 + DebouncedValidationProvider.field_f);
            this.hoveredHotspot = this.findHotspot(var6, var5_int, -31244);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("mh.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void setWidgetBounds(int param0, int param1, int param2, boolean param3, int param4) {
        super.setWidgetBounds(param0, param1, param2, param3, param4);
        if (param3) {
          return;
        }
        this.rebuildHotspotBounds((byte) 28);
    }

    boolean requestKeyboardFocus(UiWidget param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -107 / ((param1 + 43) / 47);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mh.M(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Pool.field_O;
        try {
          SoftwareRasterizer.drawHorizontalLine(param0, param1, 1 + param3, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param0, param1 + param2, 1 + param3, 12105912);
          var5_int = 1;
          var6 = param2;
          if (SoftwareRasterizer.clipTop > var5_int + param1) {
            var5_int = -param1 + SoftwareRasterizer.clipTop;
          }
          if (param1 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = SoftwareRasterizer.clipBottom - param1;
          }
          for (var7 = var5_int; var7 < var6; var7++) {
            var8 = 152 + 48 * var7 / param2;
            var9 = var8 << 8 | var8 << 16 | var8;
            SoftwareRasterizer.pixels[SoftwareRasterizer.width * (var7 + param1) + param0] = var9;
            SoftwareRasterizer.pixels[(param1 + var7) * SoftwareRasterizer.width + param0 + param3] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "mh.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void rebuildHotspotBounds(byte param0) {
        int var12 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        WidgetTextLayout var4;
        TextLayout var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        Object var11;
        TextLineLayout var13;
        int var14;
        int var15;
        HotspotRectangle var16;
        int var8Lifetime1;
        var2 = -46 / ((param0 + 35) / 50);
        this.hotspotBounds = new IntrusiveDeque();
        var3 = 0;
        var4 = (WidgetTextLayout) ((Object) this.renderer);
        var5 = var4.ensureTextLayout(0, (UiWidget) (this));
        while (true) {
          var6 = this.widgetText.indexOf("<hotspot=", var3);
          if (-1 == var6) {
            return;
          }
          var8 = this.widgetText.indexOf(">", var6);
          var7 = this.widgetText.substring(var6 + 9, var8);
          var8Lifetime1 = Integer.parseInt(var7);
          var3 = this.widgetText.indexOf("</hotspot>", var6);
          var9 = var5.lineOfCaret(var6, 0);
          var10 = var5.lineOfCaret(var3, 0);
          var11 = null;
          for (var12 = var9; var12 <= var10; var12++) {
            var13 = var5.field_b[var12];
            if (var9 != var12) {
              stackIn_7_0 = var13.caretXs[0];
            } else {
              stackIn_7_0 = var5.caretX(var6, (byte) -73);
            }
            var14 = stackIn_7_0;
            if (var10 != var12) {
              if (var13 != null) {
                stackIn_12_0 = var13.caretXs[-1 + var13.caretXs.length];
              } else {
                stackIn_12_0 = 0;
              }
            } else {
              stackIn_12_0 = var5.caretX(var3, (byte) -104);
            }
            var15 = stackIn_12_0;
            var16 = new HotspotRectangle(var8Lifetime1, var14, var13.top, var15 - var14, Math.max(var4.lineHeight(-10492), var13.bottom - var13.top));
            if (var11 != null) {
              ((HotspotRectangle) (var11)).field_l = var16;
            }
            this.hotspotBounds.addFirst((byte) 82, var16);
            var11 = var16;
          }
        }
    }

    void renderWidget(int param0, byte param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        super.renderWidget(param0, (byte) 50, param2, param3);
        int var5 = -21 % ((param1 + 42) / 53);
        if (param0 != 0) {
          return;
        }
        WidgetTextLayout var6 = (WidgetTextLayout) ((Object) this.renderer);
        HotspotRectangle var7 = this.hoveredHotspot;
        if (var7 == null) {
        } else {
          var8 = var6.textLeft(5286, (UiWidget) (this), param2);
          var9 = var6.textTop(param3, (UiWidget) (this), (byte) -7);
          do {
            LookupQuery.drawDottedRectangle(var9 + var7.field_p - 2, var7.field_q + 2, 2 + var7.field_w, var7.field_n + (var8 - 2), 2187);
            var7 = var7.field_l;
          } while (var7 != null);
        }
    }

    String getHoverText(int param0) {
        if (null == this.hoveredHotspot) {
          return null;
        }
        if (this.hotspotHoverTexts == null) {
          return null;
        }
        if (this.hotspotHoverTexts.length <= this.hoveredHotspot.field_s) {
          return null;
        }
        if (param0 > -10) {
          return (String) null;
        }
        return this.hotspotHoverTexts[this.hoveredHotspot.field_s];
    }

    private final HotspotRectangle findHotspot(int param0, int param1, int param2) {
        HotspotRectangle var5 = null;
        int var6 = Pool.field_O;
        HotspotRectangle var4 = (HotspotRectangle) (this.hotspotBounds.last((byte) -21));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param1 >= var5.field_n && param0 >= var5.field_p && param1 < var5.field_n + var5.field_w &&
              !(param0 > var5.field_q + var5.field_p)) {
              return var4;
            }
            var5 = var5.field_l;
          }
          var4 = (HotspotRectangle) (this.hotspotBounds.previous((byte) -5));
        }
        if (param2 == -31244) {
          return null;
        }
        return (HotspotRectangle) null;
    }

    final void activateButton(int param0, int param1, int param2, int param3) {
        super.activateButton(param0, param1, param2, param3);
        int var5 = param1 - this.widgetX;
        int var6 = -this.widgetY + param2;
        HotspotRectangle var7 = this.findHotspot(var6, var5, param0 - 31260);
        if (var7 != null &&
          null != this.listener) {
          ((HotspotActivationListener) ((Object) this.listener)).onHotspotActivated(param3, this, param0 - 12163, var7.field_s);
        }
    }

    final void fitTextBounds(int param0, int param1, int param2, int param3) {
        int var5 = -72 / ((param3 + 62) / 41);
        this.setWidgetBounds(param2, param0, ((WidgetTextLayout) ((Object) this.renderer)).preferredHeight(1, (UiWidget) (this)), false, param1);
    }

    HotspotTextWidget(String param0, WidgetPainter param1) {
        super(param0, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
          this.renderer = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setHotspotHoverText(byte param0, String param1, int param2) {
        String[] var5 = null;
        int var6 = 0;
        int var7 = Pool.field_O;
        try {
          int var4_int = -75 % ((param0 + 66) / 49);
          if (null == this.hotspotHoverTexts ||
            this.hotspotHoverTexts.length <= param2) {
            var5 = new String[1 + param2];
            if (this.hotspotHoverTexts != null) {
              for (var6 = 0; var6 < this.hotspotHoverTexts.length; var6++) {
                var5[var6] = this.hotspotHoverTexts[var6];
              }
            }
            this.hotspotHoverTexts = var5;
          }
          this.hotspotHoverTexts[param2] = param1;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mh.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
