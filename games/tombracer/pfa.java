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
        String discarded$28 = null;
        String discarded$29 = null;
        String discarded$30 = null;
        String discarded$31 = null;
        String discarded$32 = null;
        String discarded$33 = null;
        String discarded$34 = null;
        String discarded$35 = null;
        String discarded$36 = null;
        String discarded$37 = null;
        String discarded$38 = null;
        String discarded$39 = null;
        String discarded$40 = null;
        String discarded$41 = null;
        String discarded$42 = null;
        String discarded$43 = null;
        String discarded$44 = null;
        String discarded$45 = null;
        String discarded$46 = null;
        String discarded$47 = null;
        String discarded$48 = null;
        String discarded$49 = null;
        String discarded$50 = null;
        String discarded$51 = null;
        String discarded$52 = null;
        String discarded$53 = null;
        String discarded$54 = null;
        String discarded$55 = null;
        RuntimeException var2 = null;
        byte[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_1829_0 = null;
        StringBuilder stackIn_1829_1 = null;
        RuntimeException stackIn_1831_0 = null;
        StringBuilder stackIn_1831_1 = null;
        RuntimeException stackIn_1832_0 = null;
        StringBuilder stackIn_1832_1 = null;
        String stackIn_1832_2 = null;
        int stackIn_1840_0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_1828_0 = null;
        StringBuilder stackOut_1828_1 = null;
        RuntimeException stackOut_1831_0 = null;
        StringBuilder stackOut_1831_1 = null;
        String stackOut_1831_2 = null;
        RuntimeException stackOut_1829_0 = null;
        StringBuilder stackOut_1829_1 = null;
        String stackOut_1829_2 = null;
        int stackOut_1839_0 = 0;
        int stackOut_1837_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              fs.field_p = param0;
              var2_array = mt.a("achievement_names,0", (byte) 108);
              if (null != var2_array) {
                lq.field_p[0] = jaa.a((byte) 77, var2_array);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2_array = mt.a("achievement_names,1", (byte) 121);
              if (var2_array != null) {
                lq.field_p[1] = jaa.a((byte) 97, var2_array);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var2_array = mt.a("achievement_names,2", (byte) 115);
              if (null != var2_array) {
                lq.field_p[2] = jaa.a((byte) 73, var2_array);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var2_array = mt.a("achievement_names,3", (byte) 123);
              if (null != var2_array) {
                lq.field_p[3] = jaa.a((byte) 69, var2_array);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var2_array = mt.a("achievement_names,4", (byte) 108);
              if (var2_array == null) {
                break L5;
              } else {
                lq.field_p[4] = jaa.a((byte) 125, var2_array);
                break L5;
              }
            }
            L6: {
              var2_array = mt.a("achievement_names,5", (byte) 121);
              if (null == var2_array) {
                break L6;
              } else {
                lq.field_p[5] = jaa.a((byte) 81, var2_array);
                break L6;
              }
            }
            L7: {
              var2_array = mt.a("achievement_names,6", (byte) 118);
              if (null != var2_array) {
                lq.field_p[6] = jaa.a((byte) 56, var2_array);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              var2_array = mt.a("achievement_names,7", (byte) 124);
              if (var2_array != null) {
                lq.field_p[7] = jaa.a((byte) 30, var2_array);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2_array = mt.a("achievement_names,8", (byte) 102);
              if (var2_array == null) {
                break L9;
              } else {
                lq.field_p[8] = jaa.a((byte) 77, var2_array);
                break L9;
              }
            }
            L10: {
              var2_array = mt.a("achievement_names,9", (byte) 111);
              if (null == var2_array) {
                break L10;
              } else {
                lq.field_p[9] = jaa.a((byte) 26, var2_array);
                break L10;
              }
            }
            L11: {
              var2_array = mt.a("achievement_names,10", (byte) 110);
              if (var2_array == null) {
                break L11;
              } else {
                lq.field_p[10] = jaa.a((byte) 102, var2_array);
                break L11;
              }
            }
            L12: {
              var2_array = mt.a("achievement_names,11", (byte) 121);
              if (null == var2_array) {
                break L12;
              } else {
                lq.field_p[11] = jaa.a((byte) 59, var2_array);
                break L12;
              }
            }
            L13: {
              var2_array = mt.a("achievement_names,12", (byte) 112);
              if (var2_array != null) {
                lq.field_p[12] = jaa.a((byte) 28, var2_array);
                break L13;
              } else {
                break L13;
              }
            }
            L14: {
              var2_array = mt.a("achievement_names,13", (byte) 127);
              if (null == var2_array) {
                break L14;
              } else {
                lq.field_p[13] = jaa.a((byte) 50, var2_array);
                break L14;
              }
            }
            L15: {
              var2_array = mt.a("achievement_names,14", (byte) 116);
              if (var2_array == null) {
                break L15;
              } else {
                lq.field_p[14] = jaa.a((byte) 113, var2_array);
                break L15;
              }
            }
            L16: {
              var2_array = mt.a("achievement_names,15", (byte) 119);
              if (var2_array == null) {
                break L16;
              } else {
                lq.field_p[15] = jaa.a((byte) 122, var2_array);
                break L16;
              }
            }
            L17: {
              var2_array = mt.a("achievement_names,16", (byte) 123);
              if (null != var2_array) {
                lq.field_p[16] = jaa.a((byte) 37, var2_array);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2_array = mt.a("achievement_names,17", (byte) 102);
              if (var2_array == null) {
                break L18;
              } else {
                lq.field_p[17] = jaa.a((byte) 84, var2_array);
                break L18;
              }
            }
            L19: {
              var2_array = mt.a("achievement_names,18", (byte) 120);
              if (null == var2_array) {
                break L19;
              } else {
                lq.field_p[18] = jaa.a((byte) 121, var2_array);
                break L19;
              }
            }
            L20: {
              var2_array = mt.a("achievement_names,19", (byte) 121);
              if (var2_array == null) {
                break L20;
              } else {
                lq.field_p[19] = jaa.a((byte) 75, var2_array);
                break L20;
              }
            }
            L21: {
              var2_array = mt.a("achievement_names,20", (byte) 124);
              if (var2_array == null) {
                break L21;
              } else {
                lq.field_p[20] = jaa.a((byte) 25, var2_array);
                break L21;
              }
            }
            L22: {
              var2_array = mt.a("achievement_names,21", (byte) 104);
              if (var2_array == null) {
                break L22;
              } else {
                lq.field_p[21] = jaa.a((byte) 64, var2_array);
                break L22;
              }
            }
            L23: {
              var2_array = mt.a("achievement_names,22", (byte) 125);
              if (null == var2_array) {
                break L23;
              } else {
                lq.field_p[22] = jaa.a((byte) 106, var2_array);
                break L23;
              }
            }
            L24: {
              var2_array = mt.a("achievement_names,23", (byte) 102);
              if (var2_array != null) {
                lq.field_p[23] = jaa.a((byte) 28, var2_array);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              var2_array = mt.a("achievement_names,24", (byte) 104);
              if (var2_array == null) {
                break L25;
              } else {
                lq.field_p[24] = jaa.a((byte) 67, var2_array);
                break L25;
              }
            }
            L26: {
              var2_array = mt.a("achievement_names,25", (byte) 116);
              if (var2_array == null) {
                break L26;
              } else {
                lq.field_p[25] = jaa.a((byte) 96, var2_array);
                break L26;
              }
            }
            L27: {
              var2_array = mt.a("achievement_names,26", (byte) 112);
              if (var2_array == null) {
                break L27;
              } else {
                lq.field_p[26] = jaa.a((byte) 86, var2_array);
                break L27;
              }
            }
            L28: {
              var2_array = mt.a("achievement_names,27", (byte) 102);
              if (var2_array == null) {
                break L28;
              } else {
                lq.field_p[27] = jaa.a((byte) 76, var2_array);
                break L28;
              }
            }
            L29: {
              var2_array = mt.a("achievement_names,28", (byte) 113);
              if (null != var2_array) {
                lq.field_p[28] = jaa.a((byte) 60, var2_array);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              var2_array = mt.a("achievement_names,29", (byte) 118);
              if (null == var2_array) {
                break L30;
              } else {
                lq.field_p[29] = jaa.a((byte) 66, var2_array);
                break L30;
              }
            }
            L31: {
              var2_array = mt.a("achievement_names,30", (byte) 101);
              if (var2_array != null) {
                lq.field_p[30] = jaa.a((byte) 101, var2_array);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              var2_array = mt.a("achievement_names,31", (byte) 125);
              if (var2_array == null) {
                break L32;
              } else {
                lq.field_p[31] = jaa.a((byte) 67, var2_array);
                break L32;
              }
            }
            L33: {
              var2_array = mt.a("achievement_names,32", (byte) 115);
              if (null == var2_array) {
                break L33;
              } else {
                lq.field_p[32] = jaa.a((byte) 64, var2_array);
                break L33;
              }
            }
            L34: {
              var2_array = mt.a("achievement_names,33", (byte) 100);
              if (var2_array == null) {
                break L34;
              } else {
                lq.field_p[33] = jaa.a((byte) 79, var2_array);
                break L34;
              }
            }
            L35: {
              var2_array = mt.a("achievement_names,34", (byte) 125);
              if (var2_array == null) {
                break L35;
              } else {
                lq.field_p[34] = jaa.a((byte) 55, var2_array);
                break L35;
              }
            }
            L36: {
              var2_array = mt.a("achievement_names,35", (byte) 109);
              if (var2_array == null) {
                break L36;
              } else {
                lq.field_p[35] = jaa.a((byte) 56, var2_array);
                break L36;
              }
            }
            L37: {
              var2_array = mt.a("achievement_names,36", (byte) 116);
              if (null != var2_array) {
                lq.field_p[36] = jaa.a((byte) 69, var2_array);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2_array = mt.a("achievement_names,37", (byte) 125);
              if (null == var2_array) {
                break L38;
              } else {
                lq.field_p[37] = jaa.a((byte) 40, var2_array);
                break L38;
              }
            }
            L39: {
              var2_array = mt.a("achievement_names,38", (byte) 122);
              if (var2_array == null) {
                break L39;
              } else {
                lq.field_p[38] = jaa.a((byte) 116, var2_array);
                break L39;
              }
            }
            L40: {
              var2_array = mt.a("achievement_names,39", (byte) 123);
              if (null == var2_array) {
                break L40;
              } else {
                lq.field_p[39] = jaa.a((byte) 38, var2_array);
                break L40;
              }
            }
            L41: {
              var2_array = mt.a("achievement_names,40", (byte) 100);
              if (null != var2_array) {
                lq.field_p[40] = jaa.a((byte) 125, var2_array);
                break L41;
              } else {
                break L41;
              }
            }
            L42: {
              var2_array = mt.a("achievement_names,41", (byte) 113);
              if (var2_array != null) {
                lq.field_p[41] = jaa.a((byte) 116, var2_array);
                break L42;
              } else {
                break L42;
              }
            }
            L43: {
              var2_array = mt.a("achievement_criteria,0", (byte) 105);
              if (var2_array != null) {
                kv.field_c[0] = jaa.a((byte) 61, var2_array);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2_array = mt.a("achievement_criteria,1", (byte) 114);
              if (var2_array != null) {
                kv.field_c[1] = jaa.a((byte) 60, var2_array);
                break L44;
              } else {
                break L44;
              }
            }
            L45: {
              var2_array = mt.a("achievement_criteria,2", (byte) 110);
              if (null == var2_array) {
                break L45;
              } else {
                kv.field_c[2] = jaa.a((byte) 111, var2_array);
                break L45;
              }
            }
            L46: {
              var2_array = mt.a("achievement_criteria,3", (byte) 104);
              if (var2_array == null) {
                break L46;
              } else {
                kv.field_c[3] = jaa.a((byte) 69, var2_array);
                break L46;
              }
            }
            L47: {
              var2_array = mt.a("achievement_criteria,4", (byte) 127);
              if (null != var2_array) {
                kv.field_c[4] = jaa.a((byte) 54, var2_array);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2_array = mt.a("achievement_criteria,5", (byte) 111);
              if (null == var2_array) {
                break L48;
              } else {
                kv.field_c[5] = jaa.a((byte) 83, var2_array);
                break L48;
              }
            }
            L49: {
              var2_array = mt.a("achievement_criteria,6", (byte) 113);
              if (var2_array != null) {
                kv.field_c[6] = jaa.a((byte) 44, var2_array);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2_array = mt.a("achievement_criteria,7", (byte) 127);
              if (null == var2_array) {
                break L50;
              } else {
                kv.field_c[7] = jaa.a((byte) 80, var2_array);
                break L50;
              }
            }
            L51: {
              var2_array = mt.a("achievement_criteria,8", (byte) 113);
              if (var2_array != null) {
                kv.field_c[8] = jaa.a((byte) 98, var2_array);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2_array = mt.a("achievement_criteria,9", (byte) 110);
              if (null != var2_array) {
                kv.field_c[9] = jaa.a((byte) 45, var2_array);
                break L52;
              } else {
                break L52;
              }
            }
            L53: {
              var2_array = mt.a("achievement_criteria,10", (byte) 104);
              if (var2_array != null) {
                kv.field_c[10] = jaa.a((byte) 44, var2_array);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2_array = mt.a("achievement_criteria,11", (byte) 117);
              if (null == var2_array) {
                break L54;
              } else {
                kv.field_c[11] = jaa.a((byte) 90, var2_array);
                break L54;
              }
            }
            L55: {
              var2_array = mt.a("achievement_criteria,12", (byte) 104);
              if (null != var2_array) {
                kv.field_c[12] = jaa.a((byte) 47, var2_array);
                break L55;
              } else {
                break L55;
              }
            }
            L56: {
              var2_array = mt.a("achievement_criteria,13", (byte) 120);
              if (var2_array != null) {
                kv.field_c[13] = jaa.a((byte) 88, var2_array);
                break L56;
              } else {
                break L56;
              }
            }
            L57: {
              var2_array = mt.a("achievement_criteria,14", (byte) 123);
              if (null != var2_array) {
                kv.field_c[14] = jaa.a((byte) 54, var2_array);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              var2_array = mt.a("achievement_criteria,15", (byte) 110);
              if (var2_array != null) {
                kv.field_c[15] = jaa.a((byte) 43, var2_array);
                break L58;
              } else {
                break L58;
              }
            }
            L59: {
              var2_array = mt.a("achievement_criteria,16", (byte) 105);
              if (null != var2_array) {
                kv.field_c[16] = jaa.a((byte) 81, var2_array);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2_array = mt.a("achievement_criteria,17", (byte) 123);
              if (var2_array != null) {
                kv.field_c[17] = jaa.a((byte) 115, var2_array);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2_array = mt.a("achievement_criteria,18", (byte) 123);
              if (null == var2_array) {
                break L61;
              } else {
                kv.field_c[18] = jaa.a((byte) 49, var2_array);
                break L61;
              }
            }
            L62: {
              var2_array = mt.a("achievement_criteria,19", (byte) 120);
              if (var2_array != null) {
                kv.field_c[19] = jaa.a((byte) 113, var2_array);
                break L62;
              } else {
                break L62;
              }
            }
            L63: {
              var2_array = mt.a("achievement_criteria,20", (byte) 110);
              if (var2_array != null) {
                kv.field_c[20] = jaa.a((byte) 48, var2_array);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              var2_array = mt.a("achievement_criteria,21", (byte) 117);
              if (null != var2_array) {
                kv.field_c[21] = jaa.a((byte) 86, var2_array);
                break L64;
              } else {
                break L64;
              }
            }
            L65: {
              var3 = -99 % ((param1 - 40) / 63);
              var2_array = mt.a("achievement_criteria,22", (byte) 101);
              if (var2_array != null) {
                kv.field_c[22] = jaa.a((byte) 108, var2_array);
                break L65;
              } else {
                break L65;
              }
            }
            L66: {
              var2_array = mt.a("achievement_criteria,23", (byte) 101);
              if (var2_array != null) {
                kv.field_c[23] = jaa.a((byte) 115, var2_array);
                break L66;
              } else {
                break L66;
              }
            }
            L67: {
              var2_array = mt.a("achievement_criteria,24", (byte) 103);
              if (null != var2_array) {
                kv.field_c[24] = jaa.a((byte) 72, var2_array);
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              var2_array = mt.a("achievement_criteria,25", (byte) 125);
              if (var2_array == null) {
                break L68;
              } else {
                kv.field_c[25] = jaa.a((byte) 114, var2_array);
                break L68;
              }
            }
            L69: {
              var2_array = mt.a("achievement_criteria,26", (byte) 112);
              if (null != var2_array) {
                kv.field_c[26] = jaa.a((byte) 56, var2_array);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2_array = mt.a("achievement_criteria,27", (byte) 127);
              if (null != var2_array) {
                kv.field_c[27] = jaa.a((byte) 61, var2_array);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              var2_array = mt.a("achievement_criteria,28", (byte) 126);
              if (null == var2_array) {
                break L71;
              } else {
                kv.field_c[28] = jaa.a((byte) 107, var2_array);
                break L71;
              }
            }
            L72: {
              var2_array = mt.a("achievement_criteria,29", (byte) 116);
              if (var2_array == null) {
                break L72;
              } else {
                kv.field_c[29] = jaa.a((byte) 69, var2_array);
                break L72;
              }
            }
            L73: {
              var2_array = mt.a("achievement_criteria,30", (byte) 107);
              if (var2_array == null) {
                break L73;
              } else {
                kv.field_c[30] = jaa.a((byte) 121, var2_array);
                break L73;
              }
            }
            L74: {
              var2_array = mt.a("achievement_criteria,31", (byte) 101);
              if (var2_array == null) {
                break L74;
              } else {
                kv.field_c[31] = jaa.a((byte) 89, var2_array);
                break L74;
              }
            }
            L75: {
              var2_array = mt.a("achievement_criteria,32", (byte) 108);
              if (var2_array != null) {
                kv.field_c[32] = jaa.a((byte) 83, var2_array);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              var2_array = mt.a("achievement_criteria,33", (byte) 105);
              if (var2_array != null) {
                kv.field_c[33] = jaa.a((byte) 34, var2_array);
                break L76;
              } else {
                break L76;
              }
            }
            L77: {
              var2_array = mt.a("achievement_criteria,34", (byte) 124);
              if (var2_array != null) {
                kv.field_c[34] = jaa.a((byte) 127, var2_array);
                break L77;
              } else {
                break L77;
              }
            }
            L78: {
              var2_array = mt.a("achievement_criteria,35", (byte) 123);
              if (null != var2_array) {
                kv.field_c[35] = jaa.a((byte) 71, var2_array);
                break L78;
              } else {
                break L78;
              }
            }
            L79: {
              var2_array = mt.a("achievement_criteria,36", (byte) 122);
              if (null == var2_array) {
                break L79;
              } else {
                kv.field_c[36] = jaa.a((byte) 63, var2_array);
                break L79;
              }
            }
            L80: {
              var2_array = mt.a("achievement_criteria,37", (byte) 122);
              if (var2_array != null) {
                kv.field_c[37] = jaa.a((byte) 108, var2_array);
                break L80;
              } else {
                break L80;
              }
            }
            L81: {
              var2_array = mt.a("achievement_criteria,38", (byte) 116);
              if (null != var2_array) {
                kv.field_c[38] = jaa.a((byte) 83, var2_array);
                break L81;
              } else {
                break L81;
              }
            }
            L82: {
              var2_array = mt.a("achievement_criteria,39", (byte) 121);
              if (var2_array != null) {
                kv.field_c[39] = jaa.a((byte) 43, var2_array);
                break L82;
              } else {
                break L82;
              }
            }
            L83: {
              var2_array = mt.a("achievement_criteria,40", (byte) 117);
              if (var2_array != null) {
                kv.field_c[40] = jaa.a((byte) 73, var2_array);
                break L83;
              } else {
                break L83;
              }
            }
            L84: {
              var2_array = mt.a("achievement_criteria,41", (byte) 101);
              if (var2_array == null) {
                break L84;
              } else {
                kv.field_c[41] = jaa.a((byte) 31, var2_array);
                break L84;
              }
            }
            L85: {
              var2_array = mt.a("no_textures", (byte) 108);
              if (var2_array == null) {
                break L85;
              } else {
                discarded$28 = jaa.a((byte) 114, var2_array);
                break L85;
              }
            }
            L86: {
              var2_array = mt.a("instructions_title", (byte) 112);
              if (var2_array == null) {
                break L86;
              } else {
                sea.field_q = jaa.a((byte) 46, var2_array);
                break L86;
              }
            }
            L87: {
              var2_array = mt.a("highscores_title", (byte) 114);
              if (null != var2_array) {
                discarded$29 = jaa.a((byte) 60, var2_array);
                break L87;
              } else {
                break L87;
              }
            }
            L88: {
              var2_array = mt.a("achievements_title", (byte) 120);
              if (var2_array != null) {
                discarded$30 = jaa.a((byte) 84, var2_array);
                break L88;
              } else {
                break L88;
              }
            }
            L89: {
              var2_array = mt.a("rankings_title", (byte) 121);
              if (var2_array == null) {
                break L89;
              } else {
                discarded$31 = jaa.a((byte) 94, var2_array);
                break L89;
              }
            }
            L90: {
              var2_array = mt.a("character_select_title", (byte) 120);
              if (var2_array == null) {
                break L90;
              } else {
                discarded$32 = jaa.a((byte) 67, var2_array);
                break L90;
              }
            }
            L91: {
              var2_array = mt.a("player,0", (byte) 110);
              if (null == var2_array) {
                break L91;
              } else {
                kma.field_c[0] = jaa.a((byte) 37, var2_array);
                break L91;
              }
            }
            L92: {
              var2_array = mt.a("player,1", (byte) 105);
              if (null != var2_array) {
                kma.field_c[1] = jaa.a((byte) 92, var2_array);
                break L92;
              } else {
                break L92;
              }
            }
            L93: {
              var2_array = mt.a("player,2", (byte) 102);
              if (null == var2_array) {
                break L93;
              } else {
                kma.field_c[2] = jaa.a((byte) 64, var2_array);
                break L93;
              }
            }
            L94: {
              var2_array = mt.a("player,3", (byte) 124);
              if (null != var2_array) {
                kma.field_c[3] = jaa.a((byte) 124, var2_array);
                break L94;
              } else {
                break L94;
              }
            }
            L95: {
              var2_array = mt.a("positions,0", (byte) 119);
              if (var2_array == null) {
                break L95;
              } else {
                dw.field_u[0] = jaa.a((byte) 102, var2_array);
                break L95;
              }
            }
            L96: {
              var2_array = mt.a("positions,1", (byte) 114);
              if (var2_array != null) {
                dw.field_u[1] = jaa.a((byte) 30, var2_array);
                break L96;
              } else {
                break L96;
              }
            }
            L97: {
              var2_array = mt.a("positions,2", (byte) 108);
              if (var2_array == null) {
                break L97;
              } else {
                dw.field_u[2] = jaa.a((byte) 96, var2_array);
                break L97;
              }
            }
            L98: {
              var2_array = mt.a("positions,3", (byte) 121);
              if (var2_array != null) {
                dw.field_u[3] = jaa.a((byte) 97, var2_array);
                break L98;
              } else {
                break L98;
              }
            }
            L99: {
              var2_array = mt.a("roundWinner", (byte) 126);
              if (var2_array != null) {
                cha.field_h = jaa.a((byte) 40, var2_array);
                break L99;
              } else {
                break L99;
              }
            }
            L100: {
              var2_array = mt.a("gameWinner", (byte) 123);
              if (var2_array != null) {
                vu.field_d = jaa.a((byte) 41, var2_array);
                break L100;
              } else {
                break L100;
              }
            }
            L101: {
              var2_array = mt.a("roundWinner_draw", (byte) 113);
              if (var2_array != null) {
                uda.field_o = jaa.a((byte) 43, var2_array);
                break L101;
              } else {
                break L101;
              }
            }
            L102: {
              var2_array = mt.a("milliseconds", (byte) 111);
              if (var2_array == null) {
                break L102;
              } else {
                discarded$33 = jaa.a((byte) 28, var2_array);
                break L102;
              }
            }
            L103: {
              var2_array = mt.a("arr", (byte) 127);
              if (var2_array != null) {
                lva.field_y = jaa.a((byte) 72, var2_array);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              var2_array = mt.a("keys", (byte) 107);
              if (null != var2_array) {
                waa.field_b = jaa.a((byte) 115, var2_array);
                break L104;
              } else {
                break L104;
              }
            }
            L105: {
              var2_array = mt.a("keycode_player1left", (byte) 122);
              if (null != var2_array) {
                kda.field_hd = 255 & var2_array[0];
                break L105;
              } else {
                break L105;
              }
            }
            L106: {
              var2_array = mt.a("keycode_player1right", (byte) 119);
              if (null == var2_array) {
                break L106;
              } else {
                mf.field_a = var2_array[0] & 255;
                break L106;
              }
            }
            L107: {
              var2_array = mt.a("keycode_player1up", (byte) 111);
              if (var2_array != null) {
                mi.field_k = 255 & var2_array[0];
                break L107;
              } else {
                break L107;
              }
            }
            L108: {
              var2_array = mt.a("keycode_player1down", (byte) 112);
              if (null != var2_array) {
                fp.field_a = var2_array[0] & 255;
                break L108;
              } else {
                break L108;
              }
            }
            L109: {
              var2_array = mt.a("keycode_player1fire", (byte) 108);
              if (null != var2_array) {
                gsa.field_j = 255 & var2_array[0];
                break L109;
              } else {
                break L109;
              }
            }
            L110: {
              var2_array = mt.a("keycode_player1reset", (byte) 105);
              if (null != var2_array) {
                mv.field_i = var2_array[0] & 255;
                break L110;
              } else {
                break L110;
              }
            }
            L111: {
              var2_array = mt.a("keycode_player1pull", (byte) 122);
              if (var2_array == null) {
                break L111;
              } else {
                ki.field_o = var2_array[0] & 255;
                break L111;
              }
            }
            L112: {
              var2_array = mt.a("keycode_player1skiproom", (byte) 114);
              if (null != var2_array) {
                rta.field_g = var2_array[0] & 255;
                break L112;
              } else {
                break L112;
              }
            }
            L113: {
              var2_array = mt.a("keycode_player1sneak", (byte) 123);
              if (null != var2_array) {
                hra.field_b = var2_array[0] & 255;
                break L113;
              } else {
                break L113;
              }
            }
            L114: {
              var2_array = mt.a("oneplayer_timed", (byte) 113);
              if (var2_array == null) {
                break L114;
              } else {
                qka.field_s = jaa.a((byte) 70, var2_array);
                break L114;
              }
            }
            L115: {
              var2_array = mt.a("oneplayer_puzzle", (byte) 114);
              if (null == var2_array) {
                break L115;
              } else {
                ula.field_t = jaa.a((byte) 121, var2_array);
                break L115;
              }
            }
            L116: {
              var2_array = mt.a("startroom_colon", (byte) 109);
              if (var2_array != null) {
                rja.field_b = jaa.a((byte) 122, var2_array);
                break L116;
              } else {
                break L116;
              }
            }
            L117: {
              var2_array = mt.a("difficulty_colon", (byte) 114);
              if (null == var2_array) {
                break L117;
              } else {
                wq.field_d = jaa.a((byte) 85, var2_array);
                break L117;
              }
            }
            L118: {
              var2_array = mt.a("bloom", (byte) 110);
              if (var2_array == null) {
                break L118;
              } else {
                ona.field_F = jaa.a((byte) 51, var2_array);
                break L118;
              }
            }
            L119: {
              var2_array = mt.a("textures", (byte) 123);
              if (var2_array == null) {
                break L119;
              } else {
                discarded$34 = jaa.a((byte) 101, var2_array);
                break L119;
              }
            }
            L120: {
              var2_array = mt.a("pointLights", (byte) 120);
              if (var2_array == null) {
                break L120;
              } else {
                bq.field_a = jaa.a((byte) 95, var2_array);
                break L120;
              }
            }
            L121: {
              var2_array = mt.a("wallShadows", (byte) 111);
              if (var2_array != null) {
                ir.field_b = jaa.a((byte) 76, var2_array);
                break L121;
              } else {
                break L121;
              }
            }
            L122: {
              var2_array = mt.a("textures_all", (byte) 104);
              if (null == var2_array) {
                break L122;
              } else {
                discarded$35 = jaa.a((byte) 46, var2_array);
                break L122;
              }
            }
            L123: {
              var2_array = mt.a("textures_some", (byte) 118);
              if (var2_array != null) {
                discarded$36 = jaa.a((byte) 51, var2_array);
                break L123;
              } else {
                break L123;
              }
            }
            L124: {
              var2_array = mt.a("textures_none", (byte) 108);
              if (var2_array == null) {
                break L124;
              } else {
                discarded$37 = jaa.a((byte) 108, var2_array);
                break L124;
              }
            }
            L125: {
              var2_array = mt.a("tutorial_title", (byte) 119);
              if (var2_array == null) {
                break L125;
              } else {
                tea.field_a = jaa.a((byte) 25, var2_array);
                break L125;
              }
            }
            L126: {
              var2_array = mt.a("tutorial_firetocontinue", (byte) 100);
              if (var2_array != null) {
                vda.field_n = jaa.a((byte) 127, var2_array);
                break L126;
              } else {
                break L126;
              }
            }
            L127: {
              var2_array = mt.a("tutorial_room0", (byte) 116);
              if (var2_array != null) {
                fk.field_j = jaa.a((byte) 90, var2_array);
                break L127;
              } else {
                break L127;
              }
            }
            L128: {
              var2_array = mt.a("tutorial_death", (byte) 106);
              if (var2_array == null) {
                break L128;
              } else {
                tha.field_A = jaa.a((byte) 62, var2_array);
                break L128;
              }
            }
            L129: {
              var2_array = mt.a("tutorial_treasure", (byte) 123);
              if (var2_array == null) {
                break L129;
              } else {
                uw.field_b = jaa.a((byte) 90, var2_array);
                break L129;
              }
            }
            L130: {
              var2_array = mt.a("tutorial_treasureslow", (byte) 117);
              if (null != var2_array) {
                lja.field_a = jaa.a((byte) 41, var2_array);
                break L130;
              } else {
                break L130;
              }
            }
            L131: {
              var2_array = mt.a("tutorial_key", (byte) 102);
              if (var2_array != null) {
                uj.field_f = jaa.a((byte) 65, var2_array);
                break L131;
              } else {
                break L131;
              }
            }
            L132: {
              var2_array = mt.a("tutorial_pushable", (byte) 114);
              if (var2_array == null) {
                break L132;
              } else {
                vh.field_c = jaa.a((byte) 99, var2_array);
                break L132;
              }
            }
            L133: {
              var2_array = mt.a("tutorial_snakes", (byte) 113);
              if (var2_array == null) {
                break L133;
              } else {
                wqa.field_F = jaa.a((byte) 62, var2_array);
                break L133;
              }
            }
            L134: {
              var2_array = mt.a("tutorial_gun", (byte) 117);
              if (var2_array == null) {
                break L134;
              } else {
                gca.field_l = jaa.a((byte) 80, var2_array);
                break L134;
              }
            }
            L135: {
              var2_array = mt.a("tutorial_restart", (byte) 106);
              if (null == var2_array) {
                break L135;
              } else {
                wd.field_a = jaa.a((byte) 67, var2_array);
                break L135;
              }
            }
            L136: {
              var2_array = mt.a("instructionTitleCoins", (byte) 112);
              if (var2_array == null) {
                break L136;
              } else {
                ct.field_c = jaa.a((byte) 83, var2_array);
                break L136;
              }
            }
            L137: {
              var2_array = mt.a("instructionTextCoins", (byte) 123);
              if (null == var2_array) {
                break L137;
              } else {
                dk.field_k = jaa.a((byte) 119, var2_array);
                break L137;
              }
            }
            L138: {
              var2_array = mt.a("instructionTitleBagsOLoot", (byte) 109);
              if (var2_array == null) {
                break L138;
              } else {
                pn.field_o = jaa.a((byte) 104, var2_array);
                break L138;
              }
            }
            L139: {
              var2_array = mt.a("instructionTextBagsOLoot", (byte) 103);
              if (var2_array == null) {
                break L139;
              } else {
                kh.field_m = jaa.a((byte) 39, var2_array);
                break L139;
              }
            }
            L140: {
              var2_array = mt.a("instructionTitleIcons", (byte) 114);
              if (null != var2_array) {
                dka.field_c = jaa.a((byte) 50, var2_array);
                break L140;
              } else {
                break L140;
              }
            }
            L141: {
              var2_array = mt.a("instructionTextIcons", (byte) 105);
              if (var2_array == null) {
                break L141;
              } else {
                ne.field_e = jaa.a((byte) 84, var2_array);
                break L141;
              }
            }
            L142: {
              var2_array = mt.a("instructionTitleBottomlessPits", (byte) 127);
              if (var2_array != null) {
                kea.field_b = jaa.a((byte) 51, var2_array);
                break L142;
              } else {
                break L142;
              }
            }
            L143: {
              var2_array = mt.a("instructionTextBottomlessPits", (byte) 109);
              if (null == var2_array) {
                break L143;
              } else {
                bpa.field_a = jaa.a((byte) 61, var2_array);
                break L143;
              }
            }
            L144: {
              var2_array = mt.a("instructionTitleSnakePits", (byte) 119);
              if (null != var2_array) {
                baa.field_a = jaa.a((byte) 93, var2_array);
                break L144;
              } else {
                break L144;
              }
            }
            L145: {
              var2_array = mt.a("instructionTextSnakePits", (byte) 111);
              if (null == var2_array) {
                break L145;
              } else {
                du.field_f = jaa.a((byte) 88, var2_array);
                break L145;
              }
            }
            L146: {
              var2_array = mt.a("instructionTitleLagoonsOfLava", (byte) 119);
              if (null != var2_array) {
                dk.field_a = jaa.a((byte) 82, var2_array);
                break L146;
              } else {
                break L146;
              }
            }
            L147: {
              var2_array = mt.a("instructionTextLagoonsOfLava", (byte) 101);
              if (null != var2_array) {
                vua.field_C = jaa.a((byte) 36, var2_array);
                break L147;
              } else {
                break L147;
              }
            }
            L148: {
              var2_array = mt.a("instructionTitleCrushers", (byte) 114);
              if (var2_array == null) {
                break L148;
              } else {
                qba.field_d = jaa.a((byte) 82, var2_array);
                break L148;
              }
            }
            L149: {
              var2_array = mt.a("instructionTextCrushers", (byte) 116);
              if (var2_array == null) {
                break L149;
              } else {
                ir.field_c = jaa.a((byte) 99, var2_array);
                break L149;
              }
            }
            L150: {
              var2_array = mt.a("instructionTitleLindemannTotems", (byte) 117);
              if (null == var2_array) {
                break L150;
              } else {
                eua.field_Ab = jaa.a((byte) 25, var2_array);
                break L150;
              }
            }
            L151: {
              var2_array = mt.a("instructionTextLindemannTotems", (byte) 123);
              if (var2_array != null) {
                sba.field_o = jaa.a((byte) 29, var2_array);
                break L151;
              } else {
                break L151;
              }
            }
            L152: {
              var2_array = mt.a("instructionTitleMobileLindemannTotems", (byte) 102);
              if (var2_array == null) {
                break L152;
              } else {
                rua.field_hb = jaa.a((byte) 122, var2_array);
                break L152;
              }
            }
            L153: {
              var2_array = mt.a("instructionTextMobileLindemannTotems", (byte) 120);
              if (var2_array == null) {
                break L153;
              } else {
                vk.field_a = jaa.a((byte) 27, var2_array);
                break L153;
              }
            }
            L154: {
              var2_array = mt.a("instructionTitleBobbyGeorgeTotems", (byte) 114);
              if (var2_array == null) {
                break L154;
              } else {
                hca.field_s = jaa.a((byte) 59, var2_array);
                break L154;
              }
            }
            L155: {
              var2_array = mt.a("instructionTextBobbyGeorgeTotems", (byte) 103);
              if (null == var2_array) {
                break L155;
              } else {
                koa.field_d = jaa.a((byte) 102, var2_array);
                break L155;
              }
            }
            L156: {
              var2_array = mt.a("instructionTitleMirrors", (byte) 116);
              if (null != var2_array) {
                uv.field_u = jaa.a((byte) 98, var2_array);
                break L156;
              } else {
                break L156;
              }
            }
            L157: {
              var2_array = mt.a("instructionTextMirrors", (byte) 127);
              if (null != var2_array) {
                hv.field_o = jaa.a((byte) 89, var2_array);
                break L157;
              } else {
                break L157;
              }
            }
            L158: {
              var2_array = mt.a("instructionTitleMobileMirrors", (byte) 126);
              if (var2_array != null) {
                jd.field_m = jaa.a((byte) 63, var2_array);
                break L158;
              } else {
                break L158;
              }
            }
            L159: {
              var2_array = mt.a("instructionTextMobileMirrors", (byte) 119);
              if (var2_array != null) {
                wfa.field_G = jaa.a((byte) 28, var2_array);
                break L159;
              } else {
                break L159;
              }
            }
            L160: {
              var2_array = mt.a("instructionTitlePrecariousPlatforms", (byte) 127);
              if (null != var2_array) {
                fv.field_b = jaa.a((byte) 114, var2_array);
                break L160;
              } else {
                break L160;
              }
            }
            L161: {
              var2_array = mt.a("instructionTextPrecariousPlatforms", (byte) 120);
              if (null != var2_array) {
                gn.field_y = jaa.a((byte) 82, var2_array);
                break L161;
              } else {
                break L161;
              }
            }
            L162: {
              var2_array = mt.a("instructionTitleCrumblyBlocks", (byte) 103);
              if (null == var2_array) {
                break L162;
              } else {
                td.field_u = jaa.a((byte) 108, var2_array);
                break L162;
              }
            }
            L163: {
              var2_array = mt.a("instructionTextCrumblyBlocks", (byte) 108);
              if (null != var2_array) {
                hn.field_G = jaa.a((byte) 78, var2_array);
                break L163;
              } else {
                break L163;
              }
            }
            L164: {
              var2_array = mt.a("instructionTitleCauldronsOfGreenSoup", (byte) 115);
              if (var2_array != null) {
                hoa.field_n = jaa.a((byte) 25, var2_array);
                break L164;
              } else {
                break L164;
              }
            }
            L165: {
              var2_array = mt.a("instructionTextCauldronsOfGreenSoup", (byte) 112);
              if (var2_array != null) {
                lr.field_e = jaa.a((byte) 43, var2_array);
                break L165;
              } else {
                break L165;
              }
            }
            L166: {
              var2_array = mt.a("instructionTitleSkeletons", (byte) 113);
              if (null != var2_array) {
                td.field_n = jaa.a((byte) 92, var2_array);
                break L166;
              } else {
                break L166;
              }
            }
            L167: {
              var2_array = mt.a("instructionTextSkeletons", (byte) 101);
              if (var2_array != null) {
                qna.field_a = jaa.a((byte) 27, var2_array);
                break L167;
              } else {
                break L167;
              }
            }
            L168: {
              var2_array = mt.a("instructionTitleLocksAndKeys", (byte) 101);
              if (null != var2_array) {
                uqa.field_v = jaa.a((byte) 83, var2_array);
                break L168;
              } else {
                break L168;
              }
            }
            L169: {
              var2_array = mt.a("instructionTextLocksAndKeys", (byte) 120);
              if (var2_array != null) {
                apa.field_b = jaa.a((byte) 62, var2_array);
                break L169;
              } else {
                break L169;
              }
            }
            L170: {
              var2_array = mt.a("instructionTitlePortals", (byte) 125);
              if (var2_array == null) {
                break L170;
              } else {
                rl.field_s = jaa.a((byte) 36, var2_array);
                break L170;
              }
            }
            L171: {
              var2_array = mt.a("instructionTextPortals", (byte) 107);
              if (var2_array == null) {
                break L171;
              } else {
                bq.field_e = jaa.a((byte) 75, var2_array);
                break L171;
              }
            }
            L172: {
              var2_array = mt.a("instructionTitleLasers", (byte) 121);
              if (var2_array == null) {
                break L172;
              } else {
                rh.field_q = jaa.a((byte) 90, var2_array);
                break L172;
              }
            }
            L173: {
              var2_array = mt.a("instructionTextLasers", (byte) 122);
              if (var2_array != null) {
                km.field_n = jaa.a((byte) 91, var2_array);
                break L173;
              } else {
                break L173;
              }
            }
            L174: {
              var2_array = mt.a("instructionTitleMovingPlatforms", (byte) 106);
              if (var2_array == null) {
                break L174;
              } else {
                lda.field_G = jaa.a((byte) 114, var2_array);
                break L174;
              }
            }
            L175: {
              var2_array = mt.a("instructionTextMovingPlatforms", (byte) 102);
              if (var2_array == null) {
                break L175;
              } else {
                tr.field_d = jaa.a((byte) 107, var2_array);
                break L175;
              }
            }
            L176: {
              var2_array = mt.a("instructionTitlePressurePads", (byte) 101);
              if (var2_array != null) {
                uqa.field_t = jaa.a((byte) 84, var2_array);
                break L176;
              } else {
                break L176;
              }
            }
            L177: {
              var2_array = mt.a("instructionTextPressurePads", (byte) 113);
              if (null != var2_array) {
                at.field_R = jaa.a((byte) 54, var2_array);
                break L177;
              } else {
                break L177;
              }
            }
            L178: {
              var2_array = mt.a("instructionTitleRollingJonesboulders", (byte) 115);
              if (var2_array != null) {
                kd.field_z = jaa.a((byte) 57, var2_array);
                break L178;
              } else {
                break L178;
              }
            }
            L179: {
              var2_array = mt.a("instructionTextRollingJonesboulders", (byte) 127);
              if (null != var2_array) {
                vm.field_a = jaa.a((byte) 118, var2_array);
                break L179;
              } else {
                break L179;
              }
            }
            L180: {
              var2_array = mt.a("instructionTitleDiscOfDeathVendingMachines", (byte) 123);
              if (null != var2_array) {
                nea.field_b = jaa.a((byte) 124, var2_array);
                break L180;
              } else {
                break L180;
              }
            }
            L181: {
              var2_array = mt.a("instructionTextDiscOfDeathVendingMachines", (byte) 116);
              if (var2_array == null) {
                break L181;
              } else {
                wv.field_h = jaa.a((byte) 96, var2_array);
                break L181;
              }
            }
            L182: {
              var2_array = mt.a("instructionTitlePerpetuallySpinningDiscs", (byte) 111);
              if (var2_array != null) {
                gga.field_L = jaa.a((byte) 36, var2_array);
                break L182;
              } else {
                break L182;
              }
            }
            L183: {
              var2_array = mt.a("instructionTextPerpetuallySpinningDiscs", (byte) 120);
              if (var2_array != null) {
                kna.field_D = jaa.a((byte) 40, var2_array);
                break L183;
              } else {
                break L183;
              }
            }
            L184: {
              var2_array = mt.a("instructionTitleWhiteLightBeams", (byte) 123);
              if (var2_array == null) {
                break L184;
              } else {
                tu.field_d = jaa.a((byte) 33, var2_array);
                break L184;
              }
            }
            L185: {
              var2_array = mt.a("instructionTextWhiteLightBeams", (byte) 111);
              if (var2_array == null) {
                break L185;
              } else {
                ld.field_d = jaa.a((byte) 37, var2_array);
                break L185;
              }
            }
            L186: {
              var2_array = mt.a("instructionTitleWanderingWalls", (byte) 103);
              if (var2_array != null) {
                kva.field_r = jaa.a((byte) 106, var2_array);
                break L186;
              } else {
                break L186;
              }
            }
            L187: {
              var2_array = mt.a("instructionTextWanderingWalls", (byte) 117);
              if (var2_array == null) {
                break L187;
              } else {
                du.field_b = jaa.a((byte) 28, var2_array);
                break L187;
              }
            }
            L188: {
              var2_array = mt.a("instructionTitleMazes", (byte) 118);
              if (null == var2_array) {
                break L188;
              } else {
                sta.field_H = jaa.a((byte) 66, var2_array);
                break L188;
              }
            }
            L189: {
              var2_array = mt.a("instructionTextMazes", (byte) 105);
              if (var2_array != null) {
                fb.field_b = jaa.a((byte) 31, var2_array);
                break L189;
              } else {
                break L189;
              }
            }
            L190: {
              var2_array = mt.a("instructionTitleMoveableBlocks", (byte) 127);
              if (null == var2_array) {
                break L190;
              } else {
                er.field_J = jaa.a((byte) 42, var2_array);
                break L190;
              }
            }
            L191: {
              var2_array = mt.a("instructionTextMoveableBlocks", (byte) 123);
              if (var2_array != null) {
                gu.field_k = jaa.a((byte) 113, var2_array);
                break L191;
              } else {
                break L191;
              }
            }
            L192: {
              var2_array = mt.a("instructionTitlePistols", (byte) 104);
              if (var2_array == null) {
                break L192;
              } else {
                bn.field_o = jaa.a((byte) 98, var2_array);
                break L192;
              }
            }
            L193: {
              var2_array = mt.a("instructionTextPistols", (byte) 119);
              if (var2_array != null) {
                pna.field_k = jaa.a((byte) 104, var2_array);
                break L193;
              } else {
                break L193;
              }
            }
            L194: {
              var2_array = mt.a("instructionsPage1Title1", (byte) 117);
              if (var2_array != null) {
                ela.field_m = jaa.a((byte) 39, var2_array);
                break L194;
              } else {
                break L194;
              }
            }
            L195: {
              var2_array = mt.a("instructionsPage1Title2", (byte) 116);
              if (var2_array == null) {
                break L195;
              } else {
                fr.field_a = jaa.a((byte) 101, var2_array);
                break L195;
              }
            }
            L196: {
              var2_array = mt.a("instructionsPage1Title3", (byte) 127);
              if (var2_array != null) {
                qfa.field_a = jaa.a((byte) 51, var2_array);
                break L196;
              } else {
                break L196;
              }
            }
            L197: {
              var2_array = mt.a("instructionsPage1Text1", (byte) 108);
              if (var2_array == null) {
                break L197;
              } else {
                daa.field_f = jaa.a((byte) 31, var2_array);
                break L197;
              }
            }
            L198: {
              var2_array = mt.a("instructionsPage1Text2", (byte) 125);
              if (var2_array == null) {
                break L198;
              } else {
                ioa.field_o = jaa.a((byte) 93, var2_array);
                break L198;
              }
            }
            L199: {
              var2_array = mt.a("instructionsPage1Text3", (byte) 113);
              if (var2_array == null) {
                break L199;
              } else {
                mr.field_H = jaa.a((byte) 36, var2_array);
                break L199;
              }
            }
            L200: {
              var2_array = mt.a("instructionsPage1Text4", (byte) 126);
              if (var2_array != null) {
                uc.field_K = jaa.a((byte) 97, var2_array);
                break L200;
              } else {
                break L200;
              }
            }
            L201: {
              var2_array = mt.a("instructionsPage1Text5", (byte) 123);
              if (null != var2_array) {
                pba.field_c = jaa.a((byte) 90, var2_array);
                break L201;
              } else {
                break L201;
              }
            }
            L202: {
              var2_array = mt.a("instructionsPage1Text6", (byte) 116);
              if (var2_array != null) {
                hsa.field_c = jaa.a((byte) 100, var2_array);
                break L202;
              } else {
                break L202;
              }
            }
            L203: {
              var2_array = mt.a("loadingStrings,0", (byte) 100);
              if (var2_array == null) {
                break L203;
              } else {
                fv.field_d[0] = jaa.a((byte) 72, var2_array);
                break L203;
              }
            }
            L204: {
              var2_array = mt.a("loadingStrings,1", (byte) 107);
              if (null == var2_array) {
                break L204;
              } else {
                fv.field_d[1] = jaa.a((byte) 50, var2_array);
                break L204;
              }
            }
            L205: {
              var2_array = mt.a("loadingStrings,2", (byte) 125);
              if (var2_array == null) {
                break L205;
              } else {
                fv.field_d[2] = jaa.a((byte) 106, var2_array);
                break L205;
              }
            }
            L206: {
              var2_array = mt.a("loadingStrings,3", (byte) 105);
              if (var2_array == null) {
                break L206;
              } else {
                fv.field_d[3] = jaa.a((byte) 92, var2_array);
                break L206;
              }
            }
            L207: {
              var2_array = mt.a("loadingStrings,4", (byte) 110);
              if (null != var2_array) {
                fv.field_d[4] = jaa.a((byte) 46, var2_array);
                break L207;
              } else {
                break L207;
              }
            }
            L208: {
              var2_array = mt.a("loadingStrings,5", (byte) 101);
              if (null == var2_array) {
                break L208;
              } else {
                fv.field_d[5] = jaa.a((byte) 101, var2_array);
                break L208;
              }
            }
            L209: {
              var2_array = mt.a("loadingStrings,6", (byte) 124);
              if (null != var2_array) {
                fv.field_d[6] = jaa.a((byte) 81, var2_array);
                break L209;
              } else {
                break L209;
              }
            }
            L210: {
              var2_array = mt.a("loadingStrings,7", (byte) 126);
              if (var2_array != null) {
                fv.field_d[7] = jaa.a((byte) 27, var2_array);
                break L210;
              } else {
                break L210;
              }
            }
            L211: {
              var2_array = mt.a("loadingStrings,8", (byte) 125);
              if (null == var2_array) {
                break L211;
              } else {
                fv.field_d[8] = jaa.a((byte) 59, var2_array);
                break L211;
              }
            }
            L212: {
              var2_array = mt.a("loadingStrings,9", (byte) 111);
              if (null == var2_array) {
                break L212;
              } else {
                fv.field_d[9] = jaa.a((byte) 60, var2_array);
                break L212;
              }
            }
            L213: {
              var2_array = mt.a("loadingStrings,10", (byte) 104);
              if (var2_array == null) {
                break L213;
              } else {
                fv.field_d[10] = jaa.a((byte) 93, var2_array);
                break L213;
              }
            }
            L214: {
              var2_array = mt.a("loadingStrings,11", (byte) 120);
              if (var2_array == null) {
                break L214;
              } else {
                fv.field_d[11] = jaa.a((byte) 84, var2_array);
                break L214;
              }
            }
            L215: {
              var2_array = mt.a("loadingStrings,12", (byte) 119);
              if (null == var2_array) {
                break L215;
              } else {
                fv.field_d[12] = jaa.a((byte) 93, var2_array);
                break L215;
              }
            }
            L216: {
              var2_array = mt.a("loadingStrings,13", (byte) 127);
              if (var2_array == null) {
                break L216;
              } else {
                fv.field_d[13] = jaa.a((byte) 28, var2_array);
                break L216;
              }
            }
            L217: {
              var2_array = mt.a("loadingStrings,14", (byte) 106);
              if (var2_array == null) {
                break L217;
              } else {
                fv.field_d[14] = jaa.a((byte) 75, var2_array);
                break L217;
              }
            }
            L218: {
              var2_array = mt.a("loadingStrings,15", (byte) 127);
              if (var2_array == null) {
                break L218;
              } else {
                fv.field_d[15] = jaa.a((byte) 39, var2_array);
                break L218;
              }
            }
            L219: {
              var2_array = mt.a("loadingStrings,16", (byte) 121);
              if (null == var2_array) {
                break L219;
              } else {
                fv.field_d[16] = jaa.a((byte) 65, var2_array);
                break L219;
              }
            }
            L220: {
              var2_array = mt.a("loadingStrings,17", (byte) 120);
              if (var2_array != null) {
                fv.field_d[17] = jaa.a((byte) 114, var2_array);
                break L220;
              } else {
                break L220;
              }
            }
            L221: {
              var2_array = mt.a("loadingStrings,18", (byte) 124);
              if (null == var2_array) {
                break L221;
              } else {
                fv.field_d[18] = jaa.a((byte) 67, var2_array);
                break L221;
              }
            }
            L222: {
              var2_array = mt.a("waitingStrings,0", (byte) 108);
              if (var2_array == null) {
                break L222;
              } else {
                hca.field_U[0] = jaa.a((byte) 69, var2_array);
                break L222;
              }
            }
            L223: {
              var2_array = mt.a("waitingStrings,1", (byte) 117);
              if (null != var2_array) {
                hca.field_U[1] = jaa.a((byte) 94, var2_array);
                break L223;
              } else {
                break L223;
              }
            }
            L224: {
              var2_array = mt.a("waitingStrings,2", (byte) 124);
              if (null != var2_array) {
                hca.field_U[2] = jaa.a((byte) 117, var2_array);
                break L224;
              } else {
                break L224;
              }
            }
            L225: {
              var2_array = mt.a("waitingStrings,3", (byte) 107);
              if (var2_array != null) {
                hca.field_U[3] = jaa.a((byte) 118, var2_array);
                break L225;
              } else {
                break L225;
              }
            }
            L226: {
              var2_array = mt.a("waitingStrings,4", (byte) 114);
              if (var2_array == null) {
                break L226;
              } else {
                hca.field_U[4] = jaa.a((byte) 40, var2_array);
                break L226;
              }
            }
            L227: {
              var2_array = mt.a("waitingStrings,5", (byte) 117);
              if (var2_array != null) {
                hca.field_U[5] = jaa.a((byte) 53, var2_array);
                break L227;
              } else {
                break L227;
              }
            }
            L228: {
              var2_array = mt.a("waitingStrings,6", (byte) 107);
              if (var2_array == null) {
                break L228;
              } else {
                hca.field_U[6] = jaa.a((byte) 87, var2_array);
                break L228;
              }
            }
            L229: {
              var2_array = mt.a("waitingStrings,7", (byte) 105);
              if (var2_array == null) {
                break L229;
              } else {
                hca.field_U[7] = jaa.a((byte) 127, var2_array);
                break L229;
              }
            }
            L230: {
              var2_array = mt.a("waitingStrings,8", (byte) 112);
              if (var2_array != null) {
                hca.field_U[8] = jaa.a((byte) 101, var2_array);
                break L230;
              } else {
                break L230;
              }
            }
            L231: {
              var2_array = mt.a("waitingStrings,9", (byte) 110);
              if (null != var2_array) {
                hca.field_U[9] = jaa.a((byte) 55, var2_array);
                break L231;
              } else {
                break L231;
              }
            }
            L232: {
              var2_array = mt.a("waitingStrings,10", (byte) 126);
              if (null == var2_array) {
                break L232;
              } else {
                hca.field_U[10] = jaa.a((byte) 96, var2_array);
                break L232;
              }
            }
            L233: {
              var2_array = mt.a("waitingStrings,11", (byte) 103);
              if (var2_array != null) {
                hca.field_U[11] = jaa.a((byte) 100, var2_array);
                break L233;
              } else {
                break L233;
              }
            }
            L234: {
              var2_array = mt.a("waitingStrings,12", (byte) 122);
              if (null == var2_array) {
                break L234;
              } else {
                hca.field_U[12] = jaa.a((byte) 116, var2_array);
                break L234;
              }
            }
            L235: {
              var2_array = mt.a("waitingStrings,13", (byte) 110);
              if (var2_array == null) {
                break L235;
              } else {
                hca.field_U[13] = jaa.a((byte) 40, var2_array);
                break L235;
              }
            }
            L236: {
              var2_array = mt.a("waitingStrings,14", (byte) 100);
              if (var2_array == null) {
                break L236;
              } else {
                hca.field_U[14] = jaa.a((byte) 57, var2_array);
                break L236;
              }
            }
            L237: {
              var2_array = mt.a("waitingStrings,15", (byte) 104);
              if (var2_array != null) {
                hca.field_U[15] = jaa.a((byte) 84, var2_array);
                break L237;
              } else {
                break L237;
              }
            }
            L238: {
              var2_array = mt.a("waitingStrings,16", (byte) 107);
              if (var2_array != null) {
                hca.field_U[16] = jaa.a((byte) 57, var2_array);
                break L238;
              } else {
                break L238;
              }
            }
            L239: {
              var2_array = mt.a("waitingStrings,17", (byte) 102);
              if (null == var2_array) {
                break L239;
              } else {
                hca.field_U[17] = jaa.a((byte) 82, var2_array);
                break L239;
              }
            }
            L240: {
              var2_array = mt.a("waitingStrings,18", (byte) 117);
              if (var2_array == null) {
                break L240;
              } else {
                hca.field_U[18] = jaa.a((byte) 91, var2_array);
                break L240;
              }
            }
            L241: {
              var2_array = mt.a("unpackingStrings,0", (byte) 108);
              if (null != var2_array) {
                uba.field_g[0] = jaa.a((byte) 28, var2_array);
                break L241;
              } else {
                break L241;
              }
            }
            L242: {
              var2_array = mt.a("unpackingStrings,1", (byte) 109);
              if (null == var2_array) {
                break L242;
              } else {
                uba.field_g[1] = jaa.a((byte) 44, var2_array);
                break L242;
              }
            }
            L243: {
              var2_array = mt.a("unpackingStrings,2", (byte) 112);
              if (null != var2_array) {
                uba.field_g[2] = jaa.a((byte) 81, var2_array);
                break L243;
              } else {
                break L243;
              }
            }
            L244: {
              var2_array = mt.a("unpackingStrings,3", (byte) 126);
              if (var2_array != null) {
                uba.field_g[3] = jaa.a((byte) 67, var2_array);
                break L244;
              } else {
                break L244;
              }
            }
            L245: {
              var2_array = mt.a("unpackingStrings,4", (byte) 118);
              if (var2_array == null) {
                break L245;
              } else {
                uba.field_g[4] = jaa.a((byte) 26, var2_array);
                break L245;
              }
            }
            L246: {
              var2_array = mt.a("unpackingStrings,5", (byte) 101);
              if (var2_array == null) {
                break L246;
              } else {
                uba.field_g[5] = jaa.a((byte) 84, var2_array);
                break L246;
              }
            }
            L247: {
              var2_array = mt.a("unpackingStrings,6", (byte) 123);
              if (var2_array == null) {
                break L247;
              } else {
                uba.field_g[6] = jaa.a((byte) 49, var2_array);
                break L247;
              }
            }
            L248: {
              var2_array = mt.a("unpackingStrings,7", (byte) 127);
              if (var2_array == null) {
                break L248;
              } else {
                uba.field_g[7] = jaa.a((byte) 42, var2_array);
                break L248;
              }
            }
            L249: {
              var2_array = mt.a("unpackingStrings,8", (byte) 107);
              if (null != var2_array) {
                uba.field_g[8] = jaa.a((byte) 106, var2_array);
                break L249;
              } else {
                break L249;
              }
            }
            L250: {
              var2_array = mt.a("unpackingStrings,9", (byte) 115);
              if (var2_array != null) {
                uba.field_g[9] = jaa.a((byte) 46, var2_array);
                break L250;
              } else {
                break L250;
              }
            }
            L251: {
              var2_array = mt.a("unpackingStrings,10", (byte) 118);
              if (null != var2_array) {
                uba.field_g[10] = jaa.a((byte) 105, var2_array);
                break L251;
              } else {
                break L251;
              }
            }
            L252: {
              var2_array = mt.a("error", (byte) 113);
              if (var2_array == null) {
                break L252;
              } else {
                so.field_L = jaa.a((byte) 73, var2_array);
                break L252;
              }
            }
            L253: {
              var2_array = mt.a("pleaselogin", (byte) 105);
              if (null == var2_array) {
                break L253;
              } else {
                wja.field_o = jaa.a((byte) 79, var2_array);
                break L253;
              }
            }
            L254: {
              var2_array = mt.a("hint_drag", (byte) 115);
              if (null == var2_array) {
                break L254;
              } else {
                qja.field_k = jaa.a((byte) 26, var2_array);
                break L254;
              }
            }
            L255: {
              var2_array = mt.a("hint_drop", (byte) 112);
              if (null != var2_array) {
                hda.field_h = jaa.a((byte) 52, var2_array);
                break L255;
              } else {
                break L255;
              }
            }
            L256: {
              var2_array = mt.a("hint_sneak", (byte) 112);
              if (null == var2_array) {
                break L256;
              } else {
                aca.field_g = jaa.a((byte) 65, var2_array);
                break L256;
              }
            }
            L257: {
              var2_array = mt.a("hint_fire", (byte) 108);
              if (null != var2_array) {
                bb.field_l = jaa.a((byte) 66, var2_array);
                break L257;
              } else {
                break L257;
              }
            }
            L258: {
              var2_array = mt.a("item_keys", (byte) 107);
              if (var2_array == null) {
                break L258;
              } else {
                discarded$38 = jaa.a((byte) 78, var2_array);
                break L258;
              }
            }
            L259: {
              var2_array = mt.a("item_coins", (byte) 107);
              if (null == var2_array) {
                break L259;
              } else {
                lfa.field_m = jaa.a((byte) 91, var2_array);
                break L259;
              }
            }
            L260: {
              var2_array = mt.a("item_bags", (byte) 121);
              if (var2_array != null) {
                uha.field_s = jaa.a((byte) 49, var2_array);
                break L260;
              } else {
                break L260;
              }
            }
            L261: {
              var2_array = mt.a("item_idols", (byte) 100);
              if (var2_array == null) {
                break L261;
              } else {
                gla.field_o = jaa.a((byte) 96, var2_array);
                break L261;
              }
            }
            L262: {
              var2_array = mt.a("weapon_dartgun", (byte) 103);
              if (null == var2_array) {
                break L262;
              } else {
                vp.field_B = jaa.a((byte) 83, var2_array);
                break L262;
              }
            }
            L263: {
              var2_array = mt.a("weapon_machinegun", (byte) 104);
              if (var2_array != null) {
                tha.field_y = jaa.a((byte) 95, var2_array);
                break L263;
              } else {
                break L263;
              }
            }
            L264: {
              var2_array = mt.a("weapon_shotgun", (byte) 125);
              if (var2_array == null) {
                break L264;
              } else {
                gqa.field_a = jaa.a((byte) 62, var2_array);
                break L264;
              }
            }
            L265: {
              var2_array = mt.a("weapon_flaregun", (byte) 117);
              if (null != var2_array) {
                bfa.field_b = jaa.a((byte) 70, var2_array);
                break L265;
              } else {
                break L265;
              }
            }
            L266: {
              var2_array = mt.a("weapon_flamer", (byte) 119);
              if (var2_array == null) {
                break L266;
              } else {
                sl.field_d = jaa.a((byte) 103, var2_array);
                break L266;
              }
            }
            L267: {
              var2_array = mt.a("weapon_flamershort", (byte) 101);
              if (var2_array == null) {
                break L267;
              } else {
                wta.field_H = jaa.a((byte) 61, var2_array);
                break L267;
              }
            }
            L268: {
              var2_array = mt.a("weapon_flamerblue", (byte) 113);
              if (var2_array == null) {
                break L268;
              } else {
                tv.field_ub = jaa.a((byte) 96, var2_array);
                break L268;
              }
            }
            L269: {
              var2_array = mt.a("weapon_waterspray", (byte) 101);
              if (null != var2_array) {
                bf.field_f = jaa.a((byte) 96, var2_array);
                break L269;
              } else {
                break L269;
              }
            }
            L270: {
              var2_array = mt.a("weapon_bladelauncher", (byte) 116);
              if (null == var2_array) {
                break L270;
              } else {
                aka.field_A = jaa.a((byte) 47, var2_array);
                break L270;
              }
            }
            L271: {
              var2_array = mt.a("weapon_fireball", (byte) 112);
              if (var2_array != null) {
                hg.field_d = jaa.a((byte) 72, var2_array);
                break L271;
              } else {
                break L271;
              }
            }
            L272: {
              var2_array = mt.a("weapon_bouncingfireball", (byte) 124);
              if (var2_array != null) {
                kga.field_q = jaa.a((byte) 106, var2_array);
                break L272;
              } else {
                break L272;
              }
            }
            L273: {
              var2_array = mt.a("weapon_freezer", (byte) 114);
              if (null == var2_array) {
                break L273;
              } else {
                fp.field_b = jaa.a((byte) 89, var2_array);
                break L273;
              }
            }
            L274: {
              var2_array = mt.a("weapon_revolver", (byte) 127);
              if (var2_array != null) {
                uj.field_e = jaa.a((byte) 37, var2_array);
                break L274;
              } else {
                break L274;
              }
            }
            L275: {
              var2_array = mt.a("pos_1st", (byte) 113);
              if (var2_array != null) {
                fma.field_d = jaa.a((byte) 39, var2_array);
                break L275;
              } else {
                break L275;
              }
            }
            L276: {
              var2_array = mt.a("pos_2nd", (byte) 101);
              if (var2_array == null) {
                break L276;
              } else {
                bqa.field_g = jaa.a((byte) 45, var2_array);
                break L276;
              }
            }
            L277: {
              var2_array = mt.a("pos_3rd", (byte) 118);
              if (var2_array == null) {
                break L277;
              } else {
                vh.field_b = jaa.a((byte) 58, var2_array);
                break L277;
              }
            }
            L278: {
              var2_array = mt.a("pos_4th", (byte) 105);
              if (null == var2_array) {
                break L278;
              } else {
                tda.field_b = jaa.a((byte) 59, var2_array);
                break L278;
              }
            }
            L279: {
              var2_array = mt.a("pos_resigned", (byte) 116);
              if (null == var2_array) {
                break L279;
              } else {
                ik.field_j = jaa.a((byte) 46, var2_array);
                break L279;
              }
            }
            L280: {
              var2_array = mt.a("pos_completed", (byte) 117);
              if (var2_array == null) {
                break L280;
              } else {
                ad.field_i = jaa.a((byte) 91, var2_array);
                break L280;
              }
            }
            L281: {
              var2_array = mt.a("pos_dnf", (byte) 117);
              if (var2_array == null) {
                break L281;
              } else {
                re.field_b = jaa.a((byte) 25, var2_array);
                break L281;
              }
            }
            L282: {
              var2_array = mt.a("resigned", (byte) 106);
              if (null != var2_array) {
                id.field_i = jaa.a((byte) 102, var2_array);
                break L282;
              } else {
                break L282;
              }
            }
            L283: {
              var2_array = mt.a("won_x_rounds", (byte) 112);
              if (var2_array == null) {
                break L283;
              } else {
                ga.field_K = jaa.a((byte) 119, var2_array);
                break L283;
              }
            }
            L284: {
              var2_array = mt.a("offering_rematch", (byte) 105);
              if (null != var2_array) {
                w.field_d = jaa.a((byte) 33, var2_array);
                break L284;
              } else {
                break L284;
              }
            }
            L285: {
              var2_array = mt.a("rank", (byte) 122);
              if (var2_array == null) {
                break L285;
              } else {
                hl.field_a = jaa.a((byte) 65, var2_array);
                break L285;
              }
            }
            L286: {
              var2_array = mt.a("fivehunderedplus", (byte) 118);
              if (null != var2_array) {
                kha.field_a = jaa.a((byte) 105, var2_array);
                break L286;
              } else {
                break L286;
              }
            }
            L287: {
              var2_array = mt.a("graphicsmode", (byte) 101);
              if (null != var2_array) {
                dna.field_I = jaa.a((byte) 45, var2_array);
                break L287;
              } else {
                break L287;
              }
            }
            L288: {
              var2_array = mt.a("graphicsquality", (byte) 110);
              if (var2_array != null) {
                bc.field_a = jaa.a((byte) 46, var2_array);
                break L288;
              } else {
                break L288;
              }
            }
            L289: {
              var2_array = mt.a("slowmoveshift", (byte) 110);
              if (var2_array != null) {
                pg.field_A = jaa.a((byte) 103, var2_array);
                break L289;
              } else {
                break L289;
              }
            }
            L290: {
              var2_array = mt.a("slowmovegood", (byte) 119);
              if (var2_array == null) {
                break L290;
              } else {
                gka.field_f = jaa.a((byte) 32, var2_array);
                break L290;
              }
            }
            L291: {
              var2_array = mt.a("slowmovemove", (byte) 127);
              if (null == var2_array) {
                break L291;
              } else {
                qqa.field_p = jaa.a((byte) 102, var2_array);
                break L291;
              }
            }
            L292: {
              var2_array = mt.a("room_X_of_Y", (byte) 116);
              if (null == var2_array) {
                break L292;
              } else {
                mg.field_k = jaa.a((byte) 71, var2_array);
                break L292;
              }
            }
            L293: {
              var2_array = mt.a("completed", (byte) 104);
              if (var2_array == null) {
                break L293;
              } else {
                iaa.field_a = jaa.a((byte) 50, var2_array);
                break L293;
              }
            }
            L294: {
              var2_array = mt.a("failed", (byte) 108);
              if (var2_array == null) {
                break L294;
              } else {
                wpa.field_K = jaa.a((byte) 43, var2_array);
                break L294;
              }
            }
            L295: {
              var2_array = mt.a("out_of_time", (byte) 112);
              if (null == var2_array) {
                break L295;
              } else {
                sg.field_n = jaa.a((byte) 117, var2_array);
                break L295;
              }
            }
            L296: {
              var2_array = mt.a("finish_time_colon", (byte) 104);
              if (var2_array != null) {
                cc.field_l = jaa.a((byte) 107, var2_array);
                break L296;
              } else {
                break L296;
              }
            }
            L297: {
              var2_array = mt.a("msg_finished", (byte) 119);
              if (null != var2_array) {
                ara.field_yb = jaa.a((byte) 102, var2_array);
                break L297;
              } else {
                break L297;
              }
            }
            L298: {
              var2_array = mt.a("msg_failedtofinish", (byte) 107);
              if (var2_array == null) {
                break L298;
              } else {
                at.field_Q = jaa.a((byte) 115, var2_array);
                break L298;
              }
            }
            L299: {
              var2_array = mt.a("msg_timeup", (byte) 114);
              if (var2_array != null) {
                hu.field_a = jaa.a((byte) 126, var2_array);
                break L299;
              } else {
                break L299;
              }
            }
            L300: {
              var2_array = mt.a("msg_chosen_character", (byte) 117);
              if (var2_array == null) {
                break L300;
              } else {
                coa.field_n = jaa.a((byte) 112, var2_array);
                break L300;
              }
            }
            L301: {
              var2_array = mt.a("msg_chosen_reward", (byte) 112);
              if (null == var2_array) {
                break L301;
              } else {
                fva.field_b = jaa.a((byte) 109, var2_array);
                break L301;
              }
            }
            L302: {
              var2_array = mt.a("msg_didnt_choose_reward", (byte) 125);
              if (var2_array != null) {
                oba.field_n = jaa.a((byte) 43, var2_array);
                break L302;
              } else {
                break L302;
              }
            }
            L303: {
              var2_array = mt.a("roundover_winner", (byte) 123);
              if (null != var2_array) {
                ru.field_a = jaa.a((byte) 47, var2_array);
                break L303;
              } else {
                break L303;
              }
            }
            L304: {
              var2_array = mt.a("gameover", (byte) 106);
              if (null != var2_array) {
                discarded$39 = jaa.a((byte) 89, var2_array);
                break L304;
              } else {
                break L304;
              }
            }
            L305: {
              var2_array = mt.a("gameover_aborted", (byte) 125);
              if (var2_array != null) {
                discarded$40 = jaa.a((byte) 66, var2_array);
                break L305;
              } else {
                break L305;
              }
            }
            L306: {
              var2_array = mt.a("gameover_winner", (byte) 117);
              if (var2_array == null) {
                break L306;
              } else {
                discarded$41 = jaa.a((byte) 119, var2_array);
                break L306;
              }
            }
            L307: {
              var2_array = mt.a("gameover_completed", (byte) 107);
              if (var2_array == null) {
                break L307;
              } else {
                discarded$42 = jaa.a((byte) 125, var2_array);
                break L307;
              }
            }
            L308: {
              var2_array = mt.a("choose_character", (byte) 110);
              if (var2_array == null) {
                break L308;
              } else {
                gta.field_a = jaa.a((byte) 107, var2_array);
                break L308;
              }
            }
            L309: {
              var2_array = mt.a("choose_reward", (byte) 106);
              if (null != var2_array) {
                us.field_c = jaa.a((byte) 102, var2_array);
                break L309;
              } else {
                break L309;
              }
            }
            L310: {
              var2_array = mt.a("choose_reward_timeleft", (byte) 124);
              if (var2_array == null) {
                break L310;
              } else {
                tla.field_h = jaa.a((byte) 35, var2_array);
                break L310;
              }
            }
            L311: {
              var2_array = mt.a("waiting_for_others", (byte) 126);
              if (var2_array != null) {
                jsa.field_F = jaa.a((byte) 67, var2_array);
                break L311;
              } else {
                break L311;
              }
            }
            L312: {
              var2_array = mt.a("waiting_for", (byte) 127);
              if (var2_array == null) {
                break L312;
              } else {
                cba.field_c = jaa.a((byte) 28, var2_array);
                break L312;
              }
            }
            L313: {
              var2_array = mt.a("time_remaining", (byte) 100);
              if (null == var2_array) {
                break L313;
              } else {
                discarded$43 = jaa.a((byte) 44, var2_array);
                break L313;
              }
            }
            L314: {
              var2_array = mt.a("finish_order", (byte) 112);
              if (null != var2_array) {
                rl.field_v = jaa.a((byte) 78, var2_array);
                break L314;
              } else {
                break L314;
              }
            }
            L315: {
              var2_array = mt.a("spectator", (byte) 124);
              if (null != var2_array) {
                dpa.field_c = jaa.a((byte) 78, var2_array);
                break L315;
              } else {
                break L315;
              }
            }
            L316: {
              var2_array = mt.a("watching", (byte) 113);
              if (null == var2_array) {
                break L316;
              } else {
                voa.field_q = jaa.a((byte) 71, var2_array);
                break L316;
              }
            }
            L317: {
              var2_array = mt.a("round", (byte) 125);
              if (var2_array == null) {
                break L317;
              } else {
                uqa.field_z = jaa.a((byte) 57, var2_array);
                break L317;
              }
            }
            L318: {
              var2_array = mt.a("get_ready", (byte) 104);
              if (var2_array != null) {
                hua.field_b = jaa.a((byte) 67, var2_array);
                break L318;
              } else {
                break L318;
              }
            }
            L319: {
              var2_array = mt.a("gogogo", (byte) 106);
              if (var2_array != null) {
                jh.field_J = jaa.a((byte) 73, var2_array);
                break L319;
              } else {
                break L319;
              }
            }
            L320: {
              var2_array = mt.a("waiting_for_sync", (byte) 104);
              if (var2_array == null) {
                break L320;
              } else {
                hu.field_d = jaa.a((byte) 87, var2_array);
                break L320;
              }
            }
            L321: {
              var2_array = mt.a("treasure_values", (byte) 102);
              if (null == var2_array) {
                break L321;
              } else {
                wj.field_b = jaa.a((byte) 56, var2_array);
                break L321;
              }
            }
            L322: {
              var2_array = mt.a("treasure_total", (byte) 126);
              if (null != var2_array) {
                rja.field_c = jaa.a((byte) 42, var2_array);
                break L322;
              } else {
                break L322;
              }
            }
            L323: {
              var2_array = mt.a("points", (byte) 123);
              if (null == var2_array) {
                break L323;
              } else {
                nsa.field_f = jaa.a((byte) 93, var2_array);
                break L323;
              }
            }
            L324: {
              var2_array = mt.a("room_points", (byte) 101);
              if (var2_array == null) {
                break L324;
              } else {
                bca.field_c = jaa.a((byte) 43, var2_array);
                break L324;
              }
            }
            L325: {
              var2_array = mt.a("room_complete_points", (byte) 121);
              if (null == var2_array) {
                break L325;
              } else {
                gla.field_q = jaa.a((byte) 107, var2_array);
                break L325;
              }
            }
            L326: {
              var2_array = mt.a("room_complete_points_with_bonus", (byte) 121);
              if (null == var2_array) {
                break L326;
              } else {
                wpa.field_J = jaa.a((byte) 72, var2_array);
                break L326;
              }
            }
            L327: {
              var2_array = mt.a("penalty_death", (byte) 125);
              if (null != var2_array) {
                uta.field_n = jaa.a((byte) 59, var2_array);
                break L327;
              } else {
                break L327;
              }
            }
            L328: {
              var2_array = mt.a("penalty_reset", (byte) 117);
              if (null == var2_array) {
                break L328;
              } else {
                rf.field_a = jaa.a((byte) 92, var2_array);
                break L328;
              }
            }
            L329: {
              var2_array = mt.a("final_score_colon", (byte) 107);
              if (var2_array != null) {
                discarded$44 = jaa.a((byte) 66, var2_array);
                break L329;
              } else {
                break L329;
              }
            }
            L330: {
              var2_array = mt.a("powerdown_from", (byte) 103);
              if (var2_array != null) {
                discarded$45 = jaa.a((byte) 100, var2_array);
                break L330;
              } else {
                break L330;
              }
            }
            L331: {
              var2_array = mt.a("powerdown_pending", (byte) 116);
              if (var2_array != null) {
                discarded$46 = jaa.a((byte) 115, var2_array);
                break L331;
              } else {
                break L331;
              }
            }
            L332: {
              var2_array = mt.a("reward_coin15", (byte) 120);
              if (var2_array == null) {
                break L332;
              } else {
                sea.field_p = jaa.a((byte) 92, var2_array);
                break L332;
              }
            }
            L333: {
              var2_array = mt.a("reward_coin10", (byte) 115);
              if (var2_array == null) {
                break L333;
              } else {
                mu.field_wb = jaa.a((byte) 124, var2_array);
                break L333;
              }
            }
            L334: {
              var2_array = mt.a("reward_coin5", (byte) 108);
              if (null != var2_array) {
                so.field_J = jaa.a((byte) 27, var2_array);
                break L334;
              } else {
                break L334;
              }
            }
            L335: {
              var2_array = mt.a("reward_bag2", (byte) 103);
              if (null == var2_array) {
                break L335;
              } else {
                tja.field_p = jaa.a((byte) 72, var2_array);
                break L335;
              }
            }
            L336: {
              var2_array = mt.a("reward_bagx2", (byte) 124);
              if (null != var2_array) {
                sda.field_h = jaa.a((byte) 115, var2_array);
                break L336;
              } else {
                break L336;
              }
            }
            L337: {
              var2_array = mt.a("reward_idol1", (byte) 101);
              if (var2_array != null) {
                ds.field_k = jaa.a((byte) 123, var2_array);
                break L337;
              } else {
                break L337;
              }
            }
            L338: {
              var2_array = mt.a("reward_idolx2", (byte) 105);
              if (null == var2_array) {
                break L338;
              } else {
                bha.field_x = jaa.a((byte) 46, var2_array);
                break L338;
              }
            }
            L339: {
              var2_array = mt.a("reward_none", (byte) 127);
              if (null != var2_array) {
                discarded$47 = jaa.a((byte) 63, var2_array);
                break L339;
              } else {
                break L339;
              }
            }
            L340: {
              var2_array = mt.a("reward_taken", (byte) 119);
              if (var2_array != null) {
                discarded$48 = jaa.a((byte) 83, var2_array);
                break L340;
              } else {
                break L340;
              }
            }
            L341: {
              var2_array = mt.a("reward_none_waiting", (byte) 116);
              if (var2_array == null) {
                break L341;
              } else {
                g.field_i = jaa.a((byte) 35, var2_array);
                break L341;
              }
            }
            L342: {
              var2_array = mt.a("reward_none_dnf", (byte) 123);
              if (null == var2_array) {
                break L342;
              } else {
                cs.field_b = jaa.a((byte) 104, var2_array);
                break L342;
              }
            }
            L343: {
              var2_array = mt.a("reward_none_timeout", (byte) 121);
              if (var2_array == null) {
                break L343;
              } else {
                cga.field_l = jaa.a((byte) 67, var2_array);
                break L343;
              }
            }
            L344: {
              var2_array = mt.a("reward_none_choosing", (byte) 113);
              if (var2_array != null) {
                bp.field_o = jaa.a((byte) 79, var2_array);
                break L344;
              } else {
                break L344;
              }
            }
            L345: {
              var2_array = mt.a("unlock_character", (byte) 100);
              if (var2_array == null) {
                break L345;
              } else {
                gv.field_v = jaa.a((byte) 86, var2_array);
                break L345;
              }
            }
            L346: {
              var2_array = mt.a("unlock_tier", (byte) 109);
              if (var2_array == null) {
                break L346;
              } else {
                r.field_k = jaa.a((byte) 94, var2_array);
                break L346;
              }
            }
            L347: {
              var2_array = mt.a("name_ace", (byte) 124);
              if (null == var2_array) {
                break L347;
              } else {
                gh.field_e = jaa.a((byte) 126, var2_array);
                break L347;
              }
            }
            L348: {
              var2_array = mt.a("name_angelio", (byte) 103);
              if (null != var2_array) {
                hra.field_a = jaa.a((byte) 71, var2_array);
                break L348;
              } else {
                break L348;
              }
            }
            L349: {
              var2_array = mt.a("name_baroness", (byte) 109);
              if (var2_array == null) {
                break L349;
              } else {
                poa.field_p = jaa.a((byte) 52, var2_array);
                break L349;
              }
            }
            L350: {
              var2_array = mt.a("name_borees", (byte) 125);
              if (var2_array != null) {
                kma.field_d = jaa.a((byte) 45, var2_array);
                break L350;
              } else {
                break L350;
              }
            }
            L351: {
              var2_array = mt.a("name_bruce", (byte) 109);
              if (var2_array != null) {
                dfa.field_a = jaa.a((byte) 62, var2_array);
                break L351;
              } else {
                break L351;
              }
            }
            L352: {
              var2_array = mt.a("name_feng", (byte) 121);
              if (null != var2_array) {
                vg.field_b = jaa.a((byte) 90, var2_array);
                break L352;
              } else {
                break L352;
              }
            }
            L353: {
              var2_array = mt.a("name_hans", (byte) 126);
              if (var2_array != null) {
                pt.field_q = jaa.a((byte) 31, var2_array);
                break L353;
              } else {
                break L353;
              }
            }
            L354: {
              var2_array = mt.a("name_henryj", (byte) 124);
              if (null == var2_array) {
                break L354;
              } else {
                iea.field_e = jaa.a((byte) 126, var2_array);
                break L354;
              }
            }
            L355: {
              var2_array = mt.a("name_jamille", (byte) 113);
              if (var2_array == null) {
                break L355;
              } else {
                sda.field_k = jaa.a((byte) 71, var2_array);
                break L355;
              }
            }
            L356: {
              var2_array = mt.a("name_johnsson", (byte) 113);
              if (null != var2_array) {
                rha.field_h = jaa.a((byte) 34, var2_array);
                break L356;
              } else {
                break L356;
              }
            }
            L357: {
              var2_array = mt.a("name_piles", (byte) 119);
              if (var2_array != null) {
                pha.field_Ib = jaa.a((byte) 106, var2_array);
                break L357;
              } else {
                break L357;
              }
            }
            L358: {
              var2_array = mt.a("name_scarlett", (byte) 117);
              if (null != var2_array) {
                msa.field_b = jaa.a((byte) 126, var2_array);
                break L358;
              } else {
                break L358;
              }
            }
            L359: {
              var2_array = mt.a("name_wilbur", (byte) 119);
              if (null != var2_array) {
                tr.field_e = jaa.a((byte) 98, var2_array);
                break L359;
              } else {
                break L359;
              }
            }
            L360: {
              var2_array = mt.a("death_unknown,0", (byte) 102);
              if (var2_array != null) {
                kla.field_a[0] = jaa.a((byte) 59, var2_array);
                break L360;
              } else {
                break L360;
              }
            }
            L361: {
              var2_array = mt.a("death_unknown,1", (byte) 104);
              if (var2_array == null) {
                break L361;
              } else {
                kla.field_a[1] = jaa.a((byte) 116, var2_array);
                break L361;
              }
            }
            L362: {
              var2_array = mt.a("death_unknown,2", (byte) 118);
              if (var2_array == null) {
                break L362;
              } else {
                kla.field_a[2] = jaa.a((byte) 121, var2_array);
                break L362;
              }
            }
            L363: {
              var2_array = mt.a("death_reset,0", (byte) 100);
              if (var2_array == null) {
                break L363;
              } else {
                si.field_F[0] = jaa.a((byte) 127, var2_array);
                break L363;
              }
            }
            L364: {
              var2_array = mt.a("death_reset,1", (byte) 102);
              if (null != var2_array) {
                si.field_F[1] = jaa.a((byte) 61, var2_array);
                break L364;
              } else {
                break L364;
              }
            }
            L365: {
              var2_array = mt.a("death_reset,2", (byte) 108);
              if (null == var2_array) {
                break L365;
              } else {
                si.field_F[2] = jaa.a((byte) 89, var2_array);
                break L365;
              }
            }
            L366: {
              var2_array = mt.a("death_reset,3", (byte) 107);
              if (var2_array != null) {
                si.field_F[3] = jaa.a((byte) 37, var2_array);
                break L366;
              } else {
                break L366;
              }
            }
            L367: {
              var2_array = mt.a("death_reset,4", (byte) 120);
              if (var2_array != null) {
                si.field_F[4] = jaa.a((byte) 79, var2_array);
                break L367;
              } else {
                break L367;
              }
            }
            L368: {
              var2_array = mt.a("death_reset,5", (byte) 105);
              if (var2_array != null) {
                si.field_F[5] = jaa.a((byte) 108, var2_array);
                break L368;
              } else {
                break L368;
              }
            }
            L369: {
              var2_array = mt.a("death_reset,6", (byte) 110);
              if (null != var2_array) {
                si.field_F[6] = jaa.a((byte) 90, var2_array);
                break L369;
              } else {
                break L369;
              }
            }
            L370: {
              var2_array = mt.a("death_reset,7", (byte) 121);
              if (var2_array != null) {
                si.field_F[7] = jaa.a((byte) 25, var2_array);
                break L370;
              } else {
                break L370;
              }
            }
            L371: {
              var2_array = mt.a("death_reset,8", (byte) 123);
              if (var2_array == null) {
                break L371;
              } else {
                si.field_F[8] = jaa.a((byte) 88, var2_array);
                break L371;
              }
            }
            L372: {
              var2_array = mt.a("death_squishedhorizontal,0", (byte) 107);
              if (null != var2_array) {
                nta.field_b[0] = jaa.a((byte) 127, var2_array);
                break L372;
              } else {
                break L372;
              }
            }
            L373: {
              var2_array = mt.a("death_squishedhorizontal,1", (byte) 119);
              if (var2_array != null) {
                nta.field_b[1] = jaa.a((byte) 121, var2_array);
                break L373;
              } else {
                break L373;
              }
            }
            L374: {
              var2_array = mt.a("death_squishedhorizontal,2", (byte) 117);
              if (null != var2_array) {
                nta.field_b[2] = jaa.a((byte) 42, var2_array);
                break L374;
              } else {
                break L374;
              }
            }
            L375: {
              var2_array = mt.a("death_squishedhorizontal,3", (byte) 126);
              if (var2_array != null) {
                nta.field_b[3] = jaa.a((byte) 32, var2_array);
                break L375;
              } else {
                break L375;
              }
            }
            L376: {
              var2_array = mt.a("death_squishedhorizontal,4", (byte) 109);
              if (null != var2_array) {
                nta.field_b[4] = jaa.a((byte) 115, var2_array);
                break L376;
              } else {
                break L376;
              }
            }
            L377: {
              var2_array = mt.a("death_squishedhorizontal,5", (byte) 118);
              if (var2_array != null) {
                nta.field_b[5] = jaa.a((byte) 85, var2_array);
                break L377;
              } else {
                break L377;
              }
            }
            L378: {
              var2_array = mt.a("death_squishedhorizontal,6", (byte) 126);
              if (var2_array == null) {
                break L378;
              } else {
                nta.field_b[6] = jaa.a((byte) 100, var2_array);
                break L378;
              }
            }
            L379: {
              var2_array = mt.a("death_squishedhorizontal,7", (byte) 118);
              if (var2_array == null) {
                break L379;
              } else {
                nta.field_b[7] = jaa.a((byte) 27, var2_array);
                break L379;
              }
            }
            L380: {
              var2_array = mt.a("death_squishedvertical,0", (byte) 125);
              if (null == var2_array) {
                break L380;
              } else {
                or.field_m[0] = jaa.a((byte) 98, var2_array);
                break L380;
              }
            }
            L381: {
              var2_array = mt.a("death_squishedvertical,1", (byte) 103);
              if (var2_array != null) {
                or.field_m[1] = jaa.a((byte) 36, var2_array);
                break L381;
              } else {
                break L381;
              }
            }
            L382: {
              var2_array = mt.a("death_squishedvertical,2", (byte) 110);
              if (var2_array != null) {
                or.field_m[2] = jaa.a((byte) 87, var2_array);
                break L382;
              } else {
                break L382;
              }
            }
            L383: {
              var2_array = mt.a("death_squishedvertical,3", (byte) 117);
              if (var2_array != null) {
                or.field_m[3] = jaa.a((byte) 113, var2_array);
                break L383;
              } else {
                break L383;
              }
            }
            L384: {
              var2_array = mt.a("death_squishedvertical,4", (byte) 102);
              if (null != var2_array) {
                or.field_m[4] = jaa.a((byte) 120, var2_array);
                break L384;
              } else {
                break L384;
              }
            }
            L385: {
              var2_array = mt.a("death_squishedvertical,5", (byte) 104);
              if (var2_array == null) {
                break L385;
              } else {
                or.field_m[5] = jaa.a((byte) 99, var2_array);
                break L385;
              }
            }
            L386: {
              var2_array = mt.a("death_squishedvertical,6", (byte) 109);
              if (null == var2_array) {
                break L386;
              } else {
                or.field_m[6] = jaa.a((byte) 96, var2_array);
                break L386;
              }
            }
            L387: {
              var2_array = mt.a("death_fell,0", (byte) 121);
              if (var2_array != null) {
                tia.field_c[0] = jaa.a((byte) 113, var2_array);
                break L387;
              } else {
                break L387;
              }
            }
            L388: {
              var2_array = mt.a("death_fell,1", (byte) 101);
              if (null != var2_array) {
                tia.field_c[1] = jaa.a((byte) 59, var2_array);
                break L388;
              } else {
                break L388;
              }
            }
            L389: {
              var2_array = mt.a("death_fell,2", (byte) 103);
              if (null != var2_array) {
                tia.field_c[2] = jaa.a((byte) 65, var2_array);
                break L389;
              } else {
                break L389;
              }
            }
            L390: {
              var2_array = mt.a("death_fell,3", (byte) 117);
              if (null == var2_array) {
                break L390;
              } else {
                tia.field_c[3] = jaa.a((byte) 101, var2_array);
                break L390;
              }
            }
            L391: {
              var2_array = mt.a("death_fell,4", (byte) 122);
              if (null != var2_array) {
                tia.field_c[4] = jaa.a((byte) 26, var2_array);
                break L391;
              } else {
                break L391;
              }
            }
            L392: {
              var2_array = mt.a("death_fell,5", (byte) 122);
              if (null != var2_array) {
                tia.field_c[5] = jaa.a((byte) 75, var2_array);
                break L392;
              } else {
                break L392;
              }
            }
            L393: {
              var2_array = mt.a("death_fell,6", (byte) 118);
              if (null == var2_array) {
                break L393;
              } else {
                tia.field_c[6] = jaa.a((byte) 114, var2_array);
                break L393;
              }
            }
            L394: {
              var2_array = mt.a("death_fell,7", (byte) 112);
              if (null != var2_array) {
                tia.field_c[7] = jaa.a((byte) 38, var2_array);
                break L394;
              } else {
                break L394;
              }
            }
            L395: {
              var2_array = mt.a("death_lava,0", (byte) 100);
              if (var2_array == null) {
                break L395;
              } else {
                up.field_d[0] = jaa.a((byte) 51, var2_array);
                break L395;
              }
            }
            L396: {
              var2_array = mt.a("death_lava,1", (byte) 124);
              if (null != var2_array) {
                up.field_d[1] = jaa.a((byte) 81, var2_array);
                break L396;
              } else {
                break L396;
              }
            }
            L397: {
              var2_array = mt.a("death_lava,2", (byte) 110);
              if (null == var2_array) {
                break L397;
              } else {
                up.field_d[2] = jaa.a((byte) 74, var2_array);
                break L397;
              }
            }
            L398: {
              var2_array = mt.a("death_lava,3", (byte) 121);
              if (var2_array == null) {
                break L398;
              } else {
                up.field_d[3] = jaa.a((byte) 115, var2_array);
                break L398;
              }
            }
            L399: {
              var2_array = mt.a("death_lava,4", (byte) 123);
              if (null != var2_array) {
                up.field_d[4] = jaa.a((byte) 51, var2_array);
                break L399;
              } else {
                break L399;
              }
            }
            L400: {
              var2_array = mt.a("death_lava,5", (byte) 113);
              if (var2_array == null) {
                break L400;
              } else {
                up.field_d[5] = jaa.a((byte) 110, var2_array);
                break L400;
              }
            }
            L401: {
              var2_array = mt.a("death_snake,0", (byte) 101);
              if (var2_array != null) {
                fpa.field_b[0] = jaa.a((byte) 109, var2_array);
                break L401;
              } else {
                break L401;
              }
            }
            L402: {
              var2_array = mt.a("death_snake,1", (byte) 116);
              if (null == var2_array) {
                break L402;
              } else {
                fpa.field_b[1] = jaa.a((byte) 89, var2_array);
                break L402;
              }
            }
            L403: {
              var2_array = mt.a("death_snake,2", (byte) 101);
              if (var2_array == null) {
                break L403;
              } else {
                fpa.field_b[2] = jaa.a((byte) 30, var2_array);
                break L403;
              }
            }
            L404: {
              var2_array = mt.a("death_snake,3", (byte) 111);
              if (var2_array == null) {
                break L404;
              } else {
                fpa.field_b[3] = jaa.a((byte) 121, var2_array);
                break L404;
              }
            }
            L405: {
              var2_array = mt.a("death_snake,4", (byte) 107);
              if (var2_array == null) {
                break L405;
              } else {
                fpa.field_b[4] = jaa.a((byte) 93, var2_array);
                break L405;
              }
            }
            L406: {
              var2_array = mt.a("death_snake,5", (byte) 126);
              if (var2_array != null) {
                fpa.field_b[5] = jaa.a((byte) 126, var2_array);
                break L406;
              } else {
                break L406;
              }
            }
            L407: {
              var2_array = mt.a("death_snake,6", (byte) 116);
              if (null == var2_array) {
                break L407;
              } else {
                fpa.field_b[6] = jaa.a((byte) 31, var2_array);
                break L407;
              }
            }
            L408: {
              var2_array = mt.a("death_skeleton,0", (byte) 117);
              if (null != var2_array) {
                gca.field_j[0] = jaa.a((byte) 69, var2_array);
                break L408;
              } else {
                break L408;
              }
            }
            L409: {
              var2_array = mt.a("death_skeleton,1", (byte) 101);
              if (null == var2_array) {
                break L409;
              } else {
                gca.field_j[1] = jaa.a((byte) 113, var2_array);
                break L409;
              }
            }
            L410: {
              var2_array = mt.a("death_skeleton,2", (byte) 106);
              if (null != var2_array) {
                gca.field_j[2] = jaa.a((byte) 79, var2_array);
                break L410;
              } else {
                break L410;
              }
            }
            L411: {
              var2_array = mt.a("death_skeleton,3", (byte) 109);
              if (var2_array == null) {
                break L411;
              } else {
                gca.field_j[3] = jaa.a((byte) 60, var2_array);
                break L411;
              }
            }
            L412: {
              var2_array = mt.a("death_skeleton,4", (byte) 107);
              if (var2_array == null) {
                break L412;
              } else {
                gca.field_j[4] = jaa.a((byte) 69, var2_array);
                break L412;
              }
            }
            L413: {
              var2_array = mt.a("death_skeleton,5", (byte) 121);
              if (null == var2_array) {
                break L413;
              } else {
                gca.field_j[5] = jaa.a((byte) 120, var2_array);
                break L413;
              }
            }
            L414: {
              var2_array = mt.a("death_skeleton,6", (byte) 118);
              if (null == var2_array) {
                break L414;
              } else {
                gca.field_j[6] = jaa.a((byte) 37, var2_array);
                break L414;
              }
            }
            L415: {
              var2_array = mt.a("death_skeleton,7", (byte) 102);
              if (var2_array != null) {
                gca.field_j[7] = jaa.a((byte) 87, var2_array);
                break L415;
              } else {
                break L415;
              }
            }
            L416: {
              var2_array = mt.a("death_skeleton,8", (byte) 113);
              if (var2_array == null) {
                break L416;
              } else {
                gca.field_j[8] = jaa.a((byte) 71, var2_array);
                break L416;
              }
            }
            L417: {
              var2_array = mt.a("death_dart,0", (byte) 100);
              if (null != var2_array) {
                vua.field_D[0] = jaa.a((byte) 54, var2_array);
                break L417;
              } else {
                break L417;
              }
            }
            L418: {
              var2_array = mt.a("death_dart,1", (byte) 102);
              if (var2_array == null) {
                break L418;
              } else {
                vua.field_D[1] = jaa.a((byte) 124, var2_array);
                break L418;
              }
            }
            L419: {
              var2_array = mt.a("death_dart,2", (byte) 117);
              if (var2_array != null) {
                vua.field_D[2] = jaa.a((byte) 96, var2_array);
                break L419;
              } else {
                break L419;
              }
            }
            L420: {
              var2_array = mt.a("death_dart,3", (byte) 112);
              if (var2_array == null) {
                break L420;
              } else {
                vua.field_D[3] = jaa.a((byte) 100, var2_array);
                break L420;
              }
            }
            L421: {
              var2_array = mt.a("death_dart,4", (byte) 116);
              if (var2_array != null) {
                vua.field_D[4] = jaa.a((byte) 63, var2_array);
                break L421;
              } else {
                break L421;
              }
            }
            L422: {
              var2_array = mt.a("death_littlesaw,0", (byte) 127);
              if (null != var2_array) {
                hg.field_c[0] = jaa.a((byte) 104, var2_array);
                break L422;
              } else {
                break L422;
              }
            }
            L423: {
              var2_array = mt.a("death_littlesaw,1", (byte) 123);
              if (var2_array != null) {
                hg.field_c[1] = jaa.a((byte) 53, var2_array);
                break L423;
              } else {
                break L423;
              }
            }
            L424: {
              var2_array = mt.a("death_littlesaw,2", (byte) 110);
              if (null != var2_array) {
                hg.field_c[2] = jaa.a((byte) 108, var2_array);
                break L424;
              } else {
                break L424;
              }
            }
            L425: {
              var2_array = mt.a("death_littlesaw,3", (byte) 126);
              if (var2_array != null) {
                hg.field_c[3] = jaa.a((byte) 54, var2_array);
                break L425;
              } else {
                break L425;
              }
            }
            L426: {
              var2_array = mt.a("death_littlesaw,4", (byte) 110);
              if (null != var2_array) {
                hg.field_c[4] = jaa.a((byte) 117, var2_array);
                break L426;
              } else {
                break L426;
              }
            }
            L427: {
              var2_array = mt.a("death_littlesaw,5", (byte) 114);
              if (var2_array == null) {
                break L427;
              } else {
                hg.field_c[5] = jaa.a((byte) 120, var2_array);
                break L427;
              }
            }
            L428: {
              var2_array = mt.a("death_bullet,0", (byte) 109);
              if (var2_array != null) {
                jr.field_j[0] = jaa.a((byte) 106, var2_array);
                break L428;
              } else {
                break L428;
              }
            }
            L429: {
              var2_array = mt.a("death_bullet,1", (byte) 101);
              if (var2_array == null) {
                break L429;
              } else {
                jr.field_j[1] = jaa.a((byte) 36, var2_array);
                break L429;
              }
            }
            L430: {
              var2_array = mt.a("death_bullet,2", (byte) 107);
              if (null != var2_array) {
                jr.field_j[2] = jaa.a((byte) 108, var2_array);
                break L430;
              } else {
                break L430;
              }
            }
            L431: {
              var2_array = mt.a("death_bullet,3", (byte) 127);
              if (null == var2_array) {
                break L431;
              } else {
                jr.field_j[3] = jaa.a((byte) 74, var2_array);
                break L431;
              }
            }
            L432: {
              var2_array = mt.a("death_flame,0", (byte) 112);
              if (var2_array != null) {
                fqa.field_F[0] = jaa.a((byte) 55, var2_array);
                break L432;
              } else {
                break L432;
              }
            }
            L433: {
              var2_array = mt.a("death_flame,1", (byte) 105);
              if (var2_array != null) {
                fqa.field_F[1] = jaa.a((byte) 105, var2_array);
                break L433;
              } else {
                break L433;
              }
            }
            L434: {
              var2_array = mt.a("death_flame,2", (byte) 111);
              if (null != var2_array) {
                fqa.field_F[2] = jaa.a((byte) 121, var2_array);
                break L434;
              } else {
                break L434;
              }
            }
            L435: {
              var2_array = mt.a("death_flame,3", (byte) 100);
              if (null == var2_array) {
                break L435;
              } else {
                fqa.field_F[3] = jaa.a((byte) 103, var2_array);
                break L435;
              }
            }
            L436: {
              var2_array = mt.a("death_flame,4", (byte) 101);
              if (null == var2_array) {
                break L436;
              } else {
                fqa.field_F[4] = jaa.a((byte) 78, var2_array);
                break L436;
              }
            }
            L437: {
              var2_array = mt.a("death_flame,5", (byte) 117);
              if (null == var2_array) {
                break L437;
              } else {
                fqa.field_F[5] = jaa.a((byte) 115, var2_array);
                break L437;
              }
            }
            L438: {
              var2_array = mt.a("death_flame,6", (byte) 118);
              if (var2_array != null) {
                fqa.field_F[6] = jaa.a((byte) 32, var2_array);
                break L438;
              } else {
                break L438;
              }
            }
            L439: {
              var2_array = mt.a("death_flame,7", (byte) 119);
              if (var2_array != null) {
                fqa.field_F[7] = jaa.a((byte) 107, var2_array);
                break L439;
              } else {
                break L439;
              }
            }
            L440: {
              var2_array = mt.a("death_flame,8", (byte) 124);
              if (var2_array != null) {
                fqa.field_F[8] = jaa.a((byte) 77, var2_array);
                break L440;
              } else {
                break L440;
              }
            }
            L441: {
              var2_array = mt.a("death_flame,9", (byte) 109);
              if (null != var2_array) {
                fqa.field_F[9] = jaa.a((byte) 72, var2_array);
                break L441;
              } else {
                break L441;
              }
            }
            L442: {
              var2_array = mt.a("death_flame,10", (byte) 125);
              if (var2_array != null) {
                fqa.field_F[10] = jaa.a((byte) 40, var2_array);
                break L442;
              } else {
                break L442;
              }
            }
            L443: {
              var2_array = mt.a("death_flame,11", (byte) 118);
              if (var2_array == null) {
                break L443;
              } else {
                fqa.field_F[11] = jaa.a((byte) 93, var2_array);
                break L443;
              }
            }
            L444: {
              var2_array = mt.a("death_flame,12", (byte) 123);
              if (null != var2_array) {
                fqa.field_F[12] = jaa.a((byte) 110, var2_array);
                break L444;
              } else {
                break L444;
              }
            }
            L445: {
              var2_array = mt.a("death_flame,13", (byte) 105);
              if (null != var2_array) {
                fqa.field_F[13] = jaa.a((byte) 50, var2_array);
                break L445;
              } else {
                break L445;
              }
            }
            L446: {
              var2_array = mt.a("death_laser,0", (byte) 117);
              if (var2_array == null) {
                break L446;
              } else {
                id.field_g[0] = jaa.a((byte) 47, var2_array);
                break L446;
              }
            }
            L447: {
              var2_array = mt.a("death_laser,1", (byte) 109);
              if (null != var2_array) {
                id.field_g[1] = jaa.a((byte) 55, var2_array);
                break L447;
              } else {
                break L447;
              }
            }
            L448: {
              var2_array = mt.a("death_laser,2", (byte) 108);
              if (var2_array == null) {
                break L448;
              } else {
                id.field_g[2] = jaa.a((byte) 95, var2_array);
                break L448;
              }
            }
            L449: {
              var2_array = mt.a("death_laser,3", (byte) 124);
              if (null == var2_array) {
                break L449;
              } else {
                id.field_g[3] = jaa.a((byte) 111, var2_array);
                break L449;
              }
            }
            L450: {
              var2_array = mt.a("death_laser,4", (byte) 114);
              if (null == var2_array) {
                break L450;
              } else {
                id.field_g[4] = jaa.a((byte) 81, var2_array);
                break L450;
              }
            }
            L451: {
              var2_array = mt.a("death_laser,5", (byte) 119);
              if (null == var2_array) {
                break L451;
              } else {
                id.field_g[5] = jaa.a((byte) 54, var2_array);
                break L451;
              }
            }
            L452: {
              var2_array = mt.a("death_boulder,0", (byte) 111);
              if (var2_array == null) {
                break L452;
              } else {
                vk.field_c[0] = jaa.a((byte) 72, var2_array);
                break L452;
              }
            }
            L453: {
              var2_array = mt.a("death_boulder,1", (byte) 102);
              if (null != var2_array) {
                vk.field_c[1] = jaa.a((byte) 122, var2_array);
                break L453;
              } else {
                break L453;
              }
            }
            L454: {
              var2_array = mt.a("death_boulder,2", (byte) 113);
              if (var2_array == null) {
                break L454;
              } else {
                vk.field_c[2] = jaa.a((byte) 111, var2_array);
                break L454;
              }
            }
            L455: {
              var2_array = mt.a("death_boulder,3", (byte) 121);
              if (null != var2_array) {
                vk.field_c[3] = jaa.a((byte) 85, var2_array);
                break L455;
              } else {
                break L455;
              }
            }
            L456: {
              var2_array = mt.a("death_boulder,4", (byte) 109);
              if (var2_array != null) {
                vk.field_c[4] = jaa.a((byte) 101, var2_array);
                break L456;
              } else {
                break L456;
              }
            }
            L457: {
              var2_array = mt.a("death_boulder,5", (byte) 123);
              if (var2_array == null) {
                break L457;
              } else {
                vk.field_c[5] = jaa.a((byte) 55, var2_array);
                break L457;
              }
            }
            L458: {
              var2_array = mt.a("death_boulder,6", (byte) 111);
              if (var2_array != null) {
                vk.field_c[6] = jaa.a((byte) 69, var2_array);
                break L458;
              } else {
                break L458;
              }
            }
            L459: {
              var2_array = mt.a("death_bigsaw,0", (byte) 113);
              if (var2_array != null) {
                qr.field_u[0] = jaa.a((byte) 107, var2_array);
                break L459;
              } else {
                break L459;
              }
            }
            L460: {
              var2_array = mt.a("death_bigsaw,1", (byte) 105);
              if (var2_array == null) {
                break L460;
              } else {
                qr.field_u[1] = jaa.a((byte) 118, var2_array);
                break L460;
              }
            }
            L461: {
              var2_array = mt.a("death_bigsaw,2", (byte) 102);
              if (var2_array != null) {
                qr.field_u[2] = jaa.a((byte) 103, var2_array);
                break L461;
              } else {
                break L461;
              }
            }
            L462: {
              var2_array = mt.a("death_bigsaw,3", (byte) 108);
              if (var2_array != null) {
                qr.field_u[3] = jaa.a((byte) 41, var2_array);
                break L462;
              } else {
                break L462;
              }
            }
            L463: {
              var2_array = mt.a("death_bigsaw,4", (byte) 116);
              if (var2_array == null) {
                break L463;
              } else {
                qr.field_u[4] = jaa.a((byte) 62, var2_array);
                break L463;
              }
            }
            L464: {
              var2_array = mt.a("death_bigsaw,5", (byte) 126);
              if (null == var2_array) {
                break L464;
              } else {
                qr.field_u[5] = jaa.a((byte) 80, var2_array);
                break L464;
              }
            }
            L465: {
              var2_array = mt.a("death_bigsaw,6", (byte) 102);
              if (var2_array != null) {
                qr.field_u[6] = jaa.a((byte) 60, var2_array);
                break L465;
              } else {
                break L465;
              }
            }
            L466: {
              var2_array = mt.a("death_bigsaw,7", (byte) 116);
              if (var2_array != null) {
                qr.field_u[7] = jaa.a((byte) 75, var2_array);
                break L466;
              } else {
                break L466;
              }
            }
            L467: {
              var2_array = mt.a("death_skiproom,0", (byte) 117);
              if (var2_array == null) {
                break L467;
              } else {
                dta.field_d[0] = jaa.a((byte) 111, var2_array);
                break L467;
              }
            }
            L468: {
              var2_array = mt.a("death_skiproom,1", (byte) 107);
              if (var2_array != null) {
                dta.field_d[1] = jaa.a((byte) 59, var2_array);
                break L468;
              } else {
                break L468;
              }
            }
            L469: {
              var2_array = mt.a("death_skiproom,2", (byte) 112);
              if (var2_array != null) {
                dta.field_d[2] = jaa.a((byte) 105, var2_array);
                break L469;
              } else {
                break L469;
              }
            }
            L470: {
              var2_array = mt.a("death_skiproom,3", (byte) 101);
              if (var2_array == null) {
                break L470;
              } else {
                dta.field_d[3] = jaa.a((byte) 28, var2_array);
                break L470;
              }
            }
            L471: {
              var2_array = mt.a("death_skiproom,4", (byte) 100);
              if (null == var2_array) {
                break L471;
              } else {
                dta.field_d[4] = jaa.a((byte) 58, var2_array);
                break L471;
              }
            }
            L472: {
              var2_array = mt.a("death_gas,0", (byte) 115);
              if (var2_array == null) {
                break L472;
              } else {
                fe.field_A[0] = jaa.a((byte) 85, var2_array);
                break L472;
              }
            }
            L473: {
              var2_array = mt.a("death_gas,1", (byte) 107);
              if (var2_array == null) {
                break L473;
              } else {
                fe.field_A[1] = jaa.a((byte) 91, var2_array);
                break L473;
              }
            }
            L474: {
              var2_array = mt.a("death_gas,2", (byte) 115);
              if (null == var2_array) {
                break L474;
              } else {
                fe.field_A[2] = jaa.a((byte) 40, var2_array);
                break L474;
              }
            }
            L475: {
              var2_array = mt.a("death_gas,3", (byte) 119);
              if (var2_array != null) {
                fe.field_A[3] = jaa.a((byte) 48, var2_array);
                break L475;
              } else {
                break L475;
              }
            }
            L476: {
              var2_array = mt.a("next_round", (byte) 127);
              if (null == var2_array) {
                break L476;
              } else {
                discarded$49 = jaa.a((byte) 105, var2_array);
                break L476;
              }
            }
            L477: {
              var2_array = mt.a("gameoptlabels,0", (byte) 122);
              if (var2_array == null) {
                break L477;
              } else {
                mga.field_f[0] = jaa.a((byte) 101, var2_array);
                break L477;
              }
            }
            L478: {
              var2_array = mt.a("gameoptlabels,1", (byte) 103);
              if (var2_array == null) {
                break L478;
              } else {
                mga.field_f[1] = jaa.a((byte) 44, var2_array);
                break L478;
              }
            }
            L479: {
              var2_array = mt.a("gameoptnames,0,0", (byte) 109);
              if (null != var2_array) {
                via.field_c[0][0] = jaa.a((byte) 78, var2_array);
                break L479;
              } else {
                break L479;
              }
            }
            L480: {
              var2_array = mt.a("gameoptnames,0,1", (byte) 118);
              if (var2_array != null) {
                via.field_c[0][1] = jaa.a((byte) 83, var2_array);
                break L480;
              } else {
                break L480;
              }
            }
            L481: {
              var2_array = mt.a("gameoptnames,0,2", (byte) 102);
              if (null != var2_array) {
                via.field_c[0][2] = jaa.a((byte) 88, var2_array);
                break L481;
              } else {
                break L481;
              }
            }
            L482: {
              var2_array = mt.a("gameoptnames,0,3", (byte) 109);
              if (null != var2_array) {
                via.field_c[0][3] = jaa.a((byte) 81, var2_array);
                break L482;
              } else {
                break L482;
              }
            }
            L483: {
              var2_array = mt.a("gameoptnames,1,0", (byte) 122);
              if (null == var2_array) {
                break L483;
              } else {
                via.field_c[1][0] = jaa.a((byte) 117, var2_array);
                break L483;
              }
            }
            L484: {
              var2_array = mt.a("gameoptnames,1,1", (byte) 120);
              if (null != var2_array) {
                via.field_c[1][1] = jaa.a((byte) 41, var2_array);
                break L484;
              } else {
                break L484;
              }
            }
            L485: {
              var2_array = mt.a("gameopttooltips,0,0", (byte) 110);
              if (null != var2_array) {
                qaa.field_a[0][0] = jaa.a((byte) 68, var2_array);
                break L485;
              } else {
                break L485;
              }
            }
            L486: {
              var2_array = mt.a("gameopttooltips,0,1", (byte) 106);
              if (var2_array == null) {
                break L486;
              } else {
                qaa.field_a[0][1] = jaa.a((byte) 58, var2_array);
                break L486;
              }
            }
            L487: {
              var2_array = mt.a("gameopttooltips,0,2", (byte) 112);
              if (var2_array != null) {
                qaa.field_a[0][2] = jaa.a((byte) 66, var2_array);
                break L487;
              } else {
                break L487;
              }
            }
            L488: {
              var2_array = mt.a("gameopttooltips,0,3", (byte) 111);
              if (var2_array == null) {
                break L488;
              } else {
                qaa.field_a[0][3] = jaa.a((byte) 46, var2_array);
                break L488;
              }
            }
            L489: {
              var2_array = mt.a("gameopttooltips,1,0", (byte) 105);
              if (null == var2_array) {
                break L489;
              } else {
                qaa.field_a[1][0] = jaa.a((byte) 52, var2_array);
                break L489;
              }
            }
            L490: {
              var2_array = mt.a("gameopttooltips,1,1", (byte) 111);
              if (null == var2_array) {
                break L490;
              } else {
                qaa.field_a[1][1] = jaa.a((byte) 57, var2_array);
                break L490;
              }
            }
            L491: {
              var2_array = mt.a("tomb_names,0", (byte) 117);
              if (var2_array != null) {
                vj.field_d[0] = jaa.a((byte) 95, var2_array);
                break L491;
              } else {
                break L491;
              }
            }
            L492: {
              var2_array = mt.a("tomb_names,1", (byte) 124);
              if (null == var2_array) {
                break L492;
              } else {
                vj.field_d[1] = jaa.a((byte) 50, var2_array);
                break L492;
              }
            }
            L493: {
              var2_array = mt.a("tomb_names,2", (byte) 107);
              if (var2_array != null) {
                vj.field_d[2] = jaa.a((byte) 87, var2_array);
                break L493;
              } else {
                break L493;
              }
            }
            L494: {
              var2_array = mt.a("tomb_names,3", (byte) 120);
              if (var2_array != null) {
                vj.field_d[3] = jaa.a((byte) 59, var2_array);
                break L494;
              } else {
                break L494;
              }
            }
            L495: {
              var2_array = mt.a("tomb_names,4", (byte) 111);
              if (null == var2_array) {
                break L495;
              } else {
                vj.field_d[4] = jaa.a((byte) 106, var2_array);
                break L495;
              }
            }
            L496: {
              var2_array = mt.a("tomb_names,5", (byte) 116);
              if (null != var2_array) {
                vj.field_d[5] = jaa.a((byte) 36, var2_array);
                break L496;
              } else {
                break L496;
              }
            }
            L497: {
              var2_array = mt.a("tomb_names,6", (byte) 100);
              if (null == var2_array) {
                break L497;
              } else {
                vj.field_d[6] = jaa.a((byte) 40, var2_array);
                break L497;
              }
            }
            L498: {
              var2_array = mt.a("tomb_names,7", (byte) 125);
              if (null != var2_array) {
                vj.field_d[7] = jaa.a((byte) 80, var2_array);
                break L498;
              } else {
                break L498;
              }
            }
            L499: {
              var2_array = mt.a("tomb_names,8", (byte) 118);
              if (var2_array != null) {
                vj.field_d[8] = jaa.a((byte) 73, var2_array);
                break L499;
              } else {
                break L499;
              }
            }
            L500: {
              var2_array = mt.a("multiplayer_lobby", (byte) 125);
              if (null != var2_array) {
                ol.field_a = jaa.a((byte) 58, var2_array);
                break L500;
              } else {
                break L500;
              }
            }
            L501: {
              var2_array = mt.a("options", (byte) 100);
              if (var2_array != null) {
                wc.field_d = jaa.a((byte) 126, var2_array);
                break L501;
              } else {
                break L501;
              }
            }
            L502: {
              var2_array = mt.a("enter_tomb", (byte) 108);
              if (null == var2_array) {
                break L502;
              } else {
                ue.field_t = jaa.a((byte) 91, var2_array);
                break L502;
              }
            }
            L503: {
              var2_array = mt.a("bonus", (byte) 102);
              if (var2_array != null) {
                bd.field_j = jaa.a((byte) 71, var2_array);
                break L503;
              } else {
                break L503;
              }
            }
            L504: {
              var2_array = mt.a("no_medal", (byte) 116);
              if (null == var2_array) {
                break L504;
              } else {
                hb.field_v = jaa.a((byte) 96, var2_array);
                break L504;
              }
            }
            L505: {
              var2_array = mt.a("gold_medal", (byte) 101);
              if (null != var2_array) {
                uaa.field_d = jaa.a((byte) 39, var2_array);
                break L505;
              } else {
                break L505;
              }
            }
            L506: {
              var2_array = mt.a("silver_medal", (byte) 117);
              if (null != var2_array) {
                qna.field_c = jaa.a((byte) 72, var2_array);
                break L506;
              } else {
                break L506;
              }
            }
            L507: {
              var2_array = mt.a("bronze_medal", (byte) 118);
              if (var2_array == null) {
                break L507;
              } else {
                ps.field_P = jaa.a((byte) 109, var2_array);
                break L507;
              }
            }
            L508: {
              var2_array = mt.a("previous_member", (byte) 102);
              if (null == var2_array) {
                break L508;
              } else {
                qu.field_c = jaa.a((byte) 25, var2_array);
                break L508;
              }
            }
            L509: {
              var2_array = mt.a("freecontent_compelted", (byte) 125);
              if (null == var2_array) {
                break L509;
              } else {
                tna.field_d = jaa.a((byte) 119, var2_array);
                break L509;
              }
            }
            L510: {
              var2_array = mt.a("justplay", (byte) 109);
              if (null != var2_array) {
                tc.field_f = jaa.a((byte) 54, var2_array);
                break L510;
              } else {
                break L510;
              }
            }
            L511: {
              var2_array = mt.a("adding_coins", (byte) 102);
              if (null != var2_array) {
                discarded$50 = jaa.a((byte) 56, var2_array);
                break L511;
              } else {
                break L511;
              }
            }
            L512: {
              var2_array = mt.a("adding_lootbags", (byte) 112);
              if (var2_array != null) {
                discarded$51 = jaa.a((byte) 53, var2_array);
                break L512;
              } else {
                break L512;
              }
            }
            L513: {
              var2_array = mt.a("adding_idols", (byte) 125);
              if (null != var2_array) {
                discarded$52 = jaa.a((byte) 125, var2_array);
                break L513;
              } else {
                break L513;
              }
            }
            L514: {
              var2_array = mt.a("points_coins", (byte) 108);
              if (var2_array == null) {
                break L514;
              } else {
                discarded$53 = jaa.a((byte) 108, var2_array);
                break L514;
              }
            }
            L515: {
              var2_array = mt.a("points_lootbags", (byte) 106);
              if (null == var2_array) {
                break L515;
              } else {
                discarded$54 = jaa.a((byte) 107, var2_array);
                break L515;
              }
            }
            L516: {
              var2_array = mt.a("points_idols", (byte) 101);
              if (null != var2_array) {
                discarded$55 = jaa.a((byte) 108, var2_array);
                break L516;
              } else {
                break L516;
              }
            }
            L517: {
              var2_array = mt.a("restart_world", (byte) 102);
              if (null == var2_array) {
                break L517;
              } else {
                ng.field_e = jaa.a((byte) 52, var2_array);
                break L517;
              }
            }
            L518: {
              var2_array = mt.a("spectator_controls", (byte) 111);
              if (var2_array != null) {
                tp.field_J = jaa.a((byte) 71, var2_array);
                break L518;
              } else {
                break L518;
              }
            }
            L519: {
              var2_array = mt.a("game_end_iminent", (byte) 121);
              if (var2_array != null) {
                dw.field_j = jaa.a((byte) 105, var2_array);
                break L519;
              } else {
                break L519;
              }
            }
            L520: {
              var2_array = mt.a("phaseEnd_mybest", (byte) 104);
              if (null != var2_array) {
                lea.field_F = jaa.a((byte) 43, var2_array);
                break L520;
              } else {
                break L520;
              }
            }
            L521: {
              var2_array = mt.a("phaseEnd_friendsbest", (byte) 116);
              if (null != var2_array) {
                qw.field_g = jaa.a((byte) 39, var2_array);
                break L521;
              } else {
                break L521;
              }
            }
            fs.field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L522: {
            var2 = decompiledCaughtException;
            stackOut_1828_0 = (RuntimeException) (var2);
            stackOut_1828_1 = new StringBuilder().append("pfa.B(");
            stackIn_1831_0 = stackOut_1828_0;
            stackIn_1831_1 = stackOut_1828_1;
            stackIn_1829_0 = stackOut_1828_0;
            stackIn_1829_1 = stackOut_1828_1;
            if (param0 == null) {
              stackOut_1831_0 = (RuntimeException) ((Object) stackIn_1831_0);
              stackOut_1831_1 = (StringBuilder) ((Object) stackIn_1831_1);
              stackOut_1831_2 = "null";
              stackIn_1832_0 = stackOut_1831_0;
              stackIn_1832_1 = stackOut_1831_1;
              stackIn_1832_2 = stackOut_1831_2;
              break L522;
            } else {
              stackOut_1829_0 = (RuntimeException) ((Object) stackIn_1829_0);
              stackOut_1829_1 = (StringBuilder) ((Object) stackIn_1829_1);
              stackOut_1829_2 = "{...}";
              stackIn_1832_0 = stackOut_1829_0;
              stackIn_1832_1 = stackOut_1829_1;
              stackIn_1832_2 = stackOut_1829_2;
              break L522;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_1832_0), stackIn_1832_2 + ',' + param1 + ')');
        }
        L523: {
          if (!jna.field_m) {
            break L523;
          } else {
            L524: {
              if (var4 == 0) {
                stackOut_1839_0 = 1;
                stackIn_1840_0 = stackOut_1839_0;
                break L524;
              } else {
                stackOut_1837_0 = 0;
                stackIn_1840_0 = stackOut_1837_0;
                break L524;
              }
            }
            TombRacer.field_G = stackIn_1840_0 != 0;
            break L523;
          }
        }
    }

    final void b(byte param0, int param1) {
        if (param0 != 58) {
            return;
        }
        try {
            this.a(-28562, hq.field_b[param1] << 857267344, jw.field_z[param1] << -609721840);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pfa.F(" + param0 + ',' + param1 + ')');
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
        int decompiledRegionSelector0 = 0;
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
                  if (-1 <= (this.field_f.a((byte) -16) ^ -1)) {
                    break L2;
                  } else {
                    L3: {
                      if (!this.field_g) {
                        this.field_c.a(this.field_d, false, 0, 1, true);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      this.field_g = true;
                      var2_ref = (wk) ((Object) this.field_f.f(-80));
                      if (var2_ref.field_j) {
                        break L4;
                      } else {
                        var2_ref.a(0, this.field_j, this.field_e);
                        var2_ref.field_j = true;
                        break L4;
                      }
                    }
                    L5: {
                      this.field_j = this.field_j + var2_ref.field_l;
                      this.field_e = this.field_e + var2_ref.field_f;
                      this.field_h = var2_ref.field_h;
                      var3 = 327680;
                      if (this.field_j < var2_ref.field_g - var3) {
                        break L5;
                      } else {
                        if (var3 + var2_ref.field_g < this.field_j) {
                          break L5;
                        } else {
                          if ((var2_ref.field_k - var3 ^ -1) < (this.field_e ^ -1)) {
                            break L5;
                          } else {
                            if (this.field_e > var2_ref.field_k - -var3) {
                              break L5;
                            } else {
                              this.field_j = var2_ref.field_g;
                              this.field_e = var2_ref.field_k;
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
                if (this.field_g) {
                  L6: {
                    stackOut_30_0 = this.field_c;
                    stackOut_30_1 = this.field_d;
                    stackIn_33_0 = stackOut_30_0;
                    stackIn_33_1 = stackOut_30_1;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    if (param0) {
                      stackOut_33_0 = (bua) ((Object) stackIn_33_0);
                      stackOut_33_1 = stackIn_33_1;
                      stackOut_33_2 = 0;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      stackIn_34_2 = stackOut_33_2;
                      break L6;
                    } else {
                      stackOut_31_0 = (bua) ((Object) stackIn_31_0);
                      stackOut_31_1 = stackIn_31_1;
                      stackOut_31_2 = 1;
                      stackIn_34_0 = stackOut_31_0;
                      stackIn_34_1 = stackOut_31_1;
                      stackIn_34_2 = stackOut_31_2;
                      break L6;
                    }
                  }
                  ((bua) (Object) stackIn_34_0).a(stackIn_34_1, stackIn_34_2 != 0, 0, 0, true);
                  this.field_h = 0;
                  this.field_g = false;
                  break L1;
                } else {
                  break L1;
                }
              }
              this.field_c.a(0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "pfa.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                this.b(96, -22, 33);
                break L1;
              }
            }
            this.field_f.b((byte) -79, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        try {
            field_b = (boolean[][]) null;
            field_a = null;
            field_i = null;
            if (param0 != 4) {
                pfa.a((cn) null, 68);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pfa.A(" + param0 + ')');
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
                this.field_c = (bua) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if ((jw.field_z[param1] << 1198131984 ^ -1) != (this.field_j ^ -1)) {
                  break L3;
                } else {
                  if (this.field_e != hq.field_b[param1] << 1247742320) {
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
          throw tba.a((Throwable) ((Object) var3), "pfa.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final void b(int param0, int param1, int param2) {
        try {
            hp.a(2048, this.field_h, 1900, this.field_c.b((byte) 74), param1 ^ -1918096900, 10 + ((this.field_e >> -1017768784) + param0), (this.field_j >> 2084402672) + param2 + 18);
            if (param1 != 11327) {
                this.a(73, (byte) 91);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pfa.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -98) {
                break L1;
              } else {
                discarded$2 = this.a((byte) -74, -14);
                break L1;
              }
            }
            this.field_j = jw.field_z[param0] << 550543504;
            this.field_e = hq.field_b[param0] << -1888991056;
            this.field_f.d(8);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "pfa.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException runtimeException = null;
        bd var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var1 = (bd) ((Object) gg.field_e.c((byte) 22));
              if (param0 == 1) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            if (null == var1) {
              throw new IllegalStateException();
            } else {
              bea.a(var1.field_g, var1.field_m, var1.field_l);
              bea.b(var1.field_n, var1.field_k, var1.field_h, var1.field_f);
              var1.field_g = null;
              vt.field_a.b((byte) -67, var1);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "pfa.G(" + param0 + ')');
        }
    }

    pfa(int param0, int param1) {
        try {
            this.field_d = param0;
            this.field_c = new bua(0, this.field_d, 1);
            this.field_c.a(this.field_d, false, 0, 0, true);
            this.field_j = jw.field_z[param1] << -1055270544;
            this.field_e = hq.field_b[param1] << -504440336;
            this.field_g = false;
            this.field_f = new vna();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pfa.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "Prev";
        field_i = new ura();
    }
}
