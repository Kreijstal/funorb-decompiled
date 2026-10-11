/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gl extends an {
    private ga field_G;
    static int field_F;
    static tk field_E;

    final boolean a(byte param0, ga param1) {
        RuntimeException var3 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 67) {
            stackIn_4_0 = this.field_G.a((byte) 99, param1);
            return stackIn_4_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0, String param1, boolean param2, boolean param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          ig.m((byte) -72);
          e.field_S.j(-636330975);
          if (param0 != -753) {
            gl.a(-39, (String) null, false, false);
          }
          he.field_a = new ih(m.field_B, (String) null, nm.field_c, param3, param2);
          bm.field_d = new cf(e.field_S, he.field_a);
          e.field_S.a(bm.field_d, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gl.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(dj param0, int param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_1234_0;
            StringBuilder stackIn_1234_1;
            String stackIn_1235_2;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            dj param0;
            int param1;
            boolean finished;
            $CfrPartitionedBody(dj initialParam0, int initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_1234_0 = null;
                this.stackIn_1234_1 = null;
                this.stackIn_1235_2 = null;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                kp.field_f = param0;
                var2 = aj.a(-31, "game_name");
                if (var2 != null) {
                  gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 611, "waitingfor_patches");
                if (null != var2) {
                  gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-41, "loading_patches");
                if (var2 != null) {
                  gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -684, "mouseoverathing");
                if (var2 != null) {
                  m.field_C = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-44, "achievementsthisgame");
                if (var2 != null) {
                  me.field_Hb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 674, "ukexpansion");
                if (null != var2) {
                  qc.field_b = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "ukexpansioninstalled");
                if (null != var2) {
                  mc.field_j = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(100, "benefits,0");
                if (var2 != null) {
                  kl.field_o[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-85, "benefits,1");
                if (var2 != null) {
                  kl.field_o[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 779, "benefits,2");
                if (var2 != null) {
                  kl.field_o[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "benefits,3");
                if (null != var2) {
                  kl.field_o[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-70, "nextlevel");
                if (var2 != null) {
                  hb.field_G = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 618, "retry");
                if (var2 != null) {
                  vj.field_s = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-57, "restart");
                if (null != var2) {
                  pg.field_n = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-105, "endofgame");
                if (var2 != null) {
                  sd.field_a = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-43, "endoffreegame");
                if (null != var2) {
                  wg.field_o = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-76, "gameover");
                if (var2 != null) {
                  oh.field_jb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-17, "selectarea");
                if (var2 != null) {
                  vd.field_c = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 683, "selectlevel");
                if (var2 != null) {
                  fm.field_H = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -679, "paused");
                if (var2 != null) {
                  uj.field_b = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "keycode_left");
                if (null != var2) {
                  ic.field_P = var2[0] & 255;
                }
                var2 = aj.a(param1 - 837, "keycode_right");
                if (null != var2) {
                  me.field_Gb = 255 & var2[0];
                }
                var2 = aj.a(-101, "keycode_up");
                if (var2 != null) {
                  vf.field_d = var2[0] & 255;
                }
                var2 = aj.a(param1 ^ -761, "keycode_down");
                if (var2 != null) {
                  ge.field_e = var2[0] & 255;
                }
                var2 = aj.a(-41, "keycode_powerup1");
                if (null != var2) {
                  mg.field_j = 255 & var2[0];
                }
                var2 = aj.a(param1 ^ 676, "keycode_powerup2");
                if (null != var2) {
                  gm.field_k = 255 & var2[0];
                }
                var2 = aj.a(106, "keycode_powerup3");
                if (null != var2) {
                  dl.field_c = var2[0] & 255;
                }
                var2 = aj.a(120, "keycode_powerup4");
                if (var2 != null) {
                  e.field_K = var2[0] & 255;
                }
                var2 = aj.a(param1 ^ 680, "keycode_powerup5");
                if (null != var2) {
                  rd.field_D = 255 & var2[0];
                }
                var2 = aj.a(param1 - 862, "keycode_powerup6");
                if (null != var2) {
                  si.field_Rb = 255 & var2[0];
                }
                var2 = aj.a(127, "keycode_powerup7");
                if (null != var2) {
                  sh.field_g = var2[0] & 255;
                }
                var2 = aj.a(param1 ^ -732, "keycode_powerup8");
                if (var2 != null) {
                  hn.field_m = var2[0] & 255;
                }
                var2 = aj.a(param1 ^ -688, "achievement_names,0");
                if (var2 != null) {
                  hk.field_J[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-114, "achievement_names,1");
                if (var2 != null) {
                  hk.field_J[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(119, "achievement_names,2");
                if (null != var2) {
                  hk.field_J[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "achievement_names,3");
                if (var2 != null) {
                  hk.field_J[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "achievement_names,4");
                if (null != var2) {
                  hk.field_J[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(106, "achievement_names,5");
                if (var2 != null) {
                  hk.field_J[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(117, "achievement_names,6");
                if (null != var2) {
                  hk.field_J[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(117, "achievement_names,7");
                if (null != var2) {
                  hk.field_J[7] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 818, "achievement_names,8");
                if (null != var2) {
                  hk.field_J[8] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-96, "achievement_names,9");
                if (var2 != null) {
                  hk.field_J[9] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "achievement_names,10");
                if (var2 != null) {
                  hk.field_J[10] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "achievement_names,11");
                if (null != var2) {
                  hk.field_J[11] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-62, "achievement_names,12");
                if (null != var2) {
                  hk.field_J[12] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-55, "achievement_names,13");
                if (null != var2) {
                  hk.field_J[13] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-17, "achievement_names,14");
                if (var2 != null) {
                  hk.field_J[14] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-67, "achievement_names,15");
                if (var2 != null) {
                  hk.field_J[15] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-74, "achievement_names,16");
                if (var2 != null) {
                  hk.field_J[16] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 774, "achievement_names,17");
                if (var2 != null) {
                  hk.field_J[17] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-122, "achievement_names,18");
                if (null != var2) {
                  hk.field_J[18] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 614, "achievement_names,19");
                if (var2 != null) {
                  hk.field_J[19] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-84, "achievement_names,20");
                if (null != var2) {
                  hk.field_J[20] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "achievement_names,21");
                if (null != var2) {
                  hk.field_J[21] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-25, "achievement_names,22");
                if (var2 != null) {
                  hk.field_J[22] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 760, "achievement_names,23");
                if (null != var2) {
                  hk.field_J[23] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "achievement_names,24");
                if (null != var2) {
                  hk.field_J[24] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(114, "achievement_names,25");
                if (var2 != null) {
                  hk.field_J[25] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-56, "achievement_names,26");
                if (var2 != null) {
                  hk.field_J[26] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-91, "achievement_names,27");
                if (null != var2) {
                  hk.field_J[27] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(106, "achievement_names,28");
                if (var2 != null) {
                  hk.field_J[28] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-50, "achievement_names,29");
                if (null != var2) {
                  hk.field_J[29] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(114, "achievement_names,30");
                if (var2 != null) {
                  hk.field_J[30] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-47, "achievement_names,31");
                if (var2 != null) {
                  hk.field_J[31] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 697, "achievement_criteria,0");
                if (null != var2) {
                  gd.field_C[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(127, "achievement_criteria,1");
                if (var2 != null) {
                  gd.field_C[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-10, "achievement_criteria,2");
                if (null != var2) {
                  gd.field_C[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-126, "achievement_criteria,3");
                if (var2 != null) {
                  gd.field_C[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 693, "achievement_criteria,4");
                if (var2 != null) {
                  gd.field_C[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "achievement_criteria,5");
                if (var2 != null) {
                  gd.field_C[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "achievement_criteria,6");
                if (var2 != null) {
                  gd.field_C[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-12, "achievement_criteria,7");
                if (null != var2) {
                  gd.field_C[7] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 621, "achievement_criteria,8");
                if (var2 != null) {
                  gd.field_C[8] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "achievement_criteria,9");
                if (null != var2) {
                  gd.field_C[9] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-43, "achievement_criteria,10");
                if (var2 != null) {
                  gd.field_C[10] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 684, "achievement_criteria,11");
                if (null != var2) {
                  gd.field_C[11] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 680, "achievement_criteria,12");
                if (null != var2) {
                  gd.field_C[12] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-92, "achievement_criteria,13");
                if (null != var2) {
                  gd.field_C[13] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 633, "achievement_criteria,14");
                if (var2 != null) {
                  gd.field_C[14] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(127, "achievement_criteria,15");
                if (null != var2) {
                  gd.field_C[15] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-70, "achievement_criteria,16");
                if (null != var2) {
                  gd.field_C[16] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-109, "achievement_criteria,17");
                if (var2 != null) {
                  gd.field_C[17] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 860, "achievement_criteria,18");
                if (var2 != null) {
                  gd.field_C[18] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -641, "achievement_criteria,19");
                if (var2 != null) {
                  gd.field_C[19] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-59, "achievement_criteria,20");
                if (null != var2) {
                  gd.field_C[20] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-60, "achievement_criteria,21");
                if (null != var2) {
                  gd.field_C[21] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-72, "achievement_criteria,22");
                if (var2 != null) {
                  gd.field_C[22] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 612, "achievement_criteria,23");
                if (var2 != null) {
                  gd.field_C[23] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(116, "achievement_criteria,24");
                if (null != var2) {
                  gd.field_C[24] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 810, "achievement_criteria,25");
                if (var2 != null) {
                  gd.field_C[25] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 693, "achievement_criteria,26");
                if (null != var2) {
                  gd.field_C[26] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "achievement_criteria,27");
                if (var2 != null) {
                  gd.field_C[27] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 697, "achievement_criteria,28");
                if (null != var2) {
                  gd.field_C[28] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-82, "achievement_criteria,29");
                if (null != var2) {
                  gd.field_C[29] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -739, "achievement_criteria,30");
                if (var2 != null) {
                  gd.field_C[30] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "achievement_criteria,31");
                if (null != var2) {
                  gd.field_C[31] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 623, "stage_name,0,0");
                if (var2 != null) {
                  cj.field_a[0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(118, "stage_name,0,1");
                if (null != var2) {
                  cj.field_a[0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 840, "stage_name,0,2");
                if (null != var2) {
                  cj.field_a[0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-27, "stage_name,0,3");
                if (null != var2) {
                  cj.field_a[0][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-30, "stage_name,1,0");
                if (null != var2) {
                  cj.field_a[1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-106, "stage_name,1,1");
                if (null != var2) {
                  cj.field_a[1][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 684, "stage_name,1,2");
                if (null != var2) {
                  cj.field_a[1][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 614, "stage_name,1,3");
                if (var2 != null) {
                  cj.field_a[1][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-109, "levelselect_title,0,0");
                if (null != var2) {
                  gn.field_c[0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-100, "levelselect_title,0,1");
                if (null != var2) {
                  gn.field_c[0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(106, "levelselect_title,0,2");
                if (var2 != null) {
                  gn.field_c[0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "levelselect_title,0,3");
                if (null != var2) {
                  gn.field_c[0][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "levelselect_title,1,0");
                if (var2 != null) {
                  gn.field_c[1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-39, "levelselect_title,1,1");
                if (var2 != null) {
                  gn.field_c[1][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 682, "levelselect_title,1,2");
                if (var2 != null) {
                  gn.field_c[1][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "levelselect_title,1,3");
                if (var2 != null) {
                  gn.field_c[1][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(101, "title_locked");
                if (var2 != null) {
                  kf.field_Y = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-116, "locked_level");
                if (var2 != null) {
                  jk.field_h = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -767, "levelselect_questionmarks");
                if (null != var2) {
                  o.field_n = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-48, "achievement_hidden");
                if (null != var2) {
                  sh.field_f = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -663, "levelselect_levelname");
                if (null != var2) {
                  dk.field_Zb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-53, "score_colon_space");
                if (var2 != null) {
                  gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-63, "esc_to_skip");
                if (var2 != null) {
                  rg.field_L = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(103, "instructions,0,0");
                if (null != var2) {
                  gj.field_g[0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-67, "instructions,0,1");
                if (null != var2) {
                  gj.field_g[0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 741, "instructions,1,0");
                if (null != var2) {
                  gj.field_g[1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(113, "instructions,1,1");
                if (var2 != null) {
                  gj.field_g[1][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-37, "instructions,1,2");
                if (null != var2) {
                  gj.field_g[1][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "instructions,1,3");
                if (var2 != null) {
                  gj.field_g[1][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-120, "instructions,1,4");
                if (null != var2) {
                  gj.field_g[1][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "instructions,2,0");
                if (var2 != null) {
                  gj.field_g[2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-105, "instructions,2,1");
                if (null != var2) {
                  gj.field_g[2][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 677, "instructions,2,2");
                if (var2 != null) {
                  gj.field_g[2][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(103, "instructions,2,3");
                if (var2 != null) {
                  gj.field_g[2][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-114, "instructions,3,0");
                if (var2 != null) {
                  gj.field_g[3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-17, "instructions,4,0");
                if (var2 != null) {
                  gj.field_g[4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -695, "instructions,5,0");
                if (var2 != null) {
                  gj.field_g[5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -714, "instructions,6,0");
                if (var2 != null) {
                  gj.field_g[6][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-35, "instructions,7,0");
                if (var2 != null) {
                  gj.field_g[7][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-64, "instructions,8,0");
                if (var2 != null) {
                  gj.field_g[8][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 850, "instructions,9,0");
                if (var2 != null) {
                  gj.field_g[9][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 616, "instructions,10,0");
                if (var2 != null) {
                  gj.field_g[10][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 619, "instructions,11,0");
                if (null != var2) {
                  gj.field_g[11][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-109, "instructions_titles,0,0");
                if (var2 != null) {
                  gj.field_k[0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -701, "instructions_titles,0,1");
                if (null != var2) {
                  gj.field_k[0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-59, "instructions_titles,1,0");
                if (var2 != null) {
                  gj.field_k[1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-46, "instructions_titles,2,0");
                if (var2 != null) {
                  gj.field_k[2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(100, "instructions_titles,3,0");
                if (var2 != null) {
                  gj.field_k[3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-58, "instructions_titles,4,0");
                if (var2 != null) {
                  gj.field_k[4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 790, "instructions_titles,5,0");
                if (null != var2) {
                  gj.field_k[5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-60, "instructions_titles,6,0");
                if (var2 != null) {
                  gj.field_k[6][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-66, "instructions_titles,7,0");
                if (var2 != null) {
                  gj.field_k[7][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(127, "instructions_titles,8,0");
                if (var2 != null) {
                  gj.field_k[8][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-104, "instructions_titles,9,0");
                if (var2 != null) {
                  gj.field_k[9][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-56, "instructions_titles,10,0");
                if (null != var2) {
                  gj.field_k[10][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "instructions_titles,11,0");
                if (null != var2) {
                  gj.field_k[11][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(127, "instructions_powerups,0");
                if (null != var2) {
                  gj.field_j[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 760, "instructions_powerups,1");
                if (var2 != null) {
                  gj.field_j[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-39, "instructions_powerups,2");
                if (null != var2) {
                  gj.field_j[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 629, "instructions_powerups,3");
                if (var2 != null) {
                  gj.field_j[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(126, "instructions_powerups,4");
                if (null != var2) {
                  gj.field_j[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-58, "instructions_powerups,5");
                if (null != var2) {
                  gj.field_j[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 676, "instructions_powerups,6");
                if (var2 != null) {
                  gj.field_j[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(127, "instructions_powerups,7");
                if (var2 != null) {
                  gj.field_j[7] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -642, "instructions_powerups,9");
                if (var2 != null) {
                  gj.field_j[9] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-111, "instructions_powerups,10");
                if (var2 != null) {
                  gj.field_j[10] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-49, "instructions_powerups,12");
                if (null != var2) {
                  gj.field_j[12] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "instructions_powerups,13");
                if (null != var2) {
                  gj.field_j[13] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-23, "instructions_powerups,14");
                if (null != var2) {
                  gj.field_j[14] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "instructions_powerups,15");
                if (null != var2) {
                  gj.field_j[15] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(103, "instructions_survivors,0");
                if (var2 != null) {
                  gj.field_p[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-114, "instructions_survivors,1");
                if (null != var2) {
                  gj.field_p[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "instructions_survivors,2");
                if (var2 != null) {
                  gj.field_p[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 849, "instructions_survivors,3");
                if (null != var2) {
                  gj.field_p[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "instructions_survivors,4");
                if (var2 != null) {
                  gj.field_p[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-121, "instructions_survivors,5");
                if (null != var2) {
                  gj.field_p[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-30, "instructions_survivors,6");
                if (null != var2) {
                  gj.field_p[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-83, "instructions_survivors,7");
                if (null != var2) {
                  gj.field_p[7] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(122, "instructions_survivors,8");
                if (var2 != null) {
                  gj.field_p[8] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 609, "instructions_survivors,9");
                if (var2 != null) {
                  gj.field_p[9] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -654, "instructions_survivors,10");
                if (null != var2) {
                  gj.field_p[10] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(125, "instructions_survivors,11");
                if (null != var2) {
                  gj.field_p[11] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-97, "intro_text,0");
                if (null != var2) {
                  gj.field_o[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 793, "intro_text,1");
                if (var2 != null) {
                  gj.field_o[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-26, "intro_text,2");
                if (null != var2) {
                  gj.field_o[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-94, "intro_text,3");
                if (null != var2) {
                  gj.field_o[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(118, "intro_text,4");
                if (var2 != null) {
                  gj.field_o[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 696, "intro_text,5");
                if (var2 != null) {
                  gj.field_o[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "intro_text,6");
                if (var2 != null) {
                  gj.field_o[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-71, "intro_text_uk,0");
                if (var2 != null) {
                  gj.field_a[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 837, "intro_text_uk,1");
                if (null != var2) {
                  gj.field_a[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-100, "settings");
                if (var2 != null) {
                  pa.field_A = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -742, "area_names,0");
                if (var2 != null) {
                  q.field_G[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "area_names,1");
                if (null != var2) {
                  q.field_G[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "scorecolonspace");
                if (null != var2) {
                  jp.field_i = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(113, "bonuscount");
                if (null != var2) {
                  li.field_f = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "rank");
                if (var2 != null) {
                  og.field_z = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-40, "name");
                if (null != var2) {
                  lo.field_r = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-28, "score");
                if (null != var2) {
                  ZombieDawn.field_D = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-123, "youhavewon");
                if (null != var2) {
                  ud.field_a = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-34, "youhavelost");
                if (null != var2) {
                  fm.field_I = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(126, "bonuslevelcomplete");
                if (var2 != null) {
                  tc.field_u = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 620, "zombiesremaining");
                if (null != var2) {
                  gj.field_c = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-28, "timeremaining");
                if (null != var2) {
                  hp.field_y = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-68, "zombiesacross");
                if (var2 != null) {
                  sa.field_bb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-93, "humanscaptured");
                if (null != var2) {
                  kn.field_I = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "overallscore");
                if (var2 != null) {
                  aj.field_d = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-35, "gamecomplete,0");
                if (var2 != null) {
                  hb.field_D[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -722, "gamecomplete,1");
                if (var2 != null) {
                  hb.field_D[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(108, "selectazombie");
                if (null != var2) {
                  tg.field_c = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(106, "selectahuman");
                if (null != var2) {
                  gj.field_m = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-70, "selectapoint");
                if (var2 != null) {
                  km.field_b = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -741, "selectanywhere");
                if (var2 != null) {
                  hc.field_a = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "powerup_speed");
                if (var2 != null) {
                  tk.field_b = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "powerup_meltdown");
                if (null != var2) {
                  mm.field_l = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(113, "powerup_phantom");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (var2 != null) {
                  ah.field_bb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "powerup_disguise");
                if (var2 != null) {
                  cl.field_a = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(112, "powerup_detonate");
                if (null != var2) {
                  rg.field_K = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 612, "powerup_screech");
                if (var2 != null) {
                  ti.field_d = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-53, "powerup_tough");
                if (var2 != null) {
                  ij.field_J = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(122, "powerup_curse");
                if (null != var2) {
                  bh.field_h = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 835, "powerup_barrier");
                if (null != var2) {
                  fe.field_J = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-35, "powerup_breach");
                if (var2 != null) {
                  ub.field_h = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-38, "powerup_shackles");
                if (var2 != null) {
                  tl.field_k = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-90, "powerup_quake");
                if (null != var2) {
                  pa.field_C = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-99, "powerup_fear");
                if (var2 != null) {
                  ig.field_Bb = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -766, "powerup_fireball");
                if (null != var2) {
                  dm.field_s = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-96, "levelname,0,0");
                if (null != var2) {
                  gj.field_w[0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 616, "levelname,0,1");
                if (var2 != null) {
                  gj.field_w[0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-75, "levelname,0,2");
                if (null != var2) {
                  gj.field_w[0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-119, "levelname,0,3");
                if (null != var2) {
                  gj.field_w[0][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-30, "levelname,0,4");
                if (var2 != null) {
                  gj.field_w[0][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-31, "levelname,0,5");
                if (null != var2) {
                  gj.field_w[0][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 678, "levelname,1,0");
                if (var2 != null) {
                  gj.field_w[1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -711, "levelname,1,1");
                if (null != var2) {
                  gj.field_w[1][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "levelname,1,2");
                if (null != var2) {
                  gj.field_w[1][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 611, "levelname,1,3");
                if (var2 != null) {
                  gj.field_w[1][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -755, "levelname,1,4");
                if (var2 != null) {
                  gj.field_w[1][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "levelname,1,5");
                if (var2 != null) {
                  gj.field_w[1][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(108, "levelname,2,0");
                if (null != var2) {
                  gj.field_w[2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 810, "levelname,2,1");
                if (null != var2) {
                  gj.field_w[2][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(122, "levelname,2,2");
                if (var2 != null) {
                  gj.field_w[2][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "levelname,2,3");
                if (var2 != null) {
                  gj.field_w[2][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-11, "levelname,2,4");
                if (null != var2) {
                  gj.field_w[2][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(108, "levelname,2,5");
                if (var2 != null) {
                  gj.field_w[2][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-103, "levelname,3,0");
                if (var2 != null) {
                  gj.field_w[3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-104, "levelname,3,1");
                if (null != var2) {
                  gj.field_w[3][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 676, "levelname,3,2");
                if (null != var2) {
                  gj.field_w[3][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(118, "levelname,3,3");
                if (var2 != null) {
                  gj.field_w[3][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 691, "levelname,3,4");
                if (var2 != null) {
                  gj.field_w[3][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-13, "levelname,3,5");
                if (null != var2) {
                  gj.field_w[3][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(123, "levelname,4,0");
                if (var2 != null) {
                  gj.field_w[4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(108, "levelname,4,1");
                if (null != var2) {
                  gj.field_w[4][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(113, "levelname,4,2");
                if (var2 != null) {
                  gj.field_w[4][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(104, "levelname,4,3");
                if (var2 != null) {
                  gj.field_w[4][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(120, "levelname,4,4");
                if (null != var2) {
                  gj.field_w[4][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-80, "levelname,4,5");
                if (null != var2) {
                  gj.field_w[4][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-22, "levelname,5,0");
                if (null != var2) {
                  gj.field_w[5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 628, "levelname,5,1");
                if (var2 != null) {
                  gj.field_w[5][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-80, "levelname,5,2");
                if (var2 != null) {
                  gj.field_w[5][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 838, "levelname,5,3");
                if (null != var2) {
                  gj.field_w[5][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 609, "levelname,5,4");
                if (null != var2) {
                  gj.field_w[5][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 617, "levelname,5,5");
                if (var2 != null) {
                  gj.field_w[5][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-111, "levelname,6,0");
                if (null != var2) {
                  gj.field_w[6][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-37, "levelname,6,1");
                if (var2 != null) {
                  gj.field_w[6][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-14, "levelname,6,2");
                if (var2 != null) {
                  gj.field_w[6][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-27, "levelname,6,3");
                if (var2 != null) {
                  gj.field_w[6][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-49, "levelname,6,4");
                if (null != var2) {
                  gj.field_w[6][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-79, "levelname,6,5");
                if (null != var2) {
                  gj.field_w[6][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "levelname,7,0");
                if (null != var2) {
                  gj.field_w[7][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-116, "levelname,7,1");
                if (null != var2) {
                  gj.field_w[7][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 680, "levelname,7,2");
                if (null != var2) {
                  gj.field_w[7][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-34, "levelname,7,3");
                if (null != var2) {
                  gj.field_w[7][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 677, "levelname,7,4");
                if (var2 != null) {
                  gj.field_w[7][4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-24, "levelname,7,5");
                if (null != var2) {
                  gj.field_w[7][5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-40, "bonuslevel");
                if (var2 != null) {
                  te.field_S = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 687, "theend");
                if (null != var2) {
                  hm.field_M = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(125, "bonusleveltext,0");
                if (null != var2) {
                  kb.field_g[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-12, "bonusleveltext,1");
                if (null != var2) {
                  kb.field_g[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-13, "bonusleveltext,2");
                if (var2 != null) {
                  kb.field_g[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 836, "bonusleveltext,3");
                if (var2 != null) {
                  kb.field_g[3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-47, "bonusleveltext,4");
                if (null != var2) {
                  kb.field_g[4] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(114, "bonusleveltext,5");
                if (null != var2) {
                  kb.field_g[5] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-33, "bonusleveltext,6");
                if (null != var2) {
                  kb.field_g[6] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(109, "bonusleveltext,7");
                if (var2 != null) {
                  kb.field_g[7] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-73, "tutorialtoggle,0");
                if (null != var2) {
                  md.field_qb[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "tutorialtoggle,1");
                if (null != var2) {
                  md.field_qb[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "difficultytoggle,0");
                if (var2 != null) {
                  wl.field_a[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(111, "difficultytoggle,1");
                if (null != var2) {
                  wl.field_a[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(102, "tutorial,0,0,0");
                if (var2 != null) {
                  me.field_Fb[0][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-34, "tutorial,0,0,1");
                if (null != var2) {
                  me.field_Fb[0][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-12, "tutorial,0,0,2");
                if (var2 != null) {
                  me.field_Fb[0][0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-56, "tutorial,0,0,3");
                if (var2 != null) {
                  me.field_Fb[0][0][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 698, "tutorial,0,1,0");
                if (var2 != null) {
                  me.field_Fb[0][1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(126, "tutorial,0,1,1");
                if (var2 != null) {
                  me.field_Fb[0][1][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 624, "tutorial,0,1,2");
                if (var2 != null) {
                  me.field_Fb[0][1][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-106, "tutorial,0,2,0");
                if (var2 != null) {
                  me.field_Fb[0][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 693, "tutorial,0,2,1");
                if (var2 != null) {
                  me.field_Fb[0][2][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(112, "tutorial,0,2,2");
                if (var2 != null) {
                  me.field_Fb[0][2][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-73, "tutorial,0,2,3");
                if (var2 != null) {
                  me.field_Fb[0][2][3] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(113, "tutorial,0,3,0");
                if (null != var2) {
                  me.field_Fb[0][3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "tutorial,0,4,0");
                if (var2 != null) {
                  me.field_Fb[0][4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-14, "tutorial,0,4,1");
                if (param1 != 734) {
                  finished = true; return;
                }
                if (null != var2) {
                  me.field_Fb[0][4][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "tutorial,0,4,2");
                if (var2 != null) {
                  me.field_Fb[0][4][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(105, "tutorial,0,5,0");
                if (var2 != null) {
                  me.field_Fb[0][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(104, "tutorial,0,5,1");
                if (var2 != null) {
                  me.field_Fb[0][5][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 752, "tutorial,0,5,2");
                if (var2 != null) {
                  me.field_Fb[0][5][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 624, "tutorial,1,0,0");
                if (var2 != null) {
                  me.field_Fb[1][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-86, "tutorial,1,0,1");
                if (var2 != null) {
                  me.field_Fb[1][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 627, "tutorial,1,1,0");
                if (var2 != null) {
                  me.field_Fb[1][1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-105, "tutorial,1,2,0");
                if (var2 != null) {
                  me.field_Fb[1][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-34, "tutorial,1,2,1");
                if (var2 != null) {
                  me.field_Fb[1][2][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-110, "tutorial,1,4,0");
                if (null != var2) {
                  me.field_Fb[1][4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(112, "tutorial,1,4,1");
                if (var2 != null) {
                  me.field_Fb[1][4][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(120, "tutorial,1,5,0");
                if (var2 != null) {
                  me.field_Fb[1][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 688, "tutorial,2,5,0");
                if (null != var2) {
                  me.field_Fb[2][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(110, "tutorial,2,5,1");
                if (null != var2) {
                  me.field_Fb[2][5][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-111, "tutorial,2,5,2");
                if (var2 != null) {
                  me.field_Fb[2][5][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 618, "tutorial,4,0,0");
                if (var2 != null) {
                  me.field_Fb[4][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-97, "tutorial,4,0,1");
                if (var2 != null) {
                  me.field_Fb[4][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 859, "tutorial,4,1,0");
                if (var2 != null) {
                  me.field_Fb[4][1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-82, "tutorial,4,2,0");
                if (var2 != null) {
                  me.field_Fb[4][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-13, "tutorial,4,3,0");
                if (null != var2) {
                  me.field_Fb[4][3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(122, "tutorial,4,3,1");
                if (var2 != null) {
                  me.field_Fb[4][3][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 678, "tutorial,4,4,0");
                if (null != var2) {
                  me.field_Fb[4][4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-122, "tutorial,4,5,0");
                if (var2 != null) {
                  me.field_Fb[4][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-107, "tutorial,5,0,0");
                if (null != var2) {
                  me.field_Fb[5][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "tutorial,5,0,1");
                if (null != var2) {
                  me.field_Fb[5][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -661, "tutorial,5,0,2");
                if (null != var2) {
                  me.field_Fb[5][0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(122, "tutorial,5,1,0");
                if (null != var2) {
                  me.field_Fb[5][1][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 681, "tutorial,5,2,0");
                if (var2 != null) {
                  me.field_Fb[5][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-10, "tutorial,5,2,1");
                if (var2 != null) {
                  me.field_Fb[5][2][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-31, "tutorial,5,4,0");
                if (null != var2) {
                  me.field_Fb[5][4][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(114, "tutorial,6,0,0");
                if (null != var2) {
                  me.field_Fb[6][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(108, "tutorial,6,0,1");
                if (var2 != null) {
                  me.field_Fb[6][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-115, "tutorial,6,2,0");
                if (null != var2) {
                  me.field_Fb[6][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(106, "tutorial,6,3,0");
                if (var2 != null) {
                  me.field_Fb[6][3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(115, "tutorial,6,3,1");
                if (var2 != null) {
                  me.field_Fb[6][3][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-37, "tutorial,6,3,2");
                if (null != var2) {
                  me.field_Fb[6][3][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-46, "tutorial,6,5,0");
                if (var2 != null) {
                  me.field_Fb[6][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 607, "tutorial,7,0,0");
                if (var2 != null) {
                  me.field_Fb[7][0][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ 676, "tutorial,7,0,1");
                if (var2 != null) {
                  me.field_Fb[7][0][1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-65, "tutorial,7,0,2");
                if (null != var2) {
                  me.field_Fb[7][0][2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(112, "tutorial,7,2,0");
                if (null != var2) {
                  me.field_Fb[7][2][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-80, "tutorial,7,3,0");
                if (null != var2) {
                  me.field_Fb[7][3][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(121, "tutorial,7,5,0");
                if (var2 != null) {
                  me.field_Fb[7][5][0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-107, "tutorial_nokeycardsleft,0");
                if (var2 != null) {
                  jp.field_g[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-23, "tutorial_nokeycardsleft,1");
                if (var2 != null) {
                  jp.field_g[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-27, "tutorial_nokeycardsleft,2");
                if (null != var2) {
                  jp.field_g[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(-9, "tutorial_notenoughhumansleft,0");
                if (null != var2) {
                  qg.field_g[0] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 613, "tutorial_notenoughhumansleft,1");
                if (var2 != null) {
                  qg.field_g[1] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 - 825, "tutorial_notenoughhumansleft,2");
                if (var2 != null) {
                  qg.field_g[2] = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(124, "clicktoclose");
                if (var2 != null) {
                  ip.field_o = gg.a(var2, (byte) 56);
                }
                var2 = aj.a(param1 ^ -757, "ukexpansiontoosoon");
                if (null != var2) {
                  ch.field_c = gg.a(var2, (byte) 56);
                }
                kp.field_f = null;
            }
            void run() {
                var3 = ZombieDawn.field_J;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_1234_0 = (RuntimeException) (var2_ref);
                  stackIn_1234_1 = new StringBuilder().append("gl.E(");
                  if (param0 == null) {
                    stackIn_1235_2 = "null";
                  } else {
                    stackIn_1235_2 = "{...}";
                  }
                  throw sh.a((Throwable) ((Object) stackIn_1234_0), ((StringBuilder) (Object) stackIn_1234_1).append(stackIn_1235_2).append(',').append(param1).append(')').toString());
                }
                if (ke.field_f != 0) {
                  var3++;
                  ZombieDawn.field_J = var3;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    gl(ga param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_G = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("gl.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
          return;
        }
        try {
          field_E = null;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "gl.G(" + param0 + ')');
        }
    }

    static {
    }
}
