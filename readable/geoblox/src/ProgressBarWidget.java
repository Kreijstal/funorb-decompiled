/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ProgressBarWidget extends UiWidget {
    static int[] field_D;
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
    static boolean field_G;
    boolean animationEnabled;
    static IntrusiveDeque field_B;

    private final Sprite buildStripeSprite(int alternateColor, boolean restoreGuard, int stripeColor) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Geoblox.clientControlFlowFlag;
        Sprite var14 = new Sprite(this.stripeWidth * 2, this.widgetHeight);
        Geoblox.setRasterTarget(1, var14);
        int var5 = this.widgetHeight >> 1;
        for (var6 = 0; this.widgetHeight > var6; var6++) {
            var7 = (var6 >> 1) * (-1 + this.stripeWidth * 2) % (this.stripeWidth * 2);
            var8 = 16711935 & stripeColor;
            var9 = 65280 & stripeColor;
            var10 = -var5 + var6;
            var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
            var12 = var11 >= 256 ? var9 | var8 : (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 8;
            SoftwareRasterizer.drawHorizontalLine(var7, var6, this.stripeWidth, var12);
            SoftwareRasterizer.drawHorizontalLine(-(2 * this.stripeWidth) + var7, var6, this.stripeWidth, var12);
            var9 = alternateColor & 65280;
            var8 = alternateColor & 16711935;
            var12 = 256 > var11 ? (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
            SoftwareRasterizer.drawHorizontalLine(this.stripeWidth + var7, var6, this.stripeWidth, var12);
            SoftwareRasterizer.drawHorizontalLine(-this.stripeWidth + var7, var6, this.stripeWidth, var12);
        }
        RasterTargetRestoreSupport.restoreRasterTarget(restoreGuard);
        return var14;
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
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Geoblox.clientControlFlowFlag;
        int var2 = this.widgetHeight >> 1;
        Sprite var3 = new Sprite(var2, this.widgetHeight);
        if (methodGuard != 255) {
            return (Sprite) null;
        }
        Geoblox.setRasterTarget(1, var3);
        for (var4 = 0; var4 < this.widgetHeight; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.widgetHeight));
                var8 = 1;
                if (!(!(var6 < 1.0))) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        RasterTargetRestoreSupport.restoreRasterTarget(true);
        return var3;
    }

    private final void drawRoundedStripes(Sprite stripeSprite, int y, int x, int methodGuard) {
        int var6 = 0;
        Sprite discarded$0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Geoblox.clientControlFlowFlag;
        try {
          var5_int = x + this.widgetWidth;
          PasswordWidgetRenderer.a(y, this.rightEndMask.width + x, methodGuard ^ 6447, this.widgetHeight + y, var5_int - this.rightEndMask.width);
          for (var6 = x - this.stripeOffset; var6 < var5_int; var6 = var6 + stripeSprite.width) {
            stripeSprite.draw(var6, y);
          }
          if (methodGuard != -12276) {
            discarded$0 = this.buildRightEndMask(1);
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
          if (SoftwareRasterizer.clipRight >= var5_int - this.rightEndMask.width) {
            Geoblox.setRasterTarget(methodGuard ^ -12275, this.endScratchSprite);
            for (var7 = this.stripeOffset + (this.widgetWidth - this.rightEndMask.width); var7 > 2 * this.stripeWidth; var7 = var7 - 2 * this.stripeWidth) {
            }
            stripeSprite.draw(-var7, 0);
            stripeSprite.draw(-var7 + this.stripeWidth * 2, 0);
            this.rightEndMask.drawMultiply(0, 0);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            this.endScratchSprite.draw(-this.rightEndMask.width + var5_int, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("hl.G(");
          if (stripeSprite == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(y).append(',').append(x).append(',').append(methodGuard).append(')').toString());
        }
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5 = -76 % ((methodGuard - 1) / 43);
        if (!(renderPass == 0)) {
            return;
        }
        int var6 = parentX + this.widgetX;
        int var7 = parentY + this.widgetY;
        this.drawRoundedStripes(this.stripeSprites[0], var7, var6, -12276);
        if (this.fillFractionQ16 < 65536) {
            PasswordWidgetRenderer.a(var7, var6 + (this.widgetWidth * this.fillFractionQ16 >> 16), -14045, var7 + this.widgetHeight, this.widgetWidth + var6);
            this.drawRoundedStripes(this.stripeSprites[1], var7, var6, -12276);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
        }
    }

    final void setWidgetBounds(int height, int width, byte methodGuard, int y, int x) {
        Sprite discarded$0 = null;
        super.setWidgetBounds(height, width, (byte) -74, y, x);
        this.rebuildSprites(-1326628703);
        if (methodGuard > -6) {
            discarded$0 = this.buildRightEndMask(109);
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

    public static void f(int param0) {
        if (param0 != 407213000) {
            ProgressBarWidget.f(93);
        }
        field_B = null;
        decodedSpriteHeights = null;
        field_D = null;
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.animationEnabled) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeOffset > 2 * this.stripeWidth) {
              this.stripeOffset = this.stripeOffset - 2 * this.stripeWidth;
            }
          }
          if (hoverGuard) {
            field_G = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("hl.H(").append(hoverGuard).append(',').append(parentY).append(',');
          if (eventContext == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(parentX).append(')').toString());
        }
    }

    static {
        field_D = new int[4];
        field_G = true;
    }
}
