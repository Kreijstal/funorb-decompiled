/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ej extends gg {
    ej field_i;
    int field_j;
    volatile boolean field_k;
    nl field_h;

    abstract ej a();

    final void b(int[] param0, int param1, int param2) {
        if (((ej) this).field_k) {
            ((ej) this).a(param0, param1, param2);
        } else {
            ((ej) this).a(param2);
        }
    }

    abstract void a(int param0);

    abstract ej b();

    int c() {
        return 255;
    }

    abstract void a(int[] param0, int param1, int param2);

    protected ej() {
        ((ej) this).field_k = true;
    }

    abstract int d();
}
