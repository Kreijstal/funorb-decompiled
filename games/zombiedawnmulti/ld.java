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
            ((ld) this).field_Hb = 69;
        }
        return ((ld) this).field_Sb - -(((ld) this).field_Ib != null ? ((ld) this).field_Ib.i(-29804) : 0);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ld) this).field_Hb = param0;
        int var5 = 0;
        if (param1 != 11183) {
            return;
        }
        while (var5 < ((ld) this).field_Ob) {
            var3 = ((ld) this).field_Jb * var5;
            var4 = ((ld) this).field_Hb * ((ld) this).field_Hb;
            ((ld) this).field_Gb[var5].field_Q = (var4 * (((ld) this).field_Mb + -((ld) this).field_qb) + (144 - var4) * var3) / 144;
            var5++;
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
        String var8_ref2 = null;
        int var4 = 0;
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
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        int var22_int = 0;
        String var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        mo var28 = null;
        mo var29 = null;
        mo[] var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        mo stackIn_20_0 = null;
        mo stackIn_21_0 = null;
        mo stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        mo stackIn_27_0 = null;
        mo stackIn_28_0 = null;
        mo stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_58_0 = 0;
        mo stackIn_74_0 = null;
        boolean stackIn_74_1 = false;
        mo stackIn_75_0 = null;
        boolean stackIn_75_1 = false;
        mo stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        int stackIn_76_2 = 0;
        mo stackIn_78_0 = null;
        mo stackIn_79_0 = null;
        mo stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        mo stackIn_82_0 = null;
        mo stackIn_83_0 = null;
        mo stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        mo stackIn_86_0 = null;
        mo stackIn_87_0 = null;
        mo stackIn_88_0 = null;
        mo stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_93_0 = 0;
        mo stackIn_106_0 = null;
        mo stackIn_107_0 = null;
        mo stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        mo stackIn_111_0 = null;
        mo stackIn_112_0 = null;
        mo stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        mo stackIn_115_0 = null;
        mo stackIn_116_0 = null;
        mo stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        mo stackIn_119_0 = null;
        mo stackIn_120_0 = null;
        mo stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        String stackIn_137_0 = null;
        mo stackIn_141_0 = null;
        mo stackIn_142_0 = null;
        mo stackIn_143_0 = null;
        int stackIn_143_1 = 0;
        mo stackIn_144_0 = null;
        mo stackIn_145_0 = null;
        mo stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        int stackIn_152_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_214_0 = 0;
        mo stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        mo stackIn_314_0 = null;
        boolean stackIn_314_1 = false;
        mo stackIn_315_0 = null;
        boolean stackIn_315_1 = false;
        int stackIn_315_2 = 0;
        mo stackIn_317_0 = null;
        mo stackIn_318_0 = null;
        mo stackIn_319_0 = null;
        int stackIn_319_1 = 0;
        mo stackIn_321_0 = null;
        mo stackIn_322_0 = null;
        mo stackIn_323_0 = null;
        mo stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        mo stackIn_326_0 = null;
        mo stackIn_327_0 = null;
        mo stackIn_328_0 = null;
        mo stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
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
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_53_0 = 0;
        mo stackOut_81_0 = null;
        mo stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        mo stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        mo stackOut_77_0 = null;
        mo stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        mo stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        mo stackOut_73_0 = null;
        boolean stackOut_73_1 = false;
        mo stackOut_75_0 = null;
        boolean stackOut_75_1 = false;
        int stackOut_75_2 = 0;
        mo stackOut_74_0 = null;
        boolean stackOut_74_1 = false;
        int stackOut_74_2 = 0;
        mo stackOut_85_0 = null;
        mo stackOut_86_0 = null;
        mo stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        mo stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_91_0 = 0;
        String stackOut_136_0 = null;
        Object stackOut_135_0 = null;
        mo stackOut_140_0 = null;
        mo stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        mo stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        mo stackOut_143_0 = null;
        mo stackOut_145_0 = null;
        int stackOut_145_1 = 0;
        mo stackOut_144_0 = null;
        int stackOut_144_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_203_0 = 0;
        mo stackOut_320_0 = null;
        mo stackOut_321_0 = null;
        mo stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        mo stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        mo stackOut_316_0 = null;
        mo stackOut_318_0 = null;
        int stackOut_318_1 = 0;
        mo stackOut_317_0 = null;
        int stackOut_317_1 = 0;
        mo stackOut_312_0 = null;
        boolean stackOut_312_1 = false;
        mo stackOut_314_0 = null;
        boolean stackOut_314_1 = false;
        int stackOut_314_2 = 0;
        mo stackOut_313_0 = null;
        boolean stackOut_313_1 = false;
        int stackOut_313_2 = 0;
        mo stackOut_325_0 = null;
        mo stackOut_326_0 = null;
        mo stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        mo stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        mo stackOut_105_0 = null;
        mo stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        mo stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        mo stackOut_118_0 = null;
        mo stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        mo stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        mo stackOut_114_0 = null;
        mo stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        mo stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        mo stackOut_110_0 = null;
        mo stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        mo stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        var8_ref2 = null;
        L0: {
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1) {
            L1: {
              if (la.field_k) {
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
              if (hl.b(0)) {
                if (!param0.field_Fb) {
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
          var5 = 0;
          if (param1) {
            break L3;
          } else {
            var6 = 0;
            L4: while (true) {
              if (var6 >= 5) {
                if (!ma.field_b[0][2].field_pb) {
                  break L3;
                } else {
                  if (hl.b(0)) {
                    ui.field_j = pd.field_f;
                    break L3;
                  } else {
                    ui.field_j = vl.a(vc.field_e, new String[1], 2);
                    break L3;
                  }
                }
              } else {
                L5: {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    if (ma.field_b[0][1 + var6].field_T == 0) {
                      break L5;
                    } else {
                      if (var6 == param0.field_Pb) {
                        break L5;
                      } else {
                        var5 = 1;
                        param0.field_Pb = var6;
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  stackOut_19_0 = ma.field_b[0][var6 - -1];
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_20_0 = stackOut_19_0;
                  if (var4 == 0) {
                    stackOut_21_0 = (mo) (Object) stackIn_21_0;
                    stackOut_21_1 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    stackIn_22_1 = stackOut_21_1;
                    break L6;
                  } else {
                    stackOut_20_0 = (mo) (Object) stackIn_20_0;
                    stackOut_20_1 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    stackIn_22_1 = stackOut_20_1;
                    break L6;
                  }
                }
                L7: {
                  stackIn_22_0.field_Z = stackIn_22_1 != 0;
                  if (tb.field_u) {
                    break L7;
                  } else {
                    if (var6 == 3) {
                      ma.field_b[0][1 + var6].field_Z = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  stackOut_26_0 = ma.field_b[0][1 + var6];
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  if (param0.field_Pb != var6) {
                    stackOut_28_0 = (mo) (Object) stackIn_28_0;
                    stackOut_28_1 = 0;
                    stackIn_29_0 = stackOut_28_0;
                    stackIn_29_1 = stackOut_28_1;
                    break L8;
                  } else {
                    stackOut_27_0 = (mo) (Object) stackIn_27_0;
                    stackOut_27_1 = 1;
                    stackIn_29_0 = stackOut_27_0;
                    stackIn_29_1 = stackOut_27_1;
                    break L8;
                  }
                }
                stackIn_29_0.field_Ab = stackIn_29_1 != 0;
                var6++;
                continue L4;
              }
            }
          }
        }
        L9: {
          if ((qo.field_r.length ^ -1) <= -3) {
            L10: {
              if (param1) {
                if ((tj.field_c ^ -1) != 0) {
                  stackOut_40_0 = 1;
                  stackIn_42_0 = stackOut_40_0;
                  break L10;
                } else {
                  stackOut_39_0 = 0;
                  stackIn_42_0 = stackOut_39_0;
                  break L10;
                }
              } else {
                stackOut_37_0 = 0;
                stackIn_42_0 = stackOut_37_0;
                break L10;
              }
            }
            L11: {
              var6 = stackIn_42_0;
              if (var6 == 0) {
                break L11;
              } else {
                var7 = tj.field_c;
                var8_int = 0;
                L12: while (true) {
                  if (var8_int >= fg.field_k.length) {
                    fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
                    break L11;
                  } else {
                    fg.field_k[var8_int] = (byte) 0;
                    var8_int++;
                    continue L12;
                  }
                }
              }
            }
            L13: {
              if (!param1) {
                stackOut_49_0 = 0;
                stackIn_50_0 = stackOut_49_0;
                break L13;
              } else {
                stackOut_48_0 = -1;
                stackIn_50_0 = stackOut_48_0;
                break L13;
              }
            }
            var7 = stackIn_50_0;
            L14: while (true) {
              if (qo.field_r.length <= var7) {
                break L9;
              } else {
                L15: {
                  if (var6 != 0) {
                    if (tj.field_c != var7) {
                      stackOut_56_0 = 1;
                      stackIn_58_0 = stackOut_56_0;
                      break L15;
                    } else {
                      stackOut_55_0 = 0;
                      stackIn_58_0 = stackOut_55_0;
                      break L15;
                    }
                  } else {
                    stackOut_53_0 = 0;
                    stackIn_58_0 = stackOut_53_0;
                    break L15;
                  }
                }
                L16: {
                  var8_int = stackIn_58_0;
                  if (var4 == 0) {
                    break L16;
                  } else {
                    if (ma.field_b[1][var7 - -1].field_T == 0) {
                      break L16;
                    } else {
                      if (param1) {
                        if (var6 != 0) {
                          break L16;
                        } else {
                          if ((var7 ^ -1) == 0) {
                            var9 = 0;
                            L17: while (true) {
                              if (var9 >= fg.field_k.length) {
                                break L16;
                              } else {
                                fg.field_k[var9] = (byte) 0;
                                var9++;
                                continue L17;
                              }
                            }
                          } else {
                            fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                            break L16;
                          }
                        }
                      } else {
                        var9 = qo.field_r[var7];
                        if (var9 == param0.field_mc) {
                          break L16;
                        } else {
                          param0.field_mc = var9;
                          var5 = 1;
                          break L16;
                        }
                      }
                    }
                  }
                }
                L18: {
                  if (!param1) {
                    L19: {
                      var9 = qo.field_r[var7];
                      stackOut_81_0 = ma.field_b[1][1 + var7];
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_82_0 = stackOut_81_0;
                      if (param0.field_mc != var9) {
                        stackOut_83_0 = (mo) (Object) stackIn_83_0;
                        stackOut_83_1 = 0;
                        stackIn_84_0 = stackOut_83_0;
                        stackIn_84_1 = stackOut_83_1;
                        break L19;
                      } else {
                        stackOut_82_0 = (mo) (Object) stackIn_82_0;
                        stackOut_82_1 = 1;
                        stackIn_84_0 = stackOut_82_0;
                        stackIn_84_1 = stackOut_82_1;
                        break L19;
                      }
                    }
                    stackIn_84_0.field_Ab = stackIn_84_1 != 0;
                    break L18;
                  } else {
                    if (var7 != -1) {
                      L20: {
                        stackOut_77_0 = ma.field_b[1][var7 + 1];
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_78_0 = stackOut_77_0;
                        if (-1 == (fg.field_k[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                          stackOut_79_0 = (mo) (Object) stackIn_79_0;
                          stackOut_79_1 = 0;
                          stackIn_80_0 = stackOut_79_0;
                          stackIn_80_1 = stackOut_79_1;
                          break L20;
                        } else {
                          stackOut_78_0 = (mo) (Object) stackIn_78_0;
                          stackOut_78_1 = 1;
                          stackIn_80_0 = stackOut_78_0;
                          stackIn_80_1 = stackOut_78_1;
                          break L20;
                        }
                      }
                      stackIn_80_0.field_Ab = stackIn_80_1 != 0;
                      break L18;
                    } else {
                      ma.field_b[1][var7 - -1].field_Ab = true;
                      var9 = 0;
                      L21: while (true) {
                        if (qo.field_r.length <= var9) {
                          break L18;
                        } else {
                          L22: {
                            stackOut_73_0 = ma.field_b[1][var7 - -1];
                            stackOut_73_1 = ma.field_b[1][var7 - -1].field_Ab;
                            stackIn_75_0 = stackOut_73_0;
                            stackIn_75_1 = stackOut_73_1;
                            stackIn_74_0 = stackOut_73_0;
                            stackIn_74_1 = stackOut_73_1;
                            if ((fg.field_k[var9 / 8] & 1 << (var9 & 7)) != 0) {
                              stackOut_75_0 = (mo) (Object) stackIn_75_0;
                              stackOut_75_1 = stackIn_75_1;
                              stackOut_75_2 = 0;
                              stackIn_76_0 = stackOut_75_0;
                              stackIn_76_1 = stackOut_75_1;
                              stackIn_76_2 = stackOut_75_2;
                              break L22;
                            } else {
                              stackOut_74_0 = (mo) (Object) stackIn_74_0;
                              stackOut_74_1 = stackIn_74_1;
                              stackOut_74_2 = 1;
                              stackIn_76_0 = stackOut_74_0;
                              stackIn_76_1 = stackOut_74_1;
                              stackIn_76_2 = stackOut_74_2;
                              break L22;
                            }
                          }
                          stackIn_76_0.field_Ab = stackIn_76_1 & stackIn_76_2 != 0;
                          var9++;
                          continue L21;
                        }
                      }
                    }
                  }
                }
                L23: {
                  L24: {
                    stackOut_85_0 = ma.field_b[1][var7 + 1];
                    stackIn_88_0 = stackOut_85_0;
                    stackIn_86_0 = stackOut_85_0;
                    if (var4 == 0) {
                      break L24;
                    } else {
                      stackOut_86_0 = (mo) (Object) stackIn_86_0;
                      stackIn_88_0 = stackOut_86_0;
                      stackIn_87_0 = stackOut_86_0;
                      if (var8_int != 0) {
                        break L24;
                      } else {
                        stackOut_87_0 = (mo) (Object) stackIn_87_0;
                        stackOut_87_1 = 1;
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_89_1 = stackOut_87_1;
                        break L23;
                      }
                    }
                  }
                  stackOut_88_0 = (mo) (Object) stackIn_88_0;
                  stackOut_88_1 = 0;
                  stackIn_89_0 = stackOut_88_0;
                  stackIn_89_1 = stackOut_88_1;
                  break L23;
                }
                stackIn_89_0.field_Z = stackIn_89_1 != 0;
                var7++;
                continue L14;
              }
            }
          } else {
            break L9;
          }
        }
        L25: {
          if (param1) {
            stackOut_92_0 = 0;
            stackIn_93_0 = stackOut_92_0;
            break L25;
          } else {
            stackOut_91_0 = 1;
            stackIn_93_0 = stackOut_91_0;
            break L25;
          }
        }
        L26: {
          var6 = stackIn_93_0;
          if (param3 == 1) {
            break L26;
          } else {
            field_Kb = -74L;
            break L26;
          }
        }
        L27: while (true) {
          if (var6 <= -4) {
            L28: {
              if (!param1) {
                break L28;
              } else {
                if ((r.field_f ^ -1) < -2) {
                  var6 = 0;
                  L29: while (true) {
                    if (r.field_f + 1 <= var6) {
                      break L28;
                    } else {
                      L30: {
                        var29 = ma.field_b[3][var6];
                        if (var4 == 0) {
                          break L30;
                        } else {
                          if (var29.field_T != 0) {
                            pb.field_h = var6;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                      }
                      L31: {
                        if (!var29.field_pb) {
                          break L31;
                        } else {
                          if (0 < var6) {
                            L32: {
                              if (null != qp.field_s) {
                                stackOut_136_0 = qp.field_s[-1 + var6];
                                stackIn_137_0 = stackOut_136_0;
                                break L32;
                              } else {
                                stackOut_135_0 = null;
                                stackIn_137_0 = (String) (Object) stackOut_135_0;
                                break L32;
                              }
                            }
                            var8_ref2 = stackIn_137_0;
                            if (var8_ref2 != null) {
                              ui.field_j = var8_ref2;
                              break L31;
                            } else {
                              break L31;
                            }
                          } else {
                            break L31;
                          }
                        }
                      }
                      L33: {
                        stackOut_140_0 = (mo) var29;
                        stackIn_142_0 = stackOut_140_0;
                        stackIn_141_0 = stackOut_140_0;
                        if (var4 == 0) {
                          stackOut_142_0 = (mo) (Object) stackIn_142_0;
                          stackOut_142_1 = 0;
                          stackIn_143_0 = stackOut_142_0;
                          stackIn_143_1 = stackOut_142_1;
                          break L33;
                        } else {
                          stackOut_141_0 = (mo) (Object) stackIn_141_0;
                          stackOut_141_1 = 1;
                          stackIn_143_0 = stackOut_141_0;
                          stackIn_143_1 = stackOut_141_1;
                          break L33;
                        }
                      }
                      L34: {
                        stackIn_143_0.field_Z = stackIn_143_1 != 0;
                        stackOut_143_0 = (mo) var29;
                        stackIn_145_0 = stackOut_143_0;
                        stackIn_144_0 = stackOut_143_0;
                        if (pb.field_h != var6) {
                          stackOut_145_0 = (mo) (Object) stackIn_145_0;
                          stackOut_145_1 = 0;
                          stackIn_146_0 = stackOut_145_0;
                          stackIn_146_1 = stackOut_145_1;
                          break L34;
                        } else {
                          stackOut_144_0 = (mo) (Object) stackIn_144_0;
                          stackOut_144_1 = 1;
                          stackIn_146_0 = stackOut_144_0;
                          stackIn_146_1 = stackOut_144_1;
                          break L34;
                        }
                      }
                      stackIn_146_0.field_Ab = stackIn_146_1 != 0;
                      var6++;
                      continue L29;
                    }
                  }
                } else {
                  break L28;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L35: while (true) {
              if (var7 >= kj.field_h) {
                L36: {
                  if (var5 == 0) {
                    break L36;
                  } else {
                    if (!param1) {
                      og.b(param2, 115);
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
                return;
              } else {
                L37: {
                  var30 = ma.field_b[4 + var7];
                  var8 = var30;
                  if (!param1) {
                    stackOut_151_0 = 0;
                    stackIn_152_0 = stackOut_151_0;
                    break L37;
                  } else {
                    stackOut_150_0 = -1;
                    stackIn_152_0 = stackOut_150_0;
                    break L37;
                  }
                }
                var9 = stackIn_152_0;
                L38: while (true) {
                  if (var9 >= var30.length + -1) {
                    var6 = var6 + (od.field_Gb[var7] & 255);
                    var7++;
                    continue L35;
                  } else {
                    L39: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L39;
                      } else {
                        if (0 <= var9) {
                          L40: {
                            if (na.field_J == null) {
                              break L40;
                            } else {
                              if (null == na.field_J[var7]) {
                                break L40;
                              } else {
                                if (((ql.field_c ^ -1) & na.field_J[var7][var9] ^ -1) < -1) {
                                  var14 = 1;
                                  var15 = vl.a((ql.field_c ^ -1) & na.field_J[var7][var9], (byte) -103);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                            }
                          }
                          L41: {
                            if (null == ch.field_g) {
                              break L41;
                            } else {
                              if (ch.field_g[var7] == null) {
                                break L41;
                              } else {
                                if (0 < vl.field_h) {
                                  break L41;
                                } else {
                                  if (ch.field_g[var7][var9]) {
                                    var10 = 1;
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                              }
                            }
                          }
                          L42: {
                            if (null == sd.field_G) {
                              break L42;
                            } else {
                              if (null == sd.field_G[var7]) {
                                break L42;
                              } else {
                                L43: {
                                  var16 = sd.field_G[var7][var9];
                                  if (0 == var16) {
                                    break L43;
                                  } else {
                                    if (bo.field_e) {
                                      break L43;
                                    } else {
                                      if (-1 <= vl.field_h) {
                                        var10 = 1;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                                if (-1 >= var16) {
                                  break L42;
                                } else {
                                  if (bc.field_e >= var16) {
                                    break L42;
                                  } else {
                                    var12 = 1;
                                    break L42;
                                  }
                                }
                              }
                            }
                          }
                          L44: {
                            if (null == r.field_c) {
                              break L44;
                            } else {
                              if (r.field_c[var7] != null) {
                                L45: {
                                  var16 = r.field_c[var7][var9];
                                  if (-1 == (var16 ^ -1)) {
                                    break L45;
                                  } else {
                                    if (bo.field_e) {
                                      break L45;
                                    } else {
                                      if (vl.field_h > 0) {
                                        break L45;
                                      } else {
                                        var10 = 1;
                                        break L45;
                                      }
                                    }
                                  }
                                }
                                if ((var16 ^ -1) >= -1) {
                                  break L44;
                                } else {
                                  if (dm.field_Zb >= var16) {
                                    break L44;
                                  } else {
                                    var11 = 1;
                                    break L44;
                                  }
                                }
                              } else {
                                break L44;
                              }
                            }
                          }
                          L46: {
                            if (param1) {
                              if (mb.field_k != null) {
                                if (null != mb.field_k[var7]) {
                                  if (!mb.field_k[var7][var9]) {
                                    stackOut_196_0 = 0;
                                    stackIn_198_0 = stackOut_196_0;
                                    break L46;
                                  } else {
                                    stackOut_195_0 = 1;
                                    stackIn_198_0 = stackOut_195_0;
                                    break L46;
                                  }
                                } else {
                                  stackOut_193_0 = 0;
                                  stackIn_198_0 = stackOut_193_0;
                                  break L46;
                                }
                              } else {
                                stackOut_191_0 = 0;
                                stackIn_198_0 = stackOut_191_0;
                                break L46;
                              }
                            } else {
                              stackOut_189_0 = 0;
                              stackIn_198_0 = stackOut_189_0;
                              break L46;
                            }
                          }
                          var13 = stackIn_198_0;
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L47: {
                      if (-3 < (kj.field_q ^ -1)) {
                        break L47;
                      } else {
                        if (!lc.field_m[12]) {
                          break L47;
                        } else {
                          var13 = 0;
                          var10 = 0;
                          var14 = 0;
                          var11 = 0;
                          var12 = 0;
                          break L47;
                        }
                      }
                    }
                    L48: {
                      dj.field_l = true;
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_212_0 = 1;
                                stackIn_214_0 = stackOut_212_0;
                                break L48;
                              } else {
                                stackOut_211_0 = 0;
                                stackIn_214_0 = stackOut_211_0;
                                break L48;
                              }
                            } else {
                              stackOut_209_0 = 1;
                              stackIn_214_0 = stackOut_209_0;
                              break L48;
                            }
                          } else {
                            stackOut_207_0 = 1;
                            stackIn_214_0 = stackOut_207_0;
                            break L48;
                          }
                        } else {
                          stackOut_205_0 = 1;
                          stackIn_214_0 = stackOut_205_0;
                          break L48;
                        }
                      } else {
                        stackOut_203_0 = 1;
                        stackIn_214_0 = stackOut_203_0;
                        break L48;
                      }
                    }
                    L49: {
                      var16 = stackIn_214_0;
                      if (var16 != 0) {
                        break L49;
                      } else {
                        if (0 > var9) {
                          break L49;
                        } else {
                          if (null == iq.field_b) {
                            break L49;
                          } else {
                            L50: {
                              if (!param1) {
                                break L50;
                              } else {
                                if (la.field_k) {
                                  break L49;
                                } else {
                                  break L50;
                                }
                              }
                            }
                            L51: {
                              lp.field_p = false;
                              if (null != rl.field_v) {
                                break L51;
                              } else {
                                rl.field_v = new byte[kj.field_h];
                                ll.field_c = new boolean[kj.field_h];
                                break L51;
                              }
                            }
                            dj.field_l = false;
                            var17_int = 0;
                            L52: while (true) {
                              if (var17_int >= var7) {
                                L53: {
                                  bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                                  if (-3 < (kj.field_q ^ -1)) {
                                    break L53;
                                  } else {
                                    if (!lc.field_m[12]) {
                                      break L53;
                                    } else {
                                      dj.field_l = true;
                                      break L53;
                                    }
                                  }
                                }
                                if (!dj.field_l) {
                                  var16 = 1;
                                  break L49;
                                } else {
                                  break L49;
                                }
                              } else {
                                ll.field_c[var17_int] = false;
                                var17_int++;
                                continue L52;
                              }
                            }
                          }
                        }
                      }
                    }
                    L54: {
                      var17 = var8[var9 + 1];
                      if (var4 == 0) {
                        break L54;
                      } else {
                        if (0 == var17.field_T) {
                          break L54;
                        } else {
                          if (param1) {
                            if (-1 == var9) {
                              var18 = var6;
                              L55: while (true) {
                                if (var18 >= var30.length + var6 + -1) {
                                  break L54;
                                } else {
                                  tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], 1 << tq.b(var18, 7) ^ -1);
                                  var18++;
                                  continue L55;
                                }
                              }
                            } else {
                              tg.field_a[(var6 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6 + var9) / 8], 1 << tq.b(var6 + var9, 7));
                              break L54;
                            }
                          } else {
                            if (var16 != 0) {
                              break L54;
                            } else {
                              if (param0.field_Zb[var7] == (byte)var9) {
                                break L54;
                              } else {
                                var5 = 1;
                                param0.field_Zb[var7] = (byte)var9;
                                break L54;
                              }
                            }
                          }
                        }
                      }
                    }
                    L56: {
                      if (!param1) {
                        break L56;
                      } else {
                        if (var16 != 0) {
                          tg.field_a[(var9 - -var6) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6) / 8], 1 << tq.b(var9 + var6, 7) ^ -1);
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                    }
                    L57: {
                      if (var9 < 0) {
                        break L57;
                      } else {
                        if (!var17.field_pb) {
                          break L57;
                        } else {
                          L58: {
                            if (ul.field_m == null) {
                              var18_ref = null;
                              break L58;
                            } else {
                              if (null == ul.field_m[var7]) {
                                var18_ref = null;
                                break L58;
                              } else {
                                var18_ref_String = ul.field_m[var7][var9];
                                break L58;
                              }
                            }
                          }
                          L59: {
                            if (kp.field_n != null) {
                              if (kp.field_n[var7] != null) {
                                var19_ref = kp.field_n[var7][var9];
                                break L59;
                              } else {
                                var19_ref = null;
                                break L59;
                              }
                            } else {
                              var19_ref = null;
                              break L59;
                            }
                          }
                          L60: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L60;
                            } else {
                              if (var19_ref.equals(var18_ref)) {
                                break L60;
                              } else {
                                var20 = var19_ref;
                                break L60;
                              }
                            }
                          }
                          L61: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L62: {
                                  if (var11 == 0) {
                                    break L62;
                                  } else {
                                    var22_int = r.field_c[var7][var9] + -dm.field_Zb;
                                    if (-2 != (var22_int ^ -1)) {
                                      var21 = vl.a(sc.field_c, new String[1], 2);
                                      break L62;
                                    } else {
                                      var21 = uq.field_a;
                                      break L62;
                                    }
                                  }
                                }
                                L63: {
                                  if (var12 != 0) {
                                    var31 = vl.a(dm.field_Rb, new String[2], 2);
                                    var21 = var31;
                                    var21 = var31;
                                    if (var21 == null) {
                                      var21 = var31;
                                      break L63;
                                    } else {
                                      var21 = var21 + "<br>" + var31;
                                      break L63;
                                    }
                                  } else {
                                    break L63;
                                  }
                                }
                                if (var14 != 0) {
                                  L64: {
                                    var22 = eb.field_L;
                                    if (-1 <= (var15 ^ -1)) {
                                      break L64;
                                    } else {
                                      if (null == ki.field_o) {
                                        break L64;
                                      } else {
                                        if (var15 > ki.field_o.length) {
                                          break L64;
                                        } else {
                                          if (null != ki.field_o[-1 + var15]) {
                                            var22_ref = ki.field_o[-1 + var15][0];
                                            break L64;
                                          } else {
                                            break L64;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = var22_ref;
                                    break L61;
                                  } else {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L61;
                                  }
                                } else {
                                  break L61;
                                }
                              } else {
                                var21 = fa.field_Ub;
                                break L61;
                              }
                            } else {
                              var21 = oj.field_H;
                              break L61;
                            }
                          }
                          L65: {
                            if (var4 == 0) {
                              break L65;
                            } else {
                              if (!dj.field_l) {
                                L66: {
                                  var22_ref = null;
                                  if (lp.field_p) {
                                    var22 = "</col>" + gi.field_n + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L66;
                                  } else {
                                    break L66;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L67: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 != 0) {
                                      var21 = kb.field_q + var22;
                                      break L65;
                                    } else {
                                      var21 = vl.a(io.field_a, new String[1], 2);
                                      break L65;
                                    }
                                  } else {
                                    if (ll.field_c[var24]) {
                                      var25 = "</col>" + cf.field_f[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 != null) {
                                        var22 = var22 + ", " + var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var23 = 1;
                                        var24++;
                                        continue L67;
                                      } else {
                                        var22 = var25;
                                        var24++;
                                        continue L67;
                                      }
                                    } else {
                                      var24++;
                                      continue L67;
                                    }
                                  }
                                }
                              } else {
                                break L65;
                              }
                            }
                          }
                          L68: {
                            if (var21 != null) {
                              var21 = "<col=A00000>" + var21;
                              var32 = sa.a(var21, param3 + 123, "<br>", "<br><col=A00000>");
                              if (var20 == null) {
                                var20 = var32;
                                break L68;
                              } else {
                                var20 = var20 + "<br>" + var32;
                                break L68;
                              }
                            } else {
                              break L68;
                            }
                          }
                          if (var20 == null) {
                            break L57;
                          } else {
                            ui.field_j = var20;
                            break L57;
                          }
                        }
                      }
                    }
                    L69: {
                      if (!param1) {
                        L70: {
                          L71: {
                            stackOut_320_0 = (mo) var17;
                            stackIn_323_0 = stackOut_320_0;
                            stackIn_321_0 = stackOut_320_0;
                            if (!dj.field_l) {
                              break L71;
                            } else {
                              stackOut_321_0 = (mo) (Object) stackIn_321_0;
                              stackIn_323_0 = stackOut_321_0;
                              stackIn_322_0 = stackOut_321_0;
                              if (param0.field_Zb[var7] != (byte)var9) {
                                break L71;
                              } else {
                                stackOut_322_0 = (mo) (Object) stackIn_322_0;
                                stackOut_322_1 = 1;
                                stackIn_324_0 = stackOut_322_0;
                                stackIn_324_1 = stackOut_322_1;
                                break L70;
                              }
                            }
                          }
                          stackOut_323_0 = (mo) (Object) stackIn_323_0;
                          stackOut_323_1 = 0;
                          stackIn_324_0 = stackOut_323_0;
                          stackIn_324_1 = stackOut_323_1;
                          break L70;
                        }
                        stackIn_324_0.field_Ab = stackIn_324_1 != 0;
                        break L69;
                      } else {
                        if (var9 != -1) {
                          L72: {
                            stackOut_316_0 = (mo) var17;
                            stackIn_318_0 = stackOut_316_0;
                            stackIn_317_0 = stackOut_316_0;
                            if (0 == (tg.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7))) {
                              stackOut_318_0 = (mo) (Object) stackIn_318_0;
                              stackOut_318_1 = 0;
                              stackIn_319_0 = stackOut_318_0;
                              stackIn_319_1 = stackOut_318_1;
                              break L72;
                            } else {
                              stackOut_317_0 = (mo) (Object) stackIn_317_0;
                              stackOut_317_1 = 1;
                              stackIn_319_0 = stackOut_317_0;
                              stackIn_319_1 = stackOut_317_1;
                              break L72;
                            }
                          }
                          stackIn_319_0.field_Ab = stackIn_319_1 != 0;
                          break L69;
                        } else {
                          var17.field_Ab = true;
                          var27 = var6;
                          var18 = var27;
                          L73: while (true) {
                            if (-1 + (var30.length + var6) <= var27) {
                              break L69;
                            } else {
                              L74: {
                                stackOut_312_0 = (mo) var17;
                                stackOut_312_1 = var17.field_Ab;
                                stackIn_314_0 = stackOut_312_0;
                                stackIn_314_1 = stackOut_312_1;
                                stackIn_313_0 = stackOut_312_0;
                                stackIn_313_1 = stackOut_312_1;
                                if (-1 != (tg.field_a[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                  stackOut_314_0 = (mo) (Object) stackIn_314_0;
                                  stackOut_314_1 = stackIn_314_1;
                                  stackOut_314_2 = 0;
                                  stackIn_315_0 = stackOut_314_0;
                                  stackIn_315_1 = stackOut_314_1;
                                  stackIn_315_2 = stackOut_314_2;
                                  break L74;
                                } else {
                                  stackOut_313_0 = (mo) (Object) stackIn_313_0;
                                  stackOut_313_1 = stackIn_313_1;
                                  stackOut_313_2 = 1;
                                  stackIn_315_0 = stackOut_313_0;
                                  stackIn_315_1 = stackOut_313_1;
                                  stackIn_315_2 = stackOut_313_2;
                                  break L74;
                                }
                              }
                              stackIn_315_0.field_Ab = stackIn_315_1 & stackIn_315_2 != 0;
                              var27++;
                              continue L73;
                            }
                          }
                        }
                      }
                    }
                    L75: {
                      L76: {
                        stackOut_325_0 = (mo) var17;
                        stackIn_328_0 = stackOut_325_0;
                        stackIn_326_0 = stackOut_325_0;
                        if (var4 == 0) {
                          break L76;
                        } else {
                          stackOut_326_0 = (mo) (Object) stackIn_326_0;
                          stackIn_328_0 = stackOut_326_0;
                          stackIn_327_0 = stackOut_326_0;
                          if (var16 != 0) {
                            break L76;
                          } else {
                            stackOut_327_0 = (mo) (Object) stackIn_327_0;
                            stackOut_327_1 = 1;
                            stackIn_329_0 = stackOut_327_0;
                            stackIn_329_1 = stackOut_327_1;
                            break L75;
                          }
                        }
                      }
                      stackOut_328_0 = (mo) (Object) stackIn_328_0;
                      stackOut_328_1 = 0;
                      stackIn_329_0 = stackOut_328_0;
                      stackIn_329_1 = stackOut_328_1;
                      break L75;
                    }
                    stackIn_329_0.field_Z = stackIn_329_1 != 0;
                    var9++;
                    continue L38;
                  }
                }
              }
            }
          } else {
            L77: {
              var28 = ma.field_b[2][var6];
              if (var4 == 0) {
                break L77;
              } else {
                if (-1 == var28.field_T) {
                  break L77;
                } else {
                  if (!param1) {
                    if (var6 != param0.field_fc) {
                      var5 = 1;
                      param0.field_fc = var6;
                      break L77;
                    } else {
                      break L77;
                    }
                  } else {
                    if (var6 == 0) {
                      sc.field_f = 0;
                      break L77;
                    } else {
                      sc.field_f = sc.field_f ^ var6;
                      break L77;
                    }
                  }
                }
              }
            }
            L78: {
              stackOut_105_0 = (mo) var28;
              stackIn_107_0 = stackOut_105_0;
              stackIn_106_0 = stackOut_105_0;
              if (var4 == 0) {
                stackOut_107_0 = (mo) (Object) stackIn_107_0;
                stackOut_107_1 = 0;
                stackIn_108_0 = stackOut_107_0;
                stackIn_108_1 = stackOut_107_1;
                break L78;
              } else {
                stackOut_106_0 = (mo) (Object) stackIn_106_0;
                stackOut_106_1 = 1;
                stackIn_108_0 = stackOut_106_0;
                stackIn_108_1 = stackOut_106_1;
                break L78;
              }
            }
            stackIn_108_0.field_Z = stackIn_108_1 != 0;
            if (!param1) {
              L79: {
                stackOut_118_0 = (mo) var28;
                stackIn_120_0 = stackOut_118_0;
                stackIn_119_0 = stackOut_118_0;
                if ((var6 & param0.field_fc) == 0) {
                  stackOut_120_0 = (mo) (Object) stackIn_120_0;
                  stackOut_120_1 = 0;
                  stackIn_121_0 = stackOut_120_0;
                  stackIn_121_1 = stackOut_120_1;
                  break L79;
                } else {
                  stackOut_119_0 = (mo) (Object) stackIn_119_0;
                  stackOut_119_1 = 1;
                  stackIn_121_0 = stackOut_119_0;
                  stackIn_121_1 = stackOut_119_1;
                  break L79;
                }
              }
              stackIn_121_0.field_Ab = stackIn_121_1 != 0;
              var6++;
              continue L27;
            } else {
              if (-1 == var6) {
                L80: {
                  stackOut_114_0 = (mo) var28;
                  stackIn_116_0 = stackOut_114_0;
                  stackIn_115_0 = stackOut_114_0;
                  if (-1 != (sc.field_f ^ -1)) {
                    stackOut_116_0 = (mo) (Object) stackIn_116_0;
                    stackOut_116_1 = 0;
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    break L80;
                  } else {
                    stackOut_115_0 = (mo) (Object) stackIn_115_0;
                    stackOut_115_1 = 1;
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_117_1 = stackOut_115_1;
                    break L80;
                  }
                }
                stackIn_117_0.field_Ab = stackIn_117_1 != 0;
                var6++;
                continue L27;
              } else {
                L81: {
                  stackOut_110_0 = (mo) var28;
                  stackIn_112_0 = stackOut_110_0;
                  stackIn_111_0 = stackOut_110_0;
                  if (-1 == (var6 & sc.field_f)) {
                    stackOut_112_0 = (mo) (Object) stackIn_112_0;
                    stackOut_112_1 = 0;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    break L81;
                  } else {
                    stackOut_111_0 = (mo) (Object) stackIn_111_0;
                    stackOut_111_1 = 1;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    break L81;
                  }
                }
                stackIn_113_0.field_Ab = stackIn_113_1 != 0;
                var6++;
                continue L27;
              }
            }
          }
        }
    }

    ld(long param0, cj param1, cj param2, cj param3, ld[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        ja var14 = null;
        int var15 = 0;
        fm var17 = null;
        fm var18 = null;
        ((ld) this).field_Tb = -1;
        ((ld) this).field_Qb = param5;
        ((ld) this).field_Pb = param7;
        ((ld) this).field_Fb = param4;
        ((ld) this).field_Ob = ((ld) this).field_Qb.length;
        var17 = param3.field_yb;
        var18 = var17;
        ((ld) this).field_Jb = var18.field_r + (var18.field_C + 2);
        ((ld) this).field_Nb = ((ld) this).field_Ob * ((ld) this).field_Jb;
        ((ld) this).field_Vb = 0;
        ((ld) this).field_Gb = new mo[((ld) this).field_Ob];
        var11 = "<col=999999>";
        var12 = "</col>";
        var13 = 0;
        L0: while (true) {
          if (((ld) this).field_Ob <= var13) {
            ((ld) this).field_Vb = ((ld) this).field_Vb + (tb.field_v.field_z + 10);
            this.b(12, 11183);
          } else {
            L1: {
              if (((ld) this).field_Pb[var13] <= 0) {
                break L1;
              } else {
                param6[var13] = var11 + hm.a(-81, ((ld) this).field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                break L1;
              }
            }
            L2: {
              L3: {
                var14 = null;
                if (null != ((ld) this).field_Fb[var13]) {
                  break L3;
                } else {
                  if (-1 != ((ld) this).field_Qb[var13]) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var14 = tb.field_v;
              break L2;
            }
            ((ld) this).field_Gb[var13] = new mo(0L, param2, (cj) null, param3, var14, param6[var13]);
            ((ld) this).a((byte) 50, (cj) (Object) ((ld) this).field_Gb[var13]);
            var15 = var17.a(param6[var13]);
            if (((ld) this).field_Vb < var15) {
              ((ld) this).field_Vb = var15;
              var13++;
              continue L0;
            } else {
              var13++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int = 0;
        ld var4 = null;
        mo var5 = null;
        int var6 = 0;
        ld var7 = null;
        mo stackIn_5_0 = null;
        mo stackIn_6_0 = null;
        mo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        mo stackOut_4_0 = null;
        mo stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        mo stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (((ld) this).field_Gb.length <= var4_int) {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                ((ld) this).field_Ib = null;
                break L1;
              }
            }
            L2: {
              if (((ld) this).field_Tb == -1) {
                break L2;
              } else {
                var7 = ((ld) this).field_Fb[((ld) this).field_Tb];
                var4 = var7;
                if (var4 == null) {
                  break L2;
                } else {
                  var7.b(param0, 255, param2);
                  break L2;
                }
              }
            }
            L3: {
              if ((((ld) this).field_Hb ^ -1) < -1) {
                this.b(((ld) this).field_Hb - 1, 11183);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = ((ld) this).field_Gb[var4_int];
            if (var5.field_T == 1) {
              L4: {
                this.a(-115, var4_int, param0, param2);
                stackOut_4_0 = (mo) var5;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var4_int != ((ld) this).field_Tb) {
                  stackOut_6_0 = (mo) (Object) stackIn_6_0;
                  stackOut_6_1 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L4;
                } else {
                  stackOut_5_0 = (mo) (Object) stackIn_5_0;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L4;
                }
              }
              stackIn_7_0.field_Ab = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        if (param0 != 0) {
            Object var3 = null;
            ld.a((jh) null, false, 60, 111);
        }
        String var2 = mc.a(cq.a(0, param1), (byte) 26);
        if (!(var2 != null)) {
            var2 = "";
        }
        return var2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ld) this).field_Sb = param4 * 2 + ((ld) this).field_Vb;
        ((ld) this).a(((ld) this).field_Nb, param1 - ((ld) this).field_Nb, ((ld) this).field_Sb, param0, -3344);
        if (param2 >= -16) {
            field_Kb = -29L;
        }
        if (param5 != ((ld) this).field_Mb) {
            ((ld) this).field_Mb = param5;
            this.b(((ld) this).field_Hb, 11183);
        }
        for (var7 = 0; ((ld) this).field_Ob > var7; var7++) {
            ((ld) this).field_Gb[var7].a(param3, 2, ((ld) this).field_Jb, ((ld) this).field_Sb, 0, ((ld) this).field_Gb[var7].field_Q, param4);
        }
        if (-1 != ((ld) this).field_Tb) {
            if (!(((ld) this).field_Fb[((ld) this).field_Tb] == null)) {
                var7 = ((ld) this).field_Fb[((ld) this).field_Tb].field_Ob;
                var8 = ((ld) this).field_Q + ((ld) this).field_Jb * (var7 + ((ld) this).field_Tb);
                while (param1 < var8) {
                    var8 = var8 - ((ld) this).field_Jb;
                }
                ((ld) this).field_Fb[((ld) this).field_Tb].a(param0 - -((ld) this).field_Sb, var8, -87, param3, param4, ((ld) this).field_Gb[((ld) this).field_Tb].field_qb);
            }
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        mo var4 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        mo[] var6 = ((ld) this).field_Gb;
        mo[] var2 = var6;
        if (param0 < 107) {
            this.a(31, 97, 11, 57);
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_T = 0;
            var4.field_Ab = false;
        }
        if (((ld) this).field_Ib != null) {
            ((ld) this).field_Ib.c((byte) 108);
            ((ld) this).field_Ib.a(true);
        }
        ((ld) this).field_Ib = null;
        ((ld) this).field_Tb = -1;
        this.b(12, 11183);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
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
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 < 0) {
          return;
        } else {
          if (param5 >= ep.field_h) {
            return;
          } else {
            L0: {
              if (param4 >= 0) {
                break L0;
              } else {
                if (param6 >= 0) {
                  break L0;
                } else {
                  if (0 <= param3) {
                    break L0;
                  } else {
                    return;
                  }
                }
              }
            }
            L1: {
              if (ep.field_i > param4) {
                break L1;
              } else {
                if (param6 < ep.field_i) {
                  break L1;
                } else {
                  if (ep.field_i <= param3) {
                    return;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param0 == -12628) {
              L2: {
                L3: {
                  var14 = param1 - param5;
                  if (param5 == param2) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        var10 = param4 << -1146515248;
                        var9 = param4 << -1146515248;
                        var15 = -param5 + param2;
                        var11 = (param6 + -param4 << 1072950960) / var15;
                        var12 = (-param4 + param3 << -1368549136) / var14;
                        if (var11 >= var12) {
                          break L5;
                        } else {
                          var13 = 0;
                          if (0 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var16 = var11;
                      var11 = var12;
                      var12 = var16;
                      var13 = 1;
                      break L4;
                    }
                    L6: {
                      L7: {
                        if (0 > param5) {
                          L8: {
                            if (param2 >= 0) {
                              break L8;
                            } else {
                              param5 = param2 + -param5;
                              var9 = var9 + param5 * var11;
                              var10 = var10 + var12 * param5;
                              param5 = param2;
                              if (0 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          param5 = -param5;
                          var9 = var9 + var11 * param5;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var16 = ep.field_a[param5];
                      L9: while (true) {
                        if (param5 >= param2) {
                          break L6;
                        } else {
                          L10: {
                            var17 = var9 >> -641679056;
                            if ((var17 ^ -1) <= (ep.field_i ^ -1)) {
                              break L10;
                            } else {
                              L11: {
                                var18 = -(var9 >> 774828240) + (var10 >> 929719024);
                                if (var18 != 0) {
                                  break L11;
                                } else {
                                  if (0 > var17) {
                                    break L10;
                                  } else {
                                    if (ep.field_i > var17) {
                                      so.a(param7, true, var16 + var17, var18, param8);
                                      if (0 == 0) {
                                        break L10;
                                      } else {
                                        break L11;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              L12: {
                                if (ep.field_i <= var18 + var17) {
                                  var18 = -1 + -var17 + ep.field_i;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              L13: {
                                if (var17 < 0) {
                                  break L13;
                                } else {
                                  so.a(param7, true, var17 + var16, var18, param8);
                                  if (0 == 0) {
                                    break L10;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              so.a(param7, true, var16, var18 + var17, param8);
                              break L10;
                            }
                          }
                          param5++;
                          if (param5 >= ep.field_h) {
                            return;
                          } else {
                            var9 = var9 + var11;
                            var16 = var16 + oo.field_b;
                            var10 = var10 + var12;
                            if (0 == 0) {
                              continue L9;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    L14: {
                      L15: {
                        var16 = param1 + -param2;
                        if (var16 != 0) {
                          break L15;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          if (0 == 0) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        L17: {
                          var17 = param3 << -435078064;
                          if (var13 != 0) {
                            break L17;
                          } else {
                            var9 = param6 << -592145584;
                            if (0 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        var10 = param6 << 1481707568;
                        break L16;
                      }
                      var11 = (var17 + -var9) / var16;
                      var12 = (-var10 + var17) / var16;
                      break L14;
                    }
                    if (0 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L18: {
                  L19: {
                    if (param1 == param5) {
                      break L19;
                    } else {
                      L20: {
                        L21: {
                          var15 = -param2 + param1;
                          if (param6 > param4) {
                            break L21;
                          } else {
                            var10 = param4 << -94535408;
                            var11 = (-param6 + param3 << -1923766992) / var15;
                            var12 = (-param4 + param3 << 2106942736) / var14;
                            var9 = param6 << -630187568;
                            if (0 == 0) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var10 = param6 << -1633525584;
                        var12 = (param3 - param6 << 1961646192) / var15;
                        var11 = (param3 + -param4 << -1401890096) / var14;
                        var9 = param4 << 400811568;
                        break L20;
                      }
                      if (0 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                  }
                  var11 = 0;
                  var10 = param6 << -548596304;
                  var12 = 0;
                  var9 = param4 << -1663683536;
                  break L18;
                }
                var13 = 0;
                if (0 <= param5) {
                  break L2;
                } else {
                  param5 = Math.min(-param5, -param5 + param2);
                  var10 = var10 + var12 * param5;
                  var9 = var9 + var11 * param5;
                  param5 = 0;
                  break L2;
                }
              }
              L22: {
                if (param5 >= 0) {
                  break L22;
                } else {
                  param5 = -param5;
                  var10 = var10 + var12 * param5;
                  var9 = var9 + param5 * var11;
                  param5 = 0;
                  break L22;
                }
              }
              var15 = ep.field_a[param5];
              L23: while (true) {
                L24: {
                  if (param1 <= param5) {
                    break L24;
                  } else {
                    L25: {
                      var16 = var9 >> -1311822640;
                      if (var16 < ep.field_i) {
                        L26: {
                          var17 = (var10 >> 227210128) - (var9 >> 1022113424);
                          if (0 != var17) {
                            break L26;
                          } else {
                            if (var16 < 0) {
                              break L25;
                            } else {
                              if (var16 < ep.field_i) {
                                so.a(param7, true, var16 - -var15, var17, param8);
                                if (0 == 0) {
                                  break L25;
                                } else {
                                  break L26;
                                }
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L27: {
                          if (var16 - -var17 >= ep.field_i) {
                            var17 = -1 + -var16 + ep.field_i;
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (var16 >= 0) {
                            break L28;
                          } else {
                            so.a(param7, true, var15, var17 - -var16, param8);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L28;
                            }
                          }
                        }
                        so.a(param7, true, var15 + var16, var17, param8);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    param5++;
                    if (ep.field_h > param5) {
                      var9 = var9 + var11;
                      var15 = var15 + oo.field_b;
                      var10 = var10 + var12;
                      if (0 == 0) {
                        continue L23;
                      } else {
                        break L24;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final boolean k(int param0) {
        int var4 = 0;
        mo var5 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        if (param0 != -26899) {
            return false;
        }
        mo[] var3 = ((ld) this).field_Gb;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_T ? 1 : 0);
        }
        if (var2 == 0) {
            if ((((ld) this).field_Tb ^ -1) != 0) {
                if (null != ((ld) this).field_Fb[((ld) this).field_Tb]) {
                    var2 = ((ld) this).field_Fb[((ld) this).field_Tb].k(param0 + 0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
        if (param0 >= -104) {
            Object var2 = null;
            ld.a((jh) null, false, 77, -3);
        }
        field_Ub = null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -93) {
            break L0;
          } else {
            ((ld) this).field_Fb = null;
            break L0;
          }
        }
        L1: {
          if (param1 == ((ld) this).field_Tb) {
            ((ld) this).c((byte) 127);
            this.b(0, 11183);
            break L1;
          } else {
            if (((ld) this).field_Fb[param1] != null) {
              ((ld) this).c((byte) 119);
              this.b(0, 11183);
              ((ld) this).field_Tb = param1;
              ((ld) this).field_Ib = ((ld) this).field_Fb[((ld) this).field_Tb];
              an.a((byte) 75, ((ld) this).field_Ib);
              ((ld) this).field_Ib.b(12, 11183);
              break L1;
            } else {
              if ((((ld) this).field_Qb[param1] ^ -1) == 0) {
                qd.c(4024);
                fh.b(31706);
                break L1;
              } else {
                L2: {
                  var5 = 32768 | ((ld) this).field_Qb[param1];
                  var6 = va.field_a;
                  if (var6 != -1) {
                    break L2;
                  } else {
                    if (mh.field_c == null) {
                      break L2;
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-3 != ga.a(var6, true)) {
                    break L3;
                  } else {
                    kp.a(var6, param3, 1, true);
                    break L3;
                  }
                }
                var8 = null;
                kb.a(var5, qf.field_g, param2, (String) null, va.field_a, 29602);
                ii.a(va.field_a, (byte) -128, var5, qf.field_g, jj.field_M);
                fh.b(31706);
                lh.a(true);
                break L1;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
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
        if (((ld) this).field_Ib != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == ((ld) this).field_Ib.field_Tb) {
                ((ld) this).c((byte) 110);
                this.b(0, 11183);
                return true;
              } else {
                break L1;
              }
            }
          }
          return ((ld) this).field_Ib.a(-119, param1, param2);
        } else {
          L2: {
            if (null != ((ld) this).field_Ib) {
              break L2;
            } else {
              if ((Object) (Object) mj.field_Ib != this) {
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
                if (var7 >= ((ld) this).field_Pb.length) {
                  break L3;
                } else {
                  if (((ld) this).field_Pb[var7] != var5) {
                    var7++;
                    continue L5;
                  } else {
                    this.a(-105, var7, param1, param2);
                    return true;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Rb = new lf();
        field_Lb = "Buying or selling an account";
    }
}
