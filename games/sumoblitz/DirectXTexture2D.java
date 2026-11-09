/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXTexture2D extends DirectXTexture implements Texture2D {
    boolean repeatY;
    private int height;
    private int width;
    private jagdx.IDirect3DTexture texture;
    boolean repeatX;

    public final int height(byte guard) {
        int var2 = 10 / ((-39 - guard) / 40);
        return this.height;
    }

    DirectXTexture2D(DirectXGraphicsToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param3 * param2);
        int var12 = 0;
        Object stackIn_3_0;
        DirectXGraphicsToolkit stackIn_3_1;
        TextureFormat stackIn_3_2;
        GpuDataType stackIn_3_3;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        jagdx.PixelBuffer var13;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (DirectXGraphicsToolkit) (param0);
        stackIn_3_2 = (TextureFormat) (param1);
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param4) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Sc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (!this.toolkit.field_Oc) {
          this.width = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param2);
          this.height = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param3);
        } else {
          this.width = param2;
          this.height = param3;
        }
        if (param4) {
          this.texture = this.toolkit.field_Cc.a(this.width, this.height, 0, 1024, DirectXGraphicsToolkit.a(this.format, 126, GpuDataType.UNSIGNED_BYTE), 1);
        } else {
          this.texture = this.toolkit.field_Cc.a(this.width, this.height, 1, 0, DirectXGraphicsToolkit.a(this.format, -88, GpuDataType.UNSIGNED_BYTE), 1);
        }
        var13 = this.toolkit.field_Jc;
        var10 = this.texture.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.HResult.succeeded(var10, -111)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param7 = param7 * this.format.componentCount;
          param2 = param2 * this.format.componentCount;
          var11 = var13.getRowPitch();
          if (var11 == param2 &&
            param2 == param7) {
            var13.a(param5, param6, 0, param3 * param2);
          } else {
            for (var12 = 0; param3 > var12; var12++) {
              var13.a(param5, var12 * param7 + param6, var11 * var12, param2);
            }
          }
          this.texture.UnlockRect(0);
        }
    }

    public final void setWrap(boolean repeatY, boolean repeatX, boolean guard) {
        this.repeatX = repeatX ? true : false;
        this.repeatY = repeatY ? true : false;
        if (!guard) {
          this.repeatX = true;
        }
    }

    DirectXTexture2D(DirectXGraphicsToolkit param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param1 * param2);
        Object stackIn_3_0;
        DirectXGraphicsToolkit stackIn_3_1;
        TextureFormat stackIn_3_2;
        GpuDataType stackIn_3_3;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        int var11;
        jagdx.PixelBuffer var12;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (DirectXGraphicsToolkit) (param0);
        stackIn_3_2 = BeveledTextInputRenderer.RGBA;
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param3) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Sc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (!this.toolkit.field_Oc) {
          this.width = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param1);
          this.height = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param2);
        } else {
          this.width = param1;
          this.height = param2;
        }
        if (!param3) {
          this.texture = this.toolkit.field_Cc.a(this.width, this.height, 1, 0, 21, 1);
        } else {
          this.texture = this.toolkit.field_Cc.a(this.width, this.height, 0, 1024, 21, 1);
        }
        var12 = this.toolkit.field_Jc;
        var9 = this.texture.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (jagdx.HResult.succeeded(var9, -45)) {
          if (param6 == 0) {
            param6 = param1;
          }
          var10 = var12.getRowPitch();
          if (var10 != param1 * 4) {
            for (var11 = 0; var11 < param2; var11++) {
              var12.a(param4, param5 + param6 * var11, var10 * var11, param1);
            }
          } else if (param6 != param1) {
            for (var11 = 0; var11 < param2; var11++) {
              var12.a(param4, param5 + param6 * var11, var10 * var11, param1);
            }
          } else {
            var12.a(param4, param5, 0, param2 * param1);
          }
          this.texture.UnlockRect(0);
        }
    }

    public final boolean usesNormalizedCoordinates(int guard) {
        if (guard != -24722) {
          return true;
        }
        return true;
    }

    public final void setFilter(TextureFilter filter, int guard) {
        super.setFilter(filter, guard);
    }

    public final int width(int guard) {
        if (guard != -16625) {
          this.textureV(-1.7616260051727295f, 87);
        }
        return this.width;
    }

    DirectXTexture2D(DirectXGraphicsToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, param1, param2, false, param4 * param3);
        if (!this.toolkit.field_Oc) {
          this.width = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param3);
          this.height = LegacyOpenGlVertexBuffer.nextPowerOfTwo(false, param4);
        } else {
          this.width = param3;
          this.height = param4;
        }
        this.texture = this.toolkit.field_Cc.a(param3, param4, 1, 0, DirectXGraphicsToolkit.a(this.format, -120, this.dataType), 1);
    }

    public final void bind(int guard) {
        if (guard != 8905) {
          return;
        }
        this.toolkit.a(guard ^ 8904, this);
    }

    public final float textureU(float pixelX, int guard) {
        if (guard > -10) {
          return 0.4205271005630493f;
        }
        return pixelX / (float)this.width;
    }

    final jagdx.IDirect3DBaseTexture nativeTexture(int guard) {
        if (guard != -22689) {
          return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.texture);
    }

    public final float textureV(float pixelY, int guard) {
        if (guard != -19230) {
          TextureFilter var4 = (TextureFilter) null;
          this.setFilter((TextureFilter) null, 47);
        }
        return pixelY / (float)this.height;
    }
}
