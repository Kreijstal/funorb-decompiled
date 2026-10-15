/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailConfirmationValidator extends TextFieldValidator {
    static LoginMethodPreference field_k;
    static String[] field_m;
    private String checkedEmail;
    private MatchingTextValidator matchingValidator;
    private boolean emailAvailable;
    static NineSliceFrame textChoiceSelectedButtonFrame;
    static String field_r;
    static NodeDeque pendingBytePayloadRequests;

    final static java.applet.Applet e(byte param0) {
        if (null != CacheEntry.field_x) {
          return CacheEntry.field_x;
        }
        if (param0 >= -60) {
          field_m = (String[]) null;
        }
        return (java.applet.Applet) ((Object) QuickChatCategoryRegistry.field_f);
    }

    final ValidationStatus validateText(String text, byte obfuscationGuard) {
        EmailAvailabilityRequest var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus stackIn_2_0 = null;
        ValidationStatus stackIn_8_0 = null;
        ValidationStatus stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingValidator.validateText(text, obfuscationGuard) == AccountMessageDialog.validationInvalid) {
            stackIn_2_0 = AccountMessageDialog.validationInvalid;
            return stackIn_2_0;
          }
          if (!text.equals(this.checkedEmail)) {
            var3 = DisplayModeInfo.pollEmailAvailability(0, text);
            if (!var3.isCompleted(96)) {
              stackIn_8_0 = SaveResultsPromptScreen.validationPending;
              return stackIn_8_0;
            }
            this.checkedEmail = text;
            this.emailAvailable = var3.isAvailable(false);
          }
          if (!this.emailAvailable) {
            stackIn_13_0 = AccountMessageDialog.validationInvalid;
          } else {
            stackIn_13_0 = DualLinkIterator.validationValid;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("uc.B(");
          if (text == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String describeTextValidation(int obfuscationGuard, String text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 27 / ((-16 - obfuscationGuard) / 50);
          if (this.matchingValidator.validateText(text, (byte) 106) == AccountMessageDialog.validationInvalid) {
            stackIn_2_0 = this.matchingValidator.describeTextValidation(37, text);
            return stackIn_2_0;
          }
          if (this.validateText(text, (byte) 106) != AccountMessageDialog.validationInvalid) {
            return WeightedLruCache.validEmailMessage;
          }
          stackIn_6_0 = ConstructionBackground.field_s;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("uc.C(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    EmailConfirmationValidator(TextFieldWidget textField, TextFieldWidget emailField) {
        super(textField);
        this.checkedEmail = "";
        this.emailAvailable = false;
        try {
          this.matchingValidator = new MatchingTextValidator(textField, emailField);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "uc.<init>(" + (textField != null ? "{...}" : "null") + ',' + (emailField != null ? "{...}" : "null") + ')');
        }
    }

    public static void g(int param0) {
        if (param0 != 0) {
          pendingBytePayloadRequests = (NodeDeque) null;
        }
        field_r = null;
        textChoiceSelectedButtonFrame = null;
        field_m = null;
        field_k = null;
        pendingBytePayloadRequests = null;
    }

    final static void e(int param0) {
        DualLinkNode var2 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        DualLinkNode var2Lifetime1;
        try {
          int var1_int = 9 % ((-59 - param0) / 35);
          AlignedIconLabel.currentSocialServer = null;
          IsaacGenerator.ignoreCount = 0;
          LevelPackSelectScreen.friendCount = 0;
          ToggleButtonWidget.friendEntries.clear((byte) -72);
          CachedArchiveSource.ignoreEntries.clear((byte) -92);
          var2 = BlankScreen.friendIndex.first((byte) 74);
          while (var2 != null) {
            var2.unlinkSecondary(3);
            var2 = BlankScreen.friendIndex.next(false);
          }
          var2Lifetime1 = FullscreenFailureKind.ignoreIndex.first((byte) 122);
          while (var2Lifetime1 != null) {
            var2Lifetime1.unlinkSecondary(3);
            var2Lifetime1 = FullscreenFailureKind.ignoreIndex.next(false);
          }
          LevelMetadata.field_m = 0;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "uc.G(" + param0 + ')');
        }
    }

    final static String[] createSoundEffectNames(int count, String prefix, byte obfuscationGuard) {
        int var4 = 0;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var5 = 0;
        String[] stackIn_3_0 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = new String[count];
          if (obfuscationGuard != -1) {
            stackIn_3_0 = (String[]) null;
            return stackIn_3_0;
          }
          for (var4 = 0; var4 < count; var4++) {
            var3[var4] = prefix + "_0" + var4;
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("uc.E(").append(count).append(',');
          if (prefix == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean f(int param0) {
        if (param0 != 21651) {
          return false;
        }
        return DialogPointerGlobals.textChoiceDialogOpen;
    }

    static {
        field_r = "Match by...";
        field_m = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_k = new LoginMethodPreference("email");
        pendingBytePayloadRequests = new NodeDeque();
    }
}
