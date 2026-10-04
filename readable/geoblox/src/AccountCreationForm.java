/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationForm extends WidgetContainer implements HotspotActivationListener, ButtonActivationListener, UsernameSuggestionListener {
    static ClientProtocolStage awaitingLoginLookupPayloadStage;
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
    static boolean[] unusedRankedEntryBooleans;
    private CheckboxWidget newsOptInCheckbox;
    static String createPasswordHintText;
    static String tutorialFailedMessage;
    private ButtonWidget backButton;

    private final int addLabeledInputRow(int y, String labelText, int inputWidth, UiWidget inputWidget, int methodGuard) {
        LabeledChildWidget labeledInputRow = null;
        RuntimeException rowFailureForContext = null;
        int guardedZeroRowHeight = 0;
        int rowHeightBeforeReturn = 0;
        RuntimeException rowFailureBeforeContext = null;
        StringBuilder rowMessagePrefix = null;
        String labelDescription = null;
        StringBuilder rowMessageBeforeWidget = null;
        String inputWidgetDescription = null;
        RuntimeException caughtRowFailure = null;
        try {
          if (methodGuard != 5) {
            guardedZeroRowHeight = 0;
            return guardedZeroRowHeight;
          }
          labeledInputRow = new LabeledChildWidget(20, y, 120 + inputWidth, 25, inputWidget, false, 120, 3, DialogLayer.sharedUiFont, 16777215, labelText);
          this.addChild((byte) -114, labeledInputRow);
          rowHeightBeforeReturn = labeledInputRow.widgetHeight;
          return rowHeightBeforeReturn;
        } catch (java.lang.RuntimeException rowConstructionFailure) {
          caughtRowFailure = rowConstructionFailure;
          rowFailureForContext = caughtRowFailure;
          rowFailureBeforeContext = rowFailureForContext;
          rowMessagePrefix = new StringBuilder().append("qh.S(").append(y).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          rowMessageBeforeWidget = ((StringBuilder) (Object) rowMessagePrefix).append(labelDescription).append(',').append(inputWidth).append(',');
          if (inputWidget == null) {
            inputWidgetDescription = "null";
          } else {
            inputWidgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rowFailureBeforeContext), ((StringBuilder) (Object) rowMessageBeforeWidget).append(inputWidgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final int addLabeledValidationMessageRow(UiWidget inputWidget, int inputWidth, String labelText, int messageHeight, String fallbackMessage, int y, byte methodGuard) {
        RuntimeException messageRowFailureForContext = null;
        ValidationMessageWidget validationMessage = null;
        int guardResidue = 0;
        LabeledChildWidget labeledInputRow = null;
        int combinedRowHeightBeforeReturn = 0;
        RuntimeException messageFailureBeforeContext = null;
        StringBuilder messageMessagePrefix = null;
        String inputWidgetDescription = null;
        StringBuilder messageMessageBeforeLabel = null;
        String labelDescription = null;
        StringBuilder messageMessageBeforeFallback = null;
        String fallbackDescription = null;
        RuntimeException caughtMessageRowFailure = null;
        try {
          labeledInputRow = new LabeledChildWidget(20, y, 120 + inputWidth, 25, inputWidget, false, 120, 3, DialogLayer.sharedUiFont, 16777215, labelText);
          this.addChild((byte) -128, labeledInputRow);
          validationMessage = new ValidationMessageWidget(((ValidationProviderSource) ((Object) inputWidget)).getValidationProvider((byte) -101), fallbackMessage, 126, y + labeledInputRow.widgetHeight, inputWidth + 50, messageHeight);
          validationMessage.listener = (WidgetListener) (this);
          this.addChild((byte) -127, validationMessage);
          guardResidue = 38 / ((-14 - methodGuard) / 46);
          combinedRowHeightBeforeReturn = validationMessage.widgetHeight + labeledInputRow.widgetHeight;
          return combinedRowHeightBeforeReturn;
        } catch (java.lang.RuntimeException messageRowConstructionFailure) {
          caughtMessageRowFailure = messageRowConstructionFailure;
          messageRowFailureForContext = caughtMessageRowFailure;
          messageFailureBeforeContext = messageRowFailureForContext;
          messageMessagePrefix = new StringBuilder().append("qh.E(");
          if (inputWidget == null) {
            inputWidgetDescription = "null";
          } else {
            inputWidgetDescription = "{...}";
          }
          messageMessageBeforeLabel = ((StringBuilder) (Object) messageMessagePrefix).append(inputWidgetDescription).append(',').append(inputWidth).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          messageMessageBeforeFallback = ((StringBuilder) (Object) messageMessageBeforeLabel).append(labelDescription).append(',').append(messageHeight).append(',');
          if (fallbackMessage == null) {
            fallbackDescription = "null";
          } else {
            fallbackDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) messageFailureBeforeContext), ((StringBuilder) (Object) messageMessageBeforeFallback).append(fallbackDescription).append(',').append(y).append(',').append(methodGuard).append(')').toString());
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
        int initialNewsOptInValue = 1;
        this.newsOptInCheckbox = new CheckboxWidget("", (WidgetListener) null, initialNewsOptInValue != 0);
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
        TextInputRenderer sharedEmailRenderer = new TextInputRenderer(10000536);
        this.confirmEmailInput.renderer = (WidgetRenderer) ((Object) sharedEmailRenderer);
        this.emailInput.renderer = (WidgetRenderer) ((Object) sharedEmailRenderer);
        this.ageInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
        this.newsOptInCheckbox.renderer = (WidgetRenderer) ((Object) new SpriteCheckboxRenderer());
        PasswordWidgetRenderer sharedPasswordRenderer = new PasswordWidgetRenderer(10000536);
        this.confirmPasswordInput.renderer = (WidgetRenderer) ((Object) sharedPasswordRenderer);
        this.passwordInput.renderer = (WidgetRenderer) ((Object) sharedPasswordRenderer);
        String termsMarkup = OpacityWidget.replaceIndexedTextMarkers(ArchiveIndex.createAgreeTermsText, new String[]{this.getTermsLinkOpeningMarkup(false), this.getTermsLinkClosingMarkup(false)}, (byte) -72);
        int nextRowY = 20;
        nextRowY = nextRowY + this.addLabeledInputRow(nextRowY, ScorePopupSupport.createEmailText, 170, this.emailInput, 5);
        nextRowY = nextRowY + (5 + this.addLabeledValidationMessageRow(this.confirmEmailInput, 170, ClientRenderingState.createEmailConfirmationText, 20, "", nextRowY, (byte) -65));
        nextRowY = nextRowY + this.addLabeledInputRow(nextRowY, LoginPayloadKind.createPasswordText, 170, this.passwordInput, 5);
        nextRowY = nextRowY + (this.addLabeledHintRow(-99, this.confirmPasswordInput, CanvasResizeController.createPasswordConfirmationText, nextRowY, 170, createPasswordHintText) + 5);
        nextRowY = nextRowY + (this.addLabeledHintRow(-103, this.displayNameInput, OpacityWidget.createDisplayNameText, nextRowY, 170, ClientProtocolStage.createDisplayNameHintText) + 5);
        nextRowY = nextRowY + this.addLabeledValidationIconRow(nextRowY, 170, this.ageInput, PcmResampler.createAgeText, (byte) -127);
        LabeledChildWidget newsOptInRow = new LabeledChildWidget(46, nextRowY, this.widgetWidth - 90, 25, this.newsOptInCheckbox, true, this.widgetWidth - 120, 5, UiFontResources.commonUiSmallFont, 11579568, PcmResampler.createNewsOptInText);
        this.addChild((byte) -106, newsOptInRow);
        nextRowY = nextRowY + newsOptInRow.widgetHeight;
        TextWidgetRenderer termsRenderer = new TextWidgetRenderer(DialogLayer.sharedUiFont, 0, 0, 0, 0, 16777215, -1, 0, 0, DialogLayer.sharedUiFont.maxAscent, -1, 2147483647, true);
        this.termsText = new HotspotTextWidget(termsMarkup, termsRenderer);
        this.termsText.hoverText = "";
        this.termsText.setHotspotHoverText(0, -42, LogoCompositor.openInPopupWindowText);
        this.termsText.setHotspotHoverText(1, -62, LogoCompositor.openInPopupWindowText);
        this.termsText.listener = (WidgetListener) (this);
        this.termsText.fitTextBounds(46, 0, nextRowY, -90 + this.widgetWidth);
        nextRowY = nextRowY + (this.termsText.widgetHeight + 15);
        this.addChild((byte) -73, this.termsText);
        int bottomInset = 4;
        int createButtonWidth = 200;
        this.createButton.setWidgetBounds(40, createButtonWidth, (byte) -53, nextRowY, -createButtonWidth + 496 >> 1);
        this.backButton.setWidgetBounds(40, 60, (byte) -118, nextRowY + 15, 3 + bottomInset);
        this.backButton.listener = (WidgetListener) (this);
        this.createButton.listener = (WidgetListener) (this);
        this.addChild((byte) -83, this.createButton);
        this.addChild((byte) -108, this.backButton);
        this.usernameSuggestions = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.usernameSuggestions.setWidgetBounds(150, -this.displayNameInput.widgetX + this.widgetWidth - this.displayNameInput.widgetWidth - 60, (byte) -13, 20 + this.displayNameInput.widgetY, 60 + (this.displayNameInput.widgetWidth + this.displayNameInput.widgetX));
        this.addChild((byte) -113, this.usernameSuggestions);
        this.setWidgetBounds(55 + nextRowY + bottomInset, 496, (byte) -65, 0, 0);
    }

    private final boolean submitAccountCreationIfReady(int methodGuard) {
        if (!this.passesRequiredInputCreationGates(methodGuard ^ -19038)) {
            return false;
        }
        int parsedAgeOrFailureSentinel = -1;
        if (methodGuard != -21440) {
            unusedRankedEntryBooleans = (boolean[]) null;
        }
        try {
            parsedAgeOrFailureSentinel = Integer.parseInt(this.ageInput.widgetText);
        } catch (NumberFormatException ignoredAgeParseFailure) {
        }
        return AccountCreationSupport.startAccountCreation(this.displayNameInput.widgetText, this.emailInput.widgetText, parsedAgeOrFailureSentinel, (AccountCreationForm) (this), 0, this.newsOptInCheckbox.active, this.passwordInput.widgetText);
    }

    final static LoginTextValue createActiveLoginLookupValue(int methodGuard) {
        String unusedEmailFilteredLoginIdentifier = ClientFlowToken.getActiveLoginIdentifier(0);
        if (methodGuard == 25) {
            if (unusedEmailFilteredLoginIdentifier != null && unusedEmailFilteredLoginIdentifier.indexOf('@') >= 0) {
                unusedEmailFilteredLoginIdentifier = "";
            }
            return new LoginTextValue(ClientFlowToken.getActiveLoginIdentifier(0), ProgressDialog.isUsernameQueryFlowPending(-1071908447));
        }
        archiveHandshakeStage = 84;
        if (unusedEmailFilteredLoginIdentifier != null && unusedEmailFilteredLoginIdentifier.indexOf('@') >= 0) {
            unusedEmailFilteredLoginIdentifier = "";
        }
        return new LoginTextValue(ClientFlowToken.getActiveLoginIdentifier(0), ProgressDialog.isUsernameQueryFlowPending(-1071908447));
    }

    private final int addLabeledValidationIconRow(int y, int inputWidth, UiWidget inputWidget, String labelText, byte methodGuard) {
        String discardedTermsOpeningMarkup = null;
        RuntimeException iconRowFailureForContext = null;
        ValidationIconWidget validationIcon = null;
        LabeledChildWidget labeledInputRow = null;
        int rowHeightBeforeReturn = 0;
        RuntimeException iconFailureBeforeContext = null;
        StringBuilder iconMessagePrefix = null;
        String inputWidgetDescription = null;
        StringBuilder iconMessageBeforeLabel = null;
        String labelDescription = null;
        RuntimeException caughtIconRowFailure = null;
        try {
          labeledInputRow = new LabeledChildWidget(20, y, inputWidth + 120, 25, inputWidget, false, 120, 3, DialogLayer.sharedUiFont, 16777215, labelText);
          this.addChild((byte) -120, labeledInputRow);
          validationIcon = new ValidationIconWidget(((ValidationProviderSource) ((Object) inputWidget)).getValidationProvider((byte) -124));
          this.addChild((byte) -79, validationIcon);
          if (methodGuard > -123) {
            discardedTermsOpeningMarkup = this.getTermsLinkOpeningMarkup(false);
          }
          validationIcon.setWidgetBounds(15, 15, (byte) -22, labeledInputRow.widgetY + (-15 + labeledInputRow.widgetHeight >> 1), 3 + labeledInputRow.widgetWidth + labeledInputRow.widgetX);
          rowHeightBeforeReturn = labeledInputRow.widgetHeight;
          return rowHeightBeforeReturn;
        } catch (java.lang.RuntimeException iconRowConstructionFailure) {
          caughtIconRowFailure = iconRowConstructionFailure;
          iconRowFailureForContext = caughtIconRowFailure;
          iconFailureBeforeContext = iconRowFailureForContext;
          iconMessagePrefix = new StringBuilder().append("qh.G(").append(y).append(',').append(inputWidth).append(',');
          if (inputWidget == null) {
            inputWidgetDescription = "null";
          } else {
            inputWidgetDescription = "{...}";
          }
          iconMessageBeforeLabel = ((StringBuilder) (Object) iconMessagePrefix).append(inputWidgetDescription).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) iconFailureBeforeContext), ((StringBuilder) (Object) iconMessageBeforeLabel).append(labelDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final void onHotspotActivated(HotspotTextWidget widget, int hotspotId, int methodGuard, int pointerButton) {
        RuntimeException hotspotFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        RuntimeException hotspotFailureBeforeContext = null;
        StringBuilder hotspotMessagePrefix = null;
        String widgetDescription = null;
        RuntimeException caughtHotspotFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (0 != hotspotId) {
            if (hotspotId != 1) {
              if (hotspotId == 2) {
                UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "conduct.ws");
              }
            } else {
              UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "privacy.ws");
            }
          } else {
            UsernameAvailabilityValidator.requestNavigationToSharedTarget(false, "terms.ws");
          }
          if (methodGuard == 2) {
            return;
          }
          this.confirmPasswordInput = (ValidatedTextInputWidget) null;
          return;
        } catch (java.lang.RuntimeException hotspotActivationFailure) {
          caughtHotspotFailure = hotspotActivationFailure;
          hotspotFailureForContext = caughtHotspotFailure;
          hotspotFailureBeforeContext = hotspotFailureForContext;
          hotspotMessagePrefix = new StringBuilder().append("qh.A(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hotspotFailureBeforeContext), ((StringBuilder) (Object) hotspotMessagePrefix).append(widgetDescription).append(',').append(hotspotId).append(',').append(methodGuard).append(',').append(pointerButton).append(')').toString());
        }
    }

    final static void rebuildAccountDialogLayerAndOpenLogin(byte methodGuard) {
        DialRenderer.accountUiTheme = MessageDialog.getSharedUiStyle(125);
        int guardResidue = -117 / ((12 - methodGuard) / 57);
        ClientFlowState.accountDialogLayer = new DialogLayer();
        TextTemplateLookupSupport.openLoginPanel(true, true, false);
    }

    private final String getTermsLinkClosingMarkup(boolean methodGuard) {
        if (methodGuard) {
            archiveHandshakeStage = 75;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        boolean discardedSubmissionResult = false;
        RuntimeException buttonFailureBeforeContext = null;
        StringBuilder buttonMessagePrefix = null;
        String buttonDescription = null;
        RuntimeException caughtButtonFailure = null;
        RuntimeException buttonFailureForContext = null;
        try {
          if (button == this.backButton) {
            ByteArrayBuffer.openAccountWelcomePanel(0);
          } else {
            if (this.createButton == button) {
              discardedSubmissionResult = this.submitAccountCreationIfReady(-21440);
            }
          }
          if (methodGuard == -20) {
            return;
          }
          introGeometryFrames = (Sprite[]) null;
          return;
        } catch (java.lang.RuntimeException buttonActivationFailure) {
          caughtButtonFailure = buttonActivationFailure;
          buttonFailureForContext = caughtButtonFailure;
          buttonFailureBeforeContext = buttonFailureForContext;
          buttonMessagePrefix = new StringBuilder().append("qh.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonDescription = "null";
          } else {
            buttonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) buttonFailureBeforeContext), ((StringBuilder) (Object) buttonMessagePrefix).append(buttonDescription).append(')').toString());
        }
    }

    private final boolean passesInputCreationGate(byte methodGuard, ValidationProviderSource providerSource) {
        boolean discardedRecursiveGateResult = false;
        ValidationProvider validationProvider = null;
        RuntimeException gateFailureForContext = null;
        ValidationState validationState = null;
        ValidationProviderSource guardedNullProviderSource = null;
        RuntimeException gateFailureBeforeContext = null;
        StringBuilder gateMessagePrefix = null;
        String providerSourceDescription = null;
        RuntimeException caughtGateFailure = null;
        try {
          validationProvider = providerSource.getValidationProvider((byte) -106);
          if (validationProvider == null) {
            return true;
          }
          validationState = validationProvider.getDebouncedValidationState((byte) -105);
          if (WidgetSkinState.invalidInputValidationState == validationState) {
            return false;
          }
          if (methodGuard >= -73) {
            guardedNullProviderSource = (ValidationProviderSource) null;
            discardedRecursiveGateResult = this.passesInputCreationGate((byte) 82, (ValidationProviderSource) null);
          }
          if (ImageProducerRasterBuffer.debouncingValidationState == validationState) {
            return false;
          }
          if (validationState != ByteStorage.emptyInputValidationState) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException inputGateFailure) {
          caughtGateFailure = inputGateFailure;
          gateFailureForContext = caughtGateFailure;
          gateFailureBeforeContext = gateFailureForContext;
          gateMessagePrefix = new StringBuilder().append("qh.C(").append(methodGuard).append(',');
          if (providerSource == null) {
            providerSourceDescription = "null";
          } else {
            providerSourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) gateFailureBeforeContext), ((StringBuilder) (Object) gateMessagePrefix).append(providerSourceDescription).append(')').toString());
        }
    }

    public static void releaseAccountCreationSharedResources(int methodGuard) {
        createPasswordHintText = null;
        introGeometryFrames = null;
        if (methodGuard == 0) {
            unusedRankedEntryBooleans = null;
            tutorialFailedMessage = null;
            awaitingLoginLookupPayloadStage = null;
            return;
        }
        createPasswordHintText = (String) null;
        unusedRankedEntryBooleans = null;
        tutorialFailedMessage = null;
        awaitingLoginLookupPayloadStage = null;
    }

    private final boolean passesRequiredInputCreationGates(int methodGuard) {
        if (!this.passesInputCreationGate((byte) -104, (ValidationProviderSource) (this.displayNameInput))) {
            return false;
        }
        if (!this.passesInputCreationGate((byte) -118, (ValidationProviderSource) (this.emailInput))) {
            return false;
        }
        if (!this.passesInputCreationGate((byte) -108, (ValidationProviderSource) (this.confirmEmailInput))) {
            return false;
        }
        if (!this.passesInputCreationGate((byte) -103, (ValidationProviderSource) (this.passwordInput))) {
            return false;
        }
        if (!this.passesInputCreationGate((byte) -117, (ValidationProviderSource) (this.confirmPasswordInput))) {
            return false;
        }
        if (!this.passesInputCreationGate((byte) -128, (ValidationProviderSource) (this.ageInput))) {
            return false;
        }
        if (methodGuard == 6626) {
            return true;
        }
        return false;
    }

    public final void onSuggestionSelected(String suggestion, int methodGuard) {
        ValidatedTextInputWidget targetDisplayNameInput = this.displayNameInput;
        String selectedSuggestionText = suggestion;
        if (methodGuard != 20) {
            return;
        }
        try {
            ((TextInputWidget) ((Object) targetDisplayNameInput)).setInputText(-121, selectedSuggestionText, false);
        } catch (RuntimeException suggestionWriteFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) suggestionWriteFailure), "qh.P(" + (suggestion != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final String getTermsLinkOpeningMarkup(boolean methodGuard) {
        if (methodGuard) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyFailureForContext = null;
        boolean previousFocusResult = false;
        boolean nextFocusResult = false;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (super.handleKeyInput(keyCode, methodGuard ^ 0, typedCharacter, eventContext)) {
            return true;
          }
          if (98 == keyCode) {
            previousFocusResult = this.requestPreviousChildFocus(7305, eventContext);
            return previousFocusResult;
          }
          if (methodGuard != 13) {
            createPasswordHintText = (String) null;
          }
          if (99 != keyCode) {
            return false;
          }
          nextFocusResult = this.requestNextChildFocus(eventContext, -125);
          return nextFocusResult;
        } catch (java.lang.RuntimeException keyInputFailure) {
          caughtKeyFailure = keyInputFailure;
          keyFailureForContext = caughtKeyFailure;
          keyFailureBeforeContext = keyFailureForContext;
          keyMessagePrefix = new StringBuilder().append("qh.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyMessagePrefix).append(eventContextDescription).append(')').toString());
        }
    }

    private final int addLabeledHintRow(int methodGuard, UiWidget inputWidget, String labelText, int y, int inputWidth, String fallbackMessage) {
        RuntimeException hintRowFailureForContext = null;
        int guardedNegativeRowHeight = 0;
        int combinedRowHeightBeforeReturn = 0;
        RuntimeException hintFailureBeforeContext = null;
        StringBuilder hintMessagePrefix = null;
        String inputWidgetDescription = null;
        StringBuilder hintMessageBeforeLabel = null;
        String labelDescription = null;
        StringBuilder hintMessageBeforeFallback = null;
        String fallbackDescription = null;
        RuntimeException caughtHintRowFailure = null;
        try {
          if (methodGuard <= -66) {
            combinedRowHeightBeforeReturn = this.addLabeledValidationMessageRow(inputWidget, inputWidth, labelText, 35, fallbackMessage, y, (byte) -121);
            return combinedRowHeightBeforeReturn;
          }
          guardedNegativeRowHeight = -10;
          return guardedNegativeRowHeight;
        } catch (java.lang.RuntimeException hintRowConstructionFailure) {
          caughtHintRowFailure = hintRowConstructionFailure;
          hintRowFailureForContext = caughtHintRowFailure;
          hintFailureBeforeContext = hintRowFailureForContext;
          hintMessagePrefix = new StringBuilder().append("qh.L(").append(methodGuard).append(',');
          if (inputWidget == null) {
            inputWidgetDescription = "null";
          } else {
            inputWidgetDescription = "{...}";
          }
          hintMessageBeforeLabel = ((StringBuilder) (Object) hintMessagePrefix).append(inputWidgetDescription).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          hintMessageBeforeFallback = ((StringBuilder) (Object) hintMessageBeforeLabel).append(labelDescription).append(',').append(y).append(',').append(inputWidth).append(',');
          if (fallbackMessage == null) {
            fallbackDescription = "null";
          } else {
            fallbackDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hintFailureBeforeContext), ((StringBuilder) (Object) hintMessageBeforeFallback).append(fallbackDescription).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(byte methodGuard) {
        ((UsernameAvailabilityValidator) ((Object) this.displayNameInput.getValidationProvider((byte) -128))).invalidateCachedUsernameAvailability((byte) -89);
        if (methodGuard != 83) {
            this.onMoreSuggestionsRequested((byte) -25);
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.createButton.enabled = this.passesRequiredInputCreationGates(6626);
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "qh.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    static {
        awaitingLoginLookupPayloadStage = new ClientProtocolStage();
        tutorialFailedMessage = "Unfortunately, you've failed the tutorial. In Geoblox you lose if any geoblox stuck to your avatar reach the edge of the rotating play area. You can either choose to replay the tutorial or, if you feel confident, you can proceed to the proper game.<br>Press <img=2> to continue to the game. Press <img=5> to replay the tutorial.";
        createPasswordHintText = "Passwords must be between 5 and 20 letters and numbers";
    }
}
