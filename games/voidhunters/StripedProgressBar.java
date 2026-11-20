/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressBar extends UiComponent {
    private Sprite capScratch;
    private int secondaryColor;
    private int stripeWidth;
    private Sprite[] stripePatterns;
    private int dimSecondaryColor;
    private Sprite leftCapMask;
    private int primaryColor;
    boolean animateStripes;
    private Sprite rightCapMask;
    private int dimPrimaryColor;
    int progress16;
    static char field_B;
    static String field_z;
    private int stripeOffset;

    private final Sprite createStripePattern(boolean param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = VoidHunters.field_G;
        Sprite var14 = new Sprite(this.stripeWidth * 2, this.height);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        SetTorpedoEnergyUsed.pushSpriteRasterTarget(105, var14);
        int var5 = this.height >> 1;
        int var6 = 0;
        if (!param0) {
          this.dimPrimaryColor = -72;
        }
        while (this.height > var6) {
          var7 = (var6 >> 1) * (2 * this.stripeWidth - 1) % (this.stripeWidth * 2);
          var8 = param1 & 16711935;
          var9 = 65280 & param1;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
          var12 = var11 < 256 ? (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> 8 : var9 | var8;
          SoftwareRasterizer2D.drawHorizontalLine(var7, var6, this.stripeWidth, var12);
          SoftwareRasterizer2D.drawHorizontalLine(var7 - 2 * this.stripeWidth, var6, this.stripeWidth, var12);
          var8Lifetime1 = 16711935 & param2;
          var9Lifetime1 = param2 & 65280;
          var12Lifetime1 = 256 <= var11 ? var8Lifetime1 | var9Lifetime1 : (16711680 & var9Lifetime1 * var11 | var8Lifetime1 * var11 & -16711936) >>> 8;
          SoftwareRasterizer2D.drawHorizontalLine(this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          SoftwareRasterizer2D.drawHorizontalLine(-this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          var6++;
        }
        SoftwareRasterStateRestorer.popRasterState((byte) 124);
        return var14;
    }

    final void setColors(int param0, int param1, int param2) {
        this.dimPrimaryColor = 8355711 & param0 >> 1;
        this.primaryColor = param0;
        this.secondaryColor = param2;
        this.dimSecondaryColor = param2 >> 1 & 8355711;
        if (param1 != -21202) {
          StripedProgressBar.clearSharedReferences(87);
        }
        this.rebuildSprites(107);
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.animateStripes) {
            this.stripeOffset = this.stripeOffset + 1;
            if (this.stripeWidth * 2 < this.stripeOffset) {
              this.stripeOffset = this.stripeOffset - this.stripeWidth * 2;
            }
          }
          if (param2 != -981) {
            StripedProgressBar.clearSharedReferences(-78);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ttb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final Sprite createCapMask(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        int var2 = this.height >> 1;
        Sprite var3 = new Sprite(var2, this.height);
        SetTorpedoEnergyUsed.pushSpriteRasterTarget(78, var3);
        if (param0) {
          Sprite var10 = (Sprite) null;
          this.drawStripedBar(-50, -55, (Sprite) null, -43);
        }
        for (var4 = 0; this.height > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)(var4 * (this.height - var4));
            var8 = 1;
            if (1.0 > var6) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = var6 >= 1.0 ? 255 : (int)(255.0 * var6);
            }
            SoftwareRasterizer2D.drawPixel(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        SoftwareRasterStateRestorer.popRasterState((byte) 124);
        return var3;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        if (param2 < 47) {
          this.setBounds(48, -94, 68, 84, -83);
        }
        int var5 = param0 + this.x;
        int var6 = this.y + param3;
        this.drawStripedBar(2, var6, this.stripePatterns[0], var5);
        if (this.progress16 < 65536) {
          SelectableIconLabelWidget.pushClip(this.width + var5, this.height + var6, var5 + (this.width * this.progress16 >> 16), true, var6);
          this.drawStripedBar(2, var6, this.stripePatterns[1], var5);
          SoftwareRasterStateRestorer.popRasterState((byte) 124);
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 16711935) {
          StripedProgressBar.clearSharedReferences(-30);
        }
        field_z = null;
    }

    private final void rebuildSprites(int param0) {
        if (param0 < 59) {
          return;
        }
        this.stripePatterns = new Sprite[]{this.createStripePattern(true, this.primaryColor, this.secondaryColor), this.createStripePattern(true, this.dimPrimaryColor, this.dimSecondaryColor)};
        this.rightCapMask = this.createCapMask(false);
        this.leftCapMask = this.rightCapMask.mirroredCopy();
        this.capScratch = new Sprite(this.height >> 1, this.height);
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1, param2, param3, param4);
        this.rebuildSprites(param3 ^ 125);
    }

    private StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.secondaryColor = param6;
        this.dimSecondaryColor = param8;
        this.primaryColor = param5;
        this.stripeWidth = param4;
        this.dimPrimaryColor = param7;
        this.setBounds(param0, param2, param3, 1, param1);
    }

    private final void drawStripedBar(int param0, int param1, Sprite param2, int param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          var5_int = this.width + param3;
          SelectableIconLabelWidget.pushClip(var5_int - this.rightCapMask.width, this.height + param1, param3 + this.rightCapMask.width, true, param1);
          var6 = param3 - this.stripeOffset;
          if (param0 != 2) {
            this.stripeOffset = 28;
          }
          while (var5_int > var6) {
            param2.draw(var6, param1);
            var6 = var6 + param2.width;
          }
          SoftwareRasterStateRestorer.popRasterState((byte) 124);
          if (param3 + this.rightCapMask.width >= SoftwareRasterizer2D.clipLeft) {
            SetTorpedoEnergyUsed.pushSpriteRasterTarget(param0 ^ 66, this.capScratch);
            param2.draw(-this.stripeOffset, 0);
            param2.draw(this.stripeWidth * 2 - this.stripeOffset, 0);
            this.leftCapMask.drawMultiply(0, 0);
            SoftwareRasterStateRestorer.popRasterState((byte) 124);
            this.capScratch.draw(param3, param1);
          }
          if (SoftwareRasterizer2D.clipRight >= var5_int - this.rightCapMask.width) {
            SetTorpedoEnergyUsed.pushSpriteRasterTarget(param0 + 22, this.capScratch);
            for (var7 = this.width - this.rightCapMask.width + this.stripeOffset; var7 > 2 * this.stripeWidth; var7 = var7 - this.stripeWidth * 2) {
            }
            param2.draw(-var7, 0);
            param2.draw(this.stripeWidth * 2 - var7, 0);
            this.rightCapMask.drawMultiply(0, 0);
            SoftwareRasterStateRestorer.popRasterState((byte) 124);
            this.capScratch.draw(-this.rightCapMask.width + var5_int, param1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ttb.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    StripedProgressBar(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    static {
        field_B = '/';
        field_z = "Loading instruments";
    }
}
