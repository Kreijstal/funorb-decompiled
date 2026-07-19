/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh implements Runnable {
    d field_b;
    static dm[] field_h;
    volatile qk[] field_g;
    static String field_a;
    static int field_d;
    volatile boolean field_c;
    volatile boolean field_f;
    static long field_e;

    public static void a(int param0) {
        field_a = null;
        field_h = null;
        if (param0 < 82) {
            field_h = (dm[]) null;
        }
    }

    final static String a(byte param0) {
        String discarded$0 = null;
        if (mi.field_C < 2) {
            return j.field_lb;
        }
        if (!(dd.field_J == null)) {
            if (!dd.field_J.a(0)) {
                return ri.field_c;
            }
            return vc.field_g;
        }
        if (!l.field_h.a(0)) {
            return ff.field_l;
        }
        if (param0 >= -59) {
            discarded$0 = kh.a((byte) -7);
        }
        if (!l.field_h.a("commonui", (byte) -127)) {
            return wi.field_F + " - " + l.field_h.a(0, "commonui") + "%";
        }
        if (!(dc.field_c.a(0))) {
            return ik.field_b;
        }
        if (!dc.field_c.a("commonui", (byte) -125)) {
            return nb.field_a + " - " + dc.field_c.a(0, "commonui") + "%";
        }
        if (!hb.field_n.a(0)) {
            return ph.field_g;
        }
        if (!hb.field_n.b(true)) {
            return oj.field_e + " - " + hb.field_n.b((byte) 101) + "%";
        }
        return vg.field_d;
    }

    public final void run() {
        int var1_int = 0;
        qk var2 = null;
        int var4 = Geoblox.field_C;
        this.field_c = true;
        try {
            while (!this.field_f) {
                for (var1_int = 0; (var1_int ^ -1) > -3; var1_int++) {
                    var2 = this.field_g[var1_int];
                    if (var2 != null) {
                        var2.b();
                    }
                }
                bc.a(0, 10L);
                Object var5 = (Object) null;
                wj.a(this.field_b, (byte) 116, (Object) null);
            }
        } catch (Exception exception) {
            String var6 = (String) null;
            gi.a((Throwable) ((Object) exception), (String) null, (byte) 125);
        } finally {
            this.field_c = false;
        }
    }

    kh() {
        this.field_g = new qk[2];
        this.field_f = false;
        this.field_c = false;
    }

    static {
        field_h = new dm[10];
    }
}
