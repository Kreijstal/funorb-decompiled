/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa {
    static nf[] field_b;
    static String field_a;

    final static void a(boolean param0) {
        if (!(null == fj.field_u)) {
            c.a(true, fj.field_u);
            fj.field_u = null;
            am.g(-4258);
        }
        ka.field_N = cc.a(1, -14245);
        gj.field_a = cc.a(2, -14245);
        i.field_u = cc.a(3, -14245);
        gl.field_j = cc.a(4, -14245);
        ih.field_d = cc.a(5, -14245);
        ul.field_U = cc.a(12, -14245);
        oj.field_C = cc.a(6, -14245);
        jd.field_b = cc.a(7, -14245);
        v.field_Bb = cc.a(8, -14245);
        mn.field_b = cc.a(9, -14245);
        dg.field_n = new ad(50);
        dg.field_n.a(false, fi.field_b, dl.field_a, pb.field_e, "basic");
        dg.field_n.a((byte) -6, ka.field_N, un.field_b, ak.field_P);
        dg.field_n.a((byte) -6, gj.field_a, d.field_f, jl.field_n);
        dg.field_n.a((byte) -6, i.field_u, d.field_f, jl.field_n);
        dg.field_n.a((byte) -6, gl.field_j, d.field_f, jl.field_n);
        dg.field_n.a((byte) -6, ih.field_d, fi.field_b, dl.field_a);
        dg.field_n.a((byte) -6, ul.field_U, pb.field_a, qf.field_d);
        dg.field_n.a((byte) -6, oj.field_C, mn.field_g, vk.field_x);
        dg.field_n.a((byte) -6, jd.field_b, sd.field_g, af.field_U);
        dg.field_n.a((byte) -6, v.field_Bb, sd.field_g, af.field_U);
        dg.field_n.a((byte) -6, mn.field_b, uc.field_cb, ug.field_bb);
    }

    final static bn a(byte param0) {
        int var1 = 0;
        return new bn(qj.a(1), fa.a((byte) -69));
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 6) {
            return;
        }
        field_b = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 >= -98) {
            field_a = null;
            wl.a(-78, param1, false);
            return;
        }
        wl.a(-78, param1, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Retry";
    }
}
