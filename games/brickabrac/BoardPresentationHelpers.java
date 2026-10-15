/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BoardPresentationHelpers {
    static ResourceArchive field_c;
    static String field_b;
    static RgbSprite[][] arcticSegsSprites;

    final static void configureFullscreenDialogFromSprites(int buttonPaint, int bodyPaint, int buttonLineHeight, int centerY, TextFont bodyFont, int centerX, int bodyLineHeight, int obfuscationGuard, int buttonPaddingY, int buttonBaseline, RgbSprite[] outerSprites, TextFont buttonFont, int outerPaddingX, int maximumWrapWidth, int selectedPaint, int buttonGapY, int bodyBaseline, int buttonPaddingX, int outerPaddingY, RgbSprite[] selectedSprites, RgbSprite[] normalSprites) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String bodyFontSummary = null;
        StringBuilder outerSpritesContextBuilder = null;
        String outerSpritesSummary = null;
        StringBuilder buttonFontContextBuilder = null;
        String buttonFontSummary = null;
        StringBuilder selectedSpritesContextBuilder = null;
        String selectedSpritesSummary = null;
        StringBuilder normalSpritesContextBuilder = null;
        String normalSpritesSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard != -111) {
            arcticSegsSprites = (RgbSprite[][]) null;
          }
          TranslucentNineSliceFrame.configureFullscreenDialog(bodyLineHeight, outerPaddingY, buttonGapY, bodyFont, centerY, centerX, maximumWrapWidth, new NineSliceFrame(outerSprites), bodyPaint, selectedPaint, outerPaddingX, buttonBaseline, buttonPaint, new NineSliceFrame(selectedSprites), buttonLineHeight, buttonPaddingY, buttonFont, new NineSliceFrame(normalSprites), bodyBaseline, buttonPaddingX, 10);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ja.B(").append(buttonPaint).append(',').append(bodyPaint).append(',').append(buttonLineHeight).append(',').append(centerY).append(',');
          if (bodyFont == null) {
            bodyFontSummary = "null";
          } else {
            bodyFontSummary = "{...}";
          }
          outerSpritesContextBuilder = ((StringBuilder) (Object) contextBuilder).append(bodyFontSummary).append(',').append(centerX).append(',').append(bodyLineHeight).append(',').append(obfuscationGuard).append(',').append(buttonPaddingY).append(',').append(buttonBaseline).append(',');
          if (outerSprites == null) {
            outerSpritesSummary = "null";
          } else {
            outerSpritesSummary = "{...}";
          }
          buttonFontContextBuilder = ((StringBuilder) (Object) outerSpritesContextBuilder).append(outerSpritesSummary).append(',');
          if (buttonFont == null) {
            buttonFontSummary = "null";
          } else {
            buttonFontSummary = "{...}";
          }
          selectedSpritesContextBuilder = ((StringBuilder) (Object) buttonFontContextBuilder).append(buttonFontSummary).append(',').append(outerPaddingX).append(',').append(maximumWrapWidth).append(',').append(selectedPaint).append(',').append(buttonGapY).append(',').append(bodyBaseline).append(',').append(buttonPaddingX).append(',').append(outerPaddingY).append(',');
          if (selectedSprites == null) {
            selectedSpritesSummary = "null";
          } else {
            selectedSpritesSummary = "{...}";
          }
          normalSpritesContextBuilder = ((StringBuilder) (Object) selectedSpritesContextBuilder).append(selectedSpritesSummary).append(',');
          if (normalSprites == null) {
            normalSpritesSummary = "null";
          } else {
            normalSpritesSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) normalSpritesContextBuilder).append(normalSpritesSummary).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 2) {
          field_b = null;
          field_c = null;
          arcticSegsSprites = (RgbSprite[][]) null;
          return;
        }
        arcticSegsSprites = (RgbSprite[][]) null;
        field_b = null;
        field_c = null;
        arcticSegsSprites = (RgbSprite[][]) null;
    }

    final static void drawBoardEndOverlay(byte obfuscationGuard, RgbSprite messageSprite, int boardWidth, int boardHeight, PlayerBoard board) {
        int clampedFade = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String messageSummary = null;
        StringBuilder boardContextBuilder = null;
        String boardSummary = null;
        RuntimeException caughtFailure = null;
        int elapsedTicks = 0;
        RuntimeException failure = null;
        int fade96 = 0;
        double bounceDistance = 0.0;
        RgbSprite logoSprite = null;
        int messageFade96 = 0;
        try {
          if (obfuscationGuard > -13) {
            return;
          }
          elapsedTicks = board.stateTicks;
          clampedFade = (elapsedTicks >= 96) ? 96 : elapsedTicks;
          fade96 = clampedFade;
          elapsedTicks -= 50;
          Rasterizer2D.fillRectangleAlpha(7, 7, boardWidth, boardHeight, 0, fade96);
          if (elapsedTicks <= 0) {
            return;
          }
          bounceDistance = 250.0 * Math.abs(Math.cos((double)elapsedTicks * 0.1)) * Math.exp((double)(-elapsedTicks) / 40.0);
          if (elapsedTicks >= 110) {
            bounceDistance = 0.0;
          }
          logoSprite = IncomingPacketHelpers.gameLogoSprite;
          logoSprite.drawTransparent((-logoSprite.canvasWidth + boardWidth) / 2 + 7, -(int)bounceDistance + 125);
          if (elapsedTicks > 95) {
            messageFade96 = -95 + elapsedTicks;
            if (96 < messageFade96) {
              messageFade96 = 96;
            }
            messageSprite.b(7 + (-messageSprite.canvasWidth + boardWidth) / 2, 260, messageFade96 * 256 / 96);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ja.D(").append(obfuscationGuard).append(',');
          if (messageSprite == null) {
            messageSummary = "null";
          } else {
            messageSummary = "{...}";
          }
          boardContextBuilder = ((StringBuilder) (Object) contextBuilder).append(messageSummary).append(',').append(boardWidth).append(',').append(boardHeight).append(',');
          if (board == null) {
            boardSummary = "null";
          } else {
            boardSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) boardContextBuilder).append(boardSummary).append(')').toString());
        }
    }

    final static int combineSequenceLevelAttributes(int startIndex, LevelSequence sequence, int endIndex, boolean obfuscationGuard) {
        RuntimeException failure = null;
        int guardRejectedResult = 0;
        int combinedAttributes = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String sequenceSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard) {
            combinedAttributes = BytePayloadSubmission.combineLevelAttributes(sequence.pack, startIndex, true, endIndex);
            return combinedAttributes;
          }
          guardRejectedResult = -123;
          return guardRejectedResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ja.A(").append(startIndex).append(',');
          if (sequence == null) {
            sequenceSummary = "null";
          } else {
            sequenceSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(sequenceSummary).append(',').append(endIndex).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static GameClock createGameClock(byte obfuscationGuard) {
        if (obfuscationGuard >= 105) {
          return (GameClock) ((Object) new NanoGameClock());
        }
        LevelSequence var2 = (LevelSequence) null;
        BoardPresentationHelpers.combineSequenceLevelAttributes(64, (LevelSequence) null, 69, false);
        return (GameClock) ((Object) new NanoGameClock());
    }

    static {
        field_b = "Try again";
    }
}
