/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends tga {
    static int[] field_q;
    static int field_r;

    wp(lu param0) {
        this(param0.b(16711935), param0.b(16711935));
    }

    wp(int param0, int param1) {
        super(param0, param1);
        this.field_j = 3;
    }

    private final void a(ub param0, int param1, int param2, byte param3) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        op var6 = null;
        ad var7 = null;
        gj var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var8 = param0.field_o;
              if (param3 == 83) {
                break L1;
              } else {
                field_r = -32;
                break L1;
              }
            }
            L2: {
              var6 = var8.field_h;
              if (-1 < (param2 ^ -1)) {
                break L2;
              } else {
                if (var6.field_z > param2) {
                  L3: {
                    if (0 > param1) {
                      break L3;
                    } else {
                      if (param1 < var6.field_B) {
                        var7 = var8.a(param1, false, param2);
                        if (var7 != null) {
                          discarded$2 = var7.field_s.g(48, 45);
                          param0.a(27799, new ek(var8, var7, 45));
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("wp.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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
              return;
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2, op param3) {
        boolean discarded$2 = false;
        aga var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (param3.field_z > param2) {
                  L2: {
                    if (-1 < (param1 ^ -1)) {
                      break L2;
                    } else {
                      if (param3.field_B > param1) {
                        L3: {
                          var5 = param3.field_a[param2][param1].field_l;
                          if (var5 != null) {
                            discarded$2 = var5.g(-94, 45);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        L4: {
                          if (param0 == -116) {
                            break L4;
                          } else {
                            field_r = -38;
                            break L4;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5_ref);
            stackOut_12_1 = new StringBuilder().append("wp.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    public static void b(int param0) {
        field_q = null;
        if (param0 <= 58) {
            wp.b(44);
        }
    }

    final void a(boolean param0, op param1) {
        try {
            this.a((byte) -116, this.field_o, this.field_n, param1);
            this.a((byte) -116, this.field_o, -1 + this.field_n, param1);
            this.a((byte) -116, this.field_o, 1 + this.field_n, param1);
            this.a((byte) -116, this.field_o - 1, this.field_n, param1);
            this.a((byte) -116, this.field_o - -1, this.field_n, param1);
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "wp.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, uha param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        gna[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        gna var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
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
        gna var28 = null;
        gna var29 = null;
        gna[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        gna stackIn_33_0 = null;
        gna stackIn_34_0 = null;
        gna stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        gna stackIn_40_0 = null;
        gna stackIn_41_0 = null;
        gna stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_71_0 = 0;
        gna stackIn_86_0 = null;
        gna stackIn_87_0 = null;
        gna stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        gna stackIn_93_0 = null;
        boolean stackIn_93_1 = false;
        gna stackIn_94_0 = null;
        boolean stackIn_94_1 = false;
        gna stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        int stackIn_95_2 = 0;
        gna stackIn_97_0 = null;
        gna stackIn_98_0 = null;
        gna stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        gna stackIn_101_0 = null;
        gna stackIn_102_0 = null;
        gna stackIn_103_0 = null;
        gna stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_108_0 = 0;
        gna stackIn_121_0 = null;
        gna stackIn_122_0 = null;
        gna stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        gna stackIn_125_0 = null;
        gna stackIn_126_0 = null;
        gna stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        gna stackIn_130_0 = null;
        gna stackIn_131_0 = null;
        gna stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        gna stackIn_134_0 = null;
        gna stackIn_135_0 = null;
        gna stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        String stackIn_153_0 = null;
        gna stackIn_156_0 = null;
        gna stackIn_157_0 = null;
        gna stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        gna stackIn_159_0 = null;
        gna stackIn_160_0 = null;
        gna stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_224_0 = 0;
        gna stackIn_322_0 = null;
        gna stackIn_323_0 = null;
        gna stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        gna stackIn_328_0 = null;
        boolean stackIn_328_1 = false;
        gna stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        gna stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        int stackIn_330_2 = 0;
        gna stackIn_332_0 = null;
        gna stackIn_333_0 = null;
        gna stackIn_334_0 = null;
        gna stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        gna stackIn_337_0 = null;
        gna stackIn_338_0 = null;
        gna stackIn_339_0 = null;
        gna stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        RuntimeException stackIn_348_0 = null;
        StringBuilder stackIn_348_1 = null;
        RuntimeException stackIn_349_0 = null;
        StringBuilder stackIn_349_1 = null;
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        String stackIn_350_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        gna stackOut_32_0 = null;
        gna stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        gna stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        gna stackOut_39_0 = null;
        gna stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        gna stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        gna stackOut_96_0 = null;
        gna stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        gna stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        gna stackOut_92_0 = null;
        boolean stackOut_92_1 = false;
        gna stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        int stackOut_94_2 = 0;
        gna stackOut_93_0 = null;
        boolean stackOut_93_1 = false;
        int stackOut_93_2 = 0;
        gna stackOut_85_0 = null;
        gna stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        gna stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        gna stackOut_100_0 = null;
        gna stackOut_101_0 = null;
        gna stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        gna stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        Object stackOut_152_0 = null;
        String stackOut_151_0 = null;
        gna stackOut_155_0 = null;
        gna stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        gna stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        gna stackOut_158_0 = null;
        gna stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        gna stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_206_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_202_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        gna stackOut_331_0 = null;
        gna stackOut_332_0 = null;
        gna stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        gna stackOut_334_0 = null;
        int stackOut_334_1 = 0;
        gna stackOut_327_0 = null;
        boolean stackOut_327_1 = false;
        gna stackOut_329_0 = null;
        boolean stackOut_329_1 = false;
        int stackOut_329_2 = 0;
        gna stackOut_328_0 = null;
        boolean stackOut_328_1 = false;
        int stackOut_328_2 = 0;
        gna stackOut_321_0 = null;
        gna stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        gna stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        gna stackOut_336_0 = null;
        gna stackOut_337_0 = null;
        gna stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        gna stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        gna stackOut_120_0 = null;
        gna stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        gna stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        gna stackOut_133_0 = null;
        gna stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        gna stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        gna stackOut_129_0 = null;
        gna stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        gna stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        gna stackOut_124_0 = null;
        gna stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        gna stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        RuntimeException stackOut_347_0 = null;
        StringBuilder stackOut_347_1 = null;
        RuntimeException stackOut_349_0 = null;
        StringBuilder stackOut_349_1 = null;
        String stackOut_349_2 = null;
        RuntimeException stackOut_348_0 = null;
        StringBuilder stackOut_348_1 = null;
        String stackOut_348_2 = null;
        Object var31_ref = null;
        var26 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param3) {
                L2: {
                  if (ce.field_y) {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (ps.d(-122)) {
                    if (!param1.field_Zb) {
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
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = param0 ? 1 : 0;
                  if (!param3) {
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= 5) {
                        L8: {
                          if (!gd.field_n[0][2].field_E) {
                            break L8;
                          } else {
                            if (!ps.d(-117)) {
                              jja.field_m = lga.a(true, new String[]{pw.field_w.field_Jb}, wa.field_o);
                              break L8;
                            } else {
                              jja.field_m = qd.field_p;
                              break L8;
                            }
                          }
                        }
                        if (2 <= qha.field_c.length) {
                          L9: {
                            if (param3) {
                              if (aca.field_k != -1) {
                                stackOut_53_0 = 1;
                                stackIn_55_0 = stackOut_53_0;
                                break L9;
                              } else {
                                stackOut_52_0 = 0;
                                stackIn_55_0 = stackOut_52_0;
                                break L9;
                              }
                            } else {
                              stackOut_50_0 = 0;
                              stackIn_55_0 = stackOut_50_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_55_0;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            var7 = aca.field_k;
                            var8_int = 0;
                            L10: while (true) {
                              if (fia.field_r.length <= var8_int) {
                                break L6;
                              } else {
                                fia.field_r[var8_int] = (byte) 0;
                                var8_int++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L11: {
                          if (var4_int == 0) {
                            break L11;
                          } else {
                            if (gd.field_n[0][1 + var6].field_R == 0) {
                              break L11;
                            } else {
                              if (param1.field_Kb == var6) {
                                break L11;
                              } else {
                                param1.field_Kb = var6;
                                var5 = 1;
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackOut_32_0 = gd.field_n[0][1 + var6];
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_33_0 = stackOut_32_0;
                          if (var4_int == 0) {
                            stackOut_34_0 = (gna) ((Object) stackIn_34_0);
                            stackOut_34_1 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            break L12;
                          } else {
                            stackOut_33_0 = (gna) ((Object) stackIn_33_0);
                            stackOut_33_1 = 1;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_35_0.field_u = stackIn_35_1 != 0;
                          if (eaa.field_c) {
                            break L13;
                          } else {
                            if ((var6 ^ -1) == -4) {
                              gd.field_n[0][1 + var6].field_u = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackOut_39_0 = gd.field_n[0][var6 - -1];
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_40_0 = stackOut_39_0;
                          if (var6 != param1.field_Kb) {
                            stackOut_41_0 = (gna) ((Object) stackIn_41_0);
                            stackOut_41_1 = 0;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            break L14;
                          } else {
                            stackOut_40_0 = (gna) ((Object) stackIn_40_0);
                            stackOut_40_1 = 1;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            break L14;
                          }
                        }
                        stackIn_42_0.field_t = stackIn_42_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if (2 <= qha.field_c.length) {
                      L15: {
                        if (param3) {
                          if (aca.field_k != -1) {
                            stackOut_20_0 = 1;
                            stackIn_22_0 = stackOut_20_0;
                            break L15;
                          } else {
                            stackOut_19_0 = 0;
                            stackIn_22_0 = stackOut_19_0;
                            break L15;
                          }
                        } else {
                          stackOut_17_0 = 0;
                          stackIn_22_0 = stackOut_17_0;
                          break L15;
                        }
                      }
                      var6 = stackIn_22_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = aca.field_k;
                        var8_int = 0;
                        L16: while (true) {
                          if (fia.field_r.length <= var8_int) {
                            break L6;
                          } else {
                            fia.field_r[var8_int] = (byte) 0;
                            var8_int++;
                            continue L16;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                fia.field_r[var7 / 8] = (byte)mp.a((int) fia.field_r[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (!param3) {
                  stackOut_62_0 = 0;
                  stackIn_63_0 = stackOut_62_0;
                  break L17;
                } else {
                  stackOut_61_0 = -1;
                  stackIn_63_0 = stackOut_61_0;
                  break L17;
                }
              }
              var7 = stackIn_63_0;
              L18: while (true) {
                if (qha.field_c.length <= var7) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (aca.field_k != var7) {
                        stackOut_69_0 = 1;
                        stackIn_71_0 = stackOut_69_0;
                        break L19;
                      } else {
                        stackOut_68_0 = 0;
                        stackIn_71_0 = stackOut_68_0;
                        break L19;
                      }
                    } else {
                      stackOut_66_0 = 0;
                      stackIn_71_0 = stackOut_66_0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_71_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (gd.field_n[1][1 + var7].field_R != 0) {
                        if (!param3) {
                          var9 = qha.field_c[var7];
                          if (param1.field_Pb == var9) {
                            break L20;
                          } else {
                            var5 = 1;
                            param1.field_Pb = var9;
                            break L20;
                          }
                        } else {
                          if (var6 == 0) {
                            if (var7 != -1) {
                              fia.field_r[var7 / 8] = (byte)lt.a((int) fia.field_r[var7 / 8], 1 << dda.a(var7, 7));
                              break L20;
                            } else {
                              var9 = 0;
                              L21: while (true) {
                                if (var9 >= fia.field_r.length) {
                                  break L20;
                                } else {
                                  fia.field_r[var9] = (byte) 0;
                                  var9++;
                                  continue L21;
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (param3) {
                      if (0 != (var7 ^ -1)) {
                        L23: {
                          stackOut_96_0 = gd.field_n[1][var7 - -1];
                          stackIn_98_0 = stackOut_96_0;
                          stackIn_97_0 = stackOut_96_0;
                          if ((fia.field_r[var7 / 8] & 1 << (var7 & 7)) == 0) {
                            stackOut_98_0 = (gna) ((Object) stackIn_98_0);
                            stackOut_98_1 = 0;
                            stackIn_99_0 = stackOut_98_0;
                            stackIn_99_1 = stackOut_98_1;
                            break L23;
                          } else {
                            stackOut_97_0 = (gna) ((Object) stackIn_97_0);
                            stackOut_97_1 = 1;
                            stackIn_99_0 = stackOut_97_0;
                            stackIn_99_1 = stackOut_97_1;
                            break L23;
                          }
                        }
                        stackIn_99_0.field_t = stackIn_99_1 != 0;
                        break L22;
                      } else {
                        gd.field_n[1][var7 - -1].field_t = true;
                        var9 = 0;
                        L24: while (true) {
                          if (qha.field_c.length <= var9) {
                            break L22;
                          } else {
                            L25: {
                              stackOut_92_0 = gd.field_n[1][var7 - -1];
                              stackOut_92_1 = gd.field_n[1][var7 - -1].field_t;
                              stackIn_94_0 = stackOut_92_0;
                              stackIn_94_1 = stackOut_92_1;
                              stackIn_93_0 = stackOut_92_0;
                              stackIn_93_1 = stackOut_92_1;
                              if ((fia.field_r[var9 / 8] & 1 << (var9 & 7)) != 0) {
                                stackOut_94_0 = (gna) ((Object) stackIn_94_0);
                                stackOut_94_1 = stackIn_94_1;
                                stackOut_94_2 = 0;
                                stackIn_95_0 = stackOut_94_0;
                                stackIn_95_1 = stackOut_94_1;
                                stackIn_95_2 = stackOut_94_2;
                                break L25;
                              } else {
                                stackOut_93_0 = (gna) ((Object) stackIn_93_0);
                                stackOut_93_1 = stackIn_93_1;
                                stackOut_93_2 = 1;
                                stackIn_95_0 = stackOut_93_0;
                                stackIn_95_1 = stackOut_93_1;
                                stackIn_95_2 = stackOut_93_2;
                                break L25;
                              }
                            }
                            stackIn_95_0.field_t = stackIn_95_1 & stackIn_95_2 != 0;
                            var9++;
                            continue L24;
                          }
                        }
                      }
                    } else {
                      L26: {
                        var9 = qha.field_c[var7];
                        stackOut_85_0 = gd.field_n[1][var7 - -1];
                        stackIn_87_0 = stackOut_85_0;
                        stackIn_86_0 = stackOut_85_0;
                        if (var9 != param1.field_Pb) {
                          stackOut_87_0 = (gna) ((Object) stackIn_87_0);
                          stackOut_87_1 = 0;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          break L26;
                        } else {
                          stackOut_86_0 = (gna) ((Object) stackIn_86_0);
                          stackOut_86_1 = 1;
                          stackIn_88_0 = stackOut_86_0;
                          stackIn_88_1 = stackOut_86_1;
                          break L26;
                        }
                      }
                      stackIn_88_0.field_t = stackIn_88_1 != 0;
                      break L22;
                    }
                  }
                  L27: {
                    L28: {
                      stackOut_100_0 = gd.field_n[1][var7 - -1];
                      stackIn_103_0 = stackOut_100_0;
                      stackIn_101_0 = stackOut_100_0;
                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackOut_101_0 = (gna) ((Object) stackIn_101_0);
                        stackIn_103_0 = stackOut_101_0;
                        stackIn_102_0 = stackOut_101_0;
                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackOut_102_0 = (gna) ((Object) stackIn_102_0);
                          stackOut_102_1 = 1;
                          stackIn_104_0 = stackOut_102_0;
                          stackIn_104_1 = stackOut_102_1;
                          break L27;
                        }
                      }
                    }
                    stackOut_103_0 = (gna) ((Object) stackIn_103_0);
                    stackOut_103_1 = 0;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    break L27;
                  }
                  stackIn_104_0.field_u = stackIn_104_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (!param3) {
                stackOut_107_0 = 1;
                stackIn_108_0 = stackOut_107_0;
                break L29;
              } else {
                stackOut_106_0 = 0;
                stackIn_108_0 = stackOut_106_0;
                break L29;
              }
            }
            var6 = stackIn_108_0;
            L30: while (true) {
              if ((var6 ^ -1) <= -4) {
                L31: {
                  if (!param3) {
                    break L31;
                  } else {
                    if ((bma.field_u ^ -1) < -2) {
                      var6 = 0;
                      L32: while (true) {
                        if (var6 >= bma.field_u - -1) {
                          break L31;
                        } else {
                          L33: {
                            var29 = gd.field_n[3][var6];
                            if (var4_int == 0) {
                              break L33;
                            } else {
                              if (0 != var29.field_R) {
                                tq.field_h = var6;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            if (!var29.field_E) {
                              break L34;
                            } else {
                              if ((var6 ^ -1) < -1) {
                                L35: {
                                  if (null == md.field_p) {
                                    stackOut_152_0 = null;
                                    stackIn_153_0 = (String) ((Object) stackOut_152_0);
                                    break L35;
                                  } else {
                                    stackOut_151_0 = md.field_p[var6 - 1];
                                    stackIn_153_0 = stackOut_151_0;
                                    break L35;
                                  }
                                }
                                var8_ref = stackIn_153_0;
                                if (var8_ref == null) {
                                  break L34;
                                } else {
                                  jja.field_m = var8_ref;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                          L36: {
                            stackOut_155_0 = (gna) (var29);
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_156_0 = stackOut_155_0;
                            if (tq.field_h != var6) {
                              stackOut_157_0 = (gna) ((Object) stackIn_157_0);
                              stackOut_157_1 = 0;
                              stackIn_158_0 = stackOut_157_0;
                              stackIn_158_1 = stackOut_157_1;
                              break L36;
                            } else {
                              stackOut_156_0 = (gna) ((Object) stackIn_156_0);
                              stackOut_156_1 = 1;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_158_1 = stackOut_156_1;
                              break L36;
                            }
                          }
                          L37: {
                            stackIn_158_0.field_t = stackIn_158_1 != 0;
                            stackOut_158_0 = (gna) (var29);
                            stackIn_160_0 = stackOut_158_0;
                            stackIn_159_0 = stackOut_158_0;
                            if (var4_int == 0) {
                              stackOut_160_0 = (gna) ((Object) stackIn_160_0);
                              stackOut_160_1 = 0;
                              stackIn_161_0 = stackOut_160_0;
                              stackIn_161_1 = stackOut_160_1;
                              break L37;
                            } else {
                              stackOut_159_0 = (gna) ((Object) stackIn_159_0);
                              stackOut_159_1 = 1;
                              stackIn_161_0 = stackOut_159_0;
                              stackIn_161_1 = stackOut_159_1;
                              break L37;
                            }
                          }
                          stackIn_161_0.field_u = stackIn_161_1 != 0;
                          var6++;
                          continue L32;
                        }
                      }
                    } else {
                      break L31;
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L38: while (true) {
                  if (var7 >= ld.field_q) {
                    L39: {
                      if (var5 == 0) {
                        break L39;
                      } else {
                        if (!param3) {
                          bka.b(-112, param2);
                          break L39;
                        } else {
                          break L39;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L40: {
                      var30 = gd.field_n[var7 + 4];
                      var8 = var30;
                      if (param3) {
                        stackOut_166_0 = -1;
                        stackIn_167_0 = stackOut_166_0;
                        break L40;
                      } else {
                        stackOut_165_0 = 0;
                        stackIn_167_0 = stackOut_165_0;
                        break L40;
                      }
                    }
                    var9 = stackIn_167_0;
                    L41: while (true) {
                      if (var9 >= var30.length + -1) {
                        var6 = var6 + (255 & mja.field_s[var7]);
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
                          if (var4_int == 0) {
                            break L42;
                          } else {
                            if ((var9 ^ -1) > -1) {
                              break L42;
                            } else {
                              L43: {
                                if (null == wda.field_c) {
                                  break L43;
                                } else {
                                  if (wda.field_c[var7] == null) {
                                    break L43;
                                  } else {
                                    if ((wda.field_c[var7][var9] & (pn.field_d ^ -1)) <= 0) {
                                      break L43;
                                    } else {
                                      var14 = 1;
                                      var15 = ho.a(62, wda.field_c[var7][var9] & (pn.field_d ^ -1));
                                      break L43;
                                    }
                                  }
                                }
                              }
                              L44: {
                                if (hr.field_b == null) {
                                  break L44;
                                } else {
                                  if (hr.field_b[var7] != null) {
                                    if (dm.field_f > 0) {
                                      break L44;
                                    } else {
                                      if (!hr.field_b[var7][var9]) {
                                        break L44;
                                      } else {
                                        var10 = 1;
                                        break L44;
                                      }
                                    }
                                  } else {
                                    break L44;
                                  }
                                }
                              }
                              L45: {
                                if (null == re.field_F) {
                                  break L45;
                                } else {
                                  if (null == re.field_F[var7]) {
                                    break L45;
                                  } else {
                                    L46: {
                                      var16 = re.field_F[var7][var9];
                                      if (var16 == 0) {
                                        break L46;
                                      } else {
                                        if (bha.field_l) {
                                          break L46;
                                        } else {
                                          if (dm.field_f > 0) {
                                            break L46;
                                          } else {
                                            var10 = 1;
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                    if (var16 <= 0) {
                                      break L45;
                                    } else {
                                      if (wk.field_a < var16) {
                                        var12 = 1;
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (gma.field_c == null) {
                                  break L47;
                                } else {
                                  if (gma.field_c[var7] == null) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var16 = gma.field_c[var7][var9];
                                      if (0 >= var16) {
                                        break L48;
                                      } else {
                                        if (ui.field_q < var16) {
                                          var11 = 1;
                                          break L48;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L47;
                                    } else {
                                      if (bha.field_l) {
                                        break L47;
                                      } else {
                                        if (dm.field_f > 0) {
                                          break L47;
                                        } else {
                                          var10 = 1;
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (param3) {
                                  if (null != im.field_c) {
                                    if (null != im.field_c[var7]) {
                                      if (im.field_c[var7][var9]) {
                                        stackOut_209_0 = 1;
                                        stackIn_211_0 = stackOut_209_0;
                                        break L49;
                                      } else {
                                        stackOut_208_0 = 0;
                                        stackIn_211_0 = stackOut_208_0;
                                        break L49;
                                      }
                                    } else {
                                      stackOut_206_0 = 0;
                                      stackIn_211_0 = stackOut_206_0;
                                      break L49;
                                    }
                                  } else {
                                    stackOut_204_0 = 0;
                                    stackIn_211_0 = stackOut_204_0;
                                    break L49;
                                  }
                                } else {
                                  stackOut_202_0 = 0;
                                  stackIn_211_0 = stackOut_202_0;
                                  break L49;
                                }
                              }
                              var13 = stackIn_211_0;
                              break L42;
                            }
                          }
                        }
                        L50: {
                          if (-3 < (hea.field_r ^ -1)) {
                            break L50;
                          } else {
                            if (wga.field_q[12]) {
                              var12 = 0;
                              var10 = 0;
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
                          L52: {
                            if (var10 != 0) {
                              break L52;
                            } else {
                              if (var11 != 0) {
                                break L52;
                              } else {
                                if (var12 != 0) {
                                  break L52;
                                } else {
                                  if (var13 != 0) {
                                    break L52;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_223_0 = 0;
                                      stackIn_224_0 = stackOut_223_0;
                                      break L51;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_222_0 = 1;
                          stackIn_224_0 = stackOut_222_0;
                          break L51;
                        }
                        L53: {
                          var16 = stackIn_224_0;
                          fla.field_q = true;
                          if (var16 != 0) {
                            break L53;
                          } else {
                            if ((var9 ^ -1) > -1) {
                              break L53;
                            } else {
                              if (pha.field_h == null) {
                                break L53;
                              } else {
                                L54: {
                                  if (!param3) {
                                    break L54;
                                  } else {
                                    if (!ce.field_y) {
                                      break L54;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L55: {
                                  if (null != bja.field_o) {
                                    break L55;
                                  } else {
                                    ala.field_b = new boolean[ld.field_q];
                                    bja.field_o = new byte[ld.field_q];
                                    break L55;
                                  }
                                }
                                fla.field_q = false;
                                uu.field_yb = false;
                                var17_int = 0;
                                L56: while (true) {
                                  if (var17_int >= var7) {
                                    L57: {
                                      ub.a(0, param3, -96, var9, -1, param1, -1, var7);
                                      if (2 > hea.field_r) {
                                        break L57;
                                      } else {
                                        if (!wga.field_q[12]) {
                                          break L57;
                                        } else {
                                          fla.field_q = true;
                                          break L57;
                                        }
                                      }
                                    }
                                    if (!fla.field_q) {
                                      var16 = 1;
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  } else {
                                    ala.field_b[var17_int] = false;
                                    var17_int++;
                                    continue L56;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L58: {
                          var17 = var8[1 + var9];
                          if (var4_int == 0) {
                            break L58;
                          } else {
                            if (0 == var17.field_R) {
                              break L58;
                            } else {
                              if (param3) {
                                if (-1 == var9) {
                                  var18 = var6;
                                  L59: while (true) {
                                    if (-1 + (var30.length + var6) <= var18) {
                                      break L58;
                                    } else {
                                      sca.field_c[var18 / 8] = (byte)dda.a((int) sca.field_c[var18 / 8], 1 << dda.a(7, var18) ^ -1);
                                      var18++;
                                      continue L59;
                                    }
                                  }
                                } else {
                                  sca.field_c[(var9 + var6) / 8] = (byte)lt.a((int) sca.field_c[(var9 + var6) / 8], 1 << dda.a(7, var6 + var9));
                                  break L58;
                                }
                              } else {
                                if (var16 != 0) {
                                  break L58;
                                } else {
                                  if ((byte)var9 != param1.field_Eb[var7]) {
                                    param1.field_Eb[var7] = (byte)var9;
                                    var5 = 1;
                                    break L58;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L60: {
                          if (!param3) {
                            break L60;
                          } else {
                            if (var16 != 0) {
                              sca.field_c[(var6 + var9) / 8] = (byte)dda.a((int) sca.field_c[(var6 + var9) / 8], 1 << dda.a(var9 + var6, 7) ^ -1);
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                        }
                        L61: {
                          if (-1 < (var9 ^ -1)) {
                            break L61;
                          } else {
                            if (!var17.field_E) {
                              break L61;
                            } else {
                              L62: {
                                if (null != co.field_a) {
                                  if (null != co.field_a[var7]) {
                                    var18_ref_String = co.field_a[var7][var9];
                                    break L62;
                                  } else {
                                    var18_ref_String = null;
                                    break L62;
                                  }
                                } else {
                                  var18_ref_String = null;
                                  break L62;
                                }
                              }
                              L63: {
                                if (null != gk.field_c) {
                                  if (gk.field_c[var7] != null) {
                                    var19_ref = gk.field_c[var7][var9];
                                    break L63;
                                  } else {
                                    var19_ref = null;
                                    break L63;
                                  }
                                } else {
                                  var19_ref = null;
                                  break L63;
                                }
                              }
                              L64: {
                                var20 = null;
                                if (var19_ref == null) {
                                  break L64;
                                } else {
                                  if (!var19_ref.equals(var18_ref_String)) {
                                    var20 = var19_ref;
                                    break L64;
                                  } else {
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L66: {
                                      if (var11 == 0) {
                                        break L66;
                                      } else {
                                        var22_int = -ui.field_q + gma.field_c[var7][var9];
                                        if (1 != var22_int) {
                                          var21 = lga.a(true, new String[]{Integer.toString(var22_int)}, tv.field_p);
                                          var31_ref = var21;
                                          var21 = var31_ref;
                                          var31_ref = var21;
                                          var21 = var31_ref;
                                          break L66;
                                        } else {
                                          var21 = afa.field_k;
                                          break L66;
                                        }
                                      }
                                    }
                                    L67: {
                                      if (var12 == 0) {
                                        break L67;
                                      } else {
                                        var31 = lga.a(true, new String[]{Integer.toString(wk.field_a), Integer.toString(re.field_F[var7][var9])}, oca.field_o);
                                        var21 = var31;
                                        var21 = var31;
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L67;
                                        } else {
                                          var21 = var31;
                                          break L67;
                                        }
                                      }
                                    }
                                    if (var14 != 0) {
                                      L68: {
                                        var22_ref = df.field_q;
                                        if (0 >= var15) {
                                          break L68;
                                        } else {
                                          if (ffa.field_j == null) {
                                            break L68;
                                          } else {
                                            if (var15 > ffa.field_j.length) {
                                              break L68;
                                            } else {
                                              if (null == ffa.field_j[var15 + -1]) {
                                                break L68;
                                              } else {
                                                var22_ref = ffa.field_j[var15 - 1][0];
                                                break L68;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22_ref;
                                        break L65;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + var22_ref;
                                        break L65;
                                      }
                                    } else {
                                      break L65;
                                    }
                                  } else {
                                    var21 = ph.field_N;
                                    break L65;
                                  }
                                } else {
                                  var21 = hk.field_a;
                                  break L65;
                                }
                              }
                              L69: {
                                if (var4_int == 0) {
                                  break L69;
                                } else {
                                  if (!fla.field_q) {
                                    L70: {
                                      var22_ref = null;
                                      var23 = 0;
                                      if (uu.field_yb) {
                                        var22_ref = "</col>" + gb.field_j + "<col=A00000>";
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var21 = var22_ref;
                                        break L70;
                                      } else {
                                        break L70;
                                      }
                                    }
                                    var24 = 0;
                                    L71: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 == 0) {
                                          var21 = lga.a(true, new String[]{var22_ref}, l.field_s);
                                          break L69;
                                        } else {
                                          var21 = gf.field_i + var22_ref;
                                          break L69;
                                        }
                                      } else {
                                        if (ala.field_b[var24]) {
                                          L72: {
                                            var25 = "</col>" + kka.field_k[var24] + "<col=A00000>";
                                            var22_ref = var25;
                                            var21 = var22_ref;
                                            var22_ref = var25;
                                            if (var22_ref == null) {
                                              var22_ref = var25;
                                              var21 = var22_ref;
                                              var21 = var22_ref;
                                              break L72;
                                            } else {
                                              var22_ref = var22_ref + ", " + var25;
                                              var23 = 1;
                                              break L72;
                                            }
                                          }
                                          var24++;
                                          continue L71;
                                        } else {
                                          var24++;
                                          continue L71;
                                        }
                                      }
                                    }
                                  } else {
                                    break L69;
                                  }
                                }
                              }
                              L73: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = qm.a("<br><col=A00000>", "<br>", var32, -1);
                                  if (var20 == null) {
                                    var20 = var33;
                                    break L73;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L73;
                                  }
                                } else {
                                  break L73;
                                }
                              }
                              if (var20 == null) {
                                break L61;
                              } else {
                                jja.field_m = (String) (var20);
                                break L61;
                              }
                            }
                          }
                        }
                        L74: {
                          if (!param3) {
                            L75: {
                              L76: {
                                stackOut_331_0 = (gna) (var17);
                                stackIn_334_0 = stackOut_331_0;
                                stackIn_332_0 = stackOut_331_0;
                                if (!fla.field_q) {
                                  break L76;
                                } else {
                                  stackOut_332_0 = (gna) ((Object) stackIn_332_0);
                                  stackIn_334_0 = stackOut_332_0;
                                  stackIn_333_0 = stackOut_332_0;
                                  if ((byte)var9 != param1.field_Eb[var7]) {
                                    break L76;
                                  } else {
                                    stackOut_333_0 = (gna) ((Object) stackIn_333_0);
                                    stackOut_333_1 = 1;
                                    stackIn_335_0 = stackOut_333_0;
                                    stackIn_335_1 = stackOut_333_1;
                                    break L75;
                                  }
                                }
                              }
                              stackOut_334_0 = (gna) ((Object) stackIn_334_0);
                              stackOut_334_1 = 0;
                              stackIn_335_0 = stackOut_334_0;
                              stackIn_335_1 = stackOut_334_1;
                              break L75;
                            }
                            stackIn_335_0.field_t = stackIn_335_1 != 0;
                            break L74;
                          } else {
                            if (0 == (var9 ^ -1)) {
                              var17.field_t = true;
                              var27 = var6;
                              var18 = var27;
                              L77: while (true) {
                                if (var27 >= var6 - -var30.length + -1) {
                                  break L74;
                                } else {
                                  L78: {
                                    stackOut_327_0 = (gna) (var17);
                                    stackOut_327_1 = var17.field_t;
                                    stackIn_329_0 = stackOut_327_0;
                                    stackIn_329_1 = stackOut_327_1;
                                    stackIn_328_0 = stackOut_327_0;
                                    stackIn_328_1 = stackOut_327_1;
                                    if (-1 != (sca.field_c[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                      stackOut_329_0 = (gna) ((Object) stackIn_329_0);
                                      stackOut_329_1 = stackIn_329_1;
                                      stackOut_329_2 = 0;
                                      stackIn_330_0 = stackOut_329_0;
                                      stackIn_330_1 = stackOut_329_1;
                                      stackIn_330_2 = stackOut_329_2;
                                      break L78;
                                    } else {
                                      stackOut_328_0 = (gna) ((Object) stackIn_328_0);
                                      stackOut_328_1 = stackIn_328_1;
                                      stackOut_328_2 = 1;
                                      stackIn_330_0 = stackOut_328_0;
                                      stackIn_330_1 = stackOut_328_1;
                                      stackIn_330_2 = stackOut_328_2;
                                      break L78;
                                    }
                                  }
                                  stackIn_330_0.field_t = stackIn_330_1 & stackIn_330_2 != 0;
                                  var27++;
                                  continue L77;
                                }
                              }
                            } else {
                              L79: {
                                stackOut_321_0 = (gna) (var17);
                                stackIn_323_0 = stackOut_321_0;
                                stackIn_322_0 = stackOut_321_0;
                                if ((sca.field_c[(var9 + var6) / 8] & 1 << (var9 + var6 & 7)) == 0) {
                                  stackOut_323_0 = (gna) ((Object) stackIn_323_0);
                                  stackOut_323_1 = 0;
                                  stackIn_324_0 = stackOut_323_0;
                                  stackIn_324_1 = stackOut_323_1;
                                  break L79;
                                } else {
                                  stackOut_322_0 = (gna) ((Object) stackIn_322_0);
                                  stackOut_322_1 = 1;
                                  stackIn_324_0 = stackOut_322_0;
                                  stackIn_324_1 = stackOut_322_1;
                                  break L79;
                                }
                              }
                              stackIn_324_0.field_t = stackIn_324_1 != 0;
                              break L74;
                            }
                          }
                        }
                        L80: {
                          L81: {
                            stackOut_336_0 = (gna) (var17);
                            stackIn_339_0 = stackOut_336_0;
                            stackIn_337_0 = stackOut_336_0;
                            if (var4_int == 0) {
                              break L81;
                            } else {
                              stackOut_337_0 = (gna) ((Object) stackIn_337_0);
                              stackIn_339_0 = stackOut_337_0;
                              stackIn_338_0 = stackOut_337_0;
                              if (var16 != 0) {
                                break L81;
                              } else {
                                stackOut_338_0 = (gna) ((Object) stackIn_338_0);
                                stackOut_338_1 = 1;
                                stackIn_340_0 = stackOut_338_0;
                                stackIn_340_1 = stackOut_338_1;
                                break L80;
                              }
                            }
                          }
                          stackOut_339_0 = (gna) ((Object) stackIn_339_0);
                          stackOut_339_1 = 0;
                          stackIn_340_0 = stackOut_339_0;
                          stackIn_340_1 = stackOut_339_1;
                          break L80;
                        }
                        stackIn_340_0.field_u = stackIn_340_1 != 0;
                        var9++;
                        continue L41;
                      }
                    }
                  }
                }
              } else {
                L82: {
                  var28 = gd.field_n[2][var6];
                  if (var4_int == 0) {
                    break L82;
                  } else {
                    if (var28.field_R != 0) {
                      if (param3) {
                        if (-1 != (var6 ^ -1)) {
                          ena.field_n = ena.field_n ^ var6;
                          break L82;
                        } else {
                          ena.field_n = 0;
                          break L82;
                        }
                      } else {
                        if (var6 != param1.field_Lb) {
                          param1.field_Lb = var6;
                          var5 = 1;
                          break L82;
                        } else {
                          break L82;
                        }
                      }
                    } else {
                      break L82;
                    }
                  }
                }
                L83: {
                  stackOut_120_0 = (gna) (var28);
                  stackIn_122_0 = stackOut_120_0;
                  stackIn_121_0 = stackOut_120_0;
                  if (var4_int == 0) {
                    stackOut_122_0 = (gna) ((Object) stackIn_122_0);
                    stackOut_122_1 = 0;
                    stackIn_123_0 = stackOut_122_0;
                    stackIn_123_1 = stackOut_122_1;
                    break L83;
                  } else {
                    stackOut_121_0 = (gna) ((Object) stackIn_121_0);
                    stackOut_121_1 = 1;
                    stackIn_123_0 = stackOut_121_0;
                    stackIn_123_1 = stackOut_121_1;
                    break L83;
                  }
                }
                L84: {
                  stackIn_123_0.field_u = stackIn_123_1 != 0;
                  if (param3) {
                    if (0 == var6) {
                      L85: {
                        stackOut_133_0 = (gna) (var28);
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_134_0 = stackOut_133_0;
                        if (0 != ena.field_n) {
                          stackOut_135_0 = (gna) ((Object) stackIn_135_0);
                          stackOut_135_1 = 0;
                          stackIn_136_0 = stackOut_135_0;
                          stackIn_136_1 = stackOut_135_1;
                          break L85;
                        } else {
                          stackOut_134_0 = (gna) ((Object) stackIn_134_0);
                          stackOut_134_1 = 1;
                          stackIn_136_0 = stackOut_134_0;
                          stackIn_136_1 = stackOut_134_1;
                          break L85;
                        }
                      }
                      stackIn_136_0.field_t = stackIn_136_1 != 0;
                      break L84;
                    } else {
                      L86: {
                        stackOut_129_0 = (gna) (var28);
                        stackIn_131_0 = stackOut_129_0;
                        stackIn_130_0 = stackOut_129_0;
                        if (-1 == (ena.field_n & var6 ^ -1)) {
                          stackOut_131_0 = (gna) ((Object) stackIn_131_0);
                          stackOut_131_1 = 0;
                          stackIn_132_0 = stackOut_131_0;
                          stackIn_132_1 = stackOut_131_1;
                          break L86;
                        } else {
                          stackOut_130_0 = (gna) ((Object) stackIn_130_0);
                          stackOut_130_1 = 1;
                          stackIn_132_0 = stackOut_130_0;
                          stackIn_132_1 = stackOut_130_1;
                          break L86;
                        }
                      }
                      stackIn_132_0.field_t = stackIn_132_1 != 0;
                      break L84;
                    }
                  } else {
                    L87: {
                      stackOut_124_0 = (gna) (var28);
                      stackIn_126_0 = stackOut_124_0;
                      stackIn_125_0 = stackOut_124_0;
                      if ((var6 & param1.field_Lb) == 0) {
                        stackOut_126_0 = (gna) ((Object) stackIn_126_0);
                        stackOut_126_1 = 0;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        break L87;
                      } else {
                        stackOut_125_0 = (gna) ((Object) stackIn_125_0);
                        stackOut_125_1 = 1;
                        stackIn_127_0 = stackOut_125_0;
                        stackIn_127_1 = stackOut_125_1;
                        break L87;
                      }
                    }
                    stackIn_127_0.field_t = stackIn_127_1 != 0;
                    break L84;
                  }
                }
                var6++;
                continue L30;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L88: {
            var4 = decompiledCaughtException;
            stackOut_347_0 = (RuntimeException) (var4);
            stackOut_347_1 = new StringBuilder().append("wp.H(").append(param0).append(',');
            stackIn_349_0 = stackOut_347_0;
            stackIn_349_1 = stackOut_347_1;
            stackIn_348_0 = stackOut_347_0;
            stackIn_348_1 = stackOut_347_1;
            if (param1 == null) {
              stackOut_349_0 = (RuntimeException) ((Object) stackIn_349_0);
              stackOut_349_1 = (StringBuilder) ((Object) stackIn_349_1);
              stackOut_349_2 = "null";
              stackIn_350_0 = stackOut_349_0;
              stackIn_350_1 = stackOut_349_1;
              stackIn_350_2 = stackOut_349_2;
              break L88;
            } else {
              stackOut_348_0 = (RuntimeException) ((Object) stackIn_348_0);
              stackOut_348_1 = (StringBuilder) ((Object) stackIn_348_1);
              stackOut_348_2 = "{...}";
              stackIn_350_0 = stackOut_348_0;
              stackIn_350_1 = stackOut_348_1;
              stackIn_350_2 = stackOut_348_2;
              break L88;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_350_0), stackIn_350_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(ub param0, int param1) {
        RuntimeException var3 = null;
        gj var4 = null;
        gj var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            if (param1 <= -2) {
              L1: {
                var4 = param0.field_o;
                var5 = var4;
                if (-38 == (var4.field_h.field_a[this.field_n][this.field_o].field_n ^ -1)) {
                  param0.a(27799, new iu(8, 128));
                  break L1;
                } else {
                  param0.a(27799, new iu(60, 128));
                  break L1;
                }
              }
              param0.a(27799, new fha(new dw(var5, this.field_n, this.field_o)));
              this.a(param0, this.field_o, this.field_n, (byte) 83);
              this.a(param0, this.field_o, -1 + this.field_n, (byte) 83);
              this.a(param0, this.field_o, this.field_n - -1, (byte) 83);
              this.a(param0, this.field_o - 1, this.field_n, (byte) 83);
              this.a(param0, 1 + this.field_o, this.field_n, (byte) 83);
              super.a(false, var5.field_h);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("wp.B(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_q = new int[5];
    }
}
