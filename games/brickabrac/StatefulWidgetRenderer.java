/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetRenderer extends TextWidgetRenderer {
    static RgbSprite[] jungleCentreSprites;
    static tq field_v;
    private WidgetPaintStyle mergedStyle;
    private WidgetPaintStyle[] stylesByState;
    static String field_x;
    static RgbSprite field_w;
    static int field_z;

    final void setStateFrameSprites(boolean obfuscationGuard, int stateIndex, RgbSprite[] sprites) {
        int slotIndex = 0;
        if (!obfuscationGuard) {
          return;
        }
        try {
          slotIndex = stateIndex;
          if (null == this.stylesByState[slotIndex]) {
            this.stylesByState[slotIndex] = new WidgetPaintStyle();
          }
          this.stylesByState[stateIndex].frameSprites = sprites;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "up.FA(" + obfuscationGuard + ',' + stateIndex + ',' + (sprites != null ? "{...}" : "null") + ')');
        }
    }

    private final void copyStatefulRendererTo(boolean obfuscationGuard, StatefulWidgetRenderer target, boolean copyStateStyles) {
        int var4_int = 0;
        WidgetPaintStyle dupTemp$0 = null;
        WidgetPaintStyle stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        WidgetPaintStyle stackIn_14_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetPaintStyle var5 = null;
        WidgetPaintStyle var6 = null;
        int var7 = 0;
        RgbSprite var8 = null;
        WidgetPaintStyle var6Lifetime1;
        WidgetPaintStyle var6Lifetime2;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          super.copyStyleTo(-35, target);
          if (!obfuscationGuard) {
            var8 = (RgbSprite) null;
            this.setAllIcons(54, (RgbSprite) null);
          }
          if (copyStateStyles) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.stylesByState[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = target.stylesByState[var4_int];
                stackIn_10_0 = var5;
                stackIn_11_1 = !(obfuscationGuard);
                if (var6Lifetime2 != null) {
                  stackIn_14_2 = var6Lifetime2;
                } else {
                  dupTemp$0 = new WidgetPaintStyle();
                  target.stylesByState[var4_int] = dupTemp$0;
                  stackIn_14_2 = dupTemp$0;
                }
                ((WidgetPaintStyle) (Object) stackIn_10_0).copyPaintStyleTo(stackIn_11_1, stackIn_14_2);
              } else {
                target.stylesByState[var4_int] = null;
              }
            }
            return;
          }
          ArrayOperations.copy(this.stylesByState, 0, target.stylesByState, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("up.HA(").append(obfuscationGuard).append(',');
          if (target == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(copyStateStyles).append(')').toString());
        }
    }

    final void setAllFrameSprites(RgbSprite[] sprites, boolean obfuscationGuard) {
        int stateIndex = 0;
        WidgetPaintStyle[] var3 = null;
        WidgetPaintStyle style = null;
        int var6 = 0;
        WidgetPaintStyle[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard) {
            field_x = (String) null;
          }
          var7 = this.stylesByState;
          var3 = var7;
          for (stateIndex = 0; stateIndex < var7.length; stateIndex++) {
            style = var7[stateIndex];
            if (style != null) {
              style.frameSprites = sprites;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("up.GA(");
          if (sprites == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        Widget stackIn_5_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetPaintStyle normalStyle = null;
        WidgetPaintStyle hoverStyle = null;
        FocusableWidget focusableWidget = null;
        WidgetPaintStyle activeStyle = null;
        WidgetPaintStyle pressedStyle = null;
        WidgetPaintStyle focusedStyle = null;
        WidgetPaintStyle disabledStyle = null;
        try {
          if (callbackGuard != -20618) {
            StatefulWidgetRenderer.b(62);
          }
          if (!(widget instanceof FocusableWidget)) {
            stackIn_5_0 = null;
          } else {
            stackIn_5_0 = (Widget) (widget);
          }
          focusableWidget = (FocusableWidget) (stackIn_5_0);
          MovingBody.a((byte) 106, widget.width + widget.x + parentX, parentX + widget.x, parentY + widget.y, parentY + widget.y + widget.height);
          if (focusableWidget != null) {
            obfuscationGuard = obfuscationGuard & focusableWidget.enabled;
          }
          normalStyle = this.stylesByState[0];
          this.mergedStyle.resetPaintStyle(-2147483648);
          normalStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
          if (focusableWidget != null) {
            if (focusableWidget.active) {
              activeStyle = this.stylesByState[1];
              if (activeStyle != null) {
                activeStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
              }
            }
            if (focusableWidget.mouseOver) {
              pressedStyle = this.stylesByState[3];
              if (focusableWidget.pressedButton != 0 &&
                pressedStyle != null) {
                pressedStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
              } else {
                hoverStyle = this.stylesByState[2];
                if (hoverStyle != null) {
                  hoverStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
                }
              }
            }
          }
          if (widget.isFocused(-76)) {
            focusedStyle = this.stylesByState[5];
            if (focusedStyle != null) {
              focusedStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
            }
          }
          if (!obfuscationGuard) {
            disabledStyle = this.stylesByState[4];
            if (disabledStyle != null) {
              disabledStyle.mergeInto(this.mergedStyle, 2147483647, this, widget, parentX, parentY);
            }
          }
          this.mergedStyle.paintStyle(parentY, this, widget, (byte) -109, parentX);
          sc.popRaster(callbackGuard ^ 20704);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("up.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(parentY).append(')').toString());
        }
    }

    StatefulWidgetRenderer(StatefulWidgetRenderer source, boolean copyStateStyles) {
        this();
        try {
          source.copyStatefulRendererTo(true, this, copyStateStyles);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "up.<init>(" + (source != null ? "{...}" : "null") + ',' + copyStateStyles + ')');
        }
    }

    public static void b(int param0) {
        field_w = null;
        if (param0 != 3) {
          StatefulWidgetRenderer.b(20);
        }
        field_x = null;
        field_v = null;
        jungleCentreSprites = null;
    }

    final WidgetPaintStyle replaceStateStyle(int stateIndex, int obfuscationGuard) {
        if (obfuscationGuard <= 102) {
          return (WidgetPaintStyle) null;
        }
        WidgetPaintStyle dupTemp$0 = new WidgetPaintStyle();
        this.stylesByState[stateIndex] = dupTemp$0;
        return dupTemp$0;
    }

    public StatefulWidgetRenderer() {
        this.stylesByState = new WidgetPaintStyle[6];
        this.mergedStyle = new WidgetPaintStyle();
        WidgetPaintStyle dupTemp$0 = new WidgetPaintStyle();
        this.stylesByState[0] = dupTemp$0;
        WidgetPaintStyle var1 = dupTemp$0;
        var1.resetPaintStyle(-2147483648);
    }

    final void setAllIcons(int obfuscationGuard, RgbSprite icon) {
        int var4 = 0;
        WidgetPaintStyle[] var3 = null;
        WidgetPaintStyle var5 = null;
        int var6 = 0;
        WidgetPaintStyle[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -1553) {
            field_v = (tq) null;
          }
          var7 = this.stylesByState;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.icon = icon;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("up.CA(").append(obfuscationGuard).append(',');
          if (icon == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_x = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_v = new tq();
    }
}
