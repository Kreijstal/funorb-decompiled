/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    long field_d;
    private on field_a;
    static java.math.BigInteger field_c;
    static String field_b;
    static int field_e;

    oh(on param0, long param1, qj[] param2) {
        try {
            this.field_a = param0;
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "oh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -60) {
            field_b = (String) null;
        }
    }

    protected final void finalize() throws Throwable {
        this.field_a.a(33984, this.field_d);
        super.finalize();
    }

    static {
        field_c = new java.math.BigInteger("65537");
        field_b = "to return to the normal view.";
    }
}
