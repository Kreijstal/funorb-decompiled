/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr {
    static jp field_c;
    static volatile int field_a;
    static jp[] field_d;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        if (param0 <= 109) {
            gr.b(47, 0);
        }
        field_c = null;
    }

    final static byte[] a(boolean param0, String param1) {
        if (!param0) {
            field_c = null;
        }
        return hq.field_t.a(-61, "", param1);
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = BrickABrac.field_J ? 1 : 0;
        ti.a(rn.field_l, pe.field_u, wi.field_m, true, 97, param1, 0);
        if (param0 != 12429) {
            gr.a(22, -5);
        }
        for (var2 = 0; var2 < wi.field_m; var2++) {
            fj.field_Pb[var2 + param1] = var2;
        }
        ti.a(uf.field_b, ba.field_w, param1 + wi.field_m, false, 118, param1 + param1, param1);
        if (param1 < wi.field_m) {
            wi.field_m = param1;
        }
    }

    final static void b(int param0, int param1) {
        tn.field_C = param0;
        if (-2 != (tn.field_C ^ -1)) {
            a.field_s = ln.field_j;
            jc.field_J = mh.field_ib;
            tf.field_c = kp.field_e;
            field_c = p.field_i;
            vn.field_w = cq.field_o;
            we.field_b = ch.field_k;
            bq.field_e = hc.field_a;
            gg.field_o = ep.field_j;
            nj.field_l = mf.field_a;
            fq.field_d = ol.field_z;
        } else {
            bq.field_e = ip.field_v;
            a.field_s = hp.field_l;
            tf.field_c = dg.field_b;
            vn.field_w = dg.field_e;
            jc.field_J = vn.field_D;
            gg.field_o = dk.field_R;
            nj.field_l = pa.field_m;
            fq.field_d = qg.field_D;
            we.field_b = gg.field_p;
            field_c = re.field_k;
        }
        if (param1 != -28463) {
            field_a = -38;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_b = "<%0> has dropped out.";
    }
}
