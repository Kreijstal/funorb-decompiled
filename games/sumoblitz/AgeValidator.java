/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AgeValidator extends TextInputValidator {
    static int field_f;
    static String goBackText;

    final ValidationStatus validateText(byte guard, String text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        ValidationStatus stackIn_2_0 = null;
        ValidationStatus stackIn_5_0 = null;
        ValidationStatus stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) text);
          if (!ContentTransitionPhase.a(guard ^ -13159, var4)) {
            stackIn_2_0 = AccountConnectionPhase.INVALID;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) text);
          var3_int = no.parseDecimal((byte) -128, var5);
          if (guard != 26) {
            stackIn_5_0 = (ValidationStatus) null;
            return stackIn_5_0;
          }
          if (var3_int > 0 &&
            var3_int <= 130) {
            return PerlinNoiseFactory.VALID;
          }
          stackIn_10_0 = AccountConnectionPhase.INVALID;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("jc.E(").append(guard).append(',');
          if (text == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    AgeValidator(TextInputWidget field) {
        super(field);
    }

    public static void releaseStatics(byte param0) {
        goBackText = null;
        int var1 = 5 % ((param0 + 18) / 53);
    }

    final String messageForText(int guard, String text) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText((byte) 26, text) == AccountConnectionPhase.INVALID) {
            stackIn_3_0 = ArchiveLoadRequirement.pleaseEnterYourAgeText;
            return stackIn_3_0;
          }
          if (guard == 0) {
            return null;
          }
          AgeValidator.countEnemyDrones(true);
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("jc.B(").append(guard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static int countEnemyDrones(boolean guard) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var1_int = 0;
          var2 = 0;
          if (!guard) {
            field_f = 118;
          }
          while (var2 < SpriteMask.drones.length) {
            if (SpriteMask.drones[var2] != null &&
              SpriteMask.drones[var2].droneType != 0) {
              var1_int++;
            }
            var2++;
          }
          stackIn_12_0 = var1_int;
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "jc.A(" + guard + ')');
        }
    }

    static {
        field_f = 0;
        goBackText = "Go Back";
    }
}
