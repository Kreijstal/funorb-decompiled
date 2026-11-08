/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Under13NoticePanel extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener {
    private ButtonWidget continueButton;
    static boolean field_T;
    static String rule13;
    static UiComponent field_Q;
    private AccountCreationDialog owner;
    static String playerIsGroupName;
    static String orbpointsColon;
    static ResourceArchive field_R;
    static String muXRemoved;
    private HotspotTextWidget termsText;

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.continueButton == param3) {
            NineSliceFrame.a((byte) 41);
            this.owner.dismissDialog(17);
          }
          if (param0) {
            return;
          }
          orbpointsColon = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("sd.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1) {
        int var2;
        int var3;
        var3 = Pool.field_O;
        rl.field_e = 0;
        dq.field_h = null;
        AudioService.field_c = null;
        var2 = na.field_a;
        na.field_a = wn.field_h;
        if (param1 == 51) {
          GameRules.field_c.field_a = 2;
        } else {
          if (param1 != 50) {
            GameRules.field_c.field_a = 1;
          } else {
            GameRules.field_c.field_a = 5;
          }
        }
        wn.field_h = var2;
        GameRules.field_c.field_e = GameRules.field_c.field_e + 1;
        if (GameRules.field_c.field_e >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (GameRules.field_c.field_e >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (param0) {
          Under13NoticePanel.a(true, 78);
        }
        if (GameRules.field_c.field_e >= 4) {
          return 1;
        }
        return -1;
    }

    private final String h(byte param0) {
        if (param0 != 44) {
          HotspotTextWidget var3 = (HotspotTextWidget) null;
          this.onHotspotActivated(-53, (HotspotTextWidget) null, 58, -28);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public static void releaseStatics(int param0) {
        orbpointsColon = null;
        playerIsGroupName = null;
        rule13 = null;
        int var1 = 6 % ((param0 - 67) / 52);
        field_Q = null;
        field_R = null;
        muXRemoved = null;
    }

    Under13NoticePanel(AccountCreationDialog param0) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        String var7 = null;
        int var3 = 0;
        TextWidgetPainter var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.owner = param0;
          this.continueButton = new ButtonWidget(WeightedLruCache.cont, (WidgetListener) null);
          this.continueButton.renderer = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var7 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.h((byte) 44), this.g((byte) 99)}, -1, NodeHashTableIterator.createU13terms);
          var3 = 20;
          var4 = new TextWidgetPainter(ValidationIconWidget.field_O, 0, 0, 0, 0, 16777215, -1, 3, 0, ValidationIconWidget.field_O.maxAscent, -1, 2147483647, true);
          this.termsText = new HotspotTextWidget(var7, var4);
          this.termsText.hoverText = "";
          this.termsText.setHotspotHoverText((byte) 68, DelegatingCanvas.openinpopupwindow, 0);
          this.termsText.setHotspotHoverText((byte) 66, DelegatingCanvas.openinpopupwindow, 1);
          this.termsText.widgetWidth = -40 + this.widgetWidth;
          this.termsText.listener = (WidgetListener) (this);
          this.termsText.fitTextBounds(26, var3, this.widgetWidth - 40, -119);
          var3 = var3 + (15 + this.termsText.widgetHeight);
          this.addChild(true, this.termsText);
          var5 = 4;
          var6 = 200;
          this.continueButton.setWidgetBounds(var6, 300 - var6 >> 1, 40, false, var3);
          this.continueButton.listener = (WidgetListener) (this);
          this.addChild(true, this.continueButton);
          this.setWidgetBounds(300, 0, 55 + (var3 + var5), false, 0);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onHotspotActivated(int param0, HotspotTextWidget param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          if (param2 != -12147) {
            Under13NoticePanel.a(true, -93);
          }
          if (0 == param3) {
            DebugTuningSlider.a("terms.ws", -128);
            return;
          }
          if (1 == param3) {
            DebugTuningSlider.a("privacy.ws", -127);
            return;
          }
          if (param3 != 2) {
            return;
          }
          DebugTuningSlider.a("conduct.ws", -127);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("sd.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String g(byte param0) {
        int var2 = 117 % ((26 - param0) / 55);
        return "</col></u>";
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.requestPreviousChildFocus(param3, 3);
            return stackIn_6_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_9_0 = this.requestNextChildFocus(param3, 0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("sd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        muXRemoved = "<%0> has been removed.";
        playerIsGroupName = "<%0> is <%2>!";
        orbpointsColon = "Orb points: ";
        rule13 = "Offensive account name";
    }
}
