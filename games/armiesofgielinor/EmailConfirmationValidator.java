/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailConfirmationValidator extends TextFieldValidator {
    static AntialiasedBitmapFont field_n;
    private String checkedEmail;
    static String field_m;
    static boolean field_l;
    static RgbSprite[] field_o;
    private MatchingTextValidator matchingValidator;
    static int field_p;
    private boolean accepted;

    final ValidationState validateText(int obfuscationGuard, String text) {
        EmailCheckResult result = null;
        RuntimeException failure = null;
        ValidationState mismatchState = null;
        ValidationState checkingState = null;
        ValidationState cachedResultState = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingValidator.validateText(obfuscationGuard ^ 0, text) == rn.validationInvalid) {
            mismatchState = rn.validationInvalid;
            return mismatchState;
          }
          if (!text.equals(this.checkedEmail)) {
            result = dh.getEmailCheckResult(text, (byte) 67);
            if (!result.isComplete((byte) -74)) {
              checkingState = so.validationChecking;
              return checkingState;
            }
            this.checkedEmail = text;
            this.accepted = result.isAccepted(17);
          }
          if (obfuscationGuard != -3137) {
            this.matchingValidator = (MatchingTextValidator) null;
          }
          if (this.accepted) {
            cachedResultState = oo.validationValid;
          } else {
            cachedResultState = rn.validationInvalid;
          }
          return cachedResultState;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_17_0 = failure;
          stackIn_17_1 = new StringBuilder().append("kt.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final String describeText(byte obfuscationGuard, String text) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 89) {
            field_n = (AntialiasedBitmapFont) null;
          }
          if (this.matchingValidator.validateText(-3137, text) == rn.validationInvalid) {
            stackIn_5_0 = this.matchingValidator.describeText((byte) 126, text);
            return stackIn_5_0;
          }
          if (this.validateText(-3137, text) != rn.validationInvalid) {
            stackIn_10_0 = CampaignRewardPreview.field_a;
            return stackIn_10_0;
          }
          stackIn_8_0 = QuickChatHelpDialog.field_Ib;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kt.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_n = null;
        if (param0 < 91) {
          field_n = (AntialiasedBitmapFont) null;
          field_o = null;
          field_m = null;
          return;
        }
        field_o = null;
        field_m = null;
    }

    EmailConfirmationValidator(EditableTextWidget input, EditableTextWidget primaryInput) {
        super(input);
        this.checkedEmail = "";
        this.accepted = false;
        try {
          this.matchingValidator = new MatchingTextValidator(input, primaryInput);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kt.<init>(" + (input != null ? "{...}" : "null") + ',' + (primaryInput != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Auto-respond to <%0>";
        field_l = false;
    }
}
