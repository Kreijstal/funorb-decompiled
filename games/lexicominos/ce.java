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
            throw ld.a((Throwable) (Object) runtimeException, "ce.D(" + param0 + 41);
        }
    }

    final static vi a(int param0, int param1) {
        vi var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        vi stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        vi stackOut_0_0 = null;
        try {
          L0: {
            var2 = new vi();
            var3 = 0;
            ci.field_f.b(109, (kd) (Object) var2);
            ck.a(4, 2);
            stackOut_0_0 = (vi) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2_ref, "ce.C(" + 4 + 44 + 109 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0, sh param1) {
        byte[] var2 = null;
        String stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        String stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        String stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        String stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        String stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        String stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        String stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        String stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        String stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        String stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        String stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        String stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        String stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        String stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        String stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        String stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        String stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        String stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        String stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        String stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        String stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        String stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        String stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        String stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        String stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        String stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        String stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        String stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        L0: {
          th.field_u = param1;
          var2 = e.a("defaultlang", true);
          if (var2 != null) {
            ug.field_s = ni.a((byte) -55, var2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var2 = e.a("waitingfor_animations", true);
          if (null == var2) {
            break L1;
          } else {
            ee.field_e = ni.a((byte) -55, var2);
            break L1;
          }
        }
        L2: {
          var2 = e.a("loading_animations", true);
          if (null == var2) {
            break L2;
          } else {
            ia.field_F = ni.a((byte) -55, var2);
            break L2;
          }
        }
        L3: {
          var2 = e.a("unpacking_animations", true);
          if (null == var2) {
            break L3;
          } else {
            qa.field_b = ni.a((byte) -55, var2);
            break L3;
          }
        }
        L4: {
          var2 = e.a("achievement_names,0", true);
          if (var2 != null) {
            df.field_d[0] = ni.a((byte) -55, var2);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          var2 = e.a("achievement_names,1", true);
          if (null == var2) {
            break L5;
          } else {
            df.field_d[1] = ni.a((byte) -55, var2);
            break L5;
          }
        }
        L6: {
          var2 = e.a("achievement_names,2", true);
          if (null != var2) {
            df.field_d[2] = ni.a((byte) -55, var2);
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var2 = e.a("achievement_names,3", true);
          if (null != var2) {
            df.field_d[3] = ni.a((byte) -55, var2);
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          var2 = e.a("achievement_names,4", true);
          if (null == var2) {
            break L8;
          } else {
            df.field_d[4] = ni.a((byte) -55, var2);
            break L8;
          }
        }
        L9: {
          var2 = e.a("achievement_names,5", true);
          if (null != var2) {
            df.field_d[5] = ni.a((byte) -55, var2);
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var2 = e.a("achievement_names,6", true);
          if (var2 == null) {
            break L10;
          } else {
            df.field_d[6] = ni.a((byte) -55, var2);
            break L10;
          }
        }
        stackOut_28_0 = "achievement_names,7";
        stackOut_28_1 = 1;
        stackIn_29_0 = stackOut_28_0;
        stackIn_29_1 = stackOut_28_1;
        L11: {
          var2 = e.a(stackIn_29_0, stackIn_29_1 != 0);
          if (null == var2) {
            break L11;
          } else {
            df.field_d[7] = ni.a((byte) -55, var2);
            break L11;
          }
        }
        L12: {
          var2 = e.a("achievement_names,8", true);
          if (null != var2) {
            df.field_d[8] = ni.a((byte) -55, var2);
            break L12;
          } else {
            break L12;
          }
        }
        stackOut_34_0 = "achievement_names,9";
        stackOut_34_1 = 1;
        stackIn_35_0 = stackOut_34_0;
        stackIn_35_1 = stackOut_34_1;
        L13: {
          var2 = e.a(stackIn_35_0, stackIn_35_1 != 0);
          if (var2 != null) {
            df.field_d[9] = ni.a((byte) -55, var2);
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          var2 = e.a("achievement_names,10", true);
          if (null != var2) {
            df.field_d[10] = ni.a((byte) -55, var2);
            break L14;
          } else {
            break L14;
          }
        }
        L15: {
          var2 = e.a("achievement_names,11", true);
          if (var2 == null) {
            break L15;
          } else {
            df.field_d[11] = ni.a((byte) -55, var2);
            break L15;
          }
        }
        L16: {
          var2 = e.a("achievement_names,12", true);
          if (null != var2) {
            df.field_d[12] = ni.a((byte) -55, var2);
            break L16;
          } else {
            break L16;
          }
        }
        L17: {
          var2 = e.a("achievement_names,13", true);
          if (var2 == null) {
            break L17;
          } else {
            df.field_d[13] = ni.a((byte) -55, var2);
            break L17;
          }
        }
        stackOut_48_0 = "achievement_names,14";
        stackOut_48_1 = 1;
        stackIn_49_0 = stackOut_48_0;
        stackIn_49_1 = stackOut_48_1;
        L18: {
          var2 = e.a(stackIn_49_0, stackIn_49_1 != 0);
          if (var2 == null) {
            break L18;
          } else {
            df.field_d[14] = ni.a((byte) -55, var2);
            break L18;
          }
        }
        stackOut_51_0 = "achievement_names,15";
        stackOut_51_1 = 1;
        stackIn_52_0 = stackOut_51_0;
        stackIn_52_1 = stackOut_51_1;
        L19: {
          var2 = e.a(stackIn_52_0, stackIn_52_1 != 0);
          if (null != var2) {
            df.field_d[15] = ni.a((byte) -55, var2);
            break L19;
          } else {
            break L19;
          }
        }
        L20: {
          var2 = e.a("achievement_criteria,0", true);
          if (var2 == null) {
            break L20;
          } else {
            hc.field_ib[0] = ni.a((byte) -55, var2);
            break L20;
          }
        }
        L21: {
          var2 = e.a("achievement_criteria,1", true);
          if (var2 != null) {
            hc.field_ib[1] = ni.a((byte) -55, var2);
            break L21;
          } else {
            break L21;
          }
        }
        L22: {
          var2 = e.a("achievement_criteria,2", true);
          if (null == var2) {
            break L22;
          } else {
            hc.field_ib[2] = ni.a((byte) -55, var2);
            break L22;
          }
        }
        L23: {
          var2 = e.a("achievement_criteria,3", true);
          if (var2 != null) {
            hc.field_ib[3] = ni.a((byte) -55, var2);
            break L23;
          } else {
            break L23;
          }
        }
        stackOut_65_0 = "achievement_criteria,4";
        stackOut_65_1 = 1;
        stackIn_66_0 = stackOut_65_0;
        stackIn_66_1 = stackOut_65_1;
        L24: {
          var2 = e.a(stackIn_66_0, stackIn_66_1 != 0);
          if (var2 != null) {
            hc.field_ib[4] = ni.a((byte) -55, var2);
            break L24;
          } else {
            break L24;
          }
        }
        stackOut_69_0 = "achievement_criteria,5";
        stackOut_69_1 = 1;
        stackIn_70_0 = stackOut_69_0;
        stackIn_70_1 = stackOut_69_1;
        L25: {
          var2 = e.a(stackIn_70_0, stackIn_70_1 != 0);
          if (var2 != null) {
            hc.field_ib[5] = ni.a((byte) -55, var2);
            break L25;
          } else {
            break L25;
          }
        }
        L26: {
          var2 = e.a("achievement_criteria,6", true);
          if (var2 != null) {
            hc.field_ib[6] = ni.a((byte) -55, var2);
            break L26;
          } else {
            break L26;
          }
        }
        stackOut_76_0 = "achievement_criteria,7";
        stackOut_76_1 = 1;
        stackIn_77_0 = stackOut_76_0;
        stackIn_77_1 = stackOut_76_1;
        L27: {
          var2 = e.a(stackIn_77_0, stackIn_77_1 != 0);
          if (null != var2) {
            hc.field_ib[7] = ni.a((byte) -55, var2);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          var2 = e.a("achievement_criteria,8", true);
          if (null != var2) {
            hc.field_ib[8] = ni.a((byte) -55, var2);
            break L28;
          } else {
            break L28;
          }
        }
        L29: {
          var2 = e.a("achievement_criteria,9", true);
          if (var2 == null) {
            break L29;
          } else {
            hc.field_ib[9] = ni.a((byte) -55, var2);
            break L29;
          }
        }
        stackOut_85_0 = "achievement_criteria,10";
        stackOut_85_1 = 1;
        stackIn_86_0 = stackOut_85_0;
        stackIn_86_1 = stackOut_85_1;
        L30: {
          var2 = e.a(stackIn_86_0, stackIn_86_1 != 0);
          if (null == var2) {
            break L30;
          } else {
            hc.field_ib[10] = ni.a((byte) -55, var2);
            break L30;
          }
        }
        L31: {
          var2 = e.a("achievement_criteria,11", true);
          if (null == var2) {
            break L31;
          } else {
            hc.field_ib[11] = ni.a((byte) -55, var2);
            break L31;
          }
        }
        stackOut_90_0 = "achievement_criteria,12";
        stackOut_90_1 = 1;
        stackIn_91_0 = stackOut_90_0;
        stackIn_91_1 = stackOut_90_1;
        L32: {
          var2 = e.a(stackIn_91_0, stackIn_91_1 != 0);
          if (var2 != null) {
            hc.field_ib[12] = ni.a((byte) -55, var2);
            break L32;
          } else {
            break L32;
          }
        }
        L33: {
          var2 = e.a("achievement_criteria,13", true);
          if (var2 == null) {
            break L33;
          } else {
            hc.field_ib[13] = ni.a((byte) -55, var2);
            break L33;
          }
        }
        L34: {
          var2 = e.a("achievement_criteria,14", true);
          if (var2 == null) {
            break L34;
          } else {
            hc.field_ib[14] = ni.a((byte) -55, var2);
            break L34;
          }
        }
        L35: {
          var2 = e.a("achievement_criteria,15", true);
          if (null == var2) {
            break L35;
          } else {
            hc.field_ib[15] = ni.a((byte) -55, var2);
            break L35;
          }
        }
        L36: {
          var2 = e.a("gameover", true);
          if (var2 != null) {
            ga.field_b = ni.a((byte) -55, var2);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          var2 = e.a("instructions_p1,0", true);
          if (var2 == null) {
            break L37;
          } else {
            tj.field_j[0] = ni.a((byte) -55, var2);
            break L37;
          }
        }
        L38: {
          var2 = e.a("instructions_p1,1", true);
          if (var2 != null) {
            tj.field_j[1] = ni.a((byte) -55, var2);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          var2 = e.a("instructions_p3,0", true);
          if (null == var2) {
            break L39;
          } else {
            oj.field_c[0] = ni.a((byte) -55, var2);
            break L39;
          }
        }
        L40: {
          var2 = e.a("instructions_p3,1", true);
          if (var2 != null) {
            oj.field_c[1] = ni.a((byte) -55, var2);
            break L40;
          } else {
            break L40;
          }
        }
        L41: {
          var2 = e.a("instructions_p3,2", true);
          if (var2 == null) {
            break L41;
          } else {
            oj.field_c[2] = ni.a((byte) -55, var2);
            break L41;
          }
        }
        L42: {
          var2 = e.a("instructions_p3,3", true);
          if (var2 != null) {
            oj.field_c[3] = ni.a((byte) -55, var2);
            break L42;
          } else {
            break L42;
          }
        }
        L43: {
          var2 = e.a("instructions_p4,0", true);
          if (null != var2) {
            ve.field_b[0] = ni.a((byte) -55, var2);
            break L43;
          } else {
            break L43;
          }
        }
        L44: {
          var2 = e.a("instructions_p4,1", true);
          if (null == var2) {
            break L44;
          } else {
            ve.field_b[1] = ni.a((byte) -55, var2);
            break L44;
          }
        }
        stackOut_123_0 = "_1of4";
        stackOut_123_1 = 1;
        stackIn_124_0 = stackOut_123_0;
        stackIn_124_1 = stackOut_123_1;
        L45: {
          var2 = e.a(stackIn_124_0, stackIn_124_1 != 0);
          if (var2 != null) {
            cb.field_D = ni.a((byte) -55, var2);
            break L45;
          } else {
            break L45;
          }
        }
        stackOut_127_0 = "_2of4";
        stackOut_127_1 = 1;
        stackIn_128_0 = stackOut_127_0;
        stackIn_128_1 = stackOut_127_1;
        L46: {
          var2 = e.a(stackIn_128_0, stackIn_128_1 != 0);
          if (var2 != null) {
            rk.field_k = ni.a((byte) -55, var2);
            break L46;
          } else {
            break L46;
          }
        }
        L47: {
          var2 = e.a("_3of4", true);
          if (null != var2) {
            bl.field_a = ni.a((byte) -55, var2);
            break L47;
          } else {
            break L47;
          }
        }
        L48: {
          var2 = e.a("_4of4", true);
          if (var2 != null) {
            eg.field_E = ni.a((byte) -55, var2);
            break L48;
          } else {
            break L48;
          }
        }
        stackOut_137_0 = "tutorial_p1";
        stackOut_137_1 = 1;
        stackIn_138_0 = stackOut_137_0;
        stackIn_138_1 = stackOut_137_1;
        L49: {
          var2 = e.a(stackIn_138_0, stackIn_138_1 != 0);
          if (null != var2) {
            kk.field_n = ni.a((byte) -55, var2);
            break L49;
          } else {
            break L49;
          }
        }
        stackOut_141_0 = "tutorial_p2";
        stackOut_141_1 = 1;
        stackIn_142_0 = stackOut_141_0;
        stackIn_142_1 = stackOut_141_1;
        L50: {
          var2 = e.a(stackIn_142_0, stackIn_142_1 != 0);
          if (null == var2) {
            break L50;
          } else {
            pk.field_D = ni.a((byte) -55, var2);
            break L50;
          }
        }
        L51: {
          var2 = e.a("tutorial_p3", true);
          if (var2 == null) {
            break L51;
          } else {
            tf.field_b = ni.a((byte) -55, var2);
            break L51;
          }
        }
        stackOut_146_0 = "tutorial_p4";
        stackOut_146_1 = 1;
        stackIn_147_0 = stackOut_146_0;
        stackIn_147_1 = stackOut_146_1;
        L52: {
          var2 = e.a(stackIn_147_0, stackIn_147_1 != 0);
          if (var2 == null) {
            break L52;
          } else {
            kk.field_q = ni.a((byte) -55, var2);
            break L52;
          }
        }
        L53: {
          var2 = e.a("END", true);
          if (var2 != null) {
            sj.field_l = ni.a((byte) -55, var2);
            break L53;
          } else {
            break L53;
          }
        }
        L54: {
          var2 = e.a("OF", true);
          if (null != var2) {
            eb.field_a = ni.a((byte) -55, var2);
            break L54;
          } else {
            break L54;
          }
        }
        stackOut_155_0 = "TUTORIAL";
        stackOut_155_1 = 1;
        stackIn_156_0 = stackOut_155_0;
        stackIn_156_1 = stackOut_155_1;
        L55: {
          var2 = e.a(stackIn_156_0, stackIn_156_1 != 0);
          if (null != var2) {
            td.field_g = ni.a((byte) -55, var2);
            break L55;
          } else {
            break L55;
          }
        }
        L56: {
          var2 = e.a("xquest", true);
          if (null != var2) {
            id.field_t = ni.a((byte) -55, var2);
            break L56;
          } else {
            break L56;
          }
        }
        L57: {
          var2 = e.a("tutorialp1_word1", true);
          if (var2 != null) {
            bj.field_a = ni.a((byte) -55, var2);
            break L57;
          } else {
            break L57;
          }
        }
        L58: {
          var2 = e.a("tutorialp2_word1", true);
          if (null != var2) {
            md.field_L = ni.a((byte) -55, var2);
            break L58;
          } else {
            break L58;
          }
        }
        stackOut_168_0 = "tutorialp3_word1";
        stackOut_168_1 = 1;
        stackIn_169_0 = stackOut_168_0;
        stackIn_169_1 = stackOut_168_1;
        L59: {
          var2 = e.a(stackIn_169_0, stackIn_169_1 != 0);
          if (var2 == null) {
            break L59;
          } else {
            c.field_n = ni.a((byte) -55, var2);
            break L59;
          }
        }
        L60: {
          var2 = e.a("tutorialp3_word2", true);
          if (var2 == null) {
            break L60;
          } else {
            ch.field_d = ni.a((byte) -55, var2);
            break L60;
          }
        }
        L61: {
          var2 = e.a("tutorialp3_word3", true);
          if (var2 == null) {
            break L61;
          } else {
            jf.field_G = ni.a((byte) -55, var2);
            break L61;
          }
        }
        stackOut_175_0 = "keycode_rotate_1";
        stackOut_175_1 = 1;
        stackIn_176_0 = stackOut_175_0;
        stackIn_176_1 = stackOut_175_1;
        L62: {
          var2 = e.a(stackIn_176_0, stackIn_176_1 != 0);
          if (var2 == null) {
            break L62;
          } else {
            sa.field_c = var2[0] & 255;
            break L62;
          }
        }
        L63: {
          var2 = e.a("keycode_antirotate_1", true);
          if (null != var2) {
            gk.field_e = var2[0] & 255;
            break L63;
          } else {
            break L63;
          }
        }
        th.field_u = null;
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_c = null;
            field_a = null;
            field_b = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var1, "ce.B(" + -5602 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{19, 33, 31, 40, 50, 26, 49, 30, 33};
        field_a = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
