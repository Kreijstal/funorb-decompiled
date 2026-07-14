/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl {
    static int field_b;
    static lj field_a;
    static int field_f;
    static String[] field_d;
    da field_e;
    private da field_c;

    final da a(byte param0) {
        int var2 = 46 / ((param0 - -1) / 60);
        da var3 = ((sl) this).field_e.field_f;
        if (var3 == ((sl) this).field_e) {
            return null;
        }
        var3.a(true);
        return var3;
    }

    final da c(int param0) {
        da var2 = ((sl) this).field_c;
        if (var2 == ((sl) this).field_e) {
            ((sl) this).field_c = null;
            return null;
        }
        if (param0 != -270) {
            field_b = 98;
        }
        ((sl) this).field_c = var2.field_f;
        return var2;
    }

    final void a(da param0, int param1) {
        if (!(param0.field_h == null)) {
            param0.a(true);
        }
        param0.field_h = ((sl) this).field_e.field_h;
        param0.field_f = ((sl) this).field_e;
        if (param1 > -34) {
            field_f = 42;
        }
        param0.field_h.field_f = param0;
        param0.field_f.field_h = param0;
    }

    public static void e(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 25840) {
            field_b = 58;
        }
    }

    final da c(byte param0) {
        int var3 = 29 / ((52 - param0) / 51);
        da var2 = ((sl) this).field_e.field_f;
        if (var2 == ((sl) this).field_e) {
            ((sl) this).field_c = null;
            return null;
        }
        ((sl) this).field_c = var2.field_f;
        return var2;
    }

    final static void a(boolean param0) {
        int[] var28 = null;
        int var2 = 0;
        int var3 = 0;
        ka var11 = null;
        ka var12 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var29 = null;
        String var14 = null;
        int var5 = 0;
        int var8 = 0;
        int var9_int = 0;
        ka var9 = null;
        int[] var30 = null;
        ka var16 = null;
        String var17 = null;
        int[] var31 = null;
        int var4 = 0;
        ka var1_ref = null;
        int var1 = 0;
        int var10 = TorChallenge.field_F ? 1 : 0;
        if (param0) {
            sl.a(92, 123, -107);
        }
        if (fd.field_c != null) {
            if (fd.field_c.b(-7957)) {
                if (fd.field_c.b(5, "benefits")) {
                    if (null != sf.field_a) {
                        if (sf.field_a.b(-7957)) {
                            if (!(!sf.field_a.b(5, "benefits"))) {
                                da.field_b = qk.a("benefits", "headline", fd.field_c, 0);
                                me.field_e = qk.a("benefits", "blurbpane", fd.field_c, 0);
                                md.field_b = qk.a("benefits", "button", fd.field_c, 0);
                                hd.field_b = qk.a("benefits", "signup_text", fd.field_c, 0);
                                gl.field_h = qk.a("benefits", "menu_text", fd.field_c, 0);
                                ub.field_e = qk.a("benefits", "button_frame", fd.field_c, 0);
                                le.field_e = qk.a("benefits", "arrow", fd.field_c, 0);
                                tk.field_R = (eg) (Object) ad.a(fd.field_c, sf.field_a, "benefits", "large_font", false);
                                ek.field_G = (eg) (Object) ad.a(fd.field_c, sf.field_a, "benefits", "small_font", false);
                                var28 = qg.field_i;
                                var2 = qg.field_g;
                                var3 = qg.field_f;
                                qg.a(ck.field_c);
                                var11 = new ka(4 + le.field_e.field_u, le.field_e.field_x + 4);
                                var11.d();
                                le.field_e.f(2, 2, vh.field_h);
                                ih.a(var11.field_u, 0, 4, var11.field_x, 2, var11, 0, 1);
                                le.field_e = var11;
                                dh.field_ab = le.field_e.i();
                                var12 = new ka(195, 221);
                                var6 = var12.field_u / 2;
                                var12.d();
                                tk.field_R.a(ni.a(new String[1], 0, gh.field_v), var6, 40, 16777215, -1);
                                ek.field_G.a(ni.a(new String[1], 0, jl.field_d), var6, 60, 16777215, -1);
                                tk.field_R.a(ni.a(new String[1], 0, kc.field_t), var6, 110, 16777215, -1);
                                ek.field_G.a(ni.a(new String[1], 0, di.field_n), var6, 130, 16777215, -1);
                                tk.field_R.a(ub.field_m, var6, 180, 16777215, -1);
                                ek.field_G.a(wi.field_b, var6, 200, 16777215, -1);
                                ih.a(var12.field_u, 0, 4, var12.field_x, 3, var12, 0, 1);
                                me.field_e.d();
                                var12.g(-me.field_e.field_s + 18, -me.field_e.field_p + 241);
                                for (var7 = 0; hb.field_g.length > var7; var7++) {
                                    ak.field_i[var7].d();
                                    int discarded$0 = ek.field_G.a(hb.field_g[var7], 3, 3, ak.field_i[var7].field_u - 6, ak.field_i[var7].field_x - 6, vh.field_h, -1, 1, 1, ek.field_G.field_x + ek.field_G.field_K);
                                    ih.a(ak.field_i[var7].field_u, 0, 4, ak.field_i[var7].field_x, 3, ak.field_i[var7], 0, 1);
                                }
                                hb.field_g = null;
                                dg.field_R = hd.field_b.c();
                                dg.field_R.d();
                                ii.a(qg.field_g, 2 * qg.field_f / 3, 64, 4, 0, 0);
                                qg.a(var28, var2, var3);
                                qg.b(ck.field_c);
                                ii.field_a = 390 + (-ub.field_e.field_x + md.field_b.field_x) / 2;
                                wc.field_b = (md.field_b.field_u + -ub.field_e.field_u) / 2 + 231;
                                fd.field_c = null;
                                pf.field_e = (-ub.field_e.field_u + md.field_b.field_u) / 2 + 434;
                                bi.field_i = 390 - -((md.field_b.field_x - ub.field_e.field_x) / 2);
                            }
                        }
                    }
                }
            }
        }
        if (lj.field_f == null) {
            return;
        }
        if (vk.field_d != null) {
            if (!(tk.field_R == null)) {
                var29 = qg.field_i;
                var2 = qg.field_g;
                var3 = qg.field_f;
                qg.a(ck.field_c);
                var14 = ni.a(new String[1], 0, jd.field_f);
                var5 = tk.field_R.b(var14, fd.field_f);
                var6 = tk.field_R.b(var14, fd.field_f, tk.field_R.field_K + tk.field_R.field_x);
                var7 = (fd.field_f + -var5) / 2 + si.field_J;
                var5 += 6;
                var7 -= 3;
                var8 = vk.field_k - -((pi.field_b + -var6) / 2);
                if (-1 < (var7 ^ -1)) {
                    var9_int = -var7;
                    vk.field_d.field_q = vk.field_d.field_q + var9_int * 2;
                    vk.field_d.field_s = vk.field_d.field_s + var9_int;
                    var7 = var7 + var9_int;
                    var5 = var5 + var9_int * 2;
                    si.field_J = si.field_J + var9_int;
                    rl.field_f = rl.field_f - var9_int;
                }
                var8 -= 3;
                var6 += 6;
                if (vk.field_d.field_q < var5 + var7) {
                    var9_int = -vk.field_d.field_q + (var5 + var7);
                    rl.field_f = rl.field_f - var9_int;
                    vk.field_d.field_q = vk.field_d.field_q + 2 * var9_int;
                    var7 = var7 + var9_int;
                    si.field_J = si.field_J + var9_int;
                    vk.field_d.field_s = vk.field_d.field_s + var9_int;
                    var5 = var5 + var9_int * 2;
                }
                if (!((var8 ^ -1) <= -1)) {
                    var9_int = -var8;
                    var6 = var6 + 2 * var9_int;
                    vk.field_d.field_p = vk.field_d.field_p + var9_int;
                    vk.field_d.field_v = vk.field_d.field_v + var9_int * 2;
                    vk.field_k = vk.field_k + var9_int;
                    var8 = var8 + var9_int;
                    bh.field_t = bh.field_t - var9_int;
                }
                if (!((vk.field_d.field_v ^ -1) <= (var6 + var8 ^ -1))) {
                    var9_int = var8 + (var6 - vk.field_d.field_v);
                    vk.field_d.field_p = vk.field_d.field_p + var9_int;
                    vk.field_d.field_v = vk.field_d.field_v + 2 * var9_int;
                    var8 = var8 + var9_int;
                    bh.field_t = bh.field_t - var9_int;
                    var6 = var6 + 2 * var9_int;
                    vk.field_k = vk.field_k + var9_int;
                }
                vk.field_d.g();
                var9 = new ka(vk.field_d.field_q, vk.field_d.field_v);
                var9.d();
                int discarded$1 = tk.field_R.a(var14, si.field_J, vk.field_k, fd.field_f, pi.field_b, 16777215, -1, 1, 1, tk.field_R.field_x + tk.field_R.field_K);
                ih.a(var9.field_q, 0, 4, var9.field_v, 3, var9, 0, 1);
                vk.field_d.d();
                var9.g(0, 0);
                cf.field_c = new ka(640, 480);
                cf.field_c.d();
                vk.field_d.b(rl.field_f + (vk.field_d.field_q >> 569257313), (vk.field_d.field_v >> 473795169) + bh.field_t, dd.field_u, 4096);
                vk.field_d = null;
                cf.field_c.h();
                qg.a(var29, var2, var3);
                qg.b(ck.field_c);
            }
        }
        if (null != ia.field_l) {
            if (ek.field_G != null) {
                var30 = qg.field_i;
                var2 = qg.field_g;
                var3 = qg.field_f;
                qg.a(ck.field_c);
                var16 = new ka(412, 43);
                var17 = ni.a(new String[1], 0, w.field_n);
                ia.field_l = null;
                var16.d();
                int discarded$2 = ek.field_G.a(var17, 3, 3, var16.field_u + -6, var16.field_x - 6, 16777215, -1, 0, 1, ek.field_G.field_K + ek.field_G.field_x);
                ih.a(var16.field_u, 0, 4, var16.field_x, 3, var16, 0, 1);
                lj.field_f.d();
                var16.g(199 - lj.field_f.field_s, 83 - lj.field_f.field_p);
                qg.a(var30, var2, var3);
                qg.b(ck.field_c);
            }
        }
        if (fc.field_m != null) {
            if (!(null == ek.field_G)) {
                var31 = qg.field_i;
                var2 = qg.field_g;
                var3 = qg.field_f;
                qg.a(ck.field_c);
                var4 = ek.field_G.b(dd.field_r, 640) - -6;
                var5 = var4 + (fc.field_m.field_q - -20);
                var6 = -(var5 / 2) + 427;
                var7 = 20 + (var6 - -fc.field_m.field_q);
                lj.field_f.d();
                ek.field_G.c(dd.field_r, -lj.field_f.field_s + var7, ek.field_G.field_x + (155 - lj.field_f.field_p + ek.field_G.field_K), 16777215, -1);
                ih.a(var4, -lj.field_f.field_s + (var7 + -4), 4, 50, 3, lj.field_f, -lj.field_f.field_p + 155, 1);
                var8 = -((fc.field_m.field_v - (3 + ek.field_G.field_x - -ek.field_G.field_K)) / 2) + (-lj.field_f.field_p + 155);
                fc.field_m.g(var6 - lj.field_f.field_s, var8);
                qg.a(var31, var2, var3);
                qg.b(ck.field_c);
                fc.field_m = null;
            }
        }
        qg.a(ck.field_c);
        qg.a(16, 16, 608, 112, 15, gf.field_u, ea.field_c);
        qg.a(231, 144, 393, 232, 15, gf.field_u, ea.field_c);
        if (!(da.field_b == null)) {
            da.field_b.g(0, 0);
        }
        if (null != me.field_e) {
            me.field_e.g(0, 0);
        }
        lj.field_f.g(0, 0);
        if (cf.field_c != null) {
            cf.field_c.g(0, 0);
        }
        if (null != md.field_b) {
            if (!(null == ub.field_e)) {
                md.field_b.g(231, 390);
                var1_ref = hd.field_b;
                if (!(0 != of.field_c.field_j)) {
                    var1_ref = dg.field_R;
                }
                var1_ref.g(0, 0);
                var2 = (40 * ga.a((byte) 124, ub.field_h << (of.field_c.field_j == 0 ? 4 : 3)) >> -1398383824) + 40;
                if (!(-1 <= (var2 ^ -1))) {
                    md.field_b.b(230, 389, var2);
                    md.field_b.b(232, 389, var2);
                    md.field_b.b(232, 391, var2);
                    md.field_b.b(230, 391, var2);
                    var1_ref.b(1, 1, var2);
                    var1_ref.b(-1, 1, var2);
                    var1_ref.b(1, -1, var2);
                    var1_ref.b(-1, -1, var2);
                }
                tj.a(-1 == (of.field_c.field_j ^ -1) ? true : false, 5106, bi.field_i, wc.field_b);
            }
        }
        if (null != md.field_b) {
            if (!(ub.field_e == null)) {
                md.field_b.g(434, 390);
                gl.field_h.g(0, 0);
                if (-2 == (of.field_c.field_j ^ -1)) {
                    ii.a(md.field_b.field_u + -4, 7 * md.field_b.field_x / 12, 64, 4, 436, 392);
                }
                tj.a(1 == of.field_c.field_j ? true : false, 5106, ii.field_a, pf.field_e);
            }
        }
        if (le.field_e == null) {
            w.c(-128);
            ak.field_i[oi.field_j].g(269, 340);
        } else {
            var1 = 357 - le.field_e.field_v / 2;
            le.field_e.g(-le.field_e.field_q + 269, var1);
            dh.field_ab.g(586, var1);
            if (var1 < ph.field_d) {
                if ((ph.field_d ^ -1) > (le.field_e.field_x + var1 ^ -1)) {
                    var2 = (ga.a((byte) 5, ub.field_h << -1601320188) * 40 >> 101992944) + 40;
                    if (var2 > 0) {
                        if ((-le.field_e.field_u + 269 ^ -1) > (kc.field_u ^ -1)) {
                            // if_icmpge L2635
                            le.field_e.b(269 + (-le.field_e.field_q - 1), -1 + var1, var2);
                            le.field_e.b(1 + -le.field_e.field_q + 269, -1 + var1, var2);
                            le.field_e.b(268 - le.field_e.field_q, 1 + var1, var2);
                            le.field_e.b(1 + (-le.field_e.field_q + 269), var1 + 1, var2);
                        } else {
                            if (586 < kc.field_u) {
                                if (!(kc.field_u >= le.field_e.field_u + 586)) {
                                    dh.field_ab.b(585, var1 - 1, var2);
                                    dh.field_ab.b(587, var1 + -1, var2);
                                    dh.field_ab.b(585, 1 + var1, var2);
                                    dh.field_ab.b(587, 1 + var1, var2);
                                }
                            }
                        }
                    }
                }
            }
            w.c(-128);
            ak.field_i[oi.field_j].g(269, 340);
        }
    }

    final static jk b(int param0) {
        if (param0 != -944) {
            return null;
        }
        return mj.field_a;
    }

    final da b(byte param0) {
        if (param0 != 65) {
            da discarded$0 = ((sl) this).d((byte) 1);
        }
        da var2 = ((sl) this).field_e.field_h;
        if (((sl) this).field_e == var2) {
            ((sl) this).field_c = null;
            return null;
        }
        ((sl) this).field_c = var2.field_h;
        return var2;
    }

    final void a(int param0) {
        da var2 = null;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        L0: while (true) {
          var2 = ((sl) this).field_e.field_f;
          if (var2 != ((sl) this).field_e) {
            var2.a(true);
            continue L0;
          } else {
            L1: {
              ((sl) this).field_c = null;
              if (param0 == -14341) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            return;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 > -113) {
            return false;
        }
        return ((sl) this).field_e == ((sl) this).field_e.field_f ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        if (0 == (param2 ^ -1)) {
          return false;
        } else {
          L0: {
            L1: {
              var4 = -1 & param2 >> 1786472368;
              param2 = param2 & 65535;
              if (-1 < (var4 ^ -1)) {
                break L1;
              } else {
                if ((var4 ^ -1) < -2) {
                  break L1;
                } else {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (param2 >= 3) {
                      break L1;
                    } else {
                      stackOut_7_0 = 1;
                      stackIn_9_0 = stackOut_7_0;
                      break L0;
                    }
                  }
                }
              }
            }
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
          L2: {
            var5 = stackIn_9_0;
            if (param3 == -22981) {
              break L2;
            } else {
              sl.a(false);
              break L2;
            }
          }
          if (var5 != 0) {
            L3: {
              L4: {
                if ((param1 ^ -1) != (var4 ^ -1)) {
                  break L4;
                } else {
                  if (param2 <= param0) {
                    break L4;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L3;
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L3;
            }
            var6 = stackIn_17_0;
            return var6 != 0;
          } else {
            return false;
          }
        }
    }

    final da d(byte param0) {
        da var2 = ((sl) this).field_e.field_h;
        if (var2 == ((sl) this).field_e) {
            return null;
        }
        if (param0 >= -103) {
            sl.a(false);
        }
        var2.a(true);
        return var2;
    }

    final static void a(int param0, int param1, int param2) {
        sd.field_b = param1;
        if (param2 != -6665) {
            field_d = null;
        }
        kj.field_G = param0;
    }

    final void a(byte param0, da param1) {
        if (param0 < 76) {
            da discarded$0 = ((sl) this).b((byte) 15);
        }
        if (param1.field_h != null) {
            param1.a(true);
        }
        param1.field_h = ((sl) this).field_e;
        param1.field_f = ((sl) this).field_e.field_f;
        param1.field_h.field_f = param1;
        param1.field_f.field_h = param1;
    }

    final da e(byte param0) {
        da var2 = ((sl) this).field_c;
        if (!(var2 != ((sl) this).field_e)) {
            ((sl) this).field_c = null;
            return null;
        }
        int var3 = 91 % ((param0 - -42) / 61);
        ((sl) this).field_c = var2.field_h;
        return var2;
    }

    public sl() {
        ((sl) this).field_e = new da();
        ((sl) this).field_e.field_f = ((sl) this).field_e;
        ((sl) this).field_e.field_h = ((sl) this).field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new String[]{"Score and multiplier.", "Collected seals. Ordered from left to right by location on tower from bottom to top.", "Life force. The small growing hit point turns into a new hit point for every 5 seals that you collect.", "Lives remaining."};
        field_b = 0;
    }
}
