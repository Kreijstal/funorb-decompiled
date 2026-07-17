/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pfa {
    private vna field_f;
    private int field_h;
    private bua field_c;
    static ura field_i;
    int field_e;
    int field_j;
    static String field_a;
    boolean field_g;
    private int field_d;
    static boolean[][] field_b;

    final static void a(cn param0, int param1) {
        byte[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_1310_0 = 0;
        int stackOut_1309_0 = 0;
        int stackOut_1308_0 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          fs.field_p = param0;
          var2 = mt.a("achievement_names,0", (byte) 108);
          if (null != var2) {
            lq.field_p[0] = jaa.a((byte) 77, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = mt.a("achievement_names,1", (byte) 121);
          if (var2 != null) {
            lq.field_p[1] = jaa.a((byte) 97, var2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var2 = mt.a("achievement_names,2", (byte) 115);
          if (null != var2) {
            lq.field_p[2] = jaa.a((byte) 73, var2);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var2 = mt.a("achievement_names,3", (byte) 123);
          if (null != var2) {
            lq.field_p[3] = jaa.a((byte) 69, var2);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          var2 = mt.a("achievement_names,4", (byte) 108);
          if (var2 == null) {
            break L4;
          } else {
            lq.field_p[4] = jaa.a((byte) 125, var2);
            break L4;
          }
        }
        L5: {
          var2 = mt.a("achievement_names,5", (byte) 121);
          if (null == var2) {
            break L5;
          } else {
            lq.field_p[5] = jaa.a((byte) 81, var2);
            break L5;
          }
        }
        L6: {
          var2 = mt.a("achievement_names,6", (byte) 118);
          if (null != var2) {
            lq.field_p[6] = jaa.a((byte) 56, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = mt.a("achievement_names,7", (byte) 124);
          if (var2 != null) {
            lq.field_p[7] = jaa.a((byte) 30, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = mt.a("achievement_names,8", (byte) 102);
          if (var2 == null) {
            break L8;
          } else {
            lq.field_p[8] = jaa.a((byte) 77, var2);
            break L8;
          }
        }
        L9: {
          var2 = mt.a("achievement_names,9", (byte) 111);
          if (null == var2) {
            break L9;
          } else {
            lq.field_p[9] = jaa.a((byte) 26, var2);
            break L9;
          }
        }
        L10: {
          var2 = mt.a("achievement_names,10", (byte) 110);
          if (var2 == null) {
            break L10;
          } else {
            lq.field_p[10] = jaa.a((byte) 102, var2);
            break L10;
          }
        }
        L11: {
          var2 = mt.a("achievement_names,11", (byte) 121);
          if (null == var2) {
            break L11;
          } else {
            lq.field_p[11] = jaa.a((byte) 59, var2);
            break L11;
          }
        }
        L12: {
          var2 = mt.a("achievement_names,12", (byte) 112);
          if (var2 != null) {
            lq.field_p[12] = jaa.a((byte) 28, var2);
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          var2 = mt.a("achievement_names,13", (byte) 127);
          if (null == var2) {
            break L13;
          } else {
            lq.field_p[13] = jaa.a((byte) 50, var2);
            break L13;
          }
        }
        L14: {
          var2 = mt.a("achievement_names,14", (byte) 116);
          if (var2 == null) {
            break L14;
          } else {
            lq.field_p[14] = jaa.a((byte) 113, var2);
            break L14;
          }
        }
        L15: {
          var2 = mt.a("achievement_names,15", (byte) 119);
          if (var2 == null) {
            break L15;
          } else {
            lq.field_p[15] = jaa.a((byte) 122, var2);
            break L15;
          }
        }
        L16: {
          var2 = mt.a("achievement_names,16", (byte) 123);
          if (null != var2) {
            lq.field_p[16] = jaa.a((byte) 37, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = mt.a("achievement_names,17", (byte) 102);
          if (var2 == null) {
            break L17;
          } else {
            lq.field_p[17] = jaa.a((byte) 84, var2);
            break L17;
          }
        }
        L18: {
          var2 = mt.a("achievement_names,18", (byte) 120);
          if (null == var2) {
            break L18;
          } else {
            lq.field_p[18] = jaa.a((byte) 121, var2);
            break L18;
          }
        }
        L19: {
          var2 = mt.a("achievement_names,19", (byte) 121);
          if (var2 == null) {
            break L19;
          } else {
            lq.field_p[19] = jaa.a((byte) 75, var2);
            break L19;
          }
        }
        L20: {
          var2 = mt.a("achievement_names,20", (byte) 124);
          if (var2 == null) {
            break L20;
          } else {
            lq.field_p[20] = jaa.a((byte) 25, var2);
            break L20;
          }
        }
        L21: {
          var2 = mt.a("achievement_names,21", (byte) 104);
          if (var2 == null) {
            break L21;
          } else {
            lq.field_p[21] = jaa.a((byte) 64, var2);
            break L21;
          }
        }
        L22: {
          var2 = mt.a("achievement_names,22", (byte) 125);
          if (null == var2) {
            break L22;
          } else {
            lq.field_p[22] = jaa.a((byte) 106, var2);
            break L22;
          }
        }
        L23: {
          var2 = mt.a("achievement_names,23", (byte) 102);
          if (var2 != null) {
            lq.field_p[23] = jaa.a((byte) 28, var2);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          var2 = mt.a("achievement_names,24", (byte) 104);
          if (var2 == null) {
            break L24;
          } else {
            lq.field_p[24] = jaa.a((byte) 67, var2);
            break L24;
          }
        }
        L25: {
          var2 = mt.a("achievement_names,25", (byte) 116);
          if (var2 == null) {
            break L25;
          } else {
            lq.field_p[25] = jaa.a((byte) 96, var2);
            break L25;
          }
        }
        L26: {
          var2 = mt.a("achievement_names,26", (byte) 112);
          if (var2 == null) {
            break L26;
          } else {
            lq.field_p[26] = jaa.a((byte) 86, var2);
            break L26;
          }
        }
        L27: {
          var2 = mt.a("achievement_names,27", (byte) 102);
          if (var2 == null) {
            break L27;
          } else {
            lq.field_p[27] = jaa.a((byte) 76, var2);
            break L27;
          }
        }
        L28: {
          var2 = mt.a("achievement_names,28", (byte) 113);
          if (null != var2) {
            lq.field_p[28] = jaa.a((byte) 60, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = mt.a("achievement_names,29", (byte) 118);
          if (null == var2) {
            break L29;
          } else {
            lq.field_p[29] = jaa.a((byte) 66, var2);
            break L29;
          }
        }
        L30: {
          var2 = mt.a("achievement_names,30", (byte) 101);
          if (var2 != null) {
            lq.field_p[30] = jaa.a((byte) 101, var2);
            break L30;
          } else {
            break L30;
          }
        }
        L31: {
          var2 = mt.a("achievement_names,31", (byte) 125);
          if (var2 == null) {
            break L31;
          } else {
            lq.field_p[31] = jaa.a((byte) 67, var2);
            break L31;
          }
        }
        L32: {
          var2 = mt.a("achievement_names,32", (byte) 115);
          if (null == var2) {
            break L32;
          } else {
            lq.field_p[32] = jaa.a((byte) 64, var2);
            break L32;
          }
        }
        L33: {
          var2 = mt.a("achievement_names,33", (byte) 100);
          if (var2 == null) {
            break L33;
          } else {
            lq.field_p[33] = jaa.a((byte) 79, var2);
            break L33;
          }
        }
        L34: {
          var2 = mt.a("achievement_names,34", (byte) 125);
          if (var2 == null) {
            break L34;
          } else {
            lq.field_p[34] = jaa.a((byte) 55, var2);
            break L34;
          }
        }
        L35: {
          var2 = mt.a("achievement_names,35", (byte) 109);
          if (var2 == null) {
            break L35;
          } else {
            lq.field_p[35] = jaa.a((byte) 56, var2);
            break L35;
          }
        }
        L36: {
          var2 = mt.a("achievement_names,36", (byte) 116);
          if (null != var2) {
            lq.field_p[36] = jaa.a((byte) 69, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = mt.a("achievement_names,37", (byte) 125);
          if (null == var2) {
            break L37;
          } else {
            lq.field_p[37] = jaa.a((byte) 40, var2);
            break L37;
          }
        }
        L38: {
          var2 = mt.a("achievement_names,38", (byte) 122);
          if (var2 == null) {
            break L38;
          } else {
            lq.field_p[38] = jaa.a((byte) 116, var2);
            break L38;
          }
        }
        L39: {
          var2 = mt.a("achievement_names,39", (byte) 123);
          if (null == var2) {
            break L39;
          } else {
            lq.field_p[39] = jaa.a((byte) 38, var2);
            break L39;
          }
        }
        L40: {
          var2 = mt.a("achievement_names,40", (byte) 100);
          if (null != var2) {
            lq.field_p[40] = jaa.a((byte) 125, var2);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = mt.a("achievement_names,41", (byte) 113);
          if (var2 != null) {
            lq.field_p[41] = jaa.a((byte) 116, var2);
            break L41;
          } else {
            break L41;
          }
        }
        L42: {
          var2 = mt.a("achievement_criteria,0", (byte) 105);
          if (var2 != null) {
            kv.field_c[0] = jaa.a((byte) 61, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = mt.a("achievement_criteria,1", (byte) 114);
          if (var2 != null) {
            kv.field_c[1] = jaa.a((byte) 60, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = mt.a("achievement_criteria,2", (byte) 110);
          if (null == var2) {
            break L44;
          } else {
            kv.field_c[2] = jaa.a((byte) 111, var2);
            break L44;
          }
        }
        L45: {
          var2 = mt.a("achievement_criteria,3", (byte) 104);
          if (var2 == null) {
            break L45;
          } else {
            kv.field_c[3] = jaa.a((byte) 69, var2);
            break L45;
          }
        }
        L46: {
          var2 = mt.a("achievement_criteria,4", (byte) 127);
          if (null != var2) {
            kv.field_c[4] = jaa.a((byte) 54, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = mt.a("achievement_criteria,5", (byte) 111);
          if (null == var2) {
            break L47;
          } else {
            kv.field_c[5] = jaa.a((byte) 83, var2);
            break L47;
          }
        }
        L48: {
          var2 = mt.a("achievement_criteria,6", (byte) 113);
          if (var2 != null) {
            kv.field_c[6] = jaa.a((byte) 44, var2);
            break L48;
          } else {
            break L48;
          }
        }
        L49: {
          var2 = mt.a("achievement_criteria,7", (byte) 127);
          if (null == var2) {
            break L49;
          } else {
            kv.field_c[7] = jaa.a((byte) 80, var2);
            break L49;
          }
        }
        L50: {
          var2 = mt.a("achievement_criteria,8", (byte) 113);
          if (var2 != null) {
            kv.field_c[8] = jaa.a((byte) 98, var2);
            break L50;
          } else {
            break L50;
          }
        }
        L51: {
          var2 = mt.a("achievement_criteria,9", (byte) 110);
          if (null != var2) {
            kv.field_c[9] = jaa.a((byte) 45, var2);
            break L51;
          } else {
            break L51;
          }
        }
        L52: {
          var2 = mt.a("achievement_criteria,10", (byte) 104);
          if (var2 != null) {
            kv.field_c[10] = jaa.a((byte) 44, var2);
            break L52;
          } else {
            break L52;
          }
        }
        L53: {
          var2 = mt.a("achievement_criteria,11", (byte) 117);
          if (null == var2) {
            break L53;
          } else {
            kv.field_c[11] = jaa.a((byte) 90, var2);
            break L53;
          }
        }
        L54: {
          var2 = mt.a("achievement_criteria,12", (byte) 104);
          if (null != var2) {
            kv.field_c[12] = jaa.a((byte) 47, var2);
            break L54;
          } else {
            break L54;
          }
        }
        L55: {
          var2 = mt.a("achievement_criteria,13", (byte) 120);
          if (var2 != null) {
            kv.field_c[13] = jaa.a((byte) 88, var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = mt.a("achievement_criteria,14", (byte) 123);
          if (null != var2) {
            kv.field_c[14] = jaa.a((byte) 54, var2);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = mt.a("achievement_criteria,15", (byte) 110);
          if (var2 != null) {
            kv.field_c[15] = jaa.a((byte) 43, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = mt.a("achievement_criteria,16", (byte) 105);
          if (null != var2) {
            kv.field_c[16] = jaa.a((byte) 81, var2);
            break L58;
          } else {
            break L58;
          }
        }
        L59: {
          var2 = mt.a("achievement_criteria,17", (byte) 123);
          if (var2 != null) {
            kv.field_c[17] = jaa.a((byte) 115, var2);
            break L59;
          } else {
            break L59;
          }
        }
        L60: {
          var2 = mt.a("achievement_criteria,18", (byte) 123);
          if (null == var2) {
            break L60;
          } else {
            kv.field_c[18] = jaa.a((byte) 49, var2);
            break L60;
          }
        }
        L61: {
          var2 = mt.a("achievement_criteria,19", (byte) 120);
          if (var2 != null) {
            kv.field_c[19] = jaa.a((byte) 113, var2);
            break L61;
          } else {
            break L61;
          }
        }
        L62: {
          var2 = mt.a("achievement_criteria,20", (byte) 110);
          if (var2 != null) {
            kv.field_c[20] = jaa.a((byte) 48, var2);
            break L62;
          } else {
            break L62;
          }
        }
        L63: {
          var2 = mt.a("achievement_criteria,21", (byte) 117);
          if (null != var2) {
            kv.field_c[21] = jaa.a((byte) 86, var2);
            break L63;
          } else {
            break L63;
          }
        }
        L64: {
          var3 = -99 % ((param1 - 40) / 63);
          var2 = mt.a("achievement_criteria,22", (byte) 101);
          if (var2 != null) {
            kv.field_c[22] = jaa.a((byte) 108, var2);
            break L64;
          } else {
            break L64;
          }
        }
        L65: {
          var2 = mt.a("achievement_criteria,23", (byte) 101);
          if (var2 != null) {
            kv.field_c[23] = jaa.a((byte) 115, var2);
            break L65;
          } else {
            break L65;
          }
        }
        L66: {
          var2 = mt.a("achievement_criteria,24", (byte) 103);
          if (null != var2) {
            kv.field_c[24] = jaa.a((byte) 72, var2);
            break L66;
          } else {
            break L66;
          }
        }
        L67: {
          var2 = mt.a("achievement_criteria,25", (byte) 125);
          if (var2 == null) {
            break L67;
          } else {
            kv.field_c[25] = jaa.a((byte) 114, var2);
            break L67;
          }
        }
        L68: {
          var2 = mt.a("achievement_criteria,26", (byte) 112);
          if (null != var2) {
            kv.field_c[26] = jaa.a((byte) 56, var2);
            break L68;
          } else {
            break L68;
          }
        }
        L69: {
          var2 = mt.a("achievement_criteria,27", (byte) 127);
          if (null != var2) {
            kv.field_c[27] = jaa.a((byte) 61, var2);
            break L69;
          } else {
            break L69;
          }
        }
        L70: {
          var2 = mt.a("achievement_criteria,28", (byte) 126);
          if (null == var2) {
            break L70;
          } else {
            kv.field_c[28] = jaa.a((byte) 107, var2);
            break L70;
          }
        }
        L71: {
          var2 = mt.a("achievement_criteria,29", (byte) 116);
          if (var2 == null) {
            break L71;
          } else {
            kv.field_c[29] = jaa.a((byte) 69, var2);
            break L71;
          }
        }
        L72: {
          var2 = mt.a("achievement_criteria,30", (byte) 107);
          if (var2 == null) {
            break L72;
          } else {
            kv.field_c[30] = jaa.a((byte) 121, var2);
            break L72;
          }
        }
        L73: {
          var2 = mt.a("achievement_criteria,31", (byte) 101);
          if (var2 == null) {
            break L73;
          } else {
            kv.field_c[31] = jaa.a((byte) 89, var2);
            break L73;
          }
        }
        L74: {
          var2 = mt.a("achievement_criteria,32", (byte) 108);
          if (var2 != null) {
            kv.field_c[32] = jaa.a((byte) 83, var2);
            break L74;
          } else {
            break L74;
          }
        }
        L75: {
          var2 = mt.a("achievement_criteria,33", (byte) 105);
          if (var2 != null) {
            kv.field_c[33] = jaa.a((byte) 34, var2);
            break L75;
          } else {
            break L75;
          }
        }
        L76: {
          var2 = mt.a("achievement_criteria,34", (byte) 124);
          if (var2 != null) {
            kv.field_c[34] = jaa.a((byte) 127, var2);
            break L76;
          } else {
            break L76;
          }
        }
        L77: {
          var2 = mt.a("achievement_criteria,35", (byte) 123);
          if (null != var2) {
            kv.field_c[35] = jaa.a((byte) 71, var2);
            break L77;
          } else {
            break L77;
          }
        }
        L78: {
          var2 = mt.a("achievement_criteria,36", (byte) 122);
          if (null == var2) {
            break L78;
          } else {
            kv.field_c[36] = jaa.a((byte) 63, var2);
            break L78;
          }
        }
        L79: {
          var2 = mt.a("achievement_criteria,37", (byte) 122);
          if (var2 != null) {
            kv.field_c[37] = jaa.a((byte) 108, var2);
            break L79;
          } else {
            break L79;
          }
        }
        L80: {
          var2 = mt.a("achievement_criteria,38", (byte) 116);
          if (null != var2) {
            kv.field_c[38] = jaa.a((byte) 83, var2);
            break L80;
          } else {
            break L80;
          }
        }
        L81: {
          var2 = mt.a("achievement_criteria,39", (byte) 121);
          if (var2 != null) {
            kv.field_c[39] = jaa.a((byte) 43, var2);
            break L81;
          } else {
            break L81;
          }
        }
        L82: {
          var2 = mt.a("achievement_criteria,40", (byte) 117);
          if (var2 != null) {
            kv.field_c[40] = jaa.a((byte) 73, var2);
            break L82;
          } else {
            break L82;
          }
        }
        L83: {
          var2 = mt.a("achievement_criteria,41", (byte) 101);
          if (var2 == null) {
            break L83;
          } else {
            kv.field_c[41] = jaa.a((byte) 31, var2);
            break L83;
          }
        }
        L84: {
          var2 = mt.a("no_textures", (byte) 108);
          if (var2 == null) {
            break L84;
          } else {
            String discarded$28 = jaa.a((byte) 114, var2);
            break L84;
          }
        }
        L85: {
          var2 = mt.a("instructions_title", (byte) 112);
          if (var2 == null) {
            break L85;
          } else {
            sea.field_q = jaa.a((byte) 46, var2);
            break L85;
          }
        }
        L86: {
          var2 = mt.a("highscores_title", (byte) 114);
          if (null != var2) {
            String discarded$29 = jaa.a((byte) 60, var2);
            break L86;
          } else {
            break L86;
          }
        }
        L87: {
          var2 = mt.a("achievements_title", (byte) 120);
          if (var2 != null) {
            String discarded$30 = jaa.a((byte) 84, var2);
            break L87;
          } else {
            break L87;
          }
        }
        L88: {
          var2 = mt.a("rankings_title", (byte) 121);
          if (var2 == null) {
            break L88;
          } else {
            String discarded$31 = jaa.a((byte) 94, var2);
            break L88;
          }
        }
        L89: {
          var2 = mt.a("character_select_title", (byte) 120);
          if (var2 == null) {
            break L89;
          } else {
            String discarded$32 = jaa.a((byte) 67, var2);
            break L89;
          }
        }
        L90: {
          var2 = mt.a("player,0", (byte) 110);
          if (null == var2) {
            break L90;
          } else {
            kma.field_c[0] = jaa.a((byte) 37, var2);
            break L90;
          }
        }
        L91: {
          var2 = mt.a("player,1", (byte) 105);
          if (null != var2) {
            kma.field_c[1] = jaa.a((byte) 92, var2);
            break L91;
          } else {
            break L91;
          }
        }
        L92: {
          var2 = mt.a("player,2", (byte) 102);
          if (null == var2) {
            break L92;
          } else {
            kma.field_c[2] = jaa.a((byte) 64, var2);
            break L92;
          }
        }
        L93: {
          var2 = mt.a("player,3", (byte) 124);
          if (null != var2) {
            kma.field_c[3] = jaa.a((byte) 124, var2);
            break L93;
          } else {
            break L93;
          }
        }
        L94: {
          var2 = mt.a("positions,0", (byte) 119);
          if (var2 == null) {
            break L94;
          } else {
            dw.field_u[0] = jaa.a((byte) 102, var2);
            break L94;
          }
        }
        L95: {
          var2 = mt.a("positions,1", (byte) 114);
          if (var2 != null) {
            dw.field_u[1] = jaa.a((byte) 30, var2);
            break L95;
          } else {
            break L95;
          }
        }
        L96: {
          var2 = mt.a("positions,2", (byte) 108);
          if (var2 == null) {
            break L96;
          } else {
            dw.field_u[2] = jaa.a((byte) 96, var2);
            break L96;
          }
        }
        L97: {
          var2 = mt.a("positions,3", (byte) 121);
          if (var2 != null) {
            dw.field_u[3] = jaa.a((byte) 97, var2);
            break L97;
          } else {
            break L97;
          }
        }
        L98: {
          var2 = mt.a("roundWinner", (byte) 126);
          if (var2 != null) {
            cha.field_h = jaa.a((byte) 40, var2);
            break L98;
          } else {
            break L98;
          }
        }
        L99: {
          var2 = mt.a("gameWinner", (byte) 123);
          if (var2 != null) {
            vu.field_d = jaa.a((byte) 41, var2);
            break L99;
          } else {
            break L99;
          }
        }
        L100: {
          var2 = mt.a("roundWinner_draw", (byte) 113);
          if (var2 != null) {
            uda.field_o = jaa.a((byte) 43, var2);
            break L100;
          } else {
            break L100;
          }
        }
        L101: {
          var2 = mt.a("milliseconds", (byte) 111);
          if (var2 == null) {
            break L101;
          } else {
            String discarded$33 = jaa.a((byte) 28, var2);
            break L101;
          }
        }
        L102: {
          var2 = mt.a("arr", (byte) 127);
          if (var2 != null) {
            lva.field_y = jaa.a((byte) 72, var2);
            break L102;
          } else {
            break L102;
          }
        }
        L103: {
          var2 = mt.a("keys", (byte) 107);
          if (null != var2) {
            waa.field_b = jaa.a((byte) 115, var2);
            break L103;
          } else {
            break L103;
          }
        }
        L104: {
          var2 = mt.a("keycode_player1left", (byte) 122);
          if (null != var2) {
            kda.field_hd = 255 & var2[0];
            break L104;
          } else {
            break L104;
          }
        }
        L105: {
          var2 = mt.a("keycode_player1right", (byte) 119);
          if (null == var2) {
            break L105;
          } else {
            mf.field_a = var2[0] & 255;
            break L105;
          }
        }
        L106: {
          var2 = mt.a("keycode_player1up", (byte) 111);
          if (var2 != null) {
            mi.field_k = 255 & var2[0];
            break L106;
          } else {
            break L106;
          }
        }
        L107: {
          var2 = mt.a("keycode_player1down", (byte) 112);
          if (null != var2) {
            fp.field_a = var2[0] & 255;
            break L107;
          } else {
            break L107;
          }
        }
        L108: {
          var2 = mt.a("keycode_player1fire", (byte) 108);
          if (null != var2) {
            gsa.field_j = 255 & var2[0];
            break L108;
          } else {
            break L108;
          }
        }
        L109: {
          var2 = mt.a("keycode_player1reset", (byte) 105);
          if (null != var2) {
            mv.field_i = var2[0] & 255;
            break L109;
          } else {
            break L109;
          }
        }
        L110: {
          var2 = mt.a("keycode_player1pull", (byte) 122);
          if (var2 == null) {
            break L110;
          } else {
            ki.field_o = var2[0] & 255;
            break L110;
          }
        }
        L111: {
          var2 = mt.a("keycode_player1skiproom", (byte) 114);
          if (null != var2) {
            rta.field_g = var2[0] & 255;
            break L111;
          } else {
            break L111;
          }
        }
        L112: {
          var2 = mt.a("keycode_player1sneak", (byte) 123);
          if (null != var2) {
            hra.field_b = var2[0] & 255;
            break L112;
          } else {
            break L112;
          }
        }
        L113: {
          var2 = mt.a("oneplayer_timed", (byte) 113);
          if (var2 == null) {
            break L113;
          } else {
            qka.field_s = jaa.a((byte) 70, var2);
            break L113;
          }
        }
        L114: {
          var2 = mt.a("oneplayer_puzzle", (byte) 114);
          if (null == var2) {
            break L114;
          } else {
            ula.field_t = jaa.a((byte) 121, var2);
            break L114;
          }
        }
        L115: {
          var2 = mt.a("startroom_colon", (byte) 109);
          if (var2 != null) {
            rja.field_b = jaa.a((byte) 122, var2);
            break L115;
          } else {
            break L115;
          }
        }
        L116: {
          var2 = mt.a("difficulty_colon", (byte) 114);
          if (null == var2) {
            break L116;
          } else {
            wq.field_d = jaa.a((byte) 85, var2);
            break L116;
          }
        }
        L117: {
          var2 = mt.a("bloom", (byte) 110);
          if (var2 == null) {
            break L117;
          } else {
            ona.field_F = jaa.a((byte) 51, var2);
            break L117;
          }
        }
        L118: {
          var2 = mt.a("textures", (byte) 123);
          if (var2 == null) {
            break L118;
          } else {
            String discarded$34 = jaa.a((byte) 101, var2);
            break L118;
          }
        }
        L119: {
          var2 = mt.a("pointLights", (byte) 120);
          if (var2 == null) {
            break L119;
          } else {
            bq.field_a = jaa.a((byte) 95, var2);
            break L119;
          }
        }
        L120: {
          var2 = mt.a("wallShadows", (byte) 111);
          if (var2 != null) {
            ir.field_b = jaa.a((byte) 76, var2);
            break L120;
          } else {
            break L120;
          }
        }
        L121: {
          var2 = mt.a("textures_all", (byte) 104);
          if (null == var2) {
            break L121;
          } else {
            String discarded$35 = jaa.a((byte) 46, var2);
            break L121;
          }
        }
        L122: {
          var2 = mt.a("textures_some", (byte) 118);
          if (var2 != null) {
            String discarded$36 = jaa.a((byte) 51, var2);
            break L122;
          } else {
            break L122;
          }
        }
        L123: {
          var2 = mt.a("textures_none", (byte) 108);
          if (var2 == null) {
            break L123;
          } else {
            String discarded$37 = jaa.a((byte) 108, var2);
            break L123;
          }
        }
        L124: {
          var2 = mt.a("tutorial_title", (byte) 119);
          if (var2 == null) {
            break L124;
          } else {
            tea.field_a = jaa.a((byte) 25, var2);
            break L124;
          }
        }
        L125: {
          var2 = mt.a("tutorial_firetocontinue", (byte) 100);
          if (var2 != null) {
            vda.field_n = jaa.a((byte) 127, var2);
            break L125;
          } else {
            break L125;
          }
        }
        L126: {
          var2 = mt.a("tutorial_room0", (byte) 116);
          if (var2 != null) {
            fk.field_j = jaa.a((byte) 90, var2);
            break L126;
          } else {
            break L126;
          }
        }
        L127: {
          var2 = mt.a("tutorial_death", (byte) 106);
          if (var2 == null) {
            break L127;
          } else {
            tha.field_A = jaa.a((byte) 62, var2);
            break L127;
          }
        }
        L128: {
          var2 = mt.a("tutorial_treasure", (byte) 123);
          if (var2 == null) {
            break L128;
          } else {
            uw.field_b = jaa.a((byte) 90, var2);
            break L128;
          }
        }
        L129: {
          var2 = mt.a("tutorial_treasureslow", (byte) 117);
          if (null != var2) {
            lja.field_a = jaa.a((byte) 41, var2);
            break L129;
          } else {
            break L129;
          }
        }
        L130: {
          var2 = mt.a("tutorial_key", (byte) 102);
          if (var2 != null) {
            uj.field_f = jaa.a((byte) 65, var2);
            break L130;
          } else {
            break L130;
          }
        }
        L131: {
          var2 = mt.a("tutorial_pushable", (byte) 114);
          if (var2 == null) {
            break L131;
          } else {
            vh.field_c = jaa.a((byte) 99, var2);
            break L131;
          }
        }
        L132: {
          var2 = mt.a("tutorial_snakes", (byte) 113);
          if (var2 == null) {
            break L132;
          } else {
            wqa.field_F = jaa.a((byte) 62, var2);
            break L132;
          }
        }
        L133: {
          var2 = mt.a("tutorial_gun", (byte) 117);
          if (var2 == null) {
            break L133;
          } else {
            gca.field_l = jaa.a((byte) 80, var2);
            break L133;
          }
        }
        L134: {
          var2 = mt.a("tutorial_restart", (byte) 106);
          if (null == var2) {
            break L134;
          } else {
            wd.field_a = jaa.a((byte) 67, var2);
            break L134;
          }
        }
        L135: {
          var2 = mt.a("instructionTitleCoins", (byte) 112);
          if (var2 == null) {
            break L135;
          } else {
            ct.field_c = jaa.a((byte) 83, var2);
            break L135;
          }
        }
        L136: {
          var2 = mt.a("instructionTextCoins", (byte) 123);
          if (null == var2) {
            break L136;
          } else {
            dk.field_k = jaa.a((byte) 119, var2);
            break L136;
          }
        }
        L137: {
          var2 = mt.a("instructionTitleBagsOLoot", (byte) 109);
          if (var2 == null) {
            break L137;
          } else {
            pn.field_o = jaa.a((byte) 104, var2);
            break L137;
          }
        }
        L138: {
          var2 = mt.a("instructionTextBagsOLoot", (byte) 103);
          if (var2 == null) {
            break L138;
          } else {
            kh.field_m = jaa.a((byte) 39, var2);
            break L138;
          }
        }
        L139: {
          var2 = mt.a("instructionTitleIcons", (byte) 114);
          if (null != var2) {
            dka.field_c = jaa.a((byte) 50, var2);
            break L139;
          } else {
            break L139;
          }
        }
        L140: {
          var2 = mt.a("instructionTextIcons", (byte) 105);
          if (var2 == null) {
            break L140;
          } else {
            ne.field_e = jaa.a((byte) 84, var2);
            break L140;
          }
        }
        L141: {
          var2 = mt.a("instructionTitleBottomlessPits", (byte) 127);
          if (var2 != null) {
            kea.field_b = jaa.a((byte) 51, var2);
            break L141;
          } else {
            break L141;
          }
        }
        L142: {
          var2 = mt.a("instructionTextBottomlessPits", (byte) 109);
          if (null == var2) {
            break L142;
          } else {
            bpa.field_a = jaa.a((byte) 61, var2);
            break L142;
          }
        }
        L143: {
          var2 = mt.a("instructionTitleSnakePits", (byte) 119);
          if (null != var2) {
            baa.field_a = jaa.a((byte) 93, var2);
            break L143;
          } else {
            break L143;
          }
        }
        L144: {
          var2 = mt.a("instructionTextSnakePits", (byte) 111);
          if (null == var2) {
            break L144;
          } else {
            du.field_f = jaa.a((byte) 88, var2);
            break L144;
          }
        }
        L145: {
          var2 = mt.a("instructionTitleLagoonsOfLava", (byte) 119);
          if (null != var2) {
            dk.field_a = jaa.a((byte) 82, var2);
            break L145;
          } else {
            break L145;
          }
        }
        L146: {
          var2 = mt.a("instructionTextLagoonsOfLava", (byte) 101);
          if (null != var2) {
            vua.field_C = jaa.a((byte) 36, var2);
            break L146;
          } else {
            break L146;
          }
        }
        L147: {
          var2 = mt.a("instructionTitleCrushers", (byte) 114);
          if (var2 == null) {
            break L147;
          } else {
            qba.field_d = jaa.a((byte) 82, var2);
            break L147;
          }
        }
        L148: {
          var2 = mt.a("instructionTextCrushers", (byte) 116);
          if (var2 == null) {
            break L148;
          } else {
            ir.field_c = jaa.a((byte) 99, var2);
            break L148;
          }
        }
        L149: {
          var2 = mt.a("instructionTitleLindemannTotems", (byte) 117);
          if (null == var2) {
            break L149;
          } else {
            eua.field_Ab = jaa.a((byte) 25, var2);
            break L149;
          }
        }
        L150: {
          var2 = mt.a("instructionTextLindemannTotems", (byte) 123);
          if (var2 != null) {
            sba.field_o = jaa.a((byte) 29, var2);
            break L150;
          } else {
            break L150;
          }
        }
        L151: {
          var2 = mt.a("instructionTitleMobileLindemannTotems", (byte) 102);
          if (var2 == null) {
            break L151;
          } else {
            rua.field_hb = jaa.a((byte) 122, var2);
            break L151;
          }
        }
        L152: {
          var2 = mt.a("instructionTextMobileLindemannTotems", (byte) 120);
          if (var2 == null) {
            break L152;
          } else {
            vk.field_a = jaa.a((byte) 27, var2);
            break L152;
          }
        }
        L153: {
          var2 = mt.a("instructionTitleBobbyGeorgeTotems", (byte) 114);
          if (var2 == null) {
            break L153;
          } else {
            hca.field_s = jaa.a((byte) 59, var2);
            break L153;
          }
        }
        L154: {
          var2 = mt.a("instructionTextBobbyGeorgeTotems", (byte) 103);
          if (null == var2) {
            break L154;
          } else {
            koa.field_d = jaa.a((byte) 102, var2);
            break L154;
          }
        }
        L155: {
          var2 = mt.a("instructionTitleMirrors", (byte) 116);
          if (null != var2) {
            uv.field_u = jaa.a((byte) 98, var2);
            break L155;
          } else {
            break L155;
          }
        }
        L156: {
          var2 = mt.a("instructionTextMirrors", (byte) 127);
          if (null != var2) {
            hv.field_o = jaa.a((byte) 89, var2);
            break L156;
          } else {
            break L156;
          }
        }
        L157: {
          var2 = mt.a("instructionTitleMobileMirrors", (byte) 126);
          if (var2 != null) {
            jd.field_m = jaa.a((byte) 63, var2);
            break L157;
          } else {
            break L157;
          }
        }
        L158: {
          var2 = mt.a("instructionTextMobileMirrors", (byte) 119);
          if (var2 != null) {
            wfa.field_G = jaa.a((byte) 28, var2);
            break L158;
          } else {
            break L158;
          }
        }
        L159: {
          var2 = mt.a("instructionTitlePrecariousPlatforms", (byte) 127);
          if (null != var2) {
            fv.field_b = jaa.a((byte) 114, var2);
            break L159;
          } else {
            break L159;
          }
        }
        L160: {
          var2 = mt.a("instructionTextPrecariousPlatforms", (byte) 120);
          if (null != var2) {
            gn.field_y = jaa.a((byte) 82, var2);
            break L160;
          } else {
            break L160;
          }
        }
        L161: {
          var2 = mt.a("instructionTitleCrumblyBlocks", (byte) 103);
          if (null == var2) {
            break L161;
          } else {
            td.field_u = jaa.a((byte) 108, var2);
            break L161;
          }
        }
        L162: {
          var2 = mt.a("instructionTextCrumblyBlocks", (byte) 108);
          if (null != var2) {
            hn.field_G = jaa.a((byte) 78, var2);
            break L162;
          } else {
            break L162;
          }
        }
        L163: {
          var2 = mt.a("instructionTitleCauldronsOfGreenSoup", (byte) 115);
          if (var2 != null) {
            hoa.field_n = jaa.a((byte) 25, var2);
            break L163;
          } else {
            break L163;
          }
        }
        L164: {
          var2 = mt.a("instructionTextCauldronsOfGreenSoup", (byte) 112);
          if (var2 != null) {
            lr.field_e = jaa.a((byte) 43, var2);
            break L164;
          } else {
            break L164;
          }
        }
        L165: {
          var2 = mt.a("instructionTitleSkeletons", (byte) 113);
          if (null != var2) {
            td.field_n = jaa.a((byte) 92, var2);
            break L165;
          } else {
            break L165;
          }
        }
        L166: {
          var2 = mt.a("instructionTextSkeletons", (byte) 101);
          if (var2 != null) {
            qna.field_a = jaa.a((byte) 27, var2);
            break L166;
          } else {
            break L166;
          }
        }
        L167: {
          var2 = mt.a("instructionTitleLocksAndKeys", (byte) 101);
          if (null != var2) {
            uqa.field_v = jaa.a((byte) 83, var2);
            break L167;
          } else {
            break L167;
          }
        }
        L168: {
          var2 = mt.a("instructionTextLocksAndKeys", (byte) 120);
          if (var2 != null) {
            apa.field_b = jaa.a((byte) 62, var2);
            break L168;
          } else {
            break L168;
          }
        }
        L169: {
          var2 = mt.a("instructionTitlePortals", (byte) 125);
          if (var2 == null) {
            break L169;
          } else {
            rl.field_s = jaa.a((byte) 36, var2);
            break L169;
          }
        }
        L170: {
          var2 = mt.a("instructionTextPortals", (byte) 107);
          if (var2 == null) {
            break L170;
          } else {
            bq.field_e = jaa.a((byte) 75, var2);
            break L170;
          }
        }
        L171: {
          var2 = mt.a("instructionTitleLasers", (byte) 121);
          if (var2 == null) {
            break L171;
          } else {
            rh.field_q = jaa.a((byte) 90, var2);
            break L171;
          }
        }
        L172: {
          var2 = mt.a("instructionTextLasers", (byte) 122);
          if (var2 != null) {
            km.field_n = jaa.a((byte) 91, var2);
            break L172;
          } else {
            break L172;
          }
        }
        L173: {
          var2 = mt.a("instructionTitleMovingPlatforms", (byte) 106);
          if (var2 == null) {
            break L173;
          } else {
            lda.field_G = jaa.a((byte) 114, var2);
            break L173;
          }
        }
        L174: {
          var2 = mt.a("instructionTextMovingPlatforms", (byte) 102);
          if (var2 == null) {
            break L174;
          } else {
            tr.field_d = jaa.a((byte) 107, var2);
            break L174;
          }
        }
        L175: {
          var2 = mt.a("instructionTitlePressurePads", (byte) 101);
          if (var2 != null) {
            uqa.field_t = jaa.a((byte) 84, var2);
            break L175;
          } else {
            break L175;
          }
        }
        L176: {
          var2 = mt.a("instructionTextPressurePads", (byte) 113);
          if (null != var2) {
            at.field_R = jaa.a((byte) 54, var2);
            break L176;
          } else {
            break L176;
          }
        }
        L177: {
          var2 = mt.a("instructionTitleRollingJonesboulders", (byte) 115);
          if (var2 != null) {
            kd.field_z = jaa.a((byte) 57, var2);
            break L177;
          } else {
            break L177;
          }
        }
        L178: {
          var2 = mt.a("instructionTextRollingJonesboulders", (byte) 127);
          if (null != var2) {
            vm.field_a = jaa.a((byte) 118, var2);
            break L178;
          } else {
            break L178;
          }
        }
        L179: {
          var2 = mt.a("instructionTitleDiscOfDeathVendingMachines", (byte) 123);
          if (null != var2) {
            nea.field_b = jaa.a((byte) 124, var2);
            break L179;
          } else {
            break L179;
          }
        }
        L180: {
          var2 = mt.a("instructionTextDiscOfDeathVendingMachines", (byte) 116);
          if (var2 == null) {
            break L180;
          } else {
            wv.field_h = jaa.a((byte) 96, var2);
            break L180;
          }
        }
        L181: {
          var2 = mt.a("instructionTitlePerpetuallySpinningDiscs", (byte) 111);
          if (var2 != null) {
            gga.field_L = jaa.a((byte) 36, var2);
            break L181;
          } else {
            break L181;
          }
        }
        L182: {
          var2 = mt.a("instructionTextPerpetuallySpinningDiscs", (byte) 120);
          if (var2 != null) {
            kna.field_D = jaa.a((byte) 40, var2);
            break L182;
          } else {
            break L182;
          }
        }
        L183: {
          var2 = mt.a("instructionTitleWhiteLightBeams", (byte) 123);
          if (var2 == null) {
            break L183;
          } else {
            tu.field_d = jaa.a((byte) 33, var2);
            break L183;
          }
        }
        L184: {
          var2 = mt.a("instructionTextWhiteLightBeams", (byte) 111);
          if (var2 == null) {
            break L184;
          } else {
            ld.field_d = jaa.a((byte) 37, var2);
            break L184;
          }
        }
        L185: {
          var2 = mt.a("instructionTitleWanderingWalls", (byte) 103);
          if (var2 != null) {
            kva.field_r = jaa.a((byte) 106, var2);
            break L185;
          } else {
            break L185;
          }
        }
        L186: {
          var2 = mt.a("instructionTextWanderingWalls", (byte) 117);
          if (var2 == null) {
            break L186;
          } else {
            du.field_b = jaa.a((byte) 28, var2);
            break L186;
          }
        }
        L187: {
          var2 = mt.a("instructionTitleMazes", (byte) 118);
          if (null == var2) {
            break L187;
          } else {
            sta.field_H = jaa.a((byte) 66, var2);
            break L187;
          }
        }
        L188: {
          var2 = mt.a("instructionTextMazes", (byte) 105);
          if (var2 != null) {
            fb.field_b = jaa.a((byte) 31, var2);
            break L188;
          } else {
            break L188;
          }
        }
        L189: {
          var2 = mt.a("instructionTitleMoveableBlocks", (byte) 127);
          if (null == var2) {
            break L189;
          } else {
            er.field_J = jaa.a((byte) 42, var2);
            break L189;
          }
        }
        L190: {
          var2 = mt.a("instructionTextMoveableBlocks", (byte) 123);
          if (var2 != null) {
            gu.field_k = jaa.a((byte) 113, var2);
            break L190;
          } else {
            break L190;
          }
        }
        L191: {
          var2 = mt.a("instructionTitlePistols", (byte) 104);
          if (var2 == null) {
            break L191;
          } else {
            bn.field_o = jaa.a((byte) 98, var2);
            break L191;
          }
        }
        L192: {
          var2 = mt.a("instructionTextPistols", (byte) 119);
          if (var2 != null) {
            pna.field_k = jaa.a((byte) 104, var2);
            break L192;
          } else {
            break L192;
          }
        }
        L193: {
          var2 = mt.a("instructionsPage1Title1", (byte) 117);
          if (var2 != null) {
            ela.field_m = jaa.a((byte) 39, var2);
            break L193;
          } else {
            break L193;
          }
        }
        L194: {
          var2 = mt.a("instructionsPage1Title2", (byte) 116);
          if (var2 == null) {
            break L194;
          } else {
            fr.field_a = jaa.a((byte) 101, var2);
            break L194;
          }
        }
        L195: {
          var2 = mt.a("instructionsPage1Title3", (byte) 127);
          if (var2 != null) {
            qfa.field_a = jaa.a((byte) 51, var2);
            break L195;
          } else {
            break L195;
          }
        }
        L196: {
          var2 = mt.a("instructionsPage1Text1", (byte) 108);
          if (var2 == null) {
            break L196;
          } else {
            daa.field_f = jaa.a((byte) 31, var2);
            break L196;
          }
        }
        L197: {
          var2 = mt.a("instructionsPage1Text2", (byte) 125);
          if (var2 == null) {
            break L197;
          } else {
            ioa.field_o = jaa.a((byte) 93, var2);
            break L197;
          }
        }
        L198: {
          var2 = mt.a("instructionsPage1Text3", (byte) 113);
          if (var2 == null) {
            break L198;
          } else {
            mr.field_H = jaa.a((byte) 36, var2);
            break L198;
          }
        }
        L199: {
          var2 = mt.a("instructionsPage1Text4", (byte) 126);
          if (var2 != null) {
            uc.field_K = jaa.a((byte) 97, var2);
            break L199;
          } else {
            break L199;
          }
        }
        L200: {
          var2 = mt.a("instructionsPage1Text5", (byte) 123);
          if (null != var2) {
            pba.field_c = jaa.a((byte) 90, var2);
            break L200;
          } else {
            break L200;
          }
        }
        L201: {
          var2 = mt.a("instructionsPage1Text6", (byte) 116);
          if (var2 != null) {
            hsa.field_c = jaa.a((byte) 100, var2);
            break L201;
          } else {
            break L201;
          }
        }
        L202: {
          var2 = mt.a("loadingStrings,0", (byte) 100);
          if (var2 == null) {
            break L202;
          } else {
            fv.field_d[0] = jaa.a((byte) 72, var2);
            break L202;
          }
        }
        L203: {
          var2 = mt.a("loadingStrings,1", (byte) 107);
          if (null == var2) {
            break L203;
          } else {
            fv.field_d[1] = jaa.a((byte) 50, var2);
            break L203;
          }
        }
        L204: {
          var2 = mt.a("loadingStrings,2", (byte) 125);
          if (var2 == null) {
            break L204;
          } else {
            fv.field_d[2] = jaa.a((byte) 106, var2);
            break L204;
          }
        }
        L205: {
          var2 = mt.a("loadingStrings,3", (byte) 105);
          if (var2 == null) {
            break L205;
          } else {
            fv.field_d[3] = jaa.a((byte) 92, var2);
            break L205;
          }
        }
        L206: {
          var2 = mt.a("loadingStrings,4", (byte) 110);
          if (null != var2) {
            fv.field_d[4] = jaa.a((byte) 46, var2);
            break L206;
          } else {
            break L206;
          }
        }
        L207: {
          var2 = mt.a("loadingStrings,5", (byte) 101);
          if (null == var2) {
            break L207;
          } else {
            fv.field_d[5] = jaa.a((byte) 101, var2);
            break L207;
          }
        }
        L208: {
          var2 = mt.a("loadingStrings,6", (byte) 124);
          if (null != var2) {
            fv.field_d[6] = jaa.a((byte) 81, var2);
            break L208;
          } else {
            break L208;
          }
        }
        L209: {
          var2 = mt.a("loadingStrings,7", (byte) 126);
          if (var2 != null) {
            fv.field_d[7] = jaa.a((byte) 27, var2);
            break L209;
          } else {
            break L209;
          }
        }
        L210: {
          var2 = mt.a("loadingStrings,8", (byte) 125);
          if (null == var2) {
            break L210;
          } else {
            fv.field_d[8] = jaa.a((byte) 59, var2);
            break L210;
          }
        }
        L211: {
          var2 = mt.a("loadingStrings,9", (byte) 111);
          if (null == var2) {
            break L211;
          } else {
            fv.field_d[9] = jaa.a((byte) 60, var2);
            break L211;
          }
        }
        L212: {
          var2 = mt.a("loadingStrings,10", (byte) 104);
          if (var2 == null) {
            break L212;
          } else {
            fv.field_d[10] = jaa.a((byte) 93, var2);
            break L212;
          }
        }
        L213: {
          var2 = mt.a("loadingStrings,11", (byte) 120);
          if (var2 == null) {
            break L213;
          } else {
            fv.field_d[11] = jaa.a((byte) 84, var2);
            break L213;
          }
        }
        L214: {
          var2 = mt.a("loadingStrings,12", (byte) 119);
          if (null == var2) {
            break L214;
          } else {
            fv.field_d[12] = jaa.a((byte) 93, var2);
            break L214;
          }
        }
        L215: {
          var2 = mt.a("loadingStrings,13", (byte) 127);
          if (var2 == null) {
            break L215;
          } else {
            fv.field_d[13] = jaa.a((byte) 28, var2);
            break L215;
          }
        }
        L216: {
          var2 = mt.a("loadingStrings,14", (byte) 106);
          if (var2 == null) {
            break L216;
          } else {
            fv.field_d[14] = jaa.a((byte) 75, var2);
            break L216;
          }
        }
        L217: {
          var2 = mt.a("loadingStrings,15", (byte) 127);
          if (var2 == null) {
            break L217;
          } else {
            fv.field_d[15] = jaa.a((byte) 39, var2);
            break L217;
          }
        }
        L218: {
          var2 = mt.a("loadingStrings,16", (byte) 121);
          if (null == var2) {
            break L218;
          } else {
            fv.field_d[16] = jaa.a((byte) 65, var2);
            break L218;
          }
        }
        L219: {
          var2 = mt.a("loadingStrings,17", (byte) 120);
          if (var2 != null) {
            fv.field_d[17] = jaa.a((byte) 114, var2);
            break L219;
          } else {
            break L219;
          }
        }
        L220: {
          var2 = mt.a("loadingStrings,18", (byte) 124);
          if (null == var2) {
            break L220;
          } else {
            fv.field_d[18] = jaa.a((byte) 67, var2);
            break L220;
          }
        }
        L221: {
          var2 = mt.a("waitingStrings,0", (byte) 108);
          if (var2 == null) {
            break L221;
          } else {
            hca.field_U[0] = jaa.a((byte) 69, var2);
            break L221;
          }
        }
        L222: {
          var2 = mt.a("waitingStrings,1", (byte) 117);
          if (null != var2) {
            hca.field_U[1] = jaa.a((byte) 94, var2);
            break L222;
          } else {
            break L222;
          }
        }
        L223: {
          var2 = mt.a("waitingStrings,2", (byte) 124);
          if (null != var2) {
            hca.field_U[2] = jaa.a((byte) 117, var2);
            break L223;
          } else {
            break L223;
          }
        }
        L224: {
          var2 = mt.a("waitingStrings,3", (byte) 107);
          if (var2 != null) {
            hca.field_U[3] = jaa.a((byte) 118, var2);
            break L224;
          } else {
            break L224;
          }
        }
        L225: {
          var2 = mt.a("waitingStrings,4", (byte) 114);
          if (var2 == null) {
            break L225;
          } else {
            hca.field_U[4] = jaa.a((byte) 40, var2);
            break L225;
          }
        }
        L226: {
          var2 = mt.a("waitingStrings,5", (byte) 117);
          if (var2 != null) {
            hca.field_U[5] = jaa.a((byte) 53, var2);
            break L226;
          } else {
            break L226;
          }
        }
        L227: {
          var2 = mt.a("waitingStrings,6", (byte) 107);
          if (var2 == null) {
            break L227;
          } else {
            hca.field_U[6] = jaa.a((byte) 87, var2);
            break L227;
          }
        }
        L228: {
          var2 = mt.a("waitingStrings,7", (byte) 105);
          if (var2 == null) {
            break L228;
          } else {
            hca.field_U[7] = jaa.a((byte) 127, var2);
            break L228;
          }
        }
        L229: {
          var2 = mt.a("waitingStrings,8", (byte) 112);
          if (var2 != null) {
            hca.field_U[8] = jaa.a((byte) 101, var2);
            break L229;
          } else {
            break L229;
          }
        }
        L230: {
          var2 = mt.a("waitingStrings,9", (byte) 110);
          if (null != var2) {
            hca.field_U[9] = jaa.a((byte) 55, var2);
            break L230;
          } else {
            break L230;
          }
        }
        L231: {
          var2 = mt.a("waitingStrings,10", (byte) 126);
          if (null == var2) {
            break L231;
          } else {
            hca.field_U[10] = jaa.a((byte) 96, var2);
            break L231;
          }
        }
        L232: {
          var2 = mt.a("waitingStrings,11", (byte) 103);
          if (var2 != null) {
            hca.field_U[11] = jaa.a((byte) 100, var2);
            break L232;
          } else {
            break L232;
          }
        }
        L233: {
          var2 = mt.a("waitingStrings,12", (byte) 122);
          if (null == var2) {
            break L233;
          } else {
            hca.field_U[12] = jaa.a((byte) 116, var2);
            break L233;
          }
        }
        L234: {
          var2 = mt.a("waitingStrings,13", (byte) 110);
          if (var2 == null) {
            break L234;
          } else {
            hca.field_U[13] = jaa.a((byte) 40, var2);
            break L234;
          }
        }
        L235: {
          var2 = mt.a("waitingStrings,14", (byte) 100);
          if (var2 == null) {
            break L235;
          } else {
            hca.field_U[14] = jaa.a((byte) 57, var2);
            break L235;
          }
        }
        L236: {
          var2 = mt.a("waitingStrings,15", (byte) 104);
          if (var2 != null) {
            hca.field_U[15] = jaa.a((byte) 84, var2);
            break L236;
          } else {
            break L236;
          }
        }
        L237: {
          var2 = mt.a("waitingStrings,16", (byte) 107);
          if (var2 != null) {
            hca.field_U[16] = jaa.a((byte) 57, var2);
            break L237;
          } else {
            break L237;
          }
        }
        L238: {
          var2 = mt.a("waitingStrings,17", (byte) 102);
          if (null == var2) {
            break L238;
          } else {
            hca.field_U[17] = jaa.a((byte) 82, var2);
            break L238;
          }
        }
        L239: {
          var2 = mt.a("waitingStrings,18", (byte) 117);
          if (var2 == null) {
            break L239;
          } else {
            hca.field_U[18] = jaa.a((byte) 91, var2);
            break L239;
          }
        }
        L240: {
          var2 = mt.a("unpackingStrings,0", (byte) 108);
          if (null != var2) {
            uba.field_g[0] = jaa.a((byte) 28, var2);
            break L240;
          } else {
            break L240;
          }
        }
        L241: {
          var2 = mt.a("unpackingStrings,1", (byte) 109);
          if (null == var2) {
            break L241;
          } else {
            uba.field_g[1] = jaa.a((byte) 44, var2);
            break L241;
          }
        }
        L242: {
          var2 = mt.a("unpackingStrings,2", (byte) 112);
          if (null != var2) {
            uba.field_g[2] = jaa.a((byte) 81, var2);
            break L242;
          } else {
            break L242;
          }
        }
        L243: {
          var2 = mt.a("unpackingStrings,3", (byte) 126);
          if (var2 != null) {
            uba.field_g[3] = jaa.a((byte) 67, var2);
            break L243;
          } else {
            break L243;
          }
        }
        L244: {
          var2 = mt.a("unpackingStrings,4", (byte) 118);
          if (var2 == null) {
            break L244;
          } else {
            uba.field_g[4] = jaa.a((byte) 26, var2);
            break L244;
          }
        }
        L245: {
          var2 = mt.a("unpackingStrings,5", (byte) 101);
          if (var2 == null) {
            break L245;
          } else {
            uba.field_g[5] = jaa.a((byte) 84, var2);
            break L245;
          }
        }
        L246: {
          var2 = mt.a("unpackingStrings,6", (byte) 123);
          if (var2 == null) {
            break L246;
          } else {
            uba.field_g[6] = jaa.a((byte) 49, var2);
            break L246;
          }
        }
        L247: {
          var2 = mt.a("unpackingStrings,7", (byte) 127);
          if (var2 == null) {
            break L247;
          } else {
            uba.field_g[7] = jaa.a((byte) 42, var2);
            break L247;
          }
        }
        L248: {
          var2 = mt.a("unpackingStrings,8", (byte) 107);
          if (null != var2) {
            uba.field_g[8] = jaa.a((byte) 106, var2);
            break L248;
          } else {
            break L248;
          }
        }
        L249: {
          var2 = mt.a("unpackingStrings,9", (byte) 115);
          if (var2 != null) {
            uba.field_g[9] = jaa.a((byte) 46, var2);
            break L249;
          } else {
            break L249;
          }
        }
        L250: {
          var2 = mt.a("unpackingStrings,10", (byte) 118);
          if (null != var2) {
            uba.field_g[10] = jaa.a((byte) 105, var2);
            break L250;
          } else {
            break L250;
          }
        }
        L251: {
          var2 = mt.a("error", (byte) 113);
          if (var2 == null) {
            break L251;
          } else {
            so.field_L = jaa.a((byte) 73, var2);
            break L251;
          }
        }
        L252: {
          var2 = mt.a("pleaselogin", (byte) 105);
          if (null == var2) {
            break L252;
          } else {
            wja.field_o = jaa.a((byte) 79, var2);
            break L252;
          }
        }
        L253: {
          var2 = mt.a("hint_drag", (byte) 115);
          if (null == var2) {
            break L253;
          } else {
            qja.field_k = jaa.a((byte) 26, var2);
            break L253;
          }
        }
        L254: {
          var2 = mt.a("hint_drop", (byte) 112);
          if (null != var2) {
            hda.field_h = jaa.a((byte) 52, var2);
            break L254;
          } else {
            break L254;
          }
        }
        L255: {
          var2 = mt.a("hint_sneak", (byte) 112);
          if (null == var2) {
            break L255;
          } else {
            aca.field_g = jaa.a((byte) 65, var2);
            break L255;
          }
        }
        L256: {
          var2 = mt.a("hint_fire", (byte) 108);
          if (null != var2) {
            bb.field_l = jaa.a((byte) 66, var2);
            break L256;
          } else {
            break L256;
          }
        }
        L257: {
          var2 = mt.a("item_keys", (byte) 107);
          if (var2 == null) {
            break L257;
          } else {
            String discarded$38 = jaa.a((byte) 78, var2);
            break L257;
          }
        }
        L258: {
          var2 = mt.a("item_coins", (byte) 107);
          if (null == var2) {
            break L258;
          } else {
            lfa.field_m = jaa.a((byte) 91, var2);
            break L258;
          }
        }
        L259: {
          var2 = mt.a("item_bags", (byte) 121);
          if (var2 != null) {
            uha.field_s = jaa.a((byte) 49, var2);
            break L259;
          } else {
            break L259;
          }
        }
        L260: {
          var2 = mt.a("item_idols", (byte) 100);
          if (var2 == null) {
            break L260;
          } else {
            gla.field_o = jaa.a((byte) 96, var2);
            break L260;
          }
        }
        L261: {
          var2 = mt.a("weapon_dartgun", (byte) 103);
          if (null == var2) {
            break L261;
          } else {
            vp.field_B = jaa.a((byte) 83, var2);
            break L261;
          }
        }
        L262: {
          var2 = mt.a("weapon_machinegun", (byte) 104);
          if (var2 != null) {
            tha.field_y = jaa.a((byte) 95, var2);
            break L262;
          } else {
            break L262;
          }
        }
        L263: {
          var2 = mt.a("weapon_shotgun", (byte) 125);
          if (var2 == null) {
            break L263;
          } else {
            gqa.field_a = jaa.a((byte) 62, var2);
            break L263;
          }
        }
        L264: {
          var2 = mt.a("weapon_flaregun", (byte) 117);
          if (null != var2) {
            bfa.field_b = jaa.a((byte) 70, var2);
            break L264;
          } else {
            break L264;
          }
        }
        L265: {
          var2 = mt.a("weapon_flamer", (byte) 119);
          if (var2 == null) {
            break L265;
          } else {
            sl.field_d = jaa.a((byte) 103, var2);
            break L265;
          }
        }
        L266: {
          var2 = mt.a("weapon_flamershort", (byte) 101);
          if (var2 == null) {
            break L266;
          } else {
            wta.field_H = jaa.a((byte) 61, var2);
            break L266;
          }
        }
        L267: {
          var2 = mt.a("weapon_flamerblue", (byte) 113);
          if (var2 == null) {
            break L267;
          } else {
            tv.field_ub = jaa.a((byte) 96, var2);
            break L267;
          }
        }
        L268: {
          var2 = mt.a("weapon_waterspray", (byte) 101);
          if (null != var2) {
            bf.field_f = jaa.a((byte) 96, var2);
            break L268;
          } else {
            break L268;
          }
        }
        L269: {
          var2 = mt.a("weapon_bladelauncher", (byte) 116);
          if (null == var2) {
            break L269;
          } else {
            aka.field_A = jaa.a((byte) 47, var2);
            break L269;
          }
        }
        L270: {
          var2 = mt.a("weapon_fireball", (byte) 112);
          if (var2 != null) {
            hg.field_d = jaa.a((byte) 72, var2);
            break L270;
          } else {
            break L270;
          }
        }
        L271: {
          var2 = mt.a("weapon_bouncingfireball", (byte) 124);
          if (var2 != null) {
            kga.field_q = jaa.a((byte) 106, var2);
            break L271;
          } else {
            break L271;
          }
        }
        L272: {
          var2 = mt.a("weapon_freezer", (byte) 114);
          if (null == var2) {
            break L272;
          } else {
            fp.field_b = jaa.a((byte) 89, var2);
            break L272;
          }
        }
        L273: {
          var2 = mt.a("weapon_revolver", (byte) 127);
          if (var2 != null) {
            uj.field_e = jaa.a((byte) 37, var2);
            break L273;
          } else {
            break L273;
          }
        }
        L274: {
          var2 = mt.a("pos_1st", (byte) 113);
          if (var2 != null) {
            fma.field_d = jaa.a((byte) 39, var2);
            break L274;
          } else {
            break L274;
          }
        }
        L275: {
          var2 = mt.a("pos_2nd", (byte) 101);
          if (var2 == null) {
            break L275;
          } else {
            bqa.field_g = jaa.a((byte) 45, var2);
            break L275;
          }
        }
        L276: {
          var2 = mt.a("pos_3rd", (byte) 118);
          if (var2 == null) {
            break L276;
          } else {
            vh.field_b = jaa.a((byte) 58, var2);
            break L276;
          }
        }
        L277: {
          var2 = mt.a("pos_4th", (byte) 105);
          if (null == var2) {
            break L277;
          } else {
            tda.field_b = jaa.a((byte) 59, var2);
            break L277;
          }
        }
        L278: {
          var2 = mt.a("pos_resigned", (byte) 116);
          if (null == var2) {
            break L278;
          } else {
            ik.field_j = jaa.a((byte) 46, var2);
            break L278;
          }
        }
        L279: {
          var2 = mt.a("pos_completed", (byte) 117);
          if (var2 == null) {
            break L279;
          } else {
            ad.field_i = jaa.a((byte) 91, var2);
            break L279;
          }
        }
        L280: {
          var2 = mt.a("pos_dnf", (byte) 117);
          if (var2 == null) {
            break L280;
          } else {
            re.field_b = jaa.a((byte) 25, var2);
            break L280;
          }
        }
        L281: {
          var2 = mt.a("resigned", (byte) 106);
          if (null != var2) {
            id.field_i = jaa.a((byte) 102, var2);
            break L281;
          } else {
            break L281;
          }
        }
        L282: {
          var2 = mt.a("won_x_rounds", (byte) 112);
          if (var2 == null) {
            break L282;
          } else {
            ga.field_K = jaa.a((byte) 119, var2);
            break L282;
          }
        }
        L283: {
          var2 = mt.a("offering_rematch", (byte) 105);
          if (null != var2) {
            w.field_d = jaa.a((byte) 33, var2);
            break L283;
          } else {
            break L283;
          }
        }
        L284: {
          var2 = mt.a("rank", (byte) 122);
          if (var2 == null) {
            break L284;
          } else {
            hl.field_a = jaa.a((byte) 65, var2);
            break L284;
          }
        }
        L285: {
          var2 = mt.a("fivehunderedplus", (byte) 118);
          if (null != var2) {
            kha.field_a = jaa.a((byte) 105, var2);
            break L285;
          } else {
            break L285;
          }
        }
        L286: {
          var2 = mt.a("graphicsmode", (byte) 101);
          if (null != var2) {
            dna.field_I = jaa.a((byte) 45, var2);
            break L286;
          } else {
            break L286;
          }
        }
        L287: {
          var2 = mt.a("graphicsquality", (byte) 110);
          if (var2 != null) {
            bc.field_a = jaa.a((byte) 46, var2);
            break L287;
          } else {
            break L287;
          }
        }
        L288: {
          var2 = mt.a("slowmoveshift", (byte) 110);
          if (var2 != null) {
            pg.field_A = jaa.a((byte) 103, var2);
            break L288;
          } else {
            break L288;
          }
        }
        L289: {
          var2 = mt.a("slowmovegood", (byte) 119);
          if (var2 == null) {
            break L289;
          } else {
            gka.field_f = jaa.a((byte) 32, var2);
            break L289;
          }
        }
        L290: {
          var2 = mt.a("slowmovemove", (byte) 127);
          if (null == var2) {
            break L290;
          } else {
            qqa.field_p = jaa.a((byte) 102, var2);
            break L290;
          }
        }
        L291: {
          var2 = mt.a("room_X_of_Y", (byte) 116);
          if (null == var2) {
            break L291;
          } else {
            mg.field_k = jaa.a((byte) 71, var2);
            break L291;
          }
        }
        L292: {
          var2 = mt.a("completed", (byte) 104);
          if (var2 == null) {
            break L292;
          } else {
            iaa.field_a = jaa.a((byte) 50, var2);
            break L292;
          }
        }
        L293: {
          var2 = mt.a("failed", (byte) 108);
          if (var2 == null) {
            break L293;
          } else {
            wpa.field_K = jaa.a((byte) 43, var2);
            break L293;
          }
        }
        L294: {
          var2 = mt.a("out_of_time", (byte) 112);
          if (null == var2) {
            break L294;
          } else {
            sg.field_n = jaa.a((byte) 117, var2);
            break L294;
          }
        }
        L295: {
          var2 = mt.a("finish_time_colon", (byte) 104);
          if (var2 != null) {
            cc.field_l = jaa.a((byte) 107, var2);
            break L295;
          } else {
            break L295;
          }
        }
        L296: {
          var2 = mt.a("msg_finished", (byte) 119);
          if (null != var2) {
            ara.field_yb = jaa.a((byte) 102, var2);
            break L296;
          } else {
            break L296;
          }
        }
        L297: {
          var2 = mt.a("msg_failedtofinish", (byte) 107);
          if (var2 == null) {
            break L297;
          } else {
            at.field_Q = jaa.a((byte) 115, var2);
            break L297;
          }
        }
        L298: {
          var2 = mt.a("msg_timeup", (byte) 114);
          if (var2 != null) {
            hu.field_a = jaa.a((byte) 126, var2);
            break L298;
          } else {
            break L298;
          }
        }
        L299: {
          var2 = mt.a("msg_chosen_character", (byte) 117);
          if (var2 == null) {
            break L299;
          } else {
            coa.field_n = jaa.a((byte) 112, var2);
            break L299;
          }
        }
        L300: {
          var2 = mt.a("msg_chosen_reward", (byte) 112);
          if (null == var2) {
            break L300;
          } else {
            fva.field_b = jaa.a((byte) 109, var2);
            break L300;
          }
        }
        L301: {
          var2 = mt.a("msg_didnt_choose_reward", (byte) 125);
          if (var2 != null) {
            oba.field_n = jaa.a((byte) 43, var2);
            break L301;
          } else {
            break L301;
          }
        }
        L302: {
          var2 = mt.a("roundover_winner", (byte) 123);
          if (null != var2) {
            ru.field_a = jaa.a((byte) 47, var2);
            break L302;
          } else {
            break L302;
          }
        }
        L303: {
          var2 = mt.a("gameover", (byte) 106);
          if (null != var2) {
            String discarded$39 = jaa.a((byte) 89, var2);
            break L303;
          } else {
            break L303;
          }
        }
        L304: {
          var2 = mt.a("gameover_aborted", (byte) 125);
          if (var2 != null) {
            String discarded$40 = jaa.a((byte) 66, var2);
            break L304;
          } else {
            break L304;
          }
        }
        L305: {
          var2 = mt.a("gameover_winner", (byte) 117);
          if (var2 == null) {
            break L305;
          } else {
            String discarded$41 = jaa.a((byte) 119, var2);
            break L305;
          }
        }
        L306: {
          var2 = mt.a("gameover_completed", (byte) 107);
          if (var2 == null) {
            break L306;
          } else {
            String discarded$42 = jaa.a((byte) 125, var2);
            break L306;
          }
        }
        L307: {
          var2 = mt.a("choose_character", (byte) 110);
          if (var2 == null) {
            break L307;
          } else {
            gta.field_a = jaa.a((byte) 107, var2);
            break L307;
          }
        }
        L308: {
          var2 = mt.a("choose_reward", (byte) 106);
          if (null != var2) {
            us.field_c = jaa.a((byte) 102, var2);
            break L308;
          } else {
            break L308;
          }
        }
        L309: {
          var2 = mt.a("choose_reward_timeleft", (byte) 124);
          if (var2 == null) {
            break L309;
          } else {
            tla.field_h = jaa.a((byte) 35, var2);
            break L309;
          }
        }
        L310: {
          var2 = mt.a("waiting_for_others", (byte) 126);
          if (var2 != null) {
            jsa.field_F = jaa.a((byte) 67, var2);
            break L310;
          } else {
            break L310;
          }
        }
        L311: {
          var2 = mt.a("waiting_for", (byte) 127);
          if (var2 == null) {
            break L311;
          } else {
            cba.field_c = jaa.a((byte) 28, var2);
            break L311;
          }
        }
        L312: {
          var2 = mt.a("time_remaining", (byte) 100);
          if (null == var2) {
            break L312;
          } else {
            String discarded$43 = jaa.a((byte) 44, var2);
            break L312;
          }
        }
        L313: {
          var2 = mt.a("finish_order", (byte) 112);
          if (null != var2) {
            rl.field_v = jaa.a((byte) 78, var2);
            break L313;
          } else {
            break L313;
          }
        }
        L314: {
          var2 = mt.a("spectator", (byte) 124);
          if (null != var2) {
            dpa.field_c = jaa.a((byte) 78, var2);
            break L314;
          } else {
            break L314;
          }
        }
        L315: {
          var2 = mt.a("watching", (byte) 113);
          if (null == var2) {
            break L315;
          } else {
            voa.field_q = jaa.a((byte) 71, var2);
            break L315;
          }
        }
        L316: {
          var2 = mt.a("round", (byte) 125);
          if (var2 == null) {
            break L316;
          } else {
            uqa.field_z = jaa.a((byte) 57, var2);
            break L316;
          }
        }
        L317: {
          var2 = mt.a("get_ready", (byte) 104);
          if (var2 != null) {
            hua.field_b = jaa.a((byte) 67, var2);
            break L317;
          } else {
            break L317;
          }
        }
        L318: {
          var2 = mt.a("gogogo", (byte) 106);
          if (var2 != null) {
            jh.field_J = jaa.a((byte) 73, var2);
            break L318;
          } else {
            break L318;
          }
        }
        L319: {
          var2 = mt.a("waiting_for_sync", (byte) 104);
          if (var2 == null) {
            break L319;
          } else {
            hu.field_d = jaa.a((byte) 87, var2);
            break L319;
          }
        }
        L320: {
          var2 = mt.a("treasure_values", (byte) 102);
          if (null == var2) {
            break L320;
          } else {
            wj.field_b = jaa.a((byte) 56, var2);
            break L320;
          }
        }
        L321: {
          var2 = mt.a("treasure_total", (byte) 126);
          if (null != var2) {
            rja.field_c = jaa.a((byte) 42, var2);
            break L321;
          } else {
            break L321;
          }
        }
        L322: {
          var2 = mt.a("points", (byte) 123);
          if (null == var2) {
            break L322;
          } else {
            nsa.field_f = jaa.a((byte) 93, var2);
            break L322;
          }
        }
        L323: {
          var2 = mt.a("room_points", (byte) 101);
          if (var2 == null) {
            break L323;
          } else {
            bca.field_c = jaa.a((byte) 43, var2);
            break L323;
          }
        }
        L324: {
          var2 = mt.a("room_complete_points", (byte) 121);
          if (null == var2) {
            break L324;
          } else {
            gla.field_q = jaa.a((byte) 107, var2);
            break L324;
          }
        }
        L325: {
          var2 = mt.a("room_complete_points_with_bonus", (byte) 121);
          if (null == var2) {
            break L325;
          } else {
            wpa.field_J = jaa.a((byte) 72, var2);
            break L325;
          }
        }
        L326: {
          var2 = mt.a("penalty_death", (byte) 125);
          if (null != var2) {
            uta.field_n = jaa.a((byte) 59, var2);
            break L326;
          } else {
            break L326;
          }
        }
        L327: {
          var2 = mt.a("penalty_reset", (byte) 117);
          if (null == var2) {
            break L327;
          } else {
            rf.field_a = jaa.a((byte) 92, var2);
            break L327;
          }
        }
        L328: {
          var2 = mt.a("final_score_colon", (byte) 107);
          if (var2 != null) {
            String discarded$44 = jaa.a((byte) 66, var2);
            break L328;
          } else {
            break L328;
          }
        }
        L329: {
          var2 = mt.a("powerdown_from", (byte) 103);
          if (var2 != null) {
            String discarded$45 = jaa.a((byte) 100, var2);
            break L329;
          } else {
            break L329;
          }
        }
        L330: {
          var2 = mt.a("powerdown_pending", (byte) 116);
          if (var2 != null) {
            String discarded$46 = jaa.a((byte) 115, var2);
            break L330;
          } else {
            break L330;
          }
        }
        L331: {
          var2 = mt.a("reward_coin15", (byte) 120);
          if (var2 == null) {
            break L331;
          } else {
            sea.field_p = jaa.a((byte) 92, var2);
            break L331;
          }
        }
        L332: {
          var2 = mt.a("reward_coin10", (byte) 115);
          if (var2 == null) {
            break L332;
          } else {
            mu.field_wb = jaa.a((byte) 124, var2);
            break L332;
          }
        }
        L333: {
          var2 = mt.a("reward_coin5", (byte) 108);
          if (null != var2) {
            so.field_J = jaa.a((byte) 27, var2);
            break L333;
          } else {
            break L333;
          }
        }
        L334: {
          var2 = mt.a("reward_bag2", (byte) 103);
          if (null == var2) {
            break L334;
          } else {
            tja.field_p = jaa.a((byte) 72, var2);
            break L334;
          }
        }
        L335: {
          var2 = mt.a("reward_bagx2", (byte) 124);
          if (null != var2) {
            sda.field_h = jaa.a((byte) 115, var2);
            break L335;
          } else {
            break L335;
          }
        }
        L336: {
          var2 = mt.a("reward_idol1", (byte) 101);
          if (var2 != null) {
            ds.field_k = jaa.a((byte) 123, var2);
            break L336;
          } else {
            break L336;
          }
        }
        L337: {
          var2 = mt.a("reward_idolx2", (byte) 105);
          if (null == var2) {
            break L337;
          } else {
            bha.field_x = jaa.a((byte) 46, var2);
            break L337;
          }
        }
        L338: {
          var2 = mt.a("reward_none", (byte) 127);
          if (null != var2) {
            String discarded$47 = jaa.a((byte) 63, var2);
            break L338;
          } else {
            break L338;
          }
        }
        L339: {
          var2 = mt.a("reward_taken", (byte) 119);
          if (var2 != null) {
            String discarded$48 = jaa.a((byte) 83, var2);
            break L339;
          } else {
            break L339;
          }
        }
        L340: {
          var2 = mt.a("reward_none_waiting", (byte) 116);
          if (var2 == null) {
            break L340;
          } else {
            g.field_i = jaa.a((byte) 35, var2);
            break L340;
          }
        }
        L341: {
          var2 = mt.a("reward_none_dnf", (byte) 123);
          if (null == var2) {
            break L341;
          } else {
            cs.field_b = jaa.a((byte) 104, var2);
            break L341;
          }
        }
        L342: {
          var2 = mt.a("reward_none_timeout", (byte) 121);
          if (var2 == null) {
            break L342;
          } else {
            cga.field_l = jaa.a((byte) 67, var2);
            break L342;
          }
        }
        L343: {
          var2 = mt.a("reward_none_choosing", (byte) 113);
          if (var2 != null) {
            bp.field_o = jaa.a((byte) 79, var2);
            break L343;
          } else {
            break L343;
          }
        }
        L344: {
          var2 = mt.a("unlock_character", (byte) 100);
          if (var2 == null) {
            break L344;
          } else {
            gv.field_v = jaa.a((byte) 86, var2);
            break L344;
          }
        }
        L345: {
          var2 = mt.a("unlock_tier", (byte) 109);
          if (var2 == null) {
            break L345;
          } else {
            r.field_k = jaa.a((byte) 94, var2);
            break L345;
          }
        }
        L346: {
          var2 = mt.a("name_ace", (byte) 124);
          if (null == var2) {
            break L346;
          } else {
            gh.field_e = jaa.a((byte) 126, var2);
            break L346;
          }
        }
        L347: {
          var2 = mt.a("name_angelio", (byte) 103);
          if (null != var2) {
            hra.field_a = jaa.a((byte) 71, var2);
            break L347;
          } else {
            break L347;
          }
        }
        L348: {
          var2 = mt.a("name_baroness", (byte) 109);
          if (var2 == null) {
            break L348;
          } else {
            poa.field_p = jaa.a((byte) 52, var2);
            break L348;
          }
        }
        L349: {
          var2 = mt.a("name_borees", (byte) 125);
          if (var2 != null) {
            kma.field_d = jaa.a((byte) 45, var2);
            break L349;
          } else {
            break L349;
          }
        }
        L350: {
          var2 = mt.a("name_bruce", (byte) 109);
          if (var2 != null) {
            dfa.field_a = jaa.a((byte) 62, var2);
            break L350;
          } else {
            break L350;
          }
        }
        L351: {
          var2 = mt.a("name_feng", (byte) 121);
          if (null != var2) {
            vg.field_b = jaa.a((byte) 90, var2);
            break L351;
          } else {
            break L351;
          }
        }
        L352: {
          var2 = mt.a("name_hans", (byte) 126);
          if (var2 != null) {
            pt.field_q = jaa.a((byte) 31, var2);
            break L352;
          } else {
            break L352;
          }
        }
        L353: {
          var2 = mt.a("name_henryj", (byte) 124);
          if (null == var2) {
            break L353;
          } else {
            iea.field_e = jaa.a((byte) 126, var2);
            break L353;
          }
        }
        L354: {
          var2 = mt.a("name_jamille", (byte) 113);
          if (var2 == null) {
            break L354;
          } else {
            sda.field_k = jaa.a((byte) 71, var2);
            break L354;
          }
        }
        L355: {
          var2 = mt.a("name_johnsson", (byte) 113);
          if (null != var2) {
            rha.field_h = jaa.a((byte) 34, var2);
            break L355;
          } else {
            break L355;
          }
        }
        L356: {
          var2 = mt.a("name_piles", (byte) 119);
          if (var2 != null) {
            pha.field_Ib = jaa.a((byte) 106, var2);
            break L356;
          } else {
            break L356;
          }
        }
        L357: {
          var2 = mt.a("name_scarlett", (byte) 117);
          if (null != var2) {
            msa.field_b = jaa.a((byte) 126, var2);
            break L357;
          } else {
            break L357;
          }
        }
        L358: {
          var2 = mt.a("name_wilbur", (byte) 119);
          if (null != var2) {
            tr.field_e = jaa.a((byte) 98, var2);
            break L358;
          } else {
            break L358;
          }
        }
        L359: {
          var2 = mt.a("death_unknown,0", (byte) 102);
          if (var2 != null) {
            kla.field_a[0] = jaa.a((byte) 59, var2);
            break L359;
          } else {
            break L359;
          }
        }
        L360: {
          var2 = mt.a("death_unknown,1", (byte) 104);
          if (var2 == null) {
            break L360;
          } else {
            kla.field_a[1] = jaa.a((byte) 116, var2);
            break L360;
          }
        }
        L361: {
          var2 = mt.a("death_unknown,2", (byte) 118);
          if (var2 == null) {
            break L361;
          } else {
            kla.field_a[2] = jaa.a((byte) 121, var2);
            break L361;
          }
        }
        L362: {
          var2 = mt.a("death_reset,0", (byte) 100);
          if (var2 == null) {
            break L362;
          } else {
            si.field_F[0] = jaa.a((byte) 127, var2);
            break L362;
          }
        }
        L363: {
          var2 = mt.a("death_reset,1", (byte) 102);
          if (null != var2) {
            si.field_F[1] = jaa.a((byte) 61, var2);
            break L363;
          } else {
            break L363;
          }
        }
        L364: {
          var2 = mt.a("death_reset,2", (byte) 108);
          if (null == var2) {
            break L364;
          } else {
            si.field_F[2] = jaa.a((byte) 89, var2);
            break L364;
          }
        }
        L365: {
          var2 = mt.a("death_reset,3", (byte) 107);
          if (var2 != null) {
            si.field_F[3] = jaa.a((byte) 37, var2);
            break L365;
          } else {
            break L365;
          }
        }
        L366: {
          var2 = mt.a("death_reset,4", (byte) 120);
          if (var2 != null) {
            si.field_F[4] = jaa.a((byte) 79, var2);
            break L366;
          } else {
            break L366;
          }
        }
        L367: {
          var2 = mt.a("death_reset,5", (byte) 105);
          if (var2 != null) {
            si.field_F[5] = jaa.a((byte) 108, var2);
            break L367;
          } else {
            break L367;
          }
        }
        L368: {
          var2 = mt.a("death_reset,6", (byte) 110);
          if (null != var2) {
            si.field_F[6] = jaa.a((byte) 90, var2);
            break L368;
          } else {
            break L368;
          }
        }
        L369: {
          var2 = mt.a("death_reset,7", (byte) 121);
          if (var2 != null) {
            si.field_F[7] = jaa.a((byte) 25, var2);
            break L369;
          } else {
            break L369;
          }
        }
        L370: {
          var2 = mt.a("death_reset,8", (byte) 123);
          if (var2 == null) {
            break L370;
          } else {
            si.field_F[8] = jaa.a((byte) 88, var2);
            break L370;
          }
        }
        L371: {
          var2 = mt.a("death_squishedhorizontal,0", (byte) 107);
          if (null != var2) {
            nta.field_b[0] = jaa.a((byte) 127, var2);
            break L371;
          } else {
            break L371;
          }
        }
        L372: {
          var2 = mt.a("death_squishedhorizontal,1", (byte) 119);
          if (var2 != null) {
            nta.field_b[1] = jaa.a((byte) 121, var2);
            break L372;
          } else {
            break L372;
          }
        }
        L373: {
          var2 = mt.a("death_squishedhorizontal,2", (byte) 117);
          if (null != var2) {
            nta.field_b[2] = jaa.a((byte) 42, var2);
            break L373;
          } else {
            break L373;
          }
        }
        L374: {
          var2 = mt.a("death_squishedhorizontal,3", (byte) 126);
          if (var2 != null) {
            nta.field_b[3] = jaa.a((byte) 32, var2);
            break L374;
          } else {
            break L374;
          }
        }
        L375: {
          var2 = mt.a("death_squishedhorizontal,4", (byte) 109);
          if (null != var2) {
            nta.field_b[4] = jaa.a((byte) 115, var2);
            break L375;
          } else {
            break L375;
          }
        }
        L376: {
          var2 = mt.a("death_squishedhorizontal,5", (byte) 118);
          if (var2 != null) {
            nta.field_b[5] = jaa.a((byte) 85, var2);
            break L376;
          } else {
            break L376;
          }
        }
        L377: {
          var2 = mt.a("death_squishedhorizontal,6", (byte) 126);
          if (var2 == null) {
            break L377;
          } else {
            nta.field_b[6] = jaa.a((byte) 100, var2);
            break L377;
          }
        }
        L378: {
          var2 = mt.a("death_squishedhorizontal,7", (byte) 118);
          if (var2 == null) {
            break L378;
          } else {
            nta.field_b[7] = jaa.a((byte) 27, var2);
            break L378;
          }
        }
        L379: {
          var2 = mt.a("death_squishedvertical,0", (byte) 125);
          if (null == var2) {
            break L379;
          } else {
            or.field_m[0] = jaa.a((byte) 98, var2);
            break L379;
          }
        }
        L380: {
          var2 = mt.a("death_squishedvertical,1", (byte) 103);
          if (var2 != null) {
            or.field_m[1] = jaa.a((byte) 36, var2);
            break L380;
          } else {
            break L380;
          }
        }
        L381: {
          var2 = mt.a("death_squishedvertical,2", (byte) 110);
          if (var2 != null) {
            or.field_m[2] = jaa.a((byte) 87, var2);
            break L381;
          } else {
            break L381;
          }
        }
        L382: {
          var2 = mt.a("death_squishedvertical,3", (byte) 117);
          if (var2 != null) {
            or.field_m[3] = jaa.a((byte) 113, var2);
            break L382;
          } else {
            break L382;
          }
        }
        L383: {
          var2 = mt.a("death_squishedvertical,4", (byte) 102);
          if (null != var2) {
            or.field_m[4] = jaa.a((byte) 120, var2);
            break L383;
          } else {
            break L383;
          }
        }
        L384: {
          var2 = mt.a("death_squishedvertical,5", (byte) 104);
          if (var2 == null) {
            break L384;
          } else {
            or.field_m[5] = jaa.a((byte) 99, var2);
            break L384;
          }
        }
        L385: {
          var2 = mt.a("death_squishedvertical,6", (byte) 109);
          if (null == var2) {
            break L385;
          } else {
            or.field_m[6] = jaa.a((byte) 96, var2);
            break L385;
          }
        }
        L386: {
          var2 = mt.a("death_fell,0", (byte) 121);
          if (var2 != null) {
            tia.field_c[0] = jaa.a((byte) 113, var2);
            break L386;
          } else {
            break L386;
          }
        }
        L387: {
          var2 = mt.a("death_fell,1", (byte) 101);
          if (null != var2) {
            tia.field_c[1] = jaa.a((byte) 59, var2);
            break L387;
          } else {
            break L387;
          }
        }
        L388: {
          var2 = mt.a("death_fell,2", (byte) 103);
          if (null != var2) {
            tia.field_c[2] = jaa.a((byte) 65, var2);
            break L388;
          } else {
            break L388;
          }
        }
        L389: {
          var2 = mt.a("death_fell,3", (byte) 117);
          if (null == var2) {
            break L389;
          } else {
            tia.field_c[3] = jaa.a((byte) 101, var2);
            break L389;
          }
        }
        L390: {
          var2 = mt.a("death_fell,4", (byte) 122);
          if (null != var2) {
            tia.field_c[4] = jaa.a((byte) 26, var2);
            break L390;
          } else {
            break L390;
          }
        }
        L391: {
          var2 = mt.a("death_fell,5", (byte) 122);
          if (null != var2) {
            tia.field_c[5] = jaa.a((byte) 75, var2);
            break L391;
          } else {
            break L391;
          }
        }
        L392: {
          var2 = mt.a("death_fell,6", (byte) 118);
          if (null == var2) {
            break L392;
          } else {
            tia.field_c[6] = jaa.a((byte) 114, var2);
            break L392;
          }
        }
        L393: {
          var2 = mt.a("death_fell,7", (byte) 112);
          if (null != var2) {
            tia.field_c[7] = jaa.a((byte) 38, var2);
            break L393;
          } else {
            break L393;
          }
        }
        L394: {
          var2 = mt.a("death_lava,0", (byte) 100);
          if (var2 == null) {
            break L394;
          } else {
            up.field_d[0] = jaa.a((byte) 51, var2);
            break L394;
          }
        }
        L395: {
          var2 = mt.a("death_lava,1", (byte) 124);
          if (null != var2) {
            up.field_d[1] = jaa.a((byte) 81, var2);
            break L395;
          } else {
            break L395;
          }
        }
        L396: {
          var2 = mt.a("death_lava,2", (byte) 110);
          if (null == var2) {
            break L396;
          } else {
            up.field_d[2] = jaa.a((byte) 74, var2);
            break L396;
          }
        }
        L397: {
          var2 = mt.a("death_lava,3", (byte) 121);
          if (var2 == null) {
            break L397;
          } else {
            up.field_d[3] = jaa.a((byte) 115, var2);
            break L397;
          }
        }
        L398: {
          var2 = mt.a("death_lava,4", (byte) 123);
          if (null != var2) {
            up.field_d[4] = jaa.a((byte) 51, var2);
            break L398;
          } else {
            break L398;
          }
        }
        L399: {
          var2 = mt.a("death_lava,5", (byte) 113);
          if (var2 == null) {
            break L399;
          } else {
            up.field_d[5] = jaa.a((byte) 110, var2);
            break L399;
          }
        }
        L400: {
          var2 = mt.a("death_snake,0", (byte) 101);
          if (var2 != null) {
            fpa.field_b[0] = jaa.a((byte) 109, var2);
            break L400;
          } else {
            break L400;
          }
        }
        L401: {
          var2 = mt.a("death_snake,1", (byte) 116);
          if (null == var2) {
            break L401;
          } else {
            fpa.field_b[1] = jaa.a((byte) 89, var2);
            break L401;
          }
        }
        L402: {
          var2 = mt.a("death_snake,2", (byte) 101);
          if (var2 == null) {
            break L402;
          } else {
            fpa.field_b[2] = jaa.a((byte) 30, var2);
            break L402;
          }
        }
        L403: {
          var2 = mt.a("death_snake,3", (byte) 111);
          if (var2 == null) {
            break L403;
          } else {
            fpa.field_b[3] = jaa.a((byte) 121, var2);
            break L403;
          }
        }
        L404: {
          var2 = mt.a("death_snake,4", (byte) 107);
          if (var2 == null) {
            break L404;
          } else {
            fpa.field_b[4] = jaa.a((byte) 93, var2);
            break L404;
          }
        }
        L405: {
          var2 = mt.a("death_snake,5", (byte) 126);
          if (var2 != null) {
            fpa.field_b[5] = jaa.a((byte) 126, var2);
            break L405;
          } else {
            break L405;
          }
        }
        L406: {
          var2 = mt.a("death_snake,6", (byte) 116);
          if (null == var2) {
            break L406;
          } else {
            fpa.field_b[6] = jaa.a((byte) 31, var2);
            break L406;
          }
        }
        L407: {
          var2 = mt.a("death_skeleton,0", (byte) 117);
          if (null != var2) {
            gca.field_j[0] = jaa.a((byte) 69, var2);
            break L407;
          } else {
            break L407;
          }
        }
        L408: {
          var2 = mt.a("death_skeleton,1", (byte) 101);
          if (null == var2) {
            break L408;
          } else {
            gca.field_j[1] = jaa.a((byte) 113, var2);
            break L408;
          }
        }
        L409: {
          var2 = mt.a("death_skeleton,2", (byte) 106);
          if (null != var2) {
            gca.field_j[2] = jaa.a((byte) 79, var2);
            break L409;
          } else {
            break L409;
          }
        }
        L410: {
          var2 = mt.a("death_skeleton,3", (byte) 109);
          if (var2 == null) {
            break L410;
          } else {
            gca.field_j[3] = jaa.a((byte) 60, var2);
            break L410;
          }
        }
        L411: {
          var2 = mt.a("death_skeleton,4", (byte) 107);
          if (var2 == null) {
            break L411;
          } else {
            gca.field_j[4] = jaa.a((byte) 69, var2);
            break L411;
          }
        }
        L412: {
          var2 = mt.a("death_skeleton,5", (byte) 121);
          if (null == var2) {
            break L412;
          } else {
            gca.field_j[5] = jaa.a((byte) 120, var2);
            break L412;
          }
        }
        L413: {
          var2 = mt.a("death_skeleton,6", (byte) 118);
          if (null == var2) {
            break L413;
          } else {
            gca.field_j[6] = jaa.a((byte) 37, var2);
            break L413;
          }
        }
        L414: {
          var2 = mt.a("death_skeleton,7", (byte) 102);
          if (var2 != null) {
            gca.field_j[7] = jaa.a((byte) 87, var2);
            break L414;
          } else {
            break L414;
          }
        }
        L415: {
          var2 = mt.a("death_skeleton,8", (byte) 113);
          if (var2 == null) {
            break L415;
          } else {
            gca.field_j[8] = jaa.a((byte) 71, var2);
            break L415;
          }
        }
        L416: {
          var2 = mt.a("death_dart,0", (byte) 100);
          if (null != var2) {
            vua.field_D[0] = jaa.a((byte) 54, var2);
            break L416;
          } else {
            break L416;
          }
        }
        L417: {
          var2 = mt.a("death_dart,1", (byte) 102);
          if (var2 == null) {
            break L417;
          } else {
            vua.field_D[1] = jaa.a((byte) 124, var2);
            break L417;
          }
        }
        L418: {
          var2 = mt.a("death_dart,2", (byte) 117);
          if (var2 != null) {
            vua.field_D[2] = jaa.a((byte) 96, var2);
            break L418;
          } else {
            break L418;
          }
        }
        L419: {
          var2 = mt.a("death_dart,3", (byte) 112);
          if (var2 == null) {
            break L419;
          } else {
            vua.field_D[3] = jaa.a((byte) 100, var2);
            break L419;
          }
        }
        L420: {
          var2 = mt.a("death_dart,4", (byte) 116);
          if (var2 != null) {
            vua.field_D[4] = jaa.a((byte) 63, var2);
            break L420;
          } else {
            break L420;
          }
        }
        L421: {
          var2 = mt.a("death_littlesaw,0", (byte) 127);
          if (null != var2) {
            hg.field_c[0] = jaa.a((byte) 104, var2);
            break L421;
          } else {
            break L421;
          }
        }
        L422: {
          var2 = mt.a("death_littlesaw,1", (byte) 123);
          if (var2 != null) {
            hg.field_c[1] = jaa.a((byte) 53, var2);
            break L422;
          } else {
            break L422;
          }
        }
        L423: {
          var2 = mt.a("death_littlesaw,2", (byte) 110);
          if (null != var2) {
            hg.field_c[2] = jaa.a((byte) 108, var2);
            break L423;
          } else {
            break L423;
          }
        }
        L424: {
          var2 = mt.a("death_littlesaw,3", (byte) 126);
          if (var2 != null) {
            hg.field_c[3] = jaa.a((byte) 54, var2);
            break L424;
          } else {
            break L424;
          }
        }
        L425: {
          var2 = mt.a("death_littlesaw,4", (byte) 110);
          if (null != var2) {
            hg.field_c[4] = jaa.a((byte) 117, var2);
            break L425;
          } else {
            break L425;
          }
        }
        L426: {
          var2 = mt.a("death_littlesaw,5", (byte) 114);
          if (var2 == null) {
            break L426;
          } else {
            hg.field_c[5] = jaa.a((byte) 120, var2);
            break L426;
          }
        }
        L427: {
          var2 = mt.a("death_bullet,0", (byte) 109);
          if (var2 != null) {
            jr.field_j[0] = jaa.a((byte) 106, var2);
            break L427;
          } else {
            break L427;
          }
        }
        L428: {
          var2 = mt.a("death_bullet,1", (byte) 101);
          if (var2 == null) {
            break L428;
          } else {
            jr.field_j[1] = jaa.a((byte) 36, var2);
            break L428;
          }
        }
        L429: {
          var2 = mt.a("death_bullet,2", (byte) 107);
          if (null != var2) {
            jr.field_j[2] = jaa.a((byte) 108, var2);
            break L429;
          } else {
            break L429;
          }
        }
        L430: {
          var2 = mt.a("death_bullet,3", (byte) 127);
          if (null == var2) {
            break L430;
          } else {
            jr.field_j[3] = jaa.a((byte) 74, var2);
            break L430;
          }
        }
        L431: {
          var2 = mt.a("death_flame,0", (byte) 112);
          if (var2 != null) {
            fqa.field_F[0] = jaa.a((byte) 55, var2);
            break L431;
          } else {
            break L431;
          }
        }
        L432: {
          var2 = mt.a("death_flame,1", (byte) 105);
          if (var2 != null) {
            fqa.field_F[1] = jaa.a((byte) 105, var2);
            break L432;
          } else {
            break L432;
          }
        }
        L433: {
          var2 = mt.a("death_flame,2", (byte) 111);
          if (null != var2) {
            fqa.field_F[2] = jaa.a((byte) 121, var2);
            break L433;
          } else {
            break L433;
          }
        }
        L434: {
          var2 = mt.a("death_flame,3", (byte) 100);
          if (null == var2) {
            break L434;
          } else {
            fqa.field_F[3] = jaa.a((byte) 103, var2);
            break L434;
          }
        }
        L435: {
          var2 = mt.a("death_flame,4", (byte) 101);
          if (null == var2) {
            break L435;
          } else {
            fqa.field_F[4] = jaa.a((byte) 78, var2);
            break L435;
          }
        }
        L436: {
          var2 = mt.a("death_flame,5", (byte) 117);
          if (null == var2) {
            break L436;
          } else {
            fqa.field_F[5] = jaa.a((byte) 115, var2);
            break L436;
          }
        }
        L437: {
          var2 = mt.a("death_flame,6", (byte) 118);
          if (var2 != null) {
            fqa.field_F[6] = jaa.a((byte) 32, var2);
            break L437;
          } else {
            break L437;
          }
        }
        L438: {
          var2 = mt.a("death_flame,7", (byte) 119);
          if (var2 != null) {
            fqa.field_F[7] = jaa.a((byte) 107, var2);
            break L438;
          } else {
            break L438;
          }
        }
        L439: {
          var2 = mt.a("death_flame,8", (byte) 124);
          if (var2 != null) {
            fqa.field_F[8] = jaa.a((byte) 77, var2);
            break L439;
          } else {
            break L439;
          }
        }
        L440: {
          var2 = mt.a("death_flame,9", (byte) 109);
          if (null != var2) {
            fqa.field_F[9] = jaa.a((byte) 72, var2);
            break L440;
          } else {
            break L440;
          }
        }
        L441: {
          var2 = mt.a("death_flame,10", (byte) 125);
          if (var2 != null) {
            fqa.field_F[10] = jaa.a((byte) 40, var2);
            break L441;
          } else {
            break L441;
          }
        }
        L442: {
          var2 = mt.a("death_flame,11", (byte) 118);
          if (var2 == null) {
            break L442;
          } else {
            fqa.field_F[11] = jaa.a((byte) 93, var2);
            break L442;
          }
        }
        L443: {
          var2 = mt.a("death_flame,12", (byte) 123);
          if (null != var2) {
            fqa.field_F[12] = jaa.a((byte) 110, var2);
            break L443;
          } else {
            break L443;
          }
        }
        L444: {
          var2 = mt.a("death_flame,13", (byte) 105);
          if (null != var2) {
            fqa.field_F[13] = jaa.a((byte) 50, var2);
            break L444;
          } else {
            break L444;
          }
        }
        L445: {
          var2 = mt.a("death_laser,0", (byte) 117);
          if (var2 == null) {
            break L445;
          } else {
            id.field_g[0] = jaa.a((byte) 47, var2);
            break L445;
          }
        }
        L446: {
          var2 = mt.a("death_laser,1", (byte) 109);
          if (null != var2) {
            id.field_g[1] = jaa.a((byte) 55, var2);
            break L446;
          } else {
            break L446;
          }
        }
        L447: {
          var2 = mt.a("death_laser,2", (byte) 108);
          if (var2 == null) {
            break L447;
          } else {
            id.field_g[2] = jaa.a((byte) 95, var2);
            break L447;
          }
        }
        L448: {
          var2 = mt.a("death_laser,3", (byte) 124);
          if (null == var2) {
            break L448;
          } else {
            id.field_g[3] = jaa.a((byte) 111, var2);
            break L448;
          }
        }
        L449: {
          var2 = mt.a("death_laser,4", (byte) 114);
          if (null == var2) {
            break L449;
          } else {
            id.field_g[4] = jaa.a((byte) 81, var2);
            break L449;
          }
        }
        L450: {
          var2 = mt.a("death_laser,5", (byte) 119);
          if (null == var2) {
            break L450;
          } else {
            id.field_g[5] = jaa.a((byte) 54, var2);
            break L450;
          }
        }
        L451: {
          var2 = mt.a("death_boulder,0", (byte) 111);
          if (var2 == null) {
            break L451;
          } else {
            vk.field_c[0] = jaa.a((byte) 72, var2);
            break L451;
          }
        }
        L452: {
          var2 = mt.a("death_boulder,1", (byte) 102);
          if (null != var2) {
            vk.field_c[1] = jaa.a((byte) 122, var2);
            break L452;
          } else {
            break L452;
          }
        }
        L453: {
          var2 = mt.a("death_boulder,2", (byte) 113);
          if (var2 == null) {
            break L453;
          } else {
            vk.field_c[2] = jaa.a((byte) 111, var2);
            break L453;
          }
        }
        L454: {
          var2 = mt.a("death_boulder,3", (byte) 121);
          if (null != var2) {
            vk.field_c[3] = jaa.a((byte) 85, var2);
            break L454;
          } else {
            break L454;
          }
        }
        L455: {
          var2 = mt.a("death_boulder,4", (byte) 109);
          if (var2 != null) {
            vk.field_c[4] = jaa.a((byte) 101, var2);
            break L455;
          } else {
            break L455;
          }
        }
        L456: {
          var2 = mt.a("death_boulder,5", (byte) 123);
          if (var2 == null) {
            break L456;
          } else {
            vk.field_c[5] = jaa.a((byte) 55, var2);
            break L456;
          }
        }
        L457: {
          var2 = mt.a("death_boulder,6", (byte) 111);
          if (var2 != null) {
            vk.field_c[6] = jaa.a((byte) 69, var2);
            break L457;
          } else {
            break L457;
          }
        }
        L458: {
          var2 = mt.a("death_bigsaw,0", (byte) 113);
          if (var2 != null) {
            qr.field_u[0] = jaa.a((byte) 107, var2);
            break L458;
          } else {
            break L458;
          }
        }
        L459: {
          var2 = mt.a("death_bigsaw,1", (byte) 105);
          if (var2 == null) {
            break L459;
          } else {
            qr.field_u[1] = jaa.a((byte) 118, var2);
            break L459;
          }
        }
        L460: {
          var2 = mt.a("death_bigsaw,2", (byte) 102);
          if (var2 != null) {
            qr.field_u[2] = jaa.a((byte) 103, var2);
            break L460;
          } else {
            break L460;
          }
        }
        L461: {
          var2 = mt.a("death_bigsaw,3", (byte) 108);
          if (var2 != null) {
            qr.field_u[3] = jaa.a((byte) 41, var2);
            break L461;
          } else {
            break L461;
          }
        }
        L462: {
          var2 = mt.a("death_bigsaw,4", (byte) 116);
          if (var2 == null) {
            break L462;
          } else {
            qr.field_u[4] = jaa.a((byte) 62, var2);
            break L462;
          }
        }
        L463: {
          var2 = mt.a("death_bigsaw,5", (byte) 126);
          if (null == var2) {
            break L463;
          } else {
            qr.field_u[5] = jaa.a((byte) 80, var2);
            break L463;
          }
        }
        L464: {
          var2 = mt.a("death_bigsaw,6", (byte) 102);
          if (var2 != null) {
            qr.field_u[6] = jaa.a((byte) 60, var2);
            break L464;
          } else {
            break L464;
          }
        }
        L465: {
          var2 = mt.a("death_bigsaw,7", (byte) 116);
          if (var2 != null) {
            qr.field_u[7] = jaa.a((byte) 75, var2);
            break L465;
          } else {
            break L465;
          }
        }
        L466: {
          var2 = mt.a("death_skiproom,0", (byte) 117);
          if (var2 == null) {
            break L466;
          } else {
            dta.field_d[0] = jaa.a((byte) 111, var2);
            break L466;
          }
        }
        L467: {
          var2 = mt.a("death_skiproom,1", (byte) 107);
          if (var2 != null) {
            dta.field_d[1] = jaa.a((byte) 59, var2);
            break L467;
          } else {
            break L467;
          }
        }
        L468: {
          var2 = mt.a("death_skiproom,2", (byte) 112);
          if (var2 != null) {
            dta.field_d[2] = jaa.a((byte) 105, var2);
            break L468;
          } else {
            break L468;
          }
        }
        L469: {
          var2 = mt.a("death_skiproom,3", (byte) 101);
          if (var2 == null) {
            break L469;
          } else {
            dta.field_d[3] = jaa.a((byte) 28, var2);
            break L469;
          }
        }
        L470: {
          var2 = mt.a("death_skiproom,4", (byte) 100);
          if (null == var2) {
            break L470;
          } else {
            dta.field_d[4] = jaa.a((byte) 58, var2);
            break L470;
          }
        }
        L471: {
          var2 = mt.a("death_gas,0", (byte) 115);
          if (var2 == null) {
            break L471;
          } else {
            fe.field_A[0] = jaa.a((byte) 85, var2);
            break L471;
          }
        }
        L472: {
          var2 = mt.a("death_gas,1", (byte) 107);
          if (var2 == null) {
            break L472;
          } else {
            fe.field_A[1] = jaa.a((byte) 91, var2);
            break L472;
          }
        }
        L473: {
          var2 = mt.a("death_gas,2", (byte) 115);
          if (null == var2) {
            break L473;
          } else {
            fe.field_A[2] = jaa.a((byte) 40, var2);
            break L473;
          }
        }
        L474: {
          var2 = mt.a("death_gas,3", (byte) 119);
          if (var2 != null) {
            fe.field_A[3] = jaa.a((byte) 48, var2);
            break L474;
          } else {
            break L474;
          }
        }
        L475: {
          var2 = mt.a("next_round", (byte) 127);
          if (null == var2) {
            break L475;
          } else {
            String discarded$49 = jaa.a((byte) 105, var2);
            break L475;
          }
        }
        L476: {
          var2 = mt.a("gameoptlabels,0", (byte) 122);
          if (var2 == null) {
            break L476;
          } else {
            mga.field_f[0] = jaa.a((byte) 101, var2);
            break L476;
          }
        }
        L477: {
          var2 = mt.a("gameoptlabels,1", (byte) 103);
          if (var2 == null) {
            break L477;
          } else {
            mga.field_f[1] = jaa.a((byte) 44, var2);
            break L477;
          }
        }
        L478: {
          var2 = mt.a("gameoptnames,0,0", (byte) 109);
          if (null != var2) {
            via.field_c[0][0] = jaa.a((byte) 78, var2);
            break L478;
          } else {
            break L478;
          }
        }
        L479: {
          var2 = mt.a("gameoptnames,0,1", (byte) 118);
          if (var2 != null) {
            via.field_c[0][1] = jaa.a((byte) 83, var2);
            break L479;
          } else {
            break L479;
          }
        }
        L480: {
          var2 = mt.a("gameoptnames,0,2", (byte) 102);
          if (null != var2) {
            via.field_c[0][2] = jaa.a((byte) 88, var2);
            break L480;
          } else {
            break L480;
          }
        }
        L481: {
          var2 = mt.a("gameoptnames,0,3", (byte) 109);
          if (null != var2) {
            via.field_c[0][3] = jaa.a((byte) 81, var2);
            break L481;
          } else {
            break L481;
          }
        }
        L482: {
          var2 = mt.a("gameoptnames,1,0", (byte) 122);
          if (null == var2) {
            break L482;
          } else {
            via.field_c[1][0] = jaa.a((byte) 117, var2);
            break L482;
          }
        }
        L483: {
          var2 = mt.a("gameoptnames,1,1", (byte) 120);
          if (null != var2) {
            via.field_c[1][1] = jaa.a((byte) 41, var2);
            break L483;
          } else {
            break L483;
          }
        }
        L484: {
          var2 = mt.a("gameopttooltips,0,0", (byte) 110);
          if (null != var2) {
            qaa.field_a[0][0] = jaa.a((byte) 68, var2);
            break L484;
          } else {
            break L484;
          }
        }
        L485: {
          var2 = mt.a("gameopttooltips,0,1", (byte) 106);
          if (var2 == null) {
            break L485;
          } else {
            qaa.field_a[0][1] = jaa.a((byte) 58, var2);
            break L485;
          }
        }
        L486: {
          var2 = mt.a("gameopttooltips,0,2", (byte) 112);
          if (var2 != null) {
            qaa.field_a[0][2] = jaa.a((byte) 66, var2);
            break L486;
          } else {
            break L486;
          }
        }
        L487: {
          var2 = mt.a("gameopttooltips,0,3", (byte) 111);
          if (var2 == null) {
            break L487;
          } else {
            qaa.field_a[0][3] = jaa.a((byte) 46, var2);
            break L487;
          }
        }
        L488: {
          var2 = mt.a("gameopttooltips,1,0", (byte) 105);
          if (null == var2) {
            break L488;
          } else {
            qaa.field_a[1][0] = jaa.a((byte) 52, var2);
            break L488;
          }
        }
        L489: {
          var2 = mt.a("gameopttooltips,1,1", (byte) 111);
          if (null == var2) {
            break L489;
          } else {
            qaa.field_a[1][1] = jaa.a((byte) 57, var2);
            break L489;
          }
        }
        L490: {
          var2 = mt.a("tomb_names,0", (byte) 117);
          if (var2 != null) {
            vj.field_d[0] = jaa.a((byte) 95, var2);
            break L490;
          } else {
            break L490;
          }
        }
        L491: {
          var2 = mt.a("tomb_names,1", (byte) 124);
          if (null == var2) {
            break L491;
          } else {
            vj.field_d[1] = jaa.a((byte) 50, var2);
            break L491;
          }
        }
        L492: {
          var2 = mt.a("tomb_names,2", (byte) 107);
          if (var2 != null) {
            vj.field_d[2] = jaa.a((byte) 87, var2);
            break L492;
          } else {
            break L492;
          }
        }
        L493: {
          var2 = mt.a("tomb_names,3", (byte) 120);
          if (var2 != null) {
            vj.field_d[3] = jaa.a((byte) 59, var2);
            break L493;
          } else {
            break L493;
          }
        }
        L494: {
          var2 = mt.a("tomb_names,4", (byte) 111);
          if (null == var2) {
            break L494;
          } else {
            vj.field_d[4] = jaa.a((byte) 106, var2);
            break L494;
          }
        }
        L495: {
          var2 = mt.a("tomb_names,5", (byte) 116);
          if (null != var2) {
            vj.field_d[5] = jaa.a((byte) 36, var2);
            break L495;
          } else {
            break L495;
          }
        }
        L496: {
          var2 = mt.a("tomb_names,6", (byte) 100);
          if (null == var2) {
            break L496;
          } else {
            vj.field_d[6] = jaa.a((byte) 40, var2);
            break L496;
          }
        }
        L497: {
          var2 = mt.a("tomb_names,7", (byte) 125);
          if (null != var2) {
            vj.field_d[7] = jaa.a((byte) 80, var2);
            break L497;
          } else {
            break L497;
          }
        }
        L498: {
          var2 = mt.a("tomb_names,8", (byte) 118);
          if (var2 != null) {
            vj.field_d[8] = jaa.a((byte) 73, var2);
            break L498;
          } else {
            break L498;
          }
        }
        L499: {
          var2 = mt.a("multiplayer_lobby", (byte) 125);
          if (null != var2) {
            ol.field_a = jaa.a((byte) 58, var2);
            break L499;
          } else {
            break L499;
          }
        }
        L500: {
          var2 = mt.a("options", (byte) 100);
          if (var2 != null) {
            wc.field_d = jaa.a((byte) 126, var2);
            break L500;
          } else {
            break L500;
          }
        }
        L501: {
          var2 = mt.a("enter_tomb", (byte) 108);
          if (null == var2) {
            break L501;
          } else {
            ue.field_t = jaa.a((byte) 91, var2);
            break L501;
          }
        }
        L502: {
          var2 = mt.a("bonus", (byte) 102);
          if (var2 != null) {
            bd.field_j = jaa.a((byte) 71, var2);
            break L502;
          } else {
            break L502;
          }
        }
        L503: {
          var2 = mt.a("no_medal", (byte) 116);
          if (null == var2) {
            break L503;
          } else {
            hb.field_v = jaa.a((byte) 96, var2);
            break L503;
          }
        }
        L504: {
          var2 = mt.a("gold_medal", (byte) 101);
          if (null != var2) {
            uaa.field_d = jaa.a((byte) 39, var2);
            break L504;
          } else {
            break L504;
          }
        }
        L505: {
          var2 = mt.a("silver_medal", (byte) 117);
          if (null != var2) {
            qna.field_c = jaa.a((byte) 72, var2);
            break L505;
          } else {
            break L505;
          }
        }
        L506: {
          var2 = mt.a("bronze_medal", (byte) 118);
          if (var2 == null) {
            break L506;
          } else {
            ps.field_P = jaa.a((byte) 109, var2);
            break L506;
          }
        }
        L507: {
          var2 = mt.a("previous_member", (byte) 102);
          if (null == var2) {
            break L507;
          } else {
            qu.field_c = jaa.a((byte) 25, var2);
            break L507;
          }
        }
        L508: {
          var2 = mt.a("freecontent_compelted", (byte) 125);
          if (null == var2) {
            break L508;
          } else {
            tna.field_d = jaa.a((byte) 119, var2);
            break L508;
          }
        }
        L509: {
          var2 = mt.a("justplay", (byte) 109);
          if (null != var2) {
            tc.field_f = jaa.a((byte) 54, var2);
            break L509;
          } else {
            break L509;
          }
        }
        L510: {
          var2 = mt.a("adding_coins", (byte) 102);
          if (null != var2) {
            String discarded$50 = jaa.a((byte) 56, var2);
            break L510;
          } else {
            break L510;
          }
        }
        L511: {
          var2 = mt.a("adding_lootbags", (byte) 112);
          if (var2 != null) {
            String discarded$51 = jaa.a((byte) 53, var2);
            break L511;
          } else {
            break L511;
          }
        }
        L512: {
          var2 = mt.a("adding_idols", (byte) 125);
          if (null != var2) {
            String discarded$52 = jaa.a((byte) 125, var2);
            break L512;
          } else {
            break L512;
          }
        }
        L513: {
          var2 = mt.a("points_coins", (byte) 108);
          if (var2 == null) {
            break L513;
          } else {
            String discarded$53 = jaa.a((byte) 108, var2);
            break L513;
          }
        }
        L514: {
          var2 = mt.a("points_lootbags", (byte) 106);
          if (null == var2) {
            break L514;
          } else {
            String discarded$54 = jaa.a((byte) 107, var2);
            break L514;
          }
        }
        L515: {
          var2 = mt.a("points_idols", (byte) 101);
          if (null != var2) {
            String discarded$55 = jaa.a((byte) 108, var2);
            break L515;
          } else {
            break L515;
          }
        }
        L516: {
          var2 = mt.a("restart_world", (byte) 102);
          if (null == var2) {
            break L516;
          } else {
            ng.field_e = jaa.a((byte) 52, var2);
            break L516;
          }
        }
        L517: {
          var2 = mt.a("spectator_controls", (byte) 111);
          if (var2 != null) {
            tp.field_J = jaa.a((byte) 71, var2);
            break L517;
          } else {
            break L517;
          }
        }
        L518: {
          var2 = mt.a("game_end_iminent", (byte) 121);
          if (var2 != null) {
            dw.field_j = jaa.a((byte) 105, var2);
            break L518;
          } else {
            break L518;
          }
        }
        L519: {
          var2 = mt.a("phaseEnd_mybest", (byte) 104);
          if (null != var2) {
            lea.field_F = jaa.a((byte) 43, var2);
            break L519;
          } else {
            break L519;
          }
        }
        L520: {
          var2 = mt.a("phaseEnd_friendsbest", (byte) 116);
          if (null != var2) {
            qw.field_g = jaa.a((byte) 39, var2);
            break L520;
          } else {
            break L520;
          }
        }
        fs.field_p = null;
        L521: {
          if (!jna.field_m) {
            break L521;
          } else {
            L522: {
              if (var4 == 0) {
                stackOut_1309_0 = 1;
                stackIn_1310_0 = stackOut_1309_0;
                break L522;
              } else {
                stackOut_1308_0 = 0;
                stackIn_1310_0 = stackOut_1308_0;
                break L522;
              }
            }
            TombRacer.field_G = stackIn_1310_0 != 0;
            break L521;
          }
        }
    }

    final void b(byte param0, int param1) {
        if (param0 != 58) {
            return;
        }
        try {
            ((pfa) this).a(-28562, hq.field_b[param1] << 16, jw.field_z[param1] << 16);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pfa.F(" + param0 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        wk var2_ref = null;
        int var3 = 0;
        bua stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        bua stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        bua stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        RuntimeException decompiledCaughtException = null;
        bua stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        bua stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        bua stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        try {
          L0: {
            if (param0) {
              L1: {
                L2: {
                  if (((pfa) this).field_f.a((byte) -16) <= 0) {
                    break L2;
                  } else {
                    L3: {
                      if (!((pfa) this).field_g) {
                        ((pfa) this).field_c.a(((pfa) this).field_d, false, 0, 1, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      ((pfa) this).field_g = true;
                      var2_ref = (wk) (Object) ((pfa) this).field_f.f(-80);
                      if (var2_ref.field_j) {
                        break L4;
                      } else {
                        var2_ref.a(0, ((pfa) this).field_j, ((pfa) this).field_e);
                        var2_ref.field_j = true;
                        break L4;
                      }
                    }
                    L5: {
                      ((pfa) this).field_j = ((pfa) this).field_j + var2_ref.field_l;
                      ((pfa) this).field_e = ((pfa) this).field_e + var2_ref.field_f;
                      ((pfa) this).field_h = var2_ref.field_h;
                      var3 = 327680;
                      if (((pfa) this).field_j < var2_ref.field_g - var3) {
                        break L5;
                      } else {
                        if (var3 + var2_ref.field_g < ((pfa) this).field_j) {
                          break L5;
                        } else {
                          if (~(var2_ref.field_k - var3) < ~((pfa) this).field_e) {
                            break L5;
                          } else {
                            if (((pfa) this).field_e > var2_ref.field_k - -var3) {
                              break L5;
                            } else {
                              ((pfa) this).field_j = var2_ref.field_g;
                              ((pfa) this).field_e = var2_ref.field_k;
                              var2_ref.p(10);
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (!TombRacer.field_G) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((pfa) this).field_g) {
                  L6: {
                    stackOut_30_0 = ((pfa) this).field_c;
                    stackOut_30_1 = ((pfa) this).field_d;
                    stackIn_33_0 = stackOut_30_0;
                    stackIn_33_1 = stackOut_30_1;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    if (param0) {
                      stackOut_33_0 = (bua) (Object) stackIn_33_0;
                      stackOut_33_1 = stackIn_33_1;
                      stackOut_33_2 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      break L6;
                    } else {
                      stackOut_31_0 = (bua) (Object) stackIn_31_0;
                      stackOut_31_1 = stackIn_31_1;
                      stackOut_31_2 = 1;
                      stackIn_34_0 = stackOut_31_0;
                      stackIn_34_1 = stackOut_31_1;
                      stackIn_34_2 = stackOut_31_2;
                      break L6;
                    }
                  }
                  ((bua) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2 != 0, 0, 0, true);
                  ((pfa) this).field_h = 0;
                  ((pfa) this).field_g = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((pfa) this).field_c.a(0);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "pfa.C(" + param0 + 41);
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        wk var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new wk();
              var4.field_g = param2;
              var4.field_k = param1;
              if (param0 == -28562) {
                break L1;
              } else {
                ((pfa) this).b(96, -22, 33);
                break L1;
              }
            }
            ((pfa) this).field_f.b((byte) -79, (vg) (Object) var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "pfa.E(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b(int param0) {
        try {
            field_b = null;
            field_a = null;
            field_i = null;
            if (param0 != 4) {
                pfa.a((cn) null, 68);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pfa.A(" + param0 + 41);
        }
    }

    final boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 79) {
                break L1;
              } else {
                ((pfa) this).field_c = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (~(jw.field_z[param1] << 16) != ~((pfa) this).field_j) {
                  break L3;
                } else {
                  if (((pfa) this).field_e != hq.field_b[param1] << 16) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "pfa.H(" + param0 + 44 + param1 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        try {
            hp.a(2048, ((pfa) this).field_h, 1900, ((pfa) this).field_c.b((byte) 74), param1 ^ -1918096900, 10 + ((((pfa) this).field_e >> 16) + param0), (((pfa) this).field_j >> 16) + param2 + 18);
            if (param1 != 11327) {
                ((pfa) this).a(73, (byte) 91);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pfa.I(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -98) {
                break L1;
              } else {
                boolean discarded$2 = ((pfa) this).a((byte) -74, -14);
                break L1;
              }
            }
            ((pfa) this).field_j = jw.field_z[param0] << 16;
            ((pfa) this).field_e = hq.field_b[param0] << 16;
            ((pfa) this).field_f.d(8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3, "pfa.D(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        bd var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = (bd) (Object) gg.field_e.c((byte) 22);
              if (param0 == 1) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            if (null == var1) {
              throw new IllegalStateException();
            } else {
              bea.a(var1.field_g, var1.field_m, var1.field_l);
              bea.b(var1.field_n, var1.field_k, var1.field_h, var1.field_f);
              var1.field_g = null;
              vt.field_a.b((byte) -67, (vg) (Object) var1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "pfa.G(" + param0 + 41);
        }
    }

    pfa(int param0, int param1) {
        try {
            ((pfa) this).field_d = param0;
            ((pfa) this).field_c = new bua(0, ((pfa) this).field_d, 1);
            ((pfa) this).field_c.a(((pfa) this).field_d, false, 0, 0, true);
            ((pfa) this).field_j = jw.field_z[param1] << 16;
            ((pfa) this).field_e = hq.field_b[param1] << 16;
            ((pfa) this).field_g = false;
            ((pfa) this).field_f = new vna();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "pfa.<init>(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Prev";
        field_i = new ura();
    }
}
