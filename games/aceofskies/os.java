/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class os extends ag {
    static int field_w;
    byte[] field_u;
    int field_v;
    bl field_x;

    final byte[] a(boolean param0) {
        if (!param0) {
            field_w = 67;
            if (!(!this.field_p)) {
                throw new RuntimeException();
            }
            return this.field_u;
        }
        if (!(!this.field_p)) {
            throw new RuntimeException();
        }
        return this.field_u;
    }

    final int e(int param0) {
        byte[] discarded$8 = null;
        if (param0 != 21513) {
            discarded$8 = this.a(true);
            if (!(!this.field_p)) {
                return 0;
            }
            return 100;
        }
        if (!(!this.field_p)) {
            return 0;
        }
        return 100;
    }

    os() {
    }

    static {
    }
}
