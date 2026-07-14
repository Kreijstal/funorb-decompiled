/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ba implements Runnable {
    private int field_k;
    static int[] field_h;
    private cb field_m;
    private int field_e;
    private int field_b;
    private byte[] field_d;
    static int field_c;
    private InputStream field_g;
    private boolean field_f;
    private OutputStream field_a;
    private java.net.Socket field_j;
    private d field_l;
    private boolean field_i;

    protected final void finalize() {
        ((ba) this).b(-124);
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
                    if (param0 < -117) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((ba) this).run();
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (((ba) this).field_f) {
                        statePc = 4;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                case 5: {
                    var2 = this;
                    // monitorenter this
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    try {
                        ((ba) this).field_f = true;
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
                    if (((ba) this).field_m != null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((ba) this).field_m = null;
                    return;
                }
                case 12: {
                    if (0 != ((ba) this).field_m.field_a) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    bc.a(0, 1L);
                    statePc = 12;
                    continue stateLoop;
                }
                case 14: {
                    if (1 != ((ba) this).field_m.field_a) {
                        statePc = 18;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    try {
                        ((Thread) ((ba) this).field_m.field_b).join();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 16: {
                    ((ba) this).field_m = null;
                    return;
                }
                case 17: {
                    var2_ref = (InterruptedException) (Object) caughtException;
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    ((ba) this).field_m = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void d(int param0) throws IOException {
        if (((ba) this).field_f) {
          return;
        } else {
          if (param0 < -79) {
            if (((ba) this).field_i) {
              ((ba) this).field_i = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int a(byte param0) throws IOException {
        if (param0 > 71) {
          if (((ba) this).field_f) {
            return 0;
          } else {
            return ((ba) this).field_g.available();
          }
        } else {
          ((ba) this).field_g = null;
          if (((ba) this).field_f) {
            return 0;
          } else {
            return ((ba) this).field_g.available();
          }
        }
    }

    final static cj a(int param0) {
        if (param0 != 5000) {
            ba.e(-113);
            return (cj) (Object) new cm();
        }
        return (cj) (Object) new cm();
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        int var5 = 0;
        if (param1 == -97) {
          if (!((ba) this).field_f) {
            L0: while (true) {
              if ((param3 ^ -1) < -1) {
                var5 = ((ba) this).field_g.read(param0, param2, param3);
                if (0 >= var5) {
                  throw new EOFException();
                } else {
                  param3 = param3 - var5;
                  param2 = param2 + var5;
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

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ba) this).field_f) {
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
                    if (((ba) this).field_i) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((ba) this).field_i = false;
                    throw new IOException();
                }
                case 6: {
                    if (null != ((ba) this).field_d) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    ((ba) this).field_d = new byte[((ba) this).field_b];
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (param2 <= var6) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((ba) this).field_d[((ba) this).field_e] = param3[param1 + var6];
                        ((ba) this).field_e = (((ba) this).field_e - -1) % ((ba) this).field_b;
                        if (((ba) this).field_e == (((ba) this).field_b + (((ba) this).field_k - 100)) % ((ba) this).field_b) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (param0 == 100) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ba) this).field_a = null;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (null != ((ba) this).field_m) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((ba) this).field_m = ((ba) this).field_l.a((Runnable) this, 0, 3);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 22: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 23: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(int param0) throws IOException {
        if (!(!((ba) this).field_f)) {
            return 0;
        }
        if (param0 != -17422) {
            return -104;
        }
        return ((ba) this).field_g.read();
    }

    public static void e(int param0) {
        if (param0 != 21888) {
            return;
        }
        field_h = null;
    }

    ba(java.net.Socket param0, d param1) throws IOException {
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
            Object var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = this;
                            if (((ba) this).field_k == ((ba) this).field_e) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!((ba) this).field_f) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            this.wait();
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = ((ba) this).field_k;
                            if (((ba) this).field_e < ((ba) this).field_k) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = ((ba) this).field_e - ((ba) this).field_k;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((ba) this).field_b - ((ba) this).field_k;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var1_int <= 0) {
                                statePc = 0;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((ba) this).field_a.write(((ba) this).field_d, var2, var1_int);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof IOException ? 11 : 30);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ba) this).field_i = true;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((ba) this).field_k = (var1_int + ((ba) this).field_k) % ((ba) this).field_b;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (((ba) this).field_e == ((ba) this).field_k) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ba) this).field_a.flush();
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ba) this).field_i = true;
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (((ba) this).field_g == null) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ((ba) this).field_g.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((ba) this).field_a != null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ba) this).field_a.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((ba) this).field_j != null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ba) this).field_j.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((ba) this).field_d = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var1_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        gi.a((Throwable) (Object) var1_ref, (String) null, (byte) 125);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final static void a(byte param0, java.applet.Applet param1) {
        Object var3 = null;
        if (param0 != 116) {
          var3 = null;
          ba.a((byte) 45, (java.applet.Applet) null);
          va.a("", param1, -1);
          h.a(param1, false);
          return;
        } else {
          va.a("", param1, -1);
          h.a(param1, false);
          return;
        }
    }

    private ba(java.net.Socket param0, d param1, int param2) throws IOException {
        ((ba) this).field_f = false;
        ((ba) this).field_e = 0;
        ((ba) this).field_k = 0;
        ((ba) this).field_i = false;
        ((ba) this).field_l = param1;
        ((ba) this).field_j = param0;
        ((ba) this).field_j.setSoTimeout(30000);
        ((ba) this).field_j.setTcpNoDelay(true);
        ((ba) this).field_g = ((ba) this).field_j.getInputStream();
        ((ba) this).field_a = ((ba) this).field_j.getOutputStream();
        ((ba) this).field_b = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[8192];
        field_c = 0;
    }
}
