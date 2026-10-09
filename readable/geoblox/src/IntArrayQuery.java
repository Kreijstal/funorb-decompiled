/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntArrayQuery extends IntrusiveNode {
    int queryByte;
    int[] responseWords;
    static IntrusiveDeque pendingIntArrayQueries;

    private IntArrayQuery() throws Throwable {
        throw new Error();
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 1000) {
            return;
        }
        pendingIntArrayQueries = null;
    }

    final static void writeCookieValue(byte methodGuard, long maxAgeSeconds, java.applet.Applet applet, String cookieName, String cookieValue) {
        try {
            RuntimeException cookieFailureBeforeDescription = null;
            StringBuilder cookieMessagePrefix = null;
            String appletDescription = null;
            StringBuilder messageBeforeCookieName = null;
            String cookieNameDescription = null;
            StringBuilder messageBeforeCookieValue = null;
            String cookieValueDescription = null;
            Throwable caughtCookieThrowable = null;
            Throwable ignoredCookieWriteFailure = null;
            RuntimeException cookieFailureForContext = null;
            String unusedCookieHostSnapshot = null;
            int guardQuotient = 0;
            String cookieHost = null;
            String baseCookieAssignment = null;
            String unusedCookieHostCopy;
            String unusedCookieHeaderSnapshot;
            String unusedCookieHeaderCopy;
            String cookieAssignmentValue;
            try {
              try {
                cookieHost = applet.getParameter("cookiehost");
                unusedCookieHostSnapshot = cookieHost;
                unusedCookieHostCopy = cookieHost;
                guardQuotient = -108 / ((48 - methodGuard) / 59);
                baseCookieAssignment = cookieName + "=" + cookieValue + "; version=1; path=/; domain=" + cookieHost;
                unusedCookieHeaderSnapshot = baseCookieAssignment;
                unusedCookieHeaderCopy = baseCookieAssignment;
                if (maxAgeSeconds < 0L) {
                  cookieAssignmentValue = baseCookieAssignment + "; Discard;";
                } else {
                  cookieAssignmentValue = baseCookieAssignment + "; Expires=" + GmtTimestampSupport.formatGmtTimestamp((byte) -79, 1000L * maxAgeSeconds + ClientClockSupport.correctedCurrentTimeMillis(-12520)) + "; Max-Age=" + maxAgeSeconds;
                }
                AppletJavaScriptBridge.evaluateScript(applet, "document.cookie=\"" + cookieAssignmentValue + "\"", (byte) -10);
                return;
              } catch (java.lang.Throwable cookieWriteThrowable) {
                caughtCookieThrowable = cookieWriteThrowable;
                ignoredCookieWriteFailure = caughtCookieThrowable;
                return;
              }
            } catch (java.lang.RuntimeException cookieFailure) {
              caughtCookieThrowable = cookieFailure;
              cookieFailureForContext = (RuntimeException) (Object) caughtCookieThrowable;
              cookieFailureBeforeDescription = cookieFailureForContext;
              cookieMessagePrefix = new StringBuilder().append("ea.A(").append(methodGuard).append(',').append(maxAgeSeconds).append(',');
              if (applet == null) {
                appletDescription = "null";
              } else {
                appletDescription = "{...}";
              }
              messageBeforeCookieName = ((StringBuilder) (Object) cookieMessagePrefix).append(appletDescription).append(',');
              if (cookieName == null) {
                cookieNameDescription = "null";
              } else {
                cookieNameDescription = "{...}";
              }
              messageBeforeCookieValue = ((StringBuilder) (Object) messageBeforeCookieName).append(cookieNameDescription).append(',');
              if (cookieValue == null) {
                cookieValueDescription = "null";
              } else {
                cookieValueDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cookieFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeCookieValue).append(cookieValueDescription).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    final static CoverageBitmapFont loadCoverageFontById(ResourceArchive glyphGraphicsArchive, byte methodGuard, ResourceArchive fontMetricsArchive, int fileId, int groupId) {
        int sentinelRemainder = 0;
        RuntimeException fontFailureForContext = null;
        CoverageBitmapFont fontBeforeReturn = null;
        RuntimeException fontFailureBeforeArchiveDescriptions = null;
        StringBuilder fontMessagePrefix = null;
        String glyphArchiveDescription = null;
        StringBuilder fontMessageBeforeMetricsArchive = null;
        String metricsArchiveDescription = null;
        RuntimeException caughtFontFailure = null;
        try {
          if (!SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 117, glyphGraphicsArchive)) {
            return null;
          }
          sentinelRemainder = 8 % ((-50 - methodGuard) / 51);
          fontBeforeReturn = PrefixCodeDecoder.buildCoverageFontFromDecodedSprites(fontMetricsArchive.getFile(groupId, -28153, fileId), false);
          return fontBeforeReturn;
        } catch (java.lang.RuntimeException fontFailure) {
          caughtFontFailure = fontFailure;
          fontFailureForContext = caughtFontFailure;
          fontFailureBeforeArchiveDescriptions = fontFailureForContext;
          fontMessagePrefix = new StringBuilder().append("ea.C(");
          if (glyphGraphicsArchive == null) {
            glyphArchiveDescription = "null";
          } else {
            glyphArchiveDescription = "{...}";
          }
          fontMessageBeforeMetricsArchive = ((StringBuilder) (Object) fontMessagePrefix).append(glyphArchiveDescription).append(',').append(methodGuard).append(',');
          if (fontMetricsArchive == null) {
            metricsArchiveDescription = "null";
          } else {
            metricsArchiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) fontFailureBeforeArchiveDescriptions), ((StringBuilder) (Object) fontMessageBeforeMetricsArchive).append(metricsArchiveDescription).append(',').append(fileId).append(',').append(groupId).append(')').toString());
        }
    }

    static {
        pendingIntArrayQueries = new IntrusiveDeque();
    }
}
