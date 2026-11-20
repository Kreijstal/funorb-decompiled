/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiVisualStyle {
    private int textAlpha;
    private int offsetX;
    Sprite[] backgroundSprites;
    Sprite foregroundSprite;
    private int textShadowColor;
    private boolean drawPreviousLayer;
    private int offsetY;
    static String field_a;
    static int field_c;
    private int textColor;

    final void copyTo(byte param0, UiVisualStyle param1) {
        try {
          param1.backgroundSprites = this.backgroundSprites;
          param1.textAlpha = this.textAlpha;
          param1.offsetX = this.offsetX;
          param1.textShadowColor = this.textShadowColor;
          param1.textColor = this.textColor;
          param1.offsetY = this.offsetY;
          int var3_int = 52 / ((param0 - 30) / 45);
          param1.foregroundSprite = this.foregroundSprite;
          param1.drawPreviousLayer = this.drawPreviousLayer;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vv.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final UiVisualStyle setOffsetX(int param0, int param1) {
        int var3 = 107 / ((0 - param0) / 45);
        this.offsetX = param1;
        return this;
    }

    final void draw(UiStatefulStyle param0, boolean param1, int param2, UiComponent param3, int param4) {
        BitmapFont stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_24_2;
        int stackIn_24_3;
        int stackIn_24_4;
        int stackIn_24_5;
        int stackIn_25_6 = 0;
        int stackIn_27_3;
        int stackIn_27_4;
        int stackIn_27_5;
        int stackIn_27_6;
        int stackIn_27_7;
        int stackIn_28_8;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        try {
          NanosecondClock.drawNineSlice(3, param3.height, param3.width, param4 + param3.y, this.backgroundSprites, param2 + param3.x);
          if (this.foregroundSprite != null) {
            var6_int = this.offsetX + (param2 + param3.x);
            if (param0.horizontalAlignment == 1) {
              var6_int = var6_int + (-this.foregroundSprite.paddedWidth + param3.width) / 2;
            }
            var7 = this.offsetY + (param4 + param3.y);
            if (2 == param0.horizontalAlignment) {
              var6_int = var6_int + (-this.foregroundSprite.paddedWidth + param3.width);
            }
            if (param0.verticalAlignment == 1) {
              var7 = var7 + (-this.foregroundSprite.paddedHeight + param3.height) / 2;
            }
            if (param0.verticalAlignment == 2) {
              var7 = var7 + (param3.height - this.foregroundSprite.paddedHeight);
            }
            this.foregroundSprite.draw(var6_int, var7);
          }
          if (param1) {
            return;
          }
          var6 = param0.getDisplayText((byte) -110, param3);
          if (var6 != null &&
            null != param0.font &&
            this.textColor >= 0) {
            stackIn_21_0 = param0.font;
            stackIn_21_1 = var6;
            if (this.offsetX != -2147483648) {
              stackIn_22_2 = this.offsetX;
            } else {
              stackIn_22_2 = 0;
            }
            stackIn_24_2 = stackIn_22_2 + param0.paddingLeft + (param2 + param3.x);
            stackIn_24_3 = param4;
            stackIn_24_4 = param3.y;
            stackIn_24_5 = -param0.paddingTop;
            if (-2147483648 != this.offsetY) {
              stackIn_25_6 = this.offsetY;
            } else {
              stackIn_25_6 = 0;
            }
            stackIn_27_3 = stackIn_24_3 + (stackIn_24_4 - (stackIn_24_5 - stackIn_25_6));
            stackIn_27_4 = param3.width - param0.paddingLeft - param0.paddingRight;
            stackIn_27_5 = -param0.paddingTop + (param3.height - param0.paddingBottom);
            stackIn_27_6 = this.textColor;
            stackIn_27_7 = this.textShadowColor;
            if (-2147483648 != this.textAlpha) {
              stackIn_28_8 = this.textAlpha;
            } else {
              stackIn_28_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_21_0).drawParagraph(stackIn_21_1, stackIn_24_2, stackIn_27_3, stackIn_27_4, stackIn_27_5, stackIn_27_6, stackIn_27_7, stackIn_28_8, param0.horizontalAlignment, param0.verticalAlignment, param0.lineSpacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_32_0 = var6_ref;
          stackIn_32_1 = new StringBuilder().append("vv.H(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 24358) {
          UiVisualStyle.clearSharedReferences(-6);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final void applyLayer(UiVisualStyle param0, int param1, UiComponent param2, int param3, int param4, UiStatefulStyle param5) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (param4 != -2879) {
            this.offsetY = 100;
          }
          if (this.drawPreviousLayer) {
            param0.draw(param5, false, param1, param2, param3);
            param0.reset(param4 ^ -2887);
          }
          if (this.offsetY != -2147483648) {
            param0.offsetY = this.offsetY;
          }
          if (-1 <= this.textShadowColor) {
            param0.textShadowColor = this.textShadowColor;
          }
          if (-2147483648 != this.textAlpha) {
            param0.textAlpha = this.textAlpha;
          }
          if (null != this.backgroundSprites) {
            param0.backgroundSprites = this.backgroundSprites;
          }
          if (null != this.foregroundSprite) {
            param0.foregroundSprite = this.foregroundSprite;
          }
          if (-2147483648 != this.offsetX) {
            param0.offsetX = this.offsetX;
          }
          if (this.textColor < -1) {
            return;
          }
          param0.textColor = this.textColor;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("vv.J(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final UiVisualStyle setTextColor(int param0, int param1) {
        if (param1 != -2147483648) {
          this.backgroundSprites = (Sprite[]) null;
          this.textColor = param0;
          return this;
        }
        this.textColor = param0;
        return this;
    }

    final UiVisualStyle setBackgroundSprites(boolean param0, Sprite[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.setOffsetX(77, 70);
          }
          this.backgroundSprites = param1;
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vv.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final UiVisualStyle setTextShadowColor(int param0, int param1) {
        this.textShadowColor = param0;
        if (param1 != -2147483648) {
          this.setTextColor(-117, 101);
          return this;
        }
        return this;
    }

    final UiVisualStyle setOffsetY(int param0, boolean param1) {
        if (!param1) {
          this.offsetY = param0;
          return this;
        }
        UiComponent var4 = (UiComponent) null;
        this.draw((UiStatefulStyle) null, false, 1, (UiComponent) null, -23);
        this.offsetY = param0;
        return this;
    }

    final UiVisualStyle setDrawPreviousLayer(int param0, boolean param1) {
        this.drawPreviousLayer = param1 ? true : false;
        if (param0 > -121) {
          return (UiVisualStyle) null;
        }
        return this;
    }

    final void reset(int param0) {
        this.textShadowColor = -1;
        if (param0 == 120) {
          this.offsetX = 0;
          this.offsetY = 0;
          this.backgroundSprites = null;
          this.textAlpha = 256;
          this.foregroundSprite = null;
          this.textColor = 0;
          return;
        }
        this.setOffsetX(-14, 114);
        this.offsetX = 0;
        this.offsetY = 0;
        this.backgroundSprites = null;
        this.textAlpha = 256;
        this.foregroundSprite = null;
        this.textColor = 0;
    }

    UiVisualStyle() {
        this.backgroundSprites = null;
        this.textShadowColor = -2;
        this.drawPreviousLayer = false;
        this.textAlpha = -2147483648;
        this.offsetY = -2147483648;
        this.foregroundSprite = null;
        this.offsetX = -2147483648;
        this.textColor = -2;
    }

    static {
        field_a = "Only show lobby chat from my friends";
        field_c = 120;
    }
}
