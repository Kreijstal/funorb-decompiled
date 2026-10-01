/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SpriteState extends DualLinkNode {
    int field_s;
    int width;
    int height;
    int trimY;
    int field_o;
    static long field_n;
    static ck field_t;
    int trimX;
    static String field_q;

    final static void a(boolean param0, rh param1) {
        RuntimeException stackIn_310_0 = null;
        StringBuilder stackIn_310_1 = null;
        RuntimeException stackIn_311_0 = null;
        StringBuilder stackIn_311_1 = null;
        String stackIn_311_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          pf.field_O = param1;
          var2 = ih.a(122, "achievement_names,0");
          if (null != var2) {
            pg.field_a[0] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_names,1");
          if (var2 != null) {
            pg.field_a[1] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_names,2");
          if (var2 != null) {
            pg.field_a[2] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_names,3");
          if (null != var2) {
            pg.field_a[3] = ag.a(1, var2);
          }
          var2 = ih.a(121, "achievement_names,4");
          if (null != var2) {
            pg.field_a[4] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_names,5");
          if (var2 != null) {
            pg.field_a[5] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_names,6");
          if (var2 != null) {
            pg.field_a[6] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_names,7");
          if (null != var2) {
            pg.field_a[7] = ag.a(1, var2);
          }
          var2 = ih.a(127, "achievement_names,8");
          if (null != var2) {
            pg.field_a[8] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_names,9");
          if (var2 != null) {
            pg.field_a[9] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_names,10");
          if (null != var2) {
            pg.field_a[10] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_names,11");
          if (null != var2) {
            pg.field_a[11] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_names,12");
          if (var2 != null) {
            pg.field_a[12] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_names,13");
          if (null != var2) {
            pg.field_a[13] = ag.a(1, var2);
          }
          var2 = ih.a(120, "achievement_names,14");
          if (var2 != null) {
            pg.field_a[14] = ag.a(1, var2);
          }
          var2 = ih.a(123, "achievement_names,15");
          if (null != var2) {
            pg.field_a[15] = ag.a(1, var2);
          }
          var2 = ih.a(121, "achievement_names,16");
          if (var2 != null) {
            pg.field_a[16] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_criteria,0");
          if (null != var2) {
            ri.field_b[0] = ag.a(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,1");
          if (null != var2) {
            ri.field_b[1] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,2");
          if (null != var2) {
            ri.field_b[2] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,3");
          if (var2 != null) {
            ri.field_b[3] = ag.a(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,4");
          if (null != var2) {
            ri.field_b[4] = ag.a(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,5");
          if (null != var2) {
            ri.field_b[5] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,6");
          if (var2 != null) {
            ri.field_b[6] = ag.a(1, var2);
          }
          var2 = ih.a(121, "achievement_criteria,7");
          if (var2 != null) {
            ri.field_b[7] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,8");
          if (null != var2) {
            ri.field_b[8] = ag.a(1, var2);
          }
          var2 = ih.a(125, "achievement_criteria,9");
          if (null != var2) {
            ri.field_b[9] = ag.a(1, var2);
          }
          var2 = ih.a(122, "achievement_criteria,10");
          if (null != var2) {
            ri.field_b[10] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,11");
          if (var2 != null) {
            ri.field_b[11] = ag.a(1, var2);
          }
          var2 = ih.a(126, "achievement_criteria,12");
          if (var2 != null) {
            ri.field_b[12] = ag.a(1, var2);
          }
          var2 = ih.a(127, "achievement_criteria,13");
          if (null != var2) {
            ri.field_b[13] = ag.a(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,14");
          if (null != var2) {
            ri.field_b[14] = ag.a(1, var2);
          }
          var2 = ih.a(127, "achievement_criteria,15");
          if (null != var2) {
            ri.field_b[15] = ag.a(1, var2);
          }
          var2 = ih.a(120, "achievement_criteria,16");
          if (null != var2) {
            ri.field_b[16] = ag.a(1, var2);
          }
          var2 = ih.a(127, "starting");
          if (null != var2) {
            uj.field_a = ag.a(1, var2);
          }
          var2 = ih.a(120, "gameName");
          if (var2 != null) {
            od.field_b = ag.a(1, var2);
          }
          var2 = ih.a(125, "caption1");
          if (var2 != null) {
            ag.a(1, var2);
          }
          var2 = ih.a(124, "caption2");
          if (null != var2) {
            ag.a(1, var2);
          }
          var2 = ih.a(123, "caption3");
          if (var2 != null) {
            ag.a(1, var2);
          }
          var2 = ih.a(125, "caption4");
          if (null != var2) {
            ag.a(1, var2);
          }
          var2 = ih.a(124, "caption5");
          if (null != var2) {
            ag.a(1, var2);
          }
          var2 = ih.a(126, "youreGreat");
          if (null != var2) {
            ld.field_a = ag.a(1, var2);
          }
          var2 = ih.a(120, "bubbleBonus");
          if (var2 != null) {
            sg.field_f = ag.a(1, var2);
          }
          var2 = ih.a(126, "endOfFreeGame");
          if (var2 != null) {
            ag.a(1, var2);
          }
          var2 = ih.a(126, "itsTheBubbleBonus");
          if (var2 != null) {
            kd.field_d = ag.a(1, var2);
          }
          var2 = ih.a(120, "countdown");
          if (null != var2) {
            w.field_e = ag.a(1, var2);
          }
          var2 = ih.a(124, "levelsLastGeoblox");
          if (null != var2) {
            tj.field_a = ag.a(1, var2);
          }
          var2 = ih.a(120, "clearBonus");
          if (null != var2) {
            wl.field_b = ag.a(1, var2);
          }
          var2 = ih.a(121, "cheat");
          if (!param0) {
            field_t = (ck) null;
          }
          if (var2 != null) {
            ag.a(1, var2);
          }
          var2 = ih.a(125, "bonus");
          if (var2 != null) {
            ic.field_a = ag.a(1, var2);
          }
          var2 = ih.a(123, "fps");
          if (null != var2) {
            sh.field_z = ag.a(1, var2);
          }
          var2 = ih.a(127, "level");
          if (var2 != null) {
            qg.field_e = ag.a(1, var2);
          }
          var2 = ih.a(124, "score");
          if (var2 != null) {
            pa.field_a = ag.a(1, var2);
          }
          var2 = ih.a(121, "waitingForPumpkin");
          if (var2 != null) {
            s.field_F = ag.a(1, var2);
          }
          var2 = ih.a(121, "loadingPumpkin");
          if (var2 != null) {
            uj.field_c = ag.a(1, var2);
          }
          var2 = ih.a(125, "skipText");
          if (var2 != null) {
            v.field_n = ag.a(1, var2);
          }
          var2 = ih.a(126, "tutorial1");
          if (null != var2) {
            vh.tutorialRotationMessage = ag.a(1, var2);
          }
          var2 = ih.a(127, "tutorial2");
          if (var2 != null) {
            oi.tutorialColourMatchMessage = ag.a(1, var2);
          }
          var2 = ih.a(121, "tutorial3");
          if (null != var2) {
            vd.tutorialShapeMatchMessage = ag.a(1, var2);
          }
          var2 = ih.a(122, "tutorial4");
          if (var2 != null) {
            li.tutorialCompleteMessage = ag.a(1, var2);
          }
          var2 = ih.a(120, "tutorial5");
          if (null != var2) {
            qh.tutorialFailedMessage = ag.a(1, var2);
          }
          var2 = ih.a(123, "cont");
          if (null != var2) {
            mi.field_y = ag.a(1, var2);
          }
          var2 = ih.a(124, "restartTutorial");
          if (var2 != null) {
            cf.field_j = ag.a(1, var2);
          }
          var2 = ih.a(125, "discardResults");
          if (var2 != null) {
            ne.field_c = ag.a(1, var2);
          }
          var2 = ih.a(124, "replayTutorial");
          if (null != var2) {
            em.field_a = ag.a(1, var2);
          }
          var2 = ih.a(122, "subscribe");
          if (null != var2) {
            ag.a(1, var2);
          }
          var2 = ih.a(124, "createAnAccount");
          if (null != var2) {
            ag.a(1, var2);
          }
          var2 = ih.a(122, "fetchingHS");
          if (null != var2) {
            eb.field_f = ag.a(1, var2);
          }
          var2 = ih.a(126, "instructionTitles,0");
          if (var2 != null) {
            a.field_a[0] = ag.a(1, var2);
          }
          var2 = ih.a(127, "instructionTitles,1");
          if (var2 != null) {
            a.field_a[1] = ag.a(1, var2);
          }
          var2 = ih.a(121, "instructionTitles,2");
          if (null != var2) {
            a.field_a[2] = ag.a(1, var2);
          }
          var2 = ih.a(125, "instructionTitles,3");
          if (null != var2) {
            a.field_a[3] = ag.a(1, var2);
          }
          var2 = ih.a(123, "instructionTitles,4");
          if (var2 != null) {
            a.field_a[4] = ag.a(1, var2);
          }
          var2 = ih.a(120, "instructionTitles,5");
          if (null != var2) {
            a.field_a[5] = ag.a(1, var2);
          }
          var2 = ih.a(124, "instructionText,0");
          if (null != var2) {
            ec.field_e[0] = ag.a(1, var2);
          }
          var2 = ih.a(126, "instructionText,1");
          if (var2 != null) {
            ec.field_e[1] = ag.a(1, var2);
          }
          var2 = ih.a(120, "instructionText,2");
          if (var2 != null) {
            ec.field_e[2] = ag.a(1, var2);
          }
          var2 = ih.a(121, "instructionText,3");
          if (var2 != null) {
            ec.field_e[3] = ag.a(1, var2);
          }
          var2 = ih.a(123, "instructionText,4");
          if (null != var2) {
            ec.field_e[4] = ag.a(1, var2);
          }
          var2 = ih.a(126, "pleaseLogin");
          if (var2 != null) {
            Geoblox.loginMessage = ag.a(1, var2);
          }
          var2 = ih.a(125, "youAreNotLoggedIn");
          if (null != var2) {
            r.field_sb = ag.a(1, var2);
          }
          var2 = ih.a(120, "alternatively");
          if (var2 != null) {
            bd.field_b = ag.a(1, var2);
          }
          var2 = ih.a(125, "login");
          if (var2 != null) {
            gj.field_t = ag.a(1, var2);
          }
          var2 = ih.a(122, "notAcheived");
          if (null != var2) {
            ib.field_d = ag.a(1, var2);
          }
          var2 = ih.a(122, "keycode_reverseControls");
          if (null != var2) {
            jg.field_g = var2[0] & 255;
          }
          pf.field_O = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_310_0 = (RuntimeException) (var2_ref);

          stackIn_310_1 = new StringBuilder().append("wh.JA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_311_0 = (RuntimeException) ((Object) stackIn_310_0);
            stackIn_311_1 = (StringBuilder) ((Object) stackIn_310_1);
            stackIn_311_2 = "null";
          } else {
            stackIn_311_0 = (RuntimeException) ((Object) stackIn_310_0);
            stackIn_311_1 = (StringBuilder) ((Object) stackIn_310_1);
            stackIn_311_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_311_0), ((StringBuilder) (Object) stackIn_311_1).append(stackIn_311_2).append(')').toString());
        }
        if (ch.field_h) {
          var3++;
          Geoblox.field_C = var3;
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        ge var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Geoblox.field_C;
        try {
          L1: {
            L2: {
              if ((param1 ^ -1) < -1) {
                var4 = new byte[param0];
                var5_int = 0;
                L3: while ((param0 ^ -1) < (var5_int ^ -1)) {
                  var4[var5_int] = param2[param1 + var5_int];
                  var5_int++;
                  if (var7 != 0) {
                    break L1;
                  } else {
                    if (var7 == 0) {
                      continue L3;
                    }
                  }
                  break;
                }
                if (var7 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var4 = param2;
          }
          var5 = new ge();
          var5.a(52);
          var5.a(var4, (long)(param3 * param0), 0);
          var6 = new byte[64];
          var5.a(var6, 0, true);
          stackIn_11_0 = (byte[]) (var6);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var4_ref);

          stackIn_15_1 = new StringBuilder().append("wh.MA(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        RuntimeException stackIn_113_0 = null;
        StringBuilder stackIn_113_1 = null;
        RuntimeException stackIn_114_0 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_114_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var17_int = 0;
        RuntimeException var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        var42 = Geoblox.field_C;
        try {
          L0: {
            if ((param4 ^ -1) <= -1) {
              if ((mh.field_h ^ -1) < (param8 ^ -1)) {
                if (-1 < (param2 ^ -1)) {
                  if (-1 < (param9 ^ -1)) {
                    if (param13 < 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
                if ((mh.field_c ^ -1) >= (param2 ^ -1)) {
                  if ((mh.field_c ^ -1) >= (param9 ^ -1)) {
                    if (param13 >= mh.field_c) {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (param16 == -1275583984) {
                  L4: {
                    var34 = -param8 + param4;
                    if (param8 == param15) {
                      L6: {
                        if ((param4 ^ -1) == (param8 ^ -1)) {
                          var29 = param14;
                          var17_int = param2 << 358182032;
                          var31 = 0;
                          var30 = param7;
                          var19 = 0;
                          var21 = param1;
                          var24 = 0;
                          var32 = 0;
                          var20 = 0;
                          var26 = param3;
                          var23 = 0;
                          var22 = param10;
                          var27 = 0;
                          var28 = 0;
                          var18 = param9 << 1795594064;
                          var25 = param12;
                          if (var42 == 0) {
                            break L6;
                          }
                        }
                        var35 = -param15 + param4;
                        if (param9 <= param2) {
                          var27 = (param0 - param3 << -1074531760) / var35;
                          var29 = param7 << -1947888496;
                          var20 = (param13 - param2 << -364475504) / var34;
                          var24 = (param6 - param1 << 1382202064) / var34;
                          var17_int = param9 << -608899408;
                          var23 = (-param10 + param6 << 1069954736) / var35;
                          var18 = param2 << 910288432;
                          var31 = (-param7 + param5 << 1801290704) / var35;
                          var32 = (-param14 + param5 << 2044116112) / var34;
                          var25 = param3 << 1939952240;
                          var30 = param14 << 484143472;
                          var28 = (-param12 + param0 << -828023600) / var34;
                          var19 = (-param9 + param13 << -614106128) / var35;
                          var21 = param10 << 753361392;
                          var22 = param1 << 1855667952;
                          var26 = param12 << -1097332720;
                          if (var42 == 0) {
                            break L6;
                          }
                        }
                        var28 = (param0 + -param3 << -1838617200) / var35;
                        var23 = (param6 + -param1 << -469259472) / var34;
                        var19 = (param13 - param2 << 919315408) / var34;
                        var25 = param12 << -1932867984;
                        var22 = param10 << 1517688272;
                        var32 = (param5 - param7 << 2139072240) / var35;
                        var26 = param3 << -288466704;
                        var17_int = param2 << -1488668400;
                        var24 = (-param10 + param6 << -343657936) / var35;
                        var21 = param1 << 1498191728;
                        var30 = param7 << 1041192944;
                        var18 = param9 << 170305712;
                        var20 = (param13 - param9 << -2094236560) / var35;
                        var31 = (param5 - param14 << -512329264) / var34;
                        var27 = (param0 + -param12 << 2129025008) / var34;
                        var29 = param14 << 192682064;
                      }
                      var33 = 0;
                      if (0 <= param8) {
                        break L4;
                      } else {
                        param8 = Math.min(-param8, param15 - param8);
                        var22 = var22 + var24 * param8;
                        var30 = var30 + param8 * var32;
                        var18 = var18 + var20 * param8;
                        var17_int = var17_int + var19 * param8;
                        var25 = var25 + var27 * param8;
                        var21 = var21 + var23 * param8;
                        var29 = var29 + var31 * param8;
                        var26 = var26 + param8 * var28;
                        param8 = 0;
                        if (var42 == 0) {
                          break L4;
                        }
                      }
                    }
                    L9: {
                      var18 = param2 << 778489424;
                      var17_int = param2 << 778489424;
                      var30 = param14 << 2118783760;
                      var29 = param14 << 2118783760;
                      var26 = param12 << -1801560272;
                      var25 = param12 << -1801560272;
                      var22 = param1 << 1903384240;
                      var21 = param1 << 1903384240;
                      var35 = param15 + -param8;
                      var20 = (-param2 + param13 << 440131920) / var34;
                      var19 = (param9 + -param2 << 1272988272) / var35;
                      if (var20 <= var19) {
                        var23 = (-param1 + param6 << -2000993456) / var34;
                        var27 = (-param12 + param0 << 1142761648) / var34;
                        var31 = (-param14 + param5 << -1987100592) / var34;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var28 = (-param12 + param3 << 432415280) / var35;
                        var33 = 1;
                        var32 = (-param14 + param7 << 214314576) / var35;
                        var24 = (-param1 + param10 << -1879453296) / var35;
                        if (var42 == 0) {
                          break L9;
                        }
                      }
                      var32 = (-param14 + param5 << -2120283184) / var34;
                      var28 = (param0 - param12 << 718199120) / var34;
                      var23 = (param10 - param1 << -868271056) / var35;
                      var24 = (-param1 + param6 << -2107665712) / var34;
                      var31 = (param7 + -param14 << -1485610160) / var35;
                      var27 = (-param12 + param3 << -1320681136) / var35;
                      var33 = 0;
                    }
                    L11: {
                      L12: {
                        L13: {
                          if (-1 < (param8 ^ -1)) {
                            if (param15 >= 0) {
                              param8 = -param8;
                              var30 = var30 + var32 * param8;
                              var26 = var26 + param8 * var28;
                              var29 = var29 + var31 * param8;
                              var25 = var25 + param8 * var27;
                              var17_int = var17_int + param8 * var19;
                              var18 = var18 + param8 * var20;
                              var22 = var22 + var24 * param8;
                              var21 = var21 + param8 * var23;
                              param8 = 0;
                              if (var42 == 0) {
                                break L13;
                              }
                            }
                            param8 = param15 - param8;
                            var21 = var21 + param8 * var23;
                            var26 = var26 + param8 * var28;
                            var17_int = var17_int + param8 * var19;
                            var18 = var18 + param8 * var20;
                            var25 = var25 + var27 * param8;
                            var30 = var30 + var32 * param8;
                            var22 = var22 + param8 * var24;
                            var29 = var29 + var31 * param8;
                            param8 = param15;
                            if (var42 == 0) {
                              break L12;
                            }
                          }
                        }
                        var36 = mh.field_b[param8];
                        L15: while (true) {
                          if ((param15 ^ -1) >= (param8 ^ -1)) {
                            break L12;
                          } else {
                            var37 = var17_int >> 433424592;
                            stackIn_73_0 = mh.field_c ^ -1;

                            stackIn_73_1 = var37 ^ -1;

                            if (var42 != 0) {
                              break L11;
                            } else {
                              L16: {
                                if (stackIn_73_0 < stackIn_73_1) {
                                  var38 = (var18 >> 1802867664) - (var17_int >> 1124703984);
                                  if (-1 != (var38 ^ -1)) {
                                    var39 = (var22 + -var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (mh.field_c <= var38 + var37) {
                                      var38 = -1 + (mh.field_c + -var37);
                                    }
                                    L19: {
                                      if (0 <= var37) {
                                        jf.a(var37 + var36, var39, 33423689, var21, var41, var25, var40, var38, var29, param11);
                                        if (var42 == 0) {
                                          break L19;
                                        }
                                      }
                                      jf.a(var36, var39, 33423689, -(var39 * var37) + var21, var41, var25 + -(var37 * var40), var40, var38 - -var37, -(var41 * var37) + var29, param11);
                                    }
                                    if (var42 == 0) {
                                      break L16;
                                    }
                                  }
                                  if (-1 >= (var37 ^ -1)) {
                                    if ((var37 ^ -1) > (mh.field_c ^ -1)) {
                                      jf.a(var37 - -var36, 0, 33423689, var21, 0, var25, 0, var38, var29, param11);
                                    }
                                  }
                                }
                              }
                              param8++;
                              if ((param8 ^ -1) > (mh.field_h ^ -1)) {
                                var18 = var18 + var20;
                                var26 = var26 + var28;
                                var22 = var22 + var24;
                                var25 = var25 + var27;
                                var29 = var29 + var31;
                                var30 = var30 + var32;
                                var17_int = var17_int + var19;
                                var21 = var21 + var23;
                                var36 = var36 + SoftwareRasterizer.stride;
                                if (var42 == 0) {
                                  continue L15;
                                } else {
                                  break L12;
                                }
                              } else {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                      var36 = param4 + -param15;
                      stackIn_73_0 = var36 ^ -1;
                      stackIn_73_1 = -1;
                    }
                    if (stackIn_73_0 == stackIn_73_1) {
                      var23 = 0;
                      var27 = 0;
                      var20 = 0;
                      var19 = 0;
                      var24 = 0;
                      var31 = 0;
                      var28 = 0;
                      var32 = 0;
                      if (var42 == 0) {
                        break L4;
                      }
                    }
                    L22: {
                      var37 = param13 << 1962303440;
                      var38 = param6 << 769735280;
                      var39 = param0 << 1520988336;
                      var40 = param5 << 742704;
                      if (var33 == 0) {
                        var17_int = param9 << -2099010000;
                        var29 = param7 << -1275583984;
                        var21 = param10 << -1640258480;
                        var25 = param3 << 780067984;
                        if (var42 == 0) {
                          break L22;
                        }
                      }
                      var22 = param10 << 16805488;
                      var18 = param9 << 1905270256;
                      var26 = param3 << 1281477616;
                      var30 = param7 << -1931827536;
                    }
                    var28 = (var39 + -var26) / var36;
                    var31 = (-var29 + var40) / var36;
                    var19 = (var37 - var17_int) / var36;
                    var23 = (-var21 + var38) / var36;
                    var27 = (var39 + -var25) / var36;
                    var24 = (var38 + -var22) / var36;
                    var20 = (var37 - var18) / var36;
                    var32 = (-var30 + var40) / var36;
                  }
                  if (-1 < (param8 ^ -1)) {
                    param8 = -param8;
                    var18 = var18 + param8 * var20;
                    var17_int = var17_int + param8 * var19;
                    var22 = var22 + var24 * param8;
                    var30 = var30 + param8 * var32;
                    var21 = var21 + var23 * param8;
                    var29 = var29 + param8 * var31;
                    var26 = var26 + var28 * param8;
                    var25 = var25 + var27 * param8;
                    param8 = 0;
                  }
                  var35 = mh.field_b[param8];
                  L25: while (true) {
                    L26: {
                      if (param4 > param8) {
                        var36 = var17_int >> 2004845488;
                        if (var42 != 0) {
                          break L26;
                        } else {
                          L28: {
                            if (var36 < mh.field_c) {
                              var37 = -(var17_int >> -134889776) + (var18 >> 1844746576);
                              if (var37 != 0) {
                                var38 = (var22 + -var21) / var37;
                                var39 = (var26 + -var25) / var37;
                                var40 = (-var29 + var30) / var37;
                                if (var37 + var36 >= mh.field_c) {
                                  var37 = mh.field_c - var36 - 1;
                                }
                                L31: {
                                  if (var36 < 0) {
                                    jf.a(var35, var38, 33423689, var21 - var38 * var36, var40, var25 + -(var36 * var39), var39, var37 + var36, -(var36 * var40) + var29, param11);
                                    if (var42 == 0) {
                                      break L31;
                                    }
                                  }
                                  jf.a(var36 + var35, var38, 33423689, var21, var40, var25, var39, var37, var29, param11);
                                }
                                if (var42 == 0) {
                                  break L28;
                                }
                              }
                              if (var36 >= 0) {
                                if (mh.field_c > var36) {
                                  jf.a(var35 + var36, 0, 33423689, var21, 0, var25, 0, var37, var29, param11);
                                }
                              }
                            }
                          }
                          param8++;
                          if ((mh.field_h ^ -1) < (param8 ^ -1)) {
                            var18 = var18 + var20;
                            var22 = var22 + var24;
                            var35 = var35 + SoftwareRasterizer.stride;
                            var25 = var25 + var27;
                            var26 = var26 + var28;
                            var29 = var29 + var31;
                            var21 = var21 + var23;
                            var17_int = var17_int + var19;
                            var30 = var30 + var32;
                            if (var42 == 0) {
                              continue L25;
                            }
                          } else {
                            decompiledRegionSelector0 = 6;
                            break L0;
                          }
                        }
                      }
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_113_0 = (RuntimeException) (var17);

          stackIn_113_1 = new StringBuilder().append("wh.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');

          if (param11 == null) {
            stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
            stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
            stackIn_114_2 = "null";
          } else {
            stackIn_114_0 = (RuntimeException) ((Object) stackIn_113_0);
            stackIn_114_1 = (StringBuilder) ((Object) stackIn_113_1);
            stackIn_114_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_114_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_114_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(qc param0, boolean param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var5 = 0;
            int stackIn_17_0 = 0;
            int stackIn_17_1 = 0;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            var5 = Geoblox.field_C;
            try {
              L1: {
                var2 = new byte[24];
                if (null != af.field_b) {
                  try {
                    L3: {
                      af.field_b.a(51, 0L);
                      af.field_b.a((byte) -76, var2);
                      var3_int = 0;
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (-25 < (var3_int ^ -1)) {
                              stackIn_17_0 = var2[var3_int] ^ -1;

                              stackIn_17_1 = -1;

                              if (var5 != 0) {
                                break L5;
                              } else {
                                if (stackIn_17_0 != stackIn_17_1) {
                                  if (var5 == 0) {
                                    break L6;
                                  }
                                }
                                var3_int++;
                                if (var5 == 0) {
                                  continue L4;
                                }
                              }
                            }
                          }
                          stackIn_17_0 = 24;
                          stackIn_17_1 = var3_int;
                        }
                        if (stackIn_17_0 > stackIn_17_1) {
                          decompiledRegionSelector0 = 0;
                          break L3;
                        } else {
                          throw new IOException();
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L8: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L9: while (-25 < (var4 ^ -1)) {
                        var2[var4] = (byte) -1;
                        var4++;
                        if (var5 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L8;
                        } else {
                          if (var5 == 0) {
                            continue L9;
                          }
                        }
                        break;
                      }
                      decompiledRegionSelector0 = 0;
                      break L8;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                  } else {
                    break L1;
                  }
                }
                param0.a(24, -97, var2, 0);
              }
              if (!param1) {
                field_t = (ck) null;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              runtimeException = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_35_0 = (RuntimeException) (runtimeException);

              stackIn_35_1 = new StringBuilder().append("wh.IA(");

              if (param0 == null) {
                stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                stackIn_36_2 = "null";
              } else {
                stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
                stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
                stackIn_36_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(',').append(param1).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 5514) {
            SpriteState.f(32);
          }
          field_q = null;
          field_t = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "wh.LA(" + param0 + ')');
        }
    }

    final static boolean e(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            stackIn_4_0 = cf.field_i;
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = 0;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "wh.NA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    SpriteState() {
    }

    static {
        field_q = null;
        field_t = new ck(9, 0, 4, 1);
    }
}
