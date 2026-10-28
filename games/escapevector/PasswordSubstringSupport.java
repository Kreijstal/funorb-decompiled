/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordSubstringSupport {
    final static boolean containsForwardOrReversed(int guard, String text, String needle) {
        String stackIn_19_2 = null;
        String stackIn_22_2 = null;
        try {
          String var3 = DynamicTerrainRenderer.reverseString(needle, false);
          if (text.indexOf(needle) != -1) {
            return true;
          }
          if (text.indexOf(var3) != -1) {
            return true;
          }
          if (guard != 0) {
            return true;
          }
          boolean stackIn_15_0 = (text.startsWith(needle)) || (text.startsWith(var3)) || (text.endsWith(needle)) || (text.endsWith(var3));
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3_ref;
          StringBuilder stackIn_18_1 = new StringBuilder().append("lg.A(").append(guard).append(',');
          if (text == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          StringBuilder stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (needle == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    static {
    }
}
