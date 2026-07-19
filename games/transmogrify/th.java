/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_a;
    static String field_b;
    static String field_e;
    static String[] field_d;
    static td field_c;

    final static void a(int param0, int param1, ng param2) {
        hj var3 = null;
        try {
            var3 = ff.field_D;
            if (param0 != 65536) {
                field_a = -12;
            }
            var3.a(false, param1);
            var3.f(6389, param2.field_m);
            var3.f(6389, param2.field_k);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "th.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, oa param1) {
        int var2_int = 0;
        try {
            ia.field_j = param1.a((byte) -116) << 1525012805;
            var2_int = param1.d((byte) 41);
            cl.field_x = (var2_int & 7) << 2146837330;
            ia.field_j = ia.field_j + (var2_int >> 2073416643);
            cl.field_x = cl.field_x + (param1.a((byte) -112) << 1923498466);
            var2_int = param1.d((byte) 64);
            cl.field_x = cl.field_x + (var2_int >> 1925497798);
            ug.field_b = 2064384 & var2_int << -727850545;
            ug.field_b = ug.field_b + (param1.d((byte) 41) << 1436090055);
            if (param0 < 91) {
                field_e = (String) null;
            }
            var2_int = param1.d((byte) 127);
            di.field_e = 65536 & var2_int << -241434608;
            ug.field_b = ug.field_b + (var2_int >> 1236766369);
            di.field_e = di.field_e + param1.a((byte) -104);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "th.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0 != -42) {
            ng var2 = (ng) null;
            th.a(-43, 125, (ng) null);
        }
    }

    static {
        field_a = 0;
        field_b = "Shuffle";
        field_e = "No highscores";
    }
}
