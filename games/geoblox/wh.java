/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class wh extends rc {
    int field_s;
    int field_r;
    int field_m;
    int field_p;
    int field_o;
    static long field_n;
    static ck field_t;
    int field_u;
    static String field_q;

    final static void a(boolean param0, rh param1) {
        byte[] var2 = null;
        int var3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          pf.field_O = param1;
          var2 = ih.a(122, "achievement_names,0");
          if (null != var2) {
            pg.field_a[0] = ag.a(1, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = ih.a(122, "achievement_names,1");
          if (var2 != null) {
            pg.field_a[1] = ag.a(1, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = ih.a(126, "achievement_names,2");
          if (var2 == null) {
            break L2;
          } else {
            pg.field_a[2] = ag.a(1, var2);
            break L2;
          }
        }
        L3: {
          var2 = ih.a(125, "achievement_names,3");
          if (null == var2) {
            break L3;
          } else {
            pg.field_a[3] = ag.a(1, var2);
            break L3;
          }
        }
        L4: {
          var2 = ih.a(121, "achievement_names,4");
          if (null != var2) {
            pg.field_a[4] = ag.a(1, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = ih.a(126, "achievement_names,5");
          if (var2 == null) {
            break L5;
          } else {
            pg.field_a[5] = ag.a(1, var2);
            break L5;
          }
        }
        L6: {
          var2 = ih.a(125, "achievement_names,6");
          if (var2 == null) {
            break L6;
          } else {
            pg.field_a[6] = ag.a(1, var2);
            break L6;
          }
        }
        L7: {
          var2 = ih.a(125, "achievement_names,7");
          if (null == var2) {
            break L7;
          } else {
            pg.field_a[7] = ag.a(1, var2);
            break L7;
          }
        }
        L8: {
          var2 = ih.a(127, "achievement_names,8");
          if (null != var2) {
            pg.field_a[8] = ag.a(1, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = ih.a(122, "achievement_names,9");
          if (var2 != null) {
            pg.field_a[9] = ag.a(1, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = ih.a(122, "achievement_names,10");
          if (null == var2) {
            break L10;
          } else {
            pg.field_a[10] = ag.a(1, var2);
            break L10;
          }
        }
        L11: {
          var2 = ih.a(126, "achievement_names,11");
          if (null != var2) {
            pg.field_a[11] = ag.a(1, var2);
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          var2 = ih.a(122, "achievement_names,12");
          if (var2 == null) {
            break L12;
          } else {
            pg.field_a[12] = ag.a(1, var2);
            break L12;
          }
        }
        L13: {
          var2 = ih.a(125, "achievement_names,13");
          if (null != var2) {
            pg.field_a[13] = ag.a(1, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = ih.a(120, "achievement_names,14");
          if (var2 != null) {
            pg.field_a[14] = ag.a(1, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = ih.a(123, "achievement_names,15");
          if (null == var2) {
            break L15;
          } else {
            pg.field_a[15] = ag.a(1, var2);
            break L15;
          }
        }
        L16: {
          var2 = ih.a(121, "achievement_names,16");
          if (var2 == null) {
            break L16;
          } else {
            pg.field_a[16] = ag.a(1, var2);
            break L16;
          }
        }
        L17: {
          var2 = ih.a(122, "achievement_criteria,0");
          if (null != var2) {
            ri.field_b[0] = ag.a(1, var2);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = ih.a(121, "achievement_criteria,1");
          if (null != var2) {
            ri.field_b[1] = ag.a(1, var2);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          var2 = ih.a(125, "achievement_criteria,2");
          if (null == var2) {
            break L19;
          } else {
            ri.field_b[2] = ag.a(1, var2);
            break L19;
          }
        }
        L20: {
          var2 = ih.a(126, "achievement_criteria,3");
          if (var2 == null) {
            break L20;
          } else {
            ri.field_b[3] = ag.a(1, var2);
            break L20;
          }
        }
        L21: {
          var2 = ih.a(121, "achievement_criteria,4");
          if (null == var2) {
            break L21;
          } else {
            ri.field_b[4] = ag.a(1, var2);
            break L21;
          }
        }
        L22: {
          var2 = ih.a(120, "achievement_criteria,5");
          if (null != var2) {
            ri.field_b[5] = ag.a(1, var2);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = ih.a(126, "achievement_criteria,6");
          if (var2 != null) {
            ri.field_b[6] = ag.a(1, var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = ih.a(121, "achievement_criteria,7");
          if (var2 == null) {
            break L24;
          } else {
            ri.field_b[7] = ag.a(1, var2);
            break L24;
          }
        }
        L25: {
          var2 = ih.a(125, "achievement_criteria,8");
          if (null != var2) {
            ri.field_b[8] = ag.a(1, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = ih.a(125, "achievement_criteria,9");
          if (null == var2) {
            break L26;
          } else {
            ri.field_b[9] = ag.a(1, var2);
            break L26;
          }
        }
        L27: {
          var2 = ih.a(122, "achievement_criteria,10");
          if (null != var2) {
            ri.field_b[10] = ag.a(1, var2);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          var2 = ih.a(126, "achievement_criteria,11");
          if (var2 == null) {
            break L28;
          } else {
            ri.field_b[11] = ag.a(1, var2);
            break L28;
          }
        }
        L29: {
          var2 = ih.a(126, "achievement_criteria,12");
          if (var2 == null) {
            break L29;
          } else {
            ri.field_b[12] = ag.a(1, var2);
            break L29;
          }
        }
        L30: {
          var2 = ih.a(127, "achievement_criteria,13");
          if (null == var2) {
            break L30;
          } else {
            ri.field_b[13] = ag.a(1, var2);
            break L30;
          }
        }
        L31: {
          var2 = ih.a(120, "achievement_criteria,14");
          if (null != var2) {
            ri.field_b[14] = ag.a(1, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = ih.a(127, "achievement_criteria,15");
          if (null != var2) {
            ri.field_b[15] = ag.a(1, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = ih.a(120, "achievement_criteria,16");
          if (null != var2) {
            ri.field_b[16] = ag.a(1, var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = ih.a(127, "starting");
          if (null != var2) {
            uj.field_a = ag.a(1, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = ih.a(120, "gameName");
          if (var2 != null) {
            od.field_b = ag.a(1, var2);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = ih.a(125, "caption1");
          if (var2 != null) {
            String discarded$9 = ag.a(1, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = ih.a(124, "caption2");
          if (null != var2) {
            String discarded$10 = ag.a(1, var2);
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          var2 = ih.a(123, "caption3");
          if (var2 != null) {
            String discarded$11 = ag.a(1, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = ih.a(125, "caption4");
          if (null != var2) {
            String discarded$12 = ag.a(1, var2);
            break L39;
          } else {
            break L39;
          }
        }
        L40: {
          var2 = ih.a(124, "caption5");
          if (null != var2) {
            String discarded$13 = ag.a(1, var2);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = ih.a(126, "youreGreat");
          if (null == var2) {
            break L41;
          } else {
            ld.field_a = ag.a(1, var2);
            break L41;
          }
        }
        L42: {
          var2 = ih.a(120, "bubbleBonus");
          if (var2 != null) {
            sg.field_f = ag.a(1, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = ih.a(126, "endOfFreeGame");
          if (var2 != null) {
            String discarded$14 = ag.a(1, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = ih.a(126, "itsTheBubbleBonus");
          if (var2 == null) {
            break L44;
          } else {
            kd.field_d = ag.a(1, var2);
            break L44;
          }
        }
        L45: {
          var2 = ih.a(120, "countdown");
          if (null == var2) {
            break L45;
          } else {
            w.field_e = ag.a(1, var2);
            break L45;
          }
        }
        L46: {
          var2 = ih.a(124, "levelsLastGeoblox");
          if (null == var2) {
            break L46;
          } else {
            tj.field_a = ag.a(1, var2);
            break L46;
          }
        }
        L47: {
          var2 = ih.a(120, "clearBonus");
          if (null != var2) {
            wl.field_b = ag.a(1, var2);
            break L47;
          } else {
            break L47;
          }
        }
        var2 = ih.a(121, "cheat");
        L48: {
          if (var2 != null) {
            String discarded$15 = ag.a(1, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = ih.a(125, "bonus");
          if (var2 != null) {
            ic.field_a = ag.a(1, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = ih.a(123, "fps");
          if (null != var2) {
            sh.field_z = ag.a(1, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = ih.a(127, "level");
          if (var2 != null) {
            qg.field_e = ag.a(1, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = ih.a(124, "score");
          if (var2 != null) {
            pa.field_a = ag.a(1, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = ih.a(121, "waitingForPumpkin");
          if (var2 == null) {
            break L53;
          } else {
            s.field_F = ag.a(1, var2);
            break L53;
          }
        }
        L54: {
          var2 = ih.a(121, "loadingPumpkin");
          if (var2 == null) {
            break L54;
          } else {
            uj.field_c = ag.a(1, var2);
            break L54;
          }
        }
        L55: {
          var2 = ih.a(125, "skipText");
          if (var2 != null) {
            v.field_n = ag.a(1, var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = ih.a(126, "tutorial1");
          if (null != var2) {
            vh.field_E = ag.a(1, var2);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = ih.a(127, "tutorial2");
          if (var2 == null) {
            break L57;
          } else {
            oi.field_d = ag.a(1, var2);
            break L57;
          }
        }
        L58: {
          var2 = ih.a(121, "tutorial3");
          if (null == var2) {
            break L58;
          } else {
            vd.field_e = ag.a(1, var2);
            break L58;
          }
        }
        L59: {
          var2 = ih.a(122, "tutorial4");
          if (var2 == null) {
            break L59;
          } else {
            li.field_b = ag.a(1, var2);
            break L59;
          }
        }
        L60: {
          var2 = ih.a(120, "tutorial5");
          if (null == var2) {
            break L60;
          } else {
            qh.field_S = ag.a(1, var2);
            break L60;
          }
        }
        L61: {
          var2 = ih.a(123, "cont");
          if (null != var2) {
            mi.field_y = ag.a(1, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = ih.a(124, "restartTutorial");
          if (var2 == null) {
            break L62;
          } else {
            cf.field_j = ag.a(1, var2);
            break L62;
          }
        }
        L63: {
          var2 = ih.a(125, "discardResults");
          if (var2 != null) {
            ne.field_c = ag.a(1, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = ih.a(124, "replayTutorial");
          if (null == var2) {
            break L64;
          } else {
            em.field_a = ag.a(1, var2);
            break L64;
          }
        }
        L65: {
          var2 = ih.a(122, "subscribe");
          if (null == var2) {
            break L65;
          } else {
            String discarded$16 = ag.a(1, var2);
            break L65;
          }
        }
        L66: {
          var2 = ih.a(124, "createAnAccount");
          if (null != var2) {
            String discarded$17 = ag.a(1, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = ih.a(122, "fetchingHS");
          if (null != var2) {
            eb.field_f = ag.a(1, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = ih.a(126, "instructionTitles,0");
          if (var2 != null) {
            a.field_a[0] = ag.a(1, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = ih.a(127, "instructionTitles,1");
          if (var2 == null) {
            break L69;
          } else {
            a.field_a[1] = ag.a(1, var2);
            break L69;
          }
        }
        L70: {
          var2 = ih.a(121, "instructionTitles,2");
          if (null != var2) {
            a.field_a[2] = ag.a(1, var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          var2 = ih.a(125, "instructionTitles,3");
          if (null != var2) {
            a.field_a[3] = ag.a(1, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = ih.a(123, "instructionTitles,4");
          if (var2 == null) {
            break L72;
          } else {
            a.field_a[4] = ag.a(1, var2);
            break L72;
          }
        }
        L73: {
          var2 = ih.a(120, "instructionTitles,5");
          if (null == var2) {
            break L73;
          } else {
            a.field_a[5] = ag.a(1, var2);
            break L73;
          }
        }
        L74: {
          var2 = ih.a(124, "instructionText,0");
          if (null != var2) {
            ec.field_e[0] = ag.a(1, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = ih.a(126, "instructionText,1");
          if (var2 == null) {
            break L75;
          } else {
            ec.field_e[1] = ag.a(1, var2);
            break L75;
          }
        }
        L76: {
          var2 = ih.a(120, "instructionText,2");
          if (var2 == null) {
            break L76;
          } else {
            ec.field_e[2] = ag.a(1, var2);
            break L76;
          }
        }
        L77: {
          var2 = ih.a(121, "instructionText,3");
          if (var2 == null) {
            break L77;
          } else {
            ec.field_e[3] = ag.a(1, var2);
            break L77;
          }
        }
        L78: {
          var2 = ih.a(123, "instructionText,4");
          if (null != var2) {
            ec.field_e[4] = ag.a(1, var2);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = ih.a(126, "pleaseLogin");
          if (var2 != null) {
            Geoblox.field_A = ag.a(1, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = ih.a(125, "youAreNotLoggedIn");
          if (null == var2) {
            break L80;
          } else {
            r.field_sb = ag.a(1, var2);
            break L80;
          }
        }
        L81: {
          var2 = ih.a(120, "alternatively");
          if (var2 != null) {
            bd.field_b = ag.a(1, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = ih.a(125, "login");
          if (var2 == null) {
            break L82;
          } else {
            gj.field_t = ag.a(1, var2);
            break L82;
          }
        }
        L83: {
          var2 = ih.a(122, "notAcheived");
          if (null != var2) {
            ib.field_d = ag.a(1, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = ih.a(122, "keycode_reverseControls");
          if (null == var2) {
            break L84;
          } else {
            jg.field_g = var2[0] & 255;
            break L84;
          }
        }
        pf.field_O = null;
        L85: {
          if (!ch.field_h) {
            break L85;
          } else {
            var3++;
            Geoblox.field_C = var3;
            break L85;
          }
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        ge var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  var4 = new byte[param0];
                  var5_int = 0;
                  L3: while (true) {
                    L4: {
                      if (~param0 >= ~var5_int) {
                        break L4;
                      } else {
                        var4[var5_int] = param2[param1 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                          break L1;
                        } else {
                          if (var7 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var7 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4 = param2;
              break L1;
            }
            var5 = new ge();
            var5.a(52);
            var5.a(var4, (long)(8 * param0), 0);
            var6 = new byte[64];
            var5.a(var6, 0, true);
            stackOut_10_0 = (byte[]) var6;
            stackIn_11_0 = stackOut_10_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4_ref;
            stackOut_12_1 = new StringBuilder().append("wh.MA(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + 8 + ')');
        }
        return stackIn_11_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15) {
        int var17_int = 0;
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
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        L0: {
          var42 = Geoblox.field_C;
          if (param4 < 0) {
            break L0;
          } else {
            if (~mh.field_h < ~param8) {
              L1: {
                if (param2 >= 0) {
                  break L1;
                } else {
                  if (param9 >= 0) {
                    break L1;
                  } else {
                    if (param13 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (~mh.field_c < ~param2) {
                  break L2;
                } else {
                  if (~mh.field_c < ~param9) {
                    break L2;
                  } else {
                    if (param13 < mh.field_c) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var34 = -param8 + param4;
                  if (param8 != param15) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (~param4 != ~param8) {
                          break L6;
                        } else {
                          var29 = param14;
                          var17_int = param2 << 16;
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
                          var18 = param9 << 16;
                          var25 = param12;
                          if (var42 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        var35 = -param15 + param4;
                        if (param9 > param2) {
                          break L7;
                        } else {
                          var27 = (param0 - param3 << 16) / var35;
                          var29 = param7 << 16;
                          var20 = (param13 - param2 << 16) / var34;
                          var24 = (param6 - param1 << 16) / var34;
                          var17_int = param9 << 16;
                          var23 = (-param10 + param6 << 16) / var35;
                          var18 = param2 << 16;
                          var31 = (-param7 + param5 << 16) / var35;
                          var32 = (-param14 + param5 << 16) / var34;
                          var25 = param3 << 16;
                          var30 = param14 << 16;
                          var28 = (-param12 + param0 << 16) / var34;
                          var19 = (-param9 + param13 << 16) / var35;
                          var21 = param10 << 16;
                          var22 = param1 << 16;
                          var26 = param12 << 16;
                          if (var42 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var28 = (param0 + -param3 << 16) / var35;
                      var23 = (param6 + -param1 << 16) / var34;
                      var19 = (param13 - param2 << 16) / var34;
                      var25 = param12 << 16;
                      var22 = param10 << 16;
                      var32 = (param5 - param7 << 16) / var35;
                      var26 = param3 << 16;
                      var17_int = param2 << 16;
                      var24 = (-param10 + param6 << 16) / var35;
                      var21 = param1 << 16;
                      var30 = param7 << 16;
                      var18 = param9 << 16;
                      var20 = (param13 - param9 << 16) / var35;
                      var31 = (param5 - param14 << 16) / var34;
                      var27 = (param0 + -param12 << 16) / var34;
                      var29 = param14 << 16;
                      break L5;
                    }
                    var33 = 0;
                    if (0 <= param8) {
                      break L3;
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
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L8: {
                  L9: {
                    var18 = param2 << 16;
                    var17_int = param2 << 16;
                    var30 = param14 << 16;
                    var29 = param14 << 16;
                    var26 = param12 << 16;
                    var25 = param12 << 16;
                    var22 = param1 << 16;
                    var21 = param1 << 16;
                    var35 = param15 + -param8;
                    var20 = (-param2 + param13 << 16) / var34;
                    var19 = (param9 + -param2 << 16) / var35;
                    if (var20 > var19) {
                      break L9;
                    } else {
                      var23 = (-param1 + param6 << 16) / var34;
                      var27 = (-param12 + param0 << 16) / var34;
                      var31 = (-param14 + param5 << 16) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var28 = (-param12 + param3 << 16) / var35;
                      var33 = 1;
                      var32 = (-param14 + param7 << 16) / var35;
                      var24 = (-param1 + param10 << 16) / var35;
                      if (var42 == 0) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var32 = (-param14 + param5 << 16) / var34;
                  var28 = (param0 - param12 << 16) / var34;
                  var23 = (param10 - param1 << 16) / var35;
                  var24 = (-param1 + param6 << 16) / var34;
                  var31 = (param7 + -param14 << 16) / var35;
                  var27 = (-param12 + param3 << 16) / var35;
                  var33 = 0;
                  break L8;
                }
                L10: {
                  L11: {
                    L12: {
                      if (param8 >= 0) {
                        break L12;
                      } else {
                        L13: {
                          if (param15 < 0) {
                            break L13;
                          } else {
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
                              break L12;
                            } else {
                              break L13;
                            }
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
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    var36 = mh.field_b[param8];
                    L14: while (true) {
                      if (~param15 >= ~param8) {
                        break L11;
                      } else {
                        var37 = var17_int >> 16;
                        stackOut_36_0 = ~mh.field_c;
                        stackOut_36_1 = ~var37;
                        stackIn_57_0 = stackOut_36_0;
                        stackIn_57_1 = stackOut_36_1;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        if (var42 != 0) {
                          break L10;
                        } else {
                          L15: {
                            if (stackIn_37_0 >= stackIn_37_1) {
                              break L15;
                            } else {
                              L16: {
                                var38 = (var18 >> 16) - (var17_int >> 16);
                                if (var38 == 0) {
                                  break L16;
                                } else {
                                  L17: {
                                    var39 = (var22 + -var21) / var38;
                                    var40 = (-var25 + var26) / var38;
                                    var41 = (var30 + -var29) / var38;
                                    if (mh.field_c <= var38 + var37) {
                                      var38 = -1 + (mh.field_c + -var37);
                                      break L17;
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    L19: {
                                      if (0 > var37) {
                                        break L19;
                                      } else {
                                        jf.a(var37 + var36, var39, 33423689, var21, var41, var25, var40, var38, var29, param11);
                                        if (var42 == 0) {
                                          break L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    jf.a(var36, var39, 33423689, -(var39 * var37) + var21, var41, var25 + -(var37 * var40), var40, var38 - -var37, -(var41 * var37) + var29, param11);
                                    break L18;
                                  }
                                  if (var42 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              if (var37 < 0) {
                                break L15;
                              } else {
                                if (~var37 <= ~mh.field_c) {
                                  break L15;
                                } else {
                                  jf.a(var37 - -var36, 0, 33423689, var21, 0, var25, 0, var38, var29, param11);
                                  break L15;
                                }
                              }
                            }
                          }
                          param8++;
                          if (~param8 > ~mh.field_h) {
                            var18 = var18 + var20;
                            var26 = var26 + var28;
                            var22 = var22 + var24;
                            var25 = var25 + var27;
                            var29 = var29 + var31;
                            var30 = var30 + var32;
                            var17_int = var17_int + var19;
                            var21 = var21 + var23;
                            var36 = var36 + vb.field_f;
                            if (var42 == 0) {
                              continue L14;
                            } else {
                              break L11;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                  }
                  var36 = param4 + -param15;
                  stackOut_56_0 = ~var36;
                  stackOut_56_1 = -1;
                  stackIn_57_0 = stackOut_56_0;
                  stackIn_57_1 = stackOut_56_1;
                  break L10;
                }
                L20: {
                  if (stackIn_57_0 != stackIn_57_1) {
                    break L20;
                  } else {
                    var23 = 0;
                    var27 = 0;
                    var20 = 0;
                    var19 = 0;
                    var24 = 0;
                    var31 = 0;
                    var28 = 0;
                    var32 = 0;
                    if (var42 == 0) {
                      break L3;
                    } else {
                      break L20;
                    }
                  }
                }
                L21: {
                  L22: {
                    var37 = param13 << 16;
                    var38 = param6 << 16;
                    var39 = param0 << 16;
                    var40 = param5 << 16;
                    if (var33 != 0) {
                      break L22;
                    } else {
                      var17_int = param9 << 16;
                      var29 = param7 << 16;
                      var21 = param10 << 16;
                      var25 = param3 << 16;
                      if (var42 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var22 = param10 << 16;
                  var18 = param9 << 16;
                  var26 = param3 << 16;
                  var30 = param7 << 16;
                  break L21;
                }
                var28 = (var39 + -var26) / var36;
                var31 = (-var29 + var40) / var36;
                var19 = (var37 - var17_int) / var36;
                var23 = (-var21 + var38) / var36;
                var27 = (var39 + -var25) / var36;
                var24 = (var38 + -var22) / var36;
                var20 = (var37 - var18) / var36;
                var32 = (-var30 + var40) / var36;
                break L3;
              }
              L23: {
                if (param8 >= 0) {
                  break L23;
                } else {
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
                  break L23;
                }
              }
              var35 = mh.field_b[param8];
              L24: while (true) {
                L25: {
                  L26: {
                    if (param4 <= param8) {
                      break L26;
                    } else {
                      var36 = var17_int >> 16;
                      if (var42 != 0) {
                        break L25;
                      } else {
                        L27: {
                          if (var36 >= mh.field_c) {
                            break L27;
                          } else {
                            L28: {
                              var37 = -(var17_int >> 16) + (var18 >> 16);
                              if (var37 == 0) {
                                break L28;
                              } else {
                                L29: {
                                  var38 = (var22 + -var21) / var37;
                                  var39 = (var26 + -var25) / var37;
                                  var40 = (-var29 + var30) / var37;
                                  if (var37 + var36 < mh.field_c) {
                                    break L29;
                                  } else {
                                    var37 = mh.field_c - var36 - 1;
                                    break L29;
                                  }
                                }
                                L30: {
                                  L31: {
                                    if (var36 >= 0) {
                                      break L31;
                                    } else {
                                      jf.a(var35, var38, 33423689, var21 - var38 * var36, var40, var25 + -(var36 * var39), var39, var37 + var36, -(var36 * var40) + var29, param11);
                                      if (var42 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  jf.a(var36 + var35, var38, 33423689, var21, var40, var25, var39, var37, var29, param11);
                                  break L30;
                                }
                                if (var42 == 0) {
                                  break L27;
                                } else {
                                  break L28;
                                }
                              }
                            }
                            if (var36 < 0) {
                              break L27;
                            } else {
                              if (mh.field_c > var36) {
                                jf.a(var35 + var36, 0, 33423689, var21, 0, var25, 0, var37, var29, param11);
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        param8++;
                        if (~mh.field_h < ~param8) {
                          var18 = var18 + var20;
                          var22 = var22 + var24;
                          var35 = var35 + vb.field_f;
                          var25 = var25 + var27;
                          var26 = var26 + var28;
                          var29 = var29 + var31;
                          var21 = var21 + var23;
                          var17_int = var17_int + var19;
                          var30 = var30 + var32;
                          if (var42 == 0) {
                            continue L24;
                          } else {
                            break L26;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  break L25;
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(qc param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_7_0 = 0;
            int stackIn_7_1 = 0;
            int stackIn_17_0 = 0;
            int stackIn_17_1 = 0;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            String stackIn_36_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_6_1 = 0;
            int stackOut_16_0 = 0;
            int stackOut_16_1 = 0;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_33_0 = null;
            StringBuilder stackOut_33_1 = null;
            String stackOut_33_2 = null;
            var5 = Geoblox.field_C;
            try {
              L0: {
                L1: {
                  L2: {
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
                                if (var3_int >= 24) {
                                  break L6;
                                } else {
                                  stackOut_6_0 = ~var2[var3_int];
                                  stackOut_6_1 = -1;
                                  stackIn_17_0 = stackOut_6_0;
                                  stackIn_17_1 = stackOut_6_1;
                                  stackIn_7_0 = stackOut_6_0;
                                  stackIn_7_1 = stackOut_6_1;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    L7: {
                                      if (stackIn_7_0 == stackIn_7_1) {
                                        break L7;
                                      } else {
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    var3_int++;
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              stackOut_16_0 = 24;
                              stackOut_16_1 = var3_int;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              break L5;
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
                          L9: while (true) {
                            L10: {
                              if (var4 >= 24) {
                                break L10;
                              } else {
                                var2[var4] = (byte) -1;
                                var4++;
                                if (var5 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L8;
                                } else {
                                  if (var5 == 0) {
                                    continue L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L8;
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param0.a(24, -97, var2, 0);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L11: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_32_0 = (RuntimeException) var2_ref;
                stackOut_32_1 = new StringBuilder().append("wh.IA(");
                stackIn_35_0 = stackOut_32_0;
                stackIn_35_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (param0 == null) {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "null";
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  break L11;
                } else {
                  stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                  stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                  stackOut_33_2 = "{...}";
                  stackIn_36_0 = stackOut_33_0;
                  stackIn_36_1 = stackOut_33_1;
                  stackIn_36_2 = stackOut_33_2;
                  break L11;
                }
              }
              throw t.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ',' + true + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 5514) {
                break L1;
              } else {
                wh.f(32);
                break L1;
              }
            }
            field_q = null;
            field_t = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "wh.LA(" + param0 + ')');
        }
    }

    final static boolean e(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_3_0 = cf.field_i;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "wh.NA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    wh() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = null;
        field_t = new ck(9, 0, 4, 1);
    }
}
