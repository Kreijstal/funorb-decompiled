/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TileOperator extends TextureOperator {
    private int field_o;
    private int field_m;
    static BitDecodableFactory field_q;
    static GameKeyHandler field_n;
    static boolean field_p;

    final static void a(ResourceArchive param0, String param1, boolean param2, int param3, ResourceArchive param4, ResourceArchive param5) {
        GameAssetLoader var11 = null;
        String var12 = null;
        int incrementValue$0 = 0;
        int var8 = 0;
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        String var13 = null;
        String var14 = null;
        int incrementValue$6 = 0;
        String var15 = null;
        int var10 = TombRacer.field_G ? 1 : 0;
        try {
          var11 = (GameAssetLoader) (dma.field_l);
          var11.drawLoadingProgress(param3, (byte) 47, param1);
          woa.a(-122, param4, param0, 0);
          bb.field_f = new ena(0);
          while (!bb.field_f.a((byte) 107)) {
          }
          ContextMenu.a(13, bb.field_f);
          wl.field_f = new AnimationSequence[13][38];
          var12 = "tr_character_01";
          wl.field_f[0][0] = PillarComponent.loadAnimationSequence("henryj_idle", -124, param5, var12);
          wl.field_f[0][1] = PillarComponent.loadAnimationSequence("henryj_run", -124, param5, var12);
          wl.field_f[0][2] = PillarComponent.loadAnimationSequence("henryj_pull_small", -126, param5, var12);
          wl.field_f[0][3] = PillarComponent.loadAnimationSequence("henryj_push_large", -125, param5, var12);
          wl.field_f[0][4] = PillarComponent.loadAnimationSequence("henryj_skid", -127, param5, var12);
          wl.field_f[0][5] = PillarComponent.loadAnimationSequence("henryj_trait", -124, param5, var12);
          wl.field_f[0][6] = PillarComponent.loadAnimationSequence("henryj_wobble", -127, param5, var12);
          wl.field_f[0][7] = PillarComponent.loadAnimationSequence("henryj_shooting", -126, param5, var12);
          wl.field_f[0][8] = PillarComponent.loadAnimationSequence("henryj_unsheath", -124, param5, var12);
          wl.field_f[0][9] = PillarComponent.loadAnimationSequence("henryj_death", -127, param5, var12);
          wl.field_f[0][10] = PillarComponent.loadAnimationSequence("henryj_ashes", -126, param5, var12);
          wl.field_f[0][11] = PillarComponent.loadAnimationSequence("henryj_idol_idle", -124, param5, var12);
          wl.field_f[0][12] = PillarComponent.loadAnimationSequence("henryj_carry", -125, param5, var12);
          wl.field_f[0][13] = PillarComponent.loadAnimationSequence("henryj_idol_skid", -125, param5, var12);
          wl.field_f[0][14] = PillarComponent.loadAnimationSequence("henryj_key_idle", -126, param5, var12);
          wl.field_f[0][15] = PillarComponent.loadAnimationSequence("henryj_key_run", -125, param5, var12);
          wl.field_f[0][16] = PillarComponent.loadAnimationSequence("henryj_key_skid", -127, param5, var12);
          wl.field_f[0][18] = PillarComponent.loadAnimationSequence("henryj_fall_two", -127, param5, var12);
          wl.field_f[0][17] = PillarComponent.loadAnimationSequence("henryj_gun_idle", -125, param5, var12);
          wl.field_f[0][19] = PillarComponent.loadAnimationSequence("henryj_idle_to_run", -127, param5, var12);
          wl.field_f[0][20] = PillarComponent.loadAnimationSequence("henryj_run_to_idle", -126, param5, var12);
          wl.field_f[0][21] = PillarComponent.loadAnimationSequence("henryj_death_two", -126, param5, var12);
          wl.field_f[0][22] = PillarComponent.loadAnimationSequence("henryj_death_three", -127, param5, var12);
          wl.field_f[0][23] = PillarComponent.loadAnimationSequence("henryj_trait_two", -124, param5, var12);
          wl.field_f[0][24] = PillarComponent.loadAnimationSequence("henryj_creep", -125, param5, var12);
          wl.field_f[0][25] = PillarComponent.loadAnimationSequence("henryj_boulder_death", -124, param5, var12);
          wl.field_f[0][26] = PillarComponent.loadAnimationSequence("henryj_idle_to_push", -124, param5, var12);
          wl.field_f[0][27] = PillarComponent.loadAnimationSequence("henryj_shoot_to_gun_idle", -128, param5, var12);
          wl.field_f[0][28] = PillarComponent.loadAnimationSequence("henryj_resheath", -127, param5, var12);
          wl.field_f[0][29] = PillarComponent.loadAnimationSequence("henryj_gun_run", -127, param5, var12);
          wl.field_f[0][30] = PillarComponent.loadAnimationSequence("henryj_gun_idle_to_run", -128, param5, var12);
          wl.field_f[0][31] = PillarComponent.loadAnimationSequence("henryj_gun_run_to_idle", -125, param5, var12);
          wl.field_f[0][32] = PillarComponent.loadAnimationSequence("henryj_push_small_left", -124, param5, var12);
          wl.field_f[0][33] = PillarComponent.loadAnimationSequence("henryj_push_small_right", -127, param5, var12);
          wl.field_f[0][34] = PillarComponent.loadAnimationSequence("henryj_cut_in_half", -127, param5, var12);
          wl.field_f[0][35] = wl.field_f[0][22];
          wl.field_f[0][36] = PillarComponent.loadAnimationSequence("henryj_large_pull", -125, param5, var12);
          wl.field_f[0][37] = PillarComponent.loadAnimationSequence("henryj_cheer", -124, param5, var12);
          incrementValue$0 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$0, (byte) 47, param1);
          for (var8 = 0; 13 > var8; var8++) {
            if (var8 != 0) {
              for (var9 = 0; var9 < 38; var9++) {
                wl.field_f[var8][var9] = wl.field_f[0][var9];
              }
            }
          }
          wl.field_f[11][1] = PillarComponent.loadAnimationSequence("scarlett_run", -126, param5, var12);
          wl.field_f[11][5] = PillarComponent.loadAnimationSequence("scarlett_trait", -127, param5, var12);
          wl.field_f[11][3] = PillarComponent.loadAnimationSequence("scarlett_push_large", -125, param5, var12);
          wl.field_f[11][2] = PillarComponent.loadAnimationSequence("scarlett_pull_small", -127, param5, var12);
          wl.field_f[11][15] = PillarComponent.loadAnimationSequence("scarlett_key_run", -126, param5, var12);
          wl.field_f[11][24] = PillarComponent.loadAnimationSequence("scarlett_creep", -128, param5, var12);
          wl.field_f[11][29] = PillarComponent.loadAnimationSequence("scarlett_gun_run", -124, param5, var12);
          wl.field_f[11][34] = PillarComponent.loadAnimationSequence("scarlett_cut_in_half", -125, param5, var12);
          wl.field_f[11][37] = PillarComponent.loadAnimationSequence("scarlett_cheer", -127, param5, var12);
          wl.field_f[11][0] = PillarComponent.loadAnimationSequence("scarlett_idle", -124, param5, var12);
          wl.field_f[1][5] = PillarComponent.loadAnimationSequence("ace_trait", -128, param5, var12);
          wl.field_f[1][7] = PillarComponent.loadAnimationSequence("ace_shooting", -127, param5, var12);
          wl.field_f[1][15] = PillarComponent.loadAnimationSequence("ace_key_run", -128, param5, var12);
          wl.field_f[1][14] = PillarComponent.loadAnimationSequence("ace_key_idle", -126, param5, var12);
          wl.field_f[1][17] = PillarComponent.loadAnimationSequence("ace_gun_idle", -125, param5, var12);
          wl.field_f[1][34] = PillarComponent.loadAnimationSequence("ace_cut_in_half", -127, param5, var12);
          incrementValue$1 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$1, (byte) 47, param1);
          wl.field_f[3][5] = PillarComponent.loadAnimationSequence("baroness_trait", -124, param5, var12);
          wl.field_f[3][15] = PillarComponent.loadAnimationSequence("baroness_key_run", -125, param5, var12);
          wl.field_f[3][14] = PillarComponent.loadAnimationSequence("baroness_key_idle", -128, param5, var12);
          wl.field_f[3][34] = PillarComponent.loadAnimationSequence("baroness_cut_in_half", -125, param5, var12);
          wl.field_f[3][37] = PillarComponent.loadAnimationSequence("baroness_cheer", -126, param5, var12);
          wl.field_f[3][0] = wl.field_f[11][0];
          wl.field_f[9][1] = PillarComponent.loadAnimationSequence("johnsson_run", -125, param5, var12);
          wl.field_f[9][15] = PillarComponent.loadAnimationSequence("johnsson_key_run", -124, param5, var12);
          wl.field_f[9][14] = PillarComponent.loadAnimationSequence("johnsson_key_idle", -126, param5, var12);
          wl.field_f[9][23] = PillarComponent.loadAnimationSequence("johnsson_trait_two", -125, param5, var12);
          wl.field_f[9][25] = PillarComponent.loadAnimationSequence("johnsson_boulder_death", -127, param5, var12);
          wl.field_f[9][29] = PillarComponent.loadAnimationSequence("johnsson_gun_run", -124, param5, var12);
          wl.field_f[9][34] = PillarComponent.loadAnimationSequence("johnsson_cut_in_half", -126, param5, var12);
          wl.field_f[9][37] = PillarComponent.loadAnimationSequence("johnsson_cheer", -126, param5, var12);
          wl.field_f[4][5] = wl.field_f[11][5];
          wl.field_f[4][34] = PillarComponent.loadAnimationSequence("borees_cut_in_half", -128, param5, var12);
          wl.field_f[4][37] = PillarComponent.loadAnimationSequence("borees_cheer", -124, param5, var12);
          incrementValue$2 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$2, (byte) 47, param1);
          wl.field_f[5][1] = PillarComponent.loadAnimationSequence("bruce_run", -128, param5, var12);
          wl.field_f[5][0] = PillarComponent.loadAnimationSequence("bruce_idle", -125, param5, var12);
          wl.field_f[5][5] = PillarComponent.loadAnimationSequence("bruce_trait", -128, param5, var12);
          wl.field_f[5][3] = PillarComponent.loadAnimationSequence("bruce_push_large", -126, param5, var12);
          wl.field_f[5][11] = PillarComponent.loadAnimationSequence("bruce_carry", -125, param5, var12);
          wl.field_f[5][8] = PillarComponent.loadAnimationSequence("bruce_unsheath", -127, param5, var12);
          wl.field_f[5][14] = PillarComponent.loadAnimationSequence("bruce_key_idle", -128, param5, var12);
          wl.field_f[5][15] = PillarComponent.loadAnimationSequence("bruce_key_run", -125, param5, var12);
          wl.field_f[5][19] = PillarComponent.loadAnimationSequence("bruce_idle_to_run", -128, param5, var12);
          wl.field_f[5][20] = PillarComponent.loadAnimationSequence("bruce_run_to_idle", -128, param5, var12);
          wl.field_f[5][23] = PillarComponent.loadAnimationSequence("bruce_trait_two", -126, param5, var12);
          wl.field_f[5][28] = PillarComponent.loadAnimationSequence("bruce_resheath", -126, param5, var12);
          wl.field_f[5][29] = PillarComponent.loadAnimationSequence("bruce_gun_run", -128, param5, var12);
          wl.field_f[5][31] = PillarComponent.loadAnimationSequence("bruce_gun_run_to_idle", -124, param5, var12);
          wl.field_f[5][30] = PillarComponent.loadAnimationSequence("bruce_gun_idle_to_run", -127, param5, var12);
          wl.field_f[5][32] = PillarComponent.loadAnimationSequence("bruce_push_small_left", -127, param5, var12);
          wl.field_f[5][33] = PillarComponent.loadAnimationSequence("bruce_push_small_right", -124, param5, var12);
          wl.field_f[5][34] = PillarComponent.loadAnimationSequence("bruce_cut_in_half", -125, param5, var12);
          wl.field_f[5][36] = PillarComponent.loadAnimationSequence("bruce_large_pull", -127, param5, var12);
          wl.field_f[5][37] = PillarComponent.loadAnimationSequence("bruce_cheer", -124, param5, var12);
          wl.field_f[5][2] = PillarComponent.loadAnimationSequence("bruce_pull_small", -127, param5, var12);
          incrementValue$3 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$3, (byte) 47, param1);
          wl.field_f[7][1] = PillarComponent.loadAnimationSequence("hans_run", -125, param5, var12);
          wl.field_f[7][14] = PillarComponent.loadAnimationSequence("hans_key_idle", -124, param5, var12);
          wl.field_f[7][15] = PillarComponent.loadAnimationSequence("hans_key_run", -126, param5, var12);
          wl.field_f[7][29] = PillarComponent.loadAnimationSequence("hans_gun_run", -126, param5, var12);
          wl.field_f[7][34] = PillarComponent.loadAnimationSequence("hans_cut_in_half", -125, param5, var12);
          wl.field_f[7][37] = PillarComponent.loadAnimationSequence("hans_cheer", -127, param5, var12);
          wl.field_f[2][1] = PillarComponent.loadAnimationSequence("angelio_run", -128, param5, var12);
          wl.field_f[2][5] = wl.field_f[11][5];
          wl.field_f[2][14] = PillarComponent.loadAnimationSequence("angelio_key_idle", -128, param5, var12);
          wl.field_f[2][29] = PillarComponent.loadAnimationSequence("angelio_gun_run", -127, param5, var12);
          wl.field_f[2][34] = PillarComponent.loadAnimationSequence("angelio_cut_in_half", -124, param5, var12);
          wl.field_f[2][37] = PillarComponent.loadAnimationSequence("angelio_cheer", -125, param5, var12);
          wl.field_f[2][15] = PillarComponent.loadAnimationSequence("angelio_key_run", -125, param5, var12);
          wl.field_f[6][0] = PillarComponent.loadAnimationSequence("feng_idle", -124, param5, var12);
          wl.field_f[6][5] = PillarComponent.loadAnimationSequence("feng_trait", -127, param5, var12);
          wl.field_f[6][8] = PillarComponent.loadAnimationSequence("feng_unsheath", -128, param5, var12);
          wl.field_f[6][1] = PillarComponent.loadAnimationSequence("feng_run", -125, param5, var12);
          wl.field_f[6][15] = PillarComponent.loadAnimationSequence("feng_key_run", -127, param5, var12);
          wl.field_f[6][14] = PillarComponent.loadAnimationSequence("feng_key_idle", -128, param5, var12);
          wl.field_f[6][11] = PillarComponent.loadAnimationSequence("feng_idol_idle", -128, param5, var12);
          wl.field_f[6][17] = PillarComponent.loadAnimationSequence("feng_gun_idle", -126, param5, var12);
          wl.field_f[6][21] = PillarComponent.loadAnimationSequence("feng_death_two", -128, param5, var12);
          wl.field_f[6][23] = PillarComponent.loadAnimationSequence("feng_trait_two", -127, param5, var12);
          wl.field_f[6][28] = PillarComponent.loadAnimationSequence("feng_resheath", -127, param5, var12);
          wl.field_f[6][34] = PillarComponent.loadAnimationSequence("feng_cut_in_half", -128, param5, var12);
          wl.field_f[6][37] = PillarComponent.loadAnimationSequence("feng_cheer", -124, param5, var12);
          wl.field_f[6][36] = PillarComponent.loadAnimationSequence("feng_large_pull", -124, param5, var12);
          incrementValue$4 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$4, (byte) 47, param1);
          wl.field_f[8][5] = wl.field_f[1][5];
          wl.field_f[8][15] = PillarComponent.loadAnimationSequence("jamille_key_run", -128, param5, var12);
          wl.field_f[8][14] = PillarComponent.loadAnimationSequence("jamille_key_idle", -125, param5, var12);
          wl.field_f[8][34] = PillarComponent.loadAnimationSequence("jamille_cut_in_half", -127, param5, var12);
          wl.field_f[8][37] = PillarComponent.loadAnimationSequence("jamille_cheer", -128, param5, var12);
          wl.field_f[8][0] = wl.field_f[11][0];
          wl.field_f[10][0] = PillarComponent.loadAnimationSequence("piles_idle", -125, param5, var12);
          wl.field_f[10][1] = PillarComponent.loadAnimationSequence("piles_run", -124, param5, var12);
          wl.field_f[10][2] = PillarComponent.loadAnimationSequence("piles_pull_small", -126, param5, var12);
          wl.field_f[10][3] = PillarComponent.loadAnimationSequence("piles_push_large", -126, param5, var12);
          wl.field_f[10][4] = PillarComponent.loadAnimationSequence("piles_skid", -128, param5, var12);
          wl.field_f[10][5] = PillarComponent.loadAnimationSequence("piles_trait", -127, param5, var12);
          wl.field_f[10][6] = PillarComponent.loadAnimationSequence("piles_wobble", -128, param5, var12);
          wl.field_f[10][7] = PillarComponent.loadAnimationSequence("piles_shooting", -125, param5, var12);
          wl.field_f[10][8] = PillarComponent.loadAnimationSequence("piles_unsheath", -128, param5, var12);
          wl.field_f[10][9] = PillarComponent.loadAnimationSequence("piles_death", -127, param5, var12);
          wl.field_f[10][10] = PillarComponent.loadAnimationSequence("piles_ashes", -128, param5, var12);
          wl.field_f[10][11] = PillarComponent.loadAnimationSequence("piles_idol_idle", -127, param5, var12);
          wl.field_f[10][12] = PillarComponent.loadAnimationSequence("piles_carry", -127, param5, var12);
          wl.field_f[10][13] = PillarComponent.loadAnimationSequence("piles_idol_skid", -124, param5, var12);
          wl.field_f[10][14] = PillarComponent.loadAnimationSequence("piles_key_idle", -124, param5, var12);
          wl.field_f[10][15] = PillarComponent.loadAnimationSequence("piles_key_run", -127, param5, var12);
          wl.field_f[10][21] = PillarComponent.loadAnimationSequence("piles_death_two", -125, param5, var12);
          wl.field_f[10][22] = PillarComponent.loadAnimationSequence("piles_death_three", -128, param5, var12);
          wl.field_f[10][36] = PillarComponent.loadAnimationSequence("piles_large_pull", -124, param5, var12);
          incrementValue$5 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$5, (byte) 47, param1);
          wl.field_f[10][18] = PillarComponent.loadAnimationSequence("piles_fall_two", -124, param5, var12);
          wl.field_f[10][17] = PillarComponent.loadAnimationSequence("piles_gun_idle", -125, param5, var12);
          wl.field_f[10][19] = PillarComponent.loadAnimationSequence("piles_idle_to_run", -128, param5, var12);
          wl.field_f[10][20] = PillarComponent.loadAnimationSequence("piles_run_to_idle", -128, param5, var12);
          wl.field_f[10][23] = PillarComponent.loadAnimationSequence("piles_trait_two", -128, param5, var12);
          wl.field_f[10][24] = PillarComponent.loadAnimationSequence("piles_creep", -128, param5, var12);
          wl.field_f[10][25] = PillarComponent.loadAnimationSequence("piles_boulder_death", -124, param5, var12);
          wl.field_f[10][26] = PillarComponent.loadAnimationSequence("piles_idle_to_push", -126, param5, var12);
          wl.field_f[10][28] = PillarComponent.loadAnimationSequence("piles_resheath", -127, param5, var12);
          wl.field_f[10][29] = PillarComponent.loadAnimationSequence("piles_gun_run", -125, param5, var12);
          wl.field_f[10][31] = PillarComponent.loadAnimationSequence("piles_gun_run_to_idle", -126, param5, var12);
          wl.field_f[10][30] = PillarComponent.loadAnimationSequence("piles_gun_idle_to_run", -127, param5, var12);
          wl.field_f[10][32] = PillarComponent.loadAnimationSequence("piles_push_small_left", -126, param5, var12);
          wl.field_f[10][33] = PillarComponent.loadAnimationSequence("piles_push_small_right", -127, param5, var12);
          wl.field_f[10][34] = PillarComponent.loadAnimationSequence("piles_cut_in_half", -126, param5, var12);
          wl.field_f[10][35] = wl.field_f[10][22];
          wl.field_f[10][37] = PillarComponent.loadAnimationSequence("piles_cheer", -128, param5, var12);
          wl.field_f[12][5] = wl.field_f[10][5];
          wl.field_f[12][14] = PillarComponent.loadAnimationSequence("wilbur_key_idle", -126, param5, var12);
          wl.field_f[12][34] = PillarComponent.loadAnimationSequence("wilbur_cut_in_half", -125, param5, var12);
          wl.field_f[12][37] = PillarComponent.loadAnimationSequence("wilbur_cheer", -125, param5, var12);
          wl.field_f[12][1] = PillarComponent.loadAnimationSequence("wilbur_run", -128, param5, var12);
          var13 = "new_skeleton";
          qja.field_f = new AnimationSequence[10];
          qja.field_f[0] = PillarComponent.loadAnimationSequence("new_skeleton_idle", -124, param5, var13);
          qja.field_f[1] = PillarComponent.loadAnimationSequence("new_skeleton_walk", -126, param5, var13);
          qja.field_f[2] = PillarComponent.loadAnimationSequence("new_skeleton_walk_2", -127, param5, var13);
          qja.field_f[3] = PillarComponent.loadAnimationSequence("new_skeleton_death", -128, param5, var13);
          qja.field_f[4] = PillarComponent.loadAnimationSequence("new_skeleton_head_pull", -124, param5, var13);
          qja.field_f[5] = PillarComponent.loadAnimationSequence("new_skeleton_fire_death", -124, param5, var13);
          var14 = "snake";
          qja.field_f[6] = PillarComponent.loadAnimationSequence("snake_idle", -128, param5, var14);
          qja.field_f[7] = PillarComponent.loadAnimationSequence("snake_walk", -124, param5, var14);
          qja.field_f[8] = PillarComponent.loadAnimationSequence("snake_idle_to_walk", -126, param5, var14);
          qja.field_f[9] = PillarComponent.loadAnimationSequence("snake_walk_to_idle", -125, param5, var14);
          incrementValue$6 = param3;
          param3++;
          var11.drawLoadingProgress(incrementValue$6, (byte) 47, param1);
          var15 = "rope_bridge";
          cva.field_c = new AnimationSequence[4];
          cva.field_c[0] = PillarComponent.loadAnimationSequence("start", -127, param5, var15);
          cva.field_c[1] = PillarComponent.loadAnimationSequence("end", -127, param5, var15);
          cva.field_c[2] = PillarComponent.loadAnimationSequence("loop_start", -127, param5, var15);
          cva.field_c[3] = PillarComponent.loadAnimationSequence("loop_section", -126, param5, var15);
          LoadProfileCommand.field_p = new AnimationSequence[13];
          if (param2) {
            field_p = false;
          }
          LoadProfileCommand.field_p[0] = PillarComponent.loadAnimationSequence("fire", -128, param5, "brazier");
          LoadProfileCommand.field_p[1] = PillarComponent.loadAnimationSequence("fire", -126, param5, "torch");
          LoadProfileCommand.field_p[2] = PillarComponent.loadAnimationSequence("fire", -126, param5, "spitting_torch");
          LoadProfileCommand.field_p[3] = PillarComponent.loadAnimationSequence("platform1_crumble", -124, param5, "platform");
          LoadProfileCommand.field_p[4] = PillarComponent.loadAnimationSequence("platform2_crumble", -124, param5, "platform");
          LoadProfileCommand.field_p[5] = PillarComponent.loadAnimationSequence("platform3_crumble", -126, param5, "platform");
          LoadProfileCommand.field_p[6] = PillarComponent.loadAnimationSequence("key_turn", -128, param5, "keyblock");
          LoadProfileCommand.field_p[7] = PillarComponent.loadAnimationSequence("cauldron_bubbles", -124, param5, "bubbles");
          LoadProfileCommand.field_p[8] = PillarComponent.loadAnimationSequence("lava_bubbles", -127, param5, "bubbles");
          LoadProfileCommand.field_p[9] = PillarComponent.loadAnimationSequence("coin_collect", -128, param5, "coin");
          LoadProfileCommand.field_p[10] = PillarComponent.loadAnimationSequence("platform1_crumble_grey", -125, param5, "platform_grey");
          LoadProfileCommand.field_p[11] = PillarComponent.loadAnimationSequence("platform2_crumble_grey", -128, param5, "platform_grey");
          LoadProfileCommand.field_p[12] = PillarComponent.loadAnimationSequence("platform3_crumble_grey", -124, param5, "platform_grey");
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "nfa.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = param0;
          var6 = param1;
          var7 = -param1;
          var8 = -1;
          var9 = rp.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param3 + param1);
          var10 = rp.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param3 - param1);
          nra.fillRange((byte) -55, param2, var9, vaa.field_a[param4], var10);
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            if (var7 > 0) {
              var6--;
              var7 = var7 - (var6 << 1);
              var11 = param4 - var6;
              var12 = var6 + param4;
              if (var12 >= gca.field_d &&
                var11 <= hc.field_h) {
                var13 = rp.clamp(DiskCacheWorker.field_c, param0 ^ -16226, pka.field_b, var5_int + param3);
                var14 = rp.clamp(DiskCacheWorker.field_c, -16226, pka.field_b, param3 - var5_int);
                if (var12 <= hc.field_h) {
                  nra.fillRange((byte) -55, param2, var13, vaa.field_a[var12], var14);
                }
                if (var11 >= gca.field_d) {
                  nra.fillRange((byte) -55, param2, var13, vaa.field_a[var11], var14);
                }
              }
            }
            var5_int++;
            var11Lifetime1 = param4 - var5_int;
            var12Lifetime1 = param4 + var5_int;
            if (gca.field_d > var12Lifetime1) {
              continue;
            }
            if (var11Lifetime1 > hc.field_h) {
              continue;
            }
            var13Lifetime1 = rp.clamp(DiskCacheWorker.field_c, param0 ^ -16226, pka.field_b, param3 + var6);
            var14Lifetime1 = rp.clamp(DiskCacheWorker.field_c, param0 - 16226, pka.field_b, param3 - var6);
            if (hc.field_h >= var12Lifetime1) {
              nra.fillRange((byte) -55, param2, var13Lifetime1, vaa.field_a[var12Lifetime1], var14Lifetime1);
            }
            if (gca.field_d > var11Lifetime1) {
              continue;
            }
            nra.fillRange((byte) -55, param2, var13Lifetime1, vaa.field_a[var11Lifetime1], var14Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var5), "nfa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int[][] getColourRow(int param0, int param1) {
        int var13 = 0;
        int[][] var3;
        int[][] var4;
        int var5;
        int var6;
        int var7_int;
        int[] var7;
        int[] var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var12;
        int var14;
        int var15;
        int var16;
        int[][] var17;
        int[][] var18;
        int[][] var19;
        var16 = TombRacer.field_G ? 1 : 0;
        var19 = this.colourCache.getRow(param0, (byte) 125);
        var18 = var19;
        var17 = var18;
        var3 = var17;
        if (this.colourCache.field_f) {
          var5 = LegacyOpenGlTurbulentTextureEffect.textureWidth / this.field_m;
          var6 = ArchiveNetworkClient.textureHeight / this.field_o;
          if (var6 <= 0) {
            var4 = this.getInputColourRow(0, 0, -1);
          } else {
            var7_int = param0 % var6;
            var4 = this.getInputColourRow(var7_int * ArchiveNetworkClient.textureHeight / var6, 0, param1 + 0);
          }
          var7 = var4[0];
          var8 = var4[1];
          var9 = var4[2];
          var10 = var19[0];
          var11 = var19[1];
          var12 = var19[2];
          for (var13 = 0; LegacyOpenGlTurbulentTextureEffect.textureWidth > var13; var13++) {
            if (var5 <= 0) {
              var14 = 0;
            } else {
              var15 = var13 % var5;
              var14 = var15 * LegacyOpenGlTurbulentTextureEffect.textureWidth / var5;
            }
            var10[var13] = var7[var14];
            var11[var13] = var8[var14];
            var12[var13] = var9[var14];
          }
        }
        if (param1 != -1) {
          field_n = (GameKeyHandler) null;
        }
        return var17;
    }

    final int[] getMonochromeRow(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var8;
        int var7Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          TileOperator.releaseStatics((byte) -85);
        }
        var3 = this.monochromeCache.getRow((byte) 78, param1);
        if (this.monochromeCache.rowMissed) {
          var5 = LegacyOpenGlTurbulentTextureEffect.textureWidth / this.field_m;
          var6 = ArchiveNetworkClient.textureHeight / this.field_o;
          if (var6 <= 0) {
            var4 = this.getInputMonochromeRow(0, -84, 0);
          } else {
            var7 = param1 % var6;
            var4 = this.getInputMonochromeRow(0, -116, var7 * ArchiveNetworkClient.textureHeight / var6);
          }
          var10 = 0;
          var7Lifetime1 = var10;
          while (var10 < LegacyOpenGlTurbulentTextureEffect.textureWidth) {
            if (var5 > 0) {
              var8 = var10 % var5;
              var3[var10] = var4[var8 * LegacyOpenGlTurbulentTextureEffect.textureWidth / var5];
            } else {
              var3[var10] = var4[0];
            }
            var10++;
          }
        }
        return var3;
    }

    public static void releaseStatics(byte param0) {
        int var1 = -71 / ((-44 - param0) / 55);
        field_n = null;
        field_q = null;
    }

    final static void a(int[][] param0, int param1) {
        try {
          vaa.field_a = param0;
          int var2_int = -93 % ((param1 - 57) / 49);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "nfa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public TileOperator() {
        super(1, false);
        this.field_o = 4;
        this.field_m = 4;
    }

    final void decodeParameter(byte param0, PacketBuffer param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_m = param1.readUnsignedByte(param0 + 148);
          } else {
            if (var4_int == 1) {
              this.field_o = param1.readUnsignedByte(255);
            }
          }
          if (param0 != 107) {
            TileOperator.a((int[][]) null, 80);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_11_0 = var4;
          stackIn_11_1 = new StringBuilder().append("nfa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_q = (BitDecodableFactory) ((Object) new CharacterChoiceFactory());
        field_n = new GameKeyHandler();
        field_p = false;
    }
}
