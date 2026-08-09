/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Torquing extends tg {
    private uf field_t;
    static kk field_v;
    static String field_w;
    static int field_x;
    public static int field_u;

    final static String a(int param0, int param1, fj param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param2.a((byte) -114);
                  if ((var3_int ^ -1) >= (param1 ^ -1)) {
                    break L2;
                  } else {
                    var3_int = param1;
                    break L2;
                  }
                }
                L3: {
                  if (param0 == 26657) {
                    break L3;
                  } else {
                    Torquing.a(9, false);
                    break L3;
                  }
                }
                var4 = new byte[var3_int];
                param2.field_n = param2.field_n + lh.field_u.a(var4, true, param2.field_n, param2.field_j, 0, var3_int);
                var5 = hk.a(var3_int, true, 0, var4);
                stackIn_5_0 = (String) (var5);
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_7_0 = "Cabbage";
              return stackIn_7_0;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("Torquing.OA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_5_0;
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        fj var4;
        L0: {
          var3 = field_u;
          if (param0 < -33) {
            break L0;
          } else {
            var4 = (fj) null;
            Torquing.a(-55, 127, (fj) null);
            break L0;
          }
        }
        L1: {
          if ((wp.field_w ^ -1) < -1) {
            L2: {
              if (ki.field_D == null) {
                dg.field_i = je.a(640, 480, nk.field_u, 0, 0, -62);
                break L2;
              } else {
                dg.field_i = ki.field_D.b((byte) -73);
                vp.b(2, -111);
                break L2;
              }
            }
            if (dg.field_i != null) {
              j.a(dg.field_i, (byte) 63);
              var2 = 2;
              break L1;
            } else {
              var2 = 3;
              break L1;
            }
          } else {
            if (!je.a((byte) 70)) {
              var2 = 1;
              break L1;
            } else {
              var2 = 0;
              break L1;
            }
          }
        }
        L3: {
          if (null != ki.field_D) {
            break L3;
          } else {
            if (tm.field_a) {
              ka.a(var2, param1, (byte) -98);
              break L3;
            } else {
              break L3;
            }
          }
        }
    }

    final void a(int param0) {
        Torquing.p(29165);
        be.b();
        tj.a(-36);
        ei.d(79);
        cl.a(-11784);
        ol.a((byte) -51);
        ml.a(-51);
        ke.a(-18242);
        vi.a();
        ua.a(param0 + -10);
        jk.a(param0 + -4);
        ga.a(2712);
        ul.a(18133);
        vc.a(0);
        ph.c();
        la.d(param0 + 99);
        uc.a();
        l.a((byte) 88);
        qi.a(104);
        fj.d((byte) 59);
        km.a((byte) -123);
        jo.a(16720);
        tf.a((byte) 81);
        dj.a((byte) -62);
        ff.a(-61);
        aq.a(1);
        bq.a((byte) 74);
        hi.a(2);
        vd.a(false);
        hl.a((byte) -77);
        rh.a((byte) -47);
        ha.a(param0 + -132);
        kn.a((byte) 84);
        vf.a(param0 ^ 41);
        pp.a(4);
        m.b(8192);
        pi.d();
        wl.d();
        fi.a(108);
        hc.a((byte) -113);
        mh.b(32);
        ia.c(88);
        uf.a(3);
        bi.c(-3);
        nc.a(param0 ^ 56);
        hj.a((byte) 114);
        jp.d((byte) -77);
        co.a(param0 ^ 6);
        bo.a(21384);
        o.b(-1);
        no.b(param0 + -4);
        wf.a(false);
        ta.g(-93);
        q.b((byte) 92);
        gk.a(-64);
        sa.a(true);
        kk.b(160);
        oi.a(0);
        db.d(-98);
        to.a(param0 ^ 29826);
        fn.a(false);
        ag.a(18945);
        sg.a();
        dd.a((byte) -127);
        g.a();
        kh.a(param0 ^ 24993);
        ti.a(false);
        jn.a((byte) 60);
        oh.a(20269);
        eo.a(6);
        dc.a(false);
        sh.a(-127);
        vg.d((byte) -97);
        eh.b((byte) -106);
        ed.b((byte) -30);
        fd.b(76);
        tm.a((byte) -12);
        me.a((byte) 75);
        hg.a(false);
        da.a(102);
        bh.a(-113);
        vo.a((byte) -125);
        bc.a((byte) -120);
        df.k(3);
        nn.b(-93);
        ln.h((byte) 111);
        sp.m(-7361);
        qc.n(1269);
        mn.h((byte) 77);
        ki.m(0);
        fm.h(-59);
        pe.g((byte) -122);
        th.h(2147483647);
        a.a(param0 ^ 4);
        tl.d((byte) -110);
        eb.a((byte) -31);
        jl.b(2);
        ap.a();
        pa.a((byte) -126);
        bl.a(-92);
        rl.a((byte) 120);
        bn.a(param0 ^ -64);
        af.a(23394);
        de.a((byte) 113);
        dg.c(12949);
        kg.b((byte) -64);
        ik.a((byte) 59);
        ji.a(param0 + -101);
        wk.a((byte) -98);
        cf.b(1);
        un.b(-13524);
        wd.b(0);
        ma.a();
        ho.b();
        uo.a();
        lh.b(param0 + -128);
        pn.a(92);
        hf.a(param0 ^ 8);
        gb.d(-89);
        am.c((byte) -123);
        gn.a((byte) 126);
        fh.d(param0 + -1);
        ac.c(param0 ^ 4);
        pb.a(false);
        lb.c(0);
        gl.c(-96);
        ue.a(param0 + -82);
        pd.a(false);
        nk.a(param0 + 252);
        ra.a(376);
        i.m(50);
        ip.b(108);
        pc.a(4252);
        pg.a(47);
        jb.a((byte) -124);
        of.a((byte) -81);
        qh.a((byte) 39);
        cc.a((byte) 65);
        gi.a((byte) 78);
        qe.a((byte) 102);
        mb.a((byte) -83);
        id.a(-72);
        w.b(param0 + 2147483644);
        uk.a(0);
        md.a(-137);
        cn.a(-1581);
        vb.a(param0 ^ 41);
        dp.b(param0 + -110);
        fc.a();
        j.a((byte) 44);
        pm.a(0);
        kl.b(-125);
        mg.a(-62);
        oc.b(false);
        oj.a(param0 ^ 5);
        ld.b((byte) -21);
        rn.a((byte) 116);
        uj.a((byte) -54);
        gm.d(13509);
        lg.i(52);
        jh.a((byte) 69);
        im.k(-126);
        hn.f((byte) 2);
        re.b(21007);
        r.b(param0 + 33423357);
        p.b(29841);
        ci.b(2);
        gh.a(118);
        al.a((byte) 20);
        ie.b(-1674);
        ne.a(param0 + 4508);
        ef.a(param0 + -1);
        ob.a((byte) -12);
        ao.b(23116);
        ko.a((byte) -102);
        np.d(0);
        mk.a(115);
        qm.a(param0 ^ 35);
        ja.a();
        wi.b(-126);
        sb.a(31238);
        nf.c();
        ej.b();
        ug.a(false);
        na.a(0);
        gp.k((byte) 121);
        aa.m(0);
        kf.a(false);
        vp.h(-1);
        ub.a((byte) -19);
        bj.f((byte) -37);
        ok.a(param0 + 9);
        gf.d(param0 + -4);
        bf.a(3);
        va.a(true);
        om.a(param0 + -4);
        tp.b(121);
        ro.g((byte) 123);
        od.b(11860);
        jf.a(37);
        lo.a();
        u.g((byte) -47);
        po.g((byte) 0);
        wn.b(param0 + -4);
        so.g((byte) 126);
        qn.a(false);
        te.b(param0 + -445141588);
        ee.g((byte) -62);
        kc.b(param0 ^ param0);
        hm.b(12);
        lk.b(0);
        sd.g((byte) 115);
        b.c(param0 + 16056);
        eg.b(param0 + -128);
        qg.c(-1172010644);
        bd.a(false);
        mo.g((byte) -16);
        lc.a(false);
        mi.g((byte) -39);
        go.c(param0 ^ 58);
        ql.b(16711935);
        ea.a(true);
        pl.c(param0 ^ -69);
        cq.b(param0 + -1339901240);
        jg.g((byte) 106);
        wp.a(true);
        rg.b(param0 + 31631);
        s.g((byte) -73);
        mf.g((byte) 21);
        hb.b(-799778388);
        nl.d(param0 + -132);
        wh.g((byte) 115);
        rj.g((byte) -102);
        ib.a(-22719);
        wb.g((byte) 109);
        vk.b(95);
        rd.c(127);
        cm.a(31003);
        jm.c(-101);
        hq.a(-1);
        jd.h(-97);
        k.a(param0 + 98);
        vl.a((byte) 93);
        lj.b(-83);
        d.a(param0 ^ -99);
        en.c(1);
        gj.b(false);
        lp.a(0);
        in.a((byte) -28);
        qf.a(true);
        ih.a((byte) -45);
        wa.a(-117);
        on.a(160);
        ah.b(param0 + -3);
        dh.a(true);
        wo.a(true);
        bm.a(107);
        wc.a(0);
        qj.a(false);
        cb.a(88);
        rf.b((byte) 61);
        je.b((byte) 86);
        ig.b(-117);
        io.a((byte) -113);
        kb.a(param0 ^ 6);
        fq.g((byte) -118);
        ae.d((byte) 112);
        og.a((byte) 125);
        rp.a(-28607);
        nh.a(false);
        qp.a(-39);
        h.a(13809);
        qk.a((byte) 109);
        ud.a((byte) -128);
        ii.a(param0 ^ -28451);
        up.b(-108);
        ce.a((byte) -55);
        ai.a((byte) 64);
        he.a(-1);
        e.b(true);
        wj.c(false);
        rk.b(true);
        gd.a((byte) -119);
        dn.a((byte) 10);
        fo.h(-2);
        di.c(param0 ^ -3);
        hh.a((byte) 84);
        qa.a(126);
        ni.a(-37);
        v.a((byte) 123);
        pf.a(106);
        mc.a(5);
        il.c((byte) -124);
        ij.f(-99);
        tn.e(0);
        ad.c((byte) 17);
        ab.e(64);
        um.c((byte) -121);
        qd.c(15);
        tb.a((byte) 103);
        cd.a((byte) -11);
        eq.b((byte) 62);
        ka.a(101);
        ui.a(-22677);
        n.a(0);
        kj.a((byte) -22);
        ak.b(-1507);
        cp.b(param0 + 2092666600);
        ll.b((byte) 81);
        bp.a(false);
        this.field_i = null;
        this.field_t = null;
    }

    public Torquing() {
    }

    private final void c(boolean param0) {
        int var3 = field_u;
        if (!param0) {
            return;
        }
        qp var4 = (qp) ((Object) jh.field_y.b(0));
        while (var4 != null) {
            wc.a(var4, (byte) 99, 4);
            var4 = (qp) ((Object) jh.field_y.f(-24059));
        }
        qk var5 = (qk) ((Object) bo.field_l.b(0));
        while (var5 != null) {
            le.a((byte) 126, 5, var5);
            var5 = (qk) ((Object) bo.field_l.f(-24059));
        }
        kg.field_c = ip.a(4, -127);
        kb.field_f = tl.a(5, 0, 1, 0);
        if (-1 > (wp.field_w ^ -1)) {
            ee.field_s = false;
            lp.field_f = false;
        }
    }

    final void c(int param0) {
        this.a(11, 11, false, param0 + 477, 9, 15, 10, 0);
        pi.a(22050, true, 10);
        qd.field_b = pi.a(nk.field_u, (java.awt.Component) ((Object) k.field_d), 0, 22050);
        la.field_c = pi.a(nk.field_u, (java.awt.Component) ((Object) k.field_d), 1, 1024);
        uh var2 = new uh();
        la.field_c.a(var2);
        uh var3 = new uh();
        qd.field_b.a(var3);
        ql.a(param0 ^ 1618865635, var3, var2);
        this.a(true, false, true, true, false);
        tm.field_b = vi.field_a.length;
        cc.field_c = 1;
        uf.field_c = 0;
        if (param0 != -593) {
            this.c(true, -107);
        }
        qa.field_l = 9;
        sg.c();
    }

    private final void b(int param0, int param1) {
        k.a(param1, 1);
        nc.a(param1, true);
        qc.field_cb.a((byte) -51, 0, 0);
        wh.field_t[param1].a(0, 0, 76);
        pm.field_m[param1].a(0, 0);
        mh.field_d[param1].a(0, 0, 76);
        ml.field_a[param1].a(0, 0);
        if (null == this.field_t) {
            this.field_t = new uf(i.field_Q, 0, 372, 286, ml.field_a[param1], -34, -159);
            this.field_t.a((byte) -19, 30);
            this.field_t.a(false, ff.a(new String[]{Integer.toString(param1 + 1)}, 0, pc.field_n));
            this.field_t.a((byte) 120, 40);
            this.field_t.a(false, ff.a(new String[]{Integer.toString(ie.field_b.field_b[param1]), Integer.toString(mh.field_k[param1])}, 0, ka.field_l));
            this.field_t.a((byte) 97, 30);
            this.field_t.c(0);
        }
        this.field_t.b(34, -120, 159);
        qh.field_c.a(kk.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, 3 * (1 + dd.field_c.field_x) / 2);
        if (param0 < 30) {
            this.b(61);
        }
        ph.c(0, 0, 640, 480, 16777215);
    }

    private final boolean b(boolean param0, byte param1) {
        t dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        int incrementValue$2 = 0;
        StringBuilder discarded$3 = null;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_163_0 = 0;
        int stackIn_163_1 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        boolean stackIn_219_0 = false;
        int stackIn_226_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_249_1 = 0;
        int stackIn_253_0 = 0;
        int stackIn_253_1 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_269_0 = 0;
        int stackIn_269_1 = 0;
        boolean stackOut_218_0;
        int statePc = 0;
        short[] var3 = null;
        int var3_int = 0;
        int[] var3_array = null;
        int var4 = 0;
        byte[] var4_ref_byte__ = null;
        hc var4_ref_hc = null;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        int var6 = 0;
        sm var7_ref_sm = null;
        int var7 = 0;
        ia var8_ref_ia = null;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int var10 = 0;
        Object var10_ref = null;
        int var11 = 0;
        dg var11_ref_dg = null;
        int[] var11_ref_int__ = null;
        int var12 = 0;
        int[] var12_ref_int__ = null;
        int var13_int = 0;
        af var13 = null;
        StringBuilder var13_ref = null;
        int var14_int = 0;
        hc var14 = null;
        int var15 = 0;
        sm var15_ref_sm = null;
        t var16_ref_t = null;
        ia var16_ref_ia = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19_int = 0;
        int[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        fj var28 = null;
        int[] var30 = null;
        int var31 = 0;
        int var32 = 0;
        rm var33 = null;
        short[] var34 = null;
        t var35 = null;
        t var36 = null;
        sm[] var37 = null;
        sm var38 = null;
        t var39 = null;
        t var40 = null;
        t[] var42 = null;
        t var43 = null;
        sm[] var44 = null;
        sm var45 = null;
        sm var46 = null;
        sm var47 = null;
        t var48 = null;
        int[] var49 = null;
        t[] var50 = null;
        t var51 = null;
        gg var52 = null;
        byte[] var53 = null;
        fj var54 = null;
        String var55 = null;
        StringBuilder var56 = null;
        hc var57 = null;
        byte[] var58 = null;
        fj var59 = null;
        String var60 = null;
        hc var61 = null;
        short[] var62 = null;
        int[] var64 = null;
        byte[] var65 = null;
        byte[] var66 = null;
        int[] var69 = null;
        int[] var70 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var27 = field_u;
                    nn.a(-98);
                    if (rl.field_a != null) {
                        statePc = 2;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (tp.field_a == null) {
                        statePc = 4;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (!rp.field_d.a(-12749)) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (!rp.field_d.a(true, "basic")) {
                        statePc = 7;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 7: {
                    df.a(1.0f, 84, c.a(17, bo.field_i, "basic", db.field_d, rp.field_d));
                    return false;
                }
                case 8: {
                    if (rp.field_d.a(true, "benefits")) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    df.a(1.0f, -93, c.a(param1 ^ -117, bo.field_i, "basic", db.field_d, rp.field_d));
                    return false;
                }
                case 10: {
                    if (!rp.field_d.a(true, "kartika13")) {
                        statePc = 12;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 12: {
                    df.a(2.0f, 117, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                    return false;
                }
                case 13: {
                    if (!e.field_b.a(-12749)) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (!e.field_b.a(true, "kartika13")) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    df.a(2.0f, -80, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                    return false;
                }
                case 17: {
                    if (!rl.field_a.a(param1 + -12647)) {
                        statePc = 20;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (rl.field_a.c(-19375)) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    df.a(3.0f, -102, c.a(17, vf.field_g, "", kb.field_c, rl.field_a));
                    return false;
                }
                case 21: {
                    if (!rg.field_v.a(-12749)) {
                        statePc = 24;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    if (rg.field_v.c(-19375)) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    df.a(10.0f, -99, c.a(17, bo.field_i, "", db.field_d, rg.field_v));
                    return false;
                }
                case 25: {
                    if (!uf.field_l.a(-12749)) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (!uf.field_l.c(-19375)) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    df.a(19.0f, 28, c.a(param1 + 119, ol.field_e, "", l.field_c, uf.field_l));
                    return false;
                }
                case 29: {
                    if (!vp.field_D.a(-12749)) {
                        statePc = 32;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    if (vp.field_D.c(-19375)) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    df.a(20.0f, 5, il.a(pg.field_a, vp.field_D, mb.field_c, (byte) 113));
                    return false;
                }
                case 33: {
                    if (!n.field_q.a(-12749)) {
                        statePc = 36;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (n.field_q.c(-19375)) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    df.a(20.0f, param1 + 110, il.a(pg.field_a, n.field_q, mb.field_c, (byte) 33));
                    return false;
                }
                case 37: {
                    if (!bp.field_c.a(-12749)) {
                        statePc = 40;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (!bp.field_c.c(param1 ^ 19403)) {
                        statePc = 40;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 40: {
                    df.a(23.0f, param1 ^ 41, c.a(17, fn.field_a, "", hn.field_A, bp.field_c));
                    return false;
                }
                case 41: {
                    if (!vd.field_e.a(-12749)) {
                        statePc = 44;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    if (vd.field_e.c(param1 + -19273)) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    df.a(26.0f, param1 ^ 59, c.a(17, fn.field_a, "", hn.field_A, vd.field_e));
                    return false;
                }
                case 45: {
                    if (!th.field_C.a(-12749)) {
                        statePc = 48;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    if (th.field_C.c(param1 ^ 19403)) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    df.a(27.0f, -72, c.a(17, tf.field_a, "", ac.field_A, th.field_C));
                    return false;
                }
                case 49: {
                    if (!he.field_b.a(-12749)) {
                        statePc = 52;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 50: {
                    if (he.field_b.c(-19375)) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    df.a(28.0f, 101, c.a(17, pa.field_a, "", pd.field_a, he.field_b));
                    return false;
                }
                case 53: {
                    if (-1 <= (wp.field_w ^ -1)) {
                        statePc = 58;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    if (!eg.field_t.a(-12749)) {
                        statePc = 57;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (eg.field_t.c(param1 + -19273)) {
                        statePc = 58;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    df.a(29.0f, -63, c.a(17, pa.field_a, "", pd.field_a, eg.field_t));
                    return false;
                }
                case 58: {
                    pm.a((byte) 80);
                    df.a(30.0f, param1 + 116, jn.field_d);
                    this.b((byte) 73);
                    if (param0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    return false;
                }
                case 60: {
                    tp.field_a = je.a(rl.field_a, "", "sphere", (byte) -124);
                    cf.a(param1 ^ -6539);
                    return false;
                }
                case 61: {
                    if (vc.field_c != null) {
                        statePc = 63;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    vc.field_c = new kh[32];
                    vc.field_c[0] = je.a(rl.field_a, "", "powerups/exit", (byte) -121);
                    vc.field_c[2] = je.a(rl.field_a, "", "powerups/time_fixed", (byte) -127);
                    vc.field_c[1] = je.a(rl.field_a, "", "powerups/score", (byte) -119);
                    vc.field_c[4] = je.a(rl.field_a, "", "powerups/spikes", (byte) -127);
                    vc.field_c[5] = je.a(rl.field_a, "", "powerups/frameRotation", (byte) -122);
                    cf.a(6639);
                    return false;
                }
                case 63: {
                    if (vc.field_c[6] != null) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    vc.field_c[6] = je.a(rl.field_a, "", "powerups/gyroscope", (byte) -127);
                    vc.field_c[7] = je.a(rl.field_a, "", "powerups/bomb", (byte) -127);
                    vc.field_c[8] = je.a(rl.field_a, "", "powerups/shield", (byte) -121);
                    vc.field_c[9] = je.a(rl.field_a, "", "powerups/letter_t", (byte) -122);
                    vc.field_c[10] = je.a(rl.field_a, "", "powerups/letter_o", (byte) -120);
                    cf.a(6639);
                    return false;
                }
                case 65: {
                    if (null == vc.field_c[11]) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    vc.field_c[11] = je.a(rl.field_a, "", "powerups/letter_r", (byte) -118);
                    vc.field_c[12] = je.a(rl.field_a, "", "powerups/letter_q", (byte) -123);
                    vc.field_c[13] = je.a(rl.field_a, "", "powerups/letter_u", (byte) -122);
                    vc.field_c[14] = je.a(rl.field_a, "", "powerups/letter_i", (byte) -123);
                    vc.field_c[15] = je.a(rl.field_a, "", "powerups/letter_n", (byte) -126);
                    cf.a(param1 ^ -6539);
                    return false;
                }
                case 68: {
                    if (vc.field_c[16] == null) {
                        statePc = 70;
                    } else {
                        statePc = 71;
                    }
                    continue stateLoop;
                }
                case 70: {
                    vc.field_c[16] = je.a(rl.field_a, "", "powerups/letter_g", (byte) -128);
                    vc.field_c[17] = je.a(rl.field_a, "", "powerups/skin_tennisball", (byte) -124);
                    gi.a(vc.field_c[17].field_l, (byte) 13, 31);
                    vc.field_c[18] = new kh(new jl(30, false));
                    vc.field_c[19] = je.a(rl.field_a, "", "powerups/skin_marble", (byte) -126);
                    gi.a(vc.field_c[19].field_l, (byte) 13, 31);
                    vc.field_c[20] = je.a(rl.field_a, "", "powerups/skin_ballbearing", (byte) -119);
                    gi.a(vc.field_c[20].field_l, (byte) 13, 31);
                    cf.a(6639);
                    return false;
                }
                case 71: {
                    if (vc.field_c[21] == null) {
                        statePc = 73;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 73: {
                    vc.field_c[21] = je.a(rl.field_a, "", "powerups/skin_beachball", (byte) -123);
                    gi.a(vc.field_c[21].field_l, (byte) 13, 31);
                    vc.field_c[22] = je.a(rl.field_a, "", "powerups/skin_apple", (byte) -121);
                    vc.field_c[23] = je.a(rl.field_a, "", "powerups/skin_atom", (byte) -123);
                    vc.field_c[24] = je.a(rl.field_a, "", "powerups/skin_orb", (byte) -124);
                    gi.a(vc.field_c[24].field_l, (byte) 13, 31);
                    ji.a(vc.field_c[24].field_l, -1);
                    cf.a(6639);
                    return false;
                }
                case 74: {
                    if (!ia.a(-22426, 0)) {
                        statePc = 76;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    var33 = rm.a(rl.field_a, "", "sphere_halloween");
                    gi.a(var33, (byte) 13, 31);
                    vc.field_c[17] = new kh(var33);
                    vc.field_c[18] = new kh(var33);
                    vc.field_c[19] = new kh(var33);
                    vc.field_c[20] = new kh(var33);
                    vc.field_c[21] = new kh(var33);
                    vc.field_c[22] = new kh(var33);
                    vc.field_c[23] = new kh(var33);
                    vc.field_c[24] = new kh(var33);
                    ji.a(vc.field_c[24].field_l, -1);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    if (null != vc.field_c[3]) {
                        statePc = 81;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    vc.field_c[3] = je.a(rl.field_a, "", "obstacles/childs_play_block", (byte) -120);
                    vc.field_c[25] = je.a(rl.field_a, "", "obstacles/drinks_can", (byte) -128);
                    vc.field_c[26] = je.a(rl.field_a, "", "obstacles/grave_stone2", (byte) -128);
                    vc.field_c[27] = je.a(rl.field_a, "", "obstacles/pinetree_round", (byte) -123);
                    vc.field_c[28] = je.a(rl.field_a, "", "obstacles/pinetree_square", (byte) -122);
                    vc.field_c[29] = je.a(rl.field_a, "", "obstacles/statue", (byte) -126);
                    var62 = vc.field_c[29].field_l.field_m;
                    var34 = var62;
                    var3 = var34;
                    var4 = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (var4 >= var62.length) {
                        statePc = 80;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    var5 = var62[var4];
                    var3[var4] = (short)(ie.a(127, var5) + 8704);
                    var4++;
                    statePc = 78;
                    continue stateLoop;
                }
                case 80: {
                    vc.field_c[30] = je.a(rl.field_a, "", "obstacles/traffic_cone", (byte) -123);
                    vc.field_c[31] = je.a(rl.field_a, "", "obstacles/traffic_lights_tall", (byte) -121);
                    cf.a(6639);
                    return false;
                }
                case 81: {
                    if (vb.field_c[3] == null) {
                        statePc = 83;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 83: {
                    vb.field_c[3] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_block").a(80, 1365, -1, -12, 12));
                    vb.field_c[25] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_can").a(80, 1365, -1, -12, 12));
                    vb.field_c[26] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_grave").a(80, 1365, -1, -12, 12));
                    vb.field_c[27] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_roundtree").a(80, 1365, -1, -12, 12));
                    vb.field_c[28] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_squaretree").a(80, 1365, -1, -12, 12));
                    vb.field_c[29] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_statue").a(80, 1365, -1, -12, 12));
                    vb.field_c[30] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_cone").a(80, 1365, -1, -12, 12));
                    vb.field_c[31] = (pj) ((Object) rm.a(rl.field_a, "", "obstacles/bb_lights_tall_nopost").a(80, 1365, -1, -12, 12));
                    ka.field_n[31][0] = 0;
                    ka.field_n[31][4] = 0;
                    ka.field_n[31][1] = 16;
                    ka.field_n[31][2] = 8;
                    ka.field_n[31][3] = -101;
                    cf.a(6639);
                    return false;
                }
                case 84: {
                    gb.field_c = je.a(rl.field_a, "", "powerups/spikesonly", (byte) -127);
                    var3 = vc.field_c[9].field_l.field_m;
                    var4 = 10;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    if (var4 > 16) {
                        statePc = 91;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_249_0 = vc.field_c[var4].field_l.field_m.length ^ -1;
                    stackIn_87_0 = stackIn_249_0;
                    stackIn_249_1 = var3.length ^ -1;
                    stackIn_87_1 = stackIn_249_1;
                    if (false) {
                        statePc = 249;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    if (stackIn_87_0 < stackIn_87_1) {
                        statePc = 89;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 89: {
                    var3 = vc.field_c[var4].field_l.field_m;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    var4++;
                    statePc = 85;
                    continue stateLoop;
                }
                case 91: {
                    var4 = 9;
                    statePc = 92;
                    continue stateLoop;
                }
                case 92: {
                    if (var4 > 16) {
                        statePc = 94;
                    } else {
                        statePc = 93;
                    }
                    continue stateLoop;
                }
                case 93: {
                    vc.field_c[var4].field_l.field_m = var3;
                    var4++;
                    statePc = 92;
                    continue stateLoop;
                }
                case 94: {
                    dk.a(var3, 0, var3.length, (short) 960);
                    rl.field_a = null;
                    cf.a(6639);
                    return false;
                }
                case 95: {
                    if (rp.field_d != null) {
                        statePc = 97;
                    } else {
                        statePc = 100;
                    }
                    continue stateLoop;
                }
                case 97: {
                    df.a(32.0f, -66, k.field_h);
                    this.b((byte) 73);
                    kk.field_o = mn.a(rp.field_d, "basic", "unachieved", 112);
                    pe.field_J = mn.a(rp.field_d, "basic", "locked", param1 + 207);
                    mo.a(kk.field_o, 4);
                    dd.field_i = mn.a(rp.field_d, "basic", "orbcoin", 124);
                    this.q(8);
                    if (0 < wp.field_w) {
                        statePc = 99;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    m.a(16750848, (java.applet.Applet) (this), 0, dh.field_a, 0, 16777215);
                    var35 = new t(640, 480);
                    rj.a(-65, cp.field_i, var35);
                    vc.a(mn.a(rg.field_v, "", "mb_logo", 96), false);
                    var36 = mn.a(rg.field_v, "", "mb_price_bg", 97);
                    kp.a(var36, 10, 24, 96, 118, 37, 6, false, -2000);
                    mk.field_b.a(-101);
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    rp.field_d = null;
                    cf.a(6639);
                    return false;
                }
                case 100: {
                    if (null != rg.field_v) {
                        statePc = 102;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 102: {
                    var3_int = dd.field_c.field_t + dd.field_c.field_x;
                    kh.field_r = new t(var3_int, var3_int);
                    kh.field_r.e();
                    dd.field_i.c(0, 0, var3_int, var3_int);
                    dd.field_i = null;
                    mk.field_b.a(param1 + 4);
                    s.field_t = pb.a("frame", -1, "", rg.field_v);
                    lb.a(16777215, pb.a("frame2col", -1, "", rg.field_v), pb.a("frame2alpha", -1, "", rg.field_v), param1 ^ -98);
                    var37 = ip.a(rg.field_v, -123, "", "intro_components");
                    var44 = ip.a(rg.field_v, -109, "", "intro_components_shadows");
                    var45 = var37[1];
                    var7_ref_sm = var37[3];
                    var8_ref_ia = new ia(18, 142, 404, 320);
                    qc.field_cb = var8_ref_ia;
                    pa.field_e = ip.a(rg.field_v, -115, "", "world_text");
                    ml.field_a = ip.a(rg.field_v, -109, "", "world_img");
                    mh.field_d = ip.a(rg.field_v, param1 + -17, "", "world_img_shadow");
                    rp.field_b = new t[32];
                    var9_ref_int__ = new int[]{16777215, 14211288, 15000804, 10526880};
                    var10 = 0;
                    statePc = 103;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = var10;
                    stackIn_104_1 = 8;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (stackIn_104_0 >= stackIn_104_1) {
                        statePc = 123;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    var38 = ml.field_a[var10];
                    var39 = new t(var38.field_c, var38.field_d);
                    var39.e();
                    var38.a(-var38.field_a, -var38.field_g);
                    if (var38.field_d < var38.field_c) {
                        statePc = 107;
                    } else {
                        statePc = 106;
                    }
                    continue stateLoop;
                }
                case 106: {
                    var13_int = var38.field_c * 48 / var38.field_d;
                    var14_int = 48;
                    statePc = 108;
                    continue stateLoop;
                }
                case 107: {
                    var14_int = 48 * var38.field_d / var38.field_c;
                    var13_int = 48;
                    statePc = 108;
                    continue stateLoop;
                }
                case 108: {
                    var15 = 0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    stackIn_110_0 = var15;
                    stackIn_110_1 = var9_ref_int__.length;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if (stackIn_110_0 >= stackIn_110_1) {
                        statePc = 122;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    dupTemp$0 = new t(var13_int, var14_int);
                    rp.field_b[var15 * 8 + var10] = dupTemp$0;
                    var40 = dupTemp$0;
                    var16_ref_t = var40;
                    var16_ref_t.field_u = 48;
                    var16_ref_t.field_r = -var40.field_t + var40.field_u >> -1906538815;
                    var40.e();
                    var17 = var9_ref_int__[var15];
                    ph.d(0, 0, ph.field_j, ph.field_d, var17);
                    var39.d(0, 0, var13_int, var14_int);
                    stackIn_104_0 = 16777215;
                    stackIn_112_0 = stackIn_104_0;
                    stackIn_104_1 = var17;
                    stackIn_112_1 = stackIn_104_1;
                    if (false) {
                        statePc = 104;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 == stackIn_112_1) {
                        statePc = 114;
                    } else {
                        statePc = 115;
                    }
                    continue stateLoop;
                }
                case 114: {
                    ph.e(0, 0, ph.field_j, ph.field_d);
                    statePc = 115;
                    continue stateLoop;
                }
                case 115: {
                    var69 = var40.field_y;
                    var19_int = 0;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    if ((var69.length ^ -1) >= (var19_int ^ -1)) {
                        statePc = 121;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    stackIn_110_0 = var69[var19_int] ^ -1;
                    stackIn_118_0 = stackIn_110_0;
                    stackIn_110_1 = var17 ^ -1;
                    stackIn_118_1 = stackIn_110_1;
                    if (false) {
                        statePc = 110;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if (stackIn_118_0 != stackIn_118_1) {
                        statePc = 120;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    var69[var19_int] = 0;
                    statePc = 120;
                    continue stateLoop;
                }
                case 120: {
                    var19_int++;
                    statePc = 116;
                    continue stateLoop;
                }
                case 121: {
                    var40.d();
                    var15++;
                    statePc = 109;
                    continue stateLoop;
                }
                case 122: {
                    var10++;
                    statePc = 103;
                    continue stateLoop;
                }
                case 123: {
                    mk.field_b.a(param1 ^ 11);
                    pm.field_m = ip.a(rg.field_v, -114, "", "world_title");
                    wh.field_t = ip.a(rg.field_v, param1 ^ 23, "", "world_title_shadows");
                    wj.field_k = md.a("getready", 31094, rg.field_v, "");
                    sg.field_e = pb.a("sprite_textures", param1 ^ 101, "", rg.field_v);
                    sg.field_a = pb.a("auras", -1, "", rg.field_v);
                    var42 = sg.field_a;
                    var11 = 0;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    if (var42.length <= var11) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    var43 = var42[var11];
                    var43.a();
                    var11++;
                    statePc = 124;
                    continue stateLoop;
                }
                case 126: {
                    hj.field_c = var45;
                    of.field_l = var37[2].a();
                    fq.field_F = new dg(var44[2], 0, 0, 76);
                    cq.field_w = var37[4].a();
                    la.field_j = var37[0].a();
                    jh.field_B = new dg(var44[0], 0, 0, 76);
                    jb.field_b = var8_ref_ia;
                    nh.field_l = var7_ref_sm;
                    bd.field_w = mn.a(rg.field_v, "", "dashboard", 106);
                    kk.field_n = mn.a(rg.field_v, "", "shieldIcon", 105);
                    ia.field_f = mn.a(rg.field_v, "", "gyroIcon", 104);
                    hq.field_h = pb.a("countdown", -1, "", rg.field_v);
                    hi.field_h = new sm[8];
                    gm.field_r = new sm[8];
                    var10 = 0;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    if (8 <= var10) {
                        statePc = 132;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    gm.field_r[var10] = md.a("mg" + var10, 31094, rg.field_v, "");
                    stackIn_253_0 = var10 ^ -1;
                    stackIn_129_0 = stackIn_253_0;
                    stackIn_253_1 = -2;
                    stackIn_129_1 = stackIn_253_1;
                    if (false) {
                        statePc = 253;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    if (stackIn_129_0 != stackIn_129_1) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    hi.field_h[var10] = md.a("mg" + var10 + "b", 31094, rg.field_v, "");
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    var10++;
                    statePc = 127;
                    continue stateLoop;
                }
                case 132: {
                    ue.field_c = pb.a("skins", param1 + 101, "", rg.field_v);
                    bl.field_d = 7;
                    qo.field_t = 2;
                    var10 = 0;
                    statePc = 133;
                    continue stateLoop;
                }
                case 133: {
                    if (var10 >= 8) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    ln.a((byte) 120, var10 * 640 >> 1975801795);
                    var10++;
                    statePc = 133;
                    continue stateLoop;
                }
                case 135: {
                    nn.field_a = new af[12][];
                    var10_ref = bi.a(var45, 81);
                    var11_ref_dg = new dg(vg.a(new sm[]{var44[3], var44[2], var44[4]}, 52), 0, 0, 76);
                    var46 = vg.a(new sm[]{var7_ref_sm, var37[2], var37[4]}, 122);
                    var13 = bi.a(var46, param1 + -7);
                    nn.field_a[0] = new af[]{(af) (var10_ref), (af) ((Object) var8_ref_ia), (af) ((Object) var11_ref_dg), var13, (af) ((Object) new dg(var44[0], 0, 0, 76)), bi.a(var37[0], -115)};
                    var47 = md.a("pause_title", param1 ^ -30996, rg.field_v, "");
                    nn.field_a[1] = new af[]{(af) (var10_ref), (af) ((Object) var8_ref_ia), (af) ((Object) var11_ref_dg), var13, (af) ((Object) new dg(var47, 5, 5, 76)), bi.a(var47, i.c((int) param1, 55))};
                    nn.field_a[3] = new af[]{(af) ((Object) new ia(102, 14, 436, 452)), dp.a("continue", "", rg.field_v, (byte) 4)};
                    nn.field_a[4] = new af[]{(af) (var10_ref), dp.a("help_bg_delta", "", rg.field_v, (byte) 4), (af) ((Object) new ia(27, 98, 574, 365))};
                    var15_ref_sm = md.a("highscore_top", 31094, rg.field_v, "");
                    nn.field_a[2] = new af[]{(af) (var10_ref), (af) ((Object) new ia(102, 108, 436, 362)), dp.a("highscore_bottom", "", rg.field_v, (byte) 4), (af) ((Object) new dg(var15_ref_sm, 4, 4, 76)), bi.a(var15_ref_sm, 103)};
                    nn.field_a[5] = new af[]{(af) ((Object) new ia(72, 82, 496, 366))};
                    nn.field_a[9] = new af[]{(af) ((Object) new ia(27, 51, 574, 430)), dp.a("levelsel", "", rg.field_v, (byte) 4)};
                    var16_ref_ia = new ia(23, 62, 593, 402);
                    nn.field_a[6] = new af[]{(af) ((Object) var16_ref_ia), dp.a("achievetitle", "", rg.field_v, (byte) 4)};
                    nn.field_a[8] = new af[]{(af) ((Object) var16_ref_ia), dp.a("gameachtitle", "", rg.field_v, (byte) 4)};
                    nn.field_a[7] = new af[]{(af) ((Object) new ia(35, 144, 573, 223)), (af) ((Object) new dg(var44[0], 0, 0, 76)), bi.a(var37[0], 115)};
                    nn.field_a[10] = new af[]{(af) ((Object) qc.field_cb), (af) ((Object) new dg(var44[0], 0, 0, 76)), bi.a(var37[0], param1 + 41), (af) ((Object) new dg(mh.field_d[1], 0, 0, 76)), bi.a(ml.field_a[1], 108)};
                    nn.field_a[11] = new af[]{(af) ((Object) new ia(11, 11, 618, 122)), (af) ((Object) new ia(11, 139, 209, 330)), (af) ((Object) new ia(226, 139, 403, 242))};
                    dj.field_a = pb.a("menu_items_recol", -1, "", rg.field_v);
                    bj.field_L = ip.a(rg.field_v, param1 ^ 31, "", "death_text");
                    qd.field_c = new sm[3];
                    qd.field_c[1] = md.a("death_time", 31094, rg.field_v, "");
                    qd.field_c[0] = vo.a(-173, i.c((int) param1, 101), ml.field_a[2], 43);
                    qd.field_c[2] = vo.a(-194, -1, ml.field_a[6], -34);
                    kl.field_p = mn.a(rg.field_v, "", "scrolled_instructions_keys", param1 + 186);
                    gd.field_a = ip.a(rg.field_v, -116, "", "mb_screenshots");
                    be.a(new op(vp.field_D, n.field_q, rg.field_v, 6, false));
                    tj.field_n = pb.a("achievements_lrg", param1 + 101, "", rg.field_v);
                    var48 = mn.a(rg.field_v, "", "glass", 89);
                    var48.a();
                    var70 = var48.field_y;
                    tj.field_n[11].a();
                    var64 = tj.field_n[11].field_y;
                    var49 = var64;
                    var30 = var49;
                    var19 = var30;
                    var20 = 0;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    if (-16385 >= (var20 ^ -1)) {
                        statePc = 140;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    var21 = var70[var20];
                    if (0 == var21) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    var22 = var21 >> -1523280954 & 1020 | (var21 & 255) >> -404047933;
                    var23 = -var22 + 256;
                    var24 = var64[var20];
                    var25 = var24 & 16711935;
                    var26 = var24 & 65280;
                    var19[var20] = gm.a(ie.a(65280 * var22 + var26 * var23, 16711865) >> -128003768, ie.a(16711935, var25 * var23 + var22 * 16711935 >> 1962371368));
                    statePc = 139;
                    continue stateLoop;
                }
                case 139: {
                    var20++;
                    statePc = 136;
                    continue stateLoop;
                }
                case 140: {
                    tj.field_n[11].d();
                    var50 = tj.field_n;
                    var18 = 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    if ((var18 ^ -1) <= (var50.length ^ -1)) {
                        statePc = 143;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    var51 = var50[var18];
                    mo.a(var51, 4);
                    var18++;
                    statePc = 141;
                    continue stateLoop;
                }
                case 143: {
                    rg.field_v = null;
                    vp.field_D = null;
                    cf.a(6639);
                    return false;
                }
                case 144: {
                    if (null == bp.field_c) {
                        statePc = 146;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    df.a(35.0f, param1 ^ -29, jo.field_a);
                    this.b((byte) 73);
                    id.field_a = new fi(bp.field_c, vd.field_e);
                    th.field_F[26] = cg.a(bp.field_c, "", "torq_bounce").b();
                    th.field_F[19] = cg.a(bp.field_c, "", "torq_collect").b();
                    th.field_F[12] = cg.a(bp.field_c, "", "torq_equip_shield").b();
                    th.field_F[9] = cg.a(bp.field_c, "", "torq_equip_spikes").b();
                    th.field_F[13] = cg.a(bp.field_c, "", "torq_explode").b();
                    th.field_F[10] = cg.a(bp.field_c, "", "torq_gyroscope").b();
                    th.field_F[25] = cg.a(bp.field_c, "", "torq_land_hard").b();
                    th.field_F[27] = cg.a(bp.field_c, "", "torq_playfield_tilts").b();
                    th.field_F[6] = cg.a(bp.field_c, "", "torq_powerup").b();
                    th.field_F[0] = cg.a(bp.field_c, "", "torq_roll_normal_1").b();
                    th.field_F[1] = cg.a(bp.field_c, "", "torq_roll_spiky_1").b();
                    th.field_F[23] = cg.a(bp.field_c, "", "torq_select").b();
                    th.field_F[16] = cg.a(bp.field_c, "", "torq_shieldhit").b();
                    th.field_F[11] = cg.a(bp.field_c, "", "torq_skid_alt").b();
                    th.field_F[15] = cg.a(bp.field_c, "", "torq_squash").b();
                    th.field_F[20] = cg.a(bp.field_c, "", "torq_tick").b();
                    th.field_F[28] = cg.a(bp.field_c, "", "torq_jump2").b();
                    var3_int = bp.field_c.a(-1, "");
                    var52 = id.field_a.a(bp.field_c.a("torq_whistle", -107, var3_int), var3_int, (byte) -84);
                    var65 = new byte[var52.field_n.length];
                    var53 = var65;
                    var5_ref_byte__ = var53;
                    dk.a(var52.field_n, 0, var5_ref_byte__, 0, var65.length);
                    th.field_F[5] = new gg(var52.field_m, var65, var52.field_k, var52.field_o, var52.field_l);
                    bp.field_c = null;
                    cf.a(6639);
                    return false;
                }
                case 146: {
                    if (vd.field_e == null) {
                        statePc = 148;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    df.a(37.0f, -88, jo.field_a);
                    this.b((byte) 73);
                    th.field_F[7] = ho.a(vd.field_e, "", "torq_cuckoo_clock").c();
                    th.field_F[8] = ho.a(vd.field_e, "", "laura_uhoh").c();
                    th.field_F[21] = ho.a(vd.field_e, "", "bigben").c();
                    th.field_F[24] = ho.a(vd.field_e, "", "collide_1").c();
                    th.field_F[22] = ho.a(vd.field_e, "", "laura_aaahhh").c();
                    th.field_F[14] = ho.a(vd.field_e, "", "laura_ow").c();
                    th.field_F[18] = ho.a(vd.field_e, "", "laura_woohoo").c();
                    th.field_F[17] = id.field_a.a("laura_yeah", -114, "");
                    th.field_F[4] = ho.a(vd.field_e, "", "laura_1").c();
                    th.field_F[3] = ho.a(vd.field_e, "", "laura_2").c();
                    th.field_F[2] = ho.a(vd.field_e, "", "laura_3").c();
                    vd.field_e = null;
                    cf.a(6639);
                    return false;
                }
                case 148: {
                    if (th.field_C == null) {
                        statePc = 150;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    df.a(39.0f, -87, pb.field_c);
                    this.b((byte) 73);
                    la.field_k[0] = new wl(ih.a(i.c((int) param1, -7922), "", id.field_a, th.field_C, "music/Torquing_Titlescreen"));
                    la.field_k[1] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_nursery_slopes"));
                    la.field_k[2] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_squared_away"));
                    la.field_k[3] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_next_steps"));
                    la.field_k[4] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_straight_and_narrow"));
                    la.field_k[5] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_bombing_along"));
                    la.field_k[6] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_amazing"));
                    la.field_k[7] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_circuitous_route"));
                    la.field_k[8] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/torquing_leap_of_faith"));
                    la.field_k[9] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/Torquing_Gamecomplete"));
                    la.field_k[10] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/Torquing Football Jingle"));
                    la.field_k[10].a(false);
                    la.field_k[11] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/Torquing_Levelcomplete"));
                    la.field_k[12] = new wl(ih.a(7828, "", id.field_a, th.field_C, "music/Torquing_Gameover"));
                    th.field_C = null;
                    id.field_a = null;
                    cf.a(6639);
                    return false;
                }
                case 150: {
                    if (null != he.field_b) {
                        statePc = 152;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 152: {
                    df.a(40.0f, 34, kf.field_D + " - 0%");
                    var54 = new fj(he.field_b.a(param1 + -18, "levels.tql", ""));
                    var55 = var54.h((byte) 126);
                    var5 = 0;
                    var6 = 1;
                    var7 = 0;
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (var7 >= var55.length()) {
                        statePc = 160;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    var8 = var55.charAt(var7);
                    if (var8 == 10) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    var5 = 0;
                    statePc = 159;
                    continue stateLoop;
                }
                case 156: {
                    if (var5 == 0) {
                        statePc = 158;
                    } else {
                        statePc = 157;
                    }
                    continue stateLoop;
                }
                case 157: {
                    var6++;
                    statePc = 158;
                    continue stateLoop;
                }
                case 158: {
                    var5 = 1;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    var7++;
                    statePc = 153;
                    continue stateLoop;
                }
                case 160: {
                    qc.field_ab = new int[var6];
                    mh.field_k = new int[var6];
                    var56 = new StringBuilder(8192);
                    var8 = 0;
                    var9 = 0;
                    var10_ref = null;
                    var11 = 0;
                    statePc = 161;
                    continue stateLoop;
                }
                case 161: {
                    if (var11 >= var55.length()) {
                        statePc = 171;
                    } else {
                        statePc = 162;
                    }
                    continue stateLoop;
                }
                case 162: {
                    var12 = var55.charAt(var11);
                    stackIn_261_0 = var12;
                    stackIn_163_0 = stackIn_261_0;
                    stackIn_261_1 = 10;
                    stackIn_163_1 = stackIn_261_1;
                    if (false) {
                        statePc = 261;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    if (stackIn_163_0 == stackIn_163_1) {
                        statePc = 165;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    discarded$1 = var56.append((char) var12);
                    statePc = 170;
                    continue stateLoop;
                }
                case 165: {
                    if (var56.length() != 0) {
                        statePc = 167;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var8++;
                    statePc = 170;
                    continue stateLoop;
                }
                case 167: {
                    var57 = new hc(var8, var56.toString());
                    var56.setLength(0);
                    qc.field_ab[var8] = qc.field_ab[var8] + 1;
                    var9++;
                    if (var10_ref != null) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    jm.field_d = var57;
                    var10_ref = var57;
                    statePc = 170;
                    continue stateLoop;
                }
                case 169: {
                    ((hc) (var10_ref)).field_m = var57;
                    var10_ref = var57;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    var11++;
                    statePc = 161;
                    continue stateLoop;
                }
                case 171: {
                    wi.field_a = new int[var9];
                    hg.field_d = new int[var9];
                    mk.field_c = new int[qc.field_ab.length];
                    var11 = 0;
                    var8 = 0;
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    if (qc.field_ab.length <= var8) {
                        statePc = 177;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    mk.field_c[var8] = var11;
                    var31 = 0;
                    var12 = var31;
                    statePc = 174;
                    continue stateLoop;
                }
                case 174: {
                    if ((var31 ^ -1) <= (qc.field_ab[var8] ^ -1)) {
                        statePc = 176;
                    } else {
                        statePc = 175;
                    }
                    continue stateLoop;
                }
                case 175: {
                    hg.field_d[var11] = var31;
                    incrementValue$2 = var11;
                    var11++;
                    wi.field_a[incrementValue$2] = var8;
                    var31++;
                    statePc = 174;
                    continue stateLoop;
                }
                case 176: {
                    var8++;
                    statePc = 172;
                    continue stateLoop;
                }
                case 177: {
                    he.field_b = null;
                    cf.a(6639);
                    return false;
                }
                case 178: {
                    if (-1 <= (wp.field_w ^ -1)) {
                        statePc = 214;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (eg.field_t == null) {
                        statePc = 214;
                    } else {
                        statePc = 180;
                    }
                    continue stateLoop;
                }
                case 180: {
                    df.a(40.0f, 81, kf.field_D + " - 0%");
                    if (cc.field_d != null) {
                        statePc = 182;
                    } else {
                        statePc = 181;
                    }
                    continue stateLoop;
                }
                case 181: {
                    cc.field_d = fa.a(2, 13, 27375, 0);
                    statePc = 182;
                    continue stateLoop;
                }
                case 182: {
                    var3_array = cc.field_d.field_j;
                    if (var3_array != null) {
                        statePc = 184;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    return false;
                }
                case 184: {
                    var66 = eg.field_t.a(var3_array, (byte) -97, "", "levels.tql");
                    var58 = var66;
                    var4_ref_byte__ = var58;
                    if (var4_ref_byte__ == null) {
                        statePc = 186;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 186: {
                    return false;
                }
                case 187: {
                    var59 = new fj(var66);
                    var60 = var59.h((byte) 118);
                    var7 = 0;
                    var8 = qc.field_ab.length + 1;
                    var9 = 0;
                    statePc = 188;
                    continue stateLoop;
                }
                case 188: {
                    if ((var60.length() ^ -1) >= (var9 ^ -1)) {
                        statePc = 195;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    var10 = var60.charAt(var9);
                    if (10 != var10) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (var7 == 0) {
                        statePc = 192;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    var8++;
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    var7 = 1;
                    statePc = 194;
                    continue stateLoop;
                }
                case 193: {
                    var7 = 0;
                    statePc = 194;
                    continue stateLoop;
                }
                case 194: {
                    var9++;
                    statePc = 188;
                    continue stateLoop;
                }
                case 195: {
                    var9 = qc.field_ab.length;
                    var10 = 1;
                    var11_ref_int__ = new int[var8];
                    dk.a(qc.field_ab, 0, var11_ref_int__, 0, qc.field_ab.length);
                    qc.field_ab = var11_ref_int__;
                    var12_ref_int__ = new int[var8];
                    dk.a(mh.field_k, 0, var12_ref_int__, 0, mh.field_k.length);
                    mh.field_k = var12_ref_int__;
                    var13_ref = new StringBuilder(8192);
                    var14 = jm.field_d;
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    if (var14.field_m == null) {
                        statePc = 198;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    var14 = var14.field_m;
                    var10++;
                    statePc = 196;
                    continue stateLoop;
                }
                case 198: {
                    var15 = 0;
                    statePc = 199;
                    continue stateLoop;
                }
                case 199: {
                    if (var15 >= var60.length()) {
                        statePc = 207;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 200: {
                    var16 = var60.charAt(var15);
                    stackIn_269_0 = var16 ^ -1;
                    stackIn_201_0 = stackIn_269_0;
                    stackIn_269_1 = -11;
                    stackIn_201_1 = stackIn_269_1;
                    if (false) {
                        statePc = 269;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (stackIn_201_0 == stackIn_201_1) {
                        statePc = 203;
                    } else {
                        statePc = 202;
                    }
                    continue stateLoop;
                }
                case 202: {
                    discarded$3 = var13_ref.append((char) var16);
                    statePc = 206;
                    continue stateLoop;
                }
                case 203: {
                    if (-1 != (var13_ref.length() ^ -1)) {
                        statePc = 205;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 204: {
                    var9++;
                    statePc = 206;
                    continue stateLoop;
                }
                case 205: {
                    var61 = new hc(var9, var13_ref.toString());
                    var13_ref = new StringBuilder(8192);
                    qc.field_ab[var9] = qc.field_ab[var9] + 1;
                    var10++;
                    var14.field_m = var61;
                    var14 = var61;
                    statePc = 206;
                    continue stateLoop;
                }
                case 206: {
                    var15++;
                    statePc = 199;
                    continue stateLoop;
                }
                case 207: {
                    hg.field_d = new int[var10];
                    wi.field_a = new int[var10];
                    mk.field_c = new int[qc.field_ab.length];
                    var15 = 0;
                    var9 = 0;
                    statePc = 208;
                    continue stateLoop;
                }
                case 208: {
                    if (qc.field_ab.length <= var9) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    mk.field_c[var9] = var15;
                    var32 = 0;
                    var16 = var32;
                    statePc = 210;
                    continue stateLoop;
                }
                case 210: {
                    if ((var32 ^ -1) <= (qc.field_ab[var9] ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 211;
                    }
                    continue stateLoop;
                }
                case 211: {
                    hg.field_d[var15] = var32;
                    incrementValue$4 = var15;
                    var15++;
                    wi.field_a[incrementValue$4] = var9;
                    var32++;
                    statePc = 210;
                    continue stateLoop;
                }
                case 212: {
                    var9++;
                    statePc = 208;
                    continue stateLoop;
                }
                case 213: {
                    ti.field_l = null;
                    eg.field_t = null;
                    cf.a(6639);
                    return false;
                }
                case 214: {
                    if (!lp.field_f) {
                        statePc = 216;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 216: {
                    var3_int = 0;
                    var4_ref_hc = jm.field_d;
                    statePc = 217;
                    continue stateLoop;
                }
                case 217: {
                    if (var4_ref_hc == null) {
                        statePc = 225;
                    } else {
                        statePc = 218;
                    }
                    continue stateLoop;
                }
                case 218: {
                    stackOut_218_0 = var4_ref_hc.e(0);
                    stackIn_226_0 = stackOut_218_0 ? 1 : 0;
                    stackIn_219_0 = stackOut_218_0;
                    if (false) {
                        statePc = 226;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    if (!stackIn_219_0) {
                        statePc = 223;
                    } else {
                        statePc = 220;
                    }
                    continue stateLoop;
                }
                case 220: {
                    if (!var4_ref_hc.b(param1 ^ -15)) {
                        statePc = 223;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    if (!var4_ref_hc.g(1)) {
                        statePc = 223;
                    } else {
                        statePc = 224;
                    }
                    continue stateLoop;
                }
                case 223: {
                    df.a((float)(var3_int * 60 / hg.field_d.length + 40), 51, kf.field_D + " - " + 100 * var3_int / hg.field_d.length + "%");
                    return false;
                }
                case 224: {
                    var3_int++;
                    var4_ref_hc = var4_ref_hc.field_m;
                    statePc = 217;
                    continue stateLoop;
                }
                case 225: {
                    ol.field_f = new hc[var3_int];
                    stackIn_226_0 = 0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var3_int = stackIn_226_0;
                    var4_ref_hc = jm.field_d;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (var4_ref_hc == null) {
                        statePc = 229;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    incrementValue$5 = var3_int;
                    var3_int++;
                    ol.field_f[incrementValue$5] = var4_ref_hc;
                    var4_ref_hc = var4_ref_hc.field_m;
                    statePc = 227;
                    continue stateLoop;
                }
                case 229: {
                    if (be.field_a[0] == 0) {
                        statePc = 231;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 231: {
                    be.a();
                    be.a(1.0f);
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    lp.field_f = true;
                    cf.a(param1 ^ -6539);
                    return false;
                }
                case 233: {
                    if (null == ig.field_q) {
                        statePc = 235;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 235: {
                    ig.field_q = new hc(8, "ZU##############################55555555################################################5555555555###############################################55######555#############################################555#######55#############################################55########555############################################555########55#############################################555######555##############################################55######55########################################################################################################5555####################################################5555555###########55555#################################555##5555#########55555555###############################55#####55########55#####555##############################555####55########55#######55##############################555##555#######55########55###############################555555########55#########55################################555##########55##55###555############################################5555555###55####################################5#######55555555##################################555555555################################################55555555##########5555########################################5555########555555#########################################55#######555##555#################################555555555#######55#####55################################55555555########555###555#####################################5555########55555555#######################################55#######555555555################################555555555#######55#######################################55555555########################################################################5#############################555########5########555555555############################555555555555########55555555###############################5555555555#############5555#################################55###555##############55################################55#####55#######555555555################################5555##55########55555555##################################555555##############5555###################################555#################55################################################555555555################################5555555555555###55555555##################################55555555555#################55############################################55555######55############################55555##########5555555##################################5555555########55555#555################################55555#555#######55#555#55################################55#555#55#######555#55555################################555#55555########55##555##################################55##555################################################################################################################5########################################################55##################################################555555555###############################################5555555555###############################################555####55#################################################55#################################################################################################################55555###################################################5555555#################################################55555#555################################################55#555#55################################################555#55555#################################################55##555#####################fEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfE0007wQ5Y0cw00");
                    cf.a(6639);
                    return false;
                }
                case 236: {
                    if (ig.field_q.e(param1 ^ -102)) {
                        statePc = 238;
                    } else {
                        statePc = 237;
                    }
                    continue stateLoop;
                }
                case 237: {
                    cf.a(6639);
                    return false;
                }
                case 238: {
                    if (null != hg.field_b) {
                        statePc = 240;
                    } else {
                        statePc = 239;
                    }
                    continue stateLoop;
                }
                case 239: {
                    lc.d(param1 ^ 1339942777);
                    kl.field_p = null;
                    cf.a(param1 + 6741);
                    return false;
                }
                case 240: {
                    if (vo.field_f != null) {
                        statePc = 245;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    vo.field_f = new mh[12];
                    fn.field_c = 0;
                    var3_int = 0;
                    statePc = 242;
                    continue stateLoop;
                }
                case 242: {
                    if (var3_int >= 12) {
                        statePc = 244;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    vo.field_f[var3_int] = new mh((Torquing) (this), var3_int);
                    var3_int++;
                    statePc = 242;
                    continue stateLoop;
                }
                case 244: {
                    bn.field_h = 0;
                    cf.a(6639);
                    return false;
                }
                case 245: {
                    if (param1 == -102) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    var28 = (fj) null;
                    Torquing.a(-38, -61, (fj) null);
                    return true;
                }
                case 247: {
                    return true;
                }
                case 248: {
                    vc.field_c[var4].field_l.field_m = (short[]) ((Object) var3_array);
                    var4++;
                    statePc = 251;
                    continue stateLoop;
                }
                case 249: {
                    if (stackIn_249_0 > stackIn_249_1) {
                        statePc = 94;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 251: {
                    stackIn_249_0 = var4;
                    stackIn_249_1 = 16;
                    statePc = 249;
                    continue stateLoop;
                }
                case 252: {
                    ln.a((byte) 120, var10 * 640 >> 1975801795);
                    var10++;
                    statePc = 255;
                    continue stateLoop;
                }
                case 253: {
                    if (stackIn_253_0 >= stackIn_253_1) {
                        statePc = 135;
                    } else {
                        statePc = 252;
                    }
                    continue stateLoop;
                }
                case 255: {
                    stackIn_253_0 = var10;
                    stackIn_253_1 = 8;
                    statePc = 253;
                    continue stateLoop;
                }
                case 256: {
                    hg.field_d[var11] = var31;
                    incrementValue$6 = var11;
                    var11++;
                    wi.field_a[incrementValue$6] = var8;
                    var31++;
                    statePc = 258;
                    continue stateLoop;
                }
                case 257: {
                    var8++;
                    statePc = 263;
                    continue stateLoop;
                }
                case 258: {
                    if ((var31 ^ -1) <= (qc.field_ab[var8] ^ -1)) {
                        statePc = 257;
                    } else {
                        statePc = 256;
                    }
                    continue stateLoop;
                }
                case 260: {
                    mk.field_c[var8] = var11;
                    var31 = 0;
                    var12 = var31;
                    statePc = 258;
                    continue stateLoop;
                }
                case 261: {
                    if (stackIn_261_0 <= stackIn_261_1) {
                        statePc = 177;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 263: {
                    stackIn_261_0 = qc.field_ab.length;
                    stackIn_261_1 = var8;
                    statePc = 261;
                    continue stateLoop;
                }
                case 264: {
                    hg.field_d[var15] = var32;
                    incrementValue$7 = var15;
                    var15++;
                    wi.field_a[incrementValue$7] = var9;
                    var32++;
                    statePc = 266;
                    continue stateLoop;
                }
                case 265: {
                    var9++;
                    statePc = 271;
                    continue stateLoop;
                }
                case 266: {
                    if ((var32 ^ -1) <= (qc.field_ab[var9] ^ -1)) {
                        statePc = 265;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 268: {
                    mk.field_c[var9] = var15;
                    var32 = 0;
                    var16 = var32;
                    statePc = 266;
                    continue stateLoop;
                }
                case 269: {
                    if (stackIn_269_0 <= stackIn_269_1) {
                        statePc = 213;
                    } else {
                        statePc = 268;
                    }
                    continue stateLoop;
                }
                case 271: {
                    stackIn_269_0 = qc.field_ab.length;
                    stackIn_269_1 = var9;
                    statePc = 269;
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void f(byte param0) {
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_141_0 = 0;
        long var2;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        hc var12;
        int var13;
        var13 = field_u;
        var2 = km.b(-1);
        oo.field_b = oo.field_b + 1;
        ed.a(0);
        var4 = 0;
        L0: while (true) {
          L1: {
            if (!np.a((byte) -13)) {
              stackIn_9_0 = 0;
              stackIn_9_1 = ta.field_o;
              break L1;
            } else {
              stackIn_9_0 = e.field_f ^ -1;

              stackIn_9_1 = -14;

              L2: {
                if (stackIn_9_0 == stackIn_9_1) {
                  break L2;
                } else {
                  if (-85 == (e.field_f ^ -1)) {
                    break L2;
                  } else {
                    if (83 == e.field_f) {
                      break L2;
                    } else {
                      continue L0;
                    }
                  }
                }
              }
              var4 = 1;
              continue L0;
            }
          }
          L3: {
            if (stackIn_9_0 == stackIn_9_1) {
              stackIn_12_0 = 0;
              break L3;
            } else {
              stackIn_12_0 = 1;
              break L3;
            }
          }
          L4: {
            var5 = stackIn_12_0;
            var6 = 1;
            if (fn.field_c != -1) {
              L5: {
                if (!vo.field_f[fn.field_c].field_a.field_k) {
                  stackIn_17_0 = 0;
                  break L5;
                } else {
                  stackIn_17_0 = 1;
                  break L5;
                }
              }
              var6 = stackIn_17_0;
              break L4;
            } else {
              break L4;
            }
          }
          L6: {
            var11 = bn.field_h;
            if ((var11 ^ -1) != -1) {
              if (-3 == (var11 ^ -1)) {
                L7: {
                  if (1 == oo.field_b) {
                    L8: {
                      if ((tm.field_c ^ -1) == -12) {
                        pl.a((byte) -120, true);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (2 == tm.field_c) {
                      vl.field_c = null;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                if ((oo.field_b >> 1640893537 ^ -1) != (tm.field_b ^ -1)) {
                  break L6;
                } else {
                  ie.field_b.field_e.a(param0 + 108);
                  bn.field_h = -1;
                  fn.field_c = tm.field_c;
                  vo.field_f[fn.field_c].field_i = 0;
                  break L6;
                }
              } else {
                if (var11 != 1) {
                  if (10 != var11) {
                    if (3 != var11) {
                      if (var11 == 7) {
                        if (250 <= oo.field_b) {
                          this.a(true, ie.field_b.field_L, 5, var6 != 0);
                          break L6;
                        } else {
                          L9: {
                            if ((oo.field_b ^ -1) >= (2 * tm.field_b ^ -1)) {
                              break L9;
                            } else {
                              if (var5 == 0) {
                                break L9;
                              } else {
                                this.a(true, ie.field_b.field_L, 5, true);
                                break L6;
                              }
                            }
                          }
                          if ((2 * tm.field_b ^ -1) <= (oo.field_b ^ -1)) {
                            break L6;
                          } else {
                            if (var4 != 0) {
                              this.a(true, ie.field_b.field_L, 5, false);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                      } else {
                        if (var11 == 4) {
                          L10: {
                            var11 = 0;
                            if ((ie.field_b.field_L ^ -1) != (tm.field_c ^ -1)) {
                              var12 = ie.field_b.field_d.field_m;
                              break L10;
                            } else {
                              var12 = ie.field_b.field_d;
                              break L10;
                            }
                          }
                          L11: {
                            if (var12.field_e == null) {
                              break L11;
                            } else {
                              var11 = 2 * var12.field_e.a(false);
                              break L11;
                            }
                          }
                          if (2 * tm.field_b < oo.field_b) {
                            if (var11 > oo.field_b) {
                              if (var5 != 0) {
                                this.a(true, ie.field_b.field_L, 5, true);
                                break L6;
                              } else {
                                if (var4 != 0) {
                                  this.a(true, ie.field_b.field_L, 5, false);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                            } else {
                              this.a(true, ie.field_b.field_L, 5, var6 != 0);
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        } else {
                          if (6 != var11) {
                            if (var11 != 11) {
                              if (-13 != (var11 ^ -1)) {
                                if (var11 == 5) {
                                  if ((tm.field_b ^ -1) >= (oo.field_b / 2 ^ -1)) {
                                    bn.field_h = -1;
                                    jh.a(la.field_k[ie.field_b.field_q], 0);
                                    break L6;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  if (var11 == 8) {
                                    L12: {
                                      var9 = 0;
                                      if (-1 + qc.field_ab.length != tm.field_c) {
                                        stackIn_137_0 = 0;
                                        break L12;
                                      } else {
                                        stackIn_137_0 = 1;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      L14: {
                                        var7 = stackIn_137_0;
                                        var10 = 0;
                                        if ((wp.field_w ^ -1) < -1) {
                                          break L14;
                                        } else {
                                          if ((tm.field_c ^ -1) != -2) {
                                            break L14;
                                          } else {
                                            stackIn_141_0 = 1;
                                            break L13;
                                          }
                                        }
                                      }
                                      stackIn_141_0 = 0;
                                      break L13;
                                    }
                                    L15: {
                                      var8 = stackIn_141_0;
                                      if (oo.field_b < 250) {
                                        L16: {
                                          if (tm.field_b * 2 >= oo.field_b) {
                                            break L16;
                                          } else {
                                            if (var5 == 0) {
                                              break L16;
                                            } else {
                                              var9 = 1;
                                              var10 = 1;
                                              break L15;
                                            }
                                          }
                                        }
                                        if ((oo.field_b ^ -1) >= (2 * tm.field_b ^ -1)) {
                                          break L15;
                                        } else {
                                          if (var4 != 0) {
                                            var9 = 0;
                                            var10 = 1;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      } else {
                                        var9 = var6;
                                        var10 = 1;
                                        break L15;
                                      }
                                    }
                                    if (var10 == 0) {
                                      if (var7 == 0) {
                                        break L6;
                                      } else {
                                        if (tm.field_b * 2 == oo.field_b) {
                                          ie.field_b.d(1);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    } else {
                                      if (var8 != 0) {
                                        ie.field_b.b(9);
                                        this.a(true, 10, 12, var9 != 0);
                                        break L6;
                                      } else {
                                        if (var7 != 0) {
                                          this.a(true, tm.field_c, 11, var9 != 0);
                                          break L6;
                                        } else {
                                          this.a(true, 1 + tm.field_c, 9, var9 != 0);
                                          break L6;
                                        }
                                      }
                                    }
                                  } else {
                                    if (9 != var11) {
                                      break L6;
                                    } else {
                                      if (oo.field_b == 2 * tm.field_b) {
                                        ie.field_b.d(param0 + 109);
                                        cf.a(6639);
                                        break L6;
                                      } else {
                                        if (250 > oo.field_b) {
                                          L17: {
                                            if ((tm.field_b * 2 ^ -1) <= (oo.field_b ^ -1)) {
                                              break L17;
                                            } else {
                                              if (var5 != 0) {
                                                this.a(true, ie.field_b.field_L, 4, true);
                                                break L6;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          if ((2 * tm.field_b ^ -1) <= (oo.field_b ^ -1)) {
                                            break L6;
                                          } else {
                                            if (var4 == 0) {
                                              break L6;
                                            } else {
                                              this.a(true, ie.field_b.field_L, 4, false);
                                              break L6;
                                            }
                                          }
                                        } else {
                                          this.a(true, ie.field_b.field_L, 4, var6 != 0);
                                          break L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  if (oo.field_b != 1) {
                                    break L18;
                                  } else {
                                    L19: {
                                      if (-12 == (tm.field_c ^ -1)) {
                                        pl.a((byte) -97, true);
                                        break L19;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    if (2 == tm.field_c) {
                                      vl.field_c = null;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                if (oo.field_b >> 1452251169 != tm.field_b) {
                                  break L6;
                                } else {
                                  fn.field_c = tm.field_c;
                                  bn.field_h = -1;
                                  vo.field_f[fn.field_c].field_i = 0;
                                  break L6;
                                }
                              }
                            } else {
                              if (tm.field_b <= oo.field_b / 2) {
                                bn.field_h = -1;
                                jh.a(la.field_k[ie.field_b.field_q], 0);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          } else {
                            L20: {
                              var11 = 0;
                              if ((tm.field_c ^ -1) == (ie.field_b.field_L ^ -1)) {
                                var12 = ie.field_b.field_d;
                                break L20;
                              } else {
                                var12 = ie.field_b.field_d.field_m;
                                break L20;
                              }
                            }
                            L21: {
                              if (var12.field_e != null) {
                                var11 = 2 * var12.field_e.a(false);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            if (tm.field_b * 2 != oo.field_b) {
                              if ((2 * tm.field_b ^ -1) > (oo.field_b ^ -1)) {
                                L22: {
                                  if (la.field_k[11].e(17)) {
                                    break L22;
                                  } else {
                                    if ((var11 ^ -1) >= (oo.field_b ^ -1)) {
                                      this.a(true, tm.field_c, 5, var6 != 0);
                                      break L6;
                                    } else {
                                      break L22;
                                    }
                                  }
                                }
                                if (var5 != 0) {
                                  this.a(true, tm.field_c, 5, true);
                                  break L6;
                                } else {
                                  if (var4 == 0) {
                                    break L6;
                                  } else {
                                    this.a(true, tm.field_c, 5, false);
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              ie.field_b.d(1);
                              cf.a(6639);
                              break L6;
                            }
                          }
                        }
                      }
                    } else {
                      if ((oo.field_b ^ -1) > -251) {
                        L23: {
                          if (tm.field_b * 2 >= oo.field_b) {
                            break L23;
                          } else {
                            if (var5 != 0) {
                              fn.field_c = -1;
                              this.a(true, ie.field_b.field_L, 4, true);
                              break L6;
                            } else {
                              break L23;
                            }
                          }
                        }
                        if ((2 * tm.field_b ^ -1) <= (oo.field_b ^ -1)) {
                          break L6;
                        } else {
                          if (var4 == 0) {
                            break L6;
                          } else {
                            fn.field_c = -1;
                            this.a(true, ie.field_b.field_L, 4, false);
                            break L6;
                          }
                        }
                      } else {
                        fn.field_c = -1;
                        this.a(true, ie.field_b.field_L, 4, var6 != 0);
                        break L6;
                      }
                    }
                  } else {
                    if (tm.field_b == oo.field_b >> -723760959) {
                      L24: {
                        if (-4 != (fn.field_c ^ -1)) {
                          break L24;
                        } else {
                          gn.field_l = null;
                          break L24;
                        }
                      }
                      bn.field_h = -1;
                      fn.field_c = -1;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                } else {
                  L25: {
                    if ((oo.field_b ^ -1) != -2) {
                      break L25;
                    } else {
                      L26: {
                        if (tm.field_c != 11) {
                          break L26;
                        } else {
                          pl.a((byte) -128, true);
                          break L26;
                        }
                      }
                      if (2 != tm.field_c) {
                        break L25;
                      } else {
                        vl.field_c = null;
                        break L25;
                      }
                    }
                  }
                  if (oo.field_b >> 47432129 == tm.field_b) {
                    L27: {
                      if (3 != fn.field_c) {
                        break L27;
                      } else {
                        gn.field_l = null;
                        break L27;
                      }
                    }
                    L28: {
                      if (11 != tm.field_c) {
                        break L28;
                      } else {
                        if (!je.a((byte) 76)) {
                          break L28;
                        } else {
                          ie.field_b = null;
                          jh.field_y.a(0);
                          nh.field_k = 0;
                          fa.field_b = 0;
                          ao.field_f = 0;
                          bo.field_l.a(param0 ^ -108);
                          break L28;
                        }
                      }
                    }
                    bn.field_h = -1;
                    fn.field_c = tm.field_c;
                    vo.field_f[fn.field_c].field_i = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            } else {
              am.a(75);
              if (!hj.field_b) {
                break L6;
              } else {
                bn.field_h = -1;
                break L6;
              }
            }
          }
          L29: {
            if (param0 == -108) {
              break L29;
            } else {
              this.b(-99, 74);
              break L29;
            }
          }
          L30: {
            if (bn.field_h == 0) {
              break L30;
            } else {
              if (-3L < (-var2 + km.b(param0 ^ 107) ^ -1L)) {
                cf.a(param0 + 6747);
                break L30;
              } else {
                break L30;
              }
            }
          }
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        L0: {
          L1: {
            if (-2 == (param2 ^ -1)) {
              break L1;
            } else {
              if (2 == param2) {
                break L1;
              } else {
                if (-13 != (param2 ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if ((param1 ^ -1) != 0) {
            L2: {
              L3: {
                if (param1 == 0) {
                  break L3;
                } else {
                  if (2 == param1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              jh.a(la.field_k[0], 0);
              break L2;
            }
            vo.field_f[param1].a((byte) 94, param3);
            break L0;
          } else {
            return;
          }
        }
        if (param0) {
          np.a(-1, -32596, 0);
          oo.field_b = 0;
          bn.field_h = param2;
          this.field_t = null;
          tm.field_c = param1;
          this.f((byte) -108);
          return;
        } else {
          return;
        }
    }

    private final void o(int param0) {
        int var3 = 0;
        int var4 = field_u;
        oe.a(50, (byte) 44);
        oi.a(50, (byte) 80);
        tb.a(50, -128);
        no.c(-101);
        jh.a(la.field_k[0], 0);
        int var2 = tm.field_b;
        ul.field_b = new int[var2];
        for (var3 = 1; (var3 ^ -1) > (var2 ^ -1); var3++) {
            ul.field_b[var3] = i.c(65535, vi.field_a[-var3 + var2]);
        }
        if (param0 <= 69) {
            this.field_t = (uf) null;
        }
        ok.a((byte) -124);
    }

    final void b(byte param0) {
        Object stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_46_0 = 0;
        Object var2;
        tj var3_ref_tj;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = field_u;
          if (null != dg.field_i) {
            stackIn_3_0 = dg.field_i;
            break L0;
          } else {
            stackIn_3_0 = k.field_d;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (!sf.a(-1)) {
          if (ee.field_s) {
            L1: {
              if (null != kg.field_c) {
                break L1;
              } else {
                if (null == kb.field_f) {
                  L2: {
                    if (bn.field_h != -1) {
                      this.r(3);
                      break L2;
                    } else {
                      if (fn.field_c == -1) {
                        ie.field_b.a(false);
                        break L2;
                      } else {
                        vo.field_f[fn.field_c].c(93);
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (ie.field_b != null) {
                      var3_ref_tj = (tj) ((Object) ie.field_b.field_B.b(0));
                      if (var3_ref_tj == null) {
                        break L3;
                      } else {
                        L4: {
                          var5 = ie.field_b.field_n;
                          if (-81 >= (var5 ^ -1)) {
                            if ((var5 ^ -1) > -231) {
                              var4 = 8;
                              break L4;
                            } else {
                              var4 = 123 + -(var5 / 2);
                              break L4;
                            }
                          } else {
                            var4 = var5 / 2 + -32;
                            break L4;
                          }
                        }
                        tj.field_n[var3_ref_tj.field_k].e(8, var4);
                        um.field_m.b(k.field_b[var3_ref_tj.field_k], 48, var4 - -um.field_m.field_x, 0, -1);
                        i.field_N.b(k.field_b[var3_ref_tj.field_k], 48, var4 - -um.field_m.field_x, 16777215, -1);
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (param0 == 73) {
                    L5: {
                      if (!on.b(160)) {
                        break L5;
                      } else {
                        ph.c(0, 0, ph.field_j, ph.field_d);
                        qk.a(14, 14, s.field_t, (byte) -4);
                        break L5;
                      }
                    }
                    L6: {
                      if (pb.field_e != -1) {
                        var3 = oo.field_b << 2032996227;
                        if (var3 > 0) {
                          ph.b(0, 0, ph.field_j, ph.field_d, 0, var3);
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (!hh.a(64)) {
                        break L7;
                      } else {
                        if (on.b(160)) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              if (dg.field_i != null) {
                                break L9;
                              } else {
                                if (!ae.field_ib) {
                                  stackIn_46_0 = 0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            stackIn_46_0 = 1;
                            break L8;
                          }
                          oo.a(stackIn_46_0 != 0, -25564);
                          break L7;
                        }
                      }
                    }
                    ni.a((java.awt.Canvas) (var2), 0, 0, -122);
                    return;
                  } else {
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            df.a(100.0f, 11, ci.field_d);
            ji.a((byte) -99, (java.awt.Canvas) (var2));
            return;
          } else {
            ji.a((byte) -99, (java.awt.Canvas) (var2));
            return;
          }
        } else {
          L10: {
            L11: {
              stackIn_7_0 = var2;

              if (dg.field_i != null) {
                break L11;
              } else {


                if (!ae.field_ib) {
                  stackIn_9_0 = stackIn_7_0;
                  stackIn_9_1 = 0;
                  break L10;
                } else {

                  break L11;
                }
              }
            }
            stackIn_9_0 = stackIn_7_0;
            stackIn_9_1 = 1;
            break L10;
          }
          ii.a((java.awt.Canvas) ((Object) stackIn_9_0), stackIn_9_1 != 0, (byte) -19);
          return;
        }
    }

    private final void a(int param0, int param1) {
        uf dupTemp$0 = null;
        uf var5 = null;
        hc var4 = null;
        int var3 = wi.field_a[param0];
        k.a(var3, 1);
        nc.a(var3, true);
        qc.field_cb.a((byte) 90, 0, 0);
        wh.field_t[var3].a(0, 0, 76);
        pm.field_m[var3].a(0, 0);
        mh.field_d[var3].a(0, 0, 76);
        if (param1 != 22517) {
            this.q(-66);
        }
        ml.field_a[var3].a(0, 0);
        if ((ie.field_b.field_L ^ -1) == (param0 ^ -1)) {
            var4 = ie.field_b.field_d;
        } else {
            var4 = ie.field_b.field_d.field_m;
        }
        if (var4.field_e == null) {
            dupTemp$0 = new uf(i.field_Q, 0, 372, 286, ml.field_a[var3], -34, -159);
            var4.field_e = dupTemp$0;
            var5 = dupTemp$0;
            var5.a((byte) -59, 30);
            var5.a(false, ff.a(new String[]{Integer.toString(1 + var3), Integer.toString(hg.field_d[param0] + 1)}, 0, qj.field_b));
            var5.a((byte) -50, 40);
            this.a(0, var4, var5);
            var5.a(30, wj.field_k.field_d, 111);
            var5.c(param1 ^ 22517);
        }
        var4.field_e.b(34, -127, 159);
        wj.field_k.a(-(wj.field_k.field_c / 2) + 219, 414);
        qh.field_c.a(kk.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, (dd.field_c.field_x * 3 - -3) / 2);
        ph.c(0, 0, 640, 480, 16777215);
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        mh dupTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mh stackIn_108_0 = null;
        mh stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = field_u;
          la.field_c.b();
          qd.field_b.b();
          if (dg.field_i == null) {
            break L0;
          } else {
            if (dg.field_i.field_b) {
              ug.a(-95);
              s.b(-23658);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackIn_6_0 = this;

          stackIn_6_1 = 23;

          if (null == dg.field_i) {
            stackIn_7_0 = this;
            stackIn_7_1 = stackIn_6_1;
            stackIn_7_2 = 0;
            break L1;
          } else {
            stackIn_7_0 = this;
            stackIn_7_1 = stackIn_6_1;
            stackIn_7_2 = 1;
            break L1;
          }
        }
        L2: {
          this.a((byte) stackIn_7_1, stackIn_7_2 != 0);
          if (w.field_F) {
            this.s(26418);
            w.field_F = false;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = 0;
          if (!sf.a(-1)) {
            if (!ee.field_s) {
              ue.a(-16513, da.field_g);
              if (this.b(true, (byte) -102)) {
                this.o(122);
                ee.field_s = true;
                break L3;
              } else {
                break L3;
              }
            } else {
              if (null == kg.field_c) {
                if (kb.field_f == null) {
                  if (on.b(160)) {
                    if (0 == (pb.field_e ^ -1)) {
                      L4: {
                        var3 = ua.a(false);
                        if ((var3 ^ -1) != -4) {
                          if (-3 != (var3 ^ -1)) {
                            if ((var3 ^ -1) == -5) {
                              pb.field_e = 4;
                              oo.field_b = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            ug.a(-114);
                            break L4;
                          }
                        } else {
                          hm.a(true, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, um.field_m.field_x * 3 / 2, 240);
                          break L4;
                        }
                      }
                      if (on.b(160)) {
                        break L3;
                      } else {
                        vo.field_f[fn.field_c].a((byte) 82, true);
                        break L3;
                      }
                    } else {
                      var2 = 1;
                      break L3;
                    }
                  } else {
                    if (!hh.a(64)) {
                      var2 = 1;
                      break L3;
                    } else {
                      L5: {
                        stackIn_42_0 = this;

                        if (dg.field_i == null) {
                          stackIn_43_0 = this;
                          stackIn_43_1 = 0;
                          break L5;
                        } else {
                          stackIn_43_0 = this;
                          stackIn_43_1 = 1;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          var3 = this.b(stackIn_43_1 != 0, -92);
                          if ((var3 ^ -1) == -2) {
                            break L7;
                          } else {
                            if (-3 != (var3 ^ -1)) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (dg.field_i != null) {
                            ug.a(-113);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        if (-3 != (var3 ^ -1)) {
                          break L6;
                        } else {
                          to.a(ip.a(param0 + 39), -97);
                          break L3;
                        }
                      }
                      break L3;
                    }
                  }
                } else {
                  if (kb.field_f.field_n) {
                    L9: {
                      if (nh.field_k >= kb.field_f.field_k[0]) {
                        break L9;
                      } else {
                        nh.field_k = kb.field_f.field_k[0];
                        break L9;
                      }
                    }
                    L10: {
                      if (-1 > (wp.field_w ^ -1)) {
                        break L10;
                      } else {
                        if ((qc.field_ab[1] + qc.field_ab[0] ^ -1) < (nh.field_k ^ -1)) {
                          break L10;
                        } else {
                          nh.field_k = -1 + qc.field_ab[0] + qc.field_ab[1];
                          break L10;
                        }
                      }
                    }
                    kb.field_f = null;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              } else {
                if (kg.field_c.field_n) {
                  L11: {
                    ao.field_f = ao.field_f & (kg.field_c.field_m ^ -1);
                    fa.field_b = fa.field_b | kg.field_c.field_m;
                    kg.field_c = null;
                    pm.a((byte) 102);
                    if (fn.field_c != 8) {
                      break L11;
                    } else {
                      if (-1 == (ao.field_f ^ -1)) {
                        fn.field_c = 2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  c.a((Torquing) (this), 9072);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          } else {
            this.n(param0 + 126);
            if (sf.a(-1)) {
              if (!la.a(true)) {
                return;
              } else {
                L12: {
                  if (!ee.field_s) {
                    discarded$0 = this.b(false, (byte) -102);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            } else {
              if (je.a((byte) 69)) {
                break L3;
              } else {
                this.c(true);
                break L3;
              }
            }
          }
        }
        L13: {
          if (param0 == -30) {
            break L13;
          } else {
            field_v = (kk) null;
            break L13;
          }
        }
        L14: {
          L15: {
            if (var2 == 0) {
              break L15;
            } else {
              if ((pb.field_e ^ -1) == 0) {
                sg.field_o = sg.field_o + 1;
                if (-1 != bn.field_h) {
                  this.f((byte) -108);
                  break L15;
                } else {
                  if ((fn.field_c ^ -1) == 0) {
                    ie.field_b.i(40);
                    break L15;
                  } else {
                    L16: {
                      dupTemp$1 = vo.field_f[fn.field_c];
                      dupTemp$1.field_i = dupTemp$1.field_i + 1;
                      stackIn_108_0 = vo.field_f[fn.field_c];

                      if (0 != (bn.field_h ^ -1)) {
                        stackIn_109_0 = (mh) ((Object) stackIn_108_0);
                        stackIn_109_1 = 0;
                        break L16;
                      } else {
                        stackIn_109_0 = (mh) ((Object) stackIn_108_0);
                        stackIn_109_1 = 1;
                        break L16;
                      }
                    }
                    ((mh) (Object) stackIn_109_0).a(stackIn_109_1 != 0, -22807);
                    np.a(-1, -32596, 0);
                    break L15;
                  }
                }
              } else {
                if (0 == (1073741824 & pb.field_e)) {
                  fieldTemp$2 = oo.field_b + 1;
                  oo.field_b = oo.field_b + 1;
                  if (32 != fieldTemp$2) {
                    break L15;
                  } else {
                    L17: {
                      if (on.b(160)) {
                        mf.a(true);
                        break L17;
                      } else {
                        eb.a(-124);
                        break L17;
                      }
                    }
                    pb.field_e = pb.field_e | 1073741824;
                    break L15;
                  }
                } else {
                  fieldTemp$3 = oo.field_b;
                  oo.field_b = oo.field_b - 1;
                  if (32 != fieldTemp$3) {
                    if ((oo.field_b ^ -1) == -1) {
                      pb.field_e = -1;
                      break L15;
                    } else {
                      break L15;
                    }
                  } else {
                    L18: {
                      var3 = pb.field_e ^ 1073741824;
                      if (je.a((byte) 67)) {
                        break L18;
                      } else {
                        if (-1 != (var3 ^ -1)) {
                          if (1 == var3) {
                            fn.field_c = 2;
                            break L18;
                          } else {
                            if (var3 != 2) {
                              if (3 == var3) {
                                fn.field_c = 9;
                                break L18;
                              } else {
                                L19: {
                                  if ((var3 ^ -1) != -5) {
                                    break L19;
                                  } else {
                                    hm.a(true, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2, 240);
                                    break L19;
                                  }
                                }
                                L20: {
                                  L21: {
                                    bn.field_h = -1;
                                    if (null == ie.field_b) {
                                      break L21;
                                    } else {
                                      if (ie.field_b.field_B.b(0) == null) {
                                        break L21;
                                      } else {
                                        fieldTemp$4 = ie.field_b.field_n + 1;
                                        ie.field_b.field_n = ie.field_b.field_n + 1;
                                        if ((fieldTemp$4 ^ -1) != -336) {
                                          break L20;
                                        } else {
                                          ie.field_b.field_n = 0;
                                          ie.field_b.field_B.a((byte) -86);
                                          break L20;
                                        }
                                      }
                                    }
                                  }
                                  break L20;
                                }
                                L22: while (true) {
                                  if (!kg.a(nk.field_s, (byte) 21)) {
                                    break L14;
                                  } else {
                                    this.e((byte) -117);
                                    continue L22;
                                  }
                                }
                              }
                            } else {
                              fn.field_c = 6;
                              break L18;
                            }
                          }
                        } else {
                          ie.field_b.b(9);
                          if (fn.field_c == 7) {
                            fn.field_c = 2;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                      }
                    }
                    L23: {
                      if ((var3 ^ -1) != -5) {
                        break L23;
                      } else {
                        hm.a(true, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2, 240);
                        break L23;
                      }
                    }
                    bn.field_h = -1;
                    break L15;
                  }
                }
              }
            }
          }
          L24: {
            L25: {
              if (null == ie.field_b) {
                break L25;
              } else {
                if (ie.field_b.field_B.b(0) == null) {
                  break L25;
                } else {
                  fieldTemp$5 = ie.field_b.field_n + 1;
                  ie.field_b.field_n = ie.field_b.field_n + 1;
                  if ((fieldTemp$5 ^ -1) != -336) {
                    break L24;
                  } else {
                    ie.field_b.field_n = 0;
                    ie.field_b.field_B.a((byte) -86);
                    break L24;
                  }
                }
              }
            }
            break L24;
          }
          L26: while (true) {
            if (!kg.a(nk.field_s, (byte) 21)) {
              break L14;
            } else {
              this.e((byte) -117);
              continue L26;
            }
          }
        }
        L27: {
          jd.a((byte) -115, 0);
          if (!mk.a((byte) 38)) {
            break L27;
          } else {
            L28: {
              var3 = this.g(118);
              if ((var3 ^ -1) != -3) {
                break L28;
              } else {
                L29: {
                  if (bn.field_h != -1) {
                    break L29;
                  } else {
                    if (0 == (fn.field_c ^ -1)) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                lg.h(-122);
                break L27;
              }
            }
            break L27;
          }
        }
    }

    private final void c(boolean param0, int param1) {
        if (param0) {
            return;
        }
        k.a(param1, 1);
        nc.a(param1, true);
        qc.field_cb.a((byte) -40, 0, 0);
        wh.field_t[param1].a(0, 0, 76);
        pm.field_m[param1].a(0, 0);
        mh.field_d[param1].a(0, 0, 76);
        ml.field_a[param1].a(0, 0);
        pa.field_e[param1].a(0, 0);
        ph.c(0, 0, 640, 480, 16777215);
    }

    private final void r(int param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = field_u;
          if (param0 == 3) {
            break L0;
          } else {
            field_x = 119;
            break L0;
          }
        }
        if (0 != bn.field_h) {
          L1: {
            var2 = oo.field_b >> 865380609;
            if ((tm.field_b ^ -1) >= (var2 ^ -1)) {
              break L1;
            } else {
              L2: {
                L3: {
                  var3 = bn.field_h;
                  if (1 != var3) {
                    if ((var3 ^ -1) != -11) {
                      if (var3 != 3) {
                        if ((var3 ^ -1) == -8) {
                          break L3;
                        } else {
                          L4: {
                            if (var3 == 2) {
                              break L4;
                            } else {
                              if (6 != var3) {
                                if (8 != var3) {
                                  if ((var3 ^ -1) != -5) {
                                    if (var3 == 5) {
                                      this.a(tm.field_c, param0 + 22514);
                                      break L2;
                                    } else {
                                      if (var3 == 9) {
                                        this.b(90, tm.field_c - 1);
                                        break L2;
                                      } else {
                                        if (-12 != (var3 ^ -1)) {
                                          if (-13 == (var3 ^ -1)) {
                                            this.b(96, 1);
                                            break L2;
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          this.b(param0 + 98, tm.field_c);
                                          break L2;
                                        }
                                      }
                                    }
                                  } else {
                                    this.c(false, wi.field_a[tm.field_c]);
                                    break L2;
                                  }
                                } else {
                                  break L4;
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          ie.field_b.a(false);
                          break L2;
                        }
                      } else {
                        vo.field_f[fn.field_c].c(93);
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                vo.field_f[fn.field_c].c(93);
                break L2;
              }
              if ((var2 ^ -1) >= -1) {
                break L1;
              } else {
                gd.field_b.e();
                ph.b();
                break L1;
              }
            }
          }
          L5: {
            if (-1 > (var2 ^ -1)) {
              L6: {
                L7: {
                  var3 = bn.field_h;
                  if (var3 != 10) {
                    if (-6 != (var3 ^ -1)) {
                      if (-12 != (var3 ^ -1)) {
                        L8: {
                          if (var3 == 2) {
                            break L8;
                          } else {
                            if (-2 != (var3 ^ -1)) {
                              if (var3 == 12) {
                                break L8;
                              } else {
                                L9: {
                                  if ((var3 ^ -1) == -4) {
                                    break L9;
                                  } else {
                                    if (-10 != (var3 ^ -1)) {
                                      L10: {
                                        if (7 == var3) {
                                          break L10;
                                        } else {
                                          if ((var3 ^ -1) == -7) {
                                            break L10;
                                          } else {
                                            if (4 == var3) {
                                              break L10;
                                            } else {
                                              if (-9 == (var3 ^ -1)) {
                                                this.b(42, tm.field_c);
                                                break L6;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.a(tm.field_c, 22517);
                                      break L6;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                this.c(false, tm.field_c);
                                break L6;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        vo.field_f[tm.field_c].c(93);
                        break L6;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                ie.field_b.a(false);
                break L6;
              }
              if (tm.field_b <= var2) {
                break L5;
              } else {
                mk.field_b.a(-86);
                vi.a(var2, gd.field_b, 0, 0, vi.field_a);
                break L5;
              }
            } else {
              break L5;
            }
          }
          return;
        } else {
          k.a(0, 1);
          nc.a(0, true);
          jk.a((byte) -118);
          return;
        }
    }

    final void b(int param0) {
        if (la.field_c != null) {
            la.field_c.f();
        }
        if (null != qd.field_b) {
            qd.field_b.f();
        }
        if (dg.field_i != null) {
            ug.a(-120);
        }
        int var2 = -39 % ((param0 - 75) / 50);
        nb.b(0);
    }

    public static void p(int param0) {
        field_w = null;
        field_v = null;
        if (param0 != 29165) {
            field_x = 30;
        }
    }

    final void a(int param0, hc param1, uf param2) {
        String[] var5_ref_String__ = null;
        int var6_int = 0;
        String var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        var8 = field_u;
        try {
          L0: {
            L1: {
              var9 = kc.a('~', param1.field_l, param0);
              var10 = var9;
              if (1 != var9.length) {
                param2.a((t) null, var9[0], param0 ^ 250);
                break L1;
              } else {
                var5_ref_String__ = kc.a('/', var9[0], 0);
                var6_int = 0;
                L2: while (true) {
                  if ((var6_int ^ -1) <= (var5_ref_String__.length ^ -1)) {
                    break L1;
                  } else {
                    var7 = var5_ref_String__[var6_int];
                    param2.a(false, var7);
                    var6_int++;
                    continue L2;
                  }
                }
              }
            }
            var5 = 1;
            L3: while (true) {
              if (var5 >= var10.length) {
                break L0;
              } else {
                var6 = var10[var5];
                param2.a(hh.field_e[var6.charAt(0) - 48], var6.substring(1), param0 ^ 250);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var4);

            stackIn_12_1 = new StringBuilder().append("Torquing.AB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    public final void init() {
        this.a(16, "torquing", -116);
    }

    private final void q(int param0) {
        int var5_int = 0;
        int[] array$0 = null;
        int var7 = 0;
        int[] array$1 = null;
        int var8 = field_u;
        nl.field_s = qg.a(e.field_b, rp.field_d, "kartika13", "", 255);
        sm[] var9 = ip.a(rg.field_v, -119, "", "smallfont");
        byte[] var20 = uf.field_l.a(param0 + -116, "smallfont", "");
        i.field_N = ok.a(var9, 256, var20);
        um.field_m = io.a(var9, -1, var20);
        i.field_Q = ob.a(1579032, new int[]{4473924, 12632256, 13421772}, var20, true, var9);
        int[] var15 = i.field_Q.field_O[0];
        int[] var11 = var15;
        int[] var4 = var11;
        if (!((i.field_Q.field_O.length ^ -1) <= -12)) {
            i.field_Q.field_O = new int[11][];
        }
        i.field_Q.field_O[0] = var15;
        for (var5_int = 1; -12 < (var5_int ^ -1); var5_int++) {
            array$0 = new int[var15.length];
            i.field_Q.field_O[var5_int] = array$0;
            dk.a(var4, 0, i.field_Q.field_O[var5_int], 0, var15.length);
        }
        i.field_Q.field_O[0][1] = 16777215;
        i.field_Q.field_O[1][1] = 16776960;
        i.field_Q.field_O[2][1] = 8947848;
        i.field_Q.field_O[3][1] = 16777215;
        i.field_Q.field_O[4][1] = 16698162;
        i.field_Q.field_O[5][1] = 16745242;
        i.field_Q.field_O[7][5] = 6710886;
        i.field_Q.field_O[6][1] = 3257116;
        i.field_Q.field_O[7][3] = 2236962;
        i.field_Q.field_O[7][4] = 4473924;
        i.field_Q.field_O[8][3] = 2236962;
        i.field_Q.field_O[8][1] = 16776960;
        i.field_Q.field_O[8][4] = 4473924;
        i.field_Q.field_O[param0][5] = 6710886;
        i.field_Q.field_O[9][1] = 16750848;
        i.field_Q.field_O[10][3] = 2236962;
        i.field_Q.field_O[10][5] = 6710886;
        i.field_Q.field_O[10][4] = 4473924;
        i.field_Q.field_O[10][1] = 16750848;
        sm[] var5 = ip.a(rg.field_v, -121, "", "minifont");
        byte[] var21 = uf.field_l.a(-114, "minifont", "");
        dd.field_c = ok.a(var5, 256, var21);
        qh.field_c = ob.a(1579032, new int[]{4473924, 8421504}, var21, true, var5);
        qh.field_c.field_x = qh.field_c.field_x - 1;
        int[] var17 = qh.field_c.field_O[0];
        int[] var13 = var17;
        var4 = var13;
        if (!(-4 >= (qh.field_c.field_O.length ^ -1))) {
            qh.field_c.field_O = new int[3][];
        }
        qh.field_c.field_O[0] = var17;
        for (var7 = 1; var7 < 3; var7++) {
            array$1 = new int[var17.length];
            qh.field_c.field_O[var7] = array$1;
            dk.a(var4, 0, qh.field_c.field_O[var7], 0, var17.length);
        }
        qh.field_c.field_O[0][1] = 16777215;
        qh.field_c.field_O[1][1] = 16711680;
        qh.field_c.field_O[2][1] = 16750848;
    }

    private final void s(int param0) {
        if (param0 != 26418) {
            return;
        }
        if (null != rd.field_z) {
            hg.a((byte) -77, rd.field_z);
            rd.field_z = null;
            cf.a(6639);
        }
        rl.field_a = vg.a(param0 ^ -3280, 1);
        rg.field_v = vg.a(-27646, 2);
        vp.field_D = vg.a(-27646, 3);
        th.field_C = vg.a(-27646, 4);
        vd.field_e = vg.a(-27646, 5);
        bp.field_c = vg.a(param0 + -54064, 6);
        uf.field_l = vg.a(-27646, 8);
        he.field_b = vg.a(-27646, 12);
        eg.field_t = vg.a(-27646, 13);
        n.field_q = vg.a(-27646, 14);
        kc.a(1, rp.field_d, e.field_b);
    }

    static {
        field_v = new kk();
    }
}
