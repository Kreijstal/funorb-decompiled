/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlGraphicsHeap extends GraphicsHeap {
    static int field_o;
    jaclib.memory.heap.NativeHeap heap;
    static ValidationStatus EMPTY;
    static int[] field_q;
    static AccountRequestState PENDING;

    final static void clearIntroFaceGroups(byte guard) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5 = LoginForm.field_G;
          var1 = var5;
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          if (guard == 71) {
            return;
          }
          field_q = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1_ref), "ad.B(" + guard + ')');
        }
    }

    final static void initializeDefaultMenus(int backScreenId) {
        IntroLogoRenderer.menuActions[4] = new int[]{5};
        LegacyOpenGlEffectManager.field_g[4] = new MenuScreen(4);
        DirectByteArrayStorage.defineMenuScreen(400, 38, 10, 2, new int[]{8, 9, 10, 21, 20, 5}, 2, 468);
        LegacyOpenGlEffectManager.field_g[2] = new MenuScreen(2);
        if (0 >= HardwareRidgedWaterNoise.field_x) {
          if (!(2 > Bzip2State.field_j)) {
            DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
          }
          if (MusicPatchEnvelope.areFirstLevelsComplete(8230, 25)) {
            DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
          }
          AffineTransform3D.field_j = backScreenId;
          return;
        }
        if (IntroductionOverlaySupport.supportsFullscreen((byte) -29, FourIntUpdateRequest.platformDispatcher)) {
          DirectByteArrayStorage.defineMenuScreen(150, 38, 170, 2, new int[]{1, 28, 12, 13, 4, 3, 7}, 1, 470);
          LegacyOpenGlEffectManager.field_g[1] = new MenuScreen(1);
          DirectByteArrayStorage.defineMenuScreen(150, 38, 170, 2, new int[]{12, 13, 27, 4, 5}, 8, 470);
          LegacyOpenGlEffectManager.field_g[8] = new MenuScreen(8);
          if (!(2 > Bzip2State.field_j)) {
            DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
          }
          if (MusicPatchEnvelope.areFirstLevelsComplete(8230, 25)) {
            DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
            LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
          }
          AffineTransform3D.field_j = backScreenId;
          return;
        }
        if (!(2 > Bzip2State.field_j)) {
          DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
          LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
        }
        if (MusicPatchEnvelope.areFirstLevelsComplete(8230, 25)) {
          DirectByteArrayStorage.defineMenuScreen(115, 38, 148, 2, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
          LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
        }
        AffineTransform3D.field_j = backScreenId;
    }

    final static byte[] copyByteRange(byte[] bytes, int length, int offset, byte guard) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new byte[length];
          var4 = var5;
          if (guard <= 48) {
            EMPTY = (ValidationStatus) null;
          }
          ArrayUtils.copy(bytes, offset, var5, 0, length);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ad.D(");
          if (bytes == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(length).append(',').append(offset).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == -20388) {
          field_q = null;
          PENDING = null;
          EMPTY = null;
          return;
        }
        field_q = (int[]) null;
        field_q = null;
        PENDING = null;
        EMPTY = null;
    }

    final static RasterIndexedSprite takeDecodedIndexedSprite(int guard) {
        RasterIndexedSprite var1 = null;
        if (guard == 12768) {
          var1 = new RasterIndexedSprite(DisplayModeFailure.spriteSheetWidth, ToolkitImageProducerBuffer.field_u, MenuSelectionController.field_h[0], StrongCacheReference.field_C[0], CheckboxRenderer.field_k[0], ScrollViewport.field_B[0], TextLayout.field_d[0], LegacyOpenGlEffectManager.field_l);
          PowerupPickup.releaseSpriteDecoderArrays((byte) -20);
          return var1;
        }
        return (RasterIndexedSprite) null;
    }

    final static void renderStartupCanvas(byte guard, java.awt.Canvas canvas, boolean unused) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 55 / ((25 - guard) / 42);
          if (TextureCoordinateGeneration.clientPreparationPhase < 10) {
            var4 = 0;
            if (CubeMapSource.field_a) {
              CubeMapSource.field_a = false;
              var4 = 1;
            }
            ProxyAuthenticationRequiredException.drawLoadingProgress(true, OpenGlTexture.clientPreparationPercent(14296), IntIndexHashTable.field_a, var4 != 0, LoadingStatusText.preparationMessage(102));
            return;
          }
          if (!LegacyOpenGlRenderBufferSet.isIntroFinished(-251)) {
            SoftwareRasterizer.clear();
            IntroLogoRenderer.drawIntroLogo(240, 320, 256);
            IterableNodeHashTable.presentDialogRaster(0, 0, canvas, (byte) 125);
            return;
          }
          if (0 != LoginDialogNavigation.field_a) {
            SoftwareRenderBuffer.presentAccountDialogs(-97, canvas);
            return;
          }
          LoginDialogNavigation.drawAccountDialogs(false, (byte) -71, unused);
          IterableNodeHashTable.presentDialogRaster(0, 0, canvas, (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ad.C(").append(guard).append(',');
          if (canvas == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(unused).append(')').toString());
        }
    }

    LegacyOpenGlGraphicsHeap(int capacity) {
        this.heap = new jaclib.memory.heap.NativeHeap(capacity);
    }

    final void close(int guard) {
        if (guard != -4009) {
          return;
        }
        this.heap.close();
    }

    static {
        field_o = 50;
        field_q = new int[8192];
        EMPTY = new ValidationStatus();
        PENDING = new AccountRequestState();
    }
}
