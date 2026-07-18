/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static int field_b;
    static int field_a;
    static String field_c;
    static String[] field_d;

    final static void a(int param0, int param1, oh[] param2, byte param3) {
        try {
            qm.field_b = new ve(param2);
            nc.field_d = 12;
            fa.field_d = 14;
            em.c(54);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "jj.A(" + 14 + ',' + 12 + ',' + (param2 != null ? "{...}" : "null") + ',' + -88 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 2) {
            field_d = null;
        }
    }

    final static void a(int param0, jb param1, jb param2, int param3) {
        try {
            uf.field_f = 480;
            dk.field_d = param1;
            cf.field_o = param2;
            rk.a(ra.field_e / 2, -33, ra.field_f / 2);
            gd.a(param2.field_u + param2.field_K, false, param1.field_K + param1.field_u, param1.field_u, param2.field_u);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "jj.B(" + 480 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + 2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 256;
        field_d = new String[16];
        field_c = "Your email address is used to identify this account";
    }
}
