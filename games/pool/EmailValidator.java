/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailValidator extends TextInputValidator {
    static int[] field_m;
    static int[] field_n;

    final static void restoreLobbyQuickChat(byte obfuscationGuard) {
        CookieDateSupport.field_b = 0;
        QuickChatNavigationSupport.restoreQuickChatMenu((byte) -128);
        int var1 = 96 / ((obfuscationGuard - 1) / 38);
    }

    final IntegerSyntaxSupport validationStateForText(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        IntegerSyntaxSupport stackIn_6_0 = null;
        IntegerSyntaxSupport stackIn_9_0 = null;
        IntegerSyntaxSupport stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (Camera.validateEmailAddress(-1, param0) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_6_0 = AchievementProtocolSupport.field_d;
            return stackIn_6_0;
          }
          if (param1) {
            stackIn_11_0 = ProxySocketConnector.field_e;
            return stackIn_11_0;
          }
          stackIn_9_0 = (IntegerSyntaxSupport) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("r.K(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_m = null;
        if (param0 <= 111) {
          field_m = (int[]) null;
          field_n = null;
          return;
        }
        field_n = null;
    }

    final String validationMessageForText(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.validationStateForText(param0, true) == AchievementProtocolSupport.field_d) {
            stackIn_3_0 = DelayedServerPacket.createAlertInvalidemail;
            return stackIn_3_0;
          }
          if (param1 != 0) {
            EmailValidator.restoreLobbyQuickChat((byte) 12);
          }
          stackIn_7_0 = NodeHashTableIterator.createEmailvalid;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("r.L(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    EmailValidator(TextInputWidget param0) {
        super(param0);
    }

    static {
        field_m = new int[256];
        field_n = new int[]{2, 3, 4, 5, 6, 7, 8};
    }
}
