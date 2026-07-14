/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc implements Runnable {
    static long field_a;
    static kg field_j;
    static nf[] field_e;
    static boolean field_d;
    static boolean field_f;
    private wd field_i;
    static int field_h;
    static String field_k;
    private boolean field_g;
    int field_b;
    private Thread field_c;

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            sm var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Confined.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((pc) this).field_g) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((pc) this).field_i;
                        // monitorenter ((pc) this).field_i
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (sm) (Object) ((pc) this).field_i.c(false);
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
                            ((Object) (Object) ((pc) this).field_i).wait();
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
                            ((pc) this).field_b = ((pc) this).field_b - 1;
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
                            if (var7.field_z == 2) {
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
                            if (-4 == (var7.field_z ^ -1)) {
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
                            var7.field_C = var7.field_B.a(4, (int)var7.field_r);
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
                            boolean discarded$1 = var7.field_B.a(-1, var7.field_C.length, var7.field_C, (int)var7.field_r);
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
                        mb.a((String) null, true, (Throwable) (Object) var2_ref);
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

    final static byte[] a(byte[] param0, byte param1, hb param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Confined.field_J ? 1 : 0;
          var4 = param2.g(param3, 0);
          if (param1 == -126) {
            break L0;
          } else {
            pc.b((byte) 7);
            break L0;
          }
        }
        if (var4 != 0) {
          L1: {
            L2: {
              if (param0 == null) {
                break L2;
              } else {
                if (var4 != param0.length) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            param0 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param2.g(3, param1 + 126);
            var6 = (byte)param2.g(8, 0);
            if (-1 > (var5 ^ -1)) {
              var7 = 0;
              L4: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)(var6 + param2.g(var5, 0));
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var4 <= var7) {
                  break L3;
                } else {
                  param0[var7] = (byte)var6;
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param0;
        } else {
          return null;
        }
    }

    final void a(byte param0) {
        if (param0 > -97) {
            return;
        }
        ((pc) this).field_g = true;
        Object var2 = (Object) (Object) ((pc) this).field_i;
        // monitorenter ((pc) this).field_i
        ((Object) (Object) ((pc) this).field_i).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((pc) this).field_c.join();
        } catch (InterruptedException interruptedException) {
        }
        ((pc) this).field_c = null;
    }

    private final void a(sm param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((pc) this).field_i;
                    // monitorenter ((pc) this).field_i
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((pc) this).field_i.a((jl) (Object) param0, (byte) 115);
                        ((pc) this).field_b = ((pc) this).field_b + 1;
                        ((Object) (Object) ((pc) this).field_i).notifyAll();
                        if (param1 >= 53) {
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
                        ((pc) this).field_c = null;
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

    public static void b(byte param0) {
        field_j = null;
        field_k = null;
        field_e = null;
        if (param0 >= -108) {
            field_k = null;
        }
    }

    final sm a(int param0, ae param1, byte param2) {
        sm var4 = null;
        Object var5 = null;
        sm var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        sm stackIn_9_0 = null;
        sm stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Confined.field_J ? 1 : 0;
                    var4 = new sm();
                    var4.field_z = 1;
                    if (param2 == 53) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((pc) this).field_c = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var5 = (Object) (Object) ((pc) this).field_i;
                    // monitorenter ((pc) this).field_i
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (sm) (Object) ((pc) this).field_i.d(62);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 11;
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
                        if ((var6.field_r ^ -1L) != ((long)param0 ^ -1L)) {
                            statePc = 10;
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
                        if (param1 != var6.field_B) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3 != (var6.field_z ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4.field_C = var6.field_C;
                        var4.field_v = false;
                        // monitorexit var5
                        stackOut_8_0 = (sm) var4;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        var6 = (sm) (Object) ((pc) this).field_i.a((byte) -30);
                        statePc = 4;
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
                    var4.field_C = param1.a(param2 ^ 49, param0);
                    var4.field_t = true;
                    var4.field_v = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final sm a(ae param0, int param1, int param2) {
        sm var4 = new sm();
        var4.field_t = false;
        var4.field_z = 3;
        var4.field_B = param0;
        var4.field_r = (long)param2;
        if (param1 != 0) {
            return null;
        }
        this.a(var4, 81);
        return var4;
    }

    final static int a(int param0, qn param1, int param2, bj param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Confined.field_J ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (null == param1.field_q) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (param1.field_w == param3.field_r) {
                  var4 = param3.field_s.length;
                  var5 = param1.field_q[param0].length / var4;
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5) {
                      L2: {
                        if (param2 >= 105) {
                          break L2;
                        } else {
                          field_h = 36;
                          break L2;
                        }
                      }
                      return -1;
                    } else {
                      if ((param3.field_v ^ -1L) == (param1.field_p[param0][var6] ^ -1L)) {
                        if (im.a(param1.field_u[param0][var6], 113)) {
                          var7 = 0;
                          L3: while (true) {
                            if (var7 >= var4) {
                              return var6;
                            } else {
                              if (param1.field_q[param0][var4 * var6 - -var7] == param3.field_s[var7]) {
                                var6 = var6;
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L1;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
          }
        }
        return -1;
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            field_a = -14L;
            break L0;
          }
        }
        L1: {
          L2: {
            if (tl.field_g) {
              break L2;
            } else {
              L3: {
                if (param0) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L3;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L3;
                }
              }
              if (tj.a(stackIn_6_0 == 0)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    final sm a(ae param0, int param1, byte[] param2, int param3) {
        sm var5 = new sm();
        var5.field_r = (long)param3;
        var5.field_z = 2;
        var5.field_C = param2;
        var5.field_B = param0;
        if (param1 >= -96) {
            return null;
        }
        var5.field_t = false;
        this.a(var5, 82);
        return var5;
    }

    pc(df param0) {
        ((pc) this).field_i = new wd();
        ((pc) this).field_b = 0;
        ((pc) this).field_g = false;
        bc var2 = param0.a((byte) 66, (Runnable) this, 5);
        while (var2.field_g == -1) {
            jd.a(1, 10L);
        }
        if (-3 == var2.field_g) {
            throw new RuntimeException();
        }
        ((pc) this).field_c = (Thread) var2.field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_k = "INT";
        field_h = 9;
    }
}
