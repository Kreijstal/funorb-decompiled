/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static lr field_a;
    static vh field_f;
    static volatile int field_g;
    static int field_d;
    static boolean field_b;
    static String[][] field_c;
    static vh field_e;

    final static void a(di param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1506_0;
            StringBuilder stackIn_1506_1;
            String stackIn_1507_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            di param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(di initialParam0, int initialParam1) {
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
                ib.field_u = param0;
                var2 = cm.a("text_game_name", (byte) 29);
                if (null != var2) {
                  wm.field_Yb = a.a(var2, 127);
                }
                var2 = cm.a("text_benefits,0", (byte) 117);
                if (null != var2) {
                  vd.field_l[0] = a.a(var2, 125);
                }
                var2 = cm.a("text_benefits,1", (byte) 127);
                if (null != var2) {
                  vd.field_l[1] = a.a(var2, -30);
                }
                var2 = cm.a("text_benefits,2", (byte) 57);
                if (null != var2) {
                  vd.field_l[2] = a.a(var2, -40);
                }
                var2 = cm.a("achievement_names,0", (byte) 27);
                if (null != var2) {
                  md.field_a[0] = a.a(var2, 125);
                }
                var2 = cm.a("achievement_names,1", (byte) 70);
                if (null != var2) {
                  md.field_a[1] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_names,2", (byte) 37);
                if (var2 != null) {
                  md.field_a[2] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_names,3", (byte) 41);
                if (null != var2) {
                  md.field_a[3] = a.a(var2, -26);
                }
                var2 = cm.a("achievement_names,4", (byte) 54);
                if (null != var2) {
                  md.field_a[4] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_names,5", (byte) 88);
                if (var2 != null) {
                  md.field_a[5] = a.a(var2, -31);
                }
                var2 = cm.a("achievement_names,6", (byte) 87);
                if (null != var2) {
                  md.field_a[6] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_names,7", (byte) 99);
                if (null != var2) {
                  md.field_a[7] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_names,8", (byte) 127);
                if (null != var2) {
                  md.field_a[8] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_names,9", (byte) 47);
                if (null != var2) {
                  md.field_a[9] = a.a(var2, 125);
                }
                var2 = cm.a("achievement_names,10", (byte) 87);
                if (var2 != null) {
                  md.field_a[10] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_names,11", (byte) 46);
                if (var2 != null) {
                  md.field_a[11] = a.a(var2, -11);
                }
                var2 = cm.a("achievement_names,12", (byte) 49);
                if (null != var2) {
                  md.field_a[12] = a.a(var2, 125);
                }
                var2 = cm.a("achievement_names,13", (byte) 70);
                if (null != var2) {
                  md.field_a[13] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_names,14", (byte) 72);
                if (null != var2) {
                  md.field_a[14] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_names,15", (byte) 73);
                if (var2 != null) {
                  md.field_a[15] = a.a(var2, -45);
                }
                var2 = cm.a("achievement_names,16", (byte) 18);
                if (null != var2) {
                  md.field_a[16] = a.a(var2, -26);
                }
                var2 = cm.a("achievement_names,17", (byte) 39);
                if (null != var2) {
                  md.field_a[17] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_names,18", (byte) 22);
                if (var2 != null) {
                  md.field_a[18] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_names,19", (byte) 78);
                if (null != var2) {
                  md.field_a[19] = a.a(var2, -87);
                }
                var2 = cm.a("achievement_names,20", (byte) 57);
                if (var2 != null) {
                  md.field_a[20] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_names,21", (byte) 36);
                if (null != var2) {
                  md.field_a[21] = a.a(var2, 8);
                }
                var2 = cm.a("achievement_names,22", (byte) 116);
                if (var2 != null) {
                  md.field_a[22] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_names,23", (byte) 32);
                if (null != var2) {
                  md.field_a[23] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_names,24", (byte) 97);
                if (null != var2) {
                  md.field_a[24] = a.a(var2, -55);
                }
                var2 = cm.a("achievement_names,25", (byte) 77);
                if (null != var2) {
                  md.field_a[25] = a.a(var2, -91);
                }
                var2 = cm.a("achievement_names,26", (byte) 117);
                if (var2 != null) {
                  md.field_a[26] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_criteria,0", (byte) 47);
                if (var2 != null) {
                  kc.field_d[0] = a.a(var2, -81);
                }
                var2 = cm.a("achievement_criteria,1", (byte) 111);
                if (var2 != null) {
                  kc.field_d[1] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_criteria,2", (byte) 82);
                if (var2 != null) {
                  kc.field_d[2] = a.a(var2, 5);
                }
                var2 = cm.a("achievement_criteria,3", (byte) 127);
                if (var2 != null) {
                  kc.field_d[3] = a.a(var2, -42);
                }
                var2 = cm.a("achievement_criteria,4", (byte) 63);
                if (var2 != null) {
                  kc.field_d[4] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_criteria,5", (byte) 18);
                if (var2 != null) {
                  kc.field_d[5] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_criteria,6", (byte) 112);
                if (var2 != null) {
                  kc.field_d[6] = a.a(var2, -71);
                }
                var2 = cm.a("achievement_criteria,7", (byte) 69);
                if (null != var2) {
                  kc.field_d[7] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_criteria,8", (byte) 34);
                if (var2 != null) {
                  kc.field_d[8] = a.a(var2, -67);
                }
                var2 = cm.a("achievement_criteria,9", (byte) 35);
                if (var2 != null) {
                  kc.field_d[9] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_criteria,10", (byte) 49);
                if (var2 != null) {
                  kc.field_d[10] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_criteria,11", (byte) 53);
                if (var2 != null) {
                  kc.field_d[11] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_criteria,12", (byte) 51);
                if (null != var2) {
                  kc.field_d[12] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_criteria,13", (byte) 90);
                if (null != var2) {
                  kc.field_d[13] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_criteria,14", (byte) 43);
                if (var2 != null) {
                  kc.field_d[14] = a.a(var2, -119);
                }
                var2 = cm.a("achievement_criteria,15", (byte) 89);
                if (null != var2) {
                  kc.field_d[15] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_criteria,16", (byte) 45);
                if (var2 != null) {
                  kc.field_d[16] = a.a(var2, -9);
                }
                var2 = cm.a("achievement_criteria,17", (byte) 29);
                if (null != var2) {
                  kc.field_d[17] = a.a(var2, 127);
                }
                var2 = cm.a("achievement_criteria,18", (byte) 61);
                if (null != var2) {
                  kc.field_d[18] = a.a(var2, -73);
                }
                var2 = cm.a("achievement_criteria,19", (byte) 76);
                if (null != var2) {
                  kc.field_d[19] = a.a(var2, 123);
                }
                var2 = cm.a("achievement_criteria,20", (byte) 125);
                if (var2 != null) {
                  kc.field_d[20] = a.a(var2, -40);
                }
                var2 = cm.a("achievement_criteria,21", (byte) 103);
                if (null != var2) {
                  kc.field_d[21] = a.a(var2, 126);
                }
                var2 = cm.a("achievement_criteria,22", (byte) 66);
                if (var2 != null) {
                  kc.field_d[22] = a.a(var2, 7);
                }
                var2 = cm.a("achievement_criteria,23", (byte) 31);
                if (var2 != null) {
                  kc.field_d[23] = a.a(var2, -71);
                }
                var2 = cm.a("achievement_criteria,24", (byte) 108);
                if (null != var2) {
                  kc.field_d[24] = a.a(var2, 124);
                }
                var2 = cm.a("achievement_criteria,25", (byte) 19);
                if (null != var2) {
                  kc.field_d[25] = a.a(var2, 125);
                }
                var2 = cm.a("achievement_criteria,26", (byte) 97);
                if (var2 != null) {
                  kc.field_d[26] = a.a(var2, -76);
                }
                var2 = cm.a("gameoptlabels,0", (byte) 63);
                if (var2 != null) {
                  s.field_d[0] = a.a(var2, -54);
                }
                var2 = cm.a("gameoptlabels,1", (byte) 33);
                if (null != var2) {
                  s.field_d[1] = a.a(var2, -96);
                }
                var2 = cm.a("gameoptlabels,2", (byte) 49);
                if (var2 != null) {
                  s.field_d[2] = a.a(var2, -47);
                }
                var2 = cm.a("gameoptlabels,3", (byte) 105);
                if (null != var2) {
                  s.field_d[3] = a.a(var2, -122);
                }
                var2 = cm.a("gameopt_buttonnames,0,0", (byte) 95);
                if (var2 != null) {
                  ve.field_q[0][0] = a.a(var2, -30);
                }
                var2 = cm.a("gameopt_buttonnames,0,1", (byte) 112);
                if (var2 != null) {
                  ve.field_q[0][1] = a.a(var2, 127);
                }
                var2 = cm.a("gameopt_buttonnames,0,2", (byte) 50);
                if (null != var2) {
                  ve.field_q[0][2] = a.a(var2, 124);
                }
                var2 = cm.a("gameopt_buttonnames,0,3", (byte) 38);
                if (var2 != null) {
                  ve.field_q[0][3] = a.a(var2, 123);
                }
                var2 = cm.a("gameopt_buttonnames,0,4", (byte) 36);
                if (null != var2) {
                  ve.field_q[0][4] = a.a(var2, 123);
                }
                var2 = cm.a("gameopt_buttonnames,0,5", (byte) 77);
                if (null != var2) {
                  ve.field_q[0][5] = a.a(var2, -4);
                }
                var2 = cm.a("ruleset_names,0", (byte) 78);
                if (var2 != null) {
                  im.field_ic[0] = a.a(var2, 126);
                }
                var2 = cm.a("ruleset_names,1", (byte) 92);
                if (null != var2) {
                  im.field_ic[1] = a.a(var2, 124);
                }
                var2 = cm.a("ruleset_names,2", (byte) 62);
                if (var2 != null) {
                  im.field_ic[2] = a.a(var2, -66);
                }
                var2 = cm.a("ruleset_names,3", (byte) 90);
                if (var2 != null) {
                  im.field_ic[3] = a.a(var2, 123);
                }
                var2 = cm.a("theme_names,0", (byte) 41);
                if (null != var2) {
                  cb.field_b[0] = a.a(var2, 14);
                }
                var2 = cm.a("theme_names,1", (byte) 52);
                if (var2 != null) {
                  cb.field_b[1] = a.a(var2, 127);
                }
                var2 = cm.a("theme_names,2", (byte) 36);
                if (var2 != null) {
                  cb.field_b[2] = a.a(var2, -24);
                }
                var2 = cm.a("theme_names,3", (byte) 114);
                if (null != var2) {
                  cb.field_b[3] = a.a(var2, 125);
                }
                var2 = cm.a("theme_names,4", (byte) 122);
                if (null != var2) {
                  cb.field_b[4] = a.a(var2, 127);
                }
                var2 = cm.a("theme_random", (byte) 121);
                if (null != var2) {
                  sn.field_k = a.a(var2, 123);
                }
                var2 = cm.a("guide_names,0", (byte) 83);
                if (var2 != null) {
                  ke.field_c[0] = a.a(var2, -120);
                }
                var2 = cm.a("guide_names,1", (byte) 39);
                if (null != var2) {
                  ke.field_c[1] = a.a(var2, 126);
                }
                var2 = cm.a("timer_secs", (byte) 107);
                if (null != var2) {
                  vm.field_b = a.a(var2, 124);
                }
                var2 = cm.a("gameopt_tooltipnames,0,0", (byte) 112);
                if (null != var2) {
                  field_c[0][0] = a.a(var2, -91);
                }
                var2 = cm.a("gameopt_tooltipnames,0,1", (byte) 74);
                if (var2 != null) {
                  field_c[0][1] = a.a(var2, -40);
                }
                var2 = cm.a("gameopt_tooltipnames,0,2", (byte) 83);
                if (var2 != null) {
                  field_c[0][2] = a.a(var2, 2);
                }
                var2 = cm.a("gameopt_tooltipnames,0,3", (byte) 96);
                if (null != var2) {
                  field_c[0][3] = a.a(var2, 123);
                }
                var2 = cm.a("gameopt_tooltipnames,0,4", (byte) 103);
                if (var2 != null) {
                  field_c[0][4] = a.a(var2, 127);
                }
                var2 = cm.a("gameopt_tooltipnames,0,5", (byte) 76);
                if (null != var2) {
                  field_c[0][5] = a.a(var2, -29);
                }
                var2 = cm.a("gameopt_tooltipnames,1,0", (byte) 80);
                if (null != var2) {
                  field_c[1][0] = a.a(var2, -69);
                }
                var2 = cm.a("gameopt_tooltipnames,1,1", (byte) 45);
                if (var2 != null) {
                  field_c[1][1] = a.a(var2, 127);
                }
                var2 = cm.a("gameopt_tooltipnames,1,2", (byte) 59);
                if (null != var2) {
                  field_c[1][2] = a.a(var2, -98);
                }
                var2 = cm.a("gameopt_tooltipnames,2,0", (byte) 30);
                if (var2 != null) {
                  field_c[2][0] = a.a(var2, -71);
                }
                var2 = cm.a("gameopt_tooltipnames,2,1", (byte) 104);
                if (var2 != null) {
                  field_c[2][1] = a.a(var2, 127);
                }
                var2 = cm.a("gameopt_tooltipnames,2,2", (byte) 61);
                if (null != var2) {
                  field_c[2][2] = a.a(var2, -50);
                }
                var2 = cm.a("gameopt_tooltipnames,2,3", (byte) 17);
                if (var2 != null) {
                  field_c[2][3] = a.a(var2, 126);
                }
                var2 = cm.a("gameopt_tooltipnames,2,4", (byte) 71);
                if (var2 != null) {
                  field_c[2][4] = a.a(var2, -14);
                }
                var2 = cm.a("gameopt_tooltipnames,2,5", (byte) 87);
                if (null != var2) {
                  field_c[2][5] = a.a(var2, -69);
                }
                var2 = cm.a("gameopt_tooltipnames,3,0", (byte) 98);
                if (var2 != null) {
                  field_c[3][0] = a.a(var2, 127);
                }
                var2 = cm.a("gameopt_tooltipnames,3,1", (byte) 74);
                if (var2 != null) {
                  field_c[3][1] = a.a(var2, 13);
                }
                var2 = cm.a("shot_messages,0", (byte) 121);
                if (null != var2) {
                  e.field_h[0] = a.a(var2, 124);
                }
                var2 = cm.a("shot_messages,1", (byte) 47);
                if (null != var2) {
                  e.field_h[1] = a.a(var2, 126);
                }
                var2 = cm.a("shot_messages,2", (byte) 84);
                if (var2 != null) {
                  e.field_h[2] = a.a(var2, -86);
                }
                var2 = cm.a("shot_messages,3", (byte) 62);
                if (var2 != null) {
                  e.field_h[3] = a.a(var2, 127);
                }
                var2 = cm.a("shot_messages,4", (byte) 22);
                if (var2 != null) {
                  e.field_h[4] = a.a(var2, -15);
                }
                var2 = cm.a("shot_messages,5", (byte) 108);
                if (null != var2) {
                  e.field_h[5] = a.a(var2, -14);
                }
                var2 = cm.a("shot_messages,6", (byte) 90);
                if (null != var2) {
                  e.field_h[6] = a.a(var2, -78);
                }
                var2 = cm.a("shot_messages,7", (byte) 28);
                if (var2 != null) {
                  e.field_h[7] = a.a(var2, -21);
                }
                var2 = cm.a("shot_messages,8", (byte) 97);
                if (var2 != null) {
                  e.field_h[8] = a.a(var2, -25);
                }
                var2 = cm.a("shot_messages,9", (byte) 115);
                if (null != var2) {
                  e.field_h[9] = a.a(var2, 127);
                }
                var2 = cm.a("shot_messages,10", (byte) 57);
                if (var2 != null) {
                  e.field_h[10] = a.a(var2, -81);
                }
                var2 = cm.a("shot_messages,11", (byte) 28);
                if (var2 != null) {
                  e.field_h[11] = a.a(var2, -22);
                }
                var2 = cm.a("shot_messages,12", (byte) 53);
                if (null != var2) {
                  e.field_h[12] = a.a(var2, 124);
                }
                var2 = cm.a("shot_messages,13", (byte) 83);
                if (var2 != null) {
                  e.field_h[13] = a.a(var2, 124);
                }
                var2 = cm.a("shot_messages,14", (byte) 61);
                if (null != var2) {
                  e.field_h[14] = a.a(var2, -86);
                }
                var2 = cm.a("shot_messages,15", (byte) 23);
                if (null != var2) {
                  e.field_h[15] = a.a(var2, 126);
                }
                var2 = cm.a("shot_messages,16", (byte) 30);
                if (null != var2) {
                  e.field_h[16] = a.a(var2, -122);
                }
                var2 = cm.a("shot_messages,17", (byte) 29);
                if (var2 != null) {
                  e.field_h[17] = a.a(var2, 126);
                }
                var2 = cm.a("shot_messages,18", (byte) 58);
                if (var2 != null) {
                  e.field_h[18] = a.a(var2, 126);
                }
                var2 = cm.a("shot_messages,19", (byte) 50);
                if (null != var2) {
                  e.field_h[19] = a.a(var2, 125);
                }
                var2 = cm.a("shot_messages,20", (byte) 123);
                if (var2 != null) {
                  e.field_h[20] = a.a(var2, -112);
                }
                var2 = cm.a("shot_messages,21", (byte) 89);
                if (var2 != null) {
                  e.field_h[21] = a.a(var2, -118);
                }
                var2 = cm.a("shot_messages,22", (byte) 116);
                if (var2 != null) {
                  e.field_h[22] = a.a(var2, 123);
                }
                var2 = cm.a("n_second_time_penalty", (byte) 92);
                if (var2 != null) {
                  iq.field_b = a.a(var2, -18);
                }
                var2 = cm.a("nine_ball_numbers,0", (byte) 75);
                if (null != var2) {
                  or.field_k[0] = a.a(var2, 124);
                }
                var2 = cm.a("nine_ball_numbers,1", (byte) 100);
                if (var2 != null) {
                  or.field_k[1] = a.a(var2, 125);
                }
                var2 = cm.a("nine_ball_numbers,2", (byte) 118);
                if (null != var2) {
                  or.field_k[2] = a.a(var2, 127);
                }
                var2 = cm.a("nine_ball_numbers,3", (byte) 63);
                if (var2 != null) {
                  or.field_k[3] = a.a(var2, 126);
                }
                var2 = cm.a("nine_ball_numbers,4", (byte) 118);
                if (var2 != null) {
                  or.field_k[4] = a.a(var2, 123);
                }
                var2 = cm.a("nine_ball_numbers,5", (byte) 26);
                if (null != var2) {
                  or.field_k[5] = a.a(var2, 127);
                }
                var2 = cm.a("nine_ball_numbers,6", (byte) 67);
                if (null != var2) {
                  or.field_k[6] = a.a(var2, -37);
                }
                var2 = cm.a("nine_ball_numbers,7", (byte) 50);
                if (var2 != null) {
                  or.field_k[7] = a.a(var2, 123);
                }
                var2 = cm.a("nine_ball_numbers,8", (byte) 118);
                if (var2 != null) {
                  or.field_k[8] = a.a(var2, 127);
                }
                var2 = cm.a("nine_ball_numbers,9", (byte) 55);
                if (null != var2) {
                  or.field_k[9] = a.a(var2, 127);
                }
                var2 = cm.a("eight_ball_numbers,0", (byte) 68);
                if (null != var2) {
                  ho.field_u[0] = a.a(var2, 127);
                }
                var2 = cm.a("eight_ball_numbers,1", (byte) 67);
                if (null != var2) {
                  ho.field_u[1] = a.a(var2, 125);
                }
                var2 = cm.a("eight_ball_numbers,2", (byte) 110);
                if (null != var2) {
                  ho.field_u[2] = a.a(var2, 125);
                }
                var2 = cm.a("eight_ball_numbers,3", (byte) 20);
                if (var2 != null) {
                  ho.field_u[3] = a.a(var2, 126);
                }
                var2 = cm.a("eight_ball_numbers,4", (byte) 101);
                if (null != var2) {
                  ho.field_u[4] = a.a(var2, 127);
                }
                var2 = cm.a("eight_ball_numbers,5", (byte) 42);
                if (var2 != null) {
                  ho.field_u[5] = a.a(var2, 126);
                }
                var2 = cm.a("eight_ball_numbers,6", (byte) 92);
                if (var2 != null) {
                  ho.field_u[6] = a.a(var2, -83);
                }
                var2 = cm.a("eight_ball_numbers,7", (byte) 85);
                if (var2 != null) {
                  ho.field_u[7] = a.a(var2, 15);
                }
                var2 = cm.a("eight_ball_numbers,8", (byte) 37);
                if (var2 != null) {
                  ho.field_u[8] = a.a(var2, 125);
                }
                var2 = cm.a("eight_ball_numbers,9", (byte) 91);
                if (null != var2) {
                  ho.field_u[9] = a.a(var2, -103);
                }
                var2 = cm.a("eight_ball_numbers,10", (byte) 70);
                if (null != var2) {
                  ho.field_u[10] = a.a(var2, 123);
                }
                var2 = cm.a("eight_ball_numbers,11", (byte) 116);
                if (null != var2) {
                  ho.field_u[11] = a.a(var2, -70);
                }
                var2 = cm.a("eight_ball_numbers,12", (byte) 79);
                if (var2 != null) {
                  ho.field_u[12] = a.a(var2, 126);
                }
                var2 = cm.a("eight_ball_numbers,13", (byte) 104);
                if (var2 != null) {
                  ho.field_u[13] = a.a(var2, -33);
                }
                var2 = cm.a("eight_ball_numbers,14", (byte) 82);
                if (var2 != null) {
                  ho.field_u[14] = a.a(var2, 13);
                }
                var2 = cm.a("eight_ball_numbers,15", (byte) 80);
                if (null != var2) {
                  ho.field_u[15] = a.a(var2, -45);
                }
                var2 = cm.a("ballset_planets_group_0", (byte) 97);
                if (null != var2) {
                  a.a(var2, -103);
                }
                var2 = cm.a("ballset_planets_group_1", (byte) 118);
                if (var2 != null) {
                  a.a(var2, 127);
                }
                var2 = cm.a("ballset_sports_group_0", (byte) 56);
                if (null != var2) {
                  a.a(var2, 127);
                }
                var2 = cm.a("ballset_sports_group_1", (byte) 83);
                if (null != var2) {
                  a.a(var2, -110);
                }
                var2 = cm.a("ballset_english_group_0", (byte) 40);
                if (var2 != null) {
                  ae.field_b = a.a(var2, -15);
                }
                var2 = cm.a("ballset_english_group_1", (byte) 69);
                if (null != var2) {
                  a.a(var2, -84);
                }
                var2 = cm.a("ballset_plasma_group_0_nocolour", (byte) 123);
                if (null != var2) {
                  pn.field_t = a.a(var2, -73);
                }
                var2 = cm.a("ballset_plasma_group_1_nocolour", (byte) 113);
                if (var2 != null) {
                  oe.field_S = a.a(var2, -67);
                }
                var2 = cm.a("ballset_plasma_group_0", (byte) 90);
                if (var2 != null) {
                  kk.field_G = a.a(var2, 126);
                }
                var2 = cm.a("ballset_plasma_group_1", (byte) 98);
                if (null != var2) {
                  hi.field_j = a.a(var2, -71);
                }
                var2 = cm.a("ballset_usa8_group_0", (byte) 113);
                if (null != var2) {
                  me.field_w = a.a(var2, 123);
                }
                var2 = cm.a("ballset_usa8_group_1", (byte) 49);
                if (var2 != null) {
                  vf.field_Q = a.a(var2, 6);
                }
                var2 = cm.a("ballset_torquing_group_0", (byte) 22);
                if (null != var2) {
                  a.a(var2, 125);
                }
                var2 = cm.a("ballset_torquing_group_1", (byte) 52);
                if (null != var2) {
                  a.a(var2, -124);
                }
                var2 = cm.a("ballset_space_group_0", (byte) 65);
                if (var2 != null) {
                  sn.field_j = a.a(var2, 123);
                }
                var2 = cm.a("ballset_space_group_1", (byte) 77);
                var3 = 50 % ((param1 - 58) / 42);
                if (var2 != null) {
                  dq.field_g = a.a(var2, 123);
                }
                var2 = cm.a("ballset_jungle_group_0", (byte) 36);
                if (null != var2) {
                  a.a(var2, 126);
                }
                var2 = cm.a("ballset_jungle_group_1", (byte) 27);
                if (var2 != null) {
                  a.a(var2, 124);
                }
                var2 = cm.a("ballset_polar_group_0", (byte) 119);
                if (null != var2) {
                  ij.field_t = a.a(var2, -81);
                }
                var2 = cm.a("ballset_polar_group_1", (byte) 64);
                if (null != var2) {
                  ld.field_h = a.a(var2, 125);
                }
                var2 = cm.a("target_open_table", (byte) 40);
                if (null != var2) {
                  rg.field_t = a.a(var2, -4);
                }
                var2 = cm.a("target_black_ball", (byte) 97);
                if (var2 != null) {
                  oq.field_C = a.a(var2, -127);
                }
                var2 = cm.a("you_player", (byte) 108);
                if (var2 != null) {
                  vq.field_Zb = a.a(var2, -31);
                }
                var2 = cm.a("computer_player", (byte) 82);
                if (null != var2) {
                  a.a(var2, 126);
                }
                var2 = cm.a("player_ns,0", (byte) 126);
                if (var2 != null) {
                  jo.field_I[0] = a.a(var2, 123);
                }
                var2 = cm.a("player_ns,1", (byte) 45);
                if (var2 != null) {
                  jo.field_I[1] = a.a(var2, 6);
                }
                var2 = cm.a("player_ns,2", (byte) 69);
                if (var2 != null) {
                  jo.field_I[2] = a.a(var2, -6);
                }
                var2 = cm.a("player_ns,3", (byte) 21);
                if (null != var2) {
                  jo.field_I[3] = a.a(var2, 125);
                }
                var2 = cm.a("player_ns,4", (byte) 104);
                if (null != var2) {
                  jo.field_I[4] = a.a(var2, -36);
                }
                var2 = cm.a("player_ns,5", (byte) 104);
                if (var2 != null) {
                  jo.field_I[5] = a.a(var2, -103);
                }
                var2 = cm.a("player_ns,6", (byte) 40);
                if (null != var2) {
                  jo.field_I[6] = a.a(var2, -60);
                }
                var2 = cm.a("player_ns,7", (byte) 57);
                if (var2 != null) {
                  jo.field_I[7] = a.a(var2, 127);
                }
                var2 = cm.a("instructions_titles,0", (byte) 65);
                if (var2 != null) {
                  rn.field_a[0] = a.a(var2, 127);
                }
                var2 = cm.a("instructions_titles,1", (byte) 21);
                if (null != var2) {
                  rn.field_a[1] = a.a(var2, 127);
                }
                var2 = cm.a("instructions_titles,2", (byte) 50);
                if (null != var2) {
                  rn.field_a[2] = a.a(var2, 123);
                }
                var2 = cm.a("instructions_titles,3", (byte) 79);
                if (null != var2) {
                  rn.field_a[3] = a.a(var2, -20);
                }
                var2 = cm.a("instructions_titles,4", (byte) 79);
                if (var2 != null) {
                  rn.field_a[4] = a.a(var2, -112);
                }
                var2 = cm.a("instructions_titles,5", (byte) 97);
                if (var2 != null) {
                  rn.field_a[5] = a.a(var2, -112);
                }
                var2 = cm.a("instructions_titles,6", (byte) 60);
                if (var2 != null) {
                  rn.field_a[6] = a.a(var2, 123);
                }
                var2 = cm.a("instructions_titles,7", (byte) 127);
                if (null != var2) {
                  rn.field_a[7] = a.a(var2, 127);
                }
                var2 = cm.a("instructions_titles,8", (byte) 124);
                if (var2 != null) {
                  rn.field_a[8] = a.a(var2, 125);
                }
                var2 = cm.a("instructions_titles,9", (byte) 64);
                if (var2 != null) {
                  rn.field_a[9] = a.a(var2, -90);
                }
                var2 = cm.a("instructions_pages,0", (byte) 63);
                if (null != var2) {
                  rb.field_n[0] = a.a(var2, -119);
                }
                var2 = cm.a("instructions_pages,1", (byte) 73);
                if (null != var2) {
                  rb.field_n[1] = a.a(var2, 125);
                }
                var2 = cm.a("instructions_pages,2", (byte) 120);
                if (null != var2) {
                  rb.field_n[2] = a.a(var2, 126);
                }
                var2 = cm.a("instructions_pages,3", (byte) 56);
                if (null != var2) {
                  rb.field_n[3] = a.a(var2, 125);
                }
                var2 = cm.a("instructions_pages,4", (byte) 69);
                if (null != var2) {
                  rb.field_n[4] = a.a(var2, 123);
                }
                var2 = cm.a("instructions_pages,5", (byte) 121);
                if (var2 != null) {
                  rb.field_n[5] = a.a(var2, -70);
                }
                var2 = cm.a("instructions_pages,6", (byte) 64);
                if (var2 != null) {
                  rb.field_n[6] = a.a(var2, -63);
                }
                var2 = cm.a("instructions_pages,7", (byte) 30);
                if (null != var2) {
                  rb.field_n[7] = a.a(var2, 126);
                }
                var2 = cm.a("instructions_pages,8", (byte) 102);
                if (var2 != null) {
                  rb.field_n[8] = a.a(var2, 125);
                }
                var2 = cm.a("instructions_pages,9", (byte) 42);
                if (null != var2) {
                  rb.field_n[9] = a.a(var2, -18);
                }
                var2 = cm.a("definition_terms_conjugations,0,0", (byte) 77);
                if (null != var2) {
                  dl.field_e[0][0] = a.a(var2, -16);
                }
                var2 = cm.a("definition_terms_conjugations,1,0", (byte) 100);
                if (null != var2) {
                  dl.field_e[1][0] = a.a(var2, 124);
                }
                var2 = cm.a("definition_terms_conjugations,2,0", (byte) 43);
                if (null != var2) {
                  dl.field_e[2][0] = a.a(var2, -51);
                }
                var2 = cm.a("definition_terms_conjugations,2,1", (byte) 76);
                if (var2 != null) {
                  dl.field_e[2][1] = a.a(var2, -107);
                }
                var2 = cm.a("definition_terms_conjugations,3,0", (byte) 95);
                if (null != var2) {
                  dl.field_e[3][0] = a.a(var2, -121);
                }
                var2 = cm.a("definition_terms_conjugations,3,1", (byte) 44);
                if (var2 != null) {
                  dl.field_e[3][1] = a.a(var2, 124);
                }
                var2 = cm.a("definition_terms_conjugations,3,2", (byte) 27);
                if (var2 != null) {
                  dl.field_e[3][2] = a.a(var2, -86);
                }
                var2 = cm.a("definition_terms_conjugations,4,0", (byte) 84);
                if (null != var2) {
                  dl.field_e[4][0] = a.a(var2, 123);
                }
                var2 = cm.a("definition_terms_conjugations,4,1", (byte) 73);
                if (var2 != null) {
                  dl.field_e[4][1] = a.a(var2, -32);
                }
                var2 = cm.a("definition_terms_conjugations,5,0", (byte) 59);
                if (var2 != null) {
                  dl.field_e[5][0] = a.a(var2, 123);
                }
                var2 = cm.a("definition_terms_conjugations,5,1", (byte) 121);
                if (null != var2) {
                  dl.field_e[5][1] = a.a(var2, 127);
                }
                var2 = cm.a("definition_terms_conjugations,6,0", (byte) 115);
                if (var2 != null) {
                  dl.field_e[6][0] = a.a(var2, 125);
                }
                var2 = cm.a("definition_terms_conjugations,6,1", (byte) 112);
                if (null != var2) {
                  dl.field_e[6][1] = a.a(var2, 124);
                }
                var2 = cm.a("definition_terms_conjugations,6,2", (byte) 123);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  dl.field_e[6][2] = a.a(var2, 124);
                }
                var2 = cm.a("definition_terms_conjugations,7,0", (byte) 74);
                if (var2 != null) {
                  dl.field_e[7][0] = a.a(var2, 123);
                }
                var2 = cm.a("definition_terms_conjugations,7,1", (byte) 67);
                if (null != var2) {
                  dl.field_e[7][1] = a.a(var2, -16);
                }
                var2 = cm.a("definition_terms_conjugations,8,0", (byte) 102);
                if (null != var2) {
                  dl.field_e[8][0] = a.a(var2, -36);
                }
                var2 = cm.a("definition_terms_conjugations,8,1", (byte) 99);
                if (var2 != null) {
                  dl.field_e[8][1] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,9,0", (byte) 100);
                if (null != var2) {
                  dl.field_e[9][0] = a.a(var2, 125);
                }
                var2 = cm.a("definition_terms_conjugations,9,1", (byte) 99);
                if (var2 != null) {
                  dl.field_e[9][1] = a.a(var2, 8);
                }
                var2 = cm.a("definition_terms_conjugations,10,0", (byte) 18);
                if (var2 != null) {
                  dl.field_e[10][0] = a.a(var2, -9);
                }
                var2 = cm.a("definition_terms_conjugations,10,1", (byte) 79);
                if (null != var2) {
                  dl.field_e[10][1] = a.a(var2, 125);
                }
                var2 = cm.a("definition_terms_conjugations,11,0", (byte) 91);
                if (var2 != null) {
                  dl.field_e[11][0] = a.a(var2, -8);
                }
                var2 = cm.a("definition_terms_conjugations,12,0", (byte) 82);
                if (var2 != null) {
                  dl.field_e[12][0] = a.a(var2, -113);
                }
                var2 = cm.a("definition_terms_conjugations,12,1", (byte) 119);
                if (null != var2) {
                  dl.field_e[12][1] = a.a(var2, 125);
                }
                var2 = cm.a("definition_terms_conjugations,13,0", (byte) 50);
                if (null != var2) {
                  dl.field_e[13][0] = a.a(var2, 127);
                }
                var2 = cm.a("definition_terms_conjugations,13,1", (byte) 34);
                if (var2 != null) {
                  dl.field_e[13][1] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,13,2", (byte) 47);
                if (var2 != null) {
                  dl.field_e[13][2] = a.a(var2, -73);
                }
                var2 = cm.a("definition_terms_conjugations,13,3", (byte) 63);
                if (null != var2) {
                  dl.field_e[13][3] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,14,0", (byte) 71);
                if (var2 != null) {
                  dl.field_e[14][0] = a.a(var2, 124);
                }
                var2 = cm.a("definition_terms_conjugations,14,1", (byte) 91);
                if (var2 != null) {
                  dl.field_e[14][1] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,15,0", (byte) 25);
                if (null != var2) {
                  dl.field_e[15][0] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,15,1", (byte) 45);
                if (var2 != null) {
                  dl.field_e[15][1] = a.a(var2, 127);
                }
                var2 = cm.a("definition_terms_conjugations,16,0", (byte) 91);
                if (null != var2) {
                  dl.field_e[16][0] = a.a(var2, 126);
                }
                var2 = cm.a("definition_terms_conjugations,16,1", (byte) 106);
                if (null != var2) {
                  dl.field_e[16][1] = a.a(var2, -57);
                }
                var2 = cm.a("definition_definitions,0", (byte) 61);
                if (null != var2) {
                  hj.field_e[0] = a.a(var2, -72);
                }
                var2 = cm.a("definition_definitions,1", (byte) 58);
                if (null != var2) {
                  hj.field_e[1] = a.a(var2, 123);
                }
                var2 = cm.a("definition_definitions,2", (byte) 119);
                if (var2 != null) {
                  hj.field_e[2] = a.a(var2, 125);
                }
                var2 = cm.a("definition_definitions,3", (byte) 41);
                if (var2 != null) {
                  hj.field_e[3] = a.a(var2, 127);
                }
                var2 = cm.a("definition_definitions,4", (byte) 93);
                if (var2 != null) {
                  hj.field_e[4] = a.a(var2, -113);
                }
                var2 = cm.a("definition_definitions,5", (byte) 43);
                if (null != var2) {
                  hj.field_e[5] = a.a(var2, 123);
                }
                var2 = cm.a("definition_definitions,6", (byte) 116);
                if (null != var2) {
                  hj.field_e[6] = a.a(var2, 125);
                }
                var2 = cm.a("definition_definitions,7", (byte) 38);
                if (var2 != null) {
                  hj.field_e[7] = a.a(var2, 127);
                }
                var2 = cm.a("definition_definitions,8", (byte) 101);
                if (var2 != null) {
                  hj.field_e[8] = a.a(var2, -67);
                }
                var2 = cm.a("definition_definitions,9", (byte) 112);
                if (var2 != null) {
                  hj.field_e[9] = a.a(var2, 127);
                }
                var2 = cm.a("definition_definitions,10", (byte) 66);
                if (var2 != null) {
                  hj.field_e[10] = a.a(var2, 123);
                }
                var2 = cm.a("definition_definitions,11", (byte) 119);
                if (var2 != null) {
                  hj.field_e[11] = a.a(var2, 123);
                }
                var2 = cm.a("definition_definitions,12", (byte) 97);
                if (null != var2) {
                  hj.field_e[12] = a.a(var2, -44);
                }
                var2 = cm.a("definition_definitions,13", (byte) 67);
                if (var2 != null) {
                  hj.field_e[13] = a.a(var2, -100);
                }
                var2 = cm.a("definition_definitions,14", (byte) 22);
                if (null != var2) {
                  hj.field_e[14] = a.a(var2, -71);
                }
                var2 = cm.a("definition_definitions,15", (byte) 40);
                if (var2 != null) {
                  hj.field_e[15] = a.a(var2, 123);
                }
                var2 = cm.a("definition_definitions,16", (byte) 27);
                if (var2 != null) {
                  hj.field_e[16] = a.a(var2, -29);
                }
                var2 = cm.a("tutorial_option_basics", (byte) 20);
                if (null != var2) {
                  sl.field_U = a.a(var2, 125);
                }
                var2 = cm.a("tutorial_option_eight_ball", (byte) 58);
                if (null != var2) {
                  fd.field_Q = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_option_nine_ball", (byte) 100);
                if (null != var2) {
                  pf.field_a = a.a(var2, 127);
                }
                var2 = cm.a("tutorial_title_basics", (byte) 103);
                if (var2 != null) {
                  jj.field_Q = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_title_eight_ball", (byte) 113);
                if (var2 != null) {
                  fc.field_e = a.a(var2, -113);
                }
                var2 = cm.a("tutorial_title_nine_ball", (byte) 39);
                if (var2 != null) {
                  ep.field_G = a.a(var2, 125);
                }
                var2 = cm.a("tutorial_hide", (byte) 57);
                if (null != var2) {
                  ln.field_l = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_show", (byte) 67);
                if (null != var2) {
                  ml.field_a = a.a(var2, -44);
                }
                var2 = cm.a("tutorial_prev", (byte) 41);
                if (null != var2) {
                  ll.field_g = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_next", (byte) 127);
                if (var2 != null) {
                  aj.field_Tb = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_back", (byte) 77);
                if (var2 != null) {
                  a.a(var2, -46);
                }
                var2 = cm.a("tutorial_camera_rotate", (byte) 97);
                if (var2 != null) {
                  fn.field_Ob = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_camera_zoom", (byte) 80);
                if (null != var2) {
                  tj.field_eb = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_camera_recentre", (byte) 20);
                if (null != var2) {
                  ie.field_i = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_shot_mode_enter", (byte) 29);
                if (var2 != null) {
                  je.field_a = a.a(var2, -41);
                }
                var2 = cm.a("tutorial_shot_mode_take", (byte) 19);
                if (null != var2) {
                  el.field_L = a.a(var2, 123);
                }
                var2 = cm.a("tutorial_shot_mode_rotate", (byte) 94);
                if (null != var2) {
                  en.field_d = a.a(var2, -89);
                }
                var2 = cm.a("tutorial_shot_mode_power", (byte) 76);
                if (var2 != null) {
                  na.field_b = a.a(var2, -70);
                }
                var2 = cm.a("tutorial_shot_mode_leave", (byte) 86);
                if (var2 != null) {
                  om.field_t = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_basic_complete", (byte) 115);
                if (null != var2) {
                  vj.field_f = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_eight_ball_start_place_cueball", (byte) 26);
                if (null != var2) {
                  qq.field_yb = a.a(var2, -89);
                }
                var2 = cm.a("tutorial_eight_ball_break", (byte) 66);
                if (null != var2) {
                  dr.field_e = a.a(var2, -80);
                }
                var2 = cm.a("tutorial_eight_ball_afterbreak", (byte) 120);
                if (var2 != null) {
                  ea.field_m = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_eight_ball_afterfirstpot", (byte) 60);
                if (var2 != null) {
                  gn.field_a = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_eight_ball_aftergrouppot", (byte) 68);
                if (null != var2) {
                  lk.field_r = a.a(var2, -113);
                }
                var2 = cm.a("tutorial_eight_ball_complete", (byte) 81);
                if (null != var2) {
                  g.field_w = a.a(var2, -98);
                }
                var2 = cm.a("potting_ball_for_you", (byte) 41);
                if (var2 != null) {
                  vc.field_P = a.a(var2, 125);
                }
                var2 = cm.a("potting_the_rest_of_your_group", (byte) 75);
                if (var2 != null) {
                  kj.field_l = a.a(var2, -61);
                }
                var2 = cm.a("tutorial_nine_ball_start_place_cueball", (byte) 55);
                if (null != var2) {
                  ca.field_m = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_nine_ball_break", (byte) 123);
                if (var2 != null) {
                  cf.field_i = a.a(var2, -1);
                }
                var2 = cm.a("tutorial_nine_ball_afterbreak", (byte) 28);
                if (null != var2) {
                  eq.field_N = a.a(var2, 127);
                }
                var2 = cm.a("tutorial_nine_ball_potting_a_ball", (byte) 74);
                if (var2 != null) {
                  pl.field_c = a.a(var2, -83);
                }
                var2 = cm.a("tutorial_nine_ball_potting_nine", (byte) 77);
                if (null != var2) {
                  ui.field_N = a.a(var2, 124);
                }
                var2 = cm.a("tutorial_nine_ball_final", (byte) 35);
                if (null != var2) {
                  rc.field_a = a.a(var2, 12);
                }
                var2 = cm.a("ticker_hint_enter_shot_mode", (byte) 39);
                if (null != var2) {
                  ah.field_h = a.a(var2, 123);
                }
                var2 = cm.a("ticker_hint_leave_shot_mode", (byte) 76);
                if (var2 != null) {
                  uf.field_s = a.a(var2, 125);
                }
                var2 = cm.a("ticker_hint_move_cueball", (byte) 76);
                if (null != var2) {
                  up.field_L = a.a(var2, 124);
                }
                var2 = cm.a("ticker_hint_set_power", (byte) 87);
                if (null != var2) {
                  gk.field_lb = a.a(var2, -110);
                }
                var2 = cm.a("ticker_hint_zoom", (byte) 27);
                if (var2 != null) {
                  sm.field_B = a.a(var2, -119);
                }
                var2 = cm.a("ticker_hint_shot_mode_aim", (byte) 105);
                if (var2 != null) {
                  em.field_O = a.a(var2, 127);
                }
                var2 = cm.a("ticker_hint_aim", (byte) 39);
                if (var2 != null) {
                  sa.field_l = a.a(var2, 126);
                }
                var2 = cm.a("ticker_hint_rotate", (byte) 48);
                if (null != var2) {
                  pm.field_o = a.a(var2, 0);
                }
                var2 = cm.a("ticker_hint_shoot", (byte) 73);
                if (var2 != null) {
                  sf.field_z = a.a(var2, 127);
                }
                var2 = cm.a("menu_restart_game", (byte) 33);
                if (null != var2) {
                  dg.field_M = a.a(var2, 126);
                }
                var2 = cm.a("menu_rematch_game", (byte) 103);
                if (var2 != null) {
                  up.field_J = a.a(var2, 123);
                }
                var2 = cm.a("menu_settings", (byte) 19);
                if (null != var2) {
                  ko.field_a = a.a(var2, 126);
                }
                var2 = cm.a("foul_exclamation", (byte) 107);
                if (null != var2) {
                  bq.field_s = a.a(var2, -90);
                }
                var2 = cm.a("player_name_another_shot", (byte) 66);
                if (var2 != null) {
                  a.a(var2, -58);
                }
                var2 = cm.a("player_name_two_shots", (byte) 59);
                if (var2 != null) {
                  gr.field_A = a.a(var2, 125);
                }
                var2 = cm.a("player_name_ball_in_hand", (byte) 44);
                if (null != var2) {
                  uo.field_Ob = a.a(var2, -29);
                }
                var2 = cm.a("player_name_you_have_an_extra_shot", (byte) 42);
                if (var2 != null) {
                  vp.field_e = a.a(var2, 127);
                }
                var2 = cm.a("status_versus", (byte) 55);
                if (var2 != null) {
                  tp.field_a = a.a(var2, 124);
                }
                var2 = cm.a("status_out_of_lives", (byte) 82);
                if (null != var2) {
                  rg.field_l = a.a(var2, 124);
                }
                var2 = cm.a("status_resigned", (byte) 78);
                if (var2 != null) {
                  n.field_Q = a.a(var2, 123);
                }
                var2 = cm.a("status_wants_to_draw", (byte) 79);
                if (var2 != null) {
                  sh.field_R = a.a(var2, 123);
                }
                var2 = cm.a("status_wants_a_rematch", (byte) 30);
                if (var2 != null) {
                  ge.field_n = a.a(var2, 123);
                }
                var2 = cm.a("player_list_first", (byte) 33);
                if (var2 != null) {
                  en.field_e = a.a(var2, -115);
                }
                var2 = cm.a("player_list_middle", (byte) 33);
                if (var2 != null) {
                  bc.field_h = a.a(var2, 125);
                }
                var2 = cm.a("player_list_last", (byte) 43);
                if (var2 != null) {
                  lq.field_N = a.a(var2, 124);
                }
                var2 = cm.a("you_are_group_name", (byte) 31);
                if (null != var2) {
                  rj.field_g = a.a(var2, -14);
                }
                var2 = cm.a("player_is_group_name", (byte) 87);
                if (var2 != null) {
                  sd.field_O = a.a(var2, -39);
                }
                var2 = cm.a("player_x2_are_group_name", (byte) 32);
                if (var2 != null) {
                  of.field_Qb = a.a(var2, 124);
                }
                var2 = cm.a("player_list_are_group_name", (byte) 66);
                if (null != var2) {
                  w.field_c = a.a(var2, -20);
                }
                var2 = cm.a("player_you_x2_are_group_name", (byte) 116);
                if (null != var2) {
                  qq.field_zb = a.a(var2, 127);
                }
                var2 = cm.a("player_you_first_list_are_group_name", (byte) 75);
                if (var2 != null) {
                  ij.field_A = a.a(var2, -20);
                }
                var2 = cm.a("player_x2_have_won", (byte) 78);
                if (null != var2) {
                  gk.field_jb = a.a(var2, 126);
                }
                var2 = cm.a("player_list_have_won", (byte) 61);
                if (var2 != null) {
                  sk.field_e = a.a(var2, 127);
                }
                var2 = cm.a("player_you_x2_have_won", (byte) 97);
                if (null != var2) {
                  nf.field_db = a.a(var2, 123);
                }
                var2 = cm.a("player_you_first_list_have_won", (byte) 88);
                if (var2 != null) {
                  jq.field_h = a.a(var2, 123);
                }
                var2 = cm.a("player_is_offering_rematch", (byte) 33);
                if (null != var2) {
                  a.a(var2, -79);
                }
                var2 = cm.a("player_x2_are_offering_rematch", (byte) 73);
                if (var2 != null) {
                  hp.field_e = a.a(var2, 123);
                }
                var2 = cm.a("player_list_are_offering_rematch", (byte) 95);
                if (var2 != null) {
                  ee.field_a = a.a(var2, 124);
                }
                var2 = cm.a("player_you_x2_are_offering_rematch", (byte) 126);
                if (null != var2) {
                  pq.field_D = a.a(var2, -50);
                }
                var2 = cm.a("player_you_first_list_are_offering_rematch", (byte) 68);
                if (null != var2) {
                  o.field_B = a.a(var2, 127);
                }
                var2 = cm.a("player_is_offering_draw", (byte) 93);
                if (var2 != null) {
                  a.a(var2, -111);
                }
                var2 = cm.a("player_x2_are_offering_draw", (byte) 52);
                if (null != var2) {
                  rg.field_o = a.a(var2, 127);
                }
                var2 = cm.a("player_list_are_offering_draw", (byte) 83);
                if (var2 != null) {
                  fd.field_H = a.a(var2, 126);
                }
                var2 = cm.a("player_you_x2_are_offering_draw", (byte) 108);
                if (var2 != null) {
                  qp.field_bc = a.a(var2, 127);
                }
                var2 = cm.a("player_you_first_list_are_offering_draw", (byte) 107);
                if (var2 != null) {
                  jk.field_f = a.a(var2, -36);
                }
                var2 = cm.a("player_you_are_out", (byte) 70);
                if (null != var2) {
                  vj.field_g = a.a(var2, -128);
                }
                var2 = cm.a("player_is_out", (byte) 28);
                if (var2 != null) {
                  qe.field_F = a.a(var2, 126);
                }
                var2 = cm.a("player_x2_are_out", (byte) 108);
                if (null != var2) {
                  mg.field_a = a.a(var2, 125);
                }
                var2 = cm.a("player_list_are_out", (byte) 105);
                if (null != var2) {
                  jl.field_b = a.a(var2, 125);
                }
                var2 = cm.a("player_you_x2_are_out", (byte) 95);
                if (var2 != null) {
                  sl.field_W = a.a(var2, -96);
                }
                var2 = cm.a("player_you_first_list_are_out", (byte) 29);
                if (var2 != null) {
                  rk.field_e = a.a(var2, 124);
                }
                var2 = cm.a("player_has_resigned", (byte) 55);
                if (null != var2) {
                  a.a(var2, -87);
                }
                var2 = cm.a("player_x2_have_resigned", (byte) 28);
                if (null != var2) {
                  w.field_e = a.a(var2, -52);
                }
                var2 = cm.a("player_list_have_resigned", (byte) 67);
                if (null != var2) {
                  dl.field_i = a.a(var2, -49);
                }
                var2 = cm.a("player_you_x2_have_resigned", (byte) 84);
                if (null != var2) {
                  bl.field_j = a.a(var2, 14);
                }
                var2 = cm.a("player_you_first_list_have_resigned", (byte) 51);
                if (null != var2) {
                  wj.field_U = a.a(var2, 124);
                }
                var2 = cm.a("player_vs_player", (byte) 121);
                if (var2 != null) {
                  w.field_g = a.a(var2, 125);
                }
                var2 = cm.a("player_list_vs_player_list", (byte) 84);
                if (null != var2) {
                  ub.field_o = a.a(var2, 11);
                }
                var2 = cm.a("tutorial_break_try_again", (byte) 115);
                if (var2 != null) {
                  ec.field_k = a.a(var2, 127);
                }
                var2 = cm.a("tutorial_lose", (byte) 92);
                if (null != var2) {
                  ph.field_a = a.a(var2, 126);
                }
                var2 = cm.a("tutorial_lose_eight_ball_game", (byte) 90);
                if (var2 != null) {
                  c.field_a = a.a(var2, -80);
                }
                var2 = cm.a("tutorial_lose_nine_ball_game", (byte) 82);
                if (var2 != null) {
                  cr.field_q = a.a(var2, 126);
                }
                var2 = cm.a("cannot_position_cue_there", (byte) 52);
                if (null != var2) {
                  tn.field_p = a.a(var2, 125);
                }
                var2 = cm.a("cue_cant_go_there", (byte) 82);
                if (null != var2) {
                  jd.field_f = a.a(var2, 124);
                }
                var2 = cm.a("player_x_gained_a_life", (byte) 100);
                if (null != var2) {
                  ad.field_b = a.a(var2, 124);
                }
                var2 = cm.a("player_x_lost_a_life", (byte) 124);
                if (var2 != null) {
                  jk.field_c = a.a(var2, -55);
                }
                var2 = cm.a("player_x_lost_two_lives", (byte) 49);
                if (var2 != null) {
                  oh.field_f = a.a(var2, 127);
                }
                var2 = cm.a("you_gained_a_life", (byte) 101);
                if (var2 != null) {
                  oj.field_u = a.a(var2, -24);
                }
                var2 = cm.a("you_lost_a_life", (byte) 71);
                if (var2 != null) {
                  o.field_D = a.a(var2, 1);
                }
                var2 = cm.a("you_lost_two_lives", (byte) 85);
                if (var2 != null) {
                  jk.field_j = a.a(var2, 124);
                }
                var2 = cm.a("player_x_now_has_n_lives", (byte) 68);
                if (null != var2) {
                  cj.field_U = a.a(var2, 123);
                }
                var2 = cm.a("player_x_is_on_their_last_life", (byte) 67);
                if (var2 != null) {
                  kn.field_f = a.a(var2, -60);
                }
                var2 = cm.a("you_now_have_n_lives", (byte) 30);
                if (var2 != null) {
                  hk.field_q = a.a(var2, -47);
                }
                var2 = cm.a("you_are_on_your_last_life", (byte) 34);
                if (null != var2) {
                  bh.field_d = a.a(var2, 127);
                }
                var2 = cm.a("doubleplusgood_shot,0", (byte) 95);
                if (var2 != null) {
                  wo.field_b[0] = a.a(var2, -37);
                }
                var2 = cm.a("doubleplusgood_shot,1", (byte) 61);
                if (var2 != null) {
                  wo.field_b[1] = a.a(var2, 124);
                }
                var2 = cm.a("plusgood_shot,0", (byte) 103);
                if (null != var2) {
                  pq.field_C[0] = a.a(var2, 123);
                }
                var2 = cm.a("plusgood_shot,1", (byte) 53);
                if (null != var2) {
                  pq.field_C[1] = a.a(var2, 125);
                }
                var2 = cm.a("plusgood_shot,2", (byte) 43);
                if (null != var2) {
                  pq.field_C[2] = a.a(var2, 127);
                }
                var2 = cm.a("plusgood_shot,3", (byte) 25);
                if (var2 != null) {
                  pq.field_C[3] = a.a(var2, 127);
                }
                var2 = cm.a("good_shot,0", (byte) 114);
                if (null != var2) {
                  v.field_k[0] = a.a(var2, 127);
                }
                var2 = cm.a("good_shot,1", (byte) 61);
                if (var2 != null) {
                  v.field_k[1] = a.a(var2, -44);
                }
                var2 = cm.a("good_shot,2", (byte) 45);
                if (null != var2) {
                  v.field_k[2] = a.a(var2, 126);
                }
                var2 = cm.a("ungood_shot,0", (byte) 58);
                if (var2 != null) {
                  qp.field_fc[0] = a.a(var2, 127);
                }
                var2 = cm.a("ungood_shot,1", (byte) 109);
                if (var2 != null) {
                  qp.field_fc[1] = a.a(var2, -128);
                }
                var2 = cm.a("ungood_shot,2", (byte) 53);
                if (null != var2) {
                  qp.field_fc[2] = a.a(var2, 127);
                }
                var2 = cm.a("plusungood_shot,0", (byte) 79);
                if (var2 != null) {
                  he.field_d[0] = a.a(var2, 123);
                }
                var2 = cm.a("plusungood_shot,1", (byte) 40);
                if (var2 != null) {
                  he.field_d[1] = a.a(var2, -68);
                }
                var2 = cm.a("plusungood_shot,2", (byte) 58);
                if (null != var2) {
                  he.field_d[2] = a.a(var2, 124);
                }
                var2 = cm.a("doubleplusungood_shot,0", (byte) 49);
                if (null != var2) {
                  jr.field_l[0] = a.a(var2, -90);
                }
                var2 = cm.a("doubleplusungood_shot,1", (byte) 61);
                if (var2 != null) {
                  jr.field_l[1] = a.a(var2, -9);
                }
                var2 = cm.a("doubleplusungood_shot,2", (byte) 75);
                if (null != var2) {
                  jr.field_l[2] = a.a(var2, 125);
                }
                var2 = cm.a("you_potted_balls_from_each_group", (byte) 49);
                if (null != var2) {
                  a.a(var2, -73);
                }
                var2 = cm.a("which_group_do_you_want", (byte) 77);
                if (var2 != null) {
                  ka.field_u = a.a(var2, -31);
                }
                var2 = cm.a("would_you_like_to_play_or_pass", (byte) 126);
                if (null != var2) {
                  ml.field_g = a.a(var2, -89);
                }
                var2 = cm.a("decision_button_play", (byte) 71);
                if (null != var2) {
                  jf.field_q = a.a(var2, 127);
                }
                var2 = cm.a("decision_button_pass", (byte) 59);
                if (null != var2) {
                  rl.field_i = a.a(var2, 125);
                }
                var2 = cm.a("tooltip_ball_in_hand", (byte) 97);
                if (var2 != null) {
                  jq.field_b = a.a(var2, -128);
                }
                var2 = cm.a("tooltip_break", (byte) 106);
                if (var2 != null) {
                  bo.field_b = a.a(var2, 123);
                }
                var2 = cm.a("tooltip_extra_visit", (byte) 104);
                if (null != var2) {
                  wa.field_ob = a.a(var2, -1);
                }
                var2 = cm.a("tooltip_snookered", (byte) 73);
                if (var2 != null) {
                  tq.field_v = a.a(var2, -32);
                }
                var2 = cm.a("chat_button", (byte) 85);
                if (null != var2) {
                  ua.field_n = a.a(var2, 125);
                }
                var2 = cm.a("end_of_game_press_escape_to_continue", (byte) 48);
                if (var2 != null) {
                  fl.field_m = a.a(var2, 127);
                }
                var2 = cm.a("press_escape_for_options_menu", (byte) 19);
                if (var2 != null) {
                  ke.field_a = a.a(var2, 123);
                }
                var2 = cm.a("time_trial", (byte) 19);
                if (null != var2) {
                  oo.field_c = a.a(var2, 123);
                }
                var2 = cm.a("timer", (byte) 119);
                if (null != var2) {
                  bf.field_e = a.a(var2, -6);
                }
                var2 = cm.a("highscore_header_time", (byte) 114);
                if (var2 != null) {
                  vi.field_b = a.a(var2, 126);
                }
                var2 = cm.a("player_colon", (byte) 92);
                if (null != var2) {
                  vl.field_r = a.a(var2, 125);
                }
                var2 = cm.a("player_colon_fr", (byte) 122);
                if (null != var2) {
                  rc.field_g = a.a(var2, 126);
                }
                var2 = cm.a("time_trial_completed", (byte) 72);
                if (null != var2) {
                  bc.field_a = a.a(var2, -92);
                }
                var2 = cm.a("time_trial_failed", (byte) 62);
                if (var2 != null) {
                  ql.field_b = a.a(var2, 124);
                }
                var2 = cm.a("timer_seconds", (byte) 64);
                if (var2 != null) {
                  a.a(var2, -6);
                }
                var2 = cm.a("timer_seconds_fractions", (byte) 70);
                if (var2 != null) {
                  mp.field_Q = a.a(var2, 126);
                }
                var2 = cm.a("timer_minutes_seconds", (byte) 39);
                if (null != var2) {
                  lq.field_S = a.a(var2, -56);
                }
                var2 = cm.a("timer_minutes_seconds_fractions", (byte) 23);
                if (var2 != null) {
                  qe.field_r = a.a(var2, -17);
                }
                var2 = cm.a("timer_hours_minutes_seconds", (byte) 28);
                if (var2 != null) {
                  jk.field_k = a.a(var2, 126);
                }
                var2 = cm.a("timer_hours_minutes_seconds_fractions", (byte) 76);
                if (null != var2) {
                  vf.field_gb = a.a(var2, -116);
                }
                var2 = cm.a("mouse_y_axis_normal", (byte) 48);
                if (null != var2) {
                  uf.field_K = a.a(var2, 123);
                }
                var2 = cm.a("mouse_y_axis_inverted", (byte) 82);
                if (null != var2) {
                  hb.field_q = a.a(var2, -103);
                }
                var2 = cm.a("menu_time_trial_with_guides", (byte) 94);
                if (null != var2) {
                  qe.field_O = a.a(var2, 2);
                }
                var2 = cm.a("menu_time_trial_without_guides", (byte) 68);
                if (null != var2) {
                  pl.field_e = a.a(var2, 127);
                }
                var2 = cm.a("achievements_only_in_rated", (byte) 28);
                if (var2 != null) {
                  ab.field_a = a.a(var2, -38);
                }
                var2 = cm.a("progress_jungle_bulk", (byte) 58);
                if (var2 != null) {
                  sa.field_g = a.a(var2, -108);
                }
                var2 = cm.a("progress_jungle_finishing", (byte) 49);
                if (var2 != null) {
                  mn.field_d = a.a(var2, 127);
                }
                var2 = cm.a("rated_membersonly", (byte) 84);
                if (null != var2) {
                  tq.field_x = a.a(var2, -23);
                }
                var2 = cm.a("youhavelost", (byte) 44);
                if (null != var2) {
                  nd.field_g = a.a(var2, -92);
                }
                var2 = cm.a("pot_balls_in_any_order_finish_on_black", (byte) 89);
                if (null != var2) {
                  Pool.field_M = a.a(var2, -48);
                }
                var2 = cm.a("keycode_default_up1", (byte) 82);
                if (null != var2) {
                  gp.field_b = 255 & var2[0];
                }
                var2 = cm.a("keycode_default_up2", (byte) 28);
                if (var2 != null) {
                  fl.field_p = var2[0] & 255;
                }
                var2 = cm.a("keycode_default_down1", (byte) 85);
                if (var2 != null) {
                  hm.field_j = var2[0] & 255;
                }
                var2 = cm.a("keycode_default_down2", (byte) 106);
                if (var2 != null) {
                  kr.field_h = 255 & var2[0];
                }
                var2 = cm.a("keycode_default_left1", (byte) 17);
                if (null != var2) {
                  bc.field_f = 255 & var2[0];
                }
                var2 = cm.a("keycode_default_left2", (byte) 113);
                if (var2 != null) {
                  mb.field_a = 255 & var2[0];
                }
                var2 = cm.a("keycode_default_right1", (byte) 38);
                if (null != var2) {
                  gn.field_c = var2[0] & 255;
                }
                var2 = cm.a("keycode_default_right2", (byte) 91);
                if (var2 != null) {
                  di.field_b = 255 & var2[0];
                }
                var2 = cm.a("menu_option_return_to_tutorial", (byte) 126);
                if (var2 != null) {
                  id.field_d = a.a(var2, 126);
                }
                var2 = cm.a("menu_option_end_tutorial", (byte) 26);
                if (null != var2) {
                  bc.field_d = a.a(var2, 126);
                }
                ib.field_u = null;
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
                  throw wm.a((Throwable) ((Object) stackIn_1506_0), ((StringBuilder) (Object) stackIn_1506_1).append(stackIn_1507_2).append(',').append(param1).append(')').toString());
                }
                if (kq.field_k) {
                  var4++;
                  Pool.field_O = var4;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    public static void a(int param0) {
        try {
          field_a = null;
          field_c = (String[][]) null;
          field_f = null;
          field_e = null;
          int var1_int = -103 % ((param0 - 6) / 41);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "qk.B(" + param0 + ')');
        }
    }

    static {
        field_c = new String[][]{new String[]{"60 seconds per shot", "45 seconds per shot", "30 seconds per shot", "20 seconds per shot", "15 seconds per shot", "10 seconds per shot"}, new String[]{"Standard pocket billiards, more commonly known as eight-ball pool.", "Nine-ball pool.", "A most dangerous game of ruthless potting."}, new String[]{"Don't want to listen to the band?", "On the other side of the screen, it all looks so easy.", "This is where Forrestall cashed in.", "Remember your pool-over.", "Houston, we have a pool ball.", "A randomly selected theme."}, new String[]{"Enable aiming assistance.", "Disable aiming assistance (for pool sharks)."}};
        field_g = 0;
    }
}
