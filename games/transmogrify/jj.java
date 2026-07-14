/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static oj field_a;
    static String[] field_b;
    static int[][] field_c;

    public static void a(int param0) {
        if (param0 != 96) {
            Object var2 = null;
            od discarded$0 = jj.a((byte) 74, -122, (hb) null);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final static od a(byte param0, int param1, hb param2) {
        if (param0 <= 69) {
            return null;
        }
        return ic.a(bb.b(param2, 100, 96, param1), 4);
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = Transmogrify.field_A ? 1 : 0;
        vg.a(param1, cg.field_l, true, true, ua.field_d, 0, rc.field_c);
        for (var2 = 0; var2 < cg.field_l; var2++) {
            lk.field_d[var2 - -param1] = var2;
        }
        vg.a(param1 + param1, param1 + cg.field_l, true, false, ue.field_a, param1, vb.field_a);
        var2 = 60 / ((param0 - 80) / 34);
        if (cg.field_l > param1) {
            cg.field_l = param1;
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        hd.field_b = param0 ? true : false;
        aa.field_g = true;
        wg.field_d = new ik(ci.field_f, rh.field_q, param1, lb.field_d, hd.field_b);
        ci.field_f.b((qg) (Object) wg.field_d, (byte) -71);
        if (param2 != 1702) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    }
}
