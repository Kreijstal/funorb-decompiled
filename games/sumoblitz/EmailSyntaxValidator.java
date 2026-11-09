/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailSyntaxValidator extends TextInputValidator {
    static int field_e;
    static int field_f;

    final static ServerIntArrayRequest requestServerIntArray(byte guard, int opcode) {
        int var3 = 115 % ((guard - 30) / 47);
        ServerIntArrayRequest var2 = new ServerIntArrayRequest();
        CheckboxWidget.field_E.addLast((IntrusiveNode) (var2), (byte) 39);
        ScreenNameValidator.sendServerIntArrayRead(127, opcode);
        return var2;
    }

    final String messageForText(int guard, String text) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validateText((byte) 26, text) == AccountConnectionPhase.INVALID) {
            stackIn_2_0 = DroneDebris.pleaseCheckIfAddressText;
            return stackIn_2_0;
          }
          if (guard == 0) {
            stackIn_7_0 = ProxySocketConnector.emailIsValidText;
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ew.B(").append(guard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    EmailSyntaxValidator(TextInputWidget field) {
        super(field);
    }

    final ValidationStatus validateText(byte guard, String text) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        ValidationStatus stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 26) {
            field_e = 68;
          }
          stackIn_5_0 = (BlendMode.validateEmailAddress(text, (byte) 38) != null) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (var3_int != 0) {
            return PerlinNoiseFactory.VALID;
          }
          stackIn_8_0 = AccountConnectionPhase.INVALID;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ew.E(").append(guard).append(',');
          if (text == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
    }
}
