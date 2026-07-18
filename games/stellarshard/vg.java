/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vg extends id {
    static long[] field_t;
    static String field_q;
    static th field_p;
    static String field_s;
    static String field_r;

    public static void c(int param0) {
        field_s = null;
        field_t = null;
        field_q = null;
        field_p = null;
        field_r = null;
    }

    vg(int param0) {
        this(si.field_V, param0);
    }

    final static pb c() {
        int var4_int = 0;
        int var5 = stellarshard.field_B;
        int var1 = vc.field_b[0] * ih.field_d[0];
        byte[] var2 = ih.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = gj.field_w[sa.a(255, (int) var2[var4_int])];
        }
        pb var4 = new pb(nc.field_G, wd.field_b, ak.field_c[0], vi.field_c[0], vc.field_b[0], ih.field_d[0], var3);
        tb.f((byte) -73);
        return var4;
    }

    vg(bd param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_N, -1, 2147483647, false);
    }

    public final void a(boolean param0, int param1, int param2, rj param3, int param4) {
        try {
            if (param0) {
                nd.a(param3.field_p, param2 - -param3.field_k, param3.field_t, param3.field_w + param1, (byte) -103);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "vg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new long[32];
        field_q = "Return to game";
        field_s = "Last score: ";
        field_p = new th();
    }
}
