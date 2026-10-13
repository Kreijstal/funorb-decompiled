/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextFieldValidator {
    private EditableTextWidget primaryInput;
    static String field_j;
    static ClientUiComponent field_l;

    final static void c(byte param0) {
        if (param0 > -120) {
          MatchingTextValidator.c((byte) 114);
          qf.a(56);
          gl.a(124, 4);
          return;
        }
        qf.a(56);
        gl.a(124, 4);
    }

    public static void g(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -96 / ((param0 + 9) / 42);
    }

    final ValidationState validateText(int obfuscationGuard, String text) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_5_0 = null;
        ValidationState stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.primaryInput instanceof ValidationProvider) {
            var3 = ((ValidationProvider) ((Object) this.primaryInput)).getValidationSource(-918933630);
            if (var3 != null &&
              var3.getValidationState(false) != oo.validationValid) {
              stackIn_5_0 = rn.validationInvalid;
              return stackIn_5_0;
            }
          }
          if (obfuscationGuard != -3137) {
            field_l = (ClientUiComponent) null;
          }
          if (!text.equals(this.primaryInput.text)) {
            stackIn_11_0 = rn.validationInvalid;
          } else {
            stackIn_11_0 = oo.validationValid;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("di.R(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    MatchingTextValidator(EditableTextWidget input, EditableTextWidget primaryInput) {
        super(input);
        try {
          this.primaryInput = primaryInput;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "di.<init>(" + (input != null ? "{...}" : "null") + ',' + (primaryInput != null ? "{...}" : "null") + ')');
        }
    }

    final String describeText(byte obfuscationGuard, String text) {
        ValidationSource var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.primaryInput instanceof ValidationProvider) {
            var3 = ((ValidationProvider) ((Object) this.primaryInput)).getValidationSource(-918933630);
            if (var3 != null) {
              if (var3.getValidationState(false) == oo.validationValid &&
                !text.equals(this.primaryInput.text)) {
                stackIn_7_0 = BitmapTextLayout.field_j;
                return stackIn_7_0;
              }
              stackIn_9_0 = var3.getValidationMessage((byte) 55);
              return stackIn_9_0;
            }
          }
          if (obfuscationGuard <= 89) {
            MatchingTextValidator.c((byte) 94);
          }
          if (text.equals(this.primaryInput.text)) {
            return null;
          }
          stackIn_15_0 = BitmapTextLayout.field_j;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("di.O(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    static {
        field_j = "<%0> cannot join; the game is full.";
    }
}
