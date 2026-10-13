/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatCommandDefinition {
    int commandId;
    int definitionArgumentCount;
    static int field_e;
    static int thirdPreviousOpcode;
    static String field_a;
    static String field_d;

    final static void a(int param0) {
        gl.a(126, 4);
        if (param0 != 26566) {
          QuickChatCommandDefinition.openQuickChatResponses(-97, (String) null, (int[]) null, 72L, -125);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    QuickChatCommandDefinition(int commandId, int unusedParameter1, int unusedParameter2, int definitionArgumentCount) {
        this.definitionArgumentCount = definitionArgumentCount;
        this.commandId = commandId;
    }

    public static void a(byte param0) {
        if (param0 == -36) {
          field_a = null;
          field_d = null;
          return;
        }
        QuickChatCommandDefinition.openQuickChatResponses(97, (String) null, (int[]) null, -40L, 2);
        field_a = null;
        field_d = null;
    }

    final static boolean openQuickChatResponses(int obfuscationGuard, String recipientName, int[] responsePhraseIds, long accountId, int channelId) {
        QuickChatMenu responseMenu = null;
        RuntimeException var6_ref = null;
        CharSequence recipientCharacters = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!DebouncedValidator.canOpenQuickChatResponses(accountId, recipientName, -17231, channelId, responsePhraseIds)) {
            return false;
          }
          if (channelId == 1) {
            channelId = 0;
          }
          rs.outgoingChatChannel = channelId;
          qd.chatRecipientName = recipientName;
          recipientCharacters = (CharSequence) ((Object) recipientName);
          wm.chatRecipientNameKey = AccountNameNormalizer.normalize(recipientCharacters, false);
          dj.chatRecipientAccountId = accountId;
          responseMenu = RasterState.buildQuickChatResponseMenu(-11, AccountNameAvailabilityValidator.field_n, responsePhraseIds, vs.field_g, hf.field_f);
          vs.showQuickChatMenu(256, responseMenu);
          if (obfuscationGuard > 77) {
            return true;
          }
          field_e = -67;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("me.C(").append(obfuscationGuard).append(',');
          if (recipientName == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (responsePhraseIds == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(accountId).append(',').append(channelId).append(')').toString());
        }
    }

    static {
        field_e = -1;
        field_a = "You have: <%0>";
        thirdPreviousOpcode = -1;
        field_d = "Reload game";
    }
}
