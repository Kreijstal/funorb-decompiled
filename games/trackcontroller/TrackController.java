/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public final class TrackController extends ch {
    static ud field_G;
    static qj[] field_D;
    static String[] field_E;
    static String field_C;
    public static boolean field_F;

    public final void init() {
        this.a((byte) -123, "trackcontroller", 12);
    }

    private final void s(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_69_0 = 0;
        int var2;
        int var3;
        boolean decompiledFrameRemainder0 = true;
        var3 = field_F ? 1 : 0;
        if (dd.field_o == param0) {
          fieldTemp$0 = na.field_b + 1;
          na.field_b = na.field_b + 1;
          if (fieldTemp$0 < 0 && (0 != rj.field_a ||
            ni.field_m[84])) {
            na.field_b = 0;
          }
          if (na.field_b >= 80) {
            boolean decompiledFrameRemainder1 = true;
            if (~ib.field_a == ~sc.field_g &&
              0 == id.field_g) {
              if (ni.field_m[85]) {
                g.field_p = g.field_p + 1;
              } else {
                g.field_p = 0;
              }
              if (ib.field_a != -1) {
                tk.field_p[ib.field_a].c(-99);
                decompiledFrameRemainder1 = (null != ua.field_L);
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder1 = !(!ua.field_L.c(-127)))) {
                  ua.field_L.a(false, 103);
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                if (ni.field_m[13]) {
                  si.$cfr$intArgs$a$e9dea5688aa5(-68, 5);
                  stackIn_50_0 = (hk.field_d <= 0) ? 13 : 12;
                  sc.field_g = stackIn_50_0;
                }
                if (ib.field_a == -1) {
                  ua.field_L.a(true, 90);
                }
                while (mh.e(127)) {
                }
                decompiledFrameRemainder1 = false;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              vl.n(-27145);
              vg.field_p = true;
              id.field_g = id.field_g + 1;
              if (id.field_g == 31) {
                if (sc.field_g != -2) {
                  if (sc.field_g != -1) {
                    var2 = 0;
                    if (ib.field_a >= 0 &&
                      tk.field_p.length > ib.field_a) {
                      stackIn_69_0 = (!tk.field_p[ib.field_a].field_e.field_a) ? 0 : 1;
                      var2 = stackIn_69_0;
                    }
                    tk.field_p[sc.field_g].a(param0 ^ 10412, var2 != 0);
                  }
                } else {
                  sc.field_g = -1;
                  ua.field_L.b(0);
                }
              }
              if (id.field_g == 63) {
                if (ib.field_a == 11) {
                  g.field_w = null;
                }
                id.field_g = 0;
                ib.field_a = sc.field_g;
              }
              while (mh.e(127)) {
              }
            }
          } else {
            he.field_f[ib.field_a].a(false, param0 + 83);
          }
        } else {
          if (1 != dd.field_o) {
            if (dd.field_o == 2) {
              if (!jj.s(106)) {
                if (null != ua.field_L) {
                  ua.field_L.g(param0 + 122);
                }
                ib.field_a = nf.field_e;
              } else {
                ib.field_a = jh.field_a;
              }
              if (ib.field_a == -4) {
                stackIn_21_0 = (jj.s(96)) ? 0 : 1;
                ib.field_a = stackIn_21_0;
                oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true, 18, 0, 0);
              }
              if (ib.field_a == -3) {
                if (jj.s(123)) {
                  ib.field_a = 15;
                } else {
                  if (oe.field_e != 0) {
                    ib.field_a = 16;
                  } else {
                    if (ua.field_L.field_O == 0) {
                      sc.field_g = ib.field_a;
                      tk.field_p[sc.field_g].a(10412, false);
                      dd.field_o = 3;
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      ib.field_a = 11;
                    }
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                sc.field_g = ib.field_a;
                tk.field_p[sc.field_g].a(10412, false);
                dd.field_o = 3;
              }
            } else {
              id.field_g = id.field_g - 1;
              if (id.field_g == 0) {
                dd.field_o = 0;
              }
            }
          } else {
            vl.n(-27145);
            id.field_g = id.field_g + 1;
            if (id.field_g == 32) {
              if (ag.b(74)) {
                te.a((byte) -89);
              } else {
                v.e(6);
              }
              dd.field_o = 2;
            }
          }
        }

    }

    final void h(int param0) {
        fc.a(false);
        if (param0 != -24452) {
          this.h(-78);
        }
        if (null != og.field_rb) {
          oj.a(-111);
        }
        ei.d(-18601);
    }

    final void a(int param0) {
        Object stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        boolean stackIn_54_0 = false;
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        Object var7;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        var6 = field_F ? 1 : 0;
        if (null == og.field_rb) {
          stackIn_3_0 = ki.field_f;
        } else {
          stackIn_3_0 = og.field_rb;
        }
        var7 = stackIn_3_0;
        var2 = var7;
        if (ga.a(-122)) {
          stackIn_6_0 = -128;
          if (og.field_rb == null) {
            stackIn_7_1 = lb.field_M;
          } else {
            stackIn_7_1 = true;
          }
          ji.$cfr$intArgs$a$f0d318109cc1(stackIn_6_0, stackIn_7_1, (java.awt.Canvas) (var7));
          return;
        }
        if (param0 != 160) {
          return;
        }
        if (!pf.field_T) {
          l.a((byte) 90, (java.awt.Canvas) (var7));
          return;
        }
        if (il.field_e == null &&
          null == vd.field_G) {
          if (na.field_b < 80) {
            cd.field_c.h(0, 0);
            var3 = 640 * na.field_b / 160;
            var4 = 480 * na.field_b / 160;
            ll.e(320 - var3, -var4 + 240, var3 + 320, 240 + var4);
          }
          boolean decompiledFrameRemainder0 = true;
          db.a(480, 0, na.field_c, 640, 0, (byte) -128);
          gd.field_x = false;
          if (~sc.field_g == ~ib.field_a && (!(0 < id.field_g) ||
            dd.field_o != 0)) {
            if (ib.field_a == -1) {
              ua.field_L.h(24661);
            } else {
              tk.field_p[ib.field_a].b(-1);
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (id.field_g >= 32) {
              if (-1 != sc.field_g &&
                sc.field_g != -2) {
                tk.field_p[sc.field_g].b(param0 - 161);
              } else {
                ua.field_L.h(24661);
              }
              var3Lifetime1 = -id.field_g + 63;
            } else {
              if (ib.field_a != -1) {
                tk.field_p[ib.field_a].b(-1);
              } else {
                ua.field_L.h(param0 ^ 24821);
              }
              var3Lifetime1 = id.field_g;
            }
            ci.a(var3Lifetime1 + 1, -(var3Lifetime1 << 3) + 256, 16769381, false, false);
          }
          if (!gd.field_x) {
            kb.a(false, 4, 2);
          } else {
            vd.b(-1, 2, 23636);
          }
          ll.d();
          if (ag.b(param0 - 142)) {
            ll.c(0, 0, ll.field_d, ll.field_k);
            var3Lifetime2 = re.g(48);
            var4Lifetime1 = var3Lifetime2 % 26;
            if (var4Lifetime1 != 0) {
              var3Lifetime2 = var3Lifetime2 + (26 - var4Lifetime1);
            }
            var5 = ii.b(false);
            cl.a(nd.field_L, -(var3Lifetime2 >> 1) + 320 - nd.field_L[0].field_t, nd.field_L[0].field_q + var5 + nd.field_L[6].field_q, -(var5 >> 1) + 240 - nd.field_L[0].field_q, var3Lifetime2 - (-nd.field_L[0].field_t - nd.field_L[2].field_t), 4);
            nl.a(-77);
          }
          if (0 != dd.field_o) {
            var3Lifetime3 = id.field_g << 3;
            if (var3Lifetime3 > 0) {
              ll.c(0, 0, ll.field_d, ll.field_k, 0, var3Lifetime3);
            }
          }
          if (ob.g(-26998) &&
            !ag.b(18)) {
            if (og.field_rb != null) {
              stackIn_54_0 = true;
            } else {
              stackIn_54_0 = lb.field_M;
            }
            nc.a(stackIn_54_0, -131);
          }
          if (nf.field_f) {
            bk.field_E.c(Integer.toString(dh.field_p), 10, 40, 0, -1);
          }
          qd.a((java.awt.Canvas) (var7), 0, 0, param0 + 2741);
          return;
        }
        ud.a(128, 100.0f, ra.field_w);
        l.a((byte) 105, (java.awt.Canvas) (var7));
    }

    final void e(int param0) {
        TrackController.q(-29224);
        cb.a((byte) 120);
        ja.c(false);
        kk.a(-1);
        bg.a(61);
        vb.a(true);
        ib.a((byte) -78);
        ii.f(-5146);
        ia.a(true);
        lj.a(param0 ^ 5);
        uk.b(10);
        od.a(8192);
        we.a((byte) 57);
        ch.n(-8511);
        nl.a((byte) -96);
        re.b((byte) -91);
        ej.b(17);
        h.b(-31279);
        ll.c();
        oh.a();
        e.a(-1102);
        qf.a((byte) 98);
        be.i(3);
        qg.b(false);
        ai.a((byte) 116);
        o.b((byte) 88);
        uj.b(param0 ^ 105);
        dk.a(true);
        tf.a(-1);
        kc.a(param0 ^ 107);
        q.a(param0 ^ 5);
        qd.a(106);
        he.a((byte) -64);
        oj.a((byte) -116);
        wj.c(param0 ^ -6527);
        sk.a((byte) 111);
        gf.a((byte) 46);
        jc.a(-79);
        ri.a(-107);
        mg.a(-8381);
        gj.b((byte) -103);
        ea.d((byte) 96);
        md.a(false);
        sd.a((byte) -108);
        wg.c(param0 + 6778);
        il.b(-1);
        bc.c(32);
        fc.b((byte) 118);
        nb.d((byte) 84);
        id.a(param0 - 104);
        ha.d(4);
        fa.c();
        ol.f(param0 ^ -109);
        oa.e();
        qe.e(1048576);
        kb.a(14);
        cd.c(11352);
        na.a(-4775);
        fk.a(param0 + 14829);
        pa.a((byte) -125);
        ac.a(105);
        p.b((byte) 117);
        ra.a(param0 - 208);
        pc.a(true);
        vi.a(-25590);
        wi.a(false);
        pb.a(false);
        bb.a(true);
        ld.a(-16723);
        vl.e((byte) 9);
        og.v(-106);
        rk.t(4210752);
        jj.e((byte) 105);
        vd.b(false);
        sf.b(false);
        rl.b(false);
        bk.k(-122);
        kh.c(61);
        rd.b(3);
        mj.b(-2069072125);
        ab.a((byte) 98);
        gk.a(69);
        gb.d(-126);
        fd.a((byte) 111);
        g.a((byte) 12);
        sl.a((byte) 107);
        me.a((byte) 41);
        u.a((byte) 105);
        pg.a();
        c.a((byte) 107);
        hj.a(param0 ^ -3863);
        la.d(false);
        jk.a(-99);
        wf.a((byte) -123);
        qa.a(true);
        vj.a(18775);
        ta.a(param0 ^ 13730);
        nh.a(-104);
        kd.a((byte) 86);
        oe.a(-1);
        fh.a((byte) 125);
        b.a();
        nf.b(261211);
        da.e(80);
        mb.b((byte) -36);
        hi.c((byte) -81);
        hf.a(6);
        lh.c((byte) -44);
        gd.c(-3);
        tc.b((byte) -121);
        rg.a(17883);
        tk.f(48);
        pl.c(-30877);
        w.b(true);
        bd.a(44);
        ic.b((byte) -56);
        ig.b();
        ml.c();
        mf.b((byte) -103);
        cg.a((byte) 118);
        pf.a(110);
        ef.a(27887);
        fg.a(-14138);
        fb.a(param0 ^ 30493);
        ak.a(119);
        kg.a(-1);
        ug.g(param0 ^ -13);
        bj.a(false);
        te.a(param0 ^ -18);
        sb.a((byte) 123);
        kj.b(false);
        ke.a(false);
        s.a((byte) 49);
        ij.c(-18515);
        gi.c((byte) -127);
        gh.b(8462);
        jd.a(-12814);
        rb.b(-2857);
        al.d(param0 ^ -59);
        rh.i(param0 - 222);
        ok.d((byte) -7);
        wd.p(35);
        hl.l(param0 ^ -66);
        ue.b(param0 ^ -18);
        ie.b(82);
        df.b();
        kf.b(-1688814815);
        ob.c((byte) -68);
        lg.b(16228);
        ki.a(49);
        hb.a(false);
        si.a((byte) 47);
        ff.a(-1);
        rf.a(0);
        hk.a(-88);
        dj.a(-60);
        ub.a((byte) 12);
        ca.a(118);
        ji.a((byte) -64);
        wl.d(-99);
        oc.a((byte) -63);
        bf.a((byte) -125);
        mh.d(-24011);
        uh.a((byte) 104);
        sa.b(true);
        lf.f((byte) -71);
        lb.n(-85);
        dg.a((byte) 16);
        nd.b(false);
        el.c(false);
        ua.j(param0 - 219);
        ed.j(param0 - 3726);
        di.c((byte) 73);
        ka.a(true);
        fe.j(-127);
        qk.a((byte) 40);
        vf.a();
        f.a((byte) 113);
        pi.b(param0 - 105);
        cj.e(4);
        qh.a(-51);
        fj.e((byte) 118);
        mc.b(false);
        aa.a((byte) -14);
        ga.a((byte) 72);
        rj.a((byte) 59);
        vh.g(32);
        ad.i(param0 ^ 104);
        qc.a(true);
        kl.a(119);
        ee.a(31399);
        hh.b((byte) 52);
        ti.c((byte) -121);
        ag.a(10);
        li.a((byte) 111);
        vk.d(2);
        dc.c((byte) 97);
        ne.a(-29615);
        dd.b(-3674);
        ql.c(42);
        ma.a((byte) -50);
        gl.j(-101);
        jf.d(640);
        sg.a(-8217);
        nk.d(23985);
        dh.d(-8);
        th.e(0);
        cf.d(29211);
        le.b(-128);
        nj.b(71);
        j.a(-75);
        ba.a((byte) 113);
        wa.d(param0 - 202);
        lc.j(112);
        bl.a(-113);
        ec.b((byte) -49);
        of.b(false);
        sc.a(param0 ^ 150);
        mk.a((byte) -3);
        r.d(-1);
        ei.e(73);
        qi.a(param0 ^ param0);
        va.c(20300);
        af.d((byte) -127);
        ui.h(256);
        l.g(param0 ^ 105);
        hd.d((byte) 69);
        ni.g(112);
        jb.a(-111);
        fi.d(param0 - 5759);
        ud.a(true);
        v.d(0);
        oi.a(-13);
        this.field_t = null;
    }

    public static void q(int param0) {
        field_C = null;
        if (param0 != -29224) {
          TrackController.q(36);
        }
        field_G = null;
        field_E = null;
        field_D = null;
    }

    final void a(boolean param0) {
        boolean discarded$0 = false;
        int stackIn_5_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_47_1 = false;
        int var2;
        int var3;
        dh var4;
        cf var5;
        int var2Lifetime1;
        var3 = field_F ? 1 : 0;
        ii.a((byte) -62);
        if (og.field_rb != null &&
          og.field_rb.field_b) {
          oj.a(-78);
          ed.a((byte) -94);
        }
        stackIn_5_1 = 103;
        stackIn_6_2 = (null != og.field_rb);
        this.a((byte) stackIn_5_1, stackIn_6_2);
        if (ag.field_e) {
          this.r(-23);
          ag.field_e = false;
        }
        if (ga.a(43)) {
          this.l(-122);
          if (ga.a(114)) {
            if (!ic.a(1)) {
              return;
            }
            discarded$0 = this.b(467, false);
            return;
          }
          if (!jj.s(109)) {
            il.field_e = sl.a(4, -124);
            vd.field_G = dh.a(5, -1, 0, 1);
          }
        }
        if (pf.field_T) {
          if (il.field_e == null) {
            if (vd.field_G == null) {
              if (!ag.b(116)) {
                if (!ob.g(-26998)) {
                  this.s(0);
                } else {
                  stackIn_47_1 = (null != og.field_rb);
                  var2 = this.b(stackIn_47_1, 119);
                  if (var2 == 1) {
                    if (og.field_rb != null) {
                      oj.a(-108);
                    }
                  } else {
                    if (var2 == 2) {
                      if (null != og.field_rb) {
                        oj.a(-84);
                      }
                      af.a(gd.b((byte) 77), (byte) -9);
                    }
                  }
                }
              } else {
                if (dd.field_o != 0) {
                  this.s(0);
                } else {
                  var2 = rk.s(-1);
                  if (var2 == 3) {
                    oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true, 18, 0, 0);
                  } else {
                    if (2 != var2) {
                      if (var2 == 4) {
                        ad.a(-4, -4, (byte) -110);
                      }
                    } else {
                      oj.a(-77);
                    }
                  }
                  if (!ag.b(45)) {
                    tk.field_p[ib.field_a].a(10412, true);
                  }
                }
              }
            } else {
              if (vd.field_G.field_k) {
                if (vd.field_G.field_m[0] > pc.field_i) {
                  pc.field_i = vd.field_G.field_m[0];
                }
                vd.field_G = null;
                mf.c((byte) 123);
              }
            }
          } else {
            if (il.field_e.field_j) {
              th.field_l = th.field_l | il.field_e.field_m;
              oe.field_e = oe.field_e & ~il.field_e.field_m;
              il.field_e = null;
              if (oe.field_e == 0 &&
                16 == ib.field_a) {
                ib.field_a = 11;
                sc.field_g = 11;
              }
            }
          }
        } else {
          od.a((byte) -116, ee.field_c);
          if (this.b(467, true)) {
            pf.field_T = true;
          }
        }
        if (param0) {
          return;
        }
        if (!jj.s(47)) {
          while (true) {
            var5 = (cf) (ka.field_d.b((byte) -105));
            if (var5 != null) {
              ti.a(4, (byte) 88, var5);
              continue;
            }
            break;
          }
          while (true) {
            var4 = (dh) (cd.field_h.b((byte) -111));
            if (var4 == null) {
              break;
            }
            ij.a(var4, 5, -126);
          }
        }
        if (pf.field_T &&
          null == ch.field_n) {
          fe.a(true, pf.field_P[0], 256);
        }
        while (ge.a(kg.field_b, param0)) {
          this.e((byte) 85);
        }
        me.a(-1, 0);
        if (fc.c(72)) {
          var2Lifetime1 = this.d((byte) 103);
          if (2 == var2Lifetime1) {
            hh.a(-28717);
          }
        }
    }

    public TrackController() {
    }

    private final void r(int param0) {
        if (null != ed.field_I) {
          vk.a(3, ed.field_I);
          ed.field_I = null;
          qi.d(58);
        }
        sg.field_a = mf.a(1, (byte) 119);
        sk.field_j = mf.a(2, (byte) 94);
        j.field_h = mf.a(3, (byte) 80);
        wl.field_l = mf.a(4, (byte) -36);
        lh.field_C = mf.a(5, (byte) 86);
        si.field_c = mf.a(6, (byte) -77);
        rl.field_D = mf.a(8, (byte) -29);
        if (param0 >= -8) {
          return;
        }
        o.a((byte) -46);
    }

    final void c(byte param0) {
        this.a(false, 0, 10, 12, 7, (byte) 3, 11, 9);
        nb var2 = new nb();
        var2.a(false, 128, 9);
        mf.a(15, true, 22050, rg.field_c, (java.awt.Component) ((Object) ki.field_f), var2);
        this.a(-1, true, true, false, true);
        int var3 = 10 / ((param0 - 61) / 61);
        j.field_a = 1;
        db.field_db = 5;
        sl.field_n = 0;
    }

    private final boolean b(int param0, boolean param1) {
        try {
          int[] array$6 = null;
          qj dupTemp$5 = null;
          qj dupTemp$0 = null;
          qj dupTemp$1 = null;
          qj dupTemp$2 = null;
          qj dupTemp$3 = null;
          qj dupTemp$4 = null;
          int stackIn_90_0 = 0;
          int stackIn_90_1 = 0;
          String stackIn_93_0 = null;
          boolean stackIn_146_0 = false;
          Throwable decompiledCaughtException = null;
          int var3 = 0;
          byte[] var3_ref_byte__ = null;
          byte[] var4_ref_byte__ = null;
          int var4 = 0;
          String var4_ref_String = null;
          ng[] var4_ref_ng__ = null;
          int var5 = 0;
          IOException var5_ref_IOException = null;
          oh var5_ref_oh = null;
          int var6 = 0;
          int[] var6_ref_int__ = null;
          int var7_int = 0;
          qj[] var7 = null;
          int var8 = 0;
          qj var8_ref_qj = null;
          qj var9 = null;
          qj var10 = null;
          qj var11 = null;
          qj var12 = null;
          qj var13 = null;
          qj var14 = null;
          qj var15 = null;
          qj var16 = null;
          qj var17 = null;
          int var18 = 0;
          int[] var19 = null;
          qj[] var20 = null;
          qj var21 = null;
          qj[] var22 = null;
          qj var23 = null;
          qj var24 = null;
          qj[] var25 = null;
          qj var26 = null;
          qj var27 = null;
          qj var28 = null;
          byte[] var30 = null;
          BufferedReader var32 = null;
          int[] var33 = null;
          byte[] var35 = null;
          byte[] var39 = null;
          byte[] var40 = null;
          qj var23Lifetime1;
          qj var23Lifetime2;
          int stackIn_90_0Lifetime1;
          int stackIn_90_1Lifetime1;
          int var7_intLifetime1;
          int var8Lifetime1;
          int var8Lifetime2;
          var18 = field_F ? 1 : 0;
          if (null != el.field_L) {
            if (el.field_L.c(111) &&
              el.field_L.b("basic", (byte) -3)) {
              if (!el.field_L.b("comic12", (byte) -3)) {
                ud.a(128, 3.0f, wf.a("comic12", fd.field_f, v.field_c, el.field_L, 43));
                return false;
              }
              if (!el.field_L.b("kartika13", (byte) -3)) {
                ud.a(param0 - 339, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, el.field_L, param0 - 431));
                return false;
              }
              if (!fb.field_b.b("comic12", (byte) -3)) {
                ud.a(param0 ^ 339, 3.0f, wf.a("comic12", fd.field_f, v.field_c, fb.field_b, param0 ^ 399));
                return false;
              }
              if (!fb.field_b.b("kartika13", (byte) -3)) {
                ud.a(128, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, fb.field_b, 62));
                return false;
              }
              if (rl.field_D.c(param0 - 374) &&
                rl.field_D.a((byte) 48)) {
                if (ui.a(0, true) && (!sg.field_a.c(-115) ||
                  !sg.field_a.b("halloween", (byte) -3))) {
                  ud.a(param0 ^ 339, 11.0f, wf.a("halloween", sa.field_K, gj.field_e, sg.field_a, param0 ^ 479));
                  return false;
                }
                if (sg.field_a.c(91) &&
                  sg.field_a.b("", (byte) -3)) {
                  if (sg.field_a.c(106) &&
                    sg.field_a.b("", (byte) -3)) {
                    if (si.field_c.c(-109) &&
                      si.field_c.a((byte) 48)) {
                      if (j.field_h.c(96) &&
                        j.field_h.a((byte) 48)) {
                        if (wl.field_l.c(121) &&
                          wl.field_l.a((byte) 48) &&
                          lh.field_C.c(param0 - 357) &&
                          lh.field_C.a((byte) 48)) {
                          if (sk.field_j.c(-73) &&
                            sk.field_j.a((byte) 48)) {
                            ud.a(param0 ^ 339, 70.0f, cg.field_d);
                            if (!param1) {
                              return false;
                            }
                            mf.c((byte) 114);
                            this.a(160);
                            vj.field_a = ab.a("basic", -15383, "unachieved", el.field_L);
                            ei.a(vj.field_a, -1);
                            ii.field_p = ab.a("basic", -15383, "locked", el.field_L);
                            ei.a(ii.field_p, -1);
                            dc.field_p = ab.a("basic", -15383, "orbcoin", el.field_L);
                            var3_ref_byte__ = si.field_c.a("", param0 ^ -468, "tcfont");
                            var4_ref_ng__ = ie.a("", sg.field_a, "tcfont", param0 - 341);
                            var5_ref_oh = (oh) ((Object) ma.a(6488064, (byte) -123, 2, var4_ref_ng__, var3_ref_byte__, 15252224));
                            bk.field_E = var5_ref_oh;
                            var33 = ((de) (var5_ref_oh)).field_M[0];
                            var19 = var33;
                            var6_ref_int__ = var19;
                            if (9 > ((de) (var5_ref_oh)).field_M.length) {
                              ((de) ((Object) var5_ref_oh)).field_M = new int[9][];
                            }
                            ((de) (var5_ref_oh)).field_M[0] = var33;
                            for (var7_int = 1; var7_int < 9; var7_int++) {
                              array$6 = new int[var33.length];
                              ((de) (var5_ref_oh)).field_M[var7_int] = array$6;
                              pd.a(var6_ref_int__, 0, ((de) (var5_ref_oh)).field_M[var7_int], 0, var33.length);
                            }
                            ((de) (var5_ref_oh)).field_M[1][1] = 8110658;
                            ((de) (var5_ref_oh)).field_M[2][1] = 4473924;
                            ((de) (var5_ref_oh)).field_M[2][2] = 12303291;
                            ((de) (var5_ref_oh)).field_M[3][1] = 12303291;
                            ((de) (var5_ref_oh)).field_M[4][1] = 16711680;
                            ((de) (var5_ref_oh)).field_M[5][1] = 16767035;
                            ((de) (var5_ref_oh)).field_M[6][1] = 16777215;
                            ((de) (var5_ref_oh)).field_M[7][1] = 16711680;
                            ((de) (var5_ref_oh)).field_M[8][1] = 15252224;
                            ((de) (var5_ref_oh)).field_M[8][2] = 0;
                            ba.field_b = (oh) ((Object) uk.a("comic12", el.field_L, fb.field_b, "", 8));
                            re.field_c = (oh) ((Object) uk.a("kartika13", el.field_L, fb.field_b, "", -43));
                            el.field_L = null;
                            fb.field_b = null;
                            qi.d(71);
                            return false;
                          }
                          ud.a(param0 - 339, 65.0f, wf.a("", ob.field_w, wa.field_j, sk.field_j, 4));
                          return false;
                        }
                        ud.a(128, 50.0f, mk.a(0, wl.field_l, wa.field_j, ob.field_w, (byte) 117));
                        return false;
                      }
                      ud.a(128, 40.0f, wf.a("", fc.field_f, ql.field_q, j.field_h, 23));
                      return false;
                    }
                    ud.a(param0 - 339, 31.0f, wf.a("", fd.field_f, v.field_c, si.field_c, param0 - 394));
                    return false;
                  }
                  ud.a(128, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 119));
                  return false;
                }
                ud.a(param0 - 339, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 91));
                return false;
              }
              ud.a(128, 6.0f, wf.a("", lf.field_W, ei.field_k, rl.field_D, param0 - 413));
              return false;
            }
            ud.a(128, 2.0f, wf.a("basic", sa.field_K, gj.field_e, el.field_L, param0 ^ 413));
            return false;
          }
          if (sg.field_a == null) {
            if (null != j.field_h) {
              ud.a(param0 ^ 339, 75.0f, ld.field_a);
              this.a(160);
              od.field_d = new jc(j.field_h, lh.field_C);
              va.field_d[0] = cc.a(j.field_h, "", "track_wrong_password").b();
              va.field_d[1] = cc.a(j.field_h, "", "track_correct_password").b();
              va.field_d[2] = cc.a(j.field_h, "", "track_train_loop").b();
              va.field_d[3] = cc.a(j.field_h, "", "track_train_whistle").b();
              va.field_d[4] = cc.a(j.field_h, "", "track_train_fade").b();
              va.field_d[6] = cc.a(j.field_h, "", "track_blockpush_1").b();
              va.field_d[7] = cc.a(j.field_h, "", "track_blockconnect").b();
              va.field_d[5] = va.field_d[7];
              va.field_d[8] = cc.a(j.field_h, "", "track_footstep_1_and_2").b();
              va.field_d[9] = cc.a(j.field_h, "", "track_slide_4").b();
              va.field_d[10] = cc.a(j.field_h, "", "score_count").b();
              nd.field_G[10] = 48;
              va.field_d[11] = cc.a(j.field_h, "", "block_disconnect_placeholder").b();
              va.field_d[12] = cc.a(j.field_h, "", "cannot_push_placeholder").b();
              var39 = va.field_d[10].field_j;
              var35 = new byte[oa.field_h * 5 / 50];
              var30 = var35;
              var4_ref_byte__ = var30;
              for (var5 = 0; var5 < var39.length; var5++) {
                var4_ref_byte__[var5] = var39[var5];
              }
              va.field_d[10] = new ik(oa.field_h, var4_ref_byte__, 0, var35.length);
              for (var5 = 0; var5 < 13; var5++) {
                if (nd.field_G[var5] == 0) {
                  nd.field_G[var5] = 96;
                }
              }
              j.field_h = null;
              qi.d(-123);
              return false;
            }
            if (sk.field_j != null) {
              ud.a(128, 80.0f, ji.field_e);
              this.a(160);
              pf.field_P[0] = wb.a(sk.field_j, "", "track controller titlescreen");
              pf.field_P[1] = wb.a(sk.field_j, "", "track controller new");
              pf.field_P[2] = wb.a(sk.field_j, "", "track controller level complete");
              pf.field_P[3] = wb.a(sk.field_j, "", "track controller game over");
              sk.field_j = null;
              qi.d(param0 - 359);
              return false;
            }
            if (null != wl.field_l) {
              for (var3 = 0; var3 < 4; var3++) {
                stackIn_146_0 = fj.field_P.a(wl.field_l, (byte) -27, 176400, od.field_d, pf.field_P[var3]);
                if (!stackIn_146_0) {
                  return false;
                }
              }
              fj.field_P.b(true);
              od.field_d = null;
              wl.field_l = null;
              qi.d(param0 ^ 399);
              return false;
            }
            if (da.field_p[1][0] == null) {
              ud.a(128, 95.0f, rj.field_f);
              this.a(160);
              var3 = 208;
              for (var4 = 1; 32 > var4; var4++) {
                var5 = var4 * 65536 / 32;
                for (var6 = 0; var6 < 4; var6++) {
                  da.field_p[var4][var6] = new qj(26, 26);
                  da.field_p[var4][var6].a();
                  da.field_p[0][var6].a(var3, var3, var3, var3, var5, 4096);
                  da.field_p[32 + var4][var6] = new qj(26, 26);
                  da.field_p[var4 + 32][var6].a();
                  da.field_p[32][var6].a(var3, var3, var3, var3, var5, 4096);
                }
              }
              ia.field_b.a(-91);
              qi.d(param0 - 438);
              return false;
            }
            if (param0 != 467) {
              TrackController.q(109);
            }
            if (null != rl.field_D) {
              mj.a(208);
              gj.field_f = new ea[31];
              var40 = rl.field_D.a("", param0 ^ -468, "levels.txt");
              var32 = new BufferedReader((Reader) ((Object) new InputStreamReader((InputStream) ((Object) new ByteArrayInputStream(var40)))));
              try {
                for (var5 = 0; 31 > var5; var5++) {
                  gj.field_f[var5] = new ea(1 + var5, var32.readLine());
                }
                var32.close();
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_IOException = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException();
              }
              tk.field_p = new mg[17];
              qh.field_b = gj.field_f[0];
              rl.field_D = null;
              for (var5 = 0; var5 < 17; var5++) {
                tk.field_p[var5] = new mg(this, var5);
              }
              if (jj.s(125)) {
                ib.field_a = 0;
                sc.field_g = 0;
              } else {
                ib.field_a = 1;
                sc.field_g = 1;
              }
              ti.a(-123, 50);
              fe.a(true, pf.field_P[0], 256);
              rk.r(13);
            }
            qi.d(54);
            return true;
          }
          var3 = bk.field_E.field_u + bk.field_E.field_G;
          mc.field_E = new qj(var3, var3);
          mc.field_E.a();
          dc.field_p.a(0, 0, var3, var3);
          dc.field_p = null;
          ia.field_b.a(-91);
          bb.field_b = ib.a(10, "", sg.field_a, "achievements");
          var20 = bb.field_b;
          for (var5 = 0; var5 < var20.length; var5++) {
            var21 = var20[var5];
            var23 = var21;
            var23Lifetime2 = var21;
            ei.a(var21, -1);
          }
          na.field_c = ab.a("", -15383, "bgtile", sg.field_a);
          cd.field_c = new qj(640, 480);
          cd.field_c.a();
          for (var4 = 0; var4 < 480; var4 = var4 + na.field_c.field_v) {
            for (var5 = 0; var5 < 640; var5 = var5 + na.field_c.field_s) {
              na.field_c.h(var5, var4);
            }
          }
          ll.b(20, 30, 600, 383, 3894145, 11980506);
          ll.f(0, 0, 640, 480, 0);
          ab.a("", -15383, "titlescreen2", sg.field_a).e(0, 0);
          ia.field_b.a(-91);
          nd.field_L = ib.a(10, "", sg.field_a, "frame");
          gb.field_l = ib.a(param0 - 457, "", sg.field_a, "buttonframe");
          aa.field_a = ib.a(10, "", sg.field_a, "buttonframe38");
          for (var4 = 0; var4 < 9; var4++) {
            nd.field_L[var4].field_s = nd.field_L[var4].field_t;
            nd.field_L[var4].field_v = nd.field_L[var4].field_q;
            gb.field_l[var4].field_s = gb.field_l[var4].field_t;
            gb.field_l[var4].field_v = gb.field_l[var4].field_q;
          }
          ii.field_r = ib.a(10, "", sg.field_a, "tiles");
          ha.field_m = new qj[9];
          ha.field_m[4] = ii.field_r[0];
          var4 = 0;
          while (var4 < 9) {
            stackIn_90_0 = var4;
            stackIn_90_1 = 4;
            if (stackIn_90_0 != stackIn_90_1) {
              ha.field_m[var4] = nd.field_L[var4].b();
              ha.field_m[var4].a();
              var5 = 0;
              var6 = 0;
              var7_intLifetime1 = 2;
              if (0 == var4 % 3) {
                var5 = -2 + ll.field_d;
              }
              if (3 > var4) {
                var6 = ll.field_k - 2;
              }
              var8 = 2;
              if (var4 % 3 == 1) {
                var7_intLifetime1 = ll.field_d;
              }
              if (3 == var4 ||
                5 == var4) {
                var8 = ll.field_k;
              }
              ll.c(var5, var6, var7_intLifetime1, var8, 9073738);
            }
            var4++;
          }
          stackIn_90_0Lifetime1 = 0;
          stackIn_90_1Lifetime1 = 1;
          if (ui.a(stackIn_90_0Lifetime1, stackIn_90_1Lifetime1 != 0)) {
            stackIn_93_0 = "halloween";
          } else {
            stackIn_93_0 = "";
          }
          var4_ref_String = stackIn_93_0;
          var22 = ib.a(10, var4_ref_String, sg.field_a, "man");
          da.field_p = new qj[64][4];
          pd.a(var22, 0, da.field_p[0], 0, 4);
          pd.a(var22, 4, da.field_p[32], 0, 4);
          j.field_b = ib.a(param0 ^ 473, var4_ref_String, sg.field_a, "man_face");
          hk.field_a = ib.a(10, "", sg.field_a, "smoke");
          kg.field_e = ib.a(10, "", sg.field_a, "tickbox");
          var25 = ib.a(10, "", sg.field_a, "titlebg");
          var7 = ib.a(10, "", sg.field_a, "titles");
          al.field_z = new qj[1 + var7.length];
          for (var8Lifetime1 = 0; var7.length > var8Lifetime1; var8Lifetime1++) {
            var23Lifetime1 = var7[var8Lifetime1];
            dupTemp$5 = new qj(var23Lifetime1.field_s, var23Lifetime1.field_v);
            al.field_z[var8Lifetime1] = dupTemp$5;
            var24 = dupTemp$5;
            var24.a();
            cl.a(var25, 0, var23Lifetime1.field_v, 0, var23Lifetime1.field_s, 4);
            var23Lifetime1.e(0, 0);
          }
          var8_ref_qj = ab.a("", -15383, "titlegameach", sg.field_a);
          dupTemp$0 = new qj(var8_ref_qj.field_s, var8_ref_qj.field_v);
          al.field_z[var7.length] = dupTemp$0;
          var26 = dupTemp$0;
          var26.a();
          cl.a(var25, 0, var8_ref_qj.field_v, 0, var8_ref_qj.field_s, param0 ^ 471);
          var8_ref_qj.e(0, 0);
          fd.field_d = ab.a("", -15383, "exhibit", sg.field_a);
          var8Lifetime2 = ba.field_b.field_G + 26;
          dupTemp$1 = new qj(156, var8Lifetime2);
          ai.field_a = dupTemp$1;
          var27 = dupTemp$1;
          var9 = var27;
          dupTemp$2 = new qj(156, var8Lifetime2);
          al.field_t = dupTemp$2;
          var28 = dupTemp$2;
          var10 = var28;
          dupTemp$3 = new qj(156, var8Lifetime2);
          bf.field_o = dupTemp$3;
          var11 = dupTemp$3;
          dupTemp$4 = new qj(156, var8Lifetime2);
          vl.field_K = dupTemp$4;
          var12 = dupTemp$4;
          var13 = var9;
          var14 = var10;
          var12.field_r = 467;
          var15 = var11;
          var15.field_r = 467;
          var14.field_r = 467;
          var13.field_r = 467;
          var10.field_o = 138;
          var16 = var9;
          var16.field_o = 138;
          var17 = var11;
          var12.field_o = 178;
          var17.field_o = 178;
          var27.a();
          cl.a(aa.field_a, 0, var8Lifetime2, 0, 156, 4);
          bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 0, -1);
          ba.field_b.b(bl.field_d, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
          var28.a();
          cl.a(aa.field_a, 0, var8Lifetime2, 0, 156, 4);
          bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 1, -1);
          ba.field_b.b(bl.field_d, 78, bk.field_E.field_G + ba.field_b.field_G, 15252224, -1);
          var11.a();
          cl.a(aa.field_a, 0, var8Lifetime2, 0, 156, 4);
          bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 0, -1);
          ba.field_b.b(th.field_i, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
          var12.a();
          cl.a(aa.field_a, 0, var8Lifetime2, 0, 156, 4);
          bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 1, -1);
          ba.field_b.b(th.field_i, 78, bk.field_E.field_G + ba.field_b.field_G, 15252224, -1);
          ia.field_b.a(-91);
          sg.field_a = null;
          qi.d(param0 - 407);
          return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_G = new ud();
        field_E = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_C = "Continue";
    }
}
