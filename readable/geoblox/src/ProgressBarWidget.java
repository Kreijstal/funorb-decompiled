/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressBarWidget extends UiWidget {
    static int[] loginCipherSeedWords;
    private Sprite[] stripeSprites;
    private int dimStripeColor;
    private int alternateStripeColor;
    private int stripeColor;
    private int dimAlternateStripeColor;
    private Sprite leftEndMask;
    private Sprite endScratchSprite;
    private int stripeWidth;
    int fillFractionQ16;
    private Sprite rightEndMask;
    private int stripeOffset;
    static int[] decodedSpriteHeights;
    static boolean guestSessionMode;
    boolean animationEnabled;
    static IntrusiveDeque primarySocialEntriesInOrder;

    private final Sprite buildStripeSprite(int alternateColor, boolean restoreGuard, int stripeColor) {
        int stripeRow = 0;
        int stripeStartX = 0;
        int packedRedBlueChannels = 0;
        int packedGreenChannel = 0;
        int rowOffsetFromMidpoint = 0;
        int brightnessQ8 = 0;
        int shadedStripeColor = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        Sprite stripeSprite = new Sprite(this.stripeWidth * 2, this.widgetHeight);
        Geoblox.setRasterTarget(1, stripeSprite);
        int halfHeight = this.widgetHeight >> 1;
        for (stripeRow = 0; this.widgetHeight > stripeRow; stripeRow++) {
            stripeStartX = (stripeRow >> 1) * (-1 + this.stripeWidth * 2) % (this.stripeWidth * 2);
            packedRedBlueChannels = 16711935 & stripeColor;
            packedGreenChannel = 65280 & stripeColor;
            rowOffsetFromMidpoint = -halfHeight + stripeRow;
            brightnessQ8 = (int)(128.0 * (Math.sqrt((double)(-(rowOffsetFromMidpoint * rowOffsetFromMidpoint) + halfHeight * halfHeight)) / (double)halfHeight)) + 128;
            shadedStripeColor = brightnessQ8 >= 256 ? packedGreenChannel | packedRedBlueChannels : (-16711936 & brightnessQ8 * packedRedBlueChannels | 16711680 & brightnessQ8 * packedGreenChannel) >>> 8;
            SoftwareRasterizer.drawHorizontalLine(stripeStartX, stripeRow, this.stripeWidth, shadedStripeColor);
            SoftwareRasterizer.drawHorizontalLine(-(2 * this.stripeWidth) + stripeStartX, stripeRow, this.stripeWidth, shadedStripeColor);
            packedGreenChannel = alternateColor & 65280;
            packedRedBlueChannels = alternateColor & 16711935;
            shadedStripeColor = 256 > brightnessQ8 ? (16711680 & packedGreenChannel * brightnessQ8 | -16711936 & brightnessQ8 * packedRedBlueChannels) >>> 8 : packedGreenChannel | packedRedBlueChannels;
            SoftwareRasterizer.drawHorizontalLine(this.stripeWidth + stripeStartX, stripeRow, this.stripeWidth, shadedStripeColor);
            SoftwareRasterizer.drawHorizontalLine(-this.stripeWidth + stripeStartX, stripeRow, this.stripeWidth, shadedStripeColor);
        }
        RasterTargetRestoreSupport.restoreRasterTarget(restoreGuard);
        return stripeSprite;
    }

    final void setStripeColors(int alternateStripeColor, int stripeColor, byte methodGuard) {
        this.dimAlternateStripeColor = 8355711 & alternateStripeColor >> 1;
        this.stripeColor = stripeColor;
        this.dimStripeColor = stripeColor >> 1 & 8355711;
        if (methodGuard != -103) {
            this.rebuildSprites(-107);
        }
        this.alternateStripeColor = alternateStripeColor;
        this.rebuildSprites(-1326628703);
    }

    private final Sprite buildRightEndMask(int methodGuard) {
        int maskRow = 0;
        int maskColumn = 0;
        double coverageRatioThenRoot = 0.0;
        int maskIntensity = 0;
        int clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        int halfHeight = this.widgetHeight >> 1;
        Sprite endMaskSprite = new Sprite(halfHeight, this.widgetHeight);
        if (methodGuard != 255) {
            return (Sprite) null;
        }
        Geoblox.setRasterTarget(1, endMaskSprite);
        for (maskRow = 0; maskRow < this.widgetHeight; maskRow++) {
            for (maskColumn = 0; maskColumn < halfHeight; maskColumn++) {
                coverageRatioThenRoot = (double)maskColumn * (double)maskColumn / (double)(maskRow * (-maskRow + this.widgetHeight));
                maskIntensity = 1;
                if (coverageRatioThenRoot < 1.0) {
                    coverageRatioThenRoot = Math.sqrt(1.0 - coverageRatioThenRoot);
                    maskIntensity = coverageRatioThenRoot >= 1.0 ? 255 : (int)(coverageRatioThenRoot * 255.0);
                }
                SoftwareRasterizer.setPixel(maskColumn, maskRow, maskIntensity << 16 | (maskIntensity | maskIntensity << 8));
            }
        }
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        return endMaskSprite;
    }

    private final void drawRoundedStripes(Sprite stripeSprite, int y, int x, int methodGuard) {
        int stripeDrawX = 0;
        Sprite ignoredGuardMaskResult = null;
        RuntimeException stripeDrawingFailureBeforeDescription = null;
        StringBuilder stripeDrawingMessagePrefix = null;
        String stripeSpriteDescription = null;
        RuntimeException stripeDrawingFailure = null;
        int widgetRightX = 0;
        RuntimeException stripeDrawingFailureForContext = null;
        int rightEndStripeOffset = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          widgetRightX = x + this.widgetWidth;
          PasswordWidgetRenderer.pushWidgetClip(y, this.rightEndMask.width + x, methodGuard ^ 6447, this.widgetHeight + y, widgetRightX - this.rightEndMask.width);
          for (stripeDrawX = x - this.stripeOffset; stripeDrawX < widgetRightX; stripeDrawX = stripeDrawX + stripeSprite.width) {
            stripeSprite.draw(stripeDrawX, y);
          }
          if (methodGuard != -12276) {
            ignoredGuardMaskResult = this.buildRightEndMask(1);
          }
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          if (this.rightEndMask.width + x >= SoftwareRasterizer.clipLeft) {
            Geoblox.setRasterTarget(1, this.endScratchSprite);
            stripeSprite.draw(-this.stripeOffset, 0);
            stripeSprite.draw(2 * this.stripeWidth - this.stripeOffset, 0);
            this.leftEndMask.drawMultiply(0, 0);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            this.endScratchSprite.draw(x, y);
          }
          if (SoftwareRasterizer.clipRight >= widgetRightX - this.rightEndMask.width) {
            Geoblox.setRasterTarget(methodGuard ^ -12275, this.endScratchSprite);
            for (rightEndStripeOffset = this.stripeOffset + (this.widgetWidth - this.rightEndMask.width); rightEndStripeOffset > 2 * this.stripeWidth; rightEndStripeOffset = rightEndStripeOffset - 2 * this.stripeWidth) {
            }
            stripeSprite.draw(-rightEndStripeOffset, 0);
            stripeSprite.draw(-rightEndStripeOffset + this.stripeWidth * 2, 0);
            this.rightEndMask.drawMultiply(0, 0);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            this.endScratchSprite.draw(-this.rightEndMask.width + widgetRightX, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtStripeDrawingFailure) {
          stripeDrawingFailure = caughtStripeDrawingFailure;
          stripeDrawingFailureForContext = stripeDrawingFailure;
          stripeDrawingFailureBeforeDescription = stripeDrawingFailureForContext;
          stripeDrawingMessagePrefix = new StringBuilder().append("hl.G(");
          if (stripeSprite == null) {
            stripeSpriteDescription = "null";
          } else {
            stripeSpriteDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stripeDrawingFailureBeforeDescription), ((StringBuilder) (Object) stripeDrawingMessagePrefix).append(stripeSpriteDescription).append(',').append(y).append(',').append(x).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int renderGuardRemainder = -76 % ((methodGuard - 1) / 43);
        if (renderPass != 0) {
            return;
        }
        int widgetScreenX = parentX + this.widgetX;
        int widgetScreenY = parentY + this.widgetY;
        this.drawRoundedStripes(this.stripeSprites[0], widgetScreenY, widgetScreenX, -12276);
        if (this.fillFractionQ16 < 65536) {
            PasswordWidgetRenderer.pushWidgetClip(widgetScreenY, widgetScreenX + (this.widgetWidth * this.fillFractionQ16 >> 16), -14045, widgetScreenY + this.widgetHeight, this.widgetWidth + widgetScreenX);
            this.drawRoundedStripes(this.stripeSprites[1], widgetScreenY, widgetScreenX, -12276);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
        }
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        Sprite ignoredBoundsGuardMaskResult = null;
        super.setWidgetBounds(height, width, (byte) -74, y, x);
        this.rebuildSprites(-1326628703);
        if (methodGuard > -6) {
            ignoredBoundsGuardMaskResult = this.buildRightEndMask(109);
        }
    }

    private final void rebuildSprites(int methodGuard) {
        this.stripeSprites = new Sprite[]{this.buildStripeSprite(this.alternateStripeColor, true, this.stripeColor), this.buildStripeSprite(this.dimAlternateStripeColor, true, this.dimStripeColor)};
        this.rightEndMask = this.buildRightEndMask(255);
        if (methodGuard != -1326628703) {
            return;
        }
        this.leftEndMask = this.rightEndMask.copyMirroredHorizontally();
        this.endScratchSprite = new Sprite(this.widgetHeight >> 1, this.widgetHeight);
    }

    private ProgressBarWidget(int x, int y, int width, int height, int stripeWidth, int stripeColor, int alternateStripeColor, int dimStripeColor, int dimAlternateStripeColor) {
        this.stripeColor = stripeColor;
        this.stripeWidth = stripeWidth;
        this.alternateStripeColor = alternateStripeColor;
        this.dimStripeColor = dimStripeColor;
        this.dimAlternateStripeColor = dimAlternateStripeColor;
        this.setWidgetBounds(height, width, (byte) -121, y, x);
    }

    ProgressBarWidget(int x, int y, int width, int height, int stripeWidth, int stripeColor, int alternateStripeColor) {
        this(x, y, width, height, stripeWidth, stripeColor, alternateStripeColor, stripeColor >> 1 & 8355711, alternateStripeColor >> 1 & 8355711);
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 407213000) {
            ProgressBarWidget.releaseStaticReferences(93);
        }
        primarySocialEntriesInOrder = null;
        decodedSpriteHeights = null;
        loginCipherSeedWords = null;
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        RuntimeException pointerUpdateFailureBeforeDescription = null;
        StringBuilder pointerUpdateMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException pointerUpdateFailure = null;
        RuntimeException pointerUpdateFailureForContext = null;
        try {
          if (this.animationEnabled) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeOffset > 2 * this.stripeWidth) {
              this.stripeOffset = this.stripeOffset - 2 * this.stripeWidth;
            }
          }
          if (hoverGuard) {
            guestSessionMode = false;
          }
          return;
        } catch (java.lang.RuntimeException caughtPointerUpdateFailure) {
          pointerUpdateFailure = caughtPointerUpdateFailure;
          pointerUpdateFailureForContext = pointerUpdateFailure;
          pointerUpdateFailureBeforeDescription = pointerUpdateFailureForContext;
          pointerUpdateMessagePrefix = new StringBuilder().append("hl.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailureBeforeDescription), ((StringBuilder) (Object) pointerUpdateMessagePrefix).append(eventContextDescription).append(',').append(parentX).append(')').toString());
        }
    }

    static {
        loginCipherSeedWords = new int[4];
        guestSessionMode = true;
    }
}
