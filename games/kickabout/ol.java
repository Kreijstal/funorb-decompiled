/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int discarded$1 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        up var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -109) {
                break L1;
              } else {
                discarded$1 = this.a((tf) null, -84, -44, false);
                break L1;
              }
            }
            if (0 <= this.field_g) {
              if (!this.field_a.field_e) {
                var2_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if ((var2_int ^ -1) <= -5) {
                        break L4;
                      } else {
                        stackIn_32_0 = this.field_hb[var2_int] ^ -1;

                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            if (stackIn_32_0 == 0) {
                              break L5;
                            } else {
                              var3 = tu.field_E.field_i[this.field_hb[var2_int]];
                              if (100 > var3.field_r) {
                                break L5;
                              } else {
                                L6: {
                                  if ((var3.field_n ^ -1) > -101) {
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
                                stackIn_29_0 = 1;
                                decompiledRegionSelector0 = 3;
                                break L0;
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
                    stackIn_32_0 = 0;
                    break L3;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_9_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_6_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.I(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_32_0 != 0;
            } else {
              return stackIn_29_0 != 0;
            }
          }
        }
    }

    private final void i(int param0) {
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
        int statePc = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    on.a(22, 95, 596, 225, 10, 0, 96);
                    pt.a(618, param0 ^ -16754303, 22, 305, 110);
                    var2_int = this.field_ib;
                    un.field_d.d("<u=FFFFFF>" + dw.field_b.toUpperCase() + "</u>", 320 + var2_int, 125 + this.field_Q, 16777215, -1);
                    un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 140, this.field_Q + 130, 16777215, -1);
                    un.field_d.d(nu.field_a.toUpperCase(), 500 - -var2_int, this.field_Q + 130, 16777215, -1);
                    var3 = this.field_Q + 140;
                    var4 = 360 + var2_int;
                    st.b(var4, param0 ^ 16777113, var3);
                    jk.a(param0 ^ 0);
                    var5 = this.field_u[this.field_h];
                    var6 = this.field_u[1 + -this.field_h];
                    stackIn_4_0 = un.field_d;
                    stackIn_2_0 = stackIn_4_0;
                    stackIn_4_1 = vo.a((byte) -18, ei.field_c, new String[]{Integer.toString(var5)});
                    stackIn_2_1 = stackIn_4_1;
                    stackIn_4_2 = -40 + var4;
                    stackIn_2_2 = stackIn_4_2;
                    stackIn_4_3 = var3 - -46;
                    stackIn_2_3 = stackIn_4_3;
                    if ((var6 ^ -1) <= (var5 ^ -1)) {
                        statePc = 4;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    stackIn_8_0 = (cn) ((Object) stackIn_2_0);
                    stackIn_8_1 = (String) ((Object) stackIn_2_1);
                    stackIn_8_2 = stackIn_2_2;
                    stackIn_8_3 = stackIn_2_3;
                    stackIn_8_4 = 65280;
                    statePc = 8;
                    continue stateLoop;
                }
                case 4: {
                    stackIn_7_0 = (cn) ((Object) stackIn_4_0);
                    stackIn_5_0 = stackIn_7_0;
                    stackIn_7_1 = (String) ((Object) stackIn_4_1);
                    stackIn_5_1 = stackIn_7_1;
                    stackIn_7_2 = stackIn_4_2;
                    stackIn_5_2 = stackIn_7_2;
                    stackIn_7_3 = stackIn_4_3;
                    stackIn_5_3 = stackIn_7_3;
                    if (var5 >= var6) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackIn_8_0 = (cn) ((Object) stackIn_5_0);
                    stackIn_8_1 = (String) ((Object) stackIn_5_1);
                    stackIn_8_2 = stackIn_5_2;
                    stackIn_8_3 = stackIn_5_3;
                    stackIn_8_4 = 16711680;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackIn_8_0 = (cn) ((Object) stackIn_7_0);
                    stackIn_8_1 = (String) ((Object) stackIn_7_1);
                    stackIn_8_2 = stackIn_7_2;
                    stackIn_8_3 = stackIn_7_3;
                    stackIn_8_4 = 255;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    ((cn) (Object) stackIn_8_0).d(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, -1);
                    stackIn_11_0 = un.field_d;
                    stackIn_9_0 = stackIn_11_0;
                    stackIn_11_1 = vo.a((byte) -18, ei.field_c, new String[]{Integer.toString(var6)});
                    stackIn_9_1 = stackIn_11_1;
                    stackIn_11_2 = var4 - 40;
                    stackIn_9_2 = stackIn_11_2;
                    stackIn_11_3 = 87 + var3;
                    stackIn_9_3 = stackIn_11_3;
                    if (var5 >= var6) {
                        statePc = 11;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_15_0 = (cn) ((Object) stackIn_9_0);
                    stackIn_15_1 = (String) ((Object) stackIn_9_1);
                    stackIn_15_2 = stackIn_9_2;
                    stackIn_15_3 = stackIn_9_3;
                    stackIn_15_4 = 65280;
                    statePc = 15;
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = (cn) ((Object) stackIn_11_0);
                    stackIn_12_0 = stackIn_14_0;
                    stackIn_14_1 = (String) ((Object) stackIn_11_1);
                    stackIn_12_1 = stackIn_14_1;
                    stackIn_14_2 = stackIn_11_2;
                    stackIn_12_2 = stackIn_14_2;
                    stackIn_14_3 = stackIn_11_3;
                    stackIn_12_3 = stackIn_14_3;
                    if ((var6 ^ -1) > (var5 ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_15_0 = (cn) ((Object) stackIn_12_0);
                    stackIn_15_1 = (String) ((Object) stackIn_12_1);
                    stackIn_15_2 = stackIn_12_2;
                    stackIn_15_3 = stackIn_12_3;
                    stackIn_15_4 = 255;
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (cn) ((Object) stackIn_14_0);
                    stackIn_15_1 = (String) ((Object) stackIn_14_1);
                    stackIn_15_2 = stackIn_14_2;
                    stackIn_15_3 = stackIn_14_3;
                    stackIn_15_4 = 16711680;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    ((cn) (Object) stackIn_15_0).d(stackIn_15_1, stackIn_15_2, stackIn_15_3, stackIn_15_4, -1);
                    var7 = var2_int + 60;
                    var8 = this.field_Q + 140;
                    pt.a(160 + var7, -22914, var7, var8 - -21, var8);
                    on.i(var7, var8, 160, 42, 10, 65793);
                    un.field_d.d(ib.field_H, 80 + var7, 17 + var8, 16777215, -1);
                    ta.e(124);
                    var8 += 40;
                    var9 = 0;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (var9 >= this.field_a.field_g.length) {
                        statePc = 32;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackIn_34_0 = 0;
                    stackIn_18_0 = stackIn_34_0;
                    stackIn_34_1 = this.field_a.field_g[var9].field_p;
                    stackIn_18_1 = stackIn_34_1;
                    if (var15 != 0) {
                        statePc = 34;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (stackIn_18_0 == stackIn_18_1) {
                        statePc = 24;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (var15 == 0) {
                        statePc = 31;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    var10 = this.field_a.field_R[var9];
                    var11 = var10.field_v ? 1 : 0;
                    if (var11 != 0) {
                        statePc = 27;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    stackIn_28_0 = 16777215;
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = 11184810;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    var12 = stackIn_28_0;
                    var13 = 65793;
                    var14 = 128;
                    if ((var9 ^ -1) != (this.field_g ^ -1)) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    var13 = 16777215;
                    var14 = 50;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    on.a(var7, -17 + var8, 160, 21, var13, var14);
                    un.field_d.d(this.field_a.field_S[var9], var7 + 80, var8, var12, -1);
                    on.a(2 + var7 + 160, -17 + var8, 40, 21, var13, var14);
                    un.field_d.d(vo.a((byte) -18, ei.field_c, new String[]{Integer.toString(this.field_k[var9])}), 160 + (var7 + 22), var8, var12, -1);
                    var8 += 23;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    var9++;
                    if (var15 == 0) {
                        statePc = 16;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    var9 = 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = 16;
                    stackIn_34_1 = var9;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    if (stackIn_34_0 <= stackIn_34_1) {
                        statePc = 41;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    on.c(var7, var9 + (4 + (var8 + -21)), 160, 65793, -(var9 << -86451773) + 128);
                    on.c(160 + var7 - -2, 4 + var8 - (21 + -var9), 40, 65793, -(var9 << 521151011) + 128);
                    var9++;
                    if (var15 != 0) {
                        statePc = 42;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    if (var15 == 0) {
                        statePc = 33;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    var8 = 140 - -this.field_Q;
                    var7 = var2_int + 420;
                    pt.a(var7 - -160, param0 + -16800129, var7, var8 - -21, var8);
                    on.i(var7, var8, 160, 42, 10, 65793);
                    un.field_d.d(ib.field_H, var7 - -80, var8 - -17, 16777215, -1);
                    ta.e(117);
                    var8 += 40;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    var9 = 0;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if ((this.field_a.field_g.length ^ -1) >= (var9 ^ -1)) {
                        statePc = 59;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_61_0 = -2;
                    stackIn_45_0 = stackIn_61_0;
                    stackIn_61_1 = this.field_a.field_g[var9].field_p ^ -1;
                    stackIn_45_1 = stackIn_61_1;
                    if (var15 != 0) {
                        statePc = 61;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    if (stackIn_45_0 == stackIn_45_1) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if (var15 == 0) {
                        statePc = 58;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    var10 = this.field_a.field_R[var9];
                    var11 = var10.field_v ? 1 : 0;
                    if (var11 != 0) {
                        statePc = 54;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    stackIn_55_0 = 16777215;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackIn_55_0 = 11184810;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var12 = stackIn_55_0;
                    var13 = 65793;
                    var14 = 128;
                    if ((var9 ^ -1) != (this.field_g ^ -1)) {
                        statePc = 57;
                    } else {
                        statePc = 56;
                    }
                    continue stateLoop;
                }
                case 56: {
                    var13 = 16777215;
                    var14 = 50;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    on.a(var7, var8 + -17, 160, 21, var13, var14);
                    un.field_d.d(this.field_a.field_S[var9], var7 - -80, var8, var12, -1);
                    on.a(var7 - 42, var8 - 17, 40, 21, var13, var14);
                    un.field_d.d(vo.a((byte) -18, ei.field_c, new String[]{Integer.toString(this.field_k[var9])}), -22 + var7, var8, var12, -1);
                    var8 += 23;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    var9++;
                    if (var15 == 0) {
                        statePc = 43;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    var9 = 0;
                    statePc = 60;
                    continue stateLoop;
                }
                case 60: {
                    stackIn_61_0 = var9;
                    stackIn_61_1 = 16;
                    statePc = 61;
                    continue stateLoop;
                }
                case 61: {
                    if (stackIn_61_0 >= stackIn_61_1) {
                        statePc = 68;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    on.c(var7, var9 + -17 + var8, 160, 65793, 128 + -(var9 << -1085460061));
                    on.c(-42 + var7, var9 + -21 + (var8 - -4), 40, 65793, -(var9 << -440106333) + 128);
                    var9++;
                    if (var15 != 0) {
                        statePc = 76;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (var15 == 0) {
                        statePc = 60;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    stackIn_72_0 = this.field_eb;
                    stackIn_69_0 = stackIn_72_0;
                    stackIn_72_1 = this.field_db;
                    stackIn_69_1 = stackIn_72_1;
                    stackIn_72_2 = 32;
                    stackIn_69_2 = stackIn_72_2;
                    stackIn_72_3 = 195;
                    stackIn_69_3 = stackIn_72_3;
                    stackIn_72_4 = 8;
                    stackIn_69_4 = stackIn_72_4;
                    if (this.field_K) {
                        statePc = 72;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackIn_74_0 = stackIn_69_0;
                    stackIn_70_0 = stackIn_74_0;
                    stackIn_74_1 = stackIn_69_1;
                    stackIn_70_1 = stackIn_74_1;
                    stackIn_74_2 = stackIn_69_2;
                    stackIn_70_2 = stackIn_74_2;
                    stackIn_74_3 = stackIn_69_3;
                    stackIn_70_3 = stackIn_74_3;
                    stackIn_74_4 = stackIn_69_4;
                    stackIn_70_4 = stackIn_74_4;
                    if (!this.field_W) {
                        statePc = 74;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    stackIn_72_0 = stackIn_70_0;
                    stackIn_72_1 = stackIn_70_1;
                    stackIn_72_2 = stackIn_70_2;
                    stackIn_72_3 = stackIn_70_3;
                    stackIn_72_4 = stackIn_70_4;
                    statePc = 72;
                    continue stateLoop;
                }
                case 72: {
                    stackIn_75_0 = stackIn_72_0;
                    stackIn_75_1 = stackIn_72_1;
                    stackIn_75_2 = stackIn_72_2;
                    stackIn_75_3 = stackIn_72_3;
                    stackIn_75_4 = stackIn_72_4;
                    stackIn_75_5 = 11184810;
                    statePc = 75;
                    continue stateLoop;
                }
                case 74: {
                    stackIn_75_0 = stackIn_74_0;
                    stackIn_75_1 = stackIn_74_1;
                    stackIn_75_2 = stackIn_74_2;
                    stackIn_75_3 = stackIn_74_3;
                    stackIn_75_4 = stackIn_74_4;
                    stackIn_75_5 = this.field_cb;
                    statePc = 75;
                    continue stateLoop;
                }
                case 75: {
                    on.a(stackIn_75_0, stackIn_75_1, stackIn_75_2, stackIn_75_3, stackIn_75_4, stackIn_75_5, 128);
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    stackIn_82_0 = un.field_d;
                    stackIn_77_0 = stackIn_82_0;
                    stackIn_82_1 = qb.field_Vb;
                    stackIn_77_1 = stackIn_82_1;
                    stackIn_82_2 = this.field_eb + 14;
                    stackIn_77_2 = stackIn_82_2;
                    stackIn_82_3 = this.field_db + 97 - -(un.field_d.a(qb.field_Vb) >> 2904033);
                    stackIn_77_3 = stackIn_82_3;
                    if (this.field_K) {
                        statePc = 82;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    stackIn_82_0 = (cn) ((Object) stackIn_77_0);
                    stackIn_78_0 = stackIn_82_0;
                    stackIn_82_1 = (String) ((Object) stackIn_77_1);
                    stackIn_78_1 = stackIn_82_1;
                    stackIn_82_2 = stackIn_77_2;
                    stackIn_78_2 = stackIn_82_2;
                    stackIn_82_3 = stackIn_77_3;
                    stackIn_78_3 = stackIn_82_3;
                    if (this.field_W) {
                        statePc = 82;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    stackIn_80_0 = (cn) ((Object) stackIn_78_0);
                    stackIn_80_1 = (String) ((Object) stackIn_78_1);
                    stackIn_80_2 = stackIn_78_2;
                    stackIn_80_3 = stackIn_78_3;
                    statePc = 80;
                    continue stateLoop;
                }
                case 80: {
                    stackIn_83_0 = (cn) ((Object) stackIn_80_0);
                    stackIn_83_1 = (String) ((Object) stackIn_80_1);
                    stackIn_83_2 = stackIn_80_2;
                    stackIn_83_3 = stackIn_80_3;
                    stackIn_83_4 = 11184810;
                    statePc = 83;
                    continue stateLoop;
                }
                case 82: {
                    stackIn_83_0 = (cn) ((Object) stackIn_82_0);
                    stackIn_83_1 = (String) ((Object) stackIn_82_1);
                    stackIn_83_2 = stackIn_82_2;
                    stackIn_83_3 = stackIn_82_3;
                    stackIn_83_4 = 65793;
                    statePc = 83;
                    continue stateLoop;
                }
                case 83: {
                    ((cn) (Object) stackIn_83_0).b(stackIn_83_1, stackIn_83_2, stackIn_83_3, stackIn_83_4, -1);
                    var2_int += 596;
                    stackIn_89_0 = un.field_d;
                    stackIn_84_0 = stackIn_89_0;
                    stackIn_89_1 = dw.field_b;
                    stackIn_84_1 = stackIn_89_1;
                    stackIn_89_2 = this.field_eb - -29;
                    stackIn_84_2 = stackIn_89_2;
                    stackIn_89_3 = 97 + this.field_db + (un.field_d.a(dw.field_b) >> 481548161);
                    stackIn_84_3 = stackIn_89_3;
                    if (this.field_K) {
                        statePc = 89;
                    } else {
                        statePc = 84;
                    }
                    continue stateLoop;
                }
                case 84: {
                    stackIn_89_0 = (cn) ((Object) stackIn_84_0);
                    stackIn_85_0 = stackIn_89_0;
                    stackIn_89_1 = (String) ((Object) stackIn_84_1);
                    stackIn_85_1 = stackIn_89_1;
                    stackIn_89_2 = stackIn_84_2;
                    stackIn_85_2 = stackIn_89_2;
                    stackIn_89_3 = stackIn_84_3;
                    stackIn_85_3 = stackIn_89_3;
                    if (this.field_W) {
                        statePc = 89;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackIn_87_0 = (cn) ((Object) stackIn_85_0);
                    stackIn_87_1 = (String) ((Object) stackIn_85_1);
                    stackIn_87_2 = stackIn_85_2;
                    stackIn_87_3 = stackIn_85_3;
                    statePc = 87;
                    continue stateLoop;
                }
                case 87: {
                    stackIn_90_0 = (cn) ((Object) stackIn_87_0);
                    stackIn_90_1 = (String) ((Object) stackIn_87_1);
                    stackIn_90_2 = stackIn_87_2;
                    stackIn_90_3 = stackIn_87_3;
                    stackIn_90_4 = 11184810;
                    statePc = 90;
                    continue stateLoop;
                }
                case 89: {
                    stackIn_90_0 = (cn) ((Object) stackIn_89_0);
                    stackIn_90_1 = (String) ((Object) stackIn_89_1);
                    stackIn_90_2 = stackIn_89_2;
                    stackIn_90_3 = stackIn_89_3;
                    stackIn_90_4 = 65793;
                    statePc = 90;
                    continue stateLoop;
                }
                case 90: {
                    ((cn) (Object) stackIn_90_0).b(stackIn_90_1, stackIn_90_2, stackIn_90_3, stackIn_90_4, -1);
                    var9 = this.field_Q;
                    un.field_d.d("<u=FFFFFF>" + qb.field_Vb.toUpperCase() + "</u>", 320 + var2_int, 125 + var9, 16777215, -1);
                    var9 += 160;
                    on.a(var2_int + 42, var9 + -20, 552, 28, 10, 65793, 128);
                    un.field_d.d(he.field_Ub.toUpperCase(), var2_int + 320, var9, param0, -1);
                    var9 += 20;
                    var10_ref = this.field_bb;
                    var9 = this.a(var10_ref, var2_int, var9, true);
                    var9 += 35;
                    on.a(42 + var2_int, var9 - 20, 552, 28, 10, 65793, 128);
                    un.field_d.d(nu.field_a.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                    var10_ref = this.field_q;
                    var9 += 20;
                    var9 = this.a(var10_ref, var2_int, var9, true);
                    if ((this.field_P ^ -1) == -1) {
                        statePc = 105;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (this.field_M > this.field_P) {
                        statePc = 96;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 96: {
                    ta.e(param0 + -16777091);
                    pt.a(618, -22914, 22, 320, 110);
                    stackIn_99_0 = this.field_x;
                    stackIn_97_0 = stackIn_99_0;
                    stackIn_99_1 = this.field_B;
                    stackIn_97_1 = stackIn_99_1;
                    stackIn_99_2 = 570;
                    stackIn_97_2 = stackIn_99_2;
                    stackIn_99_3 = 24;
                    stackIn_97_3 = stackIn_99_3;
                    stackIn_99_4 = 8;
                    stackIn_97_4 = stackIn_99_4;
                    if (this.field_y) {
                        statePc = 99;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackIn_100_0 = stackIn_97_0;
                    stackIn_100_1 = stackIn_97_1;
                    stackIn_100_2 = stackIn_97_2;
                    stackIn_100_3 = stackIn_97_3;
                    stackIn_100_4 = stackIn_97_4;
                    stackIn_100_5 = this.field_cb;
                    statePc = 100;
                    continue stateLoop;
                }
                case 99: {
                    stackIn_100_0 = stackIn_99_0;
                    stackIn_100_1 = stackIn_99_1;
                    stackIn_100_2 = stackIn_99_2;
                    stackIn_100_3 = stackIn_99_3;
                    stackIn_100_4 = stackIn_99_4;
                    stackIn_100_5 = 11184810;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    on.a(stackIn_100_0, stackIn_100_1, stackIn_100_2, stackIn_100_3, stackIn_100_4, stackIn_100_5, 128);
                    stackIn_103_0 = un.field_d;
                    stackIn_101_0 = stackIn_103_0;
                    stackIn_103_1 = qt.field_h;
                    stackIn_101_1 = stackIn_103_1;
                    stackIn_103_2 = this.field_x + 285;
                    stackIn_101_2 = stackIn_103_2;
                    stackIn_103_3 = this.field_B - -12;
                    stackIn_101_3 = stackIn_103_3;
                    if (this.field_y) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackIn_104_0 = (cn) ((Object) stackIn_101_0);
                    stackIn_104_1 = (String) ((Object) stackIn_101_1);
                    stackIn_104_2 = stackIn_101_2;
                    stackIn_104_3 = stackIn_101_3;
                    stackIn_104_4 = 11184810;
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackIn_104_0 = (cn) ((Object) stackIn_103_0);
                    stackIn_104_1 = (String) ((Object) stackIn_103_1);
                    stackIn_104_2 = stackIn_103_2;
                    stackIn_104_3 = stackIn_103_3;
                    stackIn_104_4 = 65793;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    ((cn) (Object) stackIn_104_0).d(stackIn_104_1, stackIn_104_2, stackIn_104_3, stackIn_104_4, -1);
                    ta.e(param0 + -16777088);
                    pt.a(618, -22914, 22, 305, 110);
                    statePc = 105;
                    continue stateLoop;
                }
                case 105: {
                    if ((this.field_M ^ -1) != -1) {
                        statePc = 108;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 108: {
                    ta.e(119);
                    pt.a(618, -22914, 22, 320, 95);
                    stackIn_111_0 = this.field_T;
                    stackIn_109_0 = stackIn_111_0;
                    stackIn_111_1 = this.field_kb;
                    stackIn_109_1 = stackIn_111_1;
                    stackIn_111_2 = 570;
                    stackIn_109_2 = stackIn_111_2;
                    stackIn_111_3 = 24;
                    stackIn_109_3 = stackIn_111_3;
                    stackIn_111_4 = 8;
                    stackIn_109_4 = stackIn_111_4;
                    if (this.field_F) {
                        statePc = 111;
                    } else {
                        statePc = 109;
                    }
                    continue stateLoop;
                }
                case 109: {
                    stackIn_112_0 = stackIn_109_0;
                    stackIn_112_1 = stackIn_109_1;
                    stackIn_112_2 = stackIn_109_2;
                    stackIn_112_3 = stackIn_109_3;
                    stackIn_112_4 = stackIn_109_4;
                    stackIn_112_5 = this.field_cb;
                    statePc = 112;
                    continue stateLoop;
                }
                case 111: {
                    stackIn_112_0 = stackIn_111_0;
                    stackIn_112_1 = stackIn_111_1;
                    stackIn_112_2 = stackIn_111_2;
                    stackIn_112_3 = stackIn_111_3;
                    stackIn_112_4 = stackIn_111_4;
                    stackIn_112_5 = 11184810;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    on.a(stackIn_112_0, stackIn_112_1, stackIn_112_2, stackIn_112_3, stackIn_112_4, stackIn_112_5, 128);
                    stackIn_115_0 = un.field_d;
                    stackIn_113_0 = stackIn_115_0;
                    stackIn_115_1 = gu.field_Ib;
                    stackIn_113_1 = stackIn_115_1;
                    stackIn_115_2 = this.field_T + 285;
                    stackIn_113_2 = stackIn_115_2;
                    stackIn_115_3 = this.field_kb - -24 + -1;
                    stackIn_113_3 = stackIn_115_3;
                    if (this.field_F) {
                        statePc = 115;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    stackIn_116_0 = (cn) ((Object) stackIn_113_0);
                    stackIn_116_1 = (String) ((Object) stackIn_113_1);
                    stackIn_116_2 = stackIn_113_2;
                    stackIn_116_3 = stackIn_113_3;
                    stackIn_116_4 = 11184810;
                    statePc = 116;
                    continue stateLoop;
                }
                case 115: {
                    stackIn_116_0 = (cn) ((Object) stackIn_115_0);
                    stackIn_116_1 = (String) ((Object) stackIn_115_1);
                    stackIn_116_2 = stackIn_115_2;
                    stackIn_116_3 = stackIn_115_3;
                    stackIn_116_4 = 65793;
                    statePc = 116;
                    continue stateLoop;
                }
                case 116: {
                    ((cn) (Object) stackIn_116_0).d(stackIn_116_1, stackIn_116_2, stackIn_116_3, stackIn_116_4, -1);
                    ta.e(127);
                    pt.a(618, -22914, 22, 305, 110);
                    statePc = 117;
                    continue stateLoop;
                }
                case 117: {
                    stackIn_121_0 = this.field_L;
                    stackIn_118_0 = stackIn_121_0;
                    stackIn_121_1 = this.field_r;
                    stackIn_118_1 = stackIn_121_1;
                    stackIn_121_2 = 32;
                    stackIn_118_2 = stackIn_121_2;
                    stackIn_121_3 = 195;
                    stackIn_118_3 = stackIn_121_3;
                    stackIn_121_4 = 8;
                    stackIn_118_4 = stackIn_121_4;
                    if (this.field_C) {
                        statePc = 121;
                    } else {
                        statePc = 118;
                    }
                    continue stateLoop;
                }
                case 118: {
                    stackIn_123_0 = stackIn_118_0;
                    stackIn_119_0 = stackIn_123_0;
                    stackIn_123_1 = stackIn_118_1;
                    stackIn_119_1 = stackIn_123_1;
                    stackIn_123_2 = stackIn_118_2;
                    stackIn_119_2 = stackIn_123_2;
                    stackIn_123_3 = stackIn_118_3;
                    stackIn_119_3 = stackIn_123_3;
                    stackIn_123_4 = stackIn_118_4;
                    stackIn_119_4 = stackIn_123_4;
                    if (!this.field_D) {
                        statePc = 123;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    stackIn_121_0 = stackIn_119_0;
                    stackIn_121_1 = stackIn_119_1;
                    stackIn_121_2 = stackIn_119_2;
                    stackIn_121_3 = stackIn_119_3;
                    stackIn_121_4 = stackIn_119_4;
                    statePc = 121;
                    continue stateLoop;
                }
                case 121: {
                    stackIn_124_0 = stackIn_121_0;
                    stackIn_124_1 = stackIn_121_1;
                    stackIn_124_2 = stackIn_121_2;
                    stackIn_124_3 = stackIn_121_3;
                    stackIn_124_4 = stackIn_121_4;
                    stackIn_124_5 = 11184810;
                    statePc = 124;
                    continue stateLoop;
                }
                case 123: {
                    stackIn_124_0 = stackIn_123_0;
                    stackIn_124_1 = stackIn_123_1;
                    stackIn_124_2 = stackIn_123_2;
                    stackIn_124_3 = stackIn_123_3;
                    stackIn_124_4 = stackIn_123_4;
                    stackIn_124_5 = this.field_cb;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    on.a(stackIn_124_0, stackIn_124_1, stackIn_124_2, stackIn_124_3, stackIn_124_4, stackIn_124_5, 128);
                    stackIn_128_0 = un.field_d;
                    stackIn_125_0 = stackIn_128_0;
                    stackIn_128_1 = rd.field_d;
                    stackIn_125_1 = stackIn_128_1;
                    stackIn_128_2 = this.field_L + 14;
                    stackIn_125_2 = stackIn_128_2;
                    stackIn_128_3 = this.field_r - (-97 - (un.field_d.a(rd.field_d) >> 134543201));
                    stackIn_125_3 = stackIn_128_3;
                    if (this.field_C) {
                        statePc = 128;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackIn_130_0 = (cn) ((Object) stackIn_125_0);
                    stackIn_126_0 = stackIn_130_0;
                    stackIn_130_1 = (String) ((Object) stackIn_125_1);
                    stackIn_126_1 = stackIn_130_1;
                    stackIn_130_2 = stackIn_125_2;
                    stackIn_126_2 = stackIn_130_2;
                    stackIn_130_3 = stackIn_125_3;
                    stackIn_126_3 = stackIn_130_3;
                    if (!this.field_D) {
                        statePc = 130;
                    } else {
                        statePc = 126;
                    }
                    continue stateLoop;
                }
                case 126: {
                    stackIn_128_0 = (cn) ((Object) stackIn_126_0);
                    stackIn_128_1 = (String) ((Object) stackIn_126_1);
                    stackIn_128_2 = stackIn_126_2;
                    stackIn_128_3 = stackIn_126_3;
                    statePc = 128;
                    continue stateLoop;
                }
                case 128: {
                    stackIn_131_0 = (cn) ((Object) stackIn_128_0);
                    stackIn_131_1 = (String) ((Object) stackIn_128_1);
                    stackIn_131_2 = stackIn_128_2;
                    stackIn_131_3 = stackIn_128_3;
                    stackIn_131_4 = 65793;
                    statePc = 131;
                    continue stateLoop;
                }
                case 130: {
                    stackIn_131_0 = (cn) ((Object) stackIn_130_0);
                    stackIn_131_1 = (String) ((Object) stackIn_130_1);
                    stackIn_131_2 = stackIn_130_2;
                    stackIn_131_3 = stackIn_130_3;
                    stackIn_131_4 = 11184810;
                    statePc = 131;
                    continue stateLoop;
                }
                case 131: {
                    ((cn) (Object) stackIn_131_0).b(stackIn_131_1, stackIn_131_2, stackIn_131_3, stackIn_131_4, -1);
                    var2_int += 596;
                    stackIn_135_0 = un.field_d;
                    stackIn_132_0 = stackIn_135_0;
                    stackIn_135_1 = qb.field_Vb;
                    stackIn_132_1 = stackIn_135_1;
                    stackIn_135_2 = 29 + this.field_L;
                    stackIn_132_2 = stackIn_135_2;
                    stackIn_135_3 = this.field_r + (97 - -(un.field_d.a(qb.field_Vb) >> -1823210079));
                    stackIn_132_3 = stackIn_135_3;
                    if (this.field_C) {
                        statePc = 135;
                    } else {
                        statePc = 132;
                    }
                    continue stateLoop;
                }
                case 132: {
                    stackIn_137_0 = (cn) ((Object) stackIn_132_0);
                    stackIn_133_0 = stackIn_137_0;
                    stackIn_137_1 = (String) ((Object) stackIn_132_1);
                    stackIn_133_1 = stackIn_137_1;
                    stackIn_137_2 = stackIn_132_2;
                    stackIn_133_2 = stackIn_137_2;
                    stackIn_137_3 = stackIn_132_3;
                    stackIn_133_3 = stackIn_137_3;
                    if (!this.field_D) {
                        statePc = 137;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackIn_135_0 = (cn) ((Object) stackIn_133_0);
                    stackIn_135_1 = (String) ((Object) stackIn_133_1);
                    stackIn_135_2 = stackIn_133_2;
                    stackIn_135_3 = stackIn_133_3;
                    statePc = 135;
                    continue stateLoop;
                }
                case 135: {
                    stackIn_138_0 = (cn) ((Object) stackIn_135_0);
                    stackIn_138_1 = (String) ((Object) stackIn_135_1);
                    stackIn_138_2 = stackIn_135_2;
                    stackIn_138_3 = stackIn_135_3;
                    stackIn_138_4 = 65793;
                    statePc = 138;
                    continue stateLoop;
                }
                case 137: {
                    stackIn_138_0 = (cn) ((Object) stackIn_137_0);
                    stackIn_138_1 = (String) ((Object) stackIn_137_1);
                    stackIn_138_2 = stackIn_137_2;
                    stackIn_138_3 = stackIn_137_3;
                    stackIn_138_4 = 11184810;
                    statePc = 138;
                    continue stateLoop;
                }
                case 138: {
                    ((cn) (Object) stackIn_138_0).b(stackIn_138_1, stackIn_138_2, stackIn_138_3, stackIn_138_4, -1);
                    var9 = this.field_Q;
                    un.field_d.d("<u=FFFFFF>" + rd.field_d.toUpperCase() + "</u>", 320 - -var2_int, 125 - -this.field_Q, 16777215, -1);
                    var9 += 160;
                    on.a(42 - -var2_int, -20 + var9, 552, 28, 10, 65793, 128);
                    un.field_d.d(lw.field_f.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                    var11 = var2_int - -240;
                    var12 = 80 + var9;
                    eo.a(var11, var12, qe.field_j, this.field_p, (String[]) null, 160, 21, this.field_a.field_I, this.field_a.field_S, this.field_g);
                    var9 = var9 + (140 + 25 * (this.field_a.field_I - -1));
                    on.a(var2_int + 42, -20 + var9, 552, 28, 10, 65793, 128);
                    var12 = var9 + 80;
                    un.field_d.d(ad.field_b.toUpperCase(), var2_int + 320, var9, 16777215, -1);
                    eo.a(var11, var12, d.field_c, this.field_ab, (String[]) null, 160, 21, this.field_a.field_I, this.field_a.field_S, this.field_g);
                    var9 = var9 + ((1 + this.field_a.field_I) * 25 + 140);
                    if (this.field_lb == 0) {
                        statePc = 153;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    if (this.field_lb < this.field_M) {
                        statePc = 144;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 144: {
                    ta.e(122);
                    pt.a(618, param0 ^ -16754303, 22, 320, 110);
                    stackIn_147_0 = this.field_H;
                    stackIn_145_0 = stackIn_147_0;
                    stackIn_147_1 = this.field_jb;
                    stackIn_145_1 = stackIn_147_1;
                    stackIn_147_2 = 570;
                    stackIn_145_2 = stackIn_147_2;
                    stackIn_147_3 = 24;
                    stackIn_145_3 = stackIn_147_3;
                    stackIn_147_4 = 8;
                    stackIn_145_4 = stackIn_147_4;
                    if (!this.field_U) {
                        statePc = 147;
                    } else {
                        statePc = 145;
                    }
                    continue stateLoop;
                }
                case 145: {
                    stackIn_148_0 = stackIn_145_0;
                    stackIn_148_1 = stackIn_145_1;
                    stackIn_148_2 = stackIn_145_2;
                    stackIn_148_3 = stackIn_145_3;
                    stackIn_148_4 = stackIn_145_4;
                    stackIn_148_5 = 11184810;
                    statePc = 148;
                    continue stateLoop;
                }
                case 147: {
                    stackIn_148_0 = stackIn_147_0;
                    stackIn_148_1 = stackIn_147_1;
                    stackIn_148_2 = stackIn_147_2;
                    stackIn_148_3 = stackIn_147_3;
                    stackIn_148_4 = stackIn_147_4;
                    stackIn_148_5 = this.field_cb;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    on.a(stackIn_148_0, stackIn_148_1, stackIn_148_2, stackIn_148_3, stackIn_148_4, stackIn_148_5, 128);
                    stackIn_151_0 = un.field_d;
                    stackIn_149_0 = stackIn_151_0;
                    stackIn_151_1 = qt.field_h;
                    stackIn_149_1 = stackIn_151_1;
                    stackIn_151_2 = 285 + this.field_H;
                    stackIn_149_2 = stackIn_151_2;
                    stackIn_151_3 = 12 + this.field_jb;
                    stackIn_149_3 = stackIn_151_3;
                    if (this.field_U) {
                        statePc = 151;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    stackIn_152_0 = (cn) ((Object) stackIn_149_0);
                    stackIn_152_1 = (String) ((Object) stackIn_149_1);
                    stackIn_152_2 = stackIn_149_2;
                    stackIn_152_3 = stackIn_149_3;
                    stackIn_152_4 = 11184810;
                    statePc = 152;
                    continue stateLoop;
                }
                case 151: {
                    stackIn_152_0 = (cn) ((Object) stackIn_151_0);
                    stackIn_152_1 = (String) ((Object) stackIn_151_1);
                    stackIn_152_2 = stackIn_151_2;
                    stackIn_152_3 = stackIn_151_3;
                    stackIn_152_4 = 65793;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    ((cn) (Object) stackIn_152_0).d(stackIn_152_1, stackIn_152_2, stackIn_152_3, stackIn_152_4, -1);
                    ta.e(117);
                    pt.a(618, param0 ^ -16754303, 22, 305, 110);
                    statePc = 153;
                    continue stateLoop;
                }
                case 153: {
                    if (-1 == (this.field_M ^ -1)) {
                        statePc = 165;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    ta.e(param0 ^ 16777090);
                    pt.a(618, -22914, 22, 320, 95);
                    stackIn_159_0 = this.field_v;
                    stackIn_155_0 = stackIn_159_0;
                    stackIn_159_1 = this.field_A;
                    stackIn_155_1 = stackIn_159_1;
                    stackIn_159_2 = 570;
                    stackIn_155_2 = stackIn_159_2;
                    stackIn_159_3 = 24;
                    stackIn_155_3 = stackIn_159_3;
                    stackIn_159_4 = 8;
                    stackIn_155_4 = stackIn_159_4;
                    if (!this.field_t) {
                        statePc = 159;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackIn_157_0 = stackIn_155_0;
                    stackIn_157_1 = stackIn_155_1;
                    stackIn_157_2 = stackIn_155_2;
                    stackIn_157_3 = stackIn_155_3;
                    stackIn_157_4 = stackIn_155_4;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackIn_160_0 = stackIn_157_0;
                    stackIn_160_1 = stackIn_157_1;
                    stackIn_160_2 = stackIn_157_2;
                    stackIn_160_3 = stackIn_157_3;
                    stackIn_160_4 = stackIn_157_4;
                    stackIn_160_5 = 11184810;
                    statePc = 160;
                    continue stateLoop;
                }
                case 159: {
                    stackIn_160_0 = stackIn_159_0;
                    stackIn_160_1 = stackIn_159_1;
                    stackIn_160_2 = stackIn_159_2;
                    stackIn_160_3 = stackIn_159_3;
                    stackIn_160_4 = stackIn_159_4;
                    stackIn_160_5 = this.field_cb;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    on.a(stackIn_160_0, stackIn_160_1, stackIn_160_2, stackIn_160_3, stackIn_160_4, stackIn_160_5, 128);
                    stackIn_163_0 = un.field_d;
                    stackIn_161_0 = stackIn_163_0;
                    stackIn_163_1 = gu.field_Ib;
                    stackIn_161_1 = stackIn_163_1;
                    stackIn_163_2 = 285 + this.field_v;
                    stackIn_161_2 = stackIn_163_2;
                    stackIn_163_3 = -1 + this.field_A - -24;
                    stackIn_161_3 = stackIn_163_3;
                    if (!this.field_t) {
                        statePc = 163;
                    } else {
                        statePc = 161;
                    }
                    continue stateLoop;
                }
                case 161: {
                    stackIn_164_0 = (cn) ((Object) stackIn_161_0);
                    stackIn_164_1 = (String) ((Object) stackIn_161_1);
                    stackIn_164_2 = stackIn_161_2;
                    stackIn_164_3 = stackIn_161_3;
                    stackIn_164_4 = 65793;
                    statePc = 164;
                    continue stateLoop;
                }
                case 163: {
                    stackIn_164_0 = (cn) ((Object) stackIn_163_0);
                    stackIn_164_1 = (String) ((Object) stackIn_163_1);
                    stackIn_164_2 = stackIn_163_2;
                    stackIn_164_3 = stackIn_163_3;
                    stackIn_164_4 = 11184810;
                    statePc = 164;
                    continue stateLoop;
                }
                case 164: {
                    ((cn) (Object) stackIn_164_0).d(stackIn_164_1, stackIn_164_2, stackIn_164_3, stackIn_164_4, -1);
                    ta.e(param0 + -16777089);
                    pt.a(618, param0 ^ -16754303, 22, 305, 110);
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    ta.e(127);
                    statePc = 168;
                    continue stateLoop;
                }
                case 168: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean e(int param0, int param1) {
        int stackIn_2_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_88_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          L0: {
            var3_int = this.field_c[param0].field_m;
            if (param1 == 50) {
              if (this.field_g == -2) {
                if (!this.field_a.field_L) {
                  L1: {
                    L2: {
                      if ((var3_int ^ -1) == -13) {
                        break L2;
                      } else {
                        if (56 != var3_int) {
                          stackIn_88_0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_88_0 = 1;
                    break L1;
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  L3: {
                    L4: {
                      if ((var3_int ^ -1) == -56) {
                        break L4;
                      } else {
                        if (56 != var3_int) {
                          stackIn_80_0 = 0;
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackIn_80_0 = 1;
                    break L3;
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                if (this.field_a.field_L) {
                  L5: {
                    L6: {
                      if (-56 == (var3_int ^ -1)) {
                        break L6;
                      } else {
                        L7: {
                          if (this.field_a.field_e) {
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
                          if (this.field_a.field_e) {
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
                          if (!this.field_a.field_e) {
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
                            if ((ok.field_a.a(false) ^ -1) >= -1) {
                              break L10;
                            } else {
                              break L6;
                            }
                          }
                        }
                        stackIn_69_0 = 0;
                        break L5;
                      }
                    }
                    stackIn_69_0 = 1;
                    break L5;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L11: {
                    L12: {
                      if (-13 == (var3_int ^ -1)) {
                        break L12;
                      } else {
                        L13: {
                          if (this.field_a.field_e) {
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
                          if (this.field_a.field_e) {
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
                          if (!this.field_a.field_e) {
                            break L15;
                          } else {
                            if (-57 == (var3_int ^ -1)) {
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
                              if (-1 <= (ok.field_a.a(false) ^ -1)) {
                                break L16;
                              } else {
                                break L12;
                              }
                            }
                          }
                          stackIn_40_0 = 0;
                          break L11;
                        }
                      }
                    }
                    stackIn_40_0 = 1;
                    break L11;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.N(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_40_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_69_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_80_0 != 0;
              } else {
                return stackIn_88_0 != 0;
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        String var6 = null;
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
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6_int >= 4) {
                            statePc = 24;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackIn_25_0 = 0;
                        stackIn_4_0 = stackIn_25_0;
                        stackIn_25_1 = this.field_hb[var6_int] ^ -1;
                        stackIn_4_1 = stackIn_25_1;
                        if (var10 != 0) {
                            statePc = 25;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 == stackIn_4_1) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var7 = this.field_o[var6_int].field_Eb;
                        on.a(-30 + this.field_o[var6_int].field_F, 92, 110, 180, 10, 0, 128);
                        this.field_o[var6_int].h((byte) -116);
                        this.field_s[var6_int].a(59, true);
                        if (var7.field_n < 100) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (100 > var7.field_g) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (100 > var7.field_o) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        wq.a(-23 + this.field_o[var6_int].field_F, param1, 150, (byte) 32, hv.field_b, 100);
                        if (var10 == 0) {
                            statePc = 23;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var8 = Math.abs(this.field_j);
                        var8 = var8 | Math.abs(this.field_j) << -2037542264;
                        var8 = var8 | 16711680;
                        eo.a(this.field_o[var6_int].field_F - 25, this.field_o[var6_int].field_T - -80, var7.field_r, 3, false, 0);
                        var9 = "";
                        if ((this.field_l[var6_int] ^ -1) >= -1) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var9 = var9 + rg.field_d + "+" + this.field_l[var6_int];
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var7.field_r ^ -1) > -101) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var9 = var9 + "<br>" + ss.field_e + "<col=" + Integer.toHexString(var8) + ">Max</col>";
                        if (var10 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var9 = var9 + "<br>" + ss.field_e + var7.field_r;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        wq.a(-30 + this.field_o[var6_int].field_F, param1, 164, (byte) 32, var9, 110);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var6_int++;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
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
                        stackIn_25_0 = param3;
                        stackIn_25_1 = 119;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (stackIn_25_0 == stackIn_25_1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return;
                }
                case 27: {
                    try {
                        wq.a(param2, param1, param4, (byte) 32, gn.field_c, param0);
                        var6 = pj.field_D + "+" + ad.a(this.field_G, 26300);
                        var6 = var6 + "<br>" + ss.field_e + ad.a(tu.field_E.field_x, 26300);
                        wq.a(25, param1, param4, (byte) 32, var6, 140);
                        stackIn_30_0 = new StringBuilder().append(bt.field_c);
                        stackIn_28_0 = stackIn_30_0;
                        if (-1 > (this.field_Y ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_31_0 = (StringBuilder) ((Object) stackIn_28_0);
                        stackIn_31_1 = "";
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = (StringBuilder) ((Object) stackIn_30_0);
                        stackIn_31_1 = "+";
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var7_ref = stackIn_31_1 + Integer.toString(this.field_Y);
                        stackIn_34_0 = new StringBuilder().append(var7_ref).append("<br>").append(ss.field_e);
                        stackIn_32_0 = stackIn_34_0;
                        if ((tu.field_E.field_t ^ -1) == -7) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        stackIn_35_0 = (StringBuilder) ((Object) stackIn_32_0);
                        stackIn_35_1 = Integer.toString(tu.field_E.field_E);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackIn_35_0 = (StringBuilder) ((Object) stackIn_34_0);
                        stackIn_35_1 = Integer.toString(tu.field_E.field_r);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var7_ref = stackIn_35_1;
                        wq.a(475, param1, param4, (byte) 32, var7_ref, 135);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) runtimeException), "ol.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(char param0, int param1, int param2) {
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
                    if ((param2 ^ -1) != -99) {
                      stackIn_10_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackIn_10_0 = 1;
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
                    if ((param2 ^ -1) != -97) {
                      stackIn_20_0 = 0;
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              stackIn_20_0 = 1;
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
                    if ((param2 ^ -1) != -100) {
                      stackIn_30_0 = 0;
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              stackIn_30_0 = 1;
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
                      stackIn_40_0 = 0;
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              stackIn_40_0 = 1;
              break L7;
            }
            L9: {
              L10: {
                var8 = stackIn_40_0;
                if (this.field_ib == 0) {
                  break L10;
                } else {
                  if (595 != (this.field_ib ^ -1)) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              if (var8 != 0) {
                this.field_X = this.field_X - 596;
                stackIn_50_0 = 1;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                break L9;
              }
            }
            L11: {
              L12: {
                if ((this.field_ib ^ -1) == 595) {
                  break L12;
                } else {
                  if (1191 != (this.field_ib ^ -1)) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              if (var6 == 0) {
                break L11;
              } else {
                this.field_X = this.field_X + 596;
                stackIn_59_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            L13: {
              if ((this.field_P ^ -1) == -1) {
                break L13;
              } else {
                if ((this.field_M ^ -1) >= (this.field_P ^ -1)) {
                  break L13;
                } else {
                  if (var7 == 0) {
                    break L13;
                  } else {
                    this.field_M = this.field_M - 32;
                    stackIn_68_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
            }
            L14: {
              if (-1 >= (this.field_M ^ -1)) {
                break L14;
              } else {
                if (var5 == 0) {
                  break L14;
                } else {
                  this.field_M = this.field_M + 32;
                  stackIn_74_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            }
            L15: {
              if (0 == this.field_lb) {
                break L15;
              } else {
                if ((this.field_M ^ -1) >= (this.field_lb ^ -1)) {
                  break L15;
                } else {
                  if (var7 == 0) {
                    break L15;
                  } else {
                    this.field_M = this.field_M - 32;
                    stackIn_83_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            L16: {
              if (0 <= this.field_M) {
                break L16;
              } else {
                if (var5 == 0) {
                  break L16;
                } else {
                  this.field_M = this.field_M + 32;
                  stackIn_89_0 = 1;
                  decompiledRegionSelector0 = 5;
                  break L0;
                }
              }
            }
            L17: {
              if (param1 == 1670) {
                break L17;
              } else {
                this.field_Y = 19;
                break L17;
              }
            }
            stackIn_94_0 = 0;
            decompiledRegionSelector0 = 6;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4_ref), "ol.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_50_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_59_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_68_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_74_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_83_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_89_0 != 0;
                  } else {
                    return stackIn_94_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final tf h(int param0) {
        RuntimeException var2 = null;
        tf stackIn_2_0 = null;
        tf stackIn_4_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -19510) {
              stackIn_4_0 = this.field_gb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (tf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "ol.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    ol(nu param0, int param1, boolean param2) {
        super(param0, param1, param2, (int[]) null);
        int dupTemp$0 = 0;
        String[] arrayValue$1 = null;
        int incrementValue$2 = 0;
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
        boolean stackOut_20_0;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        it var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Kickabout.field_G;
                    this.field_cb = 65793;
                    this.field_kb = 83;
                    this.field_u = new int[2];
                    this.field_mb = 0;
                    this.field_B = 307;
                    this.field_db = 110;
                    this.field_V = 0;
                    this.field_r = 110;
                    this.field_jb = 307;
                    this.field_A = 83;
                    this.field_Q = 0;
                    this.field_S = 0;
                    this.field_M = this.field_Q;
                    this.field_ib = 0;
                    this.field_H = 32 + (this.field_ib + 1192);
                    this.field_L = this.field_ib - -596 + 600;
                    this.field_eb = 600 + this.field_ib;
                    this.field_X = this.field_ib;
                    this.field_x = 32 + this.field_ib + 596;
                    this.field_T = 596 + (this.field_ib + 32);
                    this.field_v = this.field_ib - -1192 - -32;
                    this.field_bb = new tf();
                    this.field_q = new tf();
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = new int[]{47, 56, 50, 44, 11, 12, 55};
                        if (var4 == null) {
                            statePc = 9;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = 120;
                        this.field_c = new io[var4.length];
                        var6_int = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6_int >= var4.length) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.field_c[var6_int] = new io(var5, 7126504, var4[var6_int]);
                        var6_int++;
                        if (var10 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var10 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        this.a(-26254);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ia.field_c = false;
                        this.field_gb = new tf();
                        this.field_Z = rl.field_u;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (null != param0.field_X) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        this.field_Z = mu.field_S;
                        if (param0.field_X.field_j[1] > param0.field_X.field_j[0]) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.field_Z = qq.field_J;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.field_Z = vo.a((byte) -18, this.field_Z, new String[]{Integer.toString(param0.field_X.field_j[0]), Integer.toString(param0.field_X.field_j[1])});
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.field_m = new int[2];
                        this.field_w = new String[2][8];
                        this.field_O = new int[2][8];
                        this.field_J = new int[]{-1, -1};
                        var5 = 0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if ((var5 ^ -1) <= (param0.field_I ^ -1)) {
                            statePc = 32;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = param0.field_g[var5].field_l;
                        stackIn_33_0 = stackOut_20_0 ? 1 : 0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var10 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_27_0 = 1;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = 0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var6_int = stackIn_27_0;
                        if ((param1 ^ -1) == (var5 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        this.field_J[var6_int] = this.field_m[var6_int];
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        this.field_O[var6_int][this.field_m[var6_int]] = var5;
                        dupTemp$0 = this.field_m[var6_int];
                        arrayValue$1 = this.field_w[var6_int];
                        this.field_m[var6_int] = dupTemp$0 + 1;
                        arrayValue$1[dupTemp$0] = param0.field_S[var5].toLowerCase();
                        var5++;
                        if (var10 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        this.field_I = new String[]{lr.field_l, of.field_c};
                        stackIn_33_0 = 0;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (stackIn_33_0 == (param0.field_Z ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (2 == (param0.field_Z ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!param0.field_L) {
                            statePc = 49;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (0 == this.field_m[0]) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (this.field_m[1] == 0) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        this.field_I[0] = ve.field_Q;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (0 <= param1) {
                            statePc = 52;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var5 = 0;
                        var6 = param0.field_g[param1];
                        this.field_N = param0.field_R[param1].field_n;
                        this.field_G = var6.field_g;
                        if (this.field_a.field_e) {
                            statePc = 75;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        this.field_hb = new int[]{-1, -1, -1, -1};
                        this.field_Y = var6.field_k;
                        var7 = 0;
                        var8 = 0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (4 <= var8) {
                            statePc = 62;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        stackIn_64_0 = this.field_a.field_i[this.field_h][var8] ^ -1;
                        stackIn_56_0 = stackIn_64_0;
                        stackIn_64_1 = this.field_g ^ -1;
                        stackIn_56_1 = stackIn_64_1;
                        if (var10 != 0) {
                            statePc = 64;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        if (stackIn_56_0 != stackIn_56_1) {
                            statePc = 61;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5++;
                        incrementValue$2 = var7;
                        var7++;
                        this.field_hb[incrementValue$2] = this.field_a.field_k[this.field_h][var8];
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 54;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        this.field_s = new hd[4];
                        this.field_l = var6.field_o;
                        this.field_o = new kq[4];
                        var8 = 0;
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = -5;
                        stackIn_64_1 = var8 ^ -1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (stackIn_64_0 >= stackIn_64_1) {
                            statePc = 75;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        this.field_o[var8] = new kq();
                        stackIn_76_0 = var8 * 155;
                        stackIn_66_0 = stackIn_76_0;
                        if (var10 != 0) {
                            statePc = 76;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        stackIn_68_0 = stackIn_66_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackIn_73_0 = stackIn_68_0;
                        stackIn_69_0 = stackIn_73_0;
                        stackIn_73_1 = 300;
                        stackIn_69_1 = stackIn_73_1;
                        if (1 < var5) {
                            statePc = 73;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_71_0 = stackIn_69_0;
                        stackIn_71_1 = stackIn_69_1;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_74_0 = stackIn_71_0;
                        stackIn_74_1 = stackIn_71_1;
                        stackIn_74_2 = 0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackIn_74_0 = stackIn_73_0;
                        stackIn_74_1 = stackIn_73_1;
                        stackIn_74_2 = (var5 - 1) * 80;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var9 = stackIn_74_0 + (stackIn_74_1 + -stackIn_74_2);
                        this.field_o[var8].a(true, 50, var9, 100, 100);
                        this.field_s[var8] = eo.a(so.field_a.toLowerCase(), 7126504, un.field_d, 80, true);
                        this.field_s[var8].a(true, this.field_s[var8].field_q, var9 - 15, 230, this.field_s[var8].field_mb);
                        var8++;
                        if (var10 == 0) {
                            statePc = 63;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        st.a((nu) null, this.field_g, 50);
                        oa.b(-23217);
                        stackIn_76_0 = 111;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        mv.a((byte) stackIn_76_0);
                        this.field_fb = new ut[2];
                        this.field_j = 256;
                        this.field_fb[0] = ae.a(true, (byte) -52, 0, 80, 7126504);
                        this.field_fb[1] = ae.a(true, (byte) -52, 1, 80, 7126504);
                        if (this.field_p != null) {
                            statePc = 79;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        this.field_p = new int[this.field_a.field_I][4];
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        if (null == this.field_ab) {
                            statePc = 82;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        this.field_ab = new int[this.field_a.field_I][4];
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        this.field_u = new int[2];
                        this.field_k = new int[this.field_a.field_I];
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 85: {
                    var4_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_88_0 = (RuntimeException) (var4_ref);
                    stackIn_86_0 = stackIn_88_0;
                    stackIn_88_1 = new StringBuilder().append("ol.<init>(");
                    stackIn_86_1 = stackIn_88_1;
                    if (param0 == null) {
                        statePc = 88;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_86_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_86_1);
                    stackIn_89_2 = "{...}";
                    statePc = 89;
                    continue stateLoop;
                }
                case 88: {
                    stackIn_89_0 = (RuntimeException) ((Object) stackIn_88_0);
                    stackIn_89_1 = (StringBuilder) ((Object) stackIn_88_1);
                    stackIn_89_2 = "null";
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    throw nb.a((Throwable) ((Object) stackIn_89_0), stackIn_89_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 90: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              this.c(param0 + 121);
              this.a(false, this.field_Z);
              stackIn_4_0 = 15;

              if (this.field_S == param0) {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = -44;
                break L1;
              } else {
                stackIn_5_0 = stackIn_4_0;
                stackIn_5_1 = 0;
                break L1;
              }
            }
            L2: {


              stackIn_8_1 = stackIn_5_1 + 325;

              stackIn_8_2 = 610;

              if ((this.field_S ^ -1) == -2) {

                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = 44;
                break L2;
              } else {

                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = stackIn_8_2;
                stackIn_9_3 = 0;
                break L2;
              }
            }
            L3: {
              on.a(stackIn_5_0, stackIn_9_1, stackIn_9_2, stackIn_9_3 + 35, 10, 0, 128);
              this.d(123);
              if (!this.e(3, 50)) {
                break L3;
              } else {
                if ((this.field_S ^ -1) != -1) {
                  break L3;
                } else {
                  var3 = this.d(127, 3);
                  var4 = this.c(342, 3);
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
              if (!this.e(0, param0 ^ 51)) {
                break L4;
              } else {
                if (0 != this.field_S) {
                  break L4;
                } else {
                  if (0 > this.field_g) {
                    break L4;
                  } else {
                    if (!this.b((byte) -109)) {
                      break L4;
                    } else {
                      var3 = this.d(param0 ^ 126, 0);
                      var4 = this.c(342, 0);
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
                if (-3 == (this.field_S ^ -1)) {
                  break L6;
                } else {
                  L7: {
                    L8: {
                      if (0 == this.field_S) {
                        break L8;
                      } else {
                        if (this.field_g < 0) {
                          break L8;
                        } else {
                          if (!this.field_a.field_e) {
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
                  if (1 != this.field_S) {
                    break L5;
                  } else {
                    if (0 > this.field_g) {
                      break L5;
                    } else {
                      if (!this.field_a.field_e) {
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
              if (this.field_a.field_f) {
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
          throw nb.a((Throwable) ((Object) var2), "ol.S(" + param0 + ')');
        }
    }

    final void a(int param0, hn param1, int param2, int param3) {
        up dupTemp$0 = null;
        up dupTemp$1 = null;
        up dupTemp$2 = null;
        up dupTemp$3 = null;
        boolean stackIn_6_0 = false;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        hn var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          L0: {
            if (!this.field_a.field_e) {
              var5 = (hn) ((Object) this.field_gb.g(24009));
              L1: while (true) {
                L2: {
                  L3: {
                    if (null == var5) {
                      break L3;
                    } else {
                      stackOut_5_0 = param1.a(var5, 114);
                      stackIn_13_0 = stackOut_5_0 ? 1 : 0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (stackIn_6_0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var5 = (hn) ((Object) this.field_gb.c(param0 ^ 32));
                          if (var6 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackIn_13_0 = -1;
                  break L2;
                }
                L4: {
                  if (stackIn_13_0 == (param3 ^ -1)) {
                    dupTemp$0 = tu.field_E.field_i[this.field_hb[param2]];
                    dupTemp$0.field_n = dupTemp$0.field_n + 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param3 == param0) {
                    dupTemp$1 = tu.field_E.field_i[this.field_hb[param2]];
                    dupTemp$1.field_g = dupTemp$1.field_g + 1;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (2 == param3) {
                    dupTemp$2 = tu.field_E.field_i[this.field_hb[param2]];
                    dupTemp$2.field_o = dupTemp$2.field_o + 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                dupTemp$3 = tu.field_E.field_i[this.field_hb[param2]];
                dupTemp$3.field_r = dupTemp$3.field_r - 100;
                this.field_gb.a(param1, 3);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var5_ref);

            stackIn_30_1 = new StringBuilder().append("ol.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L7;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L7;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final int a(tf param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var15 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0.a(false) == 0) {
                            statePc = 20;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
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
                        var11_ref_ch = (ch) ((Object) param0.g(24009));
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == var11_ref_ch) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        param2 += 23;
                        var12 = 65793;
                        var13 = 128;
                        var14 = this.field_a.field_S[var11_ref_ch.field_s].toLowerCase();
                        stackIn_23_0 = var11_ref_ch.field_k ^ -1;
                        stackIn_5_0 = stackIn_23_0;
                        stackIn_23_1 = var11_ref_ch.field_f ^ -1;
                        stackIn_5_1 = stackIn_23_1;
                        if (var15 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (stackIn_5_0 == stackIn_5_1) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var14 = vo.a((byte) -18, ae.field_P, new String[]{this.field_a.field_S[var11_ref_ch.field_s].toLowerCase()});
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (this.field_g != var11_ref_ch.field_s) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var13 = 50;
                        var12 = 16777215;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        on.a(-26 + var5_int, param2, 24, 21, var12, var13);
                        on.a(var5_int, param2, var8, 21, var12, var13);
                        on.a(var6, param2, var9, 21, var12, var13);
                        on.a(var7, param2, var9, 21, var12, var13);
                        var10++;
                        un.field_d.d(Integer.toString(var10), -14 + var5_int, 16 + param2, 16777215, -1);
                        un.field_d.d(var14, (var8 >> 2027488097) + var5_int, 16 + param2, 16777215, -1);
                        un.field_d.d(this.g(var11_ref_ch.field_t, -16305), var6 + (var9 >> -79930879), param2 - -16, 16777215, -1);
                        un.field_d.d(this.a((byte) -110, var11_ref_ch.field_l), (var9 >> -1245415519) + var7, 16 + param2, 16777215, -1);
                        var11_ref_ch = (ch) ((Object) param0.c(33));
                        if (var15 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        param2 += 23;
                        var11 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (16 <= var11) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        on.c(-26 + var5_int, param2 + var11, 24, 65793, 128 - (var11 << 1012207651));
                        on.c(var5_int, param2 - -var11, var8, 65793, 128 + -(var11 << 903360099));
                        on.c(var6, param2 - -var11, var9, 65793, 128 - (var11 << -1446948669));
                        on.c(var7, param2 - -var11, var9, 65793, -(var11 << -896330557) + 128);
                        var11++;
                        if (var15 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (var15 == 0) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        param2 += 10;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var15 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param2 += 10;
                        un.field_d.d(jl.field_c, param1 + 320, param2, 16777215, -1);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_23_0 = param3 ? 1 : 0;
                        stackIn_23_1 = 1;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 == stackIn_23_1) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.field_U = false;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_27_0 = param2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    return stackIn_27_0;
                }
                case 28: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_31_0 = (RuntimeException) (var5);
                    stackIn_29_0 = stackIn_31_0;
                    stackIn_31_1 = new StringBuilder().append("ol.M(");
                    stackIn_29_1 = stackIn_31_1;
                    if (param0 == null) {
                        statePc = 31;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    throw nb.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void f(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (-12 != (param1 ^ -1)) {
                break L1;
              } else {
                if (!this.field_f) {
                  break L1;
                } else {
                  if (this.field_g >= 0) {
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
                this.field_T = 67;
                break L3;
              }
            }
            L4: {
              if (-51 == (param1 ^ -1)) {
                L5: {
                  if (-3 == (this.field_S ^ -1)) {
                    break L5;
                  } else {
                    this.field_mb = this.field_S;
                    break L5;
                  }
                }
                this.field_S = 2;
                break L4;
              } else {
                break L4;
              }
            }
            L6: {
              if (47 == param1) {
                L7: {
                  if ((this.field_S ^ -1) != -3) {
                    break L7;
                  } else {
                    this.field_S = this.field_mb;
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                this.field_mb = this.field_S;
                this.field_S = -this.field_S + 1;
                break L6;
              } else {
                break L6;
              }
            }
            L8: {
              if (56 == param1) {
                L9: {
                  if (this.field_S != 2) {
                    break L9;
                  } else {
                    this.field_S = this.field_mb;
                    if (var4 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                this.field_mb = 0;
                this.field_S = 2;
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
          throw nb.a((Throwable) ((Object) var3), "ol.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void f(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_26_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        boolean stackOut_16_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
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
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = Kickabout.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_m[1] != 0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_5_0 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackIn_5_0 = 250;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_int = stackIn_5_0;
                        var3 = new int[]{640 - (var2_int - -160) >> 1710079393, var2_int + 480 >> -541232063};
                        var4_int = -107 % ((-1 - param0) / 61);
                        var5 = 0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (2 <= var5) {
                            statePc = 48;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6 = this.field_m[var5];
                        stackIn_49_0 = 0;
                        stackIn_8_0 = stackIn_49_0;
                        stackIn_49_1 = var6;
                        stackIn_8_1 = stackIn_49_1;
                        if (var13 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (stackIn_8_0 != stackIn_8_1) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var13 == 0) {
                            statePc = 46;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = var3[var5];
                        wj.a(this.field_J[var5], var6, this.field_I[var5], var7, 100, 124);
                        var8 = 140;
                        var9 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (this.field_m[var5] <= var9) {
                            statePc = 39;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var10 = this.field_a.field_R[this.field_O[var5][var9]];
                        var11 = var10.field_v ? 1 : 0;
                        stackOut_16_0 = this.field_a.field_g[this.field_O[var5][var9]].field_i;
                        stackIn_40_0 = stackOut_16_0 ? 1 : 0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var13 != 0) {
                            statePc = 40;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (stackIn_17_0) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        uv.a(var7 + 10, (byte) -119, var8 - 6);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        b.field_U[this.field_a.field_g[this.field_O[var5][var9]].field_f].c(var7, var8 + -16);
                        if (var11 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackIn_26_0 = 11184810;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackIn_26_0 = 16777215;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var12 = stackIn_26_0;
                        un.field_d.d(this.field_w[var5][var9], 80 + var7, var8, var12, -1);
                        if (var11 != 0) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (var10.field_k) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        hn.a(8, 16777215, 90, var7, var8, 16777215, wq.field_e);
                        if (var13 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        hn.a(8, 14492194, 110, var7, var8, 11184810, vc.field_A);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!var10.field_s) {
                            statePc = 38;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        qq.a(110, (byte) -101, 13421772, ss.field_g, var8, var7, 14492194);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var8 += 23;
                        var9++;
                        if (var13 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var8 -= 17;
                        stackIn_40_0 = 0;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var9 = stackIn_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (-17 >= (var9 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        on.c(var3[var5], var9 + var8, 160, 65793, -(var9 << 849921187) + 128);
                        var9++;
                        if (var13 != 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var13 == 0) {
                            statePc = 41;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var5++;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var13 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackIn_49_0 = -1;
                        stackIn_49_1 = this.field_g ^ -1;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 >= stackIn_49_1) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!this.field_a.field_g[this.field_g].field_l) {
                            statePc = 55;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (this.field_a.field_Z == -3) {
                            statePc = 81;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (!um.field_e.field_s) {
                            statePc = 76;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var4 = ar.field_d;
                        if (!um.field_e.field_q) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var4 = vo.a((byte) -18, oe.field_m + " " + tq.field_E, new String[]{this.field_a.field_S[1 - this.field_g]});
                        if (var13 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (this.field_N) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var4 = pe.field_c;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var5 = this.field_a.field_g[this.field_g].field_f;
                        if (!this.field_a.field_g[this.field_g].field_i) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var5--;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        if (um.field_e.field_q) {
                            statePc = 75;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (!this.field_a.field_g[this.field_g].field_l) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (pr.field_a[var5] <= this.field_a.field_g[this.field_g].field_h) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var4 = var4 + "<br>" + vo.a((byte) -18, ja.field_L, new String[]{q.field_h[var5], Integer.toString(pr.field_a[var5]), Integer.toString(this.field_a.field_g[this.field_g].field_h)});
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (this.field_N) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var4 = pe.field_c;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (this.field_a.field_e) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var4 = mc.field_b + "<br>" + vk.field_a + " " + tq.field_E;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var4 = je.field_p + "<br>" + vo.a((byte) -18, jg.field_I, new String[]{ad.a(this.field_G, 26300)});
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var4 = jl.field_b;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var5 = pb.field_C.c(var4, 380, 16);
                        wb.a(var4, 400, var5, -5 + (300 - var5), 120, 0);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw nb.a((Throwable) ((Object) var2), "ol.P(" + param0 + ')');
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int d(int param0, int param1) {
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_19_0 = 0;
        boolean stackIn_23_0 = false;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        boolean stackOut_22_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          L0: {
            var3_int = 0;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_c.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = this.e(var4, 50);
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
                stackIn_10_0 = 610;
                break L2;
              }
              L5: {
                var5 = stackIn_10_0;
                if (this.e(3, 50)) {
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
                  this.a('ﾖ', 56, 92);
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
                        stackOut_22_0 = this.e(var9, 50);
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
                    stackIn_29_0 = -2 + var8;
                    break L8;
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                stackIn_19_0 = var5 + var6 - (var4 >> 981173537);
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.O(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_19_0;
        } else {
          return stackIn_29_0;
        }
    }

    private final int a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((param2 ^ -1) != (param0 ^ -1)) {
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
                  if ((param2 ^ -1) < (param0 ^ -1)) {
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
              stackIn_18_0 = param0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_16_0 = -98;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var4), "ol.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final static java.awt.Frame a(int param0, int param1, int param2, int param3, bu param4, int param5) {
        Object stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_36_0 = 0;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_41_0 = null;
        Object stackIn_48_0 = null;
        Object stackIn_51_0 = null;
        java.awt.Frame stackIn_53_0 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        cl[] var6 = null;
        wu var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Kickabout.field_G;
        try {
          L0: {
            if (!param4.b(param0 ^ 9073)) {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 != (param5 ^ -1)) {
                  break L1;
                } else {
                  var6 = kr.a((byte) 124, param4);
                  if (var6 != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8 >= var6.length) {
                            break L4;
                          } else {
                            stackIn_36_0 = var6[var8].field_f;

                            if (var9 != 0) {
                              break L3;
                            } else {
                              L5: {
                                if (stackIn_36_0 != param1) {
                                  break L5;
                                } else {
                                  if ((param2 ^ -1) != (var6[var8].field_b ^ -1)) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (param3 == 0) {
                                        break L6;
                                      } else {
                                        if ((param3 ^ -1) == (var6[var8].field_a ^ -1)) {
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
                                        if ((var6[var8].field_e ^ -1) < (param5 ^ -1)) {
                                          break L7;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    param5 = var6[var8].field_e;
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
                        stackIn_36_0 = var7_int;
                        break L3;
                      }
                      if (stackIn_36_0 != 0) {
                        break L1;
                      } else {
                        stackIn_38_0 = null;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  } else {
                    stackIn_9_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              var6_ref = param4.a(param2, param3, false, param1, param5);
              if (param0 == -9027) {
                L8: while (true) {
                  L9: {
                    if ((var6_ref.field_a ^ -1) != -1) {
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
                  var7 = (java.awt.Frame) (var6_ref.field_b);
                  if (null == var7) {
                    stackIn_48_0 = null;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if ((var6_ref.field_a ^ -1) != -3) {
                      stackIn_53_0 = (java.awt.Frame) (var7);
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      dq.a(param4, var7, 0);
                      stackIn_51_0 = null;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                stackIn_41_0 = (java.awt.Frame) null;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6_ref2 = decompiledCaughtException;
            stackIn_57_0 = (RuntimeException) (var6_ref2);

            stackIn_57_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "null";
              break L10;
            } else {
              stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackIn_58_2 = "{...}";
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_5_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_9_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_38_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_41_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return (java.awt.Frame) ((Object) stackIn_48_0);
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return (java.awt.Frame) ((Object) stackIn_51_0);
                  } else {
                    return stackIn_53_0;
                  }
                }
              }
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_64_0 = null;
        Object stackIn_67_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_72_0 = null;
        Object stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        Object stackIn_77_0 = null;
        Object stackIn_80_0 = null;
        Object stackIn_83_0 = null;
        Object stackIn_85_0 = null;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        Object stackIn_90_0 = null;
        Object stackIn_93_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_98_0 = null;
        Object stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_106_0 = null;
        Object stackIn_109_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        Object stackIn_116_0 = null;
        Object stackIn_119_0 = null;
        Object stackIn_122_0 = null;
        Object stackIn_124_0 = null;
        Object stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        Object stackIn_129_0 = null;
        Object stackIn_132_0 = null;
        Object stackIn_135_0 = null;
        Object stackIn_137_0 = null;
        Object stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        Object stackIn_142_0 = null;
        Object stackIn_145_0 = null;
        Object stackIn_148_0 = null;
        Object stackIn_150_0 = null;
        Object stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              super.a(-94, param1);
              var3_int = this.field_bb.a(false) - -this.field_q.a(false);
              this.field_lb = -((this.field_a.field_I + 1) * 50 + 100);
              stackIn_4_0 = this;

              if (0 >= var3_int) {
                stackIn_5_0 = this;
                stackIn_5_1 = 0;
                break L1;
              } else {
                stackIn_5_0 = this;
                stackIn_5_1 = 32 * -var3_int;
                break L1;
              }
            }
            L2: {
              L3: {
                ((ol) (this)).field_P = stackIn_5_1;
                if (this.field_a.field_e) {
                  break L3;
                } else {
                  L4: {
                    if (!this.field_a.field_L) {
                      break L4;
                    } else {
                      if ((this.field_g ^ -1) == 1) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      if (0 == this.field_S) {
                        break L6;
                      } else {
                        if ((this.field_S ^ -1) != -3) {
                          break L5;
                        } else {
                          if (1 != this.field_mb) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    this.field_c[0].field_p = ni.field_e.toLowerCase();
                    if (var15 == 0) {
                      break L2;
                    } else {
                      break L5;
                    }
                  }
                  this.field_c[0].field_p = oh.field_g.toLowerCase();
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L7: {
                if (0 == this.field_S) {
                  break L7;
                } else {
                  this.field_c[1].field_p = oh.field_g.toLowerCase();
                  if (var15 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              this.field_c[1].field_p = q.field_f.toLowerCase();
              break L2;
            }
            L8: {
              L9: {
                if ((this.field_j ^ -1) < 254) {
                  break L9;
                } else {
                  this.field_j = 255;
                  if (var15 == 0) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              this.field_j = this.field_j - 5;
              break L8;
            }
            L10: {
              if (-3 != (this.field_S ^ -1)) {
                break L10;
              } else {
                L11: {
                  if (this.field_X == this.field_ib) {
                    break L11;
                  } else {
                    this.field_M = 0;
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    this.field_ib = this.a(this.field_ib, (byte) -49, this.field_X);
                    this.field_Q = this.a(this.field_Q, (byte) -49, this.field_M);
                    this.field_T = 596 + this.field_ib + 32;
                    this.field_H = 32 + (1192 + this.field_ib);
                    this.field_v = 32 + (1192 + this.field_ib);
                    this.field_eb = 600 + this.field_ib;
                    this.field_x = 32 + (this.field_ib + 596);
                    this.field_L = 1196 + this.field_ib;
                    stackIn_59_0 = this;

                    if (el.field_A < this.field_H) {
                      break L13;
                    } else {
                      stackIn_59_0 = this;

                      if (el.field_A > 570 + this.field_H) {
                        break L13;
                      } else {
                        stackIn_51_0 = this;
                        stackIn_59_0 = this;

                        if ((n.field_m ^ -1) > (this.field_jb ^ -1)) {
                          break L13;
                        } else {
                          stackIn_54_0 = this;
                          stackIn_59_0 = this;

                          if (n.field_m > this.field_jb - -12) {
                            break L13;
                          } else {
                            stackIn_57_0 = this;
                            stackIn_60_0 = this;
                            stackIn_60_1 = 1;
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  stackIn_60_0 = this;
                  stackIn_60_1 = 0;
                  break L12;
                }
                L14: {
                  L15: {
                    ((ol) (this)).field_U = stackIn_60_1 != 0;
                    stackIn_72_0 = this;

                    if (el.field_A < 16 + this.field_L) {
                      break L15;
                    } else {
                      stackIn_72_0 = this;

                      if (32 + this.field_L < el.field_A) {
                        break L15;
                      } else {
                        stackIn_64_0 = this;
                        stackIn_72_0 = this;

                        if ((this.field_r ^ -1) < (n.field_m ^ -1)) {
                          break L15;
                        } else {
                          stackIn_67_0 = this;
                          stackIn_72_0 = this;

                          if (n.field_m > this.field_r + 195) {
                            break L15;
                          } else {
                            stackIn_70_0 = this;
                            stackIn_73_0 = this;
                            stackIn_73_1 = 1;
                            break L14;
                          }
                        }
                      }
                    }
                  }
                  stackIn_73_0 = this;
                  stackIn_73_1 = 0;
                  break L14;
                }
                L16: {
                  L17: {
                    ((ol) (this)).field_D = stackIn_73_1 != 0;
                    stackIn_85_0 = this;

                    if (el.field_A < this.field_T) {
                      break L17;
                    } else {
                      stackIn_85_0 = this;

                      if (el.field_A > this.field_T + 570) {
                        break L17;
                      } else {
                        stackIn_77_0 = this;
                        stackIn_85_0 = this;

                        if (this.field_kb + 12 > n.field_m) {
                          break L17;
                        } else {
                          stackIn_80_0 = this;
                          stackIn_85_0 = this;

                          if ((n.field_m ^ -1) < (this.field_kb + 24 ^ -1)) {
                            break L17;
                          } else {
                            stackIn_83_0 = this;
                            stackIn_86_0 = this;
                            stackIn_86_1 = 1;
                            break L16;
                          }
                        }
                      }
                    }
                  }
                  stackIn_86_0 = this;
                  stackIn_86_1 = 0;
                  break L16;
                }
                L18: {
                  L19: {
                    ((ol) (this)).field_F = stackIn_86_1 != 0;
                    stackIn_98_0 = this;

                    if ((this.field_L ^ -1) < (el.field_A ^ -1)) {
                      break L19;
                    } else {
                      stackIn_98_0 = this;

                      if (16 + this.field_L < el.field_A) {
                        break L19;
                      } else {
                        stackIn_90_0 = this;
                        stackIn_98_0 = this;

                        if ((this.field_r ^ -1) < (n.field_m ^ -1)) {
                          break L19;
                        } else {
                          stackIn_93_0 = this;
                          stackIn_98_0 = this;

                          if ((n.field_m ^ -1) < (this.field_r - -195 ^ -1)) {
                            break L19;
                          } else {
                            stackIn_96_0 = this;
                            stackIn_99_0 = this;
                            stackIn_99_1 = 1;
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  stackIn_99_0 = this;
                  stackIn_99_1 = 0;
                  break L18;
                }
                L20: {
                  L21: {
                    ((ol) (this)).field_C = stackIn_99_1 != 0;
                    stackIn_111_0 = this;

                    if ((16 + this.field_eb ^ -1) < (el.field_A ^ -1)) {
                      break L21;
                    } else {
                      stackIn_111_0 = this;

                      if (el.field_A > 32 + this.field_eb) {
                        break L21;
                      } else {
                        stackIn_103_0 = this;
                        stackIn_111_0 = this;

                        if (n.field_m < this.field_db) {
                          break L21;
                        } else {
                          stackIn_106_0 = this;
                          stackIn_111_0 = this;

                          if (this.field_db - -195 < n.field_m) {
                            break L21;
                          } else {
                            stackIn_109_0 = this;
                            stackIn_112_0 = this;
                            stackIn_112_1 = 1;
                            break L20;
                          }
                        }
                      }
                    }
                  }
                  stackIn_112_0 = this;
                  stackIn_112_1 = 0;
                  break L20;
                }
                L22: {
                  L23: {
                    ((ol) (this)).field_W = stackIn_112_1 != 0;
                    stackIn_124_0 = this;

                    if (this.field_v > el.field_A) {
                      break L23;
                    } else {
                      stackIn_124_0 = this;

                      if ((this.field_v + 570 ^ -1) > (el.field_A ^ -1)) {
                        break L23;
                      } else {
                        stackIn_116_0 = this;
                        stackIn_124_0 = this;

                        if ((n.field_m ^ -1) > (12 + this.field_A ^ -1)) {
                          break L23;
                        } else {
                          stackIn_119_0 = this;
                          stackIn_124_0 = this;

                          if ((this.field_A - -24 ^ -1) > (n.field_m ^ -1)) {
                            break L23;
                          } else {
                            stackIn_122_0 = this;
                            stackIn_125_0 = this;
                            stackIn_125_1 = 1;
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  stackIn_125_0 = this;
                  stackIn_125_1 = 0;
                  break L22;
                }
                L24: {
                  L25: {
                    ((ol) (this)).field_t = stackIn_125_1 != 0;
                    stackIn_137_0 = this;

                    if ((el.field_A ^ -1) > (this.field_eb ^ -1)) {
                      break L25;
                    } else {
                      stackIn_137_0 = this;

                      if ((el.field_A ^ -1) < (this.field_eb - -16 ^ -1)) {
                        break L25;
                      } else {
                        stackIn_129_0 = this;
                        stackIn_137_0 = this;

                        if ((this.field_db ^ -1) < (n.field_m ^ -1)) {
                          break L25;
                        } else {
                          stackIn_132_0 = this;
                          stackIn_137_0 = this;

                          if (n.field_m > this.field_db + 195) {
                            break L25;
                          } else {
                            stackIn_135_0 = this;
                            stackIn_138_0 = this;
                            stackIn_138_1 = 1;
                            break L24;
                          }
                        }
                      }
                    }
                  }
                  stackIn_138_0 = this;
                  stackIn_138_1 = 0;
                  break L24;
                }
                L26: {
                  L27: {
                    ((ol) (this)).field_K = stackIn_138_1 != 0;
                    stackIn_150_0 = this;

                    if ((el.field_A ^ -1) > (this.field_x ^ -1)) {
                      break L27;
                    } else {
                      stackIn_150_0 = this;

                      if (el.field_A > 570 + this.field_x) {
                        break L27;
                      } else {
                        stackIn_142_0 = this;
                        stackIn_150_0 = this;

                        if (n.field_m < this.field_B) {
                          break L27;
                        } else {
                          stackIn_145_0 = this;
                          stackIn_150_0 = this;

                          if (this.field_B + 12 < n.field_m) {
                            break L27;
                          } else {
                            stackIn_148_0 = this;
                            stackIn_151_0 = this;
                            stackIn_151_1 = 1;
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  stackIn_151_0 = this;
                  stackIn_151_1 = 0;
                  break L26;
                }
                L28: {
                  ((ol) (this)).field_y = stackIn_151_1 != 0;
                  if (!this.field_K) {
                    break L28;
                  } else {
                    if (wj.field_A != 1) {
                      break L28;
                    } else {
                      if ((this.field_ib ^ -1) != -1) {
                        break L28;
                      } else {
                        ii.a((byte) -124);
                        this.field_X = this.field_X - 596;
                        break L28;
                      }
                    }
                  }
                }
                L29: {
                  if (!this.field_W) {
                    break L29;
                  } else {
                    if (wj.field_A != 1) {
                      break L29;
                    } else {
                      if (595 != (this.field_ib ^ -1)) {
                        break L29;
                      } else {
                        ii.a((byte) -119);
                        this.field_X = this.field_X + 596;
                        break L29;
                      }
                    }
                  }
                }
                L30: {
                  if (!this.field_C) {
                    break L30;
                  } else {
                    if (-2 != (wj.field_A ^ -1)) {
                      break L30;
                    } else {
                      if (-596 == this.field_ib) {
                        ii.a((byte) -117);
                        this.field_X = this.field_X - 596;
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                }
                L31: {
                  if (!this.field_D) {
                    break L31;
                  } else {
                    if (-2 != (wj.field_A ^ -1)) {
                      break L31;
                    } else {
                      if ((this.field_ib ^ -1) != 1191) {
                        break L31;
                      } else {
                        ii.a((byte) -125);
                        this.field_X = this.field_X + 596;
                        break L31;
                      }
                    }
                  }
                }
                L32: {
                  if (!this.field_y) {
                    break L32;
                  } else {
                    if (-2 != (nl.field_p ^ -1)) {
                      break L32;
                    } else {
                      if (this.field_P == 0) {
                        break L32;
                      } else {
                        if ((this.field_M ^ -1) >= (this.field_P ^ -1)) {
                          break L32;
                        } else {
                          L33: {
                            if (wj.field_A != 1) {
                              break L33;
                            } else {
                              ii.a((byte) -118);
                              break L33;
                            }
                          }
                          this.field_M = this.field_M - 32;
                          break L32;
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (!this.field_F) {
                    break L34;
                  } else {
                    if (1 != nl.field_p) {
                      break L34;
                    } else {
                      if ((this.field_M ^ -1) <= -1) {
                        break L34;
                      } else {
                        L35: {
                          if (wj.field_A != 1) {
                            break L35;
                          } else {
                            ii.a((byte) -122);
                            break L35;
                          }
                        }
                        this.field_M = this.field_M + 32;
                        break L34;
                      }
                    }
                  }
                }
                L36: {
                  if (!this.field_U) {
                    break L36;
                  } else {
                    if (nl.field_p != 1) {
                      break L36;
                    } else {
                      if (-1 == (this.field_lb ^ -1)) {
                        break L36;
                      } else {
                        if (this.field_M <= this.field_lb) {
                          break L36;
                        } else {
                          L37: {
                            if ((wj.field_A ^ -1) != -2) {
                              break L37;
                            } else {
                              ii.a((byte) -121);
                              break L37;
                            }
                          }
                          this.field_M = this.field_M - 32;
                          break L36;
                        }
                      }
                    }
                  }
                }
                L38: {
                  if (!this.field_t) {
                    break L38;
                  } else {
                    if (-2 != (nl.field_p ^ -1)) {
                      break L38;
                    } else {
                      if (this.field_M < 0) {
                        L39: {
                          if (-2 != (wj.field_A ^ -1)) {
                            break L39;
                          } else {
                            ii.a((byte) -127);
                            break L39;
                          }
                        }
                        this.field_M = this.field_M + 32;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                  }
                }
                L40: {
                  if (this.field_X == this.field_ib) {
                    this.field_M = this.field_M - 32 * id.field_v;
                    break L40;
                  } else {
                    break L40;
                  }
                }
                L41: {
                  if ((this.field_M ^ -1) < -1) {
                    this.field_M = 0;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (this.field_ib != -596) {
                    break L42;
                  } else {
                    if ((this.field_P ^ -1) >= (this.field_M ^ -1)) {
                      break L42;
                    } else {
                      this.field_M = this.field_P;
                      if (var15 == 0) {
                        break L10;
                      } else {
                        break L42;
                      }
                    }
                  }
                }
                L43: {
                  L44: {
                    if (this.field_ib != -1192) {
                      break L44;
                    } else {
                      if ((this.field_lb ^ -1) < (this.field_M ^ -1)) {
                        break L43;
                      } else {
                        break L44;
                      }
                    }
                  }
                  if (-1 == (this.field_ib ^ -1)) {
                    this.field_M = 0;
                    if (var15 == 0) {
                      break L10;
                    } else {
                      break L43;
                    }
                  } else {
                    break L10;
                  }
                }
                this.field_M = this.field_lb;
                break L10;
              }
            }
            var4 = (double)(this.field_V % 151);
            var6 = var4 / 2.0;
            var8 = -37.5 + var6;
            var10 = (int)Math.abs(var8) << 1095665666;
            this.field_cb = var10 << 736341520 | (65793 | var10 | var10 << 1890532264);
            this.field_V = this.field_V + 1;
            if (param0 < -92) {
              if ((this.field_g ^ -1) != 1) {
                var11 = 0;
                var12_int = 0;
                L45: while (true) {
                  L46: {
                    if ((var12_int ^ -1) <= (this.field_a.field_I ^ -1)) {
                      break L46;
                    } else {
                      L47: {
                        if (this.field_a.field_R[var12_int].field_v) {
                          break L47;
                        } else {
                          var11++;
                          break L47;
                        }
                      }
                      var12_int++;
                      if (var15 == 0) {
                        continue L45;
                      } else {
                        break L46;
                      }
                    }
                  }
                  L48: {
                    L49: {
                      var12 = nj.field_c;
                      if ((var11 ^ -1) != -2) {
                        break L49;
                      } else {
                        var12 = ig.field_k;
                        if (var15 == 0) {
                          break L48;
                        } else {
                          break L49;
                        }
                      }
                    }
                    if (!this.field_a.field_R[this.field_g].field_k) {
                      break L48;
                    } else {
                      var12 = gw.field_e;
                      break L48;
                    }
                  }
                  L50: {
                    L51: {
                      this.field_c[4].field_p = var12.toLowerCase();
                      if (1 != this.field_S) {
                        break L51;
                      } else {
                        if (this.field_a.field_e) {
                          break L51;
                        } else {
                          var13 = 0;
                          L52: while (true) {
                            if (4 <= var13) {
                              break L51;
                            } else {
                              if (var15 != 0) {
                                break L50;
                              } else {
                                L53: {
                                  if (this.field_hb[var13] == -1) {
                                    break L53;
                                  } else {
                                    L54: {
                                      L55: {
                                        var14 = tu.field_E.field_i[this.field_hb[var13]];
                                        this.field_o[var13].b(0, param1);
                                        this.field_o[var13].a(this.field_a.field_Q[this.field_h], this.field_a.field_H[this.field_h], (byte) 126, this.field_a.field_d[this.field_h], var14);
                                        this.field_s[var13].b(0, param1);
                                        if (100 <= var14.field_r) {
                                          break L55;
                                        } else {
                                          this.field_s[var13].field_lb = false;
                                          if (var15 == 0) {
                                            break L54;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                      this.field_s[var13].field_lb = true;
                                      break L54;
                                    }
                                    L56: {
                                      if ((var14.field_n ^ -1) > -101) {
                                        break L56;
                                      } else {
                                        if (-101 < (var14.field_g ^ -1)) {
                                          break L56;
                                        } else {
                                          if (var14.field_o < 100) {
                                            break L56;
                                          } else {
                                            this.field_s[var13].field_lb = false;
                                            break L56;
                                          }
                                        }
                                      }
                                    }
                                    if (1 != this.field_s[var13].field_sb) {
                                      break L53;
                                    } else {
                                      L57: {
                                        L58: {
                                          if (100 > var14.field_r) {
                                            break L58;
                                          } else {
                                            L59: {
                                              if (100 > var14.field_n) {
                                                break L59;
                                              } else {
                                                if ((var14.field_o ^ -1) > -101) {
                                                  break L59;
                                                } else {
                                                  if (var14.field_g < 100) {
                                                    break L59;
                                                  } else {
                                                    sk.a(7, 16586, var14);
                                                    sp.c(49, -122);
                                                    if (var15 == 0) {
                                                      break L57;
                                                    } else {
                                                      break L59;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            dg.a((byte) -120, var13, this.field_hb[var13], var14);
                                            sp.c(49, -121);
                                            if (var15 == 0) {
                                              break L57;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        if ((var14.field_n ^ -1) > -101) {
                                          break L57;
                                        } else {
                                          if ((var14.field_o ^ -1) > -101) {
                                            break L57;
                                          } else {
                                            if (-101 >= (var14.field_g ^ -1)) {
                                              sk.a(7, 16586, var14);
                                              sp.c(49, 52);
                                              break L57;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      kj.a((byte) 61);
                                      break L53;
                                    }
                                  }
                                }
                                var13++;
                                if (var15 == 0) {
                                  continue L52;
                                } else {
                                  break L51;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L50;
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.H(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void g(int param0) {
        try {
            field_E = null;
            field_n = null;
            if (param0 > 0) {
                field_E = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ol.A(" + param0 + ')');
        }
    }

    private final String g(int param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_11_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -16305) {
              if ((param0 ^ -1) != -3) {
                if ((param0 ^ -1) == -4) {
                  stackIn_15_0 = fb.field_S;
                  decompiledRegionSelector0 = 4;
                  break L0;
                } else {
                  if ((param0 ^ -1) != -2) {
                    stackIn_13_0 = rb.field_Ib;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    stackIn_11_0 = cu.field_g;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              } else {
                stackIn_5_0 = dn.field_Ab;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.L(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                return stackIn_15_0;
              }
            }
          }
        }
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param1 = -param1 + this.field_a.field_O;
            var3_int = param1 / 50;
            var4 = var3_int / 60;
            var6 = 121 % ((param0 - 27) / 45);
            var5 = -(var4 * 60) + var3_int;
            if (-1 != (var4 ^ -1)) {
              if (10 > var5) {
                stackIn_7_0 = Integer.toString(var4) + ":" + Integer.toString(0) + Integer.toString(var5);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = var4 + ":" + var5;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = Integer.toString(var5) + "s";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.R(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 342) {
                break L1;
              } else {
                this.d(-95, 21);
                break L1;
              }
            }
            stackIn_4_0 = 342;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3), "ol.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_n = "Discard";
        field_E = "You have entered another game.";
        field_R = false;
    }
}
