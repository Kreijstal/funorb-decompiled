/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ig extends pc {
    static hc field_q;
    static nj[] field_r;

    ig(uc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_x, -1, 2147483647, false);
    }

    public static void b(int param0) {
        field_q = null;
        int var1 = 0;
        field_r = null;
    }

    public final void a(int param0, int param1, int param2, boolean param3, gm param4) {
        try {
            if (param3) {
                tk.a(param4.field_k + param1, param4.field_w + param2, param4.field_o, param4.field_p, false);
            }
            if (param0 < 89) {
                Object var7 = null;
                ((ig) this).a(-112, 5, -61, true, (gm) null);
            }
            super.a(117, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ig.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    ig(int param0) {
        this(dg.field_e, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new nj[29];
    }
}
