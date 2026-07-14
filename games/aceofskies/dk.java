/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk implements Runnable {
    static String field_a;
    private er field_f;
    static String field_k;
    static String field_b;
    static dq field_h;
    static String field_i;
    static wp[] field_e;
    private boolean field_j;
    int field_d;
    static int[] field_g;
    private Thread field_c;

    final os a(byte[] param0, bl param1, boolean param2, int param3) {
        os var5 = null;
        var5 = new os();
        var5.field_i = (long)param3;
        var5.field_u = param0;
        var5.field_v = 2;
        var5.field_x = param1;
        var5.field_q = false;
        if (!param2) {
          dk.a(-85);
          this.a((byte) -88, var5);
          return var5;
        } else {
          this.a((byte) -88, var5);
          return var5;
        }
    }

    final os a(bl param0, byte param1, int param2) {
        os var4 = null;
        Object var5 = null;
        os var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        os stackIn_10_0 = null;
        os stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = AceOfSkies.field_G ? 1 : 0;
                    if (param1 > 53) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((dk) this).field_j = false;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4 = new os();
                    var4.field_v = 1;
                    var5 = (Object) (Object) ((dk) this).field_f;
                    // monitorenter ((dk) this).field_f
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (os) ((dk) this).field_f.b((byte) 52);
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
                        if (((os) var6).field_i != (long)param2) {
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
                        if (param0 != ((os) var6).field_x) {
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
                        if ((((os) var6).field_v ^ -1) == -3) {
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
                        var4.field_p = false;
                        var4.field_u = ((os) var6).field_u;
                        // monitorexit var5
                        stackOut_9_0 = (os) var4;
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
                    return (os) (Object) stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (os) ((dk) this).field_f.e(31542);
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
                    var4.field_u = param0.a(param2, 255);
                    var4.field_q = true;
                    var4.field_p = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -4) {
          boolean discarded$2 = dk.a(-105, 77, (byte) -91);
          field_h = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_i = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_i = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            os var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((dk) this).field_j) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((dk) this).field_f;
                        // monitorenter ((dk) this).field_f
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (os) ((dk) this).field_f.b(-18520);
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
                            ((dk) this).field_d = ((dk) this).field_d - 1;
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
                            ((Object) (Object) ((dk) this).field_f).wait();
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
                            if (2 != ((os) var7).field_v) {
                                statePc = 16;
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
                            boolean discarded$1 = ((os) var7).field_x.a(((os) var7).field_u.length, 255, (int)((os) var7).field_i, ((os) var7).field_u);
                            var7.field_p = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((((os) var7).field_v ^ -1) == -4) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_p = false;
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
                            var7.field_u = ((os) var7).field_x.a((int)((os) var7).field_i, 255);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = (String) null;
                        v.a((String) null, (byte) -52, (Throwable) (Object) var2_ref);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_p = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 22: {
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
        ((dk) this).field_j = true;
        Object var2 = (Object) (Object) ((dk) this).field_f;
        // monitorenter ((dk) this).field_f
        ((Object) (Object) ((dk) this).field_f).notifyAll();
        // monitorexit var2
        if (param0 != -85) {
            field_k = (String) null;
        }
        try {
            if (false) throw (InterruptedException) null;
            ((dk) this).field_c.join();
        } catch (InterruptedException interruptedException) {
        }
        ((dk) this).field_c = null;
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param2 != -84) {
          L0: {
            field_a = (String) null;
            if (0 == (param0 & 34)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == (param0 & 34)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final os a(byte param0, bl param1, int param2) {
        os var4 = null;
        bl var5 = null;
        var4 = new os();
        if (param0 != 95) {
          var5 = (bl) null;
          os discarded$2 = ((dk) this).a((byte) -41, (bl) null, 82);
          var4.field_v = 3;
          var4.field_q = false;
          var4.field_i = (long)param2;
          var4.field_x = param1;
          this.a((byte) -76, var4);
          return var4;
        } else {
          var4.field_v = 3;
          var4.field_q = false;
          var4.field_i = (long)param2;
          var4.field_x = param1;
          this.a((byte) -76, var4);
          return var4;
        }
    }

    dk(rk param0) {
        ((dk) this).field_f = new er();
        ((dk) this).field_j = false;
        ((dk) this).field_d = 0;
        en var2 = param0.a(5, 1048576, (Runnable) this);
        while (((en) var2).field_a == 0) {
            wf.a(10L, false);
        }
        if (((en) var2).field_a == 2) {
            throw new RuntimeException();
        }
        ((dk) this).field_c = (Thread) ((en) var2).field_f;
    }

    private final void a(byte param0, os param1) {
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3_ref = (Object) (Object) ((dk) this).field_f;
                    // monitorenter ((dk) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((dk) this).field_f.a(2, (wt) (Object) param1);
                        ((dk) this).field_d = ((dk) this).field_d + 1;
                        if (param0 <= -55) {
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
                        ((Object) (Object) ((dk) this).field_f).notifyAll();
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Fullscreen";
        field_a = "to keep fullscreen or";
        field_k = "Name is available";
        field_i = "Email address is unavailable";
        field_g = new int[8192];
        field_h = new dq();
    }
}
