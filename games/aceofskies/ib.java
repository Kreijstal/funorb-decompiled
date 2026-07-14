/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib {
    hd field_e;
    ke field_a;
    kr field_c;
    la field_d;
    boolean field_b;

    abstract jagdx.IDirect3DBaseTexture b(int param0);

    void a(ke param0, int param1) {
        if (param1 != -31662) {
            ((ib) this).field_d = (la) null;
            ((ib) this).field_a = param0;
            return;
        }
        ((ib) this).field_a = param0;
    }

    ib(kr param0, hd param1, la param2, boolean param3, int param4) {
        ((ib) this).field_a = fg.field_A;
        ((ib) this).field_e = param1;
        ((ib) this).field_b = param3 ? true : false;
        ((ib) this).field_c = param0;
        ((ib) this).field_d = param2;
    }
}
