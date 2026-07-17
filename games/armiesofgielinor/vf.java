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
        int var3 = -49;
        while (var2 < ((vf) this).field_b) {
            ((vf) this).field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
            var2++;
        }
    }

    final static void a(int param0, boolean param1, int param2, au param3) {
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
        int var27 = 0;
        nf var28 = null;
        nf var29 = null;
        nf[] var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_17_0 = 0;
        nf stackIn_29_0 = null;
        nf stackIn_30_0 = null;
        nf stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        nf stackIn_35_0 = null;
        nf stackIn_36_0 = null;
        nf stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_63_0 = 0;
        nf stackIn_80_0 = null;
        nf stackIn_81_0 = null;
        nf stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        nf stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        nf stackIn_87_0 = null;
        boolean stackIn_87_1 = false;
        nf stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        int stackIn_88_2 = 0;
        nf stackIn_90_0 = null;
        nf stackIn_91_0 = null;
        nf stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        nf stackIn_94_0 = null;
        nf stackIn_95_0 = null;
        nf stackIn_96_0 = null;
        nf stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_101_0 = 0;
        nf stackIn_113_0 = null;
        nf stackIn_114_0 = null;
        nf stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        nf stackIn_118_0 = null;
        nf stackIn_119_0 = null;
        nf stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        nf stackIn_122_0 = null;
        nf stackIn_123_0 = null;
        nf stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        nf stackIn_126_0 = null;
        nf stackIn_127_0 = null;
        nf stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        String stackIn_144_0 = null;
        nf stackIn_148_0 = null;
        nf stackIn_149_0 = null;
        nf stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        nf stackIn_151_0 = null;
        nf stackIn_152_0 = null;
        nf stackIn_153_0 = null;
        int stackIn_153_1 = 0;
        int stackIn_161_0 = 0;
        int stackIn_204_0 = 0;
        int stackIn_217_0 = 0;
        nf stackIn_312_0 = null;
        nf stackIn_313_0 = null;
        nf stackIn_314_0 = null;
        nf stackIn_315_0 = null;
        int stackIn_315_1 = 0;
        nf stackIn_320_0 = null;
        boolean stackIn_320_1 = false;
        nf stackIn_321_0 = null;
        boolean stackIn_321_1 = false;
        nf stackIn_322_0 = null;
        boolean stackIn_322_1 = false;
        int stackIn_322_2 = 0;
        nf stackIn_324_0 = null;
        nf stackIn_325_0 = null;
        nf stackIn_326_0 = null;
        int stackIn_326_1 = 0;
        nf stackIn_328_0 = null;
        nf stackIn_329_0 = null;
        nf stackIn_330_0 = null;
        nf stackIn_331_0 = null;
        int stackIn_331_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_47_0 = 0;
        nf stackOut_28_0 = null;
        nf stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        nf stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        nf stackOut_34_0 = null;
        nf stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        nf stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        nf stackOut_89_0 = null;
        nf stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        nf stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        nf stackOut_85_0 = null;
        boolean stackOut_85_1 = false;
        nf stackOut_87_0 = null;
        boolean stackOut_87_1 = false;
        int stackOut_87_2 = 0;
        nf stackOut_86_0 = null;
        boolean stackOut_86_1 = false;
        int stackOut_86_2 = 0;
        nf stackOut_79_0 = null;
        nf stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        nf stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        nf stackOut_93_0 = null;
        nf stackOut_94_0 = null;
        nf stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        nf stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        String stackOut_143_0 = null;
        Object stackOut_142_0 = null;
        nf stackOut_147_0 = null;
        nf stackOut_149_0 = null;
        int stackOut_149_1 = 0;
        nf stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        nf stackOut_150_0 = null;
        nf stackOut_152_0 = null;
        int stackOut_152_1 = 0;
        nf stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        int stackOut_160_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_216_0 = 0;
        int stackOut_215_0 = 0;
        nf stackOut_323_0 = null;
        nf stackOut_325_0 = null;
        int stackOut_325_1 = 0;
        nf stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        nf stackOut_319_0 = null;
        boolean stackOut_319_1 = false;
        nf stackOut_321_0 = null;
        boolean stackOut_321_1 = false;
        int stackOut_321_2 = 0;
        nf stackOut_320_0 = null;
        boolean stackOut_320_1 = false;
        int stackOut_320_2 = 0;
        nf stackOut_311_0 = null;
        nf stackOut_312_0 = null;
        nf stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        nf stackOut_314_0 = null;
        int stackOut_314_1 = 0;
        nf stackOut_327_0 = null;
        nf stackOut_328_0 = null;
        nf stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        nf stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        nf stackOut_112_0 = null;
        nf stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        nf stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        nf stackOut_125_0 = null;
        nf stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        nf stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        nf stackOut_121_0 = null;
        nf stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        nf stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        nf stackOut_117_0 = null;
        nf stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        nf stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        L0: {
          var26 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1) {
            L1: {
              if (ua.field_s) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L1;
              }
            }
            var4_int = stackIn_9_0;
            break L0;
          } else {
            L2: {
              L3: {
                if (!vu.b(false)) {
                  break L3;
                } else {
                  if (param3.field_kc) {
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L2;
            }
            var4_int = stackIn_5_0;
            break L0;
          }
        }
        L4: {
          L5: {
            L6: {
              var5 = 0;
              if (!param1) {
                var6 = 0;
                L7: while (true) {
                  if (var6 >= 5) {
                    L8: {
                      if (!pu.field_k[0][2].field_jb) {
                        break L8;
                      } else {
                        if (!vu.b(false)) {
                          ad.field_I = fo.a(4800, op.field_a, new String[1]);
                          break L8;
                        } else {
                          ad.field_I = ra.field_f;
                          break L8;
                        }
                      }
                    }
                    if (lm.field_e.length >= 2) {
                      L9: {
                        L10: {
                          if (!param1) {
                            break L10;
                          } else {
                            if (-1 == bp.field_c) {
                              break L10;
                            } else {
                              stackOut_46_0 = 1;
                              stackIn_48_0 = stackOut_46_0;
                              break L9;
                            }
                          }
                        }
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L9;
                      }
                      var6 = stackIn_48_0;
                      if (var6 != 0) {
                        var7 = bp.field_c;
                        var8_int = 0;
                        L11: while (true) {
                          if (var8_int >= ln.field_d.length) {
                            break L6;
                          } else {
                            ln.field_d[var8_int] = (byte) 0;
                            var8_int++;
                            continue L11;
                          }
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L12: {
                      if (var4_int == 0) {
                        break L12;
                      } else {
                        if (pu.field_k[0][var6 - -1].field_yb == 0) {
                          break L12;
                        } else {
                          if (~var6 == ~param3.field_Tb) {
                            break L12;
                          } else {
                            var5 = 1;
                            param3.field_Tb = var6;
                            break L12;
                          }
                        }
                      }
                    }
                    L13: {
                      stackOut_28_0 = pu.field_k[0][1 + var6];
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var4_int == 0) {
                        stackOut_30_0 = (nf) (Object) stackIn_30_0;
                        stackOut_30_1 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L13;
                      } else {
                        stackOut_29_0 = (nf) (Object) stackIn_29_0;
                        stackOut_29_1 = 1;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L13;
                      }
                    }
                    L14: {
                      stackIn_31_0.field_xb = stackIn_31_1 != 0;
                      if (fh.field_c) {
                        break L14;
                      } else {
                        if (var6 != 3) {
                          break L14;
                        } else {
                          pu.field_k[0][var6 - -1].field_xb = false;
                          break L14;
                        }
                      }
                    }
                    L15: {
                      stackOut_34_0 = pu.field_k[0][1 + var6];
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (~var6 != ~param3.field_Tb) {
                        stackOut_36_0 = (nf) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L15;
                      } else {
                        stackOut_35_0 = (nf) (Object) stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L15;
                      }
                    }
                    stackIn_37_0.field_rb = stackIn_37_1 != 0;
                    var6++;
                    continue L7;
                  }
                }
              } else {
                if (lm.field_e.length >= 2) {
                  L16: {
                    L17: {
                      if (!param1) {
                        break L17;
                      } else {
                        if (-1 == bp.field_c) {
                          break L17;
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_17_0 = stackOut_15_0;
                          break L16;
                        }
                      }
                    }
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L16;
                  }
                  var6 = stackIn_17_0;
                  if (var6 != 0) {
                    var7 = bp.field_c;
                    var8_int = 0;
                    L18: while (true) {
                      if (var8_int >= ln.field_d.length) {
                        break L6;
                      } else {
                        ln.field_d[var8_int] = (byte) 0;
                        var8_int++;
                        continue L18;
                      }
                    }
                  } else {
                    break L5;
                  }
                } else {
                  break L4;
                }
              }
            }
            ln.field_d[var7 / 8] = (byte)oe.c((int) ln.field_d[var7 / 8], 1 << var7 % 8);
            break L5;
          }
          L19: {
            if (param1) {
              stackOut_56_0 = -1;
              stackIn_57_0 = stackOut_56_0;
              break L19;
            } else {
              stackOut_55_0 = 0;
              stackIn_57_0 = stackOut_55_0;
              break L19;
            }
          }
          var7 = stackIn_57_0;
          L20: while (true) {
            if (~var7 <= ~lm.field_e.length) {
              break L4;
            } else {
              L21: {
                L22: {
                  if (var6 == 0) {
                    break L22;
                  } else {
                    if (~bp.field_c == ~var7) {
                      break L22;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L21;
                    }
                  }
                }
                stackOut_62_0 = 0;
                stackIn_63_0 = stackOut_62_0;
                break L21;
              }
              L23: {
                var8_int = stackIn_63_0;
                if (var4_int == 0) {
                  break L23;
                } else {
                  if (0 != pu.field_k[1][var7 - -1].field_yb) {
                    if (!param1) {
                      var9 = lm.field_e[var7];
                      if (var9 != param3.field_nc) {
                        param3.field_nc = var9;
                        var5 = 1;
                        break L23;
                      } else {
                        break L23;
                      }
                    } else {
                      if (var6 == 0) {
                        if (var7 != -1) {
                          ln.field_d[var7 / 8] = (byte)kf.b((int) ln.field_d[var7 / 8], 1 << rn.a(var7, 7));
                          break L23;
                        } else {
                          var9 = 0;
                          L24: while (true) {
                            if (~var9 <= ~ln.field_d.length) {
                              break L23;
                            } else {
                              ln.field_d[var9] = (byte) 0;
                              var9++;
                              continue L24;
                            }
                          }
                        }
                      } else {
                        break L23;
                      }
                    }
                  } else {
                    break L23;
                  }
                }
              }
              L25: {
                if (!param1) {
                  L26: {
                    var9 = lm.field_e[var7];
                    stackOut_89_0 = pu.field_k[1][var7 - -1];
                    stackIn_91_0 = stackOut_89_0;
                    stackIn_90_0 = stackOut_89_0;
                    if (~var9 != ~param3.field_nc) {
                      stackOut_91_0 = (nf) (Object) stackIn_91_0;
                      stackOut_91_1 = 0;
                      stackIn_92_0 = stackOut_91_0;
                      stackIn_92_1 = stackOut_91_1;
                      break L26;
                    } else {
                      stackOut_90_0 = (nf) (Object) stackIn_90_0;
                      stackOut_90_1 = 1;
                      stackIn_92_0 = stackOut_90_0;
                      stackIn_92_1 = stackOut_90_1;
                      break L26;
                    }
                  }
                  stackIn_92_0.field_rb = stackIn_92_1 != 0;
                  break L25;
                } else {
                  if (var7 == -1) {
                    pu.field_k[1][1 + var7].field_rb = true;
                    var9 = 0;
                    L27: while (true) {
                      if (var9 >= lm.field_e.length) {
                        break L25;
                      } else {
                        L28: {
                          stackOut_85_0 = pu.field_k[1][var7 - -1];
                          stackOut_85_1 = pu.field_k[1][var7 - -1].field_rb;
                          stackIn_87_0 = stackOut_85_0;
                          stackIn_87_1 = stackOut_85_1;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          if (0 != (ln.field_d[var9 / 8] & 1 << (7 & var9))) {
                            stackOut_87_0 = (nf) (Object) stackIn_87_0;
                            stackOut_87_1 = stackIn_87_1;
                            stackOut_87_2 = 0;
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            stackIn_88_2 = stackOut_87_2;
                            break L28;
                          } else {
                            stackOut_86_0 = (nf) (Object) stackIn_86_0;
                            stackOut_86_1 = stackIn_86_1;
                            stackOut_86_2 = 1;
                            stackIn_88_0 = stackOut_86_0;
                            stackIn_88_1 = stackOut_86_1;
                            stackIn_88_2 = stackOut_86_2;
                            break L28;
                          }
                        }
                        stackIn_88_0.field_rb = stackIn_88_1 & stackIn_88_2 != 0;
                        var9++;
                        continue L27;
                      }
                    }
                  } else {
                    L29: {
                      stackOut_79_0 = pu.field_k[1][var7 - -1];
                      stackIn_81_0 = stackOut_79_0;
                      stackIn_80_0 = stackOut_79_0;
                      if ((ln.field_d[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_81_0 = (nf) (Object) stackIn_81_0;
                        stackOut_81_1 = 0;
                        stackIn_82_0 = stackOut_81_0;
                        stackIn_82_1 = stackOut_81_1;
                        break L29;
                      } else {
                        stackOut_80_0 = (nf) (Object) stackIn_80_0;
                        stackOut_80_1 = 1;
                        stackIn_82_0 = stackOut_80_0;
                        stackIn_82_1 = stackOut_80_1;
                        break L29;
                      }
                    }
                    stackIn_82_0.field_rb = stackIn_82_1 != 0;
                    break L25;
                  }
                }
              }
              L30: {
                L31: {
                  stackOut_93_0 = pu.field_k[1][var7 - -1];
                  stackIn_96_0 = stackOut_93_0;
                  stackIn_94_0 = stackOut_93_0;
                  if (var4_int == 0) {
                    break L31;
                  } else {
                    stackOut_94_0 = (nf) (Object) stackIn_94_0;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (var8_int != 0) {
                      break L31;
                    } else {
                      stackOut_95_0 = (nf) (Object) stackIn_95_0;
                      stackOut_95_1 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      break L30;
                    }
                  }
                }
                stackOut_96_0 = (nf) (Object) stackIn_96_0;
                stackOut_96_1 = 0;
                stackIn_97_0 = stackOut_96_0;
                stackIn_97_1 = stackOut_96_1;
                break L30;
              }
              stackIn_97_0.field_xb = stackIn_97_1 != 0;
              var7++;
              continue L20;
            }
          }
        }
        L32: {
          if (!param1) {
            stackOut_100_0 = 1;
            stackIn_101_0 = stackOut_100_0;
            break L32;
          } else {
            stackOut_99_0 = 0;
            stackIn_101_0 = stackOut_99_0;
            break L32;
          }
        }
        var6 = stackIn_101_0;
        L33: while (true) {
          if (var6 >= 3) {
            L34: {
              if (!param1) {
                break L34;
              } else {
                if (ei.field_h <= 1) {
                  break L34;
                } else {
                  var6 = 0;
                  L35: while (true) {
                    if (1 + ei.field_h <= var6) {
                      break L34;
                    } else {
                      L36: {
                        var29 = pu.field_k[3][var6];
                        if (var4_int == 0) {
                          break L36;
                        } else {
                          if (var29.field_yb != 0) {
                            nh.field_E = var6;
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (!var29.field_jb) {
                          break L37;
                        } else {
                          if (0 < var6) {
                            L38: {
                              if (cj.field_j != null) {
                                stackOut_143_0 = cj.field_j[var6 + -1];
                                stackIn_144_0 = stackOut_143_0;
                                break L38;
                              } else {
                                stackOut_142_0 = null;
                                stackIn_144_0 = (String) (Object) stackOut_142_0;
                                break L38;
                              }
                            }
                            var8_ref = stackIn_144_0;
                            if (var8_ref != null) {
                              ad.field_I = var8_ref;
                              break L37;
                            } else {
                              break L37;
                            }
                          } else {
                            break L37;
                          }
                        }
                      }
                      L39: {
                        stackOut_147_0 = (nf) var29;
                        stackIn_149_0 = stackOut_147_0;
                        stackIn_148_0 = stackOut_147_0;
                        if (var6 != nh.field_E) {
                          stackOut_149_0 = (nf) (Object) stackIn_149_0;
                          stackOut_149_1 = 0;
                          stackIn_150_0 = stackOut_149_0;
                          stackIn_150_1 = stackOut_149_1;
                          break L39;
                        } else {
                          stackOut_148_0 = (nf) (Object) stackIn_148_0;
                          stackOut_148_1 = 1;
                          stackIn_150_0 = stackOut_148_0;
                          stackIn_150_1 = stackOut_148_1;
                          break L39;
                        }
                      }
                      L40: {
                        stackIn_150_0.field_rb = stackIn_150_1 != 0;
                        stackOut_150_0 = (nf) var29;
                        stackIn_152_0 = stackOut_150_0;
                        stackIn_151_0 = stackOut_150_0;
                        if (var4_int == 0) {
                          stackOut_152_0 = (nf) (Object) stackIn_152_0;
                          stackOut_152_1 = 0;
                          stackIn_153_0 = stackOut_152_0;
                          stackIn_153_1 = stackOut_152_1;
                          break L40;
                        } else {
                          stackOut_151_0 = (nf) (Object) stackIn_151_0;
                          stackOut_151_1 = 1;
                          stackIn_153_0 = stackOut_151_0;
                          stackIn_153_1 = stackOut_151_1;
                          break L40;
                        }
                      }
                      stackIn_153_0.field_xb = stackIn_153_1 != 0;
                      var6++;
                      continue L35;
                    }
                  }
                }
              }
            }
            L41: {
              var6 = 0;
              if (param0 == 1) {
                break L41;
              } else {
                field_e = null;
                break L41;
              }
            }
            var7 = 0;
            L42: while (true) {
              if (tq.field_b <= var7) {
                L43: {
                  L44: {
                    if (var5 == 0) {
                      break L44;
                    } else {
                      if (!param1) {
                        cl.b(5, param2);
                        break L44;
                      } else {
                        break L43;
                      }
                    }
                  }
                  break L43;
                }
                return;
              } else {
                L45: {
                  var30 = pu.field_k[var7 + 4];
                  var8 = var30;
                  if (param1) {
                    stackOut_160_0 = -1;
                    stackIn_161_0 = stackOut_160_0;
                    break L45;
                  } else {
                    stackOut_159_0 = 0;
                    stackIn_161_0 = stackOut_159_0;
                    break L45;
                  }
                }
                var9 = stackIn_161_0;
                L46: while (true) {
                  if (~var9 <= ~(-1 + var30.length)) {
                    var6 = var6 + (255 & t.field_b[var7]);
                    var7++;
                    continue L42;
                  } else {
                    L47: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L47;
                      } else {
                        if (var9 >= 0) {
                          L48: {
                            if (sk.field_j == null) {
                              break L48;
                            } else {
                              if (sk.field_j[var7] == null) {
                                break L48;
                              } else {
                                if ((~ei.field_a & sk.field_j[var7][var9]) > 0) {
                                  var14 = 1;
                                  var15 = fd.a(true, sk.field_j[var7][var9] & ~ei.field_a);
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                            }
                          }
                          L49: {
                            if (ep.field_p == null) {
                              break L49;
                            } else {
                              if (null == ep.field_p[var7]) {
                                break L49;
                              } else {
                                if (df.field_M > 0) {
                                  break L49;
                                } else {
                                  if (ep.field_p[var7][var9]) {
                                    var10 = 1;
                                    break L49;
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                            }
                          }
                          L50: {
                            if (null == iv.field_e) {
                              break L50;
                            } else {
                              if (null == iv.field_e[var7]) {
                                break L50;
                              } else {
                                L51: {
                                  var16 = iv.field_e[var7][var9];
                                  if (0 == var16) {
                                    break L51;
                                  } else {
                                    if (bj.field_k) {
                                      break L51;
                                    } else {
                                      if (df.field_M <= 0) {
                                        var10 = 1;
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                                if (0 >= var16) {
                                  break L50;
                                } else {
                                  if (~al.field_g <= ~var16) {
                                    break L50;
                                  } else {
                                    var12 = 1;
                                    break L50;
                                  }
                                }
                              }
                            }
                          }
                          L52: {
                            if (null == jv.field_d) {
                              break L52;
                            } else {
                              if (jv.field_d[var7] != null) {
                                L53: {
                                  var16 = jv.field_d[var7][var9];
                                  if (0 >= var16) {
                                    break L53;
                                  } else {
                                    if (~var16 >= ~be.field_s) {
                                      break L53;
                                    } else {
                                      var11 = 1;
                                      break L53;
                                    }
                                  }
                                }
                                if (var16 == 0) {
                                  break L52;
                                } else {
                                  if (bj.field_k) {
                                    break L52;
                                  } else {
                                    if (df.field_M <= 0) {
                                      var10 = 1;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              } else {
                                break L52;
                              }
                            }
                          }
                          L54: {
                            L55: {
                              if (!param1) {
                                break L55;
                              } else {
                                if (ke.field_b == null) {
                                  break L55;
                                } else {
                                  if (null == ke.field_b[var7]) {
                                    break L55;
                                  } else {
                                    if (!ke.field_b[var7][var9]) {
                                      break L55;
                                    } else {
                                      stackOut_202_0 = 1;
                                      stackIn_204_0 = stackOut_202_0;
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_203_0 = 0;
                            stackIn_204_0 = stackOut_203_0;
                            break L54;
                          }
                          var13 = stackIn_204_0;
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                    }
                    L56: {
                      if (hi.field_j < 2) {
                        break L56;
                      } else {
                        if (br.field_f[12]) {
                          var11 = 0;
                          var12 = 0;
                          var10 = 0;
                          var13 = 0;
                          var14 = 0;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                    }
                    L57: {
                      L58: {
                        fc.field_a = true;
                        if (var10 != 0) {
                          break L58;
                        } else {
                          if (var11 != 0) {
                            break L58;
                          } else {
                            if (var12 != 0) {
                              break L58;
                            } else {
                              if (var13 != 0) {
                                break L58;
                              } else {
                                if (var14 == 0) {
                                  stackOut_216_0 = 0;
                                  stackIn_217_0 = stackOut_216_0;
                                  break L57;
                                } else {
                                  break L58;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_215_0 = 1;
                      stackIn_217_0 = stackOut_215_0;
                      break L57;
                    }
                    L59: {
                      var16 = stackIn_217_0;
                      if (var16 != 0) {
                        break L59;
                      } else {
                        if (0 > var9) {
                          break L59;
                        } else {
                          if (null == fs.field_d) {
                            break L59;
                          } else {
                            L60: {
                              if (!param1) {
                                break L60;
                              } else {
                                if (!ua.field_s) {
                                  break L60;
                                } else {
                                  break L59;
                                }
                              }
                            }
                            L61: {
                              jp.field_a = false;
                              fc.field_a = false;
                              if (null != ur.field_B) {
                                break L61;
                              } else {
                                ur.field_B = new byte[tq.field_b];
                                dt.field_d = new boolean[tq.field_b];
                                break L61;
                              }
                            }
                            var17_int = 0;
                            L62: while (true) {
                              if (var17_int >= var7) {
                                L63: {
                                  es.a(0, var7, param3, -1, param1, var9, (byte) 103, -1);
                                  if (hi.field_j < 2) {
                                    break L63;
                                  } else {
                                    if (!br.field_f[12]) {
                                      break L63;
                                    } else {
                                      fc.field_a = true;
                                      break L63;
                                    }
                                  }
                                }
                                if (fc.field_a) {
                                  break L59;
                                } else {
                                  var16 = 1;
                                  break L59;
                                }
                              } else {
                                dt.field_d[var17_int] = false;
                                var17_int++;
                                continue L62;
                              }
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      var17 = var8[var9 + 1];
                      if (var4_int == 0) {
                        break L64;
                      } else {
                        if (var17.field_yb == 0) {
                          break L64;
                        } else {
                          if (!param1) {
                            if (var16 != 0) {
                              break L64;
                            } else {
                              if (param3.field_pc[var7] != (byte)var9) {
                                var5 = 1;
                                param3.field_pc[var7] = (byte)var9;
                                break L64;
                              } else {
                                break L64;
                              }
                            }
                          } else {
                            if (var9 == -1) {
                              var18 = var6;
                              L65: while (true) {
                                if (var18 >= var30.length + var6 + -1) {
                                  break L64;
                                } else {
                                  tg.field_d[var18 / 8] = (byte)rn.a((int) tg.field_d[var18 / 8], ~(1 << rn.a(7, var18)));
                                  var18++;
                                  continue L65;
                                }
                              }
                            } else {
                              tg.field_d[(var6 + var9) / 8] = (byte)kf.b((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7));
                              break L64;
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      if (!param1) {
                        break L66;
                      } else {
                        if (var16 == 0) {
                          break L66;
                        } else {
                          tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], ~(1 << rn.a(var9 + var6, 7)));
                          break L66;
                        }
                      }
                    }
                    L67: {
                      if (var9 < 0) {
                        break L67;
                      } else {
                        if (!var17.field_jb) {
                          break L67;
                        } else {
                          L68: {
                            if (ll.field_Mb == null) {
                              var18_ref = null;
                              break L68;
                            } else {
                              if (ll.field_Mb[var7] == null) {
                                var18_ref = null;
                                break L68;
                              } else {
                                var18_ref = (Object) (Object) ll.field_Mb[var7][var9];
                                break L68;
                              }
                            }
                          }
                          L69: {
                            if (wb.field_a == null) {
                              var19 = null;
                              break L69;
                            } else {
                              if (null == wb.field_a[var7]) {
                                var19 = null;
                                break L69;
                              } else {
                                var19 = (Object) (Object) wb.field_a[var7][var9];
                                break L69;
                              }
                            }
                          }
                          L70: {
                            var20 = null;
                            if (var19 == null) {
                              break L70;
                            } else {
                              if (!((String) var19).equals(var18_ref)) {
                                var20 = var19;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                          }
                          L71: {
                            var21 = null;
                            if (var13 != 0) {
                              var21 = (Object) (Object) sc.field_h;
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
                              break L71;
                            } else {
                              if (var10 != 0) {
                                var21 = (Object) (Object) gt.field_a;
                                break L71;
                              } else {
                                L72: {
                                  if (var11 == 0) {
                                    break L72;
                                  } else {
                                    var22_int = jv.field_d[var7][var9] - be.field_s;
                                    if (var22_int != 1) {
                                      var21 = (Object) (Object) fo.a(4800, mg.field_a, new String[1]);
                                      break L72;
                                    } else {
                                      var21 = (Object) (Object) bt.field_a;
                                      break L72;
                                    }
                                  }
                                }
                                L73: {
                                  if (var12 != 0) {
                                    var31 = fo.a(4800, qb.field_k, new String[2]);
                                    var22_ref = var31;
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    var25_ref = var31;
                                    var22_ref = var25_ref;
                                    if (var21 == null) {
                                      var21 = (Object) (Object) var31;
                                      break L73;
                                    } else {
                                      var21 = (Object) (Object) (var21 + "<br>" + var31);
                                      break L73;
                                    }
                                  } else {
                                    break L73;
                                  }
                                }
                                if (var14 != 0) {
                                  L74: {
                                    var22_ref = md.field_F;
                                    if (var15 <= 0) {
                                      break L74;
                                    } else {
                                      if (jl.field_c == null) {
                                        break L74;
                                      } else {
                                        if (var15 > jl.field_c.length) {
                                          break L74;
                                        } else {
                                          if (null != jl.field_c[var15 - 1]) {
                                            var22_ref = jl.field_c[var15 - 1][0];
                                            break L74;
                                          } else {
                                            break L74;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 != null) {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L71;
                                  } else {
                                    var21 = (Object) (Object) var22_ref;
                                    break L71;
                                  }
                                } else {
                                  break L71;
                                }
                              }
                            }
                          }
                          L75: {
                            if (var4_int == 0) {
                              break L75;
                            } else {
                              if (fc.field_a) {
                                break L75;
                              } else {
                                L76: {
                                  var22_ref = null;
                                  if (jp.field_a) {
                                    var22_ref = "</col>" + ep.field_h + "<col=A00000>";
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var25_ref = var22_ref;
                                    var22_ref = var25_ref;
                                    var21 = (Object) (Object) var22_ref;
                                    break L76;
                                  } else {
                                    break L76;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L77: while (true) {
                                  if (~var24 <= ~var7) {
                                    if (var23 == 0) {
                                      var21 = (Object) (Object) fo.a(4800, ab.field_e, new String[1]);
                                      break L75;
                                    } else {
                                      var21 = (Object) (Object) (mj.field_a + var22_ref);
                                      break L75;
                                    }
                                  } else {
                                    L78: {
                                      if (dt.field_d[var24]) {
                                        var25_ref = "</col>" + ob.field_M[var24] + "<col=A00000>";
                                        var22_ref = var25_ref;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25_ref;
                                        if (var22_ref != null) {
                                          var22_ref = var22_ref + ", " + var25_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var23 = 1;
                                          break L78;
                                        } else {
                                          var22_ref = var25_ref;
                                          break L78;
                                        }
                                      } else {
                                        break L78;
                                      }
                                    }
                                    var24++;
                                    continue L77;
                                  }
                                }
                              }
                            }
                          }
                          L79: {
                            if (var21 == null) {
                              break L79;
                            } else {
                              var21 = (Object) (Object) ("<col=A00000>" + var21);
                              var32 = dj.a(6609, (String) var21, "<br>", "<br><col=A00000>");
                              if (var20 != null) {
                                var20 = (Object) (Object) (var20 + "<br>" + var32);
                                break L79;
                              } else {
                                var20 = (Object) (Object) var32;
                                break L79;
                              }
                            }
                          }
                          if (var20 == null) {
                            break L67;
                          } else {
                            ad.field_I = (String) var20;
                            break L67;
                          }
                        }
                      }
                    }
                    L80: {
                      if (param1) {
                        if (var9 != -1) {
                          L81: {
                            stackOut_323_0 = (nf) var17;
                            stackIn_325_0 = stackOut_323_0;
                            stackIn_324_0 = stackOut_323_0;
                            if ((tg.field_d[(var9 + var6) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                              stackOut_325_0 = (nf) (Object) stackIn_325_0;
                              stackOut_325_1 = 0;
                              stackIn_326_0 = stackOut_325_0;
                              stackIn_326_1 = stackOut_325_1;
                              break L81;
                            } else {
                              stackOut_324_0 = (nf) (Object) stackIn_324_0;
                              stackOut_324_1 = 1;
                              stackIn_326_0 = stackOut_324_0;
                              stackIn_326_1 = stackOut_324_1;
                              break L81;
                            }
                          }
                          stackIn_326_0.field_rb = stackIn_326_1 != 0;
                          break L80;
                        } else {
                          var17.field_rb = true;
                          var27 = var6;
                          var18 = var27;
                          L82: while (true) {
                            if (var30.length + var6 + -1 <= var27) {
                              break L80;
                            } else {
                              L83: {
                                stackOut_319_0 = (nf) var17;
                                stackOut_319_1 = var17.field_rb;
                                stackIn_321_0 = stackOut_319_0;
                                stackIn_321_1 = stackOut_319_1;
                                stackIn_320_0 = stackOut_319_0;
                                stackIn_320_1 = stackOut_319_1;
                                if ((tg.field_d[var27 / 8] & 1 << (var27 & 7)) != 0) {
                                  stackOut_321_0 = (nf) (Object) stackIn_321_0;
                                  stackOut_321_1 = stackIn_321_1;
                                  stackOut_321_2 = 0;
                                  stackIn_322_0 = stackOut_321_0;
                                  stackIn_322_1 = stackOut_321_1;
                                  stackIn_322_2 = stackOut_321_2;
                                  break L83;
                                } else {
                                  stackOut_320_0 = (nf) (Object) stackIn_320_0;
                                  stackOut_320_1 = stackIn_320_1;
                                  stackOut_320_2 = 1;
                                  stackIn_322_0 = stackOut_320_0;
                                  stackIn_322_1 = stackOut_320_1;
                                  stackIn_322_2 = stackOut_320_2;
                                  break L83;
                                }
                              }
                              stackIn_322_0.field_rb = stackIn_322_1 & stackIn_322_2 != 0;
                              var27++;
                              continue L82;
                            }
                          }
                        }
                      } else {
                        L84: {
                          L85: {
                            stackOut_311_0 = (nf) var17;
                            stackIn_314_0 = stackOut_311_0;
                            stackIn_312_0 = stackOut_311_0;
                            if (!fc.field_a) {
                              break L85;
                            } else {
                              stackOut_312_0 = (nf) (Object) stackIn_312_0;
                              stackIn_314_0 = stackOut_312_0;
                              stackIn_313_0 = stackOut_312_0;
                              if ((byte)var9 != param3.field_pc[var7]) {
                                break L85;
                              } else {
                                stackOut_313_0 = (nf) (Object) stackIn_313_0;
                                stackOut_313_1 = 1;
                                stackIn_315_0 = stackOut_313_0;
                                stackIn_315_1 = stackOut_313_1;
                                break L84;
                              }
                            }
                          }
                          stackOut_314_0 = (nf) (Object) stackIn_314_0;
                          stackOut_314_1 = 0;
                          stackIn_315_0 = stackOut_314_0;
                          stackIn_315_1 = stackOut_314_1;
                          break L84;
                        }
                        stackIn_315_0.field_rb = stackIn_315_1 != 0;
                        break L80;
                      }
                    }
                    L86: {
                      L87: {
                        stackOut_327_0 = (nf) var17;
                        stackIn_330_0 = stackOut_327_0;
                        stackIn_328_0 = stackOut_327_0;
                        if (var4_int == 0) {
                          break L87;
                        } else {
                          stackOut_328_0 = (nf) (Object) stackIn_328_0;
                          stackIn_330_0 = stackOut_328_0;
                          stackIn_329_0 = stackOut_328_0;
                          if (var16 != 0) {
                            break L87;
                          } else {
                            stackOut_329_0 = (nf) (Object) stackIn_329_0;
                            stackOut_329_1 = 1;
                            stackIn_331_0 = stackOut_329_0;
                            stackIn_331_1 = stackOut_329_1;
                            break L86;
                          }
                        }
                      }
                      stackOut_330_0 = (nf) (Object) stackIn_330_0;
                      stackOut_330_1 = 0;
                      stackIn_331_0 = stackOut_330_0;
                      stackIn_331_1 = stackOut_330_1;
                      break L86;
                    }
                    stackIn_331_0.field_xb = stackIn_331_1 != 0;
                    var9++;
                    continue L46;
                  }
                }
              }
            }
          } else {
            L88: {
              var28 = pu.field_k[2][var6];
              if (var4_int == 0) {
                break L88;
              } else {
                if (var28.field_yb == 0) {
                  break L88;
                } else {
                  if (param1) {
                    if (var6 == 0) {
                      sm.field_b = 0;
                      break L88;
                    } else {
                      sm.field_b = sm.field_b ^ var6;
                      break L88;
                    }
                  } else {
                    if (~var6 != ~param3.field_ac) {
                      param3.field_ac = var6;
                      var5 = 1;
                      break L88;
                    } else {
                      break L88;
                    }
                  }
                }
              }
            }
            L89: {
              stackOut_112_0 = (nf) var28;
              stackIn_114_0 = stackOut_112_0;
              stackIn_113_0 = stackOut_112_0;
              if (var4_int == 0) {
                stackOut_114_0 = (nf) (Object) stackIn_114_0;
                stackOut_114_1 = 0;
                stackIn_115_0 = stackOut_114_0;
                stackIn_115_1 = stackOut_114_1;
                break L89;
              } else {
                stackOut_113_0 = (nf) (Object) stackIn_113_0;
                stackOut_113_1 = 1;
                stackIn_115_0 = stackOut_113_0;
                stackIn_115_1 = stackOut_113_1;
                break L89;
              }
            }
            L90: {
              stackIn_115_0.field_xb = stackIn_115_1 != 0;
              if (!param1) {
                L91: {
                  stackOut_125_0 = (nf) var28;
                  stackIn_127_0 = stackOut_125_0;
                  stackIn_126_0 = stackOut_125_0;
                  if ((var6 & param3.field_ac) == 0) {
                    stackOut_127_0 = (nf) (Object) stackIn_127_0;
                    stackOut_127_1 = 0;
                    stackIn_128_0 = stackOut_127_0;
                    stackIn_128_1 = stackOut_127_1;
                    break L91;
                  } else {
                    stackOut_126_0 = (nf) (Object) stackIn_126_0;
                    stackOut_126_1 = 1;
                    stackIn_128_0 = stackOut_126_0;
                    stackIn_128_1 = stackOut_126_1;
                    break L91;
                  }
                }
                stackIn_128_0.field_rb = stackIn_128_1 != 0;
                break L90;
              } else {
                if (var6 != 0) {
                  L92: {
                    stackOut_121_0 = (nf) var28;
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_122_0 = stackOut_121_0;
                    if ((var6 & sm.field_b) == 0) {
                      stackOut_123_0 = (nf) (Object) stackIn_123_0;
                      stackOut_123_1 = 0;
                      stackIn_124_0 = stackOut_123_0;
                      stackIn_124_1 = stackOut_123_1;
                      break L92;
                    } else {
                      stackOut_122_0 = (nf) (Object) stackIn_122_0;
                      stackOut_122_1 = 1;
                      stackIn_124_0 = stackOut_122_0;
                      stackIn_124_1 = stackOut_122_1;
                      break L92;
                    }
                  }
                  stackIn_124_0.field_rb = stackIn_124_1 != 0;
                  break L90;
                } else {
                  L93: {
                    stackOut_117_0 = (nf) var28;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_118_0 = stackOut_117_0;
                    if (sm.field_b != 0) {
                      stackOut_119_0 = (nf) (Object) stackIn_119_0;
                      stackOut_119_1 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      stackIn_120_1 = stackOut_119_1;
                      break L93;
                    } else {
                      stackOut_118_0 = (nf) (Object) stackIn_118_0;
                      stackOut_118_1 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      stackIn_120_1 = stackOut_118_1;
                      break L93;
                    }
                  }
                  stackIn_120_0.field_rb = stackIn_120_1 != 0;
                  break L90;
                }
              }
            }
            var6++;
            continue L33;
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
                              var27 = ((vf) this).field_g[var24] << 12;
                              var6 = ((vf) this).field_a * var27 >> 12;
                              var4 = var35[var22] * var27 >> 12;
                              var7 = var27 * ((vf) this).field_d >> 12;
                              var5 = var36[var23] * var27 >> 12;
                              var5 = var5 * ((vf) this).field_d;
                              var4 = var4 * ((vf) this).field_a;
                              var8 = var4 >> 12;
                              var9 = var8 - -1;
                              var10 = var5 >> 12;
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
                            var20 = (var12 * (var19 - var18) >> 12) + var18;
                            var18 = ma.a(var4, 3, (int) ((vf) this).field_k[var17 + var8], var15);
                            var19 = ma.a(var14, 3, (int) ((vf) this).field_k[var17 + var9], var15);
                            var21 = var18 + (var12 * (-var18 + var19) >> 12);
                            ((vf) this).b(var24, (var13 * (-var20 + var21) >> 12) + var20, 19699);
                            var24++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var26[var27] = (var27 << 12) / param0;
                var27++;
                continue L2;
              }
            }
          } else {
            var25[var27] = (var27 << 12) / param2;
            var27++;
            continue L1;
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
                field_l = null;
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
            stackOut_2_0 = (ru) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("vf.K(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
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
        Random var2 = new Random((long)((vf) this).field_i);
        for (var3 = 0; var3 < 255; var3++) {
            ((vf) this).field_k[var3] = (short)var3;
        }
        for (var3 = 0; var3 < 255; var3++) {
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
