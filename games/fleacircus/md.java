/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends bb {
    static String[] field_P;
    int field_K;
    int field_N;
    static int field_L;
    int field_R;
    int field_Q;
    static boolean field_T;
    static String field_M;
    int field_O;
    int field_U;
    static boolean field_S;

    final boolean a(int param0, boolean param1, int param2, qa param3, int param4, int param5, int param6) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var12 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        return false;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8_int = -param6 - this.field_y + (-this.field_U + param4);
                        var9 = -this.field_R - this.field_z - param0 + param2;
                        if (this.field_O * this.field_O > var8_int * var8_int + var9 * var9) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return true;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var10 = Math.atan2((double)var9, (double)var8_int) - ik.field_G;
                        if (0.0 <= var10) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var10 = var10 - 3.141592653589793 / (double)this.field_N;
                        if (var12 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var10 <= 0.0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var10 = var10 + 3.141592653589793 / (double)this.field_N;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        this.field_Q = (int)((double)this.field_N * var10 / 6.283185307179586);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (this.field_N > this.field_Q) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.field_Q = this.field_Q - this.field_N;
                        if (var12 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var12 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 >= (this.field_Q ^ -1)) {
                            statePc = 16;
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
                        this.field_Q = this.field_Q + this.field_N;
                        if (var12 == 0) {
                            statePc = 14;
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
                        stackIn_17_0 = 1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    var8 = (RuntimeException) ((Object) caughtException);
                    stackIn_20_0 = (RuntimeException) (var8);
                    stackIn_19_0 = stackIn_20_0;
                    stackIn_20_1 = new StringBuilder().append("md.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_19_1 = stackIn_20_1;
                    if (param3 == null) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_19_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_19_1);
                    stackIn_21_2 = "{...}";
                    statePc = 21;
                    continue stateLoop;
                }
                case 20: {
                    stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
                    stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
                    stackIn_21_2 = "null";
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    throw pf.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void i(int param0) {
        j.field_o = null;
        d.field_L = false;
        int var1 = 28 / ((79 - param0) / 39);
        uk.field_a = null;
        oe.field_c = null;
        rc.field_g = null;
    }

    public static void a(byte param0) {
        field_M = null;
        field_P = null;
        if (param0 == -101) {
            return;
        }
        field_L = -125;
    }

    private md() throws Throwable {
        throw new Error();
    }

    static {
        field_P = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_L = 1;
        field_M = "Members";
    }
}
