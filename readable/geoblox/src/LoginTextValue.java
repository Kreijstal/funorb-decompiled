/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginTextValue {
    static String[] field_a;
    private String text;
    private boolean includeInLookupRequest;
    static LoginMethod field_b;

    LoginTextValue(String text) {
        this(text, false);
    }

    final String getText(int methodGuard) {
        if (methodGuard != 16925) {
            this.isIncludedInLookupRequest((byte) -83);
            return this.text;
        }
        return this.text;
    }

    LoginTextValue(String text, boolean includeInLookupRequest) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.text = text;
          if (null == this.text) {
            this.text = "";
          }
          if (!includeInLookupRequest) {
            stackIn_6_1 = false;
          } else {
            stackIn_6_1 = true;
          }
          ((LoginTextValue) (this)).includeInLookupRequest = stackIn_6_1;
          if (this.text.length() != 0) {
            return;
          }
          this.includeInLookupRequest = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("mb.<init>(");
          if (text == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(includeInLookupRequest).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    final boolean isIncludedInLookupRequest(byte methodGuard) {
        if (methodGuard <= 74) {
            return false;
        }
        return this.includeInLookupRequest;
    }

    static {
        field_a = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = new LoginMethod("email");
    }
}
