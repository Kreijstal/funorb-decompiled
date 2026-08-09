/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef implements Runnable {
    volatile boolean field_a;
    volatile qh[] field_f;
    static tf field_e;
    fe field_b;
    volatile boolean field_d;
    static String field_c;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 >= -99) {
            ef.a(-74);
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        qh var2 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        Throwable var3 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    this.field_d = true;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (this.field_a) {
                            statePc = 12;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = ((Object) stateCaught_1 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = ((Object) stateCaught_2 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var1_int = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = ((Object) stateCaught_3 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var1_int ^ -1) <= -3) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = ((Object) stateCaught_4 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = this.field_f[var1_int];
                        if (var4 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = ((Object) stateCaught_5 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var2 != null) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = ((Object) stateCaught_6 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = ((Object) stateCaught_7 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var2.a();
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = ((Object) stateCaught_8 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var1_int++;
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = ((Object) stateCaught_9 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pg.a(10L, -108);
                        var5 = (Object) null;
                        db.a(this.field_b, (Object) null, -125);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = ((Object) stateCaught_10 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var4 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = ((Object) stateCaught_11 instanceof Exception ? 13 : 15);
                        continue stateLoop;
                    }
                }
                case 12: {
                    this.field_d = false;
                    statePc = 17;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        exception = (Exception) ((Object) caughtException);
                        var6 = (String) null;
                        d.a((Throwable) ((Object) exception), -14, (String) null);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    this.field_d = false;
                    return;
                }
                case 15: {
                    try {
                        var3 = caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 16: {
                    this.field_d = false;
                    throw ef.<RuntimeException>$cfr$sneakyThrow(var3);
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ef() {
        this.field_f = new qh[2];
        this.field_a = false;
        this.field_d = false;
    }

    static {
        field_e = new tf(6, 0, 4, 2);
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
