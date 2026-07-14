/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends vg {
    float field_j;
    static int field_i;
    int field_h;
    static jpa field_n;
    int field_l;
    int field_m;
    static String field_f;
    int field_k;
    int field_g;

    abstract void a(byte param0, int param1);

    public static void a(boolean param0) {
        field_f = null;
        field_n = null;
        if (param0) {
            field_f = null;
        }
    }

    final int b(byte param0) {
        if (param0 != 11) {
            ((ob) this).field_j = -0.5366194248199463f;
        }
        return ((ob) this).field_l;
    }

    abstract void a(byte param0, float param1);

    final static void a(ha param0, int param1) {
        int var2 = 0;
        int[] var15 = null;
        int[] var14 = null;
        int[] var13 = null;
        int[] var12 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = TombRacer.field_G ? 1 : 0;
        tp.field_K = su.a(rva.field_v, param0, (byte) 127);
        la.field_p = new nh[6][];
        if (param1 != 17186) {
            return;
        }
        for (var2 = 0; (var2 ^ -1) > -7; var2++) {
            la.field_p[var2] = ak.a(param0, eta.field_a[var2], -82);
        }
        ng.field_k = new nh[6];
        em.field_h = new nh[6];
        for (var2 = 0; (var2 ^ -1) > -7; var2++) {
            ng.field_k[var2] = su.a(lm.field_p[var2], param0, (byte) -68);
            lm.field_p[var2].b();
            em.field_h[var2] = su.a(lm.field_p[var2], param0, (byte) 125);
            lm.field_p[var2].b();
        }
        ik.field_h = su.a(dna.field_F, param0, (byte) 127);
        dr.field_a = ak.a(param0, bp.field_p, -79);
        bd.field_i = su.a(ara.field_vb, param0, (byte) -20);
        lm.field_m = su.a(tla.field_g, param0, (byte) -99);
        po.field_l = su.a(wd.field_c, param0, (byte) 25);
        lh.field_b = su.a(lha.field_l, param0, (byte) 127);
        vua.field_A = su.a(wj.field_a, param0, (byte) 126);
        dn.field_d = ak.a(param0, qb.field_e, -100);
        ufa.field_r = ak.a(param0, via.field_a, param1 ^ -17261);
        bm.field_f = ak.a(param0, gda.field_d, -112);
        ega.field_e = su.a(nm.field_i, param0, (byte) 126);
        tv.field_wb = su.a(lt.field_a, param0, (byte) 127);
        sta.field_y = ak.a(param0, ina.field_c, -104);
        kq.field_a = su.a(bha.field_C, param0, (byte) 127);
        id.field_h = ak.a(param0, tba.field_f, -70);
        lva.field_m = ak.a(param0, ng.field_f, -77);
        nh discarded$0 = su.a(ds.field_g, param0, (byte) 126);
        za.field_g = su.a(jga.field_b, param0, (byte) -50);
        bca.field_d = su.a(sla.field_a, param0, (byte) -38);
        rm.field_c = su.a(gv.field_s, param0, (byte) 126);
        uda.field_r = su.a(aa.field_a, param0, (byte) 125);
        je.field_E = su.a(pha.field_Bb, param0, (byte) -119);
        eu.field_a = su.a(ira.field_t, param0, (byte) -5);
        pq.field_a = su.a(qh.field_q, param0, (byte) 28);
        uta.field_d = su.a(tl.field_n, param0, (byte) 127);
        cb.field_i = ak.a(param0, ga.field_F, -67);
        qf.field_k = new nh[cb.field_i.length];
        for (var2 = 0; cb.field_i.length > var2; var2++) {
            var15 = ga.field_F[var2].e();
            var14 = var15;
            var13 = var14;
            var12 = var13;
            var3 = var12;
            for (var4 = 0; var15.length > var4; var4++) {
                var5 = var15[var4] >> -616314664 & 255;
                var6 = var15[var4] & 255;
                var7 = (65319 & var15[var4]) >> -1076656792;
                var8 = (var15[var4] & 16752521) >> 824277904;
                var9 = (int)(0.3 * (double)var8 + (0.59 * (double)var7 + 0.11 * (double)var6));
                var10 = var9 + ((var9 << 1558099312) + (var9 << -1697174200));
                var3[var4] = fh.a(var5 << 824001336, var10);
            }
            qf.field_k[var2] = param0.a(var3, cb.field_i[var2].c(), 89, cb.field_i[var2].a(), cb.field_i[var2].a(), 0);
        }
        bsa.field_i = su.a(hoa.field_l, param0, (byte) -107);
        fa.field_a = ak.a(param0, nk.field_k, -99);
        nc.field_e = su.a(hka.field_c, param0, (byte) -15);
        uua.field_a = su.a(qk.field_u, param0, (byte) 125);
        nh discarded$1 = su.a(mp.field_d, param0, (byte) 126);
        nh discarded$2 = su.a(baa.field_g, param0, (byte) -43);
        fra.field_q = su.a(op.field_O, param0, (byte) 126);
        ij.field_X = su.a(ifa.field_q, param0, (byte) 125);
        nh discarded$3 = su.a(field_n, param0, (byte) 125);
        gg.field_f = su.a(vua.field_y, param0, (byte) 127);
        eca.field_c = ak.a(param0, up.field_e, -64);
        nm.field_l = su.a(ena.field_l, param0, (byte) 127);
        nh discarded$4 = su.a(aw.field_F, param0, (byte) -2);
        gca.field_a = su.a(rp.field_f, param0, (byte) 126);
        ng.field_b = ak.a(param0, qka.field_o, param1 + -17309);
        vna.field_c = su.a(ko.field_j, param0, (byte) -95);
        tka.field_p = su.a(ht.field_Db, param0, (byte) 27);
        ep.field_n = su.a(oea.field_j, param0, (byte) -37);
        wh.field_y = su.a(cn.field_h, param0, (byte) 127);
        haa.field_z = su.a(re.field_a, param0, (byte) 126);
        aq.field_a = ak.a(param0, mna.field_c, -55);
        mc.field_r = su.a(fm.field_h, param0, (byte) 127);
        dp.field_d = ri.a(param0, (byte) -105, haa.field_A.field_f);
        la.field_j = ri.a(param0, (byte) -104, du.field_c.field_f);
    }

    final int c(int param0) {
        if (param0 > -111) {
            field_i = -124;
        }
        return ((ob) this).field_g;
    }

    abstract void a(int param0, int param1);

    final int a(byte param0) {
        int var2 = 76 / ((param0 - 31) / 54);
        return ((ob) this).field_h;
    }

    final int d(int param0) {
        if (param0 != 13437) {
            return 104;
        }
        return ((ob) this).field_k;
    }

    abstract void a(int param0, int param1, byte param2, int param3);

    ob(int param0, int param1, int param2, int param3, int param4, float param5) {
        ((ob) this).field_m = param1;
        ((ob) this).field_k = param0;
        ((ob) this).field_l = param2;
        ((ob) this).field_j = param5;
        ((ob) this).field_g = param4;
        ((ob) this).field_h = param3;
    }

    final float b(int param0) {
        if (param0 != 0) {
            return -0.41912034153938293f;
        }
        return ((ob) this).field_j;
    }

    final int a(int param0) {
        if (param0 != 19848) {
            return -116;
        }
        return ((ob) this).field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Send private Quick Chat to <%0>";
    }
}
