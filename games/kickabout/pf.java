/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pf {
    static ot field_b;
    static String field_a;
    static r field_e;
    static int[] field_d;
    static boolean field_c;

    abstract byte[] a(int param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, dl param1, byte param2) {
        ml var4 = null;
        try {
            int var3_int = 84;
            var4 = or.field_d;
            var4.b(5, (byte) -80);
            var4.a(125, 2);
            var4.a(119, 0);
            var4.a(108, param1.field_e);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pf.A(" + 5 + ',' + (param1 != null ? "{...}" : "null") + ',' + -114 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    final static void a(iw param0, int param1) {
        int var2_int = 0;
        try {
            pl.field_d = param0.a((byte) 81) << 5;
            var2_int = param0.h((byte) -125);
            pl.field_d = pl.field_d + (var2_int >> 3);
            df.field_E = 1835008 & var2_int << 18;
            df.field_E = df.field_E + (param0.a((byte) 81) << 2);
            var2_int = param0.h((byte) -126);
            io.field_j = 2064384 & var2_int << 15;
            df.field_E = df.field_E + (var2_int >> 6);
            io.field_j = io.field_j + (param0.h((byte) -106) << 7);
            var2_int = param0.h((byte) -105);
            io.field_j = io.field_j + (var2_int >> 1);
            lr.field_r = (var2_int & 1) << 16;
            lr.field_r = lr.field_r + param0.a((byte) 81);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "pf.E(" + (param0 != null ? "{...}" : "null") + ',' + 542439655 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> and <%1> have equal game stats. <%2> wins the tournament by a random 50/50 chance.";
        field_e = new r();
        field_c = true;
    }
}
