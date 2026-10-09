/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReflectionCheckRequest extends IntrusiveNode {
    int[] operationTypes;
    static FrameTimer frameTimer;
    int[] operationErrors;
    int[] integerWriteValues;
    int requestId;
    static Sprite[] pointsPanelGlowFrames;
    PlatformTask[] methodLookupTasks;
    static volatile int livePointerY;
    byte[][][] serializedArguments;
    PlatformTask[] fieldLookupTasks;
    int operationCount;
    static String currentSocialLocationLabel;

    public static void releaseStaticReferences(boolean methodGuard) {
        pointsPanelGlowFrames = null;
        if (methodGuard) {
            currentSocialLocationLabel = (String) null;
            frameTimer = null;
            currentSocialLocationLabel = null;
            return;
        }
        frameTimer = null;
        currentSocialLocationLabel = null;
    }

    final static int parseSignedInt(CharSequence text, byte methodGuard, int radix, boolean allowLeadingPlus) {
        int characterIndex = 0;
        int parsedIntegerBeforeReturn = 0;
        RuntimeException parseFailureBeforeContext = null;
        StringBuilder parseMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtParseFailure = null;
        int negativeSignInt = 0;
        RuntimeException parseFailureForContext = null;
        int digitSeenInt = 0;
        int accumulator = 0;
        int textLength = 0;
        int characterCodeOrSignedDigit = 0;
        int nextAccumulator = 0;
        CharSequence guardedNullTextSnapshot = null;
        try {
          if (2 <= radix &&
              radix <= 36) {
            negativeSignInt = 0;
            digitSeenInt = 0;
            accumulator = 0;
            textLength = text.length();
            if (methodGuard <= 2) {
              guardedNullTextSnapshot = (CharSequence) null;
              ReflectionCheckRequest.parseSignedInt((CharSequence) null, (byte) 58, 6, false);
            }
            for (characterIndex = 0; textLength > characterIndex; characterIndex++) {
              signedIntegerCharacter: {
                characterCodeOrSignedDigit = text.charAt(characterIndex);
                if (characterIndex == 0) {
                  if (characterCodeOrSignedDigit == 45) {
                    negativeSignInt = 1;
                    break signedIntegerCharacter;
                  }
                }
                if (characterIndex != 0 || (characterCodeOrSignedDigit != 43 ||
                      !allowLeadingPlus)) {
                  if (48 <= characterCodeOrSignedDigit &&
                      characterCodeOrSignedDigit <= 57) {
                    characterCodeOrSignedDigit -= 48;
                  } else if (65 <= characterCodeOrSignedDigit &&
                      90 >= characterCodeOrSignedDigit) {
                    characterCodeOrSignedDigit -= 55;
                  } else if (characterCodeOrSignedDigit >= 97 &&
                      122 >= characterCodeOrSignedDigit) {
                    characterCodeOrSignedDigit -= 87;
                  } else {
                    throw new NumberFormatException();
                  }
                  if (characterCodeOrSignedDigit >= radix) {
                    throw new NumberFormatException();
                  }
                  if (negativeSignInt != 0) {
                    characterCodeOrSignedDigit = -characterCodeOrSignedDigit;
                  }
                  nextAccumulator = accumulator * radix + characterCodeOrSignedDigit;
                  if (accumulator != nextAccumulator / radix) {
                    throw new NumberFormatException();
                  }
                  digitSeenInt = 1;
                  accumulator = nextAccumulator;
                }
              }
            }
            if (digitSeenInt == 0) {
              throw new NumberFormatException();
            }
            parsedIntegerBeforeReturn = accumulator;
            return parsedIntegerBeforeReturn;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException parseFailure) {
          caughtParseFailure = parseFailure;
          parseFailureForContext = caughtParseFailure;
          parseFailureBeforeContext = parseFailureForContext;
          parseMessagePrefix = new StringBuilder().append("eg.B(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) parseFailureBeforeContext), ((StringBuilder) (Object) parseMessagePrefix).append(textDescription).append(',').append(methodGuard).append(',').append(radix).append(',').append(allowLeadingPlus).append(')').toString());
        }
    }

    ReflectionCheckRequest() {
    }

    static {
        livePointerY = -1;
    }
}
