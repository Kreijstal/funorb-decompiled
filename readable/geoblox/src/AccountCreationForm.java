/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener, UsernameSuggestionListener {
    static ClientProtocolStage field_F;
    private ValidatedTextInputWidget confirmPasswordInput;
    private ValidatedTextInputWidget ageInput;
    private ValidatedTextInputWidget confirmEmailInput;
    UsernameSuggestionsPanel usernameSuggestions;
    private ValidatedTextInputWidget displayNameInput;
    private ValidatedTextInputWidget passwordInput;
    private ValidatedTextInputWidget emailInput;
    static int archiveHandshakeStage;
    private HotspotTextWidget termsText;
    static Sprite[] introGeometryFrames;
    private ButtonWidget createButton;
    static boolean[] field_C;
    private CheckboxWidget newsOptInCheckbox;
    static String createPasswordHintText;
    static String tutorialFailedMessage;
    private ButtonWidget backButton;

    private final int a(int param0, String param1, int param2, UiWidget param3, int param4) {
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
          if (param4 != 5) {
            stackIn_2_0 = 0;
            return stackIn_2_0;
          }
          var6 = new LabeledChildWidget(20, param0, 120 + param2, 25, param3, false, 120, 3, DialogLayer.sharedUiFont, 16777215, param1);
          this.addChild((byte) -114, var6);
          stackIn_4_0 = var6.widgetHeight;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("qh.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    private final int a(UiWidget param0, int param1, String param2, int param3, String param4, int param5, byte param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        int var10 = 0;
        LabeledChildWidget var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new LabeledChildWidget(20, param5, 120 + param1, 25, param0, false, 120, 3, DialogLayer.sharedUiFont, 16777215, param2);
          this.addChild((byte) -128, var11);
          var9 = new ValidationMessageWidget(((ValidationProviderSource) ((Object) param0)).getValidationProvider((byte) -101), param4, 126, param5 + var11.widgetHeight, param1 + 50, param3);
          var9.listener = (WidgetListener) (this);
          this.addChild((byte) -127, var9);
          var10 = 38 / ((-14 - param6) / 46);
          stackIn_1_0 = var9.widgetHeight + var11.widgetHeight;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("qh.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public AccountCreationForm() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.displayNameInput = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        this.emailInput = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.confirmEmailInput = new ValidatedTextInputWidget("", (WidgetListener) null, 100);
        this.passwordInput = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.confirmPasswordInput = new ValidatedTextInputWidget("", (WidgetListener) null, 20);
        this.ageInput = new ValidatedTextInputWidget("", (WidgetListener) null, 3);
        int var1 = 1;
        this.newsOptInCheckbox = new CheckboxWidget("", (WidgetListener) null, var1 != 0);
        this.createButton = new ButtonWidget(TextTemplateDefinitionLoader.createText, (WidgetListener) null);
        this.backButton = new ButtonWidget(ValidatedTextInputWidget.goBackText, (WidgetListener) null);
        this.displayNameInput.hoverText = AchievementProtocolSupport.createDisplayNameTooltipText;
        this.emailInput.hoverText = GameGraphicsResources.createEmailTooltipText;
        this.confirmEmailInput.hoverText = ClientRenderingState.createEmailConfirmationTooltipText;
        this.passwordInput.hoverText = FullscreenErrorDialog.createPasswordTooltipText;
        this.confirmPasswordInput.hoverText = ByteArrayPoolSupport.createPasswordConfirmationTooltipText;
        this.ageInput.hoverText = ArchiveRequest.createAgeTooltipText;
        this.newsOptInCheckbox.hoverText = CheckboxWidget.createNewsOptInTooltipText;
        this.displayNameInput.setValidationProvider((byte) -27, new UsernameAvailabilityValidator(this.displayNameInput));
        this.emailInput.setValidationProvider((byte) -111, new EmailValidator(this.emailInput));
        this.confirmEmailInput.setValidationProvider((byte) 126, new EmailAvailabilityValidator(this.confirmEmailInput, this.emailInput));
        this.passwordInput.setValidationProvider((byte) 83, new PasswordValidator(this.passwordInput, this.displayNameInput, this.emailInput));
        this.confirmPasswordInput.setValidationProvider((byte) -71, new MatchingTextValidator(this.confirmPasswordInput, this.passwordInput));
        this.ageInput.setValidationProvider((byte) -116, new AgeValidator(this.ageInput));
        this.createButton.enabled = false;
        this.createButton.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
        this.backButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
        this.displayNameInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
        TextInputRenderer dupTemp$0 = new TextInputRenderer(10000536);
        this.confirmEmailInput.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.emailInput.renderer = (WidgetRenderer) ((Object) dupTemp$0);
        this.ageInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
        this.newsOptInCheckbox.renderer = (WidgetRenderer) ((Object) new SpriteCheckboxRenderer());
        PasswordWidgetRenderer dupTemp$1 = new PasswordWidgetRenderer(10000536);
        this.confirmPasswordInput.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        this.passwordInput.renderer = (WidgetRenderer) ((Object) dupTemp$1);
        String var2 = OpacityWidget.a(ArchiveIndex.createAgreeTermsText, new String[]{this.b(false), this.c(false)}, (byte) -72);
        int var3 = 20;
        var3 = var3 + this.a(var3, ScorePopupSupport.createEmailText, 170, this.emailInput, 5);
        var3 = var3 + (5 + this.a(this.confirmEmailInput, 170, ClientRenderingState.createEmailConfirmationText, 20, "", var3, (byte) -65));
        var3 = var3 + this.a(var3, LoginPayloadKind.createPasswordText, 170, this.passwordInput, 5);
        var3 = var3 + (this.a(-99, this.confirmPasswordInput, CanvasResizeController.createPasswordConfirmationText, var3, 170, createPasswordHintText) + 5);
        var3 = var3 + (this.a(-103, this.displayNameInput, OpacityWidget.createDisplayNameText, var3, 170, ClientProtocolStage.createDisplayNameHintText) + 5);
        var3 = var3 + this.a(var3, 170, this.ageInput, PcmResampler.createAgeText, (byte) -127);
        LabeledChildWidget var4 = new LabeledChildWidget(46, var3, this.widgetWidth - 90, 25, this.newsOptInCheckbox, true, this.widgetWidth - 120, 5, UiFontResources.commonUiSmallFont, 11579568, PcmResampler.createNewsOptInText);
        this.addChild((byte) -106, var4);
        var3 = var3 + var4.widgetHeight;
        TextWidgetRenderer var5 = new TextWidgetRenderer(DialogLayer.sharedUiFont, 0, 0, 0, 0, 16777215, -1, 0, 0, DialogLayer.sharedUiFont.maxAscent, -1, 2147483647, true);
        this.termsText = new HotspotTextWidget(var2, var5);
        this.termsText.hoverText = "";
        this.termsText.setHotspotHoverText(0, -42, LogoCompositor.openInPopupWindowText);
        this.termsText.setHotspotHoverText(1, -62, LogoCompositor.openInPopupWindowText);
        this.termsText.listener = (WidgetListener) (this);
        this.termsText.fitTextBounds(46, 0, var3, -90 + this.widgetWidth);
        var3 = var3 + (this.termsText.widgetHeight + 15);
        this.addChild((byte) -73, this.termsText);
        int var6 = 4;
        int var7 = 200;
        this.createButton.setWidgetBounds(40, var7, (byte) -53, var3, -var7 + 496 >> 1);
        this.backButton.setWidgetBounds(40, 60, (byte) -118, var3 + 15, 3 + var6);
        this.backButton.listener = (WidgetListener) (this);
        this.createButton.listener = (WidgetListener) (this);
        this.addChild((byte) -83, this.createButton);
        this.addChild((byte) -108, this.backButton);
        this.usernameSuggestions = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.usernameSuggestions.setWidgetBounds(150, -this.displayNameInput.widgetX + this.widgetWidth - this.displayNameInput.widgetWidth - 60, (byte) -13, 20 + this.displayNameInput.widgetY, 60 + (this.displayNameInput.widgetWidth + this.displayNameInput.widgetX));
        this.addChild((byte) -113, this.usernameSuggestions);
        this.setWidgetBounds(55 + var3 + var6, 496, (byte) -65, 0, 0);
    }

    private final boolean g(int param0) {
        if (!this.f(param0 ^ -19038)) {
            return false;
        }
        int var2 = -1;
        if (param0 != -21440) {
            field_C = (boolean[]) null;
        }
        try {
            var2 = Integer.parseInt(this.ageInput.widgetText);
        } catch (NumberFormatException numberFormatException) {
        }
        return AccountCreationSupport.startAccountCreation(this.displayNameInput.widgetText, this.emailInput.widgetText, var2, (AccountCreationForm) (this), 0, this.newsOptInCheckbox.active, this.passwordInput.widgetText);
    }

    final static LoginTextValue i(int param0) {
        String var1 = ClientFlowToken.getActiveLoginIdentifier(0);
        if (param0 == 25) {
            if (var1 != null && var1.indexOf('@') >= 0) {
                var1 = "";
            }
            return new LoginTextValue(ClientFlowToken.getActiveLoginIdentifier(0), ProgressDialog.isUsernameQueryFlowPending(-1071908447));
        }
        archiveHandshakeStage = 84;
        if (var1 != null && var1.indexOf('@') >= 0) {
            var1 = "";
        }
        return new LoginTextValue(ClientFlowToken.getActiveLoginIdentifier(0), ProgressDialog.isUsernameQueryFlowPending(-1071908447));
    }

    private final int a(int param0, int param1, UiWidget param2, String param3, byte param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        ValidationIconWidget var7 = null;
        LabeledChildWidget var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new LabeledChildWidget(20, param0, param1 + 120, 25, param2, false, 120, 3, DialogLayer.sharedUiFont, 16777215, param3);
          this.addChild((byte) -120, var8);
          var7 = new ValidationIconWidget(((ValidationProviderSource) ((Object) param2)).getValidationProvider((byte) -124));
          this.addChild((byte) -79, var7);
          if (param4 > -123) {
            discarded$1 = this.b(false);
          }
          var7.setWidgetBounds(15, 15, (byte) -22, var8.widgetY + (-15 + var8.widgetHeight >> 1), 3 + var8.widgetWidth + var8.widgetX);
          stackIn_3_0 = var8.widgetHeight;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("qh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
    }

    public final void onHotspotActivated(HotspotTextWidget widget, int hotspotId, int methodGuard, int pointerButton) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (0 != hotspotId) {
            if (hotspotId != 1) {
              if (hotspotId == 2) {
                UsernameAvailabilityValidator.a(false, "conduct.ws");
              }
            } else {
              UsernameAvailabilityValidator.a(false, "privacy.ws");
            }
          } else {
            UsernameAvailabilityValidator.a(false, "terms.ws");
          }
          if (methodGuard == 2) {
            return;
          }
          this.confirmPasswordInput = (ValidatedTextInputWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qh.A(");
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(hotspotId).append(',').append(methodGuard).append(',').append(pointerButton).append(')').toString());
        }
    }

    final static void h(byte param0) {
        DialRenderer.field_j = MessageDialog.getSharedUiStyle(125);
        int var1 = -117 / ((12 - param0) / 57);
        ClientFlowState.accountDialogLayer = new DialogLayer();
        TextTemplateLookupSupport.openLoginPanel(true, true, false);
    }

    private final String c(boolean param0) {
        if (param0) {
            archiveHandshakeStage = 75;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == this.backButton) {
            ByteArrayBuffer.g(0);
          } else {
            if (this.createButton == param4) {
              discarded$1 = this.g(-21440);
            }
          }
          if (param1 == -20) {
            return;
          }
          introGeometryFrames = (Sprite[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("qh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, ValidationProviderSource param1) {
        boolean discarded$1 = false;
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        ValidationProviderSource var5 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationProvider((byte) -106);
          if (var3 == null) {
            return true;
          }
          var4 = var3.getDebouncedValidationState((byte) -105);
          if (WidgetSkinState.invalidInputValidationState == var4) {
            return false;
          }
          if (param0 >= -73) {
            var5 = (ValidationProviderSource) null;
            discarded$1 = this.a((byte) 82, (ValidationProviderSource) null);
          }
          if (ImageProducerRasterBuffer.debouncingValidationState == var4) {
            return false;
          }
          if (var4 != ByteStorage.emptyInputValidationState) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("qh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        createPasswordHintText = null;
        introGeometryFrames = null;
        if (param0 == 0) {
            field_C = null;
            tutorialFailedMessage = null;
            field_F = null;
            return;
        }
        createPasswordHintText = (String) null;
        field_C = null;
        tutorialFailedMessage = null;
        field_F = null;
    }

    private final boolean f(int param0) {
        if (!this.a((byte) -104, (ValidationProviderSource) (this.displayNameInput))) {
            return false;
        }
        if (!this.a((byte) -118, (ValidationProviderSource) (this.emailInput))) {
            return false;
        }
        if (!this.a((byte) -108, (ValidationProviderSource) (this.confirmEmailInput))) {
            return false;
        }
        if (!this.a((byte) -103, (ValidationProviderSource) (this.passwordInput))) {
            return false;
        }
        if (!this.a((byte) -117, (ValidationProviderSource) (this.confirmPasswordInput))) {
            return false;
        }
        if (!this.a((byte) -128, (ValidationProviderSource) (this.ageInput))) {
            return false;
        }
        if (param0 == 6626) {
            return true;
        }
        return false;
    }

    public final void onSuggestionSelected(String suggestion, int methodGuard) {
        ValidatedTextInputWidget var3 = this.displayNameInput;
        String var4 = suggestion;
        if (methodGuard != 20) {
            return;
        }
        try {
            ((TextInputWidget) ((Object) var3)).setInputText(-121, var4, false);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "qh.P(" + (suggestion != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final String b(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1 ^ 0, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_7_0 = this.requestPreviousChildFocus(7305, param3);
            return stackIn_7_0;
          }
          if (param1 != 13) {
            createPasswordHintText = (String) null;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_13_0 = this.requestNextChildFocus(param3, -125);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final int a(int param0, UiWidget param1, String param2, int param3, int param4, String param5) {
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
          if (param0 <= -66) {
            stackIn_4_0 = this.a(param1, param4, param2, 35, param5, param3, (byte) -121);
            return stackIn_4_0;
          }
          stackIn_2_0 = -10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("qh.L(").append(param0).append(',');
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
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(byte methodGuard) {
        ((UsernameAvailabilityValidator) ((Object) this.displayNameInput.getValidationProvider((byte) -128))).c((byte) -89);
        if (methodGuard != 83) {
            this.onMoreSuggestionsRequested((byte) -25);
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.createButton.enabled = this.f(6626);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "qh.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    static {
        field_F = new ClientProtocolStage();
        tutorialFailedMessage = "Unfortunately, you've failed the tutorial. In Geoblox you lose if any geoblox stuck to your avatar reach the edge of the rotating play area. You can either choose to replay the tutorial or, if you feel confident, you can proceed to the proper game.<br>Press <img=2> to continue to the game. Press <img=5> to replay the tutorial.";
        createPasswordHintText = "Passwords must be between 5 and 20 letters and numbers";
    }
}
