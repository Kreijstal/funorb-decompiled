/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nqa {
    ft field_e;
    Direct3DToolkit field_d;
    una field_b;
    boolean field_c;
    TextureFilter field_a;

    void setFilter(int param0, TextureFilter param1) {
        this.field_a = param1;
        if (param0 != 7672) {
          TextureFilter var4 = (TextureFilter) null;
          this.setFilter(26, (TextureFilter) null);
        }
    }

    abstract jagdx.IDirect3DBaseTexture getBaseTexture(int param0);

    nqa(Direct3DToolkit param0, ft param1, una param2, boolean param3, int param4) {
        this.field_a = MirrorComponent.field_G;
        this.field_b = param2;
        this.field_d = param0;
        this.field_c = param3 ? true : false;
        this.field_e = param1;
    }
}
