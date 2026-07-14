/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj implements Runnable {
    static oe field_a;
    private cd field_e;
    int field_b;
    private Thread field_d;
    private boolean field_c;

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        rh var4_ref_rh = null;
        Object var5 = null;
        int var6 = 0;
        pf var8 = null;
        w var9 = null;
        byte[] var13 = null;
        var6 = Main.field_T;
        if (param0 <= -122) {
          var9 = rd.field_j;
          var2 = var9.f(-128);
          if (var2 == 0) {
            var8 = (pf) ua.field_G.a((byte) 74);
            if (var8 != null) {
              L0: {
                var4 = var9.f(24);
                if (var4 != 0) {
                  var13 = new byte[var4];
                  var9.a(121, var13, 0, var4);
                  break L0;
                } else {
                  var5 = null;
                  break L0;
                }
              }
              ((w) var9).field_i = ((w) var9).field_i + 4;
              if (!var9.e(-1)) {
                mc.a((byte) -125);
                return;
              } else {
                var8.c(96);
                return;
              }
            } else {
              mc.a((byte) -128);
              return;
            }
          } else {
            if ((var2 ^ -1) == -2) {
              var3 = var9.e((byte) 124);
              var4_ref_rh = (rh) de.field_e.a((byte) 74);
              L1: while (true) {
                if (var4_ref_rh == null) {
                  if (var4_ref_rh == null) {
                    mc.a((byte) -128);
                    return;
                  } else {
                    var4_ref_rh.c(122);
                    return;
                  }
                } else {
                  if (((rh) var4_ref_rh).field_i != var3) {
                    var4_ref_rh = (rh) de.field_e.b((byte) -120);
                    continue L1;
                  } else {
                    if (var4_ref_rh == null) {
                      mc.a((byte) -128);
                      return;
                    } else {
                      var4_ref_rh.c(122);
                      return;
                    }
                  }
                }
              }
            } else {
              k.a((Throwable) null, (byte) 41, "A1: " + aj.a((byte) 92));
              mc.a((byte) -126);
              return;
            }
          }
        } else {
          return;
        }
    }

    final ab a(int param0, int param1, hc param2) {
        ab var4 = null;
        var4 = new ab();
        var4.field_o = false;
        var4.field_s = 3;
        var4.field_j = (long)param0;
        var4.field_v = param2;
        this.a(0, var4);
        if (param1 != -3) {
          ((gj) this).field_d = (Thread) null;
          return var4;
        } else {
          return var4;
        }
    }

    final void b(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((gj) this).field_c = true;
                    var2 = (Object) (Object) ((gj) this).field_e;
                    // monitorenter ((gj) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((Object) (Object) ((gj) this).field_e).notifyAll();
                        // monitorexit var2
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
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
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    try {
                        ((gj) this).field_d.join();
                        if (param0 >= 72) {
                            statePc = 9;
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
                        ((gj) this).field_d = (Thread) null;
                        ((gj) this).field_d = null;
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    ((gj) this).field_d = null;
                    return;
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
            String var6 = null;
            ab var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((gj) this).field_c) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((gj) this).field_e;
                        // monitorenter ((gj) this).field_e
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (ab) ((gj) this).field_e.a(30);
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
                            ((gj) this).field_b = ((gj) this).field_b - 1;
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
                            ((Object) (Object) ((gj) this).field_e).wait();
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
                            if (2 != ((ab) var7).field_s) {
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
                            boolean discarded$1 = ((ab) var7).field_v.a(((ab) var7).field_r, 111, ((ab) var7).field_r.length, (int)((ab) var7).field_j);
                            var7.field_n = false;
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
                            if (((ab) var7).field_s != 3) {
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
                            var7.field_r = ((ab) var7).field_v.a((byte) 19, (int)((ab) var7).field_j);
                            var7.field_n = false;
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
                        var6 = (String) null;
                        k.a((Throwable) (Object) var2_ref, (byte) 119, (String) null);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
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

    final ab a(hc param0, byte[] param1, int param2, int param3) {
        ab var5 = null;
        var5 = new ab();
        var5.field_j = (long)param2;
        if (param3 != -23167) {
          ((gj) this).field_e = (cd) null;
          var5.field_r = param1;
          var5.field_v = param0;
          var5.field_s = 2;
          var5.field_o = false;
          this.a(0, var5);
          return var5;
        } else {
          var5.field_r = param1;
          var5.field_v = param0;
          var5.field_s = 2;
          var5.field_o = false;
          this.a(0, var5);
          return var5;
        }
    }

    private final void a(int param0, ab param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((gj) this).field_e;
                    // monitorenter ((gj) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((gj) this).field_e.a((byte) -108, (he) (Object) param1);
                        if (param0 == 0) {
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
                        ((gj) this).field_d = (Thread) null;
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
                        ((gj) this).field_b = ((gj) this).field_b + 1;
                        ((Object) (Object) ((gj) this).field_e).notifyAll();
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

    final ab a(int param0, hc param1, int param2) {
        ab var4 = null;
        Object var5 = null;
        ab var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ab stackIn_7_0 = null;
        ab stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Main.field_T;
                    var4 = new ab();
                    var4.field_s = param0;
                    var5 = (Object) (Object) ((gj) this).field_e;
                    // monitorenter ((gj) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (ab) ((gj) this).field_e.c((byte) -114);
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
                        if ((((ab) var6).field_j ^ -1L) != ((long)param2 ^ -1L)) {
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
                        if (param1 != ((ab) var6).field_v) {
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
                        if (((ab) var6).field_s != 2) {
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
                        var4.field_n = false;
                        var4.field_r = ((ab) var6).field_r;
                        // monitorexit var5
                        stackOut_6_0 = (ab) var4;
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
                    return (ab) (Object) stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (ab) ((gj) this).field_e.b((byte) -122);
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
                    var4.field_r = param1.a((byte) 19, param2);
                    var4.field_o = true;
                    var4.field_n = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        if (param0 != 14) {
            field_a = (oe) null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    gj(le param0) {
        ((gj) this).field_e = new cd();
        ((gj) this).field_b = 0;
        ((gj) this).field_c = false;
        vi var2 = param0.a(0, 5, (Runnable) this);
        while (0 == ((vi) var2).field_a) {
            wk.a((byte) -112, 10L);
        }
        if (-3 == (((vi) var2).field_a ^ -1)) {
            throw new RuntimeException();
        }
        ((gj) this).field_d = (Thread) ((vi) var2).field_e;
    }

    static {
    }
}
