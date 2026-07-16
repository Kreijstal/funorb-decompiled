/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;
import java.lang.String;

public final class Virogrid extends od {
    private p field_I;
    static co field_O;
    private int[] field_N;
    private int[] field_D;
    private int field_E;
    private int[] field_B;
    private int[] field_C;
    private int[] field_K;
    private int field_A;
    private int[] field_M;
    private int[] field_H;
    private int[] field_L;
    private int[] field_G;
    private int[] field_J;
    public static boolean field_F;

    private final void r(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = field_F ? 1 : 0;
          bc.field_c = 3;
          ln.field_g = 3;
          co.field_l = 3;
          jf dupTemp$2 = new jf();
          gb.field_H = dupTemp$2;
          ke.field_p = dupTemp$2;
          ad.field_g = new double[]{1.0, 0.0, 0.0};
          vm.field_d = new double[]{0.0, 0.0, -128.0};
          da.field_k = new double[3];
          gb.c((byte) -44);
          ke.field_p.field_d = true;
          ce.field_E = 0;
          bi.field_c = new int[]{0, 154, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          gb.field_H.field_d = true;
          c.field_d = new mg(640, 400);
          we.field_e = new mg(640, 400);
          mk.field_bb = new mg(200, 400);
          var2 = 0;
          if (param0 > 59) {
            break L0;
          } else {
            ck discarded$3 = Virogrid.b((byte) -64, false);
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= 256) {
            jm.a(320, 240, -2);
            qa.field_e = -1;
            return;
          } else {
            pj.field_d[var2] = rb.a(16711872, 143 * var2 << -1617433272);
            pj.field_d[var2] = oh.a(pj.field_d[var2], rb.a(65280, var2 * 191));
            pj.field_d[var2] = oh.a(pj.field_d[var2], var2);
            var2++;
            continue L1;
          }
        }
    }

    private final void e(byte param0) {
        int var2 = (id.field_r % 20480 << -2083455892) % 83886080;
        si.a(nk.field_K, new double[3], new double[3], 700.0, 200.0, sj.field_j, 23967451 + var2, var2 - -59918628, 0, 16711680, ke.field_p.field_k);
        si.a(nk.field_K, new double[3], new double[3], 500.0, 200.0, sj.field_j, var2 - -59918628, 83820544 + var2, 0, 16711680, ke.field_p.field_k);
        if (param0 != -62) {
            return;
        }
        this.s(-1933);
    }

    private final void a(eh param0, byte param1, eh param2, eh param3, eh param4, eh param5) {
        int var10 = 0;
        mg var11 = null;
        int var12 = field_F ? 1 : 0;
        hd.field_b = a.a("", param5, -110, "font", param4);
        vg.field_H = a.a("", param5, -95, "smallfont", param4);
        mc.field_b = a.a("", param5, -120, "menufont", param4);
        re.field_o = a.a("", param5, -110, "tinyfont", param4);
        mg var13 = sn.a(param5, "starfield", "", false);
        sj.field_j = new mg(2560, 256);
        sj.field_j.b();
        var13.b(0, 0);
        var13.b(1280, 0);
        ca.field_M.a((byte) 29);
        eh.field_l = vc.a(param5, "logo", "", (byte) 114);
        mg discarded$0 = sn.a(param5, "splash", "", false);
        tk.field_d = ke.a("walk1", "", param5, 32370);
        ic.field_y = ke.a("walk2", "", param5, 32370);
        wh.field_b = ke.a("walk3", "", param5, 32370);
        vb.field_l = new mg(640, 480);
        ib.field_b = b.a("", param5, 7, "frame");
        wf.a(100, (e) (Object) mc.field_b, 0, (e) (Object) vg.field_H);
        en.field_Kb = 16777215;
        la.field_k = 16777215;
        sf.field_I = 16777215;
        na.field_Hb = 8437759;
        jl.field_E = 16777215;
        ti.field_b = 8437759;
        cb.field_d = ke.a(32, param5, "", "achievements_large");
        mj.field_F = sn.a(param2, "unachieved", "basic", false);
        ad.field_b = sn.a(param2, "orbcoin", "basic", false);
        int var8 = cb.field_d.length;
        vd.field_Y = new mg[var8];
        qc.a(123);
        int var9_int = -67 / ((param1 - -11) / 58);
        for (var10 = 0; var8 > var10; var10++) {
            var11 = new mg(32, 32);
            var11.b();
            cb.field_d[var10].b(0, 0, 32, 32);
            vd.field_Y[var10] = var11;
        }
        tn.field_b = new mg(32, 32);
        tn.field_b.b();
        mj.field_F.b(0, 0, 32, 32);
        ul.b((byte) 108);
        kd.field_p = ke.a(32, param5, "", "viewicons");
        mg discarded$1 = this.b(131586, -9105, 30136);
        mg discarded$2 = this.b(263172, -9105, 6316128);
        mg[][] var9 = new mg[2][];
        var9[0] = ke.a(32, param5, "", "turntime_icons");
        var9[1] = ke.a(32, param5, "", "gridwidth_icons");
        nn.a(var9, var9, 2, ra.field_e, m.field_a, param3, param2, true, -27871, wc.field_c, wc.field_c, wf.field_e, wn.field_j, 2, ng.field_T);
        ak.field_e = sn.a(param5, "lobbyicon", "", false);
        fk.a((kj) (Object) new vl(param0, param5, 8, 128));
    }

    final static ck b(byte param0, boolean param1) {
        if (param0 != -32) {
            field_O = null;
        }
        ck var2 = new ck(true);
        var2.field_d = param1 ? true : false;
        return var2;
    }

    final void c(boolean param0) {
        ((Virogrid) this).a(77, 14, 4, 0, 2, 1, false, 121);
        i var3 = new i();
        var3.a(128, 9, !param0 ? true : false);
        pe.a((java.awt.Component) (Object) fi.field_v, var3, ei.field_c, param0, (byte) -18, 22050);
        ((Virogrid) this).a(false, true, -118, true, false, false, false);
        jc.field_i[60] = 4;
        jc.field_i[67] = 1;
        jc.field_i[63] = 1;
        jc.field_i[64] = 1;
        jc.field_i[65] = 1;
        jc.field_i[62] = 2;
        jc.field_i[9] = -1;
        jc.field_i[61] = 5;
        jc.field_i[10] = -1;
        jc.field_i[57] = -2;
        jc.field_i[58] = -2;
        jc.field_i[66] = 1;
        db.a((byte) 81, 200);
        this.r(114);
    }

    private final boolean c(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = field_F ? 1 : 0;
        a.b((byte) 69);
        if (null == pj.field_c) {
          L0: {
            if (param0 == -42) {
              break L0;
            } else {
              ((Virogrid) this).field_L = null;
              break L0;
            }
          }
          if (wm.field_w == null) {
            if (null != g.field_a) {
              al.a(aj.field_l, 13, 90.0f);
              ((Virogrid) this).b(true);
              this.a(gn.field_G, (byte) -105, ge.field_c, s.field_a, g.field_a, oj.field_Fb);
              s.field_a = null;
              g.field_a = null;
              sb.a(-82);
              return false;
            } else {
              if (null != wn.field_i) {
                al.a(gl.field_i, 13, 95.0f);
                ((Virogrid) this).b(true);
                this.a(1053, wn.field_i);
                wn.field_i = null;
                sb.a(param0 + -63);
                return false;
              } else {
                if (null != md.field_h) {
                  cg.a(8799, new ii(md.field_h.a("", 100, "huffman")));
                  md.field_h = null;
                  sb.a(param0 + -86);
                  return false;
                } else {
                  pn.a(false);
                  var3 = 0;
                  L1: while (true) {
                    if (var3 >= 12) {
                      hm.field_c = 10;
                      i.field_y = 10;
                      fh.a((byte) -89);
                      qc.a(50, (byte) 111);
                      bm.c(-111, 50);
                      ei.a(0, oi.field_c[0]);
                      id.field_r = 0;
                      return true;
                    } else {
                      al.field_j[var3] = new oi(var3);
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
          } else {
            al.a(mi.field_e, param0 ^ -37, 80.0f);
            ((Virogrid) this).b(true);
            oi.field_c = new sc[4];
            oi.field_c[0] = sc.a(wm.field_w, "", "ataxx titlescreen");
            oi.field_c[1] = sc.a(wm.field_w, "", "tetralink ingame 1");
            oi.field_c[2] = sc.a(wm.field_w, "", "tetralink ingame 2");
            oi.field_c[3] = sc.a(wm.field_w, "", "tetralink ingame 3");
            var3 = 0;
            L2: while (true) {
              if ((var3 ^ -1) <= -5) {
                vg.field_B.e(-1);
                af.field_g = null;
                el.field_d = null;
                wm.field_w = null;
                sb.a(-90);
                return false;
              } else {
                boolean discarded$3 = vg.field_B.a(el.field_d, 0, af.field_g, oi.field_c[var3], 0);
                var3++;
                continue L2;
              }
            }
          }
        } else {
          L3: {
            if (!ge.field_c.c(0)) {
              break L3;
            } else {
              if (ge.field_c.a((byte) -102, "basic")) {
                L4: {
                  if (!ge.field_c.c(0)) {
                    break L4;
                  } else {
                    if (!ge.field_c.a((byte) -102, "kartika13")) {
                      break L4;
                    } else {
                      L5: {
                        if (!s.field_a.c(0)) {
                          break L5;
                        } else {
                          if (!s.field_a.a((byte) -102, "kartika13")) {
                            break L5;
                          } else {
                            L6: {
                              if (!ge.field_c.c(0)) {
                                break L6;
                              } else {
                                if (ge.field_c.a((byte) -102, "lobby")) {
                                  L7: {
                                    if (!s.field_a.c(0)) {
                                      break L7;
                                    } else {
                                      if (!s.field_a.a((byte) -102, "lobby")) {
                                        break L7;
                                      } else {
                                        L8: {
                                          if (!pj.field_c.c(param0 + 42)) {
                                            break L8;
                                          } else {
                                            if (pj.field_c.b(25867)) {
                                              L9: {
                                                if (!sf.field_O.c(0)) {
                                                  break L9;
                                                } else {
                                                  if (sf.field_O.b(param0 ^ -25891)) {
                                                    L10: {
                                                      if (!el.field_d.c(0)) {
                                                        break L10;
                                                      } else {
                                                        if (!el.field_d.b(25867)) {
                                                          break L10;
                                                        } else {
                                                          L11: {
                                                            if (!wm.field_w.c(param0 + 42)) {
                                                              break L11;
                                                            } else {
                                                              if (wm.field_w.b(param0 + 25909)) {
                                                                L12: {
                                                                  if (!oj.field_Fb.c(0)) {
                                                                    break L12;
                                                                  } else {
                                                                    if (!oj.field_Fb.b(25867)) {
                                                                      break L12;
                                                                    } else {
                                                                      L13: {
                                                                        if (!g.field_a.c(0)) {
                                                                          break L13;
                                                                        } else {
                                                                          if (g.field_a.b(25867)) {
                                                                            L14: {
                                                                              if (!md.field_h.c(param0 ^ -42)) {
                                                                                break L14;
                                                                              } else {
                                                                                if (md.field_h.b(25867)) {
                                                                                  L15: {
                                                                                    if (!wn.field_i.c(0)) {
                                                                                      break L15;
                                                                                    } else {
                                                                                      if (!wn.field_i.b(25867)) {
                                                                                        break L15;
                                                                                      } else {
                                                                                        L16: {
                                                                                          if (!gn.field_G.c(param0 ^ -42)) {
                                                                                            break L16;
                                                                                          } else {
                                                                                            if (gn.field_G.b(param0 + 25909)) {
                                                                                              L17: {
                                                                                                if (!ng.field_T.c(param0 + 42)) {
                                                                                                  break L17;
                                                                                                } else {
                                                                                                  if (!ng.field_T.b(param0 + 25909)) {
                                                                                                    break L17;
                                                                                                  } else {
                                                                                                    al.a(hn.field_u, 13, 78.0f);
                                                                                                    if (param1) {
                                                                                                      ge.b(18887);
                                                                                                      ((Virogrid) this).b(true);
                                                                                                      af.field_g = new jg(pj.field_c, sf.field_O);
                                                                                                      ml discarded$4 = af.field_g.a((byte) 86, "", "menu_select");
                                                                                                      of.field_b = af.field_g.a((byte) 112, "", "tetralink_invalid_move");
                                                                                                      tk.field_c = new ml[5];
                                                                                                      td.field_d = new ml[5];
                                                                                                      var3 = 0;
                                                                                                      L18: while (true) {
                                                                                                        if (var3 >= 5) {
                                                                                                          qd.field_i = af.field_g.a((byte) 92, "", "tetralink_reset_board");
                                                                                                          bg.field_Lb = af.field_g.a((byte) 119, "", "tetralink_second_tick");
                                                                                                          wc.field_a = af.field_g.a((byte) 96, "", "tetralink_select_column");
                                                                                                          u.field_t = af.field_g.a((byte) 110, "", "tetralink_start_game");
                                                                                                          f.field_j = af.field_g.a((byte) 118, "", "tetralink_winning_line_sound_winner");
                                                                                                          cg.field_d = af.field_g.a((byte) 82, "", "tetralink_winning_line_sound_loser");
                                                                                                          ml discarded$5 = af.field_g.a((byte) 90, "", "tetralink_title_appear");
                                                                                                          ih.field_d = af.field_g.a((byte) 99, "", "tetralink_dissolve");
                                                                                                          af.field_k = af.field_g.a((byte) 103, "", "tetralink_dissolve_in");
                                                                                                          dj.field_f = new ml[3];
                                                                                                          dj.field_f[0] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_1");
                                                                                                          dj.field_f[1] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_2");
                                                                                                          dj.field_f[2] = af.field_g.a("", 595749988, "tetralink_NASA_chatter_3");
                                                                                                          pj.field_c = null;
                                                                                                          sf.field_O = null;
                                                                                                          sb.a(param0 + 15);
                                                                                                          return false;
                                                                                                        } else {
                                                                                                          tk.field_c[var3] = af.field_g.a((byte) 84, "", "tetralink_drop_piece_" + (var3 + 1));
                                                                                                          td.field_d[var3] = af.field_g.a((byte) 95, "", "tetralink_piece_inplace_" + (1 + var3));
                                                                                                          var3++;
                                                                                                          continue L18;
                                                                                                        }
                                                                                                      }
                                                                                                    } else {
                                                                                                      return false;
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              al.a(db.a(ng.field_T, sk.field_b, (byte) -118, gl.field_a), 13, 77.0f);
                                                                                              return false;
                                                                                            } else {
                                                                                              break L16;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        al.a(uh.a("", vl.field_m, gn.field_H, param0 + 41, gn.field_G), 13, 75.0f);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  al.a(uh.a("", pl.field_d, fa.field_m, -1, wn.field_i), 13, 75.0f);
                                                                                  return false;
                                                                                } else {
                                                                                  break L14;
                                                                                }
                                                                              }
                                                                            }
                                                                            al.a(uh.a("", sk.field_b, gl.field_a, -1, md.field_h), 13, 75.0f);
                                                                            return false;
                                                                          } else {
                                                                            break L13;
                                                                          }
                                                                        }
                                                                      }
                                                                      al.a(uh.a("", sb.field_a, aa.field_c, -1, g.field_a), 13, 75.0f);
                                                                      return false;
                                                                    }
                                                                  }
                                                                }
                                                                al.a(uh.a("", sb.field_a, aa.field_c, -1, oj.field_Fb), param0 + 55, 75.0f);
                                                                return false;
                                                              } else {
                                                                break L11;
                                                              }
                                                            }
                                                          }
                                                          al.a(uh.a("", nh.field_r, te.field_g, -1, wm.field_w), 13, 60.0f);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    al.a(pe.a(te.field_g, nh.field_r, el.field_d, 0, 0), 13, 45.0f);
                                                    return false;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                              al.a(uh.a("", ee.field_d, bm.field_n, -1, sf.field_O), 13, 40.0f);
                                              return false;
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        al.a(uh.a("", ee.field_d, bm.field_n, -1, pj.field_c), param0 + 55, 20.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  al.a(uh.a("lobby", we.field_j, mm.field_d, -1, s.field_a), 13, 17.0f);
                                  return false;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            al.a(uh.a("lobby", sb.field_a, aa.field_c, -1, ge.field_c), 13, 13.0f);
                            return false;
                          }
                        }
                      }
                      al.a(uh.a("roman20", we.field_j, mm.field_d, -1, s.field_a), param0 ^ -37, 12.0f);
                      return false;
                    }
                  }
                }
                al.a(uh.a("kartika13", sb.field_a, aa.field_c, -1, ge.field_c), 13, 11.0f);
                return false;
              } else {
                break L3;
              }
            }
          }
          al.a(uh.a("basic", sb.field_a, aa.field_c, -1, ge.field_c), 13, 10.0f);
          return false;
        }
    }

    public static void u(int param0) {
        field_O = null;
        if (param0 != 240) {
            field_O = null;
        }
    }

    private final void s(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (db.b((byte) 13, 0)) {
            if (!(0 >= hj.field_h)) {
                var2 = id.field_c - hj.field_h;
                var3 = -700;
                var4 = 4 * var2 + -1300;
                var5 = 200;
                if (100 > var2) {
                    var5 = var5 - (var2 + 200);
                    var3 = -20000 + var3 + var2 * 200;
                }
                var6 = -2048;
                var7 = id.a(var6, 32);
                var8 = nf.a(21855, var6);
                ae.field_e = new int[]{var3, var5, var4, var8, 0, -var7, 0, 65536, 0, var7, 0, var8};
                ri.field_a.a(pe.field_j, ae.field_e);
                ri.field_a.c();
            }
        }
        if (param0 != -1933) {
            ((Virogrid) this).field_D = null;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var3_ref_int__ = null;
        fl var3_ref_fl = null;
        int var4 = 0;
        pm var4_ref_pm = null;
        int[] var5_ref_int__ = null;
        int var5 = 0;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          L1: {
            var8 = field_F ? 1 : 0;
            var2 = 1;
            if ((hm.field_c ^ -1) != (i.field_y ^ -1)) {
              break L1;
            } else {
              if (nf.field_g == pg.field_g) {
                if (1 == (i.field_y ^ -1)) {
                  ej.a(false, 25680);
                  var2 = 0;
                  break L0;
                } else {
                  dj.a(nf.field_g, true, -1, 3, i.field_y);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          if (i.field_y != -2) {
            if (1 == (hm.field_c ^ -1)) {
              if ((we.field_l ^ -1) > -17) {
                dj.a(nf.field_g, false, -1, 3, i.field_y);
                break L0;
              } else {
                var2 = 0;
                ej.a(false, 25680);
                break L0;
              }
            } else {
              if (we.field_l < 16) {
                dj.a(nf.field_g, false, 1 + we.field_l, 3, i.field_y);
                break L0;
              } else {
                dj.a(pg.field_g, false, 33 + -we.field_l, 3, hm.field_c);
                break L0;
              }
            }
          } else {
            if (we.field_l < 16) {
              var2 = 0;
              ej.a(false, 25680);
              break L0;
            } else {
              dj.a(pg.field_g, false, -1, 3, hm.field_c);
              break L0;
            }
          }
        }
        L2: {
          if (var2 == 0) {
            break L2;
          } else {
            L3: {
              L4: {
                if (null == ci.field_s) {
                  break L4;
                } else {
                  if (sj.field_o != cc.field_x) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              cc.field_x = sj.field_o;
              lj.field_r = sg.field_i;
              cf.field_c = sj.field_o;
              vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
              vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
              gb.c((byte) -44);
              ci.field_s = new mg(640, 480);
              pj.a(ci.field_s, 256);
              df.b(0, 0, 640, 480, 3158064);
              var3 = j.field_b;
              var4 = tm.field_g;
              jm.a(320, 240, -2);
              var9 = new int[12];
              var34 = var9;
              var27 = var34;
              var20 = var27;
              var13 = var20;
              var5_ref_int__ = var13;
              var6 = 0;
              L5: while (true) {
                if ((var6 ^ -1) <= -4) {
                  var6 = 3;
                  L6: while (true) {
                    if ((var34.length ^ -1) >= (var6 ^ -1)) {
                      this.e((byte) -62);
                      kg.field_c.a(pe.field_j, bi.field_c);
                      nb.field_x.a(pe.field_j, bi.field_c);
                      kf.field_c.a(pe.field_j, bi.field_c);
                      cm.field_k.a(pe.field_j, bi.field_c);
                      ba.field_c.a(pe.field_j, bi.field_c);
                      wf.field_j.a(pe.field_j, bi.field_c);
                      th.field_y.a(var34, bi.field_c);
                      pj.field_a.a(var34, bi.field_c);
                      qg.field_h.a(var34, bi.field_c);
                      jg.field_i.a(var34, bi.field_c);
                      ee.field_a.a(var34, bi.field_c);
                      og.field_l.a(var34, bi.field_c);
                      ab.field_L.a(var34, bi.field_c);
                      rc.field_o.a(var34, bi.field_c);
                      hn.field_x.a(var34, bi.field_c);
                      td.field_i.a(var34, bi.field_c);
                      ul.b((byte) 109);
                      jm.a(var3, var4, -2);
                      break L3;
                    } else {
                      var5_ref_int__[var6] = pe.field_j[var6];
                      var6++;
                      continue L6;
                    }
                  }
                } else {
                  var9[var6] = pe.field_j[var6] << -412966013;
                  var6++;
                  continue L5;
                }
              }
            }
            L7: {
              ci.field_s.b(0, tm.field_g + -240);
              if (!ke.field_p.field_m) {
                break L7;
              } else {
                L8: {
                  var3 = id.field_r % 64;
                  if (-33 >= (var3 ^ -1)) {
                    stackOut_31_0 = 48 - var3;
                    stackIn_32_0 = stackOut_31_0;
                    break L8;
                  } else {
                    stackOut_30_0 = var3 + -16;
                    stackIn_32_0 = stackOut_30_0;
                    break L8;
                  }
                }
                var3 = stackIn_32_0;
                var3 = var3 << 2;
                var36 = new int[3];
                var29 = var36;
                var22 = var29;
                var15 = var22;
                var10 = var15;
                var38 = var10;
                var35 = new int[3];
                var28 = var35;
                var21 = var28;
                var14 = var21;
                var11 = var14;
                var39 = var11;
                var37 = new int[3];
                var30 = var37;
                var23 = var30;
                var16 = var23;
                var6_ref_int__ = var16;
                var10[0] = (int)ao.field_Hb;
                var35[0] = 50;
                var10[1] = -(int)ao.field_Hb;
                var6_ref_int__[0] = (var3 >> -498345404) + 128;
                var35[1] = 50;
                var36[2] = 0;
                var6_ref_int__[1] = (var3 >> 903526148) + 128;
                var35[2] = 80;
                var37[2] = 128;
                var7 = si.a(8437759);
                qf.a(240, 0, 0, var38, var39, var37, var7, var7, var7);
                var3 = var36[0];
                var10[0] = var36[1];
                var36[1] = var3;
                var3 = var35[0];
                var11[0] = var35[1];
                var35[1] = var3;
                var3 = var37[0];
                var6_ref_int__[0] = var37[1];
                var37[1] = var3;
                qf.a(240, 0, 0, var38, var39, var37, var7, var7, var7);
                break L7;
              }
            }
            L9: {
              if (ke.field_p.field_d) {
                L10: {
                  var40 = c.field_d.field_B;
                  var33 = var40;
                  var26 = var33;
                  var19 = var26;
                  var12 = var19;
                  var3_ref_int__ = var12;
                  if (-1 <= (co.field_h ^ -1)) {
                    break L10;
                  } else {
                    var6 = 256000;
                    L11: while (true) {
                      if (-1 <= (var6 ^ -1)) {
                        break L10;
                      } else {
                        var6--;
                        var4 = 16711935 & var40[var6];
                        var5 = 65280 & var40[var6];
                        var4 = var4 * (256 + -co.field_h);
                        var4 = var4 & -16711936;
                        var5 = var5 * (256 - co.field_h);
                        var5 = var5 & 16711680;
                        var4 = var4 + (co.field_h * 16711935 & -16711936);
                        var5 = var5 + (16711680 & co.field_h * 65280);
                        var12[var6] = oh.a(var5, var4) >>> -307183480;
                        continue L11;
                      }
                    }
                  }
                }
                pj.a(c.field_d, 256);
                var4_ref_pm = (pm) (Object) gd.field_n.a((byte) -107);
                L12: while (true) {
                  if (var4_ref_pm == null) {
                    ul.b((byte) 86);
                    c.field_d.d(j.field_b + -(c.field_d.field_w >> -520710623), -(c.field_d.field_p >> -80635967) + tm.field_g);
                    if ((ke.field_p.field_f ^ -1) < -1) {
                      rk.a(j.field_b - (c.field_d.field_w >> 1175213633), tm.field_g - (c.field_d.field_p >> -1532224799), (c.field_d.field_w >> 754109761) + j.field_b, -(c.field_d.field_p >> -1055677983) + tm.field_g, 40, ke.field_p.field_f, pj.field_d);
                      rk.a((c.field_d.field_w >> 1488812609) + j.field_b, -(c.field_d.field_p >> -1740488575) + tm.field_g, (c.field_d.field_w >> 878374113) + j.field_b, tm.field_g + (c.field_d.field_p >> -709682687), 40, ke.field_p.field_f, pj.field_d);
                      rk.a((c.field_d.field_w >> -524379871) + j.field_b, tm.field_g + (c.field_d.field_p >> -1496783103), -(c.field_d.field_w >> -798391391) + j.field_b, tm.field_g - -(c.field_d.field_p >> 1947554369), 40, ke.field_p.field_f, pj.field_d);
                      rk.a(j.field_b + -(c.field_d.field_w >> -1295443103), tm.field_g - -(c.field_d.field_p >> -1354931231), j.field_b - (c.field_d.field_w >> -1365650591), tm.field_g - (c.field_d.field_p >> -1493913631), 40, ke.field_p.field_f, pj.field_d);
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    rk.a(var4_ref_pm.field_m, var4_ref_pm.field_h, var4_ref_pm.field_r << -949217277, 10000);
                    var4_ref_pm = (pm) (Object) gd.field_n.a(16213);
                    continue L12;
                  }
                }
              } else {
                break L9;
              }
            }
            var3_ref_fl = (fl) (Object) sh.field_tb.a((byte) -108);
            L13: while (true) {
              if (var3_ref_fl == null) {
                break L2;
              } else {
                L14: {
                  var4 = var3_ref_fl.field_n >> 1113140140;
                  var6 = 512 + (var3_ref_fl.field_m >> -2081407860);
                  var5 = var3_ref_fl.field_p >> 926962540;
                  if (-1 > (var6 ^ -1)) {
                    df.a((var4 << 872440237) / var6 + (j.field_b << 709710660), (tm.field_g << -1694155324) + (var5 << 2046275885) / var6, 65536 / var6, var3_ref_fl.field_o * 5 / 3, pj.field_d);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                var3_ref_fl = (fl) (Object) sh.field_tb.a(16213);
                continue L13;
              }
            }
          }
        }
        var3 = 14 / ((param0 - -76) / 33);
    }

    final void b(boolean param0) {
        Object var2 = null;
        int var7 = 0;
        Object var8 = null;
        Object stackIn_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        h stackOut_1_0 = null;
        L0: {
          var7 = field_F ? 1 : 0;
          if (null == ih.field_b) {
            stackOut_2_0 = fi.field_v;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ih.field_b;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var8 = stackIn_3_0;
        var2 = var8;
        if (!j.a(-1)) {
          uh.a((byte) 46, (java.awt.Canvas) var8);
          return;
        } else {
          cm.a((java.awt.Canvas) var8, (byte) -47, mi.a((byte) -121));
          return;
        }
    }

    private final static int q(int param0) {
        int var1 = -13 / ((param0 - -32) / 40);
        return sg.field_n;
    }

    private final void a(int param0, eh param1) {
        qb var4 = null;
        qb var5 = null;
        qb var6 = null;
        qb var7 = null;
        qb var8 = null;
        qb var9 = null;
        qb var10 = null;
        qb var11 = null;
        qb var12 = null;
        qb var13 = null;
        qb var14 = null;
        qb var15 = null;
        qb var16 = null;
        qb var17 = null;
        qb var18 = null;
        qb var19 = null;
        qb var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        qb var26 = null;
        qb var27 = null;
        fk.a(1.0f);
        fk.a();
        if (param0 == 1053) {
          L0: {
            var27 = qb.a(param1, "", "scenery_walls");
            var4 = qb.a(param1, "", "scenery_walls2");
            var5 = qb.a(param1, "", "scenery_game-table");
            var6 = qb.a(param1, "", "scenery_floor");
            var7 = qb.a(param1, "", "scenery_props1");
            var8 = qb.a(param1, "", "scenery_props2");
            var9 = qb.a(param1, "", "scenery_ceiling");
            var10 = qb.a(param1, "", "scenery_door");
            var11 = qb.a(param1, "", "scenery_game-screen_back");
            var12 = qb.a(param1, "", "scenery_game-screen_front");
            var13 = qb.a(param1, "", "scenery_game-screen_front-left");
            var14 = qb.a(param1, "", "scenery_game-screen_back-left");
            var15 = qb.a(param1, "", "scenery_game-screen_back-top");
            var16 = qb.a(param1, "", "scenery_game-screen_front-right");
            var17 = qb.a(param1, "", "scenery_game-screen_back-right");
            var18 = qb.a(param1, "", "scenery_game-screen_front-top");
            var19 = qb.a(param1, "", "scenery_game-screen_front-black");
            var20 = qb.a(param1, "", "scenery_game-screen_back-black");
            this.a(var11, (byte) 69);
            this.a(var12, (byte) 69);
            this.a(var13, (byte) 69);
            this.a(var14, (byte) 69);
            this.a(var16, (byte) 69);
            this.a(var17, (byte) 69);
            this.a(var15, (byte) 69);
            this.a(var18, (byte) 69);
            this.a(var19, (byte) 69);
            this.a(var20, (byte) 69);
            ((Virogrid) this).field_J = this.a((byte) 124, var11);
            ((Virogrid) this).field_K = this.a((byte) 118, var12);
            ((Virogrid) this).field_D = this.a((byte) 94, var13);
            ((Virogrid) this).field_B = this.a((byte) 116, var16);
            ((Virogrid) this).field_C = this.a((byte) 74, var18);
            ((Virogrid) this).field_L = this.a((byte) 116, var19);
            ((Virogrid) this).field_M = this.a((byte) 64, var14);
            ((Virogrid) this).field_G = this.a((byte) 69, var17);
            ((Virogrid) this).field_H = this.a((byte) 107, var15);
            ((Virogrid) this).field_N = this.a((byte) 69, var20);
            var21 = 96;
            var22 = 2260;
            var23 = 0;
            var24 = 256;
            var25 = 0;
            if (db.b((byte) 13, 0)) {
              var26 = qb.a(param1, "", "ghost_untextured");
              ri.field_a = (il) (Object) var26.a(var21, var22, var23, var24, var25);
              var23 = 64;
              var21 = 42;
              break L0;
            } else {
              break L0;
            }
          }
          kf.field_c = (il) (Object) var27.a(var21, var22, var23, var24, var25);
          cm.field_k = (il) (Object) var4.a(var21, var22, var23, var24, var25);
          fl.field_s = (il) (Object) var5.a(var21, var22, var23, var24, var25);
          nb.field_x = (il) (Object) var6.a(var21, var22, var23, var24, var25);
          ba.field_c = (il) (Object) var7.a(var21, var22, var23, var24, var25);
          wf.field_j = (il) (Object) var8.a(var21, var22, var23, var24, var25);
          kg.field_c = (il) (Object) var9.a(var21, var22, var23, var24, var25);
          lk.field_Qb = (il) (Object) var10.a(var21, var22, var23, var24, var25);
          var13.d();
          var14.d();
          var14.a((ll) (Object) var13, 0, 0, 0, false);
          var16.d();
          var17.d();
          var17.a((ll) (Object) var16, 0, 0, 0, false);
          th.field_y = (il) (Object) var11.a(var21, var22, var23, var24, var25);
          ee.field_a = (il) (Object) var12.a(var21, var22, var23, var24, var25);
          qg.field_h = (il) (Object) var14.a(var21, var22, var23, var24, var25);
          jg.field_i = (il) (Object) var17.a(var21, var22, var23, var24, var25);
          pj.field_a = (il) (Object) var15.a(var21, var22, var23, var24, var25);
          ab.field_L = (il) (Object) var13.a(var21, var22, var23, var24, var25);
          rc.field_o = (il) (Object) var16.a(var21, var22, var23, var24, var25);
          og.field_l = (il) (Object) var18.a(var21, var22, var23, var24, var25);
          hn.field_x = (il) (Object) var20.a(var21, var22, var23, var24, var25);
          td.field_i = (il) (Object) var19.a(var21, var22, var23, var24, var25);
          return;
        } else {
          return;
        }
    }

    final void c(int param0) {
        int var2 = 0;
        Object var2_ref = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        String[] var5_ref_String__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        ic var7_ref_ic = null;
        String var8 = null;
        String var9 = null;
        int var9_int = 0;
        int var11 = 0;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        double stackIn_33_0 = 0.0;
        int stackIn_46_0 = 0;
        String[] stackIn_56_0 = null;
        String[] stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        String[] stackIn_57_0 = null;
        String[] stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        String[] stackIn_58_0 = null;
        String[] stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        String stackIn_58_3 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        double stackOut_32_0 = 0.0;
        double stackOut_31_0 = 0.0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        String[] stackOut_55_0 = null;
        String[] stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        String[] stackOut_57_0 = null;
        String[] stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        String stackOut_57_3 = null;
        String[] stackOut_56_0 = null;
        String[] stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        String stackOut_56_3 = null;
        L0: {
          var11 = field_F ? 1 : 0;
          int discarded$4 = lj.c(param0 ^ -28791807);
          tl.field_l = km.e(param0 ^ -125);
          kh.a(false);
          if (null == ih.field_b) {
            break L0;
          } else {
            if (!ih.field_b.field_a) {
              break L0;
            } else {
              am.a((byte) -16);
              qc.b((byte) -12);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (ih.field_b == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((Virogrid) this).a(stackIn_6_1 != 0, 121);
          if (!i.field_w) {
            break L2;
          } else {
            this.t(param0 ^ 13);
            i.field_w = false;
            break L2;
          }
        }
        L3: {
          id.field_r = id.field_r + 1;
          if (id.field_r != 500) {
            break L3;
          } else {
            if (10 != hm.field_c) {
              break L3;
            } else {
              el.a(12229, false);
              break L3;
            }
          }
        }
        L4: {
          if (!j.a(-1)) {
            break L4;
          } else {
            ((Virogrid) this).m(1);
            if (!j.a(-1)) {
              break L4;
            } else {
              if (!me.b(66)) {
                return;
              } else {
                boolean discarded$5 = this.c((byte) -42, false);
                return;
              }
            }
          }
        }
        L5: {
          jb.a(og.field_b, param0 + 45);
          if (!this.c((byte) -42, true)) {
            break L5;
          } else {
            i.field_H = true;
            break L5;
          }
        }
        L6: while (true) {
          if (!kd.a(-122, jc.field_i)) {
            L7: {
              al.b(-1, param0);
              if (i.field_y == -2) {
                bl.field_B = true;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (!bl.field_B) {
                break L8;
              } else {
                wc.field_j = 0;
                break L8;
              }
            }
            L9: {
              if (eg.b((byte) -121)) {
                L10: {
                  L11: {
                    var2 = ((Virogrid) this).g(0);
                    if (var2 == 0) {
                      break L11;
                    } else {
                      if (var2 != 1) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ti.c(114);
                  if ((var2 ^ -1) != -2) {
                    L12: {
                      if (aj.field_a) {
                        L13: {
                          vm.field_e = false;
                          mn.field_e = true;
                          th.field_q = true;
                          if (!dd.field_a) {
                            gb.a(-2, 0, false, 0);
                            break L13;
                          } else {
                            kn.field_J = mi.field_f;
                            gb.a(-2, 0, false, 9);
                            break L13;
                          }
                        }
                        wm.c((byte) -86);
                        ka.a(true, (byte) 87);
                        al.field_j[i.field_y].a((byte) 120, 0, false);
                        on.field_d = false;
                        dd.field_a = false;
                        aj.field_a = false;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    eh.field_e = false;
                    qe.field_k = false;
                    break L10;
                  } else {
                    qe.field_k = true;
                    eh.field_e = true;
                    break L10;
                  }
                }
                L14: {
                  var3 = 0;
                  if (2 != var2) {
                    break L14;
                  } else {
                    var3 = 1;
                    break L14;
                  }
                }
                L15: {
                  L16: {
                    if (aj.field_a) {
                      break L16;
                    } else {
                      if (qe.field_k) {
                        break L16;
                      } else {
                        if (eh.field_e) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  var3 = 1;
                  break L15;
                }
                if (var3 != 0) {
                  ve.c((byte) -121);
                  break L9;
                } else {
                  break L9;
                }
              } else {
                break L9;
              }
            }
            return;
          } else {
            if (9 == ci.field_q) {
              wm.c((byte) -86);
              jk.field_c = 2;
              ec.field_z = 3.1415927410125732f;
              hm.field_c = 9;
              qe.field_k = false;
              em.field_c = 128.0f;
              kn.field_J = sh.field_qb.h(-117);
              continue L6;
            } else {
              if (-15 == (ci.field_q ^ -1)) {
                pe discarded$6 = vm.a((byte) 30, ih.field_d);
                wm.c((byte) -86);
                jj.a(ra.a(8742, 2), ci.j(param0 + -126), ra.field_e, 8, eg.d(1048576), 1024, 150, ra.a(8742, 2000), wn.field_j.length, ri.b((byte) 51));
                dl.a(bf.a((byte) -96), (byte) -127, fa.c(16777215));
                hm.field_c = -2;
                qe.field_k = false;
                aj.field_a = true;
                continue L6;
              } else {
                if (ci.field_q == 15) {
                  L17: {
                    if (aj.field_a) {
                      L18: {
                        L19: {
                          wm.c((byte) -86);
                          wm.b(param0 ^ 2);
                          fn.a((byte) -69);
                          hm.field_c = 0;
                          th.field_q = true;
                          mn.field_e = true;
                          vm.field_e = false;
                          dd.field_a = false;
                          aj.field_a = false;
                          on.field_d = false;
                          jm.a(320, 240, param0 ^ -2);
                          if (null == vg.field_I) {
                            break L19;
                          } else {
                            if (1 == vg.field_I.field_e) {
                              stackOut_32_0 = 0.0;
                              stackIn_33_0 = stackOut_32_0;
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        stackOut_31_0 = 3.141592653589793;
                        stackIn_33_0 = stackOut_31_0;
                        break L18;
                      }
                      sj.field_o = (float)stackIn_33_0;
                      el.a(false, (byte) -106);
                      vm.field_d[0] = (double)lj.field_r * Math.sin((double)cf.field_c);
                      vm.field_d[2] = (double)lj.field_r * Math.cos((double)cf.field_c);
                      ka.a(true, (byte) 87);
                      gb.c((byte) -44);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  eh.field_e = false;
                  qe.field_k = false;
                  continue L6;
                } else {
                  L20: {
                    if ((ci.field_q ^ -1) != -11) {
                      break L20;
                    } else {
                      if (!aj.field_a) {
                        break L20;
                      } else {
                        bj.a(-51);
                        continue L6;
                      }
                    }
                  }
                  if (67 != ci.field_q) {
                    L21: {
                      if (ci.field_q == 57) {
                        break L21;
                      } else {
                        if (ci.field_q == 58) {
                          break L21;
                        } else {
                          if (-60 != (ci.field_q ^ -1)) {
                            L22: {
                              var2_ref = null;
                              if (dd.field_a) {
                                var2_ref = (Object) (Object) vg.field_I;
                                break L22;
                              } else {
                                if (!on.field_d) {
                                  break L22;
                                } else {
                                  var2_ref = (Object) (Object) ei.field_b;
                                  break L22;
                                }
                              }
                            }
                            L23: {
                              if (var2_ref != null) {
                                if (-61 == (ci.field_q ^ -1)) {
                                  L24: {
                                    var3 = sh.field_qb.g(11132);
                                    var4_int = sh.field_qb.g(11132);
                                    var5 = sh.field_qb.c((byte) -92);
                                    ((ic) var2_ref).field_C.a(var3, var4_int, 21428);
                                    if (((ic) var2_ref).field_C.field_v != -1) {
                                      break L24;
                                    } else {
                                      ((ic) var2_ref).field_C.field_v = var3;
                                      break L24;
                                    }
                                  }
                                  ((ic) var2_ref).field_C.a(((ic) var2_ref).field_A.field_h, ((ic) var2_ref).field_C.field_A, (byte) 14);
                                  ((ic) var2_ref).field_w = var5 + -50;
                                  if (1 <= ((ic) var2_ref).field_w) {
                                    continue L6;
                                  } else {
                                    ((ic) var2_ref).field_w = 1;
                                    continue L6;
                                  }
                                } else {
                                  if (ci.field_q == 61) {
                                    var3 = sh.field_qb.g(param0 ^ 11132);
                                    var4_int = sh.field_qb.g(param0 + 11132);
                                    var5 = sh.field_qb.g(param0 ^ 11132);
                                    var6 = sh.field_qb.g(11132);
                                    var7 = sh.field_qb.g(11132);
                                    int discarded$7 = ((ic) var2_ref).field_C.a(var6, var7, (byte) 119, var3, var4_int, var5);
                                    ((ic) var2_ref).field_A.a(((ic) var2_ref).field_g, 31626);
                                    ((ic) var2_ref).field_A.field_k = -1;
                                    ((ic) var2_ref).field_D = false;
                                    ((ic) var2_ref).field_A.field_c = -1;
                                    continue L6;
                                  } else {
                                    if (-63 != (ci.field_q ^ -1)) {
                                      if (-64 != (ci.field_q ^ -1)) {
                                        if (64 != ci.field_q) {
                                          if (ci.field_q == 65) {
                                            ((ic) var2_ref).field_C.field_b = sh.field_qb.g(param0 ^ 11132);
                                            if (null == vg.field_I) {
                                              continue L6;
                                            } else {
                                              fe.g(1);
                                              continue L6;
                                            }
                                          } else {
                                            if (66 != ci.field_q) {
                                              break L23;
                                            } else {
                                              ((ic) var2_ref).field_v = sh.field_qb.g(11132);
                                              if (null == vg.field_I) {
                                                continue L6;
                                              } else {
                                                fe.g(1);
                                                continue L6;
                                              }
                                            }
                                          }
                                        } else {
                                          ((ic) var2_ref).field_C.field_r = sh.field_qb.g(11132);
                                          continue L6;
                                        }
                                      } else {
                                        ((ic) var2_ref).field_C.field_D = sh.field_qb.g(11132);
                                        if (null == vg.field_I) {
                                          continue L6;
                                        } else {
                                          mn.a(false);
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      L25: {
                                        var3 = sh.field_qb.a((byte) -72);
                                        ((ic) var2_ref).field_C.d(-39, var3);
                                        ((ic) var2_ref).field_C.c((int) sh.field_qb.a((byte) -103), 2);
                                        var4 = var2_ref;
                                        if (1 == (((ic) var4).field_e ^ -1)) {
                                          break L25;
                                        } else {
                                          ((ic) var4).a(false, -1, 22273, false);
                                          break L25;
                                        }
                                      }
                                      ((ic) var4).field_n = 0;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                break L23;
                              }
                            }
                            ((Virogrid) this).n(-108);
                            continue L6;
                          } else {
                            L26: {
                              L27: {
                                if (dd.field_a) {
                                  break L27;
                                } else {
                                  if (on.field_d) {
                                    break L27;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              L28: {
                                wm.c((byte) -86);
                                if (dd.field_a) {
                                  vg.field_I.a((byte) -70, false);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              ka.a(true, (byte) 87);
                              bl.field_B = true;
                              vm.field_e = false;
                              hm.field_c = -2;
                              th.field_q = true;
                              dd.field_a = false;
                              wc.field_j = 0;
                              on.field_d = false;
                              break L26;
                            }
                            eh.field_e = false;
                            continue L6;
                          }
                        }
                      }
                    }
                    L29: {
                      wm.c((byte) -86);
                      var2 = sh.field_qb.g(11132);
                      var3 = sh.field_qb.g(11132);
                      if ((sh.field_qb.g(11132) ^ -1) == -1) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L29;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L29;
                      }
                    }
                    var4_int = stackIn_46_0;
                    var5_ref_String__ = new String[2];
                    var7 = 0;
                    L30: while (true) {
                      if ((var5_ref_String__.length ^ -1) >= (var7 ^ -1)) {
                        L31: {
                          var6 = -2;
                          var6 = sh.field_qb.a((byte) 62);
                          var6 = var6 - (var6 >>> 677961951);
                          var7_ref_ic = new ic(true, var2, var5_ref_String__, var6, var4_int != 0, var3, 0);
                          var7_ref_ic.field_C.a((jc) (Object) sh.field_qb, (byte) 57);
                          var7_ref_ic.field_A.a(false);
                          if (-58 != (ci.field_q ^ -1)) {
                            ei.field_b = var7_ref_ic;
                            on.field_d = true;
                            var8 = var7_ref_ic.field_C.field_c[0];
                            var9 = var7_ref_ic.field_C.field_c[1];
                            var14 = oi.a(new String[2], lm.field_k, 2);
                            gf.a(mi.field_d, 0, false, var14, 1, var7_ref_ic.field_C.field_c[0]);
                            break L31;
                          } else {
                            L32: {
                              dd.field_a = true;
                              vg.field_I = var7_ref_ic;
                              if (!var7_ref_ic.field_t) {
                                break L32;
                              } else {
                                var8 = var7_ref_ic.field_C.field_c[0];
                                var9_int = 0;
                                L33: while (true) {
                                  if (!jc.a(var8, true)) {
                                    var12 = oi.a(new String[1], pc.field_e, 2);
                                    gf.a(mi.field_d, 0, false, var12, 1, var7_ref_ic.field_C.field_c[0]);
                                    break L32;
                                  } else {
                                    var9_int++;
                                    var8 = var7_ref_ic.field_C.field_c[var9_int];
                                    continue L33;
                                  }
                                }
                              }
                            }
                            L34: {
                              stackOut_55_0 = new String[1];
                              stackOut_55_1 = new String[1];
                              stackOut_55_2 = 0;
                              stackIn_57_0 = stackOut_55_0;
                              stackIn_57_1 = stackOut_55_1;
                              stackIn_57_2 = stackOut_55_2;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              stackIn_56_2 = stackOut_55_2;
                              if (-1 != (var6 ^ -1)) {
                                stackOut_57_0 = (String[]) (Object) stackIn_57_0;
                                stackOut_57_1 = (String[]) (Object) stackIn_57_1;
                                stackOut_57_2 = stackIn_57_2;
                                stackOut_57_3 = pb.field_k;
                                stackIn_58_0 = stackOut_57_0;
                                stackIn_58_1 = stackOut_57_1;
                                stackIn_58_2 = stackOut_57_2;
                                stackIn_58_3 = stackOut_57_3;
                                break L34;
                              } else {
                                stackOut_56_0 = (String[]) (Object) stackIn_56_0;
                                stackOut_56_1 = (String[]) (Object) stackIn_56_1;
                                stackOut_56_2 = stackIn_56_2;
                                stackOut_56_3 = uk.field_g;
                                stackIn_58_0 = stackOut_56_0;
                                stackIn_58_1 = stackOut_56_1;
                                stackIn_58_2 = stackOut_56_2;
                                stackIn_58_3 = stackOut_56_3;
                                break L34;
                              }
                            }
                            stackIn_58_1[stackIn_58_2] = stackIn_58_3;
                            var13 = oi.a(stackIn_58_0, rf.field_f, 2);
                            gf.a(mi.field_d, 0, false, var13, 1, var7_ref_ic.field_C.field_c[0]);
                            break L31;
                          }
                        }
                        lj.b(122);
                        eh.field_e = false;
                        vm.field_e = true;
                        hm.field_c = -1;
                        continue L6;
                      } else {
                        var5_ref_String__[var7] = sh.field_qb.i(15070);
                        var7++;
                        continue L30;
                      }
                    }
                  } else {
                    var2 = sh.field_qb.g(11132);
                    var3 = 1 << var2;
                    rn.field_c = rn.field_c | var3;
                    ((Virogrid) this).field_I.a((l) (Object) new hj(var2), (byte) -61);
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    public final void init() {
        ((Virogrid) this).a("virogrid", 15, (byte) 118);
    }

    private final int[] a(byte param0, qb param1) {
        if (param0 <= 61) {
            ck discarded$0 = Virogrid.b((byte) 94, false);
        }
        return bi.field_c;
    }

    private final void e(boolean param0) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        double[] var11_ref_double__ = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        fl var16_ref = null;
        int var17 = 0;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        double[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        double[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        double[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        double[] var37 = null;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_71_0 = 0;
        il stackIn_90_0 = null;
        il stackIn_91_0 = null;
        il stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        il stackIn_100_0 = null;
        il stackIn_101_0 = null;
        il stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        il stackIn_105_0 = null;
        il stackIn_106_0 = null;
        il stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        il stackIn_110_0 = null;
        il stackIn_111_0 = null;
        il stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        il stackIn_115_0 = null;
        il stackIn_116_0 = null;
        il stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        il stackIn_119_0 = null;
        il stackIn_120_0 = null;
        il stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        il stackOut_99_0 = null;
        il stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        il stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        il stackOut_109_0 = null;
        il stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        il stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        il stackOut_114_0 = null;
        il stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        il stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        il stackOut_118_0 = null;
        il stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        il stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        il stackOut_104_0 = null;
        il stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        il stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        il stackOut_89_0 = null;
        il stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        il stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        L0: {
          L1: {
            var16 = null;
            var17 = field_F ? 1 : 0;
            var2 = param0 ? 1 : 0;
            if (i.field_y != hm.field_c) {
              break L1;
            } else {
              if (pg.field_g == nf.field_g) {
                if ((i.field_y ^ -1) == 1) {
                  ej.a(false, 25680);
                  var2 = 0;
                  break L0;
                } else {
                  lm.a(i.field_y, -1, true, nf.field_g, 0);
                  break L0;
                }
              } else {
                break L1;
              }
            }
          }
          if (1 != (i.field_y ^ -1)) {
            if (1 != (hm.field_c ^ -1)) {
              if ((we.field_l ^ -1) <= -17) {
                lm.a(hm.field_c, 1 + (-we.field_l + 32), false, pg.field_g, 0);
                break L0;
              } else {
                lm.a(i.field_y, we.field_l - -1, false, nf.field_g, 0);
                break L0;
              }
            } else {
              if (we.field_l >= 16) {
                var2 = 0;
                ej.a(false, 25680);
                break L0;
              } else {
                lm.a(i.field_y, -1, false, nf.field_g, 0);
                break L0;
              }
            }
          } else {
            if (-17 >= (we.field_l ^ -1)) {
              lm.a(hm.field_c, -1, false, pg.field_g, 0);
              break L0;
            } else {
              var2 = 0;
              ej.a(false, 25680);
              break L0;
            }
          }
        }
        L2: {
          if (var2 == 0) {
            break L2;
          } else {
            df.b(0, 0, 640, 480, 3158064);
            this.e((byte) -62);
            pc.a(mk.field_bb, (byte) -86);
            si.a(nk.field_K, new double[3], new double[3], 64.0, 114.0, mk.field_bb, 2621440, 10420224, 10485760, 26148864, ke.field_p.field_k);
            lk.field_Qb.a(pe.field_j, bi.field_c);
            var33 = new int[12];
            var28 = var33;
            var23 = var28;
            var18 = var23;
            var3 = var18;
            var4 = 0;
            L3: while (true) {
              if (var4 >= 3) {
                var4 = 3;
                L4: while (true) {
                  if ((var4 ^ -1) <= (var33.length ^ -1)) {
                    L5: {
                      if (vm.field_d[2] <= 0.0) {
                        stackOut_26_0 = 0;
                        stackIn_27_0 = stackOut_26_0;
                        break L5;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_27_0 = stackOut_25_0;
                        break L5;
                      }
                    }
                    L6: {
                      var4 = stackIn_27_0;
                      if (0.0 >= vm.field_d[0]) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L6;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L6;
                      }
                    }
                    L7: {
                      L8: {
                        var5 = stackIn_30_0;
                        if (72.0 < vm.field_d[0]) {
                          break L8;
                        } else {
                          if (vm.field_d[0] >= -72.0) {
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      stackOut_33_0 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      break L7;
                    }
                    L9: {
                      L10: {
                        var6 = stackIn_35_0;
                        if ((we.field_c.field_F ^ -1) != (((Virogrid) this).field_E ^ -1)) {
                          break L10;
                        } else {
                          if (da.field_k[0] != vm.field_d[0]) {
                            break L10;
                          } else {
                            if (vm.field_d[1] != da.field_k[1]) {
                              break L10;
                            } else {
                              if (vm.field_d[2] != da.field_k[2]) {
                                break L10;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                      }
                      L11: {
                        ((Virogrid) this).field_E = we.field_c.field_F;
                        da.field_k[1] = vm.field_d[1];
                        da.field_k[2] = vm.field_d[2];
                        da.field_k[0] = vm.field_d[0];
                        qc.a(118);
                        vb.field_l.b();
                        df.b(0, 0, 640, 480, 0);
                        kg.field_c.a(pe.field_j, bi.field_c);
                        nb.field_x.a(pe.field_j, bi.field_c);
                        kf.field_c.a(pe.field_j, bi.field_c);
                        cm.field_k.a(pe.field_j, bi.field_c);
                        ba.field_c.a(pe.field_j, bi.field_c);
                        wf.field_j.a(pe.field_j, bi.field_c);
                        fl.field_s.a(pe.field_j, bi.field_c);
                        if (var4 == 0) {
                          th.field_y.a(var33, ((Virogrid) this).field_J);
                          pj.field_a.a(var33, ((Virogrid) this).field_H);
                          if (var5 == 0) {
                            L12: {
                              if (var6 != 0) {
                                break L12;
                              } else {
                                qg.field_h.a(var33, ((Virogrid) this).field_M);
                                break L12;
                              }
                            }
                            jg.field_i.a(var33, ((Virogrid) this).field_G);
                            break L11;
                          } else {
                            L13: {
                              if (var6 == 0) {
                                jg.field_i.a(var33, ((Virogrid) this).field_G);
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            qg.field_h.a(var33, ((Virogrid) this).field_M);
                            break L11;
                          }
                        } else {
                          ee.field_a.a(var33, ((Virogrid) this).field_K);
                          og.field_l.a(var33, ((Virogrid) this).field_J);
                          if (var5 == 0) {
                            L14: {
                              if (var6 != 0) {
                                break L14;
                              } else {
                                ab.field_L.a(var33, ((Virogrid) this).field_D);
                                break L14;
                              }
                            }
                            rc.field_o.a(var33, ((Virogrid) this).field_B);
                            break L11;
                          } else {
                            L15: {
                              if (var6 == 0) {
                                rc.field_o.a(var33, ((Virogrid) this).field_B);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            ab.field_L.a(var33, ((Virogrid) this).field_D);
                            break L11;
                          }
                        }
                      }
                      L16: {
                        if (var4 == 0) {
                          td.field_i.a(var33, ((Virogrid) this).field_L);
                          break L16;
                        } else {
                          hn.field_x.a(var33, ((Virogrid) this).field_N);
                          break L16;
                        }
                      }
                      ul.b((byte) 116);
                      break L9;
                    }
                    L17: {
                      vb.field_l.d(0, 0);
                      var7 = id.field_r % 64;
                      if (32 > var7) {
                        stackOut_63_0 = -16 + var7;
                        stackIn_64_0 = stackOut_63_0;
                        break L17;
                      } else {
                        stackOut_62_0 = -var7 + 48;
                        stackIn_64_0 = stackOut_62_0;
                        break L17;
                      }
                    }
                    L18: {
                      var7 = stackIn_64_0;
                      var7 = var7 << 2;
                      if (!ke.field_p.field_d) {
                        break L18;
                      } else {
                        var7 = 0;
                        break L18;
                      }
                    }
                    L19: {
                      var36 = new int[3];
                      var31 = var36;
                      var26 = var31;
                      var21 = var26;
                      var8 = var21;
                      var34 = new int[3];
                      var29 = var34;
                      var24 = var29;
                      var19 = var24;
                      var9 = var19;
                      var35 = new int[3];
                      var30 = var35;
                      var25 = var30;
                      var20 = var25;
                      var10 = var20;
                      var8[0] = (int)ao.field_Hb << 2115963748;
                      var34[0] = 800;
                      var8[1] = -(int)ao.field_Hb << 62284740;
                      var35[0] = var7;
                      var34[1] = 800;
                      var36[2] = 0;
                      var35[1] = var7;
                      var34[2] = 1280;
                      var35[2] = 0;
                      si.a(pe.field_j, var36, var34, var35);
                      if (ke.field_p.field_m) {
                        L20: {
                          var11 = id.field_r % 128;
                          if (-65 < (var11 ^ -1)) {
                            stackOut_70_0 = var11;
                            stackIn_71_0 = stackOut_70_0;
                            break L20;
                          } else {
                            stackOut_69_0 = -var11 + 128;
                            stackIn_71_0 = stackOut_69_0;
                            break L20;
                          }
                        }
                        var11 = stackIn_71_0;
                        var12 = 38784 - -(var11 * 2);
                        qf.a(240, 0, 0, var36, var34, var35, var12, var12, var12);
                        var7 = var36[0];
                        var8[0] = var36[1];
                        var36[1] = var7;
                        var7 = var34[0];
                        var9[0] = var34[1];
                        var34[1] = var7;
                        var7 = var35[0];
                        var10[0] = var35[1];
                        var35[1] = var7;
                        qf.a(240, 0, 0, var36, var34, var35, var12, var12, var12);
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L21: {
                      if (!ke.field_p.field_d) {
                        System.out.println("Warning, drawing non-single plane");
                        break L21;
                      } else {
                        L22: {
                          if (0.0 > nk.field_K[11]) {
                            var37 = new double[ad.field_g.length];
                            var32 = var37;
                            var27 = var32;
                            var22 = var27;
                            var11_ref_double__ = var22;
                            var12 = 0;
                            L23: while (true) {
                              if ((var12 ^ -1) <= (var37.length ^ -1)) {
                                si.a(nk.field_K, new double[3], var11_ref_double__, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                                break L22;
                              } else {
                                var11_ref_double__[var12] = -ad.field_g[var12];
                                var12++;
                                continue L23;
                              }
                            }
                          } else {
                            si.a(nk.field_K, new double[3], ad.field_g, (double)ao.field_Hb, (double)we.field_k, c.field_d, 7208960, 34668544, 0, 26148864, ke.field_p.field_k);
                            break L22;
                          }
                        }
                        if (ke.field_p.field_f > 0) {
                          si.a(nk.field_K, new double[3], ad.field_g, (double)ao.field_Hb, (double)we.field_k, pj.field_d, 40, ke.field_p.field_f);
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var16_ref = (fl) (Object) sh.field_tb.a((byte) -61);
                    L24: while (true) {
                      if (var16_ref == null) {
                        if (var4 != 0) {
                          L25: {
                            stackOut_99_0 = th.field_y;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_100_0 = stackOut_99_0;
                            if (param0) {
                              stackOut_101_0 = (il) (Object) stackIn_101_0;
                              stackOut_101_1 = 0;
                              stackIn_102_0 = stackOut_101_0;
                              stackIn_102_1 = stackOut_101_1;
                              break L25;
                            } else {
                              stackOut_100_0 = (il) (Object) stackIn_100_0;
                              stackOut_100_1 = 1;
                              stackIn_102_0 = stackOut_100_0;
                              stackIn_102_1 = stackOut_100_1;
                              break L25;
                            }
                          }
                          sj.a(stackIn_102_0, stackIn_102_1 != 0, var33, ((Virogrid) this).field_J);
                          sj.a(pj.field_a, false, var33, ((Virogrid) this).field_H);
                          if (var5 != 0) {
                            L26: {
                              stackOut_109_0 = qg.field_h;
                              stackIn_111_0 = stackOut_109_0;
                              stackIn_110_0 = stackOut_109_0;
                              if (param0) {
                                stackOut_111_0 = (il) (Object) stackIn_111_0;
                                stackOut_111_1 = 0;
                                stackIn_112_0 = stackOut_111_0;
                                stackIn_112_1 = stackOut_111_1;
                                break L26;
                              } else {
                                stackOut_110_0 = (il) (Object) stackIn_110_0;
                                stackOut_110_1 = 1;
                                stackIn_112_0 = stackOut_110_0;
                                stackIn_112_1 = stackOut_110_1;
                                break L26;
                              }
                            }
                            L27: {
                              sj.a(stackIn_112_0, stackIn_112_1 != 0, var33, ((Virogrid) this).field_M);
                              if (var6 != 0) {
                                L28: {
                                  stackOut_114_0 = rc.field_o;
                                  stackIn_116_0 = stackOut_114_0;
                                  stackIn_115_0 = stackOut_114_0;
                                  if (param0) {
                                    stackOut_116_0 = (il) (Object) stackIn_116_0;
                                    stackOut_116_1 = 0;
                                    stackIn_117_0 = stackOut_116_0;
                                    stackIn_117_1 = stackOut_116_1;
                                    break L28;
                                  } else {
                                    stackOut_115_0 = (il) (Object) stackIn_115_0;
                                    stackOut_115_1 = 1;
                                    stackIn_117_0 = stackOut_115_0;
                                    stackIn_117_1 = stackOut_115_1;
                                    break L28;
                                  }
                                }
                                sj.a(stackIn_117_0, stackIn_117_1 != 0, var33, ((Virogrid) this).field_B);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L29: {
                              stackOut_118_0 = jg.field_i;
                              stackIn_120_0 = stackOut_118_0;
                              stackIn_119_0 = stackOut_118_0;
                              if (param0) {
                                stackOut_120_0 = (il) (Object) stackIn_120_0;
                                stackOut_120_1 = 0;
                                stackIn_121_0 = stackOut_120_0;
                                stackIn_121_1 = stackOut_120_1;
                                break L29;
                              } else {
                                stackOut_119_0 = (il) (Object) stackIn_119_0;
                                stackOut_119_1 = 1;
                                stackIn_121_0 = stackOut_119_0;
                                stackIn_121_1 = stackOut_119_1;
                                break L29;
                              }
                            }
                            sj.a(stackIn_121_0, stackIn_121_1 != 0, var33, ((Virogrid) this).field_G);
                            break L2;
                          } else {
                            L30: {
                              sj.a(jg.field_i, false, var33, ((Virogrid) this).field_G);
                              if (var6 == 0) {
                                break L30;
                              } else {
                                L31: {
                                  stackOut_104_0 = ab.field_L;
                                  stackIn_106_0 = stackOut_104_0;
                                  stackIn_105_0 = stackOut_104_0;
                                  if (param0) {
                                    stackOut_106_0 = (il) (Object) stackIn_106_0;
                                    stackOut_106_1 = 0;
                                    stackIn_107_0 = stackOut_106_0;
                                    stackIn_107_1 = stackOut_106_1;
                                    break L31;
                                  } else {
                                    stackOut_105_0 = (il) (Object) stackIn_105_0;
                                    stackOut_105_1 = 1;
                                    stackIn_107_0 = stackOut_105_0;
                                    stackIn_107_1 = stackOut_105_1;
                                    break L31;
                                  }
                                }
                                sj.a(stackIn_107_0, stackIn_107_1 != 0, var33, ((Virogrid) this).field_D);
                                break L30;
                              }
                            }
                            sj.a(qg.field_h, false, var33, ((Virogrid) this).field_M);
                            break L2;
                          }
                        } else {
                          L32: {
                            stackOut_89_0 = ee.field_a;
                            stackIn_91_0 = stackOut_89_0;
                            stackIn_90_0 = stackOut_89_0;
                            if (param0) {
                              stackOut_91_0 = (il) (Object) stackIn_91_0;
                              stackOut_91_1 = 0;
                              stackIn_92_0 = stackOut_91_0;
                              stackIn_92_1 = stackOut_91_1;
                              break L32;
                            } else {
                              stackOut_90_0 = (il) (Object) stackIn_90_0;
                              stackOut_90_1 = 1;
                              stackIn_92_0 = stackOut_90_0;
                              stackIn_92_1 = stackOut_90_1;
                              break L32;
                            }
                          }
                          sj.a(stackIn_92_0, stackIn_92_1 != 0, var33, ((Virogrid) this).field_K);
                          sj.a(og.field_l, false, var33, ((Virogrid) this).field_C);
                          if (var5 == 0) {
                            L33: {
                              sj.a(rc.field_o, false, var33, ((Virogrid) this).field_B);
                              if (var6 == 0) {
                                break L33;
                              } else {
                                sj.a(qg.field_h, false, var33, ((Virogrid) this).field_M);
                                break L33;
                              }
                            }
                            sj.a(ab.field_L, false, var33, ((Virogrid) this).field_D);
                            break L2;
                          } else {
                            L34: {
                              sj.a(ab.field_L, false, var33, ((Virogrid) this).field_D);
                              if (var6 == 0) {
                                break L34;
                              } else {
                                sj.a(jg.field_i, false, var33, ((Virogrid) this).field_G);
                                break L34;
                              }
                            }
                            sj.a(rc.field_o, false, var33, ((Virogrid) this).field_B);
                            break L2;
                          }
                        }
                      } else {
                        L35: {
                          var11 = -(pe.field_j[0] << -603747578) + (var16_ref.field_n >> 664161928);
                          var7 = -(pe.field_j[2] << -1367555290) + (var16_ref.field_m >> -435917880);
                          var12 = -(pe.field_j[1] << 533482790) + (var16_ref.field_p >> 1925002888);
                          var13 = pe.field_j[5] * var7 + var12 * pe.field_j[4] + var11 * pe.field_j[3];
                          var15 = var7 * pe.field_j[11] + (var12 * pe.field_j[10] + var11 * pe.field_j[9]);
                          var14 = var7 * pe.field_j[8] + var12 * pe.field_j[7] + pe.field_j[6] * var11;
                          var7 = var15 >> 144557622;
                          if (-1 <= (var15 ^ -1)) {
                            break L35;
                          } else {
                            df.a((j.field_b << 903978180) - -((var13 >> 1501989897) / var7), (var14 >> -890619063) / var7 + (tm.field_g << -1979774556), 16384 / var7, var16_ref.field_o * 5 / 3, pj.field_d);
                            break L35;
                          }
                        }
                        var16_ref = (fl) (Object) sh.field_tb.a(16213);
                        continue L24;
                      }
                    }
                  } else {
                    var3[var4] = pe.field_j[var4];
                    var4++;
                    continue L4;
                  }
                }
              } else {
                var3[var4] = pe.field_j[var4] << -188484317;
                var4++;
                continue L3;
              }
            }
          }
        }
        L36: {
          if (i.field_y != 10) {
            break L36;
          } else {
            if (-11 != (hm.field_c ^ -1)) {
              break L36;
            } else {
              ij.a((byte) 105);
              break L36;
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        int stackIn_80_0 = 0;
        int stackIn_93_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        var7 = field_F ? 1 : 0;
        if (!param0) {
          L0: {
            if (-1 == (tg.field_x ^ -1)) {
              L1: {
                var3 = 0;
                var4 = 0;
                if (!param1) {
                  L2: {
                    L3: {
                      if (i.field_y != hm.field_c) {
                        break L3;
                      } else {
                        if ((pg.field_g ^ -1) == (nf.field_g ^ -1)) {
                          if (i.field_y == -1) {
                            if (!aj.field_a) {
                              vg.field_I.a(-104, true);
                              L4: while (true) {
                                if (!nd.b((byte) -107)) {
                                  break L2;
                                } else {
                                  vg.field_I.d(117);
                                  continue L4;
                                }
                              }
                            } else {
                              var3 = 1;
                              var4 = 1;
                              break L2;
                            }
                          } else {
                            if ((i.field_y ^ -1) != 1) {
                              if (!mf.a(107, i.field_y)) {
                                break L2;
                              } else {
                                al.field_j[i.field_y].a((byte) -79);
                                break L2;
                              }
                            } else {
                              var3 = 1;
                              break L2;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    we.field_l = we.field_l + 1;
                    if (-33 == (we.field_l ^ -1)) {
                      wm.c((byte) -86);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (!aj.field_a) {
                    break L1;
                  } else {
                    if (qe.field_k) {
                      break L1;
                    } else {
                      if (!eh.field_e) {
                        L5: {
                          bc.a(var3 != 0, (byte) -120);
                          if (!on.field_d) {
                            break L5;
                          } else {
                            ei.field_b.a(-103, var4 != 0);
                            break L5;
                          }
                        }
                        L6: {
                          if (!dd.field_a) {
                            break L6;
                          } else {
                            vg.field_I.a(-111, var4 != 0);
                            break L6;
                          }
                        }
                        L7: while (true) {
                          if (!nd.b((byte) -111)) {
                            break L1;
                          } else {
                            L8: {
                              if (!bl.field_B) {
                                break L8;
                              } else {
                                boolean discarded$6 = ln.a(15, (byte) 104, 12, 13);
                                break L8;
                              }
                            }
                            L9: {
                              if (on.field_d) {
                                ei.field_b.d(-114);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (!dd.field_a) {
                              continue L7;
                            } else {
                              vg.field_I.d(-20);
                              continue L7;
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                } else {
                  if (!aj.field_a) {
                    break L1;
                  } else {
                    if (qe.field_k) {
                      break L1;
                    } else {
                      if (!eh.field_e) {
                        L10: {
                          bc.a(var3 != 0, (byte) -120);
                          if (!on.field_d) {
                            break L10;
                          } else {
                            ei.field_b.a(-103, var4 != 0);
                            break L10;
                          }
                        }
                        L11: {
                          if (!dd.field_a) {
                            break L11;
                          } else {
                            vg.field_I.a(-111, var4 != 0);
                            break L11;
                          }
                        }
                        L12: while (true) {
                          if (!nd.b((byte) -111)) {
                            break L1;
                          } else {
                            L13: {
                              if (!bl.field_B) {
                                break L13;
                              } else {
                                boolean discarded$7 = ln.a(15, (byte) 104, 12, 13);
                                break L13;
                              }
                            }
                            L14: {
                              if (on.field_d) {
                                ei.field_b.d(-114);
                                break L14;
                              } else {
                                break L14;
                              }
                            }
                            if (!dd.field_a) {
                              continue L12;
                            } else {
                              vg.field_I.d(-20);
                              continue L12;
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L15: {
                if (!aj.field_a) {
                  mf.e(1);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                L17: {
                  var5 = we.field_c.field_F;
                  if (!bl.field_B) {
                    break L17;
                  } else {
                    if (aj.field_a) {
                      stackOut_79_0 = dh.field_r;
                      stackIn_80_0 = stackOut_79_0;
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
                stackOut_78_0 = 481;
                stackIn_80_0 = stackOut_78_0;
                break L16;
              }
              L18: {
                var6 = stackIn_80_0;
                tn.field_g = tn.field_g + (-tn.field_g + (float)var6) * 0.10000000149011612f;
                if ((int)((double)tn.field_g + 0.5) == var5) {
                  break L18;
                } else {
                  sl.a(-118, (int)tn.field_g);
                  jm.a(320, ((int)(tn.field_g * 4.0f) + 240) / 9, -2);
                  break L18;
                }
              }
              L19: {
                if (null == ((Virogrid) this).field_I.a((byte) -102)) {
                  break L19;
                } else {
                  int fieldTemp$8 = ((Virogrid) this).field_A + 1;
                  ((Virogrid) this).field_A = ((Virogrid) this).field_A + 1;
                  if (fieldTemp$8 == 335) {
                    ((Virogrid) this).field_A = 0;
                    l discarded$9 = ((Virogrid) this).field_I.d(-29889);
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
              if (!param1) {
                li.a(param0);
                break L0;
              } else {
                break L0;
              }
            } else {
              if (-2 == (tg.field_x ^ -1)) {
                wa.field_K = wa.field_K + 1;
                if ((wa.field_K ^ -1) == -17) {
                  L20: {
                    if (!a.field_D) {
                      dn.a(8192);
                      break L20;
                    } else {
                      ka.a(0);
                      break L20;
                    }
                  }
                  tg.field_x = 2;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                if (2 != tg.field_x) {
                  wa.field_K = wa.field_K - 1;
                  if ((wa.field_K ^ -1) == -1) {
                    tg.field_x = 0;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  L21: {
                    if (!qm.i(20)) {
                      L22: {
                        hm.field_c = pm.field_k;
                        wn.c(param0);
                        if (a.field_D) {
                          a.field_D = false;
                          ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, (e) (Object) mc.field_b, 2, hd.field_b.field_G + hd.field_b.field_A, 8, -16824, false, 240);
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      if (mf.a(86, hm.field_c)) {
                        wm.c((byte) -86);
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  tg.field_x = 3;
                  break L0;
                }
              }
            }
          }
          L23: {
            if (-3 != hm.field_c) {
              break L23;
            } else {
              L24: {
                var8 = new String[]{mb.field_eb, em.field_e};
                vg.field_I = new ic(false, eg.field_y, var8, 0, false, ll.field_b, ce.field_I);
                lj.b(101);
                if (!pn.field_x) {
                  stackOut_92_0 = 0;
                  stackIn_93_0 = stackOut_92_0;
                  break L24;
                } else {
                  stackOut_91_0 = 1;
                  stackIn_93_0 = stackOut_91_0;
                  break L24;
                }
              }
              var4 = stackIn_93_0;
              gb.a(-2, 0, var4 != 0, -1);
              vm.field_e = true;
              break L23;
            }
          }
          L25: {
            if ((hm.field_c ^ -1) != 3) {
              break L25;
            } else {
              gk.field_g.g(9, 8);
              qe.field_k = true;
              hm.field_c = i.field_y;
              break L25;
            }
          }
          L26: {
            if (-5 == hm.field_c) {
              nn.a(wl.field_d.e((byte) -124), 11, (byte) -120);
              eh.field_e = true;
              hm.field_c = i.field_y;
              break L26;
            } else {
              break L26;
            }
          }
          L27: {
            oj.e((byte) -75);
            if (db.b((byte) 13, 0)) {
              L28: {
                if (vg.field_I == null) {
                  break L28;
                } else {
                  if (!vg.field_I.field_g) {
                    break L28;
                  } else {
                    if (!vg.field_I.field_t) {
                      break L28;
                    } else {
                      if ((vg.field_I.field_C.field_u ^ -1) >= (sh.a(4712, 40000) ^ -1)) {
                        break L28;
                      } else {
                        if (!vg.field_I.field_l) {
                          vg.field_I.field_l = true;
                          hj.field_h = id.field_c;
                          ca.field_G = c.field_a;
                          break L28;
                        } else {
                          break L28;
                        }
                      }
                    }
                  }
                }
              }
              if (-1 <= (hj.field_h ^ -1)) {
                var3 = 1 + c.field_a;
                if (ca.field_G < var3) {
                  ca.field_G = 0;
                  break L27;
                } else {
                  bm.d(var3, 0);
                  break L27;
                }
              } else {
                L29: {
                  hj.field_h = hj.field_h - 1;
                  var3 = c.field_a + -4;
                  if (-1 >= (var3 ^ -1)) {
                    break L29;
                  } else {
                    var3 = 0;
                    break L29;
                  }
                }
                bm.d(var3, 0);
                if (0 != sh.a(4712, 20)) {
                  break L27;
                } else {
                  pe discarded$10 = ed.a(sh.a(4712, 256), dj.field_f[sh.a(4712, 3)], -629134904, 96);
                  break L27;
                }
              }
            } else {
              if (-1 != (sh.a(4712, 1000) ^ -1)) {
                break L27;
              } else {
                pe discarded$11 = gi.a(dj.field_f[sh.a(4712, 3)], 100, 24);
                break L27;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final mg b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = field_F ? 1 : 0;
        mg var4 = new mg(57, 57);
        pj.a(var4, 256);
        df.c(29, 29, 27, 263172);
        for (var5 = 23; -1 >= (var5 ^ -1); var5--) {
            df.c(29, 29, var5, param2 - -(var5 * param0));
        }
        ul.b((byte) 93);
        if (param1 != -9105) {
            this.e(true);
        }
        return var4;
    }

    final static void a(eh param0, byte param1) {
        mg var2 = new mg(param0.a("final_frame.jpg", 100, ""), (java.awt.Component) (Object) fi.field_v);
        int var3 = var2.field_w;
        int var4 = var2.field_p;
        lm.a(0);
        int var5 = 120 / ((33 - param1) / 33);
        nd.field_d = new mg(var3, 3 * var4 / 4);
        nd.field_d.b();
        var2.b(0, 0);
        dn.field_c = new mg(var3, -nd.field_d.field_p + var4);
        dn.field_c.b();
        var2.b(0, -nd.field_d.field_p);
        dn.field_c.field_x = nd.field_d.field_p;
        ai.a(true);
    }

    private final void t(int param0) {
        if (null != uh.field_e) {
            a.a(20, uh.field_e);
            uh.field_e = null;
            sb.a(-52);
        }
        md.field_h = p.a(83, 3);
        oj.field_Fb = p.a(117, 5);
        g.field_a = p.a(98, 6);
        pj.field_c = p.a(89, 7);
        sf.field_O = p.a(param0 ^ 35, 8);
        el.field_d = p.a(64, 9);
        wm.field_w = p.a(97, 10);
        wn.field_i = p.a(33, 11);
        gn.field_G = p.a(param0 ^ 51, 12);
        ng.field_T = p.a(81, param0);
    }

    final void a(int param0) {
        if (param0 >= -80) {
            ((Virogrid) this).field_L = null;
        }
        al.i(100);
        if (!(null == ih.field_b)) {
            am.a((byte) -16);
        }
        ce.f(13633);
    }

    final void d(int param0) {
        int var3 = field_F ? 1 : 0;
        Virogrid.u(240);
        hj.a(17);
        l.b(-6325);
        p.c(param0 + -32);
        ud.a((byte) -94);
        fj.a((byte) -99);
        rh.b(param0 ^ 57);
        bn.a((byte) -118);
        rk.a(-97);
        ld.a((byte) -110);
        cg.a(-65);
        nf.a(-28637);
        wd.a(param0 ^ -8518);
        em.a(-85);
        od.d(false);
        rg.a(param0 ^ 64);
        uk.b(param0 + -6490);
        og.b(param0 + 74);
        me.a(param0 + 0);
        cb.b(3981);
        df.a();
        eh.a((byte) -104);
        e.a();
        ak.a(4472);
        jc.b((byte) 110);
        hc.a(true);
        se.a((byte) 79);
        rb.a((byte) -13);
        vm.a((byte) -106);
        oh.a(true);
        td.a(6666);
        kb.a(122);
        pc.a(-30114);
        ih.a(81);
        cj.a(-99);
        nm.a(26523);
        hm.b(param0 ^ -126);
        wf.a(param0 ^ -28608);
        qc.a((byte) 9);
        h.a(true);
        li.b((byte) 112);
        jg.a(28275);
        dk.a(-124);
        sb.b(-851125662);
        ha.a(param0 + 79);
        nh.a(false);
        el.d(-127);
        oi.c(122);
        ic.b(23320);
        pi.a(param0 ^ -29216);
        il.a();
        qb.b();
        uf.a(98);
        ee.b((byte) 119);
        rl.d(0);
        wb.c(true);
        bd.a(95);
        tn.f(param0 + 31);
        ke.d(-51);
        wg.a(0);
        sd.a((byte) 113);
        ah.a((byte) -115);
        ib.a(-60);
        k.a(1000);
        we.a((byte) -104);
        gi.a((byte) -103);
        en.g(0);
        qm.j(124);
        km.f(param0 + 2147483647);
        ga.i(param0 ^ -91);
        ao.g(-119);
        dj.a(false);
        um.g(0);
        bg.g(param0);
        lk.e((byte) 10);
        an.a((byte) 26);
        pl.a((byte) -120);
        pj.a(false);
        oe.b(param0 + 0);
        hk.d(false);
        jm.a(param0 + 0);
        he.g(7);
        fk.c();
        vl.a(false);
        ll.a((byte) -64);
        pg.b(param0 + 8192);
        s.a(-1);
        i.a((byte) -78);
        ln.a(true);
        wn.d(79);
        qj.b();
        pa.c(true);
        ua.b();
        eg.c(param0 ^ -55);
        ef.a(-3);
        kf.a(-1);
        vj.b((byte) 17);
        ea.a(-74);
        sj.a((byte) 121);
        jd.a(true);
        ba.a(14);
        fh.a(10061);
        vf.a(false);
        je.h(-202);
        b.j((byte) -22);
        vc.g((byte) 108);
        de.g(false);
        sh.g(true);
        qh.f(8246);
        jl.f(15354);
        ca.f((byte) 15);
        uh.a(false);
        id.a((byte) 24);
        o.a((byte) 67);
        ig.a(-77);
        ii.a((byte) 6);
        ac.a(-95);
        qi.a(25651);
        of.a((byte) 110);
        lg.a(param0 ^ -122);
        ne.a(false);
        ul.a((byte) -96);
        bk.a((byte) 122);
        hg.f((byte) 103);
        mm.a(false);
        dd.b((byte) -58);
        m.b(-314);
        ia.a(44);
        ab.e(-16349);
        va.a(-91);
        na.e((byte) 56);
        sk.a((byte) -52);
        qf.c();
        ff.a();
        nn.a(53);
        bf.c(param0 ^ 20391);
        ji.a(-112);
        am.b((byte) 88);
        ei.a(-59);
        lb.b(7);
        lm.a((byte) -94);
        pn.c(true);
        qk.c(2);
        ub.f(-121);
        gl.a(param0 + 3);
        bl.d(false);
        oa.c((byte) -127);
        c.a(false);
        nb.d(-30419);
        rf.a(-24750);
        mk.k(-16);
        aj.a(false);
        gj.c();
        tf.a(0);
        wm.c(0);
        af.a(99);
        mn.a(0);
        lh.b(false);
        sm.a(param0 + -1);
        cf.a(112);
        ag.b(25);
        g.b((byte) -108);
        md.b(46);
        wh.a(param0 + -23862);
        bb.a();
        db.a(6);
        bc.a((byte) -101);
        aa.a(false);
        lj.a(67);
        nl.c(120);
        ql.a((byte) -87);
        rj.a(6);
        ie.b(0);
        fi.c(false);
        tg.a((byte) -78);
        ec.a(param0 + -3298);
        dc.h(-126);
        gg.g(-1);
        fd.e(1);
        ma.d(param0 ^ 0);
        jk.a((byte) 110);
        nj.b();
        tk.a(0);
        kh.a((byte) 81);
        qa.a(8342);
        mc.a(false);
        oj.f((byte) -111);
        wc.a(param0 + 200);
        ad.a(param0 + 90);
        u.b((byte) -11);
        th.e(-5);
        sl.a(param0 + 1);
        rn.a((byte) -38);
        te.a((byte) 126);
        mf.f(-93);
        gd.b((byte) 104);
        ug.a(-97);
        ch.a(0);
        hl.a();
        sg.d(-2);
        fm.a((byte) -54);
        hd.a(3881);
        d.e((byte) -73);
        fe.h(32498);
        ge.a(72);
        rc.a(param0 + -24021);
        qd.a(true);
        ej.f(2);
        vd.l(-1);
        wa.f((byte) 39);
        mb.h((byte) 126);
        dg.a((byte) 41);
        nk.a(35);
        w.a(-116);
        ng.g(false);
        gn.g(true);
        qe.b((byte) -36);
        fn.b((byte) 97);
        ok.f(-100);
        qn.c((byte) -124);
        gb.e(117);
        al.g(-1);
        jb.a((byte) -99);
        gf.a((byte) 124);
        dn.a((byte) 112);
        bm.c(2797);
        tl.b((byte) -71);
        nd.a((byte) 114);
        ce.a((byte) 107);
        vg.f(-114);
        gk.a((byte) -127);
        eb.a(true);
        dm.e(-48);
        lc.a(-26834);
        mj.g(-108);
        ph.d(param0 ^ 121);
        bh.a();
        ed.a((byte) 51);
        j.b(param0 ^ -116);
        f.b((byte) 103);
        jf.a((byte) -124);
        ij.a(-25621);
        pm.a(0);
        fl.a(-24488);
        dh.a(-128);
        pe.a((byte) -79);
        la.a((byte) 108);
        hf.b(param0 ^ -125);
        ti.b(-88);
        cc.b(false);
        a.c(false);
        ae.a((byte) -125);
        kn.h(param0 ^ 0);
        oc.c(false);
        hn.a((byte) -9);
        ai.b(false);
        gh.d(false);
        vb.b((byte) 112);
        ka.c(-85);
        sa.a((byte) -52);
        kg.b((byte) 123);
        dl.a(0);
        bj.a((byte) -62);
        qg.a(114);
        ob.a(param0 + 29137);
        sf.a(100);
        co.a((byte) 103);
        mh.b((byte) 51);
        re.b(-120);
        vi.b(param0 + 31856);
        bi.a(46);
        fb.a((byte) 21);
        ra.a(false);
        tm.a(-74);
        da.a(param0 ^ 8355711);
        cm.c(115);
        fa.d(0);
        jj.a((byte) 74);
        ri.b(2);
        di.h(46);
        sn.c((byte) -89);
        ve.c(true);
        kd.c((byte) -124);
        kk.c((byte) -8);
        ci.h(-104);
        on.a((byte) 120);
        pb.a((byte) 111);
        wl.a((byte) -75);
        mi.e(12);
        hh.a((byte) -124);
        ((Virogrid) this).field_N = null;
        ((Virogrid) this).field_C = null;
        ((Virogrid) this).field_I = null;
        ((Virogrid) this).field_G = null;
        ((Virogrid) this).field_D = null;
        ((Virogrid) this).field_L = null;
        ((Virogrid) this).field_H = null;
        ((Virogrid) this).field_B = null;
        ((Virogrid) this).field_v = null;
        ((Virogrid) this).field_K = null;
        ((Virogrid) this).field_J = null;
        ((Virogrid) this).field_M = null;
    }

    private final void a(qb param0, byte param1) {
        param0.a(0, 154, 0);
        if (param1 != 69) {
            Object var4 = null;
            int[] discarded$0 = this.a((byte) -76, (qb) null);
        }
        param0.a(256, 256, 256, 32);
        param0.a(0, -154, 0);
    }

    public Virogrid() {
        ((Virogrid) this).field_I = new p();
        ((Virogrid) this).field_A = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = new co("usename");
    }
}
