/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends ca {
    private boolean field_hb;
    private String field_lb;
    static bb field_qb;
    static String[] field_nb;
    private hd field_fb;
    static String field_kb;
    private String field_ob;
    private boolean field_gb;
    static volatile int field_mb;
    static String field_pb;
    static int field_jb;
    static String field_ib;

    final static int a(CharSequence param0, char param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 == 16752) {
          L0: {
            var3 = 0;
            var4 = param0.length();
            var5 = 0;
            if (var4 <= var5) {
              break L0;
            } else {
              L1: {
                if (param1 != param0.charAt(var5)) {
                  var5++;
                  break L1;
                } else {
                  var3++;
                  var5++;
                  break L1;
                }
              }
              var5++;
              var5++;
              var5++;
              break L0;
            }
          }
          return var3;
        } else {
          field_nb = null;
          L2: {
            var3 = 0;
            var4 = param0.length();
            var5 = 0;
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                if (param1 != param0.charAt(var5)) {
                  var5++;
                  break L3;
                } else {
                  var3++;
                  var5++;
                  break L3;
                }
              }
              var5++;
              var5++;
              var5++;
              break L2;
            }
          }
          return var3;
        }
    }

    final static void n(int param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        gk var9 = null;
        int var10 = 0;
        gk var11 = null;
        gk var12 = null;
        gk var14 = null;
        gk var15 = null;
        gk var16 = null;
        gk var17 = null;
        gk var18 = null;
        gk var19 = null;
        gk var20 = null;
        gk var21 = null;
        gk var22 = null;
        int stackIn_14_0 = 0;
        String stackIn_20_0 = null;
        int stackIn_24_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        String stackIn_35_0 = null;
        String stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        gk stackIn_41_0 = null;
        int stackIn_64_0 = 0;
        String stackIn_70_0 = null;
        int stackIn_74_0 = 0;
        String stackIn_79_0 = null;
        String stackIn_84_0 = null;
        String stackIn_85_0 = null;
        String stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        gk stackIn_91_0 = null;
        int stackIn_111_0 = 0;
        String stackIn_117_0 = null;
        int stackIn_121_0 = 0;
        String stackIn_126_0 = null;
        String stackIn_131_0 = null;
        String stackIn_132_0 = null;
        String stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        gk stackIn_138_0 = null;
        int stackIn_157_0 = 0;
        String stackIn_163_0 = null;
        int stackIn_167_0 = 0;
        String stackIn_172_0 = null;
        String stackIn_177_0 = null;
        String stackIn_178_0 = null;
        String stackIn_179_0 = null;
        int stackIn_179_1 = 0;
        gk stackIn_184_0 = null;
        int stackIn_197_0 = 0;
        String stackIn_203_0 = null;
        int stackIn_207_0 = 0;
        String stackIn_212_0 = null;
        String stackIn_217_0 = null;
        String stackIn_218_0 = null;
        String stackIn_219_0 = null;
        int stackIn_219_1 = 0;
        gk stackIn_224_0 = null;
        int stackIn_243_0 = 0;
        String stackIn_249_0 = null;
        int stackIn_253_0 = 0;
        String stackIn_258_0 = null;
        String stackIn_263_0 = null;
        String stackIn_264_0 = null;
        String stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        gk stackIn_270_0 = null;
        int stackIn_283_0 = 0;
        int stackIn_288_0 = 0;
        String stackIn_293_0 = null;
        String stackIn_298_0 = null;
        String stackIn_299_0 = null;
        String stackIn_300_0 = null;
        int stackIn_300_1 = 0;
        gk stackIn_305_0 = null;
        int stackIn_324_0 = 0;
        String stackIn_330_0 = null;
        int stackIn_334_0 = 0;
        String stackIn_339_0 = null;
        String stackIn_344_0 = null;
        String stackIn_345_0 = null;
        String stackIn_346_0 = null;
        int stackIn_346_1 = 0;
        gk stackIn_351_0 = null;
        String stackIn_362_0 = null;
        int stackIn_366_0 = 0;
        String stackIn_371_0 = null;
        String stackIn_376_0 = null;
        String stackIn_377_0 = null;
        String stackIn_378_0 = null;
        int stackIn_378_1 = 0;
        gk stackIn_383_0 = null;
        int stackIn_400_0 = 0;
        String stackIn_406_0 = null;
        int stackIn_410_0 = 0;
        String stackIn_415_0 = null;
        String stackIn_420_0 = null;
        String stackIn_421_0 = null;
        String stackIn_422_0 = null;
        int stackIn_422_1 = 0;
        gk stackIn_427_0 = null;
        int stackIn_453_0 = 0;
        String stackIn_459_0 = null;
        int stackIn_463_0 = 0;
        String stackIn_468_0 = null;
        String stackIn_473_0 = null;
        String stackIn_474_0 = null;
        String stackIn_475_0 = null;
        int stackIn_475_1 = 0;
        gk stackIn_480_0 = null;
        int stackOut_282_0 = 0;
        int stackOut_281_0 = 0;
        String stackOut_361_0 = null;
        String stackOut_360_0 = null;
        int stackOut_287_0 = 0;
        int stackOut_286_0 = 0;
        String stackOut_292_0 = null;
        String stackOut_291_0 = null;
        String stackOut_297_0 = null;
        String stackOut_299_0 = null;
        int stackOut_299_1 = 0;
        String stackOut_298_0 = null;
        int stackOut_298_1 = 0;
        gk stackOut_304_0 = null;
        gk stackOut_303_0 = null;
        int stackOut_323_0 = 0;
        int stackOut_322_0 = 0;
        String stackOut_329_0 = null;
        String stackOut_328_0 = null;
        int stackOut_333_0 = 0;
        int stackOut_332_0 = 0;
        String stackOut_338_0 = null;
        String stackOut_337_0 = null;
        String stackOut_343_0 = null;
        String stackOut_345_0 = null;
        int stackOut_345_1 = 0;
        String stackOut_344_0 = null;
        int stackOut_344_1 = 0;
        gk stackOut_350_0 = null;
        gk stackOut_349_0 = null;
        int stackOut_365_0 = 0;
        int stackOut_364_0 = 0;
        String stackOut_370_0 = null;
        String stackOut_369_0 = null;
        String stackOut_375_0 = null;
        String stackOut_377_0 = null;
        int stackOut_377_1 = 0;
        String stackOut_376_0 = null;
        int stackOut_376_1 = 0;
        gk stackOut_382_0 = null;
        gk stackOut_381_0 = null;
        int stackOut_399_0 = 0;
        int stackOut_398_0 = 0;
        String stackOut_405_0 = null;
        String stackOut_404_0 = null;
        int stackOut_409_0 = 0;
        int stackOut_408_0 = 0;
        String stackOut_414_0 = null;
        String stackOut_413_0 = null;
        String stackOut_419_0 = null;
        String stackOut_421_0 = null;
        int stackOut_421_1 = 0;
        String stackOut_420_0 = null;
        int stackOut_420_1 = 0;
        gk stackOut_426_0 = null;
        gk stackOut_425_0 = null;
        int stackOut_196_0 = 0;
        int stackOut_195_0 = 0;
        String stackOut_202_0 = null;
        String stackOut_201_0 = null;
        int stackOut_206_0 = 0;
        int stackOut_205_0 = 0;
        String stackOut_211_0 = null;
        String stackOut_210_0 = null;
        String stackOut_216_0 = null;
        String stackOut_218_0 = null;
        int stackOut_218_1 = 0;
        String stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        gk stackOut_223_0 = null;
        gk stackOut_222_0 = null;
        int stackOut_242_0 = 0;
        int stackOut_241_0 = 0;
        String stackOut_248_0 = null;
        String stackOut_247_0 = null;
        int stackOut_252_0 = 0;
        int stackOut_251_0 = 0;
        String stackOut_257_0 = null;
        String stackOut_256_0 = null;
        String stackOut_262_0 = null;
        String stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        String stackOut_263_0 = null;
        int stackOut_263_1 = 0;
        gk stackOut_269_0 = null;
        gk stackOut_268_0 = null;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        String stackOut_116_0 = null;
        String stackOut_115_0 = null;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        String stackOut_125_0 = null;
        String stackOut_124_0 = null;
        String stackOut_130_0 = null;
        String stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        String stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        gk stackOut_137_0 = null;
        gk stackOut_136_0 = null;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        String stackOut_162_0 = null;
        String stackOut_161_0 = null;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        String stackOut_171_0 = null;
        String stackOut_170_0 = null;
        String stackOut_176_0 = null;
        String stackOut_178_0 = null;
        int stackOut_178_1 = 0;
        String stackOut_177_0 = null;
        int stackOut_177_1 = 0;
        gk stackOut_183_0 = null;
        gk stackOut_182_0 = null;
        int stackOut_452_0 = 0;
        int stackOut_451_0 = 0;
        String stackOut_458_0 = null;
        String stackOut_457_0 = null;
        int stackOut_462_0 = 0;
        int stackOut_461_0 = 0;
        String stackOut_467_0 = null;
        String stackOut_466_0 = null;
        String stackOut_472_0 = null;
        String stackOut_474_0 = null;
        int stackOut_474_1 = 0;
        String stackOut_473_0 = null;
        int stackOut_473_1 = 0;
        gk stackOut_479_0 = null;
        gk stackOut_478_0 = null;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        String stackOut_69_0 = null;
        String stackOut_68_0 = null;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        String stackOut_78_0 = null;
        String stackOut_77_0 = null;
        String stackOut_83_0 = null;
        String stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        gk stackOut_90_0 = null;
        gk stackOut_89_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        String stackOut_19_0 = null;
        String stackOut_18_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_28_0 = null;
        String stackOut_27_0 = null;
        String stackOut_33_0 = null;
        String stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        String stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        gk stackOut_40_0 = null;
        gk stackOut_39_0 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var1 = jd.field_N;
        var2 = 0;
        if ((re.field_g ^ -1) == -3) {
          var3_long = -aa.field_d + la.a(false);
          var2 = (int)((-var3_long + 10999L) / 1000L);
          if (var2 < 0) {
            L0: {
              var2 = 0;
              if (param0 == 17077) {
                break L0;
              } else {
                field_mb = 118;
                var3 = 0;
                if (sg.field_f.length > var3) {
                  var4 = lg.field_a[var3];
                  if (0 > var4) {
                    L1: {
                      var5 = b.field_h;
                      var6 = sg.field_f[var3];
                      if (re.field_g != -3) {
                        break L1;
                      } else {
                        if (-2 != var2) {
                          break L1;
                        } else {
                          L2: {
                            if (lk.field_i.length < ng.field_d.length) {
                              stackOut_282_0 = ng.field_d.length;
                              stackIn_283_0 = stackOut_282_0;
                              break L2;
                            } else {
                              stackOut_281_0 = lk.field_i.length;
                              stackIn_283_0 = stackOut_281_0;
                              break L2;
                            }
                          }
                          L3: {
                            var7 = stackIn_283_0;
                            if (var3 < 6) {
                              break L3;
                            } else {
                              if (6 - -var7 > var3) {
                                L4: {
                                  if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                    stackOut_361_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                    stackIn_362_0 = stackOut_361_0;
                                    break L4;
                                  } else {
                                    stackOut_360_0 = "";
                                    stackIn_362_0 = stackOut_360_0;
                                    break L4;
                                  }
                                }
                                var6_ref = stackIn_362_0;
                                break L3;
                              } else {
                                L5: {
                                  if (ga.field_i.length <= wg.field_h.length) {
                                    stackOut_287_0 = wg.field_h.length;
                                    stackIn_288_0 = stackOut_287_0;
                                    break L5;
                                  } else {
                                    stackOut_286_0 = ga.field_i.length;
                                    stackIn_288_0 = stackOut_286_0;
                                    break L5;
                                  }
                                }
                                L6: {
                                  var8 = stackIn_288_0;
                                  if (7 + var7 > var3) {
                                    break L6;
                                  } else {
                                    if (var8 + 7 - -var7 <= var3) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if (wg.field_h.length <= -7 + (var3 - var7)) {
                                          stackOut_292_0 = "";
                                          stackIn_293_0 = stackOut_292_0;
                                          break L7;
                                        } else {
                                          stackOut_291_0 = wg.field_h[-7 + var3 - var7];
                                          stackIn_293_0 = stackOut_291_0;
                                          break L7;
                                        }
                                      }
                                      var6_ref = stackIn_293_0;
                                      break L6;
                                    }
                                  }
                                }
                                L8: {
                                  if (-2 == var4) {
                                    var6_ref = Integer.toString(var2);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                L9: {
                                  stackOut_297_0 = (String) var6_ref;
                                  stackIn_299_0 = stackOut_297_0;
                                  stackIn_298_0 = stackOut_297_0;
                                  if (var4 < 0) {
                                    stackOut_299_0 = (String) (Object) stackIn_299_0;
                                    stackOut_299_1 = 0;
                                    stackIn_300_0 = stackOut_299_0;
                                    stackIn_300_1 = stackOut_299_1;
                                    break L9;
                                  } else {
                                    stackOut_298_0 = (String) (Object) stackIn_298_0;
                                    stackOut_298_1 = 1;
                                    stackIn_300_0 = stackOut_298_0;
                                    stackIn_300_1 = stackOut_298_1;
                                    break L9;
                                  }
                                }
                                L10: {
                                  var7 = u.a(stackIn_300_0, stackIn_300_1 != 0, true);
                                  var8 = -(var7 >> 198130753) + ji.field_f;
                                  if (-1 >= (var4 ^ -1)) {
                                    L11: {
                                      if (wg.field_k.field_f != var4) {
                                        stackOut_304_0 = wd.field_c;
                                        stackIn_305_0 = stackOut_304_0;
                                        break L11;
                                      } else {
                                        stackOut_303_0 = ue.field_a;
                                        stackIn_305_0 = stackOut_303_0;
                                        break L11;
                                      }
                                    }
                                    L12: {
                                      var18 = stackIn_305_0;
                                      var9 = var18;
                                      var1 = var1 + ig.field_h;
                                      if (var18 == null) {
                                        break L12;
                                      } else {
                                        var18.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                                        break L12;
                                      }
                                    }
                                    var1 = var1 + wa.field_N;
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L13: {
                                  if (var4 >= 0) {
                                    cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                                    var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                                    break L13;
                                  } else {
                                    uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                                    var1 = var1 + s.field_g;
                                    var3++;
                                    break L13;
                                  }
                                }
                                var3++;
                                var3++;
                                var3 = 0;
                                L14: while (true) {
                                  if (sg.field_f.length <= var3) {
                                    return;
                                  } else {
                                    L15: {
                                      var4 = lg.field_a[var3];
                                      if (0 > var4) {
                                        var5 = b.field_h;
                                        break L15;
                                      } else {
                                        if (wg.field_k.field_f == var4) {
                                          var5 = a.field_i;
                                          break L15;
                                        } else {
                                          var5 = pj.field_E;
                                          break L15;
                                        }
                                      }
                                    }
                                    L16: {
                                      var6 = sg.field_f[var3];
                                      if (re.field_g != -3) {
                                        break L16;
                                      } else {
                                        if (-2 != var2) {
                                          break L16;
                                        } else {
                                          L17: {
                                            if (lk.field_i.length < ng.field_d.length) {
                                              stackOut_323_0 = ng.field_d.length;
                                              stackIn_324_0 = stackOut_323_0;
                                              break L17;
                                            } else {
                                              stackOut_322_0 = lk.field_i.length;
                                              stackIn_324_0 = stackOut_322_0;
                                              break L17;
                                            }
                                          }
                                          L18: {
                                            var7 = stackIn_324_0;
                                            if (var3 < 6) {
                                              break L18;
                                            } else {
                                              if (6 - -var7 > var3) {
                                                L19: {
                                                  if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                                    stackOut_329_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                                    stackIn_330_0 = stackOut_329_0;
                                                    break L19;
                                                  } else {
                                                    stackOut_328_0 = "";
                                                    stackIn_330_0 = stackOut_328_0;
                                                    break L19;
                                                  }
                                                }
                                                var6_ref = stackIn_330_0;
                                                break L18;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                          L20: {
                                            if (ga.field_i.length <= wg.field_h.length) {
                                              stackOut_333_0 = wg.field_h.length;
                                              stackIn_334_0 = stackOut_333_0;
                                              break L20;
                                            } else {
                                              stackOut_332_0 = ga.field_i.length;
                                              stackIn_334_0 = stackOut_332_0;
                                              break L20;
                                            }
                                          }
                                          var8 = stackIn_334_0;
                                          if (7 + var7 > var3) {
                                            break L16;
                                          } else {
                                            if (var8 + 7 - -var7 <= var3) {
                                              break L16;
                                            } else {
                                              L21: {
                                                if (wg.field_h.length <= -7 + (var3 - var7)) {
                                                  stackOut_338_0 = "";
                                                  stackIn_339_0 = stackOut_338_0;
                                                  break L21;
                                                } else {
                                                  stackOut_337_0 = wg.field_h[-7 + var3 - var7];
                                                  stackIn_339_0 = stackOut_337_0;
                                                  break L21;
                                                }
                                              }
                                              var6_ref = stackIn_339_0;
                                              break L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L22: {
                                      if (-2 == var4) {
                                        var6_ref = Integer.toString(var2);
                                        break L22;
                                      } else {
                                        break L22;
                                      }
                                    }
                                    L23: {
                                      stackOut_343_0 = (String) var6_ref;
                                      stackIn_345_0 = stackOut_343_0;
                                      stackIn_344_0 = stackOut_343_0;
                                      if (var4 < 0) {
                                        stackOut_345_0 = (String) (Object) stackIn_345_0;
                                        stackOut_345_1 = 0;
                                        stackIn_346_0 = stackOut_345_0;
                                        stackIn_346_1 = stackOut_345_1;
                                        break L23;
                                      } else {
                                        stackOut_344_0 = (String) (Object) stackIn_344_0;
                                        stackOut_344_1 = 1;
                                        stackIn_346_0 = stackOut_344_0;
                                        stackIn_346_1 = stackOut_344_1;
                                        break L23;
                                      }
                                    }
                                    L24: {
                                      var7 = u.a(stackIn_346_0, stackIn_346_1 != 0, true);
                                      var8 = -(var7 >> 198130753) + ji.field_f;
                                      if (-1 >= (var4 ^ -1)) {
                                        L25: {
                                          if (wg.field_k.field_f != var4) {
                                            stackOut_350_0 = wd.field_c;
                                            stackIn_351_0 = stackOut_350_0;
                                            break L25;
                                          } else {
                                            stackOut_349_0 = ue.field_a;
                                            stackIn_351_0 = stackOut_349_0;
                                            break L25;
                                          }
                                        }
                                        L26: {
                                          var19 = stackIn_351_0;
                                          var9 = var19;
                                          var1 = var1 + ig.field_h;
                                          if (var19 == null) {
                                            break L26;
                                          } else {
                                            var19.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                                            break L26;
                                          }
                                        }
                                        var1 = var1 + wa.field_N;
                                        break L24;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    if (var4 >= 0) {
                                      cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                                      var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                                      var3++;
                                      continue L14;
                                    } else {
                                      uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                                      var1 = var1 + s.field_g;
                                      var3++;
                                      continue L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L27: {
                            if (ga.field_i.length <= wg.field_h.length) {
                              stackOut_365_0 = wg.field_h.length;
                              stackIn_366_0 = stackOut_365_0;
                              break L27;
                            } else {
                              stackOut_364_0 = ga.field_i.length;
                              stackIn_366_0 = stackOut_364_0;
                              break L27;
                            }
                          }
                          var8 = stackIn_366_0;
                          if (7 + var7 > var3) {
                            break L1;
                          } else {
                            if (var8 + 7 - -var7 <= var3) {
                              break L1;
                            } else {
                              L28: {
                                if (wg.field_h.length <= -7 + (var3 - var7)) {
                                  stackOut_370_0 = "";
                                  stackIn_371_0 = stackOut_370_0;
                                  break L28;
                                } else {
                                  stackOut_369_0 = wg.field_h[-7 + var3 - var7];
                                  stackIn_371_0 = stackOut_369_0;
                                  break L28;
                                }
                              }
                              var6_ref = stackIn_371_0;
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    L29: {
                      if (-2 == var4) {
                        var6_ref = Integer.toString(var2);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L30: {
                      stackOut_375_0 = (String) var6_ref;
                      stackIn_377_0 = stackOut_375_0;
                      stackIn_376_0 = stackOut_375_0;
                      if (var4 < 0) {
                        stackOut_377_0 = (String) (Object) stackIn_377_0;
                        stackOut_377_1 = 0;
                        stackIn_378_0 = stackOut_377_0;
                        stackIn_378_1 = stackOut_377_1;
                        break L30;
                      } else {
                        stackOut_376_0 = (String) (Object) stackIn_376_0;
                        stackOut_376_1 = 1;
                        stackIn_378_0 = stackOut_376_0;
                        stackIn_378_1 = stackOut_376_1;
                        break L30;
                      }
                    }
                    L31: {
                      var7 = u.a(stackIn_378_0, stackIn_378_1 != 0, true);
                      var8 = -(var7 >> 198130753) + ji.field_f;
                      if (-1 >= (var4 ^ -1)) {
                        L32: {
                          if (wg.field_k.field_f != var4) {
                            stackOut_382_0 = wd.field_c;
                            stackIn_383_0 = stackOut_382_0;
                            break L32;
                          } else {
                            stackOut_381_0 = ue.field_a;
                            stackIn_383_0 = stackOut_381_0;
                            break L32;
                          }
                        }
                        var20 = stackIn_383_0;
                        var9 = var20;
                        var1 = var1 + ig.field_h;
                        if (var20 == null) {
                          var1 = var1 + wa.field_N;
                          break L31;
                        } else {
                          L33: {
                            var20.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                            var1 = var1 + wa.field_N;
                            if (var4 >= 0) {
                              cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                              var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                              break L33;
                            } else {
                              uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                              var1 = var1 + s.field_g;
                              var3++;
                              break L33;
                            }
                          }
                          var3++;
                          var3++;
                          var3 = 0;
                          L34: while (true) {
                            if (sg.field_f.length <= var3) {
                              return;
                            } else {
                              L35: {
                                var4 = lg.field_a[var3];
                                if (0 > var4) {
                                  var5 = b.field_h;
                                  break L35;
                                } else {
                                  if (wg.field_k.field_f == var4) {
                                    var5 = a.field_i;
                                    break L35;
                                  } else {
                                    var5 = pj.field_E;
                                    break L35;
                                  }
                                }
                              }
                              L36: {
                                var6 = sg.field_f[var3];
                                if (re.field_g != -3) {
                                  break L36;
                                } else {
                                  if (-2 != var2) {
                                    break L36;
                                  } else {
                                    L37: {
                                      if (lk.field_i.length < ng.field_d.length) {
                                        stackOut_399_0 = ng.field_d.length;
                                        stackIn_400_0 = stackOut_399_0;
                                        break L37;
                                      } else {
                                        stackOut_398_0 = lk.field_i.length;
                                        stackIn_400_0 = stackOut_398_0;
                                        break L37;
                                      }
                                    }
                                    L38: {
                                      var7 = stackIn_400_0;
                                      if (var3 < 6) {
                                        break L38;
                                      } else {
                                        if (6 - -var7 > var3) {
                                          L39: {
                                            if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                              stackOut_405_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                              stackIn_406_0 = stackOut_405_0;
                                              break L39;
                                            } else {
                                              stackOut_404_0 = "";
                                              stackIn_406_0 = stackOut_404_0;
                                              break L39;
                                            }
                                          }
                                          var6_ref = stackIn_406_0;
                                          break L38;
                                        } else {
                                          break L38;
                                        }
                                      }
                                    }
                                    L40: {
                                      if (ga.field_i.length <= wg.field_h.length) {
                                        stackOut_409_0 = wg.field_h.length;
                                        stackIn_410_0 = stackOut_409_0;
                                        break L40;
                                      } else {
                                        stackOut_408_0 = ga.field_i.length;
                                        stackIn_410_0 = stackOut_408_0;
                                        break L40;
                                      }
                                    }
                                    var8 = stackIn_410_0;
                                    if (7 + var7 > var3) {
                                      break L36;
                                    } else {
                                      if (var8 + 7 - -var7 <= var3) {
                                        break L36;
                                      } else {
                                        L41: {
                                          if (wg.field_h.length <= -7 + (var3 - var7)) {
                                            stackOut_414_0 = "";
                                            stackIn_415_0 = stackOut_414_0;
                                            break L41;
                                          } else {
                                            stackOut_413_0 = wg.field_h[-7 + var3 - var7];
                                            stackIn_415_0 = stackOut_413_0;
                                            break L41;
                                          }
                                        }
                                        var6_ref = stackIn_415_0;
                                        break L36;
                                      }
                                    }
                                  }
                                }
                              }
                              L42: {
                                if (-2 == var4) {
                                  var6_ref = Integer.toString(var2);
                                  break L42;
                                } else {
                                  break L42;
                                }
                              }
                              L43: {
                                stackOut_419_0 = (String) var6_ref;
                                stackIn_421_0 = stackOut_419_0;
                                stackIn_420_0 = stackOut_419_0;
                                if (var4 < 0) {
                                  stackOut_421_0 = (String) (Object) stackIn_421_0;
                                  stackOut_421_1 = 0;
                                  stackIn_422_0 = stackOut_421_0;
                                  stackIn_422_1 = stackOut_421_1;
                                  break L43;
                                } else {
                                  stackOut_420_0 = (String) (Object) stackIn_420_0;
                                  stackOut_420_1 = 1;
                                  stackIn_422_0 = stackOut_420_0;
                                  stackIn_422_1 = stackOut_420_1;
                                  break L43;
                                }
                              }
                              L44: {
                                var7 = u.a(stackIn_422_0, stackIn_422_1 != 0, true);
                                var8 = -(var7 >> 198130753) + ji.field_f;
                                if (-1 >= (var4 ^ -1)) {
                                  L45: {
                                    if (wg.field_k.field_f != var4) {
                                      stackOut_426_0 = wd.field_c;
                                      stackIn_427_0 = stackOut_426_0;
                                      break L45;
                                    } else {
                                      stackOut_425_0 = ue.field_a;
                                      stackIn_427_0 = stackOut_425_0;
                                      break L45;
                                    }
                                  }
                                  L46: {
                                    var21 = stackIn_427_0;
                                    var9 = var21;
                                    var1 = var1 + ig.field_h;
                                    if (var21 == null) {
                                      break L46;
                                    } else {
                                      var21.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                                      break L46;
                                    }
                                  }
                                  var1 = var1 + wa.field_N;
                                  break L44;
                                } else {
                                  break L44;
                                }
                              }
                              if (var4 >= 0) {
                                cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                                var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                                var3++;
                                continue L34;
                              } else {
                                uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                                var1 = var1 + s.field_g;
                                var3++;
                                continue L34;
                              }
                            }
                          }
                        }
                      } else {
                        break L31;
                      }
                    }
                    L47: {
                      if (var4 >= 0) {
                        cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                        var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                        break L47;
                      } else {
                        uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                        var1 = var1 + s.field_g;
                        var3++;
                        break L47;
                      }
                    }
                    var3++;
                    var3++;
                    break L0;
                  } else {
                    if (wg.field_k.field_f == var4) {
                      L48: {
                        var5 = a.field_i;
                        var6 = sg.field_f[var3];
                        if (re.field_g != -3) {
                          break L48;
                        } else {
                          if (-2 != var2) {
                            break L48;
                          } else {
                            L49: {
                              if (lk.field_i.length < ng.field_d.length) {
                                stackOut_196_0 = ng.field_d.length;
                                stackIn_197_0 = stackOut_196_0;
                                break L49;
                              } else {
                                stackOut_195_0 = lk.field_i.length;
                                stackIn_197_0 = stackOut_195_0;
                                break L49;
                              }
                            }
                            L50: {
                              var7 = stackIn_197_0;
                              if (var3 < 6) {
                                break L50;
                              } else {
                                if (6 - -var7 > var3) {
                                  L51: {
                                    if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                      stackOut_202_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                      stackIn_203_0 = stackOut_202_0;
                                      break L51;
                                    } else {
                                      stackOut_201_0 = "";
                                      stackIn_203_0 = stackOut_201_0;
                                      break L51;
                                    }
                                  }
                                  var6_ref = stackIn_203_0;
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                            }
                            L52: {
                              if (ga.field_i.length <= wg.field_h.length) {
                                stackOut_206_0 = wg.field_h.length;
                                stackIn_207_0 = stackOut_206_0;
                                break L52;
                              } else {
                                stackOut_205_0 = ga.field_i.length;
                                stackIn_207_0 = stackOut_205_0;
                                break L52;
                              }
                            }
                            var8 = stackIn_207_0;
                            if (7 + var7 > var3) {
                              break L48;
                            } else {
                              if (var8 + 7 - -var7 <= var3) {
                                break L48;
                              } else {
                                L53: {
                                  if (wg.field_h.length <= -7 + (var3 - var7)) {
                                    stackOut_211_0 = "";
                                    stackIn_212_0 = stackOut_211_0;
                                    break L53;
                                  } else {
                                    stackOut_210_0 = wg.field_h[-7 + var3 - var7];
                                    stackIn_212_0 = stackOut_210_0;
                                    break L53;
                                  }
                                }
                                var6_ref = stackIn_212_0;
                                break L48;
                              }
                            }
                          }
                        }
                      }
                      L54: {
                        if (-2 == var4) {
                          var6_ref = Integer.toString(var2);
                          break L54;
                        } else {
                          break L54;
                        }
                      }
                      L55: {
                        stackOut_216_0 = (String) var6_ref;
                        stackIn_218_0 = stackOut_216_0;
                        stackIn_217_0 = stackOut_216_0;
                        if (var4 < 0) {
                          stackOut_218_0 = (String) (Object) stackIn_218_0;
                          stackOut_218_1 = 0;
                          stackIn_219_0 = stackOut_218_0;
                          stackIn_219_1 = stackOut_218_1;
                          break L55;
                        } else {
                          stackOut_217_0 = (String) (Object) stackIn_217_0;
                          stackOut_217_1 = 1;
                          stackIn_219_0 = stackOut_217_0;
                          stackIn_219_1 = stackOut_217_1;
                          break L55;
                        }
                      }
                      L56: {
                        var7 = u.a(stackIn_219_0, stackIn_219_1 != 0, true);
                        var8 = -(var7 >> 198130753) + ji.field_f;
                        if (-1 >= (var4 ^ -1)) {
                          L57: {
                            if (wg.field_k.field_f != var4) {
                              stackOut_223_0 = wd.field_c;
                              stackIn_224_0 = stackOut_223_0;
                              break L57;
                            } else {
                              stackOut_222_0 = ue.field_a;
                              stackIn_224_0 = stackOut_222_0;
                              break L57;
                            }
                          }
                          L58: {
                            var16 = stackIn_224_0;
                            var9 = var16;
                            var1 = var1 + ig.field_h;
                            if (var16 == null) {
                              break L58;
                            } else {
                              var16.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                              break L58;
                            }
                          }
                          var1 = var1 + wa.field_N;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                      L59: {
                        if (var4 >= 0) {
                          cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                          var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                          break L59;
                        } else {
                          uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                          var1 = var1 + s.field_g;
                          var3++;
                          break L59;
                        }
                      }
                      var3++;
                      var3++;
                      var3 = 0;
                      L60: while (true) {
                        if (sg.field_f.length <= var3) {
                          return;
                        } else {
                          L61: {
                            var4 = lg.field_a[var3];
                            if (0 > var4) {
                              var5 = b.field_h;
                              break L61;
                            } else {
                              if (wg.field_k.field_f == var4) {
                                var5 = a.field_i;
                                break L61;
                              } else {
                                var5 = pj.field_E;
                                break L61;
                              }
                            }
                          }
                          L62: {
                            var6 = sg.field_f[var3];
                            if (re.field_g != -3) {
                              break L62;
                            } else {
                              if (-2 != var2) {
                                break L62;
                              } else {
                                L63: {
                                  if (lk.field_i.length < ng.field_d.length) {
                                    stackOut_242_0 = ng.field_d.length;
                                    stackIn_243_0 = stackOut_242_0;
                                    break L63;
                                  } else {
                                    stackOut_241_0 = lk.field_i.length;
                                    stackIn_243_0 = stackOut_241_0;
                                    break L63;
                                  }
                                }
                                L64: {
                                  var7 = stackIn_243_0;
                                  if (var3 < 6) {
                                    break L64;
                                  } else {
                                    if (6 - -var7 > var3) {
                                      L65: {
                                        if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                          stackOut_248_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                          stackIn_249_0 = stackOut_248_0;
                                          break L65;
                                        } else {
                                          stackOut_247_0 = "";
                                          stackIn_249_0 = stackOut_247_0;
                                          break L65;
                                        }
                                      }
                                      var6_ref = stackIn_249_0;
                                      break L64;
                                    } else {
                                      break L64;
                                    }
                                  }
                                }
                                L66: {
                                  if (ga.field_i.length <= wg.field_h.length) {
                                    stackOut_252_0 = wg.field_h.length;
                                    stackIn_253_0 = stackOut_252_0;
                                    break L66;
                                  } else {
                                    stackOut_251_0 = ga.field_i.length;
                                    stackIn_253_0 = stackOut_251_0;
                                    break L66;
                                  }
                                }
                                var8 = stackIn_253_0;
                                if (7 + var7 > var3) {
                                  break L62;
                                } else {
                                  if (var8 + 7 - -var7 <= var3) {
                                    break L62;
                                  } else {
                                    L67: {
                                      if (wg.field_h.length <= -7 + (var3 - var7)) {
                                        stackOut_257_0 = "";
                                        stackIn_258_0 = stackOut_257_0;
                                        break L67;
                                      } else {
                                        stackOut_256_0 = wg.field_h[-7 + var3 - var7];
                                        stackIn_258_0 = stackOut_256_0;
                                        break L67;
                                      }
                                    }
                                    var6_ref = stackIn_258_0;
                                    break L62;
                                  }
                                }
                              }
                            }
                          }
                          L68: {
                            if (-2 == var4) {
                              var6_ref = Integer.toString(var2);
                              break L68;
                            } else {
                              break L68;
                            }
                          }
                          L69: {
                            stackOut_262_0 = (String) var6_ref;
                            stackIn_264_0 = stackOut_262_0;
                            stackIn_263_0 = stackOut_262_0;
                            if (var4 < 0) {
                              stackOut_264_0 = (String) (Object) stackIn_264_0;
                              stackOut_264_1 = 0;
                              stackIn_265_0 = stackOut_264_0;
                              stackIn_265_1 = stackOut_264_1;
                              break L69;
                            } else {
                              stackOut_263_0 = (String) (Object) stackIn_263_0;
                              stackOut_263_1 = 1;
                              stackIn_265_0 = stackOut_263_0;
                              stackIn_265_1 = stackOut_263_1;
                              break L69;
                            }
                          }
                          L70: {
                            var7 = u.a(stackIn_265_0, stackIn_265_1 != 0, true);
                            var8 = -(var7 >> 198130753) + ji.field_f;
                            if (-1 >= (var4 ^ -1)) {
                              L71: {
                                if (wg.field_k.field_f != var4) {
                                  stackOut_269_0 = wd.field_c;
                                  stackIn_270_0 = stackOut_269_0;
                                  break L71;
                                } else {
                                  stackOut_268_0 = ue.field_a;
                                  stackIn_270_0 = stackOut_268_0;
                                  break L71;
                                }
                              }
                              L72: {
                                var17 = stackIn_270_0;
                                var9 = var17;
                                var1 = var1 + ig.field_h;
                                if (var17 == null) {
                                  break L72;
                                } else {
                                  var17.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                                  break L72;
                                }
                              }
                              var1 = var1 + wa.field_N;
                              break L70;
                            } else {
                              break L70;
                            }
                          }
                          if (var4 >= 0) {
                            cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                            var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                            var3++;
                            continue L60;
                          } else {
                            uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                            var1 = var1 + s.field_g;
                            var3++;
                            continue L60;
                          }
                        }
                      }
                    } else {
                      L73: {
                        var5 = pj.field_E;
                        var6 = sg.field_f[var3];
                        if (re.field_g != -3) {
                          break L73;
                        } else {
                          if (-2 != var2) {
                            break L73;
                          } else {
                            L74: {
                              if (lk.field_i.length < ng.field_d.length) {
                                stackOut_110_0 = ng.field_d.length;
                                stackIn_111_0 = stackOut_110_0;
                                break L74;
                              } else {
                                stackOut_109_0 = lk.field_i.length;
                                stackIn_111_0 = stackOut_109_0;
                                break L74;
                              }
                            }
                            L75: {
                              var7 = stackIn_111_0;
                              if (var3 < 6) {
                                break L75;
                              } else {
                                if (6 - -var7 > var3) {
                                  L76: {
                                    if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                      stackOut_116_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                      stackIn_117_0 = stackOut_116_0;
                                      break L76;
                                    } else {
                                      stackOut_115_0 = "";
                                      stackIn_117_0 = stackOut_115_0;
                                      break L76;
                                    }
                                  }
                                  var6_ref = stackIn_117_0;
                                  break L75;
                                } else {
                                  break L75;
                                }
                              }
                            }
                            L77: {
                              if (ga.field_i.length <= wg.field_h.length) {
                                stackOut_120_0 = wg.field_h.length;
                                stackIn_121_0 = stackOut_120_0;
                                break L77;
                              } else {
                                stackOut_119_0 = ga.field_i.length;
                                stackIn_121_0 = stackOut_119_0;
                                break L77;
                              }
                            }
                            var8 = stackIn_121_0;
                            if (7 + var7 > var3) {
                              break L73;
                            } else {
                              if (var8 + 7 - -var7 <= var3) {
                                break L73;
                              } else {
                                L78: {
                                  if (wg.field_h.length <= -7 + (var3 - var7)) {
                                    stackOut_125_0 = "";
                                    stackIn_126_0 = stackOut_125_0;
                                    break L78;
                                  } else {
                                    stackOut_124_0 = wg.field_h[-7 + var3 - var7];
                                    stackIn_126_0 = stackOut_124_0;
                                    break L78;
                                  }
                                }
                                var6_ref = stackIn_126_0;
                                break L73;
                              }
                            }
                          }
                        }
                      }
                      L79: {
                        if (-2 == var4) {
                          var6_ref = Integer.toString(var2);
                          break L79;
                        } else {
                          break L79;
                        }
                      }
                      L80: {
                        stackOut_130_0 = (String) var6_ref;
                        stackIn_132_0 = stackOut_130_0;
                        stackIn_131_0 = stackOut_130_0;
                        if (var4 < 0) {
                          stackOut_132_0 = (String) (Object) stackIn_132_0;
                          stackOut_132_1 = 0;
                          stackIn_133_0 = stackOut_132_0;
                          stackIn_133_1 = stackOut_132_1;
                          break L80;
                        } else {
                          stackOut_131_0 = (String) (Object) stackIn_131_0;
                          stackOut_131_1 = 1;
                          stackIn_133_0 = stackOut_131_0;
                          stackIn_133_1 = stackOut_131_1;
                          break L80;
                        }
                      }
                      L81: {
                        var7 = u.a(stackIn_133_0, stackIn_133_1 != 0, true);
                        var8 = -(var7 >> 198130753) + ji.field_f;
                        if (-1 >= (var4 ^ -1)) {
                          L82: {
                            if (wg.field_k.field_f != var4) {
                              stackOut_137_0 = wd.field_c;
                              stackIn_138_0 = stackOut_137_0;
                              break L82;
                            } else {
                              stackOut_136_0 = ue.field_a;
                              stackIn_138_0 = stackOut_136_0;
                              break L82;
                            }
                          }
                          L83: {
                            var14 = stackIn_138_0;
                            var9 = var14;
                            var1 = var1 + ig.field_h;
                            if (var14 == null) {
                              break L83;
                            } else {
                              var14.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                              break L83;
                            }
                          }
                          var1 = var1 + wa.field_N;
                          break L81;
                        } else {
                          break L81;
                        }
                      }
                      L84: {
                        if (var4 >= 0) {
                          cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                          var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                          break L84;
                        } else {
                          uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                          var1 = var1 + s.field_g;
                          var3++;
                          break L84;
                        }
                      }
                      var3++;
                      var3++;
                      var3 = 0;
                      L85: while (true) {
                        if (sg.field_f.length <= var3) {
                          return;
                        } else {
                          L86: {
                            var4 = lg.field_a[var3];
                            if (0 > var4) {
                              var5 = b.field_h;
                              break L86;
                            } else {
                              if (wg.field_k.field_f == var4) {
                                var5 = a.field_i;
                                break L86;
                              } else {
                                var5 = pj.field_E;
                                break L86;
                              }
                            }
                          }
                          L87: {
                            var6 = sg.field_f[var3];
                            if (re.field_g != -3) {
                              break L87;
                            } else {
                              if (-2 != var2) {
                                break L87;
                              } else {
                                L88: {
                                  if (lk.field_i.length < ng.field_d.length) {
                                    stackOut_156_0 = ng.field_d.length;
                                    stackIn_157_0 = stackOut_156_0;
                                    break L88;
                                  } else {
                                    stackOut_155_0 = lk.field_i.length;
                                    stackIn_157_0 = stackOut_155_0;
                                    break L88;
                                  }
                                }
                                L89: {
                                  var7 = stackIn_157_0;
                                  if (var3 < 6) {
                                    break L89;
                                  } else {
                                    if (6 - -var7 > var3) {
                                      L90: {
                                        if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                          stackOut_162_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                          stackIn_163_0 = stackOut_162_0;
                                          break L90;
                                        } else {
                                          stackOut_161_0 = "";
                                          stackIn_163_0 = stackOut_161_0;
                                          break L90;
                                        }
                                      }
                                      var6_ref = stackIn_163_0;
                                      break L89;
                                    } else {
                                      break L89;
                                    }
                                  }
                                }
                                L91: {
                                  if (ga.field_i.length <= wg.field_h.length) {
                                    stackOut_166_0 = wg.field_h.length;
                                    stackIn_167_0 = stackOut_166_0;
                                    break L91;
                                  } else {
                                    stackOut_165_0 = ga.field_i.length;
                                    stackIn_167_0 = stackOut_165_0;
                                    break L91;
                                  }
                                }
                                var8 = stackIn_167_0;
                                if (7 + var7 > var3) {
                                  break L87;
                                } else {
                                  if (var8 + 7 - -var7 <= var3) {
                                    break L87;
                                  } else {
                                    L92: {
                                      if (wg.field_h.length <= -7 + (var3 - var7)) {
                                        stackOut_171_0 = "";
                                        stackIn_172_0 = stackOut_171_0;
                                        break L92;
                                      } else {
                                        stackOut_170_0 = wg.field_h[-7 + var3 - var7];
                                        stackIn_172_0 = stackOut_170_0;
                                        break L92;
                                      }
                                    }
                                    var6_ref = stackIn_172_0;
                                    break L87;
                                  }
                                }
                              }
                            }
                          }
                          L93: {
                            if (-2 == var4) {
                              var6_ref = Integer.toString(var2);
                              break L93;
                            } else {
                              break L93;
                            }
                          }
                          L94: {
                            stackOut_176_0 = (String) var6_ref;
                            stackIn_178_0 = stackOut_176_0;
                            stackIn_177_0 = stackOut_176_0;
                            if (var4 < 0) {
                              stackOut_178_0 = (String) (Object) stackIn_178_0;
                              stackOut_178_1 = 0;
                              stackIn_179_0 = stackOut_178_0;
                              stackIn_179_1 = stackOut_178_1;
                              break L94;
                            } else {
                              stackOut_177_0 = (String) (Object) stackIn_177_0;
                              stackOut_177_1 = 1;
                              stackIn_179_0 = stackOut_177_0;
                              stackIn_179_1 = stackOut_177_1;
                              break L94;
                            }
                          }
                          L95: {
                            var7 = u.a(stackIn_179_0, stackIn_179_1 != 0, true);
                            var8 = -(var7 >> 198130753) + ji.field_f;
                            if (-1 >= (var4 ^ -1)) {
                              L96: {
                                if (wg.field_k.field_f != var4) {
                                  stackOut_183_0 = wd.field_c;
                                  stackIn_184_0 = stackOut_183_0;
                                  break L96;
                                } else {
                                  stackOut_182_0 = ue.field_a;
                                  stackIn_184_0 = stackOut_182_0;
                                  break L96;
                                }
                              }
                              L97: {
                                var15 = stackIn_184_0;
                                var9 = var15;
                                var1 = var1 + ig.field_h;
                                if (var15 == null) {
                                  break L97;
                                } else {
                                  var15.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                                  break L97;
                                }
                              }
                              var1 = var1 + wa.field_N;
                              break L95;
                            } else {
                              break L95;
                            }
                          }
                          if (var4 >= 0) {
                            cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                            var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                            var3++;
                            continue L85;
                          } else {
                            uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                            var1 = var1 + s.field_g;
                            var3++;
                            continue L85;
                          }
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            }
            var3 = 0;
            L98: while (true) {
              if (sg.field_f.length <= var3) {
                return;
              } else {
                L99: {
                  var4 = lg.field_a[var3];
                  if (0 > var4) {
                    var5 = b.field_h;
                    break L99;
                  } else {
                    if (wg.field_k.field_f == var4) {
                      var5 = a.field_i;
                      break L99;
                    } else {
                      var5 = pj.field_E;
                      break L99;
                    }
                  }
                }
                L100: {
                  var6 = sg.field_f[var3];
                  if (re.field_g != -3) {
                    break L100;
                  } else {
                    if (-2 != var2) {
                      break L100;
                    } else {
                      L101: {
                        if (lk.field_i.length < ng.field_d.length) {
                          stackOut_452_0 = ng.field_d.length;
                          stackIn_453_0 = stackOut_452_0;
                          break L101;
                        } else {
                          stackOut_451_0 = lk.field_i.length;
                          stackIn_453_0 = stackOut_451_0;
                          break L101;
                        }
                      }
                      L102: {
                        var7 = stackIn_453_0;
                        if (var3 < 6) {
                          break L102;
                        } else {
                          if (6 - -var7 > var3) {
                            L103: {
                              if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                stackOut_458_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                stackIn_459_0 = stackOut_458_0;
                                break L103;
                              } else {
                                stackOut_457_0 = "";
                                stackIn_459_0 = stackOut_457_0;
                                break L103;
                              }
                            }
                            var6_ref = stackIn_459_0;
                            break L102;
                          } else {
                            break L102;
                          }
                        }
                      }
                      L104: {
                        if (ga.field_i.length <= wg.field_h.length) {
                          stackOut_462_0 = wg.field_h.length;
                          stackIn_463_0 = stackOut_462_0;
                          break L104;
                        } else {
                          stackOut_461_0 = ga.field_i.length;
                          stackIn_463_0 = stackOut_461_0;
                          break L104;
                        }
                      }
                      var8 = stackIn_463_0;
                      if (7 + var7 > var3) {
                        break L100;
                      } else {
                        if (var8 + 7 - -var7 <= var3) {
                          break L100;
                        } else {
                          L105: {
                            if (wg.field_h.length <= -7 + (var3 - var7)) {
                              stackOut_467_0 = "";
                              stackIn_468_0 = stackOut_467_0;
                              break L105;
                            } else {
                              stackOut_466_0 = wg.field_h[-7 + var3 - var7];
                              stackIn_468_0 = stackOut_466_0;
                              break L105;
                            }
                          }
                          var6_ref = stackIn_468_0;
                          break L100;
                        }
                      }
                    }
                  }
                }
                L106: {
                  if (-2 == var4) {
                    var6_ref = Integer.toString(var2);
                    break L106;
                  } else {
                    break L106;
                  }
                }
                L107: {
                  stackOut_472_0 = (String) var6_ref;
                  stackIn_474_0 = stackOut_472_0;
                  stackIn_473_0 = stackOut_472_0;
                  if (var4 < 0) {
                    stackOut_474_0 = (String) (Object) stackIn_474_0;
                    stackOut_474_1 = 0;
                    stackIn_475_0 = stackOut_474_0;
                    stackIn_475_1 = stackOut_474_1;
                    break L107;
                  } else {
                    stackOut_473_0 = (String) (Object) stackIn_473_0;
                    stackOut_473_1 = 1;
                    stackIn_475_0 = stackOut_473_0;
                    stackIn_475_1 = stackOut_473_1;
                    break L107;
                  }
                }
                L108: {
                  var7 = u.a(stackIn_475_0, stackIn_475_1 != 0, true);
                  var8 = -(var7 >> 198130753) + ji.field_f;
                  if (-1 >= (var4 ^ -1)) {
                    L109: {
                      if (wg.field_k.field_f != var4) {
                        stackOut_479_0 = wd.field_c;
                        stackIn_480_0 = stackOut_479_0;
                        break L109;
                      } else {
                        stackOut_478_0 = ue.field_a;
                        stackIn_480_0 = stackOut_478_0;
                        break L109;
                      }
                    }
                    L110: {
                      var22 = stackIn_480_0;
                      var9 = var22;
                      var1 = var1 + ig.field_h;
                      if (var22 == null) {
                        break L110;
                      } else {
                        var22.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                        break L110;
                      }
                    }
                    var1 = var1 + wa.field_N;
                    break L108;
                  } else {
                    break L108;
                  }
                }
                if (var4 >= 0) {
                  cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                  var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                  var3++;
                  continue L98;
                } else {
                  uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                  var1 = var1 + s.field_g;
                  var3++;
                  continue L98;
                }
              }
            }
          } else {
            L111: {
              if (param0 == 17077) {
                break L111;
              } else {
                field_mb = 118;
                break L111;
              }
            }
            L112: {
              var3 = 0;
              if (sg.field_f.length <= var3) {
                break L112;
              } else {
                L113: {
                  var4 = lg.field_a[var3];
                  if (0 > var4) {
                    var5 = b.field_h;
                    break L113;
                  } else {
                    if (wg.field_k.field_f == var4) {
                      var5 = a.field_i;
                      break L113;
                    } else {
                      var5 = pj.field_E;
                      break L113;
                    }
                  }
                }
                L114: {
                  var6 = sg.field_f[var3];
                  if (re.field_g != -3) {
                    break L114;
                  } else {
                    if (-2 != var2) {
                      break L114;
                    } else {
                      L115: {
                        if (lk.field_i.length < ng.field_d.length) {
                          stackOut_63_0 = ng.field_d.length;
                          stackIn_64_0 = stackOut_63_0;
                          break L115;
                        } else {
                          stackOut_62_0 = lk.field_i.length;
                          stackIn_64_0 = stackOut_62_0;
                          break L115;
                        }
                      }
                      L116: {
                        var7 = stackIn_64_0;
                        if (var3 < 6) {
                          break L116;
                        } else {
                          if (6 - -var7 > var3) {
                            L117: {
                              if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                                stackOut_69_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                                stackIn_70_0 = stackOut_69_0;
                                break L117;
                              } else {
                                stackOut_68_0 = "";
                                stackIn_70_0 = stackOut_68_0;
                                break L117;
                              }
                            }
                            var6_ref = stackIn_70_0;
                            break L116;
                          } else {
                            break L116;
                          }
                        }
                      }
                      L118: {
                        if (ga.field_i.length <= wg.field_h.length) {
                          stackOut_73_0 = wg.field_h.length;
                          stackIn_74_0 = stackOut_73_0;
                          break L118;
                        } else {
                          stackOut_72_0 = ga.field_i.length;
                          stackIn_74_0 = stackOut_72_0;
                          break L118;
                        }
                      }
                      var8 = stackIn_74_0;
                      if (7 + var7 > var3) {
                        break L114;
                      } else {
                        if (var8 + 7 - -var7 <= var3) {
                          break L114;
                        } else {
                          L119: {
                            if (wg.field_h.length <= -7 + (var3 - var7)) {
                              stackOut_78_0 = "";
                              stackIn_79_0 = stackOut_78_0;
                              break L119;
                            } else {
                              stackOut_77_0 = wg.field_h[-7 + var3 - var7];
                              stackIn_79_0 = stackOut_77_0;
                              break L119;
                            }
                          }
                          var6_ref = stackIn_79_0;
                          break L114;
                        }
                      }
                    }
                  }
                }
                L120: {
                  if (-2 == var4) {
                    var6_ref = Integer.toString(var2);
                    break L120;
                  } else {
                    break L120;
                  }
                }
                L121: {
                  stackOut_83_0 = (String) var6_ref;
                  stackIn_85_0 = stackOut_83_0;
                  stackIn_84_0 = stackOut_83_0;
                  if (var4 < 0) {
                    stackOut_85_0 = (String) (Object) stackIn_85_0;
                    stackOut_85_1 = 0;
                    stackIn_86_0 = stackOut_85_0;
                    stackIn_86_1 = stackOut_85_1;
                    break L121;
                  } else {
                    stackOut_84_0 = (String) (Object) stackIn_84_0;
                    stackOut_84_1 = 1;
                    stackIn_86_0 = stackOut_84_0;
                    stackIn_86_1 = stackOut_84_1;
                    break L121;
                  }
                }
                L122: {
                  var7 = u.a(stackIn_86_0, stackIn_86_1 != 0, true);
                  var8 = -(var7 >> 198130753) + ji.field_f;
                  if (-1 >= (var4 ^ -1)) {
                    L123: {
                      if (wg.field_k.field_f != var4) {
                        stackOut_90_0 = wd.field_c;
                        stackIn_91_0 = stackOut_90_0;
                        break L123;
                      } else {
                        stackOut_89_0 = ue.field_a;
                        stackIn_91_0 = stackOut_89_0;
                        break L123;
                      }
                    }
                    L124: {
                      var12 = stackIn_91_0;
                      var9 = var12;
                      var1 = var1 + ig.field_h;
                      if (var12 == null) {
                        break L124;
                      } else {
                        var12.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                        break L124;
                      }
                    }
                    var1 = var1 + wa.field_N;
                    break L122;
                  } else {
                    break L122;
                  }
                }
                L125: {
                  if (var4 >= 0) {
                    cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                    var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                    break L125;
                  } else {
                    uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                    var1 = var1 + s.field_g;
                    var3++;
                    break L125;
                  }
                }
                var3++;
                var3++;
                var3++;
                break L112;
              }
            }
            return;
          }
        } else {
          L126: {
            if (param0 == 17077) {
              break L126;
            } else {
              field_mb = 118;
              break L126;
            }
          }
          L127: {
            var3 = 0;
            if (sg.field_f.length <= var3) {
              break L127;
            } else {
              L128: {
                var4 = lg.field_a[var3];
                if (0 > var4) {
                  var5 = b.field_h;
                  break L128;
                } else {
                  if (wg.field_k.field_f == var4) {
                    var5 = a.field_i;
                    break L128;
                  } else {
                    var5 = pj.field_E;
                    break L128;
                  }
                }
              }
              L129: {
                var6 = sg.field_f[var3];
                if (re.field_g != -3) {
                  break L129;
                } else {
                  if (-2 != var2) {
                    break L129;
                  } else {
                    L130: {
                      if (lk.field_i.length < ng.field_d.length) {
                        stackOut_13_0 = ng.field_d.length;
                        stackIn_14_0 = stackOut_13_0;
                        break L130;
                      } else {
                        stackOut_12_0 = lk.field_i.length;
                        stackIn_14_0 = stackOut_12_0;
                        break L130;
                      }
                    }
                    L131: {
                      var7 = stackIn_14_0;
                      if (var3 < 6) {
                        break L131;
                      } else {
                        if (6 - -var7 > var3) {
                          L132: {
                            if (0 <= -var7 + lk.field_i.length + (var3 - 6)) {
                              stackOut_19_0 = lk.field_i[-var7 + (-6 + var3) - -lk.field_i.length];
                              stackIn_20_0 = stackOut_19_0;
                              break L132;
                            } else {
                              stackOut_18_0 = "";
                              stackIn_20_0 = stackOut_18_0;
                              break L132;
                            }
                          }
                          var6_ref = stackIn_20_0;
                          break L131;
                        } else {
                          break L131;
                        }
                      }
                    }
                    L133: {
                      if (ga.field_i.length <= wg.field_h.length) {
                        stackOut_23_0 = wg.field_h.length;
                        stackIn_24_0 = stackOut_23_0;
                        break L133;
                      } else {
                        stackOut_22_0 = ga.field_i.length;
                        stackIn_24_0 = stackOut_22_0;
                        break L133;
                      }
                    }
                    var8 = stackIn_24_0;
                    if (7 + var7 > var3) {
                      break L129;
                    } else {
                      if (var8 + 7 - -var7 <= var3) {
                        break L129;
                      } else {
                        L134: {
                          if (wg.field_h.length <= -7 + (var3 - var7)) {
                            stackOut_28_0 = "";
                            stackIn_29_0 = stackOut_28_0;
                            break L134;
                          } else {
                            stackOut_27_0 = wg.field_h[-7 + var3 - var7];
                            stackIn_29_0 = stackOut_27_0;
                            break L134;
                          }
                        }
                        var6_ref = stackIn_29_0;
                        break L129;
                      }
                    }
                  }
                }
              }
              L135: {
                if (-2 == var4) {
                  var6_ref = Integer.toString(var2);
                  break L135;
                } else {
                  break L135;
                }
              }
              L136: {
                stackOut_33_0 = (String) var6_ref;
                stackIn_35_0 = stackOut_33_0;
                stackIn_34_0 = stackOut_33_0;
                if (var4 < 0) {
                  stackOut_35_0 = (String) (Object) stackIn_35_0;
                  stackOut_35_1 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  stackIn_36_1 = stackOut_35_1;
                  break L136;
                } else {
                  stackOut_34_0 = (String) (Object) stackIn_34_0;
                  stackOut_34_1 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  stackIn_36_1 = stackOut_34_1;
                  break L136;
                }
              }
              L137: {
                var7 = u.a(stackIn_36_0, stackIn_36_1 != 0, true);
                var8 = -(var7 >> 198130753) + ji.field_f;
                if (-1 >= (var4 ^ -1)) {
                  L138: {
                    if (wg.field_k.field_f != var4) {
                      stackOut_40_0 = wd.field_c;
                      stackIn_41_0 = stackOut_40_0;
                      break L138;
                    } else {
                      stackOut_39_0 = ue.field_a;
                      stackIn_41_0 = stackOut_39_0;
                      break L138;
                    }
                  }
                  L139: {
                    var11 = stackIn_41_0;
                    var9 = var11;
                    var1 = var1 + ig.field_h;
                    if (var11 == null) {
                      break L139;
                    } else {
                      var11.a(ni.field_p + (wa.field_N << 205726401), var8 - dg.field_d, var7 + (dg.field_d << -2024536479), var1, 7453);
                      break L139;
                    }
                  }
                  var1 = var1 + wa.field_N;
                  break L137;
                } else {
                  break L137;
                }
              }
              L140: {
                if (var4 >= 0) {
                  cj.field_a.c(var6_ref, var8, var1 + hi.field_g, var5, -1);
                  var1 = var1 + (wa.field_N + ig.field_h + ni.field_p);
                  break L140;
                } else {
                  uj.field_i.c(var6_ref, var8, ha.field_a + var1, var5, -1);
                  var1 = var1 + s.field_g;
                  var3++;
                  break L140;
                }
              }
              var3++;
              var3++;
              var3++;
              break L127;
            }
          }
          return;
        }
    }

    tf(k param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((tf) this).field_ob = param1;
        if (null != ((tf) this).field_ob) {
            var3 = wi.field_e.a(((tf) this).field_ob, 260, wi.field_e.field_x);
            ((tf) this).b(300, 1688990433, var3 + 150);
        }
        ((tf) this).field_fb = new hd(13, 50, 274, 30, 15, 2113632, 4210752);
        ((tf) this).field_gb = false;
        ((tf) this).field_hb = false;
        ((tf) this).field_fb.field_E = true;
        ((tf) this).b((vg) (Object) ((tf) this).field_fb, (byte) 61);
    }

    final void h(byte param0) {
        ((tf) this).field_hb = true;
        if (param0 != 23) {
          field_nb = null;
          ((tf) this).field_fb.field_E = false;
          return;
        } else {
          ((tf) this).field_fb.field_E = false;
          return;
        }
    }

    final static void a(gi param0, int param1, gi param2) {
        Object var4 = null;
        if (null == param0.field_b) {
          if (param1 != 16709) {
            var4 = null;
            tf.a((gi) null, 103, (gi) null);
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
            return;
          } else {
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
            return;
          }
        } else {
          param0.a(param1 ^ -32364);
          if (param1 == 16709) {
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
            return;
          } else {
            var4 = null;
            tf.a((gi) null, 103, (gi) null);
            param0.field_b = param2.field_b;
            param0.field_e = param2;
            param0.field_b.field_e = param0;
            param0.field_e.field_b = param0;
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        L0: {
          super.c(param0, 59, param2);
          wi.field_e.b(((tf) this).field_lb, param2 - -(((tf) this).field_w >> 1813688929), 103 + param0, 16777215, -1);
          if (((tf) this).field_ob != null) {
            wj.g(20 + param2, 120 + (param0 + -7), 260, 8421504);
            int discarded$2 = wi.field_e.a(((tf) this).field_ob, param2 + 20, 8 + (param0 - -120), 260, 100, 16777215, -1, 1, 0, wi.field_e.field_x);
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 < 26) {
          field_nb = null;
          return;
        } else {
          return;
        }
    }

    final void a(String param0, boolean param1, int param2, float param3) {
        int stackIn_3_0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        L0: {
          if (((tf) this).field_gb) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        if (stackIn_3_0 != (param1 ? 1 : 0)) {
          if (param2 != 6) {
            ((tf) this).a((String) null, false, 76, -0.6110716462135315f);
            ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
            ((tf) this).field_lb = param0;
            return;
          } else {
            ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
            ((tf) this).field_lb = param0;
            return;
          }
        } else {
          L1: {
            stackOut_4_0 = this;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (!param1) {
              stackOut_6_0 = this;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L1;
            } else {
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L1;
            }
          }
          ((tf) this).field_gb = stackIn_7_1 != 0;
          if (((tf) this).field_gb) {
            ((tf) this).field_fb.a(false, 8405024, 4210752);
            ((tf) this).field_fb.field_E = true;
            if (param2 != 6) {
              ((tf) this).a((String) null, false, 76, -0.6110716462135315f);
              ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
              ((tf) this).field_lb = param0;
              return;
            } else {
              ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
              ((tf) this).field_lb = param0;
              return;
            }
          } else {
            ((tf) this).field_fb.a(false, 2113632, 4210752);
            if (((tf) this).field_hb) {
              ((tf) this).field_fb.field_E = false;
              if (param2 == 6) {
                ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
                ((tf) this).field_lb = param0;
                return;
              } else {
                ((tf) this).a((String) null, false, 76, -0.6110716462135315f);
                ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
                ((tf) this).field_lb = param0;
                return;
              }
            } else {
              if (param2 == 6) {
                ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
                ((tf) this).field_lb = param0;
                return;
              } else {
                ((tf) this).a((String) null, false, 76, -0.6110716462135315f);
                ((tf) this).field_fb.field_I = (int)(param3 / 100.0f * 65536.0f);
                ((tf) this).field_lb = param0;
                return;
              }
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_ib = null;
        field_pb = null;
        field_kb = null;
        field_nb = null;
        if (param0) {
            field_jb = -111;
            field_qb = null;
            return;
        }
        field_qb = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_qb = new bb();
        field_mb = 0;
        field_ib = "Invalid password.";
    }
}
