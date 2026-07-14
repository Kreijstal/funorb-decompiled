/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sl extends qm {
    static gb field_p;
    static wp[] field_o;
    static String field_q;
    static String field_n;

    public static void b(int param0) {
        field_p = null;
        field_q = null;
        int var1 = 7 % ((param0 - -58) / 61);
        field_n = null;
        field_o = null;
    }

    sl(hc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, ((hc) param0).field_I, -1, 2147483647, false);
    }

    final static void c(int param0) {
        if (param0 != 2765) {
            return;
        }
        wo var1 = (wo) bo.field_i.b(4095);
        if (!(var1 != null)) {
            throw new IllegalStateException();
        }
        vp.a(((wo) var1).field_g, ((wo) var1).field_f, ((wo) var1).field_p);
        vp.e(((wo) var1).field_m, ((wo) var1).field_k, ((wo) var1).field_i, ((wo) var1).field_j);
        var1.field_g = null;
        pu.field_b.a(99, (wf) (Object) var1);
    }

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        if (!(!param0)) {
            nn.a(((ea) param3).field_h + param4, (byte) 70, ((ea) param3).field_p + param2, ((ea) param3).field_q, ((ea) param3).field_n);
        }
        this.a(param0, param1, param2, param3, param4);
    }

    sl(int param0) {
        this(qo.field_b, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new gb(1.0, 15, 1, 100, 2, 7.0, 10.0, 16, 0);
        field_q = "Mouse over an icon for details";
        field_n = "Please try again in a few minutes.";
    }
}
