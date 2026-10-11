/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rc {
    static int field_g;
    private int field_a;
    static cm field_i;
    static int[][] field_o;
    static int field_j;
    static String field_f;
    static BitmapFont field_m;
    private rj field_c;
    static boolean field_n;
    private int field_e;
    private rj field_h;
    static RgbSprite field_d;
    static String field_k;
    static String field_b;
    static int field_l;

    final boolean a(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_h;
          synchronized (var5) {
            if (param0 < 77) {
              return true;
            }
            if (param1 >= 0 &&
              this.field_a >= param1) {
              var6 = this.a(true, param1, true, param3, param2) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.a(true, param1, false, param3, param2) ? 1 : 0;
              }
              stackIn_13_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_13_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("rc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        boolean stackIn_14_0 = false;
        int stackIn_27_0 = 0;
        boolean stackIn_38_0 = false;
        int stackIn_51_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_13_0;
        boolean stackOut_37_0;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2_int = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var1_intLifetime1;
        var5 = SteelSentinels.obfuscationControl;
        try {
          if (0 <= dc.field_g) {
            pa.field_d[dc.field_g].a((byte) 106);
          }
          if (16 == dc.field_g) {
            dc.field_g = -1;
            return;
          }
          if (dc.field_g == 1) {
            qa.field_M = 0;
          }
          dc.field_g = dc.field_g + 1;
          if (dc.field_g == 12) {
            var1_int = 0;
            var2_int = 0;
            while (true) {
              boolean decompiledFrameRemainder0 = true;
              if (35 > var2_int) {
                stackOut_13_0 = t.a(fe.field_D, var2_int, -20370);
                stackIn_27_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                decompiledFrameRemainder0 = (var5 == 0);
                if (decompiledFrameRemainder0) {
                  if (!stackIn_14_0 &&
                    ad.a(var2_int, ArticulatedPart.f((byte) -60), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                    var1_int = 1;
                  } else {
                    var2_int++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                stackIn_27_0 = var1_int;
              }
              if (stackIn_27_0 != 0) {
                break;
              }
              dc.field_g = dc.field_g + 1;
              break;
            }
          }
          if (param0) {
            return;
          }
          if (dc.field_g == 15) {
            var1_intLifetime1 = 0;
            var2 = FunOrbClient.field_z;
            var3 = 0;
            while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var2.length > var3) {
                var4 = var2[var3];
                stackOut_37_0 = t.a(rn.field_D, var4, -20370);
                stackIn_51_0 = stackOut_37_0 ? 1 : 0;
                stackIn_38_0 = stackOut_37_0;
                decompiledFrameRemainder1 = (var5 == 0);
                if (decompiledFrameRemainder1) {
                  if (!stackIn_38_0 &&
                    aj.a(ge.field_m, (byte) 126, rn.field_D, var4, ArticulatedPart.f((byte) -37))) {
                    var1_intLifetime1 = 1;
                  } else {
                    var3++;
                    continue;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                stackIn_51_0 = var1_intLifetime1;
              }
              if (stackIn_51_0 != 0) {
                break;
              }
              dc.field_g = dc.field_g + 1;
              break;
            }
          }
          if (dc.field_g == 12 &&
            null != bi.field_f &&
            hb.field_d >= 0) {
            bi.field_f.field_Ub.field_gb = -bi.field_f.field_Ub.field_eb - hb.field_d;
            if (-bi.field_f.field_Ub.field_eb < bi.field_f.field_Ub.field_gb) {
              bi.field_f.field_Ub.field_gb = -bi.field_f.field_Ub.field_eb;
            }
            if (bi.field_f.field_Ub.field_gb < (-bi.field_f.field_Ub.field_Lb - bi.field_f.field_Ub.field_lb + bi.field_f.field_Tb.field_Lb - bi.field_f.field_Ub.field_eb)) {
              bi.field_f.field_Ub.field_gb = -bi.field_f.field_Ub.field_eb + (bi.field_f.field_Tb.field_Lb - bi.field_f.field_Ub.field_Lb) - bi.field_f.field_Ub.field_lb;
            }
          }
          if (dc.field_g == 16 &&
            0 == (8 & dm.field_a)) {
            dm.field_a = dm.field_a | 8;
            if (!ni.b(111)) {
              um.f((byte) 3);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rc.F(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_o = (int[][]) null;
        field_f = null;
        field_b = null;
        field_i = null;
        field_m = null;
        field_k = null;
        if (param0 != 15598) {
          return;
        }
        try {
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "rc.D(" + param0 + ')');
        }
    }

    final static void a(int param0, cm param1) {
        class $CfrPartitionedBody {
            RuntimeException stackIn_4687_0;
            StringBuilder stackIn_4687_1;
            String stackIn_4688_2;
            boolean stackIn_4696_0;
            RuntimeException decompiledCaughtException;
            byte[] var2;
            RuntimeException var2_ref;
            int var3;
            int param0;
            cm param1;
            boolean finished;
            $CfrPartitionedBody(int initialParam0, cm initialParam1) {
                this.param0 = initialParam0;
                this.param1 = initialParam1;
                this.stackIn_4687_0 = null;
                this.stackIn_4687_1 = null;
                this.stackIn_4688_2 = null;
                this.stackIn_4696_0 = false;
                this.decompiledCaughtException = null;
                this.var2 = null;
                this.var2_ref = null;
                this.var3 = 0;
            }
            void runChunk0() throws java.lang.RuntimeException {
                sj.field_y = param1;
                var2 = SentinelDesigner.a(125, "text_game_name");
                if (var2 != null) {
                  uj.field_h = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "text_benefits,0");
                if (null != var2) {
                  rn.field_r[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 107, "text_benefits,1");
                if (var2 != null) {
                  rn.field_r[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(123, "text_benefits,2");
                if (null != var2) {
                  rn.field_r[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(106, "expansion_1_title");
                if (null != var2) {
                  dm.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "expansion_1_installed");
                if (null != var2) {
                  oe.field_l = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "expansion_1_caps,0");
                if (null != var2) {
                  SentinelDesigner.field_f[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "expansion_1_caps,1");
                if (null != var2) {
                  SentinelDesigner.field_f[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "expansion_1_caps,2");
                if (null != var2) {
                  SentinelDesigner.field_f[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "solarite_invader_caps_space");
                if (var2 != null) {
                  re.field_W = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "baal_space");
                if (var2 != null) {
                  dc.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "baal_invocation,0");
                if (var2 != null) {
                  rh.field_t[0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 80, "baal_invocation,1");
                if (null != var2) {
                  rh.field_t[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(83, "baal_invocation,2");
                if (var2 != null) {
                  rh.field_t[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "baal_gloating,0");
                if (var2 != null) {
                  si.field_H[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "baal_gloating,1");
                if (var2 != null) {
                  si.field_H[1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 73, "baal_gloating,2");
                if (null != var2) {
                  si.field_H[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "baal_gloating,3");
                if (null != var2) {
                  si.field_H[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "baal_vanquished,0");
                if (var2 != null) {
                  jd.field_mb[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "baal_vanquished,1");
                if (null != var2) {
                  jd.field_mb[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 82, "baal_vanquished,2");
                if (var2 != null) {
                  jd.field_mb[2] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(116, "baal_vanquished,3");
                if (var2 != null) {
                  jd.field_mb[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 53, "baal_vanquished,4");
                if (null != var2) {
                  jd.field_mb[4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(72, "baal_vanquished,5");
                if (null != var2) {
                  jd.field_mb[5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(56, "baal_vanquished,6");
                if (var2 != null) {
                  jd.field_mb[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 112, "trainingdrone");
                if (var2 != null) {
                  db.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "newhighscoremsg");
                if (var2 != null) {
                  vm.field_q = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "loadingpercent");
                if (null != var2) {
                  ff.field_sb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "waitforloading");
                if (null != var2) {
                  dg.field_e = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(90, "needtrainingmsg");
                if (null != var2) {
                  b.field_l = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "nosentinelmsg");
                if (var2 != null) {
                  sj.field_C = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "spectatinggametxt");
                if (null != var2) {
                  FunOrbClient.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 72, "spectatingtxt");
                if (null != var2) {
                  ri.field_d = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(109, "gameopt_restriction_text,0,0");
                if (null != var2) {
                  uc.field_h[0][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "gameopt_restriction_text,0,1");
                if (var2 != null) {
                  uc.field_h[0][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "gameopt_restriction_text,0,2");
                if (null != var2) {
                  uc.field_h[0][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "gameopt_restriction_text,1,0");
                if (var2 != null) {
                  uc.field_h[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "gameopt_restriction_text,1,1");
                if (var2 != null) {
                  uc.field_h[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "gameopt_restriction_text,1,2");
                if (null != var2) {
                  uc.field_h[1][2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(124, "okoption,0");
                if (null != var2) {
                  al.field_f[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "ignore_cap_txt");
                if (var2 != null) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "yesnooption,0");
                if (null != var2) {
                  el.field_Vb[0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(55, "yesnooption,1");
                if (null != var2) {
                  el.field_Vb[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "achievement_names,0");
                if (var2 != null) {
                  jg.field_t[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "achievement_names,1");
                if (var2 != null) {
                  jg.field_t[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 97, "achievement_names,2");
                if (null != var2) {
                  jg.field_t[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "achievement_names,3");
                if (var2 != null) {
                  jg.field_t[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "achievement_names,4");
                if (null != var2) {
                  jg.field_t[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "achievement_names,5");
                if (var2 != null) {
                  jg.field_t[5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(74, "achievement_names,6");
                if (null != var2) {
                  jg.field_t[6] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 78, "achievement_names,7");
                if (null != var2) {
                  jg.field_t[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "achievement_names,8");
                if (null != var2) {
                  jg.field_t[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "achievement_names,9");
                if (var2 != null) {
                  jg.field_t[9] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(108, "achievement_names,10");
                if (var2 != null) {
                  jg.field_t[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "achievement_names,11");
                if (null != var2) {
                  jg.field_t[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 86, "achievement_names,12");
                if (null != var2) {
                  jg.field_t[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "achievement_names,13");
                if (null != var2) {
                  jg.field_t[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(75, "achievement_names,14");
                if (var2 != null) {
                  jg.field_t[14] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(60, "achievement_names,15");
                if (var2 != null) {
                  jg.field_t[15] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(112, "achievement_names,16");
                if (var2 != null) {
                  jg.field_t[16] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(86, "achievement_names,17");
                if (null != var2) {
                  jg.field_t[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 94, "achievement_names,18");
                if (var2 != null) {
                  jg.field_t[18] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(67, "achievement_names,19");
                if (null != var2) {
                  jg.field_t[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "achievement_names,20");
                if (null != var2) {
                  jg.field_t[20] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(86, "achievement_names,21");
                if (null != var2) {
                  jg.field_t[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "achievement_names,22");
                if (var2 != null) {
                  jg.field_t[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "achievement_names,23");
                if (null != var2) {
                  jg.field_t[23] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(117, "achievement_names,24");
                if (null != var2) {
                  jg.field_t[24] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(125, "achievement_names,25");
                if (var2 != null) {
                  jg.field_t[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 56, "achievement_names,26");
                if (var2 != null) {
                  jg.field_t[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 117, "achievement_names,27");
                if (var2 != null) {
                  jg.field_t[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "achievement_names,28");
                if (null != var2) {
                  jg.field_t[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "achievement_names,29");
                if (null != var2) {
                  jg.field_t[29] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 122, "achievement_names,30");
                if (var2 != null) {
                  jg.field_t[30] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(96, "achievement_names,31");
                if (var2 != null) {
                  jg.field_t[31] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 104, "achievement_names,32");
                if (null != var2) {
                  jg.field_t[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 104, "achievement_names,33");
                if (var2 != null) {
                  jg.field_t[33] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(67, "achievement_names,34");
                if (var2 != null) {
                  jg.field_t[34] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(95, "achievement_names,35");
                if (var2 != null) {
                  jg.field_t[35] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 72, "achievement_names,36");
                if (null != var2) {
                  jg.field_t[36] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "achievement_names,37");
                if (null != var2) {
                  jg.field_t[37] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "achievement_names,38");
                if (null != var2) {
                  jg.field_t[38] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(125, "MissionBriefings,0");
                if (null != var2) {
                  c.field_s[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 94, "MissionBriefings,1");
                if (null != var2) {
                  c.field_s[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "MissionBriefings,2");
                if (var2 != null) {
                  c.field_s[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "MissionBriefings,3");
                if (var2 != null) {
                  c.field_s[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "MissionBriefings,4");
                if (var2 != null) {
                  c.field_s[4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(67, "MissionBriefings,5");
                if (var2 != null) {
                  c.field_s[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "MissionBriefings,6");
                if (null != var2) {
                  c.field_s[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "MissionBriefings,7");
                if (var2 != null) {
                  c.field_s[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 59, "MissionBriefings,8");
                if (null != var2) {
                  c.field_s[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "MissionBriefings,9");
                if (null != var2) {
                  c.field_s[9] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(118, "MissionBriefings,10");
                if (var2 != null) {
                  c.field_s[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "MissionBriefings,11");
                if (null != var2) {
                  c.field_s[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 51, "MissionBriefings,12");
                if (null != var2) {
                  c.field_s[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "MissionBriefings,13");
                if (var2 != null) {
                  c.field_s[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 63, "MissionBriefings,14");
                if (null != var2) {
                  c.field_s[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 105, "MissionBriefings,15");
                if (var2 != null) {
                  c.field_s[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "MissionBriefings,16");
                if (var2 != null) {
                  c.field_s[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 110, "MissionBriefings,17");
                if (var2 != null) {
                  c.field_s[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "MissionBriefings,18");
                if (null != var2) {
                  c.field_s[18] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(53, "MissionBriefings,19");
                if (null != var2) {
                  c.field_s[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 123, "MissionBriefings,20");
                if (null != var2) {
                  c.field_s[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "MissionBriefings,21");
                if (var2 != null) {
                  c.field_s[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "MissionBriefings,22");
                if (null != var2) {
                  c.field_s[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "MissionBriefings,23");
                if (null != var2) {
                  c.field_s[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "MissionBriefings,24");
                if (null != var2) {
                  c.field_s[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "MissionBriefings,25");
                if (null != var2) {
                  c.field_s[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "MissionBriefings,26");
                if (var2 != null) {
                  c.field_s[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "MissionBriefings,27");
                if (null != var2) {
                  c.field_s[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(116, "MissionBriefings,28");
                if (null != var2) {
                  c.field_s[28] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 97, "MissionBriefings,29");
                if (null != var2) {
                  c.field_s[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "achievement_criteria,0");
                if (null != var2) {
                  oe.field_a[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "achievement_criteria,1");
                if (var2 != null) {
                  oe.field_a[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "achievement_criteria,2");
                if (var2 != null) {
                  oe.field_a[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "achievement_criteria,3");
                if (null != var2) {
                  oe.field_a[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 103, "achievement_criteria,4");
                if (var2 != null) {
                  oe.field_a[4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(71, "achievement_criteria,5");
                if (var2 != null) {
                  oe.field_a[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "achievement_criteria,6");
                if (null != var2) {
                  oe.field_a[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "achievement_criteria,7");
                if (null != var2) {
                  oe.field_a[7] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(93, "achievement_criteria,8");
                if (null != var2) {
                  oe.field_a[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(75, "achievement_criteria,9");
                if (var2 != null) {
                  oe.field_a[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 117, "achievement_criteria,10");
                if (var2 != null) {
                  oe.field_a[10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 79, "achievement_criteria,11");
                if (null != var2) {
                  oe.field_a[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "achievement_criteria,12");
                if (var2 != null) {
                  oe.field_a[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "achievement_criteria,13");
                if (null != var2) {
                  oe.field_a[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "achievement_criteria,14");
                if (var2 != null) {
                  oe.field_a[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "achievement_criteria,15");
                if (var2 != null) {
                  oe.field_a[15] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(125, "achievement_criteria,16");
                if (var2 != null) {
                  oe.field_a[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "achievement_criteria,17");
                if (var2 != null) {
                  oe.field_a[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "achievement_criteria,18");
                if (null != var2) {
                  oe.field_a[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 56, "achievement_criteria,19");
                if (var2 != null) {
                  oe.field_a[19] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(114, "achievement_criteria,20");
                if (null != var2) {
                  oe.field_a[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "achievement_criteria,21");
                if (null != var2) {
                  oe.field_a[21] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 104, "achievement_criteria,22");
                if (var2 != null) {
                  oe.field_a[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "achievement_criteria,23");
                if (null != var2) {
                  oe.field_a[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "achievement_criteria,24");
                if (null != var2) {
                  oe.field_a[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "achievement_criteria,25");
                if (var2 != null) {
                  oe.field_a[25] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(75, "achievement_criteria,26");
                if (null != var2) {
                  oe.field_a[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "achievement_criteria,27");
                if (null != var2) {
                  oe.field_a[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "achievement_criteria,28");
                if (null != var2) {
                  oe.field_a[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "achievement_criteria,29");
                if (var2 != null) {
                  oe.field_a[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 65, "achievement_criteria,30");
                if (null != var2) {
                  oe.field_a[30] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(80, "achievement_criteria,31");
                if (null != var2) {
                  oe.field_a[31] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "achievement_criteria,32");
                if (var2 != null) {
                  oe.field_a[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "achievement_criteria,33");
                if (var2 != null) {
                  oe.field_a[33] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(100, "achievement_criteria,34");
                if (var2 != null) {
                  oe.field_a[34] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 62, "achievement_criteria,35");
                if (var2 != null) {
                  oe.field_a[35] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "achievement_criteria,36");
                if (var2 != null) {
                  oe.field_a[36] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 127, "achievement_criteria,37");
                if (null != var2) {
                  oe.field_a[37] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 119, "achievement_criteria,38");
                if (var2 != null) {
                  oe.field_a[38] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 95, "tabnames,0");
                if (var2 != null) {
                  am.field_d[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "tabnames,1");
                if (null != var2) {
                  am.field_d[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "tabnames,2");
                if (var2 != null) {
                  am.field_d[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "tabnames,3");
                if (null != var2) {
                  am.field_d[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "modulenames,0");
                if (null != var2) {
                  rj.field_m[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 79, "modulenames,1");
                if (var2 != null) {
                  rj.field_m[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "modulenames,2");
                if (null != var2) {
                  rj.field_m[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 53, "modulenames,3");
                if (null != var2) {
                  rj.field_m[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "modulenames,4");
                if (null != var2) {
                  rj.field_m[4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(114, "modulenames,5");
                if (null != var2) {
                  rj.field_m[5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(93, "modulenames,6");
                if (null != var2) {
                  rj.field_m[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "modulenames,7");
                if (var2 != null) {
                  rj.field_m[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 121, "modulenames,8");
                if (var2 != null) {
                  rj.field_m[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "modulenames,9");
                if (null != var2) {
                  rj.field_m[9] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(96, "modulenames,10");
                if (null != var2) {
                  rj.field_m[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "modulenames,11");
                if (null != var2) {
                  rj.field_m[11] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(117, "modulenames,12");
                if (null != var2) {
                  rj.field_m[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "modulenames,13");
                if (null != var2) {
                  rj.field_m[13] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "modulenames,14");
                if (var2 != null) {
                  rj.field_m[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "modulenames,15");
                if (null != var2) {
                  rj.field_m[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "modulenames,16");
                if (var2 != null) {
                  rj.field_m[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 102, "modulenames,17");
                if (null != var2) {
                  rj.field_m[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "modulenames,18");
                if (var2 != null) {
                  rj.field_m[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 57, "modulenames,19");
                if (var2 != null) {
                  rj.field_m[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 74, "modulenames,20");
                if (var2 != null) {
                  rj.field_m[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "modulenames,21");
                if (var2 != null) {
                  rj.field_m[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(75, "modulenames,22");
                if (null != var2) {
                  rj.field_m[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "modulenames,23");
                if (null != var2) {
                  rj.field_m[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "modulenames,24");
                if (var2 != null) {
                  rj.field_m[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "modulenames,25");
                if (var2 != null) {
                  rj.field_m[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "modulenames,26");
                if (var2 != null) {
                  rj.field_m[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "modulenames,27");
                if (var2 != null) {
                  rj.field_m[27] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(121, "modulenames,28");
                if (var2 != null) {
                  rj.field_m[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 114, "modulenames,29");
                if (null != var2) {
                  rj.field_m[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "modulenames,30");
                if (null != var2) {
                  rj.field_m[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "modulenames,31");
                if (var2 != null) {
                  rj.field_m[31] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(111, "modulenames,32");
                if (var2 != null) {
                  rj.field_m[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "modulenames,33");
                if (null != var2) {
                  rj.field_m[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 57, "targetlocktxt");
                if (null != var2) {
                  ac.field_gb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 119, "edd_shortname");
                if (null != var2) {
                  bk.field_O = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 63, "powerupnames,0");
                if (null != var2) {
                  qj.field_v[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "powerupnames,1");
                if (var2 != null) {
                  qj.field_v[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "powerupnames,2");
                if (null != var2) {
                  qj.field_v[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "powerupnames,3");
                if (var2 != null) {
                  qj.field_v[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "powerupnames,4");
                if (null != var2) {
                  qj.field_v[4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(82, "powerupnames,5");
                if (var2 != null) {
                  qj.field_v[5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(111, "powerupnames,6");
                if (null != var2) {
                  qj.field_v[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 98, "powerupnames,7");
                if (null != var2) {
                  qj.field_v[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "powerupnames,8");
                if (null != var2) {
                  qj.field_v[8] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(70, "powerupnames,9");
                if (var2 != null) {
                  qj.field_v[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "powerupnames,10");
                if (null != var2) {
                  qj.field_v[10] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 99, "meleeattackdesc,0");
                if (null != var2) {
                  jd.field_nb[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(82, "meleeattackdesc,1");
                if (null != var2) {
                  jd.field_nb[1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(127, "meleeattackdesc,2");
                if (null != var2) {
                  jd.field_nb[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(75, "poweruptips,0");
                if (null != var2) {
                  ll.field_p[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 119, "poweruptips,1");
                if (null != var2) {
                  ll.field_p[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "poweruptips,2");
                if (var2 != null) {
                  ll.field_p[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 101, "poweruptips,3");
                if (null != var2) {
                  ll.field_p[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 88, "poweruptips,4");
                if (null != var2) {
                  ll.field_p[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "poweruptips,5");
                if (var2 != null) {
                  ll.field_p[5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(51, "poweruptips,6");
                if (var2 != null) {
                  ll.field_p[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 119, "poweruptips,7");
                if (null != var2) {
                  ll.field_p[7] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(67, "poweruptips,8");
                if (null != var2) {
                  ll.field_p[8] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(98, "poweruptips,9");
                if (null != var2) {
                  ll.field_p[9] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 56, "poweruptips,10");
                if (var2 != null) {
                  ll.field_p[10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(65, "poweruptips,11");
                if (var2 != null) {
                  ll.field_p[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 79, "poweruptips,12");
                if (null != var2) {
                  ll.field_p[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 73, "poweruptips,13");
                if (var2 != null) {
                  ll.field_p[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 92, "poweruptips,14");
                if (null != var2) {
                  ll.field_p[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "poweruptips,15");
            }
            void runChunk1() throws java.lang.RuntimeException {
                if (null != var2) {
                  ll.field_p[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "poweruptips,16");
                if (var2 != null) {
                  ll.field_p[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 64, "poweruptips,17");
                if (null != var2) {
                  ll.field_p[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "poweruptips,18");
                if (var2 != null) {
                  ll.field_p[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "poweruptips,19");
                if (var2 != null) {
                  ll.field_p[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "poweruptips,20");
                if (null != var2) {
                  ll.field_p[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "poweruptips,21");
                if (null != var2) {
                  ll.field_p[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "poweruptips,22");
                if (var2 != null) {
                  ll.field_p[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "poweruptips,23");
                if (var2 != null) {
                  ll.field_p[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 64, "poweruptips,24");
                if (var2 != null) {
                  ll.field_p[24] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(114, "poweruptips,25");
                if (null != var2) {
                  ll.field_p[25] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(111, "poweruptips,26");
                if (null != var2) {
                  ll.field_p[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "poweruptips,27");
                if (var2 != null) {
                  ll.field_p[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "poweruptips,28");
                if (var2 != null) {
                  ll.field_p[28] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(90, "poweruptips,29");
                if (null != var2) {
                  ll.field_p[29] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(98, "poweruptips,30");
                if (null != var2) {
                  ll.field_p[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "poweruptips,31");
                if (var2 != null) {
                  ll.field_p[31] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(85, "poweruptips,32");
                if (var2 != null) {
                  ll.field_p[32] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "poweruptips,33");
                if (var2 != null) {
                  ll.field_p[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "poweruptips,34");
                if (var2 != null) {
                  ll.field_p[34] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(67, "poweruptips,35");
                if (var2 != null) {
                  ll.field_p[35] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 72, "poweruptips,36");
                if (var2 != null) {
                  ll.field_p[36] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "poweruptips,37");
                if (null != var2) {
                  ll.field_p[37] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 94, "poweruptips,38");
                if (var2 != null) {
                  ll.field_p[38] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "poweruptips,39");
                if (null != var2) {
                  ll.field_p[39] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 125, "poweruptips,40");
                if (null != var2) {
                  ll.field_p[40] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "poweruptips,41");
                if (null != var2) {
                  ll.field_p[41] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "poweruptips,42");
                if (null != var2) {
                  ll.field_p[42] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "poweruptips,43");
                if (null != var2) {
                  ll.field_p[43] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "poweruptips,44");
                if (null != var2) {
                  ll.field_p[44] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "poweruptips,45");
                if (var2 != null) {
                  ll.field_p[45] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "sloadertip_short");
                if (var2 != null) {
                  hm.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "moduledescriptions,0");
                if (null != var2) {
                  se.field_a[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "moduledescriptions,1");
                if (var2 != null) {
                  se.field_a[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "moduledescriptions,2");
                if (null != var2) {
                  se.field_a[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 77, "moduledescriptions,3");
                if (null != var2) {
                  se.field_a[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "moduledescriptions,4");
                if (var2 != null) {
                  se.field_a[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "moduledescriptions,5");
                if (var2 != null) {
                  se.field_a[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "moduledescriptions,6");
                if (null != var2) {
                  se.field_a[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "moduledescriptions,7");
                if (var2 != null) {
                  se.field_a[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "moduledescriptions,8");
                if (var2 != null) {
                  se.field_a[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "moduledescriptions,9");
                if (null != var2) {
                  se.field_a[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "moduledescriptions,10");
                if (var2 != null) {
                  se.field_a[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "moduledescriptions,11");
                if (var2 != null) {
                  se.field_a[11] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(107, "moduledescriptions,12");
                if (var2 != null) {
                  se.field_a[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(75, "moduledescriptions,13");
                if (null != var2) {
                  se.field_a[13] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(83, "moduledescriptions,14");
                if (var2 != null) {
                  se.field_a[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "moduledescriptions,15");
                if (null != var2) {
                  se.field_a[15] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(73, "moduledescriptions,16");
                if (var2 != null) {
                  se.field_a[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "moduledescriptions,17");
                if (null != var2) {
                  se.field_a[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 55, "moduledescriptions,18");
                if (null != var2) {
                  se.field_a[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "moduledescriptions,19");
                if (var2 != null) {
                  se.field_a[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "moduledescriptions,20");
                if (null != var2) {
                  se.field_a[20] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(81, "moduledescriptions,21");
                if (var2 != null) {
                  se.field_a[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "moduledescriptions,22");
                if (var2 != null) {
                  se.field_a[22] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(111, "moduledescriptions,23");
                if (var2 != null) {
                  se.field_a[23] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(95, "moduledescriptions,24");
                if (var2 != null) {
                  se.field_a[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "moduledescriptions,25");
                if (var2 != null) {
                  se.field_a[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "moduledescriptions,26");
                if (null != var2) {
                  se.field_a[26] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 79, "moduledescriptions,27");
                if (var2 != null) {
                  se.field_a[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "moduledescriptions,28");
                if (var2 != null) {
                  se.field_a[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 80, "moduledescriptions,29");
                if (var2 != null) {
                  se.field_a[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "moduledescriptions,30");
                if (var2 != null) {
                  se.field_a[30] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 122, "moduledescriptions,31");
                if (var2 != null) {
                  se.field_a[31] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(67, "moduledescriptions,32");
                if (var2 != null) {
                  se.field_a[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 63, "moduledescriptions,33");
                if (null != var2) {
                  se.field_a[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "comtypenames,0");
                if (null != var2) {
                  sn.field_i[0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(101, "comtypenames,1");
                if (null != var2) {
                  sn.field_i[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "comtypenames,2");
                if (var2 != null) {
                  sn.field_i[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "comtypenames,3");
                if (null != var2) {
                  sn.field_i[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "comtypenames,4");
                if (null != var2) {
                  sn.field_i[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 122, "comtypenames,5");
                if (null != var2) {
                  sn.field_i[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "comtypenames,6");
                if (null != var2) {
                  sn.field_i[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "comtypenames,7");
                if (var2 != null) {
                  sn.field_i[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "comtypenames,8");
                if (null != var2) {
                  sn.field_i[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "comtypenames,9");
                if (var2 != null) {
                  sn.field_i[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 110, "comtypenames,10");
                if (null != var2) {
                  sn.field_i[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "comtypenames,11");
                if (null != var2) {
                  sn.field_i[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "mod_category_names,0");
                if (var2 != null) {
                  si.field_D[0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(104, "mod_category_names,1");
                if (var2 != null) {
                  si.field_D[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "mod_category_names,2");
                if (var2 != null) {
                  si.field_D[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "mod_category_names,3");
                if (null != var2) {
                  si.field_D[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "mod_category_names,4");
                if (var2 != null) {
                  si.field_D[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 107, "mod_category_names,5");
                if (null != var2) {
                  si.field_D[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "mod_category_names,6");
                if (var2 != null) {
                  si.field_D[6] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(116, "mod_category_names,7");
                if (null != var2) {
                  si.field_D[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "weaponnames,0");
                if (var2 != null) {
                  uh.field_i[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 79, "weaponnames,1");
                if (null != var2) {
                  uh.field_i[1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 72, "weaponnames,2");
                if (null != var2) {
                  uh.field_i[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 88, "weaponnames,3");
                if (var2 != null) {
                  uh.field_i[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 126, "weaponnames,4");
                if (null != var2) {
                  uh.field_i[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "weaponnames,5");
                if (var2 != null) {
                  uh.field_i[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "weaponnames,6");
                if (var2 != null) {
                  uh.field_i[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 103, "weaponnames,7");
                if (var2 != null) {
                  uh.field_i[7] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 117, "weaponnames,8");
                if (var2 != null) {
                  uh.field_i[8] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(110, "weaponnames,9");
                if (null != var2) {
                  uh.field_i[9] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(124, "weaponnames,10");
                if (var2 != null) {
                  uh.field_i[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "weaponnames,11");
                if (null != var2) {
                  uh.field_i[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 77, "weaponnames,12");
                if (var2 != null) {
                  uh.field_i[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "weaponnames,13");
                if (null != var2) {
                  uh.field_i[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "weaponnames,14");
                if (var2 != null) {
                  uh.field_i[14] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 93, "weaponnames,15");
                if (null != var2) {
                  uh.field_i[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "weaponnames,16");
                if (null != var2) {
                  uh.field_i[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "weaponnames,17");
                if (var2 != null) {
                  uh.field_i[17] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(113, "weaponnames,18");
                if (null != var2) {
                  uh.field_i[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "weaponnames,19");
                if (var2 != null) {
                  uh.field_i[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "weaponnames,20");
                if (null != var2) {
                  uh.field_i[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "weaponnames,21");
                if (null != var2) {
                  uh.field_i[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "weaponnames,22");
                if (null != var2) {
                  uh.field_i[22] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(58, "weaponnames,23");
                if (var2 != null) {
                  uh.field_i[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "weaponnames,24");
                if (null != var2) {
                  uh.field_i[24] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(118, "weaponnames,25");
                if (null != var2) {
                  uh.field_i[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "weaponnames,26");
                if (var2 != null) {
                  uh.field_i[26] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(107, "weaponnames,27");
                if (null != var2) {
                  uh.field_i[27] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(64, "weaponnames,28");
                if (var2 != null) {
                  uh.field_i[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 120, "weaponnames,29");
                if (var2 != null) {
                  uh.field_i[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "weaponnames,30");
                if (null != var2) {
                  uh.field_i[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "weaponnames,31");
                if (null != var2) {
                  uh.field_i[31] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "weaponnames,32");
                if (var2 != null) {
                  uh.field_i[32] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(74, "weaponnames,33");
                if (var2 != null) {
                  uh.field_i[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "weaponnames,34");
                if (null != var2) {
                  uh.field_i[34] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "weaponnames,35");
                if (null != var2) {
                  uh.field_i[35] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(58, "weaponkillstrings,0");
                if (var2 != null) {
                  pe.field_D[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(87, "weaponkillstrings,1");
                if (var2 != null) {
                  pe.field_D[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "weaponkillstrings,2");
                if (var2 != null) {
                  pe.field_D[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "weaponkillstrings,3");
                if (var2 != null) {
                  pe.field_D[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "weaponkillstrings,4");
                if (null != var2) {
                  pe.field_D[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "weaponkillstrings,5");
                if (null != var2) {
                  pe.field_D[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "weaponkillstrings,6");
                if (var2 != null) {
                  pe.field_D[6] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 65, "weaponkillstrings,7");
                if (var2 != null) {
                  pe.field_D[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "weaponkillstrings,8");
                if (null != var2) {
                  pe.field_D[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "weaponkillstrings,9");
                if (null != var2) {
                  pe.field_D[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 71, "weaponkillstrings,10");
                if (null != var2) {
                  pe.field_D[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "weaponkillstrings,11");
                if (var2 != null) {
                  pe.field_D[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "weaponkillstrings,12");
                if (null != var2) {
                  pe.field_D[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "weaponkillstrings,13");
                if (var2 != null) {
                  pe.field_D[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "weaponkillstrings,14");
                if (null != var2) {
                  pe.field_D[14] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(79, "weaponkillstrings,15");
                if (var2 != null) {
                  pe.field_D[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "weaponkillstrings,16");
                if (null != var2) {
                  pe.field_D[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "weaponkillstrings,17");
                if (var2 != null) {
                  pe.field_D[17] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(78, "weaponkillstrings,18");
                if (null != var2) {
                  pe.field_D[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "weaponkillstrings,19");
                if (var2 != null) {
                  pe.field_D[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "weaponkillstrings,20");
                if (null != var2) {
                  pe.field_D[20] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(122, "weaponkillstrings,21");
                if (null != var2) {
                  pe.field_D[21] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(126, "weaponkillstrings,22");
                if (null != var2) {
                  pe.field_D[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(106, "weaponkillstrings,23");
                if (null != var2) {
                  pe.field_D[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "weaponkillstrings,24");
                if (null != var2) {
                  pe.field_D[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "weaponkillstrings,25");
                if (null != var2) {
                  pe.field_D[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "weaponkillstrings,26");
                if (null != var2) {
                  pe.field_D[26] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(119, "weaponkillstrings,27");
                if (var2 != null) {
                  pe.field_D[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "weaponkillstrings,28");
                if (var2 != null) {
                  pe.field_D[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "weaponkillstrings,29");
                if (null != var2) {
                  pe.field_D[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 96, "weaponkillstrings,30");
                if (var2 != null) {
                  pe.field_D[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 92, "weaponkillstrings,31");
                if (null != var2) {
                  pe.field_D[31] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "weaponkillstrings,32");
                if (var2 != null) {
                  pe.field_D[32] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 69, "weaponkillstrings,33");
                if (var2 != null) {
                  pe.field_D[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 125, "weaponkillstrings,34");
                if (var2 != null) {
                  pe.field_D[34] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 76, "weaponkillstrings,35");
                if (null != var2) {
                  pe.field_D[35] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "hitbyshipmsg");
                if (null != var2) {
                  ac.field_Z = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(68, "space_shotbyshipmsg");
                if (null != var2) {
                  gm.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "lost_shotbyshipmsg");
                if (var2 != null) {
                  vb.field_h = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 65, "selfkillmsg");
                if (var2 != null) {
                  l.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 99, "caughtinexplosionmsg");
                if (null != var2) {
                  jk.field_k = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "destroyedinexplosionmsg");
                if (var2 != null) {
                  pf.field_r = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(100, "caughtinnukeexplosionmsg");
                if (var2 != null) {
                  re.field_ab = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "destroyedinnukeexplosionmsg");
                if (null != var2) {
                  lb.field_Vb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "expertlysniped");
                if (var2 != null) {
                  ch.field_I = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "closecombatmsg,0");
                if (var2 != null) {
                  un.field_k[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "closecombatmsg,1");
                if (var2 != null) {
                  un.field_k[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "closecombatmsg,2");
                if (null != var2) {
                  un.field_k[2] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(53, "closecombatmsg,3");
                if (var2 != null) {
                  un.field_k[3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(108, "destroyedmsg");
                if (var2 != null) {
                  NodeDeque.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 110, "destroyedsomehowmsg");
                if (null != var2) {
                  ob.field_s = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 76, "damagedmsg");
                if (null != var2) {
                  cc.field_Tb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "andfinishedbydronemsg");
                if (null != var2) {
                  vc.field_k = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "andfinishedbyrockmsg");
                if (var2 != null) {
                  da.field_i = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(59, "plummetmsg");
                if (var2 != null) {
                  kf.field_v = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 96, "andplummetmsg");
                if (null != var2) {
                  PartInstruction.field_c = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(126, "unknownfoe");
                if (null != var2) {
                  il.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 81, "killedwhenrocketintercepted");
                if (null != var2) {
                  ki.field_pb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 90, "killedwhenmissileintercepted");
                if (var2 != null) {
                  vm.field_o = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 112, "killedwhenbombintercepted");
                if (null != var2) {
                  gl.field_r = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 78, "weaponstatlabels,0");
                if (var2 != null) {
                  bi.field_b[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 113, "weaponstatlabels,1");
                if (var2 != null) {
                  bi.field_b[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "weaponstatlabels,2");
                if (var2 != null) {
                  bi.field_b[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "weaponstatlabels,3");
                if (var2 != null) {
                  bi.field_b[3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(127, "weaponstatlabels,4");
                if (null != var2) {
                  bi.field_b[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "weaponstatlabels,5");
                if (null != var2) {
                  bi.field_b[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "weaponstatlabels,6");
                if (var2 != null) {
                  bi.field_b[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "weaponstatlabels,7");
                if (var2 != null) {
                  bi.field_b[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "weaponstatlabels,8");
                if (var2 != null) {
                  bi.field_b[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 120, "weaponclasstxt");
                if (var2 != null) {
                  im.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "Weapon_class_names,0");
                if (null != var2) {
                  li.field_B[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "Weapon_class_names,1");
                if (null != var2) {
                  li.field_B[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "Weapon_class_names,2");
                if (var2 != null) {
                  li.field_B[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "Weapon_class_names,3");
                if (null != var2) {
                  li.field_B[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 60, "Weapon_class_names,4");
                if (null != var2) {
                  li.field_B[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "Weapon_class_names,5");
                if (var2 != null) {
                  li.field_B[5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(51, "Weapon_class_names,6");
                if (null != var2) {
                  li.field_B[6] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "Weapon_class_names,7");
                if (null != var2) {
                  li.field_B[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "Weapon_class_names,8");
                if (var2 != null) {
                  li.field_B[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 85, "Weapon_class_names,9");
                if (var2 != null) {
                  li.field_B[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "Weapon_class_names,10");
                if (null != var2) {
                  li.field_B[10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(116, "Weapon_class_names,11");
                if (null != var2) {
                  li.field_B[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 92, "Weapon_class_names,12");
                if (var2 != null) {
                  li.field_B[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "Weapon_class_names,13");
                if (null != var2) {
                  li.field_B[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "Weapon_class_names,14");
                if (var2 != null) {
                  li.field_B[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "Weapon_class_names,15");
                if (null != var2) {
                  li.field_B[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "Weapon_class_names,16");
                if (null != var2) {
                  li.field_B[16] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(69, "Weapon_class_names,17");
                if (var2 != null) {
                  li.field_B[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "Weapon_class_names,18");
                if (var2 != null) {
                  li.field_B[18] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(109, "Weapon_class_names,19");
                if (var2 != null) {
                  li.field_B[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "sentinel_descriptions,0");
                if (var2 != null) {
                  ig.field_g[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "sentinel_descriptions,1");
                if (var2 != null) {
                  ig.field_g[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "sentinel_descriptions,2");
                if (var2 != null) {
                  ig.field_g[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "sentinel_descriptions,3");
                if (var2 != null) {
                  ig.field_g[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(69, "sentinel_descriptions,4");
                if (var2 != null) {
                  ig.field_g[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "sentinel_descriptions,5");
                if (var2 != null) {
                  ig.field_g[5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(76, "sentinel_descriptions,6");
                if (var2 != null) {
                  ig.field_g[6] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "sentinel_descriptions,7");
                if (var2 != null) {
                  ig.field_g[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(116, "sentinel_descriptions,8");
                if (null != var2) {
                  ig.field_g[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "sentinel_descriptions,9");
                if (var2 != null) {
                  ig.field_g[9] = jk.a(13, var2);
                }
            }
            void runChunk2() throws java.lang.RuntimeException {
                var2 = SentinelDesigner.a(68, "sentinel_descriptions,10");
                if (var2 != null) {
                  ig.field_g[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "sentinel_descriptions,11");
                if (var2 != null) {
                  ig.field_g[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 57, "weapondescriptions,0");
                if (var2 != null) {
                  db.field_g[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 61, "weapondescriptions,1");
                if (null != var2) {
                  db.field_g[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(57, "weapondescriptions,2");
                if (var2 != null) {
                  db.field_g[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 97, "weapondescriptions,3");
                if (null != var2) {
                  db.field_g[3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(121, "weapondescriptions,4");
                if (null != var2) {
                  db.field_g[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "weapondescriptions,5");
                if (null != var2) {
                  db.field_g[5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(118, "weapondescriptions,6");
                if (var2 != null) {
                  db.field_g[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(69, "weapondescriptions,7");
                if (var2 != null) {
                  db.field_g[7] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "weapondescriptions,8");
                if (var2 != null) {
                  db.field_g[8] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "weapondescriptions,9");
                if (null != var2) {
                  db.field_g[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "weapondescriptions,10");
                if (var2 != null) {
                  db.field_g[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "weapondescriptions,11");
                if (null != var2) {
                  db.field_g[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 116, "weapondescriptions,12");
                if (null != var2) {
                  db.field_g[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "weapondescriptions,13");
                if (null != var2) {
                  db.field_g[13] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(69, "weapondescriptions,14");
                if (var2 != null) {
                  db.field_g[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "weapondescriptions,15");
                if (null != var2) {
                  db.field_g[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "weapondescriptions,16");
                if (null != var2) {
                  db.field_g[16] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(70, "weapondescriptions,17");
                if (var2 != null) {
                  db.field_g[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "weapondescriptions,18");
                if (var2 != null) {
                  db.field_g[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 65, "weapondescriptions,19");
                if (null != var2) {
                  db.field_g[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "weapondescriptions,20");
                if (null != var2) {
                  db.field_g[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "weapondescriptions,21");
                if (null != var2) {
                  db.field_g[21] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(90, "weapondescriptions,22");
                if (null != var2) {
                  db.field_g[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "weapondescriptions,23");
                if (null != var2) {
                  db.field_g[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "weapondescriptions,24");
                if (var2 != null) {
                  db.field_g[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "weapondescriptions,25");
                if (var2 != null) {
                  db.field_g[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "weapondescriptions,26");
                if (null != var2) {
                  db.field_g[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "weapondescriptions,27");
                if (var2 != null) {
                  db.field_g[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "weapondescriptions,28");
                if (null != var2) {
                  db.field_g[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 123, "weapondescriptions,29");
                if (null != var2) {
                  db.field_g[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "weapondescriptions,30");
                if (var2 != null) {
                  db.field_g[30] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 111, "weapondescriptions,31");
                if (var2 != null) {
                  db.field_g[31] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "weapondescriptions,32");
                if (null != var2) {
                  db.field_g[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "weapondescriptions,33");
                if (var2 != null) {
                  db.field_g[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 94, "weapondescriptions,34");
                if (null != var2) {
                  db.field_g[34] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 105, "weapondescriptions,35");
                if (null != var2) {
                  db.field_g[35] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(106, "cannotbefiredinair");
                if (null != var2) {
                  al.field_h = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(114, "closecombattxt");
                if (var2 != null) {
                  oa.field_H = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 88, "gameoptlabels,0");
                if (null != var2) {
                  bb.field_R[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "gameoptlabels,1");
                if (var2 != null) {
                  bb.field_R[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "gameoptlabels,2");
                if (null != var2) {
                  bb.field_R[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 87, "gameoptnames,0,0");
                if (null != var2) {
                  te.field_c[0][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "gameoptnames,0,1");
                if (null != var2) {
                  te.field_c[0][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "gameoptnames,1,0");
                if (null != var2) {
                  te.field_c[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "gameoptnames,1,1");
                if (null != var2) {
                  te.field_c[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "gameoptnames,1,2");
                if (var2 != null) {
                  te.field_c[1][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "gameoptnames,1,3");
                if (null != var2) {
                  te.field_c[1][3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(56, "gameoptnames,1,4");
                if (null != var2) {
                  te.field_c[1][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 54, "gameoptnames,2,0");
                if (null != var2) {
                  te.field_c[2][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "gameoptnames,2,1");
                if (var2 != null) {
                  te.field_c[2][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 85, "gameoptnames,2,2");
                if (var2 != null) {
                  te.field_c[2][2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(85, "gameoptnames,2,3");
                if (var2 != null) {
                  te.field_c[2][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "gameoptnames,2,4");
                if (var2 != null) {
                  te.field_c[2][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 75, "gameoptnames,2,5");
                if (var2 != null) {
                  te.field_c[2][5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(58, "gameopttooltips,0,0");
                if (var2 != null) {
                  ParticleEffect.field_y[0][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(116, "gameopttooltips,0,1");
                if (var2 != null) {
                  ParticleEffect.field_y[0][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "gameopttooltips,1,0");
                if (var2 != null) {
                  ParticleEffect.field_y[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 92, "gameopttooltips,1,1");
                if (var2 != null) {
                  ParticleEffect.field_y[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "gameopttooltips,1,2");
                if (var2 != null) {
                  ParticleEffect.field_y[1][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 61, "gameopttooltips,1,3");
                if (var2 != null) {
                  ParticleEffect.field_y[1][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 90, "gameopttooltips,1,4");
                if (var2 != null) {
                  ParticleEffect.field_y[1][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 53, "gameopttooltips,2,0");
                if (var2 != null) {
                  ParticleEffect.field_y[2][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "gameopttooltips,2,1");
                if (var2 != null) {
                  ParticleEffect.field_y[2][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "gameopttooltips,2,2");
                if (var2 != null) {
                  ParticleEffect.field_y[2][2] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(51, "gameopttooltips,2,3");
                if (null != var2) {
                  ParticleEffect.field_y[2][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "gameopttooltips,2,4");
                if (null != var2) {
                  ParticleEffect.field_y[2][4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(106, "gameopttooltips,2,5");
                if (null != var2) {
                  ParticleEffect.field_y[2][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "instruction_set,0,0");
                if (null != var2) {
                  wc.field_g[0][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "instruction_set,1,0");
                if (null != var2) {
                  wc.field_g[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "instruction_set,1,1");
                if (null != var2) {
                  wc.field_g[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "instruction_set,2,0");
                if (null != var2) {
                  wc.field_g[2][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "instruction_set,3,0");
                if (var2 != null) {
                  wc.field_g[3][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(104, "instruction_set,3,1");
                if (null != var2) {
                  wc.field_g[3][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "instruction_set,4,0");
                if (var2 != null) {
                  wc.field_g[4][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "instruction_set,5,0");
                if (var2 != null) {
                  wc.field_g[5][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "instruction_set,6,0");
                if (null != var2) {
                  wc.field_g[6][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "instruction_set,7,0");
                if (var2 != null) {
                  wc.field_g[7][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "instruction_set,8,0");
                if (var2 != null) {
                  wc.field_g[8][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 51, "instruction_set,9,0");
                if (null != var2) {
                  wc.field_g[9][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "instruction_set,10,0");
                if (var2 != null) {
                  wc.field_g[10][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 117, "instruction_set,11,0");
                if (null != var2) {
                  wc.field_g[11][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 115, "instruction_set,12,0");
                if (var2 != null) {
                  wc.field_g[12][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "instruction_set,12,1");
                if (null != var2) {
                  wc.field_g[12][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "instruction_set,13,0");
                if (var2 != null) {
                  wc.field_g[13][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "instruction_set,13,1");
                if (var2 != null) {
                  wc.field_g[13][1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(52, "instruction_set,14,0");
                if (null != var2) {
                  wc.field_g[14][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "instruction_set,15,0");
                if (var2 != null) {
                  wc.field_g[15][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "instruction_set,16,0");
                if (var2 != null) {
                  wc.field_g[16][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 88, "instruction_set,17,0");
                if (var2 != null) {
                  wc.field_g[17][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(94, "instruction_set,18,0");
                if (null != var2) {
                  wc.field_g[18][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "instruction_set,19,0");
                if (var2 != null) {
                  wc.field_g[19][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 72, "instruction_set,20,0");
                if (null != var2) {
                  wc.field_g[20][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(84, "instruction_set,21,0");
                if (var2 != null) {
                  wc.field_g[21][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "instruction_set,22,0");
                if (null != var2) {
                  wc.field_g[22][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "instruction_set,23,0");
                if (var2 != null) {
                  wc.field_g[23][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "instruction_set,23,1");
                if (null != var2) {
                  wc.field_g[23][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "instruction_set,24,0");
                if (var2 != null) {
                  wc.field_g[24][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "instruction_set,24,1");
                if (var2 != null) {
                  wc.field_g[24][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "instruction_set,25,0");
                if (var2 != null) {
                  wc.field_g[25][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 74, "instruction_set,26,0");
                if (var2 != null) {
                  wc.field_g[26][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(108, "instruction_set,27,0");
                if (var2 != null) {
                  wc.field_g[27][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 106, "instruction_set,28,0");
                if (var2 != null) {
                  wc.field_g[28][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(70, "instruction_set,29,0");
                if (var2 != null) {
                  wc.field_g[29][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "instruction_set,30,0");
                if (null != var2) {
                  wc.field_g[30][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "instruction_set,31,0");
                if (var2 != null) {
                  wc.field_g[31][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "instruction_set,32,0");
                if (var2 != null) {
                  wc.field_g[32][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(52, "instruction_set,32,1");
                if (var2 != null) {
                  wc.field_g[32][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 84, "instruction_set,33,0");
                if (var2 != null) {
                  wc.field_g[33][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "instruction_set,34,0");
                if (var2 != null) {
                  wc.field_g[34][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "instruction_set,35,0");
                if (var2 != null) {
                  wc.field_g[35][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(119, "instruction_set,35,1");
                if (null != var2) {
                  wc.field_g[35][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 114, "instruction_set,36,0");
                if (null != var2) {
                  wc.field_g[36][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "instruction_set,36,1");
                if (null != var2) {
                  wc.field_g[36][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "instruction_set,37,0");
                if (null != var2) {
                  wc.field_g[37][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 88, "instruction_set,37,1");
                if (var2 != null) {
                  wc.field_g[37][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 63, "instruction_set,38,0");
                if (var2 != null) {
                  wc.field_g[38][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "instruction_set,38,1");
                if (var2 != null) {
                  wc.field_g[38][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 51, "instruction_set,39,0");
                if (var2 != null) {
                  wc.field_g[39][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(109, "instruction_set,40,0");
                if (var2 != null) {
                  wc.field_g[40][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(73, "instruction_set,41,0");
                if (var2 != null) {
                  wc.field_g[41][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "instruction_set,42,0");
                if (null != var2) {
                  wc.field_g[42][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "instruction_set,43,0");
                if (var2 != null) {
                  wc.field_g[43][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "instruction_set,44,0");
                if (var2 != null) {
                  wc.field_g[44][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "instruction_set,45,0");
                if (var2 != null) {
                  wc.field_g[45][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 98, "instruction_set,46,0");
                if (var2 != null) {
                  wc.field_g[46][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 110, "instruction_set,47,0");
                if (var2 != null) {
                  wc.field_g[47][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "instruction_set,48,0");
                if (var2 != null) {
                  wc.field_g[48][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "instruction_set,49,0");
                if (null != var2) {
                  wc.field_g[49][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(75, "instruction_set,50,0");
                if (null != var2) {
                  wc.field_g[50][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "instruction_set,51,0");
                if (null != var2) {
                  wc.field_g[51][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(60, "instruction_set,52,0");
                if (var2 != null) {
                  wc.field_g[52][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 59, "instruction_set,53,0");
                if (var2 != null) {
                  wc.field_g[53][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 77, "instruction_set,54,0");
                if (null != var2) {
                  wc.field_g[54][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "instruction_set,54,1");
                if (null != var2) {
                  wc.field_g[54][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "instruction_set,55,0");
                if (var2 != null) {
                  wc.field_g[55][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "instruction_set,56,0");
                if (null != var2) {
                  wc.field_g[56][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "instruction_set,57,0");
                if (null != var2) {
                  wc.field_g[57][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 57, "instruction_set,58,0");
                if (null != var2) {
                  wc.field_g[58][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "instruction_set,59,0");
                if (var2 != null) {
                  wc.field_g[59][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 71, "instruction_set,60,0");
                if (null != var2) {
                  wc.field_g[60][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(51, "instruction_set,61,0");
                if (var2 != null) {
                  wc.field_g[61][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "instruction_set,62,0");
                if (var2 != null) {
                  wc.field_g[62][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 109, "instruction_set,63,0");
                if (var2 != null) {
                  wc.field_g[63][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "instruction_set,64,0");
                if (null != var2) {
                  wc.field_g[64][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "instruction_set,65,0");
                if (null != var2) {
                  wc.field_g[65][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "instruction_set,66,0");
                if (null != var2) {
                  wc.field_g[66][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 107, "instruction_set,67,0");
                if (null != var2) {
                  wc.field_g[67][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "instruction_set,68,0");
                if (null != var2) {
                  wc.field_g[68][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(81, "instruction_set,69,0");
                if (var2 != null) {
                  wc.field_g[69][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 92, "instruction_set,70,0");
                if (null != var2) {
                  wc.field_g[70][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "instruction_set,71,0");
                if (null != var2) {
                  wc.field_g[71][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "instruction_set,72,0");
                if (null != var2) {
                  wc.field_g[72][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 67, "instruction_set,73,0");
                if (var2 != null) {
                  wc.field_g[73][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "instruction_set,73,1");
                if (null != var2) {
                  wc.field_g[73][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "instruction_set,73,2");
                if (null != var2) {
                  wc.field_g[73][2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(73, "instruction_set,73,3");
                if (null != var2) {
                  wc.field_g[73][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 115, "instruction_set,74,0");
                if (var2 != null) {
                  wc.field_g[74][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 51, "instruction_set,74,1");
                if (null != var2) {
                  wc.field_g[74][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "instruction_set,74,2");
                if (var2 != null) {
                  wc.field_g[74][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "instruction_set,74,3");
                if (null != var2) {
                  wc.field_g[74][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "instruction_set,75,0");
                if (null != var2) {
                  wc.field_g[75][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "instruction_set,75,1");
                if (var2 != null) {
                  wc.field_g[75][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 101, "instruction_set,75,2");
                if (null != var2) {
                  wc.field_g[75][2] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(115, "instruction_set,75,3");
                if (var2 != null) {
                  wc.field_g[75][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "instruction_set,76,0");
                if (var2 != null) {
                  wc.field_g[76][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(55, "instruction_set,76,1");
                if (var2 != null) {
                  wc.field_g[76][1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(62, "instruction_set,76,2");
                if (null != var2) {
                  wc.field_g[76][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "instruction_set,76,3");
                if (null != var2) {
                  wc.field_g[76][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "instruction_set,77,0");
                if (null != var2) {
                  wc.field_g[77][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "instruction_set,77,1");
                if (null != var2) {
                  wc.field_g[77][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 93, "instruction_set,77,2");
                if (var2 != null) {
                  wc.field_g[77][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "instruction_set,77,3");
                if (null != var2) {
                  wc.field_g[77][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "instruction_set,78,0");
                if (null != var2) {
                  wc.field_g[78][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "instruction_set,78,1");
                if (var2 != null) {
                  wc.field_g[78][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "instruction_set,78,2");
                if (var2 != null) {
                  wc.field_g[78][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "instruction_set,78,3");
                if (var2 != null) {
                  wc.field_g[78][3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(106, "instruction_set,79,0");
                if (var2 != null) {
                  wc.field_g[79][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "instruction_set,79,1");
                if (var2 != null) {
                  wc.field_g[79][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "instruction_set,79,2");
                if (var2 != null) {
                  wc.field_g[79][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "instruction_set,79,3");
                if (var2 != null) {
                  wc.field_g[79][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "instruction_set,80,0");
                if (var2 != null) {
                  wc.field_g[80][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "instruction_set,80,1");
                if (null != var2) {
                  wc.field_g[80][1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(59, "instruction_set,80,2");
                if (var2 != null) {
                  wc.field_g[80][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "instruction_set,80,3");
                if (var2 != null) {
                  wc.field_g[80][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 101, "instruction_set,81,0");
                if (null != var2) {
                  wc.field_g[81][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "instruction_set,81,1");
                if (var2 != null) {
                  wc.field_g[81][1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 84, "instruction_set,81,2");
                if (var2 != null) {
                  wc.field_g[81][2] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(97, "instruction_set,81,3");
                if (null != var2) {
                  wc.field_g[81][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "instruction_set,82,0");
                if (null != var2) {
                  wc.field_g[82][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "instruction_set,82,1");
                if (var2 != null) {
                  wc.field_g[82][1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(54, "instruction_set,83,0");
                if (null != var2) {
                  wc.field_g[83][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "instruction_set,84,0");
                if (var2 != null) {
                  wc.field_g[84][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "instruction_set,85,0");
                if (null != var2) {
                  wc.field_g[85][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(116, "instruction_set,86,0");
                if (null != var2) {
                  wc.field_g[86][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 86, "instruction_set,87,0");
                if (null != var2) {
                  wc.field_g[87][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "instruction_set,88,0");
                if (var2 != null) {
                  wc.field_g[88][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(83, "instruction_set,88,1");
                if (var2 != null) {
                  wc.field_g[88][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "instruction_set,88,2");
                if (var2 != null) {
                  wc.field_g[88][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "instruction_set,88,3");
                if (var2 != null) {
                  wc.field_g[88][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "instruction_set,89,0");
                if (var2 != null) {
                  wc.field_g[89][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(96, "instruction_set,89,1");
                if (null != var2) {
                  wc.field_g[89][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 120, "instruction_set,89,2");
                if (var2 != null) {
                  wc.field_g[89][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "instruction_set,89,3");
                if (var2 != null) {
                  wc.field_g[89][3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "instruction_set,90,0");
                if (null != var2) {
                  wc.field_g[90][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "instruction_set,90,1");
                if (var2 != null) {
                  wc.field_g[90][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "instruction_set,90,2");
                if (var2 != null) {
                  wc.field_g[90][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "instruction_set,90,3");
                if (null != var2) {
                  wc.field_g[90][3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "instruction_set,91,0");
                if (null != var2) {
                  wc.field_g[91][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "instruction_set,91,1");
                if (var2 != null) {
                  wc.field_g[91][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "instruction_set,91,2");
                if (null != var2) {
                  wc.field_g[91][2] = jk.a(13, var2);
                }
            }
            void runChunk3() throws java.lang.RuntimeException {
                var2 = SentinelDesigner.a(param0 ^ 110, "instruction_set,91,3");
                if (var2 != null) {
                  wc.field_g[91][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "instruction_set,92,0");
                if (null != var2) {
                  wc.field_g[92][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "instruction_set,92,1");
                if (null != var2) {
                  wc.field_g[92][1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(108, "instruction_set,92,2");
                if (var2 != null) {
                  wc.field_g[92][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(100, "instruction_set,92,3");
                if (var2 != null) {
                  wc.field_g[92][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "instruction_set,93,0");
                if (var2 != null) {
                  wc.field_g[93][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "instruction_set,93,1");
                if (null != var2) {
                  wc.field_g[93][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "instr_rmbcancelon");
                if (var2 != null) {
                  bc.field_yb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "instr_rmbcanceloff");
                if (var2 != null) {
                  i.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "rightclicktxt");
                if (var2 != null) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 117, "CONFIRM_ENGINEER_MSG");
                if (var2 != null) {
                  pg.field_y = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "CONFIG_UNLOCKED_MSG");
                if (null != var2) {
                  CombatWorld.field_k = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "CONFIG_UNLOCKED_LOGIN_MSG");
                if (var2 != null) {
                  td.field_ac = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "ADVISED_TO_COMPLETE_TRAINING_MSG");
                if (var2 != null) {
                  dj.field_i = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "ADVISED_TO_TRAIN_MSG");
                if (null != var2) {
                  GameApplet.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "ADVISED_TO_FINISH_TRAINING_MSG");
                if (null != var2) {
                  uj.field_l = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "RECOMMEND_LOGIN_MSG");
                if (null != var2) {
                  id.field_Tb = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 66, "DISCARD_PROGRESS_MSG");
                if (null != var2) {
                  CombatWorld.field_I = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 53, "TRAINING_COMPLETE_LOGIN_MSG");
                if (var2 != null) {
                  DualNodeDeque.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 98, "ITEMS_UNLOCKED_1_MSG");
                if (null != var2) {
                  na.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "ITEMS_UNLOCKED_2_MSG");
                if (null != var2) {
                  ej.field_s = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "CAMPAIGN_NAMES,0");
                if (null != var2) {
                  cc.field_ic[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "CAMPAIGN_NAMES,1");
                if (var2 != null) {
                  cc.field_ic[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(57, "CAMPAIGN_NAMES,2");
                if (var2 != null) {
                  cc.field_ic[2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(67, "tutorialpaused");
                if (var2 != null) {
                  ue.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "mission_titles,0");
                if (var2 != null) {
                  um.field_cb[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(93, "mission_titles,1");
                if (null != var2) {
                  um.field_cb[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(100, "mission_titles,2");
                if (var2 != null) {
                  um.field_cb[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "mission_titles,3");
                if (null != var2) {
                  um.field_cb[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 127, "mission_titles,4");
                if (null != var2) {
                  um.field_cb[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "mission_titles,5");
                if (null != var2) {
                  um.field_cb[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "mission_titles,6");
                if (var2 != null) {
                  um.field_cb[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "mission_titles,7");
                if (null != var2) {
                  um.field_cb[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 72, "mission_titles,8");
                if (null != var2) {
                  um.field_cb[8] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(119, "mission_titles,9");
                if (var2 != null) {
                  um.field_cb[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 76, "mission_titles,10");
                if (null != var2) {
                  um.field_cb[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 78, "mission_titles,11");
                if (var2 != null) {
                  um.field_cb[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(106, "mission_titles,12");
                if (null != var2) {
                  um.field_cb[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "mission_titles,13");
                if (null != var2) {
                  um.field_cb[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "mission_titles,14");
                if (var2 != null) {
                  um.field_cb[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "mission_titles,15");
                if (var2 != null) {
                  um.field_cb[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "mission_titles,16");
                if (null != var2) {
                  um.field_cb[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "mission_titles,17");
                if (var2 != null) {
                  um.field_cb[17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 108, "mission_titles,18");
                if (var2 != null) {
                  um.field_cb[18] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "mission_titles,19");
                if (var2 != null) {
                  um.field_cb[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "mission_titles,20");
                if (var2 != null) {
                  um.field_cb[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "mission_titles,21");
                if (null != var2) {
                  um.field_cb[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 127, "mission_titles,22");
                if (null != var2) {
                  um.field_cb[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "mission_titles,23");
                if (var2 != null) {
                  um.field_cb[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 106, "mission_titles,24");
                if (var2 != null) {
                  um.field_cb[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "mission_titles,25");
                if (var2 != null) {
                  um.field_cb[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "mission_titles,26");
                if (var2 != null) {
                  um.field_cb[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "mission_titles,27");
                if (var2 != null) {
                  um.field_cb[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "mission_titles,28");
                if (null != var2) {
                  um.field_cb[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "mission_titles,29");
                if (var2 != null) {
                  um.field_cb[29] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 95, "tutorialpagenames,0,0");
                if (null != var2) {
                  dl.field_N[0][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(106, "tutorialpagenames,0,1");
                if (null != var2) {
                  dl.field_N[0][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "tutorialpagenames,0,2");
                if (null != var2) {
                  dl.field_N[0][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "tutorialpagenames,0,3");
                if (null != var2) {
                  dl.field_N[0][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 96, "tutorialpagenames,0,4");
                if (var2 != null) {
                  dl.field_N[0][4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "tutorialpagenames,0,5");
                if (var2 != null) {
                  dl.field_N[0][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "tutorialpagenames,0,6");
                if (null != var2) {
                  dl.field_N[0][6] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 86, "tutorialpagenames,0,7");
                if (var2 != null) {
                  dl.field_N[0][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 122, "tutorialpagenames,0,8");
                if (var2 != null) {
                  dl.field_N[0][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "tutorialpagenames,0,9");
                if (null != var2) {
                  dl.field_N[0][9] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(52, "tutorialpagenames,0,10");
                if (var2 != null) {
                  dl.field_N[0][10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(127, "tutorialpagenames,0,11");
                if (null != var2) {
                  dl.field_N[0][11] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(98, "tutorialpagenames,1,0");
                if (null != var2) {
                  dl.field_N[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "tutorialpagenames,1,1");
                if (var2 != null) {
                  dl.field_N[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "tutorialpagenames,1,2");
                if (var2 != null) {
                  dl.field_N[1][2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(117, "tutorialpagenames,1,3");
                if (null != var2) {
                  dl.field_N[1][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 102, "tutorialpagenames,1,4");
                if (var2 != null) {
                  dl.field_N[1][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "tutorialpagenames,1,5");
                if (null != var2) {
                  dl.field_N[1][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 71, "tutorialpagenames,1,6");
                if (var2 != null) {
                  dl.field_N[1][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "tutorialpagenames,1,7");
                if (null != var2) {
                  dl.field_N[1][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "tutorialpagenames,1,8");
                if (null != var2) {
                  dl.field_N[1][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "tutorialpagenames,1,9");
                if (null != var2) {
                  dl.field_N[1][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "tutorialpagenames,1,10");
                if (var2 != null) {
                  dl.field_N[1][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "tutorialpagenames,1,11");
                if (null != var2) {
                  dl.field_N[1][11] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(71, "tutorialpagenames,1,12");
                if (null != var2) {
                  dl.field_N[1][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "tutorialpagenames,1,13");
                if (null != var2) {
                  dl.field_N[1][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 90, "tutorialpagenames,1,14");
                if (null != var2) {
                  dl.field_N[1][14] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 126, "tutorialpagenames,3,0");
                if (null != var2) {
                  dl.field_N[3][0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(113, "tutorialpagenames,3,1");
                if (var2 != null) {
                  dl.field_N[3][1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 88, "tutorialpagenames,3,2");
                if (var2 != null) {
                  dl.field_N[3][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "tutorialpagenames,3,3");
                if (null != var2) {
                  dl.field_N[3][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "tutorialpagenames,3,4");
                if (null != var2) {
                  dl.field_N[3][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "tutorialpagenames,3,5");
                if (var2 != null) {
                  dl.field_N[3][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 111, "tutorialpagenames,3,6");
                if (null != var2) {
                  dl.field_N[3][6] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 52, "tutorialpagenames,5,0");
                if (var2 != null) {
                  dl.field_N[5][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "tutorialpagenames,5,1");
                if (null != var2) {
                  dl.field_N[5][1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 110, "tutorialpagenames,5,2");
                if (null != var2) {
                  dl.field_N[5][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 55, "tutorialpagenames,5,3");
                if (null != var2) {
                  dl.field_N[5][3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(92, "tutorialpagenames,5,4");
                if (var2 != null) {
                  dl.field_N[5][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(100, "tutorialpagenames,7,0");
                if (var2 != null) {
                  dl.field_N[7][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(78, "tutorialpagenames,7,1");
                if (null != var2) {
                  dl.field_N[7][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "tutorialpagenames,7,2");
                if (null != var2) {
                  dl.field_N[7][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 126, "tutorialpagenames,7,3");
                if (var2 != null) {
                  dl.field_N[7][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "tutorialpagenames,7,4");
                if (null != var2) {
                  dl.field_N[7][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 53, "tutorialpagenames,7,5");
                if (var2 != null) {
                  dl.field_N[7][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "tutorialpagenames,7,6");
                if (var2 != null) {
                  dl.field_N[7][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 80, "tutorialpagenames,9,0");
                if (var2 != null) {
                  dl.field_N[9][0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(90, "tutorialpagenames,9,1");
                if (var2 != null) {
                  dl.field_N[9][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "tutorialpagenames,9,2");
                if (null != var2) {
                  dl.field_N[9][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 78, "tutorialpagenames,9,3");
                if (var2 != null) {
                  dl.field_N[9][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "tutorialpagenames,9,4");
                if (var2 != null) {
                  dl.field_N[9][4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(103, "tutorialpagenames,9,5");
                if (null != var2) {
                  dl.field_N[9][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(83, "tutorial_alt_controls,0,2");
                if (var2 != null) {
                  dj.field_g[0][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "tutorial_alt_controls,0,3");
                if (null != var2) {
                  dj.field_g[0][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "tutorial_alt_controls,0,4");
                if (null != var2) {
                  dj.field_g[0][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(68, "tutorial_alt_controls,0,5");
                if (null != var2) {
                  dj.field_g[0][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 127, "tutorial_alt_controls,0,6");
                if (var2 != null) {
                  dj.field_g[0][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 71, "tutorial_alt_controls,0,7");
                if (var2 != null) {
                  dj.field_g[0][7] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 117, "tutorial_alt_controls,0,8");
                if (var2 != null) {
                  dj.field_g[0][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(97, "tutorial_alt_controls,0,9");
                if (null != var2) {
                  dj.field_g[0][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "tutorial_alt_controls,0,10");
                if (null != var2) {
                  dj.field_g[0][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 89, "tutorial_alt_controls,0,12");
                if (var2 != null) {
                  dj.field_g[0][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "tutorial_alt_controls,0,13");
                if (var2 != null) {
                  dj.field_g[0][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 70, "tutorial_alt_controls,0,14");
                if (var2 != null) {
                  dj.field_g[0][14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "tutorial_alt_controls,0,15");
                if (null != var2) {
                  dj.field_g[0][15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "tutorial_alt_controls,0,20");
                if (var2 != null) {
                  dj.field_g[0][20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "tutorial_alt_controls,1,10");
                if (var2 != null) {
                  dj.field_g[1][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "tutorial_alt_controls,1,11");
                if (null != var2) {
                  dj.field_g[1][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "tutorial_alt_controls,1,12");
                if (null != var2) {
                  dj.field_g[1][12] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(86, "tutorial_alt_controls,1,13");
                if (null != var2) {
                  dj.field_g[1][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 100, "tutorial_alt_controls,3,2");
                if (null != var2) {
                  dj.field_g[3][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "tutorial_alt_controls,3,3");
                if (null != var2) {
                  dj.field_g[3][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "tutorial_alt_controls,3,4");
                if (var2 != null) {
                  dj.field_g[3][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 75, "tutorial_alt_controls,3,5");
                if (null != var2) {
                  dj.field_g[3][5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(79, "tutorial_b,0,0");
                if (var2 != null) {
                  dl.field_H[0][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "tutorial_b,0,1");
                if (null != var2) {
                  dl.field_H[0][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "tutorial_b,0,2");
                if (var2 != null) {
                  dl.field_H[0][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 121, "tutorial_b,0,3");
                if (var2 != null) {
                  dl.field_H[0][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "tutorial_b,0,4");
                if (var2 != null) {
                  dl.field_H[0][4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(73, "tutorial_b,0,5");
                if (var2 != null) {
                  dl.field_H[0][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "tutorial_b,0,6");
                if (null != var2) {
                  dl.field_H[0][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "tutorial_b,0,7");
                if (null != var2) {
                  dl.field_H[0][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 86, "tutorial_b,0,8");
                if (var2 != null) {
                  dl.field_H[0][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 106, "tutorial_b,0,9");
                if (var2 != null) {
                  dl.field_H[0][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "tutorial_b,0,10");
                if (var2 != null) {
                  dl.field_H[0][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "tutorial_b,0,11");
                if (null != var2) {
                  dl.field_H[0][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "tutorial_b,0,12");
                if (null != var2) {
                  dl.field_H[0][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "tutorial_b,0,13");
                if (null != var2) {
                  dl.field_H[0][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "tutorial_b,0,14");
                if (var2 != null) {
                  dl.field_H[0][14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 120, "tutorial_b,0,15");
                if (null != var2) {
                  dl.field_H[0][15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "tutorial_b,0,16");
                if (var2 != null) {
                  dl.field_H[0][16] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(64, "tutorial_b,0,17");
                if (null != var2) {
                  dl.field_H[0][17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 107, "tutorial_b,0,18");
                if (null != var2) {
                  dl.field_H[0][18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "tutorial_b,0,19");
                if (var2 != null) {
                  dl.field_H[0][19] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 98, "tutorial_b,0,20");
                if (var2 != null) {
                  dl.field_H[0][20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "tutorial_b,0,21");
                if (var2 != null) {
                  dl.field_H[0][21] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(123, "tutorial_b,0,22");
                if (var2 != null) {
                  dl.field_H[0][22] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(95, "tutorial_b,0,23");
                if (null != var2) {
                  dl.field_H[0][23] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(69, "tutorial_b,1,0");
                if (null != var2) {
                  dl.field_H[1][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "tutorial_b,1,1");
                if (null != var2) {
                  dl.field_H[1][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "tutorial_b,1,2");
                if (null != var2) {
                  dl.field_H[1][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 75, "tutorial_b,1,3");
                if (var2 != null) {
                  dl.field_H[1][3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 106, "tutorial_b,1,4");
                if (null != var2) {
                  dl.field_H[1][4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(121, "tutorial_b,1,5");
                if (null != var2) {
                  dl.field_H[1][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "tutorial_b,1,6");
                if (null != var2) {
                  dl.field_H[1][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "tutorial_b,1,7");
                if (var2 != null) {
                  dl.field_H[1][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "tutorial_b,1,8");
                if (null != var2) {
                  dl.field_H[1][8] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(62, "tutorial_b,1,9");
                if (null != var2) {
                  dl.field_H[1][9] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(113, "tutorial_b,1,10");
                if (var2 != null) {
                  dl.field_H[1][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "tutorial_b,1,11");
                if (null != var2) {
                  dl.field_H[1][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 55, "tutorial_b,1,12");
                if (null != var2) {
                  dl.field_H[1][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "tutorial_b,1,13");
                if (var2 != null) {
                  dl.field_H[1][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "tutorial_b,1,14");
                if (var2 != null) {
                  dl.field_H[1][14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "tutorial_b,1,15");
                if (var2 != null) {
                  dl.field_H[1][15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 89, "tutorial_b,1,16");
                if (var2 != null) {
                  dl.field_H[1][16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(112, "tutorial_b,1,17");
                if (var2 != null) {
                  dl.field_H[1][17] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(69, "tutorial_b,1,18");
                if (null != var2) {
                  dl.field_H[1][18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "tutorial_b,1,19");
                if (null != var2) {
                  dl.field_H[1][19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "tutorial_b,1,20");
                if (null != var2) {
                  dl.field_H[1][20] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(67, "tutorial_b,1,21");
                if (var2 != null) {
                  dl.field_H[1][21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "tutorial_b,1,22");
                if (null != var2) {
                  dl.field_H[1][22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(69, "tutorial_b,1,23");
                if (null != var2) {
                  dl.field_H[1][23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "tutorial_b,1,24");
                if (null != var2) {
                  dl.field_H[1][24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "tutorial_b,1,25");
                if (var2 != null) {
                  dl.field_H[1][25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 80, "tutorial_b,1,26");
                if (null != var2) {
                  dl.field_H[1][26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "tutorial_b,1,27");
                if (var2 != null) {
                  dl.field_H[1][27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 99, "tutorial_b,1,28");
                if (var2 != null) {
                  dl.field_H[1][28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 119, "tutorial_b,1,29");
                if (null != var2) {
                  dl.field_H[1][29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "tutorial_b,3,0");
                if (null != var2) {
                  dl.field_H[3][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "tutorial_b,3,1");
                if (null != var2) {
                  dl.field_H[3][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "tutorial_b,3,2");
                if (null != var2) {
                  dl.field_H[3][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "tutorial_b,3,3");
                if (var2 != null) {
                  dl.field_H[3][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "tutorial_b,3,4");
                if (var2 != null) {
                  dl.field_H[3][4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(122, "tutorial_b,3,5");
                if (var2 != null) {
                  dl.field_H[3][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(77, "tutorial_b,3,6");
                if (null != var2) {
                  dl.field_H[3][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "tutorial_b,3,7");
                if (null != var2) {
                  dl.field_H[3][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 96, "tutorial_b,3,8");
                if (var2 != null) {
                  dl.field_H[3][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "tutorial_b,3,9");
                if (var2 != null) {
                  dl.field_H[3][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "tutorial_b,3,10");
                if (var2 != null) {
                  dl.field_H[3][10] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(108, "tutorial_b,3,11");
                if (var2 != null) {
                  dl.field_H[3][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "tutorial_b,3,12");
                if (null != var2) {
                  dl.field_H[3][12] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(109, "tutorial_b,3,13");
                if (null != var2) {
                  dl.field_H[3][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(117, "tutorial_b,5,0");
                if (var2 != null) {
                  dl.field_H[5][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "tutorial_b,5,1");
                if (null != var2) {
                  dl.field_H[5][1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(59, "tutorial_b,5,2");
                if (var2 != null) {
                  dl.field_H[5][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "tutorial_b,5,3");
                if (null != var2) {
                  dl.field_H[5][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "tutorial_b,5,4");
                if (null != var2) {
                  dl.field_H[5][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "tutorial_b,5,5");
                if (null != var2) {
                  dl.field_H[5][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 63, "tutorial_b,5,6");
                if (null != var2) {
                  dl.field_H[5][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(116, "tutorial_b,5,7");
                if (null != var2) {
                  dl.field_H[5][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "tutorial_b,7,0");
                if (var2 != null) {
                  dl.field_H[7][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "tutorial_b,7,1");
                if (null != var2) {
                  dl.field_H[7][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "tutorial_b,7,2");
                if (null != var2) {
                  dl.field_H[7][2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 61, "tutorial_b,7,3");
                if (null != var2) {
                  dl.field_H[7][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 85, "tutorial_b,7,4");
                if (var2 != null) {
                  dl.field_H[7][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "tutorial_b,7,5");
                if (var2 != null) {
                  dl.field_H[7][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "tutorial_b,7,6");
                if (null != var2) {
                  dl.field_H[7][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 101, "tutorial_b,7,7");
                if (null != var2) {
                  dl.field_H[7][7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 103, "tutorial_b,7,8");
                if (var2 != null) {
                  dl.field_H[7][8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "tutorial_b,7,9");
                if (var2 != null) {
                  dl.field_H[7][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "tutorial_b,7,10");
                if (var2 != null) {
                  dl.field_H[7][10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(58, "tutorial_b,7,11");
            }
            void runChunk4() throws java.lang.RuntimeException {
                if (var2 != null) {
                  dl.field_H[7][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 100, "tutorial_b,7,12");
                if (null != var2) {
                  dl.field_H[7][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "tutorial_b,7,13");
                if (null != var2) {
                  dl.field_H[7][13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "tutorial_b,9,0");
                if (var2 != null) {
                  dl.field_H[9][0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "tutorial_b,9,1");
                if (var2 != null) {
                  dl.field_H[9][1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "tutorial_b,9,2");
                if (var2 != null) {
                  dl.field_H[9][2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(74, "tutorial_b,9,3");
                if (var2 != null) {
                  dl.field_H[9][3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(106, "tutorial_b,9,4");
                if (null != var2) {
                  dl.field_H[9][4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "tutorial_b,9,5");
                if (null != var2) {
                  dl.field_H[9][5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "tutorial_b,9,6");
                if (var2 != null) {
                  dl.field_H[9][6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "tutorial_b,9,7");
                if (null != var2) {
                  dl.field_H[9][7] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "tutorial_b,9,8");
                if (null != var2) {
                  dl.field_H[9][8] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 99, "tutorial_b,9,9");
                if (null != var2) {
                  dl.field_H[9][9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "tutorial_b,9,10");
                if (var2 != null) {
                  dl.field_H[9][10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(56, "tutorial_b,9,11");
                if (null != var2) {
                  dl.field_H[9][11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "tutorial_b,9,12");
                if (null != var2) {
                  dl.field_H[9][12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "tutorial_b,9,13");
                if (null != var2) {
                  dl.field_H[9][13] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(63, "tutorial_control_tips,0");
                if (null != var2) {
                  hb.field_g[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "tutorial_control_tips,1");
                if (null != var2) {
                  hb.field_g[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "CONFIG_TUTORIAL,0");
                if (var2 != null) {
                  jm.field_u[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "CONFIG_TUTORIAL,1");
                if (var2 != null) {
                  jm.field_u[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "CONFIG_TUTORIAL,2");
                if (null != var2) {
                  jm.field_u[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 51, "CONFIG_TUTORIAL,3");
                if (null != var2) {
                  jm.field_u[3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 54, "CONFIG_TUTORIAL,4");
                if (var2 != null) {
                  jm.field_u[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "CONFIG_TUTORIAL,5");
                if (var2 != null) {
                  jm.field_u[5] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "CONFIG_TUTORIAL,6");
                if (var2 != null) {
                  jm.field_u[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "CONFIG_TUTORIAL,7");
                if (var2 != null) {
                  jm.field_u[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(83, "CONFIG_TUTORIAL,8");
                if (var2 != null) {
                  jm.field_u[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 58, "CONFIG_TUTORIAL,9");
                if (null != var2) {
                  jm.field_u[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "CONFIG_TUTORIAL,10");
                if (var2 != null) {
                  jm.field_u[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "CONFIG_TUTORIAL,11");
                if (var2 != null) {
                  jm.field_u[11] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 105, "CONFIG_TUTORIAL,12");
                if (null != var2) {
                  jm.field_u[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 53, "CONFIG_TUTORIAL,13");
                if (var2 != null) {
                  jm.field_u[13] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "CONFIG_TUTORIAL,14");
                if (var2 != null) {
                  jm.field_u[14] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 108, "CONFIG_TUTORIAL,15");
                if (null != var2) {
                  jm.field_u[15] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "CONFIG_TUTORIAL,16");
                if (null != var2) {
                  jm.field_u[16] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(68, "engitxt");
                if (var2 != null) {
                  q.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "contxt");
                if (var2 != null) {
                  hc.field_cb = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(121, "trainingtxt");
                if (null != var2) {
                  qg.field_p = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "campaigntxt");
                if (var2 != null) {
                  fk.field_f = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 84, "detailtxt");
                if (var2 != null) {
                  ge.field_i = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(83, "lowdetailtxt");
                if (null != var2) {
                  fg.field_Vb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "cameracontrolstxt");
                if (var2 != null) {
                  un.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 81, "camerafollowontxt");
                if (null != var2) {
                  hf.field_b = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(114, "camerafollowofftxt");
                if (var2 != null) {
                  fm.field_h = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 60, "rmbcancelslockontxt");
                if (var2 != null) {
                  qj.field_u = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "rmbcancelslockofftxt");
                if (null != var2) {
                  he.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "controlrmbscrolls");
                if (null != var2) {
                  qm.field_c = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 121, "controlwasdscrolls");
                if (var2 != null) {
                  od.field_j = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(108, "cameraxinverton");
                if (null != var2) {
                  tm.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "cameraxinvertoff");
                if (var2 != null) {
                  fj.field_i = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "camerayinverton");
                if (var2 != null) {
                  o.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "camerayinvertoff");
                if (var2 != null) {
                  sa.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "tut1txt");
                if (null != var2) {
                  NodeIterator.field_j = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "tut2txt");
                if (var2 != null) {
                  ed.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "tut3txt");
                if (var2 != null) {
                  mg.field_Tb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "tut4txt");
                if (null != var2) {
                  pm.field_P = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "testfieldtxt");
                if (var2 != null) {
                  na.field_u = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "freeforalltxt");
                if (var2 != null) {
                  vn.field_k = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 65, "teambattletxt");
                if (var2 != null) {
                  ag.field_t = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 126, "warmodetxt");
                if (var2 != null) {
                  a.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "coopgametxt");
                if (null != var2) {
                  de.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "expansiontxt");
                if (null != var2) {
                  Sprite.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "settingstxt");
                if (var2 != null) {
                  jd.field_pb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 105, "gamemodebriefings,0");
                if (var2 != null) {
                  vd.field_e[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "gamemodebriefings,1");
                if (var2 != null) {
                  vd.field_e[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 96, "gamemodebriefings,2");
                if (var2 != null) {
                  vd.field_e[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "gamemodebriefings,3");
                if (var2 != null) {
                  vd.field_e[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "mapbriefings,0");
                if (var2 != null) {
                  nh.field_o[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "mapbriefings,1");
                if (var2 != null) {
                  nh.field_o[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 79, "mapbriefings,2");
                if (null != var2) {
                  nh.field_o[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 54, "mapbriefings,3");
                if (var2 != null) {
                  nh.field_o[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "mapbriefings,4");
                if (null != var2) {
                  nh.field_o[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "gameovertxt");
                if (null != var2) {
                  CipherPacketBuffer.field_x = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "trainingcompletetxt");
                if (var2 != null) {
                  ij.field_T = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "missioncompletetxt");
                if (null != var2) {
                  fg.field_Wb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 76, "missionendedwithoutwinningtxt");
                if (null != var2) {
                  bf.field_Eb = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(89, "restartmissiontxt");
                if (null != var2) {
                  r.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "skipmissiontxt");
                if (var2 != null) {
                  f.field_z = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "returntocampaigntxt");
                if (var2 != null) {
                  bf.field_Db = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(106, "furtherprogressrequireslogintxt");
                if (var2 != null) {
                  mg.field_Zb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "or_txt");
                if (null != var2) {
                  fg.field_Pb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "resignedtxt");
                if (var2 != null) {
                  NodeIterator.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 90, "missiontimetxt");
                if (null != var2) {
                  ak.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "wavetxt");
                if (var2 != null) {
                  jf.field_W = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(113, "discardprogresstxt");
                if (null != var2) {
                  rn.field_B = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "tagsnotrecordedtxt");
                if (null != var2) {
                  oa.field_O = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 110, "unlockedcomptxt");
                if (null != var2) {
                  qg.field_l = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "unlockedmodtxt");
                if (null != var2) {
                  wa.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "solariteearnedtxt");
                if (null != var2) {
                  de.field_g = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 78, "solaritetotaltxt");
                if (null != var2) {
                  ph.field_d = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(72, "maxsolaritetxt");
                if (var2 != null) {
                  tm.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 94, "jumpcolon");
                if (null != var2) {
                  l.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "firecolon");
                if (var2 != null) {
                  Sentinel.field_I = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "_or_");
                if (null != var2) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "startmissiontext");
                if (var2 != null) {
                  mg.field_nc = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "helptext");
                if (var2 != null) {
                  pe.field_R = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 59, "weaponleftkey");
                if (null != var2) {
                  gf.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "weaponrightkey");
                if (var2 != null) {
                  ob.field_w = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "fireeddkey");
                if (var2 != null) {
                  IntrusiveNode.field_n = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "fireempbombkey");
                if (null != var2) {
                  dc.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "fireedddesc");
                if (null != var2) {
                  bl.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 54, "fireempbombdesc");
                if (var2 != null) {
                  sf.field_v = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "targetlockdesc");
                if (var2 != null) {
                  se.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "droptargetlock");
                if (var2 != null) {
                  id.field_Zb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 105, "targetlockkey");
                if (null != var2) {
                  sn.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 52, "closecombatdesc");
                if (var2 != null) {
                  fk.field_l = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(86, "closecombatkey");
                if (null != var2) {
                  jf.field_eb = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(73, "wkey");
                if (var2 != null) {
                  qe.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "asdkeys");
                if (null != var2) {
                  ai.field_r = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 101, "haltkey");
                if (var2 != null) {
                  sn.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 84, "moveleftkey");
                if (null != var2) {
                  fm.field_i = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 60, "moverightkey");
                if (var2 != null) {
                  gm.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "alternativeleftkey");
                if (var2 != null) {
                  cl.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 113, "alternativerightkey");
                if (var2 != null) {
                  lk.field_X = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "alternativejumpkey");
                if (null != var2) {
                  jm.field_t = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 96, "alternativehaltkey");
                if (var2 != null) {
                  b.field_p = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 104, "spacekey");
                if (var2 != null) {
                  fc.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 60, "shiftkey");
                if (var2 != null) {
                  hm.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "centrecamerakey");
                if (var2 != null) {
                  pl.field_V = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 62, "keycode_scrollup");
                if (null != var2) {
                  fm.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(65, "keycode_scrollleft");
                if (var2 != null) {
                  sa.field_c = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(56, "keycode_scrolldown");
                if (var2 != null) {
                  pd.field_V = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(80, "keycode_scrollright");
                if (null != var2) {
                  on.field_h = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(param0 ^ 119, "keycode_moveleft");
                if (var2 != null) {
                  jf.field_hb = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(param0 ^ 61, "keycode_moveright");
                if (null != var2) {
                  rj.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(88, "keycode_halt");
                if (null != var2) {
                  fe.field_y = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(96, "keycode_prevweapon");
                if (var2 != null) {
                  ln.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(70, "keycode_nextweapon");
                if (var2 != null) {
                  vh.field_c = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(124, "keycode_firemelee");
                if (var2 != null) {
                  na.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(param0 ^ 112, "keycode_empbomb");
                if (null != var2) {
                  ff.field_nb = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(116, "keycode_edd");
                if (null != var2) {
                  dg.field_d = var2[0] & 255;
                }
                var2 = SentinelDesigner.a(100, "keycode_centrecamera");
                if (null != var2) {
                  b.field_b = 255 & var2[0];
                }
                var2 = SentinelDesigner.a(83, "spawndronestxt");
                if (null != var2) {
                  SteelSentinels.field_I = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(80, "cleardronestxt");
                if (null != var2) {
                  sl.field_f = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(81, "backtoconfigtxt");
                if (var2 != null) {
                  ha.field_S = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "closepreambletxt");
                if (var2 != null) {
                  ja.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(100, "teamscoretxt");
                if (null != var2) {
                  kk.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "empstatus");
                if (null != var2) {
                  r.field_i = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(73, "noenergystatus");
                if (var2 != null) {
                  hk.field_pc = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "n_sec");
                if (var2 != null) {
                  f.field_E = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(70, "componentnames,0");
                if (null != var2) {
                  t.field_e[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 126, "componentnames,1");
                if (var2 != null) {
                  t.field_e[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 82, "componentnames,2");
                if (null != var2) {
                  t.field_e[2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(91, "componentnames,3");
                if (var2 != null) {
                  t.field_e[3] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 90, "componentnames,17");
                if (null != var2) {
                  t.field_e[17] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(85, "componentnames,18");
                if (var2 != null) {
                  t.field_e[18] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "componentnames,19");
                if (var2 != null) {
                  t.field_e[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(69, "componentnames,20");
                if (null != var2) {
                  t.field_e[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(126, "componentnames,21");
                if (null != var2) {
                  t.field_e[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 106, "componentnames,22");
                if (var2 != null) {
                  t.field_e[22] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(90, "componentnames,23");
                if (null != var2) {
                  t.field_e[23] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 88, "componentnames,24");
                if (var2 != null) {
                  t.field_e[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(55, "componentnames,25");
                if (var2 != null) {
                  t.field_e[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(125, "componentnames,26");
                if (null != var2) {
                  t.field_e[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "componentnames,27");
                if (var2 != null) {
                  t.field_e[27] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "componentnames,28");
                if (var2 != null) {
                  t.field_e[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "componentnames,29");
                if (var2 != null) {
                  t.field_e[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "componentnames,30");
                if (null != var2) {
                  t.field_e[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 105, "componentnames,31");
                if (var2 != null) {
                  t.field_e[31] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 72, "componentnames,32");
                if (var2 != null) {
                  t.field_e[32] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(90, "componentnames,33");
                if (var2 != null) {
                  t.field_e[33] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(52, "componentnames,34");
                if (var2 != null) {
                  t.field_e[34] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 93, "componentnames,35");
                if (null != var2) {
                  t.field_e[35] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 58, "componentnames,36");
                if (var2 != null) {
                  t.field_e[36] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(103, "componentnames,37");
                if (var2 != null) {
                  t.field_e[37] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "componentnames,38");
                if (null != var2) {
                  t.field_e[38] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 120, "componentnames,42");
                if (null != var2) {
                  t.field_e[42] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(71, "componentnames,43");
                if (var2 != null) {
                  t.field_e[43] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 122, "componentnames,44");
                if (var2 != null) {
                  t.field_e[44] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "componentnames,45");
                if (null != var2) {
                  t.field_e[45] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 61, "componentnames,46");
                if (null != var2) {
                  t.field_e[46] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "componentnames,47");
                if (var2 != null) {
                  t.field_e[47] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "componentnames,48");
                if (null != var2) {
                  t.field_e[48] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(127, "componentnames,49");
                if (var2 != null) {
                  t.field_e[49] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "componentnames,50");
                if (null != var2) {
                  t.field_e[50] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "componentnames,51");
                if (var2 != null) {
                  t.field_e[51] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "componentnames,52");
                if (null != var2) {
                  t.field_e[52] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 100, "componentnames,53");
                if (null != var2) {
                  t.field_e[53] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "componentnames,54");
                if (null != var2) {
                  t.field_e[54] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(119, "componentnames,55");
                if (null != var2) {
                  t.field_e[55] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "componentnames,56");
                if (var2 != null) {
                  t.field_e[56] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(107, "componentnames,57");
                if (null != var2) {
                  t.field_e[57] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(110, "componentnames,58");
                if (null != var2) {
                  t.field_e[58] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "componentnames,59");
                if (var2 != null) {
                  t.field_e[59] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(87, "componentnames,60");
                if (null != var2) {
                  t.field_e[60] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "componentnames,61");
                if (null != var2) {
                  t.field_e[61] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "componentnames,62");
                if (var2 != null) {
                  t.field_e[62] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(90, "componentnames,64");
                if (null != var2) {
                  t.field_e[64] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 86, "componentnames,65");
                if (null != var2) {
                  t.field_e[65] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 55, "componentnames,66");
                if (null != var2) {
                  t.field_e[66] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "componentnames,67");
                if (null != var2) {
                  t.field_e[67] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 52, "componentnames,68");
                if (null != var2) {
                  t.field_e[68] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "componentnames,69");
                if (var2 != null) {
                  t.field_e[69] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 115, "componentnames,70");
                if (var2 != null) {
                  t.field_e[70] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 112, "componentnames,71");
                if (var2 != null) {
                  t.field_e[71] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "componentnames,72");
                if (null != var2) {
                  t.field_e[72] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "componentnames,73");
                if (null != var2) {
                  t.field_e[73] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "componentnames,74");
                if (null != var2) {
                  t.field_e[74] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "componentnames,75");
                if (null != var2) {
                  t.field_e[75] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "componentnames,76");
                if (null != var2) {
                  t.field_e[76] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 57, "componentnames,77");
                if (var2 != null) {
                  t.field_e[77] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(81, "componentnames,78");
                if (null != var2) {
                  t.field_e[78] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(117, "componentnames,79");
                if (var2 != null) {
                  t.field_e[79] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 96, "componentnames,80");
                if (var2 != null) {
                  t.field_e[80] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "componentnames,81");
                if (null != var2) {
                  t.field_e[81] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 84, "componentnames,82");
                if (null != var2) {
                  t.field_e[82] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 106, "componentnames,83");
                if (var2 != null) {
                  t.field_e[83] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(67, "componentnames,84");
                if (null != var2) {
                  t.field_e[84] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(91, "componentnames,85");
                if (null != var2) {
                  t.field_e[85] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(102, "componentnames,86");
                if (null != var2) {
                  t.field_e[86] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "componentnames,87");
                if (var2 != null) {
                  t.field_e[87] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "componentnames,88");
                if (null != var2) {
                  t.field_e[88] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 79, "componentnames,89");
                if (var2 != null) {
                  t.field_e[89] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "componentnames,90");
                if (var2 != null) {
                  t.field_e[90] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "componentnames,91");
                if (null != var2) {
                  t.field_e[91] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "componentnames,92");
                if (null != var2) {
                  t.field_e[92] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 105, "componentnames,93");
                if (var2 != null) {
                  t.field_e[93] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "componentnames,95");
                if (var2 != null) {
                  t.field_e[95] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "slotnames,0");
                if (var2 != null) {
                  kk.field_h[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 83, "slotnames,1");
                if (var2 != null) {
                  kk.field_h[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 61, "slotnames,2");
                if (var2 != null) {
                  kk.field_h[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 97, "slotnames,3");
                if (null != var2) {
                  kk.field_h[3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(79, "slotnames,4");
                if (var2 != null) {
                  kk.field_h[4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 62, "slotnames,5");
                if (null != var2) {
                  kk.field_h[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "healthtxt");
                if (var2 != null) {
                  tj.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "energytxt");
                if (var2 != null) {
                  vg.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "suddendeathtxt");
                if (null != var2) {
                  nh.field_A = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(73, "suddendeathcountdowntxt");
                if (null != var2) {
                  wb.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "calamitycountdowntxt");
            }
            void runChunk5() throws java.lang.RuntimeException {
                if (var2 != null) {
                  hk.field_jc = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(59, "previousmessagetip");
                if (null != var2) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "replaymessagetip");
                if (null != var2) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "stopmessagetip");
                if (var2 != null) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "nextmessagetip");
                if (null != var2) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "tutorialnext_tip");
                if (var2 != null) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "missiontxt");
                if (null != var2) {
                  dc.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 64, "missionprogresstxt");
                if (null != var2) {
                  ne.field_J = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 103, "missioncurtime");
                if (null != var2) {
                  il.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(103, "missionrespawns");
                if (null != var2) {
                  sn.field_k = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 57, "missioncampaigntime");
                if (null != var2) {
                  ub.field_k = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "coop_wave");
                if (var2 != null) {
                  ci.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(98, "coop_respawns");
                if (var2 != null) {
                  mc.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 65, "campaigntimetxt");
                if (var2 != null) {
                  ic.field_E = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "unlimitedtxt");
                if (null != var2) {
                  NodeDeque.field_b = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(88, "TEAM_NAMES,0");
                if (var2 != null) {
                  mm.field_d[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "TEAM_NAMES,1");
                if (null != var2) {
                  mm.field_d[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "TEAM_NAMES,2");
                if (null != var2) {
                  mm.field_d[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "SENTINEL_NAMES,0");
                if (var2 != null) {
                  cd.field_c[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "SENTINEL_NAMES,1");
                if (null != var2) {
                  cd.field_c[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 109, "SENTINEL_NAMES,2");
                if (null != var2) {
                  cd.field_c[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "SENTINEL_NAMES,3");
                if (var2 != null) {
                  cd.field_c[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "SENTINEL_NAMES,4");
                if (var2 != null) {
                  cd.field_c[4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(65, "SENTINEL_NAMES,5");
                if (null != var2) {
                  cd.field_c[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 69, "SENTINEL_NAMES,6");
                if (var2 != null) {
                  cd.field_c[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "SENTINEL_NAMES,7");
                if (var2 != null) {
                  cd.field_c[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 67, "SENTINEL_NAMES,8");
                if (null != var2) {
                  cd.field_c[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 83, "SENTINEL_NAMES,9");
                if (var2 != null) {
                  cd.field_c[9] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 86, "SENTINEL_NAMES,10");
                if (null != var2) {
                  cd.field_c[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(74, "SENTINEL_NAMES,11");
                if (var2 != null) {
                  cd.field_c[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 117, "GAMEBEST_TIP,0");
                if (var2 != null) {
                  bj.field_l[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(84, "GAMEBEST_TIP,1");
                if (var2 != null) {
                  bj.field_l[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(121, "GAMEBEST_TIP,2");
                if (var2 != null) {
                  bj.field_l[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "GAMEBEST_TIP,3");
                if (null != var2) {
                  bj.field_l[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 103, "GAMEBEST_TIP,4");
                if (null != var2) {
                  bj.field_l[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(101, "GAMEBEST_TIP,5");
                if (var2 != null) {
                  bj.field_l[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "GAMEBEST_TIP,6");
                if (null != var2) {
                  bj.field_l[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 73, "GAMEBEST_TIP,8");
                if (null != var2) {
                  bj.field_l[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 99, "GAMEBEST_TIP,9");
                if (var2 != null) {
                  bj.field_l[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "GAMEBEST_TIP,10");
                if (var2 != null) {
                  bj.field_l[10] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(63, "GAMEBEST_TIP,11");
                if (var2 != null) {
                  bj.field_l[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "GAMEBEST_TIP,12");
                if (null != var2) {
                  bj.field_l[12] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "GAMEBEST_TIP,14");
                if (var2 != null) {
                  bj.field_l[14] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 92, "GAMEBEST_TIP,15");
                if (param0 != 0) {
                  field_d = (RgbSprite) null;
                }
                if (null != var2) {
                  bj.field_l[15] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(98, "GAMEBEST_TIP,16");
                if (var2 != null) {
                  bj.field_l[16] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "GAMEBEST_TIP,18");
                if (null != var2) {
                  bj.field_l[18] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(75, "GAMEBEST_TIP,19");
                if (var2 != null) {
                  bj.field_l[19] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "GAMEBEST_TIP,20");
                if (null != var2) {
                  bj.field_l[20] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "GAMEBEST_TIP,21");
                if (null != var2) {
                  bj.field_l[21] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(89, "GAMEBEST_TIP,22");
                if (var2 != null) {
                  bj.field_l[22] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "GAMEBEST_TIP,23");
                if (var2 != null) {
                  bj.field_l[23] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 116, "GAMEBEST_TIP,24");
                if (null != var2) {
                  bj.field_l[24] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 87, "GAMEBEST_TIP,25");
                if (var2 != null) {
                  bj.field_l[25] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "GAMEBEST_TIP,26");
                if (null != var2) {
                  bj.field_l[26] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "GAMEBEST_TIP,27");
                if (var2 != null) {
                  bj.field_l[27] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(70, "GAMEBEST_TIP,28");
                if (null != var2) {
                  bj.field_l[28] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(104, "GAMEBEST_TIP,29");
                if (null != var2) {
                  bj.field_l[29] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "GAMEBEST_TIP,30");
                if (var2 != null) {
                  bj.field_l[30] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "GAMEBEST_TIP,31");
                if (var2 != null) {
                  bj.field_l[31] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(54, "GAMEBEST_TIP,32");
                if (null != var2) {
                  bj.field_l[32] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "GAMEBEST_TIP,33");
                if (null != var2) {
                  bj.field_l[33] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "GAMEBEST_TIP,34");
                if (null != var2) {
                  bj.field_l[34] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 107, "GAMEBEST_TIP,35");
                if (null != var2) {
                  bj.field_l[35] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(61, "GAMEBEST_TIP,36");
                if (null != var2) {
                  bj.field_l[36] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(64, "GAMEBEST_TIP,37");
                if (var2 != null) {
                  bj.field_l[37] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(95, "GAMEBEST_TIP,38");
                if (null != var2) {
                  bj.field_l[38] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "GAMEBEST_TIP,39");
                if (null != var2) {
                  bj.field_l[39] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "GAMEBEST_TIP,40");
                if (var2 != null) {
                  bj.field_l[40] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 104, "GAMEBEST_TIP,42");
                if (null != var2) {
                  bj.field_l[42] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 120, "GAMEBEST_TIP,43");
                if (var2 != null) {
                  bj.field_l[43] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "GAMEBEST_TIP,44");
                if (var2 != null) {
                  bj.field_l[44] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 112, "GAMEBEST_TIP,46");
                if (var2 != null) {
                  bj.field_l[46] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(107, "GAMEBEST_TIP,47");
                if (null != var2) {
                  bj.field_l[47] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "GAMEBEST_TIP,48");
                if (null != var2) {
                  bj.field_l[48] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(97, "GAMEBEST_TIP,49");
                if (null != var2) {
                  bj.field_l[49] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "GAMEBEST_TIP,50");
                if (var2 != null) {
                  bj.field_l[50] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(74, "GAMEBEST_TIP,51");
                if (var2 != null) {
                  bj.field_l[51] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(123, "GAMEBEST_TIP,52");
                if (var2 != null) {
                  bj.field_l[52] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(70, "GAMEBEST_TIP,54");
                if (null != var2) {
                  bj.field_l[54] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "GAMEBEST_TIP,55");
                if (null != var2) {
                  bj.field_l[55] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(91, "GAMEBEST_TIP,56");
                if (null != var2) {
                  bj.field_l[56] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "GAMEBEST_TIP,57");
                if (null != var2) {
                  bj.field_l[57] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "GAMEBEST_TIP,58");
                if (null != var2) {
                  bj.field_l[58] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(72, "GAMEBEST_TIP,59");
                if (var2 != null) {
                  bj.field_l[59] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(62, "GAMEBEST_TIP,60");
                if (null != var2) {
                  bj.field_l[60] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 113, "GAMEBEST_TIP,61");
                if (var2 != null) {
                  bj.field_l[61] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 67, "GAMEBEST_TIP,62");
                if (null != var2) {
                  bj.field_l[62] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 91, "GAMEBEST_TIP,63");
                if (var2 != null) {
                  bj.field_l[63] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 55, "second_tx");
                if (null != var2) {
                  IntrusiveNode.field_d = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(58, "seconds_tx");
                if (var2 != null) {
                  tc.field_s = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 87, "numberoftimes_tx,0");
                if (null != var2) {
                  dl.field_I[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "numberoftimes_tx,1");
                if (var2 != null) {
                  dl.field_I[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "numberoftimes_tx,2");
                if (var2 != null) {
                  dl.field_I[2] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 114, "numberoftimes_tx,3");
                if (var2 != null) {
                  dl.field_I[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(93, "ALREADY_ENG_MOD_TXT");
                if (null != var2) {
                  va.field_i = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 104, "CANNOT_ENG_MOD_TXT");
                if (null != var2) {
                  ha.field_R = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(112, "FIRST_ENG_THIS_TXT");
                if (var2 != null) {
                  oc.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "FIRST_ENG_SHIELDS_TXT");
                if (null != var2) {
                  b.field_i = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "FIRST_ENG_PLASMA_TXT");
                if (var2 != null) {
                  k.field_Eb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(85, "FIRST_ENG_LASERS_TXT");
                if (null != var2) {
                  rd.field_c = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(114, "FIRST_ENG_EMP_TXT");
                if (var2 != null) {
                  DualNode.field_t = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "CANT_AFFORD_MOD_TXT");
                if (var2 != null) {
                  BattleTerrain.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 114, "ALREADY_ENG_COMP_TXT");
                if (null != var2) {
                  qi.field_e = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 114, "CANT_AFFORD_COMP_TXT");
                if (var2 != null) {
                  bj.field_a = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(118, "CHASSISLIST_BLURB");
                if (var2 != null) {
                  kc.field_u = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "COMPLIST_BLURB");
                if (var2 != null) {
                  li.field_E = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "WEAPONLIST_BLURB");
                if (null != var2) {
                  re.field_hb = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(115, "MODLIST_BLURB");
                if (null != var2) {
                  bg.field_D = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 108, "CUSTOM_ADVANCED_ONLY_TXT");
                if (null != var2) {
                  ai.field_v = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(84, "UNLOCKED_DESTROYED_CHASSIS_MSG");
                if (var2 != null) {
                  qg.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 70, "PROGRESS_UNLOCKED_CHASSIS_MSG");
                if (null != var2) {
                  c.field_r = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(53, "GETDEFAULTSET_TXT");
                if (null != var2) {
                  td.field_Vb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(114, "DEFAULTSET_TXT");
                if (var2 != null) {
                  cb.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "HEADSLOT_TXT");
                if (var2 != null) {
                  im.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "ARMSLOT_TXT");
                if (var2 != null) {
                  tc.field_r = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(92, "WINGSLOT_TXT");
                if (null != var2) {
                  ti.field_o = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(96, "NOSLOT_TXT");
                if (var2 != null) {
                  mc.field_d = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 86, "EMPTYSLOT_TXT");
                if (null != var2) {
                  bc.field_nb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "deleteafavouritetxt");
                if (var2 != null) {
                  wh.field_i = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "savefavouritetxt");
                if (null != var2) {
                  jd.field_jb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "defaultmarker");
                if (var2 != null) {
                  uh.field_h = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 127, "favouriteslottxt");
                if (null != var2) {
                  jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "favouritestxt");
                if (null != var2) {
                  cm.field_p = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "engineeredtxt");
                if (var2 != null) {
                  qj.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(95, "notengineeredtxt");
                if (null != var2) {
                  he.field_h = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 120, "complist_txt");
                if (null != var2) {
                  mc.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 126, "gunlist_txt");
                if (var2 != null) {
                  kf.field_B = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(67, "modlist_txt");
                if (null != var2) {
                  vf.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "techstandardtxt");
                if (null != var2) {
                  ej.field_C = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "techadvancedtxt");
                if (null != var2) {
                  fi.field_z = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 95, "techvaluecolon");
                if (var2 != null) {
                  bf.field_zb = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 96, "heightstring");
                if (null != var2) {
                  de.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 95, "solaritecubescolon");
                if (var2 != null) {
                  Explosion.field_E = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 51, "percentengineered");
                if (var2 != null) {
                  mm.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(111, "sentineluses");
                if (null != var2) {
                  qm.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(54, "anduses");
                if (null != var2) {
                  re.field_X = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(82, "usescomponents");
                if (var2 != null) {
                  v.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(94, "usesmodules");
                if (var2 != null) {
                  dk.field_i = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "usesmodule");
                if (var2 != null) {
                  ed.field_g = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(127, "cubesneeded");
                if (var2 != null) {
                  mm.field_f = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(73, "holdsonetimes");
                if (var2 != null) {
                  wh.field_h = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(78, "slotsntimesx");
                if (null != var2) {
                  hf.field_a = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(115, "alsontimesx");
                if (var2 != null) {
                  q.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(86, "shiftclickmsg");
                if (null != var2) {
                  dg.field_c = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 121, "engineeringstatedesc,0");
                if (null != var2) {
                  a.field_d[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 73, "engineeringstatedesc,1");
                if (null != var2) {
                  a.field_d[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 121, "engineeringstatedesc,2");
                if (null != var2) {
                  a.field_d[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(51, "engineeringstatedesc,3");
                if (null != var2) {
                  a.field_d[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(79, "firingarctxt");
                if (null != var2) {
                  tk.field_s = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "warningcolon");
                if (null != var2) {
                  jn.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "oddmechwarnings,0");
                if (null != var2) {
                  SentinelDesigner.field_b[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 125, "oddmechwarnings,1");
                if (null != var2) {
                  SentinelDesigner.field_b[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 116, "oddmechwarnings,2");
                if (var2 != null) {
                  SentinelDesigner.field_b[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 58, "oddmechwarnings,3");
                if (null != var2) {
                  SentinelDesigner.field_b[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 59, "oddmechwarnings,4");
                if (null != var2) {
                  SentinelDesigner.field_b[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(81, "oddmechwarnings,5");
                if (null != var2) {
                  SentinelDesigner.field_b[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "oddmechwarnings,6");
                if (null != var2) {
                  SentinelDesigner.field_b[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(109, "oddmechwarnings,7");
                if (null != var2) {
                  SentinelDesigner.field_b[7] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(109, "oddmechwarnings,8");
                if (var2 != null) {
                  SentinelDesigner.field_b[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(63, "oddmechwarnings,9");
                if (var2 != null) {
                  SentinelDesigner.field_b[9] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(89, "oddmechwarnings,10");
                if (var2 != null) {
                  SentinelDesigner.field_b[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 75, "oddmechwarnings,11");
                if (var2 != null) {
                  SentinelDesigner.field_b[11] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(93, "coopcomplete");
                if (null != var2) {
                  of.field_a = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 82, "coopboss");
                if (null != var2) {
                  ob.field_x = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(78, "score_headings,0");
                if (var2 != null) {
                  k.field_Ib[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(52, "score_headings,1");
                if (var2 != null) {
                  k.field_Ib[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(69, "score_headings,2");
                if (null != var2) {
                  k.field_Ib[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "score_headings,3");
                if (var2 != null) {
                  k.field_Ib[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "ratings_headings,0");
                if (null != var2) {
                  pe.field_h[0] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(71, "ratings_headings,1");
                if (null != var2) {
                  pe.field_h[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(99, "ratings_headings,2");
                if (var2 != null) {
                  pe.field_h[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(64, "ratings_headings,3");
                if (var2 != null) {
                  pe.field_h[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 80, "ratings_headings,4");
                if (null != var2) {
                  pe.field_h[4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(123, "ratings_headings,5");
                if (var2 != null) {
                  pe.field_h[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(61, "achievements_hidden_text");
                if (var2 != null) {
                  gj.field_c = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(56, "maxtxt");
                if (var2 != null) {
                  ll.field_m = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 94, "timeformat");
                if (var2 != null) {
                  ui.field_S = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "expansiononlyitem");
                if (null != var2) {
                  of.field_b = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(110, "stathints,0");
                if (var2 != null) {
                  jj.field_h[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "stathints,1");
                if (null != var2) {
                  jj.field_h[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 71, "stathints,2");
                if (var2 != null) {
                  jj.field_h[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "stathints,3");
                if (null != var2) {
                  jj.field_h[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(57, "stathints,4");
                if (var2 != null) {
                  jj.field_h[4] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(72, "stathints,5");
                if (var2 != null) {
                  jj.field_h[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 93, "stathints,6");
                if (null != var2) {
                  jj.field_h[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(90, "stathints,7");
                if (var2 != null) {
                  jj.field_h[7] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 113, "stathints,8");
                if (var2 != null) {
                  jj.field_h[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(76, "stathints,9");
                if (var2 != null) {
                  jj.field_h[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(108, "stathints,10");
                if (var2 != null) {
                  jj.field_h[10] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(51, "stathints,11");
                if (var2 != null) {
                  jj.field_h[11] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 74, "itemstathints,0");
                if (var2 != null) {
                  sl.field_j[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "itemstathints,1");
                if (null != var2) {
                  sl.field_j[1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 + 107, "itemstathints,2");
                if (null != var2) {
                  sl.field_j[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 70, "itemstathints,3");
                if (var2 != null) {
                  sl.field_j[3] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(71, "itemstathints,4");
                if (null != var2) {
                  sl.field_j[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 80, "itemstathints,5");
                if (null != var2) {
                  sl.field_j[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(105, "itemstathints,6");
                if (null != var2) {
                  sl.field_j[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(65, "itemstathints,7");
                if (null != var2) {
                  sl.field_j[7] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 80, "itemstathints,8");
                if (var2 != null) {
                  sl.field_j[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "itemstathints,9");
                if (null != var2) {
                  sl.field_j[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(59, "itemstathints,10");
                if (var2 != null) {
                  sl.field_j[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(113, "itemstathints,11");
                if (var2 != null) {
                  sl.field_j[11] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(72, "statnone");
                if (var2 != null) {
                  ej.field_E = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(53, "moduleslotnum");
                if (var2 != null) {
                  al.field_e = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 90, "defaultheadfor");
                if (var2 != null) {
                  si.field_F = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 117, "defaultarmfor");
                if (null != var2) {
                  nj.field_T = jk.a(param0 ^ 13, var2);
                }
                var2 = SentinelDesigner.a(94, "defaultwingformany,0");
                if (var2 != null) {
                  lj.field_g[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 65, "defaultwingformany,1");
                if (var2 != null) {
                  lj.field_g[1] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(94, "defaultwingformany,2");
                if (var2 != null) {
                  lj.field_g[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "defaultwingformany,3");
                if (var2 != null) {
                  lj.field_g[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(116, "defaultwingformany,4");
                if (var2 != null) {
                  lj.field_g[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(122, "ignoretxt");
                if (var2 != null) {
                  ma.field_Z = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(118, "mission_num_status");
                if (null != var2) {
                  v.field_f = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 98, "training_mission_num_status");
                if (null != var2) {
                  NodeDeque.field_h = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 111, "missionstatustxt,0");
                if (null != var2) {
                  SceneWidget.field_jb[0] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(110, "missionstatustxt,1");
                if (var2 != null) {
                  SceneWidget.field_jb[1] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 118, "missionstatustxt,2");
                if (null != var2) {
                  SceneWidget.field_jb[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(60, "missionstatustxt,3");
                if (null != var2) {
                  SceneWidget.field_jb[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "missionstatustxt,4");
                if (var2 != null) {
                  SceneWidget.field_jb[4] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(120, "missionstatustxt,5");
                if (var2 != null) {
                  SceneWidget.field_jb[5] = jk.a(bi.a(param0, 13), var2);
                }
                var2 = SentinelDesigner.a(113, "missionstatustxt,6");
                if (null != var2) {
                  SceneWidget.field_jb[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(119, "missiondesc");
                if (var2 != null) {
                  oe.field_j = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 101, "pageMofN");
                if (var2 != null) {
                  am.field_e = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(param0 + 112, "RANK_TXT,0");
                if (null != var2) {
                  qf.field_a[0] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "RANK_TXT,1");
                if (null != var2) {
                  qf.field_a[1] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(88, "RANK_TXT,2");
                if (var2 != null) {
                  qf.field_a[2] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(71, "RANK_TXT,3");
                if (null != var2) {
                  qf.field_a[3] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(123, "RANK_TXT,4");
                if (var2 != null) {
                  qf.field_a[4] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(116, "RANK_TXT,5");
                if (null != var2) {
                  qf.field_a[5] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "RANK_TXT,6");
            }
            void runChunk6() throws java.lang.RuntimeException {
                if (null != var2) {
                  qf.field_a[6] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(115, "RANK_TXT,7");
                if (var2 != null) {
                  qf.field_a[7] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(124, "RANK_TXT,8");
                if (null != var2) {
                  qf.field_a[8] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(58, "RANK_TXT,9");
                if (var2 != null) {
                  qf.field_a[9] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(param0 ^ 104, "RANK_TXT,10");
                if (var2 != null) {
                  qf.field_a[10] = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(66, "RANK_TXT,11");
                if (var2 != null) {
                  qf.field_a[11] = jk.a(param0 + 13, var2);
                }
                var2 = SentinelDesigner.a(115, "endmissiontxt");
                if (var2 != null) {
                  ec.field_f = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(102, "endtestfieldtxt");
                if (null != var2) {
                  lb.field_fc = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(99, "referencemanual");
                if (var2 != null) {
                  DualNode.field_s = jk.a(13, var2);
                }
                var2 = SentinelDesigner.a(87, "coophighscorestxt");
                if (null != var2) {
                  pa.field_j = jk.a(13, var2);
                }
                sj.field_y = null;
            }
            void run() {
                var3 = SteelSentinels.obfuscationControl;
                try {
                  runChunk0();
                  if (finished) return;
                  runChunk1();
                  if (finished) return;
                  runChunk2();
                  if (finished) return;
                  runChunk3();
                  if (finished) return;
                  runChunk4();
                  if (finished) return;
                  runChunk5();
                  if (finished) return;
                  runChunk6();
                  if (finished) return;
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref = decompiledCaughtException;
                  stackIn_4687_0 = (RuntimeException) (var2_ref);
                  stackIn_4687_1 = new StringBuilder().append("rc.A(").append(param0).append(',');
                  if (param1 == null) {
                    stackIn_4688_2 = "null";
                  } else {
                    stackIn_4688_2 = "{...}";
                  }
                  throw ci.a((Throwable) ((Object) stackIn_4687_0), ((StringBuilder) (Object) stackIn_4687_1).append(stackIn_4688_2).append(')').toString());
                }
                if (var3 != 0) {
                  stackIn_4696_0 = (!GameApplet.field_i);
                  GameApplet.field_i = stackIn_4696_0;
                }
            }
        }
        $CfrPartitionedBody decompiledBody = new $CfrPartitionedBody(param0, param1);
        decompiledBody.run();
    }

    final static boolean a(int param0, boolean param1) {
        try {
          long dupTemp$1 = 0L;
          IOException iOException = null;
          CipherPacketBuffer var2 = null;
          RuntimeException var2_ref = null;
          int stackIn_17_0 = 0;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          try {
            if (kc.field_o == null) {
              kc.field_o = ArticulatedPart.field_A.a(e.field_b, ll.field_l, 376255344);
            }
            if (kc.field_o.field_a == 0) {
              return false;
            }
            dupTemp$1 = mm.a(40);
            vf.field_d = dupTemp$1;
            oe.field_b = dupTemp$1;
            if (param0 < 115) {
              return false;
            }
            if (kc.field_o.field_a == 1) {
              try {
                rb.field_h = new sg((java.net.Socket) (kc.field_o.field_c), ArticulatedPart.field_A);
                mm.field_g.position = 0;
                var2 = rf.field_d;
                var2.position = 0;
                stackIn_17_0 = (!param1) ? -1 : -2;
                di.field_d = stackIn_17_0;
                ma.field_W = stackIn_17_0;
                aj.field_u = stackIn_17_0;
                rn.field_v = lj.field_d;
                s.a(mm.field_g, 12, kg.field_Wb, bk.field_Z, vi.field_T);
                gj.a(0, -1);
                decompiledRegionSelector0 = 0;
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                rn.field_v = gl.field_j;
                if (SteelSentinels.obfuscationControl == 0) {
                  decompiledRegionSelector0 = 0;
                } else {
                  decompiledRegionSelector0 = 1;
                }
              }
              if (decompiledRegionSelector0 != 0) {
                rn.field_v = gl.field_j;
              }
            } else {
              rn.field_v = gl.field_j;
            }
            kc.field_o = null;
            return true;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ci.a((Throwable) ((Object) var2_ref), "rc.E(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean a(boolean param0, int param1, boolean param2, byte[] param3, int param4) {
        try {
          boolean stackIn_26_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_80_0 = 0;
          RuntimeException stackIn_88_0 = null;
          StringBuilder stackIn_88_1 = null;
          String stackIn_89_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          boolean stackOut_25_0;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = SteelSentinels.obfuscationControl;
          try {
            var6 = this.field_h;
            synchronized (var6) {
              try {
                boolean decompiledFrameRemainder1 = true;
                if (!param2) {
                  var7_int = (int)((519L + this.field_h.a((byte) 123)) / 520L);
                  decompiledFrameRemainder1 = (var7_int == 0);
                  if (decompiledFrameRemainder1) {
                    var7_int = 1;
                  }
                }
                if ((decompiledFrameRemainder1) &&
                  (param2 ||
                  var16 != 0)) {
                  if ((long)(param4 * 6 + 6) > this.field_c.a((byte) 92)) {
                    return false;
                  }
                  this.field_c.a(-99, (long)(param4 * 6));
                  this.field_c.a((byte) 115, Projectile.field_db, 6, 0);
                  var7_int = (255 & Projectile.field_db[5]) + ((Projectile.field_db[4] << 8 & 65280) + ((255 & Projectile.field_db[3]) << 16));
                  if (var7_int <= 0 ||
                    !((this.field_h.a((byte) -32) / 520L) >= (long)var7_int)) {
                    return false;
                  }
                }
                Projectile.field_db[1] = (byte)(param1 >> 8);
                Projectile.field_db[5] = (byte)var7_int;
                Projectile.field_db[4] = (byte)(var7_int >> 8);
                if (!param0) {
                  this.b(-30, true);
                }
                Projectile.field_db[0] = (byte)(param1 >> 16);
                Projectile.field_db[3] = (byte)(var7_int >> 16);
                Projectile.field_db[2] = (byte)param1;
                this.field_c.a(-128, (long)(6 * param4));
                this.field_c.a(0, 6, 38, Projectile.field_db);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  boolean decompiledFrameRemainder2 = true;
                  if (param1 > var8) {
                    var10 = 0;
                    stackOut_25_0 = param2;
                    stackIn_80_0 = stackOut_25_0 ? 1 : 0;
                    stackIn_26_0 = stackOut_25_0;
                    if (var16 != 0) {
                      break scanLoop1;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_26_0) {
                      this.field_h.a(-111, (long)(520 * var7_int));
                      if (param4 <= 65535) {
                        try {
                          this.field_h.a((byte) 115, Projectile.field_db, 8, 0);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          if (var16 == 0) {
                            decompiledRegionSelector1 = 1;
                          } else {
                            decompiledRegionSelector1 = 0;
                          }
                        }
                        decompiledFrameRemainder2 = (decompiledRegionSelector1 == 0);
                        if (decompiledFrameRemainder2) {
                          var11 = ((255 & Projectile.field_db[0]) << 8) + (255 & Projectile.field_db[1]);
                          var13 = 255 & Projectile.field_db[7];
                          var12 = ((255 & Projectile.field_db[2]) << 8) + (Projectile.field_db[3] & 255);
                          var10 = ((255 & Projectile.field_db[5]) << 8) + ((16711680 & Projectile.field_db[4] << 16) + (255 & Projectile.field_db[6]));
                        }
                      }
                      if (decompiledFrameRemainder2) {
                        if (param4 > 65535 ||
                          var16 != 0) {
                          try {
                            this.field_h.a((byte) 115, Projectile.field_db, 10, 0);
                            decompiledRegionSelector0 = 0;
                          } catch (java.io.EOFException decompiledCaughtParameter1) {
                            decompiledCaughtException = decompiledCaughtParameter1;
                            var14 = (EOFException) (Object) decompiledCaughtException;
                            if (var16 == 0) {
                              decompiledRegionSelector0 = 1;
                            } else {
                              decompiledRegionSelector0 = 0;
                            }
                          }
                          decompiledFrameRemainder2 = (decompiledRegionSelector0 == 0);
                          if (decompiledFrameRemainder2) {
                            var11 = (65280 & Projectile.field_db[2] << 8) + ((-16777216 & Projectile.field_db[0] << 24) + ((255 & Projectile.field_db[1]) << 16)) + (255 & Projectile.field_db[3]);
                            var12 = (65280 & Projectile.field_db[4] << 8) + (Projectile.field_db[5] & 255);
                            var13 = 255 & Projectile.field_db[9];
                            var10 = (Projectile.field_db[8] & 255) + ((Projectile.field_db[7] & 255) << 8) + ((Projectile.field_db[6] & 255) << 16);
                          }
                        }
                        if (decompiledFrameRemainder2) {
                          if ((~param4 == ~var11 &&
                            ~var9 == ~var12 &&
                            ~this.field_e == ~var13) &&
                            (decompiledFrameRemainder0 = (!(var10 >= 0) ||
                            !((this.field_h.a((byte) 113) / 520L) >= (long)var10)))) {
                            return false;
                          }
                          if (decompiledFrameRemainder0) {
                            return false;
                          }
                        }
                      }
                    }
                    if (decompiledFrameRemainder2) {
                      if (0 == var10) {
                        var10 = (int)((519L + this.field_h.a((byte) 97)) / 520L);
                        param2 = false;
                        if (var10 == 0) {
                          var10++;
                        }
                        if (var10 == var7_int) {
                          var10++;
                        }
                      }
                      if (param1 - var8 <= 512) {
                        var10 = 0;
                      }
                      if (65535 >= param4) {
                        Projectile.field_db[0] = (byte)(param4 >> 8);
                        Projectile.field_db[2] = (byte)(var9 >> 8);
                        Projectile.field_db[6] = (byte)var10;
                        Projectile.field_db[7] = (byte)this.field_e;
                        Projectile.field_db[4] = (byte)(var10 >> 16);
                        Projectile.field_db[1] = (byte)param4;
                        Projectile.field_db[5] = (byte)(var10 >> 8);
                        Projectile.field_db[3] = (byte)var9;
                        this.field_h.a(-120, (long)(520 * var7_int));
                        this.field_h.a(0, 8, 48, Projectile.field_db);
                        var11 = -var8 + param1;
                        if (512 < var11) {
                          var11 = 512;
                        }
                        this.field_h.a(var8, var11, 112, param3);
                        var8 = var8 + var11;
                      }
                      if (65535 < param4 ||
                        var16 != 0) {
                        Projectile.field_db[0] = (byte)(param4 >> 24);
                        Projectile.field_db[4] = (byte)(var9 >> 8);
                        Projectile.field_db[2] = (byte)(param4 >> 8);
                        Projectile.field_db[9] = (byte)this.field_e;
                        Projectile.field_db[7] = (byte)(var10 >> 8);
                        Projectile.field_db[3] = (byte)param4;
                        Projectile.field_db[8] = (byte)var10;
                        Projectile.field_db[6] = (byte)(var10 >> 16);
                        Projectile.field_db[5] = (byte)var9;
                        Projectile.field_db[1] = (byte)(param4 >> 16);
                        this.field_h.a(-118, (long)(var7_int * 520));
                        this.field_h.a(0, 10, 119, Projectile.field_db);
                        var11 = param1 - var8;
                        if (510 < var11) {
                          var11 = 510;
                        }
                        this.field_h.a(var8, var11, 110, param3);
                        var8 = var8 + var11;
                      }
                      var7_int = var10;
                      var9++;
                      if (var16 == 0) {
                        continue;
                      }
                    }
                  }
                  stackIn_79_0 = 1;
                  stackIn_80_0 = stackIn_79_0;
                  break;
                }
                return stackIn_80_0 != 0;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_88_0 = var6_ref;
            stackIn_88_1 = new StringBuilder().append("rc.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_89_2 = "null";
            } else {
              stackIn_89_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_88_0), ((StringBuilder) (Object) stackIn_88_1).append(stackIn_89_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        String stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          stackIn_1_0 = "" + this.field_e;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "rc.toString()");
        }
    }

    rc(int param0, rj param1, rj param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_a = 65000;
        this.field_c = null;
        this.field_h = null;
        try {
          this.field_c = param2;
          this.field_a = param3;
          this.field_h = param1;
          this.field_e = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("rc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        int stackIn_188_0 = 0;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_193_2 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_197_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (param3 >= -82) {
            rc.a(true);
          }
          var6_int = -param2 + param0;
          var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6_int <= var7))) {
            var8 = param1.charAt(param2 + var7);
            stackIn_188_0 = 0;
            if (var9 == 0) {
              regionExit1: {
                if ((stackIn_188_0 >= var8 ||
                  var8 >= 128) &&
                  (var8 < 160 ||
                  var8 > 255)) {
                  switch (var8) {
                    case 8218:
                      param4[param5 + var7] = (byte) -126;
                      break regionExit1;
                    case 402:
                      param4[var7 + param5] = (byte) -125;
                      break regionExit1;
                    case 8230:
                      param4[var7 + param5] = (byte) -123;
                      break regionExit1;
                    case 8224:
                      param4[param5 + var7] = (byte) -122;
                      break regionExit1;
                    case 8225:
                      param4[param5 + var7] = (byte) -121;
                      break regionExit1;
                    case 710:
                      param4[var7 + param5] = (byte) -120;
                      break regionExit1;
                    case 8240:
                      param4[var7 + param5] = (byte) -119;
                      break regionExit1;
                    case 352:
                      param4[param5 + var7] = (byte) -118;
                      break regionExit1;
                    default:
                      switch (var8) {
                        case 8220:
                          param4[var7 + param5] = (byte) -109;
                          break regionExit1;
                        case 8221:
                          param4[var7 + param5] = (byte) -108;
                          break regionExit1;
                        case 8226:
                          param4[var7 + param5] = (byte) -107;
                          break regionExit1;
                        case 8212:
                          param4[param5 + var7] = (byte) -105;
                          break regionExit1;
                        case 732:
                          param4[param5 + var7] = (byte) -104;
                          break regionExit1;
                        case 8482:
                          param4[param5 + var7] = (byte) -103;
                          break regionExit1;
                        case 353:
                          param4[var7 + param5] = (byte) -102;
                          break regionExit1;
                        case 8250:
                          param4[var7 + param5] = (byte) -101;
                          break regionExit1;
                        default:
                          param4[var7 + param5] = (byte) 63;
                          break regionExit1;
                        case 376:
                          param4[param5 + var7] = (byte) -97;
                          break regionExit1;
                        case 382:
                          param4[param5 + var7] = (byte) -98;
                          break regionExit1;
                        case 339:
                          param4[param5 + var7] = (byte) -100;
                          break regionExit1;
                        case 8211:
                          param4[param5 + var7] = (byte) -106;
                          break regionExit1;
                        case 8217:
                          param4[param5 + var7] = (byte) -110;
                          break regionExit1;
                        case 8216:
                          param4[var7 + param5] = (byte) -111;
                          break regionExit1;
                        case 381:
                          param4[var7 + param5] = (byte) -114;
                          break regionExit1;
                        case 338:
                          param4[var7 + param5] = (byte) -116;
                          break regionExit1;
                      }
                    case 8249:
                      param4[param5 + var7] = (byte) -117;
                      break regionExit1;
                    case 8222:
                      param4[param5 + var7] = (byte) -124;
                      break regionExit1;
                    case 8364:
                      param4[param5 + var7] = (byte) -128;
                      break regionExit1;
                  }
                }
                param4[param5 + var7] = (byte)var8;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_188_0 = var6_int;
          }
          return stackIn_188_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_192_0 = var6;
          stackIn_192_1 = new StringBuilder().append("rc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_193_2 = "null";
          } else {
            stackIn_193_2 = "{...}";
          }
          stackIn_196_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_193_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_197_2 = "null";
          } else {
            stackIn_197_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_192_0), ((StringBuilder) (Object) stackIn_196_1).append(stackIn_197_2).append(',').append(param5).append(')').toString());
        }
    }

    final byte[] b(int param0, boolean param1) {
        try {
          int incrementValue$0 = 0;
          byte[] stackIn_4_0 = null;
          Object stackIn_9_0 = null;
          Object stackIn_18_0 = null;
          Object stackIn_25_0 = null;
          Object stackIn_33_0 = null;
          Object stackIn_52_0 = null;
          Object stackIn_59_0 = null;
          byte[] stackIn_67_0 = null;
          Object stackIn_70_0 = null;
          Throwable decompiledCaughtException = null;
          Object var3 = null;
          RuntimeException var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          int var16 = 0;
          int var18 = 0;
          var18 = SteelSentinels.obfuscationControl;
          try {
            var3 = this.field_h;
            synchronized (var3) {
              if (param1) {
                stackIn_4_0 = (byte[]) null;
                return stackIn_4_0;
              }
              try {
                if (this.field_c.a((byte) -113) < (long)(6 * param0 + 6)) {
                  stackIn_9_0 = null;
                  return (byte[]) (stackIn_9_0);
                }
                this.field_c.a(-96, (long)(param0 * 6));
                this.field_c.a((byte) 115, Projectile.field_db, 6, 0);
                var4_int = (Projectile.field_db[0] << 16 & 16711680) + ((Projectile.field_db[1] << 8 & 65280) + (Projectile.field_db[2] & 255));
                var5 = (Projectile.field_db[5] & 255) + ((Projectile.field_db[4] << 8 & 65280) + (Projectile.field_db[3] << 16 & 16711680));
                if (var4_int >= 0 &&
                  this.field_a >= var4_int) {
                  if (0 < var5 &&
                    (long)var5 <= this.field_h.a((byte) -99) / 520L) {
                    var6 = new byte[var4_int];
                    var7 = 0;
                    var8 = 0;
                    scanLoop1: while (true) {
                      if (var7 < var4_int) {
                        if (var5 == 0) {
                          stackIn_33_0 = null;
                          return (byte[]) (stackIn_33_0);
                        }
                        this.field_h.a(-118, (long)(520 * var5));
                        var9 = var4_int - var7;
                        if (65535 >= param0) {
                          var14 = 8;
                          if (var9 > 512) {
                            var9 = 512;
                          }
                          this.field_h.a((byte) 115, Projectile.field_db, var14 + var9, 0);
                          var12 = (65280 & Projectile.field_db[5] << 8) + ((Projectile.field_db[4] & 255) << 16) + (Projectile.field_db[6] & 255);
                          var13 = 255 & Projectile.field_db[7];
                          var11 = (Projectile.field_db[2] << 8 & 65280) + (Projectile.field_db[3] & 255);
                          var10 = (Projectile.field_db[1] & 255) + (65280 & Projectile.field_db[0] << 8);
                        }
                        if (65535 < param0 ||
                          var18 != 0) {
                          var14 = 10;
                          if (var9 > 510) {
                            var9 = 510;
                          }
                          this.field_h.a((byte) 115, Projectile.field_db, var9 + var14, 0);
                          var13 = Projectile.field_db[9] & 255;
                          var10 = (Projectile.field_db[2] << 8 & 65280) + ((Projectile.field_db[0] & 255) << 24) - (-(Projectile.field_db[1] << 16 & 16711680) - (Projectile.field_db[3] & 255));
                          var11 = (255 & Projectile.field_db[5]) + ((255 & Projectile.field_db[4]) << 8);
                          var12 = (65280 & Projectile.field_db[7] << 8) + (Projectile.field_db[6] << 16 & 16711680) + (Projectile.field_db[8] & 255);
                        }
                        if (~param0 == ~var10 &&
                          ~var8 == ~var11 &&
                          ~var13 == ~this.field_e) {
                          if (var12 >= 0 &&
                            (long)var12 <= this.field_h.a((byte) 98) / 520L) {
                            var15 = var9 + var14;
                            var5 = var12;
                            var8++;
                            var16 = var14;
                            while (var15 > var16) {
                              incrementValue$0 = var7;
                              var7++;
                              var6[incrementValue$0] = Projectile.field_db[var16];
                              var16++;
                              if (var18 != 0) {
                                continue scanLoop1;
                              }
                              if (var18 == 0) {
                                continue;
                              }
                              break;
                            }
                            if (var18 == 0) {
                              continue;
                            }
                            break scanLoop1;
                          }
                          stackIn_59_0 = null;
                          return (byte[]) (stackIn_59_0);
                        }
                        stackIn_52_0 = null;
                        return (byte[]) (stackIn_52_0);
                      }
                      break;
                    }
                    stackIn_67_0 = var6;
                    return stackIn_67_0;
                  }
                  stackIn_25_0 = null;
                  return (byte[]) (stackIn_25_0);
                }
                stackIn_18_0 = null;
                return (byte[]) (stackIn_18_0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (IOException) (Object) decompiledCaughtException;
                stackIn_70_0 = null;
                return (byte[]) (stackIn_70_0);
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw ci.a((Throwable) ((Object) var3_ref), "rc.B(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "More suggestions";
        field_g = -1;
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_o = new int[][]{null, new int[]{1, 2, 4}, null};
        field_l = 0;
        field_b = null;
    }
}
