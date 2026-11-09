/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareTextureSprite extends ToolkitSprite {
    private Texture2D texture;
    private int height;
    private int insetTop;
    private boolean textureHeightDiffers;
    private int insetBottom;
    private boolean hasInsets;
    static DialogLayer field_e;
    static boolean field_m;
    private int width;
    private int insetLeft;
    private HardwareGraphicsToolkit toolkit;
    private boolean textureWidthDiffers;
    private int insetRight;
    static String blastReadyText;

    final int paddedHeight() {
        return this.insetBottom + this.height + this.insetTop;
    }

    final void drawScaled(int x, int y, int width, int height, int colorMode, int color, int blendMode, int flags) {
        AffineTransform3D var10;
        AffineTransform3D var11;
        Texture2D stackIn_4_0 = null;
        var11 = this.toolkit.modelTransform(84);
        var10 = this.toolkit.textureTransform(0);
        stackIn_4_0 = this.texture;
        if (this.textureWidthDiffers) {
          ((Texture2D) (Object) stackIn_4_0).setFilter(ServerDataReadRequest.NEAREST, 15149);
        } else {
          if (this.textureHeightDiffers) {
            ((Texture2D) (Object) stackIn_4_0).setFilter(ServerDataReadRequest.NEAREST, 15149);
          } else {
            if ((flags & 1) == 0) {
              ((Texture2D) (Object) stackIn_4_0).setFilter(ServerDataReadRequest.NEAREST, 15149);
            } else {
              ((Texture2D) (Object) stackIn_4_0).setFilter(ArrayWidgetContainer.LINEAR, 15149);
            }
          }
        }
        this.toolkit.w(10);
        this.toolkit.a(this.texture, 95);
        this.toolkit.setBlendMode(blendMode, 13);
        this.toolkit.h(59, colorMode);
        this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 1, 0);
        this.toolkit.setAlphaCombineSource(AccountRequestState.CONSTANT, 1, true);
        this.toolkit.setTextureConstantColor(false, color);
        var10.setScale(this.texture.textureV((float)this.height, -19230), this.texture.textureU((float)this.width, -74), 0, 1.0f);
        if (this.hasInsets) {
          width = this.width * width / this.paddedWidth();
          height = this.height * height / this.paddedHeight();
          y = y + this.insetTop * height / this.height;
          x = x + this.insetLeft * width / this.width;
        }
        var11.setScale((float)height, (float)width, 0, 0.0f);
        var11.translate(y, x, (byte) 103, 0);
        this.toolkit.setTextureTransformMode(IntList.TEXTURE_COUNT2, 28880);
        this.toolkit.modelTransformChanged(0);
        this.toolkit.drawTriangleFan(2);
        this.toolkit.resetTextureTransform(0);
        this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 1, 0);
        this.toolkit.setAlphaCombineSource(FontMetrics.PREVIOUS, 1, true);
    }

    final int width() {
        return this.width;
    }

    final void drawAffine(float x0, float y0, float x1, float y1, float x2, float y2, int colorMode, int color, int blendMode, int flags) {
        AffineTransform3D var12;
        float var13;
        float var14;
        float var15;
        float var16;
        float var17;
        float var18;
        float var19;
        float var20;
        float var21;
        float var22;
        float var23;
        float var24;
        float var25;
        float var26;
        AffineTransform3D var27;
        Texture2D stackIn_4_0 = null;
        TextureFilter stackIn_5_1 = null;
        var27 = this.toolkit.modelTransform(82);
        var12 = this.toolkit.textureTransform(0);
        stackIn_4_0 = this.texture;
        if (!this.textureWidthDiffers &&
          !this.textureHeightDiffers &&
          (1 & flags) != 0) {
          stackIn_5_1 = ArrayWidgetContainer.LINEAR;
        } else {
          stackIn_5_1 = ServerDataReadRequest.NEAREST;
        }
        ((Texture2D) (Object) stackIn_4_0).setFilter(stackIn_5_1, 15149);
        this.toolkit.w(10);
        this.toolkit.a(this.texture, 109);
        this.toolkit.setBlendMode(blendMode, 13);
        this.toolkit.h(104, colorMode);
        this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 1, 0);
        this.toolkit.setAlphaCombineSource(AccountRequestState.CONSTANT, 1, true);
        this.toolkit.setTextureConstantColor(false, color);
        if (this.hasInsets) {
          var13 = (float)this.paddedWidth();
          var14 = (float)this.paddedHeight();
          var15 = (-x0 + x1) / var13;
          var16 = (y1 - y0) / var13;
          var17 = (x2 - x0) / var14;
          var18 = (y2 - y0) / var14;
          var19 = var17 * (float)this.insetTop;
          var20 = (float)this.insetTop * var18;
          var21 = var15 * (float)this.insetLeft;
          var22 = var16 * (float)this.insetLeft;
          var23 = (float)this.insetRight * -var15;
          var24 = (float)this.insetRight * -var16;
          var25 = -var17 * (float)this.insetBottom;
          x2 = var25 + (var21 + x2);
          y0 = var20 + (var22 + y0);
          y1 = y1 + var24 + var20;
          x1 = var19 + (x1 + var23);
          x0 = var19 + (x0 + var21);
          var26 = -var18 * (float)this.insetBottom;
          y2 = y2 + var22 + var26;
        }
        var27.setLinear(x2 - x0, -y0 + y2, -y0 + y1, -x0 + x1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 18356);
        var27.translate((byte) 96, 0.0f, y0, x0);
        var12.setScale(this.texture.textureV((float)this.height, -19230), this.texture.textureU((float)this.width, -65), 0, 1.0f);
        this.toolkit.setTextureTransformMode(IntList.TEXTURE_COUNT2, 28880);
        this.toolkit.modelTransformChanged(0);
        this.toolkit.drawTriangleFan(2);
        this.toolkit.resetTextureTransform(0);
        this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 1, 0);
        this.toolkit.setAlphaCombineSource(FontMetrics.PREVIOUS, 1, true);
    }

    final void setInsets(int left, int top, int right, int bottom) {
        this.insetTop = top;
        this.insetRight = right;
        this.insetBottom = bottom;
        this.insetLeft = left;
        if (this.insetLeft != 0) {
          this.hasInsets = true;
        } else {
          if (this.insetTop != 0) {
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

    final static void snapshotUpgradeAllocation(byte guard) {
        if (guard <= -25) {
          PasswordInputRenderer.upgradeAllocation[1] = LegacyOpenGlEffectManager.selectedTractionLevel;
          PasswordInputRenderer.upgradeAllocation[0] = ResourceArchive.selectedSpeedLevel;
          PasswordInputRenderer.upgradeAllocation[2] = AccountStatusDialogState.selectedBounceLevel;
          IsaacCipher.field_k = -1 + (-1 + PasswordInputRenderer.upgradeAllocation[1] - 1 + PasswordInputRenderer.upgradeAllocation[0]) + PasswordInputRenderer.upgradeAllocation[2];
          return;
        }
        blastReadyText = (String) null;
        PasswordInputRenderer.upgradeAllocation[1] = LegacyOpenGlEffectManager.selectedTractionLevel;
        PasswordInputRenderer.upgradeAllocation[0] = ResourceArchive.selectedSpeedLevel;
        PasswordInputRenderer.upgradeAllocation[2] = AccountStatusDialogState.selectedBounceLevel;
        IsaacCipher.field_k = -1 + (-1 + PasswordInputRenderer.upgradeAllocation[1] - 1 + PasswordInputRenderer.upgradeAllocation[0]) + PasswordInputRenderer.upgradeAllocation[2];
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        blastReadyText = null;
        if (param0 != 1) {
          HardwareTextureSprite.releaseStatics(123);
        }
    }

    final int height() {
        return this.height;
    }

    HardwareTextureSprite(HardwareGraphicsToolkit toolkit, int width, int height, int[] pixels, int offset, int stride) {
        RuntimeException var7 = null;
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.insetTop = 0;
        this.hasInsets = false;
        this.insetBottom = 0;
        this.insetRight = 0;
        this.insetLeft = 0;
        try {
          this.toolkit = toolkit;
          this.width = width;
          this.height = height;
          this.texture = toolkit.a(false, stride, pixels, width, -45, offset, height);
          this.texture.setWrap(true, true, true);
          stackIn_4_1 = (width != this.texture.width(-16625));
          this.textureWidthDiffers = stackIn_4_1;
          stackIn_7_1 = (height != this.texture.height((byte) -97));
          this.textureHeightDiffers = stackIn_7_1;
          if (!this.textureWidthDiffers) {
            this.texture.usesNormalizedCoordinates(-24722);
          }
          if (this.textureHeightDiffers) {
            return;
          }
          this.texture.usesNormalizedCoordinates(-24722);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("pu.<init>(");
          if (toolkit == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(width).append(',').append(height).append(',');
          if (pixels == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(offset).append(',').append(stride).append(')').toString());
        }
    }

    final void draw(int x, int y, int colorMode, int color, int blendMode) {
        AffineTransform3D var8 = this.toolkit.modelTransform(73);
        AffineTransform3D var7 = this.toolkit.textureTransform(0);
        x = x + this.insetLeft;
        y = y + this.insetTop;
        this.texture.setFilter(ServerDataReadRequest.NEAREST, 15149);
        this.toolkit.w(10);
        this.toolkit.a(this.texture, 93);
        this.toolkit.setBlendMode(blendMode, 13);
        this.toolkit.h(92, colorMode);
        this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 1, 0);
        this.toolkit.setAlphaCombineSource(AccountRequestState.CONSTANT, 1, true);
        this.toolkit.setTextureConstantColor(false, color);
        var8.setScale((float)this.height, (float)this.width, 0, 0.0f);
        var8.translate(y, x, (byte) 120, 0);
        var7.setScale(this.texture.textureV((float)this.height, -19230), this.texture.textureU((float)this.width, -79), 0, 1.0f);
        this.toolkit.setTextureTransformMode(IntList.TEXTURE_COUNT2, 28880);
        this.toolkit.modelTransformChanged(0);
        this.toolkit.drawTriangleFan(2);
        this.toolkit.resetTextureTransform(0);
        this.toolkit.setColorCombineSource(FontMetrics.PREVIOUS, 1, 0);
        this.toolkit.setAlphaCombineSource(FontMetrics.PREVIOUS, 1, true);
    }

    final int paddedWidth() {
        return this.insetLeft + (this.width + this.insetRight);
    }

    static {
        blastReadyText = "BLAST READY";
    }
}
