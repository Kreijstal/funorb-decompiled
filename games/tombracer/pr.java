/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr {
    private kda field_a;
    long field_c;
    private static String[] field_b;

    final static boolean a(int param0, int param1, int param2) {
        return uk.a(param2, (byte) -128, param0) & foa.a(param0, param2, 0);
    }

    protected final void finalize() throws Throwable {
        ((pr) this).field_a.a(((pr) this).field_c, -6115);
        super.finalize();
    }

    final static void a(int param0, String param1, String param2) {
        try {
            if (!(ci.field_l == null)) {
                ci.field_l.i((byte) 20);
            }
            vn.field_b = new jw(param1, param2, false, true, true);
            um.field_l.a(101, (ae) (Object) vn.field_b);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pr.A(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
    }

    pr(kda param0, long param1, int param2) {
        try {
            ((pr) this).field_a = param0;
            ((pr) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[2];
        field_b[0] = "2x2";
        field_b[1] = "3x3";
    }
}
