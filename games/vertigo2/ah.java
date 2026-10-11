/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ah extends mo {
    static String field_j;
    static int field_l;
    static String field_k;

    final static void a(byte param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, 124);
        if (param0 != -50) {
          return;
        }
        try {
          var2.f(1, param0 - 46);
          var2.f(0, -100);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ah.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        try {
          field_j = null;
          field_k = null;
          if (param0 >= -124) {
            ah.a((byte) 82);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "ah.F(" + param0 + ')');
        }
    }

    final static void a(int param0, r param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1292_0;
            StringBuilder stackIn_1292_1;
            String stackIn_1293_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int param0;
            r param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, r initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1292_0 = null;
                this.stackIn_1292_1 = null;
                this.stackIn_1293_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                po.field_e = param1;
                var2 = en.a((byte) -21, "text_game_name");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -54, "achievement_names,0");
                if (var2 != null) {
                  hi.field_i[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -52, "achievement_names,1");
                if (null != var2) {
                  hi.field_i[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -73, "achievement_names,2");
                if (var2 != null) {
                  hi.field_i[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -10, "achievement_names,3");
                if (var2 != null) {
                  hi.field_i[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -36, "achievement_names,4");
                if (var2 != null) {
                  hi.field_i[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -80, "achievement_names,5");
                if (var2 != null) {
                  hi.field_i[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -59, "achievement_names,6");
                if (null != var2) {
                  hi.field_i[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -38, "achievement_names,7");
                if (var2 != null) {
                  hi.field_i[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -77, "achievement_names,8");
                if (null != var2) {
                  hi.field_i[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -96, "achievement_names,9");
                if (var2 != null) {
                  hi.field_i[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -84, "achievement_names,10");
                if (var2 != null) {
                  hi.field_i[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -55, "achievement_names,11");
                if (null != var2) {
                  hi.field_i[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "achievement_names,12");
                if (var2 != null) {
                  hi.field_i[12] = in.a(0, var2);
                }
                var2 = en.a((byte) -123, "achievement_criteria,0");
                if (var2 != null) {
                  nj.field_i[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -50, "achievement_criteria,1");
                if (var2 != null) {
                  nj.field_i[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -30, "achievement_criteria,2");
                if (null != var2) {
                  nj.field_i[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -40, "achievement_criteria,3");
                if (null != var2) {
                  nj.field_i[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -12, "achievement_criteria,4");
                if (var2 != null) {
                  nj.field_i[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -107, "achievement_criteria,5");
                if (null != var2) {
                  nj.field_i[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -25, "achievement_criteria,6");
                if (var2 != null) {
                  nj.field_i[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -23, "achievement_criteria,7");
                if (var2 != null) {
                  nj.field_i[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -45, "achievement_criteria,8");
                if (null != var2) {
                  nj.field_i[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -34, "achievement_criteria,9");
                if (null != var2) {
                  nj.field_i[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -16, "achievement_criteria,10");
                if (var2 != null) {
                  nj.field_i[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -80, "achievement_criteria,11");
                if (var2 != null) {
                  nj.field_i[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -114, "achievement_criteria,12");
                if (var2 != null) {
                  nj.field_i[12] = in.a(0, var2);
                }
                var2 = en.a((byte) -30, "TIMES");
                if (null != var2) {
                  uj.field_k = in.a(0, var2);
                }
                var2 = en.a((byte) -59, "ANY_KEY_TO_CLOSE");
                if (var2 != null) {
                  bg.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -95, "ANY_KEY_TO_CONTINUE");
                if (null != var2) {
                  md.field_y = in.a(0, var2);
                }
                var2 = en.a((byte) -106, "INS_CONT_ARROW_KEYS");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -51, "INS_CONT_BASE");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -110, "INS_CONT_BASE_2P");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -50, "INSTRUCTIONS_P1");
                if (var2 != null) {
                  sd.field_K = in.a(0, var2);
                }
                var2 = en.a((byte) -121, "INSTRUCTIONS_CONTROLS");
                if (null != var2) {
                  pp.field_w = in.a(0, var2);
                }
                var2 = en.a((byte) -37, "INSTRUCTIONS_INGAMECONTROLS");
                if (null != var2) {
                  tq.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -110, "INSTRUCTIONS_CONTROLS_KEYS");
                if (null != var2) {
                  op.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "INSTRUCTIONS_INGAMECONTROLS_KEYS");
                if (var2 != null) {
                  vl.field_g = in.a(0, var2);
                }
                var2 = en.a((byte) -71, "instructions_block_names,0");
                if (null != var2) {
                  aa.field_Sb[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -16, "instructions_block_names,1");
                if (null != var2) {
                  aa.field_Sb[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -75, "instructions_block_names,2");
                if (null != var2) {
                  aa.field_Sb[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -40, "instructions_block_names,3");
                if (null != var2) {
                  aa.field_Sb[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -9, "instructions_block_names,4");
                if (null != var2) {
                  aa.field_Sb[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -68, "instructions_block_names,5");
                if (var2 != null) {
                  aa.field_Sb[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -13, "instructions_block_names,6");
                if (null != var2) {
                  aa.field_Sb[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -79, "instructions_block_names,7");
                if (var2 != null) {
                  aa.field_Sb[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -66, "instructions_block_names,8");
                if (var2 != null) {
                  aa.field_Sb[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -37, "instructions_block_names,9");
                if (null != var2) {
                  aa.field_Sb[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -113, "instructions_block_names,10");
                if (var2 != null) {
                  aa.field_Sb[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -115, "instructions_block_names,11");
                if (var2 != null) {
                  aa.field_Sb[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -126, "instructions_block_descriptions,0");
                if (var2 != null) {
                  uj.field_j[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -22, "instructions_block_descriptions,1");
                if (var2 != null) {
                  uj.field_j[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "instructions_block_descriptions,2");
                if (null != var2) {
                  uj.field_j[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -100, "instructions_block_descriptions,3");
                if (null != var2) {
                  uj.field_j[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -20, "instructions_block_descriptions,4");
                if (var2 != null) {
                  uj.field_j[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -70, "instructions_block_descriptions,5");
                if (null != var2) {
                  uj.field_j[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -81, "instructions_block_descriptions,6");
                if (null != var2) {
                  uj.field_j[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -27, "instructions_block_descriptions,7");
                if (var2 != null) {
                  uj.field_j[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -36, "instructions_block_descriptions,8");
                if (var2 != null) {
                  uj.field_j[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -82, "instructions_block_descriptions,9");
                if (var2 != null) {
                  uj.field_j[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "instructions_block_descriptions,10");
                if (null != var2) {
                  uj.field_j[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "instructions_block_descriptions,11");
                if (var2 != null) {
                  uj.field_j[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -82, "instructions_item_names,0");
                if (null != var2) {
                  bg.field_e[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -104, "instructions_item_names,1");
                if (var2 != null) {
                  bg.field_e[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -41, "instructions_item_names,2");
                if (null != var2) {
                  bg.field_e[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -109, "instructions_item_names,3");
                if (var2 != null) {
                  bg.field_e[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -115, "instructions_item_names,4");
                if (var2 != null) {
                  bg.field_e[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "instructions_item_names,5");
                if (var2 != null) {
                  bg.field_e[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -77, "instructions_item_names,6");
                if (null != var2) {
                  bg.field_e[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -19, "instructions_item_descriptions,0");
                if (var2 != null) {
                  ag.field_a[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -40, "instructions_item_descriptions,1");
                if (null != var2) {
                  ag.field_a[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -13, "instructions_item_descriptions,2");
                if (var2 != null) {
                  ag.field_a[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -39, "instructions_item_descriptions,3");
                if (var2 != null) {
                  ag.field_a[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -85, "instructions_item_descriptions,4");
                if (var2 != null) {
                  ag.field_a[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -17, "instructions_item_descriptions,5");
                if (null != var2) {
                  ag.field_a[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -119, "instructions_item_descriptions,6");
                if (var2 != null) {
                  ag.field_a[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -64, "INSTRUCTIONS_MULTIPLAYER_1");
                if (null != var2) {
                  ue.field_K = in.a(0, var2);
                }
                var2 = en.a((byte) -71, "INSTRUCTIONS_MULTIPLAYER_2");
                if (null != var2) {
                  th.field_k = in.a(0, var2);
                }
                var2 = en.a((byte) -7, "INSTRUCTIONS_MULTIPLAYER_3");
                if (var2 != null) {
                  nh.field_i = in.a(0, var2);
                }
                var2 = en.a((byte) -109, "TEXT_DETAIL");
                if (null != var2) {
                  vi.field_B = in.a(0, var2);
                }
                var2 = en.a((byte) -35, "DETAIL_NAMES,0");
                if (var2 != null) {
                  te.field_H[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -115, "DETAIL_NAMES,1");
                if (var2 != null) {
                  te.field_H[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -103, "DETAIL_NAMES,2");
                if (null != var2) {
                  te.field_H[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -117, "X_OF_Y");
                if (null != var2) {
                  lp.field_z = in.a(0, var2);
                }
                var2 = en.a((byte) -73, "GAMEOPTLABELS,0");
                if (null != var2) {
                  wo.field_V[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -21, "GAMEOPTLABELS,1");
                if (null != var2) {
                  wo.field_V[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -119, "GAMEOPTLABELS,2");
                if (var2 != null) {
                  wo.field_V[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "GAMEOPTNAMES,0,0");
                if (null != var2) {
                  wa.field_e[0][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -55, "GAMEOPTNAMES,0,1");
                if (null != var2) {
                  wa.field_e[0][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -124, "GAMEOPTNAMES,1,0");
                if (null != var2) {
                  wa.field_e[1][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -102, "GAMEOPTNAMES,1,1");
                if (var2 != null) {
                  wa.field_e[1][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -124, "GAMEOPTNAMES,1,2");
                if (null != var2) {
                  wa.field_e[1][2] = in.a(0, var2);
                }
                var2 = en.a((byte) -48, "GAMEOPTNAMES,1,3");
                if (null != var2) {
                  wa.field_e[1][3] = in.a(0, var2);
                }
                var2 = en.a((byte) -112, "GAMEOPTNAMES,1,4");
                if (null != var2) {
                  wa.field_e[1][4] = in.a(0, var2);
                }
                var2 = en.a((byte) -54, "GAMEOPTNAMES,1,5");
                if (null != var2) {
                  wa.field_e[1][5] = in.a(0, var2);
                }
                var2 = en.a((byte) -35, "GAMEOPTNAMES,1,6");
                if (var2 != null) {
                  wa.field_e[1][6] = in.a(0, var2);
                }
                var2 = en.a((byte) -102, "GAMEOPTNAMES,1,7");
                if (null != var2) {
                  wa.field_e[1][7] = in.a(0, var2);
                }
                var2 = en.a((byte) -27, "GAMEOPTNAMES,2,0");
                if (null != var2) {
                  wa.field_e[2][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -28, "GAMEOPTNAMES,2,1");
                if (var2 != null) {
                  wa.field_e[2][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -83, "GAMEOPTNAMES,2,2");
                if (null != var2) {
                  wa.field_e[2][2] = in.a(0, var2);
                }
                var2 = en.a((byte) -21, "GAMEOPTNAMES,2,3");
                if (var2 != null) {
                  wa.field_e[2][3] = in.a(0, var2);
                }
                var2 = en.a((byte) -56, "EOL_SCORES");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -26, "HIGHSCORES_NAME");
                if (null != var2) {
                  ni.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -24, "HIGHSCORES_SCORE");
                if (var2 != null) {
                  dl.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -76, "BLOCKS_PURPLE");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -70, "BLOCKS_BLUE");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -118, "WINS_P1");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -91, "WINS_P2");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -92, "DRAWS");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -101, "MAPVIEW_NOTE");
                if (var2 != null) {
                  aj.field_i = in.a(0, var2);
                }
                var2 = en.a((byte) -88, "TIME");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -82, "SECONDS_PENALTY");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -88, "LEVEL_SELECT_TIMEATTACK");
                if (null != var2) {
                  dg.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -102, "INTRO_SINGLEPLAYER_LEVEL");
                if (var2 != null) {
                  bl.field_o = in.a(0, var2);
                }
                var2 = en.a((byte) -112, "INTRO_MULTIPLAYER_LEVEL");
                if (null != var2) {
                  qh.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -92, "INTRO_MULTIPLAYER_MODE_COOP");
                if (var2 != null) {
                  bq.field_H = in.a(0, var2);
                }
                var2 = en.a((byte) -60, "INTRO_MULTIPLAYER_MODE_DEATHMATCH");
                if (null != var2) {
                  hk.field_r = in.a(0, var2);
                }
                var2 = en.a((byte) -67, "INTRO_MULTIPLAYER_PLAYER_RED");
                if (null != var2) {
                  dk.field_m = in.a(0, var2);
                }
                var2 = en.a((byte) -11, "INTRO_MULTIPLAYER_PLAYER_BLUE");
                if (null != var2) {
                  lk.field_h = in.a(0, var2);
                }
                var2 = en.a((byte) -96, "INTRO_MULTIPLAYER_PLAYERIS_RED");
                if (null != var2) {
                  lh.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -111, "INTRO_MULTIPLAYER_PLAYERIS_BLUE");
                if (var2 != null) {
                  de.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -51, "T_0");
                if (var2 != null) {
                  gg.field_s = in.a(0, var2);
                }
                var2 = en.a((byte) -7, "T_1");
                if (var2 != null) {
                  an.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -117, "T_2");
                if (var2 != null) {
                  jb.field_L = in.a(0, var2);
                }
                var2 = en.a((byte) -120, "T_3");
                if (var2 != null) {
                  le.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -122, "T_4");
                if (null != var2) {
                  og.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -104, "T_5");
                if (null != var2) {
                  kf.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -57, "T_6");
                if (var2 != null) {
                  b.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -37, "T_7");
                if (null != var2) {
                  b.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -41, "T_8");
                if (null != var2) {
                  pb.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -80, "T_9");
                if (null != var2) {
                  to.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -32, "TUTORIALTIP,0,0");
                if (var2 != null) {
                  hn.field_u[0][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -75, "TUTORIALTIP,1,0");
                if (var2 != null) {
                  hn.field_u[1][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -98, "TUTORIALTIP,2,0");
                if (null != var2) {
                  hn.field_u[2][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -16, "TUTORIALTIP,3,0");
                if (var2 != null) {
                  hn.field_u[3][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -59, "TUTORIALTIP,3,1");
                if (null != var2) {
                  hn.field_u[3][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -108, "TUTORIALTIP,4,0");
                if (var2 != null) {
                  hn.field_u[4][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -77, "TUTORIALTIP,4,1");
                if (var2 != null) {
                  hn.field_u[4][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -47, "TUTORIALTIP,5,0");
                if (null != var2) {
                  hn.field_u[5][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -60, "TUTORIALTIP,5,1");
                if (null != var2) {
                  hn.field_u[5][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -79, "TUTORIALTIP,6,0");
                if (null != var2) {
                  hn.field_u[6][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -95, "TUTORIALTIP,6,1");
                if (var2 != null) {
                  hn.field_u[6][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -36, "TUTORIALTIP,7,0");
                if (var2 != null) {
                  hn.field_u[7][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -48, "TUTORIALTIP,7,1");
                if (var2 != null) {
                  hn.field_u[7][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -56, "TUTORIALTIP,8,0");
                if (var2 != null) {
                  hn.field_u[8][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -126, "TUTORIALTIP,8,1");
                if (null != var2) {
                  hn.field_u[8][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -119, "TUTORIALTIP,9,0");
                if (null != var2) {
                  hn.field_u[9][0] = in.a(0, var2);
                }
                var2 = en.a((byte) -76, "TUTORIALTIP,9,1");
                if (null != var2) {
                  hn.field_u[9][1] = in.a(0, var2);
                }
                var2 = en.a((byte) -94, "pass1,0");
                if (var2 != null) {
                  km.field_w[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -126, "pass1,1");
                if (var2 != null) {
                  km.field_w[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -78, "pass1,2");
                if (null != var2) {
                  km.field_w[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -68, "pass1,3");
                if (null != var2) {
                  km.field_w[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -28, "pass1,4");
                if (var2 != null) {
                  km.field_w[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -82, "pass1,5");
                if (null != var2) {
                  km.field_w[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -76, "pass1,6");
                if (var2 != null) {
                  km.field_w[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -116, "pass1,7");
                if (null != var2) {
                  km.field_w[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -39, "pass1,8");
                if (null != var2) {
                  km.field_w[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -17, "pass1,9");
                if (null != var2) {
                  km.field_w[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -9, "pass1,10");
                if (null != var2) {
                  km.field_w[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -84, "pass1,11");
                if (var2 != null) {
                  km.field_w[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -12, "pass1,12");
                if (null != var2) {
                  km.field_w[12] = in.a(0, var2);
                }
                var2 = en.a((byte) -46, "pass1,13");
                if (null != var2) {
                  km.field_w[13] = in.a(0, var2);
                }
                var2 = en.a((byte) -17, "pass1,14");
                if (null != var2) {
                  km.field_w[14] = in.a(0, var2);
                }
                var2 = en.a((byte) -49, "pass1,15");
                if (null != var2) {
                  km.field_w[15] = in.a(0, var2);
                }
                var2 = en.a((byte) -95, "pass1,16");
                if (null != var2) {
                  km.field_w[16] = in.a(0, var2);
                }
                var2 = en.a((byte) -76, "pass1,17");
                if (null != var2) {
                  km.field_w[17] = in.a(0, var2);
                }
                var2 = en.a((byte) -50, "pass1,18");
                if (var2 != null) {
                  km.field_w[18] = in.a(0, var2);
                }
                var2 = en.a((byte) -10, "pass1,19");
                if (null != var2) {
                  km.field_w[19] = in.a(0, var2);
                }
                var2 = en.a((byte) -13, "pass1,20");
                if (var2 != null) {
                  km.field_w[20] = in.a(0, var2);
                }
                var2 = en.a((byte) -125, "pass1,21");
                if (var2 != null) {
                  km.field_w[21] = in.a(0, var2);
                }
                var2 = en.a((byte) -51, "pass1,22");
                if (var2 != null) {
                  km.field_w[22] = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "pass1,23");
                var3 = -38 % ((46 - param0) / 52);
                if (null != var2) {
                  km.field_w[23] = in.a(0, var2);
                }
                var2 = en.a((byte) -51, "pass1,24");
                if (null != var2) {
                  km.field_w[24] = in.a(0, var2);
                }
                var2 = en.a((byte) -88, "pass1,25");
                if (null != var2) {
                  km.field_w[25] = in.a(0, var2);
                }
                var2 = en.a((byte) -72, "pass1,26");
                if (null != var2) {
                  km.field_w[26] = in.a(0, var2);
                }
                var2 = en.a((byte) -28, "pass1,27");
                if (null != var2) {
                  km.field_w[27] = in.a(0, var2);
                }
                var2 = en.a((byte) -95, "pass1,28");
                if (var2 != null) {
                  km.field_w[28] = in.a(0, var2);
                }
                var2 = en.a((byte) -48, "pass1,29");
                if (var2 != null) {
                  km.field_w[29] = in.a(0, var2);
                }
                var2 = en.a((byte) -77, "pass1,30");
                if (null != var2) {
                  km.field_w[30] = in.a(0, var2);
                }
                var2 = en.a((byte) -16, "pass1,31");
                if (null != var2) {
                  km.field_w[31] = in.a(0, var2);
                }
                var2 = en.a((byte) -74, "pass1,32");
                if (var2 != null) {
                  km.field_w[32] = in.a(0, var2);
                }
                var2 = en.a((byte) -70, "pass1,33");
                if (null != var2) {
                  km.field_w[33] = in.a(0, var2);
                }
                var2 = en.a((byte) -93, "pass1,34");
                if (null != var2) {
                  km.field_w[34] = in.a(0, var2);
                }
                var2 = en.a((byte) -48, "pass1,35");
                if (null != var2) {
                  km.field_w[35] = in.a(0, var2);
                }
                var2 = en.a((byte) -127, "pass1,36");
                if (var2 != null) {
                  km.field_w[36] = in.a(0, var2);
                }
                var2 = en.a((byte) -88, "pass1,37");
                if (null != var2) {
                  km.field_w[37] = in.a(0, var2);
                }
                var2 = en.a((byte) -86, "pass1,38");
                if (null != var2) {
                  km.field_w[38] = in.a(0, var2);
                }
                var2 = en.a((byte) -66, "pass1,39");
                if (var2 != null) {
                  km.field_w[39] = in.a(0, var2);
                }
                var2 = en.a((byte) -53, "pass1,40");
                if (var2 != null) {
                  km.field_w[40] = in.a(0, var2);
                }
                var2 = en.a((byte) -44, "pass1,41");
                if (var2 != null) {
                  km.field_w[41] = in.a(0, var2);
                }
                var2 = en.a((byte) -11, "pass1,42");
                if (null != var2) {
                  km.field_w[42] = in.a(0, var2);
                }
                var2 = en.a((byte) -9, "pass1,43");
                if (null != var2) {
                  km.field_w[43] = in.a(0, var2);
                }
                var2 = en.a((byte) -121, "pass1,44");
                if (null != var2) {
                  km.field_w[44] = in.a(0, var2);
                }
                var2 = en.a((byte) -35, "pass1,45");
                if (null != var2) {
                  km.field_w[45] = in.a(0, var2);
                }
                var2 = en.a((byte) -122, "pass1,46");
                if (var2 != null) {
                  km.field_w[46] = in.a(0, var2);
                }
                var2 = en.a((byte) -56, "pass1,47");
                if (null != var2) {
                  km.field_w[47] = in.a(0, var2);
                }
                var2 = en.a((byte) -50, "pass1,48");
                if (var2 != null) {
                  km.field_w[48] = in.a(0, var2);
                }
                var2 = en.a((byte) -74, "pass1,49");
                if (var2 != null) {
                  km.field_w[49] = in.a(0, var2);
                }
                var2 = en.a((byte) -66, "pass1,50");
                if (null != var2) {
                  km.field_w[50] = in.a(0, var2);
                }
                var2 = en.a((byte) -109, "pass2,0");
                if (var2 != null) {
                  Vertigo2.field_G[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -127, "pass2,1");
                if (var2 != null) {
                  Vertigo2.field_G[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -69, "pass2,2");
                if (var2 != null) {
                  Vertigo2.field_G[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -102, "pass2,3");
                if (null != var2) {
                  Vertigo2.field_G[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -123, "pass2,4");
                if (var2 != null) {
                  Vertigo2.field_G[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -128, "pass2,5");
                if (var2 != null) {
                  Vertigo2.field_G[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -78, "pass2,6");
                if (var2 != null) {
                  Vertigo2.field_G[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -103, "pass2,7");
                if (null != var2) {
                  Vertigo2.field_G[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -34, "pass2,8");
                if (null != var2) {
                  Vertigo2.field_G[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -113, "pass2,9");
                if (null != var2) {
                  Vertigo2.field_G[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -34, "pass2,10");
                if (null != var2) {
                  Vertigo2.field_G[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -81, "pass2,11");
                if (var2 != null) {
                  Vertigo2.field_G[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -108, "pass2,12");
                if (var2 != null) {
                  Vertigo2.field_G[12] = in.a(0, var2);
                }
                var2 = en.a((byte) -40, "pass2,13");
                if (null != var2) {
                  Vertigo2.field_G[13] = in.a(0, var2);
                }
                var2 = en.a((byte) -73, "pass2,14");
                if (null != var2) {
                  Vertigo2.field_G[14] = in.a(0, var2);
                }
                var2 = en.a((byte) -7, "pass2,15");
                if (var2 != null) {
                  Vertigo2.field_G[15] = in.a(0, var2);
                }
                var2 = en.a((byte) -47, "pass2,16");
                if (null != var2) {
                  Vertigo2.field_G[16] = in.a(0, var2);
                }
                var2 = en.a((byte) -128, "pass2,17");
                if (null != var2) {
                  Vertigo2.field_G[17] = in.a(0, var2);
                }
                var2 = en.a((byte) -122, "pass2,18");
                if (null != var2) {
                  Vertigo2.field_G[18] = in.a(0, var2);
                }
                var2 = en.a((byte) -14, "pass2,19");
                if (var2 != null) {
                  Vertigo2.field_G[19] = in.a(0, var2);
                }
                var2 = en.a((byte) -55, "pass2,20");
                if (null != var2) {
                  Vertigo2.field_G[20] = in.a(0, var2);
                }
                var2 = en.a((byte) -76, "pass2,21");
                if (null != var2) {
                  Vertigo2.field_G[21] = in.a(0, var2);
                }
                var2 = en.a((byte) -98, "pass2,22");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  Vertigo2.field_G[22] = in.a(0, var2);
                }
                var2 = en.a((byte) -47, "pass2,23");
                if (null != var2) {
                  Vertigo2.field_G[23] = in.a(0, var2);
                }
                var2 = en.a((byte) -84, "pass2,24");
                if (var2 != null) {
                  Vertigo2.field_G[24] = in.a(0, var2);
                }
                var2 = en.a((byte) -127, "pass2,25");
                if (var2 != null) {
                  Vertigo2.field_G[25] = in.a(0, var2);
                }
                var2 = en.a((byte) -92, "pass2,26");
                if (var2 != null) {
                  Vertigo2.field_G[26] = in.a(0, var2);
                }
                var2 = en.a((byte) -47, "pass2,27");
                if (var2 != null) {
                  Vertigo2.field_G[27] = in.a(0, var2);
                }
                var2 = en.a((byte) -98, "pass2,28");
                if (var2 != null) {
                  Vertigo2.field_G[28] = in.a(0, var2);
                }
                var2 = en.a((byte) -12, "pass2,29");
                if (var2 != null) {
                  Vertigo2.field_G[29] = in.a(0, var2);
                }
                var2 = en.a((byte) -36, "pass2,30");
                if (null != var2) {
                  Vertigo2.field_G[30] = in.a(0, var2);
                }
                var2 = en.a((byte) -69, "levelnames_deathmatch,0");
                if (var2 != null) {
                  ni.field_g[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -86, "levelnames_deathmatch,1");
                if (var2 != null) {
                  ni.field_g[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -46, "levelnames_deathmatch,2");
                if (var2 != null) {
                  ni.field_g[2] = in.a(0, var2);
                }
                var2 = en.a((byte) -43, "levelnames_deathmatch,3");
                if (null != var2) {
                  ni.field_g[3] = in.a(0, var2);
                }
                var2 = en.a((byte) -17, "levelnames_deathmatch,4");
                if (var2 != null) {
                  ni.field_g[4] = in.a(0, var2);
                }
                var2 = en.a((byte) -23, "levelnames_deathmatch,5");
                if (var2 != null) {
                  ni.field_g[5] = in.a(0, var2);
                }
                var2 = en.a((byte) -70, "levelnames_deathmatch,6");
                if (null != var2) {
                  ni.field_g[6] = in.a(0, var2);
                }
                var2 = en.a((byte) -70, "levelnames_deathmatch,7");
                if (null != var2) {
                  ni.field_g[7] = in.a(0, var2);
                }
                var2 = en.a((byte) -12, "levelnames_deathmatch,8");
                if (var2 != null) {
                  ni.field_g[8] = in.a(0, var2);
                }
                var2 = en.a((byte) -68, "levelnames_deathmatch,9");
                if (var2 != null) {
                  ni.field_g[9] = in.a(0, var2);
                }
                var2 = en.a((byte) -40, "levelnames_deathmatch,10");
                if (null != var2) {
                  ni.field_g[10] = in.a(0, var2);
                }
                var2 = en.a((byte) -74, "levelnames_deathmatch,11");
                if (null != var2) {
                  ni.field_g[11] = in.a(0, var2);
                }
                var2 = en.a((byte) -108, "levelnames_deathmatch,12");
                if (null != var2) {
                  ni.field_g[12] = in.a(0, var2);
                }
                var2 = en.a((byte) -85, "levelnames_deathmatch,13");
                if (null != var2) {
                  ni.field_g[13] = in.a(0, var2);
                }
                var2 = en.a((byte) -120, "levelnames_deathmatch,14");
                if (null != var2) {
                  ni.field_g[14] = in.a(0, var2);
                }
                var2 = en.a((byte) -103, "levelnames_deathmatch,15");
                if (var2 != null) {
                  ni.field_g[15] = in.a(0, var2);
                }
                var2 = en.a((byte) -29, "levelnames_deathmatch,16");
                if (var2 != null) {
                  ni.field_g[16] = in.a(0, var2);
                }
                var2 = en.a((byte) -126, "levelnames_deathmatch,17");
                if (var2 != null) {
                  ni.field_g[17] = in.a(0, var2);
                }
                var2 = en.a((byte) -14, "levelnames_deathmatch,18");
                if (null != var2) {
                  ni.field_g[18] = in.a(0, var2);
                }
                var2 = en.a((byte) -26, "levelnames_deathmatch,19");
                if (var2 != null) {
                  ni.field_g[19] = in.a(0, var2);
                }
                var2 = en.a((byte) -39, "levelnames_deathmatch,20");
                if (null != var2) {
                  ni.field_g[20] = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "levelnames_deathmatch,21");
                if (var2 != null) {
                  ni.field_g[21] = in.a(0, var2);
                }
                var2 = en.a((byte) -127, "levelnames_deathmatch,22");
                if (null != var2) {
                  ni.field_g[22] = in.a(0, var2);
                }
                var2 = en.a((byte) -27, "levelnames_deathmatch,23");
                if (null != var2) {
                  ni.field_g[23] = in.a(0, var2);
                }
                var2 = en.a((byte) -32, "levelnames_deathmatch,24");
                if (null != var2) {
                  ni.field_g[24] = in.a(0, var2);
                }
                var2 = en.a((byte) -74, "levelnames_deathmatch,25");
                if (null != var2) {
                  ni.field_g[25] = in.a(0, var2);
                }
                var2 = en.a((byte) -77, "levelnames_deathmatch,26");
                if (null != var2) {
                  ni.field_g[26] = in.a(0, var2);
                }
                var2 = en.a((byte) -46, "levelnames_deathmatch,27");
                if (null != var2) {
                  ni.field_g[27] = in.a(0, var2);
                }
                var2 = en.a((byte) -89, "levelnames_deathmatch,28");
                if (var2 != null) {
                  ni.field_g[28] = in.a(0, var2);
                }
                var2 = en.a((byte) -68, "levelnames_deathmatch,29");
                if (null != var2) {
                  ni.field_g[29] = in.a(0, var2);
                }
                var2 = en.a((byte) -100, "levelnames_deathmatch,30");
                if (var2 != null) {
                  ni.field_g[30] = in.a(0, var2);
                }
                var2 = en.a((byte) -7, "levelnames_deathmatch,31");
                if (null != var2) {
                  ni.field_g[31] = in.a(0, var2);
                }
                var2 = en.a((byte) -27, "levelnames_deathmatch,32");
                if (var2 != null) {
                  ni.field_g[32] = in.a(0, var2);
                }
                var2 = en.a((byte) -50, "levelnames_deathmatch,33");
                if (var2 != null) {
                  ni.field_g[33] = in.a(0, var2);
                }
                var2 = en.a((byte) -31, "levelnames_deathmatch,34");
                if (null != var2) {
                  ni.field_g[34] = in.a(0, var2);
                }
                var2 = en.a((byte) -117, "levelnames_deathmatch,35");
                if (var2 != null) {
                  ni.field_g[35] = in.a(0, var2);
                }
                var2 = en.a((byte) -115, "levelnames_deathmatch,36");
                if (var2 != null) {
                  ni.field_g[36] = in.a(0, var2);
                }
                var2 = en.a((byte) -27, "levelnames_deathmatch,37");
                if (var2 != null) {
                  ni.field_g[37] = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "levelnames_deathmatch,38");
                if (var2 != null) {
                  ni.field_g[38] = in.a(0, var2);
                }
                var2 = en.a((byte) -64, "levelnames_deathmatch,39");
                if (var2 != null) {
                  ni.field_g[39] = in.a(0, var2);
                }
                var2 = en.a((byte) -59, "levelnames_deathmatch,40");
                if (null != var2) {
                  ni.field_g[40] = in.a(0, var2);
                }
                var2 = en.a((byte) -54, "ONE_PLAYER_GAME");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -83, "TIMEATTACK_GAME");
                if (var2 != null) {
                  ek.field_C = in.a(0, var2);
                }
                var2 = en.a((byte) -56, "STANDARD_GAME");
                if (var2 != null) {
                  rh.field_E = in.a(0, var2);
                }
                var2 = en.a((byte) -61, "SELECT_SINGLEPLAYER_MODE");
                if (null != var2) {
                  nb.field_E = in.a(0, var2);
                }
                var2 = en.a((byte) -24, "TWO_PLAYER_COOP_GAME");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -124, "TWO_PLAYER_DEATHMATCH_GAME");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -97, "BACK");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -112, "GENERAL");
                if (var2 != null) {
                  ji.field_w = in.a(0, var2);
                }
                var2 = en.a((byte) -116, "CONTROLS_1P");
                if (null != var2) {
                  ao.field_R = in.a(0, var2);
                }
                var2 = en.a((byte) -54, "BLOCKS_1");
                if (var2 != null) {
                  uq.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -8, "BLOCKS_2");
                if (null != var2) {
                  fh.field_v = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "ITEMS_1");
                if (null != var2) {
                  fk.field_A = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "MULTIPLAYER");
                if (var2 != null) {
                  en.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -97, "PENALTY");
                if (var2 != null) {
                  jd.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -85, "GAMECOMPLETE");
                if (var2 != null) {
                  lr.field_I = in.a(0, var2);
                }
                var2 = en.a((byte) -57, "PERCENTBLUE");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -118, "PERCENTPURPLE");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -67, "NEXTLEVELIN");
                if (null != var2) {
                  lr.field_T = in.a(0, var2);
                }
                var2 = en.a((byte) -29, "DEATHMATCH");
                if (null != var2) {
                  tr.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -58, "COOP");
                if (null != var2) {
                  lp.field_A = in.a(0, var2);
                }
                var2 = en.a((byte) -54, "WINNINGPERCENTAGE");
                if (null != var2) {
                  gp.field_q = in.a(0, var2);
                }
                var2 = en.a((byte) -8, "YOUWON");
                if (null != var2) {
                  pe.field_L = in.a(0, var2);
                }
                var2 = en.a((byte) -59, "YOULOST");
                if (null != var2) {
                  ad.field_b = in.a(0, var2);
                }
                var2 = en.a((byte) -91, "YOUDREW");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -50, "YOUWONDEATHMATCH");
                if (var2 != null) {
                  or.field_l = in.a(0, var2);
                }
                var2 = en.a((byte) -20, "YOULOSTDEATHMATCH");
                if (null != var2) {
                  ua.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -13, "REDWONDEATHMATCH");
                if (null != var2) {
                  gr.field_ab = in.a(0, var2);
                }
                var2 = en.a((byte) -63, "BLUEWONDEATHMATCH");
                if (null != var2) {
                  rp.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -22, "YOUDREWDEATHMATCH");
                if (var2 != null) {
                  ri.field_z = in.a(0, var2);
                }
                var2 = en.a((byte) -21, "SCORESXTOY_DEATHMATCH");
                if (null != var2) {
                  hd.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -22, "YOUFINISHEDCOOP");
                if (var2 != null) {
                  ia.field_I = in.a(0, var2);
                }
                var2 = en.a((byte) -70, "YOUCOMPLETEDCOOP");
                if (null != var2) {
                  uh.field_lc = in.a(0, var2);
                }
                var2 = en.a((byte) -73, "YOUFAILEDCOOP");
                if (var2 != null) {
                  go.field_d = in.a(0, var2);
                }
                var2 = en.a((byte) -18, "STATS_STARTLEVEL");
                if (var2 != null) {
                  fk.field_G = in.a(0, var2);
                }
                var2 = en.a((byte) -75, "STATS_TARGETLEVEL");
                if (null != var2) {
                  le.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -23, "STATS_ENDLEVEL");
                if (var2 != null) {
                  we.field_H = in.a(0, var2);
                }
                var2 = en.a((byte) -16, "STATS_TILESPAINTED");
                if (var2 != null) {
                  sg.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -36, "STATS_LIVESLOST");
                if (null != var2) {
                  w.field_B = in.a(0, var2);
                }
                var2 = en.a((byte) -24, "STATS_TIMETAKEN");
                if (null != var2) {
                  km.field_u = in.a(0, var2);
                }
                var2 = en.a((byte) -96, "STATS_SPECTATORTIMETAKEN");
                if (null != var2) {
                  bs.field_Vb = in.a(0, var2);
                }
                var2 = en.a((byte) -31, "SECONDS");
                if (var2 != null) {
                  tn.field_g = in.a(0, var2);
                }
                var2 = en.a((byte) -44, "YOUDDIED");
                if (var2 != null) {
                  uj.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -22, "BLUEDIED");
                if (null != var2) {
                  rh.field_G = in.a(0, var2);
                }
                var2 = en.a((byte) -57, "REDDIED");
                if (null != var2) {
                  pe.field_t = in.a(0, var2);
                }
                var2 = en.a((byte) -120, "SPECTATOREND");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -62, "SPECTATORESULTWIN");
                if (var2 != null) {
                  Vertigo2.field_D = in.a(0, var2);
                }
                var2 = en.a((byte) -50, "SPECTATORESULTDRAW");
                if (null != var2) {
                  jp.field_u = in.a(0, var2);
                }
                var2 = en.a((byte) -55, "PURPLE");
                if (null != var2) {
                  rq.field_A = in.a(0, var2);
                }
                var2 = en.a((byte) -124, "BLUE");
                if (var2 != null) {
                  rq.field_x = in.a(0, var2);
                }
                var2 = en.a((byte) -124, "PLAYER_1");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -57, "PLAYER_2");
                if (null != var2) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -80, "LOGIN_REGISTER");
                if (var2 != null) {
                  in.a(0, var2);
                }
                var2 = en.a((byte) -84, "OPTIONS_TEXT");
                if (var2 != null) {
                  vo.field_v = in.a(0, var2);
                }
                var2 = en.a((byte) -102, "TITLE_LEVEL_SELECT");
                if (var2 != null) {
                  t.field_i = in.a(0, var2);
                }
                var2 = en.a((byte) -19, "INGAME_SCORE");
                if (var2 != null) {
                  mj.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -60, "INGAME_DEATHMATCHSCORE");
                if (var2 != null) {
                  kb.field_f = in.a(0, var2);
                }
                var2 = en.a((byte) -33, "INGAME_TIME");
                if (null != var2) {
                  mc.field_f = in.a(0, var2);
                }
                var2 = en.a((byte) -124, "GAMEOVER");
                if (var2 != null) {
                  sr.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -103, "LEVELCOMPLETE");
                if (null != var2) {
                  wp.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -112, "COOPCOMPLETE");
                if (var2 != null) {
                  dh.field_e = in.a(0, var2);
                }
                var2 = en.a((byte) -19, "ANONPLAYER");
                if (var2 != null) {
                  ed.field_o = in.a(0, var2);
                }
                var2 = en.a((byte) -57, "OBSCURED");
                if (null != var2) {
                  iq.field_z = in.a(0, var2);
                }
                var2 = en.a((byte) -15, "TIMEATTACK_UNLUCKY");
                if (var2 != null) {
                  vq.field_k = in.a(0, var2);
                }
                var2 = en.a((byte) -89, "TIMEATTACK_YOURTIME");
                if (var2 != null) {
                  wq.field_L = in.a(0, var2);
                }
                var2 = en.a((byte) -31, "TIMEATTACK_YOURBESTTIME");
                if (var2 != null) {
                  he.field_t = in.a(0, var2);
                }
                var2 = en.a((byte) -66, "TIMEATTACK_PLUS");
                if (null != var2) {
                  lr.field_K = in.a(0, var2);
                }
                var2 = en.a((byte) -88, "TIMEATTACK_CURRENTMEDAL");
                if (var2 != null) {
                  ke.field_c = in.a(0, var2);
                }
                var2 = en.a((byte) -95, "TIMEATTACK_NEWBESTTIME");
                if (var2 != null) {
                  fa.field_r = in.a(0, var2);
                }
                var2 = en.a((byte) -29, "TIMEATTACK_PREVIOUSBESTTIME");
                if (var2 != null) {
                  or.field_g = in.a(0, var2);
                }
                var2 = en.a((byte) -14, "TIMEATTACK_MINUS");
                if (null != var2) {
                  to.field_f = in.a(0, var2);
                }
                var2 = en.a((byte) -42, "TIMEATTACK_NEWMEDAL");
                if (null != var2) {
                  hd.field_h = in.a(0, var2);
                }
                var2 = en.a((byte) -104, "TIMEATTACK_TOTALTIME");
                if (var2 != null) {
                  mo.field_f = in.a(0, var2);
                }
                var2 = en.a((byte) -78, "TIMEATTACK_UNLOCKLEVEL_MESSAGE");
                if (var2 != null) {
                  ar.field_a = in.a(0, var2);
                }
                var2 = en.a((byte) -123, "STARTINGGAME");
                if (null != var2) {
                  j.field_o = in.a(0, var2);
                }
                var2 = en.a((byte) -103, "keycode_backwards");
                if (null != var2) {
                  t.field_g = var2[0] & 255;
                }
                var2 = en.a((byte) -93, "keycode_forwards");
                if (var2 != null) {
                  q.field_u = 255 & var2[0];
                }
                var2 = en.a((byte) -31, "keycode_right");
                if (var2 != null) {
                  ga.field_gb = 255 & var2[0];
                }
                var2 = en.a((byte) -15, "keycode_left");
                if (var2 != null) {
                  s.field_y = var2[0] & 255;
                }
                var2 = en.a((byte) -79, "keycode_birdseye");
                if (null != var2) {
                  il.field_d = 255 & var2[0];
                }
                var2 = en.a((byte) -109, "keycode_jump");
                if (var2 != null) {
                  ro.field_i = var2[0] & 255;
                }
                var2 = en.a((byte) -107, "keycode_turnleft");
                if (var2 != null) {
                  tn.field_c = var2[0] & 255;
                }
                var2 = en.a((byte) -98, "keycode_turnright");
                if (var2 != null) {
                  ve.field_a = 255 & var2[0];
                }
                var2 = en.a((byte) -43, "keycode_dynamite");
                if (null != var2) {
                  ch.field_k = var2[0] & 255;
                }
                var2 = en.a((byte) -102, "keycode_backwards_classic");
                if (null != var2) {
                  ii.field_E = var2[0] & 255;
                }
                var2 = en.a((byte) -11, "keycode_forwards_classic");
                if (var2 != null) {
                  pn.field_O = var2[0] & 255;
                }
                var2 = en.a((byte) -9, "keycode_right_classic");
                if (var2 != null) {
                  od.field_Mb = 255 & var2[0];
                }
                var2 = en.a((byte) -91, "keycode_left_classic");
                if (var2 != null) {
                  am.field_t = 255 & var2[0];
                }
                var2 = en.a((byte) -27, "keycode_jump_classic");
                if (var2 != null) {
                  om.field_B = var2[0] & 255;
                }
                var2 = en.a((byte) -65, "keycode_turnleft_classic");
                if (var2 != null) {
                  bc.field_b = 255 & var2[0];
                }
                var2 = en.a((byte) -72, "keycode_turnright_classic");
                if (null != var2) {
                  jb.field_y = 255 & var2[0];
                }
                var2 = en.a((byte) -28, "keycode_dynamite_classic");
                if (var2 != null) {
                  na.field_n = var2[0] & 255;
                }
                var2 = en.a((byte) -42, "keycode_timetrial_restart");
                if (var2 != null) {
                  ga.field_fb = var2[0] & 255;
                }
                var2 = en.a((byte) -116, "anglebrackets,0");
                if (var2 != null) {
                  ue.field_F[0] = in.a(0, var2);
                }
                var2 = en.a((byte) -15, "anglebrackets,1");
                if (var2 != null) {
                  ue.field_F[1] = in.a(0, var2);
                }
                var2 = en.a((byte) -83, "keycode_debughelp");
                po.field_e = null;
                if (null != var2) {
                  ia.field_C = 255 & var2[0];
                }
            }
            void run() {
                var4 = Vertigo2.field_L ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1292_0 = (RuntimeException) (var2_ref);
                  stackIn_1292_1 = new StringBuilder().append("ah.E(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_1293_2 = "null";
                  } else {
                    stackIn_1293_2 = "{...}";
                  }
                  throw wn.a((Throwable) ((Object) stackIn_1292_0), ((StringBuilder) (Object) stackIn_1292_1).append(stackIn_1293_2).append(')').toString());
                }
                if (og.field_a != 0) {
                  Vertigo2.field_L = (var4 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    static {
        field_j = "Please try changing the following settings:  ";
        field_l = 0;
        field_k = "Chat is currently disabled.";
    }
}
