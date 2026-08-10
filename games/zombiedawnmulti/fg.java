/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends ae {
    static String field_l;
    static byte[] field_k;
    static int field_j;
    static ja field_m;
    private int[] field_i;

    public static void c(int param0) {
        field_k = null;
        field_m = null;
        field_l = null;
        int var1 = 105 % ((22 - param0) / 60);
    }

    fg(int param0, int[] param1) {
        super(param0);
        try {
            this.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fg.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            field_j = -107;
        }
    }

    final static void a(int param0) {
        if (param0 != -29956) {
            fg.a(-45);
        }
    }

    final void a(int param0, qd param1) {
        try {
            param1.a(this.field_i, false);
            if (param0 != 0) {
                fg.c(-54);
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fg.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, long param1, String param2) {
        CharSequence var5 = null;
        try {
            qf.field_g = param2;
            if (param0 != -16745) {
                field_k = (byte[]) null;
            }
            va.field_a = 2;
            var5 = (CharSequence) ((Object) param2);
            ql.field_a = tg.a(var5, false);
            jj.field_M = param1;
            lp.a((byte) 69);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "fg.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = "Instructions";
    }
}
