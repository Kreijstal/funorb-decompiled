/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends am {
    private int field_s;
    static vc field_u;
    static String field_t;

    final static void a(int param0, String[] param1, byte param2, String param3) {
        String[] var4_ref_String__ = null;
        int var5 = Torquing.field_u;
        kh.field_o = ag.field_c;
        if ((param0 ^ -1) == -256) {
            qi.field_d = pa.b(74, oh.field_d < 13 ? true : false);
            Object var6 = null;
            ci.a(102, (String[]) null);
        } else {
            if (param0 >= 100) {
                // if_icmpgt L89
                var4_ref_String__ = param1;
                ci.a(123, var4_ref_String__);
                qi.field_d = di.a(0, param1);
            } else {
                qi.field_d = pg.a(param0, param3, -1);
            }
        }
        int var4 = 85 / ((param2 - -8) / 47);
    }

    final void a(fj param0, int param1, int param2) {
        if (param1 != 35) {
            field_u = null;
        }
        if (-1 == (param2 ^ -1)) {
            ((wb) this).field_s = param0.i(7088);
        }
    }

    public static void g(byte param0) {
        field_t = null;
        if (param0 != 109) {
            wb.b(21);
        }
        field_u = null;
    }

    final static void b(int param0) {
        int[] var27 = null;
        int var2 = 0;
        int var3 = 0;
        t var11 = null;
        t var12 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var28 = null;
        String var14 = null;
        int var5 = 0;
        int var8 = 0;
        int var9_int = 0;
        t var9 = null;
        int[] var29 = null;
        t var16 = null;
        String var5_ref = null;
        int[] var30 = null;
        int var4 = 0;
        t var1_ref = null;
        int var1 = 0;
        int var10 = Torquing.field_u;
        if (qm.field_a != null) {
            if (qm.field_a.a(-12749)) {
                if (qm.field_a.a(true, "benefits")) {
                    if (ae.field_mb != null) {
                        if (ae.field_mb.a(-12749)) {
                            if (!(!ae.field_mb.a(true, "benefits"))) {
                                kn.field_f = mn.a(qm.field_a, "benefits", "headline", 86);
                                mk.field_a = mn.a(qm.field_a, "benefits", "blurbpane", param0 ^ -88);
                                vk.field_s = mn.a(qm.field_a, "benefits", "button", 89);
                                je.field_e = mn.a(qm.field_a, "benefits", "signup_text", 113);
                                ki.field_H = mn.a(qm.field_a, "benefits", "menu_text", 111);
                                jg.field_t = mn.a(qm.field_a, "benefits", "button_frame", 112);
                                qc.field_db = mn.a(qm.field_a, "benefits", "arrow", 110);
                                lh.field_O = (uc) (Object) qg.a(ae.field_mb, qm.field_a, "benefits", "large_font", 255);
                                kl.field_o = (uc) (Object) qg.a(ae.field_mb, qm.field_a, "benefits", "small_font", param0 + 256);
                                var27 = ph.field_e;
                                var2 = ph.field_j;
                                var3 = ph.field_d;
                                ph.b(mo.field_w);
                                var11 = new t(qc.field_db.field_s + 4, 4 + qc.field_db.field_t);
                                var11.e();
                                qc.field_db.d(2, 2, fa.field_c);
                                hb.a(0, false, var11, var11.field_t, var11.field_s, 1, 0, 2);
                                qc.field_db = var11;
                                p.field_w = qc.field_db.b();
                                var12 = new t(195, 221);
                                var6 = var12.field_s / 2;
                                var12.e();
                                lh.field_O.c(ff.a(new String[1], 0, eo.field_c), var6, 40, 16777215, -1);
                                kl.field_o.c(ff.a(new String[1], 0, wd.field_r), var6, 60, 16777215, -1);
                                lh.field_O.c(ff.a(new String[1], 0, di.field_c), var6, 110, 16777215, -1);
                                kl.field_o.c(ff.a(new String[1], 0, lc.field_B), var6, 130, 16777215, -1);
                                lh.field_O.c(rn.field_a, var6, 180, 16777215, -1);
                                kl.field_o.c(ii.field_o, var6, 200, 16777215, -1);
                                hb.a(0, false, var12, var12.field_t, var12.field_s, 1, 0, 3);
                                mk.field_a.e();
                                var12.d(18 - mk.field_a.field_v, -mk.field_a.field_r + 241);
                                for (var7 = 0; ik.field_k.length > var7; var7++) {
                                    ln.field_H[var7].e();
                                    int discarded$0 = kl.field_o.a(ik.field_k[var7], 3, 3, ln.field_H[var7].field_s - 6, ln.field_H[var7].field_t - 6, fa.field_c, -1, 1, 1, kl.field_o.field_t + kl.field_o.field_x);
                                    hb.a(0, false, ln.field_H[var7], ln.field_H[var7].field_t, ln.field_H[var7].field_s, 1, 0, 3);
                                }
                                ik.field_k = null;
                                ue.field_f = je.field_e.c();
                                ue.field_f.e();
                                kp.a(ph.field_j, 2 * ph.field_d / 3, 0, (byte) 16, 64, 0);
                                ph.a(var27, var2, var3);
                                ph.a(mo.field_w);
                                qm.field_a = null;
                                na.field_E = 231 + (vk.field_s.field_s - jg.field_t.field_s) / 2;
                                db.field_j = (-jg.field_t.field_s + vk.field_s.field_s) / 2 + 434;
                                we.field_h = 390 + (-jg.field_t.field_t + vk.field_s.field_t) / 2;
                                nc.field_a = 390 - -((vk.field_s.field_t + -jg.field_t.field_t) / 2);
                            }
                        }
                    }
                }
            }
        }
        if (param0 != -1) {
            field_u = null;
        }
        if (!(null != jd.field_D)) {
            return;
        }
        if (j.field_F != null) {
            if (!(null == lh.field_O)) {
                var28 = ph.field_e;
                var2 = ph.field_j;
                var3 = ph.field_d;
                ph.b(mo.field_w);
                var14 = ff.a(new String[1], 0, wc.field_t);
                var5 = lh.field_O.b(var14, hn.field_x);
                var6 = lh.field_O.a(var14, hn.field_x, lh.field_O.field_x + lh.field_O.field_t);
                var7 = (-var5 + hn.field_x) / 2 + up.field_d;
                var5 += 6;
                var8 = lb.field_y - -((-var6 + wh.field_w) / 2);
                var7 -= 3;
                var6 += 6;
                var8 -= 3;
                if (-1 < (var7 ^ -1)) {
                    var9_int = -var7;
                    var7 = var7 + var9_int;
                    var5 = var5 + var9_int * 2;
                    j.field_F.field_w = j.field_F.field_w + var9_int * 2;
                    up.field_d = up.field_d + var9_int;
                    gi.field_d = gi.field_d - var9_int;
                    j.field_F.field_v = j.field_F.field_v + var9_int;
                }
                if (!(var5 + var7 <= j.field_F.field_w)) {
                    var9_int = var7 - (-var5 - -j.field_F.field_w);
                    j.field_F.field_w = j.field_F.field_w + 2 * var9_int;
                    var5 = var5 + 2 * var9_int;
                    up.field_d = up.field_d + var9_int;
                    var7 = var7 + var9_int;
                    gi.field_d = gi.field_d - var9_int;
                    j.field_F.field_v = j.field_F.field_v + var9_int;
                }
                if (!(var8 >= 0)) {
                    var9_int = -var8;
                    Torquing.field_x = Torquing.field_x - var9_int;
                    var6 = var6 + 2 * var9_int;
                    lb.field_y = lb.field_y + var9_int;
                    j.field_F.field_u = j.field_F.field_u + var9_int * 2;
                    j.field_F.field_r = j.field_F.field_r + var9_int;
                    var8 = var8 + var9_int;
                }
                if (j.field_F.field_u < var8 + var6) {
                    var9_int = -j.field_F.field_u + (var6 + var8);
                    lb.field_y = lb.field_y + var9_int;
                    var6 = var6 + 2 * var9_int;
                    j.field_F.field_r = j.field_F.field_r + var9_int;
                    j.field_F.field_u = j.field_F.field_u + var9_int * 2;
                    var8 = var8 + var9_int;
                    Torquing.field_x = Torquing.field_x - var9_int;
                }
                j.field_F.a();
                var9 = new t(j.field_F.field_w, j.field_F.field_u);
                var9.e();
                int discarded$1 = lh.field_O.a(var14, up.field_d, lb.field_y, hn.field_x, wh.field_w, 16777215, -1, 1, 1, lh.field_O.field_x - -lh.field_O.field_t);
                hb.a(0, false, var9, var9.field_u, var9.field_w, 1, 0, 3);
                j.field_F.e();
                var9.d(0, 0);
                vc.field_b = new t(640, 480);
                vc.field_b.e();
                j.field_F.a((j.field_F.field_w >> 1011955201) + gi.field_d, Torquing.field_x + (j.field_F.field_u >> -828732959), tl.field_n, 4096);
                j.field_F = null;
                vc.field_b.d();
                ph.a(var28, var2, var3);
                ph.a(mo.field_w);
            }
        }
        if (null != hf.field_a) {
            if (kl.field_o != null) {
                var29 = ph.field_e;
                var2 = ph.field_j;
                var3 = ph.field_d;
                ph.b(mo.field_w);
                var16 = new t(412, 43);
                var5_ref = ff.a(new String[1], 0, co.field_d);
                hf.field_a = null;
                var16.e();
                int discarded$2 = kl.field_o.a(var5_ref, 3, 3, var16.field_s - 6, -6 + var16.field_t, 16777215, -1, 0, 1, kl.field_o.field_t + kl.field_o.field_x);
                hb.a(0, false, var16, var16.field_t, var16.field_s, 1, 0, 3);
                jd.field_D.e();
                var16.d(199 + -jd.field_D.field_v, -jd.field_D.field_r + 83);
                ph.a(var29, var2, var3);
                ph.a(mo.field_w);
            }
        }
        if (kj.field_b != null) {
            if (!(kl.field_o == null)) {
                var30 = ph.field_e;
                var2 = ph.field_j;
                var3 = ph.field_d;
                ph.b(mo.field_w);
                var4 = 6 + kl.field_o.b(eh.field_e, 640);
                var5 = var4 - (-kj.field_b.field_w + -20);
                var6 = -(var5 / 2) + 427;
                var7 = 20 + var6 + kj.field_b.field_w;
                jd.field_D.e();
                kl.field_o.b(eh.field_e, -jd.field_D.field_v + var7, kl.field_o.field_x + (155 - (jd.field_D.field_r + -kl.field_o.field_t)), 16777215, -1);
                hb.a(var7 + (-jd.field_D.field_v - 4), false, jd.field_D, 50, var4, 1, 155 + -jd.field_D.field_r, 3);
                var8 = -((-kl.field_o.field_t + (-kl.field_o.field_x + kj.field_b.field_u) - 3) / 2) + (-jd.field_D.field_r + 155);
                kj.field_b.d(var6 - jd.field_D.field_v, var8);
                ph.a(var30, var2, var3);
                ph.a(mo.field_w);
                kj.field_b = null;
            }
        }
        ph.b(mo.field_w);
        ph.a(16, 16, 608, 112, 15, ln.field_G, of.field_o);
        ph.a(231, 144, 393, 232, 15, ln.field_G, of.field_o);
        if (!(kn.field_f == null)) {
            kn.field_f.d(0, 0);
        }
        if (null != mk.field_a) {
            mk.field_a.d(0, 0);
        }
        jd.field_D.d(0, 0);
        if (!(vc.field_b == null)) {
            vc.field_b.d(0, 0);
        }
        if (vk.field_s != null) {
            if (jg.field_t != null) {
                vk.field_s.d(231, 390);
                var1_ref = je.field_e;
                if ((sd.field_s.field_g ^ -1) == -1) {
                    var1_ref = ue.field_f;
                }
                var1_ref.d(0, 0);
                var2 = (cd.a(-109, ke.field_c << (sd.field_s.field_g == 0 ? 4 : 3)) * 40 >> -934588624) + 40;
                if (!((var2 ^ -1) >= -1)) {
                    vk.field_s.a(230, 389, var2);
                    vk.field_s.a(232, 389, var2);
                    vk.field_s.a(232, 391, var2);
                    vk.field_s.a(230, 391, var2);
                    var1_ref.a(1, 1, var2);
                    var1_ref.a(-1, 1, var2);
                    var1_ref.a(1, -1, var2);
                    var1_ref.a(-1, -1, var2);
                }
                eh.a(we.field_h, na.field_E, 0, (sd.field_s.field_g ^ -1) == -1 ? true : false);
            }
        }
        if (vk.field_s != null) {
            if (null != jg.field_t) {
                vk.field_s.d(434, 390);
                ki.field_H.d(0, 0);
                if ((sd.field_s.field_g ^ -1) == -2) {
                    kp.a(-4 + vk.field_s.field_s, vk.field_s.field_t * 7 / 12, 436, (byte) 16, 64, 392);
                }
                eh.a(nc.field_a, db.field_j, 0, 1 == sd.field_s.field_g ? true : false);
            }
        }
        if (qc.field_db == null) {
            lc.g(param0 + 102);
            ln.field_H[da.field_a].d(269, 340);
        } else {
            var1 = 357 - qc.field_db.field_u / 2;
            qc.field_db.d(269 + -qc.field_db.field_w, var1);
            p.field_w.d(586, var1);
            if ((k.field_e ^ -1) < (var1 ^ -1)) {
                if ((k.field_e ^ -1) > (qc.field_db.field_t + var1 ^ -1)) {
                    var2 = (cd.a(-118, ke.field_c << -662229436) * 40 >> 276927536) + 40;
                    if (0 < var2) {
                        if ((n.field_t ^ -1) < (-qc.field_db.field_s + 269 ^ -1)) {
                            // if_icmpge L2655
                            qc.field_db.a(-1 + -qc.field_db.field_w + 269, var1 + -1, var2);
                            qc.field_db.a(-qc.field_db.field_w + 270, -1 + var1, var2);
                            qc.field_db.a(-1 + (269 + -qc.field_db.field_w), var1 - -1, var2);
                            qc.field_db.a(-qc.field_db.field_w + 269 - -1, 1 + var1, var2);
                        } else {
                            if (-587 > (n.field_t ^ -1)) {
                                if (!((n.field_t ^ -1) <= (qc.field_db.field_s + 586 ^ -1))) {
                                    p.field_w.a(585, var1 - 1, var2);
                                    p.field_w.a(587, var1 + -1, var2);
                                    p.field_w.a(585, 1 + var1, var2);
                                    p.field_w.a(587, 1 + var1, var2);
                                }
                            }
                        }
                    }
                }
            }
            lc.g(param0 + 102);
            ln.field_H[da.field_a].d(269, 340);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var24 = null;
        int[] var25 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var16 = Torquing.field_u;
          var17 = ((wb) this).field_l.a(param1, 25657);
          var3 = var17;
          if (((wb) this).field_l.field_b) {
            var25 = ((wb) this).b(0, 0, vp.field_I & -1 + param1);
            var5 = ((wb) this).b(0, 0, param1);
            var24 = ((wb) this).b(0, 0, 1 + param1 & vp.field_I);
            var7 = 0;
            L1: while (true) {
              if (ci.field_c <= var7) {
                break L0;
              } else {
                L2: {
                  var8 = ((wb) this).field_s * (var24[var7] + -var25[var7]);
                  var9 = ((wb) this).field_s * (var5[jh.field_A & 1 + var7] - var5[var7 + -1 & jh.field_A]);
                  var10 = var9 >> -156785332;
                  var11 = var8 >> -283348180;
                  var12 = var10 * var10 >> 73300652;
                  var13 = var11 * var11 >> 1659576364;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 - -4096) / 4096.0f)));
                  if (var14 != 0) {
                    stackOut_6_0 = 16777216 / var14;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                var15 = stackIn_7_0;
                var17[var7] = -var15 + 4096;
                var7++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param0 >= 86) {
          return var17;
        } else {
          return null;
        }
    }

    final static void a(String param0, int param1) {
        wh.field_u = param0;
        if (param1 != 390) {
            Object var3 = null;
            wb.a((String) null, 6);
        }
    }

    public wb() {
        super(1, true);
        ((wb) this).field_s = 4096;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = null;
    }
}
