/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea implements Runnable {
    static int field_d;
    private in field_e;
    static int field_f;
    private Thread field_a;
    private boolean field_c;
    int field_b;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            se var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((ea) this).field_c) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((ea) this).field_e;
                        // monitorenter ((ea) this).field_e
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (se) (Object) ((ea) this).field_e.a(true);
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
                            ((Object) (Object) ((ea) this).field_e).wait();
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
                            ((ea) this).field_b = ((ea) this).field_b - 1;
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
                            if (-3 == (var7.field_v ^ -1)) {
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
                            if (var7.field_v == 3) {
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
                            var7.field_n = false;
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
                            var7.field_t = var7.field_w.a((int)var7.field_h, (byte) -5);
                            var7.field_n = false;
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
                            boolean discarded$1 = var7.field_w.a(var7.field_t.length, var7.field_t, (int)var7.field_h, 0);
                            var7.field_n = false;
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
                        cv.a(1, (String) null, (Throwable) (Object) var2_ref);
                        var7.field_n = false;
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
        ((ea) this).field_c = true;
        Object var2 = (Object) (Object) ((ea) this).field_e;
        // monitorenter ((ea) this).field_e
        ((Object) (Object) ((ea) this).field_e).notifyAll();
        if (param0 > -3) {
            ((ea) this).field_a = null;
        }
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((ea) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ea) this).field_a = null;
    }

    final se a(ta param0, byte param1, int param2) {
        se var4 = null;
        var4 = new se();
        var4.field_v = 3;
        var4.field_w = param0;
        var4.field_h = (long)param2;
        var4.field_q = false;
        this.a(var4, -6778);
        if (param1 > -108) {
          return null;
        } else {
          return var4;
        }
    }

    final static void a(int param0, int param1, byte param2, int[] param3, Object[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        Object var14 = null;
        Object var15 = null;
        Object var16 = null;
        Object var17 = null;
        int stackIn_6_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var13 = BachelorFridge.field_y;
        if (param2 < 9) {
          L0: {
            ((boolean[]) param4[0])[16] = ((boolean[]) ((Object[]) param4[11])[4])[0];
            if (param0 > param1) {
              L1: {
                var5 = (param1 - -param0) / 2;
                var6 = param1;
                var7 = param3[var5];
                param3[var5] = param3[param0];
                param3[param0] = var7;
                var14 = param4[var5];
                param4[var5] = param4[param0];
                param4[param0] = var14;
                if (var7 != 2147483647) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 0;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              L2: {
                var9 = stackIn_19_0;
                var10 = param1;
                if (param0 <= var10) {
                  break L2;
                } else {
                  L3: {
                    if (param3[var10] < var7 - -(var9 & var10)) {
                      var11 = param3[var10];
                      param3[var10] = param3[var6];
                      param3[var6] = var11;
                      var15 = param4[var10];
                      param4[var10] = param4[var6];
                      var6++;
                      param4[var6] = var15;
                      break L3;
                    } else {
                      var10++;
                      break L3;
                    }
                  }
                  var10++;
                  var10++;
                  var10++;
                  break L2;
                }
              }
              param3[param0] = param3[var6];
              param3[var6] = var7;
              param4[param0] = param4[var6];
              param4[var6] = var14;
              ea.a(var6 - 1, param1, (byte) 112, param3, param4);
              ea.a(param0, var6 + 1, (byte) 74, param3, param4);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L4: {
            if (param0 > param1) {
              L5: {
                var5 = (param1 - -param0) / 2;
                var6 = param1;
                var7 = param3[var5];
                param3[var5] = param3[param0];
                param3[param0] = var7;
                var16 = param4[var5];
                param4[var5] = param4[param0];
                param4[param0] = var16;
                if (var7 != 2147483647) {
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  break L5;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_6_0 = stackOut_4_0;
                  break L5;
                }
              }
              var9 = stackIn_6_0;
              var10 = param1;
              L6: while (true) {
                if (param0 <= var10) {
                  param3[param0] = param3[var6];
                  param3[var6] = var7;
                  param4[param0] = param4[var6];
                  param4[var6] = var16;
                  ea.a(var6 - 1, param1, (byte) 112, param3, param4);
                  ea.a(param0, var6 + 1, (byte) 74, param3, param4);
                  break L4;
                } else {
                  if (param3[var10] < var7 - -(var9 & var10)) {
                    var11 = param3[var10];
                    param3[var10] = param3[var6];
                    param3[var6] = var11;
                    var17 = param4[var10];
                    param4[var10] = param4[var6];
                    var6++;
                    param4[var6] = var17;
                    var10++;
                    var10++;
                    continue L6;
                  } else {
                    var10++;
                    var10++;
                    continue L6;
                  }
                }
              }
            } else {
              break L4;
            }
          }
          return;
        }
    }

    private final void a(se param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((ea) this).field_e;
                    // monitorenter ((ea) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -6778) {
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
                        ((ea) this).field_a = null;
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
                        ((ea) this).field_e.a((eo) (Object) param0, (byte) 106);
                        ((ea) this).field_b = ((ea) this).field_b + 1;
                        ((Object) (Object) ((ea) this).field_e).notifyAll();
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

    final se a(int param0, byte param1, ta param2) {
        se var4 = null;
        int var5 = 0;
        Object var6 = null;
        se var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        se stackIn_8_0 = null;
        se stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = BachelorFridge.field_y;
                    var4 = new se();
                    var4.field_v = 1;
                    var5 = -20 / ((param1 - 63) / 40);
                    var6 = (Object) (Object) ((ea) this).field_e;
                    // monitorenter ((ea) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = (se) (Object) ((ea) this).field_e.a(-122);
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
                        if ((long)param0 != var7.field_h) {
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
                        if (param2 != var7.field_w) {
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
                        if (-3 == (var7.field_v ^ -1)) {
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
                        var4.field_t = var7.field_t;
                        var4.field_n = false;
                        // monitorexit var6
                        stackOut_7_0 = (se) var4;
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
                    return (se) (Object) stackIn_8_0;
                }
                case 9: {
                    try {
                        var7 = (se) (Object) ((ea) this).field_e.a((byte) 122);
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
                    var4.field_t = param2.a(param0, (byte) -5);
                    var4.field_q = true;
                    var4.field_n = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final se a(ta param0, byte[] param1, int param2, int param3) {
        se var5 = null;
        var5 = new se();
        var5.field_v = 2;
        var5.field_q = false;
        var5.field_h = (long)param2;
        var5.field_w = param0;
        var5.field_t = param1;
        this.a(var5, -6778);
        if (param3 != 5) {
          field_d = -92;
          return var5;
        } else {
          return var5;
        }
    }

    ea(ht param0) {
        ((ea) this).field_e = new in();
        ((ea) this).field_c = false;
        ((ea) this).field_b = 0;
        eh var2 = param0.a((Runnable) this, 2, 5);
        while (var2.field_f == 0) {
            gda.a(false, 10L);
        }
        if (var2.field_f == 2) {
            throw new RuntimeException();
        }
        ((ea) this).field_a = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 200;
    }
}
