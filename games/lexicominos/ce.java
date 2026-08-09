/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static int[] field_c;
    static String field_d;
    static String[] field_a;
    static b field_b;

    final static void b(int param0) {
        if (!ra.a(-17977)) {
            return;
        }
        try {
            id.a(param0, false, (byte) -36);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ce.D(" + param0 + ')');
        }
    }

    final static vi a(int param0, int param1) {
        vi stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        vi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        try {
          L0: {
            var2 = new vi();
            var3 = -126 % ((param1 - -11) / 51);
            ci.field_f.b(109, var2);
            ck.a(param0, 2);
            stackIn_1_0 = (vi) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "ce.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, sh param1) {
        String stackIn_44_0 = null;
        String stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        String stackIn_55_0 = null;
        String stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        String stackIn_77_0 = null;
        String stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        String stackIn_84_0 = null;
        String stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        String stackIn_106_0 = null;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        String stackIn_114_0 = null;
        String stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        String stackIn_126_0 = null;
        String stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        String stackIn_141_0 = null;
        String stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        String stackIn_151_0 = null;
        String stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        String stackIn_200_0 = null;
        String stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        String stackIn_208_0 = null;
        String stackIn_209_0 = null;
        int stackIn_209_1 = 0;
        String stackIn_224_0 = null;
        String stackIn_225_0 = null;
        int stackIn_225_1 = 0;
        String stackIn_232_0 = null;
        String stackIn_233_0 = null;
        int stackIn_233_1 = 0;
        String stackIn_242_0 = null;
        String stackIn_243_0 = null;
        int stackIn_243_1 = 0;
        String stackIn_257_0 = null;
        String stackIn_258_0 = null;
        int stackIn_258_1 = 0;
        String stackIn_277_0 = null;
        String stackIn_278_0 = null;
        int stackIn_278_1 = 0;
        String stackIn_290_0 = null;
        String stackIn_291_0 = null;
        int stackIn_291_1 = 0;
        RuntimeException stackIn_303_0 = null;
        StringBuilder stackIn_303_1 = null;
        RuntimeException stackIn_304_0 = null;
        StringBuilder stackIn_304_1 = null;
        String stackIn_304_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              th.field_u = param1;
              var2 = e.a("defaultlang", true);
              if (var2 != null) {
                ug.field_s = ni.a((byte) -55, var2);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var2 = e.a("waitingfor_animations", true);
              if (null == var2) {
                break L2;
              } else {
                ee.field_e = ni.a((byte) -55, var2);
                break L2;
              }
            }
            L3: {
              var2 = e.a("loading_animations", true);
              if (null == var2) {
                break L3;
              } else {
                ia.field_F = ni.a((byte) -55, var2);
                break L3;
              }
            }
            L4: {
              var2 = e.a("unpacking_animations", true);
              if (null == var2) {
                break L4;
              } else {
                qa.field_b = ni.a((byte) -55, var2);
                break L4;
              }
            }
            L5: {
              var2 = e.a("achievement_names,0", true);
              if (var2 != null) {
                df.field_d[0] = ni.a((byte) -55, var2);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!param0) {
                break L6;
              } else {
                ce.a(-91, 19);
                break L6;
              }
            }
            L7: {
              var2 = e.a("achievement_names,1", true);
              if (null == var2) {
                break L7;
              } else {
                df.field_d[1] = ni.a((byte) -55, var2);
                break L7;
              }
            }
            L8: {
              var2 = e.a("achievement_names,2", true);
              if (null != var2) {
                df.field_d[2] = ni.a((byte) -55, var2);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var2 = e.a("achievement_names,3", true);
              if (null != var2) {
                df.field_d[3] = ni.a((byte) -55, var2);
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var2 = e.a("achievement_names,4", true);
              if (null == var2) {
                break L10;
              } else {
                df.field_d[4] = ni.a((byte) -55, var2);
                break L10;
              }
            }
            L11: {
              var2 = e.a("achievement_names,5", true);
              if (null != var2) {
                df.field_d[5] = ni.a((byte) -55, var2);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              var2 = e.a("achievement_names,6", true);
              if (var2 == null) {
                break L12;
              } else {
                df.field_d[6] = ni.a((byte) -55, var2);
                break L12;
              }
            }
            L13: {
              stackIn_44_0 = "achievement_names,7";

              if (param0) {
                stackIn_45_0 = (String) ((Object) stackIn_44_0);
                stackIn_45_1 = 0;
                break L13;
              } else {
                stackIn_45_0 = (String) ((Object) stackIn_44_0);
                stackIn_45_1 = 1;
                break L13;
              }
            }
            L14: {
              var2 = e.a(stackIn_45_0, stackIn_45_1 != 0);
              if (null == var2) {
                break L14;
              } else {
                df.field_d[7] = ni.a((byte) -55, var2);
                break L14;
              }
            }
            L15: {
              var2 = e.a("achievement_names,8", true);
              if (null != var2) {
                df.field_d[8] = ni.a((byte) -55, var2);
                break L15;
              } else {
                break L15;
              }
            }
            L16: {
              stackIn_55_0 = "achievement_names,9";

              if (param0) {
                stackIn_56_0 = (String) ((Object) stackIn_55_0);
                stackIn_56_1 = 0;
                break L16;
              } else {
                stackIn_56_0 = (String) ((Object) stackIn_55_0);
                stackIn_56_1 = 1;
                break L16;
              }
            }
            L17: {
              var2 = e.a(stackIn_56_0, stackIn_56_1 != 0);
              if (var2 != null) {
                df.field_d[9] = ni.a((byte) -55, var2);
                break L17;
              } else {
                break L17;
              }
            }
            L18: {
              var2 = e.a("achievement_names,10", true);
              if (null != var2) {
                df.field_d[10] = ni.a((byte) -55, var2);
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              var2 = e.a("achievement_names,11", true);
              if (var2 == null) {
                break L19;
              } else {
                df.field_d[11] = ni.a((byte) -55, var2);
                break L19;
              }
            }
            L20: {
              var2 = e.a("achievement_names,12", true);
              if (null != var2) {
                df.field_d[12] = ni.a((byte) -55, var2);
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              var2 = e.a("achievement_names,13", true);
              if (var2 == null) {
                break L21;
              } else {
                df.field_d[13] = ni.a((byte) -55, var2);
                break L21;
              }
            }
            L22: {
              stackIn_77_0 = "achievement_names,14";

              if (param0) {
                stackIn_78_0 = (String) ((Object) stackIn_77_0);
                stackIn_78_1 = 0;
                break L22;
              } else {
                stackIn_78_0 = (String) ((Object) stackIn_77_0);
                stackIn_78_1 = 1;
                break L22;
              }
            }
            L23: {
              var2 = e.a(stackIn_78_0, stackIn_78_1 != 0);
              if (var2 == null) {
                break L23;
              } else {
                df.field_d[14] = ni.a((byte) -55, var2);
                break L23;
              }
            }
            L24: {
              stackIn_84_0 = "achievement_names,15";

              if (param0) {
                stackIn_85_0 = (String) ((Object) stackIn_84_0);
                stackIn_85_1 = 0;
                break L24;
              } else {
                stackIn_85_0 = (String) ((Object) stackIn_84_0);
                stackIn_85_1 = 1;
                break L24;
              }
            }
            L25: {
              var2 = e.a(stackIn_85_0, stackIn_85_1 != 0);
              if (null != var2) {
                df.field_d[15] = ni.a((byte) -55, var2);
                break L25;
              } else {
                break L25;
              }
            }
            L26: {
              var2 = e.a("achievement_criteria,0", true);
              if (var2 == null) {
                break L26;
              } else {
                hc.field_ib[0] = ni.a((byte) -55, var2);
                break L26;
              }
            }
            L27: {
              var2 = e.a("achievement_criteria,1", true);
              if (var2 != null) {
                hc.field_ib[1] = ni.a((byte) -55, var2);
                break L27;
              } else {
                break L27;
              }
            }
            L28: {
              var2 = e.a("achievement_criteria,2", true);
              if (null == var2) {
                break L28;
              } else {
                hc.field_ib[2] = ni.a((byte) -55, var2);
                break L28;
              }
            }
            L29: {
              var2 = e.a("achievement_criteria,3", true);
              if (var2 != null) {
                hc.field_ib[3] = ni.a((byte) -55, var2);
                break L29;
              } else {
                break L29;
              }
            }
            L30: {
              stackIn_106_0 = "achievement_criteria,4";

              if (param0) {
                stackIn_107_0 = (String) ((Object) stackIn_106_0);
                stackIn_107_1 = 0;
                break L30;
              } else {
                stackIn_107_0 = (String) ((Object) stackIn_106_0);
                stackIn_107_1 = 1;
                break L30;
              }
            }
            L31: {
              var2 = e.a(stackIn_107_0, stackIn_107_1 != 0);
              if (var2 != null) {
                hc.field_ib[4] = ni.a((byte) -55, var2);
                break L31;
              } else {
                break L31;
              }
            }
            L32: {
              stackIn_114_0 = "achievement_criteria,5";

              if (param0) {
                stackIn_115_0 = (String) ((Object) stackIn_114_0);
                stackIn_115_1 = 0;
                break L32;
              } else {
                stackIn_115_0 = (String) ((Object) stackIn_114_0);
                stackIn_115_1 = 1;
                break L32;
              }
            }
            L33: {
              var2 = e.a(stackIn_115_0, stackIn_115_1 != 0);
              if (var2 != null) {
                hc.field_ib[5] = ni.a((byte) -55, var2);
                break L33;
              } else {
                break L33;
              }
            }
            L34: {
              var2 = e.a("achievement_criteria,6", true);
              if (var2 != null) {
                hc.field_ib[6] = ni.a((byte) -55, var2);
                break L34;
              } else {
                break L34;
              }
            }
            L35: {
              stackIn_126_0 = "achievement_criteria,7";

              if (param0) {
                stackIn_127_0 = (String) ((Object) stackIn_126_0);
                stackIn_127_1 = 0;
                break L35;
              } else {
                stackIn_127_0 = (String) ((Object) stackIn_126_0);
                stackIn_127_1 = 1;
                break L35;
              }
            }
            L36: {
              var2 = e.a(stackIn_127_0, stackIn_127_1 != 0);
              if (null != var2) {
                hc.field_ib[7] = ni.a((byte) -55, var2);
                break L36;
              } else {
                break L36;
              }
            }
            L37: {
              var2 = e.a("achievement_criteria,8", true);
              if (null != var2) {
                hc.field_ib[8] = ni.a((byte) -55, var2);
                break L37;
              } else {
                break L37;
              }
            }
            L38: {
              var2 = e.a("achievement_criteria,9", true);
              if (var2 == null) {
                break L38;
              } else {
                hc.field_ib[9] = ni.a((byte) -55, var2);
                break L38;
              }
            }
            L39: {
              stackIn_141_0 = "achievement_criteria,10";

              if (param0) {
                stackIn_142_0 = (String) ((Object) stackIn_141_0);
                stackIn_142_1 = 0;
                break L39;
              } else {
                stackIn_142_0 = (String) ((Object) stackIn_141_0);
                stackIn_142_1 = 1;
                break L39;
              }
            }
            L40: {
              var2 = e.a(stackIn_142_0, stackIn_142_1 != 0);
              if (null == var2) {
                break L40;
              } else {
                hc.field_ib[10] = ni.a((byte) -55, var2);
                break L40;
              }
            }
            L41: {
              var2 = e.a("achievement_criteria,11", true);
              if (null == var2) {
                break L41;
              } else {
                hc.field_ib[11] = ni.a((byte) -55, var2);
                break L41;
              }
            }
            L42: {
              stackIn_151_0 = "achievement_criteria,12";

              if (param0) {
                stackIn_152_0 = (String) ((Object) stackIn_151_0);
                stackIn_152_1 = 0;
                break L42;
              } else {
                stackIn_152_0 = (String) ((Object) stackIn_151_0);
                stackIn_152_1 = 1;
                break L42;
              }
            }
            L43: {
              var2 = e.a(stackIn_152_0, stackIn_152_1 != 0);
              if (var2 != null) {
                hc.field_ib[12] = ni.a((byte) -55, var2);
                break L43;
              } else {
                break L43;
              }
            }
            L44: {
              var2 = e.a("achievement_criteria,13", true);
              if (var2 == null) {
                break L44;
              } else {
                hc.field_ib[13] = ni.a((byte) -55, var2);
                break L44;
              }
            }
            L45: {
              var2 = e.a("achievement_criteria,14", true);
              if (var2 == null) {
                break L45;
              } else {
                hc.field_ib[14] = ni.a((byte) -55, var2);
                break L45;
              }
            }
            L46: {
              var2 = e.a("achievement_criteria,15", true);
              if (null == var2) {
                break L46;
              } else {
                hc.field_ib[15] = ni.a((byte) -55, var2);
                break L46;
              }
            }
            L47: {
              var2 = e.a("gameover", true);
              if (var2 != null) {
                ga.field_b = ni.a((byte) -55, var2);
                break L47;
              } else {
                break L47;
              }
            }
            L48: {
              var2 = e.a("instructions_p1,0", true);
              if (var2 == null) {
                break L48;
              } else {
                tj.field_j[0] = ni.a((byte) -55, var2);
                break L48;
              }
            }
            L49: {
              var2 = e.a("instructions_p1,1", true);
              if (var2 != null) {
                tj.field_j[1] = ni.a((byte) -55, var2);
                break L49;
              } else {
                break L49;
              }
            }
            L50: {
              var2 = e.a("instructions_p3,0", true);
              if (null == var2) {
                break L50;
              } else {
                oj.field_c[0] = ni.a((byte) -55, var2);
                break L50;
              }
            }
            L51: {
              var2 = e.a("instructions_p3,1", true);
              if (var2 != null) {
                oj.field_c[1] = ni.a((byte) -55, var2);
                break L51;
              } else {
                break L51;
              }
            }
            L52: {
              var2 = e.a("instructions_p3,2", true);
              if (var2 == null) {
                break L52;
              } else {
                oj.field_c[2] = ni.a((byte) -55, var2);
                break L52;
              }
            }
            L53: {
              var2 = e.a("instructions_p3,3", true);
              if (var2 != null) {
                oj.field_c[3] = ni.a((byte) -55, var2);
                break L53;
              } else {
                break L53;
              }
            }
            L54: {
              var2 = e.a("instructions_p4,0", true);
              if (null != var2) {
                ve.field_b[0] = ni.a((byte) -55, var2);
                break L54;
              } else {
                break L54;
              }
            }
            L55: {
              var2 = e.a("instructions_p4,1", true);
              if (null == var2) {
                break L55;
              } else {
                ve.field_b[1] = ni.a((byte) -55, var2);
                break L55;
              }
            }
            L56: {
              stackIn_200_0 = "_1of4";

              if (param0) {
                stackIn_201_0 = (String) ((Object) stackIn_200_0);
                stackIn_201_1 = 0;
                break L56;
              } else {
                stackIn_201_0 = (String) ((Object) stackIn_200_0);
                stackIn_201_1 = 1;
                break L56;
              }
            }
            L57: {
              var2 = e.a(stackIn_201_0, stackIn_201_1 != 0);
              if (var2 != null) {
                cb.field_D = ni.a((byte) -55, var2);
                break L57;
              } else {
                break L57;
              }
            }
            L58: {
              stackIn_208_0 = "_2of4";

              if (param0) {
                stackIn_209_0 = (String) ((Object) stackIn_208_0);
                stackIn_209_1 = 0;
                break L58;
              } else {
                stackIn_209_0 = (String) ((Object) stackIn_208_0);
                stackIn_209_1 = 1;
                break L58;
              }
            }
            L59: {
              var2 = e.a(stackIn_209_0, stackIn_209_1 != 0);
              if (var2 != null) {
                rk.field_k = ni.a((byte) -55, var2);
                break L59;
              } else {
                break L59;
              }
            }
            L60: {
              var2 = e.a("_3of4", true);
              if (null != var2) {
                bl.field_a = ni.a((byte) -55, var2);
                break L60;
              } else {
                break L60;
              }
            }
            L61: {
              var2 = e.a("_4of4", true);
              if (var2 != null) {
                eg.field_E = ni.a((byte) -55, var2);
                break L61;
              } else {
                break L61;
              }
            }
            L62: {
              stackIn_224_0 = "tutorial_p1";

              if (param0) {
                stackIn_225_0 = (String) ((Object) stackIn_224_0);
                stackIn_225_1 = 0;
                break L62;
              } else {
                stackIn_225_0 = (String) ((Object) stackIn_224_0);
                stackIn_225_1 = 1;
                break L62;
              }
            }
            L63: {
              var2 = e.a(stackIn_225_0, stackIn_225_1 != 0);
              if (null != var2) {
                kk.field_n = ni.a((byte) -55, var2);
                break L63;
              } else {
                break L63;
              }
            }
            L64: {
              stackIn_232_0 = "tutorial_p2";

              if (param0) {
                stackIn_233_0 = (String) ((Object) stackIn_232_0);
                stackIn_233_1 = 0;
                break L64;
              } else {
                stackIn_233_0 = (String) ((Object) stackIn_232_0);
                stackIn_233_1 = 1;
                break L64;
              }
            }
            L65: {
              var2 = e.a(stackIn_233_0, stackIn_233_1 != 0);
              if (null == var2) {
                break L65;
              } else {
                pk.field_D = ni.a((byte) -55, var2);
                break L65;
              }
            }
            L66: {
              var2 = e.a("tutorial_p3", true);
              if (var2 == null) {
                break L66;
              } else {
                tf.field_b = ni.a((byte) -55, var2);
                break L66;
              }
            }
            L67: {
              stackIn_242_0 = "tutorial_p4";

              if (param0) {
                stackIn_243_0 = (String) ((Object) stackIn_242_0);
                stackIn_243_1 = 0;
                break L67;
              } else {
                stackIn_243_0 = (String) ((Object) stackIn_242_0);
                stackIn_243_1 = 1;
                break L67;
              }
            }
            L68: {
              var2 = e.a(stackIn_243_0, stackIn_243_1 != 0);
              if (var2 == null) {
                break L68;
              } else {
                kk.field_q = ni.a((byte) -55, var2);
                break L68;
              }
            }
            L69: {
              var2 = e.a("END", true);
              if (var2 != null) {
                sj.field_l = ni.a((byte) -55, var2);
                break L69;
              } else {
                break L69;
              }
            }
            L70: {
              var2 = e.a("OF", true);
              if (null != var2) {
                eb.field_a = ni.a((byte) -55, var2);
                break L70;
              } else {
                break L70;
              }
            }
            L71: {
              stackIn_257_0 = "TUTORIAL";

              if (param0) {
                stackIn_258_0 = (String) ((Object) stackIn_257_0);
                stackIn_258_1 = 0;
                break L71;
              } else {
                stackIn_258_0 = (String) ((Object) stackIn_257_0);
                stackIn_258_1 = 1;
                break L71;
              }
            }
            L72: {
              var2 = e.a(stackIn_258_0, stackIn_258_1 != 0);
              if (null != var2) {
                td.field_g = ni.a((byte) -55, var2);
                break L72;
              } else {
                break L72;
              }
            }
            L73: {
              var2 = e.a("xquest", true);
              if (null != var2) {
                id.field_t = ni.a((byte) -55, var2);
                break L73;
              } else {
                break L73;
              }
            }
            L74: {
              var2 = e.a("tutorialp1_word1", true);
              if (var2 != null) {
                bj.field_a = ni.a((byte) -55, var2);
                break L74;
              } else {
                break L74;
              }
            }
            L75: {
              var2 = e.a("tutorialp2_word1", true);
              if (null != var2) {
                md.field_L = ni.a((byte) -55, var2);
                break L75;
              } else {
                break L75;
              }
            }
            L76: {
              stackIn_277_0 = "tutorialp3_word1";

              if (param0) {
                stackIn_278_0 = (String) ((Object) stackIn_277_0);
                stackIn_278_1 = 0;
                break L76;
              } else {
                stackIn_278_0 = (String) ((Object) stackIn_277_0);
                stackIn_278_1 = 1;
                break L76;
              }
            }
            L77: {
              var2 = e.a(stackIn_278_0, stackIn_278_1 != 0);
              if (var2 == null) {
                break L77;
              } else {
                c.field_n = ni.a((byte) -55, var2);
                break L77;
              }
            }
            L78: {
              var2 = e.a("tutorialp3_word2", true);
              if (var2 == null) {
                break L78;
              } else {
                ch.field_d = ni.a((byte) -55, var2);
                break L78;
              }
            }
            L79: {
              var2 = e.a("tutorialp3_word3", true);
              if (var2 == null) {
                break L79;
              } else {
                jf.field_G = ni.a((byte) -55, var2);
                break L79;
              }
            }
            L80: {
              stackIn_290_0 = "keycode_rotate_1";

              if (param0) {
                stackIn_291_0 = (String) ((Object) stackIn_290_0);
                stackIn_291_1 = 0;
                break L80;
              } else {
                stackIn_291_0 = (String) ((Object) stackIn_290_0);
                stackIn_291_1 = 1;
                break L80;
              }
            }
            L81: {
              var2 = e.a(stackIn_291_0, stackIn_291_1 != 0);
              if (var2 == null) {
                break L81;
              } else {
                sa.field_c = var2[0] & 255;
                break L81;
              }
            }
            L82: {
              var2 = e.a("keycode_antirotate_1", true);
              if (null != var2) {
                gk.field_e = var2[0] & 255;
                break L82;
              } else {
                break L82;
              }
            }
            th.field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L83: {
            var2_ref = decompiledCaughtException;
            stackIn_303_0 = (RuntimeException) (var2_ref);

            stackIn_303_1 = new StringBuilder().append("ce.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_304_0 = (RuntimeException) ((Object) stackIn_303_0);
              stackIn_304_1 = (StringBuilder) ((Object) stackIn_303_1);
              stackIn_304_2 = "null";
              break L83;
            } else {
              stackIn_304_0 = (RuntimeException) ((Object) stackIn_303_0);
              stackIn_304_1 = (StringBuilder) ((Object) stackIn_303_1);
              stackIn_304_2 = "{...}";
              break L83;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_304_0), stackIn_304_2 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_c = null;
              if (param0 == -5602) {
                break L1;
              } else {
                ce.b(52);
                break L1;
              }
            }
            field_a = null;
            field_b = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "ce.B(" + param0 + ')');
        }
    }

    static {
        field_c = new int[]{19, 33, 31, 40, 50, 26, 49, 30, 33};
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
