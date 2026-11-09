/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientExceptionSupport {
    static QuickChatCommand field_b;
    static String ifYouDoNothingText;
    static EmailValidationError MISSING_EMAIL_COMPONENT;
    private static String field_z;

    final static ClientException wrapWithContext(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_a = var2.field_a + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    public static void releaseStatics(boolean guard) {
        if (!guard) {
          MISSING_EMAIL_COMPONENT = null;
          field_b = null;
          ifYouDoNothingText = null;
          return;
        }
        String var2 = (String) null;
        ClientExceptionSupport.wrapWithContext((Throwable) null, (String) null);
        MISSING_EMAIL_COMPONENT = null;
        field_b = null;
        ifYouDoNothingText = null;
    }

    static {
        field_z = "qo.B(";
        field_b = new QuickChatCommand(11, 0, 1, 2);
        ifYouDoNothingText = "If you do nothing the game will revert to normal view in <%0> second.";
        MISSING_EMAIL_COMPONENT = new EmailValidationError();
    }
}
