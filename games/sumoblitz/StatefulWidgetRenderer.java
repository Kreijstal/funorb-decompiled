/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StatefulWidgetRenderer extends TextWidgetRenderer {
    private WidgetStateStyle compositeStyle;
    static String waitingForExtraDataText;
    static int field_p;
    static int field_n;
    static byte[][] field_o;
    private WidgetStateStyle[] stateStyles;
    static SpriteData[] field_r;

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 != 0) {
          waitingForExtraDataText = (String) null;
        }
        field_o = (byte[][]) null;
        waitingForExtraDataText = null;
    }

    final static String storageRequirementPrompt(boolean progress, boolean score, boolean achievements, byte guard) {
        int var4 = 0;
        if (achievements) {
          var4 += 4;
        }
        if (score) {
          var4 += 2;
        }
        if (guard != 63) {
          field_n = 124;
        }
        if (progress) {
          var4++;
        }
        return IsaacPacketBuffer.field_r[var4];
    }

    StatefulWidgetRenderer(StatefulWidgetRenderer source, boolean deepCopy) {
        this();
        try {
          source.copyLayeredStyleTo(this, deepCopy, -26407);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fl.<init>(" + (source != null ? "{...}" : "null") + ',' + deepCopy + ')');
        }
    }

    public final void renderWidget(UiWidget widget, int parentY, int guard, boolean isEnabled, int parentX) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        WidgetStateStyle var7 = null;
        WidgetStateStyle var9 = null;
        Sprite[] var10 = null;
        InteractiveWidget var11 = null;
        WidgetStateStyle var12 = null;
        WidgetStateStyle var13 = null;
        WidgetStateStyle var14 = null;
        WidgetStateStyle var15 = null;
        try {
          if (!(widget instanceof InteractiveWidget)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (widget);
          }
          var11 = (InteractiveWidget) (stackIn_3_0);
          kw.pushClip(parentY + widget.y + widget.height, parentY + widget.y, 1, parentX + widget.x, widget.x + (parentX + widget.width));
          if (var11 != null) {
            isEnabled = isEnabled & var11.enabled;
          }
          var7 = this.stateStyles[0];
          this.compositeStyle.reset(true);
          var7.applyTo(parentX, widget, -28, this, parentY, this.compositeStyle);
          if (var11 != null) {
            if (var11.selected) {
              var12 = this.stateStyles[1];
              if (var12 != null) {
                var12.applyTo(parentX, widget, -75, this, parentY, this.compositeStyle);
              }
            }
            if (var11.hovered) {
              var13 = this.stateStyles[3];
              if (var11.pressedButton != 0 &&
                var13 != null) {
                var13.applyTo(parentX, widget, guard ^ -5592346, this, parentY, this.compositeStyle);
              } else {
                var9 = this.stateStyles[2];
                if (var9 != null) {
                  var9.applyTo(parentX, widget, -97, this, parentY, this.compositeStyle);
                }
              }
            }
          }
          if (guard != 5592405) {
            var10 = (Sprite[]) null;
            this.setBackgroundSlicesForAllStates((Sprite[]) null, -110);
          }
          if (widget.hasFocus(-1)) {
            var14 = this.stateStyles[5];
            if (var14 != null) {
              var14.applyTo(parentX, widget, guard ^ -5592417, this, parentY, this.compositeStyle);
            }
          }
          if (!isEnabled) {
            var15 = this.stateStyles[4];
            if (var15 != null) {
              var15.applyTo(parentX, widget, -66, this, parentY, this.compositeStyle);
            }
          }
          this.compositeStyle.draw(parentY, this, parentX, -66, widget);
          ClientException.popRasterState((byte) -70);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_34_0 = var6;
          stackIn_34_1 = new StringBuilder().append("fl.A(");
          if (widget == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(parentY).append(',').append(guard).append(',').append(isEnabled).append(',').append(parentX).append(')').toString());
        }
    }

    private final void copyLayeredStyleTo(StatefulWidgetRenderer destination, boolean deepCopy, int guard) {
        int var4_int = 0;
        WidgetStateStyle dupTemp$0 = null;
        WidgetStateStyle stackIn_10_0 = null;
        WidgetStateStyle stackIn_11_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        WidgetStateStyle var5 = null;
        WidgetStateStyle var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          super.copyStyleTo(destination, -123);
          if (guard != -26407) {
            field_p = -38;
          }
          if (deepCopy) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.stateStyles[var4_int];
              if (var5 == null) {
                destination.stateStyles[var4_int] = null;
              } else {
                var6 = destination.stateStyles[var4_int];
                stackIn_10_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new WidgetStateStyle();
                  destination.stateStyles[var4_int] = dupTemp$0;
                  stackIn_11_1 = dupTemp$0;
                } else {
                  stackIn_11_1 = var6;
                }
                ((WidgetStateStyle) (Object) stackIn_10_0).copyTo(stackIn_11_1, (byte) 94);
              }
            }
            return;
          }
          ArrayUtils.copy(this.stateStyles, 0, destination.stateStyles, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("fl.C(");
          if (destination == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(deepCopy).append(',').append(guard).append(')').toString());
        }
    }

    public StatefulWidgetRenderer() {
        this.stateStyles = new WidgetStateStyle[6];
        this.compositeStyle = new WidgetStateStyle();
        WidgetStateStyle dupTemp$0 = new WidgetStateStyle();
        this.stateStyles[0] = dupTemp$0;
        WidgetStateStyle var1 = dupTemp$0;
        var1.reset(true);
    }

    final void setBackgroundSlicesForAllStates(Sprite[] sprites, int guard) {
        int var4 = 0;
        WidgetStateStyle[] var3 = null;
        WidgetStateStyle var5 = null;
        int var6 = 0;
        WidgetStateStyle[] var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7 = this.stateStyles;
          var3 = var7;
          if (guard != 28715) {
            this.createStateStyle(false, 37);
          }
          for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.backgroundSlices = sprites;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("fl.F(");
          if (sprites == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(guard).append(')').toString());
        }
    }

    final void setIconForAllStates(int guard, Sprite icon) {
        int var5 = 0;
        WidgetStateStyle[] var3 = null;
        int var4 = 0;
        WidgetStateStyle var6 = null;
        int var7 = 0;
        WidgetStateStyle[] var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          var8 = this.stateStyles;
          var3 = var8;
          var4 = -50 % ((guard - 68) / 36);
          for (var5 = 0; var5 < var8.length; var5++) {
            var6 = var8[var5];
            if (var6 != null) {
              var6.icon = icon;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("fl.D(").append(guard).append(',');
          if (icon == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final WidgetStateStyle createStateStyle(boolean guard, int stateIndex) {
        if (guard) {
          Sprite[] var4 = (Sprite[]) null;
          this.setStateBackgroundSlices((byte) -126, (Sprite[]) null, -97);
        }
        WidgetStateStyle dupTemp$0 = new WidgetStateStyle();
        this.stateStyles[stateIndex] = dupTemp$0;
        return dupTemp$0;
    }

    final void setStateBackgroundSlices(byte guard, Sprite[] sprites, int stateIndex) {
        int var4_int = 0;
        int var4_intLifetime1;
        try {
          var4_int = stateIndex;
          if (null == this.stateStyles[var4_int]) {
            this.stateStyles[var4_int] = new WidgetStateStyle();
          }
          this.stateStyles[stateIndex].backgroundSlices = sprites;
          var4_intLifetime1 = -9 % ((guard - 57) / 52);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "fl.G(" + guard + ',' + (sprites != null ? "{...}" : "null") + ',' + stateIndex + ')');
        }
    }

    static {
        waitingForExtraDataText = "Waiting for extra data";
        field_n = 0;
        field_p = -1;
    }
}
