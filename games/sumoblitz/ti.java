/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti implements Runnable {
    static hr field_b;
    private ro field_d;
    private Thread field_a;
    int field_e;
    private boolean field_c;

    final ql a(wl param0, int param1, int param2) {
        ql var4 = null;
        int var5 = 0;
        Object var6 = null;
        ql var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        ql stackIn_8_0 = null;
        ql stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Sumoblitz.field_L ? 1 : 0;
                    var4 = new ql();
                    var5 = 29 % ((param1 - -44) / 48);
                    var4.field_y = 1;
                    var6 = (Object) (Object) ((ti) this).field_d;
                    // monitorenter ((ti) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = (ql) (Object) ((ti) this).field_d.a(110);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var7 == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((long)param2 ^ -1L) != (var7.field_l ^ -1L)) {
                            statePc = 9;
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
                        if (var7.field_w != param0) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (-3 == (var7.field_y ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4.field_u = false;
                        var4.field_x = var7.field_x;
                        // monitorexit var6
                        stackOut_7_0 = (ql) var4;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var7 = (ql) (Object) ((ti) this).field_d.d(-2);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var6
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
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var8;
                }
                case 14: {
                    var4.field_x = param0.a(101, param2);
                    var4.field_t = true;
                    var4.field_u = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        ((ti) this).field_c = true;
        Object var2_ref_Object = (Object) (Object) ((ti) this).field_d;
        // monitorenter ((ti) this).field_d
        ((Object) (Object) ((ti) this).field_d).notifyAll();
        // monitorexit var2_ref_Object
        try {
            if (false) throw (InterruptedException) null;
            ((ti) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ti) this).field_a = null;
        int var2 = -15 / ((49 - param0) / 40);
    }

    final static String a(boolean param0, CharSequence param1) {
        if (param0) {
            ti.a(27);
            return qc.a(param1, 38, false);
        }
        return qc.a(param1, 38, false);
    }

    public static void a(int param0) {
        int var1 = 40 % ((-17 - param0) / 45);
        field_b = null;
    }

    private final void a(ql param0, boolean param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((ti) this).field_d;
                    // monitorenter ((ti) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ti) this).field_d.a((pj) (Object) param0, (byte) -120);
                        ((ti) this).field_e = ((ti) this).field_e + 1;
                        ((Object) (Object) ((ti) this).field_d).notifyAll();
                        // monitorexit var3
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
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var4;
                }
                case 5: {
                    if (!param1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    var5 = null;
                    ql discarded$2 = ((ti) this).a((wl) null, 93, 98);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ql a(int param0, byte[] param1, int param2, wl param3) {
        ql var5 = new ql();
        var5.field_l = (long)param0;
        var5.field_w = param3;
        var5.field_x = param1;
        var5.field_t = false;
        var5.field_y = param2;
        this.a(var5, true);
        return var5;
    }

    final ql a(int param0, int param1, wl param2) {
        ql var4 = new ql();
        var4.field_y = 3;
        var4.field_l = (long)param0;
        int var5 = 119 % ((56 - param1) / 55);
        var4.field_t = false;
        var4.field_w = param2;
        this.a(var4, true);
        return var4;
    }

    ti(wi param0) {
        ((ti) this).field_d = new ro();
        ((ti) this).field_c = false;
        ((ti) this).field_e = 0;
        jr var2 = param0.a(true, (Runnable) this, 5);
        while (0 == var2.field_c) {
            tg.a(10L, (byte) 119);
        }
        if (var2.field_c == 2) {
            throw new RuntimeException();
        }
        ((ti) this).field_a = (Thread) var2.field_d;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ql var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Sumoblitz.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((ti) this).field_c) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((ti) this).field_d;
                        // monitorenter ((ti) this).field_d
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (ql) (Object) ((ti) this).field_d.b((byte) 72);
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
                            ((ti) this).field_e = ((ti) this).field_e - 1;
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
                            ((Object) (Object) ((ti) this).field_d).wait();
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
                            if ((var7.field_y ^ -1) == -3) {
                                statePc = 18;
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
                            if ((var7.field_y ^ -1) == -4) {
                                statePc = 17;
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
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_x = var7.field_w.a(85, (int)var7.field_l);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            boolean discarded$1 = var7.field_w.a(var7.field_x, (int)var7.field_l, var7.field_x.length, 0);
                            var7.field_u = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        ms.a((String) null, (Throwable) (Object) var2_ref, 0);
                        var7.field_u = false;
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

    static {
    }
}
