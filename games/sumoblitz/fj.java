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
            ((fj) this).field_c = null;
            ((fj) this).field_a = param0;
            return;
        }
        ((fj) this).field_a = param0;
    }

    abstract jagdx.IDirect3DBaseTexture d(int param0);

    fj(ir param0, iw param1, io param2, boolean param3, int param4) {
        ((fj) this).field_a = ao.field_y;
        ((fj) this).field_c = param2;
        ((fj) this).field_b = param0;
        ((fj) this).field_d = param1;
        ((fj) this).field_e = param3 ? true : false;
    }
}
