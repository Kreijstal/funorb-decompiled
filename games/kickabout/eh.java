/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eh implements pk {
    static String[] field_b;
    private boolean field_c;
    private boolean field_d;
    private boolean field_a;
    static int field_e;
    private static int[][] field_f;

    public final boolean c(int param0) {
        oi var2_ref_oi = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var3 = Kickabout.field_G;
          if (((eh) this).field_a) {
            break L0;
          } else {
            if (!ob.m(99)) {
              break L0;
            } else {
              ((eh) this).field_a = true;
              var2_ref_oi = (oi) (Object) ec.field_f.g(24009);
              L1: while (true) {
                if (var2_ref_oi == null) {
                  ok.field_a.b(22997);
                  og.a(20164);
                  break L0;
                } else {
                  L2: {
                    if (!c.a(var2_ref_oi.field_j, 0, bh.field_f)) {
                      break L2;
                    } else {
                      var2_ref_oi.c((byte) -109);
                      break L2;
                    }
                  }
                  var2_ref_oi = (oi) (Object) ec.field_f.c(param0 ^ -27629);
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (param0 == -27598) {
            break L3;
          } else {
            ((eh) this).field_a = true;
            break L3;
          }
        }
        L4: {
          if (!((eh) this).field_c) {
            L5: {
              if (-1 != (1 & vp.field_h)) {
                break L5;
              } else {
                var2 = js.field_e;
                if (-1 < var2) {
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            ((eh) this).field_c = true;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          if (((eh) this).field_d) {
            break L6;
          } else {
            if (!((eh) this).e(0)) {
              break L6;
            } else {
              ((eh) this).field_d = true;
              break L6;
            }
          }
        }
        L7: {
          L8: {
            if (!((eh) this).field_d) {
              break L8;
            } else {
              if (!((eh) this).field_c) {
                break L8;
              } else {
                if (!((eh) this).field_a) {
                  break L8;
                } else {
                  if (!ui.field_y) {
                    break L8;
                  } else {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L7;
                  }
                }
              }
            }
          }
          stackOut_23_0 = 0;
          stackIn_24_0 = stackOut_23_0;
          break L7;
        }
        return stackIn_24_0 != 0;
    }

    public final boolean a(boolean param0) {
        ut var4 = null;
        ut var6 = null;
        ut[] var7 = null;
        ut[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        int var11_int = 0;
        kg[] var10 = null;
        ut[][] var11 = null;
        ut[][] var12 = null;
        int var13 = Kickabout.field_G;
        if (!param0) {
            Object var14 = null;
            this.a(28, (ot) null);
        }
        mf.h((byte) -19);
        up.e(-1456);
        sj var16 = kh.field_g;
        sj var17 = ht.field_b;
        if (null != ht.field_c) {
            if (!(null == d.field_b)) {
                ml.k(61, 0);
                if (!(null != sr.field_h)) {
                    it.a(new rj(ht.field_c, d.field_b), d.field_b, (byte) -100);
                }
                d.field_b = null;
                ht.field_c = null;
                dd.a((byte) 49);
                return false;
            }
        }
        if (!(ni.field_i == null)) {
            ml.k(61, 1);
            f.a(ni.field_i, (byte) -122);
            ni.field_i = null;
            dd.a((byte) 53);
            return false;
        }
        if (!ja.d(111, fn.field_c)) {
            return false;
        }
        if (v.field_b != null) {
            ml.k(61, 2);
            eo.field_q = wa.a((byte) 124, "lobby", bo.field_Cb, "logo");
            eo.field_p = se.a(bo.field_Cb, -28, "lobby", "time");
            eo.field_j = se.a(bo.field_Cb, -121, "lobby", "tournament_icons");
            eo.field_j[0] = new ut(0, 0);
            eo.field_m = se.a(bo.field_Cb, -121, "lobby", "exhibition_icons");
            eo.field_m[0] = new ut(0, 0);
            eo.field_f = jo.a(bo.field_Cb, 17369, "lobby", "orb_icons");
            ut[] discarded$0 = se.a(bo.field_Cb, -127, "lobby", "players");
            tf.field_e = eo.field_q;
            un.field_d = gm.a(v.field_b, 10, "font2", bo.field_Cb, "fonts");
            q.field_d = qk.a("font", v.field_b, 75, "fonts", bo.field_Cb);
            pb.field_C = qk.a("", var17, 105, "arialish12", var16);
            var4 = new ut(16, 9);
            iw.a(-64, var4);
            on.d(4, 4, 3, 7829367);
            on.d(4, 4, 2, 13421772);
            ta.e(122);
            kg var5 = eo.a(var4);
            pb.field_C.a((qd[]) (Object) new kg[1], new int[1]);
            sk.a(83, 100, 10);
            var6 = wa.a((byte) 100, "basic", var16, "orbcoin");
            ch.a(var6, (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 77, "locked"), (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 77, "unachieved"), -123);
            sh.field_g = nh.b(nh.a(var6));
            nn.field_B = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 69, "divider");
            tt.field_e = wa.a((byte) 122, "menu", bo.field_Cb, "button_left_shine");
            ah.field_l = wa.a((byte) 106, "menu", bo.field_Cb, "button_middle_shine");
            sk.a(-109, 100, 20);
            cg.field_K = wa.a((byte) 107, "menu", bo.field_Cb, "button_right_shine");
            kh.field_r = wa.a((byte) 116, "menu", bo.field_Cb, "button_small_shine");
            ap.field_l = wa.a((byte) 101, "menu", bo.field_Cb, "button_large_shine");
            ig.field_a = se.a(bo.field_Cb, -119, "menu", "digifont");
            sk.a(90, 100, 25);
            wt.field_z = ng.a("swatch_overlay", "menu", 2, bo.field_Cb);
            var7 = ng.a("arrows", "menu", 2, bo.field_Cb);
            eo.field_k = new ot[]{(ot) (Object) var7[0], (ot) (Object) var7[2], (ot) (Object) var7[4]};
            eo.field_i = new ot[]{(ot) (Object) var7[1], (ot) (Object) var7[3], (ot) (Object) var7[5]};
            sk.a(86, 100, 30);
            sk.a(103, 100, 35);
            sk.a(-94, 100, 40);
            tb.field_q = ng.a("digits", "hud", 2, bo.field_Cb);
            ku.field_g = se.a(bo.field_Cb, -121, "hud", "cones");
            lu.field_p = ng.a("tutorial", "hud", 2, bo.field_Cb);
            tn.field_e = wa.a((byte) 114, "hud", bo.field_Cb, "arrow");
            nw.a(-128, wa.a((byte) 114, "hud", bo.field_Cb, "cursor"));
            sk.a(86, 100, 45);
            mc.field_k = ng.a("dialog_icon", "menu", 2, bo.field_Cb);
            wt.field_y = wa.a((byte) 107, "menu", bo.field_Cb, "star");
            sk.a(-48, 100, 60);
            var8 = ng.a("trinkets", "menu", 2, bo.field_Cb);
            tk.field_Fb = new ot[4][6];
            var9 = 0;
            for (var10_int = 0; var10_int < 3; var10_int++) {
                for (var11_int = 0; var11_int < 6; var11_int++) {
                    tk.field_Fb[var10_int][var11_int] = (ot) (Object) var8[var9];
                    var9++;
                }
            }
            for (var10_int = 0; (var10_int ^ -1) > -7; var10_int++) {
                tk.field_Fb[3][var10_int] = (ot) (Object) var8[var9];
            }
            ca.field_c = new ot[4];
            for (var10_int = 0; var10_int < ca.field_c.length; var10_int++) {
                ca.field_c[var10_int] = ri.a(tk.field_Fb[var10_int][0], param0);
            }
            kl.field_m = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 96, "help_up");
            ut discarded$1 = bg.a("menu", bo.field_Cb, (byte) 100, "help_dwn");
            mf.a(se.a(bo.field_Cb, -124, "menu", "tickbox"), true);
            sk.a(80, 100, 75);
            eq.field_h = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 93, "hammer_icon");
            ml.field_q = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 89, "hammer_icon_buy");
            sk.a(113, 100, 70);
            qj.field_f = bg.a("menu", bo.field_Cb, (byte) 60, "tactics_pitch");
            fc.field_h = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 109, "lock_icon");
            sk.a(90, 100, 80);
            es.field_f = bg.a("menu", bo.field_Cb, (byte) 78, "kit");
            kb.field_E = ng.a("cups", "menu", 2, bo.field_Cb);
            jm.field_i = ng.a("cups_empty", "menu", 2, bo.field_Cb);
            sk.a(102, 100, 90);
            fn.field_d = (ot) (Object) bg.a("menu", bo.field_Cb, (byte) 88, "shelf");
            rk.field_g = bg.a("menu", bo.field_Cb, (byte) 76, "scroll_button");
            bn.field_B = this.a("menu", bo.field_Cb, (byte) 26, "scroll_bar");
            su.field_a = wa.a((byte) 106, "menu", bo.field_Cb, "mini_ball");
            sk.a(-91, 100, 95);
            var10 = eo.field_f;
            var11 = new ut[][]{eo.field_p, null, eo.field_m, eo.field_j};
            var12 = new ut[][]{eo.field_p, null, eo.field_m, eo.field_j};
            Object var15 = null;
            uf.a(var11, id.field_y, ow.field_c, true, ld.field_g, var10, var16, 16971, or.field_b, rk.field_e, var17, sn.field_c, rp.field_y, ld.field_h, os.field_i, var12, (int[]) null, 8, 3, jd.field_i);
            la.field_k = da.field_k;
            qd.field_e = lr.field_n;
            wi.field_z = ja.field_Z;
            pn.field_t = 0;
            mr.a(false, 200);
            sk.a(-61, 100, 95);
            m.a(var17, var16, 5198);
            bf.a(-70, rm.field_A, 0, (java.applet.Applet) (Object) nm.field_g, 0, 16777215);
            Object var3 = null;
            v.field_b = null;
            dd.a((byte) 104);
            return false;
        }
        if (!(sj.field_f == null)) {
            ml.k(61, 3);
            cq.field_j = new ut(sj.field_f.a("background_guy.png", "", 36), (java.awt.Component) (Object) ln.l(64));
            mk.field_a = new ut(sj.field_f.a("background.png", "", 66), (java.awt.Component) (Object) ln.l(64));
            iu.field_k = new ut(sj.field_f.a("splash.jpg", "", 8), (java.awt.Component) (Object) ln.l(64));
            ai.field_E = new ut(sj.field_f.a("botbar.png", "", 66), (java.awt.Component) (Object) ln.l(64));
            sk.a(-114, 23, 2);
            vo.field_cb = nh.a(new ot(sj.field_f.a("bank_top.png", "", 3), (java.awt.Component) (Object) ln.l(64)));
            nn.field_C = nh.a(new ot(sj.field_f.a("bank_mid.png", "", 52), (java.awt.Component) (Object) ln.l(64)));
            du.field_i = nh.a(new ot(sj.field_f.a("bank_bot.png", "", 123), (java.awt.Component) (Object) ln.l(64)));
            lb.field_L = nh.a(new ot(sj.field_f.a("button_lrg.png", "", 91), (java.awt.Component) (Object) ln.l(64)));
            ll.field_m = nh.a(new ot(sj.field_f.a("button_sml.png", "", 81), (java.awt.Component) (Object) ln.l(64)));
            sk.a(122, 23, 4);
            nn.field_K = new ot(sj.field_f.a("cone_1.png", "", 91), (java.awt.Component) (Object) ln.l(64));
            re.field_o = new ot(sj.field_f.a("cone_2.png", "", 91), (java.awt.Component) (Object) ln.l(64));
            uv.field_m = nh.a(new ot(sj.field_f.a("button_left.png", "", 8), (java.awt.Component) (Object) ln.l(64)));
            uj.field_B = nh.a(new ot(sj.field_f.a("button_middle.png", "", 97), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-114, 23, 6);
            mf.field_Cb = nh.a(new ot(sj.field_f.a("button_right.png", "", 90), (java.awt.Component) (Object) ln.l(64)));
            pw.field_H = (ut) (Object) new ot(sj.field_f.a("stopwatch.png", "", 101), (java.awt.Component) (Object) ln.l(64));
            sk.a(-58, 23, 8);
            ut discarded$2 = nh.a(new ot(sj.field_f.a("thin_button_endl.png", "", 89), (java.awt.Component) (Object) ln.l(64)));
            ut discarded$3 = nh.a(new ot(sj.field_f.a("thin_button_mid.png", "", 5), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-105, 23, 10);
            ut discarded$4 = nh.a(new ot(sj.field_f.a("thin_button_endr.png", "", 58), (java.awt.Component) (Object) ln.l(64)));
            gu.field_zb = nh.a(new ot(sj.field_f.a("small_button_L.png", "", 52), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-61, 23, 12);
            ae.field_H = nh.a(new ot(sj.field_f.a("small_button_mid.png", "", 53), (java.awt.Component) (Object) ln.l(64)));
            fv.field_b = nh.a(new ot(sj.field_f.a("small_button_R.png", "", 117), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-85, 23, 14);
            mg.field_g = nh.a(new ot(sj.field_f.a("top_bar_Seg.png", "", 127), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-49, 23, 16);
            qt.field_u = nh.a(new ot(sj.field_f.a("top.png", "", 82), (java.awt.Component) (Object) ln.l(64)));
            sk.a(-98, 23, 18);
            fn.field_f = new ot(sj.field_f.a("asphalt_corner.png", "", 6), (java.awt.Component) (Object) ln.l(64));
            kn.field_J = new ut(sj.field_f.a("asphalt_v.png", "", 69), (java.awt.Component) (Object) ln.l(64));
            sk.a(126, 23, 20);
            vl.field_g = new ut(sj.field_f.a("asphalt_h.png", "", 124), (java.awt.Component) (Object) ln.l(64));
            eo.field_a = new ot(sj.field_f.a("arrow_on.png", "", 63), (java.awt.Component) (Object) ln.l(64));
            eo.field_b = new ot(sj.field_f.a("arrow_off.png", "", 4), (java.awt.Component) (Object) ln.l(64));
            sk.a(-89, 23, 23);
            this.a(11264, new ot(sj.field_f.a("achievements_large.png", "", 63), (java.awt.Component) (Object) ln.l(64)));
            sf.field_C = (ut) (Object) new ot(sj.field_f.a("ka_logo.png", "", 37), (java.awt.Component) (Object) ln.l(64));
            sj.field_f = null;
            dd.a((byte) 99);
            return false;
        }
        if (!(b.field_H == null)) {
            ml.k(61, 4);
            ee.a(new ks(b.field_H.a("huffman", "", 93)), false);
            b.field_H = null;
            dd.a((byte) 78);
            return false;
        }
        if (null != Kickabout.field_J) {
            ml.k(61, 5);
            ap.a((byte) -34, Kickabout.field_J);
            Kickabout.field_J = null;
            dd.a((byte) 81);
            return false;
        }
        if (nt.field_Bb == null) {
            return true;
        }
        ml.k(61, 6);
        rf.a(20113, vu.field_Eb, gd.field_h, nt.field_Bb);
        nt.field_Bb = null;
        vu.field_Eb = null;
        gd.field_h = null;
        dd.a((byte) 48);
        return false;
    }

    final void b(byte param0) {
        if (param0 != 115) {
            return;
        }
        wc.field_k = new sn((ma) (Object) nm.field_g);
    }

    final static void a(byte param0) {
        ut var2 = null;
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        ut var10 = null;
        ut var11 = null;
        L0: {
          var8 = Kickabout.field_G;
          if (param0 < -42) {
            break L0;
          } else {
            var9 = null;
            eh.a(-123, -22, (StringBuilder) null);
            break L0;
          }
        }
        L1: {
          var10 = tv.field_b[2];
          var11 = var10;
          var2 = nh.a((ot) (Object) c.field_e);
          var3 = nh.a((ot) (Object) st.field_q);
          if (rm.field_C != 0) {
            if ((rm.field_C ^ -1) == -2) {
              oi.field_e = new oh[34];
              var4 = 0;
              int incrementValue$93 = var4;
              var4++;
              oi.field_e[incrementValue$93] = new oh(el.field_D, 0, 1375);
              var5 = 0;
              L2: while (true) {
                if (12 <= var5) {
                  int incrementValue$94 = var4;
                  var4++;
                  oi.field_e[incrementValue$94] = new oh(var3, -203, 169);
                  int incrementValue$95 = var4;
                  var4++;
                  oi.field_e[incrementValue$95] = new oh(je.field_h, -219, 292);
                  int incrementValue$96 = var4;
                  var4++;
                  oi.field_e[incrementValue$96] = new oh(ns.field_c, 824, -60);
                  int incrementValue$97 = var4;
                  var4++;
                  oi.field_e[incrementValue$97] = new oh(je.field_h, 753, -69);
                  int incrementValue$98 = var4;
                  var4++;
                  oi.field_e[incrementValue$98] = new oh(el.field_D, 1030, 568);
                  var5 = 0;
                  L3: while (true) {
                    if ((var5 ^ -1) <= -9) {
                      break L1;
                    } else {
                      L4: {
                        var6 = el.a(29430, 20, -170);
                        var7 = -50 - -(var5 / 2 * 400);
                        if ((1 & var5) != 0) {
                          var7 = var7 + el.a(29430, 20, 60);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      int incrementValue$99 = var4;
                      var4++;
                      oi.field_e[incrementValue$99] = new oh(wn.field_a[p.a((byte) -24, wn.field_a.length)], var6, var7);
                      int incrementValue$100 = var4;
                      var4++;
                      oi.field_e[incrementValue$100] = new oh(wn.field_a[p.a((byte) -24, wn.field_a.length)], -var6 + 876, var7);
                      var5++;
                      continue L3;
                    }
                  }
                } else {
                  L5: {
                    var6 = el.a(29430, 30, -300 - -(100 * var5));
                    var7 = el.a(29430, 60, -290);
                    if (p.a((byte) -24, 2) != 0) {
                      break L5;
                    } else {
                      var6 = -var6 + 896;
                      var7 += 1724;
                      break L5;
                    }
                  }
                  int incrementValue$101 = var4;
                  var4++;
                  oi.field_e[incrementValue$101] = new oh(c.field_e, var6, var7);
                  var5++;
                  continue L2;
                }
              }
            } else {
              if ((rm.field_C ^ -1) == -3) {
                oi.field_e = new oh[9];
                oi.field_e[0] = new oh(var3, -142, 231);
                oi.field_e[1] = new oh(c.field_e, -140, 549);
                oi.field_e[2] = new oh(var3, -154, 1331);
                oi.field_e[3] = new oh(c.field_e, -245, 1384);
                oi.field_e[4] = new oh(c.field_e, 901, -252);
                oi.field_e[5] = new oh(var3, 1095, 963);
                oi.field_e[6] = new oh(c.field_e, 925, 1294);
                oi.field_e[7] = new oh(el.field_D, -131, 957);
                oi.field_e[8] = new oh(el.field_D, 924, 240);
                break L1;
              } else {
                if (-4 == (rm.field_C ^ -1)) {
                  oi.field_e = new oh[]{};
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            oi.field_e = new oh[30];
            var4 = 0;
            var5 = 0;
            L6: while (true) {
              if (4 <= var5) {
                int incrementValue$102 = var4;
                var4++;
                oi.field_e[incrementValue$102] = new oh(ns.field_c, 50, -100);
                int incrementValue$103 = var4;
                var4++;
                oi.field_e[incrementValue$103] = new oh(je.field_h, 80, -150);
                int incrementValue$104 = var4;
                var4++;
                oi.field_e[incrementValue$104] = new oh(je.field_h, 120, -105);
                int incrementValue$105 = var4;
                var4++;
                oi.field_e[incrementValue$105] = new oh(var3, -100, -170);
                int incrementValue$106 = var4;
                var4++;
                oi.field_e[incrementValue$106] = new oh(var2, 530, -240);
                int incrementValue$107 = var4;
                var4++;
                oi.field_e[incrementValue$107] = new oh(var3, 670, -170);
                int incrementValue$108 = var4;
                var4++;
                oi.field_e[incrementValue$108] = new oh(var2, 790, -195);
                int incrementValue$109 = var4;
                var4++;
                oi.field_e[incrementValue$109] = new oh(ns.field_c, 700, 1354);
                int incrementValue$110 = var4;
                var4++;
                oi.field_e[incrementValue$110] = new oh(je.field_h, 720, 1394);
                int incrementValue$111 = var4;
                var4++;
                oi.field_e[incrementValue$111] = new oh(je.field_h, 780, 1374);
                int incrementValue$112 = var4;
                var4++;
                oi.field_e[incrementValue$112] = new oh(var3, -171, 1037);
                int incrementValue$113 = var4;
                var4++;
                oi.field_e[incrementValue$113] = new oh(vq.field_a, -51, 1082);
                int incrementValue$114 = var4;
                var4++;
                oi.field_e[incrementValue$114] = new oh(vq.field_a, -30, 1105);
                int incrementValue$115 = var4;
                var4++;
                oi.field_e[incrementValue$115] = new oh(vq.field_a, -20, 1055);
                int incrementValue$116 = var4;
                var4++;
                oi.field_e[incrementValue$116] = new oh(ns.field_c, -68, 1143);
                var5 = 0;
                L7: while (true) {
                  if (7 <= var5) {
                    int incrementValue$117 = var4;
                    var4++;
                    oi.field_e[incrementValue$117] = new oh(var2, -111, 138);
                    int incrementValue$118 = var4;
                    var4++;
                    oi.field_e[incrementValue$118] = new oh(var2, -191, 290);
                    int incrementValue$119 = var4;
                    var4++;
                    oi.field_e[incrementValue$119] = new oh(var2, 30, 1324);
                    int incrementValue$120 = var4;
                    var4++;
                    oi.field_e[incrementValue$120] = new oh(var2, 170, 1364);
                    break L1;
                  } else {
                    var6 = el.a(29430, 40, 956);
                    var7 = el.a(29430, 70, var5 * 150 + 200);
                    int incrementValue$121 = var4;
                    var4++;
                    oi.field_e[incrementValue$121] = new oh(c.field_e, var6, var7);
                    var5++;
                    continue L7;
                  }
                }
              } else {
                var6 = p.a((byte) -24, 896 + -var11.field_o);
                var7 = p.a((byte) -24, 1344 - var11.field_v);
                int incrementValue$122 = var4;
                var4++;
                oi.field_e[incrementValue$122] = new oh(var10, var6, var7);
                var5++;
                continue L6;
              }
            }
          }
        }
    }

    public static void d(int param0) {
        field_f = null;
        field_b = null;
        if (param0 != 1) {
            Object var2 = null;
            eh.a(58, 40, (StringBuilder) null);
        }
    }

    public final void b(int param0) {
        int var2 = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        nm.a(0, -76, false, dq.a((byte) 79, 3, new Random()));
        ml.k(param0 ^ 12774, 7);
        t.a(0.6000000238418579f);
        g.b(false);
        fn.i(18);
        ii.b(65280);
        ml.k(61, 8);
        td.b(param0 + -12854);
        sk.a(118, 2, 1);
        ml.k(61, 9);
        sk.a(84, 6, 1);
        eo.a();
        sk.a(-46, 6, 2);
        iv.a(un.field_d, (byte) 113);
        sk.a(-89, 6, 3);
        uf.a((byte) -32);
        cm.l(96);
        sk.a(-49, 6, 5);
        tu.n((byte) -10);
        ml.k(61, 10);
        wb.b((byte) -47);
        rf.a((byte) -124);
        sk.a(127, 4, 1);
        op.a(param0 ^ -363033958);
        sk.a(-69, 4, 2);
        os.a(param0 + -12857);
        sk.a(-124, 4, 3);
        b.field_U = (ut[]) (Object) new ot[kb.field_E.length];
        var2 = 0;
        L0: while (true) {
          if (var2 >= kb.field_E.length) {
            ml.k(61, 11);
            if (param0 == 12763) {
              ew.field_a = dq.a((byte) -65, nv.field_E.length, new Random());
              mj.a(256.0, 60, (double)nv.field_E[ew.field_a], (double)qt.field_r[ew.field_a]);
              gg.h((byte) 51);
              jm.a(-5, false, -2);
              ml.k(61, 12);
              sk.a(-71, 4, 1);
              nr.a(6, 10, (byte) 54, 20, 320, 320, 6, 18, 240, 13, (hu) (Object) pb.field_C, (hu) (Object) un.field_d, (dg) (Object) new nk(), 20, 16777215, 30, (dg) (Object) new pa(true), 16777215, 9, (dg) (Object) new pa(false), 16777215);
              sk.a(-57, 4, 2);
              nb.a((byte) -94);
              sk.a(75, 4, 3);
              cm.a(param0 ^ 922092267, 50);
              Kickabout.t(param0 + -826888154);
              ml.k(61, 13);
              oa.a(false, (hc) (Object) new md());
              oa.a(false, (hc) (Object) new tr());
              oa.a(false, (hc) (Object) new w());
              oa.a(false, (hc) (Object) new vp());
              oa.a(false, (hc) (Object) new ac());
              oa.a(false, (hc) (Object) new fv());
              return;
            } else {
              return;
            }
          } else {
            var3 = new ot(40, 40);
            iw.a(-100, (ut) (Object) var3);
            kb.field_E[var2].c(0, 0);
            ta.e(param0 + -12637);
            var4 = 0;
            L1: while (true) {
              if (var3.field_y.length <= var4) {
                var3.a(-16777216);
                var3.a(2130706432);
                b.field_U[var2] = (ut) (Object) nh.b(var3);
                var2++;
                continue L0;
              } else {
                if (var3.field_y[var4] != 0) {
                  var3.field_y[var4] = hf.a(var3.field_y[var4], -16777216);
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final boolean e(int param0) {
        int var3_int = 0;
        Exception var3 = null;
        ti var4 = null;
        int var7 = 0;
        iw var8 = null;
        ue var9 = null;
        ue var10 = null;
        byte[] var14 = null;
        Throwable decompiledCaughtException = null;
        var7 = Kickabout.field_G;
        if (wc.field_k == null) {
          return true;
        } else {
          if (!wc.field_k.a((byte) -109)) {
            return false;
          } else {
            var8 = wc.field_k.a(false);
            wc.field_k = null;
            if (var8 != null) {
              try {
                L0: {
                  L1: {
                    var3_int = var8.field_n;
                    var8.field_n = param0;
                    var4 = new ti(var8, var3_int);
                    var9 = var4.a(-116, "motd_message");
                    if (var9 == null) {
                      lf.field_b = null;
                      break L1;
                    } else {
                      var8.field_n = var9.field_i;
                      lf.field_b = var8.a(param0 ^ -114);
                      break L1;
                    }
                  }
                  L2: {
                    var10 = var4.a(-116, "motd_image");
                    if (var10 == null) {
                      jm.field_g = null;
                      break L2;
                    } else {
                      var8.field_n = var10.field_i;
                      var14 = new byte[var10.field_h];
                      var8.a(var14, 0, (byte) -6, var10.field_h);
                      jm.field_g = new ot(var14, (java.awt.Component) (Object) nm.field_g);
                      if (-1 != jm.field_g.field_q) {
                        break L2;
                      } else {
                        if (0 != (jm.field_g.field_w ^ -1)) {
                          break L2;
                        } else {
                          jm.field_g = null;
                          return true;
                        }
                      }
                    }
                  }
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                lf.field_b = null;
                jm.field_g = null;
                bd.a("Error when unpacking the MOTD data in KickaboutLoader.service_motd()", (Throwable) (Object) var3, 1);
                return true;
              }
              return true;
            } else {
              lf.field_b = null;
              jm.field_g = null;
              return true;
            }
          }
        }
    }

    public final void a(int param0) {
        sj var3 = null;
        sj var4 = null;
        L0: {
          ((eh) this).b((byte) 115);
          if (fn.field_b == null) {
            break L0;
          } else {
            ad.a(fn.field_b, 1);
            fn.field_b = null;
            dd.a((byte) 85);
            break L0;
          }
        }
        L1: {
          b.field_H = dh.a((byte) -126, 3);
          id.field_y = dh.a((byte) -128, 11);
          bo.field_Cb = dh.a((byte) -128, 5);
          v.field_b = dh.a((byte) -125, 6);
          ht.field_c = dh.a((byte) -127, 7);
          d.field_b = dh.a((byte) -128, 8);
          vp.field_j = dh.a((byte) -127, 9);
          ni.field_i = dh.a((byte) -127, 10);
          if (param0 == 7312) {
            break L1;
          } else {
            ((eh) this).field_d = false;
            break L1;
          }
        }
        L2: {
          Kickabout.field_J = dh.a((byte) -126, 12);
          nt.field_Bb = dh.a((byte) -128, 14);
          vu.field_Eb = dh.a((byte) -126, 15);
          gd.field_h = dh.a((byte) -126, 16);
          sj.field_f = dh.a((byte) -126, 17);
          var4 = kh.field_g;
          var3 = ht.field_b;
          mp.field_h = new qe(55);
          mp.field_h.a(var4, bh.field_q, -6869, "basic", nu.field_M);
          mp.field_h.a(sj.field_f, bh.field_q, -6869, "", nu.field_M);
          mp.field_h.a(var4, bh.field_q, -6869, "arialish12", nu.field_M);
          mp.field_h.a(bo.field_Cb, lj.field_l, -6869, "fonts", nu.field_M);
          mp.field_h.a(v.field_b, lj.field_l, -6869, "fonts", te.field_b);
          mp.field_h.a(var3, lj.field_l, -6869, "arialish12", te.field_b);
          mp.field_h.a(var3, lj.field_l, -6869, "lobby", te.field_b);
          mp.field_h.a(bo.field_Cb, p.field_a, -6869, "menu", nu.field_M);
          mp.field_h.a(bo.field_Cb, sm.field_j, param0 + -14181, "hud", nu.field_M);
          mp.field_h.a(bo.field_Cb, pn.field_B, -6869, "lobby", nu.field_M);
          mp.field_h.a(var4, pn.field_B, -6869, "lobby", nu.field_M);
          if (ih.field_c != 0) {
            break L2;
          } else {
            mp.field_h.a(bo.field_Cb, pi.field_c, param0 + -14181, "park", nu.field_M);
            mp.field_h.a(bo.field_Cb, pi.field_c, param0 + -14181, "park_surface0", nu.field_M);
            break L2;
          }
        }
        L3: {
          if (ih.field_c == 1) {
            mp.field_h.a(bo.field_Cb, th.field_b, -6869, "beach", nu.field_M);
            mp.field_h.a(bo.field_Cb, th.field_b, -6869, "beach_surface0", nu.field_M);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (-3 == (ih.field_c ^ -1)) {
            mp.field_h.a(bo.field_Cb, h.field_d, param0 + -14181, "street", nu.field_M);
            mp.field_h.a(bo.field_Cb, h.field_d, -6869, "beach_surface0", nu.field_M);
            break L4;
          } else {
            break L4;
          }
        }
        mp.field_h.a(ht.field_c, (byte) -115, us.field_f, qj.field_c);
        mp.field_h.a(qj.field_c, d.field_b, -100);
        mp.field_h.a(vp.field_j, (byte) -109, fw.field_H, ej.field_yb);
        mp.field_h.a(ni.field_i, (byte) -123, fw.field_H, ej.field_yb);
        mp.field_h.a(Kickabout.field_J, (byte) -124, st.field_d, bl.field_n);
        mp.field_h.a(nt.field_Bb, (byte) -122, vp.field_l, cu.field_b);
        mp.field_h.a(vu.field_Eb, (byte) -126, vp.field_l, cu.field_b);
        mp.field_h.a(gd.field_h, (byte) -106, vp.field_l, cu.field_b);
        mp.field_h.a(b.field_H, (byte) -128, kw.field_g, os.field_d);
        mp.field_h.a(id.field_y, (byte) -116, bb.field_Ib, ac.field_e);
    }

    private final void a(int param0, ot param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Kickabout.field_G;
        int var3 = param1.field_q / 8;
        int var4 = param1.field_w / 10;
        ot[] var5 = new ot[80];
        if (param0 != 11264) {
            field_f = null;
        }
        for (var6 = 0; qe.field_i.length > var6; var6++) {
            var5[var6] = new ot(var3, var4);
            var7 = param1.field_q * var4 * (var6 / 8) + var3 * (var6 % 8);
            for (var8 = 0; var8 < var5[var6].field_y.length; var8++) {
                var9 = var8 % var3 + param1.field_q * (var8 / var3);
                var5[var6].field_y[var8] = param1.field_y[var7 + var9];
            }
            qe.field_i[var6] = var5[var6];
        }
    }

    private final ut[] a(String param0, sj param1, byte param2, String param3) {
        if (param2 < 16) {
            eh.a((byte) 120);
        }
        ut[] var6 = se.a(param1, -42, param0, param3);
        ut[] var5 = var6;
        var6[3].field_v = var6[3].field_w;
        var6[1].field_o = var6[1].field_q;
        var6[5].field_v = var6[5].field_w;
        var6[7].field_o = var6[7].field_q;
        return var5;
    }

    final static void a(int param0, int param1, StringBuilder param2) {
        int var3 = param0 >> 758424112;
        StringBuilder discarded$0 = param2.append(var3);
        int var4 = (int)(1000.0f * ((float)(65535 & param0) / 65536.0f));
        StringBuilder discarded$6 = param2.append(46);
        if (param1 != 100) {
            return;
        }
        StringBuilder discarded$7 = param2.append(var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_f = new int[7][3];
        field_f[0][0] = 60;
        field_f[0][2] = 20;
        field_f[0][1] = 40;
        field_f[1][1] = 140;
        field_f[1][0] = 210;
        field_f[1][2] = 70;
        field_f[2][2] = 160;
        field_f[2][0] = 480;
        field_f[2][1] = 320;
        field_f[3][1] = 500;
        field_f[3][2] = 250;
        field_f[3][0] = 750;
        field_f[4][0] = 1140;
        field_f[4][2] = 380;
        field_f[4][1] = 760;
        field_f[5][1] = 1040;
        field_f[5][0] = 1610;
        field_f[5][2] = 520;
        field_f[6][1] = 1800;
        field_f[6][0] = 2700;
        field_f[6][2] = 900;
    }
}
