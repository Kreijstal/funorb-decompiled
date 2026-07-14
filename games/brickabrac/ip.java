/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip extends ki {
    static jp[][] field_v;
    static String field_t;
    static fo field_r;
    static vl field_s;
    static String[] field_u;

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var6 = null;
        RuntimeException var6_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_v = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (((ip) this).b((byte) -99)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        lb.g(param4, param2, 640, 480, ro.field_x[param3], 16777215);
                        if (!BrickABrac.field_J) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = ge.a(((ip) this).field_m, param3, -20777);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (!var6.a((byte) -84, param3, ((ip) this).field_m)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ih.a(var6, np.field_d, param3, 1, 0, true);
                        var6.a(((ip) this).field_m, param3, (byte) 78);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ef.a(var6.field_p, dg.field_g, param4, false, param1, param2, 0, param3, 1, 640, ch.field_f);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var6_ref, "ip.K(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jp[] a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        jp[] stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_0_0;
        try {
          var3_int = -53 / ((65 - param0) / 49);
          stackOut_0_0 = tk.field_l[-1 + param1];
          stackIn_1_0 = stackOut_0_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return (jp[]) (Object) stackIn_1_0;
        }
        return null;
    }

    final jp a(boolean param0, int param1) {
        RuntimeException var3 = null;
        jp stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_4_0;
        try {
          try {
            L0: {
              if (param0) {
                break L0;
              } else {
                boolean discarded$2 = ((ip) this).b((byte) -1);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = up.field_A[param1 + -1];
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final static void a(int param0, om param1, boolean param2, boolean param3) {
        String var8_ref2 = null;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        rk var7_ref_rk = null;
        int var8_int = 0;
        rk[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        rk var17 = null;
        int var17_int = 0;
        int var18 = 0;
        String var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        int var22_int = 0;
        String var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        om stackIn_14_0 = null;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        rk[][] stackIn_32_0 = null;
        om stackIn_36_0 = null;
        int stackIn_44_0 = 0;
        rk stackIn_51_0 = null;
        rk stackIn_53_0 = null;
        rk stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_101_0 = 0;
        rk[][] stackIn_104_0 = null;
        rk stackIn_131_0 = null;
        rk stackIn_133_0 = null;
        rk stackIn_134_0 = null;
        int stackIn_134_1 = 0;
        rk stackIn_139_0 = null;
        boolean stackIn_139_1 = false;
        int stackIn_139_2 = 0;
        int stackIn_139_3 = 0;
        rk stackIn_140_0 = null;
        boolean stackIn_140_1 = false;
        rk stackIn_142_0 = null;
        boolean stackIn_142_1 = false;
        rk stackIn_144_0 = null;
        boolean stackIn_144_1 = false;
        rk stackIn_145_0 = null;
        boolean stackIn_145_1 = false;
        int stackIn_145_2 = 0;
        rk stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        byte stackIn_148_2 = 0;
        int stackIn_148_3 = 0;
        rk stackIn_150_0 = null;
        int stackIn_150_1 = 0;
        int stackIn_150_2 = 0;
        int stackIn_150_3 = 0;
        rk stackIn_151_0 = null;
        rk stackIn_153_0 = null;
        rk stackIn_154_0 = null;
        int stackIn_154_1 = 0;
        rk stackIn_156_0 = null;
        rk stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        rk stackIn_158_0 = null;
        rk stackIn_160_0 = null;
        rk stackIn_162_0 = null;
        rk stackIn_163_0 = null;
        int stackIn_163_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_177_0 = 0;
        rk stackIn_199_0 = null;
        rk stackIn_201_0 = null;
        rk stackIn_203_0 = null;
        rk stackIn_204_0 = null;
        int stackIn_204_1 = 0;
        rk stackIn_209_0 = null;
        rk stackIn_211_0 = null;
        rk stackIn_213_0 = null;
        rk stackIn_214_0 = null;
        int stackIn_214_1 = 0;
        rk stackIn_216_0 = null;
        rk stackIn_218_0 = null;
        rk stackIn_220_0 = null;
        rk stackIn_221_0 = null;
        int stackIn_221_1 = 0;
        int stackIn_224_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_235_0 = 0;
        rk stackIn_239_0 = null;
        int stackIn_247_0 = 0;
        String stackIn_256_0 = null;
        rk stackIn_262_0 = null;
        rk stackIn_264_0 = null;
        rk stackIn_265_0 = null;
        int stackIn_265_1 = 0;
        int stackIn_267_0 = 0;
        boolean stackIn_271_0 = false;
        int stackIn_277_0 = 0;
        int stackIn_281_0 = 0;
        int stackIn_285_0 = 0;
        int[][] stackIn_292_0 = null;
        boolean[][] stackIn_303_0 = null;
        boolean[][] stackIn_310_0 = null;
        int[][] stackIn_318_0 = null;
        boolean stackIn_326_0 = false;
        int stackIn_330_0 = 0;
        int stackIn_338_0 = 0;
        boolean stackIn_356_0 = false;
        int stackIn_360_0 = 0;
        boolean[][] stackIn_368_0 = null;
        Object stackIn_372_0 = null;
        boolean[][] stackIn_376_0 = null;
        int stackIn_382_0 = 0;
        int stackIn_390_0 = 0;
        int stackIn_394_0 = 0;
        int stackIn_398_0 = 0;
        int stackIn_402_0 = 0;
        int stackIn_408_0 = 0;
        int stackIn_411_0 = 0;
        int[][] stackIn_415_0 = null;
        boolean stackIn_419_0 = false;
        boolean stackIn_423_0 = false;
        boolean[] stackIn_441_0 = null;
        int stackIn_452_0 = 0;
        int stackIn_480_0 = 0;
        rk stackIn_488_0 = null;
        Object stackIn_495_0 = null;
        String stackIn_502_0 = null;
        Object stackIn_505_0 = null;
        String stackIn_512_0 = null;
        Object stackIn_515_0 = null;
        String[][] stackIn_541_0 = null;
        String[][] stackIn_545_0 = null;
        boolean stackIn_567_0 = false;
        int stackIn_575_0 = 0;
        rk stackIn_591_0 = null;
        int stackIn_591_1 = 0;
        byte stackIn_591_2 = 0;
        int stackIn_591_3 = 0;
        rk stackIn_593_0 = null;
        int stackIn_593_1 = 0;
        int stackIn_593_2 = 0;
        int stackIn_593_3 = 0;
        rk stackIn_594_0 = null;
        rk stackIn_596_0 = null;
        rk stackIn_597_0 = null;
        int stackIn_597_1 = 0;
        rk stackIn_601_0 = null;
        boolean stackIn_601_1 = false;
        int stackIn_601_2 = 0;
        int stackIn_601_3 = 0;
        rk stackIn_602_0 = null;
        boolean stackIn_602_1 = false;
        rk stackIn_604_0 = null;
        boolean stackIn_604_1 = false;
        rk stackIn_605_0 = null;
        boolean stackIn_605_1 = false;
        int stackIn_605_2 = 0;
        rk stackIn_608_0 = null;
        rk stackIn_610_0 = null;
        rk stackIn_611_0 = null;
        int stackIn_611_1 = 0;
        rk stackIn_612_0 = null;
        rk stackIn_614_0 = null;
        rk stackIn_616_0 = null;
        rk stackIn_617_0 = null;
        int stackIn_617_1 = 0;
        rk stackIn_619_0 = null;
        rk stackIn_620_0 = null;
        int stackIn_620_1 = 0;
        rk stackIn_621_0 = null;
        rk stackIn_623_0 = null;
        rk stackIn_625_0 = null;
        rk stackIn_626_0 = null;
        int stackIn_626_1 = 0;
        int stackIn_628_0 = 0;
        int stackIn_630_0 = 0;
        boolean stackIn_632_0 = false;
        RuntimeException stackIn_641_0 = null;
        StringBuilder stackIn_641_1 = null;
        RuntimeException stackIn_643_0 = null;
        StringBuilder stackIn_643_1 = null;
        RuntimeException stackIn_644_0 = null;
        StringBuilder stackIn_644_1 = null;
        String stackIn_644_2 = null;
        Throwable caughtException = null;
        int stackOut_5_0;
        int stackOut_7_0;
        int stackOut_8_0;
        om stackOut_13_0;
        int stackOut_17_0;
        int stackOut_19_0;
        int stackOut_27_0;
        rk[][] stackOut_31_0;
        om stackOut_35_0;
        int stackOut_43_0;
        rk stackOut_50_0;
        rk stackOut_51_0;
        int stackOut_51_1;
        rk stackOut_53_0;
        int stackOut_53_1;
        boolean stackOut_55_0;
        int stackOut_69_0;
        int stackOut_73_0;
        int stackOut_75_0;
        int stackOut_85_0;
        int stackOut_87_0;
        int stackOut_90_0;
        int stackOut_94_0;
        int stackOut_98_0;
        int stackOut_100_0;
        rk[][] stackOut_103_0;
        rk stackOut_130_0;
        rk stackOut_131_0;
        int stackOut_131_1;
        rk stackOut_133_0;
        int stackOut_133_1;
        rk stackOut_138_0;
        boolean stackOut_138_1;
        int stackOut_138_2;
        int stackOut_138_3;
        rk stackOut_139_0;
        boolean stackOut_139_1;
        rk stackOut_140_0;
        boolean stackOut_140_1;
        rk stackOut_142_0;
        boolean stackOut_142_1;
        int stackOut_142_2;
        rk stackOut_144_0;
        boolean stackOut_144_1;
        int stackOut_144_2;
        rk stackOut_147_0;
        int stackOut_147_1;
        byte stackOut_147_2;
        int stackOut_147_3;
        rk stackOut_148_0;
        int stackOut_148_1;
        byte stackOut_148_2;
        int stackOut_148_3;
        rk stackOut_150_0;
        rk stackOut_151_0;
        int stackOut_151_1;
        rk stackOut_153_0;
        int stackOut_153_1;
        rk stackOut_155_0;
        rk stackOut_156_0;
        int stackOut_156_1;
        rk stackOut_157_0;
        rk stackOut_158_0;
        rk stackOut_160_0;
        int stackOut_160_1;
        rk stackOut_162_0;
        int stackOut_162_1;
        boolean stackOut_164_0;
        int stackOut_166_0;
        int stackOut_168_0;
        int stackOut_172_0;
        int stackOut_176_0;
        rk stackOut_198_0;
        rk stackOut_199_0;
        rk stackOut_201_0;
        int stackOut_201_1;
        rk stackOut_203_0;
        int stackOut_203_1;
        rk stackOut_208_0;
        rk stackOut_209_0;
        rk stackOut_211_0;
        int stackOut_211_1;
        rk stackOut_213_0;
        int stackOut_213_1;
        rk stackOut_215_0;
        rk stackOut_216_0;
        rk stackOut_218_0;
        int stackOut_218_1;
        rk stackOut_220_0;
        int stackOut_220_1;
        boolean stackOut_223_0;
        int stackOut_225_0;
        int stackOut_234_0;
        rk stackOut_238_0;
        int stackOut_246_0;
        Object stackOut_253_0;
        String stackOut_255_0;
        rk stackOut_261_0;
        rk stackOut_262_0;
        int stackOut_262_1;
        rk stackOut_264_0;
        int stackOut_264_1;
        int stackOut_266_0;
        boolean stackOut_270_0;
        int stackOut_274_0;
        int stackOut_276_0;
        int stackOut_280_0;
        int stackOut_284_0;
        int[][] stackOut_291_0;
        boolean[][] stackOut_302_0;
        boolean[][] stackOut_309_0;
        int[][] stackOut_317_0;
        boolean stackOut_325_0;
        int stackOut_329_0;
        int stackOut_337_0;
        boolean stackOut_355_0;
        int stackOut_359_0;
        boolean[][] stackOut_367_0;
        Object stackOut_371_0;
        boolean[][] stackOut_375_0;
        int stackOut_379_0;
        int stackOut_381_0;
        int stackOut_389_0;
        int stackOut_393_0;
        int stackOut_397_0;
        int stackOut_401_0;
        int stackOut_405_0;
        int stackOut_407_0;
        int stackOut_410_0;
        int[][] stackOut_414_0;
        boolean stackOut_418_0;
        boolean stackOut_422_0;
        boolean[] stackOut_440_0;
        int stackOut_451_0;
        int stackOut_479_0;
        rk stackOut_487_0;
        Object stackOut_494_0;
        Object stackOut_498_0;
        String stackOut_500_0;
        Object stackOut_501_0;
        Object stackOut_504_0;
        String stackOut_508_0;
        Object stackOut_510_0;
        Object stackOut_511_0;
        String stackOut_514_0;
        String[][] stackOut_540_0;
        String[][] stackOut_544_0;
        boolean stackOut_566_0;
        int stackOut_574_0;
        rk stackOut_590_0;
        int stackOut_590_1;
        byte stackOut_590_2;
        int stackOut_590_3;
        rk stackOut_591_0;
        int stackOut_591_1;
        byte stackOut_591_2;
        int stackOut_591_3;
        rk stackOut_593_0;
        rk stackOut_594_0;
        int stackOut_594_1;
        rk stackOut_596_0;
        int stackOut_596_1;
        rk stackOut_600_0;
        boolean stackOut_600_1;
        int stackOut_600_2;
        int stackOut_600_3;
        rk stackOut_601_0;
        boolean stackOut_601_1;
        rk stackOut_602_0;
        boolean stackOut_602_1;
        int stackOut_602_2;
        rk stackOut_604_0;
        boolean stackOut_604_1;
        int stackOut_604_2;
        rk stackOut_607_0;
        rk stackOut_608_0;
        rk stackOut_610_0;
        int stackOut_610_1;
        rk stackOut_611_0;
        rk stackOut_612_0;
        rk stackOut_614_0;
        int stackOut_614_1;
        rk stackOut_616_0;
        int stackOut_616_1;
        rk stackOut_618_0;
        rk stackOut_619_0;
        int stackOut_619_1;
        rk stackOut_620_0;
        rk stackOut_621_0;
        rk stackOut_623_0;
        int stackOut_623_1;
        rk stackOut_625_0;
        int stackOut_625_1;
        int stackOut_627_0;
        int stackOut_629_0;
        boolean stackOut_631_0;
        RuntimeException stackOut_640_0;
        StringBuilder stackOut_640_1;
        RuntimeException stackOut_641_0;
        StringBuilder stackOut_641_1;
        String stackOut_641_2;
        RuntimeException stackOut_643_0;
        StringBuilder stackOut_643_1;
        String stackOut_643_2;
        int statePc = 0;
        var8_ref2 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var26 = BrickABrac.field_J ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    if (!param2) {
                        statePc = 10;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    if (fh.field_d) {
                        statePc = 7;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    stackOut_5_0 = 1;
                    stackIn_8_0 = stackOut_5_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var4_int = stackIn_8_0;
                    stackOut_8_0 = var26;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    if (stackIn_9_0 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (!hn.b((byte) 7)) {
                        statePc = 19;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackOut_13_0 = (om) param1;
                    stackIn_14_0 = stackOut_13_0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    if (((om) (Object) stackIn_14_0).field_Rb) {
                        statePc = 19;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = 1;
                    stackIn_20_0 = stackOut_17_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 19: {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    var4_int = stackIn_20_0;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    var5 = param3 ? 1 : 0;
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    if (!param2) {
                        statePc = 25;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 25: {
                    var6 = 0;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (var6 >= 5) {
                        statePc = 55;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackOut_27_0 = var4_int;
                    stackIn_56_0 = stackOut_27_0;
                    stackIn_28_0 = stackOut_27_0;
                    if (var26 != 0) {
                        statePc = 56;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    if (stackIn_28_0 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    stackOut_31_0 = ab.field_A;
                    stackIn_32_0 = stackOut_31_0;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (((rk) (Object) stackIn_32_0[0][1 + var6]).field_L == 0) {
                        statePc = 42;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackOut_35_0 = (om) param1;
                    stackIn_36_0 = stackOut_35_0;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    if ((((om) (Object) stackIn_36_0).field_kc ^ -1) != (var6 ^ -1)) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    param1.field_kc = var6;
                    var5 = 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    ab.field_A[0][var6 - -1].field_eb = var4_int != 0;
                    if (vd.field_e) {
                        statePc = 50;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 43: {
                    stackOut_43_0 = var6;
                    stackIn_44_0 = stackOut_43_0;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    if ((stackIn_44_0 ^ -1) == -4) {
                        statePc = 49;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 49: {
                    ab.field_A[0][var6 - -1].field_eb = false;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    stackOut_50_0 = ab.field_A[0][var6 - -1];
                    stackIn_53_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (var6 != param1.field_kc) {
                        statePc = 53;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    stackOut_51_0 = (rk) (Object) stackIn_51_0;
                    stackOut_51_1 = 1;
                    stackIn_54_0 = stackOut_51_0;
                    stackIn_54_1 = stackOut_51_1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 53: {
                    stackOut_53_0 = (rk) (Object) stackIn_53_0;
                    stackOut_53_1 = 0;
                    stackIn_54_0 = stackOut_53_0;
                    stackIn_54_1 = stackOut_53_1;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ((rk) (Object) stackIn_54_0).field_Nb = stackIn_54_1 != 0;
                    var6++;
                    if (var26 == 0) {
                        statePc = 26;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    stackOut_55_0 = ab.field_A[0][2].field_G;
                    stackIn_56_0 = stackOut_55_0 ? 1 : 0;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    if (stackIn_56_0 != 0) {
                        statePc = 58;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 58: {
                    if (hn.b((byte) 7)) {
                        statePc = 62;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                case 59: {
                    ep.field_e = rd.a(oo.field_t, new String[1], (byte) 103);
                    if (var26 == 0) {
                        statePc = 65;
                    } else {
                        statePc = 62;
                    }
                    continue stateLoop;
                }
                case 62: {
                    ep.field_e = rq.field_d;
                    statePc = 65;
                    continue stateLoop;
                }
                case 65: {
                    if (-3 < (w.field_n.length ^ -1)) {
                        statePc = 164;
                    } else {
                        statePc = 66;
                    }
                    continue stateLoop;
                }
                case 66: {
                    if (!param2) {
                        statePc = 75;
                    } else {
                        statePc = 69;
                    }
                    continue stateLoop;
                }
                case 69: {
                    stackOut_69_0 = il.field_z;
                    stackIn_70_0 = stackOut_69_0;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    if (stackIn_70_0 == -1) {
                        statePc = 75;
                    } else {
                        statePc = 73;
                    }
                    continue stateLoop;
                }
                case 73: {
                    stackOut_73_0 = 1;
                    stackIn_76_0 = stackOut_73_0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 75: {
                    stackOut_75_0 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    statePc = 76;
                    continue stateLoop;
                }
                case 76: {
                    var6 = stackIn_76_0;
                    if (var6 == 0) {
                        statePc = 84;
                    } else {
                        statePc = 77;
                    }
                    continue stateLoop;
                }
                case 77: {
                    var7 = il.field_z;
                    var8_int = 0;
                    statePc = 78;
                    continue stateLoop;
                }
                case 78: {
                    if (rh.field_d.length <= var8_int) {
                        statePc = 83;
                    } else {
                        statePc = 79;
                    }
                    continue stateLoop;
                }
                case 79: {
                    rh.field_d[var8_int] = (byte) 0;
                    var8_int++;
                    if (var26 != 0) {
                        statePc = 84;
                    } else {
                        statePc = 80;
                    }
                    continue stateLoop;
                }
                case 80: {
                    if (var26 == 0) {
                        statePc = 78;
                    } else {
                        statePc = 83;
                    }
                    continue stateLoop;
                }
                case 83: {
                    rh.field_d[var7 / 8] = (byte)ud.d((int) rh.field_d[var7 / 8], 1 << var7 % 8);
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    if (param2) {
                        statePc = 87;
                    } else {
                        statePc = 85;
                    }
                    continue stateLoop;
                }
                case 85: {
                    stackOut_85_0 = 0;
                    stackIn_88_0 = stackOut_85_0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 87: {
                    stackOut_87_0 = -1;
                    stackIn_88_0 = stackOut_87_0;
                    statePc = 88;
                    continue stateLoop;
                }
                case 88: {
                    var7 = stackIn_88_0;
                    statePc = 89;
                    continue stateLoop;
                }
                case 89: {
                    if (w.field_n.length <= var7) {
                        statePc = 164;
                    } else {
                        statePc = 90;
                    }
                    continue stateLoop;
                }
                case 90: {
                    stackOut_90_0 = var6;
                    stackIn_165_0 = stackOut_90_0;
                    stackIn_91_0 = stackOut_90_0;
                    if (var26 != 0) {
                        statePc = 165;
                    } else {
                        statePc = 91;
                    }
                    continue stateLoop;
                }
                case 91: {
                    if (stackIn_91_0 == 0) {
                        statePc = 100;
                    } else {
                        statePc = 94;
                    }
                    continue stateLoop;
                }
                case 94: {
                    stackOut_94_0 = var7;
                    stackIn_95_0 = stackOut_94_0;
                    statePc = 95;
                    continue stateLoop;
                }
                case 95: {
                    if ((stackIn_95_0 ^ -1) == (il.field_z ^ -1)) {
                        statePc = 100;
                    } else {
                        statePc = 98;
                    }
                    continue stateLoop;
                }
                case 98: {
                    stackOut_98_0 = 1;
                    stackIn_101_0 = stackOut_98_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 100: {
                    stackOut_100_0 = 0;
                    stackIn_101_0 = stackOut_100_0;
                    statePc = 101;
                    continue stateLoop;
                }
                case 101: {
                    var8_int = stackIn_101_0;
                    statePc = 102;
                    continue stateLoop;
                }
                case 102: {
                    if (var4_int == 0) {
                        statePc = 128;
                    } else {
                        statePc = 103;
                    }
                    continue stateLoop;
                }
                case 103: {
                    stackOut_103_0 = ab.field_A;
                    stackIn_104_0 = stackOut_103_0;
                    statePc = 104;
                    continue stateLoop;
                }
                case 104: {
                    if (((rk) (Object) stackIn_104_0[1][1 + var7]).field_L == 0) {
                        statePc = 128;
                    } else {
                        statePc = 107;
                    }
                    continue stateLoop;
                }
                case 107: {
                    if (param2) {
                        statePc = 113;
                    } else {
                        statePc = 110;
                    }
                    continue stateLoop;
                }
                case 110: {
                    var9 = w.field_n[var7];
                    if ((param1.field_jc ^ -1) == (var9 ^ -1)) {
                        statePc = 112;
                    } else {
                        statePc = 111;
                    }
                    continue stateLoop;
                }
                case 111: {
                    var5 = 1;
                    param1.field_jc = var9;
                    statePc = 112;
                    continue stateLoop;
                }
                case 112: {
                    if (var26 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 113;
                    }
                    continue stateLoop;
                }
                case 113: {
                    if (var6 == 0) {
                        statePc = 118;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 118: {
                    if ((var7 ^ -1) == 0) {
                        statePc = 122;
                    } else {
                        statePc = 119;
                    }
                    continue stateLoop;
                }
                case 119: {
                    rh.field_d[var7 / 8] = (byte)pn.a((int) rh.field_d[var7 / 8], 1 << ik.a(var7, 7));
                    if (var26 == 0) {
                        statePc = 128;
                    } else {
                        statePc = 122;
                    }
                    continue stateLoop;
                }
                case 122: {
                    var9 = 0;
                    statePc = 123;
                    continue stateLoop;
                }
                case 123: {
                    if ((var9 ^ -1) <= (rh.field_d.length ^ -1)) {
                        statePc = 128;
                    } else {
                        statePc = 124;
                    }
                    continue stateLoop;
                }
                case 124: {
                    rh.field_d[var9] = (byte) 0;
                    var9++;
                    if (var26 != 0) {
                        statePc = 135;
                    } else {
                        statePc = 125;
                    }
                    continue stateLoop;
                }
                case 125: {
                    if (var26 == 0) {
                        statePc = 123;
                    } else {
                        statePc = 128;
                    }
                    continue stateLoop;
                }
                case 128: {
                    if (param2) {
                        statePc = 135;
                    } else {
                        statePc = 129;
                    }
                    continue stateLoop;
                }
                case 129: {
                    var9 = w.field_n[var7];
                    statePc = 130;
                    continue stateLoop;
                }
                case 130: {
                    stackOut_130_0 = ab.field_A[1][1 + var7];
                    stackIn_133_0 = stackOut_130_0;
                    stackIn_131_0 = stackOut_130_0;
                    if ((var9 ^ -1) != (param1.field_jc ^ -1)) {
                        statePc = 133;
                    } else {
                        statePc = 131;
                    }
                    continue stateLoop;
                }
                case 131: {
                    stackOut_131_0 = (rk) (Object) stackIn_131_0;
                    stackOut_131_1 = 1;
                    stackIn_134_0 = stackOut_131_0;
                    stackIn_134_1 = stackOut_131_1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 133: {
                    stackOut_133_0 = (rk) (Object) stackIn_133_0;
                    stackOut_133_1 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    stackIn_134_1 = stackOut_133_1;
                    statePc = 134;
                    continue stateLoop;
                }
                case 134: {
                    ((rk) (Object) stackIn_134_0).field_Nb = stackIn_134_1 != 0;
                    if (var26 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 135;
                    }
                    continue stateLoop;
                }
                case 135: {
                    if ((var7 ^ -1) != 0) {
                        statePc = 147;
                    } else {
                        statePc = 136;
                    }
                    continue stateLoop;
                }
                case 136: {
                    ab.field_A[1][1 + var7].field_Nb = true;
                    var9 = 0;
                    statePc = 137;
                    continue stateLoop;
                }
                case 137: {
                    if (w.field_n.length <= var9) {
                        statePc = 146;
                    } else {
                        statePc = 138;
                    }
                    continue stateLoop;
                }
                case 138: {
                    stackOut_138_0 = ab.field_A[1][var7 + 1];
                    stackOut_138_1 = ab.field_A[1][var7 + 1].field_Nb;
                    stackOut_138_2 = rh.field_d[var9 / 8] & 1 << (var9 & 7) ^ -1;
                    stackOut_138_3 = -1;
                    stackIn_150_0 = stackOut_138_0;
                    stackIn_150_1 = stackOut_138_1 ? 1 : 0;
                    stackIn_150_2 = stackOut_138_2;
                    stackIn_150_3 = stackOut_138_3;
                    stackIn_139_0 = stackOut_138_0;
                    stackIn_139_1 = stackOut_138_1;
                    stackIn_139_2 = stackOut_138_2;
                    stackIn_139_3 = stackOut_138_3;
                    if (var26 != 0) {
                        statePc = 150;
                    } else {
                        statePc = 139;
                    }
                    continue stateLoop;
                }
                case 139: {
                    stackOut_139_0 = (rk) (Object) stackIn_139_0;
                    stackOut_139_1 = stackIn_139_1;
                    stackIn_144_0 = stackOut_139_0;
                    stackIn_144_1 = stackOut_139_1;
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    if (stackIn_139_2 != stackIn_139_3) {
                        statePc = 144;
                    } else {
                        statePc = 140;
                    }
                    continue stateLoop;
                }
                case 140: {
                    stackOut_140_0 = (rk) (Object) stackIn_140_0;
                    stackOut_140_1 = stackIn_140_1;
                    stackIn_142_0 = stackOut_140_0;
                    stackIn_142_1 = stackOut_140_1;
                    statePc = 142;
                    continue stateLoop;
                }
                case 142: {
                    stackOut_142_0 = (rk) (Object) stackIn_142_0;
                    stackOut_142_1 = stackIn_142_1;
                    stackOut_142_2 = 1;
                    stackIn_145_0 = stackOut_142_0;
                    stackIn_145_1 = stackOut_142_1;
                    stackIn_145_2 = stackOut_142_2;
                    statePc = 145;
                    continue stateLoop;
                }
                case 144: {
                    stackOut_144_0 = (rk) (Object) stackIn_144_0;
                    stackOut_144_1 = stackIn_144_1;
                    stackOut_144_2 = 0;
                    stackIn_145_0 = stackOut_144_0;
                    stackIn_145_1 = stackOut_144_1;
                    stackIn_145_2 = stackOut_144_2;
                    statePc = 145;
                    continue stateLoop;
                }
                case 145: {
                    ((rk) (Object) stackIn_145_0).field_Nb = stackIn_145_1 & stackIn_145_2 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 137;
                    } else {
                        statePc = 146;
                    }
                    continue stateLoop;
                }
                case 146: {
                    if (var26 == 0) {
                        statePc = 155;
                    } else {
                        statePc = 147;
                    }
                    continue stateLoop;
                }
                case 147: {
                    stackOut_147_0 = ab.field_A[1][1 + var7];
                    stackOut_147_1 = 0;
                    stackOut_147_2 = rh.field_d[var7 / 8];
                    stackOut_147_3 = 1 << (var7 & 7);
                    stackIn_148_0 = stackOut_147_0;
                    stackIn_148_1 = stackOut_147_1;
                    stackIn_148_2 = stackOut_147_2;
                    stackIn_148_3 = stackOut_147_3;
                    statePc = 148;
                    continue stateLoop;
                }
                case 148: {
                    stackOut_148_0 = (rk) (Object) stackIn_148_0;
                    stackOut_148_1 = stackIn_148_1;
                    stackOut_148_2 = stackIn_148_2;
                    stackOut_148_3 = stackIn_148_3;
                    stackIn_150_0 = stackOut_148_0;
                    stackIn_150_1 = stackOut_148_1;
                    stackIn_150_2 = stackOut_148_2;
                    stackIn_150_3 = stackOut_148_3;
                    statePc = 150;
                    continue stateLoop;
                }
                case 150: {
                    stackOut_150_0 = (rk) (Object) stackIn_150_0;
                    stackIn_153_0 = stackOut_150_0;
                    stackIn_151_0 = stackOut_150_0;
                    if (stackIn_150_1 == (stackIn_150_2 & stackIn_150_3)) {
                        statePc = 153;
                    } else {
                        statePc = 151;
                    }
                    continue stateLoop;
                }
                case 151: {
                    stackOut_151_0 = (rk) (Object) stackIn_151_0;
                    stackOut_151_1 = 1;
                    stackIn_154_0 = stackOut_151_0;
                    stackIn_154_1 = stackOut_151_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 153: {
                    stackOut_153_0 = (rk) (Object) stackIn_153_0;
                    stackOut_153_1 = 0;
                    stackIn_154_0 = stackOut_153_0;
                    stackIn_154_1 = stackOut_153_1;
                    statePc = 154;
                    continue stateLoop;
                }
                case 154: {
                    ((rk) (Object) stackIn_154_0).field_Nb = stackIn_154_1 != 0;
                    statePc = 155;
                    continue stateLoop;
                }
                case 155: {
                    stackOut_155_0 = ab.field_A[1][var7 - -1];
                    stackIn_162_0 = stackOut_155_0;
                    stackIn_156_0 = stackOut_155_0;
                    if (var4_int == 0) {
                        statePc = 162;
                    } else {
                        statePc = 156;
                    }
                    continue stateLoop;
                }
                case 156: {
                    stackOut_156_0 = (rk) (Object) stackIn_156_0;
                    stackOut_156_1 = var8_int;
                    stackIn_157_0 = stackOut_156_0;
                    stackIn_157_1 = stackOut_156_1;
                    statePc = 157;
                    continue stateLoop;
                }
                case 157: {
                    stackOut_157_0 = (rk) (Object) stackIn_157_0;
                    stackIn_162_0 = stackOut_157_0;
                    stackIn_158_0 = stackOut_157_0;
                    if (stackIn_157_1 != 0) {
                        statePc = 162;
                    } else {
                        statePc = 158;
                    }
                    continue stateLoop;
                }
                case 158: {
                    stackOut_158_0 = (rk) (Object) stackIn_158_0;
                    stackIn_160_0 = stackOut_158_0;
                    statePc = 160;
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = (rk) (Object) stackIn_160_0;
                    stackOut_160_1 = 1;
                    stackIn_163_0 = stackOut_160_0;
                    stackIn_163_1 = stackOut_160_1;
                    statePc = 163;
                    continue stateLoop;
                }
                case 162: {
                    stackOut_162_0 = (rk) (Object) stackIn_162_0;
                    stackOut_162_1 = 0;
                    stackIn_163_0 = stackOut_162_0;
                    stackIn_163_1 = stackOut_162_1;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    ((rk) (Object) stackIn_163_0).field_eb = stackIn_163_1 != 0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 89;
                    } else {
                        statePc = 164;
                    }
                    continue stateLoop;
                }
                case 164: {
                    stackOut_164_0 = param2;
                    stackIn_165_0 = stackOut_164_0 ? 1 : 0;
                    statePc = 165;
                    continue stateLoop;
                }
                case 165: {
                    if (stackIn_165_0 == 0) {
                        statePc = 168;
                    } else {
                        statePc = 166;
                    }
                    continue stateLoop;
                }
                case 166: {
                    stackOut_166_0 = 0;
                    stackIn_169_0 = stackOut_166_0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 168: {
                    stackOut_168_0 = 1;
                    stackIn_169_0 = stackOut_168_0;
                    statePc = 169;
                    continue stateLoop;
                }
                case 169: {
                    var6 = stackIn_169_0;
                    statePc = 170;
                    continue stateLoop;
                }
                case 170: {
                    if (var6 >= 3) {
                        statePc = 223;
                    } else {
                        statePc = 171;
                    }
                    continue stateLoop;
                }
                case 171: {
                    var7_ref_rk = ab.field_A[2][var6];
                    statePc = 172;
                    continue stateLoop;
                }
                case 172: {
                    stackOut_172_0 = var4_int;
                    stackIn_224_0 = stackOut_172_0;
                    stackIn_173_0 = stackOut_172_0;
                    if (var26 != 0) {
                        statePc = 224;
                    } else {
                        statePc = 173;
                    }
                    continue stateLoop;
                }
                case 173: {
                    if (stackIn_173_0 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 176;
                    }
                    continue stateLoop;
                }
                case 176: {
                    stackOut_176_0 = 0;
                    stackIn_177_0 = stackOut_176_0;
                    statePc = 177;
                    continue stateLoop;
                }
                case 177: {
                    if (stackIn_177_0 != var7_ref_rk.field_L) {
                        statePc = 182;
                    } else {
                        statePc = 197;
                    }
                    continue stateLoop;
                }
                case 182: {
                    if (param2) {
                        statePc = 188;
                    } else {
                        statePc = 183;
                    }
                    continue stateLoop;
                }
                case 183: {
                    if (param1.field_wc == var6) {
                        statePc = 197;
                    } else {
                        statePc = 186;
                    }
                    continue stateLoop;
                }
                case 186: {
                    var5 = 1;
                    statePc = 187;
                    continue stateLoop;
                }
                case 187: {
                    param1.field_wc = var6;
                    if (var26 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 188;
                    }
                    continue stateLoop;
                }
                case 188: {
                    if (var6 == 0) {
                        statePc = 194;
                    } else {
                        statePc = 191;
                    }
                    continue stateLoop;
                }
                case 191: {
                    mf.field_c = mf.field_c ^ var6;
                    if (var26 == 0) {
                        statePc = 197;
                    } else {
                        statePc = 194;
                    }
                    continue stateLoop;
                }
                case 194: {
                    mf.field_c = 0;
                    statePc = 197;
                    continue stateLoop;
                }
                case 197: {
                    var7_ref_rk.field_eb = var4_int != 0;
                    if (param2) {
                        statePc = 205;
                    } else {
                        statePc = 198;
                    }
                    continue stateLoop;
                }
                case 198: {
                    stackOut_198_0 = (rk) var7_ref_rk;
                    stackIn_203_0 = stackOut_198_0;
                    stackIn_199_0 = stackOut_198_0;
                    if ((param1.field_wc & var6) == 0) {
                        statePc = 203;
                    } else {
                        statePc = 199;
                    }
                    continue stateLoop;
                }
                case 199: {
                    stackOut_199_0 = (rk) (Object) stackIn_199_0;
                    stackIn_201_0 = stackOut_199_0;
                    statePc = 201;
                    continue stateLoop;
                }
                case 201: {
                    stackOut_201_0 = (rk) (Object) stackIn_201_0;
                    stackOut_201_1 = 1;
                    stackIn_204_0 = stackOut_201_0;
                    stackIn_204_1 = stackOut_201_1;
                    statePc = 204;
                    continue stateLoop;
                }
                case 203: {
                    stackOut_203_0 = (rk) (Object) stackIn_203_0;
                    stackOut_203_1 = 0;
                    stackIn_204_0 = stackOut_203_0;
                    stackIn_204_1 = stackOut_203_1;
                    statePc = 204;
                    continue stateLoop;
                }
                case 204: {
                    ((rk) (Object) stackIn_204_0).field_Nb = stackIn_204_1 != 0;
                    if (var26 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 205;
                    }
                    continue stateLoop;
                }
                case 205: {
                    if (0 != var6) {
                        statePc = 215;
                    } else {
                        statePc = 208;
                    }
                    continue stateLoop;
                }
                case 208: {
                    stackOut_208_0 = (rk) var7_ref_rk;
                    stackIn_213_0 = stackOut_208_0;
                    stackIn_209_0 = stackOut_208_0;
                    if (-1 != (mf.field_c ^ -1)) {
                        statePc = 213;
                    } else {
                        statePc = 209;
                    }
                    continue stateLoop;
                }
                case 209: {
                    stackOut_209_0 = (rk) (Object) stackIn_209_0;
                    stackIn_211_0 = stackOut_209_0;
                    statePc = 211;
                    continue stateLoop;
                }
                case 211: {
                    stackOut_211_0 = (rk) (Object) stackIn_211_0;
                    stackOut_211_1 = 1;
                    stackIn_214_0 = stackOut_211_0;
                    stackIn_214_1 = stackOut_211_1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 213: {
                    stackOut_213_0 = (rk) (Object) stackIn_213_0;
                    stackOut_213_1 = 0;
                    stackIn_214_0 = stackOut_213_0;
                    stackIn_214_1 = stackOut_213_1;
                    statePc = 214;
                    continue stateLoop;
                }
                case 214: {
                    ((rk) (Object) stackIn_214_0).field_Nb = stackIn_214_1 != 0;
                    if (var26 == 0) {
                        statePc = 222;
                    } else {
                        statePc = 215;
                    }
                    continue stateLoop;
                }
                case 215: {
                    stackOut_215_0 = (rk) var7_ref_rk;
                    stackIn_220_0 = stackOut_215_0;
                    stackIn_216_0 = stackOut_215_0;
                    if (0 == (mf.field_c & var6)) {
                        statePc = 220;
                    } else {
                        statePc = 216;
                    }
                    continue stateLoop;
                }
                case 216: {
                    stackOut_216_0 = (rk) (Object) stackIn_216_0;
                    stackIn_218_0 = stackOut_216_0;
                    statePc = 218;
                    continue stateLoop;
                }
                case 218: {
                    stackOut_218_0 = (rk) (Object) stackIn_218_0;
                    stackOut_218_1 = 1;
                    stackIn_221_0 = stackOut_218_0;
                    stackIn_221_1 = stackOut_218_1;
                    statePc = 221;
                    continue stateLoop;
                }
                case 220: {
                    stackOut_220_0 = (rk) (Object) stackIn_220_0;
                    stackOut_220_1 = 0;
                    stackIn_221_0 = stackOut_220_0;
                    stackIn_221_1 = stackOut_220_1;
                    statePc = 221;
                    continue stateLoop;
                }
                case 221: {
                    ((rk) (Object) stackIn_221_0).field_Nb = stackIn_221_1 != 0;
                    statePc = 222;
                    continue stateLoop;
                }
                case 222: {
                    var6++;
                    if (var26 == 0) {
                        statePc = 170;
                    } else {
                        statePc = 223;
                    }
                    continue stateLoop;
                }
                case 223: {
                    stackOut_223_0 = param2;
                    stackIn_224_0 = stackOut_223_0 ? 1 : 0;
                    statePc = 224;
                    continue stateLoop;
                }
                case 224: {
                    if (stackIn_224_0 == 0) {
                        statePc = 266;
                    } else {
                        statePc = 225;
                    }
                    continue stateLoop;
                }
                case 225: {
                    stackOut_225_0 = pe.field_t;
                    stackIn_226_0 = stackOut_225_0;
                    statePc = 226;
                    continue stateLoop;
                }
                case 226: {
                    if ((stackIn_226_0 ^ -1) < -2) {
                        statePc = 231;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 231: {
                    var6 = 0;
                    statePc = 232;
                    continue stateLoop;
                }
                case 232: {
                    if ((var6 ^ -1) <= (pe.field_t - -1 ^ -1)) {
                        statePc = 266;
                    } else {
                        statePc = 233;
                    }
                    continue stateLoop;
                }
                case 233: {
                    var7_ref_rk = ab.field_A[3][var6];
                    statePc = 234;
                    continue stateLoop;
                }
                case 234: {
                    stackOut_234_0 = var4_int;
                    stackIn_267_0 = stackOut_234_0;
                    stackIn_235_0 = stackOut_234_0;
                    if (var26 != 0) {
                        statePc = 267;
                    } else {
                        statePc = 235;
                    }
                    continue stateLoop;
                }
                case 235: {
                    if (stackIn_235_0 == 0) {
                        statePc = 245;
                    } else {
                        statePc = 238;
                    }
                    continue stateLoop;
                }
                case 238: {
                    stackOut_238_0 = (rk) var7_ref_rk;
                    stackIn_239_0 = stackOut_238_0;
                    statePc = 239;
                    continue stateLoop;
                }
                case 239: {
                    if (((rk) (Object) stackIn_239_0).field_L == 0) {
                        statePc = 245;
                    } else {
                        statePc = 242;
                    }
                    continue stateLoop;
                }
                case 242: {
                    bb.field_e = var6;
                    statePc = 245;
                    continue stateLoop;
                }
                case 245: {
                    if (!var7_ref_rk.field_G) {
                        statePc = 261;
                    } else {
                        statePc = 246;
                    }
                    continue stateLoop;
                }
                case 246: {
                    stackOut_246_0 = var6;
                    stackIn_247_0 = stackOut_246_0;
                    statePc = 247;
                    continue stateLoop;
                }
                case 247: {
                    if (stackIn_247_0 <= 0) {
                        statePc = 261;
                    } else {
                        statePc = 250;
                    }
                    continue stateLoop;
                }
                case 250: {
                    if (null != th.field_a) {
                        statePc = 255;
                    } else {
                        statePc = 253;
                    }
                    continue stateLoop;
                }
                case 253: {
                    stackOut_253_0 = null;
                    stackIn_256_0 = (String) (Object) stackOut_253_0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 255: {
                    stackOut_255_0 = th.field_a[-1 + var6];
                    stackIn_256_0 = stackOut_255_0;
                    statePc = 256;
                    continue stateLoop;
                }
                case 256: {
                    var8_ref2 = (String) (Object) stackIn_256_0;
                    statePc = 257;
                    continue stateLoop;
                }
                case 257: {
                    if (var8_ref2 == null) {
                        statePc = 261;
                    } else {
                        statePc = 258;
                    }
                    continue stateLoop;
                }
                case 258: {
                    ep.field_e = var8_ref2;
                    statePc = 261;
                    continue stateLoop;
                }
                case 261: {
                    stackOut_261_0 = (rk) var7_ref_rk;
                    stackIn_264_0 = stackOut_261_0;
                    stackIn_262_0 = stackOut_261_0;
                    if (bb.field_e != var6) {
                        statePc = 264;
                    } else {
                        statePc = 262;
                    }
                    continue stateLoop;
                }
                case 262: {
                    stackOut_262_0 = (rk) (Object) stackIn_262_0;
                    stackOut_262_1 = 1;
                    stackIn_265_0 = stackOut_262_0;
                    stackIn_265_1 = stackOut_262_1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 264: {
                    stackOut_264_0 = (rk) (Object) stackIn_264_0;
                    stackOut_264_1 = 0;
                    stackIn_265_0 = stackOut_264_0;
                    stackIn_265_1 = stackOut_264_1;
                    statePc = 265;
                    continue stateLoop;
                }
                case 265: {
                    ((rk) (Object) stackIn_265_0).field_Nb = stackIn_265_1 != 0;
                    var7_ref_rk.field_eb = var4_int != 0;
                    var6++;
                    if (var26 == 0) {
                        statePc = 232;
                    } else {
                        statePc = 266;
                    }
                    continue stateLoop;
                }
                case 266: {
                    var6 = 0;
                    stackOut_266_0 = 0;
                    stackIn_267_0 = stackOut_266_0;
                    statePc = 267;
                    continue stateLoop;
                }
                case 267: {
                    var7 = stackIn_267_0;
                    statePc = 268;
                    continue stateLoop;
                }
                case 268: {
                    if (cq.field_p <= var7) {
                        statePc = 629;
                    } else {
                        statePc = 269;
                    }
                    continue stateLoop;
                }
                case 269: {
                    var8 = ab.field_A[var7 + 4];
                    statePc = 270;
                    continue stateLoop;
                }
                case 270: {
                    stackOut_270_0 = param2;
                    stackIn_630_0 = stackOut_270_0 ? 1 : 0;
                    stackIn_271_0 = stackOut_270_0;
                    if (var26 != 0) {
                        statePc = 630;
                    } else {
                        statePc = 271;
                    }
                    continue stateLoop;
                }
                case 271: {
                    if (stackIn_271_0) {
                        statePc = 276;
                    } else {
                        statePc = 274;
                    }
                    continue stateLoop;
                }
                case 274: {
                    stackOut_274_0 = 0;
                    stackIn_277_0 = stackOut_274_0;
                    statePc = 277;
                    continue stateLoop;
                }
                case 276: {
                    stackOut_276_0 = -1;
                    stackIn_277_0 = stackOut_276_0;
                    statePc = 277;
                    continue stateLoop;
                }
                case 277: {
                    var9 = stackIn_277_0;
                    statePc = 278;
                    continue stateLoop;
                }
                case 278: {
                    if (var9 >= var8.length + -1) {
                        statePc = 627;
                    } else {
                        statePc = 279;
                    }
                    continue stateLoop;
                }
                case 279: {
                    var10 = 0;
                    var11 = 0;
                    var12 = 0;
                    var13 = 0;
                    var14 = 0;
                    var15 = 0;
                    statePc = 280;
                    continue stateLoop;
                }
                case 280: {
                    stackOut_280_0 = var4_int;
                    stackIn_628_0 = stackOut_280_0;
                    stackIn_281_0 = stackOut_280_0;
                    if (var26 != 0) {
                        statePc = 628;
                    } else {
                        statePc = 281;
                    }
                    continue stateLoop;
                }
                case 281: {
                    if (stackIn_281_0 == 0) {
                        statePc = 383;
                    } else {
                        statePc = 284;
                    }
                    continue stateLoop;
                }
                case 284: {
                    stackOut_284_0 = -1;
                    stackIn_285_0 = stackOut_284_0;
                    statePc = 285;
                    continue stateLoop;
                }
                case 285: {
                    if (stackIn_285_0 >= (var9 ^ -1)) {
                        statePc = 290;
                    } else {
                        statePc = 383;
                    }
                    continue stateLoop;
                }
                case 290: {
                    if (null == me.field_e) {
                        statePc = 301;
                    } else {
                        statePc = 291;
                    }
                    continue stateLoop;
                }
                case 291: {
                    stackOut_291_0 = me.field_e;
                    stackIn_292_0 = stackOut_291_0;
                    statePc = 292;
                    continue stateLoop;
                }
                case 292: {
                    if (stackIn_292_0[var7] != null) {
                        statePc = 297;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 297: {
                    if (0 < (me.field_e[var7][var9] & (qn.field_f ^ -1))) {
                        statePc = 300;
                    } else {
                        statePc = 301;
                    }
                    continue stateLoop;
                }
                case 300: {
                    var15 = r.a((byte) -82, me.field_e[var7][var9] & (qn.field_f ^ -1));
                    var14 = 1;
                    statePc = 301;
                    continue stateLoop;
                }
                case 301: {
                    if (null == vl.field_a) {
                        statePc = 316;
                    } else {
                        statePc = 302;
                    }
                    continue stateLoop;
                }
                case 302: {
                    stackOut_302_0 = vl.field_a;
                    stackIn_303_0 = stackOut_302_0;
                    statePc = 303;
                    continue stateLoop;
                }
                case 303: {
                    if (stackIn_303_0[var7] != null) {
                        statePc = 308;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 308: {
                    if (0 < go.field_c) {
                        statePc = 316;
                    } else {
                        statePc = 309;
                    }
                    continue stateLoop;
                }
                case 309: {
                    stackOut_309_0 = vl.field_a;
                    stackIn_310_0 = stackOut_309_0;
                    statePc = 310;
                    continue stateLoop;
                }
                case 310: {
                    if (stackIn_310_0[var7][var9]) {
                        statePc = 315;
                    } else {
                        statePc = 316;
                    }
                    continue stateLoop;
                }
                case 315: {
                    var10 = 1;
                    statePc = 316;
                    continue stateLoop;
                }
                case 316: {
                    if (null == bl.field_F) {
                        statePc = 344;
                    } else {
                        statePc = 317;
                    }
                    continue stateLoop;
                }
                case 317: {
                    stackOut_317_0 = bl.field_F;
                    stackIn_318_0 = stackOut_317_0;
                    statePc = 318;
                    continue stateLoop;
                }
                case 318: {
                    if (stackIn_318_0[var7] != null) {
                        statePc = 323;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 323: {
                    var16 = bl.field_F[var7][var9];
                    statePc = 324;
                    continue stateLoop;
                }
                case 324: {
                    if (-1 == (var16 ^ -1)) {
                        statePc = 336;
                    } else {
                        statePc = 325;
                    }
                    continue stateLoop;
                }
                case 325: {
                    stackOut_325_0 = ea.field_g;
                    stackIn_326_0 = stackOut_325_0;
                    statePc = 326;
                    continue stateLoop;
                }
                case 326: {
                    if (stackIn_326_0) {
                        statePc = 336;
                    } else {
                        statePc = 329;
                    }
                    continue stateLoop;
                }
                case 329: {
                    stackOut_329_0 = -1;
                    stackIn_330_0 = stackOut_329_0;
                    statePc = 330;
                    continue stateLoop;
                }
                case 330: {
                    if (stackIn_330_0 <= (go.field_c ^ -1)) {
                        statePc = 335;
                    } else {
                        statePc = 336;
                    }
                    continue stateLoop;
                }
                case 335: {
                    var10 = 1;
                    statePc = 336;
                    continue stateLoop;
                }
                case 336: {
                    if (0 >= var16) {
                        statePc = 344;
                    } else {
                        statePc = 337;
                    }
                    continue stateLoop;
                }
                case 337: {
                    stackOut_337_0 = var16;
                    stackIn_338_0 = stackOut_337_0;
                    statePc = 338;
                    continue stateLoop;
                }
                case 338: {
                    if (stackIn_338_0 > m.field_h) {
                        statePc = 343;
                    } else {
                        statePc = 344;
                    }
                    continue stateLoop;
                }
                case 343: {
                    var12 = 1;
                    statePc = 344;
                    continue stateLoop;
                }
                case 344: {
                    if (null == ld.field_v) {
                        statePc = 366;
                    } else {
                        statePc = 345;
                    }
                    continue stateLoop;
                }
                case 345: {
                    if (ld.field_v[var7] == null) {
                        statePc = 366;
                    } else {
                        statePc = 348;
                    }
                    continue stateLoop;
                }
                case 348: {
                    var16 = ld.field_v[var7][var9];
                    statePc = 349;
                    continue stateLoop;
                }
                case 349: {
                    if (0 >= var16) {
                        statePc = 354;
                    } else {
                        statePc = 350;
                    }
                    continue stateLoop;
                }
                case 350: {
                    if ((ko.field_s ^ -1) <= (var16 ^ -1)) {
                        statePc = 354;
                    } else {
                        statePc = 353;
                    }
                    continue stateLoop;
                }
                case 353: {
                    var11 = 1;
                    statePc = 354;
                    continue stateLoop;
                }
                case 354: {
                    if (0 == var16) {
                        statePc = 366;
                    } else {
                        statePc = 355;
                    }
                    continue stateLoop;
                }
                case 355: {
                    stackOut_355_0 = ea.field_g;
                    stackIn_356_0 = stackOut_355_0;
                    statePc = 356;
                    continue stateLoop;
                }
                case 356: {
                    if (stackIn_356_0) {
                        statePc = 366;
                    } else {
                        statePc = 359;
                    }
                    continue stateLoop;
                }
                case 359: {
                    stackOut_359_0 = 0;
                    stackIn_360_0 = stackOut_359_0;
                    statePc = 360;
                    continue stateLoop;
                }
                case 360: {
                    if (stackIn_360_0 >= go.field_c) {
                        statePc = 365;
                    } else {
                        statePc = 366;
                    }
                    continue stateLoop;
                }
                case 365: {
                    var10 = 1;
                    statePc = 366;
                    continue stateLoop;
                }
                case 366: {
                    if (!param2) {
                        statePc = 381;
                    } else {
                        statePc = 367;
                    }
                    continue stateLoop;
                }
                case 367: {
                    stackOut_367_0 = ee.field_r;
                    stackIn_368_0 = stackOut_367_0;
                    statePc = 368;
                    continue stateLoop;
                }
                case 368: {
                    if (stackIn_368_0 == null) {
                        statePc = 381;
                    } else {
                        statePc = 371;
                    }
                    continue stateLoop;
                }
                case 371: {
                    stackOut_371_0 = null;
                    stackIn_372_0 = stackOut_371_0;
                    statePc = 372;
                    continue stateLoop;
                }
                case 372: {
                    if ((Object) (Object) stackIn_372_0 == (Object) (Object) ee.field_r[var7]) {
                        statePc = 381;
                    } else {
                        statePc = 375;
                    }
                    continue stateLoop;
                }
                case 375: {
                    stackOut_375_0 = ee.field_r;
                    stackIn_376_0 = stackOut_375_0;
                    statePc = 376;
                    continue stateLoop;
                }
                case 376: {
                    if (!stackIn_376_0[var7][var9]) {
                        statePc = 381;
                    } else {
                        statePc = 379;
                    }
                    continue stateLoop;
                }
                case 379: {
                    stackOut_379_0 = 1;
                    stackIn_382_0 = stackOut_379_0;
                    statePc = 382;
                    continue stateLoop;
                }
                case 381: {
                    stackOut_381_0 = 0;
                    stackIn_382_0 = stackOut_381_0;
                    statePc = 382;
                    continue stateLoop;
                }
                case 382: {
                    var13 = stackIn_382_0;
                    statePc = 383;
                    continue stateLoop;
                }
                case 383: {
                    if (-3 < (kb.field_Yb ^ -1)) {
                        statePc = 388;
                    } else {
                        statePc = 384;
                    }
                    continue stateLoop;
                }
                case 384: {
                    if (!pe.field_l[12]) {
                        statePc = 388;
                    } else {
                        statePc = 387;
                    }
                    continue stateLoop;
                }
                case 387: {
                    var11 = 0;
                    var12 = 0;
                    var10 = 0;
                    var13 = 0;
                    var14 = 0;
                    statePc = 388;
                    continue stateLoop;
                }
                case 388: {
                    if (var10 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 389;
                    }
                    continue stateLoop;
                }
                case 389: {
                    stackOut_389_0 = var11;
                    stackIn_390_0 = stackOut_389_0;
                    statePc = 390;
                    continue stateLoop;
                }
                case 390: {
                    if (stackIn_390_0 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 393;
                    }
                    continue stateLoop;
                }
                case 393: {
                    stackOut_393_0 = var12;
                    stackIn_394_0 = stackOut_393_0;
                    statePc = 394;
                    continue stateLoop;
                }
                case 394: {
                    if (stackIn_394_0 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 397;
                    }
                    continue stateLoop;
                }
                case 397: {
                    stackOut_397_0 = var13;
                    stackIn_398_0 = stackOut_397_0;
                    statePc = 398;
                    continue stateLoop;
                }
                case 398: {
                    if (stackIn_398_0 != 0) {
                        statePc = 405;
                    } else {
                        statePc = 401;
                    }
                    continue stateLoop;
                }
                case 401: {
                    stackOut_401_0 = var14;
                    stackIn_402_0 = stackOut_401_0;
                    statePc = 402;
                    continue stateLoop;
                }
                case 402: {
                    if (stackIn_402_0 == 0) {
                        statePc = 407;
                    } else {
                        statePc = 405;
                    }
                    continue stateLoop;
                }
                case 405: {
                    stackOut_405_0 = 1;
                    stackIn_408_0 = stackOut_405_0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 407: {
                    stackOut_407_0 = 0;
                    stackIn_408_0 = stackOut_407_0;
                    statePc = 408;
                    continue stateLoop;
                }
                case 408: {
                    var16 = stackIn_408_0;
                    statePc = 409;
                    continue stateLoop;
                }
                case 409: {
                    dc.field_g = true;
                    if (var16 != 0) {
                        statePc = 449;
                    } else {
                        statePc = 410;
                    }
                    continue stateLoop;
                }
                case 410: {
                    stackOut_410_0 = -1;
                    stackIn_411_0 = stackOut_410_0;
                    statePc = 411;
                    continue stateLoop;
                }
                case 411: {
                    if (stackIn_411_0 < (var9 ^ -1)) {
                        statePc = 449;
                    } else {
                        statePc = 414;
                    }
                    continue stateLoop;
                }
                case 414: {
                    stackOut_414_0 = br.field_bc;
                    stackIn_415_0 = stackOut_414_0;
                    statePc = 415;
                    continue stateLoop;
                }
                case 415: {
                    if (stackIn_415_0 == null) {
                        statePc = 449;
                    } else {
                        statePc = 418;
                    }
                    continue stateLoop;
                }
                case 418: {
                    stackOut_418_0 = param2;
                    stackIn_419_0 = stackOut_418_0;
                    statePc = 419;
                    continue stateLoop;
                }
                case 419: {
                    if (!stackIn_419_0) {
                        statePc = 428;
                    } else {
                        statePc = 422;
                    }
                    continue stateLoop;
                }
                case 422: {
                    stackOut_422_0 = fh.field_d;
                    stackIn_423_0 = stackOut_422_0;
                    statePc = 423;
                    continue stateLoop;
                }
                case 423: {
                    if (!stackIn_423_0) {
                        statePc = 428;
                    } else {
                        statePc = 449;
                    }
                    continue stateLoop;
                }
                case 428: {
                    if (qo.field_J != null) {
                        statePc = 432;
                    } else {
                        statePc = 429;
                    }
                    continue stateLoop;
                }
                case 429: {
                    h.field_D = new boolean[cq.field_p];
                    qo.field_J = new byte[cq.field_p];
                    statePc = 432;
                    continue stateLoop;
                }
                case 432: {
                    dc.field_g = false;
                    lk.field_s = false;
                    var17_int = 0;
                    statePc = 433;
                    continue stateLoop;
                }
                case 433: {
                    if ((var7 ^ -1) >= (var17_int ^ -1)) {
                        statePc = 438;
                    } else {
                        statePc = 434;
                    }
                    continue stateLoop;
                }
                case 434: {
                    h.field_D[var17_int] = false;
                    var17_int++;
                    if (var26 != 0) {
                        statePc = 439;
                    } else {
                        statePc = 435;
                    }
                    continue stateLoop;
                }
                case 435: {
                    if (var26 == 0) {
                        statePc = 433;
                    } else {
                        statePc = 438;
                    }
                    continue stateLoop;
                }
                case 438: {
                    ar.a(param2, param1, var9, -1, -1, 0, var7, 0);
                    statePc = 439;
                    continue stateLoop;
                }
                case 439: {
                    if (2 > kb.field_Yb) {
                        statePc = 447;
                    } else {
                        statePc = 440;
                    }
                    continue stateLoop;
                }
                case 440: {
                    stackOut_440_0 = pe.field_l;
                    stackIn_441_0 = stackOut_440_0;
                    statePc = 441;
                    continue stateLoop;
                }
                case 441: {
                    if (stackIn_441_0[12]) {
                        statePc = 446;
                    } else {
                        statePc = 447;
                    }
                    continue stateLoop;
                }
                case 446: {
                    dc.field_g = true;
                    statePc = 447;
                    continue stateLoop;
                }
                case 447: {
                    if (dc.field_g) {
                        statePc = 449;
                    } else {
                        statePc = 448;
                    }
                    continue stateLoop;
                }
                case 448: {
                    var16 = 1;
                    statePc = 449;
                    continue stateLoop;
                }
                case 449: {
                    var17 = var8[var9 - -1];
                    statePc = 450;
                    continue stateLoop;
                }
                case 450: {
                    if (var4_int == 0) {
                        statePc = 478;
                    } else {
                        statePc = 451;
                    }
                    continue stateLoop;
                }
                case 451: {
                    stackOut_451_0 = 0;
                    stackIn_452_0 = stackOut_451_0;
                    statePc = 452;
                    continue stateLoop;
                }
                case 452: {
                    if (stackIn_452_0 == var17.field_L) {
                        statePc = 478;
                    } else {
                        statePc = 455;
                    }
                    continue stateLoop;
                }
                case 455: {
                    if (!param2) {
                        statePc = 471;
                    } else {
                        statePc = 458;
                    }
                    continue stateLoop;
                }
                case 458: {
                    if (-1 != var9) {
                        statePc = 468;
                    } else {
                        statePc = 461;
                    }
                    continue stateLoop;
                }
                case 461: {
                    var18 = var6;
                    statePc = 462;
                    continue stateLoop;
                }
                case 462: {
                    if ((-1 + (var6 + var8.length) ^ -1) >= (var18 ^ -1)) {
                        statePc = 467;
                    } else {
                        statePc = 463;
                    }
                    continue stateLoop;
                }
                case 463: {
                    lj.field_p[var18 / 8] = (byte)ik.a((int) lj.field_p[var18 / 8], 1 << ik.a(7, var18) ^ -1);
                    var18++;
                    if (var26 != 0) {
                        statePc = 478;
                    } else {
                        statePc = 464;
                    }
                    continue stateLoop;
                }
                case 464: {
                    if (var26 == 0) {
                        statePc = 462;
                    } else {
                        statePc = 467;
                    }
                    continue stateLoop;
                }
                case 467: {
                    if (var26 == 0) {
                        statePc = 478;
                    } else {
                        statePc = 468;
                    }
                    continue stateLoop;
                }
                case 468: {
                    lj.field_p[(var9 + var6) / 8] = (byte)pn.a((int) lj.field_p[(var9 + var6) / 8], 1 << ik.a(7, var6 + var9));
                    if (var26 == 0) {
                        statePc = 478;
                    } else {
                        statePc = 471;
                    }
                    continue stateLoop;
                }
                case 471: {
                    if (var16 != 0) {
                        statePc = 478;
                    } else {
                        statePc = 474;
                    }
                    continue stateLoop;
                }
                case 474: {
                    if (param1.field_Tb[var7] == (byte)var9) {
                        statePc = 478;
                    } else {
                        statePc = 477;
                    }
                    continue stateLoop;
                }
                case 477: {
                    var5 = 1;
                    param1.field_Tb[var7] = (byte)var9;
                    statePc = 478;
                    continue stateLoop;
                }
                case 478: {
                    if (!param2) {
                        statePc = 486;
                    } else {
                        statePc = 479;
                    }
                    continue stateLoop;
                }
                case 479: {
                    stackOut_479_0 = var16;
                    stackIn_480_0 = stackOut_479_0;
                    statePc = 480;
                    continue stateLoop;
                }
                case 480: {
                    if (stackIn_480_0 != 0) {
                        statePc = 485;
                    } else {
                        statePc = 486;
                    }
                    continue stateLoop;
                }
                case 485: {
                    lj.field_p[(var9 + var6) / 8] = (byte)ik.a((int) lj.field_p[(var9 + var6) / 8], 1 << ik.a(var9 + var6, 7) ^ -1);
                    statePc = 486;
                    continue stateLoop;
                }
                case 486: {
                    if (-1 < (var9 ^ -1)) {
                        statePc = 586;
                    } else {
                        statePc = 487;
                    }
                    continue stateLoop;
                }
                case 487: {
                    stackOut_487_0 = (rk) var17;
                    stackIn_488_0 = stackOut_487_0;
                    statePc = 488;
                    continue stateLoop;
                }
                case 488: {
                    if (((rk) (Object) stackIn_488_0).field_G) {
                        statePc = 493;
                    } else {
                        statePc = 586;
                    }
                    continue stateLoop;
                }
                case 493: {
                    if (null == mk.field_c) {
                        statePc = 501;
                    } else {
                        statePc = 494;
                    }
                    continue stateLoop;
                }
                case 494: {
                    stackOut_494_0 = null;
                    stackIn_495_0 = stackOut_494_0;
                    statePc = 495;
                    continue stateLoop;
                }
                case 495: {
                    if ((Object) (Object) stackIn_495_0 != (Object) (Object) mk.field_c[var7]) {
                        statePc = 500;
                    } else {
                        statePc = 498;
                    }
                    continue stateLoop;
                }
                case 498: {
                    stackOut_498_0 = null;
                    stackIn_502_0 = (String) (Object) stackOut_498_0;
                    statePc = 502;
                    continue stateLoop;
                }
                case 500: {
                    stackOut_500_0 = mk.field_c[var7][var9];
                    stackIn_502_0 = stackOut_500_0;
                    statePc = 502;
                    continue stateLoop;
                }
                case 501: {
                    stackOut_501_0 = null;
                    stackIn_502_0 = (String) (Object) stackOut_501_0;
                    statePc = 502;
                    continue stateLoop;
                }
                case 502: {
                    var18_ref = (String) (Object) stackIn_502_0;
                    statePc = 503;
                    continue stateLoop;
                }
                case 503: {
                    if (ff.field_i == null) {
                        statePc = 511;
                    } else {
                        statePc = 504;
                    }
                    continue stateLoop;
                }
                case 504: {
                    stackOut_504_0 = null;
                    stackIn_505_0 = stackOut_504_0;
                    statePc = 505;
                    continue stateLoop;
                }
                case 505: {
                    if ((Object) (Object) stackIn_505_0 == (Object) (Object) ff.field_i[var7]) {
                        statePc = 510;
                    } else {
                        statePc = 508;
                    }
                    continue stateLoop;
                }
                case 508: {
                    stackOut_508_0 = ff.field_i[var7][var9];
                    stackIn_512_0 = stackOut_508_0;
                    statePc = 512;
                    continue stateLoop;
                }
                case 510: {
                    stackOut_510_0 = null;
                    stackIn_512_0 = (String) (Object) stackOut_510_0;
                    statePc = 512;
                    continue stateLoop;
                }
                case 511: {
                    stackOut_511_0 = null;
                    stackIn_512_0 = (String) (Object) stackOut_511_0;
                    statePc = 512;
                    continue stateLoop;
                }
                case 512: {
                    var19 = (String) (Object) stackIn_512_0;
                    var20 = null;
                    statePc = 513;
                    continue stateLoop;
                }
                case 513: {
                    if (var19 == null) {
                        statePc = 521;
                    } else {
                        statePc = 514;
                    }
                    continue stateLoop;
                }
                case 514: {
                    stackOut_514_0 = (String) var19;
                    stackIn_515_0 = (Object) (Object) stackOut_514_0;
                    statePc = 515;
                    continue stateLoop;
                }
                case 515: {
                    if (!((String) (Object) stackIn_515_0).equals((Object) (Object) var18_ref)) {
                        statePc = 520;
                    } else {
                        statePc = 521;
                    }
                    continue stateLoop;
                }
                case 520: {
                    var20 = var19;
                    statePc = 521;
                    continue stateLoop;
                }
                case 521: {
                    var21 = null;
                    if (var13 == 0) {
                        statePc = 523;
                    } else {
                        statePc = 522;
                    }
                    continue stateLoop;
                }
                case 522: {
                    var21 = fe.field_ib;
                    statePc = 555;
                    continue stateLoop;
                }
                case 523: {
                    if (var10 == 0) {
                        statePc = 525;
                    } else {
                        statePc = 524;
                    }
                    continue stateLoop;
                }
                case 524: {
                    var21 = wq.field_m;
                    statePc = 555;
                    continue stateLoop;
                }
                case 525: {
                    if (var11 != 0) {
                        statePc = 528;
                    } else {
                        statePc = 531;
                    }
                    continue stateLoop;
                }
                case 528: {
                    var22_int = ld.field_v[var7][var9] - ko.field_s;
                    if ((var22_int ^ -1) != -2) {
                        statePc = 530;
                    } else {
                        statePc = 529;
                    }
                    continue stateLoop;
                }
                case 529: {
                    var21 = ta.field_a;
                    statePc = 531;
                    continue stateLoop;
                }
                case 530: {
                    var21 = rd.a(tq.field_e, new String[1], (byte) 103);
                    statePc = 531;
                    continue stateLoop;
                }
                case 531: {
                    if (var12 == 0) {
                        statePc = 535;
                    } else {
                        statePc = 532;
                    }
                    continue stateLoop;
                }
                case 532: {
                    var22 = rd.a(wd.field_x, new String[2], (byte) 103);
                    if (null != var21) {
                        statePc = 534;
                    } else {
                        statePc = 533;
                    }
                    continue stateLoop;
                }
                case 533: {
                    var21 = var22;
                    if (var26 == 0) {
                        statePc = 535;
                    } else {
                        statePc = 534;
                    }
                    continue stateLoop;
                }
                case 534: {
                    var21 = var21 + "<br>" + var22;
                    statePc = 535;
                    continue stateLoop;
                }
                case 535: {
                    if (var14 != 0) {
                        statePc = 538;
                    } else {
                        statePc = 555;
                    }
                    continue stateLoop;
                }
                case 538: {
                    var22 = md.field_t;
                    statePc = 539;
                    continue stateLoop;
                }
                case 539: {
                    if (-1 <= (var15 ^ -1)) {
                        statePc = 552;
                    } else {
                        statePc = 540;
                    }
                    continue stateLoop;
                }
                case 540: {
                    stackOut_540_0 = eb.field_p;
                    stackIn_541_0 = stackOut_540_0;
                    statePc = 541;
                    continue stateLoop;
                }
                case 541: {
                    if (stackIn_541_0 == null) {
                        statePc = 552;
                    } else {
                        statePc = 544;
                    }
                    continue stateLoop;
                }
                case 544: {
                    stackOut_544_0 = eb.field_p;
                    stackIn_545_0 = stackOut_544_0;
                    statePc = 545;
                    continue stateLoop;
                }
                case 545: {
                    if (stackIn_545_0.length < var15) {
                        statePc = 552;
                    } else {
                        statePc = 548;
                    }
                    continue stateLoop;
                }
                case 548: {
                    if (null == eb.field_p[var15 + -1]) {
                        statePc = 552;
                    } else {
                        statePc = 551;
                    }
                    continue stateLoop;
                }
                case 551: {
                    var22_ref = eb.field_p[-1 + var15][0];
                    statePc = 552;
                    continue stateLoop;
                }
                case 552: {
                    if (null != var21) {
                        statePc = 554;
                    } else {
                        statePc = 553;
                    }
                    continue stateLoop;
                }
                case 553: {
                    var21 = var22_ref;
                    if (var26 == 0) {
                        statePc = 555;
                    } else {
                        statePc = 554;
                    }
                    continue stateLoop;
                }
                case 554: {
                    var21 = var21 + "<br>" + var22_ref;
                    statePc = 555;
                    continue stateLoop;
                }
                case 555: {
                    if (var4_int == 0) {
                        statePc = 578;
                    } else {
                        statePc = 556;
                    }
                    continue stateLoop;
                }
                case 556: {
                    if (dc.field_g) {
                        statePc = 578;
                    } else {
                        statePc = 559;
                    }
                    continue stateLoop;
                }
                case 559: {
                    var22_ref = null;
                    var23 = 0;
                    statePc = 560;
                    continue stateLoop;
                }
                case 560: {
                    if (lk.field_s) {
                        statePc = 563;
                    } else {
                        statePc = 564;
                    }
                    continue stateLoop;
                }
                case 563: {
                    var22 = "</col>" + og.field_ac + "<col=A00000>";
                    statePc = 564;
                    continue stateLoop;
                }
                case 564: {
                    var24 = 0;
                    statePc = 565;
                    continue stateLoop;
                }
                case 565: {
                    if (var24 >= var7) {
                        statePc = 574;
                    } else {
                        statePc = 566;
                    }
                    continue stateLoop;
                }
                case 566: {
                    stackOut_566_0 = h.field_D[var24];
                    stackIn_575_0 = stackOut_566_0 ? 1 : 0;
                    stackIn_567_0 = stackOut_566_0;
                    if (var26 != 0) {
                        statePc = 575;
                    } else {
                        statePc = 567;
                    }
                    continue stateLoop;
                }
                case 567: {
                    if (!stackIn_567_0) {
                        statePc = 573;
                    } else {
                        statePc = 570;
                    }
                    continue stateLoop;
                }
                case 570: {
                    var25 = "</col>" + rg.field_b[var24] + "<col=A00000>";
                    if (null != var22) {
                        statePc = 572;
                    } else {
                        statePc = 571;
                    }
                    continue stateLoop;
                }
                case 571: {
                    var22 = var25;
                    if (var26 == 0) {
                        statePc = 573;
                    } else {
                        statePc = 572;
                    }
                    continue stateLoop;
                }
                case 572: {
                    var22 = var22 + ", " + var25;
                    var23 = 1;
                    statePc = 573;
                    continue stateLoop;
                }
                case 573: {
                    var24++;
                    if (var26 == 0) {
                        statePc = 565;
                    } else {
                        statePc = 574;
                    }
                    continue stateLoop;
                }
                case 574: {
                    stackOut_574_0 = var23;
                    stackIn_575_0 = stackOut_574_0;
                    statePc = 575;
                    continue stateLoop;
                }
                case 575: {
                    if (stackIn_575_0 == 0) {
                        statePc = 577;
                    } else {
                        statePc = 576;
                    }
                    continue stateLoop;
                }
                case 576: {
                    var21 = ve.field_e + var22;
                    if (var26 == 0) {
                        statePc = 578;
                    } else {
                        statePc = 577;
                    }
                    continue stateLoop;
                }
                case 577: {
                    var21 = rd.a(fh.field_b, new String[1], (byte) 103);
                    statePc = 578;
                    continue stateLoop;
                }
                case 578: {
                    if (var21 == null) {
                        statePc = 582;
                    } else {
                        statePc = 579;
                    }
                    continue stateLoop;
                }
                case 579: {
                    var21 = "<col=A00000>" + var21;
                    var21 = tb.a("<br><col=A00000>", var21, true, "<br>");
                    if (var20 == null) {
                        statePc = 581;
                    } else {
                        statePc = 580;
                    }
                    continue stateLoop;
                }
                case 580: {
                    var20 = var20 + "<br>" + var21;
                    if (var26 == 0) {
                        statePc = 582;
                    } else {
                        statePc = 581;
                    }
                    continue stateLoop;
                }
                case 581: {
                    var20 = var21;
                    statePc = 582;
                    continue stateLoop;
                }
                case 582: {
                    if (null == var20) {
                        statePc = 586;
                    } else {
                        statePc = 583;
                    }
                    continue stateLoop;
                }
                case 583: {
                    ep.field_e = var20;
                    statePc = 586;
                    continue stateLoop;
                }
                case 586: {
                    if (!param2) {
                        statePc = 607;
                    } else {
                        statePc = 587;
                    }
                    continue stateLoop;
                }
                case 587: {
                    if (-1 == var9) {
                        statePc = 598;
                    } else {
                        statePc = 590;
                    }
                    continue stateLoop;
                }
                case 590: {
                    stackOut_590_0 = (rk) var17;
                    stackOut_590_1 = 0;
                    stackOut_590_2 = lj.field_p[(var9 + var6) / 8];
                    stackOut_590_3 = 1 << (var9 + var6 & 7);
                    stackIn_591_0 = stackOut_590_0;
                    stackIn_591_1 = stackOut_590_1;
                    stackIn_591_2 = stackOut_590_2;
                    stackIn_591_3 = stackOut_590_3;
                    statePc = 591;
                    continue stateLoop;
                }
                case 591: {
                    stackOut_591_0 = (rk) (Object) stackIn_591_0;
                    stackOut_591_1 = stackIn_591_1;
                    stackOut_591_2 = stackIn_591_2;
                    stackOut_591_3 = stackIn_591_3;
                    stackIn_593_0 = stackOut_591_0;
                    stackIn_593_1 = stackOut_591_1;
                    stackIn_593_2 = stackOut_591_2;
                    stackIn_593_3 = stackOut_591_3;
                    statePc = 593;
                    continue stateLoop;
                }
                case 593: {
                    stackOut_593_0 = (rk) (Object) stackIn_593_0;
                    stackIn_596_0 = stackOut_593_0;
                    stackIn_594_0 = stackOut_593_0;
                    if (stackIn_593_1 == (stackIn_593_2 & stackIn_593_3)) {
                        statePc = 596;
                    } else {
                        statePc = 594;
                    }
                    continue stateLoop;
                }
                case 594: {
                    stackOut_594_0 = (rk) (Object) stackIn_594_0;
                    stackOut_594_1 = 1;
                    stackIn_597_0 = stackOut_594_0;
                    stackIn_597_1 = stackOut_594_1;
                    statePc = 597;
                    continue stateLoop;
                }
                case 596: {
                    stackOut_596_0 = (rk) (Object) stackIn_596_0;
                    stackOut_596_1 = 0;
                    stackIn_597_0 = stackOut_596_0;
                    stackIn_597_1 = stackOut_596_1;
                    statePc = 597;
                    continue stateLoop;
                }
                case 597: {
                    ((rk) (Object) stackIn_597_0).field_Nb = stackIn_597_1 != 0;
                    if (var26 == 0) {
                        statePc = 618;
                    } else {
                        statePc = 598;
                    }
                    continue stateLoop;
                }
                case 598: {
                    var17.field_Nb = true;
                    var18 = var6;
                    statePc = 599;
                    continue stateLoop;
                }
                case 599: {
                    if ((var8.length + var6 + -1 ^ -1) >= (var18 ^ -1)) {
                        statePc = 606;
                    } else {
                        statePc = 600;
                    }
                    continue stateLoop;
                }
                case 600: {
                    stackOut_600_0 = (rk) var17;
                    stackOut_600_1 = var17.field_Nb;
                    stackOut_600_2 = 0;
                    stackOut_600_3 = lj.field_p[var18 / 8] & 1 << (7 & var18);
                    stackIn_593_0 = stackOut_600_0;
                    stackIn_593_1 = stackOut_600_1 ? 1 : 0;
                    stackIn_593_2 = stackOut_600_2;
                    stackIn_593_3 = stackOut_600_3;
                    stackIn_601_0 = stackOut_600_0;
                    stackIn_601_1 = stackOut_600_1;
                    stackIn_601_2 = stackOut_600_2;
                    stackIn_601_3 = stackOut_600_3;
                    if (var26 != 0) {
                        statePc = 593;
                    } else {
                        statePc = 601;
                    }
                    continue stateLoop;
                }
                case 601: {
                    stackOut_601_0 = (rk) (Object) stackIn_601_0;
                    stackOut_601_1 = stackIn_601_1;
                    stackIn_604_0 = stackOut_601_0;
                    stackIn_604_1 = stackOut_601_1;
                    stackIn_602_0 = stackOut_601_0;
                    stackIn_602_1 = stackOut_601_1;
                    if (stackIn_601_2 != stackIn_601_3) {
                        statePc = 604;
                    } else {
                        statePc = 602;
                    }
                    continue stateLoop;
                }
                case 602: {
                    stackOut_602_0 = (rk) (Object) stackIn_602_0;
                    stackOut_602_1 = stackIn_602_1;
                    stackOut_602_2 = 1;
                    stackIn_605_0 = stackOut_602_0;
                    stackIn_605_1 = stackOut_602_1;
                    stackIn_605_2 = stackOut_602_2;
                    statePc = 605;
                    continue stateLoop;
                }
                case 604: {
                    stackOut_604_0 = (rk) (Object) stackIn_604_0;
                    stackOut_604_1 = stackIn_604_1;
                    stackOut_604_2 = 0;
                    stackIn_605_0 = stackOut_604_0;
                    stackIn_605_1 = stackOut_604_1;
                    stackIn_605_2 = stackOut_604_2;
                    statePc = 605;
                    continue stateLoop;
                }
                case 605: {
                    ((rk) (Object) stackIn_605_0).field_Nb = stackIn_605_1 & stackIn_605_2 != 0;
                    var18++;
                    if (var26 == 0) {
                        statePc = 599;
                    } else {
                        statePc = 606;
                    }
                    continue stateLoop;
                }
                case 606: {
                    if (var26 == 0) {
                        statePc = 618;
                    } else {
                        statePc = 607;
                    }
                    continue stateLoop;
                }
                case 607: {
                    stackOut_607_0 = (rk) var17;
                    stackIn_616_0 = stackOut_607_0;
                    stackIn_608_0 = stackOut_607_0;
                    if (!dc.field_g) {
                        statePc = 616;
                    } else {
                        statePc = 608;
                    }
                    continue stateLoop;
                }
                case 608: {
                    stackOut_608_0 = (rk) (Object) stackIn_608_0;
                    stackIn_610_0 = stackOut_608_0;
                    statePc = 610;
                    continue stateLoop;
                }
                case 610: {
                    stackOut_610_0 = (rk) (Object) stackIn_610_0;
                    stackOut_610_1 = var9;
                    stackIn_611_0 = stackOut_610_0;
                    stackIn_611_1 = stackOut_610_1;
                    statePc = 611;
                    continue stateLoop;
                }
                case 611: {
                    stackOut_611_0 = (rk) (Object) stackIn_611_0;
                    stackIn_616_0 = stackOut_611_0;
                    stackIn_612_0 = stackOut_611_0;
                    if ((byte)stackIn_611_1 != param1.field_Tb[var7]) {
                        statePc = 616;
                    } else {
                        statePc = 612;
                    }
                    continue stateLoop;
                }
                case 612: {
                    stackOut_612_0 = (rk) (Object) stackIn_612_0;
                    stackIn_614_0 = stackOut_612_0;
                    statePc = 614;
                    continue stateLoop;
                }
                case 614: {
                    stackOut_614_0 = (rk) (Object) stackIn_614_0;
                    stackOut_614_1 = 1;
                    stackIn_617_0 = stackOut_614_0;
                    stackIn_617_1 = stackOut_614_1;
                    statePc = 617;
                    continue stateLoop;
                }
                case 616: {
                    stackOut_616_0 = (rk) (Object) stackIn_616_0;
                    stackOut_616_1 = 0;
                    stackIn_617_0 = stackOut_616_0;
                    stackIn_617_1 = stackOut_616_1;
                    statePc = 617;
                    continue stateLoop;
                }
                case 617: {
                    ((rk) (Object) stackIn_617_0).field_Nb = stackIn_617_1 != 0;
                    statePc = 618;
                    continue stateLoop;
                }
                case 618: {
                    stackOut_618_0 = (rk) var17;
                    stackIn_625_0 = stackOut_618_0;
                    stackIn_619_0 = stackOut_618_0;
                    if (var4_int == 0) {
                        statePc = 625;
                    } else {
                        statePc = 619;
                    }
                    continue stateLoop;
                }
                case 619: {
                    stackOut_619_0 = (rk) (Object) stackIn_619_0;
                    stackOut_619_1 = var16;
                    stackIn_620_0 = stackOut_619_0;
                    stackIn_620_1 = stackOut_619_1;
                    statePc = 620;
                    continue stateLoop;
                }
                case 620: {
                    stackOut_620_0 = (rk) (Object) stackIn_620_0;
                    stackIn_625_0 = stackOut_620_0;
                    stackIn_621_0 = stackOut_620_0;
                    if (stackIn_620_1 != 0) {
                        statePc = 625;
                    } else {
                        statePc = 621;
                    }
                    continue stateLoop;
                }
                case 621: {
                    stackOut_621_0 = (rk) (Object) stackIn_621_0;
                    stackIn_623_0 = stackOut_621_0;
                    statePc = 623;
                    continue stateLoop;
                }
                case 623: {
                    stackOut_623_0 = (rk) (Object) stackIn_623_0;
                    stackOut_623_1 = 1;
                    stackIn_626_0 = stackOut_623_0;
                    stackIn_626_1 = stackOut_623_1;
                    statePc = 626;
                    continue stateLoop;
                }
                case 625: {
                    stackOut_625_0 = (rk) (Object) stackIn_625_0;
                    stackOut_625_1 = 0;
                    stackIn_626_0 = stackOut_625_0;
                    stackIn_626_1 = stackOut_625_1;
                    statePc = 626;
                    continue stateLoop;
                }
                case 626: {
                    ((rk) (Object) stackIn_626_0).field_eb = stackIn_626_1 != 0;
                    var9++;
                    if (var26 == 0) {
                        statePc = 278;
                    } else {
                        statePc = 627;
                    }
                    continue stateLoop;
                }
                case 627: {
                    stackOut_627_0 = var6 + (255 & jg.field_c[var7]);
                    stackIn_628_0 = stackOut_627_0;
                    statePc = 628;
                    continue stateLoop;
                }
                case 628: {
                    var6 = stackIn_628_0;
                    var7++;
                    if (var26 == 0) {
                        statePc = 268;
                    } else {
                        statePc = 629;
                    }
                    continue stateLoop;
                }
                case 629: {
                    stackOut_629_0 = var5;
                    stackIn_630_0 = stackOut_629_0;
                    statePc = 630;
                    continue stateLoop;
                }
                case 630: {
                    if (stackIn_630_0 == 0) {
                        statePc = 645;
                    } else {
                        statePc = 631;
                    }
                    continue stateLoop;
                }
                case 631: {
                    stackOut_631_0 = param2;
                    stackIn_632_0 = stackOut_631_0;
                    statePc = 632;
                    continue stateLoop;
                }
                case 632: {
                    if (!stackIn_632_0) {
                        statePc = 637;
                    } else {
                        statePc = 645;
                    }
                    continue stateLoop;
                }
                case 637: {
                    ea.a(-11008, param0);
                    statePc = 645;
                    continue stateLoop;
                }
                case 645: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(byte param0) {
        RuntimeException var2 = null;
        Object stackIn_6_0 = null;
        jp stackIn_10_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        jp[][] stackIn_22_0 = null;
        jp[][] stackIn_26_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_36_0 = 0;
        Object stackOut_5_0;
        jp stackOut_9_0;
        Object stackOut_13_0;
        Object stackOut_17_0;
        jp[][] stackOut_21_0;
        jp[][] stackOut_25_0;
        Object stackOut_29_0;
        int stackOut_33_0;
        int stackOut_35_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 < -91) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ip.a(81, (om) null, true, true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (null == ch.field_f) {
                            statePc = 35;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = null;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((Object) (Object) stackIn_6_0 == (Object) (Object) dg.field_g) {
                            statePc = 35;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = np.field_d;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 == null) {
                            statePc = 35;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = null;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if ((Object) (Object) stackIn_14_0 == (Object) (Object) on.field_w) {
                            statePc = 35;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = null;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((Object) (Object) stackIn_18_0 == (Object) (Object) ep.field_h) {
                            statePc = 35;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = tk.field_l;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (stackIn_22_0 == null) {
                            statePc = 35;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = ae.field_g;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (stackIn_26_0 == null) {
                            statePc = 35;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        stackOut_29_0 = null;
                        stackIn_30_0 = stackOut_29_0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((Object) (Object) stackIn_30_0 == (Object) (Object) up.field_A) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = 1;
                        stackIn_36_0 = stackOut_33_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = 0;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0 != 0;
                }
                case 37: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "ip.E(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ip(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackOut_4_0;
        StringBuilder stackOut_4_1;
        RuntimeException stackOut_5_0;
        StringBuilder stackOut_5_1;
        String stackOut_5_2;
        RuntimeException stackOut_7_0;
        StringBuilder stackOut_7_1;
        String stackOut_7_2;
        RuntimeException stackOut_8_0;
        StringBuilder stackOut_8_1;
        RuntimeException stackOut_9_0;
        StringBuilder stackOut_9_1;
        String stackOut_9_2;
        RuntimeException stackOut_11_0;
        StringBuilder stackOut_11_1;
        String stackOut_11_2;
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        tk.field_l = new jp[2][];
                        up.field_A = new jp[2];
                        ae.field_g = new jp[2][];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) runtimeException;
                        stackOut_4_1 = new StringBuilder().append("ip.<init>(").append(param0).append(44);
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_5_0 = stackOut_4_0;
                        stackIn_5_1 = stackOut_4_1;
                        if (param1 == null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                        stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                        stackOut_5_2 = "{...}";
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_8_2 = stackOut_5_2;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 7: {
                    stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                    stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                    stackOut_7_2 = "null";
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    throw qb.a((Throwable) (Object) stackIn_12_0, (String) (Object) (stackIn_12_2 + 44 + param3 + 41));
                }
                case 13: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jp[] a(int param0, boolean param1) {
        RuntimeException var3 = null;
        jp[] stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jp[] stackOut_4_0;
        try {
          try {
            L0: {
              if (param1) {
                break L0;
              } else {
                field_t = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ae.field_g[param0 + -1];
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if ((param1 ^ -1) >= 0) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        lb.g(param2, param3, 153, 238, ro.field_x[param1], 16777215);
                        if (!BrickABrac.field_J) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        lb.g(param2, param3, 153, 238, 16777215, 11184810);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!((ip) this).b((byte) -125)) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        on.field_w.c(param2, param3);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5_int = 107 / ((param0 - -28) / 43);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var5, "ip.G(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final jp c(byte param0) {
        RuntimeException var2 = null;
        jp stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_4_0;
        try {
          try {
            L0: {
              if (param0 <= -74) {
                break L0;
              } else {
                boolean discarded$2 = ((ip) this).b((byte) -112);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = ep.field_h;
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_t = null;
              field_u = null;
              field_v = null;
              field_s = null;
              if (!param0) {
                break L0;
              } else {
                field_v = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_r = null;
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        RuntimeException var6_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((ip) this).b((byte) -95)) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        lb.g(param2, param0, 306, 480, ro.field_x[param3], 16777215);
                        if (!BrickABrac.field_J) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var6 = kd.a(((ip) this).field_m, param3, (byte) -121);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (!var6.a((byte) -84, param3, ((ip) this).field_m)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ih.a(var6, ib.field_E, param3, 2, -13, true);
                        var6.a(((ip) this).field_m, param3, (byte) 78);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ef.a(var6.field_p, fk.field_e, param2, false, param4, param0, -13, param3, 2, 306, sl.field_D);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param1 < -84) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        field_t = null;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var6_ref, "ip.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0;
        int stackOut_5_0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!i.field_m.a("jungle", -28138)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        ch.field_f = pl.a("jungle", "jungle_near", (byte) -39, i.field_m);
                        dg.field_g = pl.a("jungle", "jungle_mid", (byte) -67, i.field_m);
                        np.field_d = pl.a("jungle", "jungle_far", (byte) -46, i.field_m);
                        on.field_w = pl.a("jungle", "jungle_small", (byte) -109, i.field_m);
                        sl.field_D = jh.a(0, ch.field_f);
                        fk.field_e = jh.a(0, dg.field_g);
                        ib.field_E = jh.a(0, np.field_d);
                        ep.field_h = pl.a("jungle", "jungle_character", (byte) -119, i.field_m);
                        tk.field_l[0] = cr.a("jungle", i.field_m, "jungle_caps", 2);
                        ae.field_g[0] = cr.a("jungle", i.field_m, "jungle_segs", 2);
                        up.field_A[0] = pl.a("jungle", "jungle_centre", (byte) -110, i.field_m);
                        tk.field_l[1] = ig.a(tk.field_l[0], false);
                        ae.field_g[1] = ig.a(ae.field_g[0], param0);
                        up.field_A[1] = pl.a(-16371, up.field_A[0]);
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qb.a((Throwable) (Object) var2, "ip.F(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Accept";
        field_u = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = new vl();
    }
}
