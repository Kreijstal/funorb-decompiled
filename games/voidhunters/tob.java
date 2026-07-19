/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tob extends fh {
    static String field_l;
    static dja field_o;
    private long field_n;
    int field_m;
    private qfa field_k;

    final static boolean g(int param0) {
        if (param0 != 0) {
            field_l = (String) null;
            return lsa.field_e != null ? true : false;
        }
        return lsa.field_e != null ? true : false;
    }

    protected final void finalize() throws Throwable {
        this.e(0);
        super.finalize();
    }

    public static void a(int param0) {
        field_o = null;
        field_l = null;
        int var1 = 112 / ((param0 - 32) / 56);
    }

    private final void e(int param0) {
        if (!(this.field_n <= (long)param0)) {
            this.field_k.field_c.releasePbuffer(this.field_n);
            this.field_n = 0L;
        }
    }

    final long f(int param0) {
        if (param0 >= -122) {
            field_l = (String) null;
            return this.field_n;
        }
        return this.field_n;
    }

    tob(qfa param0, int param1, int param2) {
        try {
            this.field_m = param1 * param2;
            this.field_k = param0;
            this.field_n = this.field_k.field_c.createPbuffer(param1, param2);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "tob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "More special weapons";
        field_o = (dja) ((Object) new wha());
    }
}
