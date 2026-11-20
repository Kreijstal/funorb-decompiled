/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LayeredWidgetStyle {
    private int textColor;
    private int offsetX;
    static int field_d;
    private boolean field_f;
    private int shadowColor;
    private int alpha;
    Sprite[] borderSprites;
    static float field_e;
    Sprite icon;
    static SpriteAsset[] field_c;
    static Sprite field_i;
    private int offsetY;

    final void copyTo(LayeredWidgetStyle param0, int param1) {
        try {
          param0.borderSprites = this.borderSprites;
          param0.alpha = this.alpha;
          param0.offsetY = this.offsetY;
          param0.offsetX = this.offsetX;
          param0.field_f = this.field_f;
          param0.textColor = this.textColor;
          if (param1 != -1) {
            this.setTextColor(88, -100);
          }
          param0.shadowColor = this.shadowColor;
          param0.icon = this.icon;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nj.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final LayeredWidgetStyle setTextColor(int param0, int param1) {
        this.textColor = param0;
        if (param1 != -26228) {
          this.setOffsetX(39, 17);
          return this;
        }
        return this;
    }

    final static void handleNameAvailabilityResponse(int param0, int param1, String[] param2, String param3) {
        int var5 = 0;
        String[] var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          NineSliceSpriteFactory.field_b = ValidationState.field_c;
          if (255 != param1) {
            if (100 > param1) {
              RaceVehicle.field_U = ChatMessage.createNameAvailabilityResult(param3, 256, param1);
            } else {
              if (param1 <= 105) {
                var4 = param2;
                WhirlpoolTables.setNameSuggestions((byte) 102, var4);
                RaceVehicle.field_U = ArchiveRequest.createNameSuggestionsResult(param2, (byte) 123);
              } else {
                RaceVehicle.field_U = ChatMessage.createNameAvailabilityResult(param3, 256, param1);
              }
            }
          } else {
            stackIn_5_0 = !(ResizableDialog.field_V >= 13);
            RaceVehicle.field_U = TextFieldRenderer.createRestrictedNameResult(stackIn_5_0, 0);
            var6 = (String[]) null;
            WhirlpoolTables.setNameSuggestions((byte) 71, (String[]) null);
          }
          if (param0 == 256) {
            return;
          }
          LayeredWidgetStyle.clearSharedReferences(58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_17_0 = var4_ref;
          stackIn_17_1 = new StringBuilder().append("nj.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void applyTo(LayeredButtonRenderer param0, LayeredWidgetStyle param1, int param2, int param3, int param4, UiWidget param5) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_f) {
            param1.draw(param5, param2, param3, -1, param0);
            param1.reset((byte) -121);
          }
          if (this.offsetX != -2147483648) {
            param1.offsetX = this.offsetX;
          }
          if (param4 != -28063) {
            field_e = -1.5048772096633911f;
          }
          if (this.offsetY != -2147483648) {
            param1.offsetY = this.offsetY;
          }
          if (this.borderSprites != null) {
            param1.borderSprites = this.borderSprites;
          }
          if (-1 <= this.textColor) {
            param1.textColor = this.textColor;
          }
          if (-2147483648 != this.alpha) {
            param1.alpha = this.alpha;
          }
          if (null != this.icon) {
            param1.icon = this.icon;
          }
          if (this.shadowColor < -1) {
            return;
          }
          param1.shadowColor = this.shadowColor;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("nj.K(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final LayeredWidgetStyle setOffsetY(int param0, boolean param1) {
        this.offsetY = param0;
        if (!param1) {
          return (LayeredWidgetStyle) null;
        }
        return this;
    }

    final LayeredWidgetStyle setBorderSprites(int param0, Sprite[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.borderSprites = param1;
          if (param0 != 29536) {
            this.reset((byte) 115);
          }
          return this;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("nj.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final LayeredWidgetStyle setOffsetX(int param0, int param1) {
        this.offsetX = param0;
        if (param1 > -115) {
          return (LayeredWidgetStyle) null;
        }
        return this;
    }

    final LayeredWidgetStyle setFlushBeforeApply(boolean param0, int param1) {
        if (param1 == -2147483648) {
          this.field_f = param0 ? true : false;
          return this;
        }
        String var4 = (String) null;
        LayeredWidgetStyle.handleNameAvailabilityResponse(33, -24, (String[]) null, (String) null);
        this.field_f = param0 ? true : false;
        return this;
    }

    final void reset(byte param0) {
        this.offsetY = 0;
        this.borderSprites = null;
        this.shadowColor = -1;
        this.textColor = 0;
        if (param0 == -121) {
          this.icon = null;
          this.alpha = 256;
          this.offsetX = 0;
          return;
        }
    }

    final void draw(UiWidget param0, int param1, int param2, int param3, LayeredButtonRenderer param4) {
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
        try {
          InheritedWidgetStyle.drawNineSlice(this.borderSprites, param0.height, true, param0.width, param2 + param0.x, param1 + param0.y);
          if (null != this.icon) {
            var6_int = param2 + param0.x + this.offsetX;
            var7 = this.offsetY + param0.y + param1;
            if (param4.field_i == 1) {
              var6_int = var6_int + (-this.icon.canvasWidth + param0.width) / 2;
            }
            if (param4.field_d == 1) {
              var7 = var7 + (-this.icon.canvasHeight + param0.height) / 2;
            }
            if (param4.field_i == 2) {
              var6_int = var6_int + (param0.width - this.icon.canvasWidth);
            }
            if (2 == param4.field_d) {
              var7 = var7 + (-this.icon.canvasHeight + param0.height);
            }
            this.icon.draw(var6_int, var7);
          }
          if (param3 != -1) {
            return;
          }
          var6 = param4.getDisplayText(param0, (byte) -15);
          if (var6 != null &&
            null != param4.field_f &&
            this.textColor >= 0) {
            stackIn_20_0 = param4.field_f;
            stackIn_20_1 = var6;
            if (this.offsetX == -2147483648) {
              stackIn_21_2 = 0;
            } else {
              stackIn_21_2 = this.offsetX;
            }
            stackIn_23_2 = stackIn_21_2 + param4.field_j + param0.x + param2;
            if (this.offsetY != -2147483648) {
              stackIn_24_3 = this.offsetY;
            } else {
              stackIn_24_3 = 0;
            }
            stackIn_26_3 = stackIn_24_3 + param4.field_p + (param0.y + param1);
            stackIn_26_4 = -param4.field_n + (-param4.field_j + param0.width);
            stackIn_26_5 = -param4.field_e + param0.height - param4.field_p;
            stackIn_26_6 = this.textColor;
            stackIn_26_7 = this.shadowColor;
            if (this.alpha == -2147483648) {
              stackIn_27_8 = 256;
            } else {
              stackIn_27_8 = this.alpha;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraph(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param4.field_i, param4.field_d, param4.field_h);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("nj.B(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        field_i = null;
        field_c = null;
        if (param0 < 55) {
          field_c = (SpriteAsset[]) null;
        }
    }

    LayeredWidgetStyle() {
        this.shadowColor = -2;
        this.offsetX = -2147483648;
        this.field_f = false;
        this.borderSprites = null;
        this.alpha = -2147483648;
        this.textColor = -2;
        this.icon = null;
        this.offsetY = -2147483648;
    }

    final LayeredWidgetStyle setShadowColor(int param0, boolean param1) {
        this.shadowColor = param0;
        if (param1) {
          return (LayeredWidgetStyle) null;
        }
        return this;
    }

    static {
    }
}
