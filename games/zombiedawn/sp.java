/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sp extends le {
    int field_j;
    ik field_h;
    volatile boolean field_k;
    sp field_i;

    final void b(int[] param0, int param1, int param2) {
        if (this.field_k) {
            this.a(param0, param1, param2);
        } else {
            this.a(param2);
        }
    }

    int b() {
        return 255;
    }

    abstract void a(int param0);

    abstract void a(int[] param0, int param1, int param2);

    abstract int a();

    abstract sp c();

    abstract sp d();

    protected sp() {
        this.field_k = true;
    }
}
