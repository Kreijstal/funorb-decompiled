/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn {
    static ki field_d;
    private fr field_b;
    long field_c;
    static wb field_a;

    public static void a() {
        field_a = null;
        field_d = null;
    }

    sn(fr param0, long param1, mk[] param2) {
        try {
            ((sn) this).field_c = param1;
            ((sn) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
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
