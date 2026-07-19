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
            field_a = (wb) null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    sn(fr param0, long param1, mk[] param2) {
        try {
            this.field_c = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.field_b.a(this.field_c, (byte) -88);
        super.finalize();
    }

    static {
        field_a = new wb(540, 140);
    }
}
