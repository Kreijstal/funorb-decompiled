/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressWidget extends Widget {
    private static int[] field_M;
    private int stripeWidth;
    private int dimPrimaryColour;
    private int stripeOffset;
    int filledFraction;
    static ClientUiComponent field_F;
    private RgbSprite leftCapMask;
    private int dimSecondaryColour;
    private int primaryColour;
    private RgbSprite[] stripeTextures;
    private RgbSprite rightCapMask;
    private int secondaryColour;
    boolean animated;
    private RgbSprite capScratch;
    static String field_G;
    static int[] field_Q;

    private final RgbSprite createStripeTexture(int secondaryColour, int obfuscationGuard, int primaryColour) {
        int row = 0;
        int stripeX = 0;
        int primaryRedBlue = 0;
        int primaryGreen = 0;
        int rowFromCenter = 0;
        int intensity = 0;
        int primaryShade = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        RgbSprite texture = new RgbSprite(this.stripeWidth * 2, this.height);
        int secondaryRedBlue;
        int secondaryGreen;
        int secondaryShade;
        CombatSandbox.a(texture, 3);
        int halfHeight = this.height >> 1;
        if (obfuscationGuard >= -54) {
          return (RgbSprite) null;
        }
        for (row = 0; row < this.height; row++) {
          stripeX = (this.stripeWidth * 2 - 1) * (row >> 1) % (this.stripeWidth * 2);
          primaryRedBlue = primaryColour & 16711935;
          primaryGreen = 65280 & primaryColour;
          rowFromCenter = row - halfHeight;
          intensity = (int)(Math.sqrt((double)(halfHeight * halfHeight - rowFromCenter * rowFromCenter)) / (double)halfHeight * 128.0) + 128;
          primaryShade = intensity < 256 ? (primaryRedBlue * intensity & -16711936 | 16711680 & intensity * primaryGreen) >>> 8 : primaryGreen | primaryRedBlue;
          SoftwareRaster.e(stripeX, row, this.stripeWidth, primaryShade);
          secondaryRedBlue = 16711935 & secondaryColour;
          SoftwareRaster.e(stripeX - this.stripeWidth * 2, row, this.stripeWidth, primaryShade);
          secondaryGreen = 65280 & secondaryColour;
          secondaryShade = intensity >= 256 ? secondaryGreen | secondaryRedBlue : (16711680 & secondaryGreen * intensity | -16711936 & intensity * secondaryRedBlue) >>> 8;
          SoftwareRaster.e(stripeX + this.stripeWidth, row, this.stripeWidth, secondaryShade);
          SoftwareRaster.e(-this.stripeWidth + stripeX, row, this.stripeWidth, secondaryShade);
        }
        QuickChatPhraseRepository.popRasterState(-18862);
        return texture;
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        super.setBounds(x, width, y, obfuscationGuard, height);
        this.refreshTextures(3);
    }

    final void setColours(int secondaryColour, int primaryColour, int obfuscationGuard) {
        this.primaryColour = primaryColour;
        this.secondaryColour = secondaryColour;
        this.dimPrimaryColour = primaryColour >> 1 & 8355711;
        this.dimSecondaryColour = 8355711 & secondaryColour >> 1;
        this.refreshTextures(3);
        if (obfuscationGuard != 27178) {
          field_F = (ClientUiComponent) null;
        }
    }

    private final void drawStripeTexture(int obfuscationGuard, int y, RgbSprite texture, int x) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int rightX = 0;
        RuntimeException failure = null;
        int tileX = 0;
        int guardQuotient = 0;
        int rightTileOffset = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          rightX = x + this.width;
          CampaignUnitOverride.a(this.rightCapMask.pixelWidth + x, -this.rightCapMask.pixelWidth + rightX, y + this.height, y, (byte) 87);
          tileX = -this.stripeOffset + x;
          guardQuotient = -123 / ((obfuscationGuard + 26) / 40);
          while (tileX < rightX) {
            texture.drawTransparent(tileX, y);
            tileX = tileX + texture.pixelWidth;
          }
          QuickChatPhraseRepository.popRasterState(-18862);
          if (SoftwareRaster.clipLeft <= x + this.rightCapMask.pixelWidth) {
            CombatSandbox.a(this.capScratch, 3);
            texture.drawTransparent(-this.stripeOffset, 0);
            texture.drawTransparent(this.stripeWidth * 2 - this.stripeOffset, 0);
            this.leftCapMask.b(0, 0);
            QuickChatPhraseRepository.popRasterState(-18862);
            this.capScratch.drawTransparent(x, y);
          }
          if (-this.rightCapMask.pixelWidth + rightX <= SoftwareRaster.clipRight) {
            CombatSandbox.a(this.capScratch, 3);
            for (rightTileOffset = -this.rightCapMask.pixelWidth + this.width + this.stripeOffset; rightTileOffset > this.stripeWidth * 2; rightTileOffset = rightTileOffset - this.stripeWidth * 2) {
            }
            texture.drawTransparent(-rightTileOffset, 0);
            texture.drawTransparent(-rightTileOffset + this.stripeWidth * 2, 0);
            this.rightCapMask.b(0, 0);
            QuickChatPhraseRepository.popRasterState(-18862);
            this.capScratch.drawTransparent(rightX - this.rightCapMask.pixelWidth, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_16_0 = failure;
          stackIn_16_1 = new StringBuilder().append("rj.H(").append(obfuscationGuard).append(',').append(y).append(',');
          if (texture == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(x).append(')').toString());
        }
    }

    final static bi a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
          Class var4 = null;
          Throwable var4_ref = null;
          RuntimeException var4_ref2 = null;
          bi var5 = null;
          dh var5_ref = null;
          bi stackIn_2_0 = null;
          bi stackIn_4_0 = null;
          dh stackIn_6_0 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var4 = Class.forName("jo");
              var5 = (bi) (var4.newInstance());
              if (param2 != 1423111778) {
                stackIn_2_0 = (bi) null;
                return stackIn_2_0;
              }
              var5.a(param0, param2 ^ -1423111760, param3, param1);
              stackIn_4_0 = var5;
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4_ref = decompiledCaughtException;
              var5_ref = new dh();
              ((bi) ((Object) var5_ref)).a(param0, -46, param3, param1);
              stackIn_6_0 = var5_ref;
              return (bi) ((Object) stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var4_ref2;
            stackIn_9_1 = new StringBuilder().append("rj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    StripedProgressWidget(int x, int y, int width, int height, int stripeWidth, int primaryColour, int secondaryColour) {
        this(x, y, width, height, stripeWidth, primaryColour, secondaryColour, primaryColour >> 1 & 8355711, (secondaryColour & 16711422) >> 1);
    }

    public static void a(byte param0) {
        field_G = null;
        field_M = null;
        field_F = null;
        if (param0 >= -67) {
          return;
        }
        field_Q = null;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        if (obfuscationGuard >= -82) {
          return;
        }
        if (0 != renderLayer) {
          return;
        }
        int widgetX = this.x + originX;
        int widgetY = originY + this.y;
        this.drawStripeTexture(-77, widgetY, this.stripeTextures[0], widgetX);
        if (65536 > this.filledFraction) {
          CampaignUnitOverride.a((this.width * this.filledFraction >> 16) + widgetX, widgetX + this.width, this.height + widgetY, widgetY, (byte) 74);
          this.drawStripeTexture(-103, widgetY, this.stripeTextures[1], widgetX);
          QuickChatPhraseRepository.popRasterState(-18862);
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        RgbSprite guardTexture = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException failure = null;
        try {
          if (this.animated) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeWidth * 2 < this.stripeOffset) {
              this.stripeOffset = this.stripeOffset - this.stripeWidth * 2;
            }
          }
          if (obfuscationGuard != 32722) {
            guardTexture = this.createStripeTexture(11, 65, -18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_10_0 = failure;
          stackIn_10_1 = new StringBuilder().append("rj.P(").append(obfuscationGuard).append(',').append(originX).append(',').append(originY).append(',');
          if (rootWidget == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (DamageEvent.isGuestSession(125)) {
          return;
        }
        if (!DisplayModeOptionPainter.field_v) {
          return;
        }
        byte[] var2 = new byte[2];
        byte[] var1 = var2;
        var2[param0] = (byte)(ek.field_d << 2);
        var2[0] = (byte) 1;
        if (uc.field_a) {
          var2[1] = (byte)AccountRegistrationDialog.bitwiseOr((int) var2[1], 2);
        }
        if (cu.field_a) {
          var2[1] = (byte)AccountRegistrationDialog.bitwiseOr((int) var2[1], 1);
        }
        MusicCrossfadeStream.a(0, 6, var2);
        DisplayModeOptionPainter.field_v = false;
    }

    private final RgbSprite createCapMask(int obfuscationGuard) {
        int row = 0;
        int column = 0;
        double curveRatio = 0.0;
        int maskIntensity = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int maskWidth = this.height >> 1;
        RgbSprite mask = new RgbSprite(maskWidth, this.height);
        CombatSandbox.a(mask, obfuscationGuard - 747);
        if (obfuscationGuard != 750) {
          return (RgbSprite) null;
        }
        for (row = 0; row < this.height; row++) {
          for (column = 0; maskWidth > column; column++) {
            curveRatio = (double)column * (double)column / (double)((-row + this.height) * row);
            maskIntensity = 1;
            if (curveRatio < 1.0) {
              curveRatio = Math.sqrt(-curveRatio + 1.0);
              maskIntensity = 1.0 <= curveRatio ? 255 : (int)(curveRatio * 255.0);
            }
            SoftwareRaster.a(column, row, maskIntensity | maskIntensity << 8 | maskIntensity << 16);
          }
        }
        QuickChatPhraseRepository.popRasterState(obfuscationGuard - 19612);
        return mask;
    }

    private final void refreshTextures(int obfuscationGuard) {
        this.stripeTextures = new RgbSprite[]{this.createStripeTexture(this.secondaryColour, -61, this.primaryColour), this.createStripeTexture(this.dimSecondaryColour, -120, this.dimPrimaryColour)};
        this.rightCapMask = this.createCapMask(750);
        this.leftCapMask = this.rightCapMask.e();
        if (obfuscationGuard != 3) {
          field_Q = (int[]) null;
        }
        this.capScratch = new RgbSprite(this.height >> 1, this.height);
    }

    final static void releaseSpriteDecodeBuffers(byte obfuscationGuard) {
        c.decodedSpriteHeights = null;
        ClippedWidgetContainer.decodedSpriteWidths = null;
        j.decodedSpriteOffsetXs = null;
        AnimationPlayer.decodedSpriteIndices = (byte[][]) null;
        if (obfuscationGuard < 96) {
          return;
        }
        MovementPresentation.decodedSpritePalette = null;
        CampaignMenuButton.decodedSpriteOffsetYs = null;
    }

    private StripedProgressWidget(int x, int y, int width, int height, int stripeWidth, int primaryColour, int secondaryColour, int dimPrimaryColour, int dimSecondaryColour) {
        this.primaryColour = primaryColour;
        this.secondaryColour = secondaryColour;
        this.dimPrimaryColour = dimPrimaryColour;
        this.stripeWidth = stripeWidth;
        this.dimSecondaryColour = dimSecondaryColour;
        this.setBounds(x, width, y, 8192, height);
    }

    static {
        int var0 = 0;
        field_M = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
          field_M[var0] = 65536 * (var0 / 2) + (1 * var0 + 256 * (var0 / 3));
        }
        field_G = "Quality: ";
        field_Q = new int[8192];
    }
}
