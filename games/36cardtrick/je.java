/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class je extends qb {
    int field_j;
    je field_g;
    volatile boolean field_h;
    ea field_i;

    int d() {
        return 255;
    }

    abstract void a(int param0);

    abstract void a(int[] param0, int param1, int param2);

    abstract je b();

    abstract je a();

    final void b(int[] param0, int param1, int param2) {
        if (((je) this).field_h) {
            ((je) this).a(param0, param1, param2);
        } else {
            ((je) this).a(param2);
        }
    }

    abstract int c();

    je() {
        ((je) this).field_h = true;
    }
}
