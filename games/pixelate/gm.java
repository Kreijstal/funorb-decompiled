/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm implements Runnable {
    private nj field_b;
    static el field_f;
    static ak field_a;
    private Thread field_d;
    private boolean field_e;
    int field_c;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            cg var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Pixelate.field_H ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((gm) this).field_e) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((gm) this).field_b;
                        // monitorenter ((gm) this).field_b
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (cg) (Object) ((gm) this).field_b.a((byte) 80);
                            if (var7 != null) {
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
                            ((Object) (Object) ((gm) this).field_b).wait();
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
                            ((gm) this).field_c = ((gm) this).field_c - 1;
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
                            if (2 != var7.field_C) {
                                statePc = 16;
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
                            boolean discarded$1 = var7.field_G.a(var7.field_D.length, var7.field_D, false, (int)var7.field_q);
                            var7.field_v = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var7.field_C ^ -1) != -4) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_D = var7.field_G.a(111, (int)var7.field_q);
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
                        jo.a(1, (String) null, (Throwable) (Object) var2_ref);
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

    final void a(byte param0) {
        int var2 = 0;
        var2 = 62 % ((param0 - 18) / 56);
        ((gm) this).field_e = true;
        Object var3 = (Object) (Object) ((gm) this).field_b;
        // monitorenter ((gm) this).field_b
        ((Object) (Object) ((gm) this).field_b).notifyAll();
        // monitorexit var3
        try {
            if (false) throw (InterruptedException) null;
            ((gm) this).field_d.join();
        } catch (InterruptedException interruptedException) {
        }
        ((gm) this).field_d = null;
    }

    private final void a(byte param0, cg param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((gm) this).field_b;
                    // monitorenter ((gm) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 63) {
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
                        ((gm) this).run();
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
                        ((gm) this).field_b.a(-115, (lm) (Object) param1);
                        ((gm) this).field_c = ((gm) this).field_c + 1;
                        ((Object) (Object) ((gm) this).field_b).notifyAll();
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

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final cg a(int param0, rn param1, int param2) {
        cg var4 = null;
        Object var5 = null;
        cg var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cg stackIn_7_0 = null;
        cg stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Pixelate.field_H ? 1 : 0;
                    var4 = new cg();
                    var4.field_C = 1;
                    var5 = (Object) (Object) ((gm) this).field_b;
                    // monitorenter ((gm) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (cg) (Object) ((gm) this).field_b.c(72);
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
                        if (var6 == null) {
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
                        if ((var6.field_q ^ -1L) != ((long)param0 ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param1 != var6.field_G) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (2 != var6.field_C) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4.field_D = var6.field_D;
                        var4.field_v = false;
                        // monitorexit var5
                        stackOut_6_0 = (cg) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (cg) (Object) ((gm) this).field_b.a(65151);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    if (param2 < 53) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    var4.field_D = param1.a(126, param0);
                    var4.field_t = true;
                    var4.field_v = false;
                    return var4;
                }
                case 15: {
                    field_f = null;
                    var4.field_D = param1.a(126, param0);
                    var4.field_t = true;
                    var4.field_v = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final cg a(int param0, int param1, rn param2) {
        cg var4 = new cg();
        var4.field_q = (long)param0;
        var4.field_G = param2;
        var4.field_t = false;
        var4.field_C = param1;
        this.a((byte) 72, var4);
        return var4;
    }

    final cg a(int param0, int param1, rn param2, byte[] param3) {
        cg var5 = null;
        var5 = new cg();
        var5.field_C = 2;
        if (param1 < 38) {
          ((gm) this).field_d = null;
          var5.field_G = param2;
          var5.field_D = param3;
          var5.field_t = false;
          var5.field_q = (long)param0;
          this.a((byte) 90, var5);
          return var5;
        } else {
          var5.field_G = param2;
          var5.field_D = param3;
          var5.field_t = false;
          var5.field_q = (long)param0;
          this.a((byte) 90, var5);
          return var5;
        }
    }

    gm(cb param0) {
        ((gm) this).field_b = new nj();
        ((gm) this).field_c = 0;
        ((gm) this).field_e = false;
        ei var2 = param0.a(5, (Runnable) this, (byte) -123);
        while (-1 == (var2.field_b ^ -1)) {
            vg.a(10L, (byte) 23);
        }
        if (2 == var2.field_b) {
            throw new RuntimeException();
        }
        ((gm) this).field_d = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new el();
    }
}
