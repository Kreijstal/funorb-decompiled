/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements Runnable {
    static ml field_j;
    static String field_g;
    static String field_e;
    static int[][] field_h;
    static int field_l;
    static String field_d;
    private ra field_i;
    static String field_a;
    private boolean field_b;
    int field_f;
    static int[] field_c;
    private Thread field_k;

    private final void a(byte param0, df param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = this.field_i;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_i.a((byte) 47, param1);
                  if (param0 < -52) {
                    break L2;
                  } else {
                    field_g = (String) null;
                    break L2;
                  }
                }
                this.field_f = this.field_f + 1;
                this.field_i.notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3_ref);
            stackOut_8_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final df a(int param0, int param1, rc param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        df var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        df stackIn_9_0 = null;
        df stackIn_17_0 = null;
        df stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        df stackOut_8_0 = null;
        df stackOut_18_0 = null;
        df stackOut_16_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = SteelSentinels.field_G;
        try {
          L0: {
            var4 = new df();
            var4.field_H = 1;
            var5 = this.field_i;
            synchronized (var5) {
              L1: {
                var6 = (df) ((Object) this.field_i.b(22));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((var6.field_w ^ -1L) != ((long)param1 ^ -1L)) {
                        break L3;
                      } else {
                        if (var6.field_G != param2) {
                          break L3;
                        } else {
                          if (var6.field_H == 2) {
                            var4.field_z = false;
                            var4.field_L = var6.field_L;
                            stackOut_8_0 = (df) (var4);
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var6 = (df) ((Object) this.field_i.a(false));
                    continue L2;
                  }
                }
              }
            }
            var4.field_L = param2.b(param1, false);
            if (param0 == 21598) {
              var4.field_B = true;
              var4.field_z = false;
              stackOut_18_0 = (df) (var4);
              stackIn_19_0 = stackOut_18_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_16_0 = (df) null;
              stackIn_17_0 = stackOut_16_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4_ref);
            stackOut_20_1 = new StringBuilder().append("cb.A(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_19_0;
        }
    }

    final void a(int param0) {
        try {
            this.field_b = true;
            synchronized (this.field_i) {
                this.field_i.notifyAll();
            }
            if (param0 != 0) {
                field_j = (ml) null;
            }
            try {
                this.field_k.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_k = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(hk param0, byte param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        qh[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        qh var17 = null;
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
        qh var28 = null;
        qh var29 = null;
        qh[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        qh stackIn_34_0 = null;
        qh stackIn_35_0 = null;
        qh stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        qh stackIn_41_0 = null;
        qh stackIn_42_0 = null;
        qh stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_73_0 = 0;
        qh stackIn_88_0 = null;
        qh stackIn_89_0 = null;
        qh stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        qh stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        qh stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        qh stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        int stackIn_97_2 = 0;
        qh stackIn_99_0 = null;
        qh stackIn_100_0 = null;
        qh stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        qh stackIn_103_0 = null;
        qh stackIn_104_0 = null;
        qh stackIn_105_0 = null;
        qh stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        qh stackIn_123_0 = null;
        qh stackIn_124_0 = null;
        qh stackIn_125_0 = null;
        int stackIn_125_1 = 0;
        qh stackIn_127_0 = null;
        qh stackIn_128_0 = null;
        qh stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        qh stackIn_131_0 = null;
        qh stackIn_132_0 = null;
        qh stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        qh stackIn_135_0 = null;
        qh stackIn_136_0 = null;
        qh stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        String stackIn_151_0 = null;
        qh stackIn_154_0 = null;
        qh stackIn_155_0 = null;
        qh stackIn_156_0 = null;
        int stackIn_156_1 = 0;
        qh stackIn_157_0 = null;
        qh stackIn_158_0 = null;
        qh stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_203_0 = 0;
        int stackIn_225_0 = 0;
        qh stackIn_321_0 = null;
        qh stackIn_322_0 = null;
        qh stackIn_323_0 = null;
        qh stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        qh stackIn_329_0 = null;
        boolean stackIn_329_1 = false;
        qh stackIn_330_0 = null;
        boolean stackIn_330_1 = false;
        qh stackIn_331_0 = null;
        boolean stackIn_331_1 = false;
        int stackIn_331_2 = 0;
        qh stackIn_333_0 = null;
        qh stackIn_334_0 = null;
        qh stackIn_335_0 = null;
        int stackIn_335_1 = 0;
        qh stackIn_337_0 = null;
        qh stackIn_338_0 = null;
        qh stackIn_339_0 = null;
        qh stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        RuntimeException stackIn_348_0 = null;
        StringBuilder stackIn_348_1 = null;
        RuntimeException stackIn_349_0 = null;
        StringBuilder stackIn_349_1 = null;
        RuntimeException stackIn_350_0 = null;
        StringBuilder stackIn_350_1 = null;
        String stackIn_350_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        qh stackOut_33_0 = null;
        qh stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        qh stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        qh stackOut_40_0 = null;
        qh stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        qh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        qh stackOut_98_0 = null;
        qh stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        qh stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        qh stackOut_94_0 = null;
        boolean stackOut_94_1 = false;
        qh stackOut_96_0 = null;
        boolean stackOut_96_1 = false;
        int stackOut_96_2 = 0;
        qh stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        int stackOut_95_2 = 0;
        qh stackOut_87_0 = null;
        qh stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        qh stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        qh stackOut_102_0 = null;
        qh stackOut_103_0 = null;
        qh stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        qh stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        String stackOut_150_0 = null;
        Object stackOut_149_0 = null;
        qh stackOut_153_0 = null;
        qh stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        qh stackOut_154_0 = null;
        int stackOut_154_1 = 0;
        qh stackOut_156_0 = null;
        qh stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        qh stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        qh stackOut_332_0 = null;
        qh stackOut_334_0 = null;
        int stackOut_334_1 = 0;
        qh stackOut_333_0 = null;
        int stackOut_333_1 = 0;
        qh stackOut_328_0 = null;
        boolean stackOut_328_1 = false;
        qh stackOut_330_0 = null;
        boolean stackOut_330_1 = false;
        int stackOut_330_2 = 0;
        qh stackOut_329_0 = null;
        boolean stackOut_329_1 = false;
        int stackOut_329_2 = 0;
        qh stackOut_320_0 = null;
        qh stackOut_321_0 = null;
        qh stackOut_322_0 = null;
        int stackOut_322_1 = 0;
        qh stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        qh stackOut_336_0 = null;
        qh stackOut_337_0 = null;
        qh stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        qh stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        qh stackOut_130_0 = null;
        qh stackOut_132_0 = null;
        int stackOut_132_1 = 0;
        qh stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        qh stackOut_126_0 = null;
        qh stackOut_128_0 = null;
        int stackOut_128_1 = 0;
        qh stackOut_127_0 = null;
        int stackOut_127_1 = 0;
        qh stackOut_122_0 = null;
        qh stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        qh stackOut_123_0 = null;
        int stackOut_123_1 = 0;
        qh stackOut_134_0 = null;
        qh stackOut_136_0 = null;
        int stackOut_136_1 = 0;
        qh stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        RuntimeException stackOut_347_0 = null;
        StringBuilder stackOut_347_1 = null;
        RuntimeException stackOut_349_0 = null;
        StringBuilder stackOut_349_1 = null;
        String stackOut_349_2 = null;
        RuntimeException stackOut_348_0 = null;
        StringBuilder stackOut_348_1 = null;
        String stackOut_348_2 = null;
        var26 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param3) {
                L2: {
                  if (ad.field_f) {
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
                  if (kk.a(-28548)) {
                    if (!param0.field_rc) {
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
                  var5 = 0;
                  if (!param3) {
                    var6 = 0;
                    L7: while (true) {
                      if (5 <= var6) {
                        L8: {
                          if (un.field_h[0][2].field_K) {
                            if (kk.a(-28548)) {
                              ll.field_i = da.field_c;
                              break L8;
                            } else {
                              ll.field_i = db.a(fk.field_a, -75, new String[]{nf.field_b.field_Xb});
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        if (jg.field_l.length >= 2) {
                          L9: {
                            if (param3) {
                              if (-1 != qm.field_h) {
                                stackOut_55_0 = 1;
                                stackIn_57_0 = stackOut_55_0;
                                break L9;
                              } else {
                                stackOut_54_0 = 0;
                                stackIn_57_0 = stackOut_54_0;
                                break L9;
                              }
                            } else {
                              stackOut_52_0 = 0;
                              stackIn_57_0 = stackOut_52_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_57_0;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            var7 = qm.field_h;
                            var8_int = 0;
                            L10: while (true) {
                              if (var8_int >= rb.field_i.length) {
                                break L6;
                              } else {
                                rb.field_i[var8_int] = (byte) 0;
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
                            if (-1 == (un.field_h[0][var6 - -1].field_Eb ^ -1)) {
                              break L11;
                            } else {
                              if (var6 != param0.field_Nc) {
                                param0.field_Nc = var6;
                                var5 = 1;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackOut_33_0 = un.field_h[0][var6 - -1];
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_34_0 = stackOut_33_0;
                          if (var4_int == 0) {
                            stackOut_35_0 = (qh) ((Object) stackIn_35_0);
                            stackOut_35_1 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            break L12;
                          } else {
                            stackOut_34_0 = (qh) ((Object) stackIn_34_0);
                            stackOut_34_1 = 1;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_36_0.field_T = stackIn_36_1 != 0;
                          if (rm.field_p) {
                            break L13;
                          } else {
                            if (var6 == 3) {
                              un.field_h[0][var6 - -1].field_T = false;
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackOut_40_0 = un.field_h[0][var6 + 1];
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_41_0 = stackOut_40_0;
                          if (var6 != param0.field_Nc) {
                            stackOut_42_0 = (qh) ((Object) stackIn_42_0);
                            stackOut_42_1 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L14;
                          } else {
                            stackOut_41_0 = (qh) ((Object) stackIn_41_0);
                            stackOut_41_1 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            break L14;
                          }
                        }
                        stackIn_43_0.field_G = stackIn_43_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if (jg.field_l.length >= 2) {
                      L15: {
                        if (param3) {
                          if (-1 != qm.field_h) {
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
                        var7 = qm.field_h;
                        var8_int = 0;
                        L16: while (true) {
                          if (var8_int >= rb.field_i.length) {
                            break L6;
                          } else {
                            rb.field_i[var8_int] = (byte) 0;
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
                rb.field_i[var7 / 8] = (byte)vn.a((int) rb.field_i[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (!param3) {
                  stackOut_64_0 = 0;
                  stackIn_65_0 = stackOut_64_0;
                  break L17;
                } else {
                  stackOut_63_0 = -1;
                  stackIn_65_0 = stackOut_63_0;
                  break L17;
                }
              }
              var7 = stackIn_65_0;
              L18: while (true) {
                if (jg.field_l.length <= var7) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (var7 != qm.field_h) {
                        stackOut_71_0 = 1;
                        stackIn_73_0 = stackOut_71_0;
                        break L19;
                      } else {
                        stackOut_70_0 = 0;
                        stackIn_73_0 = stackOut_70_0;
                        break L19;
                      }
                    } else {
                      stackOut_68_0 = 0;
                      stackIn_73_0 = stackOut_68_0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_73_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (un.field_h[1][var7 - -1].field_Eb != 0) {
                        if (!param3) {
                          var9 = jg.field_l[var7];
                          if (var9 == param0.field_Ub) {
                            break L20;
                          } else {
                            param0.field_Ub = var9;
                            var5 = 1;
                            break L20;
                          }
                        } else {
                          if (var6 == 0) {
                            if ((var7 ^ -1) != 0) {
                              rb.field_i[var7 / 8] = (byte)bi.a((int) rb.field_i[var7 / 8], 1 << ec.a(7, var7));
                              break L20;
                            } else {
                              var9 = 0;
                              L21: while (true) {
                                if (rb.field_i.length <= var9) {
                                  break L20;
                                } else {
                                  rb.field_i[var9] = (byte) 0;
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
                          stackOut_98_0 = un.field_h[1][var7 + 1];
                          stackIn_100_0 = stackOut_98_0;
                          stackIn_99_0 = stackOut_98_0;
                          if ((rb.field_i[var7 / 8] & 1 << (var7 & 7)) == 0) {
                            stackOut_100_0 = (qh) ((Object) stackIn_100_0);
                            stackOut_100_1 = 0;
                            stackIn_101_0 = stackOut_100_0;
                            stackIn_101_1 = stackOut_100_1;
                            break L23;
                          } else {
                            stackOut_99_0 = (qh) ((Object) stackIn_99_0);
                            stackOut_99_1 = 1;
                            stackIn_101_0 = stackOut_99_0;
                            stackIn_101_1 = stackOut_99_1;
                            break L23;
                          }
                        }
                        stackIn_101_0.field_G = stackIn_101_1 != 0;
                        break L22;
                      } else {
                        un.field_h[1][1 + var7].field_G = true;
                        var9 = 0;
                        L24: while (true) {
                          if (jg.field_l.length <= var9) {
                            break L22;
                          } else {
                            L25: {
                              stackOut_94_0 = un.field_h[1][var7 + 1];
                              stackOut_94_1 = un.field_h[1][var7 + 1].field_G;
                              stackIn_96_0 = stackOut_94_0;
                              stackIn_96_1 = stackOut_94_1;
                              stackIn_95_0 = stackOut_94_0;
                              stackIn_95_1 = stackOut_94_1;
                              if ((rb.field_i[var9 / 8] & 1 << (var9 & 7)) != 0) {
                                stackOut_96_0 = (qh) ((Object) stackIn_96_0);
                                stackOut_96_1 = stackIn_96_1;
                                stackOut_96_2 = 0;
                                stackIn_97_0 = stackOut_96_0;
                                stackIn_97_1 = stackOut_96_1;
                                stackIn_97_2 = stackOut_96_2;
                                break L25;
                              } else {
                                stackOut_95_0 = (qh) ((Object) stackIn_95_0);
                                stackOut_95_1 = stackIn_95_1;
                                stackOut_95_2 = 1;
                                stackIn_97_0 = stackOut_95_0;
                                stackIn_97_1 = stackOut_95_1;
                                stackIn_97_2 = stackOut_95_2;
                                break L25;
                              }
                            }
                            stackIn_97_0.field_G = stackIn_97_1 & stackIn_97_2 != 0;
                            var9++;
                            continue L24;
                          }
                        }
                      }
                    } else {
                      L26: {
                        var9 = jg.field_l[var7];
                        stackOut_87_0 = un.field_h[1][1 + var7];
                        stackIn_89_0 = stackOut_87_0;
                        stackIn_88_0 = stackOut_87_0;
                        if (var9 != param0.field_Ub) {
                          stackOut_89_0 = (qh) ((Object) stackIn_89_0);
                          stackOut_89_1 = 0;
                          stackIn_90_0 = stackOut_89_0;
                          stackIn_90_1 = stackOut_89_1;
                          break L26;
                        } else {
                          stackOut_88_0 = (qh) ((Object) stackIn_88_0);
                          stackOut_88_1 = 1;
                          stackIn_90_0 = stackOut_88_0;
                          stackIn_90_1 = stackOut_88_1;
                          break L26;
                        }
                      }
                      stackIn_90_0.field_G = stackIn_90_1 != 0;
                      break L22;
                    }
                  }
                  L27: {
                    L28: {
                      stackOut_102_0 = un.field_h[1][var7 - -1];
                      stackIn_105_0 = stackOut_102_0;
                      stackIn_103_0 = stackOut_102_0;
                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackOut_103_0 = (qh) ((Object) stackIn_103_0);
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_104_0 = stackOut_103_0;
                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackOut_104_0 = (qh) ((Object) stackIn_104_0);
                          stackOut_104_1 = 1;
                          stackIn_106_0 = stackOut_104_0;
                          stackIn_106_1 = stackOut_104_1;
                          break L27;
                        }
                      }
                    }
                    stackOut_105_0 = (qh) ((Object) stackIn_105_0);
                    stackOut_105_1 = 0;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    break L27;
                  }
                  stackIn_106_0.field_T = stackIn_106_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (param3) {
                stackOut_109_0 = 0;
                stackIn_110_0 = stackOut_109_0;
                break L29;
              } else {
                stackOut_108_0 = 1;
                stackIn_110_0 = stackOut_108_0;
                break L29;
              }
            }
            var6 = stackIn_110_0;
            L30: while (true) {
              if (var6 >= 3) {
                L31: {
                  if (!param3) {
                    break L31;
                  } else {
                    if (1 >= tc.field_z) {
                      break L31;
                    } else {
                      var6 = 0;
                      L32: while (true) {
                        if (tc.field_z - -1 <= var6) {
                          break L31;
                        } else {
                          L33: {
                            var29 = un.field_h[3][var6];
                            if (var4_int == 0) {
                              break L33;
                            } else {
                              if (0 == var29.field_Eb) {
                                break L33;
                              } else {
                                fi.field_l = var6;
                                break L33;
                              }
                            }
                          }
                          L34: {
                            if (!var29.field_K) {
                              break L34;
                            } else {
                              if (var6 > 0) {
                                L35: {
                                  if (e.field_g != null) {
                                    stackOut_150_0 = e.field_g[-1 + var6];
                                    stackIn_151_0 = stackOut_150_0;
                                    break L35;
                                  } else {
                                    stackOut_149_0 = null;
                                    stackIn_151_0 = (String) ((Object) stackOut_149_0);
                                    break L35;
                                  }
                                }
                                var8_ref = stackIn_151_0;
                                if (var8_ref == null) {
                                  break L34;
                                } else {
                                  ll.field_i = var8_ref;
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                          L36: {
                            stackOut_153_0 = (qh) (var29);
                            stackIn_155_0 = stackOut_153_0;
                            stackIn_154_0 = stackOut_153_0;
                            if (fi.field_l != var6) {
                              stackOut_155_0 = (qh) ((Object) stackIn_155_0);
                              stackOut_155_1 = 0;
                              stackIn_156_0 = stackOut_155_0;
                              stackIn_156_1 = stackOut_155_1;
                              break L36;
                            } else {
                              stackOut_154_0 = (qh) ((Object) stackIn_154_0);
                              stackOut_154_1 = 1;
                              stackIn_156_0 = stackOut_154_0;
                              stackIn_156_1 = stackOut_154_1;
                              break L36;
                            }
                          }
                          L37: {
                            stackIn_156_0.field_G = stackIn_156_1 != 0;
                            stackOut_156_0 = (qh) (var29);
                            stackIn_158_0 = stackOut_156_0;
                            stackIn_157_0 = stackOut_156_0;
                            if (var4_int == 0) {
                              stackOut_158_0 = (qh) ((Object) stackIn_158_0);
                              stackOut_158_1 = 0;
                              stackIn_159_0 = stackOut_158_0;
                              stackIn_159_1 = stackOut_158_1;
                              break L37;
                            } else {
                              stackOut_157_0 = (qh) ((Object) stackIn_157_0);
                              stackOut_157_1 = 1;
                              stackIn_159_0 = stackOut_157_0;
                              stackIn_159_1 = stackOut_157_1;
                              break L37;
                            }
                          }
                          stackIn_159_0.field_T = stackIn_159_1 != 0;
                          var6++;
                          continue L32;
                        }
                      }
                    }
                  }
                }
                if (param1 <= -114) {
                  var6 = 0;
                  var7 = 0;
                  L38: while (true) {
                    if (var7 >= be.field_a) {
                      L39: {
                        if (var5 == 0) {
                          break L39;
                        } else {
                          if (!param3) {
                            ad.a(0, param2);
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L40: {
                        var30 = un.field_h[4 - -var7];
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
                        if (var30.length - 1 <= var9) {
                          var6 = var6 + (255 & wb.field_j[var7]);
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
                              if (0 > var9) {
                                break L42;
                              } else {
                                L43: {
                                  if (fc.field_b == null) {
                                    break L43;
                                  } else {
                                    if (null != fc.field_b[var7]) {
                                      if (-1 > ((jj.field_i ^ -1) & fc.field_b[var7][var9] ^ -1)) {
                                        var14 = 1;
                                        var15 = ok.a((jj.field_i ^ -1) & fc.field_b[var7][var9], (byte) 51);
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    } else {
                                      break L43;
                                    }
                                  }
                                }
                                L44: {
                                  if (null == ad.field_d) {
                                    break L44;
                                  } else {
                                    if (ad.field_d[var7] == null) {
                                      break L44;
                                    } else {
                                      if (-1 > (rd.field_b ^ -1)) {
                                        break L44;
                                      } else {
                                        if (!ad.field_d[var7][var9]) {
                                          break L44;
                                        } else {
                                          var10 = 1;
                                          break L44;
                                        }
                                      }
                                    }
                                  }
                                }
                                L45: {
                                  if (null == ja.field_b) {
                                    break L45;
                                  } else {
                                    if (null != ja.field_b[var7]) {
                                      L46: {
                                        var16 = ja.field_b[var7][var9];
                                        if (0 >= var16) {
                                          break L46;
                                        } else {
                                          if (ba.field_b < var16) {
                                            var12 = 1;
                                            break L46;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                      if (var16 == 0) {
                                        break L45;
                                      } else {
                                        if (vg.field_a) {
                                          break L45;
                                        } else {
                                          if (rd.field_b > 0) {
                                            break L45;
                                          } else {
                                            var10 = 1;
                                            break L45;
                                          }
                                        }
                                      }
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                L47: {
                                  if (param3) {
                                    if (gl.field_x != null) {
                                      if (null != gl.field_x[var7]) {
                                        if (gl.field_x[var7][var9]) {
                                          stackOut_201_0 = 1;
                                          stackIn_203_0 = stackOut_201_0;
                                          break L47;
                                        } else {
                                          stackOut_200_0 = 0;
                                          stackIn_203_0 = stackOut_200_0;
                                          break L47;
                                        }
                                      } else {
                                        stackOut_198_0 = 0;
                                        stackIn_203_0 = stackOut_198_0;
                                        break L47;
                                      }
                                    } else {
                                      stackOut_196_0 = 0;
                                      stackIn_203_0 = stackOut_196_0;
                                      break L47;
                                    }
                                  } else {
                                    stackOut_194_0 = 0;
                                    stackIn_203_0 = stackOut_194_0;
                                    break L47;
                                  }
                                }
                                var13 = stackIn_203_0;
                                if (null == ol.field_cc) {
                                  break L42;
                                } else {
                                  if (null == ol.field_cc[var7]) {
                                    break L42;
                                  } else {
                                    L48: {
                                      var16 = ol.field_cc[var7][var9];
                                      if (var16 == 0) {
                                        break L48;
                                      } else {
                                        if (vg.field_a) {
                                          break L48;
                                        } else {
                                          if (rd.field_b <= 0) {
                                            var10 = 1;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    if (-1 <= (var16 ^ -1)) {
                                      break L42;
                                    } else {
                                      if (ud.field_D < var16) {
                                        var11 = 1;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L49: {
                            if (-3 < (ul.field_d ^ -1)) {
                              break L49;
                            } else {
                              if (!fc.field_e[12]) {
                                break L49;
                              } else {
                                var11 = 0;
                                var14 = 0;
                                var10 = 0;
                                var13 = 0;
                                var12 = 0;
                                break L49;
                              }
                            }
                          }
                          L50: {
                            L51: {
                              if (var10 != 0) {
                                break L51;
                              } else {
                                if (var11 != 0) {
                                  break L51;
                                } else {
                                  if (var12 != 0) {
                                    break L51;
                                  } else {
                                    if (var13 != 0) {
                                      break L51;
                                    } else {
                                      if (var14 == 0) {
                                        stackOut_224_0 = 0;
                                        stackIn_225_0 = stackOut_224_0;
                                        break L50;
                                      } else {
                                        break L51;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_223_0 = 1;
                            stackIn_225_0 = stackOut_223_0;
                            break L50;
                          }
                          L52: {
                            var16 = stackIn_225_0;
                            ng.field_k = true;
                            if (var16 != 0) {
                              break L52;
                            } else {
                              if (var9 < 0) {
                                break L52;
                              } else {
                                if (null == m.field_b) {
                                  break L52;
                                } else {
                                  L53: {
                                    if (!param3) {
                                      break L53;
                                    } else {
                                      if (!ad.field_f) {
                                        break L53;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  L54: {
                                    gi.field_u = false;
                                    ng.field_k = false;
                                    if (null != dl.field_O) {
                                      break L54;
                                    } else {
                                      m.field_h = new boolean[be.field_a];
                                      dl.field_O = new byte[be.field_a];
                                      break L54;
                                    }
                                  }
                                  var17_int = 0;
                                  L55: while (true) {
                                    if (var17_int >= var7) {
                                      L56: {
                                        lc.a(var9, -1, param0, var7, -1, -89, 0, param3);
                                        if (-3 < (ul.field_d ^ -1)) {
                                          break L56;
                                        } else {
                                          if (fc.field_e[12]) {
                                            ng.field_k = true;
                                            break L56;
                                          } else {
                                            break L56;
                                          }
                                        }
                                      }
                                      if (ng.field_k) {
                                        break L52;
                                      } else {
                                        var16 = 1;
                                        break L52;
                                      }
                                    } else {
                                      m.field_h[var17_int] = false;
                                      var17_int++;
                                      continue L55;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L57: {
                            var17 = var8[var9 - -1];
                            if (var4_int == 0) {
                              break L57;
                            } else {
                              if (-1 != (var17.field_Eb ^ -1)) {
                                if (!param3) {
                                  if (var16 != 0) {
                                    break L57;
                                  } else {
                                    if ((byte)var9 == param0.field_Sb[var7]) {
                                      break L57;
                                    } else {
                                      var5 = 1;
                                      param0.field_Sb[var7] = (byte)var9;
                                      break L57;
                                    }
                                  }
                                } else {
                                  if (0 == (var9 ^ -1)) {
                                    var18 = var6;
                                    L58: while (true) {
                                      if (var18 >= var6 + var30.length + -1) {
                                        break L57;
                                      } else {
                                        ti.field_s[var18 / 8] = (byte)ec.a((int) ti.field_s[var18 / 8], 1 << ec.a(var18, 7) ^ -1);
                                        var18++;
                                        continue L58;
                                      }
                                    }
                                  } else {
                                    ti.field_s[(var9 - -var6) / 8] = (byte)bi.a((int) ti.field_s[(var9 + var6) / 8], 1 << ec.a(7, var9 + var6));
                                    break L57;
                                  }
                                }
                              } else {
                                break L57;
                              }
                            }
                          }
                          L59: {
                            if (!param3) {
                              break L59;
                            } else {
                              if (var16 != 0) {
                                ti.field_s[(var9 - -var6) / 8] = (byte)ec.a((int) ti.field_s[(var9 + var6) / 8], 1 << ec.a(var6 + var9, 7) ^ -1);
                                break L59;
                              } else {
                                break L59;
                              }
                            }
                          }
                          L60: {
                            if (var9 < 0) {
                              break L60;
                            } else {
                              if (!var17.field_K) {
                                break L60;
                              } else {
                                L61: {
                                  if (bl.field_h == null) {
                                    var18_ref = null;
                                    break L61;
                                  } else {
                                    if (null == bl.field_h[var7]) {
                                      var18_ref = null;
                                      break L61;
                                    } else {
                                      var18_ref = bl.field_h[var7][var9];
                                      break L61;
                                    }
                                  }
                                }
                                L62: {
                                  if (fj.field_b == null) {
                                    var19 = null;
                                    break L62;
                                  } else {
                                    if (null != fj.field_b[var7]) {
                                      var19 = fj.field_b[var7][var9];
                                      break L62;
                                    } else {
                                      var19 = null;
                                      break L62;
                                    }
                                  }
                                }
                                L63: {
                                  var20 = null;
                                  if (var19 == null) {
                                    break L63;
                                  } else {
                                    if (!((String) (var19)).equals(var18_ref)) {
                                      var20 = var19;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                L64: {
                                  var21 = null;
                                  if (var13 != 0) {
                                    var21 = vi.field_X;
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
                                    break L64;
                                  } else {
                                    if (var10 != 0) {
                                      var21 = in.field_c;
                                      break L64;
                                    } else {
                                      L65: {
                                        if (var11 == 0) {
                                          break L65;
                                        } else {
                                          var22_int = ol.field_cc[var7][var9] - ud.field_D;
                                          if ((var22_int ^ -1) != -2) {
                                            var21 = db.a(hd.field_d, -34, new String[]{Integer.toString(var22_int)});
                                            break L65;
                                          } else {
                                            var21 = wb.field_e;
                                            break L65;
                                          }
                                        }
                                      }
                                      L66: {
                                        if (var12 != 0) {
                                          var31 = db.a(bj.field_c, -74, new String[]{Integer.toString(ba.field_b), Integer.toString(ja.field_b[var7][var9])});
                                          var22_ref = var31;
                                          var25_ref = var22_ref;
                                          var22_ref = var25_ref;
                                          var21 = var22_ref;
                                          var25_ref = var31;
                                          var22_ref = var25_ref;
                                          if (var21 == null) {
                                            var21 = var31;
                                            break L66;
                                          } else {
                                            var21 = (String) (var21) + "<br>" + var31;
                                            break L66;
                                          }
                                        } else {
                                          break L66;
                                        }
                                      }
                                      if (var14 == 0) {
                                        break L64;
                                      } else {
                                        L67: {
                                          var22_ref = si.field_u;
                                          if ((var15 ^ -1) >= -1) {
                                            break L67;
                                          } else {
                                            if (null == in.field_b) {
                                              break L67;
                                            } else {
                                              if (in.field_b.length < var15) {
                                                break L67;
                                              } else {
                                                if (in.field_b[var15 - 1] == null) {
                                                  break L67;
                                                } else {
                                                  var22_ref = in.field_b[-1 + var15][0];
                                                  break L67;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var22_ref;
                                          break L64;
                                        } else {
                                          var21 = var22_ref;
                                          break L64;
                                        }
                                      }
                                    }
                                  }
                                }
                                L68: {
                                  if (var4_int == 0) {
                                    break L68;
                                  } else {
                                    if (ng.field_k) {
                                      break L68;
                                    } else {
                                      L69: {
                                        var22_ref = null;
                                        if (!gi.field_u) {
                                          break L69;
                                        } else {
                                          var22_ref = "</col>" + rb.field_d + "<col=A00000>";
                                          var25_ref = var22_ref;
                                          var22_ref = var25_ref;
                                          var25_ref = var22_ref;
                                          var22_ref = var25_ref;
                                          var21 = var22_ref;
                                          break L69;
                                        }
                                      }
                                      var23 = 0;
                                      var24 = 0;
                                      L70: while (true) {
                                        if (var7 <= var24) {
                                          if (var23 != 0) {
                                            var21 = mb.field_Ob + var22_ref;
                                            break L68;
                                          } else {
                                            var21 = db.a(be.field_g, -84, new String[]{var22_ref});
                                            break L68;
                                          }
                                        } else {
                                          if (m.field_h[var24]) {
                                            L71: {
                                              var25_ref = "</col>" + al.field_a[var24] + "<col=A00000>";
                                              var22_ref = var25_ref;
                                              var21 = var22_ref;
                                              var22_ref = var25_ref;
                                              if (var22_ref != null) {
                                                var23 = 1;
                                                var22_ref = var22_ref + ", " + var25_ref;
                                                var21 = var22_ref;
                                                var21 = var22_ref;
                                                break L71;
                                              } else {
                                                var22_ref = var25_ref;
                                                break L71;
                                              }
                                            }
                                            var24++;
                                            continue L70;
                                          } else {
                                            var24++;
                                            continue L70;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                L72: {
                                  if (var21 != null) {
                                    var32 = "<col=A00000>" + (String) (var21);
                                    var33 = ln.a("<br>", (byte) 11, "<br><col=A00000>", var32);
                                    if (var20 == null) {
                                      var20 = var33;
                                      break L72;
                                    } else {
                                      var20 = (String) (var20) + "<br>" + var33;
                                      break L72;
                                    }
                                  } else {
                                    break L72;
                                  }
                                }
                                if (var20 != null) {
                                  ll.field_i = (String) (var20);
                                  break L60;
                                } else {
                                  break L60;
                                }
                              }
                            }
                          }
                          L73: {
                            if (param3) {
                              if (var9 != -1) {
                                L74: {
                                  stackOut_332_0 = (qh) (var17);
                                  stackIn_334_0 = stackOut_332_0;
                                  stackIn_333_0 = stackOut_332_0;
                                  if (-1 == (ti.field_s[(var9 + var6) / 8] & 1 << (var6 + var9 & 7) ^ -1)) {
                                    stackOut_334_0 = (qh) ((Object) stackIn_334_0);
                                    stackOut_334_1 = 0;
                                    stackIn_335_0 = stackOut_334_0;
                                    stackIn_335_1 = stackOut_334_1;
                                    break L74;
                                  } else {
                                    stackOut_333_0 = (qh) ((Object) stackIn_333_0);
                                    stackOut_333_1 = 1;
                                    stackIn_335_0 = stackOut_333_0;
                                    stackIn_335_1 = stackOut_333_1;
                                    break L74;
                                  }
                                }
                                stackIn_335_0.field_G = stackIn_335_1 != 0;
                                break L73;
                              } else {
                                var17.field_G = true;
                                var27 = var6;
                                var18 = var27;
                                L75: while (true) {
                                  if (-1 + (var6 + var30.length) <= var27) {
                                    break L73;
                                  } else {
                                    L76: {
                                      stackOut_328_0 = (qh) (var17);
                                      stackOut_328_1 = var17.field_G;
                                      stackIn_330_0 = stackOut_328_0;
                                      stackIn_330_1 = stackOut_328_1;
                                      stackIn_329_0 = stackOut_328_0;
                                      stackIn_329_1 = stackOut_328_1;
                                      if (-1 != (ti.field_s[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                        stackOut_330_0 = (qh) ((Object) stackIn_330_0);
                                        stackOut_330_1 = stackIn_330_1;
                                        stackOut_330_2 = 0;
                                        stackIn_331_0 = stackOut_330_0;
                                        stackIn_331_1 = stackOut_330_1;
                                        stackIn_331_2 = stackOut_330_2;
                                        break L76;
                                      } else {
                                        stackOut_329_0 = (qh) ((Object) stackIn_329_0);
                                        stackOut_329_1 = stackIn_329_1;
                                        stackOut_329_2 = 1;
                                        stackIn_331_0 = stackOut_329_0;
                                        stackIn_331_1 = stackOut_329_1;
                                        stackIn_331_2 = stackOut_329_2;
                                        break L76;
                                      }
                                    }
                                    stackIn_331_0.field_G = stackIn_331_1 & stackIn_331_2 != 0;
                                    var27++;
                                    continue L75;
                                  }
                                }
                              }
                            } else {
                              L77: {
                                L78: {
                                  stackOut_320_0 = (qh) (var17);
                                  stackIn_323_0 = stackOut_320_0;
                                  stackIn_321_0 = stackOut_320_0;
                                  if (!ng.field_k) {
                                    break L78;
                                  } else {
                                    stackOut_321_0 = (qh) ((Object) stackIn_321_0);
                                    stackIn_323_0 = stackOut_321_0;
                                    stackIn_322_0 = stackOut_321_0;
                                    if ((byte)var9 != param0.field_Sb[var7]) {
                                      break L78;
                                    } else {
                                      stackOut_322_0 = (qh) ((Object) stackIn_322_0);
                                      stackOut_322_1 = 1;
                                      stackIn_324_0 = stackOut_322_0;
                                      stackIn_324_1 = stackOut_322_1;
                                      break L77;
                                    }
                                  }
                                }
                                stackOut_323_0 = (qh) ((Object) stackIn_323_0);
                                stackOut_323_1 = 0;
                                stackIn_324_0 = stackOut_323_0;
                                stackIn_324_1 = stackOut_323_1;
                                break L77;
                              }
                              stackIn_324_0.field_G = stackIn_324_1 != 0;
                              break L73;
                            }
                          }
                          L79: {
                            L80: {
                              stackOut_336_0 = (qh) (var17);
                              stackIn_339_0 = stackOut_336_0;
                              stackIn_337_0 = stackOut_336_0;
                              if (var4_int == 0) {
                                break L80;
                              } else {
                                stackOut_337_0 = (qh) ((Object) stackIn_337_0);
                                stackIn_339_0 = stackOut_337_0;
                                stackIn_338_0 = stackOut_337_0;
                                if (var16 != 0) {
                                  break L80;
                                } else {
                                  stackOut_338_0 = (qh) ((Object) stackIn_338_0);
                                  stackOut_338_1 = 1;
                                  stackIn_340_0 = stackOut_338_0;
                                  stackIn_340_1 = stackOut_338_1;
                                  break L79;
                                }
                              }
                            }
                            stackOut_339_0 = (qh) ((Object) stackIn_339_0);
                            stackOut_339_1 = 0;
                            stackIn_340_0 = stackOut_339_0;
                            stackIn_340_1 = stackOut_339_1;
                            break L79;
                          }
                          stackIn_340_0.field_T = stackIn_340_1 != 0;
                          var9++;
                          continue L41;
                        }
                      }
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L81: {
                  var28 = un.field_h[2][var6];
                  if (var4_int == 0) {
                    break L81;
                  } else {
                    if (-1 == (var28.field_Eb ^ -1)) {
                      break L81;
                    } else {
                      if (param3) {
                        if (var6 != 0) {
                          nb.field_L = nb.field_L ^ var6;
                          break L81;
                        } else {
                          nb.field_L = 0;
                          break L81;
                        }
                      } else {
                        if (var6 == param0.field_sc) {
                          break L81;
                        } else {
                          param0.field_sc = var6;
                          var5 = 1;
                          break L81;
                        }
                      }
                    }
                  }
                }
                L82: {
                  if (!param3) {
                    L83: {
                      stackOut_130_0 = (qh) (var28);
                      stackIn_132_0 = stackOut_130_0;
                      stackIn_131_0 = stackOut_130_0;
                      if ((param0.field_sc & var6) == 0) {
                        stackOut_132_0 = (qh) ((Object) stackIn_132_0);
                        stackOut_132_1 = 0;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        break L83;
                      } else {
                        stackOut_131_0 = (qh) ((Object) stackIn_131_0);
                        stackOut_131_1 = 1;
                        stackIn_133_0 = stackOut_131_0;
                        stackIn_133_1 = stackOut_131_1;
                        break L83;
                      }
                    }
                    stackIn_133_0.field_G = stackIn_133_1 != 0;
                    break L82;
                  } else {
                    if (var6 != 0) {
                      L84: {
                        stackOut_126_0 = (qh) (var28);
                        stackIn_128_0 = stackOut_126_0;
                        stackIn_127_0 = stackOut_126_0;
                        if ((var6 & nb.field_L) == 0) {
                          stackOut_128_0 = (qh) ((Object) stackIn_128_0);
                          stackOut_128_1 = 0;
                          stackIn_129_0 = stackOut_128_0;
                          stackIn_129_1 = stackOut_128_1;
                          break L84;
                        } else {
                          stackOut_127_0 = (qh) ((Object) stackIn_127_0);
                          stackOut_127_1 = 1;
                          stackIn_129_0 = stackOut_127_0;
                          stackIn_129_1 = stackOut_127_1;
                          break L84;
                        }
                      }
                      stackIn_129_0.field_G = stackIn_129_1 != 0;
                      break L82;
                    } else {
                      L85: {
                        stackOut_122_0 = (qh) (var28);
                        stackIn_124_0 = stackOut_122_0;
                        stackIn_123_0 = stackOut_122_0;
                        if (nb.field_L != 0) {
                          stackOut_124_0 = (qh) ((Object) stackIn_124_0);
                          stackOut_124_1 = 0;
                          stackIn_125_0 = stackOut_124_0;
                          stackIn_125_1 = stackOut_124_1;
                          break L85;
                        } else {
                          stackOut_123_0 = (qh) ((Object) stackIn_123_0);
                          stackOut_123_1 = 1;
                          stackIn_125_0 = stackOut_123_0;
                          stackIn_125_1 = stackOut_123_1;
                          break L85;
                        }
                      }
                      stackIn_125_0.field_G = stackIn_125_1 != 0;
                      break L82;
                    }
                  }
                }
                L86: {
                  stackOut_134_0 = (qh) (var28);
                  stackIn_136_0 = stackOut_134_0;
                  stackIn_135_0 = stackOut_134_0;
                  if (var4_int == 0) {
                    stackOut_136_0 = (qh) ((Object) stackIn_136_0);
                    stackOut_136_1 = 0;
                    stackIn_137_0 = stackOut_136_0;
                    stackIn_137_1 = stackOut_136_1;
                    break L86;
                  } else {
                    stackOut_135_0 = (qh) ((Object) stackIn_135_0);
                    stackOut_135_1 = 1;
                    stackIn_137_0 = stackOut_135_0;
                    stackIn_137_1 = stackOut_135_1;
                    break L86;
                  }
                }
                stackIn_137_0.field_T = stackIn_137_1 != 0;
                var6++;
                continue L30;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L87: {
            var4 = decompiledCaughtException;
            stackOut_347_0 = (RuntimeException) (var4);
            stackOut_347_1 = new StringBuilder().append("cb.G(");
            stackIn_349_0 = stackOut_347_0;
            stackIn_349_1 = stackOut_347_1;
            stackIn_348_0 = stackOut_347_0;
            stackIn_348_1 = stackOut_347_1;
            if (param0 == null) {
              stackOut_349_0 = (RuntimeException) ((Object) stackIn_349_0);
              stackOut_349_1 = (StringBuilder) ((Object) stackIn_349_1);
              stackOut_349_2 = "null";
              stackIn_350_0 = stackOut_349_0;
              stackIn_350_1 = stackOut_349_1;
              stackIn_350_2 = stackOut_349_2;
              break L87;
            } else {
              stackOut_348_0 = (RuntimeException) ((Object) stackIn_348_0);
              stackOut_348_1 = (StringBuilder) ((Object) stackIn_348_1);
              stackOut_348_2 = "{...}";
              stackIn_350_0 = stackOut_348_0;
              stackIn_350_1 = stackOut_348_1;
              stackIn_350_2 = stackOut_348_2;
              break L87;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_350_0), stackIn_350_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Exception var2 = null;
            Object var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            df var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = SteelSentinels.field_G;
            L0: while (true) {
              if (this.field_b) {
                return;
              } else {
                var2_ref = this.field_i;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (df) ((Object) this.field_i.c(-104));
                    if (var7 != null) {
                      this.field_f = this.field_f - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_i.wait();
                          break L2;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L3: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L3;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (-3 == (var7.field_H ^ -1)) {
                          discarded$1 = var7.field_G.a(79, var7.field_L.length, (int)var7.field_w, var7.field_L);
                          break L5;
                        } else {
                          if ((var7.field_H ^ -1) == -4) {
                            var7.field_L = var7.field_G.b((int)var7.field_w, false);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      sj.a((String) null, -36, (Throwable) ((Object) var2));
                      break L6;
                    }
                  }
                  var7.field_z = false;
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final df a(byte param0, rc param1, int param2, byte[] param3) {
        df var5 = null;
        RuntimeException var5_ref = null;
        df stackIn_2_0 = null;
        df stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        df stackOut_3_0 = null;
        df stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var5 = new df();
            if (param0 >= 33) {
              var5.field_B = false;
              var5.field_H = 2;
              var5.field_w = (long)param2;
              var5.field_G = param1;
              var5.field_L = param3;
              this.a((byte) -92, var5);
              stackOut_3_0 = (df) (var5);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (df) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5_ref);
            stackOut_5_1 = new StringBuilder().append("cb.F(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        field_h = (int[][]) null;
        field_a = null;
        field_e = null;
        field_j = null;
        field_c = null;
        if (param0 != -1) {
            field_l = -46;
        }
        field_g = null;
        field_d = null;
    }

    final df a(rc param0, int param1, int param2) {
        df var4 = null;
        RuntimeException var4_ref = null;
        df stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        df stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var4 = new df();
            var4.field_w = (long)param1;
            var4.field_H = param2;
            var4.field_G = param0;
            var4.field_B = false;
            this.a((byte) -109, var4);
            stackOut_0_0 = (df) (var4);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4_ref);
            stackOut_2_1 = new StringBuilder().append("cb.C(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    cb(pn param0) {
        wj var2 = null;
        this.field_i = new ra();
        this.field_b = false;
        this.field_f = 0;
        try {
            var2 = param0.a(2, 5, (Runnable) (this));
            while (var2.field_a == 0) {
                a.a((byte) 121, 10L);
            }
            if ((var2.field_a ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_k = (Thread) (var2.field_c);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = "Don't mind";
        field_l = 0;
        field_h = new int[][]{null, null, null};
        field_a = "DEFAULT SET";
        field_g = "Accept";
        field_d = "Remove friend";
    }
}
