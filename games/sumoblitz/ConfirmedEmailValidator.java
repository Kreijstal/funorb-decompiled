/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConfirmedEmailValidator extends TextInputValidator {
    private MatchingTextValidator matchValidator;
    private String lastCheckedEmail;
    static MouseInputHandler field_h;
    static String field_f;
    private boolean emailAvailable;

    ConfirmedEmailValidator(TextInputWidget confirmation, TextInputWidget original) {
        super(confirmation);
        this.lastCheckedEmail = "";
        this.emailAvailable = false;
        try {
          this.matchValidator = new MatchingTextValidator(confirmation, original);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wk.<init>(" + (confirmation != null ? "{...}" : "null") + ',' + (original != null ? "{...}" : "null") + ')');
        }
    }

    final String messageForText(int guard, String text) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        String stackIn_7_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 0) {
            var4 = (String) null;
            this.messageForText(-5, (String) null);
          }
          if (this.matchValidator.validateText((byte) 26, text) == AccountConnectionPhase.INVALID) {
            stackIn_4_0 = this.matchValidator.messageForText(0, text);
            return stackIn_4_0;
          }
          if (this.validateText((byte) 26, text) != AccountConnectionPhase.INVALID) {
            stackIn_9_0 = ProxySocketConnector.emailIsValidText;
            return stackIn_9_0;
          }
          stackIn_7_0 = BeveledCheckboxRenderer.emailAddressIsUnavailableText;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("wk.B(").append(guard).append(',');
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final ValidationStatus validateText(byte guard, String text) {
        bj var3 = null;
        RuntimeException var3_ref = null;
        ValidationStatus stackIn_3_0 = null;
        ValidationStatus stackIn_7_0 = null;
        ValidationStatus stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.matchValidator.validateText(guard, text) == AccountConnectionPhase.INVALID) {
            stackIn_3_0 = AccountConnectionPhase.INVALID;
            return stackIn_3_0;
          }
          if (!text.equals(this.lastCheckedEmail)) {
            var3 = RasterBuffer.a(guard ^ 27, text);
            if (!var3.a(true)) {
              stackIn_7_0 = kt.PENDING;
              return stackIn_7_0;
            }
            this.lastCheckedEmail = text;
            this.emailAvailable = var3.c(-1);
          }
          if (this.emailAvailable) {
            stackIn_12_0 = qe.VALID;
          } else {
            stackIn_12_0 = AccountConnectionPhase.INVALID;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("wk.E(").append(guard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        field_h = null;
        if (param0) {
          ConfirmedEmailValidator.releaseStatics(true);
        }
    }

    static {
        field_h = new MouseInputHandler();
    }
}
