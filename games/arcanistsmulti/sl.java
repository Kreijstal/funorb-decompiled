/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends kl {
    static String field_R;
    static kc field_S;
    static int[] field_H;
    static String field_N;
    private boolean field_J;
    static int[] field_V;
    private boolean field_U;
    static int field_I;
    static String field_K;
    wm field_P;
    private ma field_Q;
    static String field_M;
    static int field_W;
    static int field_T;
    ma field_O;

    private final boolean a(boolean param0, int param1) {
        if (null != ((sl) this).field_O) {
          ((sl) this).field_O.a((byte) -6, param1 * ((sl) this).field_O.field_T + ((sl) this).field_O.field_L);
          return true;
        } else {
          return false;
        }
    }

    final void a(boolean param0, int param1, ma param2) {
        try {
            ((sl) this).field_U = param0 ? true : false;
            ((sl) this).field_O = param2;
            ((sl) this).field_z[param1] = (qm) (Object) param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sl.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.h(1);
            this.f(-2023111216);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -120) {
                break L1;
              } else {
                var6 = null;
                ((sl) this).a((qm) null, -13, 8, -25);
                break L1;
              }
            }
            if (!super.a(param0, (byte) -122, param2, param3)) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              this.f(-2023111216);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("sl.N(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, qm param6) {
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
            if (super.a(param0, param1, param2, param3, param4, param5 + param5, param6)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                L2: {
                  if (!((sl) this).d(param5 + -2116)) {
                    break L2;
                  } else {
                    if (!this.a(true, param4)) {
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
            stackOut_9_1 = new StringBuilder().append("sl.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
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
          throw aa.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    private final void f(int param0) {
        if (null == ((sl) this).field_O) {
          if (null != ((sl) this).field_Q) {
            ((sl) this).field_P.field_B.field_n = -(int)((long)((sl) this).field_Q.field_Z * (long)(((sl) this).field_P.field_B.field_v + -((sl) this).field_P.field_v) >> 16);
            return;
          } else {
            return;
          }
        } else {
          ((sl) this).field_P.field_B.field_j = -(int)((long)((sl) this).field_O.field_L * (long)(-((sl) this).field_P.field_k + ((sl) this).field_P.field_B.field_k) >> 16);
          if (null == ((sl) this).field_Q) {
            return;
          } else {
            ((sl) this).field_P.field_B.field_n = -(int)((long)((sl) this).field_Q.field_Z * (long)(((sl) this).field_P.field_B.field_v + -((sl) this).field_P.field_v) >> 16);
            return;
          }
        }
    }

    private final void h(int param0) {
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ((sl) this).field_O) {
          if (((sl) this).field_P.field_k < ((sl) this).field_P.field_B.field_k) {
            ((sl) this).field_O.a(((sl) this).field_P.field_B.field_k, (byte) -42, ((sl) this).field_P.field_k);
            return;
          } else {
            ((sl) this).field_O.a(1, (byte) -42, 1);
            return;
          }
        } else {
          return;
        }
    }

    sl(int param0, int param1, int param2, int param3, pf param4, qm param5, pf param6) {
        super(param0, param1, param2, param3, param4);
        try {
            ((sl) this).field_z = new qm[3];
            wm dupTemp$0 = new wm(param0, param1, param2, param3, param6, param5);
            ((sl) this).field_P = dupTemp$0;
            ((sl) this).field_z[2] = (qm) (Object) dupTemp$0;
            ((sl) this).e(123);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "sl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        ma stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        ma stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        ma stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        int stackIn_14_4 = 0;
        ma stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        ma stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        ma stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        ma stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        ma stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        ma stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        ma stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        ma stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        ma stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        ma stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        ma stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        ma stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        ma stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        ma stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        ma stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        ma stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ma stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        ma stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        ma stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        ma stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        ma stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_82_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_88_0 = 0;
        ma stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        ma stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        ma stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int stackIn_93_3 = 0;
        int stackIn_93_4 = 0;
        ma stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        ma stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        ma stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        ma stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        ma stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        ma stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_113_0 = 0;
        int stackIn_116_0 = 0;
        ma stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        ma stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        ma stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        int stackIn_121_4 = 0;
        ma stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        ma stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        ma stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        int stackIn_127_2 = 0;
        ma stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        ma stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        ma stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        int stackIn_138_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_144_0 = 0;
        ma stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        ma stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        ma stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_149_2 = 0;
        int stackIn_149_3 = 0;
        int stackIn_149_4 = 0;
        ma stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        ma stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        ma stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        ma stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        ma stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        ma stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_161_2 = 0;
        int stackOut_136_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        ma stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        ma stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_120_3 = 0;
        int stackOut_120_4 = 0;
        ma stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_119_4 = 0;
        ma stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        ma stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        ma stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        ma stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        ma stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        int stackOut_126_2 = 0;
        ma stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_143_0 = 0;
        int stackOut_142_0 = 0;
        ma stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        int stackOut_146_2 = 0;
        int stackOut_146_3 = 0;
        ma stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        int stackOut_148_4 = 0;
        ma stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        int stackOut_147_3 = 0;
        int stackOut_147_4 = 0;
        ma stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        ma stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_160_2 = 0;
        ma stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        ma stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        ma stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        ma stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        int stackOut_153_2 = 0;
        int stackOut_80_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        ma stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        ma stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        int stackOut_64_4 = 0;
        ma stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        int stackOut_63_4 = 0;
        ma stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        ma stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        ma stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        ma stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        ma stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        ma stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        ma stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        ma stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int stackOut_92_3 = 0;
        int stackOut_92_4 = 0;
        ma stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        ma stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        ma stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        ma stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        ma stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        ma stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        ma stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        ma stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        ma stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int stackOut_13_3 = 0;
        int stackOut_13_4 = 0;
        ma stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        ma stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        ma stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        ma stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        ma stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        ma stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        ma stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        ma stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        ma stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int stackOut_47_2 = 0;
        ma stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        ma stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        ma stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        ma stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        if (!((sl) this).field_U) {
          if (null != ((sl) this).field_O) {
            L0: {
              var2 = ((sl) this).field_O.field_v;
              if (((sl) this).field_J) {
                stackOut_136_0 = 0;
                stackIn_138_0 = stackOut_136_0;
                break L0;
              } else {
                if (null != ((sl) this).field_Q) {
                  stackOut_137_0 = ((sl) this).field_Q.field_k;
                  stackIn_138_0 = stackOut_137_0;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    if (null != ((sl) this).field_O) {
                      stackOut_112_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                      stackIn_113_0 = stackOut_112_0;
                      break L1;
                    } else {
                      stackOut_111_0 = ((sl) this).field_v;
                      stackIn_113_0 = stackOut_111_0;
                      break L1;
                    }
                  }
                  L2: {
                    var4 = stackIn_113_0;
                    if (((sl) this).field_Q != null) {
                      stackOut_115_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_116_0 = stackOut_115_0;
                      break L2;
                    } else {
                      stackOut_114_0 = ((sl) this).field_k;
                      stackIn_116_0 = stackOut_114_0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = stackIn_116_0;
                    ((sl) this).field_P.a(var5, var3, var4, var2, -101);
                    if (null != ((sl) this).field_O) {
                      L4: {
                        stackOut_118_0 = ((sl) this).field_O;
                        stackOut_118_1 = ((sl) this).field_P.field_k;
                        stackOut_118_2 = ((sl) this).field_P.field_j;
                        stackOut_118_3 = ((sl) this).field_O.field_v;
                        stackIn_120_0 = stackOut_118_0;
                        stackIn_120_1 = stackOut_118_1;
                        stackIn_120_2 = stackOut_118_2;
                        stackIn_120_3 = stackOut_118_3;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        stackIn_119_2 = stackOut_118_2;
                        stackIn_119_3 = stackOut_118_3;
                        if (!((sl) this).field_U) {
                          stackOut_120_0 = (ma) (Object) stackIn_120_0;
                          stackOut_120_1 = stackIn_120_1;
                          stackOut_120_2 = stackIn_120_2;
                          stackOut_120_3 = stackIn_120_3;
                          stackOut_120_4 = 0;
                          stackIn_121_0 = stackOut_120_0;
                          stackIn_121_1 = stackOut_120_1;
                          stackIn_121_2 = stackOut_120_2;
                          stackIn_121_3 = stackOut_120_3;
                          stackIn_121_4 = stackOut_120_4;
                          break L4;
                        } else {
                          stackOut_119_0 = (ma) (Object) stackIn_119_0;
                          stackOut_119_1 = stackIn_119_1;
                          stackOut_119_2 = stackIn_119_2;
                          stackOut_119_3 = stackIn_119_3;
                          stackOut_119_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                          stackIn_121_0 = stackOut_119_0;
                          stackIn_121_1 = stackOut_119_1;
                          stackIn_121_2 = stackOut_119_2;
                          stackIn_121_3 = stackOut_119_3;
                          stackIn_121_4 = stackOut_119_4;
                          break L4;
                        }
                      }
                      ((ma) (Object) stackIn_121_0).a(stackIn_121_1, stackIn_121_2, stackIn_121_3, stackIn_121_4, -87);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param0 < 17) {
                    L5: {
                      ((sl) this).field_Q = null;
                      if (null == ((sl) this).field_Q) {
                        break L5;
                      } else {
                        L6: {
                          stackOut_130_0 = ((sl) this).field_Q;
                          stackOut_130_1 = ((sl) this).field_Q.field_k;
                          stackIn_132_0 = stackOut_130_0;
                          stackIn_132_1 = stackOut_130_1;
                          stackIn_131_0 = stackOut_130_0;
                          stackIn_131_1 = stackOut_130_1;
                          if (((sl) this).field_J) {
                            stackOut_132_0 = (ma) (Object) stackIn_132_0;
                            stackOut_132_1 = stackIn_132_1;
                            stackOut_132_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                            stackIn_133_0 = stackOut_132_0;
                            stackIn_133_1 = stackOut_132_1;
                            stackIn_133_2 = stackOut_132_2;
                            break L6;
                          } else {
                            stackOut_131_0 = (ma) (Object) stackIn_131_0;
                            stackOut_131_1 = stackIn_131_1;
                            stackOut_131_2 = 0;
                            stackIn_133_0 = stackOut_131_0;
                            stackIn_133_1 = stackOut_131_1;
                            stackIn_133_2 = stackOut_131_2;
                            break L6;
                          }
                        }
                        ((ma) (Object) stackIn_133_0).a(stackIn_133_1, stackIn_133_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                        break L5;
                      }
                    }
                    this.h(1);
                    return;
                  } else {
                    L7: {
                      if (null == ((sl) this).field_Q) {
                        break L7;
                      } else {
                        L8: {
                          stackOut_124_0 = ((sl) this).field_Q;
                          stackOut_124_1 = ((sl) this).field_Q.field_k;
                          stackIn_126_0 = stackOut_124_0;
                          stackIn_126_1 = stackOut_124_1;
                          stackIn_125_0 = stackOut_124_0;
                          stackIn_125_1 = stackOut_124_1;
                          if (((sl) this).field_J) {
                            stackOut_126_0 = (ma) (Object) stackIn_126_0;
                            stackOut_126_1 = stackIn_126_1;
                            stackOut_126_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                            stackIn_127_0 = stackOut_126_0;
                            stackIn_127_1 = stackOut_126_1;
                            stackIn_127_2 = stackOut_126_2;
                            break L8;
                          } else {
                            stackOut_125_0 = (ma) (Object) stackIn_125_0;
                            stackOut_125_1 = stackIn_125_1;
                            stackOut_125_2 = 0;
                            stackIn_127_0 = stackOut_125_0;
                            stackIn_127_1 = stackOut_125_1;
                            stackIn_127_2 = stackOut_125_2;
                            break L8;
                          }
                        }
                        ((ma) (Object) stackIn_127_0).a(stackIn_127_1, stackIn_127_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                        break L7;
                      }
                    }
                    this.h(1);
                    return;
                  }
                }
              }
            }
            L9: {
              var3 = stackIn_138_0;
              if (null != ((sl) this).field_O) {
                stackOut_140_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                stackIn_141_0 = stackOut_140_0;
                break L9;
              } else {
                stackOut_139_0 = ((sl) this).field_v;
                stackIn_141_0 = stackOut_139_0;
                break L9;
              }
            }
            L10: {
              var4 = stackIn_141_0;
              if (((sl) this).field_Q != null) {
                stackOut_143_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                stackIn_144_0 = stackOut_143_0;
                break L10;
              } else {
                stackOut_142_0 = ((sl) this).field_k;
                stackIn_144_0 = stackOut_142_0;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_144_0;
              ((sl) this).field_P.a(var5, var3, var4, var2, -101);
              if (null != ((sl) this).field_O) {
                L12: {
                  stackOut_146_0 = ((sl) this).field_O;
                  stackOut_146_1 = ((sl) this).field_P.field_k;
                  stackOut_146_2 = ((sl) this).field_P.field_j;
                  stackOut_146_3 = ((sl) this).field_O.field_v;
                  stackIn_148_0 = stackOut_146_0;
                  stackIn_148_1 = stackOut_146_1;
                  stackIn_148_2 = stackOut_146_2;
                  stackIn_148_3 = stackOut_146_3;
                  stackIn_147_0 = stackOut_146_0;
                  stackIn_147_1 = stackOut_146_1;
                  stackIn_147_2 = stackOut_146_2;
                  stackIn_147_3 = stackOut_146_3;
                  if (!((sl) this).field_U) {
                    stackOut_148_0 = (ma) (Object) stackIn_148_0;
                    stackOut_148_1 = stackIn_148_1;
                    stackOut_148_2 = stackIn_148_2;
                    stackOut_148_3 = stackIn_148_3;
                    stackOut_148_4 = 0;
                    stackIn_149_0 = stackOut_148_0;
                    stackIn_149_1 = stackOut_148_1;
                    stackIn_149_2 = stackOut_148_2;
                    stackIn_149_3 = stackOut_148_3;
                    stackIn_149_4 = stackOut_148_4;
                    break L12;
                  } else {
                    stackOut_147_0 = (ma) (Object) stackIn_147_0;
                    stackOut_147_1 = stackIn_147_1;
                    stackOut_147_2 = stackIn_147_2;
                    stackOut_147_3 = stackIn_147_3;
                    stackOut_147_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                    stackIn_149_0 = stackOut_147_0;
                    stackIn_149_1 = stackOut_147_1;
                    stackIn_149_2 = stackOut_147_2;
                    stackIn_149_3 = stackOut_147_3;
                    stackIn_149_4 = stackOut_147_4;
                    break L12;
                  }
                }
                ((ma) (Object) stackIn_149_0).a(stackIn_149_1, stackIn_149_2, stackIn_149_3, stackIn_149_4, -87);
                break L11;
              } else {
                break L11;
              }
            }
            if (param0 < 17) {
              L13: {
                ((sl) this).field_Q = null;
                if (null == ((sl) this).field_Q) {
                  break L13;
                } else {
                  L14: {
                    stackOut_158_0 = ((sl) this).field_Q;
                    stackOut_158_1 = ((sl) this).field_Q.field_k;
                    stackIn_160_0 = stackOut_158_0;
                    stackIn_160_1 = stackOut_158_1;
                    stackIn_159_0 = stackOut_158_0;
                    stackIn_159_1 = stackOut_158_1;
                    if (((sl) this).field_J) {
                      stackOut_160_0 = (ma) (Object) stackIn_160_0;
                      stackOut_160_1 = stackIn_160_1;
                      stackOut_160_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_161_0 = stackOut_160_0;
                      stackIn_161_1 = stackOut_160_1;
                      stackIn_161_2 = stackOut_160_2;
                      break L14;
                    } else {
                      stackOut_159_0 = (ma) (Object) stackIn_159_0;
                      stackOut_159_1 = stackIn_159_1;
                      stackOut_159_2 = 0;
                      stackIn_161_0 = stackOut_159_0;
                      stackIn_161_1 = stackOut_159_1;
                      stackIn_161_2 = stackOut_159_2;
                      break L14;
                    }
                  }
                  ((ma) (Object) stackIn_161_0).a(stackIn_161_1, stackIn_161_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                  break L13;
                }
              }
              this.h(1);
              return;
            } else {
              L15: {
                if (null == ((sl) this).field_Q) {
                  break L15;
                } else {
                  L16: {
                    stackOut_152_0 = ((sl) this).field_Q;
                    stackOut_152_1 = ((sl) this).field_Q.field_k;
                    stackIn_154_0 = stackOut_152_0;
                    stackIn_154_1 = stackOut_152_1;
                    stackIn_153_0 = stackOut_152_0;
                    stackIn_153_1 = stackOut_152_1;
                    if (((sl) this).field_J) {
                      stackOut_154_0 = (ma) (Object) stackIn_154_0;
                      stackOut_154_1 = stackIn_154_1;
                      stackOut_154_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_155_0 = stackOut_154_0;
                      stackIn_155_1 = stackOut_154_1;
                      stackIn_155_2 = stackOut_154_2;
                      break L16;
                    } else {
                      stackOut_153_0 = (ma) (Object) stackIn_153_0;
                      stackOut_153_1 = stackIn_153_1;
                      stackOut_153_2 = 0;
                      stackIn_155_0 = stackOut_153_0;
                      stackIn_155_1 = stackOut_153_1;
                      stackIn_155_2 = stackOut_153_2;
                      break L16;
                    }
                  }
                  ((ma) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                  break L15;
                }
              }
              this.h(1);
              return;
            }
          } else {
            L17: {
              var2 = 0;
              if (((sl) this).field_J) {
                stackOut_80_0 = 0;
                stackIn_82_0 = stackOut_80_0;
                break L17;
              } else {
                if (null != ((sl) this).field_Q) {
                  stackOut_81_0 = ((sl) this).field_Q.field_k;
                  stackIn_82_0 = stackOut_81_0;
                  break L17;
                } else {
                  L18: {
                    var3 = 0;
                    if (null != ((sl) this).field_O) {
                      stackOut_56_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                      stackIn_57_0 = stackOut_56_0;
                      break L18;
                    } else {
                      stackOut_55_0 = ((sl) this).field_v;
                      stackIn_57_0 = stackOut_55_0;
                      break L18;
                    }
                  }
                  L19: {
                    var4 = stackIn_57_0;
                    if (((sl) this).field_Q != null) {
                      stackOut_59_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_60_0 = stackOut_59_0;
                      break L19;
                    } else {
                      stackOut_58_0 = ((sl) this).field_k;
                      stackIn_60_0 = stackOut_58_0;
                      break L19;
                    }
                  }
                  L20: {
                    var5 = stackIn_60_0;
                    ((sl) this).field_P.a(var5, var3, var4, var2, -101);
                    if (null != ((sl) this).field_O) {
                      L21: {
                        stackOut_62_0 = ((sl) this).field_O;
                        stackOut_62_1 = ((sl) this).field_P.field_k;
                        stackOut_62_2 = ((sl) this).field_P.field_j;
                        stackOut_62_3 = ((sl) this).field_O.field_v;
                        stackIn_64_0 = stackOut_62_0;
                        stackIn_64_1 = stackOut_62_1;
                        stackIn_64_2 = stackOut_62_2;
                        stackIn_64_3 = stackOut_62_3;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        if (!((sl) this).field_U) {
                          stackOut_64_0 = (ma) (Object) stackIn_64_0;
                          stackOut_64_1 = stackIn_64_1;
                          stackOut_64_2 = stackIn_64_2;
                          stackOut_64_3 = stackIn_64_3;
                          stackOut_64_4 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          stackIn_65_1 = stackOut_64_1;
                          stackIn_65_2 = stackOut_64_2;
                          stackIn_65_3 = stackOut_64_3;
                          stackIn_65_4 = stackOut_64_4;
                          break L21;
                        } else {
                          stackOut_63_0 = (ma) (Object) stackIn_63_0;
                          stackOut_63_1 = stackIn_63_1;
                          stackOut_63_2 = stackIn_63_2;
                          stackOut_63_3 = stackIn_63_3;
                          stackOut_63_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                          stackIn_65_0 = stackOut_63_0;
                          stackIn_65_1 = stackOut_63_1;
                          stackIn_65_2 = stackOut_63_2;
                          stackIn_65_3 = stackOut_63_3;
                          stackIn_65_4 = stackOut_63_4;
                          break L21;
                        }
                      }
                      ((ma) (Object) stackIn_65_0).a(stackIn_65_1, stackIn_65_2, stackIn_65_3, stackIn_65_4, -87);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  if (param0 < 17) {
                    L22: {
                      ((sl) this).field_Q = null;
                      if (null == ((sl) this).field_Q) {
                        break L22;
                      } else {
                        L23: {
                          stackOut_74_0 = ((sl) this).field_Q;
                          stackOut_74_1 = ((sl) this).field_Q.field_k;
                          stackIn_76_0 = stackOut_74_0;
                          stackIn_76_1 = stackOut_74_1;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          if (((sl) this).field_J) {
                            stackOut_76_0 = (ma) (Object) stackIn_76_0;
                            stackOut_76_1 = stackIn_76_1;
                            stackOut_76_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            stackIn_77_2 = stackOut_76_2;
                            break L23;
                          } else {
                            stackOut_75_0 = (ma) (Object) stackIn_75_0;
                            stackOut_75_1 = stackIn_75_1;
                            stackOut_75_2 = 0;
                            stackIn_77_0 = stackOut_75_0;
                            stackIn_77_1 = stackOut_75_1;
                            stackIn_77_2 = stackOut_75_2;
                            break L23;
                          }
                        }
                        ((ma) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                        break L22;
                      }
                    }
                    this.h(1);
                    return;
                  } else {
                    L24: {
                      if (null == ((sl) this).field_Q) {
                        break L24;
                      } else {
                        L25: {
                          stackOut_68_0 = ((sl) this).field_Q;
                          stackOut_68_1 = ((sl) this).field_Q.field_k;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_70_1 = stackOut_68_1;
                          stackIn_69_0 = stackOut_68_0;
                          stackIn_69_1 = stackOut_68_1;
                          if (((sl) this).field_J) {
                            stackOut_70_0 = (ma) (Object) stackIn_70_0;
                            stackOut_70_1 = stackIn_70_1;
                            stackOut_70_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            stackIn_71_2 = stackOut_70_2;
                            break L25;
                          } else {
                            stackOut_69_0 = (ma) (Object) stackIn_69_0;
                            stackOut_69_1 = stackIn_69_1;
                            stackOut_69_2 = 0;
                            stackIn_71_0 = stackOut_69_0;
                            stackIn_71_1 = stackOut_69_1;
                            stackIn_71_2 = stackOut_69_2;
                            break L25;
                          }
                        }
                        ((ma) (Object) stackIn_71_0).a(stackIn_71_1, stackIn_71_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                        break L24;
                      }
                    }
                    this.h(1);
                    return;
                  }
                }
              }
            }
            L26: {
              var3 = stackIn_82_0;
              if (null != ((sl) this).field_O) {
                stackOut_84_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                stackIn_85_0 = stackOut_84_0;
                break L26;
              } else {
                stackOut_83_0 = ((sl) this).field_v;
                stackIn_85_0 = stackOut_83_0;
                break L26;
              }
            }
            L27: {
              var4 = stackIn_85_0;
              if (((sl) this).field_Q != null) {
                stackOut_87_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                stackIn_88_0 = stackOut_87_0;
                break L27;
              } else {
                stackOut_86_0 = ((sl) this).field_k;
                stackIn_88_0 = stackOut_86_0;
                break L27;
              }
            }
            L28: {
              var5 = stackIn_88_0;
              ((sl) this).field_P.a(var5, var3, var4, var2, -101);
              if (null != ((sl) this).field_O) {
                L29: {
                  stackOut_90_0 = ((sl) this).field_O;
                  stackOut_90_1 = ((sl) this).field_P.field_k;
                  stackOut_90_2 = ((sl) this).field_P.field_j;
                  stackOut_90_3 = ((sl) this).field_O.field_v;
                  stackIn_92_0 = stackOut_90_0;
                  stackIn_92_1 = stackOut_90_1;
                  stackIn_92_2 = stackOut_90_2;
                  stackIn_92_3 = stackOut_90_3;
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  stackIn_91_2 = stackOut_90_2;
                  stackIn_91_3 = stackOut_90_3;
                  if (!((sl) this).field_U) {
                    stackOut_92_0 = (ma) (Object) stackIn_92_0;
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = stackIn_92_2;
                    stackOut_92_3 = stackIn_92_3;
                    stackOut_92_4 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    stackIn_93_3 = stackOut_92_3;
                    stackIn_93_4 = stackOut_92_4;
                    break L29;
                  } else {
                    stackOut_91_0 = (ma) (Object) stackIn_91_0;
                    stackOut_91_1 = stackIn_91_1;
                    stackOut_91_2 = stackIn_91_2;
                    stackOut_91_3 = stackIn_91_3;
                    stackOut_91_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_93_2 = stackOut_91_2;
                    stackIn_93_3 = stackOut_91_3;
                    stackIn_93_4 = stackOut_91_4;
                    break L29;
                  }
                }
                ((ma) (Object) stackIn_93_0).a(stackIn_93_1, stackIn_93_2, stackIn_93_3, stackIn_93_4, -87);
                break L28;
              } else {
                break L28;
              }
            }
            if (param0 < 17) {
              L30: {
                ((sl) this).field_Q = null;
                if (null == ((sl) this).field_Q) {
                  break L30;
                } else {
                  L31: {
                    stackOut_102_0 = ((sl) this).field_Q;
                    stackOut_102_1 = ((sl) this).field_Q.field_k;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    if (((sl) this).field_J) {
                      stackOut_104_0 = (ma) (Object) stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      stackIn_105_2 = stackOut_104_2;
                      break L31;
                    } else {
                      stackOut_103_0 = (ma) (Object) stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_105_2 = stackOut_103_2;
                      break L31;
                    }
                  }
                  ((ma) (Object) stackIn_105_0).a(stackIn_105_1, stackIn_105_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                  break L30;
                }
              }
              this.h(1);
              return;
            } else {
              L32: {
                if (null == ((sl) this).field_Q) {
                  break L32;
                } else {
                  L33: {
                    stackOut_96_0 = ((sl) this).field_Q;
                    stackOut_96_1 = ((sl) this).field_Q.field_k;
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_98_1 = stackOut_96_1;
                    stackIn_97_0 = stackOut_96_0;
                    stackIn_97_1 = stackOut_96_1;
                    if (((sl) this).field_J) {
                      stackOut_98_0 = (ma) (Object) stackIn_98_0;
                      stackOut_98_1 = stackIn_98_1;
                      stackOut_98_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                      stackIn_99_0 = stackOut_98_0;
                      stackIn_99_1 = stackOut_98_1;
                      stackIn_99_2 = stackOut_98_2;
                      break L33;
                    } else {
                      stackOut_97_0 = (ma) (Object) stackIn_97_0;
                      stackOut_97_1 = stackIn_97_1;
                      stackOut_97_2 = 0;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_99_1 = stackOut_97_1;
                      stackIn_99_2 = stackOut_97_2;
                      break L33;
                    }
                  }
                  ((ma) (Object) stackIn_99_0).a(stackIn_99_1, stackIn_99_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                  break L32;
                }
              }
              this.h(1);
              return;
            }
          }
        } else {
          L34: {
            var2 = 0;
            if (((sl) this).field_J) {
              stackOut_23_0 = 0;
              stackIn_25_0 = stackOut_23_0;
              break L34;
            } else {
              if (null != ((sl) this).field_Q) {
                stackOut_24_0 = ((sl) this).field_Q.field_k;
                stackIn_25_0 = stackOut_24_0;
                break L34;
              } else {
                L35: {
                  var3 = 0;
                  if (null != ((sl) this).field_O) {
                    stackOut_5_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                    stackIn_6_0 = stackOut_5_0;
                    break L35;
                  } else {
                    stackOut_4_0 = ((sl) this).field_v;
                    stackIn_6_0 = stackOut_4_0;
                    break L35;
                  }
                }
                L36: {
                  var4 = stackIn_6_0;
                  if (((sl) this).field_Q != null) {
                    stackOut_8_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                    stackIn_9_0 = stackOut_8_0;
                    break L36;
                  } else {
                    stackOut_7_0 = ((sl) this).field_k;
                    stackIn_9_0 = stackOut_7_0;
                    break L36;
                  }
                }
                L37: {
                  var5 = stackIn_9_0;
                  ((sl) this).field_P.a(var5, var3, var4, var2, -101);
                  if (null != ((sl) this).field_O) {
                    L38: {
                      stackOut_11_0 = ((sl) this).field_O;
                      stackOut_11_1 = ((sl) this).field_P.field_k;
                      stackOut_11_2 = ((sl) this).field_P.field_j;
                      stackOut_11_3 = ((sl) this).field_O.field_v;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      stackIn_12_2 = stackOut_11_2;
                      stackIn_12_3 = stackOut_11_3;
                      if (!((sl) this).field_U) {
                        stackOut_13_0 = (ma) (Object) stackIn_13_0;
                        stackOut_13_1 = stackIn_13_1;
                        stackOut_13_2 = stackIn_13_2;
                        stackOut_13_3 = stackIn_13_3;
                        stackOut_13_4 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        stackIn_14_3 = stackOut_13_3;
                        stackIn_14_4 = stackOut_13_4;
                        break L38;
                      } else {
                        stackOut_12_0 = (ma) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = stackIn_12_2;
                        stackOut_12_3 = stackIn_12_3;
                        stackOut_12_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        stackIn_14_3 = stackOut_12_3;
                        stackIn_14_4 = stackOut_12_4;
                        break L38;
                      }
                    }
                    ((ma) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_14_3, stackIn_14_4, -87);
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L39: {
                  if (param0 >= 17) {
                    break L39;
                  } else {
                    ((sl) this).field_Q = null;
                    break L39;
                  }
                }
                L40: {
                  if (null == ((sl) this).field_Q) {
                    break L40;
                  } else {
                    L41: {
                      stackOut_18_0 = ((sl) this).field_Q;
                      stackOut_18_1 = ((sl) this).field_Q.field_k;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      if (((sl) this).field_J) {
                        stackOut_20_0 = (ma) (Object) stackIn_20_0;
                        stackOut_20_1 = stackIn_20_1;
                        stackOut_20_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        break L41;
                      } else {
                        stackOut_19_0 = (ma) (Object) stackIn_19_0;
                        stackOut_19_1 = stackIn_19_1;
                        stackOut_19_2 = 0;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        break L41;
                      }
                    }
                    ((ma) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_21_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                    break L40;
                  }
                }
                this.h(1);
                return;
              }
            }
          }
          L42: {
            var3 = stackIn_25_0;
            if (null != ((sl) this).field_O) {
              stackOut_27_0 = -((sl) this).field_O.field_v + ((sl) this).field_v;
              stackIn_28_0 = stackOut_27_0;
              break L42;
            } else {
              stackOut_26_0 = ((sl) this).field_v;
              stackIn_28_0 = stackOut_26_0;
              break L42;
            }
          }
          L43: {
            var4 = stackIn_28_0;
            if (((sl) this).field_Q != null) {
              stackOut_30_0 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
              stackIn_31_0 = stackOut_30_0;
              break L43;
            } else {
              stackOut_29_0 = ((sl) this).field_k;
              stackIn_31_0 = stackOut_29_0;
              break L43;
            }
          }
          L44: {
            var5 = stackIn_31_0;
            ((sl) this).field_P.a(var5, var3, var4, var2, -101);
            if (null != ((sl) this).field_O) {
              L45: {
                stackOut_33_0 = ((sl) this).field_O;
                stackOut_33_1 = ((sl) this).field_P.field_k;
                stackOut_33_2 = ((sl) this).field_P.field_j;
                stackOut_33_3 = ((sl) this).field_O.field_v;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                stackIn_35_2 = stackOut_33_2;
                stackIn_35_3 = stackOut_33_3;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                stackIn_34_2 = stackOut_33_2;
                stackIn_34_3 = stackOut_33_3;
                if (!((sl) this).field_U) {
                  stackOut_35_0 = (ma) (Object) stackIn_35_0;
                  stackOut_35_1 = stackIn_35_1;
                  stackOut_35_2 = stackIn_35_2;
                  stackOut_35_3 = stackIn_35_3;
                  stackOut_35_4 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  stackIn_36_2 = stackOut_35_2;
                  stackIn_36_3 = stackOut_35_3;
                  stackIn_36_4 = stackOut_35_4;
                  break L45;
                } else {
                  stackOut_34_0 = (ma) (Object) stackIn_34_0;
                  stackOut_34_1 = stackIn_34_1;
                  stackOut_34_2 = stackIn_34_2;
                  stackOut_34_3 = stackIn_34_3;
                  stackOut_34_4 = -((sl) this).field_O.field_v + ((sl) this).field_v;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  stackIn_36_2 = stackOut_34_2;
                  stackIn_36_3 = stackOut_34_3;
                  stackIn_36_4 = stackOut_34_4;
                  break L45;
                }
              }
              ((ma) (Object) stackIn_36_0).a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4, -87);
              break L44;
            } else {
              break L44;
            }
          }
          if (param0 < 17) {
            L46: {
              ((sl) this).field_Q = null;
              if (null == ((sl) this).field_Q) {
                break L46;
              } else {
                L47: {
                  stackOut_45_0 = ((sl) this).field_Q;
                  stackOut_45_1 = ((sl) this).field_Q.field_k;
                  stackIn_47_0 = stackOut_45_0;
                  stackIn_47_1 = stackOut_45_1;
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  if (((sl) this).field_J) {
                    stackOut_47_0 = (ma) (Object) stackIn_47_0;
                    stackOut_47_1 = stackIn_47_1;
                    stackOut_47_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                    stackIn_48_0 = stackOut_47_0;
                    stackIn_48_1 = stackOut_47_1;
                    stackIn_48_2 = stackOut_47_2;
                    break L47;
                  } else {
                    stackOut_46_0 = (ma) (Object) stackIn_46_0;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = 0;
                    stackIn_48_0 = stackOut_46_0;
                    stackIn_48_1 = stackOut_46_1;
                    stackIn_48_2 = stackOut_46_2;
                    break L47;
                  }
                }
                ((ma) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                break L46;
              }
            }
            this.h(1);
            return;
          } else {
            L48: {
              if (null == ((sl) this).field_Q) {
                break L48;
              } else {
                L49: {
                  stackOut_39_0 = ((sl) this).field_Q;
                  stackOut_39_1 = ((sl) this).field_Q.field_k;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  if (((sl) this).field_J) {
                    stackOut_41_0 = (ma) (Object) stackIn_41_0;
                    stackOut_41_1 = stackIn_41_1;
                    stackOut_41_2 = -((sl) this).field_Q.field_k + ((sl) this).field_k;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    break L49;
                  } else {
                    stackOut_40_0 = (ma) (Object) stackIn_40_0;
                    stackOut_40_1 = stackIn_40_1;
                    stackOut_40_2 = 0;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    stackIn_42_2 = stackOut_40_2;
                    break L49;
                  }
                }
                ((ma) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, ((sl) this).field_P.field_v, ((sl) this).field_P.field_n, -107);
                break L48;
              }
            }
            this.h(1);
            return;
          }
        }
    }

    public static void g(int param0) {
        field_S = null;
        field_R = null;
        field_M = null;
        field_H = null;
        if (param0 < 111) {
          sl.g(37);
          field_K = null;
          field_V = null;
          field_N = null;
          return;
        } else {
          field_K = null;
          field_V = null;
          field_N = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[4];
        field_R = "Try again";
        field_M = "Provides you with a respawn point if you die";
        field_I = 2;
        field_N = "Drawn";
        field_V = new int[8192];
        field_K = "New Game";
    }
}
