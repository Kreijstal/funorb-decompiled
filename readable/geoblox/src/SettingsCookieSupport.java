/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SettingsCookieSupport {
    static String quitText;
    static String currentTooltipText;
    static int currentScreenId;

    final static boolean isRepresentableTextCharacter(byte methodGuard, char character) {
        int extendedCharacterIndex = 0;
        char[] unusedExtendedCharactersAlias = null;
        RuntimeException characterFailureForContext = null;
        int extendedCharacterCode = 0;
        int clientControlFlowGuard = 0;
        char[] extendedCharacters = null;
        RuntimeException caughtCharacterFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (!((0 < character) &&
                (128 > character)) &&
              !((character >= 160) &&
                (255 >= character))) {
            if (methodGuard != -112) {
              quitText = (String) null;
            }
            if (character == 0) {
              return false;
            }
            extendedCharacters = LongAndTextLoginPayload.extendedTextCharacters;
            unusedExtendedCharactersAlias = extendedCharacters;
            for (extendedCharacterIndex = 0; extendedCharacters.length > extendedCharacterIndex; extendedCharacterIndex++) {
              extendedCharacterCode = extendedCharacters[extendedCharacterIndex];
              if (extendedCharacterCode == character) {
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException characterFailure) {
          caughtCharacterFailure = characterFailure;
          characterFailureForContext = caughtCharacterFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) characterFailureForContext), "tc.A(" + methodGuard + ',' + character + ')');
        }
    }

    public static void clearSettingsCookieTexts(boolean methodGuard) {
        quitText = null;
        currentTooltipText = null;
        if (!methodGuard) {
            SettingsCookieSupport.clearSettingsCookieTexts(false);
        }
    }

    final static void storeSettingsCookie(int methodGuard, String settings, java.applet.Applet applet) {
        try {
            String cookiePrefix = null;
            String cookieValueAndScratch = null;
            String cookieHost = null;
            String cookieWithoutExpiry = null;
            try {
                NetworkArchiveRequest.settingsCookieValue = settings;
                try {
                    cookiePrefix = applet.getParameter("cookieprefix");
                    cookieValueAndScratch = cookiePrefix;
                    cookieValueAndScratch = cookiePrefix;
                    cookieHost = applet.getParameter("cookiehost");
                    cookieValueAndScratch = cookieHost;
                    cookieValueAndScratch = cookieHost;
                    cookieWithoutExpiry = cookiePrefix + "settings=" + settings + "; version=1; path=/; domain=" + cookieHost;
                    cookieValueAndScratch = cookieWithoutExpiry;
                    cookieValueAndScratch = cookieWithoutExpiry;
                    if (settings.length() != 0) {
                        cookieValueAndScratch = cookieWithoutExpiry + "; Expires=" + GmtTimestampSupport.formatGmtTimestamp((byte) -58, ClientClockSupport.correctedCurrentTimeMillis(-12520) + 94608000000L) + "; Max-Age=" + 94608000L;
                    } else {
                        cookieValueAndScratch = cookieWithoutExpiry + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                    }
                    int guardResidue = -93 % ((-64 - methodGuard) / 61);
                    AppletJavaScriptBridge.evaluateScript(applet, "document.cookie=\"" + cookieValueAndScratch + "\"", (byte) -92);
                } catch (Throwable ignoredCookieWriteFailure) {
                }
                ByteStorage.a(applet, 20000000);
            } catch (RuntimeException settingsFailureForContext) {
                throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) settingsFailureForContext), "tc.C(" + methodGuard + ',' + (settings != null ? "{...}" : "null") + ',' + (applet != null ? "{...}" : "null") + ')');
            }
        } catch (RuntimeException | Error uncheckedSettingsFailure) {
            throw uncheckedSettingsFailure;
        } catch (Throwable checkedSettingsFailure) {
            throw new RuntimeException(checkedSettingsFailure);
        }
    }

    static {
        currentTooltipText = null;
        quitText = "Quit";
    }
}
