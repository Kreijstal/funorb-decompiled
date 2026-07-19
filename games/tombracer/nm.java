/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends vo implements sca {
    static nh field_l;
    private int field_k;
    static jpa field_i;
    static String field_j;

    final static void a(iu param0, byte param1) {
        gb.a(-29711);
        if (param1 < 88) {
            return;
        }
        try {
            bea.a(param0.field_r, param0.field_n, param0.field_k);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final long b(int param0) {
        if (param0 != 19135) {
            iu var3 = (iu) null;
            nm.a((iu) null, (byte) -94);
            return 0L;
        }
        return 0L;
    }

    public final int a(int param0) {
        if (param0 != 9624) {
            return 39;
        }
        return this.field_e;
    }

    public final void a(int param0, int param1, byte[] param2, int param3) {
        this.a(-101, param2, param0);
        if (param1 != -11783) {
            return;
        }
        try {
            this.field_k = param3;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    nm(cka param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34963, param2, param3, param4);
        try {
            this.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        if (param0 < 17) {
            field_l = (nh) null;
            field_l = null;
            field_j = null;
            return;
        }
        field_l = null;
        field_j = null;
    }

    final void d(int param0) {
        this.field_h.a((sca) (this), param0 ^ 0);
        if (param0 != 34963) {
            byte[] var3 = (byte[]) null;
            this.a(-86, -126, (byte[]) null, -64);
        }
    }

    public final int c(int param0) {
        if (param0 != -1771) {
            this.d(-113);
            return this.field_k;
        }
        return this.field_k;
    }

    static {
        field_j = "No highscores";
    }
}
