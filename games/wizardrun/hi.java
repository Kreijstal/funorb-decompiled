/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.awt.Canvas;

final class hi implements Runnable {
    private int field_b;
    private jh field_e;
    private byte[] field_i;
    private boolean field_g;
    private java.net.Socket field_o;
    static int field_c;
    private int field_n;
    private OutputStream field_h;
    static boolean[] field_p;
    private InputStream field_m;
    private boolean field_f;
    private int field_d;
    private vh field_j;
    static rc field_l;
    static long field_k;
    static int field_a;

    final int a(byte param0) throws IOException {
        if (param0 != 19) {
            return 111;
        }
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.read();
    }

    hi(java.net.Socket param0, vh param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = wizardrun.field_H;
                    if (!((hi) this).field_g) {
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
                    if (!((hi) this).field_f) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hi) this).field_f = false;
                    throw new IOException();
                }
                case 4: {
                    if (null != ((hi) this).field_i) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((hi) this).field_i = new byte[((hi) this).field_n];
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param2 == 1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((hi) this).b((byte) 47);
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var5 = this;
                    // monitorenter this
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var6 = 0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param0 <= var6) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((hi) this).field_i[((hi) this).field_b] = param1[var6 + param3];
                        ((hi) this).field_b = (1 + ((hi) this).field_b) % ((hi) this).field_n;
                        if (((hi) this).field_b == (-100 + (((hi) this).field_n + ((hi) this).field_d)) % ((hi) this).field_n) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var6++;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (null == ((hi) this).field_e) {
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
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((hi) this).field_e = ((hi) this).field_j.a((byte) -118, (Runnable) this, 3);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0) throws IOException {
        if (((hi) this).field_g) {
          return;
        } else {
          if (param0 == 0) {
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            ((hi) this).field_e = null;
            if (((hi) this).field_f) {
              ((hi) this).field_f = false;
              throw new IOException();
            } else {
              return;
            }
          }
        }
    }

    final static java.awt.Canvas d(byte param0) {
        Object stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        ui stackOut_7_0 = null;
        java.awt.Canvas stackOut_6_0 = null;
        ui stackOut_3_0 = null;
        java.awt.Canvas stackOut_2_0 = null;
        if (param0 <= 66) {
          L0: {
            field_c = 115;
            if (null != ki.field_E) {
              stackOut_7_0 = ki.field_E;
              stackIn_8_0 = (Object) (Object) stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = wizardrun.field_G;
              stackIn_8_0 = (Object) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != ki.field_E) {
              stackOut_3_0 = ki.field_E;
              stackIn_4_0 = (Object) (Object) stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = wizardrun.field_G;
              stackIn_4_0 = (Object) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (java.awt.Canvas) (Object) stackIn_4_0;
        }
    }

    final void b(byte param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = wizardrun.field_H;
                    if (((hi) this).field_g) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    var2 = this;
                    // monitorenter this
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        if (param0 == 76) {
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
                        java.awt.Canvas discarded$2 = hi.d((byte) 8);
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
                        ((hi) this).field_g = true;
                        this.notifyAll();
                        // monitorexit var2
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
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var3;
                }
                case 10: {
                    if (null == ((hi) this).field_e) {
                        statePc = 18;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (-1 != (((hi) this).field_e.field_a ^ -1)) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    tg.a(1L, false);
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    if (1 == ((hi) this).field_e.field_a) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((hi) this).field_e = null;
                    return;
                }
                case 15: {
                    try {
                        ((Thread) ((hi) this).field_e.field_e).join();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((hi) this).field_e = null;
                    return;
                }
                case 17: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    ((hi) this).field_e = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 89) {
            ((hi) this).field_g = true;
            if (!(!((hi) this).field_g)) {
                return 0;
            }
            return ((hi) this).field_m.available();
        }
        if (!(!((hi) this).field_g)) {
            return 0;
        }
        return ((hi) this).field_m.available();
    }

    protected final void finalize() {
        ((hi) this).b((byte) 76);
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        var5 = -119 % ((-63 - param1) / 40);
        if (!((hi) this).field_g) {
          L0: while (true) {
            if ((param2 ^ -1) < -1) {
              var6 = ((hi) this).field_m.read(param0, param3, param2);
              if (var6 <= 0) {
                throw new EOFException();
              } else {
                param2 = param2 - var6;
                param3 = param3 + var6;
                continue L0;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 != -30534) {
            field_k = 39L;
            field_l = null;
            field_p = null;
            return;
        }
        field_l = null;
        field_p = null;
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
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
                        var6 = wizardrun.field_H;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((hi) this).field_b != ((hi) this).field_d) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((hi) this).field_g) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (((hi) this).field_d > ((hi) this).field_b) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((hi) this).field_b - ((hi) this).field_d;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = -((hi) this).field_d + ((hi) this).field_n;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = ((hi) this).field_d;
                            if (var1_int <= 0) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((hi) this).field_h.write(((hi) this).field_i, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((hi) this).field_f = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((hi) this).field_d = (((hi) this).field_d - -var1_int) % ((hi) this).field_n;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((hi) this).field_b == ((hi) this).field_d) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 18 : 29);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 29);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((hi) this).field_h.flush();
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((hi) this).field_f = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (((hi) this).field_m == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((hi) this).field_m.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == ((hi) this).field_h) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((hi) this).field_h.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null == ((hi) this).field_o) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((hi) this).field_o.close();
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 26 : 29);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((hi) this).field_i = null;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        rg.a((Throwable) (Object) var1_ref, (String) null, -562);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
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

    private hi(java.net.Socket param0, vh param1, int param2) throws IOException {
        ((hi) this).field_g = false;
        ((hi) this).field_b = 0;
        ((hi) this).field_f = false;
        ((hi) this).field_d = 0;
        ((hi) this).field_j = param1;
        ((hi) this).field_o = param0;
        ((hi) this).field_o.setSoTimeout(30000);
        ((hi) this).field_o.setTcpNoDelay(true);
        ((hi) this).field_m = ((hi) this).field_o.getInputStream();
        ((hi) this).field_h = ((hi) this).field_o.getOutputStream();
        ((hi) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[112];
        field_l = new rc();
        field_a = -480;
    }
}
