/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailAvailabilityValidator extends TextInputValidator {
    private String field_j;
    static AsyncResourceDownloader field_n;
    static int sessionServerNumber;
    private boolean field_i;
    private MatchingTextValidator field_m;
    static int[] field_k;

    EmailAvailabilityValidator(TextInputWidget param0, TextInputWidget param1) {
        super(param0);
        this.field_j = "";
        this.field_i = false;
        try {
            this.field_m = new MatchingTextValidator(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "mk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 >= 0) {
            EmailAvailabilityValidator.a(83, true);
            EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -110, param1);
            return;
        }
        EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -110, param1);
    }

    final ValidationState validationStateForText(int guard, String candidateText) {
        EmailAvailabilityQuery var3 = null;
        RuntimeException var3_ref = null;
        ValidationState stackIn_2_0 = null;
        ValidationState stackIn_8_0 = null;
        ValidationState stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m.validationStateForText(guard, candidateText) == WidgetSkinState.field_m) {
            stackIn_2_0 = WidgetSkinState.field_m;
            return stackIn_2_0;
          }
          if (!candidateText.equals(this.field_j)) {
            var3 = SoundSampleCache.a(-1, candidateText);
            if (!var3.isCompleted(-76)) {
              stackIn_8_0 = WidgetSkinState.field_n;
              return stackIn_8_0;
            }
            this.field_j = candidateText;
            this.field_i = var3.isAvailable((byte) -52);
          }
          if (!this.field_i) {
            stackIn_13_0 = WidgetSkinState.field_m;
          } else {
            stackIn_13_0 = SocketArchiveNetworkClient.field_w;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("mk.D(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String validationMessageForText(int guard, String candidateText) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != 422) {
            EmailAvailabilityValidator.c((byte) -50);
          }
          if (this.field_m.validationStateForText(-257, candidateText) == WidgetSkinState.field_m) {
            stackIn_5_0 = this.field_m.validationMessageForText(422, candidateText);
            return stackIn_5_0;
          }
          if (this.validationStateForText(-257, candidateText) != WidgetSkinState.field_m) {
            return da.createEmailValidText;
          }
          stackIn_9_0 = PasswordValidator.createEmailUnavailableAlertText;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mk.A(").append(guard).append(',');
          if (candidateText == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 != -9) {
            field_k = (int[]) null;
        }
    }

    final static SocketConnector a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ProxySocketConnector var4 = null;
        ProxySocketConnector stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 111 % ((param0 - 9) / 38);
          var4 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var4)).field_b = param2;
          ((SocketConnector) ((Object) var4)).field_e = param1;
          stackIn_1_0 = var4;
          return (SocketConnector) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("mk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_k = new int[]{16407324, 16429852, 11199532, 9487646, 15149096};
    }
}
