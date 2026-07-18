/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.awt.Canvas;

public final class SolKnight extends ab {
    static fg field_D;
    private static da field_I;
    static volatile int field_G;
    static int[] field_K;
    static int[] field_E;
    public static boolean field_L;

    final void f(int param0) {
        L0: {
          int discarded$13 = 0;
          s.n();
          if (null == dj.field_k) {
            if (param0 == -1) {
              break L0;
            } else {
              int discarded$14 = this.b(-29, true);
              break L0;
            }
          } else {
            qk.d(param0 ^ -14996);
            if (param0 == -1) {
              break L0;
            } else {
              int discarded$15 = this.b(-29, true);
              break L0;
            }
          }
        }
        int discarded$16 = 0;
        pk.c();
    }

    private final void m() {
        if (!(null == wc.field_b)) {
            int discarded$0 = 0;
            ue.a(wc.field_b);
            wc.field_b = null;
            int discarded$1 = 8192;
            mh.a();
        }
        fh.field_c = r.a(1, 89);
        wg.field_g = r.a(2, 74);
        qk.field_h = r.a(3, 125);
        ic.field_u = r.a(4, 109);
        qb.field_cb = r.a(5, 90);
        field_I = r.a(7, 124);
        nf.a(ai.field_b, -111, pl.field_d);
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        bl var5 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var4 = field_L ? 1 : 0;
          ja.b(200);
          if (dj.field_k == null) {
            break L0;
          } else {
            if (!dj.field_k.field_a) {
              break L0;
            } else {
              qk.d(14995);
              int discarded$17 = 80;
              vg.a();
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = -3;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (null == dj.field_k) {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((SolKnight) this).a(stackIn_6_1, stackIn_6_2 != 0);
          if (pd.field_c) {
            int discarded$18 = 1;
            this.m();
            pd.field_c = false;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (bl.a((byte) -81)) {
            ((SolKnight) this).c(true);
            if (bl.a((byte) -81)) {
              if (!bb.h(119)) {
                return;
              } else {
                int discarded$19 = this.b(0, false);
                return;
              }
            } else {
              if (!il.b(507)) {
                qa.field_q = kb.a(4, (byte) 106);
                break L3;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (na.field_b) {
            if (null != qa.field_q) {
              if (qa.field_q.field_k) {
                jl.field_d = jl.field_d & ~qa.field_q.field_m;
                ah.field_f = ah.field_f | qa.field_q.field_m;
                qa.field_q = null;
                int discarded$20 = 81;
                jg.a();
                int discarded$21 = 92;
                h.a();
                if (7 == kd.field_a) {
                  if (jl.field_d == 0) {
                    kd.field_a = 2;
                    gb.a(false, 2, -127);
                    if (!na.field_b) {
                      break L4;
                    } else {
                      if (ua.field_I.d(144)) {
                        break L4;
                      } else {
                        pk.a((byte) -96, 0, true);
                        break L4;
                      }
                    }
                  } else {
                    if (!na.field_b) {
                      break L4;
                    } else {
                      if (ua.field_I.d(144)) {
                        break L4;
                      } else {
                        pk.a((byte) -96, 0, true);
                        break L4;
                      }
                    }
                  }
                } else {
                  if (!na.field_b) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      pk.a((byte) -96, 0, true);
                      break L4;
                    }
                  }
                }
              } else {
                if (!na.field_b) {
                  break L4;
                } else {
                  if (ua.field_I.d(144)) {
                    break L4;
                  } else {
                    pk.a((byte) -96, 0, true);
                    break L4;
                  }
                }
              }
            } else {
              if (!sg.b((byte) -104)) {
                if (!gg.b((byte) 89)) {
                  int discarded$22 = -108;
                  this.h();
                  if (!na.field_b) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      pk.a((byte) -96, 0, true);
                      break L4;
                    }
                  }
                } else {
                  if (!na.field_b) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      pk.a((byte) -96, 0, true);
                      break L4;
                    }
                  }
                }
              } else {
                L5: {
                  if (je.field_d != 0) {
                    int discarded$23 = -108;
                    this.h();
                    break L5;
                  } else {
                    int discarded$24 = 119;
                    var2 = ad.c();
                    if (var2 == 2) {
                      qk.d(14995);
                      break L5;
                    } else {
                      if (var2 == 3) {
                        ta.a(false, 320, w.field_b, 2, ug.field_g.field_s + ug.field_g.field_F, (mg) (Object) ug.field_g, 8, ad.field_b.field_s + ad.field_b.field_F, ad.field_b.field_F, w.field_b, 8, 240, (mg) (Object) ad.field_b, ug.field_g.field_F, true);
                        break L5;
                      } else {
                        if (var2 != 4) {
                          break L5;
                        } else {
                          bb.a((byte) -14, -2, 0);
                          break L5;
                        }
                      }
                    }
                  }
                }
                if (!sg.b((byte) -106)) {
                  vd.field_d[kd.field_a].b(true, 3367);
                  if (!na.field_b) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      pk.a((byte) -96, 0, true);
                      break L4;
                    }
                  }
                } else {
                  if (!na.field_b) {
                    break L4;
                  } else {
                    if (ua.field_I.d(144)) {
                      break L4;
                    } else {
                      pk.a((byte) -96, 0, true);
                      break L4;
                    }
                  }
                }
              }
            }
          } else {
            L6: {
              ta.a((byte) 61, cl.field_n);
              var2 = this.b(0, true);
              if (pb.field_c == var2) {
                break L6;
              } else {
                int discarded$25 = 8192;
                mh.a();
                break L6;
              }
            }
            if (var2 == ng.field_d) {
              if (!na.field_b) {
                break L4;
              } else {
                if (ua.field_I.d(144)) {
                  break L4;
                } else {
                  pk.a((byte) -96, 0, true);
                  break L4;
                }
              }
            } else {
              if (!na.field_b) {
                break L4;
              } else {
                if (ua.field_I.d(144)) {
                  break L4;
                } else {
                  pk.a((byte) -96, 0, true);
                  break L4;
                }
              }
            }
          }
        }
        L7: {
          if (!il.b(507)) {
            L8: while (true) {
              var5 = (bl) (Object) w.field_a.a(0);
              if (var5 != null) {
                int discarded$26 = -7471;
                sj.a(4, var5);
                continue L8;
              } else {
                break L7;
              }
            }
          } else {
            break L7;
          }
        }
        L9: while (true) {
          int discarded$27 = 122;
          if (!lf.a(ef.field_b)) {
            L10: {
              qf.a(0, 0);
              var2 = 0;
              if (qc.a(34)) {
                var3 = ((SolKnight) this).g(0);
                if (var3 == 2) {
                  var2 = 1;
                  if (var2 == 0) {
                    break L10;
                  } else {
                    int discarded$28 = 240;
                    int discarded$29 = 2;
                    aa.a(ad.field_b.field_F, (byte) -93, (mg) (Object) ad.field_b, ug.field_g.field_F - -ug.field_g.field_s, 8, w.field_b, 320, 8, ad.field_b.field_F + ad.field_b.field_s, (mg) (Object) ug.field_g, w.field_b, ug.field_g.field_F);
                    break L10;
                  }
                } else {
                  if (var2 == 0) {
                    break L10;
                  } else {
                    int discarded$30 = 240;
                    int discarded$31 = 2;
                    aa.a(ad.field_b.field_F, (byte) -93, (mg) (Object) ad.field_b, ug.field_g.field_F - -ug.field_g.field_s, 8, w.field_b, 320, 8, ad.field_b.field_F + ad.field_b.field_s, (mg) (Object) ug.field_g, w.field_b, ug.field_g.field_F);
                    break L10;
                  }
                }
              } else {
                if (var2 == 0) {
                  break L10;
                } else {
                  int discarded$32 = 240;
                  int discarded$33 = 2;
                  aa.a(ad.field_b.field_F, (byte) -93, (mg) (Object) ad.field_b, ug.field_g.field_F - -ug.field_g.field_s, 8, w.field_b, 320, 8, ad.field_b.field_F + ad.field_b.field_s, (mg) (Object) ug.field_g, w.field_b, ug.field_g.field_F);
                  break L10;
                }
              }
            }
            var3 = 55 % ((51 - param0) / 39);
            return;
          } else {
            ((SolKnight) this).d(true);
            continue L9;
          }
        }
    }

    final void c(byte param0) {
        SolKnight.n(2325);
        int discarded$0 = 25850;
        hc.a();
        int discarded$1 = 3327;
        ak.b();
        int discarded$2 = 1;
        qh.b();
        int discarded$3 = -5045;
        pl.a();
        int discarded$4 = 113;
        eb.a();
        int discarded$5 = -40;
        rg.a();
        int discarded$6 = -99;
        ab.e();
        int discarded$7 = 125;
        ve.a();
        dh.d((byte) -41);
        na.a(-13357);
        int discarded$8 = 18609;
        lf.b();
        mi.c();
        da.b(-127);
        mg.a();
        int discarded$9 = 84;
        bk.a();
        int discarded$10 = 1;
        vc.a();
        int discarded$11 = -11;
        gb.f();
        je.a((byte) 64);
        int discarded$12 = -26497;
        cj.b();
        int discarded$13 = 1;
        ah.a();
        int discarded$14 = 92;
        mh.b();
        int discarded$15 = 1;
        dd.b();
        kh.a(true);
        int discarded$16 = -11709;
        b.a();
        int discarded$17 = 0;
        hf.b();
        k.a(-23354);
        uc.a(99);
        int discarded$18 = 0;
        wc.a();
        rj.b(0);
        int discarded$19 = 0;
        pd.a();
        int discarded$20 = 95;
        gl.c();
        int discarded$21 = 56;
        me.a();
        int discarded$22 = 101;
        ie.a();
        int discarded$23 = 117;
        ek.a();
        int discarded$24 = -128;
        nc.d();
        int discarded$25 = 0;
        va.b();
        int discarded$26 = 3;
        ae.b();
        ne.b(30731);
        int discarded$27 = 1;
        hb.b();
        int discarded$28 = 84;
        ad.a();
        gj.e();
        int discarded$29 = 103;
        mf.g();
        se.b(false);
        gg.b(12516);
        qd.a(4);
        hg.a(8192);
        oi.c();
        lh.d(-94);
        int discarded$30 = 127;
        rd.a();
        int discarded$31 = 123;
        sf.a();
        ma.c(true);
        int discarded$32 = 53;
        w.a();
        int discarded$33 = -121;
        d.a();
        int discarded$34 = 57;
        vd.a();
        kk.a(-1);
        ja.a((byte) -43);
        int discarded$35 = 0;
        ha.a();
        kg.a(false);
        int discarded$36 = 8355711;
        wd.a();
        int discarded$37 = 127;
        pg.b();
        he.a(false);
        jc.a(1731);
        i.a((byte) 30);
        int discarded$38 = 6;
        jk.n();
        int discarded$39 = 121;
        lb.m();
        int discarded$40 = -1;
        s.m();
        int discarded$41 = -107;
        ci.g();
        int discarded$42 = 0;
        rf.e();
        ig.e((byte) -102);
        int discarded$43 = 97;
        bb.a();
        int discarded$44 = 60;
        ga.h();
        mb.b(-694484242);
        int discarded$45 = -63;
        aj.a();
        sl.b();
        tc.a();
        fe.a();
        int discarded$46 = 2;
        u.b();
        int discarded$47 = -114;
        ch.a();
        int discarded$48 = 109;
        id.a();
        db.c(false);
        ec.d(-1);
        int discarded$49 = -20542;
        ph.a();
        ub.a(37);
        int discarded$50 = 1;
        lk.a();
        ac.a(-15180);
        int discarded$51 = 4;
        ed.a();
        wa.a(-2);
        int discarded$52 = -55;
        wb.a();
        int discarded$53 = 74;
        la.a();
        int discarded$54 = -122;
        r.c();
        int discarded$55 = 103;
        ti.a();
        sb.a((byte) -90);
        int discarded$56 = 0;
        ea.d();
        int discarded$57 = -113;
        hl.a();
        int discarded$58 = -74;
        ic.i();
        bi.a((byte) 102);
        int discarded$59 = 80;
        md.i();
        int discarded$60 = 0;
        lg.b();
        sg.c(119);
        int discarded$61 = -126;
        qj.a();
        sk.h(-106);
        int discarded$62 = -104;
        pf.a();
        nf.n(-1);
        int discarded$63 = 0;
        af.c();
        hk.c();
        int discarded$64 = -78;
        ai.a();
        int discarded$65 = -87;
        cf.a();
        int discarded$66 = -18662;
        uh.a();
        vh.a(false);
        int discarded$67 = 58;
        eh.a();
        int discarded$68 = -102;
        ji.a();
        cg.a(-24856);
        kd.a((byte) -95);
        int discarded$69 = 95;
        l.a();
        int discarded$70 = 0;
        jj.f();
        int discarded$71 = -86;
        jh.c();
        wk.a(-127);
        og.a(65);
        int discarded$72 = 0;
        qg.a();
        int var2 = -89 / ((-28 - param0) / 59);
        int discarded$73 = 94;
        rk.a();
        gi.a();
        int discarded$74 = -37;
        hj.b();
        int discarded$75 = 7;
        di.a();
        int discarded$76 = -108;
        fl.a();
        int discarded$77 = 50;
        bj.a();
        int discarded$78 = 0;
        td.a();
        int discarded$79 = 1;
        ql.e();
        int discarded$80 = 1;
        sj.a();
        int discarded$81 = -25616;
        jf.a();
        rc.e(-24922);
        int discarded$82 = 85;
        pj.h();
        int discarded$83 = 126;
        si.i();
        int discarded$84 = 73;
        ld.k();
        kf.i(112);
        int discarded$85 = 0;
        ki.d();
        int discarded$86 = 103;
        gd.a();
        mj.a((byte) 11);
        ba.f(71);
        cd.a(8192);
        int discarded$87 = 255;
        oc.a();
        int discarded$88 = -97;
        v.a();
        h.a(-94);
        int discarded$89 = 14;
        ta.b();
        int discarded$90 = 58;
        fh.a();
        int discarded$91 = 100;
        ug.b();
        cb.a(-107);
        int discarded$92 = -108;
        dk.e();
        int discarded$93 = 768;
        oa.b();
        int discarded$94 = 1;
        uj.a();
        int discarded$95 = -120;
        ee.a();
        fi.a(-18120);
        fc.a((byte) 124);
        int discarded$96 = -6960;
        g.a();
        int discarded$97 = -61;
        ke.d();
        int discarded$98 = -80;
        qb.f();
        int discarded$99 = 106;
        vg.i();
        int discarded$100 = 87;
        gf.f();
        int discarded$101 = 113;
        c.d();
        int discarded$102 = -88;
        ua.e();
        int discarded$103 = 2;
        kj.a();
        int discarded$104 = 110;
        kc.a();
        int discarded$105 = -124;
        pk.j();
        int discarded$106 = 22722;
        tg.a();
        int discarded$107 = 30514;
        a.g();
        nb.a(19161);
        qe.i(-28528);
        be.a(-3);
        int discarded$108 = 54;
        hh.a();
        tj.a();
        fb.a(true);
        int discarded$109 = -14275;
        vk.c();
        int discarded$110 = 0;
        f.b();
        int discarded$111 = 1;
        of.a();
        int discarded$112 = 0;
        bc.c();
        th.j(114);
        ff.a(255);
        ii.a(7903);
        ik.b((byte) -61);
        pe.f(99);
        tk.i(123);
        int discarded$113 = -25904;
        qk.c();
        int discarded$114 = -15739;
        ok.a();
        int discarded$115 = 5;
        n.a();
        int discarded$116 = 0;
        jl.a();
        int discarded$117 = -114;
        sd.a();
        int discarded$118 = 0;
        qc.b();
        int discarded$119 = 1;
        fa.a();
        int discarded$120 = 5010;
        ud.a();
        int discarded$121 = 0;
        m.a();
        int discarded$122 = -1;
        gh.d();
        int discarded$123 = 0;
        ri.a();
        int discarded$124 = 22645;
        uf.e();
        bg.f(-24631);
        pb.a(83);
        int discarded$125 = 45;
        te.a();
        int discarded$126 = -77;
        dj.a();
        int discarded$127 = 0;
        rh.b();
        int discarded$128 = 0;
        ib.a();
        int discarded$129 = 0;
        bl.a();
        int discarded$130 = 11051;
        ef.a();
        wg.a(true);
        int discarded$131 = 1;
        ce.b();
        int discarded$132 = 15;
        kb.a();
        int discarded$133 = -116;
        sa.a();
        int discarded$134 = -127;
        lj.a();
        int discarded$135 = -115;
        fg.a();
        int discarded$136 = 2113536;
        il.c();
        vb.d(20364);
        jb.b(22174);
        ng.a(0);
        fj.a(-13);
        lc.a(-53);
        int discarded$137 = -26923;
        wi.a();
        int discarded$138 = 0;
        ob.b();
        int discarded$139 = 119;
        bf.a();
        le.a(-3390);
        int discarded$140 = 8191;
        uk.j();
        int discarded$141 = 82;
        dc.e();
        int discarded$142 = 1;
        qa.a();
        cl.e((byte) -123);
        int discarded$143 = 732;
        el.h();
        int discarded$144 = 25817;
        wh.a();
        li.a(26333);
        int discarded$145 = 10351;
        qf.a();
        int discarded$146 = 350;
        wf.f();
        int discarded$147 = -121;
        pc.a();
        ((SolKnight) this).field_x = null;
    }

    public final void init() {
        ((SolKnight) this).a("solknight", 11, 8);
    }

    private final int b(int param0, boolean param1) {
        int var3 = 0;
        o var3_ref_o = null;
        o[] var4 = null;
        int var5_int = 0;
        o var5 = null;
        int var6 = 0;
        o var6_ref_o = null;
        o var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        o var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        o var15 = null;
        int var16 = 0;
        o var17 = null;
        o[] var18 = null;
        o var19 = null;
        var16 = field_L ? 1 : 0;
        int discarded$31 = -128;
        kb.b();
        if (null != wg.field_g) {
          L0: {
            if (!pl.field_d.c((byte) -121)) {
              break L0;
            } else {
              if (pl.field_d.a(2, "basic")) {
                L1: {
                  if (!wg.field_g.c((byte) -121)) {
                    break L1;
                  } else {
                    if (wg.field_g.b(true)) {
                      L2: {
                        if (!qk.field_h.c((byte) -121)) {
                          break L2;
                        } else {
                          if (!qk.field_h.b(true)) {
                            break L2;
                          } else {
                            L3: {
                              if (!ic.field_u.c((byte) -121)) {
                                break L3;
                              } else {
                                if (ic.field_u.b(true)) {
                                  L4: {
                                    if (!qb.field_cb.c((byte) -121)) {
                                      break L4;
                                    } else {
                                      if (qb.field_cb.b(true)) {
                                        L5: {
                                          if (!fh.field_c.c((byte) -121)) {
                                            break L5;
                                          } else {
                                            if (fh.field_c.b(true)) {
                                              L6: {
                                                if (!field_I.c((byte) -121)) {
                                                  break L6;
                                                } else {
                                                  if (field_I.b(true)) {
                                                    a.a((byte) 102, ug.field_e, 65.0f);
                                                    ((SolKnight) this).a(-11633);
                                                    if (!param1) {
                                                      return pb.field_c;
                                                    } else {
                                                      int discarded$32 = 81;
                                                      jg.a();
                                                      qc.field_s = new me(wg.field_g, qk.field_h);
                                                      bf.field_b[0] = sl.a(qk.field_h, "", "combo_power").c();
                                                      bf.field_b[1] = sl.a(qk.field_h, "", "mega_power").c();
                                                      bf.field_b[2] = ra.a(wg.field_g, "", "load_weapon").b();
                                                      bf.field_b[3] = ra.a(wg.field_g, "", "rocket_launcher").b();
                                                      bf.field_b[4] = ra.a(wg.field_g, "", "explosion").b();
                                                      bf.field_b[5] = ra.a(wg.field_g, "", "laser").b();
                                                      bf.field_b[6] = ra.a(wg.field_g, "", "asteroid_proximity").b();
                                                      bf.field_b[7] = ra.a(wg.field_g, "", "scatter_separates").b();
                                                      bf.field_b[8] = ra.a(wg.field_g, "", "homing_missile_launch").b();
                                                      bf.field_b[9] = ra.a(wg.field_g, "", "nuke_explode").b();
                                                      bf.field_b[10] = ra.a(wg.field_g, "", "nuke_load").b();
                                                      bf.field_b[11] = ra.a(wg.field_g, "", "railgun_fire_and_load").b();
                                                      bf.field_b[12] = ra.a(wg.field_g, "", "planet_explode").b();
                                                      bf.field_b[13] = ra.a(wg.field_g, "", "menu_mouseover").b();
                                                      bf.field_b[14] = ra.a(wg.field_g, "", "menu_select").b();
                                                      bf.field_b[15] = ra.a(wg.field_g, "", "scatter_launcher").b();
                                                      bf.field_b[16] = ra.a(wg.field_g, "", "laser_impact_burn").b();
                                                      bf.field_b[17] = ra.a(wg.field_g, "", "plasma_fire").b();
                                                      bf.field_b[18] = ra.a(wg.field_g, "", "plasma_charge").b();
                                                      bf.field_b[19] = ra.a(wg.field_g, "", "fusion_charge").b();
                                                      bf.field_b[20] = ra.a(wg.field_g, "", "fusion_fire").b();
                                                      bf.field_b[21] = ra.a(wg.field_g, "", "asteroid_tiny_rotate").b();
                                                      bf.field_b[22] = ra.a(wg.field_g, "", "asteroid_small_rotate").b();
                                                      bf.field_b[23] = ra.a(wg.field_g, "", "asteroid_medium_rotate").b();
                                                      bf.field_b[24] = ra.a(wg.field_g, "", "asteroid_large_rotate").b();
                                                      bf.field_b[25] = ra.a(wg.field_g, "", "asteroid_huge_rotate").b();
                                                      bf.field_b[26] = ra.a(wg.field_g, "", "explosion_huge").b();
                                                      bf.field_b[27] = ra.a(wg.field_g, "", "explosion_large").b();
                                                      bf.field_b[28] = ra.a(wg.field_g, "", "explosion_medium").b();
                                                      bf.field_b[29] = ra.a(wg.field_g, "", "explosion_small").b();
                                                      bf.field_b[30] = ra.a(wg.field_g, "", "explosion_tiny").b();
                                                      bf.field_b[31] = ra.a(wg.field_g, "", "railgun_impact").b();
                                                      bf.field_b[32] = ra.a(wg.field_g, "", "plasma_impact").b();
                                                      bf.field_b[33] = ra.a(wg.field_g, "", "plasma_impact_upgraded").b();
                                                      bf.field_b[34] = ra.a(wg.field_g, "", "nuke_explode_upgraded").b();
                                                      bf.field_b[35] = ra.a(wg.field_g, "", "sol_sword").b();
                                                      wg.field_g = null;
                                                      qk.field_h = null;
                                                      return fc.field_o;
                                                    }
                                                  } else {
                                                    break L6;
                                                  }
                                                }
                                              }
                                              int discarded$33 = 0;
                                              a.a((byte) 102, ab.a(field_I, qb.field_bb, ri.field_d, ""), 60.0f);
                                              return pb.field_c;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        int discarded$34 = 0;
                                        a.a((byte) 102, ab.a(fh.field_c, vb.field_i, r.field_e, ""), 50.0f);
                                        return pb.field_c;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  int discarded$35 = 0;
                                  a.a((byte) 102, ab.a(qb.field_cb, th.field_L, je.field_b, ""), 40.0f);
                                  return pb.field_c;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            a.a((byte) 102, ok.a(0, -18884, je.field_b, ic.field_u, th.field_L), 30.0f);
                            return pb.field_c;
                          }
                        }
                      }
                      int discarded$36 = 0;
                      a.a((byte) 102, ab.a(qk.field_h, l.field_b, rd.field_a, ""), 20.0f);
                      return pb.field_c;
                    } else {
                      break L1;
                    }
                  }
                }
                int discarded$37 = 0;
                a.a((byte) 102, ab.a(wg.field_g, l.field_b, rd.field_a, ""), 10.0f);
                return pb.field_c;
              } else {
                break L0;
              }
            }
          }
          int discarded$38 = 0;
          a.a((byte) 102, ab.a(pl.field_d, vb.field_i, r.field_e, "basic"), 3.0f);
          return pb.field_c;
        } else {
          if (qb.field_cb == null) {
            if (null == ic.field_u) {
              if (pl.field_d != null) {
                a.a((byte) 102, kj.field_N, 90.0f);
                ((SolKnight) this).a(-11633);
                jc.field_b = rb.a("unachieved", "basic", pl.field_d, (byte) -127);
                nb.field_a = rb.a("locked", "basic", pl.field_d, (byte) -117);
                u.field_c = rb.a("orbcoin", "basic", pl.field_d, (byte) -115);
                ef.a(124, jc.field_b);
                ef.a(115, nb.field_a);
                ef.a(123, u.field_c);
                pl.field_d = null;
                ai.field_b = null;
                return fc.field_o;
              } else {
                if (fh.field_c != null) {
                  ad.field_b = lc.a(fh.field_c, 1, "b24", "", field_I);
                  ug.field_g = lc.a(fh.field_c, 1, "b12", "", field_I);
                  td.field_e = ik.a(fh.field_c, -18362, "guns", "");
                  of.field_d = rb.a("husk", "", fh.field_c, (byte) -125);
                  uh.field_l = ik.a(fh.field_c, -18362, "stars", "");
                  wi.field_i = ik.a(fh.field_c, param0 + -18362, "asteroids", "");
                  hf.field_c = ik.a(fh.field_c, -18362, "ammo", "");
                  hj.field_n = rb.a("sword", "", fh.field_c, (byte) -124);
                  int discarded$39 = 72;
                  hj.field_p = eb.a(false, rb.a("shield_packed", "", fh.field_c, (byte) -127));
                  qd.field_f = ik.a(fh.field_c, -18362, "overlays", "");
                  o discarded$40 = rb.a("space", "", fh.field_c, (byte) -128);
                  ii.field_g = ik.a(fh.field_c, -18362, "explosion", "");
                  ua.field_F = ik.a(fh.field_c, -18362, "nukeexplosion", "");
                  ak.field_e = new o[8];
                  ak.field_e[0] = rb.a("pluto", "", fh.field_c, (byte) -123);
                  ak.field_e[1] = rb.a("neptune", "", fh.field_c, (byte) -110);
                  ak.field_e[2] = rb.a("uranus", "", fh.field_c, (byte) -127);
                  ak.field_e[3] = rb.a("saturn", "", fh.field_c, (byte) -125);
                  ak.field_e[4] = rb.a("jupiter", "", fh.field_c, (byte) -117);
                  ak.field_e[5] = rb.a("asteroid", "", fh.field_c, (byte) -113);
                  ak.field_e[6] = rb.a("mars", "", fh.field_c, (byte) -111);
                  ak.field_e[7] = rb.a("earth", "", fh.field_c, (byte) -125);
                  v.a(param0 ^ -98, ai.field_c, rb.a("mbfg", "", fh.field_c, (byte) -121));
                  int discarded$41 = -40;
                  rg.a(ik.a(fh.field_c, -18362, "mbsshots", ""));
                  ak.a(80, 0, ql.field_s, true, 16776960, ia.g(param0 + 113));
                  var17 = new o(152, 152);
                  var3_ref_o = var17;
                  var17.a();
                  ak.field_e[4].a(0, 0, 152, 152);
                  int discarded$42 = 5500;
                  int discarded$43 = 0;
                  ai.a(10, (mg) (Object) ug.field_g, 31, 132, 132, 16776960, -122, 10, var3_ref_o);
                  dd.field_c = ik.a(fh.field_c, param0 ^ -18362, "uberframe", "");
                  int discarded$44 = 31;
                  this.a(dd.field_c);
                  dd.field_c = null;
                  w.field_b = ik.a(fh.field_c, -18362, "buttonframe", "");
                  ii.field_f = ik.a(fh.field_c, -18362, "achievements", "");
                  var18 = ii.field_f;
                  var4 = var18;
                  var5_int = 0;
                  L7: while (true) {
                    if (var18.length <= var5_int) {
                      var19 = hj.field_p;
                      var5 = hj.field_n;
                      var6 = 316 * var19.field_q / var5.field_r;
                      o dupTemp$45 = new o(var6, 316);
                      h.field_b = dupTemp$45;
                      var7 = dupTemp$45;
                      var7.a();
                      var5.a(var6 + -(316 * var5.field_q / var5.field_r) >> 1, 0, var5.field_q * 316 / var5.field_r, 316);
                      var19.a(0, 3 * (316 + -(316 * var19.field_r / var5.field_r)) / 5, var6, var19.field_r * 316 / var5.field_r);
                      var8 = 40;
                      var9 = 191;
                      var10 = -8 + -(var8 * var7.field_q / var7.field_r) + var9;
                      var11 = new o(var9, var8);
                      var11.a();
                      var7.a(0, 0, var8 * var7.field_q / var7.field_r, var8);
                      var12 = var10 * qd.field_f[0].field_r / qd.field_f[0].field_q;
                      qd.field_f[0].a(var7.field_q * var8 / var7.field_r - -8, -var12 + var8 >> 1, var10, var12);
                      int discarded$46 = 0;
                      ah.a(var11);
                      var13 = ad.field_b.field_m;
                      pg.field_a = new o(var13, var13);
                      pg.field_a.a();
                      u.field_c.a(0, 0, var13, var13);
                      u.field_c = null;
                      eh.field_b = new o[ii.field_g.length];
                      var14 = 0;
                      L8: while (true) {
                        if (ii.field_g.length <= var14) {
                          hj.field_e.a(true);
                          fh.field_c = null;
                          field_I = null;
                          return fc.field_o;
                        } else {
                          var15 = ii.field_g[var14];
                          eh.field_b[var14] = new o(var15.field_p, var15.field_t);
                          eh.field_b[var14].a();
                          var15.d(-var15.field_s, -var15.field_n, 65793);
                          var15.c(-var15.field_s, -var15.field_n, 64);
                          mi.c(0, 0, mi.field_a, mi.field_d);
                          var14++;
                          continue L8;
                        }
                      }
                    } else {
                      var6_ref_o = var18[var5_int];
                      ef.a(param0 + 120, var6_ref_o);
                      var5_int++;
                      continue L7;
                    }
                  }
                } else {
                  int discarded$47 = -1;
                  jh.a();
                  var3 = param0;
                  L9: while (true) {
                    if (10 <= var3) {
                      kd.field_a = 0;
                      int discarded$48 = 50;
                      int discarded$49 = 24;
                      vh.a();
                      bj.a(50, -127);
                      nf.field_W = new int[500];
                      var3 = 0;
                      L10: while (true) {
                        if (nf.field_W.length <= var3) {
                          kh.field_d = 255;
                          pg.field_e = true;
                          return ng.field_d;
                        } else {
                          nf.field_W[var3] = -640 + bk.a(1280, jb.field_g, (byte) -108);
                          nf.field_W[1 + var3] = bk.a(720, jb.field_g, (byte) 69);
                          var3 += 2;
                          continue L10;
                        }
                      }
                    } else {
                      vd.field_d[var3] = new ie(var3);
                      var3++;
                      continue L9;
                    }
                  }
                }
              }
            } else {
              var3 = 0;
              L11: while (true) {
                if (6 <= var3) {
                  ua.field_I.b(true);
                  ic.field_u = null;
                  qc.field_s = null;
                  return fc.field_o;
                } else {
                  if (null != c.field_M[var3]) {
                    if (!ua.field_I.a(176400, c.field_M[var3], qc.field_s, ic.field_u, -122)) {
                      return fc.field_o;
                    } else {
                      var3++;
                      continue L11;
                    }
                  } else {
                    var3++;
                    continue L11;
                  }
                }
              }
            }
          } else {
            a.a((byte) 102, rf.field_E, 75.0f);
            ((SolKnight) this).a(param0 + -11633);
            c.field_M[0] = rl.a(qb.field_cb, "", "sol knight title");
            c.field_M[1] = rl.a(qb.field_cb, "", "sol_ingame_1");
            c.field_M[2] = rl.a(qb.field_cb, "", "sol_ingame_2");
            c.field_M[3] = rl.a(qb.field_cb, "", "sol_ingame_3");
            c.field_M[4] = rl.a(qb.field_cb, "", "sol knight gameover jingle");
            c.field_M[5] = rl.a(qb.field_cb, "", "sol knight victory jingle");
            qb.field_cb = null;
            return fc.field_o;
          }
        }
    }

    final void d(int param0) {
        ((SolKnight) this).a(0, false, 6, 9, true, 16, 10, 8);
        mf var2 = new mf();
        var2.d(-4474, 128, 9);
        dh.a(var2, (java.awt.Component) (Object) dc.field_q, true, (byte) -40, 22050, wh.field_c);
        hc.field_d = 16777088;
        if (param0 != -31680) {
            return;
        }
        rj.field_c = 16776960;
        pb.field_b = 16777215;
        ((SolKnight) this).a((byte) -38, true, false, false, false);
    }

    public SolKnight() {
    }

    private final void h() {
        int var2 = 0;
        int var3 = 0;
        var3 = field_L ? 1 : 0;
        if (0 == (bi.field_i & 1073741824)) {
          bi.field_i = bi.field_i + 2048;
          ic.field_t = ic.field_t + fa.field_f;
          return;
        } else {
          var2 = bk.a(bi.field_i >>> 11, jb.field_g, (byte) -102);
          bi.field_i = bi.field_i - (var2 << 11);
          ic.field_t = ic.field_t - fa.field_f * var2;
          return;
        }
    }

    final void a(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4_int = 0;
        la var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_67_1 = 0;
        jg stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        int stackOut_64_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_65_0 = 0;
        boolean stackOut_65_1 = false;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean stackOut_5_2 = false;
        L0: {
          var8 = field_L ? 1 : 0;
          if (dj.field_k != null) {
            stackOut_2_0 = dj.field_k;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = dc.field_q;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (!bl.a((byte) -81)) {
          if (na.field_b) {
            if (qa.field_q == null) {
              L1: {
                mi.e(-320 - wd.field_c, -si.field_E, 1280, 720, 0, il.field_e[kb.field_b]);
                kc.field_O = kc.field_O + 1;
                var3 = 0;
                if (nf.field_W.length >= kc.field_O) {
                  break L1;
                } else {
                  kc.field_O = 0;
                  break L1;
                }
              }
              var4_int = 0;
              if (param0 == -11633) {
                L2: while (true) {
                  if (var4_int >= nf.field_W.length) {
                    L3: {
                      if (kd.field_a == ri.field_f) {
                        if (kd.field_a == -1) {
                          int discarded$19 = -48;
                          d.a(true);
                          break L3;
                        } else {
                          vd.field_d[kd.field_a].d(582);
                          break L3;
                        }
                      } else {
                        if (16 > ua.field_H) {
                          if (kd.field_a == -1) {
                            int discarded$20 = -48;
                            d.a(false);
                            int discarded$21 = 0;
                            int discarded$22 = 0;
                            int discarded$23 = 256;
                            ll.a(1 + ua.field_H);
                            mi.a(0, 0, 640, 480, 16769381, ua.field_H << 4);
                            break L3;
                          } else {
                            vd.field_d[kd.field_a].d(582);
                            int discarded$24 = 0;
                            int discarded$25 = 0;
                            int discarded$26 = 256;
                            ll.a(1 + ua.field_H);
                            mi.a(0, 0, 640, 480, 16769381, ua.field_H << 4);
                            break L3;
                          }
                        } else {
                          if (ri.field_f != -1) {
                            vd.field_d[ri.field_f].d(582);
                            int discarded$27 = 0;
                            int discarded$28 = 0;
                            int discarded$29 = 256;
                            ll.a(1 + -ua.field_H + 32);
                            mi.a(0, 0, 640, 480, 16769381, 32 + -ua.field_H << 4);
                            break L3;
                          } else {
                            int discarded$30 = -48;
                            d.a(false);
                            int discarded$31 = 0;
                            int discarded$32 = 0;
                            int discarded$33 = 256;
                            ll.a(1 + -ua.field_H + 32);
                            mi.a(0, 0, 640, 480, 16769381, 32 + -ua.field_H << 4);
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      var4 = (la) (Object) lc.field_t.a((byte) 51);
                      if (var4 != null) {
                        var6 = wk.field_e;
                        if (var6 >= 70) {
                          if (var6 >= 220) {
                            var5 = var6 + 190;
                            var7 = ug.field_g.b(hb.field_m[var4.field_h]);
                            int discarded$34 = 2;
                            uj.a(60 + var7, 70, -60 + -var7 + 640 >> 1, gf.field_fb, var5);
                            ii.field_f[var4.field_h].e(304, 10 + ug.field_g.field_s + (ug.field_g.field_F + var5));
                            ug.field_g.a(hb.field_m[var4.field_h], 320, var5 - -ug.field_g.field_F - -8, 16776960, 1);
                            if (!sg.b((byte) -115)) {
                              break L4;
                            } else {
                              mi.a(0, 0, mi.field_a, mi.field_d);
                              ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                              break L4;
                            }
                          } else {
                            var5 = 410;
                            var7 = ug.field_g.b(hb.field_m[var4.field_h]);
                            int discarded$35 = 2;
                            uj.a(60 + var7, 70, -60 + -var7 + 640 >> 1, gf.field_fb, var5);
                            ii.field_f[var4.field_h].e(304, 10 + ug.field_g.field_s + (ug.field_g.field_F + var5));
                            ug.field_g.a(hb.field_m[var4.field_h], 320, var5 - -ug.field_g.field_F - -8, 16776960, 1);
                            if (!sg.b((byte) -115)) {
                              break L4;
                            } else {
                              mi.a(0, 0, mi.field_a, mi.field_d);
                              ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                              break L4;
                            }
                          }
                        } else {
                          var5 = 480 - var6;
                          var7 = ug.field_g.b(hb.field_m[var4.field_h]);
                          int discarded$36 = 2;
                          uj.a(60 + var7, 70, -60 + -var7 + 640 >> 1, gf.field_fb, var5);
                          ii.field_f[var4.field_h].e(304, 10 + ug.field_g.field_s + (ug.field_g.field_F + var5));
                          ug.field_g.a(hb.field_m[var4.field_h], 320, var5 - -ug.field_g.field_F - -8, 16776960, 1);
                          if (!sg.b((byte) -115)) {
                            break L4;
                          } else {
                            mi.a(0, 0, mi.field_a, mi.field_d);
                            ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                            break L4;
                          }
                        }
                      } else {
                        if (!sg.b((byte) -115)) {
                          break L4;
                        } else {
                          mi.a(0, 0, mi.field_a, mi.field_d);
                          ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (je.field_d == 0) {
                        break L5;
                      } else {
                        var5 = ua.field_H * 256 / 32;
                        if (0 < var5) {
                          mi.a(0, 0, mi.field_a, mi.field_d, 0, var5);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      int discarded$37 = -94;
                      if (!lb.g()) {
                        break L6;
                      } else {
                        if (!sg.b((byte) -104)) {
                          L7: {
                            stackOut_64_0 = 25899;
                            stackIn_66_0 = stackOut_64_0;
                            stackIn_65_0 = stackOut_64_0;
                            if (null != dj.field_k) {
                              stackOut_66_0 = stackIn_66_0;
                              stackOut_66_1 = 1;
                              stackIn_67_0 = stackOut_66_0;
                              stackIn_67_1 = stackOut_66_1;
                              break L7;
                            } else {
                              stackOut_65_0 = stackIn_65_0;
                              stackOut_65_1 = wh.field_b;
                              stackIn_67_0 = stackOut_65_0;
                              stackIn_67_1 = stackOut_65_1 ? 1 : 0;
                              break L7;
                            }
                          }
                          ph.a(stackIn_67_0, stackIn_67_1 != 0);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    uf.a((byte) 99, 0, 0, (java.awt.Canvas) var2);
                    return;
                  } else {
                    L8: {
                      var3++;
                      if (var3 >= 5) {
                        var3 = 0;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var5 = 320 + (-wd.field_c + nf.field_W[var4_int]);
                      var6 = -si.field_E + nf.field_W[1 + var4_int];
                      var7 = var4_int + -kc.field_O;
                      if (-nf.field_W.length / 2 <= var7) {
                        break L9;
                      } else {
                        var7 = var7 + nf.field_W.length;
                        break L9;
                      }
                    }
                    L10: {
                      if (nf.field_W.length / 2 < var7) {
                        var7 = var7 - nf.field_W.length;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var7 >= 0) {
                        break L11;
                      } else {
                        var7 = -var7;
                        break L11;
                      }
                    }
                    L12: {
                      if (var7 > 255) {
                        var7 = 255;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    uh.field_l[var3].a(var5, var6, var7);
                    var4_int += 2;
                    continue L2;
                  }
                }
              } else {
                return;
              }
            } else {
              a.a((byte) 102, bg.field_t, 100.0f);
              ih.a(20753, (java.awt.Canvas) var2);
              return;
            }
          } else {
            ih.a(param0 ^ -31842, (java.awt.Canvas) var2);
            return;
          }
        } else {
          L13: {
            stackOut_4_0 = var2;
            stackOut_4_1 = 105;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (dj.field_k != null) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L13;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = wh.field_b;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2 ? 1 : 0;
              break L13;
            }
          }
          nc.a((java.awt.Canvas) (Object) stackIn_7_0, stackIn_7_1, stackIn_7_2 != 0);
          return;
        }
    }

    public static void n(int param0) {
        field_K = null;
        if (param0 != 2325) {
            SolKnight.n(-100);
        }
        field_D = null;
        field_E = null;
        field_I = null;
    }

    private final void a(o[] param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        o var3_ref = null;
        o var4 = null;
        o var5 = null;
        o var6 = null;
        o var7 = null;
        o var8 = null;
        o var9 = null;
        int var10 = 0;
        o[] var11 = null;
        int var12_int = 0;
        o var12 = null;
        o var13 = null;
        int var15_int = 0;
        o var15 = null;
        o var16 = null;
        int var16_int = 0;
        o var17 = null;
        o var18 = null;
        o var19 = null;
        o var20 = null;
        o var21 = null;
        o var22 = null;
        o var23 = null;
        o var24 = null;
        o var25 = null;
        o var26 = null;
        o var27 = null;
        o var28 = null;
        o var29 = null;
        o var30 = null;
        o var31 = null;
        int var32 = 0;
        o var33 = null;
        o var34 = null;
        o var35 = null;
        o var37 = null;
        o[] var39 = null;
        o var40 = null;
        o var41 = null;
        o var42 = null;
        int[] var47 = null;
        int[] var48 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var32 = field_L ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= param0.length) {
                var34 = param0[0];
                var3_ref = var34;
                int discarded$23 = 0;
                var4 = wc.a(var3_ref);
                int discarded$24 = 0;
                var35 = wc.a(var4);
                var6 = param0[2];
                int discarded$25 = 0;
                var7 = wc.a(var6);
                int discarded$26 = 0;
                var8 = wc.a(var7);
                int discarded$27 = 0;
                var9 = wc.a(var8);
                uk.field_k = param0[3];
                int discarded$28 = 0;
                int discarded$29 = 0;
                th.field_H = wc.a(wc.a(uk.field_k));
                h.field_d = new o[9];
                h.field_d[2] = var7;
                h.field_d[0] = var34;
                h.field_d[1] = param0[1];
                h.field_d[8] = var35;
                h.field_d[6] = var9;
                int discarded$30 = 0;
                h.field_d[5] = wc.a(h.field_d[1]);
                int discarded$31 = 0;
                h.field_d[7] = wc.a(h.field_d[5]);
                int discarded$32 = 0;
                h.field_d[3] = wc.a(h.field_d[7]);
                h.field_d[4] = new o(32, 32);
                var10 = 0;
                var47 = h.field_d[4].field_v;
                var12_int = 0;
                L2: while (true) {
                  if (var47.length <= var12_int) {
                    of.field_b = new o[9];
                    of.field_b[2] = var7;
                    of.field_b[0] = var6;
                    of.field_b[5] = h.field_d[5];
                    of.field_b[6] = var9;
                    of.field_b[4] = h.field_d[4];
                    of.field_b[7] = h.field_d[7];
                    of.field_b[8] = var8;
                    of.field_b[1] = h.field_d[1];
                    of.field_b[3] = h.field_d[3];
                    var39 = new o[param0.length];
                    var11 = var39;
                    var12_int = 0;
                    L3: while (true) {
                      if (var12_int >= param0.length) {
                        var12 = new o(29, 29);
                        o.a(var39[0], var12, 4, 0, 0, 0, 29, 29);
                        o.a(var39[0], var12, 0, 4, 0, 0, 10, 29);
                        int discarded$33 = 0;
                        var40 = wc.a(var12);
                        int discarded$34 = 0;
                        var41 = wc.a(var40);
                        int discarded$35 = 0;
                        var42 = wc.a(var41);
                        var16 = ig.a(var39[2], 30, 0, 0, 29, 29);
                        int discarded$36 = 0;
                        var17 = wc.a(var16);
                        int discarded$37 = 0;
                        var18 = wc.a(var17);
                        int discarded$38 = 0;
                        var19 = wc.a(var18);
                        var20 = var39[1];
                        int discarded$39 = 0;
                        var21 = wc.a(var20);
                        int discarded$40 = 0;
                        var22 = wc.a(var21);
                        int discarded$41 = 0;
                        var23 = wc.a(var22);
                        var24 = lb.a(var12.field_r + -var20.field_r, var20, 0, 0, 0, 0);
                        var25 = lb.a(0, var21, var40.field_q + -var21.field_q, 0, 0, 0);
                        var26 = lb.a(0, var22, 0, 0, 0, var41.field_r + -var22.field_r);
                        var27 = lb.a(0, var23, 0, var42.field_q + -var23.field_q, 0, 0);
                        var28 = ig.a(var16, 30, 0, 0, var39[1].field_t, var39[1].field_t);
                        int discarded$42 = 0;
                        var29 = wc.a(var28);
                        int discarded$43 = 0;
                        var30 = wc.a(var29);
                        int discarded$44 = 0;
                        var31 = wc.a(var30);
                        gf.field_fb = new o[9];
                        gf.field_fb[5] = var25;
                        gf.field_fb[2] = var40;
                        gf.field_fb[0] = var12;
                        gf.field_fb[3] = var27;
                        gf.field_fb[1] = var24;
                        gf.field_fb[6] = ig.a(var19, 30, var19.field_r + -var31.field_r, 0, var12.field_q, var31.field_r);
                        gf.field_fb[7] = var22;
                        gf.field_fb[8] = ig.a(var18, 30, var18.field_r - var31.field_r, 0, var40.field_q, var31.field_r);
                        dh.field_f = new o[9];
                        dh.field_f[0] = ig.a(var16, 30, 0, 0, var42.field_q, var29.field_r);
                        dh.field_f[3] = var27;
                        dh.field_f[7] = var26;
                        dh.field_f[2] = var29;
                        dh.field_f[1] = var20;
                        dh.field_f[6] = var42;
                        dh.field_f[5] = var21;
                        dh.field_f[8] = ig.a(var18, 30, 0, var18.field_q - var29.field_q, var29.field_q, var42.field_r);
                        le.field_d = new o[9];
                        le.field_d[0] = var28;
                        le.field_d[1] = var20;
                        le.field_d[2] = ig.a(var17, 30, 0, 0, var41.field_q, var28.field_r);
                        le.field_d[3] = var23;
                        le.field_d[5] = var25;
                        le.field_d[6] = ig.a(var19, 30, 0, 0, var28.field_q, var41.field_r);
                        le.field_d[8] = var41;
                        le.field_d[7] = dh.field_f[7];
                        break L0;
                      } else {
                        o dupTemp$45 = param0[var12_int].c();
                        var11[var12_int] = dupTemp$45;
                        var37 = dupTemp$45;
                        var13 = var37;
                        var48 = var37.field_v;
                        var15_int = 0;
                        L4: while (true) {
                          if (var15_int >= var48.length) {
                            var37.f();
                            var13.field_q = var37.field_p;
                            var13.field_r = var37.field_t;
                            var13.field_n = 0;
                            var15 = var13;
                            var15.field_s = 0;
                            var12_int++;
                            continue L3;
                          } else {
                            L5: {
                              var16_int = var48[var15_int];
                              if ((65535 & var16_int) != (var16_int >> 8 & 65535)) {
                                if (var16_int == 1) {
                                  var48[var15_int] = 0;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                var48[var15_int] = 0;
                                break L5;
                              }
                            }
                            var15_int++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var47[var12_int] = 1;
                    var12_int++;
                    continue L2;
                  }
                }
              } else {
                var33 = param0[var3_int];
                var4 = var33;
                var4.field_r = var33.field_t;
                var4.field_q = var33.field_p;
                var5 = var4;
                var4.field_n = 0;
                var5.field_s = 0;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("SolKnight.U(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + 31 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = new int[4];
        field_G = 0;
        field_D = new fg("");
    }
}
