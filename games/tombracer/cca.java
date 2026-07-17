/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cca extends rva {
    vua field_A;
    jo field_x;
    private boolean field_y;
    private jo field_D;
    private boolean field_B;
    static long field_z;

    final static iu[] a(int param0, cn param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        iu[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        iu[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (jna.a(false, param0, param3, param1)) {
              int discarded$2 = 94;
              stackOut_3_0 = pn.i();
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (iu[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("cca.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + -97 + 44 + param3 + 41);
        }
        return stackIn_4_0;
    }

    private final void g(byte param0) {
        if (param0 > -122) {
            ((cca) this).field_x = null;
            if (!(null == ((cca) this).field_x)) {
                ((cca) this).field_A.field_x.field_n = -(int)((long)((cca) this).field_x.field_O * (long)(((cca) this).field_A.field_x.field_p - ((cca) this).field_A.field_p) >> 16);
            }
            if (null == ((cca) this).field_D) {
                return;
            }
            ((cca) this).field_A.field_x.field_i = -(int)((long)(-((cca) this).field_A.field_m + ((cca) this).field_A.field_x.field_m) * (long)((cca) this).field_D.field_C >> 16);
            return;
        }
        if (!(null == ((cca) this).field_x)) {
            ((cca) this).field_A.field_x.field_n = -(int)((long)((cca) this).field_x.field_O * (long)(((cca) this).field_A.field_x.field_p - ((cca) this).field_A.field_p) >> 16);
        }
        if (null != ((cca) this).field_D) {
            ((cca) this).field_A.field_x.field_i = -(int)((long)(-((cca) this).field_A.field_m + ((cca) this).field_A.field_x.field_m) * (long)((cca) this).field_D.field_C >> 16);
            return;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        jo stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        jo stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        jo stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        jo stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        jo stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        jo stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        int stackIn_21_5 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        jo stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        jo stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        jo stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        jo stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        int stackIn_40_4 = 0;
        jo stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_41_2 = 0;
        int stackIn_41_3 = 0;
        int stackIn_41_4 = 0;
        jo stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        int stackIn_42_5 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        jo stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        jo stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        jo stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        jo stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        jo stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        int stackIn_60_3 = 0;
        int stackIn_60_4 = 0;
        jo stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        int stackIn_61_4 = 0;
        int stackIn_61_5 = 0;
        int stackIn_66_0 = 0;
        int stackIn_69_0 = 0;
        jo stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        jo stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        jo stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        int stackIn_73_4 = 0;
        jo stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        int stackIn_77_4 = 0;
        jo stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        int stackIn_78_4 = 0;
        jo stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_79_4 = 0;
        int stackIn_79_5 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        jo stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        jo stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        jo stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        jo stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        jo stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        int stackIn_100_4 = 0;
        jo stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        int stackIn_101_4 = 0;
        int stackIn_101_5 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        jo stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        jo stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        jo stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        int stackIn_113_4 = 0;
        jo stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        jo stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        jo stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_119_5 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        jo stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        jo stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        jo stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        int stackIn_133_4 = 0;
        jo stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        int stackIn_137_4 = 0;
        jo stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        int stackIn_138_4 = 0;
        jo stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        int stackIn_139_4 = 0;
        int stackIn_139_5 = 0;
        int stackIn_144_0 = 0;
        int stackIn_147_0 = 0;
        jo stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        int stackIn_149_3 = 0;
        jo stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        int stackIn_150_3 = 0;
        jo stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int stackIn_151_2 = 0;
        int stackIn_151_3 = 0;
        int stackIn_151_4 = 0;
        jo stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        int stackIn_155_4 = 0;
        jo stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        int stackIn_156_2 = 0;
        int stackIn_156_3 = 0;
        int stackIn_156_4 = 0;
        jo stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        int stackIn_157_4 = 0;
        int stackIn_157_5 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        jo stackIn_168_0 = null;
        int stackIn_168_1 = 0;
        int stackIn_168_2 = 0;
        int stackIn_168_3 = 0;
        jo stackIn_169_0 = null;
        int stackIn_169_1 = 0;
        int stackIn_169_2 = 0;
        int stackIn_169_3 = 0;
        jo stackIn_170_0 = null;
        int stackIn_170_1 = 0;
        int stackIn_170_2 = 0;
        int stackIn_170_3 = 0;
        int stackIn_170_4 = 0;
        jo stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        int stackIn_174_2 = 0;
        int stackIn_174_3 = 0;
        int stackIn_174_4 = 0;
        jo stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        int stackIn_175_2 = 0;
        int stackIn_175_3 = 0;
        int stackIn_175_4 = 0;
        jo stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        int stackIn_176_2 = 0;
        int stackIn_176_3 = 0;
        int stackIn_176_4 = 0;
        int stackIn_176_5 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        jo stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        int stackIn_186_3 = 0;
        jo stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        int stackIn_187_3 = 0;
        jo stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        int stackIn_188_4 = 0;
        jo stackIn_192_0 = null;
        int stackIn_192_1 = 0;
        int stackIn_192_2 = 0;
        int stackIn_192_3 = 0;
        int stackIn_192_4 = 0;
        jo stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        int stackIn_193_2 = 0;
        int stackIn_193_3 = 0;
        int stackIn_193_4 = 0;
        jo stackIn_194_0 = null;
        int stackIn_194_1 = 0;
        int stackIn_194_2 = 0;
        int stackIn_194_3 = 0;
        int stackIn_194_4 = 0;
        int stackIn_194_5 = 0;
        int stackOut_81_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        jo stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        jo stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        jo stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        int stackOut_71_4 = 0;
        jo stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        int stackOut_76_4 = 0;
        jo stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        int stackOut_78_4 = 0;
        int stackOut_78_5 = 0;
        jo stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        int stackOut_77_4 = 0;
        int stackOut_77_5 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        jo stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        jo stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        jo stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        jo stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        jo stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        int stackOut_60_4 = 0;
        int stackOut_60_5 = 0;
        jo stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        int stackOut_59_4 = 0;
        int stackOut_59_5 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        jo stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        jo stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        jo stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        jo stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        int stackOut_39_4 = 0;
        jo stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        int stackOut_41_5 = 0;
        jo stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int stackOut_40_3 = 0;
        int stackOut_40_4 = 0;
        int stackOut_40_5 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        jo stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        jo stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        jo stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        jo stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        jo stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        jo stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        int stackOut_19_5 = 0;
        int stackOut_180_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        jo stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        int stackOut_185_3 = 0;
        jo stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        int stackOut_187_4 = 0;
        jo stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        int stackOut_186_4 = 0;
        jo stackOut_191_0 = null;
        int stackOut_191_1 = 0;
        int stackOut_191_2 = 0;
        int stackOut_191_3 = 0;
        int stackOut_191_4 = 0;
        jo stackOut_193_0 = null;
        int stackOut_193_1 = 0;
        int stackOut_193_2 = 0;
        int stackOut_193_3 = 0;
        int stackOut_193_4 = 0;
        int stackOut_193_5 = 0;
        jo stackOut_192_0 = null;
        int stackOut_192_1 = 0;
        int stackOut_192_2 = 0;
        int stackOut_192_3 = 0;
        int stackOut_192_4 = 0;
        int stackOut_192_5 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        jo stackOut_167_0 = null;
        int stackOut_167_1 = 0;
        int stackOut_167_2 = 0;
        int stackOut_167_3 = 0;
        jo stackOut_169_0 = null;
        int stackOut_169_1 = 0;
        int stackOut_169_2 = 0;
        int stackOut_169_3 = 0;
        int stackOut_169_4 = 0;
        jo stackOut_168_0 = null;
        int stackOut_168_1 = 0;
        int stackOut_168_2 = 0;
        int stackOut_168_3 = 0;
        int stackOut_168_4 = 0;
        jo stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int stackOut_173_2 = 0;
        int stackOut_173_3 = 0;
        int stackOut_173_4 = 0;
        jo stackOut_175_0 = null;
        int stackOut_175_1 = 0;
        int stackOut_175_2 = 0;
        int stackOut_175_3 = 0;
        int stackOut_175_4 = 0;
        int stackOut_175_5 = 0;
        jo stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        int stackOut_174_3 = 0;
        int stackOut_174_4 = 0;
        int stackOut_174_5 = 0;
        int stackOut_143_0 = 0;
        int stackOut_142_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        jo stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        jo stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_150_2 = 0;
        int stackOut_150_3 = 0;
        int stackOut_150_4 = 0;
        jo stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        int stackOut_149_2 = 0;
        int stackOut_149_3 = 0;
        int stackOut_149_4 = 0;
        jo stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        int stackOut_154_3 = 0;
        int stackOut_154_4 = 0;
        jo stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        int stackOut_156_2 = 0;
        int stackOut_156_3 = 0;
        int stackOut_156_4 = 0;
        int stackOut_156_5 = 0;
        jo stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        int stackOut_155_3 = 0;
        int stackOut_155_4 = 0;
        int stackOut_155_5 = 0;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        jo stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        int stackOut_130_2 = 0;
        int stackOut_130_3 = 0;
        jo stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        int stackOut_132_4 = 0;
        jo stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        int stackOut_131_4 = 0;
        jo stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        int stackOut_136_2 = 0;
        int stackOut_136_3 = 0;
        int stackOut_136_4 = 0;
        jo stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        int stackOut_138_2 = 0;
        int stackOut_138_3 = 0;
        int stackOut_138_4 = 0;
        int stackOut_138_5 = 0;
        jo stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        int stackOut_137_5 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        jo stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int stackOut_110_3 = 0;
        jo stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        int stackOut_112_4 = 0;
        jo stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        jo stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        jo stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        int stackOut_118_5 = 0;
        jo stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_117_5 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_89_0 = 0;
        jo stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        jo stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        jo stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        jo stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        int stackOut_98_4 = 0;
        jo stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_100_4 = 0;
        int stackOut_100_5 = 0;
        jo stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        int stackOut_99_5 = 0;
        L0: {
          if (((cca) this).field_B) {
            stackOut_81_0 = 0;
            stackIn_83_0 = stackOut_81_0;
            break L0;
          } else {
            if (null != ((cca) this).field_x) {
              stackOut_82_0 = ((cca) this).field_x.field_m;
              stackIn_83_0 = stackOut_82_0;
              break L0;
            } else {
              var2 = 0;
              if (!((cca) this).field_y) {
                if (null != ((cca) this).field_D) {
                  var3 = ((cca) this).field_D.field_p;
                  if (param0 == 88) {
                    L1: {
                      if (((cca) this).field_x == null) {
                        stackOut_65_0 = ((cca) this).field_m;
                        stackIn_66_0 = stackOut_65_0;
                        break L1;
                      } else {
                        stackOut_64_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                        stackIn_66_0 = stackOut_64_0;
                        break L1;
                      }
                    }
                    L2: {
                      var4 = stackIn_66_0;
                      if (null != ((cca) this).field_D) {
                        stackOut_68_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                        stackIn_69_0 = stackOut_68_0;
                        break L2;
                      } else {
                        stackOut_67_0 = ((cca) this).field_p;
                        stackIn_69_0 = stackOut_67_0;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_69_0;
                      ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                      if (null == ((cca) this).field_x) {
                        break L3;
                      } else {
                        L4: {
                          stackOut_70_0 = ((cca) this).field_x;
                          stackOut_70_1 = -31;
                          stackOut_70_2 = ((cca) this).field_x.field_m;
                          stackOut_70_3 = ((cca) this).field_A.field_p;
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_72_1 = stackOut_70_1;
                          stackIn_72_2 = stackOut_70_2;
                          stackIn_72_3 = stackOut_70_3;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          stackIn_71_2 = stackOut_70_2;
                          stackIn_71_3 = stackOut_70_3;
                          if (((cca) this).field_B) {
                            stackOut_72_0 = (jo) (Object) stackIn_72_0;
                            stackOut_72_1 = stackIn_72_1;
                            stackOut_72_2 = stackIn_72_2;
                            stackOut_72_3 = stackIn_72_3;
                            stackOut_72_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                            stackIn_73_0 = stackOut_72_0;
                            stackIn_73_1 = stackOut_72_1;
                            stackIn_73_2 = stackOut_72_2;
                            stackIn_73_3 = stackOut_72_3;
                            stackIn_73_4 = stackOut_72_4;
                            break L4;
                          } else {
                            stackOut_71_0 = (jo) (Object) stackIn_71_0;
                            stackOut_71_1 = stackIn_71_1;
                            stackOut_71_2 = stackIn_71_2;
                            stackOut_71_3 = stackIn_71_3;
                            stackOut_71_4 = 0;
                            stackIn_73_0 = stackOut_71_0;
                            stackIn_73_1 = stackOut_71_1;
                            stackIn_73_2 = stackOut_71_2;
                            stackIn_73_3 = stackOut_71_3;
                            stackIn_73_4 = stackOut_71_4;
                            break L4;
                          }
                        }
                        ((jo) (Object) stackIn_73_0).a((byte) stackIn_73_1, stackIn_73_2, stackIn_73_3, stackIn_73_4, ((cca) this).field_A.field_n);
                        break L3;
                      }
                    }
                    L5: {
                      if (null != ((cca) this).field_D) {
                        L6: {
                          stackOut_76_0 = ((cca) this).field_D;
                          stackOut_76_1 = -31;
                          stackOut_76_2 = ((cca) this).field_A.field_m;
                          stackOut_76_3 = ((cca) this).field_D.field_p;
                          stackOut_76_4 = ((cca) this).field_A.field_i;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_78_1 = stackOut_76_1;
                          stackIn_78_2 = stackOut_76_2;
                          stackIn_78_3 = stackOut_76_3;
                          stackIn_78_4 = stackOut_76_4;
                          stackIn_77_0 = stackOut_76_0;
                          stackIn_77_1 = stackOut_76_1;
                          stackIn_77_2 = stackOut_76_2;
                          stackIn_77_3 = stackOut_76_3;
                          stackIn_77_4 = stackOut_76_4;
                          if (!((cca) this).field_y) {
                            stackOut_78_0 = (jo) (Object) stackIn_78_0;
                            stackOut_78_1 = stackIn_78_1;
                            stackOut_78_2 = stackIn_78_2;
                            stackOut_78_3 = stackIn_78_3;
                            stackOut_78_4 = stackIn_78_4;
                            stackOut_78_5 = 0;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            stackIn_79_2 = stackOut_78_2;
                            stackIn_79_3 = stackOut_78_3;
                            stackIn_79_4 = stackOut_78_4;
                            stackIn_79_5 = stackOut_78_5;
                            break L6;
                          } else {
                            stackOut_77_0 = (jo) (Object) stackIn_77_0;
                            stackOut_77_1 = stackIn_77_1;
                            stackOut_77_2 = stackIn_77_2;
                            stackOut_77_3 = stackIn_77_3;
                            stackOut_77_4 = stackIn_77_4;
                            stackOut_77_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                            stackIn_79_0 = stackOut_77_0;
                            stackIn_79_1 = stackOut_77_1;
                            stackIn_79_2 = stackOut_77_2;
                            stackIn_79_3 = stackOut_77_3;
                            stackIn_79_4 = stackOut_77_4;
                            stackIn_79_5 = stackOut_77_5;
                            break L6;
                          }
                        }
                        ((jo) (Object) stackIn_79_0).a((byte) stackIn_79_1, stackIn_79_2, stackIn_79_3, stackIn_79_4, stackIn_79_5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    int discarded$16 = -31791;
                    this.c();
                    return;
                  } else {
                    L7: {
                      boolean discarded$17 = this.a(-26, -25);
                      if (((cca) this).field_x == null) {
                        stackOut_47_0 = ((cca) this).field_m;
                        stackIn_48_0 = stackOut_47_0;
                        break L7;
                      } else {
                        stackOut_46_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                        stackIn_48_0 = stackOut_46_0;
                        break L7;
                      }
                    }
                    L8: {
                      var4 = stackIn_48_0;
                      if (null != ((cca) this).field_D) {
                        stackOut_50_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                        stackIn_51_0 = stackOut_50_0;
                        break L8;
                      } else {
                        stackOut_49_0 = ((cca) this).field_p;
                        stackIn_51_0 = stackOut_49_0;
                        break L8;
                      }
                    }
                    L9: {
                      var5 = stackIn_51_0;
                      ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                      if (null == ((cca) this).field_x) {
                        break L9;
                      } else {
                        L10: {
                          stackOut_52_0 = ((cca) this).field_x;
                          stackOut_52_1 = -31;
                          stackOut_52_2 = ((cca) this).field_x.field_m;
                          stackOut_52_3 = ((cca) this).field_A.field_p;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_54_1 = stackOut_52_1;
                          stackIn_54_2 = stackOut_52_2;
                          stackIn_54_3 = stackOut_52_3;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          stackIn_53_3 = stackOut_52_3;
                          if (((cca) this).field_B) {
                            stackOut_54_0 = (jo) (Object) stackIn_54_0;
                            stackOut_54_1 = stackIn_54_1;
                            stackOut_54_2 = stackIn_54_2;
                            stackOut_54_3 = stackIn_54_3;
                            stackOut_54_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            stackIn_55_2 = stackOut_54_2;
                            stackIn_55_3 = stackOut_54_3;
                            stackIn_55_4 = stackOut_54_4;
                            break L10;
                          } else {
                            stackOut_53_0 = (jo) (Object) stackIn_53_0;
                            stackOut_53_1 = stackIn_53_1;
                            stackOut_53_2 = stackIn_53_2;
                            stackOut_53_3 = stackIn_53_3;
                            stackOut_53_4 = 0;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_55_2 = stackOut_53_2;
                            stackIn_55_3 = stackOut_53_3;
                            stackIn_55_4 = stackOut_53_4;
                            break L10;
                          }
                        }
                        ((jo) (Object) stackIn_55_0).a((byte) stackIn_55_1, stackIn_55_2, stackIn_55_3, stackIn_55_4, ((cca) this).field_A.field_n);
                        break L9;
                      }
                    }
                    L11: {
                      if (null != ((cca) this).field_D) {
                        L12: {
                          stackOut_58_0 = ((cca) this).field_D;
                          stackOut_58_1 = -31;
                          stackOut_58_2 = ((cca) this).field_A.field_m;
                          stackOut_58_3 = ((cca) this).field_D.field_p;
                          stackOut_58_4 = ((cca) this).field_A.field_i;
                          stackIn_60_0 = stackOut_58_0;
                          stackIn_60_1 = stackOut_58_1;
                          stackIn_60_2 = stackOut_58_2;
                          stackIn_60_3 = stackOut_58_3;
                          stackIn_60_4 = stackOut_58_4;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          stackIn_59_3 = stackOut_58_3;
                          stackIn_59_4 = stackOut_58_4;
                          if (!((cca) this).field_y) {
                            stackOut_60_0 = (jo) (Object) stackIn_60_0;
                            stackOut_60_1 = stackIn_60_1;
                            stackOut_60_2 = stackIn_60_2;
                            stackOut_60_3 = stackIn_60_3;
                            stackOut_60_4 = stackIn_60_4;
                            stackOut_60_5 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            stackIn_61_1 = stackOut_60_1;
                            stackIn_61_2 = stackOut_60_2;
                            stackIn_61_3 = stackOut_60_3;
                            stackIn_61_4 = stackOut_60_4;
                            stackIn_61_5 = stackOut_60_5;
                            break L12;
                          } else {
                            stackOut_59_0 = (jo) (Object) stackIn_59_0;
                            stackOut_59_1 = stackIn_59_1;
                            stackOut_59_2 = stackIn_59_2;
                            stackOut_59_3 = stackIn_59_3;
                            stackOut_59_4 = stackIn_59_4;
                            stackOut_59_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                            stackIn_61_0 = stackOut_59_0;
                            stackIn_61_1 = stackOut_59_1;
                            stackIn_61_2 = stackOut_59_2;
                            stackIn_61_3 = stackOut_59_3;
                            stackIn_61_4 = stackOut_59_4;
                            stackIn_61_5 = stackOut_59_5;
                            break L12;
                          }
                        }
                        ((jo) (Object) stackIn_61_0).a((byte) stackIn_61_1, stackIn_61_2, stackIn_61_3, stackIn_61_4, stackIn_61_5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    int discarded$18 = -31791;
                    this.c();
                    return;
                  }
                } else {
                  L13: {
                    var3 = 0;
                    if (param0 == 88) {
                      break L13;
                    } else {
                      boolean discarded$19 = this.a(-26, -25);
                      break L13;
                    }
                  }
                  L14: {
                    if (((cca) this).field_x == null) {
                      stackOut_28_0 = ((cca) this).field_m;
                      stackIn_29_0 = stackOut_28_0;
                      break L14;
                    } else {
                      stackOut_27_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                      stackIn_29_0 = stackOut_27_0;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_29_0;
                    if (null != ((cca) this).field_D) {
                      stackOut_31_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                      stackIn_32_0 = stackOut_31_0;
                      break L15;
                    } else {
                      stackOut_30_0 = ((cca) this).field_p;
                      stackIn_32_0 = stackOut_30_0;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = stackIn_32_0;
                    ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                    if (null == ((cca) this).field_x) {
                      break L16;
                    } else {
                      L17: {
                        stackOut_33_0 = ((cca) this).field_x;
                        stackOut_33_1 = -31;
                        stackOut_33_2 = ((cca) this).field_x.field_m;
                        stackOut_33_3 = ((cca) this).field_A.field_p;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_35_2 = stackOut_33_2;
                        stackIn_35_3 = stackOut_33_3;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        stackIn_34_3 = stackOut_33_3;
                        if (((cca) this).field_B) {
                          stackOut_35_0 = (jo) (Object) stackIn_35_0;
                          stackOut_35_1 = stackIn_35_1;
                          stackOut_35_2 = stackIn_35_2;
                          stackOut_35_3 = stackIn_35_3;
                          stackOut_35_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          stackIn_36_2 = stackOut_35_2;
                          stackIn_36_3 = stackOut_35_3;
                          stackIn_36_4 = stackOut_35_4;
                          break L17;
                        } else {
                          stackOut_34_0 = (jo) (Object) stackIn_34_0;
                          stackOut_34_1 = stackIn_34_1;
                          stackOut_34_2 = stackIn_34_2;
                          stackOut_34_3 = stackIn_34_3;
                          stackOut_34_4 = 0;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_36_2 = stackOut_34_2;
                          stackIn_36_3 = stackOut_34_3;
                          stackIn_36_4 = stackOut_34_4;
                          break L17;
                        }
                      }
                      ((jo) (Object) stackIn_36_0).a((byte) stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, ((cca) this).field_A.field_n);
                      break L16;
                    }
                  }
                  L18: {
                    if (null != ((cca) this).field_D) {
                      L19: {
                        stackOut_39_0 = ((cca) this).field_D;
                        stackOut_39_1 = -31;
                        stackOut_39_2 = ((cca) this).field_A.field_m;
                        stackOut_39_3 = ((cca) this).field_D.field_p;
                        stackOut_39_4 = ((cca) this).field_A.field_i;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_41_2 = stackOut_39_2;
                        stackIn_41_3 = stackOut_39_3;
                        stackIn_41_4 = stackOut_39_4;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        stackIn_40_2 = stackOut_39_2;
                        stackIn_40_3 = stackOut_39_3;
                        stackIn_40_4 = stackOut_39_4;
                        if (!((cca) this).field_y) {
                          stackOut_41_0 = (jo) (Object) stackIn_41_0;
                          stackOut_41_1 = stackIn_41_1;
                          stackOut_41_2 = stackIn_41_2;
                          stackOut_41_3 = stackIn_41_3;
                          stackOut_41_4 = stackIn_41_4;
                          stackOut_41_5 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          stackIn_42_2 = stackOut_41_2;
                          stackIn_42_3 = stackOut_41_3;
                          stackIn_42_4 = stackOut_41_4;
                          stackIn_42_5 = stackOut_41_5;
                          break L19;
                        } else {
                          stackOut_40_0 = (jo) (Object) stackIn_40_0;
                          stackOut_40_1 = stackIn_40_1;
                          stackOut_40_2 = stackIn_40_2;
                          stackOut_40_3 = stackIn_40_3;
                          stackOut_40_4 = stackIn_40_4;
                          stackOut_40_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          stackIn_42_3 = stackOut_40_3;
                          stackIn_42_4 = stackOut_40_4;
                          stackIn_42_5 = stackOut_40_5;
                          break L19;
                        }
                      }
                      ((jo) (Object) stackIn_42_0).a((byte) stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4, stackIn_42_5);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  int discarded$20 = -31791;
                  this.c();
                  return;
                }
              } else {
                L20: {
                  var3 = 0;
                  if (param0 == 88) {
                    break L20;
                  } else {
                    boolean discarded$21 = this.a(-26, -25);
                    break L20;
                  }
                }
                L21: {
                  if (((cca) this).field_x == null) {
                    stackOut_7_0 = ((cca) this).field_m;
                    stackIn_8_0 = stackOut_7_0;
                    break L21;
                  } else {
                    stackOut_6_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                    stackIn_8_0 = stackOut_6_0;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_8_0;
                  if (null != ((cca) this).field_D) {
                    stackOut_10_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                    stackIn_11_0 = stackOut_10_0;
                    break L22;
                  } else {
                    stackOut_9_0 = ((cca) this).field_p;
                    stackIn_11_0 = stackOut_9_0;
                    break L22;
                  }
                }
                L23: {
                  var5 = stackIn_11_0;
                  ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                  if (null == ((cca) this).field_x) {
                    break L23;
                  } else {
                    L24: {
                      stackOut_12_0 = ((cca) this).field_x;
                      stackOut_12_1 = -31;
                      stackOut_12_2 = ((cca) this).field_x.field_m;
                      stackOut_12_3 = ((cca) this).field_A.field_p;
                      stackIn_14_0 = stackOut_12_0;
                      stackIn_14_1 = stackOut_12_1;
                      stackIn_14_2 = stackOut_12_2;
                      stackIn_14_3 = stackOut_12_3;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      if (((cca) this).field_B) {
                        stackOut_14_0 = (jo) (Object) stackIn_14_0;
                        stackOut_14_1 = stackIn_14_1;
                        stackOut_14_2 = stackIn_14_2;
                        stackOut_14_3 = stackIn_14_3;
                        stackOut_14_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        stackIn_15_2 = stackOut_14_2;
                        stackIn_15_3 = stackOut_14_3;
                        stackIn_15_4 = stackOut_14_4;
                        break L24;
                      } else {
                        stackOut_13_0 = (jo) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = stackIn_13_2;
                        stackOut_13_3 = stackIn_13_3;
                        stackOut_13_4 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        stackIn_15_1 = stackOut_13_1;
                        stackIn_15_2 = stackOut_13_2;
                        stackIn_15_3 = stackOut_13_3;
                        stackIn_15_4 = stackOut_13_4;
                        break L24;
                      }
                    }
                    ((jo) (Object) stackIn_15_0).a((byte) stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, ((cca) this).field_A.field_n);
                    break L23;
                  }
                }
                L25: {
                  if (null != ((cca) this).field_D) {
                    L26: {
                      stackOut_18_0 = ((cca) this).field_D;
                      stackOut_18_1 = -31;
                      stackOut_18_2 = ((cca) this).field_A.field_m;
                      stackOut_18_3 = ((cca) this).field_D.field_p;
                      stackOut_18_4 = ((cca) this).field_A.field_i;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_20_2 = stackOut_18_2;
                      stackIn_20_3 = stackOut_18_3;
                      stackIn_20_4 = stackOut_18_4;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      stackIn_19_2 = stackOut_18_2;
                      stackIn_19_3 = stackOut_18_3;
                      stackIn_19_4 = stackOut_18_4;
                      if (!((cca) this).field_y) {
                        stackOut_20_0 = (jo) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = stackIn_20_4;
                        stackOut_20_5 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        stackIn_21_3 = stackOut_20_3;
                        stackIn_21_4 = stackOut_20_4;
                        stackIn_21_5 = stackOut_20_5;
                        break L26;
                      } else {
                        stackOut_19_0 = (jo) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = stackIn_19_2;
                        stackOut_19_3 = stackIn_19_3;
                        stackOut_19_4 = stackIn_19_4;
                        stackOut_19_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        stackIn_21_3 = stackOut_19_3;
                        stackIn_21_4 = stackOut_19_4;
                        stackIn_21_5 = stackOut_19_5;
                        break L26;
                      }
                    }
                    ((jo) (Object) stackIn_21_0).a((byte) stackIn_21_1, stackIn_21_2, stackIn_21_3, stackIn_21_4, stackIn_21_5);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                int discarded$22 = -31791;
                this.c();
                return;
              }
            }
          }
        }
        var2 = stackIn_83_0;
        if (!((cca) this).field_y) {
          if (null != ((cca) this).field_D) {
            var3 = ((cca) this).field_D.field_p;
            if (param0 == 88) {
              L27: {
                if (((cca) this).field_x == null) {
                  stackOut_180_0 = ((cca) this).field_m;
                  stackIn_181_0 = stackOut_180_0;
                  break L27;
                } else {
                  stackOut_179_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                  stackIn_181_0 = stackOut_179_0;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_181_0;
                if (null != ((cca) this).field_D) {
                  stackOut_183_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                  stackIn_184_0 = stackOut_183_0;
                  break L28;
                } else {
                  stackOut_182_0 = ((cca) this).field_p;
                  stackIn_184_0 = stackOut_182_0;
                  break L28;
                }
              }
              L29: {
                var5 = stackIn_184_0;
                ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == ((cca) this).field_x) {
                  break L29;
                } else {
                  L30: {
                    stackOut_185_0 = ((cca) this).field_x;
                    stackOut_185_1 = -31;
                    stackOut_185_2 = ((cca) this).field_x.field_m;
                    stackOut_185_3 = ((cca) this).field_A.field_p;
                    stackIn_187_0 = stackOut_185_0;
                    stackIn_187_1 = stackOut_185_1;
                    stackIn_187_2 = stackOut_185_2;
                    stackIn_187_3 = stackOut_185_3;
                    stackIn_186_0 = stackOut_185_0;
                    stackIn_186_1 = stackOut_185_1;
                    stackIn_186_2 = stackOut_185_2;
                    stackIn_186_3 = stackOut_185_3;
                    if (((cca) this).field_B) {
                      stackOut_187_0 = (jo) (Object) stackIn_187_0;
                      stackOut_187_1 = stackIn_187_1;
                      stackOut_187_2 = stackIn_187_2;
                      stackOut_187_3 = stackIn_187_3;
                      stackOut_187_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      stackIn_188_2 = stackOut_187_2;
                      stackIn_188_3 = stackOut_187_3;
                      stackIn_188_4 = stackOut_187_4;
                      break L30;
                    } else {
                      stackOut_186_0 = (jo) (Object) stackIn_186_0;
                      stackOut_186_1 = stackIn_186_1;
                      stackOut_186_2 = stackIn_186_2;
                      stackOut_186_3 = stackIn_186_3;
                      stackOut_186_4 = 0;
                      stackIn_188_0 = stackOut_186_0;
                      stackIn_188_1 = stackOut_186_1;
                      stackIn_188_2 = stackOut_186_2;
                      stackIn_188_3 = stackOut_186_3;
                      stackIn_188_4 = stackOut_186_4;
                      break L30;
                    }
                  }
                  ((jo) (Object) stackIn_188_0).a((byte) stackIn_188_1, stackIn_188_2, stackIn_188_3, stackIn_188_4, ((cca) this).field_A.field_n);
                  break L29;
                }
              }
              L31: {
                if (null != ((cca) this).field_D) {
                  L32: {
                    stackOut_191_0 = ((cca) this).field_D;
                    stackOut_191_1 = -31;
                    stackOut_191_2 = ((cca) this).field_A.field_m;
                    stackOut_191_3 = ((cca) this).field_D.field_p;
                    stackOut_191_4 = ((cca) this).field_A.field_i;
                    stackIn_193_0 = stackOut_191_0;
                    stackIn_193_1 = stackOut_191_1;
                    stackIn_193_2 = stackOut_191_2;
                    stackIn_193_3 = stackOut_191_3;
                    stackIn_193_4 = stackOut_191_4;
                    stackIn_192_0 = stackOut_191_0;
                    stackIn_192_1 = stackOut_191_1;
                    stackIn_192_2 = stackOut_191_2;
                    stackIn_192_3 = stackOut_191_3;
                    stackIn_192_4 = stackOut_191_4;
                    if (!((cca) this).field_y) {
                      stackOut_193_0 = (jo) (Object) stackIn_193_0;
                      stackOut_193_1 = stackIn_193_1;
                      stackOut_193_2 = stackIn_193_2;
                      stackOut_193_3 = stackIn_193_3;
                      stackOut_193_4 = stackIn_193_4;
                      stackOut_193_5 = 0;
                      stackIn_194_0 = stackOut_193_0;
                      stackIn_194_1 = stackOut_193_1;
                      stackIn_194_2 = stackOut_193_2;
                      stackIn_194_3 = stackOut_193_3;
                      stackIn_194_4 = stackOut_193_4;
                      stackIn_194_5 = stackOut_193_5;
                      break L32;
                    } else {
                      stackOut_192_0 = (jo) (Object) stackIn_192_0;
                      stackOut_192_1 = stackIn_192_1;
                      stackOut_192_2 = stackIn_192_2;
                      stackOut_192_3 = stackIn_192_3;
                      stackOut_192_4 = stackIn_192_4;
                      stackOut_192_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                      stackIn_194_0 = stackOut_192_0;
                      stackIn_194_1 = stackOut_192_1;
                      stackIn_194_2 = stackOut_192_2;
                      stackIn_194_3 = stackOut_192_3;
                      stackIn_194_4 = stackOut_192_4;
                      stackIn_194_5 = stackOut_192_5;
                      break L32;
                    }
                  }
                  ((jo) (Object) stackIn_194_0).a((byte) stackIn_194_1, stackIn_194_2, stackIn_194_3, stackIn_194_4, stackIn_194_5);
                  break L31;
                } else {
                  break L31;
                }
              }
              int discarded$23 = -31791;
              this.c();
              return;
            } else {
              L33: {
                boolean discarded$24 = this.a(-26, -25);
                if (((cca) this).field_x == null) {
                  stackOut_162_0 = ((cca) this).field_m;
                  stackIn_163_0 = stackOut_162_0;
                  break L33;
                } else {
                  stackOut_161_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                  stackIn_163_0 = stackOut_161_0;
                  break L33;
                }
              }
              L34: {
                var4 = stackIn_163_0;
                if (null != ((cca) this).field_D) {
                  stackOut_165_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                  stackIn_166_0 = stackOut_165_0;
                  break L34;
                } else {
                  stackOut_164_0 = ((cca) this).field_p;
                  stackIn_166_0 = stackOut_164_0;
                  break L34;
                }
              }
              L35: {
                var5 = stackIn_166_0;
                ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == ((cca) this).field_x) {
                  break L35;
                } else {
                  L36: {
                    stackOut_167_0 = ((cca) this).field_x;
                    stackOut_167_1 = -31;
                    stackOut_167_2 = ((cca) this).field_x.field_m;
                    stackOut_167_3 = ((cca) this).field_A.field_p;
                    stackIn_169_0 = stackOut_167_0;
                    stackIn_169_1 = stackOut_167_1;
                    stackIn_169_2 = stackOut_167_2;
                    stackIn_169_3 = stackOut_167_3;
                    stackIn_168_0 = stackOut_167_0;
                    stackIn_168_1 = stackOut_167_1;
                    stackIn_168_2 = stackOut_167_2;
                    stackIn_168_3 = stackOut_167_3;
                    if (((cca) this).field_B) {
                      stackOut_169_0 = (jo) (Object) stackIn_169_0;
                      stackOut_169_1 = stackIn_169_1;
                      stackOut_169_2 = stackIn_169_2;
                      stackOut_169_3 = stackIn_169_3;
                      stackOut_169_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                      stackIn_170_0 = stackOut_169_0;
                      stackIn_170_1 = stackOut_169_1;
                      stackIn_170_2 = stackOut_169_2;
                      stackIn_170_3 = stackOut_169_3;
                      stackIn_170_4 = stackOut_169_4;
                      break L36;
                    } else {
                      stackOut_168_0 = (jo) (Object) stackIn_168_0;
                      stackOut_168_1 = stackIn_168_1;
                      stackOut_168_2 = stackIn_168_2;
                      stackOut_168_3 = stackIn_168_3;
                      stackOut_168_4 = 0;
                      stackIn_170_0 = stackOut_168_0;
                      stackIn_170_1 = stackOut_168_1;
                      stackIn_170_2 = stackOut_168_2;
                      stackIn_170_3 = stackOut_168_3;
                      stackIn_170_4 = stackOut_168_4;
                      break L36;
                    }
                  }
                  ((jo) (Object) stackIn_170_0).a((byte) stackIn_170_1, stackIn_170_2, stackIn_170_3, stackIn_170_4, ((cca) this).field_A.field_n);
                  break L35;
                }
              }
              L37: {
                if (null != ((cca) this).field_D) {
                  L38: {
                    stackOut_173_0 = ((cca) this).field_D;
                    stackOut_173_1 = -31;
                    stackOut_173_2 = ((cca) this).field_A.field_m;
                    stackOut_173_3 = ((cca) this).field_D.field_p;
                    stackOut_173_4 = ((cca) this).field_A.field_i;
                    stackIn_175_0 = stackOut_173_0;
                    stackIn_175_1 = stackOut_173_1;
                    stackIn_175_2 = stackOut_173_2;
                    stackIn_175_3 = stackOut_173_3;
                    stackIn_175_4 = stackOut_173_4;
                    stackIn_174_0 = stackOut_173_0;
                    stackIn_174_1 = stackOut_173_1;
                    stackIn_174_2 = stackOut_173_2;
                    stackIn_174_3 = stackOut_173_3;
                    stackIn_174_4 = stackOut_173_4;
                    if (!((cca) this).field_y) {
                      stackOut_175_0 = (jo) (Object) stackIn_175_0;
                      stackOut_175_1 = stackIn_175_1;
                      stackOut_175_2 = stackIn_175_2;
                      stackOut_175_3 = stackIn_175_3;
                      stackOut_175_4 = stackIn_175_4;
                      stackOut_175_5 = 0;
                      stackIn_176_0 = stackOut_175_0;
                      stackIn_176_1 = stackOut_175_1;
                      stackIn_176_2 = stackOut_175_2;
                      stackIn_176_3 = stackOut_175_3;
                      stackIn_176_4 = stackOut_175_4;
                      stackIn_176_5 = stackOut_175_5;
                      break L38;
                    } else {
                      stackOut_174_0 = (jo) (Object) stackIn_174_0;
                      stackOut_174_1 = stackIn_174_1;
                      stackOut_174_2 = stackIn_174_2;
                      stackOut_174_3 = stackIn_174_3;
                      stackOut_174_4 = stackIn_174_4;
                      stackOut_174_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                      stackIn_176_0 = stackOut_174_0;
                      stackIn_176_1 = stackOut_174_1;
                      stackIn_176_2 = stackOut_174_2;
                      stackIn_176_3 = stackOut_174_3;
                      stackIn_176_4 = stackOut_174_4;
                      stackIn_176_5 = stackOut_174_5;
                      break L38;
                    }
                  }
                  ((jo) (Object) stackIn_176_0).a((byte) stackIn_176_1, stackIn_176_2, stackIn_176_3, stackIn_176_4, stackIn_176_5);
                  break L37;
                } else {
                  break L37;
                }
              }
              int discarded$25 = -31791;
              this.c();
              return;
            }
          } else {
            var3 = 0;
            if (param0 == 88) {
              L39: {
                if (((cca) this).field_x == null) {
                  stackOut_143_0 = ((cca) this).field_m;
                  stackIn_144_0 = stackOut_143_0;
                  break L39;
                } else {
                  stackOut_142_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                  stackIn_144_0 = stackOut_142_0;
                  break L39;
                }
              }
              L40: {
                var4 = stackIn_144_0;
                if (null != ((cca) this).field_D) {
                  stackOut_146_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                  stackIn_147_0 = stackOut_146_0;
                  break L40;
                } else {
                  stackOut_145_0 = ((cca) this).field_p;
                  stackIn_147_0 = stackOut_145_0;
                  break L40;
                }
              }
              L41: {
                var5 = stackIn_147_0;
                ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == ((cca) this).field_x) {
                  break L41;
                } else {
                  L42: {
                    stackOut_148_0 = ((cca) this).field_x;
                    stackOut_148_1 = -31;
                    stackOut_148_2 = ((cca) this).field_x.field_m;
                    stackOut_148_3 = ((cca) this).field_A.field_p;
                    stackIn_150_0 = stackOut_148_0;
                    stackIn_150_1 = stackOut_148_1;
                    stackIn_150_2 = stackOut_148_2;
                    stackIn_150_3 = stackOut_148_3;
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    stackIn_149_2 = stackOut_148_2;
                    stackIn_149_3 = stackOut_148_3;
                    if (((cca) this).field_B) {
                      stackOut_150_0 = (jo) (Object) stackIn_150_0;
                      stackOut_150_1 = stackIn_150_1;
                      stackOut_150_2 = stackIn_150_2;
                      stackOut_150_3 = stackIn_150_3;
                      stackOut_150_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                      stackIn_151_0 = stackOut_150_0;
                      stackIn_151_1 = stackOut_150_1;
                      stackIn_151_2 = stackOut_150_2;
                      stackIn_151_3 = stackOut_150_3;
                      stackIn_151_4 = stackOut_150_4;
                      break L42;
                    } else {
                      stackOut_149_0 = (jo) (Object) stackIn_149_0;
                      stackOut_149_1 = stackIn_149_1;
                      stackOut_149_2 = stackIn_149_2;
                      stackOut_149_3 = stackIn_149_3;
                      stackOut_149_4 = 0;
                      stackIn_151_0 = stackOut_149_0;
                      stackIn_151_1 = stackOut_149_1;
                      stackIn_151_2 = stackOut_149_2;
                      stackIn_151_3 = stackOut_149_3;
                      stackIn_151_4 = stackOut_149_4;
                      break L42;
                    }
                  }
                  ((jo) (Object) stackIn_151_0).a((byte) stackIn_151_1, stackIn_151_2, stackIn_151_3, stackIn_151_4, ((cca) this).field_A.field_n);
                  break L41;
                }
              }
              L43: {
                if (null != ((cca) this).field_D) {
                  L44: {
                    stackOut_154_0 = ((cca) this).field_D;
                    stackOut_154_1 = -31;
                    stackOut_154_2 = ((cca) this).field_A.field_m;
                    stackOut_154_3 = ((cca) this).field_D.field_p;
                    stackOut_154_4 = ((cca) this).field_A.field_i;
                    stackIn_156_0 = stackOut_154_0;
                    stackIn_156_1 = stackOut_154_1;
                    stackIn_156_2 = stackOut_154_2;
                    stackIn_156_3 = stackOut_154_3;
                    stackIn_156_4 = stackOut_154_4;
                    stackIn_155_0 = stackOut_154_0;
                    stackIn_155_1 = stackOut_154_1;
                    stackIn_155_2 = stackOut_154_2;
                    stackIn_155_3 = stackOut_154_3;
                    stackIn_155_4 = stackOut_154_4;
                    if (!((cca) this).field_y) {
                      stackOut_156_0 = (jo) (Object) stackIn_156_0;
                      stackOut_156_1 = stackIn_156_1;
                      stackOut_156_2 = stackIn_156_2;
                      stackOut_156_3 = stackIn_156_3;
                      stackOut_156_4 = stackIn_156_4;
                      stackOut_156_5 = 0;
                      stackIn_157_0 = stackOut_156_0;
                      stackIn_157_1 = stackOut_156_1;
                      stackIn_157_2 = stackOut_156_2;
                      stackIn_157_3 = stackOut_156_3;
                      stackIn_157_4 = stackOut_156_4;
                      stackIn_157_5 = stackOut_156_5;
                      break L44;
                    } else {
                      stackOut_155_0 = (jo) (Object) stackIn_155_0;
                      stackOut_155_1 = stackIn_155_1;
                      stackOut_155_2 = stackIn_155_2;
                      stackOut_155_3 = stackIn_155_3;
                      stackOut_155_4 = stackIn_155_4;
                      stackOut_155_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                      stackIn_157_0 = stackOut_155_0;
                      stackIn_157_1 = stackOut_155_1;
                      stackIn_157_2 = stackOut_155_2;
                      stackIn_157_3 = stackOut_155_3;
                      stackIn_157_4 = stackOut_155_4;
                      stackIn_157_5 = stackOut_155_5;
                      break L44;
                    }
                  }
                  ((jo) (Object) stackIn_157_0).a((byte) stackIn_157_1, stackIn_157_2, stackIn_157_3, stackIn_157_4, stackIn_157_5);
                  break L43;
                } else {
                  break L43;
                }
              }
              int discarded$26 = -31791;
              this.c();
              return;
            } else {
              L45: {
                boolean discarded$27 = this.a(-26, -25);
                if (((cca) this).field_x == null) {
                  stackOut_125_0 = ((cca) this).field_m;
                  stackIn_126_0 = stackOut_125_0;
                  break L45;
                } else {
                  stackOut_124_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                  stackIn_126_0 = stackOut_124_0;
                  break L45;
                }
              }
              L46: {
                var4 = stackIn_126_0;
                if (null != ((cca) this).field_D) {
                  stackOut_128_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                  stackIn_129_0 = stackOut_128_0;
                  break L46;
                } else {
                  stackOut_127_0 = ((cca) this).field_p;
                  stackIn_129_0 = stackOut_127_0;
                  break L46;
                }
              }
              L47: {
                var5 = stackIn_129_0;
                ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
                if (null == ((cca) this).field_x) {
                  break L47;
                } else {
                  L48: {
                    stackOut_130_0 = ((cca) this).field_x;
                    stackOut_130_1 = -31;
                    stackOut_130_2 = ((cca) this).field_x.field_m;
                    stackOut_130_3 = ((cca) this).field_A.field_p;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    stackIn_132_2 = stackOut_130_2;
                    stackIn_132_3 = stackOut_130_3;
                    stackIn_131_0 = stackOut_130_0;
                    stackIn_131_1 = stackOut_130_1;
                    stackIn_131_2 = stackOut_130_2;
                    stackIn_131_3 = stackOut_130_3;
                    if (((cca) this).field_B) {
                      stackOut_132_0 = (jo) (Object) stackIn_132_0;
                      stackOut_132_1 = stackIn_132_1;
                      stackOut_132_2 = stackIn_132_2;
                      stackOut_132_3 = stackIn_132_3;
                      stackOut_132_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      stackIn_133_2 = stackOut_132_2;
                      stackIn_133_3 = stackOut_132_3;
                      stackIn_133_4 = stackOut_132_4;
                      break L48;
                    } else {
                      stackOut_131_0 = (jo) (Object) stackIn_131_0;
                      stackOut_131_1 = stackIn_131_1;
                      stackOut_131_2 = stackIn_131_2;
                      stackOut_131_3 = stackIn_131_3;
                      stackOut_131_4 = 0;
                      stackIn_133_0 = stackOut_131_0;
                      stackIn_133_1 = stackOut_131_1;
                      stackIn_133_2 = stackOut_131_2;
                      stackIn_133_3 = stackOut_131_3;
                      stackIn_133_4 = stackOut_131_4;
                      break L48;
                    }
                  }
                  ((jo) (Object) stackIn_133_0).a((byte) stackIn_133_1, stackIn_133_2, stackIn_133_3, stackIn_133_4, ((cca) this).field_A.field_n);
                  break L47;
                }
              }
              L49: {
                if (null != ((cca) this).field_D) {
                  L50: {
                    stackOut_136_0 = ((cca) this).field_D;
                    stackOut_136_1 = -31;
                    stackOut_136_2 = ((cca) this).field_A.field_m;
                    stackOut_136_3 = ((cca) this).field_D.field_p;
                    stackOut_136_4 = ((cca) this).field_A.field_i;
                    stackIn_138_0 = stackOut_136_0;
                    stackIn_138_1 = stackOut_136_1;
                    stackIn_138_2 = stackOut_136_2;
                    stackIn_138_3 = stackOut_136_3;
                    stackIn_138_4 = stackOut_136_4;
                    stackIn_137_0 = stackOut_136_0;
                    stackIn_137_1 = stackOut_136_1;
                    stackIn_137_2 = stackOut_136_2;
                    stackIn_137_3 = stackOut_136_3;
                    stackIn_137_4 = stackOut_136_4;
                    if (!((cca) this).field_y) {
                      stackOut_138_0 = (jo) (Object) stackIn_138_0;
                      stackOut_138_1 = stackIn_138_1;
                      stackOut_138_2 = stackIn_138_2;
                      stackOut_138_3 = stackIn_138_3;
                      stackOut_138_4 = stackIn_138_4;
                      stackOut_138_5 = 0;
                      stackIn_139_0 = stackOut_138_0;
                      stackIn_139_1 = stackOut_138_1;
                      stackIn_139_2 = stackOut_138_2;
                      stackIn_139_3 = stackOut_138_3;
                      stackIn_139_4 = stackOut_138_4;
                      stackIn_139_5 = stackOut_138_5;
                      break L50;
                    } else {
                      stackOut_137_0 = (jo) (Object) stackIn_137_0;
                      stackOut_137_1 = stackIn_137_1;
                      stackOut_137_2 = stackIn_137_2;
                      stackOut_137_3 = stackIn_137_3;
                      stackOut_137_4 = stackIn_137_4;
                      stackOut_137_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                      stackIn_139_0 = stackOut_137_0;
                      stackIn_139_1 = stackOut_137_1;
                      stackIn_139_2 = stackOut_137_2;
                      stackIn_139_3 = stackOut_137_3;
                      stackIn_139_4 = stackOut_137_4;
                      stackIn_139_5 = stackOut_137_5;
                      break L50;
                    }
                  }
                  ((jo) (Object) stackIn_139_0).a((byte) stackIn_139_1, stackIn_139_2, stackIn_139_3, stackIn_139_4, stackIn_139_5);
                  break L49;
                } else {
                  break L49;
                }
              }
              int discarded$28 = -31791;
              this.c();
              return;
            }
          }
        } else {
          var3 = 0;
          if (param0 == 88) {
            L51: {
              if (((cca) this).field_x == null) {
                stackOut_105_0 = ((cca) this).field_m;
                stackIn_106_0 = stackOut_105_0;
                break L51;
              } else {
                stackOut_104_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                stackIn_106_0 = stackOut_104_0;
                break L51;
              }
            }
            L52: {
              var4 = stackIn_106_0;
              if (null != ((cca) this).field_D) {
                stackOut_108_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                stackIn_109_0 = stackOut_108_0;
                break L52;
              } else {
                stackOut_107_0 = ((cca) this).field_p;
                stackIn_109_0 = stackOut_107_0;
                break L52;
              }
            }
            L53: {
              var5 = stackIn_109_0;
              ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
              if (null == ((cca) this).field_x) {
                break L53;
              } else {
                L54: {
                  stackOut_110_0 = ((cca) this).field_x;
                  stackOut_110_1 = -31;
                  stackOut_110_2 = ((cca) this).field_x.field_m;
                  stackOut_110_3 = ((cca) this).field_A.field_p;
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_112_1 = stackOut_110_1;
                  stackIn_112_2 = stackOut_110_2;
                  stackIn_112_3 = stackOut_110_3;
                  stackIn_111_0 = stackOut_110_0;
                  stackIn_111_1 = stackOut_110_1;
                  stackIn_111_2 = stackOut_110_2;
                  stackIn_111_3 = stackOut_110_3;
                  if (((cca) this).field_B) {
                    stackOut_112_0 = (jo) (Object) stackIn_112_0;
                    stackOut_112_1 = stackIn_112_1;
                    stackOut_112_2 = stackIn_112_2;
                    stackOut_112_3 = stackIn_112_3;
                    stackOut_112_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    stackIn_113_3 = stackOut_112_3;
                    stackIn_113_4 = stackOut_112_4;
                    break L54;
                  } else {
                    stackOut_111_0 = (jo) (Object) stackIn_111_0;
                    stackOut_111_1 = stackIn_111_1;
                    stackOut_111_2 = stackIn_111_2;
                    stackOut_111_3 = stackIn_111_3;
                    stackOut_111_4 = 0;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_113_2 = stackOut_111_2;
                    stackIn_113_3 = stackOut_111_3;
                    stackIn_113_4 = stackOut_111_4;
                    break L54;
                  }
                }
                ((jo) (Object) stackIn_113_0).a((byte) stackIn_113_1, stackIn_113_2, stackIn_113_3, stackIn_113_4, ((cca) this).field_A.field_n);
                break L53;
              }
            }
            L55: {
              if (null != ((cca) this).field_D) {
                L56: {
                  stackOut_116_0 = ((cca) this).field_D;
                  stackOut_116_1 = -31;
                  stackOut_116_2 = ((cca) this).field_A.field_m;
                  stackOut_116_3 = ((cca) this).field_D.field_p;
                  stackOut_116_4 = ((cca) this).field_A.field_i;
                  stackIn_118_0 = stackOut_116_0;
                  stackIn_118_1 = stackOut_116_1;
                  stackIn_118_2 = stackOut_116_2;
                  stackIn_118_3 = stackOut_116_3;
                  stackIn_118_4 = stackOut_116_4;
                  stackIn_117_0 = stackOut_116_0;
                  stackIn_117_1 = stackOut_116_1;
                  stackIn_117_2 = stackOut_116_2;
                  stackIn_117_3 = stackOut_116_3;
                  stackIn_117_4 = stackOut_116_4;
                  if (!((cca) this).field_y) {
                    stackOut_118_0 = (jo) (Object) stackIn_118_0;
                    stackOut_118_1 = stackIn_118_1;
                    stackOut_118_2 = stackIn_118_2;
                    stackOut_118_3 = stackIn_118_3;
                    stackOut_118_4 = stackIn_118_4;
                    stackOut_118_5 = 0;
                    stackIn_119_0 = stackOut_118_0;
                    stackIn_119_1 = stackOut_118_1;
                    stackIn_119_2 = stackOut_118_2;
                    stackIn_119_3 = stackOut_118_3;
                    stackIn_119_4 = stackOut_118_4;
                    stackIn_119_5 = stackOut_118_5;
                    break L56;
                  } else {
                    stackOut_117_0 = (jo) (Object) stackIn_117_0;
                    stackOut_117_1 = stackIn_117_1;
                    stackOut_117_2 = stackIn_117_2;
                    stackOut_117_3 = stackIn_117_3;
                    stackOut_117_4 = stackIn_117_4;
                    stackOut_117_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_119_1 = stackOut_117_1;
                    stackIn_119_2 = stackOut_117_2;
                    stackIn_119_3 = stackOut_117_3;
                    stackIn_119_4 = stackOut_117_4;
                    stackIn_119_5 = stackOut_117_5;
                    break L56;
                  }
                }
                ((jo) (Object) stackIn_119_0).a((byte) stackIn_119_1, stackIn_119_2, stackIn_119_3, stackIn_119_4, stackIn_119_5);
                break L55;
              } else {
                break L55;
              }
            }
            int discarded$29 = -31791;
            this.c();
            return;
          } else {
            L57: {
              boolean discarded$30 = this.a(-26, -25);
              if (((cca) this).field_x == null) {
                stackOut_87_0 = ((cca) this).field_m;
                stackIn_88_0 = stackOut_87_0;
                break L57;
              } else {
                stackOut_86_0 = ((cca) this).field_m + -((cca) this).field_x.field_m;
                stackIn_88_0 = stackOut_86_0;
                break L57;
              }
            }
            L58: {
              var4 = stackIn_88_0;
              if (null != ((cca) this).field_D) {
                stackOut_90_0 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                stackIn_91_0 = stackOut_90_0;
                break L58;
              } else {
                stackOut_89_0 = ((cca) this).field_p;
                stackIn_91_0 = stackOut_89_0;
                break L58;
              }
            }
            L59: {
              var5 = stackIn_91_0;
              ((cca) this).field_A.a((byte) -31, var4, var5, var2, var3);
              if (null == ((cca) this).field_x) {
                break L59;
              } else {
                L60: {
                  stackOut_92_0 = ((cca) this).field_x;
                  stackOut_92_1 = -31;
                  stackOut_92_2 = ((cca) this).field_x.field_m;
                  stackOut_92_3 = ((cca) this).field_A.field_p;
                  stackIn_94_0 = stackOut_92_0;
                  stackIn_94_1 = stackOut_92_1;
                  stackIn_94_2 = stackOut_92_2;
                  stackIn_94_3 = stackOut_92_3;
                  stackIn_93_0 = stackOut_92_0;
                  stackIn_93_1 = stackOut_92_1;
                  stackIn_93_2 = stackOut_92_2;
                  stackIn_93_3 = stackOut_92_3;
                  if (((cca) this).field_B) {
                    stackOut_94_0 = (jo) (Object) stackIn_94_0;
                    stackOut_94_1 = stackIn_94_1;
                    stackOut_94_2 = stackIn_94_2;
                    stackOut_94_3 = stackIn_94_3;
                    stackOut_94_4 = -((cca) this).field_x.field_m + ((cca) this).field_m;
                    stackIn_95_0 = stackOut_94_0;
                    stackIn_95_1 = stackOut_94_1;
                    stackIn_95_2 = stackOut_94_2;
                    stackIn_95_3 = stackOut_94_3;
                    stackIn_95_4 = stackOut_94_4;
                    break L60;
                  } else {
                    stackOut_93_0 = (jo) (Object) stackIn_93_0;
                    stackOut_93_1 = stackIn_93_1;
                    stackOut_93_2 = stackIn_93_2;
                    stackOut_93_3 = stackIn_93_3;
                    stackOut_93_4 = 0;
                    stackIn_95_0 = stackOut_93_0;
                    stackIn_95_1 = stackOut_93_1;
                    stackIn_95_2 = stackOut_93_2;
                    stackIn_95_3 = stackOut_93_3;
                    stackIn_95_4 = stackOut_93_4;
                    break L60;
                  }
                }
                ((jo) (Object) stackIn_95_0).a((byte) stackIn_95_1, stackIn_95_2, stackIn_95_3, stackIn_95_4, ((cca) this).field_A.field_n);
                break L59;
              }
            }
            L61: {
              if (null != ((cca) this).field_D) {
                L62: {
                  stackOut_98_0 = ((cca) this).field_D;
                  stackOut_98_1 = -31;
                  stackOut_98_2 = ((cca) this).field_A.field_m;
                  stackOut_98_3 = ((cca) this).field_D.field_p;
                  stackOut_98_4 = ((cca) this).field_A.field_i;
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_100_1 = stackOut_98_1;
                  stackIn_100_2 = stackOut_98_2;
                  stackIn_100_3 = stackOut_98_3;
                  stackIn_100_4 = stackOut_98_4;
                  stackIn_99_0 = stackOut_98_0;
                  stackIn_99_1 = stackOut_98_1;
                  stackIn_99_2 = stackOut_98_2;
                  stackIn_99_3 = stackOut_98_3;
                  stackIn_99_4 = stackOut_98_4;
                  if (!((cca) this).field_y) {
                    stackOut_100_0 = (jo) (Object) stackIn_100_0;
                    stackOut_100_1 = stackIn_100_1;
                    stackOut_100_2 = stackIn_100_2;
                    stackOut_100_3 = stackIn_100_3;
                    stackOut_100_4 = stackIn_100_4;
                    stackOut_100_5 = 0;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    stackIn_101_2 = stackOut_100_2;
                    stackIn_101_3 = stackOut_100_3;
                    stackIn_101_4 = stackOut_100_4;
                    stackIn_101_5 = stackOut_100_5;
                    break L62;
                  } else {
                    stackOut_99_0 = (jo) (Object) stackIn_99_0;
                    stackOut_99_1 = stackIn_99_1;
                    stackOut_99_2 = stackIn_99_2;
                    stackOut_99_3 = stackIn_99_3;
                    stackOut_99_4 = stackIn_99_4;
                    stackOut_99_5 = -((cca) this).field_D.field_p + ((cca) this).field_p;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    stackIn_101_2 = stackOut_99_2;
                    stackIn_101_3 = stackOut_99_3;
                    stackIn_101_4 = stackOut_99_4;
                    stackIn_101_5 = stackOut_99_5;
                    break L62;
                  }
                }
                ((jo) (Object) stackIn_101_0).a((byte) stackIn_101_1, stackIn_101_2, stackIn_101_3, stackIn_101_4, stackIn_101_5);
                break L61;
              } else {
                break L61;
              }
            }
            int discarded$31 = -31791;
            this.c();
            return;
          }
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              this.g((byte) -123);
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("cca.P(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_4_0 != 0;
    }

    private final void c() {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (((cca) this).field_x == null) {
            if (((cca) this).field_D == null) {
            } else {
                if (((cca) this).field_A.field_x.field_m > ((cca) this).field_A.field_m) {
                    ((cca) this).field_D.a((byte) -101, ((cca) this).field_A.field_m, ((cca) this).field_A.field_x.field_m);
                } else {
                    ((cca) this).field_D.a((byte) -84, 1, 1);
                }
            }
            return;
        }
        if (((cca) this).field_A.field_p < ((cca) this).field_A.field_x.field_p) {
            ((cca) this).field_x.c(((cca) this).field_A.field_x.field_p, ((cca) this).field_A.field_p, -1789710879);
            if (((cca) this).field_D == null) {
                return;
            }
            if (((cca) this).field_A.field_x.field_m > ((cca) this).field_A.field_m) {
                ((cca) this).field_D.a((byte) -101, ((cca) this).field_A.field_m, ((cca) this).field_A.field_x.field_m);
                return;
            }
            ((cca) this).field_D.a((byte) -84, 1, 1);
            return;
        }
        ((cca) this).field_x.c(1, 1, -1789710879);
        if (((cca) this).field_D == null) {
            return;
        }
        if (((cca) this).field_A.field_x.field_m > ((cca) this).field_A.field_m) {
            ((cca) this).field_D.a((byte) -101, ((cca) this).field_A.field_m, ((cca) this).field_A.field_x.field_m);
            return;
        }
        ((cca) this).field_D.a((byte) -84, 1, 1);
    }

    final void a(int param0, jo param1, boolean param2) {
        try {
            ((cca) this).field_x = param1;
            ((cca) this).field_w[param0] = (ae) (Object) param1;
            ((cca) this).field_B = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cca.H(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            int discarded$0 = -31791;
            this.c();
            this.g((byte) -125);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cca.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 < pka.field_b) {
          gt.a(param1, param5, param3, param2, 10, param0);
          return;
        } else {
          if (ss.field_c < param1) {
            gt.a(param1, param5, param3, param2, 10, param0);
            return;
          } else {
            if (param3 < gca.field_d) {
              gt.a(param1, param5, param3, param2, 10, param0);
              return;
            } else {
              if (hc.field_h < param0) {
                gt.a(param1, param5, param3, param2, 10, param0);
                return;
              } else {
                int discarded$2 = 0;
                caa.a(param2, param1, param5, param3, param0);
                return;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, ae param4, int param5, int param6) {
        RuntimeException var8 = null;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                L2: {
                  if (!((cca) this).b((byte) -34)) {
                    break L2;
                  } else {
                    if (!this.a(param0, ~param6)) {
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L1;
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var8 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var8;
            stackOut_9_1 = new StringBuilder().append("cca.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_8_0 != 0;
    }

    cca(int param0, int param1, int param2, int param3, isa param4, ae param5, isa param6) {
        super(param0, param1, param2, param3, param4);
        try {
            ((cca) this).field_w = new ae[3];
            vua dupTemp$0 = new vua(param0, param1, param2, param3, param6, param5);
            ((cca) this).field_A = dupTemp$0;
            ((cca) this).field_w[2] = (ae) (Object) dupTemp$0;
            ((cca) this).a((byte) 88);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "cca.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    private final boolean a(int param0, int param1) {
        if (param1 != 0) {
            return false;
        }
        if (null == ((cca) this).field_x) {
            return false;
        }
        ((cca) this).field_x.c(16, ((cca) this).field_x.field_M * param0 + ((cca) this).field_x.field_O);
        return true;
    }

    static {
    }
}
