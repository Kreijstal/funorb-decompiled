/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class AwtRasterBuffer {
    int width;
    int[] pixels;
    int height;
    static int primaryAchievementTrackingCounter;
    java.awt.Image image;
    static GzipInflater archiveGzipInflater;

    abstract void drawImage(int drawY, java.awt.Graphics graphics, int drawX, int methodGuard);

    abstract void initialize(int height, java.awt.Component component, int width, byte methodGuard);

    final static Sprite buildFirstRgbSpriteFromDecodedSheet(byte methodGuard) {
        int pixelIndex = 0;
        int pixelCount = DualLinkNode.decodedSpriteWidths[0] * ProgressBarWidget.decodedSpriteHeights[0];
        byte[] paletteIndices = TextConcatenationSupport.decodedSpriteIndices[0];
        int[] rgbPixels = new int[pixelCount];
        if (methodGuard != -60) {
            Random unusedNullRandomSnapshot = (Random) null;
            AwtRasterBuffer.nextBoundedRandomInt((byte) 50, (Random) null, 37);
        }
        for (pixelIndex = 0; pixelIndex < pixelCount; pixelIndex++) {
            rgbPixels[pixelIndex] = NanoFrameTimer.decodedSpritePalette[ProxySocketConnector.andInt(255, (int) paletteIndices[pixelIndex])];
        }
        Sprite sprite = new Sprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[0], GmtTimestampSupport.decodedSpriteYOffsets[0], DualLinkNode.decodedSpriteWidths[0], ProgressBarWidget.decodedSpriteHeights[0], rgbPixels);
        MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
        return sprite;
    }

    public static void releaseStaticReferences(byte methodGuard) {
        archiveGzipInflater = null;
        if (methodGuard != 58) {
            Random unusedNullRandomSnapshot = (Random) null;
            AwtRasterBuffer.nextBoundedRandomInt((byte) 47, (Random) null, -73);
        }
    }

    final static int nextBoundedRandomInt(byte methodGuard, Random random, int bound) {
        int rejectionThreshold = 0;
        RuntimeException randomFailureForContext = null;
        int randomValue = 0;
        int invalidGuardResultBeforeReturn = 0;
        int powerOfTwoResultBeforeReturn = 0;
        int remainderResultBeforeReturn = 0;
        RuntimeException randomFailureBeforeDescription = null;
        StringBuilder randomMessagePrefix = null;
        String randomDescription = null;
        RuntimeException caughtRandomFailure = null;
        try {
          if (methodGuard != -75) {
            invalidGuardResultBeforeReturn = 102;
            return invalidGuardResultBeforeReturn;
          }
          if (bound <= 0) {
            throw new IllegalArgumentException();
          }
          if (FullscreenFailureReason.isSingleBitOrZero(true, bound)) {
            powerOfTwoResultBeforeReturn = (int)((4294967295L & (long)random.nextInt()) * (long)bound >> 32);
            return powerOfTwoResultBeforeReturn;
          }
          rejectionThreshold = -(int)(4294967296L % (long)bound) + -2147483648;
          do {
            randomValue = random.nextInt();
          } while (rejectionThreshold <= randomValue);
          remainderResultBeforeReturn = AvatarFeedbackSupport.computeAdjustedRemainder(randomValue, bound, methodGuard ^ 121);
          return remainderResultBeforeReturn;
        } catch (java.lang.RuntimeException randomFailure) {
          caughtRandomFailure = randomFailure;
          randomFailureForContext = caughtRandomFailure;
          randomFailureBeforeDescription = randomFailureForContext;
          randomMessagePrefix = new StringBuilder().append("sc.J(").append(methodGuard).append(',');
          if (random == null) {
            randomDescription = "null";
          } else {
            randomDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) randomFailureBeforeDescription), ((StringBuilder) (Object) randomMessagePrefix).append(randomDescription).append(',').append(bound).append(')').toString());
        }
    }

    final void setAsRasterTarget(int methodGuard) {
        SoftwareRasterizer.setRasterTarget(this.pixels, this.width, this.height);
        if (methodGuard != 255) {
            Random nullRandomForInvalidGuard = (Random) null;
            AwtRasterBuffer.nextBoundedRandomInt((byte) -94, (Random) null, 54);
        }
    }

    static {
        archiveGzipInflater = new GzipInflater();
    }
}
