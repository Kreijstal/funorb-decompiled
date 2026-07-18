/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends si {
    static ng field_L;
    static jd field_N;
    static int field_O;
    int field_H;
    static String[] field_I;
    static String field_K;
    static String field_J;
    static int field_M;

    public static void a() {
        field_L = null;
        field_N = null;
        field_K = null;
        field_J = null;
        field_I = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (!(((te) this).field_G != null)) {
            return;
        }
        if (((te) this).field_H == 0) {
            return;
        }
        if (!(((te) this).field_H != 256)) {
            ((te) this).field_G.a(param0 - -((te) this).field_j, param1, param2 - -((te) this).field_m, 0);
            return;
        }
        o var6 = new o(((te) this).field_G.field_t, ((te) this).field_G.field_x);
        cl.a(-119, var6);
        ((te) this).field_G.a(0, param1, 0, param3);
        mf.e(4096);
        var6.c(param2 - -((te) this).field_m, ((te) this).field_j + param0, ((te) this).field_H);
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = -1 + param1 & param2 >> 31;
        return (param2 - -(param2 >>> 31)) % param1 - -var3;
    }

    final static String d() {
        return vc.field_c;
    }

    public te() {
        super(0, 0, 0, 0, (j) null, (dg) null);
        ((te) this).field_H = 256;
    }

    te(rc param0) {
        super(param0.field_m, param0.field_j, param0.field_t, param0.field_x, (j) null, (dg) null);
        try {
            param0.b(((te) this).field_x, ((te) this).field_t, 0, 0, 0);
            ((te) this).field_H = 256;
            ((te) this).field_G = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) (Object) runtimeException, "te.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new ng();
        field_J = "Loading...";
    }
}
