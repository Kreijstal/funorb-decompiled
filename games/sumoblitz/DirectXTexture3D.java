/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXTexture3D extends DirectXTexture implements Texture3D {
    private jagdx.IDirect3DVolumeTexture field_h;
    private int field_g;
    private int field_i;
    private int field_f;

    DirectXTexture3D(DirectXGraphicsToolkit param0, TextureFormat param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, GpuDataType.UNSIGNED_BYTE, false, param3 * param2 * param4);
        int var14 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        jagdx.PixelBuffer var15;
        int var13Lifetime1;
        this.field_f = param4;
        this.field_g = param2;
        this.field_i = param3;
        this.field_h = this.toolkit.field_Cc.createVolumeTexture(param2, param3, param4, 1, 0, DirectXGraphicsToolkit.d3dTextureFormat(param1, -99, this.dataType), 1);
        var15 = this.toolkit.field_Jc;
        var8 = this.field_h.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
        if (!jagdx.HResult.succeeded(var8, -94)) {
          return;
        }
        var9 = this.format.componentCount * this.field_g;
        var10 = var9 * this.field_i;
        var11 = var15.getSlicePitch();
        if (var11 == var10) {
          var15.putBytes(param5, 0, 0, var9 * this.field_i * this.field_f);
          this.field_h.UnlockBox(0);
          return;
        }
        var12 = var15.getRowPitch();
        if (var12 == var9) {
          for (var13 = 0; this.field_f > var13; var13++) {
            var15.putBytes(param5, var10 * var13, var13 * var11, var10);
          }
          this.field_h.UnlockBox(0);
          return;
        }
        for (var13Lifetime1 = 0; this.field_f > var13Lifetime1; var13Lifetime1++) {
          for (var14 = 0; this.field_i > var14; var14++) {
            var15.putBytes(param5, var13Lifetime1 * var10 + var9 * var14, var12 * var14 + var11 * var13Lifetime1, var9);
          }
        }
        this.field_h.UnlockBox(0);
        return;
    }

    public final void setFilter(TextureFilter filter, int guard) {
        if (guard != 15149) {
          return;
        }
        super.setFilter(filter, guard + 0);
    }

    final jagdx.IDirect3DBaseTexture nativeTexture(int guard) {
        if (guard != -22689) {
          this.field_g = -6;
          return (jagdx.IDirect3DBaseTexture) ((Object) this.field_h);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_h);
    }

    public final void bind(int guard) {
        this.toolkit.bindTexture3D(2, this);
        if (guard != 8905) {
          TextureFilter var3 = (TextureFilter) null;
          this.setFilter((TextureFilter) null, 117);
        }
    }
}
