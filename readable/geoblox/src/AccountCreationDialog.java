/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends MessageDialog implements ButtonActivationListener {
    private AccountCreationForm accountForm;
    private boolean accountIneligible;
    static String notLoggedInText;
    private boolean resultHandled;
    static int avatarTintStartColor;

    public static void releaseStaticReferences(int methodGuard) {
        int guardQuotient = -70 / ((methodGuard - 27) / 48);
        notLoggedInText = null;
    }

    final static void showLoggingInDialog(String loginIdentifier, byte methodGuard, boolean showLoginOnDismiss, String password) {
        try {
            TextTemplateLookupSupport.currentLoginIdentifier = loginIdentifier;
            LoginPasswordSupport.currentLoginPassword = password;
            int guardRemainder = -62 % ((13 - methodGuard) / 62);
            MessageDialogSupport.showMessageDialog(DisplayModeInfo.loggingInText, 480, showLoginOnDismiss);
        } catch (RuntimeException dialogFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogFailure), "r.E(" + (loginIdentifier != null ? "{...}" : "null") + ',' + methodGuard + ',' + showLoginOnDismiss + ',' + (password != null ? "{...}" : "null") + ')');
        }
    }

    private final void showCreationResult(boolean suppressIneligibleAction, UsernameAvailabilityQuery result, byte methodGuard) {
        RuntimeException resultFailureBeforeDescription = null;
        StringBuilder resultMessagePrefix = null;
        String queryResultDescription = null;
        RuntimeException resultFailure = null;
        String resultMessage = null;
        RuntimeException resultFailureForContext = null;
        MessageDialogContent resultContent = null;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          this.resultHandled = true;
          if (methodGuard > -21) {
            notLoggedInText = (String) null;
          }
          if (!result.accepted) {
            if (null == result.suggestedUsernames) {
              resultMessage = result.candidateOrFailureText;
              if (result.responseCode == 248) {
                if (!suppressIneligibleAction) {
                  AgeValidator.markAccountIneligibleAndMaybeRequestGameArchives(-65);
                }
                this.accountIneligible = true;
                resultMessage = DisplayNamePanel.createIneligibleText;
              }
            } else {
              resultMessage = ResourceArchive.createUsernameUnavailableText;
              if (null != this.accountForm) {
                this.accountForm.onMoreSuggestionsRequested((byte) 83);
              }
            }
          } else {
            resultMessage = ValidationState.createAccountSuccessText;
          }
          resultContent = new MessageDialogContent((MessageDialog) (this), UiFontResources.commonUiBoldFont, resultMessage);
          if (result.accepted) {
            if (result.underThirteenFlag) {
              this.replaceContent(new Under13TermsPanel(this), -111);
              return;
            }
            resultContent.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
          } else {
            if (!this.accountIneligible) {
              if (result.responseCode == 5) {
                resultContent.appendActionButton(TriangleMesh.reloadGameText, 1, 11);
                resultContent.appendActionButton(DisplayModeInfo.quitToWebsiteText, 1, 17);
              } else {
                resultContent.appendActionButton(GameGraphicsResources.backText, 1, -1);
              }
            } else {
              resultContent.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
            }
            if (result.responseCode == 3) {
              resultContent.appendActionButton(WidgetContainer.toServerListText, 1, 7);
            } else {
              if (6 == result.responseCode) {
                resultContent.appendActionButton(AvatarFeedbackSupport.toCustomerSupportText, 1, 9);
              }
            }
          }
          this.replaceContent(resultContent, -36);
          return;
        } catch (java.lang.RuntimeException caughtResultFailure) {
          resultFailure = caughtResultFailure;
          resultFailureForContext = resultFailure;
          resultFailureBeforeDescription = resultFailureForContext;
          resultMessagePrefix = new StringBuilder().append("r.G(").append(suppressIneligibleAction).append(',');
          if (result == null) {
            queryResultDescription = "null";
          } else {
            queryResultDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resultFailureBeforeDescription), ((StringBuilder) (Object) resultMessagePrefix).append(queryResultDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    AccountCreationDialog(DialogLayer dialogLayer, AccountCreationForm accountForm) {
        super(dialogLayer, UiFontResources.commonUiBoldFont, KeyedIntRecordSubmission.creatingYourAccountText, false, false);
        try {
            this.accountForm = accountForm;
        } catch (RuntimeException dialogInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogInitializationFailure), "r.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (accountForm != null ? "{...}" : "null") + ')');
        }
    }

    final static TextValidationFailure validateEmailLocalPart(String localPart, boolean preserveNotLoggedInText) {
        TextValidationFailure emptyComponentFailureBeforeReturn = null;
        TextValidationFailure overlongComponentFailureBeforeReturn = null;
        TextValidationFailure missingClosingQuoteFailureBeforeReturn = null;
        int toggledEscapeState = 0;
        TextValidationFailure unescapedQuoteFailureBeforeReturn = null;
        TextValidationFailure invalidDotFailureBeforeReturn = null;
        TextValidationFailure invalidCharacterFailureBeforeReturn = null;
        Object nullSuccessBeforeReturn = null;
        RuntimeException validationFailureBeforeDescription = null;
        StringBuilder validationMessagePrefix = null;
        String localPartDescription = null;
        RuntimeException caughtValidationFailure = null;
        int localPartLength = 0;
        RuntimeException validationFailureForContext = null;
        int escapeOrPreviousDotState = 0;
        int characterIndex = 0;
        int characterCode = 0;
        int unusedClientControlSnapshot = 0;
        int escapeOrPreviousDotStateLiteralPhase1;
        int characterIndexLiteralPhase1;
        int characterCodeLiteralPhase1;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          localPartLength = localPart.length();
          if (localPartLength == 0) {
            emptyComponentFailureBeforeReturn = InstrumentNoteMask.missingTextComponentFailure;
            return emptyComponentFailureBeforeReturn;
          }
          if (localPartLength > 64) {
            overlongComponentFailureBeforeReturn = ButtonWidget.overlongTextFailure;
            return overlongComponentFailureBeforeReturn;
          }
          if (34 == localPart.charAt(0)) {
            if (localPart.charAt(localPartLength - 1) != 34) {
              missingClosingQuoteFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
              return missingClosingQuoteFailureBeforeReturn;
            }
            escapeOrPreviousDotState = 0;
            for (characterIndex = 1; characterIndex < -1 + localPartLength; characterIndex++) {
              characterCode = localPart.charAt(characterIndex);
              if (characterCode == 92) {
                toggledEscapeState = (escapeOrPreviousDotState != 0) ? 0 : 1;
                escapeOrPreviousDotState = toggledEscapeState;
              } else {
                if (characterCode == 34 &&
                    escapeOrPreviousDotState == 0) {
                  unescapedQuoteFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                  return unescapedQuoteFailureBeforeReturn;
                }
                escapeOrPreviousDotState = 0;
              }
            }
            return null;
          }
          escapeOrPreviousDotStateLiteralPhase1 = 0;
          for (characterIndexLiteralPhase1 = 0; characterIndexLiteralPhase1 < localPartLength; characterIndexLiteralPhase1++) {
            unquotedLocalPartCharacter: {
              characterCodeLiteralPhase1 = localPart.charAt(characterIndexLiteralPhase1);
              if (characterCodeLiteralPhase1 == 46) {
                if (0 != characterIndexLiteralPhase1 &&
                    characterIndexLiteralPhase1 != -1 + localPartLength &&
                    escapeOrPreviousDotStateLiteralPhase1 == 0) {
                  escapeOrPreviousDotStateLiteralPhase1 = 1;
                  break unquotedLocalPartCharacter;
                }
                invalidDotFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                return invalidDotFailureBeforeReturn;
              }
              if (StatefulWidgetRenderer.emailLocalPartCharacters.indexOf(characterCodeLiteralPhase1) == -1) {
                invalidCharacterFailureBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
                return invalidCharacterFailureBeforeReturn;
              }
              escapeOrPreviousDotStateLiteralPhase1 = 0;
            }
          }
          if (preserveNotLoggedInText) {
            return null;
          }
          notLoggedInText = (String) null;
          nullSuccessBeforeReturn = null;
          return (TextValidationFailure) (nullSuccessBeforeReturn);
        } catch (java.lang.RuntimeException validationFailure) {
          caughtValidationFailure = validationFailure;
          validationFailureForContext = caughtValidationFailure;
          validationFailureBeforeDescription = validationFailureForContext;
          validationMessagePrefix = new StringBuilder().append("r.B(");
          if (localPart == null) {
            localPartDescription = "null";
          } else {
            localPartDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) validationFailureBeforeDescription), ((StringBuilder) (Object) validationMessagePrefix).append(localPartDescription).append(',').append(preserveNotLoggedInText).append(')').toString());
        }
    }

    final void showIneligibleResult(int methodGuard) {
        this.showCreationResult(true, RankedComparisonSupport.createUsernameResponseQuery(DisplayNamePanel.createIneligibleText, 248, false), (byte) -57);
        if (methodGuard != 12086) {
            this.resultHandled = false;
        }
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        if (this.accountIneligible) {
            TextTemplateLookupSupport.openLoginPanel(true, false, false);
            return;
        }
        if (methodGuard != -20) {
            return;
        }
        try {
            SessionTextHistorySupport.prepareAccountCreationUi(-112);
            this.dismissDialog((byte) -104);
        } catch (RuntimeException activationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) activationFailure), "r.Q(" + buttonX + ',' + methodGuard + ',' + buttonY + ',' + pointerButton + ',' + (button != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceDialogAnimation(int methodGuard) {
        UsernameAvailabilityQuery creationQueryResult = null;
        if (methodGuard != -1) {
            notLoggedInText = (String) null;
        }
        if (this.dialogVisible &&
            !this.resultHandled) {
            creationQueryResult = MatchingTextValidator.pollAccountCreationUsernameResult((byte) 93);
            if (creationQueryResult != null) {
                this.showCreationResult(false, creationQueryResult, (byte) -69);
            }
        }
        return super.advanceDialogAnimation(-1);
    }

    static {
        notLoggedInText = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
