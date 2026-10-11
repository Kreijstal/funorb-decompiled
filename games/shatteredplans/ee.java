/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends ms {
    static mp field_l;
    private String field_m;
    static String field_j;
    static String field_n;
    static int field_o;
    static int field_k;
    private String field_i;

    final void a(ob param0, byte param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.a((byte) 95, this.field_m);
          if (param1 <= 67) {
            ee.a((vm) null, false);
          }
          param0.b((byte) -120, this.field_i);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ee.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(vm param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param1) {
            field_l = (mp) null;
          }
          ua.field_f.a(4, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ee.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(ob param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_j;
          var4 = se.a((byte) 86, (CharSequence) ((Object) param2));
          param0.g(0, var4.length);
          if (param1 >= -36) {
            ee.a(true);
          }
          param0.field_j = param0.field_j + ak.field_v.a(var4, param0.field_j, -6309, param0.field_h, 0, var4.length);
          stackIn_4_0 = -var3_int + param0.field_j;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("ee.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ee.G(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, bc param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1731_0;
            StringBuilder stackIn_1731_1;
            String stackIn_1732_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int var4;
            int var5;
            int param0;
            bc param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, bc initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1731_0 = null;
                this.stackIn_1731_1 = null;
                this.stackIn_1732_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
                this.var4 = 0;
                this.var5 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                ek.field_D = param1;
                var2 = nb.a("text_game_name", 96);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_benefits,0", 104);
                if (null != var2) {
                  cg.field_B[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_benefits,1", 100);
                if (null != var2) {
                  cg.field_B[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_benefits,2", 115);
                if (var2 != null) {
                  cg.field_B[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,0", 95);
                if (var2 != null) {
                  ud.field_a[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,1", 120);
                if (null != var2) {
                  ud.field_a[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,2", 108);
                if (null != var2) {
                  ud.field_a[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,3", 120);
                if (var2 != null) {
                  ud.field_a[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,4", 121);
                if (null != var2) {
                  ud.field_a[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,5", 97);
                if (null != var2) {
                  ud.field_a[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,6", 107);
                if (var2 != null) {
                  ud.field_a[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,7", 109);
                if (var2 != null) {
                  ud.field_a[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,8", 117);
                if (var2 != null) {
                  ud.field_a[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,9", 106);
                if (var2 != null) {
                  ud.field_a[9] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,10", 117);
                if (var2 != null) {
                  ud.field_a[10] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,11", 107);
                if (var2 != null) {
                  ud.field_a[11] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,12", 100);
                if (var2 != null) {
                  ud.field_a[12] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,13", 119);
                if (null != var2) {
                  ud.field_a[13] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,14", 96);
                if (var2 != null) {
                  ud.field_a[14] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,15", 127);
                if (null != var2) {
                  ud.field_a[15] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,16", 100);
                if (var2 != null) {
                  ud.field_a[16] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,17", 95);
                if (null != var2) {
                  ud.field_a[17] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,18", 122);
                if (var2 != null) {
                  ud.field_a[18] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,19", 102);
                if (null != var2) {
                  ud.field_a[19] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,20", 114);
                if (var2 != null) {
                  ud.field_a[20] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,21", 95);
                if (null != var2) {
                  ud.field_a[21] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,22", 122);
                if (null != var2) {
                  ud.field_a[22] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,23", 105);
                if (null != var2) {
                  ud.field_a[23] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_names,24", 107);
                if (var2 != null) {
                  ud.field_a[24] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_no_achievement", 127);
                if (var2 != null) {
                  me.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,0", 119);
                if (null != var2) {
                  ul.field_Qb[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,1", 99);
                if (var2 != null) {
                  ul.field_Qb[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,2", 108);
                if (null != var2) {
                  ul.field_Qb[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,3", 103);
                if (null != var2) {
                  ul.field_Qb[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,4", 115);
                if (var2 != null) {
                  ul.field_Qb[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,5", 126);
                if (var2 != null) {
                  ul.field_Qb[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,6", 121);
                if (var2 != null) {
                  ul.field_Qb[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,7", 125);
                if (var2 != null) {
                  ul.field_Qb[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,8", 116);
                if (null != var2) {
                  ul.field_Qb[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,9", 125);
                if (null != var2) {
                  ul.field_Qb[9] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,10", 115);
                if (null != var2) {
                  ul.field_Qb[10] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,11", 108);
                if (var2 != null) {
                  ul.field_Qb[11] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,12", 108);
                if (var2 != null) {
                  ul.field_Qb[12] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,13", 118);
                if (null != var2) {
                  ul.field_Qb[13] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,14", 118);
                if (null != var2) {
                  ul.field_Qb[14] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,15", 102);
                if (null != var2) {
                  ul.field_Qb[15] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,16", 103);
                if (var2 != null) {
                  ul.field_Qb[16] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,17", 123);
                if (null != var2) {
                  ul.field_Qb[17] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,18", 104);
                if (null != var2) {
                  ul.field_Qb[18] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,19", 117);
                if (null != var2) {
                  ul.field_Qb[19] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,20", 117);
                if (var2 != null) {
                  ul.field_Qb[20] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,21", 115);
                if (null != var2) {
                  ul.field_Qb[21] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,22", 124);
                if (null != var2) {
                  ul.field_Qb[22] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,23", 106);
                if (null != var2) {
                  ul.field_Qb[23] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievement_criteria,24", 106);
                if (var2 != null) {
                  ul.field_Qb[24] = rm.a(var2, 17746);
                }
                var2 = nb.a("achievements_rated_only", 110);
                if (var2 != null) {
                  a.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,0", 98);
                if (null != var2) {
                  jd.field_d[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,1", 100);
                if (var2 != null) {
                  jd.field_d[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,2", 113);
                if (var2 != null) {
                  jd.field_d[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,3", 99);
                if (var2 != null) {
                  jd.field_d[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,4", 124);
                if (null != var2) {
                  jd.field_d[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptlabels,5", 98);
                if (null != var2) {
                  jd.field_d[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,0", 100);
                if (var2 != null) {
                  w.field_J[1][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,1", 101);
                if (null != var2) {
                  w.field_J[1][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,2", 115);
                if (null != var2) {
                  w.field_J[1][2] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,3", 108);
                if (null != var2) {
                  w.field_J[1][3] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,4", 97);
                if (var2 != null) {
                  w.field_J[1][4] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,5", 107);
                if (null != var2) {
                  w.field_J[1][5] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,1,6", 107);
                if (var2 != null) {
                  w.field_J[1][6] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,2,0", 108);
                if (null != var2) {
                  w.field_J[2][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,2,1", 116);
                if (null != var2) {
                  w.field_J[2][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,2,2", 106);
                if (null != var2) {
                  w.field_J[2][2] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,2,3", 122);
                if (var2 != null) {
                  w.field_J[2][3] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,3,0", 122);
                if (var2 != null) {
                  w.field_J[3][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,3,1", 119);
                if (null != var2) {
                  w.field_J[3][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,3,2", 104);
                if (null != var2) {
                  w.field_J[3][2] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,3,3", 120);
                if (null != var2) {
                  w.field_J[3][3] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,3,4", 111);
                if (null != var2) {
                  w.field_J[3][4] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,4,0", 97);
                if (null != var2) {
                  w.field_J[4][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gameoptnames,4,1", 100);
                if (var2 != null) {
                  w.field_J[4][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gametypeTooltips,0", 118);
                if (null != var2) {
                  tc.field_E[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("gametypeTooltips,1", 115);
                if (null != var2) {
                  tc.field_E[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("gametypeTooltips,2", 110);
                if (var2 != null) {
                  tc.field_E[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("gametypeTooltips,3", 108);
                if (null != var2) {
                  tc.field_E[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("rulesetTooltips,0", 127);
                if (null != var2) {
                  ua.field_c[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("rulesetTooltips,1", 122);
                if (null != var2) {
                  ua.field_c[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,0", 112);
                if (null != var2) {
                  hn.field_f[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,1", 101);
                if (var2 != null) {
                  hn.field_f[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,2", 102);
                if (null != var2) {
                  hn.field_f[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,3", 124);
                if (null != var2) {
                  hn.field_f[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,4", 95);
                if (var2 != null) {
                  hn.field_f[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("empire_names,5", 119);
                if (var2 != null) {
                  hn.field_f[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("resource_names,0", 121);
                if (var2 != null) {
                  h.field_x[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("resource_names,1", 117);
                if (null != var2) {
                  h.field_x[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("resource_names,2", 124);
                if (null != var2) {
                  h.field_x[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("resource_names,3", 117);
                if (var2 != null) {
                  h.field_x[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("project_names,0", 123);
                if (var2 != null) {
                  or.field_d[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("project_names,1", 101);
                if (var2 != null) {
                  or.field_d[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("project_names,2", 97);
                if (var2 != null) {
                  or.field_d[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("project_names,3", 114);
                if (null != var2) {
                  or.field_d[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,0", 124);
                if (null != var2) {
                  pe.field_J[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,1", 99);
                if (var2 != null) {
                  pe.field_J[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,2", 119);
                if (null != var2) {
                  pe.field_J[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,3", 105);
                if (var2 != null) {
                  pe.field_J[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,4", 122);
                if (var2 != null) {
                  pe.field_J[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,5", 114);
                if (null != var2) {
                  pe.field_J[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,6", 112);
                if (var2 != null) {
                  pe.field_J[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,7", 103);
                if (var2 != null) {
                  pe.field_J[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,8", 105);
                if (var2 != null) {
                  pe.field_J[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,9", 116);
                if (null != var2) {
                  pe.field_J[9] = rm.a(var2, 17746);
                }
                var2 = nb.a("instructions_tabnames,10", 122);
                if (var2 != null) {
                  pe.field_J[10] = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO0,0", 95);
                if (null != var2) {
                  qq.field_w[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO0,1", 118);
                if (null != var2) {
                  qq.field_w[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO1_START", 111);
                if (null != var2) {
                  kl.field_r = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO1_END", 111);
                if (var2 != null) {
                  rk.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO2_START", 117);
                if (var2 != null) {
                  ra.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO2_END", 111);
                if (var2 != null) {
                  n.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO3_START", 103);
                if (var2 != null) {
                  vr.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO4_START", 115);
                if (null != var2) {
                  aa.field_P = rm.a(var2, 17746);
                }
                var2 = nb.a("TEXT_INTRO4_END", 112);
                if (var2 != null) {
                  qf.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_skipintro", 121);
                if (var2 != null) {
                  np.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_playerinfo", 113);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_territoryinfo", 118);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_unplaced", 97);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_tooltip_garrison", 119);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_tooltip_required", 118);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_tooltip_departing", 125);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_tooltip_arriving", 126);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("pact_offer", 118);
                if (null != var2) {
                  eb.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("pact_accept", 114);
                if (var2 != null) {
                  il.field_hb = rm.a(var2, 17746);
                }
                var2 = nb.a("pact_awaiting", 123);
                if (null != var2) {
                  fb.field_gc = rm.a(var2, 17746);
                }
                var2 = nb.a("pact_ineffect", 98);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("pact_expires", 123);
                if (var2 != null) {
                  jb.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("pact_one_turn", 95);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("pact_turns", 107);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("hint_select_src", 103);
                if (var2 != null) {
                  ub.field_Bb = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_select_dest", 123);
                if (null != var2) {
                  gi.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_placement", 123);
                if (null != var2) {
                  wp.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_defensegrid", 115);
                if (var2 != null) {
                  ol.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_terraform", 106);
                if (null != var2) {
                  mr.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_flare", 125);
                if (var2 != null) {
                  li.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_select_gate_src", 113);
                if (null != var2) {
                  i.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_select_gate_dest", 111);
                if (null != var2) {
                  ml.field_k = rm.a(var2, 17746);
                }
                var2 = nb.a("hint_cancel", 97);
                if (null != var2) {
                  vo.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_waitingforplayer", 126);
                if (var2 != null) {
                  il.field_Y = rm.a(var2, 17746);
                }
                var2 = nb.a("text_waitingforplayers", 126);
                if (null != var2) {
                  gs.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("text_youhavebeendefeated", 102);
                if (null != var2) {
                  lp.field_A = rm.a(var2, 17746);
                }
                var2 = nb.a("text_victory", 108);
                if (var2 != null) {
                  fj.field_o = rm.a(var2, 17746);
                }
                var2 = nb.a("text_defeat", 119);
                if (var2 != null) {
                  kq.field_L = rm.a(var2, 17746);
                }
                var2 = nb.a("text_peace_short", 123);
                if (var2 != null) {
                  ef.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_peace", 120);
                if (null != var2) {
                  m.field_v = rm.a(var2, 17746);
                }
                var2 = nb.a("text_peace2", 105);
                if (null != var2) {
                  ad.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_peace3", 110);
                if (null != var2) {
                  oh.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_playerHasWon", 95);
                if (null != var2) {
                  vp.field_t = rm.a(var2, 17746);
                }
                var2 = nb.a("text_togglestats", 99);
                if (var2 != null) {
                  er.field_p = rm.a(var2, 17746);
                }
                var2 = nb.a("text_togglestats2", 123);
                if (null != var2) {
                  vn.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_esctoexit", 105);
                if (null != var2) {
                  uo.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_defeated", 96);
                if (var2 != null) {
                  of.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_resigned", 116);
                if (var2 != null) {
                  he.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("text_join_final", 118);
                if (null != var2) {
                  qn.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_join", 97);
                if (null != var2) {
                  ef.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_decimal", 117);
                if (null != var2) {
                  ej.field_j = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_ordinal", 104);
                if (null != var2) {
                  eo.field_hb = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name", 112);
                if (null != var2) {
                  tq.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name_first", 114);
                if (null != var2) {
                  ek.field_H = rm.a(var2, 17746);
                }
                var2 = nb.a("turnObjective", 105);
                if (null != var2) {
                  cl.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("turnOnePoint", 123);
                if (null != var2) {
                  vs.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("turnPoints", 95);
                if (null != var2) {
                  hg.field_s = rm.a(var2, 17746);
                }
                var2 = nb.a("turnFewerShips", 101);
                if (var2 != null) {
                  sq.field_p = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,0", 119);
                if (var2 != null) {
                  ur.field_Bb[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,1", 122);
                if (var2 != null) {
                  ur.field_Bb[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,2", 116);
                if (null != var2) {
                  ur.field_Bb[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,3", 125);
                if (null != var2) {
                  ur.field_Bb[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,4", 126);
                if (var2 != null) {
                  ur.field_Bb[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,5", 99);
                if (null != var2) {
                  ur.field_Bb[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,6", 121);
                if (null != var2) {
                  ur.field_Bb[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,7", 99);
                if (var2 != null) {
                  ur.field_Bb[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,8", 109);
                if (null != var2) {
                  ur.field_Bb[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,9", 95);
                if (null != var2) {
                  ur.field_Bb[9] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,10", 123);
                if (var2 != null) {
                  ur.field_Bb[10] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,11", 108);
                if (null != var2) {
                  ur.field_Bb[11] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,12", 111);
                if (null != var2) {
                  ur.field_Bb[12] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,13", 126);
                if (null != var2) {
                  ur.field_Bb[13] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,14", 96);
                if (var2 != null) {
                  ur.field_Bb[14] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,15", 126);
                if (null != var2) {
                  ur.field_Bb[15] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,16", 122);
                if (null != var2) {
                  ur.field_Bb[16] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,17", 127);
                if (null != var2) {
                  ur.field_Bb[17] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,18", 122);
                if (null != var2) {
                  ur.field_Bb[18] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,19", 119);
                if (null != var2) {
                  ur.field_Bb[19] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,20", 107);
                if (var2 != null) {
                  ur.field_Bb[20] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name1,21", 121);
                if (var2 != null) {
                  ur.field_Bb[21] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,0", 113);
                if (null != var2) {
                  eg.field_x[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,1", 116);
                if (var2 != null) {
                  eg.field_x[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,2", 125);
                if (null != var2) {
                  eg.field_x[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,3", 98);
                if (null != var2) {
                  eg.field_x[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,4", 101);
                if (var2 != null) {
                  eg.field_x[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,5", 112);
                if (var2 != null) {
                  eg.field_x[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,6", 120);
                if (null != var2) {
                  eg.field_x[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,7", 122);
                if (var2 != null) {
                  eg.field_x[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,8", 108);
                if (null != var2) {
                  eg.field_x[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,9", 95);
                if (var2 != null) {
                  eg.field_x[9] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,10", 99);
                if (var2 != null) {
                  eg.field_x[10] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,11", 111);
                if (null != var2) {
                  eg.field_x[11] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,12", 111);
                if (var2 != null) {
                  eg.field_x[12] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,13", 97);
                if (null != var2) {
                  eg.field_x[13] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,14", 126);
                if (var2 != null) {
                  eg.field_x[14] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,15", 98);
                if (var2 != null) {
                  eg.field_x[15] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,16", 118);
                if (null != var2) {
                  eg.field_x[16] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,17", 118);
                if (null != var2) {
                  eg.field_x[17] = rm.a(var2, 17746);
                }
                var2 = nb.a("turn_name2,18", 126);
                if (var2 != null) {
                  eg.field_x[18] = rm.a(var2, 17746);
                }
                var2 = nb.a("derelict", 122);
                if (var2 != null) {
                  ks.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions0", 116);
                if (var2 != null) {
                  vc.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_glossary1", 120);
                if (null != var2) {
                  ck.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_glossary2", 102);
                if (var2 != null) {
                  jd.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_playerstatus", 107);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_time", 126);
                if (null != var2) {
                  gp.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_wormhole", 95);
                if (var2 != null) {
                  lh.field_u = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_tooltip", 126);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_frame", 122);
                if (null != var2) {
                  fi.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_ready", 122);
                if (null != var2) {
                  lr.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_zoom", 109);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_mv_order", 121);
                if (null != var2) {
                  eo.field_kb = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_sf_outgoing", 96);
                if (null != var2) {
                  md.field_K = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_sf_garrison", 100);
                if (var2 != null) {
                  nn.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_sf_name", 117);
                if (var2 != null) {
                  pa.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_sf_resources", 103);
                if (null != var2) {
                  kj.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_sf_incoming", 109);
                if (null != var2) {
                  ln.field_q = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_icon_occupied", 110);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_icon_terraformed", 101);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  sk.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_icon_neutral", 111);
                if (null != var2) {
                  pg.field_F = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_icon_homeworld", 126);
                if (var2 != null) {
                  vd.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_placement", 97);
                if (null != var2) {
                  er.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_movement", 112);
                if (null != var2) {
                  ri.field_N = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_projects", 105);
                if (var2 != null) {
                  rk.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_fleetsize", 95);
                if (null != var2) {
                  da.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_endturn", 125);
                if (null != var2) {
                  er.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_hotkeys", 104);
                if (var2 != null) {
                  fr.field_F = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_stats", 104);
                if (null != var2) {
                  ub.field_Cb = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_project_metal", 118);
                if (null != var2) {
                  hs.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_project_biomass", 114);
                if (var2 != null) {
                  sp.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_project_energy", 112);
                if (null != var2) {
                  jb.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_project_exotics", 125);
                if (null != var2) {
                  ar.field_o = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation", 120);
                if (var2 != null) {
                  jl.field_N = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_fleetmove", 106);
                if (null != var2) {
                  ph.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_combat", 108);
                if (var2 != null) {
                  of.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_damaged", 103);
                if (null != var2) {
                  tb.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_retreating", 125);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_captured", 110);
                if (var2 != null) {
                  wq.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_lost", 124);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_building", 99);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_animation_project", 111);
                if (var2 != null) {
                  jb.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_gametype", 99);
                if (var2 != null) {
                  dm.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_classic", 116);
                if (null != var2) {
                  df.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("text_instructions_classic_stellarbomb", 107);
                if (null != var2) {
                  ac.field_v = rm.a(var2, 17746);
                }
                var2 = nb.a("text_animating_none", 105);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_animating_moves", 115);
                if (var2 != null) {
                  sr.field_N = rm.a(var2, 17746);
                }
                var2 = nb.a("text_animating_combat", 102);
                if (var2 != null) {
                  pd.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_animating_results", 115);
                if (var2 != null) {
                  ib.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_animating_collapse", 96);
                if (var2 != null) {
                  md.field_G = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_offeredpactto", 97);
                if (var2 != null) {
                  ud.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_offeredpactby", 120);
                if (var2 != null) {
                  wf.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_signedwithyou", 116);
                if (null != var2) {
                  jb.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_youhavesigned", 108);
                if (null != var2) {
                  se.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_xy_signed", 110);
                if (var2 != null) {
                  lh.field_A = rm.a(var2, 17746);
                }
                var2 = nb.a("msg_yourpactexpired", 122);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_xy_pactexpired", 118);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_you_have_been_defeated", 105);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_x_has_been_defeated", 96);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_insufficient_garrison", 101);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_garrison_ships_retreating", 118);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_garrison_ships_could_not_retreat", 116);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_gate_you", 119);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_gate_x", 99);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_net_you", 108);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_net_x", 110);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_terraform_you", 120);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_terraform_x", 99);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb", 120);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_you", 121);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_lost", 104);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_lost_one", 121);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_lost_none", 105);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_lost_defnet", 124);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_destroyed", 110);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_destroyed_one", 96);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_destroyed_none", 123);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_destroyed_defnet", 100);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_jumps_prevented2", 109);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_project_bomb_jumps_prevented1", 108);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_ships_arrived", 121);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_ships_constructed", 119);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_held", 106);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_held_ships_lost_damaged", 124);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_held_ships_lost", 103);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_held_ships_damaged", 96);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_held_ships_lost_none", 126);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_lost", 97);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_lost_ships_lost_retreating", 107);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_lost_ships_lost", 109);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_system_lost_ships_retreating", 119);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_successful", 113);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_successful_neutral", 116);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_failed", 126);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_failed_neutral", 95);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_ships_lost_retreating", 120);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_ships_lost", 107);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_ships_retreating", 100);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_attack_ships_lost_none", 97);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_spectator_system_taken", 113);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_spectator_system_held", 115);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("msg_combat_also_involved", 96);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_continue", 114);
                if (var2 != null) {
                  wm.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_continue2", 112);
                if (null != var2) {
                  aq.field_k = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_continue3", 110);
                if (var2 != null) {
                  gn.field_v = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_continuekey", 108);
                if (null != var2) {
                  ul.field_Ob = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_balanced", 121);
                if (var2 != null) {
                  cb.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_shortfall1", 127);
                if (var2 != null) {
                  qj.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_shortfall2a", 104);
                if (var2 != null) {
                  aq.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_shortfall2b", 119);
                if (null != var2) {
                  oo.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_retreating_single", 109);
                if (null != var2) {
                  lh.field_H = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_retreating_multiple", 100);
                if (null != var2) {
                  wl.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_lost_none", 102);
                if (null != var2) {
                  bq.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_lost_single", 123);
                if (var2 != null) {
                  bk.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_lost_multiple", 113);
                if (var2 != null) {
                  rl.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_capture_all", 110);
                if (null != var2) {
                  in.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("tutorial_exit", 99);
                if (var2 != null) {
                  sa.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_territories", 103);
                if (null != var2) {
                  ShatteredPlansClient.field_L = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_uioptions", 99);
                if (var2 != null) {
                  dm.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_fleetinfo", 106);
                if (var2 != null) {
                  ba.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_diplomacy", 109);
                if (var2 != null) {
                  vj.field_B = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_projects", 110);
                if (null != var2) {
                  ib.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_messages", 98);
                if (null != var2) {
                  uq.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("tabname_victory", 113);
                if (var2 != null) {
                  ih.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("messages_replay", 100);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("messages_none", 121);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("messages_counter", 106);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("message_incoming_offers", 122);
                if (null != var2) {
                  ul.field_Ab = rm.a(var2, 17746);
                }
                var2 = nb.a("text_farzoom", 101);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_enemyproduction", 101);
                if (var2 != null) {
                  ho.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_rates", 127);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_types", 102);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_resource", 104);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_sort", 109);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_showall", 117);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_garrison", 107);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_endturn", 112);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_animation", 119);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_enable", 121);
                if (var2 != null) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_fast", 100);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("text_ships", 110);
                if (null != var2) {
                  ja.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("text_production", 105);
                if (var2 != null) {
                  na.field_s = rm.a(var2, 17746);
                }
                var2 = nb.a("text_systems", 114);
                if (var2 != null) {
                  po.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_overview", 114);
                if (null != var2) {
                  ph.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ready", 109);
                if (null != var2) {
                  mf.field_v = rm.a(var2, 17746);
                }
                var2 = nb.a("text_pending", 124);
                if (null != var2) {
                  ii.field_s = rm.a(var2, 17746);
                }
                var2 = nb.a("text_notavailable", 114);
                if (var2 != null) {
                  qc.field_t = rm.a(var2, 17746);
                }
                var2 = nb.a("text_percentage", 122);
                if (null != var2) {
                  jl.field_O = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ordinals,0", 113);
                if (var2 != null) {
                  eh.field_I[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ordinals,1", 105);
                if (null != var2) {
                  eh.field_I[1] = rm.a(var2, 17746);
                }
                var3 = -15 % ((42 - param0) / 35);
                var2 = nb.a("text_ordinals,2", 123);
                if (null != var2) {
                  eh.field_I[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ordinals,3", 120);
                if (null != var2) {
                  eh.field_I[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ordinals,4", 98);
                if (null != var2) {
                  eh.field_I[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_ordinals,5", 125);
                if (var2 != null) {
                  eh.field_I[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("text_error", 111);
                if (var2 != null) {
                  wc.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_max_total_fleet_size", 109);
                if (null != var2) {
                  ih.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_ships_destroyed", 116);
                if (var2 != null) {
                  gq.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_ships_lost", 114);
                if (var2 != null) {
                  rq.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_avg_move_size", 127);
                if (null != var2) {
                  tc.field_D = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_max_production", 107);
                if (var2 != null) {
                  lk.field_D = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_ships_constructed", 116);
                if (null != var2) {
                  rg.field_g = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_projects_used", 121);
                if (var2 != null) {
                  ms.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_research_wasted", 95);
                if (var2 != null) {
                  rp.field_J = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_attacks_successful", 118);
                if (var2 != null) {
                  ck.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_attacks_failed", 114);
                if (null != var2) {
                  in.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_defences_successful", 117);
                if (var2 != null) {
                  w.field_H = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_defences_failed", 123);
                if (null != var2) {
                  qe.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_efficiency", 103);
                if (null != var2) {
                  am.field_zb = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_fluidity", 114);
                if (null != var2) {
                  kh.field_Eb = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_aggressiveness", 115);
                if (null != var2) {
                  ss.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_solidity", 106);
                if (var2 != null) {
                  af.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_max_total_fleet_size", 109);
                if (null != var2) {
                  qk.field_v = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_ships_destroyed", 121);
                if (null != var2) {
                  np.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_ships_lost", 105);
                if (null != var2) {
                  nf.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_avg_move_size", 117);
                if (var2 != null) {
                  wa.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_max_production", 104);
                if (null != var2) {
                  vs.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_ships_constructed", 101);
                if (null != var2) {
                  rk.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_projects_used", 119);
                if (null != var2) {
                  en.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_research_wasted", 116);
                if (var2 != null) {
                  me.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_attacks_successful", 116);
                if (var2 != null) {
                  nr.field_s = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_attacks_failed", 99);
                if (null != var2) {
                  ln.field_P = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_defences_successful", 102);
                if (null != var2) {
                  nd.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_defences_failed", 127);
                if (null != var2) {
                  vo.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_efficiency", 108);
                if (var2 != null) {
                  vs.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_fluidity", 117);
                if (var2 != null) {
                  oo.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_aggressiveness", 121);
                if (null != var2) {
                  ch.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("text_stat_desc_solidity", 104);
                if (var2 != null) {
                  ta.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("rated_membersonly", 109);
                if (var2 != null) {
                  nd.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_skirmish", 119);
                if (null != var2) {
                  wm.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("text_totalplayers", 126);
                if (var2 != null) {
                  be.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("text_human_players", 118);
                if (null != var2) {
                  ah.field_Q = rm.a(var2, 17746);
                }
                var2 = nb.a("text_map_hex", 121);
                if (null != var2) {
                  lm.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_map_sol", 95);
                if (null != var2) {
                  la.field_n = rm.a(var2, 17746);
                }
                var2 = nb.a("text_map_points", 96);
                if (null != var2) {
                  ue.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("text_map_derelicts", 101);
                if (null != var2) {
                  cf.field_I = rm.a(var2, 17746);
                }
                var2 = nb.a("text_garrison_yes", 114);
                if (var2 != null) {
                  og.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_garrison_no", 106);
                if (null != var2) {
                  tp.field_k = rm.a(var2, 17746);
                }
                var2 = nb.a("text_skirmish_start", 95);
                if (var2 != null) {
                  field_j = rm.a(var2, 17746);
                }
                var2 = nb.a("track_name_new", 96);
                if (var2 != null) {
                  uq.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("track_name_old", 112);
                if (var2 != null) {
                  an.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("text_showChat", 101);
                if (null != var2) {
                  fk.field_l = rm.a(var2, 17746);
                }
                var2 = nb.a("text_hideChat", 115);
                if (var2 != null) {
                  db.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,0,0", 107);
                if (null != var2) {
                  ma.field_s[0][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,1,0", 113);
                if (var2 != null) {
                  ma.field_s[1][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,2,0", 113);
                if (var2 != null) {
                  ma.field_s[2][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,3,0", 108);
                if (var2 != null) {
                  ma.field_s[3][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,4,0", 119);
                if (null != var2) {
                  ma.field_s[4][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,5,0", 123);
                if (null != var2) {
                  ma.field_s[5][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,6,0", 109);
                if (var2 != null) {
                  ma.field_s[6][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,7,0", 117);
                if (null != var2) {
                  ma.field_s[7][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,8,0", 96);
                if (var2 != null) {
                  ma.field_s[8][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,9,0", 103);
                if (var2 != null) {
                  ma.field_s[9][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,10,0", 107);
                if (var2 != null) {
                  ma.field_s[10][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,11,0", 120);
                if (var2 != null) {
                  ma.field_s[11][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,12,0", 111);
                if (null != var2) {
                  ma.field_s[12][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,13,0", 118);
                if (var2 != null) {
                  ma.field_s[13][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,14,0", 120);
                if (null != var2) {
                  ma.field_s[14][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,15,0", 125);
                if (null != var2) {
                  ma.field_s[15][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,16,0", 118);
                if (var2 != null) {
                  ma.field_s[16][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,17,0", 97);
                if (null != var2) {
                  ma.field_s[17][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,18,0", 100);
                if (null != var2) {
                  ma.field_s[18][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,19,0", 114);
                if (null != var2) {
                  ma.field_s[19][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,19,1", 98);
                if (var2 != null) {
                  ma.field_s[19][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,20,0", 124);
                if (var2 != null) {
                  ma.field_s[20][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,21,0", 95);
                if (null != var2) {
                  ma.field_s[21][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,22,0", 114);
                if (null != var2) {
                  ma.field_s[22][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,23,0", 114);
                if (null != var2) {
                  ma.field_s[23][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,24,0", 112);
                if (var2 != null) {
                  ma.field_s[24][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,24,1", 103);
                if (null != var2) {
                  ma.field_s[24][1] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,24,2", 95);
                if (var2 != null) {
                  ma.field_s[24][2] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,25,0", 97);
                if (null != var2) {
                  ma.field_s[25][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aichat,26,0", 124);
                if (var2 != null) {
                  ma.field_s[26][0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,0", 100);
                if (null != var2) {
                  wk.field_a[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,1", 117);
                if (null != var2) {
                  wk.field_a[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,2", 100);
                if (null != var2) {
                  wk.field_a[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,3", 120);
                if (var2 != null) {
                  wk.field_a[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,4", 116);
                if (var2 != null) {
                  wk.field_a[4] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,5", 123);
                if (var2 != null) {
                  wk.field_a[5] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,6", 109);
                if (null != var2) {
                  wk.field_a[6] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,7", 123);
                if (null != var2) {
                  wk.field_a[7] = rm.a(var2, 17746);
                }
                var2 = nb.a("aitypes,8", 95);
                if (null != var2) {
                  wk.field_a[8] = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipIncome,0", 121);
                if (null != var2) {
                  ne.field_m[0] = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipIncome,1", 125);
                if (var2 != null) {
                  ne.field_m[1] = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipIncome,2", 118);
                if (null != var2) {
                  ne.field_m[2] = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipIncome,3", 115);
                if (null != var2) {
                  ne.field_m[3] = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipIncomingLimiting", 101);
                if (null != var2) {
                  sg.field_yb = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipTotalFleetProduction", 125);
                if (var2 != null) {
                  si.field_w = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipPlaceFleets", 117);
                if (null != var2) {
                  hd.field_j = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipPlaceFleetsStop", 127);
                if (null != var2) {
                  il.field_lb = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipFleetsRemaining", 109);
                if (null != var2) {
                  d.field_c = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipOneFleetRemaining", 101);
                if (var2 != null) {
                  ad.field_a = rm.a(var2, 17746);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = nb.a("tooltipAllFleetsPlaced", 96);
                if (var2 != null) {
                  pe.field_F = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipOfferTreaty", 110);
                if (null != var2) {
                  jg.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAcceptTreaty", 113);
                if (null != var2) {
                  gn.field_x = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipWaitTreaty", 106);
                if (var2 != null) {
                  mf.field_u = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipPartiallyComplete", 117);
                if (null != var2) {
                  ur.field_yb = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProjectComplete", 118);
                if (var2 != null) {
                  mm.field_q = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProjectPending", 120);
                if (var2 != null) {
                  jd.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProductionButtonShow", 120);
                if (null != var2) {
                  t.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProjectsButtonShow", 125);
                if (var2 != null) {
                  n.field_j = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipDiplomacyButtonShow", 112);
                if (null != var2) {
                  rk.field_o = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipFleetInfoButtonShow", 109);
                if (var2 != null) {
                  wm.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryButtonShow", 102);
                if (null != var2) {
                  hi.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProductionButtonHide", 112);
                if (null != var2) {
                  ep.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProjectsButtonHide", 111);
                if (null != var2) {
                  ue.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipDiplomacyButtonHide", 112);
                if (null != var2) {
                  te.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipFleetInfoButtonHide", 104);
                if (var2 != null) {
                  lc.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryButtonHide", 105);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipEndTurn", 101);
                if (null != var2) {
                  oj.field_Bb = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryPaneManyMany", 105);
                if (var2 != null) {
                  jm.field_q = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryPaneOneOne", 101);
                if (var2 != null) {
                  bc.field_a = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryPaneOneMany", 105);
                if (null != var2) {
                  ms.field_b = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipVictoryPaneManyOne", 126);
                if (null != var2) {
                  fa.field_S = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipProjectedWinner", 115);
                if (var2 != null) {
                  ui.field_q = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimAutoPlayIsOn", 107);
                if (null != var2) {
                  fi.field_i = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimAutoPlayIsOff", 101);
                if (null != var2) {
                  fl.field_e = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimClickToPlay", 116);
                if (null != var2) {
                  da.field_f = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimClickToStop", 126);
                if (var2 != null) {
                  ip.field_h = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimSpeedIsNormal", 119);
                if (null != var2) {
                  ec.field_t = rm.a(var2, 17746);
                }
                var2 = nb.a("tooltipAnimSpeedIsDouble", 95);
                if (var2 != null) {
                  de.field_k = rm.a(var2, 17746);
                }
                var2 = nb.a("victoryTargetPoints", 110);
                if (var2 != null) {
                  ShatteredPlansClient.field_J = rm.a(var2, 17746);
                }
                var2 = nb.a("victoryInX", 100);
                if (null != var2) {
                  ka.field_m = rm.a(var2, 17746);
                }
                var2 = nb.a("drawInX", 112);
                if (null != var2) {
                  rm.a(var2, 17746);
                }
                var2 = nb.a("victoryTurnsRemaining", 118);
                if (var2 != null) {
                  hr.field_d = rm.a(var2, 17746);
                }
                var2 = nb.a("victorySolEmpty", 118);
                if (null != var2) {
                  cj.field_t = rm.a(var2, 17746);
                }
                var2 = nb.a("victorySolOwned", 105);
                if (null != var2) {
                  ms.field_h = rm.a(var2, 17746);
                }
                ek.field_D = null;
            }
            void run() {
                var4 = ShatteredPlansClient.field_F ? 1 : 0;
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
                  stackIn_1731_0 = (RuntimeException) (var2_ref);
                  stackIn_1731_1 = new StringBuilder().append("ee.H(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_1732_2 = "null";
                  } else {
                    stackIn_1732_2 = "{...}";
                  }
                  throw r.a((Throwable) ((Object) stackIn_1731_0), ((StringBuilder) (Object) stackIn_1731_1).append(stackIn_1732_2).append(')').toString());
                }
                if (var4 != 0) {
                  var5 = kf.field_l;
                  var5++;
                  kf.field_l = var5;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final ds a(byte param0) {
        ds stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = -105 / ((param0 + 7) / 41);
          stackIn_1_0 = hg.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "ee.B(" + param0 + ')');
        }
    }

    ee(String param0, String param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_i = param1;
          this.field_m = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ee.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        try {
          field_n = null;
          field_l = null;
          field_j = null;
          if (param0) {
            ee.a(true);
          }
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ee.I(" + param0 + ')');
        }
    }

    static {
        field_j = "Start skirmish";
        field_n = "Tutorial";
    }
}
