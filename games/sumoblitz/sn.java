/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static ki field_d;
    private fr field_b;
    long field_c;
    static wb field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 > -30) {
            field_a = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    sn(fr param0, long param1, mk[] param2) {
        ((sn) this).field_c = param1;
        ((sn) this).field_b = param0;
    }

    protected final void finalize() throws Throwable {
        ((sn) this).field_b.a(((sn) this).field_c, (byte) -88);
        super.finalize();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wb(540, 140);
    }
}
