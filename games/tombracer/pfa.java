/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa {
    private vna field_f;
    private int field_h;
    private bua field_c;
    static ura field_i;
    int field_e;
    int field_j;
    static String field_a;
    boolean field_g;
    private int field_d;
    static boolean[][] field_b;

    final static void a(cn param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1831_0;
            StringBuilder stackIn_1831_1;
            String stackIn_1832_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            cn param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(cn initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1831_0 = null;
                this.stackIn_1831_1 = null;
                this.stackIn_1832_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                fs.field_p = param0;
                var2 = mt.a("achievement_names,0", (byte) 108);
                if (null != var2) {
                  lq.field_p[0] = jaa.a((byte) 77, var2);
                }
                var2 = mt.a("achievement_names,1", (byte) 121);
                if (var2 != null) {
                  lq.field_p[1] = jaa.a((byte) 97, var2);
                }
                var2 = mt.a("achievement_names,2", (byte) 115);
                if (null != var2) {
                  lq.field_p[2] = jaa.a((byte) 73, var2);
                }
                var2 = mt.a("achievement_names,3", (byte) 123);
                if (null != var2) {
                  lq.field_p[3] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("achievement_names,4", (byte) 108);
                if (var2 != null) {
                  lq.field_p[4] = jaa.a((byte) 125, var2);
                }
                var2 = mt.a("achievement_names,5", (byte) 121);
                if (null != var2) {
                  lq.field_p[5] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("achievement_names,6", (byte) 118);
                if (null != var2) {
                  lq.field_p[6] = jaa.a((byte) 56, var2);
                }
                var2 = mt.a("achievement_names,7", (byte) 124);
                if (var2 != null) {
                  lq.field_p[7] = jaa.a((byte) 30, var2);
                }
                var2 = mt.a("achievement_names,8", (byte) 102);
                if (var2 != null) {
                  lq.field_p[8] = jaa.a((byte) 77, var2);
                }
                var2 = mt.a("achievement_names,9", (byte) 111);
                if (null != var2) {
                  lq.field_p[9] = jaa.a((byte) 26, var2);
                }
                var2 = mt.a("achievement_names,10", (byte) 110);
                if (var2 != null) {
                  lq.field_p[10] = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("achievement_names,11", (byte) 121);
                if (null != var2) {
                  lq.field_p[11] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("achievement_names,12", (byte) 112);
                if (var2 != null) {
                  lq.field_p[12] = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("achievement_names,13", (byte) 127);
                if (null != var2) {
                  lq.field_p[13] = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("achievement_names,14", (byte) 116);
                if (var2 != null) {
                  lq.field_p[14] = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("achievement_names,15", (byte) 119);
                if (var2 != null) {
                  lq.field_p[15] = jaa.a((byte) 122, var2);
                }
                var2 = mt.a("achievement_names,16", (byte) 123);
                if (null != var2) {
                  lq.field_p[16] = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("achievement_names,17", (byte) 102);
                if (var2 != null) {
                  lq.field_p[17] = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("achievement_names,18", (byte) 120);
                if (null != var2) {
                  lq.field_p[18] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("achievement_names,19", (byte) 121);
                if (var2 != null) {
                  lq.field_p[19] = jaa.a((byte) 75, var2);
                }
                var2 = mt.a("achievement_names,20", (byte) 124);
                if (var2 != null) {
                  lq.field_p[20] = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("achievement_names,21", (byte) 104);
                if (var2 != null) {
                  lq.field_p[21] = jaa.a((byte) 64, var2);
                }
                var2 = mt.a("achievement_names,22", (byte) 125);
                if (null != var2) {
                  lq.field_p[22] = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("achievement_names,23", (byte) 102);
                if (var2 != null) {
                  lq.field_p[23] = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("achievement_names,24", (byte) 104);
                if (var2 != null) {
                  lq.field_p[24] = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("achievement_names,25", (byte) 116);
                if (var2 != null) {
                  lq.field_p[25] = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("achievement_names,26", (byte) 112);
                if (var2 != null) {
                  lq.field_p[26] = jaa.a((byte) 86, var2);
                }
                var2 = mt.a("achievement_names,27", (byte) 102);
                if (var2 != null) {
                  lq.field_p[27] = jaa.a((byte) 76, var2);
                }
                var2 = mt.a("achievement_names,28", (byte) 113);
                if (null != var2) {
                  lq.field_p[28] = jaa.a((byte) 60, var2);
                }
                var2 = mt.a("achievement_names,29", (byte) 118);
                if (null != var2) {
                  lq.field_p[29] = jaa.a((byte) 66, var2);
                }
                var2 = mt.a("achievement_names,30", (byte) 101);
                if (var2 != null) {
                  lq.field_p[30] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("achievement_names,31", (byte) 125);
                if (var2 != null) {
                  lq.field_p[31] = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("achievement_names,32", (byte) 115);
                if (null != var2) {
                  lq.field_p[32] = jaa.a((byte) 64, var2);
                }
                var2 = mt.a("achievement_names,33", (byte) 100);
                if (var2 != null) {
                  lq.field_p[33] = jaa.a((byte) 79, var2);
                }
                var2 = mt.a("achievement_names,34", (byte) 125);
                if (var2 != null) {
                  lq.field_p[34] = jaa.a((byte) 55, var2);
                }
                var2 = mt.a("achievement_names,35", (byte) 109);
                if (var2 != null) {
                  lq.field_p[35] = jaa.a((byte) 56, var2);
                }
                var2 = mt.a("achievement_names,36", (byte) 116);
                if (null != var2) {
                  lq.field_p[36] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("achievement_names,37", (byte) 125);
                if (null != var2) {
                  lq.field_p[37] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("achievement_names,38", (byte) 122);
                if (var2 != null) {
                  lq.field_p[38] = jaa.a((byte) 116, var2);
                }
                var2 = mt.a("achievement_names,39", (byte) 123);
                if (null != var2) {
                  lq.field_p[39] = jaa.a((byte) 38, var2);
                }
                var2 = mt.a("achievement_names,40", (byte) 100);
                if (null != var2) {
                  lq.field_p[40] = jaa.a((byte) 125, var2);
                }
                var2 = mt.a("achievement_names,41", (byte) 113);
                if (var2 != null) {
                  lq.field_p[41] = jaa.a((byte) 116, var2);
                }
                var2 = mt.a("achievement_criteria,0", (byte) 105);
                if (var2 != null) {
                  kv.field_c[0] = jaa.a((byte) 61, var2);
                }
                var2 = mt.a("achievement_criteria,1", (byte) 114);
                if (var2 != null) {
                  kv.field_c[1] = jaa.a((byte) 60, var2);
                }
                var2 = mt.a("achievement_criteria,2", (byte) 110);
                if (null != var2) {
                  kv.field_c[2] = jaa.a((byte) 111, var2);
                }
                var2 = mt.a("achievement_criteria,3", (byte) 104);
                if (var2 != null) {
                  kv.field_c[3] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("achievement_criteria,4", (byte) 127);
                if (null != var2) {
                  kv.field_c[4] = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("achievement_criteria,5", (byte) 111);
                if (null != var2) {
                  kv.field_c[5] = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("achievement_criteria,6", (byte) 113);
                if (var2 != null) {
                  kv.field_c[6] = jaa.a((byte) 44, var2);
                }
                var2 = mt.a("achievement_criteria,7", (byte) 127);
                if (null != var2) {
                  kv.field_c[7] = jaa.a((byte) 80, var2);
                }
                var2 = mt.a("achievement_criteria,8", (byte) 113);
                if (var2 != null) {
                  kv.field_c[8] = jaa.a((byte) 98, var2);
                }
                var2 = mt.a("achievement_criteria,9", (byte) 110);
                if (null != var2) {
                  kv.field_c[9] = jaa.a((byte) 45, var2);
                }
                var2 = mt.a("achievement_criteria,10", (byte) 104);
                if (var2 != null) {
                  kv.field_c[10] = jaa.a((byte) 44, var2);
                }
                var2 = mt.a("achievement_criteria,11", (byte) 117);
                if (null != var2) {
                  kv.field_c[11] = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("achievement_criteria,12", (byte) 104);
                if (null != var2) {
                  kv.field_c[12] = jaa.a((byte) 47, var2);
                }
                var2 = mt.a("achievement_criteria,13", (byte) 120);
                if (var2 != null) {
                  kv.field_c[13] = jaa.a((byte) 88, var2);
                }
                var2 = mt.a("achievement_criteria,14", (byte) 123);
                if (null != var2) {
                  kv.field_c[14] = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("achievement_criteria,15", (byte) 110);
                if (var2 != null) {
                  kv.field_c[15] = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("achievement_criteria,16", (byte) 105);
                if (null != var2) {
                  kv.field_c[16] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("achievement_criteria,17", (byte) 123);
                if (var2 != null) {
                  kv.field_c[17] = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("achievement_criteria,18", (byte) 123);
                if (null != var2) {
                  kv.field_c[18] = jaa.a((byte) 49, var2);
                }
                var2 = mt.a("achievement_criteria,19", (byte) 120);
                if (var2 != null) {
                  kv.field_c[19] = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("achievement_criteria,20", (byte) 110);
                if (var2 != null) {
                  kv.field_c[20] = jaa.a((byte) 48, var2);
                }
                var2 = mt.a("achievement_criteria,21", (byte) 117);
                if (null != var2) {
                  kv.field_c[21] = jaa.a((byte) 86, var2);
                }
                var3 = -99 % ((param1 - 40) / 63);
                var2 = mt.a("achievement_criteria,22", (byte) 101);
                if (var2 != null) {
                  kv.field_c[22] = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("achievement_criteria,23", (byte) 101);
                if (var2 != null) {
                  kv.field_c[23] = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("achievement_criteria,24", (byte) 103);
                if (null != var2) {
                  kv.field_c[24] = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("achievement_criteria,25", (byte) 125);
                if (var2 != null) {
                  kv.field_c[25] = jaa.a((byte) 114, var2);
                }
                var2 = mt.a("achievement_criteria,26", (byte) 112);
                if (null != var2) {
                  kv.field_c[26] = jaa.a((byte) 56, var2);
                }
                var2 = mt.a("achievement_criteria,27", (byte) 127);
                if (null != var2) {
                  kv.field_c[27] = jaa.a((byte) 61, var2);
                }
                var2 = mt.a("achievement_criteria,28", (byte) 126);
                if (null != var2) {
                  kv.field_c[28] = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("achievement_criteria,29", (byte) 116);
                if (var2 != null) {
                  kv.field_c[29] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("achievement_criteria,30", (byte) 107);
                if (var2 != null) {
                  kv.field_c[30] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("achievement_criteria,31", (byte) 101);
                if (var2 != null) {
                  kv.field_c[31] = jaa.a((byte) 89, var2);
                }
                var2 = mt.a("achievement_criteria,32", (byte) 108);
                if (var2 != null) {
                  kv.field_c[32] = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("achievement_criteria,33", (byte) 105);
                if (var2 != null) {
                  kv.field_c[33] = jaa.a((byte) 34, var2);
                }
                var2 = mt.a("achievement_criteria,34", (byte) 124);
                if (var2 != null) {
                  kv.field_c[34] = jaa.a((byte) 127, var2);
                }
                var2 = mt.a("achievement_criteria,35", (byte) 123);
                if (null != var2) {
                  kv.field_c[35] = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("achievement_criteria,36", (byte) 122);
                if (null != var2) {
                  kv.field_c[36] = jaa.a((byte) 63, var2);
                }
                var2 = mt.a("achievement_criteria,37", (byte) 122);
                if (var2 != null) {
                  kv.field_c[37] = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("achievement_criteria,38", (byte) 116);
                if (null != var2) {
                  kv.field_c[38] = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("achievement_criteria,39", (byte) 121);
                if (var2 != null) {
                  kv.field_c[39] = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("achievement_criteria,40", (byte) 117);
                if (var2 != null) {
                  kv.field_c[40] = jaa.a((byte) 73, var2);
                }
                var2 = mt.a("achievement_criteria,41", (byte) 101);
                if (var2 != null) {
                  kv.field_c[41] = jaa.a((byte) 31, var2);
                }
                var2 = mt.a("no_textures", (byte) 108);
                if (var2 != null) {
                  jaa.a((byte) 114, var2);
                }
                var2 = mt.a("instructions_title", (byte) 112);
                if (var2 != null) {
                  sea.field_q = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("highscores_title", (byte) 114);
                if (null != var2) {
                  jaa.a((byte) 60, var2);
                }
                var2 = mt.a("achievements_title", (byte) 120);
                if (var2 != null) {
                  jaa.a((byte) 84, var2);
                }
                var2 = mt.a("rankings_title", (byte) 121);
                if (var2 != null) {
                  jaa.a((byte) 94, var2);
                }
                var2 = mt.a("character_select_title", (byte) 120);
                if (var2 != null) {
                  jaa.a((byte) 67, var2);
                }
                var2 = mt.a("player,0", (byte) 110);
                if (null != var2) {
                  kma.field_c[0] = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("player,1", (byte) 105);
                if (null != var2) {
                  kma.field_c[1] = jaa.a((byte) 92, var2);
                }
                var2 = mt.a("player,2", (byte) 102);
                if (null != var2) {
                  kma.field_c[2] = jaa.a((byte) 64, var2);
                }
                var2 = mt.a("player,3", (byte) 124);
                if (null != var2) {
                  kma.field_c[3] = jaa.a((byte) 124, var2);
                }
                var2 = mt.a("positions,0", (byte) 119);
                if (var2 != null) {
                  dw.field_u[0] = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("positions,1", (byte) 114);
                if (var2 != null) {
                  dw.field_u[1] = jaa.a((byte) 30, var2);
                }
                var2 = mt.a("positions,2", (byte) 108);
                if (var2 != null) {
                  dw.field_u[2] = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("positions,3", (byte) 121);
                if (var2 != null) {
                  dw.field_u[3] = jaa.a((byte) 97, var2);
                }
                var2 = mt.a("roundWinner", (byte) 126);
                if (var2 != null) {
                  cha.field_h = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("gameWinner", (byte) 123);
                if (var2 != null) {
                  vu.field_d = jaa.a((byte) 41, var2);
                }
                var2 = mt.a("roundWinner_draw", (byte) 113);
                if (var2 != null) {
                  uda.field_o = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("milliseconds", (byte) 111);
                if (var2 != null) {
                  jaa.a((byte) 28, var2);
                }
                var2 = mt.a("arr", (byte) 127);
                if (var2 != null) {
                  lva.field_y = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("keys", (byte) 107);
                if (null != var2) {
                  waa.field_b = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("keycode_player1left", (byte) 122);
                if (null != var2) {
                  kda.field_hd = 255 & var2[0];
                }
                var2 = mt.a("keycode_player1right", (byte) 119);
                if (null != var2) {
                  mf.field_a = var2[0] & 255;
                }
                var2 = mt.a("keycode_player1up", (byte) 111);
                if (var2 != null) {
                  mi.field_k = 255 & var2[0];
                }
                var2 = mt.a("keycode_player1down", (byte) 112);
                if (null != var2) {
                  fp.field_a = var2[0] & 255;
                }
                var2 = mt.a("keycode_player1fire", (byte) 108);
                if (null != var2) {
                  gsa.field_j = 255 & var2[0];
                }
                var2 = mt.a("keycode_player1reset", (byte) 105);
                if (null != var2) {
                  mv.field_i = var2[0] & 255;
                }
                var2 = mt.a("keycode_player1pull", (byte) 122);
                if (var2 != null) {
                  ki.field_o = var2[0] & 255;
                }
                var2 = mt.a("keycode_player1skiproom", (byte) 114);
                if (null != var2) {
                  rta.field_g = var2[0] & 255;
                }
                var2 = mt.a("keycode_player1sneak", (byte) 123);
                if (null != var2) {
                  hra.field_b = var2[0] & 255;
                }
                var2 = mt.a("oneplayer_timed", (byte) 113);
                if (var2 != null) {
                  qka.field_s = jaa.a((byte) 70, var2);
                }
                var2 = mt.a("oneplayer_puzzle", (byte) 114);
                if (null != var2) {
                  ula.field_t = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("startroom_colon", (byte) 109);
                if (var2 != null) {
                  rja.field_b = jaa.a((byte) 122, var2);
                }
                var2 = mt.a("difficulty_colon", (byte) 114);
                if (null != var2) {
                  wq.field_d = jaa.a((byte) 85, var2);
                }
                var2 = mt.a("bloom", (byte) 110);
                if (var2 != null) {
                  ona.field_F = jaa.a((byte) 51, var2);
                }
                var2 = mt.a("textures", (byte) 123);
                if (var2 != null) {
                  jaa.a((byte) 101, var2);
                }
                var2 = mt.a("pointLights", (byte) 120);
                if (var2 != null) {
                  bq.field_a = jaa.a((byte) 95, var2);
                }
                var2 = mt.a("wallShadows", (byte) 111);
                if (var2 != null) {
                  ir.field_b = jaa.a((byte) 76, var2);
                }
                var2 = mt.a("textures_all", (byte) 104);
                if (null != var2) {
                  jaa.a((byte) 46, var2);
                }
                var2 = mt.a("textures_some", (byte) 118);
                if (var2 != null) {
                  jaa.a((byte) 51, var2);
                }
                var2 = mt.a("textures_none", (byte) 108);
                if (var2 != null) {
                  jaa.a((byte) 108, var2);
                }
                var2 = mt.a("tutorial_title", (byte) 119);
                if (var2 != null) {
                  tea.field_a = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("tutorial_firetocontinue", (byte) 100);
                if (var2 != null) {
                  vda.field_n = jaa.a((byte) 127, var2);
                }
                var2 = mt.a("tutorial_room0", (byte) 116);
                if (var2 != null) {
                  fk.field_j = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("tutorial_death", (byte) 106);
                if (var2 != null) {
                  tha.field_A = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("tutorial_treasure", (byte) 123);
                if (var2 != null) {
                  uw.field_b = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("tutorial_treasureslow", (byte) 117);
                if (null != var2) {
                  lja.field_a = jaa.a((byte) 41, var2);
                }
                var2 = mt.a("tutorial_key", (byte) 102);
                if (var2 != null) {
                  uj.field_f = jaa.a((byte) 65, var2);
                }
                var2 = mt.a("tutorial_pushable", (byte) 114);
                if (var2 != null) {
                  vh.field_c = jaa.a((byte) 99, var2);
                }
                var2 = mt.a("tutorial_snakes", (byte) 113);
                if (var2 != null) {
                  wqa.field_F = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("tutorial_gun", (byte) 117);
                if (var2 != null) {
                  gca.field_l = jaa.a((byte) 80, var2);
                }
                var2 = mt.a("tutorial_restart", (byte) 106);
                if (null != var2) {
                  wd.field_a = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("instructionTitleCoins", (byte) 112);
                if (var2 != null) {
                  ct.field_c = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("instructionTextCoins", (byte) 123);
                if (null != var2) {
                  dk.field_k = jaa.a((byte) 119, var2);
                }
                var2 = mt.a("instructionTitleBagsOLoot", (byte) 109);
                if (var2 != null) {
                  pn.field_o = jaa.a((byte) 104, var2);
                }
                var2 = mt.a("instructionTextBagsOLoot", (byte) 103);
                if (var2 != null) {
                  kh.field_m = jaa.a((byte) 39, var2);
                }
                var2 = mt.a("instructionTitleIcons", (byte) 114);
                if (null != var2) {
                  dka.field_c = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("instructionTextIcons", (byte) 105);
                if (var2 != null) {
                  ne.field_e = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("instructionTitleBottomlessPits", (byte) 127);
                if (var2 != null) {
                  kea.field_b = jaa.a((byte) 51, var2);
                }
                var2 = mt.a("instructionTextBottomlessPits", (byte) 109);
                if (null != var2) {
                  bpa.field_a = jaa.a((byte) 61, var2);
                }
                var2 = mt.a("instructionTitleSnakePits", (byte) 119);
                if (null != var2) {
                  baa.field_a = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("instructionTextSnakePits", (byte) 111);
                if (null != var2) {
                  du.field_f = jaa.a((byte) 88, var2);
                }
                var2 = mt.a("instructionTitleLagoonsOfLava", (byte) 119);
                if (null != var2) {
                  dk.field_a = jaa.a((byte) 82, var2);
                }
                var2 = mt.a("instructionTextLagoonsOfLava", (byte) 101);
                if (null != var2) {
                  vua.field_C = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("instructionTitleCrushers", (byte) 114);
                if (var2 != null) {
                  qba.field_d = jaa.a((byte) 82, var2);
                }
                var2 = mt.a("instructionTextCrushers", (byte) 116);
                if (var2 != null) {
                  ir.field_c = jaa.a((byte) 99, var2);
                }
                var2 = mt.a("instructionTitleLindemannTotems", (byte) 117);
                if (null != var2) {
                  eua.field_Ab = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("instructionTextLindemannTotems", (byte) 123);
                if (var2 != null) {
                  sba.field_o = jaa.a((byte) 29, var2);
                }
                var2 = mt.a("instructionTitleMobileLindemannTotems", (byte) 102);
                if (var2 != null) {
                  rua.field_hb = jaa.a((byte) 122, var2);
                }
                var2 = mt.a("instructionTextMobileLindemannTotems", (byte) 120);
                if (var2 != null) {
                  vk.field_a = jaa.a((byte) 27, var2);
                }
                var2 = mt.a("instructionTitleBobbyGeorgeTotems", (byte) 114);
                if (var2 != null) {
                  hca.field_s = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("instructionTextBobbyGeorgeTotems", (byte) 103);
                if (null != var2) {
                  koa.field_d = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("instructionTitleMirrors", (byte) 116);
                if (null != var2) {
                  uv.field_u = jaa.a((byte) 98, var2);
                }
                var2 = mt.a("instructionTextMirrors", (byte) 127);
                if (null != var2) {
                  hv.field_o = jaa.a((byte) 89, var2);
                }
                var2 = mt.a("instructionTitleMobileMirrors", (byte) 126);
                if (var2 != null) {
                  jd.field_m = jaa.a((byte) 63, var2);
                }
                var2 = mt.a("instructionTextMobileMirrors", (byte) 119);
                if (var2 != null) {
                  wfa.field_G = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("instructionTitlePrecariousPlatforms", (byte) 127);
                if (null != var2) {
                  fv.field_b = jaa.a((byte) 114, var2);
                }
                var2 = mt.a("instructionTextPrecariousPlatforms", (byte) 120);
                if (null != var2) {
                  gn.field_y = jaa.a((byte) 82, var2);
                }
                var2 = mt.a("instructionTitleCrumblyBlocks", (byte) 103);
                if (null != var2) {
                  td.field_u = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("instructionTextCrumblyBlocks", (byte) 108);
                if (null != var2) {
                  hn.field_G = jaa.a((byte) 78, var2);
                }
                var2 = mt.a("instructionTitleCauldronsOfGreenSoup", (byte) 115);
                if (var2 != null) {
                  hoa.field_n = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("instructionTextCauldronsOfGreenSoup", (byte) 112);
                if (var2 != null) {
                  lr.field_e = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("instructionTitleSkeletons", (byte) 113);
                if (null != var2) {
                  td.field_n = jaa.a((byte) 92, var2);
                }
                var2 = mt.a("instructionTextSkeletons", (byte) 101);
                if (var2 != null) {
                  qna.field_a = jaa.a((byte) 27, var2);
                }
                var2 = mt.a("instructionTitleLocksAndKeys", (byte) 101);
                if (null != var2) {
                  uqa.field_v = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("instructionTextLocksAndKeys", (byte) 120);
                if (var2 != null) {
                  apa.field_b = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("instructionTitlePortals", (byte) 125);
                if (var2 != null) {
                  rl.field_s = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("instructionTextPortals", (byte) 107);
                if (var2 != null) {
                  bq.field_e = jaa.a((byte) 75, var2);
                }
                var2 = mt.a("instructionTitleLasers", (byte) 121);
                if (var2 != null) {
                  rh.field_q = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("instructionTextLasers", (byte) 122);
                if (var2 != null) {
                  km.field_n = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("instructionTitleMovingPlatforms", (byte) 106);
                if (var2 != null) {
                  lda.field_G = jaa.a((byte) 114, var2);
                }
                var2 = mt.a("instructionTextMovingPlatforms", (byte) 102);
                if (var2 != null) {
                  tr.field_d = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("instructionTitlePressurePads", (byte) 101);
                if (var2 != null) {
                  uqa.field_t = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("instructionTextPressurePads", (byte) 113);
                if (null != var2) {
                  at.field_R = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("instructionTitleRollingJonesboulders", (byte) 115);
                if (var2 != null) {
                  kd.field_z = jaa.a((byte) 57, var2);
                }
                var2 = mt.a("instructionTextRollingJonesboulders", (byte) 127);
                if (null != var2) {
                  vm.field_a = jaa.a((byte) 118, var2);
                }
                var2 = mt.a("instructionTitleDiscOfDeathVendingMachines", (byte) 123);
                if (null != var2) {
                  nea.field_b = jaa.a((byte) 124, var2);
                }
                var2 = mt.a("instructionTextDiscOfDeathVendingMachines", (byte) 116);
                if (var2 != null) {
                  wv.field_h = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("instructionTitlePerpetuallySpinningDiscs", (byte) 111);
                if (var2 != null) {
                  gga.field_L = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("instructionTextPerpetuallySpinningDiscs", (byte) 120);
                if (var2 != null) {
                  kna.field_D = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("instructionTitleWhiteLightBeams", (byte) 123);
                if (var2 != null) {
                  tu.field_d = jaa.a((byte) 33, var2);
                }
                var2 = mt.a("instructionTextWhiteLightBeams", (byte) 111);
                if (var2 != null) {
                  ld.field_d = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("instructionTitleWanderingWalls", (byte) 103);
                if (var2 != null) {
                  kva.field_r = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("instructionTextWanderingWalls", (byte) 117);
                if (var2 != null) {
                  du.field_b = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("instructionTitleMazes", (byte) 118);
                if (null != var2) {
                  sta.field_H = jaa.a((byte) 66, var2);
                }
                var2 = mt.a("instructionTextMazes", (byte) 105);
                if (var2 != null) {
                  fb.field_b = jaa.a((byte) 31, var2);
                }
                var2 = mt.a("instructionTitleMoveableBlocks", (byte) 127);
                if (null != var2) {
                  er.field_J = jaa.a((byte) 42, var2);
                }
                var2 = mt.a("instructionTextMoveableBlocks", (byte) 123);
                if (var2 != null) {
                  gu.field_k = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("instructionTitlePistols", (byte) 104);
                if (var2 != null) {
                  bn.field_o = jaa.a((byte) 98, var2);
                }
                var2 = mt.a("instructionTextPistols", (byte) 119);
                if (var2 != null) {
                  pna.field_k = jaa.a((byte) 104, var2);
                }
                var2 = mt.a("instructionsPage1Title1", (byte) 117);
                if (var2 != null) {
                  ela.field_m = jaa.a((byte) 39, var2);
                }
                var2 = mt.a("instructionsPage1Title2", (byte) 116);
                if (var2 != null) {
                  fr.field_a = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("instructionsPage1Title3", (byte) 127);
                if (var2 != null) {
                  qfa.field_a = jaa.a((byte) 51, var2);
                }
                var2 = mt.a("instructionsPage1Text1", (byte) 108);
                if (var2 != null) {
                  daa.field_f = jaa.a((byte) 31, var2);
                }
                var2 = mt.a("instructionsPage1Text2", (byte) 125);
                if (var2 != null) {
                  ioa.field_o = jaa.a((byte) 93, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = mt.a("instructionsPage1Text3", (byte) 113);
                if (var2 != null) {
                  mr.field_H = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("instructionsPage1Text4", (byte) 126);
                if (var2 != null) {
                  uc.field_K = jaa.a((byte) 97, var2);
                }
                var2 = mt.a("instructionsPage1Text5", (byte) 123);
                if (null != var2) {
                  pba.field_c = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("instructionsPage1Text6", (byte) 116);
                if (var2 != null) {
                  hsa.field_c = jaa.a((byte) 100, var2);
                }
                var2 = mt.a("loadingStrings,0", (byte) 100);
                if (var2 != null) {
                  fv.field_d[0] = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("loadingStrings,1", (byte) 107);
                if (null != var2) {
                  fv.field_d[1] = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("loadingStrings,2", (byte) 125);
                if (var2 != null) {
                  fv.field_d[2] = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("loadingStrings,3", (byte) 105);
                if (var2 != null) {
                  fv.field_d[3] = jaa.a((byte) 92, var2);
                }
                var2 = mt.a("loadingStrings,4", (byte) 110);
                if (null != var2) {
                  fv.field_d[4] = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("loadingStrings,5", (byte) 101);
                if (null != var2) {
                  fv.field_d[5] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("loadingStrings,6", (byte) 124);
                if (null != var2) {
                  fv.field_d[6] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("loadingStrings,7", (byte) 126);
                if (var2 != null) {
                  fv.field_d[7] = jaa.a((byte) 27, var2);
                }
                var2 = mt.a("loadingStrings,8", (byte) 125);
                if (null != var2) {
                  fv.field_d[8] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("loadingStrings,9", (byte) 111);
                if (null != var2) {
                  fv.field_d[9] = jaa.a((byte) 60, var2);
                }
                var2 = mt.a("loadingStrings,10", (byte) 104);
                if (var2 != null) {
                  fv.field_d[10] = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("loadingStrings,11", (byte) 120);
                if (var2 != null) {
                  fv.field_d[11] = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("loadingStrings,12", (byte) 119);
                if (null != var2) {
                  fv.field_d[12] = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("loadingStrings,13", (byte) 127);
                if (var2 != null) {
                  fv.field_d[13] = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("loadingStrings,14", (byte) 106);
                if (var2 != null) {
                  fv.field_d[14] = jaa.a((byte) 75, var2);
                }
                var2 = mt.a("loadingStrings,15", (byte) 127);
                if (var2 != null) {
                  fv.field_d[15] = jaa.a((byte) 39, var2);
                }
                var2 = mt.a("loadingStrings,16", (byte) 121);
                if (null != var2) {
                  fv.field_d[16] = jaa.a((byte) 65, var2);
                }
                var2 = mt.a("loadingStrings,17", (byte) 120);
                if (var2 != null) {
                  fv.field_d[17] = jaa.a((byte) 114, var2);
                }
                var2 = mt.a("loadingStrings,18", (byte) 124);
                if (null != var2) {
                  fv.field_d[18] = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("waitingStrings,0", (byte) 108);
                if (var2 != null) {
                  hca.field_U[0] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("waitingStrings,1", (byte) 117);
                if (null != var2) {
                  hca.field_U[1] = jaa.a((byte) 94, var2);
                }
                var2 = mt.a("waitingStrings,2", (byte) 124);
                if (null != var2) {
                  hca.field_U[2] = jaa.a((byte) 117, var2);
                }
                var2 = mt.a("waitingStrings,3", (byte) 107);
                if (var2 != null) {
                  hca.field_U[3] = jaa.a((byte) 118, var2);
                }
                var2 = mt.a("waitingStrings,4", (byte) 114);
                if (var2 != null) {
                  hca.field_U[4] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("waitingStrings,5", (byte) 117);
                if (var2 != null) {
                  hca.field_U[5] = jaa.a((byte) 53, var2);
                }
                var2 = mt.a("waitingStrings,6", (byte) 107);
                if (var2 != null) {
                  hca.field_U[6] = jaa.a((byte) 87, var2);
                }
                var2 = mt.a("waitingStrings,7", (byte) 105);
                if (var2 != null) {
                  hca.field_U[7] = jaa.a((byte) 127, var2);
                }
                var2 = mt.a("waitingStrings,8", (byte) 112);
                if (var2 != null) {
                  hca.field_U[8] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("waitingStrings,9", (byte) 110);
                if (null != var2) {
                  hca.field_U[9] = jaa.a((byte) 55, var2);
                }
                var2 = mt.a("waitingStrings,10", (byte) 126);
                if (null != var2) {
                  hca.field_U[10] = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("waitingStrings,11", (byte) 103);
                if (var2 != null) {
                  hca.field_U[11] = jaa.a((byte) 100, var2);
                }
                var2 = mt.a("waitingStrings,12", (byte) 122);
                if (null != var2) {
                  hca.field_U[12] = jaa.a((byte) 116, var2);
                }
                var2 = mt.a("waitingStrings,13", (byte) 110);
                if (var2 != null) {
                  hca.field_U[13] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("waitingStrings,14", (byte) 100);
                if (var2 != null) {
                  hca.field_U[14] = jaa.a((byte) 57, var2);
                }
                var2 = mt.a("waitingStrings,15", (byte) 104);
                if (var2 != null) {
                  hca.field_U[15] = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("waitingStrings,16", (byte) 107);
                if (var2 != null) {
                  hca.field_U[16] = jaa.a((byte) 57, var2);
                }
                var2 = mt.a("waitingStrings,17", (byte) 102);
                if (null != var2) {
                  hca.field_U[17] = jaa.a((byte) 82, var2);
                }
                var2 = mt.a("waitingStrings,18", (byte) 117);
                if (var2 != null) {
                  hca.field_U[18] = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("unpackingStrings,0", (byte) 108);
                if (null != var2) {
                  uba.field_g[0] = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("unpackingStrings,1", (byte) 109);
                if (null != var2) {
                  uba.field_g[1] = jaa.a((byte) 44, var2);
                }
                var2 = mt.a("unpackingStrings,2", (byte) 112);
                if (null != var2) {
                  uba.field_g[2] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("unpackingStrings,3", (byte) 126);
                if (var2 != null) {
                  uba.field_g[3] = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("unpackingStrings,4", (byte) 118);
                if (var2 != null) {
                  uba.field_g[4] = jaa.a((byte) 26, var2);
                }
                var2 = mt.a("unpackingStrings,5", (byte) 101);
                if (var2 != null) {
                  uba.field_g[5] = jaa.a((byte) 84, var2);
                }
                var2 = mt.a("unpackingStrings,6", (byte) 123);
                if (var2 != null) {
                  uba.field_g[6] = jaa.a((byte) 49, var2);
                }
                var2 = mt.a("unpackingStrings,7", (byte) 127);
                if (var2 != null) {
                  uba.field_g[7] = jaa.a((byte) 42, var2);
                }
                var2 = mt.a("unpackingStrings,8", (byte) 107);
                if (null != var2) {
                  uba.field_g[8] = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("unpackingStrings,9", (byte) 115);
                if (var2 != null) {
                  uba.field_g[9] = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("unpackingStrings,10", (byte) 118);
                if (null != var2) {
                  uba.field_g[10] = jaa.a((byte) 105, var2);
                }
                var2 = mt.a("error", (byte) 113);
                if (var2 != null) {
                  so.field_L = jaa.a((byte) 73, var2);
                }
                var2 = mt.a("pleaselogin", (byte) 105);
                if (null != var2) {
                  wja.field_o = jaa.a((byte) 79, var2);
                }
                var2 = mt.a("hint_drag", (byte) 115);
                if (null != var2) {
                  qja.field_k = jaa.a((byte) 26, var2);
                }
                var2 = mt.a("hint_drop", (byte) 112);
                if (null != var2) {
                  hda.field_h = jaa.a((byte) 52, var2);
                }
                var2 = mt.a("hint_sneak", (byte) 112);
                if (null != var2) {
                  aca.field_g = jaa.a((byte) 65, var2);
                }
                var2 = mt.a("hint_fire", (byte) 108);
                if (null != var2) {
                  bb.field_l = jaa.a((byte) 66, var2);
                }
                var2 = mt.a("item_keys", (byte) 107);
                if (var2 != null) {
                  jaa.a((byte) 78, var2);
                }
                var2 = mt.a("item_coins", (byte) 107);
                if (null != var2) {
                  lfa.field_m = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("item_bags", (byte) 121);
                if (var2 != null) {
                  uha.field_s = jaa.a((byte) 49, var2);
                }
                var2 = mt.a("item_idols", (byte) 100);
                if (var2 != null) {
                  gla.field_o = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("weapon_dartgun", (byte) 103);
                if (null != var2) {
                  vp.field_B = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("weapon_machinegun", (byte) 104);
                if (var2 != null) {
                  tha.field_y = jaa.a((byte) 95, var2);
                }
                var2 = mt.a("weapon_shotgun", (byte) 125);
                if (var2 != null) {
                  gqa.field_a = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("weapon_flaregun", (byte) 117);
                if (null != var2) {
                  bfa.field_b = jaa.a((byte) 70, var2);
                }
                var2 = mt.a("weapon_flamer", (byte) 119);
                if (var2 != null) {
                  sl.field_d = jaa.a((byte) 103, var2);
                }
                var2 = mt.a("weapon_flamershort", (byte) 101);
                if (var2 != null) {
                  wta.field_H = jaa.a((byte) 61, var2);
                }
                var2 = mt.a("weapon_flamerblue", (byte) 113);
                if (var2 != null) {
                  tv.field_ub = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("weapon_waterspray", (byte) 101);
                if (null != var2) {
                  bf.field_f = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("weapon_bladelauncher", (byte) 116);
                if (null != var2) {
                  aka.field_A = jaa.a((byte) 47, var2);
                }
                var2 = mt.a("weapon_fireball", (byte) 112);
                if (var2 != null) {
                  hg.field_d = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("weapon_bouncingfireball", (byte) 124);
                if (var2 != null) {
                  kga.field_q = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("weapon_freezer", (byte) 114);
                if (null != var2) {
                  fp.field_b = jaa.a((byte) 89, var2);
                }
                var2 = mt.a("weapon_revolver", (byte) 127);
                if (var2 != null) {
                  uj.field_e = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("pos_1st", (byte) 113);
                if (var2 != null) {
                  fma.field_d = jaa.a((byte) 39, var2);
                }
                var2 = mt.a("pos_2nd", (byte) 101);
                if (var2 != null) {
                  bqa.field_g = jaa.a((byte) 45, var2);
                }
                var2 = mt.a("pos_3rd", (byte) 118);
                if (var2 != null) {
                  vh.field_b = jaa.a((byte) 58, var2);
                }
                var2 = mt.a("pos_4th", (byte) 105);
                if (null != var2) {
                  tda.field_b = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("pos_resigned", (byte) 116);
                if (null != var2) {
                  ik.field_j = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("pos_completed", (byte) 117);
                if (var2 != null) {
                  ad.field_i = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("pos_dnf", (byte) 117);
                if (var2 != null) {
                  re.field_b = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("resigned", (byte) 106);
                if (null != var2) {
                  id.field_i = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("won_x_rounds", (byte) 112);
                if (var2 != null) {
                  ga.field_K = jaa.a((byte) 119, var2);
                }
                var2 = mt.a("offering_rematch", (byte) 105);
                if (null != var2) {
                  w.field_d = jaa.a((byte) 33, var2);
                }
                var2 = mt.a("rank", (byte) 122);
                if (var2 != null) {
                  hl.field_a = jaa.a((byte) 65, var2);
                }
                var2 = mt.a("fivehunderedplus", (byte) 118);
                if (null != var2) {
                  kha.field_a = jaa.a((byte) 105, var2);
                }
                var2 = mt.a("graphicsmode", (byte) 101);
                if (null != var2) {
                  dna.field_I = jaa.a((byte) 45, var2);
                }
                var2 = mt.a("graphicsquality", (byte) 110);
                if (var2 != null) {
                  bc.field_a = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("slowmoveshift", (byte) 110);
                if (var2 != null) {
                  pg.field_A = jaa.a((byte) 103, var2);
                }
                var2 = mt.a("slowmovegood", (byte) 119);
                if (var2 != null) {
                  gka.field_f = jaa.a((byte) 32, var2);
                }
                var2 = mt.a("slowmovemove", (byte) 127);
                if (null != var2) {
                  qqa.field_p = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("room_X_of_Y", (byte) 116);
                if (null != var2) {
                  mg.field_k = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("completed", (byte) 104);
                if (var2 != null) {
                  iaa.field_a = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("failed", (byte) 108);
                if (var2 != null) {
                  wpa.field_K = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("out_of_time", (byte) 112);
                if (null != var2) {
                  sg.field_n = jaa.a((byte) 117, var2);
                }
                var2 = mt.a("finish_time_colon", (byte) 104);
                if (var2 != null) {
                  cc.field_l = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("msg_finished", (byte) 119);
                if (null != var2) {
                  ara.field_yb = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("msg_failedtofinish", (byte) 107);
                if (var2 != null) {
                  at.field_Q = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("msg_timeup", (byte) 114);
                if (var2 != null) {
                  hu.field_a = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("msg_chosen_character", (byte) 117);
                if (var2 != null) {
                  coa.field_n = jaa.a((byte) 112, var2);
                }
                var2 = mt.a("msg_chosen_reward", (byte) 112);
                if (null != var2) {
                  fva.field_b = jaa.a((byte) 109, var2);
                }
                var2 = mt.a("msg_didnt_choose_reward", (byte) 125);
                if (var2 != null) {
                  oba.field_n = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("roundover_winner", (byte) 123);
                if (null != var2) {
                  ru.field_a = jaa.a((byte) 47, var2);
                }
                var2 = mt.a("gameover", (byte) 106);
                if (null != var2) {
                  jaa.a((byte) 89, var2);
                }
                var2 = mt.a("gameover_aborted", (byte) 125);
                if (var2 != null) {
                  jaa.a((byte) 66, var2);
                }
                var2 = mt.a("gameover_winner", (byte) 117);
                if (var2 != null) {
                  jaa.a((byte) 119, var2);
                }
                var2 = mt.a("gameover_completed", (byte) 107);
                if (var2 != null) {
                  jaa.a((byte) 125, var2);
                }
                var2 = mt.a("choose_character", (byte) 110);
                if (var2 != null) {
                  gta.field_a = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("choose_reward", (byte) 106);
                if (null != var2) {
                  us.field_c = jaa.a((byte) 102, var2);
                }
                var2 = mt.a("choose_reward_timeleft", (byte) 124);
                if (var2 != null) {
                  tla.field_h = jaa.a((byte) 35, var2);
                }
                var2 = mt.a("waiting_for_others", (byte) 126);
                if (var2 != null) {
                  jsa.field_F = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("waiting_for", (byte) 127);
                if (var2 != null) {
                  cba.field_c = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("time_remaining", (byte) 100);
                if (null != var2) {
                  jaa.a((byte) 44, var2);
                }
                var2 = mt.a("finish_order", (byte) 112);
                if (null != var2) {
                  rl.field_v = jaa.a((byte) 78, var2);
                }
                var2 = mt.a("spectator", (byte) 124);
                if (null != var2) {
                  dpa.field_c = jaa.a((byte) 78, var2);
                }
                var2 = mt.a("watching", (byte) 113);
                if (null != var2) {
                  voa.field_q = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("round", (byte) 125);
                if (var2 != null) {
                  uqa.field_z = jaa.a((byte) 57, var2);
                }
                var2 = mt.a("get_ready", (byte) 104);
                if (var2 != null) {
                  hua.field_b = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("gogogo", (byte) 106);
                if (var2 != null) {
                  jh.field_J = jaa.a((byte) 73, var2);
                }
                var2 = mt.a("waiting_for_sync", (byte) 104);
                if (var2 != null) {
                  hu.field_d = jaa.a((byte) 87, var2);
                }
                var2 = mt.a("treasure_values", (byte) 102);
                if (null != var2) {
                  wj.field_b = jaa.a((byte) 56, var2);
                }
                var2 = mt.a("treasure_total", (byte) 126);
                if (null != var2) {
                  rja.field_c = jaa.a((byte) 42, var2);
                }
                var2 = mt.a("points", (byte) 123);
                if (null != var2) {
                  nsa.field_f = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("room_points", (byte) 101);
                if (var2 != null) {
                  bca.field_c = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("room_complete_points", (byte) 121);
                if (null != var2) {
                  gla.field_q = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("room_complete_points_with_bonus", (byte) 121);
                if (null != var2) {
                  wpa.field_J = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("penalty_death", (byte) 125);
                if (null != var2) {
                  uta.field_n = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("penalty_reset", (byte) 117);
                if (null != var2) {
                  rf.field_a = jaa.a((byte) 92, var2);
                }
                var2 = mt.a("final_score_colon", (byte) 107);
                if (var2 != null) {
                  jaa.a((byte) 66, var2);
                }
                var2 = mt.a("powerdown_from", (byte) 103);
                if (var2 != null) {
                  jaa.a((byte) 100, var2);
                }
                var2 = mt.a("powerdown_pending", (byte) 116);
                if (var2 != null) {
                  jaa.a((byte) 115, var2);
                }
                var2 = mt.a("reward_coin15", (byte) 120);
                if (var2 != null) {
                  sea.field_p = jaa.a((byte) 92, var2);
                }
                var2 = mt.a("reward_coin10", (byte) 115);
                if (var2 != null) {
                  mu.field_wb = jaa.a((byte) 124, var2);
                }
                var2 = mt.a("reward_coin5", (byte) 108);
                if (null != var2) {
                  so.field_J = jaa.a((byte) 27, var2);
                }
                var2 = mt.a("reward_bag2", (byte) 103);
                if (null != var2) {
                  tja.field_p = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("reward_bagx2", (byte) 124);
                if (null != var2) {
                  sda.field_h = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("reward_idol1", (byte) 101);
                if (var2 != null) {
                  ds.field_k = jaa.a((byte) 123, var2);
                }
                var2 = mt.a("reward_idolx2", (byte) 105);
                if (null != var2) {
                  bha.field_x = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("reward_none", (byte) 127);
                if (null != var2) {
                  jaa.a((byte) 63, var2);
                }
                var2 = mt.a("reward_taken", (byte) 119);
                if (var2 != null) {
                  jaa.a((byte) 83, var2);
                }
                var2 = mt.a("reward_none_waiting", (byte) 116);
                if (var2 != null) {
                  g.field_i = jaa.a((byte) 35, var2);
                }
                var2 = mt.a("reward_none_dnf", (byte) 123);
                if (null != var2) {
                  cs.field_b = jaa.a((byte) 104, var2);
                }
                var2 = mt.a("reward_none_timeout", (byte) 121);
                if (var2 != null) {
                  cga.field_l = jaa.a((byte) 67, var2);
                }
                var2 = mt.a("reward_none_choosing", (byte) 113);
                if (var2 != null) {
                  bp.field_o = jaa.a((byte) 79, var2);
                }
                var2 = mt.a("unlock_character", (byte) 100);
                if (var2 != null) {
                  gv.field_v = jaa.a((byte) 86, var2);
                }
                var2 = mt.a("unlock_tier", (byte) 109);
                if (var2 != null) {
                  r.field_k = jaa.a((byte) 94, var2);
                }
                var2 = mt.a("name_ace", (byte) 124);
                if (null != var2) {
                  gh.field_e = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("name_angelio", (byte) 103);
                if (null != var2) {
                  hra.field_a = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("name_baroness", (byte) 109);
                if (var2 != null) {
                  poa.field_p = jaa.a((byte) 52, var2);
                }
                var2 = mt.a("name_borees", (byte) 125);
                if (var2 != null) {
                  kma.field_d = jaa.a((byte) 45, var2);
                }
                var2 = mt.a("name_bruce", (byte) 109);
                if (var2 != null) {
                  dfa.field_a = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("name_feng", (byte) 121);
                if (null != var2) {
                  vg.field_b = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("name_hans", (byte) 126);
                if (var2 != null) {
                  pt.field_q = jaa.a((byte) 31, var2);
                }
                var2 = mt.a("name_henryj", (byte) 124);
                if (null != var2) {
                  iea.field_e = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("name_jamille", (byte) 113);
                if (var2 != null) {
                  sda.field_k = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("name_johnsson", (byte) 113);
                if (null != var2) {
                  rha.field_h = jaa.a((byte) 34, var2);
                }
                var2 = mt.a("name_piles", (byte) 119);
                if (var2 != null) {
                  pha.field_Ib = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("name_scarlett", (byte) 117);
                if (null != var2) {
                  msa.field_b = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("name_wilbur", (byte) 119);
                if (null != var2) {
                  tr.field_e = jaa.a((byte) 98, var2);
                }
                var2 = mt.a("death_unknown,0", (byte) 102);
                if (var2 != null) {
                  kla.field_a[0] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("death_unknown,1", (byte) 104);
                if (var2 != null) {
                  kla.field_a[1] = jaa.a((byte) 116, var2);
                }
                var2 = mt.a("death_unknown,2", (byte) 118);
                if (var2 != null) {
                  kla.field_a[2] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("death_reset,0", (byte) 100);
                if (var2 != null) {
                  si.field_F[0] = jaa.a((byte) 127, var2);
                }
                var2 = mt.a("death_reset,1", (byte) 102);
                if (null != var2) {
                  si.field_F[1] = jaa.a((byte) 61, var2);
                }
                var2 = mt.a("death_reset,2", (byte) 108);
                if (null != var2) {
                  si.field_F[2] = jaa.a((byte) 89, var2);
                }
                var2 = mt.a("death_reset,3", (byte) 107);
                if (var2 != null) {
                  si.field_F[3] = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("death_reset,4", (byte) 120);
                if (var2 != null) {
                  si.field_F[4] = jaa.a((byte) 79, var2);
                }
                var2 = mt.a("death_reset,5", (byte) 105);
                if (var2 != null) {
                  si.field_F[5] = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("death_reset,6", (byte) 110);
                if (null != var2) {
                  si.field_F[6] = jaa.a((byte) 90, var2);
                }
                var2 = mt.a("death_reset,7", (byte) 121);
                if (var2 != null) {
                  si.field_F[7] = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("death_reset,8", (byte) 123);
                if (var2 != null) {
                  si.field_F[8] = jaa.a((byte) 88, var2);
                }
                var2 = mt.a("death_squishedhorizontal,0", (byte) 107);
                if (null != var2) {
                  nta.field_b[0] = jaa.a((byte) 127, var2);
                }
                var2 = mt.a("death_squishedhorizontal,1", (byte) 119);
                if (var2 != null) {
                  nta.field_b[1] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("death_squishedhorizontal,2", (byte) 117);
                if (null != var2) {
                  nta.field_b[2] = jaa.a((byte) 42, var2);
                }
                var2 = mt.a("death_squishedhorizontal,3", (byte) 126);
                if (var2 != null) {
                  nta.field_b[3] = jaa.a((byte) 32, var2);
                }
                var2 = mt.a("death_squishedhorizontal,4", (byte) 109);
                if (null != var2) {
                  nta.field_b[4] = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("death_squishedhorizontal,5", (byte) 118);
                if (var2 != null) {
                  nta.field_b[5] = jaa.a((byte) 85, var2);
                }
                var2 = mt.a("death_squishedhorizontal,6", (byte) 126);
                if (var2 != null) {
                  nta.field_b[6] = jaa.a((byte) 100, var2);
                }
                var2 = mt.a("death_squishedhorizontal,7", (byte) 118);
                if (var2 != null) {
                  nta.field_b[7] = jaa.a((byte) 27, var2);
                }
                var2 = mt.a("death_squishedvertical,0", (byte) 125);
                if (null != var2) {
                  or.field_m[0] = jaa.a((byte) 98, var2);
                }
                var2 = mt.a("death_squishedvertical,1", (byte) 103);
                if (var2 != null) {
                  or.field_m[1] = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("death_squishedvertical,2", (byte) 110);
                if (var2 != null) {
                  or.field_m[2] = jaa.a((byte) 87, var2);
                }
                var2 = mt.a("death_squishedvertical,3", (byte) 117);
                if (var2 != null) {
                  or.field_m[3] = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("death_squishedvertical,4", (byte) 102);
                if (null != var2) {
                  or.field_m[4] = jaa.a((byte) 120, var2);
                }
                var2 = mt.a("death_squishedvertical,5", (byte) 104);
                if (var2 != null) {
                  or.field_m[5] = jaa.a((byte) 99, var2);
                }
                var2 = mt.a("death_squishedvertical,6", (byte) 109);
                if (null != var2) {
                  or.field_m[6] = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("death_fell,0", (byte) 121);
                if (var2 != null) {
                  tia.field_c[0] = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("death_fell,1", (byte) 101);
                if (null != var2) {
                  tia.field_c[1] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("death_fell,2", (byte) 103);
                if (null != var2) {
                  tia.field_c[2] = jaa.a((byte) 65, var2);
                }
                var2 = mt.a("death_fell,3", (byte) 117);
                if (null != var2) {
                  tia.field_c[3] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("death_fell,4", (byte) 122);
                if (null != var2) {
                  tia.field_c[4] = jaa.a((byte) 26, var2);
                }
                var2 = mt.a("death_fell,5", (byte) 122);
                if (null != var2) {
                  tia.field_c[5] = jaa.a((byte) 75, var2);
                }
                var2 = mt.a("death_fell,6", (byte) 118);
                if (null != var2) {
                  tia.field_c[6] = jaa.a((byte) 114, var2);
                }
                var2 = mt.a("death_fell,7", (byte) 112);
                if (null != var2) {
                  tia.field_c[7] = jaa.a((byte) 38, var2);
                }
                var2 = mt.a("death_lava,0", (byte) 100);
                if (var2 != null) {
                  up.field_d[0] = jaa.a((byte) 51, var2);
                }
                var2 = mt.a("death_lava,1", (byte) 124);
                if (null != var2) {
                  up.field_d[1] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("death_lava,2", (byte) 110);
                if (null != var2) {
                  up.field_d[2] = jaa.a((byte) 74, var2);
                }
                var2 = mt.a("death_lava,3", (byte) 121);
                if (var2 != null) {
                  up.field_d[3] = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("death_lava,4", (byte) 123);
                if (null != var2) {
                  up.field_d[4] = jaa.a((byte) 51, var2);
                }
                var2 = mt.a("death_lava,5", (byte) 113);
                if (var2 != null) {
                  up.field_d[5] = jaa.a((byte) 110, var2);
                }
                var2 = mt.a("death_snake,0", (byte) 101);
                if (var2 != null) {
                  fpa.field_b[0] = jaa.a((byte) 109, var2);
                }
                var2 = mt.a("death_snake,1", (byte) 116);
                if (null != var2) {
                  fpa.field_b[1] = jaa.a((byte) 89, var2);
                }
                var2 = mt.a("death_snake,2", (byte) 101);
                if (var2 != null) {
                  fpa.field_b[2] = jaa.a((byte) 30, var2);
                }
                var2 = mt.a("death_snake,3", (byte) 111);
                if (var2 != null) {
                  fpa.field_b[3] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("death_snake,4", (byte) 107);
                if (var2 != null) {
                  fpa.field_b[4] = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("death_snake,5", (byte) 126);
                if (var2 != null) {
                  fpa.field_b[5] = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("death_snake,6", (byte) 116);
                if (null != var2) {
                  fpa.field_b[6] = jaa.a((byte) 31, var2);
                }
                var2 = mt.a("death_skeleton,0", (byte) 117);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  gca.field_j[0] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("death_skeleton,1", (byte) 101);
                if (null != var2) {
                  gca.field_j[1] = jaa.a((byte) 113, var2);
                }
                var2 = mt.a("death_skeleton,2", (byte) 106);
                if (null != var2) {
                  gca.field_j[2] = jaa.a((byte) 79, var2);
                }
                var2 = mt.a("death_skeleton,3", (byte) 109);
                if (var2 != null) {
                  gca.field_j[3] = jaa.a((byte) 60, var2);
                }
                var2 = mt.a("death_skeleton,4", (byte) 107);
                if (var2 != null) {
                  gca.field_j[4] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("death_skeleton,5", (byte) 121);
                if (null != var2) {
                  gca.field_j[5] = jaa.a((byte) 120, var2);
                }
                var2 = mt.a("death_skeleton,6", (byte) 118);
                if (null != var2) {
                  gca.field_j[6] = jaa.a((byte) 37, var2);
                }
                var2 = mt.a("death_skeleton,7", (byte) 102);
                if (var2 != null) {
                  gca.field_j[7] = jaa.a((byte) 87, var2);
                }
                var2 = mt.a("death_skeleton,8", (byte) 113);
                if (var2 != null) {
                  gca.field_j[8] = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("death_dart,0", (byte) 100);
                if (null != var2) {
                  vua.field_D[0] = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("death_dart,1", (byte) 102);
                if (var2 != null) {
                  vua.field_D[1] = jaa.a((byte) 124, var2);
                }
                var2 = mt.a("death_dart,2", (byte) 117);
                if (var2 != null) {
                  vua.field_D[2] = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("death_dart,3", (byte) 112);
                if (var2 != null) {
                  vua.field_D[3] = jaa.a((byte) 100, var2);
                }
                var2 = mt.a("death_dart,4", (byte) 116);
                if (var2 != null) {
                  vua.field_D[4] = jaa.a((byte) 63, var2);
                }
                var2 = mt.a("death_littlesaw,0", (byte) 127);
                if (null != var2) {
                  hg.field_c[0] = jaa.a((byte) 104, var2);
                }
                var2 = mt.a("death_littlesaw,1", (byte) 123);
                if (var2 != null) {
                  hg.field_c[1] = jaa.a((byte) 53, var2);
                }
                var2 = mt.a("death_littlesaw,2", (byte) 110);
                if (null != var2) {
                  hg.field_c[2] = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("death_littlesaw,3", (byte) 126);
                if (var2 != null) {
                  hg.field_c[3] = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("death_littlesaw,4", (byte) 110);
                if (null != var2) {
                  hg.field_c[4] = jaa.a((byte) 117, var2);
                }
                var2 = mt.a("death_littlesaw,5", (byte) 114);
                if (var2 != null) {
                  hg.field_c[5] = jaa.a((byte) 120, var2);
                }
                var2 = mt.a("death_bullet,0", (byte) 109);
                if (var2 != null) {
                  jr.field_j[0] = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("death_bullet,1", (byte) 101);
                if (var2 != null) {
                  jr.field_j[1] = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("death_bullet,2", (byte) 107);
                if (null != var2) {
                  jr.field_j[2] = jaa.a((byte) 108, var2);
                }
                var2 = mt.a("death_bullet,3", (byte) 127);
                if (null != var2) {
                  jr.field_j[3] = jaa.a((byte) 74, var2);
                }
                var2 = mt.a("death_flame,0", (byte) 112);
                if (var2 != null) {
                  fqa.field_F[0] = jaa.a((byte) 55, var2);
                }
                var2 = mt.a("death_flame,1", (byte) 105);
                if (var2 != null) {
                  fqa.field_F[1] = jaa.a((byte) 105, var2);
                }
                var2 = mt.a("death_flame,2", (byte) 111);
                if (null != var2) {
                  fqa.field_F[2] = jaa.a((byte) 121, var2);
                }
                var2 = mt.a("death_flame,3", (byte) 100);
                if (null != var2) {
                  fqa.field_F[3] = jaa.a((byte) 103, var2);
                }
                var2 = mt.a("death_flame,4", (byte) 101);
                if (null != var2) {
                  fqa.field_F[4] = jaa.a((byte) 78, var2);
                }
                var2 = mt.a("death_flame,5", (byte) 117);
                if (null != var2) {
                  fqa.field_F[5] = jaa.a((byte) 115, var2);
                }
                var2 = mt.a("death_flame,6", (byte) 118);
                if (var2 != null) {
                  fqa.field_F[6] = jaa.a((byte) 32, var2);
                }
                var2 = mt.a("death_flame,7", (byte) 119);
                if (var2 != null) {
                  fqa.field_F[7] = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("death_flame,8", (byte) 124);
                if (var2 != null) {
                  fqa.field_F[8] = jaa.a((byte) 77, var2);
                }
                var2 = mt.a("death_flame,9", (byte) 109);
                if (null != var2) {
                  fqa.field_F[9] = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("death_flame,10", (byte) 125);
                if (var2 != null) {
                  fqa.field_F[10] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("death_flame,11", (byte) 118);
                if (var2 != null) {
                  fqa.field_F[11] = jaa.a((byte) 93, var2);
                }
                var2 = mt.a("death_flame,12", (byte) 123);
                if (null != var2) {
                  fqa.field_F[12] = jaa.a((byte) 110, var2);
                }
                var2 = mt.a("death_flame,13", (byte) 105);
                if (null != var2) {
                  fqa.field_F[13] = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("death_laser,0", (byte) 117);
                if (var2 != null) {
                  id.field_g[0] = jaa.a((byte) 47, var2);
                }
                var2 = mt.a("death_laser,1", (byte) 109);
                if (null != var2) {
                  id.field_g[1] = jaa.a((byte) 55, var2);
                }
                var2 = mt.a("death_laser,2", (byte) 108);
                if (var2 != null) {
                  id.field_g[2] = jaa.a((byte) 95, var2);
                }
                var2 = mt.a("death_laser,3", (byte) 124);
                if (null != var2) {
                  id.field_g[3] = jaa.a((byte) 111, var2);
                }
                var2 = mt.a("death_laser,4", (byte) 114);
                if (null != var2) {
                  id.field_g[4] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("death_laser,5", (byte) 119);
                if (null != var2) {
                  id.field_g[5] = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("death_boulder,0", (byte) 111);
                if (var2 != null) {
                  vk.field_c[0] = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("death_boulder,1", (byte) 102);
                if (null != var2) {
                  vk.field_c[1] = jaa.a((byte) 122, var2);
                }
                var2 = mt.a("death_boulder,2", (byte) 113);
                if (var2 != null) {
                  vk.field_c[2] = jaa.a((byte) 111, var2);
                }
                var2 = mt.a("death_boulder,3", (byte) 121);
                if (null != var2) {
                  vk.field_c[3] = jaa.a((byte) 85, var2);
                }
                var2 = mt.a("death_boulder,4", (byte) 109);
                if (var2 != null) {
                  vk.field_c[4] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("death_boulder,5", (byte) 123);
                if (var2 != null) {
                  vk.field_c[5] = jaa.a((byte) 55, var2);
                }
                var2 = mt.a("death_boulder,6", (byte) 111);
                if (var2 != null) {
                  vk.field_c[6] = jaa.a((byte) 69, var2);
                }
                var2 = mt.a("death_bigsaw,0", (byte) 113);
                if (var2 != null) {
                  qr.field_u[0] = jaa.a((byte) 107, var2);
                }
                var2 = mt.a("death_bigsaw,1", (byte) 105);
                if (var2 != null) {
                  qr.field_u[1] = jaa.a((byte) 118, var2);
                }
                var2 = mt.a("death_bigsaw,2", (byte) 102);
                if (var2 != null) {
                  qr.field_u[2] = jaa.a((byte) 103, var2);
                }
                var2 = mt.a("death_bigsaw,3", (byte) 108);
                if (var2 != null) {
                  qr.field_u[3] = jaa.a((byte) 41, var2);
                }
                var2 = mt.a("death_bigsaw,4", (byte) 116);
                if (var2 != null) {
                  qr.field_u[4] = jaa.a((byte) 62, var2);
                }
                var2 = mt.a("death_bigsaw,5", (byte) 126);
                if (null != var2) {
                  qr.field_u[5] = jaa.a((byte) 80, var2);
                }
                var2 = mt.a("death_bigsaw,6", (byte) 102);
                if (var2 != null) {
                  qr.field_u[6] = jaa.a((byte) 60, var2);
                }
                var2 = mt.a("death_bigsaw,7", (byte) 116);
                if (var2 != null) {
                  qr.field_u[7] = jaa.a((byte) 75, var2);
                }
                var2 = mt.a("death_skiproom,0", (byte) 117);
                if (var2 != null) {
                  dta.field_d[0] = jaa.a((byte) 111, var2);
                }
                var2 = mt.a("death_skiproom,1", (byte) 107);
                if (var2 != null) {
                  dta.field_d[1] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("death_skiproom,2", (byte) 112);
                if (var2 != null) {
                  dta.field_d[2] = jaa.a((byte) 105, var2);
                }
                var2 = mt.a("death_skiproom,3", (byte) 101);
                if (var2 != null) {
                  dta.field_d[3] = jaa.a((byte) 28, var2);
                }
                var2 = mt.a("death_skiproom,4", (byte) 100);
                if (null != var2) {
                  dta.field_d[4] = jaa.a((byte) 58, var2);
                }
                var2 = mt.a("death_gas,0", (byte) 115);
                if (var2 != null) {
                  fe.field_A[0] = jaa.a((byte) 85, var2);
                }
                var2 = mt.a("death_gas,1", (byte) 107);
                if (var2 != null) {
                  fe.field_A[1] = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("death_gas,2", (byte) 115);
                if (null != var2) {
                  fe.field_A[2] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("death_gas,3", (byte) 119);
                if (var2 != null) {
                  fe.field_A[3] = jaa.a((byte) 48, var2);
                }
                var2 = mt.a("next_round", (byte) 127);
                if (null != var2) {
                  jaa.a((byte) 105, var2);
                }
                var2 = mt.a("gameoptlabels,0", (byte) 122);
                if (var2 != null) {
                  mga.field_f[0] = jaa.a((byte) 101, var2);
                }
                var2 = mt.a("gameoptlabels,1", (byte) 103);
                if (var2 != null) {
                  mga.field_f[1] = jaa.a((byte) 44, var2);
                }
                var2 = mt.a("gameoptnames,0,0", (byte) 109);
                if (null != var2) {
                  via.field_c[0][0] = jaa.a((byte) 78, var2);
                }
                var2 = mt.a("gameoptnames,0,1", (byte) 118);
                if (var2 != null) {
                  via.field_c[0][1] = jaa.a((byte) 83, var2);
                }
                var2 = mt.a("gameoptnames,0,2", (byte) 102);
                if (null != var2) {
                  via.field_c[0][2] = jaa.a((byte) 88, var2);
                }
                var2 = mt.a("gameoptnames,0,3", (byte) 109);
                if (null != var2) {
                  via.field_c[0][3] = jaa.a((byte) 81, var2);
                }
                var2 = mt.a("gameoptnames,1,0", (byte) 122);
                if (null != var2) {
                  via.field_c[1][0] = jaa.a((byte) 117, var2);
                }
                var2 = mt.a("gameoptnames,1,1", (byte) 120);
                if (null != var2) {
                  via.field_c[1][1] = jaa.a((byte) 41, var2);
                }
                var2 = mt.a("gameopttooltips,0,0", (byte) 110);
                if (null != var2) {
                  qaa.field_a[0][0] = jaa.a((byte) 68, var2);
                }
                var2 = mt.a("gameopttooltips,0,1", (byte) 106);
                if (var2 != null) {
                  qaa.field_a[0][1] = jaa.a((byte) 58, var2);
                }
                var2 = mt.a("gameopttooltips,0,2", (byte) 112);
                if (var2 != null) {
                  qaa.field_a[0][2] = jaa.a((byte) 66, var2);
                }
                var2 = mt.a("gameopttooltips,0,3", (byte) 111);
                if (var2 != null) {
                  qaa.field_a[0][3] = jaa.a((byte) 46, var2);
                }
                var2 = mt.a("gameopttooltips,1,0", (byte) 105);
                if (null != var2) {
                  qaa.field_a[1][0] = jaa.a((byte) 52, var2);
                }
                var2 = mt.a("gameopttooltips,1,1", (byte) 111);
                if (null != var2) {
                  qaa.field_a[1][1] = jaa.a((byte) 57, var2);
                }
                var2 = mt.a("tomb_names,0", (byte) 117);
                if (var2 != null) {
                  vj.field_d[0] = jaa.a((byte) 95, var2);
                }
                var2 = mt.a("tomb_names,1", (byte) 124);
                if (null != var2) {
                  vj.field_d[1] = jaa.a((byte) 50, var2);
                }
                var2 = mt.a("tomb_names,2", (byte) 107);
                if (var2 != null) {
                  vj.field_d[2] = jaa.a((byte) 87, var2);
                }
                var2 = mt.a("tomb_names,3", (byte) 120);
                if (var2 != null) {
                  vj.field_d[3] = jaa.a((byte) 59, var2);
                }
                var2 = mt.a("tomb_names,4", (byte) 111);
                if (null != var2) {
                  vj.field_d[4] = jaa.a((byte) 106, var2);
                }
                var2 = mt.a("tomb_names,5", (byte) 116);
                if (null != var2) {
                  vj.field_d[5] = jaa.a((byte) 36, var2);
                }
                var2 = mt.a("tomb_names,6", (byte) 100);
                if (null != var2) {
                  vj.field_d[6] = jaa.a((byte) 40, var2);
                }
                var2 = mt.a("tomb_names,7", (byte) 125);
                if (null != var2) {
                  vj.field_d[7] = jaa.a((byte) 80, var2);
                }
                var2 = mt.a("tomb_names,8", (byte) 118);
                if (var2 != null) {
                  vj.field_d[8] = jaa.a((byte) 73, var2);
                }
                var2 = mt.a("multiplayer_lobby", (byte) 125);
                if (null != var2) {
                  ol.field_a = jaa.a((byte) 58, var2);
                }
                var2 = mt.a("options", (byte) 100);
                if (var2 != null) {
                  wc.field_d = jaa.a((byte) 126, var2);
                }
                var2 = mt.a("enter_tomb", (byte) 108);
                if (null != var2) {
                  ue.field_t = jaa.a((byte) 91, var2);
                }
                var2 = mt.a("bonus", (byte) 102);
                if (var2 != null) {
                  bd.field_j = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("no_medal", (byte) 116);
                if (null != var2) {
                  hb.field_v = jaa.a((byte) 96, var2);
                }
                var2 = mt.a("gold_medal", (byte) 101);
                if (null != var2) {
                  uaa.field_d = jaa.a((byte) 39, var2);
                }
                var2 = mt.a("silver_medal", (byte) 117);
                if (null != var2) {
                  qna.field_c = jaa.a((byte) 72, var2);
                }
                var2 = mt.a("bronze_medal", (byte) 118);
                if (var2 != null) {
                  ps.field_P = jaa.a((byte) 109, var2);
                }
                var2 = mt.a("previous_member", (byte) 102);
                if (null != var2) {
                  qu.field_c = jaa.a((byte) 25, var2);
                }
                var2 = mt.a("freecontent_compelted", (byte) 125);
                if (null != var2) {
                  tna.field_d = jaa.a((byte) 119, var2);
                }
                var2 = mt.a("justplay", (byte) 109);
                if (null != var2) {
                  tc.field_f = jaa.a((byte) 54, var2);
                }
                var2 = mt.a("adding_coins", (byte) 102);
                if (null != var2) {
                  jaa.a((byte) 56, var2);
                }
                var2 = mt.a("adding_lootbags", (byte) 112);
                if (var2 != null) {
                  jaa.a((byte) 53, var2);
                }
                var2 = mt.a("adding_idols", (byte) 125);
                if (null != var2) {
                  jaa.a((byte) 125, var2);
                }
                var2 = mt.a("points_coins", (byte) 108);
                if (var2 != null) {
                  jaa.a((byte) 108, var2);
                }
                var2 = mt.a("points_lootbags", (byte) 106);
                if (null != var2) {
                  jaa.a((byte) 107, var2);
                }
                var2 = mt.a("points_idols", (byte) 101);
                if (null != var2) {
                  jaa.a((byte) 108, var2);
                }
                var2 = mt.a("restart_world", (byte) 102);
                if (null != var2) {
                  ng.field_e = jaa.a((byte) 52, var2);
                }
                var2 = mt.a("spectator_controls", (byte) 111);
                if (var2 != null) {
                  tp.field_J = jaa.a((byte) 71, var2);
                }
                var2 = mt.a("game_end_iminent", (byte) 121);
                if (var2 != null) {
                  dw.field_j = jaa.a((byte) 105, var2);
                }
                var2 = mt.a("phaseEnd_mybest", (byte) 104);
                if (null != var2) {
                  lea.field_F = jaa.a((byte) 43, var2);
                }
                var2 = mt.a("phaseEnd_friendsbest", (byte) 116);
                if (null != var2) {
                  qw.field_g = jaa.a((byte) 39, var2);
                }
                fs.field_p = null;
            }
            void run() {
                var4 = TombRacer.field_G ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1831_0 = (RuntimeException) (var2_ref);
                  stackIn_1831_1 = new StringBuilder().append("pfa.B(");
                  if (param0 == null) {
                    stackIn_1832_2 = "null";
                  } else {
                    stackIn_1832_2 = "{...}";
                  }
                  throw tba.a((Throwable) ((Object) stackIn_1831_0), ((StringBuilder) (Object) stackIn_1831_1).append(stackIn_1832_2).append(',').append(param1).append(')').toString());
                }
                if (jna.field_m) {
                  TombRacer.field_G = (var4 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void b(byte param0, int param1) {
        if (param0 != 58) {
          return;
        }
        try {
          this.a(-28562, hq.field_b[param1] << 16, jw.field_z[param1] << 16);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        bua stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        boolean stackIn_34_2 = false;
        RuntimeException decompiledCaughtException = null;
        wk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          if (!param0) {
            return;
          }
          boolean decompiledSharedTail0 = !(this.field_f.a((byte) -16) > 0);
          if (!decompiledSharedTail0) {
            if (!this.field_g) {
              this.field_c.a(this.field_d, false, 0, 1, true);
            }
            this.field_g = true;
            var2 = (wk) (this.field_f.f(-80));
            if (!var2.field_j) {
              var2.a(0, this.field_j, this.field_e);
              var2.field_j = true;
            }
            this.field_j = this.field_j + var2.field_l;
            this.field_e = this.field_e + var2.field_f;
            this.field_h = var2.field_h;
            var3 = 327680;
            if (this.field_j >= var2.field_g - var3 &&
              var3 + var2.field_g >= this.field_j &&
              (var2.field_k - var3) <= this.field_e &&
              this.field_e <= var2.field_k + var3) {
              this.field_j = var2.field_g;
              this.field_e = var2.field_k;
              var2.p(10);
            }
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if ((decompiledSharedTail0) &&
            (this.field_g)) {
            stackIn_33_0 = this.field_c;
            stackIn_33_1 = this.field_d;
            stackIn_34_2 = !(param0);
            ((bua) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_34_2, 0, 0, true);
            this.field_h = 0;
            this.field_g = false;
          }
          this.field_c.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "pfa.C(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        wk var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new wk();
          var4.field_g = param2;
          var4.field_k = param1;
          if (param0 != -28562) {
            this.b(96, -22, 33);
          }
          this.field_f.b((byte) -79, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        try {
          field_b = (boolean[][]) null;
          field_a = null;
          field_i = null;
          if (param0 != 4) {
            pfa.a((cn) null, 68);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.A(" + param0 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 79) {
            this.field_c = (bua) null;
          }
          stackIn_10_0 = (~(jw.field_z[param1] << 16) == ~this.field_j) && (this.field_e == hq.field_b[param1] << 16);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "pfa.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        try {
          hp.a(2048, this.field_h, 1900, this.field_c.b((byte) 74), param1 ^ -1918096900, 10 + ((this.field_e >> 16) + param0), (this.field_j >> 16) + param2 + 18);
          if (param1 != 11327) {
            this.a(73, (byte) 91);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -98) {
            this.a((byte) -74, -14);
          }
          this.field_j = jw.field_z[param0] << 16;
          this.field_e = hq.field_b[param0] << 16;
          this.field_f.d(8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "pfa.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        bd var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = (bd) (gg.field_e.c((byte) 22));
          if (param0 != 1) {
            field_a = (String) null;
          }
          if (null == var1) {
            throw new IllegalStateException();
          }
          bea.a(var1.field_g, var1.field_m, var1.field_l);
          bea.b(var1.field_n, var1.field_k, var1.field_h, var1.field_f);
          var1.field_g = null;
          vt.field_a.b((byte) -67, var1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.G(" + param0 + ')');
        }
    }

    pfa(int param0, int param1) {
        try {
          this.field_d = param0;
          this.field_c = new bua(0, this.field_d, 1);
          this.field_c.a(this.field_d, false, 0, 0, true);
          this.field_j = jw.field_z[param1] << 16;
          this.field_e = hq.field_b[param1] << 16;
          this.field_g = false;
          this.field_f = new vna();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Prev";
        field_i = new ura();
    }
}
