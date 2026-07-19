/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lra extends ora implements va {
    static String[] field_c;
    static long field_f;
    static jea field_e;
    static jea field_d;
    static int field_g;
    private int field_h;

    public final void a(int param0, int param1, byte param2, byte[] param3) {
        try {
            this.a(param3, param1);
            if (param2 > -109) {
            }
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lra.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    lra(cka param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
        try {
            this.field_h = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final long b(int param0) {
        int var2 = 54 % ((30 - param0) / 32);
        return this.field_b.getAddress();
    }

    public final int a(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = this.a(-89);
            return 0;
        }
        return 0;
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 != 18168) {
            lra.c(16);
        }
    }

    public final int a(int param0) {
        if (param0 != 26653) {
            field_g = 30;
            return this.field_h;
        }
        return this.field_h;
    }

    static {
        field_f = 2023746978L;
        field_c = new String[16];
        field_g = 0;
    }
}
