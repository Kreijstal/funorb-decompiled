/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements Runnable {
    static java.awt.Color field_e;
    private hl field_d;
    private Thread field_c;
    int field_a;
    private boolean field_b;

    public static void b(int param0) {
        field_e = null;
        if (param0 == 3) {
            return;
        }
        field_e = null;
    }

    final md a(int param0, int param1, bi param2, byte[] param3) {
        md var5 = null;
        Object var6 = null;
        var5 = new md();
        var5.field_u = param3;
        var5.field_l = (long)param1;
        if (param0 < 45) {
          var6 = null;
          md discarded$2 = ((ae) this).a(113, 43, (bi) null, (byte[]) null);
          var5.field_w = 2;
          var5.field_r = false;
          var5.field_x = param2;
          this.a((byte) -87, var5);
          return var5;
        } else {
          var5.field_w = 2;
          var5.field_r = false;
          var5.field_x = param2;
          this.a((byte) -87, var5);
          return var5;
        }
    }

    final md a(bi param0, int param1, int param2) {
        md var4 = null;
        Object var5 = null;
        md var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        md stackIn_9_0 = null;
        Object stackOut_2_0 = null;
        md stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SolKnight.field_L ? 1 : 0;
                    var4 = new md();
                    var4.field_w = 1;
                    var5 = (Object) (Object) ((ae) this).field_d;
                    // monitorenter ((ae) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (md) (Object) ((ae) this).field_d.d(125);
                        if (param2 <= -100) {
                            statePc = 4;
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
                        // monitorexit var5
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (md) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 11;
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
                        if (((long)param1 ^ -1L) != (var6.field_l ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param0 != var6.field_x) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3 != (var6.field_w ^ -1)) {
                            statePc = 10;
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
                        var4.field_u = var6.field_u;
                        var4.field_m = false;
                        // monitorexit var5
                        stackOut_8_0 = (md) var4;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        var6 = (md) (Object) ((ae) this).field_d.b(-1);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var7;
                }
                case 15: {
                    var4.field_u = param0.a(-925871512, param1);
                    var4.field_r = true;
                    var4.field_m = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        Object var4 = null;
        if (param0 != 5) {
            var4 = null;
            this.a((byte) -127, (md) null);
        }
        ((ae) this).field_b = true;
        Object var2 = (Object) (Object) ((ae) this).field_d;
        // monitorenter ((ae) this).field_d
        ((Object) (Object) ((ae) this).field_d).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((ae) this).field_c.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ae) this).field_c = null;
    }

    private final void a(byte param0, md param1) {
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3_ref = (Object) (Object) ((ae) this).field_d;
                    // monitorenter ((ae) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ae) this).field_d.a((ec) (Object) param1, 0);
                        if (param0 < -79) {
                            statePc = 4;
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
                        // monitorexit var3_ref
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ((ae) this).field_a = ((ae) this).field_a + 1;
                        ((Object) (Object) ((ae) this).field_d).notifyAll();
                        // monitorexit var3_ref
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var4;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final md a(int param0, bi param1, int param2) {
        md var4 = null;
        var4 = new md();
        if (param0 > -56) {
          ((ae) this).run();
          var4.field_w = 3;
          var4.field_x = param1;
          var4.field_r = false;
          var4.field_l = (long)param2;
          this.a((byte) -94, var4);
          return var4;
        } else {
          var4.field_w = 3;
          var4.field_x = param1;
          var4.field_r = false;
          var4.field_l = (long)param2;
          this.a((byte) -94, var4);
          return var4;
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
            md var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = SolKnight.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (!((ae) this).field_b) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        var2 = (Object) (Object) ((ae) this).field_d;
                        // monitorenter ((ae) this).field_d
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            var7 = (md) (Object) ((ae) this).field_d.c(0);
                            if (var7 == null) {
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
                            ((ae) this).field_a = ((ae) this).field_a - 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((Object) (Object) ((ae) this).field_d).wait();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof InterruptedException ? 8 : 13);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 15: {
                        try {
                            if (-3 == (var7.field_w ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (3 == var7.field_w) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_m = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var7.field_u = var7.field_x.a(-925871512, (int)var7.field_l);
                            var7.field_m = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            boolean discarded$1 = var7.field_x.a((byte) -46, (int)var7.field_l, var7.field_u, var7.field_u.length);
                            var7.field_m = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        hi.a((Throwable) (Object) var2_ref, (String) null, 1);
                        var7.field_m = false;
                        statePc = 1;
                        continue stateLoop;
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

    final static void a(int param0, da param1) {
        sl var2 = null;
        if (param0 != 26197) {
          field_e = null;
          sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
          var2 = sl.a(param1, "jagex logo2.packvorbis", "");
          sh discarded$4 = var2.c();
          return;
        } else {
          sl.b(param1.a(param0 ^ 26193, "headers.packvorbis", ""));
          var2 = sl.a(param1, "jagex logo2.packvorbis", "");
          sh discarded$5 = var2.c();
          return;
        }
    }

    ae(dl param0) {
        ((ae) this).field_d = new hl();
        ((ae) this).field_b = false;
        ((ae) this).field_a = 0;
        nj var2 = param0.a(5, -51, (Runnable) this);
        while (var2.field_c == 0) {
            i.a((byte) 90, 10L);
        }
        if (2 == var2.field_c) {
            throw new RuntimeException();
        }
        ((ae) this).field_c = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new java.awt.Color(10040319);
    }
}
