/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends gf {
    static String field_ib;
    static int field_gb;
    static java.applet.Applet field_jb;
    static String field_hb;

    s(i param0, rc param1) {
        super(param0, param1, 33, 20, 30);
    }

    final void c(int param0, rc param1) {
        try {
            if (param0 != -3399) {
                Object var4 = null;
                ((s) this).c(-9, (rc) null);
            }
            super.c(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "s.NA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void m(int param0) {
        field_ib = null;
        field_hb = null;
        field_jb = null;
    }

    final static String o(int param0) {
        String var1 = "";
        if (!(ve.field_a == null)) {
            var1 = ve.field_a.j(-19569);
        }
        int var2 = -90 % ((param0 - 58) / 51);
        if (var1.length() == 0) {
            var1 = qe.a((byte) 127);
        }
        if (!(var1.length() != 0)) {
            var1 = je.field_a;
        }
        return var1;
    }

    final static void n(int param0) {
        if (!(null == kj.field_P)) {
            kj.field_P.a();
        }
        if (null != ql.field_r) {
            ql.field_r.a();
            return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = 0;
        field_ib = null;
    }
}
