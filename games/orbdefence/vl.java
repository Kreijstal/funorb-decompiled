/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements Runnable {
    static int[] field_g;
    static int field_d;
    static int field_f;
    private il field_e;
    int field_b;
    private Thread field_c;
    private boolean field_a;

    final uc a(eh param0, int param1, int param2) {
        uc var4 = null;
        Object var5 = null;
        uc var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        uc stackIn_10_0 = null;
        uc stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = OrbDefence.field_D ? 1 : 0;
                    var4 = new uc();
                    var4.field_t = 1;
                    if (param2 < -125) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    vl.b(82);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((vl) this).field_e;
                    // monitorenter ((vl) this).field_e
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (uc) (Object) ((vl) this).field_e.b((byte) 46);
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
                        if ((long)param1 != var6.field_h) {
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
                        if (var6.field_s != param0) {
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
                        if (-3 == (var6.field_t ^ -1)) {
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
                        var4.field_u = var6.field_u;
                        var4.field_l = false;
                        // monitorexit var5
                        stackOut_9_0 = (uc) var4;
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
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (uc) (Object) ((vl) this).field_e.b(0);
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
                    var4.field_u = param0.a(520, param1);
                    var4.field_n = true;
                    var4.field_l = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final uc a(byte param0, eh param1, int param2) {
        uc var4 = new uc();
        var4.field_h = (long)param2;
        var4.field_t = 3;
        var4.field_s = param1;
        var4.field_n = false;
        this.a((byte) 68, var4);
        if (param0 < 79) {
            field_d = -110;
        }
        return var4;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 >= -88) {
            Object var2 = null;
            boolean discarded$0 = vl.a(false, (CharSequence) null, 95);
        }
    }

    final void a(int param0) {
        ((vl) this).field_a = true;
        Object var2 = (Object) (Object) ((vl) this).field_e;
        // monitorenter ((vl) this).field_e
        ((Object) (Object) ((vl) this).field_e).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((vl) this).field_c.join();
        } catch (InterruptedException interruptedException) {
        }
        if (param0 != -31973) {
            ((vl) this).run();
        }
        ((vl) this).field_c = null;
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (param1 == null) {
          return false;
        } else {
          L0: {
            var3 = param1.length();
            if (var3 < 1) {
              break L0;
            } else {
              if (-13 > var3) {
                break L0;
              } else {
                var4 = ua.a(123, param1);
                if (var4 == null) {
                  return false;
                } else {
                  if (-2 <= var4.length()) {
                    if (param2 <= -119) {
                      L1: {
                        if (sk.a(var4.charAt(0), -46)) {
                          break L1;
                        } else {
                          if (!sk.a(var4.charAt(var4.length() - 1), -46)) {
                            var5 = 0;
                            var6 = 0;
                            L2: while (true) {
                              if (var6 >= param1.length()) {
                                L3: {
                                  if ((var5 ^ -1) < -1) {
                                    stackOut_30_0 = 0;
                                    stackIn_31_0 = stackOut_30_0;
                                    break L3;
                                  } else {
                                    stackOut_29_0 = 1;
                                    stackIn_31_0 = stackOut_29_0;
                                    break L3;
                                  }
                                }
                                return stackIn_31_0 != 0;
                              } else {
                                L4: {
                                  var7 = param1.charAt(var6);
                                  if (sk.a((char) var7, -46)) {
                                    var5++;
                                    break L4;
                                  } else {
                                    var5 = 0;
                                    break L4;
                                  }
                                }
                                if ((var5 ^ -1) <= -3) {
                                  if (!param0) {
                                    return false;
                                  } else {
                                    var6++;
                                    continue L2;
                                  }
                                } else {
                                  var6++;
                                  continue L2;
                                }
                              }
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    private final void a(byte param0, uc param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((vl) this).field_e;
                    // monitorenter ((vl) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((vl) this).field_e.a(-74, (o) (Object) param1);
                        ((vl) this).field_b = ((vl) this).field_b + 1;
                        if (param0 == 68) {
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
                        vl.b(58);
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
                        ((Object) (Object) ((vl) this).field_e).notifyAll();
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

    final uc a(int param0, eh param1, byte[] param2, int param3) {
        uc var5 = new uc();
        var5.field_n = false;
        var5.field_t = param3;
        var5.field_u = param2;
        var5.field_s = param1;
        var5.field_h = (long)param0;
        this.a((byte) 68, var5);
        return var5;
    }

    final static void a(int param0, int param1, vg param2) {
        kk.field_X.a(-123, (ca) (Object) param2);
        bk.a(true, param0, param2);
        if (param1 != 10) {
            Object var4 = null;
            vl.a(-76, -35, (vg) null);
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
            uc var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((vl) this).field_a) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((vl) this).field_e;
                        // monitorenter ((vl) this).field_e
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (uc) (Object) ((vl) this).field_e.c(30664);
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
                            ((Object) (Object) ((vl) this).field_e).wait();
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
                            ((vl) this).field_b = ((vl) this).field_b - 1;
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
                            if (-3 != (var7.field_t ^ -1)) {
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
                            boolean discarded$1 = var7.field_s.a(var7.field_u, 255, var7.field_u.length, (int)var7.field_h);
                            var7.field_l = false;
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
                            if (-4 == (var7.field_t ^ -1)) {
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
                            var7.field_l = false;
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
                            var7.field_u = var7.field_s.a(520, (int)var7.field_h);
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
                        var6 = null;
                        pe.a((byte) -13, (Throwable) (Object) var2_ref, (String) null);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_l = false;
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

    vl(be param0) {
        ((vl) this).field_e = new il();
        ((vl) this).field_a = false;
        ((vl) this).field_b = 0;
        eb var2 = param0.a(314572800, 5, (Runnable) this);
        while (-1 == (var2.field_a ^ -1)) {
            hb.a(10L, 127);
        }
        if (2 == var2.field_a) {
            throw new RuntimeException();
        }
        ((vl) this).field_c = (Thread) var2.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
