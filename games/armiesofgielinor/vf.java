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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_g = new short[this.field_b];
        var2 = 0;
        var3 = -49 / ((-69 - param0) / 56);
        L0: while (true) {
          L1: {
            if (var2 >= this.field_b) {
              break L1;
            } else {
              this.field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
              var2++;
              if (var4 != 0) {
                break L1;
              } else {
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(int param0, boolean param1, int param2, au param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        nf[] var27 = null;
        nf var28 = null;
        nf var29 = null;
        String var30 = null;
        String var31 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_32_0 = 0;
        nf stackIn_37_0 = null;
        nf stackIn_38_0 = null;
        nf stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        nf stackIn_43_0 = null;
        nf stackIn_44_0 = null;
        nf stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_80_0 = 0;
        nf stackIn_101_0 = null;
        nf stackIn_102_0 = null;
        nf stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        nf stackIn_107_0 = null;
        boolean stackIn_107_1 = false;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        nf stackIn_108_0 = null;
        boolean stackIn_108_1 = false;
        nf stackIn_109_0 = null;
        boolean stackIn_109_1 = false;
        nf stackIn_110_0 = null;
        boolean stackIn_110_1 = false;
        int stackIn_110_2 = 0;
        nf stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        int stackIn_113_3 = 0;
        nf stackIn_114_0 = null;
        nf stackIn_115_0 = null;
        nf stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        nf stackIn_118_0 = null;
        nf stackIn_119_0 = null;
        nf stackIn_120_0 = null;
        nf stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_129_0 = 0;
        nf stackIn_140_0 = null;
        nf stackIn_141_0 = null;
        nf stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        nf stackIn_145_0 = null;
        nf stackIn_146_0 = null;
        nf stackIn_147_0 = null;
        int stackIn_147_1 = 0;
        nf stackIn_149_0 = null;
        nf stackIn_150_0 = null;
        nf stackIn_151_0 = null;
        int stackIn_151_1 = 0;
        nf stackIn_153_0 = null;
        nf stackIn_154_0 = null;
        nf stackIn_155_0 = null;
        int stackIn_155_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_163_0 = 0;
        String stackIn_173_0 = null;
        nf stackIn_177_0 = null;
        nf stackIn_178_0 = null;
        nf stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        nf stackIn_180_0 = null;
        nf stackIn_181_0 = null;
        nf stackIn_182_0 = null;
        int stackIn_182_1 = 0;
        int stackIn_184_0 = 0;
        boolean stackIn_189_0 = false;
        int stackIn_192_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_253_0 = 0;
        boolean stackIn_339_0 = false;
        int stackIn_346_0 = 0;
        nf stackIn_357_0 = null;
        nf stackIn_358_0 = null;
        nf stackIn_359_0 = null;
        nf stackIn_360_0 = null;
        int stackIn_360_1 = 0;
        nf stackIn_365_0 = null;
        boolean stackIn_365_1 = false;
        int stackIn_365_2 = 0;
        int stackIn_365_3 = 0;
        nf stackIn_366_0 = null;
        boolean stackIn_366_1 = false;
        nf stackIn_367_0 = null;
        boolean stackIn_367_1 = false;
        nf stackIn_368_0 = null;
        boolean stackIn_368_1 = false;
        int stackIn_368_2 = 0;
        nf stackIn_371_0 = null;
        int stackIn_371_1 = 0;
        int stackIn_371_2 = 0;
        int stackIn_371_3 = 0;
        nf stackIn_372_0 = null;
        nf stackIn_373_0 = null;
        nf stackIn_374_0 = null;
        int stackIn_374_1 = 0;
        nf stackIn_376_0 = null;
        nf stackIn_377_0 = null;
        nf stackIn_378_0 = null;
        nf stackIn_379_0 = null;
        int stackIn_379_1 = 0;
        int stackIn_381_0 = 0;
        int stackIn_383_0 = 0;
        RuntimeException stackIn_389_0 = null;
        StringBuilder stackIn_389_1 = null;
        RuntimeException stackIn_390_0 = null;
        StringBuilder stackIn_390_1 = null;
        RuntimeException stackIn_391_0 = null;
        StringBuilder stackIn_391_1 = null;
        String stackIn_391_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_46_0 = false;
        int stackOut_31_0 = 0;
        nf stackOut_36_0 = null;
        nf stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        nf stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        nf stackOut_42_0 = null;
        nf stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        nf stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        nf stackOut_100_0 = null;
        nf stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        nf stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        nf stackOut_106_0 = null;
        boolean stackOut_106_1 = false;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        nf stackOut_107_0 = null;
        boolean stackOut_107_1 = false;
        nf stackOut_109_0 = null;
        boolean stackOut_109_1 = false;
        int stackOut_109_2 = 0;
        nf stackOut_108_0 = null;
        boolean stackOut_108_1 = false;
        int stackOut_108_2 = 0;
        nf stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_112_3 = 0;
        nf stackOut_113_0 = null;
        nf stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        nf stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        nf stackOut_117_0 = null;
        nf stackOut_118_0 = null;
        nf stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        nf stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        boolean stackOut_122_0 = false;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_128_0 = 0;
        nf stackOut_139_0 = null;
        nf stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        nf stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        nf stackOut_144_0 = null;
        nf stackOut_146_0 = null;
        int stackOut_146_1 = 0;
        nf stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        nf stackOut_148_0 = null;
        nf stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        nf stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        nf stackOut_152_0 = null;
        nf stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        nf stackOut_153_0 = null;
        int stackOut_153_1 = 0;
        boolean stackOut_157_0 = false;
        int stackOut_162_0 = 0;
        String stackOut_172_0 = null;
        Object stackOut_171_0 = null;
        nf stackOut_176_0 = null;
        nf stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        nf stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        nf stackOut_179_0 = null;
        nf stackOut_181_0 = null;
        int stackOut_181_1 = 0;
        nf stackOut_180_0 = null;
        int stackOut_180_1 = 0;
        int stackOut_183_0 = 0;
        boolean stackOut_188_0 = false;
        int stackOut_191_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_252_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_345_0 = 0;
        boolean stackOut_338_0 = false;
        nf stackOut_356_0 = null;
        nf stackOut_357_0 = null;
        nf stackOut_358_0 = null;
        int stackOut_358_1 = 0;
        nf stackOut_359_0 = null;
        int stackOut_359_1 = 0;
        nf stackOut_364_0 = null;
        boolean stackOut_364_1 = false;
        int stackOut_364_2 = 0;
        int stackOut_364_3 = 0;
        nf stackOut_365_0 = null;
        boolean stackOut_365_1 = false;
        nf stackOut_367_0 = null;
        boolean stackOut_367_1 = false;
        int stackOut_367_2 = 0;
        nf stackOut_366_0 = null;
        boolean stackOut_366_1 = false;
        int stackOut_366_2 = 0;
        nf stackOut_370_0 = null;
        int stackOut_370_1 = 0;
        int stackOut_370_2 = 0;
        int stackOut_370_3 = 0;
        nf stackOut_371_0 = null;
        nf stackOut_373_0 = null;
        int stackOut_373_1 = 0;
        nf stackOut_372_0 = null;
        int stackOut_372_1 = 0;
        nf stackOut_375_0 = null;
        nf stackOut_376_0 = null;
        nf stackOut_377_0 = null;
        int stackOut_377_1 = 0;
        nf stackOut_378_0 = null;
        int stackOut_378_1 = 0;
        int stackOut_380_0 = 0;
        int stackOut_382_0 = 0;
        RuntimeException stackOut_388_0 = null;
        StringBuilder stackOut_388_1 = null;
        RuntimeException stackOut_390_0 = null;
        StringBuilder stackOut_390_1 = null;
        String stackOut_390_2 = null;
        RuntimeException stackOut_389_0 = null;
        StringBuilder stackOut_389_1 = null;
        String stackOut_389_2 = null;
        var26 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  L3: {
                    if (vu.b(false)) {
                      if (!param3.field_kc) {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L3;
                      } else {
                        stackOut_5_0 = 0;
                        stackIn_8_0 = stackOut_5_0;
                        break L3;
                      }
                    } else {
                      stackOut_3_0 = 0;
                      stackIn_8_0 = stackOut_3_0;
                      break L3;
                    }
                  }
                  var4_int = stackIn_8_0;
                  if (var26 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (ua.field_s) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L4;
                } else {
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L4;
                }
              }
              var4_int = stackIn_12_0;
              break L1;
            }
            L5: {
              L6: {
                L7: {
                  L8: {
                    var5 = 0;
                    if (!param1) {
                      var6 = 0;
                      L9: while (true) {
                        L10: {
                          if (var6 >= 5) {
                            stackOut_46_0 = pu.field_k[0][2].field_jb;
                            stackIn_47_0 = stackOut_46_0 ? 1 : 0;
                            break L10;
                          } else {
                            stackOut_31_0 = var4_int;
                            stackIn_47_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (var26 != 0) {
                              break L10;
                            } else {
                              L11: {
                                if (stackIn_32_0 == 0) {
                                  break L11;
                                } else {
                                  if (-1 == (pu.field_k[0][var6 - -1].field_yb ^ -1)) {
                                    break L11;
                                  } else {
                                    if (var6 == param3.field_Tb) {
                                      break L11;
                                    } else {
                                      var5 = 1;
                                      param3.field_Tb = var6;
                                      break L11;
                                    }
                                  }
                                }
                              }
                              L12: {
                                stackOut_36_0 = pu.field_k[0][1 + var6];
                                stackIn_38_0 = stackOut_36_0;
                                stackIn_37_0 = stackOut_36_0;
                                if (var4_int == 0) {
                                  stackOut_38_0 = (nf) ((Object) stackIn_38_0);
                                  stackOut_38_1 = 0;
                                  stackIn_39_0 = stackOut_38_0;
                                  stackIn_39_1 = stackOut_38_1;
                                  break L12;
                                } else {
                                  stackOut_37_0 = (nf) ((Object) stackIn_37_0);
                                  stackOut_37_1 = 1;
                                  stackIn_39_0 = stackOut_37_0;
                                  stackIn_39_1 = stackOut_37_1;
                                  break L12;
                                }
                              }
                              L13: {
                                stackIn_39_0.field_xb = stackIn_39_1 != 0;
                                if (fh.field_c) {
                                  break L13;
                                } else {
                                  if ((var6 ^ -1) != -4) {
                                    break L13;
                                  } else {
                                    pu.field_k[0][var6 - -1].field_xb = false;
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                stackOut_42_0 = pu.field_k[0][1 + var6];
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_43_0 = stackOut_42_0;
                                if (var6 != param3.field_Tb) {
                                  stackOut_44_0 = (nf) ((Object) stackIn_44_0);
                                  stackOut_44_1 = 0;
                                  stackIn_45_0 = stackOut_44_0;
                                  stackIn_45_1 = stackOut_44_1;
                                  break L14;
                                } else {
                                  stackOut_43_0 = (nf) ((Object) stackIn_43_0);
                                  stackOut_43_1 = 1;
                                  stackIn_45_0 = stackOut_43_0;
                                  stackIn_45_1 = stackOut_43_1;
                                  break L14;
                                }
                              }
                              stackIn_45_0.field_rb = stackIn_45_1 != 0;
                              var6++;
                              continue L9;
                            }
                          }
                        }
                        L15: {
                          if (stackIn_47_0 == 0) {
                            break L15;
                          } else {
                            L16: {
                              if (!vu.b(false)) {
                                break L16;
                              } else {
                                ad.field_I = ra.field_f;
                                if (var26 == 0) {
                                  break L15;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ad.field_I = fo.a(4800, op.field_a, new String[]{vu.field_M.field_rc});
                            break L15;
                          }
                        }
                        if ((lm.field_e.length ^ -1) <= -3) {
                          L17: {
                            if (param1) {
                              if (-1 != bp.field_c) {
                                stackOut_58_0 = 1;
                                stackIn_60_0 = stackOut_58_0;
                                break L17;
                              } else {
                                stackOut_57_0 = 0;
                                stackIn_60_0 = stackOut_57_0;
                                break L17;
                              }
                            } else {
                              stackOut_55_0 = 0;
                              stackIn_60_0 = stackOut_55_0;
                              break L17;
                            }
                          }
                          var6 = stackIn_60_0;
                          if (var6 != 0) {
                            var7 = bp.field_c;
                            var8_int = 0;
                            L18: while (true) {
                              if (var8_int >= ln.field_d.length) {
                                break L8;
                              } else {
                                ln.field_d[var8_int] = (byte) 0;
                                var8_int++;
                                if (var26 != 0) {
                                  break L7;
                                } else {
                                  if (var26 == 0) {
                                    continue L18;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          } else {
                            break L7;
                          }
                        } else {
                          break L6;
                        }
                      }
                    } else {
                      if ((lm.field_e.length ^ -1) <= -3) {
                        L19: {
                          if (param1) {
                            if (-1 != bp.field_c) {
                              stackOut_20_0 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              break L19;
                            } else {
                              stackOut_19_0 = 0;
                              stackIn_22_0 = stackOut_19_0;
                              break L19;
                            }
                          } else {
                            stackOut_17_0 = 0;
                            stackIn_22_0 = stackOut_17_0;
                            break L19;
                          }
                        }
                        var6 = stackIn_22_0;
                        if (var6 != 0) {
                          var7 = bp.field_c;
                          var8_int = 0;
                          L20: while (true) {
                            if (var8_int >= ln.field_d.length) {
                              break L8;
                            } else {
                              ln.field_d[var8_int] = (byte) 0;
                              var8_int++;
                              if (var26 != 0) {
                                break L7;
                              } else {
                                continue L20;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  ln.field_d[var7 / 8] = (byte)oe.c((int) ln.field_d[var7 / 8], 1 << var7 % 8);
                  break L7;
                }
                L21: {
                  if (param1) {
                    stackOut_70_0 = -1;
                    stackIn_71_0 = stackOut_70_0;
                    break L21;
                  } else {
                    stackOut_69_0 = 0;
                    stackIn_71_0 = stackOut_69_0;
                    break L21;
                  }
                }
                var7 = stackIn_71_0;
                L22: while (true) {
                  if (var7 >= lm.field_e.length) {
                    break L6;
                  } else {
                    stackOut_73_0 = var6;
                    stackIn_123_0 = stackOut_73_0;
                    stackIn_74_0 = stackOut_73_0;
                    if (var26 != 0) {
                      break L5;
                    } else {
                      L23: {
                        if (stackIn_74_0 != 0) {
                          if (bp.field_c != var7) {
                            stackOut_78_0 = 1;
                            stackIn_80_0 = stackOut_78_0;
                            break L23;
                          } else {
                            stackOut_77_0 = 0;
                            stackIn_80_0 = stackOut_77_0;
                            break L23;
                          }
                        } else {
                          stackOut_75_0 = 0;
                          stackIn_80_0 = stackOut_75_0;
                          break L23;
                        }
                      }
                      L24: {
                        var8_int = stackIn_80_0;
                        if (var4_int == 0) {
                          break L24;
                        } else {
                          if (0 != pu.field_k[1][var7 - -1].field_yb) {
                            L25: {
                              if (!param1) {
                                break L25;
                              } else {
                                if (var6 == 0) {
                                  L26: {
                                    if (0 != (var7 ^ -1)) {
                                      break L26;
                                    } else {
                                      var9 = 0;
                                      L27: while (true) {
                                        L28: {
                                          if (var9 >= ln.field_d.length) {
                                            break L28;
                                          } else {
                                            ln.field_d[var9] = (byte) 0;
                                            var9++;
                                            if (var26 != 0) {
                                              break L24;
                                            } else {
                                              if (var26 == 0) {
                                                continue L27;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        if (var26 == 0) {
                                          break L24;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                  }
                                  ln.field_d[var7 / 8] = (byte)kf.b((int) ln.field_d[var7 / 8], 1 << rn.a(var7, 7));
                                  if (var26 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                } else {
                                  break L24;
                                }
                              }
                            }
                            var9 = lm.field_e[var7];
                            if (var9 != param3.field_nc) {
                              param3.field_nc = var9;
                              var5 = 1;
                              break L24;
                            } else {
                              break L24;
                            }
                          } else {
                            break L24;
                          }
                        }
                      }
                      L29: {
                        L30: {
                          L31: {
                            if (!param1) {
                              break L31;
                            } else {
                              L32: {
                                if (var7 == -1) {
                                  break L32;
                                } else {
                                  L33: {
                                    stackOut_100_0 = pu.field_k[1][var7 - -1];
                                    stackIn_102_0 = stackOut_100_0;
                                    stackIn_101_0 = stackOut_100_0;
                                    if ((ln.field_d[var7 / 8] & 1 << (var7 & 7)) == 0) {
                                      stackOut_102_0 = (nf) ((Object) stackIn_102_0);
                                      stackOut_102_1 = 0;
                                      stackIn_103_0 = stackOut_102_0;
                                      stackIn_103_1 = stackOut_102_1;
                                      break L33;
                                    } else {
                                      stackOut_101_0 = (nf) ((Object) stackIn_101_0);
                                      stackOut_101_1 = 1;
                                      stackIn_103_0 = stackOut_101_0;
                                      stackIn_103_1 = stackOut_101_1;
                                      break L33;
                                    }
                                  }
                                  stackIn_103_0.field_rb = stackIn_103_1 != 0;
                                  if (var26 == 0) {
                                    break L29;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              pu.field_k[1][1 + var7].field_rb = true;
                              var9 = 0;
                              L34: while (true) {
                                L35: {
                                  if (var9 >= lm.field_e.length) {
                                    break L35;
                                  } else {
                                    stackOut_106_0 = pu.field_k[1][var7 - -1];
                                    stackOut_106_1 = pu.field_k[1][var7 - -1].field_rb;
                                    stackOut_106_2 = 0;
                                    stackOut_106_3 = ln.field_d[var9 / 8] & 1 << (7 & var9);
                                    stackIn_113_0 = stackOut_106_0;
                                    stackIn_113_1 = stackOut_106_1 ? 1 : 0;
                                    stackIn_113_2 = stackOut_106_2;
                                    stackIn_113_3 = stackOut_106_3;
                                    stackIn_107_0 = stackOut_106_0;
                                    stackIn_107_1 = stackOut_106_1;
                                    stackIn_107_2 = stackOut_106_2;
                                    stackIn_107_3 = stackOut_106_3;
                                    if (var26 != 0) {
                                      break L30;
                                    } else {
                                      L36: {
                                        stackOut_107_0 = (nf) ((Object) stackIn_107_0);
                                        stackOut_107_1 = stackIn_107_1;
                                        stackIn_109_0 = stackOut_107_0;
                                        stackIn_109_1 = stackOut_107_1;
                                        stackIn_108_0 = stackOut_107_0;
                                        stackIn_108_1 = stackOut_107_1;
                                        if (stackIn_107_2 != stackIn_107_3) {
                                          stackOut_109_0 = (nf) ((Object) stackIn_109_0);
                                          stackOut_109_1 = stackIn_109_1;
                                          stackOut_109_2 = 0;
                                          stackIn_110_0 = stackOut_109_0;
                                          stackIn_110_1 = stackOut_109_1;
                                          stackIn_110_2 = stackOut_109_2;
                                          break L36;
                                        } else {
                                          stackOut_108_0 = (nf) ((Object) stackIn_108_0);
                                          stackOut_108_1 = stackIn_108_1;
                                          stackOut_108_2 = 1;
                                          stackIn_110_0 = stackOut_108_0;
                                          stackIn_110_1 = stackOut_108_1;
                                          stackIn_110_2 = stackOut_108_2;
                                          break L36;
                                        }
                                      }
                                      stackIn_110_0.field_rb = stackIn_110_1 & stackIn_110_2 != 0;
                                      var9++;
                                      if (var26 == 0) {
                                        continue L34;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                }
                                if (var26 == 0) {
                                  break L29;
                                } else {
                                  break L31;
                                }
                              }
                            }
                          }
                          var9 = lm.field_e[var7];
                          stackOut_112_0 = pu.field_k[1][var7 - -1];
                          stackOut_112_1 = var9 ^ -1;
                          stackOut_112_2 = param3.field_nc;
                          stackOut_112_3 = -1;
                          stackIn_113_0 = stackOut_112_0;
                          stackIn_113_1 = stackOut_112_1;
                          stackIn_113_2 = stackOut_112_2;
                          stackIn_113_3 = stackOut_112_3;
                          break L30;
                        }
                        L37: {
                          stackOut_113_0 = (nf) ((Object) stackIn_113_0);
                          stackIn_115_0 = stackOut_113_0;
                          stackIn_114_0 = stackOut_113_0;
                          if (stackIn_113_1 != (stackIn_113_2 ^ stackIn_113_3)) {
                            stackOut_115_0 = (nf) ((Object) stackIn_115_0);
                            stackOut_115_1 = 0;
                            stackIn_116_0 = stackOut_115_0;
                            stackIn_116_1 = stackOut_115_1;
                            break L37;
                          } else {
                            stackOut_114_0 = (nf) ((Object) stackIn_114_0);
                            stackOut_114_1 = 1;
                            stackIn_116_0 = stackOut_114_0;
                            stackIn_116_1 = stackOut_114_1;
                            break L37;
                          }
                        }
                        stackIn_116_0.field_rb = stackIn_116_1 != 0;
                        break L29;
                      }
                      L38: {
                        L39: {
                          stackOut_117_0 = pu.field_k[1][var7 - -1];
                          stackIn_120_0 = stackOut_117_0;
                          stackIn_118_0 = stackOut_117_0;
                          if (var4_int == 0) {
                            break L39;
                          } else {
                            stackOut_118_0 = (nf) ((Object) stackIn_118_0);
                            stackIn_120_0 = stackOut_118_0;
                            stackIn_119_0 = stackOut_118_0;
                            if (var8_int != 0) {
                              break L39;
                            } else {
                              stackOut_119_0 = (nf) ((Object) stackIn_119_0);
                              stackOut_119_1 = 1;
                              stackIn_121_0 = stackOut_119_0;
                              stackIn_121_1 = stackOut_119_1;
                              break L38;
                            }
                          }
                        }
                        stackOut_120_0 = (nf) ((Object) stackIn_120_0);
                        stackOut_120_1 = 0;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        break L38;
                      }
                      stackIn_121_0.field_xb = stackIn_121_1 != 0;
                      var7++;
                      if (var26 == 0) {
                        continue L22;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
              }
              stackOut_122_0 = param1;
              stackIn_123_0 = stackOut_122_0 ? 1 : 0;
              break L5;
            }
            L40: {
              if (stackIn_123_0 == 0) {
                stackOut_125_0 = 1;
                stackIn_126_0 = stackOut_125_0;
                break L40;
              } else {
                stackOut_124_0 = 0;
                stackIn_126_0 = stackOut_124_0;
                break L40;
              }
            }
            var6 = stackIn_126_0;
            L41: while (true) {
              L42: {
                L43: {
                  if (-4 >= (var6 ^ -1)) {
                    break L43;
                  } else {
                    var28 = pu.field_k[2][var6];
                    stackOut_128_0 = var4_int;
                    stackIn_158_0 = stackOut_128_0;
                    stackIn_129_0 = stackOut_128_0;
                    if (var26 != 0) {
                      break L42;
                    } else {
                      L44: {
                        if (stackIn_129_0 == 0) {
                          break L44;
                        } else {
                          if (-1 == (var28.field_yb ^ -1)) {
                            break L44;
                          } else {
                            L45: {
                              if (param1) {
                                break L45;
                              } else {
                                if (var6 != param3.field_ac) {
                                  param3.field_ac = var6;
                                  var5 = 1;
                                  if (var26 == 0) {
                                    break L44;
                                  } else {
                                    break L45;
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                            L46: {
                              if (var6 == 0) {
                                break L46;
                              } else {
                                sm.field_b = sm.field_b ^ var6;
                                if (var26 == 0) {
                                  break L44;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            sm.field_b = 0;
                            break L44;
                          }
                        }
                      }
                      L47: {
                        stackOut_139_0 = (nf) (var28);
                        stackIn_141_0 = stackOut_139_0;
                        stackIn_140_0 = stackOut_139_0;
                        if (var4_int == 0) {
                          stackOut_141_0 = (nf) ((Object) stackIn_141_0);
                          stackOut_141_1 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          stackIn_142_1 = stackOut_141_1;
                          break L47;
                        } else {
                          stackOut_140_0 = (nf) ((Object) stackIn_140_0);
                          stackOut_140_1 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          stackIn_142_1 = stackOut_140_1;
                          break L47;
                        }
                      }
                      L48: {
                        L49: {
                          stackIn_142_0.field_xb = stackIn_142_1 != 0;
                          if (!param1) {
                            break L49;
                          } else {
                            L50: {
                              if (-1 != (var6 ^ -1)) {
                                break L50;
                              } else {
                                L51: {
                                  stackOut_144_0 = (nf) (var28);
                                  stackIn_146_0 = stackOut_144_0;
                                  stackIn_145_0 = stackOut_144_0;
                                  if (-1 != (sm.field_b ^ -1)) {
                                    stackOut_146_0 = (nf) ((Object) stackIn_146_0);
                                    stackOut_146_1 = 0;
                                    stackIn_147_0 = stackOut_146_0;
                                    stackIn_147_1 = stackOut_146_1;
                                    break L51;
                                  } else {
                                    stackOut_145_0 = (nf) ((Object) stackIn_145_0);
                                    stackOut_145_1 = 1;
                                    stackIn_147_0 = stackOut_145_0;
                                    stackIn_147_1 = stackOut_145_1;
                                    break L51;
                                  }
                                }
                                stackIn_147_0.field_rb = stackIn_147_1 != 0;
                                if (var26 == 0) {
                                  break L48;
                                } else {
                                  break L50;
                                }
                              }
                            }
                            L52: {
                              stackOut_148_0 = (nf) (var28);
                              stackIn_150_0 = stackOut_148_0;
                              stackIn_149_0 = stackOut_148_0;
                              if (-1 == (var6 & sm.field_b ^ -1)) {
                                stackOut_150_0 = (nf) ((Object) stackIn_150_0);
                                stackOut_150_1 = 0;
                                stackIn_151_0 = stackOut_150_0;
                                stackIn_151_1 = stackOut_150_1;
                                break L52;
                              } else {
                                stackOut_149_0 = (nf) ((Object) stackIn_149_0);
                                stackOut_149_1 = 1;
                                stackIn_151_0 = stackOut_149_0;
                                stackIn_151_1 = stackOut_149_1;
                                break L52;
                              }
                            }
                            stackIn_151_0.field_rb = stackIn_151_1 != 0;
                            if (var26 == 0) {
                              break L48;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L53: {
                          stackOut_152_0 = (nf) (var28);
                          stackIn_154_0 = stackOut_152_0;
                          stackIn_153_0 = stackOut_152_0;
                          if ((var6 & param3.field_ac) == 0) {
                            stackOut_154_0 = (nf) ((Object) stackIn_154_0);
                            stackOut_154_1 = 0;
                            stackIn_155_0 = stackOut_154_0;
                            stackIn_155_1 = stackOut_154_1;
                            break L53;
                          } else {
                            stackOut_153_0 = (nf) ((Object) stackIn_153_0);
                            stackOut_153_1 = 1;
                            stackIn_155_0 = stackOut_153_0;
                            stackIn_155_1 = stackOut_153_1;
                            break L53;
                          }
                        }
                        stackIn_155_0.field_rb = stackIn_155_1 != 0;
                        break L48;
                      }
                      var6++;
                      if (var26 == 0) {
                        continue L41;
                      } else {
                        break L43;
                      }
                    }
                  }
                }
                stackOut_157_0 = param1;
                stackIn_158_0 = stackOut_157_0 ? 1 : 0;
                break L42;
              }
              L54: {
                L55: {
                  if (stackIn_158_0 == 0) {
                    break L55;
                  } else {
                    if (-2 <= (ei.field_h ^ -1)) {
                      break L55;
                    } else {
                      var6 = 0;
                      L56: while (true) {
                        if (1 + ei.field_h <= var6) {
                          break L55;
                        } else {
                          var29 = pu.field_k[3][var6];
                          stackOut_162_0 = var4_int;
                          stackIn_184_0 = stackOut_162_0;
                          stackIn_163_0 = stackOut_162_0;
                          if (var26 != 0) {
                            break L54;
                          } else {
                            L57: {
                              if (stackIn_163_0 == 0) {
                                break L57;
                              } else {
                                if (-1 != (var29.field_yb ^ -1)) {
                                  nh.field_E = var6;
                                  break L57;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            L58: {
                              if (!var29.field_jb) {
                                break L58;
                              } else {
                                if (0 < var6) {
                                  L59: {
                                    if (cj.field_j != null) {
                                      stackOut_172_0 = cj.field_j[var6 + -1];
                                      stackIn_173_0 = stackOut_172_0;
                                      break L59;
                                    } else {
                                      stackOut_171_0 = null;
                                      stackIn_173_0 = (String) ((Object) stackOut_171_0);
                                      break L59;
                                    }
                                  }
                                  var8_ref = stackIn_173_0;
                                  if (var8_ref != null) {
                                    ad.field_I = var8_ref;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                } else {
                                  break L58;
                                }
                              }
                            }
                            L60: {
                              stackOut_176_0 = (nf) (var29);
                              stackIn_178_0 = stackOut_176_0;
                              stackIn_177_0 = stackOut_176_0;
                              if (var6 != nh.field_E) {
                                stackOut_178_0 = (nf) ((Object) stackIn_178_0);
                                stackOut_178_1 = 0;
                                stackIn_179_0 = stackOut_178_0;
                                stackIn_179_1 = stackOut_178_1;
                                break L60;
                              } else {
                                stackOut_177_0 = (nf) ((Object) stackIn_177_0);
                                stackOut_177_1 = 1;
                                stackIn_179_0 = stackOut_177_0;
                                stackIn_179_1 = stackOut_177_1;
                                break L60;
                              }
                            }
                            L61: {
                              stackIn_179_0.field_rb = stackIn_179_1 != 0;
                              stackOut_179_0 = (nf) (var29);
                              stackIn_181_0 = stackOut_179_0;
                              stackIn_180_0 = stackOut_179_0;
                              if (var4_int == 0) {
                                stackOut_181_0 = (nf) ((Object) stackIn_181_0);
                                stackOut_181_1 = 0;
                                stackIn_182_0 = stackOut_181_0;
                                stackIn_182_1 = stackOut_181_1;
                                break L61;
                              } else {
                                stackOut_180_0 = (nf) ((Object) stackIn_180_0);
                                stackOut_180_1 = 1;
                                stackIn_182_0 = stackOut_180_0;
                                stackIn_182_1 = stackOut_180_1;
                                break L61;
                              }
                            }
                            stackIn_182_0.field_xb = stackIn_182_1 != 0;
                            var6++;
                            if (var26 == 0) {
                              continue L56;
                            } else {
                              break L55;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                stackOut_183_0 = param0;
                stackIn_184_0 = stackOut_183_0;
                break L54;
              }
              L62: {
                if (stackIn_184_0 == 1) {
                  break L62;
                } else {
                  field_e = (String) null;
                  break L62;
                }
              }
              var7 = 0;
              L63: while (true) {
                L64: {
                  L65: {
                    if (tq.field_b <= var7) {
                      break L65;
                    } else {
                      var27 = pu.field_k[var7 + 4];
                      var8 = pu.field_k[var7 + 4];
                      stackOut_188_0 = param1;
                      stackIn_383_0 = stackOut_188_0 ? 1 : 0;
                      stackIn_189_0 = stackOut_188_0;
                      if (var26 != 0) {
                        break L64;
                      } else {
                        L66: {
                          if (stackIn_189_0) {
                            stackOut_191_0 = -1;
                            stackIn_192_0 = stackOut_191_0;
                            break L66;
                          } else {
                            stackOut_190_0 = 0;
                            stackIn_192_0 = stackOut_190_0;
                            break L66;
                          }
                        }
                        var9 = stackIn_192_0;
                        L67: while (true) {
                          L68: {
                            L69: {
                              if (var9 >= -1 + var27.length) {
                                break L69;
                              } else {
                                var10 = 0;
                                var11 = 0;
                                var12 = 0;
                                var13 = 0;
                                var14 = 0;
                                var15 = 0;
                                stackOut_194_0 = var4_int;
                                stackIn_381_0 = stackOut_194_0;
                                stackIn_195_0 = stackOut_194_0;
                                if (var26 != 0) {
                                  break L68;
                                } else {
                                  L70: {
                                    if (stackIn_195_0 == 0) {
                                      break L70;
                                    } else {
                                      if (-1 >= (var9 ^ -1)) {
                                        L71: {
                                          if (sk.field_j == null) {
                                            break L71;
                                          } else {
                                            if (sk.field_j[var7] == null) {
                                              break L71;
                                            } else {
                                              if (((ei.field_a ^ -1) & sk.field_j[var7][var9]) > 0) {
                                                var14 = 1;
                                                var15 = fd.a(true, sk.field_j[var7][var9] & (ei.field_a ^ -1));
                                                break L71;
                                              } else {
                                                break L71;
                                              }
                                            }
                                          }
                                        }
                                        L72: {
                                          if (ep.field_p == null) {
                                            break L72;
                                          } else {
                                            if (null == ep.field_p[var7]) {
                                              break L72;
                                            } else {
                                              if (-1 > (df.field_M ^ -1)) {
                                                break L72;
                                              } else {
                                                if (ep.field_p[var7][var9]) {
                                                  var10 = 1;
                                                  break L72;
                                                } else {
                                                  break L72;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L73: {
                                          if (null == iv.field_e) {
                                            break L73;
                                          } else {
                                            if (null == iv.field_e[var7]) {
                                              break L73;
                                            } else {
                                              L74: {
                                                var16 = iv.field_e[var7][var9];
                                                if (0 == var16) {
                                                  break L74;
                                                } else {
                                                  if (bj.field_k) {
                                                    break L74;
                                                  } else {
                                                    if (df.field_M <= 0) {
                                                      var10 = 1;
                                                      break L74;
                                                    } else {
                                                      break L74;
                                                    }
                                                  }
                                                }
                                              }
                                              if (0 >= var16) {
                                                break L73;
                                              } else {
                                                if (al.field_g >= var16) {
                                                  break L73;
                                                } else {
                                                  var12 = 1;
                                                  break L73;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L75: {
                                          if (null == jv.field_d) {
                                            break L75;
                                          } else {
                                            if (jv.field_d[var7] != null) {
                                              L76: {
                                                var16 = jv.field_d[var7][var9];
                                                if (0 >= var16) {
                                                  break L76;
                                                } else {
                                                  if (var16 <= be.field_s) {
                                                    break L76;
                                                  } else {
                                                    var11 = 1;
                                                    break L76;
                                                  }
                                                }
                                              }
                                              if (var16 == 0) {
                                                break L75;
                                              } else {
                                                if (bj.field_k) {
                                                  break L75;
                                                } else {
                                                  if (df.field_M <= 0) {
                                                    var10 = 1;
                                                    break L75;
                                                  } else {
                                                    break L75;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L75;
                                            }
                                          }
                                        }
                                        L77: {
                                          if (param1) {
                                            if (ke.field_b != null) {
                                              if (null != ke.field_b[var7]) {
                                                if (ke.field_b[var7][var9]) {
                                                  stackOut_238_0 = 1;
                                                  stackIn_240_0 = stackOut_238_0;
                                                  break L77;
                                                } else {
                                                  stackOut_237_0 = 0;
                                                  stackIn_240_0 = stackOut_237_0;
                                                  break L77;
                                                }
                                              } else {
                                                stackOut_235_0 = 0;
                                                stackIn_240_0 = stackOut_235_0;
                                                break L77;
                                              }
                                            } else {
                                              stackOut_233_0 = 0;
                                              stackIn_240_0 = stackOut_233_0;
                                              break L77;
                                            }
                                          } else {
                                            stackOut_231_0 = 0;
                                            stackIn_240_0 = stackOut_231_0;
                                            break L77;
                                          }
                                        }
                                        var13 = stackIn_240_0;
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                  }
                                  L78: {
                                    if (-3 < (hi.field_j ^ -1)) {
                                      break L78;
                                    } else {
                                      if (br.field_f[12]) {
                                        var11 = 0;
                                        var12 = 0;
                                        var10 = 0;
                                        var13 = 0;
                                        var14 = 0;
                                        break L78;
                                      } else {
                                        break L78;
                                      }
                                    }
                                  }
                                  L79: {
                                    L80: {
                                      fc.field_a = true;
                                      if (var10 != 0) {
                                        break L80;
                                      } else {
                                        if (var11 != 0) {
                                          break L80;
                                        } else {
                                          if (var12 != 0) {
                                            break L80;
                                          } else {
                                            if (var13 != 0) {
                                              break L80;
                                            } else {
                                              if (var14 == 0) {
                                                stackOut_252_0 = 0;
                                                stackIn_253_0 = stackOut_252_0;
                                                break L79;
                                              } else {
                                                break L80;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_251_0 = 1;
                                    stackIn_253_0 = stackOut_251_0;
                                    break L79;
                                  }
                                  L81: {
                                    var16 = stackIn_253_0;
                                    if (var16 != 0) {
                                      break L81;
                                    } else {
                                      if (0 > var9) {
                                        break L81;
                                      } else {
                                        if (null == fs.field_d) {
                                          break L81;
                                        } else {
                                          L82: {
                                            if (!param1) {
                                              break L82;
                                            } else {
                                              if (!ua.field_s) {
                                                break L82;
                                              } else {
                                                break L81;
                                              }
                                            }
                                          }
                                          L83: {
                                            jp.field_a = false;
                                            fc.field_a = false;
                                            if (null != ur.field_B) {
                                              break L83;
                                            } else {
                                              ur.field_B = new byte[tq.field_b];
                                              dt.field_d = new boolean[tq.field_b];
                                              break L83;
                                            }
                                          }
                                          var17_int = 0;
                                          L84: while (true) {
                                            L85: {
                                              if (var17_int >= var7) {
                                                es.a(0, var7, param3, -1, param1, var9, (byte) 103, -1);
                                                break L85;
                                              } else {
                                                dt.field_d[var17_int] = false;
                                                var17_int++;
                                                if (var26 != 0) {
                                                  break L85;
                                                } else {
                                                  continue L84;
                                                }
                                              }
                                            }
                                            L86: {
                                              if (-3 < (hi.field_j ^ -1)) {
                                                break L86;
                                              } else {
                                                if (!br.field_f[12]) {
                                                  break L86;
                                                } else {
                                                  fc.field_a = true;
                                                  break L86;
                                                }
                                              }
                                            }
                                            if (fc.field_a) {
                                              break L81;
                                            } else {
                                              var16 = 1;
                                              break L81;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L87: {
                                    var17 = var27[var9 + 1];
                                    if (var4_int == 0) {
                                      break L87;
                                    } else {
                                      if (var17.field_yb == 0) {
                                        break L87;
                                      } else {
                                        L88: {
                                          if (!param1) {
                                            break L88;
                                          } else {
                                            L89: {
                                              if (0 == (var9 ^ -1)) {
                                                break L89;
                                              } else {
                                                tg.field_d[(var6 + var9) / 8] = (byte)kf.b((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7));
                                                if (var26 == 0) {
                                                  break L87;
                                                } else {
                                                  break L89;
                                                }
                                              }
                                            }
                                            var18 = var6;
                                            L90: while (true) {
                                              L91: {
                                                if (var18 >= var27.length + var6 + -1) {
                                                  break L91;
                                                } else {
                                                  tg.field_d[var18 / 8] = (byte)rn.a((int) tg.field_d[var18 / 8], 1 << rn.a(7, var18) ^ -1);
                                                  var18++;
                                                  if (var26 != 0) {
                                                    break L87;
                                                  } else {
                                                    if (var26 == 0) {
                                                      continue L90;
                                                    } else {
                                                      break L91;
                                                    }
                                                  }
                                                }
                                              }
                                              if (var26 == 0) {
                                                break L87;
                                              } else {
                                                break L88;
                                              }
                                            }
                                          }
                                        }
                                        if (var16 != 0) {
                                          break L87;
                                        } else {
                                          if (param3.field_pc[var7] != (byte)var9) {
                                            var5 = 1;
                                            param3.field_pc[var7] = (byte)var9;
                                            break L87;
                                          } else {
                                            break L87;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L92: {
                                    if (!param1) {
                                      break L92;
                                    } else {
                                      if (var16 == 0) {
                                        break L92;
                                      } else {
                                        tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7) ^ -1);
                                        break L92;
                                      }
                                    }
                                  }
                                  L93: {
                                    if (-1 < (var9 ^ -1)) {
                                      break L93;
                                    } else {
                                      if (!var17.field_jb) {
                                        break L93;
                                      } else {
                                        L94: {
                                          if (ll.field_Mb == null) {
                                            var18_ref = null;
                                            break L94;
                                          } else {
                                            if (ll.field_Mb[var7] == null) {
                                              var18_ref = null;
                                              break L94;
                                            } else {
                                              var18_ref = ll.field_Mb[var7][var9];
                                              break L94;
                                            }
                                          }
                                        }
                                        L95: {
                                          if (wb.field_a == null) {
                                            var19 = null;
                                            break L95;
                                          } else {
                                            if (null == wb.field_a[var7]) {
                                              var19 = null;
                                              break L95;
                                            } else {
                                              var19 = wb.field_a[var7][var9];
                                              break L95;
                                            }
                                          }
                                        }
                                        L96: {
                                          var20 = null;
                                          if (var19 == null) {
                                            break L96;
                                          } else {
                                            if (!((String) (var19)).equals(var18_ref)) {
                                              var20 = var19;
                                              break L96;
                                            } else {
                                              break L96;
                                            }
                                          }
                                        }
                                        L97: {
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
                                            break L97;
                                          } else {
                                            if (var10 != 0) {
                                              var21 = gt.field_a;
                                              break L97;
                                            } else {
                                              L98: {
                                                if (var11 == 0) {
                                                  break L98;
                                                } else {
                                                  var22_int = jv.field_d[var7][var9] - be.field_s;
                                                  if (var22_int != 1) {
                                                    var21 = fo.a(4800, mg.field_a, new String[]{Integer.toString(var22_int)});
                                                    break L98;
                                                  } else {
                                                    var21 = bt.field_a;
                                                    break L98;
                                                  }
                                                }
                                              }
                                              L99: {
                                                if (var12 != 0) {
                                                  L100: {
                                                    var30 = fo.a(4800, qb.field_k, new String[]{Integer.toString(al.field_g), Integer.toString(iv.field_e[var7][var9])});
                                                    var22_ref = var30;
                                                    var25_ref = var22_ref;
                                                    var22_ref = var25_ref;
                                                    var21 = var22_ref;
                                                    var25_ref = var30;
                                                    var22_ref = var25_ref;
                                                    if (var21 == null) {
                                                      break L100;
                                                    } else {
                                                      var21 = (String) (var21) + "<br>" + var30;
                                                      if (var26 == 0) {
                                                        break L99;
                                                      } else {
                                                        break L100;
                                                      }
                                                    }
                                                  }
                                                  var21 = var30;
                                                  break L99;
                                                } else {
                                                  break L99;
                                                }
                                              }
                                              if (var14 != 0) {
                                                L101: {
                                                  var22_ref = md.field_F;
                                                  if (-1 <= (var15 ^ -1)) {
                                                    break L101;
                                                  } else {
                                                    if (jl.field_c == null) {
                                                      break L101;
                                                    } else {
                                                      if (var15 > jl.field_c.length) {
                                                        break L101;
                                                      } else {
                                                        if (null != jl.field_c[var15 - 1]) {
                                                          var22_ref = jl.field_c[var15 - 1][0];
                                                          break L101;
                                                        } else {
                                                          break L101;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L102: {
                                                  if (var21 != null) {
                                                    break L102;
                                                  } else {
                                                    var21 = var22_ref;
                                                    if (var26 == 0) {
                                                      break L97;
                                                    } else {
                                                      break L102;
                                                    }
                                                  }
                                                }
                                                var21 = (String) (var21) + "<br>" + var22_ref;
                                                break L97;
                                              } else {
                                                break L97;
                                              }
                                            }
                                          }
                                        }
                                        L103: {
                                          if (var4_int == 0) {
                                            break L103;
                                          } else {
                                            if (fc.field_a) {
                                              break L103;
                                            } else {
                                              L104: {
                                                var22_ref = null;
                                                if (jp.field_a) {
                                                  var22_ref = "</col>" + ep.field_h + "<col=A00000>";
                                                  var25_ref = var22_ref;
                                                  var22_ref = var25_ref;
                                                  var25_ref = var22_ref;
                                                  var22_ref = var25_ref;
                                                  var21 = var22_ref;
                                                  break L104;
                                                } else {
                                                  break L104;
                                                }
                                              }
                                              var23 = 0;
                                              var24 = 0;
                                              L105: while (true) {
                                                L106: {
                                                  if (var24 >= var7) {
                                                    stackOut_345_0 = var23;
                                                    stackIn_346_0 = stackOut_345_0;
                                                    break L106;
                                                  } else {
                                                    stackOut_338_0 = dt.field_d[var24];
                                                    stackIn_346_0 = stackOut_338_0 ? 1 : 0;
                                                    stackIn_339_0 = stackOut_338_0;
                                                    if (var26 != 0) {
                                                      break L106;
                                                    } else {
                                                      L107: {
                                                        if (stackIn_339_0) {
                                                          L108: {
                                                            var25_ref = "</col>" + ob.field_M[var24] + "<col=A00000>";
                                                            var22_ref = var25_ref;
                                                            var22_ref = var25_ref;
                                                            if (var22_ref != null) {
                                                              break L108;
                                                            } else {
                                                              var22_ref = var25_ref;
                                                              if (var26 == 0) {
                                                                break L107;
                                                              } else {
                                                                break L108;
                                                              }
                                                            }
                                                          }
                                                          var22_ref = var22_ref + ", " + var25_ref;
                                                          var21 = var22_ref;
                                                          var21 = var22_ref;
                                                          var23 = 1;
                                                          break L107;
                                                        } else {
                                                          break L107;
                                                        }
                                                      }
                                                      var24++;
                                                      continue L105;
                                                    }
                                                  }
                                                }
                                                L109: {
                                                  if (stackIn_346_0 == 0) {
                                                    break L109;
                                                  } else {
                                                    var21 = mj.field_a + var22_ref;
                                                    if (var26 == 0) {
                                                      break L103;
                                                    } else {
                                                      break L109;
                                                    }
                                                  }
                                                }
                                                var21 = fo.a(4800, ab.field_e, new String[]{var22_ref});
                                                break L103;
                                              }
                                            }
                                          }
                                        }
                                        L110: {
                                          if (var21 == null) {
                                            break L110;
                                          } else {
                                            L111: {
                                              var21 = "<col=A00000>" + (String) (var21);
                                              var20 = var21;
                                              var20 = var21;
                                              var31 = dj.a(6609, (String) (var21), "<br>", "<br><col=A00000>");
                                              var20 = var31;
                                              var20 = var31;
                                              if (var20 != null) {
                                                break L111;
                                              } else {
                                                var20 = var31;
                                                if (var26 == 0) {
                                                  break L110;
                                                } else {
                                                  break L111;
                                                }
                                              }
                                            }
                                            var20 = (String) (var20) + "<br>" + var31;
                                            break L110;
                                          }
                                        }
                                        if (var20 == null) {
                                          break L93;
                                        } else {
                                          ad.field_I = (String) (var20);
                                          break L93;
                                        }
                                      }
                                    }
                                  }
                                  L112: {
                                    L113: {
                                      if (param1) {
                                        break L113;
                                      } else {
                                        L114: {
                                          L115: {
                                            stackOut_356_0 = (nf) (var17);
                                            stackIn_359_0 = stackOut_356_0;
                                            stackIn_357_0 = stackOut_356_0;
                                            if (!fc.field_a) {
                                              break L115;
                                            } else {
                                              stackOut_357_0 = (nf) ((Object) stackIn_357_0);
                                              stackIn_359_0 = stackOut_357_0;
                                              stackIn_358_0 = stackOut_357_0;
                                              if ((byte)var9 != param3.field_pc[var7]) {
                                                break L115;
                                              } else {
                                                stackOut_358_0 = (nf) ((Object) stackIn_358_0);
                                                stackOut_358_1 = 1;
                                                stackIn_360_0 = stackOut_358_0;
                                                stackIn_360_1 = stackOut_358_1;
                                                break L114;
                                              }
                                            }
                                          }
                                          stackOut_359_0 = (nf) ((Object) stackIn_359_0);
                                          stackOut_359_1 = 0;
                                          stackIn_360_0 = stackOut_359_0;
                                          stackIn_360_1 = stackOut_359_1;
                                          break L114;
                                        }
                                        stackIn_360_0.field_rb = stackIn_360_1 != 0;
                                        if (var26 == 0) {
                                          break L112;
                                        } else {
                                          break L113;
                                        }
                                      }
                                    }
                                    L116: {
                                      L117: {
                                        if (var9 != -1) {
                                          break L117;
                                        } else {
                                          var17.field_rb = true;
                                          var18 = var6;
                                          L118: while (true) {
                                            L119: {
                                              if (var27.length + var6 + -1 <= var18) {
                                                break L119;
                                              } else {
                                                stackOut_364_0 = (nf) (var17);
                                                stackOut_364_1 = var17.field_rb;
                                                stackOut_364_2 = -1;
                                                stackOut_364_3 = tg.field_d[var18 / 8] & 1 << (var18 & 7) ^ -1;
                                                stackIn_371_0 = stackOut_364_0;
                                                stackIn_371_1 = stackOut_364_1 ? 1 : 0;
                                                stackIn_371_2 = stackOut_364_2;
                                                stackIn_371_3 = stackOut_364_3;
                                                stackIn_365_0 = stackOut_364_0;
                                                stackIn_365_1 = stackOut_364_1;
                                                stackIn_365_2 = stackOut_364_2;
                                                stackIn_365_3 = stackOut_364_3;
                                                if (var26 != 0) {
                                                  break L116;
                                                } else {
                                                  L120: {
                                                    stackOut_365_0 = (nf) ((Object) stackIn_365_0);
                                                    stackOut_365_1 = stackIn_365_1;
                                                    stackIn_367_0 = stackOut_365_0;
                                                    stackIn_367_1 = stackOut_365_1;
                                                    stackIn_366_0 = stackOut_365_0;
                                                    stackIn_366_1 = stackOut_365_1;
                                                    if (stackIn_365_2 != stackIn_365_3) {
                                                      stackOut_367_0 = (nf) ((Object) stackIn_367_0);
                                                      stackOut_367_1 = stackIn_367_1;
                                                      stackOut_367_2 = 0;
                                                      stackIn_368_0 = stackOut_367_0;
                                                      stackIn_368_1 = stackOut_367_1;
                                                      stackIn_368_2 = stackOut_367_2;
                                                      break L120;
                                                    } else {
                                                      stackOut_366_0 = (nf) ((Object) stackIn_366_0);
                                                      stackOut_366_1 = stackIn_366_1;
                                                      stackOut_366_2 = 1;
                                                      stackIn_368_0 = stackOut_366_0;
                                                      stackIn_368_1 = stackOut_366_1;
                                                      stackIn_368_2 = stackOut_366_2;
                                                      break L120;
                                                    }
                                                  }
                                                  stackIn_368_0.field_rb = stackIn_368_1 & stackIn_368_2 != 0;
                                                  var18++;
                                                  if (var26 == 0) {
                                                    continue L118;
                                                  } else {
                                                    break L119;
                                                  }
                                                }
                                              }
                                            }
                                            if (var26 == 0) {
                                              break L112;
                                            } else {
                                              break L117;
                                            }
                                          }
                                        }
                                      }
                                      stackOut_370_0 = (nf) (var17);
                                      stackOut_370_1 = -1;
                                      stackOut_370_2 = tg.field_d[(var9 + var6) / 8] & 1 << (var9 + var6 & 7);
                                      stackOut_370_3 = -1;
                                      stackIn_371_0 = stackOut_370_0;
                                      stackIn_371_1 = stackOut_370_1;
                                      stackIn_371_2 = stackOut_370_2;
                                      stackIn_371_3 = stackOut_370_3;
                                      break L116;
                                    }
                                    L121: {
                                      stackOut_371_0 = (nf) ((Object) stackIn_371_0);
                                      stackIn_373_0 = stackOut_371_0;
                                      stackIn_372_0 = stackOut_371_0;
                                      if (stackIn_371_1 == (stackIn_371_2 ^ stackIn_371_3)) {
                                        stackOut_373_0 = (nf) ((Object) stackIn_373_0);
                                        stackOut_373_1 = 0;
                                        stackIn_374_0 = stackOut_373_0;
                                        stackIn_374_1 = stackOut_373_1;
                                        break L121;
                                      } else {
                                        stackOut_372_0 = (nf) ((Object) stackIn_372_0);
                                        stackOut_372_1 = 1;
                                        stackIn_374_0 = stackOut_372_0;
                                        stackIn_374_1 = stackOut_372_1;
                                        break L121;
                                      }
                                    }
                                    stackIn_374_0.field_rb = stackIn_374_1 != 0;
                                    break L112;
                                  }
                                  L122: {
                                    L123: {
                                      stackOut_375_0 = (nf) (var17);
                                      stackIn_378_0 = stackOut_375_0;
                                      stackIn_376_0 = stackOut_375_0;
                                      if (var4_int == 0) {
                                        break L123;
                                      } else {
                                        stackOut_376_0 = (nf) ((Object) stackIn_376_0);
                                        stackIn_378_0 = stackOut_376_0;
                                        stackIn_377_0 = stackOut_376_0;
                                        if (var16 != 0) {
                                          break L123;
                                        } else {
                                          stackOut_377_0 = (nf) ((Object) stackIn_377_0);
                                          stackOut_377_1 = 1;
                                          stackIn_379_0 = stackOut_377_0;
                                          stackIn_379_1 = stackOut_377_1;
                                          break L122;
                                        }
                                      }
                                    }
                                    stackOut_378_0 = (nf) ((Object) stackIn_378_0);
                                    stackOut_378_1 = 0;
                                    stackIn_379_0 = stackOut_378_0;
                                    stackIn_379_1 = stackOut_378_1;
                                    break L122;
                                  }
                                  stackIn_379_0.field_xb = stackIn_379_1 != 0;
                                  var9++;
                                  if (var26 == 0) {
                                    continue L67;
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                            }
                            stackOut_380_0 = var6 + (255 & t.field_b[var7]);
                            stackIn_381_0 = stackOut_380_0;
                            break L68;
                          }
                          var6 = stackIn_381_0;
                          var7++;
                          if (var26 == 0) {
                            continue L63;
                          } else {
                            break L65;
                          }
                        }
                      }
                    }
                  }
                  stackOut_382_0 = var5;
                  stackIn_383_0 = stackOut_382_0;
                  break L64;
                }
                L124: {
                  if (stackIn_383_0 == 0) {
                    break L124;
                  } else {
                    if (!param1) {
                      cl.b(5, param2);
                      break L124;
                    } else {
                      break L124;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L125: {
            var4 = decompiledCaughtException;
            stackOut_388_0 = (RuntimeException) (var4);
            stackOut_388_1 = new StringBuilder().append("vf.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_390_0 = stackOut_388_0;
            stackIn_390_1 = stackOut_388_1;
            stackIn_389_0 = stackOut_388_0;
            stackIn_389_1 = stackOut_388_1;
            if (param3 == null) {
              stackOut_390_0 = (RuntimeException) ((Object) stackIn_390_0);
              stackOut_390_1 = (StringBuilder) ((Object) stackIn_390_1);
              stackOut_390_2 = "null";
              stackIn_391_0 = stackOut_390_0;
              stackIn_391_1 = stackOut_390_1;
              stackIn_391_2 = stackOut_390_2;
              break L125;
            } else {
              stackOut_389_0 = (RuntimeException) ((Object) stackIn_389_0);
              stackOut_389_1 = (StringBuilder) ((Object) stackIn_389_1);
              stackOut_389_2 = "{...}";
              stackIn_391_0 = stackOut_389_0;
              stackIn_391_1 = stackOut_389_1;
              stackIn_391_2 = stackOut_389_2;
              break L125;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_391_0), stackIn_391_2 + ')');
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
        int var22 = 0;
        int var23 = 0;
        int[] var25 = null;
        int[] var26 = null;
        int var27 = 0;
        int var28 = 0;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_8_0 = null;
        int stackIn_16_0 = 0;
        int[] stackOut_7_0 = null;
        int[] stackOut_4_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var28 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_l = (String) null;
            break L0;
          }
        }
        var31 = new int[param2];
        var29 = var31;
        var25 = var29;
        var27 = 0;
        L1: while (true) {
          L2: {
            if (var27 >= param2) {
              stackOut_7_0 = new int[param0];
              stackIn_8_0 = stackOut_7_0;
              break L2;
            } else {
              stackOut_4_0 = (int[]) (var25);
              stackIn_8_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var28 != 0) {
                break L2;
              } else {
                stackIn_5_0[var27] = (var27 << 69489804) / param2;
                var27++;
                continue L1;
              }
            }
          }
          var32 = stackIn_8_0;
          var30 = var32;
          var26 = var30;
          var27 = 0;
          L3: while (true) {
            L4: {
              if (var27 >= param0) {
                this.a(param1 ^ -30419);
                break L4;
              } else {
                var26[var27] = (var27 << -449439476) / param0;
                var27++;
                if (var28 != 0) {
                  break L4;
                } else {
                  continue L3;
                }
              }
            }
            var23 = 0;
            L5: while (true) {
              stackOut_15_0 = var23;
              stackIn_16_0 = stackOut_15_0;
              L6: while (true) {
                L7: {
                  if (stackIn_16_0 >= param0) {
                    break L7;
                  } else {
                    if (var28 != 0) {
                      break L7;
                    } else {
                      var22 = 0;
                      if (var22 >= param2) {
                        var23++;
                        if (var28 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      } else {
                        stackOut_19_0 = 0;
                        stackIn_16_0 = stackOut_19_0;
                        continue L6;
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final static ru a(int[] param0, int param1, ru param2) {
        ru var3 = null;
        RuntimeException var3_ref = null;
        ru stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ru stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
              if (param1 == -13546) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var3 = new ru(0, 0, 0);
            var3.field_j = param0;
            var3.field_d = param2.field_d;
            var3.field_e = param2.field_e;
            var3.field_k = param2.field_k;
            var3.field_i = param2.field_i;
            var3.field_f = param2.field_f;
            var3.field_h = param2.field_h;
            var3.field_g = param2.field_g;
            stackOut_2_0 = (ru) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("vf.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0);

    abstract void a(byte param0);

    vf(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = new short[512];
        this.field_d = 4;
        this.field_a = 4;
        this.field_b = 4;
        this.field_i = 0;
        this.field_a = param2;
        this.field_i = param0;
        this.field_b = param1;
        this.field_d = param3;
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
        if (param0 < co.field_h) {
            return -1;
        }
        if (co.field_h - -rs.field_o.field_y <= param0) {
            return -1;
        }
        if (ug.field_a > param2) {
            return -1;
        }
        if (!(rs.field_o.field_v + ug.field_a <= param2)) {
            return 1;
        }
        return -1;
    }

    private final void d(int param0) {
        Random var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Random var8 = null;
        L0: {
          var7 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -256) {
            break L0;
          } else {
            field_f = 9;
            break L0;
          }
        }
        var8 = new Random((long)this.field_i);
        var2 = var8;
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var3 ^ -1) <= -256) {
                break L3;
              } else {
                this.field_k[var3] = (short)var3;
                var3++;
                if (var7 != 0) {
                  break L2;
                } else {
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            var3 = 0;
            break L2;
          }
          L4: while (true) {
            L5: {
              if (-256 >= (var3 ^ -1)) {
                break L5;
              } else {
                var4 = 255 + -var3;
                var5 = ns.a(false, var4, var8);
                var6 = this.field_k[var5];
                this.field_k[var5] = this.field_k[var4];
                this.field_k[256 + var4] = (short) var6;
                this.field_k[var4] = (short) var6;
                var3++;
                if (var7 != 0) {
                  break L5;
                } else {
                  if (var7 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            return;
          }
        }
    }

    static {
        field_h = "Toxins";
        field_e = "You have entered another game.";
        field_f = -1;
        field_c = "(1 player wants to join)";
        field_l = "Add <%0> to friend list";
    }
}
