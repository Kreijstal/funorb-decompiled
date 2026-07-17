/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends i {
    static sj field_H;
    static hd field_G;
    static long field_I;
    static kj field_K;
    static String field_F;
    static String[] field_L;
    static String field_J;

    final static hd h() {
        return ei.field_d.field_yb;
    }

    final static void a(int param0, byte param1, int param2, String param3, int param4, int param5) {
        int var7_int = 15 + un.field_d.a(param3);
        pt.a(640, -22914, 630, 480, 0);
        on.a(-20 + (param5 - -160), -17 + param4, var7_int + 20, 21, 8, 65793, 128);
        try {
            ta.e(117);
            pt.a(640, -22914, param5 + 160, 480, 0);
            on.a(-20 + param5 + 160, -17 + param4, 20 + var7_int, 21, 8, 14492194, 110);
            ta.e(119);
            un.field_d.a(param3, 10 + (param5 + 160), param4, 13421772, -1);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "qq.A(" + 110 + 44 + -101 + 44 + 13421772 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + 14492194 + 41);
        }
    }

    public static void g(int param0) {
        if (param0 != 2356) {
            return;
        }
        field_K = null;
        field_F = null;
        field_H = null;
        field_L = null;
        field_G = null;
        field_J = null;
    }

    final void a(int param0, int param1) {
        super.a(108, param1);
        if (param0 <= 60) {
            return;
        }
        if (!(0 != param1)) {
            ql.a((byte) 58, true, dg.field_f);
        }
    }

    final static int g() {
        int var1 = 0;
        return tn.field_b;
    }

    qq() {
        super(25);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new kj(3);
        field_F = "<%0> might change the options - wait and see.";
        field_J = "AWAY <%1> - <%0>  HOME";
        field_L = new String[]{"Without Ball", "With Ball"};
    }
}
