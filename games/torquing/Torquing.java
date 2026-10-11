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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          try {
            var3_int = param2.a((byte) -114);
            if (var3_int > param1) {
              var3_int = param1;
            }
            if (param0 != 26657) {
              Torquing.a(9, false);
            }
            var4 = new byte[var3_int];
            param2.field_n = param2.field_n + lh.field_u.a(var4, true, param2.field_n, param2.field_j, 0, var3_int);
            var5 = hk.a(var3_int, true, 0, var4);
            stackIn_5_0 = var5;
            return stackIn_5_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = "Cabbage";
            return stackIn_7_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("Torquing.OA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        fj var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_u;
        try {
          if (param0 >= -33) {
            var4 = (fj) null;
            Torquing.a(-55, 127, (fj) null);
          }
          if (wp.field_w > 0) {
            if (ki.field_D == null) {
              dg.field_i = je.a(640, 480, nk.field_u, 0, 0, -62);
            } else {
              dg.field_i = ki.field_D.b((byte) -73);
              vp.b(2, -111);
            }
            if (dg.field_i != null) {
              j.a(dg.field_i, (byte) 63);
              var2_int = 2;
            } else {
              var2_int = 3;
            }
          } else {
            var2_int = (!je.a((byte) 70)) ? 1 : 0;
          }
          if (null == ki.field_D) {
            if (!tm.field_a) {
              return;
            }
            ka.a(var2_int, param1, (byte) -98);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.MA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        try {
          Torquing.p(29165);
          be.b();
          tj.a(-36);
          ei.d(79);
          cl.a(-11784);
          ol.a((byte) -51);
          ml.a(-51);
          ke.a(-18242);
          vi.a();
          ua.a(param0 - 10);
          jk.a(param0 - 4);
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
          ha.a(param0 - 132);
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
          no.b(param0 - 4);
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
          ji.a(param0 - 101);
          wk.a((byte) -98);
          cf.b(1);
          un.b(-13524);
          wd.b(0);
          ma.a();
          ho.b();
          uo.a();
          lh.b(param0 - 128);
          pn.a(92);
          hf.a(param0 ^ 8);
          gb.d(-89);
          am.c((byte) -123);
          gn.a((byte) 126);
          fh.d(param0 - 1);
          ac.c(param0 ^ 4);
          pb.a(false);
          lb.c(0);
          gl.c(-96);
          ue.a(param0 - 82);
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
          dp.b(param0 - 110);
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
          ef.a(param0 - 1);
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
          gf.d(param0 - 4);
          bf.a(3);
          va.a(true);
          om.a(param0 - 4);
          tp.b(121);
          ro.g((byte) 123);
          od.b(11860);
          jf.a(37);
          lo.a();
          u.g((byte) -47);
          po.g((byte) 0);
          wn.b(param0 - 4);
          so.g((byte) 126);
          qn.a(false);
          te.b(param0 - 445141588);
          ee.g((byte) -62);
          kc.b(param0 ^ param0);
          hm.b(12);
          lk.b(0);
          sd.g((byte) 115);
          b.c(param0 + 16056);
          eg.b(param0 - 128);
          qg.c(-1172010644);
          bd.a(false);
          mo.g((byte) -16);
          lc.a(false);
          mi.g((byte) -39);
          go.c(param0 ^ 58);
          ql.b(16711935);
          ea.a(true);
          pl.c(param0 ^ -69);
          cq.b(param0 - 1339901240);
          jg.g((byte) 106);
          wp.a(true);
          rg.b(param0 + 31631);
          s.g((byte) -73);
          mf.g((byte) 21);
          hb.b(-799778388);
          nl.d(param0 - 132);
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
          ah.b(param0 - 3);
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
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.AA(" + param0 + ')');
        }
    }

    public Torquing() {
    }

    private final void c(boolean param0) {
        int var3 = 0;
        qp var4 = null;
        qk var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_u;
        try {
          if (!param0) {
            return;
          }
          var4 = (qp) (jh.field_y.b(0));
          while (var4 != null) {
            wc.a(var4, (byte) 99, 4);
            var4 = (qp) (jh.field_y.f(-24059));
          }
          var5 = (qk) (bo.field_l.b(0));
          while (var5 != null) {
            le.a((byte) 126, 5, var5);
            var5 = (qk) (bo.field_l.f(-24059));
          }
          kg.field_c = ip.a(4, -127);
          kb.field_f = tl.a(5, 0, 1, 0);
          if (wp.field_w > 0) {
            ee.field_s = false;
            lp.field_f = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.BB(" + param0 + ')');
        }
    }

    final void c(int param0) {
        uh var2 = null;
        uh var3 = null;
        try {
          this.a(11, 11, false, param0 + 477, 9, 15, 10, 0);
          pi.a(22050, true, 10);
          qd.field_b = pi.a(nk.field_u, (java.awt.Component) ((Object) k.field_d), 0, 22050);
          la.field_c = pi.a(nk.field_u, (java.awt.Component) ((Object) k.field_d), 1, 1024);
          var2 = new uh();
          la.field_c.a(var2);
          var3 = new uh();
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
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.DA(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        try {
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
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.PA(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean b(boolean param0, byte param1) {
        t dupTemp$0 = null;
        int var19_int = 0;
        int var20 = 0;
        int var18 = 0;
        StringBuilder discarded$2 = null;
        int incrementValue$1 = 0;
        StringBuilder discarded$4 = null;
        int incrementValue$3 = 0;
        int incrementValue$5 = 0;
        RuntimeException decompiledCaughtException = null;
        short[] var3 = null;
        int var3_int = 0;
        int[] var3_array = null;
        RuntimeException var3_ref = null;
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
        af var13 = null;
        int var13_int = 0;
        StringBuilder var13_ref = null;
        int var14_int = 0;
        hc var14 = null;
        sm var15_ref_sm = null;
        int var15 = 0;
        ia var16_ref_ia = null;
        t var16_ref_t = null;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        fj var28 = null;
        int[] var30 = null;
        rm var31 = null;
        short[] var32 = null;
        t var33 = null;
        t var34 = null;
        sm[] var35 = null;
        sm var36 = null;
        t var37 = null;
        t var38 = null;
        t[] var40 = null;
        t var41 = null;
        sm[] var42 = null;
        sm var43 = null;
        sm var44 = null;
        sm var45 = null;
        t var46 = null;
        int[] var47 = null;
        t[] var48 = null;
        t var49 = null;
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
        int[] var67 = null;
        int[] var68 = null;
        short[] var3Lifetime1;
        hc var4_refLifetime1;
        int var4_intLifetime1;
        int var4_intLifetime2;
        int var5Lifetime1;
        int var7Lifetime1;
        int var11_intLifetime1;
        int var12_intLifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var3_intLifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var10Lifetime2;
        int var10Lifetime3;
        int var11_intLifetime1Lifetime1;
        int var15Lifetime1Lifetime1;
        int var9Lifetime1Lifetime1;
        int var9Lifetime1Lifetime2;
        var27 = field_u;
        try {
          nn.a(-98);
          if (rl.field_a != null) {
            if (tp.field_a == null) {
              if (rp.field_d.a(-12749) &&
                rp.field_d.a(true, "basic")) {
                if (!rp.field_d.a(true, "benefits")) {
                  df.a(1.0f, -93, c.a(param1 ^ -117, bo.field_i, "basic", db.field_d, rp.field_d));
                  return false;
                }
                if (!rp.field_d.a(true, "kartika13")) {
                  df.a(2.0f, 117, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                  return false;
                }
                if (e.field_b.a(-12749) &&
                  e.field_b.a(true, "kartika13")) {
                  if (rl.field_a.a(param1 - 12647) &&
                    rl.field_a.c(-19375)) {
                    if (rg.field_v.a(-12749) &&
                      rg.field_v.c(-19375)) {
                      if (uf.field_l.a(-12749) &&
                        uf.field_l.c(-19375)) {
                        if (vp.field_D.a(-12749) &&
                          vp.field_D.c(-19375)) {
                          if (n.field_q.a(-12749) &&
                            n.field_q.c(-19375)) {
                            if (bp.field_c.a(-12749) &&
                              bp.field_c.c(param1 ^ 19403)) {
                              if (vd.field_e.a(-12749) &&
                                vd.field_e.c(param1 - 19273)) {
                                if (th.field_C.a(-12749) &&
                                  th.field_C.c(param1 ^ 19403)) {
                                  if (he.field_b.a(-12749) &&
                                    he.field_b.c(-19375)) {
                                    if (wp.field_w > 0 && (!eg.field_t.a(-12749) ||
                                      !eg.field_t.c(param1 - 19273))) {
                                      df.a(29.0f, -63, c.a(17, pa.field_a, "", pd.field_a, eg.field_t));
                                      return false;
                                    }
                                    pm.a((byte) 80);
                                    df.a(30.0f, param1 + 116, jn.field_d);
                                    this.b((byte) 73);
                                    if (!param0) {
                                      return false;
                                    }
                                    tp.field_a = je.a(rl.field_a, "", "sphere", (byte) -124);
                                    cf.a(param1 ^ -6539);
                                    return false;
                                  }
                                  df.a(28.0f, 101, c.a(17, pa.field_a, "", pd.field_a, he.field_b));
                                  return false;
                                }
                                df.a(27.0f, -72, c.a(17, tf.field_a, "", ac.field_A, th.field_C));
                                return false;
                              }
                              df.a(26.0f, param1 ^ 59, c.a(17, fn.field_a, "", hn.field_A, vd.field_e));
                              return false;
                            }
                            df.a(23.0f, param1 ^ 41, c.a(17, fn.field_a, "", hn.field_A, bp.field_c));
                            return false;
                          }
                          df.a(20.0f, param1 + 110, il.a(pg.field_a, n.field_q, mb.field_c, (byte) 33));
                          return false;
                        }
                        df.a(20.0f, 5, il.a(pg.field_a, vp.field_D, mb.field_c, (byte) 113));
                        return false;
                      }
                      df.a(19.0f, 28, c.a(param1 + 119, ol.field_e, "", l.field_c, uf.field_l));
                      return false;
                    }
                    df.a(10.0f, -99, c.a(17, bo.field_i, "", db.field_d, rg.field_v));
                    return false;
                  }
                  df.a(3.0f, -102, c.a(17, vf.field_g, "", kb.field_c, rl.field_a));
                  return false;
                }
                df.a(2.0f, -80, c.a(17, ol.field_e, "kartika13", l.field_c, rp.field_d));
                return false;
              }
              df.a(1.0f, 84, c.a(17, bo.field_i, "basic", db.field_d, rp.field_d));
              return false;
            }
            if (vc.field_c == null) {
              vc.field_c = new kh[32];
              vc.field_c[0] = je.a(rl.field_a, "", "powerups/exit", (byte) -121);
              vc.field_c[2] = je.a(rl.field_a, "", "powerups/time_fixed", (byte) -127);
              vc.field_c[1] = je.a(rl.field_a, "", "powerups/score", (byte) -119);
              vc.field_c[4] = je.a(rl.field_a, "", "powerups/spikes", (byte) -127);
              vc.field_c[5] = je.a(rl.field_a, "", "powerups/frameRotation", (byte) -122);
              cf.a(6639);
              return false;
            }
            if (vc.field_c[6] == null) {
              vc.field_c[6] = je.a(rl.field_a, "", "powerups/gyroscope", (byte) -127);
              vc.field_c[7] = je.a(rl.field_a, "", "powerups/bomb", (byte) -127);
              vc.field_c[8] = je.a(rl.field_a, "", "powerups/shield", (byte) -121);
              vc.field_c[9] = je.a(rl.field_a, "", "powerups/letter_t", (byte) -122);
              vc.field_c[10] = je.a(rl.field_a, "", "powerups/letter_o", (byte) -120);
              cf.a(6639);
              return false;
            }
            if (null == vc.field_c[11]) {
              vc.field_c[11] = je.a(rl.field_a, "", "powerups/letter_r", (byte) -118);
              vc.field_c[12] = je.a(rl.field_a, "", "powerups/letter_q", (byte) -123);
              vc.field_c[13] = je.a(rl.field_a, "", "powerups/letter_u", (byte) -122);
              vc.field_c[14] = je.a(rl.field_a, "", "powerups/letter_i", (byte) -123);
              vc.field_c[15] = je.a(rl.field_a, "", "powerups/letter_n", (byte) -126);
              cf.a(param1 ^ -6539);
              return false;
            }
            if (vc.field_c[16] == null) {
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
            if (vc.field_c[21] == null) {
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
            if (ia.a(-22426, 0)) {
              var31 = rm.a(rl.field_a, "", "sphere_halloween");
              gi.a(var31, (byte) 13, 31);
              vc.field_c[17] = new kh(var31);
              vc.field_c[18] = new kh(var31);
              vc.field_c[19] = new kh(var31);
              vc.field_c[20] = new kh(var31);
              vc.field_c[21] = new kh(var31);
              vc.field_c[22] = new kh(var31);
              vc.field_c[23] = new kh(var31);
              vc.field_c[24] = new kh(var31);
              ji.a(vc.field_c[24].field_l, -1);
            }
            if (null == vc.field_c[3]) {
              vc.field_c[3] = je.a(rl.field_a, "", "obstacles/childs_play_block", (byte) -120);
              vc.field_c[25] = je.a(rl.field_a, "", "obstacles/drinks_can", (byte) -128);
              vc.field_c[26] = je.a(rl.field_a, "", "obstacles/grave_stone2", (byte) -128);
              vc.field_c[27] = je.a(rl.field_a, "", "obstacles/pinetree_round", (byte) -123);
              vc.field_c[28] = je.a(rl.field_a, "", "obstacles/pinetree_square", (byte) -122);
              vc.field_c[29] = je.a(rl.field_a, "", "obstacles/statue", (byte) -126);
              var60 = vc.field_c[29].field_l.field_m;
              var32 = var60;
              var3 = var32;
              for (var4_int = 0; var4_int < var60.length; var4_int++) {
                var5 = var60[var4_int];
                var3[var4_int] = (short)(ie.a(127, var5) + 8704);
              }
              vc.field_c[30] = je.a(rl.field_a, "", "obstacles/traffic_cone", (byte) -123);
              vc.field_c[31] = je.a(rl.field_a, "", "obstacles/traffic_lights_tall", (byte) -121);
              cf.a(6639);
              return false;
            }
            if (vb.field_c[3] == null) {
              vb.field_c[3] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_block").a(80, 1365, -1, -12, 12));
              vb.field_c[25] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_can").a(80, 1365, -1, -12, 12));
              vb.field_c[26] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_grave").a(80, 1365, -1, -12, 12));
              vb.field_c[27] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_roundtree").a(80, 1365, -1, -12, 12));
              vb.field_c[28] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_squaretree").a(80, 1365, -1, -12, 12));
              vb.field_c[29] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_statue").a(80, 1365, -1, -12, 12));
              vb.field_c[30] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_cone").a(80, 1365, -1, -12, 12));
              vb.field_c[31] = (pj) (rm.a(rl.field_a, "", "obstacles/bb_lights_tall_nopost").a(80, 1365, -1, -12, 12));
              ka.field_n[31][0] = 0;
              ka.field_n[31][4] = 0;
              ka.field_n[31][1] = 16;
              ka.field_n[31][2] = 8;
              ka.field_n[31][3] = -101;
              cf.a(6639);
              return false;
            }
            gb.field_c = je.a(rl.field_a, "", "powerups/spikesonly", (byte) -127);
            var3Lifetime1 = vc.field_c[9].field_l.field_m;
            for (var4_intLifetime1 = 10; var4_intLifetime1 <= 16; var4_intLifetime1++) {
              if (vc.field_c[var4_intLifetime1].field_l.field_m.length > var3Lifetime1.length) {
                var3Lifetime1 = vc.field_c[var4_intLifetime1].field_l.field_m;
              }
            }
            for (var4_intLifetime2 = 9; var4_intLifetime2 <= 16; var4_intLifetime2++) {
              vc.field_c[var4_intLifetime2].field_l.field_m = var3Lifetime1;
            }
            dk.a(var3Lifetime1, 0, var3Lifetime1.length, (short) 960);
            rl.field_a = null;
            cf.a(6639);
            return false;
          }
          if (rp.field_d != null) {
            df.a(32.0f, -66, k.field_h);
            this.b((byte) 73);
            kk.field_o = mn.a(rp.field_d, "basic", "unachieved", 112);
            pe.field_J = mn.a(rp.field_d, "basic", "locked", param1 + 207);
            mo.a(kk.field_o, 4);
            dd.field_i = mn.a(rp.field_d, "basic", "orbcoin", 124);
            this.q(8);
            if (0 >= wp.field_w) {
              m.a(16750848, (java.applet.Applet) (this), 0, dh.field_a, 0, 16777215);
              var33 = new t(640, 480);
              rj.a(-65, cp.field_i, var33);
              vc.a(mn.a(rg.field_v, "", "mb_logo", 96), false);
              var34 = mn.a(rg.field_v, "", "mb_price_bg", 97);
              kp.a(var34, 10, 24, 96, 118, 37, 6, false, -2000);
              mk.field_b.a(-101);
            }
            rp.field_d = null;
            cf.a(6639);
            return false;
          }
          if (null != rg.field_v) {
            var3_int = dd.field_c.field_t + dd.field_c.field_x;
            kh.field_r = new t(var3_int, var3_int);
            kh.field_r.e();
            dd.field_i.c(0, 0, var3_int, var3_int);
            dd.field_i = null;
            mk.field_b.a(param1 + 4);
            s.field_t = pb.a("frame", -1, "", rg.field_v);
            lb.a(16777215, pb.a("frame2col", -1, "", rg.field_v), pb.a("frame2alpha", -1, "", rg.field_v), param1 ^ -98);
            var35 = ip.a(rg.field_v, -123, "", "intro_components");
            var42 = ip.a(rg.field_v, -109, "", "intro_components_shadows");
            var43 = var35[1];
            var7_ref_sm = var35[3];
            var8_ref_ia = new ia(18, 142, 404, 320);
            qc.field_cb = var8_ref_ia;
            pa.field_e = ip.a(rg.field_v, -115, "", "world_text");
            ml.field_a = ip.a(rg.field_v, -109, "", "world_img");
            mh.field_d = ip.a(rg.field_v, param1 - 17, "", "world_img_shadow");
            rp.field_b = new t[32];
            var9_ref_int__ = new int[]{16777215, 14211288, 15000804, 10526880};
            for (var10 = 0; var10 < 8; var10++) {
              var36 = ml.field_a[var10];
              var37 = new t(var36.field_c, var36.field_d);
              var37.e();
              var36.a(-var36.field_a, -var36.field_g);
              if (var36.field_d < var36.field_c) {
                var14_int = 48 * var36.field_d / var36.field_c;
                var13_int = 48;
              } else {
                var13_int = var36.field_c * 48 / var36.field_d;
                var14_int = 48;
              }
              for (var15 = 0; var15 < var9_ref_int__.length; var15++) {
                dupTemp$0 = new t(var13_int, var14_int);
                rp.field_b[var15 * 8 + var10] = dupTemp$0;
                var38 = dupTemp$0;
                var16_ref_t = var38;
                var16_ref_t.field_u = 48;
                var16_ref_t.field_r = -var38.field_t + var38.field_u >> 1;
                var38.e();
                var17 = var9_ref_int__[var15];
                ph.d(0, 0, ph.field_j, ph.field_d, var17);
                var37.d(0, 0, var13_int, var14_int);
                if (16777215 == var17) {
                  ph.e(0, 0, ph.field_j, ph.field_d);
                }
                var67 = var38.field_y;
                for (var19_int = 0; var67.length > var19_int; var19_int++) {
                  if (~var67[var19_int] == ~var17) {
                    var67[var19_int] = 0;
                  }
                }
                var38.d();
              }
            }
            mk.field_b.a(param1 ^ 11);
            pm.field_m = ip.a(rg.field_v, -114, "", "world_title");
            wh.field_t = ip.a(rg.field_v, param1 ^ 23, "", "world_title_shadows");
            wj.field_k = md.a("getready", 31094, rg.field_v, "");
            sg.field_e = pb.a("sprite_textures", param1 ^ 101, "", rg.field_v);
            sg.field_a = pb.a("auras", -1, "", rg.field_v);
            var40 = sg.field_a;
            for (var11_int = 0; var40.length > var11_int; var11_int++) {
              var41 = var40[var11_int];
              var41.a();
            }
            hj.field_c = var43;
            of.field_l = var35[2].a();
            fq.field_F = new dg(var42[2], 0, 0, 76);
            cq.field_w = var35[4].a();
            la.field_j = var35[0].a();
            jh.field_B = new dg(var42[0], 0, 0, 76);
            jb.field_b = var8_ref_ia;
            nh.field_l = var7_ref_sm;
            bd.field_w = mn.a(rg.field_v, "", "dashboard", 106);
            kk.field_n = mn.a(rg.field_v, "", "shieldIcon", 105);
            ia.field_f = mn.a(rg.field_v, "", "gyroIcon", 104);
            hq.field_h = pb.a("countdown", -1, "", rg.field_v);
            hi.field_h = new sm[8];
            gm.field_r = new sm[8];
            for (var10Lifetime2 = 0; 8 > var10Lifetime2; var10Lifetime2++) {
              gm.field_r[var10Lifetime2] = md.a("mg" + var10Lifetime2, 31094, rg.field_v, "");
              if (var10Lifetime2 == 1) {
                hi.field_h[var10Lifetime2] = md.a("mg" + var10Lifetime2 + "b", 31094, rg.field_v, "");
              }
            }
            ue.field_c = pb.a("skins", param1 + 101, "", rg.field_v);
            bl.field_d = 7;
            qo.field_t = 2;
            for (var10Lifetime3 = 0; var10Lifetime3 < 8; var10Lifetime3++) {
              ln.a((byte) 120, var10Lifetime3 * 640 >> 3);
            }
            nn.field_a = new af[12][];
            var10_ref = bi.a(var43, 81);
            var11 = new dg(vg.a(new sm[]{var42[3], var42[2], var42[4]}, 52), 0, 0, 76);
            var44 = vg.a(new sm[]{var7_ref_sm, var35[2], var35[4]}, 122);
            var13 = bi.a(var44, param1 - 7);
            nn.field_a[0] = new af[]{(af) (var10_ref), (af) ((Object) var8_ref_ia), (af) ((Object) var11), var13, (af) ((Object) new dg(var42[0], 0, 0, 76)), bi.a(var35[0], -115)};
            var45 = md.a("pause_title", param1 ^ -30996, rg.field_v, "");
            nn.field_a[1] = new af[]{(af) (var10_ref), (af) ((Object) var8_ref_ia), (af) ((Object) var11), var13, (af) ((Object) new dg(var45, 5, 5, 76)), bi.a(var45, i.c((int) param1, 55))};
            nn.field_a[3] = new af[]{(af) ((Object) new ia(102, 14, 436, 452)), dp.a("continue", "", rg.field_v, (byte) 4)};
            nn.field_a[4] = new af[]{(af) (var10_ref), dp.a("help_bg_delta", "", rg.field_v, (byte) 4), (af) ((Object) new ia(27, 98, 574, 365))};
            var15_ref_sm = md.a("highscore_top", 31094, rg.field_v, "");
            nn.field_a[2] = new af[]{(af) (var10_ref), (af) ((Object) new ia(102, 108, 436, 362)), dp.a("highscore_bottom", "", rg.field_v, (byte) 4), (af) ((Object) new dg(var15_ref_sm, 4, 4, 76)), bi.a(var15_ref_sm, 103)};
            nn.field_a[5] = new af[]{(af) ((Object) new ia(72, 82, 496, 366))};
            nn.field_a[9] = new af[]{(af) ((Object) new ia(27, 51, 574, 430)), dp.a("levelsel", "", rg.field_v, (byte) 4)};
            var16_ref_ia = new ia(23, 62, 593, 402);
            nn.field_a[6] = new af[]{(af) ((Object) var16_ref_ia), dp.a("achievetitle", "", rg.field_v, (byte) 4)};
            nn.field_a[8] = new af[]{(af) ((Object) var16_ref_ia), dp.a("gameachtitle", "", rg.field_v, (byte) 4)};
            nn.field_a[7] = new af[]{(af) ((Object) new ia(35, 144, 573, 223)), (af) ((Object) new dg(var42[0], 0, 0, 76)), bi.a(var35[0], 115)};
            nn.field_a[10] = new af[]{(af) ((Object) qc.field_cb), (af) ((Object) new dg(var42[0], 0, 0, 76)), bi.a(var35[0], param1 + 41), (af) ((Object) new dg(mh.field_d[1], 0, 0, 76)), bi.a(ml.field_a[1], 108)};
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
            var46 = mn.a(rg.field_v, "", "glass", 89);
            var46.a();
            var68 = var46.field_y;
            tj.field_n[11].a();
            var62 = tj.field_n[11].field_y;
            var47 = var62;
            var30 = var47;
            var19 = var30;
            for (var20 = 0; var20 < 16384; var20++) {
              var21 = var68[var20];
              if (0 != var21) {
                var22 = var21 >> 6 & 1020 | (var21 & 255) >> 3;
                var23 = -var22 + 256;
                var24 = var62[var20];
                var25 = var24 & 16711935;
                var26 = var24 & 65280;
                var19[var20] = gm.a(ie.a(65280 * var22 + var26 * var23, 16711865) >> 8, ie.a(16711935, var25 * var23 + var22 * 16711935 >> 8));
              }
            }
            tj.field_n[11].d();
            var48 = tj.field_n;
            for (var18 = 0; var18 < var48.length; var18++) {
              var49 = var48[var18];
              mo.a(var49, 4);
            }
            rg.field_v = null;
            vp.field_D = null;
            cf.a(6639);
            return false;
          }
          if (null != bp.field_c) {
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
            var3_intLifetime1 = bp.field_c.a(-1, "");
            var50 = id.field_a.a(bp.field_c.a("torq_whistle", -107, var3_intLifetime1), var3_intLifetime1, (byte) -84);
            var63 = new byte[var50.field_n.length];
            var51 = var63;
            var5_ref_byte__ = var51;
            dk.a(var50.field_n, 0, var5_ref_byte__, 0, var63.length);
            th.field_F[5] = new gg(var50.field_m, var63, var50.field_k, var50.field_o, var50.field_l);
            bp.field_c = null;
            cf.a(6639);
            return false;
          }
          if (vd.field_e != null) {
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
          if (th.field_C != null) {
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
          if (null != he.field_b) {
            df.a(40.0f, 34, kf.field_D + " - 0%");
            var52 = new fj(he.field_b.a(param1 - 18, "levels.tql", ""));
            var53 = var52.h((byte) 126);
            var5Lifetime1 = 0;
            var6 = 1;
            for (var7 = 0; var7 < var53.length(); var7++) {
              var8 = var53.charAt(var7);
              if (var8 == 10) {
                if (var5Lifetime1 != 0) {
                  var6++;
                }
                var5Lifetime1 = 1;
              } else {
                var5Lifetime1 = 0;
              }
            }
            qc.field_ab = new int[var6];
            mh.field_k = new int[var6];
            var54 = new StringBuilder(8192);
            var8Lifetime2 = 0;
            var9 = 0;
            var10_ref = null;
            for (var11_intLifetime1 = 0; var11_intLifetime1 < var53.length(); var11_intLifetime1++) {
              var12_int = var53.charAt(var11_intLifetime1);
              if (var12_int == 10) {
                if (var54.length() != 0) {
                  var55 = new hc(var8Lifetime2, var54.toString());
                  var54.setLength(0);
                  qc.field_ab[var8Lifetime2] = qc.field_ab[var8Lifetime2] + 1;
                  var9++;
                  if (var10_ref != null) {
                    ((hc) (var10_ref)).field_m = var55;
                    var10_ref = var55;
                  } else {
                    jm.field_d = var55;
                    var10_ref = var55;
                  }
                } else {
                  var8Lifetime2++;
                }
              } else {
                discarded$2 = var54.append((char) var12_int);
              }
            }
            wi.field_a = new int[var9];
            hg.field_d = new int[var9];
            mk.field_c = new int[qc.field_ab.length];
            var11_intLifetime1Lifetime1 = 0;
            for (var8Lifetime3 = 0; qc.field_ab.length > var8Lifetime3; var8Lifetime3++) {
              mk.field_c[var8Lifetime3] = var11_intLifetime1Lifetime1;
              for (var12_intLifetime1 = 0; var12_intLifetime1 < qc.field_ab[var8Lifetime3]; var12_intLifetime1++) {
                hg.field_d[var11_intLifetime1Lifetime1] = var12_intLifetime1;
                incrementValue$1 = var11_intLifetime1Lifetime1;
                var11_intLifetime1Lifetime1++;
                wi.field_a[incrementValue$1] = var8Lifetime3;
              }
            }
            he.field_b = null;
            cf.a(6639);
            return false;
          }
          if (wp.field_w > 0 &&
            eg.field_t != null) {
            df.a(40.0f, 81, kf.field_D + " - 0%");
            if (cc.field_d == null) {
              cc.field_d = fa.a(2, 13, 27375, 0);
            }
            var3_array = cc.field_d.field_j;
            if (var3_array == null) {
              return false;
            }
            var64 = eg.field_t.a(var3_array, (byte) -97, "", "levels.tql");
            var56 = var64;
            var4 = var56;
            if (var4 == null) {
              return false;
            }
            var57 = new fj(var64);
            var58 = var57.h((byte) 118);
            var7Lifetime1 = 0;
            var8Lifetime1 = qc.field_ab.length + 1;
            for (var9Lifetime1 = 0; var58.length() > var9Lifetime1; var9Lifetime1++) {
              var10Lifetime1 = var58.charAt(var9Lifetime1);
              if (10 != var10Lifetime1) {
                var7Lifetime1 = 0;
              } else {
                if (var7Lifetime1 != 0) {
                  var8Lifetime1++;
                }
                var7Lifetime1 = 1;
              }
            }
            var9Lifetime1Lifetime1 = qc.field_ab.length;
            var10Lifetime1 = 1;
            var11_array = new int[var8Lifetime1];
            dk.a(qc.field_ab, 0, var11_array, 0, qc.field_ab.length);
            qc.field_ab = var11_array;
            var12 = new int[var8Lifetime1];
            dk.a(mh.field_k, 0, var12, 0, mh.field_k.length);
            mh.field_k = var12;
            var13_ref = new StringBuilder(8192);
            var14 = jm.field_d;
            while (var14.field_m != null) {
              var14 = var14.field_m;
              var10Lifetime1++;
            }
            for (var15Lifetime1 = 0; var15Lifetime1 < var58.length(); var15Lifetime1++) {
              var16 = var58.charAt(var15Lifetime1);
              if (var16 == 10) {
                if (var13_ref.length() != 0) {
                  var59 = new hc(var9Lifetime1Lifetime1, var13_ref.toString());
                  var13_ref = new StringBuilder(8192);
                  qc.field_ab[var9Lifetime1Lifetime1] = qc.field_ab[var9Lifetime1Lifetime1] + 1;
                  var10Lifetime1++;
                  var14.field_m = var59;
                  var14 = var59;
                } else {
                  var9Lifetime1Lifetime1++;
                }
              } else {
                discarded$4 = var13_ref.append((char) var16);
              }
            }
            hg.field_d = new int[var10Lifetime1];
            wi.field_a = new int[var10Lifetime1];
            mk.field_c = new int[qc.field_ab.length];
            var15Lifetime1Lifetime1 = 0;
            for (var9Lifetime1Lifetime2 = 0; qc.field_ab.length > var9Lifetime1Lifetime2; var9Lifetime1Lifetime2++) {
              mk.field_c[var9Lifetime1Lifetime2] = var15Lifetime1Lifetime1;
              for (var16Lifetime1 = 0; var16Lifetime1 < qc.field_ab[var9Lifetime1Lifetime2]; var16Lifetime1++) {
                hg.field_d[var15Lifetime1Lifetime1] = var16Lifetime1;
                incrementValue$3 = var15Lifetime1Lifetime1;
                var15Lifetime1Lifetime1++;
                wi.field_a[incrementValue$3] = var9Lifetime1Lifetime2;
              }
            }
            ti.field_l = null;
            eg.field_t = null;
            cf.a(6639);
            return false;
          }
          if (!lp.field_f) {
            var3_intLifetime2 = 0;
            var4_ref = jm.field_d;
            while (var4_ref != null) {
              if (var4_ref.e(0) &&
                var4_ref.b(param1 ^ -15) &&
                var4_ref.g(1)) {
                var3_intLifetime2++;
                var4_ref = var4_ref.field_m;
                continue;
              }
              df.a((float)(var3_intLifetime2 * 60 / hg.field_d.length + 40), 51, kf.field_D + " - " + 100 * var3_intLifetime2 / hg.field_d.length + "%");
              return false;
            }
            ol.field_f = new hc[var3_intLifetime2];
            var3_intLifetime2 = 0;
            var4_refLifetime1 = jm.field_d;
            while (var4_refLifetime1 != null) {
              incrementValue$5 = var3_intLifetime2;
              var3_intLifetime2++;
              ol.field_f[incrementValue$5] = var4_refLifetime1;
              var4_refLifetime1 = var4_refLifetime1.field_m;
            }
            if (be.field_a[0] == 0) {
              be.a();
              be.a(1.0f);
            }
            lp.field_f = true;
            cf.a(param1 ^ -6539);
            return false;
          }
          if (null == ig.field_q) {
            ig.field_q = new hc(8, "ZU##############################55555555################################################5555555555###############################################55######555#############################################555#######55#############################################55########555############################################555########55#############################################555######555##############################################55######55########################################################################################################5555####################################################5555555###########55555#################################555##5555#########55555555###############################55#####55########55#####555##############################555####55########55#######55##############################555##555#######55########55###############################555555########55#########55################################555##########55##55###555############################################5555555###55####################################5#######55555555##################################555555555################################################55555555##########5555########################################5555########555555#########################################55#######555##555#################################555555555#######55#####55################################55555555########555###555#####################################5555########55555555#######################################55#######555555555################################555555555#######55#######################################55555555########################################################################5#############################555########5########555555555############################555555555555########55555555###############################5555555555#############5555#################################55###555##############55################################55#####55#######555555555################################5555##55########55555555##################################555555##############5555###################################555#################55################################################555555555################################5555555555555###55555555##################################55555555555#################55############################################55555######55############################55555##########5555555##################################5555555########55555#555################################55555#555#######55#555#55################################55#555#55#######555#55555################################555#55555########55##555##################################55##555################################################################################################################5########################################################55##################################################555555555###############################################5555555555###############################################555####55#################################################55#################################################################################################################55555###################################################5555555#################################################55555#555################################################55#555#55################################################555#55555#################################################55##555#####################fEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfEfE0007wQ5Y0cw00");
            cf.a(6639);
            return false;
          }
          if (!ig.field_q.e(param1 ^ -102)) {
            cf.a(6639);
            return false;
          }
          if (null == hg.field_b) {
            lc.d(param1 ^ 1339942777);
            kl.field_p = null;
            cf.a(param1 + 6741);
            return false;
          }
          if (vo.field_f != null) {
            if (param1 == -102) {
              return true;
            }
            var28 = (fj) null;
            Torquing.a(-38, -61, (fj) null);
            return true;
          }
          vo.field_f = new mh[12];
          fn.field_c = 0;
          for (var3_intLifetime3 = 0; var3_intLifetime3 < 12; var3_intLifetime3++) {
            vo.field_f[var3_intLifetime3] = new mh(this, var3_intLifetime3);
          }
          bn.field_h = 0;
          cf.a(6639);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var3_ref), "Torquing.WA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(byte param0) {
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_176_0 = 0;
        int stackIn_182_0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
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
        var13 = field_u;
        try {
          var2_long = km.b(-1);
          oo.field_b = oo.field_b + 1;
          ed.a(0);
          var4 = 0;
          while (np.a((byte) -13)) {
            if (e.field_f != 13 &&
              e.field_f != 84 &&
              83 != e.field_f) {
              continue;
            }
            var4 = 1;
          }
          stackIn_13_0 = (0 == ta.field_o) ? 0 : 1;
          var5 = stackIn_13_0;
          var6 = 1;
          if (fn.field_c != -1) {
            stackIn_19_0 = (!vo.field_f[fn.field_c].field_a.field_k) ? 0 : 1;
            var6 = stackIn_19_0;
          }
          var11 = bn.field_h;
          if (var11 != 0) {
            if (var11 == 2) {
              if (1 == oo.field_b) {
                if (tm.field_c == 11) {
                  pl.a((byte) -120, true);
                }
                if (2 == tm.field_c) {
                  vl.field_c = null;
                }
              }
              if (oo.field_b >> 1 == tm.field_b) {
                ie.field_b.field_e.a(param0 + 108);
                bn.field_h = -1;
                fn.field_c = tm.field_c;
                vo.field_f[fn.field_c].field_i = 0;
              }
            } else {
              if (var11 != 1) {
                if (10 != var11) {
                  if (3 != var11) {
                    if (var11 == 7) {
                      if (250 <= oo.field_b) {
                        this.a(true, ie.field_b.field_L, 5, var6 != 0);
                      } else {
                        if (oo.field_b > 2 * tm.field_b &&
                          var5 != 0) {
                          this.a(true, ie.field_b.field_L, 5, true);
                        } else {
                          if (2 * tm.field_b < oo.field_b &&
                            var4 != 0) {
                            this.a(true, ie.field_b.field_L, 5, false);
                          }
                        }
                      }
                    } else {
                      if (var11 == 4) {
                        var11 = 0;
                        if (ie.field_b.field_L != tm.field_c) {
                          var12 = ie.field_b.field_d.field_m;
                        } else {
                          var12 = ie.field_b.field_d;
                        }
                        if (var12.field_e != null) {
                          var11 = 2 * var12.field_e.a(false);
                        }
                        if (2 * tm.field_b < oo.field_b) {
                          if (var11 > oo.field_b) {
                            if (var5 != 0) {
                              this.a(true, ie.field_b.field_L, 5, true);
                            } else {
                              if (var4 != 0) {
                                this.a(true, ie.field_b.field_L, 5, false);
                              }
                            }
                          } else {
                            this.a(true, ie.field_b.field_L, 5, var6 != 0);
                          }
                        }
                      } else {
                        if (6 != var11) {
                          if (var11 != 11) {
                            if (var11 != 12) {
                              if (var11 == 5) {
                                if (tm.field_b <= oo.field_b / 2) {
                                  bn.field_h = -1;
                                  jh.a(la.field_k[ie.field_b.field_q], 0);
                                }
                              } else {
                                if (var11 == 8) {
                                  var9 = 0;
                                  stackIn_176_0 = (-1 + qc.field_ab.length != tm.field_c) ? 0 : 1;
                                  var7 = stackIn_176_0;
                                  var10 = 0;
                                  if (wp.field_w <= 0) {
                                    stackIn_182_0 = (tm.field_c == 1) ? 1 : 0;
                                  } else {
                                    stackIn_182_0 = 0;
                                  }
                                  var8 = stackIn_182_0;
                                  if (oo.field_b < 250) {
                                    if (tm.field_b * 2 < oo.field_b &&
                                      var5 != 0) {
                                      var9 = 1;
                                      var10 = 1;
                                    } else {
                                      if (oo.field_b > 2 * tm.field_b &&
                                        var4 != 0) {
                                        var9 = 0;
                                        var10 = 1;
                                      }
                                    }
                                  } else {
                                    var9 = var6;
                                    var10 = 1;
                                  }
                                  if (var10 == 0) {
                                    if (var7 != 0 &&
                                      tm.field_b * 2 == oo.field_b) {
                                      ie.field_b.d(1);
                                    }
                                  } else {
                                    if (var8 != 0) {
                                      ie.field_b.b(9);
                                      this.a(true, 10, 12, var9 != 0);
                                    } else {
                                      if (var7 != 0) {
                                        this.a(true, tm.field_c, 11, var9 != 0);
                                      } else {
                                        this.a(true, 1 + tm.field_c, 9, var9 != 0);
                                      }
                                    }
                                  }
                                } else {
                                  if (9 == var11) {
                                    if (oo.field_b == 2 * tm.field_b) {
                                      ie.field_b.d(param0 + 109);
                                      cf.a(6639);
                                    } else {
                                      if (250 > oo.field_b) {
                                        if (tm.field_b * 2 < oo.field_b &&
                                          var5 != 0) {
                                          this.a(true, ie.field_b.field_L, 4, true);
                                        } else {
                                          if (2 * tm.field_b < oo.field_b &&
                                            var4 != 0) {
                                            this.a(true, ie.field_b.field_L, 4, false);
                                          }
                                        }
                                      } else {
                                        this.a(true, ie.field_b.field_L, 4, var6 != 0);
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (oo.field_b == 1) {
                                if (tm.field_c == 11) {
                                  pl.a((byte) -97, true);
                                }
                                if (2 == tm.field_c) {
                                  vl.field_c = null;
                                }
                              }
                              if (oo.field_b >> 1 == tm.field_b) {
                                fn.field_c = tm.field_c;
                                bn.field_h = -1;
                                vo.field_f[fn.field_c].field_i = 0;
                              }
                            }
                          } else {
                            if (tm.field_b <= oo.field_b / 2) {
                              bn.field_h = -1;
                              jh.a(la.field_k[ie.field_b.field_q], 0);
                            }
                          }
                        } else {
                          var11 = 0;
                          if (tm.field_c == ie.field_b.field_L) {
                            var12 = ie.field_b.field_d;
                          } else {
                            var12 = ie.field_b.field_d.field_m;
                          }
                          if (var12.field_e != null) {
                            var11 = 2 * var12.field_e.a(false);
                          }
                          if (tm.field_b * 2 != oo.field_b) {
                            if (2 * tm.field_b < oo.field_b) {
                              if (!la.field_k[11].e(17) &&
                                var11 <= oo.field_b) {
                                this.a(true, tm.field_c, 5, var6 != 0);
                              } else {
                                if (var5 != 0) {
                                  this.a(true, tm.field_c, 5, true);
                                } else {
                                  if (var4 != 0) {
                                    this.a(true, tm.field_c, 5, false);
                                  }
                                }
                              }
                            }
                          } else {
                            ie.field_b.d(1);
                            cf.a(6639);
                          }
                        }
                      }
                    }
                  } else {
                    if (oo.field_b < 250) {
                      if (tm.field_b * 2 < oo.field_b &&
                        var5 != 0) {
                        fn.field_c = -1;
                        this.a(true, ie.field_b.field_L, 4, true);
                      } else {
                        if (2 * tm.field_b < oo.field_b &&
                          var4 != 0) {
                          fn.field_c = -1;
                          this.a(true, ie.field_b.field_L, 4, false);
                        }
                      }
                    } else {
                      fn.field_c = -1;
                      this.a(true, ie.field_b.field_L, 4, var6 != 0);
                    }
                  }
                } else {
                  if (tm.field_b == oo.field_b >> 1) {
                    if (fn.field_c == 3) {
                      gn.field_l = null;
                    }
                    bn.field_h = -1;
                    fn.field_c = -1;
                  }
                }
              } else {
                if (oo.field_b == 1) {
                  if (tm.field_c == 11) {
                    pl.a((byte) -128, true);
                  }
                  if (2 == tm.field_c) {
                    vl.field_c = null;
                  }
                }
                if (oo.field_b >> 1 == tm.field_b) {
                  if (3 == fn.field_c) {
                    gn.field_l = null;
                  }
                  if (11 == tm.field_c &&
                    je.a((byte) 76)) {
                    ie.field_b = null;
                    jh.field_y.a(0);
                    nh.field_k = 0;
                    fa.field_b = 0;
                    ao.field_f = 0;
                    bo.field_l.a(param0 ^ -108);
                  }
                  bn.field_h = -1;
                  fn.field_c = tm.field_c;
                  vo.field_f[fn.field_c].field_i = 0;
                }
              }
            }
          } else {
            am.a(75);
            if (hj.field_b) {
              bn.field_h = -1;
            }
          }
          if (param0 != -108) {
            this.b(-99, 74);
          }
          if (bn.field_h != 0) {
            if (-var2_long + km.b(param0 ^ 107) >= 2L) {
              return;
            }
            cf.a(param0 + 6747);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.SA(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, boolean param3) {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 1 ||
            2 == param2 ||
            param2 == 12) {
            if (param1 == -1) {
              return;
            }
            if (param1 == 0 ||
              2 == param1) {
              jh.a(la.field_k[0], 0);
            }
            vo.field_f[param1].a((byte) 94, param3);
          }
          if (!param0) {
            return;
          }
          np.a(-1, -32596, 0);
          oo.field_b = 0;
          bn.field_h = param2;
          this.field_t = null;
          tm.field_c = param1;
          this.f((byte) -108);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void o(int param0) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = field_u;
        try {
          oe.a(50, (byte) 44);
          oi.a(50, (byte) 80);
          tb.a(50, -128);
          no.c(-101);
          jh.a(la.field_k[0], 0);
          var2_int = tm.field_b;
          ul.field_b = new int[var2_int];
          for (var3 = 1; var3 < var2_int; var3++) {
            ul.field_b[var3] = i.c(65535, vi.field_a[-var3 + var2_int]);
          }
          if (param0 <= 69) {
            this.field_t = (uf) null;
          }
          ok.a((byte) -124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.CB(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        boolean stackIn_57_0 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        tj var3_ref_tj = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = field_u;
        try {
          if (null != dg.field_i) {
            stackIn_5_0 = dg.field_i;
          } else {
            stackIn_5_0 = k.field_d;
          }
          var2 = stackIn_5_0;
          if (sf.a(-1)) {
            boolean decompiledFrameRemainder0 = true;
            stackIn_9_0 = var2;
            if (dg.field_i == null) {
              stackIn_11_0 = stackIn_9_0;
              if (!ae.field_ib) {
                stackIn_12_0 = stackIn_11_0;
                stackIn_12_1 = false;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              stackIn_12_0 = stackIn_9_0;
              stackIn_12_1 = true;
            }
            ii.a((java.awt.Canvas) (stackIn_12_0), stackIn_12_1, (byte) -19);
            return;
          }
          if (!ee.field_s) {
            ji.a((byte) -99, (java.awt.Canvas) (var2));
            return;
          }
          if (null == kg.field_c &&
            null == kb.field_f) {
            if (bn.field_h == -1) {
              if (fn.field_c != -1) {
                vo.field_f[fn.field_c].c(93);
              } else {
                ie.field_b.a(false);
              }
            } else {
              this.r(3);
            }
            if (ie.field_b != null) {
              var3_ref_tj = (tj) (ie.field_b.field_B.b(0));
              if (var3_ref_tj != null) {
                var5 = ie.field_b.field_n;
                if (var5 >= 80) {
                  if (var5 < 230) {
                    var4 = 8;
                  } else {
                    var4 = 123 - var5 / 2;
                  }
                } else {
                  var4 = var5 / 2 - 32;
                }
                tj.field_n[var3_ref_tj.field_k].e(8, var4);
                um.field_m.b(k.field_b[var3_ref_tj.field_k], 48, var4 + um.field_m.field_x, 0, -1);
                i.field_N.b(k.field_b[var3_ref_tj.field_k], 48, var4 + um.field_m.field_x, 16777215, -1);
              }
            }
            if (param0 != 73) {
              return;
            }
            if (on.b(160)) {
              ph.c(0, 0, ph.field_j, ph.field_d);
              qk.a(14, 14, s.field_t, (byte) -4);
            }
            if (pb.field_e != -1) {
              var3 = oo.field_b << 3;
              if (var3 > 0) {
                ph.b(0, 0, ph.field_j, ph.field_d, 0, var3);
              }
            }
            if (hh.a(64) &&
              !on.b(160)) {
              stackIn_57_0 = (dg.field_i != null) || (ae.field_ib);
              oo.a(stackIn_57_0, -25564);
            }
            ni.a((java.awt.Canvas) (var2), 0, 0, -122);
            return;
          }
          df.a(100.0f, 11, ci.field_d);
          ji.a((byte) -99, (java.awt.Canvas) (var2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2_ref), "Torquing.EA(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1) {
        int var3_int = 0;
        uf dupTemp$0 = null;
        uf var5 = null;
        hc var4 = null;
        try {
          var3_int = wi.field_a[param0];
          k.a(var3_int, 1);
          nc.a(var3_int, true);
          qc.field_cb.a((byte) 90, 0, 0);
          wh.field_t[var3_int].a(0, 0, 76);
          pm.field_m[var3_int].a(0, 0);
          mh.field_d[var3_int].a(0, 0, 76);
          if (param1 != 22517) {
            this.q(-66);
          }
          ml.field_a[var3_int].a(0, 0);
          if (ie.field_b.field_L == param0) {
            var4 = ie.field_b.field_d;
          } else {
            var4 = ie.field_b.field_d.field_m;
          }
          if (var4.field_e == null) {
            dupTemp$0 = new uf(i.field_Q, 0, 372, 286, ml.field_a[var3_int], -34, -159);
            var4.field_e = dupTemp$0;
            var5 = dupTemp$0;
            var5.a((byte) -59, 30);
            var5.a(false, ff.a(new String[]{Integer.toString(1 + var3_int), Integer.toString(hg.field_d[param0] + 1)}, 0, qj.field_b));
            var5.a((byte) -50, 40);
            this.a(0, var4, var5);
            var5.a(30, wj.field_k.field_d, 111);
            var5.c(param1 ^ 22517);
          }
          var4.field_e.b(34, -127, 159);
          wj.field_k.a(-(wj.field_k.field_c / 2) + 219, 414);
          qh.field_c.a(kk.field_q, 139, 461, 502, 1000, 0, -1, 0, 0, (dd.field_c.field_x * 3 + 3) / 2);
          ph.c(0, 0, 640, 480, 16777215);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        mh dupTemp$1 = null;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        boolean stackIn_57_1 = false;
        mh stackIn_127_0 = null;
        boolean stackIn_128_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = field_u;
        try {
          la.field_c.b();
          qd.field_b.b();
          if (dg.field_i != null &&
            dg.field_i.field_b) {
            ug.a(-95);
            s.b(-23658);
          }
          stackIn_9_1 = 23;
          stackIn_10_2 = (null != dg.field_i);
          this.a((byte) stackIn_9_1, stackIn_10_2);
          if (w.field_F) {
            this.s(26418);
            w.field_F = false;
          }
          var2_int = 0;
          if (!sf.a(-1)) {
            if (!ee.field_s) {
              ue.a(-16513, da.field_g);
              if (this.b(true, (byte) -102)) {
                this.o(122);
                ee.field_s = true;
              }
            } else {
              if (null == kg.field_c) {
                if (kb.field_f == null) {
                  if (on.b(160)) {
                    if (pb.field_e == -1) {
                      var3 = ua.a(false);
                      if (var3 != 3) {
                        if (var3 != 2) {
                          if (var3 == 4) {
                            pb.field_e = 4;
                            oo.field_b = 0;
                          }
                        } else {
                          ug.a(-114);
                        }
                      } else {
                        hm.a(true, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, um.field_m.field_x * 3 / 2, 240);
                      }
                      if (!on.b(160)) {
                        vo.field_f[fn.field_c].a((byte) 82, true);
                      }
                    } else {
                      var2_int = 1;
                    }
                  } else {
                    if (!hh.a(64)) {
                      var2_int = 1;
                    } else {
                      stackIn_57_1 = (dg.field_i != null);
                      var3 = this.b(stackIn_57_1, -92);
                      if (var3 == 1 ||
                        var3 == 2) {
                        if (dg.field_i != null) {
                          ug.a(-113);
                        }
                        if (var3 == 2) {
                          to.a(ip.a(param0 + 39), -97);
                        }
                      }
                    }
                  }
                } else {
                  if (kb.field_f.field_n) {
                    if (nh.field_k < kb.field_f.field_k[0]) {
                      nh.field_k = kb.field_f.field_k[0];
                    }
                    if (wp.field_w <= 0) {
                      if (qc.field_ab[1] + qc.field_ab[0] <= nh.field_k) {
                        nh.field_k = -1 + qc.field_ab[0] + qc.field_ab[1];
                        kb.field_f = null;
                      } else {
                        kb.field_f = null;
                      }
                    } else {
                      kb.field_f = null;
                    }
                  }
                }
              } else {
                if (kg.field_c.field_n) {
                  ao.field_f = ao.field_f & ~kg.field_c.field_m;
                  fa.field_b = fa.field_b | kg.field_c.field_m;
                  kg.field_c = null;
                  pm.a((byte) 102);
                  if (fn.field_c == 8 &&
                    ao.field_f == 0) {
                    fn.field_c = 2;
                  }
                  c.a(this, 9072);
                }
              }
            }
          } else {
            this.n(param0 + 126);
            if (sf.a(-1)) {
              if (la.a(true) &&
                !ee.field_s) {
                discarded$0 = this.b(false, (byte) -102);
              }
              return;
            }
            if (!je.a((byte) 69)) {
              this.c(true);
            }
          }
          if (param0 != -30) {
            field_v = (kk) null;
          }
          if (var2_int != 0) {
            if (pb.field_e == -1) {
              sg.field_o = sg.field_o + 1;
              if (-1 == bn.field_h) {
                if (fn.field_c == -1) {
                  ie.field_b.i(40);
                } else {
                  dupTemp$1 = vo.field_f[fn.field_c];
                  dupTemp$1.field_i = dupTemp$1.field_i + 1;
                  stackIn_127_0 = vo.field_f[fn.field_c];
                  stackIn_128_1 = (bn.field_h == -1);
                  ((mh) (Object) stackIn_127_0).a(stackIn_128_1, -22807);
                  np.a(-1, -32596, 0);
                }
              } else {
                this.f((byte) -108);
              }
            } else {
              if (0 == (1073741824 & pb.field_e)) {
                fieldTemp$2 = oo.field_b + 1;
                oo.field_b = oo.field_b + 1;
                if (32 == fieldTemp$2) {
                  if (on.b(160)) {
                    mf.a(true);
                  } else {
                    eb.a(-124);
                  }
                  pb.field_e = pb.field_e | 1073741824;
                }
              } else {
                fieldTemp$3 = oo.field_b;
                oo.field_b = oo.field_b - 1;
                if (32 != fieldTemp$3) {
                  if (oo.field_b == 0) {
                    pb.field_e = -1;
                  }
                } else {
                  var3Lifetime1 = pb.field_e ^ 1073741824;
                  if (!je.a((byte) 67)) {
                    if (var3Lifetime1 != 0) {
                      if (1 == var3Lifetime1) {
                        fn.field_c = 2;
                      } else {
                        if (var3Lifetime1 != 2) {
                          if (3 == var3Lifetime1) {
                            fn.field_c = 9;
                          }
                        } else {
                          fn.field_c = 6;
                        }
                      }
                    } else {
                      ie.field_b.b(9);
                      if (fn.field_c == 7) {
                        fn.field_c = 2;
                      }
                    }
                  }
                  if (var3Lifetime1 == 4) {
                    hm.a(true, um.field_m.field_x, (t[]) null, 0, i.field_Q, 0, (t[]) null, 3, 320, 0, 3 * um.field_m.field_x / 2, 240);
                  }
                  bn.field_h = -1;
                }
              }
            }
          }
          if (null != ie.field_b &&
            ie.field_b.field_B.b(0) != null) {
            fieldTemp$4 = ie.field_b.field_n + 1;
            ie.field_b.field_n = ie.field_b.field_n + 1;
            if (fieldTemp$4 == 335) {
              ie.field_b.field_n = 0;
              ie.field_b.field_B.a((byte) -86);
            }
          }
          while (kg.a(nk.field_s, (byte) 21)) {
            this.e((byte) -117);
          }
          jd.a((byte) -115, 0);
          if (mk.a((byte) 38)) {
            var3Lifetime2 = this.g(118);
            if (var3Lifetime2 == 2 && (bn.field_h != -1 ||
              fn.field_c != -1)) {
              lg.h(-122);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.HA(" + param0 + ')');
        }
    }

    private final void c(boolean param0, int param1) {
        if (param0) {
          return;
        }
        try {
          k.a(param1, 1);
          nc.a(param1, true);
          qc.field_cb.a((byte) -40, 0, 0);
          wh.field_t[param1].a(0, 0, 76);
          pm.field_m[param1].a(0, 0);
          mh.field_d[param1].a(0, 0, 76);
          ml.field_a[param1].a(0, 0);
          pa.field_e[param1].a(0, 0);
          ph.c(0, 0, 640, 480, 16777215);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void r(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        var4 = field_u;
        try {
          if (param0 != 3) {
            field_x = 119;
          }
          if (0 == bn.field_h) {
            k.a(0, 1);
            nc.a(0, true);
            jk.a((byte) -118);
            return;
          }
          var2_int = oo.field_b >> 1;
          if (tm.field_b > var2_int) {
            var3 = bn.field_h;
            if (1 != var3 &&
              var3 != 10 &&
              var3 != 3 &&
              var3 != 7) {
              if (var3 == 2) {
                ie.field_b.a(false);
              } else if (6 != var3 &&
                8 != var3) {
                if (var3 == 4) {
                  this.c(false, wi.field_a[tm.field_c]);
                } else if (var3 == 5) {
                  this.a(tm.field_c, param0 + 22514);
                } else if (var3 == 9) {
                  this.b(90, tm.field_c - 1);
                } else if (var3 == 11) {
                  this.b(param0 + 98, tm.field_c);
                } else if (var3 == 12) {
                  this.b(96, 1);
                }
              } else {
                ie.field_b.a(false);
              }
            } else {
              vo.field_f[fn.field_c].c(93);
            }
            if (var2_int > 0) {
              gd.field_b.e();
              ph.b();
            }
          }
          if (var2_int > 0) {
            var3Lifetime1 = bn.field_h;
            if (var3Lifetime1 != 10 &&
              var3Lifetime1 != 5 &&
              var3Lifetime1 != 11) {
              if (var3Lifetime1 != 2 &&
                var3Lifetime1 != 1 &&
                var3Lifetime1 != 12) {
                if (var3Lifetime1 != 3 &&
                  var3Lifetime1 != 9) {
                  if (7 != var3Lifetime1 &&
                    var3Lifetime1 != 6 &&
                    4 != var3Lifetime1) {
                    if (var3Lifetime1 == 8) {
                      this.b(42, tm.field_c);
                    }
                  } else {
                    this.a(tm.field_c, 22517);
                  }
                } else {
                  this.c(false, tm.field_c);
                }
              } else {
                vo.field_f[tm.field_c].c(93);
              }
            } else {
              ie.field_b.a(false);
            }
            if (tm.field_b > var2_int) {
              mk.field_b.a(-86);
              vi.a(var2_int, gd.field_b, 0, 0, vi.field_a);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.VA(" + param0 + ')');
        }
    }

    final void b(int param0) {
        try {
          if (la.field_c != null) {
            la.field_c.f();
          }
          if (null != qd.field_b) {
            qd.field_b.f();
          }
          if (dg.field_i != null) {
            ug.a(-120);
          }
          int var2_int = -39 % ((param0 - 75) / 50);
          nb.b(0);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.JA(" + param0 + ')');
        }
    }

    public static void p(int param0) {
        try {
          field_w = null;
          field_v = null;
          if (param0 != 29165) {
            field_x = 30;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.QA(" + param0 + ')');
        }
    }

    final void a(int param0, hc param1, uf param2) {
        int var6_int = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        String var7 = null;
        int var8 = 0;
        String[] var9 = null;
        String[] var10 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var6 = null;
        var8 = field_u;
        try {
          var9 = kc.a('~', param1.field_l, param0);
          var10 = var9;
          if (1 == var9.length) {
            var5_ref_String__ = kc.a('/', var9[0], 0);
            for (var6_int = 0; var6_int < var5_ref_String__.length; var6_int++) {
              var7 = var5_ref_String__[var6_int];
              param2.a(false, var7);
            }
          } else {
            param2.a((t) null, var9[0], param0 ^ 250);
          }
          for (var5 = 1; var5 < var10.length; var5++) {
            var6 = var10[var5];
            param2.a(hh.field_e[var6.charAt(0) - 48], var6.substring(1), param0 ^ 250);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("Torquing.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public final void init() {
        try {
          this.a(16, "torquing", -116);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.init()");
        }
    }

    private final void q(int param0) {
        int var5_int = 0;
        int[] array$1 = null;
        int var7 = 0;
        int[] array$0 = null;
        int[] var4 = null;
        int var8 = 0;
        sm[] var9 = null;
        int[] var11 = null;
        int[] var15 = null;
        byte[] var20 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        sm[] var5 = null;
        int[] var13 = null;
        int[] var17 = null;
        byte[] var21 = null;
        int[] var4Lifetime1;
        var8 = field_u;
        try {
          nl.field_s = qg.a(e.field_b, rp.field_d, "kartika13", "", 255);
          var9 = ip.a(rg.field_v, -119, "", "smallfont");
          var20 = uf.field_l.a(param0 - 116, "smallfont", "");
          i.field_N = ok.a(var9, 256, var20);
          um.field_m = io.a(var9, -1, var20);
          i.field_Q = ob.a(1579032, new int[]{4473924, 12632256, 13421772}, var20, true, var9);
          var15 = i.field_Q.field_O[0];
          var11 = var15;
          var4 = var11;
          if (i.field_Q.field_O.length < 11) {
            i.field_Q.field_O = new int[11][];
          }
          i.field_Q.field_O[0] = var15;
          for (var5_int = 1; var5_int < 11; var5_int++) {
            array$1 = new int[var15.length];
            i.field_Q.field_O[var5_int] = array$1;
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
          var5 = ip.a(rg.field_v, -121, "", "minifont");
          var21 = uf.field_l.a(-114, "minifont", "");
          dd.field_c = ok.a(var5, 256, var21);
          qh.field_c = ob.a(1579032, new int[]{4473924, 8421504}, var21, true, var5);
          qh.field_c.field_x = qh.field_c.field_x - 1;
          var17 = qh.field_c.field_O[0];
          var13 = var17;
          var4Lifetime1 = var13;
          if (qh.field_c.field_O.length < 3) {
            qh.field_c.field_O = new int[3][];
          }
          qh.field_c.field_O[0] = var17;
          for (var7 = 1; var7 < 3; var7++) {
            array$0 = new int[var17.length];
            qh.field_c.field_O[var7] = array$0;
            dk.a(var4Lifetime1, 0, qh.field_c.field_O[var7], 0, var17.length);
          }
          qh.field_c.field_O[0][1] = 16777215;
          qh.field_c.field_O[1][1] = 16711680;
          qh.field_c.field_O[2][1] = 16750848;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var2), "Torquing.UA(" + param0 + ')');
        }
    }

    private final void s(int param0) {
        if (param0 != 26418) {
          return;
        }
        try {
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
          bp.field_c = vg.a(param0 - 54064, 6);
          uf.field_l = vg.a(-27646, 8);
          he.field_b = vg.a(-27646, 12);
          eg.field_t = vg.a(-27646, 13);
          n.field_q = vg.a(-27646, 14);
          kc.a(1, rp.field_d, e.field_b);
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "Torquing.NA(" + param0 + ')');
        }
    }

    static {
        field_v = new kk();
    }
}
