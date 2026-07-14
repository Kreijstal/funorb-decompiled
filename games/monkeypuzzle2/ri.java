/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static ed[] field_c;
    static String field_d;
    static pj field_b;
    static ad field_a;

    final static ai a(ai param0, boolean param1, int[] param2) {
        if (!param1) {
            field_a = null;
        }
        ai var3 = new ai(0, 0, 0);
        var3.field_d = param0.field_d;
        var3.field_l = param0.field_l;
        var3.field_c = param0.field_c;
        var3.field_i = param0.field_i;
        var3.field_m = param2;
        var3.field_k = param0.field_k;
        var3.field_a = param0.field_a;
        var3.field_n = param0.field_n;
        return var3;
    }

    final static void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var14_float = 0.0f;
        int var15 = 0;
        le var15_ref = null;
        String[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        vk var20 = null;
        int stackIn_3_0 = 0;
        le stackIn_36_0 = null;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        le stackOut_35_0 = null;
        le stackOut_34_0 = null;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        L0: {
          var19 = MonkeyPuzzle2.field_F ? 1 : 0;
          var20 = pl.field_e;
          if (!param2) {
            stackOut_2_0 = kg.field_c;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = fg.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = -1;
          var6 = 410;
          var7 = var20.field_D + var20.field_C + 52;
          ke.field_f[0].e();
          ge.d(3, 3, var6 + -6, -6 + var7, 16249775);
          lb.a(0, var6, (byte) -9, wc.field_e, 0, var7);
          var8 = 0;
          if (param2) {
            var9 = 9;
            L2: while (true) {
              if ((var9 ^ -1) > -1) {
                break L1;
              } else {
                if ((var4 & 1 << var9) == 0) {
                  var8 += 20;
                  var9--;
                  continue L2;
                } else {
                  var9--;
                  continue L2;
                }
              }
            }
          } else {
            break L1;
          }
        }
        var9 = -116 + ei.field_a;
        var10 = p.field_a - 90;
        var11 = 10 + var8;
        var20.a(pi.field_m, var6 >> 709752257, 56, 1, -1);
        var12 = 10;
        var13 = 0;
        L3: while (true) {
          if (rb.field_hb.length <= var13) {
            L4: {
              ke.field_f[2].e();
              ge.d(3, 3, 172, 184, 16249775);
              lb.a(0, 178, (byte) 112, wc.field_e, 0, 190);
              ke.field_f[1].e();
              ge.d(3, 3, 215, 184, 16249775);
              lb.a(0, 221, (byte) -119, wc.field_e, 0, 190);
              if (-1 < (ee.field_F ^ -1)) {
                break L4;
              } else {
                var5 = ee.field_F;
                break L4;
              }
            }
            L5: {
              if ((var5 ^ -1) > -1) {
                if (!ok.a(false)) {
                  break L5;
                } else {
                  int discarded$1 = sb.field_r.a(el.field_c, 20, 15, -40 + ke.field_f[1].field_k, ke.field_f[1].field_j - 40, 9330743, -1, 1, 1, 0);
                  break L5;
                }
              } else {
                L6: {
                  var13 = var20.field_D + var20.field_C;
                  var14 = 10 + var13;
                  var20.a(rb.field_hb[var5], 110, var14, 1, 6776679);
                  var14 = var14 + var13;
                  if (-1 == (1 << var5 & var4 ^ -1)) {
                    stackOut_53_0 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    break L6;
                  } else {
                    stackOut_52_0 = 1;
                    stackIn_54_0 = stackOut_52_0;
                    break L6;
                  }
                }
                L7: {
                  var15 = stackIn_54_0;
                  if (var15 != 0) {
                    var20.a(vj.field_e, 110, var14, 1, 16343907);
                    break L7;
                  } else {
                    var20.a(uf.field_e, 110, var14, 16711681, 16343907);
                    break L7;
                  }
                }
                var14 = var14 + var13;
                var16 = new String[16];
                var17 = var20.a(ki.field_r[var5], new int[1], var16);
                var18 = 0;
                L8: while (true) {
                  if (var18 >= var17) {
                    var12 = 135;
                    var20.b(a.field_c, 15, var12, 1, -1);
                    var12 = var12 - var13;
                    var20.b(wk.field_c + ve.field_y[var5], 15, var12, 1, -1);
                    var18 = 0;
                    L9: while (true) {
                      if (f.field_j[var5] <= var18) {
                        ke.field_f[2].e();
                        if (var15 == 0) {
                          ka.field_b.c(25, 25);
                          break L5;
                        } else {
                          ie.field_b[var5].c(25, 25);
                          break L5;
                        }
                      } else {
                        aj.field_e.b(15 * var18 + 15, 143);
                        var18++;
                        continue L9;
                      }
                    }
                  } else {
                    var20.b(var16[var18], 15, var14, 1, -1);
                    var14 = var14 + var13;
                    var18++;
                    continue L8;
                  }
                }
              }
            }
            L10: {
              ac.field_a.a((byte) 109);
              var13 = param1 * var7 / 20;
              if (var13 > var7) {
                var13 = var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0 <= -90) {
                break L11;
              } else {
                field_d = null;
                break L11;
              }
            }
            L12: {
              var14 = var7 + -var13 >> -417426271;
              ke.field_f[0].b(116, 90 - -var14, var6, var13);
              var13 = param1 * 190 / 20;
              if (var13 > 190) {
                var13 = 190;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var14 = 190 - var13 >> -301491551;
              ke.field_f[1].b(116, 170 + var14, 221, var13);
              var13 = 190 * param1 / 20;
              if ((var13 ^ -1) >= -191) {
                break L13;
              } else {
                var13 = 190;
                break L13;
              }
            }
            var14 = 190 + -var13 >> -163751359;
            ke.field_f[2].b(348, 170 + var14, 178, var13);
            return;
          } else {
            L14: {
              L15: {
                if (0 == (1 << var13 & var4)) {
                  break L15;
                } else {
                  if (ee.field_F == var13) {
                    break L15;
                  } else {
                    ie.field_b[var13].b(var11, var12);
                    break L14;
                  }
                }
              }
              L16: {
                if (!param2) {
                  break L16;
                } else {
                  if (0 == (var4 & 1 << var13)) {
                    if (ee.field_F == var13) {
                      ee.field_F = -1;
                      var13++;
                      continue L3;
                    } else {
                      var13++;
                      continue L3;
                    }
                  } else {
                    break L16;
                  }
                }
              }
              if (var13 == ee.field_F) {
                break L14;
              } else {
                ka.field_b.b(var11, var12);
                break L14;
              }
            }
            L17: {
              if (var13 == ee.field_F) {
                break L17;
              } else {
                if (var9 >= var11) {
                  if (var9 <= var11 + 32) {
                    if (var12 <= var10) {
                      if (var12 - -32 >= var10) {
                        break L17;
                      } else {
                        var11 += 40;
                        var13++;
                        continue L3;
                      }
                    } else {
                      var11 += 40;
                      var13++;
                      continue L3;
                    }
                  } else {
                    var11 += 40;
                    var13++;
                    continue L3;
                  }
                } else {
                  var11 += 40;
                  var13++;
                  continue L3;
                }
              }
            }
            L18: {
              ge.h(0, 6, var6, var7 + -6);
              var14_float = ia.a(true, (float)jk.field_B * 0.10000000149011612f);
              if ((var4 & 1 << var13) == 0) {
                stackOut_35_0 = ka.field_b;
                stackIn_36_0 = stackOut_35_0;
                break L18;
              } else {
                stackOut_34_0 = ie.field_b[var13];
                stackIn_36_0 = stackOut_34_0;
                break L18;
              }
            }
            L19: {
              var15_ref = stackIn_36_0;
              var16_int = (int)((float)(var15_ref.field_k >> -2088918270) + 6.0f * var14_float + 6.0f);
              if (var11 > var9) {
                break L19;
              } else {
                if (var11 + 32 < var9) {
                  break L19;
                } else {
                  if (var12 > var10) {
                    break L19;
                  } else {
                    if (var12 - -32 >= var10) {
                      var16_int = 38;
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
            }
            L20: {
              if (-1 == (1 & var16_int ^ -1)) {
                stackOut_44_0 = 1;
                stackIn_45_0 = stackOut_44_0;
                break L20;
              } else {
                stackOut_43_0 = 0;
                stackIn_45_0 = stackOut_43_0;
                break L20;
              }
            }
            var17 = stackIn_45_0 + (1 + (var15_ref.field_k >> -1150097373) + -(var16_int / 2));
            var15_ref.d(var11 + var17, var17 + var12, var16_int, var16_int);
            var15_ref.b(var17 + var11, var17 + var12, var16_int, var16_int, (int)(40.0f * var14_float) - -40);
            if (ee.field_F != var13) {
              var5 = var13;
              var11 += 40;
              var13++;
              continue L3;
            } else {
              var11 += 40;
              var13++;
              continue L3;
            }
          }
        }
    }

    final static void a(ad param0, int param1, ad param2, ad param3) {
        String[] var4 = null;
        int var5 = 0;
        td var6 = null;
        int var7 = 0;
        String[] var8 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        ii.field_D = new o(22050, va.field_i);
        wd.field_i = new ud(param2, param3);
        je.field_i = dc.a(2570, "music/Monkey Puzzle Panic", "", wd.field_i, param0);
        uh.field_e = dc.a(2570, "music/Monkey Puzzle TitleScreen", "", wd.field_i, param0);
        ah.field_g[0] = dc.a(2570, "music/Monkey Puzzle countryside", "", wd.field_i, param0);
        ah.field_g[1] = dc.a(2570, "music/Monkey Puzzle jungle", "", wd.field_i, param0);
        ah.field_g[2] = dc.a(2570, "music/Monkey Puzzle water", "", wd.field_i, param0);
        ah.field_g[3] = dc.a(2570, "music/Monkey Puzzle aztec", "", wd.field_i, param0);
        kb.field_d = dc.a(2570, "music/monkey_puzzle_level_complete_jingle", "", wd.field_i, param0);
        bl.field_g = dc.a(2570, "music/Monkey_Puzzle_game_over_Jingle", "", wd.field_i, param0);
        b.field_l = dc.a(param1 ^ 2570, "music/Monkey_Puzzle_world_Complete_Jingle", "", wd.field_i, param0);
        wf.field_h = dc.a(2570, "music/Monkey_Puzzle_Game_Complete_Jingle", "", wd.field_i, param0);
        var8 = new String[]{"menu_select", "MP_throw_coconut", "MP_deflect3", "MP_deflect_ceiling", "MP_monkeyhit", "MP_coconut_hit", "MP_coconut_fall", "MP_monkeyfall", "MP_splash_2", "MP_splash_3", "MP_splash_4", "MP_splash_5", "MP_intro_screen_appear", "MP_intro_screen_close", "MP_intro_screen_monkey_fall", "MP_intro_screen_rain", "MP_intro_screen_ambience_1", "MP_intro_screen_ambience_2", "MP_lvl_end_vine", "MP_lvl_end_climb", "MP_monkey_amb1", "MP_monkey_amb2", "MP_monkey_amb3", "MP_monkey_amb4", "MP_monkey_amb5", "MP_monkey_laugh1", "MP_monkey_laugh2", "MP_monkey_laugh3", "MP_lvl_end_climb_step1", "MP_lvl_end_climb_step2", "MP_lvl_end_climb_step3", "mp_level_complete"};
        var4 = var8;
        var5 = param1;
        L0: while (true) {
          if (var5 >= 32) {
            wd.field_i = null;
            ii.field_D = null;
            return;
          } else {
            L1: {
              var6 = wd.field_i.a(var8[var5], (byte) -77);
              if (var6 != null) {
                break L1;
              } else {
                System.out.println(var8[var5]);
                break L1;
              }
            }
            ke.field_h[var5] = var6.a(ii.field_D);
            var5++;
            continue L0;
          }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -66) {
            Object var2 = null;
            ri.a((ad) null, 38, (ad) null, (ad) null);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Type your age in years";
        field_b = new pj();
    }
}
