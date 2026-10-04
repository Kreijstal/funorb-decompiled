/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFailureReason {
    static int maximumArchiveLength;
    static String loginMessage2Text;
    static String loadingPumpkinText;
    static String startingGameText;
    static String fullscreenAfterCancelText;

    final static boolean isSingleBitOrZero(boolean performCheck, int value) {
        if (performCheck) {
            return (value & -value) == value ? true : false;
        }
        return true;
    }

    final static boolean scratchSpriteOverlapsBoard(GameplayEntity diagnosticEntity, float diagnosticBoardAngleRadians, int methodGuard) {
        RuntimeException boardOverlapFailureForContext = null;
        boolean overlapFound = false;
        RuntimeException boardOverlapFailureBeforeEntityDescription = null;
        StringBuilder boardOverlapMessagePrefix = null;
        String entityArgumentDescription = null;
        RuntimeException caughtBoardOverlapFailure = null;
        try {
          if (methodGuard == 0) {
            overlapFound = PixelOverlapProbe.findFirstNonzeroPixelOverlap(HotspotTextWidget.spriteScratchRaster, -(HotspotTextWidget.spriteScratchRaster.fullWidth >> 1) + DialogLayer.rotatedEntityScreenX, -(HotspotTextWidget.spriteScratchRaster.fullHeight >> 1) + ValidationIconWidget.rotatedEntityScreenY, LogoPreparationSupport.boardOwnershipRaster, 0, 0);
            return overlapFound;
          }
          return false;
        } catch (java.lang.RuntimeException boardOverlapFailure) {
          caughtBoardOverlapFailure = boardOverlapFailure;
          boardOverlapFailureForContext = caughtBoardOverlapFailure;
          boardOverlapFailureBeforeEntityDescription = boardOverlapFailureForContext;
          boardOverlapMessagePrefix = new StringBuilder().append("uj.C(");
          if (diagnosticEntity == null) {
            entityArgumentDescription = "null";
          } else {
            entityArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) boardOverlapFailureBeforeEntityDescription), ((StringBuilder) (Object) boardOverlapMessagePrefix).append(entityArgumentDescription).append(',').append(diagnosticBoardAngleRadians).append(',').append(methodGuard).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        fullscreenAfterCancelText = null;
        loginMessage2Text = null;
        loadingPumpkinText = null;
        startingGameText = null;
        if (methodGuard > 0) {
            FullscreenFailureReason.isSingleBitOrZero(false, -95);
        }
    }

    final static String[] splitAtCharacter(char delimiter, boolean countOccurrencesGuard, String text) {
        int separatorIndex = 0;
        int outputIndexBeforeIncrement = 0;
        int separatorCount = 0;
        RuntimeException splitFailureForContext = null;
        String[] segments = null;
        int outputIndex = 0;
        int segmentStart = 0;
        int delimiterPosition = 0;
        CharSequence textAsCharSequence = null;
        String[] segmentsBeforeReturn = null;
        RuntimeException splitFailureBeforeDescription = null;
        StringBuilder splitMessagePrefix = null;
        String textDescription = null;
        RuntimeException caughtSplitFailure = null;
        try {
          textAsCharSequence = (CharSequence) ((Object) text);
          separatorCount = DelayedPcmStream.countCharacterOccurrences(textAsCharSequence, countOccurrencesGuard, delimiter);
          segments = new String[1 + separatorCount];
          outputIndex = 0;
          segmentStart = 0;
          for (separatorIndex = 0; separatorCount > separatorIndex; separatorIndex++) {
            for (delimiterPosition = segmentStart; text.charAt(delimiterPosition) != delimiter; delimiterPosition++) {
            }
            outputIndexBeforeIncrement = outputIndex;
            outputIndex++;
            segments[outputIndexBeforeIncrement] = text.substring(segmentStart, delimiterPosition);
            segmentStart = delimiterPosition + 1;
          }
          segments[separatorCount] = text.substring(segmentStart);
          segmentsBeforeReturn = segments;
          return segmentsBeforeReturn;
        } catch (java.lang.RuntimeException splitFailure) {
          caughtSplitFailure = splitFailure;
          splitFailureForContext = caughtSplitFailure;
          splitFailureBeforeDescription = splitFailureForContext;
          splitMessagePrefix = new StringBuilder().append("uj.D(").append(delimiter).append(',').append(countOccurrencesGuard).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) splitFailureBeforeDescription), ((StringBuilder) (Object) splitMessagePrefix).append(textDescription).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        maximumArchiveLength = 0;
        loginMessage2Text = "Error connecting to server. Please try using a different server.";
        loadingPumpkinText = "Harvesting Pumpkin";
        startingGameText = "Starting Game";
        fullscreenAfterCancelText = "to return to the normal view.";
    }
}
