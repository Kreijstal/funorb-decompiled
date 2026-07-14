/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh implements Runnable {
    static long field_c;
    private bh field_d;
    static e field_a;
    private Thread field_f;
    private boolean field_b;
    int field_e;

    final rh a(um param0, int param1, int param2) {
        rh var4 = null;
        Object var5 = null;
        rh var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
        rh stackIn_9_0 = null;
        rh stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HostileSpawn.field_I ? 1 : 0;
                    var4 = new rh();
                    var4.field_E = 1;
                    if (param2 == -27337) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    rh discarded$3 = ((dh) this).a((um) null, 57, 116);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((dh) this).field_d;
                    // monitorenter ((dh) this).field_d
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (rh) (Object) ((dh) this).field_d.d((byte) -35);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
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
                        if ((long)param1 != var6.field_h) {
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
                        if (param0 != var6.field_B) {
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
                        if ((var6.field_E ^ -1) != -3) {
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
                        var4.field_v = false;
                        var4.field_y = var6.field_y;
                        // monitorexit var5
                        stackOut_8_0 = (rh) var4;
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
                        var6 = (rh) (Object) ((dh) this).field_d.b((byte) -120);
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
                    var4.field_y = param0.a(param1, param2 ^ 27342);
                    var4.field_v = false;
                    var4.field_w = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        if (param0 != -6) {
          field_c = -21L;
          ei.field_t = false;
          int discarded$4 = sc.field_g.l(32270);
          return;
        } else {
          ei.field_t = false;
          int discarded$5 = sc.field_g.l(32270);
          return;
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 != -3) {
            field_a = null;
        }
    }

    final rh a(um param0, int param1, byte[] param2, int param3) {
        rh var5 = null;
        var5 = new rh();
        var5.field_E = 2;
        var5.field_h = (long)param3;
        var5.field_w = false;
        var5.field_y = param2;
        if (param1 != -4) {
          return null;
        } else {
          var5.field_B = param0;
          this.a(false, var5);
          return var5;
        }
    }

    final void a(int param0) {
        ((dh) this).field_b = true;
        Object var2 = (Object) (Object) ((dh) this).field_d;
        // monitorenter ((dh) this).field_d
        ((Object) (Object) ((dh) this).field_d).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            if (param0 != 3) {
                field_a = null;
            }
            ((dh) this).field_f.join();
        } catch (InterruptedException interruptedException) {
        }
        ((dh) this).field_f = null;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            rh var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = HostileSpawn.field_I ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((dh) this).field_b) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((dh) this).field_d;
                        // monitorenter ((dh) this).field_d
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (rh) (Object) ((dh) this).field_d.a((byte) 27);
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
                            ((dh) this).field_e = ((dh) this).field_e - 1;
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
                            ((Object) (Object) ((dh) this).field_d).wait();
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
                            if (-3 == var7.field_E) {
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
                            if (-4 != var7.field_E) {
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
                            var7.field_y = var7.field_B.a((int)var7.field_h, -123);
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
                            boolean discarded$1 = var7.field_B.a((byte) -24, var7.field_y, var7.field_y.length, (int)var7.field_h);
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
                        ic.a((byte) -118, (String) null, (Throwable) (Object) var2_ref);
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

    final rh a(um param0, byte param1, int param2) {
        rh var4 = null;
        Object var5 = null;
        if (param1 >= -72) {
          var5 = null;
          rh discarded$1 = ((dh) this).a((um) null, -111, (byte[]) null, 81);
          var4 = new rh();
          var4.field_E = 3;
          var4.field_w = false;
          var4.field_B = param0;
          var4.field_h = (long)param2;
          this.a(false, var4);
          return var4;
        } else {
          var4 = new rh();
          var4.field_E = 3;
          var4.field_w = false;
          var4.field_B = param0;
          var4.field_h = (long)param2;
          this.a(false, var4);
          return var4;
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 != 111) {
            return false;
        }
        return null != pb.b(param0, (byte) -120) ? true : false;
    }

    private final void a(boolean param0, rh param1) {
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3_ref = (Object) (Object) ((dh) this).field_d;
                    // monitorenter ((dh) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
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
                        ((dh) this).field_d.a((dk) (Object) param1, 79);
                        ((dh) this).field_e = ((dh) this).field_e + 1;
                        ((Object) (Object) ((dh) this).field_d).notifyAll();
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

    dh(fd param0) {
        ((dh) this).field_d = new bh();
        ((dh) this).field_b = false;
        ((dh) this).field_e = 0;
        kk var2 = param0.a(5, (Runnable) this, 62);
        while (var2.field_f == 0) {
            vj.a(10L, (byte) -49);
        }
        if (2 == var2.field_f) {
            throw new RuntimeException();
        }
        ((dh) this).field_f = (Thread) var2.field_c;
    }

    static {
    }
}
