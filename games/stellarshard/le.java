/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le extends gg {
    static String field_l;
    static int field_k;
    static String field_q;
    static sk field_n;
    int field_o;
    byte[] field_p;
    static int[] field_m;

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -31) {
                break L1;
              } else {
                le.a(43);
                break L1;
              }
            }
            field_l = null;
            field_n = null;
            field_m = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "le.A(" + param0 + 41);
        }
    }

    private le() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var1, "le.<init>()");
        }
    }

    final static void a(pf param0, int param1) {
        byte[] var2 = null;
        L0: {
          b.field_u = param0;
          var2 = mh.a(false, "achievement_names,0");
          if (null != var2) {
            rc.field_e[0] = se.a(0, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = mh.a(false, "achievement_names,1");
          if (var2 != null) {
            rc.field_e[1] = se.a(0, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = mh.a(false, "achievement_names,2");
          if (var2 == null) {
            break L2;
          } else {
            rc.field_e[2] = se.a(0, var2);
            break L2;
          }
        }
        L3: {
          var2 = mh.a(false, "achievement_names,3");
          if (null == var2) {
            break L3;
          } else {
            rc.field_e[3] = se.a(ih.a(param1, 26949), var2);
            break L3;
          }
        }
        L4: {
          var2 = mh.a(false, "achievement_names,4");
          if (null != var2) {
            rc.field_e[4] = se.a(param1 + -26949, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = mh.a(false, "achievement_names,5");
          if (var2 == null) {
            break L5;
          } else {
            rc.field_e[5] = se.a(0, var2);
            break L5;
          }
        }
        L6: {
          var2 = mh.a(false, "achievement_names,6");
          if (null == var2) {
            break L6;
          } else {
            rc.field_e[6] = se.a(0, var2);
            break L6;
          }
        }
        L7: {
          var2 = mh.a(false, "achievement_names,7");
          if (null != var2) {
            rc.field_e[7] = se.a(0, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = mh.a(false, "achievement_names,8");
          if (null != var2) {
            rc.field_e[8] = se.a(0, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = mh.a(false, "achievement_names,9");
          if (null == var2) {
            break L9;
          } else {
            rc.field_e[9] = se.a(0, var2);
            break L9;
          }
        }
        L10: {
          var2 = mh.a(false, "achievement_names,10");
          if (var2 != null) {
            rc.field_e[10] = se.a(0, var2);
            break L10;
          } else {
            break L10;
          }
        }
        var2 = mh.a(false, "achievement_names,11");
        if (param1 == 26949) {
          L11: {
            if (null == var2) {
              break L11;
            } else {
              rc.field_e[11] = se.a(0, var2);
              break L11;
            }
          }
          L12: {
            var2 = mh.a(false, "achievement_names,12");
            if (var2 != null) {
              rc.field_e[12] = se.a(param1 + -26949, var2);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            var2 = mh.a(false, "achievement_names,13");
            if (var2 != null) {
              rc.field_e[13] = se.a(0, var2);
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            var2 = mh.a(false, "achievement_criteria,0");
            if (null != var2) {
              hc.field_t[0] = se.a(param1 + -26949, var2);
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            var2 = mh.a(false, "achievement_criteria,1");
            if (null != var2) {
              hc.field_t[1] = se.a(0, var2);
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            var2 = mh.a(false, "achievement_criteria,2");
            if (var2 != null) {
              hc.field_t[2] = se.a(ih.a(param1, 26949), var2);
              break L16;
            } else {
              break L16;
            }
          }
          L17: {
            var2 = mh.a(false, "achievement_criteria,3");
            if (var2 != null) {
              hc.field_t[3] = se.a(ih.a(param1, 26949), var2);
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            var2 = mh.a(false, "achievement_criteria,4");
            if (var2 != null) {
              hc.field_t[4] = se.a(ih.a(param1, 26949), var2);
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            var2 = mh.a(false, "achievement_criteria,5");
            if (var2 == null) {
              break L19;
            } else {
              hc.field_t[5] = se.a(0, var2);
              break L19;
            }
          }
          L20: {
            var2 = mh.a(false, "achievement_criteria,6");
            if (null == var2) {
              break L20;
            } else {
              hc.field_t[6] = se.a(0, var2);
              break L20;
            }
          }
          L21: {
            var2 = mh.a(false, "achievement_criteria,7");
            if (var2 == null) {
              break L21;
            } else {
              hc.field_t[7] = se.a(param1 + -26949, var2);
              break L21;
            }
          }
          L22: {
            var2 = mh.a(false, "achievement_criteria,8");
            if (var2 == null) {
              break L22;
            } else {
              hc.field_t[8] = se.a(0, var2);
              break L22;
            }
          }
          L23: {
            var2 = mh.a(false, "achievement_criteria,9");
            if (var2 != null) {
              hc.field_t[9] = se.a(0, var2);
              break L23;
            } else {
              break L23;
            }
          }
          L24: {
            var2 = mh.a(false, "achievement_criteria,10");
            if (var2 == null) {
              break L24;
            } else {
              hc.field_t[10] = se.a(param1 + -26949, var2);
              break L24;
            }
          }
          L25: {
            var2 = mh.a(false, "achievement_criteria,11");
            if (var2 != null) {
              hc.field_t[11] = se.a(param1 + -26949, var2);
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            var2 = mh.a(false, "achievement_criteria,12");
            if (null != var2) {
              hc.field_t[12] = se.a(param1 + -26949, var2);
              break L26;
            } else {
              break L26;
            }
          }
          L27: {
            var2 = mh.a(false, "achievement_criteria,13");
            if (var2 != null) {
              hc.field_t[13] = se.a(0, var2);
              break L27;
            } else {
              break L27;
            }
          }
          L28: {
            var2 = mh.a(false, "levelcolonno");
            if (null == var2) {
              break L28;
            } else {
              hh.field_d = se.a(0, var2);
              break L28;
            }
          }
          L29: {
            var2 = mh.a(false, "gravitywell");
            if (var2 != null) {
              jf.field_l = se.a(0, var2);
              break L29;
            } else {
              break L29;
            }
          }
          L30: {
            var2 = mh.a(false, "splitsinto4");
            if (null != var2) {
              hc.field_h = se.a(0, var2);
              break L30;
            } else {
              break L30;
            }
          }
          L31: {
            var2 = mh.a(false, "shootsround");
            if (null != var2) {
              he.field_k = se.a(0, var2);
              break L31;
            } else {
              break L31;
            }
          }
          L32: {
            var2 = mh.a(false, "shoots");
            if (null == var2) {
              break L32;
            } else {
              mc.field_b = se.a(param1 + -26949, var2);
              break L32;
            }
          }
          L33: {
            var2 = mh.a(false, "homesin");
            if (null != var2) {
              ci.field_d = se.a(param1 ^ 26949, var2);
              break L33;
            } else {
              break L33;
            }
          }
          L34: {
            var2 = mh.a(false, "collectme");
            if (var2 != null) {
              cd.field_P = se.a(param1 + -26949, var2);
              break L34;
            } else {
              break L34;
            }
          }
          L35: {
            var2 = mh.a(false, "musoff");
            if (null == var2) {
              break L35;
            } else {
              rc.field_f = se.a(0, var2);
              break L35;
            }
          }
          L36: {
            var2 = mh.a(false, "musicspaces");
            if (null != var2) {
              fe.field_f = se.a(param1 ^ 26949, var2);
              break L36;
            } else {
              break L36;
            }
          }
          L37: {
            var2 = mh.a(false, "sndoff");
            if (var2 == null) {
              break L37;
            } else {
              ch.field_d = se.a(param1 ^ 26949, var2);
              break L37;
            }
          }
          L38: {
            var2 = mh.a(false, "soundspaces");
            if (var2 != null) {
              eh.field_b = se.a(0, var2);
              break L38;
            } else {
              break L38;
            }
          }
          L39: {
            var2 = mh.a(false, "levelspaces");
            if (null == var2) {
              break L39;
            } else {
              qf.field_f = se.a(0, var2);
              break L39;
            }
          }
          L40: {
            var2 = mh.a(false, "startlevel");
            if (var2 != null) {
              kf.field_c = se.a(0, var2);
              break L40;
            } else {
              break L40;
            }
          }
          L41: {
            var2 = mh.a(false, "fsoff");
            if (null != var2) {
              gf.field_b = se.a(0, var2);
              break L41;
            } else {
              break L41;
            }
          }
          L42: {
            var2 = mh.a(false, "achievecaps");
            if (var2 == null) {
              break L42;
            } else {
              String discarded$4 = se.a(param1 + -26949, var2);
              break L42;
            }
          }
          L43: {
            var2 = mh.a(false, "achievethisgame");
            if (var2 != null) {
              String discarded$5 = se.a(param1 + -26949, var2);
              break L43;
            } else {
              break L43;
            }
          }
          L44: {
            var2 = mh.a(false, "pleasewaitforhs");
            if (null == var2) {
              break L44;
            } else {
              wk.field_g = se.a(0, var2);
              break L44;
            }
          }
          L45: {
            var2 = mh.a(false, "lastscorecolon");
            if (var2 == null) {
              break L45;
            } else {
              vg.field_s = se.a(0, var2);
              break L45;
            }
          }
          L46: {
            var2 = mh.a(false, "highscorecaps");
            if (null == var2) {
              break L46;
            } else {
              String discarded$6 = se.a(0, var2);
              break L46;
            }
          }
          L47: {
            var2 = mh.a(false, "controls");
            if (null != var2) {
              cm.field_e = se.a(param1 ^ 26949, var2);
              break L47;
            } else {
              break L47;
            }
          }
          L48: {
            var2 = mh.a(false, "turnship");
            if (null != var2) {
              nb.field_N = se.a(0, var2);
              break L48;
            } else {
              break L48;
            }
          }
          L49: {
            var2 = mh.a(false, "megalaser");
            if (null == var2) {
              break L49;
            } else {
              rd.field_b = se.a(param1 + -26949, var2);
              break L49;
            }
          }
          L50: {
            var2 = mh.a(false, "lightninggun");
            if (null != var2) {
              ja.field_k = se.a(0, var2);
              break L50;
            } else {
              break L50;
            }
          }
          L51: {
            var2 = mh.a(false, "flamecannon");
            if (null != var2) {
              nb.field_O = se.a(param1 ^ 26949, var2);
              break L51;
            } else {
              break L51;
            }
          }
          L52: {
            var2 = mh.a(false, "phoenixdevice");
            if (null != var2) {
              wg.field_e = se.a(0, var2);
              break L52;
            } else {
              break L52;
            }
          }
          L53: {
            var2 = mh.a(false, "invunerability");
            if (var2 == null) {
              break L53;
            } else {
              fc.field_c = se.a(param1 + -26949, var2);
              break L53;
            }
          }
          L54: {
            var2 = mh.a(false, "phaseshield");
            if (var2 == null) {
              break L54;
            } else {
              ha.field_x = se.a(0, var2);
              break L54;
            }
          }
          L55: {
            var2 = mh.a(false, "nuke");
            if (null != var2) {
              te.field_b = se.a(0, var2);
              break L55;
            } else {
              break L55;
            }
          }
          L56: {
            var2 = mh.a(false, "shipshield");
            if (null == var2) {
              break L56;
            } else {
              pe.field_a = se.a(0, var2);
              break L56;
            }
          }
          L57: {
            var2 = mh.a(false, "supercannon");
            if (var2 != null) {
              we.field_e = se.a(0, var2);
              break L57;
            } else {
              break L57;
            }
          }
          L58: {
            var2 = mh.a(false, "ioncannon");
            if (var2 == null) {
              break L58;
            } else {
              qh.field_h = se.a(0, var2);
              break L58;
            }
          }
          L59: {
            var2 = mh.a(false, "wavegun");
            if (var2 != null) {
              nl.field_f = se.a(0, var2);
              break L59;
            } else {
              break L59;
            }
          }
          L60: {
            var2 = mh.a(false, "laser");
            if (var2 == null) {
              break L60;
            } else {
              td.field_e = se.a(0, var2);
              break L60;
            }
          }
          L61: {
            var2 = mh.a(false, "heavycannon");
            if (null == var2) {
              break L61;
            } else {
              he.field_l = se.a(0, var2);
              break L61;
            }
          }
          L62: {
            var2 = mh.a(false, "bouncegun");
            if (null == var2) {
              break L62;
            } else {
              ka.field_l = se.a(0, var2);
              break L62;
            }
          }
          L63: {
            var2 = mh.a(false, "iongun");
            if (var2 != null) {
              gf.field_a = se.a(0, var2);
              break L63;
            } else {
              break L63;
            }
          }
          L64: {
            var2 = mh.a(false, "trigun");
            if (null != var2) {
              ei.field_A = se.a(0, var2);
              break L64;
            } else {
              break L64;
            }
          }
          L65: {
            var2 = mh.a(false, "instruct2");
            if (null != var2) {
              pl.field_V = se.a(0, var2);
              break L65;
            } else {
              break L65;
            }
          }
          L66: {
            var2 = mh.a(false, "instruct1");
            if (var2 != null) {
              hj.field_c = se.a(0, var2);
              break L66;
            } else {
              break L66;
            }
          }
          L67: {
            var2 = mh.a(false, "instruct0");
            if (null == var2) {
              break L67;
            } else {
              be.field_a = se.a(0, var2);
              break L67;
            }
          }
          L68: {
            var2 = mh.a(false, "instructionscaps");
            if (var2 == null) {
              break L68;
            } else {
              String discarded$7 = se.a(0, var2);
              break L68;
            }
          }
          L69: {
            var2 = mh.a(false, "currentscore");
            if (var2 != null) {
              wc.field_l = se.a(0, var2);
              break L69;
            } else {
              break L69;
            }
          }
          L70: {
            var2 = mh.a(false, "currentlevel");
            if (null != var2) {
              sg.field_d = se.a(param1 ^ 26949, var2);
              break L70;
            } else {
              break L70;
            }
          }
          L71: {
            var2 = mh.a(false, "continuegame");
            if (var2 == null) {
              break L71;
            } else {
              dj.field_c = se.a(0, var2);
              break L71;
            }
          }
          L72: {
            var2 = mh.a(false, "gameending");
            if (var2 == null) {
              break L72;
            } else {
              hf.field_g = se.a(0, var2);
              break L72;
            }
          }
          L73: {
            var2 = mh.a(false, "congrats");
            if (var2 == null) {
              break L73;
            } else {
              lk.field_g = se.a(0, var2);
              break L73;
            }
          }
          L74: {
            var2 = mh.a(false, "secs");
            if (null != var2) {
              ef.field_o = se.a(0, var2);
              break L74;
            } else {
              break L74;
            }
          }
          L75: {
            var2 = mh.a(false, "freegameend");
            if (var2 == null) {
              break L75;
            } else {
              dd.field_i = se.a(param1 ^ 26949, var2);
              break L75;
            }
          }
          L76: {
            var2 = mh.a(false, "helpthang");
            if (null == var2) {
              break L76;
            } else {
              ah.field_k = se.a(0, var2);
              break L76;
            }
          }
          L77: {
            var2 = mh.a(false, "scorecol");
            if (null != var2) {
              ce.field_f = se.a(param1 + -26949, var2);
              break L77;
            } else {
              break L77;
            }
          }
          L78: {
            var2 = mh.a(false, "pressesc");
            if (null != var2) {
              bb.field_f = se.a(0, var2);
              break L78;
            } else {
              break L78;
            }
          }
          L79: {
            var2 = mh.a(false, "achievcaps");
            if (var2 == null) {
              break L79;
            } else {
              te.field_a = se.a(0, var2);
              break L79;
            }
          }
          L80: {
            var2 = mh.a(false, "scancaps");
            if (var2 != null) {
              wb.field_i = se.a(0, var2);
              break L80;
            } else {
              break L80;
            }
          }
          L81: {
            var2 = mh.a(false, "anomaly_detected");
            if (var2 == null) {
              break L81;
            } else {
              nd.field_F = se.a(0, var2);
              break L81;
            }
          }
          L82: {
            var2 = mh.a(false, "captions,0");
            if (null != var2) {
              sg.field_c[0] = se.a(ih.a(param1, 26949), var2);
              break L82;
            } else {
              break L82;
            }
          }
          L83: {
            var2 = mh.a(false, "captions,1");
            if (var2 != null) {
              sg.field_c[1] = se.a(0, var2);
              break L83;
            } else {
              break L83;
            }
          }
          L84: {
            var2 = mh.a(false, "captions,2");
            if (var2 == null) {
              break L84;
            } else {
              sg.field_c[2] = se.a(param1 + -26949, var2);
              break L84;
            }
          }
          b.field_u = null;
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = null;
        field_l = "Loading fonts";
        field_m = new int[8192];
        field_q = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
