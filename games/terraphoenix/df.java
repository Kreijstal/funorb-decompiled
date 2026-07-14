/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends eb {
    static fh field_K;
    static String field_M;
    static String field_L;

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        re.a(pb.field_b, (byte) -26, ok.field_j, hm.field_L, true, 0, param1);
        for (var2 = param0; var2 < pb.field_b; var2++) {
            pf.field_b[var2 - -param1] = var2;
        }
        re.a(pb.field_b + param1, (byte) -117, el.field_d, bd.field_a, false, param1, param1 + param1);
        if (!(pb.field_b <= param1)) {
            pb.field_b = param1;
        }
    }

    public static void f(byte param0) {
        field_L = null;
        field_M = null;
        field_K = null;
        if (param0 != -106) {
            field_M = null;
        }
    }

    private df(String param0, cj param1, sc param2) {
        super(param0, param1, param2);
        ((df) this).field_l = vc.field_c.field_q;
    }

    df(String param0, sc param1, boolean param2) {
        this(param0, param1);
        ((df) this).field_C = param2 ? true : false;
    }

    private df(String param0, sc param1) {
        this(param0, vc.field_c.field_n, param1);
        ((df) this).field_l = vc.field_c.field_q;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((df) this).field_C = !((df) this).field_C ? true : false;
        super.a(param0, param1, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "TAC-3";
    }
}
