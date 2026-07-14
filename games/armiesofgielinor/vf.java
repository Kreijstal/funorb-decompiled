/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class vf {
    private short[] field_g;
    static String field_h;
    static wk[] field_j;
    private int field_d;
    static String field_e;
    private int field_a;
    private short[] field_k;
    int field_b;
    static String field_c;
    static String field_l;
    static int field_f;
    private int field_i;

    abstract void b(int param0, int param1, int param2);

    final static void a(int param0, int param1) {
        tg.field_a = param1;
        if (param0 != 0) {
            field_f = -108;
        }
        pg.field_f = cj.field_h;
    }

    private final void b(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        ((vf) this).field_g = new short[((vf) this).field_b];
        int var2 = 0;
        int var3 = -49 / ((-69 - param0) / 56);
        while (var2 < ((vf) this).field_b) {
            ((vf) this).field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
            var2++;
        }
    }

    final static void a(int param0, boolean param1, int param2, au param3) {
        String var8_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        nf[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        nf var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        nf var28 = null;
        nf var29 = null;
        nf[] var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        nf stackIn_33_0 = null;
        nf stackIn_34_0 = null;
        nf stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        nf stackIn_39_0 = null;
        nf stackIn_40_0 = null;
        nf stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        nf stackIn_88_0 = null;
        nf stackIn_89_0 = null;
        nf stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        nf stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        nf stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        nf stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        int stackIn_96_2 = 0;
        nf stackIn_98_0 = null;
        nf stackIn_99_0 = null;
        nf stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        nf stackIn_102_0 = null;
        nf stackIn_103_0 = null;
        nf stackIn_104_0 = null;
        nf stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_109_0 = 0;
        nf stackIn_121_0 = null;
        nf stackIn_122_0 = null;
        nf stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        nf stackIn_126_0 = null;
        nf stackIn_127_0 = null;
        nf stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        nf stackIn_130_0 = null;
        nf stackIn_131_0 = null;
        nf stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        nf stackIn_134_0 = null;
        nf stackIn_135_0 = null;
        nf stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        String stackIn_151_0 = null;
        nf stackIn_155_0 = null;
        nf stackIn_156_0 = null;
        nf stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        nf stackIn_158_0 = null;
        nf stackIn_159_0 = null;
        nf stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_168_0 = 0;
        int stackIn_214_0 = 0;
        int stackIn_231_0 = 0;
        nf stackIn_320_0 = null;
        nf stackIn_321_0 = null;
        nf stackIn_322_0 = null;
        nf stackIn_323_0 = null;
        int stackIn_323_1 = 0;
        nf stackIn_328_0 = null;
        boolean stackIn_328_1 = false;
        nf stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        nf stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        int stackIn_330_2 = 0;
        nf stackIn_332_0 = null;
        nf stackIn_333_0 = null;
        nf stackIn_334_0 = null;
        int stackIn_334_1 = 0;
        nf stackIn_336_0 = null;
        nf stackIn_337_0 = null;
        nf stackIn_338_0 = null;
        nf stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_49_0 = 0;
        nf stackOut_32_0 = null;
        nf stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        nf stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        nf stackOut_38_0 = null;
        nf stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        nf stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        nf stackOut_97_0 = null;
        nf stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        nf stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        nf stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        nf stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        int stackOut_95_2 = 0;
        nf stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        int stackOut_94_2 = 0;
        nf stackOut_87_0 = null;
        nf stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        nf stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        nf stackOut_101_0 = null;
        nf stackOut_102_0 = null;
        nf stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        nf stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        String stackOut_150_0 = null;
        Object stackOut_149_0 = null;
        nf stackOut_154_0 = null;
        nf stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        nf stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        nf stackOut_157_0 = null;
        nf stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        nf stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_167_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_213_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_229_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        nf stackOut_331_0 = null;
        nf stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        nf stackOut_332_0 = null;
        int stackOut_332_1 = 0;
        nf stackOut_327_0 = null;
        boolean stackOut_327_1 = false;
        nf stackOut_329_0 = null;
        boolean stackOut_329_1 = false;
        int stackOut_329_2 = 0;
        nf stackOut_328_0 = null;
        boolean stackOut_328_1 = false;
        int stackOut_328_2 = 0;
        nf stackOut_319_0 = null;
        nf stackOut_320_0 = null;
        nf stackOut_321_0 = null;
        int stackOut_321_1 = 0;
        nf stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        nf stackOut_335_0 = null;
        nf stackOut_336_0 = null;
        nf stackOut_337_0 = null;
        int stackOut_337_1 = 0;
        nf stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        nf stackOut_120_0 = null;
        nf stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        nf stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        nf stackOut_133_0 = null;
        nf stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        nf stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        nf stackOut_129_0 = null;
        nf stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        nf stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        nf stackOut_125_0 = null;
        nf stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        nf stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        var8_ref2 = null;
        L0: {
          var26 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1) {
            L1: {
              if (ua.field_s) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (vu.b(false)) {
                if (!param3.field_kc) {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_7_0 = stackOut_4_0;
                  break L2;
                }
              } else {
                stackOut_2_0 = 0;
                stackIn_7_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_7_0;
            break L0;
          }
        }
        L3: {
          L4: {
            L5: {
              var5 = 0;
              if (!param1) {
                var6 = 0;
                L6: while (true) {
                  if (var6 >= 5) {
                    L7: {
                      if (!pu.field_k[0][2].field_jb) {
                        break L7;
                      } else {
                        if (!vu.b(false)) {
                          ad.field_I = fo.a(4800, op.field_a, new String[1]);
                          break L7;
                        } else {
                          ad.field_I = ra.field_f;
                          break L7;
                        }
                      }
                    }
                    if ((lm.field_e.length ^ -1) <= -3) {
                      L8: {
                        if (param1) {
                          if (-1 != bp.field_c) {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L8;
                          } else {
                            stackOut_51_0 = 0;
                            stackIn_54_0 = stackOut_51_0;
                            break L8;
                          }
                        } else {
                          stackOut_49_0 = 0;
                          stackIn_54_0 = stackOut_49_0;
                          break L8;
                        }
                      }
                      var6 = stackIn_54_0;
                      if (var6 != 0) {
                        var7 = bp.field_c;
                        var8_int = 0;
                        L9: while (true) {
                          if (var8_int >= ln.field_d.length) {
                            break L5;
                          } else {
                            ln.field_d[var8_int] = (byte) 0;
                            var8_int++;
                            continue L9;
                          }
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L10: {
                      if (var4 == 0) {
                        break L10;
                      } else {
                        if (-1 == (pu.field_k[0][var6 - -1].field_yb ^ -1)) {
                          break L10;
                        } else {
                          if (var6 == param3.field_Tb) {
                            break L10;
                          } else {
                            var5 = 1;
                            param3.field_Tb = var6;
                            break L10;
                          }
                        }
                      }
                    }
                    L11: {
                      stackOut_32_0 = pu.field_k[0][1 + var6];
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_33_0 = stackOut_32_0;
                      if (var4 == 0) {
                        stackOut_34_0 = (nf) (Object) stackIn_34_0;
                        stackOut_34_1 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        break L11;
                      } else {
                        stackOut_33_0 = (nf) (Object) stackIn_33_0;
                        stackOut_33_1 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        break L11;
                      }
                    }
                    L12: {
                      ((nf) (Object) stackIn_35_0).field_xb = stackIn_35_1 != 0;
                      if (fh.field_c) {
                        break L12;
                      } else {
                        if ((var6 ^ -1) != -4) {
                          break L12;
                        } else {
                          pu.field_k[0][var6 - -1].field_xb = false;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      stackOut_38_0 = pu.field_k[0][1 + var6];
                      stackIn_40_0 = stackOut_38_0;
                      stackIn_39_0 = stackOut_38_0;
                      if (var6 != param3.field_Tb) {
                        stackOut_40_0 = (nf) (Object) stackIn_40_0;
                        stackOut_40_1 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        break L13;
                      } else {
                        stackOut_39_0 = (nf) (Object) stackIn_39_0;
                        stackOut_39_1 = 1;
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        break L13;
                      }
                    }
                    ((nf) (Object) stackIn_41_0).field_rb = stackIn_41_1 != 0;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                if ((lm.field_e.length ^ -1) <= -3) {
                  L14: {
                    if (param1) {
                      if (-1 != bp.field_c) {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        break L14;
                      } else {
                        stackOut_18_0 = 0;
                        stackIn_21_0 = stackOut_18_0;
                        break L14;
                      }
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_21_0 = stackOut_16_0;
                      break L14;
                    }
                  }
                  var6 = stackIn_21_0;
                  if (var6 != 0) {
                    var7 = bp.field_c;
                    var8_int = 0;
                    L15: while (true) {
                      if (var8_int >= ln.field_d.length) {
                        break L5;
                      } else {
                        ln.field_d[var8_int] = (byte) 0;
                        var8_int++;
                        continue L15;
                      }
                    }
                  } else {
                    break L4;
                  }
                } else {
                  break L3;
                }
              }
            }
            ln.field_d[var7 / 8] = (byte)oe.c((int) ln.field_d[var7 / 8], 1 << var7 % 8);
            break L4;
          }
          L16: {
            if (param1) {
              stackOut_62_0 = -1;
              stackIn_63_0 = stackOut_62_0;
              break L16;
            } else {
              stackOut_61_0 = 0;
              stackIn_63_0 = stackOut_61_0;
              break L16;
            }
          }
          var7 = stackIn_63_0;
          L17: while (true) {
            if (var7 >= lm.field_e.length) {
              break L3;
            } else {
              L18: {
                if (var6 != 0) {
                  if (bp.field_c != var7) {
                    stackOut_69_0 = 1;
                    stackIn_71_0 = stackOut_69_0;
                    break L18;
                  } else {
                    stackOut_68_0 = 0;
                    stackIn_71_0 = stackOut_68_0;
                    break L18;
                  }
                } else {
                  stackOut_66_0 = 0;
                  stackIn_71_0 = stackOut_66_0;
                  break L18;
                }
              }
              L19: {
                var8_int = stackIn_71_0;
                if (var4 == 0) {
                  break L19;
                } else {
                  if (0 != pu.field_k[1][var7 - -1].field_yb) {
                    if (!param1) {
                      var9 = lm.field_e[var7];
                      if (var9 != param3.field_nc) {
                        param3.field_nc = var9;
                        var5 = 1;
                        break L19;
                      } else {
                        break L19;
                      }
                    } else {
                      if (var6 == 0) {
                        if (0 != (var7 ^ -1)) {
                          ln.field_d[var7 / 8] = (byte)kf.b((int) ln.field_d[var7 / 8], 1 << rn.a(var7, 7));
                          break L19;
                        } else {
                          var9 = 0;
                          L20: while (true) {
                            if (var9 >= ln.field_d.length) {
                              break L19;
                            } else {
                              ln.field_d[var9] = (byte) 0;
                              var9++;
                              continue L20;
                            }
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
              }
              L21: {
                if (!param1) {
                  L22: {
                    var9 = lm.field_e[var7];
                    stackOut_97_0 = pu.field_k[1][var7 - -1];
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_98_0 = stackOut_97_0;
                    if (var9 != param3.field_nc) {
                      stackOut_99_0 = (nf) (Object) stackIn_99_0;
                      stackOut_99_1 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      stackIn_100_1 = stackOut_99_1;
                      break L22;
                    } else {
                      stackOut_98_0 = (nf) (Object) stackIn_98_0;
                      stackOut_98_1 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      stackIn_100_1 = stackOut_98_1;
                      break L22;
                    }
                  }
                  ((nf) (Object) stackIn_100_0).field_rb = stackIn_100_1 != 0;
                  break L21;
                } else {
                  if (var7 == -1) {
                    pu.field_k[1][1 + var7].field_rb = true;
                    var9 = 0;
                    L23: while (true) {
                      if (var9 >= lm.field_e.length) {
                        break L21;
                      } else {
                        L24: {
                          stackOut_93_0 = pu.field_k[1][var7 - -1];
                          stackOut_93_1 = pu.field_k[1][var7 - -1].field_rb;
                          stackIn_95_0 = stackOut_93_0;
                          stackIn_95_1 = stackOut_93_1;
                          stackIn_94_0 = stackOut_93_0;
                          stackIn_94_1 = stackOut_93_1;
                          if (0 != (ln.field_d[var9 / 8] & 1 << (7 & var9))) {
                            stackOut_95_0 = (nf) (Object) stackIn_95_0;
                            stackOut_95_1 = stackIn_95_1;
                            stackOut_95_2 = 0;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            break L24;
                          } else {
                            stackOut_94_0 = (nf) (Object) stackIn_94_0;
                            stackOut_94_1 = stackIn_94_1;
                            stackOut_94_2 = 1;
                            stackIn_96_0 = stackOut_94_0;
                            stackIn_96_1 = stackOut_94_1;
                            stackIn_96_2 = stackOut_94_2;
                            break L24;
                          }
                        }
                        ((nf) (Object) stackIn_96_0).field_rb = stackIn_96_1 & stackIn_96_2 != 0;
                        var9++;
                        continue L23;
                      }
                    }
                  } else {
                    L25: {
                      stackOut_87_0 = pu.field_k[1][var7 - -1];
                      stackIn_89_0 = stackOut_87_0;
                      stackIn_88_0 = stackOut_87_0;
                      if ((ln.field_d[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_89_0 = (nf) (Object) stackIn_89_0;
                        stackOut_89_1 = 0;
                        stackIn_90_0 = stackOut_89_0;
                        stackIn_90_1 = stackOut_89_1;
                        break L25;
                      } else {
                        stackOut_88_0 = (nf) (Object) stackIn_88_0;
                        stackOut_88_1 = 1;
                        stackIn_90_0 = stackOut_88_0;
                        stackIn_90_1 = stackOut_88_1;
                        break L25;
                      }
                    }
                    ((nf) (Object) stackIn_90_0).field_rb = stackIn_90_1 != 0;
                    break L21;
                  }
                }
              }
              L26: {
                L27: {
                  stackOut_101_0 = pu.field_k[1][var7 - -1];
                  stackIn_104_0 = stackOut_101_0;
                  stackIn_102_0 = stackOut_101_0;
                  if (var4 == 0) {
                    break L27;
                  } else {
                    stackOut_102_0 = (nf) (Object) stackIn_102_0;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (var8_int != 0) {
                      break L27;
                    } else {
                      stackOut_103_0 = (nf) (Object) stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L26;
                    }
                  }
                }
                stackOut_104_0 = (nf) (Object) stackIn_104_0;
                stackOut_104_1 = 0;
                stackIn_105_0 = stackOut_104_0;
                stackIn_105_1 = stackOut_104_1;
                break L26;
              }
              ((nf) (Object) stackIn_105_0).field_xb = stackIn_105_1 != 0;
              var7++;
              continue L17;
            }
          }
        }
        L28: {
          if (!param1) {
            stackOut_108_0 = 1;
            stackIn_109_0 = stackOut_108_0;
            break L28;
          } else {
            stackOut_107_0 = 0;
            stackIn_109_0 = stackOut_107_0;
            break L28;
          }
        }
        var6 = stackIn_109_0;
        L29: while (true) {
          if (-4 >= var6) {
            L30: {
              if (!param1) {
                break L30;
              } else {
                if (-2 <= (ei.field_h ^ -1)) {
                  break L30;
                } else {
                  var6 = 0;
                  L31: while (true) {
                    if (1 + ei.field_h <= var6) {
                      break L30;
                    } else {
                      L32: {
                        var29 = pu.field_k[3][var6];
                        if (var4 == 0) {
                          break L32;
                        } else {
                          if (-1 != (var29.field_yb ^ -1)) {
                            nh.field_E = var6;
                            break L32;
                          } else {
                            break L32;
                          }
                        }
                      }
                      L33: {
                        if (!var29.field_jb) {
                          break L33;
                        } else {
                          if (0 < var6) {
                            L34: {
                              if (cj.field_j != null) {
                                stackOut_150_0 = cj.field_j[var6 + -1];
                                stackIn_151_0 = stackOut_150_0;
                                break L34;
                              } else {
                                stackOut_149_0 = null;
                                stackIn_151_0 = (String) (Object) stackOut_149_0;
                                break L34;
                              }
                            }
                            var8_ref2 = (String) (Object) stackIn_151_0;
                            if (var8_ref2 != null) {
                              ad.field_I = var8_ref2;
                              break L33;
                            } else {
                              break L33;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                      L35: {
                        stackOut_154_0 = (nf) var29;
                        stackIn_156_0 = stackOut_154_0;
                        stackIn_155_0 = stackOut_154_0;
                        if (var6 != nh.field_E) {
                          stackOut_156_0 = (nf) (Object) stackIn_156_0;
                          stackOut_156_1 = 0;
                          stackIn_157_0 = stackOut_156_0;
                          stackIn_157_1 = stackOut_156_1;
                          break L35;
                        } else {
                          stackOut_155_0 = (nf) (Object) stackIn_155_0;
                          stackOut_155_1 = 1;
                          stackIn_157_0 = stackOut_155_0;
                          stackIn_157_1 = stackOut_155_1;
                          break L35;
                        }
                      }
                      L36: {
                        ((nf) (Object) stackIn_157_0).field_rb = stackIn_157_1 != 0;
                        stackOut_157_0 = (nf) var29;
                        stackIn_159_0 = stackOut_157_0;
                        stackIn_158_0 = stackOut_157_0;
                        if (var4 == 0) {
                          stackOut_159_0 = (nf) (Object) stackIn_159_0;
                          stackOut_159_1 = 0;
                          stackIn_160_0 = stackOut_159_0;
                          stackIn_160_1 = stackOut_159_1;
                          break L36;
                        } else {
                          stackOut_158_0 = (nf) (Object) stackIn_158_0;
                          stackOut_158_1 = 1;
                          stackIn_160_0 = stackOut_158_0;
                          stackIn_160_1 = stackOut_158_1;
                          break L36;
                        }
                      }
                      ((nf) (Object) stackIn_160_0).field_xb = stackIn_160_1 != 0;
                      var6++;
                      continue L31;
                    }
                  }
                }
              }
            }
            L37: {
              var6 = 0;
              if (param0 == 1) {
                break L37;
              } else {
                field_e = null;
                break L37;
              }
            }
            var7 = 0;
            L38: while (true) {
              if (tq.field_b <= var7) {
                L39: {
                  if (var5 == 0) {
                    break L39;
                  } else {
                    if (!param1) {
                      cl.b(5, param2);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
                return;
              } else {
                L40: {
                  var30 = pu.field_k[var7 + 4];
                  var8 = var30;
                  if (param1) {
                    stackOut_167_0 = -1;
                    stackIn_168_0 = stackOut_167_0;
                    break L40;
                  } else {
                    stackOut_166_0 = 0;
                    stackIn_168_0 = stackOut_166_0;
                    break L40;
                  }
                }
                var9 = stackIn_168_0;
                L41: while (true) {
                  if (var9 >= -1 + var30.length) {
                    var6 = var6 + (255 & t.field_b[var7]);
                    var7++;
                    continue L38;
                  } else {
                    L42: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L42;
                      } else {
                        if (-1 >= (var9 ^ -1)) {
                          L43: {
                            if (sk.field_j == null) {
                              break L43;
                            } else {
                              if (sk.field_j[var7] == null) {
                                break L43;
                              } else {
                                if (((ei.field_a ^ -1) & sk.field_j[var7][var9]) > 0) {
                                  var14 = 1;
                                  var15 = fd.a(true, sk.field_j[var7][var9] & ei.field_a);
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                          L44: {
                            if (ep.field_p == null) {
                              break L44;
                            } else {
                              if (null == ep.field_p[var7]) {
                                break L44;
                              } else {
                                if (-1 < df.field_M) {
                                  break L44;
                                } else {
                                  if (ep.field_p[var7][var9]) {
                                    var10 = 1;
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                            }
                          }
                          L45: {
                            if (null == iv.field_e) {
                              break L45;
                            } else {
                              if (null == iv.field_e[var7]) {
                                break L45;
                              } else {
                                L46: {
                                  var16 = iv.field_e[var7][var9];
                                  if (0 == var16) {
                                    break L46;
                                  } else {
                                    if (bj.field_k) {
                                      break L46;
                                    } else {
                                      if (df.field_M <= 0) {
                                        var10 = 1;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                if (0 >= var16) {
                                  break L45;
                                } else {
                                  if (al.field_g >= var16) {
                                    break L45;
                                  } else {
                                    var12 = 1;
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            if (null == jv.field_d) {
                              break L47;
                            } else {
                              if (jv.field_d[var7] != null) {
                                L48: {
                                  var16 = jv.field_d[var7][var9];
                                  if (0 >= var16) {
                                    break L48;
                                  } else {
                                    if (var16 <= be.field_s) {
                                      break L48;
                                    } else {
                                      var11 = 1;
                                      break L48;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L47;
                                } else {
                                  if (bj.field_k) {
                                    break L47;
                                  } else {
                                    if (df.field_M <= 0) {
                                      var10 = 1;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              } else {
                                break L47;
                              }
                            }
                          }
                          L49: {
                            if (param1) {
                              if (ke.field_b != null) {
                                if (null != ke.field_b[var7]) {
                                  if (!ke.field_b[var7][var9]) {
                                    stackOut_213_0 = 0;
                                    stackIn_214_0 = stackOut_213_0;
                                    break L49;
                                  } else {
                                    stackOut_212_0 = 1;
                                    stackIn_214_0 = stackOut_212_0;
                                    break L49;
                                  }
                                } else {
                                  stackOut_210_0 = 0;
                                  stackIn_214_0 = stackOut_210_0;
                                  break L49;
                                }
                              } else {
                                stackOut_208_0 = 0;
                                stackIn_214_0 = stackOut_208_0;
                                break L49;
                              }
                            } else {
                              stackOut_206_0 = 0;
                              stackIn_214_0 = stackOut_206_0;
                              break L49;
                            }
                          }
                          var13 = stackIn_214_0;
                          break L42;
                        } else {
                          break L42;
                        }
                      }
                    }
                    L50: {
                      if (-3 < (hi.field_j ^ -1)) {
                        break L50;
                      } else {
                        if (br.field_f[12]) {
                          var11 = 0;
                          var12 = 0;
                          var10 = 0;
                          var13 = 0;
                          var14 = 0;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                    }
                    L51: {
                      fc.field_a = true;
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_229_0 = 1;
                                stackIn_231_0 = stackOut_229_0;
                                break L51;
                              } else {
                                stackOut_228_0 = 0;
                                stackIn_231_0 = stackOut_228_0;
                                break L51;
                              }
                            } else {
                              stackOut_226_0 = 1;
                              stackIn_231_0 = stackOut_226_0;
                              break L51;
                            }
                          } else {
                            stackOut_224_0 = 1;
                            stackIn_231_0 = stackOut_224_0;
                            break L51;
                          }
                        } else {
                          stackOut_222_0 = 1;
                          stackIn_231_0 = stackOut_222_0;
                          break L51;
                        }
                      } else {
                        stackOut_220_0 = 1;
                        stackIn_231_0 = stackOut_220_0;
                        break L51;
                      }
                    }
                    L52: {
                      var16 = stackIn_231_0;
                      if (var16 != 0) {
                        break L52;
                      } else {
                        if (0 > var9) {
                          break L52;
                        } else {
                          if (null == fs.field_d) {
                            break L52;
                          } else {
                            L53: {
                              if (!param1) {
                                break L53;
                              } else {
                                if (!ua.field_s) {
                                  break L53;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            L54: {
                              jp.field_a = false;
                              fc.field_a = false;
                              if (null != ur.field_B) {
                                break L54;
                              } else {
                                ur.field_B = new byte[tq.field_b];
                                dt.field_d = new boolean[tq.field_b];
                                break L54;
                              }
                            }
                            var17_int = 0;
                            L55: while (true) {
                              if (var17_int >= var7) {
                                L56: {
                                  es.a(0, var7, param3, -1, param1, var9, (byte) 103, -1);
                                  if (-3 < (hi.field_j ^ -1)) {
                                    break L56;
                                  } else {
                                    if (!br.field_f[12]) {
                                      break L56;
                                    } else {
                                      fc.field_a = true;
                                      break L56;
                                    }
                                  }
                                }
                                if (fc.field_a) {
                                  break L52;
                                } else {
                                  var16 = 1;
                                  break L52;
                                }
                              } else {
                                dt.field_d[var17_int] = false;
                                var17_int++;
                                continue L55;
                              }
                            }
                          }
                        }
                      }
                    }
                    L57: {
                      var17 = var8[var9 + 1];
                      if (var4 != 0) {
                        if (!param1) {
                          break L57;
                        } else {
                          if (var16 != 0) {
                            tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7) ^ -1);
                            break L57;
                          } else {
                            if (var16 == 0) {
                              break L57;
                            } else {
                              tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7) ^ -1);
                              break L57;
                            }
                          }
                        }
                      } else {
                        if (!param1) {
                          break L57;
                        } else {
                          if (var16 == 0) {
                            break L57;
                          } else {
                            tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7) ^ -1);
                            break L57;
                          }
                        }
                      }
                    }
                    L58: {
                      if (-1 > var9) {
                        break L58;
                      } else {
                        if (!var17.field_jb) {
                          break L58;
                        } else {
                          L59: {
                            if (ll.field_Mb == null) {
                              var18_ref = null;
                              break L59;
                            } else {
                              if (ll.field_Mb[var7] == null) {
                                var18_ref = null;
                                break L59;
                              } else {
                                var18_ref_String = ll.field_Mb[var7][var9];
                                break L59;
                              }
                            }
                          }
                          L60: {
                            if (wb.field_a == null) {
                              var19 = null;
                              break L60;
                            } else {
                              if (null == wb.field_a[var7]) {
                                var19 = null;
                                break L60;
                              } else {
                                var19_ref = wb.field_a[var7][var9];
                                break L60;
                              }
                            }
                          }
                          L61: {
                            var20 = null;
                            if (var19 == null) {
                              break L61;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = (String) var19;
                                break L61;
                              } else {
                                break L61;
                              }
                            }
                          }
                          L62: {
                            var21 = null;
                            if (var13 != 0) {
                              var21 = sc.field_h;
                              var22 = var21;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var25 = var21;
                              var22 = var25;
                              var25 = var22;
                              var22 = var25;
                              var21 = var22;
                              var22 = var25;
                              break L62;
                            } else {
                              if (var10 != 0) {
                                var21 = gt.field_a;
                                break L62;
                              } else {
                                L63: {
                                  if (var11 == 0) {
                                    break L63;
                                  } else {
                                    var22_int = jv.field_d[var7][var9] - be.field_s;
                                    if (var22_int != 1) {
                                      var21 = fo.a(4800, mg.field_a, new String[1]);
                                      break L63;
                                    } else {
                                      var21 = bt.field_a;
                                      break L63;
                                    }
                                  }
                                }
                                L64: {
                                  if (var12 != 0) {
                                    var31 = fo.a(4800, qb.field_k, new String[2]);
                                    var22 = var31;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    var25 = var31;
                                    var22 = var25;
                                    if (var21 == null) {
                                      var21 = var31;
                                      break L64;
                                    } else {
                                      var21 = var21 + "<br>" + var31;
                                      break L64;
                                    }
                                  } else {
                                    break L64;
                                  }
                                }
                                if (var14 != 0) {
                                  L65: {
                                    var22 = md.field_F;
                                    if (-1 <= (var15 ^ -1)) {
                                      break L65;
                                    } else {
                                      if (jl.field_c == null) {
                                        break L65;
                                      } else {
                                        if (var15 > jl.field_c.length) {
                                          break L65;
                                        } else {
                                          if (null != jl.field_c[var15 - 1]) {
                                            var22_ref = jl.field_c[var15 - 1][0];
                                            break L65;
                                          } else {
                                            break L65;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 != null) {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L62;
                                  } else {
                                    var21 = var22_ref;
                                    break L62;
                                  }
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                          L66: {
                            if (var4 == 0) {
                              break L66;
                            } else {
                              if (fc.field_a) {
                                break L66;
                              } else {
                                L67: {
                                  var22_ref = null;
                                  if (jp.field_a) {
                                    var22 = "</col>" + ep.field_h + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L67;
                                  } else {
                                    break L67;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L68: while (true) {
                                  if (var24 >= var7) {
                                    if (var23 == 0) {
                                      var21 = fo.a(4800, ab.field_e, new String[1]);
                                      break L66;
                                    } else {
                                      var21 = mj.field_a + var22;
                                      break L66;
                                    }
                                  } else {
                                    if (dt.field_d[var24]) {
                                      var25 = "</col>" + ob.field_M[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 != null) {
                                        var22 = var22 + ", " + var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var23 = 1;
                                        var24++;
                                        continue L68;
                                      } else {
                                        var22 = var25;
                                        var24++;
                                        continue L68;
                                      }
                                    } else {
                                      var24++;
                                      continue L68;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L69: {
                            if (var21 == null) {
                              break L69;
                            } else {
                              var21 = "<col=A00000>" + var21;
                              var32 = dj.a(6609, var21, "<br>", "<br><col=A00000>");
                              if (var20 != null) {
                                var20 = var20 + "<br>" + var32;
                                break L69;
                              } else {
                                var20 = var32;
                                break L69;
                              }
                            }
                          }
                          if (var20 == null) {
                            break L58;
                          } else {
                            ad.field_I = var20;
                            break L58;
                          }
                        }
                      }
                    }
                    L70: {
                      if (param1) {
                        if (var9 != -1) {
                          L71: {
                            stackOut_331_0 = (nf) var17;
                            stackIn_333_0 = stackOut_331_0;
                            stackIn_332_0 = stackOut_331_0;
                            if (-1 == (tg.field_d[(var9 + var6) / 8] & 1 << (var9 + var6 & 7) ^ -1)) {
                              stackOut_333_0 = (nf) (Object) stackIn_333_0;
                              stackOut_333_1 = 0;
                              stackIn_334_0 = stackOut_333_0;
                              stackIn_334_1 = stackOut_333_1;
                              break L71;
                            } else {
                              stackOut_332_0 = (nf) (Object) stackIn_332_0;
                              stackOut_332_1 = 1;
                              stackIn_334_0 = stackOut_332_0;
                              stackIn_334_1 = stackOut_332_1;
                              break L71;
                            }
                          }
                          ((nf) (Object) stackIn_334_0).field_rb = stackIn_334_1 != 0;
                          break L70;
                        } else {
                          var17.field_rb = true;
                          var27 = var6;
                          var18 = var27;
                          L72: while (true) {
                            if (var30.length + var6 + -1 <= var27) {
                              break L70;
                            } else {
                              L73: {
                                stackOut_327_0 = (nf) var17;
                                stackOut_327_1 = var17.field_rb;
                                stackIn_329_0 = stackOut_327_0;
                                stackIn_329_1 = stackOut_327_1;
                                stackIn_328_0 = stackOut_327_0;
                                stackIn_328_1 = stackOut_327_1;
                                if (-1 != (tg.field_d[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                  stackOut_329_0 = (nf) (Object) stackIn_329_0;
                                  stackOut_329_1 = stackIn_329_1;
                                  stackOut_329_2 = 0;
                                  stackIn_330_0 = stackOut_329_0;
                                  stackIn_330_1 = stackOut_329_1;
                                  stackIn_330_2 = stackOut_329_2;
                                  break L73;
                                } else {
                                  stackOut_328_0 = (nf) (Object) stackIn_328_0;
                                  stackOut_328_1 = stackIn_328_1;
                                  stackOut_328_2 = 1;
                                  stackIn_330_0 = stackOut_328_0;
                                  stackIn_330_1 = stackOut_328_1;
                                  stackIn_330_2 = stackOut_328_2;
                                  break L73;
                                }
                              }
                              ((nf) (Object) stackIn_330_0).field_rb = stackIn_330_1 & stackIn_330_2 != 0;
                              var27++;
                              continue L72;
                            }
                          }
                        }
                      } else {
                        L74: {
                          L75: {
                            stackOut_319_0 = (nf) var17;
                            stackIn_322_0 = stackOut_319_0;
                            stackIn_320_0 = stackOut_319_0;
                            if (!fc.field_a) {
                              break L75;
                            } else {
                              stackOut_320_0 = (nf) (Object) stackIn_320_0;
                              stackIn_322_0 = stackOut_320_0;
                              stackIn_321_0 = stackOut_320_0;
                              if ((byte)var9 != param3.field_pc[var7]) {
                                break L75;
                              } else {
                                stackOut_321_0 = (nf) (Object) stackIn_321_0;
                                stackOut_321_1 = 1;
                                stackIn_323_0 = stackOut_321_0;
                                stackIn_323_1 = stackOut_321_1;
                                break L74;
                              }
                            }
                          }
                          stackOut_322_0 = (nf) (Object) stackIn_322_0;
                          stackOut_322_1 = 0;
                          stackIn_323_0 = stackOut_322_0;
                          stackIn_323_1 = stackOut_322_1;
                          break L74;
                        }
                        ((nf) (Object) stackIn_323_0).field_rb = stackIn_323_1 != 0;
                        break L70;
                      }
                    }
                    L76: {
                      L77: {
                        stackOut_335_0 = (nf) var17;
                        stackIn_338_0 = stackOut_335_0;
                        stackIn_336_0 = stackOut_335_0;
                        if (var4 == 0) {
                          break L77;
                        } else {
                          stackOut_336_0 = (nf) (Object) stackIn_336_0;
                          stackIn_338_0 = stackOut_336_0;
                          stackIn_337_0 = stackOut_336_0;
                          if (var16 != 0) {
                            break L77;
                          } else {
                            stackOut_337_0 = (nf) (Object) stackIn_337_0;
                            stackOut_337_1 = 1;
                            stackIn_339_0 = stackOut_337_0;
                            stackIn_339_1 = stackOut_337_1;
                            break L76;
                          }
                        }
                      }
                      stackOut_338_0 = (nf) (Object) stackIn_338_0;
                      stackOut_338_1 = 0;
                      stackIn_339_0 = stackOut_338_0;
                      stackIn_339_1 = stackOut_338_1;
                      break L76;
                    }
                    ((nf) (Object) stackIn_339_0).field_xb = stackIn_339_1 != 0;
                    var9++;
                    continue L41;
                  }
                }
              }
            }
          } else {
            L78: {
              var28 = pu.field_k[2][var6];
              if (var4 == 0) {
                break L78;
              } else {
                if (-1 == var28.field_yb) {
                  break L78;
                } else {
                  if (param1) {
                    if (var6 == 0) {
                      sm.field_b = 0;
                      break L78;
                    } else {
                      sm.field_b = sm.field_b ^ var6;
                      break L78;
                    }
                  } else {
                    if (var6 != param3.field_ac) {
                      param3.field_ac = var6;
                      var5 = 1;
                      break L78;
                    } else {
                      break L78;
                    }
                  }
                }
              }
            }
            L79: {
              stackOut_120_0 = (nf) var28;
              stackIn_122_0 = stackOut_120_0;
              stackIn_121_0 = stackOut_120_0;
              if (var4 == 0) {
                stackOut_122_0 = (nf) (Object) stackIn_122_0;
                stackOut_122_1 = 0;
                stackIn_123_0 = stackOut_122_0;
                stackIn_123_1 = stackOut_122_1;
                break L79;
              } else {
                stackOut_121_0 = (nf) (Object) stackIn_121_0;
                stackOut_121_1 = 1;
                stackIn_123_0 = stackOut_121_0;
                stackIn_123_1 = stackOut_121_1;
                break L79;
              }
            }
            ((nf) (Object) stackIn_123_0).field_xb = stackIn_123_1 != 0;
            if (!param1) {
              L80: {
                stackOut_133_0 = (nf) var28;
                stackIn_135_0 = stackOut_133_0;
                stackIn_134_0 = stackOut_133_0;
                if ((var6 & param3.field_ac) == 0) {
                  stackOut_135_0 = (nf) (Object) stackIn_135_0;
                  stackOut_135_1 = 0;
                  stackIn_136_0 = stackOut_135_0;
                  stackIn_136_1 = stackOut_135_1;
                  break L80;
                } else {
                  stackOut_134_0 = (nf) (Object) stackIn_134_0;
                  stackOut_134_1 = 1;
                  stackIn_136_0 = stackOut_134_0;
                  stackIn_136_1 = stackOut_134_1;
                  break L80;
                }
              }
              ((nf) (Object) stackIn_136_0).field_rb = stackIn_136_1 != 0;
              var6++;
              continue L29;
            } else {
              if (-1 != var6) {
                L81: {
                  stackOut_129_0 = (nf) var28;
                  stackIn_131_0 = stackOut_129_0;
                  stackIn_130_0 = stackOut_129_0;
                  if (-1 == (var6 & sm.field_b ^ -1)) {
                    stackOut_131_0 = (nf) (Object) stackIn_131_0;
                    stackOut_131_1 = 0;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    break L81;
                  } else {
                    stackOut_130_0 = (nf) (Object) stackIn_130_0;
                    stackOut_130_1 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    break L81;
                  }
                }
                ((nf) (Object) stackIn_132_0).field_rb = stackIn_132_1 != 0;
                var6++;
                continue L29;
              } else {
                L82: {
                  stackOut_125_0 = (nf) var28;
                  stackIn_127_0 = stackOut_125_0;
                  stackIn_126_0 = stackOut_125_0;
                  if (-1 != sm.field_b) {
                    stackOut_127_0 = (nf) (Object) stackIn_127_0;
                    stackOut_127_1 = 0;
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    break L82;
                  } else {
                    stackOut_126_0 = (nf) (Object) stackIn_126_0;
                    stackOut_126_1 = 1;
                    stackIn_128_0 = stackOut_126_0;
                    stackIn_128_1 = stackOut_126_1;
                    break L82;
                  }
                }
                ((nf) (Object) stackIn_128_0).field_rb = stackIn_128_1 != 0;
                var6++;
                continue L29;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_j = null;
        field_l = null;
        if (param0 >= -70) {
            return;
        }
        field_h = null;
        field_c = null;
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        L0: {
          var28 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var35 = new int[param2];
        var33 = var35;
        var31 = var33;
        var29 = var31;
        var25 = var29;
        var27 = 0;
        L1: while (true) {
          if (var27 >= param2) {
            var36 = new int[param0];
            var34 = var36;
            var32 = var34;
            var30 = var32;
            var26 = var30;
            var27 = 0;
            L2: while (true) {
              if (var27 >= param0) {
                ((vf) this).a(param1 ^ -30419);
                var23 = 0;
                L3: while (true) {
                  if (var23 >= param0) {
                    return;
                  } else {
                    var22 = 0;
                    L4: while (true) {
                      if (var22 >= param2) {
                        var23++;
                        continue L3;
                      } else {
                        var24 = 0;
                        L5: while (true) {
                          if (((vf) this).field_b <= var24) {
                            ((vf) this).a((byte) -127);
                            var22++;
                            continue L4;
                          } else {
                            L6: {
                              var27 = ((vf) this).field_g[var24] << -417351956;
                              var6 = ((vf) this).field_a * var27 >> 454290668;
                              var4 = var35[var22] * var27 >> -435855892;
                              var7 = var27 * ((vf) this).field_d >> 1295093612;
                              var5 = var36[var23] * var27 >> 382859372;
                              var5 = var5 * ((vf) this).field_d;
                              var4 = var4 * ((vf) this).field_a;
                              var8 = var4 >> 1539421644;
                              var9 = var8 - -1;
                              var10 = var5 >> 434013004;
                              var8 = var8 & 255;
                              var11 = var10 - -1;
                              var5 = var5 & 4095;
                              if (var9 < var6) {
                                var9 = var9 & 255;
                                break L6;
                              } else {
                                var9 = 0;
                                break L6;
                              }
                            }
                            L7: {
                              var10 = var10 & 255;
                              var4 = var4 & 4095;
                              if (var7 <= var11) {
                                var11 = 0;
                                break L7;
                              } else {
                                var11 = var11 & 255;
                                break L7;
                              }
                            }
                            var14 = var4 - 4096;
                            var13 = mw.field_F[var5];
                            var17 = ((vf) this).field_k[var11];
                            var15 = var5 + -4096;
                            var16 = ((vf) this).field_k[var10];
                            var12 = mw.field_F[var4];
                            var18 = ma.a(var4, 3, (int) ((vf) this).field_k[var16 + var8], var5);
                            var19 = ma.a(var14, 3, (int) ((vf) this).field_k[var9 - -var16], var5);
                            var20 = (var12 * (var19 - var18) >> -1014869492) + var18;
                            var18 = ma.a(var4, 3, (int) ((vf) this).field_k[var17 + var8], var15);
                            var19 = ma.a(var14, 3, (int) ((vf) this).field_k[var17 + var9], var15);
                            var21 = var18 + (var12 * (-var18 + var19) >> 779152012);
                            ((vf) this).b(var24, (var13 * (-var20 + var21) >> -1297562036) + var20, 19699);
                            var24++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var26[var27] = (var27 << -449439476) / param0;
                var27++;
                continue L2;
              }
            }
          } else {
            var25[var27] = (var27 << 69489804) / param2;
            var27++;
            continue L1;
          }
        }
    }

    final static ru a(int[] param0, int param1, ru param2) {
        if (param1 != -13546) {
            field_l = null;
        }
        ru var3 = new ru(0, 0, 0);
        var3.field_j = param0;
        var3.field_d = param2.field_d;
        var3.field_e = param2.field_e;
        var3.field_k = param2.field_k;
        var3.field_i = param2.field_i;
        var3.field_f = param2.field_f;
        var3.field_h = param2.field_h;
        var3.field_g = param2.field_g;
        return var3;
    }

    abstract void a(int param0);

    abstract void a(byte param0);

    vf(int param0, int param1, int param2, int param3, int param4) {
        ((vf) this).field_k = new short[512];
        ((vf) this).field_d = 4;
        ((vf) this).field_a = 4;
        ((vf) this).field_b = 4;
        ((vf) this).field_i = 0;
        ((vf) this).field_a = param2;
        ((vf) this).field_i = param0;
        ((vf) this).field_b = param1;
        ((vf) this).field_d = param3;
        this.b(-125);
        this.d(-256);
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != -1) {
            return -123;
        }
        if (!(rs.field_o != null)) {
            return -1;
        }
        if (param0 >= wi.field_c) {
            if (wi.field_c + rs.field_o.field_y > param0) {
                if (param2 >= ro.field_pb) {
                    if (!(param2 >= ro.field_pb - -rs.field_o.field_v)) {
                        return 0;
                    }
                }
            }
        }
        if (param0 >= co.field_h) {
            if (co.field_h - -rs.field_o.field_y > param0) {
                if (ug.field_a <= param2) {
                    if (!(rs.field_o.field_v + ug.field_a <= param2)) {
                        return 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void d(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -256) {
            field_f = 9;
        }
        Random var2 = new Random((long)((vf) this).field_i);
        for (var3 = 0; var3 > -256; var3++) {
            ((vf) this).field_k[var3] = (short)var3;
        }
        for (var3 = 0; -256 > var3; var3++) {
            var4 = 255 + -var3;
            var5 = ns.a(false, var4, var2);
            var6 = ((vf) this).field_k[var5];
            ((vf) this).field_k[var5] = ((vf) this).field_k[var4];
            ((vf) this).field_k[256 + var4] = (short) var6;
            ((vf) this).field_k[var4] = (short) var6;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Toxins";
        field_e = "You have entered another game.";
        field_f = -1;
        field_c = "(1 player wants to join)";
        field_l = "Add <%0> to friend list";
    }
}
