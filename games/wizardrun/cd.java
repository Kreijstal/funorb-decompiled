/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cd implements Runnable {
    static int field_c;
    static String field_a;
    static String field_h;
    static int field_e;
    static String field_d;
    private th field_f;
    private Thread field_i;
    private boolean field_g;
    int field_b;

    final static void a(int param0, va param1, int param2, int param3, int param4) {
        param1.b((byte) 11, 12);
        if (param2 != 20443) {
          return;
        } else {
          param1.b(-1947079288, 17);
          param1.b(-1947079288, param4);
          param1.b(-1947079288, param3);
          param1.b((byte) 11, param0);
          return;
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        wl.a("", param0, (byte) -98);
        ga.a(param0, (byte) -72);
        if (param1 != -113) {
            Object var3 = null;
            cd.a(-24, (va) null, 100, -92, -33);
        }
    }

    final void a(byte param0) {
        if (param0 <= 58) {
            return;
        }
        ((cd) this).field_g = true;
        Object var2 = (Object) (Object) ((cd) this).field_f;
        // monitorenter ((cd) this).field_f
        ((Object) (Object) ((cd) this).field_f).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((cd) this).field_i.join();
        } catch (InterruptedException interruptedException) {
        }
        ((cd) this).field_i = null;
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            Object var2 = null;
            va var3 = null;
            int stackIn_15_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 == -18067) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var2 = null;
                        rb[] discarded$2 = cd.a(true, (vh) null);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-5 < ii.field_f.field_k) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if (-1 == ii.field_f.field_n) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 3;
                    }
                    case 6: {
                        if (1 != ii.field_f.field_n) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        return 4;
                    }
                    case 8: {
                        return 1;
                    }
                    case 10: {
                        try {
                            if (wc.field_k != 0) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            hb.field_k = vk.field_p.a(aa.field_hb, nf.field_b, (byte) -20);
                            wc.field_k = wc.field_k + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (1 != wc.field_k) {
                                statePc = 19;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (hb.field_k.field_a != -3) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = mh.a((byte) -121, -1);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (-2 == hb.field_k.field_a) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            wc.field_k = wc.field_k + 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((wc.field_k ^ -1) != -3) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            si.field_q = new hi((java.net.Socket) hb.field_k.field_e, vk.field_p);
                            var3 = new va(13);
                            cd.a(ej.field_d, var3, 20443, fg.field_c, he.field_q);
                            var3.b((byte) 11, 15);
                            var3.f(pg.field_j, 613003928);
                            si.field_q.a(13, var3.field_k, 1, 0);
                            wc.field_k = wc.field_k + 1;
                            la.field_g = d.a((byte) 109) + 30000L;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-4 == (wc.field_k ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (si.field_q.c((byte) 89) < -1) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (la.field_g >= d.a((byte) 127)) {
                                statePc = 31;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = mh.a((byte) 122, -2);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            var1_int = si.field_q.a((byte) 19);
                            if (-1 == var1_int) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = mh.a((byte) 85, var1_int);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            wc.field_k = wc.field_k + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (wc.field_k == 4) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            ii.field_f.a(gi.field_b, (Object) (Object) si.field_q, param0 ^ -18153);
                            wc.field_k = 0;
                            hb.field_k = null;
                            si.field_q = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return mh.a((byte) 87, -3);
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

    final static rb[] a(boolean param0, vh param1) {
        int[] var3 = null;
        rb[] var4 = null;
        int var5 = 0;
        rb var6 = null;
        int var7 = 0;
        jh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        long stackIn_6_0 = 0L;
        long stackIn_7_0 = 0L;
        long stackIn_8_0 = 0L;
        int stackIn_8_1 = 0;
        long stackOut_5_0 = 0L;
        long stackOut_7_0 = 0L;
        int stackOut_7_1 = 0;
        long stackOut_6_0 = 0L;
        int stackOut_6_1 = 0;
        var7 = wizardrun.field_H;
        if (!param1.a(169978736)) {
          return new rb[]{};
        } else {
          var8 = param1.a(false);
          L0: while (true) {
            if (var8.field_a != 0) {
              if (var8.field_a != 2) {
                var12 = (int[]) var8.field_e;
                var11 = var12;
                var10 = var11;
                var9 = var10;
                var3 = var9;
                var4 = new rb[var12.length >> -1849711422];
                if (!param0) {
                  field_d = null;
                  var5 = 0;
                  L1: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new rb();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1263765886];
                      var6.field_h = var3[1 + (var5 << 1927111682)];
                      var6.field_c = var3[(var5 << 1196843522) + 2];
                      var6.field_f = var3[(var5 << -280611070) - -3];
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (var4.length <= var5) {
                      return var4;
                    } else {
                      var6 = new rb();
                      var4[var5] = var6;
                      var6.field_g = var3[var5 << -1263765886];
                      var6.field_h = var3[1 + (var5 << 1927111682)];
                      var6.field_c = var3[(var5 << 1196843522) + 2];
                      var6.field_f = var3[(var5 << -280611070) - -3];
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                return new rb[]{};
              }
            } else {
              L3: {
                stackOut_5_0 = 10L;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (param0) {
                  stackOut_7_0 = stackIn_7_0;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L3;
                } else {
                  stackOut_6_0 = stackIn_6_0;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L3;
                }
              }
              tg.a(stackIn_8_0, stackIn_8_1 != 0);
              continue L0;
            }
          }
        }
    }

    final sk a(byte param0, int param1, sg param2) {
        sk var4 = null;
        if (param0 != -46) {
          return null;
        } else {
          var4 = new sk();
          var4.field_w = param2;
          var4.field_o = (long)param1;
          var4.field_x = 3;
          var4.field_r = false;
          this.a(var4, -1);
          return var4;
        }
    }

    final sk a(byte param0, sg param1, byte[] param2, int param3) {
        sk var5 = new sk();
        var5.field_o = (long)param3;
        var5.field_x = 2;
        var5.field_w = param1;
        var5.field_A = param2;
        int var6 = -115 % ((param0 - -68) / 43);
        var5.field_r = false;
        this.a(var5, -1);
        return var5;
    }

    final sk a(int param0, int param1, sg param2) {
        sk var4 = null;
        Object var5 = null;
        sk var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        sk stackIn_8_0 = null;
        sk stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = wizardrun.field_H;
                    var4 = new sk();
                    var4.field_x = 1;
                    var5 = (Object) (Object) ((cd) this).field_f;
                    // monitorenter ((cd) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (sk) (Object) ((cd) this).field_f.a(param1 ^ param1);
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
                        if ((var6.field_o ^ -1L) != ((long)param0 ^ -1L)) {
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
                        if (var6.field_w != param2) {
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
                        if (2 == var6.field_x) {
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
                        var4.field_s = false;
                        var4.field_A = var6.field_A;
                        // monitorexit var5
                        stackOut_7_0 = (sk) var4;
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
                        var6 = (sk) (Object) ((cd) this).field_f.d(123);
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
                        var7 = caughtException;
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
                    throw (RuntimeException) (Object) var7;
                }
                case 14: {
                    var4.field_A = param2.a(true, param0);
                    var4.field_s = false;
                    var4.field_r = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(sk param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((cd) this).field_f;
                    // monitorenter ((cd) this).field_f
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((cd) this).field_f.a((rk) (Object) param0, 14);
                        ((cd) this).field_b = ((cd) this).field_b + 1;
                        ((Object) (Object) ((cd) this).field_f).notifyAll();
                        if (param1 == -1) {
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
                        sk discarded$3 = ((cd) this).a(80, 53, (sg) null);
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

    public static void a(boolean param0) {
        if (param0) {
            field_c = 7;
            field_h = null;
            field_d = null;
            field_a = null;
            return;
        }
        field_h = null;
        field_d = null;
        field_a = null;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            sk var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = wizardrun.field_H;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((cd) this).field_g) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((cd) this).field_f;
                        // monitorenter ((cd) this).field_f
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (sk) (Object) ((cd) this).field_f.b(46);
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
                            ((cd) this).field_b = ((cd) this).field_b - 1;
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
                            ((Object) (Object) ((cd) this).field_f).wait();
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
                            if (var7.field_x == 2) {
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
                            if (3 == var7.field_x) {
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
                            var7.field_s = false;
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
                            var7.field_A = var7.field_w.a(true, (int)var7.field_o);
                            var7.field_s = false;
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
                            boolean discarded$1 = var7.field_w.a(var7.field_A, (int)var7.field_o, 0, var7.field_A.length);
                            var7.field_s = false;
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
                        rg.a((Throwable) (Object) var2_ref, (String) null, -562);
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

    cd(vh param0) {
        ((cd) this).field_f = new th();
        ((cd) this).field_g = false;
        ((cd) this).field_b = 0;
        jh var2 = param0.a((byte) -98, (Runnable) this, 5);
        while (var2.field_a == 0) {
            tg.a(10L, false);
        }
        if (-3 == (var2.field_a ^ -1)) {
            throw new RuntimeException();
        }
        ((cd) this).field_i = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_d = "Log in / Create account";
        field_h = "You get extra lives for collecting points.";
    }
}
