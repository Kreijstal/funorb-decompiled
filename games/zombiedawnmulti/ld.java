/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends cj {
    private char[] field_Pb;
    private int[] field_Qb;
    private int field_Hb;
    private int field_Nb;
    private int field_Ob;
    private int field_Sb;
    private int field_Tb;
    private ld field_Ib;
    private int field_Mb;
    static lf field_Rb;
    private mo[] field_Gb;
    private int field_Vb;
    private ld[] field_Fb;
    private int field_Jb;
    static ja[] field_Ub;
    static String field_Lb;
    static long field_Kb;

    final int i(int param0) {
        if (param0 != -29804) {
            this.field_Hb = 69;
        }
        return this.field_Sb - -(this.field_Ib != null ? this.field_Ib.i(-29804) : 0);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Hb = param0;
        var5 = 0;
        if (param1 == 11183) {
          L0: while (true) {
            L1: {
              if (var5 >= this.field_Ob) {
                break L1;
              } else {
                var3 = this.field_Jb * var5;
                var4 = this.field_Hb * this.field_Hb;
                this.field_Gb[var5].field_Q = (var4 * (this.field_Mb + -this.field_qb) + (144 - var4) * var3) / 144;
                var5++;
                if (var6 != 0) {
                  break L1;
                } else {
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        mo[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        mo var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        String var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        mo[] var27 = null;
        mo var28 = null;
        mo var29 = null;
        String var30 = null;
        String var31 = null;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        mo stackIn_20_0 = null;
        mo stackIn_21_0 = null;
        mo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        mo stackIn_27_0 = null;
        mo stackIn_28_0 = null;
        mo stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_59_0 = 0;
        mo stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        int stackIn_79_2 = 0;
        mo stackIn_80_0 = null;
        boolean stackIn_80_1 = false;
        mo stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        mo stackIn_82_0 = null;
        boolean stackIn_82_1 = false;
        int stackIn_82_2 = 0;
        mo stackIn_85_0 = null;
        mo stackIn_86_0 = null;
        mo stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        mo stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        mo stackIn_91_0 = null;
        mo stackIn_92_0 = null;
        mo stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        mo stackIn_95_0 = null;
        mo stackIn_96_0 = null;
        mo stackIn_97_0 = null;
        mo stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_107_0 = 0;
        mo stackIn_119_0 = null;
        mo stackIn_120_0 = null;
        mo stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        mo stackIn_124_0 = null;
        mo stackIn_125_0 = null;
        mo stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        mo stackIn_128_0 = null;
        mo stackIn_129_0 = null;
        mo stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        mo stackIn_132_0 = null;
        mo stackIn_133_0 = null;
        mo stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_143_0 = 0;
        String stackIn_153_0 = null;
        mo stackIn_157_0 = null;
        mo stackIn_158_0 = null;
        mo stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        mo stackIn_160_0 = null;
        mo stackIn_161_0 = null;
        mo stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_164_0 = 0;
        boolean stackIn_167_0 = false;
        int stackIn_170_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_225_0 = 0;
        boolean stackIn_311_0 = false;
        int stackIn_318_0 = 0;
        mo stackIn_333_0 = null;
        boolean stackIn_333_1 = false;
        int stackIn_333_2 = 0;
        int stackIn_333_3 = 0;
        mo stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        mo stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        mo stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        int stackIn_336_2 = 0;
        mo stackIn_339_0 = null;
        mo stackIn_340_0 = null;
        mo stackIn_341_0 = null;
        int stackIn_341_1 = 0;
        mo stackIn_343_0 = null;
        mo stackIn_344_0 = null;
        int stackIn_344_1 = 0;
        int stackIn_344_2 = 0;
        int stackIn_344_3 = 0;
        mo stackIn_345_0 = null;
        mo stackIn_346_0 = null;
        mo stackIn_347_0 = null;
        int stackIn_347_1 = 0;
        mo stackIn_349_0 = null;
        mo stackIn_350_0 = null;
        mo stackIn_351_0 = null;
        mo stackIn_352_0 = null;
        int stackIn_352_1 = 0;
        int stackIn_354_0 = 0;
        int stackIn_356_0 = 0;
        RuntimeException stackIn_362_0 = null;
        StringBuilder stackIn_362_1 = null;
        RuntimeException stackIn_363_0 = null;
        StringBuilder stackIn_363_1 = null;
        RuntimeException stackIn_364_0 = null;
        StringBuilder stackIn_364_1 = null;
        String stackIn_364_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        mo stackOut_19_0 = null;
        mo stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        mo stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        mo stackOut_26_0 = null;
        mo stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        mo stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        boolean stackOut_30_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        mo stackOut_78_0 = null;
        boolean stackOut_78_1 = false;
        int stackOut_78_2 = 0;
        mo stackOut_79_0 = null;
        boolean stackOut_79_1 = false;
        mo stackOut_81_0 = null;
        boolean stackOut_81_1 = false;
        int stackOut_81_2 = 0;
        mo stackOut_80_0 = null;
        boolean stackOut_80_1 = false;
        int stackOut_80_2 = 0;
        mo stackOut_84_0 = null;
        mo stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        mo stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        mo stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        mo stackOut_90_0 = null;
        mo stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        mo stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        mo stackOut_94_0 = null;
        mo stackOut_95_0 = null;
        mo stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        mo stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        boolean stackOut_99_0 = false;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_106_0 = 0;
        mo stackOut_118_0 = null;
        mo stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        mo stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        mo stackOut_123_0 = null;
        mo stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        mo stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        mo stackOut_127_0 = null;
        mo stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        mo stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        mo stackOut_131_0 = null;
        mo stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        mo stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        boolean stackOut_136_0 = false;
        int stackOut_142_0 = 0;
        String stackOut_152_0 = null;
        Object stackOut_151_0 = null;
        mo stackOut_156_0 = null;
        mo stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        mo stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        mo stackOut_159_0 = null;
        mo stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        mo stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        int stackOut_163_0 = 0;
        boolean stackOut_166_0 = false;
        int stackOut_169_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        boolean stackOut_310_0 = false;
        int stackOut_317_0 = 0;
        mo stackOut_332_0 = null;
        boolean stackOut_332_1 = false;
        int stackOut_332_2 = 0;
        int stackOut_332_3 = 0;
        mo stackOut_333_0 = null;
        boolean stackOut_333_1 = false;
        mo stackOut_335_0 = null;
        boolean stackOut_335_1 = false;
        int stackOut_335_2 = 0;
        mo stackOut_334_0 = null;
        boolean stackOut_334_1 = false;
        int stackOut_334_2 = 0;
        mo stackOut_338_0 = null;
        mo stackOut_340_0 = null;
        int stackOut_340_1 = 0;
        mo stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        mo stackOut_342_0 = null;
        mo stackOut_343_0 = null;
        int stackOut_343_1 = 0;
        byte stackOut_343_2 = 0;
        int stackOut_343_3 = 0;
        mo stackOut_344_0 = null;
        mo stackOut_345_0 = null;
        int stackOut_345_1 = 0;
        mo stackOut_346_0 = null;
        int stackOut_346_1 = 0;
        mo stackOut_348_0 = null;
        mo stackOut_349_0 = null;
        mo stackOut_350_0 = null;
        int stackOut_350_1 = 0;
        mo stackOut_351_0 = null;
        int stackOut_351_1 = 0;
        int stackOut_353_0 = 0;
        int stackOut_355_0 = 0;
        RuntimeException stackOut_361_0 = null;
        StringBuilder stackOut_361_1 = null;
        RuntimeException stackOut_363_0 = null;
        StringBuilder stackOut_363_1 = null;
        String stackOut_363_2 = null;
        RuntimeException stackOut_362_0 = null;
        StringBuilder stackOut_362_1 = null;
        String stackOut_362_2 = null;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (!hl.b(0)) {
                        break L4;
                      } else {
                        if (param0.field_Fb) {
                          break L4;
                        } else {
                          stackOut_4_0 = 1;
                          stackIn_6_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L3;
                  }
                  var4_int = stackIn_6_0;
                  if (var26 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L5: {
                if (la.field_k) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L5;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L5;
                }
              }
              var4_int = stackIn_10_0;
              break L1;
            }
            L6: {
              var5 = 0;
              if (param1) {
                break L6;
              } else {
                var6 = 0;
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var6 >= 5) {
                        break L9;
                      } else {
                        stackOut_14_0 = var4_int;
                        stackIn_31_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (var26 != 0) {
                          break L8;
                        } else {
                          L10: {
                            if (stackIn_15_0 == 0) {
                              break L10;
                            } else {
                              if ((ma.field_b[0][1 + var6].field_T ^ -1) == -1) {
                                break L10;
                              } else {
                                if (var6 == param0.field_Pb) {
                                  break L10;
                                } else {
                                  var5 = 1;
                                  param0.field_Pb = var6;
                                  break L10;
                                }
                              }
                            }
                          }
                          L11: {
                            stackOut_19_0 = ma.field_b[0][var6 - -1];
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var4_int == 0) {
                              stackOut_21_0 = (mo) ((Object) stackIn_21_0);
                              stackOut_21_1 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              break L11;
                            } else {
                              stackOut_20_0 = (mo) ((Object) stackIn_20_0);
                              stackOut_20_1 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              break L11;
                            }
                          }
                          L12: {
                            stackIn_22_0.field_Z = stackIn_22_1 != 0;
                            if (tb.field_u) {
                              break L12;
                            } else {
                              if (var6 == 3) {
                                ma.field_b[0][1 + var6].field_Z = false;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            stackOut_26_0 = ma.field_b[0][1 + var6];
                            stackIn_28_0 = stackOut_26_0;
                            stackIn_27_0 = stackOut_26_0;
                            if (param0.field_Pb != var6) {
                              stackOut_28_0 = (mo) ((Object) stackIn_28_0);
                              stackOut_28_1 = 0;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              break L13;
                            } else {
                              stackOut_27_0 = (mo) ((Object) stackIn_27_0);
                              stackOut_27_1 = 1;
                              stackIn_29_0 = stackOut_27_0;
                              stackIn_29_1 = stackOut_27_1;
                              break L13;
                            }
                          }
                          stackIn_29_0.field_Ab = stackIn_29_1 != 0;
                          var6++;
                          if (var26 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = ma.field_b[0][2].field_pb;
                    stackIn_31_0 = stackOut_30_0 ? 1 : 0;
                    break L8;
                  }
                  if (stackIn_31_0 == 0) {
                    break L6;
                  } else {
                    L14: {
                      if (hl.b(0)) {
                        break L14;
                      } else {
                        ui.field_j = vl.a(vc.field_e, new String[]{mh.field_c.field_Nb}, 2);
                        if (var26 == 0) {
                          break L6;
                        } else {
                          break L14;
                        }
                      }
                    }
                    ui.field_j = pd.field_f;
                    break L6;
                  }
                }
              }
            }
            L15: {
              L16: {
                if ((qo.field_r.length ^ -1) <= -3) {
                  L17: {
                    L18: {
                      if (!param1) {
                        break L18;
                      } else {
                        if ((tj.field_c ^ -1) == 0) {
                          break L18;
                        } else {
                          stackOut_40_0 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          break L17;
                        }
                      }
                    }
                    stackOut_41_0 = 0;
                    stackIn_42_0 = stackOut_41_0;
                    break L17;
                  }
                  L19: {
                    var6 = stackIn_42_0;
                    if (var6 == 0) {
                      break L19;
                    } else {
                      var7 = tj.field_c;
                      var8_int = 0;
                      L20: while (true) {
                        L21: {
                          if (var8_int >= fg.field_k.length) {
                            break L21;
                          } else {
                            fg.field_k[var8_int] = (byte) 0;
                            var8_int++;
                            if (var26 != 0) {
                              break L19;
                            } else {
                              if (var26 == 0) {
                                continue L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
                        break L19;
                      }
                    }
                  }
                  L22: {
                    if (!param1) {
                      stackOut_51_0 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      break L22;
                    } else {
                      stackOut_50_0 = -1;
                      stackIn_52_0 = stackOut_50_0;
                      break L22;
                    }
                  }
                  var7 = stackIn_52_0;
                  L23: while (true) {
                    if (qo.field_r.length <= var7) {
                      break L16;
                    } else {
                      stackOut_54_0 = var6;
                      stackIn_100_0 = stackOut_54_0;
                      stackIn_55_0 = stackOut_54_0;
                      if (var26 != 0) {
                        break L15;
                      } else {
                        L24: {
                          L25: {
                            if (stackIn_55_0 == 0) {
                              break L25;
                            } else {
                              if ((tj.field_c ^ -1) == (var7 ^ -1)) {
                                break L25;
                              } else {
                                stackOut_57_0 = 1;
                                stackIn_59_0 = stackOut_57_0;
                                break L24;
                              }
                            }
                          }
                          stackOut_58_0 = 0;
                          stackIn_59_0 = stackOut_58_0;
                          break L24;
                        }
                        L26: {
                          L27: {
                            L28: {
                              L29: {
                                var8_int = stackIn_59_0;
                                if (var4_int == 0) {
                                  break L29;
                                } else {
                                  if (ma.field_b[1][var7 - -1].field_T == 0) {
                                    break L29;
                                  } else {
                                    L30: {
                                      if (param1) {
                                        break L30;
                                      } else {
                                        L31: {
                                          var9 = qo.field_r[var7];
                                          if ((var9 ^ -1) == (param0.field_mc ^ -1)) {
                                            break L31;
                                          } else {
                                            param0.field_mc = var9;
                                            var5 = 1;
                                            break L31;
                                          }
                                        }
                                        if (var26 == 0) {
                                          break L29;
                                        } else {
                                          break L30;
                                        }
                                      }
                                    }
                                    if (var6 != 0) {
                                      break L29;
                                    } else {
                                      L32: {
                                        if ((var7 ^ -1) == 0) {
                                          break L32;
                                        } else {
                                          fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                                          if (var26 == 0) {
                                            break L29;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      var9 = 0;
                                      L33: while (true) {
                                        if ((var9 ^ -1) <= (fg.field_k.length ^ -1)) {
                                          break L29;
                                        } else {
                                          fg.field_k[var9] = (byte) 0;
                                          var9++;
                                          if (var26 != 0) {
                                            break L28;
                                          } else {
                                            if (var26 == 0) {
                                              continue L33;
                                            } else {
                                              break L29;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L34: {
                                if (!param1) {
                                  break L34;
                                } else {
                                  L35: {
                                    if (var7 != -1) {
                                      break L35;
                                    } else {
                                      ma.field_b[1][var7 - -1].field_Ab = true;
                                      var9 = 0;
                                      L36: while (true) {
                                        L37: {
                                          if ((qo.field_r.length ^ -1) >= (var9 ^ -1)) {
                                            break L37;
                                          } else {
                                            stackOut_78_0 = ma.field_b[1][var7 - -1];
                                            stackOut_78_1 = ma.field_b[1][var7 - -1].field_Ab;
                                            stackOut_78_2 = fg.field_k[var9 / 8] & 1 << (var9 & 7);
                                            stackIn_90_0 = stackOut_78_0;
                                            stackIn_90_1 = stackOut_78_1 ? 1 : 0;
                                            stackIn_90_2 = stackOut_78_2;
                                            stackIn_79_0 = stackOut_78_0;
                                            stackIn_79_1 = stackOut_78_1;
                                            stackIn_79_2 = stackOut_78_2;
                                            if (var26 != 0) {
                                              break L27;
                                            } else {
                                              L38: {
                                                stackOut_79_0 = (mo) ((Object) stackIn_79_0);
                                                stackOut_79_1 = stackIn_79_1;
                                                stackIn_81_0 = stackOut_79_0;
                                                stackIn_81_1 = stackOut_79_1;
                                                stackIn_80_0 = stackOut_79_0;
                                                stackIn_80_1 = stackOut_79_1;
                                                if (stackIn_79_2 != 0) {
                                                  stackOut_81_0 = (mo) ((Object) stackIn_81_0);
                                                  stackOut_81_1 = stackIn_81_1;
                                                  stackOut_81_2 = 0;
                                                  stackIn_82_0 = stackOut_81_0;
                                                  stackIn_82_1 = stackOut_81_1;
                                                  stackIn_82_2 = stackOut_81_2;
                                                  break L38;
                                                } else {
                                                  stackOut_80_0 = (mo) ((Object) stackIn_80_0);
                                                  stackOut_80_1 = stackIn_80_1;
                                                  stackOut_80_2 = 1;
                                                  stackIn_82_0 = stackOut_80_0;
                                                  stackIn_82_1 = stackOut_80_1;
                                                  stackIn_82_2 = stackOut_80_2;
                                                  break L38;
                                                }
                                              }
                                              stackIn_82_0.field_Ab = stackIn_82_1 & stackIn_82_2 != 0;
                                              var9++;
                                              if (var26 == 0) {
                                                continue L36;
                                              } else {
                                                break L37;
                                              }
                                            }
                                          }
                                        }
                                        if (var26 == 0) {
                                          break L26;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                  }
                                  L39: {
                                    stackOut_84_0 = ma.field_b[1][var7 + 1];
                                    stackIn_86_0 = stackOut_84_0;
                                    stackIn_85_0 = stackOut_84_0;
                                    if (-1 == (fg.field_k[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                                      stackOut_86_0 = (mo) ((Object) stackIn_86_0);
                                      stackOut_86_1 = 0;
                                      stackIn_87_0 = stackOut_86_0;
                                      stackIn_87_1 = stackOut_86_1;
                                      break L39;
                                    } else {
                                      stackOut_85_0 = (mo) ((Object) stackIn_85_0);
                                      stackOut_85_1 = 1;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_87_1 = stackOut_85_1;
                                      break L39;
                                    }
                                  }
                                  stackIn_87_0.field_Ab = stackIn_87_1 != 0;
                                  if (var26 == 0) {
                                    break L26;
                                  } else {
                                    break L34;
                                  }
                                }
                              }
                              var9 = qo.field_r[var7];
                              break L28;
                            }
                            stackOut_89_0 = ma.field_b[1][1 + var7];
                            stackOut_89_1 = param0.field_mc ^ -1;
                            stackOut_89_2 = var9 ^ -1;
                            stackIn_90_0 = stackOut_89_0;
                            stackIn_90_1 = stackOut_89_1;
                            stackIn_90_2 = stackOut_89_2;
                            break L27;
                          }
                          L40: {
                            stackOut_90_0 = (mo) ((Object) stackIn_90_0);
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_91_0 = stackOut_90_0;
                            if (stackIn_90_1 != stackIn_90_2) {
                              stackOut_92_0 = (mo) ((Object) stackIn_92_0);
                              stackOut_92_1 = 0;
                              stackIn_93_0 = stackOut_92_0;
                              stackIn_93_1 = stackOut_92_1;
                              break L40;
                            } else {
                              stackOut_91_0 = (mo) ((Object) stackIn_91_0);
                              stackOut_91_1 = 1;
                              stackIn_93_0 = stackOut_91_0;
                              stackIn_93_1 = stackOut_91_1;
                              break L40;
                            }
                          }
                          stackIn_93_0.field_Ab = stackIn_93_1 != 0;
                          break L26;
                        }
                        L41: {
                          L42: {
                            stackOut_94_0 = ma.field_b[1][var7 + 1];
                            stackIn_97_0 = stackOut_94_0;
                            stackIn_95_0 = stackOut_94_0;
                            if (var4_int == 0) {
                              break L42;
                            } else {
                              stackOut_95_0 = (mo) ((Object) stackIn_95_0);
                              stackIn_97_0 = stackOut_95_0;
                              stackIn_96_0 = stackOut_95_0;
                              if (var8_int != 0) {
                                break L42;
                              } else {
                                stackOut_96_0 = (mo) ((Object) stackIn_96_0);
                                stackOut_96_1 = 1;
                                stackIn_98_0 = stackOut_96_0;
                                stackIn_98_1 = stackOut_96_1;
                                break L41;
                              }
                            }
                          }
                          stackOut_97_0 = (mo) ((Object) stackIn_97_0);
                          stackOut_97_1 = 0;
                          stackIn_98_0 = stackOut_97_0;
                          stackIn_98_1 = stackOut_97_1;
                          break L41;
                        }
                        stackIn_98_0.field_Z = stackIn_98_1 != 0;
                        var7++;
                        if (var26 == 0) {
                          continue L23;
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                } else {
                  break L16;
                }
              }
              stackOut_99_0 = param1;
              stackIn_100_0 = stackOut_99_0 ? 1 : 0;
              break L15;
            }
            L43: {
              if (stackIn_100_0 != 0) {
                stackOut_102_0 = 0;
                stackIn_103_0 = stackOut_102_0;
                break L43;
              } else {
                stackOut_101_0 = 1;
                stackIn_103_0 = stackOut_101_0;
                break L43;
              }
            }
            L44: {
              var6 = stackIn_103_0;
              if (param3 == 1) {
                break L44;
              } else {
                field_Kb = -74L;
                break L44;
              }
            }
            L45: while (true) {
              L46: {
                L47: {
                  if ((var6 ^ -1) <= -4) {
                    break L47;
                  } else {
                    var28 = ma.field_b[2][var6];
                    stackOut_106_0 = var4_int;
                    stackIn_137_0 = stackOut_106_0;
                    stackIn_107_0 = stackOut_106_0;
                    if (var26 != 0) {
                      break L46;
                    } else {
                      L48: {
                        if (stackIn_107_0 == 0) {
                          break L48;
                        } else {
                          if (-1 == (var28.field_T ^ -1)) {
                            break L48;
                          } else {
                            L49: {
                              if (!param1) {
                                break L49;
                              } else {
                                L50: {
                                  if ((var6 ^ -1) == -1) {
                                    break L50;
                                  } else {
                                    sc.field_f = sc.field_f ^ var6;
                                    if (var26 == 0) {
                                      break L48;
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                sc.field_f = 0;
                                if (var26 == 0) {
                                  break L48;
                                } else {
                                  break L49;
                                }
                              }
                            }
                            if ((var6 ^ -1) != (param0.field_fc ^ -1)) {
                              var5 = 1;
                              param0.field_fc = var6;
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                      L51: {
                        stackOut_118_0 = (mo) (var28);
                        stackIn_120_0 = stackOut_118_0;
                        stackIn_119_0 = stackOut_118_0;
                        if (var4_int == 0) {
                          stackOut_120_0 = (mo) ((Object) stackIn_120_0);
                          stackOut_120_1 = 0;
                          stackIn_121_0 = stackOut_120_0;
                          stackIn_121_1 = stackOut_120_1;
                          break L51;
                        } else {
                          stackOut_119_0 = (mo) ((Object) stackIn_119_0);
                          stackOut_119_1 = 1;
                          stackIn_121_0 = stackOut_119_0;
                          stackIn_121_1 = stackOut_119_1;
                          break L51;
                        }
                      }
                      L52: {
                        L53: {
                          stackIn_121_0.field_Z = stackIn_121_1 != 0;
                          if (!param1) {
                            break L53;
                          } else {
                            L54: {
                              if (-1 == (var6 ^ -1)) {
                                break L54;
                              } else {
                                L55: {
                                  stackOut_123_0 = (mo) (var28);
                                  stackIn_125_0 = stackOut_123_0;
                                  stackIn_124_0 = stackOut_123_0;
                                  if (-1 == (var6 & sc.field_f ^ -1)) {
                                    stackOut_125_0 = (mo) ((Object) stackIn_125_0);
                                    stackOut_125_1 = 0;
                                    stackIn_126_0 = stackOut_125_0;
                                    stackIn_126_1 = stackOut_125_1;
                                    break L55;
                                  } else {
                                    stackOut_124_0 = (mo) ((Object) stackIn_124_0);
                                    stackOut_124_1 = 1;
                                    stackIn_126_0 = stackOut_124_0;
                                    stackIn_126_1 = stackOut_124_1;
                                    break L55;
                                  }
                                }
                                stackIn_126_0.field_Ab = stackIn_126_1 != 0;
                                if (var26 == 0) {
                                  break L52;
                                } else {
                                  break L54;
                                }
                              }
                            }
                            L56: {
                              stackOut_127_0 = (mo) (var28);
                              stackIn_129_0 = stackOut_127_0;
                              stackIn_128_0 = stackOut_127_0;
                              if (-1 != (sc.field_f ^ -1)) {
                                stackOut_129_0 = (mo) ((Object) stackIn_129_0);
                                stackOut_129_1 = 0;
                                stackIn_130_0 = stackOut_129_0;
                                stackIn_130_1 = stackOut_129_1;
                                break L56;
                              } else {
                                stackOut_128_0 = (mo) ((Object) stackIn_128_0);
                                stackOut_128_1 = 1;
                                stackIn_130_0 = stackOut_128_0;
                                stackIn_130_1 = stackOut_128_1;
                                break L56;
                              }
                            }
                            stackIn_130_0.field_Ab = stackIn_130_1 != 0;
                            if (var26 == 0) {
                              break L52;
                            } else {
                              break L53;
                            }
                          }
                        }
                        L57: {
                          stackOut_131_0 = (mo) (var28);
                          stackIn_133_0 = stackOut_131_0;
                          stackIn_132_0 = stackOut_131_0;
                          if ((var6 & param0.field_fc) == 0) {
                            stackOut_133_0 = (mo) ((Object) stackIn_133_0);
                            stackOut_133_1 = 0;
                            stackIn_134_0 = stackOut_133_0;
                            stackIn_134_1 = stackOut_133_1;
                            break L57;
                          } else {
                            stackOut_132_0 = (mo) ((Object) stackIn_132_0);
                            stackOut_132_1 = 1;
                            stackIn_134_0 = stackOut_132_0;
                            stackIn_134_1 = stackOut_132_1;
                            break L57;
                          }
                        }
                        stackIn_134_0.field_Ab = stackIn_134_1 != 0;
                        break L52;
                      }
                      var6++;
                      if (var26 == 0) {
                        continue L45;
                      } else {
                        break L47;
                      }
                    }
                  }
                }
                stackOut_136_0 = param1;
                stackIn_137_0 = stackOut_136_0 ? 1 : 0;
                break L46;
              }
              L58: {
                L59: {
                  if (stackIn_137_0 == 0) {
                    break L59;
                  } else {
                    if ((r.field_f ^ -1) < -2) {
                      var6 = 0;
                      L60: while (true) {
                        if (r.field_f + 1 <= var6) {
                          break L59;
                        } else {
                          var29 = ma.field_b[3][var6];
                          stackOut_142_0 = var4_int;
                          stackIn_164_0 = stackOut_142_0;
                          stackIn_143_0 = stackOut_142_0;
                          if (var26 != 0) {
                            break L58;
                          } else {
                            L61: {
                              if (stackIn_143_0 == 0) {
                                break L61;
                              } else {
                                if (var29.field_T != 0) {
                                  pb.field_h = var6;
                                  break L61;
                                } else {
                                  break L61;
                                }
                              }
                            }
                            L62: {
                              if (!var29.field_pb) {
                                break L62;
                              } else {
                                if (0 < var6) {
                                  L63: {
                                    if (null != qp.field_s) {
                                      stackOut_152_0 = qp.field_s[-1 + var6];
                                      stackIn_153_0 = stackOut_152_0;
                                      break L63;
                                    } else {
                                      stackOut_151_0 = null;
                                      stackIn_153_0 = (String) ((Object) stackOut_151_0);
                                      break L63;
                                    }
                                  }
                                  var8_ref = stackIn_153_0;
                                  if (var8_ref != null) {
                                    ui.field_j = var8_ref;
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                } else {
                                  break L62;
                                }
                              }
                            }
                            L64: {
                              stackOut_156_0 = (mo) (var29);
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_157_0 = stackOut_156_0;
                              if (var4_int == 0) {
                                stackOut_158_0 = (mo) ((Object) stackIn_158_0);
                                stackOut_158_1 = 0;
                                stackIn_159_0 = stackOut_158_0;
                                stackIn_159_1 = stackOut_158_1;
                                break L64;
                              } else {
                                stackOut_157_0 = (mo) ((Object) stackIn_157_0);
                                stackOut_157_1 = 1;
                                stackIn_159_0 = stackOut_157_0;
                                stackIn_159_1 = stackOut_157_1;
                                break L64;
                              }
                            }
                            L65: {
                              stackIn_159_0.field_Z = stackIn_159_1 != 0;
                              stackOut_159_0 = (mo) (var29);
                              stackIn_161_0 = stackOut_159_0;
                              stackIn_160_0 = stackOut_159_0;
                              if (pb.field_h != var6) {
                                stackOut_161_0 = (mo) ((Object) stackIn_161_0);
                                stackOut_161_1 = 0;
                                stackIn_162_0 = stackOut_161_0;
                                stackIn_162_1 = stackOut_161_1;
                                break L65;
                              } else {
                                stackOut_160_0 = (mo) ((Object) stackIn_160_0);
                                stackOut_160_1 = 1;
                                stackIn_162_0 = stackOut_160_0;
                                stackIn_162_1 = stackOut_160_1;
                                break L65;
                              }
                            }
                            stackIn_162_0.field_Ab = stackIn_162_1 != 0;
                            var6++;
                            if (var26 == 0) {
                              continue L60;
                            } else {
                              break L59;
                            }
                          }
                        }
                      }
                    } else {
                      break L59;
                    }
                  }
                }
                var6 = 0;
                stackOut_163_0 = 0;
                stackIn_164_0 = stackOut_163_0;
                break L58;
              }
              var7 = stackIn_164_0;
              L66: while (true) {
                L67: {
                  L68: {
                    if ((var7 ^ -1) <= (kj.field_h ^ -1)) {
                      break L68;
                    } else {
                      var27 = ma.field_b[4 + var7];
                      var8 = ma.field_b[4 + var7];
                      stackOut_166_0 = param1;
                      stackIn_356_0 = stackOut_166_0 ? 1 : 0;
                      stackIn_167_0 = stackOut_166_0;
                      if (var26 != 0) {
                        break L67;
                      } else {
                        L69: {
                          if (!stackIn_167_0) {
                            stackOut_169_0 = 0;
                            stackIn_170_0 = stackOut_169_0;
                            break L69;
                          } else {
                            stackOut_168_0 = -1;
                            stackIn_170_0 = stackOut_168_0;
                            break L69;
                          }
                        }
                        var9 = stackIn_170_0;
                        L70: while (true) {
                          L71: {
                            L72: {
                              if (var9 >= var27.length + -1) {
                                break L72;
                              } else {
                                var10 = 0;
                                var11 = 0;
                                var12 = 0;
                                var13 = 0;
                                var14 = 0;
                                var15 = 0;
                                stackOut_172_0 = var4_int;
                                stackIn_354_0 = stackOut_172_0;
                                stackIn_173_0 = stackOut_172_0;
                                if (var26 != 0) {
                                  break L71;
                                } else {
                                  L73: {
                                    if (stackIn_173_0 == 0) {
                                      break L73;
                                    } else {
                                      if (0 <= var9) {
                                        L74: {
                                          if (na.field_J == null) {
                                            break L74;
                                          } else {
                                            if (null == na.field_J[var7]) {
                                              break L74;
                                            } else {
                                              if (((ql.field_c ^ -1) & na.field_J[var7][var9] ^ -1) < -1) {
                                                var14 = 1;
                                                var15 = vl.a((ql.field_c ^ -1) & na.field_J[var7][var9], (byte) -103);
                                                break L74;
                                              } else {
                                                break L74;
                                              }
                                            }
                                          }
                                        }
                                        L75: {
                                          if (null == ch.field_g) {
                                            break L75;
                                          } else {
                                            if (ch.field_g[var7] == null) {
                                              break L75;
                                            } else {
                                              if (0 < vl.field_h) {
                                                break L75;
                                              } else {
                                                if (ch.field_g[var7][var9]) {
                                                  var10 = 1;
                                                  break L75;
                                                } else {
                                                  break L75;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L76: {
                                          if (null == sd.field_G) {
                                            break L76;
                                          } else {
                                            if (null == sd.field_G[var7]) {
                                              break L76;
                                            } else {
                                              L77: {
                                                var16 = sd.field_G[var7][var9];
                                                if (0 == var16) {
                                                  break L77;
                                                } else {
                                                  if (bo.field_e) {
                                                    break L77;
                                                  } else {
                                                    if (-1 <= (vl.field_h ^ -1)) {
                                                      var10 = 1;
                                                      break L77;
                                                    } else {
                                                      break L77;
                                                    }
                                                  }
                                                }
                                              }
                                              if (-1 <= (var16 ^ -1)) {
                                                break L76;
                                              } else {
                                                if ((bc.field_e ^ -1) <= (var16 ^ -1)) {
                                                  break L76;
                                                } else {
                                                  var12 = 1;
                                                  break L76;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L78: {
                                          if (null == r.field_c) {
                                            break L78;
                                          } else {
                                            if (r.field_c[var7] != null) {
                                              L79: {
                                                var16 = r.field_c[var7][var9];
                                                if (-1 == (var16 ^ -1)) {
                                                  break L79;
                                                } else {
                                                  if (bo.field_e) {
                                                    break L79;
                                                  } else {
                                                    if (vl.field_h > 0) {
                                                      break L79;
                                                    } else {
                                                      var10 = 1;
                                                      break L79;
                                                    }
                                                  }
                                                }
                                              }
                                              if ((var16 ^ -1) >= -1) {
                                                break L78;
                                              } else {
                                                if ((dm.field_Zb ^ -1) <= (var16 ^ -1)) {
                                                  break L78;
                                                } else {
                                                  var11 = 1;
                                                  break L78;
                                                }
                                              }
                                            } else {
                                              break L78;
                                            }
                                          }
                                        }
                                        L80: {
                                          L81: {
                                            if (!param1) {
                                              break L81;
                                            } else {
                                              if (mb.field_k == null) {
                                                break L81;
                                              } else {
                                                if (null == mb.field_k[var7]) {
                                                  break L81;
                                                } else {
                                                  if (!mb.field_k[var7][var9]) {
                                                    break L81;
                                                  } else {
                                                    stackOut_211_0 = 1;
                                                    stackIn_213_0 = stackOut_211_0;
                                                    break L80;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          stackOut_212_0 = 0;
                                          stackIn_213_0 = stackOut_212_0;
                                          break L80;
                                        }
                                        var13 = stackIn_213_0;
                                        break L73;
                                      } else {
                                        break L73;
                                      }
                                    }
                                  }
                                  L82: {
                                    if (-3 < (kj.field_q ^ -1)) {
                                      break L82;
                                    } else {
                                      if (!lc.field_m[12]) {
                                        break L82;
                                      } else {
                                        var13 = 0;
                                        var10 = 0;
                                        var14 = 0;
                                        var11 = 0;
                                        var12 = 0;
                                        break L82;
                                      }
                                    }
                                  }
                                  L83: {
                                    L84: {
                                      dj.field_l = true;
                                      if (var10 != 0) {
                                        break L84;
                                      } else {
                                        if (var11 != 0) {
                                          break L84;
                                        } else {
                                          if (var12 != 0) {
                                            break L84;
                                          } else {
                                            if (var13 != 0) {
                                              break L84;
                                            } else {
                                              if (var14 == 0) {
                                                stackOut_224_0 = 0;
                                                stackIn_225_0 = stackOut_224_0;
                                                break L83;
                                              } else {
                                                break L84;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    stackOut_223_0 = 1;
                                    stackIn_225_0 = stackOut_223_0;
                                    break L83;
                                  }
                                  L85: {
                                    var16 = stackIn_225_0;
                                    if (var16 != 0) {
                                      break L85;
                                    } else {
                                      if (0 > var9) {
                                        break L85;
                                      } else {
                                        if (null == iq.field_b) {
                                          break L85;
                                        } else {
                                          L86: {
                                            if (!param1) {
                                              break L86;
                                            } else {
                                              if (la.field_k) {
                                                break L85;
                                              } else {
                                                break L86;
                                              }
                                            }
                                          }
                                          L87: {
                                            lp.field_p = false;
                                            if (null != rl.field_v) {
                                              break L87;
                                            } else {
                                              rl.field_v = new byte[kj.field_h];
                                              ll.field_c = new boolean[kj.field_h];
                                              break L87;
                                            }
                                          }
                                          dj.field_l = false;
                                          var17_int = 0;
                                          L88: while (true) {
                                            L89: {
                                              L90: {
                                                if ((var17_int ^ -1) <= (var7 ^ -1)) {
                                                  break L90;
                                                } else {
                                                  ll.field_c[var17_int] = false;
                                                  var17_int++;
                                                  if (var26 != 0) {
                                                    break L89;
                                                  } else {
                                                    if (var26 == 0) {
                                                      continue L88;
                                                    } else {
                                                      break L90;
                                                    }
                                                  }
                                                }
                                              }
                                              bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                                              break L89;
                                            }
                                            L91: {
                                              if (-3 < (kj.field_q ^ -1)) {
                                                break L91;
                                              } else {
                                                if (!lc.field_m[12]) {
                                                  break L91;
                                                } else {
                                                  dj.field_l = true;
                                                  break L91;
                                                }
                                              }
                                            }
                                            if (!dj.field_l) {
                                              var16 = 1;
                                              break L85;
                                            } else {
                                              break L85;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L92: {
                                    L93: {
                                      var17 = var27[var9 + 1];
                                      if (var4_int == 0) {
                                        break L93;
                                      } else {
                                        if (0 == var17.field_T) {
                                          break L93;
                                        } else {
                                          L94: {
                                            if (param1) {
                                              break L94;
                                            } else {
                                              if (var16 != 0) {
                                                break L93;
                                              } else {
                                                if (param0.field_Zb[var7] == (byte)var9) {
                                                  break L93;
                                                } else {
                                                  var5 = 1;
                                                  param0.field_Zb[var7] = (byte)var9;
                                                  if (var26 == 0) {
                                                    break L93;
                                                  } else {
                                                    break L94;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          L95: {
                                            if (-1 == var9) {
                                              break L95;
                                            } else {
                                              tg.field_a[(var6 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6 + var9) / 8], 1 << tq.b(var6 + var9, 7));
                                              if (var26 == 0) {
                                                break L93;
                                              } else {
                                                break L95;
                                              }
                                            }
                                          }
                                          var18 = var6;
                                          L96: while (true) {
                                            if ((var18 ^ -1) <= (var27.length + var6 + -1 ^ -1)) {
                                              break L93;
                                            } else {
                                              tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], 1 << tq.b(var18, 7) ^ -1);
                                              var18++;
                                              if (var26 != 0) {
                                                break L92;
                                              } else {
                                                if (var26 == 0) {
                                                  continue L96;
                                                } else {
                                                  break L93;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    if (!param1) {
                                      break L92;
                                    } else {
                                      if (var16 != 0) {
                                        tg.field_a[(var9 - -var6) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6) / 8], 1 << tq.b(var9 + var6, 7) ^ -1);
                                        break L92;
                                      } else {
                                        break L92;
                                      }
                                    }
                                  }
                                  L97: {
                                    if (var9 < 0) {
                                      break L97;
                                    } else {
                                      if (!var17.field_pb) {
                                        break L97;
                                      } else {
                                        L98: {
                                          if (ul.field_m == null) {
                                            var18_ref = null;
                                            break L98;
                                          } else {
                                            if (null == ul.field_m[var7]) {
                                              var18_ref = null;
                                              break L98;
                                            } else {
                                              var18_ref = ul.field_m[var7][var9];
                                              break L98;
                                            }
                                          }
                                        }
                                        L99: {
                                          if (kp.field_n != null) {
                                            if (kp.field_n[var7] != null) {
                                              var19_ref = kp.field_n[var7][var9];
                                              break L99;
                                            } else {
                                              var19_ref = null;
                                              break L99;
                                            }
                                          } else {
                                            var19_ref = null;
                                            break L99;
                                          }
                                        }
                                        L100: {
                                          var20 = null;
                                          if (var19_ref == null) {
                                            break L100;
                                          } else {
                                            if (var19_ref.equals(var18_ref)) {
                                              break L100;
                                            } else {
                                              var20 = var19_ref;
                                              break L100;
                                            }
                                          }
                                        }
                                        L101: {
                                          var21 = null;
                                          if (var13 == 0) {
                                            if (var10 == 0) {
                                              L102: {
                                                if (var11 == 0) {
                                                  break L102;
                                                } else {
                                                  var22_int = r.field_c[var7][var9] + -dm.field_Zb;
                                                  if (-2 != (var22_int ^ -1)) {
                                                    var21 = vl.a(sc.field_c, new String[]{Integer.toString(var22_int)}, 2);
                                                    break L102;
                                                  } else {
                                                    var21 = uq.field_a;
                                                    break L102;
                                                  }
                                                }
                                              }
                                              L103: {
                                                if (var12 != 0) {
                                                  L104: {
                                                    var30 = vl.a(dm.field_Rb, new String[]{Integer.toString(bc.field_e), Integer.toString(sd.field_G[var7][var9])}, 2);
                                                    var21 = var30;
                                                    var21 = var30;
                                                    if (var21 == null) {
                                                      break L104;
                                                    } else {
                                                      var21 = (String) (var21) + "<br>" + var30;
                                                      if (var26 == 0) {
                                                        break L103;
                                                      } else {
                                                        break L104;
                                                      }
                                                    }
                                                  }
                                                  var21 = var30;
                                                  break L103;
                                                } else {
                                                  break L103;
                                                }
                                              }
                                              if (var14 != 0) {
                                                L105: {
                                                  var22_ref = eb.field_L;
                                                  if (-1 <= (var15 ^ -1)) {
                                                    break L105;
                                                  } else {
                                                    if (null == ki.field_o) {
                                                      break L105;
                                                    } else {
                                                      if (var15 > ki.field_o.length) {
                                                        break L105;
                                                      } else {
                                                        if (null != ki.field_o[-1 + var15]) {
                                                          var22_ref = ki.field_o[-1 + var15][0];
                                                          break L105;
                                                        } else {
                                                          break L105;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                L106: {
                                                  if (var21 == null) {
                                                    break L106;
                                                  } else {
                                                    var21 = (String) (var21) + "<br>" + var22_ref;
                                                    if (var26 == 0) {
                                                      break L101;
                                                    } else {
                                                      break L106;
                                                    }
                                                  }
                                                }
                                                var21 = var22_ref;
                                                break L101;
                                              } else {
                                                break L101;
                                              }
                                            } else {
                                              var21 = fa.field_Ub;
                                              break L101;
                                            }
                                          } else {
                                            var21 = oj.field_H;
                                            break L101;
                                          }
                                        }
                                        L107: {
                                          if (var4_int == 0) {
                                            break L107;
                                          } else {
                                            if (!dj.field_l) {
                                              L108: {
                                                var22_ref = null;
                                                if (lp.field_p) {
                                                  var22_ref = "</col>" + gi.field_n + "<col=A00000>";
                                                  var25 = var22_ref;
                                                  var22_ref = var25;
                                                  var25 = var22_ref;
                                                  var22_ref = var25;
                                                  var21 = var22_ref;
                                                  break L108;
                                                } else {
                                                  break L108;
                                                }
                                              }
                                              var23 = 0;
                                              var24 = 0;
                                              L109: while (true) {
                                                L110: {
                                                  L111: {
                                                    if ((var7 ^ -1) >= (var24 ^ -1)) {
                                                      break L111;
                                                    } else {
                                                      stackOut_310_0 = ll.field_c[var24];
                                                      stackIn_318_0 = stackOut_310_0 ? 1 : 0;
                                                      stackIn_311_0 = stackOut_310_0;
                                                      if (var26 != 0) {
                                                        break L110;
                                                      } else {
                                                        L112: {
                                                          if (stackIn_311_0) {
                                                            L113: {
                                                              var25 = "</col>" + cf.field_f[var24] + "<col=A00000>";
                                                              var22_ref = var25;
                                                              var22_ref = var25;
                                                              if (var22_ref != null) {
                                                                break L113;
                                                              } else {
                                                                var22_ref = var25;
                                                                if (var26 == 0) {
                                                                  break L112;
                                                                } else {
                                                                  break L113;
                                                                }
                                                              }
                                                            }
                                                            var22_ref = var22_ref + ", " + var25;
                                                            var21 = var22_ref;
                                                            var21 = var22_ref;
                                                            var23 = 1;
                                                            break L112;
                                                          } else {
                                                            break L112;
                                                          }
                                                        }
                                                        var24++;
                                                        if (var26 == 0) {
                                                          continue L109;
                                                        } else {
                                                          break L111;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  stackOut_317_0 = var23;
                                                  stackIn_318_0 = stackOut_317_0;
                                                  break L110;
                                                }
                                                L114: {
                                                  if (stackIn_318_0 != 0) {
                                                    break L114;
                                                  } else {
                                                    var21 = vl.a(io.field_a, new String[]{var22_ref}, 2);
                                                    if (var26 == 0) {
                                                      break L107;
                                                    } else {
                                                      break L114;
                                                    }
                                                  }
                                                }
                                                var21 = kb.field_q + var22_ref;
                                                break L107;
                                              }
                                            } else {
                                              break L107;
                                            }
                                          }
                                        }
                                        L115: {
                                          if (var21 != null) {
                                            L116: {
                                              var21 = "<col=A00000>" + (String) (var21);
                                              var31 = sa.a((String) (var21), param3 + 123, "<br>", "<br><col=A00000>");
                                              if (var20 == null) {
                                                break L116;
                                              } else {
                                                var20 = (String) (var20) + "<br>" + var31;
                                                if (var26 == 0) {
                                                  break L115;
                                                } else {
                                                  break L116;
                                                }
                                              }
                                            }
                                            var20 = var31;
                                            break L115;
                                          } else {
                                            break L115;
                                          }
                                        }
                                        if (var20 == null) {
                                          break L97;
                                        } else {
                                          ui.field_j = (String) (var20);
                                          break L97;
                                        }
                                      }
                                    }
                                  }
                                  L117: {
                                    L118: {
                                      L119: {
                                        L120: {
                                          L121: {
                                            if (!param1) {
                                              break L121;
                                            } else {
                                              L122: {
                                                if (var9 != -1) {
                                                  break L122;
                                                } else {
                                                  var17.field_Ab = true;
                                                  var18 = var6;
                                                  L123: while (true) {
                                                    L124: {
                                                      if (-1 + (var27.length + var6) <= var18) {
                                                        break L124;
                                                      } else {
                                                        stackOut_332_0 = (mo) (var17);
                                                        stackOut_332_1 = var17.field_Ab;
                                                        stackOut_332_2 = -1;
                                                        stackOut_332_3 = tg.field_a[var18 / 8] & 1 << (7 & var18) ^ -1;
                                                        stackIn_344_0 = stackOut_332_0;
                                                        stackIn_344_1 = stackOut_332_1 ? 1 : 0;
                                                        stackIn_344_2 = stackOut_332_2;
                                                        stackIn_344_3 = stackOut_332_3;
                                                        stackIn_333_0 = stackOut_332_0;
                                                        stackIn_333_1 = stackOut_332_1;
                                                        stackIn_333_2 = stackOut_332_2;
                                                        stackIn_333_3 = stackOut_332_3;
                                                        if (var26 != 0) {
                                                          break L120;
                                                        } else {
                                                          L125: {
                                                            stackOut_333_0 = (mo) ((Object) stackIn_333_0);
                                                            stackOut_333_1 = stackIn_333_1;
                                                            stackIn_335_0 = stackOut_333_0;
                                                            stackIn_335_1 = stackOut_333_1;
                                                            stackIn_334_0 = stackOut_333_0;
                                                            stackIn_334_1 = stackOut_333_1;
                                                            if (stackIn_333_2 != stackIn_333_3) {
                                                              stackOut_335_0 = (mo) ((Object) stackIn_335_0);
                                                              stackOut_335_1 = stackIn_335_1;
                                                              stackOut_335_2 = 0;
                                                              stackIn_336_0 = stackOut_335_0;
                                                              stackIn_336_1 = stackOut_335_1;
                                                              stackIn_336_2 = stackOut_335_2;
                                                              break L125;
                                                            } else {
                                                              stackOut_334_0 = (mo) ((Object) stackIn_334_0);
                                                              stackOut_334_1 = stackIn_334_1;
                                                              stackOut_334_2 = 1;
                                                              stackIn_336_0 = stackOut_334_0;
                                                              stackIn_336_1 = stackOut_334_1;
                                                              stackIn_336_2 = stackOut_334_2;
                                                              break L125;
                                                            }
                                                          }
                                                          stackIn_336_0.field_Ab = stackIn_336_1 & stackIn_336_2 != 0;
                                                          var18++;
                                                          if (var26 == 0) {
                                                            continue L123;
                                                          } else {
                                                            break L124;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (var26 == 0) {
                                                      break L117;
                                                    } else {
                                                      break L122;
                                                    }
                                                  }
                                                }
                                              }
                                              L126: {
                                                stackOut_338_0 = (mo) (var17);
                                                stackIn_340_0 = stackOut_338_0;
                                                stackIn_339_0 = stackOut_338_0;
                                                if (0 == (tg.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7))) {
                                                  stackOut_340_0 = (mo) ((Object) stackIn_340_0);
                                                  stackOut_340_1 = 0;
                                                  stackIn_341_0 = stackOut_340_0;
                                                  stackIn_341_1 = stackOut_340_1;
                                                  break L126;
                                                } else {
                                                  stackOut_339_0 = (mo) ((Object) stackIn_339_0);
                                                  stackOut_339_1 = 1;
                                                  stackIn_341_0 = stackOut_339_0;
                                                  stackIn_341_1 = stackOut_339_1;
                                                  break L126;
                                                }
                                              }
                                              stackIn_341_0.field_Ab = stackIn_341_1 != 0;
                                              if (var26 == 0) {
                                                break L117;
                                              } else {
                                                break L121;
                                              }
                                            }
                                          }
                                          stackOut_342_0 = (mo) (var17);
                                          stackIn_346_0 = stackOut_342_0;
                                          stackIn_343_0 = stackOut_342_0;
                                          if (!dj.field_l) {
                                            break L119;
                                          } else {
                                            stackOut_343_0 = (mo) ((Object) stackIn_343_0);
                                            stackOut_343_1 = param0.field_Zb[var7] ^ -1;
                                            stackOut_343_2 = (byte)var9;
                                            stackOut_343_3 = -1;
                                            stackIn_344_0 = stackOut_343_0;
                                            stackIn_344_1 = stackOut_343_1;
                                            stackIn_344_2 = stackOut_343_2;
                                            stackIn_344_3 = stackOut_343_3;
                                            break L120;
                                          }
                                        }
                                        stackOut_344_0 = (mo) ((Object) stackIn_344_0);
                                        stackIn_346_0 = stackOut_344_0;
                                        stackIn_345_0 = stackOut_344_0;
                                        if (stackIn_344_1 != (stackIn_344_2 ^ stackIn_344_3)) {
                                          break L119;
                                        } else {
                                          stackOut_345_0 = (mo) ((Object) stackIn_345_0);
                                          stackOut_345_1 = 1;
                                          stackIn_347_0 = stackOut_345_0;
                                          stackIn_347_1 = stackOut_345_1;
                                          break L118;
                                        }
                                      }
                                      stackOut_346_0 = (mo) ((Object) stackIn_346_0);
                                      stackOut_346_1 = 0;
                                      stackIn_347_0 = stackOut_346_0;
                                      stackIn_347_1 = stackOut_346_1;
                                      break L118;
                                    }
                                    stackIn_347_0.field_Ab = stackIn_347_1 != 0;
                                    break L117;
                                  }
                                  L127: {
                                    L128: {
                                      stackOut_348_0 = (mo) (var17);
                                      stackIn_351_0 = stackOut_348_0;
                                      stackIn_349_0 = stackOut_348_0;
                                      if (var4_int == 0) {
                                        break L128;
                                      } else {
                                        stackOut_349_0 = (mo) ((Object) stackIn_349_0);
                                        stackIn_351_0 = stackOut_349_0;
                                        stackIn_350_0 = stackOut_349_0;
                                        if (var16 != 0) {
                                          break L128;
                                        } else {
                                          stackOut_350_0 = (mo) ((Object) stackIn_350_0);
                                          stackOut_350_1 = 1;
                                          stackIn_352_0 = stackOut_350_0;
                                          stackIn_352_1 = stackOut_350_1;
                                          break L127;
                                        }
                                      }
                                    }
                                    stackOut_351_0 = (mo) ((Object) stackIn_351_0);
                                    stackOut_351_1 = 0;
                                    stackIn_352_0 = stackOut_351_0;
                                    stackIn_352_1 = stackOut_351_1;
                                    break L127;
                                  }
                                  stackIn_352_0.field_Z = stackIn_352_1 != 0;
                                  var9++;
                                  if (var26 == 0) {
                                    continue L70;
                                  } else {
                                    break L72;
                                  }
                                }
                              }
                            }
                            stackOut_353_0 = var6 + (od.field_Gb[var7] & 255);
                            stackIn_354_0 = stackOut_353_0;
                            break L71;
                          }
                          var6 = stackIn_354_0;
                          var7++;
                          if (var26 == 0) {
                            continue L66;
                          } else {
                            break L68;
                          }
                        }
                      }
                    }
                  }
                  stackOut_355_0 = var5;
                  stackIn_356_0 = stackOut_355_0;
                  break L67;
                }
                L129: {
                  L130: {
                    if (stackIn_356_0 == 0) {
                      break L130;
                    } else {
                      if (!param1) {
                        og.b(param2, 115);
                        break L130;
                      } else {
                        break L129;
                      }
                    }
                  }
                  break L129;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L131: {
            var4 = decompiledCaughtException;
            stackOut_361_0 = (RuntimeException) (var4);
            stackOut_361_1 = new StringBuilder().append("ld.KA(");
            stackIn_363_0 = stackOut_361_0;
            stackIn_363_1 = stackOut_361_1;
            stackIn_362_0 = stackOut_361_0;
            stackIn_362_1 = stackOut_361_1;
            if (param0 == null) {
              stackOut_363_0 = (RuntimeException) ((Object) stackIn_363_0);
              stackOut_363_1 = (StringBuilder) ((Object) stackIn_363_1);
              stackOut_363_2 = "null";
              stackIn_364_0 = stackOut_363_0;
              stackIn_364_1 = stackOut_363_1;
              stackIn_364_2 = stackOut_363_2;
              break L131;
            } else {
              stackOut_362_0 = (RuntimeException) ((Object) stackIn_362_0);
              stackOut_362_1 = (StringBuilder) ((Object) stackIn_362_1);
              stackOut_362_2 = "{...}";
              stackIn_364_0 = stackOut_362_0;
              stackIn_364_1 = stackOut_362_1;
              stackIn_364_2 = stackOut_362_2;
              break L131;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_364_0), stackIn_364_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(long param0, cj param1, cj param2, cj param3, ld[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        fm var17 = null;
        fm var18 = null;
        Object stackIn_4_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_12_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var16 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Tb = -1;
        try {
          L0: {
            this.field_Qb = param5;
            this.field_Pb = param7;
            this.field_Fb = param4;
            this.field_Ob = this.field_Qb.length;
            var17 = param3.field_yb;
            var18 = var17;
            this.field_Jb = var18.field_r + (var18.field_C + 2);
            this.field_Nb = this.field_Ob * this.field_Jb;
            this.field_Vb = 0;
            this.field_Gb = new mo[this.field_Ob];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((this.field_Ob ^ -1) >= (var13 ^ -1)) {
                    break L3;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_13_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var16 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((ld) (this)).field_Pb[var13] <= 0) {
                          break L4;
                        } else {
                          param6[var13] = var11 + hm.a(-81, this.field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                          break L4;
                        }
                      }
                      L5: {
                        L6: {
                          var14 = null;
                          if (null != this.field_Fb[var13]) {
                            break L6;
                          } else {
                            if (-1 != this.field_Qb[var13]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var14 = tb.field_v;
                        break L5;
                      }
                      L7: {
                        this.field_Gb[var13] = new mo(0L, param2, (cj) null, param3, (ja) (var14), param6[var13]);
                        this.a((byte) 50, this.field_Gb[var13]);
                        var15 = var17.a(param6[var13]);
                        if (this.field_Vb >= var15) {
                          break L7;
                        } else {
                          this.field_Vb = var15;
                          break L7;
                        }
                      }
                      var13++;
                      if (var16 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.field_Vb = this.field_Vb + (tb.field_v.field_z + 10);
                stackOut_12_0 = this;
                stackIn_13_0 = stackOut_12_0;
                break L2;
              }
              this.b(12, 11183);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var10 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var10);
            stackOut_15_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          L9: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L9;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L9;
            }
          }
          L10: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L10;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L10;
            }
          }
          L11: {
            stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L11;
            }
          }
          L12: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L12;
            }
          }
          L13: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param6 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L13;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L13;
            }
          }
          L14: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param7 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L14;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L14;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        ld var4 = null;
        mo var5 = null;
        int var6 = 0;
        ld var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        mo stackIn_5_0 = null;
        mo stackIn_6_0 = null;
        mo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        mo stackOut_4_0 = null;
        mo stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mo stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_Gb.length <= var4_int) {
                break L2;
              } else {
                var5 = this.field_Gb[var4_int];
                stackOut_2_0 = var5.field_T;
                stackOut_2_1 = 1;
                stackIn_10_0 = stackOut_2_0;
                stackIn_10_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (var6 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (stackIn_3_0 != stackIn_3_1) {
                      break L3;
                    } else {
                      L4: {
                        this.a(-115, var4_int, param0, param2);
                        stackOut_4_0 = (mo) (var5);
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if ((var4_int ^ -1) != (this.field_Tb ^ -1)) {
                          stackOut_6_0 = (mo) ((Object) stackIn_6_0);
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L4;
                        } else {
                          stackOut_5_0 = (mo) ((Object) stackIn_5_0);
                          stackOut_5_1 = 1;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          break L4;
                        }
                      }
                      stackIn_7_0.field_Ab = stackIn_7_1 != 0;
                      break L3;
                    }
                  }
                  var4_int++;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param1;
            stackOut_9_1 = 255;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            break L1;
          }
          L5: {
            if (stackIn_10_0 == stackIn_10_1) {
              break L5;
            } else {
              this.field_Ib = (ld) null;
              break L5;
            }
          }
          L6: {
            if (this.field_Tb == -1) {
              break L6;
            } else {
              var7 = this.field_Fb[this.field_Tb];
              var4 = var7;
              if (var4 == null) {
                break L6;
              } else {
                var7.b(param0, 255, param2);
                break L6;
              }
            }
          }
          L7: {
            if ((this.field_Hb ^ -1) < -1) {
              this.b(this.field_Hb - 1, 11183);
              break L7;
            } else {
              break L7;
            }
          }
          return;
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jh var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
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
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (jh) null;
                ld.a((jh) null, false, 60, 111);
                break L1;
              }
            }
            L2: {
              var2 = mc.a(cq.a(0, param1), (byte) 26);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackOut_5_0 = (String) (var2);
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("ld.FA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          this.field_Sb = param4 * 2 + this.field_Vb;
          this.a(this.field_Nb, param1 - this.field_Nb, this.field_Sb, param0, -3344);
          if (param2 < -16) {
            break L0;
          } else {
            field_Kb = -29L;
            break L0;
          }
        }
        L1: {
          if ((param5 ^ -1) == (this.field_Mb ^ -1)) {
            break L1;
          } else {
            this.field_Mb = param5;
            this.b(this.field_Hb, 11183);
            break L1;
          }
        }
        var7 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if ((this.field_Ob ^ -1) >= (var7 ^ -1)) {
                break L4;
              } else {
                this.field_Gb[var7].a(param3, 2, this.field_Jb, this.field_Sb, 0, this.field_Gb[var7].field_Q, param4);
                var7++;
                if (var9 != 0) {
                  break L3;
                } else {
                  if (var9 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L5: {
              if (-1 == this.field_Tb) {
                break L5;
              } else {
                if (this.field_Fb[this.field_Tb] != null) {
                  var7 = this.field_Fb[this.field_Tb].field_Ob;
                  var8 = this.field_Q + this.field_Jb * (var7 + this.field_Tb);
                  L6: while (true) {
                    L7: {
                      if ((param1 ^ -1) <= (var8 ^ -1)) {
                        break L7;
                      } else {
                        var8 = var8 - this.field_Jb;
                        if (var9 != 0) {
                          break L5;
                        } else {
                          if (var9 == 0) {
                            continue L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    this.field_Fb[this.field_Tb].a(param0 - -this.field_Sb, var8, -87, param3, param4, this.field_Gb[this.field_Tb].field_qb);
                    break L5;
                  }
                } else {
                  break L3;
                }
              }
            }
            break L3;
          }
          return;
        }
    }

    final void c(byte param0) {
        mo[] var2 = null;
        int var3 = 0;
        mo var4 = null;
        int var5 = 0;
        mo[] var6 = null;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          var6 = this.field_Gb;
          var2 = var6;
          if (param0 >= 107) {
            break L0;
          } else {
            this.a(31, 97, 11, 57);
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          L2: {
            L3: {
              if ((var6.length ^ -1) >= (var3 ^ -1)) {
                break L3;
              } else {
                var4 = var6[var3];
                var4.field_T = 0;
                var4.field_Ab = false;
                var3++;
                if (var5 != 0) {
                  break L2;
                } else {
                  if (var5 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              if (this.field_Ib == null) {
                break L4;
              } else {
                this.field_Ib.c((byte) 108);
                this.field_Ib.a(true);
                break L4;
              }
            }
            this.field_Ib = null;
            this.field_Tb = -1;
            this.b(12, 11183);
            break L2;
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if ((param5 ^ -1) <= (ep.field_h ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (0 <= param3) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ep.field_i > param4) {
                      break L3;
                    } else {
                      if (param6 < ep.field_i) {
                        break L3;
                      } else {
                        if ((ep.field_i ^ -1) >= (param3 ^ -1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == -12628) {
                    L4: {
                      L5: {
                        var14 = param1 - param5;
                        if ((param5 ^ -1) == (param2 ^ -1)) {
                          break L5;
                        } else {
                          L6: {
                            L7: {
                              var10 = param4 << -1146515248;
                              var9_int = param4 << -1146515248;
                              var15 = -param5 + param2;
                              var11 = (param6 + -param4 << 1072950960) / var15;
                              var12 = (-param4 + param3 << -1368549136) / var14;
                              if (var11 >= var12) {
                                break L7;
                              } else {
                                var13 = 0;
                                if (var19 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L6;
                          }
                          L8: {
                            L9: {
                              L10: {
                                if (0 > param5) {
                                  L11: {
                                    if ((param2 ^ -1) <= -1) {
                                      break L11;
                                    } else {
                                      param5 = param2 + -param5;
                                      var9_int = var9_int + param5 * var11;
                                      var10 = var10 + var12 * param5;
                                      param5 = param2;
                                      if (var19 == 0) {
                                        break L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param5 = -param5;
                                  var9_int = var9_int + var11 * param5;
                                  var10 = var10 + var12 * param5;
                                  param5 = 0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var16 = ep.field_a[param5];
                              L12: while (true) {
                                if (param5 >= param2) {
                                  break L9;
                                } else {
                                  var17 = var9_int >> -641679056;
                                  stackOut_28_0 = var17 ^ -1;
                                  stackOut_28_1 = ep.field_i ^ -1;
                                  stackIn_47_0 = stackOut_28_0;
                                  stackIn_47_1 = stackOut_28_1;
                                  stackIn_29_0 = stackOut_28_0;
                                  stackIn_29_1 = stackOut_28_1;
                                  if (var19 != 0) {
                                    break L8;
                                  } else {
                                    L13: {
                                      if (stackIn_29_0 <= stackIn_29_1) {
                                        break L13;
                                      } else {
                                        L14: {
                                          var18 = -(var9_int >> 774828240) + (var10 >> 929719024);
                                          if (var18 != 0) {
                                            break L14;
                                          } else {
                                            if (0 > var17) {
                                              break L13;
                                            } else {
                                              if (ep.field_i > var17) {
                                                so.a(param7, true, var16 + var17, var18, param8);
                                                if (var19 == 0) {
                                                  break L13;
                                                } else {
                                                  break L14;
                                                }
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        L15: {
                                          if (ep.field_i <= var18 + var17) {
                                            var18 = -1 + -var17 + ep.field_i;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          if (var17 < 0) {
                                            break L16;
                                          } else {
                                            so.a(param7, true, var17 + var16, var18, param8);
                                            if (var19 == 0) {
                                              break L13;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        so.a(param7, true, var16, var18 + var17, param8);
                                        break L13;
                                      }
                                    }
                                    param5++;
                                    if ((param5 ^ -1) <= (ep.field_h ^ -1)) {
                                      decompiledRegionSelector0 = 4;
                                      break L0;
                                    } else {
                                      var9_int = var9_int + var11;
                                      var16 = var16 + oo.field_b;
                                      var10 = var10 + var12;
                                      if (var19 == 0) {
                                        continue L12;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var16 = param1 + -param2;
                            stackOut_46_0 = var16 ^ -1;
                            stackOut_46_1 = -1;
                            stackIn_47_0 = stackOut_46_0;
                            stackIn_47_1 = stackOut_46_1;
                            break L8;
                          }
                          L17: {
                            L18: {
                              if (stackIn_47_0 != stackIn_47_1) {
                                break L18;
                              } else {
                                var12 = 0;
                                var11 = 0;
                                if (var19 == 0) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              L20: {
                                var17 = param3 << -435078064;
                                if (var13 != 0) {
                                  break L20;
                                } else {
                                  var9_int = param6 << -592145584;
                                  if (var19 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              var10 = param6 << 1481707568;
                              break L19;
                            }
                            var11 = (var17 + -var9_int) / var16;
                            var12 = (-var10 + var17) / var16;
                            break L17;
                          }
                          if (var19 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L21: {
                        L22: {
                          if (param1 == param5) {
                            break L22;
                          } else {
                            L23: {
                              L24: {
                                var15 = -param2 + param1;
                                if (param6 > param4) {
                                  break L24;
                                } else {
                                  var10 = param4 << -94535408;
                                  var11 = (-param6 + param3 << -1923766992) / var15;
                                  var12 = (-param4 + param3 << 2106942736) / var14;
                                  var9_int = param6 << -630187568;
                                  if (var19 == 0) {
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              var10 = param6 << -1633525584;
                              var12 = (param3 - param6 << 1961646192) / var15;
                              var11 = (param3 + -param4 << -1401890096) / var14;
                              var9_int = param4 << 400811568;
                              break L23;
                            }
                            if (var19 == 0) {
                              break L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                        var11 = 0;
                        var10 = param6 << -548596304;
                        var12 = 0;
                        var9_int = param4 << -1663683536;
                        break L21;
                      }
                      var13 = 0;
                      if (0 <= param5) {
                        break L4;
                      } else {
                        param5 = Math.min(-param5, -param5 + param2);
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + var11 * param5;
                        param5 = 0;
                        break L4;
                      }
                    }
                    L25: {
                      if ((param5 ^ -1) <= -1) {
                        break L25;
                      } else {
                        param5 = -param5;
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + param5 * var11;
                        param5 = 0;
                        break L25;
                      }
                    }
                    var15 = ep.field_a[param5];
                    L26: while (true) {
                      L27: {
                        if ((param1 ^ -1) >= (param5 ^ -1)) {
                          break L27;
                        } else {
                          var16 = var9_int >> -1311822640;
                          if (var19 != 0) {
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            L28: {
                              if ((var16 ^ -1) > (ep.field_i ^ -1)) {
                                L29: {
                                  var17 = (var10 >> 227210128) - (var9_int >> 1022113424);
                                  if (0 != var17) {
                                    break L29;
                                  } else {
                                    if ((var16 ^ -1) > -1) {
                                      break L28;
                                    } else {
                                      if ((var16 ^ -1) > (ep.field_i ^ -1)) {
                                        so.a(param7, true, var16 - -var15, var17, param8);
                                        if (var19 == 0) {
                                          break L28;
                                        } else {
                                          break L29;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                L30: {
                                  if (var16 - -var17 >= ep.field_i) {
                                    var17 = -1 + -var16 + ep.field_i;
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                                L31: {
                                  if (var16 >= 0) {
                                    break L31;
                                  } else {
                                    so.a(param7, true, var15, var17 - -var16, param8);
                                    if (var19 == 0) {
                                      break L28;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                so.a(param7, true, var15 + var16, var17, param8);
                                break L28;
                              } else {
                                break L28;
                              }
                            }
                            param5++;
                            if ((ep.field_h ^ -1) < (param5 ^ -1)) {
                              var9_int = var9_int + var11;
                              var15 = var15 + oo.field_b;
                              var10 = var10 + var12;
                              if (var19 == 0) {
                                continue L26;
                              } else {
                                break L27;
                              }
                            } else {
                              decompiledRegionSelector0 = 6;
                              break L0;
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 7;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L32: {
            var9 = decompiledCaughtException;
            stackOut_85_0 = (RuntimeException) (var9);
            stackOut_85_1 = new StringBuilder().append("ld.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param7 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L32;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L32;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        int var2 = 0;
        mo[] var3 = null;
        int var4 = 0;
        mo var5 = null;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = 0;
        if (param0 == -26899) {
          var3 = this.field_Gb;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if ((var3.length ^ -1) >= (var4 ^ -1)) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    stackOut_4_0 = var2;
                    stackOut_4_1 = 0;
                    stackIn_11_0 = stackOut_4_0;
                    stackIn_11_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        stackOut_5_0 = stackIn_5_0;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (stackIn_5_1 == var5.field_T) {
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L4;
                        } else {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = 1;
                          stackIn_8_0 = stackOut_6_0;
                          stackIn_8_1 = stackOut_6_1;
                          break L4;
                        }
                      }
                      var2 = stackIn_8_0 | stackIn_8_1;
                      var4++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (var2 != 0) {
                  break L1;
                } else {
                  stackOut_10_0 = this.field_Tb;
                  stackOut_10_1 = -1;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                }
              }
              if ((stackIn_11_0 ^ stackIn_11_1) == 0) {
                break L1;
              } else {
                if (null == this.field_Fb[this.field_Tb]) {
                  break L1;
                } else {
                  L5: {
                    if (!this.field_Fb[this.field_Tb].k(param0 + 0)) {
                      stackOut_15_0 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      break L5;
                    } else {
                      stackOut_14_0 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      break L5;
                    }
                  }
                  var2 = stackIn_16_0;
                  break L1;
                }
              }
            }
            return var2 != 0;
          }
        } else {
          return false;
        }
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
        if (param0 >= -104) {
            jh var2 = (jh) null;
            ld.a((jh) null, false, 77, -3);
        }
        field_Ub = null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -93) {
            break L0;
          } else {
            this.field_Fb = (ld[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((param1 ^ -1) == (this.field_Tb ^ -1)) {
              break L2;
            } else {
              L3: {
                L4: {
                  if (this.field_Fb[param1] != null) {
                    break L4;
                  } else {
                    L5: {
                      if ((this.field_Qb[param1] ^ -1) == 0) {
                        break L5;
                      } else {
                        L6: {
                          var5 = 32768 | this.field_Qb[param1];
                          var6 = va.field_a;
                          if ((var6 ^ -1) != -1) {
                            break L6;
                          } else {
                            if (mh.field_c == null) {
                              break L6;
                            } else {
                              var6 = 1;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (-3 != (ga.a(var6, true) ^ -1)) {
                            break L7;
                          } else {
                            kp.a(var6, param3, 1, true);
                            break L7;
                          }
                        }
                        var8 = (String) null;
                        kb.a(var5, qf.field_g, param2, (String) null, va.field_a, 29602);
                        ii.a(va.field_a, (byte) -128, var5, qf.field_g, jj.field_M);
                        fh.b(31706);
                        lh.a(true);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L5;
                        }
                      }
                    }
                    qd.c(4024);
                    fh.b(31706);
                    if (var7 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.c((byte) 119);
                this.b(0, 11183);
                this.field_Tb = param1;
                this.field_Ib = this.field_Fb[this.field_Tb];
                an.a((byte) 75, this.field_Ib);
                this.field_Ib.b(12, 11183);
                if (var7 == 0) {
                  break L3;
                } else {
                  break L2;
                }
              }
              break L1;
            }
          }
          this.c((byte) 127);
          this.b(0, 11183);
          break L1;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (sj.field_p != 85) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Ib != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == this.field_Ib.field_Tb) {
                this.c((byte) 110);
                this.b(0, 11183);
                return true;
              } else {
                break L1;
              }
            }
          }
          return this.field_Ib.a(-119, param1, param2);
        } else {
          L2: {
            if (null != this.field_Ib) {
              break L2;
            } else {
              if (mj.field_Ib != this) {
                break L2;
              } else {
                if (var4 != 0) {
                  fh.b(31706);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            var5 = pn.field_d;
            var6 = -52 / ((param0 - 38) / 52);
            if (var5 <= 0) {
              break L3;
            } else {
              L4: {
                if (wc.field_I != var5) {
                  break L4;
                } else {
                  var5 = 63;
                  break L4;
                }
              }
              var7 = 0;
              L5: while (true) {
                if ((var7 ^ -1) <= (this.field_Pb.length ^ -1)) {
                  break L3;
                } else {
                  stackOut_19_0 = this.field_Pb[var7] ^ -1;
                  stackIn_24_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var8 != 0) {
                    return stackIn_24_0 != 0;
                  } else {
                    if (stackIn_20_0 != (var5 ^ -1)) {
                      var7++;
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L3;
                      }
                    } else {
                      this.a(-105, var7, param1, param2);
                      return true;
                    }
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final static void j(int param0) {
        q.b(72);
        if (param0 != 1481707568) {
            field_Kb = -107L;
        }
        bc.b(10);
        bk.field_i = null;
        fh.b(param0 + -1481675862);
    }

    static {
        field_Rb = new lf();
        field_Lb = "Buying or selling an account";
    }
}
