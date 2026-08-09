/*
 * Decompiled by CFR-JS 0.4.0.
 */
class aa extends e {
    static va field_r;
    static String field_s;
    static boolean field_q;
    static int field_t;

    public final void a(int param0, int param1, boolean param2, qa param3, int param4) {
        try {
            if (param0 >= -36) {
                field_s = (String) null;
            }
            if (!(!param2)) {
                pj.a((byte) 127, param3.field_u, param3.field_z + param4, param3.field_y + param1, param3.field_j);
            }
            super.a(-59, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "aa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    aa(fa param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    aa(int param0) {
        this(ug.field_e, param0);
    }

    final static void c(byte param0) {
        RuntimeException runtimeException = null;
        dd var1 = null;
        dd var2 = null;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -65) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var1 = new dd(540, 140);
                        r.a(var1, 45);
                        bl.b();
                        gb.c();
                        vg.field_z = 0;
                        mj.a(param0 ^ 515966558);
                        var2 = var1.c();
                        var3 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 >= 15) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2.b(-2, -2, 16777215);
                        gb.h(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
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
                        if (var4 == 0) {
                            statePc = 4;
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
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        uc.field_d.f();
                        var1.e(0, 0);
                        ia.a(param0 + -41);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) runtimeException), "aa.L(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 > -118) {
            field_s = (String) null;
            field_r = null;
            field_s = null;
            return;
        }
        field_r = null;
        field_s = null;
    }

    static {
        field_r = null;
        field_t = -1;
    }
}
