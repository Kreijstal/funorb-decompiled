/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static int field_b;
    static int field_a;
    static String field_c;
    static String[] field_d;

    final static void a(int param0, int param1, oh[] param2, byte param3) {
        if (param3 != -88) {
            return;
        }
        try {
            qm.field_b = new ve(param2);
            nc.field_d = param1;
            fa.field_d = param0;
            em.c(54);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "jj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        if (param0 != 2) {
            field_d = (String[]) null;
        }
    }

    final static void a(int param0, jb param1, jb param2, int param3) {
        try {
            uf.field_f = param0;
            dk.field_d = param1;
            cf.field_o = param2;
            rk.a(ra.field_e / param3, -33, ra.field_f / 2);
            gd.a(param2.field_u + param2.field_K, false, param1.field_K + param1.field_u, param1.field_u, param2.field_u);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "jj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_a = 256;
        field_d = new String[16];
        field_c = "Your email address is used to identify this account";
    }
}
