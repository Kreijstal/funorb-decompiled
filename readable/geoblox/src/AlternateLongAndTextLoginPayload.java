/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlternateLongAndTextLoginPayload extends LongAndTextLoginPayload {
    static int[] achievementDisplayedOrbPoints;
    static String defaultPlayerNameText;
    static IndexedSprite sportsBackgroundSprite;

    AlternateLongAndTextLoginPayload(long longValue, String base38Text) {
        super(longValue, base38Text);
    }

    final static LoginMethod readRememberedMethod(java.applet.Applet applet, int methodGuard) {
        int methodIndex = 0;
        String rememberedMethodName = null;
        RuntimeException lookupFailureForContext = null;
        LoginMethod[] availableMethods = null;
        LoginMethod candidateMethod = null;
        int clientControlFlowSnapshot = 0;
        LoginMethod missingCookieFallbackMethod = null;
        LoginMethod matchingMethodBeforeReturn = null;
        LoginMethod unknownNameFallbackMethod = null;
        RuntimeException lookupFailureBeforeDescription = null;
        StringBuilder lookupMessagePrefix = null;
        String appletDescription = null;
        RuntimeException lookupFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != 200) {
            AlternateLongAndTextLoginPayload.releaseStaticReferences((byte) 21);
          }
          rememberedMethodName = AchievementQuery.readCookieValue("jagex-last-login-method", applet, -114);
          if (rememberedMethodName == null) {
            missingCookieFallbackMethod = ValidationIconWidget.emptyNameLoginMethod;
            return missingCookieFallbackMethod;
          }
          availableMethods = TextValidationSupport.listLoginMethods(false);
          for (methodIndex = 0; availableMethods.length > methodIndex; methodIndex++) {
            candidateMethod = availableMethods[methodIndex];
            if (candidateMethod.matchesMethodName(115, rememberedMethodName)) {
              matchingMethodBeforeReturn = candidateMethod;
              return matchingMethodBeforeReturn;
            }
          }
          unknownNameFallbackMethod = ValidationIconWidget.emptyNameLoginMethod;
          return unknownNameFallbackMethod;
        } catch (java.lang.RuntimeException caughtLookupFailure) {
          lookupFailure = caughtLookupFailure;
          lookupFailureForContext = lookupFailure;
          lookupFailureBeforeDescription = lookupFailureForContext;
          lookupMessagePrefix = new StringBuilder().append("th.H(");
          if (applet == null) {
            appletDescription = "null";
          } else {
            appletDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) lookupMessagePrefix).append(appletDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        achievementDisplayedOrbPoints = null;
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
        achievementDisplayedOrbPoints = new int[]{100, 200, 500, 300, 300, 500, 500, 500, 100, 100, 100, 200, 200, 200, 300, 1000, 300};
        defaultPlayerNameText = "Player";
    }
}
