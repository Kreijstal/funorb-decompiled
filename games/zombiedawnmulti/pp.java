/*
 * Decompiled by CFR-JS 0.4.0.
 */
class pp extends ic {
    private long field_p;
    static ri[] field_q;
    static boolean field_n;
    static String field_o;
    private String field_m;

    public static void a(boolean param0) {
        field_o = null;
        field_q = null;
        if (param0) {
            pp.a(true);
        }
    }

    pi b(int param0) {
        if (param0 != 7) {
            field_o = (String) null;
            return pl.field_G;
        }
        return pl.field_G;
    }

    pp(long param0, String param1) {
        try {
            this.field_p = param0;
            this.field_m = param1;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pp.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(k param0, int param1) {
        pi discarded$0 = null;
        try {
            param0.a(this.field_p, true);
            if (param1 != -1) {
                discarded$0 = this.b(-111);
            }
            param0.a(13066, this.field_m);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "pp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_o = "Make humans or enemy zombies heavy with their burdens, slowing them down. Then, move in for the kill!";
    }
}
