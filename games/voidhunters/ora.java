/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ora {
    tu field_e;
    Direct3DToolkit field_d;
    boolean field_b;
    TextureFormat field_c;
    GpuDataType field_a;

    abstract jagdx.IDirect3DBaseTexture c(int param0);

    void a(tu param0, int param1) {
        this.field_e = param0;
        if (param1 != -28798) {
          this.field_c = (TextureFormat) null;
        }
    }

    ora(Direct3DToolkit param0, TextureFormat param1, GpuDataType param2, boolean param3, int param4) {
        this.field_e = cs.field_a;
        this.field_d = param0;
        this.field_b = param3 ? true : false;
        this.field_c = param1;
        this.field_a = param2;
    }
}
