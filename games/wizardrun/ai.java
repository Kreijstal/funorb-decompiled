/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai extends wl {
    int field_i;
    static String field_s;
    int[] field_q;
    int field_p;
    static String field_j;
    long field_n;
    int field_k;
    int field_m;
    int field_t;
    int field_l;
    int field_o;
    static String field_r;

    public static void a(int param0) {
        field_j = null;
        field_s = null;
        if (param0 != 65535) {
            return;
        }
        field_r = null;
    }

    final static void a(boolean param0, byte param1, String param2, boolean param3) {
        try {
            ki.h((byte) 98);
            u.field_A.d(false);
            r.field_b = new qc(rg.field_S, (String) null, wi.field_J, param0, param3);
            int var4_int = -71 % ((param1 - 89) / 37);
            td.field_f = new kb(u.field_A, r.field_b);
            u.field_A.b((ub) (td.field_f), (byte) 117);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ai.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    ai(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            this.field_l = param3;
            this.field_o = param1;
            this.field_m = param4;
            this.field_q = param6;
            fieldTemp$0 = dg.field_c;
            dg.field_c = dg.field_c + 1;
            this.field_i = fieldTemp$0 & 65535;
            this.field_k = param2;
            this.field_p = param5;
            this.field_t = param0;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ai.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Login: ";
        field_r = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_s = "a score in this game.";
    }
}
