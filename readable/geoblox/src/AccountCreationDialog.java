/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationDialog extends MessageDialog implements ButtonActivationListener {
    private AccountCreationForm accountForm;
    private boolean accountIneligible;
    static String field_sb;
    private boolean resultHandled;
    static int avatarTintStartColor;

    public static void r(int param0) {
        int var1 = -70 / ((param0 - 27) / 48);
        field_sb = null;
    }

    final static void a(String param0, byte param1, boolean param2, String param3) {
        try {
            TextTemplateLookupSupport.currentLoginIdentifier = param0;
            LoginPasswordSupport.currentLoginPassword = param3;
            int var4_int = -62 % ((13 - param1) / 62);
            MessageDialogSupport.showMessageDialog(DisplayModeInfo.loggingInText, 480, param2);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void showCreationResult(boolean suppressIneligibleAction, UsernameAvailabilityQuery result, byte methodGuard) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        MessageDialogContent var5 = null;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          this.resultHandled = true;
          if (methodGuard > -21) {
            field_sb = (String) null;
          }
          if (!result.field_g) {
            if (null == result.field_a) {
              var4 = result.field_e;
              if (result.field_j == 248) {
                if (!suppressIneligibleAction) {
                  AgeValidator.h(-65);
                }
                this.accountIneligible = true;
                var4 = DisplayNamePanel.createIneligibleText;
              }
            } else {
              var4 = ResourceArchive.createUsernameUnavailableText;
              if (null != this.accountForm) {
                this.accountForm.onMoreSuggestionsRequested((byte) 83);
              }
            }
          } else {
            var4 = ValidationState.createAccountSuccessText;
          }
          var5 = new MessageDialogContent((MessageDialog) (this), UiFontResources.commonUiBoldFont, var4);
          if (result.field_g) {
            if (result.field_d) {
              this.replaceContent(new Under13TermsPanel((AccountCreationDialog) (this)), -111);
              return;
            }
            var5.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
          } else {
            if (!this.accountIneligible) {
              if (result.field_j == 5) {
                var5.appendActionButton(TriangleMesh.reloadGameText, 1, 11);
                var5.appendActionButton(DisplayModeInfo.quitToWebsiteText, 1, 17);
              } else {
                var5.appendActionButton(GameGraphicsResources.backText, 1, -1);
              }
            } else {
              var5.appendButton(-2, UsernameQuerySupport.continueText, (WidgetListener) (this));
            }
            if (result.field_j == 3) {
              var5.appendActionButton(WidgetContainer.toServerListText, 1, 7);
            } else {
              if (6 == result.field_j) {
                var5.appendActionButton(AvatarFeedbackSupport.toCustomerSupportText, 1, 9);
              }
            }
          }
          this.replaceContent(var5, -36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("r.G(").append(suppressIneligibleAction).append(',');
          if (result == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    AccountCreationDialog(DialogLayer dialogLayer, AccountCreationForm accountForm) {
        super(dialogLayer, UiFontResources.commonUiBoldFont, KeyedIntRecordSubmission.creatingYourAccountText, false, false);
        try {
            this.accountForm = accountForm;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.<init>(" + (dialogLayer != null ? "{...}" : "null") + ',' + (accountForm != null ? "{...}" : "null") + ')');
        }
    }

    final static TextValidationFailure a(String param0, boolean param1) {
        TextValidationFailure stackIn_4_0 = null;
        TextValidationFailure stackIn_8_0 = null;
        TextValidationFailure stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        TextValidationFailure stackIn_27_0 = null;
        TextValidationFailure stackIn_41_0 = null;
        TextValidationFailure stackIn_46_0 = null;
        Object stackIn_52_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = InstrumentNoteMask.field_f;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = ButtonWidget.overlongTextFailure;
            return stackIn_8_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_13_0 = ArchiveLoadStep.field_h;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if ((var5 == 34) &&
                    (var3 == 0)) {
                  stackIn_27_0 = ArchiveLoadStep.field_h;
                  return stackIn_27_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            L1: {
              var5 = param0.charAt(var4);
              if (var5 == 46) {
                if ((0 != var4) &&
                    (var4 != -1 + var2_int) &&
                    (var3 == 0)) {
                  var3 = 1;
                  break L1;
                }
                stackIn_41_0 = ArchiveLoadStep.field_h;
                return stackIn_41_0;
              }
              if (StatefulWidgetRenderer.emailLocalPartCharacters.indexOf(var5) == -1) {
                stackIn_46_0 = ArchiveLoadStep.field_h;
                return stackIn_46_0;
              }
              var3 = 0;
            }
          }
          if (param1) {
            return null;
          }
          field_sb = (String) null;
          stackIn_52_0 = null;
          return (TextValidationFailure) (stackIn_52_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("r.B(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(')').toString());
        }
    }

    final void showIneligibleResult(int methodGuard) {
        this.showCreationResult(true, RankedComparisonSupport.createUsernameResponseQuery(DisplayNamePanel.createIneligibleText, 248, false), (byte) -57);
        if (methodGuard != 12086) {
            this.resultHandled = false;
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        if (!(!this.accountIneligible)) {
            TextTemplateLookupSupport.openLoginPanel(true, false, false);
            return;
        }
        if (param1 != -20) {
            return;
        }
        try {
            SessionTextHistorySupport.prepareAccountCreationUi(-112);
            this.dismissDialog((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "r.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean advanceDialogAnimation(int param0) {
        UsernameAvailabilityQuery var2 = null;
        if (param0 != -1) {
            field_sb = (String) null;
        }
        if ((this.dialogVisible) &&
            (!(this.resultHandled))) {
            var2 = MatchingTextValidator.d((byte) 93);
            if (!(var2 == null)) {
                this.showCreationResult(false, var2, (byte) -69);
            }
        }
        return super.advanceDialogAnimation(-1);
    }

    static {
        field_sb = "You are not currently logged in to this service. To store your score, progress and any Achievements, you must log in or create an account.";
    }
}
