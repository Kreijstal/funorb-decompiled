/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextConcatenationSupport {
    static byte[][] decodedSpriteIndices;
    static int accountDialogPointerOriginY;
    static String fullscreenAcceptCountdownSingularText;

    final static String joinCharSequenceRange(int startIndex, int count, CharSequence[] parts, byte methodGuard) {
        int lengthScanIndex = 0;
        int appendIndex = 0;
        StringBuilder unusedAppendPartResult = null;
        StringBuilder unusedAppendNullResult = null;
        String emptyTextBeforeReturn = null;
        String nullTextBeforeReturn = null;
        String singlePartBeforeReturn = null;
        String joinedTextBeforeReturn = null;
        RuntimeException joinFailureBeforeContext = null;
        StringBuilder joinMessagePrefix = null;
        String partsDescription = null;
        RuntimeException caughtJoinFailure = null;
        CharSequence singlePartSnapshot = null;
        int endIndex = 0;
        RuntimeException joinFailureForContext = null;
        int capacityEstimate = 0;
        StringBuilder builder = null;
        CharSequence lengthScanPart = null;
        CharSequence appendPart = null;
        int clientControlFlowGuard = 0;
        CharSequence singlePart = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          if (count == 0) {
            emptyTextBeforeReturn = "";
            return emptyTextBeforeReturn;
          }
          if (count == 1) {
            singlePart = parts[startIndex];
            singlePartSnapshot = singlePart;
            if (singlePartSnapshot != null) {
              singlePartBeforeReturn = singlePart.toString();
              return singlePartBeforeReturn;
            }
            nullTextBeforeReturn = "null";
            return nullTextBeforeReturn;
          }
          endIndex = startIndex + count;
          capacityEstimate = 0;
          if (methodGuard != 96) {
            accountDialogPointerOriginY = 111;
          }
          for (lengthScanIndex = startIndex; endIndex > lengthScanIndex; lengthScanIndex++) {
            lengthScanPart = parts[lengthScanIndex];
            if (lengthScanPart == null) {
              capacityEstimate += 4;
            } else {
              capacityEstimate = capacityEstimate + lengthScanPart.length();
            }
          }
          builder = new StringBuilder(capacityEstimate);
          for (appendIndex = startIndex; endIndex > appendIndex; appendIndex++) {
            appendPart = parts[appendIndex];
            if (appendPart != null) {
              unusedAppendPartResult = builder.append(appendPart);
            } else {
              unusedAppendNullResult = builder.append("null");
            }
          }
          joinedTextBeforeReturn = builder.toString();
          return joinedTextBeforeReturn;
        } catch (java.lang.RuntimeException joinFailure) {
          caughtJoinFailure = joinFailure;
          joinFailureForContext = caughtJoinFailure;
          joinFailureBeforeContext = joinFailureForContext;
          joinMessagePrefix = new StringBuilder().append("mj.A(").append(startIndex).append(',').append(count).append(',');
          if (parts == null) {
            partsDescription = "null";
          } else {
            partsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) joinFailureBeforeContext), ((StringBuilder) (Object) joinMessagePrefix).append(partsDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static TextValidationFailure validateAsciiDigits(String text, byte methodGuard) {
        int characterIndex = 0;
        int textLength = 0;
        RuntimeException digitValidationFailureForContext = null;
        int characterCode = 0;
        int clientControlFlowGuard = 0;
        TextValidationFailure acceptedDigitsMarkerBeforeReturn = null;
        RuntimeException digitValidationFailureBeforeContext = null;
        StringBuilder digitValidationMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtDigitValidationFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          textLength = text.length();
          if (methodGuard > -34) {
            fullscreenAcceptCountdownSingularText = (String) null;
          }
          for (characterIndex = 0; characterIndex < textLength; characterIndex++) {
            characterCode = text.charAt(characterIndex);
            if (48 > characterCode) {
              return null;
            }
            if (characterCode > 57) {
              return null;
            }
          }
          acceptedDigitsMarkerBeforeReturn = ArchiveLoadStep.invalidTextFormatFailure;
          return acceptedDigitsMarkerBeforeReturn;
        } catch (java.lang.RuntimeException digitValidationFailure) {
          caughtDigitValidationFailure = digitValidationFailure;
          digitValidationFailureForContext = caughtDigitValidationFailure;
          digitValidationFailureBeforeContext = digitValidationFailureForContext;
          digitValidationMessagePrefix = new StringBuilder().append("mj.C(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) digitValidationFailureBeforeContext), ((StringBuilder) (Object) digitValidationMessagePrefix).append(textDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void clearConcatenationResources(int methodGuard) {
        fullscreenAcceptCountdownSingularText = null;
        decodedSpriteIndices = (byte[][]) null;
        if (methodGuard < 66) {
            accountDialogPointerOriginY = 91;
        }
    }

    static {
        fullscreenAcceptCountdownSingularText = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
