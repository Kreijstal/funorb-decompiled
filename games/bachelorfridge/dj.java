/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static String field_a;
    static sna field_d;
    static gj field_c;
    static String field_b;

    public static void a(byte param0) {
        if (param0 != -75) {
            dj.a((byte) 111);
        }
        field_a = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    final static void a(int param0, boolean param1) {
        pf.field_n = !param1 ? new lm(hfa.field_B, nu.field_f) : new lm(dea.field_l, sr.field_b);
        ela.field_i = new sna(0L, (sna) null);
        ela.field_i.a(-1, (sna) (Object) pf.field_n.field_a);
        ela.field_i.a(param0 + -1, jj.field_wb);
        qw.field_b = new sna(0L, qaa.field_d);
        rf.field_q = new sna((long)param0, (sna) null);
        qw.field_b.a(-1, saa.field_f);
        qw.field_b.a(param0 + -1, rf.field_q);
        rf.field_q.a(-1, tv.field_o);
        rf.field_q.a(-1, vca.field_h);
        pv.a(param1, true);
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        if (!sl.a(param0, (byte) 125, param2)) {
            return false;
        }
        for (var3 = 0; var3 < param2.length(); var3++) {
            if (!(vu.a((byte) 117, param2.charAt(var3)))) {
                return false;
            }
        }
        if (param1 != -15437) {
            field_c = null;
            return true;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Open Fridge";
        field_b = "Only available to members.";
    }
}
