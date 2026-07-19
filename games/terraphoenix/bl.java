/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static ci[] field_b;
    static boolean field_e;
    static int field_f;
    static fa field_a;
    static String field_c;
    static String field_g;
    static long field_h;
    static String field_d;

    final static void a(byte param0, fa param1) {
        String discarded$12 = null;
        String discarded$13 = null;
        String discarded$14 = null;
        String discarded$15 = null;
        String discarded$16 = null;
        String discarded$17 = null;
        String discarded$18 = null;
        String discarded$19 = null;
        String discarded$20 = null;
        String discarded$21 = null;
        String discarded$22 = null;
        String discarded$23 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        RuntimeException stackIn_2489_0 = null;
        StringBuilder stackIn_2489_1 = null;
        RuntimeException stackIn_2491_0 = null;
        StringBuilder stackIn_2491_1 = null;
        RuntimeException stackIn_2492_0 = null;
        StringBuilder stackIn_2492_1 = null;
        String stackIn_2492_2 = null;
        int stackIn_2500_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2488_0 = null;
        StringBuilder stackOut_2488_1 = null;
        RuntimeException stackOut_2491_0 = null;
        StringBuilder stackOut_2491_1 = null;
        String stackOut_2491_2 = null;
        RuntimeException stackOut_2489_0 = null;
        StringBuilder stackOut_2489_1 = null;
        String stackOut_2489_2 = null;
        int stackOut_2499_0 = 0;
        int stackOut_2497_0 = 0;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              nj.field_i = param1;
              var2_array = il.a((byte) 85, "achievement_names,0");
              if (var2_array == null) {
                break L1;
              } else {
                b.field_g[0] = ll.a(0, var2_array);
                break L1;
              }
            }
            L2: {
              var2_array = il.a((byte) 107, "achievement_names,1");
              if (null != var2_array) {
                b.field_g[1] = ll.a(0, var2_array);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_array = il.a((byte) 101, "achievement_names,2");
              if (null == var2_array) {
                break L3;
              } else {
                b.field_g[2] = ll.a(0, var2_array);
                break L3;
              }
            }
            L4: {
              var2_array = il.a((byte) 93, "achievement_names,3");
              if (null == var2_array) {
                break L4;
              } else {
                b.field_g[3] = ll.a(0, var2_array);
                break L4;
              }
            }
            L5: {
              var2_array = il.a((byte) 97, "achievement_names,4");
              if (var2_array != null) {
                b.field_g[4] = ll.a(0, var2_array);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var2_array = il.a((byte) 73, "achievement_names,5");
              if (null == var2_array) {
                break L6;
              } else {
                b.field_g[5] = ll.a(0, var2_array);
                break L6;
              }
            }
            L7: {
              var2_array = il.a((byte) 102, "achievement_names,6");
              if (var2_array != null) {
                b.field_g[6] = ll.a(0, var2_array);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2_array = il.a((byte) 95, "achievement_names,7");
              if (null != var2_array) {
                b.field_g[7] = ll.a(sl.a((int) param0, 96), var2_array);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2_array = il.a((byte) 71, "achievement_names,8");
              if (null != var2_array) {
                b.field_g[8] = ll.a(param0 + -96, var2_array);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2_array = il.a((byte) 127, "achievement_names,9");
              if (var2_array != null) {
                b.field_g[9] = ll.a(param0 + -96, var2_array);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              var2_array = il.a((byte) 72, "achievement_names,10");
              if (var2_array != null) {
                b.field_g[10] = ll.a(0, var2_array);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2_array = il.a((byte) 100, "achievement_names,11");
              if (var2_array != null) {
                b.field_g[11] = ll.a(param0 + -96, var2_array);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var2_array = il.a((byte) 92, "achievement_names,12");
              if (null != var2_array) {
                b.field_g[12] = ll.a(0, var2_array);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2_array = il.a((byte) 85, "achievement_names,13");
              if (null == var2_array) {
                break L14;
              } else {
                b.field_g[13] = ll.a(0, var2_array);
                break L14;
              }
            }
            L15: {
              var2_array = il.a((byte) 87, "achievement_names,14");
              if (null == var2_array) {
                break L15;
              } else {
                b.field_g[14] = ll.a(0, var2_array);
                break L15;
              }
            }
            L16: {
              var2_array = il.a((byte) 119, "achievement_names,15");
              if (null != var2_array) {
                b.field_g[15] = ll.a(param0 + -96, var2_array);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var2_array = il.a((byte) 115, "achievement_names,16");
              if (null != var2_array) {
                b.field_g[16] = ll.a(0, var2_array);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2_array = il.a((byte) 79, "points");
              if (var2_array == null) {
                break L18;
              } else {
                hh.field_l = ll.a(0, var2_array);
                break L18;
              }
            }
            L19: {
              var2_array = il.a((byte) 101, "allysoldat");
              if (null == var2_array) {
                break L19;
              } else {
                f.field_h = ll.a(0, var2_array);
                break L19;
              }
            }
            L20: {
              var2_array = il.a((byte) 101, "yrsoldat");
              if (var2_array == null) {
                break L20;
              } else {
                hm.field_H = ll.a(param0 + -96, var2_array);
                break L20;
              }
            }
            L21: {
              var2_array = il.a((byte) 84, "stairs");
              if (null == var2_array) {
                break L21;
              } else {
                rj.field_b = ll.a(0, var2_array);
                break L21;
              }
            }
            L22: {
              var2_array = il.a((byte) 113, "normalwall");
              if (var2_array != null) {
                gh.field_O = ll.a(0, var2_array);
                break L22;
              } else {
                break L22;
              }
            }
            L23: {
              var2_array = il.a((byte) 124, "lowwalls");
              if (var2_array != null) {
                vh.field_h = ll.a(0, var2_array);
                break L23;
              } else {
                break L23;
              }
            }
            L24: {
              var2_array = il.a((byte) 99, "coverterr");
              if (var2_array == null) {
                break L24;
              } else {
                cg.field_I = ll.a(0, var2_array);
                break L24;
              }
            }
            L25: {
              var2_array = il.a((byte) 77, "blockterr");
              if (var2_array != null) {
                am.field_H = ll.a(0, var2_array);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2_array = il.a((byte) 82, "impassableterr");
              if (null != var2_array) {
                bm.field_c = ll.a(0, var2_array);
                break L26;
              } else {
                break L26;
              }
            }
            L27: {
              var2_array = il.a((byte) 120, "thlevel");
              if (var2_array == null) {
                break L27;
              } else {
                ab.field_c = ll.a(0, var2_array);
                break L27;
              }
            }
            L28: {
              var2_array = il.a((byte) 127, "ndlev");
              if (var2_array != null) {
                gh.field_L = ll.a(param0 ^ 96, var2_array);
                break L28;
              } else {
                break L28;
              }
            }
            L29: {
              var2_array = il.a((byte) 101, "groundlevel");
              if (null == var2_array) {
                break L29;
              } else {
                cm.field_e = ll.a(0, var2_array);
                break L29;
              }
            }
            L30: {
              var2_array = il.a((byte) 110, "terraintype");
              if (null == var2_array) {
                break L30;
              } else {
                mm.field_g = ll.a(0, var2_array);
                break L30;
              }
            }
            L31: {
              var2_array = il.a((byte) 118, "terrainlevel");
              if (var2_array != null) {
                kj.field_a = ll.a(param0 + -96, var2_array);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2_array = il.a((byte) 115, "mapkey");
              if (var2_array == null) {
                break L32;
              } else {
                vb.field_e = ll.a(0, var2_array);
                break L32;
              }
            }
            L33: {
              var2_array = il.a((byte) 122, "achievement_criteria,0");
              if (var2_array == null) {
                break L33;
              } else {
                eb.field_J[0] = ll.a(0, var2_array);
                break L33;
              }
            }
            L34: {
              var2_array = il.a((byte) 74, "achievement_criteria,1");
              if (null == var2_array) {
                break L34;
              } else {
                eb.field_J[1] = ll.a(sl.a((int) param0, 96), var2_array);
                break L34;
              }
            }
            L35: {
              var2_array = il.a((byte) 122, "achievement_criteria,2");
              if (var2_array != null) {
                eb.field_J[2] = ll.a(param0 + -96, var2_array);
                break L35;
              } else {
                break L35;
              }
            }
            L36: {
              var2_array = il.a((byte) 123, "achievement_criteria,3");
              if (null == var2_array) {
                break L36;
              } else {
                eb.field_J[3] = ll.a(0, var2_array);
                break L36;
              }
            }
            L37: {
              var2_array = il.a((byte) 96, "achievement_criteria,4");
              if (null != var2_array) {
                eb.field_J[4] = ll.a(0, var2_array);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2_array = il.a((byte) 114, "achievement_criteria,5");
              if (var2_array != null) {
                eb.field_J[5] = ll.a(0, var2_array);
                break L38;
              } else {
                break L38;
              }
            }
            L39: {
              var2_array = il.a((byte) 87, "achievement_criteria,6");
              if (null != var2_array) {
                eb.field_J[6] = ll.a(param0 + -96, var2_array);
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              var2_array = il.a((byte) 79, "achievement_criteria,7");
              if (var2_array == null) {
                break L40;
              } else {
                eb.field_J[7] = ll.a(0, var2_array);
                break L40;
              }
            }
            L41: {
              var2_array = il.a((byte) 94, "achievement_criteria,8");
              if (var2_array == null) {
                break L41;
              } else {
                eb.field_J[8] = ll.a(param0 + -96, var2_array);
                break L41;
              }
            }
            L42: {
              var2_array = il.a((byte) 91, "achievement_criteria,9");
              if (var2_array == null) {
                break L42;
              } else {
                eb.field_J[9] = ll.a(0, var2_array);
                break L42;
              }
            }
            L43: {
              var2_array = il.a((byte) 123, "achievement_criteria,10");
              if (var2_array != null) {
                eb.field_J[10] = ll.a(0, var2_array);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2_array = il.a((byte) 73, "achievement_criteria,11");
              if (var2_array == null) {
                break L44;
              } else {
                eb.field_J[11] = ll.a(0, var2_array);
                break L44;
              }
            }
            L45: {
              var2_array = il.a((byte) 72, "achievement_criteria,12");
              if (null == var2_array) {
                break L45;
              } else {
                eb.field_J[12] = ll.a(sl.a((int) param0, 96), var2_array);
                break L45;
              }
            }
            L46: {
              var2_array = il.a((byte) 77, "achievement_criteria,13");
              if (var2_array == null) {
                break L46;
              } else {
                eb.field_J[13] = ll.a(sl.a((int) param0, 96), var2_array);
                break L46;
              }
            }
            L47: {
              var2_array = il.a((byte) 90, "achievement_criteria,14");
              if (var2_array == null) {
                break L47;
              } else {
                eb.field_J[14] = ll.a(0, var2_array);
                break L47;
              }
            }
            L48: {
              var2_array = il.a((byte) 107, "achievement_criteria,15");
              if (null == var2_array) {
                break L48;
              } else {
                eb.field_J[15] = ll.a(0, var2_array);
                break L48;
              }
            }
            L49: {
              var2_array = il.a((byte) 82, "achievement_criteria,16");
              if (var2_array == null) {
                break L49;
              } else {
                eb.field_J[16] = ll.a(0, var2_array);
                break L49;
              }
            }
            L50: {
              var2_array = il.a((byte) 89, "thousandseperator");
              if (var2_array == null) {
                break L50;
              } else {
                ng.field_w = ll.a(param0 + -96, var2_array);
                break L50;
              }
            }
            L51: {
              var2_array = il.a((byte) 96, "score_colon_space");
              if (var2_array == null) {
                break L51;
              } else {
                discarded$12 = ll.a(param0 ^ 96, var2_array);
                break L51;
              }
            }
            L52: {
              var2_array = il.a((byte) 100, "canpressundo");
              if (var2_array == null) {
                break L52;
              } else {
                mj.field_c = ll.a(0, var2_array);
                break L52;
              }
            }
            L53: {
              var2_array = il.a((byte) 115, "efficency");
              if (null != var2_array) {
                m.field_b = ll.a(0, var2_array);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2_array = il.a((byte) 126, "basescore");
              if (null == var2_array) {
                break L54;
              } else {
                dl.field_o = ll.a(0, var2_array);
                break L54;
              }
            }
            L55: {
              var2_array = il.a((byte) 78, "makeanaccounttosave");
              if (null != var2_array) {
                uc.field_q = ll.a(param0 + -96, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = il.a((byte) 123, "ifyoudontwanttosave");
              if (var2_array != null) {
                ae.field_L = ll.a(0, var2_array);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var2_array = il.a((byte) 83, "contin");
              if (var2_array == null) {
                break L57;
              } else {
                ba.field_c = ll.a(param0 ^ 96, var2_array);
                break L57;
              }
            }
            L58: {
              var2_array = il.a((byte) 108, "youcannotsave");
              if (var2_array != null) {
                vb.field_c = ll.a(0, var2_array);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2_array = il.a((byte) 78, "savegame");
              if (null != var2_array) {
                me.field_n = ll.a(param0 + -96, var2_array);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2_array = il.a((byte) 122, "yes");
              if (null != var2_array) {
                el.field_c = ll.a(0, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = il.a((byte) 78, "no");
              if (null != var2_array) {
                bc.field_b = ll.a(0, var2_array);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              var2_array = il.a((byte) 71, "saveyourgame");
              if (null != var2_array) {
                rj.field_d = ll.a(0, var2_array);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2_array = il.a((byte) 123, "savingwilloverwrite");
              if (null != var2_array) {
                gl.field_t = ll.a(0, var2_array);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2_array = il.a((byte) 77, "backtoms");
              if (var2_array == null) {
                break L64;
              } else {
                hd.field_m = ll.a(0, var2_array);
                break L64;
              }
            }
            L65: {
              var2_array = il.a((byte) 111, "beginmission");
              if (null == var2_array) {
                break L65;
              } else {
                lk.field_c = ll.a(0, var2_array);
                break L65;
              }
            }
            L66: {
              var2_array = il.a((byte) 98, "exitdebriefing");
              if (null == var2_array) {
                break L66;
              } else {
                qa.field_b = ll.a(param0 ^ 96, var2_array);
                break L66;
              }
            }
            L67: {
              var2_array = il.a((byte) 98, "savegameandexitdebriefing");
              if (null != var2_array) {
                eg.field_n = ll.a(0, var2_array);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2_array = il.a((byte) 108, "exitdebriefingwithoutsaving");
              if (null != var2_array) {
                rj.field_c = ll.a(param0 + -96, var2_array);
                break L68;
              } else {
                break L68;
              }
            }
            L69: {
              var2_array = il.a((byte) 91, "pressnext");
              if (var2_array != null) {
                ak.field_c = ll.a(0, var2_array);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2_array = il.a((byte) 87, "objectivefailed");
              if (var2_array == null) {
                break L70;
              } else {
                rf.field_s = ll.a(param0 ^ 96, var2_array);
                break L70;
              }
            }
            L71: {
              var2_array = il.a((byte) 113, "clearenemies");
              if (var2_array != null) {
                pl.field_G = ll.a(0, var2_array);
                break L71;
              } else {
                break L71;
              }
            }
            L72: {
              var2_array = il.a((byte) 78, "retrieveevacutate");
              if (null == var2_array) {
                break L72;
              } else {
                ki.field_Z = ll.a(0, var2_array);
                break L72;
              }
            }
            L73: {
              var2_array = il.a((byte) 73, "evacuate");
              if (var2_array != null) {
                ch.field_h = ll.a(0, var2_array);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2_array = il.a((byte) 87, "evacmother");
              if (null != var2_array) {
                va.field_j = ll.a(param0 + -96, var2_array);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2_array = il.a((byte) 77, "preplaun");
              if (var2_array == null) {
                break L75;
              } else {
                vk.field_a = ll.a(0, var2_array);
                break L75;
              }
            }
            L76: {
              var2_array = il.a((byte) 123, "aboutlaun");
              if (var2_array == null) {
                break L76;
              } else {
                fc.field_h = ll.a(0, var2_array);
                break L76;
              }
            }
            L77: {
              var2_array = il.a((byte) 98, "launching");
              if (null != var2_array) {
                jm.field_a = ll.a(0, var2_array);
                break L77;
              } else {
                break L77;
              }
            }
            L78: {
              var2_array = il.a((byte) 82, "hasdied");
              if (var2_array != null) {
                aa.field_r = ll.a(param0 + -96, var2_array);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2_array = il.a((byte) 97, "hasfallen");
              if (var2_array != null) {
                d.field_O = ll.a(0, var2_array);
                break L79;
              } else {
                break L79;
              }
            }
            L80: {
              var2_array = il.a((byte) 124, "hostileseen");
              if (null != var2_array) {
                ib.field_X = ll.a(0, var2_array);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2_array = il.a((byte) 99, "alienseen");
              if (null != var2_array) {
                p.field_d = ll.a(0, var2_array);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2_array = il.a((byte) 107, "clicktosetdest");
              if (null != var2_array) {
                ke.field_g = ll.a(0, var2_array);
                break L82;
              } else {
                break L82;
              }
            }
            L83: {
              var2_array = il.a((byte) 87, "clicktomovedest");
              if (null != var2_array) {
                wg.field_k = ll.a(0, var2_array);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2_array = il.a((byte) 75, "clicktocollectob");
              if (var2_array != null) {
                bm.field_b = ll.a(param0 ^ 96, var2_array);
                break L84;
              } else {
                break L84;
              }
            }
            L85: {
              var2_array = il.a((byte) 75, "clicktofacedest");
              if (null == var2_array) {
                break L85;
              } else {
                va.field_b = ll.a(param0 + -96, var2_array);
                break L85;
              }
            }
            L86: {
              var2_array = il.a((byte) 98, "zoomtolocation");
              if (var2_array != null) {
                rl.field_c = ll.a(0, var2_array);
                break L86;
              } else {
                break L86;
              }
            }
            L87: {
              var2_array = il.a((byte) 71, "clicktoselect");
              if (var2_array != null) {
                ef.field_a = ll.a(0, var2_array);
                break L87;
              } else {
                break L87;
              }
            }
            L88: {
              var2_array = il.a((byte) 94, "clicktofire");
              if (null == var2_array) {
                break L88;
              } else {
                q.field_Fb = ll.a(0, var2_array);
                break L88;
              }
            }
            L89: {
              var2_array = il.a((byte) 103, "clicktothrow");
              if (var2_array != null) {
                hm.field_G = ll.a(0, var2_array);
                break L89;
              } else {
                break L89;
              }
            }
            L90: {
              var2_array = il.a((byte) 108, "clicktoreturntomove");
              if (var2_array == null) {
                break L90;
              } else {
                cm.field_a = ll.a(0, var2_array);
                break L90;
              }
            }
            L91: {
              var2_array = il.a((byte) 92, "notenoughtus");
              if (var2_array != null) {
                m.field_h = ll.a(param0 + -96, var2_array);
                break L91;
              } else {
                break L91;
              }
            }
            L92: {
              var2_array = il.a((byte) 76, "outofammo");
              if (var2_array != null) {
                fl.field_d = ll.a(param0 ^ 96, var2_array);
                break L92;
              } else {
                break L92;
              }
            }
            L93: {
              var2_array = il.a((byte) 90, "outofammosmall");
              if (var2_array == null) {
                break L93;
              } else {
                ta.field_a = ll.a(0, var2_array);
                break L93;
              }
            }
            L94: {
              var2_array = il.a((byte) 109, "pressltoreload");
              if (var2_array != null) {
                ql.field_f = ll.a(0, var2_array);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              var2_array = il.a((byte) 84, "closemap");
              if (var2_array == null) {
                break L95;
              } else {
                od.field_d = ll.a(0, var2_array);
                break L95;
              }
            }
            L96: {
              var2_array = il.a((byte) 110, "openmap");
              if (null == var2_array) {
                break L96;
              } else {
                pf.field_d = ll.a(param0 + -96, var2_array);
                break L96;
              }
            }
            L97: {
              var2_array = il.a((byte) 98, "selectready");
              if (var2_array != null) {
                fa.field_e = ll.a(0, var2_array);
                break L97;
              } else {
                break L97;
              }
            }
            L98: {
              var2_array = il.a((byte) 119, "selectsprint");
              if (null == var2_array) {
                break L98;
              } else {
                db.field_a = ll.a(0, var2_array);
                break L98;
              }
            }
            L99: {
              var2_array = il.a((byte) 92, "togglescematic");
              if (var2_array == null) {
                break L99;
              } else {
                of.field_i = ll.a(0, var2_array);
                break L99;
              }
            }
            L100: {
              var2_array = il.a((byte) 120, "movetolevel");
              if (var2_array != null) {
                di.field_g = ll.a(param0 ^ 96, var2_array);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2_array = il.a((byte) 113, "movetoground");
              if (null == var2_array) {
                break L101;
              } else {
                ph.field_u = ll.a(param0 + -96, var2_array);
                break L101;
              }
            }
            L102: {
              var2_array = il.a((byte) 105, "selectnextfriend");
              if (var2_array == null) {
                break L102;
              } else {
                sd.field_f = ll.a(0, var2_array);
                break L102;
              }
            }
            L103: {
              var2_array = il.a((byte) 119, "centreonunit");
              if (var2_array != null) {
                ab.field_f = ll.a(0, var2_array);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2_array = il.a((byte) 99, "select");
              if (var2_array != null) {
                ne.field_b = ll.a(param0 + -96, var2_array);
                break L104;
              } else {
                break L104;
              }
            }
            L105: {
              var2_array = il.a((byte) 125, "recruitnew");
              if (null != var2_array) {
                kf.field_c = ll.a(0, var2_array);
                break L105;
              } else {
                break L105;
              }
            }
            L106: {
              var2_array = il.a((byte) 77, "equip");
              if (null == var2_array) {
                break L106;
              } else {
                fi.field_n = ll.a(0, var2_array);
                break L106;
              }
            }
            L107: {
              var2_array = il.a((byte) 97, "build");
              if (null != var2_array) {
                c.field_b = ll.a(0, var2_array);
                break L107;
              } else {
                break L107;
              }
            }
            L108: {
              var2_array = il.a((byte) 102, "remove");
              if (var2_array == null) {
                break L108;
              } else {
                gi.field_q = ll.a(0, var2_array);
                break L108;
              }
            }
            L109: {
              var2_array = il.a((byte) 95, "andactivateauto");
              if (null != var2_array) {
                gl.field_h = ll.a(0, var2_array);
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              var2_array = il.a((byte) 78, "andreturntomove");
              if (var2_array != null) {
                td.field_a = ll.a(0, var2_array);
                break L110;
              } else {
                break L110;
              }
            }
            L111: {
              var2_array = il.a((byte) 117, "reload");
              if (null != var2_array) {
                rf.field_q = ll.a(0, var2_array);
                break L111;
              } else {
                break L111;
              }
            }
            L112: {
              var2_array = il.a((byte) 117, "cost14");
              if (var2_array == null) {
                break L112;
              } else {
                hi.field_Y = ll.a(0, var2_array);
                break L112;
              }
            }
            L113: {
              var2_array = il.a((byte) 120, "selgren");
              if (var2_array != null) {
                wg.field_g = ll.a(0, var2_array);
                break L113;
              } else {
                break L113;
              }
            }
            L114: {
              var2_array = il.a((byte) 120, "deselgren");
              if (null == var2_array) {
                break L114;
              } else {
                kd.field_d = ll.a(param0 ^ 96, var2_array);
                break L114;
              }
            }
            L115: {
              var2_array = il.a((byte) 120, "endtheturn");
              if (null == var2_array) {
                break L115;
              } else {
                kd.field_e = ll.a(0, var2_array);
                break L115;
              }
            }
            L116: {
              var2_array = il.a((byte) 127, "notime");
              if (null == var2_array) {
                break L116;
              } else {
                hj.field_A = ll.a(0, var2_array);
                break L116;
              }
            }
            L117: {
              var2_array = il.a((byte) 116, "noroute");
              if (null == var2_array) {
                break L117;
              } else {
                rj.field_f = ll.a(param0 + -96, var2_array);
                break L117;
              }
            }
            L118: {
              var2_array = il.a((byte) 98, "enemyturn");
              if (null != var2_array) {
                mk.field_f = ll.a(0, var2_array);
                break L118;
              } else {
                break L118;
              }
            }
            L119: {
              var2_array = il.a((byte) 101, "clicktocontinue");
              if (null != var2_array) {
                jc.field_B = ll.a(0, var2_array);
                break L119;
              } else {
                break L119;
              }
            }
            L120: {
              var2_array = il.a((byte) 76, "startingturn");
              if (null == var2_array) {
                break L120;
              } else {
                mc.field_a = ll.a(0, var2_array);
                break L120;
              }
            }
            L121: {
              var2_array = il.a((byte) 82, "equipmentclasses,0");
              if (var2_array != null) {
                lb.field_c[0] = ll.a(0, var2_array);
                break L121;
              } else {
                break L121;
              }
            }
            L122: {
              var2_array = il.a((byte) 121, "equipmentclasses,1");
              if (null != var2_array) {
                lb.field_c[1] = ll.a(param0 + -96, var2_array);
                break L122;
              } else {
                break L122;
              }
            }
            L123: {
              var2_array = il.a((byte) 113, "equipmentclasses,2");
              if (var2_array == null) {
                break L123;
              } else {
                lb.field_c[2] = ll.a(0, var2_array);
                break L123;
              }
            }
            L124: {
              var2_array = il.a((byte) 82, "equipmentclasses,3");
              if (var2_array == null) {
                break L124;
              } else {
                lb.field_c[3] = ll.a(0, var2_array);
                break L124;
              }
            }
            L125: {
              var2_array = il.a((byte) 123, "equipmentclasses,4");
              if (var2_array == null) {
                break L125;
              } else {
                lb.field_c[4] = ll.a(param0 + -96, var2_array);
                break L125;
              }
            }
            L126: {
              var2_array = il.a((byte) 120, "equipmentclasses,5");
              if (var2_array == null) {
                break L126;
              } else {
                lb.field_c[5] = ll.a(0, var2_array);
                break L126;
              }
            }
            L127: {
              var2_array = il.a((byte) 72, "stockcolon");
              if (var2_array != null) {
                hk.field_c = ll.a(0, var2_array);
                break L127;
              } else {
                break L127;
              }
            }
            L128: {
              var2_array = il.a((byte) 121, "outofstock");
              if (var2_array == null) {
                break L128;
              } else {
                bh.field_j = ll.a(0, var2_array);
                break L128;
              }
            }
            L129: {
              var2_array = il.a((byte) 117, "armourcolon");
              if (null == var2_array) {
                break L129;
              } else {
                of.field_n = ll.a(0, var2_array);
                break L129;
              }
            }
            L130: {
              var2_array = il.a((byte) 71, "damagecolon");
              if (var2_array != null) {
                ab.field_e = ll.a(0, var2_array);
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              var2_array = il.a((byte) 113, "damagetypehighexplosive");
              if (var2_array != null) {
                im.field_a = ll.a(0, var2_array);
                break L131;
              } else {
                break L131;
              }
            }
            L132: {
              var2_array = il.a((byte) 117, "highexplosivelong");
              if (null != var2_array) {
                rl.field_a = ll.a(param0 + -96, var2_array);
                break L132;
              } else {
                break L132;
              }
            }
            L133: {
              var2_array = il.a((byte) 102, "clipsize");
              if (var2_array != null) {
                lm.field_f = ll.a(0, var2_array);
                break L133;
              } else {
                break L133;
              }
            }
            L134: {
              var2_array = il.a((byte) 79, "accuracycolon");
              if (var2_array != null) {
                wh.field_g = ll.a(0, var2_array);
                break L134;
              } else {
                break L134;
              }
            }
            L135: {
              var2_array = il.a((byte) 125, "throwtq");
              if (var2_array == null) {
                break L135;
              } else {
                bc.field_c = ll.a(0, var2_array);
                break L135;
              }
            }
            L136: {
              var2_array = il.a((byte) 116, "weightcolon");
              if (var2_array == null) {
                break L136;
              } else {
                ai.field_e = ll.a(param0 + -96, var2_array);
                break L136;
              }
            }
            L137: {
              var2_array = il.a((byte) 122, "shielding20");
              if (null != var2_array) {
                u.field_b = ll.a(0, var2_array);
                break L137;
              } else {
                break L137;
              }
            }
            L138: {
              var2_array = il.a((byte) 85, "firetq");
              if (null == var2_array) {
                break L138;
              } else {
                kh.field_K = ll.a(param0 + -96, var2_array);
                break L138;
              }
            }
            L139: {
              var2_array = il.a((byte) 119, "aimtq");
              if (var2_array == null) {
                break L139;
              } else {
                qk.field_k = ll.a(0, var2_array);
                break L139;
              }
            }
            L140: {
              var2_array = il.a((byte) 90, "aimaccur");
              if (null != var2_array) {
                ha.field_m = ll.a(0, var2_array);
                break L140;
              } else {
                break L140;
              }
            }
            L141: {
              var2_array = il.a((byte) 123, "snapaccur");
              if (null != var2_array) {
                ef.field_c = ll.a(0, var2_array);
                break L141;
              } else {
                break L141;
              }
            }
            L142: {
              var2_array = il.a((byte) 112, "rateoffires,0");
              if (var2_array != null) {
                di.field_h[0] = ll.a(param0 + -96, var2_array);
                break L142;
              } else {
                break L142;
              }
            }
            L143: {
              var2_array = il.a((byte) 125, "rateoffires,1");
              if (var2_array != null) {
                di.field_h[1] = ll.a(0, var2_array);
                break L143;
              } else {
                break L143;
              }
            }
            L144: {
              var2_array = il.a((byte) 95, "rateoffires,2");
              if (var2_array == null) {
                break L144;
              } else {
                di.field_h[2] = ll.a(0, var2_array);
                break L144;
              }
            }
            L145: {
              var2_array = il.a((byte) 74, "rateoffires,3");
              if (null == var2_array) {
                break L145;
              } else {
                di.field_h[3] = ll.a(sl.a((int) param0, 96), var2_array);
                break L145;
              }
            }
            L146: {
              var2_array = il.a((byte) 114, "rateoffires,4");
              if (var2_array != null) {
                di.field_h[4] = ll.a(0, var2_array);
                break L146;
              } else {
                break L146;
              }
            }
            L147: {
              var2_array = il.a((byte) 96, "recruit");
              if (null != var2_array) {
                pj.field_v = ll.a(0, var2_array);
                break L147;
              } else {
                break L147;
              }
            }
            L148: {
              var2_array = il.a((byte) 100, "shortrecruit");
              if (var2_array != null) {
                pd.field_e = ll.a(param0 + -96, var2_array);
                break L148;
              } else {
                break L148;
              }
            }
            L149: {
              var2_array = il.a((byte) 90, "warningencum");
              if (null != var2_array) {
                og.field_b = ll.a(param0 ^ 96, var2_array);
                break L149;
              } else {
                break L149;
              }
            }
            L150: {
              var2_array = il.a((byte) 88, "armournames,0");
              if (null != var2_array) {
                kh.field_H[0] = ll.a(param0 + -96, var2_array);
                break L150;
              } else {
                break L150;
              }
            }
            L151: {
              var2_array = il.a((byte) 95, "armournames,1");
              if (null != var2_array) {
                kh.field_H[1] = ll.a(sl.a((int) param0, 96), var2_array);
                break L151;
              } else {
                break L151;
              }
            }
            L152: {
              var2_array = il.a((byte) 93, "armournames,2");
              if (null != var2_array) {
                kh.field_H[2] = ll.a(0, var2_array);
                break L152;
              } else {
                break L152;
              }
            }
            L153: {
              var2_array = il.a((byte) 83, "armournames,3");
              if (var2_array == null) {
                break L153;
              } else {
                kh.field_H[3] = ll.a(0, var2_array);
                break L153;
              }
            }
            L154: {
              var2_array = il.a((byte) 88, "armourresearchnames,0");
              if (var2_array != null) {
                pf.field_e[0] = ll.a(0, var2_array);
                break L154;
              } else {
                break L154;
              }
            }
            L155: {
              var2_array = il.a((byte) 124, "armourresearchnames,1");
              if (null == var2_array) {
                break L155;
              } else {
                pf.field_e[1] = ll.a(param0 + -96, var2_array);
                break L155;
              }
            }
            L156: {
              var2_array = il.a((byte) 122, "armourresearchnames,2");
              if (var2_array != null) {
                pf.field_e[2] = ll.a(0, var2_array);
                break L156;
              } else {
                break L156;
              }
            }
            L157: {
              var2_array = il.a((byte) 91, "armourresearchnames,3");
              if (var2_array == null) {
                break L157;
              } else {
                pf.field_e[3] = ll.a(0, var2_array);
                break L157;
              }
            }
            L158: {
              var2_array = il.a((byte) 72, "armourdescriptions,0");
              if (null == var2_array) {
                break L158;
              } else {
                bd.field_f[0] = ll.a(0, var2_array);
                break L158;
              }
            }
            L159: {
              var2_array = il.a((byte) 76, "armourdescriptions,1");
              if (null == var2_array) {
                break L159;
              } else {
                bd.field_f[1] = ll.a(0, var2_array);
                break L159;
              }
            }
            L160: {
              var2_array = il.a((byte) 74, "armourdescriptions,2");
              if (var2_array == null) {
                break L160;
              } else {
                bd.field_f[2] = ll.a(param0 + -96, var2_array);
                break L160;
              }
            }
            L161: {
              var2_array = il.a((byte) 121, "armourdescriptions,3");
              if (null != var2_array) {
                bd.field_f[3] = ll.a(sl.a((int) param0, 96), var2_array);
                break L161;
              } else {
                break L161;
              }
            }
            L162: {
              var2_array = il.a((byte) 82, "armourresearchdescriptions,0");
              if (var2_array == null) {
                break L162;
              } else {
                jg.field_jb[0] = ll.a(0, var2_array);
                break L162;
              }
            }
            L163: {
              var2_array = il.a((byte) 113, "armourresearchdescriptions,1");
              if (null != var2_array) {
                jg.field_jb[1] = ll.a(0, var2_array);
                break L163;
              } else {
                break L163;
              }
            }
            L164: {
              var2_array = il.a((byte) 111, "armourresearchdescriptions,2");
              if (var2_array != null) {
                jg.field_jb[2] = ll.a(0, var2_array);
                break L164;
              } else {
                break L164;
              }
            }
            L165: {
              var2_array = il.a((byte) 71, "armourresearchdescriptions,3");
              if (var2_array != null) {
                jg.field_jb[3] = ll.a(param0 + -96, var2_array);
                break L165;
              } else {
                break L165;
              }
            }
            L166: {
              var2_array = il.a((byte) 88, "weaponnames,0");
              if (var2_array == null) {
                break L166;
              } else {
                uh.field_L[0] = ll.a(0, var2_array);
                break L166;
              }
            }
            L167: {
              var2_array = il.a((byte) 98, "weaponnames,1");
              if (null == var2_array) {
                break L167;
              } else {
                uh.field_L[1] = ll.a(0, var2_array);
                break L167;
              }
            }
            L168: {
              var2_array = il.a((byte) 126, "weaponnames,2");
              if (var2_array == null) {
                break L168;
              } else {
                uh.field_L[2] = ll.a(0, var2_array);
                break L168;
              }
            }
            L169: {
              var2_array = il.a((byte) 81, "weaponnames,3");
              if (var2_array != null) {
                uh.field_L[3] = ll.a(0, var2_array);
                break L169;
              } else {
                break L169;
              }
            }
            L170: {
              var2_array = il.a((byte) 88, "weaponnames,4");
              if (null == var2_array) {
                break L170;
              } else {
                uh.field_L[4] = ll.a(0, var2_array);
                break L170;
              }
            }
            L171: {
              var2_array = il.a((byte) 84, "weaponnames,5");
              if (var2_array != null) {
                uh.field_L[5] = ll.a(sl.a((int) param0, 96), var2_array);
                break L171;
              } else {
                break L171;
              }
            }
            L172: {
              var2_array = il.a((byte) 95, "weaponnames,6");
              if (var2_array == null) {
                break L172;
              } else {
                uh.field_L[6] = ll.a(0, var2_array);
                break L172;
              }
            }
            L173: {
              var2_array = il.a((byte) 79, "weaponnames,7");
              if (var2_array == null) {
                break L173;
              } else {
                uh.field_L[7] = ll.a(0, var2_array);
                break L173;
              }
            }
            L174: {
              var2_array = il.a((byte) 108, "weaponnames,8");
              if (var2_array == null) {
                break L174;
              } else {
                uh.field_L[8] = ll.a(0, var2_array);
                break L174;
              }
            }
            L175: {
              var2_array = il.a((byte) 73, "weaponnames,9");
              if (var2_array != null) {
                uh.field_L[9] = ll.a(0, var2_array);
                break L175;
              } else {
                break L175;
              }
            }
            L176: {
              var2_array = il.a((byte) 113, "weaponnames,10");
              if (null == var2_array) {
                break L176;
              } else {
                uh.field_L[10] = ll.a(0, var2_array);
                break L176;
              }
            }
            L177: {
              var2_array = il.a((byte) 101, "weaponnames,11");
              if (var2_array != null) {
                uh.field_L[11] = ll.a(0, var2_array);
                break L177;
              } else {
                break L177;
              }
            }
            L178: {
              var2_array = il.a((byte) 117, "weaponnames,12");
              if (null != var2_array) {
                uh.field_L[12] = ll.a(0, var2_array);
                break L178;
              } else {
                break L178;
              }
            }
            L179: {
              var2_array = il.a((byte) 117, "weaponnames,13");
              if (null == var2_array) {
                break L179;
              } else {
                uh.field_L[13] = ll.a(sl.a((int) param0, 96), var2_array);
                break L179;
              }
            }
            L180: {
              var2_array = il.a((byte) 100, "weaponnames,14");
              if (var2_array == null) {
                break L180;
              } else {
                uh.field_L[14] = ll.a(0, var2_array);
                break L180;
              }
            }
            L181: {
              var2_array = il.a((byte) 102, "weaponnames,15");
              if (var2_array == null) {
                break L181;
              } else {
                uh.field_L[15] = ll.a(0, var2_array);
                break L181;
              }
            }
            L182: {
              var2_array = il.a((byte) 120, "weaponnames,16");
              if (null != var2_array) {
                uh.field_L[16] = ll.a(param0 + -96, var2_array);
                break L182;
              } else {
                break L182;
              }
            }
            L183: {
              var2_array = il.a((byte) 94, "weaponnames,17");
              if (null != var2_array) {
                uh.field_L[17] = ll.a(0, var2_array);
                break L183;
              } else {
                break L183;
              }
            }
            L184: {
              var2_array = il.a((byte) 95, "weaponnames,18");
              if (var2_array == null) {
                break L184;
              } else {
                uh.field_L[18] = ll.a(0, var2_array);
                break L184;
              }
            }
            L185: {
              var2_array = il.a((byte) 92, "weaponnames,19");
              if (var2_array != null) {
                uh.field_L[19] = ll.a(0, var2_array);
                break L185;
              } else {
                break L185;
              }
            }
            L186: {
              var2_array = il.a((byte) 110, "weaponnames,20");
              if (null == var2_array) {
                break L186;
              } else {
                uh.field_L[20] = ll.a(0, var2_array);
                break L186;
              }
            }
            L187: {
              var2_array = il.a((byte) 104, "weaponresearchnames,0");
              if (var2_array != null) {
                of.field_h[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L187;
              } else {
                break L187;
              }
            }
            L188: {
              var2_array = il.a((byte) 119, "weaponresearchnames,1");
              if (var2_array == null) {
                break L188;
              } else {
                of.field_h[1] = ll.a(0, var2_array);
                break L188;
              }
            }
            L189: {
              var2_array = il.a((byte) 71, "weaponresearchnames,2");
              if (var2_array != null) {
                of.field_h[2] = ll.a(0, var2_array);
                break L189;
              } else {
                break L189;
              }
            }
            L190: {
              var2_array = il.a((byte) 125, "weaponresearchnames,3");
              if (null != var2_array) {
                of.field_h[3] = ll.a(sl.a((int) param0, 96), var2_array);
                break L190;
              } else {
                break L190;
              }
            }
            L191: {
              var2_array = il.a((byte) 92, "weaponresearchnames,4");
              if (var2_array != null) {
                of.field_h[4] = ll.a(param0 + -96, var2_array);
                break L191;
              } else {
                break L191;
              }
            }
            L192: {
              var2_array = il.a((byte) 80, "weaponresearchnames,5");
              if (null != var2_array) {
                of.field_h[5] = ll.a(sl.a((int) param0, 96), var2_array);
                break L192;
              } else {
                break L192;
              }
            }
            L193: {
              var2_array = il.a((byte) 127, "weaponresearchnames,6");
              if (var2_array == null) {
                break L193;
              } else {
                of.field_h[6] = ll.a(0, var2_array);
                break L193;
              }
            }
            L194: {
              var2_array = il.a((byte) 91, "weaponresearchnames,7");
              if (null != var2_array) {
                of.field_h[7] = ll.a(0, var2_array);
                break L194;
              } else {
                break L194;
              }
            }
            L195: {
              var2_array = il.a((byte) 100, "weaponresearchnames,8");
              if (null != var2_array) {
                of.field_h[8] = ll.a(0, var2_array);
                break L195;
              } else {
                break L195;
              }
            }
            L196: {
              var2_array = il.a((byte) 88, "weaponresearchnames,9");
              if (var2_array != null) {
                of.field_h[9] = ll.a(sl.a((int) param0, 96), var2_array);
                break L196;
              } else {
                break L196;
              }
            }
            L197: {
              var2_array = il.a((byte) 122, "weaponresearchnames,10");
              if (var2_array != null) {
                of.field_h[10] = ll.a(param0 + -96, var2_array);
                break L197;
              } else {
                break L197;
              }
            }
            L198: {
              var2_array = il.a((byte) 81, "weaponresearchnames,11");
              if (null == var2_array) {
                break L198;
              } else {
                of.field_h[11] = ll.a(0, var2_array);
                break L198;
              }
            }
            L199: {
              var2_array = il.a((byte) 88, "weaponresearchnames,12");
              if (null == var2_array) {
                break L199;
              } else {
                of.field_h[12] = ll.a(0, var2_array);
                break L199;
              }
            }
            L200: {
              var2_array = il.a((byte) 101, "weaponresearchnames,13");
              if (var2_array != null) {
                of.field_h[13] = ll.a(0, var2_array);
                break L200;
              } else {
                break L200;
              }
            }
            L201: {
              var2_array = il.a((byte) 75, "weaponresearchnames,14");
              if (var2_array != null) {
                of.field_h[14] = ll.a(0, var2_array);
                break L201;
              } else {
                break L201;
              }
            }
            L202: {
              var2_array = il.a((byte) 105, "weaponresearchnames,15");
              if (null == var2_array) {
                break L202;
              } else {
                of.field_h[15] = ll.a(param0 + -96, var2_array);
                break L202;
              }
            }
            L203: {
              var2_array = il.a((byte) 99, "weaponresearchnames,16");
              if (var2_array == null) {
                break L203;
              } else {
                of.field_h[16] = ll.a(0, var2_array);
                break L203;
              }
            }
            L204: {
              var2_array = il.a((byte) 125, "weaponresearchnames,17");
              if (var2_array != null) {
                of.field_h[17] = ll.a(0, var2_array);
                break L204;
              } else {
                break L204;
              }
            }
            L205: {
              var2_array = il.a((byte) 71, "weaponresearchnames,18");
              if (var2_array != null) {
                of.field_h[18] = ll.a(0, var2_array);
                break L205;
              } else {
                break L205;
              }
            }
            L206: {
              var2_array = il.a((byte) 95, "weaponresearchnames,19");
              if (null == var2_array) {
                break L206;
              } else {
                of.field_h[19] = ll.a(0, var2_array);
                break L206;
              }
            }
            L207: {
              var2_array = il.a((byte) 94, "weaponresearchnames,20");
              if (null != var2_array) {
                of.field_h[20] = ll.a(0, var2_array);
                break L207;
              } else {
                break L207;
              }
            }
            L208: {
              var2_array = il.a((byte) 97, "weapondescriptions,0");
              if (var2_array == null) {
                break L208;
              } else {
                i.field_b[0] = ll.a(0, var2_array);
                break L208;
              }
            }
            L209: {
              var2_array = il.a((byte) 101, "weapondescriptions,1");
              if (null != var2_array) {
                i.field_b[1] = ll.a(0, var2_array);
                break L209;
              } else {
                break L209;
              }
            }
            L210: {
              var2_array = il.a((byte) 127, "weapondescriptions,2");
              if (var2_array != null) {
                i.field_b[2] = ll.a(param0 + -96, var2_array);
                break L210;
              } else {
                break L210;
              }
            }
            L211: {
              var2_array = il.a((byte) 77, "weapondescriptions,3");
              if (var2_array == null) {
                break L211;
              } else {
                i.field_b[3] = ll.a(param0 + -96, var2_array);
                break L211;
              }
            }
            L212: {
              var2_array = il.a((byte) 87, "weapondescriptions,4");
              if (null != var2_array) {
                i.field_b[4] = ll.a(0, var2_array);
                break L212;
              } else {
                break L212;
              }
            }
            L213: {
              var2_array = il.a((byte) 88, "weapondescriptions,5");
              if (null != var2_array) {
                i.field_b[5] = ll.a(0, var2_array);
                break L213;
              } else {
                break L213;
              }
            }
            L214: {
              var2_array = il.a((byte) 108, "weapondescriptions,6");
              if (null == var2_array) {
                break L214;
              } else {
                i.field_b[6] = ll.a(param0 + -96, var2_array);
                break L214;
              }
            }
            L215: {
              var2_array = il.a((byte) 78, "weapondescriptions,7");
              if (var2_array != null) {
                i.field_b[7] = ll.a(sl.a((int) param0, 96), var2_array);
                break L215;
              } else {
                break L215;
              }
            }
            L216: {
              var2_array = il.a((byte) 97, "weapondescriptions,8");
              if (var2_array != null) {
                i.field_b[8] = ll.a(sl.a((int) param0, 96), var2_array);
                break L216;
              } else {
                break L216;
              }
            }
            L217: {
              var2_array = il.a((byte) 97, "weapondescriptions,9");
              if (var2_array != null) {
                i.field_b[9] = ll.a(0, var2_array);
                break L217;
              } else {
                break L217;
              }
            }
            L218: {
              var2_array = il.a((byte) 102, "weapondescriptions,10");
              if (var2_array == null) {
                break L218;
              } else {
                i.field_b[10] = ll.a(sl.a((int) param0, 96), var2_array);
                break L218;
              }
            }
            L219: {
              var2_array = il.a((byte) 97, "weapondescriptions,11");
              if (null != var2_array) {
                i.field_b[11] = ll.a(sl.a((int) param0, 96), var2_array);
                break L219;
              } else {
                break L219;
              }
            }
            L220: {
              var2_array = il.a((byte) 97, "weapondescriptions,12");
              if (null != var2_array) {
                i.field_b[12] = ll.a(0, var2_array);
                break L220;
              } else {
                break L220;
              }
            }
            L221: {
              var2_array = il.a((byte) 122, "weapondescriptions,13");
              if (var2_array == null) {
                break L221;
              } else {
                i.field_b[13] = ll.a(sl.a((int) param0, 96), var2_array);
                break L221;
              }
            }
            L222: {
              var2_array = il.a((byte) 120, "weapondescriptions,14");
              if (null != var2_array) {
                i.field_b[14] = ll.a(0, var2_array);
                break L222;
              } else {
                break L222;
              }
            }
            L223: {
              var2_array = il.a((byte) 125, "weapondescriptions,15");
              if (var2_array == null) {
                break L223;
              } else {
                i.field_b[15] = ll.a(0, var2_array);
                break L223;
              }
            }
            L224: {
              var2_array = il.a((byte) 120, "weapondescriptions,16");
              if (null != var2_array) {
                i.field_b[16] = ll.a(0, var2_array);
                break L224;
              } else {
                break L224;
              }
            }
            L225: {
              var2_array = il.a((byte) 72, "weapondescriptions,17");
              if (null == var2_array) {
                break L225;
              } else {
                i.field_b[17] = ll.a(0, var2_array);
                break L225;
              }
            }
            L226: {
              var2_array = il.a((byte) 73, "weapondescriptions,18");
              if (null == var2_array) {
                break L226;
              } else {
                i.field_b[18] = ll.a(0, var2_array);
                break L226;
              }
            }
            L227: {
              var2_array = il.a((byte) 95, "weapondescriptions,19");
              if (var2_array == null) {
                break L227;
              } else {
                i.field_b[19] = ll.a(0, var2_array);
                break L227;
              }
            }
            L228: {
              var2_array = il.a((byte) 90, "weapondescriptions,20");
              if (var2_array != null) {
                i.field_b[20] = ll.a(0, var2_array);
                break L228;
              } else {
                break L228;
              }
            }
            L229: {
              var2_array = il.a((byte) 103, "weaponresearchdescriptions,0");
              if (null == var2_array) {
                break L229;
              } else {
                da.field_i[0] = ll.a(0, var2_array);
                break L229;
              }
            }
            L230: {
              var2_array = il.a((byte) 86, "weaponresearchdescriptions,1");
              if (null != var2_array) {
                da.field_i[1] = ll.a(param0 + -96, var2_array);
                break L230;
              } else {
                break L230;
              }
            }
            L231: {
              var2_array = il.a((byte) 100, "weaponresearchdescriptions,2");
              if (null == var2_array) {
                break L231;
              } else {
                da.field_i[2] = ll.a(0, var2_array);
                break L231;
              }
            }
            L232: {
              var2_array = il.a((byte) 127, "weaponresearchdescriptions,3");
              if (null != var2_array) {
                da.field_i[3] = ll.a(0, var2_array);
                break L232;
              } else {
                break L232;
              }
            }
            L233: {
              var2_array = il.a((byte) 98, "weaponresearchdescriptions,4");
              if (null == var2_array) {
                break L233;
              } else {
                da.field_i[4] = ll.a(sl.a((int) param0, 96), var2_array);
                break L233;
              }
            }
            L234: {
              var2_array = il.a((byte) 72, "weaponresearchdescriptions,5");
              if (var2_array != null) {
                da.field_i[5] = ll.a(0, var2_array);
                break L234;
              } else {
                break L234;
              }
            }
            L235: {
              var2_array = il.a((byte) 91, "weaponresearchdescriptions,6");
              if (null != var2_array) {
                da.field_i[6] = ll.a(0, var2_array);
                break L235;
              } else {
                break L235;
              }
            }
            L236: {
              var2_array = il.a((byte) 72, "weaponresearchdescriptions,7");
              if (null == var2_array) {
                break L236;
              } else {
                da.field_i[7] = ll.a(0, var2_array);
                break L236;
              }
            }
            L237: {
              var2_array = il.a((byte) 101, "weaponresearchdescriptions,8");
              if (var2_array == null) {
                break L237;
              } else {
                da.field_i[8] = ll.a(0, var2_array);
                break L237;
              }
            }
            L238: {
              var2_array = il.a((byte) 103, "weaponresearchdescriptions,9");
              if (null == var2_array) {
                break L238;
              } else {
                da.field_i[9] = ll.a(sl.a((int) param0, 96), var2_array);
                break L238;
              }
            }
            L239: {
              var2_array = il.a((byte) 76, "weaponresearchdescriptions,10");
              if (var2_array != null) {
                da.field_i[10] = ll.a(param0 + -96, var2_array);
                break L239;
              } else {
                break L239;
              }
            }
            L240: {
              var2_array = il.a((byte) 78, "weaponresearchdescriptions,11");
              if (var2_array == null) {
                break L240;
              } else {
                da.field_i[11] = ll.a(sl.a((int) param0, 96), var2_array);
                break L240;
              }
            }
            L241: {
              var2_array = il.a((byte) 109, "weaponresearchdescriptions,12");
              if (var2_array != null) {
                da.field_i[12] = ll.a(0, var2_array);
                break L241;
              } else {
                break L241;
              }
            }
            L242: {
              var2_array = il.a((byte) 121, "weaponresearchdescriptions,13");
              if (null != var2_array) {
                da.field_i[13] = ll.a(0, var2_array);
                break L242;
              } else {
                break L242;
              }
            }
            L243: {
              var2_array = il.a((byte) 87, "weaponresearchdescriptions,14");
              if (null == var2_array) {
                break L243;
              } else {
                da.field_i[14] = ll.a(0, var2_array);
                break L243;
              }
            }
            L244: {
              var2_array = il.a((byte) 105, "weaponresearchdescriptions,15");
              if (var2_array != null) {
                da.field_i[15] = ll.a(0, var2_array);
                break L244;
              } else {
                break L244;
              }
            }
            L245: {
              var2_array = il.a((byte) 83, "weaponresearchdescriptions,16");
              if (null != var2_array) {
                da.field_i[16] = ll.a(0, var2_array);
                break L245;
              } else {
                break L245;
              }
            }
            L246: {
              var2_array = il.a((byte) 88, "weaponresearchdescriptions,17");
              if (null != var2_array) {
                da.field_i[17] = ll.a(param0 + -96, var2_array);
                break L246;
              } else {
                break L246;
              }
            }
            L247: {
              var2_array = il.a((byte) 118, "weaponresearchdescriptions,18");
              if (null == var2_array) {
                break L247;
              } else {
                da.field_i[18] = ll.a(0, var2_array);
                break L247;
              }
            }
            L248: {
              var2_array = il.a((byte) 110, "weaponresearchdescriptions,19");
              if (var2_array == null) {
                break L248;
              } else {
                da.field_i[19] = ll.a(0, var2_array);
                break L248;
              }
            }
            L249: {
              var2_array = il.a((byte) 123, "weaponresearchdescriptions,20");
              if (var2_array != null) {
                da.field_i[20] = ll.a(0, var2_array);
                break L249;
              } else {
                break L249;
              }
            }
            L250: {
              var2_array = il.a((byte) 93, "alliedsoldier");
              if (var2_array == null) {
                break L250;
              } else {
                ig.field_c = ll.a(0, var2_array);
                break L250;
              }
            }
            L251: {
              var2_array = il.a((byte) 115, "instructions0,0");
              if (null == var2_array) {
                break L251;
              } else {
                qd.field_h[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L251;
              }
            }
            L252: {
              var2_array = il.a((byte) 98, "instructions0,1");
              if (var2_array == null) {
                break L252;
              } else {
                qd.field_h[1] = ll.a(0, var2_array);
                break L252;
              }
            }
            L253: {
              var2_array = il.a((byte) 87, "instructions0,2");
              if (null == var2_array) {
                break L253;
              } else {
                qd.field_h[2] = ll.a(sl.a((int) param0, 96), var2_array);
                break L253;
              }
            }
            L254: {
              var2_array = il.a((byte) 84, "instructions0,3");
              if (var2_array != null) {
                qd.field_h[3] = ll.a(param0 + -96, var2_array);
                break L254;
              } else {
                break L254;
              }
            }
            L255: {
              var2_array = il.a((byte) 101, "instructions0,4");
              if (var2_array != null) {
                qd.field_h[4] = ll.a(0, var2_array);
                break L255;
              } else {
                break L255;
              }
            }
            L256: {
              var2_array = il.a((byte) 72, "instructions0,5");
              if (null == var2_array) {
                break L256;
              } else {
                qd.field_h[5] = ll.a(0, var2_array);
                break L256;
              }
            }
            L257: {
              var2_array = il.a((byte) 109, "instructions0,6");
              if (var2_array != null) {
                qd.field_h[6] = ll.a(param0 + -96, var2_array);
                break L257;
              } else {
                break L257;
              }
            }
            L258: {
              var2_array = il.a((byte) 97, "instructions1,0");
              if (var2_array != null) {
                nd.field_o[0] = ll.a(0, var2_array);
                break L258;
              } else {
                break L258;
              }
            }
            L259: {
              var2_array = il.a((byte) 98, "instructions1,1");
              if (var2_array == null) {
                break L259;
              } else {
                nd.field_o[1] = ll.a(0, var2_array);
                break L259;
              }
            }
            L260: {
              var2_array = il.a((byte) 100, "instructions1,2");
              if (var2_array == null) {
                break L260;
              } else {
                nd.field_o[2] = ll.a(0, var2_array);
                break L260;
              }
            }
            L261: {
              var2_array = il.a((byte) 94, "instructions1,3");
              if (var2_array != null) {
                nd.field_o[3] = ll.a(0, var2_array);
                break L261;
              } else {
                break L261;
              }
            }
            L262: {
              var2_array = il.a((byte) 100, "instructions1,4");
              if (var2_array != null) {
                nd.field_o[4] = ll.a(0, var2_array);
                break L262;
              } else {
                break L262;
              }
            }
            L263: {
              var2_array = il.a((byte) 109, "instructions1,5");
              if (null != var2_array) {
                nd.field_o[5] = ll.a(0, var2_array);
                break L263;
              } else {
                break L263;
              }
            }
            L264: {
              var2_array = il.a((byte) 83, "instructions1,6");
              if (null == var2_array) {
                break L264;
              } else {
                nd.field_o[6] = ll.a(0, var2_array);
                break L264;
              }
            }
            L265: {
              var2_array = il.a((byte) 115, "instructions1,7");
              if (null != var2_array) {
                nd.field_o[7] = ll.a(0, var2_array);
                break L265;
              } else {
                break L265;
              }
            }
            L266: {
              var2_array = il.a((byte) 98, "instructions1,8");
              if (var2_array == null) {
                break L266;
              } else {
                nd.field_o[8] = ll.a(0, var2_array);
                break L266;
              }
            }
            L267: {
              var2_array = il.a((byte) 90, "instructions1,9");
              if (var2_array != null) {
                nd.field_o[9] = ll.a(0, var2_array);
                break L267;
              } else {
                break L267;
              }
            }
            L268: {
              var2_array = il.a((byte) 119, "instructions1,10");
              if (null == var2_array) {
                break L268;
              } else {
                nd.field_o[10] = ll.a(0, var2_array);
                break L268;
              }
            }
            L269: {
              var2_array = il.a((byte) 108, "instructions1,11");
              if (null == var2_array) {
                break L269;
              } else {
                nd.field_o[11] = ll.a(0, var2_array);
                break L269;
              }
            }
            L270: {
              var2_array = il.a((byte) 75, "instructions1,12");
              if (null == var2_array) {
                break L270;
              } else {
                nd.field_o[12] = ll.a(0, var2_array);
                break L270;
              }
            }
            L271: {
              var2_array = il.a((byte) 99, "instructions1,13");
              if (null != var2_array) {
                nd.field_o[13] = ll.a(0, var2_array);
                break L271;
              } else {
                break L271;
              }
            }
            L272: {
              var2_array = il.a((byte) 111, "instructions1,14");
              if (var2_array != null) {
                nd.field_o[14] = ll.a(0, var2_array);
                break L272;
              } else {
                break L272;
              }
            }
            L273: {
              var2_array = il.a((byte) 102, "instructions1,15");
              if (var2_array == null) {
                break L273;
              } else {
                nd.field_o[15] = ll.a(0, var2_array);
                break L273;
              }
            }
            L274: {
              var2_array = il.a((byte) 94, "instructions2,0");
              if (var2_array == null) {
                break L274;
              } else {
                mb.field_p[0] = ll.a(0, var2_array);
                break L274;
              }
            }
            L275: {
              var2_array = il.a((byte) 122, "instructions2,1");
              if (null == var2_array) {
                break L275;
              } else {
                mb.field_p[1] = ll.a(0, var2_array);
                break L275;
              }
            }
            L276: {
              var2_array = il.a((byte) 116, "instructions2,2");
              if (var2_array == null) {
                break L276;
              } else {
                mb.field_p[2] = ll.a(0, var2_array);
                break L276;
              }
            }
            L277: {
              var2_array = il.a((byte) 100, "instructions2,3");
              if (null != var2_array) {
                mb.field_p[3] = ll.a(0, var2_array);
                break L277;
              } else {
                break L277;
              }
            }
            L278: {
              var2_array = il.a((byte) 125, "instructions2,4");
              if (var2_array == null) {
                break L278;
              } else {
                mb.field_p[4] = ll.a(param0 + -96, var2_array);
                break L278;
              }
            }
            L279: {
              var2_array = il.a((byte) 96, "instructions2,5");
              if (var2_array == null) {
                break L279;
              } else {
                mb.field_p[5] = ll.a(0, var2_array);
                break L279;
              }
            }
            L280: {
              var2_array = il.a((byte) 82, "instructions2,6");
              if (null == var2_array) {
                break L280;
              } else {
                mb.field_p[6] = ll.a(0, var2_array);
                break L280;
              }
            }
            L281: {
              var2_array = il.a((byte) 92, "instructions3,0");
              if (var2_array == null) {
                break L281;
              } else {
                dd.field_O[0] = ll.a(0, var2_array);
                break L281;
              }
            }
            L282: {
              var2_array = il.a((byte) 110, "instructions3,1");
              if (var2_array != null) {
                dd.field_O[1] = ll.a(0, var2_array);
                break L282;
              } else {
                break L282;
              }
            }
            L283: {
              var2_array = il.a((byte) 112, "instructions3,2");
              if (null == var2_array) {
                break L283;
              } else {
                dd.field_O[2] = ll.a(0, var2_array);
                break L283;
              }
            }
            L284: {
              var2_array = il.a((byte) 96, "instructions3,3");
              if (null == var2_array) {
                break L284;
              } else {
                dd.field_O[3] = ll.a(0, var2_array);
                break L284;
              }
            }
            L285: {
              var2_array = il.a((byte) 119, "instructions3,4");
              if (null == var2_array) {
                break L285;
              } else {
                dd.field_O[4] = ll.a(0, var2_array);
                break L285;
              }
            }
            L286: {
              var2_array = il.a((byte) 103, "instructions3,5");
              if (null == var2_array) {
                break L286;
              } else {
                dd.field_O[5] = ll.a(0, var2_array);
                break L286;
              }
            }
            L287: {
              var2_array = il.a((byte) 113, "instructions3,6");
              if (null == var2_array) {
                break L287;
              } else {
                dd.field_O[6] = ll.a(0, var2_array);
                break L287;
              }
            }
            L288: {
              var2_array = il.a((byte) 74, "instructions3,7");
              if (var2_array != null) {
                dd.field_O[7] = ll.a(0, var2_array);
                break L288;
              } else {
                break L288;
              }
            }
            L289: {
              var2_array = il.a((byte) 93, "instructions3,8");
              if (var2_array == null) {
                break L289;
              } else {
                dd.field_O[8] = ll.a(0, var2_array);
                break L289;
              }
            }
            L290: {
              var2_array = il.a((byte) 89, "instructions3,9");
              if (null == var2_array) {
                break L290;
              } else {
                dd.field_O[9] = ll.a(0, var2_array);
                break L290;
              }
            }
            L291: {
              var2_array = il.a((byte) 77, "instructions3,10");
              if (var2_array != null) {
                dd.field_O[10] = ll.a(0, var2_array);
                break L291;
              } else {
                break L291;
              }
            }
            L292: {
              var2_array = il.a((byte) 77, "instructions3,11");
              if (var2_array != null) {
                dd.field_O[11] = ll.a(sl.a((int) param0, 96), var2_array);
                break L292;
              } else {
                break L292;
              }
            }
            L293: {
              var2_array = il.a((byte) 125, "instructions3,12");
              if (null == var2_array) {
                break L293;
              } else {
                dd.field_O[12] = ll.a(0, var2_array);
                break L293;
              }
            }
            L294: {
              var2_array = il.a((byte) 92, "instructions3,13");
              if (null == var2_array) {
                break L294;
              } else {
                dd.field_O[13] = ll.a(0, var2_array);
                break L294;
              }
            }
            L295: {
              var2_array = il.a((byte) 119, "instructions3,14");
              if (null != var2_array) {
                dd.field_O[14] = ll.a(0, var2_array);
                break L295;
              } else {
                break L295;
              }
            }
            L296: {
              var2_array = il.a((byte) 124, "instructions3,15");
              if (null != var2_array) {
                dd.field_O[15] = ll.a(0, var2_array);
                break L296;
              } else {
                break L296;
              }
            }
            L297: {
              var2_array = il.a((byte) 119, "instructions3,16");
              if (var2_array == null) {
                break L297;
              } else {
                dd.field_O[16] = ll.a(0, var2_array);
                break L297;
              }
            }
            L298: {
              var2_array = il.a((byte) 119, "instructions4,0");
              if (null != var2_array) {
                ij.field_a[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L298;
              } else {
                break L298;
              }
            }
            L299: {
              var2_array = il.a((byte) 105, "instructions4,1");
              if (null == var2_array) {
                break L299;
              } else {
                ij.field_a[1] = ll.a(0, var2_array);
                break L299;
              }
            }
            L300: {
              var2_array = il.a((byte) 118, "instructions4,2");
              if (var2_array != null) {
                ij.field_a[2] = ll.a(sl.a((int) param0, 96), var2_array);
                break L300;
              } else {
                break L300;
              }
            }
            L301: {
              var2_array = il.a((byte) 100, "instructions4,3");
              if (null == var2_array) {
                break L301;
              } else {
                ij.field_a[3] = ll.a(0, var2_array);
                break L301;
              }
            }
            L302: {
              var2_array = il.a((byte) 114, "instructions4,4");
              if (null != var2_array) {
                ij.field_a[4] = ll.a(0, var2_array);
                break L302;
              } else {
                break L302;
              }
            }
            L303: {
              var2_array = il.a((byte) 102, "instructions4,5");
              if (null == var2_array) {
                break L303;
              } else {
                ij.field_a[5] = ll.a(0, var2_array);
                break L303;
              }
            }
            L304: {
              var2_array = il.a((byte) 104, "instructions4,6");
              if (null != var2_array) {
                ij.field_a[6] = ll.a(0, var2_array);
                break L304;
              } else {
                break L304;
              }
            }
            L305: {
              var2_array = il.a((byte) 83, "instructions5,0");
              if (var2_array == null) {
                break L305;
              } else {
                oi.field_M[0] = ll.a(0, var2_array);
                break L305;
              }
            }
            L306: {
              var2_array = il.a((byte) 121, "instructions5,1");
              if (var2_array == null) {
                break L306;
              } else {
                oi.field_M[1] = ll.a(sl.a((int) param0, 96), var2_array);
                break L306;
              }
            }
            L307: {
              var2_array = il.a((byte) 103, "instructions5,2");
              if (var2_array != null) {
                oi.field_M[2] = ll.a(0, var2_array);
                break L307;
              } else {
                break L307;
              }
            }
            L308: {
              var2_array = il.a((byte) 123, "instructions5,3");
              if (null == var2_array) {
                break L308;
              } else {
                oi.field_M[3] = ll.a(0, var2_array);
                break L308;
              }
            }
            L309: {
              var2_array = il.a((byte) 95, "instructions6,0");
              if (null != var2_array) {
                k.field_d[0] = ll.a(0, var2_array);
                break L309;
              } else {
                break L309;
              }
            }
            L310: {
              var2_array = il.a((byte) 72, "instructions6,1");
              if (var2_array != null) {
                k.field_d[1] = ll.a(0, var2_array);
                break L310;
              } else {
                break L310;
              }
            }
            L311: {
              var2_array = il.a((byte) 76, "instructions6,2");
              if (null != var2_array) {
                k.field_d[2] = ll.a(param0 + -96, var2_array);
                break L311;
              } else {
                break L311;
              }
            }
            L312: {
              var2_array = il.a((byte) 117, "instructions6,3");
              if (null != var2_array) {
                k.field_d[3] = ll.a(0, var2_array);
                break L312;
              } else {
                break L312;
              }
            }
            L313: {
              var2_array = il.a((byte) 105, "instructions6,4");
              if (null != var2_array) {
                k.field_d[4] = ll.a(0, var2_array);
                break L313;
              } else {
                break L313;
              }
            }
            L314: {
              var2_array = il.a((byte) 114, "instructions6,5");
              if (var2_array == null) {
                break L314;
              } else {
                k.field_d[5] = ll.a(sl.a((int) param0, 96), var2_array);
                break L314;
              }
            }
            L315: {
              var2_array = il.a((byte) 85, "instructions7,0");
              if (null == var2_array) {
                break L315;
              } else {
                o.field_a[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L315;
              }
            }
            L316: {
              var2_array = il.a((byte) 121, "instructions7,1");
              if (null != var2_array) {
                o.field_a[1] = ll.a(0, var2_array);
                break L316;
              } else {
                break L316;
              }
            }
            L317: {
              var2_array = il.a((byte) 115, "instructions7,2");
              if (var2_array == null) {
                break L317;
              } else {
                o.field_a[2] = ll.a(0, var2_array);
                break L317;
              }
            }
            L318: {
              var2_array = il.a((byte) 120, "instructions7,3");
              if (null != var2_array) {
                o.field_a[3] = ll.a(0, var2_array);
                break L318;
              } else {
                break L318;
              }
            }
            L319: {
              var2_array = il.a((byte) 100, "instructions7,4");
              if (var2_array == null) {
                break L319;
              } else {
                o.field_a[4] = ll.a(param0 + -96, var2_array);
                break L319;
              }
            }
            L320: {
              var2_array = il.a((byte) 76, "instructions7,5");
              if (var2_array == null) {
                break L320;
              } else {
                o.field_a[5] = ll.a(0, var2_array);
                break L320;
              }
            }
            L321: {
              var2_array = il.a((byte) 99, "instructions8,0");
              if (null == var2_array) {
                break L321;
              } else {
                vb.field_f[0] = ll.a(0, var2_array);
                break L321;
              }
            }
            L322: {
              var2_array = il.a((byte) 113, "instructions8,1");
              if (null != var2_array) {
                vb.field_f[1] = ll.a(0, var2_array);
                break L322;
              } else {
                break L322;
              }
            }
            L323: {
              var2_array = il.a((byte) 113, "instructions8,2");
              if (null == var2_array) {
                break L323;
              } else {
                vb.field_f[2] = ll.a(0, var2_array);
                break L323;
              }
            }
            L324: {
              var2_array = il.a((byte) 118, "instructions8,3");
              if (null == var2_array) {
                break L324;
              } else {
                vb.field_f[3] = ll.a(0, var2_array);
                break L324;
              }
            }
            L325: {
              var2_array = il.a((byte) 80, "instructions8,4");
              if (var2_array == null) {
                break L325;
              } else {
                vb.field_f[4] = ll.a(sl.a((int) param0, 96), var2_array);
                break L325;
              }
            }
            L326: {
              var2_array = il.a((byte) 91, "instructions8,5");
              if (var2_array == null) {
                break L326;
              } else {
                vb.field_f[5] = ll.a(0, var2_array);
                break L326;
              }
            }
            L327: {
              var2_array = il.a((byte) 106, "instructions8,6");
              if (var2_array == null) {
                break L327;
              } else {
                vb.field_f[6] = ll.a(0, var2_array);
                break L327;
              }
            }
            L328: {
              var2_array = il.a((byte) 111, "instructions8,7");
              if (var2_array == null) {
                break L328;
              } else {
                vb.field_f[7] = ll.a(0, var2_array);
                break L328;
              }
            }
            L329: {
              var2_array = il.a((byte) 108, "instructions8,8");
              if (null == var2_array) {
                break L329;
              } else {
                vb.field_f[8] = ll.a(0, var2_array);
                break L329;
              }
            }
            L330: {
              var2_array = il.a((byte) 110, "instructions8,9");
              if (var2_array != null) {
                vb.field_f[9] = ll.a(0, var2_array);
                break L330;
              } else {
                break L330;
              }
            }
            L331: {
              var2_array = il.a((byte) 90, "instructions8,10");
              if (null != var2_array) {
                vb.field_f[10] = ll.a(0, var2_array);
                break L331;
              } else {
                break L331;
              }
            }
            L332: {
              var2_array = il.a((byte) 105, "instructions8,11");
              if (var2_array != null) {
                vb.field_f[11] = ll.a(0, var2_array);
                break L332;
              } else {
                break L332;
              }
            }
            L333: {
              var2_array = il.a((byte) 107, "instructions8,12");
              if (var2_array != null) {
                vb.field_f[12] = ll.a(0, var2_array);
                break L333;
              } else {
                break L333;
              }
            }
            L334: {
              var2_array = il.a((byte) 112, "instructions8,13");
              if (null == var2_array) {
                break L334;
              } else {
                vb.field_f[13] = ll.a(sl.a((int) param0, 96), var2_array);
                break L334;
              }
            }
            L335: {
              var2_array = il.a((byte) 97, "instructions8,14");
              if (var2_array == null) {
                break L335;
              } else {
                vb.field_f[14] = ll.a(0, var2_array);
                break L335;
              }
            }
            L336: {
              var2_array = il.a((byte) 85, "instructions8,15");
              if (null == var2_array) {
                break L336;
              } else {
                vb.field_f[15] = ll.a(param0 + -96, var2_array);
                break L336;
              }
            }
            L337: {
              var2_array = il.a((byte) 100, "instructions8,16");
              if (var2_array == null) {
                break L337;
              } else {
                vb.field_f[16] = ll.a(0, var2_array);
                break L337;
              }
            }
            L338: {
              var2_array = il.a((byte) 80, "instructions8,17");
              if (var2_array != null) {
                vb.field_f[17] = ll.a(0, var2_array);
                break L338;
              } else {
                break L338;
              }
            }
            L339: {
              var2_array = il.a((byte) 87, "instructions8,18");
              if (var2_array != null) {
                vb.field_f[18] = ll.a(0, var2_array);
                break L339;
              } else {
                break L339;
              }
            }
            L340: {
              var2_array = il.a((byte) 125, "noresearchfac");
              if (var2_array == null) {
                break L340;
              } else {
                r.field_kb = ll.a(param0 + -96, var2_array);
                break L340;
              }
            }
            L341: {
              var2_array = il.a((byte) 84, "noresearchres");
              if (null == var2_array) {
                break L341;
              } else {
                jc.field_E = ll.a(0, var2_array);
                break L341;
              }
            }
            L342: {
              var2_array = il.a((byte) 108, "corporal");
              if (null != var2_array) {
                og.field_g = ll.a(0, var2_array);
                break L342;
              } else {
                break L342;
              }
            }
            L343: {
              var2_array = il.a((byte) 114, "sergeant");
              if (null != var2_array) {
                wj.field_d = ll.a(param0 ^ 96, var2_array);
                break L343;
              } else {
                break L343;
              }
            }
            L344: {
              var2_array = il.a((byte) 86, "captain");
              if (null != var2_array) {
                cf.field_c = ll.a(param0 ^ 96, var2_array);
                break L344;
              } else {
                break L344;
              }
            }
            L345: {
              var2_array = il.a((byte) 82, "benefits_in,0");
              if (null != var2_array) {
                dc.field_e[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L345;
              } else {
                break L345;
              }
            }
            L346: {
              var2_array = il.a((byte) 105, "benefits_in,1");
              if (var2_array != null) {
                dc.field_e[1] = ll.a(param0 + -96, var2_array);
                break L346;
              } else {
                break L346;
              }
            }
            L347: {
              var2_array = il.a((byte) 116, "benefits_in,2");
              if (var2_array == null) {
                break L347;
              } else {
                dc.field_e[2] = ll.a(0, var2_array);
                break L347;
              }
            }
            L348: {
              var2_array = il.a((byte) 77, "benefits_in,3");
              if (var2_array != null) {
                dc.field_e[3] = ll.a(0, var2_array);
                break L348;
              } else {
                break L348;
              }
            }
            L349: {
              var2_array = il.a((byte) 95, "benefits_in,4");
              if (var2_array != null) {
                dc.field_e[4] = ll.a(0, var2_array);
                break L349;
              } else {
                break L349;
              }
            }
            L350: {
              var2_array = il.a((byte) 103, "benefits_in,5");
              if (null == var2_array) {
                break L350;
              } else {
                dc.field_e[5] = ll.a(0, var2_array);
                break L350;
              }
            }
            L351: {
              var2_array = il.a((byte) 91, "GameName");
              if (var2_array != null) {
                b.field_c = ll.a(0, var2_array);
                break L351;
              } else {
                break L351;
              }
            }
            L352: {
              var2_array = il.a((byte) 116, "down_a_mission");
              if (var2_array != null) {
                discarded$13 = ll.a(0, var2_array);
                break L352;
              } else {
                break L352;
              }
            }
            L353: {
              var2_array = il.a((byte) 91, "up_a_mission");
              if (var2_array == null) {
                break L353;
              } else {
                discarded$14 = ll.a(0, var2_array);
                break L353;
              }
            }
            L354: {
              var2_array = il.a((byte) 117, "T_I_T_L_E");
              if (null == var2_array) {
                break L354;
              } else {
                cc.field_l = ll.a(param0 ^ 96, var2_array);
                break L354;
              }
            }
            L355: {
              var2_array = il.a((byte) 78, "_1000pts");
              if (null != var2_array) {
                jm.field_e = ll.a(0, var2_array);
                break L355;
              } else {
                break L355;
              }
            }
            L356: {
              var2_array = il.a((byte) 102, "_2500pts");
              if (null != var2_array) {
                mb.field_u = ll.a(0, var2_array);
                break L356;
              } else {
                break L356;
              }
            }
            L357: {
              var2_array = il.a((byte) 110, "_3000pts");
              if (var2_array == null) {
                break L357;
              } else {
                ee.field_N = ll.a(param0 ^ 96, var2_array);
                break L357;
              }
            }
            L358: {
              var2_array = il.a((byte) 118, "_5000pts");
              if (null != var2_array) {
                fh.field_l = ll.a(param0 ^ 96, var2_array);
                break L358;
              } else {
                break L358;
              }
            }
            L359: {
              var2_array = il.a((byte) 94, "_6000pts");
              if (null == var2_array) {
                break L359;
              } else {
                c.field_c = ll.a(0, var2_array);
                break L359;
              }
            }
            L360: {
              var2_array = il.a((byte) 106, "_10000pts");
              if (var2_array != null) {
                oa.field_b = ll.a(0, var2_array);
                break L360;
              } else {
                break L360;
              }
            }
            L361: {
              var2_array = il.a((byte) 76, "_25000pts");
              if (var2_array != null) {
                bj.field_a = ll.a(param0 + -96, var2_array);
                break L361;
              } else {
                break L361;
              }
            }
            L362: {
              var2_array = il.a((byte) 111, "Vigilante");
              if (null == var2_array) {
                break L362;
              } else {
                ab.field_h = ll.a(0, var2_array);
                break L362;
              }
            }
            L363: {
              var2_array = il.a((byte) 121, "Squiddy");
              if (null == var2_array) {
                break L363;
              } else {
                ab.field_j = ll.a(0, var2_array);
                break L363;
              }
            }
            L364: {
              var2_array = il.a((byte) 123, "Grunt_with_armour");
              if (null != var2_array) {
                kk.field_c = ll.a(0, var2_array);
                break L364;
              } else {
                break L364;
              }
            }
            L365: {
              var2_array = il.a((byte) 112, "Squiddy_with_shield");
              if (var2_array == null) {
                break L365;
              } else {
                gm.field_a = ll.a(0, var2_array);
                break L365;
              }
            }
            L366: {
              var2_array = il.a((byte) 89, "Grunt_with_shielded_armour");
              if (var2_array != null) {
                qe.field_g = ll.a(0, var2_array);
                break L366;
              } else {
                break L366;
              }
            }
            L367: {
              var2_array = il.a((byte) 104, "Squiddy_with_shielded_armour");
              if (null == var2_array) {
                break L367;
              } else {
                fa.field_c = ll.a(0, var2_array);
                break L367;
              }
            }
            L368: {
              var2_array = il.a((byte) 92, "Squiddy_Commander");
              if (var2_array != null) {
                qd.field_j = ll.a(0, var2_array);
                break L368;
              } else {
                break L368;
              }
            }
            L369: {
              var2_array = il.a((byte) 120, "Soldier");
              if (null != var2_array) {
                vh.field_n = ll.a(0, var2_array);
                break L369;
              } else {
                break L369;
              }
            }
            L370: {
              var2_array = il.a((byte) 116, "Turret");
              if (var2_array == null) {
                break L370;
              } else {
                qk.field_g = ll.a(0, var2_array);
                break L370;
              }
            }
            L371: {
              var2_array = il.a((byte) 90, "Zombie");
              if (null == var2_array) {
                break L371;
              } else {
                tb.field_x = ll.a(0, var2_array);
                break L371;
              }
            }
            L372: {
              var2_array = il.a((byte) 96, "Soldier_A");
              if (null != var2_array) {
                ah.field_C = ll.a(0, var2_array);
                break L372;
              } else {
                break L372;
              }
            }
            L373: {
              var2_array = il.a((byte) 80, "Kenetic_projection_armour");
              if (var2_array == null) {
                break L373;
              } else {
                qe.field_j = ll.a(param0 + -96, var2_array);
                break L373;
              }
            }
            L374: {
              var2_array = il.a((byte) 71, "Alien_scale_mail");
              if (var2_array != null) {
                th.field_e = ll.a(0, var2_array);
                break L374;
              } else {
                break L374;
              }
            }
            L375: {
              var2_array = il.a((byte) 124, "Body_Defence_Armour");
              if (var2_array == null) {
                break L375;
              } else {
                uj.field_e = ll.a(0, var2_array);
                break L375;
              }
            }
            L376: {
              var2_array = il.a((byte) 89, "MODELNAME_PISTOL");
              if (var2_array != null) {
                df.field_M = ll.a(0, var2_array);
                break L376;
              } else {
                break L376;
              }
            }
            L377: {
              var2_array = il.a((byte) 105, "MODELNAME_SHOTGUN");
              if (var2_array == null) {
                break L377;
              } else {
                ml.field_r = ll.a(0, var2_array);
                break L377;
              }
            }
            L378: {
              var2_array = il.a((byte) 95, "MODELNAME_RIFLE");
              if (var2_array == null) {
                break L378;
              } else {
                sa.field_a = ll.a(0, var2_array);
                break L378;
              }
            }
            L379: {
              var2_array = il.a((byte) 89, "MODELNAME_SMG");
              if (var2_array != null) {
                sd.field_a = ll.a(0, var2_array);
                break L379;
              } else {
                break L379;
              }
            }
            L380: {
              var2_array = il.a((byte) 96, "MODELNAME_LMG");
              if (null != var2_array) {
                vc.field_b = ll.a(0, var2_array);
                break L380;
              } else {
                break L380;
              }
            }
            L381: {
              var2_array = il.a((byte) 74, "MODELNAME_RPG");
              if (null == var2_array) {
                break L381;
              } else {
                k.field_a = ll.a(0, var2_array);
                break L381;
              }
            }
            L382: {
              var2_array = il.a((byte) 121, "MODELNAME_GRENADE");
              if (var2_array != null) {
                dm.field_e = ll.a(0, var2_array);
                break L382;
              } else {
                break L382;
              }
            }
            L383: {
              var2_array = il.a((byte) 125, "MODELNAME_EXPLAS");
              if (null == var2_array) {
                break L383;
              } else {
                ab.field_m = ll.a(0, var2_array);
                break L383;
              }
            }
            L384: {
              var2_array = il.a((byte) 113, "MODELNAME_LASGUN");
              if (null != var2_array) {
                fc.field_j = ll.a(0, var2_array);
                break L384;
              } else {
                break L384;
              }
            }
            L385: {
              var2_array = il.a((byte) 114, "MODELNAME_PULPIS");
              if (null != var2_array) {
                hh.field_p = ll.a(0, var2_array);
                break L385;
              } else {
                break L385;
              }
            }
            L386: {
              var2_array = il.a((byte) 92, "MODELNAME_PULGUN");
              if (null != var2_array) {
                ij.field_c = ll.a(param0 + -96, var2_array);
                break L386;
              } else {
                break L386;
              }
            }
            L387: {
              var2_array = il.a((byte) 95, "MODELNAME_PULGREN");
              if (null != var2_array) {
                bb.field_h = ll.a(param0 ^ 96, var2_array);
                break L387;
              } else {
                break L387;
              }
            }
            L388: {
              var2_array = il.a((byte) 126, "MODELNAME_PULRIF");
              if (var2_array == null) {
                break L388;
              } else {
                kh.field_O = ll.a(0, var2_array);
                break L388;
              }
            }
            L389: {
              var2_array = il.a((byte) 83, "MODELNAME_FUSPIS");
              if (null != var2_array) {
                kf.field_a = ll.a(0, var2_array);
                break L389;
              } else {
                break L389;
              }
            }
            L390: {
              var2_array = il.a((byte) 105, "MODELNAME_FUSGUN");
              if (null != var2_array) {
                jh.field_k = ll.a(0, var2_array);
                break L390;
              } else {
                break L390;
              }
            }
            L391: {
              var2_array = il.a((byte) 81, "MODELNAME_FUSCAN");
              if (var2_array != null) {
                wl.field_y = ll.a(param0 ^ 96, var2_array);
                break L391;
              } else {
                break L391;
              }
            }
            L392: {
              var2_array = il.a((byte) 90, "MODELNAME_FUSLAU");
              if (null != var2_array) {
                wa.field_q = ll.a(0, var2_array);
                break L392;
              } else {
                break L392;
              }
            }
            L393: {
              var2_array = il.a((byte) 107, "MODELNAME_FUSRIF");
              if (null != var2_array) {
                sa.field_b = ll.a(0, var2_array);
                break L393;
              } else {
                break L393;
              }
            }
            L394: {
              var2_array = il.a((byte) 74, "MODELNAME_SHIELD");
              if (null != var2_array) {
                kd.field_a = ll.a(param0 + -96, var2_array);
                break L394;
              } else {
                break L394;
              }
            }
            L395: {
              var2_array = il.a((byte) 110, "exitdebrief");
              if (var2_array == null) {
                break L395;
              } else {
                discarded$15 = ll.a(0, var2_array);
                break L395;
              }
            }
            L396: {
              var2_array = il.a((byte) 113, "capsmission");
              if (null != var2_array) {
                discarded$16 = ll.a(0, var2_array);
                break L396;
              } else {
                break L396;
              }
            }
            L397: {
              var2_array = il.a((byte) 89, "mission_no");
              if (null != var2_array) {
                kh.field_L = ll.a(param0 ^ 96, var2_array);
                break L397;
              } else {
                break L397;
              }
            }
            L398: {
              var2_array = il.a((byte) 90, "missionnames,0");
              if (var2_array != null) {
                p.field_f[0] = ll.a(0, var2_array);
                break L398;
              } else {
                break L398;
              }
            }
            L399: {
              var2_array = il.a((byte) 113, "missionnames,1");
              if (null != var2_array) {
                p.field_f[1] = ll.a(0, var2_array);
                break L399;
              } else {
                break L399;
              }
            }
            L400: {
              var2_array = il.a((byte) 106, "missionnames,2");
              if (null == var2_array) {
                break L400;
              } else {
                p.field_f[2] = ll.a(0, var2_array);
                break L400;
              }
            }
            L401: {
              var2_array = il.a((byte) 72, "missionnames,3");
              if (null == var2_array) {
                break L401;
              } else {
                p.field_f[3] = ll.a(0, var2_array);
                break L401;
              }
            }
            L402: {
              var2_array = il.a((byte) 76, "missionnames,4");
              if (var2_array != null) {
                p.field_f[4] = ll.a(0, var2_array);
                break L402;
              } else {
                break L402;
              }
            }
            L403: {
              var2_array = il.a((byte) 71, "missionnames,5");
              if (null == var2_array) {
                break L403;
              } else {
                p.field_f[5] = ll.a(0, var2_array);
                break L403;
              }
            }
            L404: {
              var2_array = il.a((byte) 118, "missionnames,6");
              if (null != var2_array) {
                p.field_f[6] = ll.a(0, var2_array);
                break L404;
              } else {
                break L404;
              }
            }
            L405: {
              var2_array = il.a((byte) 77, "missionnames,7");
              if (var2_array == null) {
                break L405;
              } else {
                p.field_f[7] = ll.a(0, var2_array);
                break L405;
              }
            }
            L406: {
              var2_array = il.a((byte) 117, "missionnames,8");
              if (null == var2_array) {
                break L406;
              } else {
                p.field_f[8] = ll.a(0, var2_array);
                break L406;
              }
            }
            L407: {
              var2_array = il.a((byte) 95, "missionnames,9");
              if (null != var2_array) {
                p.field_f[9] = ll.a(0, var2_array);
                break L407;
              } else {
                break L407;
              }
            }
            L408: {
              var2_array = il.a((byte) 105, "missionnames,10");
              if (var2_array == null) {
                break L408;
              } else {
                p.field_f[10] = ll.a(0, var2_array);
                break L408;
              }
            }
            L409: {
              var2_array = il.a((byte) 121, "missionnames,11");
              if (var2_array != null) {
                p.field_f[11] = ll.a(0, var2_array);
                break L409;
              } else {
                break L409;
              }
            }
            L410: {
              var2_array = il.a((byte) 113, "missionnames,12");
              if (var2_array != null) {
                p.field_f[12] = ll.a(sl.a((int) param0, 96), var2_array);
                break L410;
              } else {
                break L410;
              }
            }
            L411: {
              var2_array = il.a((byte) 105, "missionnames,13");
              if (var2_array == null) {
                break L411;
              } else {
                p.field_f[13] = ll.a(0, var2_array);
                break L411;
              }
            }
            L412: {
              var2_array = il.a((byte) 104, "missionnames,14");
              if (null == var2_array) {
                break L412;
              } else {
                p.field_f[14] = ll.a(sl.a((int) param0, 96), var2_array);
                break L412;
              }
            }
            L413: {
              var2_array = il.a((byte) 110, "yaysuccess");
              if (var2_array == null) {
                break L413;
              } else {
                hm.field_J = ll.a(0, var2_array);
                break L413;
              }
            }
            L414: {
              var2_array = il.a((byte) 88, "boofailed");
              if (null != var2_array) {
                sk.field_a = ll.a(param0 + -96, var2_array);
                break L414;
              } else {
                break L414;
              }
            }
            L415: {
              var2_array = il.a((byte) 98, "debriefstrings,0");
              if (var2_array == null) {
                break L415;
              } else {
                pe.field_c[0] = ll.a(param0 + -96, var2_array);
                break L415;
              }
            }
            L416: {
              var2_array = il.a((byte) 76, "debriefstrings,1");
              if (null != var2_array) {
                pe.field_c[1] = ll.a(0, var2_array);
                break L416;
              } else {
                break L416;
              }
            }
            L417: {
              var2_array = il.a((byte) 122, "debriefstrings,2");
              if (var2_array != null) {
                pe.field_c[2] = ll.a(0, var2_array);
                break L417;
              } else {
                break L417;
              }
            }
            L418: {
              var2_array = il.a((byte) 76, "debriefstrings,3");
              if (null == var2_array) {
                break L418;
              } else {
                pe.field_c[3] = ll.a(0, var2_array);
                break L418;
              }
            }
            L419: {
              var2_array = il.a((byte) 80, "debriefstrings,4");
              if (null != var2_array) {
                pe.field_c[4] = ll.a(0, var2_array);
                break L419;
              } else {
                break L419;
              }
            }
            L420: {
              var2_array = il.a((byte) 108, "debriefstrings,5");
              if (var2_array == null) {
                break L420;
              } else {
                pe.field_c[5] = ll.a(sl.a((int) param0, 96), var2_array);
                break L420;
              }
            }
            L421: {
              var2_array = il.a((byte) 86, "debriefstrings,6");
              if (var2_array == null) {
                break L421;
              } else {
                pe.field_c[6] = ll.a(0, var2_array);
                break L421;
              }
            }
            L422: {
              var2_array = il.a((byte) 88, "debriefstrings,7");
              if (null == var2_array) {
                break L422;
              } else {
                pe.field_c[7] = ll.a(0, var2_array);
                break L422;
              }
            }
            L423: {
              var2_array = il.a((byte) 77, "debriefstrings,8");
              if (null == var2_array) {
                break L423;
              } else {
                pe.field_c[8] = ll.a(0, var2_array);
                break L423;
              }
            }
            L424: {
              var2_array = il.a((byte) 91, "debriefstrings,9");
              if (var2_array != null) {
                pe.field_c[9] = ll.a(0, var2_array);
                break L424;
              } else {
                break L424;
              }
            }
            L425: {
              var2_array = il.a((byte) 98, "debriefstrings,10");
              if (var2_array == null) {
                break L425;
              } else {
                pe.field_c[10] = ll.a(param0 + -96, var2_array);
                break L425;
              }
            }
            L426: {
              var2_array = il.a((byte) 119, "debriefstrings,11");
              if (var2_array != null) {
                pe.field_c[11] = ll.a(0, var2_array);
                break L426;
              } else {
                break L426;
              }
            }
            L427: {
              var2_array = il.a((byte) 100, "debriefstrings,12");
              if (null != var2_array) {
                pe.field_c[12] = ll.a(0, var2_array);
                break L427;
              } else {
                break L427;
              }
            }
            L428: {
              var2_array = il.a((byte) 98, "debriefstrings,13");
              if (var2_array == null) {
                break L428;
              } else {
                pe.field_c[13] = ll.a(param0 + -96, var2_array);
                break L428;
              }
            }
            L429: {
              var2_array = il.a((byte) 75, "debriefstrings,14");
              if (var2_array != null) {
                pe.field_c[14] = ll.a(0, var2_array);
                break L429;
              } else {
                break L429;
              }
            }
            L430: {
              var2_array = il.a((byte) 103, "debriefstrings,15");
              if (null != var2_array) {
                pe.field_c[15] = ll.a(0, var2_array);
                break L430;
              } else {
                break L430;
              }
            }
            L431: {
              var2_array = il.a((byte) 82, "debriefstrings,16");
              if (null != var2_array) {
                pe.field_c[16] = ll.a(0, var2_array);
                break L431;
              } else {
                break L431;
              }
            }
            L432: {
              var2_array = il.a((byte) 74, "debriefstrings,17");
              if (null != var2_array) {
                pe.field_c[17] = ll.a(param0 + -96, var2_array);
                break L432;
              } else {
                break L432;
              }
            }
            L433: {
              var2_array = il.a((byte) 107, "debriefstrings,18");
              if (var2_array == null) {
                break L433;
              } else {
                pe.field_c[18] = ll.a(0, var2_array);
                break L433;
              }
            }
            L434: {
              var2_array = il.a((byte) 93, "debriefstrings,19");
              if (var2_array == null) {
                break L434;
              } else {
                pe.field_c[19] = ll.a(0, var2_array);
                break L434;
              }
            }
            L435: {
              var2_array = il.a((byte) 114, "debriefstrings,20");
              if (null != var2_array) {
                pe.field_c[20] = ll.a(sl.a((int) param0, 96), var2_array);
                break L435;
              } else {
                break L435;
              }
            }
            L436: {
              var2_array = il.a((byte) 95, "debriefstrings,21");
              if (null == var2_array) {
                break L436;
              } else {
                pe.field_c[21] = ll.a(0, var2_array);
                break L436;
              }
            }
            L437: {
              var2_array = il.a((byte) 99, "debriefstrings,22");
              if (null == var2_array) {
                break L437;
              } else {
                pe.field_c[22] = ll.a(0, var2_array);
                break L437;
              }
            }
            L438: {
              var2_array = il.a((byte) 71, "debriefstrings,23");
              if (var2_array != null) {
                pe.field_c[23] = ll.a(0, var2_array);
                break L438;
              } else {
                break L438;
              }
            }
            L439: {
              var2_array = il.a((byte) 85, "debriefstrings,24");
              if (null != var2_array) {
                pe.field_c[24] = ll.a(param0 + -96, var2_array);
                break L439;
              } else {
                break L439;
              }
            }
            L440: {
              var2_array = il.a((byte) 87, "debriefstrings,25");
              if (var2_array != null) {
                pe.field_c[25] = ll.a(0, var2_array);
                break L440;
              } else {
                break L440;
              }
            }
            L441: {
              var2_array = il.a((byte) 127, "debriefstrings,26");
              if (null != var2_array) {
                pe.field_c[26] = ll.a(0, var2_array);
                break L441;
              } else {
                break L441;
              }
            }
            L442: {
              var2_array = il.a((byte) 75, "debriefstrings,27");
              if (null == var2_array) {
                break L442;
              } else {
                pe.field_c[27] = ll.a(param0 + -96, var2_array);
                break L442;
              }
            }
            L443: {
              var2_array = il.a((byte) 117, "debriefstrings,28");
              if (var2_array == null) {
                break L443;
              } else {
                pe.field_c[28] = ll.a(0, var2_array);
                break L443;
              }
            }
            L444: {
              var2_array = il.a((byte) 96, "briefstrings,0");
              if (var2_array == null) {
                break L444;
              } else {
                ic.field_x[0] = ll.a(0, var2_array);
                break L444;
              }
            }
            L445: {
              var2_array = il.a((byte) 73, "briefstrings,1");
              if (var2_array == null) {
                break L445;
              } else {
                ic.field_x[1] = ll.a(0, var2_array);
                break L445;
              }
            }
            L446: {
              var2_array = il.a((byte) 107, "briefstrings,2");
              if (null != var2_array) {
                ic.field_x[2] = ll.a(0, var2_array);
                break L446;
              } else {
                break L446;
              }
            }
            L447: {
              var2_array = il.a((byte) 120, "briefstrings,3");
              if (null != var2_array) {
                ic.field_x[3] = ll.a(0, var2_array);
                break L447;
              } else {
                break L447;
              }
            }
            L448: {
              var2_array = il.a((byte) 106, "briefstrings,4");
              if (null != var2_array) {
                ic.field_x[4] = ll.a(0, var2_array);
                break L448;
              } else {
                break L448;
              }
            }
            L449: {
              var2_array = il.a((byte) 118, "briefstrings,5");
              if (null != var2_array) {
                ic.field_x[5] = ll.a(0, var2_array);
                break L449;
              } else {
                break L449;
              }
            }
            L450: {
              var2_array = il.a((byte) 95, "briefstrings,6");
              if (var2_array == null) {
                break L450;
              } else {
                ic.field_x[6] = ll.a(sl.a((int) param0, 96), var2_array);
                break L450;
              }
            }
            L451: {
              var2_array = il.a((byte) 80, "briefstrings,7");
              if (null != var2_array) {
                ic.field_x[7] = ll.a(0, var2_array);
                break L451;
              } else {
                break L451;
              }
            }
            L452: {
              var2_array = il.a((byte) 110, "briefstrings,8");
              if (var2_array == null) {
                break L452;
              } else {
                ic.field_x[8] = ll.a(0, var2_array);
                break L452;
              }
            }
            L453: {
              var2_array = il.a((byte) 120, "briefstrings,9");
              if (var2_array == null) {
                break L453;
              } else {
                ic.field_x[9] = ll.a(0, var2_array);
                break L453;
              }
            }
            L454: {
              var2_array = il.a((byte) 96, "briefstrings,10");
              if (null == var2_array) {
                break L454;
              } else {
                ic.field_x[10] = ll.a(0, var2_array);
                break L454;
              }
            }
            L455: {
              var2_array = il.a((byte) 98, "briefstrings,11");
              if (null != var2_array) {
                ic.field_x[11] = ll.a(0, var2_array);
                break L455;
              } else {
                break L455;
              }
            }
            L456: {
              var2_array = il.a((byte) 92, "briefstrings,12");
              if (null != var2_array) {
                ic.field_x[12] = ll.a(param0 + -96, var2_array);
                break L456;
              } else {
                break L456;
              }
            }
            L457: {
              var2_array = il.a((byte) 71, "briefstrings,13");
              if (null != var2_array) {
                ic.field_x[13] = ll.a(0, var2_array);
                break L457;
              } else {
                break L457;
              }
            }
            L458: {
              var2_array = il.a((byte) 127, "briefstrings,14");
              if (var2_array == null) {
                break L458;
              } else {
                ic.field_x[14] = ll.a(0, var2_array);
                break L458;
              }
            }
            L459: {
              var2_array = il.a((byte) 80, "briefstrings,15");
              if (null != var2_array) {
                ic.field_x[15] = ll.a(0, var2_array);
                break L459;
              } else {
                break L459;
              }
            }
            L460: {
              var2_array = il.a((byte) 111, "briefstrings,16");
              if (var2_array == null) {
                break L460;
              } else {
                ic.field_x[16] = ll.a(sl.a((int) param0, 96), var2_array);
                break L460;
              }
            }
            L461: {
              var2_array = il.a((byte) 112, "briefstrings,17");
              if (var2_array == null) {
                break L461;
              } else {
                ic.field_x[17] = ll.a(sl.a((int) param0, 96), var2_array);
                break L461;
              }
            }
            L462: {
              var2_array = il.a((byte) 90, "briefstrings,18");
              if (var2_array != null) {
                ic.field_x[18] = ll.a(0, var2_array);
                break L462;
              } else {
                break L462;
              }
            }
            L463: {
              var2_array = il.a((byte) 83, "briefstrings,19");
              if (var2_array == null) {
                break L463;
              } else {
                ic.field_x[19] = ll.a(0, var2_array);
                break L463;
              }
            }
            L464: {
              var2_array = il.a((byte) 109, "briefstrings,20");
              if (var2_array != null) {
                ic.field_x[20] = ll.a(sl.a((int) param0, 96), var2_array);
                break L464;
              } else {
                break L464;
              }
            }
            L465: {
              var2_array = il.a((byte) 97, "briefstrings,21");
              if (var2_array == null) {
                break L465;
              } else {
                ic.field_x[21] = ll.a(0, var2_array);
                break L465;
              }
            }
            L466: {
              var2_array = il.a((byte) 102, "briefstrings,22");
              if (null != var2_array) {
                ic.field_x[22] = ll.a(0, var2_array);
                break L466;
              } else {
                break L466;
              }
            }
            L467: {
              var2_array = il.a((byte) 97, "briefstrings,23");
              if (null != var2_array) {
                ic.field_x[23] = ll.a(0, var2_array);
                break L467;
              } else {
                break L467;
              }
            }
            L468: {
              var2_array = il.a((byte) 116, "briefstrings,24");
              if (null != var2_array) {
                ic.field_x[24] = ll.a(0, var2_array);
                break L468;
              } else {
                break L468;
              }
            }
            L469: {
              var2_array = il.a((byte) 99, "briefstrings,25");
              if (null != var2_array) {
                ic.field_x[25] = ll.a(sl.a((int) param0, 96), var2_array);
                break L469;
              } else {
                break L469;
              }
            }
            L470: {
              var2_array = il.a((byte) 104, "briefstrings,26");
              if (var2_array == null) {
                break L470;
              } else {
                ic.field_x[26] = ll.a(param0 + -96, var2_array);
                break L470;
              }
            }
            L471: {
              var2_array = il.a((byte) 86, "briefstrings,27");
              if (null == var2_array) {
                break L471;
              } else {
                ic.field_x[27] = ll.a(0, var2_array);
                break L471;
              }
            }
            L472: {
              var2_array = il.a((byte) 101, "briefstrings,28");
              if (var2_array == null) {
                break L472;
              } else {
                ic.field_x[28] = ll.a(0, var2_array);
                break L472;
              }
            }
            L473: {
              var2_array = il.a((byte) 80, "briefstrings,29");
              if (null != var2_array) {
                ic.field_x[29] = ll.a(0, var2_array);
                break L473;
              } else {
                break L473;
              }
            }
            L474: {
              var2_array = il.a((byte) 78, "briefstrings,30");
              if (var2_array != null) {
                ic.field_x[30] = ll.a(0, var2_array);
                break L474;
              } else {
                break L474;
              }
            }
            L475: {
              var2_array = il.a((byte) 71, "briefstrings,31");
              if (null == var2_array) {
                break L475;
              } else {
                ic.field_x[31] = ll.a(sl.a((int) param0, 96), var2_array);
                break L475;
              }
            }
            L476: {
              var2_array = il.a((byte) 95, "briefstrings,32");
              if (null != var2_array) {
                ic.field_x[32] = ll.a(0, var2_array);
                break L476;
              } else {
                break L476;
              }
            }
            L477: {
              var2_array = il.a((byte) 93, "briefstrings,33");
              if (null != var2_array) {
                ic.field_x[33] = ll.a(param0 + -96, var2_array);
                break L477;
              } else {
                break L477;
              }
            }
            L478: {
              var2_array = il.a((byte) 121, "briefstrings,34");
              if (var2_array == null) {
                break L478;
              } else {
                ic.field_x[34] = ll.a(0, var2_array);
                break L478;
              }
            }
            L479: {
              var2_array = il.a((byte) 96, "briefstrings,35");
              if (var2_array != null) {
                ic.field_x[35] = ll.a(0, var2_array);
                break L479;
              } else {
                break L479;
              }
            }
            L480: {
              var2_array = il.a((byte) 88, "briefstrings,36");
              if (var2_array != null) {
                ic.field_x[36] = ll.a(0, var2_array);
                break L480;
              } else {
                break L480;
              }
            }
            L481: {
              var2_array = il.a((byte) 82, "briefstrings,37");
              if (var2_array != null) {
                ic.field_x[37] = ll.a(sl.a((int) param0, 96), var2_array);
                break L481;
              } else {
                break L481;
              }
            }
            L482: {
              var2_array = il.a((byte) 89, "briefstrings,38");
              if (null == var2_array) {
                break L482;
              } else {
                ic.field_x[38] = ll.a(sl.a((int) param0, 96), var2_array);
                break L482;
              }
            }
            L483: {
              var2_array = il.a((byte) 73, "briefstrings,39");
              if (null != var2_array) {
                ic.field_x[39] = ll.a(0, var2_array);
                break L483;
              } else {
                break L483;
              }
            }
            L484: {
              var2_array = il.a((byte) 118, "briefstrings,40");
              if (var2_array == null) {
                break L484;
              } else {
                ic.field_x[40] = ll.a(sl.a((int) param0, 96), var2_array);
                break L484;
              }
            }
            L485: {
              var2_array = il.a((byte) 97, "briefstrings,41");
              if (null == var2_array) {
                break L485;
              } else {
                ic.field_x[41] = ll.a(0, var2_array);
                break L485;
              }
            }
            L486: {
              var2_array = il.a((byte) 126, "briefstrings,42");
              if (null == var2_array) {
                break L486;
              } else {
                ic.field_x[42] = ll.a(param0 + -96, var2_array);
                break L486;
              }
            }
            L487: {
              var2_array = il.a((byte) 112, "briefstrings,43");
              if (var2_array != null) {
                ic.field_x[43] = ll.a(0, var2_array);
                break L487;
              } else {
                break L487;
              }
            }
            L488: {
              var2_array = il.a((byte) 72, "briefstrings,44");
              if (var2_array != null) {
                ic.field_x[44] = ll.a(param0 + -96, var2_array);
                break L488;
              } else {
                break L488;
              }
            }
            L489: {
              var2_array = il.a((byte) 124, "briefstrings,45");
              if (var2_array == null) {
                break L489;
              } else {
                ic.field_x[45] = ll.a(0, var2_array);
                break L489;
              }
            }
            L490: {
              var2_array = il.a((byte) 126, "briefstrings,46");
              if (var2_array != null) {
                ic.field_x[46] = ll.a(0, var2_array);
                break L490;
              } else {
                break L490;
              }
            }
            L491: {
              var2_array = il.a((byte) 81, "briefstrings,47");
              if (null != var2_array) {
                ic.field_x[47] = ll.a(sl.a((int) param0, 96), var2_array);
                break L491;
              } else {
                break L491;
              }
            }
            L492: {
              var2_array = il.a((byte) 85, "briefstrings,48");
              if (null != var2_array) {
                ic.field_x[48] = ll.a(param0 + -96, var2_array);
                break L492;
              } else {
                break L492;
              }
            }
            L493: {
              var2_array = il.a((byte) 103, "briefstrings,49");
              if (null != var2_array) {
                ic.field_x[49] = ll.a(0, var2_array);
                break L493;
              } else {
                break L493;
              }
            }
            L494: {
              var2_array = il.a((byte) 83, "briefstrings,50");
              if (null == var2_array) {
                break L494;
              } else {
                ic.field_x[50] = ll.a(0, var2_array);
                break L494;
              }
            }
            L495: {
              var2_array = il.a((byte) 98, "briefstrings,51");
              if (var2_array == null) {
                break L495;
              } else {
                ic.field_x[51] = ll.a(0, var2_array);
                break L495;
              }
            }
            L496: {
              var2_array = il.a((byte) 112, "briefstrings,52");
              if (var2_array == null) {
                break L496;
              } else {
                ic.field_x[52] = ll.a(0, var2_array);
                break L496;
              }
            }
            L497: {
              var2_array = il.a((byte) 102, "briefstrings,53");
              if (null != var2_array) {
                ic.field_x[53] = ll.a(param0 + -96, var2_array);
                break L497;
              } else {
                break L497;
              }
            }
            L498: {
              var2_array = il.a((byte) 81, "briefstrings,54");
              if (var2_array != null) {
                ic.field_x[54] = ll.a(param0 + -96, var2_array);
                break L498;
              } else {
                break L498;
              }
            }
            L499: {
              var2_array = il.a((byte) 95, "briefstrings,55");
              if (var2_array == null) {
                break L499;
              } else {
                ic.field_x[55] = ll.a(0, var2_array);
                break L499;
              }
            }
            L500: {
              var2_array = il.a((byte) 112, "briefstrings,56");
              if (null == var2_array) {
                break L500;
              } else {
                ic.field_x[56] = ll.a(0, var2_array);
                break L500;
              }
            }
            L501: {
              var2_array = il.a((byte) 79, "briefstrings,57");
              if (var2_array == null) {
                break L501;
              } else {
                ic.field_x[57] = ll.a(param0 + -96, var2_array);
                break L501;
              }
            }
            L502: {
              var2_array = il.a((byte) 104, "briefstrings,58");
              if (null != var2_array) {
                ic.field_x[58] = ll.a(0, var2_array);
                break L502;
              } else {
                break L502;
              }
            }
            L503: {
              var2_array = il.a((byte) 73, "briefstrings,59");
              if (var2_array != null) {
                ic.field_x[59] = ll.a(0, var2_array);
                break L503;
              } else {
                break L503;
              }
            }
            L504: {
              var2_array = il.a((byte) 94, "briefstrings,60");
              if (null != var2_array) {
                ic.field_x[60] = ll.a(sl.a((int) param0, 96), var2_array);
                break L504;
              } else {
                break L504;
              }
            }
            L505: {
              var2_array = il.a((byte) 95, "briefstrings,61");
              if (var2_array == null) {
                break L505;
              } else {
                ic.field_x[61] = ll.a(0, var2_array);
                break L505;
              }
            }
            L506: {
              var2_array = il.a((byte) 79, "briefstrings,62");
              if (null != var2_array) {
                ic.field_x[62] = ll.a(0, var2_array);
                break L506;
              } else {
                break L506;
              }
            }
            L507: {
              var2_array = il.a((byte) 110, "briefstrings,63");
              if (var2_array == null) {
                break L507;
              } else {
                ic.field_x[63] = ll.a(0, var2_array);
                break L507;
              }
            }
            L508: {
              var2_array = il.a((byte) 77, "briefstrings,64");
              if (var2_array == null) {
                break L508;
              } else {
                ic.field_x[64] = ll.a(0, var2_array);
                break L508;
              }
            }
            L509: {
              var2_array = il.a((byte) 113, "briefstrings,65");
              if (var2_array == null) {
                break L509;
              } else {
                ic.field_x[65] = ll.a(0, var2_array);
                break L509;
              }
            }
            L510: {
              var2_array = il.a((byte) 84, "briefstrings,66");
              if (var2_array == null) {
                break L510;
              } else {
                ic.field_x[66] = ll.a(0, var2_array);
                break L510;
              }
            }
            L511: {
              var2_array = il.a((byte) 112, "briefstrings,67");
              if (var2_array != null) {
                ic.field_x[67] = ll.a(0, var2_array);
                break L511;
              } else {
                break L511;
              }
            }
            L512: {
              var2_array = il.a((byte) 105, "briefstrings,68");
              if (var2_array != null) {
                ic.field_x[68] = ll.a(param0 + -96, var2_array);
                break L512;
              } else {
                break L512;
              }
            }
            L513: {
              var2_array = il.a((byte) 108, "briefstrings,69");
              if (var2_array != null) {
                ic.field_x[69] = ll.a(0, var2_array);
                break L513;
              } else {
                break L513;
              }
            }
            L514: {
              var2_array = il.a((byte) 74, "briefstrings,70");
              if (null != var2_array) {
                ic.field_x[70] = ll.a(0, var2_array);
                break L514;
              } else {
                break L514;
              }
            }
            L515: {
              var2_array = il.a((byte) 102, "briefstrings,71");
              if (null == var2_array) {
                break L515;
              } else {
                ic.field_x[71] = ll.a(param0 + -96, var2_array);
                break L515;
              }
            }
            L516: {
              var2_array = il.a((byte) 91, "briefstrings,72");
              if (null == var2_array) {
                break L516;
              } else {
                ic.field_x[72] = ll.a(0, var2_array);
                break L516;
              }
            }
            L517: {
              var2_array = il.a((byte) 95, "briefstrings,73");
              if (null == var2_array) {
                break L517;
              } else {
                ic.field_x[73] = ll.a(0, var2_array);
                break L517;
              }
            }
            L518: {
              var2_array = il.a((byte) 106, "briefstrings,74");
              if (null != var2_array) {
                ic.field_x[74] = ll.a(sl.a((int) param0, 96), var2_array);
                break L518;
              } else {
                break L518;
              }
            }
            L519: {
              var2_array = il.a((byte) 100, "briefstrings,75");
              if (null == var2_array) {
                break L519;
              } else {
                ic.field_x[75] = ll.a(sl.a((int) param0, 96), var2_array);
                break L519;
              }
            }
            L520: {
              var2_array = il.a((byte) 102, "briefstrings,76");
              if (null == var2_array) {
                break L520;
              } else {
                ic.field_x[76] = ll.a(param0 + -96, var2_array);
                break L520;
              }
            }
            L521: {
              var2_array = il.a((byte) 72, "briefstrings,77");
              if (null == var2_array) {
                break L521;
              } else {
                ic.field_x[77] = ll.a(0, var2_array);
                break L521;
              }
            }
            L522: {
              var2_array = il.a((byte) 104, "briefstrings,78");
              if (var2_array == null) {
                break L522;
              } else {
                ic.field_x[78] = ll.a(0, var2_array);
                break L522;
              }
            }
            L523: {
              var2_array = il.a((byte) 90, "briefstrings,79");
              if (null != var2_array) {
                ic.field_x[79] = ll.a(0, var2_array);
                break L523;
              } else {
                break L523;
              }
            }
            L524: {
              var2_array = il.a((byte) 94, "briefstrings,80");
              if (null == var2_array) {
                break L524;
              } else {
                ic.field_x[80] = ll.a(0, var2_array);
                break L524;
              }
            }
            L525: {
              var2_array = il.a((byte) 126, "briefstrings,81");
              if (var2_array == null) {
                break L525;
              } else {
                ic.field_x[81] = ll.a(0, var2_array);
                break L525;
              }
            }
            L526: {
              var2_array = il.a((byte) 79, "diffeasy");
              if (var2_array != null) {
                gl.field_i = ll.a(0, var2_array);
                break L526;
              } else {
                break L526;
              }
            }
            L527: {
              var2_array = il.a((byte) 116, "diffnorm");
              if (var2_array != null) {
                ta.field_b = ll.a(0, var2_array);
                break L527;
              } else {
                break L527;
              }
            }
            L528: {
              var2_array = il.a((byte) 115, "diffhard");
              if (var2_array != null) {
                bi.field_a = ll.a(0, var2_array);
                break L528;
              } else {
                break L528;
              }
            }
            L529: {
              var2_array = il.a((byte) 109, "actI");
              if (var2_array == null) {
                break L529;
              } else {
                sb.field_n = ll.a(param0 + -96, var2_array);
                break L529;
              }
            }
            L530: {
              var2_array = il.a((byte) 99, "actII");
              if (null != var2_array) {
                ah.field_D = ll.a(0, var2_array);
                break L530;
              } else {
                break L530;
              }
            }
            L531: {
              var2_array = il.a((byte) 124, "actIII");
              if (var2_array == null) {
                break L531;
              } else {
                lk.field_b = ll.a(0, var2_array);
                break L531;
              }
            }
            L532: {
              var2_array = il.a((byte) 78, "actIV");
              if (var2_array != null) {
                va.field_h = ll.a(0, var2_array);
                break L532;
              } else {
                break L532;
              }
            }
            L533: {
              var2_array = il.a((byte) 102, "startnewgame");
              if (var2_array == null) {
                break L533;
              } else {
                ij.field_e = ll.a(0, var2_array);
                break L533;
              }
            }
            L534: {
              var2_array = il.a((byte) 73, "continuesavedgame");
              if (var2_array != null) {
                qc.field_e = ll.a(0, var2_array);
                break L534;
              } else {
                break L534;
              }
            }
            L535: {
              var2_array = il.a((byte) 85, "continuesavedgame2");
              if (null == var2_array) {
                break L535;
              } else {
                discarded$17 = ll.a(0, var2_array);
                break L535;
              }
            }
            L536: {
              var2_array = il.a((byte) 89, "quittomain");
              if (var2_array == null) {
                break L536;
              } else {
                fc.field_g = ll.a(0, var2_array);
                break L536;
              }
            }
            L537: {
              var2_array = il.a((byte) 123, "abortmission");
              if (var2_array != null) {
                je.field_b = ll.a(param0 ^ 96, var2_array);
                break L537;
              } else {
                break L537;
              }
            }
            L538: {
              var2_array = il.a((byte) 106, "nohighscores");
              if (var2_array != null) {
                ie.field_a = ll.a(param0 + -96, var2_array);
                break L538;
              } else {
                break L538;
              }
            }
            L539: {
              var2_array = il.a((byte) 102, "finalscore");
              if (var2_array != null) {
                jb.field_c = ll.a(param0 ^ 96, var2_array);
                break L539;
              } else {
                break L539;
              }
            }
            L540: {
              var2_array = il.a((byte) 115, "hardmodeunlocked");
              if (var2_array != null) {
                pd.field_f = ll.a(0, var2_array);
                break L540;
              } else {
                break L540;
              }
            }
            L541: {
              var2_array = il.a((byte) 88, "openhelp");
              if (null == var2_array) {
                break L541;
              } else {
                ee.field_z = ll.a(0, var2_array);
                break L541;
              }
            }
            L542: {
              var2_array = il.a((byte) 87, "openoptions");
              if (var2_array != null) {
                ja.field_h = ll.a(0, var2_array);
                break L542;
              } else {
                break L542;
              }
            }
            L543: {
              var2_array = il.a((byte) 72, "exitequip");
              if (var2_array == null) {
                break L543;
              } else {
                nd.field_h = ll.a(0, var2_array);
                break L543;
              }
            }
            L544: {
              var2_array = il.a((byte) 122, "decgren");
              if (var2_array != null) {
                lf.field_b = ll.a(0, var2_array);
                break L544;
              } else {
                break L544;
              }
            }
            L545: {
              var2_array = il.a((byte) 106, "incgren");
              if (var2_array == null) {
                break L545;
              } else {
                m.field_a = ll.a(0, var2_array);
                break L545;
              }
            }
            L546: {
              var2_array = il.a((byte) 82, "backtomissel");
              if (var2_array != null) {
                va.field_f = ll.a(0, var2_array);
                break L546;
              } else {
                break L546;
              }
            }
            L547: {
              var2_array = il.a((byte) 120, "startmiss");
              if (var2_array == null) {
                break L547;
              } else {
                od.field_f = ll.a(param0 + -96, var2_array);
                break L547;
              }
            }
            L548: {
              var2_array = il.a((byte) 122, "act4");
              if (var2_array == null) {
                break L548;
              } else {
                ce.field_d = ll.a(0, var2_array);
                break L548;
              }
            }
            L549: {
              var2_array = il.a((byte) 98, "act3");
              if (null != var2_array) {
                jh.field_h = ll.a(param0 ^ 96, var2_array);
                break L549;
              } else {
                break L549;
              }
            }
            L550: {
              var2_array = il.a((byte) 119, "act2");
              if (null == var2_array) {
                break L550;
              } else {
                bh.field_b = ll.a(param0 ^ 96, var2_array);
                break L550;
              }
            }
            L551: {
              var2_array = il.a((byte) 81, "act1");
              if (null != var2_array) {
                ef.field_b = ll.a(0, var2_array);
                break L551;
              } else {
                break L551;
              }
            }
            L552: {
              var2_array = il.a((byte) 120, "missionspace");
              if (null == var2_array) {
                break L552;
              } else {
                wj.field_e = ll.a(0, var2_array);
                break L552;
              }
            }
            L553: {
              var2_array = il.a((byte) 78, "normalwarning");
              if (null != var2_array) {
                dj.field_f = ll.a(0, var2_array);
                break L553;
              } else {
                break L553;
              }
            }
            L554: {
              var2_array = il.a((byte) 81, "acttext,0");
              if (var2_array == null) {
                break L554;
              } else {
                jh.field_l[0] = ll.a(0, var2_array);
                break L554;
              }
            }
            L555: {
              var2_array = il.a((byte) 120, "acttext,1");
              if (var2_array == null) {
                break L555;
              } else {
                jh.field_l[1] = ll.a(0, var2_array);
                break L555;
              }
            }
            L556: {
              var2_array = il.a((byte) 112, "acttext,2");
              if (var2_array != null) {
                jh.field_l[2] = ll.a(0, var2_array);
                break L556;
              } else {
                break L556;
              }
            }
            L557: {
              var2_array = il.a((byte) 117, "acttext,3");
              if (null == var2_array) {
                break L557;
              } else {
                jh.field_l[3] = ll.a(0, var2_array);
                break L557;
              }
            }
            L558: {
              var2_array = il.a((byte) 97, "acttext,4");
              if (var2_array == null) {
                break L558;
              } else {
                jh.field_l[4] = ll.a(0, var2_array);
                break L558;
              }
            }
            L559: {
              var2_array = il.a((byte) 105, "acttext,5");
              if (null == var2_array) {
                break L559;
              } else {
                jh.field_l[5] = ll.a(0, var2_array);
                break L559;
              }
            }
            L560: {
              var2_array = il.a((byte) 120, "acttext,6");
              if (var2_array == null) {
                break L560;
              } else {
                jh.field_l[6] = ll.a(0, var2_array);
                break L560;
              }
            }
            L561: {
              var2_array = il.a((byte) 76, "acttext,7");
              if (null == var2_array) {
                break L561;
              } else {
                jh.field_l[7] = ll.a(0, var2_array);
                break L561;
              }
            }
            L562: {
              var2_array = il.a((byte) 123, "acttext,8");
              if (var2_array == null) {
                break L562;
              } else {
                jh.field_l[8] = ll.a(0, var2_array);
                break L562;
              }
            }
            L563: {
              var2_array = il.a((byte) 119, "acttext,9");
              if (null != var2_array) {
                jh.field_l[9] = ll.a(0, var2_array);
                break L563;
              } else {
                break L563;
              }
            }
            L564: {
              var2_array = il.a((byte) 118, "acttext,10");
              if (null == var2_array) {
                break L564;
              } else {
                jh.field_l[10] = ll.a(param0 + -96, var2_array);
                break L564;
              }
            }
            L565: {
              var2_array = il.a((byte) 114, "acttext,11");
              if (null == var2_array) {
                break L565;
              } else {
                jh.field_l[11] = ll.a(0, var2_array);
                break L565;
              }
            }
            L566: {
              var2_array = il.a((byte) 119, "acttext,12");
              if (null != var2_array) {
                jh.field_l[12] = ll.a(0, var2_array);
                break L566;
              } else {
                break L566;
              }
            }
            L567: {
              var2_array = il.a((byte) 75, "acttext,13");
              if (null != var2_array) {
                jh.field_l[13] = ll.a(0, var2_array);
                break L567;
              } else {
                break L567;
              }
            }
            L568: {
              var2_array = il.a((byte) 116, "acttext,14");
              if (null != var2_array) {
                jh.field_l[14] = ll.a(0, var2_array);
                break L568;
              } else {
                break L568;
              }
            }
            L569: {
              var2_array = il.a((byte) 121, "acttext,15");
              if (var2_array != null) {
                jh.field_l[15] = ll.a(0, var2_array);
                break L569;
              } else {
                break L569;
              }
            }
            L570: {
              var2_array = il.a((byte) 112, "acttext,16");
              if (var2_array == null) {
                break L570;
              } else {
                jh.field_l[16] = ll.a(0, var2_array);
                break L570;
              }
            }
            L571: {
              var2_array = il.a((byte) 110, "acttext,17");
              if (var2_array == null) {
                break L571;
              } else {
                jh.field_l[17] = ll.a(param0 + -96, var2_array);
                break L571;
              }
            }
            L572: {
              var2_array = il.a((byte) 97, "acttext,18");
              if (var2_array == null) {
                break L572;
              } else {
                jh.field_l[18] = ll.a(0, var2_array);
                break L572;
              }
            }
            L573: {
              var2_array = il.a((byte) 93, "acttext,19");
              if (var2_array == null) {
                break L573;
              } else {
                jh.field_l[19] = ll.a(0, var2_array);
                break L573;
              }
            }
            L574: {
              var2_array = il.a((byte) 74, "selectmission");
              if (var2_array != null) {
                eb.field_G = ll.a(0, var2_array);
                break L574;
              } else {
                break L574;
              }
            }
            L575: {
              var2_array = il.a((byte) 110, "selectcitymission");
              if (var2_array == null) {
                break L575;
              } else {
                discarded$18 = ll.a(0, var2_array);
                break L575;
              }
            }
            L576: {
              var2_array = il.a((byte) 118, "shortmissiontext,0");
              if (null == var2_array) {
                break L576;
              } else {
                kk.field_b[0] = ll.a(sl.a((int) param0, 96), var2_array);
                break L576;
              }
            }
            L577: {
              var2_array = il.a((byte) 123, "shortmissiontext,1");
              if (var2_array != null) {
                kk.field_b[1] = ll.a(0, var2_array);
                break L577;
              } else {
                break L577;
              }
            }
            L578: {
              var2_array = il.a((byte) 100, "shortmissiontext,2");
              if (var2_array == null) {
                break L578;
              } else {
                kk.field_b[2] = ll.a(0, var2_array);
                break L578;
              }
            }
            L579: {
              var2_array = il.a((byte) 105, "shortmissiontext,3");
              if (var2_array == null) {
                break L579;
              } else {
                kk.field_b[3] = ll.a(0, var2_array);
                break L579;
              }
            }
            L580: {
              var2_array = il.a((byte) 79, "shortmissiontext,4");
              if (null != var2_array) {
                kk.field_b[4] = ll.a(sl.a((int) param0, 96), var2_array);
                break L580;
              } else {
                break L580;
              }
            }
            L581: {
              var2_array = il.a((byte) 71, "shortmissiontext,5");
              if (null == var2_array) {
                break L581;
              } else {
                kk.field_b[5] = ll.a(0, var2_array);
                break L581;
              }
            }
            L582: {
              var2_array = il.a((byte) 71, "shortmissiontext,6");
              if (null != var2_array) {
                kk.field_b[6] = ll.a(0, var2_array);
                break L582;
              } else {
                break L582;
              }
            }
            L583: {
              var2_array = il.a((byte) 94, "shortmissiontext,7");
              if (null == var2_array) {
                break L583;
              } else {
                kk.field_b[7] = ll.a(0, var2_array);
                break L583;
              }
            }
            L584: {
              var2_array = il.a((byte) 100, "shortmissiontext,8");
              if (null != var2_array) {
                kk.field_b[8] = ll.a(0, var2_array);
                break L584;
              } else {
                break L584;
              }
            }
            L585: {
              var2_array = il.a((byte) 100, "shortmissiontext,9");
              if (var2_array == null) {
                break L585;
              } else {
                kk.field_b[9] = ll.a(0, var2_array);
                break L585;
              }
            }
            L586: {
              var2_array = il.a((byte) 104, "shortmissiontext,10");
              if (null == var2_array) {
                break L586;
              } else {
                kk.field_b[10] = ll.a(0, var2_array);
                break L586;
              }
            }
            L587: {
              var2_array = il.a((byte) 104, "shortmissiontext,11");
              if (null != var2_array) {
                kk.field_b[11] = ll.a(0, var2_array);
                break L587;
              } else {
                break L587;
              }
            }
            L588: {
              var2_array = il.a((byte) 75, "shortmissiontext,12");
              if (null == var2_array) {
                break L588;
              } else {
                kk.field_b[12] = ll.a(0, var2_array);
                break L588;
              }
            }
            L589: {
              var2_array = il.a((byte) 87, "shortmissiontext,13");
              if (var2_array == null) {
                break L589;
              } else {
                kk.field_b[13] = ll.a(0, var2_array);
                break L589;
              }
            }
            L590: {
              var2_array = il.a((byte) 96, "shortmissiontext,14");
              if (null != var2_array) {
                kk.field_b[14] = ll.a(0, var2_array);
                break L590;
              } else {
                break L590;
              }
            }
            L591: {
              var2_array = il.a((byte) 109, "shortmissiontext,15");
              if (var2_array != null) {
                kk.field_b[15] = ll.a(0, var2_array);
                break L591;
              } else {
                break L591;
              }
            }
            L592: {
              var2_array = il.a((byte) 121, "shortmissiontext,16");
              if (var2_array != null) {
                kk.field_b[16] = ll.a(0, var2_array);
                break L592;
              } else {
                break L592;
              }
            }
            L593: {
              var2_array = il.a((byte) 91, "shortmissiontext,17");
              if (null != var2_array) {
                kk.field_b[17] = ll.a(0, var2_array);
                break L593;
              } else {
                break L593;
              }
            }
            L594: {
              var2_array = il.a((byte) 77, "shortmissiontext,18");
              if (null == var2_array) {
                break L594;
              } else {
                kk.field_b[18] = ll.a(0, var2_array);
                break L594;
              }
            }
            L595: {
              var2_array = il.a((byte) 123, "shortmissiontext,19");
              if (var2_array == null) {
                break L595;
              } else {
                kk.field_b[19] = ll.a(0, var2_array);
                break L595;
              }
            }
            L596: {
              var2_array = il.a((byte) 108, "shortmissiontext,20");
              if (null == var2_array) {
                break L596;
              } else {
                kk.field_b[20] = ll.a(0, var2_array);
                break L596;
              }
            }
            L597: {
              var2_array = il.a((byte) 73, "shortmissiontext,21");
              if (var2_array != null) {
                kk.field_b[21] = ll.a(0, var2_array);
                break L597;
              } else {
                break L597;
              }
            }
            L598: {
              var2_array = il.a((byte) 72, "shortmissiontext,22");
              if (var2_array != null) {
                kk.field_b[22] = ll.a(0, var2_array);
                break L598;
              } else {
                break L598;
              }
            }
            L599: {
              var2_array = il.a((byte) 101, "clicktochooselandings");
              if (var2_array == null) {
                break L599;
              } else {
                field_g = ll.a(0, var2_array);
                break L599;
              }
            }
            L600: {
              var2_array = il.a((byte) 111, "enterresearch");
              if (null != var2_array) {
                td.field_h = ll.a(0, var2_array);
                break L600;
              } else {
                break L600;
              }
            }
            L601: {
              var2_array = il.a((byte) 111, "equipsoldiers");
              if (var2_array != null) {
                j.field_I = ll.a(0, var2_array);
                break L601;
              } else {
                break L601;
              }
            }
            L602: {
              var2_array = il.a((byte) 85, "startthemission");
              if (null == var2_array) {
                break L602;
              } else {
                va.field_i = ll.a(0, var2_array);
                break L602;
              }
            }
            L603: {
              var2_array = il.a((byte) 104, "selamission");
              if (null != var2_array) {
                lb.field_e = ll.a(0, var2_array);
                break L603;
              } else {
                break L603;
              }
            }
            L604: {
              var2_array = il.a((byte) 115, "clicktosel");
              if (var2_array != null) {
                nl.field_c = ll.a(0, var2_array);
                break L604;
              } else {
                break L604;
              }
            }
            L605: {
              var2_array = il.a((byte) 85, "undoplacement");
              if (null == var2_array) {
                break L605;
              } else {
                rf.field_t = ll.a(0, var2_array);
                break L605;
              }
            }
            L606: {
              var2_array = il.a((byte) 124, "landtroops");
              if (var2_array != null) {
                j.field_K = ll.a(0, var2_array);
                break L606;
              } else {
                break L606;
              }
            }
            L607: {
              var2_array = il.a((byte) 113, "exitresearch");
              if (var2_array == null) {
                break L607;
              } else {
                ia.field_n = ll.a(0, var2_array);
                break L607;
              }
            }
            L608: {
              var2_array = il.a((byte) 91, "researchtopic");
              if (null != var2_array) {
                sb.field_k = ll.a(0, var2_array);
                break L608;
              } else {
                break L608;
              }
            }
            L609: {
              var2_array = il.a((byte) 102, "stepno");
              if (null != var2_array) {
                discarded$19 = ll.a(0, var2_array);
                break L609;
              } else {
                break L609;
              }
            }
            L610: {
              var2_array = il.a((byte) 76, "tutorialtext,0");
              if (null != var2_array) {
                kl.field_d[0] = ll.a(0, var2_array);
                break L610;
              } else {
                break L610;
              }
            }
            L611: {
              var2_array = il.a((byte) 114, "tutorialtext,1");
              if (null == var2_array) {
                break L611;
              } else {
                kl.field_d[1] = ll.a(param0 + -96, var2_array);
                break L611;
              }
            }
            L612: {
              var2_array = il.a((byte) 115, "tutorialtext,2");
              if (null != var2_array) {
                kl.field_d[2] = ll.a(0, var2_array);
                break L612;
              } else {
                break L612;
              }
            }
            L613: {
              var2_array = il.a((byte) 114, "tutorialtext,3");
              if (var2_array == null) {
                break L613;
              } else {
                kl.field_d[3] = ll.a(0, var2_array);
                break L613;
              }
            }
            L614: {
              var2_array = il.a((byte) 105, "tutorialtext,4");
              if (null != var2_array) {
                kl.field_d[4] = ll.a(0, var2_array);
                break L614;
              } else {
                break L614;
              }
            }
            L615: {
              var2_array = il.a((byte) 115, "tutorialtext,5");
              if (var2_array != null) {
                kl.field_d[5] = ll.a(0, var2_array);
                break L615;
              } else {
                break L615;
              }
            }
            L616: {
              var2_array = il.a((byte) 94, "tutorialtext,6");
              if (null != var2_array) {
                kl.field_d[6] = ll.a(param0 + -96, var2_array);
                break L616;
              } else {
                break L616;
              }
            }
            L617: {
              var2_array = il.a((byte) 126, "tutorialtext,7");
              if (var2_array == null) {
                break L617;
              } else {
                kl.field_d[7] = ll.a(0, var2_array);
                break L617;
              }
            }
            L618: {
              var2_array = il.a((byte) 100, "tutorialtext,8");
              if (var2_array == null) {
                break L618;
              } else {
                kl.field_d[8] = ll.a(param0 + -96, var2_array);
                break L618;
              }
            }
            L619: {
              var2_array = il.a((byte) 85, "tutorialtext,9");
              if (null == var2_array) {
                break L619;
              } else {
                kl.field_d[9] = ll.a(0, var2_array);
                break L619;
              }
            }
            L620: {
              var2_array = il.a((byte) 104, "tutorialtext,10");
              if (null == var2_array) {
                break L620;
              } else {
                kl.field_d[10] = ll.a(0, var2_array);
                break L620;
              }
            }
            L621: {
              var2_array = il.a((byte) 76, "tutorialtext,11");
              if (null != var2_array) {
                kl.field_d[11] = ll.a(0, var2_array);
                break L621;
              } else {
                break L621;
              }
            }
            L622: {
              var2_array = il.a((byte) 101, "tutorialtext,12");
              if (var2_array != null) {
                kl.field_d[12] = ll.a(0, var2_array);
                break L622;
              } else {
                break L622;
              }
            }
            L623: {
              var2_array = il.a((byte) 72, "tutorialtext,13");
              if (null != var2_array) {
                kl.field_d[13] = ll.a(param0 + -96, var2_array);
                break L623;
              } else {
                break L623;
              }
            }
            L624: {
              var2_array = il.a((byte) 77, "tutorialtext,14");
              if (var2_array != null) {
                kl.field_d[14] = ll.a(0, var2_array);
                break L624;
              } else {
                break L624;
              }
            }
            L625: {
              var2_array = il.a((byte) 71, "tutorialtext,15");
              if (null == var2_array) {
                break L625;
              } else {
                kl.field_d[15] = ll.a(0, var2_array);
                break L625;
              }
            }
            L626: {
              var2_array = il.a((byte) 100, "tutorialtext,16");
              if (var2_array != null) {
                kl.field_d[16] = ll.a(param0 + -96, var2_array);
                break L626;
              } else {
                break L626;
              }
            }
            L627: {
              var2_array = il.a((byte) 124, "tutorialtext,17");
              if (var2_array != null) {
                kl.field_d[17] = ll.a(0, var2_array);
                break L627;
              } else {
                break L627;
              }
            }
            L628: {
              var2_array = il.a((byte) 96, "tutorialtext,18");
              if (null == var2_array) {
                break L628;
              } else {
                kl.field_d[18] = ll.a(0, var2_array);
                break L628;
              }
            }
            L629: {
              var2_array = il.a((byte) 120, "tutorialtext,19");
              if (null == var2_array) {
                break L629;
              } else {
                kl.field_d[19] = ll.a(sl.a((int) param0, 96), var2_array);
                break L629;
              }
            }
            L630: {
              var2_array = il.a((byte) 80, "tutorialtext,20");
              if (var2_array == null) {
                break L630;
              } else {
                kl.field_d[20] = ll.a(0, var2_array);
                break L630;
              }
            }
            L631: {
              var2_array = il.a((byte) 104, "tutorialtext,21");
              if (null != var2_array) {
                kl.field_d[21] = ll.a(0, var2_array);
                break L631;
              } else {
                break L631;
              }
            }
            L632: {
              var2_array = il.a((byte) 82, "tutorialtext,22");
              if (var2_array == null) {
                break L632;
              } else {
                kl.field_d[22] = ll.a(0, var2_array);
                break L632;
              }
            }
            L633: {
              var2_array = il.a((byte) 84, "tutorialtext,23");
              if (null == var2_array) {
                break L633;
              } else {
                kl.field_d[23] = ll.a(0, var2_array);
                break L633;
              }
            }
            L634: {
              var2_array = il.a((byte) 91, "tutorialtext,24");
              if (null == var2_array) {
                break L634;
              } else {
                kl.field_d[24] = ll.a(0, var2_array);
                break L634;
              }
            }
            L635: {
              var2_array = il.a((byte) 114, "tutorialtext,25");
              if (var2_array != null) {
                kl.field_d[25] = ll.a(0, var2_array);
                break L635;
              } else {
                break L635;
              }
            }
            L636: {
              var2_array = il.a((byte) 89, "tutorialtext,26");
              if (null != var2_array) {
                kl.field_d[26] = ll.a(0, var2_array);
                break L636;
              } else {
                break L636;
              }
            }
            L637: {
              var2_array = il.a((byte) 114, "tutorialtext,27");
              if (var2_array != null) {
                kl.field_d[27] = ll.a(sl.a((int) param0, 96), var2_array);
                break L637;
              } else {
                break L637;
              }
            }
            L638: {
              var2_array = il.a((byte) 96, "tutorialtext,28");
              if (null != var2_array) {
                kl.field_d[28] = ll.a(0, var2_array);
                break L638;
              } else {
                break L638;
              }
            }
            L639: {
              var2_array = il.a((byte) 80, "tutorialtext,29");
              if (null == var2_array) {
                break L639;
              } else {
                kl.field_d[29] = ll.a(0, var2_array);
                break L639;
              }
            }
            L640: {
              var2_array = il.a((byte) 74, "tutorialtext,30");
              if (var2_array == null) {
                break L640;
              } else {
                kl.field_d[30] = ll.a(0, var2_array);
                break L640;
              }
            }
            L641: {
              var2_array = il.a((byte) 76, "tutorialtext,31");
              if (null != var2_array) {
                kl.field_d[31] = ll.a(0, var2_array);
                break L641;
              } else {
                break L641;
              }
            }
            L642: {
              var2_array = il.a((byte) 111, "tutorialtext,32");
              if (null != var2_array) {
                kl.field_d[32] = ll.a(param0 + -96, var2_array);
                break L642;
              } else {
                break L642;
              }
            }
            L643: {
              var2_array = il.a((byte) 93, "tutorialtext,33");
              if (null != var2_array) {
                kl.field_d[33] = ll.a(0, var2_array);
                break L643;
              } else {
                break L643;
              }
            }
            L644: {
              var2_array = il.a((byte) 89, "tutorialtext,34");
              if (null == var2_array) {
                break L644;
              } else {
                kl.field_d[34] = ll.a(0, var2_array);
                break L644;
              }
            }
            L645: {
              var2_array = il.a((byte) 89, "tutorialtext,35");
              if (var2_array == null) {
                break L645;
              } else {
                kl.field_d[35] = ll.a(0, var2_array);
                break L645;
              }
            }
            L646: {
              var2_array = il.a((byte) 77, "tutorialtext,36");
              if (var2_array == null) {
                break L646;
              } else {
                kl.field_d[36] = ll.a(0, var2_array);
                break L646;
              }
            }
            L647: {
              var2_array = il.a((byte) 79, "tutorialtext,37");
              if (null == var2_array) {
                break L647;
              } else {
                kl.field_d[37] = ll.a(param0 + -96, var2_array);
                break L647;
              }
            }
            L648: {
              var2_array = il.a((byte) 105, "tutorialtext,38");
              if (null != var2_array) {
                kl.field_d[38] = ll.a(sl.a((int) param0, 96), var2_array);
                break L648;
              } else {
                break L648;
              }
            }
            L649: {
              var2_array = il.a((byte) 90, "tutorialtext,39");
              if (var2_array == null) {
                break L649;
              } else {
                kl.field_d[39] = ll.a(sl.a((int) param0, 96), var2_array);
                break L649;
              }
            }
            L650: {
              var2_array = il.a((byte) 109, "tutorialtext,40");
              if (var2_array != null) {
                kl.field_d[40] = ll.a(0, var2_array);
                break L650;
              } else {
                break L650;
              }
            }
            L651: {
              var2_array = il.a((byte) 85, "tutorialtext,41");
              if (null == var2_array) {
                break L651;
              } else {
                kl.field_d[41] = ll.a(param0 + -96, var2_array);
                break L651;
              }
            }
            L652: {
              var2_array = il.a((byte) 87, "tutorialtext,42");
              if (null != var2_array) {
                kl.field_d[42] = ll.a(0, var2_array);
                break L652;
              } else {
                break L652;
              }
            }
            L653: {
              var2_array = il.a((byte) 88, "tutorialtext,43");
              if (var2_array == null) {
                break L653;
              } else {
                kl.field_d[43] = ll.a(0, var2_array);
                break L653;
              }
            }
            L654: {
              var2_array = il.a((byte) 123, "tutorialtext,44");
              if (null != var2_array) {
                kl.field_d[44] = ll.a(0, var2_array);
                break L654;
              } else {
                break L654;
              }
            }
            L655: {
              var2_array = il.a((byte) 90, "tutorialtext,45");
              if (var2_array == null) {
                break L655;
              } else {
                kl.field_d[45] = ll.a(0, var2_array);
                break L655;
              }
            }
            L656: {
              var2_array = il.a((byte) 117, "tutorialtext,46");
              if (null == var2_array) {
                break L656;
              } else {
                kl.field_d[46] = ll.a(0, var2_array);
                break L656;
              }
            }
            L657: {
              var2_array = il.a((byte) 116, "tutorialtext,47");
              if (null == var2_array) {
                break L657;
              } else {
                kl.field_d[47] = ll.a(0, var2_array);
                break L657;
              }
            }
            L658: {
              var2_array = il.a((byte) 106, "tutorialtext,48");
              if (var2_array == null) {
                break L658;
              } else {
                kl.field_d[48] = ll.a(0, var2_array);
                break L658;
              }
            }
            L659: {
              var2_array = il.a((byte) 84, "tutorialtext,49");
              if (null == var2_array) {
                break L659;
              } else {
                kl.field_d[49] = ll.a(0, var2_array);
                break L659;
              }
            }
            L660: {
              var2_array = il.a((byte) 106, "tutorialtext,50");
              if (null == var2_array) {
                break L660;
              } else {
                kl.field_d[50] = ll.a(param0 + -96, var2_array);
                break L660;
              }
            }
            L661: {
              var2_array = il.a((byte) 72, "tutorialtext,51");
              if (var2_array != null) {
                kl.field_d[51] = ll.a(param0 + -96, var2_array);
                break L661;
              } else {
                break L661;
              }
            }
            L662: {
              var2_array = il.a((byte) 126, "tutorialtext,52");
              if (null != var2_array) {
                kl.field_d[52] = ll.a(0, var2_array);
                break L662;
              } else {
                break L662;
              }
            }
            L663: {
              var2_array = il.a((byte) 92, "tutorialtext,53");
              if (null == var2_array) {
                break L663;
              } else {
                kl.field_d[53] = ll.a(0, var2_array);
                break L663;
              }
            }
            L664: {
              var2_array = il.a((byte) 127, "tutorialtext,54");
              if (null == var2_array) {
                break L664;
              } else {
                kl.field_d[54] = ll.a(0, var2_array);
                break L664;
              }
            }
            L665: {
              var2_array = il.a((byte) 103, "tutorialtext,55");
              if (var2_array == null) {
                break L665;
              } else {
                kl.field_d[55] = ll.a(sl.a((int) param0, 96), var2_array);
                break L665;
              }
            }
            L666: {
              var2_array = il.a((byte) 104, "tutorialtext,56");
              if (null == var2_array) {
                break L666;
              } else {
                kl.field_d[56] = ll.a(0, var2_array);
                break L666;
              }
            }
            L667: {
              var2_array = il.a((byte) 125, "tutorialtext,57");
              if (null == var2_array) {
                break L667;
              } else {
                kl.field_d[57] = ll.a(param0 + -96, var2_array);
                break L667;
              }
            }
            L668: {
              var2_array = il.a((byte) 90, "tutorialtext,58");
              if (var2_array != null) {
                kl.field_d[58] = ll.a(0, var2_array);
                break L668;
              } else {
                break L668;
              }
            }
            L669: {
              var2_array = il.a((byte) 127, "tutorialtext,59");
              if (null == var2_array) {
                break L669;
              } else {
                kl.field_d[59] = ll.a(0, var2_array);
                break L669;
              }
            }
            L670: {
              var2_array = il.a((byte) 125, "tutorialtext,60");
              if (null != var2_array) {
                kl.field_d[60] = ll.a(0, var2_array);
                break L670;
              } else {
                break L670;
              }
            }
            L671: {
              var2_array = il.a((byte) 83, "tutorialtext,61");
              if (null == var2_array) {
                break L671;
              } else {
                kl.field_d[61] = ll.a(0, var2_array);
                break L671;
              }
            }
            L672: {
              var2_array = il.a((byte) 121, "tutorialtext,62");
              if (null != var2_array) {
                kl.field_d[62] = ll.a(param0 + -96, var2_array);
                break L672;
              } else {
                break L672;
              }
            }
            L673: {
              var2_array = il.a((byte) 113, "tutorialtext,63");
              if (var2_array != null) {
                kl.field_d[63] = ll.a(0, var2_array);
                break L673;
              } else {
                break L673;
              }
            }
            L674: {
              var2_array = il.a(param0, "tutorialtext,64");
              if (var2_array == null) {
                break L674;
              } else {
                kl.field_d[64] = ll.a(param0 + -96, var2_array);
                break L674;
              }
            }
            L675: {
              var2_array = il.a((byte) 71, "tutorialtext,65");
              if (null != var2_array) {
                kl.field_d[65] = ll.a(0, var2_array);
                break L675;
              } else {
                break L675;
              }
            }
            L676: {
              var2_array = il.a((byte) 116, "tutorialtext,66");
              if (null != var2_array) {
                kl.field_d[66] = ll.a(0, var2_array);
                break L676;
              } else {
                break L676;
              }
            }
            L677: {
              var2_array = il.a((byte) 89, "tutorialtext,67");
              if (var2_array != null) {
                kl.field_d[67] = ll.a(0, var2_array);
                break L677;
              } else {
                break L677;
              }
            }
            L678: {
              var2_array = il.a((byte) 119, "tutorialtext,68");
              if (null != var2_array) {
                kl.field_d[68] = ll.a(0, var2_array);
                break L678;
              } else {
                break L678;
              }
            }
            L679: {
              var2_array = il.a((byte) 92, "tutorialtext,69");
              if (null == var2_array) {
                break L679;
              } else {
                kl.field_d[69] = ll.a(param0 + -96, var2_array);
                break L679;
              }
            }
            L680: {
              var2_array = il.a((byte) 99, "tutorialtext,70");
              if (null == var2_array) {
                break L680;
              } else {
                kl.field_d[70] = ll.a(0, var2_array);
                break L680;
              }
            }
            L681: {
              var2_array = il.a((byte) 89, "tutorialtext,71");
              if (var2_array != null) {
                kl.field_d[71] = ll.a(0, var2_array);
                break L681;
              } else {
                break L681;
              }
            }
            L682: {
              var2_array = il.a((byte) 113, "tutorialtext,72");
              if (var2_array == null) {
                break L682;
              } else {
                kl.field_d[72] = ll.a(param0 + -96, var2_array);
                break L682;
              }
            }
            L683: {
              var2_array = il.a((byte) 126, "tutorialtext,73");
              if (var2_array == null) {
                break L683;
              } else {
                kl.field_d[73] = ll.a(0, var2_array);
                break L683;
              }
            }
            L684: {
              var2_array = il.a((byte) 118, "tutorialtext,74");
              if (null != var2_array) {
                kl.field_d[74] = ll.a(sl.a((int) param0, 96), var2_array);
                break L684;
              } else {
                break L684;
              }
            }
            L685: {
              var2_array = il.a((byte) 82, "tutorialtext,75");
              if (var2_array != null) {
                kl.field_d[75] = ll.a(0, var2_array);
                break L685;
              } else {
                break L685;
              }
            }
            L686: {
              var2_array = il.a((byte) 72, "tutorialtext,76");
              if (var2_array == null) {
                break L686;
              } else {
                kl.field_d[76] = ll.a(0, var2_array);
                break L686;
              }
            }
            L687: {
              var2_array = il.a((byte) 108, "tutorialtext,77");
              if (null != var2_array) {
                kl.field_d[77] = ll.a(0, var2_array);
                break L687;
              } else {
                break L687;
              }
            }
            L688: {
              var2_array = il.a((byte) 82, "tutorialtext,78");
              if (var2_array == null) {
                break L688;
              } else {
                kl.field_d[78] = ll.a(0, var2_array);
                break L688;
              }
            }
            L689: {
              var2_array = il.a((byte) 83, "tutorialtext,79");
              if (null == var2_array) {
                break L689;
              } else {
                kl.field_d[79] = ll.a(0, var2_array);
                break L689;
              }
            }
            L690: {
              var2_array = il.a((byte) 89, "tutorialtext,80");
              if (var2_array == null) {
                break L690;
              } else {
                kl.field_d[80] = ll.a(0, var2_array);
                break L690;
              }
            }
            L691: {
              var2_array = il.a((byte) 116, "tutorialtext,81");
              if (null != var2_array) {
                kl.field_d[81] = ll.a(0, var2_array);
                break L691;
              } else {
                break L691;
              }
            }
            L692: {
              var2_array = il.a((byte) 76, "tutorialtext,82");
              if (null == var2_array) {
                break L692;
              } else {
                kl.field_d[82] = ll.a(sl.a((int) param0, 96), var2_array);
                break L692;
              }
            }
            L693: {
              var2_array = il.a((byte) 122, "tutorialtext,83");
              if (null != var2_array) {
                kl.field_d[83] = ll.a(0, var2_array);
                break L693;
              } else {
                break L693;
              }
            }
            L694: {
              var2_array = il.a((byte) 84, "tutorialtext,84");
              if (null == var2_array) {
                break L694;
              } else {
                kl.field_d[84] = ll.a(0, var2_array);
                break L694;
              }
            }
            L695: {
              var2_array = il.a((byte) 127, "tutorialtext,85");
              if (null == var2_array) {
                break L695;
              } else {
                kl.field_d[85] = ll.a(sl.a((int) param0, 96), var2_array);
                break L695;
              }
            }
            L696: {
              var2_array = il.a((byte) 102, "tutorialtext,86");
              if (null != var2_array) {
                kl.field_d[86] = ll.a(0, var2_array);
                break L696;
              } else {
                break L696;
              }
            }
            L697: {
              var2_array = il.a((byte) 114, "instructions_pages,0");
              if (null == var2_array) {
                break L697;
              } else {
                re.field_h[0] = ll.a(0, var2_array);
                break L697;
              }
            }
            L698: {
              var2_array = il.a((byte) 107, "instructions_pages,1");
              if (null == var2_array) {
                break L698;
              } else {
                re.field_h[1] = ll.a(0, var2_array);
                break L698;
              }
            }
            L699: {
              var2_array = il.a((byte) 84, "instructions_pages,2");
              if (null == var2_array) {
                break L699;
              } else {
                re.field_h[2] = ll.a(sl.a((int) param0, 96), var2_array);
                break L699;
              }
            }
            L700: {
              var2_array = il.a((byte) 101, "all");
              if (null != var2_array) {
                discarded$20 = ll.a(0, var2_array);
                break L700;
              } else {
                break L700;
              }
            }
            L701: {
              var2_array = il.a((byte) 75, "mine");
              if (null == var2_array) {
                break L701;
              } else {
                discarded$21 = ll.a(0, var2_array);
                break L701;
              }
            }
            L702: {
              var2_array = il.a((byte) 119, "besteach");
              if (null != var2_array) {
                discarded$22 = ll.a(0, var2_array);
                break L702;
              } else {
                break L702;
              }
            }
            L703: {
              var2_array = il.a((byte) 119, "benefits");
              if (null == var2_array) {
                break L703;
              } else {
                discarded$23 = ll.a(0, var2_array);
                break L703;
              }
            }
            L704: {
              var2_array = il.a((byte) 96, "keycode_M");
              if (null != var2_array) {
                wb.field_e = var2_array[0] & 255;
                break L704;
              } else {
                break L704;
              }
            }
            L705: {
              var2_array = il.a((byte) 82, "keycode_W");
              if (var2_array != null) {
                rh.field_c = var2_array[0] & 255;
                break L705;
              } else {
                break L705;
              }
            }
            L706: {
              var2_array = il.a((byte) 101, "keycode_A");
              if (var2_array != null) {
                fl.field_b = var2_array[0] & 255;
                break L706;
              } else {
                break L706;
              }
            }
            L707: {
              var2_array = il.a((byte) 80, "keycode_C");
              if (null == var2_array) {
                break L707;
              } else {
                ef.field_h = var2_array[0] & 255;
                break L707;
              }
            }
            L708: {
              var2_array = il.a((byte) 104, "keycode_COMMA");
              if (null != var2_array) {
                uf.field_b = var2_array[0] & 255;
                break L708;
              } else {
                break L708;
              }
            }
            L709: {
              var2_array = il.a((byte) 91, "keycode_FULLSTOP");
              if (null == var2_array) {
                break L709;
              } else {
                ne.field_e = 255 & var2_array[0];
                break L709;
              }
            }
            nj.field_i = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L710: {
            var2 = decompiledCaughtException;
            stackOut_2488_0 = (RuntimeException) (var2);
            stackOut_2488_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
            stackIn_2491_0 = stackOut_2488_0;
            stackIn_2491_1 = stackOut_2488_1;
            stackIn_2489_0 = stackOut_2488_0;
            stackIn_2489_1 = stackOut_2488_1;
            if (param1 == null) {
              stackOut_2491_0 = (RuntimeException) ((Object) stackIn_2491_0);
              stackOut_2491_1 = (StringBuilder) ((Object) stackIn_2491_1);
              stackOut_2491_2 = "null";
              stackIn_2492_0 = stackOut_2491_0;
              stackIn_2492_1 = stackOut_2491_1;
              stackIn_2492_2 = stackOut_2491_2;
              break L710;
            } else {
              stackOut_2489_0 = (RuntimeException) ((Object) stackIn_2489_0);
              stackOut_2489_1 = (StringBuilder) ((Object) stackIn_2489_1);
              stackOut_2489_2 = "{...}";
              stackIn_2492_0 = stackOut_2489_0;
              stackIn_2492_1 = stackOut_2489_1;
              stackIn_2492_2 = stackOut_2489_2;
              break L710;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_2492_0), stackIn_2492_2 + ')');
        }
        L711: {
          if (var3 == 0) {
            break L711;
          } else {
            L712: {
              if (!eh.field_j) {
                stackOut_2499_0 = 1;
                stackIn_2500_0 = stackOut_2499_0;
                break L712;
              } else {
                stackOut_2497_0 = 0;
                stackIn_2500_0 = stackOut_2497_0;
                break L712;
              }
            }
            eh.field_j = stackIn_2500_0 != 0;
            break L711;
          }
        }
    }

    public static void a(boolean param0) {
        try {
            field_g = null;
            field_c = null;
            field_d = null;
            field_b = null;
            field_a = null;
            if (param0) {
                field_a = (fa) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "bl.B(" + param0 + ')');
        }
    }

    static {
        field_g = "Click on the map to choose locations to land your squad members.";
        field_c = "Type your age in years";
        field_d = "Loading graphics";
    }
}
