/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aha extends hf {
    static int[][] field_A;
    static String field_H;
    static fea field_D;
    private eaa field_G;
    static sna field_F;
    private aia field_E;
    private String[] field_I;

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        try {
          super.a(param0, param1, param2, param3, param4);
          this.a(21646);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aha.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        aia var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.a(param0, param1, param2, param3);
          var5_int = -this.field_s + param0;
          if (param2) {
            field_D = (fea) null;
          }
          var6 = param3 - this.field_v;
          var7 = this.b(var6, 35, var5_int);
          if (null != var7 &&
            this.field_k != null) {
            ((pc) ((Object) this.field_k)).a(var7.field_g, this, param1, (byte) 90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aha.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    aha(String param0, qda param1) {
        super(param0, (pl) null);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_E = null;
        try {
          this.field_f = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("aha.<init>(");
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
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void a(byte param0, vr param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_2085_0;
            StringBuilder stackIn_2085_1;
            String stackIn_2086_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            byte param0;
            vr param1;
            boolean finished;
            $CfrPartitionedBody(byte initialParam0, vr initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_2085_0 = null;
                this.stackIn_2085_1 = null;
                this.stackIn_2086_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                ko.field_g = param1;
                var2 = od.a("text_game_name", (byte) 105);
                if (var2 != null) {
                  qk.field_k = qq.a(var2, false);
                }
                var2 = od.a("text_benefits,0", (byte) 124);
                if (null != var2) {
                  lga.field_n[0] = qq.a(var2, false);
                }
                var2 = od.a("text_benefits,1", (byte) 85);
                if (var2 != null) {
                  lga.field_n[1] = qq.a(var2, false);
                }
                var2 = od.a("text_benefits,2", (byte) 121);
                if (var2 != null) {
                  lga.field_n[2] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,0", (byte) 82);
                if (var2 != null) {
                  pp.field_g[0] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,1", (byte) 73);
                if (null != var2) {
                  pp.field_g[1] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,2", (byte) 123);
                if (null != var2) {
                  pp.field_g[2] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,3", (byte) 93);
                if (null != var2) {
                  pp.field_g[3] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,4", (byte) 92);
                if (null != var2) {
                  pp.field_g[4] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,5", (byte) 114);
                if (var2 != null) {
                  pp.field_g[5] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,6", (byte) 81);
                if (var2 != null) {
                  pp.field_g[6] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,7", (byte) 104);
                if (var2 != null) {
                  pp.field_g[7] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,8", (byte) 103);
                if (null != var2) {
                  pp.field_g[8] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,9", (byte) 116);
                if (null != var2) {
                  pp.field_g[9] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,10", (byte) 88);
                if (null != var2) {
                  pp.field_g[10] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,11", (byte) 125);
                if (var2 != null) {
                  pp.field_g[11] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,12", (byte) 116);
                if (var2 != null) {
                  pp.field_g[12] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,13", (byte) 113);
                if (null != var2) {
                  pp.field_g[13] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,14", (byte) 125);
                if (var2 != null) {
                  pp.field_g[14] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,15", (byte) 78);
                if (var2 != null) {
                  pp.field_g[15] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,16", (byte) 108);
                if (var2 != null) {
                  pp.field_g[16] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,17", (byte) 112);
                if (var2 != null) {
                  pp.field_g[17] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,18", (byte) 71);
                if (null != var2) {
                  pp.field_g[18] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,19", (byte) 90);
                if (null != var2) {
                  pp.field_g[19] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,20", (byte) 90);
                if (var2 != null) {
                  pp.field_g[20] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,21", (byte) 92);
                if (var2 != null) {
                  pp.field_g[21] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,22", (byte) 98);
                if (var2 != null) {
                  pp.field_g[22] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,23", (byte) 127);
                if (var2 != null) {
                  pp.field_g[23] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,24", (byte) 72);
                if (null != var2) {
                  pp.field_g[24] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,25", (byte) 84);
                if (var2 != null) {
                  pp.field_g[25] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,26", (byte) 93);
                if (var2 != null) {
                  pp.field_g[26] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,27", (byte) 119);
                if (null != var2) {
                  pp.field_g[27] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,28", (byte) 74);
                if (var2 != null) {
                  pp.field_g[28] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,29", (byte) 126);
                if (null != var2) {
                  pp.field_g[29] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,30", (byte) 84);
                if (var2 != null) {
                  pp.field_g[30] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,31", (byte) 109);
                if (null != var2) {
                  pp.field_g[31] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,32", (byte) 89);
                if (null != var2) {
                  pp.field_g[32] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,33", (byte) 88);
                if (var2 != null) {
                  pp.field_g[33] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,34", (byte) 96);
                if (var2 != null) {
                  pp.field_g[34] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,35", (byte) 93);
                if (null != var2) {
                  pp.field_g[35] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,36", (byte) 70);
                if (null != var2) {
                  pp.field_g[36] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,37", (byte) 101);
                if (null != var2) {
                  pp.field_g[37] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,38", (byte) 104);
                if (null != var2) {
                  pp.field_g[38] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,39", (byte) 88);
                if (var2 != null) {
                  pp.field_g[39] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,40", (byte) 99);
                if (null != var2) {
                  pp.field_g[40] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,41", (byte) 95);
                if (null != var2) {
                  pp.field_g[41] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,42", (byte) 88);
                if (var2 != null) {
                  pp.field_g[42] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,43", (byte) 85);
                if (var2 != null) {
                  pp.field_g[43] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,44", (byte) 86);
                if (null != var2) {
                  pp.field_g[44] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,45", (byte) 108);
                if (var2 != null) {
                  pp.field_g[45] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,46", (byte) 70);
                if (null != var2) {
                  pp.field_g[46] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,47", (byte) 78);
                if (null != var2) {
                  pp.field_g[47] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,48", (byte) 84);
                if (null != var2) {
                  pp.field_g[48] = qq.a(var2, false);
                }
                var2 = od.a("achievement_names,49", (byte) 100);
                if (null != var2) {
                  pp.field_g[49] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,0", (byte) 113);
                if (var2 != null) {
                  kla.field_y[0] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,1", (byte) 109);
                if (null != var2) {
                  kla.field_y[1] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,2", (byte) 105);
                if (var2 != null) {
                  kla.field_y[2] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,3", (byte) 100);
                if (var2 != null) {
                  kla.field_y[3] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,4", (byte) 121);
                if (null != var2) {
                  kla.field_y[4] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,5", (byte) 97);
                if (null != var2) {
                  kla.field_y[5] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,6", (byte) 97);
                if (var2 != null) {
                  kla.field_y[6] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,7", (byte) 99);
                if (null != var2) {
                  kla.field_y[7] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,8", (byte) 94);
                if (var2 != null) {
                  kla.field_y[8] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,9", (byte) 111);
                if (null != var2) {
                  kla.field_y[9] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,10", (byte) 107);
                if (null != var2) {
                  kla.field_y[10] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,11", (byte) 111);
                if (var2 != null) {
                  kla.field_y[11] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,12", (byte) 126);
                if (null != var2) {
                  kla.field_y[12] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,13", (byte) 110);
                if (var2 != null) {
                  kla.field_y[13] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,14", (byte) 127);
                if (var2 != null) {
                  kla.field_y[14] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,15", (byte) 72);
                if (var2 != null) {
                  kla.field_y[15] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,16", (byte) 110);
                if (var2 != null) {
                  kla.field_y[16] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,17", (byte) 124);
                if (null != var2) {
                  kla.field_y[17] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,18", (byte) 74);
                if (null != var2) {
                  kla.field_y[18] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,19", (byte) 106);
                if (null != var2) {
                  kla.field_y[19] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,20", (byte) 92);
                if (var2 != null) {
                  kla.field_y[20] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,21", (byte) 117);
                if (var2 != null) {
                  kla.field_y[21] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,22", (byte) 104);
                if (null != var2) {
                  kla.field_y[22] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,23", (byte) 102);
                if (null != var2) {
                  kla.field_y[23] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,24", (byte) 93);
                if (null != var2) {
                  kla.field_y[24] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,25", (byte) 118);
                if (var2 != null) {
                  kla.field_y[25] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,26", (byte) 100);
                if (null != var2) {
                  kla.field_y[26] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,27", (byte) 72);
                if (null != var2) {
                  kla.field_y[27] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,28", (byte) 82);
                if (var2 != null) {
                  kla.field_y[28] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,29", (byte) 71);
                if (null != var2) {
                  kla.field_y[29] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,30", (byte) 72);
                if (null != var2) {
                  kla.field_y[30] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,31", (byte) 74);
                if (var2 != null) {
                  kla.field_y[31] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,32", (byte) 90);
                if (null != var2) {
                  kla.field_y[32] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,33", (byte) 72);
                if (null != var2) {
                  kla.field_y[33] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,34", (byte) 115);
                if (null != var2) {
                  kla.field_y[34] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,35", (byte) 87);
                if (var2 != null) {
                  kla.field_y[35] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,36", (byte) 106);
                if (null != var2) {
                  kla.field_y[36] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,37", (byte) 73);
                if (null != var2) {
                  kla.field_y[37] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,38", (byte) 71);
                if (var2 != null) {
                  kla.field_y[38] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,39", (byte) 74);
                if (var2 != null) {
                  kla.field_y[39] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,40", (byte) 93);
                if (var2 != null) {
                  kla.field_y[40] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,41", (byte) 83);
                if (null != var2) {
                  kla.field_y[41] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,42", (byte) 99);
                if (null != var2) {
                  kla.field_y[42] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,43", (byte) 82);
                if (null != var2) {
                  kla.field_y[43] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,44", (byte) 93);
                if (null != var2) {
                  kla.field_y[44] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,45", (byte) 105);
                if (var2 != null) {
                  kla.field_y[45] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,46", (byte) 79);
                if (var2 != null) {
                  kla.field_y[46] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,47", (byte) 73);
                if (var2 != null) {
                  kla.field_y[47] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,48", (byte) 109);
                if (null != var2) {
                  kla.field_y[48] = qq.a(var2, false);
                }
                var2 = od.a("achievement_criteria,49", (byte) 86);
                if (var2 != null) {
                  kla.field_y[49] = qq.a(var2, false);
                }
                var2 = od.a("gameoptlabels,0", (byte) 113);
                if (var2 != null) {
                  pt.field_b[0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptlabels,1", (byte) 123);
                if (var2 != null) {
                  pt.field_b[1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptlabels,2", (byte) 98);
                if (var2 != null) {
                  pt.field_b[2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptlabels,3", (byte) 111);
                if (var2 != null) {
                  pt.field_b[3] = qq.a(var2, false);
                }
                var2 = od.a("gameoptlabels,4", (byte) 90);
                if (null != var2) {
                  pt.field_b[4] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,0,0", (byte) 107);
                if (null != var2) {
                  lna.field_y[0][0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,0,1", (byte) 127);
                if (null != var2) {
                  lna.field_y[0][1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,0,2", (byte) 96);
                if (var2 != null) {
                  lna.field_y[0][2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,0,3", (byte) 85);
                if (var2 != null) {
                  lna.field_y[0][3] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,0,4", (byte) 91);
                if (null != var2) {
                  lna.field_y[0][4] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,1,0", (byte) 93);
                if (var2 != null) {
                  lna.field_y[1][0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,1,1", (byte) 72);
                if (null != var2) {
                  lna.field_y[1][1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,1,2", (byte) 88);
                if (var2 != null) {
                  lna.field_y[1][2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,2,0", (byte) 88);
                if (null != var2) {
                  lna.field_y[2][0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,2,1", (byte) 125);
                if (null != var2) {
                  lna.field_y[2][1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,2,2", (byte) 110);
                if (var2 != null) {
                  lna.field_y[2][2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,2,3", (byte) 90);
                if (var2 != null) {
                  lna.field_y[2][3] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,3,0", (byte) 87);
                if (var2 != null) {
                  lna.field_y[3][0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,3,1", (byte) 125);
                if (null != var2) {
                  lna.field_y[3][1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,3,2", (byte) 114);
                if (var2 != null) {
                  lna.field_y[3][2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,4,0", (byte) 115);
                if (null != var2) {
                  lna.field_y[4][0] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,4,1", (byte) 107);
                if (var2 != null) {
                  lna.field_y[4][1] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,4,2", (byte) 92);
                if (null != var2) {
                  lna.field_y[4][2] = qq.a(var2, false);
                }
                var2 = od.a("gameoptnames,4,3", (byte) 112);
                if (var2 != null) {
                  lna.field_y[4][3] = qq.a(var2, false);
                }
                var2 = od.a("keycode_up", (byte) 89);
                if (var2 != null) {
                  sm.field_r = var2[0] & 255;
                }
                var2 = od.a("keycode_left", (byte) 117);
                if (null != var2) {
                  oq.field_a = 255 & var2[0];
                }
                var2 = od.a("keycode_down", (byte) 81);
                if (var2 != null) {
                  rq.field_g = 255 & var2[0];
                }
                var2 = od.a("keycode_right", (byte) 125);
                if (null != var2) {
                  vk.field_s = 255 & var2[0];
                }
                var2 = od.a("instructions_page_welcome,0", (byte) 106);
                if (var2 != null) {
                  ana.field_j[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,1", (byte) 92);
                if (var2 != null) {
                  ana.field_j[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,2", (byte) 70);
                if (null != var2) {
                  ana.field_j[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,3", (byte) 122);
                if (var2 != null) {
                  ana.field_j[3] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,4", (byte) 101);
                if (null != var2) {
                  ana.field_j[4] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,5", (byte) 114);
                if (var2 != null) {
                  ana.field_j[5] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,6", (byte) 90);
                if (null != var2) {
                  ana.field_j[6] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,7", (byte) 71);
                if (null != var2) {
                  ana.field_j[7] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_welcome,8", (byte) 102);
                if (var2 != null) {
                  ana.field_j[8] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,0", (byte) 84);
                if (null != var2) {
                  ana.field_s[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,1", (byte) 75);
                if (var2 != null) {
                  ana.field_s[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,2", (byte) 110);
                if (var2 != null) {
                  ana.field_s[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,3", (byte) 89);
                if (var2 != null) {
                  ana.field_s[3] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,4", (byte) 119);
                if (var2 != null) {
                  ana.field_s[4] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,5", (byte) 113);
                if (var2 != null) {
                  ana.field_s[5] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,6", (byte) 126);
                if (null != var2) {
                  ana.field_s[6] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_alive,7", (byte) 80);
                if (var2 != null) {
                  ana.field_s[7] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_skills,0", (byte) 104);
                if (var2 != null) {
                  ana.field_k[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_skills,1", (byte) 81);
                if (var2 != null) {
                  ana.field_k[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_skills,2", (byte) 103);
                if (null != var2) {
                  ana.field_k[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_skills,3", (byte) 123);
                if (null != var2) {
                  ana.field_k[3] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,0", (byte) 86);
                if (null != var2) {
                  ana.field_o[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,1", (byte) 106);
                if (null != var2) {
                  ana.field_o[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,2", (byte) 81);
                if (var2 != null) {
                  ana.field_o[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,3", (byte) 96);
                if (var2 != null) {
                  ana.field_o[3] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,4", (byte) 71);
                if (null != var2) {
                  ana.field_o[4] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,5", (byte) 88);
                if (null != var2) {
                  ana.field_o[5] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_battles,6", (byte) 119);
                if (var2 != null) {
                  ana.field_o[6] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,0", (byte) 113);
                if (null != var2) {
                  ana.field_t[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,1", (byte) 120);
                if (var2 != null) {
                  ana.field_t[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,2", (byte) 115);
                if (null != var2) {
                  ana.field_t[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,3", (byte) 106);
                if (var2 != null) {
                  ana.field_t[3] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,4", (byte) 99);
                if (null != var2) {
                  ana.field_t[4] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,5", (byte) 93);
                if (null != var2) {
                  ana.field_t[5] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,6", (byte) 115);
                if (var2 != null) {
                  ana.field_t[6] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,7", (byte) 127);
                if (null != var2) {
                  ana.field_t[7] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,8", (byte) 96);
                if (null != var2) {
                  ana.field_t[8] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_terrain,9", (byte) 107);
                if (null != var2) {
                  ana.field_t[9] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_rewards,0", (byte) 89);
                if (var2 != null) {
                  ana.field_u[0] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_rewards,1", (byte) 113);
                if (var2 != null) {
                  ana.field_u[1] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_rewards,2", (byte) 111);
                if (var2 != null) {
                  ana.field_u[2] = qq.a(var2, false);
                }
                var2 = od.a("instructions_page_rewards,3", (byte) 110);
                if (var2 != null) {
                  ana.field_u[3] = qq.a(var2, false);
                }
                var2 = od.a("gamemode_names,0", (byte) 105);
                if (var2 != null) {
                  cd.field_o[0] = qq.a(var2, false);
                }
                var2 = od.a("gamemode_names,1", (byte) 121);
                if (var2 != null) {
                  cd.field_o[1] = qq.a(var2, false);
                }
                var2 = od.a("gamemode_names,2", (byte) 76);
                if (null != var2) {
                  cd.field_o[2] = qq.a(var2, false);
                }
                var2 = od.a("open_fridge", (byte) 90);
                if (var2 != null) {
                  dj.field_a = qq.a(var2, false);
                }
                var2 = od.a("rating_byrating_short", (byte) 115);
                if (var2 != null) {
                  qh.field_q = qq.a(var2, false);
                }
                var2 = od.a("rating_bywin_short", (byte) 78);
                if (var2 != null) {
                  ja.field_q = qq.a(var2, false);
                }
                var2 = od.a("all", (byte) 115);
                if (null != var2) {
                  kma.field_m = qq.a(var2, false);
                }
                var2 = od.a("bakery", (byte) 102);
                if (null != var2) {
                  oj.field_o = qq.a(var2, false);
                }
                var2 = od.a("meat", (byte) 80);
                if (null != var2) {
                  ula.field_j = qq.a(var2, false);
                }
                var2 = od.a("fish", (byte) 116);
                if (null != var2) {
                  md.field_n = qq.a(var2, false);
                }
                var2 = od.a("dairy", (byte) 101);
                if (var2 != null) {
                  sr.field_d = qq.a(var2, false);
                }
                var2 = od.a("fruitnveg", (byte) 116);
                if (null != var2) {
                  cja.field_t = qq.a(var2, false);
                }
                var2 = od.a("drinks", (byte) 85);
                if (null != var2) {
                  oj.field_m = qq.a(var2, false);
                }
                var2 = od.a("readymeal", (byte) 96);
                if (var2 != null) {
                  is.field_a = qq.a(var2, false);
                }
                var2 = od.a("misc", (byte) 94);
                if (var2 != null) {
                  lh.field_t = qq.a(var2, false);
                }
                var2 = od.a("options", (byte) 92);
                if (null != var2) {
                  pf.field_i = qq.a(var2, false);
                }
                var2 = od.a("price", (byte) 81);
                if (var2 != null) {
                  vla.field_u = qq.a(var2, false);
                }
                var2 = od.a("shop_back", (byte) 113);
                if (var2 != null) {
                  ow.field_n = qq.a(var2, false);
                }
                var2 = od.a("total_cost", (byte) 122);
                if (var2 != null) {
                  hka.field_g = qq.a(var2, false);
                }
                var2 = od.a("wallet", (byte) 122);
                if (var2 != null) {
                  jla.field_c = qq.a(var2, false);
                }
                var2 = od.a("add_to_cart", (byte) 117);
                if (var2 != null) {
                  qd.field_l = qq.a(var2, false);
                }
                var2 = od.a("confirm", (byte) 81);
                if (null != var2) {
                  di.field_l = qq.a(var2, false);
                }
                var2 = od.a("moves_set", (byte) 122);
                if (null != var2) {
                  hr.field_a = qq.a(var2, false);
                }
                var2 = od.a("actions", (byte) 111);
                if (var2 != null) {
                  ida.field_o = qq.a(var2, false);
                }
                var2 = od.a("exit_stats", (byte) 82);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("stats", (byte) 126);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("start", (byte) 83);
                if (null != var2) {
                  bh.field_p = qq.a(var2, false);
                }
                var2 = od.a("wait", (byte) 88);
                if (var2 != null) {
                  wda.field_g = qq.a(var2, false);
                }
                var2 = od.a("select_creatures", (byte) 73);
                if (null != var2) {
                  eha.field_p = qq.a(var2, false);
                }
                var2 = od.a("selected", (byte) 76);
                if (null != var2) {
                  vk.field_r = qq.a(var2, false);
                }
                var2 = od.a("selected_val", (byte) 127);
                if (var2 != null) {
                  vu.field_l = qq.a(var2, false);
                }
                var2 = od.a("right_click_to_view_stats", (byte) 83);
                if (null != var2) {
                  st.field_e = qq.a(var2, false);
                }
                var2 = od.a("end_turn", (byte) 125);
                if (var2 != null) {
                  ms.field_q = qq.a(var2, false);
                }
                var2 = od.a("flag_captured", (byte) 88);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  gka.field_r = qq.a(var2, false);
                }
                var2 = od.a("move_phase", (byte) 95);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("attack_phase", (byte) 122);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("phases,0", (byte) 122);
                if (null != var2) {
                  fu.field_l[0] = qq.a(var2, false);
                }
                var2 = od.a("phases,1", (byte) 75);
                if (var2 != null) {
                  fu.field_l[1] = qq.a(var2, false);
                }
                var2 = od.a("phase", (byte) 87);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("warning_win", (byte) 118);
                if (null != var2) {
                  pja.field_c = qq.a(var2, false);
                }
                var2 = od.a("warning_you_win", (byte) 75);
                if (null != var2) {
                  nu.field_g = qq.a(var2, false);
                }
                var2 = od.a("view_stats", (byte) 80);
                if (var2 != null) {
                  tv.field_n = qq.a(var2, false);
                }
                var2 = od.a("cancel", (byte) 116);
                if (null != var2) {
                  hea.field_s = qq.a(var2, false);
                }
                var2 = od.a("cooldown", (byte) 120);
                if (null != var2) {
                  ona.field_xb = qq.a(var2, false);
                }
                var2 = od.a("cooldown_ready", (byte) 111);
                if (null != var2) {
                  rh.field_a = qq.a(var2, false);
                }
                var2 = od.a("on_cooldown", (byte) 80);
                if (var2 != null) {
                  gea.field_n = qq.a(var2, false);
                }
                var2 = od.a("cant_use", (byte) 71);
                if (var2 != null) {
                  wfa.field_r = qq.a(var2, false);
                }
                var2 = od.a("spectate_waiting_for_teamselect", (byte) 107);
                if (var2 != null) {
                  cba.field_b = qq.a(var2, false);
                }
                var2 = od.a("fly_immunity", (byte) 70);
                if (var2 != null) {
                  lma.field_A = qq.a(var2, false);
                }
                var2 = od.a("xturnsremaining", (byte) 88);
                if (null != var2) {
                  vla.field_p = qq.a(var2, false);
                }
                var2 = od.a("xunreadmessages", (byte) 76);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("has_offered_draw", (byte) 120);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("has_withdrawn_draw", (byte) 90);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("spectating", (byte) 98);
                if (null != var2) {
                  pj.field_a = qq.a(var2, false);
                }
                var2 = od.a("turn", (byte) 95);
                if (var2 != null) {
                  eb.field_q = qq.a(var2, false);
                }
                var2 = od.a("suddendeath", (byte) 90);
                if (var2 != null) {
                  tw.field_b = qq.a(var2, false);
                }
                var2 = od.a("you", (byte) 94);
                if (var2 != null) {
                  gaa.field_l = qq.a(var2, false);
                }
                var2 = od.a("you_win", (byte) 110);
                if (var2 != null) {
                  t.field_m = qq.a(var2, false);
                }
                var2 = od.a("x_wins", (byte) 109);
                if (null != var2) {
                  jea.field_d = qq.a(var2, false);
                }
                var2 = od.a("game_drawn", (byte) 79);
                if (null != var2) {
                  kw.field_n = qq.a(var2, false);
                }
                var2 = od.a("chat", (byte) 70);
                if (var2 != null) {
                  pn.field_e = qq.a(var2, false);
                }
                var2 = od.a("resigned", (byte) 105);
                if (null != var2) {
                  cka.field_w = qq.a(var2, false);
                }
                var2 = od.a("out", (byte) 103);
                if (var2 != null) {
                  cf.field_a = qq.a(var2, false);
                }
                var2 = od.a("offered_draw", (byte) 76);
                if (null != var2) {
                  ts.field_p = qq.a(var2, false);
                }
                var2 = od.a("resisted", (byte) 84);
                if (null != var2) {
                  bja.field_n = qq.a(var2, false);
                }
                var2 = od.a("failed", (byte) 90);
                if (null != var2) {
                  dc.field_o = qq.a(var2, false);
                }
                var2 = od.a("no_target", (byte) 97);
                if (var2 != null) {
                  fb.field_q = qq.a(var2, false);
                }
                var2 = od.a("disarmed", (byte) 73);
                if (null != var2) {
                  m.field_c = qq.a(var2, false);
                }
                var2 = od.a("ignored", (byte) 120);
                if (var2 != null) {
                  qfa.field_w = qq.a(var2, false);
                }
                var2 = od.a("target_blocked", (byte) 98);
                if (var2 != null) {
                  bj.field_j = qq.a(var2, false);
                }
                var2 = od.a("refreshed", (byte) 78);
                if (null != var2) {
                  kw.field_g = qq.a(var2, false);
                }
                var2 = od.a("cleared", (byte) 110);
                if (null != var2) {
                  hs.field_c = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,0", (byte) 84);
                if (var2 != null) {
                  cp.field_a[0] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,1", (byte) 72);
                if (var2 != null) {
                  cp.field_a[1] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,2", (byte) 125);
                if (var2 != null) {
                  cp.field_a[2] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,3", (byte) 104);
                if (null != var2) {
                  cp.field_a[3] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,4", (byte) 87);
                if (null != var2) {
                  cp.field_a[4] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,5", (byte) 117);
                if (null != var2) {
                  cp.field_a[5] = qq.a(var2, false);
                }
                var2 = od.a("postwin_columns,6", (byte) 101);
                if (var2 != null) {
                  cp.field_a[6] = qq.a(var2, false);
                }
                var2 = od.a("HP", (byte) 85);
                if (null != var2) {
                  cca.field_w = qq.a(var2, false);
                }
                var2 = od.a("SPEED", (byte) 113);
                if (null != var2) {
                  bm.field_i = qq.a(var2, false);
                }
                var2 = od.a("ATTACK", (byte) 107);
                if (var2 != null) {
                  vm.field_g = qq.a(var2, false);
                }
                var2 = od.a("SPATTACK", (byte) 76);
                if (null != var2) {
                  mg.field_p = qq.a(var2, false);
                }
                var2 = od.a("WAITING_FOR_SAVEGAME", (byte) 98);
                if (var2 != null) {
                  hl.field_E = qq.a(var2, false);
                }
                var2 = od.a("TURNS_AVAILABLE", (byte) 82);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("SKIP_TURN", (byte) 101);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("SHOPS", (byte) 85);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("CURRENT_MONEY", (byte) 123);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("BASKET", (byte) 107);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("COST", (byte) 71);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("BUY", (byte) 86);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("ADD_TO_BASKET", (byte) 95);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("REMOVE_ITEM", (byte) 121);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("EXIT", (byte) 71);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("OK", (byte) 80);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("UPGRADE_FRIDGE", (byte) 120);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("SCORE", (byte) 116);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("FIGHT_WAIT", (byte) 98);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("are_you_sure", (byte) 122);
                if (null != var2) {
                  qi.field_a = qq.a(var2, false);
                }
                var2 = od.a("your_x_will_be_lost", (byte) 88);
                if (var2 != null) {
                  he.field_o = qq.a(var2, false);
                }
                var2 = od.a("delete", (byte) 87);
                if (null != var2) {
                  qga.field_s = qq.a(var2, false);
                }
                var2 = od.a("members_only", (byte) 83);
                if (var2 != null) {
                  dj.field_b = qq.a(var2, false);
                }
                var2 = od.a("you_cant_delete", (byte) 74);
                if (var2 != null) {
                  tba.field_r = qq.a(var2, false);
                }
                var2 = od.a("need_at_least_four", (byte) 83);
                if (null != var2) {
                  us.field_a = qq.a(var2, false);
                }
                var2 = od.a("ERROR_NOT_ENOUGH_MONEY", (byte) 117);
                if (null != var2) {
                  vka.field_r = qq.a(var2, false);
                }
                var2 = od.a("error_wrong_moves", (byte) 83);
                if (var2 != null) {
                  wja.field_n = qq.a(var2, false);
                }
                var2 = od.a("error_cannot_enter_arena_justplay", (byte) 99);
                if (var2 != null) {
                  iv.field_i = qq.a(var2, false);
                }
                var2 = od.a("error_cannot_enter_arena_nocreatures", (byte) 79);
                if (var2 != null) {
                  vu.field_o = qq.a(var2, false);
                }
                var2 = od.a("must_be_rated", (byte) 95);
                if (null != var2) {
                  kw.field_m = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,0", (byte) 80);
                if (var2 != null) {
                  rga.field_b[0] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,1", (byte) 78);
                if (var2 != null) {
                  rga.field_b[1] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,2", (byte) 114);
                if (null != var2) {
                  rga.field_b[2] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,3", (byte) 88);
                if (null != var2) {
                  rga.field_b[3] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,4", (byte) 104);
                if (var2 != null) {
                  rga.field_b[4] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,5", (byte) 93);
                if (null != var2) {
                  rga.field_b[5] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,6", (byte) 115);
                if (var2 != null) {
                  rga.field_b[6] = qq.a(var2, false);
                }
                var2 = od.a("FOOD_CATEGORIES,7", (byte) 95);
                if (var2 != null) {
                  rga.field_b[7] = qq.a(var2, false);
                }
                var2 = od.a("MOVEMENT_TYPES,0", (byte) 121);
                if (null != var2) {
                  qf.field_A[0] = qq.a(var2, false);
                }
                var2 = od.a("MOVEMENT_TYPES,1", (byte) 87);
                if (null != var2) {
                  qf.field_A[1] = qq.a(var2, false);
                }
                var2 = od.a("MOVEMENT_TYPES,2", (byte) 120);
                if (null != var2) {
                  qf.field_A[2] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,0", (byte) 107);
                if (var2 != null) {
                  kna.field_g[0] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,1", (byte) 86);
                if (null != var2) {
                  kna.field_g[1] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,2", (byte) 115);
                if (var2 != null) {
                  kna.field_g[2] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,3", (byte) 72);
                if (var2 != null) {
                  kna.field_g[3] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,4", (byte) 78);
                if (var2 != null) {
                  kna.field_g[4] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,5", (byte) 77);
                if (null != var2) {
                  kna.field_g[5] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,6", (byte) 75);
                if (var2 != null) {
                  kna.field_g[6] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,7", (byte) 83);
                if (var2 != null) {
                  kna.field_g[7] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,8", (byte) 123);
                if (null != var2) {
                  kna.field_g[8] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,9", (byte) 97);
                if (null != var2) {
                  kna.field_g[9] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,10", (byte) 77);
                if (var2 != null) {
                  kna.field_g[10] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,11", (byte) 93);
                if (var2 != null) {
                  kna.field_g[11] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,12", (byte) 88);
                if (var2 != null) {
                  kna.field_g[12] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,13", (byte) 123);
                if (var2 != null) {
                  kna.field_g[13] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,14", (byte) 98);
                if (var2 != null) {
                  kna.field_g[14] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,15", (byte) 117);
                if (null != var2) {
                  kna.field_g[15] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,16", (byte) 105);
                if (var2 != null) {
                  kna.field_g[16] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,17", (byte) 102);
                if (null != var2) {
                  kna.field_g[17] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,18", (byte) 106);
                if (var2 != null) {
                  kna.field_g[18] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,19", (byte) 94);
                if (var2 != null) {
                  kna.field_g[19] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,20", (byte) 87);
                if (var2 != null) {
                  kna.field_g[20] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,21", (byte) 71);
                if (null != var2) {
                  kna.field_g[21] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,22", (byte) 72);
                if (var2 != null) {
                  kna.field_g[22] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,23", (byte) 116);
                if (null != var2) {
                  kna.field_g[23] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,24", (byte) 96);
                if (null != var2) {
                  kna.field_g[24] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,25", (byte) 75);
                if (null != var2) {
                  kna.field_g[25] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,26", (byte) 79);
                if (null != var2) {
                  kna.field_g[26] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,27", (byte) 95);
                if (var2 != null) {
                  kna.field_g[27] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,28", (byte) 120);
                if (null != var2) {
                  kna.field_g[28] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,29", (byte) 79);
                if (var2 != null) {
                  kna.field_g[29] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,30", (byte) 89);
                if (var2 != null) {
                  kna.field_g[30] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,31", (byte) 120);
                if (var2 != null) {
                  kna.field_g[31] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,32", (byte) 122);
                if (null != var2) {
                  kna.field_g[32] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,33", (byte) 80);
                if (null != var2) {
                  kna.field_g[33] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,34", (byte) 71);
                if (null != var2) {
                  kna.field_g[34] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,35", (byte) 110);
                if (null != var2) {
                  kna.field_g[35] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,36", (byte) 117);
                if (null != var2) {
                  kna.field_g[36] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,37", (byte) 109);
                if (null != var2) {
                  kna.field_g[37] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,38", (byte) 114);
                if (var2 != null) {
                  kna.field_g[38] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,39", (byte) 125);
                if (null != var2) {
                  kna.field_g[39] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,40", (byte) 74);
                if (var2 != null) {
                  kna.field_g[40] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,41", (byte) 107);
                if (null != var2) {
                  kna.field_g[41] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,42", (byte) 123);
                if (var2 != null) {
                  kna.field_g[42] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,43", (byte) 89);
                if (var2 != null) {
                  kna.field_g[43] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,44", (byte) 79);
                if (null != var2) {
                  kna.field_g[44] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,45", (byte) 92);
                if (null != var2) {
                  kna.field_g[45] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,46", (byte) 91);
                if (var2 != null) {
                  kna.field_g[46] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,47", (byte) 79);
                if (var2 != null) {
                  kna.field_g[47] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,48", (byte) 102);
                if (var2 != null) {
                  kna.field_g[48] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,49", (byte) 88);
                if (var2 != null) {
                  kna.field_g[49] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,50", (byte) 77);
                if (var2 != null) {
                  kna.field_g[50] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,51", (byte) 115);
                if (null != var2) {
                  kna.field_g[51] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,52", (byte) 87);
                if (var2 != null) {
                  kna.field_g[52] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,53", (byte) 103);
                if (null != var2) {
                  kna.field_g[53] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_TEXT,54", (byte) 95);
                if (var2 != null) {
                  kna.field_g[54] = qq.a(var2, false);
                }
                var2 = od.a("raised", (byte) 94);
                if (null != var2) {
                  gb.field_i = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,0", (byte) 95);
                if (null != var2) {
                  c.field_k[0] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,1", (byte) 80);
                if (null != var2) {
                  c.field_k[1] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,2", (byte) 111);
                if (var2 != null) {
                  c.field_k[2] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,3", (byte) 96);
                if (null != var2) {
                  c.field_k[3] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,4", (byte) 121);
                if (null != var2) {
                  c.field_k[4] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,5", (byte) 107);
                if (null != var2) {
                  c.field_k[5] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,6", (byte) 78);
                if (null != var2) {
                  c.field_k[6] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,7", (byte) 87);
                if (null != var2) {
                  c.field_k[7] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,8", (byte) 93);
                if (var2 != null) {
                  c.field_k[8] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,9", (byte) 102);
                if (var2 != null) {
                  c.field_k[9] = qq.a(var2, false);
                }
                if (param0 < 15) {
                  aha.a((byte) 51, (vr) null);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,10", (byte) 82);
                if (null != var2) {
                  c.field_k[10] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,11", (byte) 77);
                if (null != var2) {
                  c.field_k[11] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,12", (byte) 75);
                if (var2 != null) {
                  c.field_k[12] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,13", (byte) 122);
                if (var2 != null) {
                  c.field_k[13] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,14", (byte) 119);
                if (var2 != null) {
                  c.field_k[14] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,15", (byte) 83);
                if (var2 != null) {
                  c.field_k[15] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,16", (byte) 114);
                if (null != var2) {
                  c.field_k[16] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,17", (byte) 127);
                if (var2 != null) {
                  c.field_k[17] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,18", (byte) 74);
                if (var2 != null) {
                  c.field_k[18] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,19", (byte) 123);
                if (null != var2) {
                  c.field_k[19] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,20", (byte) 108);
                if (null != var2) {
                  c.field_k[20] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,21", (byte) 95);
                if (var2 != null) {
                  c.field_k[21] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,22", (byte) 91);
                if (var2 != null) {
                  c.field_k[22] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,23", (byte) 102);
                if (var2 != null) {
                  c.field_k[23] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,24", (byte) 122);
                if (null != var2) {
                  c.field_k[24] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,25", (byte) 82);
                if (null != var2) {
                  c.field_k[25] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,26", (byte) 83);
                if (null != var2) {
                  c.field_k[26] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,27", (byte) 74);
                if (var2 != null) {
                  c.field_k[27] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,28", (byte) 98);
                if (null != var2) {
                  c.field_k[28] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,29", (byte) 127);
                if (null != var2) {
                  c.field_k[29] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,30", (byte) 115);
                if (var2 != null) {
                  c.field_k[30] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,31", (byte) 83);
                if (null != var2) {
                  c.field_k[31] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,32", (byte) 117);
                if (null != var2) {
                  c.field_k[32] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,33", (byte) 91);
                if (null != var2) {
                  c.field_k[33] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,34", (byte) 106);
                if (var2 != null) {
                  c.field_k[34] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,35", (byte) 104);
                if (var2 != null) {
                  c.field_k[35] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,36", (byte) 85);
                if (null != var2) {
                  c.field_k[36] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,37", (byte) 76);
                if (var2 != null) {
                  c.field_k[37] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,38", (byte) 93);
                if (var2 != null) {
                  c.field_k[38] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,39", (byte) 88);
                if (null != var2) {
                  c.field_k[39] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,40", (byte) 95);
                if (null != var2) {
                  c.field_k[40] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,41", (byte) 73);
                if (var2 != null) {
                  c.field_k[41] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,42", (byte) 78);
                if (var2 != null) {
                  c.field_k[42] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,43", (byte) 107);
                if (null != var2) {
                  c.field_k[43] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,44", (byte) 106);
                if (var2 != null) {
                  c.field_k[44] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,45", (byte) 125);
                if (null != var2) {
                  c.field_k[45] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,46", (byte) 103);
                if (var2 != null) {
                  c.field_k[46] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,47", (byte) 110);
                if (var2 != null) {
                  c.field_k[47] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,48", (byte) 110);
                if (null != var2) {
                  c.field_k[48] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,49", (byte) 85);
                if (null != var2) {
                  c.field_k[49] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,50", (byte) 109);
                if (var2 != null) {
                  c.field_k[50] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,51", (byte) 75);
                if (var2 != null) {
                  c.field_k[51] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,52", (byte) 100);
                if (var2 != null) {
                  c.field_k[52] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,53", (byte) 98);
                if (var2 != null) {
                  c.field_k[53] = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECTS_DESC,54", (byte) 93);
                if (var2 != null) {
                  c.field_k[54] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,0", (byte) 108);
                if (null != var2) {
                  vj.field_r[0] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,1", (byte) 95);
                if (var2 != null) {
                  vj.field_r[1] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,2", (byte) 75);
                if (var2 != null) {
                  vj.field_r[2] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,3", (byte) 84);
                if (var2 != null) {
                  vj.field_r[3] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,4", (byte) 71);
                if (null != var2) {
                  vj.field_r[4] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,5", (byte) 115);
                if (null != var2) {
                  vj.field_r[5] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,6", (byte) 117);
                if (null != var2) {
                  vj.field_r[6] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,7", (byte) 72);
                if (var2 != null) {
                  vj.field_r[7] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,8", (byte) 123);
                if (null != var2) {
                  vj.field_r[8] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,9", (byte) 107);
                if (null != var2) {
                  vj.field_r[9] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,10", (byte) 105);
                if (var2 != null) {
                  vj.field_r[10] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,11", (byte) 108);
                if (null != var2) {
                  vj.field_r[11] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,12", (byte) 121);
                if (null != var2) {
                  vj.field_r[12] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,13", (byte) 74);
                if (var2 != null) {
                  vj.field_r[13] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,14", (byte) 72);
                if (var2 != null) {
                  vj.field_r[14] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,15", (byte) 70);
                if (null != var2) {
                  vj.field_r[15] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,16", (byte) 92);
                if (var2 != null) {
                  vj.field_r[16] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,17", (byte) 112);
                if (var2 != null) {
                  vj.field_r[17] = qq.a(var2, false);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = od.a("TILE_NAMES,18", (byte) 110);
                if (var2 != null) {
                  vj.field_r[18] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,19", (byte) 122);
                if (var2 != null) {
                  vj.field_r[19] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,20", (byte) 126);
                if (null != var2) {
                  vj.field_r[20] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,21", (byte) 80);
                if (var2 != null) {
                  vj.field_r[21] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,22", (byte) 85);
                if (null != var2) {
                  vj.field_r[22] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,23", (byte) 93);
                if (var2 != null) {
                  vj.field_r[23] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,24", (byte) 86);
                if (null != var2) {
                  vj.field_r[24] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,25", (byte) 105);
                if (null != var2) {
                  vj.field_r[25] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,26", (byte) 72);
                if (var2 != null) {
                  vj.field_r[26] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,27", (byte) 81);
                if (var2 != null) {
                  vj.field_r[27] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,28", (byte) 103);
                if (null != var2) {
                  vj.field_r[28] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,29", (byte) 125);
                if (null != var2) {
                  vj.field_r[29] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,30", (byte) 101);
                if (null != var2) {
                  vj.field_r[30] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,31", (byte) 106);
                if (var2 != null) {
                  vj.field_r[31] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,32", (byte) 93);
                if (var2 != null) {
                  vj.field_r[32] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,33", (byte) 82);
                if (var2 != null) {
                  vj.field_r[33] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,34", (byte) 99);
                if (null != var2) {
                  vj.field_r[34] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,35", (byte) 70);
                if (var2 != null) {
                  vj.field_r[35] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,36", (byte) 88);
                if (null != var2) {
                  vj.field_r[36] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,37", (byte) 88);
                if (null != var2) {
                  vj.field_r[37] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,38", (byte) 98);
                if (var2 != null) {
                  vj.field_r[38] = qq.a(var2, false);
                }
                var2 = od.a("TILE_NAMES,39", (byte) 82);
                if (null != var2) {
                  vj.field_r[39] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,0", (byte) 125);
                if (var2 != null) {
                  oha.field_d[0] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,1", (byte) 119);
                if (var2 != null) {
                  oha.field_d[1] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,2", (byte) 115);
                if (null != var2) {
                  oha.field_d[2] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,3", (byte) 80);
                if (null != var2) {
                  oha.field_d[3] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,4", (byte) 109);
                if (var2 != null) {
                  oha.field_d[4] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,5", (byte) 100);
                if (null != var2) {
                  oha.field_d[5] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,6", (byte) 84);
                if (var2 != null) {
                  oha.field_d[6] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,7", (byte) 80);
                if (var2 != null) {
                  oha.field_d[7] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,8", (byte) 110);
                if (var2 != null) {
                  oha.field_d[8] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,9", (byte) 72);
                if (var2 != null) {
                  oha.field_d[9] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,10", (byte) 86);
                if (null != var2) {
                  oha.field_d[10] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,11", (byte) 85);
                if (null != var2) {
                  oha.field_d[11] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,12", (byte) 82);
                if (var2 != null) {
                  oha.field_d[12] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,13", (byte) 84);
                if (null != var2) {
                  oha.field_d[13] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,14", (byte) 121);
                if (var2 != null) {
                  oha.field_d[14] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,15", (byte) 118);
                if (null != var2) {
                  oha.field_d[15] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,16", (byte) 98);
                if (null != var2) {
                  oha.field_d[16] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,17", (byte) 74);
                if (var2 != null) {
                  oha.field_d[17] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,18", (byte) 106);
                if (var2 != null) {
                  oha.field_d[18] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,19", (byte) 74);
                if (null != var2) {
                  oha.field_d[19] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,20", (byte) 88);
                if (var2 != null) {
                  oha.field_d[20] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,21", (byte) 107);
                if (var2 != null) {
                  oha.field_d[21] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,22", (byte) 124);
                if (var2 != null) {
                  oha.field_d[22] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,23", (byte) 126);
                if (var2 != null) {
                  oha.field_d[23] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,24", (byte) 103);
                if (var2 != null) {
                  oha.field_d[24] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,25", (byte) 90);
                if (var2 != null) {
                  oha.field_d[25] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,26", (byte) 113);
                if (var2 != null) {
                  oha.field_d[26] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,27", (byte) 84);
                if (var2 != null) {
                  oha.field_d[27] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,28", (byte) 90);
                if (var2 != null) {
                  oha.field_d[28] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,29", (byte) 75);
                if (var2 != null) {
                  oha.field_d[29] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,30", (byte) 126);
                if (null != var2) {
                  oha.field_d[30] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,31", (byte) 79);
                if (null != var2) {
                  oha.field_d[31] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,32", (byte) 101);
                if (null != var2) {
                  oha.field_d[32] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,33", (byte) 85);
                if (null != var2) {
                  oha.field_d[33] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,34", (byte) 106);
                if (var2 != null) {
                  oha.field_d[34] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,35", (byte) 109);
                if (null != var2) {
                  oha.field_d[35] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,36", (byte) 104);
                if (null != var2) {
                  oha.field_d[36] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,37", (byte) 76);
                if (null != var2) {
                  oha.field_d[37] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,38", (byte) 98);
                if (var2 != null) {
                  oha.field_d[38] = qq.a(var2, false);
                }
                var2 = od.a("TILE_DESCS,39", (byte) 79);
                if (null != var2) {
                  oha.field_d[39] = qq.a(var2, false);
                }
                var2 = od.a("TUT_CLICK_TO_CONTINUE", (byte) 101);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_WELCOME_HELP", (byte) 95);
                if (null != var2) {
                  jla.field_f = qq.a(var2, false);
                }
                var2 = od.a("TUT_FRIDGE_WELCOME", (byte) 90);
                if (var2 != null) {
                  qca.field_p = qq.a(var2, false);
                }
                var2 = od.a("TUT_OBJECTS_HELP", (byte) 74);
                if (null != var2) {
                  jm.field_h = qq.a(var2, false);
                }
                var2 = od.a("TUT_SHOPPING_LIST", (byte) 71);
                if (null != var2) {
                  wg.field_h = qq.a(var2, false);
                }
                var2 = od.a("TUT_SHOPPING_BAG", (byte) 88);
                if (null != var2) {
                  sk.field_n = qq.a(var2, false);
                }
                var2 = od.a("TUT_MAGNIFIER", (byte) 80);
                if (var2 != null) {
                  sk.field_m = qq.a(var2, false);
                }
                var2 = od.a("TUT_BIN", (byte) 126);
                if (null != var2) {
                  qh.field_g = qq.a(var2, false);
                }
                var2 = od.a("TUT_FREEZER", (byte) 114);
                if (var2 != null) {
                  paa.field_h = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA", (byte) 86);
                if (var2 != null) {
                  uba.field_p = qq.a(var2, false);
                }
                var2 = od.a("TUT_FOOD_HELP", (byte) 93);
                if (null != var2) {
                  bp.field_w = qq.a(var2, false);
                }
                var2 = od.a("TUT_FOOD_START", (byte) 79);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_FOOD_DECOMPOSE", (byte) 118);
                if (var2 != null) {
                  bga.field_h = qq.a(var2, false);
                }
                var2 = od.a("TUT_FIRST_CREATURE", (byte) 81);
                if (var2 != null) {
                  ur.field_m = qq.a(var2, false);
                }
                var2 = od.a("TUT_SHOPPING_HELP", (byte) 98);
                if (var2 != null) {
                  uga.field_w = qq.a(var2, false);
                }
                var2 = od.a("TUT_FILL_SHOPPING_BAG", (byte) 114);
                if (var2 != null) {
                  un.field_f = qq.a(var2, false);
                }
                var2 = od.a("TUT_OPEN_BAG", (byte) 108);
                if (null != var2) {
                  pea.field_l = qq.a(var2, false);
                }
                var2 = od.a("TUT_OPEN_BAG2", (byte) 109);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_CLOSE_BAG", (byte) 120);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_EAT_HELP", (byte) 109);
                if (var2 != null) {
                  id.field_j = qq.a(var2, false);
                }
                var2 = od.a("TUT_EAT_FOOD", (byte) 70);
                if (var2 != null) {
                  md.field_m = qq.a(var2, false);
                }
                var2 = od.a("TUT_DROP_FOOD", (byte) 116);
                if (null != var2) {
                  fq.field_p = qq.a(var2, false);
                }
                var2 = od.a("TUT_FREEZER_HELP", (byte) 82);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_OPEN_FREEZER", (byte) 79);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_CLOSE_FREEZER", (byte) 91);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_ENTER_ARENA", (byte) 92);
                if (null != var2) {
                  oe.field_d = qq.a(var2, false);
                }
                var2 = od.a("TUT_CREATUREVIEWER_HELP", (byte) 72);
                if (var2 != null) {
                  fi.field_o = qq.a(var2, false);
                }
                var2 = od.a("TUT_OPEN_CREATUREVIEWER", (byte) 109);
                if (null != var2) {
                  ng.field_n = qq.a(var2, false);
                }
                var2 = od.a("TUT_EQUIP_ACTION", (byte) 71);
                if (null != var2) {
                  fp.field_t = qq.a(var2, false);
                }
                var2 = od.a("TUT_CONFIRM_ACTIONS", (byte) 120);
                if (null != var2) {
                  mu.field_b = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA_HELP", (byte) 123);
                if (null != var2) {
                  au.field_a = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA_WELCOME", (byte) 112);
                if (var2 != null) {
                  ek.field_k = qq.a(var2, false);
                }
                var2 = od.a("TUT_TEAM_SELECT", (byte) 111);
                if (null != var2) {
                  el.field_g = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA_BASICS_HELP", (byte) 118);
                if (var2 != null) {
                  via.field_c = qq.a(var2, false);
                }
                var2 = od.a("TUT_CAMERA", (byte) 75);
                if (null != var2) {
                  mja.field_p = qq.a(var2, false);
                }
                var2 = od.a("TUT_SELECT_CREATURE", (byte) 84);
                if (var2 != null) {
                  nw.field_t = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA_COMBAT_HELP", (byte) 126);
                if (null != var2) {
                  kr.field_xb = qq.a(var2, false);
                }
                var2 = od.a("TUT_ACTIONS", (byte) 77);
                if (null != var2) {
                  su.field_e = qq.a(var2, false);
                }
                var2 = od.a("TUT_MOVEMENT", (byte) 119);
                if (null != var2) {
                  n.field_d = qq.a(var2, false);
                }
                var2 = od.a("TUT_SIMULTANEOUS_TURNS", (byte) 90);
                if (var2 != null) {
                  ur.field_f = qq.a(var2, false);
                }
                var2 = od.a("TUT_HIT_OK", (byte) 112);
                if (null != var2) {
                  ld.field_m = qq.a(var2, false);
                }
                var2 = od.a("TUT_ATTACKS", (byte) 98);
                if (var2 != null) {
                  uu.field_zb = qq.a(var2, false);
                }
                var2 = od.a("TUT_KILL_EM_ALL", (byte) 103);
                if (var2 != null) {
                  wf.field_v = qq.a(var2, false);
                }
                var2 = od.a("TUT_ARENA_OBJECTS_HELP", (byte) 105);
                if (null != var2) {
                  eb.field_r = qq.a(var2, false);
                }
                var2 = od.a("TUT_POWERUPS", (byte) 112);
                if (null != var2) {
                  kk.field_q = qq.a(var2, false);
                }
                var2 = od.a("TUT_PITS", (byte) 109);
                if (var2 != null) {
                  we.field_a = qq.a(var2, false);
                }
                var2 = od.a("TUT_BLOCKS", (byte) 111);
                if (null != var2) {
                  gea.field_l = qq.a(var2, false);
                }
                var2 = od.a("TUT_WIN_HELP", (byte) 104);
                if (var2 != null) {
                  ls.field_d = qq.a(var2, false);
                }
                var2 = od.a("TUT_WINSCREEN", (byte) 91);
                if (null != var2) {
                  rn.field_t = qq.a(var2, false);
                }
                var2 = od.a("TUT_SHOP_HELP", (byte) 107);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_ENTER_SHOP", (byte) 77);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_SHOP_WELCOME", (byte) 96);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_CATEGORY_TABS", (byte) 106);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_ADD_TO_BASKET", (byte) 70);
                if (null != var2) {
                  qq.a(var2, false);
                }
                var2 = od.a("TUT_BUY", (byte) 84);
                if (var2 != null) {
                  qq.a(var2, false);
                }
                var2 = od.a("DAMAGE_LABEL", (byte) 117);
                if (var2 != null) {
                  qea.field_a = qq.a(var2, false);
                }
                var2 = od.a("STATUS_EFFECT_LABEL", (byte) 123);
                if (var2 != null) {
                  vf.field_D = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,0", (byte) 122);
                if (null != var2) {
                  jm.field_k[0] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,1", (byte) 84);
                if (var2 != null) {
                  jm.field_k[1] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,2", (byte) 95);
                if (var2 != null) {
                  jm.field_k[2] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,3", (byte) 96);
                if (var2 != null) {
                  jm.field_k[3] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,4", (byte) 116);
                if (null != var2) {
                  jm.field_k[4] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,5", (byte) 70);
                if (null != var2) {
                  jm.field_k[5] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,6", (byte) 74);
                if (var2 != null) {
                  jm.field_k[6] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,7", (byte) 117);
                if (null != var2) {
                  jm.field_k[7] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,8", (byte) 104);
                if (var2 != null) {
                  jm.field_k[8] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,9", (byte) 89);
                if (var2 != null) {
                  jm.field_k[9] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,10", (byte) 89);
                if (null != var2) {
                  jm.field_k[10] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,11", (byte) 121);
                if (var2 != null) {
                  jm.field_k[11] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,12", (byte) 71);
                if (null != var2) {
                  jm.field_k[12] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,13", (byte) 97);
                if (var2 != null) {
                  jm.field_k[13] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,14", (byte) 107);
                if (var2 != null) {
                  jm.field_k[14] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,15", (byte) 104);
                if (null != var2) {
                  jm.field_k[15] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,16", (byte) 89);
                if (null != var2) {
                  jm.field_k[16] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,17", (byte) 107);
                if (var2 != null) {
                  jm.field_k[17] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,18", (byte) 80);
                if (null != var2) {
                  jm.field_k[18] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,19", (byte) 114);
                if (null != var2) {
                  jm.field_k[19] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,20", (byte) 112);
                if (null != var2) {
                  jm.field_k[20] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,21", (byte) 110);
                if (var2 != null) {
                  jm.field_k[21] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,22", (byte) 91);
                if (null != var2) {
                  jm.field_k[22] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,23", (byte) 94);
                if (var2 != null) {
                  jm.field_k[23] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,24", (byte) 116);
                if (null != var2) {
                  jm.field_k[24] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,25", (byte) 99);
                if (null != var2) {
                  jm.field_k[25] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,26", (byte) 76);
                if (null != var2) {
                  jm.field_k[26] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,27", (byte) 113);
                if (var2 != null) {
                  jm.field_k[27] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,28", (byte) 73);
                if (var2 != null) {
                  jm.field_k[28] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,29", (byte) 81);
                if (null != var2) {
                  jm.field_k[29] = qq.a(var2, false);
                }
                var2 = od.a("loading_phrases,30", (byte) 110);
                if (null != var2) {
                  jm.field_k[30] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,0", (byte) 81);
                if (null != var2) {
                  fr.field_o[0] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,1", (byte) 84);
                if (null != var2) {
                  fr.field_o[1] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,2", (byte) 89);
                if (var2 != null) {
                  fr.field_o[2] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,3", (byte) 101);
                if (null != var2) {
                  fr.field_o[3] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,4", (byte) 106);
                if (var2 != null) {
                  fr.field_o[4] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,5", (byte) 125);
                if (var2 != null) {
                  fr.field_o[5] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,6", (byte) 108);
                if (null != var2) {
                  fr.field_o[6] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,7", (byte) 85);
                if (null != var2) {
                  fr.field_o[7] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,8", (byte) 119);
                if (var2 != null) {
                  fr.field_o[8] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,9", (byte) 93);
                if (var2 != null) {
                  fr.field_o[9] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,10", (byte) 73);
                if (var2 != null) {
                  fr.field_o[10] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,11", (byte) 73);
                if (var2 != null) {
                  fr.field_o[11] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,12", (byte) 115);
                if (var2 != null) {
                  fr.field_o[12] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,13", (byte) 102);
                if (null != var2) {
                  fr.field_o[13] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,14", (byte) 111);
                if (null != var2) {
                  fr.field_o[14] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,15", (byte) 113);
                if (null != var2) {
                  fr.field_o[15] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,16", (byte) 124);
                if (null != var2) {
                  fr.field_o[16] = qq.a(var2, false);
                }
                var2 = od.a("game_finale_reward_names,17", (byte) 89);
                if (var2 != null) {
                  fr.field_o[17] = qq.a(var2, false);
                }
                var2 = od.a("no_rewards", (byte) 85);
                if (null != var2) {
                  kha.field_j = qq.a(var2, false);
                }
                var2 = od.a("loading_phrase_failed", (byte) 96);
                if (var2 != null) {
                  id.field_g = qq.a(var2, false);
                }
                ko.field_g = null;
            }
            void run() {
                var3 = BachelorFridge.field_y;
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
                  stackIn_2085_0 = (RuntimeException) (var2_ref);
                  stackIn_2085_1 = new StringBuilder().append("aha.N(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_2086_2 = "null";
                  } else {
                    stackIn_2086_2 = "{...}";
                  }
                  throw pe.a((Throwable) ((Object) stackIn_2085_0), ((StringBuilder) (Object) stackIn_2085_1).append(stackIn_2086_2).append(')').toString());
                }
                if (ck.field_a != 0) {
                  var3++;
                  BachelorFridge.field_y = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final void a(int param0, int param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param0 != 1) {
            field_D = (fea) null;
          }
          if (this.field_I == null ||
            param1 >= this.field_I.length) {
            var4 = new String[param1 + 1];
            if (this.field_I != null) {
              var5 = 0;
              while (var5 < this.field_I.length) {
                var4[var5] = this.field_I[var5];
                var5++;
                if (var6 != 0) {
                  return;
                }
              }
            }
            this.field_I = var4;
          }
          this.field_I[param1] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("aha.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        try {
          this.a(param2, ((qka) ((Object) this.field_f)).c((wj) (this), false), (byte) 59, param1, param0);
          if (param3 != -50) {
            this.a((byte) 33, 18, 3, 92);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aha.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -78) {
            field_F = (sna) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("aha.W(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final aia b(int param0, int param1, int param2) {
        aia var4 = null;
        RuntimeException var4_ref = null;
        aia var5 = null;
        int var6 = 0;
        aia stackIn_22_0 = null;
        aia stackIn_25_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = BachelorFridge.field_y;
        try {
          if (param1 != 35) {
            this.a(54, 48, (wj) null, 89);
          }
          var4 = (aia) (this.field_G.b((byte) 90));
          L1: while (null != var4) {
            var5 = var4;
            while (true) {
              if (null != var5) {
                stackIn_25_0 = var5;
                if (var6 == 0) {
                  if (stackIn_25_0.field_f <= param2 &&
                    param0 >= var5.field_h &&
                    (var5.field_k + var5.field_f) > param2 &&
                    param0 <= (var5.field_h + var5.field_j)) {
                    stackIn_22_0 = var4;
                    return stackIn_22_0;
                  }
                  var5 = var5.field_i;
                  continue;
                }
              } else {
                stackIn_25_0 = (aia) (this.field_G.c(0));
              }
              break;
            }
            var4 = stackIn_25_0;
            if (var6 == 0) {
              continue L1;
            }
            break;
          }
          stackIn_27_0 = null;
          return (aia) (stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var4_ref), "aha.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        qka var3 = null;
        vv var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        mla var12 = null;
        int var13 = 0;
        int var14 = 0;
        aia var15 = null;
        int var16 = 0;
        int var7Lifetime1;
        var16 = BachelorFridge.field_y;
        try {
          this.field_G = new eaa();
          var2_int = 0;
          var3 = (qka) ((Object) this.field_f);
          var4 = var3.b((wj) (this), false);
          L0: while (true) {
            var5 = this.field_w.indexOf("<hotspot=", var2_int);
            stackIn_3_0 = -1;
            stackIn_3_1 = var5;
            L1: while (stackIn_3_0 != stackIn_3_1 ||
              var16 != 0) {
              var7 = this.field_w.indexOf(">", var5);
              var6 = this.field_w.substring(9 + var5, var7);
              var7Lifetime1 = Integer.parseInt(var6);
              var2_int = this.field_w.indexOf("</hotspot>", var5);
              var8 = var4.a(101, var5);
              var9 = var4.a(param0 ^ 21703, var2_int);
              var10 = null;
              var11 = var8;
              while (var11 <= var9) {
                var12 = var4.field_a[var11];
                stackIn_3_0 = var11;
                stackIn_3_1 = var8;
                if (var16 != 0) {
                  continue L1;
                }
                if (stackIn_3_0 != stackIn_3_1) {
                  stackIn_12_0 = var12.field_a[0];
                } else {
                  stackIn_12_0 = var4.a(var5, (byte) -99);
                }
                var13 = stackIn_12_0;
                if (var9 == var11) {
                  stackIn_20_0 = var4.a(var2_int, (byte) -99);
                } else {
                  if (var12 != null) {
                    stackIn_20_0 = var12.field_a[-1 + var12.field_a.length];
                  } else {
                    stackIn_20_0 = 0;
                  }
                }
                var14 = stackIn_20_0;
                var15 = new aia(var7Lifetime1, var13, var12.field_c, -var13 + var14, Math.max(var3.a(-30983), var12.field_d - var12.field_c));
                if (null != var10) {
                  ((aia) (var10)).field_i = var15;
                }
                var10 = var15;
                this.field_G.a(var15, true);
                var11++;
              }
              if (var16 == 0) {
                continue L0;
              }
              break;
            }
            break;
          }
          if (param0 != 21646) {
            field_D = (fea) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aha.F(" + param0 + ')');
        }
    }

    void a(int param0, int param1, wj param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          super.a(param0, param1, param2, param3);
          this.field_E = null;
          if (this.field_t) {
            var5_int = -this.field_s + (-param0 + mk.field_p);
            var6 = -this.field_v - param1 + gd.field_m;
            this.field_E = this.b(var6, param3 ^ 55, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("aha.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(byte param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        qka var6 = null;
        aia var7 = null;
        RuntimeException decompiledCaughtException = null;
        int var8 = 0;
        int var9 = 0;
        try {
          super.a((byte) 89, param1, param2, param3);
          if (param2 != 0) {
            return;
          }
          var5_int = -110 % ((-20 - param0) / 54);
          var6 = (qka) ((Object) this.field_f);
          var7 = this.field_E;
          if (var7 != null) {
            var8 = var6.a(param3, 0, (wj) (this));
            var9 = var6.a((wj) (this), param1, (byte) -54);
            do {
              uv.a(var7.field_k + 2, -2 + var9 + var7.field_h, var7.field_j + 2, var8 + var7.field_f - 2, false);
              var7 = var7.field_i;
            } while (null != var7);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "aha.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    String c(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_7_0 = null;
        String stackIn_10_0 = null;
        Object stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_E &&
            this.field_I != null) {
            if (param0 != 16) {
              stackIn_10_0 = (String) null;
              return stackIn_10_0;
            }
            if (this.field_E.field_g >= this.field_I.length) {
              stackIn_15_0 = null;
              return (String) (stackIn_15_0);
            }
            stackIn_17_0 = this.field_I[this.field_E.field_g];
            return stackIn_17_0;
          }
          stackIn_7_0 = null;
          return (String) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "aha.U(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_A = (int[][]) null;
          field_H = null;
          if (!param0) {
            aha.a((byte) 76, (vr) null);
          }
          field_F = null;
          field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "aha.G(" + param0 + ')');
        }
    }

    static {
        field_A = new int[][]{new int[]{7209476, 13763592}, new int[]{10679955, 4055617}, new int[]{9847300, 13212502}};
        field_H = "The game options are not all set.";
    }
}
