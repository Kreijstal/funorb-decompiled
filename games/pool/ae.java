/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae {
    static long field_d;
    static String field_b;
    static int[] field_e;
    static an field_a;
    static nq field_c;
    static String field_f;

    final static String a(int param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        oq var5 = null;
        int var6 = 0;
        String var7 = null;
        eo var8 = null;
        CharSequence var9 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var9 = (CharSequence) ((Object) param2);
          if (!gj.a(-25908, var9)) {
            stackIn_3_0 = p.field_g;
            return stackIn_3_0;
          }
          if (2 != th.field_a) {
            stackIn_7_0 = ig.field_k;
            return stackIn_7_0;
          }
          var8 = hl.a(param1, 1);
          if (var8 == null) {
            stackIn_11_0 = nr.a(new String[]{param1}, -1, sg.field_Q);
            return stackIn_11_0;
          }
          var8.a((byte) -117);
          var8.a(false);
          gi.field_t = gi.field_t - 1;
          if (param0 != -3266) {
            var7 = (String) null;
            ae.a(-62, (String) null, (String) null, 67);
          }
          var5 = ej.field_j;
          var5.b(false, param3);
          var5.field_v = var5.field_v + 1;
          var6 = var5.field_v;
          var5.a(3, false);
          var5.a(-9946, param2);
          var5.b(-var6 + var5.field_v, true);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("ae.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != -26) {
          ae.a((byte) -115);
        }
    }

    final static void a(int param0) {
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        boolean stackIn_58_2 = false;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        boolean stackIn_67_2 = false;
        RuntimeException decompiledCaughtException = null;
        dd var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var5_ref_String = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        dd var9 = null;
        int var10 = 0;
        dd var11 = null;
        dd var12 = null;
        String var14 = null;
        dd var16 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = Pool.field_O;
        try {
          if (bm.field_k != null &&
            bm.field_k.d(-86) &&
            bm.field_k.a("benefits", 0) &&
            null != rl.field_c &&
            rl.field_c.d(-62) &&
            rl.field_c.a("benefits", 0)) {
            rf.field_e = pf.a("benefits", (byte) 51, "headline", bm.field_k);
            ec.field_d = pf.a("benefits", (byte) 79, "blurbpane", bm.field_k);
            ph.field_f = pf.a("benefits", (byte) 89, "button", bm.field_k);
            i.field_o = pf.a("benefits", (byte) 109, "signup_text", bm.field_k);
            dl.field_h = pf.a("benefits", (byte) 86, "menu_text", bm.field_k);
            o.field_C = pf.a("benefits", (byte) 78, "button_frame", bm.field_k);
            vq.field_Yb = pf.a("benefits", (byte) 75, "arrow", bm.field_k);
            de.field_d = (lr) ((Object) he.a(bm.field_k, "large_font", 0, rl.field_c, "benefits"));
            so.field_h = (lr) ((Object) he.a(bm.field_k, "small_font", 0, rl.field_c, "benefits"));
            var27 = qh.field_d;
            var2 = qh.field_l;
            var3 = qh.field_f;
            qh.a(ka.field_o);
            var11 = new dd(4 + vq.field_Yb.field_z, 4 + vq.field_Yb.field_A);
            var11.e();
            vq.field_Yb.b(2, 2, er.field_X);
            hd.a(1, 2, var11.field_A, var11, 4, var11.field_z, 0, 0);
            vq.field_Yb = var11;
            w.field_f = vq.field_Yb.a();
            var12 = new dd(195, 221);
            var6 = var12.field_z / 2;
            var12.e();
            de.field_d.b(nr.a(new String[]{sa.field_o}, -1, ul.field_l), var6, 40, 16777215, -1);
            so.field_h.b(nr.a(new String[]{sa.field_o}, -1, vb.field_c), var6, 60, 16777215, -1);
            de.field_d.b(nr.a(new String[]{pd.field_e}, -1, up.field_w), var6, 110, 16777215, -1);
            so.field_h.b(nr.a(new String[]{pd.field_e}, -1, cr.field_t), var6, 130, 16777215, -1);
            de.field_d.b(mp.field_X, var6, 180, 16777215, -1);
            so.field_h.b(cp.field_b, var6, 200, 16777215, -1);
            hd.a(1, 3, var12.field_A, var12, 4, var12.field_z, 0, 0);
            ec.field_d.e();
            var12.c(-ec.field_d.field_G + 18, -ec.field_d.field_B + 241);
            for (var7 = 0; var7 < mk.field_a.length; var7++) {
              jr.field_m[var7].e();
              so.field_h.a(mk.field_a[var7], 3, 3, -6 + jr.field_m[var7].field_z, -6 + jr.field_m[var7].field_A, er.field_X, -1, 1, 1, so.field_h.field_w + so.field_h.field_C);
              hd.a(1, 3, jr.field_m[var7].field_A, jr.field_m[var7], 4, jr.field_m[var7].field_z, 0, 0);
            }
            mk.field_a = null;
            td.field_a = i.field_o.d();
            td.field_a.e();
            qe.a(qh.field_l, 2 * qh.field_f / 3, 64, 0, (byte) 103, 0);
            qh.a(var27, var2, var3);
            qh.b(ka.field_o);
            ln.field_o = 390 + (ph.field_f.field_A - o.field_C.field_A) / 2;
            tn.field_o = 434 + (ph.field_f.field_z - o.field_C.field_z) / 2;
            oj.field_s = 390 + (-o.field_C.field_A + ph.field_f.field_A) / 2;
            bm.field_k = null;
            ir.field_n = (-o.field_C.field_z + ph.field_f.field_z) / 2 + 231;
          }
          if (null == wa.field_gb) {
            return;
          }
          if (null != vn.field_j &&
            null != de.field_d) {
            var28 = qh.field_d;
            var2Lifetime1 = qh.field_l;
            var3Lifetime1 = qh.field_f;
            qh.a(ka.field_o);
            var14 = nr.a(new String[]{bc.field_i[qg.field_e]}, param0 ^ 1, sh.field_S);
            var5 = de.field_d.a(var14, jc.field_h);
            var6Lifetime1 = de.field_d.b(var14, jc.field_h, de.field_d.field_C + de.field_d.field_w);
            var7Lifetime1 = se.field_h + (-var5 + jc.field_h) / 2;
            var8 = rf.field_c + (-var6Lifetime1 + li.field_e) / 2;
            var7Lifetime1 -= 3;
            var5 += 6;
            if (0 > var7Lifetime1) {
              var9_int = -var7Lifetime1;
              vn.field_j.field_G = vn.field_j.field_G + var9_int;
              var5 = var5 + var9_int * 2;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              pq.field_m = pq.field_m - var9_int;
              vn.field_j.field_w = vn.field_j.field_w + var9_int * 2;
              se.field_h = se.field_h + var9_int;
            }
            var6Lifetime1 += 6;
            var8 -= 3;
            if (var7Lifetime1 + var5 > vn.field_j.field_w) {
              var9_intLifetime1 = var7Lifetime1 + (var5 - vn.field_j.field_w);
              var5 = var5 + 2 * var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              se.field_h = se.field_h + var9_intLifetime1;
              vn.field_j.field_G = vn.field_j.field_G + var9_intLifetime1;
              pq.field_m = pq.field_m - var9_intLifetime1;
              vn.field_j.field_w = vn.field_j.field_w + 2 * var9_intLifetime1;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              var8 = var8 + var9_intLifetime2;
              vn.field_j.field_B = vn.field_j.field_B + var9_intLifetime2;
              vn.field_j.field_y = vn.field_j.field_y + 2 * var9_intLifetime2;
              ad.field_r = ad.field_r - var9_intLifetime2;
              rf.field_c = rf.field_c + var9_intLifetime2;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
            }
            if (vn.field_j.field_y < var6Lifetime1 + var8) {
              var9_intLifetime3 = -vn.field_j.field_y + (var8 + var6Lifetime1);
              vn.field_j.field_y = vn.field_j.field_y + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              rf.field_c = rf.field_c + var9_intLifetime3;
              vn.field_j.field_B = vn.field_j.field_B + var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              ad.field_r = ad.field_r - var9_intLifetime3;
            }
            vn.field_j.c();
            var9 = new dd(vn.field_j.field_w, vn.field_j.field_y);
            var9.e();
            de.field_d.a(var14, se.field_h, rf.field_c, jc.field_h, li.field_e, 16777215, -1, 1, 1, de.field_d.field_C + de.field_d.field_w);
            hd.a(1, 3, var9.field_y, var9, param0 + 6, var9.field_w, 0, 0);
            vn.field_j.e();
            var9.c(0, 0);
            ua.field_u = new dd(640, 480);
            ua.field_u.e();
            vn.field_j.b((vn.field_j.field_w >> 1) + pq.field_m, (vn.field_j.field_y >> 1) + ad.field_r, ej.field_g, 4096);
            vn.field_j = null;
            ua.field_u.b();
            qh.a(var28, var2Lifetime1, var3Lifetime1);
            qh.b(ka.field_o);
          }
          if (nr.field_N != null &&
            so.field_h != null) {
            var29 = qh.field_d;
            var2Lifetime2 = qh.field_l;
            var3Lifetime2 = qh.field_f;
            qh.a(ka.field_o);
            var16 = new dd(412, 43);
            var5_ref_String = nr.a(new String[]{nr.field_N}, -1, wm.field_cc);
            nr.field_N = null;
            var16.e();
            so.field_h.a(var5_ref_String, 3, 3, -6 + var16.field_z, var16.field_A - 6, 16777215, -1, 0, 1, so.field_h.field_C + so.field_h.field_w);
            hd.a(1, 3, var16.field_A, var16, 4, var16.field_z, 0, 0);
            wa.field_gb.e();
            var16.c(199 - wa.field_gb.field_G, -wa.field_gb.field_B + 83);
            qh.a(var29, var2Lifetime2, var3Lifetime2);
            qh.b(ka.field_o);
          }
          if (param0 != -2) {
            ae.a((byte) -67);
          }
          if (mm.field_c != null &&
            null != so.field_h) {
            var30 = qh.field_d;
            var2Lifetime3 = qh.field_l;
            var3Lifetime3 = qh.field_f;
            qh.a(ka.field_o);
            var4 = 6 + so.field_h.a(fk.field_eb, 640);
            var5Lifetime1 = var4 + mm.field_c.field_w + 20;
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = 20 + (var6Lifetime2 + mm.field_c.field_w);
            wa.field_gb.e();
            so.field_h.d(fk.field_eb, -wa.field_gb.field_G + var7Lifetime2, so.field_h.field_w + (-wa.field_gb.field_B + 155 + so.field_h.field_C), 16777215, -1);
            hd.a(1, 3, 50, wa.field_gb, 4, var4, var7Lifetime2 - wa.field_gb.field_G - 4, -wa.field_gb.field_B + 155);
            var8Lifetime1 = 155 - wa.field_gb.field_B - (-so.field_h.field_C + (-3 + mm.field_c.field_y - so.field_h.field_w)) / 2;
            mm.field_c.c(var6Lifetime2 - wa.field_gb.field_G, var8Lifetime1);
            qh.a(var30, var2Lifetime3, var3Lifetime3);
            qh.b(ka.field_o);
            mm.field_c = null;
          }
          qh.a(ka.field_o);
          qh.a(16, 16, 608, 112, 15, oo.field_k, vc.field_L);
          qh.a(231, 144, 393, 232, 15, oo.field_k, vc.field_L);
          if (rf.field_e != null) {
            rf.field_e.c(0, 0);
          }
          if (ec.field_d != null) {
            ec.field_d.c(0, 0);
          }
          wa.field_gb.c(0, 0);
          if (null != ua.field_u) {
            ua.field_u.c(0, 0);
          }
          if (ph.field_f != null &&
            null != o.field_C) {
            ph.field_f.c(231, 390);
            var1 = i.field_o;
            if (jc.field_j.field_h == 0) {
              var1 = td.field_a;
            }
            var1.c(0, 0);
            stackIn_52_0 = 40;
            stackIn_52_1 = 40;
            stackIn_52_2 = uf.field_X;
            if (jc.field_j.field_h != 0) {
              stackIn_53_3 = 3;
            } else {
              stackIn_53_3 = 4;
            }
            var2Lifetime4 = stackIn_52_0 + (stackIn_52_1 * ao.a(stackIn_52_2 << stackIn_53_3, true) >> 16);
            if (var2Lifetime4 > 0) {
              ph.field_f.c(230, 389, var2Lifetime4);
              ph.field_f.c(232, 389, var2Lifetime4);
              ph.field_f.c(232, 391, var2Lifetime4);
              ph.field_f.c(230, 391, var2Lifetime4);
              var1.c(1, 1, var2Lifetime4);
              var1.c(-1, 1, var2Lifetime4);
              var1.c(1, -1, var2Lifetime4);
              var1.c(-1, -1, var2Lifetime4);
            }
            stackIn_57_0 = param0 ^ -2;
            stackIn_57_1 = ir.field_n;
            stackIn_58_2 = (jc.field_j.field_h == 0);
            hg.a(stackIn_57_0, stackIn_57_1, stackIn_58_2, oj.field_s);
          }
          if (null != ph.field_f &&
            o.field_C != null) {
            ph.field_f.c(434, 390);
            dl.field_h.c(0, 0);
            if (1 == jc.field_j.field_h) {
              qe.a(ph.field_f.field_z - 4, 7 * ph.field_f.field_A / 12, 64, 392, (byte) 120, 436);
            }
            stackIn_66_0 = 0;
            stackIn_66_1 = tn.field_o;
            stackIn_67_2 = (jc.field_j.field_h == 1);
            hg.a(stackIn_66_0, stackIn_66_1, stackIn_67_2, ln.field_o);
          }
          if (vq.field_Yb != null) {
            var1_int = 357 - vq.field_Yb.field_y / 2;
            vq.field_Yb.c(-vq.field_Yb.field_w + 269, var1_int);
            w.field_f.c(586, var1_int);
            if (gg.field_f > var1_int &&
              gg.field_f < vq.field_Yb.field_A + var1_int) {
              var2Lifetime5 = (ao.a(uf.field_X << 4, true) * 40 >> 16) + 40;
              if (var2Lifetime5 <= 0) {
                pj.f(-1);
                jr.field_m[rj.field_f].c(269, 340);
                return;
              }
              if (wn.field_i > -vq.field_Yb.field_z + 269 &&
                wn.field_i < 269) {
                vq.field_Yb.c(-vq.field_Yb.field_w + 268, var1_int - 1, var2Lifetime5);
                vq.field_Yb.c(269 - (vq.field_Yb.field_w - 1), -1 + var1_int, var2Lifetime5);
                vq.field_Yb.c(-vq.field_Yb.field_w + 269 - 1, var1_int + 1, var2Lifetime5);
                vq.field_Yb.c(1 + (-vq.field_Yb.field_w + 269), var1_int + 1, var2Lifetime5);
              } else {
                if (wn.field_i > 586 &&
                  wn.field_i < vq.field_Yb.field_z + 586) {
                  w.field_f.c(585, -1 + var1_int, var2Lifetime5);
                  w.field_f.c(587, var1_int - 1, var2Lifetime5);
                  w.field_f.c(585, var1_int + 1, var2Lifetime5);
                  w.field_f.c(587, 1 + var1_int, var2Lifetime5);
                }
              }
            }
          }
          pj.f(-1);
          jr.field_m[rj.field_f].c(269, 340);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1_ref), "ae.B(" + param0 + ')');
        }
    }

    static {
        field_b = "<col=ff9999>Reds</col>";
        field_f = "You are offering to draw.";
    }
}
