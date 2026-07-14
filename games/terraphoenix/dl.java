/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl {
    boolean field_d;
    int field_j;
    boolean field_z;
    private int field_q;
    boolean field_a;
    r field_h;
    boolean field_w;
    int field_k;
    static int[] field_f;
    int field_b;
    dl field_C;
    int field_i;
    int field_p;
    int field_t;
    int field_A;
    int field_l;
    static String field_o;
    dl field_c;
    private boolean field_u;
    int field_x;
    boolean field_B;
    int field_g;
    static boolean[] field_y;
    int field_v;
    int field_r;
    dk field_s;
    int field_m;
    int field_e;
    int field_n;

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            if (param0 != 23943) {
                dl.a((java.applet.Applet) null, -65);
            }
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(bb.a((byte) 119, var2, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int a(boolean param0, byte param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        dl var9 = null;
        int var10 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_66_0 = 0;
        boolean stackIn_69_0 = false;
        int stackIn_82_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_111_0 = 0;
        Object stackIn_124_0 = null;
        int stackIn_135_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_146_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_153_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_167_0 = 0;
        int stackIn_170_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_178_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_208_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_222_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_229_0 = 0;
        dl stackIn_233_0 = null;
        int stackIn_240_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_247_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_264_0 = 0;
        int stackIn_268_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_284_0 = 0;
        int stackIn_290_0 = 0;
        int stackIn_296_0 = 0;
        int stackIn_302_0 = 0;
        int stackIn_308_0 = 0;
        int stackIn_331_0 = 0;
        int stackIn_335_0 = 0;
        int stackIn_339_0 = 0;
        int stackIn_345_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_356_0 = 0;
        int stackIn_361_0 = 0;
        int stackIn_373_0 = 0;
        int stackIn_379_0 = 0;
        int stackIn_393_0 = 0;
        int stackIn_399_0 = 0;
        int stackIn_405_0 = 0;
        dl stackIn_409_0 = null;
        int stackIn_415_0 = 0;
        int stackIn_417_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_65_0 = 0;
        boolean stackOut_68_0 = false;
        int stackOut_81_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_110_0 = 0;
        Object stackOut_123_0 = null;
        int stackOut_134_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_145_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_160_0 = 0;
        int stackOut_166_0 = 0;
        int stackOut_169_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_207_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_221_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_228_0 = 0;
        dl stackOut_232_0 = null;
        int stackOut_239_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_246_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_259_0 = 0;
        int stackOut_263_0 = 0;
        int stackOut_267_0 = 0;
        int stackOut_274_0 = 0;
        int stackOut_283_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_301_0 = 0;
        int stackOut_307_0 = 0;
        int stackOut_330_0 = 0;
        int stackOut_334_0 = 0;
        int stackOut_338_0 = 0;
        int stackOut_344_0 = 0;
        int stackOut_352_0 = 0;
        int stackOut_355_0 = 0;
        int stackOut_360_0 = 0;
        int stackOut_372_0 = 0;
        int stackOut_378_0 = 0;
        int stackOut_392_0 = 0;
        int stackOut_398_0 = 0;
        int stackOut_404_0 = 0;
        dl stackOut_408_0 = null;
        int stackOut_414_0 = 0;
        int stackOut_416_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -14) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((dl) this).a(56, true, -97);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (0 != (((dl) this).field_v ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = 10000;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        if (-3 == (((dl) this).field_v ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = 10000;
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        if (-4 == (((dl) this).field_v ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 10000;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        if (param0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((dl) this).field_v ^ -1) != -5) {
                            statePc = 38;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (((dl) this).field_C == null) {
                            statePc = 27;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = 10000;
                        stackIn_28_0 = stackOut_27_0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 28: {
                    return stackIn_28_0;
                }
                case 29: {
                    try {
                        if (((dl) this).field_C.field_h == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = 10000;
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    try {
                        if (0 != param2) {
                            statePc = 36;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-2 == (param3 ^ -1)) {
                            statePc = 38;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = 10000;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 37: {
                    return stackIn_37_0;
                }
                case 38: {
                    try {
                        if (5 == ((dl) this).field_v) {
                            statePc = 41;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (null != ((dl) this).field_c) {
                            statePc = 44;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = 10000;
                        stackIn_43_0 = stackOut_42_0;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 43: {
                    return stackIn_43_0;
                }
                case 44: {
                    try {
                        if (((dl) this).field_c.field_h != null) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackOut_47_0 = 10000;
                        stackIn_48_0 = stackOut_47_0;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 48: {
                    return stackIn_48_0;
                }
                case 49: {
                    try {
                        if (param2 != 0) {
                            statePc = 56;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (stackIn_51_0 != (param3 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        stackOut_56_0 = 10000;
                        stackIn_57_0 = stackOut_56_0;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 57: {
                    return stackIn_57_0;
                }
                case 58: {
                    try {
                        var5_int = ((dl) this).field_A + param2;
                        var6 = param3 + ((dl) this).field_n;
                        var7 = 4;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (param2 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param3 == 0) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        var7 = 6;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var8 = 0;
                        var9 = ((dl) this).field_s.a(param1 + 124, var6, ((dl) this).field_r, var5_int);
                        if (var9 != null) {
                            statePc = 67;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        stackOut_65_0 = 10000;
                        stackIn_66_0 = stackOut_65_0;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 66: {
                    return stackIn_66_0;
                }
                case 67: {
                    try {
                        if ((((dl) this).field_i ^ -1) == -1) {
                            statePc = 72;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        stackOut_68_0 = param0;
                        stackIn_69_0 = stackOut_68_0;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (stackIn_69_0) {
                            statePc = 276;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (!param0) {
                            statePc = 131;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (param2 != -1) {
                            statePc = 83;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (-2 != (((dl) this).field_e & 1 ^ -1)) {
                            statePc = 83;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackOut_81_0 = 10000;
                        stackIn_82_0 = stackOut_81_0;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 82: {
                    return stackIn_82_0;
                }
                case 83: {
                    try {
                        if (0 != (param3 ^ -1)) {
                            statePc = 89;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if ((2 & ((dl) this).field_e) != 2) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        stackOut_87_0 = 10000;
                        stackIn_88_0 = stackOut_87_0;
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 88: {
                    return stackIn_88_0;
                }
                case 89: {
                    try {
                        if (1 != param2) {
                            statePc = 95;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if ((4 & ((dl) this).field_e ^ -1) != -5) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        stackOut_93_0 = 10000;
                        stackIn_94_0 = stackOut_93_0;
                        statePc = 94;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 94: {
                    return stackIn_94_0;
                }
                case 95: {
                    try {
                        if (-2 != (param3 ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        if ((8 & ((dl) this).field_e ^ -1) != -9) {
                            statePc = 101;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        stackOut_99_0 = 10000;
                        stackIn_100_0 = stackOut_99_0;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 100: {
                    return stackIn_100_0;
                }
                case 101: {
                    try {
                        if (-1 != param2) {
                            statePc = 109;
                        } else {
                            statePc = 102;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        stackOut_102_0 = -17;
                        stackIn_103_0 = stackOut_102_0;
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        if (stackIn_103_0 == (((dl) this).field_e & 16 ^ -1)) {
                            statePc = 108;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 107;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        var8++;
                        var7 = 10;
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (param3 != -1) {
                            statePc = 117;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        stackOut_110_0 = 32;
                        stackIn_111_0 = stackOut_110_0;
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 113;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        if (stackIn_111_0 == (((dl) this).field_e & 32)) {
                            statePc = 116;
                        } else {
                            statePc = 112;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        var7 = 10;
                        var8++;
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if ((param2 ^ -1) != -2) {
                            statePc = 122;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        if (64 != (64 & ((dl) this).field_e)) {
                            statePc = 122;
                        } else {
                            statePc = 119;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 120;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        var7 = 10;
                        var8++;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if ((param3 ^ -1) != -2) {
                            statePc = 276;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = this;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if ((((dl) this).field_e & 128 ^ -1) == -129) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 276;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        var7 = 10;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        var8++;
                        if (var10 == 0) {
                            statePc = 276;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 133;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        if ((((dl) this).field_i ^ -1) == -2) {
                            statePc = 147;
                        } else {
                            statePc = 132;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        stackOut_134_0 = 0;
                        stackIn_135_0 = stackOut_134_0;
                        statePc = 135;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (stackIn_135_0 != (param2 ^ -1)) {
                            statePc = 147;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        stackOut_138_0 = 0;
                        stackIn_139_0 = stackOut_138_0;
                        statePc = 139;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 141;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        if (stackIn_139_0 != param3) {
                            statePc = 147;
                        } else {
                            statePc = 140;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        statePc = 142;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        if ((((dl) this).field_e & 1 ^ -1) != -2) {
                            statePc = 147;
                        } else {
                            statePc = 143;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 144;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        stackOut_145_0 = 10000;
                        stackIn_146_0 = stackOut_145_0;
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 146: {
                    return stackIn_146_0;
                }
                case 147: {
                    try {
                        if (-1 != param2) {
                            statePc = 168;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        stackOut_148_0 = param3;
                        stackIn_149_0 = stackOut_148_0;
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (stackIn_149_0 != -1) {
                            statePc = 168;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        stackOut_152_0 = -4;
                        stackIn_153_0 = stackOut_152_0;
                        statePc = 153;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (stackIn_153_0 == (3 & ((dl) this).field_e ^ -1)) {
                            statePc = 166;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        stackOut_156_0 = -6;
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
                        if (stackIn_157_0 == ((((dl) this).field_e & 1) - -(4 & var9.field_e) ^ -1)) {
                            statePc = 166;
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
                        stackOut_160_0 = 2;
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
                        if ((stackIn_161_0 & ((dl) this).field_e) + (8 & var9.field_e) == 10) {
                            statePc = 166;
                        } else {
                            statePc = 162;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        statePc = 164;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 168;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        stackOut_166_0 = 10000;
                        stackIn_167_0 = stackOut_166_0;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 167: {
                    return stackIn_167_0;
                }
                case 168: {
                    try {
                        if ((((dl) this).field_i ^ -1) == -3) {
                            statePc = 185;
                        } else {
                            statePc = 169;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        stackOut_169_0 = 0;
                        stackIn_170_0 = stackOut_169_0;
                        statePc = 170;
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        if (stackIn_170_0 != param2) {
                            statePc = 185;
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
                case 173: {
                    try {
                        stackOut_173_0 = -1;
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
                        if (stackIn_174_0 != param3) {
                            statePc = 185;
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
                        stackOut_177_0 = -3;
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
                        if (stackIn_178_0 == (((dl) this).field_e & 2 ^ -1)) {
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
                        statePc = 185;
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
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        stackOut_183_0 = 10000;
                        stackIn_184_0 = stackOut_183_0;
                        statePc = 184;
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 184: {
                    return stackIn_184_0;
                }
                case 185: {
                    try {
                        if (1 != param2) {
                            statePc = 206;
                        } else {
                            statePc = 186;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackOut_186_0 = param3;
                        stackIn_187_0 = stackOut_186_0;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if ((stackIn_187_0 ^ -1) != 0) {
                            statePc = 206;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = 6;
                        stackIn_191_0 = stackOut_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if ((stackIn_191_0 & ((dl) this).field_e) == 6) {
                            statePc = 204;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        stackOut_194_0 = -6;
                        stackIn_195_0 = stackOut_194_0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (stackIn_195_0 == ((1 & var9.field_e) + (4 & ((dl) this).field_e) ^ -1)) {
                            statePc = 204;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        stackOut_198_0 = -11;
                        stackIn_199_0 = stackOut_198_0;
                        statePc = 199;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 201;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        if (stackIn_199_0 == ((8 & var9.field_e) + (((dl) this).field_e & 2) ^ -1)) {
                            statePc = 204;
                        } else {
                            statePc = 200;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        statePc = 206;
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 203;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        stackOut_204_0 = 10000;
                        stackIn_205_0 = stackOut_204_0;
                        statePc = 205;
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 205: {
                    return stackIn_205_0;
                }
                case 206: {
                    try {
                        if (-5 == (((dl) this).field_i ^ -1)) {
                            statePc = 223;
                        } else {
                            statePc = 207;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        stackOut_207_0 = -2;
                        stackIn_208_0 = stackOut_207_0;
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        if (stackIn_208_0 != (param2 ^ -1)) {
                            statePc = 223;
                        } else {
                            statePc = 209;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        statePc = 211;
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        stackOut_211_0 = param3;
                        stackIn_212_0 = stackOut_211_0;
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 214;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        if ((stackIn_212_0 ^ -1) != -1) {
                            statePc = 223;
                        } else {
                            statePc = 213;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        statePc = 215;
                        continue stateLoop;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        stackOut_215_0 = -5;
                        stackIn_216_0 = stackOut_215_0;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 218;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        if (stackIn_216_0 == (((dl) this).field_e & 4 ^ -1)) {
                            statePc = 221;
                        } else {
                            statePc = 217;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 220;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        stackOut_221_0 = 10000;
                        stackIn_222_0 = stackOut_221_0;
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 222: {
                    return stackIn_222_0;
                }
                case 223: {
                    try {
                        if (param2 != 1) {
                            statePc = 241;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        stackOut_224_0 = -2;
                        stackIn_225_0 = stackOut_224_0;
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        if (stackIn_225_0 != (param3 ^ -1)) {
                            statePc = 241;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        stackOut_228_0 = -13;
                        stackIn_229_0 = stackOut_228_0;
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 231;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        if (stackIn_229_0 == (12 & ((dl) this).field_e ^ -1)) {
                            statePc = 239;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        statePc = 232;
                        continue stateLoop;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 231: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_231) {
                        caughtException = stateCaught_231;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 232: {
                    try {
                        stackOut_232_0 = (dl) var9;
                        stackIn_233_0 = stackOut_232_0;
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_232) {
                        caughtException = stateCaught_232;
                        statePc = 235;
                        continue stateLoop;
                    }
                }
                case 233: {
                    try {
                        if ((stackIn_233_0.field_e & 1) + (4 & ((dl) this).field_e) == 5) {
                            statePc = 239;
                        } else {
                            statePc = 234;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_233) {
                        caughtException = stateCaught_233;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 234: {
                    try {
                        statePc = 236;
                        continue stateLoop;
                    } catch (Throwable stateCaught_234) {
                        caughtException = stateCaught_234;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 235: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_235) {
                        caughtException = stateCaught_235;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 236: {
                    try {
                        if ((var9.field_e & 2) + (8 & ((dl) this).field_e) != 10) {
                            statePc = 241;
                        } else {
                            statePc = 237;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_236) {
                        caughtException = stateCaught_236;
                        statePc = 238;
                        continue stateLoop;
                    }
                }
                case 237: {
                    try {
                        statePc = 239;
                        continue stateLoop;
                    } catch (Throwable stateCaught_237) {
                        caughtException = stateCaught_237;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 238: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_238) {
                        caughtException = stateCaught_238;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 239: {
                    try {
                        stackOut_239_0 = 10000;
                        stackIn_240_0 = stackOut_239_0;
                        statePc = 240;
                        continue stateLoop;
                    } catch (Throwable stateCaught_239) {
                        caughtException = stateCaught_239;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 240: {
                    return stackIn_240_0;
                }
                case 241: {
                    try {
                        if (((dl) this).field_i == 8) {
                            statePc = 258;
                        } else {
                            statePc = 242;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_241) {
                        caughtException = stateCaught_241;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 242: {
                    try {
                        stackOut_242_0 = param2;
                        stackIn_243_0 = stackOut_242_0;
                        statePc = 243;
                        continue stateLoop;
                    } catch (Throwable stateCaught_242) {
                        caughtException = stateCaught_242;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 243: {
                    try {
                        if ((stackIn_243_0 ^ -1) != -1) {
                            statePc = 258;
                        } else {
                            statePc = 244;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_243) {
                        caughtException = stateCaught_243;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 244: {
                    try {
                        statePc = 246;
                        continue stateLoop;
                    } catch (Throwable stateCaught_244) {
                        caughtException = stateCaught_244;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 246: {
                    try {
                        stackOut_246_0 = param3;
                        stackIn_247_0 = stackOut_246_0;
                        statePc = 247;
                        continue stateLoop;
                    } catch (Throwable stateCaught_246) {
                        caughtException = stateCaught_246;
                        statePc = 249;
                        continue stateLoop;
                    }
                }
                case 247: {
                    try {
                        if ((stackIn_247_0 ^ -1) != -2) {
                            statePc = 258;
                        } else {
                            statePc = 248;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_247) {
                        caughtException = stateCaught_247;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 248: {
                    try {
                        statePc = 250;
                        continue stateLoop;
                    } catch (Throwable stateCaught_248) {
                        caughtException = stateCaught_248;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 249: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_249) {
                        caughtException = stateCaught_249;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 250: {
                    try {
                        stackOut_250_0 = 8;
                        stackIn_251_0 = stackOut_250_0;
                        statePc = 251;
                        continue stateLoop;
                    } catch (Throwable stateCaught_250) {
                        caughtException = stateCaught_250;
                        statePc = 253;
                        continue stateLoop;
                    }
                }
                case 251: {
                    try {
                        if (stackIn_251_0 == (((dl) this).field_e & 8)) {
                            statePc = 256;
                        } else {
                            statePc = 252;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_251) {
                        caughtException = stateCaught_251;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 252: {
                    try {
                        statePc = 254;
                        continue stateLoop;
                    } catch (Throwable stateCaught_252) {
                        caughtException = stateCaught_252;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 253: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_253) {
                        caughtException = stateCaught_253;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 254: {
                    try {
                        statePc = 258;
                        continue stateLoop;
                    } catch (Throwable stateCaught_254) {
                        caughtException = stateCaught_254;
                        statePc = 255;
                        continue stateLoop;
                    }
                }
                case 255: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_255) {
                        caughtException = stateCaught_255;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 256: {
                    try {
                        stackOut_256_0 = 10000;
                        stackIn_257_0 = stackOut_256_0;
                        statePc = 257;
                        continue stateLoop;
                    } catch (Throwable stateCaught_256) {
                        caughtException = stateCaught_256;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 257: {
                    return stackIn_257_0;
                }
                case 258: {
                    try {
                        if (-1 != param2) {
                            statePc = 276;
                        } else {
                            statePc = 259;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_258) {
                        caughtException = stateCaught_258;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 259: {
                    try {
                        stackOut_259_0 = 1;
                        stackIn_260_0 = stackOut_259_0;
                        statePc = 260;
                        continue stateLoop;
                    } catch (Throwable stateCaught_259) {
                        caughtException = stateCaught_259;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 260: {
                    try {
                        if (stackIn_260_0 != param3) {
                            statePc = 276;
                        } else {
                            statePc = 261;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_260) {
                        caughtException = stateCaught_260;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 261: {
                    try {
                        statePc = 263;
                        continue stateLoop;
                    } catch (Throwable stateCaught_261) {
                        caughtException = stateCaught_261;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 263: {
                    try {
                        stackOut_263_0 = -10;
                        stackIn_264_0 = stackOut_263_0;
                        statePc = 264;
                        continue stateLoop;
                    } catch (Throwable stateCaught_263) {
                        caughtException = stateCaught_263;
                        statePc = 266;
                        continue stateLoop;
                    }
                }
                case 264: {
                    try {
                        if (stackIn_264_0 == (((dl) this).field_e & 9 ^ -1)) {
                            statePc = 274;
                        } else {
                            statePc = 265;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_264) {
                        caughtException = stateCaught_264;
                        statePc = 270;
                        continue stateLoop;
                    }
                }
                case 265: {
                    try {
                        statePc = 267;
                        continue stateLoop;
                    } catch (Throwable stateCaught_265) {
                        caughtException = stateCaught_265;
                        statePc = 270;
                        continue stateLoop;
                    }
                }
                case 266: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_266) {
                        caughtException = stateCaught_266;
                        statePc = 270;
                        continue stateLoop;
                    }
                }
                case 267: {
                    try {
                        stackOut_267_0 = -6;
                        stackIn_268_0 = stackOut_267_0;
                        statePc = 268;
                        continue stateLoop;
                    } catch (Throwable stateCaught_267) {
                        caughtException = stateCaught_267;
                        statePc = 270;
                        continue stateLoop;
                    }
                }
                case 268: {
                    try {
                        if (stackIn_268_0 == ((4 & var9.field_e) + (((dl) this).field_e & 1) ^ -1)) {
                            statePc = 274;
                        } else {
                            statePc = 269;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_268) {
                        caughtException = stateCaught_268;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 269: {
                    try {
                        statePc = 271;
                        continue stateLoop;
                    } catch (Throwable stateCaught_269) {
                        caughtException = stateCaught_269;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 270: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_270) {
                        caughtException = stateCaught_270;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 271: {
                    try {
                        if ((var9.field_e & 2) + (((dl) this).field_e & 8) != 10) {
                            statePc = 276;
                        } else {
                            statePc = 272;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_271) {
                        caughtException = stateCaught_271;
                        statePc = 273;
                        continue stateLoop;
                    }
                }
                case 272: {
                    try {
                        statePc = 274;
                        continue stateLoop;
                    } catch (Throwable stateCaught_272) {
                        caughtException = stateCaught_272;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 273: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_273) {
                        caughtException = stateCaught_273;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 274: {
                    try {
                        stackOut_274_0 = 10000;
                        stackIn_275_0 = stackOut_274_0;
                        statePc = 275;
                        continue stateLoop;
                    } catch (Throwable stateCaught_274) {
                        caughtException = stateCaught_274;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 275: {
                    return stackIn_275_0;
                }
                case 276: {
                    try {
                        if (!param0) {
                            statePc = 346;
                        } else {
                            statePc = 277;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_276) {
                        caughtException = stateCaught_276;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 277: {
                    try {
                        if (-1 == (var9.field_i ^ -1)) {
                            statePc = 282;
                        } else {
                            statePc = 278;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_277) {
                        caughtException = stateCaught_277;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 278: {
                    try {
                        statePc = 280;
                        continue stateLoop;
                    } catch (Throwable stateCaught_278) {
                        caughtException = stateCaught_278;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 280: {
                    try {
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_280) {
                        caughtException = stateCaught_280;
                        statePc = 281;
                        continue stateLoop;
                    }
                }
                case 281: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_281) {
                        caughtException = stateCaught_281;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 282: {
                    try {
                        if (param2 != 1) {
                            statePc = 291;
                        } else {
                            statePc = 283;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_282) {
                        caughtException = stateCaught_282;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 283: {
                    try {
                        stackOut_283_0 = -2;
                        stackIn_284_0 = stackOut_283_0;
                        statePc = 284;
                        continue stateLoop;
                    } catch (Throwable stateCaught_283) {
                        caughtException = stateCaught_283;
                        statePc = 286;
                        continue stateLoop;
                    }
                }
                case 284: {
                    try {
                        if (stackIn_284_0 == (var9.field_e & 1 ^ -1)) {
                            statePc = 289;
                        } else {
                            statePc = 285;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_284) {
                        caughtException = stateCaught_284;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 285: {
                    try {
                        statePc = 287;
                        continue stateLoop;
                    } catch (Throwable stateCaught_285) {
                        caughtException = stateCaught_285;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 286: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_286) {
                        caughtException = stateCaught_286;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 287: {
                    try {
                        statePc = 291;
                        continue stateLoop;
                    } catch (Throwable stateCaught_287) {
                        caughtException = stateCaught_287;
                        statePc = 288;
                        continue stateLoop;
                    }
                }
                case 288: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_288) {
                        caughtException = stateCaught_288;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 289: {
                    try {
                        stackOut_289_0 = 10000;
                        stackIn_290_0 = stackOut_289_0;
                        statePc = 290;
                        continue stateLoop;
                    } catch (Throwable stateCaught_289) {
                        caughtException = stateCaught_289;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 290: {
                    return stackIn_290_0;
                }
                case 291: {
                    try {
                        if (-2 != (param3 ^ -1)) {
                            statePc = 297;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_291) {
                        caughtException = stateCaught_291;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 292: {
                    try {
                        if ((2 & var9.field_e) != 2) {
                            statePc = 297;
                        } else {
                            statePc = 293;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_292) {
                        caughtException = stateCaught_292;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 293: {
                    try {
                        statePc = 295;
                        continue stateLoop;
                    } catch (Throwable stateCaught_293) {
                        caughtException = stateCaught_293;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 295: {
                    try {
                        stackOut_295_0 = 10000;
                        stackIn_296_0 = stackOut_295_0;
                        statePc = 296;
                        continue stateLoop;
                    } catch (Throwable stateCaught_295) {
                        caughtException = stateCaught_295;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 296: {
                    return stackIn_296_0;
                }
                case 297: {
                    try {
                        if ((param2 ^ -1) != 0) {
                            statePc = 303;
                        } else {
                            statePc = 298;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_297) {
                        caughtException = stateCaught_297;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 298: {
                    try {
                        if (-5 != (var9.field_e & 4 ^ -1)) {
                            statePc = 303;
                        } else {
                            statePc = 299;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_298) {
                        caughtException = stateCaught_298;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 299: {
                    try {
                        statePc = 301;
                        continue stateLoop;
                    } catch (Throwable stateCaught_299) {
                        caughtException = stateCaught_299;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 301: {
                    try {
                        stackOut_301_0 = 10000;
                        stackIn_302_0 = stackOut_301_0;
                        statePc = 302;
                        continue stateLoop;
                    } catch (Throwable stateCaught_301) {
                        caughtException = stateCaught_301;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 302: {
                    return stackIn_302_0;
                }
                case 303: {
                    try {
                        if (param3 != -1) {
                            statePc = 309;
                        } else {
                            statePc = 304;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_303) {
                        caughtException = stateCaught_303;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 304: {
                    try {
                        if ((var9.field_e & 8 ^ -1) != -9) {
                            statePc = 309;
                        } else {
                            statePc = 305;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_304) {
                        caughtException = stateCaught_304;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 305: {
                    try {
                        statePc = 307;
                        continue stateLoop;
                    } catch (Throwable stateCaught_305) {
                        caughtException = stateCaught_305;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 307: {
                    try {
                        stackOut_307_0 = 10000;
                        stackIn_308_0 = stackOut_307_0;
                        statePc = 308;
                        continue stateLoop;
                    } catch (Throwable stateCaught_307) {
                        caughtException = stateCaught_307;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 308: {
                    return stackIn_308_0;
                }
                case 309: {
                    try {
                        if (-2 != (param2 ^ -1)) {
                            statePc = 314;
                        } else {
                            statePc = 310;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_309) {
                        caughtException = stateCaught_309;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 310: {
                    try {
                        if (-17 != (var9.field_e & 16 ^ -1)) {
                            statePc = 314;
                        } else {
                            statePc = 311;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_310) {
                        caughtException = stateCaught_310;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 311: {
                    try {
                        statePc = 313;
                        continue stateLoop;
                    } catch (Throwable stateCaught_311) {
                        caughtException = stateCaught_311;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 313: {
                    try {
                        var8++;
                        var7 = 10;
                        statePc = 314;
                        continue stateLoop;
                    } catch (Throwable stateCaught_313) {
                        caughtException = stateCaught_313;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 314: {
                    try {
                        if (1 != param3) {
                            statePc = 319;
                        } else {
                            statePc = 315;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_314) {
                        caughtException = stateCaught_314;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 315: {
                    try {
                        if ((32 & var9.field_e ^ -1) != -33) {
                            statePc = 319;
                        } else {
                            statePc = 316;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_315) {
                        caughtException = stateCaught_315;
                        statePc = 317;
                        continue stateLoop;
                    }
                }
                case 316: {
                    try {
                        statePc = 318;
                        continue stateLoop;
                    } catch (Throwable stateCaught_316) {
                        caughtException = stateCaught_316;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 317: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_317) {
                        caughtException = stateCaught_317;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 318: {
                    try {
                        var7 = 10;
                        var8++;
                        statePc = 319;
                        continue stateLoop;
                    } catch (Throwable stateCaught_318) {
                        caughtException = stateCaught_318;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 319: {
                    try {
                        if (0 != (param2 ^ -1)) {
                            statePc = 324;
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
                        if (-65 != (64 & var9.field_e ^ -1)) {
                            statePc = 324;
                        } else {
                            statePc = 321;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_320) {
                        caughtException = stateCaught_320;
                        statePc = 322;
                        continue stateLoop;
                    }
                }
                case 321: {
                    try {
                        statePc = 323;
                        continue stateLoop;
                    } catch (Throwable stateCaught_321) {
                        caughtException = stateCaught_321;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 322: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_322) {
                        caughtException = stateCaught_322;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 323: {
                    try {
                        var7 = 10;
                        var8++;
                        statePc = 324;
                        continue stateLoop;
                    } catch (Throwable stateCaught_323) {
                        caughtException = stateCaught_323;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 324: {
                    try {
                        if ((param3 ^ -1) != 0) {
                            statePc = 329;
                        } else {
                            statePc = 325;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_324) {
                        caughtException = stateCaught_324;
                        statePc = 327;
                        continue stateLoop;
                    }
                }
                case 325: {
                    try {
                        if ((128 & var9.field_e) != 128) {
                            statePc = 329;
                        } else {
                            statePc = 326;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_325) {
                        caughtException = stateCaught_325;
                        statePc = 327;
                        continue stateLoop;
                    }
                }
                case 326: {
                    try {
                        statePc = 328;
                        continue stateLoop;
                    } catch (Throwable stateCaught_326) {
                        caughtException = stateCaught_326;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 327: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_327) {
                        caughtException = stateCaught_327;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 328: {
                    try {
                        var7 = 10;
                        var8++;
                        statePc = 329;
                        continue stateLoop;
                    } catch (Throwable stateCaught_328) {
                        caughtException = stateCaught_328;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 329: {
                    try {
                        if (var8 > 2) {
                            statePc = 344;
                        } else {
                            statePc = 330;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_329) {
                        caughtException = stateCaught_329;
                        statePc = 333;
                        continue stateLoop;
                    }
                }
                case 330: {
                    try {
                        stackOut_330_0 = param2;
                        stackIn_331_0 = stackOut_330_0;
                        statePc = 331;
                        continue stateLoop;
                    } catch (Throwable stateCaught_330) {
                        caughtException = stateCaught_330;
                        statePc = 333;
                        continue stateLoop;
                    }
                }
                case 331: {
                    try {
                        if (stackIn_331_0 == 0) {
                            statePc = 346;
                        } else {
                            statePc = 332;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_331) {
                        caughtException = stateCaught_331;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 332: {
                    try {
                        statePc = 334;
                        continue stateLoop;
                    } catch (Throwable stateCaught_332) {
                        caughtException = stateCaught_332;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 333: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_333) {
                        caughtException = stateCaught_333;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 334: {
                    try {
                        stackOut_334_0 = param3;
                        stackIn_335_0 = stackOut_334_0;
                        statePc = 335;
                        continue stateLoop;
                    } catch (Throwable stateCaught_334) {
                        caughtException = stateCaught_334;
                        statePc = 337;
                        continue stateLoop;
                    }
                }
                case 335: {
                    try {
                        if (stackIn_335_0 == 0) {
                            statePc = 346;
                        } else {
                            statePc = 336;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_335) {
                        caughtException = stateCaught_335;
                        statePc = 341;
                        continue stateLoop;
                    }
                }
                case 336: {
                    try {
                        statePc = 338;
                        continue stateLoop;
                    } catch (Throwable stateCaught_336) {
                        caughtException = stateCaught_336;
                        statePc = 341;
                        continue stateLoop;
                    }
                }
                case 337: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_337) {
                        caughtException = stateCaught_337;
                        statePc = 341;
                        continue stateLoop;
                    }
                }
                case 338: {
                    try {
                        stackOut_338_0 = -1;
                        stackIn_339_0 = stackOut_338_0;
                        statePc = 339;
                        continue stateLoop;
                    } catch (Throwable stateCaught_338) {
                        caughtException = stateCaught_338;
                        statePc = 341;
                        continue stateLoop;
                    }
                }
                case 339: {
                    try {
                        if (stackIn_339_0 > (var8 ^ -1)) {
                            statePc = 344;
                        } else {
                            statePc = 340;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_339) {
                        caughtException = stateCaught_339;
                        statePc = 343;
                        continue stateLoop;
                    }
                }
                case 340: {
                    try {
                        statePc = 342;
                        continue stateLoop;
                    } catch (Throwable stateCaught_340) {
                        caughtException = stateCaught_340;
                        statePc = 343;
                        continue stateLoop;
                    }
                }
                case 341: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_341) {
                        caughtException = stateCaught_341;
                        statePc = 343;
                        continue stateLoop;
                    }
                }
                case 342: {
                    try {
                        statePc = 346;
                        continue stateLoop;
                    } catch (Throwable stateCaught_342) {
                        caughtException = stateCaught_342;
                        statePc = 343;
                        continue stateLoop;
                    }
                }
                case 343: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_343) {
                        caughtException = stateCaught_343;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 344: {
                    try {
                        stackOut_344_0 = 10000;
                        stackIn_345_0 = stackOut_344_0;
                        statePc = 345;
                        continue stateLoop;
                    } catch (Throwable stateCaught_344) {
                        caughtException = stateCaught_344;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 345: {
                    return stackIn_345_0;
                }
                case 346: {
                    try {
                        if (param0) {
                            statePc = 349;
                        } else {
                            statePc = 347;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_346) {
                        caughtException = stateCaught_346;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 347: {
                    try {
                        statePc = 416;
                        continue stateLoop;
                    } catch (Throwable stateCaught_347) {
                        caughtException = stateCaught_347;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 349: {
                    try {
                        if (-3 == (var9.field_v ^ -1)) {
                            statePc = 352;
                        } else {
                            statePc = 350;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_349) {
                        caughtException = stateCaught_349;
                        statePc = 351;
                        continue stateLoop;
                    }
                }
                case 350: {
                    try {
                        statePc = 354;
                        continue stateLoop;
                    } catch (Throwable stateCaught_350) {
                        caughtException = stateCaught_350;
                        statePc = 351;
                        continue stateLoop;
                    }
                }
                case 351: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_351) {
                        caughtException = stateCaught_351;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 352: {
                    try {
                        stackOut_352_0 = 10000;
                        stackIn_353_0 = stackOut_352_0;
                        statePc = 353;
                        continue stateLoop;
                    } catch (Throwable stateCaught_352) {
                        caughtException = stateCaught_352;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 353: {
                    return stackIn_353_0;
                }
                case 354: {
                    try {
                        if (3 != var9.field_v) {
                            statePc = 357;
                        } else {
                            statePc = 355;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_354) {
                        caughtException = stateCaught_354;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 355: {
                    try {
                        stackOut_355_0 = 10000;
                        stackIn_356_0 = stackOut_355_0;
                        statePc = 356;
                        continue stateLoop;
                    } catch (Throwable stateCaught_355) {
                        caughtException = stateCaught_355;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 356: {
                    return stackIn_356_0;
                }
                case 357: {
                    try {
                        if ((var9.field_v ^ -1) == 0) {
                            statePc = 360;
                        } else {
                            statePc = 358;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_357) {
                        caughtException = stateCaught_357;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 358: {
                    try {
                        statePc = 362;
                        continue stateLoop;
                    } catch (Throwable stateCaught_358) {
                        caughtException = stateCaught_358;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 360: {
                    try {
                        stackOut_360_0 = 10000;
                        stackIn_361_0 = stackOut_360_0;
                        statePc = 361;
                        continue stateLoop;
                    } catch (Throwable stateCaught_360) {
                        caughtException = stateCaught_360;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 361: {
                    return stackIn_361_0;
                }
                case 362: {
                    try {
                        if (1 == var9.field_v) {
                            statePc = 365;
                        } else {
                            statePc = 363;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_362) {
                        caughtException = stateCaught_362;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 363: {
                    try {
                        statePc = 366;
                        continue stateLoop;
                    } catch (Throwable stateCaught_363) {
                        caughtException = stateCaught_363;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 365: {
                    try {
                        var7 += 4;
                        statePc = 366;
                        continue stateLoop;
                    } catch (Throwable stateCaught_365) {
                        caughtException = stateCaught_365;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 366: {
                    try {
                        if (var9.field_v != 4) {
                            statePc = 380;
                        } else {
                            statePc = 367;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_366) {
                        caughtException = stateCaught_366;
                        statePc = 369;
                        continue stateLoop;
                    }
                }
                case 367: {
                    try {
                        if (var9.field_C.field_h != null) {
                            statePc = 372;
                        } else {
                            statePc = 368;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_367) {
                        caughtException = stateCaught_367;
                        statePc = 371;
                        continue stateLoop;
                    }
                }
                case 368: {
                    try {
                        statePc = 370;
                        continue stateLoop;
                    } catch (Throwable stateCaught_368) {
                        caughtException = stateCaught_368;
                        statePc = 371;
                        continue stateLoop;
                    }
                }
                case 369: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_369) {
                        caughtException = stateCaught_369;
                        statePc = 371;
                        continue stateLoop;
                    }
                }
                case 370: {
                    try {
                        statePc = 374;
                        continue stateLoop;
                    } catch (Throwable stateCaught_370) {
                        caughtException = stateCaught_370;
                        statePc = 371;
                        continue stateLoop;
                    }
                }
                case 371: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_371) {
                        caughtException = stateCaught_371;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 372: {
                    try {
                        stackOut_372_0 = 10000;
                        stackIn_373_0 = stackOut_372_0;
                        statePc = 373;
                        continue stateLoop;
                    } catch (Throwable stateCaught_372) {
                        caughtException = stateCaught_372;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 373: {
                    return stackIn_373_0;
                }
                case 374: {
                    try {
                        if ((param2 ^ -1) != -1) {
                            statePc = 378;
                        } else {
                            statePc = 375;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_374) {
                        caughtException = stateCaught_374;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 375: {
                    try {
                        if (0 == (param3 ^ -1)) {
                            statePc = 380;
                        } else {
                            statePc = 376;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_375) {
                        caughtException = stateCaught_375;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 376: {
                    try {
                        statePc = 378;
                        continue stateLoop;
                    } catch (Throwable stateCaught_376) {
                        caughtException = stateCaught_376;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 378: {
                    try {
                        stackOut_378_0 = 10000;
                        stackIn_379_0 = stackOut_378_0;
                        statePc = 379;
                        continue stateLoop;
                    } catch (Throwable stateCaught_378) {
                        caughtException = stateCaught_378;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 379: {
                    return stackIn_379_0;
                }
                case 380: {
                    try {
                        if (5 == var9.field_v) {
                            statePc = 383;
                        } else {
                            statePc = 381;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_380) {
                        caughtException = stateCaught_380;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 381: {
                    try {
                        statePc = 400;
                        continue stateLoop;
                    } catch (Throwable stateCaught_381) {
                        caughtException = stateCaught_381;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 383: {
                    try {
                        if (null != var9.field_c) {
                            statePc = 387;
                        } else {
                            statePc = 384;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_383) {
                        caughtException = stateCaught_383;
                        statePc = 386;
                        continue stateLoop;
                    }
                }
                case 384: {
                    try {
                        var9.field_v = 0;
                        if (var10 == 0) {
                            statePc = 394;
                        } else {
                            statePc = 385;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_384) {
                        caughtException = stateCaught_384;
                        statePc = 389;
                        continue stateLoop;
                    }
                }
                case 385: {
                    try {
                        statePc = 387;
                        continue stateLoop;
                    } catch (Throwable stateCaught_385) {
                        caughtException = stateCaught_385;
                        statePc = 389;
                        continue stateLoop;
                    }
                }
                case 386: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_386) {
                        caughtException = stateCaught_386;
                        statePc = 389;
                        continue stateLoop;
                    }
                }
                case 387: {
                    try {
                        if (null != var9.field_c.field_h) {
                            statePc = 392;
                        } else {
                            statePc = 388;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_387) {
                        caughtException = stateCaught_387;
                        statePc = 391;
                        continue stateLoop;
                    }
                }
                case 388: {
                    try {
                        statePc = 390;
                        continue stateLoop;
                    } catch (Throwable stateCaught_388) {
                        caughtException = stateCaught_388;
                        statePc = 391;
                        continue stateLoop;
                    }
                }
                case 389: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_389) {
                        caughtException = stateCaught_389;
                        statePc = 391;
                        continue stateLoop;
                    }
                }
                case 390: {
                    try {
                        statePc = 394;
                        continue stateLoop;
                    } catch (Throwable stateCaught_390) {
                        caughtException = stateCaught_390;
                        statePc = 391;
                        continue stateLoop;
                    }
                }
                case 391: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_391) {
                        caughtException = stateCaught_391;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 392: {
                    try {
                        stackOut_392_0 = 10000;
                        stackIn_393_0 = stackOut_392_0;
                        statePc = 393;
                        continue stateLoop;
                    } catch (Throwable stateCaught_392) {
                        caughtException = stateCaught_392;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 393: {
                    return stackIn_393_0;
                }
                case 394: {
                    try {
                        if ((param2 ^ -1) != -1) {
                            statePc = 398;
                        } else {
                            statePc = 395;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_394) {
                        caughtException = stateCaught_394;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 395: {
                    try {
                        if ((param3 ^ -1) == -2) {
                            statePc = 400;
                        } else {
                            statePc = 396;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_395) {
                        caughtException = stateCaught_395;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 396: {
                    try {
                        statePc = 398;
                        continue stateLoop;
                    } catch (Throwable stateCaught_396) {
                        caughtException = stateCaught_396;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 398: {
                    try {
                        stackOut_398_0 = 10000;
                        stackIn_399_0 = stackOut_398_0;
                        statePc = 399;
                        continue stateLoop;
                    } catch (Throwable stateCaught_398) {
                        caughtException = stateCaught_398;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 399: {
                    return stackIn_399_0;
                }
                case 400: {
                    try {
                        if (null != var9.field_h) {
                            statePc = 403;
                        } else {
                            statePc = 401;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_400) {
                        caughtException = stateCaught_400;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 401: {
                    try {
                        statePc = 416;
                        continue stateLoop;
                    } catch (Throwable stateCaught_401) {
                        caughtException = stateCaught_401;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 403: {
                    try {
                        if (var9.field_h.field_k) {
                            statePc = 414;
                        } else {
                            statePc = 404;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_403) {
                        caughtException = stateCaught_403;
                        statePc = 407;
                        continue stateLoop;
                    }
                }
                case 404: {
                    try {
                        stackOut_404_0 = -1;
                        stackIn_405_0 = stackOut_404_0;
                        statePc = 405;
                        continue stateLoop;
                    } catch (Throwable stateCaught_404) {
                        caughtException = stateCaught_404;
                        statePc = 407;
                        continue stateLoop;
                    }
                }
                case 405: {
                    try {
                        if (stackIn_405_0 == (var9.field_h.field_C ^ -1)) {
                            statePc = 414;
                        } else {
                            statePc = 406;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_405) {
                        caughtException = stateCaught_405;
                        statePc = 411;
                        continue stateLoop;
                    }
                }
                case 406: {
                    try {
                        statePc = 408;
                        continue stateLoop;
                    } catch (Throwable stateCaught_406) {
                        caughtException = stateCaught_406;
                        statePc = 411;
                        continue stateLoop;
                    }
                }
                case 407: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_407) {
                        caughtException = stateCaught_407;
                        statePc = 411;
                        continue stateLoop;
                    }
                }
                case 408: {
                    try {
                        stackOut_408_0 = (dl) var9;
                        stackIn_409_0 = stackOut_408_0;
                        statePc = 409;
                        continue stateLoop;
                    } catch (Throwable stateCaught_408) {
                        caughtException = stateCaught_408;
                        statePc = 411;
                        continue stateLoop;
                    }
                }
                case 409: {
                    try {
                        if (!stackIn_409_0.field_s.field_i.field_J) {
                            statePc = 414;
                        } else {
                            statePc = 410;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_409) {
                        caughtException = stateCaught_409;
                        statePc = 413;
                        continue stateLoop;
                    }
                }
                case 410: {
                    try {
                        statePc = 412;
                        continue stateLoop;
                    } catch (Throwable stateCaught_410) {
                        caughtException = stateCaught_410;
                        statePc = 413;
                        continue stateLoop;
                    }
                }
                case 411: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_411) {
                        caughtException = stateCaught_411;
                        statePc = 413;
                        continue stateLoop;
                    }
                }
                case 412: {
                    try {
                        statePc = 416;
                        continue stateLoop;
                    } catch (Throwable stateCaught_412) {
                        caughtException = stateCaught_412;
                        statePc = 413;
                        continue stateLoop;
                    }
                }
                case 413: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_413) {
                        caughtException = stateCaught_413;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 414: {
                    try {
                        stackOut_414_0 = 10000;
                        stackIn_415_0 = stackOut_414_0;
                        statePc = 415;
                        continue stateLoop;
                    } catch (Throwable stateCaught_414) {
                        caughtException = stateCaught_414;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 415: {
                    return stackIn_415_0;
                }
                case 416: {
                    try {
                        stackOut_416_0 = var7;
                        stackIn_417_0 = stackOut_416_0;
                        statePc = 417;
                        continue stateLoop;
                    } catch (Throwable stateCaught_416) {
                        caughtException = stateCaught_416;
                        statePc = 418;
                        continue stateLoop;
                    }
                }
                case 417: {
                    return stackIn_417_0;
                }
                case 418: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var5, "dl.L(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        dl var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_55_0 = null;
        int stackOut_13_0 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_54_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param0 = param0 << 1755925988;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var5 = -53 % ((19 - param2) / 59);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((((dl) this).field_e & param0) == param0) {
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
                        ((dl) this).field_e = ((dl) this).field_e + param0;
                        if (var7 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((dl) this).field_e = ((dl) this).field_e - param0;
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
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var4_ref = null;
                        var6 = 0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (param0 != 1) {
                            statePc = 20;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = -1;
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
                        if (stackIn_14_0 > (((dl) this).field_A ^ -1)) {
                            statePc = 19;
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
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var4_ref = ((dl) this).field_s.a(-87, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A);
                        var6 = 4;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((param0 ^ -1) != -3) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((((dl) this).field_n ^ -1) >= -1) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var4_ref = ((dl) this).field_s.a(-52, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A);
                        var6 = 8;
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
                        if (4 != param0) {
                            statePc = 30;
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
                        if ((((dl) this).field_A ^ -1) <= (((dl) this).field_s.field_b - 1 ^ -1)) {
                            statePc = 30;
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
                        var6 = 1;
                        var4_ref = ((dl) this).field_s.a(97, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A);
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
                        if (8 != param0) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if ((((dl) this).field_s.field_e - 1 ^ -1) >= (((dl) this).field_n ^ -1)) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var6 = 2;
                        var4_ref = ((dl) this).field_s.a(87, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (-17 != (param0 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (-1 <= (((dl) this).field_A ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        var4_ref = ((dl) this).field_s.a(110, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1);
                        var6 = 64;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (-33 != (param0 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackOut_41_0 = this;
                        stackIn_42_0 = stackOut_41_0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((dl) this).field_n > 0) {
                            statePc = 47;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 46;
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
                        var4_ref = ((dl) this).field_s.a(94, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A);
                        var6 = 128;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (64 != param0) {
                            statePc = 53;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if ((-1 + ((dl) this).field_s.field_b ^ -1) >= (((dl) this).field_A ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var6 = 16;
                        var4_ref = ((dl) this).field_s.a(-119, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (128 != param0) {
                            statePc = 61;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        stackOut_54_0 = this;
                        stackIn_55_0 = stackOut_54_0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((((dl) this).field_n ^ -1) > (((dl) this).field_s.field_e + -1 ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var6 = 32;
                        var4_ref = ((dl) this).field_s.a(-85, ((dl) this).field_n - -1, ((dl) this).field_r, ((dl) this).field_A);
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (null == var4_ref) {
                            statePc = 73;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 64;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        if ((var6 & var4_ref.field_e) == var6) {
                            statePc = 68;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 67;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var4_ref.field_e = var4_ref.field_e + var6;
                        if (var7 == 0) {
                            statePc = 73;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var4_ref.field_e = var4_ref.field_e - var6;
                        statePc = 69;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 72;
                        continue stateLoop;
                    }
                }
                case 72: {
                    var4 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var4, "dl.I(" + param0 + 44 + param1 + 44 + param2 + 41);
                }
                case 73: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            int var3 = 0;
            String var4 = null;
            java.net.URL var5 = null;
            if (param1 != -6242) {
                dl.b(-103);
            }
            try {
                var2 = param0.getDocumentBase().getFile();
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if (-1 >= (var3 ^ -1)) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(bb.a((byte) 124, var5, param0), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        try {
          try {
            L0: {
              if (param2 < -105) {
                break L0;
              } else {
                ((dl) this).field_i = -65;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(true, (byte) -14, param1, param0);
          stackIn_5_0 = stackOut_4_0;
        }
        return 0;
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (-1 == ((dl) this).field_b) {
                            statePc = 4;
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
                        ((dl) this).field_b = ck.field_f[((dl) this).field_b];
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-1 >= (((dl) this).field_j ^ -1)) {
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
                        statePc = 11;
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((dl) this).field_j = hb.field_h[((dl) this).field_j];
                        if ((((dl) this).field_j ^ -1) < 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((dl) this).field_v = nc.field_a[((dl) this).field_j];
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!param0) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((dl) this).field_n = 46;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var2, "dl.D(" + param0 + 41);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param0 == -32) {
                break L0;
              } else {
                dl.a((java.applet.Applet) null, -53);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_o = null;
          field_y = null;
          field_f = null;
        }
    }

    final int a(int param0, int param1, int param2, int param3) {
        Object var5 = null;
        dl var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var6 = 0;
        dl stackIn_8_0 = null;
        dl stackIn_10_0 = null;
        int stackIn_15_0 = 0;
        dl stackIn_17_0 = null;
        int stackIn_18_0 = 0;
        dl stackOut_7_0 = null;
        dl stackOut_8_0 = null;
        int stackOut_14_0 = 0;
        dl stackOut_16_0 = null;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Terraphoenix.field_V;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = this;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param1 == 1000) {
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
                        ((dl) this).field_h = null;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((param2 ^ -1) >= (((dl) var5).field_r ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = ((dl) var5).field_C;
                        stackIn_17_0 = stackOut_7_0;
                        stackIn_8_0 = stackOut_7_0;
                        if (var6 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (dl) (Object) stackIn_8_0;
                        stackIn_10_0 = stackOut_8_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5_ref = stackIn_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == var5_ref) {
                            statePc = 14;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 1000;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0;
                }
                case 16: {
                    try {
                        stackOut_16_0 = (dl) var5_ref;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackOut_17_0 = ((dl) (Object) stackIn_17_0).a(true, (byte) -14, param3, param0);
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var5_ref2, "dl.C(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, int param1, ci param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
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
                    try {
                        if (-257 == (param4 ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        param2.b(param0, param1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return;
                }
                case 5: {
                    try {
                        param1 = param1 + param2.field_v;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param3 == 17335) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((dl) this).field_r = -16;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        param0 = param0 + param2.field_p;
                        var6_int = param0 + param1 * l.field_k;
                        var7 = 0;
                        var8 = param2.field_t;
                        var9 = param2.field_r;
                        var10 = l.field_k + -var9;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param1 < l.field_d) {
                            statePc = 14;
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
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var12 = l.field_d + -param1;
                        param1 = l.field_d;
                        var8 = var8 - var12;
                        var6_int = var6_int + var12 * l.field_k;
                        var7 = var7 + var9 * var12;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var11 = 0;
                        if ((l.field_c ^ -1) <= (var8 + param1 ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var8 = var8 - (-l.field_c + var8 + param1);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (l.field_b > param0) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var12 = l.field_b - param0;
                        var9 = var9 - var12;
                        var7 = var7 + var12;
                        var10 = var10 + var12;
                        var6_int = var6_int + var12;
                        var11 = var11 + var12;
                        param0 = l.field_b;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var9 + param0 ^ -1) < (l.field_f ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var12 = -l.field_f + (param0 - -var9);
                        var9 = var9 - var12;
                        var10 = var10 + var12;
                        var11 = var11 + var12;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (-1 <= (var9 ^ -1)) {
                            statePc = 29;
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
                        if (0 < var8) {
                            statePc = 30;
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
                    return;
                }
                case 30: {
                    try {
                        qc.a(l.field_i, var10, param2.field_z, var7, param4, var11, var8, param3 ^ 16729015, 0, var9, var6_int);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var6 = (RuntimeException) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        stackOut_33_0 = (RuntimeException) var6;
                        stackOut_33_1 = new StringBuilder().append("dl.K(").append(param0).append(44).append(param1).append(44);
                        stackIn_36_0 = stackOut_33_0;
                        stackIn_36_1 = stackOut_33_1;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        if (param2 == null) {
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
                    throw qk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this.a(false, (byte) -14, 1, 0);
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0;
                }
                case 5: {
                    try {
                        if (param1 == 1) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = this.a(false, (byte) -14, 1, 1);
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        if (2 != param1) {
                            statePc = 13;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackOut_11_0 = this.a(false, (byte) -14, 0, 1);
                        stackIn_12_0 = stackOut_11_0;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        if (3 == param1) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = this.a(false, (byte) -14, -1, 1);
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        var3_int = -62 % ((param0 - -46) / 50);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (param1 == 4) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = this.a(false, (byte) -14, -1, 0);
                        stackIn_23_0 = stackOut_22_0;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 23: {
                    return stackIn_23_0;
                }
                case 24: {
                    try {
                        if ((param1 ^ -1) != -6) {
                            statePc = 27;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = this.a(false, (byte) -14, -1, -1);
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 26: {
                    return stackIn_26_0;
                }
                case 27: {
                    try {
                        if (param1 == 6) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackOut_30_0 = this.a(false, (byte) -14, 0, -1);
                        stackIn_31_0 = stackOut_30_0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 31: {
                    return stackIn_31_0;
                }
                case 32: {
                    try {
                        if ((param1 ^ -1) == -8) {
                            statePc = 35;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = this.a(false, (byte) -14, 1, -1);
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    return stackIn_36_0;
                }
                case 37: {
                    try {
                        stackOut_37_0 = 1000;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    return stackIn_38_0;
                }
                case 39: {
                    var3 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var3, "dl.H(" + param0 + 44 + param1 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(int param0, int param1, gi[] param2, int param3, byte param4, boolean param5) {
        int var7_int = 0;
        int var8 = 0;
        ci var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        bg var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_67_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_267_0 = 0;
        int stackIn_396_0 = 0;
        int stackIn_406_0 = 0;
        Object stackIn_531_0 = null;
        int stackIn_531_1 = 0;
        int stackIn_531_2 = 0;
        ci stackIn_531_3 = null;
        int stackIn_531_4 = 0;
        Object stackIn_532_0 = null;
        int stackIn_532_1 = 0;
        int stackIn_532_2 = 0;
        ci stackIn_532_3 = null;
        int stackIn_532_4 = 0;
        Object stackIn_533_0 = null;
        int stackIn_533_1 = 0;
        int stackIn_533_2 = 0;
        ci stackIn_533_3 = null;
        int stackIn_533_4 = 0;
        Object stackIn_534_0 = null;
        int stackIn_534_1 = 0;
        int stackIn_534_2 = 0;
        ci stackIn_534_3 = null;
        int stackIn_534_4 = 0;
        Object stackIn_535_0 = null;
        int stackIn_535_1 = 0;
        int stackIn_535_2 = 0;
        ci stackIn_535_3 = null;
        int stackIn_535_4 = 0;
        Object stackIn_536_0 = null;
        int stackIn_536_1 = 0;
        int stackIn_536_2 = 0;
        ci stackIn_536_3 = null;
        int stackIn_536_4 = 0;
        int stackIn_536_5 = 0;
        Object stackIn_538_0 = null;
        int stackIn_538_1 = 0;
        int stackIn_538_2 = 0;
        ci stackIn_538_3 = null;
        int stackIn_538_4 = 0;
        Object stackIn_539_0 = null;
        int stackIn_539_1 = 0;
        int stackIn_539_2 = 0;
        ci stackIn_539_3 = null;
        int stackIn_539_4 = 0;
        Object stackIn_540_0 = null;
        int stackIn_540_1 = 0;
        int stackIn_540_2 = 0;
        ci stackIn_540_3 = null;
        int stackIn_540_4 = 0;
        Object stackIn_541_0 = null;
        int stackIn_541_1 = 0;
        int stackIn_541_2 = 0;
        ci stackIn_541_3 = null;
        int stackIn_541_4 = 0;
        Object stackIn_542_0 = null;
        int stackIn_542_1 = 0;
        int stackIn_542_2 = 0;
        ci stackIn_542_3 = null;
        int stackIn_542_4 = 0;
        Object stackIn_543_0 = null;
        int stackIn_543_1 = 0;
        int stackIn_543_2 = 0;
        ci stackIn_543_3 = null;
        int stackIn_543_4 = 0;
        Object stackIn_544_0 = null;
        int stackIn_544_1 = 0;
        int stackIn_544_2 = 0;
        ci stackIn_544_3 = null;
        int stackIn_544_4 = 0;
        int stackIn_544_5 = 0;
        Object stackIn_548_0 = null;
        int stackIn_548_1 = 0;
        int stackIn_548_2 = 0;
        ci stackIn_548_3 = null;
        int stackIn_548_4 = 0;
        Object stackIn_549_0 = null;
        int stackIn_549_1 = 0;
        int stackIn_549_2 = 0;
        ci stackIn_549_3 = null;
        int stackIn_549_4 = 0;
        Object stackIn_550_0 = null;
        int stackIn_550_1 = 0;
        int stackIn_550_2 = 0;
        ci stackIn_550_3 = null;
        int stackIn_550_4 = 0;
        Object stackIn_551_0 = null;
        int stackIn_551_1 = 0;
        int stackIn_551_2 = 0;
        ci stackIn_551_3 = null;
        int stackIn_551_4 = 0;
        Object stackIn_552_0 = null;
        int stackIn_552_1 = 0;
        int stackIn_552_2 = 0;
        ci stackIn_552_3 = null;
        int stackIn_552_4 = 0;
        Object stackIn_553_0 = null;
        int stackIn_553_1 = 0;
        int stackIn_553_2 = 0;
        ci stackIn_553_3 = null;
        int stackIn_553_4 = 0;
        Object stackIn_554_0 = null;
        int stackIn_554_1 = 0;
        int stackIn_554_2 = 0;
        ci stackIn_554_3 = null;
        int stackIn_554_4 = 0;
        int stackIn_554_5 = 0;
        Object stackIn_556_0 = null;
        int stackIn_556_1 = 0;
        int stackIn_556_2 = 0;
        ci stackIn_556_3 = null;
        int stackIn_556_4 = 0;
        Object stackIn_557_0 = null;
        int stackIn_557_1 = 0;
        int stackIn_557_2 = 0;
        ci stackIn_557_3 = null;
        int stackIn_557_4 = 0;
        Object stackIn_558_0 = null;
        int stackIn_558_1 = 0;
        int stackIn_558_2 = 0;
        ci stackIn_558_3 = null;
        int stackIn_558_4 = 0;
        Object stackIn_559_0 = null;
        int stackIn_559_1 = 0;
        int stackIn_559_2 = 0;
        ci stackIn_559_3 = null;
        int stackIn_559_4 = 0;
        Object stackIn_560_0 = null;
        int stackIn_560_1 = 0;
        int stackIn_560_2 = 0;
        ci stackIn_560_3 = null;
        int stackIn_560_4 = 0;
        Object stackIn_561_0 = null;
        int stackIn_561_1 = 0;
        int stackIn_561_2 = 0;
        ci stackIn_561_3 = null;
        int stackIn_561_4 = 0;
        Object stackIn_562_0 = null;
        int stackIn_562_1 = 0;
        int stackIn_562_2 = 0;
        ci stackIn_562_3 = null;
        int stackIn_562_4 = 0;
        int stackIn_562_5 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_266_0 = 0;
        int stackOut_265_0 = 0;
        int stackOut_395_0 = 0;
        int stackOut_394_0 = 0;
        int stackOut_404_0 = 0;
        int stackOut_405_0 = 0;
        Object stackOut_530_0 = null;
        int stackOut_530_1 = 0;
        int stackOut_530_2 = 0;
        ci stackOut_530_3 = null;
        int stackOut_530_4 = 0;
        Object stackOut_533_0 = null;
        int stackOut_533_1 = 0;
        int stackOut_533_2 = 0;
        ci stackOut_533_3 = null;
        int stackOut_533_4 = 0;
        Object stackOut_535_0 = null;
        int stackOut_535_1 = 0;
        int stackOut_535_2 = 0;
        ci stackOut_535_3 = null;
        int stackOut_535_4 = 0;
        int stackOut_535_5 = 0;
        Object stackOut_534_0 = null;
        int stackOut_534_1 = 0;
        int stackOut_534_2 = 0;
        ci stackOut_534_3 = null;
        int stackOut_534_4 = 0;
        int stackOut_534_5 = 0;
        Object stackOut_531_0 = null;
        int stackOut_531_1 = 0;
        int stackOut_531_2 = 0;
        ci stackOut_531_3 = null;
        int stackOut_531_4 = 0;
        Object stackOut_532_0 = null;
        int stackOut_532_1 = 0;
        int stackOut_532_2 = 0;
        ci stackOut_532_3 = null;
        int stackOut_532_4 = 0;
        int stackOut_532_5 = 0;
        Object stackOut_537_0 = null;
        int stackOut_537_1 = 0;
        int stackOut_537_2 = 0;
        ci stackOut_537_3 = null;
        int stackOut_537_4 = 0;
        Object stackOut_543_0 = null;
        int stackOut_543_1 = 0;
        int stackOut_543_2 = 0;
        ci stackOut_543_3 = null;
        int stackOut_543_4 = 0;
        int stackOut_543_5 = 0;
        Object stackOut_538_0 = null;
        int stackOut_538_1 = 0;
        int stackOut_538_2 = 0;
        ci stackOut_538_3 = null;
        int stackOut_538_4 = 0;
        Object stackOut_539_0 = null;
        int stackOut_539_1 = 0;
        int stackOut_539_2 = 0;
        ci stackOut_539_3 = null;
        int stackOut_539_4 = 0;
        Object stackOut_542_0 = null;
        int stackOut_542_1 = 0;
        int stackOut_542_2 = 0;
        ci stackOut_542_3 = null;
        int stackOut_542_4 = 0;
        int stackOut_542_5 = 0;
        Object stackOut_540_0 = null;
        int stackOut_540_1 = 0;
        int stackOut_540_2 = 0;
        ci stackOut_540_3 = null;
        int stackOut_540_4 = 0;
        Object stackOut_541_0 = null;
        int stackOut_541_1 = 0;
        int stackOut_541_2 = 0;
        ci stackOut_541_3 = null;
        int stackOut_541_4 = 0;
        int stackOut_541_5 = 0;
        Object stackOut_547_0 = null;
        int stackOut_547_1 = 0;
        int stackOut_547_2 = 0;
        ci stackOut_547_3 = null;
        int stackOut_547_4 = 0;
        Object stackOut_553_0 = null;
        int stackOut_553_1 = 0;
        int stackOut_553_2 = 0;
        ci stackOut_553_3 = null;
        int stackOut_553_4 = 0;
        int stackOut_553_5 = 0;
        Object stackOut_548_0 = null;
        int stackOut_548_1 = 0;
        int stackOut_548_2 = 0;
        ci stackOut_548_3 = null;
        int stackOut_548_4 = 0;
        Object stackOut_549_0 = null;
        int stackOut_549_1 = 0;
        int stackOut_549_2 = 0;
        ci stackOut_549_3 = null;
        int stackOut_549_4 = 0;
        Object stackOut_552_0 = null;
        int stackOut_552_1 = 0;
        int stackOut_552_2 = 0;
        ci stackOut_552_3 = null;
        int stackOut_552_4 = 0;
        int stackOut_552_5 = 0;
        Object stackOut_550_0 = null;
        int stackOut_550_1 = 0;
        int stackOut_550_2 = 0;
        ci stackOut_550_3 = null;
        int stackOut_550_4 = 0;
        Object stackOut_551_0 = null;
        int stackOut_551_1 = 0;
        int stackOut_551_2 = 0;
        ci stackOut_551_3 = null;
        int stackOut_551_4 = 0;
        int stackOut_551_5 = 0;
        Object stackOut_555_0 = null;
        int stackOut_555_1 = 0;
        int stackOut_555_2 = 0;
        ci stackOut_555_3 = null;
        int stackOut_555_4 = 0;
        Object stackOut_561_0 = null;
        int stackOut_561_1 = 0;
        int stackOut_561_2 = 0;
        ci stackOut_561_3 = null;
        int stackOut_561_4 = 0;
        int stackOut_561_5 = 0;
        Object stackOut_556_0 = null;
        int stackOut_556_1 = 0;
        int stackOut_556_2 = 0;
        ci stackOut_556_3 = null;
        int stackOut_556_4 = 0;
        Object stackOut_557_0 = null;
        int stackOut_557_1 = 0;
        int stackOut_557_2 = 0;
        ci stackOut_557_3 = null;
        int stackOut_557_4 = 0;
        Object stackOut_560_0 = null;
        int stackOut_560_1 = 0;
        int stackOut_560_2 = 0;
        ci stackOut_560_3 = null;
        int stackOut_560_4 = 0;
        int stackOut_560_5 = 0;
        Object stackOut_558_0 = null;
        int stackOut_558_1 = 0;
        int stackOut_558_2 = 0;
        ci stackOut_558_3 = null;
        int stackOut_558_4 = 0;
        Object stackOut_559_0 = null;
        int stackOut_559_1 = 0;
        int stackOut_559_2 = 0;
        ci stackOut_559_3 = null;
        int stackOut_559_4 = 0;
        int stackOut_559_5 = 0;
        var13 = Terraphoenix.field_V;
        if (param4 == 125) {
          L0: {
            if (null == u.field_a) {
              u.field_a = new ci(128, 160);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var7_int = 0;
            if (((dl) this).field_s.field_i == null) {
              break L1;
            } else {
              L2: {
                if (((dl) this).field_s.field_m != 1) {
                  break L2;
                } else {
                  if (((dl) this).field_r == 0) {
                    if (!((dl) this).field_d) {
                      var7_int = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (2 != ((dl) this).field_s.field_m) {
                  break L3;
                } else {
                  if (((dl) this).field_r != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (Math.abs(((dl) this).field_A - ((dl) this).field_s.field_b / 2) >= ((dl) this).field_s.field_b / 2 - 5) {
                        break L4;
                      } else {
                        if ((Math.abs(((dl) this).field_n + -(((dl) this).field_s.field_e / 2)) ^ -1) > (-5 + ((dl) this).field_s.field_e / 2 ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var7_int = 1;
                    break L3;
                  }
                }
              }
              L5: {
                if (3 != ((dl) this).field_s.field_m) {
                  break L5;
                } else {
                  if (-2 != (((dl) this).field_r ^ -1)) {
                    break L5;
                  } else {
                    if ((((dl) this).field_A ^ -1) <= -13) {
                      break L5;
                    } else {
                      if (12 > ((dl) this).field_n) {
                        var7_int = 1;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              if (-5 != (((dl) this).field_s.field_m ^ -1)) {
                break L1;
              } else {
                if (((dl) this).field_r != 2) {
                  break L1;
                } else {
                  if (5 != ((dl) this).field_b) {
                    var7_int = 1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
          }
          L6: {
            if ((((dl) this).field_p ^ -1) >= -1) {
              break L6;
            } else {
              if (null != ((dl) this).field_s.field_i.field_K) {
                break L6;
              } else {
                ((dl) this).field_p = ((dl) this).field_p - 4;
                break L6;
              }
            }
          }
          L7: {
            if (!d.field_H) {
              break L7;
            } else {
              if ((((dl) this).field_r ^ -1) != (tg.field_l ^ -1)) {
                break L7;
              } else {
                L8: {
                  var9 = null;
                  if (!param5) {
                    break L8;
                  } else {
                    if (tg.field_l != ((dl) this).field_r) {
                      break L8;
                    } else {
                      var9 = oi.field_J;
                      oi.field_J.a();
                      l.f(0, 0, 128, 160, 0);
                      k.field_f.a(0);
                      break L8;
                    }
                  }
                }
                var8 = -(((dl) this).field_l * 48 / 100) + param3;
                if (tg.field_l >= ((dl) this).field_r) {
                  L9: {
                    if (dh.field_j) {
                      break L9;
                    } else {
                      if ((tg.field_l ^ -1) != (((dl) this).field_r ^ -1)) {
                        L10: {
                          if (((dl) this).field_C == null) {
                            break L10;
                          } else {
                            param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                            param5 = false;
                            break L10;
                          }
                        }
                        return param1;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L11: {
                    var10 = 1;
                    if (tg.field_l > ((dl) this).field_r) {
                      L12: {
                        if (((dl) this).field_u) {
                          stackOut_66_0 = 0;
                          stackIn_67_0 = stackOut_66_0;
                          break L12;
                        } else {
                          stackOut_65_0 = 1;
                          stackIn_67_0 = stackOut_65_0;
                          break L12;
                        }
                      }
                      var10 = stackIn_67_0;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L13: {
                    if (var10 != 0) {
                      L14: {
                        if (((dl) this).field_z) {
                          break L14;
                        } else {
                          if (((dl) this).field_a) {
                            break L14;
                          } else {
                            L15: {
                              var11_int = ((dl) this).field_b;
                              if ((var11_int ^ -1) <= -1) {
                                break L15;
                              } else {
                                L16: {
                                  if (-1 == (((dl) this).field_v ^ -1)) {
                                    break L16;
                                  } else {
                                    if (4 == ((dl) this).field_v) {
                                      break L16;
                                    } else {
                                      if ((((dl) this).field_v ^ -1) == -6) {
                                        break L16;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                var11_int = 0;
                                break L15;
                              }
                            }
                            L17: {
                              L18: {
                                if ((var11_int ^ -1) > -1) {
                                  break L18;
                                } else {
                                  L19: {
                                    var12 = 43520;
                                    if ((((dl) this).field_v ^ -1) == -2) {
                                      var12 = 32768;
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (-3 != (((dl) this).field_v ^ -1)) {
                                      break L20;
                                    } else {
                                      var12 = 16776960;
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if ((((dl) this).field_v ^ -1) != -4) {
                                      break L21;
                                    } else {
                                      var12 = 16711680;
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    if ((((dl) this).field_v ^ -1) != -5) {
                                      break L22;
                                    } else {
                                      var12 = 16777215;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (-6 == (((dl) this).field_v ^ -1)) {
                                      var12 = 16777215;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    if (((dl) this).field_d) {
                                      var12 = 0;
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  L25: {
                                    L26: {
                                      if (var9 != null) {
                                        break L26;
                                      } else {
                                        aj.field_a[var11_int].b(-32 + param0, var8 + -16, var12);
                                        if (var13 == 0) {
                                          break L25;
                                        } else {
                                          break L26;
                                        }
                                      }
                                    }
                                    var9.a();
                                    aj.field_a[var11_int].b(32, 108, var12);
                                    k.field_f.a(0);
                                    break L25;
                                  }
                                  L27: {
                                    if (((dl) this).field_s.field_i == null) {
                                      break L27;
                                    } else {
                                      if (-1 < (((dl) this).field_b ^ -1)) {
                                        break L27;
                                      } else {
                                        ((dl) this).field_s.field_i.a(param0 + -32, -16 + var8, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                                        break L27;
                                      }
                                    }
                                  }
                                  if (var13 == 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (null != var9) {
                                var9.a();
                                l.a(32, 124, 16777215);
                                l.a(64, 108, 16777215);
                                l.a(64, 139, 16777215);
                                l.a(95, 124, 16777215);
                                k.field_f.a(0);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L28: {
                              L29: {
                                if (null == ((dl) this).field_s.a(115, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A)) {
                                  break L29;
                                } else {
                                  if (((dl) this).field_s.a(-36, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_a) {
                                    break L29;
                                  } else {
                                    if (((dl) this).field_s.a(108, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_d) {
                                      stackOut_117_0 = 0;
                                      stackIn_118_0 = stackOut_117_0;
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              stackOut_116_0 = 256;
                              stackIn_118_0 = stackOut_116_0;
                              break L28;
                            }
                            L30: {
                              var12 = stackIn_118_0;
                              if ((((dl) this).field_g ^ -1) > -1) {
                                break L30;
                              } else {
                                if (var12 <= 0) {
                                  break L30;
                                } else {
                                  dm.field_a[((dl) this).field_g].a(param0 - 32, -64 + var8, 128);
                                  break L30;
                                }
                              }
                            }
                            L31: {
                              L32: {
                                if (((dl) this).field_s.a(93, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                  break L32;
                                } else {
                                  if (((dl) this).field_s.a(-86, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_a) {
                                    break L32;
                                  } else {
                                    if (((dl) this).field_s.a(param4 + -198, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_d) {
                                      stackOut_128_0 = 0;
                                      stackIn_129_0 = stackOut_128_0;
                                      break L31;
                                    } else {
                                      break L32;
                                    }
                                  }
                                }
                              }
                              stackOut_127_0 = 256;
                              stackIn_129_0 = stackOut_127_0;
                              break L31;
                            }
                            L33: {
                              var12 = stackIn_129_0;
                              if ((((dl) this).field_k ^ -1) <= -1) {
                                if (-1 > (var12 ^ -1)) {
                                  bk.field_a[((dl) this).field_k].a(-32 + param0, var8 - 64, 128);
                                  break L33;
                                } else {
                                  break L33;
                                }
                              } else {
                                break L33;
                              }
                            }
                            if (var13 == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      L34: {
                        ((dl) this).field_a = true;
                        var11_int = ((dl) this).field_b;
                        if (var11_int >= 0) {
                          break L34;
                        } else {
                          L35: {
                            if (0 == ((dl) this).field_v) {
                              break L35;
                            } else {
                              if (((dl) this).field_v == 4) {
                                break L35;
                              } else {
                                if ((((dl) this).field_v ^ -1) == -6) {
                                  break L35;
                                } else {
                                  break L34;
                                }
                              }
                            }
                          }
                          var11_int = 0;
                          break L34;
                        }
                      }
                      L36: {
                        L37: {
                          if (0 <= var11_int) {
                            break L37;
                          } else {
                            if (null != var9) {
                              var9.a();
                              l.a(32, 124, 16777215);
                              l.a(64, 108, 16777215);
                              l.a(64, 139, 16777215);
                              l.a(95, 124, 16777215);
                              k.field_f.a(0);
                              if (var13 == 0) {
                                break L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L36;
                            }
                          }
                        }
                        L38: {
                          var12 = 65280;
                          if (1 != ((dl) this).field_v) {
                            break L38;
                          } else {
                            var12 = 32768;
                            break L38;
                          }
                        }
                        L39: {
                          if (((dl) this).field_v == 2) {
                            var12 = 16776960;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        L40: {
                          if (3 == ((dl) this).field_v) {
                            var12 = 16711680;
                            break L40;
                          } else {
                            break L40;
                          }
                        }
                        L41: {
                          if (-5 != (((dl) this).field_v ^ -1)) {
                            break L41;
                          } else {
                            var12 = 16777215;
                            break L41;
                          }
                        }
                        L42: {
                          if (-6 != (((dl) this).field_v ^ -1)) {
                            break L42;
                          } else {
                            var12 = 16777215;
                            break L42;
                          }
                        }
                        L43: {
                          L44: {
                            if (var9 == null) {
                              break L44;
                            } else {
                              var9.a();
                              aj.field_a[var11_int].b(32, 108, var12);
                              k.field_f.a(0);
                              if (var13 == 0) {
                                break L43;
                              } else {
                                break L44;
                              }
                            }
                          }
                          aj.field_a[var11_int].b(-32 + param0, var8 - 16, var12);
                          break L43;
                        }
                        if (((dl) this).field_s.field_i == null) {
                          break L36;
                        } else {
                          if (0 <= ((dl) this).field_b) {
                            ((dl) this).field_s.field_i.a(-32 + param0, -16 + var8, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                            break L36;
                          } else {
                            break L36;
                          }
                        }
                      }
                      if (ll.field_c) {
                        L45: {
                          if (((dl) this).field_g >= 0) {
                            L46: {
                              if (((dl) this).field_g % 4 == 0) {
                                break L46;
                              } else {
                                dm.field_a[((dl) this).field_g].a(param0 - 32, -64 + var8, 128);
                                if (var13 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              var12 = 0;
                              if (((dl) this).field_s.a(param4 + 2, ((dl) this).field_n - 1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                break L47;
                              } else {
                                if (((dl) this).field_s.a(-35, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g != 3 + ((dl) this).field_g) {
                                  break L47;
                                } else {
                                  var12++;
                                  break L47;
                                }
                              }
                            }
                            L48: {
                              if (null == ((dl) this).field_s.a(96, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A)) {
                                break L48;
                              } else {
                                if ((((dl) this).field_s.a(108, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g ^ -1) == (3 + ((dl) this).field_g ^ -1)) {
                                  var12 += 2;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                            }
                            L49: {
                              if (-4 == (var12 ^ -1)) {
                                L50: {
                                  var12 = 0;
                                  ((dl) this).field_g = ((dl) this).field_g + 3;
                                  if ((((dl) this).field_e & 16 ^ -1) != -17) {
                                    break L50;
                                  } else {
                                    ((dl) this).a(1, false, 86);
                                    break L50;
                                  }
                                }
                                if ((1 & ((dl) this).field_e) == 1) {
                                  ((dl) this).a(1, true, 107);
                                  ((dl) this).a(1, false, -92);
                                  break L49;
                                } else {
                                  break L49;
                                }
                              } else {
                                break L49;
                              }
                            }
                            dm.field_a[var12 + ((dl) this).field_g].a(param0 + -32, var8 + -64, 128);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        if ((((dl) this).field_k ^ -1) <= -1) {
                          L51: {
                            if (0 == ((dl) this).field_k % 4) {
                              break L51;
                            } else {
                              bk.field_a[((dl) this).field_k].a(param0 - 32, -64 + var8, 128);
                              if (var13 == 0) {
                                break L13;
                              } else {
                                break L51;
                              }
                            }
                          }
                          L52: {
                            var12 = 0;
                            if (((dl) this).field_s.a(-29, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A) == null) {
                              break L52;
                            } else {
                              if (((dl) this).field_s.a(81, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1).field_k != 3 + ((dl) this).field_k) {
                                break L52;
                              } else {
                                var12++;
                                break L52;
                              }
                            }
                          }
                          L53: {
                            if (((dl) this).field_s.a(96, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A) == null) {
                              break L53;
                            } else {
                              if ((((dl) this).field_s.a(116, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1).field_k ^ -1) != (((dl) this).field_k + 3 ^ -1)) {
                                break L53;
                              } else {
                                var12 += 2;
                                break L53;
                              }
                            }
                          }
                          L54: {
                            if ((var12 ^ -1) == -4) {
                              L55: {
                                var12 = 0;
                                ((dl) this).field_k = ((dl) this).field_k + 3;
                                if ((32 & ((dl) this).field_e) != 32) {
                                  break L55;
                                } else {
                                  ((dl) this).a(2, false, -63);
                                  break L55;
                                }
                              }
                              if (2 == (2 & ((dl) this).field_e)) {
                                ((dl) this).a(2, true, 112);
                                ((dl) this).a(2, false, 90);
                                break L54;
                              } else {
                                break L54;
                              }
                            } else {
                              break L54;
                            }
                          }
                          bk.field_a[((dl) this).field_k + var12].a(param0 + -32, var8 - 64, 128);
                          break L13;
                        } else {
                          break L13;
                        }
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L56: {
                    if (-1 <= (((dl) this).field_p ^ -1)) {
                      break L56;
                    } else {
                      li.field_a = true;
                      if (((dl) this).field_p >= 64) {
                        break L56;
                      } else {
                        l.b(param0, -24 + var8, 32, 16777215, 4 * ((dl) this).field_p);
                        break L56;
                      }
                    }
                  }
                  L57: {
                    L58: {
                      if (((dl) this).field_z) {
                        break L58;
                      } else {
                        if (((dl) this).field_a) {
                          break L58;
                        } else {
                          if (!((dl) this).field_d) {
                            break L58;
                          } else {
                            break L57;
                          }
                        }
                      }
                    }
                    if (((dl) this).field_v != 1) {
                      break L57;
                    } else {
                      L59: {
                        if (((dl) this).field_j != 7) {
                          break L59;
                        } else {
                          se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length].a(-32 + param0, -112 + var8, 128);
                          if (var13 == 0) {
                            break L57;
                          } else {
                            break L59;
                          }
                        }
                      }
                      kg.field_r[((dl) this).field_j].a(-32 + param0, var8 - 64, 128);
                      break L57;
                    }
                  }
                  L60: {
                    if (null != ((dl) this).field_C) {
                      int discarded$2 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      break L60;
                    } else {
                      break L60;
                    }
                  }
                  L61: {
                    if (null != var9) {
                      L62: {
                        L63: {
                          L64: {
                            u.field_a.a();
                            var9.d(0, 0);
                            if (((dl) this).field_s.field_i == null) {
                              break L64;
                            } else {
                              if (((dl) this).field_s.field_i.field_L > 0) {
                                break L63;
                              } else {
                                break L64;
                              }
                            }
                          }
                          c.a((byte) -86, u.field_a, 16777215);
                          c.a((byte) -86, u.field_a, 8454016);
                          c.a((byte) -86, u.field_a, 4259648);
                          c.a((byte) -86, u.field_a, 32768);
                          c.a((byte) -86, u.field_a, 16384);
                          if (var13 == 0) {
                            break L62;
                          } else {
                            break L63;
                          }
                        }
                        c.a((byte) -86, u.field_a, 16777215);
                        c.a((byte) -86, u.field_a, 16744576);
                        c.a((byte) -86, u.field_a, 16728128);
                        c.a((byte) -86, u.field_a, 8388608);
                        c.a((byte) -86, u.field_a, 4194304);
                        break L62;
                      }
                      var9.b(0, 0, 0);
                      k.field_f.a(0);
                      hb.field_n = var8 + -124;
                      ug.field_b = param0 - 64;
                      var9.b(param0 - 64, -124 + var8);
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  return param1;
                } else {
                  L65: {
                    if (null != ((dl) this).field_C) {
                      param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      param5 = false;
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  return param1;
                }
              }
            }
          }
          L66: {
            var8 = -(((dl) this).field_l * 48 / 100) + param3;
            var9 = null;
            if (!param5) {
              break L66;
            } else {
              if (tg.field_l != ((dl) this).field_r) {
                break L66;
              } else {
                var9 = oi.field_J;
                oi.field_J.a();
                l.f(0, 0, 128, 160, 0);
                k.field_f.a(0);
                break L66;
              }
            }
          }
          if (tg.field_l < ((dl) this).field_r) {
            L67: {
              if (((dl) this).field_h != null) {
                break L67;
              } else {
                break L67;
              }
            }
            L68: {
              if (((dl) this).field_C == null) {
                break L68;
              } else {
                param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                break L68;
              }
            }
            return param1;
          } else {
            L69: {
              if (dh.field_j) {
                break L69;
              } else {
                if (((dl) this).field_r != tg.field_l) {
                  L70: {
                    if (null == ((dl) this).field_h) {
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L71: {
                    if (null == ((dl) this).field_C) {
                      break L71;
                    } else {
                      param1 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                      break L71;
                    }
                  }
                  return param1;
                } else {
                  break L69;
                }
              }
            }
            L72: {
              var10 = 1;
              if (((dl) this).field_r < tg.field_l) {
                L73: {
                  if (((dl) this).field_u) {
                    stackOut_266_0 = 0;
                    stackIn_267_0 = stackOut_266_0;
                    break L73;
                  } else {
                    stackOut_265_0 = 1;
                    stackIn_267_0 = stackOut_265_0;
                    break L73;
                  }
                }
                var10 = stackIn_267_0;
                break L72;
              } else {
                break L72;
              }
            }
            L74: {
              if (var10 == 0) {
                break L74;
              } else {
                L75: {
                  L76: {
                    if (((dl) this).field_z) {
                      break L76;
                    } else {
                      if (((dl) this).field_a) {
                        break L76;
                      } else {
                        if (((dl) this).field_s.field_l == null) {
                          break L75;
                        } else {
                          break L76;
                        }
                      }
                    }
                  }
                  L77: {
                    L78: {
                      ((dl) this).field_a = true;
                      if (((dl) this).field_b < 0) {
                        break L78;
                      } else {
                        L79: {
                          var11_int = 256;
                          if (var7_int != 0) {
                            var11_int = (int)(Math.sin((double)((dl) this).field_A + 2.0 * mm.field_f - (double)((dl) this).field_n) * 64.0 + 192.0);
                            break L79;
                          } else {
                            break L79;
                          }
                        }
                        L80: {
                          if (((dl) this).field_r >= tg.field_l) {
                            break L80;
                          } else {
                            var11_int -= 64;
                            break L80;
                          }
                        }
                        L81: {
                          L82: {
                            if (var9 != null) {
                              break L82;
                            } else {
                              aj.field_a[((dl) this).field_b].c(param0 - 32, -16 + var8, var11_int);
                              if (((dl) this).field_q == -1) {
                                break L81;
                              } else {
                                ji.field_j[((dl) this).field_q].b(-32 + param0, -16 + var8);
                                if (var13 == 0) {
                                  break L81;
                                } else {
                                  break L82;
                                }
                              }
                            }
                          }
                          L83: {
                            var9.a();
                            aj.field_a[((dl) this).field_b].c(32, 108, var11_int);
                            if (((dl) this).field_q == -1) {
                              break L83;
                            } else {
                              ji.field_j[((dl) this).field_q].b(32, 108);
                              break L83;
                            }
                          }
                          k.field_f.a(param4 ^ 125);
                          break L81;
                        }
                        L84: {
                          if (null == ((dl) this).field_s.field_i) {
                            break L84;
                          } else {
                            ((dl) this).field_s.field_i.a(param0 + -32, var8 + -16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                            break L84;
                          }
                        }
                        if (var13 == 0) {
                          break L77;
                        } else {
                          break L78;
                        }
                      }
                    }
                    L85: {
                      if (null != ((dl) this).field_s.field_l) {
                        vc.field_f.c("N", param0 + -12, var8, 16711680, -1);
                        break L85;
                      } else {
                        break L85;
                      }
                    }
                    if (var9 != null) {
                      var9.a();
                      l.a(32, 124, 16777215);
                      l.a(64, 108, 16777215);
                      l.a(64, 139, 16777215);
                      l.a(95, 124, 16777215);
                      k.field_f.a(0);
                      break L77;
                    } else {
                      break L77;
                    }
                  }
                  L86: {
                    if (uf.field_c != ((dl) this).field_A) {
                      break L86;
                    } else {
                      if (((dl) this).field_n == vf.field_a) {
                        break L86;
                      } else {
                        break L86;
                      }
                    }
                  }
                  L87: {
                    if (((dl) this).field_s.field_l != null) {
                      if ((((dl) this).field_A ^ -1) != (uf.field_c ^ -1)) {
                        break L87;
                      } else {
                        if (vf.field_a == ((dl) this).field_n) {
                          L88: {
                            var11_int = 32768;
                            if (((dl) this).field_r == tg.field_l) {
                              var11_int = 65280;
                              break L88;
                            } else {
                              break L88;
                            }
                          }
                          l.d(param0 + -32, -16 + var8, 64, 32, var11_int, 128);
                          break L87;
                        } else {
                          break L87;
                        }
                      }
                    } else {
                      break L87;
                    }
                  }
                  if (!ll.field_c) {
                    break L74;
                  } else {
                    L89: {
                      if ((((dl) this).field_g ^ -1) > -1) {
                        break L89;
                      } else {
                        L90: {
                          if ((((dl) this).field_g % 4 ^ -1) != -1) {
                            break L90;
                          } else {
                            L91: {
                              var11_int = 0;
                              if (((dl) this).field_s.a(112, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A) == null) {
                                break L91;
                              } else {
                                if (((dl) this).field_s.a(param4 ^ 17, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g == ((dl) this).field_g - -3) {
                                  var11_int++;
                                  break L91;
                                } else {
                                  break L91;
                                }
                              }
                            }
                            L92: {
                              if (null == ((dl) this).field_s.a(89, ((dl) this).field_n - -1, ((dl) this).field_r, ((dl) this).field_A)) {
                                break L92;
                              } else {
                                if ((((dl) this).field_s.a(-121, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g ^ -1) != (3 + ((dl) this).field_g ^ -1)) {
                                  break L92;
                                } else {
                                  var11_int += 2;
                                  break L92;
                                }
                              }
                            }
                            L93: {
                              if (var11_int != 3) {
                                break L93;
                              } else {
                                L94: {
                                  var11_int = 0;
                                  ((dl) this).field_g = ((dl) this).field_g + 3;
                                  if ((((dl) this).field_e & 16) == 16) {
                                    ((dl) this).a(1, false, -93);
                                    break L94;
                                  } else {
                                    break L94;
                                  }
                                }
                                if (-2 != (1 & ((dl) this).field_e ^ -1)) {
                                  break L93;
                                } else {
                                  ((dl) this).a(1, true, param4 ^ 18);
                                  ((dl) this).a(1, false, param4 + -225);
                                  break L93;
                                }
                              }
                            }
                            L95: {
                              L96: {
                                if (null == var9) {
                                  break L96;
                                } else {
                                  var9.a();
                                  dm.field_a[((dl) this).field_g + var11_int].c(32, 60, 200);
                                  k.field_f.a(0);
                                  if (var13 == 0) {
                                    break L95;
                                  } else {
                                    break L96;
                                  }
                                }
                              }
                              dm.field_a[((dl) this).field_g + var11_int].c(-32 + param0, var8 - 64, 200);
                              break L95;
                            }
                            L97: {
                              if (((dl) this).field_s.field_i != null) {
                                ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[var11_int + ((dl) this).field_g], true, 28144);
                                break L97;
                              } else {
                                break L97;
                              }
                            }
                            if (var13 == 0) {
                              break L89;
                            } else {
                              break L90;
                            }
                          }
                        }
                        L98: {
                          L99: {
                            if (var9 == null) {
                              break L99;
                            } else {
                              var9.a();
                              dm.field_a[((dl) this).field_g].c(32, 60, 200);
                              k.field_f.a(0);
                              if (var13 == 0) {
                                break L98;
                              } else {
                                break L99;
                              }
                            }
                          }
                          dm.field_a[((dl) this).field_g].c(param0 + -32, var8 - 64, 200);
                          break L98;
                        }
                        if (((dl) this).field_s.field_i != null) {
                          ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, 28144);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                    }
                    if (-1 < (((dl) this).field_k ^ -1)) {
                      break L74;
                    } else {
                      L100: {
                        if (0 != ((dl) this).field_k % 4) {
                          break L100;
                        } else {
                          L101: {
                            var11_int = 0;
                            if (null == ((dl) this).field_s.a(-124, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1)) {
                              break L101;
                            } else {
                              if ((((dl) this).field_s.a(83, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + -1).field_k ^ -1) == (3 + ((dl) this).field_k ^ -1)) {
                                var11_int++;
                                break L101;
                              } else {
                                break L101;
                              }
                            }
                          }
                          L102: {
                            if (((dl) this).field_s.a(111, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - -1) == null) {
                              break L102;
                            } else {
                              if ((((dl) this).field_s.a(-78, ((dl) this).field_n, ((dl) this).field_r, 1 + ((dl) this).field_A).field_k ^ -1) != (((dl) this).field_k - -3 ^ -1)) {
                                break L102;
                              } else {
                                var11_int += 2;
                                break L102;
                              }
                            }
                          }
                          L103: {
                            if (3 != var11_int) {
                              break L103;
                            } else {
                              L104: {
                                var11_int = 0;
                                ((dl) this).field_k = ((dl) this).field_k + 3;
                                if ((((dl) this).field_e & 32) != 32) {
                                  break L104;
                                } else {
                                  ((dl) this).a(2, false, 101);
                                  break L104;
                                }
                              }
                              if (-3 != (((dl) this).field_e & 2 ^ -1)) {
                                break L103;
                              } else {
                                ((dl) this).a(2, true, 121);
                                ((dl) this).a(2, false, -96);
                                break L103;
                              }
                            }
                          }
                          L105: {
                            L106: {
                              if (null != var9) {
                                break L106;
                              } else {
                                bk.field_a[((dl) this).field_k + var11_int].c(param0 + -32, var8 + -64, 256);
                                if (var13 == 0) {
                                  break L105;
                                } else {
                                  break L106;
                                }
                              }
                            }
                            var9.a();
                            bk.field_a[var11_int + ((dl) this).field_k].c(32, 60, 256);
                            k.field_f.a(0);
                            break L105;
                          }
                          L107: {
                            if (null != ((dl) this).field_s.field_i) {
                              ((dl) this).field_s.field_i.a(param0 - 32, var8 - 64, ((dl) this).field_r, bk.field_a[var11_int + ((dl) this).field_k], true, param4 ^ 28045);
                              break L107;
                            } else {
                              break L107;
                            }
                          }
                          if (var13 == 0) {
                            break L74;
                          } else {
                            break L100;
                          }
                        }
                      }
                      L108: {
                        L109: {
                          if (null != var9) {
                            break L109;
                          } else {
                            bk.field_a[((dl) this).field_k].c(param0 - 32, -64 + var8, 256);
                            if (var13 == 0) {
                              break L108;
                            } else {
                              break L109;
                            }
                          }
                        }
                        var9.a();
                        bk.field_a[((dl) this).field_k].c(32, 60, 256);
                        k.field_f.a(0);
                        break L108;
                      }
                      if (((dl) this).field_s.field_i != null) {
                        ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                        if (var13 == 0) {
                          break L74;
                        } else {
                          break L75;
                        }
                      } else {
                        break L74;
                      }
                    }
                  }
                }
                L110: {
                  L111: {
                    if (!((dl) this).field_d) {
                      break L111;
                    } else {
                      L112: {
                        if (0 > ((dl) this).field_b) {
                          break L112;
                        } else {
                          this.a(param0 - 32, -16 + var8, aj.field_a[((dl) this).field_b], 17335, 0);
                          if (null != ((dl) this).field_s.field_i) {
                            ((dl) this).field_s.field_i.a(param0 - 32, var8 - 16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                            break L112;
                          } else {
                            break L112;
                          }
                        }
                      }
                      L113: {
                        L114: {
                          if ((((dl) this).field_i & 1 ^ -1) >= -1) {
                            break L114;
                          } else {
                            if (((dl) this).field_s.a(param4 ^ -98, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A - 1).field_a) {
                              stackOut_395_0 = 192;
                              stackIn_396_0 = stackOut_395_0;
                              break L113;
                            } else {
                              break L114;
                            }
                          }
                        }
                        stackOut_394_0 = 0;
                        stackIn_396_0 = stackOut_394_0;
                        break L113;
                      }
                      L115: {
                        var11_int = stackIn_396_0;
                        if ((((dl) this).field_g ^ -1) > -1) {
                          break L115;
                        } else {
                          this.a(param0 - 32, -64 + var8, dm.field_a[((dl) this).field_g], 17335, var11_int);
                          if (((dl) this).field_s.field_i != null) {
                            ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, param4 + 28019);
                            break L115;
                          } else {
                            break L115;
                          }
                        }
                      }
                      L116: {
                        L117: {
                          if (-1 <= (2 & ((dl) this).field_i ^ -1)) {
                            break L117;
                          } else {
                            if (!((dl) this).field_s.a(116, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_a) {
                              break L117;
                            } else {
                              stackOut_404_0 = 160;
                              stackIn_406_0 = stackOut_404_0;
                              break L116;
                            }
                          }
                        }
                        stackOut_405_0 = 0;
                        stackIn_406_0 = stackOut_405_0;
                        break L116;
                      }
                      L118: {
                        var11_int = stackIn_406_0;
                        if (0 <= ((dl) this).field_k) {
                          this.a(param0 - 32, -64 + var8, bk.field_a[((dl) this).field_k], 17335, var11_int);
                          if (((dl) this).field_s.field_i == null) {
                            break L118;
                          } else {
                            ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                            break L118;
                          }
                        } else {
                          break L118;
                        }
                      }
                      if (var13 == 0) {
                        break L110;
                      } else {
                        break L111;
                      }
                    }
                  }
                  L119: {
                    L120: {
                      if (0 > ((dl) this).field_b) {
                        break L120;
                      } else {
                        L121: {
                          var11_int = 128;
                          if (var7_int == 0) {
                            break L121;
                          } else {
                            var11_int = (int)(128.0 + 64.0 * Math.sin((double)((dl) this).field_A + 2.0 * mm.field_f - (double)((dl) this).field_n));
                            break L121;
                          }
                        }
                        L122: {
                          L123: {
                            if (null == var9) {
                              break L123;
                            } else {
                              L124: {
                                var9.a();
                                this.a(32, 108, aj.field_a[((dl) this).field_b], 17335, var11_int);
                                if (-1 != ((dl) this).field_q) {
                                  this.a(param0 + -32, var8 - 16, ji.field_j[((dl) this).field_q], param4 ^ 17354, 128);
                                  break L124;
                                } else {
                                  break L124;
                                }
                              }
                              k.field_f.a(0);
                              if (var13 == 0) {
                                break L122;
                              } else {
                                break L123;
                              }
                            }
                          }
                          this.a(param0 + -32, var8 - 16, aj.field_a[((dl) this).field_b], 17335, var11_int);
                          if (((dl) this).field_q == -1) {
                            break L122;
                          } else {
                            this.a(-32 + param0, var8 + -16, ji.field_j[((dl) this).field_q], param4 + 17210, 128);
                            break L122;
                          }
                        }
                        L125: {
                          if (((dl) this).field_s.field_i != null) {
                            ((dl) this).field_s.field_i.a(-32 + param0, var8 + -16, ((dl) this).field_r, aj.field_a[((dl) this).field_b], false, param4 + 28019);
                            break L125;
                          } else {
                            break L125;
                          }
                        }
                        if (var13 == 0) {
                          break L119;
                        } else {
                          break L120;
                        }
                      }
                    }
                    if (null != var9) {
                      var9.a();
                      l.a(32, 124, 16777215);
                      l.a(64, 108, 16777215);
                      l.a(64, 139, 16777215);
                      l.a(95, 124, 16777215);
                      k.field_f.a(0);
                      break L119;
                    } else {
                      break L119;
                    }
                  }
                  L126: {
                    if (((dl) this).field_g < 0) {
                      break L126;
                    } else {
                      L127: {
                        if ((((dl) this).field_g % 4 ^ -1) == -1) {
                          break L127;
                        } else {
                          L128: {
                            L129: {
                              if (var9 != null) {
                                break L129;
                              } else {
                                this.a(param0 + -32, -64 + var8, dm.field_a[((dl) this).field_g], param4 ^ 17354, 64);
                                if (var13 == 0) {
                                  break L128;
                                } else {
                                  break L129;
                                }
                              }
                            }
                            var9.a();
                            this.a(32, 60, dm.field_a[((dl) this).field_g], 17335, 64);
                            k.field_f.a(param4 + -125);
                            break L128;
                          }
                          if (((dl) this).field_s.field_i == null) {
                            break L126;
                          } else {
                            ((dl) this).field_s.field_i.a(-32 + param0, -64 + var8, ((dl) this).field_r, dm.field_a[((dl) this).field_g], true, 28144);
                            if (var13 == 0) {
                              break L126;
                            } else {
                              break L127;
                            }
                          }
                        }
                      }
                      L130: {
                        var11_int = 0;
                        if (null == ((dl) this).field_s.a(param4 ^ -37, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A)) {
                          break L130;
                        } else {
                          if (((dl) this).field_s.a(127, -1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A).field_g != ((dl) this).field_g - -3) {
                            break L130;
                          } else {
                            var11_int++;
                            break L130;
                          }
                        }
                      }
                      L131: {
                        if (((dl) this).field_s.a(param4 ^ 33, 1 + ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A) == null) {
                          break L131;
                        } else {
                          if ((((dl) this).field_s.a(param4 ^ 45, ((dl) this).field_n + 1, ((dl) this).field_r, ((dl) this).field_A).field_g ^ -1) != (3 + ((dl) this).field_g ^ -1)) {
                            break L131;
                          } else {
                            var11_int += 2;
                            break L131;
                          }
                        }
                      }
                      L132: {
                        if ((var11_int ^ -1) != -4) {
                          break L132;
                        } else {
                          L133: {
                            var11_int = 0;
                            ((dl) this).field_g = ((dl) this).field_g + 3;
                            if (-17 == (((dl) this).field_e & 16 ^ -1)) {
                              ((dl) this).a(1, false, param4 + -45);
                              break L133;
                            } else {
                              break L133;
                            }
                          }
                          if ((1 & ((dl) this).field_e ^ -1) == -2) {
                            ((dl) this).a(1, true, 92);
                            ((dl) this).a(1, false, param4 ^ -22);
                            break L132;
                          } else {
                            break L132;
                          }
                        }
                      }
                      L134: {
                        L135: {
                          if (var9 == null) {
                            break L135;
                          } else {
                            var9.a();
                            this.a(32, 60, dm.field_a[((dl) this).field_g - -var11_int], param4 ^ 17354, 64);
                            k.field_f.a(0);
                            if (var13 == 0) {
                              break L134;
                            } else {
                              break L135;
                            }
                          }
                        }
                        this.a(-32 + param0, -64 + var8, dm.field_a[var11_int + ((dl) this).field_g], 17335, 64);
                        break L134;
                      }
                      if (((dl) this).field_s.field_i == null) {
                        break L126;
                      } else {
                        ((dl) this).field_s.field_i.a(param0 + -32, var8 + -64, ((dl) this).field_r, dm.field_a[var11_int + ((dl) this).field_g], true, 28144);
                        break L126;
                      }
                    }
                  }
                  if (((dl) this).field_k < 0) {
                    break L110;
                  } else {
                    L136: {
                      if (-1 != (((dl) this).field_k % 4 ^ -1)) {
                        break L136;
                      } else {
                        L137: {
                          var11_int = 0;
                          if (((dl) this).field_s.a(param4 + -25, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + -1) == null) {
                            break L137;
                          } else {
                            if (((dl) this).field_s.a(-104, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_k != 3 + ((dl) this).field_k) {
                              break L137;
                            } else {
                              var11_int++;
                              break L137;
                            }
                          }
                        }
                        L138: {
                          if (((dl) this).field_s.a(-114, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + 1) == null) {
                            break L138;
                          } else {
                            if (((dl) this).field_s.a(116, ((dl) this).field_n, ((dl) this).field_r, ((dl) this).field_A + 1).field_k == ((dl) this).field_k - -3) {
                              var11_int += 2;
                              break L138;
                            } else {
                              break L138;
                            }
                          }
                        }
                        L139: {
                          if (var11_int == 3) {
                            L140: {
                              var11_int = 0;
                              ((dl) this).field_k = ((dl) this).field_k + 3;
                              if (-33 != (32 & ((dl) this).field_e ^ -1)) {
                                break L140;
                              } else {
                                ((dl) this).a(2, false, -94);
                                break L140;
                              }
                            }
                            if (-3 == (2 & ((dl) this).field_e ^ -1)) {
                              ((dl) this).a(2, true, 83);
                              ((dl) this).a(2, false, 96);
                              break L139;
                            } else {
                              break L139;
                            }
                          } else {
                            break L139;
                          }
                        }
                        L141: {
                          L142: {
                            if (null == var9) {
                              break L142;
                            } else {
                              var9.a();
                              bk.field_a[var11_int + ((dl) this).field_k].c(32, 60, 128);
                              k.field_f.a(0);
                              if (var13 == 0) {
                                break L141;
                              } else {
                                break L142;
                              }
                            }
                          }
                          bk.field_a[var11_int + ((dl) this).field_k].c(-32 + param0, var8 + -64, 128);
                          break L141;
                        }
                        L143: {
                          if (((dl) this).field_s.field_i == null) {
                            break L143;
                          } else {
                            ((dl) this).field_s.field_i.a(param0 - 32, var8 - 64, ((dl) this).field_r, bk.field_a[var11_int + ((dl) this).field_k], true, 28144);
                            break L143;
                          }
                        }
                        if (var13 == 0) {
                          break L110;
                        } else {
                          break L136;
                        }
                      }
                    }
                    L144: {
                      L145: {
                        if (var9 != null) {
                          break L145;
                        } else {
                          bk.field_a[((dl) this).field_k].c(-32 + param0, -64 + var8, 128);
                          if (var13 == 0) {
                            break L144;
                          } else {
                            break L145;
                          }
                        }
                      }
                      var9.a();
                      bk.field_a[((dl) this).field_k].c(32, 60, 128);
                      k.field_f.a(0);
                      break L144;
                    }
                    if (((dl) this).field_s.field_i == null) {
                      break L110;
                    } else {
                      ((dl) this).field_s.field_i.a(-32 + param0, var8 - 64, ((dl) this).field_r, bk.field_a[((dl) this).field_k], true, 28144);
                      break L110;
                    }
                  }
                }
                if (((dl) this).field_A != uf.field_c) {
                  break L74;
                } else {
                  if ((((dl) this).field_n ^ -1) == (vf.field_a ^ -1)) {
                    break L74;
                  } else {
                    break L74;
                  }
                }
              }
            }
            L146: {
              if ((((dl) this).field_p ^ -1) < -1) {
                li.field_a = true;
                if (-65 < (((dl) this).field_p ^ -1)) {
                  gi.field_j[-(((dl) this).field_p / 4) + 15].b().a(-32 + param0, var8 + -56, 64, 64, 255);
                  break L146;
                } else {
                  break L146;
                }
              } else {
                break L146;
              }
            }
            L147: {
              if ((((dl) this).field_j ^ -1) > -1) {
                break L147;
              } else {
                if (jb.field_a) {
                  L148: {
                    L149: {
                      L150: {
                        if (((dl) this).field_z) {
                          break L150;
                        } else {
                          if (null == ((dl) this).field_s.field_l) {
                            break L149;
                          } else {
                            break L150;
                          }
                        }
                      }
                      L151: {
                        if ((((dl) this).field_j ^ -1) != -8) {
                          break L151;
                        } else {
                          L152: {
                            if (null != var9) {
                              break L152;
                            } else {
                              se.field_c[(((dl) this).field_A - -(3 * ((dl) this).field_n)) % se.field_c.length].b(param0 + -32, var8 - 112);
                              if (var13 == 0) {
                                break L148;
                              } else {
                                break L152;
                              }
                            }
                          }
                          var9.a();
                          se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length].b(32, 12);
                          k.field_f.a(0);
                          if (var13 == 0) {
                            break L148;
                          } else {
                            break L151;
                          }
                        }
                      }
                      L153: {
                        if (var9 != null) {
                          break L153;
                        } else {
                          kg.field_r[((dl) this).field_j].b(param0 + -32, -64 + var8);
                          if (var13 == 0) {
                            break L148;
                          } else {
                            break L153;
                          }
                        }
                      }
                      var9.a();
                      kg.field_r[((dl) this).field_j].b(32, 60);
                      k.field_f.a(0);
                      if (var13 == 0) {
                        break L148;
                      } else {
                        break L149;
                      }
                    }
                    L154: {
                      if (((dl) this).field_j == 7) {
                        break L154;
                      } else {
                        L155: {
                          if (var9 == null) {
                            break L155;
                          } else {
                            L156: {
                              var9.a();
                              stackOut_530_0 = this;
                              stackOut_530_1 = 32;
                              stackOut_530_2 = 60;
                              stackOut_530_3 = kg.field_r[((dl) this).field_j];
                              stackOut_530_4 = 17335;
                              stackIn_533_0 = stackOut_530_0;
                              stackIn_533_1 = stackOut_530_1;
                              stackIn_533_2 = stackOut_530_2;
                              stackIn_533_3 = stackOut_530_3;
                              stackIn_533_4 = stackOut_530_4;
                              stackIn_531_0 = stackOut_530_0;
                              stackIn_531_1 = stackOut_530_1;
                              stackIn_531_2 = stackOut_530_2;
                              stackIn_531_3 = stackOut_530_3;
                              stackIn_531_4 = stackOut_530_4;
                              if (!((dl) this).field_a) {
                                stackOut_533_0 = this;
                                stackOut_533_1 = stackIn_533_1;
                                stackOut_533_2 = stackIn_533_2;
                                stackOut_533_3 = (ci) (Object) stackIn_533_3;
                                stackOut_533_4 = stackIn_533_4;
                                stackIn_535_0 = stackOut_533_0;
                                stackIn_535_1 = stackOut_533_1;
                                stackIn_535_2 = stackOut_533_2;
                                stackIn_535_3 = stackOut_533_3;
                                stackIn_535_4 = stackOut_533_4;
                                stackIn_534_0 = stackOut_533_0;
                                stackIn_534_1 = stackOut_533_1;
                                stackIn_534_2 = stackOut_533_2;
                                stackIn_534_3 = stackOut_533_3;
                                stackIn_534_4 = stackOut_533_4;
                                if (((dl) this).field_d) {
                                  stackOut_535_0 = this;
                                  stackOut_535_1 = stackIn_535_1;
                                  stackOut_535_2 = stackIn_535_2;
                                  stackOut_535_3 = (ci) (Object) stackIn_535_3;
                                  stackOut_535_4 = stackIn_535_4;
                                  stackOut_535_5 = 0;
                                  stackIn_536_0 = stackOut_535_0;
                                  stackIn_536_1 = stackOut_535_1;
                                  stackIn_536_2 = stackOut_535_2;
                                  stackIn_536_3 = stackOut_535_3;
                                  stackIn_536_4 = stackOut_535_4;
                                  stackIn_536_5 = stackOut_535_5;
                                  break L156;
                                } else {
                                  stackOut_534_0 = this;
                                  stackOut_534_1 = stackIn_534_1;
                                  stackOut_534_2 = stackIn_534_2;
                                  stackOut_534_3 = (ci) (Object) stackIn_534_3;
                                  stackOut_534_4 = stackIn_534_4;
                                  stackOut_534_5 = 128;
                                  stackIn_536_0 = stackOut_534_0;
                                  stackIn_536_1 = stackOut_534_1;
                                  stackIn_536_2 = stackOut_534_2;
                                  stackIn_536_3 = stackOut_534_3;
                                  stackIn_536_4 = stackOut_534_4;
                                  stackIn_536_5 = stackOut_534_5;
                                  break L156;
                                }
                              } else {
                                stackOut_531_0 = this;
                                stackOut_531_1 = stackIn_531_1;
                                stackOut_531_2 = stackIn_531_2;
                                stackOut_531_3 = (ci) (Object) stackIn_531_3;
                                stackOut_531_4 = stackIn_531_4;
                                stackIn_532_0 = stackOut_531_0;
                                stackIn_532_1 = stackOut_531_1;
                                stackIn_532_2 = stackOut_531_2;
                                stackIn_532_3 = stackOut_531_3;
                                stackIn_532_4 = stackOut_531_4;
                                stackOut_532_0 = this;
                                stackOut_532_1 = stackIn_532_1;
                                stackOut_532_2 = stackIn_532_2;
                                stackOut_532_3 = (ci) (Object) stackIn_532_3;
                                stackOut_532_4 = stackIn_532_4;
                                stackOut_532_5 = 256;
                                stackIn_536_0 = stackOut_532_0;
                                stackIn_536_1 = stackOut_532_1;
                                stackIn_536_2 = stackOut_532_2;
                                stackIn_536_3 = stackOut_532_3;
                                stackIn_536_4 = stackOut_532_4;
                                stackIn_536_5 = stackOut_532_5;
                                break L156;
                              }
                            }
                            this.a(stackIn_536_1, stackIn_536_2, stackIn_536_3, stackIn_536_4, stackIn_536_5);
                            k.field_f.a(param4 + -125);
                            if (var13 == 0) {
                              break L148;
                            } else {
                              break L155;
                            }
                          }
                        }
                        L157: {
                          stackOut_537_0 = this;
                          stackOut_537_1 = -32 + param0;
                          stackOut_537_2 = var8 + -64;
                          stackOut_537_3 = kg.field_r[((dl) this).field_j];
                          stackOut_537_4 = 17335;
                          stackIn_543_0 = stackOut_537_0;
                          stackIn_543_1 = stackOut_537_1;
                          stackIn_543_2 = stackOut_537_2;
                          stackIn_543_3 = stackOut_537_3;
                          stackIn_543_4 = stackOut_537_4;
                          stackIn_538_0 = stackOut_537_0;
                          stackIn_538_1 = stackOut_537_1;
                          stackIn_538_2 = stackOut_537_2;
                          stackIn_538_3 = stackOut_537_3;
                          stackIn_538_4 = stackOut_537_4;
                          if (((dl) this).field_a) {
                            stackOut_543_0 = this;
                            stackOut_543_1 = stackIn_543_1;
                            stackOut_543_2 = stackIn_543_2;
                            stackOut_543_3 = (ci) (Object) stackIn_543_3;
                            stackOut_543_4 = stackIn_543_4;
                            stackOut_543_5 = 256;
                            stackIn_544_0 = stackOut_543_0;
                            stackIn_544_1 = stackOut_543_1;
                            stackIn_544_2 = stackOut_543_2;
                            stackIn_544_3 = stackOut_543_3;
                            stackIn_544_4 = stackOut_543_4;
                            stackIn_544_5 = stackOut_543_5;
                            break L157;
                          } else {
                            stackOut_538_0 = this;
                            stackOut_538_1 = stackIn_538_1;
                            stackOut_538_2 = stackIn_538_2;
                            stackOut_538_3 = (ci) (Object) stackIn_538_3;
                            stackOut_538_4 = stackIn_538_4;
                            stackIn_539_0 = stackOut_538_0;
                            stackIn_539_1 = stackOut_538_1;
                            stackIn_539_2 = stackOut_538_2;
                            stackIn_539_3 = stackOut_538_3;
                            stackIn_539_4 = stackOut_538_4;
                            stackOut_539_0 = this;
                            stackOut_539_1 = stackIn_539_1;
                            stackOut_539_2 = stackIn_539_2;
                            stackOut_539_3 = (ci) (Object) stackIn_539_3;
                            stackOut_539_4 = stackIn_539_4;
                            stackIn_542_0 = stackOut_539_0;
                            stackIn_542_1 = stackOut_539_1;
                            stackIn_542_2 = stackOut_539_2;
                            stackIn_542_3 = stackOut_539_3;
                            stackIn_542_4 = stackOut_539_4;
                            stackIn_540_0 = stackOut_539_0;
                            stackIn_540_1 = stackOut_539_1;
                            stackIn_540_2 = stackOut_539_2;
                            stackIn_540_3 = stackOut_539_3;
                            stackIn_540_4 = stackOut_539_4;
                            if (((dl) this).field_d) {
                              stackOut_542_0 = this;
                              stackOut_542_1 = stackIn_542_1;
                              stackOut_542_2 = stackIn_542_2;
                              stackOut_542_3 = (ci) (Object) stackIn_542_3;
                              stackOut_542_4 = stackIn_542_4;
                              stackOut_542_5 = 0;
                              stackIn_544_0 = stackOut_542_0;
                              stackIn_544_1 = stackOut_542_1;
                              stackIn_544_2 = stackOut_542_2;
                              stackIn_544_3 = stackOut_542_3;
                              stackIn_544_4 = stackOut_542_4;
                              stackIn_544_5 = stackOut_542_5;
                              break L157;
                            } else {
                              stackOut_540_0 = this;
                              stackOut_540_1 = stackIn_540_1;
                              stackOut_540_2 = stackIn_540_2;
                              stackOut_540_3 = (ci) (Object) stackIn_540_3;
                              stackOut_540_4 = stackIn_540_4;
                              stackIn_541_0 = stackOut_540_0;
                              stackIn_541_1 = stackOut_540_1;
                              stackIn_541_2 = stackOut_540_2;
                              stackIn_541_3 = stackOut_540_3;
                              stackIn_541_4 = stackOut_540_4;
                              stackOut_541_0 = this;
                              stackOut_541_1 = stackIn_541_1;
                              stackOut_541_2 = stackIn_541_2;
                              stackOut_541_3 = (ci) (Object) stackIn_541_3;
                              stackOut_541_4 = stackIn_541_4;
                              stackOut_541_5 = 128;
                              stackIn_544_0 = stackOut_541_0;
                              stackIn_544_1 = stackOut_541_1;
                              stackIn_544_2 = stackOut_541_2;
                              stackIn_544_3 = stackOut_541_3;
                              stackIn_544_4 = stackOut_541_4;
                              stackIn_544_5 = stackOut_541_5;
                              break L157;
                            }
                          }
                        }
                        this.a(stackIn_544_1, stackIn_544_2, stackIn_544_3, stackIn_544_4, stackIn_544_5);
                        if (var13 == 0) {
                          break L148;
                        } else {
                          break L154;
                        }
                      }
                    }
                    L158: {
                      if (null == var9) {
                        break L158;
                      } else {
                        L159: {
                          var9.a();
                          stackOut_547_0 = this;
                          stackOut_547_1 = 32;
                          stackOut_547_2 = 12;
                          stackOut_547_3 = se.field_c[(((dl) this).field_A + 3 * ((dl) this).field_n) % se.field_c.length];
                          stackOut_547_4 = 17335;
                          stackIn_553_0 = stackOut_547_0;
                          stackIn_553_1 = stackOut_547_1;
                          stackIn_553_2 = stackOut_547_2;
                          stackIn_553_3 = stackOut_547_3;
                          stackIn_553_4 = stackOut_547_4;
                          stackIn_548_0 = stackOut_547_0;
                          stackIn_548_1 = stackOut_547_1;
                          stackIn_548_2 = stackOut_547_2;
                          stackIn_548_3 = stackOut_547_3;
                          stackIn_548_4 = stackOut_547_4;
                          if (((dl) this).field_a) {
                            stackOut_553_0 = this;
                            stackOut_553_1 = stackIn_553_1;
                            stackOut_553_2 = stackIn_553_2;
                            stackOut_553_3 = (ci) (Object) stackIn_553_3;
                            stackOut_553_4 = stackIn_553_4;
                            stackOut_553_5 = 256;
                            stackIn_554_0 = stackOut_553_0;
                            stackIn_554_1 = stackOut_553_1;
                            stackIn_554_2 = stackOut_553_2;
                            stackIn_554_3 = stackOut_553_3;
                            stackIn_554_4 = stackOut_553_4;
                            stackIn_554_5 = stackOut_553_5;
                            break L159;
                          } else {
                            stackOut_548_0 = this;
                            stackOut_548_1 = stackIn_548_1;
                            stackOut_548_2 = stackIn_548_2;
                            stackOut_548_3 = (ci) (Object) stackIn_548_3;
                            stackOut_548_4 = stackIn_548_4;
                            stackIn_549_0 = stackOut_548_0;
                            stackIn_549_1 = stackOut_548_1;
                            stackIn_549_2 = stackOut_548_2;
                            stackIn_549_3 = stackOut_548_3;
                            stackIn_549_4 = stackOut_548_4;
                            stackOut_549_0 = this;
                            stackOut_549_1 = stackIn_549_1;
                            stackOut_549_2 = stackIn_549_2;
                            stackOut_549_3 = (ci) (Object) stackIn_549_3;
                            stackOut_549_4 = stackIn_549_4;
                            stackIn_552_0 = stackOut_549_0;
                            stackIn_552_1 = stackOut_549_1;
                            stackIn_552_2 = stackOut_549_2;
                            stackIn_552_3 = stackOut_549_3;
                            stackIn_552_4 = stackOut_549_4;
                            stackIn_550_0 = stackOut_549_0;
                            stackIn_550_1 = stackOut_549_1;
                            stackIn_550_2 = stackOut_549_2;
                            stackIn_550_3 = stackOut_549_3;
                            stackIn_550_4 = stackOut_549_4;
                            if (((dl) this).field_d) {
                              stackOut_552_0 = this;
                              stackOut_552_1 = stackIn_552_1;
                              stackOut_552_2 = stackIn_552_2;
                              stackOut_552_3 = (ci) (Object) stackIn_552_3;
                              stackOut_552_4 = stackIn_552_4;
                              stackOut_552_5 = 0;
                              stackIn_554_0 = stackOut_552_0;
                              stackIn_554_1 = stackOut_552_1;
                              stackIn_554_2 = stackOut_552_2;
                              stackIn_554_3 = stackOut_552_3;
                              stackIn_554_4 = stackOut_552_4;
                              stackIn_554_5 = stackOut_552_5;
                              break L159;
                            } else {
                              stackOut_550_0 = this;
                              stackOut_550_1 = stackIn_550_1;
                              stackOut_550_2 = stackIn_550_2;
                              stackOut_550_3 = (ci) (Object) stackIn_550_3;
                              stackOut_550_4 = stackIn_550_4;
                              stackIn_551_0 = stackOut_550_0;
                              stackIn_551_1 = stackOut_550_1;
                              stackIn_551_2 = stackOut_550_2;
                              stackIn_551_3 = stackOut_550_3;
                              stackIn_551_4 = stackOut_550_4;
                              stackOut_551_0 = this;
                              stackOut_551_1 = stackIn_551_1;
                              stackOut_551_2 = stackIn_551_2;
                              stackOut_551_3 = (ci) (Object) stackIn_551_3;
                              stackOut_551_4 = stackIn_551_4;
                              stackOut_551_5 = 128;
                              stackIn_554_0 = stackOut_551_0;
                              stackIn_554_1 = stackOut_551_1;
                              stackIn_554_2 = stackOut_551_2;
                              stackIn_554_3 = stackOut_551_3;
                              stackIn_554_4 = stackOut_551_4;
                              stackIn_554_5 = stackOut_551_5;
                              break L159;
                            }
                          }
                        }
                        this.a(stackIn_554_1, stackIn_554_2, stackIn_554_3, stackIn_554_4, stackIn_554_5);
                        k.field_f.a(0);
                        if (var13 == 0) {
                          break L148;
                        } else {
                          break L158;
                        }
                      }
                    }
                    L160: {
                      stackOut_555_0 = this;
                      stackOut_555_1 = param0 + -32;
                      stackOut_555_2 = -112 + var8;
                      stackOut_555_3 = se.field_c[(3 * ((dl) this).field_n + ((dl) this).field_A) % se.field_c.length];
                      stackOut_555_4 = 17335;
                      stackIn_561_0 = stackOut_555_0;
                      stackIn_561_1 = stackOut_555_1;
                      stackIn_561_2 = stackOut_555_2;
                      stackIn_561_3 = stackOut_555_3;
                      stackIn_561_4 = stackOut_555_4;
                      stackIn_556_0 = stackOut_555_0;
                      stackIn_556_1 = stackOut_555_1;
                      stackIn_556_2 = stackOut_555_2;
                      stackIn_556_3 = stackOut_555_3;
                      stackIn_556_4 = stackOut_555_4;
                      if (((dl) this).field_a) {
                        stackOut_561_0 = this;
                        stackOut_561_1 = stackIn_561_1;
                        stackOut_561_2 = stackIn_561_2;
                        stackOut_561_3 = (ci) (Object) stackIn_561_3;
                        stackOut_561_4 = stackIn_561_4;
                        stackOut_561_5 = 256;
                        stackIn_562_0 = stackOut_561_0;
                        stackIn_562_1 = stackOut_561_1;
                        stackIn_562_2 = stackOut_561_2;
                        stackIn_562_3 = stackOut_561_3;
                        stackIn_562_4 = stackOut_561_4;
                        stackIn_562_5 = stackOut_561_5;
                        break L160;
                      } else {
                        stackOut_556_0 = this;
                        stackOut_556_1 = stackIn_556_1;
                        stackOut_556_2 = stackIn_556_2;
                        stackOut_556_3 = (ci) (Object) stackIn_556_3;
                        stackOut_556_4 = stackIn_556_4;
                        stackIn_557_0 = stackOut_556_0;
                        stackIn_557_1 = stackOut_556_1;
                        stackIn_557_2 = stackOut_556_2;
                        stackIn_557_3 = stackOut_556_3;
                        stackIn_557_4 = stackOut_556_4;
                        stackOut_557_0 = this;
                        stackOut_557_1 = stackIn_557_1;
                        stackOut_557_2 = stackIn_557_2;
                        stackOut_557_3 = (ci) (Object) stackIn_557_3;
                        stackOut_557_4 = stackIn_557_4;
                        stackIn_560_0 = stackOut_557_0;
                        stackIn_560_1 = stackOut_557_1;
                        stackIn_560_2 = stackOut_557_2;
                        stackIn_560_3 = stackOut_557_3;
                        stackIn_560_4 = stackOut_557_4;
                        stackIn_558_0 = stackOut_557_0;
                        stackIn_558_1 = stackOut_557_1;
                        stackIn_558_2 = stackOut_557_2;
                        stackIn_558_3 = stackOut_557_3;
                        stackIn_558_4 = stackOut_557_4;
                        if (((dl) this).field_d) {
                          stackOut_560_0 = this;
                          stackOut_560_1 = stackIn_560_1;
                          stackOut_560_2 = stackIn_560_2;
                          stackOut_560_3 = (ci) (Object) stackIn_560_3;
                          stackOut_560_4 = stackIn_560_4;
                          stackOut_560_5 = 0;
                          stackIn_562_0 = stackOut_560_0;
                          stackIn_562_1 = stackOut_560_1;
                          stackIn_562_2 = stackOut_560_2;
                          stackIn_562_3 = stackOut_560_3;
                          stackIn_562_4 = stackOut_560_4;
                          stackIn_562_5 = stackOut_560_5;
                          break L160;
                        } else {
                          stackOut_558_0 = this;
                          stackOut_558_1 = stackIn_558_1;
                          stackOut_558_2 = stackIn_558_2;
                          stackOut_558_3 = (ci) (Object) stackIn_558_3;
                          stackOut_558_4 = stackIn_558_4;
                          stackIn_559_0 = stackOut_558_0;
                          stackIn_559_1 = stackOut_558_1;
                          stackIn_559_2 = stackOut_558_2;
                          stackIn_559_3 = stackOut_558_3;
                          stackIn_559_4 = stackOut_558_4;
                          stackOut_559_0 = this;
                          stackOut_559_1 = stackIn_559_1;
                          stackOut_559_2 = stackIn_559_2;
                          stackOut_559_3 = (ci) (Object) stackIn_559_3;
                          stackOut_559_4 = stackIn_559_4;
                          stackOut_559_5 = 128;
                          stackIn_562_0 = stackOut_559_0;
                          stackIn_562_1 = stackOut_559_1;
                          stackIn_562_2 = stackOut_559_2;
                          stackIn_562_3 = stackOut_559_3;
                          stackIn_562_4 = stackOut_559_4;
                          stackIn_562_5 = stackOut_559_5;
                          break L160;
                        }
                      }
                    }
                    this.a(stackIn_562_1, stackIn_562_2, stackIn_562_3, stackIn_562_4, stackIn_562_5);
                    break L148;
                  }
                  if (null == ((dl) this).field_s.field_i) {
                    break L147;
                  } else {
                    L161: {
                      var11_int = 0;
                      if (2 == nc.field_a[((dl) this).field_j]) {
                        var11_int = 1;
                        break L161;
                      } else {
                        break L161;
                      }
                    }
                    L162: {
                      if (nc.field_a[((dl) this).field_j] == 3) {
                        var11_int = 1;
                        break L162;
                      } else {
                        break L162;
                      }
                    }
                    L163: {
                      if (5 != nc.field_a[((dl) this).field_j]) {
                        break L163;
                      } else {
                        var11_int = 2;
                        break L163;
                      }
                    }
                    L164: {
                      if (-5 != (nc.field_a[((dl) this).field_j] ^ -1)) {
                        break L164;
                      } else {
                        var11_int = 3;
                        break L164;
                      }
                    }
                    L165: {
                      if (7 == ((dl) this).field_j) {
                        break L165;
                      } else {
                        ((dl) this).field_s.field_i.a(((dl) this).field_r, -32 + param0, (byte) -118, var11_int, -64 + var8, kg.field_r[((dl) this).field_j]);
                        if (var13 == 0) {
                          break L147;
                        } else {
                          break L165;
                        }
                      }
                    }
                    ((dl) this).field_s.field_i.a((byte) -101, var8 - 112, param0 - 32, se.field_c[(((dl) this).field_n * 3 + ((dl) this).field_A) % se.field_c.length]);
                    break L147;
                  }
                } else {
                  break L147;
                }
              }
            }
            L166: {
              if (-1 < (((dl) this).field_m ^ -1)) {
                break L166;
              } else {
                L167: {
                  var11 = null;
                  var11 = null;
                  if (1 != ((dl) this).field_m) {
                    break L167;
                  } else {
                    var11_ref = ui.field_a[11];
                    break L167;
                  }
                }
                L168: {
                  if (-3 != (((dl) this).field_m ^ -1)) {
                    break L168;
                  } else {
                    var11_ref = ui.field_a[3];
                    break L168;
                  }
                }
                L169: {
                  if (-4 == (((dl) this).field_m ^ -1)) {
                    var11_ref = ui.field_a[11];
                    break L169;
                  } else {
                    break L169;
                  }
                }
                L170: {
                  if (4 == ((dl) this).field_m) {
                    var11_ref = ui.field_a[7];
                    break L170;
                  } else {
                    break L170;
                  }
                }
                L171: {
                  if (5 == ((dl) this).field_m) {
                    var11_ref = ui.field_a[15];
                    break L171;
                  } else {
                    break L171;
                  }
                }
                L172: {
                  if (6 != ((dl) this).field_m) {
                    break L172;
                  } else {
                    var11_ref = ui.field_a[15];
                    break L172;
                  }
                }
                L173: {
                  if (((dl) this).field_m != 7) {
                    break L173;
                  } else {
                    var11_ref = lf.field_e[3];
                    break L173;
                  }
                }
                L174: {
                  if (-9 == (((dl) this).field_m ^ -1)) {
                    var11_ref = lf.field_e[7];
                    break L174;
                  } else {
                    break L174;
                  }
                }
                L175: {
                  if (-10 != (((dl) this).field_m ^ -1)) {
                    break L175;
                  } else {
                    var11_ref = lf.field_e[11];
                    break L175;
                  }
                }
                L176: {
                  if (-11 == (((dl) this).field_m ^ -1)) {
                    var11_ref = lf.field_e[15];
                    break L176;
                  } else {
                    break L176;
                  }
                }
                L177: {
                  if (11 != ((dl) this).field_m) {
                    break L177;
                  } else {
                    var11_ref = wb.field_h[3];
                    break L177;
                  }
                }
                if (null == var11_ref) {
                  break L166;
                } else {
                  L178: {
                    L179: {
                      if (((dl) this).field_z) {
                        break L179;
                      } else {
                        if (null != ((dl) this).field_s.field_l) {
                          break L179;
                        } else {
                          if (!((dl) this).field_a) {
                            break L178;
                          } else {
                            break L179;
                          }
                        }
                      }
                    }
                    L180: {
                      if (null == var9) {
                        break L180;
                      } else {
                        var9.a();
                        var11_ref.b(64 - var11_ref.field_f / 2, 15 + (124 - var11_ref.field_i), ((dl) this).field_t);
                        k.field_f.a(0);
                        if (var13 == 0) {
                          break L166;
                        } else {
                          break L180;
                        }
                      }
                    }
                    var11_ref.b(-(var11_ref.field_f / 2) + param0, 15 + var8 - var11_ref.field_i, ((dl) this).field_t);
                    if (var13 == 0) {
                      break L166;
                    } else {
                      break L178;
                    }
                  }
                  L181: {
                    if (null != var9) {
                      break L181;
                    } else {
                      this.a(param0 - var11_ref.field_f / 2, -var11_ref.field_i + var8 + 15, var11_ref.b(), 17335, 0);
                      if (var13 == 0) {
                        break L166;
                      } else {
                        break L181;
                      }
                    }
                  }
                  var9.a();
                  this.a(-(var11_ref.field_f / 2) + 64, 15 + (124 - var11_ref.field_i), var11_ref.b(), 17335, 0);
                  k.field_f.a(0);
                  break L166;
                }
              }
            }
            L182: {
              if (null == ((dl) this).field_C) {
                break L182;
              } else {
                int discarded$3 = ((dl) this).field_C.a(param0, param1, param2, param3, (byte) 125, param5);
                break L182;
              }
            }
            L183: {
              if (var9 == null) {
                break L183;
              } else {
                L184: {
                  L185: {
                    L186: {
                      u.field_a.a();
                      var9.d(0, 0);
                      if (null == ((dl) this).field_s.field_i) {
                        break L186;
                      } else {
                        if (-1 > (((dl) this).field_s.field_i.field_L ^ -1)) {
                          break L185;
                        } else {
                          break L186;
                        }
                      }
                    }
                    c.a((byte) -86, u.field_a, 16777215);
                    c.a((byte) -86, u.field_a, 8454016);
                    c.a((byte) -86, u.field_a, 4259648);
                    c.a((byte) -86, u.field_a, 32768);
                    c.a((byte) -86, u.field_a, 16384);
                    if (var13 == 0) {
                      break L184;
                    } else {
                      break L185;
                    }
                  }
                  c.a((byte) -86, u.field_a, 16777215);
                  c.a((byte) -86, u.field_a, 16744576);
                  c.a((byte) -86, u.field_a, 16728128);
                  c.a((byte) -86, u.field_a, 8388608);
                  c.a((byte) -86, u.field_a, 4194304);
                  break L184;
                }
                var9.b(0, 0, 0);
                k.field_f.a(param4 ^ 125);
                hb.field_n = var8 + -124;
                ug.field_b = -64 + param0;
                var9.b(param0 - 64, var8 - 124);
                break L183;
              }
            }
            return param1;
          }
        } else {
          return 11;
        }
    }

    final static void a(boolean param0, int param1, int param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        L0: {
          var42 = Terraphoenix.field_V;
          if (param10 < 0) {
            break L0;
          } else {
            if ((ob.field_h ^ -1) < (param12 ^ -1)) {
              L1: {
                if ((param16 ^ -1) <= -1) {
                  break L1;
                } else {
                  if (0 <= param5) {
                    break L1;
                  } else {
                    if (0 <= param7) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (ob.field_i > param16) {
                  break L2;
                } else {
                  if ((param5 ^ -1) > (ob.field_i ^ -1)) {
                    break L2;
                  } else {
                    if (param7 >= ob.field_i) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param0) {
                  break L3;
                } else {
                  field_o = null;
                  break L3;
                }
              }
              L4: {
                L5: {
                  var34 = -param12 + param10;
                  if (param4 == param12) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var30 = param6 << 1362959184;
                        var29 = param6 << 1362959184;
                        var18 = param16 << -116833936;
                        var17_int = param16 << -116833936;
                        var22 = param14 << -1699301712;
                        var21 = param14 << -1699301712;
                        var26 = param15 << 338468496;
                        var25 = param15 << 338468496;
                        var35 = -param12 + param4;
                        var20 = (param7 + -param16 << 289600912) / var34;
                        var19 = (-param16 + param5 << 1348208528) / var35;
                        if (var19 >= var20) {
                          break L7;
                        } else {
                          var31 = (-param6 + param13 << 569084944) / var35;
                          var28 = (param8 - param15 << 1658802736) / var34;
                          var24 = (param1 - param14 << -1147348912) / var34;
                          var27 = (param11 + -param15 << -1910833136) / var35;
                          var33 = 0;
                          var32 = (param2 - param6 << -326002064) / var34;
                          var23 = (-param14 + param9 << 1150428016) / var35;
                          if (var42 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var33 = 1;
                      var27 = (param8 - param15 << 506090320) / var34;
                      var36 = var19;
                      var19 = var20;
                      var20 = var36;
                      var32 = (-param6 + param13 << 892279856) / var35;
                      var24 = (param9 + -param14 << -829496208) / var35;
                      var23 = (-param14 + param1 << 688513264) / var34;
                      var31 = (param2 - param6 << 1785476784) / var34;
                      var28 = (param11 + -param15 << -1186070320) / var35;
                      break L6;
                    }
                    L8: {
                      L9: {
                        L10: {
                          if (0 > param12) {
                            L11: {
                              if (0 > param4) {
                                break L11;
                              } else {
                                param12 = -param12;
                                var17_int = var17_int + var19 * param12;
                                var26 = var26 + param12 * var28;
                                var30 = var30 + var32 * param12;
                                var18 = var18 + var20 * param12;
                                var22 = var22 + var24 * param12;
                                var29 = var29 + param12 * var31;
                                var21 = var21 + var23 * param12;
                                var25 = var25 + var27 * param12;
                                param12 = 0;
                                if (var42 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            param12 = -param12 + param4;
                            var26 = var26 + var28 * param12;
                            var18 = var18 + param12 * var20;
                            var22 = var22 + param12 * var24;
                            var17_int = var17_int + param12 * var19;
                            var21 = var21 + param12 * var23;
                            var29 = var29 + var31 * param12;
                            var25 = var25 + param12 * var27;
                            var30 = var30 + var32 * param12;
                            param12 = param4;
                            if (var42 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        var36 = ob.field_d[param12];
                        L12: while (true) {
                          if (param4 <= param12) {
                            break L9;
                          } else {
                            var37 = var17_int >> 1595018448;
                            stackOut_29_0 = ob.field_i ^ -1;
                            stackOut_29_1 = var37 ^ -1;
                            stackIn_51_0 = stackOut_29_0;
                            stackIn_51_1 = stackOut_29_1;
                            stackIn_30_0 = stackOut_29_0;
                            stackIn_30_1 = stackOut_29_1;
                            if (var42 != 0) {
                              break L8;
                            } else {
                              L13: {
                                if (stackIn_30_0 < stackIn_30_1) {
                                  L14: {
                                    var38 = -(var17_int >> 1994220464) + (var18 >> -638700464);
                                    if (-1 != (var38 ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var37 < 0) {
                                        break L13;
                                      } else {
                                        if (var37 < ob.field_i) {
                                          fl.a(var38, param3, 0, 6, var25, var21, var29, 0, var37 - -var36, 0);
                                          if (var42 == 0) {
                                            break L13;
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                  L15: {
                                    var39 = (var22 + -var21) / var38;
                                    var40 = (var26 + -var25) / var38;
                                    var41 = (var30 - var29) / var38;
                                    if ((var37 - -var38 ^ -1) <= (ob.field_i ^ -1)) {
                                      var38 = -1 + (-var37 + ob.field_i);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (var37 < 0) {
                                      break L16;
                                    } else {
                                      fl.a(var38, param3, var41, 6, var25, var21, var29, var40, var37 + var36, var39);
                                      if (var42 == 0) {
                                        break L13;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  fl.a(var38 + var37, param3, var41, 6, var25 - var37 * var40, -(var37 * var39) + var21, -(var41 * var37) + var29, var40, var36, var39);
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              param12++;
                              if (param12 < ob.field_h) {
                                var18 = var18 + var20;
                                var26 = var26 + var28;
                                var25 = var25 + var27;
                                var29 = var29 + var31;
                                var30 = var30 + var32;
                                var22 = var22 + var24;
                                var17_int = var17_int + var19;
                                var21 = var21 + var23;
                                var36 = var36 + l.field_k;
                                if (var42 == 0) {
                                  continue L12;
                                } else {
                                  break L9;
                                }
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      }
                      var36 = param10 + -param4;
                      stackOut_50_0 = -1;
                      stackOut_50_1 = var36 ^ -1;
                      stackIn_51_0 = stackOut_50_0;
                      stackIn_51_1 = stackOut_50_1;
                      break L8;
                    }
                    L17: {
                      L18: {
                        if (stackIn_51_0 == stackIn_51_1) {
                          break L18;
                        } else {
                          L19: {
                            L20: {
                              var37 = param7 << 1295155792;
                              var38 = param1 << 767337584;
                              var39 = param8 << 166838352;
                              if (var33 == 0) {
                                break L20;
                              } else {
                                var26 = param11 << -1395685104;
                                var22 = param9 << 306332240;
                                var18 = param5 << 1479198544;
                                var30 = param13 << -189833072;
                                if (var42 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var25 = param11 << -52728240;
                            var29 = param13 << -1972528080;
                            var21 = param9 << -1441321936;
                            var17_int = param5 << -1190751984;
                            break L19;
                          }
                          var40 = param2 << 42883248;
                          var23 = (-var21 + var38) / var36;
                          var20 = (-var18 + var37) / var36;
                          var27 = (var39 + -var25) / var36;
                          var28 = (-var26 + var39) / var36;
                          var24 = (var38 - var22) / var36;
                          var32 = (-var30 + var40) / var36;
                          var19 = (var37 - var17_int) / var36;
                          var31 = (var40 - var29) / var36;
                          if (var42 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var19 = 0;
                      var31 = 0;
                      var24 = 0;
                      var20 = 0;
                      var23 = 0;
                      var32 = 0;
                      var27 = 0;
                      var28 = 0;
                      break L17;
                    }
                    if (var42 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L21: {
                  L22: {
                    if ((param10 ^ -1) == (param12 ^ -1)) {
                      break L22;
                    } else {
                      L23: {
                        L24: {
                          var35 = param10 + -param4;
                          if ((param5 ^ -1) >= (param16 ^ -1)) {
                            break L24;
                          } else {
                            var25 = param15 << 1202402864;
                            var27 = (param8 - param15 << 1949592560) / var34;
                            var17_int = param16 << -1667205264;
                            var20 = (param7 + -param5 << 1278538704) / var35;
                            var29 = param6 << 1912371536;
                            var32 = (-param13 + param2 << -1286939216) / var35;
                            var23 = (-param14 + param1 << 550000528) / var34;
                            var21 = param14 << -1713576304;
                            var31 = (param2 + -param6 << 763227120) / var34;
                            var24 = (param1 + -param9 << -360768624) / var35;
                            var30 = param13 << 1964611632;
                            var28 = (-param11 + param8 << -731003376) / var35;
                            var18 = param5 << -446949296;
                            var26 = param11 << 42853040;
                            var22 = param9 << -1675443952;
                            var19 = (-param16 + param7 << -719628400) / var34;
                            if (var42 == 0) {
                              break L23;
                            } else {
                              break L24;
                            }
                          }
                        }
                        var29 = param13 << 668316560;
                        var21 = param9 << -880986960;
                        var18 = param16 << 1689219856;
                        var31 = (param2 + -param13 << -1706300560) / var35;
                        var28 = (param8 - param15 << -2140026000) / var34;
                        var32 = (-param6 + param2 << 1049773776) / var34;
                        var23 = (param1 - param9 << -535307728) / var35;
                        var26 = param15 << 73799856;
                        var17_int = param5 << 171762320;
                        var19 = (param7 + -param5 << 15209904) / var35;
                        var20 = (param7 + -param16 << 718790192) / var34;
                        var30 = param6 << -576546832;
                        var27 = (-param11 + param8 << -986393488) / var35;
                        var24 = (-param14 + param1 << 1561093296) / var34;
                        var25 = param11 << -1138255152;
                        var22 = param14 << -1680730768;
                        break L23;
                      }
                      if (var42 == 0) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  var19 = 0;
                  var24 = 0;
                  var26 = param11;
                  var23 = 0;
                  var17_int = param16 << -903310736;
                  var31 = 0;
                  var28 = 0;
                  var30 = param13;
                  var18 = param5 << 401282896;
                  var32 = 0;
                  var22 = param9;
                  var25 = param15;
                  var29 = param6;
                  var21 = param14;
                  var20 = 0;
                  var27 = 0;
                  break L21;
                }
                var33 = 0;
                if ((param12 ^ -1) > -1) {
                  param12 = Math.min(-param12, param4 + -param12);
                  var17_int = var17_int + param12 * var19;
                  var22 = var22 + param12 * var24;
                  var30 = var30 + var32 * param12;
                  var25 = var25 + param12 * var27;
                  var21 = var21 + param12 * var23;
                  var26 = var26 + param12 * var28;
                  var29 = var29 + param12 * var31;
                  var18 = var18 + var20 * param12;
                  param12 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L25: {
                if ((param12 ^ -1) > -1) {
                  param12 = -param12;
                  var30 = var30 + param12 * var32;
                  var25 = var25 + param12 * var27;
                  var18 = var18 + var20 * param12;
                  var17_int = var17_int + var19 * param12;
                  var29 = var29 + var31 * param12;
                  var21 = var21 + param12 * var23;
                  var22 = var22 + param12 * var24;
                  var26 = var26 + param12 * var28;
                  param12 = 0;
                  break L25;
                } else {
                  break L25;
                }
              }
              var35 = ob.field_d[param12];
              L26: while (true) {
                L27: {
                  L28: {
                    if ((param10 ^ -1) >= (param12 ^ -1)) {
                      break L28;
                    } else {
                      var36 = var17_int >> -1345081360;
                      if (var42 != 0) {
                        break L27;
                      } else {
                        L29: {
                          if ((ob.field_i ^ -1) >= (var36 ^ -1)) {
                            break L29;
                          } else {
                            L30: {
                              var37 = -(var17_int >> 1124861328) + (var18 >> -1779566480);
                              if (0 == var37) {
                                break L30;
                              } else {
                                L31: {
                                  var38 = (-var21 + var22) / var37;
                                  var39 = (-var25 + var26) / var37;
                                  var40 = (var30 + -var29) / var37;
                                  if (ob.field_i > var36 - -var37) {
                                    break L31;
                                  } else {
                                    var37 = -1 + -var36 + ob.field_i;
                                    break L31;
                                  }
                                }
                                L32: {
                                  L33: {
                                    if (-1 < (var36 ^ -1)) {
                                      break L33;
                                    } else {
                                      fl.a(var37, param3, var40, 6, var25, var21, var29, var39, var35 + var36, var38);
                                      if (var42 == 0) {
                                        break L32;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  fl.a(var36 + var37, param3, var40, 6, -(var39 * var36) + var25, var21 - var38 * var36, var29 - var40 * var36, var39, var35, var38);
                                  break L32;
                                }
                                if (var42 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            if (var36 < 0) {
                              break L29;
                            } else {
                              if ((var36 ^ -1) <= (ob.field_i ^ -1)) {
                                break L29;
                              } else {
                                fl.a(var37, param3, 0, 6, var25, var21, var29, 0, var36 - -var35, 0);
                                break L29;
                              }
                            }
                          }
                        }
                        param12++;
                        if ((ob.field_h ^ -1) < (param12 ^ -1)) {
                          var17_int = var17_int + var19;
                          var25 = var25 + var27;
                          var29 = var29 + var31;
                          var26 = var26 + var28;
                          var30 = var30 + var32;
                          var22 = var22 + var24;
                          var21 = var21 + var23;
                          var35 = var35 + l.field_k;
                          var18 = var18 + var20;
                          if (var42 == 0) {
                            continue L26;
                          } else {
                            break L28;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  break L27;
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int stackIn_36_0 = 0;
        int stackIn_44_0 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_68_0 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_84_0 = null;
        int stackIn_92_0 = 0;
        Object stackIn_114_0 = null;
        int[] stackIn_122_0 = null;
        Object stackIn_143_0 = null;
        Object stackIn_147_0 = null;
        Object stackIn_151_0 = null;
        Object stackIn_155_0 = null;
        Object stackIn_159_0 = null;
        Object stackIn_163_0 = null;
        Object stackIn_171_0 = null;
        int stackIn_175_0 = 0;
        Object stackIn_179_0 = null;
        int stackIn_183_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_202_0 = 0;
        Object stackIn_206_0 = null;
        double stackIn_210_0 = 0.0;
        int stackIn_210_1 = 0;
        int stackIn_210_2 = 0;
        double stackIn_212_0 = 0.0;
        int stackIn_212_1 = 0;
        int stackIn_212_2 = 0;
        double stackIn_213_0 = 0.0;
        int stackIn_213_1 = 0;
        int stackIn_213_2 = 0;
        Object stackIn_213_3 = null;
        double stackIn_214_0 = 0.0;
        int stackIn_214_1 = 0;
        int stackIn_214_2 = 0;
        double stackIn_216_0 = 0.0;
        int stackIn_216_1 = 0;
        int stackIn_216_2 = 0;
        double stackIn_218_0 = 0.0;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        double stackIn_219_0 = 0.0;
        int stackIn_219_1 = 0;
        int stackIn_219_2 = 0;
        int stackIn_219_3 = 0;
        Object stackIn_225_0 = null;
        int stackOut_35_0 = 0;
        int stackOut_43_0 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_67_0 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_83_0 = null;
        int stackOut_91_0 = 0;
        Object stackOut_113_0 = null;
        int[] stackOut_121_0 = null;
        Object stackOut_142_0 = null;
        Object stackOut_146_0 = null;
        Object stackOut_150_0 = null;
        Object stackOut_154_0 = null;
        Object stackOut_158_0 = null;
        Object stackOut_162_0 = null;
        Object stackOut_170_0 = null;
        int stackOut_174_0 = 0;
        Object stackOut_178_0 = null;
        int stackOut_182_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_201_0 = 0;
        Object stackOut_205_0 = null;
        double stackOut_209_0 = 0.0;
        int stackOut_209_1 = 0;
        int stackOut_209_2 = 0;
        double stackOut_210_0 = 0.0;
        int stackOut_210_1 = 0;
        int stackOut_210_2 = 0;
        double stackOut_212_0 = 0.0;
        int stackOut_212_1 = 0;
        int stackOut_212_2 = 0;
        Object stackOut_212_3 = null;
        double stackOut_213_0 = 0.0;
        int stackOut_213_1 = 0;
        int stackOut_213_2 = 0;
        double stackOut_214_0 = 0.0;
        int stackOut_214_1 = 0;
        int stackOut_214_2 = 0;
        double stackOut_216_0 = 0.0;
        int stackOut_216_1 = 0;
        int stackOut_216_2 = 0;
        int stackOut_216_3 = 0;
        double stackOut_218_0 = 0.0;
        int stackOut_218_1 = 0;
        int stackOut_218_2 = 0;
        int stackOut_218_3 = 0;
        Object stackOut_224_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((dl) this).field_e = 0;
                        if (0 > ((dl) this).field_g) {
                            statePc = 15;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (1 != nh.field_E[((dl) this).field_g]) {
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
                        ((dl) this).a(1, true, param0 ^ 106);
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
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (nh.field_E[((dl) this).field_g] != 2) {
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
                        ((dl) this).a(1, false, -68);
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
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (3 != nh.field_E[((dl) this).field_g]) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((dl) this).a(1, true, 110);
                        ((dl) this).field_i = ((dl) this).field_i | 1;
                        ((dl) this).field_s.a(92, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_i = ((dl) this).field_s.a(92, ((dl) this).field_n, ((dl) this).field_r, -1 + ((dl) this).field_A).field_i | 4;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (0 > ((dl) this).field_k) {
                            statePc = 30;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (-2 == (nh.field_E[((dl) this).field_k] ^ -1)) {
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
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((dl) this).a(2, true, -71);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (-3 == (nh.field_E[((dl) this).field_k] ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((dl) this).a(2, false, param0 ^ 89);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-4 == (nh.field_E[((dl) this).field_k] ^ -1)) {
                            statePc = 29;
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
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((dl) this).a(2, true, 92);
                        ((dl) this).field_i = ((dl) this).field_i | 2;
                        ((dl) this).field_s.a(111, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_i = ((dl) this).field_s.a(111, ((dl) this).field_n + -1, ((dl) this).field_r, ((dl) this).field_A).field_i | 8;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((dl) this).field_v = param0;
                        if (0 != (((dl) this).field_b ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((dl) this).field_v = -1;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (-1 != (((dl) this).field_b ^ -1)) {
                            statePc = 42;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        stackOut_35_0 = -12;
                        stackIn_36_0 = stackOut_35_0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (stackIn_36_0 == (((dl) this).field_s.field_i.field_G.field_Bb ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ((dl) this).field_b = 12;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if ((((dl) this).field_b ^ -1) != -2) {
                            statePc = 50;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = -12;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 == (((dl) this).field_s.field_i.field_G.field_Bb ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
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
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((dl) this).field_b = 13;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if (((dl) this).field_b != 2) {
                            statePc = 58;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = this;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((((dl) this).field_s.field_i.field_G.field_Bb ^ -1) != -12) {
                            statePc = 58;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((dl) this).field_b = 13;
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if (3 != ((dl) this).field_b) {
                            statePc = 66;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        stackOut_59_0 = this;
                        stackIn_60_0 = stackOut_59_0;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (((dl) this).field_s.field_i.field_G.field_Bb != 11) {
                            statePc = 66;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        ((dl) this).field_b = 1;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        ((dl) this).field_d = false;
                        if (4 == ((dl) this).field_b) {
                            statePc = 75;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = -15;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 == (((dl) this).field_b ^ -1)) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = this;
                        stackIn_72_0 = stackOut_71_0;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 74;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        if (((dl) this).field_b != 15) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        ((dl) this).field_d = true;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 77;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        if (((dl) this).field_j != 34) {
                            statePc = 82;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        ((dl) this).field_d = true;
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 81;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        if (((dl) this).field_c == null) {
                            statePc = 90;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackOut_83_0 = this;
                        stackIn_84_0 = stackOut_83_0;
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (((dl) this).field_c.field_d) {
                            statePc = 89;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 88;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        ((dl) this).field_d = true;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (((dl) this).field_C == null) {
                            statePc = 98;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        stackOut_91_0 = 7;
                        stackIn_92_0 = stackOut_91_0;
                        statePc = 92;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (stackIn_92_0 == ((dl) this).field_j) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        ((dl) this).field_C.field_j = -1;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (-6 == (((dl) this).field_b ^ -1)) {
                            statePc = 101;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 100;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        ((dl) this).field_d = false;
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (null == ((dl) this).field_C) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        ((dl) this).field_C.field_c = (dl) this;
                        ((dl) this).field_C.a(param0 + 0);
                        if (Terraphoenix.field_V == 0) {
                            statePc = 112;
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
                        if (((dl) this).field_v == -1) {
                            statePc = 112;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        ((dl) this).field_C = new dl(((dl) this).field_A, ((dl) this).field_n, 1 + ((dl) this).field_r, ((dl) this).field_s);
                        ((dl) this).field_C.field_c = (dl) this;
                        ((dl) this).field_C.a(0);
                        statePc = 110;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        if (((dl) this).field_c == null) {
                            statePc = 120;
                        } else {
                            statePc = 113;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        stackOut_113_0 = this;
                        stackIn_114_0 = stackOut_113_0;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 116;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (((dl) this).field_c.field_j != 7) {
                            statePc = 120;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        statePc = 117;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        ((dl) this).field_j = -1;
                        statePc = 118;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 119;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (0 <= (((dl) this).field_j ^ -1)) {
                            statePc = 141;
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
                        stackOut_121_0 = nc.field_a;
                        stackIn_122_0 = stackOut_121_0;
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 124;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        if (stackIn_122_0[((dl) this).field_j] == 0) {
                            statePc = 141;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        statePc = 125;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 127;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        ((dl) this).field_v = nc.field_a[((dl) this).field_j];
                        if ((nc.field_a[((dl) this).field_j] ^ -1) != -6) {
                            statePc = 134;
                        } else {
                            statePc = 126;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 130;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        ((dl) this).field_v = 0;
                        if (null != ((dl) this).field_C) {
                            statePc = 133;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        statePc = 131;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        ((dl) this).field_C.field_v = 5;
                        statePc = 134;
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        if (4 != nc.field_a[((dl) this).field_j]) {
                            statePc = 141;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 137;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        ((dl) this).field_v = 4;
                        if (null != ((dl) this).field_C) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 139;
                        continue stateLoop;
                    }
                }
                case 139: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_139) {
                        caughtException = stateCaught_139;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        ((dl) this).field_C.field_v = 0;
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        ((dl) this).field_u = true;
                        if (!((dl) this).field_s.b(((dl) this).field_A, ((dl) this).field_n, -127, 1 + ((dl) this).field_r)) {
                            statePc = 166;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        stackOut_142_0 = this;
                        stackIn_143_0 = stackOut_142_0;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 145;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (!((dl) this).field_s.b(1 + ((dl) this).field_A, ((dl) this).field_n - -1, -101, 1 + ((dl) this).field_r)) {
                            statePc = 166;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        statePc = 146;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        stackOut_146_0 = this;
                        stackIn_147_0 = stackOut_146_0;
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (!((dl) this).field_s.b(((dl) this).field_A - -2, 2 + ((dl) this).field_n, -99, 1 + ((dl) this).field_r)) {
                            statePc = 166;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        stackOut_150_0 = this;
                        stackIn_151_0 = stackOut_150_0;
                        statePc = 151;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 153;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        if (!((dl) this).field_s.b(1 + ((dl) this).field_A, 2 + ((dl) this).field_n, -121, ((dl) this).field_r - -1)) {
                            statePc = 166;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 154;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        stackOut_154_0 = this;
                        stackIn_155_0 = stackOut_154_0;
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        if (!((dl) this).field_s.b(((dl) this).field_A + 2, 1 + ((dl) this).field_n, -108, ((dl) this).field_r - -1)) {
                            statePc = 166;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 158;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        stackOut_158_0 = this;
                        stackIn_159_0 = stackOut_158_0;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 161;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (!((dl) this).field_s.b(1 + ((dl) this).field_A, ((dl) this).field_n, -115, ((dl) this).field_r + 1)) {
                            statePc = 166;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        statePc = 162;
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        stackOut_162_0 = this;
                        stackIn_163_0 = stackOut_162_0;
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 165;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        if (((dl) this).field_s.b(((dl) this).field_A, 1 + ((dl) this).field_n, -96, 1 + ((dl) this).field_r)) {
                            statePc = 169;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        ((dl) this).field_u = false;
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 168;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        statePc = 169;
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        ((dl) this).field_q = -1;
                        ((dl) this).field_z = false;
                        ((dl) this).field_a = false;
                        if (((dl) this).field_s.field_i.field_G.field_db) {
                            statePc = 200;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        stackOut_170_0 = this;
                        stackIn_171_0 = stackOut_170_0;
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (((dl) this).field_s.field_i.field_G.field_Bb == 0) {
                            statePc = 200;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 174;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        stackOut_174_0 = 1;
                        stackIn_175_0 = stackOut_174_0;
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 177;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if (stackIn_175_0 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                            statePc = 200;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        statePc = 178;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        stackOut_178_0 = this;
                        stackIn_179_0 = stackOut_178_0;
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 181;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        if ((((dl) this).field_s.field_i.field_G.field_Bb ^ -1) == -3) {
                            statePc = 200;
                        } else {
                            statePc = 180;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        statePc = 182;
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        stackOut_182_0 = 3;
                        stackIn_183_0 = stackOut_182_0;
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (stackIn_183_0 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                            statePc = 200;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        stackOut_186_0 = -8;
                        stackIn_187_0 = stackOut_186_0;
                        statePc = 187;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 189;
                        continue stateLoop;
                    }
                }
                case 187: {
                    try {
                        if (stackIn_187_0 == (((dl) this).field_s.field_i.field_G.field_Bb ^ -1)) {
                            statePc = 200;
                        } else {
                            statePc = 188;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_187) {
                        caughtException = stateCaught_187;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        stackOut_190_0 = 9;
                        stackIn_191_0 = stackOut_190_0;
                        statePc = 191;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 193;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        if (stackIn_191_0 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                            statePc = 200;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        stackOut_194_0 = 11;
                        stackIn_195_0 = stackOut_194_0;
                        statePc = 195;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 197;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        if (stackIn_195_0 == ((dl) this).field_s.field_i.field_G.field_Bb) {
                            statePc = 200;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        statePc = 198;
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 198: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_198) {
                        caughtException = stateCaught_198;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        if (-1 != ((dl) this).field_j) {
                            statePc = 223;
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
                        stackOut_201_0 = -1;
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
                        if (stackIn_202_0 == ((dl) this).field_b) {
                            statePc = 223;
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
                        stackOut_205_0 = this;
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
                        if (((dl) this).field_d) {
                            statePc = 223;
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
                        stackOut_209_0 = Math.random() * 100.0;
                        stackOut_209_1 = -(((dl) this).field_r * 5);
                        stackOut_209_2 = 5;
                        stackIn_218_0 = stackOut_209_0;
                        stackIn_218_1 = stackOut_209_1;
                        stackIn_218_2 = stackOut_209_2;
                        stackIn_210_0 = stackOut_209_0;
                        stackIn_210_1 = stackOut_209_1;
                        stackIn_210_2 = stackOut_209_2;
                        if (((dl) this).field_g != -1) {
                            statePc = 218;
                        } else {
                            statePc = 210;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        stackOut_210_0 = stackIn_210_0;
                        stackOut_210_1 = stackIn_210_1;
                        stackOut_210_2 = stackIn_210_2;
                        stackIn_212_0 = stackOut_210_0;
                        stackIn_212_1 = stackOut_210_1;
                        stackIn_212_2 = stackOut_210_2;
                        statePc = 212;
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = stackIn_212_0;
                        stackOut_212_1 = stackIn_212_1;
                        stackOut_212_2 = stackIn_212_2;
                        stackOut_212_3 = this;
                        stackIn_213_0 = stackOut_212_0;
                        stackIn_213_1 = stackOut_212_1;
                        stackIn_213_2 = stackOut_212_2;
                        stackIn_213_3 = stackOut_212_3;
                        statePc = 213;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        stackOut_213_0 = stackIn_213_0;
                        stackOut_213_1 = stackIn_213_1;
                        stackOut_213_2 = stackIn_213_2;
                        stackIn_218_0 = stackOut_213_0;
                        stackIn_218_1 = stackOut_213_1;
                        stackIn_218_2 = stackOut_213_2;
                        stackIn_214_0 = stackOut_213_0;
                        stackIn_214_1 = stackOut_213_1;
                        stackIn_214_2 = stackOut_213_2;
                        if ((((dl) this).field_k ^ -1) != 0) {
                            statePc = 218;
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
                        stackOut_214_0 = stackIn_214_0;
                        stackOut_214_1 = stackIn_214_1;
                        stackOut_214_2 = stackIn_214_2;
                        stackIn_216_0 = stackOut_214_0;
                        stackIn_216_1 = stackOut_214_1;
                        stackIn_216_2 = stackOut_214_2;
                        statePc = 216;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = stackIn_216_0;
                        stackOut_216_1 = stackIn_216_1;
                        stackOut_216_2 = stackIn_216_2;
                        stackOut_216_3 = 0;
                        stackIn_219_0 = stackOut_216_0;
                        stackIn_219_1 = stackOut_216_1;
                        stackIn_219_2 = stackOut_216_2;
                        stackIn_219_3 = stackOut_216_3;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 217;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        stackOut_218_0 = stackIn_218_0;
                        stackOut_218_1 = stackIn_218_1;
                        stackOut_218_2 = stackIn_218_2;
                        stackOut_218_3 = 20;
                        stackIn_219_0 = stackOut_218_0;
                        stackIn_219_1 = stackOut_218_1;
                        stackIn_219_2 = stackOut_218_2;
                        stackIn_219_3 = stackOut_218_3;
                        statePc = 219;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (stackIn_219_0 < (double)(stackIn_219_1 + (stackIn_219_2 - -stackIn_219_3))) {
                            statePc = 222;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        ((dl) this).field_q = (int)(12.0 * Math.random());
                        statePc = 223;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        if (-1 != (((dl) this).field_r ^ -1)) {
                            statePc = 233;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        stackOut_224_0 = this;
                        stackIn_225_0 = stackOut_224_0;
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        if ((((dl) this).field_v ^ -1) != 0) {
                            statePc = 233;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 228;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        ((dl) this).field_j = -1;
                        ((dl) this).field_b = 3;
                        ((dl) this).field_v = 0;
                        statePc = 229;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 229: {
                    try {
                        statePc = 233;
                        continue stateLoop;
                    } catch (Throwable stateCaught_229) {
                        caughtException = stateCaught_229;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 230: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_230) {
                        caughtException = stateCaught_230;
                        statePc = 232;
                        continue stateLoop;
                    }
                }
                case 232: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw qk.a((Throwable) (Object) var2, "dl.B(" + param0 + 41);
                }
                case 233: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    dl(int param0, int param1, int param2, dk param3) {
        RuntimeException runtimeException = null;
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
        int statePc = 1;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 1: {
                    try {
                        ((dl) this).field_B = false;
                        ((dl) this).field_m = -1;
                        ((dl) this).field_x = 1;
                        ((dl) this).field_k = -1;
                        ((dl) this).field_r = param2;
                        ((dl) this).field_z = false;
                        ((dl) this).field_u = false;
                        ((dl) this).field_l = param2 * 100;
                        ((dl) this).field_A = param0;
                        ((dl) this).field_j = -1;
                        ((dl) this).field_v = -1;
                        ((dl) this).field_h = null;
                        ((dl) this).field_c = null;
                        ((dl) this).field_g = -1;
                        ((dl) this).field_C = null;
                        ((dl) this).field_n = param1;
                        ((dl) this).field_b = -1;
                        ((dl) this).field_i = 0;
                        ((dl) this).field_e = 0;
                        ((dl) this).field_s = param3;
                        ((dl) this).field_a = false;
                        if (-1 != (((dl) this).field_r ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((dl) this).field_b = 0;
                        ((dl) this).field_v = 0;
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
                        stackOut_5_1 = new StringBuilder().append("dl.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_8_1 = stackOut_5_1;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        if (param3 == null) {
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
                    throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
                }
                case 10: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Base Score:";
        field_f = new int[8192];
    }
}
