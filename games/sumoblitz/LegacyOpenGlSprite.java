/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlSprite extends ToolkitSprite {
    private int auxiliaryChannel;
    private int insetBottom;
    private int insetRight;
    private LegacyOpenGlSpriteTexture auxiliaryTexture;
    private LegacyOpenGlGraphicsToolkit toolkit;
    LegacyOpenGlSpriteTexture texture;
    private boolean hasInsets;
    private int insetTop;
    private int insetLeft;
    static String levelCompleteText;

    public static void releaseStatics(int param0) {
        levelCompleteText = null;
        if (param0 != 0) {
          LegacyOpenGlSprite.releaseStatics(-59);
        }
    }

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        this.texture.setLinearFiltering(false, 0);
        this.toolkit.q(-97);
        this.toolkit.c(25189, blendMode);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        x = x + this.insetLeft;
        y = y + this.insetTop;
        if (this.auxiliaryTexture != null) {
          this.configureAuxiliaryTexture(6344, colorMode);
          this.auxiliaryTexture.setLinearFiltering(false, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.maxV);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
          jaggl.OpenGL.glVertex2i(x, y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(x, y + this.texture.spriteHeight);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
          jaggl.OpenGL.glVertex2i(x + this.texture.spriteWidth, this.texture.spriteHeight + y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, this.texture.maxV);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
          jaggl.OpenGL.glVertex2i(this.texture.spriteWidth + x, y);
          jaggl.OpenGL.glEnd();
          this.resetAuxiliaryTextureState(0);
          return;
        }
        this.toolkit.bindTexture(98, this.texture);
        this.toolkit.setTextureCombineMode(colorMode, true);
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
        jaggl.OpenGL.glVertex2i(x, y);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2i(x, this.texture.spriteHeight + y);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
        jaggl.OpenGL.glVertex2i(this.texture.spriteWidth + x, y + this.texture.spriteHeight);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
        jaggl.OpenGL.glVertex2i(this.texture.spriteWidth + x, y);
        jaggl.OpenGL.glEnd();
    }

    final int paddedWidth() {
        return this.insetLeft + (this.texture.spriteWidth + this.insetRight);
    }

    final int paddedHeight() {
        return this.texture.spriteHeight - (-this.insetTop - this.insetBottom);
    }

    final void copyFromFramebuffer(int destinationX, int height, int sourceX, int sourceY, int destinationY, int width, int guard) {
        int var9 = 0;
        int var10;
        int[] var11;
        int[] var12;
        int[] var14;
        int[] var17;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (!this.toolkit.field_W) {
          this.texture.copyFromFramebuffer((byte) 125, sourceY, destinationX, destinationY, height, sourceX, width);
        } else {
          var14 = this.toolkit.b(sourceY, width, 1, sourceX, height);
          var12 = var14;
          var11 = var12;
          var17 = var11;
          if (var11 != null) {
            for (var9 = 0; var14.length > var9; var9++) {
              var11[var9] = LegacyOpenGlInterleavedStream.bitwiseOr(var14[var9], -16777216);
            }
            this.uploadPixels(height, destinationX, (byte) -76, width, var17, destinationY, 0, width);
          }
        }
        if (guard == -3773) {
          return;
        }
        this.copyFromFramebuffer(3, -68, -66, -16, -63, 102, -72);
    }

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        int var15 = Sumoblitz.field_L ? 1 : 0;
        this.texture.setLinearFiltering((flags & 1) != 0 ? true : false, 0);
        this.toolkit.q(-122);
        this.toolkit.c(25189, blendMode);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        if (!this.hasInsets) {
          if (this.auxiliaryTexture == null) {
            this.toolkit.bindTexture(127, this.texture);
            this.toolkit.setTextureCombineMode(colorMode, true);
            jaggl.OpenGL.glBegin(7);
            jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
            jaggl.OpenGL.glVertex2i(x, y);
            jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
            jaggl.OpenGL.glVertex2i(x, height + y);
            jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
            jaggl.OpenGL.glVertex2i(x + width, height + y);
            jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
            jaggl.OpenGL.glVertex2i(width + x, y);
            jaggl.OpenGL.glEnd();
            return;
          }
          this.configureAuxiliaryTexture(6344, colorMode);
          this.auxiliaryTexture.setLinearFiltering(true, 0);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.maxV);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
          jaggl.OpenGL.glVertex2i(x, y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2i(x, height + y);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, 0.0f);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
          jaggl.OpenGL.glVertex2i(width + x, y + height);
          jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, this.texture.maxV);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
          jaggl.OpenGL.glVertex2i(x + width, y);
          jaggl.OpenGL.glEnd();
          this.resetAuxiliaryTextureState(0);
          return;
        }
        float var9 = (float)width / (float)this.paddedWidth();
        float var10 = (float)height / (float)this.paddedHeight();
        float var11 = (float)x + var9 * (float)this.insetLeft;
        float var12 = (float)y + var10 * (float)this.insetTop;
        float var13 = var11 + (float)this.texture.spriteWidth * var9;
        float var14 = (float)this.texture.spriteHeight * var10 + var12;
        if (null == this.auxiliaryTexture) {
          this.toolkit.bindTexture(39, this.texture);
          this.toolkit.setTextureCombineMode(colorMode, true);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
          jaggl.OpenGL.glVertex2f(var11, var12);
          jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
          jaggl.OpenGL.glVertex2f(var11, var14);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
          jaggl.OpenGL.glVertex2f(var13, var14);
          jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
          jaggl.OpenGL.glVertex2f(var13, var12);
          jaggl.OpenGL.glEnd();
          return;
        }
        this.configureAuxiliaryTexture(6344, colorMode);
        this.auxiliaryTexture.setLinearFiltering(true, 0);
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, this.texture.maxV);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
        jaggl.OpenGL.glVertex2f(var11, var12);
        jaggl.OpenGL.glMultiTexCoord2f(33985, 0.0f, 0.0f);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(var11, var14);
        jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, 0.0f);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
        jaggl.OpenGL.glVertex2f(var13, var14);
        jaggl.OpenGL.glMultiTexCoord2f(33985, this.texture.maxU, this.texture.maxV);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
        jaggl.OpenGL.glVertex2f(var13, var12);
        jaggl.OpenGL.glEnd();
        this.resetAuxiliaryTextureState(0);
    }

    final int width() {
        return this.texture.spriteWidth;
    }

    final int height() {
        return this.texture.spriteHeight;
    }

    final void setInsets(int left, int top, int right, int bottom) {
        this.insetBottom = bottom;
        this.insetLeft = left;
        this.insetTop = top;
        this.insetRight = right;
        if (this.insetLeft != 0) {
          this.hasInsets = true;
        } else {
          if (0 != this.insetTop) {
            this.hasInsets = true;
          } else {
            if (this.insetRight != 0) {
              this.hasInsets = true;
            } else {
              if (this.insetBottom != 0) {
                this.hasInsets = true;
              } else {
                this.hasInsets = false;
              }
            }
          }
        }
    }

    private final void resetAuxiliaryTextureState(int primaryUnit) {
        this.toolkit.setActiveTextureUnit(1, 119);
        this.toolkit.bindTexture(24, (LegacyOpenGlTexture) null);
        this.toolkit.setTextureCombineOperations(primaryUnit ^ 20685, 8448, 8448);
        this.toolkit.b(34168, 768, 1, -128);
        this.toolkit.a(112, 0, 5890, 770);
        this.toolkit.setActiveTextureUnit(primaryUnit, 112);
        this.toolkit.b(34168, 768, 1, 92);
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        float var22 = 0.0f;
        float var23 = 0.0f;
        float var24 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var11Lifetime1;
        float var12Lifetime1;
        if (this.hasInsets) {
          var11 = (float)this.paddedWidth();
          var12 = (float)this.paddedHeight();
          var13 = (x1 - x0) / var11;
          var14 = (y1 - y0) / var11;
          var15 = (x2 - x0) / var12;
          var16 = (y2 - y0) / var12;
          var17 = var15 * (float)this.insetTop;
          var18 = (float)this.insetTop * var16;
          var19 = var13 * (float)this.insetLeft;
          var20 = var14 * (float)this.insetLeft;
          var21 = (float)this.insetRight * -var13;
          var22 = (float)this.insetRight * -var14;
          var23 = -var15 * (float)this.insetBottom;
          var24 = -var16 * (float)this.insetBottom;
          y0 = var18 + (y0 + var20);
          x0 = x0 + var19 + var17;
          x2 = x2 + var19 + var23;
          y1 = y1 + var22 + var18;
          x1 = var17 + (x1 + var21);
          y2 = var24 + (y2 + var20);
        }
        var11Lifetime1 = x2 + (x1 - x0);
        var12Lifetime1 = y1 + (-y0 + y2);
        this.texture.setLinearFiltering((flags & 1) != 0 ? true : false, 0);
        this.toolkit.q(-70);
        this.toolkit.bindTexture(110, this.texture);
        this.toolkit.c(25189, blendMode);
        this.toolkit.setTextureCombineMode(colorMode, true);
        jaggl.OpenGL.glColor4ub((byte)(color >> 16), (byte)(color >> 8), (byte)color, (byte)(color >> 24));
        jaggl.OpenGL.glBegin(7);
        jaggl.OpenGL.glTexCoord2f(0.0f, this.texture.maxV);
        jaggl.OpenGL.glVertex2f(x0, y0);
        jaggl.OpenGL.glTexCoord2f(0.0f, 0.0f);
        jaggl.OpenGL.glVertex2f(x2, y2);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, 0.0f);
        jaggl.OpenGL.glVertex2f(var11Lifetime1, var12Lifetime1);
        jaggl.OpenGL.glTexCoord2f(this.texture.maxU, this.texture.maxV);
        jaggl.OpenGL.glVertex2f(x1, y1);
        jaggl.OpenGL.glEnd();
    }

    LegacyOpenGlSprite(LegacyOpenGlGraphicsToolkit renderer, int width, int height, int[] pixels, int offset, int stride) {
        this.hasInsets = false;
        this.insetBottom = 0;
        this.insetRight = 0;
        this.auxiliaryChannel = 0;
        this.insetTop = 0;
        this.insetLeft = 0;
        try {
          this.toolkit = renderer;
          this.texture = AccountCreationForm.a(height, offset, stride, false, renderer, (byte) -119, width, pixels);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cm.<init>(" + (renderer != null ? "{...}" : "null") + ',' + width + ',' + height + ',' + (pixels != null ? "{...}" : "null") + ',' + offset + ',' + stride + ')');
        }
    }

    private final void configureAuxiliaryTexture(int guard, int colorMode) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        this.toolkit.setActiveTextureUnit(1, 115);
        this.toolkit.bindTexture(74, this.texture);
        this.toolkit.setTextureCombineOperations(guard ^ 18437, 7681, this.toolkit.b(colorMode, (byte) -14));
        this.toolkit.b(34167, 768, 1, -120);
        this.toolkit.a(113, 0, 34168, 770);
        this.toolkit.setActiveTextureUnit(0, 100);
        if (guard != 6344) {
          this.draw(114, -109, -63, -80, 49);
          this.toolkit.bindTexture(guard ^ 6275, this.auxiliaryTexture);
          this.toolkit.setTextureCombineOperations(20685, 7681, 34479);
          this.toolkit.b(34166, 768, 1, guard - 6465);
          if (this.auxiliaryChannel == 0) {
            this.toolkit.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
            return;
          }
          if (this.auxiliaryChannel == 1) {
            this.toolkit.a(guard + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
            return;
          }
          if (this.auxiliaryChannel == 2) {
            this.toolkit.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
            return;
          }
          if (this.auxiliaryChannel == 3) {
            this.toolkit.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
            return;
          }
          return;
        }
        this.toolkit.bindTexture(guard ^ 6275, this.auxiliaryTexture);
        this.toolkit.setTextureCombineOperations(20685, 7681, 34479);
        this.toolkit.b(34166, 768, 1, guard - 6465);
        if (this.auxiliaryChannel == 0) {
          this.toolkit.a(31322, 0.5f, 0.5f, 1.0f, 0.0f);
          return;
        }
        if (this.auxiliaryChannel == 1) {
          this.toolkit.a(guard + 24978, 1.0f, 0.5f, 0.5f, 0.0f);
          return;
        }
        if (this.auxiliaryChannel == 2) {
          this.toolkit.a(31322, 0.5f, 1.0f, 0.5f, 0.0f);
          return;
        }
        if (this.auxiliaryChannel == 3) {
          this.toolkit.a(31322, 128.5f, 128.5f, 128.5f, 0.0f);
          return;
        }
    }

    private final void uploadPixels(int height, int destinationX, byte guard, int width, int[] pixels, int destinationY, int sourceOffset, int sourceRowLength) {
        try {
          if (guard >= -67) {
            this.configureAuxiliaryTexture(-99, 125);
          }
          this.texture.uploadInts(height, width, destinationY, pixels, sourceOffset, destinationX, sourceRowLength, true, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "cm.I(" + height + ',' + destinationX + ',' + guard + ',' + width + ',' + (pixels != null ? "{...}" : "null") + ',' + destinationY + ',' + sourceOffset + ',' + sourceRowLength + ')');
        }
    }

    static {
        levelCompleteText = "LEVEL COMPLETE!";
    }
}
