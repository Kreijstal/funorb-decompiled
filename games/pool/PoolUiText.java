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
                var2 = LocalGameSetupScreen.a("text_game_name", (byte) 29);
                if (null != var2) {
                  ReportAbuseDialog.textGameName = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("text_benefits,0", (byte) 117);
                if (null != var2) {
                  DialRenderer.textBenefits[0] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("text_benefits,1", (byte) 127);
                if (null != var2) {
                  DialRenderer.textBenefits[1] = a.decodeBytesToString(var2, -30);
                }
                var2 = LocalGameSetupScreen.a("text_benefits,2", (byte) 57);
                if (null != var2) {
                  DialRenderer.textBenefits[2] = a.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,0", (byte) 27);
                if (null != var2) {
                  md.achievementNames[0] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,1", (byte) 70);
                if (null != var2) {
                  md.achievementNames[1] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,2", (byte) 37);
                if (var2 != null) {
                  md.achievementNames[2] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,3", (byte) 41);
                if (null != var2) {
                  md.achievementNames[3] = a.decodeBytesToString(var2, -26);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,4", (byte) 54);
                if (null != var2) {
                  md.achievementNames[4] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,5", (byte) 88);
                if (var2 != null) {
                  md.achievementNames[5] = a.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,6", (byte) 87);
                if (null != var2) {
                  md.achievementNames[6] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,7", (byte) 99);
                if (null != var2) {
                  md.achievementNames[7] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,8", (byte) 127);
                if (null != var2) {
                  md.achievementNames[8] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,9", (byte) 47);
                if (null != var2) {
                  md.achievementNames[9] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,10", (byte) 87);
                if (var2 != null) {
                  md.achievementNames[10] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,11", (byte) 46);
                if (var2 != null) {
                  md.achievementNames[11] = a.decodeBytesToString(var2, -11);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,12", (byte) 49);
                if (null != var2) {
                  md.achievementNames[12] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,13", (byte) 70);
                if (null != var2) {
                  md.achievementNames[13] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,14", (byte) 72);
                if (null != var2) {
                  md.achievementNames[14] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,15", (byte) 73);
                if (var2 != null) {
                  md.achievementNames[15] = a.decodeBytesToString(var2, -45);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,16", (byte) 18);
                if (null != var2) {
                  md.achievementNames[16] = a.decodeBytesToString(var2, -26);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,17", (byte) 39);
                if (null != var2) {
                  md.achievementNames[17] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,18", (byte) 22);
                if (var2 != null) {
                  md.achievementNames[18] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,19", (byte) 78);
                if (null != var2) {
                  md.achievementNames[19] = a.decodeBytesToString(var2, -87);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,20", (byte) 57);
                if (var2 != null) {
                  md.achievementNames[20] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,21", (byte) 36);
                if (null != var2) {
                  md.achievementNames[21] = a.decodeBytesToString(var2, 8);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,22", (byte) 116);
                if (var2 != null) {
                  md.achievementNames[22] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,23", (byte) 32);
                if (null != var2) {
                  md.achievementNames[23] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,24", (byte) 97);
                if (null != var2) {
                  md.achievementNames[24] = a.decodeBytesToString(var2, -55);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,25", (byte) 77);
                if (null != var2) {
                  md.achievementNames[25] = a.decodeBytesToString(var2, -91);
                }
                var2 = LocalGameSetupScreen.a("achievement_names,26", (byte) 117);
                if (var2 != null) {
                  md.achievementNames[26] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,0", (byte) 47);
                if (var2 != null) {
                  kc.achievementCriteria[0] = a.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,1", (byte) 111);
                if (var2 != null) {
                  kc.achievementCriteria[1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,2", (byte) 82);
                if (var2 != null) {
                  kc.achievementCriteria[2] = a.decodeBytesToString(var2, 5);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,3", (byte) 127);
                if (var2 != null) {
                  kc.achievementCriteria[3] = a.decodeBytesToString(var2, -42);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,4", (byte) 63);
                if (var2 != null) {
                  kc.achievementCriteria[4] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,5", (byte) 18);
                if (var2 != null) {
                  kc.achievementCriteria[5] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,6", (byte) 112);
                if (var2 != null) {
                  kc.achievementCriteria[6] = a.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,7", (byte) 69);
                if (null != var2) {
                  kc.achievementCriteria[7] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,8", (byte) 34);
                if (var2 != null) {
                  kc.achievementCriteria[8] = a.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,9", (byte) 35);
                if (var2 != null) {
                  kc.achievementCriteria[9] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,10", (byte) 49);
                if (var2 != null) {
                  kc.achievementCriteria[10] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,11", (byte) 53);
                if (var2 != null) {
                  kc.achievementCriteria[11] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,12", (byte) 51);
                if (null != var2) {
                  kc.achievementCriteria[12] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,13", (byte) 90);
                if (null != var2) {
                  kc.achievementCriteria[13] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,14", (byte) 43);
                if (var2 != null) {
                  kc.achievementCriteria[14] = a.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,15", (byte) 89);
                if (null != var2) {
                  kc.achievementCriteria[15] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,16", (byte) 45);
                if (var2 != null) {
                  kc.achievementCriteria[16] = a.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,17", (byte) 29);
                if (null != var2) {
                  kc.achievementCriteria[17] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,18", (byte) 61);
                if (null != var2) {
                  kc.achievementCriteria[18] = a.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,19", (byte) 76);
                if (null != var2) {
                  kc.achievementCriteria[19] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,20", (byte) 125);
                if (var2 != null) {
                  kc.achievementCriteria[20] = a.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,21", (byte) 103);
                if (null != var2) {
                  kc.achievementCriteria[21] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,22", (byte) 66);
                if (var2 != null) {
                  kc.achievementCriteria[22] = a.decodeBytesToString(var2, 7);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,23", (byte) 31);
                if (var2 != null) {
                  kc.achievementCriteria[23] = a.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,24", (byte) 108);
                if (null != var2) {
                  kc.achievementCriteria[24] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,25", (byte) 19);
                if (null != var2) {
                  kc.achievementCriteria[25] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("achievement_criteria,26", (byte) 97);
                if (var2 != null) {
                  kc.achievementCriteria[26] = a.decodeBytesToString(var2, -76);
                }
                var2 = LocalGameSetupScreen.a("gameoptlabels,0", (byte) 63);
                if (var2 != null) {
                  s.gameoptlabels[0] = a.decodeBytesToString(var2, -54);
                }
                var2 = LocalGameSetupScreen.a("gameoptlabels,1", (byte) 33);
                if (null != var2) {
                  s.gameoptlabels[1] = a.decodeBytesToString(var2, -96);
                }
                var2 = LocalGameSetupScreen.a("gameoptlabels,2", (byte) 49);
                if (var2 != null) {
                  s.gameoptlabels[2] = a.decodeBytesToString(var2, -47);
                }
                var2 = LocalGameSetupScreen.a("gameoptlabels,3", (byte) 105);
                if (null != var2) {
                  s.gameoptlabels[3] = a.decodeBytesToString(var2, -122);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,0", (byte) 95);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][0] = a.decodeBytesToString(var2, -30);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,1", (byte) 112);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,2", (byte) 50);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][2] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,3", (byte) 38);
                if (var2 != null) {
                  BitmapTextLayout.field_q[0][3] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,4", (byte) 36);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][4] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("gameopt_buttonnames,0,5", (byte) 77);
                if (null != var2) {
                  BitmapTextLayout.field_q[0][5] = a.decodeBytesToString(var2, -4);
                }
                var2 = LocalGameSetupScreen.a("ruleset_names,0", (byte) 78);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[0] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("ruleset_names,1", (byte) 92);
                if (null != var2) {
                  LobbyPlayer.rulesetNames[1] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("ruleset_names,2", (byte) 62);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[2] = a.decodeBytesToString(var2, -66);
                }
                var2 = LocalGameSetupScreen.a("ruleset_names,3", (byte) 90);
                if (var2 != null) {
                  LobbyPlayer.rulesetNames[3] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("theme_names,0", (byte) 41);
                if (null != var2) {
                  cb.themeNames[0] = a.decodeBytesToString(var2, 14);
                }
                var2 = LocalGameSetupScreen.a("theme_names,1", (byte) 52);
                if (var2 != null) {
                  cb.themeNames[1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("theme_names,2", (byte) 36);
                if (var2 != null) {
                  cb.themeNames[2] = a.decodeBytesToString(var2, -24);
                }
                var2 = LocalGameSetupScreen.a("theme_names,3", (byte) 114);
                if (null != var2) {
                  cb.themeNames[3] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("theme_names,4", (byte) 122);
                if (null != var2) {
                  cb.themeNames[4] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("theme_random", (byte) 121);
                if (null != var2) {
                  BirthDateValidator.themeRandom = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("guide_names,0", (byte) 83);
                if (var2 != null) {
                  LoginTextValue.guideNames[0] = a.decodeBytesToString(var2, -120);
                }
                var2 = LocalGameSetupScreen.a("guide_names,1", (byte) 39);
                if (null != var2) {
                  LoginTextValue.guideNames[1] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("timer_secs", (byte) 107);
                if (null != var2) {
                  PolarObject.timerSecs = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,0", (byte) 112);
                if (null != var2) {
                  field_c[0][0] = a.decodeBytesToString(var2, -91);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,1", (byte) 74);
                if (var2 != null) {
                  field_c[0][1] = a.decodeBytesToString(var2, -40);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,2", (byte) 83);
                if (var2 != null) {
                  field_c[0][2] = a.decodeBytesToString(var2, 2);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,3", (byte) 96);
                if (null != var2) {
                  field_c[0][3] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,4", (byte) 103);
                if (var2 != null) {
                  field_c[0][4] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,0,5", (byte) 76);
                if (null != var2) {
                  field_c[0][5] = a.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,1,0", (byte) 80);
                if (null != var2) {
                  field_c[1][0] = a.decodeBytesToString(var2, -69);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,1,1", (byte) 45);
                if (var2 != null) {
                  field_c[1][1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,1,2", (byte) 59);
                if (null != var2) {
                  field_c[1][2] = a.decodeBytesToString(var2, -98);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,0", (byte) 30);
                if (var2 != null) {
                  field_c[2][0] = a.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,1", (byte) 104);
                if (var2 != null) {
                  field_c[2][1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,2", (byte) 61);
                if (null != var2) {
                  field_c[2][2] = a.decodeBytesToString(var2, -50);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,3", (byte) 17);
                if (var2 != null) {
                  field_c[2][3] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,4", (byte) 71);
                if (var2 != null) {
                  field_c[2][4] = a.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,2,5", (byte) 87);
                if (null != var2) {
                  field_c[2][5] = a.decodeBytesToString(var2, -69);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,3,0", (byte) 98);
                if (var2 != null) {
                  field_c[3][0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("gameopt_tooltipnames,3,1", (byte) 74);
                if (var2 != null) {
                  field_c[3][1] = a.decodeBytesToString(var2, 13);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,0", (byte) 121);
                if (null != var2) {
                  e.shotMessages[0] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,1", (byte) 47);
                if (null != var2) {
                  e.shotMessages[1] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,2", (byte) 84);
                if (var2 != null) {
                  e.shotMessages[2] = a.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,3", (byte) 62);
                if (var2 != null) {
                  e.shotMessages[3] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,4", (byte) 22);
                if (var2 != null) {
                  e.shotMessages[4] = a.decodeBytesToString(var2, -15);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,5", (byte) 108);
                if (null != var2) {
                  e.shotMessages[5] = a.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,6", (byte) 90);
                if (null != var2) {
                  e.shotMessages[6] = a.decodeBytesToString(var2, -78);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,7", (byte) 28);
                if (var2 != null) {
                  e.shotMessages[7] = a.decodeBytesToString(var2, -21);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,8", (byte) 97);
                if (var2 != null) {
                  e.shotMessages[8] = a.decodeBytesToString(var2, -25);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,9", (byte) 115);
                if (null != var2) {
                  e.shotMessages[9] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,10", (byte) 57);
                if (var2 != null) {
                  e.shotMessages[10] = a.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,11", (byte) 28);
                if (var2 != null) {
                  e.shotMessages[11] = a.decodeBytesToString(var2, -22);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,12", (byte) 53);
                if (null != var2) {
                  e.shotMessages[12] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,13", (byte) 83);
                if (var2 != null) {
                  e.shotMessages[13] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,14", (byte) 61);
                if (null != var2) {
                  e.shotMessages[14] = a.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,15", (byte) 23);
                if (null != var2) {
                  e.shotMessages[15] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,16", (byte) 30);
                if (null != var2) {
                  e.shotMessages[16] = a.decodeBytesToString(var2, -122);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,17", (byte) 29);
                if (var2 != null) {
                  e.shotMessages[17] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,18", (byte) 58);
                if (var2 != null) {
                  e.shotMessages[18] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,19", (byte) 50);
                if (null != var2) {
                  e.shotMessages[19] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,20", (byte) 123);
                if (var2 != null) {
                  e.shotMessages[20] = a.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,21", (byte) 89);
                if (var2 != null) {
                  e.shotMessages[21] = a.decodeBytesToString(var2, -118);
                }
                var2 = LocalGameSetupScreen.a("shot_messages,22", (byte) 116);
                if (var2 != null) {
                  e.shotMessages[22] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("n_second_time_penalty", (byte) 92);
                if (var2 != null) {
                  RasterBuffer.nSecondTimePenalty = a.decodeBytesToString(var2, -18);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,0", (byte) 75);
                if (null != var2) {
                  BallEvent.nineBallNumbers[0] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,1", (byte) 100);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,2", (byte) 118);
                if (null != var2) {
                  BallEvent.nineBallNumbers[2] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,3", (byte) 63);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[3] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,4", (byte) 118);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[4] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,5", (byte) 26);
                if (null != var2) {
                  BallEvent.nineBallNumbers[5] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,6", (byte) 67);
                if (null != var2) {
                  BallEvent.nineBallNumbers[6] = a.decodeBytesToString(var2, -37);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,7", (byte) 50);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[7] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,8", (byte) 118);
                if (var2 != null) {
                  BallEvent.nineBallNumbers[8] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("nine_ball_numbers,9", (byte) 55);
                if (null != var2) {
                  BallEvent.nineBallNumbers[9] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,0", (byte) 68);
                if (null != var2) {
                  ho.eightBallNumbers[0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,1", (byte) 67);
                if (null != var2) {
                  ho.eightBallNumbers[1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,2", (byte) 110);
                if (null != var2) {
                  ho.eightBallNumbers[2] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,3", (byte) 20);
                if (var2 != null) {
                  ho.eightBallNumbers[3] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,4", (byte) 101);
                if (null != var2) {
                  ho.eightBallNumbers[4] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,5", (byte) 42);
                if (var2 != null) {
                  ho.eightBallNumbers[5] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,6", (byte) 92);
                if (var2 != null) {
                  ho.eightBallNumbers[6] = a.decodeBytesToString(var2, -83);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,7", (byte) 85);
                if (var2 != null) {
                  ho.eightBallNumbers[7] = a.decodeBytesToString(var2, 15);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,8", (byte) 37);
                if (var2 != null) {
                  ho.eightBallNumbers[8] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,9", (byte) 91);
                if (null != var2) {
                  ho.eightBallNumbers[9] = a.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,10", (byte) 70);
                if (null != var2) {
                  ho.eightBallNumbers[10] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,11", (byte) 116);
                if (null != var2) {
                  ho.eightBallNumbers[11] = a.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,12", (byte) 79);
                if (var2 != null) {
                  ho.eightBallNumbers[12] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,13", (byte) 104);
                if (var2 != null) {
                  ho.eightBallNumbers[13] = a.decodeBytesToString(var2, -33);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,14", (byte) 82);
                if (var2 != null) {
                  ho.eightBallNumbers[14] = a.decodeBytesToString(var2, 13);
                }
                var2 = LocalGameSetupScreen.a("eight_ball_numbers,15", (byte) 80);
                if (null != var2) {
                  ho.eightBallNumbers[15] = a.decodeBytesToString(var2, -45);
                }
                var2 = LocalGameSetupScreen.a("ballset_planets_group_0", (byte) 97);
                if (null != var2) {
                  a.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.a("ballset_planets_group_1", (byte) 118);
                if (var2 != null) {
                  a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("ballset_sports_group_0", (byte) 56);
                if (null != var2) {
                  a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("ballset_sports_group_1", (byte) 83);
                if (null != var2) {
                  a.decodeBytesToString(var2, -110);
                }
                var2 = LocalGameSetupScreen.a("ballset_english_group_0", (byte) 40);
                if (var2 != null) {
                  ae.ballsetEnglishGroup0 = a.decodeBytesToString(var2, -15);
                }
                var2 = LocalGameSetupScreen.a("ballset_english_group_1", (byte) 69);
                if (null != var2) {
                  a.decodeBytesToString(var2, -84);
                }
                var2 = LocalGameSetupScreen.a("ballset_plasma_group_0_nocolour", (byte) 123);
                if (null != var2) {
                  pn.ballsetPlasmaGroup0Nocolour = a.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.a("ballset_plasma_group_1_nocolour", (byte) 113);
                if (var2 != null) {
                  FadingDialog.ballsetPlasmaGroup1Nocolour = a.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.a("ballset_plasma_group_0", (byte) 90);
                if (var2 != null) {
                  CacheEntry.ballsetPlasmaGroup0 = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("ballset_plasma_group_1", (byte) 98);
                if (null != var2) {
                  DirectByteStorage.ballsetPlasmaGroup1 = a.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.a("ballset_usa8_group_0", (byte) 113);
                if (null != var2) {
                  EmailAvailabilityValidator.ballsetUsa8Group0 = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("ballset_usa8_group_1", (byte) 49);
                if (var2 != null) {
                  PolarTableScene.ballsetUsa8Group1 = a.decodeBytesToString(var2, 6);
                }
                var2 = LocalGameSetupScreen.a("ballset_torquing_group_0", (byte) 22);
                if (null != var2) {
                  a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("ballset_torquing_group_1", (byte) 52);
                if (null != var2) {
                  a.decodeBytesToString(var2, -124);
                }
                var2 = LocalGameSetupScreen.a("ballset_space_group_0", (byte) 65);
                if (var2 != null) {
                  BirthDateValidator.ballsetSpaceGroup0 = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("ballset_space_group_1", (byte) 77);
                var3 = 50 % ((param1 - 58) / 42);
                if (var2 != null) {
                  dq.field_g = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("ballset_jungle_group_0", (byte) 36);
                if (null != var2) {
                  a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("ballset_jungle_group_1", (byte) 27);
                if (var2 != null) {
                  a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("ballset_polar_group_0", (byte) 119);
                if (null != var2) {
                  ij.ballsetPolarGroup0 = a.decodeBytesToString(var2, -81);
                }
                var2 = LocalGameSetupScreen.a("ballset_polar_group_1", (byte) 64);
                if (null != var2) {
                  WhirlpoolHasher.ballsetPolarGroup1 = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("target_open_table", (byte) 40);
                if (null != var2) {
                  DualLinkNode.targetOpenTable = a.decodeBytesToString(var2, -4);
                }
                var2 = LocalGameSetupScreen.a("target_black_ball", (byte) 97);
                if (var2 != null) {
                  CipherPacketBuffer.targetBlackBall = a.decodeBytesToString(var2, -127);
                }
                var2 = LocalGameSetupScreen.a("you_player", (byte) 108);
                if (var2 != null) {
                  ContextMenu.youPlayer = a.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.a("computer_player", (byte) 82);
                if (null != var2) {
                  a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("player_ns,0", (byte) 126);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_ns,1", (byte) 45);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[1] = a.decodeBytesToString(var2, 6);
                }
                var2 = LocalGameSetupScreen.a("player_ns,2", (byte) 69);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[2] = a.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.a("player_ns,3", (byte) 21);
                if (null != var2) {
                  PauseMenuScreen.playerNs[3] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_ns,4", (byte) 104);
                if (null != var2) {
                  PauseMenuScreen.playerNs[4] = a.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.a("player_ns,5", (byte) 104);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[5] = a.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.a("player_ns,6", (byte) 40);
                if (null != var2) {
                  PauseMenuScreen.playerNs[6] = a.decodeBytesToString(var2, -60);
                }
                var2 = LocalGameSetupScreen.a("player_ns,7", (byte) 57);
                if (var2 != null) {
                  PauseMenuScreen.playerNs[7] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,0", (byte) 65);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,1", (byte) 21);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,2", (byte) 50);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[2] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,3", (byte) 79);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[3] = a.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,4", (byte) 79);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[4] = a.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,5", (byte) 97);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[5] = a.decodeBytesToString(var2, -112);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,6", (byte) 60);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[6] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,7", (byte) 127);
                if (null != var2) {
                  DiskCacheWorker.instructionsTitles[7] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,8", (byte) 124);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[8] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("instructions_titles,9", (byte) 64);
                if (var2 != null) {
                  DiskCacheWorker.instructionsTitles[9] = a.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,0", (byte) 63);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[0] = a.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,1", (byte) 73);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,2", (byte) 120);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[2] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,3", (byte) 56);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[3] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,4", (byte) 69);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[4] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,5", (byte) 121);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[5] = a.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,6", (byte) 64);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[6] = a.decodeBytesToString(var2, -63);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,7", (byte) 30);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[7] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,8", (byte) 102);
                if (var2 != null) {
                  ArchiveLoadSequence.instructionsPages[8] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("instructions_pages,9", (byte) 42);
                if (null != var2) {
                  ArchiveLoadSequence.instructionsPages[9] = a.decodeBytesToString(var2, -18);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,0,0", (byte) 77);
                if (null != var2) {
                  Pocket.field_e[0][0] = a.decodeBytesToString(var2, -16);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,1,0", (byte) 100);
                if (null != var2) {
                  Pocket.field_e[1][0] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,2,0", (byte) 43);
                if (null != var2) {
                  Pocket.field_e[2][0] = a.decodeBytesToString(var2, -51);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,2,1", (byte) 76);
                if (var2 != null) {
                  Pocket.field_e[2][1] = a.decodeBytesToString(var2, -107);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,3,0", (byte) 95);
                if (null != var2) {
                  Pocket.field_e[3][0] = a.decodeBytesToString(var2, -121);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,3,1", (byte) 44);
                if (var2 != null) {
                  Pocket.field_e[3][1] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,3,2", (byte) 27);
                if (var2 != null) {
                  Pocket.field_e[3][2] = a.decodeBytesToString(var2, -86);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,4,0", (byte) 84);
                if (null != var2) {
                  Pocket.field_e[4][0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,4,1", (byte) 73);
                if (var2 != null) {
                  Pocket.field_e[4][1] = a.decodeBytesToString(var2, -32);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,5,0", (byte) 59);
                if (var2 != null) {
                  Pocket.field_e[5][0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,5,1", (byte) 121);
                if (null != var2) {
                  Pocket.field_e[5][1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,6,0", (byte) 115);
                if (var2 != null) {
                  Pocket.field_e[6][0] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,6,1", (byte) 112);
                if (null != var2) {
                  Pocket.field_e[6][1] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,6,2", (byte) 123);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  Pocket.field_e[6][2] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,7,0", (byte) 74);
                if (var2 != null) {
                  Pocket.field_e[7][0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,7,1", (byte) 67);
                if (null != var2) {
                  Pocket.field_e[7][1] = a.decodeBytesToString(var2, -16);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,8,0", (byte) 102);
                if (null != var2) {
                  Pocket.field_e[8][0] = a.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,8,1", (byte) 99);
                if (var2 != null) {
                  Pocket.field_e[8][1] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,9,0", (byte) 100);
                if (null != var2) {
                  Pocket.field_e[9][0] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,9,1", (byte) 99);
                if (var2 != null) {
                  Pocket.field_e[9][1] = a.decodeBytesToString(var2, 8);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,10,0", (byte) 18);
                if (var2 != null) {
                  Pocket.field_e[10][0] = a.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,10,1", (byte) 79);
                if (null != var2) {
                  Pocket.field_e[10][1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,11,0", (byte) 91);
                if (var2 != null) {
                  Pocket.field_e[11][0] = a.decodeBytesToString(var2, -8);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,12,0", (byte) 82);
                if (var2 != null) {
                  Pocket.field_e[12][0] = a.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,12,1", (byte) 119);
                if (null != var2) {
                  Pocket.field_e[12][1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,13,0", (byte) 50);
                if (null != var2) {
                  Pocket.field_e[13][0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,13,1", (byte) 34);
                if (var2 != null) {
                  Pocket.field_e[13][1] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,13,2", (byte) 47);
                if (var2 != null) {
                  Pocket.field_e[13][2] = a.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,13,3", (byte) 63);
                if (null != var2) {
                  Pocket.field_e[13][3] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,14,0", (byte) 71);
                if (var2 != null) {
                  Pocket.field_e[14][0] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,14,1", (byte) 91);
                if (var2 != null) {
                  Pocket.field_e[14][1] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,15,0", (byte) 25);
                if (null != var2) {
                  Pocket.field_e[15][0] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,15,1", (byte) 45);
                if (var2 != null) {
                  Pocket.field_e[15][1] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,16,0", (byte) 91);
                if (null != var2) {
                  Pocket.field_e[16][0] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("definition_terms_conjugations,16,1", (byte) 106);
                if (null != var2) {
                  Pocket.field_e[16][1] = a.decodeBytesToString(var2, -57);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,0", (byte) 61);
                if (null != var2) {
                  hj.definitionDefinitions[0] = a.decodeBytesToString(var2, -72);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,1", (byte) 58);
                if (null != var2) {
                  hj.definitionDefinitions[1] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,2", (byte) 119);
                if (var2 != null) {
                  hj.definitionDefinitions[2] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,3", (byte) 41);
                if (var2 != null) {
                  hj.definitionDefinitions[3] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,4", (byte) 93);
                if (var2 != null) {
                  hj.definitionDefinitions[4] = a.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,5", (byte) 43);
                if (null != var2) {
                  hj.definitionDefinitions[5] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,6", (byte) 116);
                if (null != var2) {
                  hj.definitionDefinitions[6] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,7", (byte) 38);
                if (var2 != null) {
                  hj.definitionDefinitions[7] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,8", (byte) 101);
                if (var2 != null) {
                  hj.definitionDefinitions[8] = a.decodeBytesToString(var2, -67);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,9", (byte) 112);
                if (var2 != null) {
                  hj.definitionDefinitions[9] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,10", (byte) 66);
                if (var2 != null) {
                  hj.definitionDefinitions[10] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,11", (byte) 119);
                if (var2 != null) {
                  hj.definitionDefinitions[11] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,12", (byte) 97);
                if (null != var2) {
                  hj.definitionDefinitions[12] = a.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,13", (byte) 67);
                if (var2 != null) {
                  hj.definitionDefinitions[13] = a.decodeBytesToString(var2, -100);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,14", (byte) 22);
                if (null != var2) {
                  hj.definitionDefinitions[14] = a.decodeBytesToString(var2, -71);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,15", (byte) 40);
                if (var2 != null) {
                  hj.definitionDefinitions[15] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("definition_definitions,16", (byte) 27);
                if (var2 != null) {
                  hj.definitionDefinitions[16] = a.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.a("tutorial_option_basics", (byte) 20);
                if (null != var2) {
                  TextInputWidget.tutorialOptionBasics = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("tutorial_option_eight_ball", (byte) 58);
                if (null != var2) {
                  StrongCacheEntry.tutorialOptionEightBall = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_option_nine_ball", (byte) 100);
                if (null != var2) {
                  WidgetStyleLayer.tutorialOptionNineBall = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("tutorial_title_basics", (byte) 103);
                if (var2 != null) {
                  jj.tutorialTitleBasics = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_title_eight_ball", (byte) 113);
                if (var2 != null) {
                  fc.tutorialTitleEightBall = a.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.a("tutorial_title_nine_ball", (byte) 39);
                if (var2 != null) {
                  NetworkGameClient.tutorialTitleNineBall = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("tutorial_hide", (byte) 57);
                if (null != var2) {
                  ln.tutorialHide = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_show", (byte) 67);
                if (null != var2) {
                  ml.tutorialShow = a.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.a("tutorial_prev", (byte) 41);
                if (null != var2) {
                  ll.tutorialPrev = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_next", (byte) 127);
                if (var2 != null) {
                  NameEntryPopup.tutorialNext = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_back", (byte) 77);
                if (var2 != null) {
                  a.decodeBytesToString(var2, -46);
                }
                var2 = LocalGameSetupScreen.a("tutorial_camera_rotate", (byte) 97);
                if (var2 != null) {
                  QuickChatHelpDialog.tutorialCameraRotate = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_camera_zoom", (byte) 80);
                if (null != var2) {
                  ResizableDialog.tutorialCameraZoom = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_camera_recentre", (byte) 20);
                if (null != var2) {
                  ie.tutorialCameraRecentre = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_shot_mode_enter", (byte) 29);
                if (var2 != null) {
                  je.tutorialShotModeEnter = a.decodeBytesToString(var2, -41);
                }
                var2 = LocalGameSetupScreen.a("tutorial_shot_mode_take", (byte) 19);
                if (null != var2) {
                  AchievementsScreen.tutorialShotModeTake = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("tutorial_shot_mode_rotate", (byte) 94);
                if (null != var2) {
                  en.tutorialShotModeRotate = a.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.a("tutorial_shot_mode_power", (byte) 76);
                if (var2 != null) {
                  na.tutorialShotModePower = a.decodeBytesToString(var2, -70);
                }
                var2 = LocalGameSetupScreen.a("tutorial_shot_mode_leave", (byte) 86);
                if (var2 != null) {
                  om.tutorialShotModeLeave = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_basic_complete", (byte) 115);
                if (null != var2) {
                  TextLineLayout.tutorialBasicComplete = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_start_place_cueball", (byte) 26);
                if (null != var2) {
                  MessageDialog.tutorialEightBallStartPlaceCueball = a.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_break", (byte) 66);
                if (null != var2) {
                  dr.tutorialEightBallBreak = a.decodeBytesToString(var2, -80);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_afterbreak", (byte) 120);
                if (var2 != null) {
                  ea.tutorialEightBallAfterbreak = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_afterfirstpot", (byte) 60);
                if (var2 != null) {
                  gn.tutorialEightBallAfterfirstpot = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_aftergrouppot", (byte) 68);
                if (null != var2) {
                  ChatMessageLine.tutorialEightBallAftergrouppot = a.decodeBytesToString(var2, -113);
                }
                var2 = LocalGameSetupScreen.a("tutorial_eight_ball_complete", (byte) 81);
                if (null != var2) {
                  MusicPatch.tutorialEightBallComplete = a.decodeBytesToString(var2, -98);
                }
                var2 = LocalGameSetupScreen.a("potting_ball_for_you", (byte) 41);
                if (var2 != null) {
                  ModelTableScene.pottingBallForYou = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("potting_the_rest_of_your_group", (byte) 75);
                if (var2 != null) {
                  CueAim.pottingTheRestOfYourGroup = a.decodeBytesToString(var2, -61);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_start_place_cueball", (byte) 55);
                if (null != var2) {
                  TextPairLoginPayload.tutorialNineBallStartPlaceCueball = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_break", (byte) 123);
                if (var2 != null) {
                  SoundCache.tutorialNineBallBreak = a.decodeBytesToString(var2, -1);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_afterbreak", (byte) 28);
                if (null != var2) {
                  DateInputWidget.tutorialNineBallAfterbreak = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_potting_a_ball", (byte) 74);
                if (var2 != null) {
                  pl.tutorialNineBallPottingABall = a.decodeBytesToString(var2, -83);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_potting_nine", (byte) 77);
                if (null != var2) {
                  LoginForm.tutorialNineBallPottingNine = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("tutorial_nine_ball_final", (byte) 35);
                if (null != var2) {
                  rc.tutorialNineBallFinal = a.decodeBytesToString(var2, 12);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_enter_shot_mode", (byte) 39);
                if (null != var2) {
                  ah.tickerHintEnterShotMode = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_leave_shot_mode", (byte) 76);
                if (var2 != null) {
                  PoolMatchController.tickerHintLeaveShotMode = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_move_cueball", (byte) 76);
                if (null != var2) {
                  CachedArchiveSource.tickerHintMoveCueball = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_set_power", (byte) 87);
                if (null != var2) {
                  FullscreenErrorDialog.tickerHintSetPower = a.decodeBytesToString(var2, -110);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_zoom", (byte) 27);
                if (var2 != null) {
                  sm.tickerHintZoom = a.decodeBytesToString(var2, -119);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_shot_mode_aim", (byte) 105);
                if (var2 != null) {
                  HighscoresScreen.tickerHintShotModeAim = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_aim", (byte) 39);
                if (var2 != null) {
                  sa.tickerHintAim = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_rotate", (byte) 48);
                if (null != var2) {
                  pm.tickerHintRotate = a.decodeBytesToString(var2, 0);
                }
                var2 = LocalGameSetupScreen.a("ticker_hint_shoot", (byte) 73);
                if (var2 != null) {
                  QuickChatCategoryDefinition.tickerHintShoot = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("menu_restart_game", (byte) 33);
                if (null != var2) {
                  DiskArchiveRequest.menuRestartGame = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("menu_rematch_game", (byte) 103);
                if (var2 != null) {
                  CachedArchiveSource.menuRematchGame = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("menu_settings", (byte) 19);
                if (null != var2) {
                  IntrusiveDeque.menuSettings = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("foul_exclamation", (byte) 107);
                if (null != var2) {
                  bq.foulExclamation = a.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.a("player_name_another_shot", (byte) 66);
                if (var2 != null) {
                  a.decodeBytesToString(var2, -58);
                }
                var2 = LocalGameSetupScreen.a("player_name_two_shots", (byte) 59);
                if (var2 != null) {
                  ArchiveRequest.playerNameTwoShots = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_name_ball_in_hand", (byte) 44);
                if (null != var2) {
                  AlignedIconLabel.playerNameBallInHand = a.decodeBytesToString(var2, -29);
                }
                var2 = LocalGameSetupScreen.a("player_name_you_have_an_extra_shot", (byte) 42);
                if (var2 != null) {
                  TimeTrialRules.playerNameYouHaveAnExtraShot = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("status_versus", (byte) 55);
                if (var2 != null) {
                  tp.statusVersus = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("status_out_of_lives", (byte) 82);
                if (null != var2) {
                  DualLinkNode.statusOutOfLives = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("status_resigned", (byte) 78);
                if (var2 != null) {
                  LabeledChildWidget.statusResigned = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("status_wants_to_draw", (byte) 79);
                if (var2 != null) {
                  OpacityWidget.statusWantsToDraw = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("status_wants_a_rematch", (byte) 30);
                if (var2 != null) {
                  PacketBuffer.statusWantsARematch = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_list_first", (byte) 33);
                if (var2 != null) {
                  en.playerListFirst = a.decodeBytesToString(var2, -115);
                }
                var2 = LocalGameSetupScreen.a("player_list_middle", (byte) 33);
                if (var2 != null) {
                  bc.playerListMiddle = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_list_last", (byte) 43);
                if (var2 != null) {
                  DialogLayer.playerListLast = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("you_are_group_name", (byte) 31);
                if (null != var2) {
                  KillerRules.youAreGroupName = a.decodeBytesToString(var2, -14);
                }
                var2 = LocalGameSetupScreen.a("player_is_group_name", (byte) 87);
                if (var2 != null) {
                  Under13NoticePanel.playerIsGroupName = a.decodeBytesToString(var2, -39);
                }
                var2 = LocalGameSetupScreen.a("player_x2_are_group_name", (byte) 32);
                if (var2 != null) {
                  ScrollPane.playerX2AreGroupName = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_list_are_group_name", (byte) 66);
                if (null != var2) {
                  w.playerListAreGroupName = a.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_are_group_name", (byte) 116);
                if (null != var2) {
                  MessageDialog.playerYouX2AreGroupName = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_are_group_name", (byte) 75);
                if (var2 != null) {
                  ij.playerYouFirstListAreGroupName = a.decodeBytesToString(var2, -20);
                }
                var2 = LocalGameSetupScreen.a("player_x2_have_won", (byte) 78);
                if (null != var2) {
                  FullscreenErrorDialog.playerX2HaveWon = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("player_list_have_won", (byte) 61);
                if (var2 != null) {
                  sk.playerListHaveWon = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_have_won", (byte) 97);
                if (null != var2) {
                  AccountCreationForm.playerYouX2HaveWon = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_have_won", (byte) 88);
                if (var2 != null) {
                  jq.playerYouFirstListHaveWon = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_is_offering_rematch", (byte) 33);
                if (null != var2) {
                  a.decodeBytesToString(var2, -79);
                }
                var2 = LocalGameSetupScreen.a("player_x2_are_offering_rematch", (byte) 73);
                if (var2 != null) {
                  hp.playerX2AreOfferingRematch = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_list_are_offering_rematch", (byte) 95);
                if (var2 != null) {
                  ee.playerListAreOfferingRematch = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_are_offering_rematch", (byte) 126);
                if (null != var2) {
                  Ball.playerYouX2AreOfferingRematch = a.decodeBytesToString(var2, -50);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_are_offering_rematch", (byte) 68);
                if (null != var2) {
                  UiComponentNode.playerYouFirstListAreOfferingRematch = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("player_is_offering_draw", (byte) 93);
                if (var2 != null) {
                  a.decodeBytesToString(var2, -111);
                }
                var2 = LocalGameSetupScreen.a("player_x2_are_offering_draw", (byte) 52);
                if (null != var2) {
                  DualLinkNode.playerX2AreOfferingDraw = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("player_list_are_offering_draw", (byte) 83);
                if (var2 != null) {
                  StrongCacheEntry.playerListAreOfferingDraw = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_are_offering_draw", (byte) 108);
                if (var2 != null) {
                  QuickChatMenu.playerYouX2AreOfferingDraw = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_are_offering_draw", (byte) 107);
                if (var2 != null) {
                  CueStick.playerYouFirstListAreOfferingDraw = a.decodeBytesToString(var2, -36);
                }
                var2 = LocalGameSetupScreen.a("player_you_are_out", (byte) 70);
                if (null != var2) {
                  TextLineLayout.playerYouAreOut = a.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.a("player_is_out", (byte) 28);
                if (var2 != null) {
                  ShotRecord.playerIsOut = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("player_x2_are_out", (byte) 108);
                if (null != var2) {
                  mg.playerX2AreOut = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_list_are_out", (byte) 105);
                if (null != var2) {
                  jl.playerListAreOut = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_are_out", (byte) 95);
                if (var2 != null) {
                  TextInputWidget.playerYouX2AreOut = a.decodeBytesToString(var2, -96);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_are_out", (byte) 29);
                if (var2 != null) {
                  HuffmanCodec.playerYouFirstListAreOut = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_has_resigned", (byte) 55);
                if (null != var2) {
                  a.decodeBytesToString(var2, -87);
                }
                var2 = LocalGameSetupScreen.a("player_x2_have_resigned", (byte) 28);
                if (null != var2) {
                  w.playerX2HaveResigned = a.decodeBytesToString(var2, -52);
                }
                var2 = LocalGameSetupScreen.a("player_list_have_resigned", (byte) 67);
                if (null != var2) {
                  Pocket.playerListHaveResigned = a.decodeBytesToString(var2, -49);
                }
                var2 = LocalGameSetupScreen.a("player_you_x2_have_resigned", (byte) 84);
                if (null != var2) {
                  WireframeQuad.playerYouX2HaveResigned = a.decodeBytesToString(var2, 14);
                }
                var2 = LocalGameSetupScreen.a("player_you_first_list_have_resigned", (byte) 51);
                if (null != var2) {
                  DraggableWidget.playerYouFirstListHaveResigned = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_vs_player", (byte) 121);
                if (var2 != null) {
                  w.playerVsPlayer = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_list_vs_player_list", (byte) 84);
                if (null != var2) {
                  AlternateLongAndTextLoginPayload.playerListVsPlayerList = a.decodeBytesToString(var2, 11);
                }
                var2 = LocalGameSetupScreen.a("tutorial_break_try_again", (byte) 115);
                if (var2 != null) {
                  BallDebugOverlay.tutorialBreakTryAgain = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("tutorial_lose", (byte) 92);
                if (null != var2) {
                  ph.tutorialLose = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("tutorial_lose_eight_ball_game", (byte) 90);
                if (var2 != null) {
                  c.tutorialLoseEightBallGame = a.decodeBytesToString(var2, -80);
                }
                var2 = LocalGameSetupScreen.a("tutorial_lose_nine_ball_game", (byte) 82);
                if (var2 != null) {
                  PotEvent.tutorialLoseNineBallGame = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("cannot_position_cue_there", (byte) 52);
                if (null != var2) {
                  RasterSnapshot.cannotPositionCueThere = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("cue_cant_go_there", (byte) 82);
                if (null != var2) {
                  jd.cueCantGoThere = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_x_gained_a_life", (byte) 100);
                if (null != var2) {
                  ArchiveIndex.playerXGainedALife = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_x_lost_a_life", (byte) 124);
                if (var2 != null) {
                  CueStick.playerXLostALife = a.decodeBytesToString(var2, -55);
                }
                var2 = LocalGameSetupScreen.a("player_x_lost_two_lives", (byte) 49);
                if (var2 != null) {
                  GzipDecoder.playerXLostTwoLives = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("you_gained_a_life", (byte) 101);
                if (var2 != null) {
                  oj.youGainedALife = a.decodeBytesToString(var2, -24);
                }
                var2 = LocalGameSetupScreen.a("you_lost_a_life", (byte) 71);
                if (var2 != null) {
                  UiComponentNode.youLostALife = a.decodeBytesToString(var2, 1);
                }
                var2 = LocalGameSetupScreen.a("you_lost_two_lives", (byte) 85);
                if (var2 != null) {
                  CueStick.youLostTwoLives = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("player_x_now_has_n_lives", (byte) 68);
                if (null != var2) {
                  TikiTableScene.playerXNowHasNLives = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("player_x_is_on_their_last_life", (byte) 67);
                if (var2 != null) {
                  PlayerContextMenu.playerXIsOnTheirLastLife = a.decodeBytesToString(var2, -60);
                }
                var2 = LocalGameSetupScreen.a("you_now_have_n_lives", (byte) 30);
                if (var2 != null) {
                  NanoTickClock.youNowHaveNLives = a.decodeBytesToString(var2, -47);
                }
                var2 = LocalGameSetupScreen.a("you_are_on_your_last_life", (byte) 34);
                if (null != var2) {
                  bh.youAreOnYourLastLife = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("doubleplusgood_shot,0", (byte) 95);
                if (var2 != null) {
                  DualLinkDeque.doubleplusgoodShot[0] = a.decodeBytesToString(var2, -37);
                }
                var2 = LocalGameSetupScreen.a("doubleplusgood_shot,1", (byte) 61);
                if (var2 != null) {
                  DualLinkDeque.doubleplusgoodShot[1] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("plusgood_shot,0", (byte) 103);
                if (null != var2) {
                  Ball.plusgoodShot[0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("plusgood_shot,1", (byte) 53);
                if (null != var2) {
                  Ball.plusgoodShot[1] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("plusgood_shot,2", (byte) 43);
                if (null != var2) {
                  Ball.plusgoodShot[2] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("plusgood_shot,3", (byte) 25);
                if (var2 != null) {
                  Ball.plusgoodShot[3] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("good_shot,0", (byte) 114);
                if (null != var2) {
                  LimitedRandomAccessFile.goodShot[0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("good_shot,1", (byte) 61);
                if (var2 != null) {
                  LimitedRandomAccessFile.goodShot[1] = a.decodeBytesToString(var2, -44);
                }
                var2 = LocalGameSetupScreen.a("good_shot,2", (byte) 45);
                if (null != var2) {
                  LimitedRandomAccessFile.goodShot[2] = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("ungood_shot,0", (byte) 58);
                if (var2 != null) {
                  QuickChatMenu.ungoodShot[0] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("ungood_shot,1", (byte) 109);
                if (var2 != null) {
                  QuickChatMenu.ungoodShot[1] = a.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.a("ungood_shot,2", (byte) 53);
                if (null != var2) {
                  QuickChatMenu.ungoodShot[2] = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("plusungood_shot,0", (byte) 79);
                if (var2 != null) {
                  he.plusungoodShot[0] = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("plusungood_shot,1", (byte) 40);
                if (var2 != null) {
                  he.plusungoodShot[1] = a.decodeBytesToString(var2, -68);
                }
                var2 = LocalGameSetupScreen.a("plusungood_shot,2", (byte) 58);
                if (null != var2) {
                  he.plusungoodShot[2] = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("doubleplusungood_shot,0", (byte) 49);
                if (null != var2) {
                  TikiBallSkin.doubleplusungoodShot[0] = a.decodeBytesToString(var2, -90);
                }
                var2 = LocalGameSetupScreen.a("doubleplusungood_shot,1", (byte) 61);
                if (var2 != null) {
                  TikiBallSkin.doubleplusungoodShot[1] = a.decodeBytesToString(var2, -9);
                }
                var2 = LocalGameSetupScreen.a("doubleplusungood_shot,2", (byte) 75);
                if (null != var2) {
                  TikiBallSkin.doubleplusungoodShot[2] = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("you_potted_balls_from_each_group", (byte) 49);
                if (null != var2) {
                  a.decodeBytesToString(var2, -73);
                }
                var2 = LocalGameSetupScreen.a("which_group_do_you_want", (byte) 77);
                if (var2 != null) {
                  AgeValidator.whichGroupDoYouWant = a.decodeBytesToString(var2, -31);
                }
                var2 = LocalGameSetupScreen.a("would_you_like_to_play_or_pass", (byte) 126);
                if (null != var2) {
                  ml.wouldYouLikeToPlayOrPass = a.decodeBytesToString(var2, -89);
                }
                var2 = LocalGameSetupScreen.a("decision_button_play", (byte) 71);
                if (null != var2) {
                  ImageProducerRasterBuffer.decisionButtonPlay = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("decision_button_pass", (byte) 59);
                if (null != var2) {
                  rl.decisionButtonPass = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("tooltip_ball_in_hand", (byte) 97);
                if (var2 != null) {
                  jq.tooltipBallInHand = a.decodeBytesToString(var2, -128);
                }
                var2 = LocalGameSetupScreen.a("tooltip_break", (byte) 106);
                if (var2 != null) {
                  bo.tooltipBreak = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("tooltip_extra_visit", (byte) 104);
                if (null != var2) {
                  ProgressDialog.tooltipExtraVisit = a.decodeBytesToString(var2, -1);
                }
                var2 = LocalGameSetupScreen.a("tooltip_snookered", (byte) 73);
                if (var2 != null) {
                  tq.tooltipSnookered = a.decodeBytesToString(var2, -32);
                }
                var2 = LocalGameSetupScreen.a("chat_button", (byte) 85);
                if (null != var2) {
                  UsernameAvailabilityValidator.chatButton = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("end_of_game_press_escape_to_continue", (byte) 48);
                if (var2 != null) {
                  fl.endOfGamePressEscapeToContinue = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("press_escape_for_options_menu", (byte) 19);
                if (var2 != null) {
                  LoginTextValue.pressEscapeForOptionsMenu = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("time_trial", (byte) 19);
                if (null != var2) {
                  TableScene.timeTrial = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("timer", (byte) 119);
                if (null != var2) {
                  CushionSegment.timer = a.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.a("highscore_header_time", (byte) 114);
                if (var2 != null) {
                  vi.highscoreHeaderTime = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("player_colon", (byte) 92);
                if (null != var2) {
                  PlasmaBallSkin.playerColon = a.decodeBytesToString(var2, 125);
                }
                var2 = LocalGameSetupScreen.a("player_colon_fr", (byte) 122);
                if (null != var2) {
                  rc.playerColonFr = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("time_trial_completed", (byte) 72);
                if (null != var2) {
                  bc.timeTrialCompleted = a.decodeBytesToString(var2, -92);
                }
                var2 = LocalGameSetupScreen.a("time_trial_failed", (byte) 62);
                if (var2 != null) {
                  MouseHandler.timeTrialFailed = a.decodeBytesToString(var2, 124);
                }
                var2 = LocalGameSetupScreen.a("timer_seconds", (byte) 64);
                if (var2 != null) {
                  a.decodeBytesToString(var2, -6);
                }
                var2 = LocalGameSetupScreen.a("timer_seconds_fractions", (byte) 70);
                if (var2 != null) {
                  UsernameSuggestionsPanel.timerSecondsFractions = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("timer_minutes_seconds", (byte) 39);
                if (null != var2) {
                  DialogLayer.timerMinutesSeconds = a.decodeBytesToString(var2, -56);
                }
                var2 = LocalGameSetupScreen.a("timer_minutes_seconds_fractions", (byte) 23);
                if (var2 != null) {
                  ShotRecord.timerMinutesSecondsFractions = a.decodeBytesToString(var2, -17);
                }
                var2 = LocalGameSetupScreen.a("timer_hours_minutes_seconds", (byte) 28);
                if (var2 != null) {
                  CueStick.timerHoursMinutesSeconds = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("timer_hours_minutes_seconds_fractions", (byte) 76);
                if (null != var2) {
                  PolarTableScene.timerHoursMinutesSecondsFractions = a.decodeBytesToString(var2, -116);
                }
                var2 = LocalGameSetupScreen.a("mouse_y_axis_normal", (byte) 48);
                if (null != var2) {
                  PoolMatchController.mouseYAxisNormal = a.decodeBytesToString(var2, 123);
                }
                var2 = LocalGameSetupScreen.a("mouse_y_axis_inverted", (byte) 82);
                if (null != var2) {
                  NodeHashTableIterator.mouseYAxisInverted = a.decodeBytesToString(var2, -103);
                }
                var2 = LocalGameSetupScreen.a("menu_time_trial_with_guides", (byte) 94);
                if (null != var2) {
                  ShotRecord.menuTimeTrialWithGuides = a.decodeBytesToString(var2, 2);
                }
                var2 = LocalGameSetupScreen.a("menu_time_trial_without_guides", (byte) 68);
                if (null != var2) {
                  pl.menuTimeTrialWithoutGuides = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("achievements_only_in_rated", (byte) 28);
                if (var2 != null) {
                  ab.achievementsOnlyInRated = a.decodeBytesToString(var2, -38);
                }
                var2 = LocalGameSetupScreen.a("progress_jungle_bulk", (byte) 58);
                if (var2 != null) {
                  sa.progressJungleBulk = a.decodeBytesToString(var2, -108);
                }
                var2 = LocalGameSetupScreen.a("progress_jungle_finishing", (byte) 49);
                if (var2 != null) {
                  DualLinkDequeIterator.progressJungleFinishing = a.decodeBytesToString(var2, 127);
                }
                var2 = LocalGameSetupScreen.a("rated_membersonly", (byte) 84);
                if (null != var2) {
                  tq.ratedMembersonly = a.decodeBytesToString(var2, -23);
                }
                var2 = LocalGameSetupScreen.a("youhavelost", (byte) 44);
                if (null != var2) {
                  MarkerSliderPainter.youhavelost = a.decodeBytesToString(var2, -92);
                }
                var2 = LocalGameSetupScreen.a("pot_balls_in_any_order_finish_on_black", (byte) 89);
                if (null != var2) {
                  Pool.potBallsInAnyOrderFinishOnBlack = a.decodeBytesToString(var2, -48);
                }
                var2 = LocalGameSetupScreen.a("keycode_default_up1", (byte) 82);
                if (null != var2) {
                  gp.keycodeDefaultUp1 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.a("keycode_default_up2", (byte) 28);
                if (var2 != null) {
                  fl.keycodeDefaultUp2 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.a("keycode_default_down1", (byte) 85);
                if (var2 != null) {
                  Quaternion.keycodeDefaultDown1 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.a("keycode_default_down2", (byte) 106);
                if (var2 != null) {
                  ProxySocketConnector.keycodeDefaultDown2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.a("keycode_default_left1", (byte) 17);
                if (null != var2) {
                  bc.keycodeDefaultLeft1 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.a("keycode_default_left2", (byte) 113);
                if (var2 != null) {
                  ByteStorage.keycodeDefaultLeft2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.a("keycode_default_right1", (byte) 38);
                if (null != var2) {
                  gn.keycodeDefaultRight1 = var2[0] & 255;
                }
                var2 = LocalGameSetupScreen.a("keycode_default_right2", (byte) 91);
                if (var2 != null) {
                  ResourceArchive.keycodeDefaultRight2 = 255 & var2[0];
                }
                var2 = LocalGameSetupScreen.a("menu_option_return_to_tutorial", (byte) 126);
                if (var2 != null) {
                  MouseWheelInput.menuOptionReturnToTutorial = a.decodeBytesToString(var2, 126);
                }
                var2 = LocalGameSetupScreen.a("menu_option_end_tutorial", (byte) 26);
                if (null != var2) {
                  bc.menuOptionEndTutorial = a.decodeBytesToString(var2, 126);
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
