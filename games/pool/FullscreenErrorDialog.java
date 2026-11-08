/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenErrorDialog extends ResizableDialog implements ButtonActivationListener {
    static String playerX2HaveWon;
    static String tickerHintSetPower;
    static int field_ib;
    static int field_hb;
    private ButtonWidget closeButton;
    static boolean field_kb;

    private final void hideFullscreenError(byte param0) {
        if (!this.dialogOpen) {
          return;
        }
        this.dialogOpen = false;
        if (param0 != -59) {
          playerX2HaveWon = (String) null;
        }
    }

    final static boolean readBooleanBit(byte param0, CipherPacketBuffer param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 118) {
            FullscreenErrorDialog.releaseStatics((byte) 80);
          }
          stackIn_5_0 = (param1.readBits(1, 63) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("gk.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    FullscreenErrorDialog(DialogLayer param0, he param1) {
        super(param0, 200, 150);
        Object var3 = null;
        UiWidget var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != ic.field_c) {
            if (AchievementsScreen.field_K == param1) {
              var3 = QuickChatPhraseRegistry.fsFocus;
              this.widgetHeight = this.widgetHeight + 10;
              if (je.b((byte) 124)) {
                this.widgetHeight = this.widgetHeight + 20;
                var3 = HuffmanCodec.fsFocusOrResolution;
              }
            } else {
              if (param1 == ModernTableScene.field_eb) {
                var3 = DebugTuningSupport.fsTimeout;
                this.widgetHeight = this.widgetHeight + 30;
              }
            }
          } else {
            var3 = ValidationIconWidget.fsUnavailableTrySignedApplet;
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.widgetHeight = 80;
          var4.widgetX = 0;
          var4.widgetY = 50;
          var4.widgetWidth = this.widgetWidth;
          var4.renderer = (WidgetPainter) ((Object) new TextWidgetPainter(PoolUiText.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(true, var4);
          this.closeButton = this.appendFullscreenDialogButton(2391, DirectByteStorage.fsButtonClose, (WidgetListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gk.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -44) {
          FullscreenErrorDialog.releaseStatics((byte) -8);
          playerX2HaveWon = null;
          tickerHintSetPower = null;
          return;
        }
        playerX2HaveWon = null;
        tickerHintSetPower = null;
    }

    private final ButtonWidget appendFullscreenDialogButton(int param0, String param1, WidgetListener param2) {
        ButtonWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ButtonWidget stackIn_2_0 = null;
        ButtonWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ButtonWidget(param1, param2);
          var4.renderer = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var5 = -6 + this.widgetHeight;
          this.widgetHeight = this.widgetHeight + 38;
          var4.setWidgetBounds(-14 + this.widgetWidth - 16, 15, 30, false, var5);
          if (param0 != 2391) {
            stackIn_2_0 = (ButtonWidget) null;
            return stackIn_2_0;
          }
          this.addChild(true, var4);
          this.refreshLayout((byte) -126);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("gk.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 == this.closeButton) {
            this.hideFullscreenError((byte) -59);
          }
          if (param0) {
            return;
          }
          tickerHintSetPower = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("gk.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        tickerHintSetPower = "Use the mouse wheel <img=1>, drag <img=11><img=0>, or <img=7>/<img=8>, or <img=12>/<img=14> to set the power.";
        playerX2HaveWon = "<%0> and <%1> have won!";
        field_kb = true;
    }
}
