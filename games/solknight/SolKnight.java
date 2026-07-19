/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class SolKnight extends ab {
    static fg field_D;
    private static da field_I;
    static volatile int field_G;
    static int[] field_K;
    static int[] field_E;
    public static boolean field_L;

    final void f(int param0) {
        int discarded$0 = 0;
        s.n(0);
        if (null != dj.field_k) {
            qk.d(param0 ^ -14996);
        }
        if (param0 != -1) {
            discarded$0 = this.b(-29, true);
        }
        pk.c(false);
    }

    private final void m(int param0) {
        if (!(null == wc.field_b)) {
            ue.a(wc.field_b, 0);
            wc.field_b = null;
            mh.a(param0 + 8191);
        }
        fh.field_c = r.a(param0, 89);
        wg.field_g = r.a(2, 74);
        qk.field_h = r.a(3, 125);
        ic.field_u = r.a(4, 109);
        qb.field_cb = r.a(5, 90);
        field_I = r.a(7, 124);
        nf.a(ai.field_b, -111, pl.field_d);
    }

    final void e(int param0) {
        int discarded$1 = 0;
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
        int stackIn_47_0 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
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
              vg.a((byte) 80);
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
          this.a(stackIn_6_1, stackIn_6_2 != 0);
          if (pd.field_c) {
            this.m(1);
            pd.field_c = false;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (bl.a((byte) -81)) {
            this.c(true);
            if (bl.a((byte) -81)) {
              if (!bb.h(119)) {
                return;
              } else {
                discarded$1 = this.b(0, false);
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
            L5: {
              if (null != qa.field_q) {
                if (qa.field_q.field_k) {
                  jl.field_d = jl.field_d & (qa.field_q.field_m ^ -1);
                  ah.field_f = ah.field_f | qa.field_q.field_m;
                  qa.field_q = null;
                  jg.a((byte) 81);
                  h.a((byte) 92);
                  if (7 == kd.field_a) {
                    if (-1 == (jl.field_d ^ -1)) {
                      kd.field_a = 2;
                      gb.a(false, 2, -127);
                      break L5;
                    } else {
                      break L5;
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
                  if (gg.b((byte) 89)) {
                    L6: {
                      if (dj.field_k == null) {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L6;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L6;
                      }
                    }
                    var2 = rk.a(stackIn_47_0 != 0, (byte) 20, (ab) (this));
                    if (-2364825 != (var2 ^ -1)) {
                      L7: {
                        if (1 == var2) {
                          break L7;
                        } else {
                          if (2 == var2) {
                            break L7;
                          } else {
                            if (!na.field_b) {
                              break L4;
                            } else {
                              if (!ua.field_I.d(144)) {
                                pk.a((byte) -96, 0, true);
                                break L4;
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
                        }
                      }
                      L8: {
                        if (dj.field_k == null) {
                          break L8;
                        } else {
                          qk.d(14995);
                          break L8;
                        }
                      }
                      if (2 == var2) {
                        he.a(-1, ia.g(-35));
                        break L5;
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
                      ig.h(-109);
                      break L5;
                    }
                  } else {
                    this.h((byte) -108);
                    break L5;
                  }
                } else {
                  L9: {
                    if (je.field_d != 0) {
                      this.h((byte) -108);
                      break L9;
                    } else {
                      var2 = ad.c(119);
                      if (var2 == 2) {
                        qk.d(14995);
                        break L9;
                      } else {
                        if ((var2 ^ -1) == -4) {
                          ta.a(false, 320, w.field_b, 2, ug.field_g.field_s + ug.field_g.field_F, ug.field_g, 8, ad.field_b.field_s + ad.field_b.field_F, ad.field_b.field_F, w.field_b, 8, 240, ad.field_b, ug.field_g.field_F, true);
                          break L9;
                        } else {
                          if ((var2 ^ -1) != -5) {
                            break L9;
                          } else {
                            bb.a((byte) -14, -2, 0);
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  if (!sg.b((byte) -106)) {
                    vd.field_d[kd.field_a].b(true, 3367);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
            }
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
            L10: {
              ta.a((byte) 61, cl.field_n);
              var2 = this.b(0, true);
              if (pb.field_c == var2) {
                break L10;
              } else {
                mh.a(8192);
                break L10;
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
        L11: {
          if (!il.b(507)) {
            L12: while (true) {
              var5 = (bl) ((Object) w.field_a.a(0));
              if (var5 != null) {
                sj.a(4, var5, -7471);
                continue L12;
              } else {
                break L11;
              }
            }
          } else {
            break L11;
          }
        }
        L13: while (true) {
          if (!lf.a(ef.field_b, 122)) {
            L14: {
              qf.a(0, 0);
              var2 = 0;
              if (qc.a(34)) {
                var3 = this.g(0);
                if (-3 == (var3 ^ -1)) {
                  var2 = 1;
                  break L14;
                } else {
                  break L14;
                }
              } else {
                break L14;
              }
            }
            L15: {
              if (var2 == 0) {
                break L15;
              } else {
                aa.a(ad.field_b.field_F, (byte) -93, ad.field_b, ug.field_g.field_F - -ug.field_g.field_s, 8, w.field_b, 320, 8, ad.field_b.field_F + ad.field_b.field_s, ug.field_g, w.field_b, ug.field_g.field_F, 2, 240);
                break L15;
              }
            }
            var3 = 55 % ((51 - param0) / 39);
            return;
          } else {
            this.d(true);
            continue L13;
          }
        }
    }

    final void c(byte param0) {
        SolKnight.n(2325);
        hc.a(25850);
        ak.b(3327);
        qh.b(1);
        pl.a(-5045);
        eb.a((byte) 113);
        rg.a((byte) -40);
        ab.e((byte) -99);
        ve.a((byte) 125);
        dh.d((byte) -41);
        na.a(-13357);
        lf.b(18609);
        mi.c();
        da.b(-127);
        mg.a();
        bk.a((byte) 84);
        vc.a(true);
        gb.f(-11);
        je.a((byte) 64);
        cj.b(-26497);
        ah.a(true);
        mh.b(92);
        dd.b(true);
        kh.a(true);
        b.a(-11709);
        hf.b(0);
        k.a(-23354);
        uc.a(99);
        wc.a(false);
        rj.b(0);
        pd.a(0);
        gl.c((byte) 95);
        me.a((byte) 56);
        ie.a((byte) 101);
        ek.a(117);
        nc.d((byte) -128);
        va.b((byte) 0);
        ae.b(3);
        ne.b(30731);
        hb.b(true);
        ad.a((byte) 84);
        gj.e();
        mf.g(103);
        se.b(false);
        gg.b(12516);
        qd.a(4);
        hg.a(8192);
        oi.c();
        lh.d(-94);
        rd.a(127);
        sf.a((byte) 123);
        ma.c(true);
        w.a((byte) 53);
        d.a(-121);
        vd.a((byte) 57);
        kk.a(-1);
        ja.a((byte) -43);
        ha.a(0);
        kg.a(false);
        wd.a(8355711);
        pg.b((byte) 127);
        he.a(false);
        jc.a(1731);
        i.a((byte) 30);
        jk.n(6);
        lb.m(121);
        s.m(-1);
        ci.g((byte) -107);
        rf.e(false);
        ig.e((byte) -102);
        bb.a((byte) 97);
        ga.h(60);
        mb.b(-694484242);
        aj.a((byte) -63);
        sl.b();
        tc.a();
        fe.a();
        u.b(2);
        ch.a(-114);
        id.a((byte) 109);
        db.c(false);
        ec.d(-1);
        ph.a(-20542);
        ub.a(37);
        lk.a(true);
        ac.a(-15180);
        ed.a(4);
        wa.a(-2);
        wb.a(-55);
        la.a((byte) 74);
        r.c(-122);
        ti.a(103);
        sb.a((byte) -90);
        ea.d(false);
        hl.a((byte) -113);
        ic.i(-74);
        bi.a((byte) 102);
        md.i(80);
        lg.b((byte) 0);
        sg.c(119);
        qj.a(-126);
        sk.h(-106);
        pf.a((byte) -104);
        nf.n(-1);
        af.c(0);
        hk.c();
        ai.a(-78);
        cf.a((byte) -87);
        uh.a(-18662);
        vh.a(false);
        eh.a((byte) 58);
        ji.a((byte) -102);
        cg.a(-24856);
        kd.a((byte) -95);
        l.a(95);
        jj.f(0);
        jh.c(-86);
        wk.a(-127);
        og.a(65);
        qg.a(false);
        int var2 = -89 / ((-28 - param0) / 59);
        rk.a((byte) 94);
        gi.a();
        hj.b((byte) -37);
        di.a(7);
        fl.a((byte) -108);
        bj.a(50);
        td.a(false);
        ql.e(1);
        sj.a(1);
        jf.a(-25616);
        rc.e(-24922);
        pj.h(85);
        si.i(126);
        ld.k(73);
        kf.i(112);
        ki.d(false);
        gd.a(103);
        mj.a((byte) 11);
        ba.f(71);
        cd.a(8192);
        oc.a(255);
        v.a((byte) -97);
        h.a(-94);
        ta.b((byte) 14);
        fh.a((byte) 58);
        ug.b(100);
        cb.a(-107);
        dk.e(-108);
        oa.b(768);
        uj.a(1);
        ee.a(-120);
        fi.a(-18120);
        fc.a((byte) 124);
        g.a(-6960);
        ke.d((byte) -61);
        qb.f((byte) -80);
        vg.i(106);
        gf.f((byte) 87);
        c.d((byte) 113);
        ua.e((byte) -88);
        kj.a(2);
        kc.a((byte) 110);
        pk.j(-124);
        tg.a(22722);
        a.g(30514);
        nb.a(19161);
        qe.i(-28528);
        be.a(-3);
        hh.a((byte) 54);
        tj.a();
        fb.a(true);
        vk.c(-14275);
        f.b(0);
        of.a(1);
        bc.c(false);
        th.j(114);
        ff.a(255);
        ii.a(7903);
        ik.b((byte) -61);
        pe.f(99);
        tk.i(123);
        qk.c(-25904);
        ok.a(-15739);
        n.a(5);
        jl.a(0);
        sd.a((byte) -114);
        qc.b(false);
        fa.a(true);
        ud.a(5010);
        m.a(0);
        gh.d(-1);
        ri.a(false);
        uf.e(22645);
        bg.f(-24631);
        pb.a(83);
        te.a((byte) 45);
        dj.a(-77);
        rh.b(0);
        ib.a(0);
        bl.a(0);
        ef.a(11051);
        wg.a(true);
        ce.b(true);
        kb.a((byte) 15);
        sa.a((byte) -116);
        lj.a((byte) -127);
        fg.a((byte) -115);
        il.c(2113536);
        vb.d(20364);
        jb.b(22174);
        ng.a(0);
        fj.a(-13);
        lc.a(-53);
        wi.a(-26923);
        ob.b(false);
        bf.a((byte) 119);
        le.a(-3390);
        uk.j(8191);
        dc.e((byte) 82);
        qa.a(true);
        cl.e((byte) -123);
        el.h(732);
        wh.a(25817);
        li.a(26333);
        qf.a(10351);
        wf.f(350);
        pc.a((byte) -121);
        this.field_x = null;
    }

    public final void init() {
        this.a("solknight", 11, 8);
    }

    private final int b(int param0, boolean param1) {
        o discarded$2 = null;
        o dupTemp$3 = null;
        int var3 = 0;
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
        o[] var18 = null;
        o var19 = null;
        o var20 = null;
        o var21 = null;
        var16 = field_L ? 1 : 0;
        kb.b((byte) -128);
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
                                                    this.a(-11633);
                                                    if (!param1) {
                                                      return pb.field_c;
                                                    } else {
                                                      jg.a((byte) 81);
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
                                              a.a((byte) 102, ab.a(field_I, qb.field_bb, ri.field_d, "", false), 60.0f);
                                              return pb.field_c;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        a.a((byte) 102, ab.a(fh.field_c, vb.field_i, r.field_e, "", false), 50.0f);
                                        return pb.field_c;
                                      } else {
                                        break L4;
                                      }
                                    }
                                  }
                                  a.a((byte) 102, ab.a(qb.field_cb, th.field_L, je.field_b, "", false), 40.0f);
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
                      a.a((byte) 102, ab.a(qk.field_h, l.field_b, rd.field_a, "", false), 20.0f);
                      return pb.field_c;
                    } else {
                      break L1;
                    }
                  }
                }
                a.a((byte) 102, ab.a(wg.field_g, l.field_b, rd.field_a, "", false), 10.0f);
                return pb.field_c;
              } else {
                break L0;
              }
            }
          }
          a.a((byte) 102, ab.a(pl.field_d, vb.field_i, r.field_e, "basic", false), 3.0f);
          return pb.field_c;
        } else {
          if (qb.field_cb == null) {
            if (null == ic.field_u) {
              if (pl.field_d != null) {
                a.a((byte) 102, kj.field_N, 90.0f);
                this.a(-11633);
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
                  hj.field_p = eb.a(false, rb.a("shield_packed", "", fh.field_c, (byte) -127), 72);
                  qd.field_f = ik.a(fh.field_c, -18362, "overlays", "");
                  discarded$2 = rb.a("space", "", fh.field_c, (byte) -128);
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
                  rg.a(ik.a(fh.field_c, -18362, "mbsshots", ""), -40);
                  ak.a(80, 0, ql.field_s, true, 16776960, ia.g(param0 + 113));
                  var19 = new o(152, 152);
                  var20 = var19;
                  var20.a();
                  ak.field_e[4].a(0, 0, 152, 152);
                  ai.a(10, ug.field_g, 31, 132, 132, 16776960, -122, 10, var20, 0, 5500);
                  dd.field_c = ik.a(fh.field_c, param0 ^ -18362, "uberframe", "");
                  this.a(dd.field_c, (byte) 31);
                  dd.field_c = null;
                  w.field_b = ik.a(fh.field_c, -18362, "buttonframe", "");
                  ii.field_f = ik.a(fh.field_c, -18362, "achievements", "");
                  var18 = ii.field_f;
                  var4 = var18;
                  var5_int = 0;
                  L7: while (true) {
                    if (var18.length <= var5_int) {
                      var21 = hj.field_p;
                      var5 = hj.field_n;
                      var6 = 316 * var21.field_q / var5.field_r;
                      dupTemp$3 = new o(var6, 316);
                      h.field_b = dupTemp$3;
                      var7 = dupTemp$3;
                      var7.a();
                      var5.a(var6 + -(316 * var5.field_q / var5.field_r) >> -1022422175, 0, var5.field_q * 316 / var5.field_r, 316);
                      var21.a(0, 3 * (316 + -(316 * var21.field_r / var5.field_r)) / 5, var6, var21.field_r * 316 / var5.field_r);
                      var8 = 40;
                      var9 = 191;
                      var10 = -8 + -(var8 * var7.field_q / var7.field_r) + var9;
                      var11 = new o(var9, var8);
                      var11.a();
                      var7.a(0, 0, var8 * var7.field_q / var7.field_r, var8);
                      var12 = var10 * qd.field_f[0].field_r / qd.field_f[0].field_q;
                      qd.field_f[0].a(var7.field_q * var8 / var7.field_r - -8, -var12 + var8 >> 1694759201, var10, var12);
                      ah.a(var11, false);
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
                  jh.a(-1);
                  var3 = param0;
                  L9: while (true) {
                    if (10 <= var3) {
                      kd.field_a = 0;
                      vh.a(24, 50);
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
            this.a(param0 + -11633);
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
        this.a(0, false, 6, 9, true, 16, 10, 8);
        mf var2 = new mf();
        var2.d(-4474, 128, 9);
        dh.a(var2, (java.awt.Component) ((Object) dc.field_q), true, (byte) -40, 22050, wh.field_c);
        hc.field_d = 16777088;
        if (param0 != -31680) {
            return;
        }
        rj.field_c = 16776960;
        pb.field_b = 16777215;
        this.a((byte) -38, true, false, false, false);
    }

    public SolKnight() {
    }

    private final void h(byte param0) {
        int fieldTemp$10 = 0;
        gg discarded$11 = null;
        int fieldTemp$12 = 0;
        gg discarded$13 = null;
        int fieldTemp$14 = 0;
        gg discarded$15 = null;
        int fieldTemp$16 = 0;
        gg discarded$17 = null;
        int fieldTemp$18 = 0;
        gg discarded$19 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = field_L ? 1 : 0;
          if (0 == (bi.field_i & 1073741824)) {
            bi.field_i = bi.field_i + 2048;
            ic.field_t = ic.field_t + fa.field_f;
            break L0;
          } else {
            var2 = bk.a(bi.field_i >>> 877718027, jb.field_g, (byte) -102);
            bi.field_i = bi.field_i - (var2 << 1394859723);
            ic.field_t = ic.field_t - fa.field_f * var2;
            break L0;
          }
        }
        if (param0 == -108) {
          L1: {
            if (wb.field_c != 0) {
              if (0 < (gb.field_j << 769508017) + lc.field_h) {
                lc.field_h = lc.field_h + (gb.field_j << -230779407);
                ic.field_t = ic.field_t + gb.field_j * ud.field_k;
                break L1;
              } else {
                ic.field_t = ic.field_t - gb.field_j * ud.field_k;
                lc.field_h = lc.field_h - (gb.field_j << 1342001681);
                break L1;
              }
            } else {
              break L1;
            }
          }
          L2: {
            if (je.field_d == 0) {
              L3: {
                if ((ve.field_b ^ -1) >= -1) {
                  break L3;
                } else {
                  ve.field_b = ve.field_b - 1;
                  if (ve.field_b == 385) {
                    mb.a(true, 35, 256);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (ve.field_b < 0) {
                  break L4;
                } else {
                  si.field_E = 240 - ve.field_b;
                  wd.field_c = -160;
                  if ((si.field_E ^ -1) > -1) {
                    si.field_E = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (0 < kh.field_d) {
                  kh.field_d = kh.field_d - 1;
                  kh.field_d = kh.field_d * 9 / 10;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (kd.field_a != ri.field_f) {
                  ua.field_H = ua.field_H + 1;
                  if (32 == ua.field_H) {
                    L7: {
                      if (-3 == (kd.field_a ^ -1)) {
                        kh.field_c = null;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (-9 != (kd.field_a ^ -1)) {
                        break L8;
                      } else {
                        if (9 != ri.field_f) {
                          break L8;
                        } else {
                          ah.field_f = 0;
                          jl.field_d = 0;
                          w.field_a.a(true);
                          break L8;
                        }
                      }
                    }
                    ua.field_H = 0;
                    kd.field_a = ri.field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  if ((kd.field_a ^ -1) != 0) {
                    vd.field_d[kd.field_a].c(0);
                    if (-1 != (kd.field_a ^ -1)) {
                      break L6;
                    } else {
                      hb.a(true);
                      break L6;
                    }
                  } else {
                    hb.a(true);
                    break L6;
                  }
                }
              }
              if (0 <= ve.field_b) {
                var4 = 1;
                var2 = var4;
                L9: while (true) {
                  if (nf.field_W.length > var4) {
                    nf.field_W[var4] = nf.field_W[var4] - 1;
                    if (nf.field_W[var4] < 0) {
                      nf.field_W[var4] = nf.field_W[var4] + 720;
                      var4 += 2;
                      continue L9;
                    } else {
                      var4 += 2;
                      continue L9;
                    }
                  } else {
                    if (lc.field_t.a((byte) 51) == null) {
                      break L2;
                    } else {
                      fieldTemp$10 = wk.field_e + 1;
                      wk.field_e = wk.field_e + 1;
                      if (290 != fieldTemp$10) {
                        break L2;
                      } else {
                        wk.field_e = 0;
                        discarded$11 = lc.field_t.a(0);
                        break L2;
                      }
                    }
                  }
                }
              } else {
                if (pg.field_e) {
                  if (lc.field_t.a((byte) 51) != null) {
                    fieldTemp$12 = wk.field_e + 1;
                    wk.field_e = wk.field_e + 1;
                    if (290 != fieldTemp$12) {
                      break L2;
                    } else {
                      wk.field_e = 0;
                      discarded$13 = lc.field_t.a(0);
                      break L2;
                    }
                  } else {
                    if (lc.field_t.a((byte) 51) == null) {
                      break L2;
                    } else {
                      fieldTemp$14 = wk.field_e + 1;
                      wk.field_e = wk.field_e + 1;
                      if (290 != fieldTemp$14) {
                        break L2;
                      } else {
                        wk.field_e = 0;
                        discarded$15 = lc.field_t.a(0);
                        break L2;
                      }
                    }
                  }
                } else {
                  if (lc.field_t.a((byte) 51) != null) {
                    fieldTemp$16 = wk.field_e + 1;
                    wk.field_e = wk.field_e + 1;
                    if (290 != fieldTemp$16) {
                      break L2;
                    } else {
                      wk.field_e = 0;
                      discarded$17 = lc.field_t.a(0);
                      break L2;
                    }
                  } else {
                    if (lc.field_t.a((byte) 51) == null) {
                      break L2;
                    } else {
                      fieldTemp$18 = wk.field_e + 1;
                      wk.field_e = wk.field_e + 1;
                      if (290 != fieldTemp$18) {
                        break L2;
                      } else {
                        wk.field_e = 0;
                        discarded$19 = lc.field_t.a(0);
                        break L2;
                      }
                    }
                  }
                }
              }
            } else {
              if (1 != je.field_d) {
                if ((je.field_d ^ -1) != -3) {
                  ua.field_H = ua.field_H - 1;
                  if (ua.field_H != 0) {
                    break L2;
                  } else {
                    je.field_d = 0;
                    break L2;
                  }
                } else {
                  L10: {
                    if (!il.b(507)) {
                      L11: {
                        if ((lk.field_e ^ -1) < -1) {
                          ah.b(true);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      kd.field_a = h.field_g;
                      if (kd.field_a != -2) {
                        break L10;
                      } else {
                        kd.field_a = 0;
                        ta.a(false, 320, w.field_b, 2, ug.field_g.field_s + ug.field_g.field_F, ug.field_g, 8, ad.field_b.field_F - -ad.field_b.field_s, ad.field_b.field_F, w.field_b, 8, 240, ad.field_b, ug.field_g.field_F, false);
                        break L10;
                      }
                    } else {
                      kd.field_a = me.field_b;
                      break L10;
                    }
                  }
                  ri.field_f = kd.field_a;
                  je.field_d = 3;
                  break L2;
                }
              } else {
                ua.field_H = ua.field_H + 1;
                if (ua.field_H == 32) {
                  L12: {
                    if (!sg.b((byte) -104)) {
                      nh.a((byte) 3);
                      break L12;
                    } else {
                      da.a(true);
                      break L12;
                    }
                  }
                  je.field_d = 2;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
          }
          return;
        } else {
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
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        jg stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_64_0 = 0;
        boolean stackOut_64_1 = false;
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
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = dc.field_q;
            stackIn_3_0 = stackOut_1_0;
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
                          d.a(true, (byte) -48);
                          break L3;
                        } else {
                          vd.field_d[kd.field_a].d(582);
                          break L3;
                        }
                      } else {
                        if (16 > ua.field_H) {
                          if (kd.field_a == -1) {
                            d.a(false, (byte) -48);
                            ll.a(1 + ua.field_H, 256, false, false);
                            mi.a(0, 0, 640, 480, 16769381, ua.field_H << 501270884);
                            break L3;
                          } else {
                            vd.field_d[kd.field_a].d(582);
                            ll.a(1 + ua.field_H, 256, false, false);
                            mi.a(0, 0, 640, 480, 16769381, ua.field_H << 501270884);
                            break L3;
                          }
                        } else {
                          if (0 != (ri.field_f ^ -1)) {
                            vd.field_d[ri.field_f].d(582);
                            ll.a(1 + -ua.field_H + 32, 256, false, false);
                            mi.a(0, 0, 640, 480, 16769381, 32 + -ua.field_H << 1694561444);
                            break L3;
                          } else {
                            d.a(false, (byte) -48);
                            ll.a(1 + -ua.field_H + 32, 256, false, false);
                            mi.a(0, 0, 640, 480, 16769381, 32 + -ua.field_H << 1694561444);
                            break L3;
                          }
                        }
                      }
                    }
                    L4: {
                      var4 = (la) ((Object) lc.field_t.a((byte) 51));
                      if (var4 != null) {
                        L5: {
                          var6 = wk.field_e;
                          if (-71 >= (var6 ^ -1)) {
                            if (var6 >= 220) {
                              var5 = var6 + 190;
                              break L5;
                            } else {
                              var5 = 410;
                              break L5;
                            }
                          } else {
                            var5 = 480 - var6;
                            break L5;
                          }
                        }
                        var7 = ug.field_g.b(hb.field_m[var4.field_h]);
                        uj.a(60 + var7, 70, -60 + -var7 + 640 >> 2079290817, gf.field_fb, var5, 2);
                        ii.field_f[var4.field_h].e(304, 10 + ug.field_g.field_s + (ug.field_g.field_F + var5));
                        ug.field_g.a(hb.field_m[var4.field_h], 320, var5 - -ug.field_g.field_F - -8, 16776960, 1);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L6: {
                      if (!sg.b((byte) -115)) {
                        break L6;
                      } else {
                        mi.a(0, 0, mi.field_a, mi.field_d);
                        ai.a(h.field_d, (byte) -83, h.field_d[0].field_t, h.field_d[0].field_p);
                        break L6;
                      }
                    }
                    L7: {
                      if (-1 == (je.field_d ^ -1)) {
                        break L7;
                      } else {
                        var5 = ua.field_H * 256 / 32;
                        if (0 < var5) {
                          mi.a(0, 0, mi.field_a, mi.field_d, 0, var5);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (!lb.g((byte) -94)) {
                        break L8;
                      } else {
                        if (!sg.b((byte) -104)) {
                          L9: {
                            stackOut_63_0 = 25899;
                            stackIn_65_0 = stackOut_63_0;
                            stackIn_64_0 = stackOut_63_0;
                            if (null != dj.field_k) {
                              stackOut_65_0 = stackIn_65_0;
                              stackOut_65_1 = 1;
                              stackIn_66_0 = stackOut_65_0;
                              stackIn_66_1 = stackOut_65_1;
                              break L9;
                            } else {
                              stackOut_64_0 = stackIn_64_0;
                              stackOut_64_1 = wh.field_b;
                              stackIn_66_0 = stackOut_64_0;
                              stackIn_66_1 = stackOut_64_1 ? 1 : 0;
                              break L9;
                            }
                          }
                          ph.a(stackIn_66_0, stackIn_66_1 != 0);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    uf.a((byte) 99, 0, 0, (java.awt.Canvas) (var2));
                    return;
                  } else {
                    L10: {
                      var3++;
                      if ((var3 ^ -1) <= -6) {
                        var3 = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      var5 = 320 + (-wd.field_c + nf.field_W[var4_int]);
                      var6 = -si.field_E + nf.field_W[1 + var4_int];
                      var7 = var4_int + -kc.field_O;
                      if (-nf.field_W.length / 2 <= var7) {
                        break L11;
                      } else {
                        var7 = var7 + nf.field_W.length;
                        break L11;
                      }
                    }
                    L12: {
                      if (nf.field_W.length / 2 < var7) {
                        var7 = var7 - nf.field_W.length;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (var7 >= 0) {
                        break L13;
                      } else {
                        var7 = -var7;
                        break L13;
                      }
                    }
                    L14: {
                      if (-256 > (var7 ^ -1)) {
                        var7 = 255;
                        break L14;
                      } else {
                        break L14;
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
              ih.a(20753, (java.awt.Canvas) (var2));
              return;
            }
          } else {
            ih.a(param0 ^ -31842, (java.awt.Canvas) (var2));
            return;
          }
        } else {
          L15: {
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
              break L15;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = wh.field_b;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2 ? 1 : 0;
              break L15;
            }
          }
          nc.a((java.awt.Canvas) ((Object) stackIn_7_0), stackIn_7_1, stackIn_7_2 != 0);
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

    private final void a(o[] param0, byte param1) {
        o dupTemp$1 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
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
        o var36 = null;
        o var38 = null;
        o[] var40 = null;
        o var41 = null;
        o var42 = null;
        o var43 = null;
        int[] var48 = null;
        int[] var49 = null;
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
                var35 = wc.a(var34, 0);
                var36 = wc.a(var35, 0);
                var6 = param0[2];
                var7 = wc.a(var6, 0);
                var8 = wc.a(var7, 0);
                var9 = wc.a(var8, 0);
                uk.field_k = param0[3];
                th.field_H = wc.a(wc.a(uk.field_k, 0), 0);
                h.field_d = new o[9];
                h.field_d[2] = var7;
                h.field_d[0] = var34;
                h.field_d[1] = param0[1];
                h.field_d[8] = var36;
                h.field_d[6] = var9;
                h.field_d[5] = wc.a(h.field_d[1], 0);
                h.field_d[7] = wc.a(h.field_d[5], 0);
                h.field_d[3] = wc.a(h.field_d[7], 0);
                h.field_d[4] = new o(32, 32);
                var10 = -106 % ((param1 - 77) / 40);
                var48 = h.field_d[4].field_v;
                var12_int = 0;
                L2: while (true) {
                  if (var48.length <= var12_int) {
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
                    var40 = new o[param0.length];
                    var11 = var40;
                    var12_int = 0;
                    L3: while (true) {
                      if (var12_int >= param0.length) {
                        var12 = new o(29, 29);
                        o.a(var40[0], var12, 4, 0, 0, 0, 29, 29);
                        o.a(var40[0], var12, 0, 4, 0, 0, 10, 29);
                        var41 = wc.a(var12, 0);
                        var42 = wc.a(var41, 0);
                        var43 = wc.a(var42, 0);
                        var16 = ig.a(var40[2], 30, 0, 0, 29, 29);
                        var17 = wc.a(var16, 0);
                        var18 = wc.a(var17, 0);
                        var19 = wc.a(var18, 0);
                        var20 = var40[1];
                        var21 = wc.a(var20, 0);
                        var22 = wc.a(var21, 0);
                        var23 = wc.a(var22, 0);
                        var24 = lb.a(var12.field_r + -var20.field_r, var20, 0, 0, 0, 0);
                        var25 = lb.a(0, var21, var41.field_q + -var21.field_q, 0, 0, 0);
                        var26 = lb.a(0, var22, 0, 0, 0, var42.field_r + -var22.field_r);
                        var27 = lb.a(0, var23, 0, var43.field_q + -var23.field_q, 0, 0);
                        var28 = ig.a(var16, 30, 0, 0, var40[1].field_t, var40[1].field_t);
                        var29 = wc.a(var28, 0);
                        var30 = wc.a(var29, 0);
                        var31 = wc.a(var30, 0);
                        gf.field_fb = new o[9];
                        gf.field_fb[5] = var25;
                        gf.field_fb[2] = var41;
                        gf.field_fb[0] = var12;
                        gf.field_fb[3] = var27;
                        gf.field_fb[1] = var24;
                        gf.field_fb[6] = ig.a(var19, 30, var19.field_r + -var31.field_r, 0, var12.field_q, var31.field_r);
                        gf.field_fb[7] = var22;
                        gf.field_fb[8] = ig.a(var18, 30, var18.field_r - var31.field_r, 0, var41.field_q, var31.field_r);
                        dh.field_f = new o[9];
                        dh.field_f[0] = ig.a(var16, 30, 0, 0, var43.field_q, var29.field_r);
                        dh.field_f[3] = var27;
                        dh.field_f[7] = var26;
                        dh.field_f[2] = var29;
                        dh.field_f[1] = var20;
                        dh.field_f[6] = var43;
                        dh.field_f[5] = var21;
                        dh.field_f[8] = ig.a(var18, 30, 0, var18.field_q - var29.field_q, var29.field_q, var43.field_r);
                        le.field_d = new o[9];
                        le.field_d[0] = var28;
                        le.field_d[1] = var20;
                        le.field_d[2] = ig.a(var17, 30, 0, 0, var42.field_q, var28.field_r);
                        le.field_d[3] = var23;
                        le.field_d[5] = var25;
                        le.field_d[6] = ig.a(var19, 30, 0, 0, var28.field_q, var42.field_r);
                        le.field_d[8] = var42;
                        le.field_d[7] = dh.field_f[7];
                        break L0;
                      } else {
                        dupTemp$1 = param0[var12_int].c();
                        var11[var12_int] = dupTemp$1;
                        var38 = dupTemp$1;
                        var13 = var38;
                        var49 = var38.field_v;
                        var15_int = 0;
                        L4: while (true) {
                          if (var15_int >= var49.length) {
                            var38.f();
                            var13.field_q = var38.field_p;
                            var13.field_r = var38.field_t;
                            var13.field_n = 0;
                            var15 = var13;
                            var15.field_s = 0;
                            var12_int++;
                            continue L3;
                          } else {
                            L5: {
                              var16_int = var49[var15_int];
                              if ((65535 & var16_int) != (var16_int >> 879831336 & 65535)) {
                                if (-2 == (var16_int ^ -1)) {
                                  var49[var15_int] = 0;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              } else {
                                var49[var15_int] = 0;
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
                    var48[var12_int] = 1;
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
            stackOut_20_0 = (RuntimeException) (var3);
            stackOut_20_1 = new StringBuilder().append("SolKnight.U(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    static {
        field_E = new int[4];
        field_G = 0;
        field_D = new fg("");
    }
}
