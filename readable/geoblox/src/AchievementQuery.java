/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class AchievementQuery extends IntrusiveNode {
    int[] resultValues;
    static ClientProtocolStage socketOpenFailedStage;
    boolean completed;
    static int[] rankedEntryIndices;
    int achievementMask;

    public static void releaseStaticReferences(int methodGuard) {
        socketOpenFailedStage = null;
        if (methodGuard != 59) {
            return;
        }
        rankedEntryIndices = null;
    }

    final static boolean ensureArchiveCatalogLoaded(int methodGuard) {
        int unusedCatalogGuardRemainder = -46 % ((methodGuard + 28) / 60);
        return DequeCursor.archiveCatalog.ensureCatalogLoaded((byte) 126);
    }

    final static boolean hasReceivedAchievementSixteen(int methodGuard) {
        boolean positiveMaskContainsBitSixteen = false;
        if (methodGuard <= 76) {
          socketOpenFailedStage = (ClientProtocolStage) null;
        }
        positiveMaskContainsBitSixteen = (SecondaryNodeDeque.receivedAchievementMask > 0) && ((65536 & SecondaryNodeDeque.receivedAchievementMask) != 0);
        return positiveMaskContainsBitSixteen;
    }

    AchievementQuery() {
        this.completed = false;
    }

    final static String readCookieValue(String cookieName, java.applet.Applet applet, int methodGuard) {
        try {
            int cookieIndex = 0;
            int guardQuotient = 0;
            String cookieHeader = null;
            String[] cookieEntries = null;
            int equalsIndex = 0;
            int unusedClientControlSnapshot = 0;
            String cookieValueBeforeReturn = null;
            Object nullMissingCookieResult = null;
            RuntimeException lookupFailureBeforeDescription = null;
            StringBuilder lookupMessagePrefix = null;
            String cookieNameDescription = null;
            StringBuilder messageBeforeApplet = null;
            String appletDescription = null;
            Throwable caughtLookupThrowable = null;
            RuntimeException lookupFailureForContext = null;
            Throwable ignoredCookieLookupFailure = null;
            unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              guardQuotient = -105 / ((methodGuard + 33) / 57);
              try {
                cookieHeader = (String) (AppletJavaScriptBridge.callWithoutArguments((byte) -6, applet, "getcookies"));
                cookieEntries = FullscreenFailureReason.splitAtCharacter(';', true, cookieHeader);
                for (cookieIndex = 0; cookieIndex < cookieEntries.length; cookieIndex++) {
                  equalsIndex = cookieEntries[cookieIndex].indexOf('=');
                  if ((equalsIndex >= 0) &&
                      (cookieEntries[cookieIndex].substring(0, equalsIndex).trim().equals(cookieName))) {
                    cookieValueBeforeReturn = cookieEntries[cookieIndex].substring(1 + equalsIndex).trim();
                    return cookieValueBeforeReturn;
                  }
                }
              } catch (java.lang.Throwable cookieLookupThrowable) {
                caughtLookupThrowable = cookieLookupThrowable;
                ignoredCookieLookupFailure = caughtLookupThrowable;
              }
              nullMissingCookieResult = null;
              return (String) (nullMissingCookieResult);
            } catch (java.lang.RuntimeException lookupFailure) {
              caughtLookupThrowable = lookupFailure;
              lookupFailureForContext = (RuntimeException) (Object) caughtLookupThrowable;
              lookupFailureBeforeDescription = lookupFailureForContext;
              lookupMessagePrefix = new StringBuilder().append("qi.B(");
              if (cookieName == null) {
                cookieNameDescription = "null";
              } else {
                cookieNameDescription = "{...}";
              }
              messageBeforeApplet = ((StringBuilder) (Object) lookupMessagePrefix).append(cookieNameDescription).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) lookupFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeApplet).append(appletDescription).append(',').append(methodGuard).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    final static int nextSpriteVariantIndex(int variantCount, int methodGuard) {
        if (methodGuard != 1) {
            return 99;
        }
        return AwtRasterBuffer.nextBoundedRandomInt((byte) -75, ClientProtocolStage.spriteVariantRandom, variantCount);
    }

    static {
        socketOpenFailedStage = new ClientProtocolStage();
    }
}
