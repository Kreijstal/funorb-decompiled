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
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        jg stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var5_int = ((cf) this).field_h.b(param0, -1);
            if (0 <= var5_int) {
              L1: {
                var6 = ((cf) this).field_h.a(var5_int, param1 ^ 18, param3);
                if (param1 == 18) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              if (var6 >= 0) {
                stackOut_8_0 = this.a(true, var5_int, var6, param2);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (jg) (Object) stackIn_7_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jg) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("cf.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_9_0;
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
        int var2_int = 0;
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
        var2_int = 0;
        L0: while (true) {
          if (var2_int >= nn.field_b.length) {
            var2_int = 0;
            L1: while (true) {
              if (al.field_B.length <= var2_int) {
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
                nn.field_a[2] = aj.a(param0, "", param1, "gameopt_listicons_theme");
                nn.field_a[1] = aj.a(cq.a(param0, 0), "", param1, "gameopt_listicons_ruleset");
                nn.field_a[3] = aj.a(0, "", param1, "gameopt_listicons_guides");
                ff.field_f[0] = nn.field_a[0];
                ff.field_f[2] = aj.a(cq.a(param0, 0), "", param1, "gameopt_buttonicons_theme");
                ff.field_f[3] = nn.field_a[3];
                ff.field_f[1] = nn.field_a[1];
                rm.field_g = gn.a(aj.a(0, "", param1, "frame"), (byte) -29);
                vk.field_y = gn.a(aj.a(0, "", param1, "frame_dark"), (byte) -29);
                mp.field_N = gn.a(aj.a(param0, "", param1, "frame_black"), (byte) -29);
                ln.field_s = gn.a(aj.a(0, "", param1, "frame_selected"), (byte) -29);
                cq.field_b = gn.a(aj.a(0, "", param1, "menu_main_frame"), (byte) -29);
                jp.field_T = pf.a("", (byte) 109, "menu_main_frame_pocket_bottom", param1);
                mj.field_b = pf.a("", (byte) 104, "menu_main_frame_pocket_top", param1);
                bi.field_a = pf.a("", (byte) 47, "menu_main_frame_pocket_left", param1);
                wk.field_T = pf.a("", (byte) 123, "menu_main_frame_pocket_right", param1);
                od.field_a = lb.a(param1, -45, "", "title_corner_ball8");
                cl.field_k = lb.a(param1, param0 ^ 101, "", "title_corner_ball9");
                li.field_f = aj.a(0, "", param1, "achievements");
                var2_int = 0;
                L2: while (true) {
                  if (li.field_f.length <= var2_int) {
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
                        dd dupTemp$18 = ii.a(2, var11);
                        hp.field_b = dupTemp$18;
                        var14 = dupTemp$18;
                        var8 = var14;
                        var8.field_B = 0;
                        var8.field_w = var14.field_z;
                        var8.field_y = var14.field_A;
                        var8.field_G = 0;
                        var11.field_i = var6;
                        dd dupTemp$19 = ii.a(2, var11);
                        eh.field_y = dupTemp$19;
                        var15 = dupTemp$19;
                        var8 = var15;
                        var8.field_w = var15.field_z;
                        var8.field_y = var15.field_A;
                        var8.field_G = 0;
                        var8.field_B = 0;
                        var11.field_i = var7;
                        dd dupTemp$20 = ii.a(param0 + 2, var11);
                        gj.field_T = dupTemp$20;
                        var16 = dupTemp$20;
                        var8 = var16;
                        var8.field_G = 0;
                        var8.field_B = 0;
                        var8.field_w = var16.field_z;
                        var8.field_y = var16.field_A;
                        var11.a();
                        var11.field_i = var5;
                        dd dupTemp$21 = ii.a(2, var11);
                        bf.field_h = dupTemp$21;
                        var17 = dupTemp$21;
                        var8 = var17;
                        var8.field_G = 0;
                        var8.field_w = var17.field_z;
                        var8.field_y = var17.field_A;
                        var8.field_B = 0;
                        var11.field_i = var6;
                        dd dupTemp$22 = ii.a(2, var11);
                        wf.field_a = dupTemp$22;
                        var18 = dupTemp$22;
                        var8 = var18;
                        var8.field_w = var18.field_z;
                        var8.field_G = param0;
                        var8.field_y = var18.field_A;
                        var8.field_B = 0;
                        var11.field_i = var7;
                        dd dupTemp$23 = ii.a(2, var11);
                        ag.field_b = dupTemp$23;
                        var19 = dupTemp$23;
                        var8 = var19;
                        var8.field_y = var19.field_A;
                        var8.field_B = 0;
                        var8.field_G = 0;
                        var8.field_w = var19.field_z;
                        var2_int = 0;
                        var3 = ep.a(106, param1, "titles", "");
                        int incrementValue$24 = var2_int;
                        var2_int++;
                        mq.field_a = var3[incrementValue$24];
                        int incrementValue$25 = var2_int;
                        var2_int++;
                        ao.field_Pb = var3[incrementValue$25];
                        int incrementValue$26 = var2_int;
                        var2_int++;
                        em.field_M = var3[incrementValue$26];
                        int incrementValue$27 = var2_int;
                        var2_int++;
                        df.field_i = var3[incrementValue$27];
                        int incrementValue$28 = var2_int;
                        var2_int++;
                        db.field_Wb = var3[incrementValue$28];
                        int incrementValue$29 = var2_int;
                        var2_int++;
                        im.field_Lb = var3[incrementValue$29];
                        int incrementValue$30 = var2_int;
                        var2_int++;
                        lk.field_w = var3[incrementValue$30];
                        int incrementValue$31 = var2_int;
                        var2_int++;
                        mc.field_k = var3[incrementValue$31];
                        int incrementValue$32 = var2_int;
                        var2_int++;
                        lq.field_Q = var3[incrementValue$32];
                        il.field_f = pf.a("", (byte) 84, "side_power_bar", param1);
                        v.field_c = pf.a("", (byte) 94, "side_power_bar_fill", param1);
                        bq.field_n = pf.a("", (byte) 102, "top_bar_inner", param1);
                        no.field_q = pf.a("", (byte) 115, "top_bar", param1);
                        mf.field_n = pf.a("", (byte) 80, "top_bar_ball_open", param1);
                        hm.field_l = aj.a(0, "", param1, "hud_chat_tab_frame_empty");
                        lb.field_O = aj.a(0, "", param1, "hud_chat_tab_frame");
                        dr.field_d = pf.a("", (byte) 95, "hud_chat_star", param1);
                        var2_int = sa.field_h.b(ua.field_n);
                        ta.field_e = new dd(var2_int, sa.field_h.field_C + sa.field_h.field_w - -1);
                        ta.field_e.e();
                        sa.field_h.d(ua.field_n, 0, sa.field_h.field_C, 16777215, 1);
                        jh.field_e = new dd(dr.field_d.field_z + ta.field_e.field_z - -2, ta.field_e.field_A);
                        jh.field_e.e();
                        sa.field_h.d(ua.field_n, 0, sa.field_h.field_C, 16777215, 1);
                        dr.field_d.c(2 + var2_int, jh.field_e.field_A + -dr.field_d.field_A >> 1);
                        sh.field_P.b(15100);
                        wp.field_a = pf.a("", (byte) 60, "slider", param1);
                        dd discarded$33 = pf.a("", (byte) 35, "flash_foul", param1);
                        dd discarded$34 = pf.a("", (byte) 91, "hud_hbar_inner", param1);
                        gg.field_b = gn.a(aj.a(0, "", param1, "hud_hbar_frame"), (byte) -29);
                        id.field_a = gn.a(aj.a(0, "", param1, "hud_vbar_frame"), (byte) -29);
                        eq.field_Q = aj.a(0, "", param1, "top_bar_frame");
                        iq.field_d = pf.a("", (byte) 73, "icon_break", param1);
                        il.field_a = pf.a("", (byte) 73, "icon_ball_in_hand", param1);
                        dd discarded$35 = pf.a("", (byte) 98, "icon_extra_shot", param1);
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
                            L5: {
                              var21 = nf.field_Z[var4];
                              var21.field_e = 0;
                              var21.field_b = var21.field_g;
                              var21.field_h = var21.field_f;
                              var21.field_d = 0;
                              bi.field_d[var4] = var21.field_b + sa.field_h.field_C - sa.field_h.field_w >> 1;
                              if (op.field_f >= var21.field_g) {
                                break L5;
                              } else {
                                op.field_f = var21.field_g;
                                break L5;
                              }
                            }
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        var27[var5_int] = var5_int;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    ig.a(li.field_f[var2_int], (byte) -12);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                al.field_B[var2_int].a(198123656, param1);
                var2_int++;
                continue L1;
              }
            }
          } else {
            var10 = nn.field_b[var2_int];
            var10.c(-23569, param1);
            var2_int++;
            continue L0;
          }
        }
    }

    private final jg a(int[] param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jg var8 = null;
        gm var9 = null;
        int var10 = 0;
        jg stackIn_2_0 = null;
        Object stackIn_14_0 = null;
        jg stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_15_0 = null;
        Object stackOut_13_0 = null;
        jg stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            var5_int = (param2 >>> 12 | (param2 & -1610608641) << 4) ^ param3;
            var5_int = var5_int | param2 << 16;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
            if (var8 == null) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  if (param0[0] > 0) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              L2: {
                var10 = -125 % ((param1 - 64) / 36);
                var9 = (gm) (Object) ((cf) this).field_e.a(false, var6);
                if (var9 != null) {
                  break L2;
                } else {
                  var9 = gm.a(((cf) this).field_d, param2, param3);
                  if (var9 != null) {
                    ((cf) this).field_e.a((byte) -128, (ma) (Object) var9, var6);
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.a((byte) -117);
                ((cf) this).field_f.a((byte) -128, (ma) (Object) var8, var6);
                stackOut_15_0 = (jg) var8;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                return (jg) (Object) stackIn_14_0;
              }
            } else {
              stackOut_1_0 = (jg) var8;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("cf.A(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_16_0;
    }

    private final jg a(boolean param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jg var8 = null;
        mi var9 = null;
        jg var10 = null;
        jg stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        jg stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        Object stackOut_6_0 = null;
        jg stackOut_16_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var5_int = param2 ^ (param1 >>> 12 | (param1 & 1879052287) << 4);
            var5_int = var5_int | param1 << 16;
            var6 = (long)var5_int;
            var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
            if (var8 != null) {
              stackOut_2_0 = (jg) var8;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3[0] > 0) {
                    break L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (jg) (Object) stackIn_7_0;
                  }
                }
              }
              if (param0) {
                var9 = mi.a(((cf) this).field_h, param1, param2);
                if (var9 != null) {
                  L2: {
                    var10 = var9.b();
                    var8 = var10;
                    ((cf) this).field_f.a((byte) -126, (ma) (Object) var8, var6);
                    if (param3 == null) {
                      break L2;
                    } else {
                      param3[0] = param3[0] - var10.field_n.length;
                      break L2;
                    }
                  }
                  stackOut_16_0 = (jg) var8;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (jg) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var5;
            stackOut_18_1 = new StringBuilder().append("cf.H(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
        return stackIn_17_0;
    }

    final jg a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        Object var5 = null;
        jg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var5 = null;
                jg discarded$2 = ((cf) this).a((String) null, false, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param2, param0, (int[]) null, (byte) 126);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cf.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    private final jg a(String param0, String param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        jg stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var5_int = ((cf) this).field_d.b(param0, -1);
            if (var5_int >= 0) {
              var6 = 0;
              var7 = ((cf) this).field_d.a(var5_int, 0, param1);
              if (var7 >= 0) {
                stackOut_6_0 = this.a(param2, -50, var5_int, var7);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("cf.D(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + 126 + 41);
        }
        return stackIn_7_0;
    }

    final jg a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        jg stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          if (1 == ((cf) this).field_h.f(param2)) {
            stackOut_2_0 = this.a(true, 0, param1, param0);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (1 != ((cf) this).field_h.a(false, param1)) {
              throw new RuntimeException();
            } else {
              stackOut_5_0 = this.a(true, param1, 0, param0);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("cf.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L0;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L0;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 41);
        }
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
        RuntimeException var4 = null;
        Object var5 = null;
        jg stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 120) {
                break L1;
              } else {
                var5 = null;
                jg discarded$2 = ((cf) this).a((String) null, true, (String) null);
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, (byte) 18, (int[]) null, param1);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("cf.G(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3 = af.c((byte) -123, param2);
        int var4 = o.a(param2, (byte) -116);
        int var5 = af.c((byte) -124, param0);
        int var6 = o.a(param0, (byte) -89);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        if (param1) {
            return null;
        }
        int var8 = (int)((long)var3 * (long)var6 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    cf(di param0, di param1) {
        ((cf) this).field_e = new bm(256);
        ((cf) this).field_f = new bm(256);
        try {
            ((cf) this).field_d = param1;
            ((cf) this).field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "cf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final jg b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        jg stackIn_3_0 = null;
        jg stackIn_7_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_2_0 = null;
        jg stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (((cf) this).field_d.f(-1) == 1) {
            stackOut_2_0 = this.a(param0, 127, 0, param2);
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          } else {
            if (((cf) this).field_d.a(false, param2) == 1) {
              stackOut_6_0 = this.a(param0, 3, param2, 0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              L0: {
                if (param1 == 6789) {
                  break L0;
                } else {
                  ((cf) this).field_d = null;
                  break L0;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("cf.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
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
