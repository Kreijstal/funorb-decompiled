/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    static om field_a;
    static String field_b;
    static long field_c;

    public static void a() {
        field_a = null;
        field_b = null;
    }

    final static String b() {
        if (!(fc.field_a >= 2)) {
            return ee.field_a;
        }
        if (nk.field_p != null) {
            if (nk.field_p.b(0)) {
                return gj.field_g;
            }
            return md.field_H;
        }
        if (!(ii.field_a.b(0))) {
            return ah.field_l;
        }
        if (!(ii.field_a.a(0, "commonui"))) {
            return sm.field_d + " - " + ii.field_a.a("commonui", 0) + "%";
        }
        if (!(w.field_ab.b(0))) {
            return c.field_o;
        }
        if (!(w.field_ab.a(0, "commonui"))) {
            return qf.field_h + " - " + w.field_ab.a("commonui", 0) + "%";
        }
        if (!pl.field_j.b(0)) {
            return ff.field_a;
        }
        if (!(pl.field_j.a((byte) -119))) {
            return wf.field_b + " - " + pl.field_j.a(-67) + "%";
        }
        return field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new om(12, 0, 1, 0);
        field_b = "Please wait...";
    }
}
