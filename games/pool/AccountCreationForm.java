/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener, UsernameSuggestionListener {
    private ga displayNameInput;
    private ga emailInput;
    private HotspotTextWidget termsText;
    UsernameSuggestionsPanel suggestionsPanel;
    private ButtonWidget backButton;
    private ButtonWidget createButton;
    private ga passwordConfirmInput;
    static IntrusiveDeque field_S;
    private ga emailConfirmInput;
    private CheckboxWidget newsOptInCheckbox;
    private ga ageInput;
    private ga passwordInput;
    static IndexedSprite[] field_Z;
    static int field_T;
    static long field_Q;
    static String playerYouX2HaveWon;
    static Sprite[] field_V;

    private final int a(String param0, UiWidget param1, int param2, int param3, String param4, int param5, byte param6) {
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
          if (param6 > -10) {
            this.backButton = (ButtonWidget) null;
          }
          var10 = new LabeledChildWidget(20, param5, param3 + 120, 25, param1, false, 120, 3, ValidationIconWidget.field_O, 16777215, param0);
          this.addChild(true, var10);
          var9 = new ck(((ValidationProviderSource) ((Object) param1)).getValidationProvider(70), param4, 126, param5 + var10.widgetHeight, param3 + 50, param2);
          var9.listener = (WidgetListener) (this);
          this.addChild(true, var9);
          stackIn_3_0 = var9.widgetHeight + var10.widgetHeight;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("nf.I(");
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
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.requestPreviousChildFocus(param3, 3);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.requestNextChildFocus(param3, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("nf.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        CipherPacketBuffer var3 = JaggrabDownloader.field_j;
        var3.writeCipheredOpcode(false, param2);
        var3.writeByte(3, !param1 ? true : false);
        var3.writeByte(9, !param1 ? true : false);
        if (param1) {
          var3.writeShort((byte) -81, param0);
          return;
        }
        AccountCreationForm.g((byte) 125);
        var3.writeShort((byte) -81, param0);
    }

    public final void onMoreSuggestionsRequested(int param0) {
        if (param0 == 16777215) {
          ((UsernameAvailabilityValidator) (this.displayNameInput.getValidationProvider(-91))).invalidateCachedUsernameAvailability(18);
          return;
        }
        String discarded$0 = this.j(24);
        ((UsernameAvailabilityValidator) (this.displayNameInput.getValidationProvider(-91))).invalidateCachedUsernameAvailability(18);
    }

    private final int a(String param0, byte param1, int param2, int param3, UiWidget param4) {
        int discarded$1 = 0;
        RuntimeException var6 = null;
        ValidationIconWidget var7 = null;
        String var8 = null;
        LabeledChildWidget var9 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = new LabeledChildWidget(20, param3, 120 + param2, 25, param4, false, 120, 3, ValidationIconWidget.field_O, 16777215, param0);
          if (param1 != -114) {
            var8 = (String) null;
            discarded$1 = this.a((String) null, (UiWidget) null, -45, 100, (String) null, 17, (byte) -12);
          }
          this.addChild(true, var9);
          var7 = new ValidationIconWidget(((ValidationProviderSource) ((Object) param4)).getValidationProvider(-14));
          this.addChild(true, var7);
          var7.setWidgetBounds(15, 3 + (var9.widgetX + var9.widgetWidth), 15, false, (-15 + var9.widgetHeight >> 1) + var9.widgetY);
          stackIn_3_0 = var9.widgetHeight;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("nf.N(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    private final boolean isInputValid(byte param0, ValidationProviderSource param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        na var4 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationProvider(101);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getDebouncedValidationState(-31873);
          if (gp.field_d == var4) {
            return false;
          }
          if (ji.field_h == var4) {
            return false;
          }
          if (ReportAbuseDialog.field_Pb == var4) {
            return false;
          }
          if (param0 != -3) {
            AccountCreationForm.releaseStatics((byte) -49);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("nf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void onHotspotActivated(int param0, HotspotTextWidget param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pool.field_O;
        try {
          if (param2 != -12147) {
            field_V = (Sprite[]) null;
          }
          if (param3 == 0) {
            DebugTuningSlider.a("terms.ws", -127);
            return;
          }
          if (param3 == 1) {
            DebugTuningSlider.a("privacy.ws", param2 + 12020);
            return;
          }
          if (param3 != 2) {
            return;
          }
          DebugTuningSlider.a("conduct.ws", param2 ^ 12044);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("nf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final int a(byte param0, UiWidget param1, int param2, int param3, String param4) {
        LabeledChildWidget var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new LabeledChildWidget(20, param2, param3 + 120, 25, param1, false, 120, 3, ValidationIconWidget.field_O, 16777215, param4);
          if (param0 != 44) {
            stackIn_2_0 = 118;
            return stackIn_2_0;
          }
          this.addChild(true, var6);
          stackIn_4_0 = var6.widgetHeight;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("nf.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.createButton.enabled = this.areAllInputsValid(3);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nf.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static UiComponent g(byte param0) {
        if (param0 != 103) {
          field_S = (IntrusiveDeque) null;
          return DualLinkDeque.field_f.content;
        }
        return DualLinkDeque.field_f.content;
    }

    private final int addLabeledFieldWithDefaultMessageWidth(int param0, String param1, UiWidget param2, String param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 35) {
            stackIn_4_0 = this.a(param1, param2, 35, param4, param3, param5, (byte) -36);
            return stackIn_4_0;
          }
          stackIn_2_0 = 48;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("nf.DA(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final boolean areAllInputsValid(int param0) {
        if (!this.isInputValid((byte) -3, this.displayNameInput)) {
          return false;
        }
        if (!this.isInputValid((byte) -3, this.emailInput)) {
          return false;
        }
        if (!this.isInputValid((byte) -3, this.emailConfirmInput)) {
          return false;
        }
        if (!this.isInputValid((byte) -3, this.passwordInput)) {
          return false;
        }
        if (!this.isInputValid((byte) -3, this.passwordConfirmInput)) {
          return false;
        }
        if (!this.isInputValid((byte) -3, this.ageInput)) {
          return false;
        }
        if (param0 == 3) {
          return true;
        }
        return false;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        String var7 = null;
        try {
          if (param3 == this.backButton) {
            FullscreenFocusCanvas.a(true);
          } else {
            if (param3 == this.createButton) {
              discarded$1 = this.submitAccountCreation(127);
            }
          }
          if (param0) {
            return;
          }
          var7 = (String) null;
          this.onSuggestionSelected((String) null, -73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("nf.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 != 4) {
          return;
        }
        field_S = null;
        field_Z = null;
        field_V = null;
        playerYouX2HaveWon = null;
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.displayNameInput = new ga("", (WidgetListener) null, 12);
        this.emailInput = new ga("", (WidgetListener) null, 100);
        this.emailConfirmInput = new ga("", (WidgetListener) null, 100);
        this.passwordInput = new ga("", (WidgetListener) null, 20);
        this.passwordConfirmInput = new ga("", (WidgetListener) null, 20);
        this.ageInput = new ga("", (WidgetListener) null, 3);
        int var1 = 1;
        this.newsOptInCheckbox = new CheckboxWidget("", (WidgetListener) null, var1 != 0);
        this.createButton = new ButtonWidget(SpriteState.create, (WidgetListener) null);
        this.backButton = new ButtonWidget(ValidationIconWidget.goback, (WidgetListener) null);
        this.displayNameInput.hoverText = ThemeSelectScreen.createDisplaynameTooltip;
        this.emailInput.hoverText = CheckboxWidget.createEmailTooltip;
        this.emailConfirmInput.hoverText = wp.createEmailConfirmTooltip;
        this.passwordInput.hoverText = kc.createPasswordTooltip;
        this.passwordConfirmInput.hoverText = ii.createPasswordConfirmTooltip;
        this.ageInput.hoverText = PoolMatchController.createAgeTooltip;
        this.newsOptInCheckbox.hoverText = LoginForm.createOptinNewsTooltip;
        this.displayNameInput.a((byte) -111, new UsernameAvailabilityValidator(this.displayNameInput));
        this.emailInput.a((byte) -111, new EmailValidator(this.emailInput));
        this.emailConfirmInput.a((byte) -111, new EmailAvailabilityValidator(this.emailConfirmInput, this.emailInput));
        this.passwordInput.a((byte) -111, new PasswordValidator(this.passwordInput, this.displayNameInput, this.emailInput));
        this.passwordConfirmInput.a((byte) -111, new MatchingTextValidator(this.passwordConfirmInput, this.passwordInput));
        this.ageInput.a((byte) -111, new AgeValidator(this.ageInput));
        this.createButton.enabled = false;
        this.createButton.renderer = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.backButton.renderer = (WidgetPainter) ((Object) new LinkButtonPainter());
        this.displayNameInput.renderer = (WidgetPainter) ((Object) new om(10000536));
        om dupTemp$0 = new om(10000536);
        this.emailConfirmInput.renderer = (WidgetPainter) ((Object) dupTemp$0);
        this.emailInput.renderer = (WidgetPainter) ((Object) dupTemp$0);
        this.ageInput.renderer = (WidgetPainter) ((Object) new om(10000536));
        this.newsOptInCheckbox.renderer = (WidgetPainter) ((Object) new ButtonPainter());
        sm dupTemp$1 = new sm(10000536);
        this.passwordConfirmInput.renderer = (WidgetPainter) ((Object) dupTemp$1);
        this.passwordInput.renderer = (WidgetPainter) ((Object) dupTemp$1);
        String var2 = AccountWelcomePanel.substituteTemplateArguments(new String[]{this.j(0), this.i(11579568)}, -1, ArchiveProvider.createAgreeterms);
        int var3 = 20;
        var3 = var3 + this.a((byte) 44, this.emailInput, var3, 170, ThreeSliceButtonPainter.createEmail);
        var3 = var3 + (5 + this.a(lo.createEmailConfirm, this.emailConfirmInput, 20, 170, "", var3, (byte) -76));
        var3 = var3 + this.a((byte) 44, this.passwordInput, var3, 170, PolarBallSkin.createPassword);
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultMessageWidth(35, e.createPasswordConfirm, this.passwordConfirmInput, AimTarget.createPasswordHint, 170, var3));
        var3 = var3 + (5 + this.addLabeledFieldWithDefaultMessageWidth(35, KillerBallSkin.createDisplayname, this.displayNameInput, LongAndTextLoginPayload.createDisplaynameHint, 170, var3));
        var3 = var3 + this.a(MusicPatch.createAge, (byte) -114, 170, var3, this.ageInput);
        LabeledChildWidget var4 = new LabeledChildWidget(46, var3, -90 + this.widgetWidth, 25, this.newsOptInCheckbox, true, -120 + this.widgetWidth, 5, PoolUiText.field_a, 11579568, ab.createOptinNews);
        this.addChild(true, var4);
        var3 = var3 + var4.widgetHeight;
        TextWidgetPainter var5 = new TextWidgetPainter(ValidationIconWidget.field_O, 0, 0, 0, 0, 16777215, -1, 0, 0, ValidationIconWidget.field_O.maxAscent, -1, 2147483647, true);
        this.termsText = new HotspotTextWidget(var2, var5);
        this.termsText.hoverText = "";
        this.termsText.setHotspotHoverText((byte) 73, DelegatingCanvas.openinpopupwindow, 0);
        this.termsText.setHotspotHoverText((byte) 117, DelegatingCanvas.openinpopupwindow, 1);
        this.termsText.listener = (WidgetListener) (this);
        this.termsText.fitTextBounds(46, var3, -90 + this.widgetWidth, -15);
        var3 = var3 + (this.termsText.widgetHeight + 15);
        this.addChild(true, this.termsText);
        int var6 = 4;
        int var7 = 200;
        this.createButton.setWidgetBounds(var7, 496 - var7 >> 1, 40, false, var3);
        this.backButton.setWidgetBounds(60, 3 + var6, 40, false, 15 + var3);
        this.backButton.listener = (WidgetListener) (this);
        this.createButton.listener = (WidgetListener) (this);
        this.addChild(true, this.createButton);
        this.addChild(true, this.backButton);
        this.suggestionsPanel = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.suggestionsPanel.setWidgetBounds(-this.displayNameInput.widgetWidth - this.displayNameInput.widgetX + (this.widgetWidth - 60), 60 + (this.displayNameInput.widgetWidth + this.displayNameInput.widgetX), 150, false, this.displayNameInput.widgetY + 20);
        this.addChild(true, this.suggestionsPanel);
        this.setWidgetBounds(496, 0, var3 + 55 + var6, false, 0);
    }

    final static qr b(byte param0, String param1) {
        RuntimeException var2 = null;
        qr stackIn_2_0 = null;
        qr stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25) {
            stackIn_2_0 = (qr) null;
            return stackIn_2_0;
          }
          if (TextInputValidator.field_j.a(param0 + 121) &&
            !param1.equals(TextInputValidator.field_j.b(2))) {
            TextInputValidator.field_j = GzipDecoder.a(117, param1);
          }
          stackIn_7_0 = TextInputValidator.field_j;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("nf.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final String j(int param0) {
        if (param0 != 0) {
          UiWidget var3 = (UiWidget) null;
          this.handleKeyInput('￴', -47, false, (UiWidget) null);
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final String i(int param0) {
        if (param0 != 11579568) {
          this.newsOptInCheckbox = (CheckboxWidget) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final boolean submitAccountCreation(int param0) {
        if (!this.areAllInputsValid(3)) {
          return false;
        }
        int var2 = -1;
        try {
          var2 = Integer.parseInt(this.ageInput.widgetText);
        } catch (NumberFormatException numberFormatException) {
        }
        if (param0 >= 94) {
          return BufferedSocket.a(this.newsOptInCheckbox.active, this.passwordInput.widgetText, (byte) 114, this, var2, this.emailInput.widgetText, this.displayNameInput.widgetText);
        }
        AccountCreationForm.g((byte) -63);
        return BufferedSocket.a(this.newsOptInCheckbox.active, this.passwordInput.widgetText, (byte) 114, this, var2, this.emailInput.widgetText, this.displayNameInput.widgetText);
    }

    public final void onSuggestionSelected(String param0, int param1) {
        ga var3 = null;
        String var4 = null;
        if (param1 != 35) {
          return;
        }
        try {
          var3 = this.displayNameInput;
          var4 = param0;
          ((TextInputWidget) ((Object) var3)).setInputText((byte) -124, false, var4);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "nf.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_S = new IntrusiveDeque();
        playerYouX2HaveWon = "You and <%0> have won!";
    }
}
