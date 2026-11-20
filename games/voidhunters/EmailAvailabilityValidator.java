/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextFieldValidator {
    private String checkedEmail;
    private boolean emailAvailable;
    private MatchingFieldValidator confirmationValidator;

    final static boolean a(int param0, boolean param1, int param2) {
        if (!param1) {
          return ((0 != (24 & param0) ? 1 : 0) | ((544 & param0) == 544 ? 1 : 0)) != 0;
        }
        EmailAvailabilityValidator.a(126, true, -36);
        return ((0 != (24 & param0) ? 1 : 0) | ((544 & param0) == 544 ? 1 : 0)) != 0;
    }

    final ValidationState validateValue(String param0, int param1) {
        EmailAvailabilityCheck var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_8_0 = null;
        ValidationState stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.confirmationValidator.validateValue(param0, param1) == SetArmageddonLength.invalidInput) {
            stackIn_2_0 = SetArmageddonLength.invalidInput;
            return stackIn_2_0;
          }
          if (!param0.equals(this.checkedEmail)) {
            var3 = EmailAvailabilityChecks.getEmailAvailabilityCheck(param0, param1 ^ 16384);
            if (!var3.isComplete(4)) {
              stackIn_8_0 = SetFighterRepairTime.pendingValidation;
              return stackIn_8_0;
            }
            this.checkedEmail = param0;
            this.emailAvailable = var3.isAvailable((byte) -20);
          }
          if (!this.emailAvailable) {
            stackIn_13_0 = SetArmageddonLength.invalidInput;
          } else {
            stackIn_13_0 = GetShipPersistence.validInput;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bla.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final String getValueValidationMessage(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.confirmationValidator.validateValue(param0, 16384) == SetArmageddonLength.invalidInput) {
            stackIn_3_0 = this.confirmationValidator.getValueValidationMessage(param0, -1);
            return stackIn_3_0;
          }
          if (this.validateValue(param0, 16384) == SetArmageddonLength.invalidInput) {
            stackIn_7_0 = FullscreenMembershipDialog.field_N;
            return stackIn_7_0;
          }
          if (param1 != -1) {
            this.checkedEmail = (String) null;
          }
          stackIn_11_0 = ModelFaceAttachment.field_f;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bla.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    EmailAvailabilityValidator(UiTextField param0, UiTextField param1) {
        super(param0);
        this.checkedEmail = "";
        this.emailAvailable = false;
        try {
          this.confirmationValidator = new MatchingFieldValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "bla.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
