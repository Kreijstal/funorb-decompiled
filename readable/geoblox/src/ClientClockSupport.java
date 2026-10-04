/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientClockSupport {
    static long field_c;
    static int[] additionalByteArrayPoolCounts;
    static Sprite[] validationStateSprites;
    static String[] subscriptionMonthlyCostTexts;
    static int firstScoreContextAccumulator;
    static int[] transformedMeshNormalY;

    final synchronized static long correctedCurrentTimeMillis(int methodGuard) {
        long wallClockMillis = System.currentTimeMillis();
        if (!(~TextValidationFailure.previousWallClockMillis >= ~wallClockMillis)) {
            DisplayModeInfo.backwardClockCorrectionMillis = DisplayModeInfo.backwardClockCorrectionMillis + (TextValidationFailure.previousWallClockMillis - wallClockMillis);
        }
        TextValidationFailure.previousWallClockMillis = wallClockMillis;
        if (methodGuard != -12520) {
            subscriptionMonthlyCostTexts = (String[]) null;
        }
        return DisplayModeInfo.backwardClockCorrectionMillis + wallClockMillis;
    }

    final static int parseIntWithRadix(int radix, CharSequence text, int methodGuard) {
        RuntimeException parseFailureForContext = null;
        int guardedFallbackBeforeReturn = 0;
        int parsedIntegerBeforeReturn = 0;
        RuntimeException parseFailureBeforeContext = null;
        StringBuilder parseMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtParseFailure = null;
        try {
          if (methodGuard == 8192) {
            parsedIntegerBeforeReturn = ReflectionCheckRequest.parseSignedInt(text, (byte) 49, radix, true);
            return parsedIntegerBeforeReturn;
          }
          guardedFallbackBeforeReturn = -10;
          return guardedFallbackBeforeReturn;
        } catch (java.lang.RuntimeException parseFailure) {
          caughtParseFailure = parseFailure;
          parseFailureForContext = caughtParseFailure;
          parseFailureBeforeContext = parseFailureForContext;
          parseMessagePrefix = new StringBuilder().append("oa.A(").append(radix).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) parseFailureBeforeContext), ((StringBuilder) (Object) parseMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void clearClockAndGraphicsResources(int methodGuard) {
        if (methodGuard != 8192) {
            validationStateSprites = (Sprite[]) null;
        }
        additionalByteArrayPoolCounts = null;
        subscriptionMonthlyCostTexts = null;
        validationStateSprites = null;
        transformedMeshNormalY = null;
    }

    static {
        transformedMeshNormalY = new int[8192];
        subscriptionMonthlyCostTexts = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
