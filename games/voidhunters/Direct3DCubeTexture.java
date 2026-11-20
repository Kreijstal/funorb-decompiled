/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DCubeTexture extends Direct3DTexture implements GpuCubeTexture {
    private jagdx.IDirect3DCubeTexture texture;
    private int field_f;

    final jagdx.IDirect3DBaseTexture getNativeTexture(int param0) {
        if (param0 != 24971) {
          this.bind(102);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.texture);
    }

    public final void setFilterMode(TextureFilterMode param0, int param1) {
        super.setFilterMode(param0, param1);
    }

    Direct3DCubeTexture(Direct3DToolkit param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, param1 * (param1 * 6));
        int var6 = 0;
        int var9 = 0;
        Object stackIn_3_0;
        Direct3DToolkit stackIn_3_1;
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
        stackIn_3_1 = (Direct3DToolkit) (param0);
        stackIn_3_2 = ComponentAttachmentPlan.field_d;
        stackIn_3_3 = GpuDataType.UNSIGNED_BYTE;
        if (param2) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Jc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        this.field_f = param1;
        if (this.field_b) {
          this.texture = this.toolkit.field_Mc.createCubeTexture(this.field_f, 0, 1024, 21, 1);
        } else {
          this.texture = this.toolkit.field_Mc.createCubeTexture(this.field_f, 1, 0, 21, 1);
        }
        var10 = this.toolkit.field_zc;
        var11 = var10;
        for (var6 = 0; var6 < 6; var6++) {
          var7 = this.texture.LockRect(var6, 0, 0, 0, this.field_f, this.field_f, 0, var11);
          if (jagdx.HResult.succeeded(var7, (byte) 114)) {
            var8 = var11.getRowPitch();
            if (this.field_f * 4 != var8) {
              for (var9 = 0; var9 < this.field_f; var9++) {
                var10.writeInts(param3[var6], this.field_f * var9, var8 * var9, this.field_f);
              }
            } else {
              var10.writeInts(param3[var6], 0, 0, this.field_f * this.field_f);
            }
            this.texture.UnlockRect(var6, 0);
          }
        }
    }

    public final void bind(int param0) {
        if (param0 != -27445) {
          return;
        }
        this.toolkit.a(56, (Direct3DTexture) (this));
    }
}
