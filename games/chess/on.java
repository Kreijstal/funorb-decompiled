/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on implements Runnable {
    static int field_d;
    static int field_h;
    private ad field_g;
    static int field_e;
    private Thread field_b;
    private boolean field_f;
    static boolean field_a;
    int field_c;

    final tc a(gd param0, int param1, byte param2) {
        tc var4 = new tc();
        var4.field_l = (long)param1;
        var4.field_B = 3;
        int var5 = -122 % ((1 - param2) / 39);
        var4.field_x = param0;
        var4.field_u = false;
        this.a((byte) -54, var4);
        return var4;
    }

    private final void a(byte param0, tc param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((on) this).field_g;
                    // monitorenter ((on) this).field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -54) {
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
                        var5 = null;
                        tc discarded$3 = ((on) this).a((byte[]) null, -10, 42, (gd) null);
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
                        ((on) this).field_g.a(0, (l) (Object) param1);
                        ((on) this).field_c = ((on) this).field_c + 1;
                        ((Object) (Object) ((on) this).field_g).notifyAll();
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

    final static String a(int param0, String param1) {
        int var2 = 0;
        if (param0 != -11307) {
          L0: {
            field_d = -9;
            var2 = hg.a(sb.field_rb, false, sk.field_t);
            if (-2 == var2) {
              param1 = "<img=0>" + param1;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-3 != var2) {
              break L1;
            } else {
              param1 = "<img=1>" + param1;
              break L1;
            }
          }
          return param1;
        } else {
          L2: {
            var2 = hg.a(sb.field_rb, false, sk.field_t);
            if (-2 == var2) {
              param1 = "<img=0>" + param1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (-3 != var2) {
              break L3;
            } else {
              param1 = "<img=1>" + param1;
              break L3;
            }
          }
          return param1;
        }
    }

    final tc a(byte param0, int param1, gd param2) {
        tc var4 = null;
        Object var5 = null;
        tc var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        tc stackIn_7_0 = null;
        tc stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Chess.field_G;
                    var4 = new tc();
                    var4.field_B = 1;
                    var5 = (Object) (Object) ((on) this).field_g;
                    // monitorenter ((on) this).field_g
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (tc) (Object) ((on) this).field_g.b(-22585);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6.field_l != (long)param1) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param2 != var6.field_x) {
                            statePc = 8;
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
                        if (-3 != (var6.field_B ^ -1)) {
                            statePc = 8;
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
                        var4.field_s = false;
                        var4.field_v = var6.field_v;
                        // monitorexit var5
                        stackOut_6_0 = (tc) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return (tc) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (tc) (Object) ((on) this).field_g.b((byte) -113);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (param0 <= -47) {
                            statePc = 11;
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
                        field_a = true;
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
                    var4.field_v = param2.a(param1, 111);
                    var4.field_s = false;
                    var4.field_u = true;
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
            tc var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((on) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((on) this).field_g;
                        // monitorenter ((on) this).field_g
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (tc) (Object) ((on) this).field_g.a((byte) -75);
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
                            ((on) this).field_c = ((on) this).field_c - 1;
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
                            ((Object) (Object) ((on) this).field_g).wait();
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
                            if (2 == var7.field_B) {
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
                            if (-4 != (var7.field_B ^ -1)) {
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
                            var7.field_v = var7.field_x.a((int)var7.field_l, 111);
                            var7.field_s = false;
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
                            boolean discarded$1 = var7.field_x.a((int)var7.field_l, var7.field_v, (byte) 59, var7.field_v.length);
                            var7.field_s = false;
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
                        fg.a((Throwable) (Object) var2_ref, (byte) -77, (String) null);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_s = false;
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

    final void a(int param0) {
        ((on) this).field_f = true;
        if (param0 != 3) {
            field_d = -102;
        }
        Object var2 = (Object) (Object) ((on) this).field_g;
        // monitorenter ((on) this).field_g
        ((Object) (Object) ((on) this).field_g).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((on) this).field_b.join();
        } catch (InterruptedException interruptedException) {
        }
        ((on) this).field_b = null;
    }

    final tc a(byte[] param0, int param1, int param2, gd param3) {
        tc var5 = new tc();
        var5.field_u = false;
        var5.field_l = (long)param1;
        var5.field_B = param2;
        var5.field_x = param3;
        var5.field_v = param0;
        this.a((byte) -54, var5);
        return var5;
    }

    on(jk param0) {
        ((on) this).field_g = new ad();
        ((on) this).field_f = false;
        ((on) this).field_c = 0;
        nl var2 = param0.a(5, true, (Runnable) this);
        while (var2.field_f == 0) {
            bc.a(10L, (byte) -109);
        }
        if (var2.field_f == 2) {
            throw new RuntimeException();
        }
        ((on) this).field_b = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
        field_d = 2;
    }
}
