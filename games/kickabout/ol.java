/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Frame;

final class ol extends hs {
    private boolean field_t;
    private int field_B;
    private int field_mb;
    tf field_bb;
    static String field_n;
    private int[] field_hb;
    private int[] field_J;
    private int field_G;
    private int field_cb;
    private int field_lb;
    private String[][] field_w;
    private int field_P;
    private int field_j;
    static String field_E;
    private int field_X;
    private int field_L;
    private int field_Y;
    private int[] field_l;
    private tf field_gb;
    private boolean field_K;
    private boolean field_U;
    private int field_ib;
    private int[] field_m;
    int[] field_k;
    private int field_kb;
    private int field_S;
    int[] field_u;
    private boolean field_C;
    private int field_V;
    private boolean field_N;
    private kq[] field_o;
    private boolean field_F;
    private int field_A;
    private int[][] field_O;
    private int field_Q;
    private int field_eb;
    private int field_M;
    private int field_r;
    private int field_v;
    private hd[] field_s;
    private int field_H;
    private int field_db;
    private int field_x;
    private String[] field_I;
    static boolean field_R;
    private boolean field_D;
    static int field_z;
    private boolean field_y;
    private int field_jb;
    private String field_Z;
    private boolean field_W;
    private ut[] field_fb;
    private int field_T;
    tf field_q;
    int[][] field_p;
    int[][] field_ab;

    private final boolean b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        up var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -109) {
                break L1;
              } else {
                int discarded$2 = this.a((tf) null, -84, -44, false);
                break L1;
              }
            }
            if (0 <= ((ol) this).field_g) {
              if (!((ol) this).field_a.field_e) {
                var2_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_int >= 4) {
                        break L4;
                      } else {
                        stackOut_12_0 = ~((ol) this).field_hb[var2_int];
                        stackIn_32_0 = stackOut_12_0;
                        stackIn_13_0 = stackOut_12_0;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_13_0 == 0) {
                              break L5;
                            } else {
                              var3 = tu.field_E.field_i[((ol) this).field_hb[var2_int]];
                              if (100 > var3.field_r) {
                                break L5;
                              } else {
                                L6: {
                                  if (var3.field_n < 100) {
                                    break L6;
                                  } else {
                                    if (100 > var3.field_g) {
                                      break L6;
                                    } else {
                                      if (var3.field_o < 100) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                                stackOut_28_0 = 1;
                                stackIn_29_0 = stackOut_28_0;
                                return stackIn_29_0 != 0;
                              }
                            }
                          }
                          var2_int++;
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    break L3;
                  }
                  break L0;
                }
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ol.I(" + param0 + ')');
        }
        return stackIn_32_0 != 0;
    }

    private final void i(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gt var10 = null;
        tf var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        cn stackIn_2_0 = null;
        String stackIn_2_1 = null;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        cn stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        cn stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        cn stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        cn stackIn_8_0 = null;
        String stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        cn stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        cn stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        cn stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        cn stackIn_14_0 = null;
        String stackIn_14_1 = null;
        int stackIn_14_2 = 0;
        int stackIn_14_3 = 0;
        cn stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_15_2 = 0;
        int stackIn_15_3 = 0;
        int stackIn_15_4 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        int stackIn_69_4 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        int stackIn_70_4 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        int stackIn_72_4 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        int stackIn_74_4 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        int stackIn_75_4 = 0;
        int stackIn_75_5 = 0;
        cn stackIn_77_0 = null;
        String stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        cn stackIn_78_0 = null;
        String stackIn_78_1 = null;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        cn stackIn_80_0 = null;
        String stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        cn stackIn_82_0 = null;
        String stackIn_82_1 = null;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        cn stackIn_83_0 = null;
        String stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        int stackIn_83_4 = 0;
        cn stackIn_84_0 = null;
        String stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        cn stackIn_85_0 = null;
        String stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        cn stackIn_87_0 = null;
        String stackIn_87_1 = null;
        int stackIn_87_2 = 0;
        int stackIn_87_3 = 0;
        cn stackIn_89_0 = null;
        String stackIn_89_1 = null;
        int stackIn_89_2 = 0;
        int stackIn_89_3 = 0;
        cn stackIn_90_0 = null;
        String stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_97_2 = 0;
        int stackIn_97_3 = 0;
        int stackIn_97_4 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_99_3 = 0;
        int stackIn_99_4 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackIn_100_3 = 0;
        int stackIn_100_4 = 0;
        int stackIn_100_5 = 0;
        cn stackIn_101_0 = null;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        cn stackIn_103_0 = null;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        cn stackIn_104_0 = null;
        String stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_109_3 = 0;
        int stackIn_109_4 = 0;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int stackIn_111_3 = 0;
        int stackIn_111_4 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_112_2 = 0;
        int stackIn_112_3 = 0;
        int stackIn_112_4 = 0;
        int stackIn_112_5 = 0;
        cn stackIn_113_0 = null;
        String stackIn_113_1 = null;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        cn stackIn_115_0 = null;
        String stackIn_115_1 = null;
        int stackIn_115_2 = 0;
        int stackIn_115_3 = 0;
        cn stackIn_116_0 = null;
        String stackIn_116_1 = null;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        int stackIn_119_4 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        int stackIn_121_4 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        int stackIn_123_4 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        int stackIn_124_3 = 0;
        int stackIn_124_4 = 0;
        int stackIn_124_5 = 0;
        cn stackIn_125_0 = null;
        String stackIn_125_1 = null;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        cn stackIn_126_0 = null;
        String stackIn_126_1 = null;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        cn stackIn_128_0 = null;
        String stackIn_128_1 = null;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        cn stackIn_130_0 = null;
        String stackIn_130_1 = null;
        int stackIn_130_2 = 0;
        int stackIn_130_3 = 0;
        cn stackIn_131_0 = null;
        String stackIn_131_1 = null;
        int stackIn_131_2 = 0;
        int stackIn_131_3 = 0;
        int stackIn_131_4 = 0;
        cn stackIn_132_0 = null;
        String stackIn_132_1 = null;
        int stackIn_132_2 = 0;
        int stackIn_132_3 = 0;
        cn stackIn_133_0 = null;
        String stackIn_133_1 = null;
        int stackIn_133_2 = 0;
        int stackIn_133_3 = 0;
        cn stackIn_135_0 = null;
        String stackIn_135_1 = null;
        int stackIn_135_2 = 0;
        int stackIn_135_3 = 0;
        cn stackIn_137_0 = null;
        String stackIn_137_1 = null;
        int stackIn_137_2 = 0;
        int stackIn_137_3 = 0;
        cn stackIn_138_0 = null;
        String stackIn_138_1 = null;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        int stackIn_138_4 = 0;
        int stackIn_145_0 = 0;
        int stackIn_145_1 = 0;
        int stackIn_145_2 = 0;
        int stackIn_145_3 = 0;
        int stackIn_145_4 = 0;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        int stackIn_147_2 = 0;
        int stackIn_147_3 = 0;
        int stackIn_147_4 = 0;
        int stackIn_148_0 = 0;
        int stackIn_148_1 = 0;
        int stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        int stackIn_148_4 = 0;
        int stackIn_148_5 = 0;
        cn stackIn_149_0 = null;
        String stackIn_149_1 = null;
        int stackIn_149_2 = 0;
        int stackIn_149_3 = 0;
        cn stackIn_151_0 = null;
        String stackIn_151_1 = null;
        int stackIn_151_2 = 0;
        int stackIn_151_3 = 0;
        cn stackIn_152_0 = null;
        String stackIn_152_1 = null;
        int stackIn_152_2 = 0;
        int stackIn_152_3 = 0;
        int stackIn_152_4 = 0;
        int stackIn_155_0 = 0;
        int stackIn_155_1 = 0;
        int stackIn_155_2 = 0;
        int stackIn_155_3 = 0;
        int stackIn_155_4 = 0;
        int stackIn_157_0 = 0;
        int stackIn_157_1 = 0;
        int stackIn_157_2 = 0;
        int stackIn_157_3 = 0;
        int stackIn_157_4 = 0;
        int stackIn_159_0 = 0;
        int stackIn_159_1 = 0;
        int stackIn_159_2 = 0;
        int stackIn_159_3 = 0;
        int stackIn_159_4 = 0;
        int stackIn_160_0 = 0;
        int stackIn_160_1 = 0;
        int stackIn_160_2 = 0;
        int stackIn_160_3 = 0;
        int stackIn_160_4 = 0;
        int stackIn_160_5 = 0;
        cn stackIn_161_0 = null;
        String stackIn_161_1 = null;
        int stackIn_161_2 = 0;
        int stackIn_161_3 = 0;
        cn stackIn_163_0 = null;
        String stackIn_163_1 = null;
        int stackIn_163_2 = 0;
        int stackIn_163_3 = 0;
        cn stackIn_164_0 = null;
        String stackIn_164_1 = null;
        int stackIn_164_2 = 0;
        int stackIn_164_3 = 0;
        int stackIn_164_4 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        cn stackOut_1_0 = null;
        String stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        cn stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        cn stackOut_7_0 = null;
        String stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        cn stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        cn stackOut_2_0 = null;
        String stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        cn stackOut_8_0 = null;
        String stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        cn stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        cn stackOut_14_0 = null;
        String stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        int stackOut_14_3 = 0;
        int stackOut_14_4 = 0;
        cn stackOut_12_0 = null;
        String stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        int stackOut_12_4 = 0;
        cn stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        int stackOut_9_4 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        int stackOut_68_4 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        int stackOut_74_4 = 0;
        int stackOut_74_5 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        int stackOut_72_4 = 0;
        int stackOut_72_5 = 0;
        cn stackOut_76_0 = null;
        String stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        cn stackOut_77_0 = null;
        String stackOut_77_1 = null;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        cn stackOut_78_0 = null;
        String stackOut_78_1 = null;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        cn stackOut_80_0 = null;
        String stackOut_80_1 = null;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        cn stackOut_82_0 = null;
        String stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        int stackOut_82_4 = 0;
        cn stackOut_83_0 = null;
        String stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        cn stackOut_84_0 = null;
        String stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        cn stackOut_85_0 = null;
        String stackOut_85_1 = null;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        cn stackOut_87_0 = null;
        String stackOut_87_1 = null;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        int stackOut_87_4 = 0;
        cn stackOut_89_0 = null;
        String stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        int stackOut_96_3 = 0;
        int stackOut_96_4 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        int stackOut_99_3 = 0;
        int stackOut_99_4 = 0;
        int stackOut_99_5 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_97_3 = 0;
        int stackOut_97_4 = 0;
        int stackOut_97_5 = 0;
        cn stackOut_100_0 = null;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        cn stackOut_103_0 = null;
        String stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        cn stackOut_101_0 = null;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_101_4 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int stackOut_108_4 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_111_2 = 0;
        int stackOut_111_3 = 0;
        int stackOut_111_4 = 0;
        int stackOut_111_5 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        int stackOut_109_4 = 0;
        int stackOut_109_5 = 0;
        cn stackOut_112_0 = null;
        String stackOut_112_1 = null;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        cn stackOut_115_0 = null;
        String stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        cn stackOut_113_0 = null;
        String stackOut_113_1 = null;
        int stackOut_113_2 = 0;
        int stackOut_113_3 = 0;
        int stackOut_113_4 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_118_4 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        int stackOut_123_4 = 0;
        int stackOut_123_5 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_119_4 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        int stackOut_121_4 = 0;
        int stackOut_121_5 = 0;
        cn stackOut_124_0 = null;
        String stackOut_124_1 = null;
        int stackOut_124_2 = 0;
        int stackOut_124_3 = 0;
        cn stackOut_125_0 = null;
        String stackOut_125_1 = null;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        cn stackOut_130_0 = null;
        String stackOut_130_1 = null;
        int stackOut_130_2 = 0;
        int stackOut_130_3 = 0;
        int stackOut_130_4 = 0;
        cn stackOut_126_0 = null;
        String stackOut_126_1 = null;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        cn stackOut_128_0 = null;
        String stackOut_128_1 = null;
        int stackOut_128_2 = 0;
        int stackOut_128_3 = 0;
        int stackOut_128_4 = 0;
        cn stackOut_131_0 = null;
        String stackOut_131_1 = null;
        int stackOut_131_2 = 0;
        int stackOut_131_3 = 0;
        cn stackOut_132_0 = null;
        String stackOut_132_1 = null;
        int stackOut_132_2 = 0;
        int stackOut_132_3 = 0;
        cn stackOut_137_0 = null;
        String stackOut_137_1 = null;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        int stackOut_137_4 = 0;
        cn stackOut_133_0 = null;
        String stackOut_133_1 = null;
        int stackOut_133_2 = 0;
        int stackOut_133_3 = 0;
        cn stackOut_135_0 = null;
        String stackOut_135_1 = null;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        int stackOut_135_4 = 0;
        int stackOut_144_0 = 0;
        int stackOut_144_1 = 0;
        int stackOut_144_2 = 0;
        int stackOut_144_3 = 0;
        int stackOut_144_4 = 0;
        int stackOut_147_0 = 0;
        int stackOut_147_1 = 0;
        int stackOut_147_2 = 0;
        int stackOut_147_3 = 0;
        int stackOut_147_4 = 0;
        int stackOut_147_5 = 0;
        int stackOut_145_0 = 0;
        int stackOut_145_1 = 0;
        int stackOut_145_2 = 0;
        int stackOut_145_3 = 0;
        int stackOut_145_4 = 0;
        int stackOut_145_5 = 0;
        cn stackOut_148_0 = null;
        String stackOut_148_1 = null;
        int stackOut_148_2 = 0;
        int stackOut_148_3 = 0;
        cn stackOut_151_0 = null;
        String stackOut_151_1 = null;
        int stackOut_151_2 = 0;
        int stackOut_151_3 = 0;
        int stackOut_151_4 = 0;
        cn stackOut_149_0 = null;
        String stackOut_149_1 = null;
        int stackOut_149_2 = 0;
        int stackOut_149_3 = 0;
        int stackOut_149_4 = 0;
        int stackOut_154_0 = 0;
        int stackOut_154_1 = 0;
        int stackOut_154_2 = 0;
        int stackOut_154_3 = 0;
        int stackOut_154_4 = 0;
        int stackOut_159_0 = 0;
        int stackOut_159_1 = 0;
        int stackOut_159_2 = 0;
        int stackOut_159_3 = 0;
        int stackOut_159_4 = 0;
        int stackOut_159_5 = 0;
        int stackOut_155_0 = 0;
        int stackOut_155_1 = 0;
        int stackOut_155_2 = 0;
        int stackOut_155_3 = 0;
        int stackOut_155_4 = 0;
        int stackOut_157_0 = 0;
        int stackOut_157_1 = 0;
        int stackOut_157_2 = 0;
        int stackOut_157_3 = 0;
        int stackOut_157_4 = 0;
        int stackOut_157_5 = 0;
        cn stackOut_160_0 = null;
        String stackOut_160_1 = null;
        int stackOut_160_2 = 0;
        int stackOut_160_3 = 0;
        cn stackOut_163_0 = null;
        String stackOut_163_1 = null;
        int stackOut_163_2 = 0;
        int stackOut_163_3 = 0;
        int stackOut_163_4 = 0;
        cn stackOut_161_0 = null;
        String stackOut_161_1 = null;
        int stackOut_161_2 = 0;
        int stackOut_161_3 = 0;
        int stackOut_161_4 = 0;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              on.a(22, 95, 596, 225, 10, 0, 96);
              pt.a(618, param0 ^ -16754303, 22, 305, 110);
              var2_int = ((ol) this).field_ib;
              un.field_d.d("<u=FFFFFF>" + dw.field_b.toUpperCase() + "</u>", 320 + var2_int, 125 + ((ol) this).field_Q, 16777215, -1);
              un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 140, ((ol) this).field_Q + 130, 16777215, -1);
              un.field_d.d(nu.field_a.toUpperCase(), 500 - -var2_int, ((ol) this).field_Q + 130, 16777215, -1);
              var3 = ((ol) this).field_Q + 140;
              var4 = 360 + var2_int;
              st.b(var4, param0 ^ 16777113, var3);
              jk.a(param0);
              var5 = ((ol) this).field_u[((ol) this).field_h];
              var6 = ((ol) this).field_u[1 + -((ol) this).field_h];
              stackOut_1_0 = un.field_d;
              stackOut_1_1 = vo.a((byte) -18, ei.field_c, new String[1]);
              stackOut_1_2 = -40 + var4;
              stackOut_1_3 = var3 - -46;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_4_2 = stackOut_1_2;
              stackIn_4_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (~var6 <= ~var5) {
                stackOut_4_0 = (cn) (Object) stackIn_4_0;
                stackOut_4_1 = (String) (Object) stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = stackIn_4_3;
                stackIn_7_0 = stackOut_4_0;
                stackIn_7_1 = stackOut_4_1;
                stackIn_7_2 = stackOut_4_2;
                stackIn_7_3 = stackOut_4_3;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                stackIn_5_3 = stackOut_4_3;
                if (var5 >= var6) {
                  stackOut_7_0 = (cn) (Object) stackIn_7_0;
                  stackOut_7_1 = (String) (Object) stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = 255;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  break L1;
                } else {
                  stackOut_5_0 = (cn) (Object) stackIn_5_0;
                  stackOut_5_1 = (String) (Object) stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = stackIn_5_3;
                  stackOut_5_4 = 16711680;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_8_1 = stackOut_5_1;
                  stackIn_8_2 = stackOut_5_2;
                  stackIn_8_3 = stackOut_5_3;
                  stackIn_8_4 = stackOut_5_4;
                  break L1;
                }
              } else {
                stackOut_2_0 = (cn) (Object) stackIn_2_0;
                stackOut_2_1 = (String) (Object) stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 65280;
                stackIn_8_0 = stackOut_2_0;
                stackIn_8_1 = stackOut_2_1;
                stackIn_8_2 = stackOut_2_2;
                stackIn_8_3 = stackOut_2_3;
                stackIn_8_4 = stackOut_2_4;
                break L1;
              }
            }
            L2: {
              ((cn) (Object) stackIn_8_0).d(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, -1);
              stackOut_8_0 = un.field_d;
              stackOut_8_1 = vo.a((byte) -18, ei.field_c, new String[1]);
              stackOut_8_2 = var4 - 40;
              stackOut_8_3 = 87 + var3;
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              stackIn_11_3 = stackOut_8_3;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              if (var5 >= var6) {
                stackOut_11_0 = (cn) (Object) stackIn_11_0;
                stackOut_11_1 = (String) (Object) stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = stackIn_11_3;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_14_2 = stackOut_11_2;
                stackIn_14_3 = stackOut_11_3;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                if (~var6 > ~var5) {
                  stackOut_14_0 = (cn) (Object) stackIn_14_0;
                  stackOut_14_1 = (String) (Object) stackIn_14_1;
                  stackOut_14_2 = stackIn_14_2;
                  stackOut_14_3 = stackIn_14_3;
                  stackOut_14_4 = 16711680;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  stackIn_15_3 = stackOut_14_3;
                  stackIn_15_4 = stackOut_14_4;
                  break L2;
                } else {
                  stackOut_12_0 = (cn) (Object) stackIn_12_0;
                  stackOut_12_1 = (String) (Object) stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = stackIn_12_3;
                  stackOut_12_4 = 255;
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  stackIn_15_3 = stackOut_12_3;
                  stackIn_15_4 = stackOut_12_4;
                  break L2;
                }
              } else {
                stackOut_9_0 = (cn) (Object) stackIn_9_0;
                stackOut_9_1 = (String) (Object) stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = stackIn_9_3;
                stackOut_9_4 = 65280;
                stackIn_15_0 = stackOut_9_0;
                stackIn_15_1 = stackOut_9_1;
                stackIn_15_2 = stackOut_9_2;
                stackIn_15_3 = stackOut_9_3;
                stackIn_15_4 = stackOut_9_4;
                break L2;
              }
            }
            ((cn) (Object) stackIn_15_0).d(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, -1);
            var7 = var2_int + 60;
            var8 = ((ol) this).field_Q + 140;
            pt.a(160 + var7, -22914, var7, var8 - -21, var8);
            on.i(var7, var8, 160, 42, 10, 65793);
            un.field_d.d(ib.field_H, 80 + var7, 17 + var8, 16777215, -1);
            ta.e(124);
            var8 += 40;
            var9 = 0;
            L3: while (true) {
              L4: {
                L5: {
                  L6: {
                    L7: {
                      if (var9 >= ((ol) this).field_a.field_g.length) {
                        break L7;
                      } else {
                        stackOut_17_0 = 0;
                        stackOut_17_1 = ((ol) this).field_a.field_g[var9].field_p;
                        stackIn_34_0 = stackOut_17_0;
                        stackIn_34_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (var15 != 0) {
                          L8: while (true) {
                            if (stackIn_34_0 <= stackIn_34_1) {
                              break L5;
                            } else {
                              on.c(var7, var9 + (4 + (var8 + -21)), 160, 65793, -(var9 << -86451773) + 128);
                              on.c(160 + var7 - -2, 4 + var8 - (21 + -var9), 40, 65793, -(var9 << 521151011) + 128);
                              var9++;
                              if (var15 != 0) {
                                break L4;
                              } else {
                                if (var15 == 0) {
                                  stackOut_33_0 = 16;
                                  stackOut_33_1 = var9;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  continue L8;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_18_0 == stackIn_18_1) {
                                break L10;
                              } else {
                                if (var15 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              var10 = ((ol) this).field_a.field_R[var9];
                              var11 = var10.field_v ? 1 : 0;
                              if (var11 != 0) {
                                stackOut_27_0 = 11184810;
                                stackIn_28_0 = stackOut_27_0;
                                break L11;
                              } else {
                                stackOut_25_0 = 16777215;
                                stackIn_28_0 = stackOut_25_0;
                                break L11;
                              }
                            }
                            L12: {
                              var12 = stackIn_28_0;
                              var13 = 65793;
                              var14 = 128;
                              if (~var9 != ~((ol) this).field_g) {
                                break L12;
                              } else {
                                var13 = 16777215;
                                var14 = 50;
                                break L12;
                              }
                            }
                            on.a(var7, -17 + var8, 160, 21, var13, var14);
                            un.field_d.d(((ol) this).field_a.field_S[var9], var7 + 80, var8, var12, -1);
                            on.a(2 + var7 + 160, -17 + var8, 40, 21, var13, var14);
                            un.field_d.d(vo.a((byte) -18, ei.field_c, new String[1]), 160 + (var7 + 22), var8, var12, -1);
                            var8 += 23;
                            break L9;
                          }
                          var9++;
                          if (var15 == 0) {
                            continue L3;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    var9 = 0;
                    L13: while (true) {
                      stackOut_33_0 = 16;
                      stackOut_33_1 = var9;
                      stackIn_34_0 = stackOut_33_0;
                      stackIn_34_1 = stackOut_33_1;
                      if (stackIn_34_0 <= stackIn_34_1) {
                        break L5;
                      } else {
                        on.c(var7, var9 + (4 + (var8 + -21)), 160, 65793, -(var9 << -86451773) + 128);
                        on.c(160 + var7 - -2, 4 + var8 - (21 + -var9), 40, 65793, -(var9 << 521151011) + 128);
                        var9++;
                        if (var15 != 0) {
                          break L4;
                        } else {
                          if (var15 == 0) {
                            continue L13;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  break L5;
                }
                var8 = 140 - -((ol) this).field_Q;
                var7 = var2_int + 420;
                pt.a(var7 - -160, param0 + -16800129, var7, var8 - -21, var8);
                on.i(var7, var8, 160, 42, 10, 65793);
                un.field_d.d(ib.field_H, var7 - -80, var8 - -17, 16777215, -1);
                ta.e(117);
                var8 += 40;
                break L4;
              }
              var9 = 0;
              L14: while (true) {
                L15: {
                  L16: {
                    L17: {
                      L18: {
                        if (~((ol) this).field_a.field_g.length >= ~var9) {
                          break L18;
                        } else {
                          stackOut_44_0 = -2;
                          stackOut_44_1 = ~((ol) this).field_a.field_g[var9].field_p;
                          stackIn_61_0 = stackOut_44_0;
                          stackIn_61_1 = stackOut_44_1;
                          stackIn_45_0 = stackOut_44_0;
                          stackIn_45_1 = stackOut_44_1;
                          if (var15 != 0) {
                            L19: while (true) {
                              if (stackIn_61_0 >= stackIn_61_1) {
                                break L16;
                              } else {
                                on.c(var7, var9 + -17 + var8, 160, 65793, 128 + -(var9 << -1085460061));
                                on.c(-42 + var7, var9 + -21 + (var8 - -4), 40, 65793, -(var9 << -440106333) + 128);
                                var9++;
                                if (var15 != 0) {
                                  break L15;
                                } else {
                                  if (var15 == 0) {
                                    stackOut_60_0 = var9;
                                    stackOut_60_1 = 16;
                                    stackIn_61_0 = stackOut_60_0;
                                    stackIn_61_1 = stackOut_60_1;
                                    continue L19;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          } else {
                            L20: {
                              L21: {
                                if (stackIn_45_0 == stackIn_45_1) {
                                  break L21;
                                } else {
                                  if (var15 == 0) {
                                    break L20;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                              L22: {
                                var10 = ((ol) this).field_a.field_R[var9];
                                var11 = var10.field_v ? 1 : 0;
                                if (var11 != 0) {
                                  stackOut_54_0 = 11184810;
                                  stackIn_55_0 = stackOut_54_0;
                                  break L22;
                                } else {
                                  stackOut_52_0 = 16777215;
                                  stackIn_55_0 = stackOut_52_0;
                                  break L22;
                                }
                              }
                              L23: {
                                var12 = stackIn_55_0;
                                var13 = 65793;
                                var14 = 128;
                                if (~var9 != ~((ol) this).field_g) {
                                  break L23;
                                } else {
                                  var13 = 16777215;
                                  var14 = 50;
                                  break L23;
                                }
                              }
                              on.a(var7, var8 + -17, 160, 21, var13, var14);
                              un.field_d.d(((ol) this).field_a.field_S[var9], var7 - -80, var8, var12, -1);
                              on.a(var7 - 42, var8 - 17, 40, 21, var13, var14);
                              un.field_d.d(vo.a((byte) -18, ei.field_c, new String[1]), -22 + var7, var8, var12, -1);
                              var8 += 23;
                              break L20;
                            }
                            var9++;
                            if (var15 == 0) {
                              continue L14;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                      var9 = 0;
                      L24: while (true) {
                        stackOut_60_0 = var9;
                        stackOut_60_1 = 16;
                        stackIn_61_0 = stackOut_60_0;
                        stackIn_61_1 = stackOut_60_1;
                        if (stackIn_61_0 >= stackIn_61_1) {
                          break L16;
                        } else {
                          on.c(var7, var9 + -17 + var8, 160, 65793, 128 + -(var9 << -1085460061));
                          on.c(-42 + var7, var9 + -21 + (var8 - -4), 40, 65793, -(var9 << -440106333) + 128);
                          var9++;
                          if (var15 != 0) {
                            break L15;
                          } else {
                            if (var15 == 0) {
                              continue L24;
                            } else {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    break L16;
                  }
                  L25: {
                    L26: {
                      stackOut_68_0 = ((ol) this).field_eb;
                      stackOut_68_1 = ((ol) this).field_db;
                      stackOut_68_2 = 32;
                      stackOut_68_3 = 195;
                      stackOut_68_4 = 8;
                      stackIn_72_0 = stackOut_68_0;
                      stackIn_72_1 = stackOut_68_1;
                      stackIn_72_2 = stackOut_68_2;
                      stackIn_72_3 = stackOut_68_3;
                      stackIn_72_4 = stackOut_68_4;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      stackIn_69_4 = stackOut_68_4;
                      if (((ol) this).field_K) {
                        break L26;
                      } else {
                        stackOut_69_0 = stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = stackIn_69_2;
                        stackOut_69_3 = stackIn_69_3;
                        stackOut_69_4 = stackIn_69_4;
                        stackIn_74_0 = stackOut_69_0;
                        stackIn_74_1 = stackOut_69_1;
                        stackIn_74_2 = stackOut_69_2;
                        stackIn_74_3 = stackOut_69_3;
                        stackIn_74_4 = stackOut_69_4;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        stackIn_70_3 = stackOut_69_3;
                        stackIn_70_4 = stackOut_69_4;
                        if (!((ol) this).field_W) {
                          stackOut_74_0 = stackIn_74_0;
                          stackOut_74_1 = stackIn_74_1;
                          stackOut_74_2 = stackIn_74_2;
                          stackOut_74_3 = stackIn_74_3;
                          stackOut_74_4 = stackIn_74_4;
                          stackOut_74_5 = ((ol) this).field_cb;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          stackIn_75_2 = stackOut_74_2;
                          stackIn_75_3 = stackOut_74_3;
                          stackIn_75_4 = stackOut_74_4;
                          stackIn_75_5 = stackOut_74_5;
                          break L25;
                        } else {
                          stackOut_70_0 = stackIn_70_0;
                          stackOut_70_1 = stackIn_70_1;
                          stackOut_70_2 = stackIn_70_2;
                          stackOut_70_3 = stackIn_70_3;
                          stackOut_70_4 = stackIn_70_4;
                          stackIn_72_0 = stackOut_70_0;
                          stackIn_72_1 = stackOut_70_1;
                          stackIn_72_2 = stackOut_70_2;
                          stackIn_72_3 = stackOut_70_3;
                          stackIn_72_4 = stackOut_70_4;
                          break L26;
                        }
                      }
                    }
                    stackOut_72_0 = stackIn_72_0;
                    stackOut_72_1 = stackIn_72_1;
                    stackOut_72_2 = stackIn_72_2;
                    stackOut_72_3 = stackIn_72_3;
                    stackOut_72_4 = stackIn_72_4;
                    stackOut_72_5 = 11184810;
                    stackIn_75_0 = stackOut_72_0;
                    stackIn_75_1 = stackOut_72_1;
                    stackIn_75_2 = stackOut_72_2;
                    stackIn_75_3 = stackOut_72_3;
                    stackIn_75_4 = stackOut_72_4;
                    stackIn_75_5 = stackOut_72_5;
                    break L25;
                  }
                  on.a(stackIn_75_0, stackIn_75_1, stackIn_75_2, stackIn_75_3, stackIn_75_4, stackIn_75_5, 128);
                  break L15;
                }
                L27: {
                  L28: {
                    stackOut_76_0 = un.field_d;
                    stackOut_76_1 = qb.field_Vb;
                    stackOut_76_2 = ((ol) this).field_eb + 14;
                    stackOut_76_3 = ((ol) this).field_db + 97 - -(un.field_d.a(qb.field_Vb) >> 2904033);
                    stackIn_82_0 = stackOut_76_0;
                    stackIn_82_1 = stackOut_76_1;
                    stackIn_82_2 = stackOut_76_2;
                    stackIn_82_3 = stackOut_76_3;
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    stackIn_77_2 = stackOut_76_2;
                    stackIn_77_3 = stackOut_76_3;
                    if (((ol) this).field_K) {
                      break L28;
                    } else {
                      stackOut_77_0 = (cn) (Object) stackIn_77_0;
                      stackOut_77_1 = (String) (Object) stackIn_77_1;
                      stackOut_77_2 = stackIn_77_2;
                      stackOut_77_3 = stackIn_77_3;
                      stackIn_82_0 = stackOut_77_0;
                      stackIn_82_1 = stackOut_77_1;
                      stackIn_82_2 = stackOut_77_2;
                      stackIn_82_3 = stackOut_77_3;
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      stackIn_78_2 = stackOut_77_2;
                      stackIn_78_3 = stackOut_77_3;
                      if (((ol) this).field_W) {
                        break L28;
                      } else {
                        stackOut_78_0 = (cn) (Object) stackIn_78_0;
                        stackOut_78_1 = (String) (Object) stackIn_78_1;
                        stackOut_78_2 = stackIn_78_2;
                        stackOut_78_3 = stackIn_78_3;
                        stackIn_80_0 = stackOut_78_0;
                        stackIn_80_1 = stackOut_78_1;
                        stackIn_80_2 = stackOut_78_2;
                        stackIn_80_3 = stackOut_78_3;
                        stackOut_80_0 = (cn) (Object) stackIn_80_0;
                        stackOut_80_1 = (String) (Object) stackIn_80_1;
                        stackOut_80_2 = stackIn_80_2;
                        stackOut_80_3 = stackIn_80_3;
                        stackOut_80_4 = 11184810;
                        stackIn_83_0 = stackOut_80_0;
                        stackIn_83_1 = stackOut_80_1;
                        stackIn_83_2 = stackOut_80_2;
                        stackIn_83_3 = stackOut_80_3;
                        stackIn_83_4 = stackOut_80_4;
                        break L27;
                      }
                    }
                  }
                  stackOut_82_0 = (cn) (Object) stackIn_82_0;
                  stackOut_82_1 = (String) (Object) stackIn_82_1;
                  stackOut_82_2 = stackIn_82_2;
                  stackOut_82_3 = stackIn_82_3;
                  stackOut_82_4 = 65793;
                  stackIn_83_0 = stackOut_82_0;
                  stackIn_83_1 = stackOut_82_1;
                  stackIn_83_2 = stackOut_82_2;
                  stackIn_83_3 = stackOut_82_3;
                  stackIn_83_4 = stackOut_82_4;
                  break L27;
                }
                L29: {
                  L30: {
                    ((cn) (Object) stackIn_83_0).b(stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4, -1);
                    var2_int += 596;
                    stackOut_83_0 = un.field_d;
                    stackOut_83_1 = dw.field_b;
                    stackOut_83_2 = ((ol) this).field_eb - -29;
                    stackOut_83_3 = 97 + ((ol) this).field_db + (un.field_d.a(dw.field_b) >> 481548161);
                    stackIn_89_0 = stackOut_83_0;
                    stackIn_89_1 = stackOut_83_1;
                    stackIn_89_2 = stackOut_83_2;
                    stackIn_89_3 = stackOut_83_3;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    stackIn_84_2 = stackOut_83_2;
                    stackIn_84_3 = stackOut_83_3;
                    if (((ol) this).field_K) {
                      break L30;
                    } else {
                      stackOut_84_0 = (cn) (Object) stackIn_84_0;
                      stackOut_84_1 = (String) (Object) stackIn_84_1;
                      stackOut_84_2 = stackIn_84_2;
                      stackOut_84_3 = stackIn_84_3;
                      stackIn_89_0 = stackOut_84_0;
                      stackIn_89_1 = stackOut_84_1;
                      stackIn_89_2 = stackOut_84_2;
                      stackIn_89_3 = stackOut_84_3;
                      stackIn_85_0 = stackOut_84_0;
                      stackIn_85_1 = stackOut_84_1;
                      stackIn_85_2 = stackOut_84_2;
                      stackIn_85_3 = stackOut_84_3;
                      if (((ol) this).field_W) {
                        break L30;
                      } else {
                        stackOut_85_0 = (cn) (Object) stackIn_85_0;
                        stackOut_85_1 = (String) (Object) stackIn_85_1;
                        stackOut_85_2 = stackIn_85_2;
                        stackOut_85_3 = stackIn_85_3;
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_87_1 = stackOut_85_1;
                        stackIn_87_2 = stackOut_85_2;
                        stackIn_87_3 = stackOut_85_3;
                        stackOut_87_0 = (cn) (Object) stackIn_87_0;
                        stackOut_87_1 = (String) (Object) stackIn_87_1;
                        stackOut_87_2 = stackIn_87_2;
                        stackOut_87_3 = stackIn_87_3;
                        stackOut_87_4 = 11184810;
                        stackIn_90_0 = stackOut_87_0;
                        stackIn_90_1 = stackOut_87_1;
                        stackIn_90_2 = stackOut_87_2;
                        stackIn_90_3 = stackOut_87_3;
                        stackIn_90_4 = stackOut_87_4;
                        break L29;
                      }
                    }
                  }
                  stackOut_89_0 = (cn) (Object) stackIn_89_0;
                  stackOut_89_1 = (String) (Object) stackIn_89_1;
                  stackOut_89_2 = stackIn_89_2;
                  stackOut_89_3 = stackIn_89_3;
                  stackOut_89_4 = 65793;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  stackIn_90_2 = stackOut_89_2;
                  stackIn_90_3 = stackOut_89_3;
                  stackIn_90_4 = stackOut_89_4;
                  break L29;
                }
                L31: {
                  ((cn) (Object) stackIn_90_0).b(stackIn_90_1, stackIn_90_2, stackIn_90_3, stackIn_90_4, -1);
                  var9 = ((ol) this).field_Q;
                  un.field_d.d("<u=FFFFFF>" + qb.field_Vb.toUpperCase() + "</u>", 320 + var2_int, 125 + var9, 16777215, -1);
                  var9 += 160;
                  on.a(var2_int + 42, var9 + -20, 552, 28, 10, 65793, 128);
                  un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 320, var9, param0, -1);
                  var9 += 20;
                  var10_ref = ((ol) this).field_bb;
                  var9 = this.a(var10_ref, var2_int, var9, true);
                  var9 += 35;
                  on.a(42 + var2_int, var9 - 20, 552, 28, 10, 65793, 128);
                  un.field_d.d(nu.field_a.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                  var10_ref = ((ol) this).field_q;
                  var9 += 20;
                  var9 = this.a(var10_ref, var2_int, var9, true);
                  if (((ol) this).field_P == 0) {
                    break L31;
                  } else {
                    if (((ol) this).field_M > ((ol) this).field_P) {
                      L32: {
                        ta.e(param0 + -16777091);
                        pt.a(618, -22914, 22, 320, 110);
                        stackOut_96_0 = ((ol) this).field_x;
                        stackOut_96_1 = ((ol) this).field_B;
                        stackOut_96_2 = 570;
                        stackOut_96_3 = 24;
                        stackOut_96_4 = 8;
                        stackIn_99_0 = stackOut_96_0;
                        stackIn_99_1 = stackOut_96_1;
                        stackIn_99_2 = stackOut_96_2;
                        stackIn_99_3 = stackOut_96_3;
                        stackIn_99_4 = stackOut_96_4;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        stackIn_97_2 = stackOut_96_2;
                        stackIn_97_3 = stackOut_96_3;
                        stackIn_97_4 = stackOut_96_4;
                        if (((ol) this).field_y) {
                          stackOut_99_0 = stackIn_99_0;
                          stackOut_99_1 = stackIn_99_1;
                          stackOut_99_2 = stackIn_99_2;
                          stackOut_99_3 = stackIn_99_3;
                          stackOut_99_4 = stackIn_99_4;
                          stackOut_99_5 = 11184810;
                          stackIn_100_0 = stackOut_99_0;
                          stackIn_100_1 = stackOut_99_1;
                          stackIn_100_2 = stackOut_99_2;
                          stackIn_100_3 = stackOut_99_3;
                          stackIn_100_4 = stackOut_99_4;
                          stackIn_100_5 = stackOut_99_5;
                          break L32;
                        } else {
                          stackOut_97_0 = stackIn_97_0;
                          stackOut_97_1 = stackIn_97_1;
                          stackOut_97_2 = stackIn_97_2;
                          stackOut_97_3 = stackIn_97_3;
                          stackOut_97_4 = stackIn_97_4;
                          stackOut_97_5 = ((ol) this).field_cb;
                          stackIn_100_0 = stackOut_97_0;
                          stackIn_100_1 = stackOut_97_1;
                          stackIn_100_2 = stackOut_97_2;
                          stackIn_100_3 = stackOut_97_3;
                          stackIn_100_4 = stackOut_97_4;
                          stackIn_100_5 = stackOut_97_5;
                          break L32;
                        }
                      }
                      L33: {
                        on.a(stackIn_100_0, stackIn_100_1, stackIn_100_2, stackIn_100_3, stackIn_100_4, stackIn_100_5, 128);
                        stackOut_100_0 = un.field_d;
                        stackOut_100_1 = qt.field_h;
                        stackOut_100_2 = ((ol) this).field_x + 285;
                        stackOut_100_3 = ((ol) this).field_B - -12;
                        stackIn_103_0 = stackOut_100_0;
                        stackIn_103_1 = stackOut_100_1;
                        stackIn_103_2 = stackOut_100_2;
                        stackIn_103_3 = stackOut_100_3;
                        stackIn_101_0 = stackOut_100_0;
                        stackIn_101_1 = stackOut_100_1;
                        stackIn_101_2 = stackOut_100_2;
                        stackIn_101_3 = stackOut_100_3;
                        if (((ol) this).field_y) {
                          stackOut_103_0 = (cn) (Object) stackIn_103_0;
                          stackOut_103_1 = (String) (Object) stackIn_103_1;
                          stackOut_103_2 = stackIn_103_2;
                          stackOut_103_3 = stackIn_103_3;
                          stackOut_103_4 = 65793;
                          stackIn_104_0 = stackOut_103_0;
                          stackIn_104_1 = stackOut_103_1;
                          stackIn_104_2 = stackOut_103_2;
                          stackIn_104_3 = stackOut_103_3;
                          stackIn_104_4 = stackOut_103_4;
                          break L33;
                        } else {
                          stackOut_101_0 = (cn) (Object) stackIn_101_0;
                          stackOut_101_1 = (String) (Object) stackIn_101_1;
                          stackOut_101_2 = stackIn_101_2;
                          stackOut_101_3 = stackIn_101_3;
                          stackOut_101_4 = 11184810;
                          stackIn_104_0 = stackOut_101_0;
                          stackIn_104_1 = stackOut_101_1;
                          stackIn_104_2 = stackOut_101_2;
                          stackIn_104_3 = stackOut_101_3;
                          stackIn_104_4 = stackOut_101_4;
                          break L33;
                        }
                      }
                      ((cn) (Object) stackIn_104_0).d(stackIn_104_1, stackIn_104_2, stackIn_104_3, stackIn_104_4, -1);
                      ta.e(param0 + -16777088);
                      pt.a(618, -22914, 22, 305, 110);
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                }
                L34: {
                  if (((ol) this).field_M != 0) {
                    L35: {
                      ta.e(119);
                      pt.a(618, -22914, 22, 320, 95);
                      stackOut_108_0 = ((ol) this).field_T;
                      stackOut_108_1 = ((ol) this).field_kb;
                      stackOut_108_2 = 570;
                      stackOut_108_3 = 24;
                      stackOut_108_4 = 8;
                      stackIn_111_0 = stackOut_108_0;
                      stackIn_111_1 = stackOut_108_1;
                      stackIn_111_2 = stackOut_108_2;
                      stackIn_111_3 = stackOut_108_3;
                      stackIn_111_4 = stackOut_108_4;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      stackIn_109_2 = stackOut_108_2;
                      stackIn_109_3 = stackOut_108_3;
                      stackIn_109_4 = stackOut_108_4;
                      if (((ol) this).field_F) {
                        stackOut_111_0 = stackIn_111_0;
                        stackOut_111_1 = stackIn_111_1;
                        stackOut_111_2 = stackIn_111_2;
                        stackOut_111_3 = stackIn_111_3;
                        stackOut_111_4 = stackIn_111_4;
                        stackOut_111_5 = 11184810;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        stackIn_112_2 = stackOut_111_2;
                        stackIn_112_3 = stackOut_111_3;
                        stackIn_112_4 = stackOut_111_4;
                        stackIn_112_5 = stackOut_111_5;
                        break L35;
                      } else {
                        stackOut_109_0 = stackIn_109_0;
                        stackOut_109_1 = stackIn_109_1;
                        stackOut_109_2 = stackIn_109_2;
                        stackOut_109_3 = stackIn_109_3;
                        stackOut_109_4 = stackIn_109_4;
                        stackOut_109_5 = ((ol) this).field_cb;
                        stackIn_112_0 = stackOut_109_0;
                        stackIn_112_1 = stackOut_109_1;
                        stackIn_112_2 = stackOut_109_2;
                        stackIn_112_3 = stackOut_109_3;
                        stackIn_112_4 = stackOut_109_4;
                        stackIn_112_5 = stackOut_109_5;
                        break L35;
                      }
                    }
                    L36: {
                      on.a(stackIn_112_0, stackIn_112_1, stackIn_112_2, stackIn_112_3, stackIn_112_4, stackIn_112_5, 128);
                      stackOut_112_0 = un.field_d;
                      stackOut_112_1 = gu.field_Ib;
                      stackOut_112_2 = ((ol) this).field_T + 285;
                      stackOut_112_3 = ((ol) this).field_kb - -24 + -1;
                      stackIn_115_0 = stackOut_112_0;
                      stackIn_115_1 = stackOut_112_1;
                      stackIn_115_2 = stackOut_112_2;
                      stackIn_115_3 = stackOut_112_3;
                      stackIn_113_0 = stackOut_112_0;
                      stackIn_113_1 = stackOut_112_1;
                      stackIn_113_2 = stackOut_112_2;
                      stackIn_113_3 = stackOut_112_3;
                      if (((ol) this).field_F) {
                        stackOut_115_0 = (cn) (Object) stackIn_115_0;
                        stackOut_115_1 = (String) (Object) stackIn_115_1;
                        stackOut_115_2 = stackIn_115_2;
                        stackOut_115_3 = stackIn_115_3;
                        stackOut_115_4 = 65793;
                        stackIn_116_0 = stackOut_115_0;
                        stackIn_116_1 = stackOut_115_1;
                        stackIn_116_2 = stackOut_115_2;
                        stackIn_116_3 = stackOut_115_3;
                        stackIn_116_4 = stackOut_115_4;
                        break L36;
                      } else {
                        stackOut_113_0 = (cn) (Object) stackIn_113_0;
                        stackOut_113_1 = (String) (Object) stackIn_113_1;
                        stackOut_113_2 = stackIn_113_2;
                        stackOut_113_3 = stackIn_113_3;
                        stackOut_113_4 = 11184810;
                        stackIn_116_0 = stackOut_113_0;
                        stackIn_116_1 = stackOut_113_1;
                        stackIn_116_2 = stackOut_113_2;
                        stackIn_116_3 = stackOut_113_3;
                        stackIn_116_4 = stackOut_113_4;
                        break L36;
                      }
                    }
                    ((cn) (Object) stackIn_116_0).d(stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_116_4, -1);
                    ta.e(127);
                    pt.a(618, -22914, 22, 305, 110);
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L37: {
                  L38: {
                    stackOut_117_0 = ((ol) this).field_L;
                    stackOut_117_1 = ((ol) this).field_r;
                    stackOut_117_2 = 32;
                    stackOut_117_3 = 195;
                    stackOut_117_4 = 8;
                    stackIn_121_0 = stackOut_117_0;
                    stackIn_121_1 = stackOut_117_1;
                    stackIn_121_2 = stackOut_117_2;
                    stackIn_121_3 = stackOut_117_3;
                    stackIn_121_4 = stackOut_117_4;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    stackIn_118_3 = stackOut_117_3;
                    stackIn_118_4 = stackOut_117_4;
                    if (((ol) this).field_C) {
                      break L38;
                    } else {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = stackIn_118_1;
                      stackOut_118_2 = stackIn_118_2;
                      stackOut_118_3 = stackIn_118_3;
                      stackOut_118_4 = stackIn_118_4;
                      stackIn_123_0 = stackOut_118_0;
                      stackIn_123_1 = stackOut_118_1;
                      stackIn_123_2 = stackOut_118_2;
                      stackIn_123_3 = stackOut_118_3;
                      stackIn_123_4 = stackOut_118_4;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      stackIn_119_2 = stackOut_118_2;
                      stackIn_119_3 = stackOut_118_3;
                      stackIn_119_4 = stackOut_118_4;
                      if (!((ol) this).field_D) {
                        stackOut_123_0 = stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = stackIn_123_2;
                        stackOut_123_3 = stackIn_123_3;
                        stackOut_123_4 = stackIn_123_4;
                        stackOut_123_5 = ((ol) this).field_cb;
                        stackIn_124_0 = stackOut_123_0;
                        stackIn_124_1 = stackOut_123_1;
                        stackIn_124_2 = stackOut_123_2;
                        stackIn_124_3 = stackOut_123_3;
                        stackIn_124_4 = stackOut_123_4;
                        stackIn_124_5 = stackOut_123_5;
                        break L37;
                      } else {
                        stackOut_119_0 = stackIn_119_0;
                        stackOut_119_1 = stackIn_119_1;
                        stackOut_119_2 = stackIn_119_2;
                        stackOut_119_3 = stackIn_119_3;
                        stackOut_119_4 = stackIn_119_4;
                        stackIn_121_0 = stackOut_119_0;
                        stackIn_121_1 = stackOut_119_1;
                        stackIn_121_2 = stackOut_119_2;
                        stackIn_121_3 = stackOut_119_3;
                        stackIn_121_4 = stackOut_119_4;
                        break L38;
                      }
                    }
                  }
                  stackOut_121_0 = stackIn_121_0;
                  stackOut_121_1 = stackIn_121_1;
                  stackOut_121_2 = stackIn_121_2;
                  stackOut_121_3 = stackIn_121_3;
                  stackOut_121_4 = stackIn_121_4;
                  stackOut_121_5 = 11184810;
                  stackIn_124_0 = stackOut_121_0;
                  stackIn_124_1 = stackOut_121_1;
                  stackIn_124_2 = stackOut_121_2;
                  stackIn_124_3 = stackOut_121_3;
                  stackIn_124_4 = stackOut_121_4;
                  stackIn_124_5 = stackOut_121_5;
                  break L37;
                }
                L39: {
                  L40: {
                    on.a(stackIn_124_0, stackIn_124_1, stackIn_124_2, stackIn_124_3, stackIn_124_4, stackIn_124_5, 128);
                    stackOut_124_0 = un.field_d;
                    stackOut_124_1 = rd.field_d;
                    stackOut_124_2 = ((ol) this).field_L + 14;
                    stackOut_124_3 = ((ol) this).field_r - (-97 - (un.field_d.a(rd.field_d) >> 134543201));
                    stackIn_128_0 = stackOut_124_0;
                    stackIn_128_1 = stackOut_124_1;
                    stackIn_128_2 = stackOut_124_2;
                    stackIn_128_3 = stackOut_124_3;
                    stackIn_125_0 = stackOut_124_0;
                    stackIn_125_1 = stackOut_124_1;
                    stackIn_125_2 = stackOut_124_2;
                    stackIn_125_3 = stackOut_124_3;
                    if (((ol) this).field_C) {
                      break L40;
                    } else {
                      stackOut_125_0 = (cn) (Object) stackIn_125_0;
                      stackOut_125_1 = (String) (Object) stackIn_125_1;
                      stackOut_125_2 = stackIn_125_2;
                      stackOut_125_3 = stackIn_125_3;
                      stackIn_130_0 = stackOut_125_0;
                      stackIn_130_1 = stackOut_125_1;
                      stackIn_130_2 = stackOut_125_2;
                      stackIn_130_3 = stackOut_125_3;
                      stackIn_126_0 = stackOut_125_0;
                      stackIn_126_1 = stackOut_125_1;
                      stackIn_126_2 = stackOut_125_2;
                      stackIn_126_3 = stackOut_125_3;
                      if (!((ol) this).field_D) {
                        stackOut_130_0 = (cn) (Object) stackIn_130_0;
                        stackOut_130_1 = (String) (Object) stackIn_130_1;
                        stackOut_130_2 = stackIn_130_2;
                        stackOut_130_3 = stackIn_130_3;
                        stackOut_130_4 = 11184810;
                        stackIn_131_0 = stackOut_130_0;
                        stackIn_131_1 = stackOut_130_1;
                        stackIn_131_2 = stackOut_130_2;
                        stackIn_131_3 = stackOut_130_3;
                        stackIn_131_4 = stackOut_130_4;
                        break L39;
                      } else {
                        stackOut_126_0 = (cn) (Object) stackIn_126_0;
                        stackOut_126_1 = (String) (Object) stackIn_126_1;
                        stackOut_126_2 = stackIn_126_2;
                        stackOut_126_3 = stackIn_126_3;
                        stackIn_128_0 = stackOut_126_0;
                        stackIn_128_1 = stackOut_126_1;
                        stackIn_128_2 = stackOut_126_2;
                        stackIn_128_3 = stackOut_126_3;
                        break L40;
                      }
                    }
                  }
                  stackOut_128_0 = (cn) (Object) stackIn_128_0;
                  stackOut_128_1 = (String) (Object) stackIn_128_1;
                  stackOut_128_2 = stackIn_128_2;
                  stackOut_128_3 = stackIn_128_3;
                  stackOut_128_4 = 65793;
                  stackIn_131_0 = stackOut_128_0;
                  stackIn_131_1 = stackOut_128_1;
                  stackIn_131_2 = stackOut_128_2;
                  stackIn_131_3 = stackOut_128_3;
                  stackIn_131_4 = stackOut_128_4;
                  break L39;
                }
                L41: {
                  L42: {
                    ((cn) (Object) stackIn_131_0).b(stackIn_131_1, stackIn_131_2, stackIn_131_3, stackIn_131_4, -1);
                    var2_int += 596;
                    stackOut_131_0 = un.field_d;
                    stackOut_131_1 = qb.field_Vb;
                    stackOut_131_2 = 29 + ((ol) this).field_L;
                    stackOut_131_3 = ((ol) this).field_r + (97 - -(un.field_d.a(qb.field_Vb) >> -1823210079));
                    stackIn_135_0 = stackOut_131_0;
                    stackIn_135_1 = stackOut_131_1;
                    stackIn_135_2 = stackOut_131_2;
                    stackIn_135_3 = stackOut_131_3;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    stackIn_132_2 = stackOut_131_2;
                    stackIn_132_3 = stackOut_131_3;
                    if (((ol) this).field_C) {
                      break L42;
                    } else {
                      stackOut_132_0 = (cn) (Object) stackIn_132_0;
                      stackOut_132_1 = (String) (Object) stackIn_132_1;
                      stackOut_132_2 = stackIn_132_2;
                      stackOut_132_3 = stackIn_132_3;
                      stackIn_137_0 = stackOut_132_0;
                      stackIn_137_1 = stackOut_132_1;
                      stackIn_137_2 = stackOut_132_2;
                      stackIn_137_3 = stackOut_132_3;
                      stackIn_133_0 = stackOut_132_0;
                      stackIn_133_1 = stackOut_132_1;
                      stackIn_133_2 = stackOut_132_2;
                      stackIn_133_3 = stackOut_132_3;
                      if (!((ol) this).field_D) {
                        stackOut_137_0 = (cn) (Object) stackIn_137_0;
                        stackOut_137_1 = (String) (Object) stackIn_137_1;
                        stackOut_137_2 = stackIn_137_2;
                        stackOut_137_3 = stackIn_137_3;
                        stackOut_137_4 = 11184810;
                        stackIn_138_0 = stackOut_137_0;
                        stackIn_138_1 = stackOut_137_1;
                        stackIn_138_2 = stackOut_137_2;
                        stackIn_138_3 = stackOut_137_3;
                        stackIn_138_4 = stackOut_137_4;
                        break L41;
                      } else {
                        stackOut_133_0 = (cn) (Object) stackIn_133_0;
                        stackOut_133_1 = (String) (Object) stackIn_133_1;
                        stackOut_133_2 = stackIn_133_2;
                        stackOut_133_3 = stackIn_133_3;
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_135_1 = stackOut_133_1;
                        stackIn_135_2 = stackOut_133_2;
                        stackIn_135_3 = stackOut_133_3;
                        break L42;
                      }
                    }
                  }
                  stackOut_135_0 = (cn) (Object) stackIn_135_0;
                  stackOut_135_1 = (String) (Object) stackIn_135_1;
                  stackOut_135_2 = stackIn_135_2;
                  stackOut_135_3 = stackIn_135_3;
                  stackOut_135_4 = 65793;
                  stackIn_138_0 = stackOut_135_0;
                  stackIn_138_1 = stackOut_135_1;
                  stackIn_138_2 = stackOut_135_2;
                  stackIn_138_3 = stackOut_135_3;
                  stackIn_138_4 = stackOut_135_4;
                  break L41;
                }
                L43: {
                  ((cn) (Object) stackIn_138_0).b(stackIn_138_1, stackIn_138_2, stackIn_138_3, stackIn_138_4, -1);
                  var9 = ((ol) this).field_Q;
                  un.field_d.d("<u=FFFFFF>" + rd.field_d.toUpperCase() + "</u>", 320 - -var2_int, 125 - -((ol) this).field_Q, 16777215, -1);
                  var9 += 160;
                  on.a(42 - -var2_int, -20 + var9, 552, 28, 10, 65793, 128);
                  un.field_d.d(lw.field_f.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                  var11 = var2_int - -240;
                  var12 = 80 + var9;
                  int discarded$2 = eo.a(var11, var12, qe.field_j, ((ol) this).field_p, (String[]) null, 160, 21, ((ol) this).field_a.field_I, ((ol) this).field_a.field_S, ((ol) this).field_g);
                  var9 = var9 + (140 + 25 * (((ol) this).field_a.field_I - -1));
                  on.a(var2_int + 42, -20 + var9, 552, 28, 10, 65793, 128);
                  var12 = var9 + 80;
                  un.field_d.d(ad.field_b.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                  int discarded$3 = eo.a(var11, var12, d.field_c, ((ol) this).field_ab, (String[]) null, 160, 21, ((ol) this).field_a.field_I, ((ol) this).field_a.field_S, ((ol) this).field_g);
                  var9 = var9 + ((1 + ((ol) this).field_a.field_I) * 25 + 140);
                  if (((ol) this).field_lb == 0) {
                    break L43;
                  } else {
                    if (((ol) this).field_lb < ((ol) this).field_M) {
                      L44: {
                        ta.e(122);
                        pt.a(618, param0 ^ -16754303, 22, 320, 110);
                        stackOut_144_0 = ((ol) this).field_H;
                        stackOut_144_1 = ((ol) this).field_jb;
                        stackOut_144_2 = 570;
                        stackOut_144_3 = 24;
                        stackOut_144_4 = 8;
                        stackIn_147_0 = stackOut_144_0;
                        stackIn_147_1 = stackOut_144_1;
                        stackIn_147_2 = stackOut_144_2;
                        stackIn_147_3 = stackOut_144_3;
                        stackIn_147_4 = stackOut_144_4;
                        stackIn_145_0 = stackOut_144_0;
                        stackIn_145_1 = stackOut_144_1;
                        stackIn_145_2 = stackOut_144_2;
                        stackIn_145_3 = stackOut_144_3;
                        stackIn_145_4 = stackOut_144_4;
                        if (!((ol) this).field_U) {
                          stackOut_147_0 = stackIn_147_0;
                          stackOut_147_1 = stackIn_147_1;
                          stackOut_147_2 = stackIn_147_2;
                          stackOut_147_3 = stackIn_147_3;
                          stackOut_147_4 = stackIn_147_4;
                          stackOut_147_5 = ((ol) this).field_cb;
                          stackIn_148_0 = stackOut_147_0;
                          stackIn_148_1 = stackOut_147_1;
                          stackIn_148_2 = stackOut_147_2;
                          stackIn_148_3 = stackOut_147_3;
                          stackIn_148_4 = stackOut_147_4;
                          stackIn_148_5 = stackOut_147_5;
                          break L44;
                        } else {
                          stackOut_145_0 = stackIn_145_0;
                          stackOut_145_1 = stackIn_145_1;
                          stackOut_145_2 = stackIn_145_2;
                          stackOut_145_3 = stackIn_145_3;
                          stackOut_145_4 = stackIn_145_4;
                          stackOut_145_5 = 11184810;
                          stackIn_148_0 = stackOut_145_0;
                          stackIn_148_1 = stackOut_145_1;
                          stackIn_148_2 = stackOut_145_2;
                          stackIn_148_3 = stackOut_145_3;
                          stackIn_148_4 = stackOut_145_4;
                          stackIn_148_5 = stackOut_145_5;
                          break L44;
                        }
                      }
                      L45: {
                        on.a(stackIn_148_0, stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_148_4, stackIn_148_5, 128);
                        stackOut_148_0 = un.field_d;
                        stackOut_148_1 = qt.field_h;
                        stackOut_148_2 = 285 + ((ol) this).field_H;
                        stackOut_148_3 = 12 + ((ol) this).field_jb;
                        stackIn_151_0 = stackOut_148_0;
                        stackIn_151_1 = stackOut_148_1;
                        stackIn_151_2 = stackOut_148_2;
                        stackIn_151_3 = stackOut_148_3;
                        stackIn_149_0 = stackOut_148_0;
                        stackIn_149_1 = stackOut_148_1;
                        stackIn_149_2 = stackOut_148_2;
                        stackIn_149_3 = stackOut_148_3;
                        if (((ol) this).field_U) {
                          stackOut_151_0 = (cn) (Object) stackIn_151_0;
                          stackOut_151_1 = (String) (Object) stackIn_151_1;
                          stackOut_151_2 = stackIn_151_2;
                          stackOut_151_3 = stackIn_151_3;
                          stackOut_151_4 = 65793;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          stackIn_152_2 = stackOut_151_2;
                          stackIn_152_3 = stackOut_151_3;
                          stackIn_152_4 = stackOut_151_4;
                          break L45;
                        } else {
                          stackOut_149_0 = (cn) (Object) stackIn_149_0;
                          stackOut_149_1 = (String) (Object) stackIn_149_1;
                          stackOut_149_2 = stackIn_149_2;
                          stackOut_149_3 = stackIn_149_3;
                          stackOut_149_4 = 11184810;
                          stackIn_152_0 = stackOut_149_0;
                          stackIn_152_1 = stackOut_149_1;
                          stackIn_152_2 = stackOut_149_2;
                          stackIn_152_3 = stackOut_149_3;
                          stackIn_152_4 = stackOut_149_4;
                          break L45;
                        }
                      }
                      ((cn) (Object) stackIn_152_0).d(stackIn_152_1, stackIn_152_2, stackIn_152_3, stackIn_152_4, -1);
                      ta.e(117);
                      pt.a(618, param0 ^ -16754303, 22, 305, 110);
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                }
                L46: {
                  if (((ol) this).field_M == 0) {
                    break L46;
                  } else {
                    L47: {
                      ta.e(param0 ^ 16777090);
                      pt.a(618, -22914, 22, 320, 95);
                      stackOut_154_0 = ((ol) this).field_v;
                      stackOut_154_1 = ((ol) this).field_A;
                      stackOut_154_2 = 570;
                      stackOut_154_3 = 24;
                      stackOut_154_4 = 8;
                      stackIn_159_0 = stackOut_154_0;
                      stackIn_159_1 = stackOut_154_1;
                      stackIn_159_2 = stackOut_154_2;
                      stackIn_159_3 = stackOut_154_3;
                      stackIn_159_4 = stackOut_154_4;
                      stackIn_155_0 = stackOut_154_0;
                      stackIn_155_1 = stackOut_154_1;
                      stackIn_155_2 = stackOut_154_2;
                      stackIn_155_3 = stackOut_154_3;
                      stackIn_155_4 = stackOut_154_4;
                      if (!((ol) this).field_t) {
                        stackOut_159_0 = stackIn_159_0;
                        stackOut_159_1 = stackIn_159_1;
                        stackOut_159_2 = stackIn_159_2;
                        stackOut_159_3 = stackIn_159_3;
                        stackOut_159_4 = stackIn_159_4;
                        stackOut_159_5 = ((ol) this).field_cb;
                        stackIn_160_0 = stackOut_159_0;
                        stackIn_160_1 = stackOut_159_1;
                        stackIn_160_2 = stackOut_159_2;
                        stackIn_160_3 = stackOut_159_3;
                        stackIn_160_4 = stackOut_159_4;
                        stackIn_160_5 = stackOut_159_5;
                        break L47;
                      } else {
                        stackOut_155_0 = stackIn_155_0;
                        stackOut_155_1 = stackIn_155_1;
                        stackOut_155_2 = stackIn_155_2;
                        stackOut_155_3 = stackIn_155_3;
                        stackOut_155_4 = stackIn_155_4;
                        stackIn_157_0 = stackOut_155_0;
                        stackIn_157_1 = stackOut_155_1;
                        stackIn_157_2 = stackOut_155_2;
                        stackIn_157_3 = stackOut_155_3;
                        stackIn_157_4 = stackOut_155_4;
                        stackOut_157_0 = stackIn_157_0;
                        stackOut_157_1 = stackIn_157_1;
                        stackOut_157_2 = stackIn_157_2;
                        stackOut_157_3 = stackIn_157_3;
                        stackOut_157_4 = stackIn_157_4;
                        stackOut_157_5 = 11184810;
                        stackIn_160_0 = stackOut_157_0;
                        stackIn_160_1 = stackOut_157_1;
                        stackIn_160_2 = stackOut_157_2;
                        stackIn_160_3 = stackOut_157_3;
                        stackIn_160_4 = stackOut_157_4;
                        stackIn_160_5 = stackOut_157_5;
                        break L47;
                      }
                    }
                    L48: {
                      on.a(stackIn_160_0, stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4, stackIn_160_5, 128);
                      stackOut_160_0 = un.field_d;
                      stackOut_160_1 = gu.field_Ib;
                      stackOut_160_2 = 285 + ((ol) this).field_v;
                      stackOut_160_3 = -1 + ((ol) this).field_A - -24;
                      stackIn_163_0 = stackOut_160_0;
                      stackIn_163_1 = stackOut_160_1;
                      stackIn_163_2 = stackOut_160_2;
                      stackIn_163_3 = stackOut_160_3;
                      stackIn_161_0 = stackOut_160_0;
                      stackIn_161_1 = stackOut_160_1;
                      stackIn_161_2 = stackOut_160_2;
                      stackIn_161_3 = stackOut_160_3;
                      if (!((ol) this).field_t) {
                        stackOut_163_0 = (cn) (Object) stackIn_163_0;
                        stackOut_163_1 = (String) (Object) stackIn_163_1;
                        stackOut_163_2 = stackIn_163_2;
                        stackOut_163_3 = stackIn_163_3;
                        stackOut_163_4 = 11184810;
                        stackIn_164_0 = stackOut_163_0;
                        stackIn_164_1 = stackOut_163_1;
                        stackIn_164_2 = stackOut_163_2;
                        stackIn_164_3 = stackOut_163_3;
                        stackIn_164_4 = stackOut_163_4;
                        break L48;
                      } else {
                        stackOut_161_0 = (cn) (Object) stackIn_161_0;
                        stackOut_161_1 = (String) (Object) stackIn_161_1;
                        stackOut_161_2 = stackIn_161_2;
                        stackOut_161_3 = stackIn_161_3;
                        stackOut_161_4 = 65793;
                        stackIn_164_0 = stackOut_161_0;
                        stackIn_164_1 = stackOut_161_1;
                        stackIn_164_2 = stackOut_161_2;
                        stackIn_164_3 = stackOut_161_3;
                        stackIn_164_4 = stackOut_161_4;
                        break L48;
                      }
                    }
                    ((cn) (Object) stackIn_164_0).d(stackIn_164_1, stackIn_164_2, stackIn_164_3, stackIn_164_4, -1);
                    ta.e(param0 + -16777089);
                    pt.a(618, param0 ^ -16754303, 22, 305, 110);
                    break L46;
                  }
                }
                ta.e(127);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ol.K(" + param0 + ')');
        }
    }

    final boolean e(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = ((ol) this).field_c[param0].field_m;
            if (param1 == 50) {
              if (((ol) this).field_g == -2) {
                if (!((ol) this).field_a.field_L) {
                  L1: {
                    L2: {
                      if (var3_int == 12) {
                        break L2;
                      } else {
                        if (56 != var3_int) {
                          stackOut_87_0 = 0;
                          stackIn_88_0 = stackOut_87_0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_85_0 = 1;
                    stackIn_88_0 = stackOut_85_0;
                    break L1;
                  }
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if (var3_int == 55) {
                        break L4;
                      } else {
                        if (56 != var3_int) {
                          stackOut_79_0 = 0;
                          stackIn_80_0 = stackOut_79_0;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackOut_77_0 = 1;
                    stackIn_80_0 = stackOut_77_0;
                    break L3;
                  }
                  return stackIn_80_0 != 0;
                }
              } else {
                if (((ol) this).field_a.field_L) {
                  L5: {
                    L6: {
                      if (var3_int == 55) {
                        break L6;
                      } else {
                        L7: {
                          if (((ol) this).field_a.field_e) {
                            break L7;
                          } else {
                            if (var3_int == 47) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        L8: {
                          if (((ol) this).field_a.field_e) {
                            break L8;
                          } else {
                            if (50 == var3_int) {
                              break L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if (!((ol) this).field_a.field_e) {
                            break L9;
                          } else {
                            if (56 == var3_int) {
                              break L6;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (44 != var3_int) {
                            break L10;
                          } else {
                            if (ok.field_a.a(false) <= 0) {
                              break L10;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackOut_68_0 = 0;
                        stackIn_69_0 = stackOut_68_0;
                        break L5;
                      }
                    }
                    stackOut_66_0 = 1;
                    stackIn_69_0 = stackOut_66_0;
                    break L5;
                  }
                  return stackIn_69_0 != 0;
                } else {
                  L11: {
                    L12: {
                      if (var3_int == 12) {
                        break L12;
                      } else {
                        L13: {
                          if (((ol) this).field_a.field_e) {
                            break L13;
                          } else {
                            if (47 == var3_int) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          if (((ol) this).field_a.field_e) {
                            break L14;
                          } else {
                            if (var3_int == 50) {
                              break L12;
                            } else {
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (!((ol) this).field_a.field_e) {
                            break L15;
                          } else {
                            if (var3_int == 56) {
                              break L12;
                            } else {
                              break L15;
                            }
                          }
                        }
                        if (var3_int == 11) {
                          break L12;
                        } else {
                          L16: {
                            if (44 != var3_int) {
                              break L16;
                            } else {
                              if (ok.field_a.a(false) <= 0) {
                                break L16;
                              } else {
                                break L12;
                              }
                            }
                          }
                          stackOut_39_0 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          break L11;
                        }
                      }
                    }
                    stackOut_37_0 = 1;
                    stackIn_40_0 = stackOut_37_0;
                    break L11;
                  }
                  return stackIn_40_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_88_0 != 0;
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        String var6_ref = null;
        up var7 = null;
        String var7_ref = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        StringBuilder stackIn_28_0 = null;
        StringBuilder stackIn_30_0 = null;
        StringBuilder stackIn_31_0 = null;
        String stackIn_31_1 = null;
        StringBuilder stackIn_32_0 = null;
        StringBuilder stackIn_34_0 = null;
        StringBuilder stackIn_35_0 = null;
        String stackIn_35_1 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        byte stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        StringBuilder stackOut_27_0 = null;
        StringBuilder stackOut_30_0 = null;
        String stackOut_30_1 = null;
        StringBuilder stackOut_28_0 = null;
        String stackOut_28_1 = null;
        StringBuilder stackOut_31_0 = null;
        StringBuilder stackOut_34_0 = null;
        String stackOut_34_1 = null;
        StringBuilder stackOut_32_0 = null;
        String stackOut_32_1 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var6_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6_int >= 4) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackOut_3_1 = ~((ol) this).field_hb[var6_int];
                    stackIn_25_0 = stackOut_3_0;
                    stackIn_25_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          break L4;
                        } else {
                          L5: {
                            var7 = ((ol) this).field_o[var6_int].field_Eb;
                            on.a(-30 + ((ol) this).field_o[var6_int].field_F, 92, 110, 180, 10, 0, 128);
                            ((ol) this).field_o[var6_int].h((byte) -116);
                            ((ol) this).field_s[var6_int].a(59, true);
                            if (var7.field_n < 100) {
                              break L5;
                            } else {
                              if (100 > var7.field_g) {
                                break L5;
                              } else {
                                if (100 > var7.field_o) {
                                  break L5;
                                } else {
                                  wq.a(-23 + ((ol) this).field_o[var6_int].field_F, param1, 150, (byte) 32, hv.field_b, 100);
                                  if (var10 == 0) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L6: {
                            var8 = Math.abs(((ol) this).field_j);
                            var8 = var8 | Math.abs(((ol) this).field_j) << -2037542264;
                            var8 = var8 | 16711680;
                            eo.a(((ol) this).field_o[var6_int].field_F - 25, ((ol) this).field_o[var6_int].field_T - -80, var7.field_r, 3, false, 0);
                            var9 = "";
                            if (((ol) this).field_l[var6_int] <= 0) {
                              break L6;
                            } else {
                              var9 = var9 + rg.field_d + "+" + ((ol) this).field_l[var6_int];
                              break L6;
                            }
                          }
                          L7: {
                            L8: {
                              if (var7.field_r < 100) {
                                break L8;
                              } else {
                                var9 = var9 + "<br>" + ss.field_e + "<col=" + Integer.toHexString(var8) + ">Max</col>";
                                if (var10 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var9 = var9 + "<br>" + ss.field_e + var7.field_r;
                            break L7;
                          }
                          wq.a(-30 + ((ol) this).field_o[var6_int].field_F, param1, 164, (byte) 32, var9, 110);
                          break L4;
                        }
                      }
                      var6_int++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                param4 += 6;
                on.b(159, param4 + 36, 159, 63 + param4, 4473924);
                on.b(160, param4 + 35, 160, 64 + param4, 11184810);
                on.b(161, 36 + param4, 161, param4 + 63, 4473924);
                on.b(469, 36 + param4, 469, param4 - -63, 4473924);
                on.b(470, param4 + 35, 470, param4 + 64, 11184810);
                on.b(471, param4 - -36, 471, 63 + param4, 4473924);
                on.b(33, param4 - -71, 602, param4 - -71, 4473924);
                on.b(32, 72 + param4, 603, param4 - -72, 11184810);
                on.b(33, 73 + param4, 602, 73 + param4, 4473924);
                stackOut_24_0 = param3;
                stackOut_24_1 = 119;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L2;
              }
              if (stackIn_25_0 == stackIn_25_1) {
                L9: {
                  wq.a(param2, param1, param4, (byte) 32, gn.field_c, param0);
                  var6_ref = pj.field_D + "+" + ad.a(((ol) this).field_G, 26300);
                  var6_ref = var6_ref + "<br>" + ss.field_e + ad.a(tu.field_E.field_x, 26300);
                  wq.a(25, param1, param4, (byte) 32, var6_ref, 140);
                  stackOut_27_0 = new StringBuilder().append(bt.field_c);
                  stackIn_30_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (((ol) this).field_Y > 0) {
                    stackOut_30_0 = (StringBuilder) (Object) stackIn_30_0;
                    stackOut_30_1 = "+";
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    break L9;
                  } else {
                    stackOut_28_0 = (StringBuilder) (Object) stackIn_28_0;
                    stackOut_28_1 = "";
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_31_1 = stackOut_28_1;
                    break L9;
                  }
                }
                L10: {
                  var7_ref = stackIn_31_1 + Integer.toString(((ol) this).field_Y);
                  stackOut_31_0 = new StringBuilder().append(var7_ref).append("<br>").append(ss.field_e);
                  stackIn_34_0 = stackOut_31_0;
                  stackIn_32_0 = stackOut_31_0;
                  if (tu.field_E.field_t == 6) {
                    stackOut_34_0 = (StringBuilder) (Object) stackIn_34_0;
                    stackOut_34_1 = Integer.toString(tu.field_E.field_r);
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L10;
                  } else {
                    stackOut_32_0 = (StringBuilder) (Object) stackIn_32_0;
                    stackOut_32_1 = Integer.toString(tu.field_E.field_E);
                    stackIn_35_0 = stackOut_32_0;
                    stackIn_35_1 = stackOut_32_1;
                    break L10;
                  }
                }
                var7_ref = stackIn_35_1;
                wq.a(475, param1, param4, (byte) 32, var7_ref, 135);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var6, "ol.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_94_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_93_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var4 = ne.field_G;
                if (var4[rb.field_Kb]) {
                  break L2;
                } else {
                  if (var4[98]) {
                    break L2;
                  } else {
                    if (param2 != 98) {
                      stackOut_9_0 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_7_0 = 1;
              stackIn_10_0 = stackOut_7_0;
              break L1;
            }
            L3: {
              L4: {
                var5 = stackIn_10_0;
                if (var4[uv.field_e]) {
                  break L4;
                } else {
                  if (var4[96]) {
                    break L4;
                  } else {
                    if (param2 != 96) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackOut_17_0 = 1;
              stackIn_20_0 = stackOut_17_0;
              break L3;
            }
            L5: {
              L6: {
                var6 = stackIn_20_0;
                if (var4[oc.field_e]) {
                  break L6;
                } else {
                  if (var4[99]) {
                    break L6;
                  } else {
                    if (param2 != 99) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              stackOut_27_0 = 1;
              stackIn_30_0 = stackOut_27_0;
              break L5;
            }
            L7: {
              L8: {
                var7 = stackIn_30_0;
                if (var4[pb.field_A]) {
                  break L8;
                } else {
                  if (var4[97]) {
                    break L8;
                  } else {
                    if (param2 != 97) {
                      stackOut_39_0 = 0;
                      stackIn_40_0 = stackOut_39_0;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              stackOut_37_0 = 1;
              stackIn_40_0 = stackOut_37_0;
              break L7;
            }
            L9: {
              L10: {
                var8 = stackIn_40_0;
                if (((ol) this).field_ib == 0) {
                  break L10;
                } else {
                  if (((ol) this).field_ib != -596) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (var8 != 0) {
                ((ol) this).field_X = ((ol) this).field_X - 596;
                stackOut_49_0 = 1;
                stackIn_50_0 = stackOut_49_0;
                return stackIn_50_0 != 0;
              } else {
                break L9;
              }
            }
            L11: {
              L12: {
                if (((ol) this).field_ib == -596) {
                  break L12;
                } else {
                  if (((ol) this).field_ib != -1192) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              if (var6 == 0) {
                break L11;
              } else {
                ((ol) this).field_X = ((ol) this).field_X + 596;
                stackOut_58_0 = 1;
                stackIn_59_0 = stackOut_58_0;
                return stackIn_59_0 != 0;
              }
            }
            L13: {
              if (((ol) this).field_P == 0) {
                break L13;
              } else {
                if (~((ol) this).field_M >= ~((ol) this).field_P) {
                  break L13;
                } else {
                  if (var7 == 0) {
                    break L13;
                  } else {
                    ((ol) this).field_M = ((ol) this).field_M - 32;
                    stackOut_67_0 = 1;
                    stackIn_68_0 = stackOut_67_0;
                    return stackIn_68_0 != 0;
                  }
                }
              }
            }
            L14: {
              if (((ol) this).field_M >= 0) {
                break L14;
              } else {
                if (var5 == 0) {
                  break L14;
                } else {
                  ((ol) this).field_M = ((ol) this).field_M + 32;
                  stackOut_73_0 = 1;
                  stackIn_74_0 = stackOut_73_0;
                  return stackIn_74_0 != 0;
                }
              }
            }
            L15: {
              if (0 == ((ol) this).field_lb) {
                break L15;
              } else {
                if (~((ol) this).field_M >= ~((ol) this).field_lb) {
                  break L15;
                } else {
                  if (var7 == 0) {
                    break L15;
                  } else {
                    ((ol) this).field_M = ((ol) this).field_M - 32;
                    stackOut_82_0 = 1;
                    stackIn_83_0 = stackOut_82_0;
                    return stackIn_83_0 != 0;
                  }
                }
              }
            }
            L16: {
              if (0 <= ((ol) this).field_M) {
                break L16;
              } else {
                if (var5 == 0) {
                  break L16;
                } else {
                  ((ol) this).field_M = ((ol) this).field_M + 32;
                  stackOut_88_0 = 1;
                  stackIn_89_0 = stackOut_88_0;
                  return stackIn_89_0 != 0;
                }
              }
            }
            L17: {
              if (param1 == 1670) {
                break L17;
              } else {
                ((ol) this).field_Y = 19;
                break L17;
              }
            }
            stackOut_93_0 = 0;
            stackIn_94_0 = stackOut_93_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4_ref, "ol.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_94_0 != 0;
    }

    final tf h(int param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        tf stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        tf stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param0 == -19510) {
              stackOut_3_0 = ((ol) this).field_gb;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ol.E(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    ol(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int var6_int = 0;
        it var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_64_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        String stackIn_89_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_20_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_75_0 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var10 = Kickabout.field_G;
        ((ol) this).field_cb = 65793;
        ((ol) this).field_kb = 83;
        ((ol) this).field_u = new int[2];
        ((ol) this).field_mb = 0;
        ((ol) this).field_B = 307;
        ((ol) this).field_db = 110;
        ((ol) this).field_V = 0;
        ((ol) this).field_r = 110;
        ((ol) this).field_jb = 307;
        ((ol) this).field_A = 83;
        ((ol) this).field_Q = 0;
        ((ol) this).field_S = 0;
        ((ol) this).field_M = ((ol) this).field_Q;
        ((ol) this).field_ib = 0;
        ((ol) this).field_H = 32 + (((ol) this).field_ib + 1192);
        ((ol) this).field_L = ((ol) this).field_ib - -596 + 600;
        ((ol) this).field_eb = 600 + ((ol) this).field_ib;
        ((ol) this).field_X = ((ol) this).field_ib;
        ((ol) this).field_x = 32 + ((ol) this).field_ib + 596;
        ((ol) this).field_T = 596 + (((ol) this).field_ib + 32);
        ((ol) this).field_v = ((ol) this).field_ib - -1192 - -32;
        ((ol) this).field_bb = new tf();
        ((ol) this).field_q = new tf();
        try {
          L0: {
            L1: {
              L2: {
                var4_array = new int[]{47, 56, 50, 44, 11, 12, 55};
                if (var4_array == null) {
                  break L2;
                } else {
                  var5 = 120;
                  ((ol) this).field_c = new io[var4_array.length];
                  var6_int = 0;
                  L3: while (true) {
                    L4: {
                      if (var6_int >= var4_array.length) {
                        break L4;
                      } else {
                        ((ol) this).field_c[var6_int] = new io(var5, 7126504, var4_array[var6_int]);
                        var6_int++;
                        if (var10 != 0) {
                          break L1;
                        } else {
                          if (var10 == 0) {
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    ((ol) this).a(-26254);
                    break L2;
                  }
                }
              }
              ia.field_c = false;
              ((ol) this).field_gb = new tf();
              ((ol) this).field_Z = rl.field_u;
              break L1;
            }
            L5: {
              if (null != param0.field_X) {
                L6: {
                  ((ol) this).field_Z = mu.field_S;
                  if (param0.field_X.field_j[1] > param0.field_X.field_j[0]) {
                    ((ol) this).field_Z = qq.field_J;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ((ol) this).field_Z = vo.a((byte) -18, ((ol) this).field_Z, new String[2]);
                break L5;
              } else {
                break L5;
              }
            }
            ((ol) this).field_m = new int[2];
            ((ol) this).field_w = new String[2][8];
            ((ol) this).field_O = new int[2][8];
            ((ol) this).field_J = new int[]{-1, -1};
            var5 = 0;
            L7: while (true) {
              L8: {
                L9: {
                  if (~var5 <= ~param0.field_I) {
                    break L9;
                  } else {
                    stackOut_20_0 = param0.field_g[var5].field_l;
                    stackIn_33_0 = stackOut_20_0 ? 1 : 0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var10 != 0) {
                      break L8;
                    } else {
                      L10: {
                        if (stackIn_21_0) {
                          stackOut_26_0 = 0;
                          stackIn_27_0 = stackOut_26_0;
                          break L10;
                        } else {
                          stackOut_24_0 = 1;
                          stackIn_27_0 = stackOut_24_0;
                          break L10;
                        }
                      }
                      L11: {
                        var6_int = stackIn_27_0;
                        if (~param1 == ~var5) {
                          ((ol) this).field_J[var6_int] = ((ol) this).field_m[var6_int];
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      ((ol) this).field_O[var6_int][((ol) this).field_m[var6_int]] = var5;
                      ((ol) this).field_m[var6_int] = ((ol) this).field_m[var6_int] + 1;
                      ((ol) this).field_w[var6_int][((ol) this).field_m[var6_int]] = param0.field_S[var5].toLowerCase();
                      var5++;
                      if (var10 == 0) {
                        continue L7;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                ((ol) this).field_I = new String[]{lr.field_l, of.field_c};
                stackOut_32_0 = 0;
                stackIn_33_0 = stackOut_32_0;
                break L8;
              }
              L12: {
                L13: {
                  if (stackIn_33_0 == ~param0.field_Z) {
                    break L13;
                  } else {
                    if (param0.field_Z == -3) {
                      break L13;
                    } else {
                      if (!param0.field_L) {
                        break L12;
                      } else {
                        if (0 == ((ol) this).field_m[0]) {
                          break L13;
                        } else {
                          if (((ol) this).field_m[1] == 0) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                }
                ((ol) this).field_I[0] = ve.field_Q;
                break L12;
              }
              L14: {
                L15: {
                  if (0 <= param1) {
                    var5 = 0;
                    var6 = param0.field_g[param1];
                    ((ol) this).field_N = param0.field_R[param1].field_n;
                    ((ol) this).field_G = var6.field_g;
                    if (((ol) this).field_a.field_e) {
                      break L15;
                    } else {
                      ((ol) this).field_hb = new int[]{-1, -1, -1, -1};
                      ((ol) this).field_Y = var6.field_k;
                      var7 = 0;
                      var8 = 0;
                      L16: while (true) {
                        L17: {
                          if (4 <= var8) {
                            break L17;
                          } else {
                            stackOut_55_0 = ~((ol) this).field_a.field_i[((ol) this).field_h][var8];
                            stackOut_55_1 = ~((ol) this).field_g;
                            stackIn_64_0 = stackOut_55_0;
                            stackIn_64_1 = stackOut_55_1;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            if (var10 != 0) {
                              L18: while (true) {
                                if (stackIn_64_0 >= stackIn_64_1) {
                                  break L15;
                                } else {
                                  ((ol) this).field_o[var8] = new kq();
                                  stackOut_65_0 = var8 * 155;
                                  stackIn_76_0 = stackOut_65_0;
                                  stackIn_66_0 = stackOut_65_0;
                                  if (var10 != 0) {
                                    break L14;
                                  } else {
                                    stackOut_66_0 = stackIn_66_0;
                                    stackIn_68_0 = stackOut_66_0;
                                    L19: {
                                      stackOut_68_0 = stackIn_68_0;
                                      stackOut_68_1 = 300;
                                      stackIn_73_0 = stackOut_68_0;
                                      stackIn_73_1 = stackOut_68_1;
                                      stackIn_69_0 = stackOut_68_0;
                                      stackIn_69_1 = stackOut_68_1;
                                      if (1 < var5) {
                                        stackOut_73_0 = stackIn_73_0;
                                        stackOut_73_1 = stackIn_73_1;
                                        stackOut_73_2 = (var5 - 1) * 80;
                                        stackIn_74_0 = stackOut_73_0;
                                        stackIn_74_1 = stackOut_73_1;
                                        stackIn_74_2 = stackOut_73_2;
                                        break L19;
                                      } else {
                                        stackOut_69_0 = stackIn_69_0;
                                        stackOut_69_1 = stackIn_69_1;
                                        stackIn_71_0 = stackOut_69_0;
                                        stackIn_71_1 = stackOut_69_1;
                                        stackOut_71_0 = stackIn_71_0;
                                        stackOut_71_1 = stackIn_71_1;
                                        stackOut_71_2 = 0;
                                        stackIn_74_0 = stackOut_71_0;
                                        stackIn_74_1 = stackOut_71_1;
                                        stackIn_74_2 = stackOut_71_2;
                                        break L19;
                                      }
                                    }
                                    var9 = stackIn_74_0 + (stackIn_74_1 + -stackIn_74_2);
                                    ((ol) this).field_o[var8].a(true, 50, var9, 100, 100);
                                    ((ol) this).field_s[var8] = eo.a(so.field_a.toLowerCase(), 7126504, (hu) (Object) un.field_d, 80, true);
                                    ((ol) this).field_s[var8].a(true, ((ol) this).field_s[var8].field_q, var9 - 15, 230, ((ol) this).field_s[var8].field_mb);
                                    var8++;
                                    if (var10 == 0) {
                                      stackOut_63_0 = -5;
                                      stackOut_63_1 = ~var8;
                                      stackIn_64_0 = stackOut_63_0;
                                      stackIn_64_1 = stackOut_63_1;
                                      continue L18;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            } else {
                              L20: {
                                if (stackIn_56_0 != stackIn_56_1) {
                                  break L20;
                                } else {
                                  var5++;
                                  int incrementValue$1 = var7;
                                  var7++;
                                  ((ol) this).field_hb[incrementValue$1] = ((ol) this).field_a.field_k[((ol) this).field_h][var8];
                                  break L20;
                                }
                              }
                              var8++;
                              if (var10 == 0) {
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                        }
                        ((ol) this).field_s = new hd[4];
                        ((ol) this).field_l = var6.field_o;
                        ((ol) this).field_o = new kq[4];
                        var8 = 0;
                        L21: while (true) {
                          stackOut_63_0 = -5;
                          stackOut_63_1 = ~var8;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          if (stackIn_64_0 >= stackIn_64_1) {
                            break L15;
                          } else {
                            ((ol) this).field_o[var8] = new kq();
                            stackOut_65_0 = var8 * 155;
                            stackIn_76_0 = stackOut_65_0;
                            stackIn_66_0 = stackOut_65_0;
                            if (var10 != 0) {
                              break L14;
                            } else {
                              stackOut_66_0 = stackIn_66_0;
                              stackIn_68_0 = stackOut_66_0;
                              L22: {
                                stackOut_68_0 = stackIn_68_0;
                                stackOut_68_1 = 300;
                                stackIn_73_0 = stackOut_68_0;
                                stackIn_73_1 = stackOut_68_1;
                                stackIn_69_0 = stackOut_68_0;
                                stackIn_69_1 = stackOut_68_1;
                                if (1 < var5) {
                                  stackOut_73_0 = stackIn_73_0;
                                  stackOut_73_1 = stackIn_73_1;
                                  stackOut_73_2 = (var5 - 1) * 80;
                                  stackIn_74_0 = stackOut_73_0;
                                  stackIn_74_1 = stackOut_73_1;
                                  stackIn_74_2 = stackOut_73_2;
                                  break L22;
                                } else {
                                  stackOut_69_0 = stackIn_69_0;
                                  stackOut_69_1 = stackIn_69_1;
                                  stackIn_71_0 = stackOut_69_0;
                                  stackIn_71_1 = stackOut_69_1;
                                  stackOut_71_0 = stackIn_71_0;
                                  stackOut_71_1 = stackIn_71_1;
                                  stackOut_71_2 = 0;
                                  stackIn_74_0 = stackOut_71_0;
                                  stackIn_74_1 = stackOut_71_1;
                                  stackIn_74_2 = stackOut_71_2;
                                  break L22;
                                }
                              }
                              var9 = stackIn_74_0 + (stackIn_74_1 + -stackIn_74_2);
                              ((ol) this).field_o[var8].a(true, 50, var9, 100, 100);
                              ((ol) this).field_s[var8] = eo.a(so.field_a.toLowerCase(), 7126504, (hu) (Object) un.field_d, 80, true);
                              ((ol) this).field_s[var8].a(true, ((ol) this).field_s[var8].field_q, var9 - 15, 230, ((ol) this).field_s[var8].field_mb);
                              var8++;
                              if (var10 == 0) {
                                continue L21;
                              } else {
                                break L15;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L15;
                  }
                }
                st.a((nu) null, ((ol) this).field_g, 50);
                oa.b(-23217);
                stackOut_75_0 = 111;
                stackIn_76_0 = stackOut_75_0;
                break L14;
              }
              L23: {
                mv.a((byte) stackIn_76_0);
                ((ol) this).field_fb = new ut[2];
                ((ol) this).field_j = 256;
                ((ol) this).field_fb[0] = ae.a(true, (byte) -52, 0, 80, 7126504);
                ((ol) this).field_fb[1] = ae.a(true, (byte) -52, 1, 80, 7126504);
                if (((ol) this).field_p != null) {
                  break L23;
                } else {
                  ((ol) this).field_p = new int[((ol) this).field_a.field_I][4];
                  break L23;
                }
              }
              L24: {
                if (null == ((ol) this).field_ab) {
                  ((ol) this).field_ab = new int[((ol) this).field_a.field_I][4];
                  break L24;
                } else {
                  break L24;
                }
              }
              ((ol) this).field_u = new int[2];
              ((ol) this).field_k = new int[((ol) this).field_a.field_I];
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var4 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) var4;
            stackOut_85_1 = new StringBuilder().append("ol.<init>(");
            stackIn_88_0 = stackOut_85_0;
            stackIn_88_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param0 == null) {
              stackOut_88_0 = (RuntimeException) (Object) stackIn_88_0;
              stackOut_88_1 = (StringBuilder) (Object) stackIn_88_1;
              stackOut_88_2 = "null";
              stackIn_89_0 = stackOut_88_0;
              stackIn_89_1 = stackOut_88_1;
              stackIn_89_2 = stackOut_88_2;
              break L25;
            } else {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "{...}";
              stackIn_89_0 = stackOut_86_0;
              stackIn_89_1 = stackOut_86_1;
              stackIn_89_2 = stackOut_86_2;
              break L25;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_89_0, stackIn_89_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((ol) this).c(param0 + 121);
              ((ol) this).a(false, ((ol) this).field_Z);
              stackOut_1_0 = 15;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((ol) this).field_S == param0) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = -44;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 0;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = stackIn_5_1 + 325;
              stackOut_5_2 = 610;
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              if (((ol) this).field_S == 1) {
                stackOut_8_0 = stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = 44;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                stackIn_9_2 = stackOut_8_2;
                stackIn_9_3 = stackOut_8_3;
                break L2;
              } else {
                stackOut_6_0 = stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = 0;
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_9_2 = stackOut_6_2;
                stackIn_9_3 = stackOut_6_3;
                break L2;
              }
            }
            L3: {
              on.a(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3 + 35, 10, 0, 128);
              ((ol) this).d(123);
              if (!((ol) this).e(3, 50)) {
                break L3;
              } else {
                if (((ol) this).field_S != 0) {
                  break L3;
                } else {
                  var3 = ((ol) this).d(127, 3);
                  var4 = ((ol) this).c(342, 3);
                  pt.a(31 + var3, -22914, var3 - 31, var4 + -17, var4 + -37);
                  on.a(-30 + var3, var4 + -32, 60, 30, 8, 65793, 128);
                  ta.e(param0 + 116);
                  uv.a(var3 - 19, (byte) -82, -22 + var4);
                  pb.field_C.a(eq.field_b, -6 + var3, -16 + var4, 16777215, -1);
                  break L3;
                }
              }
            }
            L4: {
              var2_int = 245;
              if (!((ol) this).e(0, param0 ^ 51)) {
                break L4;
              } else {
                if (0 != ((ol) this).field_S) {
                  break L4;
                } else {
                  if (0 > ((ol) this).field_g) {
                    break L4;
                  } else {
                    if (!this.b((byte) -109)) {
                      break L4;
                    } else {
                      var3 = ((ol) this).d(param0 ^ 126, 0);
                      var4 = ((ol) this).c(342, 0);
                      pt.a(31 + var3, -22914, -31 + var3, var4 + -17, -37 + var4);
                      on.a(var3 + -30, -32 + var4, 60, 30, 8, 65793, 128);
                      ta.e(126);
                      uv.a(var3 + -19, (byte) 99, var4 + -22);
                      pb.field_C.a(eq.field_b, var3 + -6, -16 + var4, 16777215, -1);
                      break L4;
                    }
                  }
                }
              }
            }
            L5: {
              L6: {
                if (((ol) this).field_S == 2) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (0 == ((ol) this).field_S) {
                        break L8;
                      } else {
                        if (((ol) this).field_g < 0) {
                          break L8;
                        } else {
                          if (!((ol) this).field_a.field_e) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    this.f(86);
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L7;
                    }
                  }
                  if (1 != ((ol) this).field_S) {
                    break L5;
                  } else {
                    if (0 > ((ol) this).field_g) {
                      break L5;
                    } else {
                      if (!((ol) this).field_a.field_e) {
                        this.a(300, 100, 170, (byte) 119, var2_int);
                        if (var5 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              this.i(16777215);
              break L5;
            }
            L9: {
              if (((ol) this).field_a.field_f) {
                un.field_d.a("FB", 5, 17, 16777215, -1);
                break L9;
              } else {
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ol.S(" + param0 + ')');
        }
    }

    final void a(int param0, hn param1, int param2, int param3) {
        RuntimeException var5 = null;
        hn var5_ref = null;
        int var6 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (!((ol) this).field_a.field_e) {
              var5_ref = (hn) (Object) ((ol) this).field_gb.g(24009);
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var5_ref) {
                      break L3;
                    } else {
                      stackOut_5_0 = param1.a(var5_ref, 114);
                      stackIn_13_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0) {
                          return;
                        } else {
                          var5_ref = (hn) (Object) ((ol) this).field_gb.c(param0 ^ 32);
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = -1;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == ~param3) {
                    tu.field_E.field_i[((ol) this).field_hb[param2]].field_n = tu.field_E.field_i[((ol) this).field_hb[param2]].field_n + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param3 == param0) {
                    tu.field_E.field_i[((ol) this).field_hb[param2]].field_g = tu.field_E.field_i[((ol) this).field_hb[param2]].field_g + 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (2 == param3) {
                    tu.field_E.field_i[((ol) this).field_hb[param2]].field_o = tu.field_E.field_i[((ol) this).field_hb[param2]].field_o + 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                tu.field_E.field_i[((ol) this).field_hb[param2]].field_r = tu.field_E.field_i[((ol) this).field_hb[param2]].field_r - 100;
                ((ol) this).field_gb.a((gn) (Object) param1, 3);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var5;
            stackOut_27_1 = new StringBuilder().append("ol.Q(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L7;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int a(tf param0, int param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ch var11_ref_ch = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_22_1 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param0.a(false) == 0) {
                    break L3;
                  } else {
                    var5_int = 150 + param1;
                    var6 = 2 + (160 + var5_int);
                    var7 = 244 + var5_int;
                    var8 = 160;
                    pt.a(4 + (var5_int - -320), -22914, var5_int, param2 + 21, param2);
                    var9 = 80;
                    on.i(var5_int, param2, var8, 42, 10, 65793);
                    on.i(var6, param2, var9, 42, 10, 65793);
                    on.i(var7, param2, var9, 42, 10, 65793);
                    un.field_d.d(ib.field_H, var5_int + (var8 >> 1762224193), param2 - -17, 16777215, -1);
                    un.field_d.d(et.field_e, var6 + (var9 >> -348174079), param2 + 17, 16777215, -1);
                    un.field_d.d(lt.field_e, var7 + (var9 >> 242805121), 17 + param2, 16777215, -1);
                    ta.e(122);
                    var10 = 0;
                    var11_ref_ch = (ch) (Object) param0.g(24009);
                    L4: while (true) {
                      L5: {
                        if (null == var11_ref_ch) {
                          break L5;
                        } else {
                          param2 += 23;
                          var12 = 65793;
                          var13 = 128;
                          var14 = ((ol) this).field_a.field_S[var11_ref_ch.field_s].toLowerCase();
                          stackOut_4_0 = ~var11_ref_ch.field_k;
                          stackOut_4_1 = ~var11_ref_ch.field_f;
                          stackIn_23_0 = stackOut_4_0;
                          stackIn_23_1 = stackOut_4_1;
                          stackIn_5_0 = stackOut_4_0;
                          stackIn_5_1 = stackOut_4_1;
                          if (var15 != 0) {
                            break L1;
                          } else {
                            L6: {
                              if (stackIn_5_0 == stackIn_5_1) {
                                break L6;
                              } else {
                                var14 = vo.a((byte) -18, ae.field_P, new String[1]);
                                break L6;
                              }
                            }
                            L7: {
                              if (((ol) this).field_g != var11_ref_ch.field_s) {
                                break L7;
                              } else {
                                var13 = 50;
                                var12 = 16777215;
                                break L7;
                              }
                            }
                            on.a(-26 + var5_int, param2, 24, 21, var12, var13);
                            on.a(var5_int, param2, var8, 21, var12, var13);
                            on.a(var6, param2, var9, 21, var12, var13);
                            on.a(var7, param2, var9, 21, var12, var13);
                            var10++;
                            un.field_d.d(Integer.toString(var10), -14 + var5_int, 16 + param2, 16777215, -1);
                            un.field_d.d(var14, (var8 >> 2027488097) + var5_int, 16 + param2, 16777215, -1);
                            un.field_d.d(this.g(var11_ref_ch.field_t, -16305), var6 + (var9 >> -79930879), param2 - -16, 16777215, -1);
                            un.field_d.d(this.a((byte) -110, var11_ref_ch.field_l), (var9 >> -1245415519) + var7, 16 + param2, 16777215, -1);
                            var11_ref_ch = (ch) (Object) param0.c(33);
                            if (var15 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      param2 += 23;
                      var11 = 0;
                      L8: while (true) {
                        L9: {
                          L10: {
                            if (16 <= var11) {
                              break L10;
                            } else {
                              on.c(-26 + var5_int, param2 + var11, 24, 65793, 128 - (var11 << 1012207651));
                              on.c(var5_int, param2 - -var11, var8, 65793, 128 + -(var11 << 903360099));
                              on.c(var6, param2 - -var11, var9, 65793, 128 - (var11 << -1446948669));
                              on.c(var7, param2 - -var11, var9, 65793, -(var11 << -896330557) + 128);
                              var11++;
                              if (var15 != 0) {
                                break L9;
                              } else {
                                if (var15 == 0) {
                                  continue L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                          param2 += 10;
                          break L9;
                        }
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                param2 += 10;
                un.field_d.d(jl.field_c, param1 + 320, param2, 16777215, -1);
                break L2;
              }
              stackOut_22_0 = param3;
              stackOut_22_1 = 1;
              stackIn_23_0 = stackOut_22_0 ? 1 : 0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            L11: {
              if (stackIn_23_0 == stackIn_23_1) {
                break L11;
              } else {
                ((ol) this).field_U = false;
                break L11;
              }
            }
            stackOut_26_0 = param2;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var5 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var5;
            stackOut_28_1 = new StringBuilder().append("ol.M(");
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L12;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_27_0;
    }

    final void f(int param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param1 != 11) {
                break L1;
              } else {
                if (!((ol) this).field_f) {
                  break L1;
                } else {
                  if (((ol) this).field_g >= 0) {
                    or.field_d.b(75, (byte) -55);
                    or.field_d.a(117, 3);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (44 == param1) {
                ek.g(-29315);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 >= 98) {
                break L3;
              } else {
                ((ol) this).field_T = 67;
                break L3;
              }
            }
            L4: {
              if (param1 == 50) {
                L5: {
                  if (((ol) this).field_S == 2) {
                    break L5;
                  } else {
                    ((ol) this).field_mb = ((ol) this).field_S;
                    break L5;
                  }
                }
                ((ol) this).field_S = 2;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (47 == param1) {
                L7: {
                  if (((ol) this).field_S != 2) {
                    break L7;
                  } else {
                    ((ol) this).field_S = ((ol) this).field_mb;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                ((ol) this).field_mb = ((ol) this).field_S;
                ((ol) this).field_S = -((ol) this).field_S + 1;
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (56 == param1) {
                L9: {
                  if (((ol) this).field_S != 2) {
                    break L9;
                  } else {
                    ((ol) this).field_S = ((ol) this).field_mb;
                    if (var4 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                ((ol) this).field_mb = 0;
                ((ol) this).field_S = 2;
                break L8;
              } else {
                break L8;
              }
            }
            ii.a((byte) -127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var3 = null;
        int var4_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        gt var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        boolean stackOut_16_0 = false;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        var13 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (((ol) this).field_m[1] != 0) {
                stackOut_4_0 = 250;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = 0;
                stackIn_5_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_5_0;
            var3 = new int[]{640 - (var2_int - -160) >> 1710079393, var2_int + 480 >> -541232063};
            var4_int = -107 % ((-1 - param0) / 61);
            var5 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (2 <= var5) {
                    break L4;
                  } else {
                    var6 = ((ol) this).field_m[var5];
                    stackOut_7_0 = 0;
                    stackOut_7_1 = var6;
                    stackIn_49_0 = stackOut_7_0;
                    stackIn_49_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var13 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          L7: {
                            if (stackIn_8_0 != stackIn_8_1) {
                              break L7;
                            } else {
                              if (var13 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var7 = var3[var5];
                          wj.a(((ol) this).field_J[var5], var6, ((ol) this).field_I[var5], var7, 100, 124);
                          var8 = 140;
                          var9 = 0;
                          L8: while (true) {
                            L9: {
                              L10: {
                                if (((ol) this).field_m[var5] <= var9) {
                                  break L10;
                                } else {
                                  var10 = ((ol) this).field_a.field_R[((ol) this).field_O[var5][var9]];
                                  var11 = var10.field_v ? 1 : 0;
                                  stackOut_16_0 = ((ol) this).field_a.field_g[((ol) this).field_O[var5][var9]].field_i;
                                  stackIn_40_0 = stackOut_16_0 ? 1 : 0;
                                  stackIn_17_0 = stackOut_16_0;
                                  if (var13 != 0) {
                                    break L9;
                                  } else {
                                    L11: {
                                      if (stackIn_17_0) {
                                        uv.a(var7 + 10, (byte) -119, var8 - 6);
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      b.field_U[((ol) this).field_a.field_g[((ol) this).field_O[var5][var9]].field_f].c(var7, var8 + -16);
                                      if (var11 == 0) {
                                        stackOut_25_0 = 16777215;
                                        stackIn_26_0 = stackOut_25_0;
                                        break L12;
                                      } else {
                                        stackOut_23_0 = 11184810;
                                        stackIn_26_0 = stackOut_23_0;
                                        break L12;
                                      }
                                    }
                                    L13: {
                                      L14: {
                                        var12 = stackIn_26_0;
                                        un.field_d.d(((ol) this).field_w[var5][var9], 80 + var7, var8, var12, -1);
                                        if (var11 != 0) {
                                          break L14;
                                        } else {
                                          if (var10.field_k) {
                                            hn.a(8, 16777215, 90, var7, var8, 16777215, wq.field_e);
                                            if (var13 == 0) {
                                              break L13;
                                            } else {
                                              break L14;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      hn.a(8, 14492194, 110, var7, var8, 11184810, vc.field_A);
                                      break L13;
                                    }
                                    L15: {
                                      if (!var10.field_s) {
                                        break L15;
                                      } else {
                                        qq.a(110, (byte) -101, 13421772, ss.field_g, var8, var7, 14492194);
                                        break L15;
                                      }
                                    }
                                    var8 += 23;
                                    var9++;
                                    if (var13 == 0) {
                                      continue L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              var8 -= 17;
                              stackOut_39_0 = 0;
                              stackIn_40_0 = stackOut_39_0;
                              break L9;
                            }
                            var9 = stackIn_40_0;
                            L16: while (true) {
                              if (var9 >= 16) {
                                break L6;
                              } else {
                                on.c(var3[var5], var9 + var8, 160, 65793, -(var9 << 849921187) + 128);
                                var9++;
                                if (var13 != 0) {
                                  break L5;
                                } else {
                                  if (var13 == 0) {
                                    continue L16;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var5++;
                        break L5;
                      }
                      if (var13 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_48_0 = -1;
                stackOut_48_1 = ~((ol) this).field_g;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                break L3;
              }
              L17: {
                if (stackIn_49_0 >= stackIn_49_1) {
                  L18: {
                    L19: {
                      if (!((ol) this).field_a.field_g[((ol) this).field_g].field_l) {
                        break L19;
                      } else {
                        if (((ol) this).field_a.field_Z == -3) {
                          var4 = jl.field_b;
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    if (!um.field_e.field_s) {
                      if (((ol) this).field_N) {
                        if (((ol) this).field_a.field_e) {
                          var4 = je.field_p + "<br>" + vo.a((byte) -18, jg.field_I, new String[1]);
                          break L18;
                        } else {
                          var4 = mc.field_b + "<br>" + vk.field_a + " " + tq.field_E;
                          break L18;
                        }
                      } else {
                        var4 = pe.field_c;
                        break L18;
                      }
                    } else {
                      L20: {
                        L21: {
                          var4 = ar.field_d;
                          if (!um.field_e.field_q) {
                            break L21;
                          } else {
                            var4 = vo.a((byte) -18, oe.field_m + " " + tq.field_E, new String[1]);
                            if (var13 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        if (((ol) this).field_N) {
                          break L20;
                        } else {
                          var4 = pe.field_c;
                          break L20;
                        }
                      }
                      L22: {
                        var5 = ((ol) this).field_a.field_g[((ol) this).field_g].field_f;
                        if (!((ol) this).field_a.field_g[((ol) this).field_g].field_i) {
                          break L22;
                        } else {
                          var5--;
                          break L22;
                        }
                      }
                      L23: {
                        if (um.field_e.field_q) {
                          break L23;
                        } else {
                          if (!((ol) this).field_a.field_g[((ol) this).field_g].field_l) {
                            break L23;
                          } else {
                            if (pr.field_a[var5] <= ((ol) this).field_a.field_g[((ol) this).field_g].field_h) {
                              break L23;
                            } else {
                              var4 = var4 + "<br>" + vo.a((byte) -18, ja.field_L, new String[3]);
                              break L23;
                            }
                          }
                        }
                      }
                      break L18;
                    }
                  }
                  var5 = pb.field_C.c(var4, 380, 16);
                  wb.a(var4, 400, var5, -5 + (300 - var5), 120, 0);
                  break L17;
                } else {
                  break L17;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2, "ol.P(" + param0 + ')');
        }
    }

    final int d(int param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_22_0 = false;
        int stackOut_28_0 = 0;
        int stackOut_18_0 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((ol) this).field_c.length >= ~var4) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((ol) this).e(var4, 50);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var3_int++;
                          break L4;
                        }
                      }
                      var4++;
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 140;
                stackOut_9_0 = 610;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L5: {
                var5 = stackIn_10_0;
                if (((ol) this).e(3, 50)) {
                  var4 = 120;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0 > 106) {
                  break L6;
                } else {
                  boolean discarded$1 = ((ol) this).a('ﾖ', 56, 92);
                  break L6;
                }
              }
              var6 = (640 - var5 >> 2019514881) - -3;
              if (1 != var3_int) {
                var7 = (-var4 + var5) / (-1 + var3_int);
                var8 = (var4 >> -320564287) + var6;
                var9 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var9 >= param1) {
                        break L9;
                      } else {
                        stackOut_22_0 = ((ol) this).e(var9, 50);
                        stackIn_29_0 = stackOut_22_0 ? 1 : 0;
                        stackIn_23_0 = stackOut_22_0;
                        if (var10 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (!stackIn_23_0) {
                              break L10;
                            } else {
                              var8 = var8 + var7;
                              break L10;
                            }
                          }
                          var9++;
                          if (var10 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = -2 + var8;
                    stackIn_29_0 = stackOut_28_0;
                    break L8;
                  }
                  break L0;
                }
              } else {
                stackOut_18_0 = var5 + var6 - (var4 >> 981173537);
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.O(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0;
    }

    private final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (~param2 != ~param0) {
                L2: {
                  var4_int = param2 - param0 >> -1578076893;
                  if (var4_int == 0) {
                    break L2;
                  } else {
                    param0 = param0 + var4_int;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (~param2 < ~param0) {
                    break L3;
                  } else {
                    param0--;
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                param0++;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 == -49) {
              stackOut_17_0 = param0;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_15_0 = -98;
              stackIn_16_0 = stackOut_15_0;
              return stackIn_16_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "ol.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, bu param4, int param5) {
        RuntimeException var6 = null;
        wu var6_ref = null;
        cl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_13_0 = 0;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_51_0 = null;
        java.awt.Frame stackIn_53_0 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_35_0 = 0;
        Object stackOut_37_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_47_0 = null;
        java.awt.Frame stackOut_52_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_40_0 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (!param4.b(param0 ^ 9073)) {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (java.awt.Frame) (Object) stackIn_5_0;
            } else {
              L1: {
                if (param5 != 0) {
                  break L1;
                } else {
                  var6_array = kr.a((byte) 124, param4);
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var6_array.length) {
                            break L4;
                          } else {
                            stackOut_12_0 = var6_array[var8].field_f;
                            stackIn_36_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_13_0 != param1) {
                                  break L5;
                                } else {
                                  if (~param2 != ~var6_array[var8].field_b) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (param3 == 0) {
                                        break L6;
                                      } else {
                                        if (~param3 == ~var6_array[var8].field_a) {
                                          break L6;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var7_int == 0) {
                                        break L7;
                                      } else {
                                        if (~var6_array[var8].field_e < ~param5) {
                                          break L7;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    param5 = var6_array[var8].field_e;
                                    var7_int = 1;
                                    break L5;
                                  }
                                }
                              }
                              var8++;
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        stackOut_35_0 = var7_int;
                        stackIn_36_0 = stackOut_35_0;
                        break L3;
                      }
                      if (stackIn_36_0 != 0) {
                        break L1;
                      } else {
                        stackOut_37_0 = null;
                        stackIn_38_0 = stackOut_37_0;
                        return (java.awt.Frame) (Object) stackIn_38_0;
                      }
                    }
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (java.awt.Frame) (Object) stackIn_9_0;
                  }
                }
              }
              var6_ref = param4.a(param2, param3, false, param1, param5);
              if (param0 == -9027) {
                L8: while (true) {
                  L9: {
                    if (var6_ref.field_a != 0) {
                      break L9;
                    } else {
                      aj.a(10L, 1);
                      if (var9 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var7 = (java.awt.Frame) var6_ref.field_b;
                  if (null == var7) {
                    stackOut_47_0 = null;
                    stackIn_48_0 = stackOut_47_0;
                    return (java.awt.Frame) (Object) stackIn_48_0;
                  } else {
                    if (var6_ref.field_a != 2) {
                      stackOut_52_0 = (java.awt.Frame) var7;
                      stackIn_53_0 = stackOut_52_0;
                      break L0;
                    } else {
                      dq.a(param4, var7, 0);
                      stackOut_50_0 = null;
                      stackIn_51_0 = stackOut_50_0;
                      return (java.awt.Frame) (Object) stackIn_51_0;
                    }
                  }
                }
              } else {
                stackOut_40_0 = null;
                stackIn_41_0 = stackOut_40_0;
                return (java.awt.Frame) (Object) stackIn_41_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var6;
            stackOut_54_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param4 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L10;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L10;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param5 + ')');
        }
        return stackIn_53_0;
    }

    final void a(int param0, boolean param1) {
        int var3_int = 0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        int var10 = 0;
        int var11 = 0;
        int var12_int = 0;
        String var12 = null;
        int var13 = 0;
        up var14 = null;
        int var15 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        Object stackIn_38_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_84_0 = null;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        Object stackIn_90_0 = null;
        Object stackIn_91_0 = null;
        Object stackIn_92_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        Object stackIn_100_0 = null;
        Object stackIn_101_0 = null;
        Object stackIn_102_0 = null;
        Object stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_31_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_34_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        Object stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_43_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_45_0 = null;
        Object stackOut_46_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        Object stackOut_49_0 = null;
        Object stackOut_50_0 = null;
        Object stackOut_51_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_54_0 = null;
        Object stackOut_55_0 = null;
        Object stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        Object stackOut_57_0 = null;
        int stackOut_57_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_59_0 = null;
        Object stackOut_60_0 = null;
        Object stackOut_61_0 = null;
        Object stackOut_62_0 = null;
        Object stackOut_63_0 = null;
        Object stackOut_64_0 = null;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_68_0 = null;
        Object stackOut_69_0 = null;
        Object stackOut_70_0 = null;
        Object stackOut_71_0 = null;
        Object stackOut_72_0 = null;
        Object stackOut_73_0 = null;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_76_0 = null;
        Object stackOut_77_0 = null;
        Object stackOut_78_0 = null;
        Object stackOut_79_0 = null;
        Object stackOut_80_0 = null;
        Object stackOut_81_0 = null;
        Object stackOut_82_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        Object stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        Object stackOut_85_0 = null;
        Object stackOut_86_0 = null;
        Object stackOut_87_0 = null;
        Object stackOut_88_0 = null;
        Object stackOut_89_0 = null;
        Object stackOut_90_0 = null;
        Object stackOut_91_0 = null;
        Object stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        Object stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        Object stackOut_94_0 = null;
        Object stackOut_95_0 = null;
        Object stackOut_96_0 = null;
        Object stackOut_97_0 = null;
        Object stackOut_98_0 = null;
        Object stackOut_99_0 = null;
        Object stackOut_100_0 = null;
        Object stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        Object stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        L0: {
          var15 = Kickabout.field_G;
          super.a(-94, param1);
          var3_int = ((ol) this).field_bb.a(false) - -((ol) this).field_q.a(false);
          ((ol) this).field_lb = -((((ol) this).field_a.field_I + 1) * 50 + 100);
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (0 >= var3_int) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 32 * -var3_int;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((ol) this).field_P = stackIn_3_1;
            if (((ol) this).field_a.field_e) {
              break L2;
            } else {
              L3: {
                if (!((ol) this).field_a.field_L) {
                  break L3;
                } else {
                  if (((ol) this).field_g == -2) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (0 == ((ol) this).field_S) {
                    break L5;
                  } else {
                    if (((ol) this).field_S != 2) {
                      break L4;
                    } else {
                      if (1 != ((ol) this).field_mb) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                ((ol) this).field_c[0].field_p = ni.field_e.toLowerCase();
                if (var15 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
              ((ol) this).field_c[0].field_p = oh.field_g.toLowerCase();
              if (var15 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L6: {
            if (0 == ((ol) this).field_S) {
              break L6;
            } else {
              ((ol) this).field_c[1].field_p = oh.field_g.toLowerCase();
              if (var15 == 0) {
                break L1;
              } else {
                break L6;
              }
            }
          }
          ((ol) this).field_c[1].field_p = q.field_f.toLowerCase();
          break L1;
        }
        L7: {
          L8: {
            if (((ol) this).field_j > -255) {
              break L8;
            } else {
              ((ol) this).field_j = 255;
              if (var15 == 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          ((ol) this).field_j = ((ol) this).field_j - 5;
          break L7;
        }
        L9: {
          if (((ol) this).field_S != 2) {
            break L9;
          } else {
            L10: {
              if (((ol) this).field_X == ((ol) this).field_ib) {
                break L10;
              } else {
                ((ol) this).field_M = 0;
                break L10;
              }
            }
            L11: {
              L12: {
                ((ol) this).field_ib = this.a(((ol) this).field_ib, (byte) -49, ((ol) this).field_X);
                ((ol) this).field_Q = this.a(((ol) this).field_Q, (byte) -49, ((ol) this).field_M);
                ((ol) this).field_T = 596 + ((ol) this).field_ib + 32;
                ((ol) this).field_H = 32 + (1192 + ((ol) this).field_ib);
                ((ol) this).field_v = 32 + (1192 + ((ol) this).field_ib);
                ((ol) this).field_eb = 600 + ((ol) this).field_ib;
                ((ol) this).field_x = 32 + (((ol) this).field_ib + 596);
                ((ol) this).field_L = 1196 + ((ol) this).field_ib;
                stackOut_31_0 = this;
                stackIn_39_0 = stackOut_31_0;
                stackIn_32_0 = stackOut_31_0;
                if (el.field_A < ((ol) this).field_H) {
                  break L12;
                } else {
                  stackOut_32_0 = this;
                  stackIn_39_0 = stackOut_32_0;
                  stackIn_33_0 = stackOut_32_0;
                  if (el.field_A > 570 + ((ol) this).field_H) {
                    break L12;
                  } else {
                    stackOut_33_0 = this;
                    stackIn_34_0 = stackOut_33_0;
                    stackOut_34_0 = this;
                    stackIn_39_0 = stackOut_34_0;
                    stackIn_35_0 = stackOut_34_0;
                    if (~n.field_m > ~((ol) this).field_jb) {
                      break L12;
                    } else {
                      stackOut_35_0 = this;
                      stackIn_36_0 = stackOut_35_0;
                      stackOut_36_0 = this;
                      stackIn_39_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (n.field_m > ((ol) this).field_jb - -12) {
                        break L12;
                      } else {
                        stackOut_37_0 = this;
                        stackIn_38_0 = stackOut_37_0;
                        stackOut_38_0 = this;
                        stackOut_38_1 = 1;
                        stackIn_40_0 = stackOut_38_0;
                        stackIn_40_1 = stackOut_38_1;
                        break L11;
                      }
                    }
                  }
                }
              }
              stackOut_39_0 = this;
              stackOut_39_1 = 0;
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              break L11;
            }
            L13: {
              L14: {
                ((ol) this).field_U = stackIn_40_1 != 0;
                stackOut_40_0 = this;
                stackIn_48_0 = stackOut_40_0;
                stackIn_41_0 = stackOut_40_0;
                if (el.field_A < 16 + ((ol) this).field_L) {
                  break L14;
                } else {
                  stackOut_41_0 = this;
                  stackIn_48_0 = stackOut_41_0;
                  stackIn_42_0 = stackOut_41_0;
                  if (32 + ((ol) this).field_L < el.field_A) {
                    break L14;
                  } else {
                    stackOut_42_0 = this;
                    stackIn_43_0 = stackOut_42_0;
                    stackOut_43_0 = this;
                    stackIn_48_0 = stackOut_43_0;
                    stackIn_44_0 = stackOut_43_0;
                    if (~((ol) this).field_r < ~n.field_m) {
                      break L14;
                    } else {
                      stackOut_44_0 = this;
                      stackIn_45_0 = stackOut_44_0;
                      stackOut_45_0 = this;
                      stackIn_48_0 = stackOut_45_0;
                      stackIn_46_0 = stackOut_45_0;
                      if (n.field_m > ((ol) this).field_r + 195) {
                        break L14;
                      } else {
                        stackOut_46_0 = this;
                        stackIn_47_0 = stackOut_46_0;
                        stackOut_47_0 = this;
                        stackOut_47_1 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        stackIn_49_1 = stackOut_47_1;
                        break L13;
                      }
                    }
                  }
                }
              }
              stackOut_48_0 = this;
              stackOut_48_1 = 0;
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              break L13;
            }
            L15: {
              L16: {
                ((ol) this).field_D = stackIn_49_1 != 0;
                stackOut_49_0 = this;
                stackIn_57_0 = stackOut_49_0;
                stackIn_50_0 = stackOut_49_0;
                if (el.field_A < ((ol) this).field_T) {
                  break L16;
                } else {
                  stackOut_50_0 = this;
                  stackIn_57_0 = stackOut_50_0;
                  stackIn_51_0 = stackOut_50_0;
                  if (el.field_A > ((ol) this).field_T + 570) {
                    break L16;
                  } else {
                    stackOut_51_0 = this;
                    stackIn_52_0 = stackOut_51_0;
                    stackOut_52_0 = this;
                    stackIn_57_0 = stackOut_52_0;
                    stackIn_53_0 = stackOut_52_0;
                    if (((ol) this).field_kb + 12 > n.field_m) {
                      break L16;
                    } else {
                      stackOut_53_0 = this;
                      stackIn_54_0 = stackOut_53_0;
                      stackOut_54_0 = this;
                      stackIn_57_0 = stackOut_54_0;
                      stackIn_55_0 = stackOut_54_0;
                      if (~n.field_m < ~(((ol) this).field_kb + 24)) {
                        break L16;
                      } else {
                        stackOut_55_0 = this;
                        stackIn_56_0 = stackOut_55_0;
                        stackOut_56_0 = this;
                        stackOut_56_1 = 1;
                        stackIn_58_0 = stackOut_56_0;
                        stackIn_58_1 = stackOut_56_1;
                        break L15;
                      }
                    }
                  }
                }
              }
              stackOut_57_0 = this;
              stackOut_57_1 = 0;
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              break L15;
            }
            L17: {
              L18: {
                ((ol) this).field_F = stackIn_58_1 != 0;
                stackOut_58_0 = this;
                stackIn_66_0 = stackOut_58_0;
                stackIn_59_0 = stackOut_58_0;
                if (~((ol) this).field_L < ~el.field_A) {
                  break L18;
                } else {
                  stackOut_59_0 = this;
                  stackIn_66_0 = stackOut_59_0;
                  stackIn_60_0 = stackOut_59_0;
                  if (16 + ((ol) this).field_L < el.field_A) {
                    break L18;
                  } else {
                    stackOut_60_0 = this;
                    stackIn_61_0 = stackOut_60_0;
                    stackOut_61_0 = this;
                    stackIn_66_0 = stackOut_61_0;
                    stackIn_62_0 = stackOut_61_0;
                    if (~((ol) this).field_r < ~n.field_m) {
                      break L18;
                    } else {
                      stackOut_62_0 = this;
                      stackIn_63_0 = stackOut_62_0;
                      stackOut_63_0 = this;
                      stackIn_66_0 = stackOut_63_0;
                      stackIn_64_0 = stackOut_63_0;
                      if (~n.field_m < ~(((ol) this).field_r - -195)) {
                        break L18;
                      } else {
                        stackOut_64_0 = this;
                        stackIn_65_0 = stackOut_64_0;
                        stackOut_65_0 = this;
                        stackOut_65_1 = 1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L17;
                      }
                    }
                  }
                }
              }
              stackOut_66_0 = this;
              stackOut_66_1 = 0;
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              break L17;
            }
            L19: {
              L20: {
                ((ol) this).field_C = stackIn_67_1 != 0;
                stackOut_67_0 = this;
                stackIn_75_0 = stackOut_67_0;
                stackIn_68_0 = stackOut_67_0;
                if (~(16 + ((ol) this).field_eb) < ~el.field_A) {
                  break L20;
                } else {
                  stackOut_68_0 = this;
                  stackIn_75_0 = stackOut_68_0;
                  stackIn_69_0 = stackOut_68_0;
                  if (el.field_A > 32 + ((ol) this).field_eb) {
                    break L20;
                  } else {
                    stackOut_69_0 = this;
                    stackIn_70_0 = stackOut_69_0;
                    stackOut_70_0 = this;
                    stackIn_75_0 = stackOut_70_0;
                    stackIn_71_0 = stackOut_70_0;
                    if (n.field_m < ((ol) this).field_db) {
                      break L20;
                    } else {
                      stackOut_71_0 = this;
                      stackIn_72_0 = stackOut_71_0;
                      stackOut_72_0 = this;
                      stackIn_75_0 = stackOut_72_0;
                      stackIn_73_0 = stackOut_72_0;
                      if (((ol) this).field_db - -195 < n.field_m) {
                        break L20;
                      } else {
                        stackOut_73_0 = this;
                        stackIn_74_0 = stackOut_73_0;
                        stackOut_74_0 = this;
                        stackOut_74_1 = 1;
                        stackIn_76_0 = stackOut_74_0;
                        stackIn_76_1 = stackOut_74_1;
                        break L19;
                      }
                    }
                  }
                }
              }
              stackOut_75_0 = this;
              stackOut_75_1 = 0;
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              break L19;
            }
            L21: {
              L22: {
                ((ol) this).field_W = stackIn_76_1 != 0;
                stackOut_76_0 = this;
                stackIn_84_0 = stackOut_76_0;
                stackIn_77_0 = stackOut_76_0;
                if (((ol) this).field_v > el.field_A) {
                  break L22;
                } else {
                  stackOut_77_0 = this;
                  stackIn_84_0 = stackOut_77_0;
                  stackIn_78_0 = stackOut_77_0;
                  if (~(((ol) this).field_v + 570) > ~el.field_A) {
                    break L22;
                  } else {
                    stackOut_78_0 = this;
                    stackIn_79_0 = stackOut_78_0;
                    stackOut_79_0 = this;
                    stackIn_84_0 = stackOut_79_0;
                    stackIn_80_0 = stackOut_79_0;
                    if (~n.field_m > ~(12 + ((ol) this).field_A)) {
                      break L22;
                    } else {
                      stackOut_80_0 = this;
                      stackIn_81_0 = stackOut_80_0;
                      stackOut_81_0 = this;
                      stackIn_84_0 = stackOut_81_0;
                      stackIn_82_0 = stackOut_81_0;
                      if (~(((ol) this).field_A - -24) > ~n.field_m) {
                        break L22;
                      } else {
                        stackOut_82_0 = this;
                        stackIn_83_0 = stackOut_82_0;
                        stackOut_83_0 = this;
                        stackOut_83_1 = 1;
                        stackIn_85_0 = stackOut_83_0;
                        stackIn_85_1 = stackOut_83_1;
                        break L21;
                      }
                    }
                  }
                }
              }
              stackOut_84_0 = this;
              stackOut_84_1 = 0;
              stackIn_85_0 = stackOut_84_0;
              stackIn_85_1 = stackOut_84_1;
              break L21;
            }
            L23: {
              L24: {
                ((ol) this).field_t = stackIn_85_1 != 0;
                stackOut_85_0 = this;
                stackIn_93_0 = stackOut_85_0;
                stackIn_86_0 = stackOut_85_0;
                if (~el.field_A > ~((ol) this).field_eb) {
                  break L24;
                } else {
                  stackOut_86_0 = this;
                  stackIn_93_0 = stackOut_86_0;
                  stackIn_87_0 = stackOut_86_0;
                  if (~el.field_A < ~(((ol) this).field_eb - -16)) {
                    break L24;
                  } else {
                    stackOut_87_0 = this;
                    stackIn_88_0 = stackOut_87_0;
                    stackOut_88_0 = this;
                    stackIn_93_0 = stackOut_88_0;
                    stackIn_89_0 = stackOut_88_0;
                    if (~((ol) this).field_db < ~n.field_m) {
                      break L24;
                    } else {
                      stackOut_89_0 = this;
                      stackIn_90_0 = stackOut_89_0;
                      stackOut_90_0 = this;
                      stackIn_93_0 = stackOut_90_0;
                      stackIn_91_0 = stackOut_90_0;
                      if (n.field_m > ((ol) this).field_db + 195) {
                        break L24;
                      } else {
                        stackOut_91_0 = this;
                        stackIn_92_0 = stackOut_91_0;
                        stackOut_92_0 = this;
                        stackOut_92_1 = 1;
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        break L23;
                      }
                    }
                  }
                }
              }
              stackOut_93_0 = this;
              stackOut_93_1 = 0;
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              break L23;
            }
            L25: {
              L26: {
                ((ol) this).field_K = stackIn_94_1 != 0;
                stackOut_94_0 = this;
                stackIn_102_0 = stackOut_94_0;
                stackIn_95_0 = stackOut_94_0;
                if (~el.field_A > ~((ol) this).field_x) {
                  break L26;
                } else {
                  stackOut_95_0 = this;
                  stackIn_102_0 = stackOut_95_0;
                  stackIn_96_0 = stackOut_95_0;
                  if (el.field_A > 570 + ((ol) this).field_x) {
                    break L26;
                  } else {
                    stackOut_96_0 = this;
                    stackIn_97_0 = stackOut_96_0;
                    stackOut_97_0 = this;
                    stackIn_102_0 = stackOut_97_0;
                    stackIn_98_0 = stackOut_97_0;
                    if (n.field_m < ((ol) this).field_B) {
                      break L26;
                    } else {
                      stackOut_98_0 = this;
                      stackIn_99_0 = stackOut_98_0;
                      stackOut_99_0 = this;
                      stackIn_102_0 = stackOut_99_0;
                      stackIn_100_0 = stackOut_99_0;
                      if (((ol) this).field_B + 12 < n.field_m) {
                        break L26;
                      } else {
                        stackOut_100_0 = this;
                        stackIn_101_0 = stackOut_100_0;
                        stackOut_101_0 = this;
                        stackOut_101_1 = 1;
                        stackIn_103_0 = stackOut_101_0;
                        stackIn_103_1 = stackOut_101_1;
                        break L25;
                      }
                    }
                  }
                }
              }
              stackOut_102_0 = this;
              stackOut_102_1 = 0;
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              break L25;
            }
            L27: {
              ((ol) this).field_y = stackIn_103_1 != 0;
              if (!((ol) this).field_K) {
                break L27;
              } else {
                if (wj.field_A != 1) {
                  break L27;
                } else {
                  if (((ol) this).field_ib != 0) {
                    break L27;
                  } else {
                    ii.a((byte) -124);
                    ((ol) this).field_X = ((ol) this).field_X - 596;
                    break L27;
                  }
                }
              }
            }
            L28: {
              if (!((ol) this).field_W) {
                break L28;
              } else {
                if (wj.field_A != 1) {
                  break L28;
                } else {
                  if (((ol) this).field_ib != -596) {
                    break L28;
                  } else {
                    ii.a((byte) -119);
                    ((ol) this).field_X = ((ol) this).field_X + 596;
                    break L28;
                  }
                }
              }
            }
            L29: {
              if (!((ol) this).field_C) {
                break L29;
              } else {
                if (wj.field_A != 1) {
                  break L29;
                } else {
                  if (-596 == ((ol) this).field_ib) {
                    ii.a((byte) -117);
                    ((ol) this).field_X = ((ol) this).field_X - 596;
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
            }
            L30: {
              if (!((ol) this).field_D) {
                break L30;
              } else {
                if (wj.field_A != 1) {
                  break L30;
                } else {
                  if (((ol) this).field_ib != -1192) {
                    break L30;
                  } else {
                    ii.a((byte) -125);
                    ((ol) this).field_X = ((ol) this).field_X + 596;
                    break L30;
                  }
                }
              }
            }
            L31: {
              if (!((ol) this).field_y) {
                break L31;
              } else {
                if (nl.field_p != 1) {
                  break L31;
                } else {
                  if (((ol) this).field_P == 0) {
                    break L31;
                  } else {
                    if (~((ol) this).field_M >= ~((ol) this).field_P) {
                      break L31;
                    } else {
                      L32: {
                        if (wj.field_A != 1) {
                          break L32;
                        } else {
                          ii.a((byte) -118);
                          break L32;
                        }
                      }
                      ((ol) this).field_M = ((ol) this).field_M - 32;
                      break L31;
                    }
                  }
                }
              }
            }
            L33: {
              if (!((ol) this).field_F) {
                break L33;
              } else {
                if (1 != nl.field_p) {
                  break L33;
                } else {
                  if (((ol) this).field_M >= 0) {
                    break L33;
                  } else {
                    L34: {
                      if (wj.field_A != 1) {
                        break L34;
                      } else {
                        ii.a((byte) -122);
                        break L34;
                      }
                    }
                    ((ol) this).field_M = ((ol) this).field_M + 32;
                    break L33;
                  }
                }
              }
            }
            L35: {
              if (!((ol) this).field_U) {
                break L35;
              } else {
                if (nl.field_p != 1) {
                  break L35;
                } else {
                  if (((ol) this).field_lb == 0) {
                    break L35;
                  } else {
                    if (((ol) this).field_M <= ((ol) this).field_lb) {
                      break L35;
                    } else {
                      L36: {
                        if (wj.field_A != 1) {
                          break L36;
                        } else {
                          ii.a((byte) -121);
                          break L36;
                        }
                      }
                      ((ol) this).field_M = ((ol) this).field_M - 32;
                      break L35;
                    }
                  }
                }
              }
            }
            L37: {
              if (!((ol) this).field_t) {
                break L37;
              } else {
                if (nl.field_p != 1) {
                  break L37;
                } else {
                  if (((ol) this).field_M < 0) {
                    L38: {
                      if (wj.field_A != 1) {
                        break L38;
                      } else {
                        ii.a((byte) -127);
                        break L38;
                      }
                    }
                    ((ol) this).field_M = ((ol) this).field_M + 32;
                    break L37;
                  } else {
                    break L37;
                  }
                }
              }
            }
            L39: {
              if (((ol) this).field_X == ((ol) this).field_ib) {
                ((ol) this).field_M = ((ol) this).field_M - 32 * id.field_v;
                break L39;
              } else {
                break L39;
              }
            }
            L40: {
              if (((ol) this).field_M > 0) {
                ((ol) this).field_M = 0;
                break L40;
              } else {
                break L40;
              }
            }
            L41: {
              if (((ol) this).field_ib != -596) {
                break L41;
              } else {
                if (~((ol) this).field_P >= ~((ol) this).field_M) {
                  break L41;
                } else {
                  ((ol) this).field_M = ((ol) this).field_P;
                  if (var15 == 0) {
                    break L9;
                  } else {
                    break L41;
                  }
                }
              }
            }
            L42: {
              L43: {
                if (((ol) this).field_ib != -1192) {
                  break L43;
                } else {
                  if (~((ol) this).field_lb < ~((ol) this).field_M) {
                    break L42;
                  } else {
                    break L43;
                  }
                }
              }
              if (((ol) this).field_ib == 0) {
                ((ol) this).field_M = 0;
                if (var15 == 0) {
                  break L9;
                } else {
                  break L42;
                }
              } else {
                break L9;
              }
            }
            ((ol) this).field_M = ((ol) this).field_lb;
            break L9;
          }
        }
        var4 = (double)(((ol) this).field_V % 151);
        var6 = var4 / 2.0;
        var8 = -37.5 + var6;
        var10 = (int)Math.abs(var8) << 1095665666;
        ((ol) this).field_cb = var10 << 736341520 | (65793 | var10 | var10 << 1890532264);
        ((ol) this).field_V = ((ol) this).field_V + 1;
        if (param0 < -92) {
          if (((ol) this).field_g != -2) {
            var11 = 0;
            var12_int = 0;
            L44: while (true) {
              L45: {
                if (~var12_int <= ~((ol) this).field_a.field_I) {
                  break L45;
                } else {
                  L46: {
                    if (((ol) this).field_a.field_R[var12_int].field_v) {
                      break L46;
                    } else {
                      var11++;
                      break L46;
                    }
                  }
                  var12_int++;
                  if (var15 == 0) {
                    continue L44;
                  } else {
                    break L45;
                  }
                }
              }
              L47: {
                L48: {
                  var12 = nj.field_c;
                  if (var11 != 1) {
                    break L48;
                  } else {
                    var12 = ig.field_k;
                    if (var15 == 0) {
                      break L47;
                    } else {
                      break L48;
                    }
                  }
                }
                if (!((ol) this).field_a.field_R[((ol) this).field_g].field_k) {
                  break L47;
                } else {
                  var12 = gw.field_e;
                  break L47;
                }
              }
              L49: {
                L50: {
                  ((ol) this).field_c[4].field_p = var12.toLowerCase();
                  if (1 != ((ol) this).field_S) {
                    break L50;
                  } else {
                    if (((ol) this).field_a.field_e) {
                      break L50;
                    } else {
                      var13 = 0;
                      L51: while (true) {
                        if (4 <= var13) {
                          break L50;
                        } else {
                          if (var15 != 0) {
                            break L49;
                          } else {
                            L52: {
                              if (((ol) this).field_hb[var13] == -1) {
                                break L52;
                              } else {
                                L53: {
                                  L54: {
                                    var14 = tu.field_E.field_i[((ol) this).field_hb[var13]];
                                    ((ol) this).field_o[var13].b(0, param1);
                                    ((ol) this).field_o[var13].a(((ol) this).field_a.field_Q[((ol) this).field_h], ((ol) this).field_a.field_H[((ol) this).field_h], (byte) 126, ((ol) this).field_a.field_d[((ol) this).field_h], var14);
                                    ((ol) this).field_s[var13].b(0, param1);
                                    if (100 <= var14.field_r) {
                                      break L54;
                                    } else {
                                      ((ol) this).field_s[var13].field_lb = false;
                                      if (var15 == 0) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                  ((ol) this).field_s[var13].field_lb = true;
                                  break L53;
                                }
                                L55: {
                                  if (var14.field_n < 100) {
                                    break L55;
                                  } else {
                                    if (var14.field_g < 100) {
                                      break L55;
                                    } else {
                                      if (var14.field_o < 100) {
                                        break L55;
                                      } else {
                                        ((ol) this).field_s[var13].field_lb = false;
                                        break L55;
                                      }
                                    }
                                  }
                                }
                                if (1 != ((ol) this).field_s[var13].field_sb) {
                                  break L52;
                                } else {
                                  L56: {
                                    L57: {
                                      if (100 > var14.field_r) {
                                        break L57;
                                      } else {
                                        L58: {
                                          if (100 > var14.field_n) {
                                            break L58;
                                          } else {
                                            if (var14.field_o < 100) {
                                              break L58;
                                            } else {
                                              if (var14.field_g < 100) {
                                                break L58;
                                              } else {
                                                sk.a(7, 16586, (lv) (Object) var14);
                                                wh discarded$3 = sp.c(49, -122);
                                                if (var15 == 0) {
                                                  break L56;
                                                } else {
                                                  break L58;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        dg.a((byte) -120, var13, ((ol) this).field_hb[var13], var14);
                                        wh discarded$4 = sp.c(49, -121);
                                        if (var15 == 0) {
                                          break L56;
                                        } else {
                                          break L57;
                                        }
                                      }
                                    }
                                    if (var14.field_n < 100) {
                                      break L56;
                                    } else {
                                      if (var14.field_o < 100) {
                                        break L56;
                                      } else {
                                        if (var14.field_g >= 100) {
                                          sk.a(7, 16586, (lv) (Object) var14);
                                          wh discarded$5 = sp.c(49, 52);
                                          break L56;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                  }
                                  kj.a((byte) 61);
                                  break L52;
                                }
                              }
                            }
                            var13++;
                            if (var15 == 0) {
                              continue L51;
                            } else {
                              break L50;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L49;
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public static void g(int param0) {
        try {
            field_E = null;
            field_n = null;
            if (param0 > 0) {
                field_E = null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ol.A(" + param0 + ')');
        }
    }

    private final String g(int param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        String stackOut_12_0 = null;
        String stackOut_10_0 = null;
        String stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1 == -16305) {
              if (param0 != 2) {
                if (param0 == 3) {
                  stackOut_14_0 = fb.field_S;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  if (param0 != 1) {
                    stackOut_12_0 = rb.field_Ib;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    stackOut_10_0 = cu.field_g;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  }
                }
              } else {
                stackOut_4_0 = dn.field_Ab;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0;
    }

    private final String a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        String stackOut_4_0 = null;
        String stackOut_1_0 = null;
        try {
          L0: {
            param1 = -param1 + ((ol) this).field_a.field_O;
            var3_int = param1 / 50;
            var4 = var3_int / 60;
            var6 = 121 % ((param0 - 27) / 45);
            var5 = -(var4 * 60) + var3_int;
            if (var4 != 0) {
              if (10 > var5) {
                stackOut_6_0 = Integer.toString(var4) + ":" + Integer.toString(0) + Integer.toString(var5);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = var4 + ":" + var5;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = Integer.toString(var5) + "s";
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 342) {
                break L1;
              } else {
                int discarded$2 = ((ol) this).d(-95, 21);
                break L1;
              }
            }
            stackOut_3_0 = 342;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ol.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Discard";
        field_E = "You have entered another game.";
        field_R = false;
    }
}
