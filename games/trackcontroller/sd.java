/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd implements Runnable {
    static int field_b;
    private mb field_f;
    static il field_c;
    private boolean field_g;
    static int[] field_d;
    int field_a;
    private Thread field_e;

    final lh a(boolean param0, int param1, hf param2) {
        lh var4 = new lh();
        var4.field_A = param2;
        var4.field_m = (long)param1;
        var4.field_y = 3;
        if (!param0) {
            Object var5 = null;
            boolean discarded$0 = sd.a((String) null, (byte) -25);
        }
        var4.field_q = false;
        this.a(false, var4);
        return var4;
    }

    final static aj a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int[] param7, int param8) {
        if (!param4) {
            sd.a((byte) 126);
        }
        aj var9 = new aj(param3, param2, param5, param6, param0, param8, param7);
        ub.field_e.a((byte) -114, (fc) (Object) var9);
        we.a(param1, var9, (byte) 125);
        return var9;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            lh var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TrackController.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((sd) this).field_g) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((sd) this).field_f;
                        // monitorenter ((sd) this).field_f
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (lh) (Object) ((sd) this).field_f.a(-58);
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
                            ((sd) this).field_a = ((sd) this).field_a - 1;
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
                            ((Object) (Object) ((sd) this).field_f).wait();
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
                            if (var7.field_y == 2) {
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
                            if (var7.field_y == 3) {
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
                            var7.field_w = false;
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
                            var7.field_z = var7.field_A.a((byte) -95, (int)var7.field_m);
                            var7.field_w = false;
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
                            boolean discarded$1 = var7.field_A.a(-1023648016, (int)var7.field_m, var7.field_z, var7.field_z.length);
                            var7.field_w = false;
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
                        hb.a((Throwable) (Object) var2_ref, 0, (String) null);
                        var7.field_w = false;
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

    final lh a(int param0, byte[] param1, hf param2, byte param3) {
        lh var5 = new lh();
        var5.field_A = param2;
        var5.field_z = param1;
        if (param3 < 75) {
            return null;
        }
        var5.field_q = false;
        var5.field_m = (long)param0;
        var5.field_y = 2;
        this.a(false, var5);
        return var5;
    }

    final void a(int param0) {
        ((sd) this).field_g = true;
        Object var2 = (Object) (Object) ((sd) this).field_f;
        // monitorenter ((sd) this).field_f
        ((Object) (Object) ((sd) this).field_f).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((sd) this).field_e.join();
            int var2_int = -87 / ((-47 - param0) / 50);
        } catch (InterruptedException interruptedException) {
        }
        ((sd) this).field_e = null;
    }

    private final void a(boolean param0, lh param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        mb stackIn_2_0 = null;
        lh stackIn_2_1 = null;
        mb stackIn_3_0 = null;
        lh stackIn_3_1 = null;
        mb stackIn_4_0 = null;
        lh stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        mb stackOut_1_0 = null;
        lh stackOut_1_1 = null;
        mb stackOut_2_0 = null;
        lh stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        mb stackOut_3_0 = null;
        lh stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((sd) this).field_f;
                    // monitorenter ((sd) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackOut_1_0 = ((sd) this).field_f;
                        stackOut_1_1 = (lh) param1;
                        stackIn_3_0 = stackOut_1_0;
                        stackIn_3_1 = stackOut_1_1;
                        stackIn_2_0 = stackOut_1_0;
                        stackIn_2_1 = stackOut_1_1;
                        if (param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackOut_2_0 = (mb) (Object) stackIn_2_0;
                        stackOut_2_1 = (lh) (Object) stackIn_2_1;
                        stackOut_2_2 = 1;
                        stackIn_4_0 = stackOut_2_0;
                        stackIn_4_1 = stackOut_2_1;
                        stackIn_4_2 = stackOut_2_2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (mb) (Object) stackIn_3_0;
                        stackOut_3_1 = (lh) (Object) stackIn_3_1;
                        stackOut_3_2 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        stackIn_4_2 = stackOut_3_2;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((mb) (Object) stackIn_4_0).a((gb) (Object) stackIn_4_1, stackIn_4_2 != 0);
                        ((sd) this).field_a = ((sd) this).field_a + 1;
                        ((Object) (Object) ((sd) this).field_f).notifyAll();
                        if (!param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var5 = null;
                        lh discarded$3 = ((sd) this).a(true, -108, (hf) null);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var3
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var4;
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final lh a(byte param0, int param1, hf param2) {
        lh var4 = null;
        Object var5 = null;
        int var6 = 0;
        lh var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        lh stackIn_8_0 = null;
        lh stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = TrackController.field_F ? 1 : 0;
                    var4 = new lh();
                    var4.field_y = 1;
                    var5 = (Object) (Object) ((sd) this).field_f;
                    // monitorenter ((sd) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = -96 / ((-57 - param0) / 47);
                        var7 = (lh) (Object) ((sd) this).field_f.b(48);
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
                        if (var7.field_m != (long)param1) {
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
                        if (var7.field_A != param2) {
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
                        var4.field_z = var7.field_z;
                        var4.field_w = false;
                        // monitorexit var5
                        stackOut_7_0 = (lh) var4;
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
                        var7 = (lh) (Object) ((sd) this).field_f.a((byte) 77);
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
                        // monitorexit var5
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
                        // monitorexit var5
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
                    var4.field_z = param2.a((byte) -123, param1);
                    var4.field_w = false;
                    var4.field_q = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param1 >= 60) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!rj.a((char) var3, 122)) {
              if (!hd.a(-124, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -76) {
            field_b = -14;
        }
        field_d = null;
        field_c = null;
    }

    sd(uf param0) {
        ((sd) this).field_f = new mb();
        ((sd) this).field_a = 0;
        ((sd) this).field_g = false;
        ce var2 = param0.a(5, (Runnable) this, 94);
        while (-1 == (var2.field_f ^ -1)) {
            wl.a(10L, false);
        }
        if ((var2.field_f ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((sd) this).field_e = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
