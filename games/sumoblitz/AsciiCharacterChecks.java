/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AsciiCharacterChecks {
    final static boolean containsNonAlphanumeric(boolean guard, String text) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard) {
            return true;
          }
          for (var2_int = 0; var2_int < text.length(); var2_int++) {
            var3 = text.charAt(var2_int);
            if (!ModalDialog.isAsciiLetter(98, (char) var3) &&
              !AccountUiBootstrap.isAsciiDigit((byte) -54, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("me.A(").append(guard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
    }
}
