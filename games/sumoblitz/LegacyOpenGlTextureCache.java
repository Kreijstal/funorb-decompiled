/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTextureCache {
    static SpriteData[] field_e;
    private TextureProvider provider;
    static ToolkitSprite field_f;
    private LegacyOpenGlGraphicsToolkit toolkit;
    static boolean[] field_b;
    private SoftLruCache textures;

    final void age(int guard) {
        this.textures.age(5, 22663);
        int var2 = 36 / ((guard - 41) / 59);
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 != -24) {
          return;
        }
        field_f = null;
        field_b = null;
    }

    final static RasterIndexedSprite[] loadIndexedSprites(int fileId, int guard, int groupId, ResourceArchive archive) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RasterIndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteSheetSupport.decodeSpriteSheet(archive, groupId, fileId, -23046)) {
            stackIn_2_0 = null;
            return (RasterIndexedSprite[]) (stackIn_2_0);
          }
          if (guard != -1) {
            LegacyOpenGlTextureCache.closeAccountSocket((byte) 98);
          }
          stackIn_6_0 = DropDownLabelRenderer.takeDecodedIndexedSprites(true);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("kk.D(").append(fileId).append(',').append(guard).append(',').append(groupId).append(',');
          if (archive == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void closeAccountSocket(byte guard) {
        ResourceArchive var2 = null;
        ResourceArchive var2Lifetime1;
        if (DisplayModeConfirmationDialog.accountSocket != null) {
          DisplayModeConfirmationDialog.accountSocket.close((byte) -102);
          DisplayModeConfirmationDialog.accountSocket = null;
          if (guard > -108) {
            var2 = (ResourceArchive) null;
            LegacyOpenGlTextureCache.loadIndexedSprites(-15, -46, 72, (ResourceArchive) null);
            return;
          }
          return;
        }
        if (guard <= -108) {
          return;
        }
        var2Lifetime1 = (ResourceArchive) null;
        LegacyOpenGlTextureCache.loadIndexedSprites(-15, -46, 72, (ResourceArchive) null);
    }

    final LegacyOpenGlTexture2D texture(int guard, int textureId) {
        Object var3;
        TextureMetadata var5;
        int var6;
        int[] var7;
        int var8;
        LegacyOpenGlTexture2D var18;
        int[] var23;
        int stackIn_7_0 = 0;
        LegacyOpenGlTexture2D stackIn_12_0;
        LegacyOpenGlTexture2D stackIn_12_1;
        LegacyOpenGlGraphicsToolkit stackIn_12_2;
        int stackIn_12_3;
        int stackIn_12_4;
        int stackIn_12_5;
        int stackIn_12_6;
        LegacyOpenGlTexture2D stackIn_13_0 = null;
        LegacyOpenGlTexture2D stackIn_13_1 = null;
        boolean stackIn_13_7 = false;
        LegacyOpenGlTexture2D stackIn_21_0;
        LegacyOpenGlTexture2D stackIn_21_1;
        LegacyOpenGlGraphicsToolkit stackIn_21_2;
        int stackIn_21_3;
        int stackIn_21_4;
        int stackIn_21_5;
        int stackIn_21_6;
        LegacyOpenGlTexture2D stackIn_22_0 = null;
        LegacyOpenGlTexture2D stackIn_22_1 = null;
        boolean stackIn_22_7 = false;
        LegacyOpenGlTexture2D stackIn_31_0;
        LegacyOpenGlTexture2D stackIn_31_1;
        LegacyOpenGlGraphicsToolkit stackIn_31_2;
        int stackIn_31_3;
        int stackIn_31_4;
        int stackIn_31_5;
        int stackIn_31_6;
        LegacyOpenGlTexture2D stackIn_32_0 = null;
        LegacyOpenGlTexture2D stackIn_32_1 = null;
        boolean stackIn_32_7 = false;
        LegacyOpenGlTexture2D stackIn_40_0;
        LegacyOpenGlTexture2D stackIn_40_1;
        LegacyOpenGlGraphicsToolkit stackIn_40_2;
        int stackIn_40_3;
        int stackIn_40_4;
        int stackIn_40_5;
        int stackIn_40_6;
        LegacyOpenGlTexture2D stackIn_41_0 = null;
        LegacyOpenGlTexture2D stackIn_41_1 = null;
        boolean stackIn_41_7 = false;
        LegacyOpenGlTexture2D stackIn_47_0;
        LegacyOpenGlTexture2D stackIn_47_1;
        LegacyOpenGlGraphicsToolkit stackIn_47_2;
        int stackIn_47_3;
        int stackIn_47_4;
        int stackIn_47_5;
        int stackIn_47_6;
        LegacyOpenGlTexture2D stackIn_48_0 = null;
        LegacyOpenGlTexture2D stackIn_48_1 = null;
        boolean stackIn_48_7 = false;
        LegacyOpenGlTexture2D var4;
        float[] var7_array;
        float[] var9;
        float[] var10;
        float[] var11;
        LegacyOpenGlTexture2D var19;
        LegacyOpenGlTexture2D var21;
        LegacyOpenGlTexture2D var22;
        int[] var24;
        int[] var7Lifetime1;
        var8 = Sumoblitz.field_L ? 1 : 0;
        var3 = this.textures.get((long)textureId, 120);
        if (var3 != null) {
          return (LegacyOpenGlTexture2D) (var3);
        }
        if (!this.provider.b(-29912, textureId)) {
          return null;
        }
        var5 = this.provider.a(-29193, textureId);
        if (!var5.field_n) {
          stackIn_7_0 = this.toolkit.field_X;
        } else {
          stackIn_7_0 = 64;
        }
        var6 = stackIn_7_0;
        if (!var5.field_s) {
          if (2 == var5.field_p) {
            var7 = this.provider.a(guard - 25069, var6, var6, false, 0.699999988079071f, textureId);
          } else {
            if (!PlayingSound.a(-83, (int) var5.field_d)) {
              var23 = this.provider.a(guard - 25069, var6, var6, false, 0.699999988079071f, textureId);
              stackIn_12_0 = null;
              stackIn_12_1 = null;
              stackIn_12_2 = this.toolkit;
              stackIn_12_3 = 3553;
              stackIn_12_4 = 6408;
              stackIn_12_5 = var6;
              stackIn_12_6 = var6;
              if (var5.field_k == 0) {
                stackIn_13_0 = null;
                stackIn_13_1 = null;
                stackIn_13_7 = false;
              } else {
                stackIn_13_0 = null;
                stackIn_13_1 = null;
                stackIn_13_7 = true;
              }
              var18 = new LegacyOpenGlTexture2D(stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_12_5, stackIn_12_6, stackIn_13_7, var23, 0, 0, false);
              if (guard != 0) {
                return (LegacyOpenGlTexture2D) null;
              }
              var18.setWrap(var5.field_l, var5.field_i, -27365);
              this.textures.put((long)textureId, var18, (byte) 19);
              return var18;
            }
            var7 = this.provider.a(true, var6, (byte) -81, var6, 0.699999988079071f, textureId);
          }
          stackIn_21_0 = null;
          stackIn_21_1 = null;
          stackIn_21_2 = this.toolkit;
          stackIn_21_3 = 3553;
          stackIn_21_4 = 6408;
          stackIn_21_5 = var6;
          stackIn_21_6 = var6;
          if (var5.field_k == 0) {
            stackIn_22_0 = null;
            stackIn_22_1 = null;
            stackIn_22_7 = false;
          } else {
            stackIn_22_0 = null;
            stackIn_22_1 = null;
            stackIn_22_7 = true;
          }
          var19 = new LegacyOpenGlTexture2D(stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5, stackIn_21_6, stackIn_22_7, var7, 0, 0, false);
          if (guard != 0) {
            return (LegacyOpenGlTexture2D) null;
          }
          var19.setWrap(var5.field_l, var5.field_i, -27365);
          this.textures.put((long)textureId, var19, (byte) 19);
          return var19;
        }
        if (this.toolkit.isFloatPostProcessingEnabled()) {
          var11 = this.provider.a(var6, false, 0.699999988079071f, textureId, var6, -101);
          var10 = var11;
          var9 = var10;
          var7_array = var9;
          stackIn_47_0 = null;
          stackIn_47_1 = null;
          stackIn_47_2 = this.toolkit;
          stackIn_47_3 = 3553;
          stackIn_47_4 = 34842;
          stackIn_47_5 = var6;
          stackIn_47_6 = var6;
          if (var5.field_k == 0) {
            stackIn_48_0 = null;
            stackIn_48_1 = null;
            stackIn_48_7 = false;
          } else {
            stackIn_48_0 = null;
            stackIn_48_1 = null;
            stackIn_48_7 = true;
          }
          var4 = new LegacyOpenGlTexture2D(stackIn_47_2, stackIn_47_3, stackIn_47_4, stackIn_47_5, stackIn_47_6, stackIn_48_7, var11, 6408);
          if (guard != 0) {
            return (LegacyOpenGlTexture2D) null;
          }
          var4.setWrap(var5.field_l, var5.field_i, -27365);
          this.textures.put((long)textureId, var4, (byte) 19);
          return var4;
        }
        if (2 == var5.field_p) {
          var7Lifetime1 = this.provider.a(guard - 25069, var6, var6, false, 0.699999988079071f, textureId);
        } else {
          if (!PlayingSound.a(-83, (int) var5.field_d)) {
            var24 = this.provider.a(guard - 25069, var6, var6, false, 0.699999988079071f, textureId);
            stackIn_31_0 = null;
            stackIn_31_1 = null;
            stackIn_31_2 = this.toolkit;
            stackIn_31_3 = 3553;
            stackIn_31_4 = 6408;
            stackIn_31_5 = var6;
            stackIn_31_6 = var6;
            if (var5.field_k == 0) {
              stackIn_32_0 = null;
              stackIn_32_1 = null;
              stackIn_32_7 = false;
            } else {
              stackIn_32_0 = null;
              stackIn_32_1 = null;
              stackIn_32_7 = true;
            }
            var21 = new LegacyOpenGlTexture2D(stackIn_31_2, stackIn_31_3, stackIn_31_4, stackIn_31_5, stackIn_31_6, stackIn_32_7, var24, 0, 0, false);
            if (guard != 0) {
              return (LegacyOpenGlTexture2D) null;
            }
            var21.setWrap(var5.field_l, var5.field_i, -27365);
            this.textures.put((long)textureId, var21, (byte) 19);
            return var21;
          }
          var7Lifetime1 = this.provider.a(true, var6, (byte) -81, var6, 0.699999988079071f, textureId);
        }
        stackIn_40_0 = null;
        stackIn_40_1 = null;
        stackIn_40_2 = this.toolkit;
        stackIn_40_3 = 3553;
        stackIn_40_4 = 6408;
        stackIn_40_5 = var6;
        stackIn_40_6 = var6;
        if (var5.field_k == 0) {
          stackIn_41_0 = null;
          stackIn_41_1 = null;
          stackIn_41_7 = false;
        } else {
          stackIn_41_0 = null;
          stackIn_41_1 = null;
          stackIn_41_7 = true;
        }
        var22 = new LegacyOpenGlTexture2D(stackIn_40_2, stackIn_40_3, stackIn_40_4, stackIn_40_5, stackIn_40_6, stackIn_41_7, var7Lifetime1, 0, 0, false);
        if (guard != 0) {
          return (LegacyOpenGlTexture2D) null;
        }
        var22.setWrap(var5.field_l, var5.field_i, -27365);
        this.textures.put((long)textureId, var22, (byte) 19);
        return var22;
    }

    LegacyOpenGlTextureCache(LegacyOpenGlGraphicsToolkit param0, TextureProvider param1) {
        this.textures = new SoftLruCache(256);
        try {
          this.provider = param1;
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "kk.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
