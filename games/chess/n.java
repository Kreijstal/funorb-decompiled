/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n {
    static p field_g;
    static String field_h;
    static String field_a;
    static String[] field_d;
    static int field_e;
    static int field_f;
    static String field_c;
    static bn[] field_b;

    final static vg a() {
        String var1 = ob.d((byte) -108);
        if (var1 != null) {
            if (0 <= var1.indexOf('@')) {
                var1 = "";
            }
        }
        return new vg(ob.d((byte) -124), hh.d((byte) -122));
    }

    final static void a(lh param0, int param1, boolean param2, km[] param3, int param4, int param5, int param6, int param7, int param8, lh param9, int param10, int param11, int param12, int param13, km[] param14) {
        try {
            int discarded$0 = 8;
            int discarded$1 = 8;
            tb.a(le.field_f, param9, -26472, param3, param0, param12, (km[]) null, 240, kg.field_V, 320, param13, param14, 480, 0, 2, kj.field_h, 0, param7, param6);
            ga.a(param2, 121);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "n.B(" + (param0 != null ? "{...}" : "null") + ',' + 8 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + 320 + ',' + 2 + ',' + param6 + ',' + param7 + ',' + 240 + ',' + (param9 != null ? "{...}" : "null") + ',' + 8 + ',' + 126 + ',' + param12 + ',' + param13 + ',' + (param14 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_c = null;
        field_h = null;
        field_d = null;
    }

    final static void a(um param0, um param1, boolean param2, int param3, um param4) {
        try {
            pi.field_c = la.a(true, "");
            pi.field_c.a(false, -1730123902);
            hn.a(86, param4, param1, param0);
            int discarded$0 = -128;
            ak.c();
            vl.field_A = ji.field_T;
            g.field_a = ji.field_T;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "n.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + 0 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Rated game";
        field_f = 0;
        field_a = "<%0> has declined the invitation.";
        field_d = new String[16];
        field_b = new bn[7];
        field_e = field_f;
    }
}
