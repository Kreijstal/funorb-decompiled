/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke implements Runnable {
    private jo field_f;
    static String field_g;
    int field_d;
    static String field_e;
    private boolean field_a;
    static int field_c;
    private Thread field_b;

    final static hl a(byte param0) {
        if (param0 != -95) {
            hl discarded$0 = ke.a((byte) 83);
            return gk.a(21);
        }
        return gk.a(21);
    }

    final fd a(byte param0, sk param1, int param2) {
        fd var4 = null;
        Object var5 = null;
        fd var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int var9 = 0;
        fd stackIn_8_0 = null;
        fd stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = TetraLink.field_J;
                    var4 = new fd();
                    var4.field_L = 1;
                    var5 = (Object) (Object) ((ke) this).field_f;
                    // monitorenter ((ke) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (fd) (Object) ((ke) this).field_f.a((byte) 97);
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
                        if (var6 == null) {
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
                        if ((var6.field_n ^ -1L) != ((long)param2 ^ -1L)) {
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
                        if (var6.field_K != param1) {
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
                        if ((var6.field_L ^ -1) == -3) {
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
                        var4.field_G = var6.field_G;
                        var4.field_v = false;
                        // monitorexit var5
                        stackOut_7_0 = (fd) var4;
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
                        var6 = (fd) (Object) ((ke) this).field_f.a(false);
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
                        var7 = 97 % ((param0 - 27) / 54);
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
                    var4.field_G = param1.a((byte) -30, param2);
                    var4.field_D = true;
                    var4.field_v = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(fd param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((ke) this).field_f;
                    // monitorenter ((ke) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ke) this).field_f.a((gb) (Object) param0, 0);
                        if (param1 <= -49) {
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
                        ke.a(21);
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
                        ((ke) this).field_d = ((ke) this).field_d + 1;
                        ((Object) (Object) ((ke) this).field_f).notifyAll();
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

    final static ud a(String param0, boolean param1) {
        String var2 = null;
        ud var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = TetraLink.field_J;
        if (wb.field_f != null) {
          if (param0 != null) {
            if (param0.length() != 0) {
              var6 = (CharSequence) (Object) param0;
              var2 = cc.a(var6, (byte) 104);
              if (var2 != null) {
                var3 = (ud) (Object) wb.field_f.a((long)var2.hashCode(), 1);
                L0: while (true) {
                  if (var3 == null) {
                    if (!param1) {
                      return null;
                    } else {
                      field_e = null;
                      return null;
                    }
                  } else {
                    var7 = (CharSequence) (Object) var3.field_Mb;
                    var4 = cc.a(var7, (byte) 119);
                    if (var4.equals((Object) (Object) var2)) {
                      return var3;
                    } else {
                      var3 = (ud) (Object) wb.field_f.c(122);
                      continue L0;
                    }
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        if (param0 != 5) {
            field_g = null;
            field_e = null;
            field_g = null;
            return;
        }
        field_e = null;
        field_g = null;
    }

    final fd a(sk param0, int param1, int param2) {
        fd var4 = null;
        if (param2 < 75) {
          return null;
        } else {
          var4 = new fd();
          var4.field_n = (long)param1;
          var4.field_D = false;
          var4.field_K = param0;
          var4.field_L = 3;
          this.a(var4, -122);
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
            fd var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = TetraLink.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((ke) this).field_a) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((ke) this).field_f;
                        // monitorenter ((ke) this).field_f
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (fd) (Object) ((ke) this).field_f.c(-15464);
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
                            ((Object) (Object) ((ke) this).field_f).wait();
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
                            ((ke) this).field_d = ((ke) this).field_d - 1;
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
                            if ((var7.field_L ^ -1) != -3) {
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
                            boolean discarded$1 = var7.field_K.a(var7.field_G, var7.field_G.length, 13061, (int)var7.field_n);
                            var7.field_v = false;
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
                            if (var7.field_L != 3) {
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
                            var7.field_G = var7.field_K.a((byte) -30, (int)var7.field_n);
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
                        fk.a(-103, (Throwable) (Object) var2_ref, (String) null);
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

    final void b(int param0) {
        ((ke) this).field_a = true;
        if (param0 != -23641) {
            return;
        }
        Object var2 = (Object) (Object) ((ke) this).field_f;
        // monitorenter ((ke) this).field_f
        ((Object) (Object) ((ke) this).field_f).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((ke) this).field_b.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ke) this).field_b = null;
    }

    final fd a(int param0, int param1, byte[] param2, sk param3) {
        fd var5 = null;
        var5 = new fd();
        if (param0 > -16) {
          return null;
        } else {
          var5.field_G = param2;
          var5.field_n = (long)param1;
          var5.field_D = false;
          var5.field_K = param3;
          var5.field_L = 2;
          this.a(var5, -82);
          return var5;
        }
    }

    ke(ie param0) {
        ((ke) this).field_f = new jo();
        ((ke) this).field_d = 0;
        ((ke) this).field_a = false;
        vl var2 = param0.a((Runnable) this, 126, 5);
        while (var2.field_d == -1) {
            tb.a(false, 10L);
        }
        if (-3 == var2.field_d) {
            throw new RuntimeException();
        }
        ((ke) this).field_b = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = -1;
    }
}
