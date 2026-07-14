/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements Runnable {
    static md field_i;
    private up field_h;
    static int field_d;
    static String[] field_e;
    private Thread field_g;
    static boolean field_c;
    int field_f;
    private boolean field_b;
    static String field_a;

    final co a(ln param0, int param1, int param2, byte[] param3) {
        co var5 = new co();
        var5.field_K = param0;
        var5.field_o = (long)param2;
        var5.field_L = 2;
        var5.field_D = param3;
        var5.field_B = false;
        if (param1 != 15958) {
            return null;
        }
        this.a((byte) 48, var5);
        return var5;
    }

    final co a(byte param0, ln param1, int param2) {
        co var4 = new co();
        var4.field_o = (long)param2;
        var4.field_B = false;
        var4.field_L = 3;
        if (param0 >= -27) {
            return null;
        }
        var4.field_K = param1;
        this.a((byte) 21, var4);
        return var4;
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param2 != 10854) {
            return null;
        }
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    public static void b(int param0) {
        if (param0 > -76) {
            return;
        }
        field_a = null;
        field_e = null;
        field_i = null;
    }

    private final void a(byte param0, co param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((cc) this).field_h;
                    // monitorenter ((cc) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((cc) this).field_h.a((ll) (Object) param1, -32711);
                        ((cc) this).field_f = ((cc) this).field_f + 1;
                        ((Object) (Object) ((cc) this).field_h).notifyAll();
                        if (param0 > 1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_e = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((cc) this).field_b = true;
                    var2 = (Object) (Object) ((cc) this).field_h;
                    // monitorenter ((cc) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((Object) (Object) ((cc) this).field_h).notifyAll();
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    try {
                        ((cc) this).field_g.join();
                        if (param0 < -49) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        field_i = null;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    ((cc) this).field_g = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 > -32) {
            int discarded$0 = cc.a(21, 83, (byte) -84);
        }
        int var3 = param1 >> 867839039 & param0 - 1;
        return ((param1 >>> 1873545247) + param1) % param0 - -var3;
    }

    final co a(ln param0, int param1, int param2) {
        co var4 = null;
        Object var5 = null;
        co var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
        co stackIn_10_0 = null;
        co stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DungeonAssault.field_K;
                    var4 = new co();
                    var4.field_L = 1;
                    if (param2 == -6319) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    this.a((byte) 29, (co) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((cc) this).field_h;
                    // monitorenter ((cc) this).field_h
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (co) (Object) ((cc) this).field_h.c(13395);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((long)param1 != var6.field_o) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 != var6.field_K) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var6.field_L ^ -1) == -3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.field_v = false;
                        var4.field_D = var6.field_D;
                        // monitorexit var5
                        stackOut_9_0 = (co) var4;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (co) (Object) ((cc) this).field_h.a((byte) 72);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var5
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var7;
                }
                case 16: {
                    var4.field_D = param0.a(param1, 44);
                    var4.field_B = true;
                    var4.field_v = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            co var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((cc) this).field_b) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((cc) this).field_h;
                        // monitorenter ((cc) this).field_h
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (co) (Object) ((cc) this).field_h.a(120);
                            if (var7 == null) {
                                statePc = 5;
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
                            ((cc) this).field_f = ((cc) this).field_f - 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((cc) this).field_h).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (var7.field_L == -3) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-4 != var7.field_L) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_D = var7.field_K.a((int)var7.field_o, 112);
                            var7.field_v = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            boolean discarded$1 = var7.field_K.a(var7.field_D, (int)var7.field_o, var7.field_D.length, -29447);
                            var7.field_v = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        sm.a((Throwable) (Object) var2_ref, 1, (String) null);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_v = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 21: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    cc(qg param0) {
        ((cc) this).field_h = new up();
        ((cc) this).field_f = 0;
        ((cc) this).field_b = false;
        pn var2 = param0.a(-21432, 5, (Runnable) this);
        while (var2.field_c == 0) {
            pj.a(0, 10L);
        }
        if ((var2.field_c ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((cc) this).field_g = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_i = new md();
        field_c = false;
        field_a = "Banshee";
    }
}
