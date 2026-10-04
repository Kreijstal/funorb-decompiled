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

    final static void a(byte param0, long param1, java.applet.Applet param2, String param3, String param4) {
        try {
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_10_2 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_13_2 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            try {
              try {
                var9 = param2.getParameter("cookiehost");
                var7 = var9;
                var7 = var9;
                var8 = -108 / ((48 - param0) / 59);
                var10 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var9;
                var7 = var10;
                var7 = var10;
                if (param1 < 0L) {
                  var7 = var10 + "; Discard;";
                } else {
                  var7 = var10 + "; Expires=" + GmtTimestampSupport.formatGmtTimestamp((byte) -79, 1000L * param1 + ClientClockSupport.correctedCurrentTimeMillis(-12520)) + "; Max-Age=" + param1;
                }
                AppletJavaScriptBridge.evaluateScript(param2, "document.cookie=\"" + var7 + "\"", (byte) -10);
                return;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = decompiledCaughtException;
                return;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_9_0 = var6_ref;
              stackIn_9_1 = new StringBuilder().append("ea.A(").append(param0).append(',').append(param1).append(',');
              if (param2 == null) {
                stackIn_10_2 = "null";
              } else {
                stackIn_10_2 = "{...}";
              }
              stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
              if (param3 == null) {
                stackIn_13_2 = "null";
              } else {
                stackIn_13_2 = "{...}";
              }
              stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
              if (param4 == null) {
                stackIn_16_2 = "null";
              } else {
                stackIn_16_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
