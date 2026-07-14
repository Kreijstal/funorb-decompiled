/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia extends hf {
    e field_g;
    ia field_h;
    int field_i;
    volatile boolean field_f;

    abstract ia b();

    abstract int d();

    abstract void b(int param0);

    abstract ia c();

    int a() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (((ia) this).field_f) {
            ((ia) this).a(param0, param1, param2);
        } else {
            ((ia) this).b(param2);
        }
    }

    abstract void a(int[] param0, int param1, int param2);

    protected ia() {
        ((ia) this).field_f = true;
    }
}
