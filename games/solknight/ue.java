/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static int field_a;

    final static void a(da param0, int param1) {
        RuntimeException stackIn_355_0 = null;
        StringBuilder stackIn_355_1 = null;
        RuntimeException stackIn_356_0 = null;
        StringBuilder stackIn_356_1 = null;
        String stackIn_356_2 = null;
        int stackIn_364_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              ch.field_a = param0;
              var2 = hj.a((byte) -2, "gamename");
              if (null == var2) {
                break L1;
              } else {
                ai.field_c = da.a(true, var2);
                break L1;
              }
            }
            L2: {
              var2 = hj.a((byte) -2, "captions,0");
              if (null != var2) {
                ql.field_s[0] = da.a(true, var2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2 = hj.a((byte) -2, "captions,1");
              if (null != var2) {
                ql.field_s[1] = da.a(true, var2);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2 = hj.a((byte) -2, "captions,2");
              if (var2 == null) {
                break L4;
              } else {
                ql.field_s[2] = da.a(true, var2);
                break L4;
              }
            }
            L5: {
              var2 = hj.a((byte) -2, "achievement_names,0");
              if (var2 == null) {
                break L5;
              } else {
                hb.field_m[0] = da.a(true, var2);
                break L5;
              }
            }
            L6: {
              var2 = hj.a((byte) -2, "achievement_names,1");
              if (null == var2) {
                break L6;
              } else {
                hb.field_m[1] = da.a(true, var2);
                break L6;
              }
            }
            L7: {
              var2 = hj.a((byte) -2, "achievement_names,2");
              if (var2 == null) {
                break L7;
              } else {
                hb.field_m[2] = da.a(true, var2);
                break L7;
              }
            }
            L8: {
              var2 = hj.a((byte) -2, "achievement_names,3");
              if (var2 == null) {
                break L8;
              } else {
                hb.field_m[3] = da.a(true, var2);
                break L8;
              }
            }
            L9: {
              var2 = hj.a((byte) -2, "achievement_names,4");
              if (var2 == null) {
                break L9;
              } else {
                hb.field_m[4] = da.a(true, var2);
                break L9;
              }
            }
            L10: {
              var2 = hj.a((byte) -2, "achievement_names,5");
              if (null == var2) {
                break L10;
              } else {
                hb.field_m[5] = da.a(true, var2);
                break L10;
              }
            }
            L11: {
              var2 = hj.a((byte) -2, "achievement_names,6");
              if (null != var2) {
                hb.field_m[6] = da.a(true, var2);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = hj.a((byte) -2, "achievement_names,7");
              if (var2 == null) {
                break L12;
              } else {
                hb.field_m[7] = da.a(true, var2);
                break L12;
              }
            }
            L13: {
              var2 = hj.a((byte) -2, "achievement_names,8");
              if (null != var2) {
                hb.field_m[8] = da.a(true, var2);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2 = hj.a((byte) -2, "achievement_names,9");
              if (var2 == null) {
                break L14;
              } else {
                hb.field_m[9] = da.a(true, var2);
                break L14;
              }
            }
            L15: {
              var2 = hj.a((byte) -2, "achievement_names,10");
              if (null != var2) {
                hb.field_m[10] = da.a(true, var2);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              var2 = hj.a((byte) -2, "achievement_names,11");
              if (null == var2) {
                break L16;
              } else {
                hb.field_m[11] = da.a(true, var2);
                break L16;
              }
            }
            L17: {
              var2 = hj.a((byte) -2, "achievement_names,12");
              if (var2 != null) {
                hb.field_m[12] = da.a(true, var2);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = hj.a((byte) -2, "achievement_names,13");
              if (var2 == null) {
                break L18;
              } else {
                hb.field_m[13] = da.a(true, var2);
                break L18;
              }
            }
            L19: {
              var2 = hj.a((byte) -2, "achievement_names,14");
              if (null != var2) {
                hb.field_m[14] = da.a(true, var2);
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              var2 = hj.a((byte) -2, "achievement_names,15");
              if (null != var2) {
                hb.field_m[15] = da.a(true, var2);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = hj.a((byte) -2, "achievement_criteria,0");
              if (var2 != null) {
                kk.field_a[0] = da.a(true, var2);
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              var2 = hj.a((byte) -2, "achievement_criteria,1");
              if (var2 == null) {
                break L22;
              } else {
                kk.field_a[1] = da.a(true, var2);
                break L22;
              }
            }
            L23: {
              var2 = hj.a((byte) -2, "achievement_criteria,2");
              if (var2 == null) {
                break L23;
              } else {
                kk.field_a[2] = da.a(true, var2);
                break L23;
              }
            }
            L24: {
              var2 = hj.a((byte) -2, "achievement_criteria,3");
              if (null != var2) {
                kk.field_a[3] = da.a(true, var2);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2 = hj.a((byte) -2, "achievement_criteria,4");
              if (null == var2) {
                break L25;
              } else {
                kk.field_a[4] = da.a(true, var2);
                break L25;
              }
            }
            L26: {
              var2 = hj.a((byte) -2, "achievement_criteria,5");
              if (var2 != null) {
                kk.field_a[5] = da.a(true, var2);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2 = hj.a((byte) -2, "achievement_criteria,6");
              if (null != var2) {
                kk.field_a[6] = da.a(true, var2);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = hj.a((byte) -2, "achievement_criteria,7");
              if (var2 == null) {
                break L28;
              } else {
                kk.field_a[7] = da.a(true, var2);
                break L28;
              }
            }
            L29: {
              var2 = hj.a((byte) -2, "achievement_criteria,8");
              if (null == var2) {
                break L29;
              } else {
                kk.field_a[8] = da.a(true, var2);
                break L29;
              }
            }
            L30: {
              var2 = hj.a((byte) -2, "achievement_criteria,9");
              if (var2 == null) {
                break L30;
              } else {
                kk.field_a[9] = da.a(true, var2);
                break L30;
              }
            }
            L31: {
              var2 = hj.a((byte) -2, "achievement_criteria,10");
              if (var2 == null) {
                break L31;
              } else {
                kk.field_a[10] = da.a(true, var2);
                break L31;
              }
            }
            L32: {
              var2 = hj.a((byte) -2, "achievement_criteria,11");
              if (var2 != null) {
                kk.field_a[11] = da.a(true, var2);
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              var2 = hj.a((byte) -2, "achievement_criteria,12");
              if (null != var2) {
                kk.field_a[12] = da.a(true, var2);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = hj.a((byte) -2, "achievement_criteria,13");
              if (null != var2) {
                kk.field_a[13] = da.a(true, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              var2 = hj.a((byte) -2, "achievement_criteria,14");
              if (null == var2) {
                break L35;
              } else {
                kk.field_a[14] = da.a(true, var2);
                break L35;
              }
            }
            L36: {
              var2 = hj.a((byte) -2, "achievement_criteria,15");
              if (null == var2) {
                break L36;
              } else {
                kk.field_a[15] = da.a(true, var2);
                break L36;
              }
            }
            L37: {
              var2 = hj.a((byte) -2, "levstartmsg");
              if (null != var2) {
                fj.field_j = da.a(true, var2);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = hj.a((byte) -2, "planetnames,0");
              if (null != var2) {
                ci.field_gb[0] = da.a(true, var2);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2 = hj.a((byte) -2, "planetnames,1");
              if (null != var2) {
                ci.field_gb[1] = da.a(true, var2);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2 = hj.a((byte) -2, "planetnames,2");
              if (null == var2) {
                break L40;
              } else {
                ci.field_gb[2] = da.a(true, var2);
                break L40;
              }
            }
            L41: {
              var2 = hj.a((byte) -2, "planetnames,3");
              if (null != var2) {
                ci.field_gb[3] = da.a(true, var2);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2 = hj.a((byte) -2, "planetnames,4");
              if (null != var2) {
                ci.field_gb[4] = da.a(true, var2);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2 = hj.a((byte) -2, "planetnames,5");
              if (var2 != null) {
                ci.field_gb[5] = da.a(true, var2);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2 = hj.a((byte) -2, "planetnames,6");
              if (null == var2) {
                break L44;
              } else {
                ci.field_gb[6] = da.a(true, var2);
                break L44;
              }
            }
            L45: {
              var2 = hj.a((byte) -2, "planetnames,7");
              if (null != var2) {
                ci.field_gb[7] = da.a(true, var2);
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var2 = hj.a((byte) -2, "nextweapon,0");
              if (var2 != null) {
                mf.field_y[0] = da.a(true, var2);
                break L46;
              } else {
                break L46;
              }
            }
            L47: {
              var2 = hj.a((byte) -2, "nextweapon,1");
              if (var2 != null) {
                mf.field_y[1] = da.a(true, var2);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2 = hj.a((byte) -2, "nextweapon,2");
              if (var2 == null) {
                break L48;
              } else {
                mf.field_y[2] = da.a(true, var2);
                break L48;
              }
            }
            L49: {
              var2 = hj.a((byte) -2, "nextweapon,3");
              if (null == var2) {
                break L49;
              } else {
                mf.field_y[3] = da.a(true, var2);
                break L49;
              }
            }
            L50: {
              var2 = hj.a((byte) -2, "nextweapon,4");
              if (null != var2) {
                mf.field_y[4] = da.a(true, var2);
                break L50;
              } else {
                break L50;
              }
            }
            L51: {
              var2 = hj.a((byte) -2, "nextweapon,5");
              if (null == var2) {
                break L51;
              } else {
                mf.field_y[5] = da.a(true, var2);
                break L51;
              }
            }
            L52: {
              var2 = hj.a((byte) -2, "nextweapon,6");
              if (null == var2) {
                break L52;
              } else {
                mf.field_y[6] = da.a(true, var2);
                break L52;
              }
            }
            L53: {
              var2 = hj.a((byte) -2, "nextweapondesc,0");
              if (null == var2) {
                break L53;
              } else {
                rf.field_N[0] = da.a(true, var2);
                break L53;
              }
            }
            L54: {
              var2 = hj.a((byte) -2, "nextweapondesc,1");
              if (null != var2) {
                rf.field_N[1] = da.a(true, var2);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = hj.a((byte) -2, "nextweapondesc,2");
              if (var2 != null) {
                rf.field_N[2] = da.a(true, var2);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2 = hj.a((byte) -2, "nextweapondesc,3");
              if (var2 == null) {
                break L56;
              } else {
                rf.field_N[3] = da.a(true, var2);
                break L56;
              }
            }
            L57: {
              var2 = hj.a((byte) -2, "nextweapondesc,4");
              if (null != var2) {
                rf.field_N[4] = da.a(true, var2);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var2 = hj.a((byte) -2, "nextweapondesc,5");
              if (null != var2) {
                rf.field_N[5] = da.a(true, var2);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2 = hj.a((byte) -2, "nextweapondesc,6");
              if (param1 == 0) {
                break L59;
              } else {
                field_a = -70;
                break L59;
              }
            }
            L60: {
              if (var2 != null) {
                rf.field_N[6] = da.a(true, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = hj.a((byte) -2, "titles,0");
              if (var2 == null) {
                break L61;
              } else {
                uc.field_h[0] = da.a(true, var2);
                break L61;
              }
            }
            L62: {
              var2 = hj.a((byte) -2, "titles,1");
              if (var2 != null) {
                uc.field_h[1] = da.a(true, var2);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2 = hj.a((byte) -2, "titles,2");
              if (var2 == null) {
                break L63;
              } else {
                uc.field_h[2] = da.a(true, var2);
                break L63;
              }
            }
            L64: {
              var2 = hj.a((byte) -2, "titles,3");
              if (null != var2) {
                uc.field_h[3] = da.a(true, var2);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var2 = hj.a((byte) -2, "titles,4");
              if (var2 != null) {
                uc.field_h[4] = da.a(true, var2);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2 = hj.a((byte) -2, "titles,5");
              if (null != var2) {
                uc.field_h[5] = da.a(true, var2);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2 = hj.a((byte) -2, "titles,6");
              if (var2 == null) {
                break L67;
              } else {
                uc.field_h[6] = da.a(true, var2);
                break L67;
              }
            }
            L68: {
              var2 = hj.a((byte) -2, "titles,7");
              if (var2 == null) {
                break L68;
              } else {
                uc.field_h[7] = da.a(true, var2);
                break L68;
              }
            }
            L69: {
              var2 = hj.a((byte) -2, "howtoplay");
              if (null != var2) {
                ac.field_a = da.a(true, var2);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2 = hj.a((byte) -2, "levcomp");
              if (null != var2) {
                wf.field_b = da.a(true, var2);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2 = hj.a((byte) -2, "nextwep");
              if (null != var2) {
                gd.field_b = da.a(true, var2);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2 = hj.a((byte) -2, "freegamecomp");
              if (var2 != null) {
                ai.field_d = da.a(true, var2);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2 = hj.a((byte) -2, "levcomplcaps");
              if (null != var2) {
                he.field_e = da.a(true, var2);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2 = hj.a((byte) -2, "congrats");
              if (null == var2) {
                break L74;
              } else {
                ti.field_a = da.a(true, var2);
                break L74;
              }
            }
            L75: {
              var2 = hj.a((byte) -2, "finalscoresubst");
              if (var2 != null) {
                jj.field_I = da.a(true, var2);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2 = hj.a((byte) -2, "finalscore_twolines");
              if (var2 != null) {
                ud.field_j = da.a(true, var2);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2 = hj.a((byte) -2, "victorybonus_twolines");
              if (null == var2) {
                break L77;
              } else {
                w.field_d = da.a(true, var2);
                break L77;
              }
            }
            L78: {
              var2 = hj.a((byte) -2, "combobonus_twolines");
              if (var2 != null) {
                qb.field_X = da.a(true, var2);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2 = hj.a((byte) -2, "currentscore_twolines");
              if (var2 != null) {
                dc.field_m = da.a(true, var2);
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              var2 = hj.a((byte) -2, "earthsaved");
              if (var2 != null) {
                kh.field_e = da.a(true, var2);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2 = hj.a((byte) -2, "livescolon");
              if (null != var2) {
                d.field_a = da.a(true, var2);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2 = hj.a((byte) -2, "combosub");
              if (null == var2) {
                break L82;
              } else {
                ma.field_m = da.a(true, var2);
                break L82;
              }
            }
            L83: {
              var2 = hj.a((byte) -2, "scoresub");
              if (var2 != null) {
                ha.field_p = da.a(true, var2);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2 = hj.a((byte) -2, "combopowsub");
              if (null != var2) {
                pk.field_T = da.a(true, var2);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2 = hj.a((byte) -2, "megapowsub");
              if (var2 == null) {
                break L85;
              } else {
                og.field_i = da.a(true, var2);
                break L85;
              }
            }
            L86: {
              var2 = hj.a((byte) -2, "combopower");
              if (null == var2) {
                break L86;
              } else {
                kc.field_M = da.a(true, var2);
                break L86;
              }
            }
            L87: {
              var2 = hj.a((byte) -2, "megapower");
              if (var2 == null) {
                break L87;
              } else {
                ii.field_a = da.a(true, var2);
                break L87;
              }
            }
            L88: {
              var2 = hj.a((byte) -2, "destroyedpc");
              if (var2 != null) {
                wk.field_a = da.a(true, var2);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              var2 = hj.a((byte) -2, "incoming");
              if (var2 != null) {
                nb.field_b = da.a(true, var2);
                break L89;
              } else {
                break L89;
              }
            }
            L90: {
              var2 = hj.a((byte) -2, "hs_destroyed");
              if (null == var2) {
                break L90;
              } else {
                ne.field_a = da.a(true, var2);
                break L90;
              }
            }
            L91: {
              var2 = hj.a((byte) -2, "instructiontext");
              if (null == var2) {
                break L91;
              } else {
                c.field_E = da.a(true, var2);
                break L91;
              }
            }
            L92: {
              var2 = hj.a((byte) -2, "firingmouse");
              if (null == var2) {
                break L92;
              } else {
                h.field_c = da.a(true, var2);
                break L92;
              }
            }
            L93: {
              var2 = hj.a((byte) -2, "menuescape");
              if (null == var2) {
                break L93;
              } else {
                pg.field_c = da.a(true, var2);
                break L93;
              }
            }
            L94: {
              var2 = hj.a((byte) -2, "aiming");
              if (var2 != null) {
                ii.field_i = da.a(true, var2);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              var2 = hj.a((byte) -2, "instructions_pages,0");
              if (var2 != null) {
                rf.field_Q[0] = da.a(true, var2);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              var2 = hj.a((byte) -2, "instructions_pages,1");
              if (null == var2) {
                break L96;
              } else {
                rf.field_Q[1] = da.a(true, var2);
                break L96;
              }
            }
            L97: {
              var2 = hj.a((byte) -2, "instructions_pages,2");
              if (var2 != null) {
                rf.field_Q[2] = da.a(true, var2);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2 = hj.a((byte) -2, "continu");
              if (var2 == null) {
                break L98;
              } else {
                ah.field_g = da.a(true, var2);
                break L98;
              }
            }
            L99: {
              var2 = hj.a((byte) -2, "benefits");
              if (var2 == null) {
                break L99;
              } else {
                ua.field_E = da.a(true, var2);
                break L99;
              }
            }
            ch.field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L100: {
            var2_ref = decompiledCaughtException;
            stackIn_355_0 = (RuntimeException) (var2_ref);

            stackIn_355_1 = new StringBuilder().append("ue.A(");

            if (param0 == null) {
              stackIn_356_0 = (RuntimeException) ((Object) stackIn_355_0);
              stackIn_356_1 = (StringBuilder) ((Object) stackIn_355_1);
              stackIn_356_2 = "null";
              break L100;
            } else {
              stackIn_356_0 = (RuntimeException) ((Object) stackIn_355_0);
              stackIn_356_1 = (StringBuilder) ((Object) stackIn_355_1);
              stackIn_356_2 = "{...}";
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
                stackIn_364_0 = 1;
                break L102;
              } else {
                stackIn_364_0 = 0;
                break L102;
              }
            }
            SolKnight.field_L = stackIn_364_0 != 0;
            break L101;
          }
        }
    }

    final static int a(int param0, CharSequence param1, int param2, int param3, byte[] param4, int param5) {
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
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param2 - param5;
                        var7 = 0;
                        if (param3 == 352) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -101;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var7 >= var6_int) {
                            statePc = 186;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8 = param1.charAt(param5 + var7);
                        stackIn_187_0 = 0;
                        stackIn_6_0 = stackIn_187_0;
                        if (var9 != 0) {
                            statePc = 187;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 >= var8) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (128 > var8) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (-161 < (var8 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var8 > 255) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param4[param0 + var7] = (byte)var8;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var8 == 8364) {
                            statePc = 183;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        if (-8219 != (var8 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param4[var7 + param0] = (byte) -126;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (402 != var8) {
                            statePc = 36;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        param4[param0 + var7] = (byte) -125;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if ((var8 ^ -1) != -8223) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        param4[var7 + param0] = (byte) -124;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-8231 != (var8 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        param4[var7 + param0] = (byte) -123;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if ((var8 ^ -1) == -8225) {
                            statePc = 180;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (8225 != var8) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param4[var7 + param0] = (byte) -121;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (710 != var8) {
                            statePc = 63;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        param4[param0 + var7] = (byte) -120;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (8240 == var8) {
                            statePc = 177;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var8 == 352) {
                            statePc = 174;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var8 != 8249) {
                            statePc = 75;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        param4[param0 - -var7] = (byte) -117;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (var8 == 338) {
                            statePc = 171;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (381 != var8) {
                            statePc = 84;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        param4[param0 + var7] = (byte) -114;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((var8 ^ -1) == -8217) {
                            statePc = 168;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var8 == 8217) {
                            statePc = 165;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (var8 == 8220) {
                            statePc = 162;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        if (8221 == var8) {
                            statePc = 159;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 96;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if (-8227 == (var8 ^ -1)) {
                            statePc = 156;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (8211 == var8) {
                            statePc = 153;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (var8 != 8212) {
                            statePc = 108;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        param4[param0 + var7] = (byte) -105;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 106;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 108;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var8 == 732) {
                            statePc = 150;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (var8 != 8482) {
                            statePc = 117;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        param4[param0 - -var7] = (byte) -103;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (-354 == (var8 ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (var8 != 8250) {
                            statePc = 126;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        param4[param0 + var7] = (byte) -101;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var8 != 339) {
                            statePc = 132;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 129;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        param4[var7 + param0] = (byte) -100;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 130;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if ((var8 ^ -1) != -383) {
                            statePc = 138;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        param4[param0 + var7] = (byte) -98;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        if (376 == var8) {
                            statePc = 144;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        param4[param0 + var7] = (byte) 63;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        param4[param0 - -var7] = (byte) -97;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        param4[var7 + param0] = (byte) -102;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        param4[param0 + var7] = (byte) -104;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 151;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        param4[var7 + param0] = (byte) -106;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        param4[param0 + var7] = (byte) -107;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 157;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        param4[var7 + param0] = (byte) -108;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        param4[var7 + param0] = (byte) -109;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 165;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        param4[var7 + param0] = (byte) -110;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 166;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        param4[var7 + param0] = (byte) -111;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        param4[var7 + param0] = (byte) -116;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        param4[param0 + var7] = (byte) -118;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        param4[var7 + param0] = (byte) -119;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 178;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        statePc = 180;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        param4[param0 - -var7] = (byte) -122;
                        if (var9 == 0) {
                            statePc = 185;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        param4[param0 - -var7] = (byte) -128;
                        statePc = 185;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        var7++;
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackIn_187_0 = var6_int;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 187: {
                    return stackIn_187_0;
                }
                case 188: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_191_0 = (RuntimeException) (var6);
                    stackIn_189_0 = stackIn_191_0;
                    stackIn_191_1 = new StringBuilder().append("ue.B(").append(param0).append(',');
                    stackIn_189_1 = stackIn_191_1;
                    if (param1 == null) {
                        statePc = 191;
                    } else {
                        statePc = 189;
                    }
                    continue stateLoop;
                }
                case 189: {
                    stackIn_192_0 = (RuntimeException) ((Object) stackIn_189_0);
                    stackIn_192_1 = (StringBuilder) ((Object) stackIn_189_1);
                    stackIn_192_2 = "{...}";
                    statePc = 192;
                    continue stateLoop;
                }
                case 191: {
                    stackIn_192_0 = (RuntimeException) ((Object) stackIn_191_0);
                    stackIn_192_1 = (StringBuilder) ((Object) stackIn_191_1);
                    stackIn_192_2 = "null";
                    statePc = 192;
                    continue stateLoop;
                }
                case 192: {
                    stackIn_195_0 = (RuntimeException) ((Object) stackIn_192_0);
                    stackIn_193_0 = stackIn_195_0;
                    stackIn_195_1 = ((StringBuilder) (Object) stackIn_192_1).append(stackIn_192_2).append(',').append(param2).append(',').append(param3).append(',');
                    stackIn_193_1 = stackIn_195_1;
                    if (param4 == null) {
                        statePc = 195;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 193: {
                    stackIn_196_0 = (RuntimeException) ((Object) stackIn_193_0);
                    stackIn_196_1 = (StringBuilder) ((Object) stackIn_193_1);
                    stackIn_196_2 = "{...}";
                    statePc = 196;
                    continue stateLoop;
                }
                case 195: {
                    stackIn_196_0 = (RuntimeException) ((Object) stackIn_195_0);
                    stackIn_196_1 = (StringBuilder) ((Object) stackIn_195_1);
                    stackIn_196_2 = "null";
                    statePc = 196;
                    continue stateLoop;
                }
                case 196: {
                    throw fc.a((Throwable) ((Object) stackIn_196_0), stackIn_196_2 + ',' + param5 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
