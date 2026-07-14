/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd {
    static int[][] field_c;
    static int field_d;
    static boolean field_b;
    static boolean field_a;

    final static void a(String param0, String param1, int param2) {
        Object var4 = null;
        if (param2 != -4776) {
          var4 = null;
          String discarded$2 = hd.a('>', (byte) -124, (String) null, (String) null);
          fd.a(86, false, param0, param1);
          return;
        } else {
          fd.a(86, false, param0, param1);
          return;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_a = false;
            return ql.field_a;
        }
        return ql.field_a;
    }

    public static void c(byte param0) {
        if (param0 > -80) {
            return;
        }
        field_c = null;
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        var4 = param3.length();
        if (param1 == -81) {
          var5 = param2.length();
          var6 = var4;
          var7 = -1 + var5;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param3.indexOf((int) param0, var8_int);
              if (0 <= var8_int) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var14 = new StringBuilder(var6);
                var8 = var14;
                var9 = 0;
                L1: while (true) {
                  var10 = param3.indexOf((int) param0, var9);
                  if (-1 < (var10 ^ -1)) {
                    StringBuilder discarded$10 = var14.append(param3.substring(var9));
                    return var14.toString();
                  } else {
                    StringBuilder discarded$11 = var14.append(param3.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$12 = var14.append(param2);
                    continue L1;
                  }
                }
              }
            }
          } else {
            var13 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param3.indexOf((int) param0, var9);
              if (-1 < (var10 ^ -1)) {
                StringBuilder discarded$13 = var13.append(param3.substring(var9));
                return var13.toString();
              } else {
                StringBuilder discarded$14 = var13.append(param3.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$15 = var13.append(param2);
                continue L2;
              }
            }
          }
        } else {
          L3: {
            var12 = null;
            String discarded$16 = hd.a('￻', (byte) 28, (String) null, (String) null);
            var5 = param2.length();
            var6 = var4;
            var7 = -1 + var5;
            if (var7 != 0) {
              var8_int = 0;
              L4: while (true) {
                var8_int = param3.indexOf((int) param0, var8_int);
                if (0 <= var8_int) {
                  var8_int++;
                  var6 = var6 + var7;
                  continue L4;
                } else {
                  var8 = new StringBuilder(var6);
                  var9 = 0;
                  break L3;
                }
              }
            } else {
              var8 = new StringBuilder(var6);
              var9 = 0;
              break L3;
            }
          }
          L5: while (true) {
            var10 = param3.indexOf((int) param0, var9);
            if (-1 < (var10 ^ -1)) {
              StringBuilder discarded$17 = var8.append(param3.substring(var9));
              return var8.toString();
            } else {
              StringBuilder discarded$18 = var8.append(param3.substring(var9, var10));
              var9 = 1 + var10;
              StringBuilder discarded$19 = var8.append(param2);
              continue L5;
            }
          }
        }
    }

    final static kh[] b(byte param0) {
        Object var2 = null;
        if (param0 != 87) {
          var2 = null;
          String discarded$2 = hd.a('￦', (byte) -39, (String) null, (String) null);
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        } else {
          return new kh[]{aa.field_d, of.field_f, qe.field_x};
        }
    }

    final static void a(byte param0) {
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
        pg var9 = null;
        int var10 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        String stackIn_22_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        String stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        String stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        pg stackIn_40_0 = null;
        int stackIn_63_0 = 0;
        int stackIn_66_0 = 0;
        String stackIn_71_0 = null;
        String stackIn_77_0 = null;
        String stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        String stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        String stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        pg stackIn_89_0 = null;
        int stackIn_109_0 = 0;
        int stackIn_112_0 = 0;
        String stackIn_117_0 = null;
        String stackIn_123_0 = null;
        String stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        String stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        String stackIn_130_0 = null;
        int stackIn_130_1 = 0;
        int stackIn_130_2 = 0;
        pg stackIn_135_0 = null;
        int stackIn_154_0 = 0;
        int stackIn_157_0 = 0;
        String stackIn_162_0 = null;
        String stackIn_168_0 = null;
        String stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        String stackIn_174_0 = null;
        int stackIn_174_1 = 0;
        String stackIn_175_0 = null;
        int stackIn_175_1 = 0;
        int stackIn_175_2 = 0;
        pg stackIn_180_0 = null;
        int stackIn_193_0 = 0;
        int stackIn_196_0 = 0;
        String stackIn_201_0 = null;
        String stackIn_207_0 = null;
        String stackIn_212_0 = null;
        int stackIn_212_1 = 0;
        String stackIn_213_0 = null;
        int stackIn_213_1 = 0;
        String stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        int stackIn_214_2 = 0;
        pg stackIn_219_0 = null;
        int stackIn_238_0 = 0;
        int stackIn_241_0 = 0;
        String stackIn_246_0 = null;
        String stackIn_252_0 = null;
        String stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        String stackIn_258_0 = null;
        int stackIn_258_1 = 0;
        String stackIn_259_0 = null;
        int stackIn_259_1 = 0;
        int stackIn_259_2 = 0;
        pg stackIn_264_0 = null;
        int stackIn_277_0 = 0;
        int stackIn_280_0 = 0;
        String stackIn_285_0 = null;
        String stackIn_291_0 = null;
        String stackIn_296_0 = null;
        int stackIn_296_1 = 0;
        String stackIn_297_0 = null;
        int stackIn_297_1 = 0;
        String stackIn_298_0 = null;
        int stackIn_298_1 = 0;
        int stackIn_298_2 = 0;
        pg stackIn_303_0 = null;
        int stackIn_320_0 = 0;
        int stackIn_323_0 = 0;
        String stackIn_328_0 = null;
        String stackIn_334_0 = null;
        String stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        String stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        String stackIn_341_0 = null;
        int stackIn_341_1 = 0;
        int stackIn_341_2 = 0;
        pg stackIn_346_0 = null;
        int stackIn_372_0 = 0;
        int stackIn_375_0 = 0;
        String stackIn_380_0 = null;
        String stackIn_386_0 = null;
        String stackIn_391_0 = null;
        int stackIn_391_1 = 0;
        String stackIn_392_0 = null;
        int stackIn_392_1 = 0;
        String stackIn_393_0 = null;
        int stackIn_393_1 = 0;
        int stackIn_393_2 = 0;
        pg stackIn_398_0 = null;
        int stackOut_276_0 = 0;
        int stackOut_275_0 = 0;
        int stackOut_279_0 = 0;
        int stackOut_278_0 = 0;
        String stackOut_284_0 = null;
        String stackOut_283_0 = null;
        String stackOut_290_0 = null;
        String stackOut_289_0 = null;
        String stackOut_295_0 = null;
        int stackOut_295_1 = 0;
        String stackOut_297_0 = null;
        int stackOut_297_1 = 0;
        int stackOut_297_2 = 0;
        String stackOut_296_0 = null;
        int stackOut_296_1 = 0;
        int stackOut_296_2 = 0;
        pg stackOut_302_0 = null;
        pg stackOut_301_0 = null;
        int stackOut_319_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_322_0 = 0;
        int stackOut_321_0 = 0;
        String stackOut_327_0 = null;
        String stackOut_326_0 = null;
        String stackOut_333_0 = null;
        String stackOut_332_0 = null;
        String stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        String stackOut_340_0 = null;
        int stackOut_340_1 = 0;
        int stackOut_340_2 = 0;
        String stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        int stackOut_339_2 = 0;
        pg stackOut_345_0 = null;
        pg stackOut_344_0 = null;
        int stackOut_192_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_194_0 = 0;
        String stackOut_200_0 = null;
        String stackOut_199_0 = null;
        String stackOut_206_0 = null;
        String stackOut_205_0 = null;
        String stackOut_211_0 = null;
        int stackOut_211_1 = 0;
        String stackOut_213_0 = null;
        int stackOut_213_1 = 0;
        int stackOut_213_2 = 0;
        String stackOut_212_0 = null;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        pg stackOut_218_0 = null;
        pg stackOut_217_0 = null;
        int stackOut_237_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_239_0 = 0;
        String stackOut_245_0 = null;
        String stackOut_244_0 = null;
        String stackOut_251_0 = null;
        String stackOut_250_0 = null;
        String stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        String stackOut_258_0 = null;
        int stackOut_258_1 = 0;
        int stackOut_258_2 = 0;
        String stackOut_257_0 = null;
        int stackOut_257_1 = 0;
        int stackOut_257_2 = 0;
        pg stackOut_263_0 = null;
        pg stackOut_262_0 = null;
        int stackOut_108_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        String stackOut_116_0 = null;
        String stackOut_115_0 = null;
        String stackOut_122_0 = null;
        String stackOut_121_0 = null;
        String stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        String stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        int stackOut_129_2 = 0;
        String stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        int stackOut_128_2 = 0;
        pg stackOut_134_0 = null;
        pg stackOut_133_0 = null;
        int stackOut_153_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_155_0 = 0;
        String stackOut_161_0 = null;
        String stackOut_160_0 = null;
        String stackOut_167_0 = null;
        String stackOut_166_0 = null;
        String stackOut_172_0 = null;
        int stackOut_172_1 = 0;
        String stackOut_174_0 = null;
        int stackOut_174_1 = 0;
        int stackOut_174_2 = 0;
        String stackOut_173_0 = null;
        int stackOut_173_1 = 0;
        int stackOut_173_2 = 0;
        pg stackOut_179_0 = null;
        pg stackOut_178_0 = null;
        int stackOut_371_0 = 0;
        int stackOut_370_0 = 0;
        int stackOut_374_0 = 0;
        int stackOut_373_0 = 0;
        String stackOut_379_0 = null;
        String stackOut_378_0 = null;
        String stackOut_385_0 = null;
        String stackOut_384_0 = null;
        String stackOut_390_0 = null;
        int stackOut_390_1 = 0;
        String stackOut_392_0 = null;
        int stackOut_392_1 = 0;
        int stackOut_392_2 = 0;
        String stackOut_391_0 = null;
        int stackOut_391_1 = 0;
        int stackOut_391_2 = 0;
        pg stackOut_397_0 = null;
        pg stackOut_396_0 = null;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        String stackOut_70_0 = null;
        String stackOut_69_0 = null;
        String stackOut_76_0 = null;
        String stackOut_75_0 = null;
        String stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        String stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        String stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        pg stackOut_88_0 = null;
        pg stackOut_87_0 = null;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        String stackOut_21_0 = null;
        String stackOut_20_0 = null;
        String stackOut_27_0 = null;
        String stackOut_26_0 = null;
        String stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        String stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        String stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        pg stackOut_39_0 = null;
        pg stackOut_38_0 = null;
        var10 = Transmogrify.field_A ? 1 : 0;
        var1 = qa.field_u;
        var2 = 0;
        if (2 == q.field_a) {
          var3_long = -c.field_c + lk.a(param0 + -8);
          var2 = (int)((10999L + -var3_long) / 1000L);
          if ((var2 ^ -1) > -1) {
            L0: {
              var2 = 0;
              if (param0 == 8) {
                break L0;
              } else {
                kh[] discarded$3 = hd.b((byte) 70);
                var3 = 0;
                if (qb.field_f.length > var3) {
                  var4 = ce.field_a[var3];
                  if (var4 > -1) {
                    L1: {
                      var5 = u.field_b;
                      var6 = qb.field_f[var3];
                      if (-3 != (q.field_a ^ -1)) {
                        break L1;
                      } else {
                        if ((var2 ^ -1) != -2) {
                          break L1;
                        } else {
                          L2: {
                            if (ng.field_i.length > bd.field_p.length) {
                              stackOut_276_0 = ng.field_i.length;
                              stackIn_277_0 = stackOut_276_0;
                              break L2;
                            } else {
                              stackOut_275_0 = bd.field_p.length;
                              stackIn_277_0 = stackOut_275_0;
                              break L2;
                            }
                          }
                          L3: {
                            var7 = stackIn_277_0;
                            if (th.field_d.length > ne.field_a.length) {
                              stackOut_279_0 = th.field_d.length;
                              stackIn_280_0 = stackOut_279_0;
                              break L3;
                            } else {
                              stackOut_278_0 = ne.field_a.length;
                              stackIn_280_0 = stackOut_278_0;
                              break L3;
                            }
                          }
                          L4: {
                            var8 = stackIn_280_0;
                            if (-7 < (var3 ^ -1)) {
                              break L4;
                            } else {
                              if (6 - -var7 <= var3) {
                                break L4;
                              } else {
                                L5: {
                                  if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                    stackOut_284_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                    stackIn_285_0 = stackOut_284_0;
                                    break L5;
                                  } else {
                                    stackOut_283_0 = "";
                                    stackIn_285_0 = stackOut_283_0;
                                    break L5;
                                  }
                                }
                                var6_ref = stackIn_285_0;
                                break L4;
                              }
                            }
                          }
                          if (var3 < 7 + var7) {
                            break L1;
                          } else {
                            if (var8 + var7 + 7 <= var3) {
                              break L1;
                            } else {
                              L6: {
                                if (-var7 + (-7 + var3) < ne.field_a.length) {
                                  stackOut_290_0 = ne.field_a[-var7 + (-7 + var3)];
                                  stackIn_291_0 = stackOut_290_0;
                                  break L6;
                                } else {
                                  stackOut_289_0 = "";
                                  stackIn_291_0 = stackOut_289_0;
                                  break L6;
                                }
                              }
                              var6_ref = stackIn_291_0;
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (1 == var4) {
                        var6_ref = Integer.toString(var2);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      stackOut_295_0 = (String) var6_ref;
                      stackOut_295_1 = 0;
                      stackIn_297_0 = stackOut_295_0;
                      stackIn_297_1 = stackOut_295_1;
                      stackIn_296_0 = stackOut_295_0;
                      stackIn_296_1 = stackOut_295_1;
                      if (-1 > var4) {
                        stackOut_297_0 = (String) (Object) stackIn_297_0;
                        stackOut_297_1 = stackIn_297_1;
                        stackOut_297_2 = 0;
                        stackIn_298_0 = stackOut_297_0;
                        stackIn_298_1 = stackOut_297_1;
                        stackIn_298_2 = stackOut_297_2;
                        break L8;
                      } else {
                        stackOut_296_0 = (String) (Object) stackIn_296_0;
                        stackOut_296_1 = stackIn_296_1;
                        stackOut_296_2 = 1;
                        stackIn_298_0 = stackOut_296_0;
                        stackIn_298_1 = stackOut_296_1;
                        stackIn_298_2 = stackOut_296_2;
                        break L8;
                      }
                    }
                    L9: {
                      var7 = uc.a(stackIn_298_0, stackIn_298_1 != 0, stackIn_298_2 != 0);
                      var8 = wd.field_j - (var7 >> -1429395903);
                      if (-1 >= (var4 ^ -1)) {
                        L10: {
                          if (var4 != bk.field_c.field_d) {
                            stackOut_302_0 = gl.field_B;
                            stackIn_303_0 = stackOut_302_0;
                            break L10;
                          } else {
                            stackOut_301_0 = cd.field_f;
                            stackIn_303_0 = stackOut_301_0;
                            break L10;
                          }
                        }
                        var9 = stackIn_303_0;
                        var1 = var1 + ee.field_D;
                        if (var9 == null) {
                          var1 = var1 + jl.field_o;
                          break L9;
                        } else {
                          L11: {
                            var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                            var1 = var1 + jl.field_o;
                            if (var4 < 0) {
                              ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                              var1 = var1 + fi.field_x;
                              break L11;
                            } else {
                              tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                              var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                              var3++;
                              break L11;
                            }
                          }
                          var3++;
                          var3++;
                          var3 = 0;
                          L12: while (true) {
                            if (qb.field_f.length <= var3) {
                              return;
                            } else {
                              L13: {
                                var4 = ce.field_a[var3];
                                if ((var4 ^ -1) > -1) {
                                  var5 = u.field_b;
                                  break L13;
                                } else {
                                  if (var4 != bk.field_c.field_d) {
                                    var5 = Transmogrify.field_D;
                                    break L13;
                                  } else {
                                    var5 = pf.field_b;
                                    break L13;
                                  }
                                }
                              }
                              L14: {
                                var6 = qb.field_f[var3];
                                if (-3 != (q.field_a ^ -1)) {
                                  break L14;
                                } else {
                                  if ((var2 ^ -1) != -2) {
                                    break L14;
                                  } else {
                                    L15: {
                                      if (ng.field_i.length > bd.field_p.length) {
                                        stackOut_319_0 = ng.field_i.length;
                                        stackIn_320_0 = stackOut_319_0;
                                        break L15;
                                      } else {
                                        stackOut_318_0 = bd.field_p.length;
                                        stackIn_320_0 = stackOut_318_0;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      var7 = stackIn_320_0;
                                      if (th.field_d.length > ne.field_a.length) {
                                        stackOut_322_0 = th.field_d.length;
                                        stackIn_323_0 = stackOut_322_0;
                                        break L16;
                                      } else {
                                        stackOut_321_0 = ne.field_a.length;
                                        stackIn_323_0 = stackOut_321_0;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      var8 = stackIn_323_0;
                                      if (-7 < (var3 ^ -1)) {
                                        break L17;
                                      } else {
                                        if (6 - -var7 <= var3) {
                                          break L17;
                                        } else {
                                          L18: {
                                            if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                              stackOut_327_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                              stackIn_328_0 = stackOut_327_0;
                                              break L18;
                                            } else {
                                              stackOut_326_0 = "";
                                              stackIn_328_0 = stackOut_326_0;
                                              break L18;
                                            }
                                          }
                                          var6_ref = stackIn_328_0;
                                          break L17;
                                        }
                                      }
                                    }
                                    if (var3 < 7 + var7) {
                                      break L14;
                                    } else {
                                      if (var8 + var7 + 7 <= var3) {
                                        break L14;
                                      } else {
                                        L19: {
                                          if (-var7 + (-7 + var3) < ne.field_a.length) {
                                            stackOut_333_0 = ne.field_a[-var7 + (-7 + var3)];
                                            stackIn_334_0 = stackOut_333_0;
                                            break L19;
                                          } else {
                                            stackOut_332_0 = "";
                                            stackIn_334_0 = stackOut_332_0;
                                            break L19;
                                          }
                                        }
                                        var6_ref = stackIn_334_0;
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                              L20: {
                                if (1 == var4) {
                                  var6_ref = Integer.toString(var2);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              L21: {
                                stackOut_338_0 = (String) var6_ref;
                                stackOut_338_1 = 0;
                                stackIn_340_0 = stackOut_338_0;
                                stackIn_340_1 = stackOut_338_1;
                                stackIn_339_0 = stackOut_338_0;
                                stackIn_339_1 = stackOut_338_1;
                                if (-1 > var4) {
                                  stackOut_340_0 = (String) (Object) stackIn_340_0;
                                  stackOut_340_1 = stackIn_340_1;
                                  stackOut_340_2 = 0;
                                  stackIn_341_0 = stackOut_340_0;
                                  stackIn_341_1 = stackOut_340_1;
                                  stackIn_341_2 = stackOut_340_2;
                                  break L21;
                                } else {
                                  stackOut_339_0 = (String) (Object) stackIn_339_0;
                                  stackOut_339_1 = stackIn_339_1;
                                  stackOut_339_2 = 1;
                                  stackIn_341_0 = stackOut_339_0;
                                  stackIn_341_1 = stackOut_339_1;
                                  stackIn_341_2 = stackOut_339_2;
                                  break L21;
                                }
                              }
                              L22: {
                                var7 = uc.a(stackIn_341_0, stackIn_341_1 != 0, stackIn_341_2 != 0);
                                var8 = wd.field_j - (var7 >> -1429395903);
                                if (-1 >= (var4 ^ -1)) {
                                  L23: {
                                    if (var4 != bk.field_c.field_d) {
                                      stackOut_345_0 = gl.field_B;
                                      stackIn_346_0 = stackOut_345_0;
                                      break L23;
                                    } else {
                                      stackOut_344_0 = cd.field_f;
                                      stackIn_346_0 = stackOut_344_0;
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    var9 = stackIn_346_0;
                                    var1 = var1 + ee.field_D;
                                    if (var9 == null) {
                                      break L24;
                                    } else {
                                      var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                                      break L24;
                                    }
                                  }
                                  var1 = var1 + jl.field_o;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              if (var4 < 0) {
                                ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                                var1 = var1 + fi.field_x;
                                var3++;
                                continue L12;
                              } else {
                                tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                                var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                                var3++;
                                continue L12;
                              }
                            }
                          }
                        }
                      } else {
                        break L9;
                      }
                    }
                    L25: {
                      if (var4 < 0) {
                        ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                        var1 = var1 + fi.field_x;
                        break L25;
                      } else {
                        tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                        var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                        var3++;
                        break L25;
                      }
                    }
                    var3++;
                    var3++;
                    break L0;
                  } else {
                    if (var4 != bk.field_c.field_d) {
                      L26: {
                        var5 = Transmogrify.field_D;
                        var6 = qb.field_f[var3];
                        if (-3 != (q.field_a ^ -1)) {
                          break L26;
                        } else {
                          if ((var2 ^ -1) != -2) {
                            break L26;
                          } else {
                            L27: {
                              if (ng.field_i.length > bd.field_p.length) {
                                stackOut_192_0 = ng.field_i.length;
                                stackIn_193_0 = stackOut_192_0;
                                break L27;
                              } else {
                                stackOut_191_0 = bd.field_p.length;
                                stackIn_193_0 = stackOut_191_0;
                                break L27;
                              }
                            }
                            L28: {
                              var7 = stackIn_193_0;
                              if (th.field_d.length > ne.field_a.length) {
                                stackOut_195_0 = th.field_d.length;
                                stackIn_196_0 = stackOut_195_0;
                                break L28;
                              } else {
                                stackOut_194_0 = ne.field_a.length;
                                stackIn_196_0 = stackOut_194_0;
                                break L28;
                              }
                            }
                            L29: {
                              var8 = stackIn_196_0;
                              if (-7 < (var3 ^ -1)) {
                                break L29;
                              } else {
                                if (6 - -var7 <= var3) {
                                  break L29;
                                } else {
                                  L30: {
                                    if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                      stackOut_200_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                      stackIn_201_0 = stackOut_200_0;
                                      break L30;
                                    } else {
                                      stackOut_199_0 = "";
                                      stackIn_201_0 = stackOut_199_0;
                                      break L30;
                                    }
                                  }
                                  var6_ref = stackIn_201_0;
                                  break L29;
                                }
                              }
                            }
                            if (var3 < 7 + var7) {
                              break L26;
                            } else {
                              if (var8 + var7 + 7 <= var3) {
                                break L26;
                              } else {
                                L31: {
                                  if (-var7 + (-7 + var3) < ne.field_a.length) {
                                    stackOut_206_0 = ne.field_a[-var7 + (-7 + var3)];
                                    stackIn_207_0 = stackOut_206_0;
                                    break L31;
                                  } else {
                                    stackOut_205_0 = "";
                                    stackIn_207_0 = stackOut_205_0;
                                    break L31;
                                  }
                                }
                                var6_ref = stackIn_207_0;
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      L32: {
                        if (1 == var4) {
                          var6_ref = Integer.toString(var2);
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      L33: {
                        stackOut_211_0 = (String) var6_ref;
                        stackOut_211_1 = 0;
                        stackIn_213_0 = stackOut_211_0;
                        stackIn_213_1 = stackOut_211_1;
                        stackIn_212_0 = stackOut_211_0;
                        stackIn_212_1 = stackOut_211_1;
                        if (-1 > var4) {
                          stackOut_213_0 = (String) (Object) stackIn_213_0;
                          stackOut_213_1 = stackIn_213_1;
                          stackOut_213_2 = 0;
                          stackIn_214_0 = stackOut_213_0;
                          stackIn_214_1 = stackOut_213_1;
                          stackIn_214_2 = stackOut_213_2;
                          break L33;
                        } else {
                          stackOut_212_0 = (String) (Object) stackIn_212_0;
                          stackOut_212_1 = stackIn_212_1;
                          stackOut_212_2 = 1;
                          stackIn_214_0 = stackOut_212_0;
                          stackIn_214_1 = stackOut_212_1;
                          stackIn_214_2 = stackOut_212_2;
                          break L33;
                        }
                      }
                      L34: {
                        var7 = uc.a(stackIn_214_0, stackIn_214_1 != 0, stackIn_214_2 != 0);
                        var8 = wd.field_j - (var7 >> -1429395903);
                        if (-1 >= (var4 ^ -1)) {
                          L35: {
                            if (var4 != bk.field_c.field_d) {
                              stackOut_218_0 = gl.field_B;
                              stackIn_219_0 = stackOut_218_0;
                              break L35;
                            } else {
                              stackOut_217_0 = cd.field_f;
                              stackIn_219_0 = stackOut_217_0;
                              break L35;
                            }
                          }
                          L36: {
                            var9 = stackIn_219_0;
                            var1 = var1 + ee.field_D;
                            if (var9 == null) {
                              break L36;
                            } else {
                              var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                              break L36;
                            }
                          }
                          var1 = var1 + jl.field_o;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      L37: {
                        if (var4 < 0) {
                          ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                          var1 = var1 + fi.field_x;
                          break L37;
                        } else {
                          tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                          var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                          var3++;
                          break L37;
                        }
                      }
                      var3++;
                      var3++;
                      var3 = 0;
                      L38: while (true) {
                        if (qb.field_f.length <= var3) {
                          return;
                        } else {
                          L39: {
                            var4 = ce.field_a[var3];
                            if ((var4 ^ -1) > -1) {
                              var5 = u.field_b;
                              break L39;
                            } else {
                              if (var4 != bk.field_c.field_d) {
                                var5 = Transmogrify.field_D;
                                break L39;
                              } else {
                                var5 = pf.field_b;
                                break L39;
                              }
                            }
                          }
                          L40: {
                            var6 = qb.field_f[var3];
                            if (-3 != (q.field_a ^ -1)) {
                              break L40;
                            } else {
                              if ((var2 ^ -1) != -2) {
                                break L40;
                              } else {
                                L41: {
                                  if (ng.field_i.length > bd.field_p.length) {
                                    stackOut_237_0 = ng.field_i.length;
                                    stackIn_238_0 = stackOut_237_0;
                                    break L41;
                                  } else {
                                    stackOut_236_0 = bd.field_p.length;
                                    stackIn_238_0 = stackOut_236_0;
                                    break L41;
                                  }
                                }
                                L42: {
                                  var7 = stackIn_238_0;
                                  if (th.field_d.length > ne.field_a.length) {
                                    stackOut_240_0 = th.field_d.length;
                                    stackIn_241_0 = stackOut_240_0;
                                    break L42;
                                  } else {
                                    stackOut_239_0 = ne.field_a.length;
                                    stackIn_241_0 = stackOut_239_0;
                                    break L42;
                                  }
                                }
                                L43: {
                                  var8 = stackIn_241_0;
                                  if (-7 < (var3 ^ -1)) {
                                    break L43;
                                  } else {
                                    if (6 - -var7 <= var3) {
                                      break L43;
                                    } else {
                                      L44: {
                                        if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                          stackOut_245_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                          stackIn_246_0 = stackOut_245_0;
                                          break L44;
                                        } else {
                                          stackOut_244_0 = "";
                                          stackIn_246_0 = stackOut_244_0;
                                          break L44;
                                        }
                                      }
                                      var6_ref = stackIn_246_0;
                                      break L43;
                                    }
                                  }
                                }
                                if (var3 < 7 + var7) {
                                  break L40;
                                } else {
                                  if (var8 + var7 + 7 <= var3) {
                                    break L40;
                                  } else {
                                    L45: {
                                      if (-var7 + (-7 + var3) < ne.field_a.length) {
                                        stackOut_251_0 = ne.field_a[-var7 + (-7 + var3)];
                                        stackIn_252_0 = stackOut_251_0;
                                        break L45;
                                      } else {
                                        stackOut_250_0 = "";
                                        stackIn_252_0 = stackOut_250_0;
                                        break L45;
                                      }
                                    }
                                    var6_ref = stackIn_252_0;
                                    break L40;
                                  }
                                }
                              }
                            }
                          }
                          L46: {
                            if (1 == var4) {
                              var6_ref = Integer.toString(var2);
                              break L46;
                            } else {
                              break L46;
                            }
                          }
                          L47: {
                            stackOut_256_0 = (String) var6_ref;
                            stackOut_256_1 = 0;
                            stackIn_258_0 = stackOut_256_0;
                            stackIn_258_1 = stackOut_256_1;
                            stackIn_257_0 = stackOut_256_0;
                            stackIn_257_1 = stackOut_256_1;
                            if (-1 > var4) {
                              stackOut_258_0 = (String) (Object) stackIn_258_0;
                              stackOut_258_1 = stackIn_258_1;
                              stackOut_258_2 = 0;
                              stackIn_259_0 = stackOut_258_0;
                              stackIn_259_1 = stackOut_258_1;
                              stackIn_259_2 = stackOut_258_2;
                              break L47;
                            } else {
                              stackOut_257_0 = (String) (Object) stackIn_257_0;
                              stackOut_257_1 = stackIn_257_1;
                              stackOut_257_2 = 1;
                              stackIn_259_0 = stackOut_257_0;
                              stackIn_259_1 = stackOut_257_1;
                              stackIn_259_2 = stackOut_257_2;
                              break L47;
                            }
                          }
                          L48: {
                            var7 = uc.a(stackIn_259_0, stackIn_259_1 != 0, stackIn_259_2 != 0);
                            var8 = wd.field_j - (var7 >> -1429395903);
                            if (-1 >= (var4 ^ -1)) {
                              L49: {
                                if (var4 != bk.field_c.field_d) {
                                  stackOut_263_0 = gl.field_B;
                                  stackIn_264_0 = stackOut_263_0;
                                  break L49;
                                } else {
                                  stackOut_262_0 = cd.field_f;
                                  stackIn_264_0 = stackOut_262_0;
                                  break L49;
                                }
                              }
                              L50: {
                                var9 = stackIn_264_0;
                                var1 = var1 + ee.field_D;
                                if (var9 == null) {
                                  break L50;
                                } else {
                                  var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                                  break L50;
                                }
                              }
                              var1 = var1 + jl.field_o;
                              break L48;
                            } else {
                              break L48;
                            }
                          }
                          if (var4 < 0) {
                            ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                            var1 = var1 + fi.field_x;
                            var3++;
                            continue L38;
                          } else {
                            tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                            var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                            var3++;
                            continue L38;
                          }
                        }
                      }
                    } else {
                      L51: {
                        var5 = pf.field_b;
                        var6 = qb.field_f[var3];
                        if (-3 != q.field_a) {
                          break L51;
                        } else {
                          if ((var2 ^ -1) != -2) {
                            break L51;
                          } else {
                            L52: {
                              if (ng.field_i.length > bd.field_p.length) {
                                stackOut_108_0 = ng.field_i.length;
                                stackIn_109_0 = stackOut_108_0;
                                break L52;
                              } else {
                                stackOut_107_0 = bd.field_p.length;
                                stackIn_109_0 = stackOut_107_0;
                                break L52;
                              }
                            }
                            L53: {
                              var7 = stackIn_109_0;
                              if (th.field_d.length > ne.field_a.length) {
                                stackOut_111_0 = th.field_d.length;
                                stackIn_112_0 = stackOut_111_0;
                                break L53;
                              } else {
                                stackOut_110_0 = ne.field_a.length;
                                stackIn_112_0 = stackOut_110_0;
                                break L53;
                              }
                            }
                            L54: {
                              var8 = stackIn_112_0;
                              if (-7 < (var3 ^ -1)) {
                                break L54;
                              } else {
                                if (6 - -var7 <= var3) {
                                  break L54;
                                } else {
                                  L55: {
                                    if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                      stackOut_116_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                      stackIn_117_0 = stackOut_116_0;
                                      break L55;
                                    } else {
                                      stackOut_115_0 = "";
                                      stackIn_117_0 = stackOut_115_0;
                                      break L55;
                                    }
                                  }
                                  var6_ref = stackIn_117_0;
                                  break L54;
                                }
                              }
                            }
                            if (var3 < 7 + var7) {
                              break L51;
                            } else {
                              if (var8 + var7 + 7 <= var3) {
                                break L51;
                              } else {
                                L56: {
                                  if (-var7 + (-7 + var3) < ne.field_a.length) {
                                    stackOut_122_0 = ne.field_a[-var7 + (-7 + var3)];
                                    stackIn_123_0 = stackOut_122_0;
                                    break L56;
                                  } else {
                                    stackOut_121_0 = "";
                                    stackIn_123_0 = stackOut_121_0;
                                    break L56;
                                  }
                                }
                                var6_ref = stackIn_123_0;
                                break L51;
                              }
                            }
                          }
                        }
                      }
                      L57: {
                        if (1 == var4) {
                          var6_ref = Integer.toString(var2);
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      L58: {
                        stackOut_127_0 = (String) var6_ref;
                        stackOut_127_1 = 0;
                        stackIn_129_0 = stackOut_127_0;
                        stackIn_129_1 = stackOut_127_1;
                        stackIn_128_0 = stackOut_127_0;
                        stackIn_128_1 = stackOut_127_1;
                        if (-1 > var4) {
                          stackOut_129_0 = (String) (Object) stackIn_129_0;
                          stackOut_129_1 = stackIn_129_1;
                          stackOut_129_2 = 0;
                          stackIn_130_0 = stackOut_129_0;
                          stackIn_130_1 = stackOut_129_1;
                          stackIn_130_2 = stackOut_129_2;
                          break L58;
                        } else {
                          stackOut_128_0 = (String) (Object) stackIn_128_0;
                          stackOut_128_1 = stackIn_128_1;
                          stackOut_128_2 = 1;
                          stackIn_130_0 = stackOut_128_0;
                          stackIn_130_1 = stackOut_128_1;
                          stackIn_130_2 = stackOut_128_2;
                          break L58;
                        }
                      }
                      L59: {
                        var7 = uc.a(stackIn_130_0, stackIn_130_1 != 0, stackIn_130_2 != 0);
                        var8 = wd.field_j - (var7 >> -1429395903);
                        if (-1 >= (var4 ^ -1)) {
                          L60: {
                            if (var4 != bk.field_c.field_d) {
                              stackOut_134_0 = gl.field_B;
                              stackIn_135_0 = stackOut_134_0;
                              break L60;
                            } else {
                              stackOut_133_0 = cd.field_f;
                              stackIn_135_0 = stackOut_133_0;
                              break L60;
                            }
                          }
                          L61: {
                            var9 = stackIn_135_0;
                            var1 = var1 + ee.field_D;
                            if (var9 == null) {
                              break L61;
                            } else {
                              var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                              break L61;
                            }
                          }
                          var1 = var1 + jl.field_o;
                          break L59;
                        } else {
                          break L59;
                        }
                      }
                      L62: {
                        if (var4 < 0) {
                          ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                          var1 = var1 + fi.field_x;
                          break L62;
                        } else {
                          tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                          var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                          var3++;
                          break L62;
                        }
                      }
                      var3++;
                      var3++;
                      var3 = 0;
                      L63: while (true) {
                        if (qb.field_f.length <= var3) {
                          return;
                        } else {
                          L64: {
                            var4 = ce.field_a[var3];
                            if ((var4 ^ -1) > -1) {
                              var5 = u.field_b;
                              break L64;
                            } else {
                              if (var4 != bk.field_c.field_d) {
                                var5 = Transmogrify.field_D;
                                break L64;
                              } else {
                                var5 = pf.field_b;
                                break L64;
                              }
                            }
                          }
                          L65: {
                            var6 = qb.field_f[var3];
                            if (-3 != (q.field_a ^ -1)) {
                              break L65;
                            } else {
                              if ((var2 ^ -1) != -2) {
                                break L65;
                              } else {
                                L66: {
                                  if (ng.field_i.length > bd.field_p.length) {
                                    stackOut_153_0 = ng.field_i.length;
                                    stackIn_154_0 = stackOut_153_0;
                                    break L66;
                                  } else {
                                    stackOut_152_0 = bd.field_p.length;
                                    stackIn_154_0 = stackOut_152_0;
                                    break L66;
                                  }
                                }
                                L67: {
                                  var7 = stackIn_154_0;
                                  if (th.field_d.length > ne.field_a.length) {
                                    stackOut_156_0 = th.field_d.length;
                                    stackIn_157_0 = stackOut_156_0;
                                    break L67;
                                  } else {
                                    stackOut_155_0 = ne.field_a.length;
                                    stackIn_157_0 = stackOut_155_0;
                                    break L67;
                                  }
                                }
                                L68: {
                                  var8 = stackIn_157_0;
                                  if (-7 < (var3 ^ -1)) {
                                    break L68;
                                  } else {
                                    if (6 - -var7 <= var3) {
                                      break L68;
                                    } else {
                                      L69: {
                                        if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                          stackOut_161_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                          stackIn_162_0 = stackOut_161_0;
                                          break L69;
                                        } else {
                                          stackOut_160_0 = "";
                                          stackIn_162_0 = stackOut_160_0;
                                          break L69;
                                        }
                                      }
                                      var6_ref = stackIn_162_0;
                                      break L68;
                                    }
                                  }
                                }
                                if (var3 < 7 + var7) {
                                  break L65;
                                } else {
                                  if (var8 + var7 + 7 <= var3) {
                                    break L65;
                                  } else {
                                    L70: {
                                      if (-var7 + (-7 + var3) < ne.field_a.length) {
                                        stackOut_167_0 = ne.field_a[-var7 + (-7 + var3)];
                                        stackIn_168_0 = stackOut_167_0;
                                        break L70;
                                      } else {
                                        stackOut_166_0 = "";
                                        stackIn_168_0 = stackOut_166_0;
                                        break L70;
                                      }
                                    }
                                    var6_ref = stackIn_168_0;
                                    break L65;
                                  }
                                }
                              }
                            }
                          }
                          L71: {
                            if (1 == var4) {
                              var6_ref = Integer.toString(var2);
                              break L71;
                            } else {
                              break L71;
                            }
                          }
                          L72: {
                            stackOut_172_0 = (String) var6_ref;
                            stackOut_172_1 = 0;
                            stackIn_174_0 = stackOut_172_0;
                            stackIn_174_1 = stackOut_172_1;
                            stackIn_173_0 = stackOut_172_0;
                            stackIn_173_1 = stackOut_172_1;
                            if (-1 > var4) {
                              stackOut_174_0 = (String) (Object) stackIn_174_0;
                              stackOut_174_1 = stackIn_174_1;
                              stackOut_174_2 = 0;
                              stackIn_175_0 = stackOut_174_0;
                              stackIn_175_1 = stackOut_174_1;
                              stackIn_175_2 = stackOut_174_2;
                              break L72;
                            } else {
                              stackOut_173_0 = (String) (Object) stackIn_173_0;
                              stackOut_173_1 = stackIn_173_1;
                              stackOut_173_2 = 1;
                              stackIn_175_0 = stackOut_173_0;
                              stackIn_175_1 = stackOut_173_1;
                              stackIn_175_2 = stackOut_173_2;
                              break L72;
                            }
                          }
                          L73: {
                            var7 = uc.a(stackIn_175_0, stackIn_175_1 != 0, stackIn_175_2 != 0);
                            var8 = wd.field_j - (var7 >> -1429395903);
                            if (-1 >= (var4 ^ -1)) {
                              L74: {
                                if (var4 != bk.field_c.field_d) {
                                  stackOut_179_0 = gl.field_B;
                                  stackIn_180_0 = stackOut_179_0;
                                  break L74;
                                } else {
                                  stackOut_178_0 = cd.field_f;
                                  stackIn_180_0 = stackOut_178_0;
                                  break L74;
                                }
                              }
                              L75: {
                                var9 = stackIn_180_0;
                                var1 = var1 + ee.field_D;
                                if (var9 == null) {
                                  break L75;
                                } else {
                                  var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                                  break L75;
                                }
                              }
                              var1 = var1 + jl.field_o;
                              break L73;
                            } else {
                              break L73;
                            }
                          }
                          if (var4 < 0) {
                            ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                            var1 = var1 + fi.field_x;
                            var3++;
                            continue L63;
                          } else {
                            tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                            var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                            var3++;
                            continue L63;
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
            L76: while (true) {
              if (qb.field_f.length <= var3) {
                return;
              } else {
                L77: {
                  var4 = ce.field_a[var3];
                  if ((var4 ^ -1) > -1) {
                    var5 = u.field_b;
                    break L77;
                  } else {
                    if (var4 != bk.field_c.field_d) {
                      var5 = Transmogrify.field_D;
                      break L77;
                    } else {
                      var5 = pf.field_b;
                      break L77;
                    }
                  }
                }
                L78: {
                  var6 = qb.field_f[var3];
                  if (-3 != (q.field_a ^ -1)) {
                    break L78;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L78;
                    } else {
                      L79: {
                        if (ng.field_i.length > bd.field_p.length) {
                          stackOut_371_0 = ng.field_i.length;
                          stackIn_372_0 = stackOut_371_0;
                          break L79;
                        } else {
                          stackOut_370_0 = bd.field_p.length;
                          stackIn_372_0 = stackOut_370_0;
                          break L79;
                        }
                      }
                      L80: {
                        var7 = stackIn_372_0;
                        if (th.field_d.length > ne.field_a.length) {
                          stackOut_374_0 = th.field_d.length;
                          stackIn_375_0 = stackOut_374_0;
                          break L80;
                        } else {
                          stackOut_373_0 = ne.field_a.length;
                          stackIn_375_0 = stackOut_373_0;
                          break L80;
                        }
                      }
                      L81: {
                        var8 = stackIn_375_0;
                        if (-7 < (var3 ^ -1)) {
                          break L81;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L81;
                          } else {
                            L82: {
                              if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                stackOut_379_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                stackIn_380_0 = stackOut_379_0;
                                break L82;
                              } else {
                                stackOut_378_0 = "";
                                stackIn_380_0 = stackOut_378_0;
                                break L82;
                              }
                            }
                            var6_ref = stackIn_380_0;
                            break L81;
                          }
                        }
                      }
                      if (var3 < 7 + var7) {
                        break L78;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L78;
                        } else {
                          L83: {
                            if (-var7 + (-7 + var3) < ne.field_a.length) {
                              stackOut_385_0 = ne.field_a[-var7 + (-7 + var3)];
                              stackIn_386_0 = stackOut_385_0;
                              break L83;
                            } else {
                              stackOut_384_0 = "";
                              stackIn_386_0 = stackOut_384_0;
                              break L83;
                            }
                          }
                          var6_ref = stackIn_386_0;
                          break L78;
                        }
                      }
                    }
                  }
                }
                L84: {
                  if (1 == var4) {
                    var6_ref = Integer.toString(var2);
                    break L84;
                  } else {
                    break L84;
                  }
                }
                L85: {
                  stackOut_390_0 = (String) var6_ref;
                  stackOut_390_1 = 0;
                  stackIn_392_0 = stackOut_390_0;
                  stackIn_392_1 = stackOut_390_1;
                  stackIn_391_0 = stackOut_390_0;
                  stackIn_391_1 = stackOut_390_1;
                  if (-1 > var4) {
                    stackOut_392_0 = (String) (Object) stackIn_392_0;
                    stackOut_392_1 = stackIn_392_1;
                    stackOut_392_2 = 0;
                    stackIn_393_0 = stackOut_392_0;
                    stackIn_393_1 = stackOut_392_1;
                    stackIn_393_2 = stackOut_392_2;
                    break L85;
                  } else {
                    stackOut_391_0 = (String) (Object) stackIn_391_0;
                    stackOut_391_1 = stackIn_391_1;
                    stackOut_391_2 = 1;
                    stackIn_393_0 = stackOut_391_0;
                    stackIn_393_1 = stackOut_391_1;
                    stackIn_393_2 = stackOut_391_2;
                    break L85;
                  }
                }
                L86: {
                  var7 = uc.a(stackIn_393_0, stackIn_393_1 != 0, stackIn_393_2 != 0);
                  var8 = wd.field_j - (var7 >> -1429395903);
                  if (-1 >= (var4 ^ -1)) {
                    L87: {
                      if (var4 != bk.field_c.field_d) {
                        stackOut_397_0 = gl.field_B;
                        stackIn_398_0 = stackOut_397_0;
                        break L87;
                      } else {
                        stackOut_396_0 = cd.field_f;
                        stackIn_398_0 = stackOut_396_0;
                        break L87;
                      }
                    }
                    L88: {
                      var9 = stackIn_398_0;
                      var1 = var1 + ee.field_D;
                      if (var9 == null) {
                        break L88;
                      } else {
                        var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                        break L88;
                      }
                    }
                    var1 = var1 + jl.field_o;
                    break L86;
                  } else {
                    break L86;
                  }
                }
                if (var4 < 0) {
                  ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                  var1 = var1 + fi.field_x;
                  var3++;
                  continue L76;
                } else {
                  tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                  var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                  var3++;
                  continue L76;
                }
              }
            }
          } else {
            L89: {
              if (param0 == 8) {
                break L89;
              } else {
                kh[] discarded$4 = hd.b((byte) 70);
                break L89;
              }
            }
            L90: {
              var3 = 0;
              if (qb.field_f.length <= var3) {
                break L90;
              } else {
                L91: {
                  var4 = ce.field_a[var3];
                  if ((var4 ^ -1) > -1) {
                    var5 = u.field_b;
                    break L91;
                  } else {
                    if (var4 != bk.field_c.field_d) {
                      var5 = Transmogrify.field_D;
                      break L91;
                    } else {
                      var5 = pf.field_b;
                      break L91;
                    }
                  }
                }
                L92: {
                  var6 = qb.field_f[var3];
                  if (-3 != (q.field_a ^ -1)) {
                    break L92;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      break L92;
                    } else {
                      L93: {
                        if (ng.field_i.length > bd.field_p.length) {
                          stackOut_62_0 = ng.field_i.length;
                          stackIn_63_0 = stackOut_62_0;
                          break L93;
                        } else {
                          stackOut_61_0 = bd.field_p.length;
                          stackIn_63_0 = stackOut_61_0;
                          break L93;
                        }
                      }
                      L94: {
                        var7 = stackIn_63_0;
                        if (th.field_d.length > ne.field_a.length) {
                          stackOut_65_0 = th.field_d.length;
                          stackIn_66_0 = stackOut_65_0;
                          break L94;
                        } else {
                          stackOut_64_0 = ne.field_a.length;
                          stackIn_66_0 = stackOut_64_0;
                          break L94;
                        }
                      }
                      L95: {
                        var8 = stackIn_66_0;
                        if (-7 < (var3 ^ -1)) {
                          break L95;
                        } else {
                          if (6 - -var7 <= var3) {
                            break L95;
                          } else {
                            L96: {
                              if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                                stackOut_70_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                                stackIn_71_0 = stackOut_70_0;
                                break L96;
                              } else {
                                stackOut_69_0 = "";
                                stackIn_71_0 = stackOut_69_0;
                                break L96;
                              }
                            }
                            var6_ref = stackIn_71_0;
                            break L95;
                          }
                        }
                      }
                      if (var3 < 7 + var7) {
                        break L92;
                      } else {
                        if (var8 + var7 + 7 <= var3) {
                          break L92;
                        } else {
                          L97: {
                            if (-var7 + (-7 + var3) < ne.field_a.length) {
                              stackOut_76_0 = ne.field_a[-var7 + (-7 + var3)];
                              stackIn_77_0 = stackOut_76_0;
                              break L97;
                            } else {
                              stackOut_75_0 = "";
                              stackIn_77_0 = stackOut_75_0;
                              break L97;
                            }
                          }
                          var6_ref = stackIn_77_0;
                          break L92;
                        }
                      }
                    }
                  }
                }
                L98: {
                  if (1 == var4) {
                    var6_ref = Integer.toString(var2);
                    break L98;
                  } else {
                    break L98;
                  }
                }
                L99: {
                  stackOut_81_0 = (String) var6_ref;
                  stackOut_81_1 = 0;
                  stackIn_83_0 = stackOut_81_0;
                  stackIn_83_1 = stackOut_81_1;
                  stackIn_82_0 = stackOut_81_0;
                  stackIn_82_1 = stackOut_81_1;
                  if (-1 > var4) {
                    stackOut_83_0 = (String) (Object) stackIn_83_0;
                    stackOut_83_1 = stackIn_83_1;
                    stackOut_83_2 = 0;
                    stackIn_84_0 = stackOut_83_0;
                    stackIn_84_1 = stackOut_83_1;
                    stackIn_84_2 = stackOut_83_2;
                    break L99;
                  } else {
                    stackOut_82_0 = (String) (Object) stackIn_82_0;
                    stackOut_82_1 = stackIn_82_1;
                    stackOut_82_2 = 1;
                    stackIn_84_0 = stackOut_82_0;
                    stackIn_84_1 = stackOut_82_1;
                    stackIn_84_2 = stackOut_82_2;
                    break L99;
                  }
                }
                L100: {
                  var7 = uc.a(stackIn_84_0, stackIn_84_1 != 0, stackIn_84_2 != 0);
                  var8 = wd.field_j - (var7 >> -1429395903);
                  if (-1 >= (var4 ^ -1)) {
                    L101: {
                      if (var4 != bk.field_c.field_d) {
                        stackOut_88_0 = gl.field_B;
                        stackIn_89_0 = stackOut_88_0;
                        break L101;
                      } else {
                        stackOut_87_0 = cd.field_f;
                        stackIn_89_0 = stackOut_87_0;
                        break L101;
                      }
                    }
                    L102: {
                      var9 = stackIn_89_0;
                      var1 = var1 + ee.field_D;
                      if (var9 == null) {
                        break L102;
                      } else {
                        var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                        break L102;
                      }
                    }
                    var1 = var1 + jl.field_o;
                    break L100;
                  } else {
                    break L100;
                  }
                }
                L103: {
                  if (var4 < 0) {
                    ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                    var1 = var1 + fi.field_x;
                    break L103;
                  } else {
                    tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                    var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                    var3++;
                    break L103;
                  }
                }
                var3++;
                var3++;
                var3++;
                break L90;
              }
            }
            return;
          }
        } else {
          L104: {
            if (param0 == 8) {
              break L104;
            } else {
              kh[] discarded$5 = hd.b((byte) 70);
              break L104;
            }
          }
          L105: {
            var3 = 0;
            if (qb.field_f.length <= var3) {
              break L105;
            } else {
              L106: {
                var4 = ce.field_a[var3];
                if ((var4 ^ -1) > -1) {
                  var5 = u.field_b;
                  break L106;
                } else {
                  if (var4 != bk.field_c.field_d) {
                    var5 = Transmogrify.field_D;
                    break L106;
                  } else {
                    var5 = pf.field_b;
                    break L106;
                  }
                }
              }
              L107: {
                var6 = qb.field_f[var3];
                if (-3 != (q.field_a ^ -1)) {
                  break L107;
                } else {
                  if ((var2 ^ -1) != -2) {
                    break L107;
                  } else {
                    L108: {
                      if (ng.field_i.length > bd.field_p.length) {
                        stackOut_13_0 = ng.field_i.length;
                        stackIn_14_0 = stackOut_13_0;
                        break L108;
                      } else {
                        stackOut_12_0 = bd.field_p.length;
                        stackIn_14_0 = stackOut_12_0;
                        break L108;
                      }
                    }
                    L109: {
                      var7 = stackIn_14_0;
                      if (th.field_d.length > ne.field_a.length) {
                        stackOut_16_0 = th.field_d.length;
                        stackIn_17_0 = stackOut_16_0;
                        break L109;
                      } else {
                        stackOut_15_0 = ne.field_a.length;
                        stackIn_17_0 = stackOut_15_0;
                        break L109;
                      }
                    }
                    L110: {
                      var8 = stackIn_17_0;
                      if (-7 < (var3 ^ -1)) {
                        break L110;
                      } else {
                        if (6 - -var7 <= var3) {
                          break L110;
                        } else {
                          L111: {
                            if (bd.field_p.length + (var3 + -6) - var7 >= 0) {
                              stackOut_21_0 = bd.field_p[-var7 + (var3 - (6 + -bd.field_p.length))];
                              stackIn_22_0 = stackOut_21_0;
                              break L111;
                            } else {
                              stackOut_20_0 = "";
                              stackIn_22_0 = stackOut_20_0;
                              break L111;
                            }
                          }
                          var6_ref = stackIn_22_0;
                          break L110;
                        }
                      }
                    }
                    if (var3 < 7 + var7) {
                      break L107;
                    } else {
                      if (var8 + var7 + 7 <= var3) {
                        break L107;
                      } else {
                        L112: {
                          if (-var7 + (-7 + var3) < ne.field_a.length) {
                            stackOut_27_0 = ne.field_a[-var7 + (-7 + var3)];
                            stackIn_28_0 = stackOut_27_0;
                            break L112;
                          } else {
                            stackOut_26_0 = "";
                            stackIn_28_0 = stackOut_26_0;
                            break L112;
                          }
                        }
                        var6_ref = stackIn_28_0;
                        break L107;
                      }
                    }
                  }
                }
              }
              L113: {
                if (1 == var4) {
                  var6_ref = Integer.toString(var2);
                  break L113;
                } else {
                  break L113;
                }
              }
              L114: {
                stackOut_32_0 = (String) var6_ref;
                stackOut_32_1 = 0;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                if (-1 > var4) {
                  stackOut_34_0 = (String) (Object) stackIn_34_0;
                  stackOut_34_1 = stackIn_34_1;
                  stackOut_34_2 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  break L114;
                } else {
                  stackOut_33_0 = (String) (Object) stackIn_33_0;
                  stackOut_33_1 = stackIn_33_1;
                  stackOut_33_2 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  break L114;
                }
              }
              L115: {
                var7 = uc.a(stackIn_35_0, stackIn_35_1 != 0, stackIn_35_2 != 0);
                var8 = wd.field_j - (var7 >> -1429395903);
                if (-1 >= (var4 ^ -1)) {
                  L116: {
                    if (var4 != bk.field_c.field_d) {
                      stackOut_39_0 = gl.field_B;
                      stackIn_40_0 = stackOut_39_0;
                      break L116;
                    } else {
                      stackOut_38_0 = cd.field_f;
                      stackIn_40_0 = stackOut_38_0;
                      break L116;
                    }
                  }
                  L117: {
                    var9 = stackIn_40_0;
                    var1 = var1 + ee.field_D;
                    if (var9 == null) {
                      break L117;
                    } else {
                      var9.a(var7 - -(vh.field_m << 1577700897), var1, -vh.field_m + var8, (byte) -52, hi.field_c - -(jl.field_o << -26199295));
                      break L117;
                    }
                  }
                  var1 = var1 + jl.field_o;
                  break L115;
                } else {
                  break L115;
                }
              }
              L118: {
                if (var4 < 0) {
                  ce.field_b.b(var6_ref, var8, var1 - -field_d, var5, -1);
                  var1 = var1 + fi.field_x;
                  break L118;
                } else {
                  tb.field_c.b(var6_ref, var8, var1 + pi.field_k, var5, -1);
                  var1 = var1 + (hi.field_c + (ee.field_D + jl.field_o));
                  var3++;
                  break L118;
                }
              }
              var3++;
              var3++;
              var3++;
              break L105;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = false;
    }
}
