/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends bh {
    int field_w;
    int field_y;
    static String field_n;
    int field_q;
    long field_o;
    int field_u;
    int[] field_s;
    int field_v;
    int field_t;
    static w field_r;
    int field_x;
    static w field_p;

    public static void a(int param0) {
        field_r = null;
        field_p = null;
        if (param0 != -1) {
            kn.a(11);
            field_n = null;
            return;
        }
        field_n = null;
    }

    final static void a(mm param0, byte param1, int param2, String param3, int param4, int param5) {
        int var6_int = 0;
        if (param1 != -39) {
            return;
        }
        try {
            var6_int = 2;
            if (se.field_S == param0) {
                var6_int = 1;
            }
            param0.c(param3, -var6_int + param5, -var6_int + param2, 0, -1);
            param0.c(param3, -var6_int + param5, param2, 0, -1);
            param0.c(param3, -var6_int + param5, param2 + var6_int, 0, -1);
            param0.c(param3, param5, -var6_int + param2, 0, -1);
            param0.c(param3, param5, param2 - -var6_int, 0, -1);
            param0.c(param3, param5 + var6_int, -var6_int + param2, 0, -1);
            param0.c(param3, var6_int + param5, param2, 0, -1);
            param0.c(param3, var6_int + param5, var6_int + param2, 0, -1);
            if (!(w.field_kb != param0)) {
                param0.c(param3, 1 + param5, param2 + -var6_int, 0, -1);
                param0.c(param3, -1 + param5, param2 + -var6_int, 0, -1);
                param0.c(param3, var6_int + param5, -1 + param2, 0, -1);
                param0.c(param3, -var6_int + param5, -1 + param2, 0, -1);
                param0.c(param3, var6_int + param5, param2 - -1, 0, -1);
                param0.c(param3, -var6_int + param5, 1 + param2, 0, -1);
                param0.c(param3, param5 - -1, var6_int + param2, 0, -1);
                param0.c(param3, -1 + param5, param2 + var6_int, 0, -1);
            }
            param0.c(param3, param5, param2, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kn.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    kn(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
            fieldTemp$0 = dk.field_a;
            dk.field_a = dk.field_a + 1;
            this.field_u = 65535 & fieldTemp$0;
            this.field_s = param6;
            this.field_v = param3;
            this.field_q = param1;
            this.field_t = param2;
            this.field_y = param5;
            this.field_w = param4;
            this.field_x = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "kn.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "<%0> must play <%1> more rated games before playing with the current options.";
    }
}
