/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static qr field_a;
    static int field_e;
    static String field_d;
    static String field_b;
    static String field_g;
    static String field_f;
    static String field_c;

    final static void a(bc param0, java.applet.Applet param1, bc param2, bc param3, bc param4, bc param5, byte param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9_int = 0;
        bi var19 = null;
        bi var20 = null;
        bi[] var9 = null;
        bi[] var21 = null;
        bi[] var22 = null;
        bi var23_ref = null;
        bi var24_ref = null;
        bi var25_ref = null;
        bi var26_ref = null;
        bi var27 = null;
        bi var28 = null;
        bi var29 = null;
        String var13 = null;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var13_int = 0;
        int var15_int = 0;
        bi var15 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        Object var26 = null;
        int var18 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            mp.field_b = ri.a("font", "", param0, param4, (byte) 89);
            rs.field_Cb = ri.a("smallfont", "", param0, param4, (byte) 111);
            in.field_f = ds.a(true, param0, "", "logo");
            var7_int = 3 * in.field_f.field_o / 4;
            var8 = in.field_f.field_p * 3 / 4;
            ra.a(-110);
            jf.field_a = new bi(var7_int, var8);
            jf.field_a.e();
            gf.d(0, 0, var7_int, var8, 16777215);
            in.field_f.e(0, 0, 0);
            gf.b(3, 3, 0, 0, var7_int, var8);
            in.field_f.e(0, 0, 255);
            cg.i(param6 + 8);
            fm.field_d = ae.a(101, "", param0, "edge_orbs");
            mh.field_b = new bi[4];
            ra.a(param6 ^ 108);
            for (var9_int = 0; 4 > var9_int; var9_int++) {
                var19 = fm.field_d[var9_int];
                var20 = new bi(var19.field_z + 32, 32 + var19.field_w);
                var20.e();
                var19.e(16 + -var19.field_t, 16 - var19.field_x, 16777215);
                gf.b(8, 8, 0, 0, var20.field_z, var20.field_w);
                var19.e(16 - var19.field_t, 16 + -var19.field_x, 0);
                mh.field_b[var9_int] = var20;
            }
            cg.i(0);
            hn.field_c = ds.a(true, param0, "", "menu_hex");
            jm.field_r = id.a(2, param0, "", "instr_mainview");
            hb.field_d = id.a(param6 ^ -6, param0, "", "instr_starframe");
            ae.a(-100, "", param0, "zoomicons");
            var9 = va.a("hud_icons", 0, "", param0);
            k.field_d = var9[3];
            h.field_F = var9[2];
            fm.field_e = var9[0];
            wl.field_d = var9[4];
            tm.field_r = var9[1];
            var21 = va.a("hud_icons_red", param6 + 8, "", param0);
            bd.field_D = var21[0];
            cs.field_h = var21[3];
            ak.field_x = var21[2];
            je.field_b = var21[1];
            nr.field_k = var21[4];
            var22 = va.a("hud_icons_nobase", 0, "", param0);
            fl.field_b = var22[0];
            je.field_f = var22[4];
            us.field_a = var22[3];
            jq.field_b = var22[1];
            ci.field_p = var22[2];
            fs.field_a = va.a("icon_circles", param6 + 8, "", param0);
            dm.field_d = va.a("production_icons", 0, "", param0);
            aq.field_i = ds.a(true, param0, "", "production_button");
            hq.field_a = ds.a(true, param0, "", "production_button_down");
            d.field_b = va.a("project_icons", 0, "", param0);
            pf.field_a = va.a("faction_icons", 0, "", param0);
            hb.field_b = va.a("faction_icons_large", 0, "", param0);
            var23_ref = pf.field_a[1];
            pf.field_a[1] = pf.field_a[5];
            pf.field_a[5] = var23_ref;
            var24_ref = pf.field_a[2];
            pf.field_a[2] = pf.field_a[4];
            pf.field_a[4] = var24_ref;
            var25_ref = hb.field_b[1];
            hb.field_b[1] = hb.field_b[5];
            hb.field_b[5] = var25_ref;
            var26_ref = hb.field_b[2];
            hb.field_b[2] = hb.field_b[4];
            hb.field_b[4] = var26_ref;
            rk.field_j = ds.a(true, param0, "", "ready_button");
            ei.field_a = ds.a(true, param0, "", "ready_button_down");
            jl.field_W = ds.a(true, param0, "", "shine_left");
            mr.field_g = ds.a(true, param0, "", "shine_right");
            me.field_h = ds.a(true, param0, "", "shine_mid");
            ii.field_q = ds.a(true, param0, "", "combat_hex_white");
            ra.a(-116);
            ii.field_q.e();
            ii.field_q.b(0, 0, 2105376);
            cg.i(0);
            bj.field_H = ds.a(true, param0, "", "planet_burnt");
            qe.field_j = ds.a(true, param0, "", "planet_scorchedearth");
            tk.field_x = ds.a(true, param0, "", "planet_earthlike");
            ta.field_a = ds.a(true, param0, "", "planet_exotic");
            be.field_k = ds.a(true, param0, "", "planet_gas");
            rl.field_c = ds.a(true, param0, "", "planet_ringed");
            kr.field_d = ds.a(true, param0, "", "planet_rock");
            rk.field_k = ds.a(true, param0, "", "alien_miner");
            ti.field_h = ds.a(true, param0, "", "alien_ship");
            cp.field_t = ds.a(true, param0, "", "alien_base");
            kb.field_y = id.a(2, param0, "", "ship");
            wo.field_b = id.a(2, param0, "", "shield");
            oo.field_a = id.a(param6 ^ -6, param0, "", "defensegrid");
            ab.field_e = id.a(2, param0, "", "chevron");
            go.field_L = ds.a(true, param0, "", "warning");
            bd.field_G = id.a(2, param0, "", "hammer");
            e.field_e = id.a(param6 ^ -6, param0, "", "beaker");
            vg.field_t = ds.a(true, param0, "", "factionring");
            ii.field_y = ds.a(true, param0, "", "factionringtag");
            ek.field_z = ds.a(true, param0, "", "factionringcentre");
            fj.field_p = ds.a(true, param0, "", "arrowship");
            eq.field_o = ds.a(true, param0, "", "arrowshipdamaged");
            cf.field_F = ds.a(true, param0, "", "fleetsarrowship");
            di.field_i = va.a("fleetbuttons", 0, "", param0);
            nr.field_r = va.a("anim_icons", 0, "", param0);
            co.field_s = new om(6, 6);
            co.field_s.field_B[33] = 469762047;
            co.field_s.field_B[28] = -14671840;
            co.field_s.field_B[24] = 0;
            co.field_s.field_B[35] = 0;
            co.field_s.field_B[17] = 1140850688;
            co.field_s.field_B[5] = 0;
            co.field_s.field_B[31] = 0;
            co.field_s.field_B[2] = 872415231;
            co.field_s.field_B[12] = 268435456;
            co.field_s.field_B[13] = -5658199;
            co.field_s.field_B[10] = -11250604;
            co.field_s.field_B[25] = -13487566;
            co.field_s.field_B[20] = -7303024;
            co.field_s.field_B[3] = 587202559;
            co.field_s.field_B[0] = 0;
            mj.field_Nb = (bi[]) ((Object) new om[6]);
            co.field_s.field_B[6] = 0;
            co.field_s.field_B[22] = -14013910;
            co.field_s.field_B[29] = 0;
            co.field_s.field_B[19] = -9408400;
            co.field_s.field_B[14] = -3815995;
            co.field_s.field_B[7] = -6118750;
            co.field_s.field_B[11] = 0;
            co.field_s.field_B[34] = 0;
            co.field_s.field_B[26] = -13948117;
            co.field_s.field_B[30] = 0;
            co.field_s.field_B[27] = -14869219;
            co.field_s.field_B[15] = -5066062;
            co.field_s.field_B[32] = 503316480;
            co.field_s.field_B[4] = 0;
            co.field_s.field_B[18] = 536870912;
            co.field_s.field_B[8] = -3684409;
            co.field_s.field_B[9] = -5329234;
            co.field_s.field_B[1] = 0;
            ts.field_L = (bi[]) ((Object) new om[6]);
            co.field_s.field_B[16] = -10658467;
            co.field_s.field_B[23] = 1207959552;
            co.field_s.field_B[21] = -10066330;
            for (var13_int = 0; mj.field_Nb.length > var13_int; var13_int++) {
                mj.field_Nb[var13_int] = ds.a(true, param0, "", "res_side_" + var13_int);
                ts.field_L[var13_int] = ds.a(true, param0, "", "res_low_" + var13_int);
            }
            qk.field_y = va.a("defnet_anim_small", 0, "", param0);
            for (var13_int = 0; var13_int < qk.field_y[0].field_B.length; var13_int++) {
                if (!((qk.field_y[0].field_B[var13_int] ^ -1) == -1)) {
                    qk.field_y[0].field_B[var13_int] = ((qk.field_y[0].field_B[var13_int] >>> -1295227752) / 4 << 414083608) + 6006988;
                }
            }
            for (var13_int = 1; 13 > var13_int; var13_int++) {
                var27 = qk.field_y[var13_int];
                for (var15_int = 0; var27.field_B.length > var15_int; var15_int++) {
                    if ((var27.field_B[var15_int] & -16777216 ^ -1) == -1) {
                        var27.field_B[var15_int] = 0;
                    }
                }
            }
            qa.field_p = va.a("defnet_anim_mid", 0, "", param0);
            for (var13_int = 0; qa.field_p[0].field_B.length > var13_int; var13_int++) {
                if (!(0 == qa.field_p[0].field_B[var13_int])) {
                    qa.field_p[0].field_B[var13_int] = 6006988 - -((qa.field_p[0].field_B[var13_int] >>> -2081983880) / 4 << -1301659432);
                }
            }
            for (var13_int = 1; -14 < (var13_int ^ -1); var13_int++) {
                var28 = qa.field_p[var13_int];
                for (var15_int = 0; var15_int < var28.field_B.length; var15_int++) {
                    if (!((-16777216 & var28.field_B[var15_int] ^ -1) != -1)) {
                        var28.field_B[var15_int] = 0;
                    }
                }
            }
            ge.field_k = va.a("defnet_anim_large", param6 ^ -8, "", param0);
            for (var13_int = 0; ge.field_k[0].field_B.length > var13_int; var13_int++) {
                if (!((ge.field_k[0].field_B[var13_int] ^ -1) == -1)) {
                    ge.field_k[0].field_B[var13_int] = ((ge.field_k[0].field_B[var13_int] >>> 1765312728) / 4 << -1147480296) + 6006988;
                }
            }
            for (var13_int = 1; var13_int < 13; var13_int++) {
                var29 = ge.field_k[var13_int];
                var15 = var29;
                var15 = var29;
                for (var15_int = 0; var29.field_B.length > var15_int; var15_int++) {
                    if (!(0 != (-16777216 & var29.field_B[var15_int]))) {
                        var29.field_B[var15_int] = 0;
                    }
                }
            }
            rf.field_k = new bi(16, 10);
            pr.field_a = new bi(18, 12);
            bs.a(rf.field_k, 98);
            kb.field_y.d(0, 0);
            pr.field_a.e();
            rf.field_k.b(1, 1, 8421504);
            fm.field_b = new bi(10, 12);
            fm.field_b.e();
            wo.field_b.b(1, 1, 8421504);
            ef.field_f = new bi(12, 12);
            ef.field_f.e();
            oo.field_a.b(1, 1, 8421504);
            mj.field_Kb = new bi(12, 12);
            mj.field_Kb.e();
            ab.field_e.b(1, 1, 8421504);
            wa.field_b = new bi(128, 128);
            wa.field_b.e();
            go.field_L.f(0, 0);
            for (var13_int = 0; var13_int < wa.field_b.field_B.length; var13_int++) {
                if (wa.field_b.field_B[var13_int] != 0) {
                    gf.c(var13_int % wa.field_b.field_z, var13_int / wa.field_b.field_z, 16777215, 128);
                    wa.field_b.field_B[var13_int] = ee.a(wa.field_b.field_B[var13_int], -16777216);
                }
            }
            fb.field_Vb = new bi(18, 12);
            fb.field_Vb.e();
            bd.field_G.b(1, 1, 8421504);
            cg.i(0);
            pr.field_a.f(16777215);
            fm.field_b.f(16777215);
            if (param6 != -8) {
                ck.a(-23);
            }
            ef.field_f.f(16777215);
            mj.field_Kb.f(16777215);
            fb.field_Vb.f(16777215);
            kj.field_f = hl.a((byte) 111, 80);
            hp.field_n = param0;
            mr.field_i = ea.a(5592405, (byte) 41, 13882323, 10);
            cm.field_b = id.a(param6 + 10, param2, "basic", "orbcoin");
            var13 = (es.field_m ^ -1) < -1 ? "unachieved" : "locked";
            jc.a(14, id.a(param6 ^ -6, param2, "basic", var13));
            jd.field_j = ae.a(param6 + 70, "", param0, "achievements");
            var14 = jd.field_j.length;
            ql.field_o = new bi[var14];
            tr.field_sb = new bi[var14];
            vh.field_a = new bi[var14];
            bd.field_C = new bi[var14];
            co.field_p = va.a("system_icons", 0, "", param0);
            ca.a(param1, param2, param3, param5, true, param0);
            kq.field_R = new bi(15, 15);
            bs.a(kq.field_R, 78);
            gf.g(15, 15, 15, 65793);
            gf.g(15, 15, 5, 0);
            le.field_d = new bi(15, 20);
            le.field_d.e();
            gf.d(0, 0, 15, 20, 65793);
            gf.g(0, -1, 5, 0);
            gf.g(0, 20, 5, 0);
            var15 = id.a(2, param0, "", "menu_pip");
            jq.field_e = new bi(2 + var15.field_z, 2 + var15.field_w);
            jq.field_e.e();
            var15.e(1, 1, 65793);
            bg.field_a = new bi(21, 22);
            bg.field_a.e();
            for (var16 = 0; -21 < (var16 ^ -1); var16++) {
                var17 = -11 > (var16 ^ -1) ? 20 + -var16 : 3;
                gf.f(11 - var17, 1 - -var16, 2 * var17, 65793);
            }
            cg.i(0);
            jq.field_e.f(2458760);
            bg.field_a.f(2458760);
            o.field_k = bg.field_a.g();
            o.field_k.b();
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "ck.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static kj a(String param0, int param1, int param2) {
        kj var3 = null;
        RuntimeException var3_ref = null;
        kj stackIn_2_0 = null;
        kj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3 = new kj(false);
            var3.field_c = param1;
            var3.field_g = param0;
            if (param2 <= -13) {
              stackIn_4_0 = (kj) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (kj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("ck.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(byte param0, java.applet.Applet param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            String var10 = null;
            String stackIn_7_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var9 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var10 = param1.getParameter("cookieprefix");
                    var3 = var10 + "settings";
                    var6 = -67 / ((-84 - param0) / 42);
                    var4 = (String) (ll.a("getcookies", param1, (byte) 53));
                    var5 = so.a(var4, ';', 111);
                    var7 = 0;
                    L2: while (true) {
                      if (var5.length <= var7) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var8 = var5[var7].indexOf('=');
                          if ((var8 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (var5[var7].substring(0, var8).trim().equals(var3)) {
                              stackIn_7_0 = var5[var7].substring(var8 + 1).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var7++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (cj.field_u == null) {
                    stackIn_15_0 = param1.getParameter("settings");
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    stackIn_13_0 = cj.field_u;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector1 = 2;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (var2_ref);

                stackIn_18_1 = new StringBuilder().append("ck.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L5;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L5;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
              } else {
                return stackIn_7_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(byte[] param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        bc var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              ps.a(param0, 0, var3, 0, var2_int);
              if (!param1) {
                break L1;
              } else {
                var4 = (bc) null;
                ck.a((bc) null, (java.applet.Applet) null, (bc) null, (bc) null, (bc) null, (bc) null, (byte) 57);
                break L1;
              }
            }
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ck.D(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 <= 83) {
            return;
        }
        field_f = null;
        field_b = null;
        field_g = null;
        field_d = null;
    }

    static {
        field_f = "Name is available";
        field_g = "<%glossary>FLEET</col> - A collection of ships<br><br><%glossary>SYSTEM</col> - A star and its related planets. <%glossary>Systems</col> are always controlled by a single player and only that player can have <%glossary>fleets</col> stationed there. If another player's fleet enters the system, the two fleets engage in combat until one remains.<br><br><%glossary>NEUTRAL</col> - A <%glossary>system</col> not under the control of any player. <%glossary>Neutral</col> systems never attack and do not produce fleets.<br><br><%glossary>WORMHOLE</col> - <%glossary>Systems</col> are connected by <%glossary>wormholes</col>, which fleets use to move between systems. Fleets can jump along a single wormhole link per turn in <%glossary>neutral</col> or hostile systems, but can chain jumps together in systems you control.<br><br><%glossary>RESOURCE</col> - There are four types of <%glossary>resource</col> in <%highlight>Shattered Plans</col>: <%resource0>, <%resource1>, <%resource2> and <%resource3>, and they are used to construct fleets and <%highlight>projects</col>.<br><br>";
        field_c = "OK";
        field_b = "Account created successfully!";
        field_d = "Successful attacks";
    }
}
