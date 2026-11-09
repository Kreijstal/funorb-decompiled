/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXCubeTexture extends DirectXTexture implements CubeTexture {
    private jagdx.IDirect3DCubeTexture field_f;
    private int field_g;

    public final void bind(int guard) {
        if (guard != 8905) {
          this.nativeTexture(-55);
        }
        this.toolkit.a((DirectXTexture) (this), 1);
    }

    public final void setFilter(TextureFilter filter, int guard) {
        super.setFilter(filter, guard ^ 0);
        if (guard != 15149) {
          this.nativeTexture(20);
        }
    }

    DirectXCubeTexture(DirectXGraphicsToolkit param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, param1 * param1 * 6);
        int var6 = 0;
        int var9 = 0;
        Object stackIn_3_0;
        DirectXGraphicsToolkit stackIn_3_1;
        TextureFormat stackIn_3_2;
        GpuDataType stackIn_3_3;
        int stackIn_4_4 = 0;
        int var7;
        int var8;
        jagdx.PixelBuffer var10;
        jagdx.PixelBuffer var11;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (DirectXGraphicsToolkit) (param0);
        stackIn_3_2 = BeveledTextInputRenderer.RGBA;
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param2) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Qc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        this.field_g = param1;
        if (this.mipmapped) {
          this.field_f = this.toolkit.field_Cc.a(this.field_g, 0, 1024, 21, 1);
        } else {
          this.field_f = this.toolkit.field_Cc.a(this.field_g, 1, 0, 21, 1);
        }
        var10 = this.toolkit.field_Jc;
        var11 = var10;
        for (var6 = 0; 6 > var6; var6++) {
          var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
          if (jagdx.HResult.succeeded(var7, -47)) {
            var8 = var11.getRowPitch();
            if (this.field_g * 4 != var8) {
              for (var9 = 0; var9 < this.field_g; var9++) {
                var10.a(param3[var6], var9 * this.field_g, var8 * var9, this.field_g);
              }
            } else {
              var10.a(param3[var6], 0, 0, this.field_g * this.field_g);
            }
            this.field_f.UnlockRect(var6, 0);
          }
        }
    }

    final jagdx.IDirect3DBaseTexture nativeTexture(int guard) {
        if (guard != -22689) {
          return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }
}
