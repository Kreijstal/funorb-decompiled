/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_c;
    private bm field_e;
    static String field_j;
    static String field_i;
    static int field_b;
    static int[] field_g;
    private di field_d;
    private di field_h;
    static nj[] field_a;
    static ko field_k;
    private bm field_f;

    private final jg a(String param0, byte param1, int[] param2, String param3) {
        int var5 = ((cf) this).field_h.b(param0, -1);
        if (0 > var5) {
            return null;
        }
        int var6 = ((cf) this).field_h.a(var5, param1 ^ 18, param3);
        if (param1 != 18) {
            field_j = null;
        }
        if ((var6 ^ -1) > -1) {
            return null;
        }
        return this.a(true, var5, var6, param2);
    }

    public static void a(int param0) {
        field_k = null;
        field_g = null;
        if (param0 != 28746) {
            field_g = null;
        }
        field_i = null;
        field_c = null;
        field_j = null;
        field_a = null;
    }

    final static void a(int param0, di param1) {
        int var2 = 0;
        dd[] var3 = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        dd var8 = null;
        int var9 = 0;
        oo var10 = null;
        qb var11 = null;
        int[] var13 = null;
        dd var14 = null;
        dd var15 = null;
        dd var16 = null;
        dd var17 = null;
        dd var18 = null;
        dd var19 = null;
        dd[] var20 = null;
        qb var21 = null;
        int[] var23 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        var9 = Pool.field_O;
        var2 = 0;
        L0: while (true) {
          if (var2 >= nn.field_b.length) {
            var2 = 0;
            L1: while (true) {
              if (al.field_B.length <= var2) {
                uk.field_b = new dd[]{pf.a("", (byte) 46, "menu_background_modern", param1), pf.a("", (byte) 42, "menu_background_plasma", param1), pf.a("", (byte) 62, "menu_background_jungle", param1), pf.a("", (byte) 40, "menu_background_polar", param1), pf.a("", (byte) 76, "menu_background_shuttle", param1)};
                uj.field_c = pf.a("", (byte) 124, "select_table_thumbnail_modern", param1);
                nm.field_d = pf.a("", (byte) 120, "select_table_thumbnail_plasma", param1);
                sk.field_b = pf.a("", (byte) 121, "select_table_thumbnail_jungle", param1);
                im.field_Vb = pf.a("", (byte) 44, "select_table_thumbnail_polar", param1);
                wn.field_e = pf.a("", (byte) 91, "select_table_thumbnail_shuttle", param1);
                pk.field_b = pf.a("", (byte) 50, "select_table_thumbnail_jungle_locked", param1);
                tq.field_n = pf.a("", (byte) 87, "select_table_thumbnail_polar_locked", param1);
                uk.field_g = pf.a("", (byte) 62, "select_table_thumbnail_shuttle_locked", param1);
                ne.field_t = new dd[]{null, null, pk.field_b, tq.field_n, uk.field_g};
                og.field_K = new dd[]{uj.field_c, nm.field_d, sk.field_b, im.field_Vb, wn.field_e};
                nn.field_a[0] = aj.a(cq.a(param0, 0), "", param1, "gameopt_listicons_turntime");
                nn.field_a[2] = aj.a(param0 + 0, "", param1, "gameopt_listicons_theme");
                nn.field_a[1] = aj.a(cq.a(param0, 0), "", param1, "gameopt_listicons_ruleset");
                nn.field_a[3] = aj.a(0, "", param1, "gameopt_listicons_guides");
                ff.field_f[0] = nn.field_a[0];
                ff.field_f[2] = aj.a(cq.a(param0, 0), "", param1, "gameopt_buttonicons_theme");
                ff.field_f[3] = nn.field_a[3];
                ff.field_f[1] = nn.field_a[1];
                rm.field_g = gn.a(aj.a(0, "", param1, "frame"), (byte) -29);
                vk.field_y = gn.a(aj.a(0, "", param1, "frame_dark"), (byte) -29);
                mp.field_N = gn.a(aj.a(param0 + 0, "", param1, "frame_black"), (byte) -29);
                ln.field_s = gn.a(aj.a(0, "", param1, "frame_selected"), (byte) -29);
                cq.field_b = gn.a(aj.a(0, "", param1, "menu_main_frame"), (byte) -29);
                jp.field_T = pf.a("", (byte) 109, "menu_main_frame_pocket_bottom", param1);
                mj.field_b = pf.a("", (byte) 104, "menu_main_frame_pocket_top", param1);
                bi.field_a = pf.a("", (byte) 47, "menu_main_frame_pocket_left", param1);
                wk.field_T = pf.a("", (byte) 123, "menu_main_frame_pocket_right", param1);
                od.field_a = lb.a(param1, -45, "", "title_corner_ball8");
                cl.field_k = lb.a(param1, param0 ^ 101, "", "title_corner_ball9");
                li.field_f = aj.a(0, "", param1, "achievements");
                var2 = 0;
                L2: while (true) {
                  if (li.field_f.length <= var2) {
                    te.field_n = lb.a(param1, 99, "", "achievement_highlight_hover");
                    td.field_g = lb.a(param1, 109, "", "achievement_highlight_selected");
                    cl.field_m = lb.a(param1, -10, "", "title_pool_logo_withalpha");
                    var11 = tl.a(param1, 3812, "gradient_arrow_left", "");
                    var26 = var11.field_i;
                    var27 = new int[var26.length];
                    var25 = var27;
                    var23 = var25;
                    var13 = var23;
                    var4_ref_int__ = var13;
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= var26.length) {
                        fd.a(var26, var27, (byte) -54);
                        var5 = dn.a(var4_ref_int__, (byte) 117, ta.a(new int[4], param0 ^ -126));
                        var6 = dn.a(var4_ref_int__, (byte) 10, ta.a(new int[4], 18));
                        var7 = dn.a(var4_ref_int__, (byte) 7, ta.a(new int[4], param0 ^ 70));
                        var11.field_i = var5;
                        dd dupTemp$36 = ii.a(2, var11);
                        hp.field_b = dupTemp$36;
                        var14 = dupTemp$36;
                        var8 = var14;
                        var8.field_B = 0;
                        var8.field_w = var14.field_z;
                        var8.field_y = var14.field_A;
                        var8.field_G = 0;
                        var11.field_i = var6;
                        dd dupTemp$37 = ii.a(2, var11);
                        eh.field_y = dupTemp$37;
                        var15 = dupTemp$37;
                        var8 = var15;
                        var8.field_w = var15.field_z;
                        var8.field_y = var15.field_A;
                        var8.field_G = 0;
                        var8.field_B = 0;
                        var11.field_i = var7;
                        dd dupTemp$38 = ii.a(param0 + 2, var11);
                        gj.field_T = dupTemp$38;
                        var16 = dupTemp$38;
                        var8 = var16;
                        var8.field_G = 0;
                        var8.field_B = 0;
                        var8.field_w = var16.field_z;
                        var8.field_y = var16.field_A;
                        var11.a();
                        var11.field_i = var5;
                        dd dupTemp$39 = ii.a(2, var11);
                        bf.field_h = dupTemp$39;
                        var17 = dupTemp$39;
                        var8 = var17;
                        var8.field_G = 0;
                        var8.field_w = var17.field_z;
                        var8.field_y = var17.field_A;
                        var8.field_B = 0;
                        var11.field_i = var6;
                        dd dupTemp$40 = ii.a(2, var11);
                        wf.field_a = dupTemp$40;
                        var18 = dupTemp$40;
                        var8 = var18;
                        var8.field_w = var18.field_z;
                        var8.field_G = param0;
                        var8.field_y = var18.field_A;
                        var8.field_B = 0;
                        var11.field_i = var7;
                        dd dupTemp$41 = ii.a(2, var11);
                        ag.field_b = dupTemp$41;
                        var19 = dupTemp$41;
                        var8 = var19;
                        var8.field_y = var19.field_A;
                        var8.field_B = 0;
                        var8.field_G = 0;
                        var8.field_w = var19.field_z;
                        var2 = 0;
                        var3 = ep.a(106, param1, "titles", "");
                        int incrementValue$42 = var2;
                        var2++;
                        mq.field_a = var3[incrementValue$42];
                        int incrementValue$43 = var2;
                        var2++;
                        ao.field_Pb = var3[incrementValue$43];
                        int incrementValue$44 = var2;
                        var2++;
                        em.field_M = var3[incrementValue$44];
                        int incrementValue$45 = var2;
                        var2++;
                        df.field_i = var3[incrementValue$45];
                        int incrementValue$46 = var2;
                        var2++;
                        db.field_Wb = var3[incrementValue$46];
                        int incrementValue$47 = var2;
                        var2++;
                        im.field_Lb = var3[incrementValue$47];
                        int incrementValue$48 = var2;
                        var2++;
                        lk.field_w = var3[incrementValue$48];
                        int incrementValue$49 = var2;
                        var2++;
                        mc.field_k = var3[incrementValue$49];
                        int incrementValue$50 = var2;
                        var2++;
                        lq.field_Q = var3[incrementValue$50];
                        il.field_f = pf.a("", (byte) 84, "side_power_bar", param1);
                        v.field_c = pf.a("", (byte) 94, "side_power_bar_fill", param1);
                        bq.field_n = pf.a("", (byte) 102, "top_bar_inner", param1);
                        no.field_q = pf.a("", (byte) 115, "top_bar", param1);
                        mf.field_n = pf.a("", (byte) 80, "top_bar_ball_open", param1);
                        hm.field_l = aj.a(0, "", param1, "hud_chat_tab_frame_empty");
                        lb.field_O = aj.a(0, "", param1, "hud_chat_tab_frame");
                        dr.field_d = pf.a("", (byte) 95, "hud_chat_star", param1);
                        var2 = sa.field_h.b(ua.field_n);
                        ta.field_e = new dd(var2, sa.field_h.field_C + sa.field_h.field_w - -1);
                        ta.field_e.e();
                        sa.field_h.d(ua.field_n, 0, sa.field_h.field_C, 16777215, 1);
                        jh.field_e = new dd(dr.field_d.field_z + ta.field_e.field_z - -2, ta.field_e.field_A);
                        jh.field_e.e();
                        sa.field_h.d(ua.field_n, 0, sa.field_h.field_C, 16777215, 1);
                        dr.field_d.c(2 + var2, jh.field_e.field_A + -dr.field_d.field_A >> -259199039);
                        sh.field_P.b(15100);
                        wp.field_a = pf.a("", (byte) 60, "slider", param1);
                        dd discarded$51 = pf.a("", (byte) 35, "flash_foul", param1);
                        dd discarded$52 = pf.a("", (byte) 91, "hud_hbar_inner", param1);
                        gg.field_b = gn.a(aj.a(0, "", param1, "hud_hbar_frame"), (byte) -29);
                        id.field_a = gn.a(aj.a(0, "", param1, "hud_vbar_frame"), (byte) -29);
                        eq.field_Q = aj.a(0, "", param1, "top_bar_frame");
                        iq.field_d = pf.a("", (byte) 73, "icon_break", param1);
                        il.field_a = pf.a("", (byte) 73, "icon_ball_in_hand", param1);
                        dd discarded$53 = pf.a("", (byte) 98, "icon_extra_shot", param1);
                        gd.field_e = pf.a("", (byte) 101, "icon_extra_visit", param1);
                        oo.field_D = pf.a("", (byte) 90, "icon_snookered", param1);
                        sb.field_c = new dd[4];
                        sb.field_c[0] = pf.a("", (byte) 108, "menu_eightball", param1);
                        sb.field_c[1] = pf.a("", (byte) 107, "menu_nineball", param1);
                        sb.field_c[2] = pf.a("", (byte) 63, "menu_killer", param1);
                        sb.field_c[3] = pf.a("", (byte) 112, "menu_freeplay", param1);
                        var20 = aj.a(0, "", param1, "tutorial_text_box");
                        ff.field_e = new dd[]{new dd(0, var20[0].field_y), var20[0], new dd(0, var20[0].field_y), new dd(0, var20[1].field_y), var20[1], new dd(0, var20[1].field_y), new dd(0, var20[2].field_y), var20[2], new dd(0, var20[2].field_y)};
                        dq.field_e = aj.a(0, "", param1, "playerlist_button");
                        vm.field_d = aj.a(0, "", param1, "tutorial_controls");
                        qg.field_b = pf.a("", (byte) 52, "tutorial_box_progress", param1);
                        nf.field_Z = gr.a(param1, "", -24155, "controls");
                        bi.field_d = new int[nf.field_Z.length];
                        op.field_f = 0;
                        var4 = 0;
                        L4: while (true) {
                          if (nf.field_Z.length <= var4) {
                            bc.b((byte) 17);
                            return;
                          } else {
                            var21 = nf.field_Z[var4];
                            var21.field_e = 0;
                            var21.field_b = var21.field_g;
                            var21.field_h = var21.field_f;
                            var21.field_d = 0;
                            bi.field_d[var4] = var21.field_b + sa.field_h.field_C - sa.field_h.field_w >> -2054542079;
                            if (op.field_f < var21.field_g) {
                              op.field_f = var21.field_g;
                              var4++;
                              continue L4;
                            } else {
                              var4++;
                              continue L4;
                            }
                          }
                        }
                      } else {
                        var27[var5_int] = var5_int;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    ig.a(li.field_f[var2], (byte) -12);
                    var2++;
                    continue L2;
                  }
                }
              } else {
                al.field_B[var2].a(198123656, param1);
                var2++;
                continue L1;
              }
            }
          } else {
            var10 = nn.field_b[var2];
            var10.c(-23569, param1);
            var2++;
            continue L0;
          }
        }
    }

    private final jg a(int[] param0, int param1, int param2, int param3) {
        int var5 = (param2 >>> -1053435508 | (param2 & -1610608641) << -851484508) ^ param3;
        var5 = var5 | param2 << 1103719952;
        long var6 = 4294967296L ^ (long)var5;
        jg var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
        if (var8 != null) {
            return var8;
        }
        if (param0 != null) {
            if (-1 <= (param0[0] ^ -1)) {
                return null;
            }
        }
        int var10 = -125 % ((param1 - 64) / 36);
        gm var9 = (gm) (Object) ((cf) this).field_e.a(false, var6);
        if (var9 == null) {
            var9 = gm.a(((cf) this).field_d, param2, param3);
            if (var9 == null) {
                return null;
            }
            ((cf) this).field_e.a((byte) -128, (ma) (Object) var9, var6);
        }
        var8 = var9.a(param0);
        if (var8 == null) {
            return null;
        }
        var9.a((byte) -117);
        ((cf) this).field_f.a((byte) -128, (ma) (Object) var8, var6);
        return var8;
    }

    private final jg a(boolean param0, int param1, int param2, int[] param3) {
        int var5 = param2 ^ (param1 >>> 896304684 | (param1 & 1879052287) << -1757520124);
        var5 = var5 | param1 << 1878849616;
        long var6 = (long)var5;
        jg var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
        if (!(var8 == null)) {
            return var8;
        }
        if (param3 != null) {
            if ((param3[0] ^ -1) >= -1) {
                return null;
            }
        }
        if (!param0) {
            return null;
        }
        mi var9 = mi.a(((cf) this).field_h, param1, param2);
        if (var9 == null) {
            return null;
        }
        jg var10 = var9.b();
        var8 = var10;
        ((cf) this).field_f.a((byte) -126, (ma) (Object) var8, var6);
        if (param3 != null) {
            param3[0] = param3[0] - var10.field_n.length;
        }
        return var8;
    }

    final jg a(String param0, boolean param1, String param2) {
        if (!param1) {
            Object var5 = null;
            jg discarded$0 = ((cf) this).a((String) null, false, (String) null);
        }
        return this.a(param2, param0, (int[]) null, (byte) 126);
    }

    private final jg a(String param0, String param1, int[] param2, byte param3) {
        int var5 = ((cf) this).field_d.b(param0, -1);
        if ((var5 ^ -1) > -1) {
            return null;
        }
        int var6 = -114 % ((4 - param3) / 60);
        int var7 = ((cf) this).field_d.a(var5, 0, param1);
        if ((var7 ^ -1) > -1) {
            return null;
        }
        return this.a(param2, -50, var5, var7);
    }

    final jg a(int[] param0, int param1, int param2) {
        if (!(1 != ((cf) this).field_h.f(param2))) {
            return this.a(true, 0, param1, param0);
        }
        if (1 == ((cf) this).field_h.a(false, param1)) {
            return this.a(true, param1, 0, param0);
        }
        throw new RuntimeException();
    }

    final static void a(int param0, long param1) {
        if (!(0L < param1)) {
            return;
        }
        if (param0 >= -77) {
            field_i = null;
        }
        if (0L == param1 % 10L) {
            uq.a(param1 - 1L, (byte) 104);
            uq.a(1L, (byte) 104);
        } else {
            uq.a(param1, (byte) 104);
        }
    }

    final jg a(String param0, String param1, byte param2) {
        if (param2 <= 120) {
            Object var5 = null;
            jg discarded$0 = ((cf) this).a((String) null, true, (String) null);
        }
        return this.a(param0, (byte) 18, (int[]) null, param1);
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = af.c((byte) -123, param2);
        int var4 = o.a(param2, (byte) -116);
        int var5 = af.c((byte) -124, param0);
        int var6 = o.a(param0, (byte) -89);
        int var7 = (int)((long)var5 * (long)var3 >> 591987472);
        if (param1) {
            return null;
        }
        int var8 = (int)((long)var3 * (long)var6 >> 1299981200);
        int var9 = (int)((long)var5 * (long)var4 >> 1489184272);
        int var10 = (int)((long)var6 * (long)var4 >> -1262352432);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    cf(di param0, di param1) {
        ((cf) this).field_e = new bm(256);
        ((cf) this).field_f = new bm(256);
        ((cf) this).field_d = param1;
        ((cf) this).field_h = param0;
    }

    final jg b(int[] param0, int param1, int param2) {
        if (!((((cf) this).field_d.f(-1) ^ -1) != -2)) {
            return this.a(param0, 127, 0, param2);
        }
        if (!((((cf) this).field_d.a(false, param2) ^ -1) != -2)) {
            return this.a(param0, 3, param2, 0);
        }
        if (param1 != 6789) {
            ((cf) this).field_d = null;
        }
        throw new RuntimeException();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Loading extra data";
        field_i = "Now let's \"break\": Shoot the cue ball at the rack (the triangle of balls) now. Aim for the 1 ball.";
        field_j = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_g = new int[64];
    }
}
