/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di {
    static int field_b;
    static int field_a;

    final static pb[] a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != -80) {
            return (pb[]) null;
        }
        return qd.a(param1, 1, param0, param3, param2, 1, -1, 1, 3);
    }

    final static void a(int param0) {
        if (param0 != 1) {
            field_b = 82;
            aa.a(hf.a((byte) -9), false);
            return;
        }
        aa.a(hf.a((byte) -9), false);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        field_b = 0;
        field_a = 0;
    }
}
