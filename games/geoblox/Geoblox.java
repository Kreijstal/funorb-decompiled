/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Canvas;

public final class Geoblox extends wf {
    static String[] field_z;
    static String field_A;
    static volatile long field_D;
    static f field_y;
    static qg field_B;
    public static int field_C;

    private final void n(int param0) {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("sports", (byte) -126))) {
                return;
            }
            if (param0 <= 37) {
                this.m(92);
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
        me.b(122);
        if (!(vl.field_n == null)) {
            vl.field_n.a(0, ka.field_i);
        }
        pc.a((byte) 124);
    }

    private final boolean o(int param0) {
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
                    lc.a(oh.field_c, param0 + -25871, 80.0f);
                    ((Geoblox) this).a(25853);
                    dd.field_G = w.a("", ll.field_f, ii.field_k, true, "font");
                    wf.field_p = dd.field_G.e(1);
                    dd.field_G.field_K[0][wf.field_p] = 16689938;
                    dd.field_G.field_K[0][dd.field_G.e(16777215)] = 1;
                    var2 = dd.field_G.field_K[0].length;
                    dd.field_G.field_K[1] = new int[var2];
                    sf.a(dd.field_G.field_K[0], 0, dd.field_G.field_K[1], 0, var2);
                    dd.field_G.field_K[1][wf.field_p] = 16777215;
                    var12 = wj.a("geoms", "", ll.field_f, 0);
                    var4 = -1;
                    for (var5_int = 0; var12.length > var5_int; var5_int++) {
                        var6_int = var5_int % 7;
                        if (!(var6_int != -1)) {
                            var4++;
                            if (-8 <= var4) {
                                break;
                            }
                        }
                        var7_int = var12[var5_int].field_s;
                        var8_int = var12[var5_int].field_o;
                        s.field_G[var4][var6_int] = var12[var5_int];
                        for (var9 = 0; -8 < (var9 ^ -1); var9++) {
                            ke.field_a[var4][var6_int][var9] = new dm(var7_int, var8_int);
                            ke.field_a[var4][var6_int][var9].e();
                            var12[var5_int].b(0, 0, jg.field_f[var4][var9]);
                        }
                    }
                    var13 = wj.a("amorphic", "", ll.field_f, param0 ^ 25869);
                    for (var4 = 0; -8 < (var4 ^ -1); var4++) {
                        for (var5_int = 0; (var5_int ^ -1) > -8; var5_int++) {
                            for (var6_int = 0; var6_int < var13.length; var6_int++) {
                                ka.field_m[var4][var5_int][var6_int] = new dm(4 + var13[var6_int].field_s, 4 + var13[var6_int].field_o);
                                ka.field_m[var4][var5_int][var6_int].e();
                                var13[var6_int].b(2, 2, jg.field_f[var4][var5_int]);
                                k.a(0, 0, ka.field_m[var4][var5_int][var6_int].field_s, param0 ^ -3266, ka.field_m[var4][var5_int][var6_int].field_o);
                            }
                        }
                    }
                    sh.field_y.a(255);
                    fi.field_d = gi.a(ii.field_k, 1, ll.field_f, "small_font", "");
                    fc.field_g = wj.a("black", "", ll.field_f, 0);
                    hg.field_b = wj.a("black_implode", "", ll.field_f, 0);
                    hb.field_d = wj.a("silver", "", ll.field_f, 0);
                    ej.field_a = wj.a("amorph_crack", "", ll.field_f, 0);
                    i.field_a = ug.a("player_back", ll.field_f, (byte) -78, "");
                    var5 = wj.a("player_eyes", "", ll.field_f, 0);
                    if (da.a(0, 125)) {
                        var5 = wj.a("player_eyes", "halloween", ll.field_f, 0);
                    }
                    fc.field_b = new dm[var5.length];
                    for (var6_int = 0; var5.length > var6_int; var6_int++) {
                        fc.field_b[var6_int] = new dm(4 + var5[var6_int].field_s, var5[var6_int].field_o - -4);
                        fc.field_b[var6_int].e();
                        var5[var6_int].c(2, 2);
                        k.a(0, 0, fc.field_b[var6_int].field_s, -27085, fc.field_b[var6_int].field_m);
                        fc.field_b[var6_int].d();
                    }
                    var6 = wj.a("player_mouth", "", ll.field_f, 0);
                    if (da.a(0, param0 + -25774)) {
                        var6 = wj.a("player_mouth", "halloween", ll.field_f, 0);
                    }
                    vh.field_H = new dm[var6.length];
                    for (var7_int = 0; var6.length > var7_int; var7_int++) {
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
                    vg.field_f = wj.a("silver_shock", "", ll.field_f, 0);
                    mi.field_B = wj.a("sparkle", "", ll.field_f, 0);
                    for (var7_int = 0; mi.field_B.length > var7_int; var7_int++) {
                        mi.field_B[var7_int].g(1);
                    }
                    vj.field_a = wj.a("bang", "", ll.field_f, 0);
                    eg.field_q = wj.a("bonus_glow", "", ll.field_f, 0);
                    pk.field_k = ug.a("bubble", ll.field_f, (byte) -78, "");
                    k.field_a = ug.a("pop", ll.field_f, (byte) -78, "");
                    eb.field_g = wj.a("box_mouse", "", ll.field_f, 0);
                    vf.field_H = wj.a("cry_begin", "", ll.field_f, 0);
                    ok.field_a = wj.a("cry_middle", "", ll.field_f, 0);
                    ld.field_b = wj.a("cry_end", "", ll.field_f, 0);
                    if (!(!da.a(0, 110))) {
                        vf.field_H = wj.a("cry_begin", "halloween", ll.field_f, 0);
                        ok.field_a = wj.a("cry_middle", "halloween", ll.field_f, 0);
                        ld.field_b = wj.a("cry_end", "halloween", ll.field_f, 0);
                    }
                    var7 = new na[8];
                    var7[0] = jg.a(ll.field_f, 1, "", "keyboard_left");
                    var7[1] = jg.a(ll.field_f, 1, "", "keyboard_right");
                    var7[2] = jg.a(ll.field_f, 1, "", "keyboard_enter");
                    var7[3] = jg.a(ll.field_f, 1, "", "keyboard_space");
                    var7[4] = jg.a(ll.field_f, h.a(param0, 25868), "", "keyboard_esc");
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
                    while (var11 < var17.length) {
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
                    tl.field_r = wj.a("intro_faces", "", ll.field_f, 0);
                    if (da.a(0, -105)) {
                        tl.field_r = wj.a("intro_faces", "halloween", ll.field_f, 0);
                    }
                    qh.field_O = wj.a("intro_geoms", "", ll.field_f, 0);
                    sl.field_f = wj.a("achievements", "", ll.field_f, 0);
                    am.field_b = ug.a("unachieved", ki.field_b, (byte) -78, "basic");
                    dm discarded$0 = ug.a("locked", ki.field_b, (byte) -78, "basic");
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
        if (param0 != 25869) {
            field_z = null;
        }
        lc.a(uj.field_a, -2, 100.0f);
        ((Geoblox) this).a(param0 ^ 496);
        qg.b(9313);
        return true;
    }

    private final boolean g(boolean param0) {
        rh stackIn_9_0 = null;
        rh stackIn_10_0 = null;
        rh stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        String stackIn_26_0 = null;
        rh stackIn_26_1 = null;
        String stackIn_26_2 = null;
        String stackIn_26_3 = null;
        String stackIn_27_0 = null;
        rh stackIn_27_1 = null;
        String stackIn_27_2 = null;
        String stackIn_27_3 = null;
        String stackIn_28_0 = null;
        rh stackIn_28_1 = null;
        String stackIn_28_2 = null;
        String stackIn_28_3 = null;
        int stackIn_28_4 = 0;
        String stackIn_46_0 = null;
        rh stackIn_46_1 = null;
        String stackIn_46_2 = null;
        String stackIn_46_3 = null;
        String stackIn_47_0 = null;
        rh stackIn_47_1 = null;
        String stackIn_47_2 = null;
        String stackIn_47_3 = null;
        String stackIn_48_0 = null;
        rh stackIn_48_1 = null;
        String stackIn_48_2 = null;
        String stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        rh stackOut_8_0 = null;
        rh stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        rh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        String stackOut_45_0 = null;
        rh stackOut_45_1 = null;
        String stackOut_45_2 = null;
        String stackOut_45_3 = null;
        String stackOut_47_0 = null;
        rh stackOut_47_1 = null;
        String stackOut_47_2 = null;
        String stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        String stackOut_46_0 = null;
        rh stackOut_46_1 = null;
        String stackOut_46_2 = null;
        String stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        String stackOut_25_0 = null;
        rh stackOut_25_1 = null;
        String stackOut_25_2 = null;
        String stackOut_25_3 = null;
        String stackOut_27_0 = null;
        rh stackOut_27_1 = null;
        String stackOut_27_2 = null;
        String stackOut_27_3 = null;
        int stackOut_27_4 = 0;
        String stackOut_26_0 = null;
        rh stackOut_26_1 = null;
        String stackOut_26_2 = null;
        String stackOut_26_3 = null;
        int stackOut_26_4 = 0;
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
                    L2: {
                      stackOut_8_0 = ah.field_c;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (param0) {
                        stackOut_10_0 = (rh) (Object) stackIn_10_0;
                        stackOut_10_1 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L2;
                      } else {
                        stackOut_9_0 = (rh) (Object) stackIn_9_0;
                        stackOut_9_1 = 1;
                        stackIn_11_0 = stackOut_9_0;
                        stackIn_11_1 = stackOut_9_1;
                        break L2;
                      }
                    }
                    if (((rh) (Object) stackIn_11_0).b(stackIn_11_1 == 0)) {
                      break L1;
                    } else {
                      L3: {
                        if (!fe.field_a.a(0)) {
                          break L3;
                        } else {
                          if (fe.field_a.b(true)) {
                            L4: {
                              if (!cd.field_m.a(0)) {
                                break L4;
                              } else {
                                if (cd.field_m.b(true)) {
                                  L5: {
                                    if (!ii.field_k.a(0)) {
                                      break L5;
                                    } else {
                                      if (!ii.field_k.b(true)) {
                                        break L5;
                                      } else {
                                        L6: {
                                          if (!ll.field_f.a(0)) {
                                            break L6;
                                          } else {
                                            if (!ll.field_f.a("", (byte) -127)) {
                                              break L6;
                                            } else {
                                              L7: {
                                                if (!ll.field_f.a(0)) {
                                                  break L7;
                                                } else {
                                                  if (!ll.field_f.a("sun", (byte) -127)) {
                                                    break L7;
                                                  } else {
                                                    L8: {
                                                      if (!da.a(0, -112)) {
                                                        break L8;
                                                      } else {
                                                        L9: {
                                                          if (!ll.field_f.a(0)) {
                                                            break L9;
                                                          } else {
                                                            if (!ll.field_f.a("halloween", (byte) -127)) {
                                                              break L9;
                                                            } else {
                                                              break L8;
                                                            }
                                                          }
                                                        }
                                                        lc.a(gf.a(s.field_F, ll.field_f, "halloween", uj.field_c, true), -2, 45.0f);
                                                        return false;
                                                      }
                                                    }
                                                    L10: {
                                                      if (!ki.field_b.a(0)) {
                                                        break L10;
                                                      } else {
                                                        if (!ki.field_b.a("basic", (byte) -124)) {
                                                          break L10;
                                                        } else {
                                                          if (!param0) {
                                                            wd.c(480);
                                                            lc.a(uj.field_a, -2, 50.0f);
                                                            ((Geoblox) this).a(25853);
                                                            ef.field_e = true;
                                                            return true;
                                                          } else {
                                                            return true;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L11: {
                                                      stackOut_45_0 = ff.field_l;
                                                      stackOut_45_1 = ki.field_b;
                                                      stackOut_45_2 = "basic";
                                                      stackOut_45_3 = wi.field_F;
                                                      stackIn_47_0 = stackOut_45_0;
                                                      stackIn_47_1 = stackOut_45_1;
                                                      stackIn_47_2 = stackOut_45_2;
                                                      stackIn_47_3 = stackOut_45_3;
                                                      stackIn_46_0 = stackOut_45_0;
                                                      stackIn_46_1 = stackOut_45_1;
                                                      stackIn_46_2 = stackOut_45_2;
                                                      stackIn_46_3 = stackOut_45_3;
                                                      if (param0) {
                                                        stackOut_47_0 = (String) (Object) stackIn_47_0;
                                                        stackOut_47_1 = (rh) (Object) stackIn_47_1;
                                                        stackOut_47_2 = (String) (Object) stackIn_47_2;
                                                        stackOut_47_3 = (String) (Object) stackIn_47_3;
                                                        stackOut_47_4 = 0;
                                                        stackIn_48_0 = stackOut_47_0;
                                                        stackIn_48_1 = stackOut_47_1;
                                                        stackIn_48_2 = stackOut_47_2;
                                                        stackIn_48_3 = stackOut_47_3;
                                                        stackIn_48_4 = stackOut_47_4;
                                                        break L11;
                                                      } else {
                                                        stackOut_46_0 = (String) (Object) stackIn_46_0;
                                                        stackOut_46_1 = (rh) (Object) stackIn_46_1;
                                                        stackOut_46_2 = (String) (Object) stackIn_46_2;
                                                        stackOut_46_3 = (String) (Object) stackIn_46_3;
                                                        stackOut_46_4 = 1;
                                                        stackIn_48_0 = stackOut_46_0;
                                                        stackIn_48_1 = stackOut_46_1;
                                                        stackIn_48_2 = stackOut_46_2;
                                                        stackIn_48_3 = stackOut_46_3;
                                                        stackIn_48_4 = stackOut_46_4;
                                                        break L11;
                                                      }
                                                    }
                                                    lc.a(gf.a(stackIn_48_0, stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4 != 0), -2, 50.0f);
                                                    return false;
                                                  }
                                                }
                                              }
                                              lc.a(gf.a(ff.field_l, ll.field_f, "sun", wi.field_F, true), -2, 45.0f);
                                              return false;
                                            }
                                          }
                                        }
                                        lc.a(gf.a(ff.field_l, ll.field_f, "", wi.field_F, true), -2, 45.0f);
                                        return false;
                                      }
                                    }
                                  }
                                  L12: {
                                    stackOut_25_0 = ik.field_b;
                                    stackOut_25_1 = ii.field_k;
                                    stackOut_25_2 = "";
                                    stackOut_25_3 = nb.field_a;
                                    stackIn_27_0 = stackOut_25_0;
                                    stackIn_27_1 = stackOut_25_1;
                                    stackIn_27_2 = stackOut_25_2;
                                    stackIn_27_3 = stackOut_25_3;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    stackIn_26_2 = stackOut_25_2;
                                    stackIn_26_3 = stackOut_25_3;
                                    if (param0) {
                                      stackOut_27_0 = (String) (Object) stackIn_27_0;
                                      stackOut_27_1 = (rh) (Object) stackIn_27_1;
                                      stackOut_27_2 = (String) (Object) stackIn_27_2;
                                      stackOut_27_3 = (String) (Object) stackIn_27_3;
                                      stackOut_27_4 = 0;
                                      stackIn_28_0 = stackOut_27_0;
                                      stackIn_28_1 = stackOut_27_1;
                                      stackIn_28_2 = stackOut_27_2;
                                      stackIn_28_3 = stackOut_27_3;
                                      stackIn_28_4 = stackOut_27_4;
                                      break L12;
                                    } else {
                                      stackOut_26_0 = (String) (Object) stackIn_26_0;
                                      stackOut_26_1 = (rh) (Object) stackIn_26_1;
                                      stackOut_26_2 = (String) (Object) stackIn_26_2;
                                      stackOut_26_3 = (String) (Object) stackIn_26_3;
                                      stackOut_26_4 = 1;
                                      stackIn_28_0 = stackOut_26_0;
                                      stackIn_28_1 = stackOut_26_1;
                                      stackIn_28_2 = stackOut_26_2;
                                      stackIn_28_3 = stackOut_26_3;
                                      stackIn_28_4 = stackOut_26_4;
                                      break L12;
                                    }
                                  }
                                  lc.a(gf.a(stackIn_28_0, stackIn_28_1, stackIn_28_2, stackIn_28_3, stackIn_28_4 != 0), -2, 35.0f);
                                  return false;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            lc.a(vd.a(ud.field_b, pa.field_e, 0, param0, cd.field_m), -2, 25.0f);
                            return false;
                          } else {
                            break L3;
                          }
                        }
                      }
                      lc.a(gf.a(ji.field_n, fe.field_a, "", dd.field_F, true), -2, 15.0f);
                      return false;
                    }
                  }
                }
                lc.a(gf.a(pa.field_e, ah.field_c, "", ud.field_b, true), -2, 10.0f);
                return false;
              }
            }
          }
          lc.a(gf.a(pa.field_e, wj.field_F, "", ud.field_b, true), -2, 5.0f);
          return false;
        }
    }

    final void b(byte param0) {
        Geoblox.r(0);
        ch.c((byte) 122);
        kj.b(false);
        ug.a(9144);
        sg.a(-13575);
        hg.a(-17525);
        ic.a(16424);
        ok.a(true);
        wf.g(30344);
        wg.c((byte) 108);
        wl.a(31997);
        le.a(-29313);
        vk.a(-42);
        vb.a();
        rh.b(30261);
        b.a(17062);
        kb.c(105);
        qc.d(0);
        oa.b(8192);
        ab.a((byte) -60);
        gf.a(true);
        gg.a(45);
        jk.a(param0 ^ 10848);
        ik.a(48);
        vd.b(param0 + 59);
        pg.b(22059);
        lj.a(-1);
        cl.a(-9474);
        i.a(false);
        cj.b(param0 ^ 78);
        sc.b((byte) 58);
        eb.a((byte) -127);
        he.a(param0 + 64);
        v.a(true);
        c.d((byte) 28);
        gh.i(-17199);
        ji.d(-50);
        uf.a(param0 ^ 74);
        em.a(86);
        ba.e(21888);
        tf.f(51);
        hf.b((byte) -128);
        fi.a(param0 + -63);
        jb.b();
        ad.c(-1);
        je.a((byte) 54);
        qk.h();
        tj.a(param0 + 154);
        ud.a(0);
        da.a(50);
        bm.a(114);
        fe.c(-127);
        nh.a(true);
        eh.a(-6910);
        ld.a(true);
        fa.a(30970);
        ng.k(param0 + -33);
        r.r(-60);
        rl.h((byte) 57);
        ei.n(param0 ^ 69);
        f.n(-107);
        qh.h(0);
        wi.f(1);
        pf.a((byte) -97);
        hi.i((byte) -85);
        mb.a(param0 + 63);
        ej.a(-89);
        mj.a(param0 + 168);
        ue.a(true);
        w.a((byte) 102);
        bl.a(param0 ^ 9769);
        m.a();
        rc.c((byte) -110);
        wh.f(param0 ^ -5558);
        nj.c((byte) 45);
        ke.a((byte) -80);
        af.a((byte) -103);
        te.a(-8297);
        qe.a(-8616);
        qg.a(85);
        df.a(param0 + 64);
        pk.j(param0 ^ -64);
        ki.a((byte) -64);
        ka.a((byte) 26);
        oh.a((byte) -88);
        wd.b(-10943);
        ja.e((byte) 104);
        kc.a(126);
        mf.a(false);
        ah.a(39);
        fl.a(33);
        kd.a((byte) 122);
        ri.a(5366);
        pa.b((byte) 74);
        bh.a((byte) 81);
        ec.a(true);
        pj.b(false);
        vl.b(true);
        t.a(17348);
        kh.a(104);
        ne.b((byte) -125);
        kk.i(-84);
        sd.e((byte) 118);
        bj.b(true);
        pb.f(31735);
        dl.a(true);
        ij.i((byte) -80);
        bk.a(true);
        ff.a(true);
        mh.c();
        ua.a();
        dc.b(126);
        nf.b((byte) 115);
        lb.a(31);
        rb.a((byte) -112);
        fc.a((byte) -126);
        nb.a(-102);
        ak.a(param0 ^ 30613);
        kf.b(param0 + -15583);
        tc.a(true);
        mi.b(false);
        vg.a(true);
        am.a((byte) 49);
        oj.a(-87);
        tb.a();
        eg.b(false);
        oi.a((byte) -108);
        ek.a(-128);
        bi.a(1);
        rd.a((byte) 94);
        hb.a(param0 ^ -64);
        jf.b((byte) -89);
        el.b(-5927);
        hk.f((byte) -11);
        sh.a((byte) -3);
        oe.j(89);
        dd.i(256);
        ee.e(14078);
        gb.b((byte) 79);
        a.a(param0);
        u.a();
        ul.a(-113);
        og.f(111);
        ih.a((byte) 73);
        di.a((byte) 107);
        jj.a(126);
        wb.a((byte) 95);
        qa.a((byte) -30);
        kg.e((byte) 77);
        sb.b(false);
        vj.a(-97);
        jg.c(16712207);
        bd.b(-20152);
        cm.a(false);
        bf.c((byte) -117);
        rj.a(param0 ^ -33);
        id.b(true);
        md.a((byte) 40);
        li.a(false);
        va.a(0);
        ge.b(102);
        ed.a();
        cg.c((byte) -120);
        hd.f((byte) -52);
        hc.k(-243);
        dj.l((byte) -15);
        qf.m(param0 ^ -320);
        hl.f(407213000);
        vh.b(true);
        vf.h(0);
        td.f(-116);
        pi.j(24033);
        vi.f(-75);
        q.f(param0 + 65);
        jc.a(-43);
        s.b(false);
        qb.f(0);
        ol.f(0);
        ll.a(param0 + 71);
        vc.b((byte) -87);
        l.b(param0 ^ 47);
        sj.a(27);
        la.g((byte) -113);
        fk.f(param0 + 14576);
        ck.a(-113);
        gi.a(param0 ^ 63);
        ra.a(param0 + 63);
        fj.e(-111);
        gj.h(-1);
        cd.e(1353);
        ub.a();
        qj.a((byte) -23);
        k.b(0);
        ef.a((byte) 101);
        ai.b(46695);
        ph.a((byte) 112);
        ml.b(16777215);
        fh.a(1);
        ac.a((byte) 68);
        uh.c(0);
        oc.a(true);
        wj.f((byte) -60);
        j.f((byte) -128);
        re.b(127);
        ii.a(122);
        sl.a(102);
        gk.a(param0 ^ -64);
        ni.a((byte) -113);
        qi.c(59);
        p.b(param0 ^ 25);
        od.a((byte) -92);
        lf.b(8221);
        th.d((byte) -109);
        nk.b(-17226);
        uj.a(-53);
        tl.b(param0 ^ -6501);
        ea.b(1000);
        se.b(param0 ^ -65);
        ca.b(false);
        si.a(false);
        lk.a((byte) 0);
        me.c((byte) -40);
        uk.d((byte) 113);
        g.g(param0 + -51);
        ag.g(param0 + -22);
        mk.c((byte) -9);
        cf.g(-48);
        n.g(param0 + 64);
        hh.a(false);
        fb.b(true);
        lh.b(-481);
        ib.a(true);
        ((Geoblox) this).field_n = null;
    }

    private final void i(byte param0) {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("germs", (byte) -126))) {
                return;
            }
            sl.field_c = ug.a("germs_foreground", ll.field_f, (byte) -78, "germs");
            sg.field_e = jg.a(ll.field_f, 1, "germs", "germs_background");
            int var2 = -24 / ((param0 - -13) / 61);
            ll.field_g[3] = true;
            return;
        }
    }

    public final void init() {
        ((Geoblox) this).a(11, "geoblox", 640);
    }

    final static void a(int param0, dm param1) {
        oc.b(9);
        vb.a(param1.field_v, param1.field_s, param1.field_o);
        if (param0 != 1) {
            Object var3 = null;
            Geoblox.a(-34, (dm) null);
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
        ng.h(78);
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
                if (!bl.b(255)) {
                  L6: {
                    if (!ib.field_a) {
                      L7: {
                        oj.a(vc.field_i, (byte) -98);
                        if (!this.g(false)) {
                          break L7;
                        } else {
                          if (this.o(25869)) {
                            ib.field_a = true;
                            this.m(82);
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
                          if (!dd.a((byte) 47)) {
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
                                var2 = sl.a(stackIn_91_0 != 0, (wf) this, false);
                                if (-2364825 != (var2 ^ -1)) {
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
                                  if ((var2 ^ -1) == -3) {
                                    gf.a(k.c(109), 62);
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
                            this.p(7);
                            break L14;
                          } else {
                            if (ll.field_g[0]) {
                              if (ll.field_g[3]) {
                                if (ll.field_g[6]) {
                                  if (!ll.field_g[5]) {
                                    this.n(75);
                                    break L14;
                                  } else {
                                    if (ll.field_g[4]) {
                                      break L14;
                                    } else {
                                      this.q(2);
                                      break L14;
                                    }
                                  }
                                } else {
                                  this.e(false);
                                  break L14;
                                }
                              } else {
                                this.i((byte) -117);
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
                                    if ((el.field_o.field_o ^ -1) >= -1) {
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
                            if (0 == (ai.field_p ^ -1)) {
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
                          nf.field_A = nf.field_A + 1;
                          if (nf.field_A + 1 != 160) {
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
                                        kb.a(-106);
                                        break L25;
                                      } else {
                                        nj.a((byte) 118);
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
                          if ((tc.field_c ^ -1) == 0) {
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
                  je.c((byte) -122);
                  cm.a(-1, 0);
                  if (!sb.a(54)) {
                    break L5;
                  } else {
                    var2 = ((Geoblox) this).d((byte) -67);
                    if ((var2 ^ -1) == -3) {
                      oh.a(320, 240, (m) (Object) fi.field_d, fi.field_d.field_o * 3 >> 1516183521, -128, fi.field_d.field_o);
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
                  if (!fj.f(-31456)) {
                    break L5;
                  } else {
                    boolean discarded$1 = this.g(false);
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
        if (!bl.b(255)) {
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
                    if (0 != (el.field_i ^ -1)) {
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
                  if ((tc.field_c ^ -1) != 1) {
                    break L5;
                  } else {
                    oc.c(param0 ^ 25613);
                    break L5;
                  }
                }
                L6: {
                  vb.e(0, 0, 640, var3);
                  if ((ai.field_p ^ -1) != 0) {
                    og.field_q[ai.field_p].a(-28750);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  vb.e(0, var3, 640, 480);
                  if ((tc.field_c ^ -1) < 0) {
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
                  kb.a(stackIn_42_0 != 0, false);
                  break L8;
                }
              }
              L10: {
                i.a(0, (byte) 110, (java.awt.Canvas) var2, 0);
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

    private final void q(int param0) {
        if (ll.field_f.a(param0 + -2)) {
            if (!(ll.field_f.a("baking", (byte) -125))) {
                return;
            }
            hi.field_F = ug.a("baking_foreground", ll.field_f, (byte) -78, "baking");
            if (param0 != 2) {
                return;
            }
            ca.field_g = jg.a(ll.field_f, param0 + -1, "baking", "baking_background");
            ll.field_g[4] = true;
            return;
        }
    }

    private final void e(boolean param0) {
        if (ll.field_f.a(0)) {
            if (!ll.field_f.a("space", (byte) -127)) {
                return;
            }
            fl.field_a = ug.a("space_foreground", ll.field_f, (byte) -78, "space");
            df.field_a = jg.a(ll.field_f, 1, "space", "space_background");
            if (param0) {
                return;
            }
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
        ll.field_f = je.a(1, true, param0, true, (byte) -111);
        wj.field_F = kk.a(2, (byte) -62);
        ah.field_c = kk.a(3, (byte) -62);
        cd.field_m = kk.a(4, (byte) -62);
        fe.field_a = kk.a(5, (byte) -62);
        ii.field_k = kk.a(6, (byte) -62);
        qe.a(ki.field_b, re.field_i, -84);
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
            if ((var3 ^ -1) > -106) {
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
          if (-2 != (param1 ^ -1)) {
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
          if ((param1 ^ -1) == -6) {
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
          if (-12 == (param1 ^ -1)) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if ((param1 ^ -1) != -13) {
            break L9;
          } else {
            var5 = -1;
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param1 == -14) {
            var5 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-15 != param1) {
            break L11;
          } else {
            var4 = -1;
            var5 = 1;
            break L11;
          }
        }
        L12: {
          if (-16 == (param1 ^ -1)) {
            var4 = 1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        lk.field_f = bm.a(var2 * var4, param0, var5 * var2);
    }

    private final void m(int param0) {
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
        vf.f(0);
        ne.a((byte) -74);
        gb.field_g = 5997;
        oa.field_a = 4703;
        kb.field_d = 275;
        ml.field_r = 1385;
        lb.field_b = 935;
        dc.field_a = 0;
        el.field_g = 8801;
        sc.field_f = 3382;
        if (param0 <= 68) {
            this.h(true);
        }
        da.b(150, 20);
    }

    private final void p(int param0) {
        if (ll.field_f.a(0)) {
            if (!(ll.field_f.a("sweets", (byte) -128))) {
                return;
            }
            lb.field_d = ug.a("sweets_foreground", ll.field_f, (byte) -78, "sweets");
            if (param0 != 7) {
                return;
            }
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
