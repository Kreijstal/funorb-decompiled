/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class tf implements Runnable {
    private int field_e;
    private he field_h;
    private java.net.Socket field_a;
    private InputStream field_b;
    private boolean field_l;
    private boolean field_g;
    private int field_f;
    private byte[] field_m;
    private OutputStream field_c;
    static o field_d;
    private mf field_i;
    static int field_k;
    private int field_j;

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
                    var8 = Terraphoenix.field_V;
                    if (!((tf) this).field_g) {
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
                    if (!((tf) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((tf) this).field_l = false;
                    throw new IOException();
                }
                case 4: {
                    if (null == ((tf) this).field_m) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((tf) this).field_m = new byte[((tf) this).field_f];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (param2 == -97) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((tf) this).a((byte) -76);
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
                        statePc = 21;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((tf) this).field_m[((tf) this).field_e] = param3[param1 + var6];
                        ((tf) this).field_e = (1 + ((tf) this).field_e) % ((tf) this).field_f;
                        if (((tf) this).field_e == (((tf) this).field_j + (((tf) this).field_f - 100)) % ((tf) this).field_f) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null == ((tf) this).field_i) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ((tf) this).field_i = ((tf) this).field_h.a((Runnable) this, (byte) -21, 3);
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

    final int a(int param0) throws IOException {
        if (((tf) this).field_g) {
            return 0;
        }
        if (param0 != 0) {
            ((tf) this).field_l = false;
            return ((tf) this).field_b.available();
        }
        return ((tf) this).field_b.available();
    }

    tf(java.net.Socket param0, he param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte param0) {
        Object var2_ref_Object = null;
        int var2 = 0;
        InterruptedException var3 = null;
        Throwable var3_ref = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Terraphoenix.field_V;
                    if (((tf) this).field_g) {
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
                    var2_ref_Object = this;
                    // monitorenter this
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        ((tf) this).field_g = true;
                        this.notifyAll();
                        // monitorexit var2_ref_Object
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3_ref = caughtException;
                        // monitorexit var2_ref_Object
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var3_ref;
                }
                case 8: {
                    var2 = -36 % ((-82 - param0) / 40);
                    if (((tf) this).field_i != null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((tf) this).field_i = null;
                    return;
                }
                case 10: {
                    if (0 != ((tf) this).field_i.field_d) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    gi.a((byte) -26, 1L);
                    statePc = 10;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == (((tf) this).field_i.field_d ^ -1)) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    ((tf) this).field_i = null;
                    return;
                }
                case 14: {
                    try {
                        ((Thread) ((tf) this).field_i.field_e).join();
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    ((tf) this).field_i = null;
                    return;
                }
                case 16: {
                    var3 = (InterruptedException) (Object) caughtException;
                    ((tf) this).field_i = null;
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void c(int param0) throws IOException {
        if (param0 == 10509) {
          if (((tf) this).field_g) {
            return;
          } else {
            if (((tf) this).field_l) {
              ((tf) this).field_l = false;
              throw new IOException();
            } else {
              return;
            }
          }
        } else {
          ((tf) this).finalize();
          if (((tf) this).field_g) {
            return;
          } else {
            if (((tf) this).field_l) {
              ((tf) this).field_l = false;
              throw new IOException();
            } else {
              return;
            }
          }
        }
    }

    protected final void finalize() {
        ((tf) this).a((byte) 37);
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
                        var6 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((tf) this).field_e != ((tf) this).field_j) {
                                statePc = 6;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (((tf) this).field_g) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
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
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (((tf) this).field_j > ((tf) this).field_e) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((tf) this).field_e - ((tf) this).field_j;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((tf) this).field_f - ((tf) this).field_j;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = ((tf) this).field_j;
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((tf) this).field_c.write(((tf) this).field_m, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 30);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((tf) this).field_l = true;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            ((tf) this).field_j = (((tf) this).field_j + var1_int) % ((tf) this).field_f;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((tf) this).field_j != ((tf) this).field_e) {
                                statePc = 1;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((tf) this).field_c.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((tf) this).field_l = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (null == ((tf) this).field_b) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((tf) this).field_b.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null != ((tf) this).field_c) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((tf) this).field_c.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (null == ((tf) this).field_a) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((tf) this).field_a.close();
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
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
                            ((tf) this).field_m = null;
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
                        var7 = null;
                        bd.a((Throwable) (Object) var1_ref, (String) null, -99);
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

    public static void b(byte param0) {
        field_d = null;
        if (param0 > 94) {
            return;
        }
        field_k = 18;
    }

    final static boolean a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var6 = 0;
        var6 = 72 / ((-25 - param1) / 34);
        if (param3 <= ef.field_j) {
          if (param3 - -param0 > ef.field_j) {
            if (jb.field_b >= param2) {
              if (param2 - -param5 > jb.field_b) {
                if (!param4) {
                  return true;
                } else {
                  l.d(param3, param2, param0, param5, 16777215, 128);
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private tf(java.net.Socket param0, he param1, int param2) throws IOException {
        ((tf) this).field_e = 0;
        ((tf) this).field_g = false;
        ((tf) this).field_l = false;
        ((tf) this).field_j = 0;
        ((tf) this).field_h = param1;
        ((tf) this).field_a = param0;
        ((tf) this).field_a.setSoTimeout(30000);
        ((tf) this).field_a.setTcpNoDelay(true);
        ((tf) this).field_b = ((tf) this).field_a.getInputStream();
        ((tf) this).field_c = ((tf) this).field_a.getOutputStream();
        ((tf) this).field_f = param2;
    }

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var5 = 0;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        if (!((tf) this).field_g) {
          L0: while (true) {
            if (param1 <= 0) {
              if (param3 >= 96) {
                return;
              } else {
                field_k = -40;
                return;
              }
            } else {
              var5 = ((tf) this).field_b.read(param0, param2, param1);
              if (var5 > 0) {
                param2 = param2 + var5;
                param1 = param1 - var5;
                continue L0;
              } else {
                throw new EOFException();
              }
            }
          }
        } else {
          return;
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != 0) {
            ((tf) this).field_m = null;
            if (!(!((tf) this).field_g)) {
                return 0;
            }
            return ((tf) this).field_b.read();
        }
        if (!(!((tf) this).field_g)) {
            return 0;
        }
        return ((tf) this).field_b.read();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = -1;
        field_d = new o();
    }
}
