/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static um field_d;
    static String field_a;
    static boolean field_c;
    static ci field_b;
    static ci field_e;

    final static void a(byte param0) {
        dk.field_g = false;
        cf.field_Nb = false;
        uk.a(false, -1);
        g.field_a = ji.field_T;
        vl.field_A = ji.field_T;
        if (param0 <= 30) {
            field_a = null;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            ih.field_U = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            vm.a(var3, 11440, param0, var4, var2);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "bo.A(" + (param0 != null ? "{...}" : "null") + ',' + -12 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> wants to draw.";
        field_c = true;
    }
}
