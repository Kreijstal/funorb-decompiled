/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateLongAndTextLoginPayload extends LongAndTextLoginPayload {
    static int[] field_h;
    static String defaultPlayerNameText;
    static IndexedSprite sportsBackgroundSprite;

    AlternateLongAndTextLoginPayload(long longValue, String base38Text) {
        super(longValue, base38Text);
    }

    final static LoginMethod readRememberedMethod(java.applet.Applet applet, int methodGuard) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethod[] var3 = null;
        LoginMethod var5 = null;
        int var6 = 0;
        LoginMethod stackIn_5_0 = null;
        LoginMethod stackIn_11_0 = null;
        LoginMethod stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 200) {
            AlternateLongAndTextLoginPayload.releaseStaticReferences((byte) 21);
          }
          var2 = AchievementQuery.a("jagex-last-login-method", applet, -114);
          if (var2 == null) {
            stackIn_5_0 = ValidationIconWidget.emptyNameLoginMethod;
            return stackIn_5_0;
          }
          var3 = TextValidationSupport.listLoginMethods(false);
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5.matchesMethodName(115, var2)) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
          }
          stackIn_14_0 = ValidationIconWidget.emptyNameLoginMethod;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("th.H(");
          if (applet == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        field_h = null;
        sportsBackgroundSprite = null;
        defaultPlayerNameText = null;
        if (methodGuard != -109) {
            sportsBackgroundSprite = (IndexedSprite) null;
        }
    }

    final LoginPayloadKind payloadKind(byte methodGuard) {
        if (methodGuard != -32) {
            this.payloadKind((byte) 104);
            return UsernameSuggestionsPanel.alternateLongAndTextPayloadKind;
        }
        return UsernameSuggestionsPanel.alternateLongAndTextPayloadKind;
    }

    static {
        field_h = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        defaultPlayerNameText = "Player";
    }
}
