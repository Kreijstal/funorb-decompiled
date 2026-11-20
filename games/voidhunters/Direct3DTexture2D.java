/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DTexture2D extends Direct3DTexture implements GpuTexture2D {
    private int width;
    private int height;
    boolean repeatX;
    boolean repeatY;
    private jagdx.IDirect3DTexture texture;

    public final boolean usesNormalizedCoordinates(int param0) {
        int var2 = 80 % ((-92 - param0) / 34);
        return true;
    }

    public final void updatePixels(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        int var12 = 0;
        jagdx.PixelBuffer var9;
        int var10;
        int var11;
        if (param7 >= -78) {
          this.height = -127;
        }
        if (this.format == ComponentAttachmentPlan.field_d &&
          GpuDataType.UNSIGNED_BYTE == this.dataType) {
          var9 = this.toolkit.field_zc;
          var10 = this.texture.LockRect(0, param6, param0, param2, param1, 0, var9);
          if (jagdx.HResult.succeeded(var10, (byte) 58)) {
            var11 = var9.getRowPitch();
            if (var11 == param2 * 4 &&
              param4 == param2) {
              var9.writeInts(param5, param3, 0, param1 * param2);
            } else {
              for (var12 = 0; param1 > var12; var12++) {
                var9.writeInts(param5, var12 * param4 + param3, var12 * var11, param2);
              }
            }
            this.texture.UnlockRect(0);
          }
          return;
        }
        throw new RuntimeException();
    }

    public final void setFilterMode(TextureFilterMode param0, int param1) {
        super.setFilterMode(param0, param1);
    }

    Direct3DTexture2D(Direct3DToolkit param0, TextureFormat param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        int var12 = 0;
        Object stackIn_3_0;
        Direct3DToolkit stackIn_3_1;
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
        stackIn_3_1 = (Direct3DToolkit) (param0);
        stackIn_3_2 = (TextureFormat) (param1);
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param4) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Zc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (this.toolkit.field_Nc) {
          this.width = param2;
          this.height = param3;
        } else {
          this.width = GetSalvoaim.a(param2, (byte) -127);
          this.height = GetSalvoaim.a(param3, (byte) -99);
        }
        if (!param4) {
          this.texture = this.toolkit.device.createTexture(this.width, this.height, 1, 0, Direct3DToolkit.toDirect3DTextureFormat(this.format, GpuDataType.UNSIGNED_BYTE, -122), 1);
        } else {
          this.texture = this.toolkit.device.createTexture(this.width, this.height, 0, 1024, Direct3DToolkit.toDirect3DTextureFormat(this.format, GpuDataType.UNSIGNED_BYTE, -95), 1);
        }
        var13 = this.toolkit.field_zc;
        var10 = this.texture.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.HResult.succeeded(var10, (byte) 100)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param2 = param2 * this.format.componentCount;
          param7 = param7 * this.format.componentCount;
          var11 = var13.getRowPitch();
          if (param2 == var11 &&
            param7 == param2) {
            var13.writeBytes(param5, param6, 0, param2 * param3);
          } else {
            for (var12 = 0; param3 > var12; var12++) {
              var13.writeBytes(param5, param6 + param7 * var12, var12 * var11, param2);
            }
          }
          this.texture.UnlockRect(0);
        }
    }

    Direct3DTexture2D(Direct3DToolkit param0, TextureFormat param1, GpuDataType param2, int param3, int param4) {
        super(param0, param1, param2, false, param3 * param4);
        if (this.toolkit.field_Nc) {
          this.height = param4;
          this.width = param3;
        } else {
          this.width = GetSalvoaim.a(param3, (byte) -113);
          this.height = GetSalvoaim.a(param4, (byte) -97);
        }
        this.texture = this.toolkit.device.createTexture(param3, param4, 1, 0, Direct3DToolkit.toDirect3DTextureFormat(this.format, this.dataType, -122), 1);
    }

    final jagdx.IDirect3DBaseTexture getNativeTexture(int param0) {
        if (param0 != 24971) {
          this.bind(-52);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.texture);
    }

    public final int getWidth(byte param0) {
        if (param0 != 113) {
          this.height = -121;
        }
        return this.width;
    }

    public final void bind(int param0) {
        if (param0 != -27445) {
          this.height = -11;
        }
        this.toolkit.bindTexture(param0 ^ -27467, this);
    }

    public final void setRepeat(boolean param0, byte param1, boolean param2) {
        this.repeatY = param2 ? true : false;
        if (param1 != -98) {
          this.repeatY = true;
        }
        this.repeatX = param0 ? true : false;
    }

    public final float getV(float param0, int param1) {
        if (param1 < 58) {
          return 1.741902470588684f;
        }
        return param0 / (float)this.height;
    }

    public final int getHeight(byte param0) {
        if (param0 > -40) {
          int[] var3 = (int[]) null;
          this.updatePixels(15, 27, 32, 18, 4, (int[]) null, -70, (byte) 46);
        }
        return this.height;
    }

    Direct3DTexture2D(Direct3DToolkit param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param2 * param1);
        int var11 = 0;
        Object stackIn_3_0;
        Direct3DToolkit stackIn_3_1;
        TextureFormat stackIn_3_2;
        GpuDataType stackIn_3_3;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        jagdx.PixelBuffer var12;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (Direct3DToolkit) (param0);
        stackIn_3_2 = ComponentAttachmentPlan.field_d;
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param3) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Zc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (!this.toolkit.field_Nc) {
          this.width = GetSalvoaim.a(param1, (byte) -119);
          this.height = GetSalvoaim.a(param2, (byte) -97);
        } else {
          this.width = param1;
          this.height = param2;
        }
        if (!param3) {
          this.texture = this.toolkit.device.createTexture(this.width, this.height, 1, 0, 21, 1);
        } else {
          this.texture = this.toolkit.device.createTexture(this.width, this.height, 0, 1024, 21, 1);
        }
        var12 = this.toolkit.field_zc;
        var9 = this.texture.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (jagdx.HResult.succeeded(var9, (byte) 118)) {
          if (0 == param6) {
            param6 = param1;
          }
          var10 = var12.getRowPitch();
          if (var10 == param1 * 4 &&
            param1 == param6) {
            var12.writeInts(param4, param5, 0, param2 * param1);
          } else {
            for (var11 = 0; var11 < param2; var11++) {
              var12.writeInts(param4, param5 + var11 * param6, var10 * var11, param1);
            }
          }
          this.texture.UnlockRect(0);
        }
    }

    public final float getU(float param0, int param1) {
        if (param1 != -1080) {
          this.getHeight((byte) -126);
        }
        return param0 / (float)this.width;
    }
}
