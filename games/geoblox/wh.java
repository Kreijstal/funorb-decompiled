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
        L48: {
          var2 = ih.a(121, "cheat");
          if (param0) {
            break L48;
          } else {
            field_t = null;
            break L48;
          }
        }
        L49: {
          if (var2 != null) {
            String discarded$15 = ag.a(1, var2);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = ih.a(125, "bonus");
          if (var2 != null) {
            ic.field_a = ag.a(1, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = ih.a(123, "fps");
          if (null != var2) {
            sh.field_z = ag.a(1, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = ih.a(127, "level");
          if (var2 != null) {
            qg.field_e = ag.a(1, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = ih.a(124, "score");
          if (var2 != null) {
            pa.field_a = ag.a(1, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = ih.a(121, "waitingForPumpkin");
          if (var2 == null) {
            break L54;
          } else {
            s.field_F = ag.a(1, var2);
            break L54;
          }
        }
        L55: {
          var2 = ih.a(121, "loadingPumpkin");
          if (var2 == null) {
            break L55;
          } else {
            uj.field_c = ag.a(1, var2);
            break L55;
          }
        }
        L56: {
          var2 = ih.a(125, "skipText");
          if (var2 != null) {
            v.field_n = ag.a(1, var2);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = ih.a(126, "tutorial1");
          if (null != var2) {
            vh.field_E = ag.a(1, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = ih.a(127, "tutorial2");
          if (var2 == null) {
            break L58;
          } else {
            oi.field_d = ag.a(1, var2);
            break L58;
          }
        }
        L59: {
          var2 = ih.a(121, "tutorial3");
          if (null == var2) {
            break L59;
          } else {
            vd.field_e = ag.a(1, var2);
            break L59;
          }
        }
        L60: {
          var2 = ih.a(122, "tutorial4");
          if (var2 == null) {
            break L60;
          } else {
            li.field_b = ag.a(1, var2);
            break L60;
          }
        }
        L61: {
          var2 = ih.a(120, "tutorial5");
          if (null == var2) {
            break L61;
          } else {
            qh.field_S = ag.a(1, var2);
            break L61;
          }
        }
        L62: {
          var2 = ih.a(123, "cont");
          if (null != var2) {
            mi.field_y = ag.a(1, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = ih.a(124, "restartTutorial");
          if (var2 == null) {
            break L63;
          } else {
            cf.field_j = ag.a(1, var2);
            break L63;
          }
        }
        L64: {
          var2 = ih.a(125, "discardResults");
          if (var2 != null) {
            ne.field_c = ag.a(1, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = ih.a(124, "replayTutorial");
          if (null == var2) {
            break L65;
          } else {
            em.field_a = ag.a(1, var2);
            break L65;
          }
        }
        L66: {
          var2 = ih.a(122, "subscribe");
          if (null == var2) {
            break L66;
          } else {
            String discarded$16 = ag.a(1, var2);
            break L66;
          }
        }
        L67: {
          var2 = ih.a(124, "createAnAccount");
          if (null != var2) {
            String discarded$17 = ag.a(1, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = ih.a(122, "fetchingHS");
          if (null != var2) {
            eb.field_f = ag.a(1, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = ih.a(126, "instructionTitles,0");
          if (var2 != null) {
            a.field_a[0] = ag.a(1, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = ih.a(127, "instructionTitles,1");
          if (var2 == null) {
            break L70;
          } else {
            a.field_a[1] = ag.a(1, var2);
            break L70;
          }
        }
        L71: {
          var2 = ih.a(121, "instructionTitles,2");
          if (null != var2) {
            a.field_a[2] = ag.a(1, var2);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = ih.a(125, "instructionTitles,3");
          if (null != var2) {
            a.field_a[3] = ag.a(1, var2);
            break L72;
          } else {
            break L72;
          }
        }
        L73: {
          var2 = ih.a(123, "instructionTitles,4");
          if (var2 == null) {
            break L73;
          } else {
            a.field_a[4] = ag.a(1, var2);
            break L73;
          }
        }
        L74: {
          var2 = ih.a(120, "instructionTitles,5");
          if (null == var2) {
            break L74;
          } else {
            a.field_a[5] = ag.a(1, var2);
            break L74;
          }
        }
        L75: {
          var2 = ih.a(124, "instructionText,0");
          if (null != var2) {
            ec.field_e[0] = ag.a(1, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = ih.a(126, "instructionText,1");
          if (var2 == null) {
            break L76;
          } else {
            ec.field_e[1] = ag.a(1, var2);
            break L76;
          }
        }
        L77: {
          var2 = ih.a(120, "instructionText,2");
          if (var2 == null) {
            break L77;
          } else {
            ec.field_e[2] = ag.a(1, var2);
            break L77;
          }
        }
        L78: {
          var2 = ih.a(121, "instructionText,3");
          if (var2 == null) {
            break L78;
          } else {
            ec.field_e[3] = ag.a(1, var2);
            break L78;
          }
        }
        L79: {
          var2 = ih.a(123, "instructionText,4");
          if (null != var2) {
            ec.field_e[4] = ag.a(1, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = ih.a(126, "pleaseLogin");
          if (var2 != null) {
            Geoblox.field_A = ag.a(1, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = ih.a(125, "youAreNotLoggedIn");
          if (null == var2) {
            break L81;
          } else {
            r.field_sb = ag.a(1, var2);
            break L81;
          }
        }
        L82: {
          var2 = ih.a(120, "alternatively");
          if (var2 != null) {
            bd.field_b = ag.a(1, var2);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = ih.a(125, "login");
          if (var2 == null) {
            break L83;
          } else {
            gj.field_t = ag.a(1, var2);
            break L83;
          }
        }
        L84: {
          var2 = ih.a(122, "notAcheived");
          if (null != var2) {
            ib.field_d = ag.a(1, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = ih.a(122, "keycode_reverseControls");
          if (null == var2) {
            break L85;
          } else {
            jg.field_g = var2[0] & 255;
            break L85;
          }
        }
        pf.field_O = null;
        L86: {
          if (!ch.field_h) {
            break L86;
          } else {
            var3++;
            Geoblox.field_C = var3;
            break L86;
          }
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Geoblox.field_C;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if ((param1 ^ -1) >= -1) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var4 = new byte[param0];
                        var5_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if ((param0 ^ -1) >= (var5_int ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var4[var5_int] = param2[param1 + var5_int];
                        var5_int++;
                        if (var7 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = param2;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5 = new ge();
                        var5.a(52);
                        var5.a(var4, (long)(param3 * param0), 0);
                        var6 = new byte[64];
                        var5.a(var6, 0, true);
                        stackOut_10_0 = (byte[]) var6;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) var4_ref;
                        stackOut_13_1 = new StringBuilder().append("wh.MA(").append(param0).append(44).append(param1).append(44);
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param2 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw t.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int[] param11, int param12, int param13, int param14, int param15, int param16) {
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
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        L0: {
          var42 = Geoblox.field_C;
          if ((param4 ^ -1) > -1) {
            break L0;
          } else {
            if ((mh.field_h ^ -1) < (param8 ^ -1)) {
              L1: {
                if (-1 >= (param2 ^ -1)) {
                  break L1;
                } else {
                  if (-1 >= (param9 ^ -1)) {
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
                if ((mh.field_c ^ -1) < (param2 ^ -1)) {
                  break L2;
                } else {
                  if ((mh.field_c ^ -1) < (param9 ^ -1)) {
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
              if (param16 == -1275583984) {
                L3: {
                  L4: {
                    var34 = -param8 + param4;
                    if (param8 != param15) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          if ((param4 ^ -1) != (param8 ^ -1)) {
                            break L6;
                          } else {
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
                              break L5;
                            } else {
                              break L7;
                            }
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
                      if (var20 > var19) {
                        break L9;
                      } else {
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
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    var32 = (-param14 + param5 << -2120283184) / var34;
                    var28 = (param0 - param12 << 718199120) / var34;
                    var23 = (param10 - param1 << -868271056) / var35;
                    var24 = (-param1 + param6 << -2107665712) / var34;
                    var31 = (param7 + -param14 << -1485610160) / var35;
                    var27 = (-param12 + param3 << -1320681136) / var35;
                    var33 = 0;
                    break L8;
                  }
                  L10: {
                    L11: {
                      L12: {
                        if (-1 >= (param8 ^ -1)) {
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
                        if ((param15 ^ -1) >= (param8 ^ -1)) {
                          break L11;
                        } else {
                          var37 = var17_int >> 433424592;
                          stackOut_37_0 = mh.field_c ^ -1;
                          stackOut_37_1 = var37 ^ -1;
                          stackIn_58_0 = stackOut_37_0;
                          stackIn_58_1 = stackOut_37_1;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          if (var42 != 0) {
                            break L10;
                          } else {
                            L15: {
                              if (stackIn_38_0 >= stackIn_38_1) {
                                break L15;
                              } else {
                                L16: {
                                  var38 = (var18 >> 1802867664) - (var17_int >> 1124703984);
                                  if (-1 == (var38 ^ -1)) {
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
                                if (-1 < (var37 ^ -1)) {
                                  break L15;
                                } else {
                                  if ((var37 ^ -1) <= (mh.field_c ^ -1)) {
                                    break L15;
                                  } else {
                                    jf.a(var37 - -var36, 0, 33423689, var21, 0, var25, 0, var38, var29, param11);
                                    break L15;
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
                    stackOut_57_0 = var36 ^ -1;
                    stackOut_57_1 = -1;
                    stackIn_58_0 = stackOut_57_0;
                    stackIn_58_1 = stackOut_57_1;
                    break L10;
                  }
                  L20: {
                    if (stackIn_58_0 != stackIn_58_1) {
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
                      var37 = param13 << 1962303440;
                      var38 = param6 << 769735280;
                      var39 = param0 << 1520988336;
                      var40 = param5 << 742704;
                      if (var33 != 0) {
                        break L22;
                      } else {
                        var17_int = param9 << -2099010000;
                        var29 = param7 << -1275583984;
                        var21 = param10 << -1640258480;
                        var25 = param3 << 780067984;
                        if (var42 == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var22 = param10 << 16805488;
                    var18 = param9 << 1905270256;
                    var26 = param3 << 1281477616;
                    var30 = param7 << -1931827536;
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
                  if (-1 >= (param8 ^ -1)) {
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
                        var36 = var17_int >> 2004845488;
                        if (var42 != 0) {
                          break L25;
                        } else {
                          L27: {
                            if (var36 >= mh.field_c) {
                              break L27;
                            } else {
                              L28: {
                                var37 = -(var17_int >> -134889776) + (var18 >> 1844746576);
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
                          if ((mh.field_h ^ -1) < (param8 ^ -1)) {
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
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static void a(qc param0, boolean param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            int var5 = 0;
            int stackIn_8_0 = 0;
            int stackIn_8_1 = 0;
            int stackIn_18_0 = 0;
            int stackIn_18_1 = 0;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            String stackIn_39_2 = null;
            int stackOut_7_0 = 0;
            int stackOut_7_1 = 0;
            int stackOut_17_0 = 0;
            int stackOut_17_1 = 0;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = new byte[24];
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (null != af.field_b) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof Exception ? 4 : 34);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof Exception ? 4 : 34);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            af.field_b.a(51, 0L);
                            af.field_b.a((byte) -76, var2);
                            var3_int = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-25 >= (var3_int ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var2[var3_int] ^ -1;
                            stackOut_7_1 = -1;
                            stackIn_18_0 = stackOut_7_0;
                            stackIn_18_1 = stackOut_7_1;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            if (var5 != 0) {
                                statePc = 18;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 10 : 34);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (stackIn_8_0 == stackIn_8_1) {
                                statePc = 14;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof Exception ? 10 : 34);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var5 == 0) {
                                statePc = 17;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 16 : 34);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 16 : 34);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 6;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 16 : 34);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = 24;
                            stackOut_17_1 = var3_int;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (stackIn_18_0 > stackIn_18_1) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 20 : 34);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 20 : 34);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof Exception ? 22 : 34);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            var4 = 0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2[var4] = (byte) -1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 27 : 34);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var5 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof Exception ? 27 : 34);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            param0.a(24, -97, var2, 0);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (param1) {
                                statePc = 40;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof Exception ? 32 : 34);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            field_t = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof Exception ? 32 : 34);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = (RuntimeException) runtimeException;
                            stackOut_35_1 = new StringBuilder().append("wh.IA(");
                            stackIn_38_0 = stackOut_35_0;
                            stackIn_38_1 = stackOut_35_1;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            if (param0 == null) {
                                statePc = 38;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                            stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                            stackOut_36_2 = "{...}";
                            stackIn_39_0 = stackOut_36_0;
                            stackIn_39_1 = stackOut_36_1;
                            stackIn_39_2 = stackOut_36_2;
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 38: {
                        stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                        stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                        stackOut_38_2 = "null";
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        stackIn_39_2 = stackOut_38_2;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        throw t.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + 44 + param1 + 41);
                    }
                    case 40: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
          try {
            L0: {
              if (param0 == 5514) {
                break L0;
              } else {
                wh.f(32);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_q = null;
          field_t = null;
        }
    }

    final static boolean e(int param0) {
        RuntimeException var1 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        boolean stackOut_3_0 = false;
        try {
          if (param0 == 0) {
            return stackIn_2_0 != 0;
          } else {
            stackOut_1_0 = 0;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = cf.field_i;
          stackIn_4_0 = stackOut_3_0;
        }
        return false;
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
