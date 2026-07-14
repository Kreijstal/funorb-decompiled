/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class td implements Runnable {
    private OutputStream field_d;
    static long[][] field_f;
    private InputStream field_n;
    private od field_q;
    private int field_r;
    private boolean field_a;
    static int field_i;
    private boolean field_l;
    private int field_b;
    static long[] field_c;
    private ce field_p;
    private byte[] field_h;
    private int field_e;
    static dd field_m;
    static ke field_g;
    static w field_k;
    static wk field_j;
    private java.net.Socket field_o;

    final static int a(boolean param0) {
        if (!param0) {
            return -33;
        }
        return lg.field_d;
    }

    final void c(int param0) throws IOException {
        if (param0 != 0) {
            ((td) this).finalize();
        }
        if (!(!((td) this).field_l)) {
            return;
        }
        if (!(!((td) this).field_a)) {
            ((td) this).field_a = false;
            throw new IOException();
        }
    }

    final static void b(int param0) {
        int var2 = 0;
        ql var3 = null;
        L0: {
          L1: {
            L2: {
              var2 = fleas.field_A ? 1 : 0;
              tj.field_a = tj.field_a + 1;
              if (wc.field_q <= 0) {
                break L2;
              } else {
                if (!qh.c((byte) 68)) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (fleas.field_E != 0) {
              break L1;
            } else {
              if (tj.field_a > -16) {
                break L1;
              } else {
                oa.a(9, true, 15);
                break L0;
              }
            }
          }
          if (ia.field_m[fleas.field_E].length <= tj.field_a) {
            L3: {
              if (hj.field_a[1] != -1 + pl.field_l[1]) {
                break L3;
              } else {
                if (hj.field_a[0] != -1 + pl.field_l[0]) {
                  break L3;
                } else {
                  hg.a(-25389, 3, 252, tj.field_a);
                  break L3;
                }
              }
            }
            L4: {
              L5: {
                if (pl.field_l[1] - 1 == hj.field_a[1]) {
                  break L5;
                } else {
                  if (hj.field_a[0] == -1 + pl.field_l[0]) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              if (tg.field_g) {
                hg.a(-25389, 15, 240, tj.field_a);
                break L4;
              } else {
                break L4;
              }
            }
            oa.a(9, true, 37);
            break L0;
          } else {
            L6: {
              bc.field_V = -1;
              if (-1 >= em.field_b) {
                break L6;
              } else {
                wi.field_p.a(-119, em.field_b);
                wi.field_p.a(false);
                em.field_b = 0;
                break L6;
              }
            }
            L7: {
              if (-13 != (tj.field_a ^ -1)) {
                break L7;
              } else {
                if (fleas.field_E != 0) {
                  break L7;
                } else {
                  if (!c.field_U) {
                    hg.a(-25389, 10, 245, tj.field_a);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            if (tj.field_a >= ia.field_m[fleas.field_E].length) {
              oa.a(9, true, 41);
              break L0;
            } else {
              hj.field_a[fleas.field_E] = Math.max(tj.field_a, hj.field_a[fleas.field_E]);
              var3 = new ql(fleas.field_E, -1 + hj.field_a[fleas.field_E], 0, 0, 0, 0);
              if (!qh.c((byte) 38)) {
                rd.a(var3, 79, 5);
                ej.a((byte) -39);
                break L0;
              } else {
                mi.field_r.a(false, (lh) (Object) var3);
                ej.a((byte) -39);
                break L0;
              }
            }
          }
        }
        L8: {
          if (param0 > 8) {
            break L8;
          } else {
            field_m = null;
            break L8;
          }
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = null;
        field_g = null;
        field_k = null;
        field_c = null;
        field_m = null;
        if (param0 != 123167272) {
            field_f = null;
        }
    }

    final static void g(int param0) {
        cg.a((byte) -105, param0);
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((td) this).field_e == ((td) this).field_b) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((td) this).field_l) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.wait();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((td) this).field_e <= ((td) this).field_b) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((td) this).field_r - ((td) this).field_e;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = -((td) this).field_e + ((td) this).field_b;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((td) this).field_e;
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((td) this).field_d.write(((td) this).field_h, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 32);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((td) this).field_a = true;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((td) this).field_e = (var1_int + ((td) this).field_e) % ((td) this).field_r;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((td) this).field_e == ((td) this).field_b) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 20 : 32);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 20 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((td) this).field_d.flush();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 20 : 32);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((td) this).field_a = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == ((td) this).field_n) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((td) this).field_n.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null != ((td) this).field_d) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((td) this).field_d.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (null == ((td) this).field_o) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((td) this).field_o.close();
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            ((td) this).field_h = null;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        ud.a((String) null, (Throwable) (Object) var1_ref, 0);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
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

    final void h(int param0) {
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (((td) this).field_l) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((td) this).field_l = true;
        this.notifyAll();
        // monitorexit var2
        if (param0 != 0) {
            return;
        }
        if (!(null == ((td) this).field_q)) {
            while (((td) this).field_q.field_b == 0) {
                vh.a(1L, param0 + 104);
            }
            if (!(1 != ((td) this).field_q.field_b)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((td) this).field_q.field_e).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((td) this).field_q = null;
    }

    final static boolean d(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 < -79) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (!vc.field_b) {
                break L3;
              } else {
                if (mf.field_a == null) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (!qh.c((byte) 33)) {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              break L2;
            }
          }
          stackOut_7_0 = 1;
          stackIn_9_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_9_0 != 0;
    }

    protected final void finalize() {
        ((td) this).h(0);
    }

    final static void a(byte param0, ni param1) {
        rf.field_l = param1.d((byte) 72) << 324436709;
        int var2 = param1.e(false);
        rf.field_l = rf.field_l + (var2 >> -1982762621);
        wd.field_c = var2 << -976228430 & 1835008;
        wd.field_c = wd.field_c + (param1.d((byte) -112) << -1786963710);
        var2 = param1.e(false);
        wd.field_c = wd.field_c + (var2 >> -753536666);
        dk.field_B = 2064384 & var2 << -1150991121;
        dk.field_B = dk.field_B + (param1.e(false) << -1115925337);
        var2 = param1.e(false);
        w.field_a = var2 << -1678141744 & 65536;
        dk.field_B = dk.field_B + (var2 >> -526079167);
        w.field_a = w.field_a + param1.d((byte) -88);
        if (param0 != -107) {
            td.b(13);
        }
    }

    td(java.net.Socket param0, ce param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = fleas.field_A ? 1 : 0;
                    if (param0 <= -85) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (!((td) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    return;
                }
                case 4: {
                    if (!((td) this).field_a) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((td) this).field_a = false;
                    throw new IOException();
                }
                case 6: {
                    if (((td) this).field_h == null) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((td) this).field_h = new byte[((td) this).field_r];
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var5 = this;
                    // monitorenter this
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var6 >= param1) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((td) this).field_h[((td) this).field_b] = param3[param2 + var6];
                        ((td) this).field_b = (1 + ((td) this).field_b) % ((td) this).field_r;
                        if ((-100 + ((td) this).field_r + ((td) this).field_e) % ((td) this).field_r != ((td) this).field_b) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null != ((td) this).field_q) {
                            statePc = 17;
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
                        ((td) this).field_q = ((td) this).field_p.a(4532, (Runnable) this, 3);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int f(int param0) throws IOException {
        if (!(!((td) this).field_l)) {
            return 0;
        }
        if (param0 != 1605772320) {
            ((td) this).field_a = false;
        }
        return ((td) this).field_n.read();
    }

    final void a(int param0, byte[] param1, int param2, boolean param3) throws IOException {
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        if (((td) this).field_l) {
            return;
        }
        if (param3) {
            field_c = null;
        }
        while ((param0 ^ -1) < -1) {
            var5 = ((td) this).field_n.read(param1, param2, param0);
            if (!((var5 ^ -1) < -1)) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param2 = param2 + var5;
        }
    }

    final static void a(int param0, int param1) {
        int var3 = fleas.field_A ? 1 : 0;
        ql var4 = (ql) (Object) sd.field_d.c((byte) 47);
        while (var4 != null) {
            qb.a(param0, (byte) 90, var4);
            var4 = (ql) (Object) sd.field_d.b((byte) -105);
        }
        fi var2 = (fi) (Object) lk.field_O.c((byte) 47);
        if (param1 != -1115925337) {
            td.g(-22);
        }
        while (var2 != null) {
            rd.a(param0, var2, (byte) -118);
            var2 = (fi) (Object) lk.field_O.b((byte) -105);
        }
    }

    final int e(int param0) throws IOException {
        if (((td) this).field_l) {
            return 0;
        }
        int var2 = 49 % ((param0 - -57) / 48);
        return ((td) this).field_n.available();
    }

    private td(java.net.Socket param0, ce param1, int param2) throws IOException {
        ((td) this).field_b = 0;
        ((td) this).field_e = 0;
        ((td) this).field_l = false;
        ((td) this).field_a = false;
        ((td) this).field_o = param0;
        ((td) this).field_p = param1;
        ((td) this).field_o.setSoTimeout(30000);
        ((td) this).field_o.setTcpNoDelay(true);
        ((td) this).field_n = ((td) this).field_o.getInputStream();
        ((td) this).field_d = ((td) this).field_o.getOutputStream();
        ((td) this).field_r = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_f = new long[8][256];
        field_c = new long[11];
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -257) {
            field_c[0] = 0L;
            var15 = 1;
            var0 = var15;
            L1: while (true) {
              if (-11 > (var15 ^ -1)) {
              } else {
                var1 = -8 + var15 * 8;
                field_c[var15] = ik.a(re.a(field_f[7][var1 + 7], 255L), ik.a(re.a(65280L, field_f[6][var1 + 6]), ik.a(ik.a(ik.a(re.a(field_f[3][var1 - -3], 1095216660480L), ik.a(ik.a(re.a(-72057594037927936L, field_f[0][var1]), re.a(71776119061217280L, field_f[1][var1 - -1])), re.a(field_f[2][2 + var1], 280375465082880L))), re.a(field_f[4][4 + var1], 4278190080L)), re.a(field_f[5][var1 - -5], 16711680L))));
                var15++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> -717312504);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(var1 & 255);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << 1934584129;
              if ((var4 ^ -1L) <= -257L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << 1978889857;
              if (256L > var6) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << 344694401;
              if (256L <= var10) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var2 ^ var10;
            field_f[0][var0] = cd.a(cd.a(var4 << -750757048, cd.a(cd.a(var10 << -286779944, cd.a(var2 << 1605772320, cd.a(var6 << 123167272, cd.a(var2 << 743919288, var2 << -368416976)))), var8 << -640463792)), var12);
            var14 = 1;
            L6: while (true) {
              if ((var14 ^ -1) <= -9) {
                var0++;
                continue L0;
              } else {
                field_f[var14][var0] = cd.a(field_f[-1 + var14][var0] >>> -1233610744, field_f[-1 + var14][var0] << 1052021880);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
