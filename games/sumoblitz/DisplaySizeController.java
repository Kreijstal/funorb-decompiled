/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplaySizeController {
    boolean automatic;
    private int maxWidth;
    private int previousHeight;
    int fullscreenHeight;
    private int requiredHeapMiB;
    private int minWidth;
    private int minHeight;
    private int preferredHeight;
    private int defaultWidth;
    private float aspectRatio;
    private int updateCountdown;
    static int field_f;
    private int defaultHeight;
    private int maxHeight;
    private int previousWidth;
    private CanvasResizeListener resizeListener;
    private int preferredWidth;
    int fullscreenWidth;
    private int updateInterval;

    final void update(int guard) {
        int fieldTemp$1 = 0;
        if (null != CompactMeshGeometry.field_o) {
          return;
        }
        if (HardwareRidgedWaterNoise.field_x <= 0) {
          this.automatic = false;
        }
        if (this.automatic) {
          fieldTemp$1 = this.updateCountdown - 1;
          this.updateCountdown = this.updateCountdown - 1;
          if (fieldTemp$1 > 0) {
            return;
          }
          this.updateCountdown = this.updateInterval;
          if (LegacyOpenGlPbuffer.maxHeapMiB < this.requiredHeapMiB) {
            this.automatic = false;
          } else {
            if (guard != 2) {
              DisplaySizeController.takeDecodedOpaqueSprites(47);
            }
            this.applyPreferredSize(0);
          }
          return;
        }
        if (this.preferredWidth <= LegacyOpenGlRidgedWaterEffect.field_h) {
          if (this.preferredWidth > 0) {
            UnderageAccountInfoPanel.field_H = 0;
          }
        } else {
          UnderageAccountInfoPanel.field_H = (-LegacyOpenGlRidgedWaterEffect.field_h + this.preferredWidth) / 2;
        }
        if (LegacyOpenGlRidgedWaterEffect.field_h != this.defaultWidth ||
          IntroMeshResources.canvasHeight != this.defaultHeight) {
          this.resizeListener.resizeCanvas(guard ^ 8308, this.defaultWidth, this.defaultHeight);
        }
    }

    final static FullscreenDisplayMode[] listFullscreenModes(byte guard, PlatformTaskDispatcher dispatcher) {
        int var5 = 0;
        FullscreenDisplayMode[] stackIn_5_0 = null;
        FullscreenDisplayMode[] stackIn_12_0 = null;
        FullscreenDisplayMode[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        FullscreenDisplayMode[] var4 = null;
        FullscreenDisplayMode var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard >= -44) {
            DisplaySizeController.beginScreenTransition(42, -110, 34);
          }
          if (!dispatcher.supportsFullscreen((byte) 112)) {
            stackIn_5_0 = new FullscreenDisplayMode[]{};
            return stackIn_5_0;
          }
          var8 = dispatcher.listDisplayModes((byte) 21);
          while (var8.status == 0) {
            TextureCombineOperation.sleepMillis(10L, (byte) 80);
          }
          if (var8.status == 2) {
            stackIn_12_0 = new FullscreenDisplayMode[]{};
            return stackIn_12_0;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new FullscreenDisplayMode[var10.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new FullscreenDisplayMode();
            var4[var5] = var6;
            var6.width = var3[var5 << 2];
            var6.height = var3[1 + (var5 << 2)];
            var6.bitDepth = var3[(var5 << 2) + 2];
            var6.refreshRate = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("ul.G(").append(guard).append(',');
          if (dispatcher == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final boolean acceptsSize(int height, byte guard, int width) {
        boolean stackIn_11_0 = false;
        if (guard >= -29) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (width >= this.minWidth &&
          width <= this.maxWidth &&
          height >= this.minHeight &&
          this.maxHeight >= height && (0.0f == this.aspectRatio ||
          width == Math.round(this.aspectRatio * (float)height))) {
          stackIn_11_0 = true;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_11_0 = false;
        }
        return stackIn_11_0;
    }

    final boolean isAutoResizeMemoryLimited(int guard) {
        boolean stackIn_6_0 = false;
        if (guard != -1) {
          return false;
        }
        stackIn_6_0 = (HardwareRidgedWaterNoise.field_x > 0) && (LegacyOpenGlPbuffer.maxHeapMiB < this.requiredHeapMiB);
        return stackIn_6_0;
    }

    final FullscreenCanvas enterFullscreen(int guard) {
        this.previousHeight = IntroMeshResources.canvasHeight;
        this.previousWidth = LegacyOpenGlRidgedWaterEffect.field_h;
        this.resizeListener.resizeCanvas(8310, this.fullscreenWidth, this.fullscreenHeight);
        int var2 = -25 % ((50 - guard) / 48);
        DroneDebris.field_A = false;
        FullscreenCanvas var3 = IndexedSprite.createFullscreenCanvas(this.fullscreenWidth, 8089, 0, this.fullscreenHeight, FourIntUpdateRequest.platformDispatcher, 0);
        if (var3 == null) {
          this.restoreWindowedSize(2);
        }
        return var3;
    }

    final void restoreWindowedSize(int guard) {
        this.resizeListener.resizeCanvas(8310, this.previousWidth, this.previousHeight);
        if (guard != 2) {
          this.applyPreferredSize(115);
        }
    }

    final static void beginScreenTransition(int guard, int fromScreen, int toScreen) {
        if (guard != 4025) {
          DisplaySizeController.takeDecodedOpaqueSprites(102);
        }
        SecondaryNodeQueue.field_d = fromScreen;
        LegacyOpenGlUnlitEffect.field_e = 1;
        DroneEscalationSupport.field_b = toScreen;
    }

    final static Sprite[] takeDecodedOpaqueSprites(int guard) {
        int var2 = 0;
        int var3 = 0;
        byte[] var10 = null;
        int[] var11 = null;
        int[] var9 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        Sprite[] var1 = new Sprite[RasterStateFrame.field_n];
        if (guard != 255) {
          DisplaySizeController.takeDecodedOpaqueSprites(79);
        }
        for (var2 = 0; var2 < RasterStateFrame.field_n; var2++) {
          var3 = CheckboxRenderer.field_k[var2] * ScrollViewport.field_B[var2];
          var10 = TextLayout.field_d[var2];
          var11 = new int[var3];
          var9 = var11;
          var5 = var9;
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = LegacyOpenGlEffectManager.field_l[LegacyOpenGlPostProcessManager.bitwiseAnd(255, (int) var10[var6])];
          }
          var1[var2] = new Sprite(DisplayModeFailure.spriteSheetWidth, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[var2], StrongCacheReference.field_C[var2], CheckboxRenderer.field_k[var2], ScrollViewport.field_B[var2], var11);
        }
        PowerupPickup.releaseSpriteDecoderArrays((byte) -79);
        return var1;
    }

    final void setPreferredSize(int height, int width, byte guard) {
        this.preferredWidth = width;
        if (guard > -31) {
          return;
        }
        this.preferredHeight = height;
    }

    final boolean canAutoResize(int guard) {
        boolean stackIn_6_0 = false;
        if (guard != -1) {
          this.aspectRatio = 2.1707825660705566f;
        }
        stackIn_6_0 = (LegacyOpenGlPbuffer.maxHeapMiB >= this.requiredHeapMiB) && (0 < HardwareRidgedWaterNoise.field_x);
        return stackIn_6_0;
    }

    final void setFullscreenSize(int height, int width, int guard) {
        int var4 = 32 / ((guard + 57) / 44);
        this.fullscreenWidth = width;
        this.fullscreenHeight = height;
    }

    private final void applyPreferredSize(int guard) {
        int var2;
        int var3;
        int var5;
        int var4;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = this.preferredWidth;
        var3 = this.preferredHeight;
        if (!this.canAutoResize(guard - 1)) {
          this.automatic = false;
        } else {
          if (this.maxHeight >= var3) {
            if (this.minHeight > var3) {
              var3 = this.minHeight;
            }
          } else {
            var3 = this.maxHeight;
          }
          if (this.maxWidth < var2) {
            var2 = this.maxWidth;
          } else {
            if (this.minWidth > var2) {
              var2 = this.minWidth;
            }
          }
          if (this.aspectRatio > (float)guard) {
            var4 = (int)(0.5f + this.aspectRatio * (float)var3);
            if (var2 < var4) {
              var3 = (int)((float)var2 / this.aspectRatio);
            } else {
              if (var4 < var2) {
                var2 = var4;
              }
            }
          }
          if (var2 != LegacyOpenGlRidgedWaterEffect.field_h) {
            this.resizeListener.resizeCanvas(8310, var2, var3);
          } else {
            if (IntroMeshResources.canvasHeight != var3) {
              this.resizeListener.resizeCanvas(8310, var2, var3);
            }
          }
          if (this.preferredWidth > 0) {
            UnderageAccountInfoPanel.field_H = (-LegacyOpenGlRidgedWaterEffect.field_h + this.preferredWidth) / 2;
          }
        }
    }

    private DisplaySizeController() throws Throwable {
        throw new Error();
    }

    static {
        field_f = 0;
    }
}
