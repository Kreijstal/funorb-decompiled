/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class EscapeVector extends g {
    static String field_z;
    public static int field_A;

    final void e(byte param0) {
        try {
          int var2_int = -74 / ((-71 - param0) / 55);
          eh.field_k = false;
          this.m(-27273);
          jd.a((byte) -54);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.O(" + param0 + ')');
        }
    }

    final void c(int param0) {
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        boolean stackIn_42_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        var4 = field_A;
        try {
          if (ik.field_h[1]) {
            gk.field_c = false;
          }
          if (ik.field_h[2]) {
            gk.field_c = true;
          }
          var2_int = 119 % ((param0 + 39) / 33);
          if (null != df.field_d &&
            df.field_d.field_c) {
            ri.a(-25123);
            oj.a((byte) 97);
          }
          bj.field_C.d();
          ig.field_l.d();
          stackIn_16_1 = -1;
          stackIn_17_2 = (null != df.field_d);
          this.a(stackIn_16_1, stackIn_17_2);
          if (of.field_b) {
            this.f(true);
            of.field_b = false;
          }
          od.field_s = false;
          de.field_j = false;
          r.field_y = false;
          if (!ii.b(16836)) {
            boolean decompiledFrameRemainder0 = true;
            if (uk.field_h) {
              if (mb.b((byte) -120)) {
                if (!mj.a((byte) 79)) {
                  if (da.c((byte) -127)) {
                    if (ma.field_a != null) {
                      ma.field_a.s((byte) -41);
                    }
                    stackIn_42_1 = (df.field_d != null);
                    var3 = this.a(stackIn_42_1, -556);
                    if (var3 == 1) {
                      ri.a(-25123);
                    }
                    if (var3 == 2) {
                      if (df.field_d != null) {
                        ri.a(-25123);
                      }
                      gk.a(-9787, oc.d((byte) -119));
                    }
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    mb.a((byte) -90);
                    this.q(1);
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  if (ma.field_a == null) {
                    pf.e((byte) -125);
                  }
                  if (mj.field_d == 0) {
                    sj.a(8192, (byte) 51);
                  }
                  de.field_j = true;
                  if (null != ma.field_a &&
                    20 <= mj.field_d) {
                    de.field_j = false;
                  }
                  if (1000 > mj.field_d) {
                    mj.field_d = mj.field_d + 1;
                  }
                  var3Lifetime2 = fn.b(-14);
                  if (var3Lifetime2 == 2) {
                    ri.a(-25123);
                  }
                  if (var3Lifetime2 == 3) {
                    eo.a(24, true);
                  }
                  if (var3Lifetime2 == 4) {
                    da.a((byte) -112);
                  }
                  if (!mj.a((byte) 92)) {
                    if (null != ma.field_a) {
                      da.field_c.b(ch.field_a.field_j, 320);
                      if (var4 != 0) {
                        pl.field_q.b(-26480, pl.field_q.field_b.field_j);
                      }
                    } else {
                      pl.field_q.b(-26480, pl.field_q.field_b.field_j);
                    }
                    mj.field_d = 0;
                    gi.a((byte) -67);
                  }
                  if (var4 != 0) {
                    ac.a(25972, mg.field_f);
                    km.b((byte) -59);
                    this.n((byte) -96);
                  }
                }
              } else {
                ac.a(25972, mg.field_f);
                km.b((byte) -59);
                if (var4 != 0) {
                  this.n((byte) -96);
                }
              }
            } else {
              this.n((byte) -96);
            }
            while (true) {
              if (rg.a(wd.field_u, 109)) {
                this.f(127);
                if (var4 == 0) {
                  continue;
                }
              } else {
                rn.a(0, 30785);
              }
              break;
            }
            if (um.a(17830)) {
              this.k((byte) -67);
              if (var4 != 0) {
                this.j(-9926);
                if (!ii.b(16836) &&
                  mj.a((byte) 125)) {
                  eo.a(24, true);
                }
              }
            }
          } else {
            this.j(-9926);
            if (!ii.b(16836) &&
              mj.a((byte) 125)) {
              eo.a(24, true);
            }
          }
          if (dj.field_c != null &&
            !r.field_y) {
            dj.field_c.g(2048);
            dj.field_c = null;
          }
          if (null != mb.field_a &&
            !de.field_j) {
            mb.field_a.g(2048);
            mb.field_a = null;
          }
          if (!od.field_s) {
            var3Lifetime1 = 0;
            while (!(gd.field_K.length <= var3Lifetime1)) {
              if (var4 != 0) {
                return;
              }
              if (gd.field_K[var3Lifetime1] != null) {
                gd.field_K[var3Lifetime1].g(256);
                gd.field_K[var3Lifetime1] = null;
              }
              var3Lifetime1++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.H(" + param0 + ')');
        }
    }

    public static void l(byte param0) {
        try {
          field_z = null;
          if (param0 >= -76) {
            EscapeVector.a((String) null, 38, -112, (byte) -73);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.CB(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          EscapeVector.l((byte) -95);
          ag.a(47);
          nm.a(false);
          ek.a(69);
          dj.a((byte) -116);
          g.i((byte) -73);
          rn.a(false);
          eh.d((byte) -111);
          ad.b(-1);
          eg.a(-1);
          ca.a((byte) 104);
          em.a();
          mf.c(124);
          wl.a();
          nb.a(-111);
          n.a((byte) 70);
          td.a(128);
          dl.b((byte) -96);
          bg.a(13);
          rc.a(-49153);
          an.a(18);
          gm.a(8192);
          be.a((byte) -127);
          bm.a((byte) 110);
          ii.a(20);
          gi.c(-13885);
          mg.a(true);
          um.a(false);
          j.a(-76);
          ok.a(true);
          eo.b((byte) -72);
          vn.a((byte) 107);
          uc.a((byte) -59);
          af.a((byte) 71);
          pk.b(false);
          ak.c((byte) 77);
          dn.h(-1);
          ta.f(0);
          en.a(1);
          kg.f(80);
          p.b(99);
          sb.e(-4470);
          kk.b(-4);
          sk.b(true);
          rg.b((byte) 123);
          pj.b((byte) 6);
          cn.b(true);
          ce.b(-32408);
          o.d();
          ie.e();
          oe.f((byte) 69);
          t.b((byte) -34);
          ig.h(-60);
          pf.a(459);
          tf.a(-92);
          wc.a((byte) 49);
          dd.a(104);
          uj.a((byte) -106);
          jj.b(9);
          sa.a(false);
          hg.c(-71);
          nf.f(-363232252);
          fl.a((byte) -11);
          fi.b(-26317);
          ji.a(2097152);
          ge.b((byte) -58);
          gn.b(false);
          vd.c((byte) 80);
          sl.a(127);
          le.a(91);
          f.a((byte) 18);
          dh.a((byte) 124);
          ob.a((byte) 123);
          mj.a(true);
          jc.b(-1);
          gk.a((byte) -98);
          ug.a(true);
          ke.a(-71);
          wk.a(false);
          da.a(0);
          kc.a(-28377);
          tb.o(0);
          qc.t(-106);
          w.n(300);
          ng.j((byte) 124);
          pn.q(-5);
          bf.l(-125);
          h.k(96);
          oi.h((byte) 95);
          sn.a((byte) -118);
          uf.b(-27204);
          pa.a((byte) 103);
          dk.g(1);
          qe.b(0);
          we.a();
          in.a();
          u.a();
          ec.a((byte) -72);
          ib.a(0);
          kh.a((byte) 65);
          ac.c(105);
          na.d(3);
          od.d(-12548);
          oc.h(109);
          li.a(68);
          m.e(-1600199832);
          am.a((byte) -107);
          rb.a((byte) -85);
          pi.a((byte) 102);
          ic.a(false);
          co.a((byte) 63);
          cd.f(-1);
          fd.a((byte) 86);
          se.a((byte) 23);
          cb.a(-13379);
          bn.a(true);
          lh.a((byte) 26);
          nl.a(16558);
          fk.a(124);
          vj.a(-102);
          c.n(106);
          tj.a(true);
          df.a((byte) -88);
          bk.h(-24811);
          s.d((byte) 34);
          jg.a(true);
          hk.c((byte) 8);
          ma.b(1);
          e.b(32153);
          oa.f(5);
          on.a(127);
          tm.n(-23008);
          k.b(-24239);
          bi.c();
          ri.b(-117);
          ui.a(true);
          ia.a(true);
          ml.a(-117);
          aa.b((byte) -96);
          mm.b(56);
          cf.a(3);
          rd.a(-56);
          bc.a(0);
          ua.a(0);
          pc.a(true);
          ol.g(4095);
          nn.b((byte) 103);
          hd.a(127);
          mh.a(true);
          fh.a((byte) 86);
          i.a();
          th.a(8192);
          mn.a((byte) 96);
          jd.b((byte) 77);
          ej.a(26);
          hn.a((byte) -44);
          he.a(true);
          sc.a((byte) -76);
          ve.a(0);
          pg.b(0);
          hm.d((byte) 58);
          hc.j(1);
          r.a((byte) 58);
          vg.i((byte) -112);
          bb.h((byte) 127);
          bj.g((byte) -68);
          wf.a(false);
          ch.a(-5691);
          wa.a(false);
          si.f(95);
          v.a((byte) -87);
          ff.a(100);
          fa.a(true);
          b.a((byte) 118);
          ph.a((byte) 106);
          aj.a(0);
          ti.a((byte) -101);
          kb.a(true);
          qf.b(116);
          cg.f(-1);
          vi.a(119);
          ja.a(123);
          id.b(-17129);
          sf.a(false);
          fg.a((byte) -119);
          de.a(true);
          lj.a(true);
          sj.a((byte) 123);
          of.a(122);
          pb.a(false);
          qj.b(-10497);
          ki.l(88);
          gd.i((byte) -87);
          ul.f((byte) -96);
          fj.n(-11555);
          jm.a((byte) 127);
          rh.j(-24896);
          oj.e((byte) 113);
          lf.a((byte) 113);
          bo.a((byte) 105);
          ah.f(-16187);
          jf.j(1);
          eb.a(true);
          q.a((byte) 59);
          cl.a();
          cj.a(17159);
          wh.a(true);
          km.c(-4);
          kn.c(true);
          ni.l(-105);
          qa.e((byte) 59);
          om.a(5468);
          qm.a((byte) 126);
          vb.b((byte) 99);
          sh.f(0);
          vk.g(28);
          jb.c(true);
          mc.a(8123);
          hb.a(false);
          rm.a(true);
          ij.d(-83);
          ik.d(65535);
          di.b(0);
          ll.a((byte) -77);
          ck.a((byte) -31);
          ha.a((byte) 97);
          re.c(-11967);
          un.a((byte) -93);
          ae.a(1);
          md.l(119);
          tg.h(0);
          rl.d(29152);
          qk.a((byte) -79);
          gj.b(3355);
          me.k(0);
          je.a(-109);
          jl.a(-30082);
          gl.b(false);
          wd.d(94);
          tc.e(96);
          gf.b(12474);
          gb.b(-5);
          ea.b((byte) 118);
          ci.b(4);
          mb.a(4);
          qh.a(7);
          vc.a(-126);
          uk.a(-1);
          ga.a(-3217);
          jh.a(false);
          qd.b(false);
          rk.a(122);
          fn.a(122);
          mi.a((byte) 75);
          al.a(-128);
          lm.b((byte) -10);
          d.a((byte) 65);
          qi.j(8);
          oh.a((byte) -20);
          wi.a(64);
          tl.a((byte) -43);
          ee.a(false);
          ld.b((byte) -71);
          pl.c(256);
          bh.d(11);
          dc.a(false);
          cc.d(50);
          ei.e(-116);
          bd.d(-119);
          if (param0 >= -52) {
            this.p(-97);
          }
          ef.a(59);
          vl.a(-19467);
          kf.c((byte) 0);
          nk.g(29779);
          hi.g(14);
          dg.g(0);
          kl.g(-17);
          lb.g(-17318);
          ka.a((byte) 14);
          bl.d(255);
          sm.b(true);
          tk.b(31167);
          this.field_s = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.E(" + param0 + ')');
        }
    }

    private final void n(byte param0) {
        int var2_int = 0;
        dd var2 = null;
        ec var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref2 = null;
        var3 = field_A;
        try {
          ac.a(param0 ^ -25900, mg.field_f);
          if (null == fh.field_g) {
            gn.a(-122);
            dn.a(pg.field_f, param0 ^ -17595, 70.0f);
            this.e((byte) -128);
            fh.field_g = oi.a(param0 ^ -92, sn.field_c, "", "fonts_squarish16", fi.field_j);
            sn.field_c = null;
            ea.field_f = fe.a("", fi.field_j, "titles_escape", true);
            f.field_o = fe.a("", fi.field_j, "titles_vector", true);
            oi.field_O = fe.a("", fi.field_j, "titles_achievements", true);
            lf.field_I = fe.a("", fi.field_j, "titles_achievements_this_game", true);
            na.field_w = fe.a("", fi.field_j, "titles_highscores", true);
            jf.field_H = fe.a("", fi.field_j, "titles_instructions", true);
            kb.field_c = fe.a("", fi.field_j, "titles_retrieval_levels", true);
            p.field_c = fe.a("", fi.field_j, "titles_retribution_levels", true);
            oj.field_Q = fe.a("", fi.field_j, "titles_simulator_levels", true);
            k.field_j = fe.a("", fi.field_j, "titles_select_level_set", true);
            pj.field_g = kh.a(fi.field_j, (byte) 123, "", "level_set_icons");
            this.m((byte) 125);
            s.field_H = fe.a("", fi.field_j, "seeker_mine", true);
            od.field_b = fe.a("", fi.field_j, "seeker_mine_glow", true);
            mf.field_m = fe.a("", fi.field_j, "rock_buster", true);
            ga.field_b = fe.a("", fi.field_j, "interface_level_complete", true);
            ij.field_g = fe.a("", fi.field_j, "interface_game_over", true);
            mc.field_d = kh.a(fi.field_j, (byte) 124, "", "achievements");
            bn.a(mc.field_d, 0);
            hn.field_c = fe.a("basic", ve.field_h, "unachieved", true);
            rm.field_e = fe.a("basic", ve.field_h, "locked", true);
            qh.field_l = new ed(hn.field_c.field_A, hn.field_c.field_z);
            qh.field_l.f();
            mb.a(fe.a("", fi.field_j, "achievements_next_page_button", true), -84);
            mi.field_m = new ed[mc.field_d.length];
            var2_int = 0;
            while (mc.field_d.length > var2_int) {
              mi.field_m[var2_int] = new ed(32, 32);
              mi.field_m[var2_int].g();
              mc.field_d[var2_int].a(0, 0, 32, 32);
              var2_int++;
              if (var3 != 0) {
                return;
              }
            }
            id.field_a = new ed(32, 32);
            id.field_a.g();
            hn.field_c.a(0, 0, 32, 32);
            uj.field_b = new ed(32, 32);
            uj.field_b.g();
            rm.field_e.a(0, 0, 32, 32);
            md.field_D.a(param0 ^ -35);
            this.g(false);
            vd.field_f = kh.a(fi.field_j, (byte) 123, "", "level_complete_tick");
            af.field_a = ae.a("scrshots", "", (byte) -48, fi.field_j);
            ve.field_h = null;
            fn.a((byte) 92);
            return;
          }
          if (null != ff.field_i) {
            if (null == fj.field_eb) {
              dn.a(q.field_H, param0 + 17733, 90.0f);
              this.e((byte) 48);
              var2_ref = new ec(hn.field_h, jm.field_I);
              jm.field_I = null;
              hn.field_h = null;
              fj.field_eb = nm.a(2, "", var2_ref, oc.field_D, "music/menu");
              ul.field_O = nm.a(param0 ^ -94, "", var2_ref, oc.field_D, "music/briefing");
              wc.field_d = nm.a(2, "", var2_ref, oc.field_D, "music/panic");
              rk.field_d = new ce[5];
              rk.field_d[0] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_1");
              rk.field_d[1] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_2");
              rk.field_d[2] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_3");
              rk.field_d[3] = nm.a(2, "", var2_ref, oc.field_D, "music/oss_area_4");
              rk.field_d[4] = nm.a(n.a((int) param0, -94), "", var2_ref, oc.field_D, "music/simulator");
              oc.field_D = null;
              fn.a((byte) 93);
              return;
            }
            if (null == ld.field_h) {
              dn.a(qa.field_H, param0 ^ -17595, 100.0f);
              this.e((byte) -127);
              ld.field_h = bg.a(bj.field_B, ld.field_h, he.field_u, 0);
              bj.field_B = null;
              fn.a((byte) 51);
              return;
            }
            qi.a(50, true);
            pl.field_q = new t();
            hn.field_l = new ig(1, vh.f(param0 ^ -35));
            hm.field_o = new pf(true);
            rc.field_a = new ak(false, 1);
            if (param0 != -96) {
              field_z = (String) null;
            }
            da.field_b = new ta();
            qk.field_e = new dn(true);
            oe.c((byte) 115);
            fg.c(0);
            this.l(param0 + 95);
            uk.field_h = true;
            vl.b(1, 0);
            return;
          }
          dn.a(qf.field_n, 17637, 80.0f);
          this.e((byte) 7);
          var2 = new dd(22050, ie.field_q);
          ff.field_i = kj.a(hn.field_h, "", "write-text").a().a(var2);
          en.field_d = kj.a(hn.field_h, "", "cursor").a().a(var2);
          bm.field_a = kj.a(hn.field_h, "", "interference").a().a(var2);
          qh.field_i = kj.a(hn.field_h, "", "interference_300ms").a().a(var2);
          nn.field_g = kj.a(hn.field_h, "", "mainmenu_formation").a().a(var2);
          oa.field_w = kj.a(hn.field_h, "", "mouseover").a().a(var2);
          b.field_b = kj.a(hn.field_h, "", "level_indicator").a().a(var2);
          pc.field_a = kj.a(hn.field_h, "", "button_formation").a().a(var2);
          uf.field_g = kj.a(hn.field_h, "", "frame-appear").a().a(var2);
          si.field_t = kj.a(hn.field_h, "", "photo-blob-grow").a().a(var2);
          vd.field_g = kj.a(hn.field_h, "", "photo-body-explode").a().a(var2);
          ob.field_d = kj.a(hn.field_h, "", "grid_effect_1").a().a(var2);
          pa.field_b = kj.a(hn.field_h, "", "grid_effect_2").a().a(var2);
          dd.field_g = in.a(jm.field_I, "", "pixelate").b().a(var2);
          oj.field_N = kj.a(hn.field_h, "", "gas-pump").a().a(var2);
          ng.field_mb = kj.a(hn.field_h, "", "gas-burn").a().a(var2);
          ka.field_e = kj.a(hn.field_h, "", "left-foot-down").a().a(var2);
          ri.field_b = kj.a(hn.field_h, "", "right-foot-down").a().a(var2);
          ni.field_M = kj.a(hn.field_h, "", "ship-fire").a().a(var2);
          gn.field_e = kj.a(hn.field_h, "", "ship-fire-three").a().a(var2);
          uk.field_j = kj.a(hn.field_h, "", "alien-fire").a().a(var2);
          th.field_G = kj.a(hn.field_h, "", "shield").a().a(var2);
          co.field_d = kj.a(hn.field_h, "", "shield_impact").a().a(var2);
          gm.field_b = kj.a(hn.field_h, "", "shield_empty").a().a(var2);
          qa.field_E = kj.a(hn.field_h, "", "fuel-start").a().a(var2);
          lm.field_d = kj.a(hn.field_h, "", "fuel-filling").a().a(var2);
          al.field_b = kj.a(hn.field_h, "", "fuel-stop").a().a(var2);
          fn.field_f = kj.a(hn.field_h, "", "fuel-full").a().a(var2);
          fg.field_a = kj.a(hn.field_h, "", "crate-attach").a().a(var2);
          rk.field_c = kj.a(hn.field_h, "", "tether-tighten").a().a(var2);
          bc.field_c = kj.a(hn.field_h, "", "tether-release").a().a(var2);
          nm.field_a = kj.a(hn.field_h, "", "powerup-collect").a().a(var2);
          vi.field_c = kj.a(hn.field_h, "", "repeller-active").a().a(var2);
          w.field_hb = kj.a(hn.field_h, "", "magnet-active").a().a(var2);
          of.field_h = kj.a(hn.field_h, "", "laser").a().a(var2);
          ib.field_a = kj.a(hn.field_h, "", "explosion-ship").a().a(var2);
          vn.field_c = kj.a(hn.field_h, "", "explosion_5_seconds").a().a(var2);
          pa.field_a = in.a(jm.field_I, "", "beeping").b().a(var2);
          this.a(param0 + 97, var2);
          ci.field_a = kj.a(hn.field_h, "", "mine_inactive_hum_2").a().a(var2);
          qi.field_J = kj.a(hn.field_h, "", "100Hz square").a();
          ve.field_d = kj.a(hn.field_h, "", "explosion-seeker-mine").a().a(var2);
          kf.field_p = kj.a(hn.field_h, "", "rockbuster").a().a(var2);
          td.field_c = kj.a(hn.field_h, "", "explosion-rock-buster").a().a(var2);
          jh.field_k = kj.a(hn.field_h, "", "level_complete").a().a(var2);
          pl.field_o = kj.a(hn.field_h, "", "level_complete_score").a().a(var2);
          fn.a((byte) 106);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref2), "EscapeVector.FB(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -1) {
            field_z = (String) null;
          }
          nb.a((java.applet.Applet) (this), 1585176, (byte) -125, 6340704, vj.field_c, 192);
          aj.field_a = new fe((java.applet.Applet) (this), sh.field_r, af.field_a, vj.field_c);
          af.field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.AB(" + param0 + ')');
        }
    }

    final static void a(hg param0, hg param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_d != null) {
            param0.c((byte) -69);
          }
          if (param2 != -7) {
            return;
          }
          param0.field_d = param1.field_d;
          param0.field_b = param1;
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void o(int param0) {
        try {
          jm.field_K[param0] = fe.a("", fi.field_j, "sprites_fuel_glow", true);
          jm.field_K[2] = fe.a("", fi.field_j, "sprites_turret_glow", true);
          jm.field_K[3] = fe.a("", fi.field_j, "sprites_magnet_glow", true);
          jm.field_K[4] = fe.a("", fi.field_j, "sprites_repeller_glow", true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.DB(" + param0 + ')');
        }
    }

    final static ca n(int param0) {
        try {
          Throwable var1 = null;
          RuntimeException var1_ref = null;
          ca stackIn_2_0 = null;
          ca stackIn_4_0 = null;
          Object stackIn_6_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != 13) {
              stackIn_2_0 = (ca) null;
              return stackIn_2_0;
            }
            try {
              stackIn_4_0 = (ca) (Class.forName("a").newInstance());
              return stackIn_4_0;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              stackIn_6_0 = null;
              return (ca) (stackIn_6_0);
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) ((Object) var1_ref), "EscapeVector.GB(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (df.field_d != null) {
            ri.a(-25123);
          }
          if (!param0) {
            field_z = (String) null;
          }
          if (bj.field_C != null) {
            bj.field_C.c();
          }
          if (ig.field_l != null) {
            ig.field_l.c();
          }
          di.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.B(" + param0 + ')');
        }
    }

    private final void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != mg.field_c) {
            qc.a(8, mg.field_c);
            mg.field_c = null;
            fn.a((byte) 57);
          }
          fi.field_j = ve.a(1, 0, param0, 1, true);
          sn.field_c = mj.a(6, -125);
          hn.field_h = mj.a(2, -126);
          jm.field_I = mj.a(3, -127);
          oc.field_D = mj.a(4, -126);
          bj.field_B = mj.a(10, -124);
          he.field_u = mj.a(5, -128);
          gj.a((byte) 57, ei.field_m, ve.field_h);
          uf.a(ve.field_h, ei.field_m, (byte) -96);
          fl.field_n = new uc(70);
          fl.field_n.a(ve.field_h, ah.field_l, sm.field_d, "basic", 14826);
          fl.field_n.a(fi.field_j, ah.field_l, sm.field_d, "", 14826);
          fl.field_n.a(fi.field_j, ah.field_l, sm.field_d, "scrshots", 14826);
          fl.field_n.a(sn.field_c, c.field_o, qf.field_h, "", 14826);
          fl.field_n.a(bd.field_g, (byte) -125, gm.field_d, hn.field_h);
          fl.field_n.a(bd.field_g, (byte) -115, gm.field_d, jm.field_I);
          fl.field_n.a(bm.field_f, (byte) -119, uc.field_d, oc.field_D);
          fl.field_n.a(cd.field_r, (byte) -121, ek.field_b, bj.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.HB(" + param0 + ')');
        }
    }

    final static boolean a(tg param0, tg param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = field_A;
        try {
          if (param2 != -7457) {
            field_z = (String) null;
          }
          var3_int = -param1.field_pb + param0.field_pb;
          if (param0.field_lb != di.field_f) {
            if (null == param0.field_lb) {
              var3_int += 200;
              if (var4 != 0) {
                var3_int -= 200;
              }
            }
          } else {
            var3_int -= 200;
          }
          if (di.field_f != param1.field_lb) {
            if (param1.field_lb == null) {
              var3_int -= 200;
              if (var4 != 0) {
                var3_int += 200;
              }
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("EscapeVector.TA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, dd param1) {
        hh dupTemp$8 = null;
        hh dupTemp$9 = null;
        hh dupTemp$10 = null;
        hh dupTemp$11 = null;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sf.field_e[0] = kj.a(hn.field_h, "", "explosion-fuel-tank").a().a(param1);
          sf.field_e[param0] = kj.a(hn.field_h, "", "explosion-crate").a().a(param1);
          dupTemp$8 = kj.a(hn.field_h, "", "explosion-magnet-repeller").a().a(param1);
          sf.field_e[4] = dupTemp$8;
          sf.field_e[3] = dupTemp$8;
          sf.field_e[2] = kj.a(hn.field_h, "", "explosion-turret").a().a(param1);
          dupTemp$9 = kj.a(hn.field_h, "", "explosion-tnt").a().a(param1);
          sf.field_e[8] = dupTemp$9;
          sf.field_e[5] = dupTemp$9;
          dupTemp$10 = kj.a(hn.field_h, "", "explosion-laser").a().a(param1);
          sf.field_e[7] = dupTemp$10;
          sf.field_e[6] = dupTemp$10;
          dupTemp$11 = kj.a(hn.field_h, "", "explosion-powerup").a().a(param1);
          sf.field_e[13] = dupTemp$11;
          sf.field_e[12] = dupTemp$11;
          sf.field_e[11] = dupTemp$11;
          sf.field_e[10] = dupTemp$11;
          sf.field_e[9] = dupTemp$11;
          this.a((byte) -60, sf.field_e[0]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("EscapeVector.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void m(int param0) {
        RuntimeException decompiledCaughtException = null;
        tj var2 = null;
        RuntimeException var2_ref = null;
        java.awt.Canvas var3 = null;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        var9 = field_A;
        try {
          var2 = qa.f((byte) -49);
          var3 = bf.i((byte) 10);
          if (param0 != -27273) {
            field_z = (String) null;
          }
          var4 = hm.g(11187) ? 1 : 0;
          if (ii.b(16836)) {
            gb.a(var4 != 0, (byte) 92, var3);
            return;
          }
          if (!uk.field_h) {
            ah.a(var3, 0);
            return;
          }
          if (!mb.b((byte) -64)) {
            dn.a(ff.field_a, 17637, 100.0f);
            ah.a(var3, 0);
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var2 != null) {
            var2.j(107);
            decompiledFrameRemainder0 = (var9 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ma.field_a != null) {
              ma.field_a.G(0);
            }
            if (wk.field_c) {
              em.d();
              aj.field_a.c(-76);
              decompiledFrameRemainder0 = (var9 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!pg.field_b) {
                if (od.field_q >= 0) {
                  hn.field_l.e(3);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (!n.field_h) {
                    if (e.field_a) {
                      da.field_b.i(3);
                      decompiledFrameRemainder0 = (var9 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (hn.field_n) {
                        rc.field_a.a(false);
                        decompiledFrameRemainder0 = (var9 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if (ch.field_b) {
                          qk.field_e.c((byte) 120);
                          decompiledFrameRemainder0 = (var9 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          if (null != da.field_c) {
                            da.field_c.d((byte) 126);
                            decompiledFrameRemainder0 = (var9 != 0);
                          }
                          if ((decompiledFrameRemainder0) &&
                            (null != pl.field_q)) {
                            pl.field_q.a((byte) -16);
                            if (var9 != 0) {
                              this.e(false);
                              hm.field_o.d(100);
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.e(false);
                    if (var9 != 0) {
                      hm.field_o.d(100);
                    }
                  }
                }
              } else {
                hm.field_o.d(100);
              }
            }
          }
          if (od.field_k &&
            null != ma.field_a &&
            ma.field_a.field_F) {
            fh.field_g.c("EASY PEASY MODE IS ON", 320, 40, 16744576, -1);
          }
          if (od.field_k &&
            null != ma.field_a &&
            ma.field_a.field_gb) {
            fh.field_g.c("TIME HACK MODE IS ON", 320, 40, 16744576, -1);
          }
          if (2 <= mg.field_b &&
            gk.field_c) {
            fh.field_g.b("FPS: " + th.field_p, 636, 100, 16777215, 0);
            fh.field_g.b("LPS: " + qf.field_j, 636, 120, 16777215, 0);
            var5 = Runtime.getRuntime().totalMemory();
            var7 = Runtime.getRuntime().freeMemory();
            fh.field_g.b((var5 - var7) / 1000L + " kB / " + var5 / 1000L + " kB", 636, 140, 16777215, 0);
          }
          if (da.c((byte) -106) &&
            !mj.a((byte) 122)) {
            mh.a((byte) -111, var4 != 0);
          }
          nn.a(var3, 0, -1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.BB(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_7_0 = 0;
        boolean stackIn_7_1 = false;
        int stackIn_7_2 = 0;
        boolean stackIn_8_3 = false;
        int stackIn_11_0 = 0;
        boolean stackIn_12_1 = false;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_1;
        int stackIn_33_2;
        int stackIn_33_3;
        boolean stackIn_33_4;
        int stackIn_33_5;
        boolean stackIn_33_6;
        int stackIn_34_7 = 0;
        int stackIn_38_8 = 0;
        int stackIn_42_0 = 0;
        int stackIn_45_1;
        int stackIn_45_2;
        int stackIn_45_3;
        boolean stackIn_45_4;
        int stackIn_45_5;
        boolean stackIn_45_6;
        int stackIn_46_7 = 0;
        int stackIn_50_8 = 0;
        int stackIn_53_0 = 0;
        String stackIn_53_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_57_0 = 0;
        String stackIn_57_1 = null;
        int stackIn_58_2 = 0;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        try {
          em.d();
          od.b(2);
          var2 = nk.field_r;
          var3 = ce.field_f.b(110) ? 1 : 0;
          stackIn_3_0 = var3;
          stackIn_3_1 = 4;
          stackIn_4_2 = (null != de.field_i);
          var4 = dn.a(stackIn_3_0 != 0, stackIn_3_1, stackIn_4_2, ua.field_c.d(17523));
          stackIn_7_0 = var3;
          stackIn_7_1 = ua.field_c.d(17523);
          stackIn_7_2 = -8;
          stackIn_8_3 = (null != de.field_i);
          var5 = qd.$cfr$intArgs$a$3214d41809e1(stackIn_7_0 != 0, stackIn_7_1, stackIn_7_2, stackIn_8_3);
          stackIn_11_0 = var3;
          stackIn_12_1 = (de.field_i != null);
          var6 = ik.a(stackIn_11_0 != 0, stackIn_12_1, (byte) -112, ua.field_c.d(17523));
          var7 = fh.field_g.b(var2);
          var8 = fh.field_g.b(var4);
          if (var8 > var7) {
            var7 = var8;
          }
          var8Lifetime1 = fh.field_g.b(var5);
          if (var8Lifetime1 > var7) {
            var7 = var8Lifetime1;
          }
          var8Lifetime2 = fh.field_g.b(var6);
          if (var8Lifetime2 > var7) {
            var7 = var8Lifetime2;
          }
          var8Lifetime3 = var7 / 2 + 25;
          if (40 > mj.field_d) {
            stackIn_26_0 = -mj.field_d + 40;
          } else {
            stackIn_26_0 = 0;
          }
          fc.a(stackIn_26_0, -var8Lifetime3 + 320, var8Lifetime3 + 321, 405, true, 29788, true, 6324320, 3162160, 0, 195, true);
          if (20 <= mj.field_d) {
            stackIn_30_0 = 0;
          } else {
            stackIn_30_0 = (20 - mj.field_d) * 2;
          }
          stackIn_33_1 = 240;
          stackIn_33_2 = 400;
          stackIn_33_3 = 289;
          stackIn_33_4 = true;
          stackIn_33_5 = 29788;
          stackIn_33_6 = false;
          if (di.field_d.field_h == 0) {
            stackIn_34_7 = 16777215;
          } else {
            stackIn_34_7 = 6340704;
          }
          if (di.field_d.field_h == 0) {
            stackIn_38_8 = 8421504;
          } else {
            stackIn_38_8 = 3170352;
          }
          fc.a(stackIn_30_0, stackIn_33_1, stackIn_33_2, stackIn_33_3, stackIn_33_4, stackIn_33_5, stackIn_33_6, stackIn_34_7, stackIn_38_8, 1, 262, param0);
          if (mj.field_d >= 30) {
            stackIn_42_0 = 0;
          } else {
            stackIn_42_0 = 2 * (30 - mj.field_d);
          }
          stackIn_45_1 = 280;
          stackIn_45_2 = 360;
          stackIn_45_3 = 359;
          stackIn_45_4 = true;
          stackIn_45_5 = 29788;
          stackIn_45_6 = false;
          if (di.field_d.field_h == 1) {
            stackIn_46_7 = 16777215;
          } else {
            stackIn_46_7 = 6340704;
          }
          if (di.field_d.field_h == 1) {
            stackIn_50_8 = 8421504;
          } else {
            stackIn_50_8 = 3170352;
          }
          fc.a(stackIn_42_0, stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4, stackIn_45_5, stackIn_45_6, stackIn_46_7, stackIn_50_8, 2, 332, false);
          pb.a(4);
          fh.field_g.c(var2, 320, 235, 10551200, -1);
          fh.field_g.c(var4, 320, 255, 10551200, -1);
          stackIn_53_0 = 285;
          stackIn_53_1 = cn.field_e;
          if (di.field_d.field_h != 0) {
            stackIn_54_2 = 6340704;
          } else {
            stackIn_54_2 = 16777215;
          }
          lb.a(stackIn_53_0, stackIn_53_1, stackIn_54_2, -128, 320);
          fh.field_g.c(var5, 320, 325, 10551200, -1);
          stackIn_57_0 = 355;
          stackIn_57_1 = sj.field_j;
          if (di.field_d.field_h == 1) {
            stackIn_58_2 = 16777215;
          } else {
            stackIn_58_2 = 6340704;
          }
          lb.a(stackIn_57_0, stackIn_57_1, stackIn_58_2, -118, 320);
          fh.field_g.c(var6, 320, 385, 10551200, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("escapevector", 640, 12);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.init()");
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.a(0, 11, 8, 7, 21, (byte) -99, false, 9);
          ie.a(22050, true, 10);
          bj.field_C = ie.a(g.field_r, (java.awt.Component) ((Object) of.field_d), 0, 1024);
          ig.field_l = ie.a(g.field_r, (java.awt.Component) ((Object) of.field_d), 1, 22050);
          rk.field_e = new hj();
          bj.field_C.b(rk.field_e);
          pl.field_n = new hj();
          ec.field_a = new wb(pl.field_n);
          ec.field_a.d(0.9399999976158142f);
          ec.field_a.b(14.826103210449219f);
          rk.field_e.a(ec.field_a);
          nb.field_c = new hj();
          ma.field_b = new wb(nb.field_c);
          if (param0 != -97) {
            EscapeVector.a((String) null, 31, 49, (byte) 88);
          }
          ma.field_b.d(0.9399999976158142f);
          ma.field_b.b(14.826103210449219f);
          ig.field_l.b(ma.field_b);
          this.a(true, (byte) -35, true, true, true);
          ua.field_c = new kg();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.P(" + param0 + ')');
        }
    }

    public EscapeVector() {
    }

    private final void p(int param0) {
        try {
          mb.field_f[0] = fe.a("", fi.field_j, "sprites_fuel", true);
          mb.field_f[1] = fe.a("", fi.field_j, "sprites_crate", true);
          mb.field_f[2] = fe.a("", fi.field_j, "sprites_turret", true);
          mb.field_f[3] = fe.a("", fi.field_j, "sprites_magnet", true);
          mb.field_f[4] = fe.a("", fi.field_j, "sprites_repeller", true);
          mb.field_f[5] = fe.a("", fi.field_j, "sprites_tnt", true);
          mb.field_f[6] = fe.a("", fi.field_j, "sprites_laser_left", true);
          int var2_int = -111 / ((60 - param0) / 58);
          mb.field_f[7] = fe.a("", fi.field_j, "sprites_laser_right", true);
          mb.field_f[8] = fe.a("", fi.field_j, "sprites_barrier", true);
          mb.field_f[9] = fe.a("", fi.field_j, "sprites_powerup_shield", true);
          mb.field_f[10] = fe.a("", fi.field_j, "sprites_powerup_triple_shot", true);
          mb.field_f[11] = fe.a("", fi.field_j, "sprites_powerup_thrust", true);
          mb.field_f[12] = fe.a("", fi.field_j, "sprites_powerup_one_rockbuster", true);
          mb.field_f[13] = fe.a("", fi.field_j, "sprites_powerup_five_rockbusters", true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.MB(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        tj var2 = null;
        int var4 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var4 = field_A;
        try {
          var2 = qa.f((byte) -49);
          if (param0 != 1) {
            return;
          }
          if (var2 != null &&
            !var2.field_l) {
            if (lf.field_H != 1) {
              vc.a(40, ul.field_O, true, (byte) -101);
              lf.field_H = 1;
            }
            if (-1 + var2.field_g.length > var2.field_E) {
              return;
            }
            if (var2.field_C != var2.field_B) {
              return;
            }
            wa.a(40 * var2.field_t / 100, 32471);
            if (var4 == 0) {
              return;
            }
          }
          if (null != var2 ||
            ma.field_a == null) {
            if (0 == lf.field_H) {
              return;
            }
            vc.a(64, fj.field_eb, true, (byte) -63);
            lf.field_H = 0;
            if (var4 == 0) {
              return;
            }
          }
          stackIn_37_0 = (lf.field_H == 2) ? 0 : 1;
          var3 = stackIn_37_0;
          if (ma.field_a != null) {
            ma.field_a.e(var3 != 0, 0);
          }
          lf.field_H = 2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "EscapeVector.EB(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, int param2, byte param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fh.field_g.c(param0, -1 + param1, -1 + param2, 0, -1, 64);
          fh.field_g.c(param0, 1 + param1, -1 + param2, 0, -1, 64);
          fh.field_g.c(param0, -1 + param1, param2 + 1, 0, -1, 64);
          fh.field_g.c(param0, 1 + param1, 1 + param2, 0, -1, 64);
          var4_int = 71 % ((52 - param3) / 53);
          fh.field_g.a(param0, param1, param2, 16777215, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("EscapeVector.JB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void g(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.m((byte) 29);
          }
          km.field_k = fe.a("", fi.field_j, "classic_level_select_bg", true);
          aj.field_c = fe.a("", fi.field_j, "vengeance_level_select_bg", true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "EscapeVector.VA(" + param0 + ')');
        }
    }

    private final void a(byte param0, hh param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = field_A;
        try {
          var3_int = 0;
          if (param0 >= -17) {
            this.a((byte) -2);
          }
          while (3 > var3_int) {
            var4 = var3_int + 14;
            sf.field_e[var4] = param1;
            var3_int++;
            if (var5 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("EscapeVector.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void m(byte param0) {
        try {
          this.p(-28);
          int var2_int = 116 / ((-30 - param0) / 47);
          this.o(0);
          qh.a(fi.field_j, (byte) -23);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "EscapeVector.IB(" + param0 + ')');
        }
    }

    static {
        field_z = "Members' Expansion";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$aafaec74e55e(hg param0, hg param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_d != null) {
            param0.c((byte) -69);
          }
          if (param2 != -7) {
            return;
          }
          param0.field_d = param1.field_d;
          param0.field_b = param1;
          param0.field_d.field_b = param0;
          param0.field_b.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("EscapeVector.WA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }
}
