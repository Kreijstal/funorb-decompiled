/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNamePanel extends WidgetContainer implements UsernameSuggestionListener, ButtonActivationListener {
    static String fsAcceptAfteraccept;
    private ButtonWidget okButton;
    private ga displayNameInput;
    static int field_V;
    static ee field_N;
    static Sprite field_T;
    private ButtonWidget cancelButton;
    static eg field_P;
    UsernameSuggestionsPanel suggestionsPanel;
    static String removeignorefirst;

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return;
          }
          if (this.cancelButton == param3) {
            mb.b(3);
            return;
          }
          if (this.okButton != param3) {
            return;
          }
          this.submitDisplayName(-123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jp.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(String param0, String param1, int param2, int param3, UiWidget param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 != -17870) {
            removeignorefirst = (String) null;
          }
          stackIn_3_0 = this.a(param3, param1, param4, 35, param0, 101, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("jp.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onSuggestionSelected(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        try {
          if (param1 != 35) {
            field_N = (ee) null;
          }
          var3 = this.displayNameInput;
          var4 = param0;
          ((TextInputWidget) ((Object) var3)).setInputText((byte) -124, false, var4);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jp.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        field_N = null;
        field_T = null;
        removeignorefirst = null;
        if (!param0) {
          fsAcceptAfteraccept = null;
          field_P = null;
          return;
        }
        field_V = 80;
        fsAcceptAfteraccept = null;
        field_P = null;
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.okButton.enabled = this.isNameValid(-23086);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "jp.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_7_0 = this.requestPreviousChildFocus(param3, 3);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_10_0 = this.requestNextChildFocus(param3, 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("jp.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final boolean isInputValid(int param0, ValidationProviderSource param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationProvider(91);
          if (var3 == null) {
            return true;
          }
          if (param0 != 60) {
            this.cancelButton = (ButtonWidget) null;
          }
          var4 = var3.getDebouncedValidationState(-31873);
          stackIn_8_0 = (var4 == ProxySocketConnector.field_e);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("jp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void submitDisplayName(int param0) {
        int discarded$0 = 0;
        if (this.isNameValid(-23086)) {
          qi.a(87, this.displayNameInput.widgetText);
          if (param0 >= -104) {
            String var3 = (String) null;
            discarded$0 = this.a(-86, (String) null, (UiWidget) null, -74, (String) null, -122, 47);
          }
          return;
        }
    }

    public DisplayNamePanel() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.displayNameInput = new ga("", (WidgetListener) null, 12);
        am var1 = new am(PoolUiText.field_a, 0, 0, 0, 0, 16777215, -1, 3, 0, ValidationIconWidget.field_O.maxAscent, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(ij.loginNoDisplayname, var1, (WidgetListener) null);
        this.okButton = new ButtonWidget(wn.ok, (WidgetListener) null);
        this.cancelButton = new ButtonWidget(be.cancel, (WidgetListener) null);
        this.displayNameInput.hoverText = sg.createDisplaynameTooltip;
        this.displayNameInput.a((byte) -111, new UsernameAvailabilityValidator(this.displayNameInput));
        this.okButton.enabled = false;
        this.okButton.renderer = (WidgetPainter) ((Object) new ng());
        this.cancelButton.renderer = (WidgetPainter) ((Object) new pd());
        this.displayNameInput.renderer = (WidgetPainter) ((Object) new om(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setWidgetBounds(270, 20, 50, false, var3);
        this.addChild(true, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(KillerBallSkin.createDisplayname, se.createDisplaynameHint, 170, var3, this.displayNameInput, -17870));
        this.okButton.setWidgetBounds(var5, -var5 + 496 >> 1, 40, false, var3);
        this.cancelButton.setWidgetBounds(60, 3 + var4, 40, false, var3 + 15);
        this.cancelButton.listener = (WidgetListener) (this);
        this.okButton.listener = (WidgetListener) (this);
        this.addChild(true, this.okButton);
        this.addChild(true, this.cancelButton);
        this.suggestionsPanel = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.suggestionsPanel.setWidgetBounds(-60 + (-this.displayNameInput.widgetX + this.widgetWidth) - this.displayNameInput.widgetWidth, this.displayNameInput.widgetX + (this.displayNameInput.widgetWidth + 60), 150, false, 20);
        this.addChild(true, this.suggestionsPanel);
        this.setWidgetBounds(496, 0, var4 + 55 + var3, false, 0);
    }

    final static Sprite a(int param0, byte param1, di param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        Sprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vj.a(param3, param2, param0, (byte) 121)) {
            stackIn_2_0 = null;
            return (Sprite) (stackIn_2_0);
          }
          if (param1 <= 12) {
            DisplayNamePanel.a(true);
          }
          stackIn_6_0 = ContentTransitionDialog.j((byte) -104);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("jp.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(int param0) {
        if (param0 == 16777215) {
          ((UsernameAvailabilityValidator) (this.displayNameInput.getValidationProvider(95))).invalidateCachedUsernameAvailability(param0 - 16777197);
          return;
        }
        UiWidget var3 = (UiWidget) null;
        this.updatePointerState((UiWidget) null, -124, -55, 87);
        ((UsernameAvailabilityValidator) (this.displayNameInput.getValidationProvider(95))).invalidateCachedUsernameAvailability(param0 - 16777197);
    }

    private final boolean isNameValid(int param0) {
        if (param0 == -23086) {
          return this.isInputValid(60, this.displayNameInput) ? true : false;
        }
        ButtonWidget var3 = (ButtonWidget) null;
        this.onButtonActivated(true, 119, 35, (ButtonWidget) null, -96);
        if (!this.isInputValid(60, this.displayNameInput)) {
          return false;
        }
        return true;
    }

    private final int a(int param0, String param1, UiWidget param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
        ck var9 = null;
        LabeledChildWidget var10 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new LabeledChildWidget(20, param0, param6 + 120, 25, param2, false, 120, 3, ValidationIconWidget.field_O, 16777215, param4);
          this.addChild(true, var10);
          var9 = new ck(((ValidationProviderSource) ((Object) param2)).getValidationProvider(-75), param1, 126, param0 + var10.widgetHeight, 25 + param6, param3);
          var9.listener = (WidgetListener) (this);
          this.addChild(true, var9);
          if (param5 <= 67) {
            removeignorefirst = (String) null;
          }
          stackIn_3_0 = var10.widgetHeight + var9.widgetHeight;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("jp.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    static {
        fsAcceptAfteraccept = "to keep fullscreen or";
        removeignorefirst = "Please remove <%0> from your ignore list first.";
    }
}
