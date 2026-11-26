/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    static lk field_e;
    static String[] field_b;
    static long field_d;
    static int field_c;
    static IntrusiveDeque field_a;

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -72) {
            return true;
          }
          stackIn_10_0 = (!ta.p(3)) && (wb.field_S > 0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var1), "ib.D(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ii.field_g) {
            ld.a(false, param0);
            return;
          }
          if (param3 <= 92) {
            ib.a(-63);
          }
          if (ta.p(3)) {
            return;
          }
          var4_int = 20 * (11 * param1 + param2) + fl.d(-78);
          tf.field_a = var4_int;
          stackIn_14_0 = (param0 == 0) ? 3 : 1;
          var5 = stackIn_14_0;
          stackIn_18_0 = (param0 != 0) ? 65534 : 65532;
          var6 = stackIn_18_0;
          ch.field_h = oa.a(new int[]{var4_int}, 3, var5, ei.field_l, ja.field_d, false, var6, var4_int + u.field_e, MidiPcmStream.field_r + qb.field_k);
          ld.a(false, param0);
          param1 = 0;
          u.field_e = u.field_e - (ja.field_d + MidiPcmStream.field_r);
          ei.field_l = ei.field_l + 1;
          MidiPcmStream.field_r = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "ib.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(ResourceArchive param0, byte param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1324_0;
            StringBuilder stackIn_1324_1;
            String stackIn_1325_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            ResourceArchive param0;
            byte param1;
            boolean finished;
            $CfrPartitionedBody(ResourceArchive initialParam0, byte initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1324_0 = null;
                this.stackIn_1324_1 = null;
                this.stackIn_1325_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                ll.field_e = param0;
                var2 = mk.b("vengeance_expansion", (byte) -121);
                if (var2 != null) {
                  aj.field_g = PcmResampler.a(127, var2);
                }
                var2 = mk.b("vengeance_expansion_installed", (byte) -122);
                if (var2 != null) {
                  eg.field_j = PcmResampler.a(122, var2);
                }
                var2 = mk.b("vengeance_benefits,0", (byte) -121);
                if (var2 != null) {
                  MouseInput.field_i[0] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("vengeance_benefits,1", (byte) -124);
                if (var2 != null) {
                  MouseInput.field_i[1] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("vengeance_benefits,2", (byte) -127);
                if (var2 != null) {
                  MouseInput.field_i[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("level_set_kerrus", (byte) -123);
                if (null != var2) {
                  c.field_b = PcmResampler.a(127, var2);
                }
                var2 = mk.b("level_set_vengeance", (byte) -122);
                if (null != var2) {
                  og.field_e = PcmResampler.a(125, var2);
                }
                var2 = mk.b("highscores_levelset,0", (byte) -126);
                if (null != var2) {
                  q.field_m[0] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("highscores_levelset,1", (byte) -128);
                if (null != var2) {
                  q.field_m[1] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("retry_mission", (byte) -125);
                if (var2 != null) {
                  f.field_c = PcmResampler.a(126, var2);
                }
                var2 = mk.b("health_percent", (byte) -121);
                if (var2 != null) {
                  PcmResampler.a(125, var2);
                }
                var2 = mk.b("expansion_installed", (byte) -125);
                if (var2 != null) {
                  PcmResampler.a(126, var2);
                }
                var2 = mk.b("menu_title__level_set", (byte) -128);
                if (var2 != null) {
                  il.field_e = PcmResampler.a(125, var2);
                }
                var2 = mk.b("menu_title_mission_select", (byte) -127);
                if (var2 != null) {
                  nl.field_f = PcmResampler.a(126, var2);
                }
                var2 = mk.b("menu_title_briefing", (byte) -127);
                if (var2 != null) {
                  jf.field_a = PcmResampler.a(126, var2);
                }
                var2 = mk.b("menu_title_console", (byte) -123);
                if (var2 != null) {
                  ad.field_d = PcmResampler.a(125, var2);
                }
                var2 = mk.b("menu_title_level_complete", (byte) -125);
                if (null != var2) {
                  tc.field_d = PcmResampler.a(122, var2);
                }
                var2 = mk.b("menu_title_mission_failed", (byte) -124);
                if (var2 != null) {
                  i.field_e = PcmResampler.a(122, var2);
                }
                var2 = mk.b("menu_title_game_complete", (byte) -128);
                if (null != var2) {
                  MusicPatchPcmStream.field_p = PcmResampler.a(123, var2);
                }
                var2 = mk.b("hardmodeunlock", (byte) -127);
                if (null != var2) {
                  IntrusiveNode.field_a = PcmResampler.a(125, var2);
                }
                var2 = mk.b("selectfrombelow", (byte) -120);
                if (null != var2) {
                  PcmResampler.a(124, var2);
                }
                var2 = mk.b("unreachedtext", (byte) -128);
                if (null != var2) {
                  PcmResampler.a(122, var2);
                }
                var2 = mk.b("lockedtext", (byte) -127);
                if (null != var2) {
                  PcmResampler.a(122, var2);
                }
                var2 = mk.b("completedstring", (byte) -119);
                if (null != var2) {
                  ae.field_r = PcmResampler.a(124, var2);
                }
                var2 = mk.b("parcolon", (byte) -120);
                if (var2 != null) {
                  PcmResampler.a(127, var2);
                }
                var2 = mk.b("timeoverhour", (byte) -124);
                if (null != var2) {
                  PcmResampler.a(125, var2);
                }
                var2 = mk.b("timecolon", (byte) -124);
                if (null != var2) {
                  c.field_e = PcmResampler.a(126, var2);
                }
                var2 = mk.b("levelspace", (byte) -127);
                if (null != var2) {
                  GzipDecompressor.field_d = PcmResampler.a(123, var2);
                }
                var2 = mk.b("misdat13", (byte) -123);
                if (null != var2) {
                  dn.field_g = PcmResampler.a(127, var2);
                }
                var2 = mk.b("misdat12", (byte) -124);
                if (var2 != null) {
                  cn.field_c = PcmResampler.a(123, var2);
                }
                var2 = mk.b("misdat11", (byte) -122);
                if (var2 != null) {
                  rg.field_c = PcmResampler.a(122, var2);
                }
                var2 = mk.b("misdat10", (byte) -126);
                if (var2 != null) {
                  ld.field_q = PcmResampler.a(122, var2);
                }
                var2 = mk.b("misdat9", (byte) -120);
                if (var2 != null) {
                  g.field_O = PcmResampler.a(127, var2);
                }
                var2 = mk.b("misdat8", (byte) -119);
                if (null != var2) {
                  od.field_E = PcmResampler.a(125, var2);
                }
                var2 = mk.b("misdat7", (byte) -122);
                if (null != var2) {
                  id.field_b = PcmResampler.a(126, var2);
                }
                var2 = mk.b("misdat6", (byte) -126);
                if (var2 != null) {
                  ph.field_B = PcmResampler.a(127, var2);
                }
                var2 = mk.b("misdat5", (byte) -124);
                if (var2 != null) {
                  KeyboardInput.field_k = PcmResampler.a(124, var2);
                }
                var2 = mk.b("misdat4", (byte) -119);
                if (var2 != null) {
                  cb.field_h = PcmResampler.a(125, var2);
                }
                var2 = mk.b("misdat3", (byte) -124);
                if (var2 != null) {
                  ie.field_a = PcmResampler.a(122, var2);
                }
                var2 = mk.b("misdat2", (byte) -121);
                if (null != var2) {
                  wi.field_a = PcmResampler.a(123, var2);
                }
                var2 = mk.b("misdat1", (byte) -122);
                if (var2 != null) {
                  vg.field_b = PcmResampler.a(125, var2);
                }
                var2 = mk.b("misdat0", (byte) -120);
                if (null != var2) {
                  pk.field_j = PcmResampler.a(123, var2);
                }
                var2 = mk.b("scorenum", (byte) -120);
                if (var2 != null) {
                  hj.field_s = PcmResampler.a(123, var2);
                }
                var2 = mk.b("levelscompleted", (byte) -127);
                if (var2 != null) {
                  GameCanvas.field_f = PcmResampler.a(122, var2);
                }
                var2 = mk.b("totalalienskilled", (byte) -120);
                if (var2 != null) {
                  bi.field_f = PcmResampler.a(126, var2);
                }
                var2 = mk.b("timeplayedcolon", (byte) -125);
                if (var2 != null) {
                  PcmResampler.a(122, var2);
                }
                var2 = mk.b("totalcompletedtimecolon", (byte) -125);
                if (null != var2) {
                  DirectByteStorage.field_m = PcmResampler.a(124, var2);
                }
                var2 = mk.b("partimecolon", (byte) -128);
                if (null != var2) {
                  ki.field_d = PcmResampler.a(122, var2);
                }
                var2 = mk.b("leveltimecolon", (byte) -120);
                if (null != var2) {
                  c.field_d = PcmResampler.a(123, var2);
                }
                var2 = mk.b("totaltimecolon", (byte) -123);
                if (var2 != null) {
                  oa.field_j = PcmResampler.a(124, var2);
                }
                var2 = mk.b("newtag0", (byte) -125);
                if (var2 != null) {
                  DirectByteStorage.field_l = PcmResampler.a(126, var2);
                }
                var2 = mk.b("newtag1", (byte) -128);
                if (null != var2) {
                  PcmResampler.field_d = PcmResampler.a(124, var2);
                }
                var2 = mk.b("maxhealthinc", (byte) -127);
                if (null != var2) {
                  PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,0", (byte) -124);
                if (null != var2) {
                  il.field_b[0] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,1", (byte) -119);
                if (null != var2) {
                  il.field_b[1] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,2", (byte) -121);
                if (var2 != null) {
                  il.field_b[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,3", (byte) -121);
                if (var2 != null) {
                  il.field_b[3] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,4", (byte) -119);
                if (null != var2) {
                  il.field_b[4] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,5", (byte) -122);
                if (var2 != null) {
                  il.field_b[5] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,6", (byte) -126);
                if (var2 != null) {
                  il.field_b[6] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,7", (byte) -123);
                if (null != var2) {
                  il.field_b[7] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,8", (byte) -121);
                if (null != var2) {
                  il.field_b[8] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_names,9", (byte) -122);
                if (param1 < 26) {
                  field_e = (lk) null;
                }
                if (var2 != null) {
                  il.field_b[9] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,10", (byte) -127);
                if (var2 != null) {
                  il.field_b[10] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,11", (byte) -121);
                if (null != var2) {
                  il.field_b[11] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_names,12", (byte) -121);
                if (var2 != null) {
                  il.field_b[12] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,13", (byte) -128);
                if (var2 != null) {
                  il.field_b[13] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,14", (byte) -120);
                if (var2 != null) {
                  il.field_b[14] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,15", (byte) -123);
                if (null != var2) {
                  il.field_b[15] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,16", (byte) -121);
                if (null != var2) {
                  il.field_b[16] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,17", (byte) -119);
                if (var2 != null) {
                  il.field_b[17] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,18", (byte) -128);
                if (var2 != null) {
                  il.field_b[18] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,19", (byte) -119);
                if (null != var2) {
                  il.field_b[19] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,20", (byte) -121);
                if (null != var2) {
                  il.field_b[20] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,21", (byte) -121);
                if (null != var2) {
                  il.field_b[21] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,22", (byte) -121);
                if (null != var2) {
                  il.field_b[22] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,23", (byte) -119);
                if (null != var2) {
                  il.field_b[23] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,24", (byte) -124);
                if (var2 != null) {
                  il.field_b[24] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,25", (byte) -128);
                if (var2 != null) {
                  il.field_b[25] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,26", (byte) -120);
                if (null != var2) {
                  il.field_b[26] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,27", (byte) -128);
                if (null != var2) {
                  il.field_b[27] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,28", (byte) -120);
                if (null != var2) {
                  il.field_b[28] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,29", (byte) -122);
                if (var2 != null) {
                  il.field_b[29] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,30", (byte) -128);
                if (null != var2) {
                  il.field_b[30] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,31", (byte) -125);
                if (var2 != null) {
                  il.field_b[31] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,32", (byte) -124);
                if (var2 != null) {
                  il.field_b[32] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_names,33", (byte) -126);
                if (null != var2) {
                  il.field_b[33] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,34", (byte) -128);
                if (null != var2) {
                  il.field_b[34] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,35", (byte) -128);
                if (null != var2) {
                  il.field_b[35] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,36", (byte) -121);
                if (var2 != null) {
                  il.field_b[36] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,37", (byte) -121);
                if (var2 != null) {
                  il.field_b[37] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_names,38", (byte) -124);
                if (null != var2) {
                  il.field_b[38] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_names,39", (byte) -127);
                if (null != var2) {
                  il.field_b[39] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_names,40", (byte) -128);
                if (var2 != null) {
                  il.field_b[40] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_names,41", (byte) -120);
                if (null != var2) {
                  il.field_b[41] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_criteria,0", (byte) -121);
                if (null != var2) {
                  bh.field_g[0] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,1", (byte) -128);
                if (null != var2) {
                  bh.field_g[1] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,2", (byte) -127);
                if (null != var2) {
                  bh.field_g[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,3", (byte) -126);
                if (var2 != null) {
                  bh.field_g[3] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,4", (byte) -126);
                if (null != var2) {
                  bh.field_g[4] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_criteria,5", (byte) -121);
                if (null != var2) {
                  bh.field_g[5] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,6", (byte) -128);
                if (null != var2) {
                  bh.field_g[6] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,7", (byte) -121);
                if (null != var2) {
                  bh.field_g[7] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_criteria,8", (byte) -121);
                if (var2 != null) {
                  bh.field_g[8] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,9", (byte) -123);
                if (null != var2) {
                  bh.field_g[9] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,10", (byte) -120);
                if (null != var2) {
                  bh.field_g[10] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,11", (byte) -120);
                if (null != var2) {
                  bh.field_g[11] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,12", (byte) -125);
                if (null != var2) {
                  bh.field_g[12] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,13", (byte) -122);
                if (var2 != null) {
                  bh.field_g[13] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,14", (byte) -125);
                if (var2 != null) {
                  bh.field_g[14] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,15", (byte) -120);
                if (var2 != null) {
                  bh.field_g[15] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,16", (byte) -122);
                if (var2 != null) {
                  bh.field_g[16] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_criteria,17", (byte) -122);
                if (var2 != null) {
                  bh.field_g[17] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,18", (byte) -126);
                if (null != var2) {
                  bh.field_g[18] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,19", (byte) -124);
                if (null != var2) {
                  bh.field_g[19] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,20", (byte) -122);
                if (null != var2) {
                  bh.field_g[20] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,21", (byte) -123);
                if (var2 != null) {
                  bh.field_g[21] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,22", (byte) -126);
                if (null != var2) {
                  bh.field_g[22] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,23", (byte) -121);
                if (null != var2) {
                  bh.field_g[23] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,24", (byte) -121);
                if (var2 != null) {
                  bh.field_g[24] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,25", (byte) -125);
                if (var2 != null) {
                  bh.field_g[25] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,26", (byte) -125);
                if (null != var2) {
                  bh.field_g[26] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_criteria,27", (byte) -121);
                if (var2 != null) {
                  bh.field_g[27] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,28", (byte) -124);
                if (var2 != null) {
                  bh.field_g[28] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("achievement_criteria,29", (byte) -120);
                if (null != var2) {
                  bh.field_g[29] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,30", (byte) -125);
                if (null != var2) {
                  bh.field_g[30] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_criteria,31", (byte) -121);
                if (var2 != null) {
                  bh.field_g[31] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_criteria,32", (byte) -122);
                if (null != var2) {
                  bh.field_g[32] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,33", (byte) -126);
                if (var2 != null) {
                  bh.field_g[33] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,34", (byte) -119);
                if (var2 != null) {
                  bh.field_g[34] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("achievement_criteria,35", (byte) -128);
                if (var2 != null) {
                  bh.field_g[35] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,36", (byte) -126);
                if (null != var2) {
                  bh.field_g[36] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("achievement_criteria,37", (byte) -123);
                if (var2 != null) {
                  bh.field_g[37] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("achievement_criteria,38", (byte) -126);
                if (var2 != null) {
                  bh.field_g[38] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("achievement_criteria,39", (byte) -128);
                if (var2 != null) {
                  bh.field_g[39] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,40", (byte) -123);
                if (var2 != null) {
                  bh.field_g[40] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("achievement_criteria,41", (byte) -128);
                if (null != var2) {
                  bh.field_g[41] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("ratings,0", (byte) -125);
                if (var2 != null) {
                  bi.field_c[0] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,1", (byte) -127);
                if (null != var2) {
                  bi.field_c[1] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("ratings,2", (byte) -120);
                if (var2 != null) {
                  bi.field_c[2] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,3", (byte) -123);
                if (var2 != null) {
                  bi.field_c[3] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratings,4", (byte) -119);
                if (var2 != null) {
                  bi.field_c[4] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratings,5", (byte) -120);
                if (var2 != null) {
                  bi.field_c[5] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratings,6", (byte) -123);
                if (var2 != null) {
                  bi.field_c[6] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratings,7", (byte) -128);
                if (var2 != null) {
                  bi.field_c[7] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,8", (byte) -127);
                if (null != var2) {
                  bi.field_c[8] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratings,9", (byte) -127);
                if (null != var2) {
                  bi.field_c[9] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,10", (byte) -123);
                if (null != var2) {
                  bi.field_c[10] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("ratings,11", (byte) -120);
                if (var2 != null) {
                  bi.field_c[11] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratings,12", (byte) -128);
                if (null != var2) {
                  bi.field_c[12] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,13", (byte) -125);
                if (null != var2) {
                  bi.field_c[13] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("ratings,14", (byte) -123);
                if (null != var2) {
                  bi.field_c[14] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratings,15", (byte) -121);
                if (var2 != null) {
                  bi.field_c[15] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratings,16", (byte) -128);
                if (null != var2) {
                  bi.field_c[16] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratings,17", (byte) -119);
                if (var2 != null) {
                  bi.field_c[17] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratings,18", (byte) -122);
                if (null != var2) {
                  bi.field_c[18] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("ratings,19", (byte) -128);
                if (var2 != null) {
                  bi.field_c[19] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,0", (byte) -126);
                if (var2 != null) {
                  t.field_k[0] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,1", (byte) -123);
                if (null != var2) {
                  t.field_k[1] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratingsshort,2", (byte) -125);
                if (null != var2) {
                  t.field_k[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,3", (byte) -120);
                if (null != var2) {
                  t.field_k[3] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratingsshort,4", (byte) -126);
                if (var2 != null) {
                  t.field_k[4] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("ratingsshort,5", (byte) -126);
                if (null != var2) {
                  t.field_k[5] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratingsshort,6", (byte) -122);
                if (null != var2) {
                  t.field_k[6] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("ratingsshort,7", (byte) -128);
                if (null != var2) {
                  t.field_k[7] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratingsshort,8", (byte) -121);
                if (var2 != null) {
                  t.field_k[8] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,9", (byte) -120);
                if (null != var2) {
                  t.field_k[9] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratingsshort,10", (byte) -119);
                if (var2 != null) {
                  t.field_k[10] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,11", (byte) -125);
                if (var2 != null) {
                  t.field_k[11] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("ratingsshort,12", (byte) -124);
                if (var2 != null) {
                  t.field_k[12] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratingsshort,13", (byte) -125);
                if (null != var2) {
                  t.field_k[13] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,14", (byte) -125);
                if (null != var2) {
                  t.field_k[14] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ratingsshort,15", (byte) -128);
                if (var2 != null) {
                  t.field_k[15] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratingsshort,16", (byte) -126);
                if (var2 != null) {
                  t.field_k[16] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratingsshort,17", (byte) -128);
                if (var2 != null) {
                  t.field_k[17] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ratingsshort,18", (byte) -127);
                if (var2 != null) {
                  t.field_k[18] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("ratingsshort,19", (byte) -128);
                if (null != var2) {
                  t.field_k[19] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("enterbriefing", (byte) -128);
                if (null != var2) {
                  bl.field_e = PcmResampler.a(123, var2);
                }
                var2 = mk.b("contbriefing", (byte) -127);
                if (var2 != null) {
                  em.field_b = PcmResampler.a(124, var2);
                }
                var2 = mk.b("startmission", (byte) -127);
                if (var2 != null) {
                  gn.field_l = PcmResampler.a(127, var2);
                }
                var2 = mk.b("starthardmode", (byte) -128);
                if (null != var2) {
                  ByteStorage.field_e = PcmResampler.a(124, var2);
                }
                var2 = mk.b("switch_level_set", (byte) -127);
                if (var2 != null) {
                  ia.field_k = PcmResampler.a(126, var2);
                }
                var2 = mk.b("healthtext", (byte) -120);
                if (var2 != null) {
                  PcmResampler.a(127, var2);
                }
                var2 = mk.b("pointcount", (byte) -126);
                if (var2 != null) {
                  el.field_i = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ESCformenu", (byte) -126);
                if (null != var2) {
                  hk.field_k = PcmResampler.a(123, var2);
                }
                var2 = mk.b("etodrop", (byte) -119);
                if (null != var2) {
                  PcmResampler.a(126, var2);
                }
                var2 = mk.b("qtodrop", (byte) -124);
                if (var2 != null) {
                  PcmResampler.a(126, var2);
                }
                var2 = mk.b("emptygun", (byte) -123);
                if (null != var2) {
                  nf.field_p = PcmResampler.a(125, var2);
                }
                var2 = mk.b("pistol_ammo_symbol", (byte) -121);
                if (var2 != null) {
                  pc.field_b = PcmResampler.a(124, var2);
                }
                var2 = mk.b("tut6", (byte) -123);
                if (var2 != null) {
                  rf.field_q = PcmResampler.a(122, var2);
                }
                var2 = mk.b("tut5", (byte) -120);
                if (null != var2) {
                  wj.field_G = PcmResampler.a(126, var2);
                }
                var2 = mk.b("tut4", (byte) -127);
                if (null != var2) {
                  jn.field_E = PcmResampler.a(124, var2);
                }
                var2 = mk.b("tut3", (byte) -128);
                if (var2 != null) {
                  sj.field_d = PcmResampler.a(125, var2);
                }
                var2 = mk.b("tut2", (byte) -126);
                if (var2 != null) {
                  ki.field_a = PcmResampler.a(122, var2);
                }
                var2 = mk.b("tut1", (byte) -119);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_V = PcmResampler.a(124, var2);
                }
                var2 = mk.b("tut0", (byte) -120);
                if (null != var2) {
                  IntrusiveNode.field_b = PcmResampler.a(127, var2);
                }
                var2 = mk.b("weaponsbroke", (byte) -121);
                if (var2 != null) {
                  hi.field_m = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ammoname,0", (byte) -124);
                if (var2 != null) {
                  lg.field_n[0] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ammoname,1", (byte) -120);
                if (null != var2) {
                  lg.field_n[1] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("ammoname,2", (byte) -119);
                if (null != var2) {
                  lg.field_n[2] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("ammoname,3", (byte) -123);
                if (null != var2) {
                  lg.field_n[3] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("pistolname", (byte) -126);
                if (null != var2) {
                  IsaacGenerator.field_m = PcmResampler.a(122, var2);
                }
                var2 = mk.b("gunname,0", (byte) -127);
                if (null != var2) {
                  rf.field_s[0] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("gunname,1", (byte) -123);
                if (var2 != null) {
                  rf.field_s[1] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("gunname,2", (byte) -122);
                if (null != var2) {
                  rf.field_s[2] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("gunname,3", (byte) -128);
                if (var2 != null) {
                  rf.field_s[3] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("gunname,4", (byte) -126);
                if (null != var2) {
                  rf.field_s[4] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("gunname,5", (byte) -123);
                if (var2 != null) {
                  rf.field_s[5] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("gunname,6", (byte) -120);
                if (var2 != null) {
                  rf.field_s[6] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("powerup_name,0", (byte) -126);
                if (null != var2) {
                  bm.field_e[0] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("powerup_name,1", (byte) -125);
                if (null != var2) {
                  bm.field_e[1] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("powerup_name,2", (byte) -120);
                if (var2 != null) {
                  bm.field_e[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("powerup_name,3", (byte) -127);
                if (var2 != null) {
                  bm.field_e[3] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("powerup_name,4", (byte) -123);
                if (var2 != null) {
                  bm.field_e[4] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("powerup_name,5", (byte) -122);
                if (var2 != null) {
                  bm.field_e[5] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("powerup_name,6", (byte) -128);
                if (null != var2) {
                  bm.field_e[6] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("powerup_name,7", (byte) -127);
                if (var2 != null) {
                  bm.field_e[7] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("powerup_name,8", (byte) -120);
                if (null != var2) {
                  bm.field_e[8] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("powerup_name,9", (byte) -120);
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  bm.field_e[9] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("powerup_name,10", (byte) -123);
                if (null != var2) {
                  bm.field_e[10] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("powerup_name,11", (byte) -122);
                if (var2 != null) {
                  bm.field_e[11] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("obscured_description", (byte) -127);
                if (var2 != null) {
                  SpriteGeometry.field_t = PcmResampler.a(126, var2);
                }
                var2 = mk.b("settings_option", (byte) -119);
                if (var2 != null) {
                  ln.field_h = PcmResampler.a(122, var2);
                }
                var2 = mk.b("end_game", (byte) -120);
                if (null != var2) {
                  jh.field_bb = PcmResampler.a(126, var2);
                }
                var2 = mk.b("score_headings,0", (byte) -122);
                if (null != var2) {
                  ii.field_f[0] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("score_headings,1", (byte) -119);
                if (null != var2) {
                  ii.field_f[1] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("score_headings,2", (byte) -127);
                if (null != var2) {
                  ii.field_f[2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("score_headings,3", (byte) -121);
                if (null != var2) {
                  ii.field_f[3] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,0", (byte) -123);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][0] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,1", (byte) -120);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][1] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,2", (byte) -123);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[0][2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,3", (byte) -125);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][3] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,4", (byte) -124);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][4] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,5", (byte) -119);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][5] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,6", (byte) -125);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][6] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,7", (byte) -119);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][7] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,8", (byte) -119);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][8] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,9", (byte) -126);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][9] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("LEVEL_NAMES,0,10", (byte) -120);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[0][10] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,0", (byte) -126);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[1][0] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,1", (byte) -128);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[1][1] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,2", (byte) -123);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][2] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,3", (byte) -120);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][3] = PcmResampler.a(125, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,4", (byte) -125);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][4] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,5", (byte) -124);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][5] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,6", (byte) -122);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][6] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,7", (byte) -128);
                if (var2 != null) {
                  VolumeRampingMidiPcmStream.field_fb[1][7] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,8", (byte) -121);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[1][8] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("LEVEL_NAMES,1,9", (byte) -123);
                if (null != var2) {
                  VolumeRampingMidiPcmStream.field_fb[1][9] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("kerrus_intro", (byte) -127);
                if (null != var2) {
                  il.field_a = PcmResampler.a(126, var2);
                }
                var2 = mk.b("vengeance_intro", (byte) -125);
                if (var2 != null) {
                  tf.field_e = PcmResampler.a(127, var2);
                }
                var2 = mk.b("intro_clicktostart", (byte) -120);
                if (var2 != null) {
                  lb.field_c = PcmResampler.a(123, var2);
                }
                var2 = mk.b("intro_clicktoskip", (byte) -120);
                if (null != var2) {
                  jd.field_x = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V1_wake_up", (byte) -128);
                if (null != var2) {
                  tm.field_s = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V1_lift_bust", (byte) -127);
                if (null != var2) {
                  el.field_g = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V1_door_locked", (byte) -122);
                if (var2 != null) {
                  ih.field_z = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V1_lift_fixed", (byte) -119);
                if (var2 != null) {
                  im.field_d = PcmResampler.a(123, var2);
                }
                var2 = mk.b("oV1_findlift", (byte) -120);
                if (var2 != null) {
                  vb.field_Fb = PcmResampler.a(125, var2);
                }
                var2 = mk.b("oV1_reachconsole", (byte) -121);
                if (null != var2) {
                  sm.field_a = PcmResampler.a(125, var2);
                }
                var2 = mk.b("oV1_reachlift", (byte) -125);
                if (var2 != null) {
                  wk.field_f = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V2_found_grenade_launcher", (byte) -120);
                if (var2 != null) {
                  ab.field_d = PcmResampler.a(125, var2);
                }
                var2 = mk.b("V2_lift_bust", (byte) -119);
                if (var2 != null) {
                  ta.field_lb = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V2_door_locked", (byte) -119);
                if (null != var2) {
                  ch.field_b = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V2_found_key", (byte) -122);
                if (var2 != null) {
                  re.field_B = PcmResampler.a(125, var2);
                }
                var2 = mk.b("V2_lift_fixed", (byte) -123);
                if (null != var2) {
                  AccountServiceResult.field_h = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV2_reachconsoles", (byte) -121);
                if (var2 != null) {
                  ac.field_f = PcmResampler.a(124, var2);
                }
                var2 = mk.b("oV2_reachlift", (byte) -127);
                if (null != var2) {
                  aa.field_c = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V3_after_earthquake", (byte) -128);
                if (null != var2) {
                  ra.field_f = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V3_notice_vent", (byte) -126);
                if (null != var2) {
                  eg.field_l = PcmResampler.a(122, var2);
                }
                var2 = mk.b("oV3_reachconsole", (byte) -127);
                if (var2 != null) {
                  ih.field_u = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV3_reachlift", (byte) -128);
                if (var2 != null) {
                  q.field_a = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V4_lift_needs_power", (byte) -127);
                if (null != var2) {
                  vf.field_I = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V4_notice_turrets", (byte) -120);
                if (null != var2) {
                  bc.field_k = PcmResampler.a(125, var2);
                }
                var2 = mk.b("V4_notice_guard", (byte) -123);
                if (null != var2) {
                  AccountServiceResult.field_f = PcmResampler.a(124, var2);
                }
                var2 = mk.b("V4_notice_launcher", (byte) -120);
                if (null != var2) {
                  bn.field_n = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V4_notice_railgun", (byte) -127);
                if (var2 != null) {
                  m.field_k = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV4_reachlift", (byte) -128);
                if (var2 != null) {
                  tc.field_c = PcmResampler.a(125, var2);
                }
                var2 = mk.b("oV4_activatereactor", (byte) -125);
                if (null != var2) {
                  q.field_l = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V5_notice_fence", (byte) -125);
                if (var2 != null) {
                  PacketBuffer.field_o = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V5_notice_turrets", (byte) -124);
                if (null != var2) {
                  ta.field_kb = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV5_reachconsole", (byte) -120);
                if (var2 != null) {
                  jk.field_a = PcmResampler.a(122, var2);
                }
                var2 = mk.b("oV5_reachlift", (byte) -125);
                if (var2 != null) {
                  MusicPatchPcmStream.field_m = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V6_blastdoor", (byte) -123);
                if (var2 != null) {
                  td.field_p = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V6_launcher", (byte) -121);
                if (null != var2) {
                  sa.field_e = PcmResampler.a(124, var2);
                }
                var2 = mk.b("V6_eggs", (byte) -123);
                if (var2 != null) {
                  sa.field_b = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V6_progress", (byte) -121);
                if (null != var2) {
                  bj.field_h = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V6_moreeggs", (byte) -120);
                if (var2 != null) {
                  u.field_b = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V6_quiet", (byte) -120);
                if (var2 != null) {
                  m.field_j = PcmResampler.a(123, var2);
                }
                var2 = mk.b("V6_crates", (byte) -122);
                if (var2 != null) {
                  eg.field_p = PcmResampler.a(125, var2);
                }
                var2 = mk.b("V6_morecrates", (byte) -124);
                if (null != var2) {
                  qa.field_a = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V6_rockets_good", (byte) -128);
                if (null != var2) {
                  DualLinkDeque.field_f = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V6_rockets_bad", (byte) -119);
                if (var2 != null) {
                  m.field_p = PcmResampler.a(125, var2);
                }
                var2 = mk.b("V6_w00t", (byte) -123);
                if (var2 != null) {
                  bi.field_e = PcmResampler.a(126, var2);
                }
                var2 = mk.b("V6_carefulreactors", (byte) -119);
                if (null != var2) {
                  e.field_k = PcmResampler.a(127, var2);
                }
                var2 = mk.b("oV6_reachlift", (byte) -125);
                if (var2 != null) {
                  bj.field_i = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V7_nowplantcharges", (byte) -123);
                if (null != var2) {
                  CrossfadingMidiPcmStream.field_E = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V7_nowleave", (byte) -120);
                if (null != var2) {
                  ea.field_b = PcmResampler.a(124, var2);
                }
                var2 = mk.b("oV7_findcharges", (byte) -119);
                if (var2 != null) {
                  pk.field_n = PcmResampler.a(127, var2);
                }
                var2 = mk.b("oV7_plantcharges", (byte) -120);
                if (null != var2) {
                  cg.field_c = PcmResampler.a(125, var2);
                }
                var2 = mk.b("oV7_reachlift", (byte) -123);
                if (var2 != null) {
                  mc.field_L = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V8_wayblocked", (byte) -120);
                if (null != var2) {
                  we.field_h = PcmResampler.a(122, var2);
                }
                var2 = mk.b("V8_shiptrapped", (byte) -119);
                if (var2 != null) {
                  ch.field_f = PcmResampler.a(125, var2);
                }
                var2 = mk.b("oV8_reachshuttle", (byte) -128);
                if (var2 != null) {
                  e.field_m = PcmResampler.a(127, var2);
                }
                var2 = mk.b("V9_dark", (byte) -121);
                if (var2 != null) {
                  ke.field_w = PcmResampler.a(124, var2);
                }
                var2 = mk.b("oV9_reachlift", (byte) -127);
                if (null != var2) {
                  tc.field_e = PcmResampler.a(124, var2);
                }
                var2 = mk.b("V10_escape", (byte) -121);
                if (var2 != null) {
                  je.field_b = PcmResampler.a(124, var2);
                }
                var2 = mk.b("V10_stellar", (byte) -122);
                if (var2 != null) {
                  qh.field_c = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV10_findqueen", (byte) -128);
                if (var2 != null) {
                  o.field_l = PcmResampler.a(126, var2);
                }
                var2 = mk.b("oV10_killqueen", (byte) -123);
                if (null != var2) {
                  CipherPacketBuffer.field_v = PcmResampler.a(122, var2);
                }
                var2 = mk.b("oV10_escape", (byte) -123);
                if (null != var2) {
                  cj.field_K = PcmResampler.a(122, var2);
                }
                var2 = mk.b("chargescolon", (byte) -125);
                if (null != var2) {
                  ph.field_z = PcmResampler.a(123, var2);
                }
                var2 = mk.b("chargesplantedcolon", (byte) -124);
                if (null != var2) {
                  KeyboardInput.field_a = PcmResampler.a(126, var2);
                }
                var2 = mk.b("findthe_txt", (byte) -122);
                if (null != var2) {
                  sf.field_Y = PcmResampler.a(126, var2);
                }
                var2 = mk.b("wonderwhatthisisfor", (byte) -125);
                if (null != var2) {
                  ch.field_k = PcmResampler.a(122, var2);
                }
                var2 = mk.b("ratingdashfaff", (byte) -125);
                if (var2 != null) {
                  ag.field_j = PcmResampler.a(123, var2);
                }
                var2 = mk.b("desc_plasma_cannon", (byte) -125);
                if (null != var2) {
                  m.field_r = PcmResampler.a(125, var2);
                }
                var2 = mk.b("desc_railgun", (byte) -122);
                if (var2 != null) {
                  vb.field_Hb = PcmResampler.a(123, var2);
                }
                var2 = mk.b("desc_rocket_launcher", (byte) -123);
                if (var2 != null) {
                  di.field_c = PcmResampler.a(126, var2);
                }
                var2 = mk.b("desc_flamethrower", (byte) -124);
                if (null != var2) {
                  tk.field_b = PcmResampler.a(126, var2);
                }
                var2 = mk.b("desc_cragcannon", (byte) -127);
                if (null != var2) {
                  h.field_f = PcmResampler.a(127, var2);
                }
                var2 = mk.b("desc_autogun", (byte) -127);
                if (null != var2) {
                  uj.field_q = PcmResampler.a(124, var2);
                }
                var2 = mk.b("desc_pistol", (byte) -125);
                if (var2 != null) {
                  MidiPcmStream.field_A = PcmResampler.a(126, var2);
                }
                var2 = mk.b("desc_grenade_launcher", (byte) -126);
                if (null != var2) {
                  od.field_C = PcmResampler.a(126, var2);
                }
                var2 = mk.b("weapontitle", (byte) -125);
                if (var2 != null) {
                  mb.field_k = PcmResampler.a(126, var2);
                }
                var2 = mk.b("desc_powerup_health", (byte) -123);
                if (null != var2) {
                  od.field_B = PcmResampler.a(126, var2);
                }
                var2 = mk.b("desc_explosive_charge", (byte) -123);
                if (var2 != null) {
                  mf.field_a = PcmResampler.a(125, var2);
                }
                var2 = mk.b("desc_powerup_security_pass", (byte) -119);
                if (null != var2) {
                  ha.field_x = PcmResampler.a(127, var2);
                }
                var2 = mk.b("poweruptitle", (byte) -119);
                if (var2 != null) {
                  al.field_O = PcmResampler.a(123, var2);
                }
                var2 = mk.b("beatingheart", (byte) -127);
                if (var2 != null) {
                  ga.field_c = PcmResampler.a(123, var2);
                }
                var2 = mk.b("armourequalsawesome", (byte) -124);
                if (null != var2) {
                  eh.field_h = PcmResampler.a(126, var2);
                }
                var2 = mk.b("bigdoorisbad", (byte) -123);
                if (var2 != null) {
                  MouseWheelInput.field_a = PcmResampler.a(123, var2);
                }
                var2 = mk.b("barrelgoboom", (byte) -128);
                if (null != var2) {
                  ln.field_p = PcmResampler.a(122, var2);
                }
                var2 = mk.b("doorsopen", (byte) -121);
                if (var2 != null) {
                  g.field_K = PcmResampler.a(127, var2);
                }
                var2 = mk.b("ammoisgoodforyou", (byte) -122);
                if (null != var2) {
                  al.field_S = PcmResampler.a(127, var2);
                }
                var2 = mk.b("gameplaytitle", (byte) -121);
                if (null != var2) {
                  jf.field_f = PcmResampler.a(125, var2);
                }
                var2 = mk.b("dothingstowin", (byte) -123);
                if (null != var2) {
                  of.field_b = PcmResampler.a(127, var2);
                }
                var2 = mk.b("leftandrightshoot", (byte) -125);
                if (var2 != null) {
                  tk.field_f = PcmResampler.a(124, var2);
                }
                var2 = mk.b("usethemouseudunce", (byte) -119);
                if (var2 != null) {
                  re.field_I = PcmResampler.a(125, var2);
                }
                var2 = mk.b("openpause", (byte) -124);
                if (null != var2) {
                  u.field_c = PcmResampler.a(127, var2);
                }
                var2 = mk.b("selectprimary", (byte) -128);
                if (null != var2) {
                  wl.field_a = PcmResampler.a(127, var2);
                }
                var2 = mk.b("selectsecondary", (byte) -119);
                if (null != var2) {
                  rl.field_a = PcmResampler.a(126, var2);
                }
                var2 = mk.b("moverelationtomouse", (byte) -120);
                if (null != var2) {
                  df.field_e = PcmResampler.a(127, var2);
                }
                var2 = mk.b("movesinrelationtomap", (byte) -124);
                if (var2 != null) {
                  df.field_b = PcmResampler.a(127, var2);
                }
                var2 = mk.b("controltitle", (byte) -126);
                if (null != var2) {
                  bj.field_g = PcmResampler.a(124, var2);
                }
                var2 = mk.b("weaponstor", (byte) -128);
                if (null != var2) {
                  PcmResampler.a(122, var2);
                }
                var2 = mk.b("crashsit", (byte) -121);
                if (null != var2) {
                  PcmResampler.a(126, var2);
                }
                var2 = mk.b("react", (byte) -126);
                if (null != var2) {
                  PcmResampler.a(125, var2);
                }
                var2 = mk.b("actconso", (byte) -128);
                if (null != var2) {
                  PcmResampler.a(122, var2);
                }
                var2 = mk.b("missionspace", (byte) -119);
                if (var2 != null) {
                  mc.field_J = PcmResampler.a(124, var2);
                }
                var2 = mk.b("findwayback", (byte) -120);
                if (null != var2) {
                  kc.field_b = PcmResampler.a(123, var2);
                }
                var2 = mk.b("gobacktolift", (byte) -128);
                if (var2 != null) {
                  cl.field_k = PcmResampler.a(126, var2);
                }
                var2 = mk.b("tutorialfirst", (byte) -125);
                if (var2 != null) {
                  sc.field_h = PcmResampler.a(123, var2);
                }
                var2 = mk.b("gamename", (byte) -126);
                if (var2 != null) {
                  PcmResampler.a(124, var2);
                }
                var2 = mk.b("keycode_w", (byte) -119);
                if (var2 != null) {
                  ql.field_c = 255 & var2[0];
                }
                var2 = mk.b("keycode_a", (byte) -119);
                if (var2 != null) {
                  be.field_i = 255 & var2[0];
                }
                var2 = mk.b("keycode_s", (byte) -121);
                if (null != var2) {
                  ResourceArchive.field_b = var2[0] & 255;
                }
                var2 = mk.b("keycode_d", (byte) -120);
                if (var2 != null) {
                  m.field_h = 255 & var2[0];
                }
                var2 = mk.b("mission_briefing,0,0", (byte) -128);
                if (null != var2) {
                  f.field_a[0][0] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("mission_briefing,0,1", (byte) -122);
                if (var2 != null) {
                  f.field_a[0][1] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("mission_briefing,0,2", (byte) -126);
                if (var2 != null) {
                  f.field_a[0][2] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("mission_briefing,0,3", (byte) -123);
                if (var2 != null) {
                  f.field_a[0][3] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,0,4", (byte) -121);
                if (null != var2) {
                  f.field_a[0][4] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("mission_briefing,0,5", (byte) -119);
                if (null != var2) {
                  f.field_a[0][5] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,0,6", (byte) -124);
                if (var2 != null) {
                  f.field_a[0][6] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("mission_briefing,0,7", (byte) -126);
                if (null != var2) {
                  f.field_a[0][7] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,0,8", (byte) -127);
                if (null != var2) {
                  f.field_a[0][8] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,0,9", (byte) -123);
                if (var2 != null) {
                  f.field_a[0][9] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("mission_briefing,0,10", (byte) -125);
                if (null != var2) {
                  f.field_a[0][10] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,1,0", (byte) -119);
                if (null != var2) {
                  f.field_a[1][0] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("mission_briefing,1,1", (byte) -119);
                if (var2 != null) {
                  f.field_a[1][1] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("mission_briefing,1,2", (byte) -119);
                if (null != var2) {
                  f.field_a[1][2] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,1,3", (byte) -121);
                if (var2 != null) {
                  f.field_a[1][3] = PcmResampler.a(122, var2);
                }
                var2 = mk.b("mission_briefing,1,4", (byte) -124);
                if (var2 != null) {
                  f.field_a[1][4] = PcmResampler.a(123, var2);
                }
                var2 = mk.b("mission_briefing,1,5", (byte) -122);
                if (null != var2) {
                  f.field_a[1][5] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("mission_briefing,1,6", (byte) -125);
                if (null != var2) {
                  f.field_a[1][6] = PcmResampler.a(124, var2);
                }
                var2 = mk.b("mission_briefing,1,7", (byte) -125);
                if (var2 != null) {
                  f.field_a[1][7] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("mission_briefing,1,8", (byte) -123);
                if (null != var2) {
                  f.field_a[1][8] = PcmResampler.a(127, var2);
                }
                var2 = mk.b("mission_briefing,1,9", (byte) -124);
                if (null != var2) {
                  f.field_a[1][9] = PcmResampler.a(126, var2);
                }
                var2 = mk.b("mission_briefing,1,10", (byte) -120);
                if (null != var2) {
                  f.field_a[1][10] = PcmResampler.a(126, var2);
                }
                ll.field_e = null;
            }
            void run() {
                var3 = HostileSpawn.field_I ? 1 : 0;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1324_0 = (RuntimeException) (var2_ref);
                  stackIn_1324_1 = new StringBuilder().append("ib.B(");
                  if (param0 == null) {
                    stackIn_1325_2 = "null";
                  } else {
                    stackIn_1325_2 = "{...}";
                  }
                  throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_1324_0), ((StringBuilder) (Object) stackIn_1324_1).append(stackIn_1325_2).append(',').append(param1).append(')').toString());
                }
                if (GameAppletShell.field_f) {
                  HostileSpawn.field_I = (var3 == 0);
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 50) {
            field_d = 83L;
          }
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var1), "ib.C(" + param0 + ')');
        }
    }

    static {
        field_b = new String[]{"By rating", "By win percentage"};
        field_c = 0;
        field_a = new IntrusiveDeque();
    }
}
