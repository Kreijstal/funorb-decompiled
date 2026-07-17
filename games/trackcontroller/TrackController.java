/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

public final class TrackController extends ch {
    static ud field_G;
    static qj[] field_D;
    static String[] field_E;
    static String field_C;
    public static boolean field_F;

    public final void init() {
        ((TrackController) this).a((byte) -123, "trackcontroller", 12);
    }

    private final void s() {
        int var2 = 0;
        int var3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_69_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var3 = field_F ? 1 : 0;
          if (dd.field_o == 0) {
            L1: {
              int fieldTemp$8 = na.field_b + 1;
              na.field_b = na.field_b + 1;
              if (fieldTemp$8 >= 0) {
                break L1;
              } else {
                L2: {
                  if (0 != rj.field_a) {
                    break L2;
                  } else {
                    if (ni.field_m[84]) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                na.field_b = 0;
                break L1;
              }
            }
            if (na.field_b >= 80) {
              L3: {
                L4: {
                  if (~ib.field_a != ~sc.field_g) {
                    break L4;
                  } else {
                    if (0 != id.field_g) {
                      break L4;
                    } else {
                      L5: {
                        if (ni.field_m[85]) {
                          g.field_p = g.field_p + 1;
                          break L5;
                        } else {
                          g.field_p = 0;
                          break L5;
                        }
                      }
                      if (ib.field_a != -1) {
                        tk.field_p[ib.field_a].c(-99);
                        if (null == ua.field_L) {
                          break L3;
                        } else {
                          if (!ua.field_L.c(-127)) {
                            break L3;
                          } else {
                            ua.field_L.a(false, 103);
                            break L0;
                          }
                        }
                      } else {
                        L6: {
                          if (ni.field_m[13]) {
                            L7: {
                              si.a((byte) -68, 5);
                              if (hk.field_d <= 0) {
                                stackOut_49_0 = 13;
                                stackIn_50_0 = stackOut_49_0;
                                break L7;
                              } else {
                                stackOut_48_0 = 12;
                                stackIn_50_0 = stackOut_48_0;
                                break L7;
                              }
                            }
                            sc.field_g = stackIn_50_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L8: {
                          if (ib.field_a != -1) {
                            break L8;
                          } else {
                            ua.field_L.a(true, 90);
                            break L8;
                          }
                        }
                        L9: while (true) {
                          int discarded$9 = 127;
                          if (!mh.e()) {
                            break L3;
                          } else {
                            continue L9;
                          }
                        }
                      }
                    }
                  }
                }
                L10: {
                  vl.n(-27145);
                  vg.field_p = true;
                  id.field_g = id.field_g + 1;
                  if (id.field_g == 31) {
                    if (sc.field_g != -2) {
                      if (sc.field_g != -1) {
                        L11: {
                          var2 = 0;
                          if (ib.field_a < 0) {
                            break L11;
                          } else {
                            if (~tk.field_p.length >= ~ib.field_a) {
                              break L11;
                            } else {
                              L12: {
                                if (!tk.field_p[ib.field_a].field_e.field_a) {
                                  stackOut_68_0 = 0;
                                  stackIn_69_0 = stackOut_68_0;
                                  break L12;
                                } else {
                                  stackOut_67_0 = 1;
                                  stackIn_69_0 = stackOut_67_0;
                                  break L12;
                                }
                              }
                              var2 = stackIn_69_0;
                              break L11;
                            }
                          }
                        }
                        tk.field_p[sc.field_g].a(10412, var2 != 0);
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      sc.field_g = -1;
                      ua.field_L.b(0);
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
                L13: {
                  if (id.field_g == 63) {
                    L14: {
                      if (ib.field_a == 11) {
                        g.field_w = null;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    id.field_g = 0;
                    ib.field_a = sc.field_g;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L15: while (true) {
                  int discarded$10 = 127;
                  if (!mh.e()) {
                    break L3;
                  } else {
                    continue L15;
                  }
                }
              }
              break L0;
            } else {
              he.field_f[ib.field_a].a(false, 83);
              break L0;
            }
          } else {
            if (1 != dd.field_o) {
              if (dd.field_o == 2) {
                L16: {
                  if (!jj.s(106)) {
                    L17: {
                      if (null == ua.field_L) {
                        break L17;
                      } else {
                        ua.field_L.g(122);
                        break L17;
                      }
                    }
                    ib.field_a = nf.field_e;
                    break L16;
                  } else {
                    ib.field_a = jh.field_a;
                    break L16;
                  }
                }
                L18: {
                  if (ib.field_a == -4) {
                    L19: {
                      if (jj.s(96)) {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L19;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L19;
                      }
                    }
                    ib.field_a = stackIn_21_0;
                    int discarded$11 = 0;
                    int discarded$12 = 0;
                    int discarded$13 = 18;
                    oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L20: {
                  if (ib.field_a == -3) {
                    if (jj.s(123)) {
                      ib.field_a = 15;
                      break L20;
                    } else {
                      if (oe.field_e != 0) {
                        ib.field_a = 16;
                        break L20;
                      } else {
                        if (ua.field_L.field_O != 0) {
                          ib.field_a = 11;
                          break L20;
                        } else {
                          sc.field_g = ib.field_a;
                          tk.field_p[sc.field_g].a(10412, false);
                          dd.field_o = 3;
                          break L0;
                        }
                      }
                    }
                  } else {
                    break L20;
                  }
                }
                sc.field_g = ib.field_a;
                tk.field_p[sc.field_g].a(10412, false);
                dd.field_o = 3;
                break L0;
              } else {
                id.field_g = id.field_g - 1;
                if (id.field_g == 0) {
                  dd.field_o = 0;
                  break L0;
                } else {
                  break L0;
                }
              }
            } else {
              vl.n(-27145);
              id.field_g = id.field_g + 1;
              if (id.field_g != 32) {
                break L0;
              } else {
                L21: {
                  if (ag.b(74)) {
                    int discarded$14 = -89;
                    te.a();
                    break L21;
                  } else {
                    int discarded$15 = 6;
                    v.e();
                    break L21;
                  }
                }
                dd.field_o = 2;
                break L0;
              }
            }
          }
        }
    }

    final void h(int param0) {
        fc.a(false);
        if (param0 != -24452) {
            ((TrackController) this).h(-78);
        }
        if (!(null == og.field_rb)) {
            oj.a(-111);
        }
        int discarded$0 = -18601;
        ei.d();
    }

    final void a(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        Object stackIn_3_0 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_54_0 = 0;
        java.awt.Canvas stackOut_2_0 = null;
        ih stackOut_1_0 = null;
        int stackOut_53_0 = 0;
        boolean stackOut_52_0 = false;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_6_1 = false;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        L0: {
          var6 = field_F ? 1 : 0;
          if (null == og.field_rb) {
            stackOut_2_0 = ki.field_f;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = og.field_rb;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var2 = var7;
        if (!ga.a(-122)) {
          if (param0 == 160) {
            if (!pf.field_T) {
              l.a((byte) 90, (java.awt.Canvas) var7);
              return;
            } else {
              L1: {
                if (il.field_e != null) {
                  break L1;
                } else {
                  if (null != vd.field_G) {
                    break L1;
                  } else {
                    L2: {
                      if (na.field_b < 80) {
                        cd.field_c.h(0, 0);
                        var3 = 640 * na.field_b / 160;
                        var4 = 480 * na.field_b / 160;
                        ll.e(320 + -var3, -var4 + 240, var3 + 320, 240 - -var4);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        int discarded$5 = -128;
                        db.a(480, 0, na.field_c, 640, 0);
                        gd.field_x = false;
                        if (~sc.field_g != ~ib.field_a) {
                          break L4;
                        } else {
                          L5: {
                            if (0 >= id.field_g) {
                              break L5;
                            } else {
                              if (dd.field_o != 0) {
                                break L5;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (ib.field_a == -1) {
                            ua.field_L.h(24661);
                            break L3;
                          } else {
                            tk.field_p[ib.field_a].b(-1);
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (id.field_g >= 32) {
                          L7: {
                            L8: {
                              if (-1 == sc.field_g) {
                                break L8;
                              } else {
                                if (sc.field_g != -2) {
                                  tk.field_p[sc.field_g].b(param0 + -161);
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            ua.field_L.h(24661);
                            break L7;
                          }
                          var3 = -id.field_g + 63;
                          break L6;
                        } else {
                          L9: {
                            if (ib.field_a != -1) {
                              tk.field_p[ib.field_a].b(-1);
                              break L9;
                            } else {
                              ua.field_L.h(param0 ^ 24821);
                              break L9;
                            }
                          }
                          var3 = id.field_g;
                          break L6;
                        }
                      }
                      int discarded$6 = 0;
                      int discarded$7 = 0;
                      ci.a(var3 + 1, -(var3 << 3) + 256, 16769381);
                      break L3;
                    }
                    L10: {
                      if (!gd.field_x) {
                        kb.a(false, 4, 2);
                        break L10;
                      } else {
                        vd.b(-1, 2, 23636);
                        break L10;
                      }
                    }
                    L11: {
                      ll.d();
                      if (!ag.b(param0 + -142)) {
                        break L11;
                      } else {
                        L12: {
                          ll.c(0, 0, ll.field_d, ll.field_k);
                          var3 = re.g(48);
                          var4 = var3 % 26;
                          if (var4 == 0) {
                            break L12;
                          } else {
                            var3 = var3 + (26 - var4);
                            break L12;
                          }
                        }
                        int discarded$8 = 0;
                        var5 = ii.b();
                        cl.a(nd.field_L, -(var3 >> 1) + 320 + -nd.field_L[0].field_t, nd.field_L[0].field_q + var5 + nd.field_L[6].field_q, -(var5 >> 1) + 240 - nd.field_L[0].field_q, var3 - (-nd.field_L[0].field_t + -nd.field_L[2].field_t), 4);
                        nl.a(-77);
                        break L11;
                      }
                    }
                    L13: {
                      if (0 == dd.field_o) {
                        break L13;
                      } else {
                        var3 = id.field_g << 3;
                        if (var3 <= 0) {
                          break L13;
                        } else {
                          ll.c(0, 0, ll.field_d, ll.field_k, 0, var3);
                          break L13;
                        }
                      }
                    }
                    L14: {
                      int discarded$9 = -26998;
                      if (!ob.g()) {
                        break L14;
                      } else {
                        if (ag.b(18)) {
                          break L14;
                        } else {
                          L15: {
                            if (og.field_rb != null) {
                              stackOut_53_0 = 1;
                              stackIn_54_0 = stackOut_53_0;
                              break L15;
                            } else {
                              stackOut_52_0 = lb.field_M;
                              stackIn_54_0 = stackOut_52_0 ? 1 : 0;
                              break L15;
                            }
                          }
                          nc.a(stackIn_54_0 != 0, -131);
                          break L14;
                        }
                      }
                    }
                    L16: {
                      if (nf.field_f) {
                        bk.field_E.c(Integer.toString(dh.field_p), 10, 40, 0, -1);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    qd.a((java.awt.Canvas) var7, 0, 0, param0 + 2741);
                    return;
                  }
                }
              }
              ud.a(128, 100.0f, ra.field_w);
              l.a((byte) 105, (java.awt.Canvas) var7);
              return;
            }
          } else {
            return;
          }
        } else {
          L17: {
            stackOut_4_0 = -128;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (og.field_rb == null) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = lb.field_M;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1 ? 1 : 0;
              break L17;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L17;
            }
          }
          ji.a((byte) stackIn_7_0, stackIn_7_1 != 0, (java.awt.Canvas) var7);
          return;
        }
    }

    final void e(int param0) {
        TrackController.q(-29224);
        int discarded$0 = 120;
        cb.a();
        ja.c(false);
        int discarded$1 = -1;
        kk.a();
        int discarded$2 = 61;
        bg.a();
        vb.a(true);
        int discarded$3 = -78;
        ib.a();
        int discarded$4 = -5146;
        ii.f();
        int discarded$5 = 1;
        ia.a();
        lj.a(param0 ^ 5);
        int discarded$6 = 10;
        uk.b();
        int discarded$7 = 8192;
        od.a();
        int discarded$8 = 57;
        we.a();
        ch.n(-8511);
        int discarded$9 = -96;
        nl.a();
        re.b((byte) -91);
        int discarded$10 = 17;
        ej.b();
        h.b(-31279);
        ll.c();
        oh.a();
        int discarded$11 = -1102;
        e.a();
        int discarded$12 = 98;
        qf.a();
        be.i(3);
        qg.b(false);
        int discarded$13 = 116;
        ai.a();
        int discarded$14 = 88;
        o.b();
        uj.b(param0 ^ 105);
        dk.a(true);
        tf.a(-1);
        kc.a(param0 ^ 107);
        q.a(param0 ^ 5);
        int discarded$15 = 106;
        qd.a();
        int discarded$16 = -64;
        he.a();
        int discarded$17 = -116;
        oj.a();
        wj.c(param0 ^ -6527);
        sk.a((byte) 111);
        int discarded$18 = 46;
        gf.a();
        jc.a(-79);
        ri.a(-107);
        mg.a(-8381);
        int discarded$19 = -103;
        gj.b();
        ea.d((byte) 96);
        int discarded$20 = 0;
        md.a();
        int discarded$21 = -108;
        sd.a();
        wg.c(param0 + 6778);
        il.b(-1);
        int discarded$22 = 32;
        bc.c();
        fc.b((byte) 118);
        nb.d((byte) 84);
        id.a(param0 + -104);
        int discarded$23 = 4;
        ha.d();
        fa.c();
        ol.f(param0 ^ -109);
        oa.e();
        qe.e(1048576);
        int discarded$24 = 14;
        kb.a();
        int discarded$25 = 11352;
        cd.c();
        int discarded$26 = -4775;
        na.a();
        fk.a(param0 + 14829);
        int discarded$27 = -125;
        pa.a();
        int discarded$28 = 105;
        ac.a();
        int discarded$29 = 117;
        p.b();
        ra.a(param0 + -208);
        int discarded$30 = 1;
        pc.a();
        int discarded$31 = -25590;
        vi.a();
        int discarded$32 = 0;
        wi.a();
        pb.a(false);
        int discarded$33 = 1;
        bb.a();
        int discarded$34 = -16723;
        ld.a();
        int discarded$35 = 9;
        vl.e();
        int discarded$36 = -106;
        og.v();
        int discarded$37 = 4210752;
        rk.t();
        jj.e((byte) 105);
        int discarded$38 = 0;
        vd.b();
        int discarded$39 = 0;
        sf.b();
        int discarded$40 = 0;
        rl.b();
        int discarded$41 = -122;
        bk.k();
        int discarded$42 = 61;
        kh.c();
        int discarded$43 = 3;
        rd.b();
        int discarded$44 = -2069072125;
        mj.b();
        int discarded$45 = 98;
        ab.a();
        gk.a(69);
        gb.d(-126);
        int discarded$46 = 111;
        fd.a();
        g.a((byte) 12);
        sl.a((byte) 107);
        int discarded$47 = 41;
        me.a();
        int discarded$48 = 105;
        u.a();
        pg.a();
        int discarded$49 = 107;
        c.a();
        hj.a(param0 ^ -3863);
        int discarded$50 = 0;
        la.d();
        int discarded$51 = -99;
        jk.a();
        int discarded$52 = -123;
        wf.a();
        int discarded$53 = 1;
        qa.a();
        int discarded$54 = 18775;
        vj.a();
        ta.a(param0 ^ 13730);
        int discarded$55 = -104;
        nh.a();
        kd.a((byte) 86);
        int discarded$56 = -1;
        oe.a();
        fh.a((byte) 125);
        b.a();
        int discarded$57 = 261211;
        nf.b();
        int discarded$58 = 80;
        da.e();
        int discarded$59 = -36;
        mb.b();
        int discarded$60 = -81;
        hi.c();
        int discarded$61 = 6;
        hf.a();
        int discarded$62 = -44;
        lh.c();
        int discarded$63 = -3;
        gd.c();
        tc.b((byte) -121);
        int discarded$64 = 17883;
        rg.a();
        tk.f(48);
        int discarded$65 = -30877;
        pl.c();
        int discarded$66 = 1;
        w.b();
        bd.a(44);
        ic.b((byte) -56);
        ig.b();
        ml.c();
        int discarded$67 = -103;
        mf.b();
        int discarded$68 = 118;
        cg.a();
        pf.a(110);
        int discarded$69 = 27887;
        ef.a();
        fg.a(-14138);
        fb.a(param0 ^ 30493);
        int discarded$70 = 119;
        ak.a();
        int discarded$71 = -1;
        kg.a();
        ug.g(param0 ^ -13);
        int discarded$72 = 0;
        bj.a();
        te.a(param0 ^ -18);
        sb.a((byte) 123);
        int discarded$73 = 0;
        kj.b();
        ke.a(false);
        int discarded$74 = 49;
        s.a();
        int discarded$75 = -18515;
        ij.c();
        gi.c((byte) -127);
        int discarded$76 = 8462;
        gh.b();
        int discarded$77 = -12814;
        jd.a();
        int discarded$78 = -2857;
        rb.b();
        al.d(param0 ^ -59);
        rh.i(param0 + -222);
        int discarded$79 = -7;
        ok.d();
        int discarded$80 = 35;
        wd.p();
        hl.l(param0 ^ -66);
        ue.b(param0 ^ -18);
        int discarded$81 = 82;
        ie.b();
        df.b();
        int discarded$82 = -1688814815;
        kf.b();
        int discarded$83 = -68;
        ob.c();
        int discarded$84 = 16228;
        lg.b();
        int discarded$85 = 49;
        ki.a();
        int discarded$86 = 0;
        hb.a();
        int discarded$87 = 47;
        si.a();
        ff.a(-1);
        int discarded$88 = 0;
        rf.a();
        int discarded$89 = -88;
        hk.a();
        int discarded$90 = -60;
        dj.a();
        int discarded$91 = 12;
        ub.a();
        int discarded$92 = 118;
        ca.a();
        ji.a((byte) -64);
        int discarded$93 = -99;
        wl.d();
        int discarded$94 = -63;
        oc.a();
        int discarded$95 = -125;
        bf.a();
        int discarded$96 = -24011;
        mh.d();
        int discarded$97 = 104;
        uh.a();
        int discarded$98 = 1;
        sa.b();
        int discarded$99 = -71;
        lf.f();
        lb.n(-85);
        int discarded$100 = 16;
        dg.a();
        int discarded$101 = 0;
        nd.b();
        int discarded$102 = 0;
        el.c();
        ua.j(param0 + -219);
        ed.j(param0 + -3726);
        di.c((byte) 73);
        int discarded$103 = 1;
        ka.a();
        int discarded$104 = -127;
        fe.j();
        int discarded$105 = 40;
        qk.a();
        vf.a();
        int discarded$106 = 113;
        f.a();
        pi.b(param0 + -105);
        cj.e(4);
        int discarded$107 = -51;
        qh.a();
        fj.e((byte) 118);
        int discarded$108 = 0;
        mc.b();
        int discarded$109 = -14;
        aa.a();
        int discarded$110 = 72;
        ga.a();
        int discarded$111 = 59;
        rj.a();
        int discarded$112 = 32;
        vh.g();
        ad.i(param0 ^ 104);
        qc.a(true);
        int discarded$113 = 119;
        kl.a();
        ee.a(31399);
        int discarded$114 = 52;
        hh.b();
        int discarded$115 = -121;
        ti.c();
        int discarded$116 = 10;
        ag.a();
        int discarded$117 = 111;
        li.a();
        int discarded$118 = 2;
        vk.d();
        dc.c((byte) 97);
        int discarded$119 = -29615;
        ne.a();
        int discarded$120 = -3674;
        dd.b();
        ql.c(42);
        int discarded$121 = -50;
        ma.a();
        int discarded$122 = -101;
        gl.j();
        jf.d(640);
        sg.a(-8217);
        int discarded$123 = 23985;
        nk.d();
        int discarded$124 = -8;
        dh.d();
        int discarded$125 = 0;
        th.e();
        int discarded$126 = 29211;
        cf.d();
        int discarded$127 = -128;
        le.b();
        nj.b(71);
        int discarded$128 = -75;
        j.a();
        int discarded$129 = 113;
        ba.a();
        wa.d(param0 + -202);
        int discarded$130 = 112;
        lc.j();
        bl.a(-113);
        ec.b((byte) -49);
        int discarded$131 = 0;
        of.b();
        sc.a(param0 ^ 150);
        mk.a((byte) -3);
        int discarded$132 = -1;
        r.d();
        int discarded$133 = 73;
        ei.e();
        qi.a(param0 ^ param0);
        int discarded$134 = 20300;
        va.c();
        int discarded$135 = -127;
        af.d();
        ui.h(256);
        l.g(param0 ^ 105);
        hd.d((byte) 69);
        int discarded$136 = 112;
        ni.g();
        int discarded$137 = -111;
        jb.a();
        fi.d(param0 + -5759);
        int discarded$138 = 1;
        ud.a();
        v.d(0);
        int discarded$139 = -13;
        oi.a();
        ((TrackController) this).field_t = null;
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
        int var2 = 0;
        int var3 = 0;
        cf var4 = null;
        dh var5 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        L0: {
          var3 = field_F ? 1 : 0;
          int discarded$17 = -62;
          ii.a();
          if (og.field_rb == null) {
            break L0;
          } else {
            if (!og.field_rb.field_b) {
              break L0;
            } else {
              oj.a(-78);
              int discarded$18 = -94;
              ed.a();
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = 103;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (null == og.field_rb) {
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
          ((TrackController) this).a((byte) stackIn_6_1, stackIn_6_2 != 0);
          if (!ag.field_e) {
            break L2;
          } else {
            int discarded$19 = -23;
            this.r();
            ag.field_e = false;
            break L2;
          }
        }
        L3: {
          if (!ga.a(43)) {
            break L3;
          } else {
            ((TrackController) this).l(-122);
            if (ga.a(114)) {
              int discarded$20 = 1;
              if (!ic.a()) {
                return;
              } else {
                boolean discarded$21 = this.b(467, false);
                return;
              }
            } else {
              if (jj.s(109)) {
                break L3;
              } else {
                il.field_e = sl.a(4, -124);
                int discarded$22 = 1;
                int discarded$23 = 0;
                int discarded$24 = -1;
                int discarded$25 = 5;
                vd.field_G = dh.a();
                break L3;
              }
            }
          }
        }
        L4: {
          if (pf.field_T) {
            if (il.field_e == null) {
              if (vd.field_G == null) {
                if (!ag.b(116)) {
                  int discarded$26 = -26998;
                  if (!ob.g()) {
                    int discarded$27 = 0;
                    this.s();
                    break L4;
                  } else {
                    L5: {
                      stackOut_44_0 = this;
                      stackIn_46_0 = stackOut_44_0;
                      stackIn_45_0 = stackOut_44_0;
                      if (null == og.field_rb) {
                        stackOut_46_0 = this;
                        stackOut_46_1 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        stackIn_47_1 = stackOut_46_1;
                        break L5;
                      } else {
                        stackOut_45_0 = this;
                        stackOut_45_1 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        break L5;
                      }
                    }
                    L6: {
                      var2 = ((TrackController) this).b(stackIn_47_1 != 0, 119);
                      if (var2 == 1) {
                        if (og.field_rb != null) {
                          oj.a(-108);
                          break L6;
                        } else {
                          break L4;
                        }
                      } else {
                        if (var2 != 2) {
                          break L6;
                        } else {
                          L7: {
                            if (null == og.field_rb) {
                              break L7;
                            } else {
                              oj.a(-84);
                              break L7;
                            }
                          }
                          int discarded$28 = -9;
                          af.a(gd.b((byte) 77));
                          break L4;
                        }
                      }
                    }
                    break L4;
                  }
                } else {
                  if (dd.field_o != 0) {
                    int discarded$29 = 0;
                    this.s();
                    break L4;
                  } else {
                    L8: {
                      int discarded$30 = -1;
                      var2 = rk.s();
                      if (var2 == 3) {
                        int discarded$31 = 0;
                        int discarded$32 = 0;
                        int discarded$33 = 18;
                        oi.a(26, gb.field_l, 26, bk.field_E, bk.field_E, 10, 320, 20, 240, gb.field_l, -3748, true);
                        break L8;
                      } else {
                        if (2 != var2) {
                          if (var2 == 4) {
                            ad.a(-4, -4, (byte) -110);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          oj.a(-77);
                          break L8;
                        }
                      }
                    }
                    if (ag.b(45)) {
                      break L4;
                    } else {
                      tk.field_p[ib.field_a].a(10412, true);
                      break L4;
                    }
                  }
                }
              } else {
                if (!vd.field_G.field_k) {
                  break L4;
                } else {
                  L9: {
                    if (~vd.field_G.field_m[0] >= ~pc.field_i) {
                      break L9;
                    } else {
                      pc.field_i = vd.field_G.field_m[0];
                      break L9;
                    }
                  }
                  vd.field_G = null;
                  mf.c((byte) 123);
                  break L4;
                }
              }
            } else {
              if (!il.field_e.field_j) {
                break L4;
              } else {
                th.field_l = th.field_l | il.field_e.field_m;
                oe.field_e = oe.field_e & ~il.field_e.field_m;
                il.field_e = null;
                if (oe.field_e == 0) {
                  if (16 == ib.field_a) {
                    ib.field_a = 11;
                    sc.field_g = 11;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
            }
          } else {
            od.a((byte) -116, ee.field_c);
            if (this.b(467, true)) {
              pf.field_T = true;
              break L4;
            } else {
              break L4;
            }
          }
        }
        if (!param0) {
          L10: {
            if (!jj.s(47)) {
              L11: while (true) {
                var4 = (cf) (Object) ka.field_d.b((byte) -105);
                if (var4 != null) {
                  ti.a(4, (byte) 88, var4);
                  continue L11;
                } else {
                  L12: while (true) {
                    var5 = (dh) (Object) cd.field_h.b((byte) -111);
                    if (var5 == null) {
                      break L10;
                    } else {
                      ij.a(var5, 5, -126);
                      continue L12;
                    }
                  }
                }
              }
            } else {
              break L10;
            }
          }
          L13: {
            if (!pf.field_T) {
              break L13;
            } else {
              if (null != ch.field_n) {
                break L13;
              } else {
                fe.a(true, pf.field_P[0], 256);
                break L13;
              }
            }
          }
          L14: while (true) {
            if (!ge.a(kg.field_b, param0)) {
              L15: {
                me.a(-1, 0);
                if (fc.c(72)) {
                  var2 = ((TrackController) this).d((byte) 103);
                  if (2 != var2) {
                    break L15;
                  } else {
                    hh.a(-28717);
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              return;
            } else {
              ((TrackController) this).e((byte) 85);
              continue L14;
            }
          }
        } else {
          return;
        }
    }

    public TrackController() {
    }

    private final void r() {
        if (!(null == ed.field_I)) {
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
        o.a((byte) -46);
    }

    final void c(byte param0) {
        ((TrackController) this).a(false, 0, 10, 12, 7, (byte) 3, 11, 9);
        nb var2 = new nb();
        var2.a(false, 128, 9);
        mf.a(15, true, 22050, rg.field_c, (java.awt.Component) (Object) ki.field_f, var2);
        ((TrackController) this).a(-1, true, true, false, true);
        int var3 = 10 / ((param0 - 61) / 61);
        j.field_a = 1;
        db.field_db = 5;
        sl.field_n = 0;
    }

    private final boolean b(int param0, boolean param1) {
        try {
            int var3 = 0;
            byte[] var3_ref_byte__ = null;
            byte[] var4_ref_byte__ = null;
            int var4 = 0;
            String var4_ref_String = null;
            ng[] var4_ref_ng__ = null;
            int var5 = 0;
            oh var5_ref_oh = null;
            qj var6_ref_qj = null;
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
            qj[] var21 = null;
            qj var22 = null;
            qj var23 = null;
            qj[] var24 = null;
            qj var25 = null;
            qj var26 = null;
            qj var27 = null;
            byte[] var29 = null;
            BufferedReader var31 = null;
            int[] var32 = null;
            byte[] var34 = null;
            int[] var36 = null;
            byte[] var38 = null;
            int[] var40 = null;
            byte[] var41 = null;
            byte[] var42 = null;
            byte[] var43 = null;
            String stackIn_91_0 = null;
            String stackOut_90_0 = null;
            String stackOut_89_0 = null;
            var18 = field_F ? 1 : 0;
            if (null == el.field_L) {
              if (sg.field_a == null) {
                if (null != j.field_h) {
                  ud.a(128, 75.0f, ld.field_a);
                  ((TrackController) this).a(160);
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
                  var41 = va.field_d[10].field_j;
                  var42 = new byte[oa.field_h * 5 / 50];
                  var38 = var42;
                  var34 = var38;
                  var29 = var34;
                  var4_ref_byte__ = var29;
                  var5 = 0;
                  L0: while (true) {
                    if (var5 >= var41.length) {
                      va.field_d[10] = new ik(oa.field_h, var4_ref_byte__, 0, var42.length);
                      var5 = 0;
                      L1: while (true) {
                        if (var5 >= 13) {
                          j.field_h = null;
                          qi.d(-123);
                          return false;
                        } else {
                          L2: {
                            if (nd.field_G[var5] != 0) {
                              break L2;
                            } else {
                              nd.field_G[var5] = 96;
                              break L2;
                            }
                          }
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var4_ref_byte__[var5] = var41[var5];
                      var5++;
                      continue L0;
                    }
                  }
                } else {
                  if (sk.field_j == null) {
                    if (null != wl.field_l) {
                      var3 = 0;
                      L3: while (true) {
                        if (var3 >= 4) {
                          fj.field_P.b(true);
                          od.field_d = null;
                          wl.field_l = null;
                          qi.d(92);
                          return false;
                        } else {
                          if (fj.field_P.a(wl.field_l, (byte) -27, 176400, od.field_d, pf.field_P[var3])) {
                            var3++;
                            continue L3;
                          } else {
                            return false;
                          }
                        }
                      }
                    } else {
                      if (da.field_p[1][0] == null) {
                        ud.a(128, 95.0f, rj.field_f);
                        ((TrackController) this).a(160);
                        var3 = 208;
                        var4 = 1;
                        L4: while (true) {
                          if (32 <= var4) {
                            ia.field_b.a(-91);
                            qi.d(29);
                            return false;
                          } else {
                            var5 = var4 * 65536 / 32;
                            var6 = 0;
                            L5: while (true) {
                              if (var6 >= 4) {
                                var4++;
                                continue L4;
                              } else {
                                da.field_p[var4][var6] = new qj(26, 26);
                                da.field_p[var4][var6].a();
                                da.field_p[0][var6].a(var3, var3, var3, var3, var5, 4096);
                                da.field_p[32 + var4][var6] = new qj(26, 26);
                                da.field_p[var4 - -32][var6].a();
                                da.field_p[32][var6].a(var3, var3, var3, var3, var5, 4096);
                                var6++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        L6: {
                          if (null == rl.field_D) {
                            break L6;
                          } else {
                            int discarded$12 = 208;
                            mj.a();
                            gj.field_f = new ea[31];
                            var43 = rl.field_D.a("", -1, "levels.txt");
                            var31 = new BufferedReader((Reader) (Object) new InputStreamReader((InputStream) (Object) new ByteArrayInputStream(var43)));
                            var5 = 0;
                            L7: while (true) {
                              if (31 <= var5) {
                                var31.close();
                                tk.field_p = new mg[17];
                                qh.field_b = gj.field_f[0];
                                rl.field_D = null;
                                var5 = 0;
                                L8: while (true) {
                                  if (var5 >= 17) {
                                    L9: {
                                      if (jj.s(125)) {
                                        ib.field_a = 0;
                                        sc.field_g = 0;
                                        break L9;
                                      } else {
                                        ib.field_a = 1;
                                        sc.field_g = 1;
                                        break L9;
                                      }
                                    }
                                    ti.a(-123, 50);
                                    fe.a(true, pf.field_P[0], 256);
                                    int discarded$13 = 13;
                                    rk.r();
                                    break L6;
                                  } else {
                                    tk.field_p[var5] = new mg((TrackController) this, var5);
                                    var5++;
                                    continue L8;
                                  }
                                }
                              } else {
                                gj.field_f[var5] = new ea(1 + var5, var31.readLine());
                                var5++;
                                continue L7;
                              }
                            }
                          }
                        }
                        qi.d(54);
                        return true;
                      }
                    }
                  } else {
                    ud.a(128, 80.0f, ji.field_e);
                    ((TrackController) this).a(160);
                    pf.field_P[0] = wb.a(sk.field_j, "", "track controller titlescreen");
                    pf.field_P[1] = wb.a(sk.field_j, "", "track controller new");
                    pf.field_P[2] = wb.a(sk.field_j, "", "track controller level complete");
                    pf.field_P[3] = wb.a(sk.field_j, "", "track controller game over");
                    sk.field_j = null;
                    qi.d(108);
                    return false;
                  }
                }
              } else {
                var3 = bk.field_E.field_u + bk.field_E.field_G;
                mc.field_E = new qj(var3, var3);
                mc.field_E.a();
                dc.field_p.a(0, 0, var3, var3);
                dc.field_p = null;
                ia.field_b.a(-91);
                bb.field_b = ib.a(10, "", sg.field_a, "achievements");
                var20 = bb.field_b;
                var5 = 0;
                L10: while (true) {
                  if (~var5 <= ~var20.length) {
                    na.field_c = ab.a("", -15383, "bgtile", sg.field_a);
                    cd.field_c = new qj(640, 480);
                    cd.field_c.a();
                    var4 = 0;
                    L11: while (true) {
                      if (var4 >= 480) {
                        ll.b(20, 30, 600, 383, 3894145, 11980506);
                        ll.f(0, 0, 640, 480, 0);
                        ab.a("", -15383, "titlescreen2", sg.field_a).e(0, 0);
                        ia.field_b.a(-91);
                        nd.field_L = ib.a(10, "", sg.field_a, "frame");
                        gb.field_l = ib.a(10, "", sg.field_a, "buttonframe");
                        aa.field_a = ib.a(10, "", sg.field_a, "buttonframe38");
                        var4 = 0;
                        L12: while (true) {
                          if (var4 >= 9) {
                            ii.field_r = ib.a(10, "", sg.field_a, "tiles");
                            ha.field_m = new qj[9];
                            ha.field_m[4] = ii.field_r[0];
                            var4 = 0;
                            L13: while (true) {
                              if (var4 >= 9) {
                                L14: {
                                  if (ui.a(0, true)) {
                                    stackOut_90_0 = "halloween";
                                    stackIn_91_0 = stackOut_90_0;
                                    break L14;
                                  } else {
                                    stackOut_89_0 = "";
                                    stackIn_91_0 = stackOut_89_0;
                                    break L14;
                                  }
                                }
                                var4_ref_String = stackIn_91_0;
                                var21 = ib.a(10, var4_ref_String, sg.field_a, "man");
                                da.field_p = new qj[64][4];
                                pd.a((Object[]) (Object) var21, 0, (Object[]) (Object) da.field_p[0], 0, 4);
                                pd.a((Object[]) (Object) var21, 4, (Object[]) (Object) da.field_p[32], 0, 4);
                                j.field_b = ib.a(10, var4_ref_String, sg.field_a, "man_face");
                                hk.field_a = ib.a(10, "", sg.field_a, "smoke");
                                kg.field_e = ib.a(10, "", sg.field_a, "tickbox");
                                var24 = ib.a(10, "", sg.field_a, "titlebg");
                                var7 = ib.a(10, "", sg.field_a, "titles");
                                al.field_z = new qj[1 + var7.length];
                                var8 = 0;
                                L15: while (true) {
                                  if (~var7.length >= ~var8) {
                                    var8_ref_qj = ab.a("", -15383, "titlegameach", sg.field_a);
                                    qj dupTemp$14 = new qj(var8_ref_qj.field_s, var8_ref_qj.field_v);
                                    al.field_z[var7.length] = dupTemp$14;
                                    var25 = dupTemp$14;
                                    var25.a();
                                    cl.a(var24, 0, var8_ref_qj.field_v, 0, var8_ref_qj.field_s, 4);
                                    var8_ref_qj.e(0, 0);
                                    fd.field_d = ab.a("", -15383, "exhibit", sg.field_a);
                                    var8 = ba.field_b.field_G + 26;
                                    qj dupTemp$15 = new qj(156, var8);
                                    ai.field_a = dupTemp$15;
                                    var26 = dupTemp$15;
                                    var9 = var26;
                                    qj dupTemp$16 = new qj(156, var8);
                                    al.field_t = dupTemp$16;
                                    var27 = dupTemp$16;
                                    var10 = var27;
                                    qj dupTemp$17 = new qj(156, var8);
                                    bf.field_o = dupTemp$17;
                                    var11 = dupTemp$17;
                                    qj dupTemp$18 = new qj(156, var8);
                                    vl.field_K = dupTemp$18;
                                    var12 = dupTemp$18;
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
                                    var26.a();
                                    cl.a(aa.field_a, 0, var8, 0, 156, 4);
                                    bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 0, -1);
                                    ba.field_b.b(bl.field_d, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
                                    var27.a();
                                    cl.a(aa.field_a, 0, var8, 0, 156, 4);
                                    bk.field_E.b(na.field_d, 78, bk.field_E.field_G, 1, -1);
                                    ba.field_b.b(bl.field_d, 78, bk.field_E.field_G + ba.field_b.field_G, 15252224, -1);
                                    var11.a();
                                    cl.a(aa.field_a, 0, var8, 0, 156, 4);
                                    bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 0, -1);
                                    ba.field_b.b(th.field_i, 78, ba.field_b.field_G + bk.field_E.field_G, 15252224, -1);
                                    var12.a();
                                    cl.a(aa.field_a, 0, var8, 0, 156, 4);
                                    bk.field_E.b(ca.field_d, 78, bk.field_E.field_G, 1, -1);
                                    ba.field_b.b(th.field_i, 78, bk.field_E.field_G - -ba.field_b.field_G, 15252224, -1);
                                    ia.field_b.a(-91);
                                    sg.field_a = null;
                                    qi.d(60);
                                    return false;
                                  } else {
                                    var22 = var7[var8];
                                    qj dupTemp$19 = new qj(var22.field_s, var22.field_v);
                                    al.field_z[var8] = dupTemp$19;
                                    var23 = dupTemp$19;
                                    var23.a();
                                    cl.a(var24, 0, var22.field_v, 0, var22.field_s, 4);
                                    var22.e(0, 0);
                                    var8++;
                                    continue L15;
                                  }
                                }
                              } else {
                                L16: {
                                  if (var4 != 4) {
                                    L17: {
                                      ha.field_m[var4] = nd.field_L[var4].b();
                                      ha.field_m[var4].a();
                                      var5 = 0;
                                      var6 = 0;
                                      var7_int = 2;
                                      if (0 != var4 % 3) {
                                        break L17;
                                      } else {
                                        var5 = -2 + ll.field_d;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      if (3 > var4) {
                                        var6 = ll.field_k + -2;
                                        break L18;
                                      } else {
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      var8 = 2;
                                      if (var4 % 3 != 1) {
                                        break L19;
                                      } else {
                                        var7_int = ll.field_d;
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      L21: {
                                        if (3 == var4) {
                                          break L21;
                                        } else {
                                          if (5 != var4) {
                                            break L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                      var8 = ll.field_k;
                                      break L20;
                                    }
                                    ll.c(var5, var6, var7_int, var8, 9073738);
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L13;
                              }
                            }
                          } else {
                            nd.field_L[var4].field_s = nd.field_L[var4].field_t;
                            nd.field_L[var4].field_v = nd.field_L[var4].field_q;
                            gb.field_l[var4].field_s = gb.field_l[var4].field_t;
                            gb.field_l[var4].field_v = gb.field_l[var4].field_q;
                            var4++;
                            continue L12;
                          }
                        }
                      } else {
                        var5 = 0;
                        L22: while (true) {
                          if (var5 >= 640) {
                            var4 = var4 + na.field_c.field_v;
                            continue L11;
                          } else {
                            na.field_c.h(var5, var4);
                            var5 = var5 + na.field_c.field_s;
                            continue L22;
                          }
                        }
                      }
                    }
                  } else {
                    var6_ref_qj = var20[var5];
                    var22 = var6_ref_qj;
                    var22 = var6_ref_qj;
                    int discarded$20 = -1;
                    ei.a(var6_ref_qj);
                    var5++;
                    continue L10;
                  }
                }
              }
            } else {
              L23: {
                if (!el.field_L.c(111)) {
                  break L23;
                } else {
                  if (!el.field_L.b("basic", (byte) -3)) {
                    break L23;
                  } else {
                    if (el.field_L.b("comic12", (byte) -3)) {
                      if (el.field_L.b("kartika13", (byte) -3)) {
                        if (fb.field_b.b("comic12", (byte) -3)) {
                          if (fb.field_b.b("kartika13", (byte) -3)) {
                            L24: {
                              if (!rl.field_D.c(93)) {
                                break L24;
                              } else {
                                if (rl.field_D.a((byte) 48)) {
                                  L25: {
                                    if (ui.a(0, true)) {
                                      L26: {
                                        if (!sg.field_a.c(-115)) {
                                          break L26;
                                        } else {
                                          if (!sg.field_a.b("halloween", (byte) -3)) {
                                            break L26;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                      ud.a(128, 11.0f, wf.a("halloween", sa.field_K, gj.field_e, sg.field_a, 12));
                                      return false;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  L27: {
                                    if (!sg.field_a.c(91)) {
                                      break L27;
                                    } else {
                                      if (!sg.field_a.b("", (byte) -3)) {
                                        break L27;
                                      } else {
                                        L28: {
                                          if (!sg.field_a.c(106)) {
                                            break L28;
                                          } else {
                                            if (sg.field_a.b("", (byte) -3)) {
                                              L29: {
                                                if (!si.field_c.c(-109)) {
                                                  break L29;
                                                } else {
                                                  if (si.field_c.a((byte) 48)) {
                                                    L30: {
                                                      if (!j.field_h.c(96)) {
                                                        break L30;
                                                      } else {
                                                        if (!j.field_h.a((byte) 48)) {
                                                          break L30;
                                                        } else {
                                                          L31: {
                                                            if (!wl.field_l.c(121)) {
                                                              break L31;
                                                            } else {
                                                              if (!wl.field_l.a((byte) 48)) {
                                                                break L31;
                                                              } else {
                                                                if (!lh.field_C.c(110)) {
                                                                  break L31;
                                                                } else {
                                                                  if (lh.field_C.a((byte) 48)) {
                                                                    L32: {
                                                                      if (!sk.field_j.c(-73)) {
                                                                        break L32;
                                                                      } else {
                                                                        if (sk.field_j.a((byte) 48)) {
                                                                          ud.a(128, 70.0f, cg.field_d);
                                                                          if (!param1) {
                                                                            return false;
                                                                          } else {
                                                                            L33: {
                                                                              mf.c((byte) 114);
                                                                              ((TrackController) this).a(160);
                                                                              vj.field_a = ab.a("basic", -15383, "unachieved", el.field_L);
                                                                              int discarded$21 = -1;
                                                                              ei.a(vj.field_a);
                                                                              ii.field_p = ab.a("basic", -15383, "locked", el.field_L);
                                                                              int discarded$22 = -1;
                                                                              ei.a(ii.field_p);
                                                                              dc.field_p = ab.a("basic", -15383, "orbcoin", el.field_L);
                                                                              var3_ref_byte__ = si.field_c.a("", -1, "tcfont");
                                                                              var4_ref_ng__ = ie.a("", sg.field_a, "tcfont", 126);
                                                                              int discarded$23 = 15252224;
                                                                              var5_ref_oh = (oh) (Object) ma.a(6488064, (byte) -123, 2, var4_ref_ng__, var3_ref_byte__);
                                                                              bk.field_E = var5_ref_oh;
                                                                              var40 = ((de) (Object) var5_ref_oh).field_M[0];
                                                                              var36 = var40;
                                                                              var32 = var36;
                                                                              var19 = var32;
                                                                              var6_ref_int__ = var19;
                                                                              if (9 <= ((de) (Object) var5_ref_oh).field_M.length) {
                                                                                break L33;
                                                                              } else {
                                                                                ((de) (Object) var5_ref_oh).field_M = new int[9][];
                                                                                break L33;
                                                                              }
                                                                            }
                                                                            ((de) (Object) var5_ref_oh).field_M[0] = var40;
                                                                            var7_int = 1;
                                                                            L34: while (true) {
                                                                              if (var7_int >= 9) {
                                                                                ((de) (Object) var5_ref_oh).field_M[1][1] = 8110658;
                                                                                ((de) (Object) var5_ref_oh).field_M[2][1] = 4473924;
                                                                                ((de) (Object) var5_ref_oh).field_M[2][2] = 12303291;
                                                                                ((de) (Object) var5_ref_oh).field_M[3][1] = 12303291;
                                                                                ((de) (Object) var5_ref_oh).field_M[4][1] = 16711680;
                                                                                ((de) (Object) var5_ref_oh).field_M[5][1] = 16767035;
                                                                                ((de) (Object) var5_ref_oh).field_M[6][1] = 16777215;
                                                                                ((de) (Object) var5_ref_oh).field_M[7][1] = 16711680;
                                                                                ((de) (Object) var5_ref_oh).field_M[8][1] = 15252224;
                                                                                ((de) (Object) var5_ref_oh).field_M[8][2] = 0;
                                                                                ba.field_b = (oh) (Object) uk.a("comic12", el.field_L, fb.field_b, "", 8);
                                                                                re.field_c = (oh) (Object) uk.a("kartika13", el.field_L, fb.field_b, "", -43);
                                                                                el.field_L = null;
                                                                                fb.field_b = null;
                                                                                qi.d(71);
                                                                                return false;
                                                                              } else {
                                                                                ((de) (Object) var5_ref_oh).field_M[var7_int] = new int[var40.length];
                                                                                pd.a(var6_ref_int__, 0, ((de) (Object) var5_ref_oh).field_M[var7_int], 0, var40.length);
                                                                                var7_int++;
                                                                                continue L34;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                    }
                                                                    ud.a(128, 65.0f, wf.a("", ob.field_w, wa.field_j, sk.field_j, 4));
                                                                    return false;
                                                                  } else {
                                                                    break L31;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          ud.a(128, 50.0f, mk.a(0, wl.field_l, wa.field_j, ob.field_w, (byte) 117));
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    ud.a(128, 40.0f, wf.a("", fc.field_f, ql.field_q, j.field_h, 23));
                                                    return false;
                                                  } else {
                                                    break L29;
                                                  }
                                                }
                                              }
                                              ud.a(128, 31.0f, wf.a("", fd.field_f, v.field_c, si.field_c, 73));
                                              return false;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                        ud.a(128, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 119));
                                        return false;
                                      }
                                    }
                                  }
                                  ud.a(128, 30.0f, wf.a("", sa.field_K, gj.field_e, sg.field_a, 91));
                                  return false;
                                } else {
                                  break L24;
                                }
                              }
                            }
                            ud.a(128, 6.0f, wf.a("", lf.field_W, ei.field_k, rl.field_D, 54));
                            return false;
                          } else {
                            ud.a(128, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, fb.field_b, 62));
                            return false;
                          }
                        } else {
                          ud.a(128, 3.0f, wf.a("comic12", fd.field_f, v.field_c, fb.field_b, 92));
                          return false;
                        }
                      } else {
                        ud.a(128, 3.0f, wf.a("kartika13", fd.field_f, v.field_c, el.field_L, 36));
                        return false;
                      }
                    } else {
                      ud.a(128, 3.0f, wf.a("comic12", fd.field_f, v.field_c, el.field_L, 43));
                      return false;
                    }
                  }
                }
              }
              ud.a(128, 2.0f, wf.a("basic", sa.field_K, gj.field_e, el.field_L, 78));
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ud();
        field_E = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_C = "Continue";
    }
}
