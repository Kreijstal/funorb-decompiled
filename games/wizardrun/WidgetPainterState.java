/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetPainterState {
    private int offsetY;
    Sprite[] frame;
    static long field_g;
    private int shadowColor;
    private int alpha;
    static boolean field_d;
    private boolean drawBaseFirst;
    Sprite icon;
    private int offsetX;
    private int textColor;

    final WidgetPainterState setDrawBaseFirst(int param0, boolean param1) {
        int var3 = 23 / ((param0 - 58) / 49);
        this.drawBaseFirst = param1 ? true : false;
        return this;
    }

    final WidgetPainterState setOffsetY(byte param0, int param1) {
        this.offsetY = param1;
        if (param0 >= -121) {
          this.setTextColor(116, 12);
          return this;
        }
        return this;
    }

    final WidgetPainterState setShadowColor(int param0, byte param1) {
        if (param1 != 105) {
          return (WidgetPainterState) null;
        }
        this.shadowColor = param0;
        return this;
    }

    final WidgetPainterState setTextColor(int param0, int param1) {
        this.textColor = param1;
        int var3 = -10 / ((param0 - 54) / 43);
        return this;
    }

    final WidgetPainterState setOffsetX(byte param0, int param1) {
        this.offsetX = param1;
        if (param0 >= -83) {
          return (WidgetPainterState) null;
        }
        return this;
    }

    final WidgetPainterState setFrame(int param0, Sprite[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 55) {
            this.setOffsetX((byte) -5, -10);
          }
          this.frame = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("la.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void reset(int param0) {
        this.frame = null;
        this.textColor = 0;
        this.icon = null;
        this.offsetX = 0;
        this.offsetY = param0;
        this.shadowColor = -1;
        this.alpha = 256;
    }

    final void copyTo(WidgetPainterState param0, byte param1) {
        try {
          param0.alpha = this.alpha;
          param0.textColor = this.textColor;
          param0.shadowColor = this.shadowColor;
          param0.offsetX = this.offsetX;
          if (param1 >= -2) {
            Sprite[] var4 = (Sprite[]) null;
            this.setFrame(-37, (Sprite[]) null);
          }
          param0.icon = this.icon;
          param0.drawBaseFirst = this.drawBaseFirst;
          param0.frame = this.frame;
          param0.offsetY = this.offsetY;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "la.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawState(UiWidget param0, boolean param1, int param2, StatefulWidgetPainter param3, int param4) {
        BitmapFont stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_26_3;
        int stackIn_26_4;
        int stackIn_26_5;
        int stackIn_26_6;
        int stackIn_26_7;
        int stackIn_27_8;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        StatefulWidgetPainter var8 = null;
        try {
          if (param1) {
            var8 = (StatefulWidgetPainter) null;
            this.applyToState(41, 36, -40, (UiWidget) null, (WidgetPainterState) null, (StatefulWidgetPainter) null);
          }
          CacheEntry.drawNineSliceFrame(this.frame, param4 + param0.x, (byte) -110, param0.height, param0.width, param2 + param0.y);
          if (this.icon != null) {
            var6_int = this.offsetX + (param4 + param0.x);
            if (param3.field_l == 1) {
              var6_int = var6_int + (-this.icon.fullWidth + param0.width) / 2;
            }
            var7 = param2 + (param0.y + this.offsetY);
            if (param3.field_l == 2) {
              var6_int = var6_int + (-this.icon.fullWidth + param0.width);
            }
            if (param3.field_a == 1) {
              var7 = var7 + (-this.icon.fullHeight + param0.height) / 2;
            }
            if (param3.field_a == 2) {
              var7 = var7 + (-this.icon.fullHeight + param0.height);
            }
            this.icon.drawTransparent(var6_int, var7);
          }
          var6 = param3.getDisplayText(param0, (byte) -57);
          if (var6 != null &&
            param3.field_k != null &&
            this.textColor >= 0) {
            stackIn_20_0 = param3.field_k;
            stackIn_20_1 = var6;
            if (this.offsetX != -2147483648) {
              stackIn_21_2 = this.offsetX;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_23_2 = stackIn_21_2 + param3.field_n + (param4 + param0.x);
            if (this.offsetY != -2147483648) {
              stackIn_24_3 = this.offsetY;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + (param3.field_b + (param0.y + param2));
            stackIn_26_4 = -param3.field_n + (param0.width - param3.field_h);
            stackIn_26_5 = -param3.field_b + param0.height - param3.field_j;
            stackIn_26_6 = this.textColor;
            stackIn_26_7 = this.shadowColor;
            if (this.alpha != -2147483648) {
              stackIn_27_8 = this.alpha;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param3.field_l, param3.field_a, param3.field_d);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("la.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final void applyToState(int param0, int param1, int param2, UiWidget param3, WidgetPainterState param4, StatefulWidgetPainter param5) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.drawBaseFirst) {
            param4.drawState(param3, false, param0, param5, param2);
            param4.reset(0);
          }
          if (param1 < 72) {
            this.offsetY = 76;
          }
          if (this.icon != null) {
            param4.icon = this.icon;
          }
          if (this.textColor >= -1) {
            param4.textColor = this.textColor;
          }
          if (null != this.frame) {
            param4.frame = this.frame;
          }
          if (this.offsetY != -2147483648) {
            param4.offsetY = this.offsetY;
          }
          if (this.shadowColor >= -1) {
            param4.shadowColor = this.shadowColor;
          }
          if (this.offsetX != -2147483648) {
            param4.offsetX = this.offsetX;
          }
          if (this.alpha == -2147483648) {
            return;
          }
          param4.alpha = this.alpha;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("la.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    WidgetPainterState() {
        this.frame = null;
        this.alpha = -2147483648;
        this.drawBaseFirst = false;
        this.offsetY = -2147483648;
        this.icon = null;
        this.shadowColor = -2;
        this.offsetX = -2147483648;
        this.textColor = -2;
    }

    static {
        field_d = true;
    }
}
