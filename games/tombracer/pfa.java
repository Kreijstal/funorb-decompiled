/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa {
    private IntrusiveDeque field_f;
    private int field_h;
    private ModelAnimator field_c;
    static ura field_i;
    int field_e;
    int field_j;
    static String field_a;
    boolean field_g;
    private int field_d;
    static boolean[][] field_b;

    final static void loadLocalizedText(ResourceArchive param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1831_0;
            StringBuilder stackIn_1831_1;
            String stackIn_1832_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            ResourceArchive param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(ResourceArchive initialParam0, int initialParam1) {
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
                CurveOperator.textArchive = param0;
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,0", (byte) 108);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[0] = jaa.decodeText((byte) 77, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,1", (byte) 121);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[1] = jaa.decodeText((byte) 97, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,2", (byte) 115);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[2] = jaa.decodeText((byte) 73, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,3", (byte) 123);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[3] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,4", (byte) 108);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[4] = jaa.decodeText((byte) 125, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,5", (byte) 121);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[5] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,6", (byte) 118);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[6] = jaa.decodeText((byte) 56, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,7", (byte) 124);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[7] = jaa.decodeText((byte) 30, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,8", (byte) 102);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[8] = jaa.decodeText((byte) 77, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,9", (byte) 111);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[9] = jaa.decodeText((byte) 26, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,10", (byte) 110);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[10] = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,11", (byte) 121);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[11] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,12", (byte) 112);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[12] = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,13", (byte) 127);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[13] = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,14", (byte) 116);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[14] = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,15", (byte) 119);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[15] = jaa.decodeText((byte) 122, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,16", (byte) 123);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[16] = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,17", (byte) 102);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[17] = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,18", (byte) 120);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[18] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,19", (byte) 121);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[19] = jaa.decodeText((byte) 75, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,20", (byte) 124);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[20] = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,21", (byte) 104);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[21] = jaa.decodeText((byte) 64, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,22", (byte) 125);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[22] = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,23", (byte) 102);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[23] = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,24", (byte) 104);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[24] = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,25", (byte) 116);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[25] = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,26", (byte) 112);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[26] = jaa.decodeText((byte) 86, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,27", (byte) 102);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[27] = jaa.decodeText((byte) 76, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,28", (byte) 113);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[28] = jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,29", (byte) 118);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[29] = jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,30", (byte) 101);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[30] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,31", (byte) 125);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[31] = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,32", (byte) 115);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[32] = jaa.decodeText((byte) 64, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,33", (byte) 100);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[33] = jaa.decodeText((byte) 79, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,34", (byte) 125);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[34] = jaa.decodeText((byte) 55, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,35", (byte) 109);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[35] = jaa.decodeText((byte) 56, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,36", (byte) 116);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[36] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,37", (byte) 125);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[37] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,38", (byte) 122);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[38] = jaa.decodeText((byte) 116, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,39", (byte) 123);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[39] = jaa.decodeText((byte) 38, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,40", (byte) 100);
                if (null != var2) {
                  ShowLevelSetCommand.achievementNames[40] = jaa.decodeText((byte) 125, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_names,41", (byte) 113);
                if (var2 != null) {
                  ShowLevelSetCommand.achievementNames[41] = jaa.decodeText((byte) 116, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,0", (byte) 105);
                if (var2 != null) {
                  kv.achievementDescriptions[0] = jaa.decodeText((byte) 61, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,1", (byte) 114);
                if (var2 != null) {
                  kv.achievementDescriptions[1] = jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,2", (byte) 110);
                if (null != var2) {
                  kv.achievementDescriptions[2] = jaa.decodeText((byte) 111, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,3", (byte) 104);
                if (var2 != null) {
                  kv.achievementDescriptions[3] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,4", (byte) 127);
                if (null != var2) {
                  kv.achievementDescriptions[4] = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,5", (byte) 111);
                if (null != var2) {
                  kv.achievementDescriptions[5] = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,6", (byte) 113);
                if (var2 != null) {
                  kv.achievementDescriptions[6] = jaa.decodeText((byte) 44, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,7", (byte) 127);
                if (null != var2) {
                  kv.achievementDescriptions[7] = jaa.decodeText((byte) 80, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,8", (byte) 113);
                if (var2 != null) {
                  kv.achievementDescriptions[8] = jaa.decodeText((byte) 98, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,9", (byte) 110);
                if (null != var2) {
                  kv.achievementDescriptions[9] = jaa.decodeText((byte) 45, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,10", (byte) 104);
                if (var2 != null) {
                  kv.achievementDescriptions[10] = jaa.decodeText((byte) 44, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,11", (byte) 117);
                if (null != var2) {
                  kv.achievementDescriptions[11] = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,12", (byte) 104);
                if (null != var2) {
                  kv.achievementDescriptions[12] = jaa.decodeText((byte) 47, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,13", (byte) 120);
                if (var2 != null) {
                  kv.achievementDescriptions[13] = jaa.decodeText((byte) 88, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,14", (byte) 123);
                if (null != var2) {
                  kv.achievementDescriptions[14] = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,15", (byte) 110);
                if (var2 != null) {
                  kv.achievementDescriptions[15] = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,16", (byte) 105);
                if (null != var2) {
                  kv.achievementDescriptions[16] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,17", (byte) 123);
                if (var2 != null) {
                  kv.achievementDescriptions[17] = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,18", (byte) 123);
                if (null != var2) {
                  kv.achievementDescriptions[18] = jaa.decodeText((byte) 49, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,19", (byte) 120);
                if (var2 != null) {
                  kv.achievementDescriptions[19] = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,20", (byte) 110);
                if (var2 != null) {
                  kv.achievementDescriptions[20] = jaa.decodeText((byte) 48, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,21", (byte) 117);
                if (null != var2) {
                  kv.achievementDescriptions[21] = jaa.decodeText((byte) 86, var2);
                }
                var3 = -99 % ((param1 - 40) / 63);
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,22", (byte) 101);
                if (var2 != null) {
                  kv.achievementDescriptions[22] = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,23", (byte) 101);
                if (var2 != null) {
                  kv.achievementDescriptions[23] = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,24", (byte) 103);
                if (null != var2) {
                  kv.achievementDescriptions[24] = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,25", (byte) 125);
                if (var2 != null) {
                  kv.achievementDescriptions[25] = jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,26", (byte) 112);
                if (null != var2) {
                  kv.achievementDescriptions[26] = jaa.decodeText((byte) 56, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,27", (byte) 127);
                if (null != var2) {
                  kv.achievementDescriptions[27] = jaa.decodeText((byte) 61, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,28", (byte) 126);
                if (null != var2) {
                  kv.achievementDescriptions[28] = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,29", (byte) 116);
                if (var2 != null) {
                  kv.achievementDescriptions[29] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,30", (byte) 107);
                if (var2 != null) {
                  kv.achievementDescriptions[30] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,31", (byte) 101);
                if (var2 != null) {
                  kv.achievementDescriptions[31] = jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,32", (byte) 108);
                if (var2 != null) {
                  kv.achievementDescriptions[32] = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,33", (byte) 105);
                if (var2 != null) {
                  kv.achievementDescriptions[33] = jaa.decodeText((byte) 34, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,34", (byte) 124);
                if (var2 != null) {
                  kv.achievementDescriptions[34] = jaa.decodeText((byte) 127, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,35", (byte) 123);
                if (null != var2) {
                  kv.achievementDescriptions[35] = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,36", (byte) 122);
                if (null != var2) {
                  kv.achievementDescriptions[36] = jaa.decodeText((byte) 63, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,37", (byte) 122);
                if (var2 != null) {
                  kv.achievementDescriptions[37] = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,38", (byte) 116);
                if (null != var2) {
                  kv.achievementDescriptions[38] = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,39", (byte) 121);
                if (var2 != null) {
                  kv.achievementDescriptions[39] = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,40", (byte) 117);
                if (var2 != null) {
                  kv.achievementDescriptions[40] = jaa.decodeText((byte) 73, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievement_criteria,41", (byte) 101);
                if (var2 != null) {
                  kv.achievementDescriptions[41] = jaa.decodeText((byte) 31, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("no_textures", (byte) 108);
                if (var2 != null) {
                  jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructions_title", (byte) 112);
                if (var2 != null) {
                  SnakePitBehaviour.field_q = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("highscores_title", (byte) 114);
                if (null != var2) {
                  jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("achievements_title", (byte) 120);
                if (var2 != null) {
                  jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("rankings_title", (byte) 121);
                if (var2 != null) {
                  jaa.decodeText((byte) 94, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("character_select_title", (byte) 120);
                if (var2 != null) {
                  jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("player,0", (byte) 110);
                if (null != var2) {
                  DebouncedValidationSource.defaultPlayerNames[0] = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("player,1", (byte) 105);
                if (null != var2) {
                  DebouncedValidationSource.defaultPlayerNames[1] = jaa.decodeText((byte) 92, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("player,2", (byte) 102);
                if (null != var2) {
                  DebouncedValidationSource.defaultPlayerNames[2] = jaa.decodeText((byte) 64, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("player,3", (byte) 124);
                if (null != var2) {
                  DebouncedValidationSource.defaultPlayerNames[3] = jaa.decodeText((byte) 124, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("positions,0", (byte) 119);
                if (var2 != null) {
                  TextureMetadata.ordinals[0] = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("positions,1", (byte) 114);
                if (var2 != null) {
                  TextureMetadata.ordinals[1] = jaa.decodeText((byte) 30, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("positions,2", (byte) 108);
                if (var2 != null) {
                  TextureMetadata.ordinals[2] = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("positions,3", (byte) 121);
                if (var2 != null) {
                  TextureMetadata.ordinals[3] = jaa.decodeText((byte) 97, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("roundWinner", (byte) 126);
                if (var2 != null) {
                  RasterBuffer.field_h = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameWinner", (byte) 123);
                if (var2 != null) {
                  FallbackShaderEffect.field_d = jaa.decodeText((byte) 41, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("roundWinner_draw", (byte) 113);
                if (var2 != null) {
                  CharacterSelectPhase.field_o = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("milliseconds", (byte) 111);
                if (var2 != null) {
                  jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("arr", (byte) 127);
                if (var2 != null) {
                  PerlinNoise2D.field_y = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("keys", (byte) 107);
                if (null != var2) {
                  waa.field_b = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1left", (byte) 122);
                if (null != var2) {
                  HardwareOpenGlToolkit.field_hd = 255 & var2[0];
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1right", (byte) 119);
                if (null != var2) {
                  mf.field_a = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1up", (byte) 111);
                if (var2 != null) {
                  ConsoleToken.field_k = 255 & var2[0];
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1down", (byte) 112);
                if (null != var2) {
                  fp.field_a = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1fire", (byte) 108);
                if (null != var2) {
                  gsa.field_j = 255 & var2[0];
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1reset", (byte) 105);
                if (null != var2) {
                  MonochromeRowCache.field_i = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1pull", (byte) 122);
                if (var2 != null) {
                  PlantModel.field_o = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1skiproom", (byte) 114);
                if (null != var2) {
                  rta.field_g = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("keycode_player1sneak", (byte) 123);
                if (null != var2) {
                  hra.field_b = var2[0] & 255;
                }
                var2 = ScoringObserverFactory.readTextEntry("oneplayer_timed", (byte) 113);
                if (var2 != null) {
                  StandingsPhase.field_s = jaa.decodeText((byte) 70, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("oneplayer_puzzle", (byte) 114);
                if (null != var2) {
                  FuseBehaviour.field_t = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("startroom_colon", (byte) 109);
                if (var2 != null) {
                  PrimMazeGenerator.field_b = jaa.decodeText((byte) 122, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("difficulty_colon", (byte) 114);
                if (null != var2) {
                  wq.field_d = jaa.decodeText((byte) 85, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("bloom", (byte) 110);
                if (var2 != null) {
                  SweeperMountComponent.field_F = jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("textures", (byte) 123);
                if (var2 != null) {
                  jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pointLights", (byte) 120);
                if (var2 != null) {
                  bq.field_a = jaa.decodeText((byte) 95, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("wallShadows", (byte) 111);
                if (var2 != null) {
                  IntPoint.field_b = jaa.decodeText((byte) 76, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("textures_all", (byte) 104);
                if (null != var2) {
                  jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("textures_some", (byte) 118);
                if (var2 != null) {
                  jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("textures_none", (byte) 108);
                if (var2 != null) {
                  jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_title", (byte) 119);
                if (var2 != null) {
                  tea.field_a = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_firetocontinue", (byte) 100);
                if (var2 != null) {
                  ColouriseOperator.field_n = jaa.decodeText((byte) 127, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_room0", (byte) 116);
                if (var2 != null) {
                  ColourRowCache.field_j = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_death", (byte) 106);
                if (var2 != null) {
                  tha.field_A = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_treasure", (byte) 123);
                if (var2 != null) {
                  RenderScene.field_b = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_treasureslow", (byte) 117);
                if (null != var2) {
                  PlayerContextMenu.field_a = jaa.decodeText((byte) 41, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_key", (byte) 102);
                if (var2 != null) {
                  S2CPlayerSyncPacket.field_f = jaa.decodeText((byte) 65, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_pushable", (byte) 114);
                if (var2 != null) {
                  WhirlpoolDigest.field_c = jaa.decodeText((byte) 99, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_snakes", (byte) 113);
                if (var2 != null) {
                  GasTrapComponent.field_F = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_gun", (byte) 117);
                if (var2 != null) {
                  gca.field_l = jaa.decodeText((byte) 80, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tutorial_restart", (byte) 106);
                if (null != var2) {
                  CharacterChoice.field_a = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleCoins", (byte) 112);
                if (var2 != null) {
                  ct.field_c = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextCoins", (byte) 123);
                if (null != var2) {
                  AnimationSequence.field_k = jaa.decodeText((byte) 119, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleBagsOLoot", (byte) 109);
                if (var2 != null) {
                  HardwareTurbulentWaterNoise.field_o = jaa.decodeText((byte) 104, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextBagsOLoot", (byte) 103);
                if (var2 != null) {
                  BitPacketBuffer.field_m = jaa.decodeText((byte) 39, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleIcons", (byte) 114);
                if (null != var2) {
                  dka.field_c = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextIcons", (byte) 105);
                if (var2 != null) {
                  ne.field_e = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleBottomlessPits", (byte) 127);
                if (var2 != null) {
                  kea.field_b = jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextBottomlessPits", (byte) 109);
                if (null != var2) {
                  bpa.field_a = jaa.decodeText((byte) 61, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleSnakePits", (byte) 119);
                if (null != var2) {
                  baa.field_a = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextSnakePits", (byte) 111);
                if (null != var2) {
                  du.field_f = jaa.decodeText((byte) 88, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleLagoonsOfLava", (byte) 119);
                if (null != var2) {
                  AnimationSequence.field_a = jaa.decodeText((byte) 82, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextLagoonsOfLava", (byte) 101);
                if (null != var2) {
                  vua.field_C = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleCrushers", (byte) 114);
                if (var2 != null) {
                  qba.field_d = jaa.decodeText((byte) 82, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextCrushers", (byte) 116);
                if (var2 != null) {
                  IntPoint.field_c = jaa.decodeText((byte) 99, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleLindemannTotems", (byte) 117);
                if (null != var2) {
                  QuickChatMenu.field_Ab = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextLindemannTotems", (byte) 123);
                if (var2 != null) {
                  InvertOperator.field_o = jaa.decodeText((byte) 29, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMobileLindemannTotems", (byte) 102);
                if (var2 != null) {
                  rua.field_hb = jaa.decodeText((byte) 122, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMobileLindemannTotems", (byte) 120);
                if (var2 != null) {
                  CourseLayoutFactory.field_a = jaa.decodeText((byte) 27, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleBobbyGeorgeTotems", (byte) 114);
                if (var2 != null) {
                  Player.field_s = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextBobbyGeorgeTotems", (byte) 103);
                if (null != var2) {
                  SwitchLinkList.field_d = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMirrors", (byte) 116);
                if (null != var2) {
                  LegacyOpenGlBloomEffect.field_u = jaa.decodeText((byte) 98, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMirrors", (byte) 127);
                if (null != var2) {
                  ThresholdOperator.field_o = jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMobileMirrors", (byte) 126);
                if (var2 != null) {
                  jd.field_m = jaa.decodeText((byte) 63, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMobileMirrors", (byte) 119);
                if (var2 != null) {
                  StaticCrusherComponent.field_G = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitlePrecariousPlatforms", (byte) 127);
                if (null != var2) {
                  RewardChoiceSlot.field_b = jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextPrecariousPlatforms", (byte) 120);
                if (null != var2) {
                  gn.field_y = jaa.decodeText((byte) 82, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleCrumblyBlocks", (byte) 103);
                if (null != var2) {
                  td.field_u = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextCrumblyBlocks", (byte) 108);
                if (null != var2) {
                  MazeComponent.field_G = jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleCauldronsOfGreenSoup", (byte) 115);
                if (var2 != null) {
                  LegacyOpenGlCubeTexture.field_n = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextCauldronsOfGreenSoup", (byte) 112);
                if (var2 != null) {
                  ClientException.field_e = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleSkeletons", (byte) 113);
                if (null != var2) {
                  td.field_n = jaa.decodeText((byte) 92, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextSkeletons", (byte) 101);
                if (var2 != null) {
                  qna.field_a = jaa.decodeText((byte) 27, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleLocksAndKeys", (byte) 101);
                if (null != var2) {
                  ConstrainToCircleLocomotor.field_v = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextLocksAndKeys", (byte) 120);
                if (var2 != null) {
                  apa.field_b = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitlePortals", (byte) 125);
                if (var2 != null) {
                  PowerUpItemBehaviour.field_s = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextPortals", (byte) 107);
                if (var2 != null) {
                  bq.field_e = jaa.decodeText((byte) 75, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleLasers", (byte) 121);
                if (var2 != null) {
                  TouchSwitchBehaviour.field_q = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextLasers", (byte) 122);
                if (var2 != null) {
                  ProceduralTexture.field_n = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMovingPlatforms", (byte) 106);
                if (var2 != null) {
                  RopeBridgeComponent.field_G = jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMovingPlatforms", (byte) 102);
                if (var2 != null) {
                  tr.field_d = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitlePressurePads", (byte) 101);
                if (var2 != null) {
                  ConstrainToCircleLocomotor.field_t = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextPressurePads", (byte) 113);
                if (null != var2) {
                  DisplaySettingsDialog.field_R = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleRollingJonesboulders", (byte) 115);
                if (var2 != null) {
                  kd.field_z = jaa.decodeText((byte) 57, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextRollingJonesboulders", (byte) 127);
                if (null != var2) {
                  ViewportManager.field_a = jaa.decodeText((byte) 118, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleDiscOfDeathVendingMachines", (byte) 123);
                if (null != var2) {
                  nea.field_b = jaa.decodeText((byte) 124, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextDiscOfDeathVendingMachines", (byte) 116);
                if (var2 != null) {
                  MenuScreen.field_h = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitlePerpetuallySpinningDiscs", (byte) 111);
                if (var2 != null) {
                  gga.field_L = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextPerpetuallySpinningDiscs", (byte) 120);
                if (var2 != null) {
                  PrefabComponent.field_D = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleWhiteLightBeams", (byte) 123);
                if (var2 != null) {
                  MatchScoringObserver.field_d = jaa.decodeText((byte) 33, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextWhiteLightBeams", (byte) 111);
                if (var2 != null) {
                  ld.field_d = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleWanderingWalls", (byte) 103);
                if (var2 != null) {
                  PitModel.field_r = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextWanderingWalls", (byte) 117);
                if (var2 != null) {
                  du.field_b = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMazes", (byte) 118);
                if (null != var2) {
                  GridWidgetContainer.field_H = jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMazes", (byte) 105);
                if (var2 != null) {
                  fb.field_b = jaa.decodeText((byte) 31, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitleMoveableBlocks", (byte) 127);
                if (null != var2) {
                  TripBeamComponent.field_J = jaa.decodeText((byte) 42, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextMoveableBlocks", (byte) 123);
                if (var2 != null) {
                  TreasureValuesOverlay.field_k = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTitlePistols", (byte) 104);
                if (var2 != null) {
                  VortexBehaviour.field_o = jaa.decodeText((byte) 98, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionTextPistols", (byte) 119);
                if (var2 != null) {
                  SoftwareTransform3D.field_k = jaa.decodeText((byte) 104, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Title1", (byte) 117);
                if (var2 != null) {
                  ConsoleMethod.field_m = jaa.decodeText((byte) 39, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Title2", (byte) 116);
                if (var2 != null) {
                  fr.field_a = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Title3", (byte) 127);
                if (var2 != null) {
                  qfa.field_a = jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text1", (byte) 108);
                if (var2 != null) {
                  CharacterSelection.field_f = jaa.decodeText((byte) 31, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text2", (byte) 125);
                if (var2 != null) {
                  LegacySwitchModel.field_o = jaa.decodeText((byte) 93, var2);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text3", (byte) 113);
                if (var2 != null) {
                  AccountRegistrationPanel.field_H = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text4", (byte) 126);
                if (var2 != null) {
                  PushableBlockMazeComponent.field_K = jaa.decodeText((byte) 97, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text5", (byte) 123);
                if (null != var2) {
                  pba.field_c = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("instructionsPage1Text6", (byte) 116);
                if (var2 != null) {
                  LegacyTextureCache.field_c = jaa.decodeText((byte) 100, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,0", (byte) 100);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[0] = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,1", (byte) 107);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[1] = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,2", (byte) 125);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[2] = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,3", (byte) 105);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[3] = jaa.decodeText((byte) 92, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,4", (byte) 110);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[4] = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,5", (byte) 101);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[5] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,6", (byte) 124);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[6] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,7", (byte) 126);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[7] = jaa.decodeText((byte) 27, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,8", (byte) 125);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[8] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,9", (byte) 111);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[9] = jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,10", (byte) 104);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[10] = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,11", (byte) 120);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[11] = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,12", (byte) 119);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[12] = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,13", (byte) 127);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[13] = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,14", (byte) 106);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[14] = jaa.decodeText((byte) 75, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,15", (byte) 127);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[15] = jaa.decodeText((byte) 39, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,16", (byte) 121);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[16] = jaa.decodeText((byte) 65, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,17", (byte) 120);
                if (var2 != null) {
                  RewardChoiceSlot.loadingQuipsAlternate[17] = jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("loadingStrings,18", (byte) 124);
                if (null != var2) {
                  RewardChoiceSlot.loadingQuipsAlternate[18] = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,0", (byte) 108);
                if (var2 != null) {
                  Player.loadingQuips[0] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,1", (byte) 117);
                if (null != var2) {
                  Player.loadingQuips[1] = jaa.decodeText((byte) 94, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,2", (byte) 124);
                if (null != var2) {
                  Player.loadingQuips[2] = jaa.decodeText((byte) 117, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,3", (byte) 107);
                if (var2 != null) {
                  Player.loadingQuips[3] = jaa.decodeText((byte) 118, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,4", (byte) 114);
                if (var2 != null) {
                  Player.loadingQuips[4] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,5", (byte) 117);
                if (var2 != null) {
                  Player.loadingQuips[5] = jaa.decodeText((byte) 53, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,6", (byte) 107);
                if (var2 != null) {
                  Player.loadingQuips[6] = jaa.decodeText((byte) 87, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,7", (byte) 105);
                if (var2 != null) {
                  Player.loadingQuips[7] = jaa.decodeText((byte) 127, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,8", (byte) 112);
                if (var2 != null) {
                  Player.loadingQuips[8] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,9", (byte) 110);
                if (null != var2) {
                  Player.loadingQuips[9] = jaa.decodeText((byte) 55, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,10", (byte) 126);
                if (null != var2) {
                  Player.loadingQuips[10] = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,11", (byte) 103);
                if (var2 != null) {
                  Player.loadingQuips[11] = jaa.decodeText((byte) 100, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,12", (byte) 122);
                if (null != var2) {
                  Player.loadingQuips[12] = jaa.decodeText((byte) 116, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,13", (byte) 110);
                if (var2 != null) {
                  Player.loadingQuips[13] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,14", (byte) 100);
                if (var2 != null) {
                  Player.loadingQuips[14] = jaa.decodeText((byte) 57, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,15", (byte) 104);
                if (var2 != null) {
                  Player.loadingQuips[15] = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,16", (byte) 107);
                if (var2 != null) {
                  Player.loadingQuips[16] = jaa.decodeText((byte) 57, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,17", (byte) 102);
                if (null != var2) {
                  Player.loadingQuips[17] = jaa.decodeText((byte) 82, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waitingStrings,18", (byte) 117);
                if (var2 != null) {
                  Player.loadingQuips[18] = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,0", (byte) 108);
                if (null != var2) {
                  uba.loadingQuipsShort[0] = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,1", (byte) 109);
                if (null != var2) {
                  uba.loadingQuipsShort[1] = jaa.decodeText((byte) 44, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,2", (byte) 112);
                if (null != var2) {
                  uba.loadingQuipsShort[2] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,3", (byte) 126);
                if (var2 != null) {
                  uba.loadingQuipsShort[3] = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,4", (byte) 118);
                if (var2 != null) {
                  uba.loadingQuipsShort[4] = jaa.decodeText((byte) 26, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,5", (byte) 101);
                if (var2 != null) {
                  uba.loadingQuipsShort[5] = jaa.decodeText((byte) 84, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,6", (byte) 123);
                if (var2 != null) {
                  uba.loadingQuipsShort[6] = jaa.decodeText((byte) 49, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,7", (byte) 127);
                if (var2 != null) {
                  uba.loadingQuipsShort[7] = jaa.decodeText((byte) 42, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,8", (byte) 107);
                if (null != var2) {
                  uba.loadingQuipsShort[8] = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,9", (byte) 115);
                if (var2 != null) {
                  uba.loadingQuipsShort[9] = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unpackingStrings,10", (byte) 118);
                if (null != var2) {
                  uba.loadingQuipsShort[10] = jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("error", (byte) 113);
                if (var2 != null) {
                  ValidatedTextInputWidget.field_L = jaa.decodeText((byte) 73, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pleaselogin", (byte) 105);
                if (null != var2) {
                  ClampOperator.field_o = jaa.decodeText((byte) 79, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("hint_drag", (byte) 115);
                if (null != var2) {
                  qja.field_k = jaa.decodeText((byte) 26, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("hint_drop", (byte) 112);
                if (null != var2) {
                  hda.field_h = jaa.decodeText((byte) 52, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("hint_sneak", (byte) 112);
                if (null != var2) {
                  aca.field_g = jaa.decodeText((byte) 65, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("hint_fire", (byte) 108);
                if (null != var2) {
                  bb.field_l = jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("item_keys", (byte) 107);
                if (var2 != null) {
                  jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("item_coins", (byte) 107);
                if (null != var2) {
                  DoorwayModel.field_m = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("item_bags", (byte) 121);
                if (var2 != null) {
                  CircleMovementLocomotor.field_s = jaa.decodeText((byte) 49, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("item_idols", (byte) 100);
                if (var2 != null) {
                  BevelOperator.field_o = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_dartgun", (byte) 103);
                if (null != var2) {
                  DraggableWidget.field_B = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_machinegun", (byte) 104);
                if (var2 != null) {
                  tha.field_y = jaa.decodeText((byte) 95, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_shotgun", (byte) 125);
                if (var2 != null) {
                  gqa.field_a = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_flaregun", (byte) 117);
                if (null != var2) {
                  ConsoleValue.field_b = jaa.decodeText((byte) 70, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_flamer", (byte) 119);
                if (var2 != null) {
                  HardwareReflectionEffect.field_d = jaa.decodeText((byte) 103, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_flamershort", (byte) 101);
                if (var2 != null) {
                  TrackingCrusherComponent.field_H = jaa.decodeText((byte) 61, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_flamerblue", (byte) 113);
                if (var2 != null) {
                  tv.field_ub = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_waterspray", (byte) 101);
                if (null != var2) {
                  bf.field_f = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_bladelauncher", (byte) 116);
                if (null != var2) {
                  MonsterModel.field_A = jaa.decodeText((byte) 47, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_fireball", (byte) 112);
                if (var2 != null) {
                  hg.field_d = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_bouncingfireball", (byte) 124);
                if (var2 != null) {
                  ItemModel.field_q = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_freezer", (byte) 114);
                if (null != var2) {
                  fp.field_b = jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("weapon_revolver", (byte) 127);
                if (var2 != null) {
                  S2CPlayerSyncPacket.field_e = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_1st", (byte) 113);
                if (var2 != null) {
                  ArchiveManager.field_d = jaa.decodeText((byte) 39, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_2nd", (byte) 101);
                if (var2 != null) {
                  S2CNewRoomPacket.field_g = jaa.decodeText((byte) 45, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_3rd", (byte) 118);
                if (var2 != null) {
                  WhirlpoolDigest.field_b = jaa.decodeText((byte) 58, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_4th", (byte) 105);
                if (null != var2) {
                  tda.field_b = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_resigned", (byte) 116);
                if (null != var2) {
                  ik.field_j = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_completed", (byte) 117);
                if (var2 != null) {
                  ad.field_i = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("pos_dnf", (byte) 117);
                if (var2 != null) {
                  re.field_b = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("resigned", (byte) 106);
                if (null != var2) {
                  id.field_i = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("won_x_rounds", (byte) 112);
                if (var2 != null) {
                  WallCrusherComponent.field_K = jaa.decodeText((byte) 119, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("offering_rematch", (byte) 105);
                if (null != var2) {
                  SoundEventPlayer.field_d = jaa.decodeText((byte) 33, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("rank", (byte) 122);
                if (var2 != null) {
                  OpenGlBuffer.field_a = jaa.decodeText((byte) 65, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("fivehunderedplus", (byte) 118);
                if (null != var2) {
                  kha.field_a = jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("graphicsmode", (byte) 101);
                if (null != var2) {
                  dna.field_I = jaa.decodeText((byte) 45, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("graphicsquality", (byte) 110);
                if (var2 != null) {
                  bc.field_a = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("slowmoveshift", (byte) 110);
                if (var2 != null) {
                  pg.field_A = jaa.decodeText((byte) 103, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("slowmovegood", (byte) 119);
                if (var2 != null) {
                  gka.field_f = jaa.decodeText((byte) 32, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("slowmovemove", (byte) 127);
                if (null != var2) {
                  NetworkArchiveRequest.field_p = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("room_X_of_Y", (byte) 116);
                if (null != var2) {
                  TimingPattern.field_k = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("completed", (byte) 104);
                if (var2 != null) {
                  iaa.field_a = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("failed", (byte) 108);
                if (var2 != null) {
                  ArrowShooterComponent.field_K = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("out_of_time", (byte) 112);
                if (null != var2) {
                  SafeZoneBehaviour.field_n = jaa.decodeText((byte) 117, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("finish_time_colon", (byte) 104);
                if (var2 != null) {
                  cc.field_l = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_finished", (byte) 119);
                if (null != var2) {
                  ara.field_yb = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_failedtofinish", (byte) 107);
                if (var2 != null) {
                  DisplaySettingsDialog.field_Q = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_timeup", (byte) 114);
                if (var2 != null) {
                  hu.field_a = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_chosen_character", (byte) 117);
                if (var2 != null) {
                  SpriteSampleOperator.field_n = jaa.decodeText((byte) 112, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_chosen_reward", (byte) 112);
                if (null != var2) {
                  RecursiveBacktrackerMazeGenerator.field_b = jaa.decodeText((byte) 109, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("msg_didnt_choose_reward", (byte) 125);
                if (var2 != null) {
                  OpenGlTransform3D.field_n = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("roundover_winner", (byte) 123);
                if (null != var2) {
                  ru.field_a = jaa.decodeText((byte) 47, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameover", (byte) 106);
                if (null != var2) {
                  jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameover_aborted", (byte) 125);
                if (var2 != null) {
                  jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameover_winner", (byte) 117);
                if (var2 != null) {
                  jaa.decodeText((byte) 119, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameover_completed", (byte) 107);
                if (var2 != null) {
                  jaa.decodeText((byte) 125, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("choose_character", (byte) 110);
                if (var2 != null) {
                  gta.field_a = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("choose_reward", (byte) 106);
                if (null != var2) {
                  us.field_c = jaa.decodeText((byte) 102, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("choose_reward_timeleft", (byte) 124);
                if (var2 != null) {
                  OpenGlDisplayLists.field_h = jaa.decodeText((byte) 35, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waiting_for_others", (byte) 126);
                if (var2 != null) {
                  jsa.field_F = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waiting_for", (byte) 127);
                if (var2 != null) {
                  cba.field_c = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("time_remaining", (byte) 100);
                if (null != var2) {
                  jaa.decodeText((byte) 44, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("finish_order", (byte) 112);
                if (null != var2) {
                  PowerUpItemBehaviour.field_v = jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("spectator", (byte) 124);
                if (null != var2) {
                  PitTile.field_c = jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("watching", (byte) 113);
                if (null != var2) {
                  CrossedSineBandsOperator.field_q = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("round", (byte) 125);
                if (var2 != null) {
                  ConstrainToCircleLocomotor.field_z = jaa.decodeText((byte) 57, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("get_ready", (byte) 104);
                if (var2 != null) {
                  MouseInputHandler.field_b = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gogogo", (byte) 106);
                if (var2 != null) {
                  FlameShooterComponent.field_J = jaa.decodeText((byte) 73, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("waiting_for_sync", (byte) 104);
                if (var2 != null) {
                  hu.field_d = jaa.decodeText((byte) 87, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("treasure_values", (byte) 102);
                if (null != var2) {
                  wj.field_b = jaa.decodeText((byte) 56, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("treasure_total", (byte) 126);
                if (null != var2) {
                  PrimMazeGenerator.field_c = jaa.decodeText((byte) 42, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("points", (byte) 123);
                if (null != var2) {
                  nsa.field_f = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("room_points", (byte) 101);
                if (var2 != null) {
                  VariantMask.field_c = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("room_complete_points", (byte) 121);
                if (null != var2) {
                  BevelOperator.field_q = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("room_complete_points_with_bonus", (byte) 121);
                if (null != var2) {
                  ArrowShooterComponent.field_J = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("penalty_death", (byte) 125);
                if (null != var2) {
                  ConsoleWindow.field_n = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("penalty_reset", (byte) 117);
                if (null != var2) {
                  rf.field_a = jaa.decodeText((byte) 92, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("final_score_colon", (byte) 107);
                if (var2 != null) {
                  jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("powerdown_from", (byte) 103);
                if (var2 != null) {
                  jaa.decodeText((byte) 100, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("powerdown_pending", (byte) 116);
                if (var2 != null) {
                  jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_coin15", (byte) 120);
                if (var2 != null) {
                  SnakePitBehaviour.field_p = jaa.decodeText((byte) 92, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_coin10", (byte) 115);
                if (var2 != null) {
                  mu.field_wb = jaa.decodeText((byte) 124, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_coin5", (byte) 108);
                if (null != var2) {
                  ValidatedTextInputWidget.field_J = jaa.decodeText((byte) 27, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_bag2", (byte) 103);
                if (null != var2) {
                  tja.field_p = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_bagx2", (byte) 124);
                if (null != var2) {
                  sda.field_h = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_idol1", (byte) 101);
                if (var2 != null) {
                  MatchStatistics.field_k = jaa.decodeText((byte) 123, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_idolx2", (byte) 105);
                if (null != var2) {
                  FleeLocomotor.field_x = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_none", (byte) 127);
                if (null != var2) {
                  jaa.decodeText((byte) 63, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_taken", (byte) 119);
                if (var2 != null) {
                  jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_none_waiting", (byte) 116);
                if (var2 != null) {
                  RoomDefinition.field_i = jaa.decodeText((byte) 35, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_none_dnf", (byte) 123);
                if (null != var2) {
                  cs.field_b = jaa.decodeText((byte) 104, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_none_timeout", (byte) 121);
                if (var2 != null) {
                  cga.field_l = jaa.decodeText((byte) 67, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("reward_none_choosing", (byte) 113);
                if (var2 != null) {
                  RoundWinnerPhase.field_o = jaa.decodeText((byte) 79, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unlock_character", (byte) 100);
                if (var2 != null) {
                  SocketArchiveNetworkClient.field_v = jaa.decodeText((byte) 86, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("unlock_tier", (byte) 109);
                if (var2 != null) {
                  r.field_k = jaa.decodeText((byte) 94, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_ace", (byte) 124);
                if (null != var2) {
                  gh.field_e = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_angelio", (byte) 103);
                if (null != var2) {
                  hra.field_a = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_baroness", (byte) 109);
                if (var2 != null) {
                  poa.field_p = jaa.decodeText((byte) 52, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_borees", (byte) 125);
                if (var2 != null) {
                  DebouncedValidationSource.field_d = jaa.decodeText((byte) 45, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_bruce", (byte) 109);
                if (var2 != null) {
                  GameScreen.field_a = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_feng", (byte) 121);
                if (null != var2) {
                  IntrusiveNode.field_b = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_hans", (byte) 126);
                if (var2 != null) {
                  FacePlayerLocomotor.field_q = jaa.decodeText((byte) 31, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_henryj", (byte) 124);
                if (null != var2) {
                  iea.field_e = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_jamille", (byte) 113);
                if (var2 != null) {
                  sda.field_k = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_johnsson", (byte) 113);
                if (null != var2) {
                  rha.field_h = jaa.decodeText((byte) 34, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_piles", (byte) 119);
                if (var2 != null) {
                  pha.field_Ib = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_scarlett", (byte) 117);
                if (null != var2) {
                  msa.field_b = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("name_wilbur", (byte) 119);
                if (null != var2) {
                  tr.field_e = jaa.decodeText((byte) 98, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_unknown,0", (byte) 102);
                if (var2 != null) {
                  kla.unknownDeathMessages[0] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_unknown,1", (byte) 104);
                if (var2 != null) {
                  kla.unknownDeathMessages[1] = jaa.decodeText((byte) 116, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_unknown,2", (byte) 118);
                if (var2 != null) {
                  kla.unknownDeathMessages[2] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,0", (byte) 100);
                if (var2 != null) {
                  BlockComponent.restartMessages[0] = jaa.decodeText((byte) 127, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,1", (byte) 102);
                if (null != var2) {
                  BlockComponent.restartMessages[1] = jaa.decodeText((byte) 61, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,2", (byte) 108);
                if (null != var2) {
                  BlockComponent.restartMessages[2] = jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,3", (byte) 107);
                if (var2 != null) {
                  BlockComponent.restartMessages[3] = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,4", (byte) 120);
                if (var2 != null) {
                  BlockComponent.restartMessages[4] = jaa.decodeText((byte) 79, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,5", (byte) 105);
                if (var2 != null) {
                  BlockComponent.restartMessages[5] = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,6", (byte) 110);
                if (null != var2) {
                  BlockComponent.restartMessages[6] = jaa.decodeText((byte) 90, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,7", (byte) 121);
                if (var2 != null) {
                  BlockComponent.restartMessages[7] = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_reset,8", (byte) 123);
                if (var2 != null) {
                  BlockComponent.restartMessages[8] = jaa.decodeText((byte) 88, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,0", (byte) 107);
                if (null != var2) {
                  MonsterRemains.crushDeathMessages[0] = jaa.decodeText((byte) 127, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,1", (byte) 119);
                if (var2 != null) {
                  MonsterRemains.crushDeathMessages[1] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,2", (byte) 117);
                if (null != var2) {
                  MonsterRemains.crushDeathMessages[2] = jaa.decodeText((byte) 42, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,3", (byte) 126);
                if (var2 != null) {
                  MonsterRemains.crushDeathMessages[3] = jaa.decodeText((byte) 32, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,4", (byte) 109);
                if (null != var2) {
                  MonsterRemains.crushDeathMessages[4] = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,5", (byte) 118);
                if (var2 != null) {
                  MonsterRemains.crushDeathMessages[5] = jaa.decodeText((byte) 85, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,6", (byte) 126);
                if (var2 != null) {
                  MonsterRemains.crushDeathMessages[6] = jaa.decodeText((byte) 100, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedhorizontal,7", (byte) 118);
                if (var2 != null) {
                  MonsterRemains.crushDeathMessages[7] = jaa.decodeText((byte) 27, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,0", (byte) 125);
                if (null != var2) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[0] = jaa.decodeText((byte) 98, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,1", (byte) 103);
                if (var2 != null) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[1] = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,2", (byte) 110);
                if (var2 != null) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[2] = jaa.decodeText((byte) 87, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,3", (byte) 117);
                if (var2 != null) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[3] = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,4", (byte) 102);
                if (null != var2) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[4] = jaa.decodeText((byte) 120, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,5", (byte) 104);
                if (var2 != null) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[5] = jaa.decodeText((byte) 99, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_squishedvertical,6", (byte) 109);
                if (null != var2) {
                  TurbulenceNoise3D.fallingObjectDeathMessages[6] = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,0", (byte) 121);
                if (var2 != null) {
                  tia.fallDeathMessages[0] = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,1", (byte) 101);
                if (null != var2) {
                  tia.fallDeathMessages[1] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,2", (byte) 103);
                if (null != var2) {
                  tia.fallDeathMessages[2] = jaa.decodeText((byte) 65, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,3", (byte) 117);
                if (null != var2) {
                  tia.fallDeathMessages[3] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,4", (byte) 122);
                if (null != var2) {
                  tia.fallDeathMessages[4] = jaa.decodeText((byte) 26, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,5", (byte) 122);
                if (null != var2) {
                  tia.fallDeathMessages[5] = jaa.decodeText((byte) 75, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,6", (byte) 118);
                if (null != var2) {
                  tia.fallDeathMessages[6] = jaa.decodeText((byte) 114, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_fell,7", (byte) 112);
                if (null != var2) {
                  tia.fallDeathMessages[7] = jaa.decodeText((byte) 38, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,0", (byte) 100);
                if (var2 != null) {
                  Effect.lavaDeathMessages[0] = jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,1", (byte) 124);
                if (null != var2) {
                  Effect.lavaDeathMessages[1] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,2", (byte) 110);
                if (null != var2) {
                  Effect.lavaDeathMessages[2] = jaa.decodeText((byte) 74, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,3", (byte) 121);
                if (var2 != null) {
                  Effect.lavaDeathMessages[3] = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,4", (byte) 123);
                if (null != var2) {
                  Effect.lavaDeathMessages[4] = jaa.decodeText((byte) 51, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_lava,5", (byte) 113);
                if (var2 != null) {
                  Effect.lavaDeathMessages[5] = jaa.decodeText((byte) 110, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,0", (byte) 101);
                if (var2 != null) {
                  fpa.snakeDeathMessages[0] = jaa.decodeText((byte) 109, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,1", (byte) 116);
                if (null != var2) {
                  fpa.snakeDeathMessages[1] = jaa.decodeText((byte) 89, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,2", (byte) 101);
                if (var2 != null) {
                  fpa.snakeDeathMessages[2] = jaa.decodeText((byte) 30, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,3", (byte) 111);
                if (var2 != null) {
                  fpa.snakeDeathMessages[3] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,4", (byte) 107);
                if (var2 != null) {
                  fpa.snakeDeathMessages[4] = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,5", (byte) 126);
                if (var2 != null) {
                  fpa.snakeDeathMessages[5] = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_snake,6", (byte) 116);
                if (null != var2) {
                  fpa.snakeDeathMessages[6] = jaa.decodeText((byte) 31, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,0", (byte) 117);
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (null != var2) {
                  gca.skeletonDeathMessages[0] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,1", (byte) 101);
                if (null != var2) {
                  gca.skeletonDeathMessages[1] = jaa.decodeText((byte) 113, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,2", (byte) 106);
                if (null != var2) {
                  gca.skeletonDeathMessages[2] = jaa.decodeText((byte) 79, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,3", (byte) 109);
                if (var2 != null) {
                  gca.skeletonDeathMessages[3] = jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,4", (byte) 107);
                if (var2 != null) {
                  gca.skeletonDeathMessages[4] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,5", (byte) 121);
                if (null != var2) {
                  gca.skeletonDeathMessages[5] = jaa.decodeText((byte) 120, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,6", (byte) 118);
                if (null != var2) {
                  gca.skeletonDeathMessages[6] = jaa.decodeText((byte) 37, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,7", (byte) 102);
                if (var2 != null) {
                  gca.skeletonDeathMessages[7] = jaa.decodeText((byte) 87, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skeleton,8", (byte) 113);
                if (var2 != null) {
                  gca.skeletonDeathMessages[8] = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_dart,0", (byte) 100);
                if (null != var2) {
                  vua.dartDeathMessages[0] = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_dart,1", (byte) 102);
                if (var2 != null) {
                  vua.dartDeathMessages[1] = jaa.decodeText((byte) 124, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_dart,2", (byte) 117);
                if (var2 != null) {
                  vua.dartDeathMessages[2] = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_dart,3", (byte) 112);
                if (var2 != null) {
                  vua.dartDeathMessages[3] = jaa.decodeText((byte) 100, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_dart,4", (byte) 116);
                if (var2 != null) {
                  vua.dartDeathMessages[4] = jaa.decodeText((byte) 63, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,0", (byte) 127);
                if (null != var2) {
                  hg.bladeDeathMessages[0] = jaa.decodeText((byte) 104, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,1", (byte) 123);
                if (var2 != null) {
                  hg.bladeDeathMessages[1] = jaa.decodeText((byte) 53, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,2", (byte) 110);
                if (null != var2) {
                  hg.bladeDeathMessages[2] = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,3", (byte) 126);
                if (var2 != null) {
                  hg.bladeDeathMessages[3] = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,4", (byte) 110);
                if (null != var2) {
                  hg.bladeDeathMessages[4] = jaa.decodeText((byte) 117, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_littlesaw,5", (byte) 114);
                if (var2 != null) {
                  hg.bladeDeathMessages[5] = jaa.decodeText((byte) 120, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bullet,0", (byte) 109);
                if (var2 != null) {
                  jr.gunshotDeathMessages[0] = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bullet,1", (byte) 101);
                if (var2 != null) {
                  jr.gunshotDeathMessages[1] = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bullet,2", (byte) 107);
                if (null != var2) {
                  jr.gunshotDeathMessages[2] = jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bullet,3", (byte) 127);
                if (null != var2) {
                  jr.gunshotDeathMessages[3] = jaa.decodeText((byte) 74, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,0", (byte) 112);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[0] = jaa.decodeText((byte) 55, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,1", (byte) 105);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[1] = jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,2", (byte) 111);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[2] = jaa.decodeText((byte) 121, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,3", (byte) 100);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[3] = jaa.decodeText((byte) 103, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,4", (byte) 101);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[4] = jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,5", (byte) 117);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[5] = jaa.decodeText((byte) 115, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,6", (byte) 118);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[6] = jaa.decodeText((byte) 32, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,7", (byte) 119);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[7] = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,8", (byte) 124);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[8] = jaa.decodeText((byte) 77, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,9", (byte) 109);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[9] = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,10", (byte) 125);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[10] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,11", (byte) 118);
                if (var2 != null) {
                  SwitchComponent.fireDeathMessages[11] = jaa.decodeText((byte) 93, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,12", (byte) 123);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[12] = jaa.decodeText((byte) 110, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_flame,13", (byte) 105);
                if (null != var2) {
                  SwitchComponent.fireDeathMessages[13] = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,0", (byte) 117);
                if (var2 != null) {
                  id.laserDeathMessages[0] = jaa.decodeText((byte) 47, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,1", (byte) 109);
                if (null != var2) {
                  id.laserDeathMessages[1] = jaa.decodeText((byte) 55, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,2", (byte) 108);
                if (var2 != null) {
                  id.laserDeathMessages[2] = jaa.decodeText((byte) 95, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,3", (byte) 124);
                if (null != var2) {
                  id.laserDeathMessages[3] = jaa.decodeText((byte) 111, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,4", (byte) 114);
                if (null != var2) {
                  id.laserDeathMessages[4] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_laser,5", (byte) 119);
                if (null != var2) {
                  id.laserDeathMessages[5] = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,0", (byte) 111);
                if (var2 != null) {
                  CourseLayoutFactory.boulderDeathMessages[0] = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,1", (byte) 102);
                if (null != var2) {
                  CourseLayoutFactory.boulderDeathMessages[1] = jaa.decodeText((byte) 122, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,2", (byte) 113);
                if (var2 != null) {
                  CourseLayoutFactory.boulderDeathMessages[2] = jaa.decodeText((byte) 111, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,3", (byte) 121);
                if (null != var2) {
                  CourseLayoutFactory.boulderDeathMessages[3] = jaa.decodeText((byte) 85, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,4", (byte) 109);
                if (var2 != null) {
                  CourseLayoutFactory.boulderDeathMessages[4] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,5", (byte) 123);
                if (var2 != null) {
                  CourseLayoutFactory.boulderDeathMessages[5] = jaa.decodeText((byte) 55, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_boulder,6", (byte) 111);
                if (var2 != null) {
                  CourseLayoutFactory.boulderDeathMessages[6] = jaa.decodeText((byte) 69, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,0", (byte) 113);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[0] = jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,1", (byte) 105);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[1] = jaa.decodeText((byte) 118, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,2", (byte) 102);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[2] = jaa.decodeText((byte) 103, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,3", (byte) 108);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[3] = jaa.decodeText((byte) 41, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,4", (byte) 116);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[4] = jaa.decodeText((byte) 62, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,5", (byte) 126);
                if (null != var2) {
                  SingleChildWidget.sawDeathMessages[5] = jaa.decodeText((byte) 80, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,6", (byte) 102);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[6] = jaa.decodeText((byte) 60, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_bigsaw,7", (byte) 116);
                if (var2 != null) {
                  SingleChildWidget.sawDeathMessages[7] = jaa.decodeText((byte) 75, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skiproom,0", (byte) 117);
                if (var2 != null) {
                  dta.skipRoomMessages[0] = jaa.decodeText((byte) 111, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skiproom,1", (byte) 107);
                if (var2 != null) {
                  dta.skipRoomMessages[1] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skiproom,2", (byte) 112);
                if (var2 != null) {
                  dta.skipRoomMessages[2] = jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skiproom,3", (byte) 101);
                if (var2 != null) {
                  dta.skipRoomMessages[3] = jaa.decodeText((byte) 28, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_skiproom,4", (byte) 100);
                if (null != var2) {
                  dta.skipRoomMessages[4] = jaa.decodeText((byte) 58, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_gas,0", (byte) 115);
                if (var2 != null) {
                  DateFieldsWidget.gasDeathMessages[0] = jaa.decodeText((byte) 85, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_gas,1", (byte) 107);
                if (var2 != null) {
                  DateFieldsWidget.gasDeathMessages[1] = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_gas,2", (byte) 115);
                if (null != var2) {
                  DateFieldsWidget.gasDeathMessages[2] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("death_gas,3", (byte) 119);
                if (var2 != null) {
                  DateFieldsWidget.gasDeathMessages[3] = jaa.decodeText((byte) 48, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("next_round", (byte) 127);
                if (null != var2) {
                  jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptlabels,0", (byte) 122);
                if (var2 != null) {
                  mga.field_f[0] = jaa.decodeText((byte) 101, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptlabels,1", (byte) 103);
                if (var2 != null) {
                  mga.field_f[1] = jaa.decodeText((byte) 44, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,0,0", (byte) 109);
                if (null != var2) {
                  via.field_c[0][0] = jaa.decodeText((byte) 78, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,0,1", (byte) 118);
                if (var2 != null) {
                  via.field_c[0][1] = jaa.decodeText((byte) 83, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,0,2", (byte) 102);
                if (null != var2) {
                  via.field_c[0][2] = jaa.decodeText((byte) 88, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,0,3", (byte) 109);
                if (null != var2) {
                  via.field_c[0][3] = jaa.decodeText((byte) 81, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,1,0", (byte) 122);
                if (null != var2) {
                  via.field_c[1][0] = jaa.decodeText((byte) 117, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameoptnames,1,1", (byte) 120);
                if (null != var2) {
                  via.field_c[1][1] = jaa.decodeText((byte) 41, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,0,0", (byte) 110);
                if (null != var2) {
                  MouseWheelInput.field_a[0][0] = jaa.decodeText((byte) 68, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,0,1", (byte) 106);
                if (var2 != null) {
                  MouseWheelInput.field_a[0][1] = jaa.decodeText((byte) 58, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,0,2", (byte) 112);
                if (var2 != null) {
                  MouseWheelInput.field_a[0][2] = jaa.decodeText((byte) 66, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,0,3", (byte) 111);
                if (var2 != null) {
                  MouseWheelInput.field_a[0][3] = jaa.decodeText((byte) 46, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,1,0", (byte) 105);
                if (null != var2) {
                  MouseWheelInput.field_a[1][0] = jaa.decodeText((byte) 52, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gameopttooltips,1,1", (byte) 111);
                if (null != var2) {
                  MouseWheelInput.field_a[1][1] = jaa.decodeText((byte) 57, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,0", (byte) 117);
                if (var2 != null) {
                  SecondaryLinkQueue.worldNames[0] = jaa.decodeText((byte) 95, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,1", (byte) 124);
                if (null != var2) {
                  SecondaryLinkQueue.worldNames[1] = jaa.decodeText((byte) 50, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,2", (byte) 107);
                if (var2 != null) {
                  SecondaryLinkQueue.worldNames[2] = jaa.decodeText((byte) 87, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,3", (byte) 120);
                if (var2 != null) {
                  SecondaryLinkQueue.worldNames[3] = jaa.decodeText((byte) 59, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,4", (byte) 111);
                if (null != var2) {
                  SecondaryLinkQueue.worldNames[4] = jaa.decodeText((byte) 106, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,5", (byte) 116);
                if (null != var2) {
                  SecondaryLinkQueue.worldNames[5] = jaa.decodeText((byte) 36, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,6", (byte) 100);
                if (null != var2) {
                  SecondaryLinkQueue.worldNames[6] = jaa.decodeText((byte) 40, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,7", (byte) 125);
                if (null != var2) {
                  SecondaryLinkQueue.worldNames[7] = jaa.decodeText((byte) 80, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("tomb_names,8", (byte) 118);
                if (var2 != null) {
                  SecondaryLinkQueue.worldNames[8] = jaa.decodeText((byte) 73, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("multiplayer_lobby", (byte) 125);
                if (null != var2) {
                  ol.field_a = jaa.decodeText((byte) 58, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("options", (byte) 100);
                if (var2 != null) {
                  wc.field_d = jaa.decodeText((byte) 126, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("enter_tomb", (byte) 108);
                if (null != var2) {
                  MiscItemBehaviour.field_t = jaa.decodeText((byte) 91, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("bonus", (byte) 102);
                if (var2 != null) {
                  bd.field_j = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("no_medal", (byte) 116);
                if (null != var2) {
                  SpriteTileOperator.field_v = jaa.decodeText((byte) 96, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("gold_medal", (byte) 101);
                if (null != var2) {
                  uaa.field_d = jaa.decodeText((byte) 39, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("silver_medal", (byte) 117);
                if (null != var2) {
                  qna.field_c = jaa.decodeText((byte) 72, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("bronze_medal", (byte) 118);
                if (var2 != null) {
                  MovingPlatformComponent.field_P = jaa.decodeText((byte) 109, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("previous_member", (byte) 102);
                if (null != var2) {
                  ByteStorage.field_c = jaa.decodeText((byte) 25, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("freecontent_compelted", (byte) 125);
                if (null != var2) {
                  DivisionMazeGenerator.field_d = jaa.decodeText((byte) 119, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("justplay", (byte) 109);
                if (null != var2) {
                  tc.field_f = jaa.decodeText((byte) 54, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("adding_coins", (byte) 102);
                if (null != var2) {
                  jaa.decodeText((byte) 56, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("adding_lootbags", (byte) 112);
                if (var2 != null) {
                  jaa.decodeText((byte) 53, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("adding_idols", (byte) 125);
                if (null != var2) {
                  jaa.decodeText((byte) 125, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("points_coins", (byte) 108);
                if (var2 != null) {
                  jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("points_lootbags", (byte) 106);
                if (null != var2) {
                  jaa.decodeText((byte) 107, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("points_idols", (byte) 101);
                if (null != var2) {
                  jaa.decodeText((byte) 108, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("restart_world", (byte) 102);
                if (null != var2) {
                  WidgetStyleLayer.field_e = jaa.decodeText((byte) 52, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("spectator_controls", (byte) 111);
                if (var2 != null) {
                  WhiteLightShooterComponent.field_J = jaa.decodeText((byte) 71, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("game_end_iminent", (byte) 121);
                if (var2 != null) {
                  TextureMetadata.field_j = jaa.decodeText((byte) 105, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("phaseEnd_mybest", (byte) 104);
                if (null != var2) {
                  ItemComponent.field_F = jaa.decodeText((byte) 43, var2);
                }
                var2 = ScoringObserverFactory.readTextEntry("phaseEnd_friendsbest", (byte) 116);
                if (null != var2) {
                  PenaltyNotice.field_g = jaa.decodeText((byte) 39, var2);
                }
                CurveOperator.textArchive = null;
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
                  throw tba.wrapException((Throwable) ((Object) stackIn_1831_0), ((StringBuilder) (Object) stackIn_1831_1).append(stackIn_1832_2).append(',').append(param1).append(')').toString());
                }
                if (GameApplet.field_m) {
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
          this.a(-28562, hq.field_b[param1] << 16, LoginForm.field_z[param1] << 16);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        ModelAnimator stackIn_33_0 = null;
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
          boolean decompiledSharedTail0 = !(this.field_f.size((byte) -16) > 0);
          if (!decompiledSharedTail0) {
            if (!this.field_g) {
              this.field_c.a(this.field_d, false, 0, 1, true);
            }
            this.field_g = true;
            var2 = (wk) (this.field_f.first(-80));
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
              var2.unlink(10);
            }
            decompiledSharedTail0 = (TombRacer.field_G);
          }
          if ((decompiledSharedTail0) &&
            (this.field_g)) {
            stackIn_33_0 = this.field_c;
            stackIn_33_1 = this.field_d;
            stackIn_34_2 = !(param0);
            ((ModelAnimator) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_34_2, 0, 0, true);
            this.field_h = 0;
            this.field_g = false;
          }
          this.field_c.tick(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var2_ref), "pfa.C(" + param0 + ')');
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
          this.field_f.addLast((byte) -79, var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        try {
          field_b = (boolean[][]) null;
          field_a = null;
          field_i = null;
          if (param0 != 4) {
            pfa.loadLocalizedText((ResourceArchive) null, 68);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.A(" + param0 + ')');
        }
    }

    final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 79) {
            this.field_c = (ModelAnimator) null;
          }
          stackIn_10_0 = (~(LoginForm.field_z[param1] << 16) == ~this.field_j) && (this.field_e == hq.field_b[param1] << 16);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var3), "pfa.H(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        try {
          hp.drawModelPreview(2048, this.field_h, 1900, this.field_c.getModel((byte) 74), param1 ^ -1918096900, 10 + ((this.field_e >> 16) + param0), (this.field_j >> 16) + param2 + 18);
          if (param1 != 11327) {
            this.a(73, (byte) 91);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -98) {
            this.a((byte) -74, -14);
          }
          this.field_j = LoginForm.field_z[param0] << 16;
          this.field_e = hq.field_b[param0] << 16;
          this.field_f.clear(8);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var3), "pfa.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void popRasterState(int param0) {
        RuntimeException runtimeException = null;
        bd var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var1 = (bd) (gg.field_e.pollLast((byte) 22));
          if (param0 != 1) {
            field_a = (String) null;
          }
          if (null == var1) {
            throw new IllegalStateException();
          }
          SoftwareRasterizer.setTarget(var1.field_g, var1.field_m, var1.field_l);
          SoftwareRasterizer.setClip(var1.field_n, var1.field_k, var1.field_h, var1.field_f);
          var1.field_g = null;
          vt.field_a.addLast((byte) -67, var1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.G(" + param0 + ')');
        }
    }

    pfa(int param0, int param1) {
        try {
          this.field_d = param0;
          this.field_c = new ModelAnimator(0, this.field_d, 1);
          this.field_c.a(this.field_d, false, 0, 0, true);
          this.field_j = LoginForm.field_z[param1] << 16;
          this.field_e = hq.field_b[param1] << 16;
          this.field_g = false;
          this.field_f = new IntrusiveDeque();
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "pfa.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Prev";
        field_i = new ura();
    }
}
