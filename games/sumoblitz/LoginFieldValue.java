/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginFieldValue {
    private boolean includeInRsaBlock;
    private String text;
    static int[] field_a;
    static int field_b;

    LoginFieldValue(String value) {
        this(value, false);
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 != 108) {
          field_a = (int[]) null;
        }
    }

    LoginFieldValue(String value, boolean encrypted) {
        RuntimeException var3 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.text = value;
          stackIn_4_1 = (encrypted);
          this.includeInRsaBlock = stackIn_4_1;
          if (null == this.text) {
            this.text = "";
          }
          if (0 != this.text.length()) {
            return;
          }
          this.includeInRsaBlock = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lj.<init>(");
          if (value == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(encrypted).append(')').toString());
        }
    }

    final boolean includeInRsaBlock(int guard) {
        if (guard <= 86) {
          this.text = (String) null;
          return this.includeInRsaBlock;
        }
        return this.includeInRsaBlock;
    }

    final String text(boolean guard) {
        if (!guard) {
          LoginFieldValue.releaseStatics((byte) 48);
          return this.text;
        }
        return this.text;
    }

    static {
        field_b = 640;
    }
}
