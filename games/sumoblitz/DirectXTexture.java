/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DirectXTexture {
    DirectXGraphicsToolkit toolkit;
    TextureFilter filter;
    boolean mipmapped;
    GpuDataType dataType;
    TextureFormat format;

    void setFilter(TextureFilter filter, int guard) {
        if (guard != 15149) {
          this.dataType = (GpuDataType) null;
          this.filter = filter;
          return;
        }
        this.filter = filter;
    }

    abstract jagdx.IDirect3DBaseTexture nativeTexture(int guard);

    DirectXTexture(DirectXGraphicsToolkit owner, TextureFormat channelFormat, GpuDataType scalarType, boolean mipmaps, int pixels) {
        this.filter = ArrayWidgetContainer.LINEAR;
        this.dataType = scalarType;
        this.toolkit = owner;
        this.format = channelFormat;
        this.mipmapped = mipmaps ? true : false;
    }
}
