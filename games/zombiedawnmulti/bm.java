/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bm extends fc {
    private final boolean c(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_6_0 = null;
        int stackIn_12_0 = 0;
        Object stackOut_5_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 33554432) {
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
                        th discarded$2 = ((bm) this).a(-55);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((33554432 & this.b(param2, (byte) -124, param1) ^ -1) == -1) {
                            statePc = 9;
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
                        stackOut_5_0 = this;
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
                        if ((this.b(param2, (byte) -75, param1) >> 525947751 & 511) <= 64) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = 1;
                        stackIn_12_0 = stackOut_9_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
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
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0 != 0;
                }
                case 13: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var4, "bm.P(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_16_0 = null;
        int stackIn_22_0 = 0;
        Object stackIn_25_0 = null;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_190_0 = 0;
        int stackIn_194_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_215_0 = 0;
        int stackIn_219_0 = 0;
        int stackIn_228_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_241_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_258_0 = 0;
        int stackIn_262_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_273_0 = 0;
        int stackIn_289_0 = 0;
        int stackIn_294_0 = 0;
        int stackIn_300_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_313_0 = 0;
        int stackIn_319_0 = 0;
        int stackIn_321_0 = 0;
        int stackIn_323_0 = 0;
        int stackIn_324_0 = 0;
        Object stackIn_324_1 = null;
        int stackIn_325_0 = 0;
        int stackIn_327_0 = 0;
        int stackIn_329_0 = 0;
        int stackIn_330_0 = 0;
        int stackIn_330_1 = 0;
        int stackIn_332_0 = 0;
        int stackIn_333_0 = 0;
        Object stackIn_333_1 = null;
        int stackIn_334_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_338_0 = 0;
        int stackIn_339_0 = 0;
        int stackIn_339_1 = 0;
        int stackIn_344_0 = 0;
        int stackIn_347_0 = 0;
        int stackIn_351_0 = 0;
        int stackIn_360_0 = 0;
        int stackIn_364_0 = 0;
        int stackIn_368_0 = 0;
        int stackIn_377_0 = 0;
        int stackOut_11_0 = 0;
        Object stackOut_15_0 = null;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        Object stackOut_24_0 = null;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_189_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_201_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_214_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_231_0 = 0;
        int stackOut_240_0 = 0;
        int stackOut_244_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_257_0 = 0;
        int stackOut_261_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_272_0 = 0;
        int stackOut_288_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_299_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_312_0 = 0;
        int stackOut_318_0 = 0;
        int stackOut_320_0 = 0;
        int stackOut_321_0 = 0;
        int stackOut_323_0 = 0;
        Object stackOut_323_1 = null;
        int stackOut_324_0 = 0;
        int stackOut_325_0 = 0;
        int stackOut_327_0 = 0;
        int stackOut_327_1 = 0;
        int stackOut_329_0 = 0;
        int stackOut_329_1 = 0;
        int stackOut_331_0 = 0;
        int stackOut_332_0 = 0;
        Object stackOut_332_1 = null;
        int stackOut_333_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_336_0 = 0;
        int stackOut_336_1 = 0;
        int stackOut_338_0 = 0;
        int stackOut_338_1 = 0;
        int stackOut_341_0 = 0;
        int stackOut_343_0 = 0;
        int stackOut_346_0 = 0;
        int stackOut_350_0 = 0;
        int stackOut_359_0 = 0;
        int stackOut_363_0 = 0;
        int stackOut_367_0 = 0;
        int stackOut_376_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = this.b(param1, (byte) -83, param0);
                        var4_int = var4_int & -67108865;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param2 == -8130) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        int discarded$1 = this.b(-33, (byte) 40, -88);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = (var4_int & 65408) >> -1040999193;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 == (var4_int & 33554432 ^ -1)) {
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
                        if (var5 == 0) {
                            statePc = 13;
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
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = var4_int;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var4_int = var4_int & -65409;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (this.c(33554432, param0 - -1, param1)) {
                            statePc = 21;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = this;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (this.a(param1, (byte) 2, 1 + param0)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackOut_19_0 = 1;
                        stackIn_22_0 = stackOut_19_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var6 = stackIn_22_0;
                        var7 = this.c(33554432, param0, param1 + 3) ? 1 : 0;
                        var8 = this.c(33554432, param0, param1 + -1) ? 1 : 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (this.c(33554432, param0 - 1, param1)) {
                            statePc = 28;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = this;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (this.a(param1, (byte) 2, param0 + -1)) {
                            statePc = 30;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackOut_28_0 = 1;
                        stackIn_31_0 = stackOut_28_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 0;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var9 = stackIn_31_0;
                        var10 = this.c(param2 ^ -33562562, 1 + param0, param1) ? 1 : 0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (!this.a(param1, (byte) 2, param0)) {
                            statePc = 269;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        stackOut_33_0 = var6;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (stackIn_34_0 != 0) {
                            statePc = 269;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var7 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        stackOut_40_0 = var8;
                        stackIn_41_0 = stackOut_40_0;
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (stackIn_41_0 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = var9;
                        stackIn_45_0 = stackOut_44_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        if (stackIn_45_0 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var10 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var4_int = var4_int | this.a(9, 0);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var7 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        stackOut_53_0 = var8;
                        stackIn_54_0 = stackOut_53_0;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (stackIn_54_0 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        stackOut_57_0 = var9;
                        stackIn_58_0 = stackOut_57_0;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (stackIn_58_0 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = var10;
                        stackIn_62_0 = stackOut_61_0;
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if (stackIn_62_0 == 0) {
                            statePc = 67;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 66;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var4_int = var4_int | this.a(10, 0);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var7 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = var8;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (stackIn_70_0 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        stackOut_73_0 = var9;
                        stackIn_74_0 = stackOut_73_0;
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 76;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (stackIn_74_0 != 0) {
                            statePc = 81;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        if (var10 == 0) {
                            statePc = 81;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        var4_int = var4_int | this.a(11, 0);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        if (var7 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 82;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        stackOut_82_0 = var8;
                        stackIn_83_0 = stackOut_82_0;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 85;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        if (stackIn_83_0 == 0) {
                            statePc = 97;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        stackOut_86_0 = var9;
                        stackIn_87_0 = stackOut_86_0;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (stackIn_87_0 != 0) {
                            statePc = 97;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        stackOut_90_0 = var10;
                        stackIn_91_0 = stackOut_90_0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 93;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (stackIn_91_0 == 0) {
                            statePc = 96;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 95;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        var4_int = var4_int | this.a(18, param2 ^ -8130);
                        statePc = 97;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        if (var7 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 98;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        stackOut_98_0 = var8;
                        stackIn_99_0 = stackOut_98_0;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (stackIn_99_0 != 0) {
                            statePc = 110;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = var9;
                        stackIn_103_0 = stackOut_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (stackIn_103_0 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var10 == 0) {
                            statePc = 110;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        var4_int = var4_int | this.a(12, 0);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        if (var7 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        stackOut_111_0 = var8;
                        stackIn_112_0 = stackOut_111_0;
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 114;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (stackIn_112_0 != 0) {
                            statePc = 126;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        statePc = 115;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = var9;
                        stackIn_116_0 = stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0 == 0) {
                            statePc = 126;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        stackOut_119_0 = var10;
                        stackIn_120_0 = stackOut_119_0;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 122;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (stackIn_120_0 == 0) {
                            statePc = 125;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 123;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var4_int = var4_int | this.a(14, 0);
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        if (var7 == 0) {
                            statePc = 139;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = var8;
                        stackIn_128_0 = stackOut_127_0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = var9;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 134;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        if (stackIn_132_0 != 0) {
                            statePc = 139;
                        } else {
                            statePc = 133;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (var10 == 0) {
                            statePc = 139;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        var4_int = var4_int | this.a(15, 0);
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (var7 == 0) {
                            statePc = 155;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        stackOut_140_0 = var8;
                        stackIn_141_0 = stackOut_140_0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 143;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        if (stackIn_141_0 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 144;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        stackOut_144_0 = var9;
                        stackIn_145_0 = stackOut_144_0;
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 147;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        if (stackIn_145_0 != 0) {
                            statePc = 155;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        statePc = 148;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        stackOut_148_0 = var10;
                        stackIn_149_0 = stackOut_148_0;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (stackIn_149_0 == 0) {
                            statePc = 154;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var4_int = var4_int | this.a(21, param2 ^ -8130);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (var7 != 0) {
                            statePc = 168;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackOut_156_0 = var8;
                        stackIn_157_0 = stackOut_156_0;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        if (stackIn_157_0 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        statePc = 160;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        stackOut_160_0 = var9;
                        stackIn_161_0 = stackOut_160_0;
                        statePc = 161;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 163;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        if (stackIn_161_0 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        if (var10 == 0) {
                            statePc = 168;
                        } else {
                            statePc = 165;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 166;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        var4_int = var4_int | this.a(13, 0);
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        if (var7 != 0) {
                            statePc = 184;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = var8;
                        stackIn_170_0 = stackOut_169_0;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 172;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (stackIn_170_0 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 171;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        statePc = 173;
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        stackOut_173_0 = var9;
                        stackIn_174_0 = stackOut_173_0;
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 176;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        if (stackIn_174_0 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 175;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        stackOut_177_0 = var10;
                        stackIn_178_0 = stackOut_177_0;
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 180;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        if (stackIn_178_0 == 0) {
                            statePc = 183;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 181;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        var4_int = var4_int | this.a(16, 0);
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        if (var7 != 0) {
                            statePc = 200;
                        } else {
                            statePc = 185;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        stackOut_185_0 = var8;
                        stackIn_186_0 = stackOut_185_0;
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        if (stackIn_186_0 == 0) {
                            statePc = 200;
                        } else {
                            statePc = 187;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        statePc = 189;
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        stackOut_189_0 = var9;
                        stackIn_190_0 = stackOut_189_0;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 192;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        if (stackIn_190_0 != 0) {
                            statePc = 200;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        statePc = 193;
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        stackOut_193_0 = var10;
                        stackIn_194_0 = stackOut_193_0;
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 196;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        if (stackIn_194_0 != 0) {
                            statePc = 199;
                        } else {
                            statePc = 195;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        statePc = 197;
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 198;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        var4_int = var4_int | this.a(17, 0);
                        statePc = 200;
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (var7 != 0) {
                            statePc = 213;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        stackOut_201_0 = var8;
                        stackIn_202_0 = stackOut_201_0;
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 204;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (stackIn_202_0 == 0) {
                            statePc = 213;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        stackOut_205_0 = var9;
                        stackIn_206_0 = stackOut_205_0;
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 208;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        if (stackIn_206_0 != 0) {
                            statePc = 213;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        statePc = 209;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        if (var10 != 0) {
                            statePc = 213;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 211;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        var4_int = var4_int | this.a(20, param2 + 8130);
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        if (var7 != 0) {
                            statePc = 226;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        stackOut_214_0 = var8;
                        stackIn_215_0 = stackOut_214_0;
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        if (stackIn_215_0 != 0) {
                            statePc = 226;
                        } else {
                            statePc = 216;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        stackOut_218_0 = var9;
                        stackIn_219_0 = stackOut_218_0;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (stackIn_219_0 == 0) {
                            statePc = 226;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        if (var10 == 0) {
                            statePc = 226;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 224;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        var4_int = var4_int | this.a(19, 0);
                        statePc = 226;
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        if (var7 != 0) {
                            statePc = 239;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        stackOut_227_0 = var8;
                        stackIn_228_0 = stackOut_227_0;
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        if (stackIn_228_0 != 0) {
                            statePc = 239;
                        } else {
                            statePc = 229;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        stackOut_231_0 = var9;
                        stackIn_232_0 = stackOut_231_0;
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 234;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        if (stackIn_232_0 == 0) {
                            statePc = 239;
                        } else {
                            statePc = 233;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        statePc = 235;
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        if (var10 != 0) {
                            statePc = 239;
                        } else {
                            statePc = 236;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 237;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        statePc = 238;
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        var4_int = var4_int | this.a(22, param2 + 8130);
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        if (var7 != 0) {
                            statePc = 252;
                        } else {
                            statePc = 240;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 240: {
                    try {
                        stackOut_240_0 = var8;
                        stackIn_241_0 = stackOut_240_0;
                        statePc = 241;
                        continue stateLoop;
                    } catch (Throwable stateCaught_240) {
                        caughtException = stateCaught_240;
                        statePc = 243;
                        continue stateLoop;
                    }
                }
                case 241: {
                    try {
                        if (stackIn_241_0 != 0) {
                            statePc = 252;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        statePc = 244;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        stackOut_244_0 = var9;
                        stackIn_245_0 = stackOut_244_0;
                        statePc = 245;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 247;
                        continue stateLoop;
                    }
                }
                case 245: {
                    try {
                        if (stackIn_245_0 != 0) {
                            statePc = 252;
                        } else {
                            statePc = 246;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_245) {
                        caughtException = stateCaught_245;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        statePc = 248;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        if (var10 == 0) {
                            statePc = 252;
                        } else {
                            statePc = 249;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 250;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        var4_int = var4_int | this.a(23, 0);
                        statePc = 252;
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        if (var7 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 253;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        stackOut_253_0 = var8;
                        stackIn_254_0 = stackOut_253_0;
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 256;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        if (stackIn_254_0 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 255;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 257: {
                    try {
                        stackOut_257_0 = var9;
                        stackIn_258_0 = stackOut_257_0;
                        statePc = 258;
                        continue stateLoop;
                    } catch (Throwable stateCaught_257) {
                        caughtException = stateCaught_257;
                        statePc = 260;
                        continue stateLoop;
                    }
                }
                case 258: {
                    try {
                        if (stackIn_258_0 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 259;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        statePc = 261;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        stackOut_261_0 = var10;
                        stackIn_262_0 = stackOut_261_0;
                        statePc = 262;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 264;
                        continue stateLoop;
                    }
                }
                case 262: {
                    try {
                        if (stackIn_262_0 == 0) {
                            statePc = 267;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_262) {
                        caughtException = stateCaught_262;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        statePc = 265;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        var4_int = var4_int | this.a(24, 0);
                        stackOut_267_0 = var12;
                        stackIn_268_0 = stackOut_267_0;
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        if (stackIn_268_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 269;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 271;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        if (!this.a(param1, (byte) 2, param0)) {
                            statePc = 276;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        statePc = 272;
                        continue stateLoop;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        stackOut_272_0 = var6;
                        stackIn_273_0 = stackOut_272_0;
                        statePc = 273;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 275;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        if (stackIn_273_0 != 0) {
                            statePc = 320;
                        } else {
                            statePc = 274;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 278;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 278;
                        continue stateLoop;
                    }
                }
                case 275: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_275) {
                        caughtException = stateCaught_275;
                        statePc = 278;
                        continue stateLoop;
                    }
                }
                case 276: {
                    try {
                        if (this.c(param2 ^ -33562562, param0, 1 + param1)) {
                            statePc = 301;
                        } else {
                            statePc = 277;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        statePc = 279;
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 279: {
                    try {
                        if (this.c(param2 + 33562562, param0, param1 + 2)) {
                            statePc = 284;
                        } else {
                            statePc = 280;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_279) {
                        caughtException = stateCaught_279;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        statePc = 282;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 283;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        if (!this.c(param2 ^ -33562562, 1 + param0, param1)) {
                            statePc = 290;
                        } else {
                            statePc = 285;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        if (!this.c(33554432, -1 + param0, param1)) {
                            statePc = 290;
                        } else {
                            statePc = 286;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 287;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        statePc = 288;
                        continue stateLoop;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        var4_int = var4_int | this.a(6, param2 + 8130);
                        stackOut_288_0 = var12;
                        stackIn_289_0 = stackOut_288_0;
                        statePc = 289;
                        continue stateLoop;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        if (stackIn_289_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 290;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 292;
                        continue stateLoop;
                    }
                }
                case 290: {
                    try {
                        if (!this.c(param2 + 33562562, param0 - -1, param1)) {
                            statePc = 295;
                        } else {
                            statePc = 291;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_290) {
                        caughtException = stateCaught_290;
                        statePc = 292;
                        continue stateLoop;
                    }
                }
                case 291: {
                    try {
                        statePc = 293;
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        var4_int = var4_int | this.a(8, 0);
                        stackOut_293_0 = var12;
                        stackIn_294_0 = stackOut_293_0;
                        statePc = 294;
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 294: {
                    try {
                        if (stackIn_294_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 295;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_294) {
                        caughtException = stateCaught_294;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        if (!this.c(param2 ^ -33562562, param0 - 1, param1)) {
                            statePc = 299;
                        } else {
                            statePc = 296;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 297;
                        continue stateLoop;
                    }
                }
                case 296: {
                    try {
                        statePc = 298;
                        continue stateLoop;
                    } catch (Throwable stateCaught_296) {
                        caughtException = stateCaught_296;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 297: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        var4_int = var4_int | this.a(4, 0);
                        if (var12 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 299;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        var4_int = var4_int | this.a(2, param2 + 8130);
                        stackOut_299_0 = var12;
                        stackIn_300_0 = stackOut_299_0;
                        statePc = 300;
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 300: {
                    try {
                        if (stackIn_300_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 301;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_300) {
                        caughtException = stateCaught_300;
                        statePc = 303;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        if (!this.c(33554432, param0 - -1, param1)) {
                            statePc = 309;
                        } else {
                            statePc = 302;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 306;
                        continue stateLoop;
                    }
                }
                case 302: {
                    try {
                        statePc = 304;
                        continue stateLoop;
                    } catch (Throwable stateCaught_302) {
                        caughtException = stateCaught_302;
                        statePc = 306;
                        continue stateLoop;
                    }
                }
                case 303: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 306;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        if (!this.c(33554432, -1 + param0, param1)) {
                            statePc = 309;
                        } else {
                            statePc = 305;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 306;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        statePc = 307;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 306: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_306) {
                        caughtException = stateCaught_306;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        var4_int = var4_int | this.a(5, 0);
                        stackOut_307_0 = var12;
                        stackIn_308_0 = stackOut_307_0;
                        statePc = 308;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 308: {
                    try {
                        if (stackIn_308_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 309;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_308) {
                        caughtException = stateCaught_308;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 309: {
                    try {
                        if (!this.c(33554432, param0 - -1, param1)) {
                            statePc = 314;
                        } else {
                            statePc = 310;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 311;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        statePc = 312;
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 312: {
                    try {
                        var4_int = var4_int | this.a(7, 0);
                        stackOut_312_0 = var12;
                        stackIn_313_0 = stackOut_312_0;
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_312) {
                        caughtException = stateCaught_312;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        if (stackIn_313_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 314;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 316;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        if (this.c(param2 + 33562562, param0 - 1, param1)) {
                            statePc = 318;
                        } else {
                            statePc = 315;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 316;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        statePc = 317;
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        var4_int = var4_int | this.a(1, param2 + 8130);
                        if (var12 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 318;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        var4_int = var4_int | this.a(3, 0);
                        stackOut_318_0 = var12;
                        stackIn_319_0 = stackOut_318_0;
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        if (stackIn_319_0 == 0) {
                            statePc = 374;
                        } else {
                            statePc = 320;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_319) {
                        caughtException = stateCaught_319;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 320: {
                    try {
                        stackOut_320_0 = var10;
                        stackIn_327_0 = stackOut_320_0;
                        stackIn_321_0 = stackOut_320_0;
                        if (this.c(33554432, param0 - -1, 2 + param1)) {
                            statePc = 327;
                        } else {
                            statePc = 321;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        stackOut_321_0 = stackIn_321_0;
                        stackIn_323_0 = stackOut_321_0;
                        statePc = 323;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        stackOut_323_0 = stackIn_323_0;
                        stackOut_323_1 = this;
                        stackIn_324_0 = stackOut_323_0;
                        stackIn_324_1 = stackOut_323_1;
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 326;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        stackOut_324_0 = stackIn_324_0;
                        stackIn_329_0 = stackOut_324_0;
                        stackIn_325_0 = stackOut_324_0;
                        if (!this.c(33554432, param0 - -1, param1 + 1)) {
                            statePc = 329;
                        } else {
                            statePc = 325;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        stackOut_325_0 = stackIn_325_0;
                        stackIn_327_0 = stackOut_325_0;
                        statePc = 327;
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        stackOut_327_0 = stackIn_327_0;
                        stackOut_327_1 = 1;
                        stackIn_330_0 = stackOut_327_0;
                        stackIn_330_1 = stackOut_327_1;
                        statePc = 330;
                        continue stateLoop;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 328;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        stackOut_329_0 = stackIn_329_0;
                        stackOut_329_1 = 0;
                        stackIn_330_0 = stackOut_329_0;
                        stackIn_330_1 = stackOut_329_1;
                        statePc = 330;
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        var10 = stackIn_330_0 | stackIn_330_1;
                        statePc = 331;
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        stackOut_331_0 = var9;
                        stackIn_336_0 = stackOut_331_0;
                        stackIn_332_0 = stackOut_331_0;
                        if (this.c(param2 ^ -33562562, param0 + -1, 2 + param1)) {
                            statePc = 336;
                        } else {
                            statePc = 332;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        stackOut_332_0 = stackIn_332_0;
                        stackOut_332_1 = this;
                        stackIn_333_0 = stackOut_332_0;
                        stackIn_333_1 = stackOut_332_1;
                        statePc = 333;
                        continue stateLoop;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 335;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        stackOut_333_0 = stackIn_333_0;
                        stackIn_338_0 = stackOut_333_0;
                        stackIn_334_0 = stackOut_333_0;
                        if (!this.c(param2 + 33562562, -1 + param0, param1 + 1)) {
                            statePc = 338;
                        } else {
                            statePc = 334;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        stackOut_334_0 = stackIn_334_0;
                        stackIn_336_0 = stackOut_334_0;
                        statePc = 336;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        stackOut_336_0 = stackIn_336_0;
                        stackOut_336_1 = 1;
                        stackIn_339_0 = stackOut_336_0;
                        stackIn_339_1 = stackOut_336_1;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        stackOut_338_0 = stackIn_338_0;
                        stackOut_338_1 = 0;
                        stackIn_339_0 = stackOut_338_0;
                        stackIn_339_1 = stackOut_338_1;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        var9 = stackIn_339_0 | stackIn_339_1;
                        statePc = 340;
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        if (!this.c(33554432, param0 + 1, 1 + param1)) {
                            statePc = 343;
                        } else {
                            statePc = 341;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        stackOut_341_0 = 128;
                        stackIn_344_0 = stackOut_341_0;
                        statePc = 344;
                        continue stateLoop;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 342;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        stackOut_343_0 = 0;
                        stackIn_344_0 = stackOut_343_0;
                        statePc = 344;
                        continue stateLoop;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        var11 = stackIn_344_0;
                        statePc = 345;
                        continue stateLoop;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 345: {
                    try {
                        if (var7 != 0) {
                            statePc = 358;
                        } else {
                            statePc = 346;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_345) {
                        caughtException = stateCaught_345;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 346: {
                    try {
                        stackOut_346_0 = var8;
                        stackIn_347_0 = stackOut_346_0;
                        statePc = 347;
                        continue stateLoop;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 349;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        if (stackIn_347_0 != 0) {
                            statePc = 358;
                        } else {
                            statePc = 348;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 353;
                        continue stateLoop;
                    }
                }
                case 348: {
                    try {
                        statePc = 350;
                        continue stateLoop;
                    } catch (Throwable stateCaught_348) {
                        caughtException = stateCaught_348;
                        statePc = 353;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 353;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        stackOut_350_0 = var9;
                        stackIn_351_0 = stackOut_350_0;
                        statePc = 351;
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 353;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        if (stackIn_351_0 == 0) {
                            statePc = 358;
                        } else {
                            statePc = 352;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 353: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_353) {
                        caughtException = stateCaught_353;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 354: {
                    try {
                        if (var10 == 0) {
                            statePc = 358;
                        } else {
                            statePc = 355;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 356;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        statePc = 357;
                        continue stateLoop;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 356: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_356) {
                        caughtException = stateCaught_356;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 357: {
                    try {
                        var4_int = var4_int | this.a(26, 0) - var11;
                        statePc = 358;
                        continue stateLoop;
                    } catch (Throwable stateCaught_357) {
                        caughtException = stateCaught_357;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 358: {
                    try {
                        if (var7 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 359;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_358) {
                        caughtException = stateCaught_358;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 359: {
                    try {
                        stackOut_359_0 = var8;
                        stackIn_360_0 = stackOut_359_0;
                        statePc = 360;
                        continue stateLoop;
                    } catch (Throwable stateCaught_359) {
                        caughtException = stateCaught_359;
                        statePc = 362;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        if (stackIn_360_0 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 361;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_360) {
                        caughtException = stateCaught_360;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 361: {
                    try {
                        statePc = 363;
                        continue stateLoop;
                    } catch (Throwable stateCaught_361) {
                        caughtException = stateCaught_361;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 362: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_362) {
                        caughtException = stateCaught_362;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 363: {
                    try {
                        stackOut_363_0 = var9;
                        stackIn_364_0 = stackOut_363_0;
                        statePc = 364;
                        continue stateLoop;
                    } catch (Throwable stateCaught_363) {
                        caughtException = stateCaught_363;
                        statePc = 366;
                        continue stateLoop;
                    }
                }
                case 364: {
                    try {
                        if (stackIn_364_0 != 0) {
                            statePc = 374;
                        } else {
                            statePc = 365;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_364) {
                        caughtException = stateCaught_364;
                        statePc = 370;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        statePc = 367;
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        caughtException = stateCaught_365;
                        statePc = 370;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_366) {
                        caughtException = stateCaught_366;
                        statePc = 370;
                        continue stateLoop;
                    }
                }
                case 367: {
                    try {
                        stackOut_367_0 = var10;
                        stackIn_368_0 = stackOut_367_0;
                        statePc = 368;
                        continue stateLoop;
                    } catch (Throwable stateCaught_367) {
                        caughtException = stateCaught_367;
                        statePc = 370;
                        continue stateLoop;
                    }
                }
                case 368: {
                    try {
                        if (stackIn_368_0 != 0) {
                            statePc = 373;
                        } else {
                            statePc = 369;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_368) {
                        caughtException = stateCaught_368;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 369: {
                    try {
                        statePc = 371;
                        continue stateLoop;
                    } catch (Throwable stateCaught_369) {
                        caughtException = stateCaught_369;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 370: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_370) {
                        caughtException = stateCaught_370;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 371: {
                    try {
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_371) {
                        caughtException = stateCaught_371;
                        statePc = 372;
                        continue stateLoop;
                    }
                }
                case 372: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_372) {
                        caughtException = stateCaught_372;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 373: {
                    try {
                        var4_int = var4_int | -var11 + this.a(28, 0);
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_373) {
                        caughtException = stateCaught_373;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 374: {
                    try {
                        if ((65408 & var4_int) != 0) {
                            statePc = 376;
                        } else {
                            statePc = 375;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_374) {
                        caughtException = stateCaught_374;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 375: {
                    try {
                        var4_int = var4_int | this.a(24, 0);
                        statePc = 376;
                        continue stateLoop;
                    } catch (Throwable stateCaught_375) {
                        caughtException = stateCaught_375;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 376: {
                    try {
                        stackOut_376_0 = var4_int;
                        stackIn_377_0 = stackOut_376_0;
                        statePc = 377;
                        continue stateLoop;
                    } catch (Throwable stateCaught_376) {
                        caughtException = stateCaught_376;
                        statePc = 378;
                        continue stateLoop;
                    }
                }
                case 377: {
                    return stackIn_377_0;
                }
                case 378: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var4, "bm.V(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        ((bm) this).a(((bm) this).field_g, 9);
        if (param0 <= 120) {
            return;
        }
        try {
            this.a((byte) -117, ((bm) this).field_g);
            ((bm) this).field_d = ((bm) this).field_g[0].length;
            ((bm) this).field_e = ((bm) this).field_g.length;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "bm.G(" + param0 + 41);
        }
    }

    final void a(kb param0, byte param1) {
        RuntimeException var3 = null;
        th var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ek var6 = null;
        ge var7 = null;
        int var8 = 0;
        int var9 = 0;
        ge var10 = null;
        int var11 = 0;
        boolean stackIn_21_0 = false;
        int stackIn_23_0 = 0;
        ek stackIn_25_0 = null;
        kb stackIn_32_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        boolean stackOut_20_0 = false;
        boolean stackOut_21_0 = false;
        ek stackOut_24_0 = null;
        kb stackOut_31_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_ref = ((bm) this).a(-103);
                        param0.field_f = 1;
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((var4 ^ -1) <= (param0.field_y.length ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param0.field_y[var4] = var4;
                        var4++;
                        if (var11 != 0) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var11 == 0) {
                            statePc = 2;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if ((param0.field_t - 1 ^ -1) >= (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5 = hp.a((byte) 10, g.field_a, param0.field_t + -var4) + var4;
                        var6_int = param0.field_y[var5];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0.field_y[var5] = param0.field_y[var4];
                        param0.field_y[var4] = var6_int;
                        var4++;
                        if (var11 != 0) {
                            statePc = 15;
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
                        if (var11 == 0) {
                            statePc = 8;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var4 = 0;
                        var5 = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param1 > 7) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return;
                }
                case 17: {
                    try {
                        var6 = (ek) (Object) var3_ref.c(48);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (null == var6) {
                            statePc = 78;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var11 != 0) {
                            statePc = 78;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = var6 instanceof lm;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = stackIn_21_0;
                        stackIn_23_0 = stackOut_21_0 ? 1 : 0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (stackIn_23_0 != 0) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (ek) var6;
                        stackIn_25_0 = stackOut_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!(stackIn_25_0 instanceof ge)) {
                            statePc = 70;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (!(var6 instanceof ge)) {
                            statePc = 67;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var7 = (ge) (Object) var6;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if ((var7.field_gb ^ -1) >= -2) {
                            statePc = 38;
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
                        stackOut_31_0 = (kb) param0;
                        stackIn_32_0 = stackOut_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if ((stackIn_32_0.field_t ^ -1) < (var7.field_gb ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 37;
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
                        if (var11 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        var7.field_gb = param0.field_y[var7.field_gb];
                        var8 = 1;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (param0.b((byte) -121, 52, var7.field_gb)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var8++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (!param0.b((byte) -62, 50, var7.field_gb)) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var8 += 2;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (var4 == 0) {
                            statePc = 52;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = var5;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 > 0) {
                            statePc = 70;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (var4 != 0) {
                            statePc = 57;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var8 = 1;
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var5 = var5 + var8;
                        var9 = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if ((var8 ^ -1) >= (var9 ^ -1)) {
                            statePc = 66;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var10 = new ge(var7.e((byte) -112) + (-3 + var9 % 5) * 2, var7.g(1829947600) + (var9 * 11 % 7 + -3) * 2, var7.d(true));
                        var10.field_gb = var7.field_gb;
                        var10.field_x = param0.a(-16777216);
                        stackOut_60_0 = var4;
                        stackIn_23_0 = stackOut_60_0;
                        stackIn_61_0 = stackOut_60_0;
                        if (var11 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 == 0) {
                            statePc = 65;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        System.out.println("Zombie! oid " + var10.field_x);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        param0.field_K.a((br) (Object) var10, false);
                        var9++;
                        if (var11 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (var11 == 0) {
                            statePc = 70;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var6.field_x = param0.a(-16777216);
                        param0.field_K.a((br) (Object) var6, false);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 69;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var6 = (ek) (Object) var3_ref.b(6);
                        if (var11 == 0) {
                            statePc = 18;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 73;
                    continue stateLoop;
                }
                case 73: {
                    try {
                        stackOut_73_0 = (RuntimeException) var3;
                        stackOut_73_1 = new StringBuilder().append("bm.U(");
                        stackIn_76_0 = stackOut_73_0;
                        stackIn_76_1 = stackOut_73_1;
                        stackIn_74_0 = stackOut_73_0;
                        stackIn_74_1 = stackOut_73_1;
                        if (param0 == null) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
                        stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
                        stackOut_74_2 = "{...}";
                        stackIn_77_0 = stackOut_74_0;
                        stackIn_77_1 = stackOut_74_1;
                        stackIn_77_2 = stackOut_74_2;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 75;
                        continue stateLoop;
                    }
                }
                case 75: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 76: {
                    stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
                    stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
                    stackOut_76_2 = "null";
                    stackIn_77_0 = stackOut_76_0;
                    stackIn_77_1 = stackOut_76_1;
                    stackIn_77_2 = stackOut_76_2;
                    statePc = 77;
                    continue stateLoop;
                }
                case 77: {
                    throw fa.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param1 + 41);
                }
                case 78: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, ul param1) {
        RuntimeException runtimeException = null;
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var2 = new ja(param1.a("final_frame.jpg", "", false), (java.awt.Component) (Object) dk.field_Ib);
                        var3 = var2.field_x;
                        var4 = var2.field_w;
                        m.c(540);
                        if (param0 == 30651) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        qp.field_v = new ja(var3, var4 * 3 / 4);
                        qp.field_v.a();
                        var2.c(0, 0);
                        qd.field_s = new ja(var3, -qp.field_v.field_w + var4);
                        qd.field_s.a();
                        var2.c(0, -qp.field_v.field_w);
                        qd.field_s.field_y = qp.field_v.field_w;
                        ql.a(true);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 4: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        stackOut_5_0 = (RuntimeException) runtimeException;
                        stackOut_5_1 = new StringBuilder().append("bm.W(").append(param0).append(44);
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param1 == null) {
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
                        stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                        stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                        stackOut_6_2 = "{...}";
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_9_1 = stackOut_6_1;
                        stackIn_9_2 = stackOut_6_2;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 8: {
                    stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                    stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                    stackOut_8_2 = "null";
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    throw fa.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        int stackOut_1_0 = 0;
        Object stackOut_4_0 = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == 2) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0 != 0;
                }
                case 3: {
                    try {
                        if (this.c(33554432, param2, param0 - -1)) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (this.c(33554432, param2, param0 - -2)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var4, "bm.Q(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final ek a(int param0, int param1, int param2, int param3, int param4) {
        sh var6 = null;
        int var6_int = 0;
        RuntimeException var6_ref = null;
        ge var7 = null;
        Object stackIn_2_0 = null;
        lm stackIn_8_0 = null;
        sh stackIn_11_0 = null;
        ge stackIn_13_0 = null;
        Object stackIn_15_0 = null;
        Object stackOut_1_0 = null;
        lm stackOut_7_0 = null;
        sh stackOut_10_0 = null;
        ge stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param2 == -8944) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (ek) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        if (0 == param4) {
                            statePc = 12;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((param4 ^ -1) != -2) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ee.a(param3, param1, param0, true);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (ek) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        if ((param4 ^ -1) != -5) {
                            statePc = 14;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = new sh(param0, param1);
                        var6.field_O = (byte)(3 & param3 >>> -31496418);
                        stackOut_10_0 = (sh) var6;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return (ek) (Object) stackIn_11_0;
                }
                case 12: {
                    try {
                        var6_int = 1073741823 & param3;
                        var7 = new ge(param0, param1, var6_int);
                        var7.field_gb = (byte)((-1073741824 & param3) >>> 384489694);
                        stackOut_12_0 = (ge) var7;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return (ek) (Object) stackIn_13_0;
                }
                case 14: {
                    try {
                        stackOut_14_0 = null;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return (ek) (Object) stackIn_15_0;
                }
                case 16: {
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var6_ref, "bm.S(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(byte param0, int[][] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0 < -105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        stackOut_3_0 = var3_int;
                        stackOut_3_1 = param1.length;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0 >= stackIn_4_1) {
                            statePc = 38;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((param1[0].length ^ -1) >= (var4 ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = this.b(var4, var3_int, -8130);
                        var6 = (65408 & var5) >> -1370880729;
                        var7 = (33488896 & var5) >> 5902480;
                        stackOut_8_0 = 0;
                        stackOut_8_1 = -2147483648 & var5;
                        stackIn_4_0 = stackOut_8_0;
                        stackIn_4_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var8 != 0) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (stackIn_9_0 == stackIn_9_1) {
                            statePc = 29;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = var6;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (stackIn_11_0 < 9) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = -33;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (stackIn_15_0 <= (var6 ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (9 > var7) {
                            statePc = 25;
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
                        stackOut_21_0 = var7;
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
                        if (stackIn_22_0 <= 32) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-17 != (this.b(var4, 1 + var3_int, -8130) >> 168146279 & 511 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var5 = var5 | 67108864;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((bm) this).field_f[var3_int][var4] = var5;
                        var4++;
                        if (var8 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) var3;
                        stackOut_33_1 = new StringBuilder().append("bm.AA(").append(param0).append(44);
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param1 == null) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                        stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                        stackOut_34_2 = "{...}";
                        stackIn_37_0 = stackOut_34_0;
                        stackIn_37_1 = stackOut_34_1;
                        stackIn_37_2 = stackOut_34_2;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 36: {
                    stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                    stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                    stackOut_36_2 = "null";
                    stackIn_37_0 = stackOut_36_0;
                    stackIn_37_1 = stackOut_36_1;
                    stackIn_37_2 = stackOut_36_2;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw fa.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        en.a(-1, 1);
                        if ((param1 ^ -1) != -11) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (1 != op.field_m.field_t) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        bi.field_e = true;
                        param3 = 1;
                        param1 = 15;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        gk.field_b = 0;
                        vd.field_d = param3;
                        sp.field_g = param1;
                        if (param2 > 124) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        if (sp.field_g == -4) {
                            statePc = 25;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = sp.field_g;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((stackIn_10_0 ^ -1) == 1) {
                            statePc = 25;
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
                case 13: {
                    try {
                        stackOut_13_0 = sp.field_g;
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
                        if ((stackIn_14_0 ^ -1) == 4) {
                            statePc = 25;
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
                        stackOut_17_0 = 1;
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
                        if (stackIn_18_0 == sp.field_g) {
                            statePc = 25;
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
                        stackOut_21_0 = 8;
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
                        if (stackIn_22_0 != sp.field_g) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        cj.d(false, 0);
                        if (var5 == 0) {
                            statePc = 34;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (-16 == (sp.field_g ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        cj.d(false, 10);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-4 != sp.field_g) {
                            statePc = 38;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        iq.field_f = true;
                        if (var5 == 0) {
                            statePc = 44;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if ((sp.field_g ^ -1) != 6) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        iq.field_f = false;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!lb.a((byte) 53, sp.field_g)) {
                            statePc = 57;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var4_int = 0;
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if ((sp.field_g ^ -1) == -9) {
                            statePc = 49;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var4_int = -1;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (null != gk.a(2, sp.field_g)) {
                            statePc = 53;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        bd.a("no target_menu ", (Throwable) null, false);
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 52: {
                    return;
                }
                case 53: {
                    try {
                        gk.a(2, sp.field_g).a(0, param0, var4_int);
                        if (8 != sp.field_g) {
                            statePc = 57;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        fc.a((byte) 127, param0);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var4, "bm.O(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                case 57: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final th a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        th var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ek var9 = null;
        int var10 = 0;
        th stackIn_10_0 = null;
        th stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = -86 / ((37 - param0) / 41);
                        var3 = new th();
                        var4 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if ((((bm) this).field_l.length ^ -1) >= (var4 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = ((bm) this).field_l[var4];
                        var6 = ((bm) this).field_l[1 + var4];
                        var7 = ((bm) this).field_l[2 + var4];
                        var8 = ((bm) this).field_l[3 + var4];
                        var9 = this.a(var7, var8, -8944, var6, var5);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var9 != null) {
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3.a((br) (Object) var9, false);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 += 4;
                        if (var10 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (th) var3;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var2, "bm.J(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int b(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-1 >= (param2 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = 0;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    try {
                        if (param1 < -59) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        int discarded$2 = this.a(-21, -32);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-1 >= (param0 ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        if ((((bm) this).field_g.length ^ -1) >= (param0 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    try {
                        if ((param2 ^ -1) > (((bm) this).field_g[0].length ^ -1)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        stackOut_18_0 = ((bm) this).field_g[param0][param2];
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0;
                }
                case 20: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var4, "bm.R(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param1 == 0) {
                break L0;
              } else {
                int discarded$2 = this.b(-118, (byte) -56, 0);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = param0 << 634971815;
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    bm(int[][] param0, int[] param1, int param2, int param3, int param4, int[] param5, int[] param6, int param7, int param8) {
        super(param0, param1, param2, param3, param4, param5, param6, param7, param8);
    }

    static {
    }
}
