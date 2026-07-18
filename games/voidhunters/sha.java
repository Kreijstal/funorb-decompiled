/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sha extends oda {
    private vcb field_v;
    private boolean field_A;
    static String field_x;
    private boolean field_z;
    vcb field_B;
    bk field_y;
    static int field_w;

    final void a(boolean param0, vcb param1, byte param2) {
        try {
            ((sha) this).field_B = param1;
            ((sha) this).field_u[1] = (shb) (Object) param1;
            if (param2 > -91) {
                this.e(17);
            }
            ((sha) this).field_A = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sha.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_x = null;
    }

    sha(int param0, int param1, int param2, int param3, wwa param4, shb param5, wwa param6) {
        super(param0, param1, param2, param3, param4);
        try {
            ((sha) this).field_u = new shb[3];
            bk dupTemp$0 = new bk(param0, param1, param2, param3, param6, param5);
            ((sha) this).field_y = dupTemp$0;
            ((sha) this).field_u[2] = (shb) (Object) dupTemp$0;
            ((sha) this).d(16777215);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sha.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = VoidHunters.field_G;
        var2 = -85 % ((param0 - -47) / 56);
        if (((sha) this).field_B != null) {
          if (((sha) this).field_y.field_f >= ((sha) this).field_y.field_t.field_f) {
            ((sha) this).field_B.c(1, 1, 127);
            if (null != ((sha) this).field_v) {
              if (((sha) this).field_y.field_h >= ((sha) this).field_y.field_t.field_h) {
                ((sha) this).field_v.b(1, 21944, 1);
                return;
              } else {
                ((sha) this).field_v.b(((sha) this).field_y.field_h, 21944, ((sha) this).field_y.field_t.field_h);
                return;
              }
            } else {
              return;
            }
          } else {
            ((sha) this).field_B.c(((sha) this).field_y.field_f, ((sha) this).field_y.field_t.field_f, 127);
            if (null != ((sha) this).field_v) {
              if (((sha) this).field_y.field_h >= ((sha) this).field_y.field_t.field_h) {
                ((sha) this).field_v.b(1, 21944, 1);
                return;
              } else {
                ((sha) this).field_v.b(((sha) this).field_y.field_h, 21944, ((sha) this).field_y.field_t.field_h);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (null != ((sha) this).field_v) {
            if (((sha) this).field_y.field_h >= ((sha) this).field_y.field_t.field_h) {
              ((sha) this).field_v.b(1, 21944, 1);
              return;
            } else {
              ((sha) this).field_v.b(((sha) this).field_y.field_h, 21944, ((sha) this).field_y.field_t.field_h);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, eab param7, int param8) {
        wlb.field_o = param0;
        gia.field_k = param7;
        hob.field_l = param1;
        nia.field_p = param5;
        qfa.field_Ib = param8;
        ea.field_d = param6;
        if (param4 != -2) {
            return;
        }
        try {
            esa.field_p = param2;
            vwa.field_p = param3;
            ff.field_o = (ona) (Object) new wh();
            nj.field_a = new pfa(param7);
            ho.field_a = new fwa(ff.field_o, nj.field_a);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        vcb stackIn_14_0 = null;
        vcb stackIn_15_0 = null;
        vcb stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        vcb stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        int stackIn_20_4 = 0;
        vcb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        int stackIn_21_4 = 0;
        vcb stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        int stackIn_22_5 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        vcb stackIn_36_0 = null;
        vcb stackIn_37_0 = null;
        vcb stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        vcb stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int stackIn_42_3 = 0;
        int stackIn_42_4 = 0;
        vcb stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        int stackIn_43_4 = 0;
        vcb stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_44_4 = 0;
        int stackIn_44_5 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        vcb stackIn_56_0 = null;
        vcb stackIn_57_0 = null;
        vcb stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        vcb stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        int stackIn_62_4 = 0;
        vcb stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        int stackIn_63_4 = 0;
        vcb stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        int stackIn_64_4 = 0;
        int stackIn_64_5 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        vcb stackIn_75_0 = null;
        vcb stackIn_76_0 = null;
        vcb stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        vcb stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        vcb stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int stackIn_82_4 = 0;
        vcb stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int stackIn_83_4 = 0;
        int stackIn_83_5 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_96_0 = 0;
        vcb stackIn_99_0 = null;
        vcb stackIn_100_0 = null;
        vcb stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        vcb stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        vcb stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        vcb stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        int stackIn_107_4 = 0;
        int stackIn_107_5 = 0;
        int stackIn_112_0 = 0;
        int stackIn_115_0 = 0;
        vcb stackIn_118_0 = null;
        vcb stackIn_119_0 = null;
        vcb stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        vcb stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        int stackIn_124_4 = 0;
        vcb stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        int stackIn_125_4 = 0;
        vcb stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        int stackIn_126_5 = 0;
        int stackIn_134_0 = 0;
        int stackIn_137_0 = 0;
        vcb stackIn_140_0 = null;
        vcb stackIn_141_0 = null;
        vcb stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        vcb stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_146_2 = 0;
        int stackIn_146_3 = 0;
        int stackIn_146_4 = 0;
        vcb stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_147_4 = 0;
        vcb stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        int stackIn_148_4 = 0;
        int stackIn_148_5 = 0;
        int stackIn_153_0 = 0;
        int stackIn_156_0 = 0;
        vcb stackIn_159_0 = null;
        vcb stackIn_160_0 = null;
        vcb stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        vcb stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_165_2 = 0;
        int stackIn_165_3 = 0;
        int stackIn_165_4 = 0;
        vcb stackIn_166_0 = null;
        int stackIn_166_1 = 0;
        int stackIn_166_2 = 0;
        int stackIn_166_3 = 0;
        int stackIn_166_4 = 0;
        vcb stackIn_167_0 = null;
        int stackIn_167_1 = 0;
        int stackIn_167_2 = 0;
        int stackIn_167_3 = 0;
        int stackIn_167_4 = 0;
        int stackIn_167_5 = 0;
        int stackIn_174_0 = 0;
        int stackIn_177_0 = 0;
        vcb stackIn_180_0 = null;
        vcb stackIn_181_0 = null;
        vcb stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        vcb stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        int stackIn_186_2 = 0;
        int stackIn_186_3 = 0;
        int stackIn_186_4 = 0;
        vcb stackIn_187_0 = null;
        int stackIn_187_1 = 0;
        int stackIn_187_2 = 0;
        int stackIn_187_3 = 0;
        int stackIn_187_4 = 0;
        vcb stackIn_188_0 = null;
        int stackIn_188_1 = 0;
        int stackIn_188_2 = 0;
        int stackIn_188_3 = 0;
        int stackIn_188_4 = 0;
        int stackIn_188_5 = 0;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        vcb stackIn_199_0 = null;
        vcb stackIn_200_0 = null;
        vcb stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        vcb stackIn_205_0 = null;
        int stackIn_205_1 = 0;
        int stackIn_205_2 = 0;
        int stackIn_205_3 = 0;
        int stackIn_205_4 = 0;
        vcb stackIn_206_0 = null;
        int stackIn_206_1 = 0;
        int stackIn_206_2 = 0;
        int stackIn_206_3 = 0;
        int stackIn_206_4 = 0;
        vcb stackIn_207_0 = null;
        int stackIn_207_1 = 0;
        int stackIn_207_2 = 0;
        int stackIn_207_3 = 0;
        int stackIn_207_4 = 0;
        int stackIn_207_5 = 0;
        int stackOut_86_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        vcb stackOut_74_0 = null;
        vcb stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        vcb stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        vcb stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        vcb stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int stackOut_82_4 = 0;
        int stackOut_82_5 = 0;
        vcb stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int stackOut_81_4 = 0;
        int stackOut_81_5 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        vcb stackOut_55_0 = null;
        vcb stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        vcb stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        vcb stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        int stackOut_61_4 = 0;
        vcb stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        int stackOut_63_5 = 0;
        vcb stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        int stackOut_62_4 = 0;
        int stackOut_62_5 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        vcb stackOut_35_0 = null;
        vcb stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        vcb stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        vcb stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        int stackOut_41_4 = 0;
        vcb stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_43_5 = 0;
        vcb stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_42_4 = 0;
        int stackOut_42_5 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        vcb stackOut_13_0 = null;
        vcb stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        vcb stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        vcb stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        int stackOut_19_4 = 0;
        vcb stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        int stackOut_21_5 = 0;
        vcb stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        int stackOut_20_5 = 0;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        vcb stackOut_198_0 = null;
        vcb stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        vcb stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        vcb stackOut_204_0 = null;
        int stackOut_204_1 = 0;
        int stackOut_204_2 = 0;
        int stackOut_204_3 = 0;
        int stackOut_204_4 = 0;
        vcb stackOut_206_0 = null;
        int stackOut_206_1 = 0;
        int stackOut_206_2 = 0;
        int stackOut_206_3 = 0;
        int stackOut_206_4 = 0;
        int stackOut_206_5 = 0;
        vcb stackOut_205_0 = null;
        int stackOut_205_1 = 0;
        int stackOut_205_2 = 0;
        int stackOut_205_3 = 0;
        int stackOut_205_4 = 0;
        int stackOut_205_5 = 0;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        vcb stackOut_179_0 = null;
        vcb stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        vcb stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        vcb stackOut_185_0 = null;
        int stackOut_185_1 = 0;
        int stackOut_185_2 = 0;
        int stackOut_185_3 = 0;
        int stackOut_185_4 = 0;
        vcb stackOut_187_0 = null;
        int stackOut_187_1 = 0;
        int stackOut_187_2 = 0;
        int stackOut_187_3 = 0;
        int stackOut_187_4 = 0;
        int stackOut_187_5 = 0;
        vcb stackOut_186_0 = null;
        int stackOut_186_1 = 0;
        int stackOut_186_2 = 0;
        int stackOut_186_3 = 0;
        int stackOut_186_4 = 0;
        int stackOut_186_5 = 0;
        int stackOut_152_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        vcb stackOut_158_0 = null;
        vcb stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        vcb stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        vcb stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_164_2 = 0;
        int stackOut_164_3 = 0;
        int stackOut_164_4 = 0;
        vcb stackOut_166_0 = null;
        int stackOut_166_1 = 0;
        int stackOut_166_2 = 0;
        int stackOut_166_3 = 0;
        int stackOut_166_4 = 0;
        int stackOut_166_5 = 0;
        vcb stackOut_165_0 = null;
        int stackOut_165_1 = 0;
        int stackOut_165_2 = 0;
        int stackOut_165_3 = 0;
        int stackOut_165_4 = 0;
        int stackOut_165_5 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        vcb stackOut_139_0 = null;
        vcb stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        vcb stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        vcb stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        int stackOut_145_4 = 0;
        vcb stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        int stackOut_147_3 = 0;
        int stackOut_147_4 = 0;
        int stackOut_147_5 = 0;
        vcb stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        int stackOut_146_4 = 0;
        int stackOut_146_5 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        vcb stackOut_117_0 = null;
        vcb stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        vcb stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        vcb stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int stackOut_123_4 = 0;
        vcb stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_125_4 = 0;
        int stackOut_125_5 = 0;
        vcb stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        int stackOut_124_4 = 0;
        int stackOut_124_5 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        vcb stackOut_98_0 = null;
        vcb stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        vcb stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        vcb stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        vcb stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        int stackOut_106_4 = 0;
        int stackOut_106_5 = 0;
        vcb stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        int stackOut_105_5 = 0;
        L0: {
          if (((sha) this).field_A) {
            stackOut_86_0 = 0;
            stackIn_88_0 = stackOut_86_0;
            break L0;
          } else {
            if (null != ((sha) this).field_B) {
              stackOut_87_0 = ((sha) this).field_B.field_h;
              stackIn_88_0 = stackOut_87_0;
              break L0;
            } else {
              var2 = 0;
              if (!((sha) this).field_z) {
                if (((sha) this).field_v != null) {
                  var3 = ((sha) this).field_v.field_f;
                  if (param0 != 16777215) {
                    L1: {
                      ((sha) this).field_y = null;
                      if (null == ((sha) this).field_B) {
                        stackOut_68_0 = ((sha) this).field_h;
                        stackIn_69_0 = stackOut_68_0;
                        break L1;
                      } else {
                        stackOut_67_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                        stackIn_69_0 = stackOut_67_0;
                        break L1;
                      }
                    }
                    L2: {
                      var4 = stackIn_69_0;
                      if (null != ((sha) this).field_v) {
                        stackOut_71_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                        stackIn_72_0 = stackOut_71_0;
                        break L2;
                      } else {
                        stackOut_70_0 = ((sha) this).field_f;
                        stackIn_72_0 = stackOut_70_0;
                        break L2;
                      }
                    }
                    L3: {
                      var5 = stackIn_72_0;
                      ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                      if (null != ((sha) this).field_B) {
                        L4: {
                          stackOut_74_0 = ((sha) this).field_B;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_75_0 = stackOut_74_0;
                          if (!((sha) this).field_A) {
                            stackOut_76_0 = (vcb) (Object) stackIn_76_0;
                            stackOut_76_1 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            break L4;
                          } else {
                            stackOut_75_0 = (vcb) (Object) stackIn_75_0;
                            stackOut_75_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            break L4;
                          }
                        }
                        ((vcb) (Object) stackIn_77_0).a(stackIn_77_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L5: {
                      if (null != ((sha) this).field_v) {
                        L6: {
                          stackOut_80_0 = ((sha) this).field_v;
                          stackOut_80_1 = ((sha) this).field_y.field_g;
                          stackOut_80_2 = ((sha) this).field_y.field_h;
                          stackOut_80_3 = ((sha) this).field_v.field_f;
                          stackOut_80_4 = 1;
                          stackIn_82_0 = stackOut_80_0;
                          stackIn_82_1 = stackOut_80_1;
                          stackIn_82_2 = stackOut_80_2;
                          stackIn_82_3 = stackOut_80_3;
                          stackIn_82_4 = stackOut_80_4;
                          stackIn_81_0 = stackOut_80_0;
                          stackIn_81_1 = stackOut_80_1;
                          stackIn_81_2 = stackOut_80_2;
                          stackIn_81_3 = stackOut_80_3;
                          stackIn_81_4 = stackOut_80_4;
                          if (((sha) this).field_z) {
                            stackOut_82_0 = (vcb) (Object) stackIn_82_0;
                            stackOut_82_1 = stackIn_82_1;
                            stackOut_82_2 = stackIn_82_2;
                            stackOut_82_3 = stackIn_82_3;
                            stackOut_82_4 = stackIn_82_4;
                            stackOut_82_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                            stackIn_83_0 = stackOut_82_0;
                            stackIn_83_1 = stackOut_82_1;
                            stackIn_83_2 = stackOut_82_2;
                            stackIn_83_3 = stackOut_82_3;
                            stackIn_83_4 = stackOut_82_4;
                            stackIn_83_5 = stackOut_82_5;
                            break L6;
                          } else {
                            stackOut_81_0 = (vcb) (Object) stackIn_81_0;
                            stackOut_81_1 = stackIn_81_1;
                            stackOut_81_2 = stackIn_81_2;
                            stackOut_81_3 = stackIn_81_3;
                            stackOut_81_4 = stackIn_81_4;
                            stackOut_81_5 = 0;
                            stackIn_83_0 = stackOut_81_0;
                            stackIn_83_1 = stackOut_81_1;
                            stackIn_83_2 = stackOut_81_2;
                            stackIn_83_3 = stackOut_81_3;
                            stackIn_83_4 = stackOut_81_4;
                            stackIn_83_5 = stackOut_81_5;
                            break L6;
                          }
                        }
                        ((vcb) (Object) stackIn_83_0).a(stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4, stackIn_83_5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    this.h((byte) -109);
                    return;
                  } else {
                    L7: {
                      if (null == ((sha) this).field_B) {
                        stackOut_49_0 = ((sha) this).field_h;
                        stackIn_50_0 = stackOut_49_0;
                        break L7;
                      } else {
                        stackOut_48_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                        stackIn_50_0 = stackOut_48_0;
                        break L7;
                      }
                    }
                    L8: {
                      var4 = stackIn_50_0;
                      if (null != ((sha) this).field_v) {
                        stackOut_52_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                        stackIn_53_0 = stackOut_52_0;
                        break L8;
                      } else {
                        stackOut_51_0 = ((sha) this).field_f;
                        stackIn_53_0 = stackOut_51_0;
                        break L8;
                      }
                    }
                    L9: {
                      var5 = stackIn_53_0;
                      ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                      if (null != ((sha) this).field_B) {
                        L10: {
                          stackOut_55_0 = ((sha) this).field_B;
                          stackIn_57_0 = stackOut_55_0;
                          stackIn_56_0 = stackOut_55_0;
                          if (!((sha) this).field_A) {
                            stackOut_57_0 = (vcb) (Object) stackIn_57_0;
                            stackOut_57_1 = 0;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            break L10;
                          } else {
                            stackOut_56_0 = (vcb) (Object) stackIn_56_0;
                            stackOut_56_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                            stackIn_58_0 = stackOut_56_0;
                            stackIn_58_1 = stackOut_56_1;
                            break L10;
                          }
                        }
                        ((vcb) (Object) stackIn_58_0).a(stackIn_58_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: {
                      if (null != ((sha) this).field_v) {
                        L12: {
                          stackOut_61_0 = ((sha) this).field_v;
                          stackOut_61_1 = ((sha) this).field_y.field_g;
                          stackOut_61_2 = ((sha) this).field_y.field_h;
                          stackOut_61_3 = ((sha) this).field_v.field_f;
                          stackOut_61_4 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          stackIn_63_2 = stackOut_61_2;
                          stackIn_63_3 = stackOut_61_3;
                          stackIn_63_4 = stackOut_61_4;
                          stackIn_62_0 = stackOut_61_0;
                          stackIn_62_1 = stackOut_61_1;
                          stackIn_62_2 = stackOut_61_2;
                          stackIn_62_3 = stackOut_61_3;
                          stackIn_62_4 = stackOut_61_4;
                          if (((sha) this).field_z) {
                            stackOut_63_0 = (vcb) (Object) stackIn_63_0;
                            stackOut_63_1 = stackIn_63_1;
                            stackOut_63_2 = stackIn_63_2;
                            stackOut_63_3 = stackIn_63_3;
                            stackOut_63_4 = stackIn_63_4;
                            stackOut_63_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                            stackIn_64_0 = stackOut_63_0;
                            stackIn_64_1 = stackOut_63_1;
                            stackIn_64_2 = stackOut_63_2;
                            stackIn_64_3 = stackOut_63_3;
                            stackIn_64_4 = stackOut_63_4;
                            stackIn_64_5 = stackOut_63_5;
                            break L12;
                          } else {
                            stackOut_62_0 = (vcb) (Object) stackIn_62_0;
                            stackOut_62_1 = stackIn_62_1;
                            stackOut_62_2 = stackIn_62_2;
                            stackOut_62_3 = stackIn_62_3;
                            stackOut_62_4 = stackIn_62_4;
                            stackOut_62_5 = 0;
                            stackIn_64_0 = stackOut_62_0;
                            stackIn_64_1 = stackOut_62_1;
                            stackIn_64_2 = stackOut_62_2;
                            stackIn_64_3 = stackOut_62_3;
                            stackIn_64_4 = stackOut_62_4;
                            stackIn_64_5 = stackOut_62_5;
                            break L12;
                          }
                        }
                        ((vcb) (Object) stackIn_64_0).a(stackIn_64_1, stackIn_64_2, stackIn_64_3, stackIn_64_4, stackIn_64_5);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    this.h((byte) -109);
                    return;
                  }
                } else {
                  L13: {
                    var3 = 0;
                    if (param0 == 16777215) {
                      break L13;
                    } else {
                      ((sha) this).field_y = null;
                      break L13;
                    }
                  }
                  L14: {
                    if (null == ((sha) this).field_B) {
                      stackOut_29_0 = ((sha) this).field_h;
                      stackIn_30_0 = stackOut_29_0;
                      break L14;
                    } else {
                      stackOut_28_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                      stackIn_30_0 = stackOut_28_0;
                      break L14;
                    }
                  }
                  L15: {
                    var4 = stackIn_30_0;
                    if (null != ((sha) this).field_v) {
                      stackOut_32_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                      stackIn_33_0 = stackOut_32_0;
                      break L15;
                    } else {
                      stackOut_31_0 = ((sha) this).field_f;
                      stackIn_33_0 = stackOut_31_0;
                      break L15;
                    }
                  }
                  L16: {
                    var5 = stackIn_33_0;
                    ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                    if (null != ((sha) this).field_B) {
                      L17: {
                        stackOut_35_0 = ((sha) this).field_B;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (!((sha) this).field_A) {
                          stackOut_37_0 = (vcb) (Object) stackIn_37_0;
                          stackOut_37_1 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          stackIn_38_1 = stackOut_37_1;
                          break L17;
                        } else {
                          stackOut_36_0 = (vcb) (Object) stackIn_36_0;
                          stackOut_36_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          break L17;
                        }
                      }
                      ((vcb) (Object) stackIn_38_0).a(stackIn_38_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L18: {
                    if (null != ((sha) this).field_v) {
                      L19: {
                        stackOut_41_0 = ((sha) this).field_v;
                        stackOut_41_1 = ((sha) this).field_y.field_g;
                        stackOut_41_2 = ((sha) this).field_y.field_h;
                        stackOut_41_3 = ((sha) this).field_v.field_f;
                        stackOut_41_4 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        stackIn_43_2 = stackOut_41_2;
                        stackIn_43_3 = stackOut_41_3;
                        stackIn_43_4 = stackOut_41_4;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        stackIn_42_2 = stackOut_41_2;
                        stackIn_42_3 = stackOut_41_3;
                        stackIn_42_4 = stackOut_41_4;
                        if (((sha) this).field_z) {
                          stackOut_43_0 = (vcb) (Object) stackIn_43_0;
                          stackOut_43_1 = stackIn_43_1;
                          stackOut_43_2 = stackIn_43_2;
                          stackOut_43_3 = stackIn_43_3;
                          stackOut_43_4 = stackIn_43_4;
                          stackOut_43_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          stackIn_44_3 = stackOut_43_3;
                          stackIn_44_4 = stackOut_43_4;
                          stackIn_44_5 = stackOut_43_5;
                          break L19;
                        } else {
                          stackOut_42_0 = (vcb) (Object) stackIn_42_0;
                          stackOut_42_1 = stackIn_42_1;
                          stackOut_42_2 = stackIn_42_2;
                          stackOut_42_3 = stackIn_42_3;
                          stackOut_42_4 = stackIn_42_4;
                          stackOut_42_5 = 0;
                          stackIn_44_0 = stackOut_42_0;
                          stackIn_44_1 = stackOut_42_1;
                          stackIn_44_2 = stackOut_42_2;
                          stackIn_44_3 = stackOut_42_3;
                          stackIn_44_4 = stackOut_42_4;
                          stackIn_44_5 = stackOut_42_5;
                          break L19;
                        }
                      }
                      ((vcb) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_44_2, stackIn_44_3, stackIn_44_4, stackIn_44_5);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  this.h((byte) -109);
                  return;
                }
              } else {
                L20: {
                  var3 = 0;
                  if (param0 == 16777215) {
                    break L20;
                  } else {
                    ((sha) this).field_y = null;
                    break L20;
                  }
                }
                L21: {
                  if (null == ((sha) this).field_B) {
                    stackOut_7_0 = ((sha) this).field_h;
                    stackIn_8_0 = stackOut_7_0;
                    break L21;
                  } else {
                    stackOut_6_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                    stackIn_8_0 = stackOut_6_0;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_8_0;
                  if (null != ((sha) this).field_v) {
                    stackOut_10_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                    stackIn_11_0 = stackOut_10_0;
                    break L22;
                  } else {
                    stackOut_9_0 = ((sha) this).field_f;
                    stackIn_11_0 = stackOut_9_0;
                    break L22;
                  }
                }
                L23: {
                  var5 = stackIn_11_0;
                  ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                  if (null != ((sha) this).field_B) {
                    L24: {
                      stackOut_13_0 = ((sha) this).field_B;
                      stackIn_15_0 = stackOut_13_0;
                      stackIn_14_0 = stackOut_13_0;
                      if (!((sha) this).field_A) {
                        stackOut_15_0 = (vcb) (Object) stackIn_15_0;
                        stackOut_15_1 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        stackIn_16_1 = stackOut_15_1;
                        break L24;
                      } else {
                        stackOut_14_0 = (vcb) (Object) stackIn_14_0;
                        stackOut_14_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        break L24;
                      }
                    }
                    ((vcb) (Object) stackIn_16_0).a(stackIn_16_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L25: {
                  if (null != ((sha) this).field_v) {
                    L26: {
                      stackOut_19_0 = ((sha) this).field_v;
                      stackOut_19_1 = ((sha) this).field_y.field_g;
                      stackOut_19_2 = ((sha) this).field_y.field_h;
                      stackOut_19_3 = ((sha) this).field_v.field_f;
                      stackOut_19_4 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_21_4 = stackOut_19_4;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      stackIn_20_4 = stackOut_19_4;
                      if (((sha) this).field_z) {
                        stackOut_21_0 = (vcb) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = stackIn_21_4;
                        stackOut_21_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        stackIn_22_3 = stackOut_21_3;
                        stackIn_22_4 = stackOut_21_4;
                        stackIn_22_5 = stackOut_21_5;
                        break L26;
                      } else {
                        stackOut_20_0 = (vcb) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = stackIn_20_4;
                        stackOut_20_5 = 0;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        stackIn_22_3 = stackOut_20_3;
                        stackIn_22_4 = stackOut_20_4;
                        stackIn_22_5 = stackOut_20_5;
                        break L26;
                      }
                    }
                    ((vcb) (Object) stackIn_22_0).a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4, stackIn_22_5);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                this.h((byte) -109);
                return;
              }
            }
          }
        }
        var2 = stackIn_88_0;
        if (!((sha) this).field_z) {
          if (((sha) this).field_v != null) {
            var3 = ((sha) this).field_v.field_f;
            if (param0 != 16777215) {
              L27: {
                ((sha) this).field_y = null;
                if (null == ((sha) this).field_B) {
                  stackOut_192_0 = ((sha) this).field_h;
                  stackIn_193_0 = stackOut_192_0;
                  break L27;
                } else {
                  stackOut_191_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                  stackIn_193_0 = stackOut_191_0;
                  break L27;
                }
              }
              L28: {
                var4 = stackIn_193_0;
                if (null != ((sha) this).field_v) {
                  stackOut_195_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                  stackIn_196_0 = stackOut_195_0;
                  break L28;
                } else {
                  stackOut_194_0 = ((sha) this).field_f;
                  stackIn_196_0 = stackOut_194_0;
                  break L28;
                }
              }
              L29: {
                var5 = stackIn_196_0;
                ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != ((sha) this).field_B) {
                  L30: {
                    stackOut_198_0 = ((sha) this).field_B;
                    stackIn_200_0 = stackOut_198_0;
                    stackIn_199_0 = stackOut_198_0;
                    if (!((sha) this).field_A) {
                      stackOut_200_0 = (vcb) (Object) stackIn_200_0;
                      stackOut_200_1 = 0;
                      stackIn_201_0 = stackOut_200_0;
                      stackIn_201_1 = stackOut_200_1;
                      break L30;
                    } else {
                      stackOut_199_0 = (vcb) (Object) stackIn_199_0;
                      stackOut_199_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                      stackIn_201_0 = stackOut_199_0;
                      stackIn_201_1 = stackOut_199_1;
                      break L30;
                    }
                  }
                  ((vcb) (Object) stackIn_201_0).a(stackIn_201_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                  break L29;
                } else {
                  break L29;
                }
              }
              L31: {
                if (null != ((sha) this).field_v) {
                  L32: {
                    stackOut_204_0 = ((sha) this).field_v;
                    stackOut_204_1 = ((sha) this).field_y.field_g;
                    stackOut_204_2 = ((sha) this).field_y.field_h;
                    stackOut_204_3 = ((sha) this).field_v.field_f;
                    stackOut_204_4 = 1;
                    stackIn_206_0 = stackOut_204_0;
                    stackIn_206_1 = stackOut_204_1;
                    stackIn_206_2 = stackOut_204_2;
                    stackIn_206_3 = stackOut_204_3;
                    stackIn_206_4 = stackOut_204_4;
                    stackIn_205_0 = stackOut_204_0;
                    stackIn_205_1 = stackOut_204_1;
                    stackIn_205_2 = stackOut_204_2;
                    stackIn_205_3 = stackOut_204_3;
                    stackIn_205_4 = stackOut_204_4;
                    if (((sha) this).field_z) {
                      stackOut_206_0 = (vcb) (Object) stackIn_206_0;
                      stackOut_206_1 = stackIn_206_1;
                      stackOut_206_2 = stackIn_206_2;
                      stackOut_206_3 = stackIn_206_3;
                      stackOut_206_4 = stackIn_206_4;
                      stackOut_206_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                      stackIn_207_0 = stackOut_206_0;
                      stackIn_207_1 = stackOut_206_1;
                      stackIn_207_2 = stackOut_206_2;
                      stackIn_207_3 = stackOut_206_3;
                      stackIn_207_4 = stackOut_206_4;
                      stackIn_207_5 = stackOut_206_5;
                      break L32;
                    } else {
                      stackOut_205_0 = (vcb) (Object) stackIn_205_0;
                      stackOut_205_1 = stackIn_205_1;
                      stackOut_205_2 = stackIn_205_2;
                      stackOut_205_3 = stackIn_205_3;
                      stackOut_205_4 = stackIn_205_4;
                      stackOut_205_5 = 0;
                      stackIn_207_0 = stackOut_205_0;
                      stackIn_207_1 = stackOut_205_1;
                      stackIn_207_2 = stackOut_205_2;
                      stackIn_207_3 = stackOut_205_3;
                      stackIn_207_4 = stackOut_205_4;
                      stackIn_207_5 = stackOut_205_5;
                      break L32;
                    }
                  }
                  ((vcb) (Object) stackIn_207_0).a(stackIn_207_1, stackIn_207_2, stackIn_207_3, stackIn_207_4, stackIn_207_5);
                  break L31;
                } else {
                  break L31;
                }
              }
              this.h((byte) -109);
              return;
            } else {
              L33: {
                if (null == ((sha) this).field_B) {
                  stackOut_173_0 = ((sha) this).field_h;
                  stackIn_174_0 = stackOut_173_0;
                  break L33;
                } else {
                  stackOut_172_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                  stackIn_174_0 = stackOut_172_0;
                  break L33;
                }
              }
              L34: {
                var4 = stackIn_174_0;
                if (null != ((sha) this).field_v) {
                  stackOut_176_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                  stackIn_177_0 = stackOut_176_0;
                  break L34;
                } else {
                  stackOut_175_0 = ((sha) this).field_f;
                  stackIn_177_0 = stackOut_175_0;
                  break L34;
                }
              }
              L35: {
                var5 = stackIn_177_0;
                ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != ((sha) this).field_B) {
                  L36: {
                    stackOut_179_0 = ((sha) this).field_B;
                    stackIn_181_0 = stackOut_179_0;
                    stackIn_180_0 = stackOut_179_0;
                    if (!((sha) this).field_A) {
                      stackOut_181_0 = (vcb) (Object) stackIn_181_0;
                      stackOut_181_1 = 0;
                      stackIn_182_0 = stackOut_181_0;
                      stackIn_182_1 = stackOut_181_1;
                      break L36;
                    } else {
                      stackOut_180_0 = (vcb) (Object) stackIn_180_0;
                      stackOut_180_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                      stackIn_182_0 = stackOut_180_0;
                      stackIn_182_1 = stackOut_180_1;
                      break L36;
                    }
                  }
                  ((vcb) (Object) stackIn_182_0).a(stackIn_182_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                  break L35;
                } else {
                  break L35;
                }
              }
              L37: {
                if (null != ((sha) this).field_v) {
                  L38: {
                    stackOut_185_0 = ((sha) this).field_v;
                    stackOut_185_1 = ((sha) this).field_y.field_g;
                    stackOut_185_2 = ((sha) this).field_y.field_h;
                    stackOut_185_3 = ((sha) this).field_v.field_f;
                    stackOut_185_4 = 1;
                    stackIn_187_0 = stackOut_185_0;
                    stackIn_187_1 = stackOut_185_1;
                    stackIn_187_2 = stackOut_185_2;
                    stackIn_187_3 = stackOut_185_3;
                    stackIn_187_4 = stackOut_185_4;
                    stackIn_186_0 = stackOut_185_0;
                    stackIn_186_1 = stackOut_185_1;
                    stackIn_186_2 = stackOut_185_2;
                    stackIn_186_3 = stackOut_185_3;
                    stackIn_186_4 = stackOut_185_4;
                    if (((sha) this).field_z) {
                      stackOut_187_0 = (vcb) (Object) stackIn_187_0;
                      stackOut_187_1 = stackIn_187_1;
                      stackOut_187_2 = stackIn_187_2;
                      stackOut_187_3 = stackIn_187_3;
                      stackOut_187_4 = stackIn_187_4;
                      stackOut_187_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                      stackIn_188_0 = stackOut_187_0;
                      stackIn_188_1 = stackOut_187_1;
                      stackIn_188_2 = stackOut_187_2;
                      stackIn_188_3 = stackOut_187_3;
                      stackIn_188_4 = stackOut_187_4;
                      stackIn_188_5 = stackOut_187_5;
                      break L38;
                    } else {
                      stackOut_186_0 = (vcb) (Object) stackIn_186_0;
                      stackOut_186_1 = stackIn_186_1;
                      stackOut_186_2 = stackIn_186_2;
                      stackOut_186_3 = stackIn_186_3;
                      stackOut_186_4 = stackIn_186_4;
                      stackOut_186_5 = 0;
                      stackIn_188_0 = stackOut_186_0;
                      stackIn_188_1 = stackOut_186_1;
                      stackIn_188_2 = stackOut_186_2;
                      stackIn_188_3 = stackOut_186_3;
                      stackIn_188_4 = stackOut_186_4;
                      stackIn_188_5 = stackOut_186_5;
                      break L38;
                    }
                  }
                  ((vcb) (Object) stackIn_188_0).a(stackIn_188_1, stackIn_188_2, stackIn_188_3, stackIn_188_4, stackIn_188_5);
                  break L37;
                } else {
                  break L37;
                }
              }
              this.h((byte) -109);
              return;
            }
          } else {
            var3 = 0;
            if (param0 != 16777215) {
              L39: {
                ((sha) this).field_y = null;
                if (null == ((sha) this).field_B) {
                  stackOut_152_0 = ((sha) this).field_h;
                  stackIn_153_0 = stackOut_152_0;
                  break L39;
                } else {
                  stackOut_151_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                  stackIn_153_0 = stackOut_151_0;
                  break L39;
                }
              }
              L40: {
                var4 = stackIn_153_0;
                if (null != ((sha) this).field_v) {
                  stackOut_155_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                  stackIn_156_0 = stackOut_155_0;
                  break L40;
                } else {
                  stackOut_154_0 = ((sha) this).field_f;
                  stackIn_156_0 = stackOut_154_0;
                  break L40;
                }
              }
              L41: {
                var5 = stackIn_156_0;
                ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != ((sha) this).field_B) {
                  L42: {
                    stackOut_158_0 = ((sha) this).field_B;
                    stackIn_160_0 = stackOut_158_0;
                    stackIn_159_0 = stackOut_158_0;
                    if (!((sha) this).field_A) {
                      stackOut_160_0 = (vcb) (Object) stackIn_160_0;
                      stackOut_160_1 = 0;
                      stackIn_161_0 = stackOut_160_0;
                      stackIn_161_1 = stackOut_160_1;
                      break L42;
                    } else {
                      stackOut_159_0 = (vcb) (Object) stackIn_159_0;
                      stackOut_159_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                      stackIn_161_0 = stackOut_159_0;
                      stackIn_161_1 = stackOut_159_1;
                      break L42;
                    }
                  }
                  ((vcb) (Object) stackIn_161_0).a(stackIn_161_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                  break L41;
                } else {
                  break L41;
                }
              }
              L43: {
                if (null != ((sha) this).field_v) {
                  L44: {
                    stackOut_164_0 = ((sha) this).field_v;
                    stackOut_164_1 = ((sha) this).field_y.field_g;
                    stackOut_164_2 = ((sha) this).field_y.field_h;
                    stackOut_164_3 = ((sha) this).field_v.field_f;
                    stackOut_164_4 = 1;
                    stackIn_166_0 = stackOut_164_0;
                    stackIn_166_1 = stackOut_164_1;
                    stackIn_166_2 = stackOut_164_2;
                    stackIn_166_3 = stackOut_164_3;
                    stackIn_166_4 = stackOut_164_4;
                    stackIn_165_0 = stackOut_164_0;
                    stackIn_165_1 = stackOut_164_1;
                    stackIn_165_2 = stackOut_164_2;
                    stackIn_165_3 = stackOut_164_3;
                    stackIn_165_4 = stackOut_164_4;
                    if (((sha) this).field_z) {
                      stackOut_166_0 = (vcb) (Object) stackIn_166_0;
                      stackOut_166_1 = stackIn_166_1;
                      stackOut_166_2 = stackIn_166_2;
                      stackOut_166_3 = stackIn_166_3;
                      stackOut_166_4 = stackIn_166_4;
                      stackOut_166_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                      stackIn_167_0 = stackOut_166_0;
                      stackIn_167_1 = stackOut_166_1;
                      stackIn_167_2 = stackOut_166_2;
                      stackIn_167_3 = stackOut_166_3;
                      stackIn_167_4 = stackOut_166_4;
                      stackIn_167_5 = stackOut_166_5;
                      break L44;
                    } else {
                      stackOut_165_0 = (vcb) (Object) stackIn_165_0;
                      stackOut_165_1 = stackIn_165_1;
                      stackOut_165_2 = stackIn_165_2;
                      stackOut_165_3 = stackIn_165_3;
                      stackOut_165_4 = stackIn_165_4;
                      stackOut_165_5 = 0;
                      stackIn_167_0 = stackOut_165_0;
                      stackIn_167_1 = stackOut_165_1;
                      stackIn_167_2 = stackOut_165_2;
                      stackIn_167_3 = stackOut_165_3;
                      stackIn_167_4 = stackOut_165_4;
                      stackIn_167_5 = stackOut_165_5;
                      break L44;
                    }
                  }
                  ((vcb) (Object) stackIn_167_0).a(stackIn_167_1, stackIn_167_2, stackIn_167_3, stackIn_167_4, stackIn_167_5);
                  break L43;
                } else {
                  break L43;
                }
              }
              this.h((byte) -109);
              return;
            } else {
              L45: {
                if (null == ((sha) this).field_B) {
                  stackOut_133_0 = ((sha) this).field_h;
                  stackIn_134_0 = stackOut_133_0;
                  break L45;
                } else {
                  stackOut_132_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                  stackIn_134_0 = stackOut_132_0;
                  break L45;
                }
              }
              L46: {
                var4 = stackIn_134_0;
                if (null != ((sha) this).field_v) {
                  stackOut_136_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                  stackIn_137_0 = stackOut_136_0;
                  break L46;
                } else {
                  stackOut_135_0 = ((sha) this).field_f;
                  stackIn_137_0 = stackOut_135_0;
                  break L46;
                }
              }
              L47: {
                var5 = stackIn_137_0;
                ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
                if (null != ((sha) this).field_B) {
                  L48: {
                    stackOut_139_0 = ((sha) this).field_B;
                    stackIn_141_0 = stackOut_139_0;
                    stackIn_140_0 = stackOut_139_0;
                    if (!((sha) this).field_A) {
                      stackOut_141_0 = (vcb) (Object) stackIn_141_0;
                      stackOut_141_1 = 0;
                      stackIn_142_0 = stackOut_141_0;
                      stackIn_142_1 = stackOut_141_1;
                      break L48;
                    } else {
                      stackOut_140_0 = (vcb) (Object) stackIn_140_0;
                      stackOut_140_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                      stackIn_142_0 = stackOut_140_0;
                      stackIn_142_1 = stackOut_140_1;
                      break L48;
                    }
                  }
                  ((vcb) (Object) stackIn_142_0).a(stackIn_142_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                  break L47;
                } else {
                  break L47;
                }
              }
              L49: {
                if (null != ((sha) this).field_v) {
                  L50: {
                    stackOut_145_0 = ((sha) this).field_v;
                    stackOut_145_1 = ((sha) this).field_y.field_g;
                    stackOut_145_2 = ((sha) this).field_y.field_h;
                    stackOut_145_3 = ((sha) this).field_v.field_f;
                    stackOut_145_4 = 1;
                    stackIn_147_0 = stackOut_145_0;
                    stackIn_147_1 = stackOut_145_1;
                    stackIn_147_2 = stackOut_145_2;
                    stackIn_147_3 = stackOut_145_3;
                    stackIn_147_4 = stackOut_145_4;
                    stackIn_146_0 = stackOut_145_0;
                    stackIn_146_1 = stackOut_145_1;
                    stackIn_146_2 = stackOut_145_2;
                    stackIn_146_3 = stackOut_145_3;
                    stackIn_146_4 = stackOut_145_4;
                    if (((sha) this).field_z) {
                      stackOut_147_0 = (vcb) (Object) stackIn_147_0;
                      stackOut_147_1 = stackIn_147_1;
                      stackOut_147_2 = stackIn_147_2;
                      stackOut_147_3 = stackIn_147_3;
                      stackOut_147_4 = stackIn_147_4;
                      stackOut_147_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                      stackIn_148_0 = stackOut_147_0;
                      stackIn_148_1 = stackOut_147_1;
                      stackIn_148_2 = stackOut_147_2;
                      stackIn_148_3 = stackOut_147_3;
                      stackIn_148_4 = stackOut_147_4;
                      stackIn_148_5 = stackOut_147_5;
                      break L50;
                    } else {
                      stackOut_146_0 = (vcb) (Object) stackIn_146_0;
                      stackOut_146_1 = stackIn_146_1;
                      stackOut_146_2 = stackIn_146_2;
                      stackOut_146_3 = stackIn_146_3;
                      stackOut_146_4 = stackIn_146_4;
                      stackOut_146_5 = 0;
                      stackIn_148_0 = stackOut_146_0;
                      stackIn_148_1 = stackOut_146_1;
                      stackIn_148_2 = stackOut_146_2;
                      stackIn_148_3 = stackOut_146_3;
                      stackIn_148_4 = stackOut_146_4;
                      stackIn_148_5 = stackOut_146_5;
                      break L50;
                    }
                  }
                  ((vcb) (Object) stackIn_148_0).a(stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_148_4, stackIn_148_5);
                  break L49;
                } else {
                  break L49;
                }
              }
              this.h((byte) -109);
              return;
            }
          }
        } else {
          var3 = 0;
          if (param0 != 16777215) {
            L51: {
              ((sha) this).field_y = null;
              if (null == ((sha) this).field_B) {
                stackOut_111_0 = ((sha) this).field_h;
                stackIn_112_0 = stackOut_111_0;
                break L51;
              } else {
                stackOut_110_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                stackIn_112_0 = stackOut_110_0;
                break L51;
              }
            }
            L52: {
              var4 = stackIn_112_0;
              if (null != ((sha) this).field_v) {
                stackOut_114_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                stackIn_115_0 = stackOut_114_0;
                break L52;
              } else {
                stackOut_113_0 = ((sha) this).field_f;
                stackIn_115_0 = stackOut_113_0;
                break L52;
              }
            }
            L53: {
              var5 = stackIn_115_0;
              ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
              if (null != ((sha) this).field_B) {
                L54: {
                  stackOut_117_0 = ((sha) this).field_B;
                  stackIn_119_0 = stackOut_117_0;
                  stackIn_118_0 = stackOut_117_0;
                  if (!((sha) this).field_A) {
                    stackOut_119_0 = (vcb) (Object) stackIn_119_0;
                    stackOut_119_1 = 0;
                    stackIn_120_0 = stackOut_119_0;
                    stackIn_120_1 = stackOut_119_1;
                    break L54;
                  } else {
                    stackOut_118_0 = (vcb) (Object) stackIn_118_0;
                    stackOut_118_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                    stackIn_120_0 = stackOut_118_0;
                    stackIn_120_1 = stackOut_118_1;
                    break L54;
                  }
                }
                ((vcb) (Object) stackIn_120_0).a(stackIn_120_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                break L53;
              } else {
                break L53;
              }
            }
            L55: {
              if (null != ((sha) this).field_v) {
                L56: {
                  stackOut_123_0 = ((sha) this).field_v;
                  stackOut_123_1 = ((sha) this).field_y.field_g;
                  stackOut_123_2 = ((sha) this).field_y.field_h;
                  stackOut_123_3 = ((sha) this).field_v.field_f;
                  stackOut_123_4 = 1;
                  stackIn_125_0 = stackOut_123_0;
                  stackIn_125_1 = stackOut_123_1;
                  stackIn_125_2 = stackOut_123_2;
                  stackIn_125_3 = stackOut_123_3;
                  stackIn_125_4 = stackOut_123_4;
                  stackIn_124_0 = stackOut_123_0;
                  stackIn_124_1 = stackOut_123_1;
                  stackIn_124_2 = stackOut_123_2;
                  stackIn_124_3 = stackOut_123_3;
                  stackIn_124_4 = stackOut_123_4;
                  if (((sha) this).field_z) {
                    stackOut_125_0 = (vcb) (Object) stackIn_125_0;
                    stackOut_125_1 = stackIn_125_1;
                    stackOut_125_2 = stackIn_125_2;
                    stackOut_125_3 = stackIn_125_3;
                    stackOut_125_4 = stackIn_125_4;
                    stackOut_125_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    stackIn_126_2 = stackOut_125_2;
                    stackIn_126_3 = stackOut_125_3;
                    stackIn_126_4 = stackOut_125_4;
                    stackIn_126_5 = stackOut_125_5;
                    break L56;
                  } else {
                    stackOut_124_0 = (vcb) (Object) stackIn_124_0;
                    stackOut_124_1 = stackIn_124_1;
                    stackOut_124_2 = stackIn_124_2;
                    stackOut_124_3 = stackIn_124_3;
                    stackOut_124_4 = stackIn_124_4;
                    stackOut_124_5 = 0;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    stackIn_126_2 = stackOut_124_2;
                    stackIn_126_3 = stackOut_124_3;
                    stackIn_126_4 = stackOut_124_4;
                    stackIn_126_5 = stackOut_124_5;
                    break L56;
                  }
                }
                ((vcb) (Object) stackIn_126_0).a(stackIn_126_1, stackIn_126_2, stackIn_126_3, stackIn_126_4, stackIn_126_5);
                break L55;
              } else {
                break L55;
              }
            }
            this.h((byte) -109);
            return;
          } else {
            L57: {
              if (null == ((sha) this).field_B) {
                stackOut_92_0 = ((sha) this).field_h;
                stackIn_93_0 = stackOut_92_0;
                break L57;
              } else {
                stackOut_91_0 = -((sha) this).field_B.field_h + ((sha) this).field_h;
                stackIn_93_0 = stackOut_91_0;
                break L57;
              }
            }
            L58: {
              var4 = stackIn_93_0;
              if (null != ((sha) this).field_v) {
                stackOut_95_0 = ((sha) this).field_f + -((sha) this).field_v.field_f;
                stackIn_96_0 = stackOut_95_0;
                break L58;
              } else {
                stackOut_94_0 = ((sha) this).field_f;
                stackIn_96_0 = stackOut_94_0;
                break L58;
              }
            }
            L59: {
              var5 = stackIn_96_0;
              ((sha) this).field_y.a(var2, var4, var5, param0 ^ 16777214, var3);
              if (null != ((sha) this).field_B) {
                L60: {
                  stackOut_98_0 = ((sha) this).field_B;
                  stackIn_100_0 = stackOut_98_0;
                  stackIn_99_0 = stackOut_98_0;
                  if (!((sha) this).field_A) {
                    stackOut_100_0 = (vcb) (Object) stackIn_100_0;
                    stackOut_100_1 = 0;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    break L60;
                  } else {
                    stackOut_99_0 = (vcb) (Object) stackIn_99_0;
                    stackOut_99_1 = ((sha) this).field_h + -((sha) this).field_B.field_h;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    break L60;
                  }
                }
                ((vcb) (Object) stackIn_101_0).a(stackIn_101_1, ((sha) this).field_B.field_h, ((sha) this).field_y.field_f, 1, ((sha) this).field_y.field_r);
                break L59;
              } else {
                break L59;
              }
            }
            L61: {
              if (null != ((sha) this).field_v) {
                L62: {
                  stackOut_104_0 = ((sha) this).field_v;
                  stackOut_104_1 = ((sha) this).field_y.field_g;
                  stackOut_104_2 = ((sha) this).field_y.field_h;
                  stackOut_104_3 = ((sha) this).field_v.field_f;
                  stackOut_104_4 = 1;
                  stackIn_106_0 = stackOut_104_0;
                  stackIn_106_1 = stackOut_104_1;
                  stackIn_106_2 = stackOut_104_2;
                  stackIn_106_3 = stackOut_104_3;
                  stackIn_106_4 = stackOut_104_4;
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  stackIn_105_3 = stackOut_104_3;
                  stackIn_105_4 = stackOut_104_4;
                  if (((sha) this).field_z) {
                    stackOut_106_0 = (vcb) (Object) stackIn_106_0;
                    stackOut_106_1 = stackIn_106_1;
                    stackOut_106_2 = stackIn_106_2;
                    stackOut_106_3 = stackIn_106_3;
                    stackOut_106_4 = stackIn_106_4;
                    stackOut_106_5 = -((sha) this).field_v.field_f + ((sha) this).field_f;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    stackIn_107_2 = stackOut_106_2;
                    stackIn_107_3 = stackOut_106_3;
                    stackIn_107_4 = stackOut_106_4;
                    stackIn_107_5 = stackOut_106_5;
                    break L62;
                  } else {
                    stackOut_105_0 = (vcb) (Object) stackIn_105_0;
                    stackOut_105_1 = stackIn_105_1;
                    stackOut_105_2 = stackIn_105_2;
                    stackOut_105_3 = stackIn_105_3;
                    stackOut_105_4 = stackIn_105_4;
                    stackOut_105_5 = 0;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    stackIn_107_2 = stackOut_105_2;
                    stackIn_107_3 = stackOut_105_3;
                    stackIn_107_4 = stackOut_105_4;
                    stackIn_107_5 = stackOut_105_5;
                    break L62;
                  }
                }
                ((vcb) (Object) stackIn_107_0).a(stackIn_107_1, stackIn_107_2, stackIn_107_3, stackIn_107_4, stackIn_107_5);
                break L61;
              } else {
                break L61;
              }
            }
            this.h((byte) -109);
            return;
          }
        }
    }

    private final boolean a(int param0, int param1) {
        if (((sha) this).field_B != null) {
          ((sha) this).field_B.c(param1 + 1715701295, ((sha) this).field_B.field_K * param0 + ((sha) this).field_B.field_L);
          return true;
        } else {
          if (param1 != -1715704688) {
            this.e(-30);
            return false;
          } else {
            return false;
          }
        }
    }

    final boolean a(int param0, int param1, shb param2, char param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -15834) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$2 = ((sha) this).a(-106, -5, (shb) null, '￘');
                break L1;
              }
            }
            if (super.a(param0, param1, param2, param3)) {
              this.e(-1715704688);
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sha.N(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (param2 != -981) {
                Object var6 = null;
                ((sha) this).a(23, 55, 77, (shb) null);
            }
            this.h((byte) -113);
            this.e(-1715704688);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sha.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0) {
        Object var3 = null;
        L0: {
          if (null != ((sha) this).field_B) {
            ((sha) this).field_y.field_t.field_r = -(int)((long)(((sha) this).field_y.field_t.field_f + -((sha) this).field_y.field_f) * (long)((sha) this).field_B.field_L >> 16);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == -1715704688) {
          if (null != ((sha) this).field_v) {
            ((sha) this).field_y.field_t.field_g = -(int)((long)(((sha) this).field_y.field_t.field_h + -((sha) this).field_y.field_h) * (long)((sha) this).field_v.field_M >> 16);
            return;
          } else {
            return;
          }
        } else {
          var3 = null;
          sha.a(74, (String) null, -117, -2, (byte) 104, -89, -50, (eab) null, -99);
          if (null == ((sha) this).field_v) {
            return;
          } else {
            ((sha) this).field_y.field_t.field_g = -(int)((long)(((sha) this).field_y.field_t.field_h + -((sha) this).field_y.field_h) * (long)((sha) this).field_v.field_M >> 16);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, shb param3, int param4, int param5, int param6) {
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
                  if (!((sha) this).e((byte) -120)) {
                    break L2;
                  } else {
                    if (!this.a(param2, param1 + -1715698682)) {
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
            stackOut_9_1 = new StringBuilder().append("sha.WA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_8_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
