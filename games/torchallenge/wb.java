/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wb implements Runnable {
    private InputStream field_b;
    static qe field_p;
    static String[] field_n;
    private uj field_c;
    static String field_m;
    private boolean field_k;
    private boolean field_e;
    private java.net.Socket field_i;
    private int field_a;
    static int field_d;
    private OutputStream field_f;
    private int field_l;
    private byte[] field_o;
    private mi field_h;
    private int field_g;
    static String field_q;
    static int field_j;

    public static void a(boolean param0) {
        if (!param0) {
          field_d = -75;
          field_q = null;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_q = null;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = TorChallenge.field_F ? 1 : 0;
        if (param0 == -1) {
          if (!((wb) this).field_k) {
            L0: while (true) {
              if ((param2 ^ -1) < -1) {
                var5 = ((wb) this).field_b.read(param3, param1, param2);
                if ((var5 ^ -1) >= -1) {
                  throw new EOFException();
                } else {
                  param1 = param1 + var5;
                  param2 = param2 - var5;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, byte param1) {
        ee.a(param0, 1, false);
        if (param1 <= -66) {
            return;
        }
        field_q = null;
    }

    protected final void finalize() {
        ((wb) this).a((byte) -90);
    }

    final static void b(byte param0) {
        kd var1_ref = null;
        kd var1 = (kd) (Object) mc.field_k.d((byte) -119);
        if (!(var1 != null)) {
            var1_ref = new kd();
        }
        var1_ref.a(qg.field_g, qg.field_a, qg.field_i, qg.field_f, (byte) -8, qg.field_l, qg.field_c, qg.field_k);
        rf.field_db.a((da) (Object) var1_ref, -84);
        int var2 = 126 / ((param0 - -23) / 54);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = TorChallenge.field_F ? 1 : 0;
                    if (((wb) this).field_k) {
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
                    if (((wb) this).field_e) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((wb) this).field_e = false;
                    throw new IOException();
                }
                case 6: {
                    if (((wb) this).field_o == null) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((wb) this).field_o = new byte[((wb) this).field_g];
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
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param0 <= var6) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((wb) this).field_o[((wb) this).field_l] = param3[param1 + var6];
                        ((wb) this).field_l = (((wb) this).field_l - -1) % ((wb) this).field_g;
                        if (((wb) this).field_l == (-100 + ((wb) this).field_a + ((wb) this).field_g) % ((wb) this).field_g) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != ((wb) this).field_h) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((wb) this).field_h = ((wb) this).field_c.a((Runnable) this, true, 3);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.notifyAll();
                        if (param2 >= 57) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        wb.a(true);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        // monitorexit var5
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 23: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wb(java.net.Socket param0, uj param1) throws IOException {
        this(param0, param1, 5000);
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
                        var6 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((wb) this).field_a == ((wb) this).field_l) {
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
                            if (!((wb) this).field_k) {
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
                            if (((wb) this).field_l < ((wb) this).field_a) {
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
                            var1_int = ((wb) this).field_l + -((wb) this).field_a;
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
                            var1_int = ((wb) this).field_g + -((wb) this).field_a;
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
                            var2 = ((wb) this).field_a;
                            if ((var1_int ^ -1) >= -1) {
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
                            ((wb) this).field_f.write(((wb) this).field_o, var2, var1_int);
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
                            ((wb) this).field_e = true;
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
                            ((wb) this).field_a = (var1_int + ((wb) this).field_a) % ((wb) this).field_g;
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
                            if (((wb) this).field_l == ((wb) this).field_a) {
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
                            ((wb) this).field_f.flush();
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
                            ((wb) this).field_e = true;
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
                            if (((wb) this).field_b != null) {
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
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            ((wb) this).field_b.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (null == ((wb) this).field_f) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((wb) this).field_f.close();
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
                            if (((wb) this).field_i != null) {
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
                            ((wb) this).field_i.close();
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
                            ((wb) this).field_o = null;
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
                        td.a((String) null, (Throwable) (Object) var1_ref, (byte) -84);
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

    final int c(int param0) throws IOException {
        if (param0 == 0) {
          if (((wb) this).field_k) {
            return 0;
          } else {
            return ((wb) this).field_b.read();
          }
        } else {
          wb.b((byte) 122);
          if (((wb) this).field_k) {
            return 0;
          } else {
            return ((wb) this).field_b.read();
          }
        }
    }

    final void b(int param0) throws IOException {
        if (!(!((wb) this).field_k)) {
            return;
        }
        int var2 = 113 / ((67 - param0) / 58);
        if (!(!((wb) this).field_e)) {
            ((wb) this).field_e = false;
            throw new IOException();
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        Object var3 = null;
        InterruptedException var3_ref = null;
        Object var3_ref2 = null;
        Throwable var4 = null;
        int var5 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = TorChallenge.field_F ? 1 : 0;
                    if (!((wb) this).field_k) {
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
                    var2 = -85 / ((23 - param0) / 56);
                    var3_ref2 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((wb) this).field_k = true;
                        this.notifyAll();
                        // monitorexit var3_ref2
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
                        // monitorexit var3_ref2
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
                    if (((wb) this).field_h != null) {
                        statePc = 9;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (-1 != ((wb) this).field_h.field_d) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    c.a(115, 1L);
                    statePc = 9;
                    continue stateLoop;
                }
                case 11: {
                    if (-2 != ((wb) this).field_h.field_d) {
                        statePc = 16;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    try {
                        ((Thread) ((wb) this).field_h.field_g).join();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    var3_ref = (InterruptedException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 15: {
                    ((wb) this).field_h = null;
                    return;
                }
                case 16: {
                    ((wb) this).field_h = null;
                    return;
                }
                case 17: {
                    ((wb) this).field_h = null;
                    return;
                }
                case 18: {
                    ((wb) this).field_h = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private wb(java.net.Socket param0, uj param1, int param2) throws IOException {
        ((wb) this).field_l = 0;
        ((wb) this).field_a = 0;
        ((wb) this).field_e = false;
        ((wb) this).field_k = false;
        ((wb) this).field_c = param1;
        ((wb) this).field_i = param0;
        ((wb) this).field_i.setSoTimeout(30000);
        ((wb) this).field_i.setTcpNoDelay(true);
        ((wb) this).field_b = ((wb) this).field_i.getInputStream();
        ((wb) this).field_f = ((wb) this).field_i.getOutputStream();
        ((wb) this).field_g = param2;
    }

    final int a(int param0) throws IOException {
        if (((wb) this).field_k) {
            return 0;
        }
        if (param0 != 0) {
            wb.a(false, (byte) 115);
            return ((wb) this).field_b.available();
        }
        return ((wb) this).field_b.available();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new String[]{"Coin Collector", "Master of War", "Jade Collector", "Jade Expert", "Jade Master", "Bonus Walker", "Bonus Runner", "Bonus Sprinter", "Trainee Monk", "Enlightened Monk", "Master Monk", "Wise, Aged Master Monk", "Seal Collector", "Seal Expert", "Seal Master", "Agility Master", "Skilled Skuller"};
        field_m = "Loading...";
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
