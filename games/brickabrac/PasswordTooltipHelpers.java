/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordTooltipHelpers {
    static String field_a;
    static LoginMethodPreference field_d;
    static int pendingTooltipY;
    static UiComponent field_e;
    static RgbSprite field_c;

    final static boolean usernameContainsPasswordOrReverse(String password, byte obfuscationGuard, String username) {
        String reversedPassword = null;
        boolean containsPassword = false;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String passwordSummary = null;
        StringBuilder usernameContextBuilder = null;
        String usernameSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          username = BytePayloadRequest.replaceCharacter(-1, username, '_', "");
          reversedPassword = ScreenshotViewer.reverseUtf16CodeUnits(73, password);
          if (obfuscationGuard <= 117) {
            field_e = (UiComponent) null;
          }
          containsPassword = (-1 != username.indexOf(password)) || (username.indexOf(reversedPassword) != -1);
          return containsPassword;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ll.B(");
          if (password == null) {
            passwordSummary = "null";
          } else {
            passwordSummary = "{...}";
          }
          usernameContextBuilder = ((StringBuilder) (Object) contextBuilder).append(passwordSummary).append(',').append(obfuscationGuard).append(',');
          if (username == null) {
            usernameSummary = "null";
          } else {
            usernameSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) usernameContextBuilder).append(usernameSummary).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0) {
          String var2 = (String) null;
          PasswordTooltipHelpers.usernameContainsPasswordOrReverse((String) null, (byte) 37, (String) null);
        }
    }

    static {
        field_a = "Inviting <%0>";
        pendingTooltipY = -1;
        field_d = new LoginMethodPreference("usename");
    }
}
