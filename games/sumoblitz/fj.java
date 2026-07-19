/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fj {
    ir field_b;
    ji field_a;
    boolean field_e;
    io field_c;
    iw field_d;

    void a(ji param0, int param1) {
        if (param1 != 15149) {
            this.field_c = (io) null;
            this.field_a = param0;
            return;
        }
        this.field_a = param0;
    }

    abstract jagdx.IDirect3DBaseTexture d(int param0);

    fj(ir param0, iw param1, io param2, boolean param3, int param4) {
        this.field_a = ao.field_y;
        this.field_c = param2;
        this.field_b = param0;
        this.field_d = param1;
        this.field_e = param3 ? true : false;
    }
}
