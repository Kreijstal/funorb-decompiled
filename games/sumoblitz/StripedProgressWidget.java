/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripedProgressWidget extends UiWidget {
    static String confirmEmailText;
    private int stripeWidth;
    private Sprite rightCapMask;
    boolean animated;
    private Sprite[] stripeSprites;
    private int secondColor;
    int progressQ16;
    static float[] field_y;
    private int firstColor;
    private int stripePhase;
    private Sprite leftCapMask;
    private int dimFirstColor;
    private int dimSecondColor;
    private Sprite capScratch;
    static SpriteData[] field_F;

    public static void releaseStatics(int param0) {
        field_y = null;
        confirmEmailText = null;
        if (param0 != -1346554936) {
          StripedProgressWidget.releaseStatics(-63);
        }
        field_F = null;
    }

    private final void rebuildSprites(int guard) {
        this.stripeSprites = new Sprite[]{this.createStripeTile(this.secondColor, (byte) -110, this.firstColor), this.createStripeTile(this.dimSecondColor, (byte) -5, this.dimFirstColor)};
        this.rightCapMask = this.createRoundCapMask(-53);
        if (guard != 880072001) {
          this.secondColor = -125;
        }
        this.leftCapMask = this.rightCapMask.copyMirroredHorizontally();
        this.capScratch = new Sprite(this.height >> 1, this.height);
    }

    final void setColors(int firstColor, int secondColor, int guard) {
        this.secondColor = secondColor;
        this.dimFirstColor = 8355711 & firstColor >> 1;
        this.dimSecondColor = (secondColor & 16711422) >> 1;
        if (guard <= 16) {
          return;
        }
        this.firstColor = firstColor;
        this.rebuildSprites(880072001);
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        int var5_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          var5_int = 94 / ((guard + 25) / 45);
          if (this.animated) {
            this.stripePhase = this.stripePhase + 1;
            if (this.stripePhase <= this.stripeWidth * 2) {
              return;
            }
            this.stripePhase = this.stripePhase - this.stripeWidth * 2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("pq.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(parentY).append(')').toString());
        }
    }

    private final Sprite createRoundCapMask(int guard) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        int var2 = this.height >> 1;
        Sprite var3 = new Sprite(var2, this.height);
        LegacyVertexAttribute.pushSpriteRaster(7161, var3);
        if (guard > -23) {
          this.rightCapMask = (Sprite) null;
        }
        for (var4 = 0; this.height > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.height) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(1.0 - var6);
              var8 = !(1.0 <= var6) ? (int)(var6 * 255.0) : 255;
            }
            SoftwareRasterizer.setPixel(var5, var4, var8 << 16 | (var8 | var8 << 8));
          }
        }
        ClientException.popRasterState((byte) -94);
        return var3;
    }

    private final Sprite createStripeTile(int secondColor, byte guard, int firstColor) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6 = 0;
        int var13 = Sumoblitz.field_L ? 1 : 0;
        Sprite var14 = new Sprite(2 * this.stripeWidth, this.height);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        int var6Lifetime1;
        LegacyVertexAttribute.pushSpriteRaster(7161, var14);
        int var5 = this.height >> 1;
        for (var6 = 0; this.height > var6; var6++) {
          var7 = (var6 >> 1) * (-1 + this.stripeWidth * 2) % (2 * this.stripeWidth);
          var8 = firstColor & 16711935;
          var9 = 65280 & firstColor;
          var10 = var6 - var5;
          var11 = 128 + (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0);
          var12 = var11 < 256 ? (var9 * var11 & 16711680 | -16711936 & var11 * var8) >>> 8 : var9 | var8;
          SoftwareRasterizer.drawHorizontalLine(var7, var6, this.stripeWidth, var12);
          var9Lifetime1 = secondColor & 65280;
          var8Lifetime1 = 16711935 & secondColor;
          SoftwareRasterizer.drawHorizontalLine(-(2 * this.stripeWidth) + var7, var6, this.stripeWidth, var12);
          var12Lifetime1 = 256 > var11 ? (16711680 & var11 * var9Lifetime1 | var8Lifetime1 * var11 & -16711936) >>> 8 : var8Lifetime1 | var9Lifetime1;
          SoftwareRasterizer.drawHorizontalLine(this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
          SoftwareRasterizer.drawHorizontalLine(-this.stripeWidth + var7, var6, this.stripeWidth, var12Lifetime1);
        }
        var6Lifetime1 = 21 % ((guard + 50) / 32);
        ClientException.popRasterState((byte) 44);
        return var14;
    }

    private final void renderStripeLayer(Sprite tile, int y, int guard, int x) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = x + this.width;
          TextCaretLayout.pushClip(this.height + y, y, 1, x + this.rightCapMask.field_x, -this.rightCapMask.field_x + var5_int);
          for (var6 = x - this.stripePhase; var6 < var5_int; var6 = var6 + tile.field_x) {
            tile.draw(var6, y);
          }
          if (guard != 256) {
            this.animated = true;
          }
          ClientException.popRasterState((byte) -51);
          if (x + this.rightCapMask.field_x >= SoftwareRasterizer.clipLeft) {
            LegacyVertexAttribute.pushSpriteRaster(guard + 6905, this.capScratch);
            tile.draw(-this.stripePhase, 0);
            tile.draw(this.stripeWidth * 2 - this.stripePhase, 0);
            this.leftCapMask.drawMultiply(0, 0);
            ClientException.popRasterState((byte) -105);
            this.capScratch.draw(x, y);
          }
          if (SoftwareRasterizer.clipRight >= -this.rightCapMask.field_x + var5_int) {
            LegacyVertexAttribute.pushSpriteRaster(7161, this.capScratch);
            for (var7 = this.stripePhase + this.width - this.rightCapMask.field_x; this.stripeWidth * 2 < var7; var7 = var7 - this.stripeWidth * 2) {
            }
            tile.draw(-var7, 0);
            tile.draw(2 * this.stripeWidth - var7, 0);
            this.rightCapMask.drawMultiply(0, 0);
            ClientException.popRasterState((byte) 106);
            this.capScratch.draw(var5_int - this.rightCapMask.field_x, y);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("pq.E(");
          if (tile == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(y).append(',').append(guard).append(',').append(x).append(')').toString());
        }
    }

    StripedProgressWidget(int x, int y, int width, int height, int stripeWidth, int firstColor, int secondColor) {
        this(x, y, width, height, stripeWidth, firstColor, secondColor, (firstColor & 16711422) >> 1, (16711422 & secondColor) >> 1);
    }

    final static int alignToEight(int guard, int value) {
        if (guard != 1) {
          return -1;
        }
        int var2 = 0;
        if ((value & 7) != 0) {
          var2 = -(7 & value) + 8;
        }
        int var3 = var2 + value;
        return var3;
    }

    final void setBounds(int guard, int newX, int newY, int newHeight, int newWidth) {
        super.setBounds(-57, newX, newY, newHeight, newWidth);
        this.rebuildSprites(880072001);
        int var6 = 85 % ((28 - guard) / 63);
    }

    private StripedProgressWidget(int x, int y, int width, int height, int stripeWidth, int firstColor, int secondColor, int dimFirstColor, int dimSecondColor) {
        this.dimFirstColor = dimFirstColor;
        this.dimSecondColor = dimSecondColor;
        this.secondColor = secondColor;
        this.firstColor = firstColor;
        this.stripeWidth = stripeWidth;
        this.setBounds(-79, x, y, height, width);
    }

    final void renderLayer(int parentX, int parentY, byte guard, int layer) {
        if (layer != 0) {
          return;
        }
        int var5 = parentX + this.x;
        if (guard >= -35) {
          this.stripeSprites = (Sprite[]) null;
        }
        int var6 = this.y + parentY;
        this.renderStripeLayer(this.stripeSprites[0], var6, 256, var5);
        if (this.progressQ16 < 65536) {
          TextCaretLayout.pushClip(var6 + this.height, var6, 1, var5 + (this.progressQ16 * this.width >> 16), this.width + var5);
          this.renderStripeLayer(this.stripeSprites[1], var6, 256, var5);
          ClientException.popRasterState((byte) -110);
        }
    }

    static {
        confirmEmailText = "Confirm Email:";
        field_y = new float[16];
    }
}
