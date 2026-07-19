/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class di extends ca {
    ng field_h;
    int field_i;
    di field_f;
    volatile boolean field_g;

    abstract di d();

    abstract int c();

    abstract void c(int param0);

    abstract di a();

    final void a(int[] param0, int param1, int param2) {
        if (this.field_g) {
            this.b(param0, param1, param2);
        } else {
            this.c(param2);
        }
    }

    abstract void b(int[] param0, int param1, int param2);

    int b() {
        return 255;
    }

    protected di() {
        this.field_g = true;
    }
}
