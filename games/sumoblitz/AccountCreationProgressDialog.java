/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountCreationProgressDialog extends MessageDialog implements WidgetActionListener {
    static boolean field_ob;
    static char[] CP1252_EXTENSION;
    private boolean resultShown;
    private boolean ineligible;
    private AccountCreationForm form;

    AccountCreationProgressDialog(DialogLayer layer, AccountCreationForm owner) {
        super(layer, LegacyOpenGlDisplayLists.field_a, ClientException.creatingYourAccountText, false, false);
        try {
          this.form = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "uk.<init>(" + (layer != null ? "{...}" : "null") + ',' + (owner != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        CP1252_EXTENSION = null;
        if (!param0) {
          return;
        }
        AccountCreationProgressDialog.releaseStatics(false);
    }

    private final void showResult(boolean skipEligibilityReset, byte guard, AccountServiceResult result) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StatusMessagePanel var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.resultShown = true;
          if (!result.success) {
            if (result.nameSuggestions == null) {
              var4 = result.errorMessage;
              if (result.errorCode == 248) {
                if (!skipEligibilityReset) {
                  BufferedCacheFile.setLegacyStatusFlag(0);
                }
                var4 = HudMessageSupport.unfortunatelyYouAreNotText;
                this.ineligible = true;
              }
            } else {
              var4 = LegacyOpenGlReflectionEffect.field_e;
              if (null != this.form) {
                this.form.invalidateNameAvailability((byte) -119);
              }
            }
          } else {
            var4 = ArenaDefinition.accountCreatedSuccessfullyText;
          }
          var5 = -1 / ((-1 - guard) / 45);
          var6 = new StatusMessagePanel((MessageDialog) (this), LegacyOpenGlDisplayLists.field_a, var4);
          if (!result.success) {
            if (this.ineligible) {
              var6.appendButton(EmailCredentials.continueText, (byte) -123, (WidgetListener) (this));
            } else {
              if (result.errorCode != 5) {
                var6.addResultButton(FullscreenCanvas.backText, -1, true);
              } else {
                var6.addResultButton(DisplayModeFailure.reloadGameText, 11, true);
                var6.addResultButton(HiscoreRequest.quitToWebsiteText, 17, true);
              }
            }
            if (result.errorCode == 3) {
              var6.addResultButton(IntroFinalFrameResources.toServerListText, 7, true);
            } else {
              if (result.errorCode != 6) {
                this.transitionToContent((byte) -123, var6);
                return;
              }
              var6.addResultButton(PowerupTrailParticle.toCustomerSupportText, 9, true);
            }
          } else {
            if (result.showUnderageInfo) {
              this.transitionToContent((byte) -95, new UnderageAccountInfoPanel(this));
              return;
            }
            var6.appendButton(EmailCredentials.continueText, (byte) -123, (WidgetListener) (this));
          }
          this.transitionToContent((byte) -123, var6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("uk.V(").append(skipEligibilityReset).append(',').append(guard).append(',');
          if (result == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    final void showIneligibleResult(boolean skipEligibilityReset) {
        this.showResult(skipEligibilityReset, (byte) 127, LegacyOpenGlReflectionEffect.accountError(-91, HudMessageSupport.unfortunatelyYouAreNotText, 248));
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        if (guard != 710) {
          field_ob = true;
        }
        if (this.ineligible) {
          WidgetStateStyle.showLoginDialog((byte) -40, false, true);
          return;
        }
        try {
          LoginIdentifierSupport.retryAccountCreationLogin(false);
          this.closeDialog(-7);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "uk.C(" + action + ',' + guard + ',' + (source != null ? "{...}" : "null") + ',' + pointerX + ',' + pointerY + ')');
        }
    }

    final static String normalizeAccountName(int guard, CharSequence name) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (name == null) {
            return null;
          }
          var2_int = 0;
          var3 = name.length();
          while (var3 > var2_int) {
            if (AccountNameSupport.isNameSeparator((byte) -98, name.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (AccountNameSupport.isNameSeparator((byte) -95, name.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = name.charAt(var6);
            if (OpenGlRectangleTexture.isNormalizableNameCharacter((byte) 61, (char) var7)) {
              var8 = LegacyOpenGlEffectManager.normalizeNameCharacter(241, (char) var7);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (~var5.length() != guard) {
            stackIn_29_0 = var5.toString();
            return stackIn_29_0;
          }
          stackIn_27_0 = null;
          return (String) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_32_0 = var2;
          stackIn_32_1 = new StringBuilder().append("uk.P(").append(guard).append(',');
          if (name == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final boolean advanceAnimation(int guard) {
        AccountServiceResult var2 = null;
        if (this.open) {
          if (this.resultShown) {
            if (guard == -28778) {
              return super.advanceAnimation(guard + 0);
            }
            return false;
          }
          var2 = ResourceArchive.pollAccountCreationResult((byte) 94);
          if (var2 == null) {
            if (guard == -28778) {
              return super.advanceAnimation(guard + 0);
            }
            return false;
          }
          this.showResult(false, (byte) -128, var2);
        }
        if (guard == -28778) {
          return super.advanceAnimation(guard + 0);
        }
        return false;
    }

    static {
        field_ob = false;
        CP1252_EXTENSION = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
