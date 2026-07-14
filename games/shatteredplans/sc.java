/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends ka {
    private ln field_r;
    static String field_p;
    private ln[] field_t;
    static boolean field_q;
    private int field_s;

    final int a(int param0, int param1, fs param2) {
        if (null != ((sc) this).field_r) {
            if (!(((sc) this).field_r.field_y != param2)) {
                return 4;
            }
        }
        if (param1 != 0) {
            field_q = true;
        }
        return super.a(param0, param1 + 0, param2);
    }

    public final void a(byte param0) {
        int var2 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        ln[] var8 = null;
        ln var9 = null;
        ln[] var10 = null;
        ln var11 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var8 = ((sc) this).field_g.field_g.field_e;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var8.length) {
            ((sc) this).field_t = new ln[var2];
            var2 = 0;
            var10 = ((sc) this).field_g.field_g.field_e;
            var7 = 0;
            var4 = var7;
            L1: while (true) {
              if (var10.length <= var7) {
                super.a(param0);
                return;
              } else {
                var11 = var10[var7];
                if (var11.field_L >= 1) {
                  if (var11.field_y != ((sc) this).field_n) {
                    var2++;
                    ((sc) this).field_t[var2] = var11;
                    var7++;
                    continue L1;
                  } else {
                    var7++;
                    continue L1;
                  }
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            var9 = var8[var4];
            if ((var9.field_L ^ -1) <= -2) {
              if (((sc) this).field_n != var9.field_y) {
                var2++;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final int b(ln param0, int param1) {
        if (param1 < 41) {
            Object var5 = null;
            sc.a(-12, false, (fb) null, -124);
        }
        int var3 = param0.field_R == null ? 0 : param0.field_R.field_r;
        int var4 = ((sc) this).a(-5, param0) + 2 * (param0.field_x + var3);
        return var4 == 0 ? 1 : var4;
    }

    final int c(ln param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        var3 = super.c(param0, param1);
        var4 = param0.field_p;
        var5 = 2147483647;
        var6 = ((sc) this).field_t;
        var7 = 0;
        L0: while (true) {
          if (var6.length <= var7) {
            L1: {
              if (((sc) this).field_s <= var5) {
                break L1;
              } else {
                // wide iinc 3 1000
                break L1;
              }
            }
            return var3;
          } else {
            var8 = var6[var7];
            var9 = ((sc) this).field_g.field_g.field_c[var4][var8.field_p];
            if (var5 > var9) {
              var5 = var9;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_p = null;
        if (param0 != 97) {
            sc.f((byte) -65);
        }
    }

    final static void a(int param0, boolean param1, fb param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        sg[] var9 = null;
        String var9_ref = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        sg var18 = null;
        int var18_int = 0;
        int var19 = 0;
        Object var19_ref = null;
        String var19_ref_String = null;
        Object var20 = null;
        String var20_ref = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        int var23_int = 0;
        String var23_ref = null;
        int var24 = 0;
        int var25 = 0;
        String var26 = null;
        int var27 = 0;
        int var28 = 0;
        sg var29 = null;
        sg var30 = null;
        sg[] var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        sg stackIn_21_0 = null;
        sg stackIn_22_0 = null;
        sg stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        sg stackIn_28_0 = null;
        sg stackIn_29_0 = null;
        sg stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        sg stackIn_68_0 = null;
        sg stackIn_69_0 = null;
        sg stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        sg stackIn_73_0 = null;
        sg stackIn_74_0 = null;
        sg stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        sg stackIn_79_0 = null;
        boolean stackIn_79_1 = false;
        sg stackIn_80_0 = null;
        boolean stackIn_80_1 = false;
        sg stackIn_81_0 = null;
        boolean stackIn_81_1 = false;
        int stackIn_81_2 = 0;
        sg stackIn_89_0 = null;
        sg stackIn_90_0 = null;
        sg stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        sg stackIn_94_0 = null;
        sg stackIn_95_0 = null;
        sg stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        sg stackIn_100_0 = null;
        boolean stackIn_100_1 = false;
        sg stackIn_101_0 = null;
        boolean stackIn_101_1 = false;
        sg stackIn_102_0 = null;
        boolean stackIn_102_1 = false;
        int stackIn_102_2 = 0;
        sg stackIn_104_0 = null;
        sg stackIn_105_0 = null;
        sg stackIn_106_0 = null;
        sg stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_111_0 = 0;
        sg stackIn_123_0 = null;
        sg stackIn_124_0 = null;
        sg stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        sg stackIn_128_0 = null;
        sg stackIn_129_0 = null;
        sg stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        sg stackIn_132_0 = null;
        sg stackIn_133_0 = null;
        sg stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        sg stackIn_136_0 = null;
        sg stackIn_137_0 = null;
        sg stackIn_138_0 = null;
        int stackIn_138_1 = 0;
        String stackIn_153_0 = null;
        sg stackIn_156_0 = null;
        sg stackIn_157_0 = null;
        sg stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        sg stackIn_159_0 = null;
        sg stackIn_160_0 = null;
        sg stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_230_0 = 0;
        sg stackIn_329_0 = null;
        sg stackIn_330_0 = null;
        sg stackIn_331_0 = null;
        sg stackIn_332_0 = null;
        int stackIn_332_1 = 0;
        sg stackIn_337_0 = null;
        boolean stackIn_337_1 = false;
        sg stackIn_338_0 = null;
        boolean stackIn_338_1 = false;
        sg stackIn_339_0 = null;
        boolean stackIn_339_1 = false;
        int stackIn_339_2 = 0;
        sg stackIn_341_0 = null;
        sg stackIn_342_0 = null;
        sg stackIn_343_0 = null;
        int stackIn_343_1 = 0;
        sg stackIn_345_0 = null;
        sg stackIn_346_0 = null;
        sg stackIn_347_0 = null;
        sg stackIn_348_0 = null;
        int stackIn_348_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        sg stackOut_20_0 = null;
        sg stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        sg stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        sg stackOut_27_0 = null;
        sg stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        sg stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        sg stackOut_78_0 = null;
        boolean stackOut_78_1 = false;
        sg stackOut_80_0 = null;
        boolean stackOut_80_1 = false;
        int stackOut_80_2 = 0;
        sg stackOut_79_0 = null;
        boolean stackOut_79_1 = false;
        int stackOut_79_2 = 0;
        sg stackOut_72_0 = null;
        sg stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        sg stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        sg stackOut_67_0 = null;
        sg stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        sg stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        sg stackOut_99_0 = null;
        boolean stackOut_99_1 = false;
        sg stackOut_101_0 = null;
        boolean stackOut_101_1 = false;
        int stackOut_101_2 = 0;
        sg stackOut_100_0 = null;
        boolean stackOut_100_1 = false;
        int stackOut_100_2 = 0;
        sg stackOut_93_0 = null;
        sg stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        sg stackOut_94_0 = null;
        int stackOut_94_1 = 0;
        sg stackOut_88_0 = null;
        sg stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        sg stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        sg stackOut_103_0 = null;
        sg stackOut_104_0 = null;
        sg stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        sg stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        Object stackOut_152_0 = null;
        String stackOut_151_0 = null;
        sg stackOut_155_0 = null;
        sg stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        sg stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        sg stackOut_158_0 = null;
        sg stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        sg stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_219_0 = 0;
        sg stackOut_340_0 = null;
        sg stackOut_342_0 = null;
        int stackOut_342_1 = 0;
        sg stackOut_341_0 = null;
        int stackOut_341_1 = 0;
        sg stackOut_336_0 = null;
        boolean stackOut_336_1 = false;
        sg stackOut_338_0 = null;
        boolean stackOut_338_1 = false;
        int stackOut_338_2 = 0;
        sg stackOut_337_0 = null;
        boolean stackOut_337_1 = false;
        int stackOut_337_2 = 0;
        sg stackOut_328_0 = null;
        sg stackOut_329_0 = null;
        sg stackOut_330_0 = null;
        int stackOut_330_1 = 0;
        sg stackOut_331_0 = null;
        int stackOut_331_1 = 0;
        sg stackOut_344_0 = null;
        sg stackOut_345_0 = null;
        sg stackOut_346_0 = null;
        int stackOut_346_1 = 0;
        sg stackOut_347_0 = null;
        int stackOut_347_1 = 0;
        sg stackOut_122_0 = null;
        sg stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        sg stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        sg stackOut_135_0 = null;
        sg stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        sg stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        sg stackOut_131_0 = null;
        sg stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        sg stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        sg stackOut_127_0 = null;
        sg stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        sg stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        L0: {
          var27 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param1) {
            L1: {
              if (ip.a((byte) -92)) {
                if (!param2.field_Ab) {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_11_0 = stackOut_8_0;
                  break L1;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_11_0 = stackOut_6_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (k.field_i) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_4_0;
            break L0;
          }
        }
        L3: {
          var5 = -12 / ((param0 - -47) / 49);
          var6 = 0;
          if (param1) {
            break L3;
          } else {
            var7 = 0;
            L4: while (true) {
              if ((var7 ^ -1) <= -6) {
                if (fk.field_p[0][2].field_v) {
                  if (!ip.a((byte) -126)) {
                    dn.field_k = re.a(ef.field_b, 4371, new String[1]);
                    break L3;
                  } else {
                    dn.field_k = po.field_c;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                L5: {
                  if (var4 == 0) {
                    break L5;
                  } else {
                    if (fk.field_p[0][1 + var7].field_rb == 0) {
                      break L5;
                    } else {
                      if (param2.field_nc != var7) {
                        param2.field_nc = var7;
                        var6 = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  stackOut_20_0 = fk.field_p[0][1 + var7];
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if (var4 == 0) {
                    stackOut_22_0 = (sg) (Object) stackIn_22_0;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L6;
                  } else {
                    stackOut_21_0 = (sg) (Object) stackIn_21_0;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L6;
                  }
                }
                L7: {
                  stackIn_23_0.field_s = stackIn_23_1 != 0;
                  if (ns.field_pb) {
                    break L7;
                  } else {
                    if (var7 == 3) {
                      fk.field_p[0][var7 + 1].field_s = false;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  stackOut_27_0 = fk.field_p[0][1 + var7];
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_28_0 = stackOut_27_0;
                  if (param2.field_nc != var7) {
                    stackOut_29_0 = (sg) (Object) stackIn_29_0;
                    stackOut_29_1 = 0;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    break L8;
                  } else {
                    stackOut_28_0 = (sg) (Object) stackIn_28_0;
                    stackOut_28_1 = 1;
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_30_1 = stackOut_28_1;
                    break L8;
                  }
                }
                stackIn_30_0.field_bb = stackIn_30_1 != 0;
                var7++;
                continue L4;
              }
            }
          }
        }
        L9: {
          if (nl.field_a.length > -3) {
            break L9;
          } else {
            L10: {
              if (param1) {
                if (0 != ih.field_d) {
                  stackOut_41_0 = 1;
                  stackIn_43_0 = stackOut_41_0;
                  break L10;
                } else {
                  stackOut_40_0 = 0;
                  stackIn_43_0 = stackOut_40_0;
                  break L10;
                }
              } else {
                stackOut_38_0 = 0;
                stackIn_43_0 = stackOut_38_0;
                break L10;
              }
            }
            L11: {
              var7 = stackIn_43_0;
              if (var7 == 0) {
                break L11;
              } else {
                var8 = ih.field_d;
                var9_int = 0;
                L12: while (true) {
                  if (var9_int >= id.field_c.length) {
                    id.field_c[var8 / 8] = (byte)ee.a((int) id.field_c[var8 / 8], 1 << var8 % 8);
                    break L11;
                  } else {
                    id.field_c[var9_int] = (byte) 0;
                    var9_int++;
                    continue L12;
                  }
                }
              }
            }
            L13: {
              if (param1) {
                stackOut_50_0 = -1;
                stackIn_51_0 = stackOut_50_0;
                break L13;
              } else {
                stackOut_49_0 = 0;
                stackIn_51_0 = stackOut_49_0;
                break L13;
              }
            }
            var8 = stackIn_51_0;
            L14: while (true) {
              if (var8 >= nl.field_a.length) {
                break L9;
              } else {
                L15: {
                  if (var7 != 0) {
                    if (var8 != ih.field_d) {
                      stackOut_57_0 = 1;
                      stackIn_59_0 = stackOut_57_0;
                      break L15;
                    } else {
                      stackOut_56_0 = 0;
                      stackIn_59_0 = stackOut_56_0;
                      break L15;
                    }
                  } else {
                    stackOut_54_0 = 0;
                    stackIn_59_0 = stackOut_54_0;
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    var9_int = stackIn_59_0;
                    if (var4 == 0) {
                      break L17;
                    } else {
                      if (0 == fk.field_p[1][1 + var8].field_rb) {
                        break L17;
                      } else {
                        if (param1) {
                          if (var7 == 0) {
                            if (var8 == -1) {
                              var10 = 0;
                              L18: while (true) {
                                if (id.field_c.length <= var10) {
                                  break L17;
                                } else {
                                  id.field_c[var10] = (byte) 0;
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              id.field_c[var8 / 8] = (byte)nc.a((int) id.field_c[var8 / 8], 1 << we.a(7, var8));
                              break L17;
                            }
                          } else {
                            if (param1) {
                              if (-1 == var8) {
                                fk.field_p[1][1 + var8].field_bb = true;
                                var10 = 0;
                                L19: while (true) {
                                  if (var10 >= nl.field_a.length) {
                                    break L16;
                                  } else {
                                    L20: {
                                      stackOut_78_0 = fk.field_p[1][1 + var8];
                                      stackOut_78_1 = fk.field_p[1][1 + var8].field_bb;
                                      stackIn_80_0 = stackOut_78_0;
                                      stackIn_80_1 = stackOut_78_1;
                                      stackIn_79_0 = stackOut_78_0;
                                      stackIn_79_1 = stackOut_78_1;
                                      if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                                        stackOut_80_0 = (sg) (Object) stackIn_80_0;
                                        stackOut_80_1 = stackIn_80_1;
                                        stackOut_80_2 = 0;
                                        stackIn_81_0 = stackOut_80_0;
                                        stackIn_81_1 = stackOut_80_1;
                                        stackIn_81_2 = stackOut_80_2;
                                        break L20;
                                      } else {
                                        stackOut_79_0 = (sg) (Object) stackIn_79_0;
                                        stackOut_79_1 = stackIn_79_1;
                                        stackOut_79_2 = 1;
                                        stackIn_81_0 = stackOut_79_0;
                                        stackIn_81_1 = stackOut_79_1;
                                        stackIn_81_2 = stackOut_79_2;
                                        break L20;
                                      }
                                    }
                                    stackIn_81_0.field_bb = stackIn_81_1 & stackIn_81_2 != 0;
                                    var10++;
                                    continue L19;
                                  }
                                }
                              } else {
                                L21: {
                                  stackOut_72_0 = fk.field_p[1][var8 + 1];
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (-1 == (id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1)) {
                                    stackOut_74_0 = (sg) (Object) stackIn_74_0;
                                    stackOut_74_1 = 0;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    break L21;
                                  } else {
                                    stackOut_73_0 = (sg) (Object) stackIn_73_0;
                                    stackOut_73_1 = 1;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    break L21;
                                  }
                                }
                                stackIn_75_0.field_bb = stackIn_75_1 != 0;
                                break L16;
                              }
                            } else {
                              L22: {
                                var10 = nl.field_a[var8];
                                stackOut_67_0 = fk.field_p[1][var8 - -1];
                                stackIn_69_0 = stackOut_67_0;
                                stackIn_68_0 = stackOut_67_0;
                                if (var10 != param2.field_Eb) {
                                  stackOut_69_0 = (sg) (Object) stackIn_69_0;
                                  stackOut_69_1 = 0;
                                  stackIn_70_0 = stackOut_69_0;
                                  stackIn_70_1 = stackOut_69_1;
                                  break L22;
                                } else {
                                  stackOut_68_0 = (sg) (Object) stackIn_68_0;
                                  stackOut_68_1 = 1;
                                  stackIn_70_0 = stackOut_68_0;
                                  stackIn_70_1 = stackOut_68_1;
                                  break L22;
                                }
                              }
                              stackIn_70_0.field_bb = stackIn_70_1 != 0;
                              break L16;
                            }
                          }
                        } else {
                          var10 = nl.field_a[var8];
                          if (var10 != param2.field_Eb) {
                            var6 = 1;
                            param2.field_Eb = var10;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                      }
                    }
                  }
                  if (param1) {
                    if (-1 == var8) {
                      fk.field_p[1][1 + var8].field_bb = true;
                      var10 = 0;
                      L23: while (true) {
                        if (var10 >= nl.field_a.length) {
                          break L16;
                        } else {
                          L24: {
                            stackOut_99_0 = fk.field_p[1][1 + var8];
                            stackOut_99_1 = fk.field_p[1][1 + var8].field_bb;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_101_1 = stackOut_99_1;
                            stackIn_100_0 = stackOut_99_0;
                            stackIn_100_1 = stackOut_99_1;
                            if (-1 != (id.field_c[var10 / 8] & 1 << (var10 & 7) ^ -1)) {
                              stackOut_101_0 = (sg) (Object) stackIn_101_0;
                              stackOut_101_1 = stackIn_101_1;
                              stackOut_101_2 = 0;
                              stackIn_102_0 = stackOut_101_0;
                              stackIn_102_1 = stackOut_101_1;
                              stackIn_102_2 = stackOut_101_2;
                              break L24;
                            } else {
                              stackOut_100_0 = (sg) (Object) stackIn_100_0;
                              stackOut_100_1 = stackIn_100_1;
                              stackOut_100_2 = 1;
                              stackIn_102_0 = stackOut_100_0;
                              stackIn_102_1 = stackOut_100_1;
                              stackIn_102_2 = stackOut_100_2;
                              break L24;
                            }
                          }
                          stackIn_102_0.field_bb = stackIn_102_1 & stackIn_102_2 != 0;
                          var10++;
                          continue L23;
                        }
                      }
                    } else {
                      L25: {
                        stackOut_93_0 = fk.field_p[1][var8 + 1];
                        stackIn_95_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if (-1 == (id.field_c[var8 / 8] & 1 << (var8 & 7) ^ -1)) {
                          stackOut_95_0 = (sg) (Object) stackIn_95_0;
                          stackOut_95_1 = 0;
                          stackIn_96_0 = stackOut_95_0;
                          stackIn_96_1 = stackOut_95_1;
                          break L25;
                        } else {
                          stackOut_94_0 = (sg) (Object) stackIn_94_0;
                          stackOut_94_1 = 1;
                          stackIn_96_0 = stackOut_94_0;
                          stackIn_96_1 = stackOut_94_1;
                          break L25;
                        }
                      }
                      stackIn_96_0.field_bb = stackIn_96_1 != 0;
                      break L16;
                    }
                  } else {
                    L26: {
                      var10 = nl.field_a[var8];
                      stackOut_88_0 = fk.field_p[1][var8 - -1];
                      stackIn_90_0 = stackOut_88_0;
                      stackIn_89_0 = stackOut_88_0;
                      if (var10 != param2.field_Eb) {
                        stackOut_90_0 = (sg) (Object) stackIn_90_0;
                        stackOut_90_1 = 0;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        break L26;
                      } else {
                        stackOut_89_0 = (sg) (Object) stackIn_89_0;
                        stackOut_89_1 = 1;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_91_1 = stackOut_89_1;
                        break L26;
                      }
                    }
                    stackIn_91_0.field_bb = stackIn_91_1 != 0;
                    break L16;
                  }
                }
                L27: {
                  L28: {
                    stackOut_103_0 = fk.field_p[1][var8 + 1];
                    stackIn_106_0 = stackOut_103_0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var4 == 0) {
                      break L28;
                    } else {
                      stackOut_104_0 = (sg) (Object) stackIn_104_0;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (var9_int != 0) {
                        break L28;
                      } else {
                        stackOut_105_0 = (sg) (Object) stackIn_105_0;
                        stackOut_105_1 = 1;
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_107_1 = stackOut_105_1;
                        break L27;
                      }
                    }
                  }
                  stackOut_106_0 = (sg) (Object) stackIn_106_0;
                  stackOut_106_1 = 0;
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  break L27;
                }
                stackIn_107_0.field_s = stackIn_107_1 != 0;
                var8++;
                continue L14;
              }
            }
          }
        }
        L29: {
          if (!param1) {
            stackOut_110_0 = 1;
            stackIn_111_0 = stackOut_110_0;
            break L29;
          } else {
            stackOut_109_0 = 0;
            stackIn_111_0 = stackOut_109_0;
            break L29;
          }
        }
        var7 = stackIn_111_0;
        L30: while (true) {
          if (3 <= var7) {
            L31: {
              if (!param1) {
                break L31;
              } else {
                if (mg.field_A <= 1) {
                  break L31;
                } else {
                  var7 = 0;
                  L32: while (true) {
                    if (var7 >= 1 + mg.field_A) {
                      break L31;
                    } else {
                      L33: {
                        var30 = fk.field_p[3][var7];
                        if (var4 == 0) {
                          break L33;
                        } else {
                          if (var30.field_rb != 0) {
                            qj.field_b = var7;
                            break L33;
                          } else {
                            break L33;
                          }
                        }
                      }
                      L34: {
                        if (!var30.field_v) {
                          break L34;
                        } else {
                          if (-1 > (var7 ^ -1)) {
                            L35: {
                              if (null == ec.field_v) {
                                stackOut_152_0 = null;
                                stackIn_153_0 = (String) (Object) stackOut_152_0;
                                break L35;
                              } else {
                                stackOut_151_0 = ec.field_v[-1 + var7];
                                stackIn_153_0 = stackOut_151_0;
                                break L35;
                              }
                            }
                            var9_ref = stackIn_153_0;
                            if (var9_ref == null) {
                              break L34;
                            } else {
                              dn.field_k = var9_ref;
                              break L34;
                            }
                          } else {
                            break L34;
                          }
                        }
                      }
                      L36: {
                        stackOut_155_0 = (sg) var30;
                        stackIn_157_0 = stackOut_155_0;
                        stackIn_156_0 = stackOut_155_0;
                        if (var4 == 0) {
                          stackOut_157_0 = (sg) (Object) stackIn_157_0;
                          stackOut_157_1 = 0;
                          stackIn_158_0 = stackOut_157_0;
                          stackIn_158_1 = stackOut_157_1;
                          break L36;
                        } else {
                          stackOut_156_0 = (sg) (Object) stackIn_156_0;
                          stackOut_156_1 = 1;
                          stackIn_158_0 = stackOut_156_0;
                          stackIn_158_1 = stackOut_156_1;
                          break L36;
                        }
                      }
                      L37: {
                        stackIn_158_0.field_s = stackIn_158_1 != 0;
                        stackOut_158_0 = (sg) var30;
                        stackIn_160_0 = stackOut_158_0;
                        stackIn_159_0 = stackOut_158_0;
                        if (qj.field_b != var7) {
                          stackOut_160_0 = (sg) (Object) stackIn_160_0;
                          stackOut_160_1 = 0;
                          stackIn_161_0 = stackOut_160_0;
                          stackIn_161_1 = stackOut_160_1;
                          break L37;
                        } else {
                          stackOut_159_0 = (sg) (Object) stackIn_159_0;
                          stackOut_159_1 = 1;
                          stackIn_161_0 = stackOut_159_0;
                          stackIn_161_1 = stackOut_159_1;
                          break L37;
                        }
                      }
                      stackIn_161_0.field_bb = stackIn_161_1 != 0;
                      var7++;
                      continue L32;
                    }
                  }
                }
              }
            }
            var7 = 0;
            var8 = 0;
            L38: while (true) {
              if (em.field_k <= var8) {
                L39: {
                  if (var6 == 0) {
                    break L39;
                  } else {
                    if (!param1) {
                      ti.a(param3, 0);
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                }
                return;
              } else {
                L40: {
                  var31 = fk.field_p[var8 + 4];
                  var9 = var31;
                  if (!param1) {
                    stackOut_166_0 = 0;
                    stackIn_167_0 = stackOut_166_0;
                    break L40;
                  } else {
                    stackOut_165_0 = -1;
                    stackIn_167_0 = stackOut_165_0;
                    break L40;
                  }
                }
                var10 = stackIn_167_0;
                L41: while (true) {
                  if (-1 + var31.length <= var10) {
                    var7 = var7 + (ks.field_e[var8] & 255);
                    var8++;
                    continue L38;
                  } else {
                    L42: {
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      var16 = 0;
                      if (var4 == 0) {
                        break L42;
                      } else {
                        if ((var10 ^ -1) > -1) {
                          break L42;
                        } else {
                          L43: {
                            if (ji.field_D == null) {
                              break L43;
                            } else {
                              if (null == ji.field_D[var8]) {
                                break L43;
                              } else {
                                if (((vr.field_m ^ -1) & ji.field_D[var8][var10] ^ -1) < -1) {
                                  var15 = 1;
                                  var16 = db.a(107, ji.field_D[var8][var10] & (vr.field_m ^ -1));
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            }
                          }
                          L44: {
                            if (td.field_E == null) {
                              break L44;
                            } else {
                              if (td.field_E[var8] != null) {
                                if (0 < es.field_m) {
                                  break L44;
                                } else {
                                  if (!td.field_E[var8][var10]) {
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
                          L45: {
                            if (null == ci.field_h) {
                              break L45;
                            } else {
                              if (null != ci.field_h[var8]) {
                                L46: {
                                  var17 = ci.field_h[var8][var10];
                                  if (var17 == 0) {
                                    break L46;
                                  } else {
                                    if (hm.field_o) {
                                      break L46;
                                    } else {
                                      if (es.field_m >= -1) {
                                        var11 = 1;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                                if (-1 >= var17) {
                                  break L45;
                                } else {
                                  if (var17 <= a.field_j) {
                                    break L45;
                                  } else {
                                    var13 = 1;
                                    break L45;
                                  }
                                }
                              } else {
                                break L45;
                              }
                            }
                          }
                          L47: {
                            if (pg.field_A == null) {
                              break L47;
                            } else {
                              if (null == pg.field_A[var8]) {
                                break L47;
                              } else {
                                L48: {
                                  var17 = pg.field_A[var8][var10];
                                  if (-1 <= (var17 ^ -1)) {
                                    break L48;
                                  } else {
                                    if (var17 <= bh.field_h) {
                                      break L48;
                                    } else {
                                      var12 = 1;
                                      break L48;
                                    }
                                  }
                                }
                                if (var17 == 0) {
                                  break L47;
                                } else {
                                  if (hm.field_o) {
                                    break L47;
                                  } else {
                                    if (es.field_m <= 0) {
                                      var11 = 1;
                                      break L47;
                                    } else {
                                      break L47;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L49: {
                            if (param1) {
                              if (nr.field_q != null) {
                                if (null != nr.field_q[var8]) {
                                  if (!nr.field_q[var8][var10]) {
                                    stackOut_211_0 = 0;
                                    stackIn_213_0 = stackOut_211_0;
                                    break L49;
                                  } else {
                                    stackOut_210_0 = 1;
                                    stackIn_213_0 = stackOut_210_0;
                                    break L49;
                                  }
                                } else {
                                  stackOut_208_0 = 0;
                                  stackIn_213_0 = stackOut_208_0;
                                  break L49;
                                }
                              } else {
                                stackOut_206_0 = 0;
                                stackIn_213_0 = stackOut_206_0;
                                break L49;
                              }
                            } else {
                              stackOut_204_0 = 0;
                              stackIn_213_0 = stackOut_204_0;
                              break L49;
                            }
                          }
                          var14 = stackIn_213_0;
                          break L42;
                        }
                      }
                    }
                    L50: {
                      if (bs.field_b < 2) {
                        break L50;
                      } else {
                        if (di.field_p[12]) {
                          var15 = 0;
                          var12 = 0;
                          var14 = 0;
                          var13 = 0;
                          var11 = 0;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                    }
                    L51: {
                      if (var11 == 0) {
                        if (var12 == 0) {
                          if (var13 == 0) {
                            if (var14 == 0) {
                              if (var15 != 0) {
                                stackOut_228_0 = 1;
                                stackIn_230_0 = stackOut_228_0;
                                break L51;
                              } else {
                                stackOut_227_0 = 0;
                                stackIn_230_0 = stackOut_227_0;
                                break L51;
                              }
                            } else {
                              stackOut_225_0 = 1;
                              stackIn_230_0 = stackOut_225_0;
                              break L51;
                            }
                          } else {
                            stackOut_223_0 = 1;
                            stackIn_230_0 = stackOut_223_0;
                            break L51;
                          }
                        } else {
                          stackOut_221_0 = 1;
                          stackIn_230_0 = stackOut_221_0;
                          break L51;
                        }
                      } else {
                        stackOut_219_0 = 1;
                        stackIn_230_0 = stackOut_219_0;
                        break L51;
                      }
                    }
                    L52: {
                      var17 = stackIn_230_0;
                      wg.field_d = true;
                      if (var17 != 0) {
                        break L52;
                      } else {
                        if (var10 < 0) {
                          break L52;
                        } else {
                          if (null == pe.field_D) {
                            break L52;
                          } else {
                            L53: {
                              if (!param1) {
                                break L53;
                              } else {
                                if (!k.field_i) {
                                  break L53;
                                } else {
                                  break L52;
                                }
                              }
                            }
                            L54: {
                              wg.field_d = false;
                              if (lr.field_c == null) {
                                lr.field_c = new byte[em.field_k];
                                ek.field_F = new boolean[em.field_k];
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            qd.field_h = false;
                            var18_int = 0;
                            L55: while (true) {
                              if (var18_int >= var8) {
                                L56: {
                                  js.a(-1, 1, param2, var8, 0, param1, var10, -1);
                                  if ((bs.field_b ^ -1) > -3) {
                                    break L56;
                                  } else {
                                    if (di.field_p[12]) {
                                      wg.field_d = true;
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                if (!wg.field_d) {
                                  var17 = 1;
                                  break L52;
                                } else {
                                  break L52;
                                }
                              } else {
                                ek.field_F[var18_int] = false;
                                var18_int++;
                                continue L55;
                              }
                            }
                          }
                        }
                      }
                    }
                    L57: {
                      var18 = var9[var10 - -1];
                      if (var4 != 0) {
                        L58: {
                          if (-1 != var18.field_rb) {
                            if (param1) {
                              if (var10 != -1) {
                                qj.field_f[(var10 - -var7) / 8] = (byte)nc.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(var10 + var7, 7));
                                break L58;
                              } else {
                                var19 = var7;
                                L59: while (true) {
                                  if (var19 < var31.length + (var7 - 1)) {
                                    qj.field_f[var19 / 8] = (byte)we.a((int) qj.field_f[var19 / 8], 1 << we.a(var19, 7) ^ -1);
                                    var19++;
                                    continue L59;
                                  } else {
                                    qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10) ^ -1);
                                    break L57;
                                  }
                                }
                              }
                            } else {
                              if (!param1) {
                                break L57;
                              } else {
                                qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10) ^ -1);
                                break L57;
                              }
                            }
                          } else {
                            break L58;
                          }
                        }
                        if (!param1) {
                          break L57;
                        } else {
                          qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10) ^ -1);
                          break L57;
                        }
                      } else {
                        if (!param1) {
                          break L57;
                        } else {
                          if (var17 == 0) {
                            break L57;
                          } else {
                            qj.field_f[(var10 - -var7) / 8] = (byte)we.a((int) qj.field_f[(var10 + var7) / 8], 1 << we.a(7, var7 + var10));
                            break L57;
                          }
                        }
                      }
                    }
                    L60: {
                      if ((var10 ^ -1) > -1) {
                        break L60;
                      } else {
                        if (var18.field_v) {
                          L61: {
                            if (wa.field_d == null) {
                              var19_ref = null;
                              break L61;
                            } else {
                              if (wa.field_d[var8] == null) {
                                var19_ref = null;
                                break L61;
                              } else {
                                var19_ref_String = wa.field_d[var8][var10];
                                break L61;
                              }
                            }
                          }
                          L62: {
                            if (ei.field_f == null) {
                              var20 = null;
                              break L62;
                            } else {
                              if (ei.field_f[var8] == null) {
                                var20 = null;
                                break L62;
                              } else {
                                var20_ref = ei.field_f[var8][var10];
                                break L62;
                              }
                            }
                          }
                          L63: {
                            var21 = null;
                            if (var20 == null) {
                              break L63;
                            } else {
                              if (((String) var20).equals(var19_ref)) {
                                break L63;
                              } else {
                                var21 = (String) var20;
                                break L63;
                              }
                            }
                          }
                          L64: {
                            var22 = null;
                            if (var14 == 0) {
                              if (var11 != 0) {
                                var22 = vd.field_r;
                                var23 = var22;
                                var26 = var23;
                                var23 = var26;
                                var22 = var23;
                                var26 = var22;
                                var23 = var26;
                                var26 = var23;
                                var23 = var26;
                                var22 = var23;
                                var23 = var26;
                                break L64;
                              } else {
                                L65: {
                                  if (var12 == 0) {
                                    break L65;
                                  } else {
                                    var23_int = -bh.field_h + pg.field_A[var8][var10];
                                    if (var23_int != 1) {
                                      var22 = re.a(nc.field_n, 4371, new String[1]);
                                      break L65;
                                    } else {
                                      var22 = ip.field_g;
                                      break L65;
                                    }
                                  }
                                }
                                L66: {
                                  if (var13 == 0) {
                                    break L66;
                                  } else {
                                    var32 = re.a(dh.field_d, 4371, new String[2]);
                                    var23 = var32;
                                    var26 = var23;
                                    var23 = var26;
                                    var22 = var23;
                                    var26 = var32;
                                    var23 = var26;
                                    if (var22 == null) {
                                      var22 = var32;
                                      break L66;
                                    } else {
                                      var22 = var22 + "<br>" + var32;
                                      break L66;
                                    }
                                  }
                                }
                                if (var15 == 0) {
                                  break L64;
                                } else {
                                  L67: {
                                    var23 = ar.field_e;
                                    if (0 >= var16) {
                                      break L67;
                                    } else {
                                      if (null == qa.field_s) {
                                        break L67;
                                      } else {
                                        if (var16 > qa.field_s.length) {
                                          break L67;
                                        } else {
                                          if (qa.field_s[var16 + -1] == null) {
                                            break L67;
                                          } else {
                                            var23_ref = qa.field_s[-1 + var16][0];
                                            break L67;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var22 != null) {
                                    var22 = var22 + "<br>" + var23_ref;
                                    break L64;
                                  } else {
                                    var22 = var23_ref;
                                    break L64;
                                  }
                                }
                              }
                            } else {
                              var22 = qh.field_D;
                              break L64;
                            }
                          }
                          L68: {
                            if (var4 == 0) {
                              break L68;
                            } else {
                              if (!wg.field_d) {
                                L69: {
                                  var23_ref = null;
                                  var24 = 0;
                                  if (qd.field_h) {
                                    var23 = "</col>" + wl.field_b + "<col=A00000>";
                                    var26 = var23;
                                    var23 = var26;
                                    var26 = var23;
                                    var23 = var26;
                                    var22 = var23;
                                    break L69;
                                  } else {
                                    break L69;
                                  }
                                }
                                var25 = 0;
                                L70: while (true) {
                                  if (var8 <= var25) {
                                    if (var24 == 0) {
                                      var22 = re.a(n.field_q, 4371, new String[1]);
                                      break L68;
                                    } else {
                                      var22 = mp.field_d + var23;
                                      break L68;
                                    }
                                  } else {
                                    if (ek.field_F[var25]) {
                                      var26 = "</col>" + gm.field_l[var25] + "<col=A00000>";
                                      var23 = var26;
                                      var22 = var23;
                                      var23 = var26;
                                      if (var23 == null) {
                                        var23 = var26;
                                        var22 = var23;
                                        var22 = var23;
                                        var25++;
                                        continue L70;
                                      } else {
                                        var23 = var23 + ", " + var26;
                                        var24 = 1;
                                        var25++;
                                        continue L70;
                                      }
                                    } else {
                                      var25++;
                                      continue L70;
                                    }
                                  }
                                }
                              } else {
                                break L68;
                              }
                            }
                          }
                          L71: {
                            if (var22 != null) {
                              var22 = "<col=A00000>" + var22;
                              var33 = qr.a(var22, (byte) -125, "<br><col=A00000>", "<br>");
                              if (var21 == null) {
                                var21 = var33;
                                break L71;
                              } else {
                                var21 = var21 + "<br>" + var33;
                                break L71;
                              }
                            } else {
                              break L71;
                            }
                          }
                          if (var21 == null) {
                            break L60;
                          } else {
                            dn.field_k = var21;
                            break L60;
                          }
                        } else {
                          break L60;
                        }
                      }
                    }
                    L72: {
                      if (param1) {
                        if (0 != (var10 ^ -1)) {
                          L73: {
                            stackOut_340_0 = (sg) var18;
                            stackIn_342_0 = stackOut_340_0;
                            stackIn_341_0 = stackOut_340_0;
                            if ((qj.field_f[(var7 + var10) / 8] & 1 << (7 & var10 + var7)) == 0) {
                              stackOut_342_0 = (sg) (Object) stackIn_342_0;
                              stackOut_342_1 = 0;
                              stackIn_343_0 = stackOut_342_0;
                              stackIn_343_1 = stackOut_342_1;
                              break L73;
                            } else {
                              stackOut_341_0 = (sg) (Object) stackIn_341_0;
                              stackOut_341_1 = 1;
                              stackIn_343_0 = stackOut_341_0;
                              stackIn_343_1 = stackOut_341_1;
                              break L73;
                            }
                          }
                          stackIn_343_0.field_bb = stackIn_343_1 != 0;
                          break L72;
                        } else {
                          var18.field_bb = true;
                          var28 = var7;
                          var19 = var28;
                          L74: while (true) {
                            if (var28 >= -1 + (var31.length + var7)) {
                              break L72;
                            } else {
                              L75: {
                                stackOut_336_0 = (sg) var18;
                                stackOut_336_1 = var18.field_bb;
                                stackIn_338_0 = stackOut_336_0;
                                stackIn_338_1 = stackOut_336_1;
                                stackIn_337_0 = stackOut_336_0;
                                stackIn_337_1 = stackOut_336_1;
                                if (-1 != (qj.field_f[var28 / 8] & 1 << (var28 & 7) ^ -1)) {
                                  stackOut_338_0 = (sg) (Object) stackIn_338_0;
                                  stackOut_338_1 = stackIn_338_1;
                                  stackOut_338_2 = 0;
                                  stackIn_339_0 = stackOut_338_0;
                                  stackIn_339_1 = stackOut_338_1;
                                  stackIn_339_2 = stackOut_338_2;
                                  break L75;
                                } else {
                                  stackOut_337_0 = (sg) (Object) stackIn_337_0;
                                  stackOut_337_1 = stackIn_337_1;
                                  stackOut_337_2 = 1;
                                  stackIn_339_0 = stackOut_337_0;
                                  stackIn_339_1 = stackOut_337_1;
                                  stackIn_339_2 = stackOut_337_2;
                                  break L75;
                                }
                              }
                              stackIn_339_0.field_bb = stackIn_339_1 & stackIn_339_2 != 0;
                              var28++;
                              continue L74;
                            }
                          }
                        }
                      } else {
                        L76: {
                          L77: {
                            stackOut_328_0 = (sg) var18;
                            stackIn_331_0 = stackOut_328_0;
                            stackIn_329_0 = stackOut_328_0;
                            if (!wg.field_d) {
                              break L77;
                            } else {
                              stackOut_329_0 = (sg) (Object) stackIn_329_0;
                              stackIn_331_0 = stackOut_329_0;
                              stackIn_330_0 = stackOut_329_0;
                              if (param2.field_dc[var8] != (byte)var10) {
                                break L77;
                              } else {
                                stackOut_330_0 = (sg) (Object) stackIn_330_0;
                                stackOut_330_1 = 1;
                                stackIn_332_0 = stackOut_330_0;
                                stackIn_332_1 = stackOut_330_1;
                                break L76;
                              }
                            }
                          }
                          stackOut_331_0 = (sg) (Object) stackIn_331_0;
                          stackOut_331_1 = 0;
                          stackIn_332_0 = stackOut_331_0;
                          stackIn_332_1 = stackOut_331_1;
                          break L76;
                        }
                        stackIn_332_0.field_bb = stackIn_332_1 != 0;
                        break L72;
                      }
                    }
                    L78: {
                      L79: {
                        stackOut_344_0 = (sg) var18;
                        stackIn_347_0 = stackOut_344_0;
                        stackIn_345_0 = stackOut_344_0;
                        if (var4 == 0) {
                          break L79;
                        } else {
                          stackOut_345_0 = (sg) (Object) stackIn_345_0;
                          stackIn_347_0 = stackOut_345_0;
                          stackIn_346_0 = stackOut_345_0;
                          if (var17 != 0) {
                            break L79;
                          } else {
                            stackOut_346_0 = (sg) (Object) stackIn_346_0;
                            stackOut_346_1 = 1;
                            stackIn_348_0 = stackOut_346_0;
                            stackIn_348_1 = stackOut_346_1;
                            break L78;
                          }
                        }
                      }
                      stackOut_347_0 = (sg) (Object) stackIn_347_0;
                      stackOut_347_1 = 0;
                      stackIn_348_0 = stackOut_347_0;
                      stackIn_348_1 = stackOut_347_1;
                      break L78;
                    }
                    stackIn_348_0.field_s = stackIn_348_1 != 0;
                    var10++;
                    continue L41;
                  }
                }
              }
            }
          } else {
            L80: {
              var29 = fk.field_p[2][var7];
              if (var4 == 0) {
                break L80;
              } else {
                if (var29.field_rb == 0) {
                  break L80;
                } else {
                  if (!param1) {
                    if (var7 != param2.field_Fb) {
                      var6 = 1;
                      param2.field_Fb = var7;
                      break L80;
                    } else {
                      break L80;
                    }
                  } else {
                    if (var7 == 0) {
                      rj.field_q = 0;
                      break L80;
                    } else {
                      rj.field_q = rj.field_q ^ var7;
                      break L80;
                    }
                  }
                }
              }
            }
            L81: {
              stackOut_122_0 = (sg) var29;
              stackIn_124_0 = stackOut_122_0;
              stackIn_123_0 = stackOut_122_0;
              if (var4 == 0) {
                stackOut_124_0 = (sg) (Object) stackIn_124_0;
                stackOut_124_1 = 0;
                stackIn_125_0 = stackOut_124_0;
                stackIn_125_1 = stackOut_124_1;
                break L81;
              } else {
                stackOut_123_0 = (sg) (Object) stackIn_123_0;
                stackOut_123_1 = 1;
                stackIn_125_0 = stackOut_123_0;
                stackIn_125_1 = stackOut_123_1;
                break L81;
              }
            }
            stackIn_125_0.field_s = stackIn_125_1 != 0;
            if (!param1) {
              L82: {
                stackOut_135_0 = (sg) var29;
                stackIn_137_0 = stackOut_135_0;
                stackIn_136_0 = stackOut_135_0;
                if (0 == (var7 & param2.field_Fb)) {
                  stackOut_137_0 = (sg) (Object) stackIn_137_0;
                  stackOut_137_1 = 0;
                  stackIn_138_0 = stackOut_137_0;
                  stackIn_138_1 = stackOut_137_1;
                  break L82;
                } else {
                  stackOut_136_0 = (sg) (Object) stackIn_136_0;
                  stackOut_136_1 = 1;
                  stackIn_138_0 = stackOut_136_0;
                  stackIn_138_1 = stackOut_136_1;
                  break L82;
                }
              }
              stackIn_138_0.field_bb = stackIn_138_1 != 0;
              var7++;
              continue L30;
            } else {
              if (0 == var7) {
                L83: {
                  stackOut_131_0 = (sg) var29;
                  stackIn_133_0 = stackOut_131_0;
                  stackIn_132_0 = stackOut_131_0;
                  if (0 != rj.field_q) {
                    stackOut_133_0 = (sg) (Object) stackIn_133_0;
                    stackOut_133_1 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    stackIn_134_1 = stackOut_133_1;
                    break L83;
                  } else {
                    stackOut_132_0 = (sg) (Object) stackIn_132_0;
                    stackOut_132_1 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    stackIn_134_1 = stackOut_132_1;
                    break L83;
                  }
                }
                stackIn_134_0.field_bb = stackIn_134_1 != 0;
                var7++;
                continue L30;
              } else {
                L84: {
                  stackOut_127_0 = (sg) var29;
                  stackIn_129_0 = stackOut_127_0;
                  stackIn_128_0 = stackOut_127_0;
                  if (0 == (var7 & rj.field_q)) {
                    stackOut_129_0 = (sg) (Object) stackIn_129_0;
                    stackOut_129_1 = 0;
                    stackIn_130_0 = stackOut_129_0;
                    stackIn_130_1 = stackOut_129_1;
                    break L84;
                  } else {
                    stackOut_128_0 = (sg) (Object) stackIn_128_0;
                    stackOut_128_1 = 1;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_130_1 = stackOut_128_1;
                    break L84;
                  }
                }
                stackIn_130_0.field_bb = stackIn_130_1 != 0;
                var7++;
                continue L30;
              }
            }
          }
        }
    }

    final int[] b(int param0) {
        int var2 = 10 % ((param0 - -48) / 61);
        return new int[]{14, 16};
    }

    sc(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 4);
        ((sc) this).field_r = null;
        ((sc) this).field_t = null;
    }

    final void e(byte param0) {
        ln var2 = null;
        int var3 = 0;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        qm var7 = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ln var14 = null;
        ln[] var15 = null;
        ln var16 = null;
        ln[] var17 = null;
        ln var18 = null;
        ln var18_ref = null;
        L0: {
          var12 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 101) {
            break L0;
          } else {
            ((sc) this).field_r = null;
            break L0;
          }
        }
        var2 = null;
        var3 = 0;
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((sc) this).field_o) {
            if (var2 == null) {
              return;
            } else {
              var4 = var2.field_p;
              var5 = null;
              var6 = 2147483647;
              var15 = ((sc) this).field_t;
              var8 = 0;
              L2: while (true) {
                if (var8 >= var15.length) {
                  L3: {
                    if (var5 == null) {
                      var17 = ((sc) this).field_t;
                      var13 = 0;
                      var8 = var13;
                      L4: while (true) {
                        if (var13 >= var17.length) {
                          break L3;
                        } else {
                          var18_ref = var17[var13];
                          var5 = var18_ref;
                          var5 = var18_ref;
                          var10 = var18_ref.field_p;
                          if (null != ((sc) this).field_r) {
                            if (((sc) this).field_r.field_R != var18_ref.field_R) {
                              if ((((sc) this).field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                                var11 = hs.field_i[var10];
                                if (var6 > var11) {
                                  var5 = var18_ref;
                                  var6 = var11;
                                  var13++;
                                  continue L4;
                                } else {
                                  var13++;
                                  continue L4;
                                }
                              } else {
                                var13++;
                                continue L4;
                              }
                            } else {
                              var13++;
                              continue L4;
                            }
                          } else {
                            var13++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    if (var5 != null) {
                      var7 = new qm(3, ((sc) this).field_n, var2, var5);
                      lh.field_G.a((byte) -113, (oh) (Object) var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                } else {
                  L6: {
                    var16 = var15[var8];
                    var5 = var16;
                    var18 = var16;
                    var5 = var18;
                    var10 = var16.field_p;
                    if (((sc) this).field_r == null) {
                      break L6;
                    } else {
                      if (((sc) this).field_r.field_R == var16.field_R) {
                        break L6;
                      } else {
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  if ((((sc) this).field_g.field_g.field_c[var4][var10] ^ -1) < -3) {
                    var11 = hs.field_i[var10];
                    if (var11 < var6) {
                      var5 = var16;
                      var6 = var11;
                      var8++;
                      continue L2;
                    } else {
                      var8++;
                      continue L2;
                    }
                  } else {
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var14 = ((sc) this).field_g.field_g.field_e[var4];
            var2 = var14;
            var2 = var14;
            if (var14.field_y == ((sc) this).field_n) {
              L7: {
                var6 = oe.field_i[var4];
                if (!var14.field_u) {
                  break L7;
                } else {
                  var6 = var6 * 2 - -5;
                  break L7;
                }
              }
              if (var6 > var3) {
                var2 = var14;
                var3 = var6;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void b(boolean param0) {
        ln var2 = null;
        int var3 = 0;
        int var4_int = 0;
        qm var4 = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = null;
        var3 = 0;
        var4_int = 0;
        L0: while (true) {
          if (var4_int >= ((sc) this).field_o) {
            L1: {
              if (param0) {
                break L1;
              } else {
                ((sc) this).a((byte) 23);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = new qm(2, ((sc) this).field_n, var2);
                lh.field_G.a((byte) -113, (oh) (Object) var4);
                break L2;
              }
            }
            return;
          } else {
            var5 = hs.field_i[var4_int];
            if (var5 != 0) {
              L3: {
                var6 = ((sc) this).field_g.field_g.field_e[var4_int];
                var2 = var6;
                var2 = var6;
                stackOut_4_0 = var6.field_x ^ -1;
                stackIn_6_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!var6.field_u) {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 10;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  break L3;
                } else {
                  stackOut_5_0 = stackIn_5_0;
                  stackOut_5_1 = 5;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L3;
                }
              }
              if (stackIn_7_0 <= (stackIn_7_1 ^ -1)) {
                L4: {
                  if (null == var6.field_y) {
                    if (-1 != (var6.field_L ^ -1)) {
                      break L4;
                    } else {
                      var4_int++;
                      continue L0;
                    }
                  } else {
                    var7 = ((sc) this).field_g.field_D[var6.field_y.field_x];
                    var8 = ((sc) this).field_g.field_D[((sc) this).field_n.field_x];
                    if (var7 <= var6.field_x * 4) {
                      break L4;
                    } else {
                      if (var8 <= 2 * var6.field_x) {
                        break L4;
                      } else {
                        var4_int++;
                        continue L0;
                      }
                    }
                  }
                }
                var7 = cb.field_o[var4_int];
                var8 = var5 * (var7 * var7);
                if (var3 < var8) {
                  var2 = var6;
                  var3 = var8;
                  var4_int++;
                  continue L0;
                } else {
                  var4_int++;
                  continue L0;
                }
              } else {
                var4_int++;
                continue L0;
              }
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, sd param1, byte param2) {
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        ((sc) this).field_r = null;
        ((sc) this).field_s = 2147483647;
        var4 = param1.j(18229);
        L0: while (true) {
          if (var4 == null) {
            super.a(param0, param1, param2);
            return;
          } else {
            var5 = var4.field_p;
            var6 = ((sc) this).field_t;
            var7 = 0;
            L1: while (true) {
              if (var6.length <= var7) {
                var4 = param1.h(-23410);
                continue L0;
              } else {
                var8 = var6[var7];
                var9 = ((sc) this).field_g.field_g.field_c[var5][var8.field_p];
                if (var9 < ((sc) this).field_s) {
                  ((sc) this).field_s = var9;
                  ((sc) this).field_r = var8;
                  var7++;
                  continue L1;
                } else {
                  var7++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = false;
        field_p = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
