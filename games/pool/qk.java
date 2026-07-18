/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static lr field_a;
    static vh field_f;
    static volatile int field_g;
    static int field_d;
    static boolean field_b;
    static String[][] field_c;
    static vh field_e;

    final static void a(di param0, int param1) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Pool.field_O;
          ib.field_u = param0;
          var2 = cm.a("text_game_name", (byte) 29);
          if (null != var2) {
            wm.field_Yb = a.a(var2, 127);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = cm.a("text_benefits,0", (byte) 117);
          if (null != var2) {
            vd.field_l[0] = a.a(var2, 125);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = cm.a("text_benefits,1", (byte) 127);
          if (null == var2) {
            break L2;
          } else {
            vd.field_l[1] = a.a(var2, -30);
            break L2;
          }
        }
        L3: {
          var2 = cm.a("text_benefits,2", (byte) 57);
          if (null != var2) {
            vd.field_l[2] = a.a(var2, -40);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = cm.a("achievement_names,0", (byte) 27);
          if (null != var2) {
            md.field_a[0] = a.a(var2, 125);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = cm.a("achievement_names,1", (byte) 70);
          if (null == var2) {
            break L5;
          } else {
            md.field_a[1] = a.a(var2, 123);
            break L5;
          }
        }
        L6: {
          var2 = cm.a("achievement_names,2", (byte) 37);
          if (var2 == null) {
            break L6;
          } else {
            md.field_a[2] = a.a(var2, 124);
            break L6;
          }
        }
        L7: {
          var2 = cm.a("achievement_names,3", (byte) 41);
          if (null != var2) {
            md.field_a[3] = a.a(var2, -26);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = cm.a("achievement_names,4", (byte) 54);
          if (null != var2) {
            md.field_a[4] = a.a(var2, 123);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          var2 = cm.a("achievement_names,5", (byte) 88);
          if (var2 != null) {
            md.field_a[5] = a.a(var2, -31);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = cm.a("achievement_names,6", (byte) 87);
          if (null == var2) {
            break L10;
          } else {
            md.field_a[6] = a.a(var2, 127);
            break L10;
          }
        }
        L11: {
          var2 = cm.a("achievement_names,7", (byte) 99);
          if (null == var2) {
            break L11;
          } else {
            md.field_a[7] = a.a(var2, 123);
            break L11;
          }
        }
        L12: {
          var2 = cm.a("achievement_names,8", (byte) 127);
          if (null != var2) {
            md.field_a[8] = a.a(var2, 126);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = cm.a("achievement_names,9", (byte) 47);
          if (null == var2) {
            break L13;
          } else {
            md.field_a[9] = a.a(var2, 125);
            break L13;
          }
        }
        L14: {
          var2 = cm.a("achievement_names,10", (byte) 87);
          if (var2 != null) {
            md.field_a[10] = a.a(var2, 123);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = cm.a("achievement_names,11", (byte) 46);
          if (var2 == null) {
            break L15;
          } else {
            md.field_a[11] = a.a(var2, -11);
            break L15;
          }
        }
        L16: {
          var2 = cm.a("achievement_names,12", (byte) 49);
          if (null == var2) {
            break L16;
          } else {
            md.field_a[12] = a.a(var2, 125);
            break L16;
          }
        }
        L17: {
          var2 = cm.a("achievement_names,13", (byte) 70);
          if (null != var2) {
            md.field_a[13] = a.a(var2, 123);
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var2 = cm.a("achievement_names,14", (byte) 72);
          if (null == var2) {
            break L18;
          } else {
            md.field_a[14] = a.a(var2, 124);
            break L18;
          }
        }
        L19: {
          var2 = cm.a("achievement_names,15", (byte) 73);
          if (var2 != null) {
            md.field_a[15] = a.a(var2, -45);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = cm.a("achievement_names,16", (byte) 18);
          if (null != var2) {
            md.field_a[16] = a.a(var2, -26);
            break L20;
          } else {
            break L20;
          }
        }
        L21: {
          var2 = cm.a("achievement_names,17", (byte) 39);
          if (null != var2) {
            md.field_a[17] = a.a(var2, 126);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = cm.a("achievement_names,18", (byte) 22);
          if (var2 != null) {
            md.field_a[18] = a.a(var2, 124);
            break L22;
          } else {
            break L22;
          }
        }
        L23: {
          var2 = cm.a("achievement_names,19", (byte) 78);
          if (null != var2) {
            md.field_a[19] = a.a(var2, -87);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = cm.a("achievement_names,20", (byte) 57);
          if (var2 == null) {
            break L24;
          } else {
            md.field_a[20] = a.a(var2, 124);
            break L24;
          }
        }
        L25: {
          var2 = cm.a("achievement_names,21", (byte) 36);
          if (null != var2) {
            md.field_a[21] = a.a(var2, 8);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = cm.a("achievement_names,22", (byte) 116);
          if (var2 == null) {
            break L26;
          } else {
            md.field_a[22] = a.a(var2, 127);
            break L26;
          }
        }
        L27: {
          var2 = cm.a("achievement_names,23", (byte) 32);
          if (null == var2) {
            break L27;
          } else {
            md.field_a[23] = a.a(var2, 126);
            break L27;
          }
        }
        L28: {
          var2 = cm.a("achievement_names,24", (byte) 97);
          if (null != var2) {
            md.field_a[24] = a.a(var2, -55);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = cm.a("achievement_names,25", (byte) 77);
          if (null != var2) {
            md.field_a[25] = a.a(var2, -91);
            break L29;
          } else {
            break L29;
          }
        }
        L30: {
          var2 = cm.a("achievement_names,26", (byte) 117);
          if (var2 != null) {
            md.field_a[26] = a.a(var2, 124);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = cm.a("achievement_criteria,0", (byte) 47);
          if (var2 != null) {
            kc.field_d[0] = a.a(var2, -81);
            break L31;
          } else {
            break L31;
          }
        }
        L32: {
          var2 = cm.a("achievement_criteria,1", (byte) 111);
          if (var2 == null) {
            break L32;
          } else {
            kc.field_d[1] = a.a(var2, 127);
            break L32;
          }
        }
        L33: {
          var2 = cm.a("achievement_criteria,2", (byte) 82);
          if (var2 == null) {
            break L33;
          } else {
            kc.field_d[2] = a.a(var2, 5);
            break L33;
          }
        }
        L34: {
          var2 = cm.a("achievement_criteria,3", (byte) 127);
          if (var2 != null) {
            kc.field_d[3] = a.a(var2, -42);
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          var2 = cm.a("achievement_criteria,4", (byte) 63);
          if (var2 != null) {
            kc.field_d[4] = a.a(var2, 127);
            break L35;
          } else {
            break L35;
          }
        }
        L36: {
          var2 = cm.a("achievement_criteria,5", (byte) 18);
          if (var2 != null) {
            kc.field_d[5] = a.a(var2, 123);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = cm.a("achievement_criteria,6", (byte) 112);
          if (var2 != null) {
            kc.field_d[6] = a.a(var2, -71);
            break L37;
          } else {
            break L37;
          }
        }
        L38: {
          var2 = cm.a("achievement_criteria,7", (byte) 69);
          if (null != var2) {
            kc.field_d[7] = a.a(var2, 124);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = cm.a("achievement_criteria,8", (byte) 34);
          if (var2 == null) {
            break L39;
          } else {
            kc.field_d[8] = a.a(var2, -67);
            break L39;
          }
        }
        L40: {
          var2 = cm.a("achievement_criteria,9", (byte) 35);
          if (var2 != null) {
            kc.field_d[9] = a.a(var2, 123);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = cm.a("achievement_criteria,10", (byte) 49);
          if (var2 == null) {
            break L41;
          } else {
            kc.field_d[10] = a.a(var2, 126);
            break L41;
          }
        }
        L42: {
          var2 = cm.a("achievement_criteria,11", (byte) 53);
          if (var2 == null) {
            break L42;
          } else {
            kc.field_d[11] = a.a(var2, 127);
            break L42;
          }
        }
        L43: {
          var2 = cm.a("achievement_criteria,12", (byte) 51);
          if (null == var2) {
            break L43;
          } else {
            kc.field_d[12] = a.a(var2, 126);
            break L43;
          }
        }
        L44: {
          var2 = cm.a("achievement_criteria,13", (byte) 90);
          if (null != var2) {
            kc.field_d[13] = a.a(var2, 124);
            break L44;
          } else {
            break L44;
          }
        }
        L45: {
          var2 = cm.a("achievement_criteria,14", (byte) 43);
          if (var2 == null) {
            break L45;
          } else {
            kc.field_d[14] = a.a(var2, -119);
            break L45;
          }
        }
        L46: {
          var2 = cm.a("achievement_criteria,15", (byte) 89);
          if (null != var2) {
            kc.field_d[15] = a.a(var2, 126);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = cm.a("achievement_criteria,16", (byte) 45);
          if (var2 != null) {
            kc.field_d[16] = a.a(var2, -9);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = cm.a("achievement_criteria,17", (byte) 29);
          if (null == var2) {
            break L48;
          } else {
            kc.field_d[17] = a.a(var2, 127);
            break L48;
          }
        }
        L49: {
          var2 = cm.a("achievement_criteria,18", (byte) 61);
          if (null != var2) {
            kc.field_d[18] = a.a(var2, -73);
            break L49;
          } else {
            break L49;
          }
        }
        L50: {
          var2 = cm.a("achievement_criteria,19", (byte) 76);
          if (null == var2) {
            break L50;
          } else {
            kc.field_d[19] = a.a(var2, 123);
            break L50;
          }
        }
        L51: {
          var2 = cm.a("achievement_criteria,20", (byte) 125);
          if (var2 == null) {
            break L51;
          } else {
            kc.field_d[20] = a.a(var2, -40);
            break L51;
          }
        }
        L52: {
          var2 = cm.a("achievement_criteria,21", (byte) 103);
          if (null == var2) {
            break L52;
          } else {
            kc.field_d[21] = a.a(var2, 126);
            break L52;
          }
        }
        L53: {
          var2 = cm.a("achievement_criteria,22", (byte) 66);
          if (var2 == null) {
            break L53;
          } else {
            kc.field_d[22] = a.a(var2, 7);
            break L53;
          }
        }
        L54: {
          var2 = cm.a("achievement_criteria,23", (byte) 31);
          if (var2 != null) {
            kc.field_d[23] = a.a(var2, -71);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = cm.a("achievement_criteria,24", (byte) 108);
          if (null == var2) {
            break L55;
          } else {
            kc.field_d[24] = a.a(var2, 124);
            break L55;
          }
        }
        L56: {
          var2 = cm.a("achievement_criteria,25", (byte) 19);
          if (null == var2) {
            break L56;
          } else {
            kc.field_d[25] = a.a(var2, 125);
            break L56;
          }
        }
        L57: {
          var2 = cm.a("achievement_criteria,26", (byte) 97);
          if (var2 != null) {
            kc.field_d[26] = a.a(var2, -76);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = cm.a("gameoptlabels,0", (byte) 63);
          if (var2 != null) {
            s.field_d[0] = a.a(var2, -54);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = cm.a("gameoptlabels,1", (byte) 33);
          if (null == var2) {
            break L59;
          } else {
            s.field_d[1] = a.a(var2, -96);
            break L59;
          }
        }
        L60: {
          var2 = cm.a("gameoptlabels,2", (byte) 49);
          if (var2 != null) {
            s.field_d[2] = a.a(var2, -47);
            break L60;
          } else {
            break L60;
          }
        }
        L61: {
          var2 = cm.a("gameoptlabels,3", (byte) 105);
          if (null != var2) {
            s.field_d[3] = a.a(var2, -122);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = cm.a("gameopt_buttonnames,0,0", (byte) 95);
          if (var2 != null) {
            ve.field_q[0][0] = a.a(var2, -30);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = cm.a("gameopt_buttonnames,0,1", (byte) 112);
          if (var2 != null) {
            ve.field_q[0][1] = a.a(var2, 127);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var2 = cm.a("gameopt_buttonnames,0,2", (byte) 50);
          if (null == var2) {
            break L64;
          } else {
            ve.field_q[0][2] = a.a(var2, 124);
            break L64;
          }
        }
        L65: {
          var2 = cm.a("gameopt_buttonnames,0,3", (byte) 38);
          if (var2 == null) {
            break L65;
          } else {
            ve.field_q[0][3] = a.a(var2, 123);
            break L65;
          }
        }
        L66: {
          var2 = cm.a("gameopt_buttonnames,0,4", (byte) 36);
          if (null != var2) {
            ve.field_q[0][4] = a.a(var2, 123);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = cm.a("gameopt_buttonnames,0,5", (byte) 77);
          if (null == var2) {
            break L67;
          } else {
            ve.field_q[0][5] = a.a(var2, -4);
            break L67;
          }
        }
        L68: {
          var2 = cm.a("ruleset_names,0", (byte) 78);
          if (var2 != null) {
            im.field_ic[0] = a.a(var2, 126);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = cm.a("ruleset_names,1", (byte) 92);
          if (null != var2) {
            im.field_ic[1] = a.a(var2, 124);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = cm.a("ruleset_names,2", (byte) 62);
          if (var2 == null) {
            break L70;
          } else {
            im.field_ic[2] = a.a(var2, -66);
            break L70;
          }
        }
        L71: {
          var2 = cm.a("ruleset_names,3", (byte) 90);
          if (var2 != null) {
            im.field_ic[3] = a.a(var2, 123);
            break L71;
          } else {
            break L71;
          }
        }
        L72: {
          var2 = cm.a("theme_names,0", (byte) 41);
          if (null == var2) {
            break L72;
          } else {
            cb.field_b[0] = a.a(var2, 14);
            break L72;
          }
        }
        L73: {
          var2 = cm.a("theme_names,1", (byte) 52);
          if (var2 != null) {
            cb.field_b[1] = a.a(var2, 127);
            break L73;
          } else {
            break L73;
          }
        }
        L74: {
          var2 = cm.a("theme_names,2", (byte) 36);
          if (var2 == null) {
            break L74;
          } else {
            cb.field_b[2] = a.a(var2, -24);
            break L74;
          }
        }
        L75: {
          var2 = cm.a("theme_names,3", (byte) 114);
          if (null == var2) {
            break L75;
          } else {
            cb.field_b[3] = a.a(var2, 125);
            break L75;
          }
        }
        L76: {
          var2 = cm.a("theme_names,4", (byte) 122);
          if (null != var2) {
            cb.field_b[4] = a.a(var2, 127);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = cm.a("theme_random", (byte) 121);
          if (null == var2) {
            break L77;
          } else {
            sn.field_k = a.a(var2, 123);
            break L77;
          }
        }
        L78: {
          var2 = cm.a("guide_names,0", (byte) 83);
          if (var2 != null) {
            ke.field_c[0] = a.a(var2, -120);
            break L78;
          } else {
            break L78;
          }
        }
        L79: {
          var2 = cm.a("guide_names,1", (byte) 39);
          if (null == var2) {
            break L79;
          } else {
            ke.field_c[1] = a.a(var2, 126);
            break L79;
          }
        }
        L80: {
          var2 = cm.a("timer_secs", (byte) 107);
          if (null != var2) {
            vm.field_b = a.a(var2, 124);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = cm.a("gameopt_tooltipnames,0,0", (byte) 112);
          if (null != var2) {
            field_c[0][0] = a.a(var2, -91);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = cm.a("gameopt_tooltipnames,0,1", (byte) 74);
          if (var2 != null) {
            field_c[0][1] = a.a(var2, -40);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = cm.a("gameopt_tooltipnames,0,2", (byte) 83);
          if (var2 == null) {
            break L83;
          } else {
            field_c[0][2] = a.a(var2, 2);
            break L83;
          }
        }
        L84: {
          var2 = cm.a("gameopt_tooltipnames,0,3", (byte) 96);
          if (null != var2) {
            field_c[0][3] = a.a(var2, 123);
            break L84;
          } else {
            break L84;
          }
        }
        L85: {
          var2 = cm.a("gameopt_tooltipnames,0,4", (byte) 103);
          if (var2 == null) {
            break L85;
          } else {
            field_c[0][4] = a.a(var2, 127);
            break L85;
          }
        }
        L86: {
          var2 = cm.a("gameopt_tooltipnames,0,5", (byte) 76);
          if (null == var2) {
            break L86;
          } else {
            field_c[0][5] = a.a(var2, -29);
            break L86;
          }
        }
        L87: {
          var2 = cm.a("gameopt_tooltipnames,1,0", (byte) 80);
          if (null == var2) {
            break L87;
          } else {
            field_c[1][0] = a.a(var2, -69);
            break L87;
          }
        }
        L88: {
          var2 = cm.a("gameopt_tooltipnames,1,1", (byte) 45);
          if (var2 == null) {
            break L88;
          } else {
            field_c[1][1] = a.a(var2, 127);
            break L88;
          }
        }
        L89: {
          var2 = cm.a("gameopt_tooltipnames,1,2", (byte) 59);
          if (null != var2) {
            field_c[1][2] = a.a(var2, -98);
            break L89;
          } else {
            break L89;
          }
        }
        L90: {
          var2 = cm.a("gameopt_tooltipnames,2,0", (byte) 30);
          if (var2 != null) {
            field_c[2][0] = a.a(var2, -71);
            break L90;
          } else {
            break L90;
          }
        }
        L91: {
          var2 = cm.a("gameopt_tooltipnames,2,1", (byte) 104);
          if (var2 == null) {
            break L91;
          } else {
            field_c[2][1] = a.a(var2, 127);
            break L91;
          }
        }
        L92: {
          var2 = cm.a("gameopt_tooltipnames,2,2", (byte) 61);
          if (null != var2) {
            field_c[2][2] = a.a(var2, -50);
            break L92;
          } else {
            break L92;
          }
        }
        L93: {
          var2 = cm.a("gameopt_tooltipnames,2,3", (byte) 17);
          if (var2 == null) {
            break L93;
          } else {
            field_c[2][3] = a.a(var2, 126);
            break L93;
          }
        }
        L94: {
          var2 = cm.a("gameopt_tooltipnames,2,4", (byte) 71);
          if (var2 == null) {
            break L94;
          } else {
            field_c[2][4] = a.a(var2, -14);
            break L94;
          }
        }
        L95: {
          var2 = cm.a("gameopt_tooltipnames,2,5", (byte) 87);
          if (null != var2) {
            field_c[2][5] = a.a(var2, -69);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = cm.a("gameopt_tooltipnames,3,0", (byte) 98);
          if (var2 != null) {
            field_c[3][0] = a.a(var2, 127);
            break L96;
          } else {
            break L96;
          }
        }
        L97: {
          var2 = cm.a("gameopt_tooltipnames,3,1", (byte) 74);
          if (var2 == null) {
            break L97;
          } else {
            field_c[3][1] = a.a(var2, 13);
            break L97;
          }
        }
        L98: {
          var2 = cm.a("shot_messages,0", (byte) 121);
          if (null == var2) {
            break L98;
          } else {
            e.field_h[0] = a.a(var2, 124);
            break L98;
          }
        }
        L99: {
          var2 = cm.a("shot_messages,1", (byte) 47);
          if (null != var2) {
            e.field_h[1] = a.a(var2, 126);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          var2 = cm.a("shot_messages,2", (byte) 84);
          if (var2 != null) {
            e.field_h[2] = a.a(var2, -86);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          var2 = cm.a("shot_messages,3", (byte) 62);
          if (var2 != null) {
            e.field_h[3] = a.a(var2, 127);
            break L101;
          } else {
            break L101;
          }
        }
        L102: {
          var2 = cm.a("shot_messages,4", (byte) 22);
          if (var2 == null) {
            break L102;
          } else {
            e.field_h[4] = a.a(var2, -15);
            break L102;
          }
        }
        L103: {
          var2 = cm.a("shot_messages,5", (byte) 108);
          if (null != var2) {
            e.field_h[5] = a.a(var2, -14);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = cm.a("shot_messages,6", (byte) 90);
          if (null != var2) {
            e.field_h[6] = a.a(var2, -78);
            break L104;
          } else {
            break L104;
          }
        }
        L105: {
          var2 = cm.a("shot_messages,7", (byte) 28);
          if (var2 == null) {
            break L105;
          } else {
            e.field_h[7] = a.a(var2, -21);
            break L105;
          }
        }
        L106: {
          var2 = cm.a("shot_messages,8", (byte) 97);
          if (var2 != null) {
            e.field_h[8] = a.a(var2, -25);
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          var2 = cm.a("shot_messages,9", (byte) 115);
          if (null == var2) {
            break L107;
          } else {
            e.field_h[9] = a.a(var2, 127);
            break L107;
          }
        }
        L108: {
          var2 = cm.a("shot_messages,10", (byte) 57);
          if (var2 != null) {
            e.field_h[10] = a.a(var2, -81);
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = cm.a("shot_messages,11", (byte) 28);
          if (var2 != null) {
            e.field_h[11] = a.a(var2, -22);
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          var2 = cm.a("shot_messages,12", (byte) 53);
          if (null == var2) {
            break L110;
          } else {
            e.field_h[12] = a.a(var2, 124);
            break L110;
          }
        }
        L111: {
          var2 = cm.a("shot_messages,13", (byte) 83);
          if (var2 != null) {
            e.field_h[13] = a.a(var2, 124);
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = cm.a("shot_messages,14", (byte) 61);
          if (null != var2) {
            e.field_h[14] = a.a(var2, -86);
            break L112;
          } else {
            break L112;
          }
        }
        L113: {
          var2 = cm.a("shot_messages,15", (byte) 23);
          if (null != var2) {
            e.field_h[15] = a.a(var2, 126);
            break L113;
          } else {
            break L113;
          }
        }
        L114: {
          var2 = cm.a("shot_messages,16", (byte) 30);
          if (null != var2) {
            e.field_h[16] = a.a(var2, -122);
            break L114;
          } else {
            break L114;
          }
        }
        L115: {
          var2 = cm.a("shot_messages,17", (byte) 29);
          if (var2 == null) {
            break L115;
          } else {
            e.field_h[17] = a.a(var2, 126);
            break L115;
          }
        }
        L116: {
          var2 = cm.a("shot_messages,18", (byte) 58);
          if (var2 == null) {
            break L116;
          } else {
            e.field_h[18] = a.a(var2, 126);
            break L116;
          }
        }
        L117: {
          var2 = cm.a("shot_messages,19", (byte) 50);
          if (null != var2) {
            e.field_h[19] = a.a(var2, 125);
            break L117;
          } else {
            break L117;
          }
        }
        L118: {
          var2 = cm.a("shot_messages,20", (byte) 123);
          if (var2 == null) {
            break L118;
          } else {
            e.field_h[20] = a.a(var2, -112);
            break L118;
          }
        }
        L119: {
          var2 = cm.a("shot_messages,21", (byte) 89);
          if (var2 != null) {
            e.field_h[21] = a.a(var2, -118);
            break L119;
          } else {
            break L119;
          }
        }
        L120: {
          var2 = cm.a("shot_messages,22", (byte) 116);
          if (var2 == null) {
            break L120;
          } else {
            e.field_h[22] = a.a(var2, 123);
            break L120;
          }
        }
        L121: {
          var2 = cm.a("n_second_time_penalty", (byte) 92);
          if (var2 == null) {
            break L121;
          } else {
            iq.field_b = a.a(var2, -18);
            break L121;
          }
        }
        L122: {
          var2 = cm.a("nine_ball_numbers,0", (byte) 75);
          if (null == var2) {
            break L122;
          } else {
            or.field_k[0] = a.a(var2, 124);
            break L122;
          }
        }
        L123: {
          var2 = cm.a("nine_ball_numbers,1", (byte) 100);
          if (var2 == null) {
            break L123;
          } else {
            or.field_k[1] = a.a(var2, 125);
            break L123;
          }
        }
        L124: {
          var2 = cm.a("nine_ball_numbers,2", (byte) 118);
          if (null != var2) {
            or.field_k[2] = a.a(var2, 127);
            break L124;
          } else {
            break L124;
          }
        }
        L125: {
          var2 = cm.a("nine_ball_numbers,3", (byte) 63);
          if (var2 != null) {
            or.field_k[3] = a.a(var2, 126);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = cm.a("nine_ball_numbers,4", (byte) 118);
          if (var2 != null) {
            or.field_k[4] = a.a(var2, 123);
            break L126;
          } else {
            break L126;
          }
        }
        L127: {
          var2 = cm.a("nine_ball_numbers,5", (byte) 26);
          if (null != var2) {
            or.field_k[5] = a.a(var2, 127);
            break L127;
          } else {
            break L127;
          }
        }
        L128: {
          var2 = cm.a("nine_ball_numbers,6", (byte) 67);
          if (null != var2) {
            or.field_k[6] = a.a(var2, -37);
            break L128;
          } else {
            break L128;
          }
        }
        L129: {
          var2 = cm.a("nine_ball_numbers,7", (byte) 50);
          if (var2 == null) {
            break L129;
          } else {
            or.field_k[7] = a.a(var2, 123);
            break L129;
          }
        }
        L130: {
          var2 = cm.a("nine_ball_numbers,8", (byte) 118);
          if (var2 == null) {
            break L130;
          } else {
            or.field_k[8] = a.a(var2, 127);
            break L130;
          }
        }
        L131: {
          var2 = cm.a("nine_ball_numbers,9", (byte) 55);
          if (null != var2) {
            or.field_k[9] = a.a(var2, 127);
            break L131;
          } else {
            break L131;
          }
        }
        L132: {
          var2 = cm.a("eight_ball_numbers,0", (byte) 68);
          if (null == var2) {
            break L132;
          } else {
            ho.field_u[0] = a.a(var2, 127);
            break L132;
          }
        }
        L133: {
          var2 = cm.a("eight_ball_numbers,1", (byte) 67);
          if (null != var2) {
            ho.field_u[1] = a.a(var2, 125);
            break L133;
          } else {
            break L133;
          }
        }
        L134: {
          var2 = cm.a("eight_ball_numbers,2", (byte) 110);
          if (null != var2) {
            ho.field_u[2] = a.a(var2, 125);
            break L134;
          } else {
            break L134;
          }
        }
        L135: {
          var2 = cm.a("eight_ball_numbers,3", (byte) 20);
          if (var2 != null) {
            ho.field_u[3] = a.a(var2, 126);
            break L135;
          } else {
            break L135;
          }
        }
        L136: {
          var2 = cm.a("eight_ball_numbers,4", (byte) 101);
          if (null != var2) {
            ho.field_u[4] = a.a(var2, 127);
            break L136;
          } else {
            break L136;
          }
        }
        L137: {
          var2 = cm.a("eight_ball_numbers,5", (byte) 42);
          if (var2 == null) {
            break L137;
          } else {
            ho.field_u[5] = a.a(var2, 126);
            break L137;
          }
        }
        L138: {
          var2 = cm.a("eight_ball_numbers,6", (byte) 92);
          if (var2 != null) {
            ho.field_u[6] = a.a(var2, -83);
            break L138;
          } else {
            break L138;
          }
        }
        L139: {
          var2 = cm.a("eight_ball_numbers,7", (byte) 85);
          if (var2 == null) {
            break L139;
          } else {
            ho.field_u[7] = a.a(var2, 15);
            break L139;
          }
        }
        L140: {
          var2 = cm.a("eight_ball_numbers,8", (byte) 37);
          if (var2 == null) {
            break L140;
          } else {
            ho.field_u[8] = a.a(var2, 125);
            break L140;
          }
        }
        L141: {
          var2 = cm.a("eight_ball_numbers,9", (byte) 91);
          if (null != var2) {
            ho.field_u[9] = a.a(var2, -103);
            break L141;
          } else {
            break L141;
          }
        }
        L142: {
          var2 = cm.a("eight_ball_numbers,10", (byte) 70);
          if (null == var2) {
            break L142;
          } else {
            ho.field_u[10] = a.a(var2, 123);
            break L142;
          }
        }
        L143: {
          var2 = cm.a("eight_ball_numbers,11", (byte) 116);
          if (null != var2) {
            ho.field_u[11] = a.a(var2, -70);
            break L143;
          } else {
            break L143;
          }
        }
        L144: {
          var2 = cm.a("eight_ball_numbers,12", (byte) 79);
          if (var2 != null) {
            ho.field_u[12] = a.a(var2, 126);
            break L144;
          } else {
            break L144;
          }
        }
        L145: {
          var2 = cm.a("eight_ball_numbers,13", (byte) 104);
          if (var2 == null) {
            break L145;
          } else {
            ho.field_u[13] = a.a(var2, -33);
            break L145;
          }
        }
        L146: {
          var2 = cm.a("eight_ball_numbers,14", (byte) 82);
          if (var2 != null) {
            ho.field_u[14] = a.a(var2, 13);
            break L146;
          } else {
            break L146;
          }
        }
        L147: {
          var2 = cm.a("eight_ball_numbers,15", (byte) 80);
          if (null != var2) {
            ho.field_u[15] = a.a(var2, -45);
            break L147;
          } else {
            break L147;
          }
        }
        L148: {
          var2 = cm.a("ballset_planets_group_0", (byte) 97);
          if (null != var2) {
            String discarded$17 = a.a(var2, -103);
            break L148;
          } else {
            break L148;
          }
        }
        L149: {
          var2 = cm.a("ballset_planets_group_1", (byte) 118);
          if (var2 == null) {
            break L149;
          } else {
            String discarded$18 = a.a(var2, 127);
            break L149;
          }
        }
        L150: {
          var2 = cm.a("ballset_sports_group_0", (byte) 56);
          if (null == var2) {
            break L150;
          } else {
            String discarded$19 = a.a(var2, 127);
            break L150;
          }
        }
        L151: {
          var2 = cm.a("ballset_sports_group_1", (byte) 83);
          if (null == var2) {
            break L151;
          } else {
            String discarded$20 = a.a(var2, -110);
            break L151;
          }
        }
        L152: {
          var2 = cm.a("ballset_english_group_0", (byte) 40);
          if (var2 == null) {
            break L152;
          } else {
            ae.field_b = a.a(var2, -15);
            break L152;
          }
        }
        L153: {
          var2 = cm.a("ballset_english_group_1", (byte) 69);
          if (null != var2) {
            String discarded$21 = a.a(var2, -84);
            break L153;
          } else {
            break L153;
          }
        }
        L154: {
          var2 = cm.a("ballset_plasma_group_0_nocolour", (byte) 123);
          if (null != var2) {
            pn.field_t = a.a(var2, -73);
            break L154;
          } else {
            break L154;
          }
        }
        L155: {
          var2 = cm.a("ballset_plasma_group_1_nocolour", (byte) 113);
          if (var2 == null) {
            break L155;
          } else {
            oe.field_S = a.a(var2, -67);
            break L155;
          }
        }
        L156: {
          var2 = cm.a("ballset_plasma_group_0", (byte) 90);
          if (var2 != null) {
            kk.field_G = a.a(var2, 126);
            break L156;
          } else {
            break L156;
          }
        }
        L157: {
          var2 = cm.a("ballset_plasma_group_1", (byte) 98);
          if (null == var2) {
            break L157;
          } else {
            hi.field_j = a.a(var2, -71);
            break L157;
          }
        }
        L158: {
          var2 = cm.a("ballset_usa8_group_0", (byte) 113);
          if (null != var2) {
            me.field_w = a.a(var2, 123);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = cm.a("ballset_usa8_group_1", (byte) 49);
          if (var2 == null) {
            break L159;
          } else {
            vf.field_Q = a.a(var2, 6);
            break L159;
          }
        }
        L160: {
          var2 = cm.a("ballset_torquing_group_0", (byte) 22);
          if (null == var2) {
            break L160;
          } else {
            String discarded$22 = a.a(var2, 125);
            break L160;
          }
        }
        L161: {
          var2 = cm.a("ballset_torquing_group_1", (byte) 52);
          if (null != var2) {
            String discarded$23 = a.a(var2, -124);
            break L161;
          } else {
            break L161;
          }
        }
        L162: {
          var2 = cm.a("ballset_space_group_0", (byte) 65);
          if (var2 != null) {
            sn.field_j = a.a(var2, 123);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          var2 = cm.a("ballset_space_group_1", (byte) 77);
          var3 = 50 % ((param1 - 58) / 42);
          if (var2 == null) {
            break L163;
          } else {
            dq.field_g = a.a(var2, 123);
            break L163;
          }
        }
        L164: {
          var2 = cm.a("ballset_jungle_group_0", (byte) 36);
          if (null == var2) {
            break L164;
          } else {
            String discarded$24 = a.a(var2, 126);
            break L164;
          }
        }
        L165: {
          var2 = cm.a("ballset_jungle_group_1", (byte) 27);
          if (var2 != null) {
            String discarded$25 = a.a(var2, 124);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          var2 = cm.a("ballset_polar_group_0", (byte) 119);
          if (null != var2) {
            ij.field_t = a.a(var2, -81);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = cm.a("ballset_polar_group_1", (byte) 64);
          if (null != var2) {
            ld.field_h = a.a(var2, 125);
            break L167;
          } else {
            break L167;
          }
        }
        L168: {
          var2 = cm.a("target_open_table", (byte) 40);
          if (null == var2) {
            break L168;
          } else {
            rg.field_t = a.a(var2, -4);
            break L168;
          }
        }
        L169: {
          var2 = cm.a("target_black_ball", (byte) 97);
          if (var2 != null) {
            oq.field_C = a.a(var2, -127);
            break L169;
          } else {
            break L169;
          }
        }
        L170: {
          var2 = cm.a("you_player", (byte) 108);
          if (var2 != null) {
            vq.field_Zb = a.a(var2, -31);
            break L170;
          } else {
            break L170;
          }
        }
        L171: {
          var2 = cm.a("computer_player", (byte) 82);
          if (null == var2) {
            break L171;
          } else {
            String discarded$26 = a.a(var2, 126);
            break L171;
          }
        }
        L172: {
          var2 = cm.a("player_ns,0", (byte) 126);
          if (var2 == null) {
            break L172;
          } else {
            jo.field_I[0] = a.a(var2, 123);
            break L172;
          }
        }
        L173: {
          var2 = cm.a("player_ns,1", (byte) 45);
          if (var2 != null) {
            jo.field_I[1] = a.a(var2, 6);
            break L173;
          } else {
            break L173;
          }
        }
        L174: {
          var2 = cm.a("player_ns,2", (byte) 69);
          if (var2 == null) {
            break L174;
          } else {
            jo.field_I[2] = a.a(var2, -6);
            break L174;
          }
        }
        L175: {
          var2 = cm.a("player_ns,3", (byte) 21);
          if (null == var2) {
            break L175;
          } else {
            jo.field_I[3] = a.a(var2, 125);
            break L175;
          }
        }
        L176: {
          var2 = cm.a("player_ns,4", (byte) 104);
          if (null == var2) {
            break L176;
          } else {
            jo.field_I[4] = a.a(var2, -36);
            break L176;
          }
        }
        L177: {
          var2 = cm.a("player_ns,5", (byte) 104);
          if (var2 != null) {
            jo.field_I[5] = a.a(var2, -103);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          var2 = cm.a("player_ns,6", (byte) 40);
          if (null == var2) {
            break L178;
          } else {
            jo.field_I[6] = a.a(var2, -60);
            break L178;
          }
        }
        L179: {
          var2 = cm.a("player_ns,7", (byte) 57);
          if (var2 != null) {
            jo.field_I[7] = a.a(var2, 127);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          var2 = cm.a("instructions_titles,0", (byte) 65);
          if (var2 == null) {
            break L180;
          } else {
            rn.field_a[0] = a.a(var2, 127);
            break L180;
          }
        }
        L181: {
          var2 = cm.a("instructions_titles,1", (byte) 21);
          if (null != var2) {
            rn.field_a[1] = a.a(var2, 127);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          var2 = cm.a("instructions_titles,2", (byte) 50);
          if (null != var2) {
            rn.field_a[2] = a.a(var2, 123);
            break L182;
          } else {
            break L182;
          }
        }
        L183: {
          var2 = cm.a("instructions_titles,3", (byte) 79);
          if (null != var2) {
            rn.field_a[3] = a.a(var2, -20);
            break L183;
          } else {
            break L183;
          }
        }
        L184: {
          var2 = cm.a("instructions_titles,4", (byte) 79);
          if (var2 != null) {
            rn.field_a[4] = a.a(var2, -112);
            break L184;
          } else {
            break L184;
          }
        }
        L185: {
          var2 = cm.a("instructions_titles,5", (byte) 97);
          if (var2 == null) {
            break L185;
          } else {
            rn.field_a[5] = a.a(var2, -112);
            break L185;
          }
        }
        L186: {
          var2 = cm.a("instructions_titles,6", (byte) 60);
          if (var2 == null) {
            break L186;
          } else {
            rn.field_a[6] = a.a(var2, 123);
            break L186;
          }
        }
        L187: {
          var2 = cm.a("instructions_titles,7", (byte) 127);
          if (null == var2) {
            break L187;
          } else {
            rn.field_a[7] = a.a(var2, 127);
            break L187;
          }
        }
        L188: {
          var2 = cm.a("instructions_titles,8", (byte) 124);
          if (var2 == null) {
            break L188;
          } else {
            rn.field_a[8] = a.a(var2, 125);
            break L188;
          }
        }
        L189: {
          var2 = cm.a("instructions_titles,9", (byte) 64);
          if (var2 != null) {
            rn.field_a[9] = a.a(var2, -90);
            break L189;
          } else {
            break L189;
          }
        }
        L190: {
          var2 = cm.a("instructions_pages,0", (byte) 63);
          if (null == var2) {
            break L190;
          } else {
            rb.field_n[0] = a.a(var2, -119);
            break L190;
          }
        }
        L191: {
          var2 = cm.a("instructions_pages,1", (byte) 73);
          if (null == var2) {
            break L191;
          } else {
            rb.field_n[1] = a.a(var2, 125);
            break L191;
          }
        }
        L192: {
          var2 = cm.a("instructions_pages,2", (byte) 120);
          if (null == var2) {
            break L192;
          } else {
            rb.field_n[2] = a.a(var2, 126);
            break L192;
          }
        }
        L193: {
          var2 = cm.a("instructions_pages,3", (byte) 56);
          if (null != var2) {
            rb.field_n[3] = a.a(var2, 125);
            break L193;
          } else {
            break L193;
          }
        }
        L194: {
          var2 = cm.a("instructions_pages,4", (byte) 69);
          if (null != var2) {
            rb.field_n[4] = a.a(var2, 123);
            break L194;
          } else {
            break L194;
          }
        }
        L195: {
          var2 = cm.a("instructions_pages,5", (byte) 121);
          if (var2 != null) {
            rb.field_n[5] = a.a(var2, -70);
            break L195;
          } else {
            break L195;
          }
        }
        L196: {
          var2 = cm.a("instructions_pages,6", (byte) 64);
          if (var2 == null) {
            break L196;
          } else {
            rb.field_n[6] = a.a(var2, -63);
            break L196;
          }
        }
        L197: {
          var2 = cm.a("instructions_pages,7", (byte) 30);
          if (null != var2) {
            rb.field_n[7] = a.a(var2, 126);
            break L197;
          } else {
            break L197;
          }
        }
        L198: {
          var2 = cm.a("instructions_pages,8", (byte) 102);
          if (var2 != null) {
            rb.field_n[8] = a.a(var2, 125);
            break L198;
          } else {
            break L198;
          }
        }
        L199: {
          var2 = cm.a("instructions_pages,9", (byte) 42);
          if (null == var2) {
            break L199;
          } else {
            rb.field_n[9] = a.a(var2, -18);
            break L199;
          }
        }
        L200: {
          var2 = cm.a("definition_terms_conjugations,0,0", (byte) 77);
          if (null == var2) {
            break L200;
          } else {
            dl.field_e[0][0] = a.a(var2, -16);
            break L200;
          }
        }
        L201: {
          var2 = cm.a("definition_terms_conjugations,1,0", (byte) 100);
          if (null != var2) {
            dl.field_e[1][0] = a.a(var2, 124);
            break L201;
          } else {
            break L201;
          }
        }
        L202: {
          var2 = cm.a("definition_terms_conjugations,2,0", (byte) 43);
          if (null == var2) {
            break L202;
          } else {
            dl.field_e[2][0] = a.a(var2, -51);
            break L202;
          }
        }
        L203: {
          var2 = cm.a("definition_terms_conjugations,2,1", (byte) 76);
          if (var2 == null) {
            break L203;
          } else {
            dl.field_e[2][1] = a.a(var2, -107);
            break L203;
          }
        }
        L204: {
          var2 = cm.a("definition_terms_conjugations,3,0", (byte) 95);
          if (null == var2) {
            break L204;
          } else {
            dl.field_e[3][0] = a.a(var2, -121);
            break L204;
          }
        }
        L205: {
          var2 = cm.a("definition_terms_conjugations,3,1", (byte) 44);
          if (var2 == null) {
            break L205;
          } else {
            dl.field_e[3][1] = a.a(var2, 124);
            break L205;
          }
        }
        L206: {
          var2 = cm.a("definition_terms_conjugations,3,2", (byte) 27);
          if (var2 == null) {
            break L206;
          } else {
            dl.field_e[3][2] = a.a(var2, -86);
            break L206;
          }
        }
        L207: {
          var2 = cm.a("definition_terms_conjugations,4,0", (byte) 84);
          if (null != var2) {
            dl.field_e[4][0] = a.a(var2, 123);
            break L207;
          } else {
            break L207;
          }
        }
        L208: {
          var2 = cm.a("definition_terms_conjugations,4,1", (byte) 73);
          if (var2 == null) {
            break L208;
          } else {
            dl.field_e[4][1] = a.a(var2, -32);
            break L208;
          }
        }
        L209: {
          var2 = cm.a("definition_terms_conjugations,5,0", (byte) 59);
          if (var2 != null) {
            dl.field_e[5][0] = a.a(var2, 123);
            break L209;
          } else {
            break L209;
          }
        }
        L210: {
          var2 = cm.a("definition_terms_conjugations,5,1", (byte) 121);
          if (null != var2) {
            dl.field_e[5][1] = a.a(var2, 127);
            break L210;
          } else {
            break L210;
          }
        }
        L211: {
          var2 = cm.a("definition_terms_conjugations,6,0", (byte) 115);
          if (var2 != null) {
            dl.field_e[6][0] = a.a(var2, 125);
            break L211;
          } else {
            break L211;
          }
        }
        L212: {
          var2 = cm.a("definition_terms_conjugations,6,1", (byte) 112);
          if (null != var2) {
            dl.field_e[6][1] = a.a(var2, 124);
            break L212;
          } else {
            break L212;
          }
        }
        L213: {
          var2 = cm.a("definition_terms_conjugations,6,2", (byte) 123);
          if (null != var2) {
            dl.field_e[6][2] = a.a(var2, 124);
            break L213;
          } else {
            break L213;
          }
        }
        L214: {
          var2 = cm.a("definition_terms_conjugations,7,0", (byte) 74);
          if (var2 == null) {
            break L214;
          } else {
            dl.field_e[7][0] = a.a(var2, 123);
            break L214;
          }
        }
        L215: {
          var2 = cm.a("definition_terms_conjugations,7,1", (byte) 67);
          if (null != var2) {
            dl.field_e[7][1] = a.a(var2, -16);
            break L215;
          } else {
            break L215;
          }
        }
        L216: {
          var2 = cm.a("definition_terms_conjugations,8,0", (byte) 102);
          if (null == var2) {
            break L216;
          } else {
            dl.field_e[8][0] = a.a(var2, -36);
            break L216;
          }
        }
        L217: {
          var2 = cm.a("definition_terms_conjugations,8,1", (byte) 99);
          if (var2 == null) {
            break L217;
          } else {
            dl.field_e[8][1] = a.a(var2, 126);
            break L217;
          }
        }
        L218: {
          var2 = cm.a("definition_terms_conjugations,9,0", (byte) 100);
          if (null == var2) {
            break L218;
          } else {
            dl.field_e[9][0] = a.a(var2, 125);
            break L218;
          }
        }
        L219: {
          var2 = cm.a("definition_terms_conjugations,9,1", (byte) 99);
          if (var2 == null) {
            break L219;
          } else {
            dl.field_e[9][1] = a.a(var2, 8);
            break L219;
          }
        }
        L220: {
          var2 = cm.a("definition_terms_conjugations,10,0", (byte) 18);
          if (var2 == null) {
            break L220;
          } else {
            dl.field_e[10][0] = a.a(var2, -9);
            break L220;
          }
        }
        L221: {
          var2 = cm.a("definition_terms_conjugations,10,1", (byte) 79);
          if (null != var2) {
            dl.field_e[10][1] = a.a(var2, 125);
            break L221;
          } else {
            break L221;
          }
        }
        L222: {
          var2 = cm.a("definition_terms_conjugations,11,0", (byte) 91);
          if (var2 == null) {
            break L222;
          } else {
            dl.field_e[11][0] = a.a(var2, -8);
            break L222;
          }
        }
        L223: {
          var2 = cm.a("definition_terms_conjugations,12,0", (byte) 82);
          if (var2 != null) {
            dl.field_e[12][0] = a.a(var2, -113);
            break L223;
          } else {
            break L223;
          }
        }
        L224: {
          var2 = cm.a("definition_terms_conjugations,12,1", (byte) 119);
          if (null != var2) {
            dl.field_e[12][1] = a.a(var2, 125);
            break L224;
          } else {
            break L224;
          }
        }
        L225: {
          var2 = cm.a("definition_terms_conjugations,13,0", (byte) 50);
          if (null == var2) {
            break L225;
          } else {
            dl.field_e[13][0] = a.a(var2, 127);
            break L225;
          }
        }
        L226: {
          var2 = cm.a("definition_terms_conjugations,13,1", (byte) 34);
          if (var2 == null) {
            break L226;
          } else {
            dl.field_e[13][1] = a.a(var2, 126);
            break L226;
          }
        }
        L227: {
          var2 = cm.a("definition_terms_conjugations,13,2", (byte) 47);
          if (var2 == null) {
            break L227;
          } else {
            dl.field_e[13][2] = a.a(var2, -73);
            break L227;
          }
        }
        L228: {
          var2 = cm.a("definition_terms_conjugations,13,3", (byte) 63);
          if (null == var2) {
            break L228;
          } else {
            dl.field_e[13][3] = a.a(var2, 126);
            break L228;
          }
        }
        L229: {
          var2 = cm.a("definition_terms_conjugations,14,0", (byte) 71);
          if (var2 != null) {
            dl.field_e[14][0] = a.a(var2, 124);
            break L229;
          } else {
            break L229;
          }
        }
        L230: {
          var2 = cm.a("definition_terms_conjugations,14,1", (byte) 91);
          if (var2 == null) {
            break L230;
          } else {
            dl.field_e[14][1] = a.a(var2, 126);
            break L230;
          }
        }
        L231: {
          var2 = cm.a("definition_terms_conjugations,15,0", (byte) 25);
          if (null == var2) {
            break L231;
          } else {
            dl.field_e[15][0] = a.a(var2, 126);
            break L231;
          }
        }
        L232: {
          var2 = cm.a("definition_terms_conjugations,15,1", (byte) 45);
          if (var2 == null) {
            break L232;
          } else {
            dl.field_e[15][1] = a.a(var2, 127);
            break L232;
          }
        }
        L233: {
          var2 = cm.a("definition_terms_conjugations,16,0", (byte) 91);
          if (null != var2) {
            dl.field_e[16][0] = a.a(var2, 126);
            break L233;
          } else {
            break L233;
          }
        }
        L234: {
          var2 = cm.a("definition_terms_conjugations,16,1", (byte) 106);
          if (null != var2) {
            dl.field_e[16][1] = a.a(var2, -57);
            break L234;
          } else {
            break L234;
          }
        }
        L235: {
          var2 = cm.a("definition_definitions,0", (byte) 61);
          if (null == var2) {
            break L235;
          } else {
            hj.field_e[0] = a.a(var2, -72);
            break L235;
          }
        }
        L236: {
          var2 = cm.a("definition_definitions,1", (byte) 58);
          if (null == var2) {
            break L236;
          } else {
            hj.field_e[1] = a.a(var2, 123);
            break L236;
          }
        }
        L237: {
          var2 = cm.a("definition_definitions,2", (byte) 119);
          if (var2 != null) {
            hj.field_e[2] = a.a(var2, 125);
            break L237;
          } else {
            break L237;
          }
        }
        L238: {
          var2 = cm.a("definition_definitions,3", (byte) 41);
          if (var2 != null) {
            hj.field_e[3] = a.a(var2, 127);
            break L238;
          } else {
            break L238;
          }
        }
        L239: {
          var2 = cm.a("definition_definitions,4", (byte) 93);
          if (var2 == null) {
            break L239;
          } else {
            hj.field_e[4] = a.a(var2, -113);
            break L239;
          }
        }
        L240: {
          var2 = cm.a("definition_definitions,5", (byte) 43);
          if (null != var2) {
            hj.field_e[5] = a.a(var2, 123);
            break L240;
          } else {
            break L240;
          }
        }
        L241: {
          var2 = cm.a("definition_definitions,6", (byte) 116);
          if (null != var2) {
            hj.field_e[6] = a.a(var2, 125);
            break L241;
          } else {
            break L241;
          }
        }
        L242: {
          var2 = cm.a("definition_definitions,7", (byte) 38);
          if (var2 == null) {
            break L242;
          } else {
            hj.field_e[7] = a.a(var2, 127);
            break L242;
          }
        }
        L243: {
          var2 = cm.a("definition_definitions,8", (byte) 101);
          if (var2 != null) {
            hj.field_e[8] = a.a(var2, -67);
            break L243;
          } else {
            break L243;
          }
        }
        L244: {
          var2 = cm.a("definition_definitions,9", (byte) 112);
          if (var2 != null) {
            hj.field_e[9] = a.a(var2, 127);
            break L244;
          } else {
            break L244;
          }
        }
        L245: {
          var2 = cm.a("definition_definitions,10", (byte) 66);
          if (var2 == null) {
            break L245;
          } else {
            hj.field_e[10] = a.a(var2, 123);
            break L245;
          }
        }
        L246: {
          var2 = cm.a("definition_definitions,11", (byte) 119);
          if (var2 != null) {
            hj.field_e[11] = a.a(var2, 123);
            break L246;
          } else {
            break L246;
          }
        }
        L247: {
          var2 = cm.a("definition_definitions,12", (byte) 97);
          if (null != var2) {
            hj.field_e[12] = a.a(var2, -44);
            break L247;
          } else {
            break L247;
          }
        }
        L248: {
          var2 = cm.a("definition_definitions,13", (byte) 67);
          if (var2 != null) {
            hj.field_e[13] = a.a(var2, -100);
            break L248;
          } else {
            break L248;
          }
        }
        L249: {
          var2 = cm.a("definition_definitions,14", (byte) 22);
          if (null != var2) {
            hj.field_e[14] = a.a(var2, -71);
            break L249;
          } else {
            break L249;
          }
        }
        L250: {
          var2 = cm.a("definition_definitions,15", (byte) 40);
          if (var2 == null) {
            break L250;
          } else {
            hj.field_e[15] = a.a(var2, 123);
            break L250;
          }
        }
        L251: {
          var2 = cm.a("definition_definitions,16", (byte) 27);
          if (var2 == null) {
            break L251;
          } else {
            hj.field_e[16] = a.a(var2, -29);
            break L251;
          }
        }
        L252: {
          var2 = cm.a("tutorial_option_basics", (byte) 20);
          if (null != var2) {
            sl.field_U = a.a(var2, 125);
            break L252;
          } else {
            break L252;
          }
        }
        L253: {
          var2 = cm.a("tutorial_option_eight_ball", (byte) 58);
          if (null == var2) {
            break L253;
          } else {
            fd.field_Q = a.a(var2, 126);
            break L253;
          }
        }
        L254: {
          var2 = cm.a("tutorial_option_nine_ball", (byte) 100);
          if (null == var2) {
            break L254;
          } else {
            pf.field_a = a.a(var2, 127);
            break L254;
          }
        }
        L255: {
          var2 = cm.a("tutorial_title_basics", (byte) 103);
          if (var2 != null) {
            jj.field_Q = a.a(var2, 124);
            break L255;
          } else {
            break L255;
          }
        }
        L256: {
          var2 = cm.a("tutorial_title_eight_ball", (byte) 113);
          if (var2 != null) {
            fc.field_e = a.a(var2, -113);
            break L256;
          } else {
            break L256;
          }
        }
        L257: {
          var2 = cm.a("tutorial_title_nine_ball", (byte) 39);
          if (var2 != null) {
            ep.field_G = a.a(var2, 125);
            break L257;
          } else {
            break L257;
          }
        }
        L258: {
          var2 = cm.a("tutorial_hide", (byte) 57);
          if (null == var2) {
            break L258;
          } else {
            ln.field_l = a.a(var2, 126);
            break L258;
          }
        }
        L259: {
          var2 = cm.a("tutorial_show", (byte) 67);
          if (null != var2) {
            ml.field_a = a.a(var2, -44);
            break L259;
          } else {
            break L259;
          }
        }
        L260: {
          var2 = cm.a("tutorial_prev", (byte) 41);
          if (null == var2) {
            break L260;
          } else {
            ll.field_g = a.a(var2, 124);
            break L260;
          }
        }
        L261: {
          var2 = cm.a("tutorial_next", (byte) 127);
          if (var2 == null) {
            break L261;
          } else {
            aj.field_Tb = a.a(var2, 124);
            break L261;
          }
        }
        L262: {
          var2 = cm.a("tutorial_back", (byte) 77);
          if (var2 == null) {
            break L262;
          } else {
            String discarded$27 = a.a(var2, -46);
            break L262;
          }
        }
        L263: {
          var2 = cm.a("tutorial_camera_rotate", (byte) 97);
          if (var2 != null) {
            fn.field_Ob = a.a(var2, 126);
            break L263;
          } else {
            break L263;
          }
        }
        L264: {
          var2 = cm.a("tutorial_camera_zoom", (byte) 80);
          if (null == var2) {
            break L264;
          } else {
            tj.field_eb = a.a(var2, 126);
            break L264;
          }
        }
        L265: {
          var2 = cm.a("tutorial_camera_recentre", (byte) 20);
          if (null == var2) {
            break L265;
          } else {
            ie.field_i = a.a(var2, 124);
            break L265;
          }
        }
        L266: {
          var2 = cm.a("tutorial_shot_mode_enter", (byte) 29);
          if (var2 == null) {
            break L266;
          } else {
            je.field_a = a.a(var2, -41);
            break L266;
          }
        }
        L267: {
          var2 = cm.a("tutorial_shot_mode_take", (byte) 19);
          if (null == var2) {
            break L267;
          } else {
            el.field_L = a.a(var2, 123);
            break L267;
          }
        }
        L268: {
          var2 = cm.a("tutorial_shot_mode_rotate", (byte) 94);
          if (null == var2) {
            break L268;
          } else {
            en.field_d = a.a(var2, -89);
            break L268;
          }
        }
        L269: {
          var2 = cm.a("tutorial_shot_mode_power", (byte) 76);
          if (var2 != null) {
            na.field_b = a.a(var2, -70);
            break L269;
          } else {
            break L269;
          }
        }
        L270: {
          var2 = cm.a("tutorial_shot_mode_leave", (byte) 86);
          if (var2 == null) {
            break L270;
          } else {
            om.field_t = a.a(var2, 124);
            break L270;
          }
        }
        L271: {
          var2 = cm.a("tutorial_basic_complete", (byte) 115);
          if (null != var2) {
            vj.field_f = a.a(var2, 126);
            break L271;
          } else {
            break L271;
          }
        }
        L272: {
          var2 = cm.a("tutorial_eight_ball_start_place_cueball", (byte) 26);
          if (null == var2) {
            break L272;
          } else {
            qq.field_yb = a.a(var2, -89);
            break L272;
          }
        }
        L273: {
          var2 = cm.a("tutorial_eight_ball_break", (byte) 66);
          if (null != var2) {
            dr.field_e = a.a(var2, -80);
            break L273;
          } else {
            break L273;
          }
        }
        L274: {
          var2 = cm.a("tutorial_eight_ball_afterbreak", (byte) 120);
          if (var2 != null) {
            ea.field_m = a.a(var2, 124);
            break L274;
          } else {
            break L274;
          }
        }
        L275: {
          var2 = cm.a("tutorial_eight_ball_afterfirstpot", (byte) 60);
          if (var2 != null) {
            gn.field_a = a.a(var2, 126);
            break L275;
          } else {
            break L275;
          }
        }
        L276: {
          var2 = cm.a("tutorial_eight_ball_aftergrouppot", (byte) 68);
          if (null != var2) {
            lk.field_r = a.a(var2, -113);
            break L276;
          } else {
            break L276;
          }
        }
        L277: {
          var2 = cm.a("tutorial_eight_ball_complete", (byte) 81);
          if (null != var2) {
            g.field_w = a.a(var2, -98);
            break L277;
          } else {
            break L277;
          }
        }
        L278: {
          var2 = cm.a("potting_ball_for_you", (byte) 41);
          if (var2 == null) {
            break L278;
          } else {
            vc.field_P = a.a(var2, 125);
            break L278;
          }
        }
        L279: {
          var2 = cm.a("potting_the_rest_of_your_group", (byte) 75);
          if (var2 != null) {
            kj.field_l = a.a(var2, -61);
            break L279;
          } else {
            break L279;
          }
        }
        L280: {
          var2 = cm.a("tutorial_nine_ball_start_place_cueball", (byte) 55);
          if (null == var2) {
            break L280;
          } else {
            ca.field_m = a.a(var2, 124);
            break L280;
          }
        }
        L281: {
          var2 = cm.a("tutorial_nine_ball_break", (byte) 123);
          if (var2 == null) {
            break L281;
          } else {
            cf.field_i = a.a(var2, -1);
            break L281;
          }
        }
        L282: {
          var2 = cm.a("tutorial_nine_ball_afterbreak", (byte) 28);
          if (null == var2) {
            break L282;
          } else {
            eq.field_N = a.a(var2, 127);
            break L282;
          }
        }
        L283: {
          var2 = cm.a("tutorial_nine_ball_potting_a_ball", (byte) 74);
          if (var2 == null) {
            break L283;
          } else {
            pl.field_c = a.a(var2, -83);
            break L283;
          }
        }
        L284: {
          var2 = cm.a("tutorial_nine_ball_potting_nine", (byte) 77);
          if (null != var2) {
            ui.field_N = a.a(var2, 124);
            break L284;
          } else {
            break L284;
          }
        }
        L285: {
          var2 = cm.a("tutorial_nine_ball_final", (byte) 35);
          if (null != var2) {
            rc.field_a = a.a(var2, 12);
            break L285;
          } else {
            break L285;
          }
        }
        L286: {
          var2 = cm.a("ticker_hint_enter_shot_mode", (byte) 39);
          if (null != var2) {
            ah.field_h = a.a(var2, 123);
            break L286;
          } else {
            break L286;
          }
        }
        L287: {
          var2 = cm.a("ticker_hint_leave_shot_mode", (byte) 76);
          if (var2 == null) {
            break L287;
          } else {
            uf.field_s = a.a(var2, 125);
            break L287;
          }
        }
        L288: {
          var2 = cm.a("ticker_hint_move_cueball", (byte) 76);
          if (null == var2) {
            break L288;
          } else {
            up.field_L = a.a(var2, 124);
            break L288;
          }
        }
        L289: {
          var2 = cm.a("ticker_hint_set_power", (byte) 87);
          if (null != var2) {
            gk.field_lb = a.a(var2, -110);
            break L289;
          } else {
            break L289;
          }
        }
        L290: {
          var2 = cm.a("ticker_hint_zoom", (byte) 27);
          if (var2 != null) {
            sm.field_B = a.a(var2, -119);
            break L290;
          } else {
            break L290;
          }
        }
        L291: {
          var2 = cm.a("ticker_hint_shot_mode_aim", (byte) 105);
          if (var2 == null) {
            break L291;
          } else {
            em.field_O = a.a(var2, 127);
            break L291;
          }
        }
        L292: {
          var2 = cm.a("ticker_hint_aim", (byte) 39);
          if (var2 != null) {
            sa.field_l = a.a(var2, 126);
            break L292;
          } else {
            break L292;
          }
        }
        L293: {
          var2 = cm.a("ticker_hint_rotate", (byte) 48);
          if (null != var2) {
            pm.field_o = a.a(var2, 0);
            break L293;
          } else {
            break L293;
          }
        }
        L294: {
          var2 = cm.a("ticker_hint_shoot", (byte) 73);
          if (var2 == null) {
            break L294;
          } else {
            sf.field_z = a.a(var2, 127);
            break L294;
          }
        }
        L295: {
          var2 = cm.a("menu_restart_game", (byte) 33);
          if (null != var2) {
            dg.field_M = a.a(var2, 126);
            break L295;
          } else {
            break L295;
          }
        }
        L296: {
          var2 = cm.a("menu_rematch_game", (byte) 103);
          if (var2 == null) {
            break L296;
          } else {
            up.field_J = a.a(var2, 123);
            break L296;
          }
        }
        L297: {
          var2 = cm.a("menu_settings", (byte) 19);
          if (null == var2) {
            break L297;
          } else {
            ko.field_a = a.a(var2, 126);
            break L297;
          }
        }
        L298: {
          var2 = cm.a("foul_exclamation", (byte) 107);
          if (null != var2) {
            bq.field_s = a.a(var2, -90);
            break L298;
          } else {
            break L298;
          }
        }
        L299: {
          var2 = cm.a("player_name_another_shot", (byte) 66);
          if (var2 == null) {
            break L299;
          } else {
            String discarded$28 = a.a(var2, -58);
            break L299;
          }
        }
        L300: {
          var2 = cm.a("player_name_two_shots", (byte) 59);
          if (var2 != null) {
            gr.field_A = a.a(var2, 125);
            break L300;
          } else {
            break L300;
          }
        }
        L301: {
          var2 = cm.a("player_name_ball_in_hand", (byte) 44);
          if (null == var2) {
            break L301;
          } else {
            uo.field_Ob = a.a(var2, -29);
            break L301;
          }
        }
        L302: {
          var2 = cm.a("player_name_you_have_an_extra_shot", (byte) 42);
          if (var2 != null) {
            vp.field_e = a.a(var2, 127);
            break L302;
          } else {
            break L302;
          }
        }
        L303: {
          var2 = cm.a("status_versus", (byte) 55);
          if (var2 == null) {
            break L303;
          } else {
            tp.field_a = a.a(var2, 124);
            break L303;
          }
        }
        L304: {
          var2 = cm.a("status_out_of_lives", (byte) 82);
          if (null != var2) {
            rg.field_l = a.a(var2, 124);
            break L304;
          } else {
            break L304;
          }
        }
        L305: {
          var2 = cm.a("status_resigned", (byte) 78);
          if (var2 == null) {
            break L305;
          } else {
            n.field_Q = a.a(var2, 123);
            break L305;
          }
        }
        L306: {
          var2 = cm.a("status_wants_to_draw", (byte) 79);
          if (var2 != null) {
            sh.field_R = a.a(var2, 123);
            break L306;
          } else {
            break L306;
          }
        }
        L307: {
          var2 = cm.a("status_wants_a_rematch", (byte) 30);
          if (var2 != null) {
            ge.field_n = a.a(var2, 123);
            break L307;
          } else {
            break L307;
          }
        }
        L308: {
          var2 = cm.a("player_list_first", (byte) 33);
          if (var2 != null) {
            en.field_e = a.a(var2, -115);
            break L308;
          } else {
            break L308;
          }
        }
        L309: {
          var2 = cm.a("player_list_middle", (byte) 33);
          if (var2 != null) {
            bc.field_h = a.a(var2, 125);
            break L309;
          } else {
            break L309;
          }
        }
        L310: {
          var2 = cm.a("player_list_last", (byte) 43);
          if (var2 != null) {
            lq.field_N = a.a(var2, 124);
            break L310;
          } else {
            break L310;
          }
        }
        L311: {
          var2 = cm.a("you_are_group_name", (byte) 31);
          if (null != var2) {
            rj.field_g = a.a(var2, -14);
            break L311;
          } else {
            break L311;
          }
        }
        L312: {
          var2 = cm.a("player_is_group_name", (byte) 87);
          if (var2 != null) {
            sd.field_O = a.a(var2, -39);
            break L312;
          } else {
            break L312;
          }
        }
        L313: {
          var2 = cm.a("player_x2_are_group_name", (byte) 32);
          if (var2 != null) {
            of.field_Qb = a.a(var2, 124);
            break L313;
          } else {
            break L313;
          }
        }
        L314: {
          var2 = cm.a("player_list_are_group_name", (byte) 66);
          if (null != var2) {
            w.field_c = a.a(var2, -20);
            break L314;
          } else {
            break L314;
          }
        }
        L315: {
          var2 = cm.a("player_you_x2_are_group_name", (byte) 116);
          if (null != var2) {
            qq.field_zb = a.a(var2, 127);
            break L315;
          } else {
            break L315;
          }
        }
        L316: {
          var2 = cm.a("player_you_first_list_are_group_name", (byte) 75);
          if (var2 != null) {
            ij.field_A = a.a(var2, -20);
            break L316;
          } else {
            break L316;
          }
        }
        L317: {
          var2 = cm.a("player_x2_have_won", (byte) 78);
          if (null == var2) {
            break L317;
          } else {
            gk.field_jb = a.a(var2, 126);
            break L317;
          }
        }
        L318: {
          var2 = cm.a("player_list_have_won", (byte) 61);
          if (var2 == null) {
            break L318;
          } else {
            sk.field_e = a.a(var2, 127);
            break L318;
          }
        }
        L319: {
          var2 = cm.a("player_you_x2_have_won", (byte) 97);
          if (null == var2) {
            break L319;
          } else {
            nf.field_db = a.a(var2, 123);
            break L319;
          }
        }
        L320: {
          var2 = cm.a("player_you_first_list_have_won", (byte) 88);
          if (var2 == null) {
            break L320;
          } else {
            jq.field_h = a.a(var2, 123);
            break L320;
          }
        }
        L321: {
          var2 = cm.a("player_is_offering_rematch", (byte) 33);
          if (null != var2) {
            String discarded$29 = a.a(var2, -79);
            break L321;
          } else {
            break L321;
          }
        }
        L322: {
          var2 = cm.a("player_x2_are_offering_rematch", (byte) 73);
          if (var2 != null) {
            hp.field_e = a.a(var2, 123);
            break L322;
          } else {
            break L322;
          }
        }
        L323: {
          var2 = cm.a("player_list_are_offering_rematch", (byte) 95);
          if (var2 != null) {
            ee.field_a = a.a(var2, 124);
            break L323;
          } else {
            break L323;
          }
        }
        L324: {
          var2 = cm.a("player_you_x2_are_offering_rematch", (byte) 126);
          if (null != var2) {
            pq.field_D = a.a(var2, -50);
            break L324;
          } else {
            break L324;
          }
        }
        L325: {
          var2 = cm.a("player_you_first_list_are_offering_rematch", (byte) 68);
          if (null == var2) {
            break L325;
          } else {
            o.field_B = a.a(var2, 127);
            break L325;
          }
        }
        L326: {
          var2 = cm.a("player_is_offering_draw", (byte) 93);
          if (var2 != null) {
            String discarded$30 = a.a(var2, -111);
            break L326;
          } else {
            break L326;
          }
        }
        L327: {
          var2 = cm.a("player_x2_are_offering_draw", (byte) 52);
          if (null == var2) {
            break L327;
          } else {
            rg.field_o = a.a(var2, 127);
            break L327;
          }
        }
        L328: {
          var2 = cm.a("player_list_are_offering_draw", (byte) 83);
          if (var2 != null) {
            fd.field_H = a.a(var2, 126);
            break L328;
          } else {
            break L328;
          }
        }
        L329: {
          var2 = cm.a("player_you_x2_are_offering_draw", (byte) 108);
          if (var2 != null) {
            qp.field_bc = a.a(var2, 127);
            break L329;
          } else {
            break L329;
          }
        }
        L330: {
          var2 = cm.a("player_you_first_list_are_offering_draw", (byte) 107);
          if (var2 != null) {
            jk.field_f = a.a(var2, -36);
            break L330;
          } else {
            break L330;
          }
        }
        L331: {
          var2 = cm.a("player_you_are_out", (byte) 70);
          if (null != var2) {
            vj.field_g = a.a(var2, -128);
            break L331;
          } else {
            break L331;
          }
        }
        L332: {
          var2 = cm.a("player_is_out", (byte) 28);
          if (var2 != null) {
            qe.field_F = a.a(var2, 126);
            break L332;
          } else {
            break L332;
          }
        }
        L333: {
          var2 = cm.a("player_x2_are_out", (byte) 108);
          if (null != var2) {
            mg.field_a = a.a(var2, 125);
            break L333;
          } else {
            break L333;
          }
        }
        L334: {
          var2 = cm.a("player_list_are_out", (byte) 105);
          if (null != var2) {
            jl.field_b = a.a(var2, 125);
            break L334;
          } else {
            break L334;
          }
        }
        L335: {
          var2 = cm.a("player_you_x2_are_out", (byte) 95);
          if (var2 != null) {
            sl.field_W = a.a(var2, -96);
            break L335;
          } else {
            break L335;
          }
        }
        L336: {
          var2 = cm.a("player_you_first_list_are_out", (byte) 29);
          if (var2 == null) {
            break L336;
          } else {
            rk.field_e = a.a(var2, 124);
            break L336;
          }
        }
        L337: {
          var2 = cm.a("player_has_resigned", (byte) 55);
          if (null == var2) {
            break L337;
          } else {
            String discarded$31 = a.a(var2, -87);
            break L337;
          }
        }
        L338: {
          var2 = cm.a("player_x2_have_resigned", (byte) 28);
          if (null != var2) {
            w.field_e = a.a(var2, -52);
            break L338;
          } else {
            break L338;
          }
        }
        L339: {
          var2 = cm.a("player_list_have_resigned", (byte) 67);
          if (null != var2) {
            dl.field_i = a.a(var2, -49);
            break L339;
          } else {
            break L339;
          }
        }
        L340: {
          var2 = cm.a("player_you_x2_have_resigned", (byte) 84);
          if (null != var2) {
            bl.field_j = a.a(var2, 14);
            break L340;
          } else {
            break L340;
          }
        }
        L341: {
          var2 = cm.a("player_you_first_list_have_resigned", (byte) 51);
          if (null == var2) {
            break L341;
          } else {
            wj.field_U = a.a(var2, 124);
            break L341;
          }
        }
        L342: {
          var2 = cm.a("player_vs_player", (byte) 121);
          if (var2 == null) {
            break L342;
          } else {
            w.field_g = a.a(var2, 125);
            break L342;
          }
        }
        L343: {
          var2 = cm.a("player_list_vs_player_list", (byte) 84);
          if (null == var2) {
            break L343;
          } else {
            ub.field_o = a.a(var2, 11);
            break L343;
          }
        }
        L344: {
          var2 = cm.a("tutorial_break_try_again", (byte) 115);
          if (var2 != null) {
            ec.field_k = a.a(var2, 127);
            break L344;
          } else {
            break L344;
          }
        }
        L345: {
          var2 = cm.a("tutorial_lose", (byte) 92);
          if (null != var2) {
            ph.field_a = a.a(var2, 126);
            break L345;
          } else {
            break L345;
          }
        }
        L346: {
          var2 = cm.a("tutorial_lose_eight_ball_game", (byte) 90);
          if (var2 != null) {
            c.field_a = a.a(var2, -80);
            break L346;
          } else {
            break L346;
          }
        }
        L347: {
          var2 = cm.a("tutorial_lose_nine_ball_game", (byte) 82);
          if (var2 != null) {
            cr.field_q = a.a(var2, 126);
            break L347;
          } else {
            break L347;
          }
        }
        L348: {
          var2 = cm.a("cannot_position_cue_there", (byte) 52);
          if (null != var2) {
            tn.field_p = a.a(var2, 125);
            break L348;
          } else {
            break L348;
          }
        }
        L349: {
          var2 = cm.a("cue_cant_go_there", (byte) 82);
          if (null != var2) {
            jd.field_f = a.a(var2, 124);
            break L349;
          } else {
            break L349;
          }
        }
        L350: {
          var2 = cm.a("player_x_gained_a_life", (byte) 100);
          if (null != var2) {
            ad.field_b = a.a(var2, 124);
            break L350;
          } else {
            break L350;
          }
        }
        L351: {
          var2 = cm.a("player_x_lost_a_life", (byte) 124);
          if (var2 != null) {
            jk.field_c = a.a(var2, -55);
            break L351;
          } else {
            break L351;
          }
        }
        L352: {
          var2 = cm.a("player_x_lost_two_lives", (byte) 49);
          if (var2 != null) {
            oh.field_f = a.a(var2, 127);
            break L352;
          } else {
            break L352;
          }
        }
        L353: {
          var2 = cm.a("you_gained_a_life", (byte) 101);
          if (var2 == null) {
            break L353;
          } else {
            oj.field_u = a.a(var2, -24);
            break L353;
          }
        }
        L354: {
          var2 = cm.a("you_lost_a_life", (byte) 71);
          if (var2 == null) {
            break L354;
          } else {
            o.field_D = a.a(var2, 1);
            break L354;
          }
        }
        L355: {
          var2 = cm.a("you_lost_two_lives", (byte) 85);
          if (var2 == null) {
            break L355;
          } else {
            jk.field_j = a.a(var2, 124);
            break L355;
          }
        }
        L356: {
          var2 = cm.a("player_x_now_has_n_lives", (byte) 68);
          if (null == var2) {
            break L356;
          } else {
            cj.field_U = a.a(var2, 123);
            break L356;
          }
        }
        L357: {
          var2 = cm.a("player_x_is_on_their_last_life", (byte) 67);
          if (var2 == null) {
            break L357;
          } else {
            kn.field_f = a.a(var2, -60);
            break L357;
          }
        }
        L358: {
          var2 = cm.a("you_now_have_n_lives", (byte) 30);
          if (var2 == null) {
            break L358;
          } else {
            hk.field_q = a.a(var2, -47);
            break L358;
          }
        }
        L359: {
          var2 = cm.a("you_are_on_your_last_life", (byte) 34);
          if (null == var2) {
            break L359;
          } else {
            bh.field_d = a.a(var2, 127);
            break L359;
          }
        }
        L360: {
          var2 = cm.a("doubleplusgood_shot,0", (byte) 95);
          if (var2 != null) {
            wo.field_b[0] = a.a(var2, -37);
            break L360;
          } else {
            break L360;
          }
        }
        L361: {
          var2 = cm.a("doubleplusgood_shot,1", (byte) 61);
          if (var2 == null) {
            break L361;
          } else {
            wo.field_b[1] = a.a(var2, 124);
            break L361;
          }
        }
        L362: {
          var2 = cm.a("plusgood_shot,0", (byte) 103);
          if (null != var2) {
            pq.field_C[0] = a.a(var2, 123);
            break L362;
          } else {
            break L362;
          }
        }
        L363: {
          var2 = cm.a("plusgood_shot,1", (byte) 53);
          if (null != var2) {
            pq.field_C[1] = a.a(var2, 125);
            break L363;
          } else {
            break L363;
          }
        }
        L364: {
          var2 = cm.a("plusgood_shot,2", (byte) 43);
          if (null != var2) {
            pq.field_C[2] = a.a(var2, 127);
            break L364;
          } else {
            break L364;
          }
        }
        L365: {
          var2 = cm.a("plusgood_shot,3", (byte) 25);
          if (var2 == null) {
            break L365;
          } else {
            pq.field_C[3] = a.a(var2, 127);
            break L365;
          }
        }
        L366: {
          var2 = cm.a("good_shot,0", (byte) 114);
          if (null == var2) {
            break L366;
          } else {
            v.field_k[0] = a.a(var2, 127);
            break L366;
          }
        }
        L367: {
          var2 = cm.a("good_shot,1", (byte) 61);
          if (var2 != null) {
            v.field_k[1] = a.a(var2, -44);
            break L367;
          } else {
            break L367;
          }
        }
        L368: {
          var2 = cm.a("good_shot,2", (byte) 45);
          if (null != var2) {
            v.field_k[2] = a.a(var2, 126);
            break L368;
          } else {
            break L368;
          }
        }
        L369: {
          var2 = cm.a("ungood_shot,0", (byte) 58);
          if (var2 != null) {
            qp.field_fc[0] = a.a(var2, 127);
            break L369;
          } else {
            break L369;
          }
        }
        L370: {
          var2 = cm.a("ungood_shot,1", (byte) 109);
          if (var2 != null) {
            qp.field_fc[1] = a.a(var2, -128);
            break L370;
          } else {
            break L370;
          }
        }
        L371: {
          var2 = cm.a("ungood_shot,2", (byte) 53);
          if (null != var2) {
            qp.field_fc[2] = a.a(var2, 127);
            break L371;
          } else {
            break L371;
          }
        }
        L372: {
          var2 = cm.a("plusungood_shot,0", (byte) 79);
          if (var2 == null) {
            break L372;
          } else {
            he.field_d[0] = a.a(var2, 123);
            break L372;
          }
        }
        L373: {
          var2 = cm.a("plusungood_shot,1", (byte) 40);
          if (var2 == null) {
            break L373;
          } else {
            he.field_d[1] = a.a(var2, -68);
            break L373;
          }
        }
        L374: {
          var2 = cm.a("plusungood_shot,2", (byte) 58);
          if (null != var2) {
            he.field_d[2] = a.a(var2, 124);
            break L374;
          } else {
            break L374;
          }
        }
        L375: {
          var2 = cm.a("doubleplusungood_shot,0", (byte) 49);
          if (null != var2) {
            jr.field_l[0] = a.a(var2, -90);
            break L375;
          } else {
            break L375;
          }
        }
        L376: {
          var2 = cm.a("doubleplusungood_shot,1", (byte) 61);
          if (var2 != null) {
            jr.field_l[1] = a.a(var2, -9);
            break L376;
          } else {
            break L376;
          }
        }
        L377: {
          var2 = cm.a("doubleplusungood_shot,2", (byte) 75);
          if (null != var2) {
            jr.field_l[2] = a.a(var2, 125);
            break L377;
          } else {
            break L377;
          }
        }
        L378: {
          var2 = cm.a("you_potted_balls_from_each_group", (byte) 49);
          if (null != var2) {
            String discarded$32 = a.a(var2, -73);
            break L378;
          } else {
            break L378;
          }
        }
        L379: {
          var2 = cm.a("which_group_do_you_want", (byte) 77);
          if (var2 != null) {
            ka.field_u = a.a(var2, -31);
            break L379;
          } else {
            break L379;
          }
        }
        L380: {
          var2 = cm.a("would_you_like_to_play_or_pass", (byte) 126);
          if (null != var2) {
            ml.field_g = a.a(var2, -89);
            break L380;
          } else {
            break L380;
          }
        }
        L381: {
          var2 = cm.a("decision_button_play", (byte) 71);
          if (null == var2) {
            break L381;
          } else {
            jf.field_q = a.a(var2, 127);
            break L381;
          }
        }
        L382: {
          var2 = cm.a("decision_button_pass", (byte) 59);
          if (null != var2) {
            rl.field_i = a.a(var2, 125);
            break L382;
          } else {
            break L382;
          }
        }
        L383: {
          var2 = cm.a("tooltip_ball_in_hand", (byte) 97);
          if (var2 != null) {
            jq.field_b = a.a(var2, -128);
            break L383;
          } else {
            break L383;
          }
        }
        L384: {
          var2 = cm.a("tooltip_break", (byte) 106);
          if (var2 == null) {
            break L384;
          } else {
            bo.field_b = a.a(var2, 123);
            break L384;
          }
        }
        L385: {
          var2 = cm.a("tooltip_extra_visit", (byte) 104);
          if (null == var2) {
            break L385;
          } else {
            wa.field_ob = a.a(var2, -1);
            break L385;
          }
        }
        L386: {
          var2 = cm.a("tooltip_snookered", (byte) 73);
          if (var2 == null) {
            break L386;
          } else {
            tq.field_v = a.a(var2, -32);
            break L386;
          }
        }
        L387: {
          var2 = cm.a("chat_button", (byte) 85);
          if (null != var2) {
            ua.field_n = a.a(var2, 125);
            break L387;
          } else {
            break L387;
          }
        }
        L388: {
          var2 = cm.a("end_of_game_press_escape_to_continue", (byte) 48);
          if (var2 != null) {
            fl.field_m = a.a(var2, 127);
            break L388;
          } else {
            break L388;
          }
        }
        L389: {
          var2 = cm.a("press_escape_for_options_menu", (byte) 19);
          if (var2 != null) {
            ke.field_a = a.a(var2, 123);
            break L389;
          } else {
            break L389;
          }
        }
        L390: {
          var2 = cm.a("time_trial", (byte) 19);
          if (null != var2) {
            oo.field_c = a.a(var2, 123);
            break L390;
          } else {
            break L390;
          }
        }
        L391: {
          var2 = cm.a("timer", (byte) 119);
          if (null == var2) {
            break L391;
          } else {
            bf.field_e = a.a(var2, -6);
            break L391;
          }
        }
        L392: {
          var2 = cm.a("highscore_header_time", (byte) 114);
          if (var2 == null) {
            break L392;
          } else {
            vi.field_b = a.a(var2, 126);
            break L392;
          }
        }
        L393: {
          var2 = cm.a("player_colon", (byte) 92);
          if (null != var2) {
            vl.field_r = a.a(var2, 125);
            break L393;
          } else {
            break L393;
          }
        }
        L394: {
          var2 = cm.a("player_colon_fr", (byte) 122);
          if (null != var2) {
            rc.field_g = a.a(var2, 126);
            break L394;
          } else {
            break L394;
          }
        }
        L395: {
          var2 = cm.a("time_trial_completed", (byte) 72);
          if (null != var2) {
            bc.field_a = a.a(var2, -92);
            break L395;
          } else {
            break L395;
          }
        }
        L396: {
          var2 = cm.a("time_trial_failed", (byte) 62);
          if (var2 != null) {
            ql.field_b = a.a(var2, 124);
            break L396;
          } else {
            break L396;
          }
        }
        L397: {
          var2 = cm.a("timer_seconds", (byte) 64);
          if (var2 == null) {
            break L397;
          } else {
            String discarded$33 = a.a(var2, -6);
            break L397;
          }
        }
        L398: {
          var2 = cm.a("timer_seconds_fractions", (byte) 70);
          if (var2 != null) {
            mp.field_Q = a.a(var2, 126);
            break L398;
          } else {
            break L398;
          }
        }
        L399: {
          var2 = cm.a("timer_minutes_seconds", (byte) 39);
          if (null == var2) {
            break L399;
          } else {
            lq.field_S = a.a(var2, -56);
            break L399;
          }
        }
        L400: {
          var2 = cm.a("timer_minutes_seconds_fractions", (byte) 23);
          if (var2 != null) {
            qe.field_r = a.a(var2, -17);
            break L400;
          } else {
            break L400;
          }
        }
        L401: {
          var2 = cm.a("timer_hours_minutes_seconds", (byte) 28);
          if (var2 == null) {
            break L401;
          } else {
            jk.field_k = a.a(var2, 126);
            break L401;
          }
        }
        L402: {
          var2 = cm.a("timer_hours_minutes_seconds_fractions", (byte) 76);
          if (null == var2) {
            break L402;
          } else {
            vf.field_gb = a.a(var2, -116);
            break L402;
          }
        }
        L403: {
          var2 = cm.a("mouse_y_axis_normal", (byte) 48);
          if (null != var2) {
            uf.field_K = a.a(var2, 123);
            break L403;
          } else {
            break L403;
          }
        }
        L404: {
          var2 = cm.a("mouse_y_axis_inverted", (byte) 82);
          if (null == var2) {
            break L404;
          } else {
            hb.field_q = a.a(var2, -103);
            break L404;
          }
        }
        L405: {
          var2 = cm.a("menu_time_trial_with_guides", (byte) 94);
          if (null == var2) {
            break L405;
          } else {
            qe.field_O = a.a(var2, 2);
            break L405;
          }
        }
        L406: {
          var2 = cm.a("menu_time_trial_without_guides", (byte) 68);
          if (null == var2) {
            break L406;
          } else {
            pl.field_e = a.a(var2, 127);
            break L406;
          }
        }
        L407: {
          var2 = cm.a("achievements_only_in_rated", (byte) 28);
          if (var2 == null) {
            break L407;
          } else {
            ab.field_a = a.a(var2, -38);
            break L407;
          }
        }
        L408: {
          var2 = cm.a("progress_jungle_bulk", (byte) 58);
          if (var2 != null) {
            sa.field_g = a.a(var2, -108);
            break L408;
          } else {
            break L408;
          }
        }
        L409: {
          var2 = cm.a("progress_jungle_finishing", (byte) 49);
          if (var2 == null) {
            break L409;
          } else {
            mn.field_d = a.a(var2, 127);
            break L409;
          }
        }
        L410: {
          var2 = cm.a("rated_membersonly", (byte) 84);
          if (null == var2) {
            break L410;
          } else {
            tq.field_x = a.a(var2, -23);
            break L410;
          }
        }
        L411: {
          var2 = cm.a("youhavelost", (byte) 44);
          if (null == var2) {
            break L411;
          } else {
            nd.field_g = a.a(var2, -92);
            break L411;
          }
        }
        L412: {
          var2 = cm.a("pot_balls_in_any_order_finish_on_black", (byte) 89);
          if (null != var2) {
            Pool.field_M = a.a(var2, -48);
            break L412;
          } else {
            break L412;
          }
        }
        L413: {
          var2 = cm.a("keycode_default_up1", (byte) 82);
          if (null != var2) {
            gp.field_b = 255 & var2[0];
            break L413;
          } else {
            break L413;
          }
        }
        L414: {
          var2 = cm.a("keycode_default_up2", (byte) 28);
          if (var2 != null) {
            fl.field_p = var2[0] & 255;
            break L414;
          } else {
            break L414;
          }
        }
        L415: {
          var2 = cm.a("keycode_default_down1", (byte) 85);
          if (var2 != null) {
            hm.field_j = var2[0] & 255;
            break L415;
          } else {
            break L415;
          }
        }
        L416: {
          var2 = cm.a("keycode_default_down2", (byte) 106);
          if (var2 == null) {
            break L416;
          } else {
            kr.field_h = 255 & var2[0];
            break L416;
          }
        }
        L417: {
          var2 = cm.a("keycode_default_left1", (byte) 17);
          if (null != var2) {
            bc.field_f = 255 & var2[0];
            break L417;
          } else {
            break L417;
          }
        }
        L418: {
          var2 = cm.a("keycode_default_left2", (byte) 113);
          if (var2 != null) {
            mb.field_a = 255 & var2[0];
            break L418;
          } else {
            break L418;
          }
        }
        L419: {
          var2 = cm.a("keycode_default_right1", (byte) 38);
          if (null == var2) {
            break L419;
          } else {
            gn.field_c = var2[0] & 255;
            break L419;
          }
        }
        L420: {
          var2 = cm.a("keycode_default_right2", (byte) 91);
          if (var2 == null) {
            break L420;
          } else {
            di.field_b = 255 & var2[0];
            break L420;
          }
        }
        L421: {
          var2 = cm.a("menu_option_return_to_tutorial", (byte) 126);
          if (var2 != null) {
            id.field_d = a.a(var2, 126);
            break L421;
          } else {
            break L421;
          }
        }
        L422: {
          var2 = cm.a("menu_option_end_tutorial", (byte) 26);
          if (null == var2) {
            break L422;
          } else {
            bc.field_d = a.a(var2, 126);
            break L422;
          }
        }
        ib.field_u = null;
        L423: {
          if (!kq.field_k) {
            break L423;
          } else {
            var4++;
            Pool.field_O = var4;
            break L423;
          }
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            field_c = null;
            field_f = null;
            field_e = null;
            int var1_int = -103 % ((param0 - 6) / 41);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "qk.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[][]{new String[6], new String[3], new String[6], new String[2]};
        field_g = 0;
    }
}
