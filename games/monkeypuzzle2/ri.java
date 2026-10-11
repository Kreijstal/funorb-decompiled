/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static ed[] field_c;
    static String field_d;
    static pj field_b;
    static ad field_a;

    final static ai a(ai param0, boolean param1, int[] param2) {
        ai var3 = null;
        RuntimeException var3_ref = null;
        ai stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_a = (ad) null;
          }
          var3 = new ai(0, 0, 0);
          var3.field_d = param0.field_d;
          var3.field_l = param0.field_l;
          var3.field_c = param0.field_c;
          var3.field_i = param0.field_i;
          var3.field_m = param2;
          var3.field_k = param0.field_k;
          var3.field_a = param0.field_a;
          var3.field_n = param0.field_n;
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ri.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(byte param0, int param1, boolean param2) {
        int stackIn_4_0 = 0;
        le stackIn_34_0 = null;
        int stackIn_43_0 = 0;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
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
        le var15_ref_le = null;
        String[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        vk var20 = null;
        int var9Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        int var13Lifetime3;
        int var13Lifetime4;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var17Lifetime1;
        int var18Lifetime1;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var20 = pl.field_e;
          if (!param2) {
            stackIn_4_0 = kg.field_c;
          } else {
            stackIn_4_0 = fg.field_b;
          }
          var4 = stackIn_4_0;
          var5 = -1;
          var6 = 410;
          var7 = var20.field_D + var20.field_C + 52;
          ke.field_f[0].e();
          ge.d(3, 3, var6 - 6, -6 + var7, 16249775);
          lb.a(0, var6, (byte) -9, wc.field_e, 0, var7);
          var8 = 0;
          if (param2) {
            for (var9 = 9; var9 >= 0; var9--) {
              if ((var4 & 1 << var9) == 0) {
                var8 += 20;
              }
            }
          }
          var9Lifetime1 = -116 + ei.field_a;
          var10 = p.field_a - 90;
          var11 = 10 + var8;
          var20.a(pi.field_m, var6 >> 1, 56, 1, -1);
          var12 = 10;
          for (var13 = 0; rb.field_hb.length > var13; var13++) {
            boolean decompiledFrameRemainder0 = true;
            if (0 != (1 << var13 & var4) &&
              ee.field_F != var13) {
              ie.field_b[var13].b(var11, var12);
            } else {
              if (param2 &&
                0 == (var4 & 1 << var13)) {
                if ((ee.field_F == var13)) {
                  ee.field_F = -1;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var13 != ee.field_F) {
                  ka.field_b.b(var11, var12);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (var13 == ee.field_F ||
                var9Lifetime1 >= var11 &&
                var9Lifetime1 <= var11 + 32 &&
                var12 <= var10 &&
                var12 + 32 >= var10) {
                ge.h(0, 6, var6, var7 - 6);
                var14_float = ia.a(true, (float)jk.field_B * 0.10000000149011612f);
                if ((var4 & 1 << var13) == 0) {
                  stackIn_34_0 = ka.field_b;
                } else {
                  stackIn_34_0 = ie.field_b[var13];
                }
                var15_ref_le = stackIn_34_0;
                var16_int = (int)((float)(var15_ref_le.field_k >> 2) + 6.0f * var14_float + 6.0f);
                if (var11 <= var9Lifetime1 &&
                  var11 + 32 >= var9Lifetime1 &&
                  var12 <= var10 &&
                  var12 + 32 >= var10) {
                  var16_int = 38;
                }
                stackIn_43_0 = ((1 & var16_int) == 0) ? 1 : 0;
                var17 = stackIn_43_0 + (1 + (var15_ref_le.field_k >> 3) - var16_int / 2);
                var15_ref_le.d(var11 + var17, var17 + var12, var16_int, var16_int);
                var15_ref_le.b(var17 + var11, var17 + var12, var16_int, var16_int, (int)(40.0f * var14_float) + 40);
                if (ee.field_F != var13) {
                  var5 = var13;
                }
              }
              var11 += 40;
            }
          }
          ke.field_f[2].e();
          ge.d(3, 3, 172, 184, 16249775);
          lb.a(0, 178, (byte) 112, wc.field_e, 0, 190);
          ke.field_f[1].e();
          ge.d(3, 3, 215, 184, 16249775);
          lb.a(0, 221, (byte) -119, wc.field_e, 0, 190);
          if (ee.field_F >= 0) {
            var5 = ee.field_F;
          }
          if (var5 >= 0) {
            var13Lifetime1 = var20.field_D + var20.field_C;
            var14 = 10 + var13Lifetime1;
            var20.a(rb.field_hb[var5], 110, var14, 1, 6776679);
            var14 = var14 + var13Lifetime1;
            stackIn_54_0 = ((1 << var5 & var4) == 0) ? 0 : 1;
            var15 = stackIn_54_0;
            if (var15 != 0) {
              var20.a(vj.field_e, 110, var14, 1, 16343907);
            } else {
              var20.a(uf.field_e, 110, var14, 16711681, 16343907);
            }
            var14 = var14 + var13Lifetime1;
            var16 = new String[16];
            var17Lifetime1 = var20.a(ki.field_r[var5], new int[]{191}, var16);
            for (var18 = 0; var18 < var17Lifetime1; var18++) {
              var20.b(var16[var18], 15, var14, 1, -1);
              var14 = var14 + var13Lifetime1;
            }
            var12Lifetime1 = 135;
            var20.b(a.field_c, 15, var12Lifetime1, 1, -1);
            var12Lifetime1 = var12Lifetime1 - var13Lifetime1;
            var20.b(wk.field_c + ve.field_y[var5], 15, var12Lifetime1, 1, -1);
            for (var18Lifetime1 = 0; f.field_j[var5] > var18Lifetime1; var18Lifetime1++) {
              aj.field_e.b(15 * var18Lifetime1 + 15, 143);
            }
            ke.field_f[2].e();
            if (var15 == 0) {
              ka.field_b.c(25, 25);
            } else {
              ie.field_b[var5].c(25, 25);
            }
          } else {
            if (ok.a(false)) {
              sb.field_r.a(el.field_c, 20, 15, -40 + ke.field_f[1].field_k, ke.field_f[1].field_j - 40, 9330743, -1, 1, 1, 0);
            }
          }
          ac.field_a.a((byte) 109);
          var13Lifetime2 = param1 * var7 / 20;
          if (var13Lifetime2 > var7) {
            var13Lifetime2 = var7;
          }
          if (param0 > -90) {
            field_d = (String) null;
          }
          var14Lifetime1 = var7 - var13Lifetime2 >> 1;
          ke.field_f[0].b(116, 90 + var14Lifetime1, var6, var13Lifetime2);
          var13Lifetime3 = param1 * 190 / 20;
          if (var13Lifetime3 > 190) {
            var13Lifetime3 = 190;
          }
          var14Lifetime2 = 190 - var13Lifetime3 >> 1;
          ke.field_f[1].b(116, 170 + var14Lifetime2, 221, var13Lifetime3);
          var13Lifetime4 = 190 * param1 / 20;
          if (var13Lifetime4 > 190) {
            var13Lifetime4 = 190;
          }
          var14Lifetime3 = 190 - var13Lifetime4 >> 1;
          ke.field_f[2].b(348, 170 + var14Lifetime3, 178, var13Lifetime4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "ri.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(ad param0, int param1, ad param2, ad param3) {
        String[] var8 = null;
        int var5 = 0;
        td var6 = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
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
          String[] var4 = var8;
          for (var5 = param1; var5 < 32; var5++) {
            var6 = wd.field_i.a(var8[var5], (byte) -77);
            if (var6 == null) {
              System.out.println(var8[var5]);
            }
            ke.field_h[var5] = var6.a(ii.field_D);
          }
          wd.field_i = null;
          ii.field_D = null;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ri.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_c = null;
        if (param0 != -66) {
          ad var2 = (ad) null;
          ri.a((ad) null, 38, (ad) null, (ad) null);
        }
        field_a = null;
    }

    static {
        field_d = "Type your age in years";
        field_b = new pj();
    }
}
