/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static wj[] field_a;
    static int field_b;

    abstract jh b(byte param0);

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, byte param1);

    final static void a(vn[] param0, byte param1) {
        int var2 = 0;
        int var3 = ZombieDawn.field_J;
        ni.field_b = param0;
        nf.field_d = new vn(55, 130);
        if (param1 >= -58) {
            return;
        }
        nf.field_d.a();
        ni.field_b[2].h(5, -5, 16777215);
        ni.field_b[3].h(5, -5, 16777215);
        bi.h(4, 4, 0, 0, bi.field_f, bi.field_a);
        ni.field_b[2].h(5, -5, 0);
        ni.field_b[3].h(5, -5, 0);
        mk.field_a = new vn[16];
        qp.field_c = new vn[mk.field_a.length];
        for (var2 = 0; var2 < mk.field_a.length; var2++) {
            mk.field_a[var2] = new vn(200, 25);
            mk.field_a[var2].a();
            bj.field_q.a(qp.a(var2, 90), 100, 17, 16777215, -1);
            qp.field_c[var2] = so.a(mk.field_a[var2]);
        }
        al.field_f = ul.a(false, tg.field_c);
        fk.field_K = ul.a(false, gj.field_m);
        tb.field_G = ul.a(false, km.field_b);
        rc.field_v = ul.a(false, hc.field_a);
        hn.field_h = so.a(al.field_f);
        cn.field_i = so.a(fk.field_K);
        md.field_tb = so.a(tb.field_G);
        eb.field_b = so.a(rc.field_v);
        cn.field_f.b(115);
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -98) {
            Object var2 = null;
            w.a((vn[]) null, (byte) -72);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wj[14];
    }
}
