/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends mc {
    int field_s;
    int field_q;
    int field_o;
    int[] field_t;
    int field_u;
    int field_p;
    int field_r;
    static String field_n;

    final static void a(int param0) {
        if (param0 != 18278) {
            dl.a(38);
        }
    }

    final static void a(int param0, ri param1) {
        try {
            mm.a(param1, (byte) -71, true);
            if (param0 != 27654) {
                field_n = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "dl.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        if (param0 > -25) {
            return;
        }
        field_n = null;
    }

    final void a(int param0, int param1, int param2, int param3, int[] param4, boolean param5, int param6, int param7) {
        try {
            this.field_p = param2;
            if (!param5) {
                this.field_t = (int[]) null;
            }
            this.field_t = param4;
            this.field_s = param0;
            this.field_o = param7;
            this.field_q = param6;
            this.field_r = param3;
            this.field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "dl.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    dl() {
    }

    static {
        field_n = "Enter multiplayer lobby";
    }
}
