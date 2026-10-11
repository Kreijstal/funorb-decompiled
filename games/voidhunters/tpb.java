/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tpb {
    int field_a;
    ml field_b;

    final boolean a(byte param0) {
        if (param0 >= 61) {
          return this.field_b != null ? true : false;
        }
        this.a(33);
        return this.field_b != null ? true : false;
    }

    final void a(int param0) {
        this.field_a = param0;
        this.field_b = null;
    }

    public tpb() {
        this.a(2147483647);
    }

    static {
    }
}
