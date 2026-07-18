/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class q extends java.awt.Canvas implements java.awt.event.FocusListener {
    static int[][] field_b;
    static String field_g;
    static String field_d;
    static he field_f;
    java.awt.Frame field_a;
    static nh field_e;
    static int field_c;
    volatile boolean field_h;

    final static void a(byte param0, boolean param1, boolean param2) {
        try {
            int discarded$0 = 10;
            eb.a((String) null, param1, param2);
            int var3_int = 57 / ((param0 - 23) / 43);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "q.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((q) this).field_h = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("q.focusLost(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(vj param0) {
        byte[] var2 = null;
        L0: {
          o.field_l = param0;
          var2 = re.a("members_benefits_captions,0", 125);
          if (null == var2) {
            break L0;
          } else {
            ej.field_e[0] = mj.a((byte) 26, var2);
            break L0;
          }
        }
        L1: {
          var2 = re.a("members_benefits_captions,1", 126);
          if (null == var2) {
            break L1;
          } else {
            ej.field_e[1] = mj.a((byte) 86, var2);
            break L1;
          }
        }
        L2: {
          var2 = re.a("members_benefits_captions,2", 122);
          if (null == var2) {
            break L2;
          } else {
            ej.field_e[2] = mj.a((byte) 38, var2);
            break L2;
          }
        }
        L3: {
          var2 = re.a("members_benefits_captions,3", 125);
          if (null != var2) {
            ej.field_e[3] = mj.a((byte) -102, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = re.a("members_benefits_captions,4", 126);
          if (null == var2) {
            break L4;
          } else {
            ej.field_e[4] = mj.a((byte) -19, var2);
            break L4;
          }
        }
        L5: {
          var2 = re.a("members_benefits_captions,5", 124);
          if (null != var2) {
            ej.field_e[5] = mj.a((byte) 5, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          var2 = re.a("members_benefits_captions,6", 122);
          if (null != var2) {
            ej.field_e[6] = mj.a((byte) -108, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = re.a("members_benefits_captions,7", 122);
          if (var2 != null) {
            ej.field_e[7] = mj.a((byte) 101, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = re.a("WORLD_TEXT,0", 125);
          if (var2 != null) {
            fj.field_i[0] = mj.a((byte) -128, var2);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = re.a("WORLD_TEXT,1", 126);
          if (null != var2) {
            fj.field_i[1] = mj.a((byte) -117, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = re.a("WORLD_TEXT,2", 124);
          if (null != var2) {
            fj.field_i[2] = mj.a((byte) 112, var2);
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          var2 = re.a("WORLD_TEXT,3", 126);
          if (null == var2) {
            break L11;
          } else {
            fj.field_i[3] = mj.a((byte) -2, var2);
            break L11;
          }
        }
        L12: {
          var2 = re.a("WORLD_TEXT,4", 122);
          if (null != var2) {
            fj.field_i[4] = mj.a((byte) -6, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = re.a("WORLD_TEXT,5", 124);
          if (null == var2) {
            break L13;
          } else {
            fj.field_i[5] = mj.a((byte) -102, var2);
            break L13;
          }
        }
        L14: {
          var2 = re.a("WORLD_TEXT,6", 123);
          if (null != var2) {
            fj.field_i[6] = mj.a((byte) -103, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = re.a("WORLD_TEXT,7", 125);
          if (var2 != null) {
            fj.field_i[7] = mj.a((byte) 85, var2);
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          var2 = re.a("WORLD_TEXT,8", 122);
          if (var2 != null) {
            fj.field_i[8] = mj.a((byte) -107, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = re.a("LEVEL_SELECT_NAMES,0", 127);
          if (null == var2) {
            break L17;
          } else {
            tc.field_b[0] = mj.a((byte) 106, var2);
            break L17;
          }
        }
        L18: {
          var2 = re.a("LEVEL_SELECT_NAMES,1", 123);
          if (null == var2) {
            break L18;
          } else {
            tc.field_b[1] = mj.a((byte) 109, var2);
            break L18;
          }
        }
        L19: {
          var2 = re.a("LEVEL_SELECT_NAMES,2", 126);
          if (null == var2) {
            break L19;
          } else {
            tc.field_b[2] = mj.a((byte) 38, var2);
            break L19;
          }
        }
        L20: {
          var2 = re.a("LEVEL_SELECT_NAMES,3", 127);
          if (null != var2) {
            tc.field_b[3] = mj.a((byte) 127, var2);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = re.a("LEVEL_SELECT_NAMES,4", 124);
          if (null == var2) {
            break L21;
          } else {
            tc.field_b[4] = mj.a((byte) -109, var2);
            break L21;
          }
        }
        L22: {
          var2 = re.a("LEVEL_SELECT_NAMES,5", 122);
          if (var2 == null) {
            break L22;
          } else {
            tc.field_b[5] = mj.a((byte) -108, var2);
            break L22;
          }
        }
        L23: {
          var2 = re.a("LEVEL_SELECT_NAMES,6", 125);
          if (null != var2) {
            tc.field_b[6] = mj.a((byte) -96, var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = re.a("LEVEL_SELECT_NAMES,7", 126);
          if (var2 == null) {
            break L24;
          } else {
            tc.field_b[7] = mj.a((byte) 115, var2);
            break L24;
          }
        }
        L25: {
          var2 = re.a("LEVEL_SELECT_NAMES,8", 124);
          if (null != var2) {
            tc.field_b[8] = mj.a((byte) 16, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = re.a("LEVEL_SELECT_DESC,0", 127);
          if (var2 == null) {
            break L26;
          } else {
            le.field_a[0] = mj.a((byte) -116, var2);
            break L26;
          }
        }
        L27: {
          var2 = re.a("LEVEL_SELECT_DESC,1", 124);
          if (null == var2) {
            break L27;
          } else {
            le.field_a[1] = mj.a((byte) -123, var2);
            break L27;
          }
        }
        L28: {
          var2 = re.a("LEVEL_SELECT_DESC,2", 125);
          if (null != var2) {
            le.field_a[2] = mj.a((byte) 110, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = re.a("LEVEL_SELECT_DESC,3", 122);
          if (null != var2) {
            le.field_a[3] = mj.a((byte) -109, var2);
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          var2 = re.a("LEVEL_SELECT_DESC,4", 125);
          if (var2 != null) {
            le.field_a[4] = mj.a((byte) -108, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = re.a("LEVEL_SELECT_DESC,5", 122);
          if (null != var2) {
            le.field_a[5] = mj.a((byte) 108, var2);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = re.a("LEVEL_SELECT_DESC,6", 127);
          if (null != var2) {
            le.field_a[6] = mj.a((byte) -3, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = re.a("LEVEL_SELECT_DESC,7", 127);
          if (null != var2) {
            le.field_a[7] = mj.a((byte) -106, var2);
            break L33;
          } else {
            break L33;
          }
        }
        L34: {
          var2 = re.a("LEVEL_SELECT_DESC,8", 126);
          if (var2 != null) {
            le.field_a[8] = mj.a((byte) -96, var2);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = re.a("HELP_TEXT,0", 122);
          if (null == var2) {
            break L35;
          } else {
            di.field_e[0] = mj.a((byte) -112, var2);
            break L35;
          }
        }
        L36: {
          var2 = re.a("HELP_TEXT,1", 124);
          if (var2 == null) {
            break L36;
          } else {
            di.field_e[1] = mj.a((byte) -125, var2);
            break L36;
          }
        }
        L37: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,0", 126);
          if (var2 == null) {
            break L37;
          } else {
            ol.field_i[0] = mj.a((byte) -126, var2);
            break L37;
          }
        }
        L38: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,1", 127);
          if (null != var2) {
            ol.field_i[1] = mj.a((byte) -98, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,2", 127);
          if (null == var2) {
            break L39;
          } else {
            ol.field_i[2] = mj.a((byte) -114, var2);
            break L39;
          }
        }
        L40: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,3", 125);
          if (var2 == null) {
            break L40;
          } else {
            ol.field_i[3] = mj.a((byte) -127, var2);
            break L40;
          }
        }
        L41: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,4", 123);
          if (var2 != null) {
            ol.field_i[4] = mj.a((byte) 75, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = re.a("SHORT_TUTORIAL_TEXT,5", 123);
          if (null == var2) {
            break L42;
          } else {
            ol.field_i[5] = mj.a((byte) -112, var2);
            break L42;
          }
        }
        L43: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,0", 123);
          if (var2 != null) {
            mg.field_a[0][0] = mj.a((byte) 15, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,1", 122);
          if (var2 == null) {
            break L44;
          } else {
            mg.field_a[0][1] = mj.a((byte) -119, var2);
            break L44;
          }
        }
        L45: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,2", 124);
          if (null == var2) {
            break L45;
          } else {
            mg.field_a[0][2] = mj.a((byte) -109, var2);
            break L45;
          }
        }
        L46: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,3", 123);
          if (null != var2) {
            mg.field_a[0][3] = mj.a((byte) -4, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,4", 126);
          if (var2 == null) {
            break L47;
          } else {
            mg.field_a[0][4] = mj.a((byte) 74, var2);
            break L47;
          }
        }
        L48: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,5", 125);
          if (null != var2) {
            mg.field_a[0][5] = mj.a((byte) 2, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,6", 126);
          if (var2 == null) {
            break L49;
          } else {
            mg.field_a[0][6] = mj.a((byte) -105, var2);
            break L49;
          }
        }
        L50: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,0,7", 126);
          if (null == var2) {
            break L50;
          } else {
            mg.field_a[0][7] = mj.a((byte) -122, var2);
            break L50;
          }
        }
        L51: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,1,0", 127);
          if (null != var2) {
            mg.field_a[1][0] = mj.a((byte) -100, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,2,0", 122);
          if (var2 == null) {
            break L52;
          } else {
            mg.field_a[2][0] = mj.a((byte) -105, var2);
            break L52;
          }
        }
        L53: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,3,0", 123);
          if (var2 == null) {
            break L53;
          } else {
            mg.field_a[3][0] = mj.a((byte) -105, var2);
            break L53;
          }
        }
        L54: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,3,1", 123);
          if (null != var2) {
            mg.field_a[3][1] = mj.a((byte) 26, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,3,2", 122);
          if (var2 == null) {
            break L55;
          } else {
            mg.field_a[3][2] = mj.a((byte) 76, var2);
            break L55;
          }
        }
        L56: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,4,0", 124);
          if (var2 != null) {
            mg.field_a[4][0] = mj.a((byte) -119, var2);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,5,0", 125);
          if (var2 != null) {
            mg.field_a[5][0] = mj.a((byte) -126, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,6,0", 125);
          if (null != var2) {
            mg.field_a[6][0] = mj.a((byte) 94, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,6,1", 123);
          if (null == var2) {
            break L59;
          } else {
            mg.field_a[6][1] = mj.a((byte) 121, var2);
            break L59;
          }
        }
        L60: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,6,2", 127);
          if (var2 == null) {
            break L60;
          } else {
            mg.field_a[6][2] = mj.a((byte) 20, var2);
            break L60;
          }
        }
        L61: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,7,0", 126);
          if (null != var2) {
            mg.field_a[7][0] = mj.a((byte) -95, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = re.a("INTRO_SEQUENCE_TEXT,8,0", 123);
          if (null == var2) {
            break L62;
          } else {
            mg.field_a[8][0] = mj.a((byte) -20, var2);
            break L62;
          }
        }
        L63: {
          var2 = re.a("LEVEL_COMPLETE_TEXT", 124);
          if (null != var2) {
            vh.field_d = mj.a((byte) -106, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = re.a("LEVEL_COMPLETE_SCORE_TOTAL", 124);
          if (var2 != null) {
            sa.field_g = mj.a((byte) -100, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = re.a("HUMAN_SURVIVAL_BONUS_SCORE", 127);
          if (null != var2) {
            kh.field_o = mj.a((byte) 85, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = re.a("HUMAN_SURVIVAL_BONUS_X_OF_Y", 124);
          if (null == var2) {
            break L66;
          } else {
            af.field_c = mj.a((byte) -97, var2);
            break L66;
          }
        }
        L67: {
          var2 = re.a("HUMAN_SURVIVAL_BONUS_BUILDINGS", 126);
          if (var2 != null) {
            l.field_h = mj.a((byte) -22, var2);
            break L67;
          } else {
            break L67;
          }
        }
        L68: {
          var2 = re.a("LEVEL_COMPLETE_PRESS_ANY_KEY_TO_CONTINUE", 124);
          if (null == var2) {
            break L68;
          } else {
            bj.field_b = mj.a((byte) 12, var2);
            break L68;
          }
        }
        var2 = re.a("NEWGAME", 123);
        L69: {
          if (null != var2) {
            gf.field_s = mj.a((byte) 123, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = re.a("FULLSCREEN", 122);
          if (var2 != null) {
            ij.field_c = mj.a((byte) -107, var2);
            break L70;
          } else {
            break L70;
          }
        }
        L71: {
          var2 = re.a("SOUND", 123);
          if (var2 == null) {
            break L71;
          } else {
            sh.field_d = mj.a((byte) -105, var2);
            break L71;
          }
        }
        L72: {
          var2 = re.a("MUSIC", 124);
          if (var2 == null) {
            break L72;
          } else {
            hj.field_a = mj.a((byte) -6, var2);
            break L72;
          }
        }
        L73: {
          var2 = re.a("CONTINUE", 123);
          if (var2 != null) {
            ja.field_f = mj.a((byte) 43, var2);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = re.a("DIFFICULTY", 122);
          if (null == var2) {
            break L74;
          } else {
            vi.field_d = mj.a((byte) 66, var2);
            break L74;
          }
        }
        L75: {
          var2 = re.a("BLANK", 124);
          if (null == var2) {
            break L75;
          } else {
            rk.field_f = mj.a((byte) -21, var2);
            break L75;
          }
        }
        L76: {
          var2 = re.a("FASTEST", 123);
          if (null != var2) {
            we.field_h = mj.a((byte) -107, var2);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = re.a("MEDIUM", 126);
          if (var2 != null) {
            ik.field_h = mj.a((byte) -94, var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = re.a("BEST", 125);
          if (null != var2) {
            v.field_U = mj.a((byte) 26, var2);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = re.a("DIFF_EASY", 127);
          if (null != var2) {
            mj.field_t = mj.a((byte) 20, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = re.a("DIFF_MEDIUM", 125);
          if (null == var2) {
            break L80;
          } else {
            n.field_f = mj.a((byte) 26, var2);
            break L80;
          }
        }
        L81: {
          var2 = re.a("DIFF_HARD", 124);
          if (null != var2) {
            hb.field_m = mj.a((byte) -112, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = re.a("achievement_names,0", 123);
          if (null != var2) {
            sc.field_b[0] = mj.a((byte) 109, var2);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = re.a("achievement_names,1", 122);
          if (var2 != null) {
            sc.field_b[1] = mj.a((byte) -111, var2);
            break L83;
          } else {
            break L83;
          }
        }
        L84: {
          var2 = re.a("achievement_names,2", 123);
          if (var2 != null) {
            sc.field_b[2] = mj.a((byte) -123, var2);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = re.a("achievement_names,3", 122);
          if (var2 == null) {
            break L85;
          } else {
            sc.field_b[3] = mj.a((byte) 32, var2);
            break L85;
          }
        }
        L86: {
          var2 = re.a("achievement_names,4", 127);
          if (var2 != null) {
            sc.field_b[4] = mj.a((byte) -98, var2);
            break L86;
          } else {
            break L86;
          }
        }
        L87: {
          var2 = re.a("achievement_names,5", 126);
          if (null != var2) {
            sc.field_b[5] = mj.a((byte) -123, var2);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = re.a("achievement_names,6", 124);
          if (null != var2) {
            sc.field_b[6] = mj.a((byte) -109, var2);
            break L88;
          } else {
            break L88;
          }
        }
        L89: {
          var2 = re.a("achievement_names,7", 124);
          if (null != var2) {
            sc.field_b[7] = mj.a((byte) -108, var2);
            break L89;
          } else {
            break L89;
          }
        }
        L90: {
          var2 = re.a("achievement_names,8", 125);
          if (null != var2) {
            sc.field_b[8] = mj.a((byte) -120, var2);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          var2 = re.a("achievement_names,9", 127);
          if (null != var2) {
            sc.field_b[9] = mj.a((byte) -1, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = re.a("achievement_names,10", 124);
          if (var2 != null) {
            sc.field_b[10] = mj.a((byte) -97, var2);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = re.a("achievement_names,11", 126);
          if (var2 == null) {
            break L93;
          } else {
            sc.field_b[11] = mj.a((byte) -119, var2);
            break L93;
          }
        }
        L94: {
          var2 = re.a("achievement_names,12", 127);
          if (var2 != null) {
            sc.field_b[12] = mj.a((byte) -123, var2);
            break L94;
          } else {
            break L94;
          }
        }
        L95: {
          var2 = re.a("achievement_names,13", 126);
          if (null != var2) {
            sc.field_b[13] = mj.a((byte) 113, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = re.a("achievement_names,14", 126);
          if (var2 == null) {
            break L96;
          } else {
            sc.field_b[14] = mj.a((byte) -114, var2);
            break L96;
          }
        }
        L97: {
          var2 = re.a("achievement_criteria,0", 124);
          if (var2 == null) {
            break L97;
          } else {
            jk.field_K[0] = mj.a((byte) -124, var2);
            break L97;
          }
        }
        L98: {
          var2 = re.a("achievement_criteria,1", 123);
          if (null == var2) {
            break L98;
          } else {
            jk.field_K[1] = mj.a((byte) -110, var2);
            break L98;
          }
        }
        L99: {
          var2 = re.a("achievement_criteria,2", 123);
          if (null == var2) {
            break L99;
          } else {
            jk.field_K[2] = mj.a((byte) -116, var2);
            break L99;
          }
        }
        L100: {
          var2 = re.a("achievement_criteria,3", 126);
          if (var2 == null) {
            break L100;
          } else {
            jk.field_K[3] = mj.a((byte) -95, var2);
            break L100;
          }
        }
        L101: {
          var2 = re.a("achievement_criteria,4", 124);
          if (null != var2) {
            jk.field_K[4] = mj.a((byte) -113, var2);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = re.a("achievement_criteria,5", 127);
          if (null != var2) {
            jk.field_K[5] = mj.a((byte) -116, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = re.a("achievement_criteria,6", 123);
          if (null == var2) {
            break L103;
          } else {
            jk.field_K[6] = mj.a((byte) 115, var2);
            break L103;
          }
        }
        L104: {
          var2 = re.a("achievement_criteria,7", 126);
          if (null != var2) {
            jk.field_K[7] = mj.a((byte) -9, var2);
            break L104;
          } else {
            break L104;
          }
        }
        L105: {
          var2 = re.a("achievement_criteria,8", 124);
          if (var2 == null) {
            break L105;
          } else {
            jk.field_K[8] = mj.a((byte) -109, var2);
            break L105;
          }
        }
        L106: {
          var2 = re.a("achievement_criteria,9", 125);
          if (var2 == null) {
            break L106;
          } else {
            jk.field_K[9] = mj.a((byte) -3, var2);
            break L106;
          }
        }
        L107: {
          var2 = re.a("achievement_criteria,10", 124);
          if (null != var2) {
            jk.field_K[10] = mj.a((byte) -118, var2);
            break L107;
          } else {
            break L107;
          }
        }
        L108: {
          var2 = re.a("achievement_criteria,11", 125);
          if (var2 != null) {
            jk.field_K[11] = mj.a((byte) 32, var2);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = re.a("achievement_criteria,12", 126);
          if (null == var2) {
            break L109;
          } else {
            jk.field_K[12] = mj.a((byte) -8, var2);
            break L109;
          }
        }
        L110: {
          var2 = re.a("achievement_criteria,13", 124);
          if (var2 != null) {
            jk.field_K[13] = mj.a((byte) 69, var2);
            break L110;
          } else {
            break L110;
          }
        }
        L111: {
          var2 = re.a("achievement_criteria,14", 124);
          if (var2 == null) {
            break L111;
          } else {
            jk.field_K[14] = mj.a((byte) -107, var2);
            break L111;
          }
        }
        L112: {
          var2 = re.a("GAME_NAME_JSTRING", 125);
          if (null == var2) {
            break L112;
          } else {
            ml.field_j = mj.a((byte) -105, var2);
            break L112;
          }
        }
        L113: {
          var2 = re.a("WEAPON_UNAVAILABLE_INDICATOR_TEXT", 123);
          if (var2 == null) {
            break L113;
          } else {
            na.field_b = mj.a((byte) 13, var2);
            break L113;
          }
        }
        L114: {
          var2 = re.a("GET_READY", 123);
          if (null != var2) {
            a.field_f = mj.a((byte) -109, var2);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          var2 = re.a("LEVEL", 127);
          if (var2 == null) {
            break L115;
          } else {
            uf.field_d = mj.a((byte) 9, var2);
            break L115;
          }
        }
        L116: {
          var2 = re.a("WORLD_STAGE", 127);
          if (null == var2) {
            break L116;
          } else {
            ek.field_q = mj.a((byte) -111, var2);
            break L116;
          }
        }
        L117: {
          var2 = re.a("INSTRUCTIONS_FIRE", 125);
          if (null != var2) {
            hd.field_O = mj.a((byte) 80, var2);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          var2 = re.a("INSTRUCTIONS_SELECT_WEAPON", 126);
          if (null == var2) {
            break L118;
          } else {
            ch.field_w = mj.a((byte) -106, var2);
            break L118;
          }
        }
        L119: {
          var2 = re.a("INSTRUCTIONS_CYCLE_WEAPON", 127);
          if (var2 != null) {
            mk.field_a = mj.a((byte) 115, var2);
            break L119;
          } else {
            break L119;
          }
        }
        L120: {
          var2 = re.a("INSTRUCTIONS_CHARGE_CANNON", 124);
          if (null == var2) {
            break L120;
          } else {
            hj.field_c = mj.a((byte) 63, var2);
            break L120;
          }
        }
        L121: {
          var2 = re.a("INSTRUCTIONS_MOVE_SHIP", 125);
          if (var2 == null) {
            break L121;
          } else {
            fm.field_c = mj.a((byte) 87, var2);
            break L121;
          }
        }
        L122: {
          var2 = re.a("LEVEL_NAME_UNKNOWN", 124);
          if (null != var2) {
            s.field_f = mj.a((byte) -112, var2);
            break L122;
          } else {
            break L122;
          }
        }
        L123: {
          var2 = re.a("LEVEL_NAME_MEMBERS_ONLY", 123);
          if (null != var2) {
            s.field_h = mj.a((byte) 77, var2);
            break L123;
          } else {
            break L123;
          }
        }
        L124: {
          var2 = re.a("LEVEL_NAME_NOT_REACHED", 122);
          if (null == var2) {
            break L124;
          } else {
            pe.field_i = mj.a((byte) -121, var2);
            break L124;
          }
        }
        L125: {
          var2 = re.a("LEVEL_CLICK_TO_START", 125);
          if (var2 != null) {
            af.field_a = mj.a((byte) -14, var2);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = re.a("LEVEL_SELECT_WORLD", 122);
          if (var2 != null) {
            String discarded$2 = mj.a((byte) -19, var2);
            break L126;
          } else {
            break L126;
          }
        }
        L127: {
          var2 = re.a("LEVEL_SELECT_STAGE", 126);
          if (null == var2) {
            break L127;
          } else {
            String discarded$3 = mj.a((byte) -121, var2);
            break L127;
          }
        }
        L128: {
          var2 = re.a("LEVEL_MOUSEOVER_TO_SELECT", 122);
          if (var2 != null) {
            aj.field_f = mj.a((byte) -13, var2);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = re.a("LOGIN_OR_CREATE_FREE_ACCOUNT", 122);
          if (var2 != null) {
            ph.field_i = mj.a((byte) -96, var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = re.a("INVITE_LOGIN_ALT_CLICK", 126);
          if (var2 == null) {
            break L130;
          } else {
            gd.field_e = mj.a((byte) -115, var2);
            break L130;
          }
        }
        L131: {
          var2 = re.a("keycode_gun", 125);
          if (null != var2) {
            em.field_e = 255 & var2[0];
            break L131;
          } else {
            break L131;
          }
        }
        L132: {
          var2 = re.a("keycode_bomb", 125);
          if (var2 == null) {
            break L132;
          } else {
            lb.field_A = 255 & var2[0];
            break L132;
          }
        }
        L133: {
          var2 = re.a("keycode_coil", 122);
          if (var2 != null) {
            vd.field_f = 255 & var2[0];
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = re.a("keycode_missile", 122);
          if (var2 == null) {
            break L134;
          } else {
            lf.field_c = var2[0] & 255;
            break L134;
          }
        }
        L135: {
          var2 = re.a("keycode_alternate_megacannon", 122);
          if (null == var2) {
            break L135;
          } else {
            nj.field_a = 255 & var2[0];
            break L135;
          }
        }
        o.field_l = null;
    }

    final void a(bl param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1) {
              ce.a(param0, ((q) this).field_a, (byte) -104);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("q.A(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, od param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            param4.c(12, (byte) -89);
            param4.c(17, -17402);
            param4.c(param0, -17402);
            param4.c(param1, -17402);
            param4.c(param3, (byte) -126);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("q.E(").append(param0).append(',').append(param1).append(',').append(26800).append(',').append(param3).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param4 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
    }

    public final void paint(java.awt.Graphics param0) {
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_f = null;
            field_b = null;
            field_e = null;
            field_g = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "q.B(" + 25270 + ')');
        }
    }

    q() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Instructions";
        field_g = "That name is not available";
    }
}
