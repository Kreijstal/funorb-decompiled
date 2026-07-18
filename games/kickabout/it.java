/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class it extends mo {
    boolean field_l;
    int[] field_o;
    static ji field_m;
    int field_p;
    int field_f;
    int field_h;
    int field_k;
    int field_g;
    private int field_j;
    static boolean field_n;
    boolean field_i;

    final void a(byte param0, mo param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        it var6 = (it) (Object) param1;
        it var3 = var6;
        if (param0 >= -52) {
            return;
        }
        try {
            ((it) this).field_k = var3.field_k;
            ((it) this).field_p = var3.field_p;
            ((it) this).field_l = var3.field_l;
            ((it) this).field_g = var3.field_g;
            for (var4 = 0; var4 < ((it) this).field_o.length; var4++) {
                ((it) this).field_o[var4] = var6.field_o[var4];
            }
            ((it) this).field_h = var3.field_h;
            ((it) this).field_i = var3.field_i;
            ((it) this).field_f = var3.field_f;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "it.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(rj param0, sj param1) {
        RuntimeException var3 = null;
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
            bq.field_a = param0;
            sr.field_h = param1;
            vg.field_Db[44] = new nb(bq.field_a.a("", true, "KaB_menu_btn"));
            vg.field_Db[45] = new nb(bq.field_a.a("", true, "KaB_menu_tab_btn"));
            vg.field_Db[46] = new nb(bq.field_a.a("", true, "KaB_save_and_exit_btn"));
            vg.field_Db[47] = new nb(bq.field_a.a("", true, "KaB_back_and_exit"));
            sk.a(-111, 100, 25);
            vg.field_Db[48] = new nb(bq.field_a.a("", true, "KaB_menu_select_btn"));
            vg.field_Db[49] = new nb(bq.field_a.a("", true, "KaB_complete_purchase_btn"));
            vg.field_Db[50] = new nb(bq.field_a.a("", true, "KaB_attach_powerup"));
            vg.field_Db[51] = new nb(bq.field_a.a("", true, "KaB_profile_expand_btn"));
            sk.a(-100, 100, 50);
            vg.field_Db[52] = new nb(bq.field_a.a("", true, "KaB_profile_collapse_btn"));
            vg.field_Db[53] = new nb(bq.field_a.a("", true, "KaB_warning_error_msg"));
            vg.field_Db[54] = new nb(bq.field_a.a("", true, "KaB_mouse_over"));
            vg.field_Db[55] = new nb(bq.field_a.a("", true, "KaB_menu_slide_left"));
            vg.field_Db[56] = new nb(bq.field_a.a("", true, "KaB_menu_slide_right"));
            vg.field_Db[57] = new nb(bq.field_a.a("", true, "KaB_profile_expand_all_btn"));
            sk.a(-118, 100, 75);
            vg.field_Db[58] = new nb(bq.field_a.a("", true, "KaB_profile_collapse_all_btn"));
            vg.field_Db[59] = new nb(bq.field_a.a("", true, "KaB_scroll_left_btn"));
            vg.field_Db[60] = new nb(bq.field_a.a("", true, "KaB_scroll_right_btn"));
            vg.field_Db[61] = new nb(bq.field_a.a("", true, "KaB_toggle_checkbox"));
            vg.field_Db[43] = new nb(0, 43, "KaB_crowd_win_cheer_lvl4");
            vg.field_Db[33] = new nb(0, 33, "KaB_whistle_blow_fulltime_ALL");
            vg.field_Db[34] = new nb(0, 34, "KaB_whistle_blow_kickoff_ALL");
            vg.field_Db[37] = new nb(0, 37, "KaB_kick_ball_HARD");
            vg.field_Db[36] = new nb(0, 36, "KaB_kick_ball_MED");
            vg.field_Db[35] = new nb(0, 35, "KaB_kick_ball_SOFT");
            vg.field_Db[41] = new nb(0, 41, "KaB_ball_hit_stand_ALL");
            vg.field_Db[0] = new nb(2, 0, "KaB_ball_bounce_PARK");
            vg.field_Db[74] = new nb(2, 74, "KaB_footstep_park_SOFT_I");
            vg.field_Db[75] = new nb(2, 75, "KaB_footstep_park_SOFT_II");
            vg.field_Db[76] = new nb(2, 76, "KaB_footstep_park_MED_I");
            vg.field_Db[77] = new nb(2, 77, "KaB_footstep_park_MED_II");
            vg.field_Db[78] = new nb(2, 78, "KaB_footstep_park_HARD_I");
            vg.field_Db[79] = new nb(2, 79, "KaB_footstep_park_HARD_II");
            vg.field_Db[84] = new nb(2, 84, "KaB_slide_tackle_park_part_I");
            vg.field_Db[85] = new nb(2, 85, "KaB_slide_tackle_park_part_II");
            vg.field_Db[88] = new nb(2, 88, "KaB_fall_over_park_impact");
            vg.field_Db[1] = new nb(3, 1, "KaB_ball_bounce_BEACH");
            vg.field_Db[68] = new nb(3, 68, "KaB_footstep_beach_SOFT_I");
            vg.field_Db[69] = new nb(3, 69, "KaB_footstep_beach_SOFT_II");
            vg.field_Db[70] = new nb(3, 70, "KaB_footstep_beach_MED_I");
            vg.field_Db[71] = new nb(3, 71, "KaB_footstep_beach_MED_II");
            vg.field_Db[72] = new nb(3, 72, "KaB_footstep_beach_HARD_I");
            vg.field_Db[73] = new nb(3, 73, "KaB_footstep_beach_HARD_II");
            vg.field_Db[82] = new nb(3, 82, "KaB_slide_tackle_beach_part_I");
            vg.field_Db[83] = new nb(3, 83, "KaB_slide_tackle_beach_part_II");
            vg.field_Db[87] = new nb(3, 87, "KaB_fall_over_beach_impact");
            vg.field_Db[2] = new nb(4, 2, "KaB_ball_bounce_STREET");
            vg.field_Db[62] = new nb(4, 62, "KaB_footstep_street_SOFT_I");
            vg.field_Db[63] = new nb(4, 63, "KaB_footstep_street_SOFT_II");
            vg.field_Db[64] = new nb(4, 64, "KaB_footstep_street_MED_I");
            vg.field_Db[65] = new nb(4, 65, "KaB_footstep_street_MED_II");
            vg.field_Db[66] = new nb(4, 66, "KaB_footstep_street_HARD_I");
            vg.field_Db[67] = new nb(4, 67, "KaB_footstep_street_HARD_II");
            vg.field_Db[80] = new nb(4, 80, "KaB_slide_tackle_street_part_I");
            vg.field_Db[81] = new nb(4, 81, "KaB_slide_tackle_street_part_II");
            vg.field_Db[86] = new nb(4, 86, "KaB_fall_over_street_impact");
            vg.field_Db[3] = new nb(1, 3, "KaB_crowd_goal_boo_lvl2");
            vg.field_Db[4] = new nb(1, 4, "KaB_crowd_goal_cheer_lvl2");
            vg.field_Db[5] = new nb(1, 5, "KaB_crowd_miss_chance_lvl2");
            vg.field_Db[6] = new nb(1, 6, "KaB_crowd_single_female_random_football_shout1");
            vg.field_Db[7] = new nb(1, 7, "KaB_crowd_single_female_random_football_shout2");
            vg.field_Db[8] = new nb(1, 8, "KaB_crowd_single_female_random_football_shout3");
            vg.field_Db[9] = new nb(1, 9, "KaB_crowd_single_female_random_football_shout4");
            vg.field_Db[10] = new nb(1, 10, "KaB_crowd_single_female_random_football_shout5");
            vg.field_Db[11] = new nb(1, 11, "KaB_crowd_single_male_random_football_shout1");
            vg.field_Db[12] = new nb(1, 12, "KaB_crowd_single_male_random_football_shout2");
            vg.field_Db[13] = new nb(1, 13, "KaB_crowd_single_male_random_football_shout3");
            vg.field_Db[14] = new nb(1, 14, "KaB_crowd_single_male_random_football_shout4");
            vg.field_Db[15] = new nb(1, 15, "KaB_crowd_single_male_random_football_shout5");
            vg.field_Db[16] = new nb(1, 16, "KaB_crowd_single_male_random_football_shout6");
            vg.field_Db[17] = new nb(1, 17, "KaB_crowd_single_male_random_football_shout7");
            vg.field_Db[18] = new nb(1, 18, "KaB_crowd_single_male_random_football_shout8");
            vg.field_Db[19] = new nb(1, 19, "KaB_crowd_single_male_random_football_shout9");
            vg.field_Db[20] = new nb(1, 20, "KaB_crowd_single_male_random_football_shout10");
            vg.field_Db[21] = new nb(1, 21, "KaB_crowd_single_male_random_football_shout11");
            vg.field_Db[22] = new nb(1, 22, "KaB_crowd_single_male_random_football_shout12");
            vg.field_Db[23] = new nb(1, 23, "KaB_crowd_win_cheer_lvl2");
            vg.field_Db[24] = new nb(5, 24, "KaB_crowd_goal_boo_lvl3");
            vg.field_Db[25] = new nb(5, 25, "KaB_crowd_goal_cheer_lvl3");
            vg.field_Db[26] = new nb(5, 26, "KaB_crowd_miss_chance_lvl3");
            vg.field_Db[27] = new nb(5, 27, "KaB_crowd_win_cheer_lvl3");
            vg.field_Db[28] = new nb(6, 28, "KaB_crowd_chant_FunOrb_lvl4");
            vg.field_Db[29] = new nb(6, 29, "KaB_crowd_chant_KickaBout_lvl4");
            vg.field_Db[30] = new nb(6, 30, "KaB_crowd_goal_boo_lvl4");
            vg.field_Db[31] = new nb(6, 31, "KaB_crowd_goal_cheer_lvl4");
            vg.field_Db[32] = new nb(6, 32, "KaB_crowd_miss_chance_lvl4");
            vg.field_Db[38] = new nb(6, 38, "KaB_ball_hit_bin_STREET");
            vg.field_Db[39] = new nb(6, 39, "KaB_ball_hit_door_STREET");
            vg.field_Db[40] = new nb(6, 40, "KaB_ball_hit_fence_STREET");
            vg.field_Db[42] = new nb(6, 42, "KaB_ball_hit_woodwork_ALL");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("it.B(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + -100 + ')');
        }
    }

    final void a(mo param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            if (param1 == 84) {
              break L0;
            } else {
              ((it) this).field_k = 3;
              break L0;
            }
          }
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("it.AB(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    public static void c() {
        field_m = null;
    }

    it(int param0, boolean param1) {
        ((it) this).field_j = param0;
        ((it) this).field_g = 0;
        ((it) this).field_k = 0;
        ((it) this).field_e = ((it) this).field_j;
        ((it) this).field_o = new int[4];
    }

    static {
    }
}
