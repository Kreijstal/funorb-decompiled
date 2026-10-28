/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameAvailabilityResponseSupport {
    static int field_b;
    static String field_a;

    public static void releaseStatics(int guard) {
        field_a = null;
        int var1 = 26 % ((65 - guard) / 59);
    }

    final static void completeNameAvailability(String[] suggestions, String message, byte guard, int responseCode) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          InstructionsScreen.field_q = TriangleMesh.field_y;
          if (responseCode == 255) {
            boolean stackIn_10_0 = !(13 <= AnimatedPanelFrame.field_a);
            SpriteState.field_y = AccountNoticeKind.createBooleanResponse(stackIn_10_0, (byte) -82);
          } else if (responseCode < 100) {
            SpriteState.field_y = NameAvailabilityResultSupport.createTextResponse(message, responseCode, 4);
          } else if (105 < responseCode) {
            SpriteState.field_y = NameAvailabilityResultSupport.createTextResponse(message, responseCode, 4);
          } else {
            SpriteState.field_y = BufferedRandomAccessFile.a(suggestions, (byte) -103);
          }
          if (guard == -72) {
            return;
          }
          String var6 = (String) null;
          NameAvailabilityResponseSupport.completeNameAvailability((String[]) null, (String) null, (byte) -30, 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4;
          StringBuilder stackIn_16_1 = new StringBuilder().append("j.A(");
          if (suggestions == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (message == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(responseCode).append(')').toString());
        }
    }

    static {
        field_a = "Creating your account";
    }
}
