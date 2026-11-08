/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ParticipantAgent extends MatchAgent {
    boolean field_l;
    int[] field_o;
    static ScrollBar field_m;
    int team;
    int field_f;
    int field_h;
    int field_k;
    int field_g;
    private int participantIndex;
    static boolean field_n;
    boolean field_i;

    final void copyStateFrom(byte param0, MatchAgent param1) {
        int var4 = 0;
        int var5 = Kickabout.field_G;
        ParticipantAgent var6 = (ParticipantAgent) (param1);
        ParticipantAgent var3 = var6;
        if (param0 >= -52) {
          return;
        }
        try {
          this.field_k = var3.field_k;
          this.team = var3.team;
          this.field_l = var3.field_l;
          this.field_g = var3.field_g;
          for (var4 = 0; var4 < this.field_o.length; var4++) {
            this.field_o[var4] = var6.field_o[var4];
          }
          this.field_h = var3.field_h;
          this.field_i = var3.field_i;
          this.field_f = var3.field_f;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "it.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeGameSoundEffects(SoundCache param0, ResourceArchive param1, byte param2) {
        bq.field_a = param0;
        SortCriterion.field_h = param1;
        TextFieldNode.field_Db[44] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_menu_btn"));
        TextFieldNode.field_Db[45] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_menu_tab_btn"));
        TextFieldNode.field_Db[46] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_save_and_exit_btn"));
        TextFieldNode.field_Db[47] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_back_and_exit"));
        sk.a(-111, 100, 25);
        TextFieldNode.field_Db[48] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_menu_select_btn"));
        TextFieldNode.field_Db[49] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_complete_purchase_btn"));
        TextFieldNode.field_Db[50] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_attach_powerup"));
        TextFieldNode.field_Db[51] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_profile_expand_btn"));
        sk.a(param2 + 0, 100, 50);
        TextFieldNode.field_Db[52] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_profile_collapse_btn"));
        TextFieldNode.field_Db[53] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_warning_error_msg"));
        TextFieldNode.field_Db[54] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_mouse_over"));
        TextFieldNode.field_Db[55] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_menu_slide_left"));
        TextFieldNode.field_Db[56] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_menu_slide_right"));
        TextFieldNode.field_Db[57] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_profile_expand_all_btn"));
        sk.a(-118, 100, 75);
        TextFieldNode.field_Db[58] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_profile_collapse_all_btn"));
        TextFieldNode.field_Db[59] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_scroll_left_btn"));
        TextFieldNode.field_Db[60] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_scroll_right_btn"));
        TextFieldNode.field_Db[61] = new GameSoundEffect(bq.field_a.getNamedSoundEffect("", true, "KaB_toggle_checkbox"));
        TextFieldNode.field_Db[43] = new GameSoundEffect(0, 43, "KaB_crowd_win_cheer_lvl4");
        TextFieldNode.field_Db[33] = new GameSoundEffect(0, 33, "KaB_whistle_blow_fulltime_ALL");
        TextFieldNode.field_Db[34] = new GameSoundEffect(0, 34, "KaB_whistle_blow_kickoff_ALL");
        TextFieldNode.field_Db[37] = new GameSoundEffect(0, 37, "KaB_kick_ball_HARD");
        TextFieldNode.field_Db[36] = new GameSoundEffect(0, 36, "KaB_kick_ball_MED");
        TextFieldNode.field_Db[35] = new GameSoundEffect(0, 35, "KaB_kick_ball_SOFT");
        TextFieldNode.field_Db[41] = new GameSoundEffect(0, 41, "KaB_ball_hit_stand_ALL");
        TextFieldNode.field_Db[0] = new GameSoundEffect(2, 0, "KaB_ball_bounce_PARK");
        TextFieldNode.field_Db[74] = new GameSoundEffect(2, 74, "KaB_footstep_park_SOFT_I");
        TextFieldNode.field_Db[75] = new GameSoundEffect(2, 75, "KaB_footstep_park_SOFT_II");
        TextFieldNode.field_Db[76] = new GameSoundEffect(2, 76, "KaB_footstep_park_MED_I");
        TextFieldNode.field_Db[77] = new GameSoundEffect(2, 77, "KaB_footstep_park_MED_II");
        TextFieldNode.field_Db[78] = new GameSoundEffect(2, 78, "KaB_footstep_park_HARD_I");
        TextFieldNode.field_Db[79] = new GameSoundEffect(2, 79, "KaB_footstep_park_HARD_II");
        TextFieldNode.field_Db[84] = new GameSoundEffect(2, 84, "KaB_slide_tackle_park_part_I");
        TextFieldNode.field_Db[85] = new GameSoundEffect(2, 85, "KaB_slide_tackle_park_part_II");
        TextFieldNode.field_Db[88] = new GameSoundEffect(2, 88, "KaB_fall_over_park_impact");
        TextFieldNode.field_Db[1] = new GameSoundEffect(3, 1, "KaB_ball_bounce_BEACH");
        TextFieldNode.field_Db[68] = new GameSoundEffect(3, 68, "KaB_footstep_beach_SOFT_I");
        TextFieldNode.field_Db[69] = new GameSoundEffect(3, 69, "KaB_footstep_beach_SOFT_II");
        TextFieldNode.field_Db[70] = new GameSoundEffect(3, 70, "KaB_footstep_beach_MED_I");
        TextFieldNode.field_Db[71] = new GameSoundEffect(3, 71, "KaB_footstep_beach_MED_II");
        TextFieldNode.field_Db[72] = new GameSoundEffect(3, 72, "KaB_footstep_beach_HARD_I");
        TextFieldNode.field_Db[73] = new GameSoundEffect(3, 73, "KaB_footstep_beach_HARD_II");
        TextFieldNode.field_Db[82] = new GameSoundEffect(3, 82, "KaB_slide_tackle_beach_part_I");
        TextFieldNode.field_Db[83] = new GameSoundEffect(3, 83, "KaB_slide_tackle_beach_part_II");
        TextFieldNode.field_Db[87] = new GameSoundEffect(3, 87, "KaB_fall_over_beach_impact");
        if (param2 != -100) {
          return;
        }
        try {
          TextFieldNode.field_Db[2] = new GameSoundEffect(4, 2, "KaB_ball_bounce_STREET");
          TextFieldNode.field_Db[62] = new GameSoundEffect(4, 62, "KaB_footstep_street_SOFT_I");
          TextFieldNode.field_Db[63] = new GameSoundEffect(4, 63, "KaB_footstep_street_SOFT_II");
          TextFieldNode.field_Db[64] = new GameSoundEffect(4, 64, "KaB_footstep_street_MED_I");
          TextFieldNode.field_Db[65] = new GameSoundEffect(4, 65, "KaB_footstep_street_MED_II");
          TextFieldNode.field_Db[66] = new GameSoundEffect(4, 66, "KaB_footstep_street_HARD_I");
          TextFieldNode.field_Db[67] = new GameSoundEffect(4, 67, "KaB_footstep_street_HARD_II");
          TextFieldNode.field_Db[80] = new GameSoundEffect(4, 80, "KaB_slide_tackle_street_part_I");
          TextFieldNode.field_Db[81] = new GameSoundEffect(4, 81, "KaB_slide_tackle_street_part_II");
          TextFieldNode.field_Db[86] = new GameSoundEffect(4, 86, "KaB_fall_over_street_impact");
          TextFieldNode.field_Db[3] = new GameSoundEffect(1, 3, "KaB_crowd_goal_boo_lvl2");
          TextFieldNode.field_Db[4] = new GameSoundEffect(1, 4, "KaB_crowd_goal_cheer_lvl2");
          TextFieldNode.field_Db[5] = new GameSoundEffect(1, 5, "KaB_crowd_miss_chance_lvl2");
          TextFieldNode.field_Db[6] = new GameSoundEffect(1, 6, "KaB_crowd_single_female_random_football_shout1");
          TextFieldNode.field_Db[7] = new GameSoundEffect(1, 7, "KaB_crowd_single_female_random_football_shout2");
          TextFieldNode.field_Db[8] = new GameSoundEffect(1, 8, "KaB_crowd_single_female_random_football_shout3");
          TextFieldNode.field_Db[9] = new GameSoundEffect(1, 9, "KaB_crowd_single_female_random_football_shout4");
          TextFieldNode.field_Db[10] = new GameSoundEffect(1, 10, "KaB_crowd_single_female_random_football_shout5");
          TextFieldNode.field_Db[11] = new GameSoundEffect(1, 11, "KaB_crowd_single_male_random_football_shout1");
          TextFieldNode.field_Db[12] = new GameSoundEffect(1, 12, "KaB_crowd_single_male_random_football_shout2");
          TextFieldNode.field_Db[13] = new GameSoundEffect(1, 13, "KaB_crowd_single_male_random_football_shout3");
          TextFieldNode.field_Db[14] = new GameSoundEffect(1, 14, "KaB_crowd_single_male_random_football_shout4");
          TextFieldNode.field_Db[15] = new GameSoundEffect(1, 15, "KaB_crowd_single_male_random_football_shout5");
          TextFieldNode.field_Db[16] = new GameSoundEffect(1, 16, "KaB_crowd_single_male_random_football_shout6");
          TextFieldNode.field_Db[17] = new GameSoundEffect(1, 17, "KaB_crowd_single_male_random_football_shout7");
          TextFieldNode.field_Db[18] = new GameSoundEffect(1, 18, "KaB_crowd_single_male_random_football_shout8");
          TextFieldNode.field_Db[19] = new GameSoundEffect(1, 19, "KaB_crowd_single_male_random_football_shout9");
          TextFieldNode.field_Db[20] = new GameSoundEffect(1, 20, "KaB_crowd_single_male_random_football_shout10");
          TextFieldNode.field_Db[21] = new GameSoundEffect(1, 21, "KaB_crowd_single_male_random_football_shout11");
          TextFieldNode.field_Db[22] = new GameSoundEffect(1, 22, "KaB_crowd_single_male_random_football_shout12");
          TextFieldNode.field_Db[23] = new GameSoundEffect(1, 23, "KaB_crowd_win_cheer_lvl2");
          TextFieldNode.field_Db[24] = new GameSoundEffect(5, 24, "KaB_crowd_goal_boo_lvl3");
          TextFieldNode.field_Db[25] = new GameSoundEffect(5, 25, "KaB_crowd_goal_cheer_lvl3");
          TextFieldNode.field_Db[26] = new GameSoundEffect(5, 26, "KaB_crowd_miss_chance_lvl3");
          TextFieldNode.field_Db[27] = new GameSoundEffect(5, 27, "KaB_crowd_win_cheer_lvl3");
          TextFieldNode.field_Db[28] = new GameSoundEffect(6, 28, "KaB_crowd_chant_FunOrb_lvl4");
          TextFieldNode.field_Db[29] = new GameSoundEffect(6, 29, "KaB_crowd_chant_KickaBout_lvl4");
          TextFieldNode.field_Db[30] = new GameSoundEffect(6, 30, "KaB_crowd_goal_boo_lvl4");
          TextFieldNode.field_Db[31] = new GameSoundEffect(6, 31, "KaB_crowd_goal_cheer_lvl4");
          TextFieldNode.field_Db[32] = new GameSoundEffect(6, 32, "KaB_crowd_miss_chance_lvl4");
          TextFieldNode.field_Db[38] = new GameSoundEffect(6, 38, "KaB_ball_hit_bin_STREET");
          TextFieldNode.field_Db[39] = new GameSoundEffect(6, 39, "KaB_ball_hit_door_STREET");
          TextFieldNode.field_Db[40] = new GameSoundEffect(6, 40, "KaB_ball_hit_fence_STREET");
          TextFieldNode.field_Db[42] = new GameSoundEffect(6, 42, "KaB_ball_hit_woodwork_ALL");
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "it.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(MatchAgent param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 84) {
            this.field_k = 3;
          }
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("it.AB(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 54) {
          field_n = true;
        }
        field_m = null;
    }

    ParticipantAgent(int param0, boolean param1) {
        this.participantIndex = param0;
        this.field_g = 0;
        this.field_k = 0;
        this.field_e = this.participantIndex;
        this.field_o = new int[4];
    }

    static {
    }
}
