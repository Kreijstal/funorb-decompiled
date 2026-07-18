/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    static wf field_d;
    static int[] field_c;
    static int field_f;
    static String field_a;
    static boolean field_b;
    static de field_g;
    static int field_e;

    final static void a(boolean param0, int param1) {
        if (!(null == lf.field_b)) {
            lf.field_b.a(param0, 256);
        }
    }

    final static void a(int param0, byte param1, int param2) {
        bc var3 = null;
        if (param1 <= 94) {
            Object var4 = null;
            uf.a((String) null, false, false);
            var3 = nd.field_Lb;
            var3.f(param0, (byte) -92);
            var3.a(3, false);
            var3.a(8, false);
            var3.b(param2, false);
            return;
        }
        var3 = nd.field_Lb;
        var3.f(param0, (byte) -92);
        var3.a(3, false);
        var3.a(8, false);
        var3.b(param2, false);
    }

    final static void a(int param0, String param1, long param2) {
        CharSequence var5 = null;
        try {
            sf.field_d = 2;
            ka.field_m = param1;
            var5 = (CharSequence) (Object) param1;
            qj.field_a = cc.a(var5, (byte) 101);
            vj.field_o = param2;
            hi.a(97);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "uf.A(" + -127 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(String param0, boolean param1, boolean param2) {
        try {
            sn.field_b = param2;
            s.field_f = true;
            fl.field_u = new lk(mf.field_s, ab.field_V, param0, qa.field_v, sn.field_b);
            mf.field_s.a((na) (Object) fl.field_u, param1);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "uf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_g = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unable to delete name - system busy";
        field_e = 0;
    }
}
