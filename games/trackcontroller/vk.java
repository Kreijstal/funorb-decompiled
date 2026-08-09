/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends fc {
    int field_l;
    static String field_i;
    int field_k;
    static int field_j;

    final static void a(int param0, kk param1) {
        RuntimeException stackIn_294_0 = null;
        StringBuilder stackIn_294_1 = null;
        RuntimeException stackIn_295_0 = null;
        StringBuilder stackIn_295_1 = null;
        String stackIn_295_2 = null;
        int stackIn_303_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              si.field_b = param1;
              var2 = gb.a("game_name", -523);
              if (null == var2) {
                break L1;
              } else {
                ta.a(32200, var2);
                break L1;
              }
            }
            L2: {
              var2 = gb.a("pauseanim", -523);
              if (var2 != null) {
                vl.field_E = ta.a(32200, var2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = gb.a("first_page", -523);
              if (var2 != null) {
                l.field_n = ta.a(param0 + 32197, var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = gb.a("next_page", -523);
              if (var2 == null) {
                break L4;
              } else {
                q.field_o = ta.a(param0 + 32197, var2);
                break L4;
              }
            }
            L5: {
              var2 = gb.a("button_pause_options", -523);
              if (var2 != null) {
                na.field_d = ta.a(param0 + 32197, var2);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2 = gb.a("button_esc_key", param0 ^ -522);
              if (null == var2) {
                break L6;
              } else {
                bl.field_d = ta.a(param0 ^ 32203, var2);
                break L6;
              }
            }
            L7: {
              var2 = gb.a("button_restart_level", -523);
              if (var2 == null) {
                break L7;
              } else {
                ca.field_d = ta.a(param0 + 32197, var2);
                break L7;
              }
            }
            L8: {
              var2 = gb.a("button_bkspc_key", -523);
              if (var2 == null) {
                break L8;
              } else {
                th.field_i = ta.a(32200, var2);
                break L8;
              }
            }
            L9: {
              var2 = gb.a("level_bonus", param0 ^ -522);
              if (null == var2) {
                break L9;
              } else {
                ob.field_o = ta.a(32200, var2);
                break L9;
              }
            }
            L10: {
              var2 = gb.a("level_bonus_doubled", param0 + -526);
              if (null != var2) {
                tc.field_e = ta.a(32200, var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2 = gb.a("hint_level3", -523);
              if (var2 == null) {
                break L11;
              } else {
                ki.field_a = ta.a(32200, var2);
                break L11;
              }
            }
            L12: {
              var2 = gb.a("hint_oops", -523);
              if (null != var2) {
                wa.field_n = ta.a(param0 ^ 32203, var2);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2 = gb.a("hint_controls", -523);
              if (null == var2) {
                break L13;
              } else {
                ej.field_b = ta.a(32200, var2);
                break L13;
              }
            }
            L14: {
              var2 = gb.a("hint_move_push", param0 ^ -522);
              if (null != var2) {
                va.field_a = ta.a(32200, var2);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              var2 = gb.a("hint_ditto", -523);
              if (param0 == 3) {
                break L15;
              } else {
                field_j = -91;
                break L15;
              }
            }
            L16: {
              if (var2 == null) {
                break L16;
              } else {
                jk.field_b = ta.a(32200, var2);
                break L16;
              }
            }
            L17: {
              var2 = gb.a("hint_finish", -523);
              if (null != var2) {
                sk.field_g = ta.a(param0 + 32197, var2);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = gb.a("hint_tooltips", param0 + -526);
              if (null != var2) {
                uk.field_d = ta.a(32200, var2);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = gb.a("continu", -523);
              if (var2 != null) {
                TrackController.field_C = ta.a(param0 ^ 32203, var2);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              var2 = gb.a("score_colon", -523);
              if (null != var2) {
                nj.field_d = ta.a(32200, var2);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = gb.a("level_value_colon", -523);
              if (null != var2) {
                ba.field_e = ta.a(32200, var2);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2 = gb.a("time_bonus_colon", param0 + -526);
              if (var2 == null) {
                break L22;
              } else {
                hb.field_c = ta.a(32200, var2);
                break L22;
              }
            }
            L23: {
              var2 = gb.a("level", -523);
              if (null == var2) {
                break L23;
              } else {
                ra.field_r = ta.a(32200, var2);
                break L23;
              }
            }
            L24: {
              var2 = gb.a("colon_space", -523);
              if (var2 == null) {
                break L24;
              } else {
                u.field_k = ta.a(32200, var2);
                break L24;
              }
            }
            L25: {
              var2 = gb.a("congratulations", -523);
              if (var2 != null) {
                pi.field_f = ta.a(32200, var2);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = gb.a("instructionLabels,0", param0 + -526);
              if (var2 == null) {
                break L26;
              } else {
                me.field_p[0] = ta.a(param0 + 32197, var2);
                break L26;
              }
            }
            L27: {
              var2 = gb.a("instructionLabels,1", -523);
              if (null != var2) {
                me.field_p[1] = ta.a(32200, var2);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = gb.a("instructionLabels,2", param0 ^ -522);
              if (var2 == null) {
                break L28;
              } else {
                me.field_p[2] = ta.a(32200, var2);
                break L28;
              }
            }
            L29: {
              var2 = gb.a("instructionLabels,3", -523);
              if (var2 == null) {
                break L29;
              } else {
                me.field_p[3] = ta.a(32200, var2);
                break L29;
              }
            }
            L30: {
              var2 = gb.a("tooltips,0", -523);
              if (null == var2) {
                break L30;
              } else {
                ag.field_c[0] = ta.a(ma.a(param0, 32203), var2);
                break L30;
              }
            }
            L31: {
              var2 = gb.a("tooltips,1", -523);
              if (null != var2) {
                ag.field_c[1] = ta.a(32200, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2 = gb.a("tooltips,2", -523);
              if (null != var2) {
                ag.field_c[2] = ta.a(32200, var2);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2 = gb.a("tooltips,3", -523);
              if (var2 == null) {
                break L33;
              } else {
                ag.field_c[3] = ta.a(ma.a(param0, 32203), var2);
                break L33;
              }
            }
            L34: {
              var2 = gb.a("tooltips,4", -523);
              if (var2 != null) {
                ag.field_c[4] = ta.a(param0 + 32197, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = gb.a("tooltips,5", param0 ^ -522);
              if (var2 == null) {
                break L35;
              } else {
                ag.field_c[5] = ta.a(32200, var2);
                break L35;
              }
            }
            L36: {
              var2 = gb.a("tooltips,6", param0 + -526);
              if (var2 != null) {
                ag.field_c[6] = ta.a(param0 + 32197, var2);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = gb.a("tooltips,7", -523);
              if (null != var2) {
                ag.field_c[7] = ta.a(ma.a(param0, 32203), var2);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = gb.a("tooltips,8", -523);
              if (var2 == null) {
                break L38;
              } else {
                ag.field_c[8] = ta.a(32200, var2);
                break L38;
              }
            }
            L39: {
              var2 = gb.a("tooltips,9", -523);
              if (var2 == null) {
                break L39;
              } else {
                ag.field_c[9] = ta.a(param0 + 32197, var2);
                break L39;
              }
            }
            L40: {
              var2 = gb.a("tooltips,10", -523);
              if (var2 == null) {
                break L40;
              } else {
                ag.field_c[10] = ta.a(32200, var2);
                break L40;
              }
            }
            L41: {
              var2 = gb.a("tooltips,11", -523);
              if (null != var2) {
                ag.field_c[11] = ta.a(32200, var2);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = gb.a("tooltips,12", -523);
              if (null != var2) {
                ag.field_c[12] = ta.a(32200, var2);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2 = gb.a("achievement_names,0", param0 + -526);
              if (null != var2) {
                wa.field_k[0] = ta.a(32200, var2);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2 = gb.a("achievement_names,1", -523);
              if (null == var2) {
                break L44;
              } else {
                wa.field_k[1] = ta.a(32200, var2);
                break L44;
              }
            }
            L45: {
              var2 = gb.a("achievement_names,2", -523);
              if (var2 != null) {
                wa.field_k[2] = ta.a(param0 + 32197, var2);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = gb.a("achievement_names,3", -523);
              if (var2 != null) {
                wa.field_k[3] = ta.a(32200, var2);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = gb.a("achievement_names,4", -523);
              if (null != var2) {
                wa.field_k[4] = ta.a(32200, var2);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2 = gb.a("achievement_names,5", -523);
              if (null == var2) {
                break L48;
              } else {
                wa.field_k[5] = ta.a(32200, var2);
                break L48;
              }
            }
            L49: {
              var2 = gb.a("achievement_names,6", -523);
              if (var2 != null) {
                wa.field_k[6] = ta.a(ma.a(param0, 32203), var2);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = gb.a("achievement_names,7", -523);
              if (null == var2) {
                break L50;
              } else {
                wa.field_k[7] = ta.a(ma.a(param0, 32203), var2);
                break L50;
              }
            }
            L51: {
              var2 = gb.a("achievement_names,8", param0 ^ -522);
              if (null == var2) {
                break L51;
              } else {
                wa.field_k[8] = ta.a(32200, var2);
                break L51;
              }
            }
            L52: {
              var2 = gb.a("achievement_names,9", -523);
              if (var2 == null) {
                break L52;
              } else {
                wa.field_k[9] = ta.a(32200, var2);
                break L52;
              }
            }
            L53: {
              var2 = gb.a("achievement_names,10", -523);
              if (var2 != null) {
                wa.field_k[10] = ta.a(32200, var2);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2 = gb.a("achievement_names,11", -523);
              if (null == var2) {
                break L54;
              } else {
                wa.field_k[11] = ta.a(32200, var2);
                break L54;
              }
            }
            L55: {
              var2 = gb.a("achievement_names,12", -523);
              if (var2 == null) {
                break L55;
              } else {
                wa.field_k[12] = ta.a(param0 + 32197, var2);
                break L55;
              }
            }
            L56: {
              var2 = gb.a("achievement_criteria,0", -523);
              if (null == var2) {
                break L56;
              } else {
                gj.field_b[0] = ta.a(32200, var2);
                break L56;
              }
            }
            L57: {
              var2 = gb.a("achievement_criteria,1", -523);
              if (var2 != null) {
                gj.field_b[1] = ta.a(param0 + 32197, var2);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var2 = gb.a("achievement_criteria,2", -523);
              if (null == var2) {
                break L58;
              } else {
                gj.field_b[2] = ta.a(32200, var2);
                break L58;
              }
            }
            L59: {
              var2 = gb.a("achievement_criteria,3", -523);
              if (null != var2) {
                gj.field_b[3] = ta.a(32200, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = gb.a("achievement_criteria,4", param0 + -526);
              if (var2 != null) {
                gj.field_b[4] = ta.a(32200, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = gb.a("achievement_criteria,5", -523);
              if (var2 != null) {
                gj.field_b[5] = ta.a(32200, var2);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2 = gb.a("achievement_criteria,6", param0 + -526);
              if (null != var2) {
                gj.field_b[6] = ta.a(32200, var2);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2 = gb.a("achievement_criteria,7", -523);
              if (var2 == null) {
                break L63;
              } else {
                gj.field_b[7] = ta.a(param0 + 32197, var2);
                break L63;
              }
            }
            L64: {
              var2 = gb.a("achievement_criteria,8", -523);
              if (var2 == null) {
                break L64;
              } else {
                gj.field_b[8] = ta.a(32200, var2);
                break L64;
              }
            }
            L65: {
              var2 = gb.a("achievement_criteria,9", -523);
              if (var2 == null) {
                break L65;
              } else {
                gj.field_b[9] = ta.a(param0 + 32197, var2);
                break L65;
              }
            }
            L66: {
              var2 = gb.a("achievement_criteria,10", param0 + -526);
              if (var2 != null) {
                gj.field_b[10] = ta.a(32200, var2);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2 = gb.a("achievement_criteria,11", param0 ^ -522);
              if (null == var2) {
                break L67;
              } else {
                gj.field_b[11] = ta.a(32200, var2);
                break L67;
              }
            }
            L68: {
              var2 = gb.a("achievement_criteria,12", -523);
              if (var2 != null) {
                gj.field_b[12] = ta.a(32200, var2);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2 = gb.a("login_register", param0 ^ -522);
              if (null != var2) {
                fc.field_a = ta.a(param0 + 32197, var2);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2 = gb.a("str_tooltips", param0 ^ -522);
              if (var2 != null) {
                ag.field_a = ta.a(32200, var2);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2 = gb.a("okay", -523);
              if (var2 == null) {
                break L71;
              } else {
                dj.field_a = ta.a(32200, var2);
                break L71;
              }
            }
            L72: {
              var2 = gb.a("all", -523);
              if (null == var2) {
                break L72;
              } else {
                mj.field_f = ta.a(param0 ^ 32203, var2);
                break L72;
              }
            }
            L73: {
              var2 = gb.a("mine", -523);
              if (null == var2) {
                break L73;
              } else {
                og.field_qb = ta.a(32200, var2);
                break L73;
              }
            }
            L74: {
              var2 = gb.a("besteach", -523);
              if (var2 == null) {
                break L74;
              } else {
                vl.field_J = ta.a(32200, var2);
                break L74;
              }
            }
            L75: {
              var2 = gb.a("showall", -523);
              if (null != var2) {
                nf.field_h = ta.a(32200, var2);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2 = gb.a("showmine", param0 ^ -522);
              if (var2 != null) {
                ka.field_e = ta.a(32200, var2);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2 = gb.a("showbesteach", -523);
              if (var2 == null) {
                break L77;
              } else {
                ag.field_g = ta.a(32200, var2);
                break L77;
              }
            }
            L78: {
              var2 = gb.a("instructions1", -523);
              if (var2 == null) {
                break L78;
              } else {
                tf.field_b = ta.a(param0 + 32197, var2);
                break L78;
              }
            }
            L79: {
              var2 = gb.a("instructions2", -523);
              if (null != var2) {
                gh.field_e = ta.a(32200, var2);
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              var2 = gb.a("congrats_free", -523);
              if (var2 == null) {
                break L80;
              } else {
                ta.a(param0 + 32197, var2);
                break L80;
              }
            }
            L81: {
              var2 = gb.a("congrats_full", -523);
              if (null == var2) {
                break L81;
              } else {
                ui.field_n = ta.a(32200, var2);
                break L81;
              }
            }
            L82: {
              var2 = gb.a("benefits_25levels", -523);
              if (var2 == null) {
                break L82;
              } else {
                ta.a(32200, var2);
                break L82;
              }
            }
            L83: {
              var2 = gb.a("unreachedlevel_custommessage", -523);
              if (var2 != null) {
                lj.field_f = ta.a(32200, var2);
                break L83;
              } else {
                break L83;
              }
            }
            si.field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L84: {
            var2_ref = decompiledCaughtException;
            stackIn_294_0 = (RuntimeException) (var2_ref);

            stackIn_294_1 = new StringBuilder().append("vk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_295_0 = (RuntimeException) ((Object) stackIn_294_0);
              stackIn_295_1 = (StringBuilder) ((Object) stackIn_294_1);
              stackIn_295_2 = "null";
              break L84;
            } else {
              stackIn_295_0 = (RuntimeException) ((Object) stackIn_294_0);
              stackIn_295_1 = (StringBuilder) ((Object) stackIn_294_1);
              stackIn_295_2 = "{...}";
              break L84;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_295_0), stackIn_295_2 + ')');
        }
        L85: {
          if (re.field_j == 0) {
            break L85;
          } else {
            L86: {
              if (var3 == 0) {
                stackIn_303_0 = 1;
                break L86;
              } else {
                stackIn_303_0 = 0;
                break L86;
              }
            }
            TrackController.field_F = stackIn_303_0 != 0;
            break L85;
          }
        }
    }

    final static String b(boolean param0) {
        RuntimeException var1 = null;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_j = -13;
                break L1;
              }
            }
            stackIn_4_0 = ab.field_b;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "vk.C(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private vk() throws Throwable {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "vk.<init>()");
        }
    }

    public static void d(int param0) {
        if (param0 != 2) {
            return;
        }
        try {
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "vk.A(" + param0 + ')');
        }
    }

    static {
        field_i = "Try again";
    }
}
