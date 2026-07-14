/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t implements Runnable {
    static ar field_m;
    private ak field_e;
    static int field_b;
    static String field_n;
    static int field_a;
    static String field_i;
    static int field_l;
    static String field_k;
    static int field_g;
    private Thread field_h;
    static int field_c;
    int field_d;
    private boolean field_j;
    static int field_f;

    private final void a(nq param0, int param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var3 = (Object) (Object) ((t) this).field_e;
                        // monitorenter ((t) this).field_e
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((t) this).field_e.a(false, (gp) (Object) param0);
                        ((t) this).field_d = ((t) this).field_d + 1;
                        ((Object) (Object) ((t) this).field_e).notifyAll();
                        // monitorexit var3
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
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
                    try {
                        throw (RuntimeException) (Object) var4;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 == 0) {
                            statePc = 16;
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
                        t.a(false);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) runtimeException;
                        stackOut_11_1 = new StringBuilder().append("t.G(");
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param0 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (!param0) {
                break L0;
              } else {
                t.a((fp) null, 44, 108, (r) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_n = null;
          field_m = null;
          field_i = null;
          field_k = null;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            RuntimeException runtimeException = null;
            nq var1 = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object stackIn_6_0 = null;
            Object stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Vertigo2.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((t) this).field_j) {
                                statePc = 34;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2 = (Object) (Object) ((t) this).field_e;
                            // monitorenter ((t) this).field_e
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var1 = (nq) (Object) ((t) this).field_e.a(-112);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var5 != 0) {
                                statePc = 34;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof InterruptedException ? 8 : 17);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = null;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 8 : 17);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (stackIn_6_0 != (Object) (Object) var1) {
                                statePc = 15;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof InterruptedException ? 8 : (stateCaught_6 instanceof RuntimeException ? 11 : 17));
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof RuntimeException ? 11 : 17);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof RuntimeException ? 11 : 17);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((Object) (Object) ((t) this).field_e).wait();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 12 : (stateCaught_9 instanceof RuntimeException ? 11 : 17));
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof RuntimeException ? 11 : 17);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var5 == 0) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((t) this).field_d = ((t) this).field_d - 1;
                            // monitorexit var2
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) var4;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var1.field_B ^ -1) == -3) {
                                statePc = 26;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof Exception ? 30 : (stateCaught_19 instanceof InterruptedException ? 22 : 33));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (3 == var1.field_B) {
                                statePc = 25;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof InterruptedException ? 24 : (stateCaught_20 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof InterruptedException ? 24 : (stateCaught_21 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof InterruptedException ? 24 : (stateCaught_22 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof InterruptedException ? 24 : (stateCaught_23 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1.field_L = var1.field_F.a((int)var1.field_n, 27176);
                            if (var5 == 0) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof InterruptedException ? 28 : (stateCaught_25 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            boolean discarded$1 = var1.field_F.a(var1.field_L.length, (int)var1.field_n, var1.field_L, (byte) -84);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof InterruptedException ? 28 : (stateCaught_26 instanceof Exception ? 30 : 33));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof Exception ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof Exception ? 30 : 33);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var2_ref = (Exception) (Object) caughtException;
                            ke.a((Throwable) (Object) var2_ref, (String) null, 0);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var1.field_z = false;
                            if (var5 == 0) {
                                statePc = 1;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        throw wn.a((Throwable) (Object) runtimeException, "t.run()");
                    }
                    case 34: {
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

    final void a(int param0) {
        InterruptedException interruptedException = null;
        RuntimeException runtimeException = null;
        Object var2 = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((t) this).field_j = true;
                        var2 = (Object) (Object) ((t) this).field_e;
                        // monitorenter ((t) this).field_e
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((Object) (Object) ((t) this).field_e).notifyAll();
                        // monitorexit var2
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
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
                    try {
                        throw (RuntimeException) (Object) var3;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param0 <= -8) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof InterruptedException ? 8 : 14);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        t.a((fp) null, 6, 3, (r) null);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof InterruptedException ? 8 : 14);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((t) this).field_h.join();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 14);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        interruptedException = (InterruptedException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((t) this).field_h = null;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) runtimeException, "t.H(" + param0 + 41);
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        hq stackIn_13_0 = null;
        be stackIn_21_0 = null;
        boolean stackIn_37_0 = false;
        int stackIn_44_0 = 0;
        hq stackOut_12_0 = null;
        be stackOut_20_0 = null;
        boolean stackOut_36_0 = false;
        int stackOut_43_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!sp.field_V) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (!vj.field_h) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        if (null != hj.field_e) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hj.field_e = hm.a(4, true);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null != bs.field_Xb) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        bs.field_Xb = ol.a(106, 5, 0, 1);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (hj.field_e == null) {
                            statePc = 19;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = hj.field_e;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0.field_o) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        jq.field_e = jq.field_e & (hj.field_e.field_p ^ -1);
                        ml.field_z = ml.field_z | hj.field_e.field_p;
                        sp.field_V = true;
                        hj.field_e = null;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (bs.field_Xb == null) {
                            statePc = 31;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = bs.field_Xb;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (stackIn_21_0.field_p) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var1_int = -1 + bs.field_Xb.field_o[0];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        vj.field_h = true;
                        bs.field_Xb = null;
                        if ((field_l ^ -1) > (var1_int ^ -1)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        field_l = var1_int;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (param0 == 44) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (!sp.field_V) {
                            statePc = 52;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        stackOut_36_0 = vj.field_h;
                        stackIn_37_0 = stackOut_36_0;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (!stackIn_37_0) {
                            statePc = 52;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        le.a(468713154);
                        jn.a(param0 ^ 41);
                        if (lc.field_b != 9) {
                            statePc = 52;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackOut_43_0 = jq.field_e;
                        stackIn_44_0 = stackOut_43_0;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (stackIn_44_0 != 0) {
                            statePc = 52;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        lc.field_b = 5;
                        gj.a((byte) -123, false, am.field_n, 5);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw wn.a((Throwable) (Object) var1, "t.A(" + param0 + 41);
                }
                case 52: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(fp param0, int param1, int param2, r param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        sq.field_e = param2 * el.b(true) / 1000;
                        hi.a(param3, 56);
                        jl.a(param3, (byte) -85);
                        ao.a(param1 + -1513236, param3);
                        uc.a((byte) 73);
                        bs.a((byte) -12);
                        if (param1 == 1513239) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_f = 65;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        hm.field_F = -sq.field_e + 0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var4 = (RuntimeException) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        stackOut_7_0 = (RuntimeException) var4;
                        stackOut_7_1 = new StringBuilder().append("t.C(");
                        stackIn_10_0 = stackOut_7_0;
                        stackIn_10_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (param0 == null) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                        stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                        stackOut_8_2 = "{...}";
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_11_2 = stackOut_8_2;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 10: {
                    stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                    stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                    stackOut_10_2 = "null";
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    try {
                        stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                        stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44).append(param2).append(44);
                        stackIn_14_0 = stackOut_11_0;
                        stackIn_14_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param3 == null) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_15_2 = stackOut_12_2;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 14: {
                    stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                    stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                    stackOut_14_2 = "null";
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (param4 >= 26) {
                break L0;
              } else {
                t.a((u[]) null, (int[]) null, (r) null, (r) null, false);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          hq.field_r = param2;
          jm.field_G = param3;
          ml.field_v = param0;
          cd.field_a = param1;
        }
    }

    final nq a(boolean param0, qh param1, int param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nq var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        nq stackIn_5_0 = null;
        long stackIn_6_0 = 0L;
        nq stackIn_10_0 = null;
        nq stackIn_17_0 = null;
        nq stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        nq stackOut_4_0 = null;
        long stackOut_5_0 = 0L;
        nq stackOut_9_0 = null;
        nq stackOut_16_0 = null;
        nq stackOut_23_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Vertigo2.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = new nq();
                        var4.field_B = 1;
                        var5 = (Object) (Object) ((t) this).field_e;
                        // monitorenter ((t) this).field_e
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var6 = (nq) (Object) ((t) this).field_e.b((byte) -50);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6 == null) {
                            statePc = 19;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (nq) var6;
                        stackIn_24_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (var8 != 0) {
                            statePc = 24;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof RuntimeException ? 8 : 21);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = stackIn_5_0.field_n;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof RuntimeException ? 8 : 21);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if ((stackIn_6_0 ^ -1L) != ((long)param2 ^ -1L)) {
                            statePc = 18;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof RuntimeException ? 12 : 21);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = (stateCaught_7 instanceof RuntimeException ? 12 : 21);
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = (stateCaught_8 instanceof RuntimeException ? 12 : 21);
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (nq) var6;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof RuntimeException ? 12 : 21);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0.field_F != param1) {
                            statePc = 18;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = (stateCaught_10 instanceof RuntimeException ? 15 : 21);
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = (stateCaught_11 instanceof RuntimeException ? 15 : 21);
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = (stateCaught_12 instanceof RuntimeException ? 15 : 21);
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (2 != var6.field_B) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof RuntimeException ? 15 : 21);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4.field_L = var6.field_L;
                        var4.field_z = false;
                        // monitorexit var5
                        stackOut_16_0 = (nq) var4;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    try {
                        var6 = (nq) (Object) ((t) this).field_e.a(true);
                        if (var8 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        // monitorexit var5
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        throw (RuntimeException) (Object) var7;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        var4.field_L = param1.a(param2, 27176);
                        var4.field_u = param0;
                        var4.field_z = false;
                        stackOut_23_0 = (nq) var4;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0;
                }
                case 25: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var4_ref;
                        stackOut_26_1 = new StringBuilder().append("t.B(").append(param0).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param1 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw wn.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final nq a(qh param0, int param1, byte param2) {
        nq var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        nq stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        nq stackOut_0_0 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5 = -57 % ((3 - param2) / 35);
                        var4 = new nq();
                        var4.field_n = (long)param1;
                        var4.field_u = false;
                        var4.field_B = 3;
                        var4.field_F = param0;
                        this.a(var4, 0);
                        stackOut_0_0 = (nq) var4;
                        stackIn_1_0 = stackOut_0_0;
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 2;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return stackIn_1_0;
                }
                case 2: {
                    var4_ref = (RuntimeException) (Object) caughtException;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        stackOut_3_0 = (RuntimeException) var4_ref;
                        stackOut_3_1 = new StringBuilder().append("t.D(");
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        if (param0 == null) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
                        stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
                        stackOut_4_2 = "{...}";
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 6: {
                    stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                    stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                    stackOut_6_2 = "null";
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(u[] param0, int[] param1, r param2, r param3, boolean param4) {
        u[] var5 = null;
        int[] var6 = null;
        u[] var6_array = null;
        int var7_int = 0;
        co var7 = null;
        cr var8 = null;
        cr var9 = null;
        cr var10 = null;
        cr var11 = null;
        er[] var12 = null;
        er[] var13 = null;
        er[] var14 = null;
        cr var15 = null;
        er[] var16 = null;
        er[] var17 = null;
        int var18 = 0;
        cr stackIn_34_0 = null;
        r stackIn_34_1 = null;
        String stackIn_34_2 = null;
        String stackIn_34_3 = null;
        cr stackIn_35_0 = null;
        r stackIn_35_1 = null;
        String stackIn_35_2 = null;
        String stackIn_35_3 = null;
        cr stackIn_36_0 = null;
        r stackIn_36_1 = null;
        String stackIn_36_2 = null;
        String stackIn_36_3 = null;
        int stackIn_36_4 = 0;
        cr stackIn_37_0 = null;
        r stackIn_37_1 = null;
        String stackIn_37_2 = null;
        String stackIn_37_3 = null;
        cr stackIn_38_0 = null;
        r stackIn_38_1 = null;
        String stackIn_38_2 = null;
        String stackIn_38_3 = null;
        cr stackIn_39_0 = null;
        r stackIn_39_1 = null;
        String stackIn_39_2 = null;
        String stackIn_39_3 = null;
        int stackIn_39_4 = 0;
        cr stackIn_40_0 = null;
        r stackIn_40_1 = null;
        String stackIn_40_2 = null;
        String stackIn_40_3 = null;
        cr stackIn_41_0 = null;
        r stackIn_41_1 = null;
        String stackIn_41_2 = null;
        String stackIn_41_3 = null;
        cr stackIn_42_0 = null;
        r stackIn_42_1 = null;
        String stackIn_42_2 = null;
        String stackIn_42_3 = null;
        int stackIn_42_4 = 0;
        cr stackIn_43_0 = null;
        r stackIn_43_1 = null;
        String stackIn_43_2 = null;
        String stackIn_43_3 = null;
        cr stackIn_44_0 = null;
        r stackIn_44_1 = null;
        String stackIn_44_2 = null;
        String stackIn_44_3 = null;
        cr stackIn_45_0 = null;
        r stackIn_45_1 = null;
        String stackIn_45_2 = null;
        String stackIn_45_3 = null;
        int stackIn_45_4 = 0;
        cr stackIn_46_0 = null;
        r stackIn_46_1 = null;
        String stackIn_46_2 = null;
        String stackIn_46_3 = null;
        cr stackIn_47_0 = null;
        r stackIn_47_1 = null;
        String stackIn_47_2 = null;
        String stackIn_47_3 = null;
        cr stackIn_48_0 = null;
        r stackIn_48_1 = null;
        String stackIn_48_2 = null;
        String stackIn_48_3 = null;
        int stackIn_48_4 = 0;
        cr stackIn_49_0 = null;
        r stackIn_49_1 = null;
        String stackIn_49_2 = null;
        String stackIn_49_3 = null;
        cr stackIn_50_0 = null;
        r stackIn_50_1 = null;
        String stackIn_50_2 = null;
        String stackIn_50_3 = null;
        cr stackIn_51_0 = null;
        r stackIn_51_1 = null;
        String stackIn_51_2 = null;
        String stackIn_51_3 = null;
        int stackIn_51_4 = 0;
        cr stackIn_52_0 = null;
        r stackIn_52_1 = null;
        String stackIn_52_2 = null;
        String stackIn_52_3 = null;
        cr stackIn_53_0 = null;
        r stackIn_53_1 = null;
        String stackIn_53_2 = null;
        String stackIn_53_3 = null;
        cr stackIn_54_0 = null;
        r stackIn_54_1 = null;
        String stackIn_54_2 = null;
        String stackIn_54_3 = null;
        int stackIn_54_4 = 0;
        cr stackIn_55_0 = null;
        r stackIn_55_1 = null;
        String stackIn_55_2 = null;
        String stackIn_55_3 = null;
        cr stackIn_56_0 = null;
        r stackIn_56_1 = null;
        String stackIn_56_2 = null;
        String stackIn_56_3 = null;
        cr stackIn_57_0 = null;
        r stackIn_57_1 = null;
        String stackIn_57_2 = null;
        String stackIn_57_3 = null;
        int stackIn_57_4 = 0;
        cr stackIn_58_0 = null;
        r stackIn_58_1 = null;
        String stackIn_58_2 = null;
        String stackIn_58_3 = null;
        cr stackIn_59_0 = null;
        r stackIn_59_1 = null;
        String stackIn_59_2 = null;
        String stackIn_59_3 = null;
        cr stackIn_60_0 = null;
        r stackIn_60_1 = null;
        String stackIn_60_2 = null;
        String stackIn_60_3 = null;
        int stackIn_60_4 = 0;
        cr stackIn_61_0 = null;
        r stackIn_61_1 = null;
        String stackIn_61_2 = null;
        String stackIn_61_3 = null;
        cr stackIn_62_0 = null;
        r stackIn_62_1 = null;
        String stackIn_62_2 = null;
        String stackIn_62_3 = null;
        cr stackIn_63_0 = null;
        r stackIn_63_1 = null;
        String stackIn_63_2 = null;
        String stackIn_63_3 = null;
        int stackIn_63_4 = 0;
        cr stackIn_64_0 = null;
        r stackIn_64_1 = null;
        String stackIn_64_2 = null;
        String stackIn_64_3 = null;
        cr stackIn_65_0 = null;
        r stackIn_65_1 = null;
        String stackIn_65_2 = null;
        String stackIn_65_3 = null;
        cr stackIn_66_0 = null;
        r stackIn_66_1 = null;
        String stackIn_66_2 = null;
        String stackIn_66_3 = null;
        int stackIn_66_4 = 0;
        cr stackIn_67_0 = null;
        r stackIn_67_1 = null;
        String stackIn_67_2 = null;
        String stackIn_67_3 = null;
        cr stackIn_68_0 = null;
        r stackIn_68_1 = null;
        String stackIn_68_2 = null;
        String stackIn_68_3 = null;
        cr stackIn_69_0 = null;
        r stackIn_69_1 = null;
        String stackIn_69_2 = null;
        String stackIn_69_3 = null;
        int stackIn_69_4 = 0;
        r stackIn_70_0 = null;
        String stackIn_70_1 = null;
        String stackIn_70_2 = null;
        r stackIn_71_0 = null;
        String stackIn_71_1 = null;
        String stackIn_71_2 = null;
        r stackIn_72_0 = null;
        String stackIn_72_1 = null;
        String stackIn_72_2 = null;
        int stackIn_72_3 = 0;
        cr stackIn_73_0 = null;
        r stackIn_73_1 = null;
        String stackIn_73_2 = null;
        String stackIn_73_3 = null;
        cr stackIn_74_0 = null;
        r stackIn_74_1 = null;
        String stackIn_74_2 = null;
        String stackIn_74_3 = null;
        cr stackIn_75_0 = null;
        r stackIn_75_1 = null;
        String stackIn_75_2 = null;
        String stackIn_75_3 = null;
        int stackIn_75_4 = 0;
        cr stackOut_33_0 = null;
        r stackOut_33_1 = null;
        String stackOut_33_2 = null;
        String stackOut_33_3 = null;
        cr stackOut_35_0 = null;
        r stackOut_35_1 = null;
        String stackOut_35_2 = null;
        String stackOut_35_3 = null;
        int stackOut_35_4 = 0;
        cr stackOut_34_0 = null;
        r stackOut_34_1 = null;
        String stackOut_34_2 = null;
        String stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        cr stackOut_36_0 = null;
        r stackOut_36_1 = null;
        String stackOut_36_2 = null;
        String stackOut_36_3 = null;
        cr stackOut_38_0 = null;
        r stackOut_38_1 = null;
        String stackOut_38_2 = null;
        String stackOut_38_3 = null;
        int stackOut_38_4 = 0;
        cr stackOut_37_0 = null;
        r stackOut_37_1 = null;
        String stackOut_37_2 = null;
        String stackOut_37_3 = null;
        int stackOut_37_4 = 0;
        cr stackOut_39_0 = null;
        r stackOut_39_1 = null;
        String stackOut_39_2 = null;
        String stackOut_39_3 = null;
        cr stackOut_41_0 = null;
        r stackOut_41_1 = null;
        String stackOut_41_2 = null;
        String stackOut_41_3 = null;
        int stackOut_41_4 = 0;
        cr stackOut_40_0 = null;
        r stackOut_40_1 = null;
        String stackOut_40_2 = null;
        String stackOut_40_3 = null;
        int stackOut_40_4 = 0;
        cr stackOut_42_0 = null;
        r stackOut_42_1 = null;
        String stackOut_42_2 = null;
        String stackOut_42_3 = null;
        cr stackOut_44_0 = null;
        r stackOut_44_1 = null;
        String stackOut_44_2 = null;
        String stackOut_44_3 = null;
        int stackOut_44_4 = 0;
        cr stackOut_43_0 = null;
        r stackOut_43_1 = null;
        String stackOut_43_2 = null;
        String stackOut_43_3 = null;
        int stackOut_43_4 = 0;
        cr stackOut_45_0 = null;
        r stackOut_45_1 = null;
        String stackOut_45_2 = null;
        String stackOut_45_3 = null;
        cr stackOut_47_0 = null;
        r stackOut_47_1 = null;
        String stackOut_47_2 = null;
        String stackOut_47_3 = null;
        int stackOut_47_4 = 0;
        cr stackOut_46_0 = null;
        r stackOut_46_1 = null;
        String stackOut_46_2 = null;
        String stackOut_46_3 = null;
        int stackOut_46_4 = 0;
        cr stackOut_48_0 = null;
        r stackOut_48_1 = null;
        String stackOut_48_2 = null;
        String stackOut_48_3 = null;
        cr stackOut_50_0 = null;
        r stackOut_50_1 = null;
        String stackOut_50_2 = null;
        String stackOut_50_3 = null;
        int stackOut_50_4 = 0;
        cr stackOut_49_0 = null;
        r stackOut_49_1 = null;
        String stackOut_49_2 = null;
        String stackOut_49_3 = null;
        int stackOut_49_4 = 0;
        cr stackOut_51_0 = null;
        r stackOut_51_1 = null;
        String stackOut_51_2 = null;
        String stackOut_51_3 = null;
        cr stackOut_53_0 = null;
        r stackOut_53_1 = null;
        String stackOut_53_2 = null;
        String stackOut_53_3 = null;
        int stackOut_53_4 = 0;
        cr stackOut_52_0 = null;
        r stackOut_52_1 = null;
        String stackOut_52_2 = null;
        String stackOut_52_3 = null;
        int stackOut_52_4 = 0;
        cr stackOut_54_0 = null;
        r stackOut_54_1 = null;
        String stackOut_54_2 = null;
        String stackOut_54_3 = null;
        cr stackOut_56_0 = null;
        r stackOut_56_1 = null;
        String stackOut_56_2 = null;
        String stackOut_56_3 = null;
        int stackOut_56_4 = 0;
        cr stackOut_55_0 = null;
        r stackOut_55_1 = null;
        String stackOut_55_2 = null;
        String stackOut_55_3 = null;
        int stackOut_55_4 = 0;
        cr stackOut_57_0 = null;
        r stackOut_57_1 = null;
        String stackOut_57_2 = null;
        String stackOut_57_3 = null;
        cr stackOut_59_0 = null;
        r stackOut_59_1 = null;
        String stackOut_59_2 = null;
        String stackOut_59_3 = null;
        int stackOut_59_4 = 0;
        cr stackOut_58_0 = null;
        r stackOut_58_1 = null;
        String stackOut_58_2 = null;
        String stackOut_58_3 = null;
        int stackOut_58_4 = 0;
        cr stackOut_60_0 = null;
        r stackOut_60_1 = null;
        String stackOut_60_2 = null;
        String stackOut_60_3 = null;
        cr stackOut_62_0 = null;
        r stackOut_62_1 = null;
        String stackOut_62_2 = null;
        String stackOut_62_3 = null;
        int stackOut_62_4 = 0;
        cr stackOut_61_0 = null;
        r stackOut_61_1 = null;
        String stackOut_61_2 = null;
        String stackOut_61_3 = null;
        int stackOut_61_4 = 0;
        cr stackOut_63_0 = null;
        r stackOut_63_1 = null;
        String stackOut_63_2 = null;
        String stackOut_63_3 = null;
        cr stackOut_65_0 = null;
        r stackOut_65_1 = null;
        String stackOut_65_2 = null;
        String stackOut_65_3 = null;
        int stackOut_65_4 = 0;
        cr stackOut_64_0 = null;
        r stackOut_64_1 = null;
        String stackOut_64_2 = null;
        String stackOut_64_3 = null;
        int stackOut_64_4 = 0;
        cr stackOut_66_0 = null;
        r stackOut_66_1 = null;
        String stackOut_66_2 = null;
        String stackOut_66_3 = null;
        cr stackOut_68_0 = null;
        r stackOut_68_1 = null;
        String stackOut_68_2 = null;
        String stackOut_68_3 = null;
        int stackOut_68_4 = 0;
        cr stackOut_67_0 = null;
        r stackOut_67_1 = null;
        String stackOut_67_2 = null;
        String stackOut_67_3 = null;
        int stackOut_67_4 = 0;
        r stackOut_69_0 = null;
        String stackOut_69_1 = null;
        String stackOut_69_2 = null;
        r stackOut_71_0 = null;
        String stackOut_71_1 = null;
        String stackOut_71_2 = null;
        int stackOut_71_3 = 0;
        r stackOut_70_0 = null;
        String stackOut_70_1 = null;
        String stackOut_70_2 = null;
        int stackOut_70_3 = 0;
        cr stackOut_72_0 = null;
        r stackOut_72_1 = null;
        String stackOut_72_2 = null;
        String stackOut_72_3 = null;
        cr stackOut_74_0 = null;
        r stackOut_74_1 = null;
        String stackOut_74_2 = null;
        String stackOut_74_3 = null;
        int stackOut_74_4 = 0;
        cr stackOut_73_0 = null;
        r stackOut_73_1 = null;
        String stackOut_73_2 = null;
        String stackOut_73_3 = null;
        int stackOut_73_4 = 0;
        L0: {
          var18 = Vertigo2.field_L ? 1 : 0;
          var5 = oh.a((byte) -39, "crowns", "lobby", param3);
          eh.field_e = var5.length;
          if (param0 == null) {
            break L0;
          } else {
            var6_array = new u[param0.length + eh.field_e];
            var7_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (eh.field_e <= var7_int) {
                    break L3;
                  } else {
                    var6_array[var7_int] = var5[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L2;
                    } else {
                      if (var18 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var7_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  if (var7_int >= param0.length) {
                    break L5;
                  } else {
                    var6_array[var7_int + eh.field_e] = param0[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L0;
                    } else {
                      if (var18 == 0) {
                        continue L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                var5 = var6_array;
                break L0;
              }
            }
          }
        }
        var6 = new int[var5.length];
        var7_int = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (var7_int >= eh.field_e) {
                break L8;
              } else {
                var6[var7_int] = 10;
                var7_int++;
                if (var18 != 0) {
                  break L7;
                } else {
                  if (var18 == 0) {
                    continue L6;
                  } else {
                    break L8;
                  }
                }
              }
            }
            L9: {
              if (null == param0) {
                break L9;
              } else {
                L10: {
                  if (param1 != null) {
                    break L10;
                  } else {
                    var7_int = 0;
                    L11: while (true) {
                      L12: {
                        if (var7_int >= param0.length) {
                          break L12;
                        } else {
                          var6[eh.field_e + var7_int] = param0[var7_int].field_h;
                          var7_int++;
                          if (var18 != 0) {
                            break L7;
                          } else {
                            if (var18 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      if (var18 == 0) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                var7_int = 0;
                L13: while (true) {
                  if (var7_int >= param0.length) {
                    break L9;
                  } else {
                    var6[var7_int + eh.field_e] = param1[var7_int];
                    var7_int++;
                    if (var18 != 0) {
                      break L7;
                    } else {
                      if (var18 == 0) {
                        continue L13;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
              }
            }
            nl.field_k = 2;
            r.field_j = 2;
            r.field_f = 15;
            ia.field_G = 4;
            hc.field_b = 11;
            break L7;
          }
          L14: {
            var7 = w.a(param2, param3, "largefont", "lobby", 121);
            li.field_e = w.a(param2, param3, "generalfont", "lobby", 104);
            kb.field_c = w.a(param2, param3, "chatfont", "lobby", 121);
            var7.a((fq[]) (Object) var5, var6);
            li.field_e.a((fq[]) (Object) var5, var6);
            kb.field_c.a((fq[]) (Object) var5, var6);
            var8 = new cr(0L, (cr) null);
            var8.field_z = (cc) (Object) var7;
            var8.field_qb = r.field_f;
            var8.field_A = 16777215;
            var9 = var8;
            var8.field_ab = 1;
            var9.field_O = 1;
            var10 = new cr(0L, (cr) null);
            var10.field_z = (cc) (Object) li.field_e;
            var10.field_qb = r.field_f;
            var10.field_A = 16777215;
            var10.field_ab = 1;
            var11 = var10;
            var11.field_O = 1;
            j.field_q = new cr(0L, var8);
            j.field_q.field_Bb = hq.a(gk.a(param3, "lobby", "heading", true), 202);
            rq.field_t = new cr(0L, (cr) null);
            rq.field_t.field_Bb = ml.a((byte) -13, 8421504, false, 4210752, 120, param4);
            lk.field_a = new cr(0L, (cr) null);
            lk.field_a.field_Bb = vl.a(114, 3, 0, 1, 6316128, 6316128);
            vf.field_B = new cr(0L, (cr) null);
            vf.field_B.field_Bb = hq.a(gk.a(param3, "lobby", "popup", true), 202);
            var12 = hq.a(gk.a(param3, "lobby", "popup_mouseover", true), 202);
            var13 = gk.a(param3, "lobby", "button", true);
            var14 = hq.a(gk.a(param3, "lobby", "tab_active", true), 202);
            ji.field_s = new cr(0L, var8);
            ji.field_s.field_Bb = var14;
            eh.field_a = new cr(0L, (cr) null);
            eh.field_a.field_Db = tn.a("closebutton", param3, -82, "lobby");
            eh.field_a.field_W = tn.a("closebutton_mouseover", param3, -90, "lobby");
            gn.field_f = new cr(0L, var8);
            gn.field_f.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 40, true);
            db.field_t = new cr(0L, var10);
            db.field_t.field_R = 2;
            db.field_t.field_Bb = ml.a((byte) -13, 3815994, true, 2039583, 30, false);
            kl.field_Ib = new cr(0L, var10);
            kl.field_Ib.field_R = 2;
            kl.field_Ib.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, false);
            sa.field_a = new cr(0L, var10);
            sa.field_a.field_R = 2;
            sa.field_a.field_Bb = ml.a((byte) -13, 3815994, false, 2039583, 30, true);
            ee.field_b = new cr(0L, (cr) null);
            ee.field_b.field_qb = r.field_f;
            ee.field_b.field_ab = 1;
            ee.field_b.field_A = 13421772;
            ee.field_b.field_z = (cc) (Object) li.field_e;
            ja.field_e = new cr(0L, ee.field_b);
            ja.field_e.field_H = 16777215;
            ja.field_e.field_B = 16777215;
            ja.field_e.field_A = 16764006;
            ja.field_e.field_D = 8421504;
            ja.field_e.field_K = 16777215;
            var15 = new cr(0L, ja.field_e);
            var15.field_z = (cc) (Object) var7;
            var15.field_qb = r.field_f;
            var15.field_A = 16777215;
            pn.field_N = new cr(0L, ee.field_b);
            pn.field_N.field_Bb = ml.a((byte) -13, 2236962, false, 2236962, 16, false);
            pn.field_N.field_R = 2;
            fm.field_e = new cr(0L, ee.field_b);
            fm.field_e.field_Bb = ml.a((byte) -13, 1513239, false, 1513239, 16, false);
            fm.field_e.field_R = 2;
            tm.field_b = new cr(0L, pn.field_N);
            tm.field_b.a(ja.field_e, -46);
            el.field_b = new cr(0L, fm.field_e);
            el.field_b.a(ja.field_e, -104);
            var16 = gk.a(param3, "lobby", "button_mouseover", true);
            ar.field_c = new kq(vf.field_B, var12, ee.field_b, ja.field_e, 3, 2, r.field_j, 3, r.field_f);
            bq.field_B = new cr(0L, ja.field_e);
            bq.field_B.field_bb = 1;
            bq.field_B.field_Y = 1;
            bq.field_B.field_Cb = 1;
            bq.field_B.field_Q = var16;
            bq.field_B.field_Bb = var13;
            bq.field_B.field_Gb = 1;
            bq.field_B.field_cb = gk.a(param3, "lobby", "button_mouseheld", true);
            stackOut_33_0 = bq.field_B;
            stackOut_33_1 = (r) param3;
            stackOut_33_2 = "lobby";
            stackOut_33_3 = "button_active";
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_35_2 = stackOut_33_2;
            stackIn_35_3 = stackOut_33_3;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            stackIn_34_2 = stackOut_33_2;
            stackIn_34_3 = stackOut_33_3;
            if (param4) {
              stackOut_35_0 = (cr) (Object) stackIn_35_0;
              stackOut_35_1 = (r) (Object) stackIn_35_1;
              stackOut_35_2 = (String) (Object) stackIn_35_2;
              stackOut_35_3 = (String) (Object) stackIn_35_3;
              stackOut_35_4 = 0;
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              stackIn_36_3 = stackOut_35_3;
              stackIn_36_4 = stackOut_35_4;
              break L14;
            } else {
              stackOut_34_0 = (cr) (Object) stackIn_34_0;
              stackOut_34_1 = (r) (Object) stackIn_34_1;
              stackOut_34_2 = (String) (Object) stackIn_34_2;
              stackOut_34_3 = (String) (Object) stackIn_34_3;
              stackOut_34_4 = 1;
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              stackIn_36_3 = stackOut_34_3;
              stackIn_36_4 = stackOut_34_4;
              break L14;
            }
          }
          L15: {
            stackIn_36_0.field_T = gk.a(stackIn_36_1, stackIn_36_2, stackIn_36_3, stackIn_36_4 != 0);
            stackOut_36_0 = bq.field_B;
            stackOut_36_1 = (r) param3;
            stackOut_36_2 = "lobby";
            stackOut_36_3 = "button_disabled";
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_38_2 = stackOut_36_2;
            stackIn_38_3 = stackOut_36_3;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            stackIn_37_2 = stackOut_36_2;
            stackIn_37_3 = stackOut_36_3;
            if (param4) {
              stackOut_38_0 = (cr) (Object) stackIn_38_0;
              stackOut_38_1 = (r) (Object) stackIn_38_1;
              stackOut_38_2 = (String) (Object) stackIn_38_2;
              stackOut_38_3 = (String) (Object) stackIn_38_3;
              stackOut_38_4 = 0;
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              stackIn_39_3 = stackOut_38_3;
              stackIn_39_4 = stackOut_38_4;
              break L15;
            } else {
              stackOut_37_0 = (cr) (Object) stackIn_37_0;
              stackOut_37_1 = (r) (Object) stackIn_37_1;
              stackOut_37_2 = (String) (Object) stackIn_37_2;
              stackOut_37_3 = (String) (Object) stackIn_37_3;
              stackOut_37_4 = 1;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              stackIn_39_3 = stackOut_37_3;
              stackIn_39_4 = stackOut_37_4;
              break L15;
            }
          }
          L16: {
            stackIn_39_0.field_gb = gk.a(stackIn_39_1, stackIn_39_2, stackIn_39_3, stackIn_39_4 != 0);
            bq.field_B.field_O = 1;
            qr.field_m = new cr(0L, ja.field_e);
            qr.field_m.field_O = 1;
            stackOut_39_0 = qr.field_m;
            stackOut_39_1 = (r) param3;
            stackOut_39_2 = "lobby";
            stackOut_39_3 = "tab_inactive";
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_41_2 = stackOut_39_2;
            stackIn_41_3 = stackOut_39_3;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            stackIn_40_2 = stackOut_39_2;
            stackIn_40_3 = stackOut_39_3;
            if (param4) {
              stackOut_41_0 = (cr) (Object) stackIn_41_0;
              stackOut_41_1 = (r) (Object) stackIn_41_1;
              stackOut_41_2 = (String) (Object) stackIn_41_2;
              stackOut_41_3 = (String) (Object) stackIn_41_3;
              stackOut_41_4 = 0;
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              stackIn_42_3 = stackOut_41_3;
              stackIn_42_4 = stackOut_41_4;
              break L16;
            } else {
              stackOut_40_0 = (cr) (Object) stackIn_40_0;
              stackOut_40_1 = (r) (Object) stackIn_40_1;
              stackOut_40_2 = (String) (Object) stackIn_40_2;
              stackOut_40_3 = (String) (Object) stackIn_40_3;
              stackOut_40_4 = 1;
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              stackIn_42_3 = stackOut_40_3;
              stackIn_42_4 = stackOut_40_4;
              break L16;
            }
          }
          L17: {
            stackIn_42_0.field_Bb = hq.a(gk.a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_42_4 != 0), 202);
            stackOut_42_0 = qr.field_m;
            stackOut_42_1 = (r) param3;
            stackOut_42_2 = "lobby";
            stackOut_42_3 = "tab_mouseover";
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_44_2 = stackOut_42_2;
            stackIn_44_3 = stackOut_42_3;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            stackIn_43_2 = stackOut_42_2;
            stackIn_43_3 = stackOut_42_3;
            if (param4) {
              stackOut_44_0 = (cr) (Object) stackIn_44_0;
              stackOut_44_1 = (r) (Object) stackIn_44_1;
              stackOut_44_2 = (String) (Object) stackIn_44_2;
              stackOut_44_3 = (String) (Object) stackIn_44_3;
              stackOut_44_4 = 0;
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              stackIn_45_3 = stackOut_44_3;
              stackIn_45_4 = stackOut_44_4;
              break L17;
            } else {
              stackOut_43_0 = (cr) (Object) stackIn_43_0;
              stackOut_43_1 = (r) (Object) stackIn_43_1;
              stackOut_43_2 = (String) (Object) stackIn_43_2;
              stackOut_43_3 = (String) (Object) stackIn_43_3;
              stackOut_43_4 = 1;
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              stackIn_45_3 = stackOut_43_3;
              stackIn_45_4 = stackOut_43_4;
              break L17;
            }
          }
          L18: {
            stackIn_45_0.field_Q = hq.a(gk.a(stackIn_45_1, stackIn_45_2, stackIn_45_3, stackIn_45_4 != 0), 202);
            qr.field_m.field_T = var14;
            ab.field_d = new cr(0L, (cr) null);
            ab.field_d.field_Bb = vl.a(206, 3, 0, -1, 1856141, 1127256);
            dj.field_b = new cr(0L, (cr) null);
            dj.field_b.field_Bb = vl.a(290, 3, 0, -1, 11579568, 6052956);
            fb.field_u = new cr(0L, var15);
            fb.field_u.field_bb = 1;
            fb.field_u.field_Gb = 1;
            fb.field_u.field_O = 1;
            fb.field_u.field_Y = 1;
            fb.field_u.field_Cb = 1;
            ub.field_t = new cr(0L, fb.field_u);
            uk.field_e = new cr(0L, ja.field_e);
            uk.field_e.field_Cb = 1;
            uk.field_e.field_O = 1;
            uk.field_e.field_Y = 1;
            uk.field_e.field_Gb = 1;
            uk.field_e.field_bb = 1;
            sc.field_c = new cr(0L, uk.field_e);
            gh.field_b = new cr(0L, uk.field_e);
            vc.field_b = new cr(0L, fb.field_u);
            ip.field_a = new cr(0L, uk.field_e);
            ca.field_f = new cr(0L, uk.field_e);
            tr.field_l = new cr(0L, uk.field_e);
            uk.field_e.field_Bb = hq.a(gk.a(param3, "lobby", "smallbutton", true), 202);
            uk.field_e.field_Q = hq.a(gk.a(param3, "lobby", "smallbutton_mouseover", true), 202);
            uk.field_e.field_T = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
            uk.field_e.field_cb = hq.a(gk.a(param3, "lobby", "smallbutton_active", true), 202);
            stackOut_45_0 = uk.field_e;
            stackOut_45_1 = (r) param3;
            stackOut_45_2 = "lobby";
            stackOut_45_3 = "smallbutton_disabled";
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_47_2 = stackOut_45_2;
            stackIn_47_3 = stackOut_45_3;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            stackIn_46_2 = stackOut_45_2;
            stackIn_46_3 = stackOut_45_3;
            if (param4) {
              stackOut_47_0 = (cr) (Object) stackIn_47_0;
              stackOut_47_1 = (r) (Object) stackIn_47_1;
              stackOut_47_2 = (String) (Object) stackIn_47_2;
              stackOut_47_3 = (String) (Object) stackIn_47_3;
              stackOut_47_4 = 0;
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              stackIn_48_3 = stackOut_47_3;
              stackIn_48_4 = stackOut_47_4;
              break L18;
            } else {
              stackOut_46_0 = (cr) (Object) stackIn_46_0;
              stackOut_46_1 = (r) (Object) stackIn_46_1;
              stackOut_46_2 = (String) (Object) stackIn_46_2;
              stackOut_46_3 = (String) (Object) stackIn_46_3;
              stackOut_46_4 = 1;
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              stackIn_48_3 = stackOut_46_3;
              stackIn_48_4 = stackOut_46_4;
              break L18;
            }
          }
          L19: {
            stackIn_48_0.field_gb = hq.a(gk.a(stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_48_4 != 0), 202);
            ub.field_t.field_Bb = hq.a(gk.a(param3, "lobby", "mediumbutton", true), 202);
            ub.field_t.field_Q = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseover", true), 202);
            ub.field_t.field_cb = hq.a(gk.a(param3, "lobby", "mediumbutton_mouseheld", true), 202);
            fb.field_u.field_Bb = hq.a(gk.a(param3, "lobby", "bigbutton", true), 202);
            fb.field_u.field_Q = hq.a(gk.a(param3, "lobby", "bigbutton_mouseover", true), 202);
            stackOut_48_0 = fb.field_u;
            stackOut_48_1 = (r) param3;
            stackOut_48_2 = "lobby";
            stackOut_48_3 = "bigbutton_mouseheld";
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_50_2 = stackOut_48_2;
            stackIn_50_3 = stackOut_48_3;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            stackIn_49_2 = stackOut_48_2;
            stackIn_49_3 = stackOut_48_3;
            if (param4) {
              stackOut_50_0 = (cr) (Object) stackIn_50_0;
              stackOut_50_1 = (r) (Object) stackIn_50_1;
              stackOut_50_2 = (String) (Object) stackIn_50_2;
              stackOut_50_3 = (String) (Object) stackIn_50_3;
              stackOut_50_4 = 0;
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              stackIn_51_3 = stackOut_50_3;
              stackIn_51_4 = stackOut_50_4;
              break L19;
            } else {
              stackOut_49_0 = (cr) (Object) stackIn_49_0;
              stackOut_49_1 = (r) (Object) stackIn_49_1;
              stackOut_49_2 = (String) (Object) stackIn_49_2;
              stackOut_49_3 = (String) (Object) stackIn_49_3;
              stackOut_49_4 = 1;
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              stackIn_51_3 = stackOut_49_3;
              stackIn_51_4 = stackOut_49_4;
              break L19;
            }
          }
          L20: {
            stackIn_51_0.field_cb = hq.a(gk.a(stackIn_51_1, stackIn_51_2, stackIn_51_3, stackIn_51_4 != 0), 202);
            fb.field_u.field_gb = hq.a(gk.a(param3, "lobby", "bigbutton_disabled", true), 202);
            sc.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "greenbutton", true), 202);
            stackOut_51_0 = sc.field_c;
            stackOut_51_1 = (r) param3;
            stackOut_51_2 = "lobby";
            stackOut_51_3 = "greenbutton_mouseover";
            stackIn_53_0 = stackOut_51_0;
            stackIn_53_1 = stackOut_51_1;
            stackIn_53_2 = stackOut_51_2;
            stackIn_53_3 = stackOut_51_3;
            stackIn_52_0 = stackOut_51_0;
            stackIn_52_1 = stackOut_51_1;
            stackIn_52_2 = stackOut_51_2;
            stackIn_52_3 = stackOut_51_3;
            if (param4) {
              stackOut_53_0 = (cr) (Object) stackIn_53_0;
              stackOut_53_1 = (r) (Object) stackIn_53_1;
              stackOut_53_2 = (String) (Object) stackIn_53_2;
              stackOut_53_3 = (String) (Object) stackIn_53_3;
              stackOut_53_4 = 0;
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              stackIn_54_3 = stackOut_53_3;
              stackIn_54_4 = stackOut_53_4;
              break L20;
            } else {
              stackOut_52_0 = (cr) (Object) stackIn_52_0;
              stackOut_52_1 = (r) (Object) stackIn_52_1;
              stackOut_52_2 = (String) (Object) stackIn_52_2;
              stackOut_52_3 = (String) (Object) stackIn_52_3;
              stackOut_52_4 = 1;
              stackIn_54_0 = stackOut_52_0;
              stackIn_54_1 = stackOut_52_1;
              stackIn_54_2 = stackOut_52_2;
              stackIn_54_3 = stackOut_52_3;
              stackIn_54_4 = stackOut_52_4;
              break L20;
            }
          }
          L21: {
            stackIn_54_0.field_Q = hq.a(gk.a(stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_54_4 != 0), 202);
            stackOut_54_0 = sc.field_c;
            stackOut_54_1 = (r) param3;
            stackOut_54_2 = "lobby";
            stackOut_54_3 = "greenbutton_mouseheld";
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_56_2 = stackOut_54_2;
            stackIn_56_3 = stackOut_54_3;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            stackIn_55_2 = stackOut_54_2;
            stackIn_55_3 = stackOut_54_3;
            if (param4) {
              stackOut_56_0 = (cr) (Object) stackIn_56_0;
              stackOut_56_1 = (r) (Object) stackIn_56_1;
              stackOut_56_2 = (String) (Object) stackIn_56_2;
              stackOut_56_3 = (String) (Object) stackIn_56_3;
              stackOut_56_4 = 0;
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              stackIn_57_3 = stackOut_56_3;
              stackIn_57_4 = stackOut_56_4;
              break L21;
            } else {
              stackOut_55_0 = (cr) (Object) stackIn_55_0;
              stackOut_55_1 = (r) (Object) stackIn_55_1;
              stackOut_55_2 = (String) (Object) stackIn_55_2;
              stackOut_55_3 = (String) (Object) stackIn_55_3;
              stackOut_55_4 = 1;
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              stackIn_57_3 = stackOut_55_3;
              stackIn_57_4 = stackOut_55_4;
              break L21;
            }
          }
          L22: {
            stackIn_57_0.field_cb = hq.a(gk.a(stackIn_57_1, stackIn_57_2, stackIn_57_3, stackIn_57_4 != 0), 202);
            gh.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "redbutton", true), 202);
            gh.field_b.field_Q = hq.a(gk.a(param3, "lobby", "redbutton_mouseover", true), 202);
            stackOut_57_0 = gh.field_b;
            stackOut_57_1 = (r) param3;
            stackOut_57_2 = "lobby";
            stackOut_57_3 = "redbutton_mouseheld";
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_59_2 = stackOut_57_2;
            stackIn_59_3 = stackOut_57_3;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            stackIn_58_2 = stackOut_57_2;
            stackIn_58_3 = stackOut_57_3;
            if (param4) {
              stackOut_59_0 = (cr) (Object) stackIn_59_0;
              stackOut_59_1 = (r) (Object) stackIn_59_1;
              stackOut_59_2 = (String) (Object) stackIn_59_2;
              stackOut_59_3 = (String) (Object) stackIn_59_3;
              stackOut_59_4 = 0;
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              stackIn_60_3 = stackOut_59_3;
              stackIn_60_4 = stackOut_59_4;
              break L22;
            } else {
              stackOut_58_0 = (cr) (Object) stackIn_58_0;
              stackOut_58_1 = (r) (Object) stackIn_58_1;
              stackOut_58_2 = (String) (Object) stackIn_58_2;
              stackOut_58_3 = (String) (Object) stackIn_58_3;
              stackOut_58_4 = 1;
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              stackIn_60_3 = stackOut_58_3;
              stackIn_60_4 = stackOut_58_4;
              break L22;
            }
          }
          L23: {
            stackIn_60_0.field_cb = hq.a(gk.a(stackIn_60_1, stackIn_60_2, stackIn_60_3, stackIn_60_4 != 0), 202);
            vc.field_b.field_Bb = hq.a(gk.a(param3, "lobby", "backbutton", true), 202);
            vc.field_b.field_Q = hq.a(gk.a(param3, "lobby", "backbutton_mouseover", true), 202);
            vc.field_b.field_cb = hq.a(gk.a(param3, "lobby", "backbutton_mouseheld", true), 202);
            vc.field_b.field_gb = hq.a(gk.a(param3, "lobby", "backbutton_disabled", true), 202);
            tr.field_l.field_Bb = hq.a(gk.a(param3, "lobby", "gameoptionbutton", true), 202);
            stackOut_60_0 = tr.field_l;
            stackOut_60_1 = (r) param3;
            stackOut_60_2 = "lobby";
            stackOut_60_3 = "gameoptionbutton_mouseover";
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_62_2 = stackOut_60_2;
            stackIn_62_3 = stackOut_60_3;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            stackIn_61_2 = stackOut_60_2;
            stackIn_61_3 = stackOut_60_3;
            if (param4) {
              stackOut_62_0 = (cr) (Object) stackIn_62_0;
              stackOut_62_1 = (r) (Object) stackIn_62_1;
              stackOut_62_2 = (String) (Object) stackIn_62_2;
              stackOut_62_3 = (String) (Object) stackIn_62_3;
              stackOut_62_4 = 0;
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              stackIn_63_3 = stackOut_62_3;
              stackIn_63_4 = stackOut_62_4;
              break L23;
            } else {
              stackOut_61_0 = (cr) (Object) stackIn_61_0;
              stackOut_61_1 = (r) (Object) stackIn_61_1;
              stackOut_61_2 = (String) (Object) stackIn_61_2;
              stackOut_61_3 = (String) (Object) stackIn_61_3;
              stackOut_61_4 = 1;
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              stackIn_63_3 = stackOut_61_3;
              stackIn_63_4 = stackOut_61_4;
              break L23;
            }
          }
          L24: {
            stackIn_63_0.field_Q = hq.a(gk.a(stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_63_4 != 0), 202);
            tr.field_l.field_T = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
            tr.field_l.field_cb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_active", true), 202);
            tr.field_l.field_gb = hq.a(gk.a(param3, "lobby", "gameoptionbutton_disabled", true), 202);
            ip.field_a.field_Bb = hq.a(gk.a(param3, "lobby", "chatbutton", true), 202);
            ip.field_a.field_Q = hq.a(gk.a(param3, "lobby", "chatbutton_mouseover", true), 202);
            ip.field_a.field_T = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
            ip.field_a.field_cb = hq.a(gk.a(param3, "lobby", "chatbutton_active", true), 202);
            stackOut_63_0 = ca.field_f;
            stackOut_63_1 = (r) param3;
            stackOut_63_2 = "lobby";
            stackOut_63_3 = "chatfilterbutton";
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_65_2 = stackOut_63_2;
            stackIn_65_3 = stackOut_63_3;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            stackIn_64_2 = stackOut_63_2;
            stackIn_64_3 = stackOut_63_3;
            if (param4) {
              stackOut_65_0 = (cr) (Object) stackIn_65_0;
              stackOut_65_1 = (r) (Object) stackIn_65_1;
              stackOut_65_2 = (String) (Object) stackIn_65_2;
              stackOut_65_3 = (String) (Object) stackIn_65_3;
              stackOut_65_4 = 0;
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              stackIn_66_3 = stackOut_65_3;
              stackIn_66_4 = stackOut_65_4;
              break L24;
            } else {
              stackOut_64_0 = (cr) (Object) stackIn_64_0;
              stackOut_64_1 = (r) (Object) stackIn_64_1;
              stackOut_64_2 = (String) (Object) stackIn_64_2;
              stackOut_64_3 = (String) (Object) stackIn_64_3;
              stackOut_64_4 = 1;
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              stackIn_66_3 = stackOut_64_3;
              stackIn_66_4 = stackOut_64_4;
              break L24;
            }
          }
          L25: {
            stackIn_66_0.field_Bb = hq.a(gk.a(stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_66_4 != 0), 202);
            stackOut_66_0 = ca.field_f;
            stackOut_66_1 = (r) param3;
            stackOut_66_2 = "lobby";
            stackOut_66_3 = "chatfilterbutton_mouseover";
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_68_2 = stackOut_66_2;
            stackIn_68_3 = stackOut_66_3;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            stackIn_67_2 = stackOut_66_2;
            stackIn_67_3 = stackOut_66_3;
            if (param4) {
              stackOut_68_0 = (cr) (Object) stackIn_68_0;
              stackOut_68_1 = (r) (Object) stackIn_68_1;
              stackOut_68_2 = (String) (Object) stackIn_68_2;
              stackOut_68_3 = (String) (Object) stackIn_68_3;
              stackOut_68_4 = 0;
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              stackIn_69_3 = stackOut_68_3;
              stackIn_69_4 = stackOut_68_4;
              break L25;
            } else {
              stackOut_67_0 = (cr) (Object) stackIn_67_0;
              stackOut_67_1 = (r) (Object) stackIn_67_1;
              stackOut_67_2 = (String) (Object) stackIn_67_2;
              stackOut_67_3 = (String) (Object) stackIn_67_3;
              stackOut_67_4 = 1;
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              stackIn_69_3 = stackOut_67_3;
              stackIn_69_4 = stackOut_67_4;
              break L25;
            }
          }
          L26: {
            stackIn_69_0.field_Q = hq.a(gk.a(stackIn_69_1, stackIn_69_2, stackIn_69_3, stackIn_69_4 != 0), 202);
            ca.field_f.field_T = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
            ca.field_f.field_cb = hq.a(gk.a(param3, "lobby", "chatfilterbutton_active", true), 202);
            stackOut_69_0 = (r) param3;
            stackOut_69_1 = "lobby";
            stackOut_69_2 = "checkbox";
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_71_2 = stackOut_69_2;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            stackIn_70_2 = stackOut_69_2;
            if (param4) {
              stackOut_71_0 = (r) (Object) stackIn_71_0;
              stackOut_71_1 = (String) (Object) stackIn_71_1;
              stackOut_71_2 = (String) (Object) stackIn_71_2;
              stackOut_71_3 = 0;
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              stackIn_72_3 = stackOut_71_3;
              break L26;
            } else {
              stackOut_70_0 = (r) (Object) stackIn_70_0;
              stackOut_70_1 = (String) (Object) stackIn_70_1;
              stackOut_70_2 = (String) (Object) stackIn_70_2;
              stackOut_70_3 = 1;
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              stackIn_72_3 = stackOut_70_3;
              break L26;
            }
          }
          L27: {
            var17 = gk.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, stackIn_72_3 != 0);
            fr.field_a = new sm(0L, var17[1], var17[0], 1, ja.field_e, (String) null);
            tb.field_a = new cr(0L, (cr) null);
            tb.field_a.field_Bb = rh.a(tn.a("slideregion", param3, -90, "lobby"), -27140);
            tb.field_a.field_Q = rh.a(tn.a("slideregion_mouseover", param3, -95, "lobby"), -27140);
            tb.field_a.field_cb = rh.a(tn.a("slideregion_mouseheld", param3, -77, "lobby"), -27140);
            tb.field_a.field_gb = rh.a(tn.a("slideregion_disabled", param3, -89, "lobby"), -27140);
            sj.field_c = new cr(0L, (cr) null);
            sj.field_c.field_Bb = hq.a(gk.a(param3, "lobby", "dragbar", true), 202);
            stackOut_72_0 = sj.field_c;
            stackOut_72_1 = (r) param3;
            stackOut_72_2 = "lobby";
            stackOut_72_3 = "dragbar_mouseover";
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_74_2 = stackOut_72_2;
            stackIn_74_3 = stackOut_72_3;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            stackIn_73_2 = stackOut_72_2;
            stackIn_73_3 = stackOut_72_3;
            if (param4) {
              stackOut_74_0 = (cr) (Object) stackIn_74_0;
              stackOut_74_1 = (r) (Object) stackIn_74_1;
              stackOut_74_2 = (String) (Object) stackIn_74_2;
              stackOut_74_3 = (String) (Object) stackIn_74_3;
              stackOut_74_4 = 0;
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              stackIn_75_3 = stackOut_74_3;
              stackIn_75_4 = stackOut_74_4;
              break L27;
            } else {
              stackOut_73_0 = (cr) (Object) stackIn_73_0;
              stackOut_73_1 = (r) (Object) stackIn_73_1;
              stackOut_73_2 = (String) (Object) stackIn_73_2;
              stackOut_73_3 = (String) (Object) stackIn_73_3;
              stackOut_73_4 = 1;
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              stackIn_75_3 = stackOut_73_3;
              stackIn_75_4 = stackOut_73_4;
              break L27;
            }
          }
          stackIn_75_0.field_Q = hq.a(gk.a(stackIn_75_1, stackIn_75_2, stackIn_75_3, stackIn_75_4 != 0), 202);
          sj.field_c.field_cb = hq.a(gk.a(param3, "lobby", "dragbar_mouseheld", true), 202);
          sj.field_c.field_gb = hq.a(gk.a(param3, "lobby", "dragbar_disabled", true), 202);
          ad.field_e = new cr(0L, (cr) null);
          ad.field_e.field_Db = tn.a("upbutton", param3, -73, "lobby");
          ad.field_e.field_W = tn.a("upbutton_mouseover", param3, -107, "lobby");
          ad.field_e.field_Ab = tn.a("upbutton_mouseheld", param3, -100, "lobby");
          ad.field_e.field_I = tn.a("upbutton_disabled", param3, -80, "lobby");
          lc.field_e = new cr(0L, (cr) null);
          lc.field_e.field_Db = tn.a("downbutton", param3, -101, "lobby");
          lc.field_e.field_W = tn.a("downbutton_mouseover", param3, -77, "lobby");
          lc.field_e.field_Ab = tn.a("downbutton_mouseheld", param3, -114, "lobby");
          lc.field_e.field_I = tn.a("downbutton_disabled", param3, -99, "lobby");
          ol.field_H = new ie(0L, ad.field_e, lc.field_e, tb.field_a, sj.field_c);
          pb.field_b = new dm(0L, (cr) null, ua.field_c, ol.field_H, uk.field_e, (String) null, (String) null);
          return;
        }
    }

    final nq a(int param0, int param1, qh param2, byte[] param3) {
        nq var5 = null;
        RuntimeException var5_ref = null;
        nq stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        nq stackOut_5_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var5 = new nq();
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var5.field_B = 2;
                        var5.field_n = (long)param1;
                        var5.field_u = false;
                        var5.field_F = param2;
                        if (param0 == -19932) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_i = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 4;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5.field_L = param3;
                        this.a(var5, 0);
                        stackOut_5_0 = (nq) var5;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0;
                }
                case 7: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        stackOut_8_0 = (RuntimeException) var5_ref;
                        stackOut_8_1 = new StringBuilder().append("t.E(").append(param0).append(44).append(param1).append(44);
                        stackIn_11_0 = stackOut_8_0;
                        stackIn_11_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (param2 == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                        stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                        stackOut_9_2 = "{...}";
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_12_1 = stackOut_9_1;
                        stackIn_12_2 = stackOut_9_2;
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 11: {
                    stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                    stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                    stackOut_11_2 = "null";
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    try {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
                        stackIn_15_0 = stackOut_12_0;
                        stackIn_15_1 = stackOut_12_1;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        if (param3 == null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "{...}";
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_16_2 = stackOut_13_2;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 15: {
                    stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                    stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                    stackOut_15_2 = "null";
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw wn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    t(jj param0) {
        RuntimeException runtimeException = null;
        wk var2 = null;
        int var3 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = Vertigo2.field_L ? 1 : 0;
                    ((t) this).field_e = new ak();
                    ((t) this).field_d = 0;
                    ((t) this).field_j = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = param0.a(5, (Runnable) this, 0);
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
                        if (0 != var2.field_b) {
                            statePc = 7;
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
                        um.a(true, 10L);
                        if (var3 != 0) {
                            statePc = 18;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var2.field_b != 2) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((t) this).field_h = (Thread) var2.field_d;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    runtimeException = (RuntimeException) (Object) caughtException;
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        stackOut_13_0 = (RuntimeException) runtimeException;
                        stackOut_13_1 = new StringBuilder().append("t.<init>(");
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_16_1 = stackOut_13_1;
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        if (param0 == null) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                        stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                        stackOut_14_2 = "{...}";
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        stackIn_17_2 = stackOut_14_2;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 16: {
                    stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                    stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                    stackOut_16_2 = "null";
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw wn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
                }
                case 18: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Unable to delete name - system busy";
        field_k = "Clan";
        field_a = 0;
        field_b = 0;
        field_i = "Level select";
        field_f = field_a;
        field_m = null;
        field_g = 49;
    }
}
