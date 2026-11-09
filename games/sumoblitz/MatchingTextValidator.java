/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MatchingTextValidator extends TextInputValidator {
    static GraphicsToolkitManager field_h;
    private TextInputWidget matchingInput;
    static int field_i;
    static ServerIntArrayRequest field_g;
    static int[] field_j;
    static String optionsText;

    final ValidationStatus validateText(byte guard, String text) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus stackIn_5_0 = null;
        ValidationStatus stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingInput instanceof ValidationProvider) {
            var3 = ((ValidationProvider) ((Object) this.matchingInput)).getValidator(72);
            if (var3 != null &&
              var3.getStatus(88) != PerlinNoiseFactory.VALID) {
              stackIn_5_0 = AccountConnectionPhase.INVALID;
              return stackIn_5_0;
            }
          }
          if (guard != 26) {
            MatchingTextValidator.intPower(-47, 52, 56);
          }
          if (!text.equals(this.matchingInput.text)) {
            stackIn_11_0 = AccountConnectionPhase.INVALID;
          } else {
            stackIn_11_0 = PerlinNoiseFactory.VALID;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nq.E(").append(guard).append(',');
          if (text == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte guard) {
        field_j = null;
        optionsText = null;
        field_h = null;
        field_g = null;
        if (guard != -31) {
          MatchingTextValidator.intPower(-90, -68, 30);
        }
    }

    final static int intPower(int base, int guard, int exponent) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard <= 72) {
            stackIn_3_0 = 18;
            return stackIn_3_0;
          }
          var3_int = 1;
          while (exponent > 1) {
            if (0 != (1 & exponent)) {
              var3_int = var3_int * base;
            }
            base = base * base;
            exponent = exponent >> 1;
          }
          if (exponent != 1) {
            stackIn_15_0 = var3_int;
            return stackIn_15_0;
          }
          stackIn_13_0 = base * var3_int;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "nq.C(" + base + ',' + guard + ',' + exponent + ')');
        }
    }

    final String messageForText(int guard, String text) {
        InputValidator var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchingInput instanceof ValidationProvider) {
            var3 = ((ValidationProvider) ((Object) this.matchingInput)).getValidator(-114);
            if (var3 != null) {
              if (var3.getStatus(guard - 98) == PerlinNoiseFactory.VALID &&
                !text.equals(this.matchingInput.text)) {
                stackIn_8_0 = LegacyOpenGlFloatPostProcessEffect.thisEntryDoesnTText;
                return stackIn_8_0;
              }
              stackIn_10_0 = var3.getMessage(guard + 3690);
              return stackIn_10_0;
            }
          }
          if (!text.equals(this.matchingInput.text)) {
            stackIn_13_0 = LegacyOpenGlFloatPostProcessEffect.thisEntryDoesnTText;
            return stackIn_13_0;
          }
          if (guard == 0) {
            return null;
          }
          MatchingTextValidator.releaseStatics((byte) 75);
          stackIn_17_0 = null;
          return (String) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("nq.B(").append(guard).append(',');
          if (text == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    MatchingTextValidator(TextInputWidget field, TextInputWidget original) {
        super(field);
        try {
          this.matchingInput = original;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nq.<init>(" + (field != null ? "{...}" : "null") + ',' + (original != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 0;
        optionsText = "options";
        field_j = new int[1];
    }
}
