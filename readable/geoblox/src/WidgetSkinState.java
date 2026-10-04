/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetSkinState {
    Sprite[] panelSprites;
    private int textAlpha;
    static ValidationState field_n;
    private int textShadowColor;
    private boolean flushBeforeOverlay;
    private int textColor;
    private int offsetY;
    static String[] field_i;
    Sprite icon;
    private int offsetX;
    static boolean archiveUseControlOpcode2;
    static ValidationState field_m;
    static int field_j;
    static ClientFlowToken usernameQueryFlowState;

    final static String a(String param0, int param1, String param2, ResourceArchive param3) {
        RuntimeException var4 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.ensureIndexLoaded(param1 ^ param1)) {
            stackIn_4_0 = param2 + " - " + param3.getLoadProgress((byte) 110) + "%";
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) (param0);
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("si.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final WidgetSkinState a(int param0, int param1) {
        this.offsetY = param1;
        if (param0 != 0) {
            return (WidgetSkinState) null;
        }
        return (WidgetSkinState) (this);
    }

    final WidgetSkinState b(int param0, int param1) {
        this.textColor = param1;
        if (param0 != 256) {
            return (WidgetSkinState) null;
        }
        return (WidgetSkinState) (this);
    }

    final WidgetSkinState a(boolean param0, byte param1) {
        this.flushBeforeOverlay = param0 ? true : false;
        if (param1 != 73) {
            WidgetSkinState.a(false);
            return (WidgetSkinState) (this);
        }
        return (WidgetSkinState) (this);
    }

    final void a(StatefulWidgetRenderer param0, int param1, int param2, UiWidget param3, int param4) {
        BitmapFont stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_24_5 = 0;
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
          DelayedIncomingPacket.drawNineSlicePanel(param3.widgetY + param2, param1 + param3.widgetX, param3.widgetHeight, (byte) -92, param3.widgetWidth, this.panelSprites);
          if (this.icon != null) {
            var6_int = this.offsetX + (param3.widgetX + param1);
            var7 = this.offsetY + param2 + param3.widgetY;
            if (param0.field_g == 1) {
              var6_int = var6_int + (-this.icon.fullWidth + param3.widgetWidth) / 2;
            }
            if (2 == param0.field_g) {
              var6_int = var6_int + (-this.icon.fullWidth + param3.widgetWidth);
            }
            if (param0.field_i == 1) {
              var7 = var7 + (param3.widgetHeight - this.icon.fullHeight) / 2;
            }
            if (2 == param0.field_i) {
              var7 = var7 + (-this.icon.fullHeight + param3.widgetHeight);
            }
            this.icon.draw(var6_int, var7);
          }
          if (param4 != 0) {
            field_n = (ValidationState) null;
          }
          var6 = param0.c(120, param3);
          if ((var6 != null) &&
              (null != param0.field_n)) {
            if (this.textColor < 0) {
              return;
            }
            stackIn_20_0 = param0.field_n;
            stackIn_20_1 = var6;
            if (this.offsetX != -2147483648) {
              stackIn_21_2 = this.offsetX;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_23_2 = stackIn_21_2 + param0.field_e + param3.widgetX + param1;
            stackIn_23_3 = param0.field_m;
            stackIn_23_4 = param3.widgetY + param2;
            if (this.offsetY == -2147483648) {
              stackIn_24_5 = 0;
            } else {
              stackIn_24_5 = this.offsetY;
            }
            stackIn_26_3 = stackIn_23_3 + (stackIn_23_4 + stackIn_24_5);
            stackIn_26_4 = -param0.field_e + param3.widgetWidth - param0.field_j;
            stackIn_26_5 = -param0.field_b + (-param0.field_m + param3.widgetHeight);
            stackIn_26_6 = this.textColor;
            stackIn_26_7 = this.textShadowColor;
            if (this.textAlpha != -2147483648) {
              stackIn_27_8 = this.textAlpha;
            } else {
              stackIn_27_8 = 256;
            }
            ((BitmapFont) (Object) stackIn_20_0).drawParagraphAlpha(stackIn_20_1, stackIn_23_2, stackIn_26_3, stackIn_26_4, stackIn_26_5, stackIn_26_6, stackIn_26_7, stackIn_27_8, param0.field_g, param0.field_i, param0.field_f);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_31_0 = var6_ref;
          stackIn_31_1 = new StringBuilder().append("si.B(");
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param4).append(')').toString());
        }
    }

    final WidgetSkinState a(byte param0, int param1) {
        this.textShadowColor = param1;
        if (param0 != 16) {
            return (WidgetSkinState) null;
        }
        return (WidgetSkinState) (this);
    }

    final WidgetSkinState b(byte param0, int param1) {
        this.offsetX = param1;
        if (param0 != -53) {
            this.flushBeforeOverlay = true;
            return (WidgetSkinState) (this);
        }
        return (WidgetSkinState) (this);
    }

    public static void a(boolean param0) {
        field_i = null;
        field_m = null;
        usernameQueryFlowState = null;
        if (param0) {
            archiveUseControlOpcode2 = true;
            field_n = null;
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, WidgetSkinState param2, StatefulWidgetRenderer param3, int param4, UiWidget param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.flushBeforeOverlay) {
            param2.a(param3, param0, param1, param5, 0);
            param2.a((byte) -8);
          }
          if (param4 != -16566) {
            return;
          }
          if (this.offsetY != -2147483648) {
            param2.offsetY = this.offsetY;
          }
          if (this.textShadowColor >= -1) {
            param2.textShadowColor = this.textShadowColor;
          }
          if (this.textAlpha != -2147483648) {
            param2.textAlpha = this.textAlpha;
          }
          if (null != this.panelSprites) {
            param2.panelSprites = this.panelSprites;
          }
          if (null != this.icon) {
            param2.icon = this.icon;
          }
          if (this.textColor >= -1) {
            param2.textColor = this.textColor;
          }
          if (this.offsetX == -2147483648) {
            return;
          }
          param2.offsetX = this.offsetX;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("si.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void a(int param0, WidgetSkinState param1) {
        try {
            param1.textColor = this.textColor;
            if (param0 != 2) {
                Sprite[] var4 = (Sprite[]) null;
                this.a((Sprite[]) null, true);
            }
            param1.textAlpha = this.textAlpha;
            param1.offsetX = this.offsetX;
            param1.panelSprites = this.panelSprites;
            param1.icon = this.icon;
            param1.flushBeforeOverlay = this.flushBeforeOverlay;
            param1.offsetY = this.offsetY;
            param1.textShadowColor = this.textShadowColor;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "si.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final WidgetSkinState a(Sprite[] param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            this.a((byte) 66, -18);
          }
          this.panelSprites = param0;
          return (WidgetSkinState) (this);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("si.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        this.panelSprites = null;
        this.icon = null;
        this.textShadowColor = -1;
        this.offsetX = 0;
        this.textAlpha = 256;
        int var2 = 108 / ((57 - param0) / 46);
        this.offsetY = 0;
        this.textColor = 0;
    }

    WidgetSkinState() {
        this.panelSprites = null;
        this.textShadowColor = -2;
        this.textAlpha = -2147483648;
        this.flushBeforeOverlay = false;
        this.textColor = -2;
        this.offsetY = -2147483648;
        this.icon = null;
        this.offsetX = -2147483648;
    }

    static {
        field_n = new ValidationState();
        field_m = new ValidationState();
        field_j = 5167632;
    }
}
