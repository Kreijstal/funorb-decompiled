/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends WidgetContainer implements UsernameSuggestionListener, ButtonActionListener {
    private ValidatedTextWidget field_D;
    UsernameSuggestionPanel field_F;
    private TextButton field_G;
    private TextButton field_E;

    private final void submitName(int param0) {
        if (param0 != 55) {
          return;
        }
        if (!this.canSubmit((byte) 97)) {
          return;
        }
        LoginPanel.startLoginAs(this.field_D.field_n, (byte) -124);
    }

    private final boolean canSubmit(byte param0) {
        if (!this.isInputValid((byte) 43, (ValidationProvider) (this.field_D))) {
          return false;
        }
        if (param0 >= 65) {
          return true;
        }
        UiWidget var3 = (UiWidget) null;
        int discarded$0 = this.addFieldWithHelpDefaultWidth(-116, (String) null, (String) null, true, 30, (UiWidget) null);
        return true;
    }

    final boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, 127)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.focusPreviousChild(2, param0);
            return stackIn_7_0;
          }
          var5_int = -115 / ((param3 + 75) / 36);
          if (param2 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(-16234, param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("wk.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int addFieldWithHelpDefaultWidth(int param0, String param1, String param2, boolean param3, int param4, UiWidget param5) {
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
          if (!param3) {
            this.field_F = (UsernameSuggestionPanel) null;
          }
          stackIn_3_0 = this.addFieldWithHelp(param2, param0, param1, -7815, param5, param4, 35);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("wk.B(").append(param0).append(',');
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
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final boolean isInputValid(byte param0, ValidationProvider param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        AudioSetupHelpers var4 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationSource(param0 ^ -44);
          if (var3 == null) {
            return true;
          }
          if (param0 != 43) {
            this.field_D = (ValidatedTextWidget) null;
          }
          var4 = var3.getValidationState(-22243);
          stackIn_8_0 = (CachedTextLayout.field_i == var4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12085) {
            return;
          }
          if (this.field_G == param1) {
            RenderTargetHelpers.openLoginForm(256);
            return;
          }
          if (this.field_E != param1) {
            return;
          }
          this.submitName(55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("wk.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetListener) null);
        this.field_D = new ValidatedTextWidget("", (UiListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(Js5Transport.arezzo12Font, 0, 0, 0, 0, 16777215, -1, 3, 0, PlayerContextMenu.arezzo14Font.field_H, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(GameKeyHandler.field_e, var1, (UiListener) null);
        this.field_E = new TextButton(ChatPanelSetupHelpers.field_a, (UiListener) null);
        this.field_G = new TextButton(TextMetricsGlobals.field_g, (UiListener) null);
        this.field_D.field_h = ChatFilterHelpers.field_c;
        this.field_D.setValidationSource(new UsernameAvailabilityValidator(this.field_D), (byte) 127);
        this.field_E.field_C = false;
        this.field_E.listener = (WidgetListener) ((Object) new ThreeSliceButtonPainter());
        this.field_G.listener = (WidgetListener) ((Object) new LinkTextPainter());
        this.field_D.listener = (WidgetListener) ((Object) new TextFieldPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.setBounds(50, true, var3, 20, 270);
        var3 += 50;
        this.addChild(var2, (byte) -78);
        var3 = var3 + (5 + this.addFieldWithHelpDefaultWidth(var3, AudioPumpThread.field_g, LoginCredentialType.field_f, true, 170, this.field_D));
        this.field_E.setBounds(40, true, var3, -var5 + 496 >> 1, var5);
        this.field_G.setBounds(40, true, var3 + 15, var4 + 3, 60);
        this.field_G.field_o = (UiListener) (this);
        this.field_E.field_o = (UiListener) (this);
        this.addChild((UiWidget) (this.field_E), (byte) -78);
        this.addChild((UiWidget) (this.field_G), (byte) -78);
        this.field_F = new UsernameSuggestionPanel((UsernameSuggestionListener) (this));
        this.field_F.setBounds(150, true, 20, this.field_D.field_l + this.field_D.field_g + 60, -this.field_D.field_g + this.field_g - this.field_D.field_l - 60);
        this.addChild((UiWidget) (this.field_F), (byte) -78);
        this.setBounds(55 + var3 + var4, true, 0, 0, 496);
    }

    public final void onMoreSuggestionsRequested(byte param0) {
        int discarded$0 = 0;
        ((UsernameAvailabilityValidator) (this.field_D.getValidationSource(-1))).clearCachedName(false);
        if (param0 != -72) {
          UiWidget var3 = (UiWidget) null;
          discarded$0 = this.addFieldWithHelp((String) null, 56, (String) null, -1, (UiWidget) null, 112, 84);
        }
    }

    private final int addFieldWithHelp(String param0, int param1, String param2, int param3, UiWidget param4, int param5, int param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
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
          if (param3 != -7815) {
            this.handleKeyInput((UiWidget) null, 'ﾴ', 84, -110);
          }
          var10 = new LabeledChildWidget(20, param1, param5 + 120, 25, param4, false, 120, 3, PlayerContextMenu.arezzo14Font, 16777215, param2);
          this.addChild((UiWidget) (var10), (byte) -78);
          var9 = new ValidationMessageWidget(((ValidationProvider) ((Object) param4)).getValidationSource(-1), param0, 126, var10.field_m + param1, 25 + param5, param6);
          var9.field_o = (UiListener) (this);
          this.addChild((UiWidget) (var9), (byte) -78);
          stackIn_3_0 = var10.field_m + var9.field_m;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("wk.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
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
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public final void onSuggestionSelected(String param0, boolean param1) {
        ValidatedTextWidget var3 = null;
        String var4 = null;
        try {
          var3 = this.field_D;
          var4 = param0;
          ((EditableTextWidget) ((Object) var3)).setText(var4, 81, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "wk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointer(param0, 127, param2, param3);
          this.field_E.field_C = this.canSubmit((byte) 117);
          if (param1 <= 113) {
            this.field_G = (TextButton) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "wk.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
