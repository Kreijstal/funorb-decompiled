/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sg extends pg {
    sg field_g;
    int field_h;
    tb field_j;
    volatile boolean field_i;

    int d() {
        return 255;
    }

    final void b(int[] param0, int param1, int param2) {
        if (((sg) this).field_i) {
            ((sg) this).a(param0, param1, param2);
        } else {
            ((sg) this).a(param2);
        }
    }

    abstract void a(int param0);

    abstract sg b();

    abstract void a(int[] param0, int param1, int param2);

    abstract int c();

    abstract sg a();

    protected sg() {
        ((sg) this).field_i = true;
    }
}
