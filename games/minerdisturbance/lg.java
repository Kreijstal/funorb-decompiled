/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    static String field_a;
    static String field_b;

    public static void a(byte param0) {
        field_b = null;
        if (param0 <= 73) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "lg.B(" + param0 + ')');
        }
    }

    final static void a(bj param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1680_0;
            StringBuilder stackIn_1680_1;
            String stackIn_1681_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            bj param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(bj initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1680_0 = null;
                this.stackIn_1680_1 = null;
                this.stackIn_1681_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                fa.field_d = param0;
                var2 = lh.b(-1, "caption1");
                if (var2 != null) {
                  tj.field_b = bh.a(var2, 43);
                }
                var2 = lh.b(-1, "caption2");
                if (null != var2) {
                  fb.field_d = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "caption3");
                if (var2 != null) {
                  hd.field_c = bh.a(var2, 71);
                }
                var2 = lh.b(-1, "caption4");
                if (null != var2) {
                  eg.field_g = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "caption5");
                if (var2 != null) {
                  sa.field_r = bh.a(var2, -5);
                }
                var2 = lh.b(-1, "caption6");
                if (var2 != null) {
                  vc.field_u = bh.a(var2, 67);
                }
                var2 = lh.b(-1, "caption7");
                if (var2 != null) {
                  wd.field_b = bh.a(var2, 89);
                }
                var2 = lh.b(-1, "achievement_names,0");
                if (null != var2) {
                  ld.field_A[0] = bh.a(var2, 23);
                }
                var2 = lh.b(-1, "achievement_names,1");
                if (var2 != null) {
                  ld.field_A[1] = bh.a(var2, 66);
                }
                var2 = lh.b(-1, "achievement_names,2");
                if (var2 != null) {
                  ld.field_A[2] = bh.a(var2, 100);
                }
                var2 = lh.b(-1, "achievement_names,3");
                if (var2 != null) {
                  ld.field_A[3] = bh.a(var2, 104);
                }
                var2 = lh.b(-1, "achievement_names,4");
                if (var2 != null) {
                  ld.field_A[4] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_names,5");
                if (var2 != null) {
                  ld.field_A[5] = bh.a(var2, 15);
                }
                var2 = lh.b(-1, "achievement_names,6");
                if (null != var2) {
                  ld.field_A[6] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "achievement_names,7");
                if (var2 != null) {
                  ld.field_A[7] = bh.a(var2, 31);
                }
                var2 = lh.b(-1, "achievement_names,8");
                if (null != var2) {
                  ld.field_A[8] = bh.a(var2, 77);
                }
                var2 = lh.b(-1, "achievement_names,9");
                if (var2 != null) {
                  ld.field_A[9] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_names,10");
                if (null != var2) {
                  ld.field_A[10] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "achievement_names,11");
                if (null != var2) {
                  ld.field_A[11] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "achievement_names,12");
                if (null != var2) {
                  ld.field_A[12] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "achievement_names,13");
                if (var2 != null) {
                  ld.field_A[13] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "achievement_names,14");
                if (null != var2) {
                  ld.field_A[14] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "achievement_names,15");
                if (null != var2) {
                  ld.field_A[15] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "achievement_names,16");
                if (var2 != null) {
                  ld.field_A[16] = bh.a(var2, 123);
                }
                var2 = lh.b(-1, "achievement_names,17");
                if (var2 != null) {
                  ld.field_A[17] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_names,18");
                if (var2 != null) {
                  ld.field_A[18] = bh.a(var2, 13);
                }
                var2 = lh.b(-1, "achievement_names,19");
                if (null != var2) {
                  ld.field_A[19] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_names,20");
                if (null != var2) {
                  ld.field_A[20] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "achievement_names,21");
                if (var2 != null) {
                  ld.field_A[21] = bh.a(var2, 66);
                }
                var2 = lh.b(-1, "achievement_names,22");
                if (var2 != null) {
                  ld.field_A[22] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_names,23");
                if (var2 != null) {
                  ld.field_A[23] = bh.a(var2, 59);
                }
                var2 = lh.b(-1, "achievement_names,24");
                if (null != var2) {
                  ld.field_A[24] = bh.a(var2, 118);
                }
                var2 = lh.b(-1, "achievement_names,25");
                if (var2 != null) {
                  ld.field_A[25] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_names,26");
                if (null != var2) {
                  ld.field_A[26] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "achievement_names,27");
                if (var2 != null) {
                  ld.field_A[27] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "achievement_names,28");
                if (var2 != null) {
                  ld.field_A[28] = bh.a(var2, 32);
                }
                var2 = lh.b(-1, "achievement_names,29");
                if (var2 != null) {
                  ld.field_A[29] = bh.a(var2, 98);
                }
                var2 = lh.b(-1, "achievement_names,30");
                if (null != var2) {
                  ld.field_A[30] = bh.a(var2, 71);
                }
                var2 = lh.b(-1, "achievement_names,31");
                if (null != var2) {
                  ld.field_A[31] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "achievement_names,32");
                if (null != var2) {
                  ld.field_A[32] = bh.a(var2, 92);
                }
                var2 = lh.b(-1, "achievement_names,33");
                if (null != var2) {
                  ld.field_A[33] = bh.a(var2, 3);
                }
                var2 = lh.b(-1, "achievement_criteria,0");
                if (null != var2) {
                  fb.field_g[0] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_criteria,1");
                if (null != var2) {
                  fb.field_g[1] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "achievement_criteria,2");
                if (var2 != null) {
                  fb.field_g[2] = bh.a(var2, 0);
                }
                var2 = lh.b(-1, "achievement_criteria,3");
                if (null != var2) {
                  fb.field_g[3] = bh.a(var2, 105);
                }
                var2 = lh.b(-1, "achievement_criteria,4");
                if (null != var2) {
                  fb.field_g[4] = bh.a(var2, 31);
                }
                var2 = lh.b(-1, "achievement_criteria,5");
                if (var2 != null) {
                  fb.field_g[5] = bh.a(var2, 93);
                }
                var2 = lh.b(-1, "achievement_criteria,6");
                if (var2 != null) {
                  fb.field_g[6] = bh.a(var2, 123);
                }
                var2 = lh.b(-1, "achievement_criteria,7");
                if (null != var2) {
                  fb.field_g[7] = bh.a(var2, 82);
                }
                var2 = lh.b(-1, "achievement_criteria,8");
                if (null != var2) {
                  fb.field_g[8] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "achievement_criteria,9");
                if (null != var2) {
                  fb.field_g[9] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "achievement_criteria,10");
                if (var2 != null) {
                  fb.field_g[10] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_criteria,11");
                if (var2 != null) {
                  fb.field_g[11] = bh.a(var2, 101);
                }
                var2 = lh.b(-1, "achievement_criteria,12");
                if (null != var2) {
                  fb.field_g[12] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "achievement_criteria,13");
                if (var2 != null) {
                  fb.field_g[13] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "achievement_criteria,14");
                if (null != var2) {
                  fb.field_g[14] = bh.a(var2, 7);
                }
                var2 = lh.b(-1, "achievement_criteria,15");
                if (var2 != null) {
                  fb.field_g[15] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "achievement_criteria,16");
                if (var2 != null) {
                  fb.field_g[16] = bh.a(var2, -8);
                }
                var2 = lh.b(-1, "achievement_criteria,17");
                if (var2 != null) {
                  fb.field_g[17] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "achievement_criteria,18");
                if (var2 != null) {
                  fb.field_g[18] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "achievement_criteria,19");
                if (null != var2) {
                  fb.field_g[19] = bh.a(var2, 104);
                }
                var2 = lh.b(-1, "achievement_criteria,20");
                if (null != var2) {
                  fb.field_g[20] = bh.a(var2, 71);
                }
                var2 = lh.b(-1, "achievement_criteria,21");
                if (var2 != null) {
                  fb.field_g[21] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "achievement_criteria,22");
                if (var2 != null) {
                  fb.field_g[22] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "achievement_criteria,23");
                if (var2 != null) {
                  fb.field_g[23] = bh.a(var2, 99);
                }
                var2 = lh.b(-1, "achievement_criteria,24");
                if (null != var2) {
                  fb.field_g[24] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_criteria,25");
                if (null != var2) {
                  fb.field_g[25] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "achievement_criteria,26");
                if (var2 != null) {
                  fb.field_g[26] = bh.a(var2, 107);
                }
                var2 = lh.b(-1, "achievement_criteria,27");
                if (null != var2) {
                  fb.field_g[27] = bh.a(var2, 88);
                }
                var2 = lh.b(-1, "achievement_criteria,28");
                if (var2 != null) {
                  fb.field_g[28] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "achievement_criteria,29");
                if (null != var2) {
                  fb.field_g[29] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "achievement_criteria,30");
                if (var2 != null) {
                  fb.field_g[30] = bh.a(var2, 85);
                }
                var2 = lh.b(-1, "achievement_criteria,31");
                if (null != var2) {
                  fb.field_g[31] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "achievement_criteria,32");
                if (var2 != null) {
                  fb.field_g[32] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_criteria,33");
                if (null != var2) {
                  fb.field_g[33] = bh.a(var2, 122);
                }
                var2 = lh.b(-1, "achievement_completion,0");
                if (null != var2) {
                  en.field_a[0] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "achievement_completion,1");
                if (null != var2) {
                  en.field_a[1] = bh.a(var2, -1);
                }
                var2 = lh.b(-1, "achievement_completion,2");
                if (var2 != null) {
                  en.field_a[2] = bh.a(var2, 123);
                }
                var2 = lh.b(-1, "achievement_completion,3");
                if (var2 != null) {
                  en.field_a[3] = bh.a(var2, 45);
                }
                var2 = lh.b(-1, "achievement_completion,4");
                if (var2 != null) {
                  en.field_a[4] = bh.a(var2, 114);
                }
                var2 = lh.b(-1, "achievement_completion,5");
                if (null != var2) {
                  en.field_a[5] = bh.a(var2, 72);
                }
                var2 = lh.b(-1, "achievement_completion,6");
                if (var2 != null) {
                  en.field_a[6] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_completion,7");
                if (var2 != null) {
                  en.field_a[7] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "achievement_completion,8");
                if (null != var2) {
                  en.field_a[8] = bh.a(var2, 29);
                }
                var2 = lh.b(-1, "achievement_completion,9");
                if (var2 != null) {
                  en.field_a[9] = bh.a(var2, 119);
                }
                var2 = lh.b(-1, "achievement_completion,11");
                if (null != var2) {
                  en.field_a[11] = bh.a(var2, 11);
                }
                var2 = lh.b(-1, "achievement_completion,12");
                if (null != var2) {
                  en.field_a[12] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "achievement_completion,13");
                if (null != var2) {
                  en.field_a[13] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "achievement_completion,14");
                if (var2 != null) {
                  en.field_a[14] = bh.a(var2, 109);
                }
                var2 = lh.b(-1, "achievement_completion,15");
                if (var2 != null) {
                  en.field_a[15] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "achievement_completion,16");
                if (null != var2) {
                  en.field_a[16] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "achievement_completion,17");
                if (null != var2) {
                  en.field_a[17] = bh.a(var2, 95);
                }
                var2 = lh.b(-1, "achievement_completion,18");
                if (null != var2) {
                  en.field_a[18] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "achievement_completion,19");
                if (var2 != null) {
                  en.field_a[19] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "achievement_completion,21");
                if (null != var2) {
                  en.field_a[21] = bh.a(var2, 57);
                }
                var2 = lh.b(-1, "achievement_completion,24");
                if (var2 != null) {
                  en.field_a[24] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_completion,25");
                if (null != var2) {
                  en.field_a[25] = bh.a(var2, 67);
                }
                var2 = lh.b(-1, "achievement_completion,26");
                if (var2 != null) {
                  en.field_a[26] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "achievement_completion,27");
                if (var2 != null) {
                  en.field_a[27] = bh.a(var2, 97);
                }
                var2 = lh.b(-1, "achievement_completion,28");
                if (null != var2) {
                  en.field_a[28] = bh.a(var2, 68);
                }
                var2 = lh.b(-1, "achievement_completion,31");
                if (null != var2) {
                  en.field_a[31] = bh.a(var2, 95);
                }
                var2 = lh.b(-1, "achievement_completion,33");
                if (var2 != null) {
                  en.field_a[33] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "noAchievements");
                if (var2 != null) {
                  cn.field_K = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "obscured");
                if (null != var2) {
                  ge.field_b = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "resetTips");
                if (null != var2) {
                  ee.field_H = bh.a(var2, 105);
                }
                var2 = lh.b(-1, "tips");
                if (null != var2) {
                  gd.field_t = bh.a(var2, 8);
                }
                var2 = lh.b(-1, "login");
                if (var2 != null) {
                  dn.field_n = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "INSTRUCTION,0,0");
                if (null != var2) {
                  ol.field_b[0][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "INSTRUCTION,0,1");
                if (var2 != null) {
                  ol.field_b[0][1] = bh.a(var2, 56);
                }
                var2 = lh.b(-1, "INSTRUCTION,0,2");
                if (var2 != null) {
                  ol.field_b[0][2] = bh.a(var2, 63);
                }
                var2 = lh.b(-1, "INSTRUCTION,0,3");
                if (var2 != null) {
                  ol.field_b[0][3] = bh.a(var2, -6);
                }
                var2 = lh.b(-1, "INSTRUCTION,0,4");
                if (null != var2) {
                  ol.field_b[0][4] = bh.a(var2, 109);
                }
                if (param1 >= -35) {
                  lg.a((bj) null, -75);
                }
                var2 = lh.b(-1, "INSTRUCTION,1,0");
                if (var2 != null) {
                  ol.field_b[1][0] = bh.a(var2, 12);
                }
                var2 = lh.b(-1, "INSTRUCTION,1,1");
                if (var2 != null) {
                  ol.field_b[1][1] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION,1,2");
                if (var2 != null) {
                  ol.field_b[1][2] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION,1,3");
                if (var2 != null) {
                  ol.field_b[1][3] = bh.a(var2, 41);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,0");
                if (null != var2) {
                  ol.field_b[2][0] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,1");
                if (var2 != null) {
                  ol.field_b[2][1] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,2");
                if (var2 != null) {
                  ol.field_b[2][2] = bh.a(var2, 8);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,3");
                if (null != var2) {
                  ol.field_b[2][3] = bh.a(var2, 45);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,4");
                if (var2 != null) {
                  ol.field_b[2][4] = bh.a(var2, 126);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,5");
                if (null != var2) {
                  ol.field_b[2][5] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "INSTRUCTION,2,6");
                if (null != var2) {
                  ol.field_b[2][6] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "INSTRUCTION,3,0");
                if (var2 != null) {
                  ol.field_b[3][0] = bh.a(var2, 88);
                }
                var2 = lh.b(-1, "INSTRUCTION,4,0");
                if (null != var2) {
                  ol.field_b[4][0] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION,4,1");
                if (null != var2) {
                  ol.field_b[4][1] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "INSTRUCTION,4,2");
                if (null != var2) {
                  ol.field_b[4][2] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "INSTRUCTION,5,0");
                if (null != var2) {
                  ol.field_b[5][0] = bh.a(var2, 81);
                }
                var2 = lh.b(-1, "INSTRUCTION,5,1");
                if (var2 != null) {
                  ol.field_b[5][1] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "INSTRUCTION,5,2");
                if (null != var2) {
                  ol.field_b[5][2] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION,5,3");
                if (var2 != null) {
                  ol.field_b[5][3] = bh.a(var2, 46);
                }
                var2 = lh.b(-1, "INSTRUCTION,5,4");
                if (null != var2) {
                  ol.field_b[5][4] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "INSTRUCTION,6,0");
                if (null != var2) {
                  ol.field_b[6][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,0");
                if (var2 != null) {
                  pf.field_f[0] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,1");
                if (var2 != null) {
                  pf.field_f[1] = bh.a(var2, 98);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,2");
                if (null != var2) {
                  pf.field_f[2] = bh.a(var2, 78);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,3");
                if (var2 != null) {
                  pf.field_f[3] = bh.a(var2, 58);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,4");
                if (null != var2) {
                  pf.field_f[4] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,5");
                if (null != var2) {
                  pf.field_f[5] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "INSTRUCTION_TITLES,6");
                if (null != var2) {
                  pf.field_f[6] = bh.a(var2, 83);
                }
                var2 = lh.b(-1, "notLoggedIn");
                if (var2 != null) {
                  ci.field_j = bh.a(var2, -1);
                }
                var2 = lh.b(-1, "loseProgress");
                if (var2 != null) {
                  bf.field_a = bh.a(var2, 6);
                }
                var2 = lh.b(-1, "rankingsStrings,0,0");
                if (null != var2) {
                  dh.field_c[0][0] = bh.a(var2, 126);
                }
                var2 = lh.b(-1, "rankingsStrings,0,1");
                if (var2 != null) {
                  dh.field_c[0][1] = bh.a(var2, 94);
                }
                var2 = lh.b(-1, "rankingsStrings,0,2");
                if (var2 != null) {
                  dh.field_c[0][2] = bh.a(var2, 53);
                }
                var2 = lh.b(-1, "rankingsStrings,0,3");
                if (null != var2) {
                  dh.field_c[0][3] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "rankingsStrings,0,4");
                if (var2 != null) {
                  dh.field_c[0][4] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "rankingsStrings,0,5");
                if (var2 != null) {
                  dh.field_c[0][5] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "rankingsStrings,0,6");
                if (null != var2) {
                  dh.field_c[0][6] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "rankingsStrings,0,7");
                if (var2 != null) {
                  dh.field_c[0][7] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "rankingsStrings,0,8");
                if (var2 != null) {
                  dh.field_c[0][8] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "rankingsStrings,0,9");
                if (var2 != null) {
                  dh.field_c[0][9] = bh.a(var2, 82);
                }
                var2 = lh.b(-1, "rankingsStrings,1,0");
                if (null != var2) {
                  dh.field_c[1][0] = bh.a(var2, 40);
                }
                var2 = lh.b(-1, "rankingsStrings,1,1");
                if (var2 != null) {
                  dh.field_c[1][1] = bh.a(var2, 26);
                }
                var2 = lh.b(-1, "rankingsStrings,1,2");
                if (var2 != null) {
                  dh.field_c[1][2] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "rankingsStrings,1,3");
                if (var2 != null) {
                  dh.field_c[1][3] = bh.a(var2, 68);
                }
                var2 = lh.b(-1, "rankingsStrings,1,4");
                if (null != var2) {
                  dh.field_c[1][4] = bh.a(var2, 83);
                }
                var2 = lh.b(-1, "rankingsStrings,1,5");
                if (null != var2) {
                  dh.field_c[1][5] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "rankingsStrings,1,6");
                if (var2 != null) {
                  dh.field_c[1][6] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "rankingsStrings,1,7");
                if (var2 != null) {
                  dh.field_c[1][7] = bh.a(var2, 96);
                }
                var2 = lh.b(-1, "rankingsStrings,1,8");
                if (var2 != null) {
                  dh.field_c[1][8] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "rankingsStrings,1,9");
                if (var2 != null) {
                  dh.field_c[1][9] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "rankingWorm");
                if (null != var2) {
                  gn.field_b = bh.a(var2, 71);
                }
                var2 = lh.b(-1, "rankingMiner");
                if (null != var2) {
                  v.field_a = bh.a(var2, 23);
                }
                var2 = lh.b(-1, "rankingSplasher");
                if (null != var2) {
                  se.field_J = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "rankingMeddling");
                if (var2 != null) {
                  wk.field_b = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "rankingMacho");
                if (var2 != null) {
                  dl.field_b = bh.a(var2, 58);
                }
                var2 = lh.b(-1, "rankingMaestro");
                if (var2 != null) {
                  ck.field_b = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "rankingMega");
                if (var2 != null) {
                  bn.field_a = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "rankingMagma");
                if (null != var2) {
                  qm.field_n = bh.a(var2, 52);
                }
                var2 = lh.b(-1, "rankingPitLord");
                if (var2 != null) {
                  fn.field_r = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "rankingMhor");
                if (null != var2) {
                  qh.field_b = bh.a(var2, 58);
                }
                var2 = lh.b(-1, "rankingFrozen");
                if (null != var2) {
                  wi.field_z = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "rankingInsipid");
                if (null != var2) {
                  fm.field_O = bh.a(var2, 15);
                }
                var2 = lh.b(-1, "rankingCaver");
                if (null != var2) {
                  te.field_b = bh.a(var2, 81);
                }
                var2 = lh.b(-1, "rankingDiver");
                if (null != var2) {
                  ca.field_j = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "rankingBreaker");
                if (var2 != null) {
                  bh.field_ab = bh.a(var2, 127);
                }
                var2 = lh.b(-1, "rankingBoreal");
                if (null != var2) {
                  hm.field_N = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "rankingArcticExplorer");
                if (null != var2) {
                  ti.field_L = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "rankingIceman");
                if (null != var2) {
                  le.field_c = bh.a(var2, 88);
                }
                var2 = lh.b(-1, "rankingPolarPrince");
                if (null != var2) {
                  bd.field_a = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "rankingKingOfTheSnowMen");
                if (null != var2) {
                  ug.field_b = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,0,0");
                if (null != var2) {
                  sl.field_u[0][0] = bh.a(var2, 85);
                }
                var2 = lh.b(-1, "deathstrings,0,1");
                if (var2 != null) {
                  sl.field_u[0][1] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,0,2");
                if (null != var2) {
                  sl.field_u[0][2] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,0,3");
                if (null != var2) {
                  sl.field_u[0][3] = bh.a(var2, 102);
                }
                var2 = lh.b(-1, "deathstrings,0,4");
                if (null != var2) {
                  sl.field_u[0][4] = bh.a(var2, 66);
                }
                var2 = lh.b(-1, "deathstrings,0,5");
                if (null != var2) {
                  sl.field_u[0][5] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,0,6");
                if (null != var2) {
                  sl.field_u[0][6] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "deathstrings,0,7");
                if (null != var2) {
                  sl.field_u[0][7] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathstrings,0,8");
                if (null != var2) {
                  sl.field_u[0][8] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,0,9");
                if (var2 != null) {
                  sl.field_u[0][9] = bh.a(var2, 26);
                }
                var2 = lh.b(-1, "deathstrings,1,0");
                if (var2 != null) {
                  sl.field_u[1][0] = bh.a(var2, -1);
                }
                var2 = lh.b(-1, "deathstrings,1,1");
                if (null != var2) {
                  sl.field_u[1][1] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,1,2");
                if (var2 != null) {
                  sl.field_u[1][2] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,1,3");
                if (var2 != null) {
                  sl.field_u[1][3] = bh.a(var2, 49);
                }
                var2 = lh.b(-1, "deathstrings,1,4");
                if (null != var2) {
                  sl.field_u[1][4] = bh.a(var2, 4);
                }
                var2 = lh.b(-1, "deathstrings,1,5");
                if (null != var2) {
                  sl.field_u[1][5] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,1,6");
                if (var2 != null) {
                  sl.field_u[1][6] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,1,7");
                if (var2 != null) {
                  sl.field_u[1][7] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,1,8");
                if (null != var2) {
                  sl.field_u[1][8] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,2,0");
                if (null != var2) {
                  sl.field_u[2][0] = bh.a(var2, 8);
                }
                var2 = lh.b(-1, "deathstrings,2,1");
                if (null != var2) {
                  sl.field_u[2][1] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,2,2");
                if (null != var2) {
                  sl.field_u[2][2] = bh.a(var2, 82);
                }
                var2 = lh.b(-1, "deathstrings,2,3");
                if (var2 != null) {
                  sl.field_u[2][3] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,2,4");
                if (null != var2) {
                  sl.field_u[2][4] = bh.a(var2, 2);
                }
                var2 = lh.b(-1, "deathstrings,2,5");
                if (var2 != null) {
                  sl.field_u[2][5] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,2,6");
                if (null != var2) {
                  sl.field_u[2][6] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "deathstrings,3,0");
                if (var2 != null) {
                  sl.field_u[3][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,3,1");
                if (var2 != null) {
                  sl.field_u[3][1] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,3,2");
                if (null != var2) {
                  sl.field_u[3][2] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "deathstrings,3,3");
                if (null != var2) {
                  sl.field_u[3][3] = bh.a(var2, 65);
                }
                var2 = lh.b(-1, "deathstrings,3,4");
                if (var2 != null) {
                  sl.field_u[3][4] = bh.a(var2, 30);
                }
                var2 = lh.b(-1, "deathstrings,3,5");
                if (var2 != null) {
                  sl.field_u[3][5] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,3,6");
                if (null != var2) {
                  sl.field_u[3][6] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,3,7");
                if (null != var2) {
                  sl.field_u[3][7] = bh.a(var2, 114);
                }
                var2 = lh.b(-1, "deathstrings,3,8");
                if (var2 != null) {
                  sl.field_u[3][8] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,3,9");
                if (null != var2) {
                  sl.field_u[3][9] = bh.a(var2, 83);
                }
                var2 = lh.b(-1, "deathstrings,4,0");
                if (null != var2) {
                  sl.field_u[4][0] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,4,1");
                if (var2 != null) {
                  sl.field_u[4][1] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,4,2");
                if (var2 != null) {
                  sl.field_u[4][2] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,4,3");
                if (null != var2) {
                  sl.field_u[4][3] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "deathstrings,4,4");
                if (var2 != null) {
                  sl.field_u[4][4] = bh.a(var2, 95);
                }
                var2 = lh.b(-1, "deathstrings,4,5");
                if (null != var2) {
                  sl.field_u[4][5] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,4,6");
                if (null != var2) {
                  sl.field_u[4][6] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,5,0");
                if (null != var2) {
                  sl.field_u[5][0] = bh.a(var2, -5);
                }
                var2 = lh.b(-1, "deathstrings,5,1");
                if (null != var2) {
                  sl.field_u[5][1] = bh.a(var2, -124);
                }
            }
            void runChunk1() throws java.lang.RuntimeException {
                var2 = lh.b(-1, "deathstrings,5,2");
                if (var2 != null) {
                  sl.field_u[5][2] = bh.a(var2, 54);
                }
                var2 = lh.b(-1, "deathstrings,5,3");
                if (null != var2) {
                  sl.field_u[5][3] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,5,4");
                if (var2 != null) {
                  sl.field_u[5][4] = bh.a(var2, 7);
                }
                var2 = lh.b(-1, "deathstrings,5,5");
                if (null != var2) {
                  sl.field_u[5][5] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,5,6");
                if (null != var2) {
                  sl.field_u[5][6] = bh.a(var2, 80);
                }
                var2 = lh.b(-1, "deathstrings,5,7");
                if (var2 != null) {
                  sl.field_u[5][7] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,5,8");
                if (var2 != null) {
                  sl.field_u[5][8] = bh.a(var2, 7);
                }
                var2 = lh.b(-1, "deathstrings,6,0");
                if (var2 != null) {
                  sl.field_u[6][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,6,1");
                if (var2 != null) {
                  sl.field_u[6][1] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,6,2");
                if (null != var2) {
                  sl.field_u[6][2] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,6,3");
                if (var2 != null) {
                  sl.field_u[6][3] = bh.a(var2, 38);
                }
                var2 = lh.b(-1, "deathstrings,6,4");
                if (null != var2) {
                  sl.field_u[6][4] = bh.a(var2, 94);
                }
                var2 = lh.b(-1, "deathstrings,6,5");
                if (var2 != null) {
                  sl.field_u[6][5] = bh.a(var2, 120);
                }
                var2 = lh.b(-1, "deathstrings,6,6");
                if (null != var2) {
                  sl.field_u[6][6] = bh.a(var2, 82);
                }
                var2 = lh.b(-1, "deathstrings,6,7");
                if (var2 != null) {
                  sl.field_u[6][7] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,6,8");
                if (null != var2) {
                  sl.field_u[6][8] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,6,9");
                if (null != var2) {
                  sl.field_u[6][9] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "deathstrings,6,10");
                if (var2 != null) {
                  sl.field_u[6][10] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,6,11");
                if (var2 != null) {
                  sl.field_u[6][11] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,7,0");
                if (null != var2) {
                  sl.field_u[7][0] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "deathstrings,7,1");
                if (var2 != null) {
                  sl.field_u[7][1] = bh.a(var2, 29);
                }
                var2 = lh.b(-1, "deathstrings,7,2");
                if (null != var2) {
                  sl.field_u[7][2] = bh.a(var2, 107);
                }
                var2 = lh.b(-1, "deathstrings,7,3");
                if (var2 != null) {
                  sl.field_u[7][3] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,7,4");
                if (var2 != null) {
                  sl.field_u[7][4] = bh.a(var2, 6);
                }
                var2 = lh.b(-1, "deathstrings,7,5");
                if (null != var2) {
                  sl.field_u[7][5] = bh.a(var2, 87);
                }
                var2 = lh.b(-1, "deathstrings,7,6");
                if (null != var2) {
                  sl.field_u[7][6] = bh.a(var2, 50);
                }
                var2 = lh.b(-1, "deathstrings,7,7");
                if (var2 != null) {
                  sl.field_u[7][7] = bh.a(var2, 84);
                }
                var2 = lh.b(-1, "deathstrings,7,8");
                if (null != var2) {
                  sl.field_u[7][8] = bh.a(var2, 42);
                }
                var2 = lh.b(-1, "deathstrings,8,0");
                if (null != var2) {
                  sl.field_u[8][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,8,1");
                if (var2 != null) {
                  sl.field_u[8][1] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "deathstrings,8,2");
                if (null != var2) {
                  sl.field_u[8][2] = bh.a(var2, 110);
                }
                var2 = lh.b(-1, "deathstrings,8,3");
                if (null != var2) {
                  sl.field_u[8][3] = bh.a(var2, 19);
                }
                var2 = lh.b(-1, "deathstrings,8,4");
                if (null != var2) {
                  sl.field_u[8][4] = bh.a(var2, 27);
                }
                var2 = lh.b(-1, "deathstrings,8,5");
                if (var2 != null) {
                  sl.field_u[8][5] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,8,6");
                if (null != var2) {
                  sl.field_u[8][6] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,8,7");
                if (var2 != null) {
                  sl.field_u[8][7] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "deathstrings,8,8");
                if (null != var2) {
                  sl.field_u[8][8] = bh.a(var2, 82);
                }
                var2 = lh.b(-1, "deathstrings,8,9");
                if (null != var2) {
                  sl.field_u[8][9] = bh.a(var2, 10);
                }
                var2 = lh.b(-1, "deathstrings,8,10");
                if (null != var2) {
                  sl.field_u[8][10] = bh.a(var2, 99);
                }
                var2 = lh.b(-1, "deathstrings,9,0");
                if (var2 != null) {
                  sl.field_u[9][0] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,9,1");
                if (var2 != null) {
                  sl.field_u[9][1] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,9,2");
                if (var2 != null) {
                  sl.field_u[9][2] = bh.a(var2, 18);
                }
                var2 = lh.b(-1, "deathstrings,9,3");
                if (null != var2) {
                  sl.field_u[9][3] = bh.a(var2, 12);
                }
                var2 = lh.b(-1, "deathstrings,9,4");
                if (var2 != null) {
                  sl.field_u[9][4] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,9,5");
                if (var2 != null) {
                  sl.field_u[9][5] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,9,6");
                if (null != var2) {
                  sl.field_u[9][6] = bh.a(var2, 49);
                }
                var2 = lh.b(-1, "deathstrings,10,0");
                if (null != var2) {
                  sl.field_u[10][0] = bh.a(var2, 86);
                }
                var2 = lh.b(-1, "deathstrings,10,1");
                if (null != var2) {
                  sl.field_u[10][1] = bh.a(var2, 106);
                }
                var2 = lh.b(-1, "deathstrings,10,2");
                if (var2 != null) {
                  sl.field_u[10][2] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathstrings,10,3");
                if (var2 != null) {
                  sl.field_u[10][3] = bh.a(var2, -10);
                }
                var2 = lh.b(-1, "deathstrings,10,4");
                if (null != var2) {
                  sl.field_u[10][4] = bh.a(var2, 46);
                }
                var2 = lh.b(-1, "deathstrings,10,5");
                if (var2 != null) {
                  sl.field_u[10][5] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathstrings,10,6");
                if (null != var2) {
                  sl.field_u[10][6] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,10,7");
                if (null != var2) {
                  sl.field_u[10][7] = bh.a(var2, 105);
                }
                var2 = lh.b(-1, "deathstrings,10,8");
                if (var2 != null) {
                  sl.field_u[10][8] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathstrings,11,0");
                if (null != var2) {
                  sl.field_u[11][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathstrings,11,1");
                if (var2 != null) {
                  sl.field_u[11][1] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "deathstrings,11,2");
                if (null != var2) {
                  sl.field_u[11][2] = bh.a(var2, 102);
                }
                var2 = lh.b(-1, "deathstrings,11,3");
                if (null != var2) {
                  sl.field_u[11][3] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,11,4");
                if (var2 != null) {
                  sl.field_u[11][4] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "deathstrings,11,5");
                if (null != var2) {
                  sl.field_u[11][5] = bh.a(var2, 65);
                }
                var2 = lh.b(-1, "deathstrings,11,6");
                if (var2 != null) {
                  sl.field_u[11][6] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathstrings,11,7");
                if (var2 != null) {
                  sl.field_u[11][7] = bh.a(var2, 74);
                }
                var2 = lh.b(-1, "deathstrings,11,8");
                if (var2 != null) {
                  sl.field_u[11][8] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "deathstrings,12,0");
                if (null != var2) {
                  sl.field_u[12][0] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "deathstrings,12,1");
                if (var2 != null) {
                  sl.field_u[12][1] = bh.a(var2, 106);
                }
                var2 = lh.b(-1, "deathstrings,12,2");
                if (null != var2) {
                  sl.field_u[12][2] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathstrings,12,3");
                if (null != var2) {
                  sl.field_u[12][3] = bh.a(var2, 108);
                }
                var2 = lh.b(-1, "deathstrings,12,4");
                if (null != var2) {
                  sl.field_u[12][4] = bh.a(var2, 119);
                }
                var2 = lh.b(-1, "deathstrings,12,5");
                if (null != var2) {
                  sl.field_u[12][5] = bh.a(var2, 18);
                }
                var2 = lh.b(-1, "deathstrings,12,6");
                if (var2 != null) {
                  sl.field_u[12][6] = bh.a(var2, 50);
                }
                var2 = lh.b(-1, "deathstrings,13,0");
                if (null != var2) {
                  sl.field_u[13][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,13,1");
                if (var2 != null) {
                  sl.field_u[13][1] = bh.a(var2, 77);
                }
                var2 = lh.b(-1, "deathstrings,13,2");
                if (null != var2) {
                  sl.field_u[13][2] = bh.a(var2, 102);
                }
                var2 = lh.b(-1, "deathstrings,13,3");
                if (null != var2) {
                  sl.field_u[13][3] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathstrings,13,4");
                if (null != var2) {
                  sl.field_u[13][4] = bh.a(var2, 73);
                }
                var2 = lh.b(-1, "deathstrings,13,5");
                if (var2 != null) {
                  sl.field_u[13][5] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,13,6");
                if (var2 != null) {
                  sl.field_u[13][6] = bh.a(var2, 49);
                }
                var2 = lh.b(-1, "deathstrings,14,0");
                if (null != var2) {
                  sl.field_u[14][0] = bh.a(var2, 1);
                }
                var2 = lh.b(-1, "deathstrings,14,1");
                if (null != var2) {
                  sl.field_u[14][1] = bh.a(var2, 18);
                }
                var2 = lh.b(-1, "deathstrings,14,2");
                if (var2 != null) {
                  sl.field_u[14][2] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "deathstrings,14,3");
                if (var2 != null) {
                  sl.field_u[14][3] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "deathstrings,14,4");
                if (var2 != null) {
                  sl.field_u[14][4] = bh.a(var2, 122);
                }
                var2 = lh.b(-1, "deathstrings,14,5");
                if (null != var2) {
                  sl.field_u[14][5] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathCauseCrushed");
                if (var2 != null) {
                  nc.field_b = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "deathCauseDrowned");
                if (var2 != null) {
                  jg.field_k = bh.a(var2, 15);
                }
                var2 = lh.b(-1, "deathCauseDrownedInOil");
                if (null != var2) {
                  jl.field_bb = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "deathCauseEaten");
                if (var2 != null) {
                  r.field_b = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "deathCauseExplosion");
                if (var2 != null) {
                  hf.field_s = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "deathCauseLava");
                if (null != var2) {
                  pb.field_z = bh.a(var2, 24);
                }
                var2 = lh.b(-1, "deathCausePoison");
                if (var2 != null) {
                  df.field_c = bh.a(var2, 34);
                }
                var2 = lh.b(-1, "deathCauseQuit");
                if (null != var2) {
                  hh.field_d = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathCauseSurvived");
                if (null != var2) {
                  ok.field_a = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "deathCauseFrozen");
                if (var2 != null) {
                  dh.field_a = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathCauseFrozenInBlock");
                if (null != var2) {
                  vk.field_d = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "deathCauseEatenByPinniped");
                if (null != var2) {
                  rd.field_d = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "deathCauseFried");
                if (null != var2) {
                  hl.field_c = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "deathCauseExplodedJetpack");
                if (null != var2) {
                  mg.field_c = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "deathEatenByWorm");
                if (var2 != null) {
                  nd.field_a = bh.a(var2, 113);
                }
                var2 = lh.b(-1, "deathCauseDefault");
                if (var2 != null) {
                  mc.field_z = bh.a(var2, 51);
                }
                var2 = lh.b(-1, "achievementsSavedIfLogin");
                if (var2 != null) {
                  kc.field_c = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "someMiner");
                if (var2 != null) {
                  lj.field_s = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "anon");
                if (var2 != null) {
                  qf.field_q = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "multi");
                if (var2 != null) {
                  uh.field_f = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "escaped");
                if (var2 != null) {
                  an.field_g = bh.a(var2, 95);
                }
                var2 = lh.b(-1, "finalScore");
                if (null != var2) {
                  km.field_c = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "danger");
                if (null != var2) {
                  oe.field_f = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "enterToContinue");
                if (var2 != null) {
                  ni.field_b = bh.a(var2, 76);
                }
                var2 = lh.b(-1, "enterToClose");
                if (var2 != null) {
                  aj.field_a = bh.a(var2, 23);
                }
                var2 = lh.b(-1, "disapearIn");
                if (var2 != null) {
                  qe.field_d = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "tutorialGas,0,0");
                if (var2 != null) {
                  nk.field_v[0][0] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "tutorialMonster,0,0");
                if (null != var2) {
                  ed.field_b[0][0] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "tutorialPinniped,1,0");
                if (null != var2) {
                  ob.field_n[1][0] = bh.a(var2, 39);
                }
                var2 = lh.b(-1, "tutorialBoulders,0,0");
                if (null != var2) {
                  wi.field_u[0][0] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "tutorialOre,0,0");
                if (var2 != null) {
                  vi.field_c[0][0] = bh.a(var2, 29);
                }
                var2 = lh.b(-1, "tutorialOre,0,1");
                if (null != var2) {
                  vi.field_c[0][1] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "tutorialOre,0,2");
                if (var2 != null) {
                  vi.field_c[0][2] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "tutorialOre,0,3");
                if (var2 != null) {
                  vi.field_c[0][3] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "tutorialOre,0,4");
                if (var2 != null) {
                  vi.field_c[0][4] = bh.a(var2, 116);
                }
                var2 = lh.b(-1, "tutorialOre,0,5");
                if (var2 != null) {
                  vi.field_c[0][5] = bh.a(var2, 37);
                }
                var2 = lh.b(-1, "tutorialOre,0,6");
                if (null != var2) {
                  vi.field_c[0][6] = bh.a(var2, 73);
                }
                var2 = lh.b(-1, "tutorialCavein,0,0");
                if (null != var2) {
                  pf.field_d[0][0] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "tutorialOreInBoulder,0,0");
                if (var2 != null) {
                  lf.field_i[0][0] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "tutorialLava,0,0");
                if (var2 != null) {
                  kd.field_b[0][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tutorialMoving,0,0");
                if (null != var2) {
                  il.field_t[0][0] = bh.a(var2, -4);
                }
                var2 = lh.b(-1, "tutorialMining,0,0");
                if (var2 != null) {
                  kn.field_D[0][0] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "tutorialOxygenMeter,0,0");
                if (var2 != null) {
                  wi.field_x[0][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tutorialDynamite,0,0");
                if (null != var2) {
                  pb.field_R[0][0] = bh.a(var2, 33);
                }
                var2 = lh.b(-1, "tutorialDynamiteInWater,0,0");
                if (null != var2) {
                  ci.field_h[0][0] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "tutorialQuitWhileYoureAhead,0,0");
                if (null != var2) {
                  qm.field_g[0][0] = bh.a(var2, 67);
                }
                var2 = lh.b(-1, "tutorialQuitWhileYoureAhead,0,1");
                if (null != var2) {
                  qm.field_g[0][1] = bh.a(var2, -7);
                }
                var2 = lh.b(-1, "tutorialQuitWhileYoureAhead,0,2");
                if (var2 != null) {
                  qm.field_g[0][2] = bh.a(var2, 102);
                }
                var2 = lh.b(-1, "tutorialLootTheDead,0,0");
                if (var2 != null) {
                  oj.field_M[0][0] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "tutorialSeimographSpike,0,0");
                if (var2 != null) {
                  ec.field_g[0][0] = bh.a(var2, 48);
                }
                var2 = lh.b(-1, "tutorialInRubble,0,0");
                if (var2 != null) {
                  dh.field_b[0][0] = bh.a(var2, 11);
                }
                var2 = lh.b(-1, "tutorialInRubble,0,1");
                if (null != var2) {
                  dh.field_b[0][1] = bh.a(var2, 53);
                }
                var2 = lh.b(-1, "tutorialInRubble,0,2");
                if (var2 != null) {
                  dh.field_b[0][2] = bh.a(var2, -8);
                }
                var2 = lh.b(-1, "tutorialPoisoned,0,0");
                if (null != var2) {
                  ek.field_a[0][0] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "tutorialInWater,0,0");
                if (var2 != null) {
                  tl.field_n[0][0] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "tutorialOre4,0,0");
                if (var2 != null) {
                  lj.field_u[0][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tutorialOre5,0,0");
                if (null != var2) {
                  jh.field_c[0][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tutorialOre6,1,0");
                if (null != var2) {
                  af.field_n[1][0] = bh.a(var2, 49);
                }
                var2 = lh.b(-1, "tutorialEyes,0,0");
                if (null != var2) {
                  cg.field_K[0][0] = bh.a(var2, 9);
                }
                var2 = lh.b(-1, "tutorialEyes,0,1");
                if (null != var2) {
                  cg.field_K[0][1] = bh.a(var2, 80);
                }
                var2 = lh.b(-1, "tutorialEyes,0,2");
                if (null != var2) {
                  cg.field_K[0][2] = bh.a(var2, -5);
                }
                var2 = lh.b(-1, "tutorialInterface,0,0");
                if (null != var2) {
                  wf.field_Q[0][0] = bh.a(var2, 106);
                }
                var2 = lh.b(-1, "tutorialInterface,0,1");
                if (null != var2) {
                  wf.field_Q[0][1] = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "tutorialInterface,0,2");
                if (var2 != null) {
                  wf.field_Q[0][2] = bh.a(var2, 40);
                }
                var2 = lh.b(-1, "tutorialInterface,0,3");
                if (null != var2) {
                  wf.field_Q[0][3] = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "tutorialInterface,0,4");
                if (var2 != null) {
                  wf.field_Q[0][4] = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "tutorialDoubleTapMining,0,0");
                if (null != var2) {
                  nd.field_c[0][0] = bh.a(var2, 120);
                }
                var2 = lh.b(-1, "tutorialFreezingWater,1,0");
                if (null != var2) {
                  jn.field_t[1][0] = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tutorialSnowMelting,1,0");
                if (var2 != null) {
                  pc.field_e[1][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tutorialIceBomb,1,0");
                if (null != var2) {
                  jh.field_d[1][0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tutorialHardIce,1,0");
                if (var2 != null) {
                  wf.field_Y[1][0] = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "tutorialIceCrack,1,0");
                if (null != var2) {
                  pf.field_g[1][0] = bh.a(var2, 11);
                }
                var2 = lh.b(-1, "tutorialFreezing,1,0");
                if (var2 != null) {
                  ok.field_d[1][0] = bh.a(var2, 2);
                }
                var2 = lh.b(-1, "tutorialOil,1,0");
                if (null != var2) {
                  vh.field_b[1][0] = bh.a(var2, 99);
                }
                var2 = lh.b(-1, "tutorialCoatedInOil,1,0");
                if (null != var2) {
                  sb.field_s[1][0] = bh.a(var2, 27);
                }
                var2 = lh.b(-1, "tutorialSnow,1,0");
                if (var2 != null) {
                  i.field_b[1][0] = bh.a(var2, -3);
                }
                var2 = lh.b(-1, "tutorialOilFire,1,0");
                if (null != var2) {
                  nj.field_b[1][0] = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "clickToContinue");
                if (null != var2) {
                  mg.field_g = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "getRich");
                if (null != var2) {
                  nm.field_c = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "getFlag");
                if (var2 != null) {
                  wf.field_V = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "tooltipTorch");
                if (null != var2) {
                  lb.field_t = bh.a(var2, 89);
                }
                var2 = lh.b(-1, "tooltipDynamite");
                if (var2 != null) {
                  lj.field_v = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "tooltipCharge");
                if (var2 != null) {
                  el.field_a = bh.a(var2, 24);
                }
                var2 = lh.b(-1, "tooltipAqualung");
                if (null != var2) {
                  hf.field_p = bh.a(var2, 119);
                }
                var2 = lh.b(-1, "tooltipGasMask");
                if (null != var2) {
                  mg.field_b = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "tooltipHardHat");
                if (var2 != null) {
                  bd.field_i = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "tooltipScanner");
                if (var2 != null) {
                  oc.field_h = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "tooltipFist");
                if (null != var2) {
                  fg.field_e = bh.a(var2, 33);
                }
                var2 = lh.b(-1, "tooltipGun");
                if (null != var2) {
                  hn.field_a = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "tooltipHooks");
                if (var2 != null) {
                  ei.field_K = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tooltipShaft");
                if (null != var2) {
                  tb.field_g = bh.a(var2, 123);
                }
                var2 = lh.b(-1, "tooltipDrill");
                if (null != var2) {
                  el.field_b = bh.a(var2, 45);
                }
                var2 = lh.b(-1, "tooltipMap");
                if (var2 != null) {
                  j.field_e = bh.a(var2, -124);
                }
                var2 = lh.b(-1, "tooltip2X");
                if (null != var2) {
                  gi.field_b = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "tooltip3X");
                if (var2 != null) {
                  gd.field_z = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tooltipCollapse");
                if (var2 != null) {
                  kb.field_d = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "tooltipClickTop");
                if (null != var2) {
                  fd.field_W = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "tooltipExtAqualung");
                if (var2 != null) {
                  tj.field_c = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tooltipGreaseProofSuit");
                if (var2 != null) {
                  th.field_a = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "tooltipIceBomb");
                if (var2 != null) {
                  tj.field_a = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "tooltipWoolyJumper");
                if (null != var2) {
                  g.field_e = bh.a(var2, 18);
                }
                var2 = lh.b(-1, "tooltipCrampons");
                if (null != var2) {
                  om.field_d = bh.a(var2, 33);
                }
                var2 = lh.b(-1, "tooltipJetpack");
                if (var2 != null) {
                  ti.field_P = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "basicKit");
                if (null != var2) {
                  ta.field_f = bh.a(var2, 121);
                }
                var2 = lh.b(-1, "sellBasicKit");
                if (var2 != null) {
                  se.field_L = bh.a(var2, 68);
                }
                var2 = lh.b(-1, "shopTorch,0");
                if (var2 != null) {
                  vh.field_h[0] = bh.a(var2, 40);
                }
                var2 = lh.b(-1, "shopTorch,1");
                if (null != var2) {
                  vh.field_h[1] = bh.a(var2, -123);
                }
                var2 = lh.b(-1, "shopDynamite,0");
                if (null != var2) {
                  hm.field_J[0] = bh.a(var2, 68);
                }
                var2 = lh.b(-1, "shopDynamite,1");
                if (var2 != null) {
                  hm.field_J[1] = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "shopAqualung,0");
                if (null != var2) {
                  gl.field_x[0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "shopAqualung,1");
                if (var2 != null) {
                  gl.field_x[1] = bh.a(var2, 16);
                }
                var2 = lh.b(-1, "shopGasMask");
                if (var2 != null) {
                  ob.field_v = bh.a(var2, -118);
                }
                var2 = lh.b(-1, "shopHardHat");
                if (var2 != null) {
                  ii.field_c = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "shopScanner,0");
                if (null != var2) {
                  mn.field_w[0] = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "shopScanner,1");
                if (var2 != null) {
                  mn.field_w[1] = bh.a(var2, 101);
                }
                var2 = lh.b(-1, "shopCharge");
                if (var2 != null) {
                  ig.field_d = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "shopFist");
                if (null != var2) {
                  tc.field_p = bh.a(var2, -6);
                }
                var2 = lh.b(-1, "shopGun");
                if (null != var2) {
                  ef.field_d = bh.a(var2, 27);
                }
                var2 = lh.b(-1, "shopHooks");
                if (null != var2) {
                  cl.field_M = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "shopShaft");
                if (null != var2) {
                  wc.field_d = bh.a(var2, 93);
                }
                var2 = lh.b(-1, "shopDrill");
                if (var2 != null) {
                  uf.field_u = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "shop2X");
                if (var2 != null) {
                  hh.field_c = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "shop3X");
                if (null != var2) {
                  qh.field_d = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "shopMap,0");
                if (var2 != null) {
                  fd.field_kb[0] = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "shopMap,1");
                if (null != var2) {
                  fd.field_kb[1] = bh.a(var2, 86);
                }
                var2 = lh.b(-1, "shopGreaseProofSuit");
                if (var2 != null) {
                  jn.field_p = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "shopWoolyJumper");
                if (var2 != null) {
                  ol.field_d = bh.a(var2, 23);
                }
                var2 = lh.b(-1, "shopCrampons");
                if (var2 != null) {
                  lm.field_I = bh.a(var2, -2);
                }
                var2 = lh.b(-1, "shopExtendedAqualung");
                if (null != var2) {
                  ck.field_e = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "shopJetpack");
                if (null != var2) {
                  fm.field_K = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "shopIceBomb");
                if (var2 != null) {
                  nf.field_b = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "shopWelcome,0");
                if (var2 != null) {
                  ne.field_R[0] = bh.a(var2, 124);
                }
                var2 = lh.b(-1, "shopWelcome,1");
                if (var2 != null) {
                  ne.field_R[1] = bh.a(var2, -120);
                }
                var2 = lh.b(-1, "cost");
                if (var2 != null) {
                  af.field_r = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "gold");
                if (null != var2) {
                  ne.field_M = bh.a(var2, -128);
                }
                var2 = lh.b(-1, "pressSpace");
                if (var2 != null) {
                  uf.field_v = bh.a(var2, 56);
                }
                var2 = lh.b(-1, "pleaselogin");
                if (null != var2) {
                  si.field_e = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "times100");
                if (var2 != null) {
                  uh.field_c = bh.a(var2, 77);
                }
                var2 = lh.b(-1, "times250");
                if (null != var2) {
                  gd.field_A = bh.a(var2, 104);
                }
                var2 = lh.b(-1, "times500");
                if (var2 != null) {
                  ge.field_h = bh.a(var2, -122);
                }
                var2 = lh.b(-1, "times750");
                if (var2 != null) {
                  fl.field_h = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "times1000");
                if (var2 != null) {
                  nn.field_a = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "times2500");
                if (null != var2) {
                  bl.field_u = bh.a(var2, 55);
                }
                var2 = lh.b(-1, "optionsPlayVolcano");
                if (null != var2) {
                  ri.field_b = bh.a(var2, 124);
                }
                var2 = lh.b(-1, "optionsPlaySuperVolcano");
                if (null != var2) {
                  md.field_a = bh.a(var2, -125);
                }
                var2 = lh.b(-1, "optionsOptions");
                if (null != var2) {
                  jc.field_D = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "optionsMembersExpansion");
                if (null != var2) {
                  pm.field_d = bh.a(var2, -119);
                }
                var2 = lh.b(-1, "highscoreVolcano");
                if (var2 != null) {
                  gn.field_a = bh.a(var2, 33);
                }
                var2 = lh.b(-1, "highscoreSuperVolcano");
                if (var2 != null) {
                  rj.field_a = bh.a(var2, -121);
                }
                var2 = lh.b(-1, "stillLoadingVolcano");
            }
            void runChunk2() throws java.lang.RuntimeException {
                if (var2 != null) {
                  dc.field_c = bh.a(var2, 11);
                }
                var2 = lh.b(-1, "stillLoadingSuperVolcano");
                if (var2 != null) {
                  jk.field_lb = bh.a(var2, -127);
                }
                var2 = lh.b(-1, "membersExpanionTitle");
                if (null != var2) {
                  lc.field_o = bh.a(var2, -126);
                }
                var2 = lh.b(-1, "keycode_mine_up_left");
                if (null != var2) {
                  d.field_e = 255 & var2[0];
                }
                var2 = lh.b(-1, "keycode_mine_up");
                if (null != var2) {
                  lb.field_w = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_mine_up_right");
                if (null != var2) {
                  hd.field_l = 255 & var2[0];
                }
                var2 = lh.b(-1, "keycode_mine_left");
                if (null != var2) {
                  ge.field_f = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_mine_right");
                if (null != var2) {
                  hi.field_v = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_mine_down_left");
                if (var2 != null) {
                  tk.field_g = 255 & var2[0];
                }
                var2 = lh.b(-1, "keycode_mine_down");
                if (var2 != null) {
                  qc.field_c = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_mine_down_right");
                if (null != var2) {
                  qm.field_a = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_cheat_up");
                if (var2 != null) {
                  pm.field_a = var2[0] & 255;
                }
                var2 = lh.b(-1, "keycode_cheat_down");
                if (null != var2) {
                  ni.field_a = var2[0] & 255;
                }
                fa.field_d = null;
            }
            void run() {
                var3 = MinerDisturbance.field_ab;
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
                  stackIn_1680_0 = (RuntimeException) (var2_ref);
                  stackIn_1680_1 = new StringBuilder().append("lg.C(");
                  if (param0 == null) {
                    stackIn_1681_2 = "null";
                  } else {
                    stackIn_1681_2 = "{...}";
                  }
                  throw lj.a((Throwable) ((Object) stackIn_1680_0), ((StringBuilder) (Object) stackIn_1680_1).append(stackIn_1681_2).append(',').append(param1).append(')').toString());
                }
                if (m.field_h) {
                  var3++;
                  MinerDisturbance.field_ab = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static p a(byte[] param0, int param1) {
        p var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_5_0 = null;
        p stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -6633) {
            field_b = (String) null;
          }
          if (param0 == null) {
            stackIn_5_0 = null;
            return (p) (stackIn_5_0);
          }
          var2 = new p(param0, bg.field_d, oc.field_e, qk.field_b, ng.field_e, af.field_p, db.field_b);
          ec.a((byte) 70);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("lg.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Name is available";
        field_b = "Type your email address again to make sure it's correct";
    }
}
