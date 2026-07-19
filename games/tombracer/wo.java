/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends vo implements va {
    private int field_j;
    static jea field_k;
    static ft field_i;

    public static void c(int param0) {
        field_k = null;
        field_i = null;
        if (param0 != 34962) {
            wo.c(53);
        }
    }

    public final int a(boolean param0) {
        if (!param0) {
            field_k = (jea) null;
            return this.field_e;
        }
        return this.field_e;
    }

    wo(cka param0, int param1, byte[] param2, int param3, boolean param4) {
        super(param0, 34962, param2, param3, param4);
        try {
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void d(int param0) {
        this.field_h.a(101, (va) (this));
        if (param0 != 34963) {
            byte[] var3 = (byte[]) null;
            this.a(-36, 18, (byte) 18, (byte[]) null);
        }
    }

    public final void a(int param0, int param1, byte param2, byte[] param3) {
        int discarded$0 = 0;
        try {
            this.a(-114, param3, param1);
            if (param2 > -109) {
                discarded$0 = this.a(-43);
            }
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "wo.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public final long b(int param0) {
        int var2 = -17 / ((30 - param0) / 32);
        return 0L;
    }

    public final int a(int param0) {
        if (param0 != 26653) {
            this.field_j = 66;
            return this.field_j;
        }
        return this.field_j;
    }

    static {
        field_i = new ft(2);
    }
}
