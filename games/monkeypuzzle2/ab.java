/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ab extends ka {
    static int field_d;
    private java.nio.ByteBuffer field_c;
    static int field_e;

    final static void e(int param0) {
        if (param0 != -18753) {
            field_d = 4;
        }
    }

    final byte[] d(int param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_c.capacity()];
        var2 = var3;
        this.field_c.position(0);
        this.field_c.get(var3);
        if (param0 != -13913) {
          return (byte[]) null;
        } else {
          return var3;
        }
    }

    ab() {
    }

    final static te a(byte param0, int param1) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        te[] var6 = ee.j(44);
        te[] var2 = var6;
        int var3 = 0;
        int var4 = 105 / ((-2 - param0) / 61);
        do {
            if (var6.length <= var3) {
                return null;
            }
            if (!(param1 != var6[var3].field_c)) {
                return var6[var3];
            }
            var3++;
        } while (var5 == 0);
        return null;
    }

    final static void a(int param0, int param1, le[] param2, int param3, int param4, byte param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var11 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (param0 > 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        var6_int = param2[0].field_m;
                        var7 = param2[2].field_m;
                        var8 = param2[1].field_m;
                        param2[0].a(param4, param3, param1);
                        param2[2].a(-var7 + (param0 + param4), param3, param1);
                        ge.b(si.field_u);
                        ge.c(var6_int + param4, param3, param4 - -param0 - var7, param2[1].field_n + param3);
                        var9 = param4 + var6_int;
                        var10 = -var7 + param0 + param4;
                        if (param5 > 24) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_d = -36;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        param4 = var9;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param4 >= var10) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param2[1].a(param4, param3, param1);
                        param4 = param4 + var8;
                        if (var11 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var11 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
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
                        ge.a(si.field_u);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var6 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var6);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ab.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, byte[] param1) {
        try {
            this.field_c = java.nio.ByteBuffer.allocateDirect(param1.length);
            this.field_c.position(0);
            int var3_int = 117 / ((11 - param0) / 42);
            this.field_c.put(param1);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ab.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = 0;
    }
}
