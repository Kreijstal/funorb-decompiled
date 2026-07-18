/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

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
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          try {
            L0: {
              var3_int = param2.a((byte) -114);
              if (~var3_int >= ~param1) {
                break L0;
              } else {
                var3_int = param1;
                break L0;
              }
            }
            L1: {
              if (param0 == 26657) {
                break L1;
              } else {
                Torquing.a(9, false);
                break L1;
              }
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + lh.field_u.a(var4, true, param2.field_n, param2.field_j, 0, var3_int);
            var5 = hk.a(var3_int, true, 0, var4);
            stackOut_4_0 = (String) var5;
            stackIn_5_0 = stackOut_4_0;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackOut_6_0 = "Cabbage";
            stackIn_7_0 = stackOut_6_0;
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L2: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("Torquing.OA(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        L0: {
          var3 = field_u;
          if (param0 < -33) {
            break L0;
          } else {
            var4 = null;
            String discarded$4 = Torquing.a(-55, 127, (fj) null);
            break L0;
          }
        }
        L1: {
          if (wp.field_w > 0) {
            L2: {
              if (ki.field_D == null) {
                dg.field_i = je.a(640, 480, nk.field_u, 0, 0, -62);
                break L2;
              } else {
                dg.field_i = ki.field_D.b((byte) -73);
                int discarded$5 = -111;
                int discarded$6 = 2;
                vp.b();
                break L2;
              }
            }
            if (dg.field_i != null) {
              j.a((java.awt.Canvas) (Object) dg.field_i, (byte) 63);
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
        int discarded$0 = -11784;
        cl.a();
        int discarded$1 = -51;
        ol.a();
        int discarded$2 = -51;
        ml.a();
        int discarded$3 = -18242;
        ke.a();
        vi.a();
        ua.a(param0 + -10);
        jk.a(param0 + -4);
        int discarded$4 = 2712;
        ga.a();
        int discarded$5 = 18133;
        ul.a();
        int discarded$6 = 0;
        vc.a();
        ph.c();
        la.d(param0 + 99);
        uc.a();
        int discarded$7 = 88;
        l.a();
        int discarded$8 = 104;
        qi.a();
        int discarded$9 = 59;
        fj.d();
        int discarded$10 = -123;
        km.a();
        int discarded$11 = 16720;
        jo.a();
        int discarded$12 = 81;
        tf.a();
        int discarded$13 = -62;
        dj.a();
        int discarded$14 = -61;
        ff.a();
        int discarded$15 = 1;
        aq.a();
        bq.a((byte) 74);
        int discarded$16 = 2;
        hi.a();
        vd.a(false);
        hl.a((byte) -77);
        int discarded$17 = -47;
        rh.a();
        ha.a(param0 + -132);
        int discarded$18 = 84;
        kn.a();
        vf.a(param0 ^ 41);
        int discarded$19 = 4;
        pp.a();
        int discarded$20 = 8192;
        m.b();
        pi.d();
        wl.d();
        int discarded$21 = 108;
        fi.a();
        int discarded$22 = -113;
        hc.a();
        int discarded$23 = 32;
        mh.b();
        ia.c(88);
        int discarded$24 = 3;
        uf.a();
        int discarded$25 = -3;
        bi.c();
        nc.a(param0 ^ 56);
        hj.a((byte) 114);
        int discarded$26 = -77;
        jp.d();
        co.a(param0 ^ 6);
        int discarded$27 = 21384;
        bo.a();
        o.b(-1);
        no.b(param0 + -4);
        wf.a(false);
        int discarded$28 = -93;
        ta.g();
        q.b((byte) 92);
        int discarded$29 = -64;
        gk.a();
        sa.a(true);
        kk.b(160);
        oi.a(0);
        int discarded$30 = -98;
        db.d();
        to.a(param0 ^ 29826);
        int discarded$31 = 0;
        fn.a();
        ag.a(18945);
        sg.a();
        int discarded$32 = -127;
        dd.a();
        g.a();
        kh.a(param0 ^ 24993);
        int discarded$33 = 0;
        ti.a();
        int discarded$34 = 60;
        jn.a();
        oh.a(20269);
        eo.a(6);
        int discarded$35 = 0;
        dc.a();
        int discarded$36 = -127;
        sh.a();
        vg.d((byte) -97);
        int discarded$37 = -106;
        eh.b();
        ed.b((byte) -30);
        int discarded$38 = 76;
        fd.b();
        int discarded$39 = -12;
        tm.a();
        int discarded$40 = 75;
        me.a();
        int discarded$41 = 0;
        hg.a();
        int discarded$42 = 102;
        da.a();
        bh.a(-113);
        vo.a((byte) -125);
        int discarded$43 = -120;
        bc.a();
        int discarded$44 = 3;
        df.k();
        int discarded$45 = -93;
        nn.b();
        int discarded$46 = 111;
        ln.h();
        int discarded$47 = -7361;
        sp.m();
        int discarded$48 = 1269;
        qc.n();
        mn.h((byte) 77);
        int discarded$49 = 0;
        ki.m();
        int discarded$50 = -59;
        fm.h();
        int discarded$51 = -122;
        pe.g();
        int discarded$52 = 2147483647;
        th.h();
        a.a(param0 ^ 4);
        int discarded$53 = -110;
        tl.d();
        eb.a((byte) -31);
        jl.b(2);
        ap.a();
        pa.a((byte) -126);
        int discarded$54 = -92;
        bl.a();
        int discarded$55 = 120;
        rl.a();
        bn.a(param0 ^ -64);
        af.a(23394);
        int discarded$56 = 113;
        de.a();
        int discarded$57 = 12949;
        dg.c();
        int discarded$58 = -64;
        kg.b();
        ik.a((byte) 59);
        ji.a(param0 + -101);
        int discarded$59 = -98;
        wk.a();
        cf.b(1);
        un.b(-13524);
        int discarded$60 = 0;
        wd.b();
        ma.a();
        ho.b();
        uo.a();
        lh.b(param0 + -128);
        pn.a(92);
        hf.a(param0 ^ 8);
        int discarded$61 = -89;
        gb.d();
        int discarded$62 = -123;
        am.c();
        int discarded$63 = 126;
        gn.a();
        fh.d(param0 + -1);
        ac.c(param0 ^ 4);
        int discarded$64 = 0;
        pb.a();
        lb.c(0);
        gl.c(-96);
        ue.a(param0 + -82);
        int discarded$65 = 0;
        pd.a();
        nk.a(param0 + 252);
        int discarded$66 = 376;
        ra.a();
        int discarded$67 = 50;
        i.m();
        int discarded$68 = 108;
        ip.b();
        pc.a(4252);
        pg.a(47);
        int discarded$69 = -124;
        jb.a();
        of.a((byte) -81);
        int discarded$70 = 39;
        qh.a();
        int discarded$71 = 65;
        cc.a();
        int discarded$72 = 78;
        gi.a();
        int discarded$73 = 102;
        qe.a();
        mb.a((byte) -83);
        int discarded$74 = -72;
        id.a();
        w.b(param0 + 2147483644);
        int discarded$75 = 0;
        uk.a();
        int discarded$76 = -137;
        md.a();
        int discarded$77 = -1581;
        cn.a();
        vb.a(param0 ^ 41);
        dp.b(param0 + -110);
        fc.a();
        int discarded$78 = 44;
        j.a();
        int discarded$79 = 0;
        pm.a();
        kl.b(-125);
        int discarded$80 = -62;
        mg.a();
        int discarded$81 = 0;
        oc.b();
        oj.a(param0 ^ 5);
        ld.b((byte) -21);
        int discarded$82 = 116;
        rn.a();
        uj.a((byte) -54);
        int discarded$83 = 13509;
        gm.d();
        int discarded$84 = 52;
        lg.i();
        jh.a((byte) 69);
        int discarded$85 = -126;
        im.k();
        hn.f((byte) 2);
        int discarded$86 = 21007;
        re.b();
        r.b(param0 + 33423357);
        int discarded$87 = 29841;
        p.b();
        ci.b(2);
        int discarded$88 = 118;
        gh.a();
        al.a((byte) 20);
        int discarded$89 = -1674;
        ie.b();
        ne.a(param0 + 4508);
        ef.a(param0 + -1);
        ob.a((byte) -12);
        int discarded$90 = 23116;
        ao.b();
        int discarded$91 = -102;
        ko.a();
        np.d(0);
        mk.a(115);
        qm.a(param0 ^ 35);
        ja.a();
        int discarded$92 = -126;
        wi.b();
        int discarded$93 = 31238;
        sb.a();
        nf.c();
        ej.b();
        int discarded$94 = 0;
        ug.a();
        int discarded$95 = 0;
        na.a();
        int discarded$96 = 121;
        gp.k();
        aa.m(0);
        kf.a(false);
        int discarded$97 = -1;
        vp.h();
        ub.a((byte) -19);
        bj.f((byte) -37);
        ok.a(param0 + 9);
        gf.d(param0 + -4);
        bf.a(3);
        int discarded$98 = 1;
        va.a();
        om.a(param0 + -4);
        int discarded$99 = 121;
        tp.b();
        int discarded$100 = 123;
        ro.g();
        od.b(11860);
        int discarded$101 = 37;
        jf.a();
        lo.a();
        int discarded$102 = -47;
        u.g();
        int discarded$103 = 0;
        po.g();
        wn.b(param0 + -4);
        int discarded$104 = 126;
        so.g();
        qn.a(false);
        te.b(param0 + -445141588);
        int discarded$105 = -62;
        ee.g();
        kc.b(param0 ^ param0);
        int discarded$106 = 12;
        hm.b();
        lk.b(0);
        int discarded$107 = 115;
        sd.g();
        b.c(param0 + 16056);
        eg.b(param0 + -128);
        qg.c(-1172010644);
        bd.a(false);
        int discarded$108 = -16;
        mo.g();
        lc.a(false);
        int discarded$109 = -39;
        mi.g();
        go.c(param0 ^ 58);
        int discarded$110 = 16711935;
        ql.b();
        ea.a(true);
        pl.c(param0 ^ -69);
        cq.b(param0 + -1339901240);
        int discarded$111 = 106;
        jg.g();
        wp.a(true);
        rg.b(param0 + 31631);
        s.g((byte) -73);
        mf.g((byte) 21);
        int discarded$112 = -799778388;
        hb.b();
        nl.d(param0 + -132);
        int discarded$113 = 115;
        wh.g();
        rj.g((byte) -102);
        ib.a(-22719);
        int discarded$114 = 109;
        wb.g();
        vk.b(95);
        rd.c(127);
        int discarded$115 = 31003;
        cm.a();
        jm.c(-101);
        hq.a(-1);
        int discarded$116 = -97;
        jd.h();
        k.a(param0 + 98);
        int discarded$117 = 93;
        vl.a();
        int discarded$118 = -83;
        lj.b();
        d.a(param0 ^ -99);
        int discarded$119 = 1;
        en.c();
        gj.b(false);
        int discarded$120 = 0;
        lp.a();
        int discarded$121 = -28;
        in.a();
        qf.a(true);
        int discarded$122 = -45;
        ih.a();
        wa.a(-117);
        int discarded$123 = 160;
        on.a();
        ah.b(param0 + -3);
        dh.a(true);
        wo.a(true);
        int discarded$124 = 107;
        bm.a();
        wc.a(0);
        int discarded$125 = 0;
        qj.a();
        int discarded$126 = 88;
        cb.a();
        int discarded$127 = 61;
        rf.b();
        int discarded$128 = 86;
        je.b();
        int discarded$129 = -117;
        ig.b();
        int discarded$130 = -113;
        io.a();
        kb.a(param0 ^ 6);
        int discarded$131 = -118;
        fq.g();
        int discarded$132 = 112;
        ae.d();
        int discarded$133 = 125;
        og.a();
        rp.a(-28607);
        nh.a(false);
        int discarded$134 = -39;
        qp.a();
        h.a(13809);
        int discarded$135 = 109;
        qk.a();
        ud.a((byte) -128);
        ii.a(param0 ^ -28451);
        int discarded$136 = -108;
        up.b();
        int discarded$137 = -55;
        ce.a();
        ai.a((byte) 64);
        he.a(-1);
        int discarded$138 = 1;
        e.b();
        wj.c(false);
        int discarded$139 = 1;
        rk.b();
        gd.a((byte) -119);
        int discarded$140 = 10;
        dn.a();
        int discarded$141 = -2;
        fo.h();
        di.c(param0 ^ -3);
        int discarded$142 = 84;
        hh.a();
        int discarded$143 = 126;
        qa.a();
        int discarded$144 = -37;
        ni.a();
        v.a((byte) 123);
        pf.a(106);
        mc.a(5);
        int discarded$145 = -124;
        il.c();
        int discarded$146 = -99;
        ij.f();
        tn.e(0);
        ad.c((byte) 17);
        int discarded$147 = 64;
        ab.e();
        int discarded$148 = -121;
        um.c();
        int discarded$149 = 15;
        qd.c();
        int discarded$150 = 103;
        tb.a();
        cd.a((byte) -11);
        eq.b((byte) 62);
        ka.a(101);
        int discarded$151 = -22677;
        ui.a();
        int discarded$152 = 0;
        n.a();
        int discarded$153 = -22;
        kj.a();
        int discarded$154 = -1507;
        ak.b();
        cp.b(param0 + 2092666600);
        int discarded$155 = 81;
        ll.b();
        int discarded$156 = 0;
        bp.a();
        ((Torquing) this).field_i = null;
        ((Torquing) this).field_t = null;
    }

    public Torquing() {
    }

    private final void c(boolean param0) {
        int var3 = field_u;
        qp var4 = (qp) (Object) jh.field_y.b(0);
        while (var4 != null) {
            int discarded$0 = 4;
            int discarded$1 = 99;
            wc.a(var4);
            var4 = (qp) (Object) jh.field_y.f(-24059);
        }
        qk var5 = (qk) (Object) bo.field_l.b(0);
        while (var5 != null) {
            le.a((byte) 126, 5, var5);
            var5 = (qk) (Object) bo.field_l.f(-24059);
        }
        int discarded$2 = -127;
        int discarded$3 = 4;
        kg.field_c = ip.a();
        kb.field_f = tl.a(5, 0, 1, 0);
        if (wp.field_w > 0) {
            ee.field_s = false;
            lp.field_f = false;
        }
    }

    final void c(int param0) {
        ((Torquing) this).a(11, 11, false, param0 + 477, 9, 15, 10, 0);
        pi.a(22050, true, 10);
        qd.field_b = pi.a(nk.field_u, (java.awt.Component) (Object) k.field_d, 0, 22050);
        la.field_c = pi.a(nk.field_u, (java.awt.Component) (Object) k.field_d, 1, 1024);
        uh var2 = new uh();
        la.field_c.a((lf) (Object) var2);
        uh var3 = new uh();
        qd.field_b.a((lf) (Object) var3);
        ql.a(param0 ^ 1618865635, var3, var2);
        ((Torquing) this).a(true, false, true, true, false);
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
        L0: {
          k.a(param1, 1);
          nc.a(param1, true);
          qc.field_cb.a((byte) -51, 0, 0);
          wh.field_t[param1].a(0, 0, 76);
          pm.field_m[param1].a(0, 0);
          mh.field_d[param1].a(0, 0, 76);
          ml.field_a[param1].a(0, 0);
          if (null != ((Torquing) this).field_t) {
            break L0;
          } else {
            ((Torquing) this).field_t = new uf((uc) (Object) i.field_Q, 0, 372, 286, ml.field_a[param1], -34, -159);
            ((Torquing) this).field_t.a((byte) -19, 30);
            boolean discarded$3 = ((Torquing) this).field_t.a(false, ff.a(new String[1], 0, pc.field_n));
            ((Torquing) this).field_t.a((byte) 120, 40);
            boolean discarded$4 = ((Torquing) this).field_t.a(false, ff.a(new String[2], 0, ka.field_l));
            ((Torquing) this).field_t.a((byte) 97, 30);
            ((Torquing) this).field_t.c(0);
            break L0;
          }
        }
        L1: {
          ((Torquing) this).field_t.b(34, -120, 159);
          int discarded$5 = qh.field_c.a(kk.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, 3 * (1 + dd.field_c.field_x) / 2);
          if (param0 >= 30) {
            break L1;
          } else {
            ((Torquing) this).b(61);
            break L1;
          }
        }
        ph.c(0, 0, 640, 480, 16777215);
    }

    private final boolean b(boolean param0, byte param1) {
        short[] var3_ref_short__ = null;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        int var4_int = 0;
        byte[] var4 = null;
        hc var4_ref = null;
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
        int var11_int = 0;
        dg var11 = null;
        int[] var11_array = null;
        int var12_int = 0;
        int[] var12 = null;
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
        t var19_ref = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int[] var29 = null;
        int var30 = 0;
        int var31 = 0;
        rm var32 = null;
        short[] var33 = null;
        t var34 = null;
        t var35 = null;
        sm[] var36 = null;
        sm var37 = null;
        t var38 = null;
        t var39 = null;
        t[] var41 = null;
        t var42 = null;
        sm[] var43 = null;
        sm var44 = null;
        sm var45 = null;
        sm var46 = null;
        t var47 = null;
        int[] var48 = null;
        t[] var49 = null;
        gg var50 = null;
        byte[] var51 = null;
        fj var52 = null;
        String var53 = null;
        StringBuilder var54 = null;
        hc var55 = null;
        byte[] var56 = null;
        fj var57 = null;
        String var58 = null;
        hc var59 = null;
        short[] var60 = null;
        int[] var62 = null;
        byte[] var63 = null;
        byte[] var64 = null;
        short[] var65 = null;
        int[] var68 = null;
        byte[] var69 = null;
        byte[] var70 = null;
        short[] var71 = null;
        int[] var72 = null;
        int[] var73 = null;
        int[] var74 = null;
        byte[] var75 = null;
        byte[] var76 = null;
        var27 = field_u;
        int discarded$70 = -98;
        nn.a();
        if (rl.field_a != null) {
          if (tp.field_a == null) {
            L0: {
              if (!rp.field_d.a(-12749)) {
                break L0;
              } else {
                if (!rp.field_d.a(true, "basic")) {
                  break L0;
                } else {
                  if (rp.field_d.a(true, "benefits")) {
                    if (!rp.field_d.a(true, "kartika13")) {
                      df.a(2.0f, 117, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                      return false;
                    } else {
                      L1: {
                        if (!e.field_b.a(-12749)) {
                          break L1;
                        } else {
                          if (!e.field_b.a(true, "kartika13")) {
                            break L1;
                          } else {
                            L2: {
                              if (!rl.field_a.a(-12749)) {
                                break L2;
                              } else {
                                if (rl.field_a.c(-19375)) {
                                  L3: {
                                    if (!rg.field_v.a(-12749)) {
                                      break L3;
                                    } else {
                                      if (rg.field_v.c(-19375)) {
                                        L4: {
                                          if (!uf.field_l.a(-12749)) {
                                            break L4;
                                          } else {
                                            if (!uf.field_l.c(-19375)) {
                                              break L4;
                                            } else {
                                              L5: {
                                                if (!vp.field_D.a(-12749)) {
                                                  break L5;
                                                } else {
                                                  if (vp.field_D.c(-19375)) {
                                                    L6: {
                                                      if (!n.field_q.a(-12749)) {
                                                        break L6;
                                                      } else {
                                                        if (n.field_q.c(-19375)) {
                                                          L7: {
                                                            if (!bp.field_c.a(-12749)) {
                                                              break L7;
                                                            } else {
                                                              if (!bp.field_c.c(-19375)) {
                                                                break L7;
                                                              } else {
                                                                L8: {
                                                                  if (!vd.field_e.a(-12749)) {
                                                                    break L8;
                                                                  } else {
                                                                    if (vd.field_e.c(-19375)) {
                                                                      L9: {
                                                                        if (!th.field_C.a(-12749)) {
                                                                          break L9;
                                                                        } else {
                                                                          if (th.field_C.c(-19375)) {
                                                                            L10: {
                                                                              if (!he.field_b.a(-12749)) {
                                                                                break L10;
                                                                              } else {
                                                                                if (he.field_b.c(-19375)) {
                                                                                  L11: {
                                                                                    if (wp.field_w <= 0) {
                                                                                      break L11;
                                                                                    } else {
                                                                                      L12: {
                                                                                        if (!eg.field_t.a(-12749)) {
                                                                                          break L12;
                                                                                        } else {
                                                                                          if (eg.field_t.c(-19375)) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            break L12;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      df.a(29.0f, -63, c.a(17, pa.field_a, "", pd.field_a, eg.field_t));
                                                                                      return false;
                                                                                    }
                                                                                  }
                                                                                  pm.a((byte) 80);
                                                                                  df.a(30.0f, 14, jn.field_d);
                                                                                  ((Torquing) this).b((byte) 73);
                                                                                  if (param0) {
                                                                                    tp.field_a = je.a(rl.field_a, "", "sphere", (byte) -124);
                                                                                    cf.a(6639);
                                                                                    return false;
                                                                                  } else {
                                                                                    return false;
                                                                                  }
                                                                                } else {
                                                                                  break L10;
                                                                                }
                                                                              }
                                                                            }
                                                                            df.a(28.0f, 101, c.a(17, pa.field_a, "", pd.field_a, he.field_b));
                                                                            return false;
                                                                          } else {
                                                                            break L9;
                                                                          }
                                                                        }
                                                                      }
                                                                      df.a(27.0f, -72, c.a(17, tf.field_a, "", ac.field_A, th.field_C));
                                                                      return false;
                                                                    } else {
                                                                      break L8;
                                                                    }
                                                                  }
                                                                }
                                                                df.a(26.0f, -95, c.a(17, fn.field_a, "", hn.field_A, vd.field_e));
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          df.a(23.0f, -77, c.a(17, fn.field_a, "", hn.field_A, bp.field_c));
                                                          return false;
                                                        } else {
                                                          break L6;
                                                        }
                                                      }
                                                    }
                                                    df.a(20.0f, 8, il.a(pg.field_a, n.field_q, mb.field_c, (byte) 33));
                                                    return false;
                                                  } else {
                                                    break L5;
                                                  }
                                                }
                                              }
                                              df.a(20.0f, 5, il.a(pg.field_a, vp.field_D, mb.field_c, (byte) 113));
                                              return false;
                                            }
                                          }
                                        }
                                        df.a(19.0f, 28, c.a(17, ol.field_e, "", l.field_c, uf.field_l));
                                        return false;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  df.a(10.0f, -99, c.a(17, bo.field_i, "", db.field_d, rg.field_v));
                                  return false;
                                } else {
                                  break L2;
                                }
                              }
                            }
                            df.a(3.0f, -102, c.a(17, vf.field_g, "", kb.field_c, rl.field_a));
                            return false;
                          }
                        }
                      }
                      df.a(2.0f, -80, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                      return false;
                    }
                  } else {
                    df.a(1.0f, -93, c.a(17, bo.field_i, "basic", db.field_d, rp.field_d));
                    return false;
                  }
                }
              }
            }
            df.a(1.0f, 84, c.a(17, bo.field_i, "basic", db.field_d, rp.field_d));
            return false;
          } else {
            if (vc.field_c != null) {
              if (vc.field_c[6] != null) {
                if (null == vc.field_c[11]) {
                  vc.field_c[11] = je.a(rl.field_a, "", "powerups/letter_r", (byte) -118);
                  vc.field_c[12] = je.a(rl.field_a, "", "powerups/letter_q", (byte) -123);
                  vc.field_c[13] = je.a(rl.field_a, "", "powerups/letter_u", (byte) -122);
                  vc.field_c[14] = je.a(rl.field_a, "", "powerups/letter_i", (byte) -123);
                  vc.field_c[15] = je.a(rl.field_a, "", "powerups/letter_n", (byte) -126);
                  cf.a(6639);
                  return false;
                } else {
                  if (vc.field_c[16] == null) {
                    vc.field_c[16] = je.a(rl.field_a, "", "powerups/letter_g", (byte) -128);
                    vc.field_c[17] = je.a(rl.field_a, "", "powerups/skin_tennisball", (byte) -124);
                    int discarded$71 = 31;
                    int discarded$72 = 13;
                    gi.a(vc.field_c[17].field_l);
                    vc.field_c[18] = new kh((rm) (Object) new jl(30, false));
                    vc.field_c[19] = je.a(rl.field_a, "", "powerups/skin_marble", (byte) -126);
                    int discarded$73 = 31;
                    int discarded$74 = 13;
                    gi.a(vc.field_c[19].field_l);
                    vc.field_c[20] = je.a(rl.field_a, "", "powerups/skin_ballbearing", (byte) -119);
                    int discarded$75 = 31;
                    int discarded$76 = 13;
                    gi.a(vc.field_c[20].field_l);
                    cf.a(6639);
                    return false;
                  } else {
                    if (vc.field_c[21] == null) {
                      vc.field_c[21] = je.a(rl.field_a, "", "powerups/skin_beachball", (byte) -123);
                      int discarded$77 = 31;
                      int discarded$78 = 13;
                      gi.a(vc.field_c[21].field_l);
                      vc.field_c[22] = je.a(rl.field_a, "", "powerups/skin_apple", (byte) -121);
                      vc.field_c[23] = je.a(rl.field_a, "", "powerups/skin_atom", (byte) -123);
                      vc.field_c[24] = je.a(rl.field_a, "", "powerups/skin_orb", (byte) -124);
                      int discarded$79 = 31;
                      int discarded$80 = 13;
                      gi.a(vc.field_c[24].field_l);
                      int discarded$81 = -1;
                      ji.a(vc.field_c[24].field_l);
                      cf.a(6639);
                      return false;
                    } else {
                      L13: {
                        if (!ia.a(-22426, 0)) {
                          break L13;
                        } else {
                          var32 = rm.a(rl.field_a, "", "sphere_halloween");
                          int discarded$82 = 31;
                          int discarded$83 = 13;
                          gi.a(var32);
                          vc.field_c[17] = new kh(var32);
                          vc.field_c[18] = new kh(var32);
                          vc.field_c[19] = new kh(var32);
                          vc.field_c[20] = new kh(var32);
                          vc.field_c[21] = new kh(var32);
                          vc.field_c[22] = new kh(var32);
                          vc.field_c[23] = new kh(var32);
                          vc.field_c[24] = new kh(var32);
                          int discarded$84 = -1;
                          ji.a(vc.field_c[24].field_l);
                          break L13;
                        }
                      }
                      if (null != vc.field_c[3]) {
                        if (vb.field_c[3] == null) {
                          vb.field_c[3] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_block").a(80, 1365, -1, -12, 12);
                          vb.field_c[25] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_can").a(80, 1365, -1, -12, 12);
                          vb.field_c[26] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_grave").a(80, 1365, -1, -12, 12);
                          vb.field_c[27] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_roundtree").a(80, 1365, -1, -12, 12);
                          vb.field_c[28] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_squaretree").a(80, 1365, -1, -12, 12);
                          vb.field_c[29] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_statue").a(80, 1365, -1, -12, 12);
                          vb.field_c[30] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_cone").a(80, 1365, -1, -12, 12);
                          vb.field_c[31] = (pj) (Object) rm.a(rl.field_a, "", "obstacles/bb_lights_tall_nopost").a(80, 1365, -1, -12, 12);
                          ka.field_n[31][0] = 0;
                          ka.field_n[31][4] = 0;
                          ka.field_n[31][1] = 16;
                          ka.field_n[31][2] = 8;
                          ka.field_n[31][3] = -101;
                          cf.a(6639);
                          return false;
                        } else {
                          gb.field_c = je.a(rl.field_a, "", "powerups/spikesonly", (byte) -127);
                          var3_ref_short__ = vc.field_c[9].field_l.field_m;
                          var4_int = 10;
                          L14: while (true) {
                            if (var4_int > 16) {
                              var4_int = 9;
                              L15: while (true) {
                                if (var4_int > 16) {
                                  dk.a(var3_ref_short__, 0, var3_ref_short__.length, (short) 960);
                                  rl.field_a = null;
                                  cf.a(6639);
                                  return false;
                                } else {
                                  vc.field_c[var4_int].field_l.field_m = var3_ref_short__;
                                  var4_int++;
                                  continue L15;
                                }
                              }
                            } else {
                              L16: {
                                if (~vc.field_c[var4_int].field_l.field_m.length < ~var3_ref_short__.length) {
                                  var3_ref_short__ = vc.field_c[var4_int].field_l.field_m;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              var4_int++;
                              continue L14;
                            }
                          }
                        }
                      } else {
                        vc.field_c[3] = je.a(rl.field_a, "", "obstacles/childs_play_block", (byte) -120);
                        vc.field_c[25] = je.a(rl.field_a, "", "obstacles/drinks_can", (byte) -128);
                        vc.field_c[26] = je.a(rl.field_a, "", "obstacles/grave_stone2", (byte) -128);
                        vc.field_c[27] = je.a(rl.field_a, "", "obstacles/pinetree_round", (byte) -123);
                        vc.field_c[28] = je.a(rl.field_a, "", "obstacles/pinetree_square", (byte) -122);
                        vc.field_c[29] = je.a(rl.field_a, "", "obstacles/statue", (byte) -126);
                        var71 = vc.field_c[29].field_l.field_m;
                        var65 = var71;
                        var60 = var65;
                        var33 = var60;
                        var3_ref_short__ = var33;
                        var4_int = 0;
                        L17: while (true) {
                          if (var4_int >= var71.length) {
                            vc.field_c[30] = je.a(rl.field_a, "", "obstacles/traffic_cone", (byte) -123);
                            vc.field_c[31] = je.a(rl.field_a, "", "obstacles/traffic_lights_tall", (byte) -121);
                            cf.a(6639);
                            return false;
                          } else {
                            var5 = var71[var4_int];
                            var3_ref_short__[var4_int] = (short)(ie.a(127, var5) + 8704);
                            var4_int++;
                            continue L17;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                vc.field_c[6] = je.a(rl.field_a, "", "powerups/gyroscope", (byte) -127);
                vc.field_c[7] = je.a(rl.field_a, "", "powerups/bomb", (byte) -127);
                vc.field_c[8] = je.a(rl.field_a, "", "powerups/shield", (byte) -121);
                vc.field_c[9] = je.a(rl.field_a, "", "powerups/letter_t", (byte) -122);
                vc.field_c[10] = je.a(rl.field_a, "", "powerups/letter_o", (byte) -120);
                cf.a(6639);
                return false;
              }
            } else {
              vc.field_c = new kh[32];
              vc.field_c[0] = je.a(rl.field_a, "", "powerups/exit", (byte) -121);
              vc.field_c[2] = je.a(rl.field_a, "", "powerups/time_fixed", (byte) -127);
              vc.field_c[1] = je.a(rl.field_a, "", "powerups/score", (byte) -119);
              vc.field_c[4] = je.a(rl.field_a, "", "powerups/spikes", (byte) -127);
              vc.field_c[5] = je.a(rl.field_a, "", "powerups/frameRotation", (byte) -122);
              cf.a(6639);
              return false;
            }
          }
        } else {
          if (rp.field_d != null) {
            L18: {
              df.a(32.0f, -66, k.field_h);
              ((Torquing) this).b((byte) 73);
              kk.field_o = mn.a(rp.field_d, "basic", "unachieved", 112);
              pe.field_J = mn.a(rp.field_d, "basic", "locked", 105);
              int discarded$85 = 4;
              mo.a(kk.field_o);
              dd.field_i = mn.a(rp.field_d, "basic", "orbcoin", 124);
              int discarded$86 = 8;
              this.q();
              if (0 < wp.field_w) {
                break L18;
              } else {
                m.a(16750848, (java.applet.Applet) this, 0, dh.field_a, 0, 16777215);
                var34 = new t(640, 480);
                rj.a(-65, cp.field_i, var34);
                int discarded$87 = 0;
                vc.a(mn.a(rg.field_v, "", "mb_logo", 96));
                var35 = mn.a(rg.field_v, "", "mb_price_bg", 97);
                kp.a(var35, 10, 24, 96, 118, 37, 6, false, -2000);
                mk.field_b.a(-101);
                break L18;
              }
            }
            rp.field_d = null;
            cf.a(6639);
            return false;
          } else {
            if (null != rg.field_v) {
              var3 = dd.field_c.field_t + dd.field_c.field_x;
              kh.field_r = new t(var3, var3);
              kh.field_r.e();
              dd.field_i.c(0, 0, var3, var3);
              dd.field_i = null;
              mk.field_b.a(-98);
              s.field_t = pb.a("frame", -1, "", rg.field_v);
              lb.a(16777215, pb.a("frame2col", -1, "", rg.field_v), pb.a("frame2alpha", -1, "", rg.field_v), 4);
              var36 = ip.a(rg.field_v, -123, "", "intro_components");
              var43 = ip.a(rg.field_v, -109, "", "intro_components_shadows");
              var44 = var36[1];
              var7_ref_sm = var36[3];
              var8_ref_ia = new ia(18, 142, 404, 320);
              qc.field_cb = var8_ref_ia;
              pa.field_e = ip.a(rg.field_v, -115, "", "world_text");
              ml.field_a = ip.a(rg.field_v, -109, "", "world_img");
              mh.field_d = ip.a(rg.field_v, -119, "", "world_img_shadow");
              rp.field_b = new t[32];
              var9_ref_int__ = new int[]{16777215, 14211288, 15000804, 10526880};
              var10 = 0;
              L19: while (true) {
                if (var10 >= 8) {
                  mk.field_b.a(-111);
                  pm.field_m = ip.a(rg.field_v, -114, "", "world_title");
                  wh.field_t = ip.a(rg.field_v, -115, "", "world_title_shadows");
                  wj.field_k = md.a("getready", 31094, rg.field_v, "");
                  sg.field_e = pb.a("sprite_textures", -1, "", rg.field_v);
                  sg.field_a = pb.a("auras", -1, "", rg.field_v);
                  var41 = sg.field_a;
                  var11_int = 0;
                  L20: while (true) {
                    if (var41.length <= var11_int) {
                      hj.field_c = var44;
                      of.field_l = var36[2].a();
                      fq.field_F = new dg(var43[2], 0, 0, 76);
                      cq.field_w = var36[4].a();
                      la.field_j = var36[0].a();
                      jh.field_B = new dg(var43[0], 0, 0, 76);
                      jb.field_b = var8_ref_ia;
                      nh.field_l = var7_ref_sm;
                      bd.field_w = mn.a(rg.field_v, "", "dashboard", 106);
                      kk.field_n = mn.a(rg.field_v, "", "shieldIcon", 105);
                      ia.field_f = mn.a(rg.field_v, "", "gyroIcon", 104);
                      hq.field_h = pb.a("countdown", -1, "", rg.field_v);
                      hi.field_h = new sm[8];
                      gm.field_r = new sm[8];
                      var10 = 0;
                      L21: while (true) {
                        if (8 <= var10) {
                          ue.field_c = pb.a("skins", -1, "", rg.field_v);
                          bl.field_d = 7;
                          qo.field_t = 2;
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= 8) {
                              nn.field_a = new af[12][];
                              var10_ref = (Object) (Object) bi.a(var44, 81);
                              var11 = new dg(vg.a(new sm[3], 52), 0, 0, 76);
                              var45 = vg.a(new sm[3], 122);
                              var13 = bi.a(var45, -109);
                              nn.field_a[0] = new af[6];
                              var46 = md.a("pause_title", 31094, rg.field_v, "");
                              nn.field_a[1] = new af[6];
                              int discarded$88 = 4;
                              nn.field_a[3] = new af[2];
                              int discarded$89 = 4;
                              nn.field_a[4] = new af[3];
                              var15_ref_sm = md.a("highscore_top", 31094, rg.field_v, "");
                              int discarded$90 = 4;
                              nn.field_a[2] = new af[5];
                              nn.field_a[5] = new af[1];
                              int discarded$91 = 4;
                              nn.field_a[9] = new af[2];
                              var16_ref_ia = new ia(23, 62, 593, 402);
                              int discarded$92 = 4;
                              nn.field_a[6] = new af[2];
                              int discarded$93 = 4;
                              nn.field_a[8] = new af[2];
                              nn.field_a[7] = new af[3];
                              nn.field_a[10] = new af[5];
                              nn.field_a[11] = new af[3];
                              dj.field_a = pb.a("menu_items_recol", -1, "", rg.field_v);
                              bj.field_L = ip.a(rg.field_v, -123, "", "death_text");
                              qd.field_c = new sm[3];
                              qd.field_c[1] = md.a("death_time", 31094, rg.field_v, "");
                              qd.field_c[0] = vo.a(-173, i.c(-102, 101), ml.field_a[2], 43);
                              qd.field_c[2] = vo.a(-194, -1, ml.field_a[6], -34);
                              kl.field_p = mn.a(rg.field_v, "", "scrolled_instructions_keys", 84);
                              gd.field_a = ip.a(rg.field_v, -116, "", "mb_screenshots");
                              be.a((ec) (Object) new op(vp.field_D, n.field_q, rg.field_v, 6, false));
                              tj.field_n = pb.a("achievements_lrg", -1, "", rg.field_v);
                              var47 = mn.a(rg.field_v, "", "glass", 89);
                              var47.a();
                              var73 = var47.field_y;
                              tj.field_n[11].a();
                              var74 = tj.field_n[11].field_y;
                              var68 = var74;
                              var62 = var68;
                              var48 = var62;
                              var29 = var48;
                              var19 = var29;
                              var20 = 0;
                              L23: while (true) {
                                if (var20 >= 16384) {
                                  tj.field_n[11].d();
                                  var49 = tj.field_n;
                                  var18 = 0;
                                  L24: while (true) {
                                    if (~var18 <= ~var49.length) {
                                      rg.field_v = null;
                                      vp.field_D = null;
                                      cf.a(6639);
                                      return false;
                                    } else {
                                      var19_ref = var49[var18];
                                      int discarded$94 = 4;
                                      mo.a(var19_ref);
                                      var18++;
                                      continue L24;
                                    }
                                  }
                                } else {
                                  L25: {
                                    var21 = var73[var20];
                                    if (0 == var21) {
                                      break L25;
                                    } else {
                                      var22 = var21 >> 6 & 1020 | (var21 & 255) >> 3;
                                      var23 = -var22 + 256;
                                      var24 = var74[var20];
                                      var25 = var24 & 16711935;
                                      var26 = var24 & 65280;
                                      var19[var20] = gm.a(ie.a(65280 * var22 + var26 * var23, 16711865) >> 8, ie.a(16711935, var25 * var23 + var22 * 16711935 >> 8));
                                      break L25;
                                    }
                                  }
                                  var20++;
                                  continue L23;
                                }
                              }
                            } else {
                              ln.a((byte) 120, var10 * 640 >> 3);
                              var10++;
                              continue L22;
                            }
                          }
                        } else {
                          L26: {
                            gm.field_r[var10] = md.a("mg" + var10, 31094, rg.field_v, "");
                            if (var10 != 1) {
                              break L26;
                            } else {
                              hi.field_h[var10] = md.a("mg" + var10 + "b", 31094, rg.field_v, "");
                              break L26;
                            }
                          }
                          var10++;
                          continue L21;
                        }
                      }
                    } else {
                      var42 = var41[var11_int];
                      var42.a();
                      var11_int++;
                      continue L20;
                    }
                  }
                } else {
                  L27: {
                    var37 = ml.field_a[var10];
                    var38 = new t(var37.field_c, var37.field_d);
                    var38.e();
                    var37.a(-var37.field_a, -var37.field_g);
                    if (var37.field_d < var37.field_c) {
                      var14_int = 48 * var37.field_d / var37.field_c;
                      var13_int = 48;
                      break L27;
                    } else {
                      var13_int = var37.field_c * 48 / var37.field_d;
                      var14_int = 48;
                      break L27;
                    }
                  }
                  var15 = 0;
                  L28: while (true) {
                    if (var15 >= var9_ref_int__.length) {
                      var10++;
                      continue L19;
                    } else {
                      L29: {
                        t dupTemp$95 = new t(var13_int, var14_int);
                        rp.field_b[var15 * 8 + var10] = dupTemp$95;
                        var39 = dupTemp$95;
                        var16_ref_t = var39;
                        var16_ref_t.field_u = 48;
                        var16_ref_t.field_r = -var39.field_t + var39.field_u >> 1;
                        var39.e();
                        var17 = var9_ref_int__[var15];
                        ph.d(0, 0, ph.field_j, ph.field_d, var17);
                        var38.d(0, 0, var13_int, var14_int);
                        if (16777215 == var17) {
                          ph.e(0, 0, ph.field_j, ph.field_d);
                          break L29;
                        } else {
                          break L29;
                        }
                      }
                      var72 = var39.field_y;
                      var19_int = 0;
                      L30: while (true) {
                        if (~var72.length >= ~var19_int) {
                          var39.d();
                          var15++;
                          continue L28;
                        } else {
                          L31: {
                            if (~var72[var19_int] != ~var17) {
                              break L31;
                            } else {
                              var72[var19_int] = 0;
                              break L31;
                            }
                          }
                          var19_int++;
                          continue L30;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              if (null == bp.field_c) {
                if (vd.field_e == null) {
                  if (th.field_C == null) {
                    if (null != he.field_b) {
                      df.a(40.0f, 34, kf.field_D + " - 0%");
                      var52 = new fj(he.field_b.a(-120, "levels.tql", ""));
                      var53 = var52.h((byte) 126);
                      var5 = 0;
                      var6 = 1;
                      var7 = 0;
                      L32: while (true) {
                        if (var7 >= var53.length()) {
                          qc.field_ab = new int[var6];
                          mh.field_k = new int[var6];
                          var54 = new StringBuilder(8192);
                          var8 = 0;
                          var9 = 0;
                          var10_ref = null;
                          var11_int = 0;
                          L33: while (true) {
                            if (var11_int >= var53.length()) {
                              wi.field_a = new int[var9];
                              hg.field_d = new int[var9];
                              mk.field_c = new int[qc.field_ab.length];
                              var11_int = 0;
                              var8 = 0;
                              L34: while (true) {
                                if (qc.field_ab.length <= var8) {
                                  he.field_b = null;
                                  cf.a(6639);
                                  return false;
                                } else {
                                  mk.field_c[var8] = var11_int;
                                  var30 = 0;
                                  var12_int = var30;
                                  L35: while (true) {
                                    if (~var30 <= ~qc.field_ab[var8]) {
                                      var8++;
                                      continue L34;
                                    } else {
                                      hg.field_d[var11_int] = var30;
                                      int incrementValue$96 = var11_int;
                                      var11_int++;
                                      wi.field_a[incrementValue$96] = var8;
                                      var30++;
                                      continue L35;
                                    }
                                  }
                                }
                              }
                            } else {
                              L36: {
                                var12_int = var53.charAt(var11_int);
                                if (var12_int == 10) {
                                  if (var54.length() != 0) {
                                    var55 = new hc(var8, var54.toString());
                                    var54.setLength(0);
                                    qc.field_ab[var8] = qc.field_ab[var8] + 1;
                                    var9++;
                                    if (var10_ref != null) {
                                      ((hc) var10_ref).field_m = var55;
                                      var10_ref = (Object) (Object) var55;
                                      break L36;
                                    } else {
                                      jm.field_d = var55;
                                      var10_ref = (Object) (Object) var55;
                                      break L36;
                                    }
                                  } else {
                                    var8++;
                                    break L36;
                                  }
                                } else {
                                  StringBuilder discarded$97 = var54.append((char) var12_int);
                                  break L36;
                                }
                              }
                              var11_int++;
                              continue L33;
                            }
                          }
                        } else {
                          L37: {
                            var8 = var53.charAt(var7);
                            if (var8 == 10) {
                              L38: {
                                if (var5 == 0) {
                                  break L38;
                                } else {
                                  var6++;
                                  break L38;
                                }
                              }
                              var5 = 1;
                              break L37;
                            } else {
                              var5 = 0;
                              break L37;
                            }
                          }
                          var7++;
                          continue L32;
                        }
                      }
                    } else {
                      L39: {
                        if (wp.field_w <= 0) {
                          break L39;
                        } else {
                          if (eg.field_t == null) {
                            break L39;
                          } else {
                            L40: {
                              df.a(40.0f, 81, kf.field_D + " - 0%");
                              if (cc.field_d != null) {
                                break L40;
                              } else {
                                cc.field_d = fa.a(2, 13, 27375, 0);
                                break L40;
                              }
                            }
                            var3_ref_int__ = cc.field_d.field_j;
                            if (var3_ref_int__ != null) {
                              var76 = eg.field_t.a(var3_ref_int__, (byte) -97, "", "levels.tql");
                              var70 = var76;
                              var64 = var70;
                              var56 = var64;
                              var4 = var56;
                              if (var4 == null) {
                                return false;
                              } else {
                                var57 = new fj(var76);
                                var58 = var57.h((byte) 118);
                                var7 = 0;
                                var8 = qc.field_ab.length + 1;
                                var9 = 0;
                                L41: while (true) {
                                  if (~var58.length() >= ~var9) {
                                    var9 = qc.field_ab.length;
                                    var10 = 1;
                                    var11_array = new int[var8];
                                    dk.a(qc.field_ab, 0, var11_array, 0, qc.field_ab.length);
                                    qc.field_ab = var11_array;
                                    var12 = new int[var8];
                                    dk.a(mh.field_k, 0, var12, 0, mh.field_k.length);
                                    mh.field_k = var12;
                                    var13_ref = new StringBuilder(8192);
                                    var14 = jm.field_d;
                                    L42: while (true) {
                                      if (var14.field_m == null) {
                                        var15 = 0;
                                        L43: while (true) {
                                          if (var15 >= var58.length()) {
                                            hg.field_d = new int[var10];
                                            wi.field_a = new int[var10];
                                            mk.field_c = new int[qc.field_ab.length];
                                            var15 = 0;
                                            var9 = 0;
                                            L44: while (true) {
                                              if (qc.field_ab.length <= var9) {
                                                ti.field_l = null;
                                                eg.field_t = null;
                                                cf.a(6639);
                                                return false;
                                              } else {
                                                mk.field_c[var9] = var15;
                                                var31 = 0;
                                                var16 = var31;
                                                L45: while (true) {
                                                  if (~var31 <= ~qc.field_ab[var9]) {
                                                    var9++;
                                                    continue L44;
                                                  } else {
                                                    hg.field_d[var15] = var31;
                                                    int incrementValue$98 = var15;
                                                    var15++;
                                                    wi.field_a[incrementValue$98] = var9;
                                                    var31++;
                                                    continue L45;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            L46: {
                                              var16 = var58.charAt(var15);
                                              if (var16 == 10) {
                                                if (var13_ref.length() != 0) {
                                                  var59 = new hc(var9, var13_ref.toString());
                                                  var13_ref = new StringBuilder(8192);
                                                  qc.field_ab[var9] = qc.field_ab[var9] + 1;
                                                  var10++;
                                                  var14.field_m = var59;
                                                  var14 = var59;
                                                  break L46;
                                                } else {
                                                  var9++;
                                                  break L46;
                                                }
                                              } else {
                                                StringBuilder discarded$99 = var13_ref.append((char) var16);
                                                break L46;
                                              }
                                            }
                                            var15++;
                                            continue L43;
                                          }
                                        }
                                      } else {
                                        var14 = var14.field_m;
                                        var10++;
                                        continue L42;
                                      }
                                    }
                                  } else {
                                    L47: {
                                      var10 = var58.charAt(var9);
                                      if (10 != var10) {
                                        var7 = 0;
                                        break L47;
                                      } else {
                                        L48: {
                                          if (var7 == 0) {
                                            break L48;
                                          } else {
                                            var8++;
                                            break L48;
                                          }
                                        }
                                        var7 = 1;
                                        break L47;
                                      }
                                    }
                                    var9++;
                                    continue L41;
                                  }
                                }
                              }
                            } else {
                              return false;
                            }
                          }
                        }
                      }
                      if (!lp.field_f) {
                        var3 = 0;
                        var4_ref = jm.field_d;
                        L49: while (true) {
                          if (var4_ref == null) {
                            ol.field_f = new hc[var3];
                            var3 = 0;
                            var4_ref = jm.field_d;
                            L50: while (true) {
                              if (var4_ref == null) {
                                L51: {
                                  if (be.field_a[0] == 0) {
                                    be.a();
                                    be.a(1.0f);
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                lp.field_f = true;
                                cf.a(6639);
                                return false;
                              } else {
                                int incrementValue$100 = var3;
                                var3++;
                                ol.field_f[incrementValue$100] = var4_ref;
                                var4_ref = var4_ref.field_m;
                                continue L50;
                              }
                            }
                          } else {
                            L52: {
                              if (!var4_ref.e(0)) {
                                break L52;
                              } else {
                                if (!var4_ref.b(107)) {
                                  break L52;
                                } else {
                                  if (!var4_ref.g(1)) {
                                    break L52;
                                  } else {
                                    var3++;
                                    var4_ref = var4_ref.field_m;
                                    continue L49;
                                  }
                                }
                              }
                            }
                            df.a((float)(var3 * 60 / hg.field_d.length + 40), 51, kf.field_D + " - " + 100 * var3 / hg.field_d.length + "%");
                            return false;
                          }
                        }
                      } else {
                        if (null == ig.field_q) {
                          ig.field_q = new hc(8, "ZU##############################55555555################################################5555555555###############################################55######555#############################################555#######55#############################################55########555############################################555########55#############################################555######555##############################################55######55########################################################################################################5555####################################################5555555###########55555#################################555##5555#########55555555###############################55#####55########55#####555##############################555####55########55#######55##############################555##555#######55########55###############################555555########55#########55################################555##########55##55###555############################################5555555###55####################################5#######55555555##################################555555555################################################55555555##########5555########################################5555########555555#########################################55#######555##555#################################555555555#######55#####55################################55555555########555###555#####################################5555########55555555#######################################55#######555555555################################555555555#######55#######################################55555555########################################################################5#############################555########5########555555555############################555555555555########55555555###############################5555555555#############5555#################################55###555##############55################################55#####55#######555555555################################5555##55########55555555##################################555555##############5555###################################555#################55################################################555555555################################5555555555555###55555555##################################55555555555#################55############################################55555######55############################55555##########5555555##################################5555555########55555#555################################55555#555#######55#555#55################################55#555#55#######555#55555################################555#55555########55##555##################################55##555################################################################################################################5########################################################55##################################################555555555###############################################5555555555###############################################555####55#################################################55#################################################################################################################55555###################################################5555555#################################################55555#555################################################55#555#55################################################555#55555#################################################55##555#####################fEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfE0007wQ5Y0cw00");
                          cf.a(6639);
                          return false;
                        } else {
                          if (ig.field_q.e(0)) {
                            if (null != hg.field_b) {
                              if (vo.field_f != null) {
                                return true;
                              } else {
                                vo.field_f = new mh[12];
                                fn.field_c = 0;
                                var3 = 0;
                                L53: while (true) {
                                  if (var3 >= 12) {
                                    bn.field_h = 0;
                                    cf.a(6639);
                                    return false;
                                  } else {
                                    vo.field_f[var3] = new mh((Torquing) this, var3);
                                    var3++;
                                    continue L53;
                                  }
                                }
                              }
                            } else {
                              int discarded$101 = -1339942685;
                              lc.d();
                              kl.field_p = null;
                              cf.a(6639);
                              return false;
                            }
                          } else {
                            cf.a(6639);
                            return false;
                          }
                        }
                      }
                    }
                  } else {
                    df.a(39.0f, -87, pb.field_c);
                    ((Torquing) this).b((byte) 73);
                    la.field_k[0] = new wl(ih.a(i.c(-102, -7922), "", id.field_a, th.field_C, "music/Torquing_Titlescreen"));
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
                } else {
                  df.a(37.0f, -88, jo.field_a);
                  ((Torquing) this).b((byte) 73);
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
              } else {
                df.a(35.0f, 121, jo.field_a);
                ((Torquing) this).b((byte) 73);
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
                var3 = bp.field_c.a(-1, "");
                var50 = id.field_a.a(bp.field_c.a("torq_whistle", -107, var3), var3, (byte) -84);
                var75 = new byte[var50.field_n.length];
                var69 = var75;
                var63 = var69;
                var51 = var63;
                var5_ref_byte__ = var51;
                dk.a(var50.field_n, 0, var5_ref_byte__, 0, var75.length);
                th.field_F[5] = new gg(var50.field_m, var75, var50.field_k, var50.field_o, var50.field_l);
                bp.field_c = null;
                cf.a(6639);
                return false;
              }
            }
          }
        }
    }

    private final void f() {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hc var12 = null;
        int var13 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_139_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_138_0 = 0;
        var13 = field_u;
        var2 = km.b(-1);
        oo.field_b = oo.field_b + 1;
        ed.a(0);
        var4 = 0;
        L0: while (true) {
          int discarded$2 = -13;
          if (!np.a()) {
            L1: {
              if (0 == ta.field_o) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_10_0;
              var6 = 1;
              if (fn.field_c != -1) {
                L3: {
                  if (!vo.field_f[fn.field_c].field_a.field_k) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                var6 = stackIn_15_0;
                break L2;
              } else {
                break L2;
              }
            }
            L4: {
              var11 = bn.field_h;
              if (var11 != 0) {
                if (var11 == 2) {
                  L5: {
                    if (1 == oo.field_b) {
                      L6: {
                        if (tm.field_c == 11) {
                          pl.a((byte) -120, true);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (2 == tm.field_c) {
                        vl.field_c = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  if (~(oo.field_b >> 1) != ~tm.field_b) {
                    break L4;
                  } else {
                    ie.field_b.field_e.a(0);
                    bn.field_h = -1;
                    fn.field_c = tm.field_c;
                    vo.field_f[fn.field_c].field_i = 0;
                    break L4;
                  }
                } else {
                  if (var11 != 1) {
                    if (10 != var11) {
                      if (3 != var11) {
                        if (var11 == 7) {
                          if (250 <= oo.field_b) {
                            ((Torquing) this).a(true, ie.field_b.field_L, 5, var6 != 0);
                            break L4;
                          } else {
                            L7: {
                              if (~oo.field_b >= ~(2 * tm.field_b)) {
                                break L7;
                              } else {
                                if (var5 == 0) {
                                  break L7;
                                } else {
                                  ((Torquing) this).a(true, ie.field_b.field_L, 5, true);
                                  break L4;
                                }
                              }
                            }
                            if (~(2 * tm.field_b) <= ~oo.field_b) {
                              break L4;
                            } else {
                              if (var4 != 0) {
                                ((Torquing) this).a(true, ie.field_b.field_L, 5, false);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        } else {
                          if (var11 == 4) {
                            L8: {
                              var11 = 0;
                              if (~ie.field_b.field_L != ~tm.field_c) {
                                var12 = ie.field_b.field_d.field_m;
                                break L8;
                              } else {
                                var12 = ie.field_b.field_d;
                                break L8;
                              }
                            }
                            L9: {
                              if (var12.field_e == null) {
                                break L9;
                              } else {
                                var11 = 2 * var12.field_e.a(false);
                                break L9;
                              }
                            }
                            if (2 * tm.field_b < oo.field_b) {
                              if (var11 > oo.field_b) {
                                if (var5 != 0) {
                                  ((Torquing) this).a(true, ie.field_b.field_L, 5, true);
                                  break L4;
                                } else {
                                  if (var4 != 0) {
                                    ((Torquing) this).a(true, ie.field_b.field_L, 5, false);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              } else {
                                ((Torquing) this).a(true, ie.field_b.field_L, 5, var6 != 0);
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            if (6 != var11) {
                              if (var11 != 11) {
                                if (var11 != 12) {
                                  if (var11 == 5) {
                                    if (~tm.field_b >= ~(oo.field_b / 2)) {
                                      bn.field_h = -1;
                                      jh.a(la.field_k[ie.field_b.field_q], 0);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  } else {
                                    if (var11 == 8) {
                                      L10: {
                                        var9 = 0;
                                        if (-1 + qc.field_ab.length != tm.field_c) {
                                          stackOut_134_0 = 0;
                                          stackIn_135_0 = stackOut_134_0;
                                          break L10;
                                        } else {
                                          stackOut_133_0 = 1;
                                          stackIn_135_0 = stackOut_133_0;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        L12: {
                                          var7 = stackIn_135_0;
                                          var10 = 0;
                                          if (wp.field_w > 0) {
                                            break L12;
                                          } else {
                                            if (tm.field_c != 1) {
                                              break L12;
                                            } else {
                                              stackOut_137_0 = 1;
                                              stackIn_139_0 = stackOut_137_0;
                                              break L11;
                                            }
                                          }
                                        }
                                        stackOut_138_0 = 0;
                                        stackIn_139_0 = stackOut_138_0;
                                        break L11;
                                      }
                                      L13: {
                                        var8 = stackIn_139_0;
                                        if (oo.field_b < 250) {
                                          L14: {
                                            if (tm.field_b * 2 >= oo.field_b) {
                                              break L14;
                                            } else {
                                              if (var5 == 0) {
                                                break L14;
                                              } else {
                                                var9 = 1;
                                                var10 = 1;
                                                break L13;
                                              }
                                            }
                                          }
                                          if (~oo.field_b >= ~(2 * tm.field_b)) {
                                            break L13;
                                          } else {
                                            if (var4 != 0) {
                                              var9 = 0;
                                              var10 = 1;
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        } else {
                                          var9 = var6;
                                          var10 = 1;
                                          break L13;
                                        }
                                      }
                                      if (var10 == 0) {
                                        if (var7 == 0) {
                                          break L4;
                                        } else {
                                          if (tm.field_b * 2 == oo.field_b) {
                                            ie.field_b.d(1);
                                            break L4;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      } else {
                                        if (var8 != 0) {
                                          ie.field_b.b(9);
                                          ((Torquing) this).a(true, 10, 12, var9 != 0);
                                          break L4;
                                        } else {
                                          if (var7 != 0) {
                                            ((Torquing) this).a(true, tm.field_c, 11, var9 != 0);
                                            break L4;
                                          } else {
                                            ((Torquing) this).a(true, 1 + tm.field_c, 9, var9 != 0);
                                            break L4;
                                          }
                                        }
                                      }
                                    } else {
                                      if (9 != var11) {
                                        break L4;
                                      } else {
                                        if (oo.field_b == 2 * tm.field_b) {
                                          ie.field_b.d(1);
                                          cf.a(6639);
                                          break L4;
                                        } else {
                                          if (250 > oo.field_b) {
                                            L15: {
                                              if (~(tm.field_b * 2) <= ~oo.field_b) {
                                                break L15;
                                              } else {
                                                if (var5 != 0) {
                                                  ((Torquing) this).a(true, ie.field_b.field_L, 4, true);
                                                  break L4;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            if (~(2 * tm.field_b) <= ~oo.field_b) {
                                              break L4;
                                            } else {
                                              if (var4 == 0) {
                                                break L4;
                                              } else {
                                                ((Torquing) this).a(true, ie.field_b.field_L, 4, false);
                                                break L4;
                                              }
                                            }
                                          } else {
                                            ((Torquing) this).a(true, ie.field_b.field_L, 4, var6 != 0);
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  L16: {
                                    if (oo.field_b != 1) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (tm.field_c == 11) {
                                          pl.a((byte) -97, true);
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      if (2 == tm.field_c) {
                                        vl.field_c = null;
                                        break L16;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if (oo.field_b >> 1 != tm.field_b) {
                                    break L4;
                                  } else {
                                    fn.field_c = tm.field_c;
                                    bn.field_h = -1;
                                    vo.field_f[fn.field_c].field_i = 0;
                                    break L4;
                                  }
                                }
                              } else {
                                if (tm.field_b <= oo.field_b / 2) {
                                  bn.field_h = -1;
                                  jh.a(la.field_k[ie.field_b.field_q], 0);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              L18: {
                                var11 = 0;
                                if (~tm.field_c == ~ie.field_b.field_L) {
                                  var12 = ie.field_b.field_d;
                                  break L18;
                                } else {
                                  var12 = ie.field_b.field_d.field_m;
                                  break L18;
                                }
                              }
                              L19: {
                                if (var12.field_e != null) {
                                  var11 = 2 * var12.field_e.a(false);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              if (tm.field_b * 2 != oo.field_b) {
                                if (~(2 * tm.field_b) > ~oo.field_b) {
                                  L20: {
                                    if (la.field_k[11].e(17)) {
                                      break L20;
                                    } else {
                                      if (~var11 >= ~oo.field_b) {
                                        ((Torquing) this).a(true, tm.field_c, 5, var6 != 0);
                                        break L4;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  if (var5 != 0) {
                                    ((Torquing) this).a(true, tm.field_c, 5, true);
                                    break L4;
                                  } else {
                                    if (var4 == 0) {
                                      break L4;
                                    } else {
                                      ((Torquing) this).a(true, tm.field_c, 5, false);
                                      break L4;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              } else {
                                ie.field_b.d(1);
                                cf.a(6639);
                                break L4;
                              }
                            }
                          }
                        }
                      } else {
                        if (oo.field_b < 250) {
                          L21: {
                            if (tm.field_b * 2 >= oo.field_b) {
                              break L21;
                            } else {
                              if (var5 != 0) {
                                fn.field_c = -1;
                                ((Torquing) this).a(true, ie.field_b.field_L, 4, true);
                                break L4;
                              } else {
                                break L21;
                              }
                            }
                          }
                          if (~(2 * tm.field_b) <= ~oo.field_b) {
                            break L4;
                          } else {
                            if (var4 == 0) {
                              break L4;
                            } else {
                              fn.field_c = -1;
                              ((Torquing) this).a(true, ie.field_b.field_L, 4, false);
                              break L4;
                            }
                          }
                        } else {
                          fn.field_c = -1;
                          ((Torquing) this).a(true, ie.field_b.field_L, 4, var6 != 0);
                          break L4;
                        }
                      }
                    } else {
                      if (tm.field_b == oo.field_b >> 1) {
                        L22: {
                          if (fn.field_c != 3) {
                            break L22;
                          } else {
                            gn.field_l = null;
                            break L22;
                          }
                        }
                        bn.field_h = -1;
                        fn.field_c = -1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    L23: {
                      if (oo.field_b != 1) {
                        break L23;
                      } else {
                        L24: {
                          if (tm.field_c != 11) {
                            break L24;
                          } else {
                            pl.a((byte) -128, true);
                            break L24;
                          }
                        }
                        if (2 != tm.field_c) {
                          break L23;
                        } else {
                          vl.field_c = null;
                          break L23;
                        }
                      }
                    }
                    if (oo.field_b >> 1 == tm.field_b) {
                      L25: {
                        if (3 != fn.field_c) {
                          break L25;
                        } else {
                          gn.field_l = null;
                          break L25;
                        }
                      }
                      L26: {
                        if (11 != tm.field_c) {
                          break L26;
                        } else {
                          if (!je.a((byte) 76)) {
                            break L26;
                          } else {
                            ie.field_b = null;
                            jh.field_y.a(0);
                            nh.field_k = 0;
                            fa.field_b = 0;
                            ao.field_f = 0;
                            bo.field_l.a(0);
                            break L26;
                          }
                        }
                      }
                      bn.field_h = -1;
                      fn.field_c = tm.field_c;
                      vo.field_f[fn.field_c].field_i = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                }
              } else {
                int discarded$3 = 75;
                am.a();
                if (!hj.field_b) {
                  break L4;
                } else {
                  bn.field_h = -1;
                  break L4;
                }
              }
            }
            L27: {
              if (bn.field_h == 0) {
                break L27;
              } else {
                if (-var2 + km.b(-1) < 2L) {
                  cf.a(6639);
                  break L27;
                } else {
                  break L27;
                }
              }
            }
            return;
          } else {
            L28: {
              if (e.field_f == 13) {
                break L28;
              } else {
                if (e.field_f == 84) {
                  break L28;
                } else {
                  if (83 == e.field_f) {
                    break L28;
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
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        L0: {
          L1: {
            if (param2 == 1) {
              break L1;
            } else {
              if (2 == param2) {
                break L1;
              } else {
                if (param2 != 12) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
          }
          if (param1 != -1) {
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
          ((Torquing) this).field_t = null;
          tm.field_c = param1;
          int discarded$2 = -108;
          this.f();
          return;
        } else {
          return;
        }
    }

    private final void o() {
        int var3 = 0;
        int var4 = field_u;
        int discarded$0 = 44;
        int discarded$1 = 50;
        oe.a();
        oi.a(50, (byte) 80);
        tb.a(50, -128);
        no.c(-101);
        jh.a(la.field_k[0], 0);
        int var2 = tm.field_b;
        ul.field_b = new int[var2];
        for (var3 = 1; ~var3 > ~var2; var3++) {
            ul.field_b[var3] = i.c(65535, vi.field_a[-var3 + var2]);
        }
        int discarded$2 = -124;
        ok.a();
    }

    final void b(byte param0) {
        Object var2 = null;
        tj var3_ref_tj = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_46_0 = 0;
        pp stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          var6 = field_u;
          if (null != dg.field_i) {
            stackOut_2_0 = dg.field_i;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = k.field_d;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
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
                      int discarded$6 = 3;
                      this.r();
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
                      var3_ref_tj = (tj) (Object) ie.field_b.field_B.b(0);
                      if (var3_ref_tj == null) {
                        break L3;
                      } else {
                        L4: {
                          var5 = ie.field_b.field_n;
                          if (var5 >= 80) {
                            if (var5 < 230) {
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
                      int discarded$7 = 160;
                      if (!on.b()) {
                        break L5;
                      } else {
                        ph.c(0, 0, ph.field_j, ph.field_d);
                        int discarded$8 = -4;
                        qk.a(14, 14, s.field_t);
                        break L5;
                      }
                    }
                    L6: {
                      if (pb.field_e != -1) {
                        var3 = oo.field_b << 3;
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
                        int discarded$9 = 160;
                        if (on.b()) {
                          break L7;
                        } else {
                          L8: {
                            L9: {
                              if (dg.field_i != null) {
                                break L9;
                              } else {
                                if (!ae.field_ib) {
                                  stackOut_45_0 = 0;
                                  stackIn_46_0 = stackOut_45_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            stackOut_44_0 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            break L8;
                          }
                          int discarded$10 = -25564;
                          oo.a(stackIn_46_0 != 0);
                          break L7;
                        }
                      }
                    }
                    ni.a((java.awt.Canvas) var2, 0, 0, -122);
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
            ji.a((byte) -99, (java.awt.Canvas) var2);
            return;
          } else {
            ji.a((byte) -99, (java.awt.Canvas) var2);
            return;
          }
        } else {
          L10: {
            L11: {
              stackOut_4_0 = var2;
              stackIn_7_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (dg.field_i != null) {
                break L11;
              } else {
                stackOut_5_0 = stackIn_5_0;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (!ae.field_ib) {
                  stackOut_8_0 = stackIn_8_0;
                  stackOut_8_1 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  break L10;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  break L11;
                }
              }
            }
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L10;
          }
          int discarded$11 = -19;
          ii.a((java.awt.Canvas) (Object) stackIn_9_0, stackIn_9_1 != 0);
          return;
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        hc var4 = null;
        uf var5 = null;
        L0: {
          var3 = wi.field_a[param0];
          k.a(var3, 1);
          nc.a(var3, true);
          qc.field_cb.a((byte) 90, 0, 0);
          wh.field_t[var3].a(0, 0, 76);
          pm.field_m[var3].a(0, 0);
          mh.field_d[var3].a(0, 0, 76);
          ml.field_a[var3].a(0, 0);
          if (~ie.field_b.field_L != ~param0) {
            var4 = ie.field_b.field_d.field_m;
            break L0;
          } else {
            var4 = ie.field_b.field_d;
            break L0;
          }
        }
        L1: {
          if (var4.field_e != null) {
            break L1;
          } else {
            uf dupTemp$3 = new uf((uc) (Object) i.field_Q, 0, 372, 286, ml.field_a[var3], -34, -159);
            var4.field_e = dupTemp$3;
            var5 = dupTemp$3;
            var5.a((byte) -59, 30);
            boolean discarded$4 = var5.a(false, ff.a(new String[2], 0, qj.field_b));
            var5.a((byte) -50, 40);
            ((Torquing) this).a(0, var4, var5);
            var5.a(30, wj.field_k.field_d, 111);
            var5.c(0);
            break L1;
          }
        }
        var4.field_e.b(34, -127, 159);
        wj.field_k.a(-(wj.field_k.field_c / 2) + 219, 414);
        int discarded$5 = qh.field_c.a(kk.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, (dd.field_c.field_x * 3 - -3) / 2);
        ph.c(0, 0, 640, 480, 16777215);
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        mh stackIn_99_0 = null;
        mh stackIn_100_0 = null;
        mh stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        mh stackOut_98_0 = null;
        mh stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        mh stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        L0: {
          var4 = field_u;
          la.field_c.b();
          qd.field_b.b();
          if (dg.field_i == null) {
            break L0;
          } else {
            if (dg.field_i.field_b) {
              ug.a(-95);
              int discarded$20 = -23658;
              s.b();
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          stackOut_4_0 = this;
          stackOut_4_1 = 23;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          if (null == dg.field_i) {
            stackOut_6_0 = this;
            stackOut_6_1 = stackIn_6_1;
            stackOut_6_2 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            break L1;
          } else {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            break L1;
          }
        }
        L2: {
          ((Torquing) this).a((byte) stackIn_7_1, stackIn_7_2 != 0);
          if (w.field_F) {
            int discarded$21 = 26418;
            this.s();
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
                int discarded$22 = 122;
                this.o();
                ee.field_s = true;
                break L3;
              } else {
                break L3;
              }
            } else {
              if (null == kg.field_c) {
                if (kb.field_f == null) {
                  int discarded$23 = 160;
                  if (on.b()) {
                    if (pb.field_e == -1) {
                      L4: {
                        int discarded$24 = 0;
                        var3 = ua.a();
                        if (var3 != 3) {
                          if (var3 != 2) {
                            if (var3 == 4) {
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
                          int discarded$25 = 240;
                          hm.a(true, um.field_m.field_x, (t[]) null, 0, (uc) (Object) i.field_Q, 0, (t[]) null, 3, 320, 0, um.field_m.field_x * 3 / 2);
                          break L4;
                        }
                      }
                      int discarded$26 = 160;
                      if (on.b()) {
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
                        stackOut_40_0 = this;
                        stackIn_42_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (dg.field_i == null) {
                          stackOut_42_0 = this;
                          stackOut_42_1 = 0;
                          stackIn_43_0 = stackOut_42_0;
                          stackIn_43_1 = stackOut_42_1;
                          break L5;
                        } else {
                          stackOut_41_0 = this;
                          stackOut_41_1 = 1;
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_43_1 = stackOut_41_1;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          var3 = ((Torquing) this).b(stackIn_43_1 != 0, -92);
                          if (var3 == 1) {
                            break L7;
                          } else {
                            if (var3 != 2) {
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
                        if (var3 != 2) {
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
                      if (wp.field_w > 0) {
                        break L10;
                      } else {
                        if (~(qc.field_ab[1] + qc.field_ab[0]) < ~nh.field_k) {
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
                    ao.field_f = ao.field_f & ~kg.field_c.field_m;
                    fa.field_b = fa.field_b | kg.field_c.field_m;
                    kg.field_c = null;
                    pm.a((byte) 102);
                    if (fn.field_c != 8) {
                      break L11;
                    } else {
                      if (ao.field_f == 0) {
                        fn.field_c = 2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  int discarded$27 = 9072;
                  c.a((Torquing) this);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          } else {
            ((Torquing) this).n(param0 + 126);
            if (sf.a(-1)) {
              int discarded$28 = 1;
              if (!la.a()) {
                return;
              } else {
                L12: {
                  if (!ee.field_s) {
                    boolean discarded$29 = this.b(false, (byte) -102);
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
            field_v = null;
            break L13;
          }
        }
        L14: {
          if (var2 == 0) {
            break L14;
          } else {
            if (pb.field_e == -1) {
              sg.field_o = sg.field_o + 1;
              if (-1 != bn.field_h) {
                int discarded$30 = -108;
                this.f();
                break L14;
              } else {
                if (fn.field_c == -1) {
                  ie.field_b.i(40);
                  break L14;
                } else {
                  L15: {
                    vo.field_f[fn.field_c].field_i = vo.field_f[fn.field_c].field_i + 1;
                    stackOut_98_0 = vo.field_f[fn.field_c];
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_99_0 = stackOut_98_0;
                    if (bn.field_h != -1) {
                      stackOut_100_0 = (mh) (Object) stackIn_100_0;
                      stackOut_100_1 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      break L15;
                    } else {
                      stackOut_99_0 = (mh) (Object) stackIn_99_0;
                      stackOut_99_1 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      break L15;
                    }
                  }
                  ((mh) (Object) stackIn_101_0).a(stackIn_101_1 != 0, -22807);
                  np.a(-1, -32596, 0);
                  break L14;
                }
              }
            } else {
              if (0 == (1073741824 & pb.field_e)) {
                int fieldTemp$31 = oo.field_b + 1;
                oo.field_b = oo.field_b + 1;
                if (32 != fieldTemp$31) {
                  break L14;
                } else {
                  L16: {
                    int discarded$32 = 160;
                    if (on.b()) {
                      mf.a(true);
                      break L16;
                    } else {
                      int discarded$33 = -124;
                      eb.a();
                      break L16;
                    }
                  }
                  pb.field_e = pb.field_e | 1073741824;
                  break L14;
                }
              } else {
                int fieldTemp$34 = oo.field_b;
                oo.field_b = oo.field_b - 1;
                if (32 != fieldTemp$34) {
                  if (oo.field_b == 0) {
                    pb.field_e = -1;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  L17: {
                    var3 = pb.field_e ^ 1073741824;
                    if (je.a((byte) 67)) {
                      break L17;
                    } else {
                      if (var3 != 0) {
                        if (1 == var3) {
                          fn.field_c = 2;
                          break L17;
                        } else {
                          if (var3 != 2) {
                            if (3 == var3) {
                              fn.field_c = 9;
                              break L17;
                            } else {
                              break L17;
                            }
                          } else {
                            fn.field_c = 6;
                            break L17;
                          }
                        }
                      } else {
                        ie.field_b.b(9);
                        if (fn.field_c == 7) {
                          fn.field_c = 2;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L18: {
                    if (var3 != 4) {
                      break L18;
                    } else {
                      int discarded$35 = 240;
                      hm.a(true, um.field_m.field_x, (t[]) null, 0, (uc) (Object) i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2);
                      break L18;
                    }
                  }
                  bn.field_h = -1;
                  break L14;
                }
              }
            }
          }
        }
        L19: {
          L20: {
            if (null == ie.field_b) {
              break L20;
            } else {
              if (ie.field_b.field_B.b(0) == null) {
                break L20;
              } else {
                int fieldTemp$36 = ie.field_b.field_n + 1;
                ie.field_b.field_n = ie.field_b.field_n + 1;
                if (fieldTemp$36 != 335) {
                  break L19;
                } else {
                  ie.field_b.field_n = 0;
                  q discarded$37 = ie.field_b.field_B.a((byte) -86);
                  break L19;
                }
              }
            }
          }
          break L19;
        }
        L21: while (true) {
          int discarded$38 = 21;
          if (!kg.a(nk.field_s)) {
            L22: {
              jd.a((byte) -115, 0);
              int discarded$39 = 38;
              if (!mk.a()) {
                break L22;
              } else {
                L23: {
                  var3 = ((Torquing) this).g(118);
                  if (var3 != 2) {
                    break L23;
                  } else {
                    L24: {
                      if (bn.field_h != -1) {
                        break L24;
                      } else {
                        if (fn.field_c == -1) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    lg.h(-122);
                    break L22;
                  }
                }
                break L22;
              }
            }
            return;
          } else {
            ((Torquing) this).e((byte) -117);
            continue L21;
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

    private final void r() {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = field_u;
        if (0 != bn.field_h) {
          L0: {
            var2 = oo.field_b >> 1;
            if (~tm.field_b >= ~var2) {
              break L0;
            } else {
              L1: {
                L2: {
                  var3 = bn.field_h;
                  if (1 != var3) {
                    if (var3 != 10) {
                      if (var3 != 3) {
                        if (var3 == 7) {
                          break L2;
                        } else {
                          L3: {
                            if (var3 == 2) {
                              break L3;
                            } else {
                              if (6 != var3) {
                                if (8 != var3) {
                                  if (var3 != 4) {
                                    if (var3 == 5) {
                                      this.a(tm.field_c, 22517);
                                      break L1;
                                    } else {
                                      if (var3 == 9) {
                                        this.b(90, tm.field_c - 1);
                                        break L1;
                                      } else {
                                        if (var3 != 11) {
                                          if (var3 == 12) {
                                            this.b(96, 1);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          this.b(101, tm.field_c);
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    this.c(false, wi.field_a[tm.field_c]);
                                    break L1;
                                  }
                                } else {
                                  break L3;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          ie.field_b.a(false);
                          break L1;
                        }
                      } else {
                        vo.field_f[fn.field_c].c(93);
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                vo.field_f[fn.field_c].c(93);
                break L1;
              }
              if (var2 <= 0) {
                break L0;
              } else {
                gd.field_b.e();
                ph.b();
                break L0;
              }
            }
          }
          L4: {
            if (var2 > 0) {
              L5: {
                L6: {
                  var3 = bn.field_h;
                  if (var3 != 10) {
                    if (var3 != 5) {
                      if (var3 != 11) {
                        L7: {
                          if (var3 == 2) {
                            break L7;
                          } else {
                            if (var3 != 1) {
                              if (var3 == 12) {
                                break L7;
                              } else {
                                L8: {
                                  if (var3 == 3) {
                                    break L8;
                                  } else {
                                    if (var3 != 9) {
                                      L9: {
                                        if (7 == var3) {
                                          break L9;
                                        } else {
                                          if (var3 == 6) {
                                            break L9;
                                          } else {
                                            if (4 == var3) {
                                              break L9;
                                            } else {
                                              if (var3 == 8) {
                                                this.b(42, tm.field_c);
                                                break L5;
                                              } else {
                                                break L5;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.a(tm.field_c, 22517);
                                      break L5;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                this.c(false, tm.field_c);
                                break L5;
                              }
                            } else {
                              break L7;
                            }
                          }
                        }
                        vo.field_f[tm.field_c].c(93);
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                ie.field_b.a(false);
                break L5;
              }
              if (tm.field_b <= var2) {
                break L4;
              } else {
                mk.field_b.a(-86);
                vi.a(var2, gd.field_b, 0, 0, vi.field_a);
                break L4;
              }
            } else {
              break L4;
            }
          }
          return;
        } else {
          k.a(0, 1);
          nc.a(0, true);
          int discarded$1 = -118;
          jk.a();
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
        int discarded$0 = 0;
        nb.b();
    }

    public static void p(int param0) {
        field_w = null;
        field_v = null;
        if (param0 != 29165) {
            field_x = 30;
        }
    }

    final void a(int param0, hc param1, uf param2) {
        RuntimeException var4 = null;
        String[] var5_ref_String__ = null;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        String var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var8 = field_u;
        try {
          L0: {
            L1: {
              var9 = kc.a('~', param1.field_l, param0);
              var10 = var9;
              if (1 != var9.length) {
                boolean discarded$16 = param2.a((t) null, var9[0], param0 ^ 250);
                break L1;
              } else {
                var5_ref_String__ = kc.a('/', var9[0], 0);
                var6_int = 0;
                L2: while (true) {
                  if (~var6_int <= ~var5_ref_String__.length) {
                    break L1;
                  } else {
                    var7 = var5_ref_String__[var6_int];
                    boolean discarded$17 = param2.a(false, var7);
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
                boolean discarded$18 = param2.a(hh.field_e[var6.charAt(0) - 48], var6.substring(1), param0 ^ 250);
                var5++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("Torquing.AB(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    public final void init() {
        ((Torquing) this).a(16, "torquing", -116);
    }

    private final void q() {
        int var5_int = 0;
        int var7 = 0;
        int var8 = field_u;
        nl.field_s = qg.a(e.field_b, rp.field_d, "kartika13", "", 255);
        sm[] var9 = ip.a(rg.field_v, -119, "", "smallfont");
        byte[] var22 = uf.field_l.a(-108, "smallfont", "");
        i.field_N = ok.a(var9, 256, var22);
        um.field_m = io.a(var9, -1, var22);
        i.field_Q = ob.a(1579032, new int[3], var22, true, var9);
        int[] var23 = i.field_Q.field_O[0];
        int[] var19 = var23;
        int[] var15 = var19;
        int[] var11 = var15;
        int[] var4 = var11;
        if (!(i.field_Q.field_O.length >= 11)) {
            i.field_Q.field_O = new int[11][];
        }
        i.field_Q.field_O[0] = var23;
        for (var5_int = 1; var5_int < 11; var5_int++) {
            i.field_Q.field_O[var5_int] = new int[var23.length];
            dk.a(var4, 0, i.field_Q.field_O[var5_int], 0, var23.length);
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
        i.field_Q.field_O[8][5] = 6710886;
        i.field_Q.field_O[9][1] = 16750848;
        i.field_Q.field_O[10][3] = 2236962;
        i.field_Q.field_O[10][5] = 6710886;
        i.field_Q.field_O[10][4] = 4473924;
        i.field_Q.field_O[10][1] = 16750848;
        sm[] var5 = ip.a(rg.field_v, -121, "", "minifont");
        byte[] var24 = uf.field_l.a(-114, "minifont", "");
        dd.field_c = ok.a(var5, 256, var24);
        qh.field_c = ob.a(1579032, new int[2], var24, true, var5);
        qh.field_c.field_x = qh.field_c.field_x - 1;
        int[] var25 = qh.field_c.field_O[0];
        int[] var21 = var25;
        int[] var17 = var21;
        int[] var13 = var17;
        var4 = var13;
        if (!(qh.field_c.field_O.length >= 3)) {
            qh.field_c.field_O = new int[3][];
        }
        qh.field_c.field_O[0] = var25;
        for (var7 = 1; var7 < 3; var7++) {
            qh.field_c.field_O[var7] = new int[var25.length];
            dk.a(var4, 0, qh.field_c.field_O[var7], 0, var25.length);
        }
        qh.field_c.field_O[0][1] = 16777215;
        qh.field_c.field_O[1][1] = 16711680;
        qh.field_c.field_O[2][1] = 16750848;
    }

    private final void s() {
        if (null != rd.field_z) {
            hg.a((byte) -77, rd.field_z);
            rd.field_z = null;
            cf.a(6639);
        }
        rl.field_a = vg.a(-27646, 1);
        rg.field_v = vg.a(-27646, 2);
        vp.field_D = vg.a(-27646, 3);
        th.field_C = vg.a(-27646, 4);
        vd.field_e = vg.a(-27646, 5);
        bp.field_c = vg.a(-27646, 6);
        uf.field_l = vg.a(-27646, 8);
        he.field_b = vg.a(-27646, 12);
        eg.field_t = vg.a(-27646, 13);
        n.field_q = vg.a(-27646, 14);
        kc.a(1, rp.field_d, e.field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new kk();
    }
}
