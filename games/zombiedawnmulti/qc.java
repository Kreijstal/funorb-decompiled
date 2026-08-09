/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends qa {
    static ul field_s;
    boolean field_x;
    boolean field_r;
    static int field_q;
    static cj field_u;
    static int field_v;
    static String field_w;
    volatile boolean field_t;

    final static void a(int param0, byte param1, ja[] param2, int param3, int param4) {
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        g.c();
                        if (0 != param4) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        oo.f(0, 0, 24, 24, 0, 128);
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 == param4) {
                            statePc = 54;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((param4 ^ -1) != -3) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var5_int ^ -1) <= -25) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        oo.b(var5_int, 0, 24, 0, -(5 * var5_int) + 120);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var6 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (3 != param4) {
                            statePc = 19;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5_int >= 24) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        oo.c(0, var5_int, 24, 0, var5_int * 5);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var6 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (-5 != (param4 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (var5_int >= 24) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        oo.c(0, var5_int, 24, 0, -(5 * var5_int) + 120);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var6 == 0) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (-7 != (param4 ^ -1)) {
                            statePc = 33;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (24 <= var5_int) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        oo.c(var5_int + 1, var5_int, 24 + -var5_int, 0, 5 * var5_int);
                        oo.b(var5_int, var5_int, -var5_int + 24, 0, var5_int * 5);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var6 == 0) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-9 != (param4 ^ -1)) {
                            statePc = 40;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (24 <= var5_int) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        oo.c(0, var5_int, var5_int - -1, 0, -(var5_int * 5) + 120);
                        oo.b(var5_int, 0, var5_int, 0, -(5 * var5_int) + 120);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (var6 == 0) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (7 != param4) {
                            statePc = 47;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (-25 >= (var5_int ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        oo.c(0, var5_int, 24 - var5_int, 0, 5 * var5_int);
                        oo.b(var5_int, -var5_int + 24, var5_int, 0, -(5 * var5_int) + 120);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (var6 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (-6 != (param4 ^ -1)) {
                            statePc = 59;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (var5_int >= 24) {
                            statePc = 53;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        oo.c(-var5_int + 24, var5_int, var5_int, 0, -(5 * var5_int) + 120);
                        oo.b(var5_int, 0, 24 - var5_int, 0, var5_int * 5);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (var6 == 0) {
                            statePc = 49;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (var6 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        param2[param3].a();
                        param2[param0].c(0, 0);
                        var5_int = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var5_int >= 24) {
                            statePc = 59;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        oo.b(var5_int, 0, 24, 0, var5_int * 5);
                        var5_int++;
                        if (var6 != 0) {
                            statePc = 60;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var6 == 0) {
                            statePc = 55;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        g.b();
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param1 == -126) {
                            statePc = 67;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        field_q = 122;
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 63: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_65_0 = (RuntimeException) (var5);
                    stackIn_64_0 = stackIn_65_0;
                    stackIn_65_1 = new StringBuilder().append("qc.P(").append(param0).append(',').append(param1).append(',');
                    stackIn_64_1 = stackIn_65_1;
                    if (param2 == null) {
                        statePc = 65;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 64: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_64_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_64_1);
                    stackIn_66_2 = "{...}";
                    statePc = 66;
                    continue stateLoop;
                }
                case 65: {
                    stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
                    stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
                    stackIn_66_2 = "null";
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    throw fa.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 67: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract byte[] e(int param0);

    final static void a(br param0, br param1, int param2) {
        if (param2 != 0) {
            return;
        }
        try {
            if (param0.field_b != null) {
                param0.a(true);
            }
            param0.field_b = param1;
            param0.field_d = param1.field_d;
            param0.field_b.field_d = param0;
            param0.field_d.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "qc.O(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void c(byte param0) {
        field_u = null;
        field_s = null;
        field_w = null;
        if (param0 < 97) {
            qc.c((byte) 22);
        }
    }

    final static String b(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              var3 = new char[var2_int];
              if (param0 == -32) {
                break L1;
              } else {
                field_u = (cj) null;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var2_int <= var4) {
                  break L3;
                } else {
                  var3[-var4 + -1 + var2_int] = param1.charAt(var4);
                  var4++;
                  if (var5 == 0) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = new String(var3);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("qc.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    abstract int f(int param0);

    qc() {
        this.field_t = true;
    }

    static {
        field_w = "Hungry";
    }
}
