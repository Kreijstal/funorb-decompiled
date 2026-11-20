/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LayeredButtonRenderer extends TextWidgetStyle {
    static DraggableWidget field_q;
    private LayeredWidgetStyle[] stateStyles;
    static int field_v;
    static float[] field_u;
    private LayeredWidgetStyle defaultStyle;
    static RotatedSpriteSheetAsset field_t;

    final void setStateBorderSprites(Sprite[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (this.stateStyles[var4_int] == null) {
            this.stateStyles[var4_int] = new LayeredWidgetStyle();
          }
          this.stateStyles[param2].borderSprites = param0;
          if (param1 != 6821) {
            this.defaultStyle = (LayeredWidgetStyle) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("ig.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void drawWidget(boolean param0, int param1, int param2, UiWidget param3, int param4) {
        UiWidget stackIn_3_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        LayeredWidgetStyle var7 = null;
        LayeredWidgetStyle var9 = null;
        TextButton var10 = null;
        LayeredWidgetStyle var11 = null;
        LayeredWidgetStyle var12 = null;
        LayeredWidgetStyle var13 = null;
        LayeredWidgetStyle var14 = null;
        try {
          if (!(param3 instanceof TextButton)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (UiWidget) (param3);
          }
          var10 = (TextButton) (stackIn_3_0);
          StereoMusicSample.a(param3.width + (param3.x + param1), param1 + param3.x, param3.height + param3.y + param4, true, param3.y + param4);
          if (var10 != null) {
            param0 = param0 & var10.field_D;
          }
          var7 = this.stateStyles[0];
          this.defaultStyle.reset((byte) -121);
          var7.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
          if (var10 != null) {
            if (var10.field_B) {
              var11 = this.stateStyles[1];
              if (var11 != null) {
                var11.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
              }
            }
            if (var10.hovered) {
              var12 = this.stateStyles[3];
              if (var10.pressedButton != 0 &&
                var12 != null) {
                var12.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
              } else {
                var9 = this.stateStyles[2];
                if (var9 != null) {
                  var9.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
                }
              }
            }
          }
          if (param3.isFocused((byte) -20)) {
            var13 = this.stateStyles[5];
            if (var13 != null) {
              var13.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
            }
          }
          if (!param0) {
            var14 = this.stateStyles[4];
            if (var14 != null) {
              var14.applyTo(this, this.defaultStyle, param4, param1, -28063, param3);
            }
          }
          this.defaultStyle.draw(param3, param4, param1, -1, this);
          if (param2 > -48) {
            field_u = (float[]) null;
          }
          dm.popRasterState((byte) -10);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("ig.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = 29 / ((param0 - 7) / 56);
        field_t = null;
        field_u = null;
        field_q = null;
    }

    LayeredButtonRenderer(LayeredButtonRenderer param0, boolean param1) {
        this();
        try {
          param0.copyTo(this, param1, 119);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ig.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final LayeredWidgetStyle createStateStyle(int param0, int param1) {
        int var3 = 98 % ((-14 - param1) / 45);
        LayeredWidgetStyle dupTemp$0 = new LayeredWidgetStyle();
        this.stateStyles[param0] = dupTemp$0;
        return dupTemp$0;
    }

    final void setBorderSprites(byte param0, Sprite[] param1) {
        LayeredWidgetStyle[] var7 = null;
        int var4 = 0;
        LayeredWidgetStyle var5 = null;
        int var6 = HoldTheLine.field_D;
        try {
          var7 = this.stateStyles;
          LayeredWidgetStyle[] var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.borderSprites = param1;
            }
          }
          if (param0 != -2) {
            field_u = (float[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "ig.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void copyTo(LayeredButtonRenderer param0, boolean param1, int param2) {
        LayeredWidgetStyle dupTemp$0 = null;
        LayeredWidgetStyle stackIn_8_0 = null;
        LayeredWidgetStyle stackIn_9_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        LayeredWidgetStyle var5 = null;
        LayeredWidgetStyle var6 = null;
        int var7 = 0;
        LayeredWidgetStyle var6Lifetime1;
        LayeredWidgetStyle var6Lifetime2;
        int var4_intLifetime1;
        var7 = HoldTheLine.field_D;
        try {
          super.copyTo((byte) -119, param0);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.stateStyles[var4_int];
              var6 = var5;
              var6Lifetime1 = var5;
              if (var5 != null) {
                var6Lifetime2 = param0.stateStyles[var4_int];
                stackIn_8_0 = var5;
                if (var6Lifetime2 != null) {
                  stackIn_9_1 = var6Lifetime2;
                } else {
                  dupTemp$0 = new LayeredWidgetStyle();
                  param0.stateStyles[var4_int] = dupTemp$0;
                  stackIn_9_1 = dupTemp$0;
                }
                ((LayeredWidgetStyle) (Object) stackIn_8_0).copyTo(stackIn_9_1, -1);
              } else {
                param0.stateStyles[var4_int] = null;
              }
            }
          } else {
            ArrayOperations.copyObjects(this.stateStyles, 0, param0.stateStyles, 0, 6);
          }
          var4_intLifetime1 = 62 % ((param2 - 28) / 32);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ig.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void setIcon(Sprite param0, int param1) {
        int var4 = 0;
        LayeredWidgetStyle[] var3 = null;
        LayeredWidgetStyle var5 = null;
        int var6 = 0;
        LayeredWidgetStyle[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = HoldTheLine.field_D;
        try {
          var7 = this.stateStyles;
          var3 = var7;
          for (var4 = param1; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.icon = param0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("ig.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public LayeredButtonRenderer() {
        this.stateStyles = new LayeredWidgetStyle[6];
        this.defaultStyle = new LayeredWidgetStyle();
        LayeredWidgetStyle dupTemp$0 = new LayeredWidgetStyle();
        this.stateStyles[0] = dupTemp$0;
        LayeredWidgetStyle var1 = dupTemp$0;
        var1.reset((byte) -121);
    }

    static {
        field_u = new float[]{0.800000011920929f, 0.8500000238418579f, 0.8999999761581421f, 0.949999988079071f, 1.0f};
    }
}
