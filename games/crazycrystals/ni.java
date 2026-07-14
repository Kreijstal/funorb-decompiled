/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements Runnable {
    private km field_e;
    static int field_b;
    int field_c;
    private boolean field_d;
    private Thread field_a;

    final mf a(int param0, sp param1, byte[] param2, byte param3) {
        mf var5 = null;
        if (param3 != 116) {
          ((ni) this).run();
          var5 = new mf();
          var5.field_k = (long)param0;
          var5.field_v = 2;
          var5.field_t = param1;
          var5.field_s = param2;
          var5.field_q = false;
          this.a(19, var5);
          return var5;
        } else {
          var5 = new mf();
          var5.field_k = (long)param0;
          var5.field_v = 2;
          var5.field_t = param1;
          var5.field_s = param2;
          var5.field_q = false;
          this.a(19, var5);
          return var5;
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        if (-1L > (param1 ^ -1L)) {
          if (6582952005840035281L > param1) {
            if ((param1 % (long)param0 ^ -1L) == -1L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param1) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = gl.field_a[(int)(-(param1 * 37L) + var7)];
                        if (var9 == 95) {
                          var10 = var6.length() - 1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
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
    }

    final mf a(int param0, int param1, sp param2) {
        mf var4 = null;
        var4 = new mf();
        var4.field_t = param2;
        if (param0 != -4) {
          return null;
        } else {
          var4.field_k = (long)param1;
          var4.field_q = false;
          var4.field_v = 3;
          this.a(param0 ^ -25, var4);
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
            mf var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((ni) this).field_d) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((ni) this).field_e;
                        // monitorenter ((ni) this).field_e
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (mf) (Object) ((ni) this).field_e.d(-4425);
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
                            ((ni) this).field_c = ((ni) this).field_c - 1;
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
                            ((Object) (Object) ((ni) this).field_e).wait();
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
                            if (2 == var7.field_v) {
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
                            if (-4 != (var7.field_v ^ -1)) {
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
                            var7.field_s = var7.field_t.a(false, (int)var7.field_k);
                            var7.field_n = false;
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
                            boolean discarded$1 = var7.field_t.a(var7.field_s.length, var7.field_s, (byte) 101, (int)var7.field_k);
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
                        var6 = null;
                        wp.a((Throwable) (Object) var2_ref, (String) null, 21862);
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

    private final void a(int param0, mf param1) {
        Object var3 = null;
        int var4 = 0;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((ni) this).field_e;
                    // monitorenter ((ni) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ni) this).field_e.a((byte) 98, (ij) (Object) param1);
                        ((ni) this).field_c = ((ni) this).field_c + 1;
                        ((Object) (Object) ((ni) this).field_e).notifyAll();
                        var4 = -48 % ((-37 - param0) / 37);
                        // monitorexit var3
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
                        var5 = caughtException;
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
                    throw (RuntimeException) (Object) var5;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final mf a(boolean param0, int param1, sp param2) {
        mf var4 = null;
        Object var5 = null;
        mf var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        mf stackIn_7_0 = null;
        mf stackIn_14_0 = null;
        sp stackIn_14_1 = null;
        mf stackIn_15_0 = null;
        sp stackIn_15_1 = null;
        mf stackIn_16_0 = null;
        sp stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        mf stackIn_17_0 = null;
        mf stackIn_18_0 = null;
        mf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        mf stackOut_6_0 = null;
        mf stackOut_13_0 = null;
        sp stackOut_13_1 = null;
        mf stackOut_14_0 = null;
        sp stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        mf stackOut_15_0 = null;
        sp stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        mf stackOut_16_0 = null;
        mf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        mf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = CrazyCrystals.field_B;
                    var4 = new mf();
                    var4.field_v = 1;
                    var5 = (Object) (Object) ((ni) this).field_e;
                    // monitorenter ((ni) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (mf) (Object) ((ni) this).field_e.b(126);
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
                        if (var6.field_k != (long)param1) {
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
                        if (var6.field_t != param2) {
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
                        if ((var6.field_v ^ -1) != -3) {
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
                        var4.field_s = var6.field_s;
                        var4.field_n = false;
                        // monitorexit var5
                        stackOut_6_0 = (mf) var4;
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
                        var6 = (mf) (Object) ((ni) this).field_e.a(94);
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
                    stackOut_13_0 = (mf) var4;
                    stackOut_13_1 = (sp) param2;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (param0) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackOut_14_0 = (mf) (Object) stackIn_14_0;
                    stackOut_14_1 = (sp) (Object) stackIn_14_1;
                    stackOut_14_2 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    stackIn_16_2 = stackOut_14_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (mf) (Object) stackIn_15_0;
                    stackOut_15_1 = (sp) (Object) stackIn_15_1;
                    stackOut_15_2 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    stackIn_16_2 = stackOut_15_2;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_16_0.field_s = ((sp) (Object) stackIn_16_1).a(stackIn_16_2 != 0, param1);
                    var4.field_n = false;
                    stackOut_16_0 = (mf) var4;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (!param0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    stackOut_17_0 = (mf) (Object) stackIn_17_0;
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 18: {
                    stackOut_18_0 = (mf) (Object) stackIn_18_0;
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    stackIn_19_0.field_q = stackIn_19_1 != 0;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) {
        ((ni) this).field_d = true;
        Object var2 = (Object) (Object) ((ni) this).field_e;
        // monitorenter ((ni) this).field_e
        if (param0 != -3) {
            ((ni) this).run();
        }
        ((Object) (Object) ((ni) this).field_e).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((ni) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ni) this).field_a = null;
    }

    ni(un param0) {
        ((ni) this).field_e = new km();
        ((ni) this).field_d = false;
        ((ni) this).field_c = 0;
        gb var2 = param0.a((Runnable) this, 2, 5);
        while (-1 == var2.field_a) {
            fh.a(true, 10L);
        }
        if (-3 == var2.field_a) {
            throw new RuntimeException();
        }
        ((ni) this).field_a = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
