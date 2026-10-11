/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Pixelate extends lb {
    static bd field_G;
    static tf field_E;
    public static boolean field_H;

    final void a(byte param0) {
        this.a(55, false, 4, 2, true, 12, 1, 0);
        vi var3 = new vi();
        var3.field_x.a(true, 9, 128);
        var3.field_H.a(true, 9, 128);
        kb.a(22050, mc.field_k, var3, true, (java.awt.Component) ((Object) ec.field_u), 127);
        sl.field_l = 16777215;
        mh.field_a = 2;
        ce.field_b = 13421772;
        mj.field_k = 0;
        hd.field_n = 0;
        qo.field_s = 16777215;
        this.a(true, true, true, true, true, true, -80);
        wd.field_d[69] = -1;
        wd.field_d[64] = 1;
        wd.field_d[61] = 3;
        wd.field_d[58] = -2;
        if (param0 != -15) {
          field_G = (bd) null;
        }
        wd.field_d[70] = 0;
        wd.field_d[10] = -1;
        wd.field_d[9] = -1;
        wd.field_d[66] = 1;
        wd.field_d[62] = 5;
        wd.field_d[65] = 1;
        wd.field_d[57] = -2;
        wd.field_d[71] = 1;
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        int var11 = 0;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_11_0 = false;
        boolean stackIn_38_1 = false;
        boolean stackIn_39_2 = false;
        boolean stackIn_51_1 = false;
        boolean stackIn_60_1 = false;
        boolean stackIn_61_2 = false;
        boolean stackIn_70_0 = false;
        int stackIn_91_0 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_138_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        int var2;
        Object var3_ref;
        int var3;
        int var4;
        String[] var4_ref_String__;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var12;
        byte[] var13;
        hf var14;
        ii var15;
        Object var16;
        hq var16_ref;
        byte[] var17;
        byte[] var19;
        byte[] var22;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var7Lifetime2;
        int var4Lifetime1Lifetime1;
        int var4Lifetime1Lifetime2;
        int var4Lifetime1Lifetime3;
        int var4Lifetime1Lifetime4;
        int var4Lifetime1Lifetime5;
        int var9Lifetime1;
        var16 = null;
        var12 = field_H ? 1 : 0;
        ce.field_g = ql.g(13428);
        gf.a(-29949);
        if (ib.field_f != null &&
          ib.field_f.field_g) {
          ln.a(116);
          wi.b((byte) -53);
        }
        stackIn_5_1 = 0;
        stackIn_6_2 = (ib.field_f != null);
        this.a(stackIn_5_1, stackIn_6_2);
        pa.field_b = pa.field_b + 1;
        if (nn.field_i) {
          this.q(-18528);
          nn.field_i = false;
        }
        stackIn_11_0 = !param0;
        if (bd.a(stackIn_11_0)) {
          this.d((byte) 20);
          if (bd.a(true)) {
            if (re.a(122)) {
              discarded$0 = this.b(false, 4);
            }
            return;
          }
        }
        if (param0) {
          return;
        }
        if (h.field_R) {
          if (aj.b((byte) -70)) {
            if (!hf.b((byte) 100)) {
              if (pe.a(false)) {
                stackIn_51_1 = (ib.field_f != null);
                var2 = this.a(stackIn_51_1, (byte) 96);
                if (1 == var2 ||
                  var2 == 2) {
                  if (null != ib.field_f) {
                    ln.a(72);
                  }
                  if (2 == var2) {
                    d.a(0, ao.a(13867));
                  }
                }
                stackIn_60_1 = true;
                stackIn_61_2 = !(param0);
                this.a(stackIn_60_1, stackIn_61_2);
              } else {
                if (!fo.a((byte) 58)) {
                  this.a(false, true);
                } else {
                  if (ga.field_d == ga.field_a) {
                    var2 = lp.a(2);
                    if (var2 == 1) {
                      gi.a(te.field_Ib, kf.field_q, (byte) 78);
                    }
                    this.a(true, true);
                  } else {
                    this.a(false, true);
                  }
                }
              }
            } else {
              if (ga.field_d == ga.field_a) {
                var2 = rl.b((byte) 83);
                if (var2 == 2) {
                  ln.a(97);
                } else {
                  if (var2 == 3) {
                    wl.field_b = false;
                    var3_ref = qj.field_e;
                    u.a(((jl) (var3_ref)).field_z + ((jl) (var3_ref)).field_w, -879, ((jl) (var3_ref)).field_w, 2, 320, 8, ab.field_c, (jl) (var3_ref), 240, bi.field_g, 8, true);
                  } else {
                    if (var2 == 4) {
                      wl.field_b = true;
                      gi.a(ee.field_a, 0, (byte) 89);
                    }
                  }
                }
                stackIn_38_1 = true;
                stackIn_39_2 = !(param0);
                this.a(stackIn_38_1, stackIn_39_2);
              } else {
                this.a(false, true);
              }
            }
          } else {
            so.c(4478);
          }
        } else {
          a.a((byte) -108, lp.field_i);
          if (this.b(true, 4)) {
            h.field_R = true;
          }
        }
        if (!jg.a((byte) 70)) {
          while (true) {
            var14 = (hf) (nj.field_h.d(-28918));
            if (var14 == null) {
              break;
            }
            bh.a(109, var14, 4);
          }
        }
        var16_ref = (hq) (oc.field_H[13]);
        while (true) {
          stackIn_70_0 = !param0;
          if (!jf.a(stackIn_70_0, wd.field_d)) {
            vg.b(0, 10000);
            if (hb.field_kb) {
            }
            if (uh.a((byte) -59)) {
              var3 = this.j(1272);
              if (0 == var3 ||
                var3 == 1) {
                nn.a(true);
                if (var3 != 1) {
                  if (oc.field_G) {
                    og.field_l = true;
                    mi.field_o = true;
                    if (md.field_Y) {
                      ie.field_F = bb.field_a;
                      stackIn_177_0 = (gq.d(115)) ? 12 : 0;
                      la.a(stackIn_177_0, 11, false, -25528);
                    } else {
                      stackIn_173_0 = (gq.d(100)) ? 12 : 0;
                      la.a(stackIn_173_0, 0, false, -25528);
                    }
                    nm.a(0);
                    wo.b(109, fc.field_e).a(2, 0, false);
                    oc.field_G = false;
                    md.field_Y = false;
                    oa.field_i = false;
                  }
                  ia.field_d = false;
                  dj.field_c = false;
                } else {
                  ia.field_d = true;
                  dj.field_c = true;
                }
              }
              var4 = 0;
              if (var3 == 2) {
                var4 = 1;
              }
              if (oc.field_G ||
                dj.field_c ||
                ia.field_d) {
                var4 = 1;
              }
              if (!uh.a((byte) -59)) {
                var4 = 0;
              }
              if (var4 != 0) {
                to.g((byte) 103);
              }
            }
            return;
          }
          if (mn.field_e == 9) {
            nm.a(0);
            ti.field_t = 11;
            dj.field_c = false;
            ie.field_F = vi.field_o.h(5);
            continue;
          }
          if (mn.field_e == 14) {
            nm.a(0);
            ga.a(150, ne.a(-1879863704, 2000), 1024, 3, hp.j(0), fb.b((byte) 79), rg.field_d, ne.a(-1879863704, 8), cl.field_f.length, sl.a(1));
            fc.a(ba.a(-26573), 64, nc.b(119));
            ti.field_t = -2;
            oc.field_G = true;
            dj.field_c = false;
            continue;
          }
          if (mn.field_e == 15) {
            if (oc.field_G) {
              nm.a(0);
              ak.i(0);
              ek.a(true);
              og.field_l = true;
              ti.field_t = 0;
              oa.field_i = false;
              mi.field_o = true;
              md.field_Y = false;
              oc.field_G = false;
            }
            ia.field_d = false;
            dj.field_c = false;
            continue;
          }
          if (10 == mn.field_e &&
            oc.field_G) {
            pl.c(true);
            continue;
          }
          if (mn.field_e != 57 &&
            mn.field_e != 58) {
            if (mn.field_e == 59) {
              if (md.field_Y ||
                oa.field_i) {
                nm.a(0);
                if (md.field_Y) {
                  ro.field_e.a(false, 250, false);
                }
                og.field_l = true;
                dg.a(0, (byte) -117);
                md.field_Y = false;
                oa.field_i = false;
                ti.field_t = -2;
              }
              ia.field_d = false;
              continue;
            }
            var3_ref = null;
            if (md.field_Y) {
              var3_ref = ro.field_e;
            } else {
              if (oa.field_i) {
                var3_ref = qo.field_r;
              }
            }
            if (var3_ref != null) {
              if (mn.field_e == 61) {
                var4Lifetime1 = vi.field_o.c((byte) 13);
                var5 = var4Lifetime1 >> 8;
                var6 = (128 & var4Lifetime1) >> 7;
                var7 = 127 & var4Lifetime1;
                ((ii) (var3_ref)).a(var6, var7, var5, -62);
                continue;
              }
              if (mn.field_e == 69) {
                var4Lifetime1Lifetime1 = vi.field_o.a((byte) 41);
                var5Lifetime2 = vi.field_o.a((byte) 14);
                var6 = vi.field_o.a((byte) -117);
                var7Lifetime2 = vi.field_o.f(255);
                var8 = vi.field_o.f(255);
                var9 = vi.field_o.f(255);
                var19 = new byte[var9];
                var17 = var19;
                var13 = var17;
                var22 = var13;
                for (var11 = 0; var19.length > var11; var11++) {
                  var13[var11] = vi.field_o.a(0);
                }
                ((ii) (var3_ref)).a(var8, var6, var7Lifetime2, var4Lifetime1Lifetime1, (byte) 125, var5Lifetime2, var22);
                continue;
              }
              if (mn.field_e == 70) {
                ((ii) (var3_ref)).a(-102);
                continue;
              }
              if (62 == mn.field_e) {
                var4Lifetime1Lifetime2 = vi.field_o.a(0);
                var5Lifetime3 = vi.field_o.a((byte) -116);
                var6 = vi.field_o.a((byte) -121);
                ((ii) (var3_ref)).a(var5Lifetime3, var4Lifetime1Lifetime2, var6, false);
                continue;
              }
              if (mn.field_e == 64) {
                var4Lifetime1Lifetime3 = vi.field_o.f(255);
                var5Lifetime4 = var4Lifetime1Lifetime3 & ~((ii) (var3_ref)).field_a.field_k;
                ((ii) (var3_ref)).field_a.field_k = var4Lifetime1Lifetime3;
                if (var5Lifetime4 != 1 &&
                  2 != var5Lifetime4) {
                  continue;
                }
                stackIn_138_0 = (var5Lifetime4 == 1) ? 0 : 1;
                var6 = stackIn_138_0;
                var16_ref.a(sd.a(e.field_e, 76, new String[]{((ii) (var3_ref)).field_a.field_i[var6]}), (byte) -4);
                continue;
              }
              if (mn.field_e == 65) {
                ((ii) (var3_ref)).field_a.field_p = vi.field_o.f(255);
                if (null == ro.field_e) {
                  continue;
                }
                var16_ref.e(1);
                continue;
              }
              if (mn.field_e == 66) {
                var4Lifetime1Lifetime4 = vi.field_o.f(255);
                var5Lifetime5 = ~((ii) (var3_ref)).field_o & var4Lifetime1Lifetime4;
                ((ii) (var3_ref)).field_o = var4Lifetime1Lifetime4;
                if (ro.field_e == null) {
                  continue;
                }
                var16_ref.e(1);
                if (var5Lifetime5 != 1 &&
                  var5Lifetime5 != 2) {
                  continue;
                }
                stackIn_150_0 = (var5Lifetime5 != 1) ? 1 : 0;
                var6 = stackIn_150_0;
                var16_ref.a(sd.a(jg.field_M, 75, new String[]{((ii) (var3_ref)).field_a.field_i[var6]}), (byte) -4);
                continue;
              }
              if (71 == mn.field_e) {
                var4Lifetime1Lifetime5 = vi.field_o.f(255);
                if (ro.field_e == null) {
                  continue;
                }
                if (var4Lifetime1Lifetime5 == 0) {
                  ro.field_e.a(12, (byte) 58, 243);
                }
                if (1 != var4Lifetime1Lifetime5) {
                  continue;
                }
                ro.field_e.a(13, (byte) 58, 242);
                continue;
              }
            }
            this.h(-12);
            continue;
          }
          nm.a(0);
          stackIn_91_0 = (vi.field_o.f(255) == 0) ? 0 : 1;
          var3Lifetime1 = stackIn_91_0;
          var4_ref_String__ = new String[vi.field_o.f(255)];
          var5Lifetime1 = vi.field_o.a(0);
          if (var5Lifetime1 < 0) {
            var5Lifetime1 = -2;
          }
          for (var6 = 0; var6 < var4_ref_String__.length; var6++) {
            var4_ref_String__[var6] = vi.field_o.e(118);
          }
          var6 = vi.field_o.f(255);
          var7Lifetime1 = vi.field_o.f(255);
          var8Lifetime1 = vi.field_o.f(255);
          var9Lifetime1 = vi.field_o.k(0);
          wh.field_p = null;
          stackIn_100_0 = (mn.field_e == 58);
          oa.field_i = stackIn_100_0;
          bg.a(2);
          var15 = new ii(var4_ref_String__, var5Lifetime1, var3Lifetime1 != 0, var9Lifetime1, var6, var7Lifetime1, var8Lifetime1);
          var15.a((byte) 20, vi.field_o);
          if (1 == vi.field_o.f(255)) {
            var15.f(-57);
          }
          if (mn.field_e != 57) {
            ro.field_e = null;
            qo.field_r = var15;
            var16_ref.f(-120);
            var16_ref.a((String) null, (byte) -4);
          } else {
            qo.field_r = null;
            ro.field_e = var15;
            md.field_Y = true;
            var16_ref.e(1);
            var16_ref.a((String) null, (byte) -4);
          }
          ia.field_d = false;
          ti.field_t = -1;
        }
    }

    final void c(int param0) {
        Pixelate.p(param0 - 19640);
        ph.a(111);
        bb.a((byte) 76);
        ef.a(true);
        ck.a((byte) -109);
        de.d(-1);
        uk.b(false);
        ab.a(false);
        oo.a(true);
        vi.e(-97);
        ho.b(11799);
        jj.b(-4136);
        rp.a(-1);
        vf.a(-109);
        vd.a(70);
        qh.a(param0 - 22862);
        r.a(-31558);
        lb.c(true);
        qa.a(true);
        tn.b(true);
        ll.a((byte) -57);
        wb.a(-116);
        v.a(false);
        t.e();
        fm.a(-34);
        jl.a();
        wp.b(param0 - 23028);
        we.b((byte) 114);
        hm.b((byte) 9);
        he.a(0);
        la.b(param0 - 23114);
        pa.a(82);
        gb.a(false);
        nf.a((byte) -107);
        sf.a((byte) 61);
        th.a((byte) -96);
        dk.a((byte) -93);
        aa.a(-127);
        bl.b(-46342);
        nc.b(false);
        ha.a(true);
        re.a(true);
        mk.a((byte) -85);
        co.a(true);
        ii.b((byte) -101);
        dg.a(1048576);
        aq.a((byte) 119);
        rf.c((byte) -53);
        gm.a(-1);
        am.a((byte) -125);
        uo.b(127);
        mo.a((byte) -84);
        fa.d(-3);
        cf.a((byte) -114);
        lm.a(-2575);
        nk.a(true);
        dh.a(true);
        sc.a((byte) -108);
        lg.a((byte) -120);
        ea.a(true);
        rg.a(1762);
        pc.m(25208);
        lh.c(7);
        ti.h(-69);
        nl.b(-101);
        in.a(-69);
        sg.g();
        km.a((byte) 106);
        po.a((byte) 91);
        mm.d();
        nh.b((byte) 108);
        pf.b(65);
        tp.b(true);
        ed.a(75);
        e.a(200);
        sk.a((byte) 99);
        ak.a((byte) 59);
        eq.b((byte) 87);
        vg.a(true);
        uj.d(true);
        qj.a(false);
        kj.b(117);
        vh.b(-8);
        jp.b((byte) -63);
        rm.a((byte) -116);
        cn.a(-59);
        kn.m(param0 - 12614);
        dm.r(-103);
        ko.n(-100);
        on.g((byte) 106);
        vk.g((byte) 125);
        pl.e((byte) 64);
        jh.a((byte) -123);
        be.a(118);
        fh.f((byte) 123);
        tg.a(true);
        d.a(false);
        fg.a(9882);
        qd.b();
        nd.b(param0 - 23110);
        fi.a();
        jb.a((byte) 33);
        kh.a(21601);
        ig.a((byte) 2);
        dd.b(116);
        so.a(true);
        op.f((byte) 122);
        bg.b((byte) -101);
        ma.c((byte) -112);
        rb.b(true);
        fk.e(108);
        al.a((byte) 51);
        kk.b(true);
        pb.c(0);
        mj.a(param0 ^ 3805);
        kf.d(126);
        hd.a((byte) 125);
        ql.f(0);
        wc.b((byte) 34);
        da.b((byte) -13);
        se.f(21476);
        pe.a(7);
        an.b(-1);
        ek.a(14);
        di.a(false);
        ro.a(false);
        lo.j(58);
        gp.j(0);
        fb.j(118);
        vp.c((byte) 89);
        pi.b((byte) 122);
        pd.b((byte) -88);
        wi.c((byte) 121);
        oe.m(1);
        wo.a(true);
        ci.d(-12424);
        ep.b(param0 - 23120);
        pk.a(4194303);
        of.a((byte) 79);
        ej.a(-115);
        em.a(param0 ^ 23098);
        oh.a(false);
        bf.a((byte) -91);
        nn.c(param0 - 23119);
        pm.b(0);
        sl.a(false);
        bj.b((byte) 109);
        fc.a(32);
        hq.f((byte) -49);
        l.e(param0 - 20899);
        mp.a(true);
        uh.f(103);
        fe.a(param0 ^ -23078);
        hp.b((byte) -15);
        aj.a((byte) -38);
        lj.a(-1);
        to.f((byte) 23);
        dp.e(param0 ^ 23116);
        fq.f((byte) -123);
        wh.f((byte) 49);
        ol.c(false);
        ij.e(-124);
        wa.a(0);
        ra.a(false);
        ao.a(true);
        qi.b((byte) 106);
        dc.a(param0 ^ -23119);
        ta.a();
        lk.d(0);
        bm.d(0);
        wn.f(111);
        nj.b((byte) 97);
        rj.c((byte) -104);
        rn.a(512);
        cg.i(100);
        gg.e((byte) 45);
        fj.a((byte) 119);
        gn.b((byte) -106);
        qf.a(false);
        ic.e((byte) -63);
        uc.b(-120);
        ja.c();
        jk.a(20);
        rl.c((byte) -79);
        cl.a(938035464);
        bq.a((byte) 124);
        cd.a(false);
        oi.a(param0 ^ param0);
        hk.a(param0 - 23207);
        ri.b(10);
        ap.a(11924);
        gf.c(param0 - 31989);
        q.a();
        ai.a((byte) -92);
        fd.b(-24465);
        ok.a((byte) -118);
        jo.a((byte) -123);
        w.c(param0 - 23174);
        f.a(-26570);
        hg.a(94);
        kd.c(-127);
        ng.f(param0 - 23118);
        qm.j(89);
        ie.a(0);
        ka.l(127);
        ud.a(-43);
        ch.d((byte) -105);
        nm.a(false);
        ce.a(true);
        en.a();
        wf.a((byte) -66);
        qg.a((byte) 124);
        dn.a((byte) -41);
        ui.a(23652);
        te.j(1);
        il.b(param0 ^ -6504);
        u.a(param0 - 23002);
        qe.g(69);
        kp.d((byte) -58);
        le.a(1);
        eh.d(29731);
        uf.a((byte) 73);
        k.d(false);
        i.c(-56);
        vm.a(116);
        bo.a(true);
        pj.a(false);
        ul.c((byte) -69);
        jf.a(-31476);
        ee.d(-3);
        ca.b(64);
        td.a(param0 - 23112);
        qn.a(-1);
        sn.a(param0 ^ 23118);
        un.b((byte) -6);
        qc.a();
        qp.a((byte) -84);
        gk.f(false);
        c.o(12669);
        hb.f((byte) 82);
        oc.a((byte) -9);
        a.a(16);
        db.k(1861726552);
        vc.a((byte) -87);
        md.c(false);
        h.a(98);
        mg.d(101);
        ih.a(-1);
        hc.a((byte) 103);
        si.a((byte) 95);
        tm.e((byte) -89);
        od.j(15967);
        ve.b((byte) -70);
        ke.a(-19064);
        oj.n(-8012);
        oa.b(true);
        gj.f((byte) -28);
        jg.j(-87);
        no.f(0);
        bh.a((byte) 94);
        wd.a(1);
        bn.m(param0 ^ -23082);
        kl.b((byte) -105);
        pg.a(true);
        ah.g(-520925311);
        wm.a(false);
        tj.j(109);
        eg.g(-6835);
        p.a();
        na.a((byte) 4);
        kb.a((byte) 125);
        sh.a(true);
        nb.a(param0 ^ -23078);
        ue.a(30);
        rh.a((byte) 64);
        gi.a(-112);
        lc.a((byte) 90);
        cm.a(128);
        m.b((byte) -10);
        ad.c(param0 ^ -23054);
        ia.a(param0 ^ -23069);
        gh.c(-102);
        ip.e(8192);
        jc.a(14518);
        sd.a((byte) -120);
        im.j(param0 ^ -16156);
        gd.a(0);
        ff.a(-46);
        mc.a(-1);
        hf.a((byte) 22);
        um.a(-127);
        og.a(17);
        fl.a(0);
        bd.a(param0 - 23048);
        ug.e(param0 ^ 15191);
        io.a(105);
        go.a((byte) 124);
        gq.e(100);
        wk.c(-19101);
        ge.a(param0 - 23119);
        id.c(-118);
        vl.a(param0 ^ 23118);
        ln.a((byte) -113);
        ib.a(2);
        rk.a(10934);
        up.a((byte) 104);
        tk.a(7);
        qk.a(6);
        vn.a(false);
        jm.a(-1345);
        fo.b((byte) -89);
        ki.c(25335);
        jd.e(param0 ^ -9315);
        li.a((byte) 48);
        ba.c(3);
        wl.a(false);
        ji.a(-14186);
        ae.b((byte) 69);
        wg.a((byte) -27);
        jn.a(29353);
        lp.a((byte) -114);
        fp.a(param0 + 329385410);
        sm.a((byte) -115);
        df.a(3);
        lf.a(0);
        mn.b((byte) -26);
        bi.a(-8);
        rd.a(-5778);
        ec.e(0);
        g.e(-30055);
        bc.e(param0 ^ 23056);
        kc.f(16);
        ag.e(-1);
        qo.b(true);
        dq.a(-120);
        ni.a((byte) -13);
        dj.b(-125);
        hn.c((byte) -125);
        el.a(param0 ^ -13666);
        this.field_w = null;
    }

    final static void a(int param0, byte param1, df param2) {
        pc var5 = null;
        int var4 = 0;
        try {
          if (param1 <= 90) {
            field_E = (tf) null;
          }
          var5 = aa.field_f;
          var5.g(param0, 15514);
          var5.field_m = var5.field_m + 1;
          var4 = var5.field_m;
          var5.e(160, 1);
          var5.e(160, param2.field_p);
          var5.a(param2.field_k, -14596);
          var5.d(param2.field_l, -108);
          var5.d(param2.field_n, -43);
          var5.d(param2.field_o, -104);
          var5.d(param2.field_q, -106);
          var5.b(var4, (byte) 43);
          var5.f(-var4 + var5.field_m, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "Pixelate.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        kp.c((byte) -92);
        int var2 = -13 % ((-23 - param0) / 61);
        if (ib.field_f != null) {
          ln.a(121);
        }
        sn.a((byte) -91);
    }

    final static void a(boolean param0, byte param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        ak dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        gp stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        boolean stackIn_4_2 = false;
        eq stackIn_12_0;
        ak stackIn_12_1;
        ak stackIn_12_2;
        long stackIn_12_3;
        ak stackIn_13_1 = null;
        ak stackIn_13_2 = null;
        ak stackIn_13_4 = null;
        eq stackIn_30_0;
        ak stackIn_30_1;
        ak stackIn_30_2;
        long stackIn_30_3;
        ak stackIn_31_1;
        ak stackIn_31_2;
        ak stackIn_31_4;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        tf[] stackIn_80_0 = null;
        int stackIn_81_1 = 0;
        tf[] stackIn_88_0 = null;
        int stackIn_89_1 = 0;
        String stackIn_155_0 = null;
        String stackIn_165_0 = null;
        String stackIn_170_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        bb var8 = null;
        long var9 = 0L;
        Object var11 = null;
        eq var12 = null;
        int var13 = 0;
        int var14 = 0;
        ak var18 = null;
        ak var19 = null;
        ak var20 = null;
        ak var21 = null;
        ak var22 = null;
        ak var23 = null;
        ak var24 = null;
        ak var25 = null;
        ak var26 = null;
        ak var27 = null;
        ak var28 = null;
        ak var29 = null;
        ak var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        tf var42 = null;
        ak var43 = null;
        ak var44 = null;
        ak var45 = null;
        ak var46 = null;
        ak var47 = null;
        ak var48 = null;
        ak var49 = null;
        Object var50 = null;
        tf var50_ref = null;
        Object var51 = null;
        tf var51_ref = null;
        Object var52 = null;
        tf var52_ref = null;
        Object var53 = null;
        tf var53_ref = null;
        tf var54 = null;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = field_H ? 1 : 0;
        try {
          stackIn_3_0 = aj.field_k;
          stackIn_3_1 = param0;
          stackIn_4_2 = (aj.field_k == bj.field_d);
          var7_int = ((gp) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, 2, param2 * (fq.field_q * 4 + 8), 0, 2 * fq.field_q + 4) ? 1 : 0;
          if (param1 != 69) {
            return;
          }
          var8 = aj.field_k.field_Fb.field_L;
          var9 = hm.a(64);
          var11 = null;
          var12 = (eq) (var8.c(1504642273));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_L == null) {
              var14 = param4 | param6;
              var12.field_Nb = new ak(0L, of.field_i);
              var12.a(var12.field_Nb, (byte) 26);
              var12.field_Nb.field_Bb = 1;
              var12.field_qc = new ak(0L, ak.field_T);
              var12.a(var12.field_qc, (byte) 26);
              var12.field_Yb = new ak(0L, of.field_i);
              var12.a(var12.field_Yb, (byte) 26);
              var12.field_Yb.field_C = 0;
              var12.field_Sb = new ak(0L, of.field_i);
              var12.a(var12.field_Sb, (byte) 26);
              var12.field_Sb.field_C = 0;
              var12.field_gc = new ak(0L, ak.field_T);
              var12.a(var12.field_gc, (byte) 26);
              var12.field_gc.field_Bb = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (f.field_n) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = of.field_i;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = ak.field_T;
              }
              stackIn_12_0.field_Zb = new ak(stackIn_12_3, stackIn_13_4);
              var12.a(var12.field_Zb, (byte) 26);
              var12.field_ac = new ak[fj.field_b];
              var12.field_ic = new ak(0L, (ak) null);
              if ((var14 & 1 << ek.field_a) != 0) {
                var12.field_Zb.a(var12.field_ic, (byte) 26);
              }
              var12.field_Jb = new ak(0L, (ak) null);
              if ((var14 & 1 << ef.field_f) != 0) {
                var12.field_Zb.a(var12.field_Jb, (byte) 26);
              }
              var12.field_Fb = new ak(0L, (ak) null);
              if ((var14 & 1 << g.field_m) != 0) {
                var12.field_Zb.a(var12.field_Fb, (byte) 26);
              }
              var12.field_Vb = new ak(0L, (ak) null);
              if (0 != (1 << qa.field_e & var14)) {
                var12.field_Zb.a(var12.field_Vb, (byte) 26);
              }
              var45 = var12.field_ic;
              var44 = var12.field_Vb;
              var43 = var12.field_Jb;
              var12.field_Fb.field_kb = 1;
              var43.field_kb = 1;
              var44.field_kb = 1;
              var45.field_kb = 1;
              for (var18_int = 0; fj.field_b > var18_int; var18_int++) {
                var12.field_ac[var18_int] = new ak(0L, (ak) null);
                if (0 != (var14 & 1 << var18_int + cl.field_j)) {
                  var12.field_Zb.a(var12.field_ac[var18_int], (byte) 26);
                }
                var12.field_ac[var18_int].field_kb = 1;
              }
              stackIn_30_0 = var12;
              stackIn_30_1 = null;
              stackIn_30_2 = null;
              stackIn_30_3 = 0L;
              if (!f.field_n) {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = of.field_i;
              } else {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = ak.field_T;
              }
              stackIn_30_0.field_Gb = new ak(stackIn_30_3, stackIn_31_4);
              var12.a(var12.field_Gb, (byte) 26);
              var12.field_Gb.field_Bb = 2;
              var12.field_Kb = new ak(0L, ak.field_T);
              var12.a(var12.field_Kb, (byte) 26);
              var12.field_Wb = new ak(0L, dn.field_c);
              var12.a(var12.field_Wb, (byte) 26);
              var12.field_lc = new ak(0L, dn.field_c);
              var12.a(var12.field_lc, (byte) 26);
              var12.field_rc = new ak(0L, mg.field_h);
              var12.a(var12.field_rc, (byte) 26);
              var12.h(-257);
              var12.field_jc = new ak(0L, ul.field_p);
              var12.a(var12.field_jc, (byte) 26);
              var13 = 1;
            }
            var12.field_Nb.field_cb = null;
            stackIn_35_0 = (!var12.field_dc) ? param6 : param4;
            var14Lifetime1 = stackIn_35_0;
            var46 = var12.field_Nb;
            var12.field_Nb.field_nb = 0;
            var46.field_K = 0;
            var12.field_jc.field_cb = null;
            var47 = var12.field_jc;
            var12.field_jc.field_nb = 0;
            var47.field_K = 0;
            var12.field_qc.field_cb = null;
            var12.field_qc.field_nb = 0;
            var48 = var12.field_qc;
            var12.field_Yb.field_cb = null;
            var48.field_K = 0;
            var12.field_Yb.field_nb = 0;
            var18 = var12.field_Yb;
            var18.field_K = 0;
            var12.field_Sb.field_cb = null;
            var19 = var12.field_Sb;
            var12.field_Sb.field_nb = 0;
            var12.field_gc.field_cb = null;
            var19.field_K = 0;
            var20 = var12.field_gc;
            var12.field_gc.field_nb = 0;
            var12.field_Zb.field_cb = null;
            var20.field_K = 0;
            var21 = var12.field_Zb;
            var12.field_Zb.field_nb = 0;
            var21.field_K = 0;
            for (var22_int = 0; fj.field_b > var22_int; var22_int++) {
              var12.field_ac[var22_int].field_H = null;
              var23 = var12.field_ac[var22_int];
              var12.field_ac[var22_int].field_nb = 0;
              var23.field_K = 0;
            }
            var12.field_ic.field_H = null;
            var12.field_ic.field_nb = 0;
            var22 = var12.field_ic;
            var22.field_K = 0;
            var12.field_Vb.field_H = null;
            var12.field_Vb.field_nb = 0;
            var49 = var12.field_Vb;
            var49.field_K = 0;
            var12.field_Jb.field_H = null;
            var12.field_Jb.field_nb = 0;
            var24 = var12.field_Jb;
            var12.field_Fb.field_H = null;
            var24.field_K = 0;
            var25 = var12.field_Fb;
            var12.field_Fb.field_nb = 0;
            var25.field_K = 0;
            var12.field_Gb.field_cb = null;
            var26 = var12.field_Gb;
            var12.field_Gb.field_nb = 0;
            var12.field_Kb.field_cb = null;
            var26.field_K = 0;
            var12.field_Kb.field_nb = 0;
            var27 = var12.field_Kb;
            var27.field_K = 0;
            var12.field_Wb.field_cb = null;
            var12.field_Wb.field_nb = 0;
            var28 = var12.field_Wb;
            var28.field_K = 0;
            var12.field_lc.field_cb = null;
            var12.field_lc.field_nb = 0;
            var29 = var12.field_lc;
            var29.field_K = 0;
            var12.field_rc.field_cb = null;
            var30 = var12.field_rc;
            var12.field_rc.field_nb = 0;
            var30.field_K = 0;
            var12.field_K = aj.field_k.field_Fb.field_K;
            var31 = 0;
            var32 = var12.field_pc;
            if (!var12.j(param1 + 364)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_dc) {
                if (0 > var12.field_nc) {
                  if (var12.field_Mb && (var12.field_hc ||
                    var12.field_cc)) {
                    var12.field_jc.field_cb = h.field_S;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Tb == 2) {
                      var12.field_jc.field_cb = wd.field_g;
                    } else {
                      var12.field_Nb.field_cb = f.field_j;
                    }
                  }
                } else {
                  var12.field_Nb.field_cb = ap.field_g;
                }
              } else {
                if (!var12.field_hc &&
                  !var12.field_cc) {
                  if (!var12.field_Pb) {
                    var12.field_Nb.field_cb = wh.field_s;
                  } else {
                    var12.field_Nb.field_cb = ki.field_b;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_jc.field_cb = h.field_S;
                }
              }
              if (null != var12.field_jc.field_cb) {
                var12.field_jc.a(var31, fq.field_q, 0, 256, 68);
              } else {
                var12.field_Nb.a(var31, fq.field_q, 0, 256, 68);
              }
              var12.field_qc.field_cb = jl.a(var12.field_qc.field_Db, var32, 78);
              var12.field_qc.a(var31, fq.field_q, 70, 256, 78);
              if (var12.field_qc.field_W &&
                !var12.field_qc.field_cb.equals(var32)) {
                up.field_o = var32;
              }
              var12.field_Yb.field_cb = Integer.toString(var12.field_mc);
              if (var12.field_Mb) {
                var12.field_Sb.field_cb = "/" + var12.field_ec;
                var12.field_Yb.field_Bb = 2;
                var33_int = (348 - var12.field_Sb.field_Db.c("/")) / 2;
                var12.field_Yb.a(var31, fq.field_q, 150, 256, var33_int - 150);
                var12.field_Sb.a(var31, fq.field_q, var33_int, 256, 198 - var33_int);
              } else {
                var12.field_Yb.field_Bb = 1;
                var12.field_Yb.a(var31, fq.field_q, 150, 256, 48);
              }
              var12.field_gc.field_cb = Integer.toString(var12.field_bc);
              var12.field_gc.a(var31, fq.field_q, 200, 256, 48);
              stackIn_69_0 = (!f.field_n) ? 200 : 250;
              var33_intLifetime1 = stackIn_69_0;
              var12.field_Zb.a(var31, fq.field_q, var33_intLifetime1, param1 + 187, -2 + (-var33_intLifetime1 + 365));
              var34_int = hd.field_q;
              if ((1 << ek.field_a & var14Lifetime1) != 0) {
                var50_ref = bn.field_P[var12.field_Ib];
                var12.field_ic.field_H = var50_ref;
                var12.field_ic.a(0, var12.field_Zb.field_nb, var34_int, 256, var50_ref.field_A);
                var34_int = var34_int + (var50_ref.field_A + hd.field_q);
              }
              if ((var14Lifetime1 & 1 << ef.field_f) != 0) {
                if (!var12.field_hc) {
                  stackIn_78_0 = (var12.field_cc) ? 1 : 0;
                } else {
                  stackIn_78_0 = 1;
                }
                var36 = stackIn_78_0;
                stackIn_80_0 = go.field_h;
                if (var36 == 0) {
                  stackIn_81_1 = 0;
                } else {
                  stackIn_81_1 = 1;
                }
                var51_ref = stackIn_80_0[stackIn_81_1];
                var12.field_Jb.field_H = var51_ref;
                var12.field_Jb.a(0, var12.field_Zb.field_nb, var34_int, 256, var51_ref.field_A);
                var34_int = var34_int + (hd.field_q + var51_ref.field_A);
              }
              if ((1 << g.field_m & var14Lifetime1) != 0) {
                var52_ref = so.field_d[-1 + var12.field_Tb];
                var12.field_Fb.field_H = var52_ref;
                var12.field_Fb.a(0, var12.field_Zb.field_nb, var34_int, 256, var52_ref.field_A);
                var34_int = var34_int + (hd.field_q + var52_ref.field_A);
              }
              if ((var14Lifetime1 & 1 << qa.field_e) != 0) {
                stackIn_88_0 = fd.field_c;
                if (!var12.field_oc) {
                  stackIn_89_1 = 0;
                } else {
                  stackIn_89_1 = 1;
                }
                var53_ref = stackIn_88_0[stackIn_89_1];
                var12.field_Vb.field_H = var53_ref;
                var12.field_Vb.a(0, var12.field_Zb.field_nb, var34_int, 256, var53_ref.field_A);
                var34_int = var34_int + (hd.field_q + var53_ref.field_A);
              }
              if (ig.field_a != null) {
                for (var36Lifetime1 = 0; var36Lifetime1 < fj.field_b; var36Lifetime1++) {
                  if (ig.field_a[var36Lifetime1] != null &&
                    0 != (var14Lifetime1 & 1 << cl.field_j + var36Lifetime1)) {
                    var42 = ig.field_a[var36Lifetime1][255 & var12.field_Eb[var36Lifetime1]];
                    var54 = var42;
                    var12.field_ac[var36Lifetime1].field_H = var42;
                    var12.field_ac[var36Lifetime1].a(0, var12.field_Zb.field_nb, var34_int, 256, var54.field_A);
                    var34_int = var34_int + (hd.field_q + var54.field_A);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Zb.field_K) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_ic.field_D = var12.field_ic.field_D + var36Lifetime2;
                var12.field_Jb.field_D = var12.field_Jb.field_D + var36Lifetime2;
                var12.field_Fb.field_D = var12.field_Fb.field_D + var36Lifetime2;
                var12.field_Vb.field_D = var12.field_Vb.field_D + var36Lifetime2;
                for (var37_int = 0; var37_int < fj.field_b; var37_int++) {
                  dupTemp$0 = var12.field_ac[var37_int];
                  dupTemp$0.field_D = dupTemp$0.field_D + var36Lifetime2;
                }
              }
              if (var12.field_dc) {
                var37_intLifetime1 = var12.field_nc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Lb);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_Gb.field_cb = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Gb.field_cb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Gb.a(var31, fq.field_q, 365, 256, var12.field_K - 365);
              var31 = var31 + fq.field_q;
              if (var12.field_Ub != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(od.field_Fb);
                discarded$2 = var37.append(var12.field_Ub[0]);
                for (var38_intLifetime1 = 1; var12.field_mc > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Ub[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Kb.field_cb = var38;
                var39Lifetime1 = var12.field_Kb.field_Db.b(var38, var12.field_K - 2 * var12.field_Kb.field_C);
                var12.field_Kb.a(var31, fq.field_q * var39Lifetime1, 0, 256, var12.field_K);
                var31 = var31 + fq.field_q * var39Lifetime1;
              }
              if (var12.field_cc) {
                var12.field_Wb.field_cb = sd.a(ok.field_a, param1 - 22, new String[]{var32});
                var12.field_Wb.a(var31, fq.field_q, v.field_c, 256, -(2 * v.field_c) + var12.field_K);
                var31 = var31 + fq.field_q;
              }
              if (var12.field_Ob) {
                var12.field_lc.field_cb = sd.a(nl.field_h, param1 ^ 25, new String[]{var32});
                var12.field_lc.a(var31, fq.field_q, v.field_c, 256, var12.field_K - v.field_c * 2);
                var31 = var31 + fq.field_q;
              }
            }
            var33 = lg.a((byte) 121, var32, var12.field_Qb);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_rc.field_Db.b(var33, -v.field_c + var12.field_K - v.field_c);
              var12.field_rc.field_cb = var33;
              var12.field_rc.field_yb = var12.field_Rb * 256 / mh.field_b;
              var12.field_rc.a(var31, fq.field_q * var34_intLifetime1, v.field_c, 256, -(2 * v.field_c) + var12.field_K);
              var31 = var31 + var34_intLifetime1 * fq.field_q;
            }
            if (var7_int == 0) {
              var12.field_Z = -var12.field_nb + var31;
            }
            if (var13 != 0) {
              aj.field_k.field_Fb.a(var12, 2, param1 - 70, (ak) (var11));
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < fj.field_b; var34_intLifetime2++) {
              if (var12.field_ac[var34_intLifetime2].field_W) {
                if (null == dq.field_b) {
                  var35 = null;
                } else {
                  if (dq.field_b[var34_intLifetime2] != null) {
                    var35 = dq.field_b[var34_intLifetime2][255 & var12.field_Eb[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 != null) {
                  up.field_o = jk.field_e[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  up.field_o = jk.field_e[var34_intLifetime2];
                }
              }
            }
            if (var12.field_ic.field_W) {
              if (1 == var12.field_Ib) {
                var34 = ri.field_g;
              } else {
                var34 = rb.field_p[var12.field_Ib];
              }
              up.field_o = fh.field_R + " - " + var34;
            }
            if (var12.field_Vb.field_W) {
              if (!var12.field_oc) {
                stackIn_155_0 = w.field_t;
              } else {
                stackIn_155_0 = vn.field_d;
              }
              up.field_o = stackIn_155_0;
            }
            if (var12.field_Jb.field_W) {
              if (!var12.field_hc &&
                !var12.field_cc) {
                if (!var12.field_Mb) {
                  stackIn_165_0 = qa.field_b;
                } else {
                  stackIn_165_0 = he.field_e;
                }
              } else {
                stackIn_165_0 = bg.field_c;
              }
              up.field_o = stackIn_165_0;
            }
            if (var12.field_Fb.field_W) {
              if (var12.field_Tb != 2) {
                stackIn_170_0 = f.field_i;
              } else {
                stackIn_170_0 = nb.field_a;
              }
              up.field_o = stackIn_170_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_P != 0) {
              if (var12.j(433)) {
                var12 = (eq) (var8.f(1504642273));
                continue;
              }
              if (0 == var12.field_jc.field_P) {
                fb.a(param3, var32, var12, param1 + 32);
              } else {
                if (var12.field_dc && (!var12.field_Mb ||
                  !var12.field_hc &&
                  !var12.field_cc)) {
                  qj.a(false, var12.c((byte) 8), param5);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  wi.b(param5, -925, var12.c((byte) 8));
                }
              }
            }
            var12 = (eq) (var8.f(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "Pixelate.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public Pixelate() {
    }

    final void d(int param0) {
        int stackIn_12_0 = 0;
        boolean stackIn_51_0 = false;
        int var3;
        de var4;
        int var5;
        java.awt.Canvas var6;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var5 = field_H ? 1 : 0;
        var6 = oe.b((byte) -122);
        if (bd.a(true)) {
          uc.a(wp.a(-8798), -107, var6);
          return;
        }
        if (!h.field_R) {
          si.a(-1913, var6);
          return;
        }
        if (!aj.b((byte) -83)) {
          li.a(100.0f, -1, em.field_a);
          si.a(-1913, var6);
          return;
        }
        t.d();
        if (param0 < 91) {
          field_G = (bd) null;
        }
        if (ti.field_t == fc.field_e) {
          ie.a(true, 108, fc.field_e);
        } else {
          if (0 > ti.field_t) {
            stackIn_12_0 = fc.field_e;
          } else {
            stackIn_12_0 = ti.field_t;
          }
          var3 = stackIn_12_0;
          if (var3 < 0) {
            var3 = 14;
          }
          var4 = wo.b(-51, var3);
          if (ec.field_t >= 16) {
            ie.a(false, -93, ti.field_t);
            var4.a(-(ec.field_t << 4) + 512, true, true);
          } else {
            ie.a(false, 97, fc.field_e);
            var4.a(ec.field_t << 4, true, false);
          }
        }
        ho.a(ep.a(30022), 12402);
        if (fc.field_e == 4 ||
          ti.field_t == 4) {
          var3Lifetime1 = 192;
          if (ti.field_t != fc.field_e) {
            var3Lifetime1 = ec.field_t << 3;
            if (var3Lifetime1 > 192) {
              var3Lifetime1 = 192;
            }
            if (fc.field_e == 4) {
              var3Lifetime1 = 192 - var3Lifetime1;
            }
          }
          t.a(0, nf.field_f, 640, -nf.field_f + 480, 0, var3Lifetime1);
        }
        if (fc.field_e != ti.field_t &&
          -2 == ti.field_t) {
          var3Lifetime2 = -(ec.field_t << 4) + 256;
          if (var3Lifetime2 < 0) {
            var3Lifetime2 = 0;
          }
          in.field_B.a(0, 0, var3Lifetime2);
        } else if (ti.field_t != fc.field_e &&
          fc.field_e == -2) {
          var3Lifetime2 = ec.field_t << 4;
          if (var3Lifetime2 > 256) {
            var3Lifetime2 = 256;
          }
          in.field_B.a(0, 0, var3Lifetime2);
        } else {
          if (fc.field_e != -2) {
            in.field_B.b(0, 0);
          }
        }
        un.a((byte) 87);
        if (!hf.b((byte) 100)) {
          if (pe.a(false)) {
            if (ib.field_f == null) {
              stackIn_51_0 = ro.field_d;
            } else {
              stackIn_51_0 = true;
            }
            ko.a(stackIn_51_0, true);
          } else {
            if (fo.a((byte) 41)) {
              t.a(0, 0, t.field_j, t.field_d);
              dj.a(ab.field_c[0].field_F, ab.field_c[0].field_E, ab.field_c, -1501881951);
            }
          }
        } else {
          t.a(0, 0, t.field_j, t.field_d);
          ad.a(ab.field_c, ab.field_c[0].field_E, -96, ab.field_c[0].field_F);
        }
        if (ga.field_a != ga.field_d) {
          var3Lifetime3 = (hf.field_o << 8) / 16;
          t.a(0, 0, t.field_j, t.field_d, 0, var3Lifetime3);
        }
        fj.a(0, 0, (byte) -123, var6);
    }

    private final boolean b(boolean param0, int param1) {
        int var3_int = 0;
        int var8 = 0;
        int var9;
        tf var3;
        tf var4;
        tf var5;
        tf var6;
        tf[][] var7;
        var9 = field_H ? 1 : 0;
        ho.a(-29810);
        if (ji.field_b != null) {
          if (qn.field_l.b(-3) &&
            qn.field_l.a("basic", -1)) {
            if (qn.field_l.b(-3) &&
              qn.field_l.a("arial13", -1)) {
              if (dg.field_d.b(-3) &&
                dg.field_d.a("arial13", param1 ^ -5)) {
                if (qn.field_l.b(-3) &&
                  qn.field_l.a("lobby", -1)) {
                  if (dg.field_d.b(param1 ^ -7) &&
                    dg.field_d.a("lobby", -1)) {
                    if (ji.field_b.b(-3) &&
                      ji.field_b.a((byte) 92)) {
                      if (we.field_p.b(param1 ^ -7) &&
                        we.field_p.a((byte) 92)) {
                        if (ab.field_f.b(-3) &&
                          ab.field_f.a((byte) 92)) {
                          if (lj.field_c.b(-3) &&
                            lj.field_c.a((byte) 92)) {
                            if (pf.field_d.b(-3) &&
                              pf.field_d.a("basic", -1)) {
                              if (hd.field_c.b(param1 ^ -7) &&
                                hd.field_c.a("basic", -1)) {
                                if (eh.field_a.b(-3) &&
                                  eh.field_a.a((byte) 92)) {
                                  if (uk.field_u.b(-3) &&
                                    uk.field_u.a((byte) 92)) {
                                    li.a(85.0f, -1, rh.field_r);
                                    this.d(param1 + 106);
                                    if (!param0) {
                                      return false;
                                    }
                                    eh.c(5);
                                    rf.a(new po(ji.field_b, we.field_p), 5088, we.field_p);
                                    ji.field_b = null;
                                    sf.a(param1 - 4);
                                    return false;
                                  }
                                  li.a(80.0f, -1, dk.a(em.field_a, 0, jd.field_p, uk.field_u));
                                  return false;
                                }
                                li.a(75.0f, -1, mn.a(120, eh.field_a, em.field_a, "", jd.field_p));
                                return false;
                              }
                              li.a(75.0f, -1, mn.a(53, hd.field_c, pc.field_x, "basic", ha.field_f));
                              return false;
                            }
                            li.a(75.0f, -1, mn.a(param1 + 113, pf.field_d, g.field_q, "basic", im.field_Mb));
                            return false;
                          }
                          li.a(60.0f, -1, mn.a(61, lj.field_c, jh.field_I, "", fq.field_p));
                          return false;
                        }
                        li.a(45.0f, -1, lj.a(ab.field_f, fq.field_p, jh.field_I, -22165, 0));
                        return false;
                      }
                      li.a(40.0f, -1, mn.a(83, we.field_p, bm.field_n, "", l.field_u));
                      return false;
                    }
                    li.a(20.0f, -1, mn.a(125, ji.field_b, bm.field_n, "", l.field_u));
                    return false;
                  }
                  li.a(17.0f, -1, mn.a(107, dg.field_d, pc.field_x, "lobby", ha.field_f));
                  return false;
                }
                li.a(13.0f, -1, mn.a(56, qn.field_l, g.field_q, "lobby", im.field_Mb));
                return false;
              }
              li.a(12.0f, -1, mn.a(57, dg.field_d, pc.field_x, "arial13", ha.field_f));
              return false;
            }
            li.a(11.0f, param1 ^ -5, mn.a(78, qn.field_l, g.field_q, "arial13", im.field_Mb));
            return false;
          }
          li.a(10.0f, param1 - 5, mn.a(62, qn.field_l, g.field_q, "basic", im.field_Mb));
          return false;
        }
        if (we.field_p != null) {
          li.a(90.0f, -1, rh.field_r);
          this.d(param1 + 94);
          we.field_p = null;
          sf.a(0);
          return false;
        }
        if (lj.field_c != null) {
          li.a(92.0f, param1 ^ -5, "Unpacking music");
          this.d(117);
          lg.a(param1 - 1, lj.field_c);
          lj.field_c = null;
        }
        if (ab.field_f != null) {
          li.a(94.0f, param1 - 5, ff.field_f);
          this.d(118);
          for (var3_int = 0; var3_int < 18; var3_int++) {
            if (bj.field_c[var3_int] != null &&
              !ri.field_a.field_x.a(bj.field_c[var3_int], po.field_d, ab.field_f, 109, 176400)) {
              sf.a(0);
              return false;
            }
          }
          ri.field_a.field_x.e(-38);
          ri.field_a.field_H.e(-38);
          ab.field_f = null;
          po.field_d = null;
          sf.a(0);
          return false;
        }
        if (null == hd.field_c) {
          if (eh.field_a != null) {
            re.a(true, new oh(eh.field_a.a((byte) 24, "huffman", "")));
            eh.field_a = null;
            sf.a(param1 - 4);
            return false;
          }
          gn.a((byte) 112);
          rj.i(7902);
          wo.a(3);
          id.b(param1 - 2);
          nd.a(3);
          if (param1 != 4) {
            this.b(-87);
          }
          nd.b((byte) 37);
          ti.field_t = 0;
          fc.field_e = 14;
          wo.a(50, -37);
          jg.a(256, -113);
          dg.a(0, (byte) -90);
          sf.a(0);
          return true;
        }
        li.a(96.0f, -1, no.field_g);
        this.d(param1 ^ 123);
        rk.field_e = vn.a(pf.field_d, "basic", "font", hd.field_c, 22510);
        qj.field_e = bf.a(param1 ^ 4, dg.field_d, "", qn.field_l, "arial13");
        nh.a((byte) 117);
        bm.field_u = bi.a("basic", "background", pf.field_d, (byte) -36);
        pm.a(13728, 0, lb.a(pf.field_d, 23, "basic", "level1"));
        pm.a(13728, 1, lb.a(pf.field_d, -128, "basic", "level2"));
        pm.a(13728, 2, lb.a(pf.field_d, -4, "basic", "level3"));
        pm.a(13728, 3, lb.a(pf.field_d, 41, "basic", "level4"));
        pm.a(13728, 4, lb.a(pf.field_d, -114, "basic", "level5"));
        pm.a(13728, 5, lb.a(pf.field_d, 66, "basic", "level6"));
        pm.a(param1 + 13724, 6, lb.a(pf.field_d, param1 ^ 122, "basic", "level7"));
        pm.a(13728, 7, lb.a(pf.field_d, 0, "basic", "level8"));
        pm.a(13728, 8, lb.a(pf.field_d, 59, "basic", "level9"));
        pm.a(13728, 9, lb.a(pf.field_d, -121, "basic", "level10"));
        al.field_c[3][4] = lb.a(pf.field_d, -106, "basic", "set34");
        al.field_c[4][3] = lb.a(pf.field_d, param1 + 28, "basic", "set43");
        al.field_c[3][5] = lb.a(pf.field_d, 125, "basic", "set35");
        al.field_c[5][3] = lb.a(pf.field_d, 80, "basic", "set53");
        al.field_c[4][4] = lb.a(pf.field_d, 47, "basic", "set44");
        al.field_c[5][4] = lb.a(pf.field_d, 77, "basic", "set54");
        al.field_c[4][5] = lb.a(pf.field_d, -105, "basic", "set45");
        al.field_c[5][5] = lb.a(pf.field_d, -111, "basic", "set55");
        td.a(127, lb.a(pf.field_d, 44, "basic", "puzzle"));
        lg.field_d[0] = bi.a("basic", "icon_singleplayer", pf.field_d, (byte) -45);
        lg.field_d[1] = bi.a("basic", "icon_puzzle", pf.field_d, (byte) -73);
        var3 = bi.a("basic", "locked", qn.field_l, (byte) -124);
        sn.field_m = bi.a("basic", "icon_menu", pf.field_d, (byte) -105);
        gj.field_W = eh.a("titles", "basic", (byte) 47, pf.field_d);
        ih.field_a = eh.a("tick", "basic", (byte) 47, pf.field_d);
        hp.field_Gb = bi.a("basic", "timer", pf.field_d, (byte) -86);
        ll.field_m = eh.a("marker", "basic", (byte) 47, pf.field_d);
        bf.a(5, "basic", "frame");
        ab.field_c = bf.a(param1 + 1, "basic", "frame_filled");
        bi.field_g = bf.a(5, "basic", "frame_raised");
        in.field_B = bi.a("basic", "gameframe", pf.field_d, (byte) -25);
        hd.field_w = var3;
        gd.field_i = var3;
        qo.field_v = bi.a("basic", "instructions6", pf.field_d, (byte) -121);
        pk.field_c = eh.a("instructions_keys", "basic", (byte) 47, pf.field_d);
        no.field_p = eh.a("instructions_keys2", "basic", (byte) 47, pf.field_d);
        jk.field_a = bi.a("basic", "background_rushes", pf.field_d, (byte) -58);
        ad.field_w = bi.a("basic", "background_retro", pf.field_d, (byte) -78);
        vk.field_tb = eh.a("sprites_retro", "basic", (byte) 47, pf.field_d);
        jg.field_H = bi.a("basic", "background_bouncedown", pf.field_d, (byte) -117);
        hn.field_b = bi.a("basic", "sprites_bouncedown", pf.field_d, (byte) -125);
        eh.field_c = eh.a("cloud", "basic", (byte) 47, pf.field_d);
        nm.field_f = bi.a("basic", "kite", pf.field_d, (byte) -77);
        hb.field_hb = bi.a("basic", "bow", pf.field_d, (byte) -30);
        jo.field_j = bi.a("basic", "lobby_logo", pf.field_d, (byte) -62);
        em.a(eh.a("scrollbutton", "basic", (byte) 47, pf.field_d), -77);
        var4 = bi.a("basic", "background_fireworks", pf.field_d, (byte) -38);
        var5 = bi.a("basic", "sprite_fireworks", pf.field_d, (byte) -95);
        md.a(var4, var5, 80);
        nb.a(0, eh.a("tiles0", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(1, eh.a("tiles1", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(2, eh.a("tiles2", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(3, eh.a("tiles3", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(4, eh.a("tiles4", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(5, eh.a("tiles5", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(6, eh.a("tiles6", "basic", (byte) 47, pf.field_d), (byte) -53);
        nb.a(7, eh.a("tiles7", "basic", (byte) 47, pf.field_d), (byte) -53);
        oo.field_c = new tf[22];
        oo.field_c[0] = bi.a("basic", "achievement0", pf.field_d, (byte) -75);
        oo.field_c[1] = bi.a("basic", "achievement1", pf.field_d, (byte) -57);
        oo.field_c[2] = bi.a("basic", "achievement2", pf.field_d, (byte) -34);
        oo.field_c[3] = bi.a("basic", "achievement3", pf.field_d, (byte) -125);
        oo.field_c[4] = bi.a("basic", "achievement4", pf.field_d, (byte) -34);
        oo.field_c[5] = bi.a("basic", "achievement5", pf.field_d, (byte) -37);
        oo.field_c[6] = bi.a("basic", "achievement6", pf.field_d, (byte) -93);
        oo.field_c[7] = bi.a("basic", "achievement7", pf.field_d, (byte) -88);
        oo.field_c[8] = bi.a("basic", "achievement8", pf.field_d, (byte) -76);
        oo.field_c[9] = bi.a("basic", "achievement9", pf.field_d, (byte) -105);
        oo.field_c[10] = bi.a("basic", "achievement10", pf.field_d, (byte) -62);
        oo.field_c[11] = bi.a("basic", "achievement11", pf.field_d, (byte) -82);
        oo.field_c[12] = bi.a("basic", "achievement12", pf.field_d, (byte) -81);
        oo.field_c[13] = bi.a("basic", "achievement13", pf.field_d, (byte) -100);
        oo.field_c[14] = bi.a("basic", "achievement14", pf.field_d, (byte) -102);
        oo.field_c[15] = bi.a("basic", "achievement15", pf.field_d, (byte) -81);
        oo.field_c[16] = bi.a("basic", "achievement16", pf.field_d, (byte) -41);
        oo.field_c[17] = bi.a("basic", "achievement17", pf.field_d, (byte) -89);
        oo.field_c[18] = bi.a("basic", "achievement18", pf.field_d, (byte) -106);
        oo.field_c[19] = bi.a("basic", "achievement19", pf.field_d, (byte) -40);
        oo.field_c[20] = bi.a("basic", "achievement20", pf.field_d, (byte) -92);
        oo.field_c[21] = bi.a("basic", "achievement21", pf.field_d, (byte) -39);
        pj.field_a = bi.a("basic", "unachieved", qn.field_l, (byte) -86);
        var6 = bi.a("basic", "orbcoin", qn.field_l, (byte) -32);
        rp.a((byte) -59, pj.field_a);
        rp.a((byte) -59, var6);
        vn.field_c = new tf(16, 16);
        vn.field_c.c();
        var6.a(0, 0, 16, 16);
        ha.field_b = new tf(22, 48);
        de.field_c = new tf(22, 48);
        ha.field_b.c();
        t.d(-22, 0, 42, 48, 20, 65793);
        de.field_c.c();
        ha.field_b.a(0, 0);
        qa.field_f.a(19692);
        var7 = new tf[fo.field_u.length][];
        for (var8 = 0; fo.field_u.length > var8; var8++) {
          if (null != fo.field_u[var8]) {
            var7[var8] = eh.a(fo.field_u[var8], "basic", (byte) 47, pf.field_d);
          }
        }
        gg.a(true, lp.field_c, rg.field_d, qn.field_l, hp.field_Hb, la.field_c, var7, 2, 2, var7, uk.field_u, param1 + 29, ap.field_d, dg.field_d, cl.field_f);
        fe.field_a = false;
        ri.a(200, (byte) -126);
        am.a(qn.field_l, true, dg.field_d);
        eg.a((byte) -94, 0, 0, 16777215, (java.applet.Applet) (this), ic.field_bb);
        hd.field_c = null;
        dg.field_d = null;
        sf.a(0);
        return false;
    }

    public final void init() {
        this.a("Pixelate", 640, 13);
    }

    private final void q(int param0) {
        if (null != lf.field_f) {
          be.a(79, lf.field_f);
          lf.field_f = null;
          sf.a(0);
        }
        if (param0 != -18528) {
          Pixelate.a(false, (byte) -93, -109, true, 5, -125, 20);
        }
        eh.field_a = wb.a(3, (byte) 124);
        pf.field_d = wb.a(5, (byte) 124);
        hd.field_c = wb.a(6, (byte) 124);
        ji.field_b = wb.a(7, (byte) 124);
        we.field_p = wb.a(8, (byte) 124);
        ab.field_f = wb.a(9, (byte) 124);
        lj.field_c = wb.a(10, (byte) 124);
        uk.field_u = wb.a(11, (byte) 124);
        ho.a(-29810);
    }

    private final void a(boolean param0, boolean param1) {
        boolean discarded$0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_61_0 = false;
        int stackIn_79_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_100_0 = 0;
        int var3;
        tc var3_ref_tc;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var3Lifetime1;
        var8 = field_H ? 1 : 0;
        if (ga.field_d != ga.field_a) {
          if (ga.field_a == ho.field_e) {
            hf.field_o = hf.field_o + 1;
            if (16 == hf.field_o) {
              if (wl.field_b) {
                d.a(-17540);
              } else {
                tm.a(-20822);
              }
              ga.field_a = kk.field_y;
            }
          } else {
            if (kk.field_y != ga.field_a) {
              hf.field_o = hf.field_o - 1;
              if (hf.field_o == 0) {
                ga.field_a = ga.field_d;
              }
            } else {
              if (!jg.a((byte) 121)) {
                if (null != wh.field_p) {
                  md.a(wh.field_p, true, 3);
                }
                un.a(true);
                var3 = kf.field_q;
                stackIn_79_0 = (gq.d(74)) ? 12 : 0;
                la.a(stackIn_79_0, var3, true, -25528);
                if (wl.field_b) {
                  wl.field_b = false;
                  var3_ref_tc = qj.field_e;
                  u.a(((jl) ((Object) var3_ref_tc)).field_z + ((jl) ((Object) var3_ref_tc)).field_w, -879, ((jl) ((Object) var3_ref_tc)).field_w, 2, 320, 8, ab.field_c, var3_ref_tc, 240, bi.field_g, 8, false);
                }
                if (tk.a((byte) -104, ti.field_t)) {
                  nm.a(0);
                }
                ga.field_a = qo.field_A;
              } else {
                ga.field_a = qo.field_A;
              }
            }
          }
        } else {
          var3 = 0;
          var4 = 0;
          mi.e(-124);
          if (!param0) {
            if (fc.field_e == ti.field_t) {
              if (fc.field_e == -1) {
                if (!oc.field_G) {
                  while (bh.$cfr$intArgs$b$c4997cb15529(123)) {
                    if (bc.field_m[82] &&
                      ke.field_a == 11) {
                      stackIn_24_0 = !(pm.field_u);
                      pm.field_u = stackIn_24_0;
                    }
                    ro.field_e.a(ke.field_a, (byte) -79);
                  }
                  ro.field_e.a(-110, true);
                } else {
                  var4 = 1;
                  var3 = 1;
                }
              } else {
                if (fc.field_e != -2) {
                  if (tk.a((byte) -104, fc.field_e)) {
                    wo.b(-79, fc.field_e).e((byte) -83);
                    f.b(0);
                  }
                } else {
                  var3 = 1;
                  f.b(0);
                }
              }
            } else {
              ec.field_t = ec.field_t + 1;
              if (ec.field_t == 32) {
                nm.a(0);
              }
              f.b(0);
              if ((ti.field_t == -1 ||
                fc.field_e == -1) && null != rg.field_e) {
                rg.field_e.c(-1);
              }
            }
          }
          if (oc.field_G &&
            !dj.field_c &&
            !ia.field_d) {
            bl.a(-55, var3 != 0);
            if (hd.field_g) {
              ii.a(true, 1, fc.field_e, (byte) -68, ee.field_a);
              hd.field_g = false;
            }
            if (oa.field_i) {
              qo.field_r.a(-110, var4 != 0);
            }
            if (md.field_Y) {
              ro.field_e.a(-110, var4 != 0);
            }
            while (bh.$cfr$intArgs$b$c4997cb15529(122)) {
              if (hb.field_kb &&
                qp.a(true, 13, 15, 12)) {
                continue;
              }
              if (oa.field_i) {
                qo.field_r.a(ke.field_a, (byte) -35);
              }
              if (!md.field_Y) {
                continue;
              }
              ro.field_e.a(ke.field_a, (byte) 116);
            }
          }
          if (!oc.field_G) {
            ng.a(false);
          }
          boolean decompiledFrameRemainder0 = true;
          if (ti.field_t != -2 &&
            ti.field_t != -5 &&
            ti.field_t != -4 && (ti.field_t != -1 ||
            !oa.field_i) && 4 != ti.field_t) {
            stackIn_61_0 = false;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_61_0 = true;
          }
          hb.field_kb = stackIn_61_0;
          if (!hb.field_kb) {
            if (0 >= ve.field_Kb) {
              var5 = qh.field_c * qh.field_c;
              var6 = -(ve.field_Kb * ve.field_Kb) + var5;
              var7 = nf.field_f + var6 * 120 / var5;
              qf.a(21983, var7);
            } else {
              ve.field_Kb = ve.field_Kb - 1;
              var5 = qh.field_c * qh.field_c;
              var6 = -(ve.field_Kb * ve.field_Kb) + var5;
              var7 = nf.field_f + var6 * 120 / var5;
              qf.a(21983, var7);
            }
          } else {
            if (ve.field_Kb < qh.field_c) {
              ve.field_Kb = ve.field_Kb + 1;
            }
            var5 = qh.field_c * qh.field_c;
            var6 = -(ve.field_Kb * ve.field_Kb) + var5;
            var7 = nf.field_f + var6 * 120 / var5;
            qf.a(21983, var7);
          }
        }
        if (ti.field_t == -3) {
          wh.field_p = null;
          ro.field_e = new ii();
          stackIn_97_0 = (!de.field_f) ? 0 : 1;
          var3Lifetime1 = stackIn_97_0;
          stackIn_100_0 = (gq.d(108)) ? 12 : 0;
          la.a(stackIn_100_0, -1, var3Lifetime1 != 0, -25528);
        }
        if (ti.field_t == -4) {
          aa.field_f.g(9, 15514);
          dj.field_c = true;
          ti.field_t = fc.field_e;
          ve.field_Kb = qh.field_c;
        }
        if (!param1) {
          discarded$0 = this.b(false, 93);
        }
        if (ti.field_t == -5) {
          qg.a(io.field_c.c((byte) 8), 11, false);
          ia.field_d = true;
          ti.field_t = fc.field_e;
        }
    }

    public static void p(int param0) {
        if (param0 != 3478) {
          return;
        }
        field_E = null;
        field_G = null;
    }

    final static int a(CharSequence param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = tj.a(param2, param0, true, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -73;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("Pixelate.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_G = new bd();
    }
}
