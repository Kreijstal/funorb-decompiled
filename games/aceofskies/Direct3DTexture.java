/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Direct3DTexture {
    hd field_e;
    ke field_a;
    HardwareDirect3DRenderer field_c;
    BufferElementType field_d;
    boolean field_b;

    abstract jagdx.IDirect3DBaseTexture b(int param0);

    void a(ke param0, int param1) {
        if (param1 != -31662) {
          this.field_d = (BufferElementType) null;
          this.field_a = param0;
          return;
        }
        this.field_a = param0;
    }

    Direct3DTexture(HardwareDirect3DRenderer param0, hd param1, BufferElementType param2, boolean param3, int param4) {
        this.field_a = CachedArchiveProvider.field_A;
        this.field_e = param1;
        this.field_b = param3 ? true : false;
        this.field_c = param0;
        this.field_d = param2;
    }
}
