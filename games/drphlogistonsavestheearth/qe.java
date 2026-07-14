/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qe implements Runnable {
    private java.net.Socket field_j;
    static m field_e;
    private InputStream field_q;
    private il field_m;
    private int field_f;
    static int field_c;
    static he field_k;
    private boolean field_n;
    private OutputStream field_b;
    private boolean field_i;
    private bl field_h;
    private int field_d;
    private int field_p;
    private byte[] field_o;
    static java.awt.Color field_g;
    static int field_a;
    static int field_l;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((qe) this).field_n) {
          if (param0 != -14) {
            ((qe) this).field_h = null;
            L0: while (true) {
              if (-1 > (param3 ^ -1)) {
                var5 = ((qe) this).field_q.read(param1, param2, param3);
                if (0 < var5) {
                  param2 = param2 + var5;
                  param3 = param3 - var5;
                  continue L0;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            }
          } else {
            L1: while (true) {
              if (-1 > (param3 ^ -1)) {
                var5 = ((qe) this).field_q.read(param1, param2, param3);
                if (0 < var5) {
                  param2 = param2 + var5;
                  param3 = param3 - var5;
                  continue L1;
                } else {
                  throw new EOFException();
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0) throws IOException {
        if (((qe) this).field_n) {
            return;
        }
        if (param0 != -13) {
            field_k = null;
            if (!(!((qe) this).field_i)) {
                ((qe) this).field_i = false;
                throw new IOException();
            }
            return;
        }
        if (!(!((qe) this).field_i)) {
            ((qe) this).field_i = false;
            throw new IOException();
        }
    }

    public static void c(int param0) {
        field_g = null;
        field_e = null;
        field_k = null;
        if (param0 == 0) {
            return;
        }
        qe.c(44);
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
                        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((qe) this).field_f == ((qe) this).field_p) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (!((qe) this).field_n) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 31;
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
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (((qe) this).field_p < ((qe) this).field_f) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = -((qe) this).field_f + ((qe) this).field_p;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((qe) this).field_d + -((qe) this).field_f;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = ((qe) this).field_f;
                            if (0 >= var1_int) {
                                statePc = 1;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((qe) this).field_b.write(((qe) this).field_o, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 31);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((qe) this).field_i = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((qe) this).field_f = (((qe) this).field_f + var1_int) % ((qe) this).field_d;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((qe) this).field_f == ((qe) this).field_p) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 18 : 31);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 31);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((qe) this).field_b.flush();
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 31);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((qe) this).field_i = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (null == ((qe) this).field_q) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((qe) this).field_q.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (((qe) this).field_b != null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((qe) this).field_b.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (((qe) this).field_j != null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((qe) this).field_j.close();
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((qe) this).field_o = null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        gb.a((Throwable) (Object) var1_ref, (String) null, 10);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
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
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    if (!((qe) this).field_n) {
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
                    var2 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((qe) this).field_n = true;
                        this.notifyAll();
                        // monitorexit var2
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
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var3;
                }
                case 7: {
                    if (((qe) this).field_m != null) {
                        statePc = 12;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((qe) this).field_m = null;
                    if (param0 == 50) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((qe) this).run();
                    return;
                }
                case 10: {
                    return;
                }
                case 12: {
                    if (((qe) this).field_m.field_b != 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    kk.a(1L, true);
                    statePc = 12;
                    continue stateLoop;
                }
                case 14: {
                    if ((((qe) this).field_m.field_b ^ -1) != -2) {
                        statePc = 21;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    try {
                        ((Thread) ((qe) this).field_m.field_g).join();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((qe) this).field_m = null;
                    if (param0 == 50) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    ((qe) this).run();
                    return;
                }
                case 18: {
                    return;
                }
                case 20: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    ((qe) this).field_m = null;
                    if (param0 == 50) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    ((qe) this).run();
                    return;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int a(byte param0) throws IOException {
        int var2 = -86 / ((param0 - -63) / 49);
        if (((qe) this).field_n) {
            return 0;
        }
        return ((qe) this).field_q.available();
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                    if (!((qe) this).field_n) {
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
                    if (!((qe) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((qe) this).field_i = false;
                    throw new IOException();
                }
                case 4: {
                    if (((qe) this).field_o != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((qe) this).field_o = new byte[((qe) this).field_d];
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (param1 == -30537) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    var9 = null;
                    qe.a(-98, -28, (nh[]) null, (byte) 55);
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
                        statePc = 19;
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
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((qe) this).field_o[((qe) this).field_p] = param2[param3 + var6];
                        ((qe) this).field_p = (((qe) this).field_p - -1) % ((qe) this).field_d;
                        if (((qe) this).field_p == (-100 + (((qe) this).field_d + ((qe) this).field_f)) % ((qe) this).field_d) {
                            statePc = 13;
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
                        statePc = 14;
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
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (((qe) this).field_m != null) {
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
                        ((qe) this).field_m = ((qe) this).field_h.a((Runnable) this, 3, (byte) -126);
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

    final static void a(int param0, int param1, nh[] param2, byte param3) {
        ia.field_a = new gk(param2);
        if (param3 > -65) {
          qe.c(-58);
          ch.field_B = param1;
          lg.field_i = param0;
          h.a(true);
          return;
        } else {
          ch.field_B = param1;
          lg.field_i = param0;
          h.a(true);
          return;
        }
    }

    qe(java.net.Socket param0, bl param1) throws IOException {
        this(param0, param1, 5000);
    }

    protected final void finalize() {
        ((qe) this).b(50);
    }

    final int a(int param0) throws IOException {
        if (param0 < -119) {
          if (((qe) this).field_n) {
            return 0;
          } else {
            return ((qe) this).field_q.read();
          }
        } else {
          ((qe) this).b(18);
          if (((qe) this).field_n) {
            return 0;
          } else {
            return ((qe) this).field_q.read();
          }
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param2 <= param1) {
            break L0;
          } else {
            var3 = param1;
            param1 = param2;
            param2 = var3;
            break L0;
          }
        }
        if (param0 == 26) {
          L1: while (true) {
            if (0 == param2) {
              return param1;
            } else {
              var3 = param1 % param2;
              param1 = param2;
              param2 = var3;
              continue L1;
            }
          }
        } else {
          qe.c(-113);
          L2: while (true) {
            if (0 == param2) {
              return param1;
            } else {
              var3 = param1 % param2;
              param1 = param2;
              param2 = var3;
              continue L2;
            }
          }
        }
    }

    private qe(java.net.Socket param0, bl param1, int param2) throws IOException {
        ((qe) this).field_f = 0;
        ((qe) this).field_n = false;
        ((qe) this).field_i = false;
        ((qe) this).field_p = 0;
        ((qe) this).field_j = param0;
        ((qe) this).field_h = param1;
        ((qe) this).field_j.setSoTimeout(30000);
        ((qe) this).field_j.setTcpNoDelay(true);
        ((qe) this).field_q = ((qe) this).field_j.getInputStream();
        ((qe) this).field_b = ((qe) this).field_j.getOutputStream();
        ((qe) this).field_d = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 50;
        field_g = new java.awt.Color(10040319);
        field_l = 480;
        field_a = -150;
    }
}
