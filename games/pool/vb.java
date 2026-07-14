/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vb implements Runnable {
    private InputStream field_l;
    private int field_i;
    static String field_c;
    static int field_f;
    private java.net.Socket field_n;
    private le field_d;
    private int field_a;
    private boolean field_e;
    static of field_m;
    private int field_k;
    private byte[] field_j;
    private boolean field_h;
    static nb field_b;
    private OutputStream field_g;
    private sj field_o;
    static int[] field_p;

    vb(java.net.Socket param0, sj param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        if (!((vb) this).field_h) {
          L0: while (true) {
            if (0 >= param0) {
              if (param1 == 0) {
                return;
              } else {
                ((vb) this).field_n = null;
                return;
              }
            } else {
              var5 = ((vb) this).field_l.read(param3, param2, param0);
              if (0 >= var5) {
                throw new EOFException();
              } else {
                param0 = param0 - var5;
                param2 = param2 + var5;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_p = null;
        field_m = null;
        field_b = null;
        if (param0) {
            return;
        }
        field_f = 57;
    }

    final int a(int param0) throws IOException {
        if (((vb) this).field_h) {
            return 0;
        }
        if (param0 != 14528) {
            vb.a(false);
            return ((vb) this).field_l.read();
        }
        return ((vb) this).field_l.read();
    }

    final void e(int param0) throws IOException {
        if (((vb) this).field_h) {
            return;
        }
        if (param0 != 0) {
            ((vb) this).c(-107);
            if (!(!((vb) this).field_e)) {
                ((vb) this).field_e = false;
                throw new IOException();
            }
            return;
        }
        if (!(!((vb) this).field_e)) {
            ((vb) this).field_e = false;
            throw new IOException();
        }
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
                        var6 = Pool.field_O;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((vb) this).field_a != ((vb) this).field_i) {
                                statePc = 6;
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
                            if (((vb) this).field_h) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 32;
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
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ((vb) this).field_a;
                            if (((vb) this).field_a > ((vb) this).field_i) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((vb) this).field_i - ((vb) this).field_a;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((vb) this).field_k + -((vb) this).field_a;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (0 < var1_int) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((vb) this).field_g.write(((vb) this).field_j, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 32);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((vb) this).field_e = true;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((vb) this).field_a = (var1_int + ((vb) this).field_a) % ((vb) this).field_k;
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
                            if (((vb) this).field_a != ((vb) this).field_i) {
                                statePc = 1;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((vb) this).field_g.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 32);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((vb) this).field_e = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (((vb) this).field_l != null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((vb) this).field_l.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (((vb) this).field_g != null) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((vb) this).field_g.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (null != ((vb) this).field_n) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            ((vb) this).field_n.close();
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 29 : 32);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 32;
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
                            ((vb) this).field_j = null;
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
                        tc.a((Throwable) (Object) var1_ref, (String) null, -8555);
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

    final static boolean a(boolean param0, String param1, byte param2, nf param3, int param4, String param5, String param6) {
        if (wd.field_Lb != aa.field_c) {
            return false;
        }
        fq var9 = new fq(wd.field_Ub, param3);
        int var8 = 91 / ((48 - param2) / 53);
        wd.field_Ub.b((ei) (Object) var9, 30000);
        if (sq.k(0)) {
            var9.p((byte) -52);
        } else {
            qi.field_c = param0;
            j.field_b = param4;
            re.field_d = param5;
            vq.field_Xb = param6;
            wd.field_Lb = ra.field_e;
            sf.field_B = null;
            eo.field_Rb = param1;
            return true;
        }
        return true;
    }

    final int d(int param0) throws IOException {
        if (!((vb) this).field_h) {
          if (param0 <= 68) {
            ((vb) this).field_i = -51;
            return ((vb) this).field_l.available();
          } else {
            return ((vb) this).field_l.available();
          }
        } else {
          return 0;
        }
    }

    final static ai b(int param0) {
        int var1 = 52 / ((param0 - 41) / 41);
        return qf.field_d;
    }

    final void c(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (!((vb) this).field_h) {
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
                        if (param0 < -82) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((vb) this).field_e = false;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((vb) this).field_h = true;
                        this.notifyAll();
                        // monitorexit var2
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var2
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                case 9: {
                    if (null != ((vb) this).field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((vb) this).field_d = null;
                    return;
                }
                case 11: {
                    if (0 != ((vb) this).field_d.field_f) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    cf.a(-126, 1L);
                    statePc = 11;
                    continue stateLoop;
                }
                case 13: {
                    if (-2 == (((vb) this).field_d.field_f ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((vb) this).field_d = null;
                    return;
                }
                case 15: {
                    try {
                        ((Thread) ((vb) this).field_d.field_e).join();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((vb) this).field_d = null;
                    return;
                }
                case 17: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    ((vb) this).field_d = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    protected final void finalize() {
        ((vb) this).c(-119);
    }

    final static or a(int param0, pq param1) {
        Object var3 = null;
        if (param0 != -6584) {
          var3 = null;
          boolean discarded$2 = vb.a(false, (String) null, (byte) 126, (nf) null, -39, (String) null, (String) null);
          param1.field_q = new or(0, (or) null);
          return new or(0, (or) null);
        } else {
          param1.field_q = new or(0, (or) null);
          return new or(0, (or) null);
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vb) this).field_h) {
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
                    var5 = 17 / ((param1 - -12) / 58);
                    if (((vb) this).field_e) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((vb) this).field_e = false;
                    throw new IOException();
                }
                case 6: {
                    if (((vb) this).field_j != null) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((vb) this).field_j = new byte[((vb) this).field_k];
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    var6 = this;
                    // monitorenter this
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        var7 = 0;
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
                        if (param2 <= var7) {
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
                        ((vb) this).field_j[((vb) this).field_i] = param0[param3 + var7];
                        ((vb) this).field_i = (((vb) this).field_i - -1) % ((vb) this).field_k;
                        if ((((vb) this).field_k + (((vb) this).field_a + -100)) % ((vb) this).field_k == ((vb) this).field_i) {
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
                        var7++;
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
                        if (null != ((vb) this).field_d) {
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
                        ((vb) this).field_d = ((vb) this).field_o.a(33, 3, (Runnable) this);
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
                        // monitorexit var6
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
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 20: {
                    if (var8 instanceof RuntimeException) throw (RuntimeException) var8;
                    if (var8 instanceof Error) throw (Error) var8;
                    throw (IOException) (Object) var8;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private vb(java.net.Socket param0, sj param1, int param2) throws IOException {
        ((vb) this).field_e = false;
        ((vb) this).field_i = 0;
        ((vb) this).field_a = 0;
        ((vb) this).field_h = false;
        ((vb) this).field_n = param0;
        ((vb) this).field_o = param1;
        ((vb) this).field_n.setSoTimeout(30000);
        ((vb) this).field_n.setTcpNoDelay(true);
        ((vb) this).field_l = ((vb) this).field_n.getInputStream();
        ((vb) this).field_g = ((vb) this).field_n.getOutputStream();
        ((vb) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "to over <%0> great games";
    }
}
