/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nfa extends ci {
    private int field_o;
    private int field_m;
    static os field_q;
    static gt field_n;
    static boolean field_p;

    final static void a(cn param0, String param1, boolean param2, int param3, cn param4, cn param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sra var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        var11 = (sra) (Object) dma.field_l;
        var11.a(param3, (byte) 47, param1);
        woa.a(-122, param4, param0, 0);
        bb.field_f = new ena(0);
        L0: while (true) {
          if (bb.field_f.a((byte) 107)) {
            ola.a(13, bb.field_f);
            wl.field_f = new dk[13][38];
            var12 = "tr_character_01";
            wl.field_f[0][0] = m.a("henryj_idle", -124, param5, var12);
            wl.field_f[0][1] = m.a("henryj_run", -124, param5, var12);
            wl.field_f[0][2] = m.a("henryj_pull_small", -126, param5, var12);
            wl.field_f[0][3] = m.a("henryj_push_large", -125, param5, var12);
            wl.field_f[0][4] = m.a("henryj_skid", -127, param5, var12);
            wl.field_f[0][5] = m.a("henryj_trait", -124, param5, var12);
            wl.field_f[0][6] = m.a("henryj_wobble", -127, param5, var12);
            wl.field_f[0][7] = m.a("henryj_shooting", -126, param5, var12);
            wl.field_f[0][8] = m.a("henryj_unsheath", -124, param5, var12);
            wl.field_f[0][9] = m.a("henryj_death", -127, param5, var12);
            wl.field_f[0][10] = m.a("henryj_ashes", -126, param5, var12);
            wl.field_f[0][11] = m.a("henryj_idol_idle", -124, param5, var12);
            wl.field_f[0][12] = m.a("henryj_carry", -125, param5, var12);
            wl.field_f[0][13] = m.a("henryj_idol_skid", -125, param5, var12);
            wl.field_f[0][14] = m.a("henryj_key_idle", -126, param5, var12);
            wl.field_f[0][15] = m.a("henryj_key_run", -125, param5, var12);
            wl.field_f[0][16] = m.a("henryj_key_skid", -127, param5, var12);
            wl.field_f[0][18] = m.a("henryj_fall_two", -127, param5, var12);
            wl.field_f[0][17] = m.a("henryj_gun_idle", -125, param5, var12);
            wl.field_f[0][19] = m.a("henryj_idle_to_run", -127, param5, var12);
            wl.field_f[0][20] = m.a("henryj_run_to_idle", -126, param5, var12);
            wl.field_f[0][21] = m.a("henryj_death_two", -126, param5, var12);
            wl.field_f[0][22] = m.a("henryj_death_three", -127, param5, var12);
            wl.field_f[0][23] = m.a("henryj_trait_two", -124, param5, var12);
            wl.field_f[0][24] = m.a("henryj_creep", -125, param5, var12);
            wl.field_f[0][25] = m.a("henryj_boulder_death", -124, param5, var12);
            wl.field_f[0][26] = m.a("henryj_idle_to_push", -124, param5, var12);
            wl.field_f[0][27] = m.a("henryj_shoot_to_gun_idle", -128, param5, var12);
            wl.field_f[0][28] = m.a("henryj_resheath", -127, param5, var12);
            wl.field_f[0][29] = m.a("henryj_gun_run", -127, param5, var12);
            wl.field_f[0][30] = m.a("henryj_gun_idle_to_run", -128, param5, var12);
            wl.field_f[0][31] = m.a("henryj_gun_run_to_idle", -125, param5, var12);
            wl.field_f[0][32] = m.a("henryj_push_small_left", -124, param5, var12);
            wl.field_f[0][33] = m.a("henryj_push_small_right", -127, param5, var12);
            wl.field_f[0][34] = m.a("henryj_cut_in_half", -127, param5, var12);
            wl.field_f[0][35] = wl.field_f[0][22];
            wl.field_f[0][36] = m.a("henryj_large_pull", -125, param5, var12);
            wl.field_f[0][37] = m.a("henryj_cheer", -124, param5, var12);
            int incrementValue$7 = param3;
            param3++;
            var11.a(incrementValue$7, (byte) 47, param1);
            var8 = 0;
            L1: while (true) {
              if (13 <= var8) {
                L2: {
                  wl.field_f[11][1] = m.a("scarlett_run", -126, param5, var12);
                  wl.field_f[11][5] = m.a("scarlett_trait", -127, param5, var12);
                  wl.field_f[11][3] = m.a("scarlett_push_large", -125, param5, var12);
                  wl.field_f[11][2] = m.a("scarlett_pull_small", -127, param5, var12);
                  wl.field_f[11][15] = m.a("scarlett_key_run", -126, param5, var12);
                  wl.field_f[11][24] = m.a("scarlett_creep", -128, param5, var12);
                  wl.field_f[11][29] = m.a("scarlett_gun_run", -124, param5, var12);
                  wl.field_f[11][34] = m.a("scarlett_cut_in_half", -125, param5, var12);
                  wl.field_f[11][37] = m.a("scarlett_cheer", -127, param5, var12);
                  wl.field_f[11][0] = m.a("scarlett_idle", -124, param5, var12);
                  wl.field_f[1][5] = m.a("ace_trait", -128, param5, var12);
                  wl.field_f[1][7] = m.a("ace_shooting", -127, param5, var12);
                  wl.field_f[1][15] = m.a("ace_key_run", -128, param5, var12);
                  wl.field_f[1][14] = m.a("ace_key_idle", -126, param5, var12);
                  wl.field_f[1][17] = m.a("ace_gun_idle", -125, param5, var12);
                  wl.field_f[1][34] = m.a("ace_cut_in_half", -127, param5, var12);
                  int incrementValue$8 = param3;
                  param3++;
                  var11.a(incrementValue$8, (byte) 47, param1);
                  wl.field_f[3][5] = m.a("baroness_trait", -124, param5, var12);
                  wl.field_f[3][15] = m.a("baroness_key_run", -125, param5, var12);
                  wl.field_f[3][14] = m.a("baroness_key_idle", -128, param5, var12);
                  wl.field_f[3][34] = m.a("baroness_cut_in_half", -125, param5, var12);
                  wl.field_f[3][37] = m.a("baroness_cheer", -126, param5, var12);
                  wl.field_f[3][0] = wl.field_f[11][0];
                  wl.field_f[9][1] = m.a("johnsson_run", -125, param5, var12);
                  wl.field_f[9][15] = m.a("johnsson_key_run", -124, param5, var12);
                  wl.field_f[9][14] = m.a("johnsson_key_idle", -126, param5, var12);
                  wl.field_f[9][23] = m.a("johnsson_trait_two", -125, param5, var12);
                  wl.field_f[9][25] = m.a("johnsson_boulder_death", -127, param5, var12);
                  wl.field_f[9][29] = m.a("johnsson_gun_run", -124, param5, var12);
                  wl.field_f[9][34] = m.a("johnsson_cut_in_half", -126, param5, var12);
                  wl.field_f[9][37] = m.a("johnsson_cheer", -126, param5, var12);
                  wl.field_f[4][5] = wl.field_f[11][5];
                  wl.field_f[4][34] = m.a("borees_cut_in_half", -128, param5, var12);
                  wl.field_f[4][37] = m.a("borees_cheer", -124, param5, var12);
                  int incrementValue$9 = param3;
                  param3++;
                  var11.a(incrementValue$9, (byte) 47, param1);
                  wl.field_f[5][1] = m.a("bruce_run", -128, param5, var12);
                  wl.field_f[5][0] = m.a("bruce_idle", -125, param5, var12);
                  wl.field_f[5][5] = m.a("bruce_trait", -128, param5, var12);
                  wl.field_f[5][3] = m.a("bruce_push_large", -126, param5, var12);
                  wl.field_f[5][11] = m.a("bruce_carry", -125, param5, var12);
                  wl.field_f[5][8] = m.a("bruce_unsheath", -127, param5, var12);
                  wl.field_f[5][14] = m.a("bruce_key_idle", -128, param5, var12);
                  wl.field_f[5][15] = m.a("bruce_key_run", -125, param5, var12);
                  wl.field_f[5][19] = m.a("bruce_idle_to_run", -128, param5, var12);
                  wl.field_f[5][20] = m.a("bruce_run_to_idle", -128, param5, var12);
                  wl.field_f[5][23] = m.a("bruce_trait_two", -126, param5, var12);
                  wl.field_f[5][28] = m.a("bruce_resheath", -126, param5, var12);
                  wl.field_f[5][29] = m.a("bruce_gun_run", -128, param5, var12);
                  wl.field_f[5][31] = m.a("bruce_gun_run_to_idle", -124, param5, var12);
                  wl.field_f[5][30] = m.a("bruce_gun_idle_to_run", -127, param5, var12);
                  wl.field_f[5][32] = m.a("bruce_push_small_left", -127, param5, var12);
                  wl.field_f[5][33] = m.a("bruce_push_small_right", -124, param5, var12);
                  wl.field_f[5][34] = m.a("bruce_cut_in_half", -125, param5, var12);
                  wl.field_f[5][36] = m.a("bruce_large_pull", -127, param5, var12);
                  wl.field_f[5][37] = m.a("bruce_cheer", -124, param5, var12);
                  wl.field_f[5][2] = m.a("bruce_pull_small", -127, param5, var12);
                  int incrementValue$10 = param3;
                  param3++;
                  var11.a(incrementValue$10, (byte) 47, param1);
                  wl.field_f[7][1] = m.a("hans_run", -125, param5, var12);
                  wl.field_f[7][14] = m.a("hans_key_idle", -124, param5, var12);
                  wl.field_f[7][15] = m.a("hans_key_run", -126, param5, var12);
                  wl.field_f[7][29] = m.a("hans_gun_run", -126, param5, var12);
                  wl.field_f[7][34] = m.a("hans_cut_in_half", -125, param5, var12);
                  wl.field_f[7][37] = m.a("hans_cheer", -127, param5, var12);
                  wl.field_f[2][1] = m.a("angelio_run", -128, param5, var12);
                  wl.field_f[2][5] = wl.field_f[11][5];
                  wl.field_f[2][14] = m.a("angelio_key_idle", -128, param5, var12);
                  wl.field_f[2][29] = m.a("angelio_gun_run", -127, param5, var12);
                  wl.field_f[2][34] = m.a("angelio_cut_in_half", -124, param5, var12);
                  wl.field_f[2][37] = m.a("angelio_cheer", -125, param5, var12);
                  wl.field_f[2][15] = m.a("angelio_key_run", -125, param5, var12);
                  wl.field_f[6][0] = m.a("feng_idle", -124, param5, var12);
                  wl.field_f[6][5] = m.a("feng_trait", -127, param5, var12);
                  wl.field_f[6][8] = m.a("feng_unsheath", -128, param5, var12);
                  wl.field_f[6][1] = m.a("feng_run", -125, param5, var12);
                  wl.field_f[6][15] = m.a("feng_key_run", -127, param5, var12);
                  wl.field_f[6][14] = m.a("feng_key_idle", -128, param5, var12);
                  wl.field_f[6][11] = m.a("feng_idol_idle", -128, param5, var12);
                  wl.field_f[6][17] = m.a("feng_gun_idle", -126, param5, var12);
                  wl.field_f[6][21] = m.a("feng_death_two", -128, param5, var12);
                  wl.field_f[6][23] = m.a("feng_trait_two", -127, param5, var12);
                  wl.field_f[6][28] = m.a("feng_resheath", -127, param5, var12);
                  wl.field_f[6][34] = m.a("feng_cut_in_half", -128, param5, var12);
                  wl.field_f[6][37] = m.a("feng_cheer", -124, param5, var12);
                  wl.field_f[6][36] = m.a("feng_large_pull", -124, param5, var12);
                  int incrementValue$11 = param3;
                  param3++;
                  var11.a(incrementValue$11, (byte) 47, param1);
                  wl.field_f[8][5] = wl.field_f[1][5];
                  wl.field_f[8][15] = m.a("jamille_key_run", -128, param5, var12);
                  wl.field_f[8][14] = m.a("jamille_key_idle", -125, param5, var12);
                  wl.field_f[8][34] = m.a("jamille_cut_in_half", -127, param5, var12);
                  wl.field_f[8][37] = m.a("jamille_cheer", -128, param5, var12);
                  wl.field_f[8][0] = wl.field_f[11][0];
                  wl.field_f[10][0] = m.a("piles_idle", -125, param5, var12);
                  wl.field_f[10][1] = m.a("piles_run", -124, param5, var12);
                  wl.field_f[10][2] = m.a("piles_pull_small", -126, param5, var12);
                  wl.field_f[10][3] = m.a("piles_push_large", -126, param5, var12);
                  wl.field_f[10][4] = m.a("piles_skid", -128, param5, var12);
                  wl.field_f[10][5] = m.a("piles_trait", -127, param5, var12);
                  wl.field_f[10][6] = m.a("piles_wobble", -128, param5, var12);
                  wl.field_f[10][7] = m.a("piles_shooting", -125, param5, var12);
                  wl.field_f[10][8] = m.a("piles_unsheath", -128, param5, var12);
                  wl.field_f[10][9] = m.a("piles_death", -127, param5, var12);
                  wl.field_f[10][10] = m.a("piles_ashes", -128, param5, var12);
                  wl.field_f[10][11] = m.a("piles_idol_idle", -127, param5, var12);
                  wl.field_f[10][12] = m.a("piles_carry", -127, param5, var12);
                  wl.field_f[10][13] = m.a("piles_idol_skid", -124, param5, var12);
                  wl.field_f[10][14] = m.a("piles_key_idle", -124, param5, var12);
                  wl.field_f[10][15] = m.a("piles_key_run", -127, param5, var12);
                  wl.field_f[10][21] = m.a("piles_death_two", -125, param5, var12);
                  wl.field_f[10][22] = m.a("piles_death_three", -128, param5, var12);
                  wl.field_f[10][36] = m.a("piles_large_pull", -124, param5, var12);
                  int incrementValue$12 = param3;
                  param3++;
                  var11.a(incrementValue$12, (byte) 47, param1);
                  wl.field_f[10][18] = m.a("piles_fall_two", -124, param5, var12);
                  wl.field_f[10][17] = m.a("piles_gun_idle", -125, param5, var12);
                  wl.field_f[10][19] = m.a("piles_idle_to_run", -128, param5, var12);
                  wl.field_f[10][20] = m.a("piles_run_to_idle", -128, param5, var12);
                  wl.field_f[10][23] = m.a("piles_trait_two", -128, param5, var12);
                  wl.field_f[10][24] = m.a("piles_creep", -128, param5, var12);
                  wl.field_f[10][25] = m.a("piles_boulder_death", -124, param5, var12);
                  wl.field_f[10][26] = m.a("piles_idle_to_push", -126, param5, var12);
                  wl.field_f[10][28] = m.a("piles_resheath", -127, param5, var12);
                  wl.field_f[10][29] = m.a("piles_gun_run", -125, param5, var12);
                  wl.field_f[10][31] = m.a("piles_gun_run_to_idle", -126, param5, var12);
                  wl.field_f[10][30] = m.a("piles_gun_idle_to_run", -127, param5, var12);
                  wl.field_f[10][32] = m.a("piles_push_small_left", -126, param5, var12);
                  wl.field_f[10][33] = m.a("piles_push_small_right", -127, param5, var12);
                  wl.field_f[10][34] = m.a("piles_cut_in_half", -126, param5, var12);
                  wl.field_f[10][35] = wl.field_f[10][22];
                  wl.field_f[10][37] = m.a("piles_cheer", -128, param5, var12);
                  wl.field_f[12][5] = wl.field_f[10][5];
                  wl.field_f[12][14] = m.a("wilbur_key_idle", -126, param5, var12);
                  wl.field_f[12][34] = m.a("wilbur_cut_in_half", -125, param5, var12);
                  wl.field_f[12][37] = m.a("wilbur_cheer", -125, param5, var12);
                  wl.field_f[12][1] = m.a("wilbur_run", -128, param5, var12);
                  var13 = "new_skeleton";
                  qja.field_f = new dk[10];
                  qja.field_f[0] = m.a("new_skeleton_idle", -124, param5, var13);
                  qja.field_f[1] = m.a("new_skeleton_walk", -126, param5, var13);
                  qja.field_f[2] = m.a("new_skeleton_walk_2", -127, param5, var13);
                  qja.field_f[3] = m.a("new_skeleton_death", -128, param5, var13);
                  qja.field_f[4] = m.a("new_skeleton_head_pull", -124, param5, var13);
                  qja.field_f[5] = m.a("new_skeleton_fire_death", -124, param5, var13);
                  var14 = "snake";
                  qja.field_f[6] = m.a("snake_idle", -128, param5, var14);
                  qja.field_f[7] = m.a("snake_walk", -124, param5, var14);
                  qja.field_f[8] = m.a("snake_idle_to_walk", -126, param5, var14);
                  qja.field_f[9] = m.a("snake_walk_to_idle", -125, param5, var14);
                  int incrementValue$13 = param3;
                  param3++;
                  var11.a(incrementValue$13, (byte) 47, param1);
                  var15 = "rope_bridge";
                  cva.field_c = new dk[4];
                  cva.field_c[0] = m.a("start", -127, param5, var15);
                  cva.field_c[1] = m.a("end", -127, param5, var15);
                  cva.field_c[2] = m.a("loop_start", -127, param5, var15);
                  cva.field_c[3] = m.a("loop_section", -126, param5, var15);
                  jf.field_p = new dk[13];
                  if (!param2) {
                    break L2;
                  } else {
                    field_p = false;
                    break L2;
                  }
                }
                jf.field_p[0] = m.a("fire", -128, param5, "brazier");
                jf.field_p[1] = m.a("fire", -126, param5, "torch");
                jf.field_p[2] = m.a("fire", -126, param5, "spitting_torch");
                jf.field_p[3] = m.a("platform1_crumble", -124, param5, "platform");
                jf.field_p[4] = m.a("platform2_crumble", -124, param5, "platform");
                jf.field_p[5] = m.a("platform3_crumble", -126, param5, "platform");
                jf.field_p[6] = m.a("key_turn", -128, param5, "keyblock");
                jf.field_p[7] = m.a("cauldron_bubbles", -124, param5, "bubbles");
                jf.field_p[8] = m.a("lava_bubbles", -127, param5, "bubbles");
                jf.field_p[9] = m.a("coin_collect", -128, param5, "coin");
                jf.field_p[10] = m.a("platform1_crumble_grey", -125, param5, "platform_grey");
                jf.field_p[11] = m.a("platform2_crumble_grey", -128, param5, "platform_grey");
                jf.field_p[12] = m.a("platform3_crumble_grey", -124, param5, "platform_grey");
                return;
              } else {
                L3: {
                  if (var8 == 0) {
                    break L3;
                  } else {
                    var9 = 0;
                    L4: while (true) {
                      if (var9 >= 38) {
                        break L3;
                      } else {
                        wl.field_f[var8][var9] = wl.field_f[0][var9];
                        var9++;
                        continue L4;
                      }
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          } else {
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        RuntimeException decompiledCaughtException = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = param0;
            var6 = param1;
            var7 = -param1;
            var8 = -1;
            var9 = rp.a(ss.field_c, -16226, pka.field_b, param3 + param1);
            var10 = rp.a(ss.field_c, -16226, pka.field_b, param3 + -param1);
            nra.a((byte) -55, param2, var9, vaa.field_a[param4], var10);
            L1: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L2: {
                  var8 += 2;
                  var7 = var7 + var8;
                  if (var7 > 0) {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var11 = param4 + -var6;
                    var12 = var6 + param4;
                    if (var12 < gca.field_d) {
                      break L2;
                    } else {
                      if (var11 > hc.field_h) {
                        break L2;
                      } else {
                        L3: {
                          var13 = rp.a(ss.field_c, param0 ^ -16226, pka.field_b, var5_int + param3);
                          var14 = rp.a(ss.field_c, -16226, pka.field_b, param3 - var5_int);
                          if (var12 > hc.field_h) {
                            break L3;
                          } else {
                            nra.a((byte) -55, param2, var13, vaa.field_a[var12], var14);
                            break L3;
                          }
                        }
                        if (var11 < gca.field_d) {
                          break L2;
                        } else {
                          nra.a((byte) -55, param2, var13, vaa.field_a[var11], var14);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5_int++;
                var11 = param4 - var5_int;
                var12 = param4 + var5_int;
                if (gca.field_d > var12) {
                  continue L1;
                } else {
                  if (var11 > hc.field_h) {
                    continue L1;
                  } else {
                    L4: {
                      var13 = rp.a(ss.field_c, param0 ^ -16226, pka.field_b, param3 + var6);
                      var14 = rp.a(ss.field_c, param0 + -16226, pka.field_b, param3 - var6);
                      if (hc.field_h < var12) {
                        break L4;
                      } else {
                        nra.a((byte) -55, param2, var13, vaa.field_a[var12], var14);
                        break L4;
                      }
                    }
                    if (gca.field_d > var11) {
                      continue L1;
                    } else {
                      nra.a((byte) -55, param2, var13, vaa.field_a[var11], var14);
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var5, "nfa.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var18 = null;
        int[][] var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var21 = ((nfa) this).field_h.a(param0, (byte) 125);
          var20 = var21;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var3 = var17;
          if (((nfa) this).field_h.field_f) {
            L1: {
              var5 = ns.field_g / ((nfa) this).field_m;
              var6 = qda.field_i / ((nfa) this).field_o;
              if (var6 <= 0) {
                var4 = ((nfa) this).a(0, 0, -1);
                break L1;
              } else {
                var7_int = param0 % var6;
                var4 = ((nfa) this).a(var7_int * qda.field_i / var6, 0, param1);
                break L1;
              }
            }
            var7 = var4[0];
            var8 = var4[1];
            var9 = var4[2];
            var10 = var21[0];
            var11 = var21[1];
            var12 = var21[2];
            var13 = 0;
            L2: while (true) {
              if (ns.field_g <= var13) {
                break L0;
              } else {
                L3: {
                  if (var5 <= 0) {
                    var14 = 0;
                    break L3;
                  } else {
                    var15 = var13 % var5;
                    var14 = var15 * ns.field_g / var5;
                    break L3;
                  }
                }
                var10[var13] = var7[var14];
                var11[var13] = var8[var14];
                var12[var13] = var9[var14];
                var13++;
                continue L2;
              }
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (param1 == -1) {
            break L4;
          } else {
            field_n = null;
            break L4;
          }
        }
        return var3;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            nfa.d((byte) -85);
            break L0;
          }
        }
        L1: {
          var3 = ((nfa) this).field_i.a((byte) 78, param1);
          if (!((nfa) this).field_i.field_d) {
            break L1;
          } else {
            L2: {
              var5 = ns.field_g / ((nfa) this).field_m;
              var6 = qda.field_i / ((nfa) this).field_o;
              if (var6 <= 0) {
                var4 = ((nfa) this).c(0, -84, 0);
                break L2;
              } else {
                var7 = param1 % var6;
                var4 = ((nfa) this).c(0, -116, var7 * qda.field_i / var6);
                break L2;
              }
            }
            var10 = 0;
            var7 = var10;
            L3: while (true) {
              if (var10 >= ns.field_g) {
                break L1;
              } else {
                if (var5 > 0) {
                  var8 = var10 % var5;
                  var3[var10] = var4[var8 * ns.field_g / var5];
                  var10++;
                  continue L3;
                } else {
                  var3[var10] = var4[0];
                  var10++;
                  continue L3;
                }
              }
            }
          }
        }
        return var3;
    }

    public static void d(byte param0) {
        int var1 = -71 / ((-44 - param0) / 55);
        field_n = null;
        field_q = null;
    }

    final static void a(int[][] param0, int param1) {
        try {
            vaa.field_a = param0;
            int var2_int = -93 % ((param1 - 57) / 49);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nfa.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public nfa() {
        super(1, false);
        ((nfa) this).field_o = 4;
        ((nfa) this).field_m = 4;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 == var4_int) {
                ((nfa) this).field_m = param1.h(param0 + 148);
                break L1;
              } else {
                if (var4_int != 1) {
                  break L1;
                } else {
                  ((nfa) this).field_o = param1.h(255);
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 107) {
                break L2;
              } else {
                nfa.a((int[][]) null, 80);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("nfa.A(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = (os) (Object) new pq();
        field_n = new gt();
        field_p = false;
    }
}
