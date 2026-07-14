/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so {
    static String field_e;
    private to field_a;
    static ke field_f;
    static int field_b;
    static fk field_d;
    private mf field_g;
    private mf field_c;

    final static pb a(int param0, int param1, int param2, vl param3) {
        pb var4_ref = null;
        pb var4 = null;
        if (param0 != 0) {
            Object var6 = null;
            pb discarded$0 = so.a(8, 113, -81, (vl) null);
        }
        pb var5 = (pb) (Object) param3.d(-15);
        while (var5 != null) {
            if (!(!var5.a((byte) -84, param1, param2))) {
                var4 = var5;
                break;
            }
            var5 = (pb) (Object) param3.a((byte) 116);
        }
        if (var4 == null) {
            var4_ref = (pb) (Object) param3.a(127);
        }
        param3.a(true, (nm) (Object) var4_ref);
        return var4_ref;
    }

    public static void b(byte param0) {
        int var1 = 22 % ((param0 - 19) / 35);
        field_d = null;
        field_e = null;
    }

    final static int a(byte param0) {
        if (param0 != -35) {
            return 43;
        }
        return gr.field_a;
    }

    final kn a(int param0, byte param1) {
        byte[] var4 = null;
        kn var3 = (kn) ((so) this).field_a.a((long)param0, true);
        if (var3 != null) {
            return var3;
        }
        if (param0 < 32768) {
            var4 = ((so) this).field_g.a(param0, 0, 4);
        } else {
            var4 = ((so) this).field_c.a(32767 & param0, 0, 4);
        }
        kn var3_ref = new kn();
        if (!(var4 == null)) {
            var3_ref.a(new wq(var4), -29539);
        }
        if (!(-32769 < (param0 ^ -1))) {
            var3_ref.c((byte) -124);
        }
        int var5 = -120 % ((param1 - 22) / 49);
        ((so) this).field_a.a(72, (Object) (Object) var3_ref, (long)param0);
        return var3_ref;
    }

    final static void a(mf param0, mf param1, mf param2, int param3, mf param4) {
        int var7_int = 0;
        int var10_int = 0;
        jp var11_ref = null;
        int var11 = 0;
        int var12 = BrickABrac.field_J ? 1 : 0;
        lf.field_t = uo.a((byte) 29, param0, "splash", "basic");
        er.field_b = pl.a("basic", "lobby_game_logo", (byte) 110, param0);
        byte[] var25 = param2.a(-86, "basic", "gamefont");
        byte[] var23 = var25;
        byte[] var21 = var23;
        byte[] var15 = var21;
        byte[] var13 = var15;
        byte[] var5 = var13;
        tp[] var16 = wq.a("basic", param0, "gamefont", param3 + -946744493);
        sn.a(param3 ^ 29068, var25, 1);
        ma.field_O = fc.a(0, var25, 0, var16, 0, 1);
        ma.field_O.field_M = bg.field_n;
        nn.field_g = fc.a(2, var25, 0, var16, 0, 1);
        nn.field_g.field_M = bg.field_n;
        byte[] var26 = param4.a(86, "kartika13", "");
        byte[] var24 = var26;
        byte[] var22 = var24;
        byte[] var17 = var22;
        byte[] var14 = var17;
        var5 = var14;
        tp[] var18 = wq.a("kartika13", param1, "", -946715356);
        ob.field_D = fc.a(0, var26, 0, var18, 0, 1);
        ob.field_D.field_M = bg.field_n;
        ce.field_e = fc.a(1, var26, 0, var18, 0, 1);
        ce.field_e.field_M = bg.field_n;
        gj.field_c = bd.a("basic", "menu_overlays", param0, (byte) -8);
        for (var7_int = 0; gj.field_c.length > var7_int; var7_int++) {
            gj.field_c[var7_int] = qg.a(gj.field_c[var7_int], 1);
            if (-1 != (gj.field_c[var7_int].field_D ^ -1)) {
                // if_icmpeq L299
            } else {
                gj.field_c[var7_int] = null;
            }
        }
        cd.field_h = kf.a("frame", "basic", param0, -122);
        t.field_d = kf.a("frame_track", "basic", param0, -128);
        t.field_d[4] = null;
        jp[] var7 = cd.field_h;
        var7[4] = null;
        jp discarded$0 = pl.a("basic", "frame_bracket", (byte) 106, param0);
        af.field_A = kf.a("button_frame", "basic", param0, -91);
        vn.field_G = kf.a("button_raised", "basic", param0, 103);
        pe.field_k = kf.a("button_depressed", "basic", param0, -104);
        si.field_c = wq.a("basic", param0, "achievements_large", -946715356);
        vq.field_F = pl.a("basic", "unachieved", (byte) 97, param1);
        pg.field_p = pl.a("basic", "orbcoin", (byte) 122, param1);
        jp discarded$1 = pl.a("basic", "locked", (byte) -45, param1);
        nj.field_z = new jp(32, 32);
        nj.field_z.g();
        pg.field_p.c(0, 0, 32, 32);
        kc.field_q.a((byte) 91);
        pg.field_p = null;
        jp var19 = new jp(vq.field_F.field_x / 4, vq.field_F.field_z / 4);
        var19.g();
        vq.field_F.e(0, 0);
        kc.field_q.a((byte) 113);
        bf.field_L = p.a(-12, var19, 8, 9838226);
        qh.field_c = p.a(-12, var19, 12, 9838226);
        Object var8 = null;
        e.field_l = new jp[si.field_c.length];
        pa.field_h = new jp[si.field_c.length];
        jp var20 = new jp(vq.field_F.field_x / 4, vq.field_F.field_z / 4);
        for (var10_int = 0; (var10_int ^ -1) > (si.field_c.length ^ -1); var10_int++) {
            var20.g();
            lb.d();
            si.field_c[var10_int].c(0, 0);
            kc.field_q.a((byte) 101);
            e.field_l[var10_int] = p.a(-12, var20, 8, 9838226);
            pa.field_h[var10_int] = p.a(pn.a(param3, -29147), var20, 12, 9838226);
        }
        no.field_t = new jp[lo.field_c.length][];
        Object var9 = null;
        for (var10_int = 0; (lo.field_c.length ^ -1) < (var10_int ^ -1); var10_int++) {
            no.field_t[var10_int] = cr.a("basic", param0, lo.field_c[var10_int], 2);
        }
        re.field_k = pl.a("basic", "ball", (byte) 121, param0);
        vn.field_D = pl.a("basic", "steelball", (byte) 98, param0);
        h.field_C = wq.a("basic", param0, "brickset", -946715356);
        dg.field_b = cr.a("basic", param0, "paddlecaps", param3 + -29135);
        qg.field_D = cr.a("basic", param0, "paddleseg", 2);
        dk.field_R = pl.a("basic", "paddlecentre", (byte) 100, param0);
        gg.field_p = cr.a("basic", param0, "powerup", 2);
        ol.field_r = pl.a("basic", "powerupbar", (byte) 104, param0);
        ch.field_l = pl.a("basic", "heart", (byte) -108, param0);
        kb.field_Ub = cr.a("basic", param0, "characters_fm", 2);
        im.field_a = cr.a("basic", param0, "lever_game", param3 + -29135);
        nm.field_f = cr.a("basic", param0, "eyes_game", 2);
        tf.field_g = cr.a("basic", param0, "track_heads", 2);
        ef.field_e = cr.a("basic", param0, "characters_small", 2);
        ul.field_k = cr.a("basic", param0, "character_heads", param3 ^ 29139);
        cn.field_e = cr.a("basic", param0, "lever_small", 2);
        ul.field_r = cr.a("basic", param0, "lever_small_choc", 2);
        lp.field_yb = cr.a("basic", param0, "lever_small_space", param3 ^ 29139);
        qi.field_K = kf.a("frame_bubble", "basic", param0, -105);
        ap.field_a = pl.a("basic", "frame_bubble_point", (byte) -120, param0);
        ln.field_j = bd.a("basic", "rosette_sml", param0, (byte) -8);
        hp.field_l = bd.a("basic", "rosette_lrg", param0, (byte) -8);
        me.field_a = wq.a("basic", param0, "podium2", -946715356);
        pl.field_f = wq.a("basic", param0, "podium3", param3 ^ -946719499);
        cl.field_r = cr.a("basic", param0, "podium_happy", 2);
        e.field_q = cr.a("basic", param0, "podium_sad", param3 ^ 29139);
        qh.field_e = um.a("basic", "congratulations", 1593955777, param0);
        pa.field_m = new jp[h.field_C.length];
        for (var10_int = 0; var10_int < pa.field_m.length; var10_int++) {
            pa.field_m[var10_int] = h.field_C[var10_int].a();
        }
        pa.field_m[24].g();
        lb.a(0, 0, lb.field_c, lb.field_d);
        mf.field_a = new jp[pa.field_m.length];
        for (var10_int = 0; var10_int < pa.field_m.length; var10_int++) {
            mf.field_a[var10_int] = new jp(pa.field_m[var10_int].field_x / 2, pa.field_m[var10_int].field_z / 2);
            mf.field_a[var10_int].g();
            pa.field_m[var10_int % 29].a(0, 0);
        }
        kp.field_e = new jp[dg.field_b.length];
        for (var10_int = 0; dg.field_b.length > var10_int; var10_int++) {
            kp.field_e[var10_int] = new jp(dg.field_b[var10_int].field_x / 2, dg.field_b[var10_int].field_z / 2);
            kp.field_e[var10_int].g();
            dg.field_b[var10_int].a(0, 0);
        }
        ol.field_z = new jp[qg.field_D.length];
        for (var10_int = 0; qg.field_D.length > var10_int; var10_int++) {
            ol.field_z[var10_int] = new jp(qg.field_D[var10_int].field_x / 2, qg.field_D[var10_int].field_z / 2);
            ol.field_z[var10_int].g();
            qg.field_D[var10_int].a(0, 0);
        }
        ep.field_j = new jp(dk.field_R.field_x / 2, dk.field_R.field_z / 2);
        ep.field_j.g();
        dk.field_R.a(0, 0);
        p.field_i = new jp(re.field_k.field_x / 2, re.field_k.field_z / 2);
        p.field_i.g();
        re.field_k.a(0, 0);
        mh.field_ib = new jp(vn.field_D.field_x / 2, vn.field_D.field_z / 2);
        mh.field_ib.g();
        vn.field_D.a(0, 0);
        ch.field_k = new jp[gg.field_p.length];
        if (param3 != 29137) {
            int discarded$2 = so.a((byte) -25);
        }
        for (var10_int = 0; (ch.field_k.length ^ -1) < (var10_int ^ -1); var10_int++) {
            ch.field_k[var10_int] = new jp(gg.field_p[var10_int].field_x / 2, gg.field_p[var10_int].field_z / 2);
            ch.field_k[var10_int].g();
            gg.field_p[var10_int].a(0, 0);
        }
        kc.field_q.a((byte) 79);
        for (var10_int = 0; var10_int < ln.field_j.length; var10_int++) {
            ln.field_j[var10_int].d();
        }
        for (var10_int = 0; hp.field_l.length > var10_int; var10_int++) {
            hp.field_l[var10_int].d();
        }
        um.field_p = pl.a("basic", "character_menu", (byte) -62, param0);
        pa.field_j = pl.a("basic", "character_menu_eyes", (byte) -120, param0);
        gr.field_d = cr.a("basic", param0, "lever_menu", 2);
        nl.field_b = um.a("basic", "logo", 1593955777, param0);
        g.field_l = cr.a("basic", param0, "sliders", 2);
        mp.field_Vb = cr.a("basic", param0, "arrow_level", param3 ^ 29139);
        pa.field_l = new jp[mp.field_Vb.length];
        for (var10_int = 0; mp.field_Vb.length > var10_int; var10_int++) {
            pa.field_l[var10_int] = mp.field_Vb[var10_int].e();
            var11_ref = mp.field_Vb[var10_int].e();
            var11_ref.b();
        }
        un.field_e = new tp[7];
        un.field_e[0] = uo.a((byte) 29, param0, "p1_key_right", "basic");
        un.field_e[1] = uo.a((byte) 29, param0, "p1_key_left", "basic");
        un.field_e[2] = uo.a((byte) 29, param0, "p1_key_launch", "basic");
        un.field_e[3] = uo.a((byte) 29, param0, "p2_key_right", "basic");
        un.field_e[4] = uo.a((byte) 29, param0, "p2_key_left", "basic");
        un.field_e[5] = uo.a((byte) 29, param0, "p2_key_launch", "basic");
        un.field_e[6] = uo.a((byte) 29, param0, "key_enter", "basic");
        nd.field_f = new int[58];
        for (var10_int = 0; (nd.field_f.length ^ -1) < (var10_int ^ -1); var10_int++) {
            nd.field_f[var10_int] = 14;
        }
        jk.field_u = lg.a(2, mo.field_N, -1);
        v.field_b = lg.a(2, ci.field_s.toUpperCase(), -1);
        ed.field_b = new jp[3];
        for (var10_int = 0; (var10_int ^ -1) > (ed.field_b.length ^ -1); var10_int++) {
            ed.field_b[var10_int] = fp.a(2, 2, Integer.toString(-var10_int + 3), true);
        }
        rn.field_a = new jp[tf.field_g.length];
        for (var10_int = 0; rn.field_a.length > var10_int; var10_int++) {
            rn.field_a[var10_int] = p.a(pn.a(param3, -29147), tf.field_g[var10_int], 14, 16755200);
        }
        lk.field_n = new jp[tf.field_g.length];
        for (var10_int = 0; (var10_int ^ -1) > (lk.field_n.length ^ -1); var10_int++) {
            lk.field_n[var10_int] = pg.a(tf.field_g[var10_int], 20, pn.a(param3, -13351));
        }
        rk.field_Sb = ap.field_a.e();
        rk.field_Sb.b();
        dg.field_e = pl.a("basic", "shutter", (byte) 110, param0);
        cq.field_o = new jp(dg.field_e.field_x / 2, dg.field_e.field_z / 2);
        cq.field_o.g();
        dg.field_e.a(0, 0);
        kc.field_q.a((byte) 118);
        jp var10 = pl.a("basic", "flame", (byte) 107, param0);
        hc.field_a = new jp[2][4];
        ip.field_v = new jp[2][4];
        for (var11 = 0; (var11 ^ -1) > -5; var11++) {
            ip.field_v[0][var11] = new jp(var10.field_x - var11, var10.field_z);
            ip.field_v[0][var11].g();
            var10.a(0, 0, -var11 + var10.field_x, var10.field_z);
            ip.field_v[1][var11] = ip.field_v[0][var11].c();
            hc.field_a[0][var11] = new jp(ip.field_v[0][var11].field_x / 2, ip.field_v[0][var11].field_z / 2);
            hc.field_a[0][var11].g();
            var10.a(0, 0, ip.field_v[0][var11].field_x / 2, ip.field_v[0][var11].field_z / 2);
            hc.field_a[1][var11] = hc.field_a[0][var11].c();
        }
        kc.field_q.a((byte) 127);
        hq.field_s = bd.a("basic", "expansion_icons", param0, (byte) -8);
        da.field_E = new jp[hq.field_s.length];
        for (var11 = 0; var11 < hq.field_s.length; var11++) {
            da.field_E[var11] = new jp(hq.field_s[var11].field_x / 2, hq.field_s[var11].field_z / 2);
            fc.a(-59, da.field_E[var11]);
            hq.field_s[var11].a(0, 0);
            sc.b(-89);
        }
        cm.field_r = new jp[hq.field_s.length];
        for (var11 = 0; hq.field_s.length > var11; var11++) {
            cm.field_r[var11] = pg.a(da.field_E[var11], 20, -17912);
        }
        ik.field_f = new jp[hq.field_s.length];
        for (var11 = 0; (var11 ^ -1) > (hq.field_s.length ^ -1); var11++) {
            ik.field_f[var11] = p.a(pn.a(param3, -29147), da.field_E[var11], 14, 16777215);
        }
    }

    so(int param0, mf param1, mf param2) {
        ((so) this).field_a = new to(64);
        ((so) this).field_c = param2;
        ((so) this).field_g = param1;
        if (((so) this).field_g != null) {
            int discarded$0 = ((so) this).field_g.c(-123, 0);
        }
        if (((so) this).field_c != null) {
            int discarded$1 = ((so) this).field_c.c(-113, 0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Rating";
        field_f = null;
    }
}
