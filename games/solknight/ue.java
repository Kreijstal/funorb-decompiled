/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static int field_a;

    final static void a(da param0, int param1) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        RuntimeException stackIn_355_0 = null;
        StringBuilder stackIn_355_1 = null;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        String stackIn_356_2 = null;
        int stackIn_364_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_352_0 = null;
        StringBuilder stackOut_352_1 = null;
        RuntimeException stackOut_355_0 = null;
        StringBuilder stackOut_355_1 = null;
        String stackOut_355_2 = null;
        RuntimeException stackOut_353_0 = null;
        StringBuilder stackOut_353_1 = null;
        String stackOut_353_2 = null;
        int stackOut_363_0 = 0;
        int stackOut_361_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ch.field_a = param0;
              var2_array = hj.a((byte) -2, "gamename");
              if (null == var2_array) {
                break L1;
              } else {
                ai.field_c = da.a(true, var2_array);
                break L1;
              }
            }
            L2: {
              var2_array = hj.a((byte) -2, "captions,0");
              if (null != var2_array) {
                ql.field_s[0] = da.a(true, var2_array);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_array = hj.a((byte) -2, "captions,1");
              if (null != var2_array) {
                ql.field_s[1] = da.a(true, var2_array);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2_array = hj.a((byte) -2, "captions,2");
              if (var2_array == null) {
                break L4;
              } else {
                ql.field_s[2] = da.a(true, var2_array);
                break L4;
              }
            }
            L5: {
              var2_array = hj.a((byte) -2, "achievement_names,0");
              if (var2_array == null) {
                break L5;
              } else {
                hb.field_m[0] = da.a(true, var2_array);
                break L5;
              }
            }
            L6: {
              var2_array = hj.a((byte) -2, "achievement_names,1");
              if (null == var2_array) {
                break L6;
              } else {
                hb.field_m[1] = da.a(true, var2_array);
                break L6;
              }
            }
            L7: {
              var2_array = hj.a((byte) -2, "achievement_names,2");
              if (var2_array == null) {
                break L7;
              } else {
                hb.field_m[2] = da.a(true, var2_array);
                break L7;
              }
            }
            L8: {
              var2_array = hj.a((byte) -2, "achievement_names,3");
              if (var2_array == null) {
                break L8;
              } else {
                hb.field_m[3] = da.a(true, var2_array);
                break L8;
              }
            }
            L9: {
              var2_array = hj.a((byte) -2, "achievement_names,4");
              if (var2_array == null) {
                break L9;
              } else {
                hb.field_m[4] = da.a(true, var2_array);
                break L9;
              }
            }
            L10: {
              var2_array = hj.a((byte) -2, "achievement_names,5");
              if (null == var2_array) {
                break L10;
              } else {
                hb.field_m[5] = da.a(true, var2_array);
                break L10;
              }
            }
            L11: {
              var2_array = hj.a((byte) -2, "achievement_names,6");
              if (null != var2_array) {
                hb.field_m[6] = da.a(true, var2_array);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2_array = hj.a((byte) -2, "achievement_names,7");
              if (var2_array == null) {
                break L12;
              } else {
                hb.field_m[7] = da.a(true, var2_array);
                break L12;
              }
            }
            L13: {
              var2_array = hj.a((byte) -2, "achievement_names,8");
              if (null != var2_array) {
                hb.field_m[8] = da.a(true, var2_array);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2_array = hj.a((byte) -2, "achievement_names,9");
              if (var2_array == null) {
                break L14;
              } else {
                hb.field_m[9] = da.a(true, var2_array);
                break L14;
              }
            }
            L15: {
              var2_array = hj.a((byte) -2, "achievement_names,10");
              if (null != var2_array) {
                hb.field_m[10] = da.a(true, var2_array);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2_array = hj.a((byte) -2, "achievement_names,11");
              if (null == var2_array) {
                break L16;
              } else {
                hb.field_m[11] = da.a(true, var2_array);
                break L16;
              }
            }
            L17: {
              var2_array = hj.a((byte) -2, "achievement_names,12");
              if (var2_array != null) {
                hb.field_m[12] = da.a(true, var2_array);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2_array = hj.a((byte) -2, "achievement_names,13");
              if (var2_array == null) {
                break L18;
              } else {
                hb.field_m[13] = da.a(true, var2_array);
                break L18;
              }
            }
            L19: {
              var2_array = hj.a((byte) -2, "achievement_names,14");
              if (null != var2_array) {
                hb.field_m[14] = da.a(true, var2_array);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              var2_array = hj.a((byte) -2, "achievement_names,15");
              if (null != var2_array) {
                hb.field_m[15] = da.a(true, var2_array);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2_array = hj.a((byte) -2, "achievement_criteria,0");
              if (var2_array != null) {
                kk.field_a[0] = da.a(true, var2_array);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2_array = hj.a((byte) -2, "achievement_criteria,1");
              if (var2_array == null) {
                break L22;
              } else {
                kk.field_a[1] = da.a(true, var2_array);
                break L22;
              }
            }
            L23: {
              var2_array = hj.a((byte) -2, "achievement_criteria,2");
              if (var2_array == null) {
                break L23;
              } else {
                kk.field_a[2] = da.a(true, var2_array);
                break L23;
              }
            }
            L24: {
              var2_array = hj.a((byte) -2, "achievement_criteria,3");
              if (null != var2_array) {
                kk.field_a[3] = da.a(true, var2_array);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2_array = hj.a((byte) -2, "achievement_criteria,4");
              if (null == var2_array) {
                break L25;
              } else {
                kk.field_a[4] = da.a(true, var2_array);
                break L25;
              }
            }
            L26: {
              var2_array = hj.a((byte) -2, "achievement_criteria,5");
              if (var2_array != null) {
                kk.field_a[5] = da.a(true, var2_array);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2_array = hj.a((byte) -2, "achievement_criteria,6");
              if (null != var2_array) {
                kk.field_a[6] = da.a(true, var2_array);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2_array = hj.a((byte) -2, "achievement_criteria,7");
              if (var2_array == null) {
                break L28;
              } else {
                kk.field_a[7] = da.a(true, var2_array);
                break L28;
              }
            }
            L29: {
              var2_array = hj.a((byte) -2, "achievement_criteria,8");
              if (null == var2_array) {
                break L29;
              } else {
                kk.field_a[8] = da.a(true, var2_array);
                break L29;
              }
            }
            L30: {
              var2_array = hj.a((byte) -2, "achievement_criteria,9");
              if (var2_array == null) {
                break L30;
              } else {
                kk.field_a[9] = da.a(true, var2_array);
                break L30;
              }
            }
            L31: {
              var2_array = hj.a((byte) -2, "achievement_criteria,10");
              if (var2_array == null) {
                break L31;
              } else {
                kk.field_a[10] = da.a(true, var2_array);
                break L31;
              }
            }
            L32: {
              var2_array = hj.a((byte) -2, "achievement_criteria,11");
              if (var2_array != null) {
                kk.field_a[11] = da.a(true, var2_array);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2_array = hj.a((byte) -2, "achievement_criteria,12");
              if (null != var2_array) {
                kk.field_a[12] = da.a(true, var2_array);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2_array = hj.a((byte) -2, "achievement_criteria,13");
              if (null != var2_array) {
                kk.field_a[13] = da.a(true, var2_array);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2_array = hj.a((byte) -2, "achievement_criteria,14");
              if (null == var2_array) {
                break L35;
              } else {
                kk.field_a[14] = da.a(true, var2_array);
                break L35;
              }
            }
            L36: {
              var2_array = hj.a((byte) -2, "achievement_criteria,15");
              if (null == var2_array) {
                break L36;
              } else {
                kk.field_a[15] = da.a(true, var2_array);
                break L36;
              }
            }
            L37: {
              var2_array = hj.a((byte) -2, "levstartmsg");
              if (null != var2_array) {
                fj.field_j = da.a(true, var2_array);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2_array = hj.a((byte) -2, "planetnames,0");
              if (null != var2_array) {
                ci.field_gb[0] = da.a(true, var2_array);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2_array = hj.a((byte) -2, "planetnames,1");
              if (null != var2_array) {
                ci.field_gb[1] = da.a(true, var2_array);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2_array = hj.a((byte) -2, "planetnames,2");
              if (null == var2_array) {
                break L40;
              } else {
                ci.field_gb[2] = da.a(true, var2_array);
                break L40;
              }
            }
            L41: {
              var2_array = hj.a((byte) -2, "planetnames,3");
              if (null != var2_array) {
                ci.field_gb[3] = da.a(true, var2_array);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2_array = hj.a((byte) -2, "planetnames,4");
              if (null != var2_array) {
                ci.field_gb[4] = da.a(true, var2_array);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2_array = hj.a((byte) -2, "planetnames,5");
              if (var2_array != null) {
                ci.field_gb[5] = da.a(true, var2_array);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2_array = hj.a((byte) -2, "planetnames,6");
              if (null == var2_array) {
                break L44;
              } else {
                ci.field_gb[6] = da.a(true, var2_array);
                break L44;
              }
            }
            L45: {
              var2_array = hj.a((byte) -2, "planetnames,7");
              if (null != var2_array) {
                ci.field_gb[7] = da.a(true, var2_array);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2_array = hj.a((byte) -2, "nextweapon,0");
              if (var2_array != null) {
                mf.field_y[0] = da.a(true, var2_array);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2_array = hj.a((byte) -2, "nextweapon,1");
              if (var2_array != null) {
                mf.field_y[1] = da.a(true, var2_array);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2_array = hj.a((byte) -2, "nextweapon,2");
              if (var2_array == null) {
                break L48;
              } else {
                mf.field_y[2] = da.a(true, var2_array);
                break L48;
              }
            }
            L49: {
              var2_array = hj.a((byte) -2, "nextweapon,3");
              if (null == var2_array) {
                break L49;
              } else {
                mf.field_y[3] = da.a(true, var2_array);
                break L49;
              }
            }
            L50: {
              var2_array = hj.a((byte) -2, "nextweapon,4");
              if (null != var2_array) {
                mf.field_y[4] = da.a(true, var2_array);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              var2_array = hj.a((byte) -2, "nextweapon,5");
              if (null == var2_array) {
                break L51;
              } else {
                mf.field_y[5] = da.a(true, var2_array);
                break L51;
              }
            }
            L52: {
              var2_array = hj.a((byte) -2, "nextweapon,6");
              if (null == var2_array) {
                break L52;
              } else {
                mf.field_y[6] = da.a(true, var2_array);
                break L52;
              }
            }
            L53: {
              var2_array = hj.a((byte) -2, "nextweapondesc,0");
              if (null == var2_array) {
                break L53;
              } else {
                rf.field_N[0] = da.a(true, var2_array);
                break L53;
              }
            }
            L54: {
              var2_array = hj.a((byte) -2, "nextweapondesc,1");
              if (null != var2_array) {
                rf.field_N[1] = da.a(true, var2_array);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2_array = hj.a((byte) -2, "nextweapondesc,2");
              if (var2_array != null) {
                rf.field_N[2] = da.a(true, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = hj.a((byte) -2, "nextweapondesc,3");
              if (var2_array == null) {
                break L56;
              } else {
                rf.field_N[3] = da.a(true, var2_array);
                break L56;
              }
            }
            L57: {
              var2_array = hj.a((byte) -2, "nextweapondesc,4");
              if (null != var2_array) {
                rf.field_N[4] = da.a(true, var2_array);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var2_array = hj.a((byte) -2, "nextweapondesc,5");
              if (null != var2_array) {
                rf.field_N[5] = da.a(true, var2_array);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2_array = hj.a((byte) -2, "nextweapondesc,6");
              if (param1 == 0) {
                break L59;
              } else {
                field_a = -70;
                break L59;
              }
            }
            L60: {
              if (var2_array != null) {
                rf.field_N[6] = da.a(true, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = hj.a((byte) -2, "titles,0");
              if (var2_array == null) {
                break L61;
              } else {
                uc.field_h[0] = da.a(true, var2_array);
                break L61;
              }
            }
            L62: {
              var2_array = hj.a((byte) -2, "titles,1");
              if (var2_array != null) {
                uc.field_h[1] = da.a(true, var2_array);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2_array = hj.a((byte) -2, "titles,2");
              if (var2_array == null) {
                break L63;
              } else {
                uc.field_h[2] = da.a(true, var2_array);
                break L63;
              }
            }
            L64: {
              var2_array = hj.a((byte) -2, "titles,3");
              if (null != var2_array) {
                uc.field_h[3] = da.a(true, var2_array);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2_array = hj.a((byte) -2, "titles,4");
              if (var2_array != null) {
                uc.field_h[4] = da.a(true, var2_array);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2_array = hj.a((byte) -2, "titles,5");
              if (null != var2_array) {
                uc.field_h[5] = da.a(true, var2_array);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2_array = hj.a((byte) -2, "titles,6");
              if (var2_array == null) {
                break L67;
              } else {
                uc.field_h[6] = da.a(true, var2_array);
                break L67;
              }
            }
            L68: {
              var2_array = hj.a((byte) -2, "titles,7");
              if (var2_array == null) {
                break L68;
              } else {
                uc.field_h[7] = da.a(true, var2_array);
                break L68;
              }
            }
            L69: {
              var2_array = hj.a((byte) -2, "howtoplay");
              if (null != var2_array) {
                ac.field_a = da.a(true, var2_array);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2_array = hj.a((byte) -2, "levcomp");
              if (null != var2_array) {
                wf.field_b = da.a(true, var2_array);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2_array = hj.a((byte) -2, "nextwep");
              if (null != var2_array) {
                gd.field_b = da.a(true, var2_array);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2_array = hj.a((byte) -2, "freegamecomp");
              if (var2_array != null) {
                ai.field_d = da.a(true, var2_array);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2_array = hj.a((byte) -2, "levcomplcaps");
              if (null != var2_array) {
                he.field_e = da.a(true, var2_array);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2_array = hj.a((byte) -2, "congrats");
              if (null == var2_array) {
                break L74;
              } else {
                ti.field_a = da.a(true, var2_array);
                break L74;
              }
            }
            L75: {
              var2_array = hj.a((byte) -2, "finalscoresubst");
              if (var2_array != null) {
                jj.field_I = da.a(true, var2_array);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2_array = hj.a((byte) -2, "finalscore_twolines");
              if (var2_array != null) {
                ud.field_j = da.a(true, var2_array);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2_array = hj.a((byte) -2, "victorybonus_twolines");
              if (null == var2_array) {
                break L77;
              } else {
                w.field_d = da.a(true, var2_array);
                break L77;
              }
            }
            L78: {
              var2_array = hj.a((byte) -2, "combobonus_twolines");
              if (var2_array != null) {
                qb.field_X = da.a(true, var2_array);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2_array = hj.a((byte) -2, "currentscore_twolines");
              if (var2_array != null) {
                dc.field_m = da.a(true, var2_array);
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              var2_array = hj.a((byte) -2, "earthsaved");
              if (var2_array != null) {
                kh.field_e = da.a(true, var2_array);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2_array = hj.a((byte) -2, "livescolon");
              if (null != var2_array) {
                d.field_a = da.a(true, var2_array);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2_array = hj.a((byte) -2, "combosub");
              if (null == var2_array) {
                break L82;
              } else {
                ma.field_m = da.a(true, var2_array);
                break L82;
              }
            }
            L83: {
              var2_array = hj.a((byte) -2, "scoresub");
              if (var2_array != null) {
                ha.field_p = da.a(true, var2_array);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2_array = hj.a((byte) -2, "combopowsub");
              if (null != var2_array) {
                pk.field_T = da.a(true, var2_array);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2_array = hj.a((byte) -2, "megapowsub");
              if (var2_array == null) {
                break L85;
              } else {
                og.field_i = da.a(true, var2_array);
                break L85;
              }
            }
            L86: {
              var2_array = hj.a((byte) -2, "combopower");
              if (null == var2_array) {
                break L86;
              } else {
                kc.field_M = da.a(true, var2_array);
                break L86;
              }
            }
            L87: {
              var2_array = hj.a((byte) -2, "megapower");
              if (var2_array == null) {
                break L87;
              } else {
                ii.field_a = da.a(true, var2_array);
                break L87;
              }
            }
            L88: {
              var2_array = hj.a((byte) -2, "destroyedpc");
              if (var2_array != null) {
                wk.field_a = da.a(true, var2_array);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              var2_array = hj.a((byte) -2, "incoming");
              if (var2_array != null) {
                nb.field_b = da.a(true, var2_array);
                break L89;
              } else {
                break L89;
              }
            }
            L90: {
              var2_array = hj.a((byte) -2, "hs_destroyed");
              if (null == var2_array) {
                break L90;
              } else {
                ne.field_a = da.a(true, var2_array);
                break L90;
              }
            }
            L91: {
              var2_array = hj.a((byte) -2, "instructiontext");
              if (null == var2_array) {
                break L91;
              } else {
                c.field_E = da.a(true, var2_array);
                break L91;
              }
            }
            L92: {
              var2_array = hj.a((byte) -2, "firingmouse");
              if (null == var2_array) {
                break L92;
              } else {
                h.field_c = da.a(true, var2_array);
                break L92;
              }
            }
            L93: {
              var2_array = hj.a((byte) -2, "menuescape");
              if (null == var2_array) {
                break L93;
              } else {
                pg.field_c = da.a(true, var2_array);
                break L93;
              }
            }
            L94: {
              var2_array = hj.a((byte) -2, "aiming");
              if (var2_array != null) {
                ii.field_i = da.a(true, var2_array);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              var2_array = hj.a((byte) -2, "instructions_pages,0");
              if (var2_array != null) {
                rf.field_Q[0] = da.a(true, var2_array);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              var2_array = hj.a((byte) -2, "instructions_pages,1");
              if (null == var2_array) {
                break L96;
              } else {
                rf.field_Q[1] = da.a(true, var2_array);
                break L96;
              }
            }
            L97: {
              var2_array = hj.a((byte) -2, "instructions_pages,2");
              if (var2_array != null) {
                rf.field_Q[2] = da.a(true, var2_array);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2_array = hj.a((byte) -2, "continu");
              if (var2_array == null) {
                break L98;
              } else {
                ah.field_g = da.a(true, var2_array);
                break L98;
              }
            }
            L99: {
              var2_array = hj.a((byte) -2, "benefits");
              if (var2_array == null) {
                break L99;
              } else {
                ua.field_E = da.a(true, var2_array);
                break L99;
              }
            }
            ch.field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L100: {
            var2 = decompiledCaughtException;
            stackOut_352_0 = (RuntimeException) (var2);
            stackOut_352_1 = new StringBuilder().append("ue.A(");
            stackIn_355_0 = stackOut_352_0;
            stackIn_355_1 = stackOut_352_1;
            stackIn_353_0 = stackOut_352_0;
            stackIn_353_1 = stackOut_352_1;
            if (param0 == null) {
              stackOut_355_0 = (RuntimeException) ((Object) stackIn_355_0);
              stackOut_355_1 = (StringBuilder) ((Object) stackIn_355_1);
              stackOut_355_2 = "null";
              stackIn_356_0 = stackOut_355_0;
              stackIn_356_1 = stackOut_355_1;
              stackIn_356_2 = stackOut_355_2;
              break L100;
            } else {
              stackOut_353_0 = (RuntimeException) ((Object) stackIn_353_0);
              stackOut_353_1 = (StringBuilder) ((Object) stackIn_353_1);
              stackOut_353_2 = "{...}";
              stackIn_356_0 = stackOut_353_0;
              stackIn_356_1 = stackOut_353_1;
              stackIn_356_2 = stackOut_353_2;
              break L100;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_356_0), stackIn_356_2 + ',' + param1 + ')');
        }
        L101: {
          if (!dh.field_l) {
            break L101;
          } else {
            L102: {
              if (var3 == 0) {
                stackOut_363_0 = 1;
                stackIn_364_0 = stackOut_363_0;
                break L102;
              } else {
                stackOut_361_0 = 0;
                stackIn_364_0 = stackOut_361_0;
                break L102;
              }
            }
            SolKnight.field_L = stackIn_364_0 != 0;
            break L101;
          }
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_187_0 = 0;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        RuntimeException stackIn_191_0 = null;
        StringBuilder stackIn_191_1 = null;
        RuntimeException stackIn_192_0 = null;
        StringBuilder stackIn_192_1 = null;
        String stackIn_192_2 = null;
        RuntimeException stackIn_193_0 = null;
        StringBuilder stackIn_193_1 = null;
        RuntimeException stackIn_195_0 = null;
        StringBuilder stackIn_195_1 = null;
        RuntimeException stackIn_196_0 = null;
        StringBuilder stackIn_196_1 = null;
        String stackIn_196_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_188_0 = null;
        StringBuilder stackOut_188_1 = null;
        RuntimeException stackOut_191_0 = null;
        StringBuilder stackOut_191_1 = null;
        String stackOut_191_2 = null;
        RuntimeException stackOut_189_0 = null;
        StringBuilder stackOut_189_1 = null;
        String stackOut_189_2 = null;
        RuntimeException stackOut_192_0 = null;
        StringBuilder stackOut_192_1 = null;
        RuntimeException stackOut_195_0 = null;
        StringBuilder stackOut_195_1 = null;
        String stackOut_195_2 = null;
        RuntimeException stackOut_193_0 = null;
        StringBuilder stackOut_193_1 = null;
        String stackOut_193_2 = null;
        var9 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6_int = param2 - param5;
            var7 = 0;
            if (param3 == 352) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7 >= var6_int) {
                      break L3;
                    } else {
                      var8 = param1.charAt(param5 + var7);
                      stackOut_5_0 = 0;
                      stackIn_187_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                if (stackIn_6_0 >= var8) {
                                  break L7;
                                } else {
                                  if (128 > var8) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (-161 < (var8 ^ -1)) {
                                break L5;
                              } else {
                                if (var8 > 255) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            param4[param0 + var7] = (byte)var8;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          L8: {
                            if (var8 == 8364) {
                              break L8;
                            } else {
                              L9: {
                                if (-8219 != (var8 ^ -1)) {
                                  break L9;
                                } else {
                                  param4[var7 + param0] = (byte) -126;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if (402 != var8) {
                                  break L10;
                                } else {
                                  param4[param0 + var7] = (byte) -125;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if ((var8 ^ -1) != -8223) {
                                  break L11;
                                } else {
                                  param4[var7 + param0] = (byte) -124;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              L12: {
                                if (-8231 != (var8 ^ -1)) {
                                  break L12;
                                } else {
                                  param4[var7 + param0] = (byte) -123;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              L13: {
                                if ((var8 ^ -1) == -8225) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (8225 != var8) {
                                      break L14;
                                    } else {
                                      param4[var7 + param0] = (byte) -121;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  L15: {
                                    if (710 != var8) {
                                      break L15;
                                    } else {
                                      param4[param0 + var7] = (byte) -120;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L16: {
                                    if (8240 == var8) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var8 == 352) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (var8 != 8249) {
                                              break L18;
                                            } else {
                                              param4[param0 - -var7] = (byte) -117;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L19: {
                                            if (var8 == 338) {
                                              break L19;
                                            } else {
                                              L20: {
                                                if (381 != var8) {
                                                  break L20;
                                                } else {
                                                  param4[param0 + var7] = (byte) -114;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                              }
                                              L21: {
                                                if ((var8 ^ -1) == -8217) {
                                                  break L21;
                                                } else {
                                                  L22: {
                                                    if (var8 == 8217) {
                                                      break L22;
                                                    } else {
                                                      L23: {
                                                        if (var8 == 8220) {
                                                          break L23;
                                                        } else {
                                                          L24: {
                                                            if (8221 == var8) {
                                                              break L24;
                                                            } else {
                                                              L25: {
                                                                if (-8227 == (var8 ^ -1)) {
                                                                  break L25;
                                                                } else {
                                                                  L26: {
                                                                    if (8211 == var8) {
                                                                      break L26;
                                                                    } else {
                                                                      L27: {
                                                                        if (var8 != 8212) {
                                                                          break L27;
                                                                        } else {
                                                                          param4[param0 + var7] = (byte) -105;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L27;
                                                                          }
                                                                        }
                                                                      }
                                                                      L28: {
                                                                        if (var8 == 732) {
                                                                          break L28;
                                                                        } else {
                                                                          L29: {
                                                                            if (var8 != 8482) {
                                                                              break L29;
                                                                            } else {
                                                                              param4[param0 - -var7] = (byte) -103;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L29;
                                                                              }
                                                                            }
                                                                          }
                                                                          L30: {
                                                                            if (-354 == (var8 ^ -1)) {
                                                                              break L30;
                                                                            } else {
                                                                              L31: {
                                                                                if (var8 != 8250) {
                                                                                  break L31;
                                                                                } else {
                                                                                  param4[param0 + var7] = (byte) -101;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L31;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L32: {
                                                                                if (var8 != 339) {
                                                                                  break L32;
                                                                                } else {
                                                                                  param4[var7 + param0] = (byte) -100;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L32;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L33: {
                                                                                if ((var8 ^ -1) != -383) {
                                                                                  break L33;
                                                                                } else {
                                                                                  param4[param0 + var7] = (byte) -98;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L34: {
                                                                                if (376 == var8) {
                                                                                  break L34;
                                                                                } else {
                                                                                  param4[param0 + var7] = (byte) 63;
                                                                                  if (var9 == 0) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    break L34;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param4[param0 - -var7] = (byte) -97;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          param4[var7 + param0] = (byte) -102;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L28;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[param0 + var7] = (byte) -104;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[var7 + param0] = (byte) -106;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              param4[param0 + var7] = (byte) -107;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param0] = (byte) -108;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      param4[var7 + param0] = (byte) -109;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param0] = (byte) -110;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L21;
                                                  }
                                                }
                                              }
                                              param4[var7 + param0] = (byte) -111;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          param4[var7 + param0] = (byte) -116;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      param4[param0 + var7] = (byte) -118;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  param4[var7 + param0] = (byte) -119;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              param4[param0 - -var7] = (byte) -122;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          param4[param0 - -var7] = (byte) -128;
                          break L4;
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_186_0 = var6_int;
                  stackIn_187_0 = stackOut_186_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = -101;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var6 = decompiledCaughtException;
            stackOut_188_0 = (RuntimeException) (var6);
            stackOut_188_1 = new StringBuilder().append("ue.B(").append(param0).append(',');
            stackIn_191_0 = stackOut_188_0;
            stackIn_191_1 = stackOut_188_1;
            stackIn_189_0 = stackOut_188_0;
            stackIn_189_1 = stackOut_188_1;
            if (param1 == null) {
              stackOut_191_0 = (RuntimeException) ((Object) stackIn_191_0);
              stackOut_191_1 = (StringBuilder) ((Object) stackIn_191_1);
              stackOut_191_2 = "null";
              stackIn_192_0 = stackOut_191_0;
              stackIn_192_1 = stackOut_191_1;
              stackIn_192_2 = stackOut_191_2;
              break L35;
            } else {
              stackOut_189_0 = (RuntimeException) ((Object) stackIn_189_0);
              stackOut_189_1 = (StringBuilder) ((Object) stackIn_189_1);
              stackOut_189_2 = "{...}";
              stackIn_192_0 = stackOut_189_0;
              stackIn_192_1 = stackOut_189_1;
              stackIn_192_2 = stackOut_189_2;
              break L35;
            }
          }
          L36: {
            stackOut_192_0 = (RuntimeException) ((Object) stackIn_192_0);
            stackOut_192_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_195_0 = stackOut_192_0;
            stackIn_195_1 = stackOut_192_1;
            stackIn_193_0 = stackOut_192_0;
            stackIn_193_1 = stackOut_192_1;
            if (param4 == null) {
              stackOut_195_0 = (RuntimeException) ((Object) stackIn_195_0);
              stackOut_195_1 = (StringBuilder) ((Object) stackIn_195_1);
              stackOut_195_2 = "null";
              stackIn_196_0 = stackOut_195_0;
              stackIn_196_1 = stackOut_195_1;
              stackIn_196_2 = stackOut_195_2;
              break L36;
            } else {
              stackOut_193_0 = (RuntimeException) ((Object) stackIn_193_0);
              stackOut_193_1 = (StringBuilder) ((Object) stackIn_193_1);
              stackOut_193_2 = "{...}";
              stackIn_196_0 = stackOut_193_0;
              stackIn_196_1 = stackOut_193_1;
              stackIn_196_2 = stackOut_193_2;
              break L36;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_196_0), stackIn_196_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_187_0;
        }
    }

    static {
    }
}
