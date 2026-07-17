/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.awt.Canvas;

public final class Geoblox extends wf {
    static String[] field_z;
    static String field_A;
    static volatile long field_D;
    static f field_y;
    static qg field_B;
    public static int field_C;

    private final void n() {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("sports", (byte) -126))) {
                return;
            }
            hd.field_H = ug.a("sports_foreground", ll.field_f, (byte) -78, "sports");
            th.field_f = jg.a(ll.field_f, 1, "sports", "sports_background");
            ll.field_g[5] = true;
            return;
        }
    }

    public Geoblox() {
    }

    final void c(int param0) {
        if (param0 != 1) {
            this.h(true);
        }
        int discarded$4 = 122;
        me.b();
        if (!(vl.field_n == null)) {
            vl.field_n.a(0, ka.field_i);
        }
        int discarded$5 = 124;
        pc.a();
    }

    private final boolean o() {
        int var2 = 0;
        dm[] var12 = null;
        int var4 = 0;
        int var5_int = 0;
        int var6_int = 0;
        int var7_int = 0;
        int var8_int = 0;
        int var9 = 0;
        dm[] var13 = null;
        dm[] var5 = null;
        dm[] var6 = null;
        na[] var7 = null;
        int[] var17 = null;
        int[] var16 = null;
        int[] var15 = null;
        int[] var14 = null;
        int[] var8 = null;
        int var11 = 0;
        int var10 = field_C;
        oj.a(vc.field_i, (byte) -104);
        if (null != wj.field_F) {
            if (null != fe.field_a) {
                if (ah.field_c != null) {
                    if (null != cd.field_m) {
                        lc.a(ca.field_h, -2, 60.0f);
                        ((Geoblox) this).a(25853);
                        jg.a(wj.field_F, (byte) 80, ah.field_c, fe.field_a, cd.field_m);
                        ah.field_c = null;
                        wj.field_F = null;
                        cd.field_m = null;
                        fe.field_a = null;
                        ih.b(127);
                        return false;
                    }
                }
            }
        }
        if (null != ll.field_f) {
            if (null != ii.field_k) {
                if (ki.field_b != null) {
                    lc.a(oh.field_c, -2, 80.0f);
                    ((Geoblox) this).a(25853);
                    dd.field_G = w.a("", ll.field_f, ii.field_k, true, "font");
                    wf.field_p = dd.field_G.e(1);
                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                    dd.field_G.field_K[0][dd.field_G.e(16777215)] = 1;
                    var2 = dd.field_G.field_K[0].length;
                    dd.field_G.field_K[1] = new int[var2];
                    sf.a(dd.field_G.field_K[0], 0, dd.field_G.field_K[1], 0, var2);
                    dd.field_G.field_K[1][wf.field_p] = 16777215;
                    int discarded$0 = 0;
                    var12 = wj.a("geoms", "", ll.field_f);
                    var4 = -1;
                    for (var5_int = 0; ~var12.length < ~var5_int; var5_int++) {
                        var6_int = var5_int % 7;
                        if (!(var6_int != 0)) {
                            var4++;
                            if (var4 >= 7) {
                                break;
                            }
                        }
                        var7_int = var12[var5_int].field_s;
                        var8_int = var12[var5_int].field_o;
                        s.field_G[var4][var6_int] = var12[var5_int];
                        for (var9 = 0; var9 < 7; var9++) {
                            ke.field_a[var4][var6_int][var9] = new dm(var7_int, var8_int);
                            ke.field_a[var4][var6_int][var9].e();
                            var12[var5_int].b(0, 0, jg.field_f[var4][var9]);
                        }
                    }
                    int discarded$1 = 0;
                    var13 = wj.a("amorphic", "", ll.field_f);
                    for (var4 = 0; var4 < 7; var4++) {
                        for (var5_int = 0; var5_int < 7; var5_int++) {
                            for (var6_int = 0; ~var6_int > ~var13.length; var6_int++) {
                                ka.field_m[var4][var5_int][var6_int] = new dm(4 + var13[var6_int].field_s, 4 + var13[var6_int].field_o);
                                ka.field_m[var4][var5_int][var6_int].e();
                                var13[var6_int].b(2, 2, jg.field_f[var4][var5_int]);
                                k.a(0, 0, ka.field_m[var4][var5_int][var6_int].field_s, -27085, ka.field_m[var4][var5_int][var6_int].field_o);
                            }
                        }
                    }
                    sh.field_y.a(255);
                    fi.field_d = gi.a(ii.field_k, 1, ll.field_f, "small_font", "");
                    int discarded$2 = 0;
                    fc.field_g = wj.a("black", "", ll.field_f);
                    int discarded$3 = 0;
                    hg.field_b = wj.a("black_implode", "", ll.field_f);
                    int discarded$4 = 0;
                    hb.field_d = wj.a("silver", "", ll.field_f);
                    int discarded$5 = 0;
                    ej.field_a = wj.a("amorph_crack", "", ll.field_f);
                    i.field_a = ug.a("player_back", ll.field_f, (byte) -78, "");
                    int discarded$6 = 0;
                    var5 = wj.a("player_eyes", "", ll.field_f);
                    if (da.a(0, 125)) {
                        int discarded$7 = 0;
                        var5 = wj.a("player_eyes", "halloween", ll.field_f);
                    }
                    fc.field_b = new dm[var5.length];
                    for (var6_int = 0; var5.length > var6_int; var6_int++) {
                        fc.field_b[var6_int] = new dm(4 + var5[var6_int].field_s, var5[var6_int].field_o - -4);
                        fc.field_b[var6_int].e();
                        var5[var6_int].c(2, 2);
                        k.a(0, 0, fc.field_b[var6_int].field_s, -27085, fc.field_b[var6_int].field_m);
                        fc.field_b[var6_int].d();
                    }
                    int discarded$8 = 0;
                    var6 = wj.a("player_mouth", "", ll.field_f);
                    if (da.a(0, 95)) {
                        int discarded$9 = 0;
                        var6 = wj.a("player_mouth", "halloween", ll.field_f);
                    }
                    vh.field_H = new dm[var6.length];
                    for (var7_int = 0; ~var6.length < ~var7_int; var7_int++) {
                        vh.field_H[var7_int] = new dm(var6[var7_int].field_s + 4, var6[var7_int].field_o + 4);
                        vh.field_H[var7_int].e();
                        var6[var7_int].c(2, 2);
                        k.a(2 + var6[var7_int].field_p, 0, vh.field_H[var7_int].field_s, -27085, var6[var7_int].field_m);
                        vh.field_H[var7_int].d();
                    }
                    sh.field_y.a(255);
                    fe.field_j = jg.a(ll.field_f, 1, "sun", "sky_background");
                    ne.field_b = ug.a("sky_foreground", ll.field_f, (byte) -78, "sun");
                    ll.field_g[1] = true;
                    ee.field_A = ug.a("menu_background", ll.field_f, (byte) -78, "");
                    vc.field_j = ug.a("menu_foreground", ll.field_f, (byte) -78, "");
                    qj.field_c = ug.a("transition", ll.field_f, (byte) -78, "");
                    int discarded$10 = 0;
                    vg.field_f = wj.a("silver_shock", "", ll.field_f);
                    int discarded$11 = 0;
                    mi.field_B = wj.a("sparkle", "", ll.field_f);
                    for (var7_int = 0; ~mi.field_B.length < ~var7_int; var7_int++) {
                        mi.field_B[var7_int].g(1);
                    }
                    int discarded$12 = 0;
                    vj.field_a = wj.a("bang", "", ll.field_f);
                    int discarded$13 = 0;
                    eg.field_q = wj.a("bonus_glow", "", ll.field_f);
                    pk.field_k = ug.a("bubble", ll.field_f, (byte) -78, "");
                    k.field_a = ug.a("pop", ll.field_f, (byte) -78, "");
                    int discarded$14 = 0;
                    eb.field_g = wj.a("box_mouse", "", ll.field_f);
                    int discarded$15 = 0;
                    vf.field_H = wj.a("cry_begin", "", ll.field_f);
                    int discarded$16 = 0;
                    ok.field_a = wj.a("cry_middle", "", ll.field_f);
                    int discarded$17 = 0;
                    ld.field_b = wj.a("cry_end", "", ll.field_f);
                    if (!(!da.a(0, 110))) {
                        int discarded$18 = 0;
                        vf.field_H = wj.a("cry_begin", "halloween", ll.field_f);
                        int discarded$19 = 0;
                        ok.field_a = wj.a("cry_middle", "halloween", ll.field_f);
                        int discarded$20 = 0;
                        ld.field_b = wj.a("cry_end", "halloween", ll.field_f);
                    }
                    var7 = new na[8];
                    var7[0] = jg.a(ll.field_f, 1, "", "keyboard_left");
                    var7[1] = jg.a(ll.field_f, 1, "", "keyboard_right");
                    var7[2] = jg.a(ll.field_f, 1, "", "keyboard_enter");
                    var7[3] = jg.a(ll.field_f, 1, "", "keyboard_space");
                    var7[4] = jg.a(ll.field_f, h.a(25869, 25868), "", "keyboard_esc");
                    var7[5] = jg.a(ll.field_f, 1, "", "keyboard_backspace");
                    var7[6] = jg.a(ll.field_f, 1, "", "keyboard_down");
                    var7[7] = jg.a(ll.field_f, 1, "", "keyboard_i");
                    var17 = new int[var7.length];
                    var16 = var17;
                    var15 = var16;
                    var14 = var15;
                    var8 = var14;
                    var11 = 0;
                    var9 = var11;
                    while (~var11 > ~var17.length) {
                        var8[var11] = var7[var11].field_c + -3;
                        var11++;
                    }
                    fi.field_d.a((ha[]) (Object) var7, var17);
                    sh.field_y.a(255);
                    kh.field_h[0] = ug.a("main_title", ll.field_f, (byte) -78, "");
                    kh.field_h[2] = ug.a("bestscoreseach_title", ll.field_f, (byte) -78, "");
                    kh.field_h[3] = ug.a("myscores_title", ll.field_f, (byte) -78, "");
                    kh.field_h[1] = ug.a("allscores_title", ll.field_f, (byte) -78, "");
                    kh.field_h[6] = ug.a("gameover_title", ll.field_f, (byte) -78, "");
                    kh.field_h[4] = ug.a("achievements_title", ll.field_f, (byte) -78, "");
                    kh.field_h[5] = ug.a("instructions_title", ll.field_f, (byte) -78, "");
                    kh.field_h[7] = ug.a("achievements_tg_title", ll.field_f, (byte) -78, "");
                    kh.field_h[8] = ug.a("login_title", ll.field_f, (byte) -78, "");
                    ll.field_h = new dm[9];
                    ll.field_h[0] = ug.a("frame_topleft", ll.field_f, (byte) -78, "");
                    ll.field_h[1] = ug.a("frame_top", ll.field_f, (byte) -78, "");
                    ll.field_h[2] = ug.a("frame_topright", ll.field_f, (byte) -78, "");
                    ll.field_h[3] = ug.a("frame_left", ll.field_f, (byte) -78, "");
                    ll.field_h[4] = ug.a("frame_centre", ll.field_f, (byte) -78, "");
                    ll.field_h[5] = ug.a("frame_right", ll.field_f, (byte) -78, "");
                    ll.field_h[6] = ug.a("frame_bottomleft", ll.field_f, (byte) -78, "");
                    ll.field_h[7] = ug.a("frame_bottom", ll.field_f, (byte) -78, "");
                    ll.field_h[8] = ug.a("frame_bottomright", ll.field_f, (byte) -78, "");
                    re.field_h = ug.a("widget", ll.field_f, (byte) -78, "");
                    sd.field_y = ug.a("bar", ll.field_f, (byte) -78, "");
                    lj.field_d = ug.a("box_sml", ll.field_f, (byte) -78, "");
                    g.field_i = ug.a("box_count", ll.field_f, (byte) -78, "");
                    vh.field_G = ug.a("box_lgr", ll.field_f, (byte) -78, "");
                    int discarded$21 = 0;
                    tl.field_r = wj.a("intro_faces", "", ll.field_f);
                    if (da.a(0, -105)) {
                        int discarded$22 = 0;
                        tl.field_r = wj.a("intro_faces", "halloween", ll.field_f);
                    }
                    int discarded$23 = 0;
                    qh.field_O = wj.a("intro_geoms", "", ll.field_f);
                    int discarded$24 = 0;
                    sl.field_f = wj.a("achievements", "", ll.field_f);
                    am.field_b = ug.a("unachieved", ki.field_b, (byte) -78, "basic");
                    dm discarded$25 = ug.a("locked", ki.field_b, (byte) -78, "basic");
                    uk.field_m = ug.a("orbcoin", ki.field_b, (byte) -78, "basic");
                    c.field_ab = 1;
                    cd.a((byte) 79);
                    ih.b(-62);
                    ii.field_k = null;
                    ki.field_b = null;
                    return false;
                }
            }
        }
        lc.a(uj.field_a, -2, 100.0f);
        ((Geoblox) this).a(25853);
        int discarded$26 = 9313;
        qg.b();
        return true;
    }

    private final boolean g() {
        if (ef.field_e) {
          return true;
        } else {
          L0: {
            s.g(9);
            if (!wj.field_F.a(0)) {
              break L0;
            } else {
              if (!wj.field_F.b(true)) {
                break L0;
              } else {
                L1: {
                  if (!ah.field_c.a(0)) {
                    break L1;
                  } else {
                    if (!ah.field_c.b(true)) {
                      break L1;
                    } else {
                      L2: {
                        if (!fe.field_a.a(0)) {
                          break L2;
                        } else {
                          if (fe.field_a.b(true)) {
                            L3: {
                              if (!cd.field_m.a(0)) {
                                break L3;
                              } else {
                                if (cd.field_m.b(true)) {
                                  L4: {
                                    if (!ii.field_k.a(0)) {
                                      break L4;
                                    } else {
                                      if (!ii.field_k.b(true)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          if (!ll.field_f.a(0)) {
                                            break L5;
                                          } else {
                                            if (!ll.field_f.a("", (byte) -127)) {
                                              break L5;
                                            } else {
                                              L6: {
                                                if (!ll.field_f.a(0)) {
                                                  break L6;
                                                } else {
                                                  if (!ll.field_f.a("sun", (byte) -127)) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      if (!da.a(0, -112)) {
                                                        break L7;
                                                      } else {
                                                        L8: {
                                                          if (!ll.field_f.a(0)) {
                                                            break L8;
                                                          } else {
                                                            if (!ll.field_f.a("halloween", (byte) -127)) {
                                                              break L8;
                                                            } else {
                                                              break L7;
                                                            }
                                                          }
                                                        }
                                                        int discarded$8 = 1;
                                                        lc.a(gf.a(s.field_F, ll.field_f, "halloween", uj.field_c), -2, 45.0f);
                                                        return false;
                                                      }
                                                    }
                                                    L9: {
                                                      if (!ki.field_b.a(0)) {
                                                        break L9;
                                                      } else {
                                                        if (!ki.field_b.a("basic", (byte) -124)) {
                                                          break L9;
                                                        } else {
                                                          return true;
                                                        }
                                                      }
                                                    }
                                                    int discarded$9 = 1;
                                                    lc.a(gf.a(ff.field_l, ki.field_b, "basic", wi.field_F), -2, 50.0f);
                                                    return false;
                                                  }
                                                }
                                              }
                                              int discarded$10 = 1;
                                              lc.a(gf.a(ff.field_l, ll.field_f, "sun", wi.field_F), -2, 45.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        int discarded$11 = 1;
                                        lc.a(gf.a(ff.field_l, ll.field_f, "", wi.field_F), -2, 45.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  int discarded$12 = 1;
                                  lc.a(gf.a(ik.field_b, ii.field_k, "", nb.field_a), -2, 35.0f);
                                  return false;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            lc.a(vd.a(ud.field_b, pa.field_e, 0, false, cd.field_m), -2, 25.0f);
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      int discarded$13 = 1;
                      lc.a(gf.a(ji.field_n, fe.field_a, "", dd.field_F), -2, 15.0f);
                      return false;
                    }
                  }
                }
                int discarded$14 = 1;
                lc.a(gf.a(pa.field_e, ah.field_c, "", ud.field_b), -2, 10.0f);
                return false;
              }
            }
          }
          int discarded$15 = 1;
          lc.a(gf.a(pa.field_e, wj.field_F, "", ud.field_b), -2, 5.0f);
          return false;
        }
    }

    final void b(byte param0) {
        Geoblox.r(0);
        ch.c((byte) 122);
        kj.b(false);
        int discarded$0 = 9144;
        ug.a();
        sg.a(-13575);
        int discarded$1 = -17525;
        hg.a();
        ic.a(16424);
        int discarded$2 = 1;
        ok.a();
        wf.g(30344);
        int discarded$3 = 108;
        wg.c();
        int discarded$4 = 31997;
        wl.a();
        int discarded$5 = -29313;
        le.a();
        int discarded$6 = -42;
        vk.a();
        vb.a();
        rh.b(30261);
        int discarded$7 = 17062;
        b.a();
        int discarded$8 = 105;
        kb.c();
        int discarded$9 = 0;
        qc.d();
        int discarded$10 = 8192;
        oa.b();
        int discarded$11 = -60;
        ab.a();
        gf.a(true);
        int discarded$12 = 45;
        gg.a();
        jk.a(param0 ^ 10848);
        int discarded$13 = 48;
        ik.a();
        vd.b(param0 + 59);
        int discarded$14 = 22059;
        pg.b();
        int discarded$15 = -1;
        lj.a();
        cl.a(-9474);
        i.a(false);
        cj.b(param0 ^ 78);
        int discarded$16 = 58;
        sc.b();
        int discarded$17 = -127;
        eb.a();
        he.a(param0 + 64);
        int discarded$18 = 1;
        v.a();
        c.d((byte) 28);
        int discarded$19 = -17199;
        gh.i();
        int discarded$20 = -50;
        ji.d();
        uf.a(param0 ^ 74);
        em.a(86);
        int discarded$21 = 21888;
        ba.e();
        tf.f(51);
        hf.b((byte) -128);
        fi.a(param0 + -63);
        jb.b();
        ad.c(-1);
        int discarded$22 = 54;
        je.a();
        qk.h();
        tj.a(param0 + 154);
        ud.a(0);
        int discarded$23 = 50;
        da.a();
        int discarded$24 = 114;
        bm.a();
        int discarded$25 = -127;
        fe.c();
        int discarded$26 = 1;
        nh.a();
        eh.a(-6910);
        int discarded$27 = 1;
        ld.a();
        int discarded$28 = 30970;
        fa.a();
        ng.k(param0 + -33);
        int discarded$29 = -60;
        r.r();
        int discarded$30 = 57;
        rl.h();
        ei.n(param0 ^ 69);
        int discarded$31 = -107;
        f.n();
        qh.h(0);
        wi.f(1);
        pf.a((byte) -97);
        int discarded$32 = -85;
        hi.i();
        mb.a(param0 + 63);
        ej.a(-89);
        mj.a(param0 + 168);
        ue.a(true);
        int discarded$33 = 102;
        w.a();
        bl.a(param0 ^ 9769);
        m.a();
        rc.c((byte) -110);
        wh.f(param0 ^ -5558);
        int discarded$34 = 45;
        nj.c();
        ke.a((byte) -80);
        int discarded$35 = -103;
        af.a();
        int discarded$36 = -8297;
        te.a();
        qe.a(-8616);
        int discarded$37 = 85;
        qg.a();
        df.a(param0 + 64);
        pk.j(param0 ^ -64);
        int discarded$38 = -64;
        ki.a();
        int discarded$39 = 26;
        ka.a();
        int discarded$40 = -88;
        oh.a();
        wd.b(-10943);
        int discarded$41 = 104;
        ja.e();
        int discarded$42 = 126;
        kc.a();
        int discarded$43 = 0;
        mf.a();
        ah.a(39);
        fl.a(33);
        int discarded$44 = 122;
        kd.a();
        int discarded$45 = 5366;
        ri.a();
        pa.b((byte) 74);
        int discarded$46 = 81;
        bh.a();
        ec.a(true);
        int discarded$47 = 0;
        pj.b();
        int discarded$48 = 1;
        vl.b();
        int discarded$49 = 17348;
        t.a();
        int discarded$50 = 104;
        kh.a();
        int discarded$51 = -125;
        ne.b();
        int discarded$52 = -84;
        kk.i();
        int discarded$53 = 118;
        sd.e();
        int discarded$54 = 1;
        bj.b();
        int discarded$55 = 31735;
        pb.f();
        dl.a(true);
        ij.i((byte) -80);
        int discarded$56 = 1;
        bk.a();
        int discarded$57 = 1;
        ff.a();
        mh.c();
        ua.a();
        int discarded$58 = 126;
        dc.b();
        int discarded$59 = 115;
        nf.b();
        int discarded$60 = 31;
        lb.a();
        int discarded$61 = -112;
        rb.a();
        int discarded$62 = -126;
        fc.a();
        nb.a(-102);
        ak.a(param0 ^ 30613);
        kf.b(param0 + -15583);
        tc.a(true);
        int discarded$63 = 0;
        mi.b();
        int discarded$64 = 1;
        vg.a();
        am.a((byte) 49);
        oj.a(-87);
        tb.a();
        int discarded$65 = 0;
        eg.b();
        int discarded$66 = -108;
        oi.a();
        int discarded$67 = -128;
        ek.a();
        int discarded$68 = 1;
        bi.a();
        rd.a((byte) 94);
        hb.a(param0 ^ -64);
        int discarded$69 = -89;
        jf.b();
        int discarded$70 = -5927;
        el.b();
        hk.f((byte) -11);
        sh.a((byte) -3);
        oe.j(89);
        int discarded$71 = 256;
        dd.i();
        int discarded$72 = 14078;
        ee.e();
        int discarded$73 = 79;
        gb.b();
        a.a(param0);
        u.a();
        int discarded$74 = -113;
        ul.a();
        og.f(111);
        int discarded$75 = 73;
        ih.a();
        int discarded$76 = 107;
        di.a();
        int discarded$77 = 126;
        jj.a();
        int discarded$78 = 95;
        wb.a();
        int discarded$79 = -30;
        qa.a();
        kg.e((byte) 77);
        int discarded$80 = 0;
        sb.b();
        int discarded$81 = -97;
        vj.a();
        int discarded$82 = 16712207;
        jg.c();
        int discarded$83 = -20152;
        bd.b();
        cm.a(false);
        int discarded$84 = -117;
        bf.c();
        rj.a(param0 ^ -33);
        int discarded$85 = 1;
        id.b();
        md.a((byte) 40);
        int discarded$86 = 0;
        li.a();
        int discarded$87 = 0;
        va.a();
        int discarded$88 = 102;
        ge.b();
        ed.a();
        cg.c((byte) -120);
        int discarded$89 = -52;
        hd.f();
        hc.k(-243);
        int discarded$90 = -15;
        dj.l();
        qf.m(param0 ^ -320);
        hl.f(407213000);
        vh.b(true);
        int discarded$91 = 0;
        vf.h();
        int discarded$92 = -116;
        td.f();
        int discarded$93 = 24033;
        pi.j();
        int discarded$94 = -75;
        vi.f();
        q.f(param0 + 65);
        int discarded$95 = -43;
        jc.a();
        s.b(false);
        int discarded$96 = 0;
        qb.f();
        int discarded$97 = 0;
        ol.f();
        ll.a(param0 + 71);
        int discarded$98 = -87;
        vc.b();
        l.b(param0 ^ 47);
        int discarded$99 = 27;
        sj.a();
        int discarded$100 = -113;
        la.g();
        fk.f(param0 + 14576);
        int discarded$101 = -113;
        ck.a();
        gi.a(param0 ^ 63);
        ra.a(param0 + 63);
        int discarded$102 = -111;
        fj.e();
        gj.h(-1);
        int discarded$103 = 1353;
        cd.e();
        ub.a();
        int discarded$104 = -23;
        qj.a();
        k.b(0);
        int discarded$105 = 101;
        ef.a();
        ai.b(46695);
        int discarded$106 = 112;
        ph.a();
        ml.b(16777215);
        fh.a(1);
        ac.a((byte) 68);
        int discarded$107 = 0;
        uh.c();
        oc.a(true);
        int discarded$108 = -60;
        wj.f();
        j.f((byte) -128);
        int discarded$109 = 127;
        re.b();
        int discarded$110 = 122;
        ii.a();
        int discarded$111 = 102;
        sl.a();
        gk.a(param0 ^ -64);
        ni.a((byte) -113);
        int discarded$112 = 59;
        qi.c();
        p.b(param0 ^ 25);
        int discarded$113 = -92;
        od.a();
        lf.b(8221);
        int discarded$114 = -109;
        th.d();
        int discarded$115 = -17226;
        nk.b();
        int discarded$116 = -53;
        uj.a();
        tl.b(param0 ^ -6501);
        int discarded$117 = 1000;
        ea.b();
        se.b(param0 ^ -65);
        int discarded$118 = 0;
        ca.b();
        int discarded$119 = 0;
        si.a();
        lk.a((byte) 0);
        int discarded$120 = -40;
        me.c();
        int discarded$121 = 113;
        uk.d();
        g.g(param0 + -51);
        ag.g(param0 + -22);
        mk.c((byte) -9);
        int discarded$122 = -48;
        cf.g();
        n.g(param0 + 64);
        int discarded$123 = 0;
        hh.a();
        int discarded$124 = 1;
        fb.b();
        lh.b(-481);
        ib.a(true);
        ((Geoblox) this).field_n = null;
    }

    private final void i() {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("germs", (byte) -126))) {
                return;
            }
            sl.field_c = ug.a("germs_foreground", ll.field_f, (byte) -78, "germs");
            sg.field_e = jg.a(ll.field_f, 1, "germs", "germs_background");
            int var2 = 24;
            ll.field_g[3] = true;
            return;
        }
    }

    public final void init() {
        ((Geoblox) this).a(11, "geoblox", 640);
    }

    final static void a(int param0, dm param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              oc.b(9);
              vb.a(param1.field_v, param1.field_s, param1.field_o);
              if (param0 == 1) {
                break L1;
              } else {
                var3 = null;
                Geoblox.a(-34, (dm) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("Geoblox.T(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void r(int param0) {
        field_B = null;
        field_z = null;
        if (param0 != 0) {
            Object var2 = null;
            Geoblox.a(30, (dm) null);
        }
        field_A = null;
        field_y = null;
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_91_0 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        var3 = field_C;
        int discarded$20 = 78;
        ng.h();
        if (!param0) {
          L0: {
            if (vl.field_n == null) {
              break L0;
            } else {
              if (vl.field_n.field_c) {
                vl.field_n.a(0, ka.field_i);
                vl.field_n = null;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (null == vl.field_n) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          L2: {
            ((Geoblox) this).b(stackIn_9_1 != 0, 19660);
            if (cf.field_k) {
              L3: {
                stackOut_11_0 = this;
                stackIn_13_0 = stackOut_11_0;
                stackIn_12_0 = stackOut_11_0;
                if (param0) {
                  stackOut_13_0 = this;
                  stackOut_13_1 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L3;
                } else {
                  stackOut_12_0 = this;
                  stackOut_12_1 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  break L3;
                }
              }
              this.f(stackIn_14_1 != 0);
              cf.field_k = false;
              break L2;
            } else {
              break L2;
            }
          }
          L4: while (true) {
            if (!sh.a((byte) -118, pb.field_m)) {
              L5: {
                int discarded$21 = 255;
                if (!bl.b()) {
                  L6: {
                    if (!ib.field_a) {
                      L7: {
                        oj.a(vc.field_i, (byte) -98);
                        int discarded$22 = 0;
                        if (!this.g()) {
                          break L7;
                        } else {
                          int discarded$23 = 25869;
                          if (this.o()) {
                            ib.field_a = true;
                            int discarded$24 = 82;
                            this.m();
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      cm.a(-1, 0);
                      return;
                    } else {
                      if (!uk.g(79)) {
                        lc.a(ph.field_g, -2, 100.0f);
                        break L6;
                      } else {
                        L8: {
                          int discarded$25 = 47;
                          if (!dd.a()) {
                            break L8;
                          } else {
                            if (!jk.field_a) {
                              L9: {
                                if (vl.field_n == null) {
                                  stackOut_90_0 = 0;
                                  stackIn_91_0 = stackOut_90_0;
                                  break L9;
                                } else {
                                  stackOut_89_0 = 1;
                                  stackIn_91_0 = stackOut_89_0;
                                  break L9;
                                }
                              }
                              L10: {
                                int discarded$26 = 0;
                                var2 = sl.a(stackIn_91_0 != 0, (wf) this);
                                if (var2 != 2364824) {
                                  L11: {
                                    if (var2 == 1) {
                                      break L11;
                                    } else {
                                      if (2 != var2) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  L12: {
                                    if (null == vl.field_n) {
                                      break L12;
                                    } else {
                                      vl.field_n.a(0, ka.field_i);
                                      vl.field_n = null;
                                      break L12;
                                    }
                                  }
                                  if (var2 == 2) {
                                    int discarded$27 = 62;
                                    gf.a(k.c(109));
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  rc.c(-8);
                                  break L10;
                                }
                              }
                              if (!kg.field_o) {
                                break L6;
                              } else {
                                rj.a((byte) 121, 50);
                                kg.field_o = false;
                                break L6;
                              }
                            } else {
                              break L8;
                            }
                          }
                        }
                        L13: {
                          if (!kg.field_o) {
                            rj.a((byte) 121, 150);
                            kg.field_o = true;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: {
                          if (!ll.field_g[2]) {
                            int discarded$28 = 7;
                            this.p();
                            break L14;
                          } else {
                            if (ll.field_g[0]) {
                              if (ll.field_g[3]) {
                                if (ll.field_g[6]) {
                                  if (!ll.field_g[5]) {
                                    int discarded$29 = 75;
                                    this.n();
                                    break L14;
                                  } else {
                                    if (ll.field_g[4]) {
                                      break L14;
                                    } else {
                                      int discarded$30 = 2;
                                      this.q();
                                      break L14;
                                    }
                                  }
                                } else {
                                  int discarded$31 = 0;
                                  this.e();
                                  break L14;
                                }
                              } else {
                                int discarded$32 = -117;
                                this.i();
                                break L14;
                              }
                            } else {
                              this.h(false);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (!pg.field_e) {
                            break L15;
                          } else {
                            L16: {
                              pg.field_e = false;
                              if (!fh.c(-95)) {
                                L17: {
                                  if (0 < og.field_n) {
                                    t.field_i[1] = new int[6];
                                    og.field_q[1].c(-12831, t.field_i[1].length);
                                    if (0 == el.field_i) {
                                      f.i((byte) -112);
                                      og.field_q[0].field_y = 0;
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  } else {
                                    break L17;
                                  }
                                }
                                L18: {
                                  if (null == el.field_o) {
                                    break L18;
                                  } else {
                                    if (el.field_o.field_o <= 0) {
                                      break L18;
                                    } else {
                                      el.field_o.e((byte) -70);
                                      break L18;
                                    }
                                  }
                                }
                                ai.field_p = el.field_i;
                                break L16;
                              } else {
                                ai.field_p = cd.field_j;
                                break L16;
                              }
                            }
                            tc.field_c = -1;
                            el.field_i = -1;
                            qj.field_b = true;
                            break L15;
                          }
                        }
                        if (ai.field_p != tc.field_c) {
                          L19: {
                            if (6 != ai.field_p) {
                              break L19;
                            } else {
                              if (ug.field_c > 0) {
                                break L19;
                              } else {
                                ai.field_p = 2;
                                break L19;
                              }
                            }
                          }
                          L20: {
                            if (-1 < tc.field_c) {
                              og.field_q[tc.field_c].c(16405);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            if (ai.field_p == -1) {
                              break L21;
                            } else {
                              og.field_q[ai.field_p].c(16405);
                              og.field_q[ai.field_p].field_q = 0;
                              if (ai.field_p != 3) {
                                og.field_q[ai.field_p].field_b = 0;
                                break L21;
                              } else {
                                og.field_q[ai.field_p].field_b = 1;
                                break L21;
                              }
                            }
                          }
                          L22: {
                            if (nf.field_A != 0) {
                              break L22;
                            } else {
                              td.a(-348, fl.field_c[30]);
                              break L22;
                            }
                          }
                          int fieldTemp$33 = nf.field_A + 1;
                          nf.field_A = nf.field_A + 1;
                          if (fieldTemp$33 != 160) {
                            break L6;
                          } else {
                            L23: {
                              L24: {
                                if (el.field_i == -1) {
                                  break L24;
                                } else {
                                  if (!fh.c(-109)) {
                                    break L24;
                                  } else {
                                    L25: {
                                      if (cd.field_j != 0) {
                                        int discarded$34 = -106;
                                        kb.a();
                                        break L25;
                                      } else {
                                        int discarded$35 = 118;
                                        nj.a();
                                        break L25;
                                      }
                                    }
                                    pg.field_e = true;
                                    break L23;
                                  }
                                }
                              }
                              if (tc.field_c == 2) {
                                ca.field_f = null;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            nf.field_A = 0;
                            tc.field_c = ai.field_p;
                            qj.field_b = false;
                            break L6;
                          }
                        } else {
                          if (tc.field_c == -1) {
                            if (dl.field_b) {
                              L26: {
                                if (gb.b(1)) {
                                  stackOut_62_0 = 0;
                                  stackIn_63_0 = stackOut_62_0;
                                  break L26;
                                } else {
                                  stackOut_61_0 = 1;
                                  stackIn_63_0 = stackOut_61_0;
                                  break L26;
                                }
                              }
                              dl.field_b = stackIn_63_0 != 0;
                              if (stackIn_63_0 != 0) {
                                break L6;
                              } else {
                                tc.field_c = -2;
                                ai.field_p = 0;
                                break L6;
                              }
                            } else {
                              el.field_o.a(-1578896191);
                              break L6;
                            }
                          } else {
                            og.field_q[tc.field_c].h((byte) 29);
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  int discarded$36 = -122;
                  je.c();
                  cm.a(-1, 0);
                  if (!sb.a(54)) {
                    break L5;
                  } else {
                    var2 = ((Geoblox) this).d((byte) -67);
                    if (var2 == 2) {
                      oh.a(320, 240, (m) (Object) fi.field_d, fi.field_d.field_o * 3 >> 1, -128, fi.field_d.field_o);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                } else {
                  L27: {
                    if (!kg.field_o) {
                      break L27;
                    } else {
                      rj.a((byte) 121, 50);
                      kg.field_o = false;
                      break L27;
                    }
                  }
                  ((Geoblox) this).h(115);
                  int discarded$37 = -31456;
                  if (!fj.f()) {
                    break L5;
                  } else {
                    int discarded$38 = 0;
                    boolean discarded$39 = this.g();
                    break L5;
                  }
                }
              }
              return;
            } else {
              ((Geoblox) this).l(121);
              continue L4;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0) {
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_42_0 = 0;
        he stackOut_2_0 = null;
        java.awt.Canvas stackOut_1_0 = null;
        boolean stackOut_41_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_6_0 = 0;
        boolean stackOut_5_0 = false;
        L0: {
          var4 = field_C;
          if (vl.field_n != null) {
            stackOut_2_0 = vl.field_n;
            stackIn_3_0 = (Object) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = f.field_kb;
            stackIn_3_0 = (Object) (Object) stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        int discarded$5 = 255;
        if (!bl.b()) {
          if (!ib.field_a) {
            fc.a(true, (java.awt.Canvas) var2);
            return;
          } else {
            if (!uk.g(39)) {
              lc.a(ph.field_g, -2, 100.0f);
              fc.a(true, (java.awt.Canvas) var2);
              return;
            } else {
              L1: {
                L2: {
                  sh.field_y.a(param0 + -25598);
                  vb.c();
                  if (tc.field_c != ai.field_p) {
                    break L2;
                  } else {
                    if (el.field_i != -1) {
                      break L2;
                    } else {
                      if (tc.field_c == -1) {
                        if (!dl.field_b) {
                          el.field_o.a((byte) -49);
                          break L1;
                        } else {
                          oc.c(240);
                          break L1;
                        }
                      } else {
                        og.field_q[tc.field_c].a(-28750);
                        break L1;
                      }
                    }
                  }
                }
                L3: {
                  L4: {
                    var3 = -480 + (nf.field_A * 6 - -35);
                    if (el.field_i != 0) {
                      break L4;
                    } else {
                      if (qj.field_b) {
                        break L4;
                      } else {
                        if (0 != ai.field_p) {
                          if (tc.field_c == -1) {
                            el.field_o.a((byte) -68);
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          el.field_o.a((byte) -68);
                          break L3;
                        }
                      }
                    }
                  }
                  vb.a(0, 0, 640, 480, 1);
                  break L3;
                }
                L5: {
                  if (tc.field_c != -2) {
                    break L5;
                  } else {
                    oc.c(param0 ^ 25613);
                    break L5;
                  }
                }
                L6: {
                  vb.e(0, 0, 640, var3);
                  if (ai.field_p != -1) {
                    og.field_q[ai.field_p].a(-28750);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  vb.e(0, var3, 640, 480);
                  if (tc.field_c > -1) {
                    og.field_q[tc.field_c].a(-28750);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                vb.e(0, 0, 640, 480);
                qj.field_c.b(0, 6 * nf.field_A + -480);
                break L1;
              }
              L8: {
                if (!cg.b(true)) {
                  break L8;
                } else {
                  L9: {
                    if (null == vl.field_n) {
                      stackOut_41_0 = lh.field_d;
                      stackIn_42_0 = stackOut_41_0 ? 1 : 0;
                      break L9;
                    } else {
                      stackOut_40_0 = 1;
                      stackIn_42_0 = stackOut_40_0;
                      break L9;
                    }
                  }
                  int discarded$6 = 0;
                  kb.a(stackIn_42_0 != 0);
                  break L8;
                }
              }
              L10: {
                int discarded$7 = 0;
                i.a(0, (byte) 110, (java.awt.Canvas) var2);
                if (param0 == 25853) {
                  break L10;
                } else {
                  field_D = -11L;
                  break L10;
                }
              }
              return;
            }
          }
        } else {
          L11: {
            if (vl.field_n != null) {
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L11;
            } else {
              stackOut_5_0 = lh.field_d;
              stackIn_7_0 = stackOut_5_0 ? 1 : 0;
              break L11;
            }
          }
          ei.a(stackIn_7_0 != 0, param0 + -25853, (java.awt.Canvas) var2);
          return;
        }
    }

    private final void h(boolean param0) {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("jewels", (byte) -128))) {
                return;
            }
            if (param0) {
                return;
            }
            kj.field_E = ug.a("jewls_foreground", ll.field_f, (byte) -78, "jewels");
            bj.field_r = jg.a(ll.field_f, 1, "jewels", "jewls_background");
            ll.field_g[0] = true;
            return;
        }
    }

    private final void q() {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("baking", (byte) -125))) {
                return;
            }
            hi.field_F = ug.a("baking_foreground", ll.field_f, (byte) -78, "baking");
            ca.field_g = jg.a(ll.field_f, 1, "baking", "baking_background");
            ll.field_g[4] = true;
            return;
        }
    }

    private final void e() {
        if (ll.field_f.a(0)) {
            if (!ll.field_f.a("space", (byte) -127)) {
                return;
            }
            fl.field_a = ug.a("space_foreground", ll.field_f, (byte) -78, "space");
            df.field_a = jg.a(ll.field_f, 1, "space", "space_background");
            ll.field_g[6] = true;
            return;
        }
    }

    private final void f(boolean param0) {
        if (ak.field_b != null) {
            wh.a(true, ak.field_b);
            ak.field_b = null;
            ih.b(-105);
        }
        int discarded$0 = -111;
        int discarded$1 = 1;
        ll.field_f = je.a(1, true, param0);
        wj.field_F = kk.a(2, (byte) -62);
        ah.field_c = kk.a(3, (byte) -62);
        cd.field_m = kk.a(4, (byte) -62);
        fe.field_a = kk.a(5, (byte) -62);
        ii.field_k = kk.a(6, (byte) -62);
        int discarded$2 = -84;
        qe.a(ki.field_b, re.field_i);
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = field_C;
          var2 = 0;
          var3 = gb.field_f;
          if (var3 >= 5) {
            if (var3 < 105) {
              var2 = (-40960 + 16384 * var3) / 220;
              break L0;
            } else {
              if (120 <= var3) {
                break L0;
              } else {
                var3 = 120 + -var3;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              }
            }
          } else {
            var2 = 8192 * var3 * var3 / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param1 != 1) {
            break L1;
          } else {
            var5 = 1;
            break L1;
          }
        }
        L2: {
          if (3 == param1) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (4 == param1) {
            var4 = 1;
            var5 = 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 == 5) {
            var5 = 1;
            var4 = -1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 != 6) {
            break L5;
          } else {
            var5 = -1;
            var4 = 1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (7 == param1) {
              break L7;
            } else {
              if (8 != param1) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (param1 == 11) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (param1 != 12) {
            break L9;
          } else {
            var5 = -1;
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param1 != 14) {
            break L11;
          } else {
            var4 = -1;
            var5 = 1;
            break L11;
          }
        }
        L12: {
          if (param1 == 15) {
            var4 = 1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        lk.field_f = bm.a(var2 * var4, param0, var5 * var2);
    }

    private final void m() {
        int var2 = 0;
        int var3 = field_C;
        if (!(og.field_n > 0)) {
            t.field_i[1] = new int[5];
        }
        for (var2 = 0; var2 < 9; var2++) {
            og.field_q[var2] = new c((Geoblox) this, var2);
        }
        ai.field_p = -1;
        tc.field_c = -1;
        int discarded$0 = 0;
        vf.f();
        ne.a((byte) -74);
        gb.field_g = 5997;
        oa.field_a = 4703;
        kb.field_d = 275;
        ml.field_r = 1385;
        lb.field_b = 935;
        dc.field_a = 0;
        el.field_g = 8801;
        sc.field_f = 3382;
        int discarded$1 = 20;
        int discarded$2 = 150;
        da.b();
    }

    private final void p() {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("sweets", (byte) -128))) {
                return;
            }
            lb.field_d = ug.a("sweets_foreground", ll.field_f, (byte) -78, "sweets");
            pi.field_O = jg.a(ll.field_f, 1, "sweets", "sweets_background");
            ll.field_g[2] = true;
            return;
        }
    }

    final void b(int param0) {
        if (param0 <= 109) {
            return;
        }
        ((Geoblox) this).a((byte) -70, 9, 8, 10, 0, false, 7, 1);
        kj var2 = new kj();
        var2.e(-1636, 9, 128);
        jh.a((java.awt.Component) (Object) f.field_kb, ka.field_i, false, var2, true, 22050);
        ((Geoblox) this).a(false, false, true, true, -95);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Please login";
        field_z = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_D = 0L;
        field_B = new qg(2);
    }
}
