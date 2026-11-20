/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountRequestText {
    private String text;
    private boolean includeInEncryptedPayload;
    static String confirmEmailTooltip;

    AccountRequestText(String param0) {
        this(param0, false);
    }

    public static void clearSharedReferences(byte param0) {
        confirmEmailTooltip = null;
        int var1 = -35 / ((param0 - 60) / 53);
    }

    final String getText(byte param0) {
        if (param0 < 40) {
          this.includeInEncryptedPayload = false;
          return this.text;
        }
        return this.text;
    }

    final boolean shouldIncludeInEncryptedPayload(boolean param0) {
        if (!param0) {
          return true;
        }
        return this.includeInEncryptedPayload;
    }

    AccountRequestText(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.text = param0;
          if (null == this.text) {
            this.text = "";
          }
          stackIn_6_1 = (param1);
          this.includeInEncryptedPayload = stackIn_6_1;
          if (this.text.length() != 0) {
            return;
          }
          this.includeInEncryptedPayload = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("dj.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        confirmEmailTooltip = "Type your email address again to make sure it's correct";
    }
}
