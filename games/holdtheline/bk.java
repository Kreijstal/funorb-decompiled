/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends ca {
    int field_y;
    sk field_x;
    byte[] field_v;
    static int field_w;

    final int g(int param0) {
        if (param0 != 0) {
            return 79;
        }
        if (((bk) this).field_u) {
            return 0;
        }
        return 100;
    }

    final byte[] i(int param0) {
        if (!(!((bk) this).field_u)) {
            throw new RuntimeException();
        }
        if (param0 != -20324) {
            return null;
        }
        return ((bk) this).field_v;
    }

    bk() {
    }

    static {
    }
}
