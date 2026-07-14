/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r implements dk {
    static qc field_b;
    private long field_f;
    static int field_e;
    static oi field_d;
    static String field_c;
    static int field_a;

    final static o[] a(int param0, kl param1, int param2, int param3) {
        if (param2 != 13469) {
            return null;
        }
        if (!h.a(param3, param0, param1, -120)) {
            return null;
        }
        return dc.a(19999);
    }

    public final ok a(boolean param0) {
        if (((r) this).b(7245)) {
            return va.field_o;
        }
        if (!(d.a((byte) 25) >= ((r) this).field_f - -350L)) {
            return nf.field_c;
        }
        if (!param0) {
            field_b = null;
        }
        return ((r) this).b(true);
    }

    abstract String b(byte param0);

    abstract ok b(boolean param0);

    final static void c(int param0) {
        int var3 = 0;
        int var4 = wizardrun.field_H;
        o var1 = new o(540, 140);
        ud.a(var1, false);
        cj.c();
        ed.d();
        jd.field_f = 0;
        gf.k(param0 ^ -301);
        o var2 = var1.e();
        for (var3 = 0; (var3 ^ -1) > -16; var3++) {
            var2.b(-2, -2, 16777215);
            ed.c(4, 4, 0, 0, 540, 140);
        }
        ag.field_t.b();
        var1.a(0, 0);
        if (param0 != 350) {
            field_a = 72;
        }
        bb.b(4);
    }

    public final String a(int param0) {
        if (param0 != -2864) {
            ok discarded$0 = ((r) this).a(false);
        }
        if (((r) this).b(7245)) {
            return null;
        }
        if ((((r) this).field_f - -350L ^ -1L) < (d.a((byte) 29) ^ -1L)) {
            return null;
        }
        return ((r) this).b((byte) -82);
    }

    public static void d(int param0) {
        field_d = null;
        field_c = null;
        field_b = null;
        if (param0 < 105) {
            r.d(-68);
        }
    }

    public final void a(byte param0) {
        if (param0 >= -59) {
            return;
        }
        ((r) this).field_f = d.a((byte) 31);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new oi();
        field_c = "Use the arrow keys to move.";
    }
}
