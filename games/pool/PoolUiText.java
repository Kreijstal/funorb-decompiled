/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PoolUiText {
    static BitmapFont field_a;
    static UiComponent field_f;
    static volatile int field_g;
    static int field_d;
    static boolean field_b;
    static String[][] field_c;
    static UiComponent field_e;

    final static void applyLocalizedTexts(ResourceArchive param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1506_0;
            StringBuilder stackIn_1506_1;
            String stackIn_1507_2;
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
                this.stackIn_1506_0 = null;
                this.stackIn_1506_1 = null;
                this.stackIn_1507_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                MidiNoteMixer.field_u = param0;
                var2 = LocalGameSetupScreen.loadMenuResource("text_game_name", (byte) 29);
                if (null != var2) {
                  ReportAbuseDialog.textGameName = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("text_benefits,0", (byte) 117);
                if (null != var2) {
                  DialRenderer.textBenefits[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("text_benefits,1", (byte) 127);
                if (null != var2) {
                  DialRenderer.textBenefits[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -30);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("text_benefits,2", (byte) 57);
                if (null != var2) {
                  DialRenderer.textBenefits[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,0", (byte) 27);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,1", (byte) 70);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,2", (byte) 37);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,3", (byte) 41);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,4", (byte) 54);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,5", (byte) 88);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,6", (byte) 87);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,7", (byte) 99);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,8", (byte) 127);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,9", (byte) 47);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,10", (byte) 87);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[10] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,11", (byte) 46);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[11] = Cp1252DecodingSupport.decodeBytesToString(var2, -11);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,12", (byte) 49);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[12] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,13", (byte) 70);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[13] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,14", (byte) 72);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[14] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,15", (byte) 73);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[15] = Cp1252DecodingSupport.decodeBytesToString(var2, -45);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,16", (byte) 18);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[16] = Cp1252DecodingSupport.decodeBytesToString(var2, -26);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,17", (byte) 39);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[17] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,18", (byte) 22);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[18] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,19", (byte) 78);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[19] = Cp1252DecodingSupport.decodeBytesToString(var2, -87);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,20", (byte) 57);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[20] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,21", (byte) 36);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[21] = Cp1252DecodingSupport.decodeBytesToString(var2, 8);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,22", (byte) 116);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[22] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,23", (byte) 32);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[23] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,24", (byte) 97);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[24] = Cp1252DecodingSupport.decodeBytesToString(var2, -55);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,25", (byte) 77);
                if (null != var2) {
                  RenderingInitializationSupport.achievementNames[25] = Cp1252DecodingSupport.decodeBytesToString(var2, -91);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_names,26", (byte) 117);
                if (var2 != null) {
                  RenderingInitializationSupport.achievementNames[26] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,0", (byte) 47);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,1", (byte) 111);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,2", (byte) 82);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 5);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,3", (byte) 127);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -42);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,4", (byte) 63);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,5", (byte) 18);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,6", (byte) 112);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,7", (byte) 69);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,8", (byte) 34);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[8] = Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,9", (byte) 35);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,10", (byte) 49);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[10] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,11", (byte) 53);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[11] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,12", (byte) 51);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[12] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,13", (byte) 90);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[13] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,14", (byte) 43);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[14] = Cp1252DecodingSupport.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,15", (byte) 89);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[15] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,16", (byte) 45);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[16] = Cp1252DecodingSupport.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,17", (byte) 29);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[17] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,18", (byte) 61);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[18] = Cp1252DecodingSupport.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,19", (byte) 76);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[19] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,20", (byte) 125);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[20] = Cp1252DecodingSupport.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,21", (byte) 103);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[21] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,22", (byte) 66);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[22] = Cp1252DecodingSupport.decodeBytesToString(var2, 7);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,23", (byte) 31);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[23] = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,24", (byte) 108);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[24] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,25", (byte) 19);
                if (null != var2) {
                  CanvasInputAttachmentSupport.achievementCriteria[25] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievement_criteria,26", (byte) 97);
                if (var2 != null) {
                  CanvasInputAttachmentSupport.achievementCriteria[26] = Cp1252DecodingSupport.decodeBytesToString(var2, -76);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameoptlabels,0", (byte) 63);
                if (var2 != null) {
                  DisplayModeSupport.gameoptlabels[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -54);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameoptlabels,1", (byte) 33);
                if (null != var2) {
                  DisplayModeSupport.gameoptlabels[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -96);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameoptlabels,2", (byte) 49);
                if (var2 != null) {
                  DisplayModeSupport.gameoptlabels[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -47);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameoptlabels,3", (byte) 105);
                if (null != var2) {
                  DisplayModeSupport.gameoptlabels[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -122);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,0", (byte) 95);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -30);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,1", (byte) 112);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,2", (byte) 50);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][2] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,3", (byte) 38);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][3] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,4", (byte) 36);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][4] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_buttonnames,0,5", (byte) 77);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][5] = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ruleset_names,0", (byte) 78);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ruleset_names,1", (byte) 92);
                if (null != var2) {
                  LobbyPlayer.rulesetNames[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ruleset_names,2", (byte) 62);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -66);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ruleset_names,3", (byte) 90);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_names,0", (byte) 41);
                if (null != var2) {
                  AwtEventQueueSupport.themeNames[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 14);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_names,1", (byte) 52);
                if (var2 != null) {
                  AwtEventQueueSupport.themeNames[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_names,2", (byte) 36);
                if (var2 != null) {
                  AwtEventQueueSupport.themeNames[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -24);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_names,3", (byte) 114);
                if (null != var2) {
                  AwtEventQueueSupport.themeNames[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_names,4", (byte) 122);
                if (null != var2) {
                  AwtEventQueueSupport.themeNames[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("theme_random", (byte) 121);
                if (null != var2) {
                  BirthDateValidator.themeRandom = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("guide_names,0", (byte) 83);
                if (var2 != null) {
                  LoginTextValue.guideNames[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -120);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("guide_names,1", (byte) 39);
                if (null != var2) {
                  LoginTextValue.guideNames[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_secs", (byte) 107);
                if (null != var2) {
                  PolarObject.timerSecs = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,0", (byte) 112);
                if (null != var2) {
                  field_c[0][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -91);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,1", (byte) 74);
                if (var2 != null) {
                  field_c[0][1] = Cp1252DecodingSupport.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,2", (byte) 83);
                if (var2 != null) {
                  field_c[0][2] = Cp1252DecodingSupport.decodeBytesToString(var2, 2);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,3", (byte) 96);
                if (null != var2) {
                  field_c[0][3] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,4", (byte) 103);
                if (var2 != null) {
                  field_c[0][4] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,0,5", (byte) 76);
                if (null != var2) {
                  field_c[0][5] = Cp1252DecodingSupport.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,1,0", (byte) 80);
                if (null != var2) {
                  field_c[1][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -69);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,1,1", (byte) 45);
                if (var2 != null) {
                  field_c[1][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,1,2", (byte) 59);
                if (null != var2) {
                  field_c[1][2] = Cp1252DecodingSupport.decodeBytesToString(var2, -98);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,0", (byte) 30);
                if (var2 != null) {
                  field_c[2][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,1", (byte) 104);
                if (var2 != null) {
                  field_c[2][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,2", (byte) 61);
                if (null != var2) {
                  field_c[2][2] = Cp1252DecodingSupport.decodeBytesToString(var2, -50);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,3", (byte) 17);
                if (var2 != null) {
                  field_c[2][3] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,4", (byte) 71);
                if (var2 != null) {
                  field_c[2][4] = Cp1252DecodingSupport.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,2,5", (byte) 87);
                if (null != var2) {
                  field_c[2][5] = Cp1252DecodingSupport.decodeBytesToString(var2, -69);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,3,0", (byte) 98);
                if (var2 != null) {
                  field_c[3][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("gameopt_tooltipnames,3,1", (byte) 74);
                if (var2 != null) {
                  field_c[3][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 13);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,0", (byte) 121);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,1", (byte) 47);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,2", (byte) 84);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,3", (byte) 62);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,4", (byte) 22);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -15);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,5", (byte) 108);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,6", (byte) 90);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -78);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,7", (byte) 28);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[7] = Cp1252DecodingSupport.decodeBytesToString(var2, -21);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,8", (byte) 97);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[8] = Cp1252DecodingSupport.decodeBytesToString(var2, -25);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,9", (byte) 115);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,10", (byte) 57);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[10] = Cp1252DecodingSupport.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,11", (byte) 28);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[11] = Cp1252DecodingSupport.decodeBytesToString(var2, -22);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,12", (byte) 53);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[12] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,13", (byte) 83);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[13] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,14", (byte) 61);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[14] = Cp1252DecodingSupport.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,15", (byte) 23);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[15] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,16", (byte) 30);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[16] = Cp1252DecodingSupport.decodeBytesToString(var2, -122);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,17", (byte) 29);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[17] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,18", (byte) 58);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[18] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,19", (byte) 50);
                if (null != var2) {
                  ChoiceButtonSupport.shotMessages[19] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,20", (byte) 123);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[20] = Cp1252DecodingSupport.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,21", (byte) 89);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[21] = Cp1252DecodingSupport.decodeBytesToString(var2, -118);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("shot_messages,22", (byte) 116);
                if (var2 != null) {
                  ChoiceButtonSupport.shotMessages[22] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("n_second_time_penalty", (byte) 92);
                if (var2 != null) {
                  RasterBuffer.nSecondTimePenalty = Cp1252DecodingSupport.decodeBytesToString(var2, -18);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,0", (byte) 75);
                if (null != var2) {
                  BallEvent.nineBallNumbers[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,1", (byte) 100);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,2", (byte) 118);
                if (null != var2) {
                  BallEvent.nineBallNumbers[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,3", (byte) 63);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,4", (byte) 118);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,5", (byte) 26);
                if (null != var2) {
                  BallEvent.nineBallNumbers[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,6", (byte) 67);
                if (null != var2) {
                  BallEvent.nineBallNumbers[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -37);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,7", (byte) 50);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,8", (byte) 118);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("nine_ball_numbers,9", (byte) 55);
                if (null != var2) {
                  BallEvent.nineBallNumbers[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,0", (byte) 68);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,1", (byte) 67);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,2", (byte) 110);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,3", (byte) 20);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,4", (byte) 101);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,5", (byte) 42);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,6", (byte) 92);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -83);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,7", (byte) 85);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 15);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,8", (byte) 37);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,9", (byte) 91);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[9] = Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,10", (byte) 70);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[10] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,11", (byte) 116);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[11] = Cp1252DecodingSupport.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,12", (byte) 79);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[12] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,13", (byte) 104);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[13] = Cp1252DecodingSupport.decodeBytesToString(var2, -33);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,14", (byte) 82);
                if (var2 != null) {
                  ReflectionCheck.eightBallNumbers[14] = Cp1252DecodingSupport.decodeBytesToString(var2, 13);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("eight_ball_numbers,15", (byte) 80);
                if (null != var2) {
                  ReflectionCheck.eightBallNumbers[15] = Cp1252DecodingSupport.decodeBytesToString(var2, -45);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_planets_group_0", (byte) 97);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_planets_group_1", (byte) 118);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_sports_group_0", (byte) 56);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_sports_group_1", (byte) 83);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -110);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_english_group_0", (byte) 40);
                if (var2 != null) {
                  MembershipBenefitsLoader.ballsetEnglishGroup0 = Cp1252DecodingSupport.decodeBytesToString(var2, -15);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_english_group_1", (byte) 69);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -84);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_plasma_group_0_nocolour", (byte) 123);
                if (null != var2) {
                  ChatMessage.ballsetPlasmaGroup0Nocolour = Cp1252DecodingSupport.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_plasma_group_1_nocolour", (byte) 113);
                if (var2 != null) {
                  FadingDialog.ballsetPlasmaGroup1Nocolour = Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_plasma_group_0", (byte) 90);
                if (var2 != null) {
                  CacheEntry.ballsetPlasmaGroup0 = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_plasma_group_1", (byte) 98);
                if (null != var2) {
                  DirectByteStorage.ballsetPlasmaGroup1 = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_usa8_group_0", (byte) 113);
                if (null != var2) {
                  EmailAvailabilityValidator.ballsetUsa8Group0 = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_usa8_group_1", (byte) 49);
                if (var2 != null) {
                  PolarTableScene.ballsetUsa8Group1 = Cp1252DecodingSupport.decodeBytesToString(var2, 6);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_torquing_group_0", (byte) 22);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_torquing_group_1", (byte) 52);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_space_group_0", (byte) 65);
                if (var2 != null) {
                  BirthDateValidator.ballsetSpaceGroup0 = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_space_group_1", (byte) 77);
                var3 = 50 % ((param1 - 58) / 42);
                if (var2 != null) {
                  TransformRotationSupport.field_g = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_jungle_group_0", (byte) 36);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_jungle_group_1", (byte) 27);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_polar_group_0", (byte) 119);
                if (null != var2) {
                  AnimatedNotification.ballsetPolarGroup0 = Cp1252DecodingSupport.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ballset_polar_group_1", (byte) 64);
                if (null != var2) {
                  WhirlpoolHasher.ballsetPolarGroup1 = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("target_open_table", (byte) 40);
                if (null != var2) {
                  DualLinkNode.targetOpenTable = Cp1252DecodingSupport.decodeBytesToString(var2, -4);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("target_black_ball", (byte) 97);
                if (var2 != null) {
                  CipherPacketBuffer.targetBlackBall = Cp1252DecodingSupport.decodeBytesToString(var2, -127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_player", (byte) 108);
                if (var2 != null) {
                  ContextMenu.youPlayer = Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("computer_player", (byte) 82);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,0", (byte) 126);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,1", (byte) 45);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 6);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,2", (byte) 69);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[2] = Cp1252DecodingSupport.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,3", (byte) 21);
                if (null != var2) {
                  PauseMenuScreen.playerNs[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,4", (byte) 104);
                if (null != var2) {
                  PauseMenuScreen.playerNs[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,5", (byte) 104);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,6", (byte) 40);
                if (null != var2) {
                  PauseMenuScreen.playerNs[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_ns,7", (byte) 57);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,0", (byte) 65);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,1", (byte) 21);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,2", (byte) 50);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,3", (byte) 79);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[3] = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,4", (byte) 79);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,5", (byte) 97);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,6", (byte) 60);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,7", (byte) 127);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,8", (byte) 124);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_titles,9", (byte) 64);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[9] = Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,0", (byte) 63);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,1", (byte) 73);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,2", (byte) 120);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,3", (byte) 56);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,4", (byte) 69);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[4] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,5", (byte) 121);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[5] = Cp1252DecodingSupport.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,6", (byte) 64);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[6] = Cp1252DecodingSupport.decodeBytesToString(var2, -63);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,7", (byte) 30);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,8", (byte) 102);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[8] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("instructions_pages,9", (byte) 42);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[9] = Cp1252DecodingSupport.decodeBytesToString(var2, -18);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,0,0", (byte) 77);
                if (null != var2) {
                  Pocket.field_e[0][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -16);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,1,0", (byte) 100);
                if (null != var2) {
                  Pocket.field_e[1][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,2,0", (byte) 43);
                if (null != var2) {
                  Pocket.field_e[2][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -51);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,2,1", (byte) 76);
                if (var2 != null) {
                  Pocket.field_e[2][1] = Cp1252DecodingSupport.decodeBytesToString(var2, -107);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,3,0", (byte) 95);
                if (null != var2) {
                  Pocket.field_e[3][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -121);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,3,1", (byte) 44);
                if (var2 != null) {
                  Pocket.field_e[3][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,3,2", (byte) 27);
                if (var2 != null) {
                  Pocket.field_e[3][2] = Cp1252DecodingSupport.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,4,0", (byte) 84);
                if (null != var2) {
                  Pocket.field_e[4][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,4,1", (byte) 73);
                if (var2 != null) {
                  Pocket.field_e[4][1] = Cp1252DecodingSupport.decodeBytesToString(var2, -32);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,5,0", (byte) 59);
                if (var2 != null) {
                  Pocket.field_e[5][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,5,1", (byte) 121);
                if (null != var2) {
                  Pocket.field_e[5][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,6,0", (byte) 115);
                if (var2 != null) {
                  Pocket.field_e[6][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,6,1", (byte) 112);
                if (null != var2) {
                  Pocket.field_e[6][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,6,2", (byte) 123);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  Pocket.field_e[6][2] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,7,0", (byte) 74);
                if (var2 != null) {
                  Pocket.field_e[7][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,7,1", (byte) 67);
                if (null != var2) {
                  Pocket.field_e[7][1] = Cp1252DecodingSupport.decodeBytesToString(var2, -16);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,8,0", (byte) 102);
                if (null != var2) {
                  Pocket.field_e[8][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,8,1", (byte) 99);
                if (var2 != null) {
                  Pocket.field_e[8][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,9,0", (byte) 100);
                if (null != var2) {
                  Pocket.field_e[9][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,9,1", (byte) 99);
                if (var2 != null) {
                  Pocket.field_e[9][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 8);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,10,0", (byte) 18);
                if (var2 != null) {
                  Pocket.field_e[10][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,10,1", (byte) 79);
                if (null != var2) {
                  Pocket.field_e[10][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,11,0", (byte) 91);
                if (var2 != null) {
                  Pocket.field_e[11][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -8);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,12,0", (byte) 82);
                if (var2 != null) {
                  Pocket.field_e[12][0] = Cp1252DecodingSupport.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,12,1", (byte) 119);
                if (null != var2) {
                  Pocket.field_e[12][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,13,0", (byte) 50);
                if (null != var2) {
                  Pocket.field_e[13][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,13,1", (byte) 34);
                if (var2 != null) {
                  Pocket.field_e[13][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,13,2", (byte) 47);
                if (var2 != null) {
                  Pocket.field_e[13][2] = Cp1252DecodingSupport.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,13,3", (byte) 63);
                if (null != var2) {
                  Pocket.field_e[13][3] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,14,0", (byte) 71);
                if (var2 != null) {
                  Pocket.field_e[14][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,14,1", (byte) 91);
                if (var2 != null) {
                  Pocket.field_e[14][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,15,0", (byte) 25);
                if (null != var2) {
                  Pocket.field_e[15][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,15,1", (byte) 45);
                if (var2 != null) {
                  Pocket.field_e[15][1] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,16,0", (byte) 91);
                if (null != var2) {
                  Pocket.field_e[16][0] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_terms_conjugations,16,1", (byte) 106);
                if (null != var2) {
                  Pocket.field_e[16][1] = Cp1252DecodingSupport.decodeBytesToString(var2, -57);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,0", (byte) 61);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -72);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,1", (byte) 58);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,2", (byte) 119);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,3", (byte) 41);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,4", (byte) 93);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[4] = Cp1252DecodingSupport.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,5", (byte) 43);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[5] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,6", (byte) 116);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[6] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,7", (byte) 38);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[7] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,8", (byte) 101);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[8] = Cp1252DecodingSupport.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,9", (byte) 112);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[9] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,10", (byte) 66);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[10] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,11", (byte) 119);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[11] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,12", (byte) 97);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[12] = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,13", (byte) 67);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[13] = Cp1252DecodingSupport.decodeBytesToString(var2, -100);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,14", (byte) 22);
                if (null != var2) {
                  QuickChatDynamicCommand.definitionDefinitions[14] = Cp1252DecodingSupport.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,15", (byte) 40);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[15] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("definition_definitions,16", (byte) 27);
                if (var2 != null) {
                  QuickChatDynamicCommand.definitionDefinitions[16] = Cp1252DecodingSupport.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_option_basics", (byte) 20);
                if (null != var2) {
                  TextInputWidget.tutorialOptionBasics = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_option_eight_ball", (byte) 58);
                if (null != var2) {
                  StrongCacheEntry.tutorialOptionEightBall = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_option_nine_ball", (byte) 100);
                if (null != var2) {
                  WidgetStyleLayer.tutorialOptionNineBall = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_title_basics", (byte) 103);
                if (var2 != null) {
                  BirthDatePromptPanel.tutorialTitleBasics = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_title_eight_ball", (byte) 113);
                if (var2 != null) {
                  AccountMenuText.tutorialTitleEightBall = Cp1252DecodingSupport.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_title_nine_ball", (byte) 39);
                if (var2 != null) {
                  NetworkGameClient.tutorialTitleNineBall = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_hide", (byte) 57);
                if (null != var2) {
                  ModelOriginSupport.tutorialHide = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_show", (byte) 67);
                if (null != var2) {
                  LoginMethod.tutorialShow = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_prev", (byte) 41);
                if (null != var2) {
                  BrowserUrlSupport.tutorialPrev = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_next", (byte) 127);
                if (var2 != null) {
                  NameEntryPopup.tutorialNext = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_back", (byte) 77);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -46);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_camera_rotate", (byte) 97);
                if (var2 != null) {
                  QuickChatHelpDialog.tutorialCameraRotate = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_camera_zoom", (byte) 80);
                if (null != var2) {
                  ResizableDialog.tutorialCameraZoom = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_camera_recentre", (byte) 20);
                if (null != var2) {
                  BrowserCookieSupport.tutorialCameraRecentre = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_shot_mode_enter", (byte) 29);
                if (var2 != null) {
                  ArchiveBootstrapSupport.tutorialShotModeEnter = Cp1252DecodingSupport.decodeBytesToString(var2, -41);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_shot_mode_take", (byte) 19);
                if (null != var2) {
                  AchievementsScreen.tutorialShotModeTake = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_shot_mode_rotate", (byte) 94);
                if (null != var2) {
                  QuaternionRotationSupport.tutorialShotModeRotate = Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_shot_mode_power", (byte) 76);
                if (var2 != null) {
                  IntegerSyntaxSupport.tutorialShotModePower = Cp1252DecodingSupport.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_shot_mode_leave", (byte) 86);
                if (var2 != null) {
                  TextInputPainter.tutorialShotModeLeave = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_basic_complete", (byte) 115);
                if (null != var2) {
                  TextLineLayout.tutorialBasicComplete = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_start_place_cueball", (byte) 26);
                if (null != var2) {
                  MessageDialog.tutorialEightBallStartPlaceCueball = Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_break", (byte) 66);
                if (null != var2) {
                  LogoFinalFrameLoader.tutorialEightBallBreak = Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_afterbreak", (byte) 120);
                if (var2 != null) {
                  RankingsRequest.tutorialEightBallAfterbreak = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_afterfirstpot", (byte) 60);
                if (var2 != null) {
                  RankingsBufferSupport.tutorialEightBallAfterfirstpot = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_aftergrouppot", (byte) 68);
                if (null != var2) {
                  ChatMessageLine.tutorialEightBallAftergrouppot = Cp1252DecodingSupport.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_eight_ball_complete", (byte) 81);
                if (null != var2) {
                  MusicPatch.tutorialEightBallComplete = Cp1252DecodingSupport.decodeBytesToString(var2, -98);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("potting_ball_for_you", (byte) 41);
                if (var2 != null) {
                  ModelTableScene.pottingBallForYou = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("potting_the_rest_of_your_group", (byte) 75);
                if (var2 != null) {
                  CueAim.pottingTheRestOfYourGroup = Cp1252DecodingSupport.decodeBytesToString(var2, -61);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_start_place_cueball", (byte) 55);
                if (null != var2) {
                  TextPairLoginPayload.tutorialNineBallStartPlaceCueball = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_break", (byte) 123);
                if (var2 != null) {
                  SoundCache.tutorialNineBallBreak = Cp1252DecodingSupport.decodeBytesToString(var2, -1);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_afterbreak", (byte) 28);
                if (null != var2) {
                  DateInputWidget.tutorialNineBallAfterbreak = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_potting_a_ball", (byte) 74);
                if (var2 != null) {
                  VertexProjectionSupport.tutorialNineBallPottingABall = Cp1252DecodingSupport.decodeBytesToString(var2, -83);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_potting_nine", (byte) 77);
                if (null != var2) {
                  LoginForm.tutorialNineBallPottingNine = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_nine_ball_final", (byte) 35);
                if (null != var2) {
                  AccountTextSupport.tutorialNineBallFinal = Cp1252DecodingSupport.decodeBytesToString(var2, 12);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_enter_shot_mode", (byte) 39);
                if (null != var2) {
                  VertexNormal.tickerHintEnterShotMode = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_leave_shot_mode", (byte) 76);
                if (var2 != null) {
                  PoolMatchController.tickerHintLeaveShotMode = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_move_cueball", (byte) 76);
                if (null != var2) {
                  CachedArchiveSource.tickerHintMoveCueball = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_set_power", (byte) 87);
                if (null != var2) {
                  FullscreenErrorDialog.tickerHintSetPower = Cp1252DecodingSupport.decodeBytesToString(var2, -110);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_zoom", (byte) 27);
                if (var2 != null) {
                  PasswordInputPainter.tickerHintZoom = Cp1252DecodingSupport.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_shot_mode_aim", (byte) 105);
                if (var2 != null) {
                  HighscoresScreen.tickerHintShotModeAim = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_aim", (byte) 39);
                if (var2 != null) {
                  CollisionContact.tickerHintAim = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_rotate", (byte) 48);
                if (null != var2) {
                  SceneNodeEntry.tickerHintRotate = Cp1252DecodingSupport.decodeBytesToString(var2, 0);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ticker_hint_shoot", (byte) 73);
                if (var2 != null) {
                  QuickChatCategoryDefinition.tickerHintShoot = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_restart_game", (byte) 33);
                if (null != var2) {
                  DiskArchiveRequest.menuRestartGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_rematch_game", (byte) 103);
                if (var2 != null) {
                  CachedArchiveSource.menuRematchGame = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_settings", (byte) 19);
                if (null != var2) {
                  IntrusiveDeque.menuSettings = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("foul_exclamation", (byte) 107);
                if (null != var2) {
                  AchievementNotice.foulExclamation = Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_name_another_shot", (byte) 66);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -58);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_name_two_shots", (byte) 59);
                if (var2 != null) {
                  ArchiveRequest.playerNameTwoShots = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_name_ball_in_hand", (byte) 44);
                if (null != var2) {
                  AlignedIconLabel.playerNameBallInHand = Cp1252DecodingSupport.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_name_you_have_an_extra_shot", (byte) 42);
                if (var2 != null) {
                  TimeTrialRules.playerNameYouHaveAnExtraShot = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("status_versus", (byte) 55);
                if (var2 != null) {
                  LookupRetrySupport.statusVersus = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("status_out_of_lives", (byte) 82);
                if (null != var2) {
                  DualLinkNode.statusOutOfLives = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("status_resigned", (byte) 78);
                if (var2 != null) {
                  LabeledChildWidget.statusResigned = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("status_wants_to_draw", (byte) 79);
                if (var2 != null) {
                  OpacityWidget.statusWantsToDraw = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("status_wants_a_rematch", (byte) 30);
                if (var2 != null) {
                  PacketBuffer.statusWantsARematch = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_first", (byte) 33);
                if (var2 != null) {
                  QuaternionRotationSupport.playerListFirst = Cp1252DecodingSupport.decodeBytesToString(var2, -115);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_middle", (byte) 33);
                if (var2 != null) {
                  FontPaletteSupport.playerListMiddle = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_last", (byte) 43);
                if (var2 != null) {
                  DialogLayer.playerListLast = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_are_group_name", (byte) 31);
                if (null != var2) {
                  KillerRules.youAreGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_is_group_name", (byte) 87);
                if (var2 != null) {
                  Under13NoticePanel.playerIsGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, -39);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_are_group_name", (byte) 32);
                if (var2 != null) {
                  ScrollPane.playerX2AreGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_are_group_name", (byte) 66);
                if (null != var2) {
                  GrowableIntListFactory.playerListAreGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_are_group_name", (byte) 116);
                if (null != var2) {
                  MessageDialog.playerYouX2AreGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_are_group_name", (byte) 75);
                if (var2 != null) {
                  AnimatedNotification.playerYouFirstListAreGroupName = Cp1252DecodingSupport.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_have_won", (byte) 78);
                if (null != var2) {
                  FullscreenErrorDialog.playerX2HaveWon = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_have_won", (byte) 61);
                if (var2 != null) {
                  PaletteFontLoader.playerListHaveWon = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_have_won", (byte) 97);
                if (null != var2) {
                  AccountCreationForm.playerYouX2HaveWon = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_have_won", (byte) 88);
                if (var2 != null) {
                  QuickChatNavigationSupport.playerYouFirstListHaveWon = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_is_offering_rematch", (byte) 33);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -79);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_are_offering_rematch", (byte) 73);
                if (var2 != null) {
                  SupportPageLauncher.playerX2AreOfferingRematch = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_are_offering_rematch", (byte) 95);
                if (var2 != null) {
                  QuickChatCategoryCache.playerListAreOfferingRematch = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_are_offering_rematch", (byte) 126);
                if (null != var2) {
                  Ball.playerYouX2AreOfferingRematch = Cp1252DecodingSupport.decodeBytesToString(var2, -50);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_are_offering_rematch", (byte) 68);
                if (null != var2) {
                  UiComponentNode.playerYouFirstListAreOfferingRematch = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_is_offering_draw", (byte) 93);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -111);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_are_offering_draw", (byte) 52);
                if (null != var2) {
                  DualLinkNode.playerX2AreOfferingDraw = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_are_offering_draw", (byte) 83);
                if (var2 != null) {
                  StrongCacheEntry.playerListAreOfferingDraw = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_are_offering_draw", (byte) 108);
                if (var2 != null) {
                  QuickChatMenu.playerYouX2AreOfferingDraw = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_are_offering_draw", (byte) 107);
                if (var2 != null) {
                  CueStick.playerYouFirstListAreOfferingDraw = Cp1252DecodingSupport.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_are_out", (byte) 70);
                if (null != var2) {
                  TextLineLayout.playerYouAreOut = Cp1252DecodingSupport.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_is_out", (byte) 28);
                if (var2 != null) {
                  ShotRecord.playerIsOut = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_are_out", (byte) 108);
                if (null != var2) {
                  LobbyPlayerLookupSupport.playerX2AreOut = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_are_out", (byte) 105);
                if (null != var2) {
                  SpriteSheetLoadSupport.playerListAreOut = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_are_out", (byte) 95);
                if (var2 != null) {
                  TextInputWidget.playerYouX2AreOut = Cp1252DecodingSupport.decodeBytesToString(var2, -96);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_are_out", (byte) 29);
                if (var2 != null) {
                  HuffmanCodec.playerYouFirstListAreOut = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_has_resigned", (byte) 55);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -87);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x2_have_resigned", (byte) 28);
                if (null != var2) {
                  GrowableIntListFactory.playerX2HaveResigned = Cp1252DecodingSupport.decodeBytesToString(var2, -52);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_have_resigned", (byte) 67);
                if (null != var2) {
                  Pocket.playerListHaveResigned = Cp1252DecodingSupport.decodeBytesToString(var2, -49);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_x2_have_resigned", (byte) 84);
                if (null != var2) {
                  WireframeQuad.playerYouX2HaveResigned = Cp1252DecodingSupport.decodeBytesToString(var2, 14);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_you_first_list_have_resigned", (byte) 51);
                if (null != var2) {
                  DraggableWidget.playerYouFirstListHaveResigned = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_vs_player", (byte) 121);
                if (var2 != null) {
                  GrowableIntListFactory.playerVsPlayer = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_list_vs_player_list", (byte) 84);
                if (null != var2) {
                  AlternateLongAndTextLoginPayload.playerListVsPlayerList = Cp1252DecodingSupport.decodeBytesToString(var2, 11);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_break_try_again", (byte) 115);
                if (var2 != null) {
                  BallDebugOverlay.tutorialBreakTryAgain = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_lose", (byte) 92);
                if (null != var2) {
                  AccountProtocolStage.tutorialLose = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_lose_eight_ball_game", (byte) 90);
                if (var2 != null) {
                  QuickChatMenuSupport.tutorialLoseEightBallGame = Cp1252DecodingSupport.decodeBytesToString(var2, -80);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tutorial_lose_nine_ball_game", (byte) 82);
                if (var2 != null) {
                  PotEvent.tutorialLoseNineBallGame = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("cannot_position_cue_there", (byte) 52);
                if (null != var2) {
                  RasterSnapshot.cannotPositionCueThere = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("cue_cant_go_there", (byte) 82);
                if (null != var2) {
                  Atan2Support.cueCantGoThere = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x_gained_a_life", (byte) 100);
                if (null != var2) {
                  ArchiveIndex.playerXGainedALife = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x_lost_a_life", (byte) 124);
                if (var2 != null) {
                  CueStick.playerXLostALife = Cp1252DecodingSupport.decodeBytesToString(var2, -55);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x_lost_two_lives", (byte) 49);
                if (var2 != null) {
                  GzipDecoder.playerXLostTwoLives = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_gained_a_life", (byte) 101);
                if (var2 != null) {
                  HighScoreSubmission.youGainedALife = Cp1252DecodingSupport.decodeBytesToString(var2, -24);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_lost_a_life", (byte) 71);
                if (var2 != null) {
                  UiComponentNode.youLostALife = Cp1252DecodingSupport.decodeBytesToString(var2, 1);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_lost_two_lives", (byte) 85);
                if (var2 != null) {
                  CueStick.youLostTwoLives = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x_now_has_n_lives", (byte) 68);
                if (null != var2) {
                  TikiTableScene.playerXNowHasNLives = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_x_is_on_their_last_life", (byte) 67);
                if (var2 != null) {
                  PlayerContextMenu.playerXIsOnTheirLastLife = Cp1252DecodingSupport.decodeBytesToString(var2, -60);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_now_have_n_lives", (byte) 30);
                if (var2 != null) {
                  NanoTickClock.youNowHaveNLives = Cp1252DecodingSupport.decodeBytesToString(var2, -47);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_are_on_your_last_life", (byte) 34);
                if (null != var2) {
                  MirroredSceneSupport.youAreOnYourLastLife = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("doubleplusgood_shot,0", (byte) 95);
                if (var2 != null) {
                  DualLinkDeque.doubleplusgoodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -37);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("doubleplusgood_shot,1", (byte) 61);
                if (var2 != null) {
                  DualLinkDeque.doubleplusgoodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusgood_shot,0", (byte) 103);
                if (null != var2) {
                  Ball.plusgoodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusgood_shot,1", (byte) 53);
                if (null != var2) {
                  Ball.plusgoodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusgood_shot,2", (byte) 43);
                if (null != var2) {
                  Ball.plusgoodShot[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusgood_shot,3", (byte) 25);
                if (var2 != null) {
                  Ball.plusgoodShot[3] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("good_shot,0", (byte) 114);
                if (null != var2) {
                  LimitedRandomAccessFile.goodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("good_shot,1", (byte) 61);
                if (var2 != null) {
                  LimitedRandomAccessFile.goodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("good_shot,2", (byte) 45);
                if (null != var2) {
                  LimitedRandomAccessFile.goodShot[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ungood_shot,0", (byte) 58);
                if (var2 != null) {
                  QuickChatMenu.ungoodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ungood_shot,1", (byte) 109);
                if (var2 != null) {
                  QuickChatMenu.ungoodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("ungood_shot,2", (byte) 53);
                if (null != var2) {
                  QuickChatMenu.ungoodShot[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusungood_shot,0", (byte) 79);
                if (var2 != null) {
                  CanvasInputSupport.plusungoodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusungood_shot,1", (byte) 40);
                if (var2 != null) {
                  CanvasInputSupport.plusungoodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -68);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("plusungood_shot,2", (byte) 58);
                if (null != var2) {
                  CanvasInputSupport.plusungoodShot[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("doubleplusungood_shot,0", (byte) 49);
                if (null != var2) {
                  TikiBallSkin.doubleplusungoodShot[0] = Cp1252DecodingSupport.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("doubleplusungood_shot,1", (byte) 61);
                if (var2 != null) {
                  TikiBallSkin.doubleplusungoodShot[1] = Cp1252DecodingSupport.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("doubleplusungood_shot,2", (byte) 75);
                if (null != var2) {
                  TikiBallSkin.doubleplusungoodShot[2] = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("you_potted_balls_from_each_group", (byte) 49);
                if (null != var2) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("which_group_do_you_want", (byte) 77);
                if (var2 != null) {
                  AgeValidator.whichGroupDoYouWant = Cp1252DecodingSupport.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("would_you_like_to_play_or_pass", (byte) 126);
                if (null != var2) {
                  LoginMethod.wouldYouLikeToPlayOrPass = Cp1252DecodingSupport.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("decision_button_play", (byte) 71);
                if (null != var2) {
                  ImageProducerRasterBuffer.decisionButtonPlay = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("decision_button_pass", (byte) 59);
                if (null != var2) {
                  MonotonicClock.decisionButtonPass = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tooltip_ball_in_hand", (byte) 97);
                if (var2 != null) {
                  QuickChatNavigationSupport.tooltipBallInHand = Cp1252DecodingSupport.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tooltip_break", (byte) 106);
                if (var2 != null) {
                  FixedAngleSupport.tooltipBreak = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tooltip_extra_visit", (byte) 104);
                if (null != var2) {
                  ProgressDialog.tooltipExtraVisit = Cp1252DecodingSupport.decodeBytesToString(var2, -1);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("tooltip_snookered", (byte) 73);
                if (var2 != null) {
                  AccountStateQuery.tooltipSnookered = Cp1252DecodingSupport.decodeBytesToString(var2, -32);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("chat_button", (byte) 85);
                if (null != var2) {
                  UsernameAvailabilityValidator.chatButton = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("end_of_game_press_escape_to_continue", (byte) 48);
                if (var2 != null) {
                  IntLookupQuery.endOfGamePressEscapeToContinue = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("press_escape_for_options_menu", (byte) 19);
                if (var2 != null) {
                  LoginTextValue.pressEscapeForOptionsMenu = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("time_trial", (byte) 19);
                if (null != var2) {
                  TableScene.timeTrial = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer", (byte) 119);
                if (null != var2) {
                  CushionSegment.timer = Cp1252DecodingSupport.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("highscore_header_time", (byte) 114);
                if (var2 != null) {
                  Cp1252CharacterSupport.highscoreHeaderTime = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_colon", (byte) 92);
                if (null != var2) {
                  PlasmaBallSkin.playerColon = Cp1252DecodingSupport.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("player_colon_fr", (byte) 122);
                if (null != var2) {
                  AccountTextSupport.playerColonFr = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("time_trial_completed", (byte) 72);
                if (null != var2) {
                  FontPaletteSupport.timeTrialCompleted = Cp1252DecodingSupport.decodeBytesToString(var2, -92);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("time_trial_failed", (byte) 62);
                if (var2 != null) {
                  MouseHandler.timeTrialFailed = Cp1252DecodingSupport.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_seconds", (byte) 64);
                if (var2 != null) {
                  Cp1252DecodingSupport.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_seconds_fractions", (byte) 70);
                if (var2 != null) {
                  UsernameSuggestionsPanel.timerSecondsFractions = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_minutes_seconds", (byte) 39);
                if (null != var2) {
                  DialogLayer.timerMinutesSeconds = Cp1252DecodingSupport.decodeBytesToString(var2, -56);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_minutes_seconds_fractions", (byte) 23);
                if (var2 != null) {
                  ShotRecord.timerMinutesSecondsFractions = Cp1252DecodingSupport.decodeBytesToString(var2, -17);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_hours_minutes_seconds", (byte) 28);
                if (var2 != null) {
                  CueStick.timerHoursMinutesSeconds = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("timer_hours_minutes_seconds_fractions", (byte) 76);
                if (null != var2) {
                  PolarTableScene.timerHoursMinutesSecondsFractions = Cp1252DecodingSupport.decodeBytesToString(var2, -116);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("mouse_y_axis_normal", (byte) 48);
                if (null != var2) {
                  PoolMatchController.mouseYAxisNormal = Cp1252DecodingSupport.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("mouse_y_axis_inverted", (byte) 82);
                if (null != var2) {
                  NodeHashTableIterator.mouseYAxisInverted = Cp1252DecodingSupport.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_time_trial_with_guides", (byte) 94);
                if (null != var2) {
                  ShotRecord.menuTimeTrialWithGuides = Cp1252DecodingSupport.decodeBytesToString(var2, 2);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_time_trial_without_guides", (byte) 68);
                if (null != var2) {
                  VertexProjectionSupport.menuTimeTrialWithoutGuides = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("achievements_only_in_rated", (byte) 28);
                if (var2 != null) {
                  ArchiveAvailabilitySupport.achievementsOnlyInRated = Cp1252DecodingSupport.decodeBytesToString(var2, -38);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("progress_jungle_bulk", (byte) 58);
                if (var2 != null) {
                  CollisionContact.progressJungleBulk = Cp1252DecodingSupport.decodeBytesToString(var2, -108);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("progress_jungle_finishing", (byte) 49);
                if (var2 != null) {
                  DualLinkDequeIterator.progressJungleFinishing = Cp1252DecodingSupport.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("rated_membersonly", (byte) 84);
                if (null != var2) {
                  AccountStateQuery.ratedMembersonly = Cp1252DecodingSupport.decodeBytesToString(var2, -23);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("youhavelost", (byte) 44);
                if (null != var2) {
                  MarkerSliderPainter.youhavelost = Cp1252DecodingSupport.decodeBytesToString(var2, -92);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("pot_balls_in_any_order_finish_on_black", (byte) 89);
                if (null != var2) {
                  Pool.potBallsInAnyOrderFinishOnBlack = Cp1252DecodingSupport.decodeBytesToString(var2, -48);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_up1", (byte) 82);
                if (null != var2) {
                  AchievementProtocolSupport.keycodeDefaultUp1 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_up2", (byte) 28);
                if (var2 != null) {
                  IntLookupQuery.keycodeDefaultUp2 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_down1", (byte) 85);
                if (var2 != null) {
                  Quaternion.keycodeDefaultDown1 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_down2", (byte) 106);
                if (var2 != null) {
                  ProxySocketConnector.keycodeDefaultDown2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_left1", (byte) 17);
                if (null != var2) {
                  FontPaletteSupport.keycodeDefaultLeft1 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_left2", (byte) 113);
                if (var2 != null) {
                  ByteStorage.keycodeDefaultLeft2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_right1", (byte) 38);
                if (null != var2) {
                  RankingsBufferSupport.keycodeDefaultRight1 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.loadMenuResource("keycode_default_right2", (byte) 91);
                if (var2 != null) {
                  ResourceArchive.keycodeDefaultRight2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_option_return_to_tutorial", (byte) 126);
                if (var2 != null) {
                  MouseWheelInput.menuOptionReturnToTutorial = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.loadMenuResource("menu_option_end_tutorial", (byte) 26);
                if (null != var2) {
                  FontPaletteSupport.menuOptionEndTutorial = Cp1252DecodingSupport.decodeBytesToString(var2, 126);
                }
                MidiNoteMixer.field_u = null;
            }
            void run() {
                var4 = Pool.field_O;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1506_0 = (RuntimeException) (var2_ref);
                  stackIn_1506_1 = new StringBuilder().append("qk.A(");
                  if (param0 == null) {
                    stackIn_1507_2 = "null";
                  } else {
                    stackIn_1507_2 = "{...}";
                  }
                  throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_1506_0), ((StringBuilder) (Object) stackIn_1506_1).append(stackIn_1507_2).append(',').append(param1).append(')').toString());
                }
                if (GameApplet.field_k) {
                  var4++;
                  Pool.field_O = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    public static void releaseStatics(int param0) {
        try {
          field_a = null;
          field_c = (String[][]) null;
          field_f = null;
          field_e = null;
          int var1_int = -103 % ((param0 - 6) / 41);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qk.B(" + param0 + ')');
        }
    }

    static {
        field_c = new String[][]{new String[]{"60 seconds per shot", "45 seconds per shot", "30 seconds per shot", "20 seconds per shot", "15 seconds per shot", "10 seconds per shot"}, new String[]{"Standard pocket billiards, more commonly known as eight-ball pool.", "Nine-ball pool.", "A most dangerous game of ruthless potting."}, new String[]{"Don't want to listen to the band?", "On the other side of the screen, it all looks so easy.", "This is where Forrestall cashed in.", "Remember your pool-over.", "Houston, we have a pool ball.", "A randomly selected theme."}, new String[]{"Enable aiming assistance.", "Disable aiming assistance (for pool sharks)."}};
        field_g = 0;
    }
}
