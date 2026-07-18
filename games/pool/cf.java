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
        Object stackIn_8_0 = null;
        jg stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                stackOut_9_0 = this.a(true, var5_int, var6, param2);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                return (jg) (Object) stackIn_8_0;
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
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("cf.J(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          L4: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_g = null;
              if (param0 == 28746) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            field_i = null;
            field_c = null;
            field_j = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "cf.C(" + param0 + ')');
        }
    }

    final static void a(int param0, di param1) {
        int var2_int = 0;
        qb var2 = null;
        oo var3 = null;
        int[] var3_array = null;
        dd[] var3_array2 = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        qb var5_ref = null;
        int[] var6 = null;
        int[] var7 = null;
        dd var8 = null;
        int var9 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_31_0 = 0;
        var9 = Pool.field_O;
        var2_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (~var2_int <= ~nn.field_b.length) {
                break L2;
              } else {
                var3 = nn.field_b[var2_int];
                var3.c(-23569, param1);
                var2_int++;
                if (var9 != 0) {
                  break L1;
                } else {
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var2_int = 0;
            break L1;
          }
          L3: while (true) {
            L4: {
              L5: {
                if (~al.field_B.length >= ~var2_int) {
                  break L5;
                } else {
                  al.field_B[var2_int].a(198123656, param1);
                  var2_int++;
                  if (var9 != 0) {
                    break L4;
                  } else {
                    if (var9 == 0) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
              }
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
              break L4;
            }
            var2_int = 0;
            L6: while (true) {
              L7: {
                L8: {
                  if (~li.field_f.length >= ~var2_int) {
                    break L8;
                  } else {
                    ig.a(li.field_f[var2_int], (byte) -12);
                    var2_int++;
                    if (var9 != 0) {
                      break L7;
                    } else {
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                te.field_n = lb.a(param1, 99, "", "achievement_highlight_hover");
                td.field_g = lb.a(param1, 109, "", "achievement_highlight_selected");
                cl.field_m = lb.a(param1, -10, "", "title_pool_logo_withalpha");
                break L7;
              }
              var2 = tl.a(param1, 3812, "gradient_arrow_left", "");
              var3_array = var2.field_i;
              var4_ref_int__ = new int[var3_array.length];
              var5_int = 0;
              L9: while (true) {
                L10: {
                  L11: {
                    if (~var5_int <= ~var3_array.length) {
                      break L11;
                    } else {
                      var4_ref_int__[var5_int] = var5_int;
                      var5_int++;
                      if (var9 != 0) {
                        break L10;
                      } else {
                        if (var9 == 0) {
                          continue L9;
                        } else {
                          break L11;
                        }
                      }
                    }
                  }
                  fd.a(var3_array, var4_ref_int__, (byte) -54);
                  break L10;
                }
                var5 = dn.a(var4_ref_int__, (byte) 117, ta.a(new int[4], param0 ^ -126));
                var6 = dn.a(var4_ref_int__, (byte) 10, ta.a(new int[4], 18));
                var7 = dn.a(var4_ref_int__, (byte) 7, ta.a(new int[4], param0 ^ 70));
                var2.field_i = var5;
                dd dupTemp$18 = ii.a(2, var2);
                hp.field_b = dupTemp$18;
                var8 = dupTemp$18;
                var8.field_B = 0;
                var8.field_w = var8.field_z;
                var8.field_y = var8.field_A;
                var8.field_G = 0;
                var2.field_i = var6;
                dd dupTemp$19 = ii.a(2, var2);
                eh.field_y = dupTemp$19;
                var8 = dupTemp$19;
                var8.field_w = var8.field_z;
                var8.field_y = var8.field_A;
                var8.field_G = 0;
                var8.field_B = 0;
                var2.field_i = var7;
                dd dupTemp$20 = ii.a(param0 + 2, var2);
                gj.field_T = dupTemp$20;
                var8 = dupTemp$20;
                var8.field_G = 0;
                var8.field_B = 0;
                var8.field_w = var8.field_z;
                var8.field_y = var8.field_A;
                var2.a();
                var2.field_i = var5;
                dd dupTemp$21 = ii.a(2, var2);
                bf.field_h = dupTemp$21;
                var8 = dupTemp$21;
                var8.field_G = 0;
                var8.field_w = var8.field_z;
                var8.field_y = var8.field_A;
                var8.field_B = 0;
                var2.field_i = var6;
                dd dupTemp$22 = ii.a(2, var2);
                wf.field_a = dupTemp$22;
                var8 = dupTemp$22;
                var8.field_w = var8.field_z;
                var8.field_G = param0;
                var8.field_y = var8.field_A;
                var8.field_B = 0;
                var2.field_i = var7;
                dd dupTemp$23 = ii.a(2, var2);
                ag.field_b = dupTemp$23;
                var8 = dupTemp$23;
                var8.field_y = var8.field_A;
                var8.field_B = 0;
                var8.field_G = 0;
                var8.field_w = var8.field_z;
                var2_int = 0;
                var3_array2 = ep.a(106, param1, "titles", "");
                int incrementValue$24 = var2_int;
                var2_int++;
                mq.field_a = var3_array2[incrementValue$24];
                int incrementValue$25 = var2_int;
                var2_int++;
                ao.field_Pb = var3_array2[incrementValue$25];
                int incrementValue$26 = var2_int;
                var2_int++;
                em.field_M = var3_array2[incrementValue$26];
                int incrementValue$27 = var2_int;
                var2_int++;
                df.field_i = var3_array2[incrementValue$27];
                int incrementValue$28 = var2_int;
                var2_int++;
                db.field_Wb = var3_array2[incrementValue$28];
                int incrementValue$29 = var2_int;
                var2_int++;
                im.field_Lb = var3_array2[incrementValue$29];
                int incrementValue$30 = var2_int;
                var2_int++;
                lk.field_w = var3_array2[incrementValue$30];
                int incrementValue$31 = var2_int;
                var2_int++;
                mc.field_k = var3_array2[incrementValue$31];
                int incrementValue$32 = var2_int;
                var2_int++;
                lq.field_Q = var3_array2[incrementValue$32];
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
                dr.field_d.c(2 + var2_int, jh.field_e.field_A + -dr.field_d.field_A >> -259199039);
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
                var3_array2 = aj.a(0, "", param1, "tutorial_text_box");
                ff.field_e = new dd[]{new dd(0, var3_array2[0].field_y), var3_array2[0], new dd(0, var3_array2[0].field_y), new dd(0, var3_array2[1].field_y), var3_array2[1], new dd(0, var3_array2[1].field_y), new dd(0, var3_array2[2].field_y), var3_array2[2], new dd(0, var3_array2[2].field_y)};
                dq.field_e = aj.a(0, "", param1, "playerlist_button");
                vm.field_d = aj.a(0, "", param1, "tutorial_controls");
                qg.field_b = pf.a("", (byte) 52, "tutorial_box_progress", param1);
                nf.field_Z = gr.a(param1, "", -24155, "controls");
                bi.field_d = new int[nf.field_Z.length];
                op.field_f = 0;
                var4 = 0;
                L12: while (true) {
                  L13: {
                    L14: {
                      if (nf.field_Z.length <= var4) {
                        break L14;
                      } else {
                        var5_ref = nf.field_Z[var4];
                        var5_ref.field_e = 0;
                        var5_ref.field_b = var5_ref.field_g;
                        var5_ref.field_h = var5_ref.field_f;
                        var5_ref.field_d = 0;
                        bi.field_d[var4] = var5_ref.field_b + sa.field_h.field_C - sa.field_h.field_w >> -2054542079;
                        stackOut_26_0 = ~op.field_f;
                        stackIn_32_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var9 != 0) {
                          break L13;
                        } else {
                          L15: {
                            if (stackIn_27_0 <= ~var5_ref.field_g) {
                              break L15;
                            } else {
                              op.field_f = var5_ref.field_g;
                              break L15;
                            }
                          }
                          var4++;
                          if (var9 == 0) {
                            continue L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = 17;
                    stackIn_32_0 = stackOut_31_0;
                    break L13;
                  }
                  bc.b((byte) stackIn_32_0);
                  return;
                }
              }
            }
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
        Object stackIn_10_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        jg stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        Object stackOut_15_0 = null;
        jg stackOut_21_0 = null;
        Object stackOut_19_0 = null;
        jg stackOut_1_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var5_int = (param2 >>> -1053435508 | (param2 & -1610608641) << -851484508) ^ param3;
            var5_int = var5_int | param2 << 1103719952;
            var6 = 4294967296L ^ (long)var5_int;
            var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
            if (null == var8) {
              L1: {
                if (null == param0) {
                  break L1;
                } else {
                  if (param0[0] <= 0) {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (jg) (Object) stackIn_10_0;
                  } else {
                    break L1;
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
                  if (var9 == null) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (jg) (Object) stackIn_16_0;
                  } else {
                    ((cf) this).field_e.a((byte) -128, (ma) (Object) var9, var6);
                    break L2;
                  }
                }
              }
              var8 = var9.a(param0);
              if (var8 != null) {
                var9.a((byte) -117);
                ((cf) this).field_f.a((byte) -128, (ma) (Object) var8, var6);
                stackOut_21_0 = (jg) var8;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                stackOut_19_0 = null;
                stackIn_20_0 = stackOut_19_0;
                return (jg) (Object) stackIn_20_0;
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
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("cf.A(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_22_0;
    }

    private final jg a(boolean param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        jg var8 = null;
        mi var9 = null;
        jg stackIn_4_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_18_0 = null;
        jg stackIn_23_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_17_0 = null;
        jg stackOut_22_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            var5_int = param2 ^ (param1 >>> 896304684 | (param1 & 1879052287) << -1757520124);
            var5_int = var5_int | param1 << 1878849616;
            var6 = (long)var5_int;
            var8 = (jg) (Object) ((cf) this).field_f.a(false, var6);
            if (null != var8) {
              stackOut_3_0 = (jg) var8;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param3 == null) {
                  break L1;
                } else {
                  if (param3[0] > 0) {
                    break L1;
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    return (jg) (Object) stackIn_10_0;
                  }
                }
              }
              if (param0) {
                var9 = mi.a(((cf) this).field_h, param1, param2);
                if (var9 == null) {
                  stackOut_17_0 = null;
                  stackIn_18_0 = stackOut_17_0;
                  return (jg) (Object) stackIn_18_0;
                } else {
                  L2: {
                    var8 = var9.b();
                    ((cf) this).field_f.a((byte) -126, (ma) (Object) var8, var6);
                    if (null == param3) {
                      break L2;
                    } else {
                      param3[0] = param3[0] - var8.field_n.length;
                      break L2;
                    }
                  }
                  stackOut_22_0 = (jg) var8;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                }
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (jg) (Object) stackIn_13_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5;
            stackOut_24_1 = new StringBuilder().append("cf.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
        return stackIn_23_0;
    }

    final jg a(String param0, boolean param1, String param2) {
        RuntimeException var4 = null;
        jg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                jg discarded$2 = ((cf) this).a((String) null, false, (String) null);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param2, param0, (int[]) null, (byte) 126);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cf.E(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    private final jg a(String param0, String param1, int[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        jg stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        jg stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var5_int = ((cf) this).field_d.b(param0, -1);
            if (var5_int < 0) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (jg) (Object) stackIn_4_0;
            } else {
              var6 = -114 % ((4 - param3) / 60);
              var7 = ((cf) this).field_d.a(var5_int, 0, param1);
              if (var7 < 0) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (jg) (Object) stackIn_9_0;
              } else {
                stackOut_10_0 = this.a(param2, -50, var5_int, var7);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("cf.D(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          L3: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param3 + ')');
        }
        return stackIn_11_0;
    }

    final jg a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        jg stackIn_4_0 = null;
        jg stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        jg stackOut_6_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          if (1 == ((cf) this).field_h.f(param2)) {
            stackOut_3_0 = this.a(true, 0, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (1 != ((cf) this).field_h.a(false, param1)) {
              throw new RuntimeException();
            } else {
              stackOut_6_0 = this.a(true, param1, 0, param0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("cf.B(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L0;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L0;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, long param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0L >= param1) {
              return;
            } else {
              L1: {
                if (param0 < -77) {
                  break L1;
                } else {
                  field_i = null;
                  break L1;
                }
              }
              L2: {
                if (0L != param1 % 10L) {
                  uq.a(param1, (byte) 104);
                  break L2;
                } else {
                  uq.a(param1 - 1L, (byte) 104);
                  uq.a(1L, (byte) 104);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "cf.F(" + param0 + ',' + param1 + ')');
        }
    }

    final jg a(String param0, String param1, byte param2) {
        RuntimeException var4 = null;
        jg stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param2 > 120) {
                break L1;
              } else {
                jg discarded$2 = ((cf) this).a((String) null, true, (String) null);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, (byte) 18, (int[]) null, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cf.G(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final static int[] a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3_int = af.c((byte) -123, param2);
            var4 = o.a(param2, (byte) -116);
            var5 = af.c((byte) -124, param0);
            var6 = o.a(param0, (byte) -89);
            var7 = (int)((long)var5 * (long)var3_int >> 591987472);
            if (!param1) {
              var8 = (int)((long)var3_int * (long)var6 >> 1299981200);
              var9 = (int)((long)var5 * (long)var4 >> 1489184272);
              var10 = (int)((long)var6 * (long)var4 >> -1262352432);
              stackOut_3_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (int[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "cf.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    cf(di param0, di param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((cf) this).field_e = new bm(256);
        ((cf) this).field_f = new bm(256);
        try {
          L0: {
            ((cf) this).field_d = param1;
            ((cf) this).field_h = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("cf.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final jg b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        jg stackIn_4_0 = null;
        jg stackIn_9_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        jg stackOut_3_0 = null;
        jg stackOut_8_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          if (((cf) this).field_d.f(-1) == 1) {
            stackOut_3_0 = this.a(param0, 127, 0, param2);
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (((cf) this).field_d.a(false, param2) == 1) {
              stackOut_8_0 = this.a(param0, 3, param2, 0);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
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
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("cf.I(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
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
