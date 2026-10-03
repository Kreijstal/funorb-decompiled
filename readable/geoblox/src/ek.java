/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static IndexedSprite[] field_a;

    public static void a(int param0) {
        if (param0 >= -127) {
            return;
        }
        field_a = null;
    }

    final static void compositeScaledDebugOverview(int destinationHeight, boolean enabled, Sprite overviewSprite, int destinationTop, int destinationWidth, int destinationLeft) {
        RuntimeException compositeFailureBeforeSpriteDescription = null;
        StringBuilder compositeMessagePrefix = null;
        String overviewSpriteArgumentDescription = null;
        RuntimeException caughtCompositeFailure = null;
        int sourceCropWidth = 0;
        RuntimeException compositeFailureForContext = null;
        int sourceCropHeight = 0;
        int sampleXQ16 = 0;
        int sampleYQ16 = 0;
        int sourceCanvasWidth = 0;
        int sourceCanvasHeight = 0;
        int sampleXStepQ16 = 0;
        int sampleYStepQ16 = 0;
        int trimSkipOrDestinationIndex = 0;
        int destinationRowSkip = 0;
        int clippedPixelCount = 0;
        try {
          sourceCropWidth = overviewSprite.width;
          sourceCropHeight = overviewSprite.height;
          sampleXQ16 = 0;
          sampleYQ16 = 0;
          if (!enabled) {
            return;
          }
          sourceCanvasWidth = overviewSprite.fullWidth;
          sourceCanvasHeight = overviewSprite.fullHeight;
          sampleXStepQ16 = (sourceCanvasWidth << 16) / destinationWidth;
          sampleYStepQ16 = (sourceCanvasHeight << 16) / destinationHeight;
          if (overviewSprite.trimX > 0) {
            trimSkipOrDestinationIndex = ((overviewSprite.trimX << 16) + (sampleXStepQ16 - 1)) / sampleXStepQ16;
            sampleXQ16 = sampleXQ16 + (-(overviewSprite.trimX << 16) + sampleXStepQ16 * trimSkipOrDestinationIndex);
            destinationLeft = destinationLeft + trimSkipOrDestinationIndex;
          }
          if (sourceCropWidth < sourceCanvasWidth) {
            destinationWidth = (sampleXStepQ16 + ((sourceCropWidth << 16) + (-sampleXQ16 - 1))) / sampleXStepQ16;
          }
          if (overviewSprite.trimY > 0) {
            trimSkipOrDestinationIndex = ((overviewSprite.trimY << 16) + sampleYStepQ16 - 1) / sampleYStepQ16;
            sampleYQ16 = sampleYQ16 + (trimSkipOrDestinationIndex * sampleYStepQ16 - (overviewSprite.trimY << 16));
            destinationTop = destinationTop + trimSkipOrDestinationIndex;
          }
          if (sourceCanvasHeight > sourceCropHeight) {
            destinationHeight = (sampleYStepQ16 + (-sampleYQ16 + (sourceCropHeight << 16)) - 1) / sampleYStepQ16;
          }
          trimSkipOrDestinationIndex = destinationLeft + SoftwareRasterizer.stride * destinationTop;
          destinationRowSkip = SoftwareRasterizer.stride - destinationWidth;
          if (SoftwareRasterizer.clipBottom < destinationTop + destinationHeight) {
            destinationHeight = destinationHeight - (-SoftwareRasterizer.clipBottom + destinationTop + destinationHeight);
          }
          if (SoftwareRasterizer.clipTop > destinationTop) {
            clippedPixelCount = SoftwareRasterizer.clipTop - destinationTop;
            sampleYQ16 = sampleYQ16 + sampleYStepQ16 * clippedPixelCount;
            destinationHeight = destinationHeight - clippedPixelCount;
            trimSkipOrDestinationIndex = trimSkipOrDestinationIndex + SoftwareRasterizer.stride * clippedPixelCount;
          }
          if (destinationWidth + destinationLeft > SoftwareRasterizer.clipRight) {
            clippedPixelCount = destinationLeft + (destinationWidth - SoftwareRasterizer.clipRight);
            destinationRowSkip = destinationRowSkip + clippedPixelCount;
            destinationWidth = destinationWidth - clippedPixelCount;
          }
          if (destinationLeft < SoftwareRasterizer.clipLeft) {
            clippedPixelCount = SoftwareRasterizer.clipLeft - destinationLeft;
            trimSkipOrDestinationIndex = trimSkipOrDestinationIndex + clippedPixelCount;
            destinationRowSkip = destinationRowSkip + clippedPixelCount;
            sampleXQ16 = sampleXQ16 + clippedPixelCount * sampleXStepQ16;
            destinationWidth = destinationWidth - clippedPixelCount;
          }
          lc.blendScaledDebugOverviewPixels(sampleXQ16, destinationHeight, SoftwareRasterizer.framebuffer, sampleXStepQ16, sampleYStepQ16, sourceCropWidth, sampleYQ16, destinationRowSkip, trimSkipOrDestinationIndex, destinationWidth, (byte) -104, overviewSprite.pixels, 0);
          return;
        } catch (java.lang.RuntimeException scaledOverviewFailure) {
          caughtCompositeFailure = scaledOverviewFailure;
          compositeFailureForContext = caughtCompositeFailure;
          compositeFailureBeforeSpriteDescription = (RuntimeException) (compositeFailureForContext);
          compositeMessagePrefix = new StringBuilder().append("ek.A(").append(destinationHeight).append(',').append(enabled).append(',');
          if (overviewSprite == null) {
            overviewSpriteArgumentDescription = "null";
          } else {
            overviewSpriteArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) compositeFailureBeforeSpriteDescription), ((StringBuilder) (Object) compositeMessagePrefix).append(overviewSpriteArgumentDescription).append(',').append(destinationTop).append(',').append(destinationWidth).append(',').append(destinationLeft).append(')').toString());
        }
    }

    static {
    }
}
