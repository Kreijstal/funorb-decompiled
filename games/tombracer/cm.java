/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm implements bo {
    private int field_b;
    static qg[] field_a;

    public final void a(kh param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b = param0.h(255);
              if (param1 == -19) {
                break L1;
              } else {
                this.field_b = -24;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("cm.A(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        this.field_b = param0;
        if (param1 != 0) {
            field_a = (qg[]) null;
        }
    }

    public final void a(int param0, kh param1) {
        if (param0 != 200) {
            return;
        }
        try {
            param1.i(this.field_b, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "cm.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        L0: {
          var17 = TombRacer.field_G ? 1 : 0;
          if (param7 > 49) {
            break L0;
          } else {
            field_a = (qg[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 <= param12) {
              break L2;
            } else {
              L3: {
                if (param14 > param0) {
                  break L3;
                } else {
                  L4: {
                    if (param12 < param14) {
                      break L4;
                    } else {
                      ica.a(param12, param10, param2, param11, 0, param4, bea.field_l, param1, param8, param5, param3, param13, param15, param9, param6, param0, param14);
                      if (var17 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ica.a(param14, param2, param10, param1, 0, param4, bea.field_l, param11, param6, param5, param3, param13, param9, param15, param8, param0, param12);
                  if (var17 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              ica.a(param0, param2, param3, param5, 0, param6, bea.field_l, param11, param4, param1, param10, param9, param13, param15, param8, param14, param12);
              if (var17 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (param14 <= param12) {
              break L5;
            } else {
              ica.a(param12, param3, param2, param11, 0, param6, bea.field_l, param5, param8, param1, param10, param9, param15, param13, param4, param14, param0);
              if (var17 == 0) {
                break L1;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (param0 >= param14) {
              break L6;
            } else {
              ica.a(param14, param3, param10, param1, 0, param8, bea.field_l, param5, param6, param11, param2, param15, param9, param13, param4, param12, param0);
              if (var17 == 0) {
                break L1;
              } else {
                break L6;
              }
            }
          }
          ica.a(param0, param10, param3, param5, 0, param8, bea.field_l, param1, param4, param11, param2, param15, param13, param9, param6, param12, param14);
          break L1;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            field_a = (qg[]) null;
        }
    }

    final static void a(int param0, ht param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        tv[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        tv var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
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
        tv[] var27 = null;
        tv var28 = null;
        tv var29 = null;
        String var30 = null;
        String var31 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        tv stackIn_23_0 = null;
        tv stackIn_24_0 = null;
        tv stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        tv stackIn_29_0 = null;
        tv stackIn_30_0 = null;
        tv stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        tv stackIn_83_0 = null;
        tv stackIn_84_0 = null;
        tv stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        tv stackIn_90_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        tv stackIn_91_0 = null;
        boolean stackIn_91_1 = false;
        tv stackIn_92_0 = null;
        boolean stackIn_92_1 = false;
        tv stackIn_93_0 = null;
        boolean stackIn_93_1 = false;
        int stackIn_93_2 = 0;
        tv stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        tv stackIn_97_0 = null;
        tv stackIn_98_0 = null;
        tv stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        tv stackIn_101_0 = null;
        tv stackIn_102_0 = null;
        tv stackIn_103_0 = null;
        tv stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_112_0 = 0;
        tv stackIn_125_0 = null;
        tv stackIn_126_0 = null;
        tv stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        tv stackIn_130_0 = null;
        tv stackIn_131_0 = null;
        tv stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        tv stackIn_134_0 = null;
        tv stackIn_135_0 = null;
        tv stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        tv stackIn_138_0 = null;
        tv stackIn_139_0 = null;
        tv stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        int stackIn_143_0 = 0;
        int stackIn_149_0 = 0;
        String stackIn_157_0 = null;
        tv stackIn_160_0 = null;
        tv stackIn_161_0 = null;
        tv stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        tv stackIn_163_0 = null;
        tv stackIn_164_0 = null;
        tv stackIn_165_0 = null;
        int stackIn_165_1 = 0;
        int stackIn_167_0 = 0;
        boolean stackIn_172_0 = false;
        int stackIn_175_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_239_0 = 0;
        boolean stackIn_328_0 = false;
        int stackIn_335_0 = 0;
        tv stackIn_347_0 = null;
        boolean stackIn_347_1 = false;
        int stackIn_347_2 = 0;
        int stackIn_347_3 = 0;
        tv stackIn_348_0 = null;
        int stackIn_348_1 = 0;
        int stackIn_348_2 = 0;
        tv stackIn_349_0 = null;
        tv stackIn_350_0 = null;
        tv stackIn_351_0 = null;
        int stackIn_351_1 = 0;
        tv stackIn_355_0 = null;
        boolean stackIn_355_1 = false;
        int stackIn_355_2 = 0;
        int stackIn_355_3 = 0;
        tv stackIn_356_0 = null;
        boolean stackIn_356_1 = false;
        tv stackIn_357_0 = null;
        boolean stackIn_357_1 = false;
        tv stackIn_358_0 = null;
        boolean stackIn_358_1 = false;
        int stackIn_358_2 = 0;
        tv stackIn_361_0 = null;
        tv stackIn_362_0 = null;
        tv stackIn_363_0 = null;
        tv stackIn_364_0 = null;
        int stackIn_364_1 = 0;
        tv stackIn_366_0 = null;
        tv stackIn_367_0 = null;
        tv stackIn_368_0 = null;
        tv stackIn_369_0 = null;
        int stackIn_369_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_373_0 = 0;
        RuntimeException stackIn_379_0 = null;
        StringBuilder stackIn_379_1 = null;
        RuntimeException stackIn_380_0 = null;
        StringBuilder stackIn_380_1 = null;
        RuntimeException stackIn_381_0 = null;
        StringBuilder stackIn_381_1 = null;
        String stackIn_381_2 = null;
        Throwable caughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        tv stackOut_22_0 = null;
        tv stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        tv stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        tv stackOut_28_0 = null;
        tv stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        tv stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        boolean stackOut_32_0 = false;
        int stackOut_40_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_62_0 = 0;
        tv stackOut_82_0 = null;
        tv stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        tv stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        tv stackOut_89_0 = null;
        boolean stackOut_89_1 = false;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        tv stackOut_90_0 = null;
        boolean stackOut_90_1 = false;
        tv stackOut_91_0 = null;
        boolean stackOut_91_1 = false;
        int stackOut_91_2 = 0;
        tv stackOut_92_0 = null;
        boolean stackOut_92_1 = false;
        int stackOut_92_2 = 0;
        tv stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        byte stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        tv stackOut_96_0 = null;
        tv stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        tv stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        tv stackOut_100_0 = null;
        tv stackOut_101_0 = null;
        tv stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        tv stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        boolean stackOut_105_0 = false;
        int stackOut_107_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_111_0 = 0;
        tv stackOut_124_0 = null;
        tv stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        tv stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        tv stackOut_129_0 = null;
        tv stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        tv stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        tv stackOut_133_0 = null;
        tv stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        tv stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        tv stackOut_137_0 = null;
        tv stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        tv stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        boolean stackOut_142_0 = false;
        int stackOut_148_0 = 0;
        String stackOut_155_0 = null;
        Object stackOut_156_0 = null;
        tv stackOut_159_0 = null;
        tv stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        tv stackOut_161_0 = null;
        int stackOut_161_1 = 0;
        tv stackOut_162_0 = null;
        tv stackOut_163_0 = null;
        int stackOut_163_1 = 0;
        tv stackOut_164_0 = null;
        int stackOut_164_1 = 0;
        int stackOut_166_0 = 0;
        boolean stackOut_171_0 = false;
        int stackOut_173_0 = 0;
        int stackOut_174_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_237_0 = 0;
        int stackOut_238_0 = 0;
        boolean stackOut_327_0 = false;
        int stackOut_334_0 = 0;
        tv stackOut_346_0 = null;
        int stackOut_346_1 = 0;
        int stackOut_346_2 = 0;
        tv stackOut_347_0 = null;
        boolean stackOut_347_1 = false;
        int stackOut_347_2 = 0;
        tv stackOut_348_0 = null;
        tv stackOut_349_0 = null;
        int stackOut_349_1 = 0;
        tv stackOut_350_0 = null;
        int stackOut_350_1 = 0;
        tv stackOut_354_0 = null;
        boolean stackOut_354_1 = false;
        int stackOut_354_2 = 0;
        int stackOut_354_3 = 0;
        tv stackOut_355_0 = null;
        boolean stackOut_355_1 = false;
        tv stackOut_356_0 = null;
        boolean stackOut_356_1 = false;
        int stackOut_356_2 = 0;
        tv stackOut_357_0 = null;
        boolean stackOut_357_1 = false;
        int stackOut_357_2 = 0;
        tv stackOut_360_0 = null;
        tv stackOut_361_0 = null;
        tv stackOut_362_0 = null;
        int stackOut_362_1 = 0;
        tv stackOut_363_0 = null;
        int stackOut_363_1 = 0;
        tv stackOut_365_0 = null;
        tv stackOut_366_0 = null;
        tv stackOut_367_0 = null;
        int stackOut_367_1 = 0;
        tv stackOut_368_0 = null;
        int stackOut_368_1 = 0;
        int stackOut_370_0 = 0;
        int stackOut_372_0 = 0;
        RuntimeException stackOut_378_0 = null;
        StringBuilder stackOut_378_1 = null;
        RuntimeException stackOut_379_0 = null;
        StringBuilder stackOut_379_1 = null;
        String stackOut_379_2 = null;
        RuntimeException stackOut_380_0 = null;
        StringBuilder stackOut_380_1 = null;
        String stackOut_380_2 = null;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (param3) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (mka.b(8192)) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    stackOut_3_0 = 0;
                    stackIn_8_0 = stackOut_3_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 4: {
                    if (!param1.field_ec) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 0;
                    stackIn_8_0 = stackOut_5_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 6: {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var4_int = stackIn_8_0;
                    if (var26 == 0) {
                        statePc = 13;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (qa.field_o) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    stackOut_11_0 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    var4_int = stackIn_12_0;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    var5 = 0;
                    if (param3) {
                        statePc = 38;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var6 = 0;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-6 >= (var6 ^ -1)) {
                        statePc = 32;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = var4_int;
                    stackIn_33_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var26 != 0) {
                        statePc = 33;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    if (stackIn_17_0 == 0) {
                        statePc = 22;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    if (bf.field_b[0][1 + var6].field_y == 0) {
                        statePc = 22;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    if (var6 != param1.field_cc) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    param1.field_cc = var6;
                    var5 = 1;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    stackOut_22_0 = bf.field_b[0][var6 - -1];
                    stackIn_24_0 = stackOut_22_0;
                    stackIn_23_0 = stackOut_22_0;
                    if (var4_int == 0) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackOut_23_0 = (tv) ((Object) stackIn_23_0);
                    stackOut_23_1 = 1;
                    stackIn_25_0 = stackOut_23_0;
                    stackIn_25_1 = stackOut_23_1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackOut_24_0 = (tv) ((Object) stackIn_24_0);
                    stackOut_24_1 = 0;
                    stackIn_25_0 = stackOut_24_0;
                    stackIn_25_1 = stackOut_24_1;
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    stackIn_25_0.field_X = stackIn_25_1 != 0;
                    if (rca.field_p) {
                        statePc = 28;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    if (-4 != (var6 ^ -1)) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    bf.field_b[0][1 + var6].field_X = false;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackOut_28_0 = bf.field_b[0][1 + var6];
                    stackIn_30_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (param1.field_cc != var6) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackOut_29_0 = (tv) ((Object) stackIn_29_0);
                    stackOut_29_1 = 1;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_31_1 = stackOut_29_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackOut_30_0 = (tv) ((Object) stackIn_30_0);
                    stackOut_30_1 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    stackIn_31_1 = stackOut_30_1;
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_31_0.field_cb = stackIn_31_1 != 0;
                    var6++;
                    statePc = 15;
                    continue stateLoop;
                }
                case 32: {
                    stackOut_32_0 = bf.field_b[0][2].field_pb;
                    stackIn_33_0 = stackOut_32_0 ? 1 : 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    if (stackIn_33_0 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 34;
                    }
                    continue stateLoop;
                }
                case 34: {
                    if (mka.b(8192)) {
                        statePc = 37;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    qda.field_b = gl.a((byte) 101, gfa.field_i, new String[]{uu.field_a.field_tb});
                    if (var26 == 0) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    qda.field_b = jsa.field_y;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if ((sg.field_u.length ^ -1) > -3) {
                        statePc = 105;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (param3) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackOut_40_0 = 0;
                    stackIn_45_0 = stackOut_40_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 41: {
                    if (kca.field_g != -1) {
                        statePc = 43;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    stackOut_42_0 = 0;
                    stackIn_45_0 = stackOut_42_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = 1;
                    stackIn_45_0 = stackOut_43_0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    var6 = stackIn_45_0;
                    if (var6 == 0) {
                        statePc = 52;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    var7 = kca.field_g;
                    var8_int = 0;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    if (vk.field_b.length <= var8_int) {
                        statePc = 51;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    vk.field_b[var8_int] = (byte) 0;
                    var8_int++;
                    if (var26 != 0) {
                        statePc = 52;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if (var26 == 0) {
                        statePc = 47;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    vk.field_b[var7 / 8] = (byte)fh.a((int) vk.field_b[var7 / 8], 1 << var7 % 8);
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    if (!param3) {
                        statePc = 54;
                    } else {
                        statePc = 53;
                    }
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = -1;
                    stackIn_55_0 = stackOut_53_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 54: {
                    stackOut_54_0 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    var7 = stackIn_55_0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (sg.field_u.length <= var7) {
                        statePc = 105;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 57: {
                    stackOut_57_0 = var6;
                    stackIn_106_0 = stackOut_57_0;
                    stackIn_58_0 = stackOut_57_0;
                    if (var26 != 0) {
                        statePc = 106;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (stackIn_58_0 != 0) {
                        statePc = 60;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    stackOut_59_0 = 0;
                    stackIn_64_0 = stackOut_59_0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 60: {
                    if (var7 != kca.field_g) {
                        statePc = 62;
                    } else {
                        statePc = 61;
                    }
                    continue stateLoop;
                }
                case 61: {
                    stackOut_61_0 = 0;
                    stackIn_64_0 = stackOut_61_0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 62: {
                    stackOut_62_0 = 1;
                    stackIn_64_0 = stackOut_62_0;
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    var8_int = stackIn_64_0;
                    if (var4_int == 0) {
                        statePc = 81;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (0 != bf.field_b[1][1 + var7].field_y) {
                        statePc = 67;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 67: {
                    if (!param3) {
                        statePc = 78;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 68: {
                    if (var6 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    if (0 == (var7 ^ -1)) {
                        statePc = 72;
                    } else {
                        statePc = 70;
                    }
                    continue stateLoop;
                }
                case 70: {
                    vk.field_b[var7 / 8] = (byte)kha.b((int) vk.field_b[var7 / 8], 1 << sea.c(var7, 7));
                    if (var26 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 72;
                    }
                    continue stateLoop;
                }
                case 72: {
                    var9 = 0;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    if (var9 >= vk.field_b.length) {
                        statePc = 77;
                    } else {
                        statePc = 74;
                    }
                    continue stateLoop;
                }
                case 74: {
                    vk.field_b[var9] = (byte) 0;
                    var9++;
                    if (var26 != 0) {
                        statePc = 81;
                    } else {
                        statePc = 75;
                    }
                    continue stateLoop;
                }
                case 75: {
                    if (var26 == 0) {
                        statePc = 73;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    if (var26 == 0) {
                        statePc = 81;
                    } else {
                        statePc = 78;
                    }
                    continue stateLoop;
                }
                case 78: {
                    var9 = sg.field_u[var7];
                    if (param1.field_Jb != var9) {
                        statePc = 80;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 80: {
                    var5 = 1;
                    param1.field_Jb = var9;
                    statePc = 81;
                    continue stateLoop;
                }
                case 81: {
                    if (param3) {
                        statePc = 86;
                    } else {
                        statePc = 82;
                    }
                    continue stateLoop;
                }
                case 82: {
                    var9 = sg.field_u[var7];
                    stackOut_82_0 = bf.field_b[1][var7 + 1];
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_83_0 = stackOut_82_0;
                    if (param1.field_Jb != var9) {
                        statePc = 84;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    stackOut_83_0 = (tv) ((Object) stackIn_83_0);
                    stackOut_83_1 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    stackIn_85_1 = stackOut_83_1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 84: {
                    stackOut_84_0 = (tv) ((Object) stackIn_84_0);
                    stackOut_84_1 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    stackIn_85_1 = stackOut_84_1;
                    statePc = 85;
                    continue stateLoop;
                }
                case 85: {
                    stackIn_85_0.field_cb = stackIn_85_1 != 0;
                    if (var26 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 86;
                    }
                    continue stateLoop;
                }
                case 86: {
                    if (0 != (var7 ^ -1)) {
                        statePc = 95;
                    } else {
                        statePc = 87;
                    }
                    continue stateLoop;
                }
                case 87: {
                    bf.field_b[1][var7 + 1].field_cb = true;
                    var9 = 0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    if (var9 >= sg.field_u.length) {
                        statePc = 94;
                    } else {
                        statePc = 89;
                    }
                    continue stateLoop;
                }
                case 89: {
                    stackOut_89_0 = bf.field_b[1][1 + var7];
                    stackOut_89_1 = bf.field_b[1][1 + var7].field_cb;
                    stackOut_89_2 = 0;
                    stackOut_89_3 = vk.field_b[var9 / 8] & 1 << (7 & var9);
                    stackIn_96_0 = stackOut_89_0;
                    stackIn_96_1 = stackOut_89_1 ? 1 : 0;
                    stackIn_96_2 = stackOut_89_2;
                    stackIn_96_3 = stackOut_89_3;
                    stackIn_90_0 = stackOut_89_0;
                    stackIn_90_1 = stackOut_89_1;
                    stackIn_90_2 = stackOut_89_2;
                    stackIn_90_3 = stackOut_89_3;
                    if (var26 != 0) {
                        statePc = 96;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = (tv) ((Object) stackIn_90_0);
                    stackOut_90_1 = stackIn_90_1;
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_92_1 = stackOut_90_1;
                    stackIn_91_0 = stackOut_90_0;
                    stackIn_91_1 = stackOut_90_1;
                    if (stackIn_90_2 != stackIn_90_3) {
                        statePc = 92;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    stackOut_91_0 = (tv) ((Object) stackIn_91_0);
                    stackOut_91_1 = stackIn_91_1;
                    stackOut_91_2 = 1;
                    stackIn_93_0 = stackOut_91_0;
                    stackIn_93_1 = stackOut_91_1;
                    stackIn_93_2 = stackOut_91_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 92: {
                    stackOut_92_0 = (tv) ((Object) stackIn_92_0);
                    stackOut_92_1 = stackIn_92_1;
                    stackOut_92_2 = 0;
                    stackIn_93_0 = stackOut_92_0;
                    stackIn_93_1 = stackOut_92_1;
                    stackIn_93_2 = stackOut_92_2;
                    statePc = 93;
                    continue stateLoop;
                }
                case 93: {
                    stackIn_93_0.field_cb = stackIn_93_1 & stackIn_93_2 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 88;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    if (var26 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 95;
                    }
                    continue stateLoop;
                }
                case 95: {
                    stackOut_95_0 = bf.field_b[1][1 + var7];
                    stackOut_95_1 = 0;
                    stackOut_95_2 = vk.field_b[var7 / 8];
                    stackOut_95_3 = 1 << (var7 & 7);
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    stackIn_96_3 = stackOut_95_3;
                    statePc = 96;
                    continue stateLoop;
                }
                case 96: {
                    stackOut_96_0 = (tv) ((Object) stackIn_96_0);
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_97_0 = stackOut_96_0;
                    if (stackIn_96_1 == (stackIn_96_2 & stackIn_96_3)) {
                        statePc = 98;
                    } else {
                        statePc = 97;
                    }
                    continue stateLoop;
                }
                case 97: {
                    stackOut_97_0 = (tv) ((Object) stackIn_97_0);
                    stackOut_97_1 = 1;
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_99_1 = stackOut_97_1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = (tv) ((Object) stackIn_98_0);
                    stackOut_98_1 = 0;
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    statePc = 99;
                    continue stateLoop;
                }
                case 99: {
                    stackIn_99_0.field_cb = stackIn_99_1 != 0;
                    statePc = 100;
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = bf.field_b[1][1 + var7];
                    stackIn_103_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (var4_int == 0) {
                        statePc = 103;
                    } else {
                        statePc = 101;
                    }
                    continue stateLoop;
                }
                case 101: {
                    stackOut_101_0 = (tv) ((Object) stackIn_101_0);
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (var8_int != 0) {
                        statePc = 103;
                    } else {
                        statePc = 102;
                    }
                    continue stateLoop;
                }
                case 102: {
                    stackOut_102_0 = (tv) ((Object) stackIn_102_0);
                    stackOut_102_1 = 1;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 103: {
                    stackOut_103_0 = (tv) ((Object) stackIn_103_0);
                    stackOut_103_1 = 0;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    stackIn_104_0.field_X = stackIn_104_1 != 0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 56;
                    } else {
                        statePc = 105;
                    }
                    continue stateLoop;
                }
                case 105: {
                    stackOut_105_0 = param3;
                    stackIn_106_0 = stackOut_105_0 ? 1 : 0;
                    statePc = 106;
                    continue stateLoop;
                }
                case 106: {
                    if (stackIn_106_0 != 0) {
                        statePc = 108;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    stackOut_107_0 = 1;
                    stackIn_109_0 = stackOut_107_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 108: {
                    stackOut_108_0 = 0;
                    stackIn_109_0 = stackOut_108_0;
                    statePc = 109;
                    continue stateLoop;
                }
                case 109: {
                    var6 = stackIn_109_0;
                    statePc = 110;
                    continue stateLoop;
                }
                case 110: {
                    if ((var6 ^ -1) <= -4) {
                        statePc = 142;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var28 = bf.field_b[2][var6];
                    stackOut_111_0 = var4_int;
                    stackIn_143_0 = stackOut_111_0;
                    stackIn_112_0 = stackOut_111_0;
                    if (var26 != 0) {
                        statePc = 143;
                    } else {
                        statePc = 112;
                    }
                    continue stateLoop;
                }
                case 112: {
                    if (stackIn_112_0 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (-1 != (var28.field_y ^ -1)) {
                        statePc = 115;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 115: {
                    if (!param3) {
                        statePc = 121;
                    } else {
                        statePc = 116;
                    }
                    continue stateLoop;
                }
                case 116: {
                    if (var6 != 0) {
                        statePc = 119;
                    } else {
                        statePc = 117;
                    }
                    continue stateLoop;
                }
                case 117: {
                    mua.field_b = 0;
                    if (var26 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    mua.field_b = mua.field_b ^ var6;
                    if (var26 == 0) {
                        statePc = 124;
                    } else {
                        statePc = 121;
                    }
                    continue stateLoop;
                }
                case 121: {
                    if (param1.field_yb != var6) {
                        statePc = 123;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 123: {
                    var5 = 1;
                    param1.field_yb = var6;
                    statePc = 124;
                    continue stateLoop;
                }
                case 124: {
                    stackOut_124_0 = (tv) (var28);
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_125_0 = stackOut_124_0;
                    if (var4_int == 0) {
                        statePc = 126;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    stackOut_125_0 = (tv) ((Object) stackIn_125_0);
                    stackOut_125_1 = 1;
                    stackIn_127_0 = stackOut_125_0;
                    stackIn_127_1 = stackOut_125_1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 126: {
                    stackOut_126_0 = (tv) ((Object) stackIn_126_0);
                    stackOut_126_1 = 0;
                    stackIn_127_0 = stackOut_126_0;
                    stackIn_127_1 = stackOut_126_1;
                    statePc = 127;
                    continue stateLoop;
                }
                case 127: {
                    stackIn_127_0.field_X = stackIn_127_1 != 0;
                    if (!param3) {
                        statePc = 137;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (var6 == 0) {
                        statePc = 133;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    stackOut_129_0 = (tv) (var28);
                    stackIn_131_0 = stackOut_129_0;
                    stackIn_130_0 = stackOut_129_0;
                    if ((mua.field_b & var6) == 0) {
                        statePc = 131;
                    } else {
                        statePc = 130;
                    }
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = (tv) ((Object) stackIn_130_0);
                    stackOut_130_1 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = (tv) ((Object) stackIn_131_0);
                    stackOut_131_1 = 0;
                    stackIn_132_0 = stackOut_131_0;
                    stackIn_132_1 = stackOut_131_1;
                    statePc = 132;
                    continue stateLoop;
                }
                case 132: {
                    stackIn_132_0.field_cb = stackIn_132_1 != 0;
                    if (var26 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 133;
                    }
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = (tv) (var28);
                    stackIn_135_0 = stackOut_133_0;
                    stackIn_134_0 = stackOut_133_0;
                    if (mua.field_b != 0) {
                        statePc = 135;
                    } else {
                        statePc = 134;
                    }
                    continue stateLoop;
                }
                case 134: {
                    stackOut_134_0 = (tv) ((Object) stackIn_134_0);
                    stackOut_134_1 = 1;
                    stackIn_136_0 = stackOut_134_0;
                    stackIn_136_1 = stackOut_134_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 135: {
                    stackOut_135_0 = (tv) ((Object) stackIn_135_0);
                    stackOut_135_1 = 0;
                    stackIn_136_0 = stackOut_135_0;
                    stackIn_136_1 = stackOut_135_1;
                    statePc = 136;
                    continue stateLoop;
                }
                case 136: {
                    stackIn_136_0.field_cb = stackIn_136_1 != 0;
                    if (var26 == 0) {
                        statePc = 141;
                    } else {
                        statePc = 137;
                    }
                    continue stateLoop;
                }
                case 137: {
                    stackOut_137_0 = (tv) (var28);
                    stackIn_139_0 = stackOut_137_0;
                    stackIn_138_0 = stackOut_137_0;
                    if ((var6 & param1.field_yb) == 0) {
                        statePc = 139;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackOut_138_0 = (tv) ((Object) stackIn_138_0);
                    stackOut_138_1 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    stackIn_140_1 = stackOut_138_1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 139: {
                    stackOut_139_0 = (tv) ((Object) stackIn_139_0);
                    stackOut_139_1 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    statePc = 140;
                    continue stateLoop;
                }
                case 140: {
                    stackIn_140_0.field_cb = stackIn_140_1 != 0;
                    statePc = 141;
                    continue stateLoop;
                }
                case 141: {
                    var6++;
                    if (var26 == 0) {
                        statePc = 110;
                    } else {
                        statePc = 142;
                    }
                    continue stateLoop;
                }
                case 142: {
                    stackOut_142_0 = param3;
                    stackIn_143_0 = stackOut_142_0 ? 1 : 0;
                    statePc = 143;
                    continue stateLoop;
                }
                case 143: {
                    if (stackIn_143_0 == 0) {
                        statePc = 166;
                    } else {
                        statePc = 144;
                    }
                    continue stateLoop;
                }
                case 144: {
                    if ((ws.field_r ^ -1) < -2) {
                        statePc = 146;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 146: {
                    var6 = 0;
                    statePc = 147;
                    continue stateLoop;
                }
                case 147: {
                    if (var6 >= 1 + ws.field_r) {
                        statePc = 166;
                    } else {
                        statePc = 148;
                    }
                    continue stateLoop;
                }
                case 148: {
                    var29 = bf.field_b[3][var6];
                    stackOut_148_0 = var4_int;
                    stackIn_167_0 = stackOut_148_0;
                    stackIn_149_0 = stackOut_148_0;
                    if (var26 != 0) {
                        statePc = 167;
                    } else {
                        statePc = 149;
                    }
                    continue stateLoop;
                }
                case 149: {
                    if (stackIn_149_0 == 0) {
                        statePc = 152;
                    } else {
                        statePc = 150;
                    }
                    continue stateLoop;
                }
                case 150: {
                    if (-1 == (var29.field_y ^ -1)) {
                        statePc = 152;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    aja.field_H = var6;
                    statePc = 152;
                    continue stateLoop;
                }
                case 152: {
                    if (!var29.field_pb) {
                        statePc = 159;
                    } else {
                        statePc = 153;
                    }
                    continue stateLoop;
                }
                case 153: {
                    if ((var6 ^ -1) >= -1) {
                        statePc = 159;
                    } else {
                        statePc = 154;
                    }
                    continue stateLoop;
                }
                case 154: {
                    if (null == mh.field_L) {
                        statePc = 156;
                    } else {
                        statePc = 155;
                    }
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = mh.field_L[-1 + var6];
                    stackIn_157_0 = stackOut_155_0;
                    statePc = 157;
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = null;
                    stackIn_157_0 = (String) ((Object) stackOut_156_0);
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    var8_ref = stackIn_157_0;
                    if (var8_ref == null) {
                        statePc = 159;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    qda.field_b = var8_ref;
                    statePc = 159;
                    continue stateLoop;
                }
                case 159: {
                    stackOut_159_0 = (tv) (var29);
                    stackIn_161_0 = stackOut_159_0;
                    stackIn_160_0 = stackOut_159_0;
                    if (var4_int == 0) {
                        statePc = 161;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = (tv) ((Object) stackIn_160_0);
                    stackOut_160_1 = 1;
                    stackIn_162_0 = stackOut_160_0;
                    stackIn_162_1 = stackOut_160_1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 161: {
                    stackOut_161_0 = (tv) ((Object) stackIn_161_0);
                    stackOut_161_1 = 0;
                    stackIn_162_0 = stackOut_161_0;
                    stackIn_162_1 = stackOut_161_1;
                    statePc = 162;
                    continue stateLoop;
                }
                case 162: {
                    stackIn_162_0.field_X = stackIn_162_1 != 0;
                    stackOut_162_0 = (tv) (var29);
                    stackIn_164_0 = stackOut_162_0;
                    stackIn_163_0 = stackOut_162_0;
                    if (aja.field_H != var6) {
                        statePc = 164;
                    } else {
                        statePc = 163;
                    }
                    continue stateLoop;
                }
                case 163: {
                    stackOut_163_0 = (tv) ((Object) stackIn_163_0);
                    stackOut_163_1 = 1;
                    stackIn_165_0 = stackOut_163_0;
                    stackIn_165_1 = stackOut_163_1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = (tv) ((Object) stackIn_164_0);
                    stackOut_164_1 = 0;
                    stackIn_165_0 = stackOut_164_0;
                    stackIn_165_1 = stackOut_164_1;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    stackIn_165_0.field_cb = stackIn_165_1 != 0;
                    var6++;
                    if (var26 == 0) {
                        statePc = 147;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    var6 = 0;
                    stackOut_166_0 = param2;
                    stackIn_167_0 = stackOut_166_0;
                    statePc = 167;
                    continue stateLoop;
                }
                case 167: {
                    if (stackIn_167_0 == -21290) {
                        statePc = 169;
                    } else {
                        statePc = 168;
                    }
                    continue stateLoop;
                }
                case 168: {
                    field_a = (qg[]) null;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var7 = 0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var7 >= fk.field_b) {
                        statePc = 372;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var27 = bf.field_b[var7 + 4];
                    var8 = bf.field_b[var7 + 4];
                    stackOut_171_0 = param3;
                    stackIn_373_0 = stackOut_171_0 ? 1 : 0;
                    stackIn_172_0 = stackOut_171_0;
                    if (var26 != 0) {
                        statePc = 373;
                    } else {
                        statePc = 172;
                    }
                    continue stateLoop;
                }
                case 172: {
                    if (!stackIn_172_0) {
                        statePc = 174;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    stackOut_173_0 = -1;
                    stackIn_175_0 = stackOut_173_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 174: {
                    stackOut_174_0 = 0;
                    stackIn_175_0 = stackOut_174_0;
                    statePc = 175;
                    continue stateLoop;
                }
                case 175: {
                    var9 = stackIn_175_0;
                    statePc = 176;
                    continue stateLoop;
                }
                case 176: {
                    if (var9 >= var27.length + -1) {
                        statePc = 370;
                    } else {
                        statePc = 177;
                    }
                    continue stateLoop;
                }
                case 177: {
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    stackOut_177_0 = var4_int;
                    stackIn_371_0 = stackOut_177_0;
                    stackIn_178_0 = stackOut_177_0;
                    if (var26 != 0) {
                        statePc = 371;
                    } else {
                        statePc = 178;
                    }
                    continue stateLoop;
                }
                case 178: {
                    if (stackIn_178_0 == 0) {
                        statePc = 227;
                    } else {
                        statePc = 179;
                    }
                    continue stateLoop;
                }
                case 179: {
                    if (0 <= var9) {
                        statePc = 181;
                    } else {
                        statePc = 227;
                    }
                    continue stateLoop;
                }
                case 181: {
                    if (lga.field_z == null) {
                        statePc = 186;
                    } else {
                        statePc = 182;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (lga.field_z[var7] == null) {
                        statePc = 186;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (0 < ((mi.field_g ^ -1) & lga.field_z[var7][var9])) {
                        statePc = 185;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 185: {
                    var15 = b.a((mi.field_g ^ -1) & lga.field_z[var7][var9], (byte) -115);
                    var14 = 1;
                    statePc = 186;
                    continue stateLoop;
                }
                case 186: {
                    if (rl.field_u == null) {
                        statePc = 193;
                    } else {
                        statePc = 187;
                    }
                    continue stateLoop;
                }
                case 187: {
                    if (rl.field_u[var7] != null) {
                        statePc = 189;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 189: {
                    if (-1 > (wla.field_ub ^ -1)) {
                        statePc = 193;
                    } else {
                        statePc = 190;
                    }
                    continue stateLoop;
                }
                case 190: {
                    if (rl.field_u[var7][var9]) {
                        statePc = 192;
                    } else {
                        statePc = 193;
                    }
                    continue stateLoop;
                }
                case 192: {
                    var10 = 1;
                    statePc = 193;
                    continue stateLoop;
                }
                case 193: {
                    if (null == hp.field_a) {
                        statePc = 204;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    if (hp.field_a[var7] == null) {
                        statePc = 204;
                    } else {
                        statePc = 195;
                    }
                    continue stateLoop;
                }
                case 195: {
                    var16 = hp.field_a[var7][var9];
                    if (0 == var16) {
                        statePc = 200;
                    } else {
                        statePc = 196;
                    }
                    continue stateLoop;
                }
                case 196: {
                    if (dea.field_c) {
                        statePc = 200;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 197: {
                    if ((wla.field_ub ^ -1) >= -1) {
                        statePc = 199;
                    } else {
                        statePc = 200;
                    }
                    continue stateLoop;
                }
                case 199: {
                    var10 = 1;
                    statePc = 200;
                    continue stateLoop;
                }
                case 200: {
                    if ((var16 ^ -1) >= -1) {
                        statePc = 204;
                    } else {
                        statePc = 201;
                    }
                    continue stateLoop;
                }
                case 201: {
                    if (qb.field_f < var16) {
                        statePc = 203;
                    } else {
                        statePc = 204;
                    }
                    continue stateLoop;
                }
                case 203: {
                    var12 = 1;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    if (null == nra.field_g) {
                        statePc = 216;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (nra.field_g[var7] != null) {
                        statePc = 207;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 207: {
                    var16 = nra.field_g[var7][var9];
                    if (-1 == (var16 ^ -1)) {
                        statePc = 212;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    if (dea.field_c) {
                        statePc = 212;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    if (0 >= wla.field_ub) {
                        statePc = 211;
                    } else {
                        statePc = 212;
                    }
                    continue stateLoop;
                }
                case 211: {
                    var10 = 1;
                    statePc = 212;
                    continue stateLoop;
                }
                case 212: {
                    if (var16 <= 0) {
                        statePc = 216;
                    } else {
                        statePc = 213;
                    }
                    continue stateLoop;
                }
                case 213: {
                    if (bha.field_z < var16) {
                        statePc = 215;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 215: {
                    var11 = 1;
                    statePc = 216;
                    continue stateLoop;
                }
                case 216: {
                    if (param3) {
                        statePc = 218;
                    } else {
                        statePc = 217;
                    }
                    continue stateLoop;
                }
                case 217: {
                    stackOut_217_0 = 0;
                    stackIn_226_0 = stackOut_217_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 218: {
                    if (pfa.field_b != null) {
                        statePc = 220;
                    } else {
                        statePc = 219;
                    }
                    continue stateLoop;
                }
                case 219: {
                    stackOut_219_0 = 0;
                    stackIn_226_0 = stackOut_219_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 220: {
                    if (pfa.field_b[var7] != null) {
                        statePc = 222;
                    } else {
                        statePc = 221;
                    }
                    continue stateLoop;
                }
                case 221: {
                    stackOut_221_0 = 0;
                    stackIn_226_0 = stackOut_221_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 222: {
                    if (!pfa.field_b[var7][var9]) {
                        statePc = 224;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackOut_223_0 = 1;
                    stackIn_226_0 = stackOut_223_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 224: {
                    stackOut_224_0 = 0;
                    stackIn_226_0 = stackOut_224_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    var13 = stackIn_226_0;
                    statePc = 227;
                    continue stateLoop;
                }
                case 227: {
                    if (ld.field_e < 2) {
                        statePc = 231;
                    } else {
                        statePc = 228;
                    }
                    continue stateLoop;
                }
                case 228: {
                    if (oj.field_tb[12]) {
                        statePc = 230;
                    } else {
                        statePc = 231;
                    }
                    continue stateLoop;
                }
                case 230: {
                    var14 = 0;
                    var13 = 0;
                    var11 = 0;
                    var12 = 0;
                    var10 = 0;
                    statePc = 231;
                    continue stateLoop;
                }
                case 231: {
                    rh.field_s = true;
                    if (var10 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 232;
                    }
                    continue stateLoop;
                }
                case 232: {
                    if (var11 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    if (var12 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 234;
                    }
                    continue stateLoop;
                }
                case 234: {
                    if (var13 != 0) {
                        statePc = 237;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (var14 == 0) {
                        statePc = 238;
                    } else {
                        statePc = 236;
                    }
                    continue stateLoop;
                }
                case 236: {
                    stackOut_236_0 = 1;
                    stackIn_239_0 = stackOut_236_0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 237: {
                    stackOut_237_0 = 1;
                    stackIn_239_0 = stackOut_237_0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 238: {
                    stackOut_238_0 = 0;
                    stackIn_239_0 = stackOut_238_0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    var16 = stackIn_239_0;
                    if (var16 != 0) {
                        statePc = 258;
                    } else {
                        statePc = 240;
                    }
                    continue stateLoop;
                }
                case 240: {
                    if (var9 < 0) {
                        statePc = 258;
                    } else {
                        statePc = 241;
                    }
                    continue stateLoop;
                }
                case 241: {
                    if (ce.field_A == null) {
                        statePc = 258;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    if (!param3) {
                        statePc = 245;
                    } else {
                        statePc = 243;
                    }
                    continue stateLoop;
                }
                case 243: {
                    if (!qa.field_o) {
                        statePc = 245;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 245: {
                    mm.field_g = false;
                    if (null != tba.field_m) {
                        statePc = 247;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    tba.field_m = new byte[fk.field_b];
                    sda.field_f = new boolean[fk.field_b];
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    rh.field_s = false;
                    var17_int = 0;
                    statePc = 248;
                    continue stateLoop;
                }
                case 248: {
                    if (var17_int >= var7) {
                        statePc = 252;
                    } else {
                        statePc = 249;
                    }
                    continue stateLoop;
                }
                case 249: {
                    sda.field_f[var17_int] = false;
                    var17_int++;
                    if (var26 != 0) {
                        statePc = 253;
                    } else {
                        statePc = 248;
                    }
                    continue stateLoop;
                }
                case 252: {
                    cja.a(125, var7, param1, 0, var9, -1, -1, param3);
                    statePc = 253;
                    continue stateLoop;
                }
                case 253: {
                    if ((ld.field_e ^ -1) > -3) {
                        statePc = 256;
                    } else {
                        statePc = 254;
                    }
                    continue stateLoop;
                }
                case 254: {
                    if (!oj.field_tb[12]) {
                        statePc = 256;
                    } else {
                        statePc = 255;
                    }
                    continue stateLoop;
                }
                case 255: {
                    rh.field_s = true;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    if (rh.field_s) {
                        statePc = 258;
                    } else {
                        statePc = 257;
                    }
                    continue stateLoop;
                }
                case 257: {
                    var16 = 1;
                    statePc = 258;
                    continue stateLoop;
                }
                case 258: {
                    var17 = var27[var9 + 1];
                    if (var4_int == 0) {
                        statePc = 274;
                    } else {
                        statePc = 259;
                    }
                    continue stateLoop;
                }
                case 259: {
                    if (0 == var17.field_y) {
                        statePc = 274;
                    } else {
                        statePc = 260;
                    }
                    continue stateLoop;
                }
                case 260: {
                    if (!param3) {
                        statePc = 270;
                    } else {
                        statePc = 261;
                    }
                    continue stateLoop;
                }
                case 261: {
                    if (var9 == -1) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    tqa.field_e[(var6 + var9) / 8] = (byte)kha.b((int) tqa.field_e[(var6 + var9) / 8], 1 << sea.c(7, var9 + var6));
                    if (var26 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 264;
                    }
                    continue stateLoop;
                }
                case 264: {
                    var18 = var6;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    if (var18 >= -1 + var6 + var27.length) {
                        statePc = 269;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    tqa.field_e[var18 / 8] = (byte)sea.c((int) tqa.field_e[var18 / 8], 1 << sea.c(var18, 7) ^ -1);
                    var18++;
                    if (var26 != 0) {
                        statePc = 274;
                    } else {
                        statePc = 267;
                    }
                    continue stateLoop;
                }
                case 267: {
                    if (var26 == 0) {
                        statePc = 265;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    if (var26 == 0) {
                        statePc = 274;
                    } else {
                        statePc = 270;
                    }
                    continue stateLoop;
                }
                case 270: {
                    if (var16 != 0) {
                        statePc = 274;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if ((byte)var9 != param1.field_ac[var7]) {
                        statePc = 273;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 273: {
                    param1.field_ac[var7] = (byte)var9;
                    var5 = 1;
                    statePc = 274;
                    continue stateLoop;
                }
                case 274: {
                    if (!param3) {
                        statePc = 278;
                    } else {
                        statePc = 275;
                    }
                    continue stateLoop;
                }
                case 275: {
                    if (var16 != 0) {
                        statePc = 277;
                    } else {
                        statePc = 278;
                    }
                    continue stateLoop;
                }
                case 277: {
                    tqa.field_e[(var9 + var6) / 8] = (byte)sea.c((int) tqa.field_e[(var9 + var6) / 8], 1 << sea.c(7, var6 + var9) ^ -1);
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    if (-1 < (var9 ^ -1)) {
                        statePc = 344;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    if (var17.field_pb) {
                        statePc = 281;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (null == no.field_o) {
                        statePc = 285;
                    } else {
                        statePc = 282;
                    }
                    continue stateLoop;
                }
                case 282: {
                    if (null == no.field_o[var7]) {
                        statePc = 284;
                    } else {
                        statePc = 283;
                    }
                    continue stateLoop;
                }
                case 283: {
                    var18_ref_String = no.field_o[var7][var9];
                    statePc = 286;
                    continue stateLoop;
                }
                case 284: {
                    var18_ref_String = null;
                    statePc = 286;
                    continue stateLoop;
                }
                case 285: {
                    var18_ref_String = null;
                    statePc = 286;
                    continue stateLoop;
                }
                case 286: {
                    if (null == eca.field_b) {
                        statePc = 290;
                    } else {
                        statePc = 287;
                    }
                    continue stateLoop;
                }
                case 287: {
                    if (null == eca.field_b[var7]) {
                        statePc = 289;
                    } else {
                        statePc = 288;
                    }
                    continue stateLoop;
                }
                case 288: {
                    var19_ref = eca.field_b[var7][var9];
                    statePc = 291;
                    continue stateLoop;
                }
                case 289: {
                    var19_ref = null;
                    statePc = 291;
                    continue stateLoop;
                }
                case 290: {
                    var19_ref = null;
                    statePc = 291;
                    continue stateLoop;
                }
                case 291: {
                    var20 = null;
                    if (var19_ref == null) {
                        statePc = 295;
                    } else {
                        statePc = 292;
                    }
                    continue stateLoop;
                }
                case 292: {
                    if (!var19_ref.equals(var18_ref_String)) {
                        statePc = 294;
                    } else {
                        statePc = 295;
                    }
                    continue stateLoop;
                }
                case 294: {
                    var20 = var19_ref;
                    statePc = 295;
                    continue stateLoop;
                }
                case 295: {
                    var21 = null;
                    if (var13 != 0) {
                        statePc = 318;
                    } else {
                        statePc = 296;
                    }
                    continue stateLoop;
                }
                case 296: {
                    if (var10 != 0) {
                        statePc = 317;
                    } else {
                        statePc = 297;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (var11 == 0) {
                        statePc = 301;
                    } else {
                        statePc = 298;
                    }
                    continue stateLoop;
                }
                case 298: {
                    var22_int = nra.field_g[var7][var9] + -bha.field_z;
                    if (-2 == (var22_int ^ -1)) {
                        statePc = 300;
                    } else {
                        statePc = 299;
                    }
                    continue stateLoop;
                }
                case 299: {
                    var21 = gl.a((byte) 112, vn.field_c, new String[]{Integer.toString(var22_int)});
                    statePc = 301;
                    continue stateLoop;
                }
                case 300: {
                    var21 = rm.field_b;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (var12 != 0) {
                        statePc = 303;
                    } else {
                        statePc = 306;
                    }
                    continue stateLoop;
                }
                case 303: {
                    var30 = gl.a((byte) 106, kp.field_f, new String[]{Integer.toString(qb.field_f), Integer.toString(hp.field_a[var7][var9])});
                    var22_ref = var30;
                    var25_ref = var22_ref;
                    var22_ref = var25_ref;
                    var21 = var22_ref;
                    var25_ref = var30;
                    var22_ref = var25_ref;
                    if (var21 == null) {
                        statePc = 305;
                    } else {
                        statePc = 304;
                    }
                    continue stateLoop;
                }
                case 304: {
                    var21 = (String) (var21) + "<br>" + var30;
                    if (var26 == 0) {
                        statePc = 306;
                    } else {
                        statePc = 305;
                    }
                    continue stateLoop;
                }
                case 305: {
                    var21 = var30;
                    statePc = 306;
                    continue stateLoop;
                }
                case 306: {
                    if (var14 != 0) {
                        statePc = 308;
                    } else {
                        statePc = 319;
                    }
                    continue stateLoop;
                }
                case 308: {
                    var22_ref = ova.field_j;
                    if (-1 <= (var15 ^ -1)) {
                        statePc = 314;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    if (null == kh.field_l) {
                        statePc = 314;
                    } else {
                        statePc = 310;
                    }
                    continue stateLoop;
                }
                case 310: {
                    if (var15 > kh.field_l.length) {
                        statePc = 314;
                    } else {
                        statePc = 311;
                    }
                    continue stateLoop;
                }
                case 311: {
                    if (null != kh.field_l[var15 + -1]) {
                        statePc = 313;
                    } else {
                        statePc = 314;
                    }
                    continue stateLoop;
                }
                case 313: {
                    var22_ref = kh.field_l[var15 + -1][0];
                    statePc = 314;
                    continue stateLoop;
                }
                case 314: {
                    if (var21 != null) {
                        statePc = 316;
                    } else {
                        statePc = 315;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var21 = var22_ref;
                    if (var26 == 0) {
                        statePc = 319;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 316: {
                    var21 = (String) (var21) + "<br>" + var22_ref;
                    statePc = 319;
                    continue stateLoop;
                }
                case 317: {
                    var21 = ai.field_b;
                    statePc = 319;
                    continue stateLoop;
                }
                case 318: {
                    var21 = tp.field_L;
                    var22_ref = (String) (var21);
                    var25_ref = var22_ref;
                    var22_ref = var25_ref;
                    var21 = var22_ref;
                    var25_ref = (String) (var21);
                    var22_ref = var25_ref;
                    var25_ref = var22_ref;
                    var22_ref = var25_ref;
                    var21 = var22_ref;
                    var22_ref = var25_ref;
                    statePc = 319;
                    continue stateLoop;
                }
                case 319: {
                    if (var4_int == 0) {
                        statePc = 338;
                    } else {
                        statePc = 320;
                    }
                    continue stateLoop;
                }
                case 320: {
                    if (!rh.field_s) {
                        statePc = 322;
                    } else {
                        statePc = 338;
                    }
                    continue stateLoop;
                }
                case 322: {
                    var22_ref = null;
                    var23 = 0;
                    if (mm.field_g) {
                        statePc = 324;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 324: {
                    var22_ref = "</col>" + mi.field_j + "<col=A00000>";
                    var25_ref = var22_ref;
                    var22_ref = var25_ref;
                    var25_ref = var22_ref;
                    var22_ref = var25_ref;
                    var21 = var22_ref;
                    statePc = 325;
                    continue stateLoop;
                }
                case 325: {
                    var24 = 0;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (var7 <= var24) {
                        statePc = 334;
                    } else {
                        statePc = 327;
                    }
                    continue stateLoop;
                }
                case 327: {
                    stackOut_327_0 = sda.field_f[var24];
                    stackIn_335_0 = stackOut_327_0 ? 1 : 0;
                    stackIn_328_0 = stackOut_327_0;
                    if (var26 != 0) {
                        statePc = 335;
                    } else {
                        statePc = 328;
                    }
                    continue stateLoop;
                }
                case 328: {
                    if (stackIn_328_0) {
                        statePc = 330;
                    } else {
                        statePc = 333;
                    }
                    continue stateLoop;
                }
                case 330: {
                    var25_ref = "</col>" + kma.field_e[var24] + "<col=A00000>";
                    var22_ref = var25_ref;
                    var22_ref = var25_ref;
                    if (var22_ref != null) {
                        statePc = 332;
                    } else {
                        statePc = 331;
                    }
                    continue stateLoop;
                }
                case 331: {
                    var22_ref = var25_ref;
                    if (var26 == 0) {
                        statePc = 333;
                    } else {
                        statePc = 332;
                    }
                    continue stateLoop;
                }
                case 332: {
                    var23 = 1;
                    var22_ref = var22_ref + ", " + var25_ref;
                    var21 = var22_ref;
                    var21 = var22_ref;
                    statePc = 333;
                    continue stateLoop;
                }
                case 333: {
                    var24++;
                    statePc = 326;
                    continue stateLoop;
                }
                case 334: {
                    stackOut_334_0 = var23;
                    stackIn_335_0 = stackOut_334_0;
                    statePc = 335;
                    continue stateLoop;
                }
                case 335: {
                    if (stackIn_335_0 != 0) {
                        statePc = 337;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 336: {
                    var21 = gl.a((byte) 106, cna.field_d, new String[]{var22_ref});
                    if (var26 == 0) {
                        statePc = 338;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    var21 = sta.field_G + var22_ref;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (var21 == null) {
                        statePc = 342;
                    } else {
                        statePc = 339;
                    }
                    continue stateLoop;
                }
                case 339: {
                    var21 = "<col=A00000>" + (String) (var21);
                    var31 = fta.a((String) (var21), "<br>", 0, "<br><col=A00000>");
                    if (var20 == null) {
                        statePc = 341;
                    } else {
                        statePc = 340;
                    }
                    continue stateLoop;
                }
                case 340: {
                    var20 = (String) (var20) + "<br>" + var31;
                    if (var26 == 0) {
                        statePc = 342;
                    } else {
                        statePc = 341;
                    }
                    continue stateLoop;
                }
                case 341: {
                    var20 = var31;
                    statePc = 342;
                    continue stateLoop;
                }
                case 342: {
                    if (var20 == null) {
                        statePc = 344;
                    } else {
                        statePc = 343;
                    }
                    continue stateLoop;
                }
                case 343: {
                    qda.field_b = (String) (var20);
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (!param3) {
                        statePc = 360;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (0 == (var9 ^ -1)) {
                        statePc = 352;
                    } else {
                        statePc = 346;
                    }
                    continue stateLoop;
                }
                case 346: {
                    stackOut_346_0 = (tv) (var17);
                    stackOut_346_1 = 0;
                    stackOut_346_2 = tqa.field_e[(var6 + var9) / 8] & 1 << (7 & var9 + var6);
                    stackIn_348_0 = stackOut_346_0;
                    stackIn_348_1 = stackOut_346_1;
                    stackIn_348_2 = stackOut_346_2;
                    statePc = 348;
                    continue stateLoop;
                }
                case 347: {
                    stackOut_347_0 = (tv) ((Object) stackIn_347_0);
                    stackOut_347_1 = stackIn_347_1;
                    stackOut_347_2 = stackIn_347_2 & stackIn_347_3;
                    stackIn_348_0 = stackOut_347_0;
                    stackIn_348_1 = stackOut_347_1 ? 1 : 0;
                    stackIn_348_2 = stackOut_347_2;
                    statePc = 348;
                    continue stateLoop;
                }
                case 348: {
                    stackOut_348_0 = (tv) ((Object) stackIn_348_0);
                    stackIn_350_0 = stackOut_348_0;
                    stackIn_349_0 = stackOut_348_0;
                    if (stackIn_348_1 == stackIn_348_2) {
                        statePc = 350;
                    } else {
                        statePc = 349;
                    }
                    continue stateLoop;
                }
                case 349: {
                    stackOut_349_0 = (tv) ((Object) stackIn_349_0);
                    stackOut_349_1 = 1;
                    stackIn_351_0 = stackOut_349_0;
                    stackIn_351_1 = stackOut_349_1;
                    statePc = 351;
                    continue stateLoop;
                }
                case 350: {
                    stackOut_350_0 = (tv) ((Object) stackIn_350_0);
                    stackOut_350_1 = 0;
                    stackIn_351_0 = stackOut_350_0;
                    stackIn_351_1 = stackOut_350_1;
                    statePc = 351;
                    continue stateLoop;
                }
                case 351: {
                    stackIn_351_0.field_cb = stackIn_351_1 != 0;
                    if (var26 == 0) {
                        statePc = 365;
                    } else {
                        statePc = 352;
                    }
                    continue stateLoop;
                }
                case 352: {
                    var17.field_cb = true;
                    var18 = var6;
                    statePc = 353;
                    continue stateLoop;
                }
                case 353: {
                    if (var18 >= var27.length + (var6 - 1)) {
                        statePc = 359;
                    } else {
                        statePc = 354;
                    }
                    continue stateLoop;
                }
                case 354: {
                    stackOut_354_0 = (tv) (var17);
                    stackOut_354_1 = var17.field_cb;
                    stackOut_354_2 = 0;
                    stackOut_354_3 = tqa.field_e[var18 / 8] & 1 << (var18 & 7);
                    stackIn_347_0 = stackOut_354_0;
                    stackIn_347_1 = stackOut_354_1;
                    stackIn_347_2 = stackOut_354_2;
                    stackIn_347_3 = stackOut_354_3;
                    stackIn_355_0 = stackOut_354_0;
                    stackIn_355_1 = stackOut_354_1;
                    stackIn_355_2 = stackOut_354_2;
                    stackIn_355_3 = stackOut_354_3;
                    if (var26 != 0) {
                        statePc = 347;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    stackOut_355_0 = (tv) ((Object) stackIn_355_0);
                    stackOut_355_1 = stackIn_355_1;
                    stackIn_357_0 = stackOut_355_0;
                    stackIn_357_1 = stackOut_355_1;
                    stackIn_356_0 = stackOut_355_0;
                    stackIn_356_1 = stackOut_355_1;
                    if (stackIn_355_2 != stackIn_355_3) {
                        statePc = 357;
                    } else {
                        statePc = 356;
                    }
                    continue stateLoop;
                }
                case 356: {
                    stackOut_356_0 = (tv) ((Object) stackIn_356_0);
                    stackOut_356_1 = stackIn_356_1;
                    stackOut_356_2 = 1;
                    stackIn_358_0 = stackOut_356_0;
                    stackIn_358_1 = stackOut_356_1;
                    stackIn_358_2 = stackOut_356_2;
                    statePc = 358;
                    continue stateLoop;
                }
                case 357: {
                    stackOut_357_0 = (tv) ((Object) stackIn_357_0);
                    stackOut_357_1 = stackIn_357_1;
                    stackOut_357_2 = 0;
                    stackIn_358_0 = stackOut_357_0;
                    stackIn_358_1 = stackOut_357_1;
                    stackIn_358_2 = stackOut_357_2;
                    statePc = 358;
                    continue stateLoop;
                }
                case 358: {
                    stackIn_358_0.field_cb = stackIn_358_1 & stackIn_358_2 != 0;
                    var18++;
                    if (var26 == 0) {
                        statePc = 353;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    if (var26 == 0) {
                        statePc = 365;
                    } else {
                        statePc = 360;
                    }
                    continue stateLoop;
                }
                case 360: {
                    stackOut_360_0 = (tv) (var17);
                    stackIn_363_0 = stackOut_360_0;
                    stackIn_361_0 = stackOut_360_0;
                    if (!rh.field_s) {
                        statePc = 363;
                    } else {
                        statePc = 361;
                    }
                    continue stateLoop;
                }
                case 361: {
                    stackOut_361_0 = (tv) ((Object) stackIn_361_0);
                    stackIn_363_0 = stackOut_361_0;
                    stackIn_362_0 = stackOut_361_0;
                    if ((byte)var9 != param1.field_ac[var7]) {
                        statePc = 363;
                    } else {
                        statePc = 362;
                    }
                    continue stateLoop;
                }
                case 362: {
                    stackOut_362_0 = (tv) ((Object) stackIn_362_0);
                    stackOut_362_1 = 1;
                    stackIn_364_0 = stackOut_362_0;
                    stackIn_364_1 = stackOut_362_1;
                    statePc = 364;
                    continue stateLoop;
                }
                case 363: {
                    stackOut_363_0 = (tv) ((Object) stackIn_363_0);
                    stackOut_363_1 = 0;
                    stackIn_364_0 = stackOut_363_0;
                    stackIn_364_1 = stackOut_363_1;
                    statePc = 364;
                    continue stateLoop;
                }
                case 364: {
                    stackIn_364_0.field_cb = stackIn_364_1 != 0;
                    statePc = 365;
                    continue stateLoop;
                }
                case 365: {
                    stackOut_365_0 = (tv) (var17);
                    stackIn_368_0 = stackOut_365_0;
                    stackIn_366_0 = stackOut_365_0;
                    if (var4_int == 0) {
                        statePc = 368;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 366: {
                    stackOut_366_0 = (tv) ((Object) stackIn_366_0);
                    stackIn_368_0 = stackOut_366_0;
                    stackIn_367_0 = stackOut_366_0;
                    if (var16 != 0) {
                        statePc = 368;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    stackOut_367_0 = (tv) ((Object) stackIn_367_0);
                    stackOut_367_1 = 1;
                    stackIn_369_0 = stackOut_367_0;
                    stackIn_369_1 = stackOut_367_1;
                    statePc = 369;
                    continue stateLoop;
                }
                case 368: {
                    stackOut_368_0 = (tv) ((Object) stackIn_368_0);
                    stackOut_368_1 = 0;
                    stackIn_369_0 = stackOut_368_0;
                    stackIn_369_1 = stackOut_368_1;
                    statePc = 369;
                    continue stateLoop;
                }
                case 369: {
                    stackIn_369_0.field_X = stackIn_369_1 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 176;
                    } else {
                        statePc = 370;
                    }
                    continue stateLoop;
                }
                case 370: {
                    stackOut_370_0 = var6 + (255 & um.field_m[var7]);
                    stackIn_371_0 = stackOut_370_0;
                    statePc = 371;
                    continue stateLoop;
                }
                case 371: {
                    var6 = stackIn_371_0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 372;
                    }
                    continue stateLoop;
                }
                case 372: {
                    stackOut_372_0 = var5;
                    stackIn_373_0 = stackOut_372_0;
                    statePc = 373;
                    continue stateLoop;
                }
                case 373: {
                    if (stackIn_373_0 == 0) {
                        statePc = 382;
                    } else {
                        statePc = 374;
                    }
                    continue stateLoop;
                }
                case 374: {
                    if (!param3) {
                        statePc = 376;
                    } else {
                        statePc = 382;
                    }
                    continue stateLoop;
                }
                case 376: {
                    mla.a(param0, -94);
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
    }
}
