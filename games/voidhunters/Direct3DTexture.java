/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Direct3DTexture {
    TextureFilterMode filterMode;
    Direct3DToolkit toolkit;
    boolean field_b;
    TextureFormat format;
    GpuDataType dataType;

    abstract jagdx.IDirect3DBaseTexture getNativeTexture(int param0);

    void setFilterMode(TextureFilterMode param0, int param1) {
        this.filterMode = param0;
        if (param1 != -28798) {
          this.format = (TextureFormat) null;
        }
    }

    Direct3DTexture(Direct3DToolkit param0, TextureFormat param1, GpuDataType param2, boolean param3, int param4) {
        this.filterMode = cs.field_a;
        this.toolkit = param0;
        this.field_b = param3 ? true : false;
        this.format = param1;
        this.dataType = param2;
    }
}
