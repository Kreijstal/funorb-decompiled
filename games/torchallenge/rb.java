/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb implements Runnable {
    static int field_b;
    private ii field_a;
    static int[] field_c;
    int field_e;
    private boolean field_f;
    private Thread field_d;

    final void a(int param0) {
        ((rb) this).field_f = true;
        Object var2 = (Object) (Object) ((rb) this).field_a;
        // monitorenter ((rb) this).field_a
        if (param0 != 4) {
            ((rb) this).field_d = null;
        }
        ((Object) (Object) ((rb) this).field_a).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((rb) this).field_d.join();
        } catch (InterruptedException interruptedException) {
        }
        ((rb) this).field_d = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (oe.field_f > param1) {
            oe.field_f = param1;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -49) {
          return;
        } else {
          L1: {
            oe.field_f = oe.field_f - 1;
            if (0 <= oe.field_f) {
              break L1;
            } else {
              h.a(param2, 4);
              oe.field_f = param1;
              break L1;
            }
          }
          return;
        }
    }

    final al a(la param0, boolean param1, int param2) {
        al var4 = null;
        Object var5 = null;
        al var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        al stackIn_7_0 = null;
        al stackIn_14_0 = null;
        al stackIn_15_0 = null;
        al stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        al stackOut_6_0 = null;
        al stackOut_13_0 = null;
        al stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        al stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TorChallenge.field_F ? 1 : 0;
                    var4 = new al();
                    var4.field_C = 1;
                    var5 = (Object) (Object) ((rb) this).field_a;
                    // monitorenter ((rb) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (al) (Object) ((rb) this).field_a.a(25777);
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
                        if (((long)param2 ^ -1L) != (var6.field_l ^ -1L)) {
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
                        if (var6.field_D != param0) {
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
                        if (var6.field_C != 2) {
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
                        var4.field_v = false;
                        var4.field_y = var6.field_y;
                        // monitorexit var5
                        stackOut_6_0 = (al) var4;
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
                        var6 = (al) (Object) ((rb) this).field_a.d(84);
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
                    var4.field_y = param0.a(param2, -110);
                    var4.field_v = false;
                    stackOut_13_0 = (al) var4;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (!param1) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = (al) (Object) stackIn_14_0;
                    stackOut_14_1 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (al) (Object) stackIn_15_0;
                    stackOut_15_1 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_16_0.field_s = stackIn_16_1 != 0;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(int param0, al param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 1) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var5 = null;
                    al discarded$3 = ((rb) this).a((la) null, true, 40);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (Object) (Object) ((rb) this).field_a;
                    // monitorenter ((rb) this).field_a
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((rb) this).field_a.a((w) (Object) param1, 3329);
                        ((rb) this).field_e = ((rb) this).field_e + 1;
                        ((Object) (Object) ((rb) this).field_a).notifyAll();
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

    public static void b(int param0) {
        int var1 = -33 / ((param0 - 64) / 41);
        field_c = null;
    }

    final al a(int param0, int param1, la param2) {
        al var4 = new al();
        var4.field_l = (long)param0;
        var4.field_D = param2;
        var4.field_C = param1;
        var4.field_s = false;
        this.a(1, var4);
        return var4;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            al var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((rb) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((rb) this).field_a;
                        // monitorenter ((rb) this).field_a
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (al) (Object) ((rb) this).field_a.c(-1);
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
                            ((rb) this).field_e = ((rb) this).field_e - 1;
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
                            ((Object) (Object) ((rb) this).field_a).wait();
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
                            if (var7.field_C == 2) {
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
                            if ((var7.field_C ^ -1) == -4) {
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
                            var7.field_v = false;
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
                            var7.field_y = var7.field_D.a((int)var7.field_l, -2);
                            var7.field_v = false;
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
                            boolean discarded$1 = var7.field_D.a((int)var7.field_l, var7.field_y, var7.field_y.length, (byte) 121);
                            var7.field_v = false;
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
                        td.a((String) null, (Throwable) (Object) var2_ref, (byte) -87);
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

    final static ge a(lj param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        if (param2 >= -110) {
          field_c = null;
          var4 = param0.a(param1, 50);
          var5 = param0.a(var4, param3, (byte) 86);
          return w.a((byte) 61, var4, var5, param0);
        } else {
          var4 = param0.a(param1, 50);
          var5 = param0.a(var4, param3, (byte) 86);
          return w.a((byte) 61, var4, var5, param0);
        }
    }

    final al a(int param0, la param1, byte param2, byte[] param3) {
        al var5 = null;
        var5 = new al();
        var5.field_s = false;
        var5.field_D = param1;
        var5.field_l = (long)param0;
        var5.field_y = param3;
        var5.field_C = 2;
        this.a(param2 ^ 110, var5);
        if (param2 != 111) {
          ((rb) this).field_e = -105;
          return var5;
        } else {
          return var5;
        }
    }

    rb(uj param0) {
        ((rb) this).field_a = new ii();
        ((rb) this).field_e = 0;
        ((rb) this).field_f = false;
        mi var2 = param0.a((Runnable) this, true, 5);
        while (-1 == (var2.field_d ^ -1)) {
            c.a(-105, 10L);
        }
        if (var2.field_d == 2) {
            throw new RuntimeException();
        }
        ((rb) this).field_d = (Thread) var2.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_c = new int[]{0, 0, 1, 1, 1, 2, 3, 3, 3, 3, 4, 5, 5, 5};
    }
}
