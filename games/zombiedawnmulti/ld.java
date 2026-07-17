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
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        ((ld) this).field_Hb = param0;
        for (var5 = 0; var5 < ((ld) this).field_Ob; var5++) {
            var3 = ((ld) this).field_Jb * var5;
            var4 = ((ld) this).field_Hb * ((ld) this).field_Hb;
            ((ld) this).field_Gb[var5].field_Q = (var4 * (((ld) this).field_Mb + -((ld) this).field_qb) + (144 - var4) * var3) / 144;
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
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
        int var27 = 0;
        mo var28 = null;
        mo var29 = null;
        mo[] var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        mo stackIn_18_0 = null;
        mo stackIn_19_0 = null;
        mo stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mo stackIn_25_0 = null;
        mo stackIn_26_0 = null;
        mo stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        int stackIn_38_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_52_0 = 0;
        mo stackIn_69_0 = null;
        boolean stackIn_69_1 = false;
        mo stackIn_70_0 = null;
        boolean stackIn_70_1 = false;
        mo stackIn_71_0 = null;
        boolean stackIn_71_1 = false;
        int stackIn_71_2 = 0;
        mo stackIn_73_0 = null;
        mo stackIn_74_0 = null;
        mo stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        mo stackIn_77_0 = null;
        mo stackIn_78_0 = null;
        mo stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        mo stackIn_81_0 = null;
        mo stackIn_82_0 = null;
        mo stackIn_83_0 = null;
        mo stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_88_0 = 0;
        mo stackIn_101_0 = null;
        mo stackIn_102_0 = null;
        mo stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        mo stackIn_106_0 = null;
        mo stackIn_107_0 = null;
        mo stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        mo stackIn_110_0 = null;
        mo stackIn_111_0 = null;
        mo stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        mo stackIn_114_0 = null;
        mo stackIn_115_0 = null;
        mo stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        String stackIn_133_0 = null;
        mo stackIn_137_0 = null;
        mo stackIn_138_0 = null;
        mo stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        mo stackIn_140_0 = null;
        mo stackIn_141_0 = null;
        mo stackIn_142_0 = null;
        int stackIn_142_1 = 0;
        int stackIn_148_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_202_0 = 0;
        mo stackIn_302_0 = null;
        boolean stackIn_302_1 = false;
        mo stackIn_303_0 = null;
        boolean stackIn_303_1 = false;
        mo stackIn_304_0 = null;
        boolean stackIn_304_1 = false;
        int stackIn_304_2 = 0;
        mo stackIn_306_0 = null;
        mo stackIn_307_0 = null;
        mo stackIn_308_0 = null;
        int stackIn_308_1 = 0;
        mo stackIn_310_0 = null;
        mo stackIn_311_0 = null;
        mo stackIn_312_0 = null;
        mo stackIn_313_0 = null;
        int stackIn_313_1 = 0;
        mo stackIn_315_0 = null;
        mo stackIn_316_0 = null;
        mo stackIn_317_0 = null;
        mo stackIn_318_0 = null;
        int stackIn_318_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        mo stackOut_17_0 = null;
        mo stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mo stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mo stackOut_24_0 = null;
        mo stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        mo stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_51_0 = 0;
        mo stackOut_76_0 = null;
        mo stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        mo stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        mo stackOut_72_0 = null;
        mo stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        mo stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        mo stackOut_68_0 = null;
        boolean stackOut_68_1 = false;
        mo stackOut_70_0 = null;
        boolean stackOut_70_1 = false;
        int stackOut_70_2 = 0;
        mo stackOut_69_0 = null;
        boolean stackOut_69_1 = false;
        int stackOut_69_2 = 0;
        mo stackOut_80_0 = null;
        mo stackOut_81_0 = null;
        mo stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        mo stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        String stackOut_132_0 = null;
        Object stackOut_131_0 = null;
        mo stackOut_136_0 = null;
        mo stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        mo stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        mo stackOut_139_0 = null;
        mo stackOut_141_0 = null;
        int stackOut_141_1 = 0;
        mo stackOut_140_0 = null;
        int stackOut_140_1 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
        int stackOut_188_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        mo stackOut_309_0 = null;
        mo stackOut_310_0 = null;
        mo stackOut_311_0 = null;
        int stackOut_311_1 = 0;
        mo stackOut_312_0 = null;
        int stackOut_312_1 = 0;
        mo stackOut_305_0 = null;
        mo stackOut_307_0 = null;
        int stackOut_307_1 = 0;
        mo stackOut_306_0 = null;
        int stackOut_306_1 = 0;
        mo stackOut_301_0 = null;
        boolean stackOut_301_1 = false;
        mo stackOut_303_0 = null;
        boolean stackOut_303_1 = false;
        int stackOut_303_2 = 0;
        mo stackOut_302_0 = null;
        boolean stackOut_302_1 = false;
        int stackOut_302_2 = 0;
        mo stackOut_314_0 = null;
        mo stackOut_315_0 = null;
        mo stackOut_316_0 = null;
        int stackOut_316_1 = 0;
        mo stackOut_317_0 = null;
        int stackOut_317_1 = 0;
        mo stackOut_100_0 = null;
        mo stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        mo stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        mo stackOut_113_0 = null;
        mo stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        mo stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        mo stackOut_109_0 = null;
        mo stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        mo stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        mo stackOut_105_0 = null;
        mo stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        mo stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        L0: {
          var26 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param1) {
            L1: {
              if (la.field_k) {
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
                if (!hl.b(0)) {
                  break L3;
                } else {
                  if (param0.field_Fb) {
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
          var5 = 0;
          if (param1) {
            break L4;
          } else {
            var6 = 0;
            L5: while (true) {
              if (var6 >= 5) {
                if (!ma.field_b[0][2].field_pb) {
                  break L4;
                } else {
                  if (hl.b(0)) {
                    ui.field_j = pd.field_f;
                    break L4;
                  } else {
                    ui.field_j = vl.a(vc.field_e, new String[1], 2);
                    break L4;
                  }
                }
              } else {
                L6: {
                  if (var4_int == 0) {
                    break L6;
                  } else {
                    if (ma.field_b[0][1 + var6].field_T == 0) {
                      break L6;
                    } else {
                      if (var6 == param0.field_Pb) {
                        break L6;
                      } else {
                        var5 = 1;
                        param0.field_Pb = var6;
                        break L6;
                      }
                    }
                  }
                }
                L7: {
                  stackOut_17_0 = ma.field_b[0][var6 - -1];
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (var4_int == 0) {
                    stackOut_19_0 = (mo) (Object) stackIn_19_0;
                    stackOut_19_1 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    break L7;
                  } else {
                    stackOut_18_0 = (mo) (Object) stackIn_18_0;
                    stackOut_18_1 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    stackIn_20_1 = stackOut_18_1;
                    break L7;
                  }
                }
                L8: {
                  stackIn_20_0.field_Z = stackIn_20_1 != 0;
                  if (tb.field_u) {
                    break L8;
                  } else {
                    if (var6 == 3) {
                      ma.field_b[0][1 + var6].field_Z = false;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  stackOut_24_0 = ma.field_b[0][1 + var6];
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (param0.field_Pb != var6) {
                    stackOut_26_0 = (mo) (Object) stackIn_26_0;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L9;
                  } else {
                    stackOut_25_0 = (mo) (Object) stackIn_25_0;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L9;
                  }
                }
                stackIn_27_0.field_Ab = stackIn_27_1 != 0;
                var6++;
                continue L5;
              }
            }
          }
        }
        L10: {
          if (qo.field_r.length >= 2) {
            L11: {
              L12: {
                if (!param1) {
                  break L12;
                } else {
                  if (tj.field_c == -1) {
                    break L12;
                  } else {
                    stackOut_36_0 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    break L11;
                  }
                }
              }
              stackOut_37_0 = 0;
              stackIn_38_0 = stackOut_37_0;
              break L11;
            }
            L13: {
              var6 = stackIn_38_0;
              if (var6 == 0) {
                break L13;
              } else {
                var7 = tj.field_c;
                var8_int = 0;
                L14: while (true) {
                  if (var8_int >= fg.field_k.length) {
                    fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
                    break L13;
                  } else {
                    fg.field_k[var8_int] = (byte) 0;
                    var8_int++;
                    continue L14;
                  }
                }
              }
            }
            L15: {
              if (!param1) {
                stackOut_45_0 = 0;
                stackIn_46_0 = stackOut_45_0;
                break L15;
              } else {
                stackOut_44_0 = -1;
                stackIn_46_0 = stackOut_44_0;
                break L15;
              }
            }
            var7 = stackIn_46_0;
            L16: while (true) {
              if (qo.field_r.length <= var7) {
                break L10;
              } else {
                L17: {
                  L18: {
                    if (var6 == 0) {
                      break L18;
                    } else {
                      if (~tj.field_c == ~var7) {
                        break L18;
                      } else {
                        stackOut_50_0 = 1;
                        stackIn_52_0 = stackOut_50_0;
                        break L17;
                      }
                    }
                  }
                  stackOut_51_0 = 0;
                  stackIn_52_0 = stackOut_51_0;
                  break L17;
                }
                L19: {
                  var8_int = stackIn_52_0;
                  if (var4_int == 0) {
                    break L19;
                  } else {
                    if (ma.field_b[1][var7 - -1].field_T == 0) {
                      break L19;
                    } else {
                      if (param1) {
                        if (var6 != 0) {
                          break L19;
                        } else {
                          if (var7 == -1) {
                            var9 = 0;
                            L20: while (true) {
                              if (~var9 <= ~fg.field_k.length) {
                                break L19;
                              } else {
                                fg.field_k[var9] = (byte) 0;
                                var9++;
                                continue L20;
                              }
                            }
                          } else {
                            fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                            break L19;
                          }
                        }
                      } else {
                        L21: {
                          var9 = qo.field_r[var7];
                          if (~var9 == ~param0.field_mc) {
                            break L21;
                          } else {
                            param0.field_mc = var9;
                            var5 = 1;
                            break L21;
                          }
                        }
                        break L19;
                      }
                    }
                  }
                }
                L22: {
                  if (!param1) {
                    L23: {
                      var9 = qo.field_r[var7];
                      stackOut_76_0 = ma.field_b[1][1 + var7];
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_77_0 = stackOut_76_0;
                      if (~param0.field_mc != ~var9) {
                        stackOut_78_0 = (mo) (Object) stackIn_78_0;
                        stackOut_78_1 = 0;
                        stackIn_79_0 = stackOut_78_0;
                        stackIn_79_1 = stackOut_78_1;
                        break L23;
                      } else {
                        stackOut_77_0 = (mo) (Object) stackIn_77_0;
                        stackOut_77_1 = 1;
                        stackIn_79_0 = stackOut_77_0;
                        stackIn_79_1 = stackOut_77_1;
                        break L23;
                      }
                    }
                    stackIn_79_0.field_Ab = stackIn_79_1 != 0;
                    break L22;
                  } else {
                    if (var7 != -1) {
                      L24: {
                        stackOut_72_0 = ma.field_b[1][var7 + 1];
                        stackIn_74_0 = stackOut_72_0;
                        stackIn_73_0 = stackOut_72_0;
                        if ((fg.field_k[var7 / 8] & 1 << (7 & var7)) == 0) {
                          stackOut_74_0 = (mo) (Object) stackIn_74_0;
                          stackOut_74_1 = 0;
                          stackIn_75_0 = stackOut_74_0;
                          stackIn_75_1 = stackOut_74_1;
                          break L24;
                        } else {
                          stackOut_73_0 = (mo) (Object) stackIn_73_0;
                          stackOut_73_1 = 1;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          break L24;
                        }
                      }
                      stackIn_75_0.field_Ab = stackIn_75_1 != 0;
                      break L22;
                    } else {
                      ma.field_b[1][var7 - -1].field_Ab = true;
                      var9 = 0;
                      L25: while (true) {
                        if (~qo.field_r.length >= ~var9) {
                          break L22;
                        } else {
                          L26: {
                            stackOut_68_0 = ma.field_b[1][var7 - -1];
                            stackOut_68_1 = ma.field_b[1][var7 - -1].field_Ab;
                            stackIn_70_0 = stackOut_68_0;
                            stackIn_70_1 = stackOut_68_1;
                            stackIn_69_0 = stackOut_68_0;
                            stackIn_69_1 = stackOut_68_1;
                            if ((fg.field_k[var9 / 8] & 1 << (var9 & 7)) != 0) {
                              stackOut_70_0 = (mo) (Object) stackIn_70_0;
                              stackOut_70_1 = stackIn_70_1;
                              stackOut_70_2 = 0;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              stackIn_71_2 = stackOut_70_2;
                              break L26;
                            } else {
                              stackOut_69_0 = (mo) (Object) stackIn_69_0;
                              stackOut_69_1 = stackIn_69_1;
                              stackOut_69_2 = 1;
                              stackIn_71_0 = stackOut_69_0;
                              stackIn_71_1 = stackOut_69_1;
                              stackIn_71_2 = stackOut_69_2;
                              break L26;
                            }
                          }
                          stackIn_71_0.field_Ab = stackIn_71_1 & stackIn_71_2 != 0;
                          var9++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L27: {
                  L28: {
                    stackOut_80_0 = ma.field_b[1][var7 + 1];
                    stackIn_83_0 = stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (var4_int == 0) {
                      break L28;
                    } else {
                      stackOut_81_0 = (mo) (Object) stackIn_81_0;
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_82_0 = stackOut_81_0;
                      if (var8_int != 0) {
                        break L28;
                      } else {
                        stackOut_82_0 = (mo) (Object) stackIn_82_0;
                        stackOut_82_1 = 1;
                        stackIn_84_0 = stackOut_82_0;
                        stackIn_84_1 = stackOut_82_1;
                        break L27;
                      }
                    }
                  }
                  stackOut_83_0 = (mo) (Object) stackIn_83_0;
                  stackOut_83_1 = 0;
                  stackIn_84_0 = stackOut_83_0;
                  stackIn_84_1 = stackOut_83_1;
                  break L27;
                }
                stackIn_84_0.field_Z = stackIn_84_1 != 0;
                var7++;
                continue L16;
              }
            }
          } else {
            break L10;
          }
        }
        L29: {
          if (param1) {
            stackOut_87_0 = 0;
            stackIn_88_0 = stackOut_87_0;
            break L29;
          } else {
            stackOut_86_0 = 1;
            stackIn_88_0 = stackOut_86_0;
            break L29;
          }
        }
        L30: {
          var6 = stackIn_88_0;
          if (param3 == 1) {
            break L30;
          } else {
            field_Kb = -74L;
            break L30;
          }
        }
        L31: while (true) {
          if (var6 >= 3) {
            L32: {
              if (!param1) {
                break L32;
              } else {
                if (r.field_f > 1) {
                  var6 = 0;
                  L33: while (true) {
                    if (r.field_f + 1 <= var6) {
                      break L32;
                    } else {
                      L34: {
                        var29 = ma.field_b[3][var6];
                        if (var4_int == 0) {
                          break L34;
                        } else {
                          if (var29.field_T != 0) {
                            pb.field_h = var6;
                            break L34;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (!var29.field_pb) {
                          break L35;
                        } else {
                          if (0 < var6) {
                            L36: {
                              if (null != qp.field_s) {
                                stackOut_132_0 = qp.field_s[-1 + var6];
                                stackIn_133_0 = stackOut_132_0;
                                break L36;
                              } else {
                                stackOut_131_0 = null;
                                stackIn_133_0 = (String) (Object) stackOut_131_0;
                                break L36;
                              }
                            }
                            var8_ref = stackIn_133_0;
                            if (var8_ref != null) {
                              ui.field_j = var8_ref;
                              break L35;
                            } else {
                              break L35;
                            }
                          } else {
                            break L35;
                          }
                        }
                      }
                      L37: {
                        stackOut_136_0 = (mo) var29;
                        stackIn_138_0 = stackOut_136_0;
                        stackIn_137_0 = stackOut_136_0;
                        if (var4_int == 0) {
                          stackOut_138_0 = (mo) (Object) stackIn_138_0;
                          stackOut_138_1 = 0;
                          stackIn_139_0 = stackOut_138_0;
                          stackIn_139_1 = stackOut_138_1;
                          break L37;
                        } else {
                          stackOut_137_0 = (mo) (Object) stackIn_137_0;
                          stackOut_137_1 = 1;
                          stackIn_139_0 = stackOut_137_0;
                          stackIn_139_1 = stackOut_137_1;
                          break L37;
                        }
                      }
                      L38: {
                        stackIn_139_0.field_Z = stackIn_139_1 != 0;
                        stackOut_139_0 = (mo) var29;
                        stackIn_141_0 = stackOut_139_0;
                        stackIn_140_0 = stackOut_139_0;
                        if (pb.field_h != var6) {
                          stackOut_141_0 = (mo) (Object) stackIn_141_0;
                          stackOut_141_1 = 0;
                          stackIn_142_0 = stackOut_141_0;
                          stackIn_142_1 = stackOut_141_1;
                          break L38;
                        } else {
                          stackOut_140_0 = (mo) (Object) stackIn_140_0;
                          stackOut_140_1 = 1;
                          stackIn_142_0 = stackOut_140_0;
                          stackIn_142_1 = stackOut_140_1;
                          break L38;
                        }
                      }
                      stackIn_142_0.field_Ab = stackIn_142_1 != 0;
                      var6++;
                      continue L33;
                    }
                  }
                } else {
                  break L32;
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L39: while (true) {
              if (~var7 <= ~kj.field_h) {
                L40: {
                  L41: {
                    if (var5 == 0) {
                      break L41;
                    } else {
                      if (!param1) {
                        og.b(param2, 115);
                        break L41;
                      } else {
                        break L40;
                      }
                    }
                  }
                  break L40;
                }
                return;
              } else {
                L42: {
                  var30 = ma.field_b[4 + var7];
                  var8 = var30;
                  if (!param1) {
                    stackOut_147_0 = 0;
                    stackIn_148_0 = stackOut_147_0;
                    break L42;
                  } else {
                    stackOut_146_0 = -1;
                    stackIn_148_0 = stackOut_146_0;
                    break L42;
                  }
                }
                var9 = stackIn_148_0;
                L43: while (true) {
                  if (var9 >= var30.length + -1) {
                    var6 = var6 + (od.field_Gb[var7] & 255);
                    var7++;
                    continue L39;
                  } else {
                    L44: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L44;
                      } else {
                        if (0 <= var9) {
                          L45: {
                            if (na.field_J == null) {
                              break L45;
                            } else {
                              if (null == na.field_J[var7]) {
                                break L45;
                              } else {
                                if ((~ql.field_c & na.field_J[var7][var9]) > 0) {
                                  var14 = 1;
                                  var15 = vl.a(~ql.field_c & na.field_J[var7][var9], (byte) -103);
                                  break L45;
                                } else {
                                  break L45;
                                }
                              }
                            }
                          }
                          L46: {
                            if (null == ch.field_g) {
                              break L46;
                            } else {
                              if (ch.field_g[var7] == null) {
                                break L46;
                              } else {
                                if (0 < vl.field_h) {
                                  break L46;
                                } else {
                                  if (ch.field_g[var7][var9]) {
                                    var10 = 1;
                                    break L46;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            if (null == sd.field_G) {
                              break L47;
                            } else {
                              if (null == sd.field_G[var7]) {
                                break L47;
                              } else {
                                L48: {
                                  var16 = sd.field_G[var7][var9];
                                  if (0 == var16) {
                                    break L48;
                                  } else {
                                    if (bo.field_e) {
                                      break L48;
                                    } else {
                                      if (vl.field_h <= 0) {
                                        var10 = 1;
                                        break L48;
                                      } else {
                                        break L48;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L47;
                                } else {
                                  if (~bc.field_e <= ~var16) {
                                    break L47;
                                  } else {
                                    var12 = 1;
                                    break L47;
                                  }
                                }
                              }
                            }
                          }
                          L49: {
                            if (null == r.field_c) {
                              break L49;
                            } else {
                              if (r.field_c[var7] != null) {
                                L50: {
                                  var16 = r.field_c[var7][var9];
                                  if (var16 == 0) {
                                    break L50;
                                  } else {
                                    if (bo.field_e) {
                                      break L50;
                                    } else {
                                      if (vl.field_h > 0) {
                                        break L50;
                                      } else {
                                        var10 = 1;
                                        break L50;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L49;
                                } else {
                                  if (~dm.field_Zb <= ~var16) {
                                    break L49;
                                  } else {
                                    var11 = 1;
                                    break L49;
                                  }
                                }
                              } else {
                                break L49;
                              }
                            }
                          }
                          L51: {
                            L52: {
                              if (!param1) {
                                break L52;
                              } else {
                                if (mb.field_k == null) {
                                  break L52;
                                } else {
                                  if (null == mb.field_k[var7]) {
                                    break L52;
                                  } else {
                                    if (!mb.field_k[var7][var9]) {
                                      break L52;
                                    } else {
                                      stackOut_188_0 = 1;
                                      stackIn_190_0 = stackOut_188_0;
                                      break L51;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_189_0 = 0;
                            stackIn_190_0 = stackOut_189_0;
                            break L51;
                          }
                          var13 = stackIn_190_0;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                    }
                    L53: {
                      if (kj.field_q < 2) {
                        break L53;
                      } else {
                        if (!lc.field_m[12]) {
                          break L53;
                        } else {
                          var13 = 0;
                          var10 = 0;
                          var14 = 0;
                          var11 = 0;
                          var12 = 0;
                          break L53;
                        }
                      }
                    }
                    L54: {
                      L55: {
                        dj.field_l = true;
                        if (var10 != 0) {
                          break L55;
                        } else {
                          if (var11 != 0) {
                            break L55;
                          } else {
                            if (var12 != 0) {
                              break L55;
                            } else {
                              if (var13 != 0) {
                                break L55;
                              } else {
                                if (var14 == 0) {
                                  stackOut_201_0 = 0;
                                  stackIn_202_0 = stackOut_201_0;
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_200_0 = 1;
                      stackIn_202_0 = stackOut_200_0;
                      break L54;
                    }
                    L56: {
                      var16 = stackIn_202_0;
                      if (var16 != 0) {
                        break L56;
                      } else {
                        if (0 > var9) {
                          break L56;
                        } else {
                          if (null == iq.field_b) {
                            break L56;
                          } else {
                            L57: {
                              if (!param1) {
                                break L57;
                              } else {
                                if (la.field_k) {
                                  break L56;
                                } else {
                                  break L57;
                                }
                              }
                            }
                            L58: {
                              lp.field_p = false;
                              if (null != rl.field_v) {
                                break L58;
                              } else {
                                rl.field_v = new byte[kj.field_h];
                                ll.field_c = new boolean[kj.field_h];
                                break L58;
                              }
                            }
                            dj.field_l = false;
                            var17_int = 0;
                            L59: while (true) {
                              if (~var17_int <= ~var7) {
                                L60: {
                                  bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                                  if (kj.field_q < 2) {
                                    break L60;
                                  } else {
                                    if (!lc.field_m[12]) {
                                      break L60;
                                    } else {
                                      dj.field_l = true;
                                      break L60;
                                    }
                                  }
                                }
                                if (!dj.field_l) {
                                  var16 = 1;
                                  break L56;
                                } else {
                                  break L56;
                                }
                              } else {
                                ll.field_c[var17_int] = false;
                                var17_int++;
                                continue L59;
                              }
                            }
                          }
                        }
                      }
                    }
                    L61: {
                      var17 = var8[var9 + 1];
                      if (var4_int == 0) {
                        break L61;
                      } else {
                        if (0 == var17.field_T) {
                          break L61;
                        } else {
                          if (param1) {
                            if (-1 == var9) {
                              var18 = var6;
                              L62: while (true) {
                                if (~var18 <= ~(var30.length + var6 + -1)) {
                                  break L61;
                                } else {
                                  tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], ~(1 << tq.b(var18, 7)));
                                  var18++;
                                  continue L62;
                                }
                              }
                            } else {
                              tg.field_a[(var6 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6 + var9) / 8], 1 << tq.b(var6 + var9, 7));
                              break L61;
                            }
                          } else {
                            if (var16 != 0) {
                              break L61;
                            } else {
                              if (param0.field_Zb[var7] == (byte)var9) {
                                break L61;
                              } else {
                                var5 = 1;
                                param0.field_Zb[var7] = (byte)var9;
                                break L61;
                              }
                            }
                          }
                        }
                      }
                    }
                    L63: {
                      if (!param1) {
                        break L63;
                      } else {
                        if (var16 != 0) {
                          tg.field_a[(var9 - -var6) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6) / 8], ~(1 << tq.b(var9 + var6, 7)));
                          break L63;
                        } else {
                          break L63;
                        }
                      }
                    }
                    L64: {
                      if (var9 < 0) {
                        break L64;
                      } else {
                        if (!var17.field_pb) {
                          break L64;
                        } else {
                          L65: {
                            if (ul.field_m == null) {
                              var18_ref = null;
                              break L65;
                            } else {
                              if (null == ul.field_m[var7]) {
                                var18_ref = null;
                                break L65;
                              } else {
                                var18_ref = (Object) (Object) ul.field_m[var7][var9];
                                break L65;
                              }
                            }
                          }
                          L66: {
                            if (kp.field_n != null) {
                              if (kp.field_n[var7] != null) {
                                var19_ref = kp.field_n[var7][var9];
                                break L66;
                              } else {
                                var19_ref = null;
                                break L66;
                              }
                            } else {
                              var19_ref = null;
                              break L66;
                            }
                          }
                          L67: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L67;
                            } else {
                              if (var19_ref.equals(var18_ref)) {
                                break L67;
                              } else {
                                var20 = (Object) (Object) var19_ref;
                                break L67;
                              }
                            }
                          }
                          L68: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L69: {
                                  if (var11 == 0) {
                                    break L69;
                                  } else {
                                    var22_int = r.field_c[var7][var9] + -dm.field_Zb;
                                    if (var22_int != 1) {
                                      var21 = (Object) (Object) vl.a(sc.field_c, new String[1], 2);
                                      break L69;
                                    } else {
                                      var21 = (Object) (Object) uq.field_a;
                                      break L69;
                                    }
                                  }
                                }
                                L70: {
                                  if (var12 != 0) {
                                    var31 = vl.a(dm.field_Rb, new String[2], 2);
                                    var21 = (Object) (Object) var31;
                                    var21 = (Object) (Object) var31;
                                    if (var21 == null) {
                                      var21 = (Object) (Object) var31;
                                      break L70;
                                    } else {
                                      var21 = (Object) (Object) (var21 + "<br>" + var31);
                                      break L70;
                                    }
                                  } else {
                                    break L70;
                                  }
                                }
                                if (var14 != 0) {
                                  L71: {
                                    var22_ref = eb.field_L;
                                    if (var15 <= 0) {
                                      break L71;
                                    } else {
                                      if (null == ki.field_o) {
                                        break L71;
                                      } else {
                                        if (var15 > ki.field_o.length) {
                                          break L71;
                                        } else {
                                          if (null != ki.field_o[-1 + var15]) {
                                            var22_ref = ki.field_o[-1 + var15][0];
                                            break L71;
                                          } else {
                                            break L71;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = (Object) (Object) var22_ref;
                                    break L68;
                                  } else {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L68;
                                  }
                                } else {
                                  break L68;
                                }
                              } else {
                                var21 = (Object) (Object) fa.field_Ub;
                                break L68;
                              }
                            } else {
                              var21 = (Object) (Object) oj.field_H;
                              break L68;
                            }
                          }
                          L72: {
                            if (var4_int == 0) {
                              break L72;
                            } else {
                              if (!dj.field_l) {
                                L73: {
                                  var22_ref = null;
                                  if (lp.field_p) {
                                    var22_ref = "</col>" + gi.field_n + "<col=A00000>";
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var21 = (Object) (Object) var22_ref;
                                    break L73;
                                  } else {
                                    break L73;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L74: while (true) {
                                  if (~var7 >= ~var24) {
                                    if (var23 != 0) {
                                      var21 = (Object) (Object) (kb.field_q + var22_ref);
                                      break L72;
                                    } else {
                                      var21 = (Object) (Object) vl.a(io.field_a, new String[1], 2);
                                      break L72;
                                    }
                                  } else {
                                    L75: {
                                      if (ll.field_c[var24]) {
                                        var25 = "</col>" + cf.field_f[var24] + "<col=A00000>";
                                        var22_ref = var25;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25;
                                        if (var22_ref != null) {
                                          var22_ref = var22_ref + ", " + var25;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          var23 = 1;
                                          break L75;
                                        } else {
                                          var22_ref = var25;
                                          break L75;
                                        }
                                      } else {
                                        break L75;
                                      }
                                    }
                                    var24++;
                                    continue L74;
                                  }
                                }
                              } else {
                                break L72;
                              }
                            }
                          }
                          L76: {
                            if (var21 != null) {
                              var21 = (Object) (Object) ("<col=A00000>" + var21);
                              var32 = sa.a((String) var21, param3 + 123, "<br>", "<br><col=A00000>");
                              if (var20 == null) {
                                var20 = (Object) (Object) var32;
                                break L76;
                              } else {
                                var20 = (Object) (Object) (var20 + "<br>" + var32);
                                break L76;
                              }
                            } else {
                              break L76;
                            }
                          }
                          if (var20 == null) {
                            break L64;
                          } else {
                            ui.field_j = (String) var20;
                            break L64;
                          }
                        }
                      }
                    }
                    L77: {
                      if (!param1) {
                        L78: {
                          L79: {
                            stackOut_309_0 = (mo) var17;
                            stackIn_312_0 = stackOut_309_0;
                            stackIn_310_0 = stackOut_309_0;
                            if (!dj.field_l) {
                              break L79;
                            } else {
                              stackOut_310_0 = (mo) (Object) stackIn_310_0;
                              stackIn_312_0 = stackOut_310_0;
                              stackIn_311_0 = stackOut_310_0;
                              if (~param0.field_Zb[var7] != ~(byte)var9) {
                                break L79;
                              } else {
                                stackOut_311_0 = (mo) (Object) stackIn_311_0;
                                stackOut_311_1 = 1;
                                stackIn_313_0 = stackOut_311_0;
                                stackIn_313_1 = stackOut_311_1;
                                break L78;
                              }
                            }
                          }
                          stackOut_312_0 = (mo) (Object) stackIn_312_0;
                          stackOut_312_1 = 0;
                          stackIn_313_0 = stackOut_312_0;
                          stackIn_313_1 = stackOut_312_1;
                          break L78;
                        }
                        stackIn_313_0.field_Ab = stackIn_313_1 != 0;
                        break L77;
                      } else {
                        if (var9 != -1) {
                          L80: {
                            stackOut_305_0 = (mo) var17;
                            stackIn_307_0 = stackOut_305_0;
                            stackIn_306_0 = stackOut_305_0;
                            if (0 == (tg.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7))) {
                              stackOut_307_0 = (mo) (Object) stackIn_307_0;
                              stackOut_307_1 = 0;
                              stackIn_308_0 = stackOut_307_0;
                              stackIn_308_1 = stackOut_307_1;
                              break L80;
                            } else {
                              stackOut_306_0 = (mo) (Object) stackIn_306_0;
                              stackOut_306_1 = 1;
                              stackIn_308_0 = stackOut_306_0;
                              stackIn_308_1 = stackOut_306_1;
                              break L80;
                            }
                          }
                          stackIn_308_0.field_Ab = stackIn_308_1 != 0;
                          break L77;
                        } else {
                          var17.field_Ab = true;
                          var27 = var6;
                          var18 = var27;
                          L81: while (true) {
                            if (-1 + (var30.length + var6) <= var27) {
                              break L77;
                            } else {
                              L82: {
                                stackOut_301_0 = (mo) var17;
                                stackOut_301_1 = var17.field_Ab;
                                stackIn_303_0 = stackOut_301_0;
                                stackIn_303_1 = stackOut_301_1;
                                stackIn_302_0 = stackOut_301_0;
                                stackIn_302_1 = stackOut_301_1;
                                if ((tg.field_a[var27 / 8] & 1 << (7 & var27)) != 0) {
                                  stackOut_303_0 = (mo) (Object) stackIn_303_0;
                                  stackOut_303_1 = stackIn_303_1;
                                  stackOut_303_2 = 0;
                                  stackIn_304_0 = stackOut_303_0;
                                  stackIn_304_1 = stackOut_303_1;
                                  stackIn_304_2 = stackOut_303_2;
                                  break L82;
                                } else {
                                  stackOut_302_0 = (mo) (Object) stackIn_302_0;
                                  stackOut_302_1 = stackIn_302_1;
                                  stackOut_302_2 = 1;
                                  stackIn_304_0 = stackOut_302_0;
                                  stackIn_304_1 = stackOut_302_1;
                                  stackIn_304_2 = stackOut_302_2;
                                  break L82;
                                }
                              }
                              stackIn_304_0.field_Ab = stackIn_304_1 & stackIn_304_2 != 0;
                              var27++;
                              continue L81;
                            }
                          }
                        }
                      }
                    }
                    L83: {
                      L84: {
                        stackOut_314_0 = (mo) var17;
                        stackIn_317_0 = stackOut_314_0;
                        stackIn_315_0 = stackOut_314_0;
                        if (var4_int == 0) {
                          break L84;
                        } else {
                          stackOut_315_0 = (mo) (Object) stackIn_315_0;
                          stackIn_317_0 = stackOut_315_0;
                          stackIn_316_0 = stackOut_315_0;
                          if (var16 != 0) {
                            break L84;
                          } else {
                            stackOut_316_0 = (mo) (Object) stackIn_316_0;
                            stackOut_316_1 = 1;
                            stackIn_318_0 = stackOut_316_0;
                            stackIn_318_1 = stackOut_316_1;
                            break L83;
                          }
                        }
                      }
                      stackOut_317_0 = (mo) (Object) stackIn_317_0;
                      stackOut_317_1 = 0;
                      stackIn_318_0 = stackOut_317_0;
                      stackIn_318_1 = stackOut_317_1;
                      break L83;
                    }
                    stackIn_318_0.field_Z = stackIn_318_1 != 0;
                    var9++;
                    continue L43;
                  }
                }
              }
            }
          } else {
            L85: {
              var28 = ma.field_b[2][var6];
              if (var4_int == 0) {
                break L85;
              } else {
                if (var28.field_T == 0) {
                  break L85;
                } else {
                  if (!param1) {
                    if (~var6 != ~param0.field_fc) {
                      var5 = 1;
                      param0.field_fc = var6;
                      break L85;
                    } else {
                      break L85;
                    }
                  } else {
                    if (var6 == 0) {
                      sc.field_f = 0;
                      break L85;
                    } else {
                      sc.field_f = sc.field_f ^ var6;
                      break L85;
                    }
                  }
                }
              }
            }
            L86: {
              stackOut_100_0 = (mo) var28;
              stackIn_102_0 = stackOut_100_0;
              stackIn_101_0 = stackOut_100_0;
              if (var4_int == 0) {
                stackOut_102_0 = (mo) (Object) stackIn_102_0;
                stackOut_102_1 = 0;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                break L86;
              } else {
                stackOut_101_0 = (mo) (Object) stackIn_101_0;
                stackOut_101_1 = 1;
                stackIn_103_0 = stackOut_101_0;
                stackIn_103_1 = stackOut_101_1;
                break L86;
              }
            }
            L87: {
              stackIn_103_0.field_Z = stackIn_103_1 != 0;
              if (!param1) {
                L88: {
                  stackOut_113_0 = (mo) var28;
                  stackIn_115_0 = stackOut_113_0;
                  stackIn_114_0 = stackOut_113_0;
                  if ((var6 & param0.field_fc) == 0) {
                    stackOut_115_0 = (mo) (Object) stackIn_115_0;
                    stackOut_115_1 = 0;
                    stackIn_116_0 = stackOut_115_0;
                    stackIn_116_1 = stackOut_115_1;
                    break L88;
                  } else {
                    stackOut_114_0 = (mo) (Object) stackIn_114_0;
                    stackOut_114_1 = 1;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_116_1 = stackOut_114_1;
                    break L88;
                  }
                }
                stackIn_116_0.field_Ab = stackIn_116_1 != 0;
                break L87;
              } else {
                if (var6 == 0) {
                  L89: {
                    stackOut_109_0 = (mo) var28;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (sc.field_f != 0) {
                      stackOut_111_0 = (mo) (Object) stackIn_111_0;
                      stackOut_111_1 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L89;
                    } else {
                      stackOut_110_0 = (mo) (Object) stackIn_110_0;
                      stackOut_110_1 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L89;
                    }
                  }
                  stackIn_112_0.field_Ab = stackIn_112_1 != 0;
                  break L87;
                } else {
                  L90: {
                    stackOut_105_0 = (mo) var28;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_106_0 = stackOut_105_0;
                    if ((var6 & sc.field_f) == 0) {
                      stackOut_107_0 = (mo) (Object) stackIn_107_0;
                      stackOut_107_1 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      break L90;
                    } else {
                      stackOut_106_0 = (mo) (Object) stackIn_106_0;
                      stackOut_106_1 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      break L90;
                    }
                  }
                  stackIn_108_0.field_Ab = stackIn_108_1 != 0;
                  break L87;
                }
              }
            }
            var6++;
            continue L31;
          }
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
        fm var17 = null;
        fm var18 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        ((ld) this).field_Tb = -1;
        try {
          L0: {
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
            L1: while (true) {
              if (((ld) this).field_Ob <= var13) {
                ((ld) this).field_Vb = ((ld) this).field_Vb + (tb.field_v.field_z + 10);
                this.b(12, 11183);
                break L0;
              } else {
                L2: {
                  if (((ld) this).field_Pb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + hm.a(-81, ((ld) this).field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != ((ld) this).field_Fb[var13]) {
                      break L4;
                    } else {
                      if (-1 != ((ld) this).field_Qb[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = (Object) (Object) tb.field_v;
                  break L3;
                }
                L5: {
                  ((ld) this).field_Gb[var13] = new mo(0L, param2, (cj) null, param3, (ja) var14, param6[var13]);
                  ((ld) this).a((byte) 50, (cj) (Object) ((ld) this).field_Gb[var13]);
                  var15 = var17.a(param6[var13]);
                  if (((ld) this).field_Vb >= var15) {
                    break L5;
                  } else {
                    ((ld) this).field_Vb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var10;
            stackOut_13_1 = new StringBuilder().append("ld.<init>(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param5 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param6 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param7 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
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
              if (((ld) this).field_Hb > 0) {
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
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
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
                var3 = null;
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
            stackOut_5_0 = (String) var2;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("ld.FA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw fa.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
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
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 < 0) {
                break L1;
              } else {
                if (param5 >= ep.field_h) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if (param6 >= 0) {
                        break L2;
                      } else {
                        if (0 <= param3) {
                          break L2;
                        } else {
                          return;
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
                        if (ep.field_i <= param3) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == -12628) {
                    L4: {
                      var14 = param1 - param5;
                      if (param5 == param2) {
                        L5: {
                          if (param1 == param5) {
                            var11 = 0;
                            var10 = param6 << 16;
                            var12 = 0;
                            var9_int = param4 << 16;
                            break L5;
                          } else {
                            var15 = -param2 + param1;
                            if (param6 > param4) {
                              var10 = param6 << 16;
                              var12 = (param3 - param6 << 16) / var15;
                              var11 = (param3 + -param4 << 16) / var14;
                              var9_int = param4 << 16;
                              break L5;
                            } else {
                              var10 = param4 << 16;
                              var11 = (-param6 + param3 << 16) / var15;
                              var12 = (-param4 + param3 << 16) / var14;
                              var9_int = param6 << 16;
                              break L5;
                            }
                          }
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
                      } else {
                        L6: {
                          var10 = param4 << 16;
                          var9_int = param4 << 16;
                          var15 = -param5 + param2;
                          var11 = (param6 + -param4 << 16) / var15;
                          var12 = (-param4 + param3 << 16) / var14;
                          if (var11 >= var12) {
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L6;
                          } else {
                            var13 = 0;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            if (0 > param5) {
                              if (param2 >= 0) {
                                param5 = -param5;
                                var9_int = var9_int + var11 * param5;
                                var10 = var10 + var12 * param5;
                                param5 = 0;
                                break L8;
                              } else {
                                param5 = param2 + -param5;
                                var9_int = var9_int + param5 * var11;
                                var10 = var10 + var12 * param5;
                                param5 = param2;
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var16 = ep.field_a[param5];
                          L9: while (true) {
                            if (param5 >= param2) {
                              break L7;
                            } else {
                              L10: {
                                var17 = var9_int >> 16;
                                if (var17 >= ep.field_i) {
                                  break L10;
                                } else {
                                  var18 = -(var9_int >> 16) + (var10 >> 16);
                                  if (var18 != 0) {
                                    L11: {
                                      if (ep.field_i <= var18 + var17) {
                                        var18 = -1 + -var17 + ep.field_i;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    if (var17 < 0) {
                                      so.a(param7, true, var16, var18 + var17, param8);
                                      break L10;
                                    } else {
                                      so.a(param7, true, var17 + var16, var18, param8);
                                      break L10;
                                    }
                                  } else {
                                    if (0 > var17) {
                                      break L10;
                                    } else {
                                      if (ep.field_i > var17) {
                                        so.a(param7, true, var16 + var17, var18, param8);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              param5++;
                              if (param5 >= ep.field_h) {
                                return;
                              } else {
                                var9_int = var9_int + var11;
                                var16 = var16 + oo.field_b;
                                var10 = var10 + var12;
                                continue L9;
                              }
                            }
                          }
                        }
                        var16 = param1 + -param2;
                        if (var16 != 0) {
                          L12: {
                            var17 = param3 << 16;
                            if (var13 != 0) {
                              var10 = param6 << 16;
                              break L12;
                            } else {
                              var9_int = param6 << 16;
                              break L12;
                            }
                          }
                          var11 = (var17 + -var9_int) / var16;
                          var12 = (-var10 + var17) / var16;
                          break L4;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        }
                      }
                    }
                    L13: {
                      if (param5 >= 0) {
                        break L13;
                      } else {
                        param5 = -param5;
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + param5 * var11;
                        param5 = 0;
                        break L13;
                      }
                    }
                    var15 = ep.field_a[param5];
                    L14: while (true) {
                      if (param1 <= param5) {
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> 16;
                          if (var16 < ep.field_i) {
                            var17 = (var10 >> 16) - (var9_int >> 16);
                            if (0 != var17) {
                              L16: {
                                if (var16 - -var17 >= ep.field_i) {
                                  var17 = -1 + -var16 + ep.field_i;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (var16 >= 0) {
                                so.a(param7, true, var15 + var16, var17, param8);
                                break L15;
                              } else {
                                so.a(param7, true, var15, var17 - -var16, param8);
                                break L15;
                              }
                            } else {
                              if (var16 < 0) {
                                break L15;
                              } else {
                                if (var16 < ep.field_i) {
                                  so.a(param7, true, var16 - -var15, var17, param8);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        param5++;
                        if (ep.field_h > param5) {
                          var9_int = var9_int + var11;
                          var15 = var15 + oo.field_b;
                          var10 = var10 + var12;
                          continue L14;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var9;
            stackOut_78_1 = new StringBuilder().append("ld.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param7 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L17;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L17;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 44 + param8 + 41);
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
            if (((ld) this).field_Tb != -1) {
                if (null != ((ld) this).field_Fb[((ld) this).field_Tb]) {
                    var2 = ((ld) this).field_Fb[((ld) this).field_Tb].k(param0) ? 1 : 0;
                }
            }
        }
        return var2 != 0;
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
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
          if (~param1 == ~((ld) this).field_Tb) {
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
              if (((ld) this).field_Qb[param1] == -1) {
                qd.c(4024);
                fh.b(31706);
                break L1;
              } else {
                L2: {
                  var5 = 32768 | ((ld) this).field_Qb[param1];
                  var6 = va.field_a;
                  if (var6 != 0) {
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
                  if (ga.a(var6, true) != 2) {
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
