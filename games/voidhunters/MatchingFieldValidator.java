/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingFieldValidator extends TextFieldValidator {
    static int field_k;
    static ProgressDialog field_i;
    static String field_f;
    static GameSession field_g;
    static String field_j;
    private UiTextField referenceField;

    final ValidationState validateValue(String param0, int param1) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_6_0 = null;
        ValidationState stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.referenceField instanceof ValidatableInput) {
            var3 = ((ValidatableInput) ((Object) this.referenceField)).getValidator(-782444220);
            if (var3 != null &&
              var3.getValidationState((byte) 35) != GetShipPersistence.validInput) {
              stackIn_6_0 = SetArmageddonLength.invalidInput;
              return stackIn_6_0;
            }
          }
          if (param1 != 16384) {
            field_k = -96;
          }
          if (param0.equals(this.referenceField.text)) {
            stackIn_12_0 = GetShipPersistence.validInput;
          } else {
            stackIn_12_0 = SetArmageddonLength.invalidInput;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("vqa.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String getValueValidationMessage(String param0, int param1) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.referenceField instanceof ValidatableInput) {
            var3 = ((ValidatableInput) ((Object) this.referenceField)).getValidator(-782444220);
            if (var3 != null) {
              if (var3.getValidationState((byte) 35) == GetShipPersistence.validInput &&
                !param0.equals(this.referenceField.text)) {
                stackIn_6_0 = ChatPermissions.field_a;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.getValidationMessage((byte) -79);
              return stackIn_8_0;
            }
          }
          if (!param0.equals(this.referenceField.text)) {
            stackIn_11_0 = ChatPermissions.field_a;
            return stackIn_11_0;
          }
          if (param1 == -1) {
            return null;
          }
          MatchingFieldValidator.clearSharedReferences(108);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("vqa.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 1) {
          return;
        }
        field_i = null;
        field_j = null;
        field_f = null;
        field_g = null;
    }

    MatchingFieldValidator(UiTextField param0, UiTextField param1) {
        super(param0);
        try {
          this.referenceField = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = 1;
        field_f = "Add action (Set custom variable label)";
        field_j = "Encouraging rule breaking";
        CarouselPlayerEventFactory discarded$0 = new CarouselPlayerEventFactory();
    }
}
