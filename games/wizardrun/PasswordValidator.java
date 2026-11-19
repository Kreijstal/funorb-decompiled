/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordValidator extends TextFieldValidator {
    static int[] field_m;
    private EditableTextWidget usernameField;
    private EditableTextWidget emailField;

    final ValidationState validateText(int param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        ValidationState stackIn_3_0 = null;
        ValidationState stackIn_7_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.usernameField.text.toLowerCase();
          var4 = param1.toLowerCase();
          if (param0 == ~var4.length()) {
            stackIn_3_0 = DisplayNameSyntaxHelpers.field_c;
            return stackIn_3_0;
          }
          if (!WidgetTheme.isPasswordAllowedForUsername(var4, var3, 67)) {
            stackIn_7_0 = DisplayNameSyntaxHelpers.field_c;
            return stackIn_7_0;
          }
          if (!this.containsEmailPart((byte) 38, param1)) {
            return ContentTransitionDialog.field_V;
          }
          stackIn_11_0 = DisplayNameSyntaxHelpers.field_c;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("rh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    PasswordValidator(EditableTextWidget param0, EditableTextWidget param1, EditableTextWidget param2) {
        super(param0);
        try {
          this.usernameField = param1;
          this.emailField = param2;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean containsEmailPart(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.emailField.text.toLowerCase();
          if (param0 != 38) {
            PasswordValidator.releaseStatics(115);
          }
          var4 = param1.toLowerCase();
          if (var3.length() > 0) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var3.lastIndexOf("@");
            if (var5 >= 0 &&
              var5 < var3.length() - 1) {
              var6 = var3.substring(0, var5);
              var7 = var3.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (0 <= var4.indexOf(var7));
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("rh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 98 % ((param0 + 57) / 39);
        field_m = null;
    }

    final String getTextValidationMessage(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_23_0 = null;
        String stackIn_26_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.usernameField.text.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            return null;
          }
          if (param1 != -1) {
            var6 = (String) null;
            this.validateText(126, (String) null);
          }
          var5 = var4;
          if (UiWidget.isPasswordLengthInvalid(var5, param1 ^ -125)) {
            stackIn_7_0 = QuickChatDynamicCommand.field_d;
            return stackIn_7_0;
          }
          if (BoundedRandomAccessFile.containsNonAlphanumericPasswordCharacter((byte) -56, var5)) {
            stackIn_11_0 = ProgressSubmission.field_o;
            return stackIn_11_0;
          }
          if (ValidatedTextField.isRepeatedCharacterPassword(false, var5)) {
            stackIn_15_0 = DraggableWidget.field_L;
            return stackIn_15_0;
          }
          if (this.containsEmailPart((byte) 38, param0)) {
            stackIn_18_0 = NodeHashTableIterator.field_c;
            return stackIn_18_0;
          }
          if (0 >= var7.length()) {
            stackIn_33_0 = RadialSelectorWidget.field_F;
            return stackIn_33_0;
          }
          if (DropTargetWidget.passwordContainsUsername(var7, (byte) -117, var5)) {
            stackIn_23_0 = NetworkArchiveRequest.field_v;
            return stackIn_23_0;
          }
          if (EncryptedLoginHelpers.usernameContainsPassword(0, var7, var5)) {
            stackIn_26_0 = LoginPacketBuilder.field_d;
            return stackIn_26_0;
          }
          if (!PasswordContentHelpers.containsNormalizedUsername(var5, var7, 0)) {
            stackIn_31_0 = QuickChatDynamicCommand.field_d;
            return stackIn_31_0;
          }
          stackIn_29_0 = NetworkArchiveRequest.field_v;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("rh.A(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
